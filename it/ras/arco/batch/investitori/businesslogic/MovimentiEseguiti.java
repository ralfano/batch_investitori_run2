/*      */ package it.ras.arco.batch.investitori.businesslogic;
/*      */ 
/*      */ import it.ras.arco.batch.bean.FlxGpMovimenti;
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinDispPagamento;
/*      */ import it.ras.arco.bean.FinGP;
/*      */ import it.ras.arco.bean.FinInterfaccia;
/*      */ import it.ras.arco.bean.FinMovimento;
/*      */ import it.ras.arco.bean.FinOrdine;
/*      */ import it.ras.arco.bean.FinPosizione;
/*      */ import it.ras.arco.bean.FinPromotore;
/*      */ import it.ras.arco.bean.FinSottoscrizione;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*      */ import it.ras.flag.config.CodesTableManager;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Set;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class MovimentiEseguiti
/*      */   extends BusinessLogicObject
/*      */ {
/*   61 */   private FinMovimento movimento = null;
/*      */   
/*   63 */   private FinMovimento new_movimento = null;
/*      */   
/*   65 */   private FinPosizione posizione = null;
/*      */   
/*   67 */   private FinDispPagamento dispagamento = null;
/*      */   
/*   69 */   private FinSottoscrizione sottoscrizione = null;
/*      */   
/*   71 */   private FlxGpMovimenti cursorRow = null;
/*      */   
/*   73 */   Log logger = LogFactory.getLog(getClass());
/*      */   
/*      */   private CodesTableManager codesTableManager;
/*      */   
/*      */   private static final String promNotFound = "PROMOTORE NON ESISTE";
/*      */   
/*      */   private static final String causNotFoud = "CAUSALE NON TROVATA";
/*      */   
/*      */   private static final String conNotFound = "CONTRATTO NON TROVATO";
/*      */   
/*      */   private static final String conNotFoundSott = "CONTRATTO NON TROVATO (prima sott.)";
/*      */   
/*      */   private static final String conNotFoundRimb = "CONTRATTO NON TROVATO (rimborso)";
/*      */   
/*      */   private static final String dispNotFound = "DISPOSIZIONE NON TROVATA";
/*      */   
/*      */   private static final String dispFound = "DISPOSIZIONE GIA ESEGUITA";
/*      */   
/*      */   private static final String notNumMovExt = "PRIMO MOVIMENTO NON TROVATO";
/*      */   
/*      */   private static final String movFound = "MOVIMENTO GIA PRESENTE";
/*      */   
/*      */   private static final String movManyRows = "TROVATI PIU' MOVIMENTI";
/*      */   
/*      */   private static final String movIns = "MOVIMENTO NON INSERITO";
/*      */   
/*      */   private static final String movUpdt = "MOVIMENTO NON UPDATO";
/*      */   
/*      */   private static final String movNotFound = "MOVIMENTO NON TROVATO";
/*      */   
/*      */   private static final String ordnNotFound = "ORDINE NON TROVATO";
/*      */   
/*  105 */   protected ArrayList ss = new ArrayList();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMovimento(Object row, String dp_unica, String dp_ultima) {
/*  124 */     this.cursorRow = (FlxGpMovimenti)row;
/*  125 */     this.movimento = new FinMovimento();
/*      */     
/*  127 */     Double importo = this.cursorRow.getImportoMovimento();
/*      */     
/*  129 */     if (importo == null) {
/*  130 */       importo = new Double(0.0D);
/*      */     }
/*  132 */     String segnoMov = this.cursorRow.getSegnoMov();
/*      */     
/*  134 */     String fabbrica = this.cursorRow.getTipoFabbrica();
/*      */     
/*  136 */     if (segnoMov.equals("-")) {
/*  137 */       this.movimento.setImpPrelevLordo(new Double(Math.abs(importo.doubleValue())));
/*      */     }
/*      */     else {
/*      */       
/*  141 */       this.movimento.setImpVersatoLordo(new Double(Math.abs(importo.doubleValue())));
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
/*      */     
/*  156 */     Double prezzo = this.cursorRow.getPrezzo();
/*      */     
/*  158 */     if (prezzo == null) {
/*  159 */       prezzo = new Double(0.0D);
/*      */     }
/*      */     
/*  162 */     Double quantita = this.cursorRow.getQuantitaTitolo();
/*  163 */     if (quantita == null) {
/*  164 */       quantita = new Double(0.0D);
/*      */     }
/*      */     
/*  167 */     this.movimento.setCtvLordo(importo);
/*      */ 
/*      */     
/*  170 */     this.movimento.setCtvNetto(new Double(importo.doubleValue() - this.cursorRow.getCommissioneCliente().doubleValue()));
/*  171 */     this.movimento.setQuantita(quantita);
/*  172 */     this.movimento.setPrezzo(prezzo);
/*      */     
/*  174 */     if (this.cursorRow.getTipoProd().equals("GPM") || this.cursorRow.getTipoProd().equals("GMM") || this.cursorRow.getTipoProd().equals("GPF")) {
/*      */ 
/*      */       
/*  177 */       this.movimento.setDataValuta(this.cursorRow.getDataMovimento());
/*      */     }
/*  179 */     else if (dp_unica.equals("TRUE") || dp_ultima.equals("TRUE")) {
/*  180 */       this.movimento.setDataValuta(this.cursorRow.getDataValuta());
/*  181 */       this.movimento.setDataEsecuzione(this.cursorRow.getDataMovimento());
/*      */     } 
/*      */ 
/*      */     
/*  185 */     this.movimento.setCambio(this.cursorRow.getCambio());
/*  186 */     this.movimento.setNumMovExt(this.cursorRow.getNumeroRiferimento());
/*  187 */     this.movimento.setDivisa("242");
/*  188 */     this.movimento.setDataMovimento(new Date());
/*  189 */     this.movimento.setDataInserimento(new Date());
/*  190 */     this.movimento.setUtenteInserimento("BatchMovimentiEseguiti");
/*      */     
/*  192 */     if (dp_unica.equals("TRUE") || dp_ultima.equals("TRUE")) {
/*  193 */       this.movimento.setDataRegistraz(this.cursorRow.getDataContabile());
/*  194 */       this.movimento.setDataCompetenza(this.cursorRow.getDataValuta());
/*      */     } 
/*      */     
/*  197 */     ArchUtils.setStdFields(this.movimento, "I", "BatchMovimentiEseguiti");
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
/*      */   public void doOneStep(Object row) throws RasServiceException {
/*  213 */     String dp_unica = "FALSE";
/*  214 */     String dp_prima = "FALSE";
/*  215 */     String dp_in_mezzo = "FALSE";
/*  216 */     String dp_ultima = "FALSE";
/*      */     
/*  218 */     int num_disp = 0;
/*      */     
/*  220 */     MapContainer param = new MapContainer();
/*  221 */     MapContainer result = null;
/*  222 */     FinOrdine ordine = null;
/*  223 */     FinDispPagamento dpagamento = null;
/*  224 */     FinContratto contratto = null;
/*  225 */     FinContratto contra = null;
/*  226 */     FinSottoscrizione sottoscrizione = null;
/*      */     
/*  228 */     Log logger = LogFactory.getLog(getClass());
/*  229 */     if (logger.isInfoEnabled()) {
/*  230 */       logger.info("Start");
/*      */     }
/*  232 */     this.cursorRow = (FlxGpMovimenti)row;
/*  233 */     this.cursorRow.setDataElab(new Date());
/*  234 */     ordine = new FinOrdine();
/*      */     
/*  236 */     contratto = new FinContratto();
/*  237 */     dpagamento = new FinDispPagamento();
/*  238 */     sottoscrizione = new FinSottoscrizione();
/*  239 */     param.putAppl("DPAGAMENTO", dpagamento);
/*      */ 
/*      */ 
/*      */     
/*  243 */     if ((this.cursorRow.getTipoFabbrica().equals("GPRAM") || this.cursorRow.getTipoFabbrica().equals("RASBANKGP")) && this.cursorRow.getNumeroRifEsterno() == null) {
/*      */       
/*  245 */       this.cursorRow.setDataElab(new Date());
/*  246 */       this.cursorRow.setDescrizioneErrore("MOVIMENTO NON DI DISPOSIZIONE");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  252 */     dpagamento.setDisposizioneId(Integer.valueOf(this.cursorRow.getNumeroRifEsterno()));
/*  253 */     result = executeService("GetDispPagamentoEse", param);
/*  254 */     if (result.getAppl("RESULT").equals("FOUND")) {
/*  255 */       this.cursorRow.setDataElab(new Date());
/*  256 */       this.cursorRow.setDescrizioneErrore("DISPOSIZIONE GIA ESEGUITA");
/*  257 */       setResponse("WARNING");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  263 */     ordine.setOrdineId(Integer.valueOf(this.cursorRow.getRifOrdine()));
/*  264 */     contratto.setNumContratto(this.cursorRow.getNumeroRapporto());
/*      */     
/*  266 */     param.putAppl("NUM_CONTRATTO", contratto);
/*  267 */     param.putAppl("CONTRATTO", contratto);
/*  268 */     param.putAppl("ORDINE_ID", ordine);
/*      */ 
/*      */     
/*  271 */     result = executeService("GetNumDispByNumContrattoSOrdineIdMD2", param);
/*      */     
/*  273 */     ArrayList dp_Totali = (ArrayList)result.getAppl("POSIZIONE");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  283 */     result = executeService("GetNumDispByNumContrattoSOrdineIdAperteMD", param);
/*  284 */     ArrayList dp_Aperte = (ArrayList)result.getAppl("POSIZIONE");
/*  285 */     result.removeAppl("POSIZIONE");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  297 */     int dp_chiuse = dp_Totali.size() - dp_Aperte.size();
/*      */     
/*  299 */     if (dp_Totali.size() == 0 || dp_Aperte.size() == 0) {
/*  300 */       this.cursorRow.setDataElab(new Date());
/*  301 */       this.cursorRow.setDescrizioneErrore("ERRORE NEL NUM. DI DISP. ASSOCIATI ALL'ORDINE O AL PRIMO MOV.");
/*  302 */       setResponse("WARNING");
/*      */       return;
/*      */     } 
/*  305 */     if (dp_Totali.size() == 1)
/*  306 */     { dp_unica = "TRUE";
/*      */        }
/*      */     
/*  309 */     else if (dp_Aperte.size() == 1) { dp_ultima = "TRUE"; }
/*  310 */     else if (dp_chiuse == 0) { dp_prima = "TRUE"; }
/*  311 */     else { dp_in_mezzo = "TRUE"; }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  316 */     if (dp_unica.equals("TRUE") || dp_prima.equals("TRUE")) {
/*  317 */       setMovimento(row, dp_unica, dp_ultima);
/*  318 */       String causale = null;
/*  319 */       String tipoFabbrica = this.cursorRow.getTipoFabbrica();
/*      */       
/*  321 */       causale = getCausale(this.cursorRow.getCodiceCausaleMov(), tipoFabbrica);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  327 */       if (causale.equals(""))
/*      */       {
/*  329 */         if (logger.isErrorEnabled()) {
/*  330 */           logger.error("Causale non trovata per codice esterno: " + this.cursorRow.getCodiceCausaleMov());
/*      */           
/*  332 */           this.cursorRow.setDataElab(new Date());
/*  333 */           this.cursorRow.setDescrizioneErrore("CAUSALE NON TROVATA");
/*  334 */           setResponse("WARNING");
/*      */           return;
/*      */         } 
/*      */       }
/*  338 */       this.movimento.setCausale(causale);
/*  339 */       this.movimento.setDescrizione(this.cursorRow.getCausaleMovimento());
/*      */       
/*  341 */       Double commCli = this.cursorRow.getCommissioneCliente();
/*      */       
/*  343 */       String segnoCommCli = "";
/*  344 */       if (this.cursorRow.getSegnoCommCli() == null) {
/*  345 */         segnoCommCli = "+";
/*      */       } else {
/*  347 */         segnoCommCli = this.cursorRow.getSegnoCommCli();
/*      */       } 
/*  349 */       double commissione = 0.0D;
/*      */       
/*  351 */       double commissioneCli = 0.0D;
/*      */       
/*  353 */       if (segnoCommCli.equals("-")) {
/*  354 */         commissioneCli = -1.0D * commCli.doubleValue();
/*      */         
/*  356 */         this.cursorRow.setDataElab(new Date());
/*  357 */         this.cursorRow.setDescrizioneErrore("COMMISSIONE NEGATIVA");
/*  358 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*  363 */       commissione = commissioneCli;
/*  364 */       this.movimento.setCommissioni(commCli);
/*      */ 
/*      */ 
/*      */       
/*  368 */       FinGP contratto_gp = new FinGP();
/*      */       
/*  370 */       FinInterfaccia interfaccia = new FinInterfaccia();
/*      */       
/*  372 */       interfaccia.setInterfaccia("RAM");
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  377 */       contratto_gp.setTipo(this.cursorRow.getTipoProd());
/*      */       
/*  379 */       contratto_gp.setNumContratto(this.cursorRow.getNumeroRapporto());
/*  380 */       param.putAppl("DETTAGLIO", contratto_gp);
/*  381 */       param.putAppl("INTERFACCIA", interfaccia);
/*      */       
/*  383 */       result = executeService("GetContrattoByNumContrattoCodInterfacciaTipoSRV", param);
/*  384 */       if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*      */         
/*  386 */         this.cursorRow.setDataElab(new Date());
/*  387 */         this.cursorRow.setDescrizioneErrore("CONTRATTO NON TROVATO");
/*  388 */         setResponse("WARNING"); return;
/*      */       } 
/*  390 */       if (result.getAppl("RESULT").equals("TOO_MANY_ROWS")) {
/*      */         
/*  392 */         this.cursorRow.setDataElab(new Date());
/*  393 */         this.cursorRow.setDescrizioneErrore("CONTRATTO PRESENTE PIU VOLTE");
/*  394 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*  398 */       contratto_gp = (FinGP)result.getAppl("CONTRATTO");
/*      */       
/*  400 */       Set posSet = contratto_gp.getPosizione();
/*      */       
/*  402 */       Iterator posIte = posSet.iterator();
/*      */       
/*  404 */       FinPosizione posizioneCambioLinea = null;
/*  405 */       this.posizione = null;
/*  406 */       while (posIte.hasNext()) {
/*      */         
/*  408 */         posizioneCambioLinea = posIte.next();
/*      */         
/*  410 */         if (posizioneCambioLinea.getStatoPosizione() != null && posizioneCambioLinea.getStatoPosizione().equals("A")) {
/*      */           
/*  412 */           this.posizione = posizioneCambioLinea;
/*      */ 
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  420 */       if (this.posizione == null) {
/*  421 */         this.posizione = posizioneCambioLinea;
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  427 */       if (this.posizione == null) {
/*  428 */         this.cursorRow.setDataElab(new Date());
/*  429 */         this.cursorRow.setDescrizioneErrore("POSIZIONE NON TROVATA");
/*  430 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*  434 */       this.movimento.setPosizione(this.posizione);
/*  435 */       param.putAppl("MOVIMENTO", this.movimento);
/*  436 */       param.putAppl("CONTRATTO", contratto_gp);
/*  437 */       param.putAppl("POSIZIONE", this.posizione);
/*  438 */       param.putAppl("ATTIVITA_FINANZIARIA", this.posizione.getAttivitaFin());
/*  439 */       if (logger.isInfoEnabled()) {
/*  440 */         logger.info("Il movimento è" + this.movimento.getNumMovExt());
/*  441 */         logger.info("Il contratto è" + contratto_gp.getNumContratto());
/*      */       } 
/*      */ 
/*      */       
/*  445 */       result = executeService("GetMovimentoByNumMovimentoContrattoIdPosizioneIdAttFinId", param);
/*      */       
/*  447 */       logger.info("Il risultato è" + result);
/*      */       
/*  449 */       if (result.getAppl("RESULT").equals("TOO_MANY_ROWS")) {
/*      */ 
/*      */         
/*  452 */         this.cursorRow.setDataElab(new Date());
/*  453 */         this.cursorRow.setDescrizioneErrore("TROVATI PIU' MOVIMENTI");
/*  454 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*  458 */       if (result.getAppl("RESULT").equals("FOUND")) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  463 */         this.movimento = (FinMovimento)result.getAppl("POSIZIONE");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  475 */         if (this.movimento.getNumMovExt().equals("00000000") && contratto_gp.getNumContratto().substring(0, 2).equals("RC") && this.movimento.getCtvLordo().doubleValue() == this.cursorRow.getImportoMovimento().doubleValue()) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  483 */           this.cursorRow.setDataElab(new Date());
/*  484 */           this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/*  485 */           setResponse("WARNING");
/*      */           return;
/*      */         } 
/*  488 */         if (!this.movimento.getNumMovExt().equals("00000000")) {
/*  489 */           this.cursorRow.setDataElab(new Date());
/*  490 */           this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/*  491 */           setResponse("WARNING");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           return;
/*      */         } 
/*  506 */       } else if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  511 */         if (!this.movimento.getNumMovExt().equals("00000000")) {
/*      */           
/*  513 */           result = executeService("GetMovimentoByNumMovimentoContrattoIdSRV", param);
/*      */ 
/*      */           
/*  516 */           if (result.getAppl("RESULT").equals("TOO_MANY_ROWS")) {
/*      */ 
/*      */             
/*  519 */             this.cursorRow.setDataElab(new Date());
/*  520 */             this.cursorRow.setDescrizioneErrore("TROVATI PIU' MOVIMENTI");
/*  521 */             setResponse("WARNING"); return;
/*      */           } 
/*  523 */           if (result.getAppl("RESULT").equals("FOUND")) {
/*      */ 
/*      */             
/*  526 */             this.movimento = (FinMovimento)result.getAppl("POSIZIONE");
/*      */             
/*  528 */             if (this.movimento.getNumMovExt().equals("00000000") && contratto.getNumContratto().substring(0, 2).equals("RC") && this.movimento.getCtvLordo().doubleValue() == this.cursorRow.getImportoMovimento().doubleValue()) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  536 */               this.cursorRow.setDataElab(new Date());
/*  537 */               this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/*  538 */               setResponse("WARNING");
/*      */               return;
/*      */             } 
/*  541 */             if (!this.movimento.getNumMovExt().equals("00000000")) {
/*  542 */               this.cursorRow.setDataElab(new Date());
/*  543 */               this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/*  544 */               setResponse("WARNING");
/*      */ 
/*      */ 
/*      */               
/*      */               return;
/*      */             } 
/*      */           } 
/*      */         } else {
/*  552 */           param.putAppl("ALLOW_MULTIPLE_ROWS", new Boolean(true));
/*      */           
/*  554 */           result = executeService("GetMovimentoByNumMovimentoContrattoIdSRV", param);
/*      */ 
/*      */           
/*  557 */           if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*  558 */             this.cursorRow.setDataElab(new Date());
/*  559 */             this.cursorRow.setDescrizioneErrore("MOVIMENTO NON TROVATO");
/*  560 */             setResponse("WARNING");
/*      */             
/*      */             return;
/*      */           } 
/*  564 */           if (result.getAppl("RESULT").equals("FOUND")) {
/*      */ 
/*      */ 
/*      */             
/*  568 */             List movimentiList = (List)result.getAppl("POSIZIONE");
/*      */ 
/*      */             
/*  571 */             Iterator movimentiIte = movimentiList.iterator();
/*  572 */             FinMovimento movimentoGp = new FinMovimento();
/*  573 */             while (movimentiIte.hasNext()) {
/*      */               
/*  575 */               movimentoGp = movimentiIte.next();
/*      */ 
/*      */               
/*  578 */               if (contratto.getNumContratto().substring(0, 2).equals("RC") && this.movimento.getCtvLordo().doubleValue() == this.cursorRow.getImportoMovimento().doubleValue()) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  585 */                 this.cursorRow.setDataElab(new Date());
/*  586 */                 this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/*  587 */                 setResponse("WARNING");
/*      */ 
/*      */                 
/*      */                 return;
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  598 */       if (this.cursorRow.getRifOrdine() == null) {
/*  599 */         ordine.setOrdineId(new Integer(-1));
/*      */       } else {
/*  601 */         ordine.setOrdineId(new Integer(this.cursorRow.getRifOrdine()));
/*      */       } 
/*      */       
/*  604 */       FinPromotore promotore = new FinPromotore();
/*      */       
/*  606 */       promotore.setCodRete(this.cursorRow.getCodiceRete());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  617 */       if (this.cursorRow.getCodiceCompagnia().equals("00") || this.cursorRow.getCodiceCompagnia().equals("0")) {
/*      */         
/*  619 */         promotore.setCodComp("99");
/*      */       } else {
/*  621 */         promotore.setCodComp(this.cursorRow.getCodiceCompagnia());
/*      */       } 
/*  623 */       promotore.setCodPromotore(this.cursorRow.getCodiceAgente());
/*      */       
/*  625 */       if ((promotore = getPromotore(promotore)) != null) {
/*  626 */         this.movimento.setPromotore(promotore);
/*  627 */         this.movimento.setCodiceAgente(this.cursorRow.getCodiceAgente());
/*      */       } else {
/*  629 */         this.cursorRow.setDataElab(new Date());
/*  630 */         this.cursorRow.setDescrizioneErrore("PROMOTORE NON ESISTE");
/*  631 */         setResponse("WARNING");
/*      */         return;
/*      */       } 
/*  634 */       this.movimento.setTipoProdotto(contratto_gp.getProdotto().getTipo());
/*  635 */       this.movimento.setPosizione(this.posizione);
/*  636 */       this.movimento.setContratto((FinContratto)contratto_gp);
/*  637 */       this.movimento.setAttivitaFin(this.posizione.getAttivitaFin());
/*  638 */       ArchUtils.setStdFields(this.movimento, "I", "BatchMovimentiEseguiti");
/*      */ 
/*      */ 
/*      */       
/*  642 */       if (dp_unica == "TRUE") {
/*  643 */         if (ordine.getTipo() != null && ordine.getTipo().equals("100")) {
/*  644 */           this.posizione = this.movimento.getPosizione();
/*  645 */           contratto = this.movimento.getContratto();
/*  646 */           this.posizione.setStatoPosizione("A");
/*  647 */           contratto.setStatoContratto("A");
/*  648 */           param.putAppl("POSIZIONE", this.posizione);
/*  649 */           param.putAppl("CONTRATTO", contratto);
/*      */         } 
/*      */         
/*  652 */         if (ordine.getTipo() != null && ordine.getTipo().equals("500")) {
/*  653 */           this.posizione = this.movimento.getPosizione();
/*  654 */           contratto = this.movimento.getContratto();
/*  655 */           contratto.setStatoContratto("C");
/*  656 */           if (this.posizione.getStatoPosizione().equals("c"))
/*  657 */             this.posizione.setStatoPosizione("C"); 
/*  658 */           contratto.setStatoContratto("C");
/*      */         } 
/*      */       } 
/*  661 */       param.removeAppl("CONTRATTO");
/*  662 */       param.putAppl("NOME_BATCH", "BatchMovimentiEseguiti");
/*  663 */       param.putAppl("MOVIMENTO", this.movimento);
/*  664 */       param.putAppl("ORDINE", ordine);
/*      */ 
/*      */       
/*  667 */       param.putAppl("DPAGAMENTO", dpagamento);
/*  668 */       result = executeService("GetDispPagamento", param);
/*  669 */       if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*  670 */         this.cursorRow.setDataElab(new Date());
/*  671 */         this.cursorRow.setDescrizioneErrore("DISPOSIZIONE NON TROVATA");
/*  672 */         setResponse("WARNING");
/*      */         return;
/*      */       } 
/*  675 */       param.removeAppl("DPAGAMENTO");
/*  676 */       dpagamento = (FinDispPagamento)result.getAppl("POSIZIONE");
/*  677 */       if (dp_unica.equals("TRUE"))
/*  678 */         dpagamento.setDataValuta(this.cursorRow.getDataValuta()); 
/*  679 */       param.putAppl("DPAGAMENTO", dpagamento);
/*      */ 
/*      */       
/*  682 */       param.putAppl("FLAG_DP", dp_unica);
/*      */ 
/*      */       
/*  685 */       logger.info("Il risultato è" + this.movimento.getNumMovExt());
/*      */       
/*      */       try {
/*  688 */         result = executeService("InsMovimentoSiOrdineNoPosizioneAR", param);
/*  689 */       } catch (RasServiceException e) {
/*  690 */         this.cursorRow.setDescrizioneErrore(e.toString());
/*  691 */         if (logger.isErrorEnabled())
/*  692 */           logger.error(e.toString()); 
/*  693 */         throw new RasServiceException(e);
/*      */       } 
/*      */       
/*  696 */       logger.info("Il risultato è" + result);
/*  697 */       if (!result.getAppl("RESULT").equals("INSERTED")) {
/*      */         
/*  699 */         this.cursorRow.setDescrizioneErrore("MOVIMENTO NON INSERITO");
/*  700 */         this.cursorRow.setDataElab(new Date());
/*  701 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*  705 */       this.cursorRow.setDataElab(new Date());
/*  706 */       setResponse("OK");
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  711 */     if (dp_ultima.equals("TRUE") || dp_in_mezzo.equals("TRUE")) {
/*      */ 
/*      */       
/*  714 */       result = executeService("GetNumMovExtS", param);
/*  715 */       if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*  716 */         this.cursorRow.setDataElab(new Date());
/*  717 */         this.cursorRow.setDescrizioneErrore("PRIMO MOVIMENTO NON TROVATO");
/*  718 */         setResponse("WARNING");
/*      */ 
/*      */ 
/*      */         
/*      */         return;
/*      */       } 
/*      */ 
/*      */       
/*  726 */       this.new_movimento = (FinMovimento)result.getAppl("POSIZIONE");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  732 */       setMovimento(row, dp_unica, dp_ultima);
/*  733 */       String causale = null;
/*  734 */       String tipoFabbrica = this.cursorRow.getTipoFabbrica();
/*      */       
/*  736 */       causale = getCausale(this.cursorRow.getCodiceCausaleMov(), tipoFabbrica);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  742 */       if (causale.equals(""))
/*      */       {
/*  744 */         if (logger.isErrorEnabled()) {
/*  745 */           logger.error("Causale non trovata per codice esterno: " + this.cursorRow.getCodiceCausaleMov());
/*      */           
/*  747 */           this.cursorRow.setDataElab(new Date());
/*  748 */           this.cursorRow.setDescrizioneErrore("CAUSALE NON TROVATA");
/*  749 */           setResponse("WARNING");
/*      */           return;
/*      */         } 
/*      */       }
/*  753 */       this.movimento.setCausale(causale);
/*  754 */       this.movimento.setDescrizione(this.cursorRow.getCausaleMovimento());
/*      */       
/*  756 */       Double commCli = this.cursorRow.getCommissioneCliente();
/*      */       
/*  758 */       String segnoCommCli = "";
/*  759 */       if (this.cursorRow.getSegnoCommCli() == null) {
/*  760 */         segnoCommCli = "+";
/*      */       } else {
/*  762 */         segnoCommCli = this.cursorRow.getSegnoCommCli();
/*      */       } 
/*  764 */       double commissione = 0.0D;
/*      */       
/*  766 */       double commissioneCli = 0.0D;
/*      */       
/*  768 */       if (segnoCommCli.equals("-")) {
/*  769 */         commissioneCli = -1.0D * commCli.doubleValue();
/*      */         
/*  771 */         this.cursorRow.setDataElab(new Date());
/*  772 */         this.cursorRow.setDescrizioneErrore("COMMISSIONE NEGATIVA");
/*  773 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*      */       
/*  778 */       commissione = commissioneCli;
/*  779 */       this.movimento.setCommissioni(commCli);
/*      */       
/*  781 */       this.cursorRow.setDataElab(new Date());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  787 */       result = executeService("GetDispPagamento", param);
/*  788 */       if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*  789 */         this.cursorRow.setDataElab(new Date());
/*  790 */         this.cursorRow.setDescrizioneErrore("DISPOSIZIONE NON TROVATA");
/*  791 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*  795 */       param.removeAppl("DPAGAMENTO");
/*  796 */       dpagamento = (FinDispPagamento)result.getAppl("POSIZIONE");
/*  797 */       dpagamento.setStato("E");
/*  798 */       dpagamento.setDataValuta(this.cursorRow.getDataValuta());
/*  799 */       param.putAppl("DPAGAMENTO", dpagamento);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  805 */       if (dp_ultima == "TRUE") {
/*      */         
/*  807 */         ordine.setOrdineId(Integer.valueOf(this.cursorRow.getRifOrdine()));
/*  808 */         param.putAppl("ORDINE_ID", ordine);
/*  809 */         result = executeService("GetOrdineByOrdineId", param);
/*      */         
/*  811 */         if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*  812 */           this.cursorRow.setDataElab(new Date());
/*  813 */           this.cursorRow.setDescrizioneErrore("ORDINE NON TROVATO");
/*  814 */           setResponse("WARNING");
/*      */           return;
/*      */         } 
/*  817 */         ordine = (FinOrdine)result.getAppl("POSIZIONE");
/*  818 */         param.removeAppl("ORDINE_ID");
/*  819 */         ordine.setStato("E");
/*  820 */         param.putAppl("ORDINE_ID", ordine);
/*      */ 
/*      */         
/*  823 */         sottoscrizione = ordine.getSottoscrizione();
/*  824 */         sottoscrizione.setStato("E");
/*  825 */         param.putAppl("SOTTOSCRIZIONE", sottoscrizione);
/*      */         
/*  827 */         if (ordine.getTipo() != null && ordine.getTipo().equals("100")) {
/*      */ 
/*      */           
/*  830 */           contratto.setContrattoId(this.new_movimento.getContratto().getContrattoId());
/*      */           
/*  832 */           param.putAppl("DETTAGLIO", contratto);
/*  833 */           result = executeService("GetContrattoByContrattoIdSRV", param);
/*  834 */           if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*  835 */             this.cursorRow.setDataElab(new Date());
/*  836 */             this.cursorRow.setDescrizioneErrore("CONTRATTO NON TROVATO (prima sott.)");
/*  837 */             setResponse("WARNING");
/*      */             return;
/*      */           } 
/*  840 */           param.removeAppl("CONTRATTO");
/*  841 */           contratto.setStatoContratto("C");
/*  842 */           param.putAppl("CONTRATTO", contratto);
/*      */           
/*  844 */           this.posizione = this.new_movimento.getPosizione();
/*      */           
/*  846 */           this.posizione.setStatoPosizione("A");
/*  847 */           contratto.setStatoContratto("A");
/*  848 */           param.putAppl("POSIZIONE", this.posizione);
/*  849 */           param.putAppl("CONTRATTO", contratto);
/*      */         } 
/*      */         
/*  852 */         if (ordine.getTipo() != null && ordine.getTipo().equals("500")) {
/*      */           
/*  854 */           contratto.setContrattoId(this.new_movimento.getContratto().getContrattoId());
/*      */           
/*  856 */           param.putAppl("DETTAGLIO", contratto);
/*  857 */           result = executeService("GetContrattoByContrattoIdSRV", param);
/*  858 */           if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*  859 */             this.cursorRow.setDataElab(new Date());
/*  860 */             this.cursorRow.setDescrizioneErrore("CONTRATTO NON TROVATO (rimborso)");
/*  861 */             setResponse("WARNING");
/*      */             return;
/*      */           } 
/*  864 */           param.removeAppl("CONTRATTO");
/*  865 */           contratto.setStatoContratto("C");
/*  866 */           param.putAppl("CONTRATTO", contratto);
/*      */ 
/*      */           
/*  869 */           this.posizione = this.new_movimento.getPosizione();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  875 */           if (this.posizione.getStatoPosizione().equals("c"))
/*  876 */             this.posizione.setStatoPosizione("C"); 
/*  877 */           param.putAppl("POSIZIONE", this.posizione);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  887 */       param.putAppl("FLAG_ULTIMA_DP", dp_ultima);
/*  888 */       param.putAppl("NEW_MOVIMENTO", this.new_movimento);
/*  889 */       param.putAppl("MOVIMENTO", this.movimento);
/*      */ 
/*      */ 
/*      */       
/*      */       try {
/*  894 */         result = executeService("UpdataMovimentoPerDispPagamento", param);
/*  895 */       } catch (RasServiceException e) {
/*  896 */         this.cursorRow.setDescrizioneErrore(e.toString());
/*  897 */         if (logger.isErrorEnabled())
/*  898 */           logger.error(e.toString()); 
/*  899 */         throw new RasServiceException(e);
/*      */       } 
/*      */       
/*  902 */       logger.info("Il risultato è" + result);
/*  903 */       if (!result.getAppl("RESULT").equals("UPDATED")) {
/*      */         
/*  905 */         this.cursorRow.setDescrizioneErrore("MOVIMENTO NON UPDATO");
/*  906 */         this.cursorRow.setDataElab(new Date());
/*  907 */         setResponse("WARNING");
/*      */         
/*      */         return;
/*      */       } 
/*  911 */       this.cursorRow.setDataElab(new Date());
/*  912 */       setResponse("OK");
/*      */       return;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String getCausale(String codiceEsternoCausale, String tipoFabbrica) {
/*  933 */     String retValue = "";
/*      */     
/*  935 */     retValue = this.codesTableManager.decodeValue("CAUSALE_MOVIMENTO", "GPRAM", "CAUSALE_MOV_GPRAM", "CAUSALE_MOV_ARCO", codiceEsternoCausale);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  943 */     return retValue;
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
/*      */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/*  955 */     this.codesTableManager = codesTableManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CodesTableManager getCodesTableManager() {
/*  965 */     return this.codesTableManager;
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
/*      */   private FinPromotore getPromotore(FinPromotore promotore) throws RasServiceException {
/*  978 */     MapContainer param = new MapContainer();
/*  979 */     MapContainer result = new MapContainer();
/*  980 */     String risultato = null;
/*  981 */     FinPromotore promotoreResult = null;
/*  982 */     param.putAppl("PROMOTORE", promotore);
/*      */     
/*  984 */     if (this.logger.isDebugEnabled()) {
/*  985 */       this.logger.debug("Esecuzione servizio: PromotoreManagerSRV ");
/*      */     }
/*  987 */     result = executeService("GetPromotoreByCodicePromotoreCodiceRete", param);
/*      */ 
/*      */     
/*  990 */     if (this.logger.isDebugEnabled()) {
/*  991 */       this.logger.debug("Fine esecuzione servizio: PromotoreManagerSRV");
/*      */     }
/*      */     
/*  994 */     risultato = (String)result.getAppl("RESULT");
/*      */     
/*  996 */     if (risultato.equals("FOUND")) {
/*  997 */       promotoreResult = (FinPromotore)result.getAppl("PROMOTORE");
/*      */       
/*  999 */       return promotoreResult;
/*      */     } 
/* 1001 */     return null;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\MovimentiEseguiti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */