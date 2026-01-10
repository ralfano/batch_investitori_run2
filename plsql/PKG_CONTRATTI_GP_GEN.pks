CREATE OR REPLACE PACKAGE PKG_CONTRATTI_GP_GEN AS
/*******************************************************************************
 * Package: PKG_CONTRATTI_GP_GEN
 * Description: Conversion of ContrattiGpGenBL Java class to PL/SQL
 * 
 * This package handles the processing of GP (Gestione Patrimoniale) contracts
 * from the FLX_INVESTITORI_CONTRATTO table.
 ******************************************************************************/

  -- Constants
  c_BATCH_NAME CONSTANT VARCHAR2(50) := 'BatchContrattoGPInvestitori';
  c_CORRISPONDENZA CONSTANT VARCHAR2(3) := 'COR';
  c_INVALID_CTR_OMBRELLO CONSTANT VARCHAR2(11) := '00000000000';
  c_GP_INVESTITORI CONSTANT VARCHAR2(10) := 'GPINVEST';
  c_ITALIA CONSTANT VARCHAR2(3) := '086';
  c_DATA_MAX CONSTANT DATE := TO_DATE('31/12/9999', 'DD/MM/YYYY');
  
  -- Error messages
  c_ERR_DATI CONSTANT VARCHAR2(50) := 'INIZIALIZZAZIONE FALLITA';
  c_ERR_ATT_NOT_FOUND CONSTANT VARCHAR2(50) := 'ATTIVITA FIN O PRODOTTO NON TROVATO';
  c_ERR_CONT_FOUND CONSTANT VARCHAR2(50) := 'CONTRATTO GIA PRESENTE';
  c_ERR_CONTRATTO_APE CONSTANT VARCHAR2(50) := 'IL CONTRATTO GIA PRESENTE E APERTO';
  c_ERR_DATA_EST CONSTANT VARCHAR2(50) := 'DATA ESTINZIONE NULL';
  c_ERR_PROM_NULL CONSTANT VARCHAR2(50) := 'NON ESISTE IL PROMOTORE';

  -- Record types for entities
  TYPE t_fin_gp IS RECORD (
    num_contratto FIN_GP.NUM_CONTRATTO%TYPE,
    data_apertura FIN_GP.DATA_APERTURA%TYPE,
    data_chiusura FIN_GP.DATA_CHIUSURA%TYPE,
    stato_contratto FIN_GP.STATO_CONTRATTO%TYPE,
    contratto_ombrello FIN_GP.CONTRATTO_OMBRELLO%TYPE,
    multimand_prodotto_id FIN_GP.MULTIMAND_PRODOTTO_ID%TYPE,
    prenota_dare FIN_GP.PRENOTA_DARE%TYPE,
    prenota_avere FIN_GP.PRENOTA_AVERE%TYPE,
    perf_bcmk FIN_GP.PERF_BCMK%TYPE,
    perf_netta_tri FIN_GP.PERF_NETTA_TRI%TYPE,
    perf_netta FIN_GP.PERF_NETTA%TYPE,
    perf_netta_ann FIN_GP.PERF_NETTA_ANN%TYPE,
    ctv_tot FIN_GP.CTV_TOT%TYPE,
    perf_lorda_ann FIN_GP.PERF_LORDA_ANN%TYPE,
    perf_lorda_tri FIN_GP.PERF_LORDA_TRI%TYPE,
    perf_bcmk_tri FIN_GP.PERF_BCMK_TRI%TYPE,
    perf_bcmk_ann FIN_GP.PERF_BCMK_ANN%TYPE,
    data_perf FIN_GP.DATA_PERF%TYPE,
    nav_perf FIN_GP.NAV_PERF%TYPE,
    data_val FIN_GP.DATA_VAL%TYPE,
    liquidita FIN_GP.LIQUIDITA%TYPE,
    saldo_sotto_dossier FIN_GP.SALDO_SOTTO_DOSSIER%TYPE,
    perf_glob_inizio_mand_lor FIN_GP.PERF_GLOB_INIZIO_MAND_LOR%TYPE,
    perf_glob_inizio_mand_net FIN_GP.PERF_GLOB_INIZIO_MAND_NET%TYPE,
    perf_bench_inizio_gestione FIN_GP.PERF_BENCH_INIZIO_GESTIONE%TYPE,
    totale_investito FIN_GP.TOTALE_INVESTITO%TYPE,
    totale_versato FIN_GP.TOTALE_VERSATO%TYPE,
    totale_prelevato FIN_GP.TOTALE_PRELEVATO%TYPE,
    blocco_operativo FIN_GP.BLOCCO_OPERATIVO%TYPE,
    tipo FIN_GP.TIPO%TYPE,
    tipo_prodotto FIN_GP.TIPO_PRODOTTO%TYPE,
    prodotto_id FIN_GP.PRODOTTO_ID%TYPE,
    soggetto_id FIN_GP.SOGGETTO_ID%TYPE,
    cointestazione_id FIN_GP.COINTESTAZIONE_ID%TYPE
  );
  
  TYPE t_fin_indirizzo IS RECORD (
    indirizzo_id FIN_INDIRIZZO.INDIRIZZO_ID%TYPE,
    prov FIN_INDIRIZZO.PROV%TYPE,
    dati_supl FIN_INDIRIZZO.DATI_SUPL%TYPE,
    nazione FIN_INDIRIZZO.NAZIONE%TYPE,
    indirizzo FIN_INDIRIZZO.INDIRIZZO%TYPE,
    cap FIN_INDIRIZZO.CAP%TYPE,
    comune FIN_INDIRIZZO.COMUNE%TYPE,
    localita FIN_INDIRIZZO.LOCALITA%TYPE,
    tipo_indirizzo FIN_INDIRIZZO.TIPO_INDIRIZZO%TYPE,
    presso FIN_INDIRIZZO.PRESSO%TYPE
  );
  
  TYPE t_fin_sottoscrizione IS RECORD (
    sottoscrizione_id FIN_SOTTOSCRIZIONE.SOTTOSCRIZIONE_ID%TYPE,
    stato FIN_SOTTOSCRIZIONE.STATO%TYPE,
    data_sottoscr FIN_SOTTOSCRIZIONE.DATA_SOTTOSCR%TYPE,
    tipo_operazione FIN_SOTTOSCRIZIONE.TIPO_OPERAZIONE%TYPE
  );
  
  TYPE t_fin_posizione IS RECORD (
    posizione_id FIN_POSIZIONE.POSIZIONE_ID%TYPE,
    contratto_id FIN_POSIZIONE.CONTRATTO_ID%TYPE,
    attivita_fin_id FIN_POSIZIONE.ATTIVITA_FIN_ID%TYPE,
    data_creazione FIN_POSIZIONE.DATA_CREAZIONE%TYPE,
    tipo FIN_POSIZIONE.TIPO%TYPE,
    quantita FIN_POSIZIONE.QUANTITA%TYPE,
    stato_posizione FIN_POSIZIONE.STATO_POSIZIONE%TYPE,
    tipo_prodotto FIN_POSIZIONE.TIPO_PRODOTTO%TYPE,
    ctv FIN_POSIZIONE.CTV%TYPE,
    data_val FIN_POSIZIONE.DATA_VAL%TYPE
  );
  
  TYPE t_fin_promotore IS RECORD (
    promotore_id FIN_PROMOTORE.PROMOTORE_ID%TYPE,
    cod_rete FIN_PROMOTORE.COD_RETE%TYPE,
    cod_comp FIN_PROMOTORE.COD_COMP%TYPE,
    cod_promotore FIN_PROMOTORE.COD_PROMOTORE%TYPE
  );

  /***************************************************************************
   * Function: decode_nazione
   * Description: Converts ISO nation code to UIC code from CODES_TABLE_NAZIONE_GPRAM
   * Parameters:
   *   p_codice_iso - ISO nation code
   * Returns: UIC nation code, or '799' if not found
   ***************************************************************************/
  FUNCTION decode_nazione(p_codice_iso IN VARCHAR2) RETURN VARCHAR2;

  /***************************************************************************
   * Procedure: do_one_step
   * Description: Main procedure to process a single contract row
   * Parameters:
   *   p_investitori_contratto_id - ID of the row in FLX_INVESTITORI_CONTRATTO
   *   p_result - Output result status (OK, WARNING, ERROR)
   *   p_error_message - Output error message if any
   ***************************************************************************/
  PROCEDURE do_one_step(
    p_investitori_contratto_id IN NUMBER,
    p_result OUT VARCHAR2,
    p_error_message OUT VARCHAR2
  );

END PKG_CONTRATTI_GP_GEN;
/
