/*      */ package it.ras.arco.service;
/*      */ 
/*      */ import it.ras.arco.bean.FinAltriProdotti;
/*      */ import it.ras.arco.bean.FinAnagraficaBanca;
/*      */ import it.ras.arco.bean.FinAssegno;
/*      */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinContrattoBase;
/*      */ import it.ras.arco.bean.FinContrattoCC;
/*      */ import it.ras.arco.bean.FinContrattoDt;
/*      */ import it.ras.arco.bean.FinContrattoPromotore;
/*      */ import it.ras.arco.bean.FinEmittente;
/*      */ import it.ras.arco.bean.FinGPStorico;
/*      */ import it.ras.arco.bean.FinInterfaccia;
/*      */ import it.ras.arco.bean.FinPolizza;
/*      */ import it.ras.arco.bean.FinPosizione;
/*      */ import it.ras.arco.bean.FinPremioPolizza;
/*      */ import it.ras.arco.bean.FinProdotto;
/*      */ import it.ras.arco.bean.FinProiezionePolizza;
/*      */ import it.ras.arco.bean.FinPromotore;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.exception.RasValidationSignal;
/*      */ import it.ras.flag.service.AbstractRasService;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.text.ParseException;
/*      */ import java.util.ArrayList;
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
/*      */ public class ContrattoManagerSRV
/*      */   extends AbstractRasService
/*      */ {
/*      */   private String action;
/*      */   private boolean onLine;
/*      */   private String creaPosizione;
/*      */   private String creaAssegnazione;
/*   56 */   private Log log = LogFactory.getLog(ContrattoManagerSRV.class);
/*      */   
/*      */   public static final String NULL_ACTION = "Azione nulla";
/*   59 */   private final Double emptyDouble = new Double(0.0D);
/*   60 */   private final Date dataOdierna = new Date();
/*      */   
/*      */   public static final String SOGGETTO = "SOGGETTO";
/*      */   
/*      */   public static final String COINTESTAZIONE = "COINTESTAZIONE";
/*      */   
/*      */   public static final String UPDATE_CONTRATTO_DT = "UPDATE_CONTRATTO_DT";
/*      */   
/*      */   public static final String UPDATE_CONTRATTO_CC = "UPDATE_CONTRATTO_CC";
/*      */   
/*      */   public static final String UPDATE_PREMIO_POLIZZA = "UpdatePremioPolizza";
/*      */   
/*      */   public static final String CONTRATTO = "CONTRATTO";
/*      */   
/*      */   public static final String DT = "DT";
/*      */   
/*      */   public static final String INSERT_CONTRATTO_DT = "INSERT_CONTRATTO_DT";
/*      */   
/*      */   public static final String INSERT_CONTRATTO_CC = "INSERT_CONTRATTO_CC";
/*      */   
/*      */   public static final String INSERT_GP_STORICO = "INSERT_GP_STORICO";
/*      */   
/*      */   public static final String TIPO = "TIPO";
/*      */   
/*      */   public static final String FIN_GP = "FIN_GP";
/*      */   
/*      */   public static final String POSIZIONE = "POSIZIONE";
/*      */   
/*      */   public static final String FONDO_SICAV = "FONDO_SICAV";
/*      */   
/*      */   public static final String ATT_FIN = "ATT_FIN";
/*      */   
/*      */   public static final String DETTAGLIO = "DETTAGLIO";
/*      */   
/*      */   public static final String PRODOTTO = "PRODOTTO";
/*      */   
/*      */   public static final String InserimentoDettaglio = "InserimentoDettaglio";
/*      */   
/*      */   public static final String UpdateDettaglio = "UpdateDettaglio";
/*      */   
/*      */   public static final String InserimentoPosizione = "InserimentoPosizione";
/*      */   
/*      */   public static final String InserimentoGpStorico = "InserimentoGpStorico";
/*      */   
/*      */   public static final String PROIEZIONE = "PROIEZIONE";
/*      */   
/*      */   public static final String UPDATE_INTEST_CONTRATTO = "UpdateIntestContratto";
/*      */   
/*      */   public static final String UPDATE_FONDO_SICAV = "UpdateFondoSicav";
/*      */   
/*      */   public static final String UPDATE_FINGP = "UpdateFinGp";
/*      */   
/*      */   public static final String UPDATE_GP_STORICO = "UPDATE_GP_STORICO";
/*      */   
/*      */   public static final String ALTRI_PRODOTTI = "ALTRI_PRODOTTI";
/*      */   
/*      */   public static final String INTERFACCIA = "INTERFACCIA";
/*      */   
/*      */   public static final String CODEMITTENTE = "CODEMITTENTE";
/*      */   
/*      */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*      */   
/*      */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*      */   
/*      */   public static final String POLIZZA = "POLIZZA";
/*      */   
/*      */   public static final String NUM_PROPOSTA = "NUM_PROPOSTA";
/*      */   
/*      */   public static final String POLIZZA_ID = "POLIZZA_ID";
/*      */   
/*      */   public static final String GP_STORICO = "GP_STORICO";
/*      */   
/*      */   public static final String PREMIO_POLIZZA = "PREMIO_POLIZZA";
/*      */   
/*      */   public static final String NOME_BATCH = "NOME_BATCH";
/*      */   
/*      */   public static final String PROMOTORE = "PROMOTORE";
/*      */   
/*      */   public static final String ASSEGNAZIONE = "ASSEGNAZIONE";
/*      */   
/*      */   public static final String NUMERO_CARNET = "NUMERO_CARNET";
/*      */   
/*      */   public static final String ASSEGNO = "ASSEGNO";
/*      */   
/*      */   public static final String GET_ASSEGNO_BY_NUM_CARNET = "GetContrattoByNumCarnet";
/*      */   
/*      */   public static final String INSERT_ASSEGNO = "InsertAssegno";
/*      */   
/*      */   public static final String UPDATE_ASSEGNO = "UpdateAssegno";
/*      */   
/*      */   public static final String GET_CONTRATTO_BY_SOGGPRIMOINT_PRODOTTO_ID = "GetContrattoBySoggPrimoIntProdottoId";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO = "GetContrattoByNumContratto";
/*      */   
/*      */   public static final String GET_BY_NUM_RAPPORTO = "GetContrattoByNumRapporto";
/*      */   
/*      */   public static final String GET_BY_DOSSIER = "GetContrattoByDossier";
/*      */   
/*      */   public static final String GET_BY_NUM_PRATICA = "GetContrattoByNumPratica";
/*      */   
/*      */   public static final String GET_DT_BY_NUM_DT = "GetDtByNumDt";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_PRODOTTOID = "GetContrattoByNumContrattoProdottoId";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_COD_EMITTENTE = "GetContrattoByNumContrattoCodEmittente";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_COD_EMITTENTE_INTERFACCIA = "GetContrattoByNumContrattoCodEmittenteCodInterfaccia";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_COD_EMITTENTE_PRODOTTO_ID = "GetContrattoByNumContrattoCodEmittenteProdId";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_COD_INTERFACCIA = "GetContrattoByNumContrattoCodInterfaccia";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_COD_INTERFACCIA_TIPO = "GetContrattoByNumContrattoCodInterfacciaTipo";
/*      */   
/*      */   public static final String GET_ALTRO_PRODOTTO_BY_NUM_CONTRATTO_PRODOTTOID = "GetAltroProdottoByNumContrattoProdottoId";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_EMITTENTEID = "GetContrattoByNumContrattoEmittId";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_ATT_FIN = "GetContrattoByNumContrattoAttFin";
/*      */   
/*      */   public static final String GET_CONTR_ID = "GetContrattoByContrattoId";
/*      */   
/*      */   public static final String GET_CONTR_ID_BY_SOTT_ID = "GetContrattoBySottoscrizioneIdSRV";
/*      */   
/*      */   public static final String GET_FONDI_SICAV_BY_CONTRATTO_ID = "GetFondiSicavByContrattoId";
/*      */   
/*      */   public static final String GET_ARCHIVIO_BY_CONTRATTO_ID = "GetArchivioByContrattoId";
/*      */   
/*      */   public static final String GET_MOVIMENTO_BY_CONTRATTO_ID = "GetMovimentoByContrattoId";
/*      */   
/*      */   public static final String INSERT_PROIEZIONE_POLIZZA = "InsertProiezionePolizza";
/*      */   
/*      */   public static final String UPDATE_PROIEZIONE_POLIZZA = "UpdateProiezionePolizza";
/*      */   
/*      */   public static final String GET_BY_NUM_CONTRATTO_TIPO = "GetContrattoByNumContrattoTipo";
/*      */   
/*      */   public static final String GET_PROIEZIONE_POLIZZA_BY_POLIZA_ID = "GetProiezionePolizzaByPolizzaId";
/*      */   
/*      */   public static final String GET_GP_STORICO_BY_CONTRATTO_ID = "GetGpStoricoByContrattoIdDataVal";
/*      */   
/*      */   public static final String GET_CONTRATTO_BY_NCONT_PRODID_DOSSTEC = "GetContrByNumContrProdIdDoss";
/*      */   
/*      */   public static final String GET_CONTRATTO_BY_SOGGPRIMOINT_PRODOTTO_ID_NUM_CONTR = "GetContrattoBySoggPrimoIntProdottoIdNumContr";
/*      */   
/*      */   public static final String GET_CONTRATTO_BY_COINT_ID_PRODOTTO_ID_NUM_CONTR = "GetContrattoByCointIdProdottoIdNumContr";
/*      */   
/*      */   public static final String GET_CONTRATTO_GENERICO = "GetContrattoGenerico";
/*      */   
/*      */   public static final String RISULTATO_RICERCA = "RISULTATO_RICERCA";
/*      */   
/*      */   public static final String GET_POLIZZA_BY_NUM_PROPOSTA = "GetPolizzaByNumProposta";
/*      */   
/*      */   public static final String INSERT_POLIZZA = "InsertPolizza";
/*      */   
/*      */   public static final String INSERT_PREMIO_POLIZZA = "InsertPremioPolizza";
/*      */   
/*      */   public static final String INSERT_ASSEGNAZIONE = "INSERT_ASSEGNAZIONE";
/*      */   
/*      */   public static final String INSERT_CONTRATTO_ASSEGNAZIONE = "INSERT_CONTRATTO_ASSEGNAZIONE";
/*      */   
/*      */   public static final String UPDATE_ASSEGNAZIONE = "UPDATE_ASSEGNAZIONE";
/*      */   
/*      */   public static final String GET_ASSEGNAZIONE_ATTIVA_BY_CONTRATTO_PROMOTORE = "GET_ASSEGNAZIONE_ATTIVA_BY_CONTRATTO_PROMOTORE";
/*      */   
/*      */   public static final String BANCA = "BANCA";
/*      */   
/*      */   public static final String GET_BANCA_BY_ABI_CAB = "GET_BANCA_BY_ABI_CAB";
/*      */   
/*      */   public static final String ABI = "ABI";
/*      */   
/*      */   public static final String CAB = "CAB";
/*      */   
/*      */   public void setIsValidating(boolean isValidating) {}
/*      */   
/*      */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  235 */     MapContainer resultMap = new MapContainer();
/*  236 */     MapContainer paramMap = new MapContainer();
/*  237 */     String moduleName = null;
/*  238 */     FinEmittente emittente = null;
/*  239 */     FinInterfaccia interfaccia = null;
/*  240 */     FinProdotto prodotto = null;
/*  241 */     FinContratto contratto = null;
/*  242 */     FinPolizza polizza = null;
/*  243 */     FinProiezionePolizza proiezionePolizza = null;
/*  244 */     FinPremioPolizza premioPolizza = null;
/*  245 */     FinContrattoDt contrattoDt = null;
/*  246 */     FinContrattoCC contrattoCC = null;
/*  247 */     FinPromotore promotore = null;
/*  248 */     FinContrattoPromotore assegnazione = null;
/*  249 */     FinAssegno assegno = null;
/*  250 */     FinAnagraficaBanca banca = null;
/*  251 */     FinGPStorico gpStorico = null;
/*  252 */     FinAltriProdotti altroProdotto = null;
/*      */ 
/*      */     
/*  255 */     Object oDettaglio = map.getAppl("DETTAGLIO");
/*  256 */     Object oEmittente = map.getAppl("CODEMITTENTE");
/*  257 */     Object oInterfaccia = map.getAppl("INTERFACCIA");
/*  258 */     Object oProdotto = map.getAppl("PRODOTTO");
/*  259 */     Object oPromotore = map.getAppl("PROMOTORE");
/*  260 */     Object oAssegnazione = map.getAppl("ASSEGNAZIONE");
/*  261 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  262 */     Object oBanca = map.getAppl("BANCA");
/*  263 */     Object oAltroProdotto = map.getAppl("ALTRI_PRODOTTI");
/*  264 */     Object oPremioPolizza = map.getAppl("PREMIO_POLIZZA");
/*      */ 
/*      */     
/*  267 */     Boolean allowMultipleRows = null;
/*      */     
/*  269 */     if (oAllowMultipleRows == null) {
/*  270 */       oAllowMultipleRows = new Boolean(false);
/*  271 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  272 */       String errorMessage = "Parametro ALLOW_MULTIPLE_ROWS passato al servizio " + getClass() + " di tipo errato.";
/*  273 */       if (this.log.isErrorEnabled()) {
/*  274 */         this.log.error(errorMessage);
/*      */       }
/*  276 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/*  279 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*      */     
/*  281 */     if (this.action.equals("InsertContratto")) {
/*      */       
/*  283 */       oDettaglio = controlloDettaglio(oDettaglio, this.action);
/*      */       
/*  285 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*      */       
/*  287 */       if (contratto.getCointestazione() == null) {
/*      */         
/*  289 */         String errore = "Cointestazione non presente";
/*  290 */         if (this.log.isErrorEnabled()) {
/*  291 */           this.log.error(errore);
/*      */         }
/*      */         
/*  294 */         throw new RasServiceException(errore);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  300 */       FinPosizione posizione = null;
/*      */       
/*  302 */       Object attFin = map.getAppl("ATT_FIN");
/*      */ 
/*      */ 
/*      */       
/*  306 */       paramMap.putAppl("DETTAGLIO", oDettaglio);
/*  307 */       getModuleManager().execModule("InserimentoDettaglio", paramMap);
/*      */       
/*  309 */       if (this.creaPosizione.equals("1")) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  315 */         ArrayList elencoAttFin = new ArrayList();
/*      */         
/*  317 */         if (attFin instanceof FinAttivitaFinanziaria) {
/*  318 */           elencoAttFin.add(attFin);
/*      */         }
/*      */         else {
/*      */           
/*  322 */           elencoAttFin = (ArrayList)attFin;
/*      */         } 
/*  324 */         String nomeBatch = (String)map.getAppl("NOME_BATCH");
/*  325 */         Iterator it = elencoAttFin.iterator();
/*      */         
/*  327 */         if (contratto.getPosizione() == null || contratto.getPosizione().isEmpty()) {
/*      */           
/*  329 */           contratto.setPosizione(new HashSet());
/*      */           
/*  331 */           while (it.hasNext())
/*      */           {
/*      */             
/*  334 */             FinAttivitaFinanziaria attivitaFin = it.next();
/*  335 */             posizione = new FinPosizione();
/*      */             
/*      */             try {
/*  338 */               setPosizione(contratto, posizione, nomeBatch);
/*      */             }
/*  340 */             catch (Exception e) {
/*  341 */               this.log.error(e.getMessage());
/*  342 */               RasServiceException error = new RasServiceException(e.getMessage());
/*  343 */               error.setStackTrace(e.getStackTrace());
/*  344 */               throw error;
/*      */             } 
/*      */             
/*  347 */             posizione.setAttivitaFin(attivitaFin);
/*      */ 
/*      */             
/*  350 */             contratto.getPosizione().add(posizione);
/*      */ 
/*      */             
/*  353 */             paramMap.putAppl("POSIZIONE", posizione);
/*  354 */             getModuleManager().execModule("InserimentoPosizione", paramMap);
/*      */ 
/*      */ 
/*      */             
/*  358 */             resultMap.putAppl("POSIZIONE", posizione);
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/*      */         else {
/*      */           
/*  366 */           posizione = contratto.getPosizione().iterator().next();
/*      */ 
/*      */ 
/*      */           
/*  370 */           paramMap.putAppl("POSIZIONE", posizione);
/*  371 */           getModuleManager().execModule("InserimentoPosizione", paramMap);
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
/*      */ 
/*      */       
/*  385 */       if (oAssegnazione != null) {
/*      */         
/*  387 */         assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class);
/*  388 */         promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class);
/*      */         
/*  390 */         assegnazione.setPromotore(promotore);
/*  391 */         assegnazione.setContratto((FinContrattoBase)contratto);
/*      */         
/*  393 */         insertAssegnazione(assegnazione);
/*      */         
/*  395 */         resultMap.putAppl("RESULT", "INSERTED");
/*  396 */         return resultMap;
/*      */       } 
/*      */       
/*  399 */       resultMap.putAppl("RESULT", "INSERTED");
/*      */ 
/*      */     
/*      */     }
/*  403 */     else if (this.action.equals("UPDATE_CONTRATTO_DT") || this.action.equals("UPDATE_CONTRATTO_CC") || this.action.equals("UpdateFondoSicav") || this.action.equals("UpdateIntestContratto") || this.action.equals("UpdateFinGp")) {
/*      */ 
/*      */       
/*  406 */       oDettaglio = controlloDettaglio(oDettaglio, this.action);
/*  407 */       paramMap.putAppl("DETTAGLIO", oDettaglio);
/*  408 */       getModuleManager().execModule("UpdateDettaglio", paramMap);
/*  409 */       resultMap.putAppl("RESULT", "UPDATED");
/*      */     }
/*  411 */     else if (this.action.equals("UpdatePremioPolizza")) {
/*  412 */       premioPolizza = (FinPremioPolizza)getBean(oPremioPolizza, FinPremioPolizza.class);
/*  413 */       paramMap.putAppl("PREMIO_POLIZZA", premioPolizza);
/*  414 */       getModuleManager().execModule(this.action, paramMap);
/*  415 */       resultMap.putAppl("RESULT", "UPDATED");
/*      */     }
/*  417 */     else if (this.action.equals("GetDtByNumDt")) {
/*      */       
/*  419 */       contrattoDt = (FinContrattoDt)getBean(oDettaglio, FinContratto.class);
/*  420 */       String numDt = contrattoDt.getDossierD();
/*  421 */       paramMap.putAppl("DT", numDt);
/*  422 */       moduleName = this.action;
/*  423 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  424 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "DT");
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  429 */     else if (this.action.equals("GetContrByNumContrProdIdDoss")) {
/*      */       
/*  431 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  432 */       String numContratto = contratto.getNumContratto();
/*  433 */       String dossierTecnico = contratto.getDossierTecnico();
/*  434 */       Integer prodottoId = contratto.getProdotto().getProdottoID();
/*  435 */       paramMap.putAppl("DOSSIER", dossierTecnico);
/*  436 */       paramMap.putAppl("PRODOTTOID", prodottoId);
/*  437 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  438 */       moduleName = this.action;
/*  439 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  440 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */     
/*      */     }
/*  444 */     else if (this.action.equals("GetContrattoByNumContratto")) {
/*      */       
/*  446 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  447 */       String numContratto = contratto.getNumContratto();
/*  448 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  449 */       moduleName = this.action;
/*  450 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  451 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */     
/*      */     }
/*  455 */     else if (this.action.equals("GetGpStoricoByContrattoIdDataVal")) {
/*      */       
/*  457 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*      */       
/*  459 */       Object oGpStorico = map.getAppl("GP_STORICO");
/*  460 */       gpStorico = (FinGPStorico)getBean(oGpStorico, FinGPStorico.class);
/*  461 */       Integer contrattoId = contratto.getContrattoId();
/*  462 */       Date dataVal = gpStorico.getDataVal();
/*  463 */       paramMap.putAppl("CONTRATTO", contrattoId);
/*  464 */       paramMap.putAppl("DATA", dataVal);
/*  465 */       moduleName = this.action;
/*  466 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  467 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "GP_STORICO");
/*      */ 
/*      */     
/*      */     }
/*  471 */     else if (this.action.equals("GetContrattoByNumRapporto")) {
/*      */       
/*  473 */       contrattoCC = (FinContrattoCC)getBean(oDettaglio, FinContrattoCC.class);
/*  474 */       String numRapporto = contrattoCC.getNumeroRapporto();
/*  475 */       paramMap.putAppl("CONTRATTO", numRapporto);
/*  476 */       moduleName = this.action;
/*  477 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  478 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */     
/*      */     }
/*  482 */     else if (this.action.equals("GetContrattoByDossier")) {
/*      */       
/*  484 */       contrattoDt = (FinContrattoDt)getBean(oDettaglio, FinContrattoDt.class);
/*  485 */       String numCPRG = contrattoDt.getDossierD();
/*  486 */       paramMap.putAppl("CONTRATTO", numCPRG);
/*  487 */       moduleName = this.action;
/*  488 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  489 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */     
/*      */     }
/*  493 */     else if (this.action.equals("GetContrattoByNumPratica")) {
/*      */       
/*  495 */       contrattoDt = (FinContrattoDt)getBean(oDettaglio, FinContrattoDt.class);
/*  496 */       String numPratica = contrattoDt.getNumeroPratica();
/*  497 */       paramMap.putAppl("CONTRATTO", numPratica);
/*  498 */       moduleName = this.action;
/*  499 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  500 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     
/*      */     }
/*  503 */     else if (this.action.equals("GetContrattoByNumContrattoTipo")) {
/*      */       
/*  505 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  506 */       String numContratto = contratto.getNumContratto();
/*  507 */       String tipo = contratto.getTipoProdotto();
/*  508 */       paramMap.putAppl("TIPO", tipo);
/*  509 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  510 */       moduleName = this.action;
/*  511 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  512 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */     
/*      */     }
/*  516 */     else if (this.action.equals("GetContrattoBySoggPrimoIntProdottoId")) {
/*      */       
/*  518 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  519 */       Integer prodottoId = contratto.getProdotto().getProdottoID();
/*  520 */       Integer soggettoPrimoIntId = contratto.getSoggetto().getSoggettoId();
/*  521 */       paramMap.putAppl("SOGGETTO_PRIMO_INT", soggettoPrimoIntId);
/*  522 */       paramMap.putAppl("PRODOTTOID", prodottoId);
/*  523 */       moduleName = this.action;
/*  524 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  525 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  530 */     else if (this.action.equals("GetContrattoBySoggPrimoIntProdottoIdNumContr")) {
/*      */       
/*  532 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  533 */       Integer prodottoId = contratto.getProdotto().getProdottoID();
/*  534 */       Integer soggettoPrimoIntId = contratto.getSoggetto().getSoggettoId();
/*  535 */       String numContr = contratto.getNumContratto();
/*  536 */       paramMap.putAppl("SOGGETTO_PRIMO_INT", soggettoPrimoIntId);
/*  537 */       paramMap.putAppl("PRODOTTOID", prodottoId);
/*  538 */       paramMap.putAppl("CONTRATTO", numContr);
/*  539 */       moduleName = this.action;
/*  540 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  541 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  547 */     else if (this.action.equals("GetContrattoByCointIdProdottoIdNumContr")) {
/*      */       
/*  549 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  550 */       Integer prodottoId = contratto.getProdotto().getProdottoID();
/*  551 */       Integer cointId = contratto.getCointestazione().getCointestazioneId();
/*  552 */       String numContr = contratto.getNumContratto();
/*  553 */       paramMap.putAppl("COINTESTAZIONE", cointId);
/*  554 */       paramMap.putAppl("PRODOTTOID", prodottoId);
/*  555 */       paramMap.putAppl("CONTRATTO", numContr);
/*  556 */       moduleName = this.action;
/*  557 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  558 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */ 
/*      */     
/*      */     }
/*  563 */     else if (this.action.equals("GetContrattoByContrattoId")) {
/*  564 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  565 */       Integer contrattoId = contratto.getContrattoId();
/*  566 */       paramMap.putAppl("CONTRATTO", contrattoId);
/*  567 */       moduleName = this.action;
/*  568 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  569 */       resultMap = processResultMap(resultMap, false, "CONTRATTO");
/*      */     
/*      */     }
/*  572 */     else if (this.action.equals("GetContrattoByNumContrattoProdottoId")) {
/*  573 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  574 */       String numContratto = contratto.getNumContratto();
/*  575 */       Integer prodottoId = contratto.getProdotto().getProdottoID();
/*  576 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  577 */       paramMap.putAppl("PRODOTTOID", prodottoId);
/*  578 */       moduleName = this.action;
/*  579 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  580 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */     
/*      */     }
/*  584 */     else if (this.action.equals("GetAltroProdottoByNumContrattoProdottoId")) {
/*  585 */       altroProdotto = (FinAltriProdotti)getBean(oAltroProdotto, FinAltriProdotti.class);
/*  586 */       String numContratto = altroProdotto.getAltriProdottiIDXP();
/*  587 */       Integer prodottoId = altroProdotto.getProdottoId();
/*      */       
/*  589 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  590 */       paramMap.putAppl("PRODOTTOID", prodottoId);
/*  591 */       moduleName = this.action;
/*      */       
/*  593 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  594 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */ 
/*      */     
/*      */     }
/*  598 */     else if (this.action.equals("GetFondiSicavByContrattoId")) {
/*      */       
/*  600 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  601 */       Integer contrattoId = contratto.getContrattoId();
/*      */       
/*  603 */       paramMap.putAppl("CONTRATTO", contrattoId);
/*      */       
/*  605 */       moduleName = this.action;
/*  606 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  607 */       resultMap = processResultMap(resultMap, false, "CONTRATTO");
/*      */     }
/*  609 */     else if (this.action.equals("GetMovimentoByContrattoId")) {
/*  610 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  611 */       Integer contrattoId = contratto.getContrattoId();
/*      */       
/*  613 */       paramMap.putAppl("CONTRATTO", contrattoId);
/*      */       
/*  615 */       moduleName = this.action;
/*  616 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  617 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     }
/*  619 */     else if (this.action.equals("GetArchivioByContrattoId")) {
/*  620 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  621 */       Integer contrattoId = contratto.getContrattoId();
/*      */       
/*  623 */       paramMap.putAppl("CONTRATTO", contrattoId);
/*      */       
/*  625 */       moduleName = this.action;
/*  626 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  627 */       resultMap = processResultMap(resultMap, false, "CONTRATTO");
/*      */     }
/*  629 */     else if (this.action.equals("GetContrattoByNumContrattoCodEmittente")) {
/*  630 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  631 */       emittente = (FinEmittente)getBean(oEmittente, FinEmittente.class);
/*  632 */       String numContratto = contratto.getNumContratto();
/*  633 */       String codEmittente = emittente.getCodEmittExt();
/*  634 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  635 */       paramMap.putAppl("CODEMITTENTE", codEmittente);
/*  636 */       moduleName = this.action;
/*  637 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  638 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     
/*      */     }
/*  641 */     else if (this.action.equals("GetContrattoByNumContrattoEmittId")) {
/*  642 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  643 */       emittente = (FinEmittente)getBean(oEmittente, FinEmittente.class);
/*  644 */       String numContratto = contratto.getNumContratto();
/*  645 */       Integer emittenteId = emittente.getEmittenteId();
/*  646 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  647 */       paramMap.putAppl("EMITTENTE", emittenteId);
/*  648 */       moduleName = this.action;
/*  649 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  650 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     }
/*  652 */     else if (this.action.equals("GetContrattoByNumContrattoCodEmittenteCodInterfaccia")) {
/*  653 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  654 */       emittente = (FinEmittente)getBean(oEmittente, FinEmittente.class);
/*  655 */       interfaccia = (FinInterfaccia)getBean(oInterfaccia, FinInterfaccia.class);
/*  656 */       String numContratto = contratto.getNumContratto();
/*  657 */       String codEmittente = emittente.getCodEmittExt();
/*  658 */       String codInterfaccia = interfaccia.getInterfaccia();
/*  659 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  660 */       paramMap.putAppl("CODEMITTENTE", codEmittente);
/*  661 */       paramMap.putAppl("INTERFACCIA", codInterfaccia);
/*  662 */       moduleName = this.action;
/*  663 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  664 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     }
/*  666 */     else if (this.action.equals("GetContrattoByNumContrattoCodEmittenteProdId")) {
/*  667 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  668 */       emittente = (FinEmittente)getBean(oEmittente, FinEmittente.class);
/*  669 */       prodotto = (FinProdotto)getBean(oProdotto, FinProdotto.class);
/*  670 */       String numContratto = contratto.getNumContratto();
/*  671 */       String codEmittente = emittente.getCodEmittExt();
/*  672 */       Integer prodottoId = prodotto.getProdottoID();
/*  673 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  674 */       paramMap.putAppl("CODEMITTENTE", codEmittente);
/*  675 */       paramMap.putAppl("PRODOTTO", prodottoId);
/*  676 */       moduleName = this.action;
/*  677 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  678 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     }
/*  680 */     else if (this.action.equals("GetContrattoByNumContrattoCodInterfaccia")) {
/*  681 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  682 */       interfaccia = (FinInterfaccia)getBean(oInterfaccia, FinInterfaccia.class);
/*  683 */       String numContratto = contratto.getNumContratto();
/*  684 */       String codInterfaccia = interfaccia.getInterfaccia();
/*  685 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  686 */       paramMap.putAppl("INTERFACCIA", codInterfaccia);
/*  687 */       moduleName = this.action;
/*  688 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  689 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     }
/*  691 */     else if (this.action.equals("GetContrattoByNumContrattoCodInterfacciaTipo")) {
/*  692 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  693 */       interfaccia = (FinInterfaccia)getBean(oInterfaccia, FinInterfaccia.class);
/*  694 */       String numContratto = contratto.getNumContratto();
/*  695 */       String codInterfaccia = interfaccia.getInterfaccia();
/*  696 */       String tipo = contratto.getTipoProdotto();
/*  697 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  698 */       paramMap.putAppl("INTERFACCIA", codInterfaccia);
/*  699 */       paramMap.putAppl("TIPO", tipo);
/*  700 */       moduleName = this.action;
/*  701 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  702 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     }
/*  704 */     else if (this.action.equals("GetContrattoByNumContrattoAttFin")) {
/*  705 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*  706 */       Object oAttFin = map.getAppl("ATT_FIN");
/*  707 */       FinAttivitaFinanziaria attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  708 */       String numContratto = contratto.getNumContratto();
/*  709 */       Integer attivitaFinId = attFin.getAttivitaFinId();
/*  710 */       paramMap.putAppl("CONTRATTO", numContratto);
/*  711 */       paramMap.putAppl("ATT_FIN", attivitaFinId);
/*  712 */       moduleName = this.action;
/*  713 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  714 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONTRATTO");
/*      */     }
/*  716 */     else if (this.action.equals("GetContrattoGenerico")) {
/*  717 */       moduleName = "cercaContrattoModule";
/*  718 */       resultMap = getModuleManager().execModule(moduleName, map);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  723 */       if (this.action.equals("GetPolizzaByNumProposta")) {
/*      */         
/*  725 */         polizza = (FinPolizza)getBean(oDettaglio, FinPolizza.class);
/*  726 */         String numProposta = polizza.getNumProposta();
/*  727 */         paramMap.putAppl("NUM_PROPOSTA", numProposta);
/*  728 */         resultMap = getModuleManager().execModule("GetPolizzaByNumPropostaMD", paramMap);
/*  729 */         return processResultMap(resultMap, allowMultipleRows.booleanValue(), "POLIZZA");
/*      */       } 
/*      */       
/*  732 */       if (this.action.equals("GET_PROIEZIONE_POLIZZA_BY_CONTRATTO_ID")) {
/*      */         
/*  734 */         Object oProiezione = map.getAppl("PROIEZIONE");
/*  735 */         proiezionePolizza = (FinProiezionePolizza)getBean(oProiezione, FinProiezionePolizza.class);
/*  736 */         polizza = proiezionePolizza.getPolizza();
/*  737 */         Integer contrattoId = polizza.getContrattoId();
/*  738 */         paramMap.putAppl("CONTRATTO_ID", contrattoId);
/*  739 */         resultMap = getModuleManager().execModule("GetProiezioneByContrattoIdMD", paramMap);
/*  740 */         return processResultMap(resultMap, allowMultipleRows.booleanValue(), "PROIEZIONE");
/*      */       } 
/*  742 */       if (this.action.equals("GET_ASSEGNO_BY_NUM_CARNET")) {
/*  743 */         Object oAssegno = map.getAppl("ASSEGNO");
/*  744 */         assegno = (FinAssegno)getBean(oAssegno, FinAssegno.class);
/*  745 */         String numCarnet = assegno.getNumeroCarnet();
/*  746 */         paramMap.putAppl("NUMERO_CARNET", numCarnet);
/*  747 */         resultMap = getModuleManager().execModule("GetAssegnoByNumCarnetMD", paramMap);
/*  748 */         return processResultMap(resultMap, allowMultipleRows.booleanValue(), "ASSEGNO");
/*      */       } 
/*      */ 
/*      */       
/*  752 */       if (this.action.equals("InsertPolizza") || this.action.equals("INSERT_CONTRATTO_DT") || this.action.equals("INSERT_CONTRATTO_CC")) {
/*      */         
/*  754 */         oDettaglio = controlloDettaglio(oDettaglio, this.action);
/*  755 */         paramMap.putAppl("DETTAGLIO", oDettaglio);
/*  756 */         getModuleManager().execModule("InserimentoDettaglio", paramMap);
/*  757 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       
/*      */       }
/*  760 */       else if (this.action.equals("INSERT_GP_STORICO")) {
/*      */         
/*  762 */         Object oGpStorico = map.getAppl("GP_STORICO");
/*  763 */         gpStorico = (FinGPStorico)getBean(oGpStorico, FinGPStorico.class);
/*  764 */         paramMap.putAppl("GP_STORICO", gpStorico);
/*  765 */         getModuleManager().execModule("InserimentoGpStorico", paramMap);
/*  766 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       
/*      */       }
/*  769 */       else if (this.action.equals("UPDATE_GP_STORICO")) {
/*      */         
/*  771 */         Object oGpStorico = map.getAppl("GP_STORICO");
/*  772 */         gpStorico = (FinGPStorico)getBean(oGpStorico, FinGPStorico.class);
/*  773 */         paramMap.putAppl("GP_STORICO", gpStorico);
/*  774 */         getModuleManager().execModule("UpdateGpStorico", paramMap);
/*  775 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */ 
/*      */       
/*      */       }
/*  779 */       else if (this.action.equals("InsertProiezionePolizza")) {
/*  780 */         proiezionePolizza = (FinProiezionePolizza)map.getAppl("PROIEZIONE");
/*      */         
/*  782 */         paramMap.putAppl("PROIEZIONE", proiezionePolizza);
/*  783 */         getModuleManager().execModule("InsertProiezionePolizzaMD", paramMap);
/*  784 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       }
/*  786 */       else if (this.action.equals("UpdateProiezionePolizza")) {
/*  787 */         proiezionePolizza = (FinProiezionePolizza)map.getAppl("PROIEZIONE");
/*      */         
/*  789 */         paramMap.putAppl("PROIEZIONE", proiezionePolizza);
/*  790 */         getModuleManager().execModule("UpdateProiezionePolizzaMD", paramMap);
/*  791 */         resultMap.putAppl("RESULT", "UPDATED");
/*      */       }
/*  793 */       else if (this.action.equals("InsertPremioPolizza")) {
/*      */         
/*  795 */         premioPolizza = (FinPremioPolizza)getBean(oPremioPolizza, FinPremioPolizza.class);
/*  796 */         paramMap.putAppl("PREMIO_POLIZZA", premioPolizza);
/*  797 */         getModuleManager().execModule("InsertPremioPolizzaMD", paramMap);
/*  798 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       }
/*  800 */       else if (this.action.equals("InsertAssegno")) {
/*  801 */         Object oAssegno = map.getAppl("ASSEGNO");
/*  802 */         assegno = (FinAssegno)getBean(oAssegno, FinAssegno.class);
/*  803 */         paramMap.putAppl("ASSEGNO", assegno);
/*  804 */         getModuleManager().execModule("InsertAssegnoMD", paramMap);
/*  805 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       
/*      */       }
/*  808 */       else if (this.action.equals("UpdateAssegno")) {
/*  809 */         Object oAssegno = map.getAppl("ASSEGNO");
/*  810 */         assegno = (FinAssegno)getBean(oAssegno, FinAssegno.class);
/*  811 */         paramMap.putAppl("ASSEGNO", assegno);
/*  812 */         getModuleManager().execModule("UpdateAssegnoMD", paramMap);
/*  813 */         resultMap.putAppl("RESULT", "UPDATED");
/*      */       } else {
/*      */         
/*  816 */         if (this.action.equals("GET_ASSEGNAZIONE_ATTIVA_BY_CONTRATTO_PROMOTORE")) {
/*  817 */           promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class);
/*  818 */           contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*      */           
/*  820 */           Integer promotoreId = promotore.getPromotoreId();
/*  821 */           Integer contrattoId = contratto.getContrattoId();
/*      */           
/*  823 */           paramMap.putAppl("CONTRATTO", contrattoId);
/*  824 */           paramMap.putAppl("PROMOTORE", promotoreId);
/*      */           
/*  826 */           moduleName = "GetAssegnazioneAttivaByContrattoPromotoreMD";
/*      */           try {
/*  828 */             resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  829 */           } catch (HibernateObjectRetrievalFailureException e) {
/*  830 */             RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  831 */             rse.setStackTrace(e.getStackTrace());
/*  832 */             throw rse;
/*      */           } 
/*  834 */           return processResultMap(resultMap, allowMultipleRows.booleanValue(), "ASSEGNAZIONE");
/*      */         } 
/*      */         
/*  837 */         if (this.action.equals("INSERT_ASSEGNAZIONE")) {
/*      */           
/*  839 */           assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class);
/*      */           
/*  841 */           insertAssegnazione(assegnazione);
/*      */           
/*  843 */           resultMap.putAppl("RESULT", "INSERTED");
/*  844 */           return resultMap;
/*      */         } 
/*      */         
/*  847 */         if (this.action.equals("UPDATE_ASSEGNAZIONE")) {
/*      */           
/*  849 */           assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class);
/*  850 */           moduleName = "UpdateAssegnazioneMD";
/*      */           
/*  852 */           paramMap.putAppl("ASSEGNAZIONE", assegnazione);
/*      */           try {
/*  854 */             getModuleManager().execModule(moduleName, paramMap);
/*  855 */           } catch (HibernateObjectRetrievalFailureException e) {
/*  856 */             RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  857 */             rse.setStackTrace(e.getStackTrace());
/*  858 */             throw rse;
/*      */           } 
/*  860 */           resultMap.putAppl("RESULT", "UPDATED");
/*  861 */           return resultMap;
/*      */         } 
/*  863 */         if (this.action.equals("GET_BANCA_BY_ABI_CAB")) {
/*  864 */           banca = (FinAnagraficaBanca)getBean(oBanca, FinAnagraficaBanca.class);
/*      */           
/*  866 */           String abi = banca.getAbi();
/*  867 */           String cab = banca.getCab();
/*      */           
/*  869 */           paramMap.putAppl("ABI", abi);
/*  870 */           paramMap.putAppl("CAB", cab);
/*      */           
/*  872 */           moduleName = "GetBancaByABICABMD";
/*      */           try {
/*  874 */             resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  875 */           } catch (HibernateObjectRetrievalFailureException e) {
/*  876 */             RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  877 */             rse.setStackTrace(e.getStackTrace());
/*  878 */             throw rse;
/*      */           } 
/*  880 */           return processResultMap(resultMap, allowMultipleRows.booleanValue(), "BANCA");
/*      */         } 
/*      */ 
/*      */         
/*  884 */         String errorMessage = "Azione passata al servizio " + getClass() + " invalida o mancante. Action = " + this.action + "";
/*  885 */         if (this.log.isErrorEnabled()) {
/*  886 */           this.log.error(errorMessage);
/*      */         }
/*  888 */         throw new RasServiceException(errorMessage);
/*      */       } 
/*  890 */     }  return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow, String genericModuleResult) throws RasServiceException {
/*  901 */     ArrayList result = (ArrayList)resultMap.getAppl(genericModuleResult);
/*  902 */     resultMap.removeAppl(genericModuleResult);
/*      */     
/*  904 */     if (result.size() == 0) {
/*  905 */       String tipoCercato = genericModuleResult.toLowerCase();
/*  906 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*  907 */       throwOnLineError("errors.service.ContrattoManager." + tipoCercato + ".notfound");
/*      */     
/*      */     }
/*  910 */     else if (allowMultipleRow) {
/*  911 */       resultMap.putAppl("RESULT", "FOUND");
/*  912 */       resultMap.putAppl(genericModuleResult, result);
/*      */     
/*      */     }
/*  915 */     else if (result.size() == 1) {
/*  916 */       resultMap.putAppl("RESULT", "FOUND");
/*  917 */       resultMap.putAppl(genericModuleResult, result.get(0));
/*      */     }
/*      */     else {
/*      */       
/*  921 */       String tipoCercato = genericModuleResult.toLowerCase();
/*  922 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*  923 */       throwOnLineError("errors.service.ContrattoManager." + tipoCercato + ".tooManyRows");
/*      */     } 
/*  925 */     return resultMap;
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
/*      */   private Object controlloDettaglio(Object dettaglio, String action) throws RasServiceException {
/*  937 */     if (!(dettaglio instanceof it.ras.arco.bean.FinGP) && !(dettaglio instanceof it.ras.arco.bean.FinFondiSicav) && !(dettaglio instanceof FinPolizza) && !(dettaglio instanceof FinContrattoCC) && !(dettaglio instanceof FinContrattoDt) && !(dettaglio instanceof it.ras.arco.bean.FinAltriProdDet)) {
/*      */ 
/*      */       
/*  940 */       String errorMessage = "Oggetto ricevuto dal servizio di tipo errato, azione :" + action;
/*  941 */       if (this.log.isErrorEnabled()) {
/*  942 */         this.log.error(errorMessage);
/*      */       }
/*  944 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/*  947 */     return dettaglio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private Object getBean(Object obj, Class c) throws RasServiceException {
/*  953 */     if (obj == null) {
/*  954 */       String errorMessage = "Oggetto ricevuto dal servizio nullo. Tipo atteso: " + c.getName();
/*  955 */       if (this.log.isErrorEnabled()) {
/*  956 */         this.log.error(errorMessage);
/*      */       }
/*  958 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/*  961 */     return obj;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPosizione(FinContratto contratto, FinPosizione posizione, String nomeBatch) throws ParseException {
/*  967 */     posizione.setContratto((FinContrattoBase)contratto);
/*  968 */     posizione.setDataCreazione(this.dataOdierna);
/*  969 */     posizione.setTipo("LIQ");
/*  970 */     posizione.setQuantita(this.emptyDouble);
/*  971 */     posizione.setQuantitaDisp(this.emptyDouble);
/*  972 */     posizione.setQtBloccata(this.emptyDouble);
/*  973 */     posizione.setQtTunnel1(this.emptyDouble);
/*  974 */     posizione.setQtTunnel2(this.emptyDouble);
/*  975 */     posizione.setQtTunnel3(this.emptyDouble);
/*  976 */     posizione.setQtTunnel4(this.emptyDouble);
/*  977 */     posizione.setCtv(this.emptyDouble);
/*  978 */     posizione.setRateo(this.emptyDouble);
/*  979 */     posizione.setPmc(this.emptyDouble);
/*  980 */     posizione.setCambioMedio(this.emptyDouble);
/*  981 */     posizione.setValQuota(this.emptyDouble);
/*  982 */     posizione.setGiacenzaMedia(this.emptyDouble);
/*  983 */     posizione.setGgDaApert(new Integer(0));
/*  984 */     posizione.setCommissioni(this.emptyDouble);
/*  985 */     posizione.setSpese(this.emptyDouble);
/*  986 */     posizione.setImpVersatoLordo(this.emptyDouble);
/*  987 */     posizione.setImpPrelevLordo(this.emptyDouble);
/*  988 */     posizione.setImpGiroconLordo(this.emptyDouble);
/*  989 */     posizione.setImpPlusvalLordo(this.emptyDouble);
/*  990 */     posizione.setImpVersatoNetto(this.emptyDouble);
/*  991 */     posizione.setImpPrelevNetto(this.emptyDouble);
/*  992 */     posizione.setImpGiroconNetto(this.emptyDouble);
/*  993 */     posizione.setImpPlusvalNetto(this.emptyDouble);
/*  994 */     posizione.setRendInvestLordo(this.emptyDouble);
/*  995 */     posizione.setRendInvestNetto(this.emptyDouble);
/*  996 */     posizione.setNumQuoteCert(this.emptyDouble);
/*  997 */     posizione.setDataVal(this.dataOdierna);
/*  998 */     posizione.setTipoProdotto(contratto.getTipoProdotto());
/*      */     
/* 1000 */     posizione.setDataInserimento(this.dataOdierna);
/* 1001 */     posizione.setUtenteInserimento(nomeBatch);
/*      */     
/* 1003 */     posizione.setCodiceSconto(contratto.getCodiceSconto());
/* 1004 */     posizione.setCodiceConvenzione(contratto.getCodConvenzione());
/*      */     
/* 1006 */     ArchUtils.setStdFields(posizione, "I", nomeBatch);
/*      */   }
/*      */   public void setAction(String action) {
/* 1009 */     this.action = action;
/*      */   }
/*      */   public String getAction() {
/* 1012 */     return this.action;
/*      */   }
/*      */   public String getCreaPosizione() {
/* 1015 */     return this.creaPosizione;
/*      */   }
/*      */   public void setCreaPosizione(String creaPosizione) {
/* 1018 */     this.creaPosizione = creaPosizione;
/*      */   }
/*      */   public String getCreaAssegnazione() {
/* 1021 */     return this.creaAssegnazione;
/*      */   }
/*      */   public void setCreaAssegnazione(String creaAssegnazione) {
/* 1024 */     this.creaAssegnazione = creaAssegnazione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void throwOnLineError(String errorCode) throws RasServiceException {
/* 1030 */     if (this.onLine) {
/* 1031 */       RasServiceException error = new RasServiceException();
/* 1032 */       error.addError(new RasValidationSignal(errorCode));
/* 1033 */       throw error;
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void insertAssegnazione(FinContrattoPromotore assegnazione) throws RasServiceException {
/* 1039 */     String moduleName = "InsertAssegnazioneMD";
/*      */     
/* 1041 */     MapContainer paramMap = new MapContainer();
/*      */     
/* 1043 */     paramMap.putAppl("ASSEGNAZIONE", assegnazione);
/*      */     try {
/* 1045 */       getModuleManager().execModule(moduleName, paramMap);
/* 1046 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 1047 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 1048 */       rse.setStackTrace(e.getStackTrace());
/* 1049 */       throw rse;
/*      */     } 
/*      */   }
/*      */   
/*      */   public boolean isOnLine() {
/* 1054 */     return this.onLine;
/*      */   }
/*      */   public void setOnLine(boolean onLine) {
/* 1057 */     this.onLine = onLine;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\ContrattoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */