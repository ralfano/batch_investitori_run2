/*     */ package it.ras.arco.batch.investitori.businesslogic;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxInvestitoriMovimenti;
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinDispPagamento;
/*     */ import it.ras.arco.bean.FinGP;
/*     */ import it.ras.arco.bean.FinInterfaccia;
/*     */ import it.ras.arco.bean.FinMovimento;
/*     */ import it.ras.arco.bean.FinOrdine;
/*     */ import it.ras.arco.bean.FinPosizione;
/*     */ import it.ras.arco.bean.FinPromotore;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*     */ import it.ras.flag.config.CodesTableManager;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class MovimentiGenBL
/*     */   extends BusinessLogicObject
/*     */ {
/*  59 */   private FinMovimento movimento = null;
/*     */   
/*  61 */   private FinPosizione posizione = null;
/*     */   
/*  63 */   private FlxInvestitoriMovimenti cursorRow = null;
/*     */   
/*  65 */   Log logger = LogFactory.getLog(getClass());
/*     */   
/*     */   private CodesTableManager codesTableManager;
/*     */   
/*     */   private static final String promNotFound = "PROMOTORE NON ESISTE";
/*     */   
/*     */   private static final String causNotFoud = "CAUSALE NON TROVATA";
/*     */   
/*     */   private static final String conNotFound = "CONTRATTO NON TROVATO";
/*     */   
/*     */   private static final String movFound = "MOVIMENTO GIA PRESENTE";
/*     */   
/*     */   private static final String movManyRows = "TROVATI PIU MOVIMENTI";
/*     */   
/*     */   private static final String movIns = "MOVIMENTO NON INSERITO";
/*     */   
/*  81 */   private static HashMap hmDecodificaCausaliMovInvestDipPag = new HashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static {
/*  89 */     hmDecodificaCausaliMovInvestDipPag.put("GLEDIN", "PS");
/*  90 */     hmDecodificaCausaliMovInvestDipPag.put("GLESIN", "PS");
/*  91 */     hmDecodificaCausaliMovInvestDipPag.put("GLUSIN", "PS");
/*  92 */     hmDecodificaCausaliMovInvestDipPag.put("GLUDIN", "PS");
/*  93 */     hmDecodificaCausaliMovInvestDipPag.put("GTELSI", "PS");
/*  94 */     hmDecodificaCausaliMovInvestDipPag.put("GTENDI", "PS");
/*  95 */     hmDecodificaCausaliMovInvestDipPag.put("GTENSI", "PS");
/*  96 */     hmDecodificaCausaliMovInvestDipPag.put("GTELDI", "PS");
/*  97 */     hmDecodificaCausaliMovInvestDipPag.put("GTUNSI", "PS");
/*  98 */     hmDecodificaCausaliMovInvestDipPag.put("GTUNDI", "PS");
/*  99 */     hmDecodificaCausaliMovInvestDipPag.put("GTULDI", "PS");
/* 100 */     hmDecodificaCausaliMovInvestDipPag.put("GTULSI", "PS");
/* 101 */     hmDecodificaCausaliMovInvestDipPag.put("L_BOEI", "BO");
/* 102 */     hmDecodificaCausaliMovInvestDipPag.put("L_BOEE", "BO");
/* 103 */     hmDecodificaCausaliMovInvestDipPag.put("L_BOUE", "BO");
/* 104 */     hmDecodificaCausaliMovInvestDipPag.put("L_BOUI", "BO");
/* 105 */     hmDecodificaCausaliMovInvestDipPag.put("L_LPB", "BO");
/* 106 */     hmDecodificaCausaliMovInvestDipPag.put("L_LPC", "CO");
/* 107 */     hmDecodificaCausaliMovInvestDipPag.put("L_LPP1", "PS");
/* 108 */     hmDecodificaCausaliMovInvestDipPag.put("L_LVA", "AC");
/* 109 */     hmDecodificaCausaliMovInvestDipPag.put("L_LVAP", "AC");
/* 110 */     hmDecodificaCausaliMovInvestDipPag.put("L_LVB", "BO");
/* 111 */     hmDecodificaCausaliMovInvestDipPag.put("L_LVBE", "BO");
/* 112 */     hmDecodificaCausaliMovInvestDipPag.put("L_LVP", "PS");
/* 113 */     hmDecodificaCausaliMovInvestDipPag.put("L_LVPP", "PS");
/* 114 */     hmDecodificaCausaliMovInvestDipPag.put("L_PRCO", "CO");
/* 115 */     hmDecodificaCausaliMovInvestDipPag.put("L_PRAS", "AC");
/* 116 */     hmDecodificaCausaliMovInvestDipPag.put("L_VEAS", "AC");
/* 117 */     hmDecodificaCausaliMovInvestDipPag.put("L_VECO", "CO");
/* 118 */     hmDecodificaCausaliMovInvestDipPag.put("TVI3GP", "PS");
/* 119 */     hmDecodificaCausaliMovInvestDipPag.put("TVI4GP", "PS");
/* 120 */     hmDecodificaCausaliMovInvestDipPag.put("TVN2GP", "PS");
/* 121 */     hmDecodificaCausaliMovInvestDipPag.put("TVN4GP", "PS");
/*     */   }
/*     */ 
/*     */   
/*     */   private String getTipoDispPagamento(String causaleInvestitori) {
/* 126 */     return (String)hmDecodificaCausaliMovInvestDipPag.get(causaleInvestitori);
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
/*     */   public void setMovimento(Object row) {
/* 142 */     this.cursorRow = (FlxInvestitoriMovimenti)row;
/* 143 */     this.movimento = new FinMovimento();
/*     */     
/* 145 */     String codiceIsin = this.cursorRow.getCodiceIsin();
/* 146 */     if (codiceIsin == null) {
/* 147 */       codiceIsin = "";
/*     */     }
/* 149 */     String descrizioneTitolo = this.cursorRow.getDescrizioneTitolo();
/* 150 */     if (descrizioneTitolo == null) {
/* 151 */       descrizioneTitolo = "";
/*     */     }
/* 153 */     Double importo = this.cursorRow.getImportoMovimento();
/* 154 */     if (importo == null) {
/* 155 */       importo = new Double(0.0D);
/*     */     }
/* 157 */     Double prezzo = this.cursorRow.getPrezzo();
/* 158 */     if (prezzo == null) {
/* 159 */       prezzo = new Double(0.0D);
/*     */     }
/* 161 */     Double quantita = this.cursorRow.getQuantitaTitolo();
/* 162 */     if (quantita == null) {
/* 163 */       quantita = new Double(0.0D);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 168 */     String segnoMov = this.cursorRow.getSegnoMov();
/* 169 */     if (segnoMov.equals("-")) {
/* 170 */       this.movimento.setImpPrelevLordo(new Double(Math.abs(importo.doubleValue())));
/*     */     } else {
/* 172 */       this.movimento.setImpVersatoLordo(new Double(Math.abs(importo.doubleValue())));
/*     */     } 
/*     */     
/* 175 */     this.movimento.setCtvLordo(importo);
/*     */     
/* 177 */     this.movimento.setCtvNetto(new Double(importo.doubleValue() - this.cursorRow.getCommissioneCliente().doubleValue()));
/*     */ 
/*     */ 
/*     */     
/* 181 */     this.movimento.setPrezzoValuta(prezzo);
/*     */ 
/*     */     
/* 184 */     double Cambio = 1.0D;
/* 185 */     if (this.cursorRow.getCambio() != null) {
/*     */       
/* 187 */       Cambio = this.cursorRow.getCambio().doubleValue();
/* 188 */       if (Cambio == 0.0D) {
/* 189 */         Cambio = 1.0D;
/*     */       }
/*     */     } 
/* 192 */     this.movimento.setPrezzo(new Double(prezzo.doubleValue() / Cambio));
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
/* 210 */     this.movimento.setQuantita(quantita);
/*     */ 
/*     */ 
/*     */     
/* 214 */     if (this.cursorRow.getDataValuta() != null) {
/* 215 */       this.movimento.setDataValuta(this.cursorRow.getDataValuta());
/*     */     }
/* 217 */     else if (this.cursorRow.getDataMovimento() != null && (this.cursorRow.getTipoProd().equals("GPM") || this.cursorRow.getTipoProd().equals("GMM") || this.cursorRow.getTipoProd().equals("GPF"))) {
/* 218 */       this.movimento.setDataValuta(this.cursorRow.getDataMovimento());
/*     */     } 
/*     */     
/* 221 */     if (this.cursorRow.getDataMovimento() != null) {
/* 222 */       this.movimento.setDataEsecuzione(this.cursorRow.getDataMovimento());
/*     */     }
/*     */     
/* 225 */     this.movimento.setCambio(this.cursorRow.getCambio());
/* 226 */     this.movimento.setNumMovExt(this.cursorRow.getNumeroRiferimento());
/* 227 */     this.movimento.setDivisa("242");
/*     */ 
/*     */     
/* 230 */     this.movimento.setDataMovimento(new Date());
/* 231 */     this.movimento.setDataCompetenza(this.cursorRow.getDataContabile());
/* 232 */     this.movimento.setDataRegistraz(this.cursorRow.getDataContabile());
/* 233 */     this.movimento.setDataRegolamento(this.cursorRow.getDataValuta());
/*     */ 
/*     */     
/* 236 */     this.movimento.setFndDestinazione(codiceIsin + ";" + descrizioneTitolo);
/*     */     
/* 238 */     this.movimento.setDataInserimento(new Date());
/* 239 */     this.movimento.setUtenteInserimento("BatchMovimentiINV");
/* 240 */     ArchUtils.setStdFields(this.movimento, "I", "BatchMovimentiINV");
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
/*     */   public void doOneStep(Object row) throws RasServiceException {
/* 255 */     MapContainer param = new MapContainer();
/* 256 */     MapContainer result = null;
/* 257 */     FinOrdine ordine = null;
/*     */     
/* 259 */     Log logger = LogFactory.getLog(getClass());
/*     */     
/* 261 */     logger.info("Start");
/*     */     
/* 263 */     this.cursorRow = (FlxInvestitoriMovimenti)row;
/* 264 */     this.cursorRow.setDataElab(new Date());
/*     */ 
/*     */ 
/*     */     
/* 268 */     if (this.cursorRow.getNumeroRifEsterno() != null) {
/*     */       
/* 270 */       this.cursorRow.setDataElab(new Date());
/* 271 */       this.cursorRow.setDescrizioneErrore("MOVIMENTO NON D INIZIATIVA");
/* 272 */       setResponse("OK");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 277 */     if (this.cursorRow.getNumeroRiferimento() == null) {
/*     */       
/* 279 */       this.cursorRow.setDataElab(new Date());
/* 280 */       this.cursorRow.setDescrizioneErrore("RIF. Movimento Nullo");
/* 281 */       setResponse("WARNING");
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 288 */     String causale = null;
/*     */ 
/*     */     
/* 291 */     causale = getCausale(this.cursorRow.getCodiceCausaleMov());
/*     */     
/* 293 */     if (causale == null || causale.equals("")) {
/*     */       
/* 295 */       if (logger.isErrorEnabled())
/*     */       {
/* 297 */         logger.error("Causale non trovata per codice esterno: " + this.cursorRow.getCodiceCausaleMov());
/*     */       }
/* 299 */       this.cursorRow.setDataElab(new Date());
/* 300 */       this.cursorRow.setDescrizioneErrore("CAUSALE NON TROVATA");
/* 301 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/* 305 */     setMovimento(row);
/*     */     
/* 307 */     this.movimento.setCausale(causale);
/* 308 */     this.movimento.setDescrizione(this.cursorRow.getCausaleMovimento());
/*     */     
/* 310 */     Double commCli = this.cursorRow.getCommissioneCliente();
/*     */     
/* 312 */     String segnoCommCli = this.cursorRow.getSegnoCommCli();
/* 313 */     if (this.cursorRow.getSegnoCommCli() == null) {
/* 314 */       segnoCommCli = "+";
/*     */     }
/*     */     
/* 317 */     if (segnoCommCli.equals("-")) {
/*     */ 
/*     */       
/* 320 */       this.cursorRow.setDataElab(new Date());
/* 321 */       this.cursorRow.setDescrizioneErrore("COMMISSIONE NEGATIVA");
/* 322 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/* 326 */     this.movimento.setCommissioni(commCli);
/*     */ 
/*     */     
/* 329 */     FinInterfaccia interfaccia = new FinInterfaccia();
/* 330 */     interfaccia.setInterfaccia("RAM");
/*     */     
/* 332 */     FinGP contratto = new FinGP();
/*     */     
/* 334 */     contratto.setTipo(this.cursorRow.getTipoProd());
/* 335 */     contratto.setNumContratto(this.cursorRow.getNumeroRapporto());
/*     */     
/* 337 */     param.putAppl("DETTAGLIO", contratto);
/* 338 */     param.putAppl("INTERFACCIA", interfaccia);
/*     */     
/* 340 */     result = executeService("GetContrattoByNumContrattoCodInterfacciaTipoSRV", param);
/*     */     
/* 342 */     if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*     */       
/* 344 */       this.cursorRow.setDataElab(new Date());
/* 345 */       this.cursorRow.setDescrizioneErrore("CONTRATTO NON TROVATO");
/* 346 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/* 350 */     if (result.getAppl("RESULT").equals("TOO_MANY_ROWS")) {
/*     */       
/* 352 */       this.cursorRow.setDataElab(new Date());
/* 353 */       this.cursorRow.setDescrizioneErrore("CONTRATTO PRESENTE PIU VOLTE");
/* 354 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/* 358 */     contratto = (FinGP)result.getAppl("CONTRATTO");
/*     */     
/* 360 */     Set posSet = contratto.getPosizione();
/*     */     
/* 362 */     Iterator posIte = posSet.iterator();
/* 363 */     FinPosizione posizioneCambioLinea = null;
/* 364 */     this.posizione = null;
/*     */     
/* 366 */     while (posIte.hasNext()) {
/*     */       
/* 368 */       posizioneCambioLinea = posIte.next();
/*     */       
/* 370 */       if (posizioneCambioLinea.getStatoPosizione() != null && posizioneCambioLinea.getStatoPosizione().equals("A")) {
/*     */         
/* 372 */         this.posizione = posizioneCambioLinea;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 377 */     if (this.posizione == null) {
/* 378 */       this.posizione = posizioneCambioLinea;
/*     */     }
/* 380 */     if (this.posizione == null) {
/*     */       
/* 382 */       this.cursorRow.setDataElab(new Date());
/* 383 */       this.cursorRow.setDescrizioneErrore("POSIZIONE NON TROVATA");
/* 384 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/* 388 */     this.movimento.setPosizione(this.posizione);
/*     */ 
/*     */     
/* 391 */     param.putAppl("MOVIMENTO", this.movimento);
/* 392 */     param.putAppl("ALLOW_MULTIPLE_ROWS", new Boolean(true));
/* 393 */     param.putAppl("CONTRATTO", contratto);
/* 394 */     param.putAppl("POSIZIONE", this.posizione);
/* 395 */     param.putAppl("ATTIVITA_FINANZIARIA", this.posizione.getAttivitaFin());
/*     */     
/* 397 */     if (logger.isInfoEnabled()) {
/*     */       
/* 399 */       logger.info("Il movimento è " + this.movimento.getNumMovExt());
/* 400 */       logger.info("Il contratto è " + contratto.getNumContratto());
/*     */     } 
/*     */ 
/*     */     
/* 404 */     result = executeService("GetMovimentoByNumMovimentoContrattoIdPosizioneIdAttFinId", param);
/*     */     
/* 406 */     logger.info("Il risultato è " + result.getAppl("RESULT"));
/*     */ 
/*     */     
/* 409 */     if (result.getAppl("RESULT").equals("FOUND")) {
/*     */ 
/*     */       
/* 412 */       this.cursorRow.setDataElab(new Date());
/* 413 */       this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/* 414 */       setResponse("WARNING");
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 420 */     if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*     */       
/* 422 */       param.putAppl("ALLOW_MULTIPLE_ROWS", new Boolean(false));
/* 423 */       result = executeService("GetMovimentoByNumMovimentoContrattoIdSRV", param);
/*     */       
/* 425 */       if (result.getAppl("RESULT").equals("TOO_MANY_ROWS")) {
/*     */         
/* 427 */         this.cursorRow.setDataElab(new Date());
/* 428 */         this.cursorRow.setDescrizioneErrore("TROVATI PIU MOVIMENTI");
/* 429 */         setResponse("WARNING");
/*     */         
/*     */         return;
/*     */       } 
/* 433 */       if (result.getAppl("RESULT").equals("FOUND")) {
/*     */         
/* 435 */         this.movimento = (FinMovimento)result.getAppl("POSIZIONE");
/*     */ 
/*     */ 
/*     */         
/* 439 */         this.cursorRow.setDataElab(new Date());
/* 440 */         this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/* 441 */         setResponse("WARNING");
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 448 */     ordine = new FinOrdine();
/* 449 */     if (this.cursorRow.getRifOrdine() == null || this.cursorRow.getRifOrdine().equals("*")) {
/*     */       
/* 451 */       ordine.setOrdineId(new Integer(-1));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 464 */       ordine.setOrdineId(new Integer(this.cursorRow.getRifOrdine()));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 469 */     FinPromotore promotore = new FinPromotore();
/* 470 */     promotore.setCodRete(this.cursorRow.getCodiceRete());
/*     */ 
/*     */     
/* 473 */     if (this.cursorRow.getCodiceCompagnia().equals("00") || this.cursorRow.getCodiceCompagnia().equals("0")) {
/*     */       
/* 475 */       promotore.setCodComp("99");
/*     */     }
/*     */     else {
/*     */       
/* 479 */       promotore.setCodComp(this.cursorRow.getCodiceCompagnia());
/*     */     } 
/* 481 */     promotore.setCodPromotore(this.cursorRow.getCodiceAgente());
/*     */     
/* 483 */     promotore = getPromotore(promotore);
/* 484 */     if (promotore == null) {
/*     */       
/* 486 */       this.cursorRow.setDataElab(new Date());
/* 487 */       this.cursorRow.setDescrizioneErrore("PROMOTORE NON ESISTE");
/* 488 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/* 492 */     this.movimento.setPromotore(promotore);
/* 493 */     this.movimento.setCodiceAgente(this.cursorRow.getCodiceAgente());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 498 */     this.movimento.setTipoProdotto(contratto.getProdotto().getTipo());
/* 499 */     this.movimento.setPosizione(this.posizione);
/* 500 */     this.movimento.setContratto((FinContratto)contratto);
/* 501 */     this.movimento.setAttivitaFin(this.posizione.getAttivitaFin());
/*     */     
/* 503 */     ArchUtils.setStdFields(this.movimento, "I", "BatchMovimentiINV");
/*     */     
/* 505 */     param.removeAppl("CONTRATTO");
/* 506 */     param.putAppl("NOME_BATCH", "BatchMovimentiINV");
/* 507 */     param.putAppl("MOVIMENTO", this.movimento);
/* 508 */     param.putAppl("ORDINE", ordine);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 513 */     if (getTipoDispPagamento(this.cursorRow.getCodiceCausaleMov()) != null) {
/*     */ 
/*     */       
/* 516 */       FinDispPagamento myFinDispPagamento = new FinDispPagamento();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 526 */       myFinDispPagamento.setImporto(this.movimento.getCtvLordo());
/*     */       
/* 528 */       myFinDispPagamento.setMezzoPagamento(getTipoDispPagamento(this.cursorRow.getCodiceCausaleMov()));
/*     */       
/* 530 */       param.putAppl("DISP_PAGAMENTO", myFinDispPagamento);
/*     */     } 
/*     */ 
/*     */     
/* 534 */     logger.info("Il risultato è" + this.movimento.getNumMovExt());
/*     */ 
/*     */     
/*     */     try {
/* 538 */       result = executeService("InsMovimentoSiOrdineNoPosizione", param);
/*     */     }
/* 540 */     catch (RasServiceException e) {
/*     */       
/* 542 */       this.cursorRow.setDescrizioneErrore(e.toString());
/* 543 */       if (logger.isErrorEnabled())
/* 544 */         logger.error(e.toString()); 
/* 545 */       throw new RasServiceException(e);
/*     */     } 
/*     */     
/* 548 */     logger.info("Il risultato è" + result);
/* 549 */     if (!result.getAppl("RESULT").equals("INSERTED")) {
/*     */       
/* 551 */       this.cursorRow.setDescrizioneErrore("MOVIMENTO NON INSERITO");
/* 552 */       this.cursorRow.setDataElab(new Date());
/* 553 */       setResponse("WARNING");
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 618 */     this.cursorRow.setDataElab(new Date());
/* 619 */     setResponse("OK");
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
/*     */   private String getCausale(String codiceEsternoCausale) {
/* 635 */     String retValue = "";
/*     */ 
/*     */ 
/*     */     
/* 639 */     retValue = this.codesTableManager.decodeValue("CAUSALE_MOVIMENTO", "INVEST", "CAUSALE_MOV_GPRAM_INVEST", "CAUSALE_MOV_ARCO", codiceEsternoCausale);
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
/* 651 */     return retValue;
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
/*     */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 663 */     this.codesTableManager = codesTableManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CodesTableManager getCodesTableManager() {
/* 673 */     return this.codesTableManager;
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
/*     */   private FinPromotore getPromotore(FinPromotore promotore) throws RasServiceException {
/* 686 */     MapContainer param = new MapContainer();
/* 687 */     MapContainer result = new MapContainer();
/* 688 */     String risultato = null;
/* 689 */     FinPromotore promotoreResult = null;
/* 690 */     param.putAppl("PROMOTORE", promotore);
/*     */     
/* 692 */     if (this.logger.isDebugEnabled()) {
/* 693 */       this.logger.debug("Esecuzione servizio: PromotoreManagerSRV ");
/*     */     }
/* 695 */     result = executeService("GetPromotoreByCodicePromotore", param);
/*     */     
/* 697 */     if (this.logger.isDebugEnabled()) {
/* 698 */       this.logger.debug("Fine esecuzione servizio: PromotoreManagerSRV");
/*     */     }
/*     */     
/* 701 */     risultato = (String)result.getAppl("RESULT");
/*     */     
/* 703 */     if (risultato.equals("FOUND")) {
/*     */       
/* 705 */       promotoreResult = (FinPromotore)result.getAppl("PROMOTORE");
/* 706 */       return promotoreResult;
/*     */     } 
/* 708 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\MovimentiGenBL.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */