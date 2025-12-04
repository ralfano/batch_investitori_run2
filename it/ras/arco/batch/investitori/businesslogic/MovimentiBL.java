/*     */ package it.ras.arco.batch.investitori.businesslogic;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxGpramMovimenti;
/*     */ import it.ras.arco.bean.FinContratto;
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
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
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
/*     */ public class MovimentiBL
/*     */   extends BusinessLogicObject
/*     */ {
/*  50 */   private FinMovimento movimento = null;
/*     */   
/*  52 */   private FinPosizione posizione = null;
/*     */   
/*  54 */   private FinOrdine ordine = null;
/*     */   
/*  56 */   private FlxGpramMovimenti cursorRow = null;
/*     */   
/*  58 */   Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */   
/*     */   private CodesTableManager codesTableManager;
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String promNotFound = "PROMOTORE NON ESISTE";
/*     */ 
/*     */   
/*     */   private static final String causNotFoud = "CAUSALE NON TROVATA";
/*     */ 
/*     */   
/*     */   private static final String conNotFound = "CONTRATTO NON TROVATO";
/*     */ 
/*     */   
/*     */   private static final String movFound = "MOVIMENTO GIA PRESENTE";
/*     */ 
/*     */   
/*     */   private static final String movIns = "MOVIMENTO NON INSERITO";
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMovimento(Object row) {
/*  83 */     this.cursorRow = (FlxGpramMovimenti)row;
/*  84 */     this.movimento = new FinMovimento();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     Double importo = this.cursorRow.getImportoMovimento();
/*     */     
/*  91 */     if (importo == null)
/*     */     {
/*  93 */       importo = new Double(0.0D);
/*     */     }
/*  95 */     String segnoMov = this.cursorRow.getSegnoMov();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     if (segnoMov.equals("-")) {
/* 101 */       this.movimento.setImpPrelevLordo(new Double(Math.abs(importo.doubleValue())));
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 107 */       this.movimento.setImpVersatoLordo(new Double(Math.abs(importo.doubleValue())));
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     Double prezzo = this.cursorRow.getPrezzo();
/*     */     
/* 118 */     if (prezzo == null)
/*     */     {
/* 120 */       prezzo = new Double(0.0D);
/*     */     }
/*     */     
/* 123 */     Double quantita = this.cursorRow.getQuantitaTitolo();
/* 124 */     if (quantita == null)
/*     */     {
/* 126 */       quantita = new Double(0.0D);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     this.movimento.setCtvLordo(importo);
/* 133 */     this.movimento.setCtvNetto(new Double(prezzo.doubleValue() * quantita.doubleValue()));
/* 134 */     this.movimento.setQuantita(quantita);
/* 135 */     this.movimento.setPrezzo(prezzo);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 141 */     this.movimento.setCambio(this.cursorRow.getCambio());
/* 142 */     this.movimento.setDataValuta(this.cursorRow.getDataValuta());
/*     */     
/* 144 */     this.movimento.setNumMovExt(this.cursorRow.getNumeroRiferimento());
/* 145 */     this.movimento.setDivisa("242");
/* 146 */     this.movimento.setDataMovimento(this.cursorRow.getDataMovimento());
/* 147 */     this.movimento.setDataInserimento(new Date());
/* 148 */     this.movimento.setUtenteInserimento("Batch MovimentiGP");
/* 149 */     this.movimento.setDataCompetenza(this.cursorRow.getDataValuta());
/* 150 */     this.movimento.setDataRegistraz(this.cursorRow.getDataContabile());
/* 151 */     ArchUtils.setStdFields(this.movimento, "I", "Batch MovimentiGP");
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
/*     */   public void doOneStep(Object row) throws RasServiceException {
/* 168 */     MapContainer param = new MapContainer();
/* 169 */     MapContainer result = null;
/*     */     
/* 171 */     Log logger = LogFactory.getLog(getClass());
/* 172 */     if (logger.isInfoEnabled()) {
/* 173 */       logger.info("Start");
/*     */     }
/* 175 */     this.cursorRow = (FlxGpramMovimenti)row;
/*     */     
/* 177 */     setMovimento(row);
/* 178 */     String causale = null;
/* 179 */     causale = getCausale(this.cursorRow.getCodiceCausaleMov());
/*     */     
/* 181 */     if (causale.equals(""))
/*     */     {
/*     */       
/* 184 */       if (logger.isErrorEnabled()) {
/* 185 */         logger.error("Causale non trovata per codice esterno: " + this.cursorRow.getCodiceCausaleMov());
/*     */         
/* 187 */         this.cursorRow.setDataElab(new Date());
/* 188 */         this.cursorRow.setDescrizioneErrore("CAUSALE NON TROVATA");
/* 189 */         setResponse("WARNING");
/*     */         
/*     */         return;
/*     */       } 
/*     */     }
/* 194 */     this.movimento.setCausale(causale);
/* 195 */     this.movimento.setDescrizione(this.cursorRow.getCausaleMovimento());
/* 196 */     Double commCli = this.cursorRow.getCommissioneCliente();
/*     */     
/* 198 */     String segnoCommCli = "";
/* 199 */     if (this.cursorRow.getSegnoCommCli() == null) {
/*     */       
/* 201 */       segnoCommCli = "+";
/*     */     } else {
/* 203 */       segnoCommCli = this.cursorRow.getSegnoCommCli();
/*     */     } 
/* 205 */     double commissione = 0.0D;
/*     */     
/* 207 */     double commissioneCli = 0.0D;
/*     */ 
/*     */     
/* 210 */     if (segnoCommCli.equals("-")) {
/*     */       
/* 212 */       commissioneCli = -1.0D * commCli.doubleValue();
/*     */       
/* 214 */       this.cursorRow.setDataElab(new Date());
/* 215 */       this.cursorRow.setDescrizioneErrore("COMMISSIONE NEGATIVA");
/* 216 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 221 */     commissione = commissioneCli;
/*     */     
/* 223 */     this.movimento.setCommissioni(commCli);
/*     */ 
/*     */ 
/*     */     
/* 227 */     FinGP contratto = new FinGP();
/*     */     
/* 229 */     FinInterfaccia interfaccia = new FinInterfaccia();
/* 230 */     interfaccia.setInterfaccia("RAM");
/* 231 */     contratto.setNumContratto(this.cursorRow.getNumeroRapporto());
/* 232 */     param.putAppl("DETTAGLIO", contratto);
/* 233 */     param.putAppl("INTERFACCIA", interfaccia);
/*     */     
/* 235 */     result = executeService("GetContrattoByNumContrattoCodInterfacciaSRV", param);
/*     */     
/* 237 */     if (result.getAppl("RESULT").equals("NOT_FOUND")) {
/*     */       
/* 239 */       this.cursorRow.setDataElab(new Date());
/* 240 */       this.cursorRow.setDescrizioneErrore("CONTRATTO NON TROVATO");
/* 241 */       setResponse("WARNING"); return;
/*     */     } 
/* 243 */     if (result.getAppl("RESULT").equals("TOO_MANY_ROWS")) {
/*     */ 
/*     */       
/* 246 */       this.cursorRow.setDataElab(new Date());
/* 247 */       this.cursorRow.setDescrizioneErrore("CONTRATTO PRESENTE PIU VOLTE");
/* 248 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 253 */     contratto = (FinGP)result.getAppl("CONTRATTO");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 258 */     Set posSet = contratto.getPosizione();
/*     */     
/* 260 */     Iterator posIte = posSet.iterator();
/*     */     
/* 262 */     this.posizione = posIte.next();
/*     */     
/* 264 */     if (this.posizione == null) {
/*     */       
/* 266 */       this.cursorRow.setDataElab(new Date());
/* 267 */       this.cursorRow.setDescrizioneErrore("POSIZIONE NON TROVATA");
/* 268 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 273 */     this.movimento.setPosizione(this.posizione);
/* 274 */     param.putAppl("MOVIMENTO", this.movimento);
/* 275 */     param.putAppl("CONTRATTO", contratto);
/* 276 */     if (logger.isInfoEnabled()) {
/* 277 */       logger.info("Il movimento è" + this.movimento.getNumMovExt());
/* 278 */       logger.info("Il contratto è" + contratto.getNumContratto());
/*     */     } 
/* 280 */     result = executeService("GetMovimentoByNumMovimentoContrattoIdSRV", param);
/*     */     
/* 282 */     logger.info("Il risultato è" + result);
/* 283 */     if (result.getAppl("RESULT").equals("FOUND")) {
/*     */ 
/*     */ 
/*     */       
/* 287 */       this.movimento = (FinMovimento)result.getAppl("POSIZIONE");
/*     */       
/* 289 */       Date dataMov = this.movimento.getDataMovimento();
/* 290 */       Date dataFlx = this.cursorRow.getDataMovimento();
/*     */       
/* 292 */       Calendar calFlx = Calendar.getInstance();
/* 293 */       Calendar calMov = Calendar.getInstance();
/*     */       
/* 295 */       calMov.setTime(dataMov);
/* 296 */       calFlx.setTime(dataFlx);
/*     */       
/* 298 */       int y = calMov.get(1);
/*     */       
/* 300 */       int m = calMov.get(2);
/*     */       
/* 302 */       int d = calMov.get(5);
/*     */       
/* 304 */       int yFlx = calFlx.get(1);
/*     */       
/* 306 */       int mFlx = calFlx.get(2);
/*     */       
/* 308 */       int dFlx = calFlx.get(5);
/*     */       
/* 310 */       if (this.movimento.getNumMovExt().equals("00000000") && contratto.getNumContratto().substring(0, 1).equals("RC") && y == yFlx && m == mFlx && d == dFlx && this.movimento.getCtvLordo().doubleValue() == this.cursorRow.getImportoMovimento().doubleValue()) {
/*     */ 
/*     */ 
/*     */         
/* 314 */         this.cursorRow.setDataElab(new Date());
/* 315 */         this.cursorRow.setDescrizioneErrore("MOVIMENTO GIA PRESENTE");
/* 316 */         setResponse("WARNING");
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */     
/* 323 */     this.ordine = new FinOrdine();
/* 324 */     if (this.cursorRow.getRifOrdine() == null) {
/* 325 */       this.ordine.setOrdineId(new Integer(-1));
/*     */     } else {
/* 327 */       this.ordine.setOrdineId(new Integer(this.cursorRow.getRifOrdine()));
/*     */     } 
/*     */     
/* 330 */     this.ordine.setAttivitaFin(this.posizione.getAttivitaFin());
/*     */ 
/*     */ 
/*     */     
/* 334 */     FinPromotore promotore = new FinPromotore();
/*     */     
/* 336 */     if (this.cursorRow.getCodiceRete().equals("R")) {
/*     */       
/* 338 */       promotore.setCodRete("S");
/* 339 */     } else if (this.cursorRow.getCodiceRete().equals("F")) {
/*     */       
/* 341 */       promotore.setCodRete("R");
/*     */     } else {
/* 343 */       promotore.setCodRete(this.cursorRow.getCodiceRete());
/*     */     } 
/* 345 */     if (this.cursorRow.getCodiceCompagnia().equals("00")) {
/*     */       
/* 347 */       promotore.setCodComp("99");
/*     */     } else {
/* 349 */       promotore.setCodComp(this.cursorRow.getCodiceCompagnia());
/*     */     } 
/* 351 */     promotore.setCodPromotore(this.cursorRow.getCodiceAgente());
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 356 */     if ((promotore = getPromotore(promotore)) != null) {
/* 357 */       this.movimento.setPromotoreId(promotore.getPromotoreId());
/* 358 */       this.movimento.setCodiceAgente(this.cursorRow.getCodiceAgente());
/*     */     } else {
/* 360 */       this.cursorRow.setDataElab(new Date());
/* 361 */       this.cursorRow.setDescrizioneErrore("PROMOTORE NON ESISTE");
/* 362 */       setResponse("WARNING");
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 367 */     this.movimento.setPosizione(this.posizione);
/* 368 */     this.movimento.setContratto((FinContratto)contratto);
/* 369 */     this.movimento.setAttivitaFin(this.posizione.getAttivitaFin());
/* 370 */     ArchUtils.setStdFields(this.movimento, "I", "Batch MovimentiGP");
/*     */     
/* 372 */     param.removeAppl("CONTRATTO");
/* 373 */     param.putAppl("ORDINE", this.ordine);
/* 374 */     param.putAppl("NOME_BATCH", "Batch MovimentiGp");
/* 375 */     param.putAppl("MOVIMENTO", this.movimento);
/*     */     
/* 377 */     logger.info("Il risultato è" + this.movimento.getNumMovExt());
/* 378 */     result = executeService("InsMovimentoSiOrdineNoPosizione", param);
/* 379 */     logger.info("Il risultato è" + result);
/* 380 */     if (!result.getAppl("RESULT").equals("INSERTED")) {
/*     */       
/* 382 */       this.cursorRow.setDescrizioneErrore("MOVIMENTO NON INSERITO");
/* 383 */       this.cursorRow.setDataElab(new Date());
/* 384 */       setResponse("WARNING");
/*     */       return;
/*     */     } 
/* 387 */     this.cursorRow.setDataElab(new Date());
/* 388 */     setResponse("OK");
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
/*     */   private String getCausale(String codiceEsternoCausale) {
/* 403 */     String retValue = (String)this.codesTableManager.decodeValue("CAUSALE_MOVIMENTO", "CAUSALE_MOV_GPRAM", "CAUSALE_MOV_ARCO", codiceEsternoCausale);
/*     */ 
/*     */ 
/*     */     
/* 407 */     return retValue;
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
/*     */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 420 */     this.codesTableManager = codesTableManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public CodesTableManager getCodesTableManager() {
/* 430 */     return this.codesTableManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private FinPromotore getPromotore(FinPromotore promotore) throws RasServiceException {
/* 441 */     MapContainer param = new MapContainer();
/* 442 */     MapContainer result = new MapContainer();
/* 443 */     String risultato = null;
/* 444 */     FinPromotore promotoreResult = null;
/* 445 */     param.putAppl("PROMOTORE", promotore);
/*     */     
/* 447 */     if (this.logger.isDebugEnabled()) {
/* 448 */       this.logger.debug("Esecuzione servizio: PromotoreManagerSRV ");
/*     */     }
/* 450 */     result = executeService("GetPromotoreByCodicePromotoreCodiceReteCodiceCompagnia", param);
/*     */     
/* 452 */     if (this.logger.isDebugEnabled()) {
/* 453 */       this.logger.debug("Fine esecuzione servizio: PromotoreManagerSRV");
/*     */     }
/*     */     
/* 456 */     risultato = (String)result.getAppl("RESULT");
/*     */     
/* 458 */     if (risultato.equals("FOUND")) {
/* 459 */       promotoreResult = (FinPromotore)result.getAppl("PROMOTORE");
/*     */       
/* 461 */       return promotoreResult;
/*     */     } 
/* 463 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\MovimentiBL.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */