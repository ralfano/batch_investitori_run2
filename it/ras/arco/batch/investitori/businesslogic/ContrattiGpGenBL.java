/*      */ package it.ras.arco.batch.investitori.businesslogic;
/*      */ 
/*      */ import it.ras.arco.batch.bean.FlxGpramSquadra;
/*      */ import it.ras.arco.batch.bean.FlxInvestitoriContratto;
/*      */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*      */ import it.ras.arco.bean.FinCointestazione;
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinContrattoBase;
/*      */ import it.ras.arco.bean.FinContrattoIndir;
/*      */ import it.ras.arco.bean.FinContrattoPromotore;
/*      */ import it.ras.arco.bean.FinGP;
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinPosizione;
/*      */ import it.ras.arco.bean.FinProdotto;
/*      */ import it.ras.arco.bean.FinPromotore;
/*      */ import it.ras.arco.bean.FinSottoscrizione;
/*      */ import it.ras.arco.bean.FinSottoscrizioneCont;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*      */ import it.ras.flag.config.CodesTableManager;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.text.ParseException;
/*      */ import java.util.Calendar;
/*      */ import java.util.Date;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.Set;
/*      */ import org.apache.commons.lang.StringUtils;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
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
/*      */ public class ContrattiGpGenBL
/*      */   extends BusinessLogicObject
/*      */ {
/*   55 */   Log logger = LogFactory.getLog(getClass());
/*      */   
/*   57 */   private final String BATCH_NAME = "BATCH_NAME";
/*   58 */   private final String DOMINATO = "DOMINATO";
/*   59 */   private final String batchName = "BatchContrattoGPInvestitori";
/*   60 */   private final String CORRISPONDENZA = "COR";
/*   61 */   private final String NUOVO_CONTRATTO = "NUOVO_CONTRATTO";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*   67 */   private final String INVALID_CTR_OMBRELLO = "00000000000";
/*   68 */   private final String GP_INVESTITORI = "GPINVEST";
/*      */ 
/*      */   
/*   71 */   private FinContrattoPromotore contrPromot = null;
/*      */   
/*   73 */   private FinGP gp = null;
/*      */   
/*   75 */   private FinSottoscrizione sottoscrizione = null;
/*      */   
/*   77 */   private FinContrattoIndir contrattoIndir = null;
/*      */   
/*   79 */   private FinIndirizzo indirizzo = null;
/*      */   private boolean flagPresso = false;
/*   81 */   private FinSottoscrizioneCont sottoscrizioneContratto = null;
/*   82 */   private final Double emptyDouble = new Double(0.0D);
/*   83 */   private final Date dataOdierna = new Date();
/*      */   
/*      */   private static final String dati = "INIZIALIZZAZIONE FALLITA";
/*      */   private static final String attNotFound = "ATTIVITA FIN O PRODOTTO NON TROVATO";
/*      */   private static final String contFound = "CONTRATTO GIA PRESENTE";
/*      */   private static final String contrattoApe = "IL CONTRATTO GIA PRESENTE E APERTO";
/*      */   private static final String dataEst = "DATA ESTINZIONE NULL";
/*      */   private static final String promNull = "NON ESISTE IL PROMOTORE";
/*      */   private boolean controlIndir;
/*   92 */   private static String ITALIA = "086";
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private CodesTableManager codesTableManager;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/*  111 */     this.codesTableManager = codesTableManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CodesTableManager getCodesTableManager() {
/*  121 */     return this.codesTableManager;
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
/*      */   public boolean setGp(Object row) {
/*  134 */     FlxInvestitoriContratto cursorRow = (FlxInvestitoriContratto)row;
/*  135 */     this.gp = new FinGP();
/*      */ 
/*      */     
/*  138 */     this.gp.setNumContratto(cursorRow.getNumeroRapporto());
/*  139 */     this.gp.setDataApertura(cursorRow.getDataAperturaGpf());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  145 */     if ("GPINVEST".equals(cursorRow.getTipoFabbrica()) && cursorRow.getMultimandProdottoId() != null && cursorRow.getContrattoOmbrello() != null && !cursorRow.getContrattoOmbrello().equals("00000000000")) {
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  150 */       this.gp.setContrattoOmbrello(StringUtils.stripStart(cursorRow.getContrattoOmbrello(), "0"));
/*      */       
/*  152 */       this.gp.setMultimandProdottoId(cursorRow.getMultimandProdottoId());
/*      */     } 
/*      */     
/*  155 */     Calendar cal = Calendar.getInstance();
/*  156 */     cal.set(9999, 11, 31);
/*      */     
/*  158 */     Calendar cal2 = Calendar.getInstance();
/*      */     
/*  160 */     int m = 11;
/*  161 */     int y = 9999;
/*  162 */     int d = 31;
/*      */     
/*  164 */     if (cursorRow.getDataEstinzione() != null) {
/*      */       
/*  166 */       cal2.setTime(cursorRow.getDataEstinzione());
/*      */       
/*  168 */       m = cal2.get(2);
/*  169 */       y = cal2.get(1);
/*  170 */       d = cal2.get(5);
/*      */     } 
/*  172 */     boolean flagData = false;
/*      */     
/*  174 */     if (m == 11 && y == 9999 && d == 31)
/*      */     {
/*  176 */       flagData = true;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  181 */     if (cursorRow.getDataEstinzione() == null || flagData) {
/*  182 */       this.gp.setDataChiusura(cal.getTime());
/*  183 */       this.gp.setStatoContratto("A");
/*      */     } else {
/*      */       
/*  186 */       this.gp.setDataChiusura(cursorRow.getDataEstinzione());
/*  187 */       this.gp.setStatoContratto("C");
/*      */     } 
/*      */ 
/*      */     
/*  191 */     this.gp.setPrenotateDare(cursorRow.getPrenotateDare());
/*      */     
/*  193 */     if (cursorRow.getPrenotateAvere() != null) {
/*  194 */       this.gp.setPrenotateAvere(new Double(cursorRow.getPrenotateAvere().doubleValue()));
/*      */     }
/*  196 */     this.gp.setPerfBcmk(new Double(0.0D));
/*  197 */     if (cursorRow.getPerfInizioTrimestre() != null) {
/*  198 */       this.gp.setPerfNettaTri(new Double(cursorRow.getPerfInizioTrimestre().doubleValue()));
/*      */     }
/*  200 */     if (cursorRow.getPerfAnnualizzataDaInizioGe() != null) {
/*  201 */       this.gp.setPerfNetta(new Double(cursorRow.getPerfAnnualizzataDaInizioGe().doubleValue()));
/*      */     }
/*  203 */     if (cursorRow.getPerfInizioAnno() != null) {
/*  204 */       this.gp.setPerfNettaAnn(new Double(cursorRow.getPerfInizioAnno().doubleValue()));
/*      */     }
/*      */     
/*  207 */     this.gp.setCtvTot(cursorRow.getControvaloreNav());
/*      */     
/*  209 */     if (cursorRow.getPerfLordaInizioAnno() != null) {
/*  210 */       this.gp.setPerfLordaAnn(new Double(cursorRow.getPerfLordaInizioAnno().doubleValue()));
/*      */     }
/*  212 */     if (cursorRow.getPerfLordaInizioTrimestre() != null) {
/*  213 */       this.gp.setPerfLordaTri(new Double(cursorRow.getPerfLordaInizioTrimestre().doubleValue()));
/*      */     }
/*  215 */     if (cursorRow.getPerfBenchInizioTrim() != null) {
/*  216 */       this.gp.setPerfBcmkTri(new Double(cursorRow.getPerfBenchInizioTrim().doubleValue()));
/*      */     }
/*  218 */     if (cursorRow.getPerfBenchInizioAnno() != null) {
/*  219 */       this.gp.setPerfBcmkAnn(new Double(cursorRow.getPerfBenchInizioAnno().doubleValue()));
/*      */     }
/*      */     
/*  222 */     this.gp.setDataPerf(cursorRow.getDataElabPerf());
/*  223 */     if (cursorRow.getNavCalcoloPerf() != null) {
/*  224 */       this.gp.setNavPerf(new Double(cursorRow.getNavCalcoloPerf().doubleValue()));
/*      */     }
/*  226 */     this.gp.setDataVal(cursorRow.getDataVal());
/*  227 */     this.gp.setLiquidita(cursorRow.getSaldoCc());
/*  228 */     this.gp.setSaldoSottoDossier(cursorRow.getSaldoDossier());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  237 */     this.gp.setPerfGlobInizioMandLor(cursorRow.getPerfGlobInizioMandLor());
/*  238 */     this.gp.setPerfGlobInizioMandNet(cursorRow.getPerfGlobInizioMandNet());
/*  239 */     this.gp.setPerfBenchInizioGestione(cursorRow.getPerfBenchInizioGestione());
/*  240 */     this.gp.setTotaleInvestito(cursorRow.getTotaleInvestito());
/*  241 */     this.gp.setTotaleVersato(cursorRow.getTotaleVersato());
/*  242 */     this.gp.setTotalePrelevato(cursorRow.getTotalePrelevato());
/*      */ 
/*      */     
/*  245 */     if ("00".equals(cursorRow.getBloccoOperativo())) {
/*  246 */       this.gp.setBloccoOperativo("S");
/*      */     } else {
/*  248 */       this.gp.setBloccoOperativo("N");
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  253 */     this.gp.setDataInserimento(new Date());
/*  254 */     this.gp.setUtenteInserimento("BatchContrattoGPInvestitori");
/*  255 */     ArchUtils.setStdFields(this.gp, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */     
/*  258 */     return true;
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
/*      */   public boolean setSottoscrizioneContratto(Object row) {
/*  270 */     this.sottoscrizioneContratto = new FinSottoscrizioneCont();
/*  271 */     this.sottoscrizioneContratto.setDataInserimento(new Date());
/*  272 */     this.sottoscrizioneContratto.setUtenteInserimento("BatchContrattoGPInvestitori");
/*  273 */     ArchUtils.setStdFields(this.sottoscrizioneContratto, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */     
/*  276 */     return true;
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
/*      */   public boolean setSottoscrizione(Object row) {
/*  288 */     FlxInvestitoriContratto cursorRow = (FlxInvestitoriContratto)row;
/*  289 */     this.sottoscrizione = new FinSottoscrizione();
/*  290 */     this.sottoscrizione.setStato("E");
/*  291 */     this.sottoscrizione.setDataSottoscr(cursorRow.getDataAperturaGpf());
/*  292 */     this.sottoscrizione.setTipoOperazione("SOT");
/*      */     
/*  294 */     this.sottoscrizione.setDataInserimento(new Date());
/*  295 */     this.sottoscrizione.setUtenteInserimento("BatchContrattoGPInvestitori");
/*  296 */     ArchUtils.setStdFields(this.sottoscrizione, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */     
/*  299 */     return true;
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
/*      */   public boolean setContrattoIndirizzo(Object row) throws ParseException {
/*  311 */     this.contrattoIndir = new FinContrattoIndir();
/*      */     
/*  313 */     Calendar cal = Calendar.getInstance();
/*  314 */     cal.set(9999, 11, 31);
/*      */     
/*  316 */     this.contrattoIndir.setDataInserimento(new Date());
/*  317 */     this.contrattoIndir.setUtenteInserimento("BatchContrattoGPInvestitori");
/*  318 */     this.contrattoIndir.setDataInizio(new Date());
/*  319 */     this.contrattoIndir.setDataFine(cal.getTime());
/*  320 */     this.contrattoIndir.setTipoIndirizzo("COR");
/*  321 */     ArchUtils.setStdFields(this.contrattoIndir, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */     
/*  324 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean setIndirizzo(Object row) {
/*  335 */     this.controlIndir = false;
/*  336 */     FlxInvestitoriContratto cursorRow = (FlxInvestitoriContratto)row;
/*      */     
/*  338 */     this.indirizzo = new FinIndirizzo();
/*  339 */     this.indirizzo.setProv(cursorRow.getProvinciaPostale());
/*  340 */     this.indirizzo.setDatiSupl(" ");
/*      */ 
/*      */ 
/*      */     
/*  344 */     this.indirizzo.setUtenteInserimento("BatchContrattoGPInvestitori");
/*  345 */     this.indirizzo.setDataInserimento(new Date());
/*  346 */     ArchUtils.setStdFields(this.indirizzo, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */ 
/*      */     
/*  350 */     if (cursorRow.getNazione() != null) {
/*  351 */       String retValue = (String)this.codesTableManager.decodeValue("NAZIONE_GPRAM", "CODICE_NAZIONE_ISO", "CODICE_NAZIONE_UIC", cursorRow.getNazione());
/*  352 */       if (retValue == null || retValue == "") {
/*  353 */         this.indirizzo.setNazione("799");
/*      */       } else {
/*      */         
/*  356 */         this.indirizzo.setNazione(retValue);
/*      */       }
/*      */     
/*  359 */     } else if (null == cursorRow.getProvinciaPostale() || cursorRow.getProvinciaPostale().equals("EE")) {
/*      */       
/*  361 */       this.indirizzo.setNazione("799");
/*      */     }
/*      */     else {
/*      */       
/*  365 */       this.indirizzo.setNazione("086");
/*      */     } 
/*      */ 
/*      */     
/*  369 */     if (cursorRow.getIndirizzoPostale() != null && !cursorRow.getIndirizzoPostale().equals("")) {
/*      */ 
/*      */       
/*  372 */       if (cursorRow.getIndirizzoPostale().startsWith("C/O"))
/*      */       {
/*  374 */         this.flagPresso = true;
/*      */       }
/*      */ 
/*      */       
/*  378 */       this.controlIndir = true;
/*      */     } 
/*      */     
/*  381 */     this.indirizzo.setIndirizzo(cursorRow.getIndirizzoPostale());
/*  382 */     if (cursorRow.getCapPostale() != null && !cursorRow.getCapPostale().equals(""))
/*      */     {
/*  384 */       this.controlIndir = true;
/*      */     }
/*  386 */     this.indirizzo.setCap(cursorRow.getCapPostale());
/*  387 */     if (cursorRow.getLocalitaPostale() != null && !cursorRow.getLocalitaPostale().equals(""))
/*      */     {
/*  389 */       this.controlIndir = true;
/*      */     }
/*  391 */     this.indirizzo.setComune(cursorRow.getLocalitaPostale());
/*  392 */     this.indirizzo.setLocalita(cursorRow.getLocalitaPostale());
/*  393 */     this.indirizzo.setTipoIndirizzo("COR");
/*      */     
/*  395 */     if (cursorRow.getProvinciaPostale() != null && !cursorRow.getProvinciaPostale().equals(""))
/*      */     {
/*  397 */       this.controlIndir = true;
/*      */     }
/*      */     
/*  400 */     return true;
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
/*      */   public void doOneStep(Object row) throws RasServiceException {
/*  413 */     boolean flagNuovoContratto = false;
/*      */     
/*  415 */     Log logger = LogFactory.getLog(getClass());
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  420 */     FlxInvestitoriContratto cursorRow = (FlxInvestitoriContratto)row;
/*      */     
/*  422 */     if (cursorRow.getFlagNuovoContratto() != null && cursorRow.getFlagNuovoContratto().equals("S")) {
/*  423 */       flagNuovoContratto = true;
/*      */     }
/*      */ 
/*      */     
/*      */     try {
/*  428 */       setGp(row);
/*  429 */       setSottoscrizioneContratto(row);
/*  430 */       setSottoscrizione(row);
/*  431 */       setContrattoIndirizzo(row);
/*  432 */       setIndirizzo(row);
/*  433 */       setContrProm((FlxInvestitoriContratto)row);
/*      */     }
/*  435 */     catch (Exception e) {
/*      */       
/*  437 */       if (logger.isErrorEnabled())
/*  438 */         logger.error(e.getMessage()); 
/*  439 */       cursorRow.setDataElab(new Date());
/*  440 */       cursorRow.setDescrizioneErrore("INIZIALIZZAZIONE FALLITA");
/*  441 */       throw new RasServiceException("do1step:inizializzazione dati");
/*      */     } 
/*      */     
/*  444 */     String tipoFabbrica = cursorRow.getTipoFabbrica();
/*      */     
/*  446 */     MapContainer mp = new MapContainer();
/*  447 */     MapContainer result = null;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  453 */     this.gp.setTipo(cursorRow.getTipoProd());
/*      */ 
/*      */ 
/*      */     
/*  457 */     mp.putAppl("GP", this.gp);
/*  458 */     mp.putAppl("SOTTOSCRIZIONE", this.sottoscrizione);
/*  459 */     mp.putAppl("ACTION", "INSERT");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  464 */     FinPosizione posizione = new FinPosizione();
/*      */     
/*  466 */     this.sottoscrizioneContratto.setSottoscrizione(this.sottoscrizione);
/*  467 */     this.sottoscrizioneContratto.setContratto((FinContrattoBase)this.gp);
/*      */     
/*  469 */     this.gp.setSottoscrizione(new HashSet());
/*  470 */     this.gp.getSottoscrizione().add(this.sottoscrizioneContratto);
/*      */     
/*  472 */     if (this.controlIndir == true) {
/*  473 */       this.contrattoIndir.setIndirizzo(this.indirizzo);
/*  474 */       this.contrattoIndir.setContratto((FinContratto)this.gp);
/*  475 */       this.indirizzo.setContratto(new HashSet());
/*  476 */       this.indirizzo.getContratto().add(this.contrattoIndir);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  481 */     MapContainer resultProdotto = null;
/*  482 */     MapContainer mapProdotto = new MapContainer();
/*  483 */     mapProdotto.putAppl("ACTION", "CHECK_EXISTING");
/*      */     
/*  485 */     FinAttivitaFinanziaria finAttivitaFin = new FinAttivitaFinanziaria();
/*  486 */     String codice = "";
/*      */     
/*  488 */     finAttivitaFin.setCodAttFinExt(cursorRow.getCodiceLinea());
/*  489 */     codice = "CODICE_ATT_FIN_INVESTITORI";
/*      */ 
/*      */     
/*  492 */     mapProdotto.putAppl("DATA", new Date());
/*  493 */     mapProdotto.putAppl("CHIAVE_DECODIFICA", codice);
/*  494 */     mapProdotto.putAppl("ROW_ATT_FIN", finAttivitaFin);
/*      */     
/*  496 */     resultProdotto = executeService("GetAttFinProdottoByCodiceCompartoEsterno", mapProdotto);
/*      */     
/*  498 */     if (!resultProdotto.getAppl("RESULT").equals("FOUND")) {
/*      */       
/*  500 */       cursorRow.setDescrizioneErrore("ATTIVITA FIN O PRODOTTO NON TROVATO");
/*  501 */       cursorRow.setDataElab(new Date());
/*  502 */       setResponse("WARNING");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  507 */     FinAttivitaFinanziaria attFin = (FinAttivitaFinanziaria)resultProdotto.getAppl("ROW_ATT_FIN");
/*  508 */     FinProdotto prodotto = (FinProdotto)resultProdotto.getAppl("ROW_PRODOTTO");
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
/*  522 */     this.gp.setTipoProdotto(prodotto.getTipo());
/*      */     
/*  524 */     mp.putAppl("ATT_FIN", attFin);
/*      */     
/*  526 */     mp.putAppl("PRODOTTO", prodotto);
/*      */     
/*  528 */     MapContainer param = new MapContainer();
/*  529 */     this.gp.setProdotto(prodotto);
/*  530 */     param.putAppl("DETTAGLIO", this.gp);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  535 */     result = executeService("GetContrattoByNumContrattoProdottoIdSRV", param);
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
/*  547 */     String resultMsg = (String)result.getAppl("RESULT");
/*      */     
/*  549 */     if (resultMsg.equals("NOT_FOUND") && !flagNuovoContratto) {
/*  550 */       cursorRow.setDataElab(new Date());
/*  551 */       cursorRow.setStatoElaborazione("KO");
/*  552 */       cursorRow.setDescrizioneErrore("Flag nuovo contratto non valorizzato ma contratto non trovato");
/*  553 */       setResponse("WARNING");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  558 */     if (resultMsg.equals("TOO_MANY_ROWS")) {
/*  559 */       cursorRow.setDataElab(new Date());
/*  560 */       cursorRow.setStatoElaborazione("KO");
/*  561 */       cursorRow.setDescrizioneErrore("TOO MANY ROWS");
/*  562 */       setResponse("WARNING");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  568 */     if (resultMsg.equals("FOUND")) {
/*  569 */       Calendar cal = Calendar.getInstance();
/*  570 */       cal.set(9999, 11, 31);
/*      */ 
/*      */       
/*  573 */       int m = cal.get(2);
/*  574 */       int d = cal.get(5);
/*  575 */       int y = cal.get(1);
/*      */       
/*  577 */       Calendar cal2 = Calendar.getInstance();
/*      */       
/*  579 */       int y2 = 9999;
/*  580 */       int m2 = 11;
/*  581 */       int d2 = 31;
/*      */ 
/*      */       
/*  584 */       if (cursorRow.getDataEstinzione() != null) {
/*      */         
/*  586 */         cal2.setTime(cursorRow.getDataEstinzione());
/*  587 */         y2 = cal2.get(1);
/*  588 */         m2 = cal2.get(2);
/*  589 */         d2 = cal2.get(5);
/*      */       } 
/*      */ 
/*      */       
/*  593 */       this.gp = (FinGP)result.getAppl("CONTRATTO");
/*      */       
/*  595 */       if (cursorRow.getDataEstinzione() != null && (m != m2 || d != d2 || y != y2 || this.gp.getDataChiusura() == null || (!cursorRow.getDataEstinzione().after(this.gp.getDataChiusura()) && !cursorRow.getDataEstinzione().before(this.gp.getDataChiusura())))) {
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
/*  614 */         Calendar cal3 = Calendar.getInstance();
/*  615 */         cal.set(9999, 11, 31);
/*      */         
/*  617 */         Calendar cal4 = Calendar.getInstance();
/*      */         
/*  619 */         int mm = 11;
/*  620 */         int yy = 9999;
/*  621 */         int dd = 31;
/*      */         
/*  623 */         if (cursorRow.getDataEstinzione() != null) {
/*      */           
/*  625 */           cal2.setTime(cursorRow.getDataEstinzione());
/*      */           
/*  627 */           mm = cal2.get(2);
/*  628 */           yy = cal2.get(1);
/*  629 */           dd = cal2.get(5);
/*      */         } 
/*  631 */         boolean flagData = false;
/*      */         
/*  633 */         if (mm == 11 && yy == 9999 && dd == 31)
/*      */         {
/*  635 */           flagData = true;
/*      */         }
/*      */ 
/*      */ 
/*      */         
/*  640 */         if (cursorRow.getDataEstinzione() == null || flagData) {
/*  641 */           this.gp.setDataChiusura(cal.getTime());
/*      */         }
/*      */         else {
/*      */           
/*  645 */           this.gp.setDataChiusura(cursorRow.getDataEstinzione());
/*  646 */           this.gp.setStatoContratto("C");
/*      */         } 
/*      */         
/*  649 */         ArchUtils.setStdFields(this.gp, "U", "BatchContrattoGPInvestitori");
/*      */ 
/*      */         
/*  652 */         this.gp.setDataChiusura(cursorRow.getDataEstinzione());
/*  653 */         mp.removeAppl("DETTAGLIO");
/*  654 */         mp.putAppl("DETTAGLIO", this.gp);
/*  655 */         mp.putAppl("SOGGETTO", this.gp.getSoggetto());
/*  656 */         mp.putAppl("COINTESTAZIONE", this.gp.getCointestazione());
/*      */         
/*  658 */         executeService("UpdateIntestContrattoSRV", mp);
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/*  669 */         if ("GPINVEST".equals(cursorRow.getTipoFabbrica()) && cursorRow.getContrattoOmbrello() != null && !cursorRow.getContrattoOmbrello().equals("00000000000")) {
/*      */ 
/*      */           
/*  672 */           if (cursorRow.getMultimandProdottoId() == null) {
/*  673 */             cursorRow.setDataElab(new Date());
/*  674 */             cursorRow.setStatoElaborazione("KO");
/*  675 */             cursorRow.setDescrizioneErrore("PRODOTTO MULTIMANDATO NON TROVATO");
/*  676 */             setResponse("WARNING"); return;
/*      */           } 
/*  678 */           if (this.gp.getContrattoOmbrello() != null && !StringUtils.stripStart(cursorRow.getContrattoOmbrello(), "0").equals(this.gp.getContrattoOmbrello())) {
/*  679 */             cursorRow.setDataElab(new Date());
/*  680 */             cursorRow.setStatoElaborazione("KO");
/*  681 */             cursorRow.setDescrizioneErrore("CONTRATTO OMBRELLO NON CONGRUENTE");
/*  682 */             setResponse("WARNING"); return;
/*      */           } 
/*  684 */           if (this.gp.getContrattoOmbrello() == null && this.gp.getMultimandProdottoId() == null) {
/*  685 */             this.gp.setContrattoOmbrello(StringUtils.stripStart(cursorRow.getContrattoOmbrello(), "0"));
/*  686 */             this.gp.setMultimandProdottoId(cursorRow.getMultimandProdottoId());
/*      */           } 
/*      */         } 
/*      */         
/*  690 */         setContrattoIndirizzo(row);
/*  691 */         setIndirizzo(row);
/*  692 */       } catch (ParseException e) {
/*      */         
/*  694 */         e.printStackTrace();
/*      */       } 
/*      */ 
/*      */       
/*  698 */       if (this.controlIndir == true) {
/*      */ 
/*      */         
/*  701 */         this.contrattoIndir.setContratto((FinContratto)this.gp);
/*  702 */         this.contrattoIndir.setIndirizzo(this.indirizzo);
/*  703 */         this.indirizzo.setContratto(new HashSet());
/*  704 */         this.indirizzo.getContratto().add(this.contrattoIndir);
/*  705 */         mp.putAppl("CONTRATTO_INDIRIZZO", this.contrattoIndir);
/*  706 */         mp.putAppl("INDIRIZZO", this.indirizzo);
/*  707 */         mp.putAppl("CONTRATTO", this.gp);
/*  708 */         mp.putAppl("BATCH_NAME", "BatchContrattoGPInvestitori");
/*  709 */         mp.putAppl("NUOVO_CONTRATTO", new Boolean(flagNuovoContratto));
/*  710 */         MapContainer resultMap = new MapContainer();
/*      */         
/*  712 */         resultMap = executeService("InsertCorrispondenza", mp);
/*      */         
/*  714 */         if (resultMap.getAppl("RESULT").equals("GENERIC ERROR")) {
/*      */           
/*  716 */           if (this.flagPresso == true) {
/*      */             
/*  718 */             this.flagPresso = false;
/*      */             
/*  720 */             this.indirizzo.setPresso(cursorRow.getIndirizzoPostale());
/*  721 */             this.indirizzo.setIndirizzo("");
/*  722 */             mp.removeAppl("INDIRIZZO");
/*  723 */             mp.putAppl("INDIRIZZO", this.indirizzo);
/*  724 */             resultMap = executeService("InsertCorrispondenzaSenzaNormalizzazione", mp);
/*      */ 
/*      */             
/*  727 */             cursorRow.setDataElab(new Date());
/*  728 */             cursorRow.setDescrizioneErrore("INDIRIZZO CORRISPONDENZA CONTENTE PRESSO");
/*      */           
/*      */           }
/*      */           else {
/*      */             
/*  733 */             cursorRow.setDataElab(new Date());
/*  734 */             cursorRow.setDescrizioneErrore("INDIRIZZO CORRISPONDENZA NON NORMALIZZATO");
/*      */             
/*  736 */             resultMap = executeService("InsertCorrispondenzaSenzaNormalizzazione", mp);
/*      */           } 
/*      */ 
/*      */           
/*  740 */           Boolean dominato = (Boolean)resultMap.getAppl("DOMINATO");
/*      */           
/*  742 */           if (dominato != null && dominato.booleanValue() == true) {
/*  743 */             cursorRow.setDescrizioneErrore("Indirizzo dominato");
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  751 */       Set posSet = this.gp.getPosizione();
/*  752 */       if (posSet == null || posSet.isEmpty()) {
/*      */         
/*  754 */         cursorRow.setDataElab(new Date());
/*  755 */         cursorRow.setDescrizioneErrore("POSIZIONE NON TROVATA");
/*      */         
/*  757 */         setResponse("WARNING");
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*  763 */       Iterator posizioneIte = posSet.iterator();
/*  764 */       FinPosizione posizioneCambioLinea = new FinPosizione();
/*  765 */       boolean posizionCambioBool = false;
/*  766 */       while (posizioneIte.hasNext()) {
/*      */ 
/*      */         
/*  769 */         posizione = posizioneIte.next();
/*      */         
/*  771 */         if (posizione.getAttivitaFin().getAttivitaFinId().intValue() != attFin.getAttivitaFinId().intValue() && posizione.getStatoPosizione().equals("A")) {
/*      */ 
/*      */ 
/*      */           
/*  775 */           posizionCambioBool = true;
/*      */           
/*  777 */           posizioneCambioLinea = posizioneCambioLinea.copyFields(posizione);
/*      */ 
/*      */ 
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  787 */       if (posizionCambioBool) {
/*      */ 
/*      */         
/*  790 */         posizione.setStatoPosizione("C");
/*  791 */         posizione.setQuantita(new Double(0.0D));
/*  792 */         ArchUtils.setStdFields(posizione, "U", "BatchContrattoGPInvestitori");
/*      */ 
/*      */ 
/*      */         
/*  796 */         posizioneCambioLinea.setCtv(cursorRow.getControvaloreNav());
/*  797 */         posizioneCambioLinea.setStatoPosizione("A");
/*  798 */         posizioneCambioLinea.setQuantita(new Double(1.0D));
/*  799 */         posizione.setDataVal(cursorRow.getDataVal());
/*  800 */         posizioneCambioLinea.setDataInserimento(new Date());
/*  801 */         posizioneCambioLinea.setUtenteInserimento("BatchContrattoGPInvestitori");
/*  802 */         ArchUtils.setStdFields(posizioneCambioLinea, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */ 
/*      */         
/*  806 */         posizioneCambioLinea.setContratto((FinContrattoBase)this.gp);
/*  807 */         posizioneCambioLinea.setAttivitaFin(attFin);
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  812 */         posizioneCambioLinea.setDataVal(cursorRow.getDataVal());
/*  813 */         MapContainer paramPos = new MapContainer();
/*  814 */         paramPos.putAppl("POSIZIONE", posizioneCambioLinea);
/*      */         
/*  816 */         executeService("InsPosizione", paramPos);
/*      */ 
/*      */       
/*      */       }
/*      */       else {
/*      */ 
/*      */         
/*  823 */         Iterator posizioneIteUpd = posSet.iterator();
/*      */         
/*  825 */         FinPosizione posizioneUpd = null;
/*  826 */         while (posizioneIteUpd.hasNext()) {
/*      */ 
/*      */           
/*  829 */           posizioneUpd = posizioneIteUpd.next();
/*      */ 
/*      */           
/*  832 */           if (posizioneUpd.getStatoPosizione().equals("A") && this.gp.getStatoContratto().equals("C")) {
/*      */             
/*  834 */             posizioneUpd.setQuantita(new Double(0.0D));
/*  835 */             posizioneUpd.setStatoPosizione("C");
/*  836 */             posizioneUpd.setCtv(cursorRow.getControvaloreNav());
/*  837 */             posizioneUpd.setDataVal(cursorRow.getDataVal());
/*      */           
/*      */           }
/*  840 */           else if (posizioneUpd.getStatoPosizione().equals("A")) {
/*      */             
/*  842 */             posizioneUpd.setQuantita(new Double(1.0D));
/*  843 */             posizioneUpd.setCtv(cursorRow.getControvaloreNav());
/*  844 */             posizioneUpd.setDataVal(cursorRow.getDataVal());
/*      */           } 
/*      */           
/*  847 */           ArchUtils.setStdFields(posizione, "U", "BatchContrattoGPInvestitori");
/*      */ 
/*      */ 
/*      */           
/*  851 */           mp.putAppl("NOME_BATCH", "BatchContrattoGPInvestitori");
/*      */           
/*  853 */           mp.putAppl("POSIZIONE", posizione);
/*  854 */           executeService("UpdPosizione", mp);
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
/*  884 */       this.gp.setPrenotateDare(cursorRow.getPrenotateDare());
/*  885 */       if (cursorRow.getPrenotateAvere() != null) {
/*  886 */         this.gp.setPrenotateAvere(new Double(cursorRow.getPrenotateAvere().doubleValue()));
/*      */       }
/*  888 */       this.gp.setPerfBcmk(new Double(0.0D));
/*  889 */       if (cursorRow.getPerfInizioTrimestre() != null) {
/*  890 */         this.gp.setPerfNettaTri(new Double(cursorRow.getPerfInizioTrimestre().doubleValue()));
/*      */       }
/*  892 */       if (cursorRow.getPerfAnnualizzataDaInizioGe() != null) {
/*  893 */         this.gp.setPerfNetta(new Double(cursorRow.getPerfAnnualizzataDaInizioGe().doubleValue()));
/*      */       }
/*  895 */       if (cursorRow.getPerfInizioAnno() != null) {
/*  896 */         this.gp.setPerfNettaAnn(new Double(cursorRow.getPerfInizioAnno().doubleValue()));
/*      */       }
/*      */       
/*  899 */       this.gp.setCtvTot(cursorRow.getControvaloreNav());
/*  900 */       if (cursorRow.getPerfLordaInizioAnno() != null) {
/*  901 */         this.gp.setPerfLordaAnn(new Double(cursorRow.getPerfLordaInizioAnno().doubleValue()));
/*      */       }
/*  903 */       if (cursorRow.getPerfLordaInizioTrimestre() != null) {
/*  904 */         this.gp.setPerfLordaTri(new Double(cursorRow.getPerfLordaInizioTrimestre().doubleValue()));
/*      */       }
/*  906 */       if (cursorRow.getPerfBenchInizioTrim() != null) {
/*  907 */         this.gp.setPerfBcmkTri(new Double(cursorRow.getPerfBenchInizioTrim().doubleValue()));
/*      */       }
/*  909 */       if (cursorRow.getPerfBenchInizioAnno() != null) {
/*  910 */         this.gp.setPerfBcmkAnn(new Double(cursorRow.getPerfBenchInizioAnno().doubleValue()));
/*      */       }
/*  912 */       this.gp.setTipoProdotto(prodotto.getTipo());
/*  913 */       this.gp.setDataPerf(cursorRow.getDataElabPerf());
/*  914 */       if (cursorRow.getNavCalcoloPerf() != null) {
/*  915 */         this.gp.setNavPerf(new Double(cursorRow.getNavCalcoloPerf().doubleValue()));
/*      */       }
/*  917 */       this.gp.setTipo(cursorRow.getTipoProd());
/*  918 */       this.gp.setDataVal(cursorRow.getDataVal());
/*  919 */       this.gp.setLiquidita(cursorRow.getSaldoCc());
/*  920 */       this.gp.setSaldoSottoDossier(cursorRow.getSaldoDossier());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  927 */       this.gp.setPerfGlobInizioMandLor(cursorRow.getPerfGlobInizioMandLor());
/*  928 */       this.gp.setPerfGlobInizioMandNet(cursorRow.getPerfGlobInizioMandNet());
/*  929 */       this.gp.setPerfBenchInizioGestione(cursorRow.getPerfBenchInizioGestione());
/*      */       
/*  931 */       this.gp.setTotaleInvestito(cursorRow.getTotaleInvestito());
/*  932 */       this.gp.setTotaleVersato(cursorRow.getTotaleVersato());
/*  933 */       this.gp.setTotalePrelevato(cursorRow.getTotalePrelevato());
/*      */ 
/*      */       
/*  936 */       if ("00".equals(cursorRow.getBloccoOperativo())) {
/*  937 */         this.gp.setBloccoOperativo("S");
/*      */       } else {
/*  939 */         this.gp.setBloccoOperativo("N");
/*      */       } 
/*      */       
/*  942 */       ArchUtils.setStdFields(this.gp, "U", "BatchContrattoGPInvestitori");
/*      */ 
/*      */ 
/*      */       
/*  946 */       MapContainer mapContainer = null;
/*      */       
/*  948 */       mp.putAppl("CONTRATTOOBJ", this.gp);
/*  949 */       FinCointestazione finCointestazione = new FinCointestazione();
/*      */       
/*  951 */       mapContainer = executeService("GetGpramSquadra", mp);
/*  952 */       String str = (String)mapContainer.getAppl("RESULT");
/*      */       
/*  954 */       if (str.equals("FOUND")) {
/*  955 */         FlxGpramSquadra squadra = null;
/*  956 */         squadra = (FlxGpramSquadra)mapContainer.getAppl("SQUADRAOBJ");
/*  957 */         this.gp.setCointestazione(squadra.getCointestazione());
/*  958 */         this.gp.setSoggetto(squadra.getSoggetto());
/*  959 */         finCointestazione = squadra.getCointestazione();
/*      */       } else {
/*  961 */         cursorRow.setDataElab(new Date());
/*  962 */         cursorRow.setDescrizioneErrore("COINTESTAZIONE NON TROVATA");
/*  963 */         setResponse("WARNING");
/*      */         return;
/*      */       } 
/*  966 */       mp.removeAppl("DETTAGLIO");
/*  967 */       mp.putAppl("DETTAGLIO", this.gp);
/*      */       
/*  969 */       executeService("UpdateFinGpSRV", mp);
/*      */       
/*  971 */       cursorRow.setDataElab(new Date());
/*  972 */       cursorRow.setDescrizioneErrore("CONTRATTO GIA PRESENTE");
/*      */       
/*  974 */       setResponse("OK");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  979 */     MapContainer resultCoin = null;
/*      */     
/*  981 */     mp.putAppl("CONTRATTOOBJ", this.gp);
/*  982 */     FinCointestazione cointestazione = new FinCointestazione();
/*      */     
/*  984 */     resultCoin = executeService("GetGpramSquadra", mp);
/*  985 */     String risultato = (String)resultCoin.getAppl("RESULT");
/*      */     
/*  987 */     if (risultato.equals("FOUND")) {
/*  988 */       FlxGpramSquadra squadra = null;
/*  989 */       squadra = (FlxGpramSquadra)resultCoin.getAppl("SQUADRAOBJ");
/*  990 */       this.gp.setCointestazione(squadra.getCointestazione());
/*  991 */       this.gp.setSoggetto(squadra.getSoggetto());
/*  992 */       cointestazione = squadra.getCointestazione();
/*      */     } else {
/*      */       
/*  995 */       cursorRow.setDataElab(new Date());
/*  996 */       cursorRow.setDescrizioneErrore("COINTESTAZIONE NON TROVATA");
/*      */       
/*  998 */       setResponse("WARNING");
/*      */       return;
/*      */     } 
/* 1001 */     mp.removeAppl("DETTAGLIO");
/* 1002 */     posizione.setContratto((FinContrattoBase)this.gp);
/* 1003 */     posizione.setDataCreazione(this.dataOdierna);
/* 1004 */     posizione.setTipo("LIQ");
/*      */     
/* 1006 */     if (this.gp.getStatoContratto().equals("C")) {
/* 1007 */       posizione.setQuantita(new Double(0.0D));
/* 1008 */       posizione.setStatoPosizione("C");
/*      */     } else {
/* 1010 */       posizione.setQuantita(new Double(1.0D));
/* 1011 */       posizione.setStatoPosizione("A");
/*      */     } 
/* 1013 */     posizione.setTipoProdotto(this.gp.getTipoProdotto());
/* 1014 */     posizione.setQuantitaDisp(this.emptyDouble);
/* 1015 */     posizione.setQtBloccata(this.emptyDouble);
/* 1016 */     posizione.setQtTunnel1(this.emptyDouble);
/* 1017 */     posizione.setQtTunnel2(this.emptyDouble);
/* 1018 */     posizione.setQtTunnel3(this.emptyDouble);
/* 1019 */     posizione.setQtTunnel4(this.emptyDouble);
/* 1020 */     posizione.setRateo(this.emptyDouble);
/* 1021 */     posizione.setPmc(this.emptyDouble);
/* 1022 */     posizione.setCambioMedio(this.emptyDouble);
/* 1023 */     posizione.setValQuota(this.emptyDouble);
/* 1024 */     posizione.setGiacenzaMedia(this.emptyDouble);
/* 1025 */     posizione.setGgDaApert(new Integer(0));
/* 1026 */     posizione.setCommissioni(this.emptyDouble);
/* 1027 */     posizione.setSpese(this.emptyDouble);
/* 1028 */     posizione.setImpVersatoLordo(this.emptyDouble);
/* 1029 */     posizione.setImpPrelevLordo(this.emptyDouble);
/* 1030 */     posizione.setImpGiroconLordo(this.emptyDouble);
/* 1031 */     posizione.setImpPlusvalLordo(this.emptyDouble);
/* 1032 */     posizione.setImpVersatoNetto(this.emptyDouble);
/* 1033 */     posizione.setImpPrelevNetto(this.emptyDouble);
/* 1034 */     posizione.setImpGiroconNetto(this.emptyDouble);
/* 1035 */     posizione.setImpPlusvalNetto(this.emptyDouble);
/* 1036 */     posizione.setRendInvestLordo(this.emptyDouble);
/* 1037 */     posizione.setRendInvestNetto(this.emptyDouble);
/* 1038 */     posizione.setNumQuoteCert(this.emptyDouble);
/* 1039 */     posizione.setCtv(cursorRow.getControvaloreNav());
/* 1040 */     posizione.setDataVal(cursorRow.getDataVal());
/* 1041 */     posizione.setAttivitaFin(attFin);
/*      */     
/* 1043 */     posizione.setUtenteInserimento("BatchContrattoGPInvestitori");
/* 1044 */     posizione.setDataInserimento(new Date());
/*      */     
/* 1046 */     ArchUtils.setStdFields(posizione, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */     
/* 1049 */     this.gp.setPosizione(new HashSet());
/* 1050 */     this.gp.getPosizione().add(posizione);
/* 1051 */     mp.putAppl("COINTESTAZIONE", cointestazione);
/* 1052 */     mp.putAppl("DETTAGLIO", this.gp);
/*      */     
/* 1054 */     mp.putAppl("NOME_BATCH", "BatchContrattoGPInvestitori");
/*      */     
/* 1056 */     executeService("InsertContrattoSRV", mp);
/*      */     
/* 1058 */     mp.removeAppl("COINTESTAZIONE");
/*      */     
/* 1060 */     mp.putAppl("CONTRATTO", this.gp);
/* 1061 */     executeService("InsSottoscrizioneSRV", mp);
/*      */     
/* 1063 */     if (this.controlIndir == true) {
/*      */       
/* 1065 */       this.contrattoIndir.setContratto((FinContratto)this.gp);
/*      */       
/* 1067 */       this.indirizzo.setContratto(new HashSet());
/* 1068 */       this.indirizzo.getContratto().add(this.contrattoIndir);
/* 1069 */       mp.putAppl("CONTRATTO_INDIRIZZO", this.contrattoIndir);
/* 1070 */       mp.putAppl("INDIRIZZO", this.indirizzo);
/* 1071 */       mp.putAppl("BATCH_NAME", "BatchContrattoGPInvestitori");
/* 1072 */       mp.putAppl("NUOVO_CONTRATTO", new Boolean(flagNuovoContratto));
/*      */       
/* 1074 */       MapContainer resultMap = new MapContainer();
/*      */       
/* 1076 */       resultMap = executeService("InsertCorrispondenza", mp);
/*      */       
/* 1078 */       if (resultMap.getAppl("RESULT").equals("GENERIC ERROR")) {
/*      */         
/* 1080 */         if (this.flagPresso == true) {
/*      */           
/* 1082 */           this.flagPresso = false;
/*      */           
/* 1084 */           this.indirizzo.setPresso(cursorRow.getIndirizzoPostale());
/* 1085 */           this.indirizzo.setIndirizzo("");
/* 1086 */           mp.removeAppl("INDIRIZZO");
/* 1087 */           mp.putAppl("INDIRIZZO", this.indirizzo);
/* 1088 */           resultMap = executeService("InsertCorrispondenzaSenzaNormalizzazione", mp);
/*      */ 
/*      */           
/* 1091 */           cursorRow.setDataElab(new Date());
/* 1092 */           cursorRow.setDescrizioneErrore("INDIRIZZO CORRISPONDENZA CONTENTE PRESSO");
/*      */         
/*      */         }
/*      */         else {
/*      */           
/* 1097 */           cursorRow.setDataElab(new Date());
/* 1098 */           cursorRow.setDescrizioneErrore("INDIRIZZO CORRISPONDENZA NON NORMALIZZATO");
/*      */           
/* 1100 */           resultMap = executeService("InsertCorrispondenzaSenzaNormalizzazione", mp);
/*      */         } 
/*      */ 
/*      */         
/* 1104 */         Boolean dominato = (Boolean)resultMap.getAppl("DOMINATO");
/*      */         
/* 1106 */         if (dominato != null && dominato.booleanValue() == true) {
/* 1107 */           cursorRow.setDescrizioneErrore("Indirizzo dominato");
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1112 */     FinPromotore promotore = new FinPromotore();
/*      */ 
/*      */     
/* 1115 */     if (cursorRow.getCodiceRete().equals("R")) {
/*      */       
/* 1117 */       promotore.setCodRete("S");
/* 1118 */     } else if (cursorRow.getCodiceRete().equals("F")) {
/*      */       
/* 1120 */       promotore.setCodRete("R");
/*      */     } else {
/* 1122 */       promotore.setCodRete(cursorRow.getCodiceRete());
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1130 */     if (cursorRow.getCodiceCompagnia().equals("00") || cursorRow.getCodiceCompagnia().equals("0")) {
/*      */       
/* 1132 */       promotore.setCodComp("99");
/*      */     } else {
/* 1134 */       promotore.setCodComp(cursorRow.getCodiceCompagnia());
/*      */     } 
/* 1136 */     promotore.setCodPromotore(cursorRow.getCodiceAgente());
/*      */     
/* 1138 */     if (tipoFabbrica.equals("GPINVEST") && cursorRow.getCodiceCompagnia().equals("00"))
/*      */     {
/* 1140 */       promotore.setCodComp("01");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1146 */     if ((promotore = getPromotore(promotore)) != null) {
/* 1147 */       this.contrPromot.setFlagAttuale("S");
/* 1148 */       this.contrPromot.setPromotore(promotore);
/* 1149 */       this.contrPromot.setContratto((FinContrattoBase)this.gp);
/* 1150 */       insertContrPromotore(this.contrPromot);
/*      */     } else {
/* 1152 */       cursorRow.setDataElab(new Date());
/* 1153 */       cursorRow.setDescrizioneErrore("NON ESISTE IL PROMOTORE");
/* 1154 */       setResponse("WARNING");
/*      */       return;
/*      */     } 
/* 1157 */     cursorRow.setDataElab(new Date());
/* 1158 */     setResponse("OK");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public boolean setContrProm(FlxInvestitoriContratto cursorRow) {
/* 1167 */     this.contrPromot = new FinContrattoPromotore();
/* 1168 */     this.contrPromot.setFlagAttuale("S");
/* 1169 */     this.contrPromot.setUtenteInserimento("BatchContrattoGPInvestitori");
/* 1170 */     this.contrPromot.setDataInizio(cursorRow.getDataAperturaGpf());
/* 1171 */     this.contrPromot.setDataInserimento(new Date());
/* 1172 */     ArchUtils.setStdFields(this.contrPromot, "I", "BatchContrattoGPInvestitori");
/*      */ 
/*      */     
/* 1175 */     return true;
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
/*      */   private FinPromotore getPromotore(FinPromotore promotore) throws RasServiceException {
/* 1189 */     MapContainer param = new MapContainer();
/* 1190 */     MapContainer result = new MapContainer();
/* 1191 */     String risultato = null;
/* 1192 */     FinPromotore promotoreResult = null;
/* 1193 */     param.putAppl("PROMOTORE", promotore);
/*      */     
/* 1195 */     if (this.logger.isDebugEnabled()) {
/* 1196 */       this.logger.debug("Esecuzione servizio: PromotoreManagerSRV ");
/*      */     }
/* 1198 */     result = executeService("GetPromotoreByCodicePromotore", param);
/*      */     
/* 1200 */     if (this.logger.isDebugEnabled()) {
/* 1201 */       this.logger.debug("Fine esecuzione servizio: PromotoreManagerSRV");
/*      */     }
/*      */     
/* 1204 */     risultato = (String)result.getAppl("RESULT");
/*      */     
/* 1206 */     if (risultato.equals("FOUND")) {
/* 1207 */       promotoreResult = (FinPromotore)result.getAppl("PROMOTORE");
/*      */       
/* 1209 */       return promotoreResult;
/*      */     } 
/* 1211 */     return null;
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
/*      */   private boolean insertContrPromotore(FinContrattoPromotore contrPromot) throws RasServiceException {
/* 1224 */     MapContainer param = new MapContainer();
/* 1225 */     MapContainer result = new MapContainer();
/* 1226 */     String risultato = null;
/*      */     
/* 1228 */     param.putAppl("ASSEGNAZIONE", contrPromot);
/*      */     
/* 1230 */     if (this.logger.isDebugEnabled()) {
/* 1231 */       this.logger.debug("Esecuzione servizio: PromotoreManagerSRV ");
/*      */     }
/* 1233 */     result = executeService("InsertAssegnazione", param);
/*      */     
/* 1235 */     if (this.logger.isDebugEnabled()) {
/* 1236 */       this.logger.debug("Fine esecuzione servizio: PromotoreManagerSRV");
/*      */     }
/*      */     
/* 1239 */     risultato = (String)result.getAppl("RESULT");
/*      */     
/* 1241 */     if (risultato.equals("INSERTED")) {
/* 1242 */       return true;
/*      */     }
/* 1244 */     return false;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\ContrattiGpGenBL.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */