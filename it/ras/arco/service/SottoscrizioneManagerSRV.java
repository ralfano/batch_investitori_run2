/*      */ package it.ras.arco.service;
/*      */ 
/*      */ import it.ras.arco.bean.FinAltriProdDet;
/*      */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*      */ import it.ras.arco.bean.FinCointestazione;
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinContrattoBase;
/*      */ import it.ras.arco.bean.FinContrattoCC;
/*      */ import it.ras.arco.bean.FinContrattoIndir;
/*      */ import it.ras.arco.bean.FinContrattoIndirAdapterBase;
/*      */ import it.ras.arco.bean.FinContrattoPromotore;
/*      */ import it.ras.arco.bean.FinContrattoPromotoreAdapterBase;
/*      */ import it.ras.arco.bean.FinDispPagamento;
/*      */ import it.ras.arco.bean.FinEmittente;
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinIndirizzoRam;
/*      */ import it.ras.arco.bean.FinNumContratti;
/*      */ import it.ras.arco.bean.FinOrdine;
/*      */ import it.ras.arco.bean.FinPosizione;
/*      */ import it.ras.arco.bean.FinProdotto;
/*      */ import it.ras.arco.bean.FinPromotore;
/*      */ import it.ras.arco.bean.FinRuolo;
/*      */ import it.ras.arco.bean.FinServizioAggiuntivo;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.bean.FinSottoscrEmittente;
/*      */ import it.ras.arco.bean.FinSottoscrServAgg;
/*      */ import it.ras.arco.bean.FinSottoscrizione;
/*      */ import it.ras.arco.bean.FinSottoscrizioneCont;
/*      */ import it.ras.arco.bean.FinSottoscrizioneContAdapterBase;
/*      */ import it.ras.arco.common.resources.Utility;
/*      */ import it.ras.arco.mei.EventTypeNotSupportedException;
/*      */ import it.ras.arco.mei.IFactoryLocator;
/*      */ import it.ras.arco.mei.SottoscrizioneInconsistenteException;
/*      */ import it.ras.arco.ordine.adapter.FinOrdineAdapter;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import it.ras.flag.config.rules.IRuleEngine;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import it.ras.flag.workflow.SimpleWorkFlowManagedService;
/*      */ import java.math.BigDecimal;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Collection;
/*      */ import java.util.Collections;
/*      */ import java.util.Comparator;
/*      */ import java.util.Date;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Map;
/*      */ import java.util.Set;
/*      */ import org.apache.commons.beanutils.PropertyUtils;
/*      */ import org.apache.commons.lang.StringUtils;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ import org.hibernate.LazyInitializationException;
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
/*      */ public class SottoscrizioneManagerSRV
/*      */   extends SimpleWorkFlowManagedService
/*      */ {
/*   74 */   private final Log log = LogFactory.getLog(getClass());
/*      */   
/*   76 */   public static final String UTENTE_GSTD = Utility.getUtenteGstd(SottoscrizioneManagerSRV.class);
/*      */ 
/*      */   
/*      */   public static final String ESEGUI_SALVATAGGIO_KEY = "ESEGUI_SALVATAGGIO_KEY";
/*      */ 
/*      */   
/*      */   public static final String NULL_ACTION = "Azione nulla";
/*      */ 
/*      */   
/*      */   public static final String SOTTOSCRIZIONE_ID = "SOTTOSCRIZIONE_ID";
/*      */ 
/*      */   
/*      */   public static final String EMITTENTE_ID = "EMITTENTE_ID";
/*      */   
/*      */   public static final String NUMERO_CONTRATTO = "NUMERO_CONTRATTO";
/*      */   
/*      */   public static final String PROMOTORE = "PROMOTORE";
/*      */   
/*      */   public static final String PROMOTORE_ID = "PROMOTORE_ID";
/*      */   
/*      */   public static final String SPLIT_PROMOTORE = "SPLIT_PROMOTORE";
/*      */   
/*      */   public static final String COINTESTAZIONE = "COINTESTAZIONE";
/*      */   
/*      */   public static final String COINTESTAZIONE_ID = "COINTESTAZIONE_ID";
/*      */   
/*      */   public static final String SOGGETTO = "SOGGETTO";
/*      */   
/*      */   public static final String SOGGETTO_ID = "SOGGETTO_ID";
/*      */   
/*      */   public static final String POSIZIONE_ID = "POSIZIONE_ID";
/*      */   
/*      */   public static final String POSIZIONE = "POSIZIONE";
/*      */   
/*      */   public static final String CONTRATTO_ID = "CONTRATTO_ID";
/*      */   
/*      */   public static final String CONTRATTO = "CONTRATTO";
/*      */   
/*      */   public static final String RICHIEDENTE = "RICHIEDENTE";
/*      */   
/*      */   public static final String PRIMO_INTESTATARIO = "PRIMO_INTESTATARIO";
/*      */   
/*      */   public static final String INDIRIZZO_ID = "INDIRIZZO_ID";
/*      */   
/*      */   public static final String INDIRIZZO = "INDIRIZZO";
/*      */   
/*      */   public static final String LISTA_ORDINI = "LISTA_ORDINI";
/*      */   
/*      */   public static final String DISPOSIZIONI_PAGAMENTO = "DISPOSIZIONI_PAGAMENTO";
/*      */   
/*      */   public static final String DISPOSIZIONI_PAGAMENTO_ANNULLATE = "DISPOSIZIONI_PAGAMENTO_ANNULLATE";
/*      */   
/*      */   public static final String SERVIZIO_AGGIUTIVO = "SERVIZIO_AGGIUTIVO";
/*      */   
/*      */   public static final String SERVIZIO_AGGIUNTIVO_LIST = "SERVIZIO_AGGIUTIVO_LIST";
/*      */   
/*      */   public static final String SERVIZIO_AGGIUTIVO_ID = "SERVIZIO_AGGIUTIVO_ID";
/*      */   
/*      */   public static final String NUM_SOTTOSCRIZIONE = "NUM_SOTTOSCRIZIONE";
/*      */   
/*      */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*      */   
/*      */   public static final String NUM_DISP_ARCO = "NUM_DISP_ARCO";
/*      */   
/*      */   public static final String LISTA_RUOLI = "LISTA_RUOLI";
/*      */   
/*      */   public static final String ALTRI_PRODOTTI_DET = "ALTRI_PRODOTTI_DET";
/*      */   
/*      */   public static final String INSERIMENTO_BLOCCHI = "INSERIMENTO_BLOCCHI";
/*      */   
/*      */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*      */   
/*      */   public static final String GENERIC_MODULE_RESULT = "SOTTOSCRIZIONE";
/*      */   
/*      */   public static final String GET_BY_SOTT_ID = "GetSottoscrizioneBySottoscrizioneId";
/*      */   
/*      */   public static final String GET_BY_NUM_SOTT = "GetSottoscrizioneByNumSottoscrizioneMD";
/*      */   
/*      */   public static final String GET_BY_CSOT = "GetSottoscrizioneByCSOTSECMD";
/*      */   
/*      */   public static final String INSERT_SOTTOSCRIZIONE = "InsSottoscrizione";
/*      */   
/*      */   public static final String UPDATE_SOTTOSCRIZIONE = "UpdSottoscrizione";
/*      */   
/*      */   public static final String GET_BY_NUM_DISP_ARCO = "GetSottoscrizioneByNumDispRam";
/*      */   
/*      */   public static final String INSERT_SOTTOSCRIZIONE_SAVE_UPDATE = "InsSottoscrizioneSaveUpdate";
/*      */   
/*      */   public static final String INSERT_SOTTOSCRIZIONE_CONT = "InsSottoscrizioneCont";
/*      */   
/*      */   public static final String FORCE_FAILURE_IN_FUNCTIONAL_VALIDATION_MCK = "FORCE_FAILURE_IN_FUNCTIONAL_VALIDATION";
/*      */   
/*      */   public static final String FORCE_FAILURE_IN_FUNCTIONAL_VALIDATION_YES = "YES";
/*      */   
/*      */   public static final String FORCE_FAILURE_IN_FUNCTIONAL_VALIDATION_NO = "NO";
/*      */   
/*      */   public static final String USER_LOGGED = "USER_LOGGED";
/*      */   
/*  174 */   private static final Object SIMPLE_SAVE_OPERATION = "SIMPLE_SAVE_OPERATION";
/*      */   
/*      */   private static final String IND_SOTTOSCRIZIONE = "SOT";
/*      */   
/*      */   public static final String MODULO_SEQUENCE_DISPOSIZIONE_RAM = "getSequenceNumeroDisposizioneRAM";
/*      */   
/*      */   public static final String SEQ_NUM_DISP_RAM = "DISPOSIZIONE_RAM_SEQ";
/*      */   
/*      */   public static final String SEQUENCE_NAME = "SEQUENCE_NAME";
/*      */   
/*      */   public static final String SEQUENCE_VALUE = "SEQUENCE_VALUE";
/*      */   
/*      */   public static final String WORKFLOW_ACTOR = "WORKFLOW_ACTOR";
/*      */   
/*      */   private static final String WORKFLOW_CTX_VARIABLE_ID = "WORKFLOW_CTX_VARIABLE_ID";
/*      */   
/*      */   public static final String SKIP_WORKFLOW_PROCESSING = "SKIP_WORKFLOW_PROCESSING";
/*      */   
/*      */   private String action;
/*      */   
/*  194 */   private IFactoryLocator factoryLocator = null;
/*      */   
/*  196 */   private IRuleEngine motoreDiRegole = null;
/*      */ 
/*      */ 
/*      */ 
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
/*      */ 
/*      */   
/*      */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/*  214 */     boolean jn = super.functionalValidation(map);
/*      */     
/*  216 */     if ("YES".equals(map.getAppl("FORCE_FAILURE_IN_FUNCTIONAL_VALIDATION")))
/*      */     {
/*  218 */       throw new RasServiceException();
/*      */     }
/*  220 */     return jn;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  227 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  228 */     Boolean allowMultipleRows = null;
/*      */     
/*  230 */     MapContainer resultMap = new MapContainer();
/*  231 */     MapContainer paramMap = new MapContainer();
/*  232 */     String moduleName = null;
/*      */     
/*  234 */     FinSottoscrizione sottoscrizione = null;
/*  235 */     FinSottoscrizioneCont sottoscrizioneCont = null;
/*      */     
/*  237 */     if (oAllowMultipleRows == null) {
/*  238 */       oAllowMultipleRows = new Boolean(false);
/*  239 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  240 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*      */       
/*  242 */       if (this.log.isErrorEnabled()) {
/*  243 */         this.log.error(errorMessage);
/*      */       }
/*  245 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*  247 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*      */     
/*  249 */     boolean eseguiSalvataggio = false;
/*      */     
/*  251 */     Object oSottoscrizione = map.getAppl("SOTTOSCRIZIONE");
/*  252 */     if (this.action.equals("GetSottoscrizioneBySottoscrizioneId")) {
/*  253 */       sottoscrizione = (FinSottoscrizione)getBean(oSottoscrizione, FinSottoscrizione.class.getName());
/*      */ 
/*      */       
/*  256 */       Integer sottoscrizioneId = sottoscrizione.getSottoscrizioneId();
/*  257 */       paramMap.putAppl("SOTTOSCRIZIONE_ID", sottoscrizioneId);
/*  258 */       moduleName = this.action;
/*  259 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  260 */       resultMap = processResultMap(resultMap, false);
/*  261 */     } else if (this.action.equals("GetSottoscrizioneByNumSottoscrizioneMD")) {
/*  262 */       sottoscrizione = (FinSottoscrizione)getBean(oSottoscrizione, FinSottoscrizione.class.getName());
/*      */ 
/*      */       
/*  265 */       String numSottoscrizione = sottoscrizione.getNumSottoscrizione();
/*  266 */       paramMap.putAppl("NUM_SOTTOSCRIZIONE", numSottoscrizione);
/*  267 */       moduleName = this.action;
/*  268 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  269 */       resultMap = processResultMap(resultMap, false);
/*  270 */     } else if (this.action.equals("GetSottoscrizioneByCSOTSECMD")) {
/*  271 */       sottoscrizione = (FinSottoscrizione)getBean(oSottoscrizione, FinSottoscrizione.class.getName());
/*      */ 
/*      */       
/*  274 */       String numSottoscrizione = sottoscrizione.getNumSottoscrizione();
/*  275 */       paramMap.putAppl("NUM_SOTTOSCRIZIONE", numSottoscrizione);
/*  276 */       moduleName = this.action;
/*  277 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  278 */       resultMap = processResultMap(resultMap, false);
/*      */     
/*      */     }
/*  281 */     else if (this.action.equals("GetSottoscrizioneByNumDispRam")) {
/*      */       
/*  283 */       sottoscrizione = (FinSottoscrizione)getBean(oSottoscrizione, FinSottoscrizione.class.getName());
/*      */       
/*  285 */       Integer numDisp = sottoscrizione.getNumeroDisposizioneRam();
/*  286 */       paramMap.putAppl("NUM_DISP_ARCO", numDisp);
/*  287 */       moduleName = this.action;
/*  288 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  289 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */     
/*      */     }
/*  292 */     else if (this.action.equals("InsSottoscrizione")) {
/*      */       
/*  294 */       eseguiSalvataggio = true;
/*  295 */       List disposizioniAnnullate = (List)map.getAppl("DISPOSIZIONI_PAGAMENTO_ANNULLATE");
/*      */       
/*  297 */       processaAddebitiInContoRbk(disposizioniAnnullate, sottoscrizione, map);
/*      */       
/*  299 */       sottoscrizione = (FinSottoscrizione)map.getAppl("SOTTOSCRIZIONE");
/*  300 */       List disposizioni = (List)map.getAppl("DISPOSIZIONI_PAGAMENTO");
/*  301 */       processaAddebitiInContoRbk(disposizioni, sottoscrizione, map);
/*      */ 
/*      */       
/*  304 */       MapContainer outMap = null;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  309 */       Utility.setInsertGSTDvalues((RasORMBean)sottoscrizione, UTENTE_GSTD);
/*      */ 
/*      */       
/*  312 */       if (map.getAppl("USER_LOGGED") != null) {
/*  313 */         sottoscrizione.setUtenteInserimento((String)map.getAppl("USER_LOGGED"));
/*      */       }
/*      */ 
/*      */       
/*  317 */       sottoscrizione.setStato("A");
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  322 */       FinPromotore promotore = (FinPromotore)map.getAppl("PROMOTORE");
/*      */ 
/*      */       
/*  325 */       if (promotore != null && 
/*  326 */         promotore.getPromotoreId() != null) {
/*  327 */         map.putAppl("PROMOTORE_ID", promotore.getPromotoreId());
/*  328 */         outMap = getModuleManager().execModule("getPromotoreMD", map);
/*      */         
/*  330 */         promotore = (FinPromotore)outMap.getAppl("PROMOTORE");
/*  331 */         sottoscrizione.setPromotore(promotore);
/*      */         
/*  333 */         Set sottoscrizioni = new HashSet();
/*  334 */         sottoscrizioni.add(sottoscrizione);
/*  335 */         promotore.setSottoscrizioni(sottoscrizioni);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  341 */       FinPromotore promotoreSplit = (FinPromotore)map.getAppl("SPLIT_PROMOTORE");
/*      */ 
/*      */       
/*  344 */       if (promotoreSplit != null && promotoreSplit.getPromotoreId() != null) {
/*      */ 
/*      */         
/*  347 */         map.putAppl("PROMOTORE_ID", promotoreSplit.getPromotoreId());
/*  348 */         outMap = getModuleManager().execModule("getPromotoreMD", map);
/*  349 */         promotoreSplit = (FinPromotore)outMap.getAppl("PROMOTORE");
/*  350 */         sottoscrizione.setPromotoreSplit(promotoreSplit);
/*      */         
/*  352 */         Set sottoscrizioniSplit = new HashSet();
/*  353 */         sottoscrizioniSplit.add(promotoreSplit);
/*  354 */         promotoreSplit.setSottoscrizioniSplit(sottoscrizioniSplit);
/*      */       } 
/*      */ 
/*      */       
/*  358 */       FinCointestazione cointestazione = (FinCointestazione)map.getAppl("COINTESTAZIONE");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  367 */       Set soggetti = Collections.EMPTY_SET;
/*  368 */       Map cacheCoint = new HashMap();
/*      */       
/*  370 */       if (cointestazione != null) {
/*  371 */         if (cointestazione.getCointestazioneId() != null) {
/*  372 */           map.putAppl("COINTESTAZIONE_ID", cointestazione.getCointestazioneId());
/*      */           
/*  374 */           outMap = getModuleManager().execModule("getCointestazioneMD", map);
/*      */           
/*  376 */           cointestazione = (FinCointestazione)outMap.getAppl("COINTESTAZIONE");
/*      */           
/*  378 */           cacheCoint.put(cointestazione.getCointestazioneId(), cointestazione);
/*      */         } 
/*      */ 
/*      */         
/*  382 */         soggetti = cointestazione.getCointestazioni();
/*      */ 
/*      */         
/*  385 */         if (soggetti != null) {
/*  386 */           Iterator soggettiIter = soggetti.iterator();
/*      */           
/*  388 */           while (soggettiIter.hasNext()) {
/*  389 */             FinCointestazione current = soggettiIter.next();
/*      */             
/*  391 */             FinSoggetto currentSoggetto = current.getSoggetto();
/*      */             
/*  393 */             if (currentSoggetto != null && currentSoggetto.getSoggettoId() != null) {
/*      */               
/*  395 */               map.putAppl("SOGGETTO_ID", currentSoggetto.getSoggettoId());
/*      */               
/*  397 */               outMap = getModuleManager().execModule("getSoggettoMD", map);
/*      */ 
/*      */               
/*  400 */               FinSoggetto soggettoDB = (FinSoggetto)outMap.getAppl("SOGGETTO");
/*      */               
/*  402 */               current.setSoggetto(soggettoDB);
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  410 */       FinSoggetto richiedente = (FinSoggetto)map.getAppl("RICHIEDENTE");
/*      */ 
/*      */       
/*  413 */       FinIndirizzo indirizzo = (FinIndirizzo)map.getAppl("INDIRIZZO");
/*      */ 
/*      */       
/*  416 */       if (!Utility.isIndirizzoInputed(indirizzo)) {
/*  417 */         indirizzo = null;
/*      */       }
/*      */       
/*  420 */       boolean indirizzoDaSalvare = false;
/*  421 */       boolean indirizzoDaDuplicare = true;
/*  422 */       boolean residenzaRicModificata = false;
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  427 */       if (indirizzo != null && indirizzo.getIndirizzoId() != null) {
/*  428 */         map.putAppl("INDIRIZZO_ID", indirizzo.getIndirizzoId());
/*  429 */         outMap = getModuleManager().execModule("getIndirizzoMD", map);
/*      */         
/*  431 */         FinIndirizzo indirizzoDB = (FinIndirizzo)outMap.getAppl("INDIRIZZO");
/*      */ 
/*      */         
/*  434 */         if (indirizzoDB != null && !indirizzoDB.equals(indirizzo)) {
/*      */ 
/*      */ 
/*      */           
/*  438 */           if (indirizzo.isResidenzaRichiedente()) {
/*  439 */             residenzaRicModificata = true;
/*      */           }
/*      */ 
/*      */           
/*  443 */           if (indirizzo instanceof FinIndirizzoRam) {
/*  444 */             indirizzo.setTipoIndirizzo("COS");
/*      */           }
/*  446 */           else if (indirizzo instanceof it.ras.arco.bean.FinIndirizzoOth) {
/*  447 */             indirizzo.setTipoIndirizzo("OTH");
/*      */           } 
/*      */ 
/*      */           
/*  451 */           Utility.setInsertGSTDvalues((RasORMBean)indirizzo, UTENTE_GSTD);
/*  452 */           indirizzoDaSalvare = true;
/*  453 */           indirizzo.setIndirizzoId(null);
/*  454 */         } else if (indirizzoDB != null && indirizzoDB.equals(indirizzo)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  464 */           if (indirizzo instanceof FinIndirizzoRam) {
/*  465 */             indirizzo.setTipoIndirizzo("COS");
/*      */           }
/*  467 */           else if (indirizzo instanceof it.ras.arco.bean.FinIndirizzoOth) {
/*  468 */             indirizzo.setTipoIndirizzo("OTH");
/*      */           } 
/*      */ 
/*      */           
/*  472 */           indirizzoDaSalvare = true;
/*  473 */           indirizzoDaDuplicare = false;
/*  474 */           indirizzo.setIndirizzoId(null);
/*      */         }
/*      */       
/*  477 */       } else if (indirizzo != null && indirizzo.getIndirizzoId() == null) {
/*      */         
/*  479 */         indirizzoDaSalvare = true;
/*      */         
/*  481 */         indirizzo.setTipoIndirizzo("SOT");
/*      */         
/*  483 */         Utility.setInsertGSTDvalues((RasORMBean)indirizzo, UTENTE_GSTD);
/*      */       } 
/*      */       
/*  486 */       if (indirizzo != null) {
/*  487 */         Set setSottoscr = new HashSet();
/*  488 */         setSottoscr.add(sottoscrizione);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  493 */         if (indirizzoDaDuplicare) {
/*  494 */           FinIndirizzo sottIndir = new FinIndirizzo();
/*  495 */           indirizzo.copyProperties(sottIndir);
/*  496 */           sottIndir.setIndirizzoId(null);
/*  497 */           sottIndir.setSottoscrizioni(setSottoscr);
/*  498 */           sottoscrizione.setIndirizzo(sottIndir);
/*      */         } else {
/*  500 */           indirizzo.setSottoscrizioni(setSottoscr);
/*  501 */           sottoscrizione.setIndirizzo(indirizzo);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  506 */       boolean richiedenteSettato = false;
/*      */       
/*  508 */       if (soggetti != null) {
/*  509 */         Iterator soggettiIter = soggetti.iterator();
/*      */         
/*  511 */         while (soggettiIter.hasNext() && !richiedenteSettato) {
/*  512 */           FinCointestazione s = soggettiIter.next();
/*      */ 
/*      */           
/*  515 */           if (s.getSoggetto().getSoggettoId() != null && s.getSoggetto().getSoggettoId().equals(richiedente.getSoggettoId())) {
/*      */ 
/*      */             
/*  518 */             sottoscrizione.setSoggettoRichiedente(s.getSoggetto());
/*  519 */             richiedenteSettato = true;
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  530 */       List listaOrdini = (List)map.getAppl("LISTA_ORDINI");
/*      */       
/*  532 */       FinOrdineAdapter ordineX = null;
/*  533 */       FinContrattoBase contrattoX = null;
/*  534 */       FinPosizione posizioneX = null;
/*      */ 
/*      */ 
/*      */       
/*  538 */       Set numContrattiDaUtilizzare = new HashSet();
/*  539 */       boolean nuoviContratti = false;
/*  540 */       boolean contrattiAggiuntivi = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  546 */       FinContrattoBase nuovoContratto = null;
/*  547 */       int countAggiuntivi = 0;
/*  548 */       List listaServiziAggiuntivi = (List)map.getAppl("SERVIZIO_AGGIUTIVO_LIST");
/*      */ 
/*      */       
/*  551 */       Set toBeRemoved = new HashSet();
/*      */       
/*  553 */       if (listaOrdini != null) {
/*  554 */         int size = listaOrdini.size();
/*  555 */         for (int i = 0; i < size; i++) {
/*  556 */           FinContratto finContratto; ordineX = listaOrdini.get(i);
/*      */           
/*  558 */           Utility.setInsertGSTDvalues((RasORMBean)ordineX, UTENTE_GSTD);
/*  559 */           ordineX.setDataInserimentoOrdine(ordineX.getDataInserimento());
/*      */ 
/*      */           
/*  562 */           FinServizioAggiuntivo servAggPac = null;
/*  563 */           if (listaServiziAggiuntivi != null && listaServiziAggiuntivi.size() > countAggiuntivi) {
/*      */             
/*  565 */             servAggPac = listaServiziAggiuntivi.get(countAggiuntivi);
/*      */             
/*  567 */             countAggiuntivi++;
/*      */           } 
/*      */ 
/*      */           
/*  571 */           ordineX.setStato(sottoscrizione.getStato());
/*      */           
/*  573 */           if ("S".equals(ordineX.getFlagImportoDaDefinire())) {
/*  574 */             ordineX.setImporto(new Double(0.0D));
/*      */           }
/*      */ 
/*      */ 
/*      */           
/*  579 */           FinAttivitaFinanziaria prodotto = ordineX.getAttivitaFin();
/*  580 */           ordineX.setDivisa(prodotto.getDivisaComp());
/*      */           
/*  582 */           posizioneX = ordineX.getPosizione();
/*  583 */           contrattoX = posizioneX.getContratto();
/*      */ 
/*      */           
/*  586 */           if (contrattoX.getContrattoId() == null) {
/*      */             
/*  588 */             if (nuovoContratto == null) {
/*  589 */               nuovoContratto = contrattoX;
/*      */             }
/*      */             
/*  592 */             nuoviContratti = true;
/*      */             
/*  594 */             FinNumContratti numContX = contrattoX.getNumeroContratto();
/*      */             
/*  596 */             if ("ASS".equals(numContX.getTipoGenerazione())) {
/*      */               
/*  598 */               numContX.setStato("U");
/*  599 */               Utility.setUpdateGSTDvalues((RasORMBean)numContX, UTENTE_GSTD);
/*  600 */               numContrattiDaUtilizzare.add(numContX);
/*      */             } 
/*  602 */             Utility.setInsertGSTDvalues((RasORMBean)contrattoX, UTENTE_GSTD);
/*  603 */             contrattoX.setStatoContratto("a");
/*      */             
/*  605 */             contrattoX.setDataSottoscrizione(sottoscrizione.getDataSottoscr());
/*      */ 
/*      */             
/*  608 */             FinSoggetto primoIntestatario = (FinSoggetto)map.getAppl("PRIMO_INTESTATARIO");
/*      */ 
/*      */             
/*  611 */             Iterator soggettiIter = soggetti.iterator();
/*      */             
/*  613 */             while (soggettiIter.hasNext()) {
/*  614 */               FinCointestazione s = soggettiIter.next();
/*      */               
/*  616 */               FinSoggetto cointSogg = s.getSoggetto();
/*      */               
/*  618 */               if (cointSogg.getSoggettoId() != null && cointSogg.getSoggettoId().equals(primoIntestatario.getSoggettoId()))
/*      */               {
/*      */                 
/*  621 */                 contrattoX.setSoggetto(cointSogg);
/*      */               }
/*      */ 
/*      */               
/*  625 */               if (indirizzoDaSalvare && cointSogg != null && cointSogg.getSoggettoId() != null && cointSogg.getSoggettoId().equals(richiedente.getSoggettoId()))
/*      */               {
/*      */ 
/*      */ 
/*      */                 
/*  630 */                 if (residenzaRicModificata) {
/*  631 */                   FinContrattoIndirAdapterBase contIndir = new FinContrattoIndirAdapterBase();
/*      */                   
/*  633 */                   if (indirizzo instanceof FinIndirizzoRam) {
/*  634 */                     ((FinIndirizzoRam)indirizzo).setSoggettoRam(cointSogg);
/*      */                     
/*  636 */                     contIndir.setTipoIndirizzo("COS");
/*      */                   }
/*  638 */                   else if (indirizzo instanceof it.ras.arco.bean.FinIndirizzoOth) {
/*  639 */                     contIndir.setTipoIndirizzo("OTH");
/*      */                   } 
/*      */ 
/*      */                   
/*  643 */                   Utility.setInsertGSTDvalues((RasORMBean)contIndir, UTENTE_GSTD);
/*      */                   
/*  645 */                   contIndir.setDataInizio(Calendar.getInstance().getTime());
/*      */                   
/*  647 */                   contIndir.setDataFine(Utility.getDataInfinito());
/*      */                   
/*  649 */                   contIndir.setIndirizzo(indirizzo);
/*  650 */                   contIndir.setContratto((FinContratto)contrattoX);
/*  651 */                   contrattoX.setIndirizzo(new HashSet());
/*  652 */                   contrattoX.getIndirizzo().add(contIndir);
/*  653 */                   indirizzo.setContratto(new HashSet());
/*  654 */                   indirizzo.getContratto().add(contIndir);
/*      */                 } 
/*      */               }
/*      */             } 
/*      */             
/*  659 */             contrattoX.setCointestazione(cointestazione);
/*      */             
/*  661 */             Set setContratti = new HashSet();
/*  662 */             setContratti.add(contrattoX);
/*  663 */             cointestazione.setContratto(setContratti);
/*      */             
/*  665 */             FinContrattoPromotoreAdapterBase contPromo = new FinContrattoPromotoreAdapterBase();
/*  666 */             Utility.setInsertGSTDvalues((RasORMBean)contPromo, UTENTE_GSTD);
/*      */             
/*  668 */             contPromo.setContratto(contrattoX);
/*  669 */             contPromo.setPromotore(promotore);
/*      */ 
/*      */             
/*  672 */             contPromo.setDataFine(Utility.getDataInfinito());
/*  673 */             contPromo.setDataInizio(Calendar.getInstance().getTime());
/*      */             
/*  675 */             contPromo.setFlagAttuale("S");
/*  676 */             contPromo.setFlagSplit("N");
/*      */             
/*  678 */             FinContrattoPromotoreAdapterBase contPromoSplit = null;
/*      */             
/*  680 */             if (promotoreSplit != null && promotoreSplit.getPromotoreId() != null) {
/*      */               
/*  682 */               contPromoSplit = new FinContrattoPromotoreAdapterBase();
/*  683 */               Utility.setInsertGSTDvalues((RasORMBean)contPromoSplit, UTENTE_GSTD);
/*      */ 
/*      */               
/*  686 */               contPromoSplit.setContratto(contrattoX);
/*  687 */               contPromoSplit.setPromotore(promotoreSplit);
/*      */ 
/*      */               
/*  690 */               contPromoSplit.setDataFine(Utility.getDataInfinito());
/*      */               
/*  692 */               contPromoSplit.setDataInizio(Calendar.getInstance().getTime());
/*      */               
/*  694 */               contPromoSplit.setFlagAttuale("S");
/*  695 */               contPromoSplit.setFlagSplit("S");
/*  696 */               contPromoSplit.setPercRipartiz(sottoscrizione.getPercentualeSplit());
/*      */             } 
/*      */ 
/*      */             
/*  700 */             Set setAssegnazioni = new HashSet();
/*  701 */             setAssegnazioni.add(contPromo);
/*      */             
/*  703 */             if (contPromoSplit != null) {
/*  704 */               setAssegnazioni.add(contPromoSplit);
/*      */             }
/*      */             
/*  707 */             contrattoX.setAssegnazione(setAssegnazioni);
/*      */             
/*  709 */             Set setContrAss = new HashSet();
/*  710 */             setContrAss.add(contPromo);
/*      */             
/*  712 */             if (contPromoSplit != null) {
/*  713 */               setContrAss.add(contPromoSplit);
/*      */             }
/*      */             
/*  716 */             promotore.setAssegnazione(setContrAss);
/*      */ 
/*      */             
/*  719 */             if (servAggPac != null) {
/*  720 */               if (servAggPac.getServAggiunId() != null) {
/*      */                 
/*  722 */                 String stato = servAggPac.getStato();
/*  723 */                 Date fineAttivazione = servAggPac.getDataFineAttivazione();
/*      */                 
/*  725 */                 map.putAppl("SERVIZIO_AGGIUTIVO_ID", servAggPac.getServAggiunId());
/*      */                 
/*  727 */                 outMap = getModuleManager().execModule("getServAggMD", map);
/*      */                 
/*  729 */                 servAggPac = (FinServizioAggiuntivo)outMap.getAppl("SERVIZIO_AGGIUTIVO");
/*      */                 
/*  731 */                 if (stato.equals("R")) {
/*      */                   
/*  733 */                   servAggPac.setDataFineAttivazione(fineAttivazione);
/*      */                   
/*  735 */                   Utility.setUpdateGSTDvalues((RasORMBean)servAggPac, Utility.getUtenteGstd(SottoscrizioneManagerSRV.class) + ": Revoca");
/*      */                 } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  743 */                 servAggPac.setStato(stato);
/*      */               } 
/*  745 */               Utility.setInsertGSTDvalues((RasORMBean)servAggPac, Utility.getUtenteGstd(SottoscrizioneManagerSRV.class) + ": modalità PAC");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  752 */               Set setServAgg = new HashSet();
/*  753 */               setServAgg.add(servAggPac);
/*  754 */               servAggPac.setPosizione(posizioneX);
/*  755 */               posizioneX.setServizioAgg(setServAgg);
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
/*  771 */               FinSottoscrServAgg sottoscrServAgg = new FinSottoscrServAgg();
/*  772 */               Utility.setInsertGSTDvalues((RasORMBean)sottoscrServAgg, UTENTE_GSTD);
/*      */               
/*  774 */               sottoscrServAgg.setSottoscrizione(sottoscrizione);
/*  775 */               sottoscrServAgg.setServizioAggiuntivo(servAggPac);
/*      */               
/*  777 */               Set newSottServAgg = servAggPac.getSottoscrServAgg();
/*      */               
/*  779 */               if (newSottServAgg == null)
/*  780 */                 newSottServAgg = new HashSet(); 
/*  781 */               newSottServAgg.add(sottoscrServAgg);
/*  782 */               servAggPac.setSottoscrServAgg(newSottServAgg);
/*      */               
/*  784 */               Set newSottServAgg2 = sottoscrizione.getSottoscrServAgg();
/*      */               
/*  786 */               if (newSottServAgg2 == null)
/*  787 */                 newSottServAgg2 = new HashSet(); 
/*  788 */               newSottServAgg2.add(sottoscrServAgg);
/*  789 */               sottoscrizione.setSottoscrServAgg(newSottServAgg2);
/*      */             }
/*      */           
/*      */           }
/*      */           else {
/*      */             
/*  795 */             if (Utility.isOrdineDaRimuovere((FinOrdine)ordineX)) {
/*  796 */               if (ordineX.getOrdineId() == null) {
/*  797 */                 toBeRemoved.add(ordineX);
/*      */               } else {
/*  799 */                 ordineX.setFlagEsistenza("N");
/*      */               } 
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  807 */             if ("102".equals(ordineX.getTipo()))
/*      */             {
/*  809 */               contrattiAggiuntivi = true;
/*      */             }
/*      */ 
/*      */             
/*  813 */             Double qtPrenotata = posizioneX.getQtPrenotata();
/*  814 */             if (posizioneX.getPosizioneId() != null) {
/*  815 */               map.putAppl("POSIZIONE_ID", posizioneX.getPosizioneId());
/*      */               
/*  817 */               outMap = getModuleManager().execModule("getPosizioneMD", map);
/*      */               
/*  819 */               posizioneX = (FinPosizione)outMap.getAppl("POSIZIONE");
/*      */             } 
/*      */ 
/*      */             
/*  823 */             if (qtPrenotata != null) {
/*  824 */               posizioneX.setQtPrenotata(new Double(qtPrenotata.doubleValue()));
/*      */             }
/*      */ 
/*      */ 
/*      */             
/*  829 */             FinServizioAggiuntivo servAgg = (FinServizioAggiuntivo)map.getAppl("SERVIZIO_AGGIUTIVO");
/*      */ 
/*      */             
/*  832 */             if (servAgg != null) {
/*  833 */               if (servAgg.getServAggiunId() != null) {
/*      */                 
/*  835 */                 String stato = servAgg.getStato();
/*  836 */                 Date fineAttivazione = servAgg.getDataFineAttivazione();
/*      */                 
/*  838 */                 map.putAppl("SERVIZIO_AGGIUTIVO_ID", servAgg.getServAggiunId());
/*      */                 
/*  840 */                 outMap = getModuleManager().execModule("getServAggMD", map);
/*      */                 
/*  842 */                 servAgg = (FinServizioAggiuntivo)outMap.getAppl("SERVIZIO_AGGIUTIVO");
/*      */                 
/*  844 */                 if (stato.equals("R")) {
/*      */                   
/*  846 */                   servAgg.setDataFineAttivazione(fineAttivazione);
/*      */                   
/*  848 */                   Utility.setUpdateGSTDvalues((RasORMBean)servAgg, Utility.getUtenteGstd(SottoscrizioneManagerSRV.class) + ": Revoca");
/*      */                 } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  856 */                 servAgg.setStato(stato);
/*      */               } 
/*      */               
/*  859 */               Set setServAgg = new HashSet();
/*  860 */               setServAgg.add(servAgg);
/*  861 */               servAgg.setPosizione(posizioneX);
/*  862 */               posizioneX.setServizioAgg(setServAgg);
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
/*  876 */               FinSottoscrServAgg sottoscrServAgg = new FinSottoscrServAgg();
/*  877 */               Utility.setInsertGSTDvalues((RasORMBean)sottoscrServAgg, UTENTE_GSTD);
/*      */               
/*  879 */               sottoscrServAgg.setSottoscrizione(sottoscrizione);
/*  880 */               sottoscrServAgg.setServizioAggiuntivo(servAggPac);
/*      */               
/*  882 */               Set newSottServAgg = servAgg.getSottoscrServAgg();
/*  883 */               if (newSottServAgg == null)
/*  884 */                 newSottServAgg = new HashSet(); 
/*  885 */               newSottServAgg.add(sottoscrServAgg);
/*  886 */               servAgg.setSottoscrServAgg(newSottServAgg);
/*      */               
/*  888 */               Set newSottServAgg2 = sottoscrizione.getSottoscrServAgg();
/*      */               
/*  890 */               if (newSottServAgg2 == null)
/*  891 */                 newSottServAgg2 = new HashSet(); 
/*  892 */               newSottServAgg2.add(sottoscrServAgg);
/*  893 */               sottoscrizione.setSottoscrServAgg(newSottServAgg2);
/*      */             } 
/*      */ 
/*      */             
/*  897 */             String contrattoState = contrattoX.getStatoContratto();
/*      */ 
/*      */             
/*  900 */             map.putAppl("CONTRATTO_ID", contrattoX.getContrattoId());
/*  901 */             outMap = getModuleManager().execModule("getContrattoMD", map);
/*      */             
/*  903 */             finContratto = (FinContratto)outMap.getAppl("CONTRATTO");
/*      */             
/*  905 */             finContratto.setStatoContratto(contrattoState);
/*      */             
/*  907 */             finContratto.getProdotto();
/*  908 */             posizioneX.setContratto((FinContrattoBase)finContratto);
/*  909 */             ordineX.setPosizione(posizioneX);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  915 */             Iterator soggettiIter = soggetti.iterator();
/*      */             
/*  917 */             while (soggettiIter.hasNext()) {
/*  918 */               FinCointestazione s = soggettiIter.next();
/*      */ 
/*      */ 
/*      */               
/*  922 */               if (s.getSoggetto().getSoggettoId() != null && s.getSoggetto().getSoggettoId().equals(finContratto.getSoggetto().getSoggettoId()))
/*      */               {
/*      */ 
/*      */                 
/*  926 */                 finContratto.setSoggetto(s.getSoggetto());
/*      */               }
/*      */ 
/*      */               
/*  930 */               FinCointestazione cointX = finContratto.getCointestazione();
/*      */               
/*  932 */               if (cacheCoint.containsKey(cointX.getCointestazioneId())) {
/*      */                 
/*  934 */                 finContratto.setCointestazione((FinCointestazione)cacheCoint.get(cointX.getCointestazioneId()));
/*      */                 
/*      */                 continue;
/*      */               } 
/*      */               
/*  939 */               cacheCoint.put(cointX.getCointestazioneId(), cointX);
/*      */ 
/*      */               
/*  942 */               Set aggiuntivoCointestazioni = cointX.getCointestazioni();
/*      */               
/*  944 */               Iterator cointXIter = aggiuntivoCointestazioni.iterator();
/*      */ 
/*      */               
/*  947 */               while (cointXIter.hasNext()) {
/*  948 */                 FinCointestazione intestatario = cointXIter.next();
/*      */ 
/*      */                 
/*  951 */                 if (intestatario.getSoggetto() != null && s.getSoggetto() != null && intestatario.getSoggetto().getSoggettoId() != null && intestatario.getSoggetto().getSoggettoId().equals(s.getSoggetto().getSoggettoId()))
/*      */                 {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  962 */                   intestatario.setSoggetto(s.getSoggetto());
/*      */                 }
/*      */               } 
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  972 */           Set setOrdini = null;
/*      */           
/*  974 */           if (sottoscrizione.getOrdine() == null) {
/*  975 */             setOrdini = new HashSet();
/*      */           } else {
/*  977 */             setOrdini = sottoscrizione.getOrdine();
/*      */           } 
/*      */           
/*  980 */           setOrdini.add(ordineX);
/*  981 */           sottoscrizione.setOrdine(setOrdini);
/*  982 */           ordineX.setSottoscrizione(sottoscrizione);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  987 */           FinSottoscrizioneContAdapterBase sottoCont = new FinSottoscrizioneContAdapterBase();
/*  988 */           Utility.setInsertGSTDvalues((RasORMBean)sottoCont, UTENTE_GSTD);
/*      */           
/*  990 */           sottoCont.setSottoscrizione(sottoscrizione);
/*  991 */           sottoCont.setContratto((FinContrattoBase)finContratto);
/*      */           
/*  993 */           Set sottoscrizioneX = new HashSet();
/*  994 */           sottoscrizioneX.add(sottoCont);
/*  995 */           finContratto.setSottoscrizione(sottoscrizioneX);
/*      */           
/*  997 */           if (sottoscrizione.getContratto() == null) {
/*  998 */             sottoscrizione.setContratto(new HashSet());
/*      */           }
/*      */           
/* 1001 */           sottoscrizione.getContratto().add(sottoCont);
/*      */         } 
/*      */         
/* 1004 */         sottoscrizione.getOrdine().removeAll(toBeRemoved);
/*      */       } else {
/*      */         
/* 1007 */         FinAltriProdDet altriProdDet = (FinAltriProdDet)map.getAppl("ALTRI_PRODOTTI_DET");
/*      */ 
/*      */         
/* 1010 */         if (altriProdDet != null && altriProdDet.getContrattoId() == null) {
/*      */           
/* 1012 */           altriProdDet.setCointestazione(cointestazione);
/*      */           
/* 1014 */           cointestazione.setContratto(new HashSet());
/* 1015 */           cointestazione.getContratto().add(altriProdDet);
/*      */ 
/*      */           
/* 1018 */           FinContrattoPromotoreAdapterBase contPromo = new FinContrattoPromotoreAdapterBase();
/* 1019 */           Utility.setInsertGSTDvalues((RasORMBean)contPromo, UTENTE_GSTD);
/*      */           
/* 1021 */           contPromo.setContratto((FinContrattoBase)altriProdDet);
/* 1022 */           contPromo.setPromotore(promotore);
/*      */ 
/*      */           
/* 1025 */           contPromo.setDataFine(Utility.getDataInfinito());
/* 1026 */           contPromo.setDataInizio(Calendar.getInstance().getTime());
/* 1027 */           contPromo.setFlagAttuale("S");
/* 1028 */           contPromo.setFlagSplit("N");
/*      */           
/* 1030 */           FinContrattoPromotoreAdapterBase contPromoSplit = null;
/*      */           
/* 1032 */           if (promotoreSplit != null && promotoreSplit.getPromotoreId() != null) {
/*      */             
/* 1034 */             contPromoSplit = new FinContrattoPromotoreAdapterBase();
/* 1035 */             Utility.setInsertGSTDvalues((RasORMBean)contPromoSplit, UTENTE_GSTD);
/*      */ 
/*      */ 
/*      */             
/* 1039 */             contPromoSplit.setContratto((FinContrattoBase)altriProdDet);
/* 1040 */             contPromoSplit.setPromotore(promotoreSplit);
/*      */ 
/*      */             
/* 1043 */             contPromoSplit.setDataFine(Utility.getDataInfinito());
/* 1044 */             contPromoSplit.setDataInizio(Calendar.getInstance().getTime());
/*      */             
/* 1046 */             contPromoSplit.setFlagAttuale("S");
/* 1047 */             contPromoSplit.setFlagSplit("S");
/* 1048 */             contPromoSplit.setPercRipartiz(sottoscrizione.getPercentualeSplit());
/*      */           } 
/*      */           
/* 1051 */           Set setAssegnazioni = new HashSet();
/* 1052 */           setAssegnazioni.add(contPromo);
/*      */           
/* 1054 */           if (contPromoSplit != null) {
/* 1055 */             setAssegnazioni.add(contPromoSplit);
/*      */           }
/*      */           
/* 1058 */           altriProdDet.setAssegnazione(setAssegnazioni);
/*      */           
/* 1060 */           Set setContrAss = new HashSet();
/* 1061 */           setContrAss.add(contPromo);
/*      */           
/* 1063 */           if (contPromoSplit != null) {
/* 1064 */             setContrAss.add(contPromoSplit);
/*      */           }
/*      */           
/* 1067 */           promotore.setAssegnazione(setContrAss);
/* 1068 */         } else if (altriProdDet != null) {
/*      */           
/* 1070 */           Set assegna = altriProdDet.getAssegnazione();
/* 1071 */           Iterator itAssegna = assegna.iterator();
/* 1072 */           while (itAssegna.hasNext()) {
/* 1073 */             FinContrattoPromotoreAdapterBase contrPromotore = itAssegna.next();
/*      */             
/* 1075 */             contrPromotore.setPercRipartiz(sottoscrizione.getPercentualeSplit());
/*      */             
/* 1077 */             if ("S".equals(contrPromotore.getFlagSplit())) {
/*      */               
/* 1079 */               contrPromotore.setPromotore(promotoreSplit); continue;
/*      */             } 
/* 1081 */             contrPromotore.setPromotore(promotore);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1090 */       if (nuovoContratto != null && nuoviContratti) {
/* 1091 */         sottoscrizione.setPrimoContratto((FinContratto)nuovoContratto);
/*      */       }
/*      */ 
/*      */       
/* 1095 */       if (nuoviContratti && contrattiAggiuntivi) {
/* 1096 */         sottoscrizione.setNuovePosizioni("M");
/*      */       
/*      */       }
/* 1099 */       else if (nuoviContratti) {
/* 1100 */         sottoscrizione.setNuovePosizioni("S");
/*      */       }
/* 1102 */       else if (contrattiAggiuntivi) {
/* 1103 */         sottoscrizione.setNuovePosizioni("A");
/*      */       } else {
/*      */         
/* 1106 */         sottoscrizione.setNuovePosizioni("X");
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1114 */       if (sottoscrizione.getDispPagamento() == null) {
/* 1115 */         sottoscrizione.setDispPagamento(new HashSet());
/*      */       }
/*      */ 
/*      */       
/* 1119 */       Iterator iteraDisposizioni = null;
/* 1120 */       if (disposizioni != null) {
/* 1121 */         iteraDisposizioni = disposizioni.iterator();
/*      */       }
/*      */       
/* 1124 */       while (iteraDisposizioni != null && iteraDisposizioni.hasNext()) {
/* 1125 */         FinDispPagamento disposizionePag = iteraDisposizioni.next();
/*      */         
/* 1127 */         if (disposizionePag.getSoggetto() != null) {
/* 1128 */           FinSoggetto presentatore = disposizionePag.getSoggetto();
/* 1129 */           Iterator soggettiIter = soggetti.iterator();
/*      */           
/* 1131 */           while (soggettiIter.hasNext()) {
/* 1132 */             FinCointestazione s = soggettiIter.next();
/*      */ 
/*      */ 
/*      */             
/* 1136 */             if (s.getSoggetto() != null && s.getSoggetto().getSoggettoId() != null && s.getSoggetto().getSoggettoId().equals(presentatore.getSoggettoId())) {
/*      */ 
/*      */ 
/*      */               
/* 1140 */               disposizionePag.setSoggetto(s.getSoggetto());
/*      */               
/*      */               break;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */         
/* 1147 */         Utility.setInsertGSTDvalues((RasORMBean)disposizionePag, UTENTE_GSTD);
/* 1148 */         disposizionePag.setDataInserimento(Calendar.getInstance().getTime());
/*      */         
/* 1150 */         disposizionePag.setSottoscrizione(sottoscrizione);
/* 1151 */         sottoscrizione.getDispPagamento().add(disposizionePag);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1159 */       if (isSottoscrizioneRAM(sottoscrizione) && sottoscrizione.getNumeroDisposizioneRam() == null) {
/*      */         
/* 1161 */         Integer numeroSeqDispRam = getSequenceDisposizioneRAM();
/* 1162 */         if (numeroSeqDispRam != null) {
/* 1163 */           sottoscrizione.setNumeroDisposizioneRam(numeroSeqDispRam);
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*      */       try {
/* 1169 */         normalizzaSottoscrizioneEmittente(sottoscrizione);
/* 1170 */       } catch (EventTypeNotSupportedException e) {
/*      */       
/* 1172 */       } catch (SottoscrizioneInconsistenteException e) {}
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1177 */       Collection listaRuoli = (Collection)map.getAppl("LISTA_RUOLI");
/* 1178 */       if (listaRuoli != null) {
/* 1179 */         for (Iterator iter = listaRuoli.iterator(); iter.hasNext(); ) {
/* 1180 */           FinRuolo ruolo = iter.next();
/* 1181 */           ricostruisciRuolo(sottoscrizione, ruolo, map);
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1187 */       if (map.containsKeyAppl("ESEGUI_SALVATAGGIO_KEY")) {
/* 1188 */         eseguiSalvataggio = ((Boolean)map.getAppl("ESEGUI_SALVATAGGIO_KEY")).booleanValue();
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1193 */       if (eseguiSalvataggio) {
/* 1194 */         MapContainer param = new MapContainer();
/* 1195 */         param.putAppl("SOTTOSCRIZIONE", sottoscrizione);
/* 1196 */         param.putAppl("NUMERO_CONTRATTO", numContrattiDaUtilizzare);
/*      */         
/* 1198 */         getModuleManager().execModule("InsertSottoscrizioneMD", param);
/* 1199 */         getModuleManager().execModule("updateNumeroMD", param);
/*      */         
/* 1201 */         if (map.containsKeyAppl("POSIZIONE_FORZATA") && listaOrdini != null) {
/*      */           
/* 1203 */           Collection cInMap = (Collection)map.getAppl("POSIZIONE_FORZATA");
/*      */           
/* 1205 */           if (cInMap != null && cInMap.size() > 0) {
/* 1206 */             FinPosizione posizioneForzata = cInMap.iterator().next();
/*      */ 
/*      */             
/* 1209 */             FinOrdine ordinePos = (FinOrdine)listaOrdini.get(0);
/* 1210 */             ordinePos.getPosizione().setStatoPosizione(posizioneForzata.getStatoPosizione());
/*      */ 
/*      */             
/* 1213 */             Collection col = new ArrayList();
/* 1214 */             col.add(ordinePos.getPosizione());
/*      */             
/* 1216 */             map.putAppl("POSIZIONE_FORZATA", col);
/*      */             
/* 1218 */             getModuleManager().execModule("updatePosizioneForzata", map);
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 1223 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       }
/*      */     
/* 1226 */     } else if (this.action.equals("InsSottoscrizioneCont")) {
/* 1227 */       sottoscrizioneCont = (FinSottoscrizioneCont)map.getAppl("SOTTOSCR_CONT");
/*      */ 
/*      */       
/* 1230 */       MapContainer param = new MapContainer();
/* 1231 */       param.putAppl("SOTTOSCR_CONT", sottoscrizioneCont);
/* 1232 */       getModuleManager().execModule("InsertSottoscrContMD", param);
/* 1233 */       resultMap.putAppl("RESULT", "INSERTED");
/* 1234 */     } else if (this.action.equals("InsSottoscrizioneSaveUpdate")) {
/* 1235 */       eseguiSalvataggio = true;
/* 1236 */       sottoscrizione = (FinSottoscrizione)map.getAppl("SOTTOSCRIZIONE");
/*      */       
/* 1238 */       String utenteModifica = (String)map.getAppl("USER_LOGGED");
/* 1239 */       if (!ArchUtils.isValid(utenteModifica)) {
/* 1240 */         utenteModifica = UTENTE_GSTD;
/*      */       }
/* 1242 */       sottoscrizione.setUtenteInserimento(utenteModifica);
/*      */       
/* 1244 */       FinIndirizzo indirizzoRevisionato = revisionaIndirizzo(sottoscrizione, utenteModifica);
/*      */       
/* 1246 */       boolean eseguiRimozioneDiretta = true;
/* 1247 */       if (eseguiRimozioneDiretta && indirizzoRevisionato != null && "N".equals(indirizzoRevisionato.getFlagEsistenza())) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1253 */         MapContainer mapContainer = new MapContainer();
/* 1254 */         mapContainer.putAppl("INDIRIZZO", indirizzoRevisionato);
/* 1255 */         getModuleManager().execModule("InsertIndirizzoMD", mapContainer);
/*      */       } 
/*      */ 
/*      */       
/* 1259 */       List disposizioniAnnullate = (List)map.getAppl("DISPOSIZIONI_PAGAMENTO_ANNULLATE");
/*      */       
/* 1261 */       processaAddebitiInContoRbk(disposizioniAnnullate, sottoscrizione, map);
/*      */ 
/*      */       
/* 1264 */       List disposizioni = null;
/* 1265 */       if (sottoscrizione.getDispPagamento() != null) {
/*      */         try {
/* 1267 */           sottoscrizione.getDispPagamento().size();
/* 1268 */           disposizioni = new ArrayList(sottoscrizione.getDispPagamento());
/*      */         }
/* 1270 */         catch (LazyInitializationException e) {
/*      */           
/* 1272 */           disposizioni = null;
/*      */         } 
/*      */       } else {
/* 1275 */         disposizioni = null;
/*      */       } 
/* 1277 */       processaAddebitiInContoRbk(disposizioni, sottoscrizione, map);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1286 */       if (isSottoscrizioneRAM(sottoscrizione) && sottoscrizione.getNumeroDisposizioneRam() == null) {
/*      */ 
/*      */         
/* 1289 */         Integer numeroSeqDispRam = getSequenceDisposizioneRAM();
/* 1290 */         if (numeroSeqDispRam != null) {
/* 1291 */           sottoscrizione.setNumeroDisposizioneRam(numeroSeqDispRam);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1299 */       Set setOrdini = sottoscrizione.getOrdine();
/* 1300 */       if (setOrdini != null) {
/* 1301 */         Set toBeRemoved = new HashSet();
/* 1302 */         FinOrdine ordine = null;
/* 1303 */         if (setOrdini != null) {
/* 1304 */           Iterator iter = setOrdini.iterator();
/* 1305 */           while (iter.hasNext()) {
/* 1306 */             ordine = iter.next();
/*      */ 
/*      */ 
/*      */             
/* 1310 */             if (Utility.isOrdineDaRimuovere(ordine)) {
/* 1311 */               if (ordine.getOrdineId() == null) {
/* 1312 */                 toBeRemoved.add(ordine); continue;
/*      */               } 
/* 1314 */               ordine.setFlagEsistenza("N");
/*      */             } 
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/* 1320 */         setOrdini.removeAll(toBeRemoved);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1329 */       setOrdini = sottoscrizione.getOrdine();
/* 1330 */       Set numContrattiDaUtilizzare = new HashSet();
/* 1331 */       boolean updateStatoNumerocontratto = false;
/* 1332 */       if (setOrdini != null) {
/* 1333 */         Iterator iter = setOrdini.iterator();
/* 1334 */         while (iter.hasNext()) {
/* 1335 */           FinOrdine ordineX = iter.next();
/* 1336 */           if (ordineX != null && ordineX.getPosizione() != null) {
/* 1337 */             FinContrattoBase contrattoX = ordineX.getPosizione().getContratto();
/*      */ 
/*      */             
/* 1340 */             if (contrattoX != null && contrattoX.getContrattoId() == null) {
/*      */               
/* 1342 */               FinNumContratti numContX = contrattoX.getNumeroContratto();
/*      */               
/* 1344 */               if (numContX != null && "ASS".equals(numContX.getTipoGenerazione()) && !numContrattiDaUtilizzare.contains(numContX)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/* 1350 */                 numContX.setStato("U");
/* 1351 */                 Utility.setUpdateGSTDvalues((RasORMBean)numContX, UTENTE_GSTD);
/*      */                 
/* 1353 */                 numContrattiDaUtilizzare.add(numContX);
/* 1354 */                 updateStatoNumerocontratto = true;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/* 1360 */       if (updateStatoNumerocontratto) {
/* 1361 */         MapContainer mapContainer = new MapContainer();
/* 1362 */         mapContainer.putAppl("NUMERO_CONTRATTO", numContrattiDaUtilizzare);
/* 1363 */         getModuleManager().execModule("updateNumeroMD", mapContainer);
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1368 */       MapContainer param = new MapContainer();
/*      */       
/* 1370 */       param.putAppl("SOTTOSCRIZIONE", sottoscrizione);
/*      */ 
/*      */ 
/*      */       
/* 1374 */       getModuleManager().execModule("InsertSottoscrizioneMD", param);
/*      */ 
/*      */ 
/*      */       
/* 1378 */       if (map.containsKeyAppl("INSERIMENTO_BLOCCHI")) {
/* 1379 */         getModuleManager().execModule("InsertBlocchiSottoscrizione", map);
/*      */       }
/*      */ 
/*      */       
/* 1383 */       resultMap.putAppl("RESULT", "INSERTED");
/* 1384 */     } else if (this.action.equals("UpdSottoscrizione")) {
/*      */       
/* 1386 */       sottoscrizione = (FinSottoscrizione)getBean(oSottoscrizione, FinSottoscrizione.class.getName());
/*      */       
/* 1388 */       paramMap.putAppl("SOTTOSCRIZIONE", sottoscrizione);
/* 1389 */       getModuleManager().execModule("UpdSottoscrizione", paramMap);
/* 1390 */       resultMap.putAppl("RESULT", "UPDATED");
/*      */     } else {
/* 1392 */       String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*      */ 
/*      */ 
/*      */       
/* 1396 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */ 
/*      */     
/* 1400 */     if (eseguiSalvataggio && map.containsKeyAppl("SKIP_WORKFLOW_PROCESSING")) {
/* 1401 */       eseguiSalvataggio = !((Boolean)map.getAppl("SKIP_WORKFLOW_PROCESSING")).booleanValue();
/*      */ 
/*      */       
/* 1404 */       if (!eseguiSalvataggio && this.log.isWarnEnabled()) {
/* 1405 */         this.log.warn("La gestione del workflow NON viene eseguita perche' nel MapContainer e' presente la chiave 'SKIP_WORKFLOW_PROCESSING' ed e' settata a 'true'");
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1414 */     if (sottoscrizione.getSottoscrizioneId() != null && eseguiSalvataggio) {
/*      */       
/* 1416 */       map.putAppl("WORKFLOW_ACTOR", recuperaUtenteWorkflow(map, sottoscrizione));
/*      */ 
/*      */ 
/*      */       
/* 1420 */       map.putAppl("WORKFLOW_CTX_VARIABLE_ID", new Long(sottoscrizione.getSottoscrizioneId().intValue()));
/*      */       
/* 1422 */       super.processBusinessLogic(map);
/*      */     } 
/*      */     
/* 1425 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Object recuperaUtenteWorkflow(MapContainer map, FinSottoscrizione sottoscrizione) {
/* 1436 */     if (ArchUtils.isValid((String)map.getAppl("USER_LOGGED"))) {
/* 1437 */       return map.getAppl("USER_LOGGED");
/*      */     }
/* 1439 */     if (sottoscrizione != null && ArchUtils.isValid(sottoscrizione.getUserUltimaModificaSlave()))
/*      */     {
/*      */       
/* 1442 */       return sottoscrizione.getUserUltimaModificaSlave();
/*      */     }
/* 1444 */     return Utility.getUtenteGstd(getClass());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private FinIndirizzo revisionaIndirizzo(FinSottoscrizione sottoscrizione, String utente) {
/* 1453 */     if (sottoscrizione == null) {
/* 1454 */       return null;
/*      */     }
/* 1456 */     if (sottoscrizione.getIndirizzo() == null) {
/* 1457 */       return null;
/*      */     }
/* 1459 */     boolean indirizzoValido = true;
/* 1460 */     FinIndirizzo i = sottoscrizione.getIndirizzo();
/*      */     
/* 1462 */     if (i != null) {
/* 1463 */       Utility.setInsertGSTDvalues((RasORMBean)i, utente);
/*      */     }
/*      */     
/* 1466 */     if (!Utility.isIndirizzoInputed(sottoscrizione.getIndirizzo())) {
/* 1467 */       if (i != null) {
/* 1468 */         i.setFlagEsistenza("N");
/*      */       }
/* 1470 */       sottoscrizione.setIndirizzo(null);
/* 1471 */       indirizzoValido = false;
/*      */     } else {
/* 1473 */       sottoscrizione.setIndirizzo(i);
/*      */     } 
/*      */     
/* 1476 */     boolean aggiornaIndirizziContratto = false;
/* 1477 */     if (aggiornaIndirizziContratto && sottoscrizione.getContratto() != null) {
/* 1478 */       Iterator iter = sottoscrizione.getContratto().iterator();
/* 1479 */       while (iter.hasNext()) {
/* 1480 */         FinSottoscrizioneCont sc = iter.next();
/* 1481 */         FinContrattoBase c = sc.getContratto();
/* 1482 */         if ("a".equals(c.getStatoContratto())) {
/*      */           
/* 1484 */           if (c.getIndirizzo() != null) {
/* 1485 */             Iterator iterator = c.getIndirizzo().iterator();
/* 1486 */             while (iterator.hasNext()) {
/* 1487 */               FinContrattoIndir ci = iterator.next();
/*      */               
/* 1489 */               if (indirizzoValido) {
/*      */                 
/* 1491 */                 i.copyProperties(ci.getIndirizzo());
/*      */                 continue;
/*      */               } 
/* 1494 */               ci.setFlagEsistenza("N");
/*      */               
/* 1496 */               ci.getIndirizzo().setFlagEsistenza("N");
/*      */             } 
/*      */             
/*      */             continue;
/*      */           } 
/* 1501 */           if (indirizzoValido) {
/* 1502 */             FinContrattoIndirAdapterBase ciab = new FinContrattoIndirAdapterBase();
/* 1503 */             FinIndirizzo indirizzoRimesso = new FinIndirizzo();
/* 1504 */             i.copyProperties(indirizzoRimesso);
/* 1505 */             ciab.setIndirizzo(indirizzoRimesso);
/* 1506 */             ciab.setContratto((FinContratto)c);
/* 1507 */             c.setIndirizzo(new HashSet());
/* 1508 */             c.getIndirizzo().add(ciab);
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1517 */     return i;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void ricostruisciRuolo(FinSottoscrizione sottoscrizione, FinRuolo ruolo, MapContainer map) throws RasServiceException {
/* 1528 */     if (sottoscrizione == null || ruolo == null) {
/*      */       return;
/*      */     }
/*      */     
/* 1532 */     FinContratto contratto = ruolo.getContratto();
/*      */     
/* 1534 */     if (contratto != null) {
/* 1535 */       if (contratto.getContrattoId() != null) {
/*      */         
/* 1537 */         map.putAppl("CONTRATTO_ID", contratto.getContrattoId());
/* 1538 */         MapContainer outMap = getModuleManager().execModule("getContrattoMD", map);
/*      */ 
/*      */         
/* 1541 */         contratto = (FinContratto)outMap.getAppl("CONTRATTO");
/*      */       } 
/*      */       
/* 1544 */       if (contratto.getRuolo() == null) {
/* 1545 */         contratto.setRuolo(new HashSet());
/*      */       }
/*      */       
/* 1548 */       contratto.getRuolo().add(ruolo);
/* 1549 */       ruolo.setContratto(contratto);
/*      */     } 
/*      */ 
/*      */     
/* 1553 */     FinSoggetto soggetto = ruolo.getSoggetto();
/*      */     
/* 1555 */     if (soggetto != null && soggetto.getSoggettoId() != null) {
/* 1556 */       map.putAppl("SOGGETTO_ID", soggetto.getSoggettoId());
/* 1557 */       MapContainer outMap = getModuleManager().execModule("getSoggettoMD", map);
/*      */ 
/*      */       
/* 1560 */       FinSoggetto soggettoCaricato = (FinSoggetto)outMap.getAppl("SOGGETTO");
/*      */ 
/*      */       
/* 1563 */       ruolo.setSoggetto(soggettoCaricato);
/*      */     } 
/*      */ 
/*      */     
/* 1567 */     FinSoggetto soggettoCollegato = ruolo.getSoggettoCollegato();
/*      */     
/* 1569 */     if (soggetto != null && soggetto.getSoggettoId() != null) {
/* 1570 */       map.putAppl("SOGGETTO_ID", soggettoCollegato.getSoggettoId());
/* 1571 */       MapContainer outMap = getModuleManager().execModule("getSoggettoMD", map);
/*      */ 
/*      */       
/* 1574 */       FinSoggetto soggettoCollegatoCaricato = (FinSoggetto)outMap.getAppl("SOGGETTO");
/*      */ 
/*      */       
/* 1577 */       ruolo.setSoggettoCollegato(soggettoCollegatoCaricato);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 1589 */     Object o = resultMap.getAppl("SOTTOSCRIZIONE");
/*      */     
/* 1591 */     if (o instanceof Collection) {
/* 1592 */       ArrayList result = (ArrayList)o;
/* 1593 */       resultMap.removeAppl("SOTTOSCRIZIONE");
/*      */       
/* 1595 */       if (result.size() == 0) {
/* 1596 */         resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */       }
/* 1598 */       else if (result.size() == 1) {
/* 1599 */         resultMap.putAppl("RESULT", "FOUND");
/*      */         
/* 1601 */         resultMap.putAppl("SOTTOSCRIZIONE", result.get(0));
/* 1602 */       } else if (allowMultipleRow) {
/* 1603 */         resultMap.putAppl("RESULT", "FOUND");
/*      */         
/* 1605 */         resultMap.putAppl("SOTTOSCRIZIONE", result);
/*      */       } else {
/* 1607 */         resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1612 */     return resultMap;
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
/*      */   private void normalizzaSottoscrizioneEmittente(FinSottoscrizione sottoscrizione) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException {
/* 1624 */     Log logger = LogFactory.getLog(getClass());
/*      */     
/* 1626 */     if (getFactoryLocator() == null) {
/* 1627 */       if (logger.isDebugEnabled()) {
/* 1628 */         logger.debug("L IFactoryLocator non e stato collegato al Servizio, impossibile eseguire.");
/*      */       }
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1635 */     Set seVecchie = sottoscrizione.getEmitSottoscrizioni();
/*      */     
/* 1637 */     Collection cEmittenti = getFactoryLocator().locateFactories(sottoscrizione);
/*      */ 
/*      */     
/* 1640 */     merge(sottoscrizione, seVecchie, UTENTE_GSTD);
/*      */     
/* 1642 */     Iterator iter = sottoscrizione.getEmitSottoscrizioni().iterator();
/* 1643 */     while (iter.hasNext()) {
/* 1644 */       FinSottoscrEmittente se = iter.next();
/* 1645 */       if (se.getSottoscrEmittenteId() == null) {
/* 1646 */         Utility.setInsertGSTDvalues((RasORMBean)se, UTENTE_GSTD);
/*      */       }
/*      */     } 
/* 1649 */     if (cEmittenti == null) {
/* 1650 */       if (logger.isDebugEnabled()) {
/* 1651 */         logger.debug("Nessuna Emittente individuata dall'IFactoryLocator.");
/*      */       
/*      */       }
/*      */     }
/* 1655 */     else if (logger.isDebugEnabled()) {
/* 1656 */       logger.debug("Individuate " + cEmittenti.size() + " Emittenti dall'IFactoryLocator.");
/*      */     } 
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
/*      */   private void merge(FinSottoscrizione sottoscrizione2, Set seVecchie, String utente) {
/* 1669 */     if (sottoscrizione2 == null || seVecchie == null || seVecchie.size() <= 0) {
/*      */       return;
/*      */     }
/*      */     
/* 1673 */     if (sottoscrizione2.getEmitSottoscrizioni() == null || sottoscrizione2.getEmitSottoscrizioni().size() <= 0)
/*      */     {
/* 1675 */       sottoscrizione2.setEmitSottoscrizioni(seVecchie);
/*      */     }
/* 1677 */     Set seNuove = sottoscrizione2.getEmitSottoscrizioni();
/* 1678 */     sottoscrizione2.setEmitSottoscrizioni(seVecchie);
/*      */     
/* 1680 */     for (Iterator iterator1 = seVecchie.iterator(); iterator1.hasNext(); ) {
/* 1681 */       FinSottoscrEmittente seVecchia = iterator1.next();
/* 1682 */       FinEmittente emitt = seVecchia.getEmittente();
/* 1683 */       if (emitt != null) {
/* 1684 */         emitt.setSottoscrEmittenti(null);
/*      */       }
/*      */       
/* 1687 */       boolean riproposta = false;
/* 1688 */       for (Iterator iterator = seNuove.iterator(); iterator.hasNext(); ) {
/* 1689 */         FinSottoscrEmittente seNuova = iterator.next();
/*      */         
/* 1691 */         if (seNuova.getEmittente().getEmittenteId().intValue() == seVecchia.getEmittente().getEmittenteId().intValue()) {
/*      */           
/* 1693 */           riproposta = true;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/* 1698 */       if (!riproposta) {
/* 1699 */         Utility.setUpdateGSTDvalues((RasORMBean)seVecchia, utente);
/* 1700 */         seVecchia.setFlagEsistenza("N");
/*      */       } 
/*      */     } 
/*      */     
/* 1704 */     for (Iterator iter = seNuove.iterator(); iter.hasNext(); ) {
/* 1705 */       FinSottoscrEmittente seNuova = iter.next();
/* 1706 */       boolean riproposta = false;
/* 1707 */       for (Iterator iterator = seVecchie.iterator(); iterator.hasNext(); ) {
/* 1708 */         FinSottoscrEmittente seVecchia = iterator.next();
/*      */         
/* 1710 */         if (seNuova.getEmittente().getEmittenteId().intValue() == seVecchia.getEmittente().getEmittenteId().intValue()) {
/*      */           
/* 1712 */           riproposta = true;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/* 1717 */       if (!riproposta) {
/* 1718 */         Utility.setInsertGSTDvalues((RasORMBean)seNuova, utente);
/* 1719 */         sottoscrizione2.getEmitSottoscrizioni().add(seNuova);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 1726 */     Object retObject = null;
/*      */     
/*      */     try {
/* 1729 */       Class c = Class.forName(className);
/*      */       
/* 1731 */       if (!c.isInstance(obj)) {
/* 1732 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1738 */         throw new RasServiceException(errorMessage);
/*      */       } 
/*      */       
/* 1741 */       retObject = obj;
/* 1742 */     } catch (ClassNotFoundException e) {
/* 1743 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/*      */ 
/*      */ 
/*      */       
/* 1747 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/* 1750 */     return retObject;
/*      */   }
/*      */   
/*      */   public void setAction(String action) {
/* 1754 */     this.action = action;
/*      */   }
/*      */   
/*      */   public String getAction() {
/* 1758 */     return this.action;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IFactoryLocator getFactoryLocator() {
/* 1765 */     return this.factoryLocator;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFactoryLocator(IFactoryLocator factoryLocator) {
/* 1773 */     this.factoryLocator = factoryLocator;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IRuleEngine getMotoreDiRegole() {
/* 1780 */     return this.motoreDiRegole;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMotoreDiRegole(IRuleEngine motoreDiRegole) {
/* 1788 */     this.motoreDiRegole = motoreDiRegole;
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
/*      */   private void processaAddebitiInContoRbk(List lista, FinSottoscrizione sott, MapContainer map) throws RasServiceException {
/* 1816 */     if (lista != null) {
/* 1817 */       Collections.sort(lista, new DisposizioniPagamentoComparator());
/*      */     } else {
/*      */       return;
/*      */     } 
/*      */     
/* 1822 */     for (int i = 0; i < lista.size(); i++) {
/* 1823 */       FinDispPagamento dispPag = (FinDispPagamento)lista.get(i);
/* 1824 */       FinDispPagamento esitoRegola = null;
/*      */       
/* 1826 */       if ("RBK".equals(dispPag.getMezzoPagamento())) {
/*      */ 
/*      */         
/* 1829 */         boolean prenota = (("S".equals(dispPag.getFlagEsistenza()) || !ArchUtils.isValid(dispPag.getFlagEsistenza())) && !ArchUtils.isValid(dispPag.getCodPartAvvis()));
/*      */ 
/*      */         
/* 1832 */         boolean annulla = ("N".equals(dispPag.getFlagEsistenza()) && ArchUtils.isValid(dispPag.getCodPartAvvis()));
/*      */ 
/*      */         
/* 1835 */         if (prenota || annulla) {
/*      */ 
/*      */           
/* 1838 */           List params = new ArrayList(6);
/* 1839 */           params.add(StringUtils.leftPad(dispPag.getNumCc(), 8, "0"));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1846 */           FinContrattoCC cc = dispPag.getContoCorrente();
/* 1847 */           FinPromotore promo = null;
/* 1848 */           if (cc != null) {
/*      */             try {
/* 1850 */               promo = (FinPromotore)PropertyUtils.getProperty(cc, "contrattoProxy.promotorePrincipale");
/*      */             }
/* 1852 */             catch (Exception e) {}
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1858 */           params.clear();
/* 1859 */           params.add(map.getAppl("USER_LOGGED"));
/* 1860 */           params.add(map.getAppl("CREDENZIALI_OPERATORE"));
/*      */ 
/*      */           
/* 1863 */           params.add(cc);
/* 1864 */           params.add(promo);
/* 1865 */           params.add(dispPag);
/* 1866 */           params.add(map.getAppl("JSESSIONID"));
/*      */           
/* 1868 */           if (prenota) {
/* 1869 */             esitoRegola = (FinDispPagamento)getMotoreDiRegole().executeActionRule("ruleBeanPrenotaPartita", params);
/*      */           
/*      */           }
/* 1872 */           else if (annulla) {
/* 1873 */             esitoRegola = (FinDispPagamento)getMotoreDiRegole().executeActionRule("ruleBeanAnnullaPartita", params);
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/* 1878 */           if (esitoRegola == null) {
/* 1879 */             throw new RasServiceException("it.ras.arco.ordine.disposizionePagamento.errori.prenotazione", dispPag.getNumCc());
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/* 1887 */           if (sott.getSottoscrizioneId() != null) {
/* 1888 */             deduplicaSoggettiInSottoscrizione(sott, cc);
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void deduplicaSoggettiInSottoscrizione(FinSottoscrizione sott, FinContrattoCC cc) {
/* 1899 */     Integer soggettoId = cc.getSoggetto().getSoggettoId();
/*      */     
/* 1901 */     if (sott.getSoggettoRichiedente().getSoggettoId().equals(soggettoId)) {
/* 1902 */       sott.setSoggettoRichiedente(cc.getSoggetto());
/*      */     }
/*      */ 
/*      */     
/* 1906 */     Set assegnazCC = cc.getAssegnazione();
/* 1907 */     Iterator assegnazIterCC = assegnazCC.iterator();
/* 1908 */     FinContrattoPromotore cpCC = null;
/* 1909 */     FinPromotore promoCC = null;
/* 1910 */     while (assegnazIterCC.hasNext()) {
/* 1911 */       cpCC = assegnazIterCC.next();
/* 1912 */       promoCC = cpCC.getPromotore();
/* 1913 */       if (sott.getPromotore() != null && sott.getPromotore().getPromotoreId().equals(promoCC.getPromotoreId()))
/*      */       {
/*      */         
/* 1916 */         sott.setPromotore(promoCC);
/*      */       }
/*      */       
/* 1919 */       if (sott.getPromotoreSplit() != null && sott.getPromotore().getPromotoreId().equals(promoCC.getPromotoreId()))
/*      */       {
/*      */         
/* 1922 */         sott.setPromotoreSplit(promoCC);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1927 */     FinContrattoBase cont = null;
/* 1928 */     FinSottoscrizioneCont sottCont = null;
/* 1929 */     Set set = sott.getContratto();
/* 1930 */     Iterator iter = set.iterator();
/* 1931 */     while (iter.hasNext()) {
/* 1932 */       sottCont = iter.next();
/* 1933 */       cont = sottCont.getContratto();
/*      */ 
/*      */       
/* 1936 */       if (cont.getSoggetto().getSoggettoId().equals(soggettoId)) {
/* 1937 */         cont.setSoggetto(cc.getSoggetto());
/*      */       }
/*      */ 
/*      */       
/* 1941 */       if (cont.getCointestazione().getCointestazioneId().equals(cc.getCointestazione().getCointestazioneId())) {
/*      */         
/* 1943 */         cont.setCointestazione(cc.getCointestazione());
/*      */         continue;
/*      */       } 
/* 1946 */       FinCointestazione coint = null;
/* 1947 */       FinCointestazione cointCC = null;
/* 1948 */       Set cointSet = cont.getCointestazione().getCointestazioni();
/* 1949 */       Iterator cointIter = cointSet.iterator();
/* 1950 */       while (cointIter.hasNext()) {
/* 1951 */         coint = cointIter.next();
/* 1952 */         Set cointSetCC = cc.getCointestazione().getCointestazioni();
/* 1953 */         Iterator cointIterCC = cointSetCC.iterator();
/* 1954 */         while (cointIterCC.hasNext()) {
/* 1955 */           cointCC = cointIterCC.next();
/*      */           
/* 1957 */           if (coint.getSoggetto().getSoggettoId().equals(cointCC.getSoggetto().getSoggettoId()))
/*      */           {
/* 1959 */             coint.setSoggetto(cointCC.getSoggetto());
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private Integer getSequenceDisposizioneRAM() throws RasServiceException {
/* 1968 */     Integer outValue = null;
/*      */ 
/*      */     
/* 1971 */     MapContainer smap = new MapContainer();
/* 1972 */     smap.putAppl("SEQUENCE_NAME", "DISPOSIZIONE_RAM_SEQ");
/* 1973 */     smap = getModuleManager().execModule("getSequenceNumeroDisposizioneRAM", smap);
/*      */     
/* 1975 */     Object seqValue = smap.getAppl("SEQUENCE_VALUE");
/* 1976 */     if (seqValue instanceof BigDecimal) {
/* 1977 */       int seqIntVal = ((BigDecimal)seqValue).intValue();
/* 1978 */       outValue = new Integer(seqIntVal);
/*      */     } 
/*      */     
/* 1981 */     return outValue;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean isSottoscrizioneRAM(FinSottoscrizione sottoscrizione) {
/* 1987 */     Set setOrdini = sottoscrizione.getOrdine();
/* 1988 */     if (setOrdini != null && setOrdini.size() > 0) {
/* 1989 */       FinOrdine primoOrdine = setOrdini.iterator().next();
/* 1990 */       if (primoOrdine != null) {
/* 1991 */         FinPosizione primaPosizione = primoOrdine.getPosizione();
/* 1992 */         if (primaPosizione != null) {
/* 1993 */           FinContrattoBase primoContratto = primaPosizione.getContratto();
/*      */           
/* 1995 */           if (primoContratto != null) {
/* 1996 */             FinProdotto prodotto = primoContratto.getProdotto();
/* 1997 */             if (prodotto != null) {
/* 1998 */               FinEmittente emittenteSottoscrizione = prodotto.getEmittente();
/*      */               
/* 2000 */               if (emittenteSottoscrizione != null) {
/* 2001 */                 Integer idEmittente = emittenteSottoscrizione.getEmittenteId();
/*      */                 
/* 2003 */                 if (14 == idEmittente.intValue())
/*      */                 {
/* 2005 */                   return true;
/*      */                 }
/*      */               }
/*      */             
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/* 2013 */     } else if (setOrdini == null && sottoscrizione.getTipoOperazione() != null && (sottoscrizione.getTipoOperazione().equals("ASA") || sottoscrizione.getTipoOperazione().equals("RSA"))) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2020 */       Set contratti = sottoscrizione.getContratto();
/* 2021 */       if (contratti != null) {
/* 2022 */         FinSottoscrizioneCont sottoscrCont = contratti.iterator().next();
/*      */         
/* 2024 */         if (sottoscrCont != null) {
/* 2025 */           FinContrattoBase contratto = sottoscrCont.getContratto();
/* 2026 */           if (contratto != null) {
/* 2027 */             FinProdotto prodotto = contratto.getProdotto();
/* 2028 */             if (prodotto != null) {
/* 2029 */               FinEmittente emittenteSottoscrizione = prodotto.getEmittente();
/*      */               
/* 2031 */               if (emittenteSottoscrizione != null) {
/* 2032 */                 Integer idEmittente = emittenteSottoscrizione.getEmittenteId();
/*      */                 
/* 2034 */                 if (14 == idEmittente.intValue())
/*      */                 {
/* 2036 */                   return true;
/*      */                 }
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 2045 */     return false;
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
/*      */   private class DisposizioniPagamentoComparator
/*      */     implements Comparator
/*      */   {
/*      */     private final SottoscrizioneManagerSRV this$0;
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
/*      */     private DisposizioniPagamentoComparator(SottoscrizioneManagerSRV this$0) {
/* 2074 */       SottoscrizioneManagerSRV.this = SottoscrizioneManagerSRV.this;
/*      */     }
/*      */ 
/*      */     
/*      */     public int compare(Object o1, Object o2) {
/* 2079 */       if (o1 == null || o2 == null) {
/* 2080 */         return 1;
/*      */       }
/*      */       
/* 2083 */       if (!(o1 instanceof FinDispPagamento) || !(o1 instanceof FinDispPagamento))
/*      */       {
/* 2085 */         return 1;
/*      */       }
/*      */       
/* 2088 */       int comparison = 0;
/* 2089 */       String esist1 = ((FinDispPagamento)o1).getFlagEsistenza();
/* 2090 */       String esist2 = ((FinDispPagamento)o2).getFlagEsistenza();
/*      */       
/* 2092 */       if (esist1 != null) {
/* 2093 */         comparison = esist1.compareTo(esist2);
/*      */       } else {
/* 2095 */         comparison = 1;
/*      */       } 
/*      */       
/* 2098 */       return (comparison == 0) ? 1 : comparison;
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\SottoscrizioneManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */