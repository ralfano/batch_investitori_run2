CREATE OR REPLACE PACKAGE BODY PKG_CONTRATTI_GP_GEN AS
/*******************************************************************************
 * Package Body: PKG_CONTRATTI_GP_GEN
 * Description: Implementation of ContrattiGpGenBL Java class business logic
 ******************************************************************************/

  -- Private variables
  v_gp t_fin_gp;
  v_sottoscrizione t_fin_sottoscrizione;
  v_indirizzo t_fin_indirizzo;
  v_flag_presso BOOLEAN := FALSE;
  v_control_indir BOOLEAN := FALSE;

  /***************************************************************************
   * Function: decode_nazione
   * Description: Converts ISO nation code to UIC code
   ***************************************************************************/
  FUNCTION decode_nazione(p_codice_iso IN VARCHAR2) RETURN VARCHAR2 IS
    v_codice_uic VARCHAR2(10);
  BEGIN
    -- Query CODES_TABLE_NAZIONE_GPRAM for conversion
    BEGIN
      SELECT CODICE_NAZIONE_UIC
      INTO v_codice_uic
      FROM CODES_TABLE_NAZIONE_GPRAM
      WHERE CODICE_NAZIONE_ISO = p_codice_iso;
      
      RETURN v_codice_uic;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        RETURN '799'; -- Default unknown nation code
      WHEN OTHERS THEN
        RETURN '799';
    END;
  END decode_nazione;

  /***************************************************************************
   * Procedure: set_gp
   * Description: Initialize GP record from cursor row
   ***************************************************************************/
  PROCEDURE set_gp(p_cursor_row IN FLX_INVESTITORI_CONTRATTO%ROWTYPE) IS
    v_data_est_month NUMBER;
    v_data_est_year NUMBER;
    v_data_est_day NUMBER;
    v_flag_data_max BOOLEAN := FALSE;
  BEGIN
    -- Initialize GP record
    v_gp.num_contratto := p_cursor_row.NUMERO_RAPPORTO;
    v_gp.data_apertura := p_cursor_row.DATA_APERTURA_GPF;
    
    -- Handle contratto ombrello for GPINVEST
    IF p_cursor_row.TIPO_FABBRICA = c_GP_INVESTITORI 
       AND p_cursor_row.MULTIMAND_PRODOTTO_ID IS NOT NULL
       AND p_cursor_row.CONTRATTO_OMBRELLO IS NOT NULL
       AND p_cursor_row.CONTRATTO_OMBRELLO != c_INVALID_CTR_OMBRELLO THEN
      v_gp.contratto_ombrello := LTRIM(p_cursor_row.CONTRATTO_OMBRELLO, '0');
      v_gp.multimand_prodotto_id := p_cursor_row.MULTIMAND_PRODOTTO_ID;
    END IF;
    
    -- Handle data chiusura and stato contratto
    IF p_cursor_row.DATA_ESTINZIONE IS NOT NULL THEN
      v_data_est_month := EXTRACT(MONTH FROM p_cursor_row.DATA_ESTINZIONE);
      v_data_est_year := EXTRACT(YEAR FROM p_cursor_row.DATA_ESTINZIONE);
      v_data_est_day := EXTRACT(DAY FROM p_cursor_row.DATA_ESTINZIONE);
      
      IF v_data_est_month = 12 AND v_data_est_year = 9999 AND v_data_est_day = 31 THEN
        v_flag_data_max := TRUE;
      END IF;
    END IF;
    
    IF p_cursor_row.DATA_ESTINZIONE IS NULL OR v_flag_data_max THEN
      v_gp.data_chiusura := c_DATA_MAX;
      v_gp.stato_contratto := 'A';
    ELSE
      v_gp.data_chiusura := p_cursor_row.DATA_ESTINZIONE;
      v_gp.stato_contratto := 'C';
    END IF;
    
    -- Set financial data
    v_gp.prenota_dare := p_cursor_row.PRENOTA_DARE;
    v_gp.prenota_avere := p_cursor_row.PRENOTA_AVERE;
    v_gp.perf_bcmk := 0;
    v_gp.perf_netta_tri := p_cursor_row.PERF_INIZIO_TRIMESTRE;
    v_gp.perf_netta := p_cursor_row.PERF_ANNUALIZZATA_DA_INIZIO_GE;
    v_gp.perf_netta_ann := p_cursor_row.PERF_INIZIO_ANNO;
    v_gp.ctv_tot := p_cursor_row.CONTROVALORE_NAV;
    v_gp.perf_lorda_ann := p_cursor_row.PERF_LORDA_INIZIO_ANNO;
    v_gp.perf_lorda_tri := p_cursor_row.PERF_LORDA_INIZIO_TRIMESTRE;
    v_gp.perf_bcmk_tri := p_cursor_row.PERF_BENCH_INIZIO_TRIM;
    v_gp.perf_bcmk_ann := p_cursor_row.PERF_BENCH_INIZIO_ANNO;
    v_gp.data_perf := p_cursor_row.DATA_ELAB_PERF;
    v_gp.nav_perf := p_cursor_row.NAV_CALCOLO_PERF;
    v_gp.data_val := p_cursor_row.DATA_VAL;
    v_gp.liquidita := p_cursor_row.SALDO_CC;
    v_gp.saldo_sotto_dossier := p_cursor_row.SALDO_DOSSIER;
    v_gp.perf_glob_inizio_mand_lor := p_cursor_row.PERF_GLOB_INIZIO_MAND_LOR;
    v_gp.perf_glob_inizio_mand_net := p_cursor_row.PERF_GLOB_INIZIO_MAND_NET;
    v_gp.perf_bench_inizio_gestione := p_cursor_row.PERF_BENCH_INIZIO_GESTIONE;
    v_gp.totale_investito := p_cursor_row.TOTALE_INVESTITO;
    v_gp.totale_versato := p_cursor_row.TOTALE_VERSATO;
    v_gp.totale_prelevato := p_cursor_row.TOTALE_PRELEVATO;
    
    -- Handle blocco operativo
    v_gp.blocco_operativo := CASE WHEN p_cursor_row.BLOCCO_OPERATIVO = '00' THEN 'S' ELSE 'N' END;
    
  END set_gp;

  /***************************************************************************
   * Procedure: set_sottoscrizione
   * Description: Initialize sottoscrizione record
   ***************************************************************************/
  PROCEDURE set_sottoscrizione(p_cursor_row IN FLX_INVESTITORI_CONTRATTO%ROWTYPE) IS
  BEGIN
    v_sottoscrizione.stato := 'E';
    v_sottoscrizione.data_sottoscr := p_cursor_row.DATA_APERTURA_GPF;
    v_sottoscrizione.tipo_operazione := 'SOT';
  END set_sottoscrizione;

  /***************************************************************************
   * Procedure: set_indirizzo
   * Description: Initialize indirizzo record
   ***************************************************************************/
  PROCEDURE set_indirizzo(p_cursor_row IN FLX_INVESTITORI_CONTRATTO%ROWTYPE) IS
    v_ret_value VARCHAR2(10);
  BEGIN
    v_control_indir := FALSE;
    v_flag_presso := FALSE;
    
    -- Initialize indirizzo
    v_indirizzo.prov := p_cursor_row.PROVINCIA_POSTALE;
    v_indirizzo.dati_supl := ' ';
    
    -- Decode nation code
    IF p_cursor_row.NAZIONE IS NOT NULL THEN
      v_ret_value := decode_nazione(p_cursor_row.NAZIONE);
      v_indirizzo.nazione := v_ret_value;
    ELSIF p_cursor_row.PROVINCIA_POSTALE IS NULL OR p_cursor_row.PROVINCIA_POSTALE = 'EE' THEN
      v_indirizzo.nazione := '799';
    ELSE
      v_indirizzo.nazione := c_ITALIA;
    END IF;
    
    -- Handle indirizzo field
    IF p_cursor_row.INDIRIZZO_POSTALE IS NOT NULL AND p_cursor_row.INDIRIZZO_POSTALE != '' THEN
      IF SUBSTR(p_cursor_row.INDIRIZZO_POSTALE, 1, 3) = 'C/O' THEN
        v_flag_presso := TRUE;
      END IF;
      v_control_indir := TRUE;
    END IF;
    
    v_indirizzo.indirizzo := p_cursor_row.INDIRIZZO_POSTALE;
    
    -- Handle CAP
    IF p_cursor_row.CAP_POSTALE IS NOT NULL AND p_cursor_row.CAP_POSTALE != '' THEN
      v_control_indir := TRUE;
    END IF;
    v_indirizzo.cap := p_cursor_row.CAP_POSTALE;
    
    -- Handle localita/comune
    IF p_cursor_row.LOCALITA_POSTALE IS NOT NULL AND p_cursor_row.LOCALITA_POSTALE != '' THEN
      v_control_indir := TRUE;
    END IF;
    v_indirizzo.comune := p_cursor_row.LOCALITA_POSTALE;
    v_indirizzo.localita := p_cursor_row.LOCALITA_POSTALE;
    v_indirizzo.tipo_indirizzo := c_CORRISPONDENZA;
    
    -- Check provincia
    IF p_cursor_row.PROVINCIA_POSTALE IS NOT NULL AND p_cursor_row.PROVINCIA_POSTALE != '' THEN
      v_control_indir := TRUE;
    END IF;
    
  END set_indirizzo;

  /***************************************************************************
   * Function: get_promotore_by_codice
   * Description: Retrieve promotore by code
   ***************************************************************************/
  FUNCTION get_promotore_by_codice(
    p_cod_rete IN VARCHAR2,
    p_cod_comp IN VARCHAR2,
    p_cod_promotore IN VARCHAR2
  ) RETURN NUMBER IS
    v_promotore_id NUMBER;
  BEGIN
    BEGIN
      SELECT PROMOTORE_ID
      INTO v_promotore_id
      FROM FIN_PROMOTORE
      WHERE COD_RETE = p_cod_rete
        AND COD_COMP = p_cod_comp
        AND COD_PROMOTORE = p_cod_promotore;
      
      RETURN v_promotore_id;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        RETURN NULL;
      WHEN TOO_MANY_ROWS THEN
        RETURN NULL;
    END;
  END get_promotore_by_codice;

  /***************************************************************************
   * Procedure: insert_assegnazione
   * Description: Insert promotore-contratto assignment
   ***************************************************************************/
  PROCEDURE insert_assegnazione(
    p_contratto_id IN NUMBER,
    p_promotore_id IN NUMBER,
    p_data_inizio IN DATE,
    p_flag_attuale IN VARCHAR2
  ) IS
  BEGIN
    INSERT INTO FIN_CONTRATTO_PROMOTORE (
      CONTRATTO_ID,
      PROMOTORE_ID,
      DATA_INIZIO,
      FLAG_ATTUALE,
      DATA_INSERIMENTO,
      UTENTE_INSERIMENTO
    ) VALUES (
      p_contratto_id,
      p_promotore_id,
      p_data_inizio,
      p_flag_attuale,
      SYSDATE,
      c_BATCH_NAME
    );
  END insert_assegnazione;

  /***************************************************************************
   * Procedure: update_flx_contratto
   * Description: Update FLX_INVESTITORI_CONTRATTO with processing results
   ***************************************************************************/
  PROCEDURE update_flx_contratto(
    p_id IN NUMBER,
    p_stato IN VARCHAR2,
    p_descrizione_errore IN VARCHAR2
  ) IS
  BEGIN
    UPDATE FLX_INVESTITORI_CONTRATTO
    SET DATA_ELAB = SYSDATE,
        STATO_ELABORAZIONE = p_stato,
        DESCRIZIONE_ERRORE = p_descrizione_errore
    WHERE INVESTITORI_CONTRATTO_ID = p_id;
  END update_flx_contratto;

  /***************************************************************************
   * Procedure: insert_contratto_gp
   * Description: Insert new GP contract with related entities
   ***************************************************************************/
  PROCEDURE insert_contratto_gp(
    p_cursor_row IN FLX_INVESTITORI_CONTRATTO%ROWTYPE,
    p_prodotto_id IN NUMBER,
    p_attivita_fin_id IN NUMBER,
    p_soggetto_id IN NUMBER,
    p_cointestazione_id IN NUMBER,
    p_contratto_id OUT NUMBER
  ) IS
    v_sottoscrizione_id NUMBER;
    v_posizione_id NUMBER;
    v_indirizzo_id NUMBER;
    v_contratto_indir_id NUMBER;
  BEGIN
    -- Insert FIN_GP contract
    INSERT INTO FIN_GP (
      NUM_CONTRATTO, DATA_APERTURA, DATA_CHIUSURA, STATO_CONTRATTO,
      CONTRATTO_OMBRELLO, MULTIMAND_PRODOTTO_ID, PRENOTA_DARE, PRENOTA_AVERE,
      PERF_BCMK, PERF_NETTA_TRI, PERF_NETTA, PERF_NETTA_ANN, CTV_TOT,
      PERF_LORDA_ANN, PERF_LORDA_TRI, PERF_BCMK_TRI, PERF_BCMK_ANN,
      DATA_PERF, NAV_PERF, DATA_VAL, LIQUIDITA, SALDO_SOTTO_DOSSIER,
      PERF_GLOB_INIZIO_MAND_LOR, PERF_GLOB_INIZIO_MAND_NET,
      PERF_BENCH_INIZIO_GESTIONE, TOTALE_INVESTITO, TOTALE_VERSATO,
      TOTALE_PRELEVATO, BLOCCO_OPERATIVO, TIPO, TIPO_PRODOTTO,
      PRODOTTO_ID, SOGGETTO_ID, COINTESTAZIONE_ID,
      DATA_INSERIMENTO, UTENTE_INSERIMENTO
    ) VALUES (
      v_gp.num_contratto, v_gp.data_apertura, v_gp.data_chiusura, v_gp.stato_contratto,
      v_gp.contratto_ombrello, v_gp.multimand_prodotto_id, v_gp.prenota_dare, v_gp.prenota_avere,
      v_gp.perf_bcmk, v_gp.perf_netta_tri, v_gp.perf_netta, v_gp.perf_netta_ann, v_gp.ctv_tot,
      v_gp.perf_lorda_ann, v_gp.perf_lorda_tri, v_gp.perf_bcmk_tri, v_gp.perf_bcmk_ann,
      v_gp.data_perf, v_gp.nav_perf, v_gp.data_val, v_gp.liquidita, v_gp.saldo_sotto_dossier,
      v_gp.perf_glob_inizio_mand_lor, v_gp.perf_glob_inizio_mand_net,
      v_gp.perf_bench_inizio_gestione, v_gp.totale_investito, v_gp.totale_versato,
      v_gp.totale_prelevato, v_gp.blocco_operativo, v_gp.tipo, v_gp.tipo_prodotto,
      p_prodotto_id, p_soggetto_id, p_cointestazione_id,
      SYSDATE, c_BATCH_NAME
    )
    RETURNING CONTRATTO_ID INTO p_contratto_id;
    
    -- Insert sottoscrizione
    INSERT INTO FIN_SOTTOSCRIZIONE (
      STATO, DATA_SOTTOSCR, TIPO_OPERAZIONE,
      DATA_INSERIMENTO, UTENTE_INSERIMENTO
    ) VALUES (
      v_sottoscrizione.stato, v_sottoscrizione.data_sottoscr, v_sottoscrizione.tipo_operazione,
      SYSDATE, c_BATCH_NAME
    )
    RETURNING SOTTOSCRIZIONE_ID INTO v_sottoscrizione_id;
    
    -- Link sottoscrizione to contract
    INSERT INTO FIN_SOTTOSCR_CONT (
      SOTTOSCRIZIONE_ID, CONTRATTO_ID,
      DATA_INSERIMENTO, UTENTE_INSERIMENTO
    ) VALUES (
      v_sottoscrizione_id, p_contratto_id,
      SYSDATE, c_BATCH_NAME
    );
    
    -- Insert posizione
    INSERT INTO FIN_POSIZIONE (
      CONTRATTO_ID, ATTIVITA_FIN_ID, DATA_CREAZIONE, TIPO,
      QUANTITA, STATO_POSIZIONE, TIPO_PRODOTTO, CTV, DATA_VAL,
      DATA_INSERIMENTO, UTENTE_INSERIMENTO
    ) VALUES (
      p_contratto_id, p_attivita_fin_id, SYSDATE, 'LIQ',
      DECODE(v_gp.stato_contratto, 'C', 0, 1), 
      DECODE(v_gp.stato_contratto, 'C', 'C', 'A'),
      v_gp.tipo_prodotto, p_cursor_row.CONTROVALORE_NAV, p_cursor_row.DATA_VAL,
      SYSDATE, c_BATCH_NAME
    )
    RETURNING POSIZIONE_ID INTO v_posizione_id;
    
    -- Insert indirizzo if present
    IF v_control_indir THEN
      INSERT INTO FIN_INDIRIZZO (
        PROV, DATI_SUPL, NAZIONE, INDIRIZZO, CAP, COMUNE, LOCALITA,
        TIPO_INDIRIZZO, PRESSO, DATA_INSERIMENTO, UTENTE_INSERIMENTO
      ) VALUES (
        v_indirizzo.prov, v_indirizzo.dati_supl, v_indirizzo.nazione,
        DECODE(v_flag_presso, TRUE, '', v_indirizzo.indirizzo),
        v_indirizzo.cap, v_indirizzo.comune, v_indirizzo.localita,
        v_indirizzo.tipo_indirizzo,
        DECODE(v_flag_presso, TRUE, v_indirizzo.indirizzo, NULL),
        SYSDATE, c_BATCH_NAME
      )
      RETURNING INDIRIZZO_ID INTO v_indirizzo_id;
      
      -- Link indirizzo to contract
      INSERT INTO FIN_CONTRATTO_INDIR (
        CONTRATTO_ID, INDIRIZZO_ID, TIPO_INDIRIZZO,
        DATA_INIZIO, DATA_FINE,
        DATA_INSERIMENTO, UTENTE_INSERIMENTO
      ) VALUES (
        p_contratto_id, v_indirizzo_id, c_CORRISPONDENZA,
        SYSDATE, c_DATA_MAX,
        SYSDATE, c_BATCH_NAME
      );
    END IF;
    
  END insert_contratto_gp;

  /***************************************************************************
   * Procedure: update_contratto_gp
   * Description: Update existing GP contract
   ***************************************************************************/
  PROCEDURE update_contratto_gp(
    p_contratto_id IN NUMBER,
    p_cursor_row IN FLX_INVESTITORI_CONTRATTO%ROWTYPE
  ) IS
  BEGIN
    UPDATE FIN_GP
    SET DATA_CHIUSURA = v_gp.data_chiusura,
        STATO_CONTRATTO = v_gp.stato_contratto,
        CONTRATTO_OMBRELLO = NVL(v_gp.contratto_ombrello, CONTRATTO_OMBRELLO),
        MULTIMAND_PRODOTTO_ID = NVL(v_gp.multimand_prodotto_id, MULTIMAND_PRODOTTO_ID),
        PRENOTA_DARE = v_gp.prenota_dare,
        PRENOTA_AVERE = v_gp.prenota_avere,
        PERF_BCMK = v_gp.perf_bcmk,
        PERF_NETTA_TRI = v_gp.perf_netta_tri,
        PERF_NETTA = v_gp.perf_netta,
        PERF_NETTA_ANN = v_gp.perf_netta_ann,
        CTV_TOT = v_gp.ctv_tot,
        PERF_LORDA_ANN = v_gp.perf_lorda_ann,
        PERF_LORDA_TRI = v_gp.perf_lorda_tri,
        PERF_BCMK_TRI = v_gp.perf_bcmk_tri,
        PERF_BCMK_ANN = v_gp.perf_bcmk_ann,
        DATA_PERF = v_gp.data_perf,
        NAV_PERF = v_gp.nav_perf,
        DATA_VAL = v_gp.data_val,
        LIQUIDITA = v_gp.liquidita,
        SALDO_SOTTO_DOSSIER = v_gp.saldo_sotto_dossier,
        PERF_GLOB_INIZIO_MAND_LOR = v_gp.perf_glob_inizio_mand_lor,
        PERF_GLOB_INIZIO_MAND_NET = v_gp.perf_glob_inizio_mand_net,
        PERF_BENCH_INIZIO_GESTIONE = v_gp.perf_bench_inizio_gestione,
        TOTALE_INVESTITO = v_gp.totale_investito,
        TOTALE_VERSATO = v_gp.totale_versato,
        TOTALE_PRELEVATO = v_gp.totale_prelevato,
        BLOCCO_OPERATIVO = v_gp.blocco_operativo,
        TIPO = v_gp.tipo,
        TIPO_PRODOTTO = v_gp.tipo_prodotto,
        DATA_MODIFICA = SYSDATE,
        UTENTE_MODIFICA = c_BATCH_NAME
    WHERE CONTRATTO_ID = p_contratto_id;
  END update_contratto_gp;

  /***************************************************************************
   * Procedure: update_posizioni
   * Description: Update existing positions for a contract
   ***************************************************************************/
  PROCEDURE update_posizioni(
    p_contratto_id IN NUMBER,
    p_attivita_fin_id IN NUMBER,
    p_cursor_row IN FLX_INVESTITORI_CONTRATTO%ROWTYPE,
    p_stato_contratto IN VARCHAR2
  ) IS
    CURSOR c_posizioni IS
      SELECT *
      FROM FIN_POSIZIONE
      WHERE CONTRATTO_ID = p_contratto_id
        AND STATO_POSIZIONE = 'A';
    
    v_cambio_linea BOOLEAN := FALSE;
    v_posizione_id NUMBER;
  BEGIN
    FOR rec IN c_posizioni LOOP
      -- Check if attivita_fin changed (cambio linea)
      IF rec.ATTIVITA_FIN_ID != p_attivita_fin_id THEN
        v_cambio_linea := TRUE;
        
        -- Close old position
        UPDATE FIN_POSIZIONE
        SET STATO_POSIZIONE = 'C',
            QUANTITA = 0,
            DATA_MODIFICA = SYSDATE,
            UTENTE_MODIFICA = c_BATCH_NAME
        WHERE POSIZIONE_ID = rec.POSIZIONE_ID;
        
        -- Insert new position with new attivita_fin
        INSERT INTO FIN_POSIZIONE (
          CONTRATTO_ID, ATTIVITA_FIN_ID, DATA_CREAZIONE, TIPO,
          QUANTITA, STATO_POSIZIONE, TIPO_PRODOTTO, CTV, DATA_VAL,
          DATA_INSERIMENTO, UTENTE_INSERIMENTO
        ) VALUES (
          p_contratto_id, p_attivita_fin_id, SYSDATE, rec.TIPO,
          1, 'A', v_gp.tipo_prodotto,
          p_cursor_row.CONTROVALORE_NAV, p_cursor_row.DATA_VAL,
          SYSDATE, c_BATCH_NAME
        );
        
        EXIT; -- Only process one cambio linea
      ELSE
        -- Update existing position
        IF p_stato_contratto = 'C' THEN
          UPDATE FIN_POSIZIONE
          SET QUANTITA = 0,
              STATO_POSIZIONE = 'C',
              CTV = p_cursor_row.CONTROVALORE_NAV,
              DATA_VAL = p_cursor_row.DATA_VAL,
              DATA_MODIFICA = SYSDATE,
              UTENTE_MODIFICA = c_BATCH_NAME
          WHERE POSIZIONE_ID = rec.POSIZIONE_ID;
        ELSE
          UPDATE FIN_POSIZIONE
          SET QUANTITA = 1,
              CTV = p_cursor_row.CONTROVALORE_NAV,
              DATA_VAL = p_cursor_row.DATA_VAL,
              DATA_MODIFICA = SYSDATE,
              UTENTE_MODIFICA = c_BATCH_NAME
          WHERE POSIZIONE_ID = rec.POSIZIONE_ID;
        END IF;
      END IF;
    END LOOP;
    
  END update_posizioni;

  /***************************************************************************
   * Procedure: handle_indirizzo_corrispondenza
   * Description: Handle correspondence address for contract
   ***************************************************************************/
  PROCEDURE handle_indirizzo_corrispondenza(
    p_contratto_id IN NUMBER,
    p_cursor_row IN FLX_INVESTITORI_CONTRATTO%ROWTYPE,
    p_descrizione_errore OUT VARCHAR2
  ) IS
    v_indirizzo_id NUMBER;
    v_existing_count NUMBER;
  BEGIN
    p_descrizione_errore := NULL;
    
    IF NOT v_control_indir THEN
      RETURN;
    END IF;
    
    -- Check if indirizzo already exists for this contract
    SELECT COUNT(*)
    INTO v_existing_count
    FROM FIN_CONTRATTO_INDIR
    WHERE CONTRATTO_ID = p_contratto_id
      AND TIPO_INDIRIZZO = c_CORRISPONDENZA
      AND DATA_FINE = c_DATA_MAX;
    
    IF v_existing_count > 0 THEN
      -- Update existing indirizzo
      UPDATE FIN_CONTRATTO_INDIR
      SET DATA_FINE = SYSDATE
      WHERE CONTRATTO_ID = p_contratto_id
        AND TIPO_INDIRIZZO = c_CORRISPONDENZA
        AND DATA_FINE = c_DATA_MAX;
    END IF;
    
    -- Insert new indirizzo
    BEGIN
      INSERT INTO FIN_INDIRIZZO (
        PROV, DATI_SUPL, NAZIONE, INDIRIZZO, CAP, COMUNE, LOCALITA,
        TIPO_INDIRIZZO, PRESSO, DATA_INSERIMENTO, UTENTE_INSERIMENTO
      ) VALUES (
        v_indirizzo.prov, v_indirizzo.dati_supl, v_indirizzo.nazione,
        DECODE(v_flag_presso, TRUE, '', v_indirizzo.indirizzo),
        v_indirizzo.cap, v_indirizzo.comune, v_indirizzo.localita,
        v_indirizzo.tipo_indirizzo,
        DECODE(v_flag_presso, TRUE, v_indirizzo.indirizzo, NULL),
        SYSDATE, c_BATCH_NAME
      )
      RETURNING INDIRIZZO_ID INTO v_indirizzo_id;
      
      -- Link to contract
      INSERT INTO FIN_CONTRATTO_INDIR (
        CONTRATTO_ID, INDIRIZZO_ID, TIPO_INDIRIZZO,
        DATA_INIZIO, DATA_FINE,
        DATA_INSERIMENTO, UTENTE_INSERIMENTO
      ) VALUES (
        p_contratto_id, v_indirizzo_id, c_CORRISPONDENZA,
        SYSDATE, c_DATA_MAX,
        SYSDATE, c_BATCH_NAME
      );
      
      IF v_flag_presso THEN
        p_descrizione_errore := 'INDIRIZZO CORRISPONDENZA CONTENTE PRESSO';
      END IF;
      
    EXCEPTION
      WHEN OTHERS THEN
        p_descrizione_errore := 'INDIRIZZO CORRISPONDENZA NON NORMALIZZATO';
    END;
    
  END handle_indirizzo_corrispondenza;

  /***************************************************************************
   * Procedure: do_one_step
   * Description: Main procedure to process a contract
   ***************************************************************************/
  PROCEDURE do_one_step(
    p_investitori_contratto_id IN NUMBER,
    p_result OUT VARCHAR2,
    p_error_message OUT VARCHAR2
  ) IS
    v_cursor_row FLX_INVESTITORI_CONTRATTO%ROWTYPE;
    v_flag_nuovo_contratto BOOLEAN := FALSE;
    v_prodotto_id NUMBER;
    v_attivita_fin_id NUMBER;
    v_tipo_prodotto VARCHAR2(10);
    v_contratto_id NUMBER;
    v_soggetto_id NUMBER;
    v_cointestazione_id NUMBER;
    v_promotore_id NUMBER;
    v_cod_rete VARCHAR2(10);
    v_cod_comp VARCHAR2(10);
    v_descrizione_errore VARCHAR2(500);
  BEGIN
    -- Initialize result
    p_result := 'OK';
    p_error_message := NULL;
    
    -- Get cursor row
    BEGIN
      SELECT *
      INTO v_cursor_row
      FROM FLX_INVESTITORI_CONTRATTO
      WHERE INVESTITORI_CONTRATTO_ID = p_investitori_contratto_id;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        p_result := 'ERROR';
        p_error_message := 'Record not found';
        RETURN;
    END;
    
    -- Check flag nuovo contratto
    IF v_cursor_row.FLAG_NUOVO_CONTRATTO = 'S' THEN
      v_flag_nuovo_contratto := TRUE;
    END IF;
    
    -- Initialize data structures
    BEGIN
      set_gp(v_cursor_row);
      set_sottoscrizione(v_cursor_row);
      set_indirizzo(v_cursor_row);
    EXCEPTION
      WHEN OTHERS THEN
        update_flx_contratto(p_investitori_contratto_id, 'KO', c_ERR_DATI);
        p_result := 'ERROR';
        p_error_message := c_ERR_DATI;
        RETURN;
    END;
    
    -- Get attivita finanziaria and prodotto by codice linea
    BEGIN
      SELECT af.ATTIVITA_FIN_ID, p.PRODOTTO_ID, p.TIPO
      INTO v_attivita_fin_id, v_prodotto_id, v_tipo_prodotto
      FROM (
        SELECT af.ATTIVITA_FIN_ID, p.PRODOTTO_ID, p.TIPO
        FROM FIN_ATTIVITA_FINANZIARIA af
        JOIN FIN_PRODOTTO p ON p.PRODOTTO_ID = af.PRODOTTO_ID
        WHERE af.COD_ATT_FIN_EXT = v_cursor_row.CODICE_LINEA
        ORDER BY af.ATTIVITA_FIN_ID
      )
      WHERE ROWNUM = 1;
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        update_flx_contratto(p_investitori_contratto_id, 'KO', c_ERR_ATT_NOT_FOUND);
        p_result := 'WARNING';
        p_error_message := c_ERR_ATT_NOT_FOUND;
        RETURN;
    END;
    
    v_gp.tipo_prodotto := v_tipo_prodotto;
    v_gp.tipo := v_cursor_row.TIPO_PROD;
    v_gp.prodotto_id := v_prodotto_id;
    
    -- Search for existing contract
    BEGIN
      SELECT CONTRATTO_ID
      INTO v_contratto_id
      FROM (
        SELECT CONTRATTO_ID
        FROM FIN_GP
        WHERE NUM_CONTRATTO = v_cursor_row.NUMERO_RAPPORTO
          AND PRODOTTO_ID = v_prodotto_id
        ORDER BY CONTRATTO_ID DESC
      )
      WHERE ROWNUM = 1;
      
      -- Contract FOUND - update flow
      -- Get soggetto and cointestazione from GPRAM_SQUADRA
      BEGIN
        SELECT SOGGETTO_ID, COINTESTAZIONE_ID
        INTO v_soggetto_id, v_cointestazione_id
        FROM (
          SELECT SOGGETTO_ID, COINTESTAZIONE_ID
          FROM FLX_GPRAM_SQUADRA
          WHERE NUMERO_RAPPORTO = v_cursor_row.NUMERO_RAPPORTO
          ORDER BY SOGGETTO_ID
        )
        WHERE ROWNUM = 1;
      EXCEPTION
        WHEN NO_DATA_FOUND THEN
          update_flx_contratto(p_investitori_contratto_id, 'KO', 'COINTESTAZIONE NON TROVATA');
          p_result := 'WARNING';
          p_error_message := 'COINTESTAZIONE NON TROVATA';
          RETURN;
      END;
      
      -- Update contract data
      update_contratto_gp(v_contratto_id, v_cursor_row);
      
      -- Update positions
      update_posizioni(v_contratto_id, v_attivita_fin_id, v_cursor_row, v_gp.stato_contratto);
      
      -- Handle indirizzo
      handle_indirizzo_corrispondenza(v_contratto_id, v_cursor_row, v_descrizione_errore);
      
      IF v_descrizione_errore IS NULL THEN
        v_descrizione_errore := c_ERR_CONT_FOUND;
      END IF;
      
      update_flx_contratto(p_investitori_contratto_id, 'OK', v_descrizione_errore);
      p_result := 'OK';
      p_error_message := v_descrizione_errore;
      
    EXCEPTION
      WHEN NO_DATA_FOUND THEN
        -- Contract NOT_FOUND - insert flow
        IF NOT v_flag_nuovo_contratto THEN
          update_flx_contratto(p_investitori_contratto_id, 'KO', 
                              'Flag nuovo contratto non valorizzato ma contratto non trovato');
          p_result := 'WARNING';
          p_error_message := 'Flag nuovo contratto non valorizzato';
          RETURN;
        END IF;
        
        -- Get soggetto and cointestazione
        BEGIN
          SELECT SOGGETTO_ID, COINTESTAZIONE_ID
          INTO v_soggetto_id, v_cointestazione_id
          FROM (
            SELECT SOGGETTO_ID, COINTESTAZIONE_ID
            FROM FLX_GPRAM_SQUADRA
            WHERE NUMERO_RAPPORTO = v_cursor_row.NUMERO_RAPPORTO
            ORDER BY SOGGETTO_ID
          )
          WHERE ROWNUM = 1;
        EXCEPTION
          WHEN NO_DATA_FOUND THEN
            update_flx_contratto(p_investitori_contratto_id, 'KO', 'COINTESTAZIONE NON TROVATA');
            p_result := 'WARNING';
            p_error_message := 'COINTESTAZIONE NON TROVATA';
            RETURN;
        END;
        
        -- Insert new contract
        insert_contratto_gp(v_cursor_row, v_prodotto_id, v_attivita_fin_id,
                           v_soggetto_id, v_cointestazione_id, v_contratto_id);
        
        -- Handle promotore
        -- Transform codice rete
        IF v_cursor_row.CODICE_RETE = 'R' THEN
          v_cod_rete := 'S';
        ELSIF v_cursor_row.CODICE_RETE = 'F' THEN
          v_cod_rete := 'R';
        ELSE
          v_cod_rete := v_cursor_row.CODICE_RETE;
        END IF;
        
        -- Transform codice compagnia
        IF v_cursor_row.CODICE_COMPAGNIA IN ('00', '0') THEN
          v_cod_comp := '99';
        ELSE
          v_cod_comp := v_cursor_row.CODICE_COMPAGNIA;
        END IF;
        
        IF v_cursor_row.TIPO_FABBRICA = c_GP_INVESTITORI 
           AND v_cursor_row.CODICE_COMPAGNIA = '00' THEN
          v_cod_comp := '01';
        END IF;
        
        -- Get promotore
        v_promotore_id := get_promotore_by_codice(v_cod_rete, v_cod_comp, v_cursor_row.CODICE_AGENTE);
        
        IF v_promotore_id IS NOT NULL THEN
          insert_assegnazione(v_contratto_id, v_promotore_id, 
                            v_cursor_row.DATA_APERTURA_GPF, 'S');
          update_flx_contratto(p_investitori_contratto_id, 'OK', NULL);
          p_result := 'OK';
        ELSE
          update_flx_contratto(p_investitori_contratto_id, 'KO', c_ERR_PROM_NULL);
          p_result := 'WARNING';
          p_error_message := c_ERR_PROM_NULL;
        END IF;
        
      WHEN TOO_MANY_ROWS THEN
        update_flx_contratto(p_investitori_contratto_id, 'KO', 'TOO MANY ROWS');
        p_result := 'WARNING';
        p_error_message := 'TOO MANY ROWS';
    END;
    
    COMMIT;
    
  EXCEPTION
    WHEN OTHERS THEN
      ROLLBACK;
      p_result := 'ERROR';
      p_error_message := SQLERRM;
      update_flx_contratto(p_investitori_contratto_id, 'KO', SQLERRM);
      COMMIT;
  END do_one_step;

END PKG_CONTRATTI_GP_GEN;
/
