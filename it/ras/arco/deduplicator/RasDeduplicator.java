/*      */ package it.ras.arco.deduplicator;
/*      */ 
/*      */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.bean.FinSoggettoEsteso;
/*      */ import it.ras.arco.bean.FinSoggettoIndir;
/*      */ import it.ras.arco.bean.NormSoggettoMC;
/*      */ import it.ras.flag.config.IRasXmlFileReader;
/*      */ import it.ras.flag.exception.RasException;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.exception.RasTransactionException;
/*      */ import it.ras.flag.exception.RasValidationSignal;
/*      */ import it.ras.flag.service.IRasService;
/*      */ import it.ras.flag.transaction.IRasRequiredTransaction;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ import org.apache.log4j.MDC;
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
/*      */ public class RasDeduplicator
/*      */   implements IRasDeduplicatorUtilManager
/*      */ {
/*      */   public static final String CODICE_FISCALE = "CODICE_FISCALE";
/*      */   public static final String TIPO_SOGGETTO = "TIPO_SOGGETTO";
/*      */   public static final String COGNOME = "COGNOME";
/*      */   public static final String NOME = "NOME";
/*      */   public static final String DATA_NASCITA = "DATA_NASCITA";
/*      */   public static final String PARTITA_IVA = "PARTITA_IVA";
/*      */   public static final String DENOMINAZIONE = "DENOMINAZIONE";
/*      */   public static final String FABBRICA = "FABBRICA";
/*      */   public static final String CODICE_ESTERNO = "CODICE_ESTERNO";
/*      */   public static final String SOGGETTO = "SOGGETTO";
/*      */   public static final String INDIRIZZO = "INDIRIZZO";
/*      */   public static final String GENERIC_MODULE_RESULT = "SOGGETTO";
/*      */   public static final String RESIDENZA = "RES";
/*      */   public static final String DIVERSO = "DIVERSO";
/*      */   public static final String BY_DECOD_NDG_FABBR = "BY_DECOD_NDG_FABBR";
/*      */   public static final String NOT_BY_DECOD_NDG_FABBR = "NOT_BY_DECOD_NDG_FABBR";
/*      */   public static final String SOGGETTO_ID = "SOGGETTO_ID";
/*      */   public static final String COD_MATC_CODE_NOM1 = "COD_MATC_CODE_NOM1";
/*      */   public static final String COD_MATC_CODE_NOM2 = "COD_MATC_CODE_NOM2";
/*      */   public static final String COD_MATC_CODE_DNAS = "COD_MATC_CODE_DNAS";
/*      */   public static final String COD_MATC_CODE_CFIS = "COD_MATC_CODE_CFIS";
/*      */   public static final String COD_TIPO_SOGG = "COD_TIPO_SOGG";
/*      */   public static final String COD_STRI_RIC1 = "COD_STRI_RIC1";
/*      */   public static final String COD_STRI_RIC2 = "COD_STRI_RIC2";
/*      */   public static final String COD_STRI_RIC3 = "COD_STRI_RIC3";
/*      */   public static final String SOGGETTO_BOZZA = "SOGGETTO_BOZZA";
/*      */   public static final String METODO = "METODO";
/*      */   public static final String ERRORE = "ERRORE";
/*      */   public static final String NDG_ARCO_N = "NDG_ARCO_N";
/*      */   public static final String FABBRICA_T = "FABBRICA_T";
/*      */   public static final String CODICE_FISCALE_S = "CODICE_FISCALE_S";
/*      */   public static final String PARTITA_IVA_S = "PARTITA_IVA_S";
/*      */   public static final String DENOMINAZIONE_S = "DENOMINAZIONE_S";
/*      */   public static final String COGNOME_S = "COGNOME_S";
/*      */   public static final String NOME_S = "NOME_S";
/*      */   public static final String MODULE_NAME = "MODULE_NAME";
/*      */   public static final String GetSoggettoByCodiceEsterno_Fabbrica = "GetSoggettoByCodiceEsterno_Fabbrica";
/*      */   public static final String GetSoggettoByCodiceFiscaleCognomeNomeDataNascita = "GetSoggettoByCodiceFiscaleCognomeNomeDataNascita";
/*      */   public static final String GetSoggettoByPartitaIvaDenominazione = "GetSoggettoByPartitaIvaDenominazione";
/*      */   public static final String GetSoggettoMCByMatchCodeFullMD = "GetSoggettoMCByMatchCodeFullMD";
/*      */   public static final String GetSoggettoByMCNullCFMD = "GetSoggettoByMCNullCFMD";
/*      */   public static final String GetSoggettoByMCWithoutCFMD = "GetSoggettoByMCWithoutCFMD";
/*      */   public static final String getSubjectByCompleteMC = "getSubjectByCompleteMC";
/*      */   public static final String getSubjectByMCNullCF = "getSubjectByMCNullCF";
/*      */   public static final String getSubjectByMCWithoutCF = "getSubjectByMCWithoutCF";
/*  141 */   static Log logger = LogFactory.getLog(RasDeduplicator.class);
/*      */ 
/*      */   
/*      */   protected IRasRequiredTransaction _transaction;
/*      */   
/*  146 */   protected RasServiceException rasServiceException = null;
/*      */ 
/*      */ 
/*      */   
/*      */   protected boolean onLine = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConfigTransaction(IRasRequiredTransaction transaction) {
/*  156 */     this._transaction = transaction;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void init() throws RasException {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMode(String mode) {
/*  175 */     throw new UnsupportedOperationException("setMode(String)");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFileReader(IRasXmlFileReader fileReader) {
/*  184 */     throw new UnsupportedOperationException("setFileReader(IRasXmlFileReader)");
/*      */   }
/*      */ 
/*      */   
/*      */   public void setOnLine(boolean onLine) {
/*  189 */     this.onLine = onLine;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConfigService(IRasService configService) {
/*  199 */     throw new UnsupportedOperationException("setConfigService(IRasService)");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void destroy() {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer deduplicate(FinSoggetto subject) throws RasServiceException {
/*  211 */     return deduplicate(subject, null, null);
/*      */   }
/*      */ 
/*      */   
/*      */   public MapContainer deduplicate(FinSoggetto subject, FinIndirizzo adress) throws RasServiceException {
/*  216 */     return deduplicate(subject, adress, null);
/*      */   }
/*      */ 
/*      */   
/*      */   public MapContainer deduplicate(FinSoggetto subject, FinIndirizzo adress, FinDecodNdgFabbr decodNdgFabbr) throws RasServiceException {
/*  221 */     MapContainer resultMap = new MapContainer();
/*  222 */     MapContainer resultRis = null;
/*  223 */     FinSoggetto soggetto = null;
/*  224 */     String risultato = null;
/*  225 */     String risultatoMessage = "NOT_BY_DECOD_NDG_FABBR";
/*  226 */     risultato = "NOT_FOUND";
/*  227 */     if (subject.getTipoSogg().equals("C")) {
/*  228 */       if (logger.isWarnEnabled()) {
/*  229 */         logger.warn("Il soggetto da deduplicare è una cointestazione");
/*      */       }
/*  231 */       resultMap.putAppl("SOGGETTO", soggetto);
/*  232 */       resultMap.putAppl("RESULT", risultato);
/*  233 */       return resultMap;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  239 */     if (this.onLine) {
/*  240 */       MapContainer paramMap = new MapContainer();
/*  241 */       MapContainer resultModule = null;
/*  242 */       String moduleName = null;
/*  243 */       if (subject.getTipoSogg().equals("F")) {
/*  244 */         moduleName = "GetSoggettoByCodiceFiscale";
/*  245 */         risultatoMessage = "FOUND-GetSoggettoByCodiceFiscale";
/*  246 */       } else if (subject.getTipoSogg().equals("G")) {
/*      */         
/*  248 */         moduleName = "GetSoggettoByPartitaIva";
/*  249 */         risultatoMessage = "FOUND-GetSoggettoByPartitaIva";
/*      */       } 
/*  251 */       String partitaIva = subject.getPartitaIva();
/*  252 */       String codiceFiscale = subject.getCodiceFiscale();
/*  253 */       paramMap.putAppl("CODICE_FISCALE", codiceFiscale);
/*  254 */       paramMap.putAppl("PARTITA_IVA", partitaIva);
/*  255 */       paramMap.putAppl("MODULE_NAME", moduleName);
/*      */ 
/*      */       
/*      */       try {
/*  259 */         resultModule = this._transaction.transaction(paramMap);
/*  260 */       } catch (RasTransactionException e) {
/*  261 */         e.printStackTrace();
/*  262 */         onLineException("errors.dedup.error", null);
/*      */       } 
/*      */       
/*  265 */       resultModule = processResultMap(resultModule, false);
/*  266 */       risultato = (String)resultModule.getAppl("RESULT");
/*  267 */       if (risultato.equals("FOUND") || risultato.equals("TOO_MANY_ROWS")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  273 */         Object oResult = resultModule.getAppl("SOGGETTO");
/*  274 */         if (oResult instanceof List) {
/*  275 */           soggetto = ((List)oResult).get(0);
/*  276 */         } else if (oResult instanceof FinSoggetto) {
/*  277 */           soggetto = (FinSoggetto)resultModule.getAppl("SOGGETTO");
/*      */         } 
/*  279 */         MDCLogger(moduleName, soggetto, null);
/*  280 */         onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */         
/*  282 */         resultMap.putAppl("SOGGETTO", soggetto);
/*  283 */         resultMap.putAppl("RESULT", risultato);
/*  284 */         resultMap.putAppl("RESULT_MESSAGE", risultatoMessage);
/*      */         
/*  286 */         return resultMap;
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  295 */     FinIndirizzo indirizzo = adress;
/*  296 */     FinSoggettoIndir soggIndir = null;
/*  297 */     Date today = new Date();
/*      */     
/*  299 */     if (indirizzo == null && 
/*  300 */       subject.getIndirizzoResidenza() != null && !subject.getIndirizzoResidenza().isEmpty()) {
/*      */       
/*  302 */       Iterator i = subject.getIndirizzoResidenza().iterator();
/*  303 */       while (i.hasNext()) {
/*  304 */         soggIndir = i.next();
/*  305 */         if (soggIndir.getTipoIndirizzo() != null && soggIndir.getDataFine() != null)
/*      */         {
/*  307 */           if (soggIndir.getTipoIndirizzo().equals("RES") && soggIndir.getDataFine().after(today)) {
/*      */             
/*  309 */             indirizzo = soggIndir.getIndirizzo();
/*      */             
/*      */             break;
/*      */           } 
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  317 */     resultRis = verifyInput(subject, indirizzo);
/*  318 */     String result = (String)resultRis.getAppl("RESULT");
/*  319 */     if (result.equals("OK")) {
/*  320 */       subject = (FinSoggetto)resultRis.getAppl("SOGGETTO");
/*  321 */       if (indirizzo != null) {
/*  322 */         indirizzo = (FinIndirizzo)resultRis.getAppl("INDIRIZZO");
/*      */       }
/*  324 */       resultRis = new MapContainer();
/*  325 */       if (decodNdgFabbr != null) {
/*  326 */         resultRis = getSubjectByExternalCode(decodNdgFabbr, subject);
/*  327 */         soggetto = (FinSoggetto)resultRis.getAppl("SOGGETTO");
/*  328 */         risultato = (String)resultRis.getAppl("RESULT");
/*  329 */         if (soggetto != null) {
/*  330 */           risultato = verifySubject(subject, soggetto);
/*  331 */           if (risultato.equals("FOUND")) {
/*  332 */             risultatoMessage = "BY_DECOD_NDG_FABBR";
/*      */           }
/*      */         } 
/*      */       } 
/*  336 */       if (soggetto == null && risultato.equals("NOT_FOUND")) {
/*      */         
/*  338 */         resultRis = new MapContainer();
/*  339 */         resultRis = getSubject(subject);
/*  340 */         soggetto = (FinSoggetto)resultRis.getAppl("SOGGETTO");
/*  341 */         risultato = (String)resultRis.getAppl("RESULT");
/*  342 */         if (soggetto == null && risultato.equals("NOT_FOUND")) {
/*      */           
/*  344 */           resultRis = new MapContainer();
/*  345 */           if (subject.getCodiceFiscale() == null || subject.getCodiceFiscale().equals("")) {
/*      */             
/*  347 */             String metodo = "getSubjectByMCWithoutCF";
/*  348 */             resultRis = getSubjectByMC(subject, indirizzo, metodo);
/*  349 */             soggetto = (FinSoggetto)resultRis.getAppl("SOGGETTO");
/*  350 */             risultato = (String)resultRis.getAppl("RESULT");
/*      */           } else {
/*      */             
/*  353 */             String metodo = "getSubjectByCompleteMC";
/*  354 */             resultRis = getSubjectByMC(subject, indirizzo, metodo);
/*  355 */             soggetto = (FinSoggetto)resultRis.getAppl("SOGGETTO");
/*  356 */             risultato = (String)resultRis.getAppl("RESULT");
/*      */             
/*  358 */             if (soggetto == null) {
/*  359 */               resultRis = new MapContainer();
/*  360 */               metodo = "getSubjectByMCNullCF";
/*  361 */               resultRis = getSubjectByMC(subject, indirizzo, metodo);
/*      */               
/*  363 */               soggetto = (FinSoggetto)resultRis.getAppl("SOGGETTO");
/*      */               
/*  365 */               risultato = (String)resultRis.getAppl("RESULT");
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */       
/*  371 */       if (decodNdgFabbr != null && 
/*  372 */         risultato.equals("FOUND") && !risultatoMessage.equals("BY_DECOD_NDG_FABBR")) {
/*      */ 
/*      */         
/*  375 */         String ris = null;
/*  376 */         resultRis = getDecodBySoggettoIdFabbrica(soggetto, decodNdgFabbr);
/*      */         
/*  378 */         ris = (String)resultRis.getAppl("RESULT");
/*  379 */         if (!ris.equals("NOT_FOUND")) {
/*  380 */           if (logger.isWarnEnabled()) {
/*  381 */             logger.warn("Il soggetto trovato ha un NdgFabbr diverso da quello del soggetto da censire");
/*      */           }
/*      */           
/*  384 */           if (this.onLine) {
/*  385 */             onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */           }
/*      */           
/*  388 */           risultato = "GENERIC ERROR";
/*      */         } 
/*      */       } 
/*      */     } else {
/*      */       
/*  393 */       risultato = "GENERIC ERROR";
/*      */     } 
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
/*  407 */     if (soggetto != null && soggetto.getStatoCensim() != null && soggetto.getStatoCensim().equals("B")) {
/*      */       
/*  409 */       resultMap.putAppl("SOGGETTO", null);
/*  410 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */       
/*  412 */       this; resultMap.putAppl("RESULT_MESSAGE", "SOGGETTO_BOZZA");
/*      */     } else {
/*      */       
/*  415 */       resultMap.putAppl("SOGGETTO", soggetto);
/*  416 */       resultMap.putAppl("RESULT", risultato);
/*  417 */       resultMap.putAppl("RESULT_MESSAGE", risultatoMessage);
/*      */     } 
/*  419 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer getSubjectByExternalCode(FinDecodNdgFabbr decodNdgFabbr, FinSoggetto subject) throws RasServiceException {
/*  425 */     MapContainer resultM = new MapContainer();
/*  426 */     String risultato = null;
/*  427 */     if (logger.isDebugEnabled()) {
/*  428 */       logger.debug("Start getSubjectByExternalCode");
/*      */     }
/*      */     
/*  431 */     FinSoggetto soggetto = null;
/*  432 */     String result = null;
/*  433 */     String metodo = "getSubjectByExternalCode";
/*      */ 
/*      */     
/*  436 */     MapContainer paramMap = new MapContainer();
/*  437 */     MapContainer resultMap = new MapContainer();
/*  438 */     String codiceEsterno = decodNdgFabbr.getNdgFab();
/*  439 */     String fabbrica = decodNdgFabbr.getFabbrica();
/*  440 */     String moduleName = "GetSoggettoByCodiceEsterno_Fabbrica";
/*  441 */     paramMap.putAppl("CODICE_ESTERNO", codiceEsterno);
/*  442 */     paramMap.putAppl("FABBRICA", fabbrica);
/*  443 */     paramMap.putAppl("MODULE_NAME", moduleName);
/*      */     
/*      */     try {
/*  446 */       resultMap = this._transaction.transaction(paramMap);
/*  447 */     } catch (RasTransactionException e) {
/*  448 */       e.printStackTrace();
/*  449 */       onLineException("errors.dedup.error", null);
/*      */     } 
/*  451 */     resultMap = processResultMap(resultMap, false);
/*  452 */     result = (String)resultMap.getAppl("RESULT");
/*  453 */     if (result.equals("FOUND")) {
/*  454 */       soggetto = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*  455 */       MDCLogger(metodo, soggetto, fabbrica);
/*      */       
/*  457 */       if (this.onLine) {
/*  458 */         if (subject.getSoggettoId() != null) {
/*  459 */           if (!subject.getSoggettoId().equals(soggetto.getSoggettoId()))
/*      */           {
/*  461 */             onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */           }
/*      */         } else {
/*      */           
/*  465 */           onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */         } 
/*      */       }
/*      */ 
/*      */ 
/*      */       
/*  471 */       risultato = result;
/*  472 */     } else if (result.equals("NOT_FOUND")) {
/*  473 */       if (logger.isDebugEnabled()) {
/*  474 */         logger.debug("Soggetto non trovato");
/*      */       }
/*  476 */       soggetto = null;
/*      */       
/*  478 */       risultato = result;
/*  479 */     } else if (result.equals("TOO_MANY_ROWS")) {
/*  480 */       if (logger.isErrorEnabled()) {
/*  481 */         logger.error("Trovato piu di un soggetto");
/*      */       }
/*  483 */       soggetto = null;
/*  484 */       risultato = "GENERIC ERROR";
/*      */     } 
/*      */     
/*  487 */     if (logger.isDebugEnabled()) {
/*  488 */       logger.debug("End getSubjectByExternalCode");
/*      */     }
/*  490 */     resultM.putAppl("SOGGETTO", soggetto);
/*  491 */     resultM.putAppl("RESULT", risultato);
/*  492 */     return resultM;
/*      */   }
/*      */ 
/*      */   
/*      */   public MapContainer getDecodBySoggettoIdFabbrica(FinSoggetto soggetto, FinDecodNdgFabbr decodNdgFabbr) throws RasServiceException {
/*  497 */     MapContainer resultMap = new MapContainer();
/*  498 */     MapContainer paramMap = new MapContainer();
/*  499 */     Integer soggettoId = soggetto.getSoggettoId();
/*  500 */     String fabbrica = decodNdgFabbr.getFabbrica();
/*  501 */     paramMap.putAppl("SOGGETTO_ID", soggettoId);
/*  502 */     paramMap.putAppl("FABBRICA", fabbrica);
/*  503 */     String moduleName = "GetDecodBySoggettoIdFabbrica";
/*  504 */     paramMap.putAppl("MODULE_NAME", moduleName);
/*      */     
/*      */     try {
/*  507 */       resultMap = this._transaction.transaction(paramMap);
/*  508 */     } catch (RasTransactionException e) {
/*  509 */       e.printStackTrace();
/*  510 */       onLineException("errors.dedup.error", null);
/*      */     } 
/*  512 */     return processResultMap(resultMap, false);
/*      */   }
/*      */ 
/*      */   
/*      */   private String verifySubject(FinSoggetto soggetto, FinSoggetto soggettoTrovato) throws RasServiceException {
/*  517 */     if (logger.isDebugEnabled()) {
/*  518 */       logger.debug("Start verifySubject()");
/*      */     }
/*      */     
/*  521 */     String ris = "GENERIC ERROR";
/*      */     
/*  523 */     if (soggetto.getTipoSogg().equals("F")) {
/*      */       
/*  525 */       if (logger.isDebugEnabled()) {
/*  526 */         logger.debug("Persona fisica");
/*      */       }
/*  528 */       if ((soggettoTrovato.getDataNascita() == null || soggetto.getDataNascita() == null || soggettoTrovato.getDataNascita().equals(soggetto.getDataNascita())) && (soggettoTrovato.getSesso() == null || soggetto.getSesso() == null || soggettoTrovato.getSesso().equals(soggetto.getSesso())))
/*      */       {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  534 */         if (soggettoTrovato.getCodiceFiscale() == null || soggettoTrovato.getCodiceFiscale().equals("") || soggetto.getCodiceFiscale().equals("")) {
/*      */ 
/*      */           
/*  537 */           if (soggettoTrovato.getCognome().equals(soggetto.getCognome()))
/*      */           {
/*  539 */             ris = "FOUND";
/*      */             
/*  541 */             if (logger.isDebugEnabled()) {
/*  542 */               logger.debug("Soggetti equivalenti");
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/*  552 */         else if (soggetto.getCodiceFiscale() != null && soggetto.getCodiceFiscale().length() == 16 && soggettoTrovato.getCodiceFiscale() != null && soggettoTrovato.getCodiceFiscale().length() == 16) {
/*      */ 
/*      */ 
/*      */           
/*  556 */           if ((soggetto.getCodiceFiscale().substring(0, 3) + soggetto.getCodiceFiscale().substring(6, 11)).equals(soggetto.getCodiceFiscale().substring(0, 3) + soggetto.getCodiceFiscale().substring(6, 11))) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*  562 */             ris = "FOUND";
/*      */             
/*  564 */             if (logger.isDebugEnabled()) {
/*  565 */               logger.debug("Soggetti equivalenti");
/*      */             }
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } else {
/*      */       
/*  572 */       if (logger.isDebugEnabled()) {
/*  573 */         logger.debug("Persona giuridica");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  583 */       FinSoggettoEsteso soggettoEsteso = new FinSoggettoEsteso(soggetto);
/*  584 */       FinSoggettoEsteso soggettoTrovatoEsteso = new FinSoggettoEsteso(soggettoTrovato);
/*      */ 
/*      */       
/*  587 */       if (soggettoEsteso.getCOD_MATC_CODE_NOM1().equals(soggettoTrovatoEsteso.getCOD_MATC_CODE_NOM1()) && soggettoEsteso.getCOD_MATC_CODE_NOM2().equals(soggettoTrovatoEsteso.getCOD_MATC_CODE_NOM2())) {
/*      */ 
/*      */ 
/*      */         
/*  591 */         ris = "FOUND";
/*      */         
/*  593 */         if (logger.isDebugEnabled()) {
/*  594 */           logger.debug("Soggetti equivalenti");
/*      */         }
/*  596 */       } else if (soggettoEsteso.getCOD_STRI_RIC1().equals(soggettoTrovatoEsteso.getCOD_STRI_RIC1()) || soggettoEsteso.getCOD_STRI_RIC2().equals(soggettoTrovatoEsteso.getCOD_STRI_RIC2())) {
/*      */ 
/*      */ 
/*      */         
/*  600 */         ris = "FOUND";
/*      */       } else {
/*  602 */         if (this.onLine) {
/*  603 */           onLineException("errors.dedup.wrong.<>", "Il soggetto da censire non equivale a quello trovato");
/*      */         }
/*      */ 
/*      */         
/*  607 */         if (logger.isErrorEnabled()) {
/*  608 */           logger.error("Il soggetto da censire non equivale a quello trovato");
/*      */         }
/*      */         
/*  611 */         ris = "GENERIC ERROR";
/*      */       } 
/*      */     } 
/*      */     
/*  615 */     if (logger.isDebugEnabled()) {
/*  616 */       logger.debug("End verifySubject()");
/*      */     }
/*      */     
/*  619 */     return ris;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private MapContainer verifyInput(FinSoggetto soggetto, FinIndirizzo indirizzo) throws RasServiceException {
/*  625 */     if (logger.isDebugEnabled()) {
/*  626 */       logger.debug("Start verifyInput()");
/*      */     }
/*      */     
/*  629 */     MapContainer resultMap = new MapContainer();
/*  630 */     String metodo = "verifyInput";
/*  631 */     boolean datiMancanti = false;
/*  632 */     String ris = "OK";
/*      */ 
/*      */     
/*  635 */     if (soggetto.getTipoSogg() == null) {
/*  636 */       soggetto.setTipoSogg("");
/*      */     } else {
/*  638 */       soggetto.setTipoSogg(soggetto.getTipoSogg().toUpperCase());
/*      */     } 
/*      */ 
/*      */     
/*  642 */     if (soggetto.getCognome() == null) {
/*  643 */       soggetto.setCognome("");
/*      */     } else {
/*  645 */       soggetto.setCognome(soggetto.getCognome().toUpperCase());
/*      */     } 
/*      */     
/*  648 */     if (soggetto.getNome() == null) {
/*  649 */       soggetto.setNome("");
/*      */     } else {
/*  651 */       soggetto.setNome(soggetto.getNome().toUpperCase());
/*      */     } 
/*  653 */     if (soggetto.getDenominazione() == null) {
/*  654 */       soggetto.setDenominazione("");
/*      */     } else {
/*  656 */       soggetto.setDenominazione(soggetto.getDenominazione().toUpperCase());
/*      */     } 
/*      */     
/*  659 */     if (soggetto.getSesso() == null) {
/*  660 */       soggetto.setSesso("");
/*      */     } else {
/*  662 */       soggetto.setSesso(soggetto.getSesso().toUpperCase());
/*      */     } 
/*  664 */     if (soggetto.getCodiceFiscale() == null) {
/*  665 */       soggetto.setCodiceFiscale("");
/*      */     } else {
/*  667 */       soggetto.setCodiceFiscale(soggetto.getCodiceFiscale().toUpperCase());
/*      */     } 
/*      */     
/*  670 */     if (soggetto.getPartitaIva() == null) {
/*  671 */       soggetto.setPartitaIva("");
/*      */     } else {
/*  673 */       soggetto.setPartitaIva(soggetto.getPartitaIva().toUpperCase());
/*      */     } 
/*  675 */     if (soggetto.getTipoSocieta() == null) {
/*  676 */       soggetto.setTipoSocieta("");
/*      */     } else {
/*  678 */       soggetto.setTipoSocieta(soggetto.getTipoSocieta().toUpperCase());
/*      */     } 
/*  680 */     if (indirizzo != null) {
/*  681 */       if (indirizzo.getDesToponimo() == null) {
/*  682 */         indirizzo.setDesToponimo("");
/*      */       } else {
/*  684 */         indirizzo.setDesToponimo(indirizzo.getDesToponimo().toUpperCase());
/*      */       } 
/*      */       
/*  687 */       if (indirizzo.getIndirizzo() == null) {
/*  688 */         indirizzo.setIndirizzo("");
/*      */       } else {
/*  690 */         indirizzo.setIndirizzo(indirizzo.getIndirizzo().toUpperCase());
/*      */       } 
/*  692 */       if (indirizzo.getNumeroCivico() == null) {
/*  693 */         indirizzo.setNumeroCivico("");
/*      */       } else {
/*  695 */         indirizzo.setNumeroCivico(indirizzo.getNumeroCivico().toUpperCase());
/*      */       } 
/*      */       
/*  698 */       if (indirizzo.getCap() == null) {
/*  699 */         indirizzo.setCap("");
/*      */       } else {
/*  701 */         indirizzo.setCap(indirizzo.getCap().toUpperCase());
/*      */       } 
/*  703 */       if (indirizzo.getComune() == null) {
/*  704 */         indirizzo.setComune("");
/*      */       } else {
/*  706 */         indirizzo.setComune(indirizzo.getComune().toUpperCase());
/*      */       } 
/*  708 */       if (indirizzo.getLocalita() == null) {
/*  709 */         indirizzo.setLocalita("");
/*      */       } else {
/*  711 */         indirizzo.setLocalita(indirizzo.getLocalita().toUpperCase());
/*      */       } 
/*  713 */       if (indirizzo.getProv() == null) {
/*  714 */         indirizzo.setProv("");
/*      */       } else {
/*  716 */         indirizzo.setProv(indirizzo.getProv().toUpperCase());
/*      */       } 
/*      */       
/*  719 */       if (indirizzo.getNazione() == null) {
/*  720 */         indirizzo.setNazione("");
/*      */       } else {
/*  722 */         indirizzo.setNazione(indirizzo.getNazione().toUpperCase());
/*      */       } 
/*  724 */       resultMap.putAppl("INDIRIZZO", indirizzo);
/*      */     } 
/*  726 */     resultMap.putAppl("SOGGETTO", soggetto);
/*      */     
/*  728 */     MDCLogger(metodo, soggetto, null);
/*      */     
/*  730 */     if (!soggetto.getTipoSogg().equals("F") && !soggetto.getTipoSogg().equals("G") && !soggetto.getTipoSogg().equals("C")) {
/*      */ 
/*      */ 
/*      */       
/*  734 */       if (this.onLine) {
/*  735 */         onLineException("errors.dedup.wrong.dati", "Tipo soggetto errato");
/*      */       }
/*      */ 
/*      */       
/*  739 */       if (logger.isErrorEnabled()) {
/*  740 */         logger.error("Tipo soggetto errato");
/*      */       }
/*  742 */       ris = "KO";
/*  743 */       resultMap.putAppl("RESULT", ris);
/*  744 */       return resultMap;
/*      */     } 
/*  746 */     if (soggetto.getTipoSogg().equals("G")) {
/*  747 */       if (soggetto.getDenominazione().equals("")) {
/*  748 */         datiMancanti = true;
/*  749 */         if (this.onLine) {
/*  750 */           onLineException("errors.dedup.wrong.dati", "Denominazione non presente");
/*      */         }
/*      */ 
/*      */         
/*  754 */         if (logger.isErrorEnabled()) {
/*  755 */           logger.error("Denominazione non presente");
/*      */         }
/*      */       } 
/*  758 */     } else if (soggetto.getTipoSogg().equals("F")) {
/*  759 */       if (soggetto.getCognome().equals("")) {
/*  760 */         datiMancanti = true;
/*  761 */         if (this.onLine) {
/*  762 */           onLineException("errors.dedup.wrong.dati", "Campo cognome non valorizzato");
/*      */         }
/*      */ 
/*      */         
/*  766 */         if (logger.isErrorEnabled()) {
/*  767 */           logger.error("Campo cognome non valorizzato");
/*      */         }
/*  769 */       } else if (soggetto.getNome().equals("")) {
/*  770 */         if (this.onLine) {
/*  771 */           onLineException("errors.dedup.wrong.dati", "Campo nome non valorizzato");
/*      */         }
/*      */ 
/*      */         
/*  775 */         if (logger.isErrorEnabled()) {
/*  776 */           logger.error("Campo nome non valorizzato");
/*      */         }
/*      */       }
/*  779 */       else if (soggetto.getSesso().equals("")) {
/*  780 */         if (this.onLine) {
/*  781 */           onLineException("errors.dedup.wrong.dati", "Campo sesso non valorizzato");
/*      */         }
/*      */ 
/*      */         
/*  785 */         if (logger.isErrorEnabled()) {
/*  786 */           logger.error("Campo sesso non valorizzato");
/*      */         }
/*      */       }
/*  789 */       else if (soggetto.getDataNascita() == null) {
/*  790 */         datiMancanti = true;
/*  791 */         if (this.onLine) {
/*  792 */           onLineException("errors.dedup.wrong.dati", "Campo data nascita non valorizzato");
/*      */         }
/*      */ 
/*      */         
/*  796 */         if (logger.isErrorEnabled()) {
/*  797 */           logger.error("Campo data nascita non valorizzatore");
/*      */         
/*      */         }
/*      */       }
/*      */     
/*      */     }
/*  803 */     else if (soggetto.getTipoSogg().equals("C") && 
/*  804 */       soggetto.getDenominazione().equals("")) {
/*  805 */       datiMancanti = true;
/*  806 */       if (this.onLine) {
/*  807 */         onLineException("errors.dedup.wrong.dati", "Denominazione non presente");
/*      */       }
/*      */ 
/*      */       
/*  811 */       if (logger.isErrorEnabled()) {
/*  812 */         logger.error("Denominazione non presente");
/*      */       }
/*      */     } 
/*      */     
/*  816 */     if (datiMancanti) {
/*  817 */       ris = "KO";
/*  818 */       resultMap.putAppl("RESULT", ris);
/*  819 */       return resultMap;
/*      */     } 
/*  821 */     if (indirizzo != null)
/*      */     {
/*      */ 
/*      */ 
/*      */       
/*  826 */       if (((soggetto.getTipoSogg().equals("F") || soggetto.getTipoSogg().equals("C")) && (soggetto.getCodiceFiscale() == null || soggetto.getCodiceFiscale().equals(""))) || (soggetto.getTipoSogg().equals("G") && soggetto.getPartitaIva() == null) || soggetto.getPartitaIva().equals(""))
/*      */       {
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
/*  845 */         if (!this.onLine && 
/*  846 */           indirizzoInvalido(indirizzo)) {
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
/*  857 */           if (logger.isErrorEnabled()) {
/*  858 */             logger.error("Indirizzo invalido");
/*      */           }
/*  860 */           resultMap.putAppl("RESULT", ris);
/*  861 */           ris = "KO";
/*  862 */           return resultMap;
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*  867 */     resultMap.putAppl("RESULT", ris);
/*      */     
/*  869 */     if (logger.isDebugEnabled()) {
/*  870 */       logger.debug("End verifyInput()");
/*      */     }
/*      */     
/*  873 */     return resultMap;
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean verifyAdress(FinIndirizzo indirizzo) {
/*  878 */     if (logger.isDebugEnabled()) {
/*  879 */       logger.debug("Start verifyAdress()");
/*      */     }
/*      */     
/*  882 */     if (indirizzo.getNazione() == null || indirizzo.getNazione().equals("")) {
/*  883 */       return false;
/*      */     }
/*  885 */     if (indirizzo.getComune() == null || indirizzo.getComune().equals("")) {
/*  886 */       return false;
/*      */     }
/*  888 */     if (indirizzo.getIndirizzo() == null || indirizzo.getIndirizzo().equals(""))
/*      */     {
/*  890 */       return false;
/*      */     }
/*  892 */     if (indirizzo.getCap() == null || indirizzo.getCap().equals("")) {
/*  893 */       return false;
/*      */     }
/*  895 */     if (indirizzo.getProv() == null || indirizzo.getProv().equals("")) {
/*  896 */       return false;
/*      */     }
/*  898 */     if (indirizzo.getNumeroCivico() == null || indirizzo.getNumeroCivico().equals(""))
/*      */     {
/*  900 */       return false;
/*      */     }
/*      */     
/*  903 */     if (logger.isDebugEnabled()) {
/*  904 */       logger.debug("End verifyAdress");
/*      */     }
/*      */     
/*  907 */     return true;
/*      */   }
/*      */   
/*      */   private boolean indirizzoInvalido(FinIndirizzo indirizzo) {
/*  911 */     if (indirizzo == null) {
/*  912 */       return true;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  918 */     if (logger.isDebugEnabled()) {
/*  919 */       logger.debug("Start-Stop indirizzoInvalido()");
/*      */     }
/*  921 */     return (((indirizzo.getNazione().equals("") || indirizzo.getNazione().equals("086")) && (indirizzo.getComune().equals("") || indirizzo.getIndirizzo().equals("") || (indirizzo.getCap().equals("") && indirizzo.getProv().equals("")))) || (!indirizzo.getNazione().equals("") && !indirizzo.getNazione().equals("") && indirizzo.getComune().equals("")));
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
/*      */   public MapContainer getSubject(FinSoggetto subject) throws RasServiceException {
/*  936 */     MapContainer resultM = new MapContainer();
/*  937 */     String risultato = null;
/*  938 */     if (logger.isDebugEnabled()) {
/*  939 */       logger.debug("Start getSubject");
/*      */     }
/*      */     
/*  942 */     FinSoggetto soggetto = null;
/*  943 */     String result = null;
/*  944 */     String metodo = null;
/*      */     
/*  946 */     MapContainer resultMap = new MapContainer();
/*      */     
/*  948 */     if (subject.getTipoSogg().equals("F")) {
/*  949 */       metodo = "getSoggettoByCodiceFiscaleCognomeNomeDataNascita";
/*  950 */       resultMap = getSoggettoByCodiceFiscaleCognomeNomeDataNascita(subject);
/*      */     } else {
/*      */       
/*  953 */       metodo = "getSoggettoByPartitaIvaDenominazione";
/*  954 */       resultMap = getSoggettoByPartitaIvaDenominazione(subject);
/*      */     } 
/*      */     
/*  957 */     resultMap = processResultMap(resultMap, false);
/*      */     
/*  959 */     result = (String)resultMap.getAppl("RESULT");
/*      */     
/*  961 */     if (result.equals("FOUND")) {
/*  962 */       soggetto = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*  963 */       MDCLogger(metodo, soggetto, null);
/*  964 */       if (logger.isDebugEnabled()) {
/*  965 */         logger.debug("Soggetto trovato");
/*      */       }
/*      */       
/*  968 */       if (this.onLine) {
/*  969 */         if (subject.getSoggettoId() != null) {
/*  970 */           if (!subject.getSoggettoId().equals(soggetto.getSoggettoId()))
/*      */           {
/*  972 */             onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */           }
/*      */         } else {
/*      */           
/*  976 */           onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */         } 
/*      */       }
/*      */       
/*  980 */       risultato = result;
/*  981 */     } else if (result.equals("NOT_FOUND")) {
/*  982 */       if (logger.isDebugEnabled()) {
/*  983 */         logger.debug("Soggetto non trovato");
/*      */       }
/*  985 */       soggetto = null;
/*  986 */       risultato = result;
/*  987 */     } else if (result.equals("TOO_MANY_ROWS")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  995 */       ArrayList resultQuery = null;
/*  996 */       resultQuery = (ArrayList)resultMap.getAppl("SOGGETTO");
/*  997 */       List soggetti = resultQuery;
/*  998 */       int size = soggetti.size();
/*      */ 
/*      */       
/* 1001 */       for (int j = 0; j < size; j++) {
/*      */         
/* 1003 */         if (((FinSoggetto)soggetti.get(j)).getStatoCensim() != null && ((FinSoggetto)soggetti.get(j)).getStatoCensim().equals("B")) {
/*      */ 
/*      */           
/* 1006 */           soggetti.remove(j);
/* 1007 */           j = -1;
/* 1008 */           size -= size;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1013 */       int index = 0;
/* 1014 */       Integer min = new Integer(0);
/* 1015 */       for (int i = 0; i < size; i++) {
/* 1016 */         soggetto = soggetti.get(i);
/* 1017 */         if (i == 0) {
/* 1018 */           min = soggetto.getSoggettoId();
/* 1019 */           index = i;
/*      */         } 
/* 1021 */         if (soggetto.getSoggettoId().compareTo(min) < 0) {
/* 1022 */           min = soggetto.getSoggettoId();
/* 1023 */           index = i;
/*      */         } 
/*      */       } 
/* 1026 */       soggetto = soggetti.get(index);
/* 1027 */       MDCLogger(metodo, soggetto, null);
/* 1028 */       if (logger.isWarnEnabled()) {
/* 1029 */         logger.warn("Trovati piu soggetti. Il soggetto restituito corrisponde al primo censito della lista");
/*      */       }
/*      */       
/* 1032 */       risultato = "FOUND";
/*      */     } 
/*      */     
/* 1035 */     if (logger.isDebugEnabled()) {
/* 1036 */       logger.debug("End getSubject");
/*      */     }
/* 1038 */     resultM.putAppl("SOGGETTO", soggetto);
/* 1039 */     resultM.putAppl("RESULT", risultato);
/* 1040 */     return resultM;
/*      */   }
/*      */ 
/*      */   
/*      */   public MapContainer getSubjectByMC(FinSoggetto subject, FinIndirizzo indirizzo, String metodo) throws RasServiceException {
/* 1045 */     MapContainer resultM = new MapContainer();
/* 1046 */     String risultato = null;
/* 1047 */     if (logger.isDebugEnabled()) {
/* 1048 */       logger.debug("Start getSubjectByMC");
/*      */     }
/* 1050 */     FinSoggetto soggetto = null;
/* 1051 */     String result = null;
/* 1052 */     MapContainer paramMap = new MapContainer();
/* 1053 */     MapContainer resultMap = new MapContainer();
/* 1054 */     FinSoggettoEsteso soggettoEsteso = new FinSoggettoEsteso(subject);
/* 1055 */     NormSoggettoMC normSoggettoMC = soggettoEsteso.toSoggettoMC();
/* 1056 */     String codMatchCodeNom1 = normSoggettoMC.getCodMatchCodeNom1();
/* 1057 */     String codMatchCodeNom2 = normSoggettoMC.getCodMatchCodeNom2();
/* 1058 */     String codMatchCodeDNas = normSoggettoMC.getCodMatchCodeDNas();
/* 1059 */     String codStriRic1 = normSoggettoMC.getCodStriRic1();
/* 1060 */     String codStriRic2 = normSoggettoMC.getCodStriRic2();
/*      */     
/* 1062 */     String tipoSogg = normSoggettoMC.getTipoSogg();
/*      */     
/* 1064 */     String moduleName = null;
/* 1065 */     if (metodo.equals("getSubjectByCompleteMC")) {
/* 1066 */       String codMatchCodeCFis = normSoggettoMC.getCodMatchCodeCFis();
/* 1067 */       paramMap.putAppl("COD_MATC_CODE_CFIS", codMatchCodeCFis);
/* 1068 */       paramMap.putAppl("COD_STRI_RIC1", codStriRic1);
/* 1069 */       paramMap.putAppl("COD_STRI_RIC2", codStriRic2);
/* 1070 */       moduleName = "GetSoggettoMCByMatchCodeFullMD";
/*      */     }
/* 1072 */     else if (metodo.equals("getSubjectByMCNullCF")) {
/* 1073 */       String codMatchCodeCFis = "*";
/* 1074 */       moduleName = "GetSoggettoByMCNullCFMD";
/* 1075 */       paramMap.putAppl("COD_MATC_CODE_CFIS", codMatchCodeCFis);
/* 1076 */     } else if (metodo.equals("getSubjectByMCWithoutCF")) {
/* 1077 */       paramMap.putAppl("COD_STRI_RIC1", codStriRic1);
/* 1078 */       paramMap.putAppl("COD_STRI_RIC2", codStriRic2);
/* 1079 */       moduleName = "GetSoggettoByMCWithoutCFMD";
/*      */     } else {
/*      */       
/* 1082 */       if (logger.isErrorEnabled()) {
/* 1083 */         logger.error("Valore della stringa in input non previsto");
/*      */       }
/* 1085 */       resultM.putAppl("SOGGETTO", soggetto);
/* 1086 */       resultM.putAppl("RESULT", risultato);
/* 1087 */       return resultM;
/*      */     } 
/*      */     
/* 1090 */     paramMap.putAppl("COD_MATC_CODE_NOM1", codMatchCodeNom1);
/* 1091 */     paramMap.putAppl("COD_MATC_CODE_NOM2", codMatchCodeNom2);
/* 1092 */     paramMap.putAppl("COD_MATC_CODE_DNAS", codMatchCodeDNas);
/* 1093 */     paramMap.putAppl("COD_TIPO_SOGG", tipoSogg);
/* 1094 */     paramMap.putAppl("MODULE_NAME", moduleName);
/*      */ 
/*      */     
/*      */     try {
/* 1098 */       resultMap = this._transaction.transaction(paramMap);
/* 1099 */     } catch (RasTransactionException e) {
/* 1100 */       e.printStackTrace();
/* 1101 */       onLineException("errors.dedup.error", null);
/*      */     } 
/* 1103 */     resultMap = processResultMapMC(resultMap, subject, normSoggettoMC, indirizzo);
/*      */     
/* 1105 */     result = (String)resultMap.getAppl("RESULT");
/* 1106 */     if (result.equals("FOUND")) {
/* 1107 */       soggetto = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*      */       
/* 1109 */       MDCLogger(metodo, soggetto, null);
/* 1110 */       if (this.onLine) {
/* 1111 */         if (subject.getSoggettoId() != null) {
/* 1112 */           if (!subject.getSoggettoId().equals(soggetto.getSoggettoId()))
/*      */           {
/* 1114 */             onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */           }
/*      */         } else {
/*      */           
/* 1118 */           onLineException("errors.dedup.wrong.found", soggetto.toHtml());
/*      */         } 
/*      */       }
/*      */     } else {
/*      */       
/* 1123 */       if (logger.isDebugEnabled()) {
/* 1124 */         logger.debug("Soggetto  non trovato");
/*      */       }
/* 1126 */       soggetto = null;
/*      */     } 
/* 1128 */     risultato = result;
/*      */     
/* 1130 */     if (logger.isDebugEnabled()) {
/* 1131 */       logger.debug("End getSubjectByMC");
/*      */     }
/* 1133 */     resultM.putAppl("SOGGETTO", soggetto);
/* 1134 */     resultM.putAppl("RESULT", risultato);
/* 1135 */     return resultM;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer getSoggettoByCodiceFiscaleCognomeNomeDataNascita(FinSoggetto soggetto) throws RasServiceException {
/* 1141 */     if (logger.isDebugEnabled()) {
/* 1142 */       logger.debug("Start getSoggettoByCodiceFiscaleCognomeNomeDataNascita");
/*      */     }
/*      */     
/* 1145 */     String codiceFiscale = soggetto.getCodiceFiscale();
/* 1146 */     String cognome = soggetto.getCognome();
/* 1147 */     String nome = soggetto.getNome();
/* 1148 */     String tipoSogg = soggetto.getTipoSogg();
/* 1149 */     Date dataNascita = soggetto.getDataNascita();
/*      */     
/* 1151 */     MapContainer resultMap = new MapContainer();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1160 */     if (codiceFiscale == null || codiceFiscale.equals("") || cognome == null || cognome.equals("") || nome == null || nome.equals("") || tipoSogg == null || tipoSogg.equals("") || dataNascita == null) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1167 */       resultMap.putAppl("SOGGETTO", new ArrayList());
/*      */     } else {
/*      */       
/* 1170 */       MapContainer paramMap = new MapContainer();
/* 1171 */       paramMap.putAppl("CODICE_FISCALE", codiceFiscale);
/* 1172 */       paramMap.putAppl("COGNOME", cognome);
/* 1173 */       paramMap.putAppl("NOME", nome);
/* 1174 */       paramMap.putAppl("DATA_NASCITA", dataNascita);
/* 1175 */       paramMap.putAppl("TIPO_SOGGETTO", tipoSogg);
/* 1176 */       String moduleName = "GetSoggettoByCodiceFiscaleCognomeNomeDataNascita";
/* 1177 */       paramMap.putAppl("MODULE_NAME", moduleName);
/*      */ 
/*      */       
/*      */       try {
/* 1181 */         resultMap = this._transaction.transaction(paramMap);
/* 1182 */       } catch (RasTransactionException e) {
/* 1183 */         e.printStackTrace();
/* 1184 */         onLineException("errors.dedup.error", null);
/*      */       } 
/*      */     } 
/*      */     
/* 1188 */     if (logger.isDebugEnabled()) {
/* 1189 */       logger.debug("End getSoggettoByCodiceFiscaleCognomeNomeDataNascita");
/*      */     }
/*      */ 
/*      */     
/* 1193 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public MapContainer getSoggettoByPartitaIvaDenominazione(FinSoggetto soggetto) throws RasServiceException {
/* 1199 */     if (logger.isDebugEnabled()) {
/* 1200 */       logger.debug("Start getSoggettoByPartitaIvaDenominazione");
/*      */     }
/*      */     
/* 1203 */     String partitaIva = soggetto.getPartitaIva();
/* 1204 */     String denominazione = soggetto.getDenominazione();
/* 1205 */     String tipoSogg = soggetto.getTipoSogg();
/*      */     
/* 1207 */     MapContainer resultMap = new MapContainer();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1215 */     if (partitaIva == null || partitaIva.equals("") || denominazione == null || denominazione.equals("") || tipoSogg == null || tipoSogg.equals("")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1221 */       resultMap.putAppl("SOGGETTO", new ArrayList());
/*      */     } else {
/*      */       
/* 1224 */       MapContainer paramMap = new MapContainer();
/* 1225 */       paramMap.putAppl("PARTITA_IVA", partitaIva);
/* 1226 */       paramMap.putAppl("DENOMINAZIONE", denominazione);
/* 1227 */       paramMap.putAppl("TIPO_SOGGETTO", tipoSogg);
/* 1228 */       String moduleName = "GetSoggettoByPartitaIvaDenominazione";
/* 1229 */       paramMap.putAppl("MODULE_NAME", moduleName);
/*      */       
/*      */       try {
/* 1232 */         resultMap = this._transaction.transaction(paramMap);
/* 1233 */       } catch (RasTransactionException e) {
/* 1234 */         e.printStackTrace();
/* 1235 */         onLineException("errors.dedup.error", null);
/*      */       } 
/*      */     } 
/*      */     
/* 1239 */     if (logger.isDebugEnabled()) {
/* 1240 */       logger.debug("End getSoggettoByPartitaIvaDenominazione");
/*      */     }
/*      */     
/* 1243 */     return resultMap;
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 1248 */     ArrayList result = (ArrayList)resultMap.getAppl("SOGGETTO");
/* 1249 */     resultMap.removeAppl("SOGGETTO");
/*      */ 
/*      */     
/* 1252 */     int size = result.size();
/* 1253 */     for (int j = 0; j < size; j++) {
/*      */       
/* 1255 */       if (((FinSoggetto)result.get(j)).getStatoCensim() != null && ((FinSoggetto)result.get(j)).getStatoCensim().equals("B")) {
/*      */ 
/*      */         
/* 1258 */         result.remove(j);
/* 1259 */         size--;
/* 1260 */         j = -1;
/*      */       } 
/*      */     } 
/*      */     
/* 1264 */     if (result.size() == 0) {
/* 1265 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */     }
/* 1267 */     else if (result.size() == 1) {
/* 1268 */       resultMap.putAppl("RESULT", "FOUND");
/* 1269 */       resultMap.putAppl("SOGGETTO", result.get(0));
/* 1270 */     } else if (allowMultipleRow) {
/* 1271 */       resultMap.putAppl("RESULT", "FOUND");
/* 1272 */       resultMap.putAppl("SOGGETTO", result);
/*      */     } else {
/* 1274 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*      */       
/* 1276 */       resultMap.putAppl("SOGGETTO", result);
/*      */     } 
/* 1278 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private MapContainer processResultMapMC(MapContainer resultMap, FinSoggetto subject, NormSoggettoMC normSoggettoMC, FinIndirizzo indirizzo) {
/* 1285 */     ArrayList soggettiTrovati = (ArrayList)resultMap.getAppl("SOGGETTO");
/*      */ 
/*      */     
/* 1288 */     resultMap.removeAppl("SOGGETTO");
/*      */     
/* 1290 */     int size = soggettiTrovati.size();
/* 1291 */     for (int j = 0; j < size; j++) {
/*      */       
/* 1293 */       if (((FinSoggetto)soggettiTrovati.get(j)).getStatoCensim() != null && ((FinSoggetto)soggettiTrovati.get(j)).getStatoCensim().equals("B")) {
/*      */ 
/*      */         
/* 1296 */         soggettiTrovati.remove(j);
/* 1297 */         size--;
/* 1298 */         j = -1;
/*      */       } 
/*      */     } 
/*      */     
/* 1302 */     if (soggettiTrovati.size() == 0) {
/* 1303 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*      */     else {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1316 */       List soggetti = soggettiTrovati;
/* 1317 */       Iterator it = soggetti.iterator();
/* 1318 */       FinSoggetto sogg = null;
/* 1319 */       boolean bTrovato = false;
/*      */       
/* 1321 */       while (it.hasNext()) {
/* 1322 */         sogg = it.next();
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
/* 1341 */         bTrovato = compareSubjects(subject, normSoggettoMC, sogg, sogg.getSoggettoMC(), indirizzo);
/*      */ 
/*      */         
/* 1344 */         if (bTrovato) {
/*      */           break;
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1357 */       if (bTrovato) {
/* 1358 */         resultMap.putAppl("RESULT", "FOUND");
/*      */         
/* 1360 */         resultMap.putAppl("SOGGETTO", sogg);
/*      */       }
/*      */       else {
/*      */         
/* 1364 */         resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1369 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean compareSubjects(FinSoggetto soggettoIn, NormSoggettoMC normSoggettoMCIn, FinSoggetto soggettoDb, NormSoggettoMC normSoggettoMCDb, FinIndirizzo indirizzo) {
/* 1376 */     boolean bOut = false;
/*      */ 
/*      */     
/* 1379 */     if (logger.isDebugEnabled()) {
/* 1380 */       logger.debug("Start compareSubjects");
/*      */     }
/* 1382 */     if (soggettoIn.getTipoSogg().equals("F")) {
/* 1383 */       bOut = compareSubjectF(soggettoIn, normSoggettoMCIn, soggettoDb, normSoggettoMCDb, indirizzo);
/*      */     }
/* 1385 */     else if (soggettoIn.getTipoSogg().equals("G")) {
/*      */       
/* 1387 */       bOut = compareSubjectG(soggettoIn, normSoggettoMCIn, soggettoDb, normSoggettoMCDb, indirizzo);
/*      */     } 
/*      */ 
/*      */     
/* 1391 */     if (logger.isDebugEnabled()) {
/* 1392 */       logger.debug("End compareSubjects");
/*      */     }
/* 1394 */     return bOut;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean compareSubjectF(FinSoggetto soggettoIn, NormSoggettoMC normSoggettoMCIn, FinSoggetto soggettoDb, NormSoggettoMC normSoggettoMCDb, FinIndirizzo indirizzo) {
/* 1401 */     if (logger.isDebugEnabled()) {
/* 1402 */       logger.debug("Start compareSubjectsF");
/*      */     }
/* 1404 */     if (soggettoDb.getCodiceFiscale() == null) {
/* 1405 */       soggettoDb.setCodiceFiscale("");
/*      */     }
/* 1407 */     if (!soggettoIn.getCodiceFiscale().equals("") && !soggettoDb.getCodiceFiscale().equals("") && !soggettoIn.getCodiceFiscale().equals(soggettoDb.getCodiceFiscale())) {
/*      */ 
/*      */ 
/*      */       
/* 1411 */       if (logger.isDebugEnabled()) {
/* 1412 */         logger.debug("End compareSubjectsF");
/*      */       }
/* 1414 */       return false;
/*      */     } 
/*      */     
/* 1417 */     if (soggettoIn.getCodiceFiscale().equals(soggettoDb.getCodiceFiscale()) && !soggettoIn.getCodiceFiscale().equals("") && normSoggettoMCIn.getCodMatchCodeDNas().equals(normSoggettoMCDb.getCodMatchCodeDNas()) && soggettoIn.getSesso().equals(soggettoDb.getSesso())) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1424 */       if ((normSoggettoMCIn.getCodMatchCodeNom1().equals(normSoggettoMCDb.getCodMatchCodeNom1()) && normSoggettoMCIn.getCodMatchCodeNom2().equals(normSoggettoMCDb.getCodMatchCodeNom2())) || ((normSoggettoMCIn.getCodStriRic1().equals(normSoggettoMCDb.getCodStriRic1()) || normSoggettoMCIn.getCodStriRic2().equals(normSoggettoMCDb.getCodStriRic2())) && (normSoggettoMCIn.getCodMatchCodeNom1().equals(normSoggettoMCDb.getCodMatchCodeNom1()) || normSoggettoMCIn.getCodMatchCodeNom2().equals(normSoggettoMCDb.getCodMatchCodeNom2())))) {
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
/* 1436 */         if (logger.isDebugEnabled()) {
/* 1437 */           logger.debug("End compareSubjectsF");
/*      */         }
/* 1439 */         return true;
/*      */       } 
/* 1441 */       if (logger.isDebugEnabled()) {
/* 1442 */         logger.debug("End compareSubjectsF");
/*      */       }
/* 1444 */       return false;
/*      */     } 
/*      */ 
/*      */     
/* 1448 */     if (soggettoIn.getCodiceFiscale().equals("") || soggettoDb.getCodiceFiscale().equals(""))
/*      */     {
/* 1450 */       if (soggettoIn.getCognome().equals(soggettoDb.getCognome()) && (normSoggettoMCIn.getCodMatchCodeNom2().equals(normSoggettoMCDb.getCodMatchCodeNom2()) || normSoggettoMCIn.getCodStriRic1().equals(normSoggettoMCDb.getCodStriRic1()) || normSoggettoMCIn.getCodStriRic2().equals(normSoggettoMCDb.getCodStriRic2())) && soggettoIn.getDataNascita().equals(soggettoDb.getDataNascita()) && soggettoIn.getSesso().equals(soggettoDb.getSesso())) {
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
/* 1462 */         boolean bOut = compareAdress(indirizzo, soggettoDb, normSoggettoMCDb);
/*      */ 
/*      */         
/* 1465 */         if (logger.isDebugEnabled()) {
/* 1466 */           logger.debug("End compareSubjectsF");
/*      */         }
/* 1468 */         return bOut;
/*      */       } 
/*      */     }
/* 1471 */     if (logger.isDebugEnabled()) {
/* 1472 */       logger.debug("End compareSubjectsF");
/*      */     }
/* 1474 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean compareAdress(FinIndirizzo indirizzoIn, FinSoggetto soggettoDb, NormSoggettoMC normSoggettoMCDb) {
/* 1480 */     if (logger.isDebugEnabled()) {
/* 1481 */       logger.debug("Start compareAdress");
/*      */     }
/*      */     
/* 1484 */     boolean trovato = false;
/*      */     
/* 1486 */     if (indirizzoInvalido(indirizzoIn)) {
/* 1487 */       if (logger.isErrorEnabled()) {
/* 1488 */         logger.debug("End compareAdress");
/*      */       }
/* 1490 */       return false;
/*      */     } 
/*      */ 
/*      */     
/* 1494 */     FinIndirizzo indirizzoDb = null;
/* 1495 */     FinSoggettoIndir soggIndir = null;
/* 1496 */     Date today = new Date();
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
/* 1568 */     if (logger.isDebugEnabled()) {
/* 1569 */       if (trovato) {
/* 1570 */         logger.debug("Indirizzo da censire già presente nella lista degli indirizzi in relazione con il soggetto trovato");
/*      */       } else {
/*      */         
/* 1573 */         logger.debug("Indirizzo da censire non presente nella lista degli indirizzi in relazione con il soggetto trovato");
/*      */       } 
/*      */       
/* 1576 */       logger.debug("End compareAdress");
/*      */     } 
/*      */     
/* 1579 */     return trovato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean compareSubjectG(FinSoggetto soggettoIn, NormSoggettoMC normSoggettoMCIn, FinSoggetto soggettoDb, NormSoggettoMC normSoggettoMCDb, FinIndirizzo indirizzo) {
/* 1586 */     if (logger.isDebugEnabled()) {
/* 1587 */       logger.debug("Start compareSubjectG");
/*      */     }
/* 1589 */     if (soggettoDb.getPartitaIva() == null) {
/* 1590 */       soggettoDb.setPartitaIva("");
/*      */     }
/* 1592 */     if (!soggettoIn.getPartitaIva().equals("") && !soggettoDb.getPartitaIva().equals("") && !soggettoIn.getPartitaIva().equals(soggettoDb.getPartitaIva())) {
/*      */ 
/*      */ 
/*      */       
/* 1596 */       if (logger.isDebugEnabled()) {
/* 1597 */         logger.debug("Soggetti non equivalenti");
/* 1598 */         logger.debug("End compareSubjectG");
/*      */       } 
/* 1600 */       return false;
/*      */     } 
/*      */     
/* 1603 */     if (soggettoIn.getPartitaIva().equals(soggettoDb.getPartitaIva()) && !soggettoIn.getPartitaIva().equals("")) {
/*      */ 
/*      */       
/* 1606 */       if (soggettoIn.getDenominazione().equals(soggettoDb.getDenominazione()) || normSoggettoMCIn.getCodStriRic1().equals(normSoggettoMCDb.getCodStriRic1()) || normSoggettoMCIn.getCodStriRic2().equals(normSoggettoMCDb.getCodStriRic2())) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1612 */         if (logger.isDebugEnabled()) {
/* 1613 */           logger.debug("Soggetti equivalenti");
/* 1614 */           logger.debug("End compareSubjectG");
/*      */         } 
/* 1616 */         return true;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1624 */       if (!partitaIvaSpeciale() && normSoggettoMCIn.getCodMatchCodeNom1().equals(normSoggettoMCDb.getCodMatchCodeNom1()) && normSoggettoMCIn.getCodMatchCodeNom2().equals(normSoggettoMCDb.getCodMatchCodeNom2())) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1629 */         if (logger.isDebugEnabled()) {
/* 1630 */           logger.debug("End compareSubjectG");
/*      */         }
/* 1632 */         return compareAdress(indirizzo, soggettoDb, normSoggettoMCDb);
/*      */       } 
/*      */ 
/*      */       
/* 1636 */       if (logger.isDebugEnabled()) {
/* 1637 */         logger.debug("End compareSubjectG");
/*      */       }
/* 1639 */       return false;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1644 */     if (soggettoIn.getPartitaIva().equals("") || soggettoDb.getPartitaIva().equals(""))
/*      */     {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1650 */       if (soggettoIn.getDenominazione().equals(soggettoDb.getDenominazione()) || normSoggettoMCIn.getCodStriRic1().equals(normSoggettoMCDb.getCodStriRic1()) || normSoggettoMCIn.getCodStriRic2().equals(normSoggettoMCDb.getCodStriRic2())) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1656 */         if (logger.isDebugEnabled()) {
/* 1657 */           logger.debug("End compareSubjectG");
/*      */         }
/* 1659 */         return compareAdress(indirizzo, soggettoDb, normSoggettoMCDb);
/*      */       } 
/*      */     }
/*      */ 
/*      */     
/* 1664 */     if (logger.isDebugEnabled()) {
/* 1665 */       logger.debug("End compareSubjectG");
/*      */     }
/* 1667 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean partitaIvaSpeciale() {
/* 1672 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void init(String fragment) throws RasException {}
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public RasServiceException getRasServiceException() {
/* 1685 */     return this.rasServiceException;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRasServiceException(RasServiceException rasServiceException) {
/* 1693 */     this.rasServiceException = rasServiceException;
/*      */   }
/*      */ 
/*      */   
/*      */   public void onLineException(String message1, String message2) throws RasServiceException {
/* 1698 */     RasValidationSignal dettaglioErrore = null;
/*      */     
/* 1700 */     if (message2 == null) {
/* 1701 */       dettaglioErrore = new RasValidationSignal(message1);
/*      */     } else {
/* 1703 */       dettaglioErrore = new RasValidationSignal(message1, message2);
/*      */     } 
/* 1705 */     this.rasServiceException.addError(dettaglioErrore);
/* 1706 */     throw this.rasServiceException;
/*      */   }
/*      */   
/*      */   public void MDCLogger(String metodo, FinSoggetto soggetto, String fabbrica) {
/* 1710 */     MDC.put("METODO", metodo);
/* 1711 */     MDC.put("ERRORE", "");
/*      */     
/* 1713 */     if (soggetto.getSoggettoId() == null) {
/* 1714 */       MDC.put("SOGGETTO_ID", new Integer(-1));
/*      */     } else {
/* 1716 */       MDC.put("SOGGETTO_ID", soggetto.getSoggettoId());
/*      */     } 
/*      */     
/* 1719 */     if (soggetto.getNdgArco() == null) {
/* 1720 */       MDC.put("NDG_ARCO_N", new Integer(-1));
/*      */     } else {
/* 1722 */       MDC.put("NDG_ARCO_N", soggetto.getNdgArco());
/*      */     } 
/*      */     
/* 1725 */     if (fabbrica == null) {
/* 1726 */       MDC.put("FABBRICA_T", "");
/*      */     } else {
/* 1728 */       MDC.put("FABBRICA_T", fabbrica);
/*      */     } 
/*      */     
/* 1731 */     if (soggetto.getCodiceFiscale() == null) {
/* 1732 */       MDC.put("CODICE_FISCALE_S", "");
/*      */     } else {
/* 1734 */       MDC.put("CODICE_FISCALE_S", soggetto.getCodiceFiscale());
/*      */     } 
/*      */     
/* 1737 */     if (soggetto.getPartitaIva() == null) {
/* 1738 */       MDC.put("PARTITA_IVA_S", "");
/*      */     } else {
/* 1740 */       MDC.put("PARTITA_IVA_S", soggetto.getPartitaIva());
/*      */     } 
/*      */     
/* 1743 */     if (soggetto.getDenominazione() == null) {
/* 1744 */       MDC.put("DENOMINAZIONE_S", "");
/*      */     } else {
/* 1746 */       MDC.put("DENOMINAZIONE_S", soggetto.getDenominazione().replaceAll("'", "''"));
/*      */     } 
/*      */ 
/*      */     
/* 1750 */     if (soggetto.getNome() == null) {
/* 1751 */       MDC.put("NOME_S", "");
/*      */     } else {
/* 1753 */       MDC.put("NOME_S", soggetto.getNome().replaceAll("'", "''"));
/*      */     } 
/*      */     
/* 1756 */     if (soggetto.getCognome() == null) {
/* 1757 */       MDC.put("COGNOME_S", "");
/*      */     } else {
/* 1759 */       MDC.put("COGNOME_S", soggetto.getCognome().replaceAll("'", "''"));
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\deduplicator\RasDeduplicator.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */