/*     */ package it.ras.arco.common.resources;public class CommonConstants { public static final String AGGR_DURATION = "Duration"; public static final String AGGR_GEOGRAFICA = "AreaGeografica"; public static final String AGGR_MAC = "MacroassetClass"; public static final String AGGR_POSVALUTARIA = "Valuta"; public static final String AGGR_RATING = "Rating"; public static final String AGGR_SETTORI = "Settore";
/*     */   public static final String AGGR_ETICH_NONDISP = "Non Disp";
/*     */   
/*     */   public class GenericVal { public static final String VALORE_COMBO_DESELEZIONE = "-1";
/*     */     public static final String VALORE_RADIO_POSITIVO = "S";
/*     */     public static final String VALORE_RADIO_NEGATIVO = "N";
/*     */     public static final String VALORE_CHECK_POSITIVO = "S";
/*     */     public static final String VALORE_CHECK_NEGATIVO = "N";
/*     */     public static final String VALORE_FLAG_ESISTENZA_NEGATIVO = "N";
/*     */     public static final String VALORE_FLAG_ESISTENZA_POSITIVO = "S";
/*     */     
/*     */     public GenericVal(CommonConstants this$0) {
/*  13 */       this.this$0 = this$0;
/*     */     }
/*     */ 
/*     */     
/*     */     public static final String MIXED_LIST_CONTROL_LABEL = "LBL";
/*     */     
/*     */     public static final String MIXED_LIST_CONTROL_CHECKBOX = "CHK";
/*     */     
/*     */     public static final String MIXED_LIST_CONTROL_RADIO = "RDO";
/*     */     
/*     */     public static final String MIXED_LIST_CONTROL_TEXT = "TXT";
/*     */     
/*     */     public static final String MIXED_LIST_CONTROL_COMBO = "CMB";
/*     */     
/*     */     public static final String MIXED_LIST_CONTROL_DATA = "DAT";
/*     */     
/*     */     public static final String MIXED_LIST_CONTROL_NUMBER = "NMB";
/*     */     
/*     */     public static final String USER_NAME_ARCO = "USER_NAME_ARCO";
/*     */     
/*     */     public static final String GET_CREDENZIALI_SEC_TX = "getCredenzialiSecTx";
/*     */     
/*     */     public static final String CHANNEL_LOGIN_SEC_TX = "channelLoginSecTx";
/*     */     
/*     */     public static final String USER_CREDENZIALI_SEC = "USER_CREDENZIALI_SEC";
/*     */     
/*     */     public static final String RAS_BANK_ABI = "03589";
/*     */     
/*     */     public static final String RAS_BANK_CAB = "01600";
/*     */     
/*     */     public static final String DENOMINAZIONE_BANCA_CORRISPONDENTE_RASBANK = "RASBANK";
/*     */     
/*     */     public static final String BEAN_TO_BE_RELOADED = "BEAN_TO_BE_RELOADED";
/*     */     
/*     */     public static final String BEAN_TO_BE_RELOADED_ID = "BEAN_TO_BE_RELOADED_ID";
/*     */     
/*     */     public static final String RELOADED_BEAN = "RELOADED_BEAN";
/*     */     
/*     */     public static final String FILTRO_VISIBILITA_ARCO = "S";
/*     */     
/*     */     public static final boolean CODES_TABLE_ATTIVITA_FINANZIARIA_FILTRATA = true;
/*     */     public static final String URL_IMMAGINI = "/commonFlag/arcofep/images/";
/*     */     public static final String REQ_BACKUP_PARAMETERS = "REQ_BACKUP_PARAMETERS";
/*     */     private final CommonConstants this$0; }
/*     */ 
/*     */   
/*     */   public class Dip
/*     */   {
/*     */     public static final String FLAG_DOPO_STAMPA_AGG = "AGG";
/*     */     public static final String FLAG_DOPO_STAMPA_SI = "SI";
/*     */     public static final String FLAG_DOPO_STAMPA_NO = "NO";
/*     */     public static final String CONTROLLO_EX_ANTE = "A";
/*     */     public static final String CONTROLLO_EX_POST = "P";
/*     */     private final CommonConstants this$0;
/*     */     
/*     */     public Dip(CommonConstants this$0) {
/*  69 */       this.this$0 = this$0;
/*     */     }
/*     */     public class Raggruppamento { public static final String RGP_FONDI_RAM = "FRM"; public static final String RGP_FONDI_RAS_LUX = "FRL"; public static final String RGP_GP_RAM = "GPR"; public static final String RGP_SICAV_BANCA_CORRISP_RASBANK = "SBC"; public static final String RGP_GP_RAS_BANK = "GPRBK"; public static final String RGP_CC_DT = "CCDT"; public static final String RGP_FONDI_SICAV_TERZI = "FST";
/*     */       public static final String RGP_POLIZZE_RBVITA = "RBV";
/*     */       public static final String RGP_POLIZZE_DARTA = "DRT";
/*     */       private final CommonConstants.Dip this$1;
/*     */       
/*     */       public Raggruppamento(CommonConstants.Dip this$1) {
/*  77 */         this.this$1 = this$1;
/*     */       } }
/*     */ 
/*     */ 
/*     */     
/*     */     public class Cartaceo
/*     */     {
/*     */       public static final String STATO_CARTACEO_OK = "OK";
/*     */       
/*     */       public static final String STATO_CARTACEO_KO = "KO";
/*     */       private final CommonConstants.Dip this$1;
/*     */       
/*     */       public Cartaceo(CommonConstants.Dip this$1) {
/*  90 */         this.this$1 = this$1;
/*     */       } }
/*     */     public class Operazione { public static final String OP_RIMBORSO = "RIM"; public static final String OP_PASSAGGIO = "PAS"; public static final String OP_INIZIALE = "INI"; public static final String OP_AGGIUNTIVO = "AGG"; public static final String OP_INIZIALE_AGGIUNTIVO = "INAG";
/*     */       private final CommonConstants.Dip this$1;
/*     */       
/*     */       public Operazione(CommonConstants.Dip this$1) {
/*  96 */         this.this$1 = this$1;
/*     */       } }
/*     */     public class FinDip { public static final String TIPO_DIP_VARIAZIONE_INDIRIZZO = "VIND"; public static final String TIPO_DIP_CORREZIONE_FORMALE = "CFM"; public static final String TIPO_OPERAZIONE_RESIDENZA = "RES"; public static final String TIPO_OPERAZIONE_CORRISPONDENZA = "COR"; public static final String TIPO_OPERAZIONE_TOTALE = "TOT"; public static final String STATO_IN_LAVORAZIONE = "LP"; public static final String STATO_ANNULLATO = "AP"; public static final String STATO_REVOCATO_PF = "RP";
/*     */       public static final String STATO_REVOCATO_MO = "RM";
/*     */       public static final String STATO_CONFERMATO_PF = "CP";
/*     */       public static final String STATO_CONFERMATO_MO = "CM";
/*     */       private final CommonConstants.Dip this$1;
/*     */       
/*     */       public FinDip(CommonConstants.Dip this$1) {
/* 105 */         this.this$1 = this$1;
/*     */       } }
/*     */ 
/*     */ 
/*     */     
/*     */     public class FinDipDettaglioIndir
/*     */     {
/*     */       public static final String TIPO_VARIAZIONE_RESIDENZA = "RES";
/*     */       
/*     */       public static final String TIPO_VARIAZIONE_CORRISPONDENZA = "COR";
/*     */       
/*     */       public static final String TIPO_ORIGINALE_RESIDENZA = "RES";
/*     */       
/*     */       public static final String TIPO_ORIGINALE_CORRISPONDENZA = "COR";
/*     */       
/*     */       private final CommonConstants.Dip this$1;
/*     */       
/*     */       public FinDipDettaglioIndir(CommonConstants.Dip this$1) {
/* 123 */         this.this$1 = this$1;
/*     */       }
/*     */     }
/*     */     
/*     */     public class FinAggregazione { public static final String TIPO_AGG_FABBRICA_FLUSSO = "A";
/*     */       public static final String TIPO_AGG_FABBRICA_MANUALE = "M";
/*     */       public static final String TIPO_AGG_FABBRICA_NESSUNO = "N";
/*     */       private final CommonConstants.Dip this$1;
/*     */       
/*     */       public FinAggregazione(CommonConstants.Dip this$1) {
/* 133 */         this.this$1 = this$1;
/*     */       } }
/*     */     public class Accorpamento { public static final int GESTIONE_DI_DEFAULT = 0; public static final int MULTIPATNER = 1; public static final int SQUADRA = 2; public static final int RAPPORTO_CC = 3;
/*     */       private final CommonConstants.Dip this$1;
/*     */       
/*     */       public Accorpamento(CommonConstants.Dip this$1) {
/* 139 */         this.this$1 = this$1;
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */   
/*     */   public static class Bean
/*     */   {
/*     */     public static class MacroProdotto
/*     */     {
/*     */       public static final String TIPO_GESTIONI_PATRIMONIALI_IN_FONDI = "GPF";
/*     */       
/*     */       public static final String TIPO_SICAV = "CS";
/*     */       
/*     */       public static final String TIPO_FONDI_DI_DIRITTO_ITALIANO = "FN";
/*     */       
/*     */       public static final String TIPO_FONDI_DI_FONDI = "FNF";
/*     */       
/*     */       public static final String TIPO_FONDI_DI_DIRITTO_LUSSUMBURGHESE = "FNX";
/*     */       
/*     */       public static final String AREA_MO_GESTIONI = "GP";
/*     */       
/*     */       public static final String AREA_MO_ASSICURATIVO = "AS";
/*     */       
/*     */       public static final String AREA_MO_CONTI = "CC";
/*     */       
/*     */       public static final String AREA_MO_SICAV = "CS";
/*     */       
/*     */       public static final String AREA_MO_FONDI = "FN";
/*     */       public static final String AREA_MO_ALTRI_PROD = "AP";
/*     */       public static final String AREA_MO_DOSSIER_TITOLI = "DT";
/*     */       public static final String FONDI_ANIMA = "FNA";
/*     */       public static final String FAMIGLIA_FONDI_RAM = "FNR";
/* 172 */       public static final Integer ID_BNL_INVESTIRE = new Integer(10);
/* 173 */       public static final Integer ID_BNL_BUSSOLA = new Integer(15);
/* 174 */       public static final Integer ID_BNL_GESTIRE = new Integer(14);
/*     */       
/* 176 */       public static final Integer ID_RAM_GPF = new Integer(4);
/* 177 */       public static final Integer ID_RAM_MULTIPARTNER = new Integer(6);
/* 178 */       public static final Integer ID_RAM_FAMIGLIA_FONDI = new Integer(7);
/* 179 */       public static final Integer ID_RAM_GPF_EXCAMI = new Integer(691);
/* 180 */       public static final Integer ID_RAM_GPP_SINTESI = new Integer(688); }
/*     */     public class Cointestazione { public static final String TIPO_COINTESTAZIONE = "C"; public static final String TIPO_MONO_INTESTATARIO = "M"; public static final String TIPO_SQUADRA = "S"; public static final String STATO_EFFETTIVO = "E"; private final CommonConstants.Bean this$0;
/*     */       
/*     */       public Cointestazione(CommonConstants.Bean this$0) {
/* 184 */         this.this$0 = this$0;
/*     */       } }
/*     */     public class Soggetto { public static final String TIPO_PF = "F"; public static final String TIPO_PG = "G"; public static final String TIPO_COINTESTAZIONE = "C"; public static final String ANAGRAFICA_REGOLARE = "REG"; public static final String ANAGRAFICA_IRREGOLARE = "IRR";
/*     */       public static final String ANAGRAFICA_COMPLETA = "COM";
/*     */       public static final String ANAGRAFICA_INCOMPLETA = "INC";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public Soggetto(CommonConstants.Bean this$0) {
/* 192 */         this.this$0 = this$0;
/*     */       } }
/*     */     
/*     */     public class Ruolo {
/*     */       public static final String TIPO_RAPPRESENTANTE_LEGALE = "LR";
/*     */       public static final String TIPO_TUTORE = "T";
/*     */       public static final String PROCURATORE = "P";
/*     */       public static final String ANNULATO = "A";
/*     */       public static final String INSERITO = "I";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public Ruolo(CommonConstants.Bean this$0) {
/* 204 */         this.this$0 = this$0;
/*     */       }
/*     */     }
/*     */     
/*     */     public class Promotore { public static final String STATO_PROMOTORE_ATTIVO = "A";
/*     */       public static final String STATO_PROMOTORE_CESSATO = "C";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public Promotore(CommonConstants.Bean this$0) {
/* 213 */         this.this$0 = this$0;
/*     */       } }
/*     */     public class SoggettoPrivacy { public static final String CONSENSO = "S"; public static final String NO_CONSENSO = "N";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public SoggettoPrivacy(CommonConstants.Bean this$0) {
/* 219 */         this.this$0 = this$0;
/*     */       } }
/*     */     public class Recapito { public static final String ABITAZIONE = "TL1"; public static final String UFFICIO = "TL2"; public static final String CELLULARE = "CEL"; public static final String FAX = "FAX"; public static final String EMAIL = "EML";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public Recapito(CommonConstants.Bean this$0) {
/* 225 */         this.this$0 = this$0;
/*     */       } }
/*     */     public class Indirizzo { public static final String RESIDENZA = "RES";
/*     */       public static final String DOMICILIO = "DOM";
/*     */       public static final String ELETTO = "ELE";
/*     */       public static final String FISCALE = "FIS";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public Indirizzo(CommonConstants.Bean this$0) {
/* 234 */         this.this$0 = this$0;
/*     */       } }
/*     */     public class ContrattoIndirizzo { public static final String INDIRIZZO_RAM = "COS"; public static final String INDIRIZZO_OTH = "OTH"; public static final String RES = "RES"; public static final String COR = "COR";
/*     */       public static final String VARIATO = "V";
/*     */       public static final String INSERITO = "I";
/*     */       public static final String ANNULLATO = "A";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public ContrattoIndirizzo(CommonConstants.Bean this$0) {
/* 243 */         this.this$0 = this$0;
/*     */       } }
/*     */     public class Contratto { public static final String PAC = "PAC"; public static final String FORWARD_PAC = "FORWARD_PAC";
/*     */       public static final String PIC = "PIC";
/*     */       public static final String FORWARD_PIC = "FORWARD_PIC";
/*     */       public static final String VAP = "VAP";
/*     */       public static final String FORWARD_VAP = "FORWARD_VAP";
/*     */       public static final String PIC_E_PAC = "ENT";
/*     */       public static final String FREQUENZA_MENSILE = "12";
/*     */       public static final String FREQUENZA_ANNUALE = "1";
/*     */       
/*     */       public Contratto(CommonConstants.Bean this$0) {
/* 255 */         this.this$0 = this$0;
/*     */       }
/*     */ 
/*     */       
/*     */       public static final String FREQUENZA_TRIMESTRALE = "4";
/*     */       
/*     */       public static final String FREQUENZA_SEMESTRALE = "2";
/*     */       
/*     */       public static final String FREQUENZA_BIMESTRALE = "6";
/*     */       
/*     */       public static final String FREQUENZA_QUADRIMESTRALE = "3";
/*     */       
/*     */       public static final String STATO_APERTO = "A";
/*     */       
/*     */       public static final String STATO_IN_APERTURA = "a";
/*     */       
/*     */       public static final String STATO_CHIUSO = "C";
/*     */       
/*     */       public static final String STATO_IN_CHIUSURA = "c";
/*     */       
/*     */       public static final String STATO_ATTIVO = "AT";
/*     */       
/*     */       public static final String STATO_LIQUIDATO = "L";
/*     */       
/*     */       public static final String STATO_STORNATO = "S";
/*     */       
/*     */       public static final String COSTANTE = "COSTANTE";
/*     */       
/*     */       public static final String CRESCENTE = "CRESCENTE";
/*     */       
/*     */       public static final String STATO_ALTRI_PRODOTTI_IN_PROPOSTA = "P";
/*     */       
/*     */       public static final String STATO_ALTRI_PRODOTTI_DA_INVIARE = "X";
/*     */       
/*     */       public static final String STATO_ALTRI_PRODOTTI_ANNULLATO = "A";
/*     */       
/*     */       public static final String STATO_ALTRI_PRODOTTI_CHIUSO = "C";
/*     */       
/*     */       public static final String STATO_ALTRI_PRODOTTI_INVIATO = "I";
/*     */       
/*     */       public static final String MACROPRODOTTO_SELEZIONATO = "MACROPRODOTTO_SELEZIONATO";
/*     */       public static final String NUM_CONTRATTO_ESTERNO_SELEZIONATO = "NUM_CONTRATTO_ESTERNO_SELEZIONATO";
/*     */       public static final String NUMERAZIONE_AUTOMATICA = "AUT";
/*     */       public static final String NUMERAZIONE_SEQUENCE = "SEQ";
/*     */       public static final String NUMERAZIONE_ASSEGNATA = "ASS";
/*     */       public static final String NUMERAZIONE_ALGORITMO = "ALG";
/*     */       public static final String NUMERAZIONE_MANUALE = "MAN";
/*     */       public static final String NUMERO_CONTRATTO_NUMERICO = "NUM";
/*     */       public static final String NUMERO_CONTRATTO_ALFANUMERICO = "ALF";
/*     */       private final CommonConstants.Bean this$0; }
/*     */ 
/*     */     
/*     */     public static class Divise
/*     */     {
/*     */       public static final String EURO_ISO = "EUR";
/*     */       public static final String EURO_UIC = "242";
/*     */     }
/*     */     
/*     */     public static class Evidenza
/*     */     {
/*     */       public static final String GRAVITA_BLOCCANTE = "BLO";
/*     */       public static final String GRAVITA_WARNING = "WAR";
/*     */     }
/*     */     
/*     */     public static class Ordine
/*     */     {
/* 321 */       public static final String FILTRO_FREQUENZA_RATE_DEFAULT = new String("1 2 4 12");
/*     */       
/*     */       public static final String TIPO_RICERCA_PROMOTORE_SPLIT = "TIPO_RICERCA_PROMOTORE_SPLIT";
/*     */       
/*     */       public static final String TIPO_RICERCA_PROMOTORE_PRINCIPALE = "TIPO_RICERCA_PROMOTORE_PRINCIPALE";
/* 326 */       public static final Integer BNL_CASH = new Integer(176);
/* 327 */       public static final Integer PRODOTTO_BNL_CASH = new Integer(11);
/* 328 */       public static final Integer FAMIGLIA_FONDI_RAM = new Integer(7);
/* 329 */       public static final Integer RAS_MULTIPARTNER = new Integer(6);
/*     */       
/*     */       public static final String UNSELECT_ERROR_KEY = "it.ras.arco.cp.errori.globale.nessunElementoSelezionatoDaLista";
/*     */       
/*     */       public static final String TOO_SELECT_ERROR_KEY = "it.ras.arco.ordine.errori.intestatari.troppeSelezioni";
/*     */       
/*     */       public static final String DUPLICATED_MAN_ERROR_KEY = "it.ras.arco.ordine.nuovaSottoscrizione.errori.intestatariDuplicati";
/*     */       
/*     */       public static final String DONT_ADD_COINT_KEY = "it.ras.arco.ordine.errori.intestatari.impossibileAggiungereCoint";
/*     */       
/*     */       public static final String DONT_BUILD_COINT_PG = "it.ras.arco.ordine.errori.intestatari.impossibileCreareCointestazioniPG";
/*     */       
/*     */       public static final String UNSELECT_COMBO_KEY = "it.ras.arco.ordine.disposizionePagamento.errori.unselectTipoPresentatore";
/*     */       
/*     */       public static final String UNSELECT_TEAM = "it.ras.arco.ordine.disposizionePagamento.errori.unselectTeam";
/*     */       
/*     */       public static final String COINTESTATARIO = "Cointestatario";
/*     */       
/*     */       public static final String ALTRO_SOGGETTO = "Altro Soggetto";
/*     */       
/*     */       public static final String CONTRATTO_SENZA_ORDINE_PRIMA_SOTT = "it.ras.arco.ordine.aggiuntivo.errori.NessunOrdinePrimaSottoscrizionePerContratto";
/*     */       
/*     */       public static final String CONTRATTO_SENZA_ORDINE = "it.ras.arco.ordine.aggiuntivo.errori.NussunOrdinePerContratto";
/*     */       public static final String CONTRATTO_CON_COINTESTATARI_DIFFERENTI = "it.ras.arco.ordine.aggiuntivo.errori.ContrattoConCointestatariDifferenti";
/*     */       public static final String IMPORTO_VERSAMENTO_NON_INSERITO = "it.ras.arco.ordine.aggiuntivo.errori.ImportoVersamentoNonInserito";
/*     */       public static final String CONTRATTO_IN_CHIUSURA = "it.ras.arco.ordine.aggiuntivo.errori.ContrattoInChiusura";
/*     */       public static final String CONTRATTO_XP_CHIUSO = "it.ras.arco.ordine.aggiuntivo.errori.ContrattoXPChiuso";
/*     */       public static final String SELEZIONARE_UN_RICHIEDENTE = "it.ras.arco.ordine.aggiuntivo.errori.SelezionareUnRichiedente";
/*     */       public static final String LOSE_ORDINE_WARNING = "it.ras.arco.ordine.componiSquadra.warning.loseContratti";
/*     */       public static final String LOSE_ORDINE_AND_DISPOSIZIONI_WARNING = "it.ras.arco.ordine.emittente.warning.loseDisposizioniEOrdini";
/*     */       public static final String IMPORTO_VERSAMENTO_MULTIPLO_RATA = "it.ras.arco.ordine.aggiuntivo.errori.ImportoVersamentoMultiploRata";
/*     */       public static final String IMPORTO_VERSAMENTO_LIMITE_MIN_RATA = "it.ras.arco.ordine.aggiuntivo.errori.ImportoVersamentoMinRata";
/*     */       public static final String IMPORTO_VERSAMENTO_LIMITE_MAX_RATA = "it.ras.arco.ordine.aggiuntivo.errori.ImportoVersamentoMaxRata";
/*     */       public static final String NESSUN_ORDINE_RIMBORSO_TOT = "it.ras.arco.ordine.aggiuntivo.errori.NessunOrdineRimborsoTotale";
/*     */       public static final String INSERIRE_IMPORTO_O_PERCENTUALE = "it.ras.arco.ordine.sottoscrizione.errori.InserireImportoOPercentuale";
/*     */       public static final String COMPARTO_NON_SELEZIONATO = "it.ras.arco.ordine.sottoscrizione.errori.CompartoNonSelezionato";
/*     */       public static final String SELEZIONARE_CLASSE_E_COMPARTO = "it.ras.arco.ordine.sottoscrizione.errori.SelezionareClasseEComparto";
/*     */       public static final String PERCENTUALE_NO_CENTO = "it.ras.arco.ordine.sottoscrizione.errori.PercentualeNoCento";
/*     */       public static final String IMPORTO_TOTALE_ERRATO = "it.ras.arco.ordine.sottoscrizione.errori.ImportoTotaleErrato";
/*     */       public static final String IMPORTO_TOTALE_NON_INSERITO = "it.ras.arco.ordine.sottoscrizione.errori.ImportoTotaleNonInserito";
/*     */       public static final String SCONTO_ERRATO = "it.ras.arco.ordine.nuovaSottoscrizione.errori.scontoDiContrattoNonAmmesso";
/*     */       public static final String INSERIRE_TUTTO_IN_IMPORTO_O_PERCENTUALE = "it.ras.arco.ordine.sottoscrizione.errori.InserireTuttoInImportoOPercentuale";
/*     */       public static final String INSERIRE_ORDINE = "it.ras.arco.ordine.sottoscrizione.errori.InserireOrdine";
/*     */       public static final String COMPARTO_GIA_SELEZIONATO = "it.ras.arco.ordine.sottoscrizione.errori.CompartoGiaSelezionato";
/*     */       public static final String INSERIRE_SOLO_PERCENTUALE = "it.ras.arco.ordine.sottoscrizione.errori.InserireSoloPercentuale";
/*     */       public static final String CONTROLLO_ADEGUATEZZA_BLOCCANTE = "it.ras.arco.ordine.sottoscrizione.errori.ControlloAdeguatezzaBloccante";
/*     */       public static final String NESSUNA_LIBERATORIA = "it.ras.arco.ordine.sottoscrizione.errori.NessunaLiberatoria";
/*     */       public static final String CASH_IN = "CI";
/*     */       public static final String CASH_OUT = "CO";
/*     */       public static final String CAMBIO_LINEA = "CL";
/*     */       public static final String CERTC = "C";
/*     */       public static final String CERTN = "N";
/*     */       public static final String CERTP = "P";
/*     */       public static final String CONSD = "D";
/*     */       public static final String CONSC = "C";
/*     */       public static final String CONSB = "B";
/*     */       public static final String AUTORIZZATO = "A";
/*     */       
/*     */       public static class AltriProdotti
/*     */       {
/* 389 */         public static final Integer MUT_ID = new Integer(703);
/* 390 */         public static final Integer PRE_ID = new Integer(704);
/* 391 */         public static final Integer JOL_ID = new Integer(39);
/* 392 */         public static final Integer LEA_ID = new Integer(743);
/* 393 */         public static final Integer ATT_FIN_PRESTITI_ID = new Integer(2448);
/*     */       }
/*     */       
/*     */       public static class Causali { public static final String SOTTOSCRIZIONE = "100";
/*     */         public static final String AGGIUNTIVO = "102";
/*     */         public static final String INIZIATIVA = "I";
/*     */         public static final String RIMBORSO_PERIODICO = "330";
/*     */         public static final String REVOCA_RIMBORSO_PERIODICO = "331";
/*     */         public static final String RIMBORSO_PARZIALE = "530";
/*     */         public static final String RIMBORSO_TOTALE = "500";
/*     */         public static final String RID = "430";
/*     */         public static final String REVOCA_RID = "431";
/*     */         public static final String SWITCH_IN = "130";
/*     */         public static final String SWITCH_OUT = "830";
/*     */         public static final String PASSAGGIO_PARZIALE_IN = "130";
/*     */         public static final String PASSAGGIO_TOTALE_IN = "140";
/*     */         public static final String PASSAGGIO_SCHEDULATO_IN = "150";
/*     */         public static final String EASY_PLAN_IN = "160";
/*     */         public static final String CAMBIO_LINEA_PARZIALE_IN = "170";
/*     */         public static final String CAMBIO_LINEA_TOTALE_IN = "180";
/*     */         public static final String PASSAGGIO_PARZIALE_OUT = "830";
/*     */         public static final String PASSAGGIO_TOTALE_OUT = "840";
/*     */         public static final String PASSAGGIO_SCHEDULATO_OUT = "850";
/*     */         public static final String EASY_PLAN_OUT = "860";
/*     */         public static final String CAMBIO_LINEA_PARZIALE_OUT = "870";
/*     */         public static final String CAMBIO_LINEA_TOTALE_OUT = "880";
/*     */         public static final String STORNO_MOVIMENTO = "772";
/*     */         public static final String STORNO_SOTTOSCRIZIONE = "771"; }
/*     */       
/*     */       public static class Tipo {
/*     */         public static final String CARICO_MANUALE = "CMN";
/*     */         public static final String SCARICO_MANUALE = "SMN";
/*     */         public static final String TIPO_ORDINE_FITTIZIO = "000";
/*     */       }
/*     */     }
/*     */     
/*     */     public static class Movimento { public static class Causali { public static final String CARICO_CAMBIO_COLLOCATORE = "139";
/*     */         public static final String CARICO_SUCCESSIONE = "138";
/*     */         public static final String CARICO_RIASSEGNAZIONE = "302";
/*     */         public static final String CARICO_GENERICO = "278";
/*     */         public static final String SCARICO_GENERICO = "663";
/*     */         public static final String SCARICO_CAMBIO_COLLOCATORE = "721";
/*     */         public static final String SCARICO_SUCCESSIONE = "720";
/*     */         public static final String SCARICO_RIASSEGNAZIONE = "750";
/*     */         public static final String RIMBORSO = "602";
/*     */         public static final String AGGIUNTIVO = "228";
/*     */         public static final String SWITCH_IN = "401";
/*     */         public static final String SWITCH_OUT = "811";
/*     */         public static final String SOTTOSCRIZIONE = "100";
/*     */         public static final String STORNO_MOVIMENTO = "772";
/*     */         public static final String STORNO_SOTTOSCRIZIONE = "771";
/*     */         public static final String TIPO_AGGIUNTIVO = "AGG";
/*     */         public static final String TIPO_RIMBORSO = "RP"; } }
/*     */     
/*     */     public class Emittente { public static final int PANTERA = 1;
/*     */       public static final int ANT = 2;
/*     */       public static final int ALLIANZ_SUBALPINA_2 = 3;
/*     */       public static final int ANIMA_SGR = 4;
/*     */       public static final int BNL_GESTIONI_SGR = 5;
/*     */       public static final int BNL_GLOBAL_FUNDS = 6;
/*     */       public static final int DARTA_INVESTMENT_FUNDS_PLC = 7;
/*     */       public static final int INVESCO = 8;
/*     */       public static final int JANUS_WORLD_FUNDS_PLC = 9;
/*     */       public static final int JP_MORGAN_FUNDS = 10;
/*     */       public static final int MELLON_GLOBAL_FUNDS_PLC = 11;
/*     */       public static final int MERRILL_LYNCH_INTERNATIONAL_INVESTMENT_FUNDS_PLC = 12;
/*     */       public static final int MORGAN_STANLEY_SICAV = 13;
/*     */       
/*     */       public Emittente(CommonConstants.Bean this$0) {
/* 462 */         this.this$0 = this$0;
/*     */       }
/*     */       
/*     */       public static final int RAM = 14;
/*     */       public static final int GP_RAM = 30;
/*     */       public static final int RAS = 15;
/*     */       public static final int RASBANK = 16;
/*     */       public static final int ARCOBALENO_FUND_SICAV = 20;
/*     */       public static final int JP_MORGAN_INVESTMENT_FUNDS = 23;
/*     */       public static final int BNL_NAS = 24;
/*     */       public static final int BNL_FONDI_IMMOBILIARI = 25;
/*     */       public static final int BNL = 27;
/*     */       public static final int PICTET = 90;
/*     */       public static final int FIDELITY = 89;
/*     */       public static final int RB_VITA = 17;
/*     */       public static final int SCHRODER_INVESTMENT_MANAGEMENT_LUXEMBOURG = 649;
/*     */       private final CommonConstants.Bean this$0; }
/*     */     
/*     */     public class Prodotto {
/*     */       public static final String SICAV = "CS";
/*     */       public static final String FONDI_DI_DIRITTO_ITALIANO = "FN";
/*     */       public static final String FONDI_DI_FONDI = "FNF";
/*     */       public static final String FONDI_DI_DIRITTO_LUSSUMBURGHESE = "FNX";
/*     */       public static final String GESTIONI_PATRIMONIALI_FINANZIARIE = "GP";
/*     */       public static final String ALTRI_PRODOTTI = "AL";
/*     */       public static final String POLIZZE_TRADIZIONALI = "FX";
/*     */       public static final String POLIZZE_INDEX_LINKED = "FT";
/*     */       public static final String POLIZZE_UNIT_LINKED = "FU";
/*     */       public static final String DOSSIER_TITOLI = "DT";
/*     */       public static final String RICERCA_SINGOLA_POSITIVO = "S";
/*     */       public static final String RICERCA_SINGOLA_NEGATIVO = "N";
/*     */       public static final int RAS_MONETARIO = 759;
/*     */       
/*     */       public Prodotto(CommonConstants.Bean this$0) {
/* 496 */         this.this$0 = this$0;
/*     */       }
/*     */ 
/*     */       
/*     */       public static final int RAS_LIQUIDITA_A = 753;
/*     */       
/*     */       public static final int RAS_LIQUIDITA_B = 754;
/*     */       
/*     */       public static final int RAS_CEDOLA_L = 731;
/*     */       
/*     */       public static final int RAS_CEDOLA_T = 732;
/*     */       
/*     */       public static final int RAS_MULTI_20 = 760;
/*     */       
/*     */       public static final int SINTESI_MAGGIO_2005 = 92;
/*     */       
/*     */       public static final int SINTESI_MONETARIA_EURO = 16250;
/*     */       
/*     */       public static final int DOSSIER_TITOLI_ID = 43;
/*     */       
/*     */       public static final int ANIMA_LIQUIDITA = 166;
/*     */       
/*     */       public static final String TUTTI_PRODOTTI_DESC = "Tutti i prodotti";
/*     */       
/*     */       public static final int TUTTI_PRODOTTI_ID = -2;
/*     */       
/*     */       public static final String DEFAULT_CODICE_MERCATO_DT = "IT NQ";
/*     */       
/*     */       private final CommonConstants.Bean this$0;
/*     */     }
/*     */ 
/*     */     
/*     */     public static class Sottoscrizione
/*     */     {
/*     */       public static final String TIPO_CARICO = "CARICO";
/*     */       
/*     */       public static final String TIPO_PASSAGGI_PARZIALI = "PASSAGGI_PARZIALI";
/*     */       
/*     */       public static final String TIPO_PASSAGGI_TOTALI = "PASSAGGI_TOTALI";
/*     */       
/*     */       public static final String TIPO_RATA_PAC = "RATA_PAC";
/*     */       
/*     */       public static final String TIPO_RIMBORSO_PARZIALE = "RIMBORSO_PARZIALE";
/*     */       
/*     */       public static final String TIPO_RIMBORSO_TOTALE = "RIMBORSO_TOTALE";
/*     */       
/*     */       public static final String TIPO_SOTTOSCRIZIONI_RAM = "SOTTOSCRIZIONI_RAM";
/*     */       public static final String TIPO_SOTTOSCRIZIONI_INIZIALI = "SOTTOSCRIZIONI_INIZIALI";
/*     */       public static final String TIPO_VERSAMENTI_AGGIUNTIVI = "VERSAMENTI_AGGIUNTIVI";
/*     */       public static final String TIPO_VARIAZIONE_INDIRIZZO = "MCC";
/*     */       public static final String TIPO_OPERAZIONE_T = "MPP";
/*     */       public static final String TIPO_SOTTOSCRIZIONE_ASS = "SCA";
/*     */       public static final String MODALITA_PIC = "PIC";
/*     */       public static final String MODALITA_PAC = "PAC";
/*     */       public static final String FORWARD_APPROVATA = "APPROVATA";
/*     */       public static final String FORWARD_INVIATA = "INVIATA";
/*     */       public static final String STATO_APPROVATO = "A";
/*     */       public static final String STATO_INVIATA = "I";
/*     */       public static final String STATO_SCARTATA = "F";
/*     */       public static final String STATO_CANCELLATA = "K";
/*     */       public static final String STATO_SOSPESO = "S";
/*     */       public static final String STATO_INESEGUTA = "N";
/*     */       public static final String STATO_ESEGUITA = "E";
/*     */       public static final String STATO_STORNATA = "X";
/*     */       public static final String STATO_IN_LAVORAZIONE_PF = "L";
/*     */       public static final String STATO_CONFERMATA_PF = "P";
/*     */       public static final String STATO_CONFERMATA_MO = "M";
/*     */       public static final String STATO_IN_SOSPESO_PRESSO_MO = "W";
/*     */       public static final String STATO_REVOCATO_MO = "Y";
/*     */       public static final String STATO_ANNULLATO_PF = "J";
/*     */       public static final String SOLO_ORDINI_NUOVI = "S";
/*     */       public static final String SOLO_ORDINI_AGGIUNTIVI = "A";
/*     */       public static final String ORDINI_NUOVI_E_AGGIUNTIVI = "M";
/*     */       public static final String ORDINI_ALTRA_NATURA = "X";
/*     */       public static final String MOVIMENTI_ESEGUITI = "MOVIMENTI_ESEGUITI";
/*     */       public static final String MOVIMENTI_INIZIATIVA = "MOVIMENTI_INIZIATIVA";
/*     */       public static final String SOTTOSCRIZIONE = "SOT";
/*     */       public static final String SOTT_SERVIZI_AGG = "ASA";
/*     */       public static final String VAR_SERVIZI_AGG = "VSA";
/*     */       public static final String REV_SERVIZI_AGG = "RSA";
/*     */       public static final String TIPO_SOTTOSCRIZIONE_PASSAGGIO = "PSO";
/*     */       public static final String TIPO_SOTTOSCRIZIONE_RIMBORSO = "RSO";
/*     */       public static final String TIPO_MODIFICA_CONTRATTO = "MCO";
/*     */       public static final String TIPO_CARICO_SCARICO = "CSS";
/*     */       public static final String TIPO_MODIFICA_SOGGETTI = "MSQ";
/*     */       public static final String TIPO_SOTTOSCRIZIONE_MOVIMENTI_INIZATIVA = "MDI";
/*     */       public static final String TIPO_MODIFICA_CEDOLA = "MCD";
/*     */       public static final String TIPO_SOTTOSCRIZIONE_DIP = "D";
/*     */       public static final String TIPO_DIP_EX_ANTE = "A";
/*     */       public static final String TIPO_DIP_EX_POST = "P";
/*     */       public static final String TIPO_DIP_ERROR = "E";
/*     */       public static final String MANDATI = "01";
/*     */       public static final String COINTESTAZIONE_E_RUOLO = "03";
/*     */       public static final String VARIAZIONE_INDIRIZZO_CORRISPONDENZA = "04";
/*     */       public static final String VARIAZIONE_ANAGRAFICA = "05";
/*     */     }
/*     */     
/*     */     public static class Posizione
/*     */     {
/*     */       public static final String DOSSIER_TITOLI = "DT";
/*     */       public static final String LIQUIDITA = "LIQ";
/*     */       public static final String FLAG_FOL = "R";
/*     */       public static final String STATO_APERTO = "A";
/*     */       public static final String STATO_IN_APERTURA = "a";
/*     */       public static final String STATO_CHIUSO = "C";
/*     */       public static final String STATO_IN_CHIUSURA = "c";
/*     */     }
/*     */     
/*     */     public class RegoleSwitch
/*     */     {
/*     */       public static final String TIPO_CONTRATTO_PAC = "PAC";
/*     */       public static final String TIPO_CONTRATTO_PIC = "PIC";
/*     */       public static final String TIPO_CONTRATTO_CONTOMAT = "CMAT";
/*     */       public static final String TIPO_CONTRATTO_CONTOPAC = "CPAC";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public RegoleSwitch(CommonConstants.Bean this$0) {
/* 613 */         this.this$0 = this$0;
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     public static final class ServiziAggiuntivi
/*     */     {
/*     */       public static final String RID = "RID";
/*     */       
/*     */       public static final String ABBINAMENTO_PREMI = "ABP";
/*     */       
/*     */       public static final String EASY_PLAN = "ESP";
/*     */       
/*     */       public static final String RIMBORSO_PROGRAMMATO = "RMP";
/*     */       public static final String ABBINAMENTO_POLIZZA = "POL";
/*     */       public static final String TRASFERIMENTO_PROGRAMMATO = "TRP";
/*     */       public static final String CONTOMAT = "CMT";
/*     */       public static final String CONTOPAC = "CPC";
/*     */       public static final String STATO_ATTIVO = "A";
/*     */       public static final String STATO_IN_ATTIVIVAZIONE = "a";
/*     */       public static final String STATO_REVOCATO = "R";
/*     */       public static final String STATO_IN_REVOCA = "r";
/*     */       public static final String FOL = "FOL";
/*     */       public static final String SMART_MENU = "SMN";
/*     */       public static final String DEFAULT_CAUSALE_EASY_PLAN = "110";
/*     */     }
/*     */     
/*     */     public static class Parametri
/*     */     {
/* 642 */       public static final Integer AMMESSA_MODIFICA_MEZZO_DI_PAGAMENTO_PIANO_PAC = new Integer(157);
/* 643 */       public static final Integer AMMESSA_MODIFICA_IMPORTO_RATA = new Integer(158);
/* 644 */       public static final Integer AMMESSA_MODIFICA_FREQUENZA = new Integer(159);
/* 645 */       public static final Integer AMMESSA_MODIFICA_NUMERO_RATE_TOTALI = new Integer(160);
/* 646 */       public static final Integer AMMESSA_MODIFICA_PRESENTATORE = new Integer(161);
/* 647 */       public static final Integer AMMESSA_MODIFICA_COMPOSIZIONE_RATA_DEL_PIANO_PAC = new Integer(162);
/*     */       
/* 649 */       public static final Integer AMMESSI_MEZZI_DI_PAGAMENTO_MULTIPLI_PER_VERSAMENTI = new Integer(49);
/*     */ 
/*     */       
/* 652 */       public static final Integer BLOCCO_DEL_PRODOTTO = new Integer(26);
/*     */       
/* 654 */       public static final Integer CODICE_CONTRATTO_IN_APERTURA = new Integer(7);
/* 655 */       public static final Integer CONTROLLI_ADEGUATEZZA_BLOCCANTI = new Integer(24);
/* 656 */       public static final Integer CONTROLLO_CHE_SULLA_DISPOSIZIONE_TUTTI_I_MANDATI_SIANO_DELLO_STESSO_PROMOTORE = new Integer(99);
/*     */       
/* 658 */       public static final Integer DATA_INIZIO_ADESIONE = new Integer(119);
/* 659 */       public static final Integer DATA_FINE_ADESIONE = new Integer(120);
/*     */       
/* 661 */       public static final Integer DENOMINAZIONE_BANCA_CORRISPONDENTE = new Integer(1);
/*     */       
/* 663 */       public static final Integer DIVISE_ACCETTATE_DAL_COLLOCATORE_PER_CONFERIMENTI = new Integer(54);
/*     */       
/* 665 */       public static final Integer FREQUENZA_RATE = new Integer(86);
/*     */       
/* 667 */       public static final Integer IBAN_SU_SOTTOSCRIZIONI = new Integer(212);
/* 668 */       public static final Integer IBAN_SU_RATA_PAC = new Integer(224);
/* 669 */       public static final Integer IBAN_SU_PROVENTI = new Integer(227);
/* 670 */       public static final Integer IBAN_SUI_RIMBORSI = new Integer(223);
/*     */       
/* 672 */       public static final Integer IMPORTO_AGGIUNTIVO_VERSAMENTO_EURO = new Integer(106);
/* 673 */       public static final Integer IMPORTO_AGGIUNTIVO_VERSAMENTO_DIVISA = new Integer(107);
/*     */       
/* 675 */       public static final Integer IMPORTO_MINIMO_PRIMO_VERSAMENTO_DIVISA = new Integer(107);
/* 676 */       public static final Integer IMPORTO_MINIMO_PRIMO_VERSAMENTO_EURO = new Integer(106);
/*     */       
/* 678 */       public static final Integer IMPORTO_RESIDUO_MIN_PER_RIMBORSI = new Integer(51);
/*     */       
/* 680 */       public static final Integer LIMITE_ALTRO_COMPARTO_SU_CONTRATTO_APERTO = new Integer(66);
/* 681 */       public static final Integer LIMITE_MINIMO_CAMBIO_LINEA_IN = new Integer(136);
/* 682 */       public static final Integer LIMITE_MINIMO_PRIMO_VERSAMENTO_IN_PERC_SUL_PIANO = new Integer(138);
/* 683 */       public static final Integer LIMITE_MINIMO_SOTT_INIZIALE_PIC_EURO = new Integer(139);
/* 684 */       public static final Integer LIMITE_MINIMO_SOTT_INIZIALE_CONTRATTO_PIC_DIVISA = new Integer(60);
/* 685 */       public static final Integer LIMITE_MINIMO_SOTT_INIZIALE_CONTRATTO_PIC_EURO = new Integer(61);
/* 686 */       public static final Integer LIMITE_MINIMO_SOTT_INIZIALE_PIC_DIVISA = new Integer(100);
/* 687 */       public static final Integer LIMITE_MINIMO_SOTT_INIZIALE_COMPARTO_PIC_EURO = new Integer(59);
/* 688 */       public static final Integer LIMITE_MINIMO_SOTT_INIZIALE_COMPARTO_PIC_DIVISA = new Integer(58);
/* 689 */       public static final Integer LIMITE_MINIMO_VERSAMENTO_SUCCESSIVO_PIC_DIVISA = new Integer(102);
/* 690 */       public static final Integer LIMITE_MINIMO_VERSAMENTO_SUCCESSIVO_PIC_EURO = new Integer(103);
/* 691 */       public static final Integer LIMITE_MINIMO_VERSAMENTO_SUCCESSIVO_COMPARTO_PIC_EURO = new Integer(63);
/* 692 */       public static final Integer LIMITE_MINIMO_VERSAMENTO_SUCCESSIVO_COMPARTO_PIC_DIVISA = new Integer(62);
/* 693 */       public static final Integer LIMITE_MINIMO_VERSAMENTO_SUCCESSIVO_CONTRATTO_PIC_EURO = new Integer(65);
/* 694 */       public static final Integer LIMITE_MINIMO_VERSAMENTO_SUCCESSIVO_CONTRATTO_PIC_DIVISA = new Integer(64);
/*     */       
/* 696 */       public static final Integer MAX_NUMERO_COINTESTATARI = new Integer(6);
/* 697 */       public static final Integer MAX_NUMERO_CONTRATTI_PAC_PER_SQUADRA = new Integer(5);
/* 698 */       public static final Integer MAX_NUMERO_CONTRATTI_PIC_PER_SQUADRA = new Integer(4);
/*     */ 
/*     */       
/* 701 */       public static final Integer MAX_ORDINI_RIMBORSI_RAM = new Integer(8);
/*     */       
/* 703 */       public static final Integer MEZZI_PAGAMENTO_AGGIUNTIVO_PAC = new Integer(15);
/* 704 */       public static final Integer MEZZI_PAGAMENTO_AGGIUNTIVO_PIC = new Integer(14);
/* 705 */       public static final Integer MEZZI_PAGAMENTO_AMMESSI_PER_RATA_PAC = new Integer(16);
/* 706 */       public static final Integer MEZZI_PAGAMENTO_SOTTOSCRIZIONE_PAC = new Integer(13);
/* 707 */       public static final Integer MEZZI_PAGAMENTO_SOTTOSCRIZIONE_PIC = new Integer(12);
/* 708 */       public static final Integer MEZZI_PAGAMENTO_SOTTOSCRIZIONI_RAM = new Integer(11);
/*     */       
/* 710 */       public static final Integer MEZZI_PAGAMENTO_AMMESSI_PER_LIQUIDAZIONI_GPF = new Integer(132);
/*     */       
/* 712 */       public static final Integer MODALITA_DI_SOTTOSCRIZIONE = new Integer(3);
/*     */       
/* 714 */       public static final Integer NUMERO_GG_MASSIMO_FRA_DATA_SOTTOSCRIZIONE_E_DATA_CARICAMENTO = new Integer(98);
/* 715 */       public static final Integer NUMERO_MAX_DI_INVESTIMENTI_PER_DISPOSIZIONE = new Integer(48);
/* 716 */       public static final Integer NUMERO_RATE_PIANO = new Integer(84);
/* 717 */       public static final Integer NUMERO_RATE_PIANO_MENSILE = new Integer(144);
/* 718 */       public static final Integer NUMERO_RATE_PIANO_TRIMESTRALE = new Integer(85);
/*     */       
/* 720 */       public static final Integer PREVISTA_DISTRIBUZIONE_PROVENTI = new Integer(47);
/*     */       
/* 722 */       public static final Integer QUOTE_RESIDUE_MIN_PER_RIMBORSI = new Integer(52);
/*     */       
/* 724 */       public static final Integer RATA_MIN_COMPARTO_MENSILE_PAC_EURO = new Integer(67);
/* 725 */       public static final Integer RATA_MIN_COMPARTO_TRIMESTRALE_PAC_EURO = new Integer(68);
/* 726 */       public static final Integer RATA_MIN_PAC = new Integer(108);
/* 727 */       public static final Integer RATA_MIN_COMPARTO_PAC_DIVISA = new Integer(69);
/* 728 */       public static final Integer RATA_MIN_CONTRATTO_PAC_EURO = new Integer(70);
/* 729 */       public static final Integer RATA_MIN_CONTRATTO_PAC_DIVISA = new Integer(71);
/*     */       
/* 731 */       public static final Integer RATE_VERSAMENTO_AGGIUNTIVO_MAX_DIVISA = new Integer(83);
/* 732 */       public static final Integer RATE_VERSAMENTO_AGGIUNTIVO_MAX_EURO = new Integer(79);
/* 733 */       public static final Integer RATE_VERSAMENTO_AGGIUNTIVO_MIN_DIVISA = new Integer(82);
/* 734 */       public static final Integer RATE_VERSAMENTO_AGGIUNTIVO_MIN_EURO = new Integer(78);
/* 735 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MAX_DIVISA = new Integer(81);
/* 736 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MAX_EURO = new Integer(110);
/* 737 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MIN_DIVISA = new Integer(80);
/* 738 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MIN_EURO = new Integer(109);
/* 739 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MIN_MENSILE_EURO = new Integer(74);
/* 740 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MIN_TRIMESTRALE_EURO = new Integer(75);
/* 741 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MAX_MENSILE_EURO = new Integer(76);
/* 742 */       public static final Integer RATE_VERSAMENTO_INIZIALE_MAX_TRIMESTRALE_EURO = new Integer(77);
/*     */       
/* 744 */       public static final Integer RIMBORSI_BENEFICIARIO_TERZO = new Integer(8);
/*     */       
/* 746 */       public static final Integer TIPO_NUMERAZIONE_CONTRATTI = new Integer(20);
/* 747 */       public static final Integer TIPO_NUMERAZIONE_NUMERICA_ALFANUMERICA = new Integer(21);
/*     */       
/* 749 */       public static final Integer VALORE_MIN_COMPLESSIVO_DEL_PIANO_DIVISA = new Integer(105);
/* 750 */       public static final Integer VALORE_MIN_COMPLESSIVO_DEL_PIANO_EURO = new Integer(104);
/*     */       
/* 752 */       public static final Integer VERSAMENTO_RIMBORSO_PARZIALE_AMMESSO_GPF = new Integer(133);
/* 753 */       public static final Integer VERSAMENTO_RIMBORSO_TOTALE_AMMESSO_GPF = new Integer(134);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 761 */       public static final Integer ALIQUOTE_MAX_PER_CAMBIO_LINEA = new Integer(164);
/* 762 */       public static final Integer ALIQUOTE_MIN_PER_CAMBIO_LINEA = new Integer(163);
/*     */       
/* 764 */       public static final Integer ALIQUOTE_MIN_PRIMO_SCAGLIONE = new Integer(149);
/* 765 */       public static final Integer ALIQUOTE_MIN_SECONDO_SCAGLIONE = new Integer(150);
/* 766 */       public static final Integer ALIQUOTE_MIN_TERZO_SCAGLIONE = new Integer(151);
/*     */       
/* 768 */       public static final Integer ALIQUOTE_MAX_PRIMO_SCAGLIONE = new Integer(152);
/* 769 */       public static final Integer ALIQUOTE_MAX_SECONDO_SCAGLIONE = new Integer(153);
/* 770 */       public static final Integer ALIQUOTE_MAX_TERZO_SCAGLIONE = new Integer(154);
/*     */       
/* 772 */       public static final Integer CAMBIO_LINEA_AMMESSO = new Integer(135);
/* 773 */       public static final Integer CARICHI_AMMESSI = new Integer(43);
/*     */       
/* 775 */       public static final Integer LIMITE_MINIMO_PROTEZIONE_CAPITALE = new Integer(155);
/* 776 */       public static final Integer LIMITE_MINIMO_DI_LIQUIDAZIONE = new Integer(156);
/*     */       
/* 778 */       public static final Integer MEZZI_PAGAM_MULTIPLI_AMMESSI_RIMBORSO = new Integer(50);
/* 779 */       public static final Integer MEZZI_PAGAM_AMMESSI_PRELIEVI_PARZIALI = new Integer(112);
/* 780 */       public static final Integer MEZZI_PAGAM_PER_LIQUIDAZIONI_GPF = new Integer(113);
/* 781 */       public static final Integer MEZZI_PAGAM_AMMESSI_PER_RIMBORSO = new Integer(17);
/*     */       
/* 783 */       public static final Integer PARAMETRO_RIMBORSI_PER_IMPORTO = new Integer(9);
/*     */       
/* 785 */       public static final Integer PARAM_ABI_CONTO_AFFLUSSI = new Integer(27);
/* 786 */       public static final Integer PARAM_CAB_CONTO_AFFLUSSI = new Integer(28);
/* 787 */       public static final Integer PARAM_CC_CONTO_AFFLUSSI = new Integer(29);
/*     */       
/* 789 */       public static final Integer RATE_PAC_AMMESSE = new Integer(36);
/*     */       
/* 791 */       public static final Integer RIMBORSI_PASSAGGI_PARZIALI_AMMESSI = new Integer(37);
/* 792 */       public static final Integer RIMBORSI_PASSAGGI_TOTALI_AMMESSI = new Integer(38);
/* 793 */       public static final Integer RIMBORSI_PROGRAMMATI_AMMESSI = new Integer(45);
/* 794 */       public static final Integer RIMBORSI_TOTALE_PAC_CHIUDEPIANO = new Integer(53);
/*     */       
/* 796 */       public static final Integer SCARICHI_AMMESSI = new Integer(44);
/* 797 */       public static final Integer SCONTI_AMMESSI_PER_CAMBIO_LINEA = new Integer(137);
/* 798 */       public static final Integer SCONTI_AMMESSI_PER_CARICO = new Integer(87);
/* 799 */       public static final Integer SCONTI_AMMESSI_PER_PASSAGGI_PARZIALI = new Integer(95);
/* 800 */       public static final Integer SCONTI_AMMESSI_PER_PASSAGGI_TOTALI = new Integer(96);
/* 801 */       public static final Integer SCONTI_AMMESSI_PER_RATA_PAC = new Integer(92);
/* 802 */       public static final Integer SCONTI_AMMESSI_PER_RIMBORSO_PARZIALE = new Integer(93);
/* 803 */       public static final Integer SCONTI_AMMESSI_PER_RIMBORSO_TOTALE = new Integer(94);
/* 804 */       public static final Integer SCONTI_AMMESSI_PER_SOTTOSCRIZIONI_RAM = new Integer(87);
/* 805 */       public static final Integer SCONTI_AMMESSI_PER_SOTTOSCRIZIONI_INIZIALI_PIC = new Integer(88);
/* 806 */       public static final Integer SCONTI_AMMESSI_PER_SOTTOSCRIZIONI_INIZIALI_PAC = new Integer(89);
/* 807 */       public static final Integer SCONTI_AMMESSI_PER_VERSAMENTI_AGGIUNTIVI_PIC = new Integer(90);
/* 808 */       public static final Integer SCONTI_AMMESSI_PER_VERSAMENTI_AGGIUNTIVI_PAC = new Integer(91);
/* 809 */       public static final Integer SCONTI_AMMESSI_SWITCH = new Integer(97);
/* 810 */       public static final Integer SCONTO_MANDATO_PIC_AMMESSO = new Integer(146);
/* 811 */       public static final Integer SCONTO_MANDATO_PAC_AMMESSO = new Integer(147);
/* 812 */       public static final Integer SCONTO_SQUADRA_AMMESSO = new Integer(145);
/*     */       
/* 814 */       public static final Integer BLOCCO_DATI_SU_INIZIALE_AGGIUNTIVO = new Integer(208);
/* 815 */       public static final Integer BLOCCO_DATI_SU_AGGIUNTIVO = new Integer(209);
/* 816 */       public static final Integer BLOCCO_DATI_PER_RIMBORSO = new Integer(210);
/* 817 */       public static final Integer BLOCCO_DATI_PER_TRASFERIMENTO = new Integer(211);
/* 818 */       public static final Integer GESTIONE_VISUALIZZAZIONE_IBAN_CAB = new Integer(212);
/* 819 */       public static final Integer CONTROLLO_MEZZI_PAGAMENTO_EX_ANTE = new Integer(221);
/* 820 */       public static final Integer CONTROLLO_CUT_OF_FORMALE = new Integer(213);
/* 821 */       public static final Integer SQUADRA_CON_MANADATI_ATTIVI_RAM = new Integer(216);
/* 822 */       public static final Integer SQAUDRA_CON_COINTESTATARIO_SENZA_CONTRATTI = new Integer(217);
/* 823 */       public static final Integer SQUDRA_SENZA_CONTRATTI__COIONTESTATARI_CON_CONTRATTI = new Integer(219);
/* 824 */       public static final Integer BLOCCO_OPERATIVITA_DIP = new Integer(214);
/*     */       
/* 826 */       public static final Integer SE_ATTIVARE_CONTROLLI_LIM_MIN_PER_SWITCH_IN = new Integer(57);
/*     */       
/* 828 */       public static final Integer SOTTOSCRIZIONI_INIZIALI_PIC_AMMESSE = new Integer(32);
/* 829 */       public static final Integer SOTTOSCRIZIONI_INIZIALI_PAC_AMMESSE = new Integer(33);
/* 830 */       public static final Integer SOTTOSCRIZIONI_SU_CLASSI_DI_AZIONI_DIVERSE = new Integer(148);
/*     */       
/* 832 */       public static final Integer SWITCH_IN_INIZIALI_AMMESSI = new Integer(39);
/* 833 */       public static final Integer SWITCH_IN_SUCCESSIVI_AMMESSI = new Integer(40);
/* 834 */       public static final Integer SWITCH_OUT_PARZIALI_AMMESSI = new Integer(41);
/* 835 */       public static final Integer SWITCH_OUT_TOTALI_AMMESSI = new Integer(42);
/* 836 */       public static final Integer SWITCH_PER_IMPORTO = new Integer(10);
/*     */       
/* 838 */       public static final Integer TIPOLOGIE_RIMBORSI_PROGRAMMATI_AMMESSI = new Integer(46);
/*     */       
/* 840 */       public static final Integer VERSAMENTI_AGGIUNTIVI_PAC_AMMESSI = new Integer(35);
/* 841 */       public static final Integer VERSAMENTI_AGGIUNTIVI_PIC_AMMESSI = new Integer(34);
/*     */       
/* 843 */       public static final Integer INCREMENTO_IMPORTO_RATA_EURO = new Integer(72);
/* 844 */       public static final Integer INCREMENTO_IMPORTO_RATA_DIVISA = new Integer(73);
/*     */       
/* 846 */       public static final Integer NUM_MAX_COMPARTI_PAC = new Integer(163);
/*     */       
/* 848 */       public static final Integer LIMITE_EXTRAPAC = new Integer(164);
/*     */ 
/*     */ 
/*     */       
/* 852 */       public static final Integer COMMISSIONI_DI_CAMBIO_LINEA = new Integer(125);
/* 853 */       public static final Integer SOGLIA_MINIMA_SOTTOSCRIZIONE = new Integer(100);
/* 854 */       public static final Integer IMPORTO_MINIMO_VERS_AGGIUNTIVI = new Integer(103);
/* 855 */       public static final Integer VERSAMENTI_AGGIUNTIVI_GP_AMMESSI = new Integer(34);
/*     */       
/* 857 */       public static final Integer NUMERO_RATE_MINIME_SU_PIANO_60_RATE = new Integer(150);
/* 858 */       public static final Integer NUMERO_RATE_MINIME_SU_PIANO_120_RATE = new Integer(151);
/* 859 */       public static final Integer NUMERO_RATE_MINIME_SU_PIANO_180_RATE = new Integer(152);
/* 860 */       public static final Integer NUMERO_RATE_MINIME_SU_PIANO_360_RATE = new Integer(153); }
/*     */     public class Blocchi { public static final String TIPO_BLOCCO_OPERATIVO = "O"; public static final String TIPO_BLOCCO_QUOTE = "Q"; public static final String TIPO_OPERAZIONE_BLOCCATA_QUOTE_MO = "MO"; public static final String TIPO_OPERAZIONE_BLOCCATA_OPERATIVA_MO = "MO"; private final CommonConstants.Bean this$0;
/*     */       
/*     */       public Blocchi(CommonConstants.Bean this$0) {
/* 864 */         this.this$0 = this$0;
/*     */       } }
/*     */     public class AttivitaFinanziaria { public static final String CLASSE_L = "L";
/*     */       public static final String CLASSE_T = "T";
/*     */       public static final String CLASSE_A = "A";
/*     */       public static final String CLASSE_B = "B";
/*     */       private final CommonConstants.Bean this$0;
/*     */       
/*     */       public AttivitaFinanziaria(CommonConstants.Bean this$0) {
/* 873 */         this.this$0 = this$0;
/*     */       } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static class RichiesteSchedulate
/*     */     {
/*     */       public static class CPF
/*     */       {
/* 885 */         public static final Integer RICHIESTA_REPORT_MACRODETTAGLIO = new Integer(1);
/* 886 */         public static final Integer RICHIESTA_REPORT_MACROSINTESI = new Integer(2);
/* 887 */         public static final Integer RICHIESTA_REPORT_MICRODETTAGLIO = new Integer(3);
/* 888 */         public static final Integer RICHIESTA_REPORT_MICROSINTESI = new Integer(4);
/* 889 */         public static final Integer RICHIESTA_QUERY_STATISTICA_STD = new Integer(5);
/* 890 */         public static final Integer RICHIESTA_QUERY_STATISTICA_CUSTOM = new Integer(6);
/* 891 */         public static final Integer RICHIESTA_REPORT_STORICA = new Integer(7);
/* 892 */         public static final Integer RICHIESTA_REPORT_TUNNEL = new Integer(8);
/* 893 */         public static final Integer RICHIESTA_MOVIMENTI_COMPLESSIVI = new Integer(9);
/*     */         public static final String CPFstatoInPreparazione = "I";
/*     */         public static final String CPFstatoLavorazione = "L";
/*     */         public static final String CPFstatoFallita = "F";
/*     */         public static final String CPFstatoPronta = "P";
/*     */         public static final String KEY_ID = "ID";
/*     */         public static final String KEY_RES_STATUS = "RES_STATUS";
/*     */         public static final String HTTP_RES_OK = "OK";
/*     */         public static final String HTTP_RES_KO = "KO"; } }
/*     */   }
/*     */   
/*     */   public class DispPagamento {
/*     */     public static final String AMMESSI_MEZZI_PAGAMENTO_DIVERSI = "S";
/*     */     public static final String NON_AMMESSI_MEZZI_PAGAMENTO_DIVERSI = "N";
/*     */     public static final String AMMESSI_MEZZI_DIVERSI_MA_DELLO_STESSO_TIPO = "ST";
/*     */     private final CommonConstants this$0;
/*     */     
/*     */     public DispPagamento(CommonConstants this$0) {
/* 911 */       this.this$0 = this$0;
/*     */     } public class Type { public static final String ASSEGNO_BANCARIO = "AB"; public static final String ASSEGNO_CIRCOLARE = "AC"; public static final String ADDEBITO_IN_CONTO_RBK = "RBK"; public Type(CommonConstants.DispPagamento this$1) {
/* 913 */         this.this$1 = this$1;
/*     */       }
/*     */       public static final String PASSAGGIO_MANUALE = "PS"; public static final String BONIFICO = "BO";
/*     */       public static final String BONIFICO_FORZATO = "BOF";
/*     */       public static final String RID = "RID";
/*     */       public static final String ASSEGNO_DI_TRAENZA = "AT";
/*     */       public static final String MEZZO_MANUALE_RAM = "MN";
/*     */       public static final String BONIFICO_PERMANENTE = "BP";
/*     */       public static final String CONTANTE = "CO";
/*     */       public static final String PASSAGGIO_VALUTA_COMPENSATA = "PC";
/*     */       public static final String IMPORTO_REINVESTITO = "IR";
/*     */       public static final String REINVESTIMENTO_FONDO = "RF";
/*     */       private final CommonConstants.DispPagamento this$1; }
/*     */     
/*     */     public class Description { public static final String PASSAGGIO_VALUTA_COMPENSATA = "PASSAGGIO CONTESTUALE";
/*     */       private final CommonConstants.DispPagamento this$1;
/*     */       
/*     */       public Description(CommonConstants.DispPagamento this$1) {
/* 931 */         this.this$1 = this$1;
/*     */       } }
/*     */     
/*     */     public class IbanSuSottoscrizioniRataPacRimborsiEproventi { public static final String AMMESSO = "ENT";
/*     */       public static final String NON_AMMESSO = "ABI_CAB";
/*     */       public static final String OBBLIGATORIO = "IBAN";
/*     */       private final CommonConstants.DispPagamento this$1;
/*     */       
/*     */       public IbanSuSottoscrizioniRataPacRimborsiEproventi(CommonConstants.DispPagamento this$1) {
/* 940 */         this.this$1 = this$1;
/*     */       } }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 968 */   public static final String[] AGGR_ETICH_DURATION = new String[] { "Da 0 a 1 anno", "Da 1 a 3 anni", "Da 3 a 5 anni", "Oltre 5 anni", "Non Disp" };
/*     */ 
/*     */   
/* 971 */   public static final String[] AGGR_ETICH_GEOGRAFICA = new String[] { "America", "Eur Ex Emu", "Emu", "Pacifico", "Paesi Emergenti", "Non Spec", "Non Disp" };
/*     */ 
/*     */   
/* 974 */   public static final String[] AGGR_ETICH_MAC = new String[] { "Azionario", "Obbligazionario", "Liquidità", "Non Disp" };
/*     */ 
/*     */   
/* 977 */   public static final String[] AGGR_ETICH_POSVALUTARIA = new String[] { "Dollaro USA", "Euro", "Sterlina", "Yen", "Altro", "Non Disp" };
/*     */ 
/*     */   
/* 980 */   public static final String[] AGGR_ETICH_RATING = new String[] { "Inv Grade", "High Yeld", "Not Rated", "Non Disp" };
/*     */ 
/*     */   
/* 983 */   public static final String[] AGGR_ETICH_SETTORI = new String[] { "Energy", "Materials", "Industrials", "Consumer Discretionary", "Consumer Staples", "Health Care", "Financials", "Information Technology", "Telecommunication Services", "Utilities", "Non Disponibile" };
/*     */   
/*     */   public class Dimensione
/*     */   {
/*     */     public static final int popUpGrandeWidth = 1000;
/*     */     public static final int popUpGrandeHeigth = 650;
/*     */     private final CommonConstants this$0;
/*     */     
/*     */     public Dimensione(CommonConstants this$0) {
/* 992 */       this.this$0 = this$0;
/*     */     }
/*     */   } }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\resources\CommonConstants.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */