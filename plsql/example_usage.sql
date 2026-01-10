/*******************************************************************************
 * Example Usage for PKG_CONTRATTI_GP_GEN
 * 
 * This script demonstrates how to use the package to process GP contracts
 ******************************************************************************/

-- Enable output for demonstration
SET SERVEROUTPUT ON SIZE UNLIMITED;

/*******************************************************************************
 * Example 1: Process a single contract
 ******************************************************************************/
DECLARE
  v_result VARCHAR2(50);
  v_error_message VARCHAR2(500);
  v_contratto_id NUMBER := 12345; -- Replace with actual ID
BEGIN
  -- Process one contract
  PKG_CONTRATTI_GP_GEN.do_one_step(
    p_investitori_contratto_id => v_contratto_id,
    p_result => v_result,
    p_error_message => v_error_message
  );
  
  -- Display result
  DBMS_OUTPUT.PUT_LINE('Processing contract ID: ' || v_contratto_id);
  DBMS_OUTPUT.PUT_LINE('Result: ' || v_result);
  
  IF v_error_message IS NOT NULL THEN
    DBMS_OUTPUT.PUT_LINE('Message: ' || v_error_message);
  END IF;
  
  IF v_result = 'OK' THEN
    DBMS_OUTPUT.PUT_LINE('Contract processed successfully');
  ELSIF v_result = 'WARNING' THEN
    DBMS_OUTPUT.PUT_LINE('Contract processed with warnings');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Contract processing failed');
  END IF;
END;
/

/*******************************************************************************
 * Example 2: Process multiple contracts in batch
 ******************************************************************************/
DECLARE
  v_result VARCHAR2(50);
  v_error_message VARCHAR2(500);
  v_success_count NUMBER := 0;
  v_warning_count NUMBER := 0;
  v_error_count NUMBER := 0;
  v_total_count NUMBER := 0;
  
  -- Cursor for unprocessed contracts
  CURSOR c_contracts IS
    SELECT INVESTITORI_CONTRATTO_ID
    FROM FLX_INVESTITORI_CONTRATTO
    WHERE STATO_ELABORAZIONE IS NULL
       OR STATO_ELABORAZIONE = 'KO'
    ORDER BY INVESTITORI_CONTRATTO_ID;
    
BEGIN
  DBMS_OUTPUT.PUT_LINE('Starting batch processing...');
  DBMS_OUTPUT.PUT_LINE('========================================');
  
  -- Process each contract
  FOR rec IN c_contracts LOOP
    v_total_count := v_total_count + 1;
    
    BEGIN
      PKG_CONTRATTI_GP_GEN.do_one_step(
        p_investitori_contratto_id => rec.INVESTITORI_CONTRATTO_ID,
        p_result => v_result,
        p_error_message => v_error_message
      );
      
      -- Count results
      CASE v_result
        WHEN 'OK' THEN 
          v_success_count := v_success_count + 1;
        WHEN 'WARNING' THEN 
          v_warning_count := v_warning_count + 1;
          DBMS_OUTPUT.PUT_LINE('WARNING - ID ' || rec.INVESTITORI_CONTRATTO_ID || ': ' || v_error_message);
        ELSE 
          v_error_count := v_error_count + 1;
          DBMS_OUTPUT.PUT_LINE('ERROR - ID ' || rec.INVESTITORI_CONTRATTO_ID || ': ' || v_error_message);
      END CASE;
      
    EXCEPTION
      WHEN OTHERS THEN
        v_error_count := v_error_count + 1;
        DBMS_OUTPUT.PUT_LINE('ERROR - ID ' || rec.INVESTITORI_CONTRATTO_ID || ': ' || SQLERRM);
    END;
    
    -- Commit every 100 records
    IF MOD(v_total_count, 100) = 0 THEN
      COMMIT;
      DBMS_OUTPUT.PUT_LINE('Processed ' || v_total_count || ' records...');
    END IF;
  END LOOP;
  
  -- Final commit
  COMMIT;
  
  -- Display summary
  DBMS_OUTPUT.PUT_LINE('========================================');
  DBMS_OUTPUT.PUT_LINE('Batch processing completed');
  DBMS_OUTPUT.PUT_LINE('Total processed: ' || v_total_count);
  DBMS_OUTPUT.PUT_LINE('Successful: ' || v_success_count);
  DBMS_OUTPUT.PUT_LINE('Warnings: ' || v_warning_count);
  DBMS_OUTPUT.PUT_LINE('Errors: ' || v_error_count);
  
END;
/

/*******************************************************************************
 * Example 3: Test nation code decoding
 ******************************************************************************/
DECLARE
  v_uic_code VARCHAR2(10);
BEGIN
  -- Test with Italian code
  v_uic_code := PKG_CONTRATTI_GP_GEN.decode_nazione('IT');
  DBMS_OUTPUT.PUT_LINE('IT -> ' || NVL(v_uic_code, 'NULL'));
  
  -- Test with French code
  v_uic_code := PKG_CONTRATTI_GP_GEN.decode_nazione('FR');
  DBMS_OUTPUT.PUT_LINE('FR -> ' || NVL(v_uic_code, 'NULL'));
  
  -- Test with unknown code
  v_uic_code := PKG_CONTRATTI_GP_GEN.decode_nazione('XX');
  DBMS_OUTPUT.PUT_LINE('XX -> ' || NVL(v_uic_code, '799 (default)'));
END;
/

/*******************************************************************************
 * Example 4: Query processing status
 ******************************************************************************/
SELECT 
  STATO_ELABORAZIONE,
  COUNT(*) AS NUM_RECORDS,
  MIN(DATA_ELAB) AS FIRST_PROCESSED,
  MAX(DATA_ELAB) AS LAST_PROCESSED
FROM FLX_INVESTITORI_CONTRATTO
WHERE DATA_ELAB IS NOT NULL
GROUP BY STATO_ELABORAZIONE
ORDER BY STATO_ELABORAZIONE;

/*******************************************************************************
 * Example 5: Query recent errors
 ******************************************************************************/
SELECT 
  INVESTITORI_CONTRATTO_ID,
  NUMERO_RAPPORTO,
  DATA_ELAB,
  DESCRIZIONE_ERRORE
FROM FLX_INVESTITORI_CONTRATTO
WHERE STATO_ELABORAZIONE = 'KO'
  AND DATA_ELAB >= TRUNC(SYSDATE)
ORDER BY DATA_ELAB DESC
FETCH FIRST 20 ROWS ONLY;

/*******************************************************************************
 * Example 6: Reprocess failed contracts
 ******************************************************************************/
DECLARE
  v_result VARCHAR2(50);
  v_error_message VARCHAR2(500);
  v_retry_count NUMBER := 0;
  
  -- Cursor for failed contracts
  CURSOR c_failed IS
    SELECT INVESTITORI_CONTRATTO_ID
    FROM FLX_INVESTITORI_CONTRATTO
    WHERE STATO_ELABORAZIONE = 'KO'
      AND DATA_ELAB >= TRUNC(SYSDATE) - 7  -- Last 7 days
    ORDER BY INVESTITORI_CONTRATTO_ID;
    
BEGIN
  DBMS_OUTPUT.PUT_LINE('Retrying failed contracts...');
  
  FOR rec IN c_failed LOOP
    BEGIN
      PKG_CONTRATTI_GP_GEN.do_one_step(
        p_investitori_contratto_id => rec.INVESTITORI_CONTRATTO_ID,
        p_result => v_result,
        p_error_message => v_error_message
      );
      
      IF v_result = 'OK' THEN
        v_retry_count := v_retry_count + 1;
        DBMS_OUTPUT.PUT_LINE('Successfully retried ID: ' || rec.INVESTITORI_CONTRATTO_ID);
      END IF;
      
    EXCEPTION
      WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Retry failed for ID: ' || rec.INVESTITORI_CONTRATTO_ID);
    END;
  END LOOP;
  
  COMMIT;
  
  DBMS_OUTPUT.PUT_LINE('Retry completed. Successful retries: ' || v_retry_count);
END;
/
