# Installation Guide for PKG_CONTRATTI_GP_GEN

## Prerequisites

Before installing this package, ensure the following database objects exist:

### Required Tables
1. `FLX_INVESTITORI_CONTRATTO` - Source data table
2. `FIN_GP` - GP contracts table
3. `FIN_CONTRATTO_PROMOTORE` - Contract-promoter assignments
4. `FIN_SOTTOSCRIZIONE` - Subscriptions
5. `FIN_CONTRATTO_INDIR` - Contract addresses
6. `FIN_INDIRIZZO` - Addresses
7. `FIN_SOTTOSCR_CONT` - Subscription-contract links
8. `FIN_ATTIVITA_FINANZIARIA` - Financial activities
9. `FIN_PRODOTTO` - Products
10. `FIN_POSIZIONE` - Positions
11. `FIN_PROMOTORE` - Promoters
12. `FIN_COINTESTAZIONE` - Co-ownership
13. `FLX_GPRAM_SQUADRA` - GPRAM squad data
14. `CODES_TABLE_NAZIONE_GPRAM` - Nation code conversion table

### Required Columns in FLX_INVESTITORI_CONTRATTO
Ensure the following columns exist:
- `INVESTITORI_CONTRATTO_ID` (NUMBER, PRIMARY KEY)
- `NUMERO_RAPPORTO` (VARCHAR2)
- `DATA_APERTURA_GPF` (DATE)
- `DATA_ESTINZIONE` (DATE)
- `TIPO_FABBRICA` (VARCHAR2)
- `MULTIMAND_PRODOTTO_ID` (NUMBER)
- `CONTRATTO_OMBRELLO` (VARCHAR2)
- `CODICE_LINEA` (VARCHAR2)
- `TIPO_PROD` (VARCHAR2)
- `FLAG_NUOVO_CONTRATTO` (VARCHAR2)
- `CODICE_RETE` (VARCHAR2)
- `CODICE_COMPAGNIA` (VARCHAR2)
- `CODICE_AGENTE` (VARCHAR2)
- `PROVINCIA_POSTALE` (VARCHAR2)
- `NAZIONE` (VARCHAR2)
- `INDIRIZZO_POSTALE` (VARCHAR2)
- `CAP_POSTALE` (VARCHAR2)
- `LOCALITA_POSTALE` (VARCHAR2)
- `BLOCCO_OPERATIVO` (VARCHAR2)
- `PRENOTA_DARE` (NUMBER)
- `PRENOTA_AVERE` (NUMBER)
- `PERF_INIZIO_TRIMESTRE` (NUMBER)
- `PERF_ANNUALIZZATA_DA_INIZIO_GE` (NUMBER)
- `PERF_INIZIO_ANNO` (NUMBER)
- `CONTROVALORE_NAV` (NUMBER)
- `PERF_LORDA_INIZIO_ANNO` (NUMBER)
- `PERF_LORDA_INIZIO_TRIMESTRE` (NUMBER)
- `PERF_BENCH_INIZIO_TRIM` (NUMBER)
- `PERF_BENCH_INIZIO_ANNO` (NUMBER)
- `DATA_ELAB_PERF` (DATE)
- `NAV_CALCOLO_PERF` (NUMBER)
- `DATA_VAL` (DATE)
- `SALDO_CC` (NUMBER)
- `SALDO_DOSSIER` (NUMBER)
- `PERF_GLOB_INIZIO_MAND_LOR` (NUMBER)
- `PERF_GLOB_INIZIO_MAND_NET` (NUMBER)
- `PERF_BENCH_INIZIO_GESTIONE` (NUMBER)
- `TOTALE_INVESTITO` (NUMBER)
- `TOTALE_VERSATO` (NUMBER)
- `TOTALE_PRELEVATO` (NUMBER)
- `DATA_ELAB` (DATE)
- `STATO_ELABORAZIONE` (VARCHAR2)
- `DESCRIZIONE_ERRORE` (VARCHAR2)

### Required Privileges
The database user installing the package needs:
- `CREATE PROCEDURE` privilege
- `SELECT, INSERT, UPDATE` privileges on all tables listed above
- `SELECT` privilege on `CODES_TABLE_NAZIONE_GPRAM`

## Installation Steps

### Step 1: Verify Prerequisites
```sql
-- Check if all required tables exist
SELECT table_name 
FROM user_tables 
WHERE table_name IN (
  'FLX_INVESTITORI_CONTRATTO',
  'FIN_GP',
  'FIN_CONTRATTO_PROMOTORE',
  'FIN_SOTTOSCRIZIONE',
  'FIN_CONTRATTO_INDIR',
  'FIN_INDIRIZZO',
  'FIN_SOTTOSCR_CONT',
  'FIN_ATTIVITA_FINANZIARIA',
  'FIN_PRODOTTO',
  'FIN_POSIZIONE',
  'FIN_PROMOTORE',
  'FIN_COINTESTAZIONE',
  'FLX_GPRAM_SQUADRA',
  'CODES_TABLE_NAZIONE_GPRAM'
)
ORDER BY table_name;
```

### Step 2: Install Package Specification
```bash
sqlplus username/password@database @PKG_CONTRATTI_GP_GEN.pks
```

Or from SQL*Plus:
```sql
@PKG_CONTRATTI_GP_GEN.pks
```

Verify installation:
```sql
SELECT object_name, object_type, status
FROM user_objects
WHERE object_name = 'PKG_CONTRATTI_GP_GEN'
  AND object_type = 'PACKAGE';
```

Expected output:
```
OBJECT_NAME              OBJECT_TYPE    STATUS
------------------------ -------------- -------
PKG_CONTRATTI_GP_GEN     PACKAGE        VALID
```

### Step 3: Install Package Body
```bash
sqlplus username/password@database @PKG_CONTRATTI_GP_GEN.pkb
```

Or from SQL*Plus:
```sql
@PKG_CONTRATTI_GP_GEN.pkb
```

Verify installation:
```sql
SELECT object_name, object_type, status
FROM user_objects
WHERE object_name = 'PKG_CONTRATTI_GP_GEN'
ORDER BY object_type;
```

Expected output:
```
OBJECT_NAME              OBJECT_TYPE    STATUS
------------------------ -------------- -------
PKG_CONTRATTI_GP_GEN     PACKAGE        VALID
PKG_CONTRATTI_GP_GEN     PACKAGE BODY   VALID
```

### Step 4: Verify Compilation
```sql
-- Check for compilation errors
SELECT line, position, text
FROM user_errors
WHERE name = 'PKG_CONTRATTI_GP_GEN'
ORDER BY sequence;
```

If there are no rows returned, the package compiled successfully.

### Step 5: Test Installation
Run a simple test:
```sql
SET SERVEROUTPUT ON;

DECLARE
  v_nation_code VARCHAR2(10);
BEGIN
  -- Test the decode_nazione function
  v_nation_code := PKG_CONTRATTI_GP_GEN.decode_nazione('IT');
  DBMS_OUTPUT.PUT_LINE('Test successful! IT nation code: ' || NVL(v_nation_code, 'NULL'));
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Test failed: ' || SQLERRM);
END;
/
```

### Step 6: Run Example Usage (Optional)
```sql
@example_usage.sql
```

This will run various examples demonstrating the package functionality.

## Post-Installation

### Grant Privileges (if needed for other users)
```sql
GRANT EXECUTE ON PKG_CONTRATTI_GP_GEN TO other_user;
```

### Create Synonyms (if needed)
```sql
CREATE PUBLIC SYNONYM PKG_CONTRATTI_GP_GEN FOR owner.PKG_CONTRATTI_GP_GEN;
```

## Troubleshooting

### Package Invalid After Installation

1. Check for compilation errors:
```sql
SELECT * FROM user_errors
WHERE name = 'PKG_CONTRATTI_GP_GEN'
ORDER BY sequence;
```

2. Common issues:
   - Missing table columns
   - Insufficient privileges
   - Invalid references to other objects
   - Data type mismatches

3. To recompile:
```sql
ALTER PACKAGE PKG_CONTRATTI_GP_GEN COMPILE SPECIFICATION;
ALTER PACKAGE PKG_CONTRATTI_GP_GEN COMPILE BODY;
```

### Missing Dependencies

If you get errors about missing tables or columns:
```sql
-- Check dependencies
SELECT referenced_name, referenced_type
FROM user_dependencies
WHERE name = 'PKG_CONTRATTI_GP_GEN'
  AND referenced_owner = USER
ORDER BY referenced_name;
```

### Performance Issues

1. Ensure indexes exist on key columns:
```sql
-- Recommended indexes
CREATE INDEX idx_flx_inv_ctr_stato ON FLX_INVESTITORI_CONTRATTO(STATO_ELABORAZIONE);
CREATE INDEX idx_flx_inv_ctr_numero ON FLX_INVESTITORI_CONTRATTO(NUMERO_RAPPORTO);
CREATE INDEX idx_fin_gp_num_prod ON FIN_GP(NUM_CONTRATTO, PRODOTTO_ID);
CREATE INDEX idx_fin_att_fin_cod ON FIN_ATTIVITA_FINANZIARIA(COD_ATT_FIN_EXT);
CREATE INDEX idx_fin_prom_codes ON FIN_PROMOTORE(COD_RETE, COD_COMP, COD_PROMOTORE);
CREATE INDEX idx_flx_gpram_numero ON FLX_GPRAM_SQUADRA(NUMERO_RAPPORTO);
```

2. Gather statistics:
```sql
EXEC DBMS_STATS.GATHER_TABLE_STATS(USER, 'FLX_INVESTITORI_CONTRATTO');
EXEC DBMS_STATS.GATHER_TABLE_STATS(USER, 'FIN_GP');
-- Repeat for all tables
```

## Uninstallation

To remove the package:
```sql
DROP PACKAGE PKG_CONTRATTI_GP_GEN;
```

This will drop both the specification and body.

## Version Information

- **Package Version**: 1.0
- **Installation Date**: Check with `SELECT created FROM user_objects WHERE object_name = 'PKG_CONTRATTI_GP_GEN'`
- **Last Modified**: Check with `SELECT last_ddl_time FROM user_objects WHERE object_name = 'PKG_CONTRATTI_GP_GEN'`

## Support

For issues or questions:
1. Check the README.md for usage documentation
2. Review example_usage.sql for code samples
3. Examine the package specification (PKG_CONTRATTI_GP_GEN.pks) for interface details
4. Contact the development team

## Migration from Java

This package replaces the Java class:
- **Java Class**: `it.ras.arco.batch.investitori.businesslogic.ContrattiGpGenBL`
- **Package**: `it.ras.arco.batch.investitori.businesslogic`

Key differences:
- All Spring services are now internal PL/SQL procedures
- Transaction management is explicit (COMMIT/ROLLBACK)
- Error handling is logged directly to FLX_INVESTITORI_CONTRATTO
- No external service dependencies

## Batch Processing

For production batch processing, consider:
1. Running with appropriate commit intervals (every 100-1000 records)
2. Monitoring the FLX_INVESTITORI_CONTRATTO.STATO_ELABORAZIONE field
3. Setting up alerts for high error rates
4. Scheduling regular processing via DBMS_SCHEDULER
5. Implementing retry logic for failed records

Example batch job:
```sql
BEGIN
  DBMS_SCHEDULER.CREATE_JOB (
    job_name        => 'JOB_CONTRATTI_GP_GEN',
    job_type        => 'PLSQL_BLOCK',
    job_action      => 'BEGIN
                          FOR rec IN (SELECT INVESTITORI_CONTRATTO_ID 
                                      FROM FLX_INVESTITORI_CONTRATTO 
                                      WHERE STATO_ELABORAZIONE IS NULL) 
                          LOOP
                            PKG_CONTRATTI_GP_GEN.do_one_step(rec.INVESTITORI_CONTRATTO_ID);
                          END LOOP;
                        END;',
    start_date      => SYSTIMESTAMP,
    repeat_interval => 'FREQ=DAILY; BYHOUR=2',
    enabled         => TRUE
  );
END;
/
```
