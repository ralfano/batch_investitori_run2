/*      */ package it.ras.arco.service;
/*      */ 
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinContrattoIndir;
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinIndirizzoRam;
/*      */ import it.ras.arco.bean.FinLegameIndir;
/*      */ import it.ras.arco.bean.FinNazioniUic;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.bean.FinSoggettoIndir;
/*      */ import it.ras.arco.common.resources.Utility;
/*      */ import it.ras.arco.normalizer.RasNormalizer;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.config.CodesTableManager;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.exception.RasValidationSignal;
/*      */ import it.ras.flag.service.AbstractRasService;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.text.ParseException;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Date;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ import org.springframework.orm.hibernate3.HibernateObjectRetrievalFailureException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class IndirizzoManagerSRV
/*      */   extends AbstractRasService
/*      */ {
/*      */   public static final String INDIRIZZO_RESIDENZA = "INDIRIZZO_RESIDENZA";
/*      */   public static final String INDIRIZZO_DOMICILIO = "INDIRIZZO_DOMICILIO";
/*      */   public static final String INDIRIZZO_CORRISPONDENZA_ATTUALE = "INDIRIZZO_CORRISPONDENZA_ATTUALE";
/*      */   public static final String INDIRIZZO_CORRISPONDENZA_ATTUALE_RAM = "INDIRIZZO_CORRISPONDENZA_ATTUALE_RAM";
/*      */   public static final String CONTRATTO = "CONTRATTO";
/*      */   public static final String INDIRIZZO = "INDIRIZZO";
/*      */   public static final String INDIRIZZO_RAM = "INDIRIZZO_RAM";
/*      */   public static final String CONTRATTO_INDIRIZZO = "CONTRATTO_INDIRIZZO";
/*      */   public static final String SOGGETTO = "SOGGETTO";
/*      */   public static final String SOGGETTO_INDIRIZZO = "SOGGETTO_INDIRIZZO";
/*      */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*      */   public static final String GENERIC_MODULE_RESULT = "INDIRIZZO";
/*      */   public static final String ENTITA_DA_INSERIRE_MAP_CONTAINER_KEY = "ENTITA_DA_INSERIRE";
/*      */   public static final String CONTRATTO_INDIRIZZO_OLD = "CONTRATTO_INDIRIZZO_OLD";
/*      */   public static final String ACTION_INSERT_INDIRIZZO = "ACTION_INSERT_INDIRIZZO";
/*      */   public static final String ACTION_INSERT_RESIDENZA = "ACTION_INSERT_RESIDENZA";
/*      */   public static final String ACTION_INSERT_DOMICILIO = "ACTION_INSERT_DOMICILIO";
/*      */   public static final String INSERT_DOMICILIO_SENZA_NORMALIZZAZIONE = "INSERT_DOMICILIO_SENZA_NORMALIZZAZIONE";
/*      */   public static final String ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE = "ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE";
/*      */   public static final String ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE_RAM = "ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE_RAM";
/*      */   public static final String ACTION_INSERT_INDIRIZZO_SOTTODOSSIER = "ACTION_INSERT_INDIRIZZO_SOTTODOSSIER";
/*      */   public static final String ACTION_INSERT_INDIRIZZO_SOTTODOSSIER_SENZA_NORMALIZZAZIONE = "ACTION_INSERT_INDIRIZZO_SOTTODOSSIER_SENZA_NORMALIZZAZIONE";
/*      */   public static final String ACTION_INSERT_FISCALE = "ACTION_INSERT_FISCALE";
/*      */   public static final String INSERT_FISCALE_SENZA_NORMALIZZAZIONE = "INSERT_FISCALE_SENZA_NORMALIZZAZIONE";
/*      */   public static final String ACTION_INSERT_CORRISP = "ACTION_INSERT_CORRISP";
/*      */   public static final String ACTION_INSERT_CORRISP_RAM = "ACTION_INSERT_CORRISP_RAM";
/*      */   public static final String INSERT_RESIDENZA_SENZA_NORMALIZZAZIONE = "INSERT_RESIDENZA_SENZA_NORMALIZZAZIONE";
/*      */   public static final String ACTION_UPDATE_INDIRIZZO = "UPDATE_INDIRIZZO";
/*      */   public static final String GET_INDIRIZZO_SOGG_MD = "GetIndirizzoSoggMD";
/*      */   public static final String GET_INDIRIZZO_CONTR_MD = "GetIndirizzoContrMD";
/*      */   public static final String GET_CORRISPONDENZA_ATTUALE_MD = "GetCorrispondenzaAttualeMD";
/*      */   public static final String GET_CORRISPONDENZA_RAM_ATTUALE_MD = "GetCorrispondenzaRamAttualeMD";
/*      */   public static final String GET_MCC_BY_CONTRATTO_DATA_MD = "GetMccByContrattoDataMD";
/*      */   public static final String GET_MCC_BY_CONTRATTO_SOGGETTO_DATA_MD = "GetMccByContrattoSoggettoDataMD";
/*      */   public static final String GET_MSO_BY_SOGGETTO_DATA_POST_CONTRATTO_MD = "GetMsoBySoggettoDataPostContrattoMD";
/*      */   public static final String STORICIZZA_INDIRIZZO_MD = "StoricizzaIndirizzoMD";
/*      */   public static final String STORICIZZA_CORRISPONDENZA_ATTUALE_MD = "StoricizzaCorrispondenzaAttualeMD";
/*      */   public static final String STORICIZZA_CORRISPONDENZA_RAM_ATTUALE_MD = "StoricizzaCorrispondenzaRamAttualeMD";
/*      */   public static final String INSERT_INDIRIZZO_MD = "InsertIndirizzoMD";
/*      */   public static final String INSERT_INDIRIZZO_RAM_MD = "InsertIndirizzoRamMD";
/*      */   public static final String INSERT_CORRISPONDENZA_MD = "InsertCorrispondenzaMD";
/*      */   public static final String INSERT_CORRISPONDENZA_RAM_MD = "InsertCorrispondenzaRamMD";
/*      */   public static final String GET_NAZIONALITA_BY_UIC_MD = "GetNazionalitaByUicMD";
/*      */   public static final String GET_NAZIONALITA_BY_ISO_MD = "GetNazionalitaByIsoMD";
/*      */   public static final String ACTION_NUOVO_CONTR_INDIR = "ACTION_MODIFICA_FLAG_CONTR_INDIR";
/*      */   public static final String ACTION_NUOVO_CONTR_INDIR_RAM = "ACTION_MODIFICA_FLAG_CONTR_INDIR_RAM";
/*  103 */   private String moduloSingleEntity = "insertSingleEntityModule";
/*      */   
/*      */   private CodesTableManager codesTableManager;
/*      */   
/*      */   public static final String NULL_ACTION = "Azione nulla";
/*  108 */   private Log log = LogFactory.getLog(IndirizzoManagerSRV.class);
/*  109 */   private String action = null;
/*  110 */   private RasNormalizer normalizer = null;
/*      */   
/*      */   private boolean onLine;
/*      */   
/*      */   public static final String TIPO_INDIRIZZO = "TIPO_INDIRIZZO";
/*      */   
/*      */   public static final String DATA_CORRENTE = "DATA_CORRENTE";
/*      */   
/*      */   public static final String RESIDENZA = "RES";
/*      */   
/*      */   public static final String FISCALE = "FIS";
/*      */   public static final String DOMICILIO = "DOM";
/*      */   public static final String ELETTO = "ELE";
/*      */   public static final String CORRISPONDENZA = "COR";
/*      */   public static final String CORRISPONDENZA_RAM = "RAM";
/*      */   public static final String COS = "COS";
/*      */   public static final String NAZIONALITA = "NAZIONALITA";
/*      */   public static final String NATION_ERROR = "NATION_ERROR";
/*      */   public static final String ARCO = "ARCO";
/*      */   public static final String DOM = "DOM";
/*      */   public static final String DOMINATO = "DOMINATO";
/*      */   public static final String BATCH_NAME = "BATCH_NAME";
/*      */   public static final String PROV_DATI_ANAG = "PROV_DATI_ANAG";
/*      */   public static final String UPDATE = "U";
/*      */   public static final String NUOVO_CONTRATTO = "NUOVO_CONTRATTO";
/*      */   public static final String FABBRICA = "FABBRICA";
/*      */   public static final String RAM = "RAM";
/*      */   public static final String SY = "SY";
/*      */   public static final String MODIFICA_CORRISPONDENZA = "MCC";
/*      */   public static final String MODIFICA_SOGGETTO = "MSO";
/*      */   public static final String TIPO_SOTTOSCRIZIONE = "TIPO_SOTTOSCRIZIONE";
/*      */   public static final String DATA_INIZIO_DIP = "DATA_INIZIO_DIP";
/*      */   public static final String CODICE = "CODICE";
/*      */   public static final String DESCRIZIONE = "DESCRIZIONE";
/*      */   public static final String DATA = "DATA";
/*      */   public static final String DATA_INSERIMENTO_CONTRATTO = "DATA_INSERIMENTO_CONTRATTO";
/*      */   public static final int RBVITA = 17;
/*      */   public static final int RAS = 15;
/*      */   public static final int ALLIANZ = 3;
/*      */   public static final int DARTA = 28;
/*      */   public static final String UTENTE_OPERAZIONE_MAP_CONTAINER_KEY = "UTENTE_OPERAZIONE";
/*      */   public boolean ram = false;
/*      */   
/*      */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/*  154 */     this.codesTableManager = codesTableManager;
/*      */   }
/*      */ 
/*      */   
/*      */   public CodesTableManager getCodesTableManager() {
/*  159 */     return this.codesTableManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIsValidating(boolean isValidating) {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  173 */     MapContainer resultMap = new MapContainer();
/*      */     
/*  175 */     Object oIndirizzo = map.getAppl("INDIRIZZO");
/*  176 */     Object oIndirizzoRam = map.getAppl("INDIRIZZO");
/*  177 */     Object oContratto = map.getAppl("CONTRATTO");
/*  178 */     Object oContrattoIndir = map.getAppl("CONTRATTO_INDIRIZZO");
/*  179 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  180 */     Object oSoggettoIndir = map.getAppl("SOGGETTO_INDIRIZZO");
/*  181 */     String batchName = (String)map.getAppl("BATCH_NAME");
/*  182 */     String provDatiAnag = (String)map.getAppl("PROV_DATI_ANAG");
/*  183 */     Boolean flagNuovoContratto = (Boolean)map.getAppl("NUOVO_CONTRATTO");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  190 */     if (this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR")) {
/*      */       
/*  192 */       Object oContrattoIndirOld = map.getAppl("CONTRATTO_INDIRIZZO_OLD");
/*      */ 
/*      */ 
/*      */       
/*  196 */       if (oContrattoIndirOld != null && (FinContrattoIndir)getBean(oContrattoIndirOld, FinContrattoIndir.class) != null)
/*      */       {
/*  198 */         resultMap = updateContrIndir(oContrattoIndirOld);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  203 */       resultMap = insertIndirizzoContr("COR", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, false, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  204 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  210 */     if (this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR_RAM")) {
/*      */       
/*  212 */       Object oContrattoIndirOld = map.getAppl("CONTRATTO_INDIRIZZO_OLD");
/*      */ 
/*      */ 
/*      */       
/*  216 */       if (oContrattoIndirOld != null && (FinContrattoIndir)getBean(oContrattoIndirOld, FinContrattoIndir.class) != null)
/*      */       {
/*  218 */         resultMap = updateContrIndir(oContrattoIndirOld);
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  223 */       this.ram = true;
/*  224 */       resultMap = insertIndirizzoContr("COS", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, false, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  225 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  231 */     if (this.action.equals("ACTION_INSERT_RESIDENZA")) {
/*      */       
/*  233 */       resultMap = insertIndirizzoSogg("RES", oSoggetto, oSoggettoIndir, oIndirizzo, true, batchName, provDatiAnag);
/*  234 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  239 */     if (this.action.equals("ACTION_INSERT_FISCALE")) {
/*      */       
/*  241 */       resultMap = insertIndirizzoSogg("FIS", oSoggetto, oSoggettoIndir, oIndirizzo, true, batchName, provDatiAnag);
/*  242 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  248 */     if (this.action.equals("INSERT_RESIDENZA_SENZA_NORMALIZZAZIONE")) {
/*      */       
/*  250 */       resultMap = insertIndirizzoSogg("RES", oSoggetto, oSoggettoIndir, oIndirizzo, false, batchName, provDatiAnag);
/*  251 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  256 */     if (this.action.equals("INSERT_FISCALE_SENZA_NORMALIZZAZIONE")) {
/*      */       
/*  258 */       resultMap = insertIndirizzoSogg("FIS", oSoggetto, oSoggettoIndir, oIndirizzo, false, batchName, provDatiAnag);
/*  259 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  265 */     if (this.action.equals("ACTION_INSERT_DOMICILIO")) {
/*      */       
/*  267 */       resultMap = insertIndirizzoSogg("DOM", oSoggetto, oSoggettoIndir, oIndirizzo, true, batchName, provDatiAnag);
/*  268 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  274 */     if (this.action.equals("INSERT_DOMICILIO_SENZA_NORMALIZZAZIONE")) {
/*      */       
/*  276 */       resultMap = insertIndirizzoSogg("DOM", oSoggetto, oSoggettoIndir, oIndirizzo, false, batchName, provDatiAnag);
/*  277 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  284 */     if (this.action.equals("ACTION_INSERT_CORRISP")) {
/*      */       
/*  286 */       resultMap = insertIndirizzoContr("COR", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, true, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  287 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  293 */     if (this.action.equals("ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE")) {
/*      */       
/*  295 */       resultMap = insertIndirizzoContr("COR", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, false, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  296 */       return processResultMap(resultMap, false);
/*  297 */     }  if (this.action.equals("ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE_RAM")) {
/*  298 */       this.ram = true;
/*  299 */       resultMap = insertIndirizzoContr("COS", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, false, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  300 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  307 */     if (this.action.equals("ACTION_INSERT_CORRISP_RAM")) {
/*  308 */       this.ram = true;
/*  309 */       resultMap = insertIndirizzoContr("COS", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, true, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  310 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */     
/*  314 */     if (this.action.equals("ACTION_INSERT_INDIRIZZO_SOTTODOSSIER")) {
/*  315 */       String tipo = (String)map.getAppl("TIPO_IND");
/*  316 */       resultMap = insertIndirizzoContr(tipo, oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, true, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  317 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  323 */     if (this.action.equals("ACTION_INSERT_INDIRIZZO_SOTTODOSSIER_SENZA_NORMALIZZAZIONE")) {
/*  324 */       String tipo = (String)map.getAppl("TIPO_IND");
/*  325 */       resultMap = insertIndirizzoContr(tipo, oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam, false, oSoggetto, batchName, flagNuovoContratto.booleanValue());
/*  326 */       return processResultMap(resultMap, false);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  332 */     if (this.action.equals("UPDATE_INDIRIZZO")) {
/*      */       
/*  334 */       resultMap = updateIndirizzo(oIndirizzo);
/*  335 */       return processResultMap(resultMap, false);
/*      */     } 
/*  337 */     if (this.action.equals("ACTION_INSERT_INDIRIZZO")) {
/*      */ 
/*      */       
/*  340 */       MapContainer paramMap = new MapContainer();
/*  341 */       MapContainer resultMap1 = new MapContainer();
/*  342 */       FinIndirizzo indirizzo = null;
/*  343 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*      */       
/*  345 */       paramMap.putAppl("INDIRIZZO", indirizzo);
/*      */       
/*  347 */       getModuleManager().execModule("InsertIndirizzoMD", paramMap);
/*  348 */       return processResultMap(resultMap1, false);
/*      */     } 
/*      */     
/*  351 */     String errorMessage = "Azione passata al servizio " + getClass() + " non valida o mancante. Action = " + this.action + "";
/*  352 */     if (this.log.isErrorEnabled()) {
/*  353 */       this.log.error(errorMessage);
/*      */     }
/*  355 */     throw new RasServiceException(errorMessage);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private MapContainer insertIndirizzoSogg(String tipoIndirizzo, Object oSoggetto, Object oSoggettoIndir, Object oIndirizzo, boolean norma, String batchName, String provDatiAnag) throws RasServiceException {
/*  372 */     MapContainer paramMap = new MapContainer();
/*  373 */     MapContainer resultMap = new MapContainer();
/*  374 */     String result = null;
/*  375 */     String resultMessage = null;
/*      */ 
/*      */     
/*  378 */     FinSoggetto soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class);
/*  379 */     FinSoggettoIndir soggettoIndir = (FinSoggettoIndir)getBean(oSoggettoIndir, FinSoggettoIndir.class);
/*  380 */     FinIndirizzo indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*  381 */     FinIndirizzo indir = null;
/*      */     
/*  383 */     boolean inserisci = true;
/*  384 */     boolean storicizza = false;
/*  385 */     boolean dominato = false;
/*  386 */     boolean esisteIndirizzoAttivo = false;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  391 */     if (norma) {
/*      */       
/*  393 */       resultMap = this.normalizer.normalizeAdress(indirizzo);
/*  394 */       indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*  395 */       result = (String)resultMap.getAppl("RESULT");
/*      */ 
/*      */       
/*  398 */       if (result.equals("NOT_EXECUTED")) {
/*  399 */         resultMessage = (String)resultMap.getAppl("ERROR_ADRESS");
/*  400 */         resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  401 */         resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*  402 */         return resultMap;
/*      */       } 
/*  404 */       indirizzo.setFlagNormalizzato("S");
/*      */     } else {
/*  406 */       indirizzo.setFlagNormalizzato("N");
/*      */     } 
/*      */ 
/*      */     
/*  410 */     String nazionalita = getNazionalita(indirizzo.getNazione());
/*  411 */     if (nazionalita == null) {
/*      */       
/*  413 */       if (this.log.isErrorEnabled())
/*      */       {
/*  415 */         this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */       }
/*  417 */       resultMap.putAppl("RESULT", "NATION_ERROR");
/*  418 */       return resultMap;
/*      */     } 
/*  420 */     indirizzo.setNazione(nazionalita);
/*      */ 
/*      */ 
/*      */     
/*  424 */     if (soggetto.getIsDominant() != null && !soggetto.getIsDominant().booleanValue())
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  430 */       dominato = true;
/*      */     }
/*      */     
/*  433 */     if (soggetto.getSoggettoId() != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  438 */       Integer soggettoId = soggetto.getSoggettoId();
/*  439 */       paramMap.putAppl("SOGGETTO", soggettoId);
/*  440 */       paramMap.putAppl("TIPO_INDIRIZZO", tipoIndirizzo);
/*  441 */       paramMap.putAppl("DATA_CORRENTE", new Date());
/*      */       
/*  443 */       FinSoggettoIndir soggInd = null;
/*  444 */       Date today = new Date();
/*  445 */       Iterator i = null;
/*      */       
/*  447 */       if (tipoIndirizzo.equals("RES")) {
/*      */         
/*  449 */         if (soggetto.getIndirizzoResidenza() != null && !soggetto.getIndirizzoResidenza().isEmpty())
/*      */         {
/*  451 */           i = soggetto.getIndirizzoResidenza().iterator();
/*  452 */           storicizza = true;
/*      */         
/*      */         }
/*      */       
/*      */       }
/*  457 */       else if (tipoIndirizzo.equals("DOM")) {
/*      */         
/*  459 */         if (soggetto.getIndirizzoDomicilio() != null && !soggetto.getIndirizzoDomicilio().isEmpty())
/*      */         {
/*  461 */           i = soggetto.getIndirizzoDomicilio().iterator();
/*  462 */           storicizza = true;
/*      */         }
/*      */       
/*      */       }
/*  466 */       else if (tipoIndirizzo.equals("ELE")) {
/*      */         
/*  468 */         if (soggetto.getIndirizzoEletto() != null && !soggetto.getIndirizzoEletto().isEmpty())
/*      */         {
/*  470 */           i = soggetto.getIndirizzoEletto().iterator();
/*  471 */           storicizza = true;
/*      */         }
/*      */       
/*  474 */       } else if (tipoIndirizzo.equals("FIS")) {
/*      */         
/*  476 */         if (soggetto.getIndirizzoFiscale() != null && !soggetto.getIndirizzoFiscale().isEmpty()) {
/*      */           
/*  478 */           i = soggetto.getIndirizzoFiscale().iterator();
/*  479 */           storicizza = true;
/*      */         } 
/*      */       } 
/*      */       
/*  483 */       if (storicizza)
/*      */       {
/*  485 */         while (i.hasNext()) {
/*      */           
/*  487 */           soggInd = i.next();
/*  488 */           if (soggInd.getTipoIndirizzo() != null && soggInd.getTipoIndirizzo().equals(tipoIndirizzo) && soggInd.getDataFine() != null && soggInd.getDataFine().after(today)) {
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  493 */             indir = soggInd.getIndirizzo();
/*      */             
/*  495 */             esisteIndirizzoAttivo = true;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  511 */             if (!dominato) {
/*      */               
/*  513 */               soggInd.setDataFine(today);
/*      */               
/*  515 */               soggInd.setDominato("Y");
/*      */               
/*  517 */               ArchUtils.setStdFields(soggInd, "U", batchName);
/*      */ 
/*      */ 
/*      */               
/*  521 */               paramMap.putAppl("INDIRIZZO", soggInd);
/*      */               try {
/*  523 */                 getModuleManager().execModule("StoricizzaIndirizzoMD", paramMap);
/*  524 */               } catch (HibernateObjectRetrievalFailureException e) {
/*  525 */                 RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  526 */                 rse.setStackTrace(e.getStackTrace());
/*  527 */                 throw rse;
/*      */               } 
/*      */             } 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             break;
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  542 */     if (!dominato) {
/*  543 */       soggettoIndir.setTipoIndirizzo(tipoIndirizzo);
/*  544 */       if (dominato && esisteIndirizzoAttivo) {
/*  545 */         soggettoIndir.setDataFine(new Date());
/*      */       } else {
/*  547 */         Calendar data = Calendar.getInstance();
/*  548 */         data.set(9999, 11, 31);
/*  549 */         soggettoIndir.setDataFine(data.getTime());
/*      */       } 
/*  551 */       paramMap.putAppl("INDIRIZZO", indirizzo);
/*      */       try {
/*  553 */         getModuleManager().execModule("InsertIndirizzoMD", paramMap);
/*  554 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  555 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  556 */         rse.setStackTrace(e.getStackTrace());
/*  557 */         throw rse;
/*      */       }
/*      */     
/*  560 */     } else if (esisteIndirizzoAttivo) {
/*  561 */       inserisciLegame(indirizzo, null, soggetto, indir, tipoIndirizzo, batchName, provDatiAnag);
/*  562 */       resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */     } 
/*      */ 
/*      */     
/*  566 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private MapContainer insertIndirizzoContr(String tipoIndirizzo, Object oContratto, Object oContrattoIndir, Object oIndirizzo, Object oIndirizzoRam, boolean norma, Object oSoggetto, String batchName, boolean flagNuovoContratto) throws RasServiceException {
/*  582 */     MapContainer paramMap = new MapContainer();
/*  583 */     MapContainer resultMap = new MapContainer();
/*  584 */     String result = null;
/*  585 */     String resultMessage = null;
/*  586 */     FinIndirizzo indirizzo = null;
/*  587 */     FinIndirizzoRam indirizzoRam = null;
/*  588 */     FinSoggetto soggettoRam = null;
/*      */     
/*  590 */     FinContratto contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  591 */     FinContrattoIndir contrattoIndir = (FinContrattoIndir)getBean(oContrattoIndir, FinContrattoIndir.class);
/*      */     
/*  593 */     boolean inserisci = true;
/*  594 */     boolean insLegame = false;
/*  595 */     boolean indirizzoValidoFound = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  601 */     if (this.action.equals("ACTION_INSERT_CORRISP")) {
/*  602 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*      */       
/*  604 */       if (norma) {
/*  605 */         resultMap = this.normalizer.normalizeAdress(indirizzo);
/*  606 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*  607 */         result = (String)resultMap.getAppl("RESULT");
/*  608 */         if (result.equals("NOT_EXECUTED")) {
/*  609 */           resultMessage = (String)resultMap.getAppl("ERROR_ADRESS");
/*  610 */           resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  611 */           resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*  612 */           return resultMap;
/*      */         } 
/*  614 */         indirizzo.setFlagNormalizzato("S");
/*      */       } else {
/*  616 */         indirizzo.setFlagNormalizzato("N");
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  621 */       String nazionalita = getNazionalita(indirizzo.getNazione());
/*  622 */       if (nazionalita == null) {
/*      */         
/*  624 */         if (this.log.isErrorEnabled())
/*      */         {
/*  626 */           this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */         }
/*  628 */         resultMap.putAppl("RESULT", "NATION_ERROR");
/*  629 */         return resultMap;
/*      */       } 
/*  631 */       indirizzo.setNazione(nazionalita);
/*  632 */       indirizzo.setTipoIndirizzo(tipoIndirizzo);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  638 */     else if (this.action.equals("ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE") || this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR")) {
/*      */       
/*  640 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*      */       
/*  642 */       if (norma) {
/*  643 */         resultMap = this.normalizer.normalizeAdress(indirizzo);
/*  644 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*  645 */         result = (String)resultMap.getAppl("RESULT");
/*      */         
/*  647 */         if (result.equals("NOT_EXECUTED")) {
/*  648 */           resultMessage = (String)resultMap.getAppl("ERROR_ADRESS");
/*  649 */           resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  650 */           resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*  651 */           return resultMap;
/*      */         } 
/*  653 */         indirizzo.setFlagNormalizzato("S");
/*      */       } else {
/*  655 */         indirizzo.setFlagNormalizzato("N");
/*      */       } 
/*      */       
/*  658 */       String nazionalita = getNazionalita(indirizzo.getNazione());
/*  659 */       if (nazionalita == null) {
/*      */         
/*  661 */         if (this.log.isErrorEnabled())
/*      */         {
/*  663 */           this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */         }
/*  665 */         resultMap.putAppl("RESULT", "NATION_ERROR");
/*  666 */         return resultMap;
/*      */       } 
/*  668 */       indirizzo.setNazione(nazionalita);
/*  669 */       indirizzo.setTipoIndirizzo(tipoIndirizzo);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  676 */     else if (this.action.equals("ACTION_INSERT_INDIRIZZO_SOTTODOSSIER")) {
/*  677 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*      */       
/*  679 */       if (norma) {
/*      */         
/*  681 */         resultMap = this.normalizer.normalizeAdress(indirizzo);
/*  682 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*  683 */         result = (String)resultMap.getAppl("RESULT");
/*      */ 
/*      */         
/*  686 */         if (result.equals("NOT_EXECUTED")) {
/*  687 */           resultMessage = (String)resultMap.getAppl("ERROR_ADRESS");
/*  688 */           resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  689 */           resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*  690 */           return resultMap;
/*      */         } 
/*  692 */         indirizzo.setFlagNormalizzato("S");
/*      */       } else {
/*  694 */         indirizzo.setFlagNormalizzato("N");
/*      */       } 
/*      */       
/*  697 */       String nazionalita = getNazionalita(indirizzo.getNazione());
/*  698 */       if (nazionalita == null) {
/*      */         
/*  700 */         if (this.log.isErrorEnabled())
/*      */         {
/*  702 */           this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */         }
/*  704 */         resultMap.putAppl("RESULT", "NATION_ERROR");
/*  705 */         return resultMap;
/*      */       } 
/*  707 */       indirizzo.setNazione(nazionalita);
/*  708 */       indirizzo.setTipoIndirizzo(tipoIndirizzo);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  714 */     else if (this.action.equals("ACTION_INSERT_INDIRIZZO_SOTTODOSSIER_SENZA_NORMALIZZAZIONE")) {
/*  715 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*      */       
/*  717 */       if (norma) {
/*      */         
/*  719 */         resultMap = this.normalizer.normalizeAdress(indirizzo);
/*  720 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*  721 */         result = (String)resultMap.getAppl("RESULT");
/*      */ 
/*      */         
/*  724 */         if (result.equals("NOT_EXECUTED")) {
/*  725 */           resultMessage = (String)resultMap.getAppl("ERROR_ADRESS");
/*  726 */           resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  727 */           resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*  728 */           return resultMap;
/*      */         } 
/*  730 */         indirizzo.setFlagNormalizzato("S");
/*      */       } else {
/*  732 */         indirizzo.setFlagNormalizzato("N");
/*      */       } 
/*      */       
/*  735 */       String nazionalita = getNazionalita(indirizzo.getNazione());
/*  736 */       if (nazionalita == null) {
/*      */         
/*  738 */         if (this.log.isErrorEnabled())
/*      */         {
/*  740 */           this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */         }
/*  742 */         resultMap.putAppl("RESULT", "NATION_ERROR");
/*  743 */         return resultMap;
/*      */       } 
/*  745 */       indirizzo.setNazione(nazionalita);
/*  746 */       indirizzo.setTipoIndirizzo(tipoIndirizzo);
/*      */     
/*      */     }
/*  749 */     else if (this.action.equals("ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE_RAM") || this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR_RAM")) {
/*      */       
/*  751 */       indirizzoRam = (FinIndirizzoRam)getBean(oIndirizzoRam, FinIndirizzoRam.class);
/*      */       
/*  753 */       if (norma) {
/*  754 */         resultMap = this.normalizer.normalizeAdress(indirizzoRam);
/*  755 */         indirizzoRam = (FinIndirizzoRam)resultMap.getAppl("INDIRIZZO");
/*  756 */         result = (String)resultMap.getAppl("RESULT");
/*      */ 
/*      */         
/*  759 */         if (result.equals("NOT_EXECUTED")) {
/*  760 */           resultMessage = (String)resultMap.getAppl("ERROR_ADRESS");
/*  761 */           resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  762 */           resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*  763 */           return resultMap;
/*      */         } 
/*  765 */         indirizzoRam.setFlagNormalizzato("S");
/*      */       } else {
/*  767 */         indirizzoRam.setFlagNormalizzato("N");
/*      */       } 
/*      */       
/*  770 */       String nazionalita = getNazionalita(indirizzoRam.getNazione());
/*  771 */       if (nazionalita == null) {
/*      */         
/*  773 */         if (this.log.isErrorEnabled())
/*      */         {
/*  775 */           this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */         }
/*  777 */         resultMap.putAppl("RESULT", "NATION_ERROR");
/*  778 */         resultMap.putAppl("RESULT_MESSAGE", "NATION_ERROR");
/*      */         
/*  780 */         return resultMap;
/*      */       } 
/*  782 */       indirizzoRam.setNazione(nazionalita);
/*  783 */       indirizzoRam.setTipoIndirizzo(tipoIndirizzo);
/*      */       
/*  785 */       if (indirizzoRam.getSoggettoRam() != null) {
/*  786 */         soggettoRam = indirizzoRam.getSoggettoRam();
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*  793 */     else if (this.action.equals("ACTION_INSERT_CORRISP_RAM")) {
/*  794 */       indirizzoRam = (FinIndirizzoRam)getBean(oIndirizzoRam, FinIndirizzoRam.class);
/*      */       
/*  796 */       if (norma) {
/*  797 */         resultMap = this.normalizer.normalizeAdress(indirizzoRam);
/*  798 */         indirizzoRam = (FinIndirizzoRam)resultMap.getAppl("INDIRIZZO");
/*  799 */         result = (String)resultMap.getAppl("RESULT");
/*      */ 
/*      */         
/*  802 */         if (result.equals("NOT_EXECUTED")) {
/*  803 */           resultMessage = (String)resultMap.getAppl("ERROR_ADRESS");
/*  804 */           resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  805 */           resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*  806 */           return resultMap;
/*      */         } 
/*  808 */         indirizzoRam.setFlagNormalizzato("S");
/*      */       } else {
/*  810 */         indirizzoRam.setFlagNormalizzato("N");
/*      */       } 
/*      */       
/*  813 */       String nazionalita = getNazionalita(indirizzoRam.getNazione());
/*  814 */       if (nazionalita == null) {
/*      */         
/*  816 */         if (this.log.isErrorEnabled())
/*      */         {
/*  818 */           this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */         }
/*  820 */         resultMap.putAppl("RESULT", "NATION_ERROR");
/*  821 */         return resultMap;
/*      */       } 
/*  823 */       indirizzoRam.setNazione(nazionalita);
/*  824 */       indirizzoRam.setTipoIndirizzo(tipoIndirizzo);
/*      */       
/*  826 */       if (indirizzoRam.getSoggettoRam() != null) {
/*  827 */         soggettoRam = indirizzoRam.getSoggettoRam();
/*      */       }
/*      */     } 
/*      */     
/*  831 */     if (this.ram) {
/*  832 */       if (ArchUtils.isValid(indirizzoRam.getPresso())) {
/*  833 */         String civico = indirizzoRam.getNumeroCivico() + ", C/O " + indirizzoRam.getPresso();
/*  834 */         if (civico.length() > 30) {
/*  835 */           indirizzoRam.setNumeroCivico(civico.substring(0, 30));
/*      */         } else {
/*      */           
/*  838 */           indirizzoRam.setNumeroCivico(civico);
/*      */         }
/*      */       
/*      */       }
/*      */     
/*  843 */     } else if (ArchUtils.isValid(indirizzo.getPresso())) {
/*  844 */       String civico = indirizzo.getNumeroCivico() + ", C/O " + indirizzo.getPresso();
/*  845 */       if (civico.length() > 30) {
/*  846 */         indirizzo.setNumeroCivico(civico.substring(0, 30));
/*      */       } else {
/*      */         
/*  849 */         indirizzo.setNumeroCivico(civico);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  854 */     if (flagNuovoContratto) {
/*  855 */       if (variataCorrispondenza(contratto, soggettoRam) || (!esisteContrattoIndir(contratto, soggettoRam) && variatoSoggetto(contratto, soggettoRam)))
/*      */       {
/*      */ 
/*      */         
/*  859 */         inserisci = false;
/*      */         
/*  861 */         if (this.ram) {
/*  862 */           FinSoggetto soggetto = indirizzoRam.getSoggettoRam();
/*  863 */           FinIndirizzo indirizzoResidenzaSoggetto = getIndirizzoResidenza(soggetto);
/*      */           
/*  865 */           if (indirizzoResidenzaSoggetto != null) {
/*  866 */             inserisciLegame((FinIndirizzo)indirizzoRam, contratto, null, indirizzoResidenzaSoggetto, indirizzoRam.getTipoIndirizzo(), batchName, null);
/*  867 */             insLegame = true;
/*  868 */             resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */           } else {
/*      */             
/*  871 */             resultMap.putAppl("RESULT", "WARNING");
/*  872 */             resultMap.putAppl("RESULT_MESSAGE", "Soggetto ARCO senza residenza");
/*      */           } 
/*      */         } else {
/*      */           
/*  876 */           FinSoggetto soggetto = contratto.getSoggetto();
/*  877 */           FinIndirizzo indirizzoResidenzaSoggetto = getIndirizzoResidenza(soggetto);
/*      */           
/*  879 */           inserisci = false;
/*      */           
/*  881 */           if (indirizzoResidenzaSoggetto != null) {
/*  882 */             inserisciLegame(indirizzo, contratto, null, indirizzoResidenzaSoggetto, indirizzo.getTipoIndirizzo(), batchName, null);
/*  883 */             insLegame = true;
/*  884 */             resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */           } else {
/*      */             
/*  887 */             resultMap.putAppl("RESULT", "WARNING");
/*  888 */             resultMap.putAppl("RESULT_MESSAGE", "Soggetto ARCO senza residenza");
/*      */           } 
/*      */         } 
/*  891 */         resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  899 */       if (contratto.getContrattoId() != null) {
/*  900 */         Integer contrattoId = contratto.getContrattoId();
/*  901 */         paramMap.putAppl("CONTRATTO", contrattoId);
/*  902 */         paramMap.putAppl("TIPO_INDIRIZZO", tipoIndirizzo);
/*  903 */         paramMap.putAppl("DATA_CORRENTE", new Date());
/*      */         
/*  905 */         FinContrattoIndir contInd = null;
/*  906 */         Date today = new Date();
/*  907 */         FinIndirizzo indirizzoC = null;
/*      */         
/*  909 */         if (contratto.getIndirizzo() != null && !contratto.getIndirizzo().isEmpty()) {
/*      */           
/*  911 */           Iterator i = contratto.getIndirizzo().iterator();
/*  912 */           while (i.hasNext()) {
/*  913 */             contInd = i.next();
/*  914 */             indirizzoC = contInd.getIndirizzo();
/*      */ 
/*      */ 
/*      */             
/*  918 */             if (!this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR") && !this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR_RAM") && indirizzoC.getTipoIndirizzo() != null && indirizzoC.getTipoIndirizzo().equals(tipoIndirizzo) && contInd.getDataFine() != null && contInd.getDataFine().after(today) && indirizzoC.getTipoIndirizzo() != null && indirizzoC.getTipoIndirizzo().equals("COR")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  925 */               indirizzoValidoFound = true;
/*      */               
/*  927 */               FinIndirizzo indir = contInd.getIndirizzo();
/*      */ 
/*      */               
/*  930 */               if (this.ram) {
/*  931 */                 if (indirizzoRam.equals(indir) || (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO"))) {
/*  932 */                   inserisci = false;
/*  933 */                   if (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO")) {
/*  934 */                     inserisciLegame((FinIndirizzo)indirizzoRam, contratto, indirizzoRam.getSoggettoRam(), indir, indirizzoC.getTipoIndirizzo(), batchName, null);
/*  935 */                     insLegame = true;
/*  936 */                     resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */                     
/*      */                     break;
/*      */                   } 
/*      */                 } 
/*  941 */               } else if (indirizzo.equals(indir) || (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO"))) {
/*  942 */                 inserisci = false;
/*  943 */                 if (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO")) {
/*  944 */                   inserisciLegame(indirizzo, contratto, null, indir, indirizzoC.getTipoIndirizzo(), batchName, null);
/*  945 */                   insLegame = true;
/*  946 */                   resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */ 
/*      */ 
/*      */                   
/*      */                   break;
/*      */                 } 
/*      */               } 
/*      */ 
/*      */               
/*  955 */               if (inserisci) {
/*  956 */                 contInd.setDataFine(today);
/*      */                 
/*  958 */                 ArchUtils.setStdFields(contInd, "U", batchName);
/*      */ 
/*      */                 
/*  961 */                 paramMap.putAppl("INDIRIZZO", contInd);
/*      */                 try {
/*  963 */                   getModuleManager().execModule("StoricizzaIndirizzoMD", paramMap);
/*  964 */                 } catch (HibernateObjectRetrievalFailureException e) {
/*  965 */                   RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  966 */                   rse.setStackTrace(e.getStackTrace());
/*  967 */                   throw rse;
/*      */                 } 
/*      */                 break;
/*      */               } 
/*      */               continue;
/*      */             } 
/*  973 */             if (!this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR") && !this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR_RAM") && indirizzoC.getTipoIndirizzo() != null && indirizzoC.getTipoIndirizzo().equals(tipoIndirizzo) && contInd.getDataFine() != null && contInd.getDataFine().after(today) && indirizzoC.getTipoIndirizzo() != null && indirizzoC.getTipoIndirizzo().equals("COS"))
/*      */             {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  980 */               if (indirizzoC instanceof FinIndirizzoRam) {
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  985 */                 FinIndirizzoRam indirizzoCRam = (FinIndirizzoRam)indirizzoC;
/*      */ 
/*      */                 
/*  988 */                 if (indirizzoCRam.getSoggettoRam().getSoggettoId().intValue() == indirizzoRam.getSoggettoRam().getSoggettoId().intValue()) {
/*  989 */                   indirizzoValidoFound = true;
/*  990 */                   if (this.ram) {
/*  991 */                     if (indirizzoRam.equals(indirizzoCRam) || (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO"))) {
/*  992 */                       inserisci = false;
/*  993 */                       if (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO")) {
/*  994 */                         inserisciLegame((FinIndirizzo)indirizzoRam, contratto, indirizzoRam.getSoggettoRam(), (FinIndirizzo)indirizzoCRam, indirizzoCRam.getTipoIndirizzo(), batchName, null);
/*  995 */                         insLegame = true;
/*  996 */                         resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */ 
/*      */ 
/*      */                         
/*      */                         break;
/*      */                       } 
/*      */                     } 
/* 1003 */                   } else if (indirizzo.equals(indirizzoCRam) || (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO"))) {
/* 1004 */                     inserisci = false;
/* 1005 */                     if (contInd.getProvDatiAnag() != null && contInd.getProvDatiAnag().equals("ARCO")) {
/* 1006 */                       inserisciLegame(indirizzo, contratto, null, (FinIndirizzo)indirizzoCRam, indirizzoCRam.getTipoIndirizzo(), batchName, null);
/* 1007 */                       insLegame = true;
/* 1008 */                       resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */ 
/*      */ 
/*      */                       
/*      */                       break;
/*      */                     } 
/*      */                   } 
/*      */ 
/*      */                   
/* 1017 */                   if (inserisci) {
/* 1018 */                     contInd.setDataFine(today);
/*      */                     
/* 1020 */                     ArchUtils.setStdFields(contInd, "U", batchName);
/*      */ 
/*      */                     
/* 1023 */                     paramMap.putAppl("INDIRIZZO", contInd);
/*      */                     try {
/* 1025 */                       getModuleManager().execModule("StoricizzaIndirizzoMD", paramMap);
/* 1026 */                     } catch (HibernateObjectRetrievalFailureException e) {
/* 1027 */                       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1028 */                       rse.setStackTrace(e.getStackTrace());
/* 1029 */                       throw rse;
/*      */                     } 
/*      */ 
/*      */ 
/*      */                     
/*      */                     break;
/*      */                   } 
/*      */                 } 
/*      */               } 
/*      */             }
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1044 */       if (!indirizzoValidoFound)
/*      */       {
/*      */ 
/*      */         
/* 1048 */         if (contratto.getProdotto().getEmittente().getEmittenteId().intValue() != 17 && contratto.getProdotto().getEmittente().getEmittenteId().intValue() != 15 && contratto.getProdotto().getEmittente().getEmittenteId().intValue() != 3 && contratto.getProdotto().getEmittente().getEmittenteId().intValue() != 28)
/*      */         {
/*      */ 
/*      */ 
/*      */           
/* 1053 */           if (Utility.isModalitaFabbricaConInvio(contratto.getProdotto())) {
/* 1054 */             if (this.ram) {
/* 1055 */               FinSoggetto soggetto = indirizzoRam.getSoggettoRam();
/* 1056 */               if (soggetto.getProvDatiAnag() != null && soggetto.getProvDatiAnag().equals("ARCO")) {
/* 1057 */                 FinIndirizzo indirizzoResidenzaSoggetto = getIndirizzoResidenza(soggetto);
/*      */                 
/* 1059 */                 inserisci = false;
/*      */                 
/* 1061 */                 if (indirizzoResidenzaSoggetto != null) {
/* 1062 */                   inserisciLegame((FinIndirizzo)indirizzoRam, contratto, null, indirizzoResidenzaSoggetto, indirizzoRam.getTipoIndirizzo(), batchName, null);
/* 1063 */                   insLegame = true;
/* 1064 */                   resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */                 } else {
/*      */                   
/* 1067 */                   resultMap.putAppl("RESULT", "WARNING");
/* 1068 */                   resultMap.putAppl("RESULT_MESSAGE", "Soggetto ARCO senza residenza");
/*      */                 } 
/*      */               } 
/*      */             } else {
/*      */               
/* 1073 */               FinSoggetto soggetto = contratto.getSoggetto();
/* 1074 */               if (soggetto.getProvDatiAnag() != null && soggetto.getProvDatiAnag().equals("ARCO")) {
/* 1075 */                 FinIndirizzo indirizzoResidenzaSoggetto = getIndirizzoResidenza(soggetto);
/*      */                 
/* 1077 */                 inserisci = false;
/*      */                 
/* 1079 */                 if (indirizzoResidenzaSoggetto != null) {
/* 1080 */                   inserisciLegame(indirizzo, contratto, null, indirizzoResidenzaSoggetto, indirizzo.getTipoIndirizzo(), batchName, null);
/* 1081 */                   insLegame = true;
/* 1082 */                   resultMap.putAppl("DOMINATO", new Boolean(true));
/*      */                 } else {
/*      */                   
/* 1085 */                   resultMap.putAppl("RESULT", "WARNING");
/* 1086 */                   resultMap.putAppl("RESULT_MESSAGE", "Soggetto ARCO senza residenza");
/*      */                 } 
/*      */               } 
/*      */             } 
/*      */           }
/*      */         }
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1098 */     if (inserisci) {
/*      */       
/* 1100 */       if (flagNuovoContratto && 
/* 1101 */         contratto.getContrattoId() != null) {
/*      */         String tipoIndir;
/* 1103 */         Date today = new Date();
/*      */         
/* 1105 */         if (this.ram) {
/* 1106 */           tipoIndir = "COS";
/*      */         } else {
/*      */           
/* 1109 */           tipoIndir = "COR";
/*      */         } 
/*      */         
/* 1112 */         Iterator iContInd = contratto.getIndirizzo().iterator();
/* 1113 */         while (iContInd.hasNext()) {
/* 1114 */           FinContrattoIndir contInd = iContInd.next();
/* 1115 */           FinIndirizzo indir = contInd.getIndirizzo();
/*      */           
/* 1117 */           if (indir != null && indir.getTipoIndirizzo() != null && indir.getTipoIndirizzo().equals(tipoIndir) && contInd.getDataFine() != null && contInd.getDataFine().after(today)) {
/*      */ 
/*      */             
/* 1120 */             boolean storicizza = false;
/*      */             
/* 1122 */             if (this.ram) {
/* 1123 */               if (((FinIndirizzoRam)indir).getSoggettoRam().getSoggettoId().intValue() == indirizzoRam.getSoggettoRam().getSoggettoId().intValue()) {
/* 1124 */                 storicizza = true;
/*      */               }
/*      */             } else {
/*      */               
/* 1128 */               storicizza = true;
/*      */             } 
/*      */             
/* 1131 */             if (storicizza) {
/* 1132 */               contInd.setDataFine(today);
/*      */               
/* 1134 */               ArchUtils.setStdFields(contInd, "U", batchName);
/*      */ 
/*      */               
/* 1137 */               paramMap.putAppl("INDIRIZZO", contInd);
/*      */               try {
/* 1139 */                 getModuleManager().execModule("StoricizzaIndirizzoMD", paramMap);
/* 1140 */               } catch (HibernateObjectRetrievalFailureException e) {
/* 1141 */                 RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1142 */                 rse.setStackTrace(e.getStackTrace());
/* 1143 */                 throw rse;
/*      */               } 
/*      */ 
/*      */               
/*      */               break;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/* 1153 */       if (this.action.equals("ACTION_INSERT_CORRISP") || this.action.equals("ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE") || this.action.equals("ACTION_INSERT_INDIRIZZO_SOTTODOSSIER_SENZA_NORMALIZZAZIONE") || this.action.equals("ACTION_INSERT_INDIRIZZO_SOTTODOSSIER") || this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR")) {
/*      */         
/* 1155 */         paramMap.putAppl("INDIRIZZO", indirizzo);
/* 1156 */       } else if (this.action.equals("ACTION_INSERT_CORRISP_RAM") || this.action.equals("ACTION_INSERT_CORRISP_SENZA_NORMALIZZAZIONE_RAM") || this.action.equals("ACTION_MODIFICA_FLAG_CONTR_INDIR_RAM")) {
/*      */         
/* 1158 */         paramMap.putAppl("INDIRIZZO", indirizzoRam);
/*      */       } 
/*      */ 
/*      */       
/*      */       try {
/* 1163 */         getModuleManager().execModule("InsertIndirizzoMD", paramMap);
/* 1164 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 1165 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1166 */         rse.setStackTrace(e.getStackTrace());
/* 1167 */         throw rse;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1176 */     return resultMap;
/*      */   }
/*      */   
/*      */   private void inserisciLegame(FinIndirizzo indirizzo, FinContratto contratto, FinSoggetto soggetto, FinIndirizzo indirizzoCorrelato, String tipoIndirizzo, String batchName, String provDatiAnag) throws RasServiceException {
/* 1180 */     FinLegameIndir legame = new FinLegameIndir();
/*      */     
/* 1182 */     MapContainer paramMap = new MapContainer();
/*      */     
/* 1184 */     indirizzo.setContratto(null);
/*      */     
/* 1186 */     legame.setContratto(contratto);
/* 1187 */     legame.setSoggetto(soggetto);
/* 1188 */     legame.setIndirizzoCorrelato(indirizzoCorrelato);
/* 1189 */     legame.setTipoIndirizzo(tipoIndirizzo);
/* 1190 */     legame.setTipoGestione("DOM");
/* 1191 */     legame.setDescrizione("DOMINATO");
/* 1192 */     legame.setDataElaborazione(new Date());
/* 1193 */     legame.setProvDatiAnag(provDatiAnag);
/*      */     
/* 1195 */     legame.setDataInserimento(new Date());
/* 1196 */     legame.setUtenteInserimento(batchName);
/* 1197 */     ArchUtils.setStdFields(legame, "I", batchName);
/*      */ 
/*      */     
/* 1200 */     if (indirizzo instanceof FinIndirizzoRam) {
/* 1201 */       FinIndirizzoRam indirizzoRam = (FinIndirizzoRam)indirizzo;
/* 1202 */       indirizzoRam.setSoggettoRam(soggetto);
/* 1203 */       indirizzoRam.setSoggetto(null);
/*      */       
/* 1205 */       legame.setIndirizzo((FinIndirizzo)indirizzoRam);
/* 1206 */       indirizzoRam.setLegameIndir(new HashSet());
/* 1207 */       indirizzoRam.getLegameIndir().add(legame);
/*      */       
/* 1209 */       indirizzoRam.setDataInserimento(new Date());
/* 1210 */       indirizzoRam.setUtenteInserimento(batchName);
/* 1211 */       ArchUtils.setStdFields(indirizzoRam, "I", batchName);
/*      */       
/* 1213 */       paramMap.putAppl("INDIRIZZO", indirizzoRam);
/*      */     } else {
/*      */       
/* 1216 */       indirizzo.setSoggetto(null);
/*      */       
/* 1218 */       legame.setIndirizzo(indirizzo);
/* 1219 */       indirizzo.setLegameIndir(new HashSet());
/* 1220 */       indirizzo.getLegameIndir().add(legame);
/*      */       
/* 1222 */       indirizzo.setDataInserimento(new Date());
/* 1223 */       indirizzo.setUtenteInserimento(batchName);
/* 1224 */       ArchUtils.setStdFields(indirizzo, "I", batchName);
/*      */       
/* 1226 */       paramMap.putAppl("INDIRIZZO", indirizzo);
/*      */     } 
/*      */     
/*      */     try {
/* 1230 */       getModuleManager().execModule("InsertIndirizzoMD", paramMap);
/* 1231 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 1232 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1233 */       rse.setStackTrace(e.getStackTrace());
/* 1234 */       throw rse;
/*      */     } 
/*      */   }
/*      */   
/*      */   private boolean variataCorrispondenza(FinContratto contratto, FinSoggetto soggetto) throws RasServiceException {
/* 1239 */     MapContainer paramMap = new MapContainer();
/* 1240 */     MapContainer resultMap = null;
/* 1241 */     Date dataInizioDip = null;
/*      */     
/* 1243 */     String sDataInizioDip = (String)this.codesTableManager.decodeValue("DATA_INIZIO_DIP", "CODICE", "DESCRIZIONE", "DATA");
/*      */     
/* 1245 */     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
/*      */     
/*      */     try {
/* 1248 */       dataInizioDip = formatter.parse(sDataInizioDip);
/* 1249 */     } catch (ParseException e) {
/* 1250 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1251 */       rse.setStackTrace(e.getStackTrace());
/* 1252 */       throw rse;
/*      */     } 
/*      */     
/* 1255 */     if (contratto.getContrattoId() == null) {
/* 1256 */       return false;
/*      */     }
/*      */     
/* 1259 */     paramMap.putAppl("CONTRATTO", contratto.getContrattoId());
/* 1260 */     paramMap.putAppl("TIPO_SOTTOSCRIZIONE", "MCC");
/* 1261 */     paramMap.putAppl("DATA_INIZIO_DIP", dataInizioDip);
/*      */ 
/*      */     
/* 1264 */     if (soggetto == null) {
/*      */       try {
/* 1266 */         resultMap = getModuleManager().execModule("GetMccByContrattoDataMD", paramMap);
/* 1267 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 1268 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1269 */         rse.setStackTrace(e.getStackTrace());
/* 1270 */         throw rse;
/*      */       } 
/*      */     } else {
/*      */       
/* 1274 */       paramMap.putAppl("SOGGETTO", soggetto.getSoggettoId());
/*      */       
/*      */       try {
/* 1277 */         resultMap = getModuleManager().execModule("GetMccByContrattoSoggettoDataMD", paramMap);
/* 1278 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 1279 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1280 */         rse.setStackTrace(e.getStackTrace());
/* 1281 */         throw rse;
/*      */       } 
/*      */     } 
/*      */     
/* 1285 */     ArrayList result = (ArrayList)resultMap.getAppl("MCC");
/*      */     
/* 1287 */     if (result.size() > 0) {
/* 1288 */       return true;
/*      */     }
/* 1290 */     return false;
/*      */   }
/*      */   
/*      */   private boolean variatoSoggetto(FinContratto contratto, FinSoggetto soggetto) throws RasServiceException {
/* 1294 */     MapContainer paramMap = new MapContainer();
/* 1295 */     MapContainer resultMap = null;
/* 1296 */     Date dataInizioDip = null;
/*      */     
/* 1298 */     String sDataInizioDip = (String)this.codesTableManager.decodeValue("DATA_INIZIO_DIP", "CODICE", "DESCRIZIONE", "DATA");
/*      */     
/* 1300 */     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
/*      */     
/* 1302 */     if (contratto.getContrattoId() == null) {
/* 1303 */       return false;
/*      */     }
/*      */     
/*      */     try {
/* 1307 */       dataInizioDip = formatter.parse(sDataInizioDip);
/* 1308 */     } catch (ParseException e) {
/* 1309 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1310 */       rse.setStackTrace(e.getStackTrace());
/* 1311 */       throw rse;
/*      */     } 
/*      */     
/* 1314 */     if (soggetto == null) {
/* 1315 */       paramMap.putAppl("SOGGETTO", contratto.getSoggetto().getSoggettoId());
/*      */     } else {
/*      */       
/* 1318 */       paramMap.putAppl("SOGGETTO", soggetto.getSoggettoId());
/*      */     } 
/*      */     
/* 1321 */     paramMap.putAppl("TIPO_SOTTOSCRIZIONE", "MSO");
/* 1322 */     paramMap.putAppl("DATA_INIZIO_DIP", dataInizioDip);
/* 1323 */     paramMap.putAppl("DATA_INSERIMENTO_CONTRATTO", contratto.getDataInserimento());
/*      */     
/*      */     try {
/* 1326 */       resultMap = getModuleManager().execModule("GetMsoBySoggettoDataPostContrattoMD", paramMap);
/* 1327 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 1328 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1329 */       rse.setStackTrace(e.getStackTrace());
/* 1330 */       throw rse;
/*      */     } 
/*      */     
/* 1333 */     ArrayList result = (ArrayList)resultMap.getAppl("MSO");
/*      */     
/* 1335 */     if (result.size() > 0) {
/* 1336 */       return true;
/*      */     }
/* 1338 */     return false;
/*      */   }
/*      */   
/*      */   private boolean esisteContrattoIndir(FinContratto contratto, FinSoggetto soggetto) throws RasServiceException {
/* 1342 */     boolean value = false;
/*      */     
/* 1344 */     if (contratto.getContrattoId() == null) {
/* 1345 */       return false;
/*      */     }
/*      */     
/* 1348 */     if (soggetto == null) {
/* 1349 */       if (contratto.getIndirizzo() == null || contratto.getIndirizzo().isEmpty()) {
/* 1350 */         value = false;
/*      */       } else {
/*      */         
/* 1353 */         value = true;
/*      */       } 
/*      */     } else {
/*      */       
/* 1357 */       Iterator iContrattoIndir = contratto.getIndirizzo().iterator();
/* 1358 */       while (iContrattoIndir.hasNext()) {
/* 1359 */         FinContrattoIndir contrattoIndir = iContrattoIndir.next();
/* 1360 */         FinIndirizzoRam indirizzo = (FinIndirizzoRam)contrattoIndir.getIndirizzo();
/* 1361 */         if (indirizzo.getSoggettoRam().getSoggettoId().intValue() == soggetto.getSoggettoId().intValue()) {
/* 1362 */           value = true;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*      */     } 
/* 1368 */     return value;
/*      */   }
/*      */ 
/*      */   
/*      */   private FinIndirizzo getIndirizzoResidenza(FinSoggetto soggetto) {
/* 1373 */     FinIndirizzo indirizzo = null;
/* 1374 */     Date today = new Date();
/*      */     
/* 1376 */     Iterator iSoggInd = soggetto.getIndirizzoResidenza().iterator();
/*      */     
/* 1378 */     while (iSoggInd.hasNext()) {
/* 1379 */       FinSoggettoIndir soggInd = iSoggInd.next();
/* 1380 */       if (soggInd.getDataFine().after(today)) {
/* 1381 */         indirizzo = soggInd.getIndirizzo();
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/* 1386 */     return indirizzo;
/*      */   }
/*      */   
/*      */   private MapContainer updateIndirizzo(Object oIndirizzo) throws RasServiceException {
/* 1390 */     MapContainer paramMap = new MapContainer();
/* 1391 */     MapContainer resultMap = new MapContainer();
/* 1392 */     FinIndirizzo indirizzo = null;
/* 1393 */     indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*      */     
/* 1395 */     String nazionalita = getNazionalita(indirizzo.getNazione());
/* 1396 */     if (nazionalita == null) {
/*      */       
/* 1398 */       if (this.log.isErrorEnabled())
/*      */       {
/* 1400 */         this.log.error("Indirizzo non inserito --- Nazionalita errata");
/*      */       }
/* 1402 */       resultMap.putAppl("RESULT", "NATION_ERROR");
/* 1403 */       return resultMap;
/*      */     } 
/* 1405 */     indirizzo.setNazione(nazionalita);
/*      */     
/* 1407 */     paramMap.putAppl("INDIRIZZO", indirizzo);
/*      */     try {
/* 1409 */       getModuleManager().execModule("StoricizzaIndirizzoMD", paramMap);
/* 1410 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 1411 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1412 */       rse.setStackTrace(e.getStackTrace());
/* 1413 */       throw rse;
/*      */     } 
/*      */     
/* 1416 */     return resultMap;
/*      */   }
/*      */   
/*      */   private String getNazionalita(String nazionalita) throws RasServiceException {
/* 1420 */     MapContainer paramMap = new MapContainer();
/* 1421 */     MapContainer resultMap = null;
/* 1422 */     FinNazioniUic nazione = null;
/*      */     
/* 1424 */     paramMap.putAppl("NAZIONALITA", nazionalita);
/*      */     
/*      */     try {
/* 1427 */       resultMap = getModuleManager().execModule("GetNazionalitaByUicMD", paramMap);
/* 1428 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 1429 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1430 */       rse.setStackTrace(e.getStackTrace());
/* 1431 */       throw rse;
/*      */     } 
/*      */     
/* 1434 */     ArrayList result = (ArrayList)resultMap.getAppl("NAZIONALITA");
/* 1435 */     if (result.size() == 0) {
/*      */       
/*      */       try {
/* 1438 */         resultMap = getModuleManager().execModule("GetNazionalitaByIsoMD", paramMap);
/* 1439 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 1440 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1441 */         rse.setStackTrace(e.getStackTrace());
/* 1442 */         throw rse;
/*      */       } 
/*      */       
/* 1445 */       result = (ArrayList)resultMap.getAppl("NAZIONALITA");
/* 1446 */       if (result.size() == 0)
/*      */       {
/* 1448 */         return null;
/*      */       }
/*      */ 
/*      */       
/* 1452 */       nazione = result.get(0);
/* 1453 */       return nazione.getCodiceUic();
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1458 */     nazione = result.get(0);
/* 1459 */     return nazione.getCodiceUic();
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer updateContrIndir(Object oContrIndirOld) throws RasServiceException {
/* 1464 */     MapContainer paramMap = new MapContainer();
/* 1465 */     MapContainer resultMap = new MapContainer();
/* 1466 */     FinContrattoIndir contrIndirOld = null;
/* 1467 */     contrIndirOld = (FinContrattoIndir)getBean(oContrIndirOld, FinContrattoIndir.class);
/*      */     
/* 1469 */     paramMap.putAppl("ENTITA_DA_INSERIRE", contrIndirOld);
/*      */     try {
/* 1471 */       getModuleManager().execModule(this.moduloSingleEntity, paramMap);
/* 1472 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 1473 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1474 */       rse.setStackTrace(e.getStackTrace());
/* 1475 */       throw rse;
/*      */     } 
/*      */     
/* 1478 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) throws RasServiceException {
/* 1484 */     if (!resultMap.containsKeyAppl("RESULT")) {
/* 1485 */       resultMap.putAppl("RESULT", "INSERTED");
/*      */     
/*      */     }
/* 1488 */     else if (resultMap.getAppl("RESULT").equals("NATION_ERROR") && this.onLine) {
/*      */       
/* 1490 */       RasValidationSignal error = new RasValidationSignal("errors.ind.wrong.nat");
/* 1491 */       RasServiceException rse = new RasServiceException();
/*      */       
/* 1493 */       rse.addError(error);
/*      */       
/* 1495 */       throw rse;
/*      */     } 
/*      */     
/* 1498 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 1504 */     if (obj == null) {
/* 1505 */       String errorMessage = "Oggetto ricevuto nullo. Tipo atteso: " + c.getName();
/* 1506 */       if (this.log.isErrorEnabled()) {
/* 1507 */         this.log.error(errorMessage);
/*      */       }
/* 1509 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/* 1512 */     return obj;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAction() {
/* 1518 */     return this.action;
/*      */   }
/*      */   
/*      */   public void setAction(String action) {
/* 1522 */     this.action = action;
/*      */   }
/*      */   public void setNormalizer(RasNormalizer normalizer) {
/* 1525 */     this.normalizer = normalizer;
/*      */   }
/*      */   public RasNormalizer getNormalizer() {
/* 1528 */     return this.normalizer;
/*      */   }
/*      */   
/*      */   public boolean isOnLine() {
/* 1532 */     return this.onLine;
/*      */   }
/*      */   
/*      */   public void setOnLine(boolean onLine) {
/* 1536 */     this.onLine = onLine;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\IndirizzoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */