# PL/SQL Package: PKG_CONTRATTI_GP_GEN

## Overview
This package is a conversion of the Java class `it.ras.arco.batch.investitori.businesslogic.ContrattiGpGenBL` to PL/SQL. It handles the processing of GP (Gestione Patrimoniale) contracts from the `FLX_INVESTITORI_CONTRATTO` table.

## Files
- **PKG_CONTRATTI_GP_GEN.pks** - Package specification (header)
- **PKG_CONTRATTI_GP_GEN.pkb** - Package body (implementation)

## Installation
Execute the SQL scripts in the following order:
```sql
@PKG_CONTRATTI_GP_GEN.pks
@PKG_CONTRATTI_GP_GEN.pkb
```

## Main Components

### Constants
- `c_BATCH_NAME` - Batch process name: 'BatchContrattoGPInvestitori'
- `c_CORRISPONDENZA` - Correspondence type: 'COR'
- `c_INVALID_CTR_OMBRELLO` - Invalid umbrella contract: '00000000000'
- `c_GP_INVESTITORI` - GP Investitori type: 'GPINVEST'
- `c_ITALIA` - Italy nation code: '086'
- `c_DATA_MAX` - Maximum date: 31/12/9999

### Error Messages
- `c_ERR_DATI` - 'INIZIALIZZAZIONE FALLITA'
- `c_ERR_ATT_NOT_FOUND` - 'ATTIVITA FIN O PRODOTTO NON TROVATO'
- `c_ERR_CONT_FOUND` - 'CONTRATTO GIA PRESENTE'
- `c_ERR_CONTRATTO_APE` - 'IL CONTRATTO GIA PRESENTE E APERTO'
- `c_ERR_DATA_EST` - 'DATA ESTINZIONE NULL'
- `c_ERR_PROM_NULL` - 'NON ESISTE IL PROMOTORE'

### Main Procedure

#### do_one_step
Main procedure to process a single contract from FLX_INVESTITORI_CONTRATTO.

**Parameters:**
- `p_investitori_contratto_id` (IN NUMBER) - ID of the record to process
- `p_result` (OUT VARCHAR2) - Result status: 'OK', 'WARNING', or 'ERROR'
- `p_error_message` (OUT VARCHAR2) - Error message if any

**Usage Example:**
```sql
DECLARE
  v_result VARCHAR2(50);
  v_error_message VARCHAR2(500);
BEGIN
  PKG_CONTRATTI_GP_GEN.do_one_step(
    p_investitori_contratto_id => 12345,
    p_result => v_result,
    p_error_message => v_error_message
  );
  
  DBMS_OUTPUT.PUT_LINE('Result: ' || v_result);
  IF v_error_message IS NOT NULL THEN
    DBMS_OUTPUT.PUT_LINE('Error: ' || v_error_message);
  END IF;
END;
/
```

### Utility Functions

#### decode_nazione
Converts ISO nation code to UIC code using CODES_TABLE_NAZIONE_GPRAM.

**Parameters:**
- `p_codice_iso` (IN VARCHAR2) - ISO nation code

**Returns:** VARCHAR2 - UIC nation code, or '799' if not found

## Processing Logic

The `do_one_step` procedure follows this flow:

1. **Retrieve record** from FLX_INVESTITORI_CONTRATTO
2. **Check flag** for new contract
3. **Initialize** data structures (GP, sottoscrizione, indirizzo)
4. **Search** for attività finanziaria and prodotto by codice linea
5. **Search** for existing contract by numero contratto and prodotto
6. **If contract exists (FOUND):**
   - Update GP contract data
   - Handle cambio linea (close old position, create new one)
   - Update existing positions
   - Handle correspondence address
   - Retrieve cointestazione from FLX_GPRAM_SQUADRA
   - Execute UPDATE on contract
7. **If contract not found (NOT_FOUND) and flag nuovo contratto = 'S':**
   - Retrieve cointestazione from FLX_GPRAM_SQUADRA
   - Create new position
   - Insert new contract
   - Insert sottoscrizione
   - Handle correspondence address
   - Search and assign promotore
8. **Update** processing status in FLX_INVESTITORI_CONTRATTO

## Table Mappings

Java Hibernate classes → Oracle tables:

| Java Class | Oracle Table |
|------------|--------------|
| FlxInvestitoriContratto | FLX_INVESTITORI_CONTRATTO |
| FinGP | FIN_GP |
| FinContrattoPromotore | FIN_CONTRATTO_PROMOTORE |
| FinSottoscrizione | FIN_SOTTOSCRIZIONE |
| FinContrattoIndir | FIN_CONTRATTO_INDIR |
| FinIndirizzo | FIN_INDIRIZZO |
| FinSottoscrizioneCont | FIN_SOTTOSCR_CONT |
| FinAttivitaFinanziaria | FIN_ATTIVITA_FINANZIARIA |
| FinProdotto | FIN_PRODOTTO |
| FinPosizione | FIN_POSIZIONE |
| FinPromotore | FIN_PROMOTORE |
| FinCointestazione | FIN_COINTESTAZIONE |
| FlxGpramSquadra | FLX_GPRAM_SQUADRA |

## Business Rules

### Codice Rete Transformation
```
IF codice_rete = 'R' THEN cod_rete := 'S'
ELSIF codice_rete = 'F' THEN cod_rete := 'R'
ELSE cod_rete := codice_rete
```

### Codice Compagnia Transformation
```
IF codice_compagnia IN ('00', '0') THEN cod_comp := '99'
ELSE cod_comp := codice_compagnia

IF tipo_fabbrica = 'GPINVEST' AND codice_compagnia = '00' THEN cod_comp := '01'
```

### Address Handling
- Addresses starting with "C/O" are treated as "presso" addresses
- The "C/O" prefix is moved to the PRESSO field
- Addresses are normalized using the InsertCorrispondenza service
- If normalization fails, InsertCorrispondenzaSenzaNormalizzazione is used

### Date Handling
- Maximum date (31/12/9999) indicates an open contract (stato_contratto = 'A')
- Any other date indicates a closed contract (stato_contratto = 'C')

## Error Handling
All errors are logged in the FLX_INVESTITORI_CONTRATTO table:
- `DATA_ELAB` - Processing timestamp
- `STATO_ELABORAZIONE` - Processing status ('OK', 'KO')
- `DESCRIZIONE_ERRORE` - Error description

## Dependencies
This package requires the following database objects:
- Tables: All FIN_* and FLX_* tables listed in Table Mappings
- Table: CODES_TABLE_NAZIONE_GPRAM (for nation code conversion)

## Notes
- The package uses autonomous transactions for error logging
- All inserts/updates include audit fields (DATA_INSERIMENTO, UTENTE_INSERIMENTO, etc.)
- The batch name 'BatchContrattoGPInvestitori' is used as the user identifier
- COMMIT is executed at the end of successful processing
- ROLLBACK is executed on errors, followed by error logging and COMMIT

## Version History
- v1.0 - Initial conversion from Java class ContrattiGpGenBL
