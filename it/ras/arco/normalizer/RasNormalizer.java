/*      */ package it.ras.arco.normalizer;
/*      */ 
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinIndirizzoRam;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.bean.FinSoggettoIndir;
/*      */ import it.ras.arco.common.service.SingleModuleService;
/*      */ import it.ras.arco.service.RasNormalizerExceptionSRV;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.config.IRasXmlFileReader;
/*      */ import it.ras.flag.exception.RasException;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.exception.RasValidationSignal;
/*      */ import it.ras.flag.query.NormalizzatoreContainer;
/*      */ import it.ras.flag.service.IRasService;
/*      */ import it.ras.flag.transaction.IRasRequiredTransaction;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.io.Serializable;
/*      */ import java.text.DateFormat;
/*      */ import java.text.SimpleDateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Date;
/*      */ import java.util.GregorianCalendar;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.Properties;
/*      */ import java.util.Set;
/*      */ import javax.sql.DataSource;
/*      */ import org.apache.commons.lang.StringEscapeUtils;
/*      */ import org.apache.commons.lang.StringUtils;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class RasNormalizer
/*      */   implements Serializable, IRasNormalizeUtilManager
/*      */ {
/*      */   public static final String DEFAULT_PIVA = "-1";
/*      */   public static final String DEFAULT_DENOMINAZIONE = "-1";
/*      */   public static final String INDIRIZZO_ITALIANO = "086";
/*      */   public static final String MINI_LIMIT = "MinLimit";
/*      */   public static final String MAX_LIMIT = "MaxLimit";
/*      */   public static final String INITIAL_LIMIT = "InitialLimit";
/*      */   public static final String INACTIVITY_TIMEOUT = "InactivityTimeout";
/*      */   public static final String ABANDONED_CONNECTION_TIMEOUT = "AbandonedConnectionTimeout";
/*      */   public static final String MAX_STATEMENTS_LIMIT = "MaxStatementsLimit";
/*      */   public static final String CHECK_INTERVAL = "PropertyCheckInterval";
/*      */   public static final String CONNECTION_WAIT_TIMEOUT = "ConnectionWaitTimeout";
/*      */   public static final String ERROR_NAME = "ERROR_NAME";
/*      */   public static final String ERROR_CF = "ERROR_CF";
/*      */   public static final String ERROR_PIVA = "ERROR_PIVA";
/*      */   public static final String ERROR_STREET = "ERROR_STREET";
/*      */   public static final String ERROR_PLACE = "ERROR_PLACE";
/*      */   public static final String ERROR_SUBJECT = "ERROR_SUBJECT";
/*      */   public static final String ERROR_ADRESS = "ERROR_ADRESS";
/*      */   public static final String SOGGETTO = "SOGGETTO";
/*      */   public static final String INDIRIZZO = "INDIRIZZO";
/*      */   public static final String ATTIVITA = "000";
/*      */   public static final String SETTORE = "600";
/*   63 */   protected String user = null;
/*   64 */   protected String password = null;
/*   65 */   protected String serverName = null;
/*   66 */   protected int portNumber = 0;
/*   67 */   protected String dataBaseName = null;
/*   68 */   protected String url = null;
/*   69 */   protected String driver = null;
/*   70 */   protected String minLimit = null;
/*   71 */   protected String maxLimit = null;
/*   72 */   protected String initialLimit = null;
/*   73 */   protected String inactivityTimeout = null;
/*   74 */   protected String abandonedConnectionTimeout = null;
/*   75 */   protected String maxStatementsLimit = null;
/*   76 */   protected String propertyCheckInterval = null;
/*   77 */   protected String connectionWaitTimeout = null;
/*      */   protected boolean forzaturaCF = false;
/*      */   protected boolean onLine = false;
/*   80 */   protected Log log = LogFactory.getLog(RasNormalizer.class);
/*   81 */   protected MapContainer resultMap = null;
/*   82 */   protected String conversioneTipo = null;
/*   83 */   protected RasServiceException rasServiceException = null;
/*      */   
/*      */   public DataSource dataSource;
/*      */   protected RasNormalizerExceptionSRV rasNormalizerExceptionSRV;
/*      */   protected boolean automaticSex = true;
/*      */   protected SingleModuleService normalizzaSoggettoService;
/*      */   protected SingleModuleService normalizzaIndirizzoService;
/*      */   
/*      */   public DataSource getDataSource() {
/*   92 */     return this.dataSource;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataSource(DataSource dataSource) {
/*   97 */     this.dataSource = dataSource;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUser(String user) {
/*  102 */     this.user = user;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPassword(String password) {
/*  107 */     this.password = password;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setServerName(String serverName) {
/*  112 */     this.serverName = serverName;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPortNumber(int portNumber) {
/*  117 */     this.portNumber = portNumber;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataBaseName(String dataBaseName) {
/*  122 */     this.dataBaseName = dataBaseName;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDriver(String driver) {
/*  127 */     this.driver = driver;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUrl(String url) {
/*  132 */     this.url = url;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setMinLimit(String minLimit) {
/*  137 */     this.minLimit = minLimit;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setMaxLimit(String maxLimit) {
/*  142 */     this.maxLimit = maxLimit;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setInitialLimit(String initialLimit) {
/*  147 */     this.initialLimit = initialLimit;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setInactivityTimeout(String inactivityTimeout) {
/*  152 */     this.inactivityTimeout = inactivityTimeout;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAbandonedConnectionTimeout(String abandonedConnectionTimeout) {
/*  157 */     this.abandonedConnectionTimeout = abandonedConnectionTimeout;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setMaxStatementsLimit(String maxStatementsLimit) {
/*  162 */     this.maxStatementsLimit = maxStatementsLimit;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOnLine(boolean onLine) {
/*  167 */     this.onLine = onLine;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setForzaturaCF(boolean forzaturaCF) {
/*  172 */     this.forzaturaCF = forzaturaCF;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPropertyCheckInterval(String propertyCheckInterval) {
/*  177 */     this.propertyCheckInterval = propertyCheckInterval;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setConnectionWaitTimeout(String connectionWaitTimeout) {
/*  182 */     this.connectionWaitTimeout = connectionWaitTimeout;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void init() throws RasException {
/*  188 */     createNew();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final void init(String fragment) throws RasException {
/*  194 */     throw new UnsupportedOperationException("init(String)");
/*      */   }
/*      */ 
/*      */   
/*      */   public void setMode(String mode) {
/*  199 */     throw new UnsupportedOperationException("setMode(String)");
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFileReader(IRasXmlFileReader fileReader) {
/*  204 */     throw new UnsupportedOperationException("setFileReader(IRasXmlFileReader)");
/*      */   }
/*      */ 
/*      */   
/*      */   public void setConfigTransaction(IRasRequiredTransaction transaction) {
/*  209 */     throw new UnsupportedOperationException("setConfigTransaction(IRasRequiredTransaction)");
/*      */   }
/*      */ 
/*      */   
/*      */   public void setConfigService(IRasService configService) {
/*  214 */     throw new UnsupportedOperationException("setConfigService(IRasService)");
/*      */   }
/*      */ 
/*      */   
/*      */   public final void destroy() {
/*  219 */     this.user = null;
/*  220 */     this.password = null;
/*  221 */     this.serverName = null;
/*  222 */     this.portNumber = 0;
/*  223 */     this.dataBaseName = null;
/*  224 */     this.url = null;
/*  225 */     this.driver = null;
/*  226 */     this.minLimit = null;
/*  227 */     this.maxLimit = null;
/*  228 */     this.initialLimit = null;
/*  229 */     this.inactivityTimeout = null;
/*  230 */     this.abandonedConnectionTimeout = null;
/*  231 */     this.maxStatementsLimit = null;
/*  232 */     this.propertyCheckInterval = null;
/*  233 */     this.connectionWaitTimeout = null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   protected Properties setConnectionCacheManager() throws RasServiceException {
/*  239 */     Properties properties = new Properties();
/*      */     
/*      */     try {
/*  242 */       properties.setProperty("MinLimit", this.minLimit);
/*  243 */       properties.setProperty("MaxLimit", this.maxLimit);
/*  244 */       properties.setProperty("InitialLimit", this.initialLimit);
/*      */       
/*  246 */       properties.setProperty("InactivityTimeout", this.inactivityTimeout);
/*  247 */       properties.setProperty("AbandonedConnectionTimeout", this.abandonedConnectionTimeout);
/*      */       
/*  249 */       properties.setProperty("MaxStatementsLimit", this.maxStatementsLimit);
/*  250 */       properties.setProperty("PropertyCheckInterval", this.propertyCheckInterval);
/*  251 */       properties.setProperty("ConnectionWaitTimeout", this.connectionWaitTimeout);
/*      */     }
/*  253 */     catch (Exception e) {
/*      */       
/*  255 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */       
/*  257 */       rse.setStackTrace(e.getStackTrace());
/*  258 */       throw rse;
/*      */     } 
/*  260 */     return properties;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   protected void createNew() throws RasServiceException {}
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer normalizeSubject(FinSoggetto subject) throws RasServiceException {
/*  271 */     MapContainer resultMap = new MapContainer();
/*  272 */     MapContainer map = new MapContainer();
/*  273 */     String result = "EXECUTED";
/*      */     
/*  275 */     int gg = 0;
/*  276 */     int mm = 0;
/*  277 */     int aaaa = 0;
/*  278 */     this.rasServiceException = new RasServiceException();
/*  279 */     if (subject.getDataNascita() != null) {
/*      */       
/*  281 */       Calendar calendar = new GregorianCalendar();
/*      */       
/*      */       try {
/*  284 */         calendar.setTime(subject.getDataNascita());
/*  285 */         aaaa = calendar.get(1);
/*  286 */         mm = calendar.get(2);
/*  287 */         mm++;
/*  288 */         gg = calendar.get(5);
/*      */       }
/*  290 */       catch (Exception e) {
/*      */         
/*  292 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  294 */         rse.setStackTrace(e.getStackTrace());
/*  295 */         throw rse;
/*      */       } 
/*      */     } 
/*  298 */     if (this.log.isDebugEnabled()) {
/*      */       
/*  300 */       if (subject.getDenominazione() != null) {
/*  301 */         this.log.debug("DENOMINAZIONE = " + subject.getDenominazione().replace('\'', ' '));
/*      */       }
/*  303 */       if (subject.getNome() != null) {
/*  304 */         this.log.debug("NOME = " + subject.getNome().replace('\'', ' '));
/*      */       }
/*  306 */       if (subject.getCognome() != null) {
/*  307 */         this.log.debug("COGNOME = " + subject.getCognome().replace('\'', ' '));
/*      */       }
/*  309 */       if (subject.getPartitaIva() != null) {
/*  310 */         this.log.debug("PARTITA_IVA = " + subject.getPartitaIva());
/*      */       }
/*  312 */       if (subject.getCodiceFiscale() != null) {
/*  313 */         this.log.debug("CODICE_FISCALE = " + subject.getCodiceFiscale());
/*      */       }
/*  315 */       if (subject.getTipoSogg() != null) {
/*  316 */         this.log.debug("TIPO = " + subject.getTipoSogg());
/*      */       }
/*      */     } 
/*  319 */     if (subject.getTipoSogg() != null && !subject.getTipoSogg().equals("C")) {
/*      */       
/*  321 */       if (subject.getDenominazione() != null && subject.getDenominazione().equals("-1")) {
/*  322 */         subject.setDenominazione(null);
/*      */       }
/*  324 */       if (subject.getPartitaIva() != null && subject.getPartitaIva().equals("-1")) {
/*  325 */         subject.setPartitaIva(null);
/*      */       }
/*  327 */       if (subject.getDenominazione() != null && !subject.getDenominazione().equals("-1")) {
/*  328 */         subject.setDenominazione(subject.getDenominazione().toUpperCase());
/*      */       }
/*  330 */       if (subject.getNome() != null) {
/*  331 */         subject.setNome(subject.getNome().toUpperCase());
/*      */       }
/*  333 */       if (subject.getCognome() != null) {
/*  334 */         subject.setCognome(subject.getCognome().toUpperCase());
/*      */       }
/*  336 */       if (subject.getCodiceFiscale() != null) {
/*  337 */         subject.setCodiceFiscale(subject.getCodiceFiscale().toUpperCase());
/*      */       }
/*  339 */       if (subject.getPartitaIva() != null && !subject.getPartitaIva().equals("-1")) {
/*  340 */         subject.setPartitaIva(subject.getPartitaIva().toUpperCase());
/*      */       }
/*  342 */       this.conversioneTipo = "0";
/*      */     }
/*  344 */     else if (subject.getTipoSogg() != null && subject.getTipoSogg().equals("C")) {
/*      */       
/*  346 */       if (this.log.isErrorEnabled()) {
/*  347 */         this.log.error("Il valore che definisce il tipo soggetto da normalizzare ï¿½ di tipo cointestazione");
/*      */       }
/*  349 */       result = "WARNING";
/*  350 */       resultMap.putAppl("RESULT", result);
/*  351 */       resultMap.putAppl("ERROR_SUBJECT", "Il valore che definisce il tipo soggetto da normalizzare ï¿½ di tipo cointestazione");
/*      */       
/*  353 */       resultMap.putAppl("SOGGETTO", subject);
/*  354 */       return resultMap;
/*      */     } 
/*  356 */     NormalizzatoreContainer normalizzatoreContainer = null;
/*      */     
/*      */     try {
/*  359 */       MapContainer inMap = new MapContainer();
/*  360 */       inMap.putAppl("denominazione", ArchUtils.isValid(subject.getDenominazione()) ? StringEscapeUtils.escapeSql(StringUtils.remove(subject.getDenominazione(), "{")) : "");
/*  361 */       inMap.putAppl("cognome", ArchUtils.isValid(subject.getCognome()) ? StringEscapeUtils.escapeSql(StringUtils.remove(subject.getCognome(), "{")) : "");
/*  362 */       inMap.putAppl("nome", ArchUtils.isValid(subject.getNome()) ? StringEscapeUtils.escapeSql(StringUtils.remove(subject.getNome(), "{")) : "");
/*  363 */       inMap.putAppl("tipoSogg", ArchUtils.isValid(subject.getTipoSogg()) ? StringEscapeUtils.escapeSql(StringUtils.remove(subject.getTipoSogg(), "{")) : "");
/*  364 */       inMap.putAppl("sesso", ArchUtils.isValid(subject.getSesso()) ? StringEscapeUtils.escapeSql(StringUtils.remove(subject.getSesso(), "{")) : "");
/*  365 */       inMap.putAppl("provinciaDiNascita", ArchUtils.isValid(subject.getProvNascita()) ? StringEscapeUtils.escapeSql(StringUtils.remove(subject.getProvNascita(), "{")) : "");
/*  366 */       inMap.putAppl("codiceFiscale", ArchUtils.isValid(subject.getCodiceFiscale()) ? StringUtils.remove(subject.getCodiceFiscale(), "{") : "");
/*  367 */       inMap.putAppl("partitaIva", ArchUtils.isValid(subject.getPartitaIva()) ? StringUtils.remove(subject.getPartitaIva(), "{") : "");
/*  368 */       Date dataNascita = null;
/*  369 */       if ("F".equals(subject.getTipoSogg())) {
/*  370 */         if (subject.getDataNascita() != null) {
/*  371 */           dataNascita = subject.getDataNascita();
/*      */         }
/*      */       }
/*  374 */       else if (subject.getDataFondaz() != null) {
/*  375 */         dataNascita = subject.getDataFondaz();
/*      */       } 
/*      */       
/*  378 */       if (dataNascita != null) {
/*  379 */         DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
/*  380 */         String dataNascitaWithZeroTime = formatter.format(dataNascita);
/*  381 */         inMap.putAppl("dataNascita", dataNascitaWithZeroTime);
/*      */       } else {
/*  383 */         inMap.putAppl("dataNascita", "");
/*      */       } 
/*      */       
/*  386 */       inMap.putAppl("luogoDiNascita", ArchUtils.isValid(subject.getComuneNascita()) ? StringEscapeUtils.escapeSql(subject.getComuneNascita()) : "");
/*  387 */       map = this.normalizzaSoggettoService.service(inMap);
/*      */     }
/*  389 */     catch (Exception e) {
/*      */       
/*  391 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */       
/*  393 */       rse.setStackTrace(e.getStackTrace());
/*  394 */       if (this.onLine) {
/*      */         
/*  396 */         RasValidationSignal dettaglioErrore = new RasValidationSignal("errors.norm.exception", e.toString());
/*      */         
/*  398 */         rse.addError(dettaglioErrore);
/*      */       } 
/*  400 */       throw rse;
/*      */     } 
/*  402 */     if (map != null) {
/*  403 */       ArrayList tmpList = (ArrayList)map.getAppl("RESULT");
/*  404 */       if (tmpList != null && tmpList.size() > 0) {
/*  405 */         normalizzatoreContainer = tmpList.get(0);
/*      */       }
/*      */     } 
/*  408 */     if (normalizzatoreContainer != null) {
/*  409 */       if (this.log.isDebugEnabled()) {
/*  410 */         this.log.debug("Recupero i dati del soggetto dal container");
/*      */       }
/*      */       
/*  413 */       if (ArchUtils.isValid(normalizzatoreContainer.getError()) && !"0".equals(normalizzatoreContainer.getError())) {
/*  414 */         resultMap.putAppl("ERROR_CODE", normalizzatoreContainer.getError());
/*  415 */         resultMap.putAppl("ERROR_DES", normalizzatoreContainer.getError_des());
/*  416 */         result = "NOT_EXECUTED";
/*  417 */         if (this.log.isErrorEnabled()) {
/*  418 */           this.log.error("NORMALIZZAZIONE SOGGETTO");
/*  419 */           this.log.error("Codice errore: " + normalizzatoreContainer.getError() + " Descrizione: " + normalizzatoreContainer.getError_des());
/*  420 */           if (subject.getCodiceFiscale() != null) {
/*  421 */             this.log.error("COD_FISCALE = " + subject.getCodiceFiscale().trim());
/*      */           }
/*  423 */           if (subject.getPartitaIva() != null) {
/*  424 */             this.log.error("PIVA = " + subject.getPartitaIva().trim());
/*      */           }
/*  426 */           if (ArchUtils.isValid(normalizzatoreContainer.getDenominazione())) {
/*  427 */             this.log.debug("OUT_DENOMINAZIONE = " + normalizzatoreContainer.getDenominazione().trim());
/*      */           }
/*  429 */           if (ArchUtils.isValid(normalizzatoreContainer.getCognome())) {
/*  430 */             this.log.debug("OUT_COGNOME = " + normalizzatoreContainer.getCognome().trim());
/*      */           }
/*  432 */           if (ArchUtils.isValid(normalizzatoreContainer.getNome())) {
/*  433 */             this.log.debug("OUT_NOME = " + normalizzatoreContainer.getNome().trim());
/*      */           }
/*      */         } 
/*  436 */         RasValidationSignal dettaglioErrore = new RasValidationSignal("errors.norm.wrong.name");
/*  437 */         this.rasServiceException.addError(dettaglioErrore);
/*  438 */         resultMap.putAppl("SOGGETTO", subject);
/*      */       }
/*      */       else {
/*      */         
/*  442 */         if (this.automaticSex)
/*      */         {
/*  444 */           subject.setSesso(normalizzatoreContainer.getSesso());
/*      */         }
/*  446 */         if (!"EE".equals(subject.getProvNascita())) {
/*  447 */           if (ArchUtils.isValid(normalizzatoreContainer.getProvinciadinascita())) {
/*  448 */             subject.setProvNascita(normalizzatoreContainer.getProvinciadinascita());
/*      */           }
/*  450 */           if (ArchUtils.isValid(normalizzatoreContainer.getLuogodinascita())) {
/*  451 */             subject.setComuneNascita(normalizzatoreContainer.getLuogodinascita());
/*      */           }
/*      */         } 
/*      */         
/*  455 */         if (!this.onLine) {
/*      */           
/*  457 */           if (subject.getTipoSogg().equals("G")) {
/*      */             
/*  459 */             subject.setDenominazione(normalizzatoreContainer.getDenominazione());
/*  460 */             subject.setCognome(null);
/*  461 */             subject.setNome(null);
/*  462 */             subject.setCodiceFiscale(null);
/*      */           } 
/*  464 */           if (subject.getTipoSogg().equals("F")) {
/*      */             
/*  466 */             subject.setAttivita("000");
/*      */             
/*  468 */             subject.setDenominazione(null);
/*      */             
/*  470 */             subject.setNome(normalizzatoreContainer.getNome());
/*  471 */             subject.setPartitaIva(null);
/*      */             
/*  473 */             subject.setCognome(normalizzatoreContainer.getCognome());
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  478 */       if (this.rasServiceException.toBeThrown() && this.onLine && this.rasServiceException.signalsPresent()) {
/*  479 */         throw this.rasServiceException;
/*      */       }
/*      */     } 
/*  482 */     resultMap.putAppl("RESULT", result);
/*  483 */     resultMap.putAppl("SOGGETTO", subject);
/*  484 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private Set indirizziNormalizzati(Set indirizzi, RasServiceException rs, String tipo) throws RasServiceException {
/*  490 */     MapContainer resultMap = new MapContainer();
/*  491 */     Iterator iterator = indirizzi.iterator();
/*  492 */     Set adress = new HashSet();
/*  493 */     FinIndirizzo indirizzo = null;
/*  494 */     FinSoggettoIndir soggettoIndir = null;
/*  495 */     int ordine = 1;
/*  496 */     while (iterator.hasNext()) {
/*      */       
/*  498 */       soggettoIndir = iterator.next();
/*  499 */       if (soggettoIndir.getDataFine() == null) {
/*  500 */         soggettoIndir.setDataFine(getDataInfinito());
/*      */       }
/*  502 */       if (soggettoIndir.getDataFine().before(getDataInfinito()) || !soggettoIndir.getIndirizzo().getNazione().equals("086")) {
/*      */         
/*  504 */         indirizzo = soggettoIndir.getIndirizzo();
/*      */       }
/*  506 */       else if (this.onLine) {
/*      */         
/*  508 */         MapContainer inMap = new MapContainer();
/*      */         
/*  510 */         inMap.putAppl("toponimoIn", ArchUtils.isValid(indirizzo.getDesToponimo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(indirizzo.getDesToponimo(), "{")) : "");
/*  511 */         inMap.putAppl("indirizzoIn", ArchUtils.isValid(indirizzo.getIndirizzo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(indirizzo.getIndirizzo(), "{")) : "");
/*  512 */         inMap.putAppl("numCivicoIn", ArchUtils.isValid(indirizzo.getNumeroCivico()) ? StringEscapeUtils.escapeSql(StringUtils.remove(indirizzo.getNumeroCivico(), "{")) : "");
/*  513 */         inMap.putAppl("pressoIn", ArchUtils.isValid(indirizzo.getPresso()) ? StringEscapeUtils.escapeSql(StringUtils.remove(indirizzo.getPresso(), "{")) : "");
/*  514 */         inMap.putAppl("localitaIn", ArchUtils.isValid(indirizzo.getLocalita()) ? StringEscapeUtils.escapeSql(StringUtils.remove(indirizzo.getLocalita(), "{")) : "");
/*  515 */         inMap.putAppl("provIn", ArchUtils.isValid(indirizzo.getProv()) ? StringEscapeUtils.escapeSql(StringUtils.remove(indirizzo.getProv(), "{")) : "");
/*  516 */         inMap.putAppl("capIn", ArchUtils.isValid(indirizzo.getCap()) ? StringUtils.remove(indirizzo.getCap(), "{") : "");
/*  517 */         inMap.putAppl("nazioneIn", ArchUtils.isValid(indirizzo.getNazione()) ? StringEscapeUtils.escapeSql(StringUtils.remove(indirizzo.getNazione(), "{")) : "");
/*      */         
/*  519 */         resultMap = this.normalizzaIndirizzoService.service(inMap);
/*      */         
/*  521 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*      */       }
/*      */       else {
/*      */         
/*  525 */         resultMap = normalizeAdress(soggettoIndir.getIndirizzo());
/*  526 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*      */       } 
/*  528 */       soggettoIndir.setIndirizzo(indirizzo);
/*  529 */       adress.add(soggettoIndir);
/*      */     } 
/*  531 */     return adress;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer normalizeAdress(FinIndirizzo adress) throws RasServiceException {
/*  537 */     MapContainer resultMap = new MapContainer();
/*  538 */     MapContainer map = new MapContainer();
/*  539 */     String result = "EXECUTED";
/*      */     
/*  541 */     if (adress != null) {
/*      */       
/*  543 */       if (adress.getComune() == null) {
/*  544 */         adress.setComune(adress.getLocalita());
/*      */       }
/*  546 */       if (adress.getIndirizzo() != null) {
/*  547 */         adress.setIndirizzo(adress.getIndirizzo().replace(',', ' '));
/*      */       }
/*      */       
/*  550 */       if (this.log.isDebugEnabled()) {
/*      */         
/*  552 */         if (adress.getIndirizzo() != null) {
/*  553 */           this.log.debug("INDIRIZZO = " + adress.getIndirizzo().replace('\'', ' '));
/*      */         }
/*  555 */         if (adress.getCap() != null) {
/*  556 */           this.log.debug("CAP = " + adress.getCap().replace('\'', ' '));
/*      */         }
/*  558 */         if (adress.getComune() != null) {
/*  559 */           this.log.debug("COMUNE = " + adress.getComune().replace('\'', ' '));
/*      */         }
/*  561 */         if (adress.getProv() != null) {
/*  562 */           this.log.debug("PROVINCIA = " + adress.getProv().replace('\'', ' '));
/*      */         }
/*  564 */         if (adress.getNazione() != null) {
/*  565 */           this.log.debug("NAZIONE = " + adress.getNazione().replace('\'', ' '));
/*      */         }
/*      */       } 
/*  568 */       NormalizzatoreContainer normalizzatoreContainer = null;
/*      */       
/*      */       try {
/*  571 */         MapContainer inMap = new MapContainer();
/*      */         
/*  573 */         inMap.putAppl("toponimoIn", ArchUtils.isValid(adress.getDesToponimo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getDesToponimo(), "{")) : "");
/*  574 */         inMap.putAppl("indirizzoIn", ArchUtils.isValid(adress.getIndirizzo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getIndirizzo(), "{")) : "");
/*  575 */         inMap.putAppl("numCivicoIn", ArchUtils.isValid(adress.getNumeroCivico()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getNumeroCivico(), "{")) : "");
/*  576 */         inMap.putAppl("pressoIn", ArchUtils.isValid(adress.getPresso()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getPresso(), "{")) : "");
/*  577 */         inMap.putAppl("localitaIn", ArchUtils.isValid(adress.getLocalita()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getLocalita(), "{")) : "");
/*  578 */         inMap.putAppl("provIn", ArchUtils.isValid(adress.getProv()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getProv(), "{")) : "");
/*  579 */         inMap.putAppl("capIn", ArchUtils.isValid(adress.getCap()) ? StringUtils.remove(adress.getCap(), "{") : "");
/*  580 */         inMap.putAppl("nazioneIn", ArchUtils.isValid(adress.getNazione()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getNazione(), "{")) : "");
/*      */         
/*  582 */         if (this.log.isDebugEnabled()) {
/*  583 */           this.log.debug("START NORMALIZZAZIONE INDIRIZZO");
/*      */         }
/*  585 */         map = this.normalizzaIndirizzoService.service(inMap);
/*  586 */         if (this.log.isDebugEnabled()) {
/*  587 */           this.log.debug("END NORMALIZZAZIONE INDIRIZZO");
/*      */         
/*      */         }
/*      */       }
/*  591 */       catch (Exception e) {
/*      */         
/*  593 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  595 */         rse.setStackTrace(e.getStackTrace());
/*  596 */         throw rse;
/*      */       } 
/*      */       
/*  599 */       if (map != null) {
/*  600 */         ArrayList tmpList = (ArrayList)map.getAppl("RESULT");
/*  601 */         if (tmpList != null && tmpList.size() > 0) {
/*  602 */           normalizzatoreContainer = tmpList.get(0);
/*      */         }
/*      */       } 
/*  605 */       if (normalizzatoreContainer != null) {
/*  606 */         if (this.log.isDebugEnabled()) {
/*  607 */           this.log.debug("Recupero i dati del soggetto dal container");
/*      */         }
/*      */         
/*  610 */         if (ArchUtils.isValid(normalizzatoreContainer.getError()) && !"0".equals(normalizzatoreContainer.getError())) {
/*      */           
/*  612 */           resultMap.putAppl("ERROR_CODE", normalizzatoreContainer.getError());
/*  613 */           resultMap.putAppl("ERROR_DES", normalizzatoreContainer.getError_des());
/*  614 */           result = "NOT_EXECUTED";
/*  615 */           if (this.log.isErrorEnabled()) {
/*  616 */             this.log.error("NORMALIZZAZIONE INDIRIZZO");
/*  617 */             this.log.error("Codice errore: " + normalizzatoreContainer.getError() + " Descrizione: " + normalizzatoreContainer.getError_des());
/*      */           } 
/*      */         } else {
/*  620 */           if (this.log.isDebugEnabled()) {
/*  621 */             this.log.debug("NORMALIZZAZIONE INDIRIZZO");
/*  622 */             this.log.debug("Codice errore: " + normalizzatoreContainer.getError() + " Descrizione: " + normalizzatoreContainer.getError_des());
/*  623 */             this.log.debug("OUT_INDIRIZZO = " + normalizzatoreContainer.getIndirizzo());
/*  624 */             this.log.debug("OUT_CAP =" + normalizzatoreContainer.getCap());
/*  625 */             this.log.debug("OUT_COMUNE =" + normalizzatoreContainer.getComune());
/*  626 */             this.log.debug("OUT_PROV =" + normalizzatoreContainer.getProv());
/*      */           } 
/*      */           
/*  629 */           adress.setCodToponimo(normalizzatoreContainer.getCodToponimo());
/*  630 */           if (ArchUtils.isValid(normalizzatoreContainer.getDesToponimo())) {
/*  631 */             adress.setDesToponimo(normalizzatoreContainer.getDesToponimo());
/*      */           }
/*  633 */           if (ArchUtils.isValid(normalizzatoreContainer.getIndirizzo())) {
/*  634 */             adress.setIndirizzo(normalizzatoreContainer.getIndirizzo());
/*      */           }
/*  636 */           if (ArchUtils.isValid(normalizzatoreContainer.getNumCivico())) {
/*  637 */             if (normalizzatoreContainer.getNumCivico().length() > 20) {
/*  638 */               if (this.log.isWarnEnabled()) {
/*  639 */                 this.log.warn("Nel campo numero civico sono inseriti i primi 20 caratteri del valore restituito");
/*      */               }
/*      */               
/*      */               try {
/*  643 */                 adress.setNumeroCivico(normalizzatoreContainer.getNumCivico().substring(0, 20));
/*      */               }
/*  645 */               catch (Exception e) {
/*      */                 
/*  647 */                 RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */                 
/*  649 */                 rse.setStackTrace(e.getStackTrace());
/*  650 */                 throw rse;
/*      */               } 
/*      */             } else {
/*      */               
/*  654 */               adress.setNumeroCivico(normalizzatoreContainer.getNumCivico());
/*      */             } 
/*      */           }
/*  657 */           adress.setCap(normalizzatoreContainer.getCap());
/*  658 */           adress.setComune(normalizzatoreContainer.getComune());
/*  659 */           adress.setLocalita(normalizzatoreContainer.getLocalita());
/*  660 */           adress.setProv(normalizzatoreContainer.getProv());
/*  661 */           adress.setIndiSeparato("S");
/*  662 */           adress.setPresso(normalizzatoreContainer.getPresso());
/*  663 */           if ("ITA".equals(normalizzatoreContainer.getNazione())) {
/*  664 */             adress.setNazione("086");
/*      */           } else {
/*  666 */             adress.setNazione(normalizzatoreContainer.getNazione());
/*      */           } 
/*      */           
/*  669 */           adress.setCabResidenza(normalizzatoreContainer.getCab());
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  674 */         result = "NOT_EXECUTED";
/*  675 */         if (this.log.isErrorEnabled()) {
/*  676 */           this.log.error("L'ndirizzo passato in input ha valore null");
/*      */         }
/*      */       } 
/*      */     } 
/*  680 */     resultMap.putAppl("INDIRIZZO", adress);
/*  681 */     resultMap.putAppl("RESULT", result);
/*  682 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer normalizeAdress(FinIndirizzo adress, RasServiceException rs, String tipo, String progressivo) throws RasServiceException {
/*  688 */     MapContainer resultMap = new MapContainer();
/*  689 */     MapContainer map = new MapContainer();
/*  690 */     NormalizzatoreContainer normalizzatoreContainer = null;
/*  691 */     String result = "EXECUTED";
/*      */     
/*  693 */     if (adress != null)
/*      */     {
/*  695 */       if (!adress.isEmptyForBussinessLogic()) {
/*      */         
/*  697 */         if (this.log.isDebugEnabled()) {
/*      */           
/*  699 */           this.log.debug("INDIRIZZO = " + adress.getIndirizzo());
/*  700 */           this.log.debug("CAP = " + adress.getCap());
/*  701 */           this.log.debug("COMUNE = " + adress.getComune());
/*  702 */           this.log.debug("PROVINCIA = " + adress.getProv());
/*  703 */           this.log.debug("NAZIONE = " + adress.getNazione());
/*      */         } 
/*  705 */         if (adress.getIndirizzo() != null) {
/*  706 */           adress.setIndirizzo(adress.getIndirizzo().replace(',', ' '));
/*      */         }
/*      */ 
/*      */         
/*      */         try {
/*  711 */           MapContainer inMap = new MapContainer();
/*      */           
/*  713 */           inMap.putAppl("toponimoIn", ArchUtils.isValid(adress.getDesToponimo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getDesToponimo(), "{")) : "");
/*  714 */           inMap.putAppl("indirizzoIn", ArchUtils.isValid(adress.getIndirizzo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getIndirizzo(), "{")) : "");
/*  715 */           inMap.putAppl("numCivicoIn", ArchUtils.isValid(adress.getNumeroCivico()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getNumeroCivico(), "{")) : "");
/*  716 */           inMap.putAppl("pressoIn", ArchUtils.isValid(adress.getPresso()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getPresso(), "{")) : "");
/*  717 */           inMap.putAppl("localitaIn", ArchUtils.isValid(adress.getLocalita()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getLocalita(), "{")) : "");
/*  718 */           inMap.putAppl("provIn", ArchUtils.isValid(adress.getProv()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getProv(), "{")) : "");
/*  719 */           inMap.putAppl("capIn", ArchUtils.isValid(adress.getCap()) ? StringUtils.remove(adress.getCap(), "{") : "");
/*  720 */           inMap.putAppl("nazioneIn", ArchUtils.isValid(adress.getNazione()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adress.getNazione(), "{")) : "");
/*      */           
/*  722 */           if (this.log.isDebugEnabled()) {
/*  723 */             this.log.debug("START NORMALIZZAZIONE INDIRIZZO");
/*      */           }
/*  725 */           map = this.normalizzaIndirizzoService.service(inMap);
/*  726 */           if (this.log.isDebugEnabled()) {
/*  727 */             this.log.debug("END NORMALIZZAZIONE INDIRIZZO");
/*      */           }
/*      */         }
/*  730 */         catch (Exception e) {
/*      */           
/*  732 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */           
/*  734 */           rse.setStackTrace(e.getStackTrace());
/*  735 */           if (this.onLine) {
/*      */             
/*  737 */             RasValidationSignal rasValidationSignal = new RasValidationSignal("errors.norm.exception", e.toString());
/*      */             
/*  739 */             rse.addDeroga(rasValidationSignal);
/*      */           } 
/*  741 */           throw rse;
/*      */         } 
/*  743 */         RasValidationSignal dettaglioErrore = new RasValidationSignal("errors.norm.wrong.address", tipo, progressivo);
/*      */         
/*  745 */         if (map != null) {
/*  746 */           ArrayList tmpList = (ArrayList)map.getAppl("RESULT");
/*  747 */           if (tmpList != null && tmpList.size() > 0) {
/*  748 */             normalizzatoreContainer = tmpList.get(0);
/*      */           }
/*      */         } 
/*  751 */         if (normalizzatoreContainer != null) {
/*  752 */           if (this.log.isDebugEnabled()) {
/*  753 */             this.log.debug("Recupero i dati del soggetto dal container");
/*      */           }
/*  755 */           if (ArchUtils.isValid(normalizzatoreContainer.getError()) && !"0".equals(normalizzatoreContainer.getError())) {
/*      */             
/*  757 */             if (this.rasNormalizerExceptionSRV != null) {
/*      */               
/*  759 */               MapContainer mp = new MapContainer();
/*  760 */               mp.putAppl("NORMAOUT", normalizzatoreContainer);
/*  761 */               mp.putAppl("EXCEPTION_TO_ADD", this.rasServiceException);
/*  762 */               mp.putAppl("TIPO_OPERAZIONE", "INDIRIZZO");
/*  763 */               mp = this.rasNormalizerExceptionSRV.service(mp);
/*      */             } 
/*  765 */             resultMap.putAppl("ERROR_CODE", normalizzatoreContainer.getError());
/*  766 */             resultMap.putAppl("ERROR_DES", normalizzatoreContainer.getError_des());
/*  767 */             result = "NOT_EXECUTED";
/*  768 */             if (this.log.isErrorEnabled()) {
/*  769 */               this.log.error("NORMALIZZAZIONE INDIRIZZO");
/*  770 */               this.log.error("Codice errore: " + normalizzatoreContainer.getError() + " Descrizione: " + normalizzatoreContainer.getError_des());
/*      */             } 
/*      */           } else {
/*      */             
/*  774 */             if (this.log.isDebugEnabled()) {
/*      */               
/*  776 */               this.log.debug("NORMALIZZAZIONE INDIRIZZO");
/*  777 */               this.log.debug("Codice errore: " + normalizzatoreContainer.getError() + " Descrizione: " + normalizzatoreContainer.getError_des());
/*  778 */               this.log.debug("OUT_INDIRIZZO = " + normalizzatoreContainer.getIndirizzo());
/*  779 */               this.log.debug("OUT_CAP =" + normalizzatoreContainer.getCap());
/*  780 */               this.log.debug("OUT_COMUNE =" + normalizzatoreContainer.getComune());
/*  781 */               this.log.debug("OUT_PROV =" + normalizzatoreContainer.getProv());
/*      */             } 
/*      */             
/*  784 */             adress.setCodToponimo(normalizzatoreContainer.getCodToponimo());
/*  785 */             adress.setDesToponimo(normalizzatoreContainer.getDesToponimo());
/*  786 */             adress.setIndirizzo(normalizzatoreContainer.getIndirizzo());
/*      */             
/*  788 */             if (normalizzatoreContainer.getNumCivico().length() > 20) {
/*  789 */               if (this.log.isWarnEnabled()) {
/*  790 */                 this.log.warn("Nel campo numero civico sono inseriti i primi 20 caratteri del valore restituito");
/*      */               }
/*      */               
/*      */               try {
/*  794 */                 adress.setNumeroCivico(normalizzatoreContainer.getNumCivico().substring(0, 20));
/*      */               }
/*  796 */               catch (Exception e) {
/*      */                 
/*  798 */                 RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */                 
/*  800 */                 rse.setStackTrace(e.getStackTrace());
/*  801 */                 throw rse;
/*      */               }
/*      */             
/*      */             } else {
/*      */               
/*  806 */               adress.setNumeroCivico(normalizzatoreContainer.getNumCivico());
/*      */             } 
/*  808 */             adress.setCap(normalizzatoreContainer.getCap());
/*  809 */             adress.setComune(normalizzatoreContainer.getComune());
/*  810 */             adress.setLocalita(normalizzatoreContainer.getLocalita());
/*  811 */             adress.setProv(normalizzatoreContainer.getProv());
/*  812 */             adress.setIndiSeparato("S");
/*  813 */             adress.setPresso(normalizzatoreContainer.getPresso());
/*  814 */             if (!this.onLine) {
/*  815 */               if ("ITA".equals(normalizzatoreContainer.getNazione())) {
/*  816 */                 adress.setNazione("086");
/*      */               } else {
/*  818 */                 adress.setNazione(normalizzatoreContainer.getNazione());
/*      */               } 
/*      */             }
/*      */ 
/*      */             
/*  823 */             adress.setCabResidenza(normalizzatoreContainer.getCab());
/*      */           }
/*      */         
/*      */         } else {
/*      */           
/*  828 */           result = "NOT_EXECUTED";
/*  829 */           if (this.log.isErrorEnabled()) {
/*  830 */             this.log.error("Campi obbligatori con valori null");
/*      */           }
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  836 */         result = "NOT_EXECUTED";
/*  837 */         if (this.log.isErrorEnabled()) {
/*  838 */           this.log.error("L'ndirizzo passato in input ha valore null");
/*      */         }
/*      */       } 
/*      */     }
/*      */     
/*  843 */     resultMap.putAppl("INDIRIZZO", adress);
/*  844 */     resultMap.putAppl("RESULT", result);
/*  845 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer normalizeAdress(FinIndirizzoRam adressRam) throws RasServiceException {
/*  851 */     MapContainer resultMap = new MapContainer();
/*  852 */     MapContainer map = new MapContainer();
/*  853 */     NormalizzatoreContainer normalizzatoreContainer = null;
/*  854 */     String result = "EXECUTED";
/*      */     
/*  856 */     if (adressRam != null) {
/*      */       
/*  858 */       if (adressRam.getComune() == null) {
/*  859 */         adressRam.setComune(adressRam.getLocalita());
/*      */       }
/*  861 */       if (adressRam.getIndirizzo() != null) {
/*  862 */         adressRam.setIndirizzo(adressRam.getIndirizzo().replace(',', ' '));
/*      */       }
/*      */       
/*  865 */       if (this.log.isDebugEnabled()) {
/*      */         
/*  867 */         if (adressRam.getIndirizzo() != null) {
/*  868 */           this.log.debug("INDIRIZZO = " + adressRam.getIndirizzo().replace('\'', ' '));
/*      */         }
/*  870 */         if (adressRam.getCap() != null) {
/*  871 */           this.log.debug("CAP = " + adressRam.getCap().replace('\'', ' '));
/*      */         }
/*  873 */         if (adressRam.getComune() != null) {
/*  874 */           this.log.debug("COMUNE = " + adressRam.getComune().replace('\'', ' '));
/*      */         }
/*  876 */         if (adressRam.getProv() != null) {
/*  877 */           this.log.debug("PROVINCIA = " + adressRam.getProv().replace('\'', ' '));
/*      */         }
/*  879 */         if (adressRam.getNazione() != null) {
/*  880 */           this.log.debug("NAZIONE = " + adressRam.getNazione().replace('\'', ' '));
/*      */         }
/*      */       } 
/*      */ 
/*      */       
/*      */       try {
/*  886 */         MapContainer inMap = new MapContainer();
/*      */         
/*  888 */         inMap.putAppl("toponimoIn", ArchUtils.isValid(adressRam.getDesToponimo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adressRam.getDesToponimo(), "{")) : "");
/*  889 */         inMap.putAppl("indirizzoIn", ArchUtils.isValid(adressRam.getIndirizzo()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adressRam.getIndirizzo(), "{")) : "");
/*  890 */         inMap.putAppl("numCivicoIn", ArchUtils.isValid(adressRam.getNumeroCivico()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adressRam.getNumeroCivico(), "{")) : "");
/*  891 */         inMap.putAppl("pressoIn", ArchUtils.isValid(adressRam.getPresso()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adressRam.getPresso(), "{")) : "");
/*  892 */         inMap.putAppl("localitaIn", ArchUtils.isValid(adressRam.getLocalita()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adressRam.getLocalita(), "{")) : "");
/*  893 */         inMap.putAppl("provIn", ArchUtils.isValid(adressRam.getProv()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adressRam.getProv(), "{")) : "");
/*  894 */         inMap.putAppl("capIn", ArchUtils.isValid(adressRam.getCap()) ? StringUtils.remove(adressRam.getCap(), "{") : "");
/*  895 */         inMap.putAppl("nazioneIn", ArchUtils.isValid(adressRam.getNazione()) ? StringEscapeUtils.escapeSql(StringUtils.remove(adressRam.getNazione(), "{")) : "");
/*      */         
/*  897 */         if (this.log.isDebugEnabled()) {
/*  898 */           this.log.debug("START NORMALIZZAZIONE INDIRIZZO");
/*      */         }
/*  900 */         map = this.normalizzaIndirizzoService.service(inMap);
/*  901 */         if (this.log.isDebugEnabled()) {
/*  902 */           this.log.debug("END NORMALIZZAZIONE INDIRIZZO");
/*      */         
/*      */         }
/*      */       }
/*  906 */       catch (Exception e) {
/*      */         
/*  908 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  910 */         rse.setStackTrace(e.getStackTrace());
/*  911 */         throw rse;
/*      */       } 
/*      */       
/*  914 */       if (map != null) {
/*  915 */         ArrayList tmpList = (ArrayList)map.getAppl("RESULT");
/*  916 */         if (tmpList != null && tmpList.size() > 0) {
/*  917 */           normalizzatoreContainer = tmpList.get(0);
/*      */         }
/*      */       } 
/*  920 */       if (normalizzatoreContainer != null) {
/*  921 */         if (this.log.isDebugEnabled()) {
/*  922 */           this.log.debug("Recupero i dati del soggetto dal container");
/*      */         }
/*  924 */         if (ArchUtils.isValid(normalizzatoreContainer.getError()) && !"0".equals(normalizzatoreContainer.getError())) {
/*      */           
/*  926 */           resultMap.putAppl("ERROR_CODE", normalizzatoreContainer.getError());
/*  927 */           resultMap.putAppl("ERROR_DES", normalizzatoreContainer.getError_des());
/*  928 */           result = "NOT_EXECUTED";
/*  929 */           if (this.log.isErrorEnabled()) {
/*  930 */             this.log.error("NORMALIZZAZIONE INDIRIZZO");
/*  931 */             this.log.error("Codice errore: " + normalizzatoreContainer.getError() + " Descrizione: " + normalizzatoreContainer.getError_des());
/*      */           } 
/*      */         } else {
/*  934 */           if (this.log.isDebugEnabled()) {
/*      */             
/*  936 */             this.log.debug("NORMALIZZAZIONE INDIRIZZO");
/*  937 */             this.log.debug("Codice errore: " + normalizzatoreContainer.getError() + " Descrizione: " + normalizzatoreContainer.getError_des());
/*  938 */             this.log.debug("OUT_INDIRIZZO = " + normalizzatoreContainer.getIndirizzo());
/*  939 */             this.log.debug("OUT_CAP =" + normalizzatoreContainer.getCap());
/*  940 */             this.log.debug("OUT_COMUNE =" + normalizzatoreContainer.getComune());
/*  941 */             this.log.debug("OUT_PROV =" + normalizzatoreContainer.getProv());
/*      */           } 
/*  943 */           adressRam.setCodToponimo(normalizzatoreContainer.getCodToponimo());
/*  944 */           adressRam.setDesToponimo(normalizzatoreContainer.getDesToponimo());
/*  945 */           adressRam.setIndirizzo(normalizzatoreContainer.getIndirizzo());
/*      */           
/*  947 */           if (ArchUtils.isValid(normalizzatoreContainer.getNumCivico())) {
/*  948 */             if (normalizzatoreContainer.getNumCivico().length() > 20) {
/*  949 */               if (this.log.isWarnEnabled()) {
/*  950 */                 this.log.warn("Nel campo numero civico sono inseriti i primi 20 caratteri del valore restituito");
/*      */               }
/*      */               
/*      */               try {
/*  954 */                 adressRam.setNumeroCivico(normalizzatoreContainer.getNumCivico().substring(0, 20));
/*      */               }
/*  956 */               catch (Exception e) {
/*      */                 
/*  958 */                 RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */                 
/*  960 */                 rse.setStackTrace(e.getStackTrace());
/*  961 */                 throw rse;
/*      */               }
/*      */             
/*      */             } else {
/*      */               
/*  966 */               adressRam.setNumeroCivico(normalizzatoreContainer.getNumCivico());
/*      */             } 
/*      */           }
/*  969 */           adressRam.setCap(normalizzatoreContainer.getCap());
/*  970 */           adressRam.setComune(normalizzatoreContainer.getComune());
/*  971 */           adressRam.setLocalita(normalizzatoreContainer.getLocalita());
/*  972 */           adressRam.setProv(normalizzatoreContainer.getProv());
/*  973 */           adressRam.setIndiSeparato("S");
/*  974 */           adressRam.setPresso(normalizzatoreContainer.getPresso());
/*  975 */           if ("ITA".equals(normalizzatoreContainer.getNazione())) {
/*  976 */             adressRam.setNazione("086");
/*      */           } else {
/*  978 */             adressRam.setNazione(normalizzatoreContainer.getNazione());
/*      */           } 
/*      */           
/*  981 */           adressRam.setCabResidenza(normalizzatoreContainer.getCab());
/*      */         }
/*      */       
/*      */       } else {
/*      */         
/*  986 */         result = "NOT_EXECUTED";
/*  987 */         if (this.log.isErrorEnabled()) {
/*  988 */           this.log.error("L'ndirizzo passato in input ha valore null");
/*      */         }
/*      */       } 
/*      */     } 
/*  992 */     resultMap.putAppl("INDIRIZZO", adressRam);
/*  993 */     resultMap.putAppl("RESULT", result);
/*  994 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String verifyPartitaIVA(String pIva) throws RasServiceException {
/* 1000 */     String result = "OK";
/*      */     
/* 1002 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String verifyCf(String codFiscale) throws RasServiceException {
/* 1008 */     String result = "OK";
/*      */     
/* 1010 */     if (codFiscale == null) {
/*      */       
/* 1012 */       if (this.log.isErrorEnabled()) {
/* 1013 */         this.log.error("Il codice fiscale passato in input ha valore null");
/*      */       }
/* 1015 */       result = "KO";
/*      */     } 
/* 1017 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String verifyCF(FinSoggetto subject) throws RasServiceException {
/* 1023 */     String result = "OK";
/*      */     
/* 1025 */     int gg = 0;
/* 1026 */     int mm = 0;
/* 1027 */     int aaaa = 0;
/* 1028 */     char sesso = ' ';
/* 1029 */     if (subject != null) {
/*      */       
/* 1031 */       if (subject.getDataNascita() != null) {
/*      */         
/* 1033 */         Calendar calendar = new GregorianCalendar();
/*      */         
/*      */         try {
/* 1036 */           calendar.setTime(subject.getDataNascita());
/* 1037 */           aaaa = calendar.get(1);
/* 1038 */           mm = calendar.get(2);
/* 1039 */           mm++;
/* 1040 */           gg = calendar.get(5);
/*      */         }
/* 1042 */         catch (Exception e) {
/*      */           
/* 1044 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */           
/* 1046 */           rse.setStackTrace(e.getStackTrace());
/* 1047 */           throw rse;
/*      */         } 
/*      */       } 
/* 1050 */       if (subject.getSesso() != null) {
/* 1051 */         sesso = subject.getSesso().charAt(0);
/*      */       
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1057 */       if (this.log.isErrorEnabled()) {
/* 1058 */         this.log.error("Il soggetto passato in input ha valore null");
/*      */       }
/* 1060 */       result = "KO";
/*      */     } 
/* 1062 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private Date getDataInfinito() throws RasServiceException {
/* 1068 */     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
/* 1069 */     Date date = new Date();
/*      */     
/*      */     try {
/* 1072 */       date = formatter.parse("99991231");
/*      */     }
/* 1074 */     catch (Exception e) {
/*      */       
/* 1076 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */       
/* 1078 */       rse.setStackTrace(e.getStackTrace());
/* 1079 */       throw rse;
/*      */     } 
/* 1081 */     return date;
/*      */   }
/*      */ 
/*      */   
/*      */   public RasServiceException getRasServiceException() {
/* 1086 */     return this.rasServiceException;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRasServiceException(RasServiceException rasServiceException) {
/* 1091 */     this.rasServiceException = rasServiceException;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isAvailable() {
/* 1096 */     return true;
/*      */   }
/*      */ 
/*      */   
/*      */   public RasNormalizerExceptionSRV getRasNormalizerExceptionSRV() {
/* 1101 */     return this.rasNormalizerExceptionSRV;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRasNormalizerExceptionSRV(RasNormalizerExceptionSRV rasNormalizerExceptionSRV) {
/* 1106 */     this.rasNormalizerExceptionSRV = rasNormalizerExceptionSRV;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean isAutomaticSex() {
/* 1111 */     return this.automaticSex;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAutomaticSex(boolean automaticSex) {
/* 1116 */     this.automaticSex = automaticSex;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNormalizzaSoggettoService(SingleModuleService normalizzaSoggettoService) {
/* 1121 */     this.normalizzaSoggettoService = normalizzaSoggettoService;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNormalizzaIndirizzoService(SingleModuleService normalizzaIndirizzoService) {
/* 1126 */     this.normalizzaIndirizzoService = normalizzaIndirizzoService;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\normalizer\RasNormalizer.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */