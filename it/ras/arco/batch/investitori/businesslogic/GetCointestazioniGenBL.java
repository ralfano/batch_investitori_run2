/*     */ package it.ras.arco.batch.investitori.businesslogic;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxGpramSquadra;
/*     */ import it.ras.arco.batch.bean.FlxInvestitoriCointestazione;
/*     */ import it.ras.arco.batch.bean.FlxRasBankGpSquadra;
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*     */ import it.ras.arco.bean.FinGP;
/*     */ import it.ras.arco.bean.FinInterfaccia;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class GetCointestazioniGenBL
/*     */   extends BusinessLogicObject
/*     */ {
/*     */   protected FlxInvestitoriCointestazione cursorRow;
/*     */   protected FinGP contr;
/*  49 */   protected ArrayList elencoSoggetti = new ArrayList();
/*     */   
/*  51 */   FinGP contrattoObj = new FinGP();
/*     */   
/*  53 */   FinCointestazione CointestazioneObj = new FinCointestazione();
/*     */   
/*  55 */   FinSoggetto soggettoPrimoObj = new FinSoggetto();
/*     */   
/*  57 */   FinSoggetto soggettoObjAltri = new FinSoggetto();
/*     */   
/*     */   Integer soggCoin;
/*     */   
/*     */   public static final String OGGETTO_COINTESTAZIONE = "OBJ_COINTESTAZIONE";
/*     */   
/*     */   public static final String CONTRATTOOBJ = "CONTRATTOOBJ";
/*     */   
/*     */   public static final String CODFISCALE = "CODFISCALE";
/*     */   
/*     */   public static final String SOGGETOBJ = "SOGGETOBJ";
/*     */   
/*     */   public static final String SQUADRAOBJ = "SQUADRAOBJ";
/*     */   
/*     */   public static final String COINTOBJ = "COINTOBJ";
/*     */   
/*  73 */   private static String messaggio = null;
/*     */   
/*     */   private static final String intestatarioSec = "INTESTATARIO SECONDARIO NON ESISTE";
/*     */   
/*     */   private static final String intestatarioSecToo = "INTESTATARIO SECONDARIO PRESENTE PIU VOLTE";
/*     */   
/*     */   private static final String intestatarioPrin = "INTESTATARIO PRINCIPALE NON ESISTE";
/*     */   
/*     */   private static final String intestatarioPrinToo = "INTESTATARIO PRINCIPALE PRESENTE PIU VOLTE";
/*     */   
/*     */   private static final String campoCodiceFisc = "CF O PIVA SONO ERRATI";
/*     */   
/*     */   private static final String tooManyCoint = "STESSA COINTESTAZIONE PRESENTE PIU VOLTE";
/*     */   
/*     */   private static final String cointFound = "COINTESTAZIONE GIA PRESENTE ";
/*     */   
/*     */   private static final String intestatarioNull = "INTESTATARIO NON VALORIZZATO";
/*     */   
/*     */   private static final String contrNull = "CONTRATTO NON VALORIZZATO";
/*     */   
/*     */   private static final String DECOD_INVESTITORI = "GNV";
/*     */   
/*     */   boolean contrattoPresente = true;
/*     */   
/*     */   String contrattoRotturaChiave;
/*     */   
/*     */   String codFiscIntestatarioPrincipale;
/*     */   
/*     */   String codFiscIntestatarioP_BreakKey;
/*     */   
/*     */   String contratto;
/*     */   String tipoFabbrica;
/* 105 */   Log logger = LogFactory.getLog(getClass());
/*     */   
/* 107 */   List soggCointObj = new ArrayList();
/*     */   
/* 109 */   List brokenKeyCursor = new ArrayList();
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
/*     */   public void doOneStep(Object row) throws RasServiceException {
/* 128 */     this.cursorRow = (FlxInvestitoriCointestazione)row;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     if (this.cursorRow.getTipoFabbrica().equals("GPINVEST") || (this.tipoFabbrica != null && this.tipoFabbrica.equals("GPINVEST"))) {
/* 135 */       if (this.contratto == null) {
/* 136 */         this.contratto = this.cursorRow.getNumeroRapporto();
/*     */         
/* 138 */         if (this.cursorRow.getTipoIntestatario().equals("P")) {
/* 139 */           this.codFiscIntestatarioPrincipale = this.cursorRow.getCodiceFiscale();
/*     */         } else {
/*     */           
/* 142 */           this.elencoSoggetti.add(this.cursorRow.getCodiceFiscale());
/*     */         } 
/* 144 */         setResponse("OK");
/* 145 */         this.brokenKeyCursor.add(this.cursorRow);
/*     */         return;
/*     */       } 
/* 148 */       if (this.logger.isInfoEnabled()) {
/* 149 */         this.logger.info("do1step: call isBrokenKey " + this.cursorRow.getNumeroRapporto() + " " + this.cursorRow.getCodiceFiscale());
/*     */       }
/*     */       
/* 152 */       if (isBrokenKey()) {
/* 153 */         if (this.logger.isInfoEnabled()) {
/* 154 */           this.logger.info("do1step: BROKEN KEY isBrokenKey " + this.cursorRow.getNumeroRapporto() + " " + this.cursorRow.getCodiceFiscale());
/*     */         }
/*     */         
/* 157 */         this.tipoFabbrica = this.cursorRow.getTipoFabbrica();
/* 158 */         onBrokenKey();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 164 */         this.codFiscIntestatarioPrincipale = this.cursorRow.getCodiceFiscale();
/* 165 */         this.contratto = this.cursorRow.getNumeroRapporto();
/* 166 */         this.tipoFabbrica = this.cursorRow.getTipoFabbrica();
/* 167 */         this.elencoSoggetti.clear();
/* 168 */         this.soggCointObj.clear();
/*     */       } else {
/*     */         
/* 171 */         this.contratto = this.cursorRow.getNumeroRapporto();
/* 172 */         if (this.cursorRow.getTipoIntestatario().equals("P")) {
/* 173 */           this.codFiscIntestatarioPrincipale = this.cursorRow.getCodiceFiscale();
/*     */         }
/*     */         else {
/*     */           
/* 177 */           this.elencoSoggetti.add(this.cursorRow.getCodiceFiscale());
/*     */         } 
/*     */         
/* 180 */         this.brokenKeyCursor.add(this.cursorRow);
/* 181 */         setResponse("OK");
/* 182 */         if (this.logger.isInfoEnabled()) {
/* 183 */           this.logger.info("do1step: NO BROKEN KEY isBrokenKey " + this.cursorRow.getNumeroRapporto() + " " + this.cursorRow.getCodiceFiscale());
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/* 190 */     } else if (this.cursorRow.getTipoFabbrica().equals("RASBANKGP") || (this.tipoFabbrica != null && this.tipoFabbrica.equals("RASBANKGP"))) {
/* 191 */       if (this.contratto == null) {
/* 192 */         this.contratto = this.cursorRow.getNumeroRapporto();
/* 193 */         if (this.codFiscIntestatarioPrincipale == null) {
/*     */           
/* 195 */           this.codFiscIntestatarioPrincipale = this.cursorRow.getCodiceFiscale();
/*     */         } else {
/*     */           
/* 198 */           this.elencoSoggetti.add(this.cursorRow.getCodiceFiscale());
/*     */         } 
/* 200 */         setResponse("OK");
/* 201 */         this.brokenKeyCursor.add(this.cursorRow);
/*     */         return;
/*     */       } 
/* 204 */       if (this.logger.isInfoEnabled()) {
/* 205 */         this.logger.info("do1step: call isBrokenKey " + this.cursorRow.getNumeroRapporto() + " " + this.cursorRow.getCodiceFiscale());
/*     */       }
/*     */       
/* 208 */       if (isBrokenKey()) {
/* 209 */         if (this.logger.isInfoEnabled()) {
/* 210 */           this.logger.info("do1step: BROKEN KEY isBrokenKey " + this.cursorRow.getNumeroRapporto() + " " + this.cursorRow.getCodiceFiscale());
/*     */         }
/*     */         
/* 213 */         this.tipoFabbrica = this.cursorRow.getTipoFabbrica();
/* 214 */         onBrokenKey();
/* 215 */         this.codFiscIntestatarioPrincipale = this.cursorRow.getCodiceFiscale();
/* 216 */         this.contratto = this.cursorRow.getNumeroRapporto();
/* 217 */         this.elencoSoggetti.clear();
/* 218 */         this.soggCointObj.clear();
/*     */       } else {
/* 220 */         this.contratto = this.cursorRow.getNumeroRapporto();
/* 221 */         if (this.codFiscIntestatarioPrincipale == null) {
/*     */           
/* 223 */           this.codFiscIntestatarioPrincipale = this.cursorRow.getCodiceFiscale();
/*     */         }
/*     */         else {
/*     */           
/* 227 */           this.elencoSoggetti.add(this.cursorRow.getCodiceFiscale());
/*     */         } 
/* 229 */         this.brokenKeyCursor.add(this.cursorRow);
/* 230 */         setResponse("OK");
/* 231 */         if (this.logger.isInfoEnabled()) {
/* 232 */           this.logger.info("do1step: NO BROKEN KEY isBrokenKey " + this.cursorRow.getNumeroRapporto() + " " + this.cursorRow.getCodiceFiscale());
/*     */         }
/*     */         return;
/*     */       } 
/*     */     } 
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
/*     */   public void onBrokenKey() throws RasServiceException {
/* 251 */     setBlockResponse("WARNING");
/* 252 */     MapContainer paramIn1 = new MapContainer();
/* 253 */     MapContainer resultMap1 = null;
/* 254 */     FinSoggetto soggettoObjPrin = new FinSoggetto();
/* 255 */     FinDecodNdgFabbr ndgFabbrPrimo = new FinDecodNdgFabbr();
/*     */     
/* 257 */     this.contrattoRotturaChiave = this.contratto;
/*     */     
/* 259 */     if (this.contrattoRotturaChiave == null) {
/*     */       
/* 261 */       if (this.logger.isErrorEnabled())
/* 262 */         this.logger.error("IL CONTRATTO NON E VALORIZZATO"); 
/* 263 */       messaggio = "CONTRATTO NON VALORIZZATO";
/*     */       
/*     */       return;
/*     */     } 
/* 267 */     this.codFiscIntestatarioP_BreakKey = this.codFiscIntestatarioPrincipale;
/*     */     
/* 269 */     if (this.codFiscIntestatarioP_BreakKey == null) {
/* 270 */       this.contratto = null;
/* 271 */       this.elencoSoggetti.clear();
/* 272 */       this.soggCointObj.clear();
/* 273 */       messaggio = "INTESTATARIO NON VALORIZZATO";
/* 274 */       if (this.logger.isErrorEnabled())
/*     */       {
/* 276 */         this.logger.error("INTESTATARIO PRINCIPALE NON VALORIZZATO");
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 282 */     ndgFabbrPrimo.setFabbrica("GNV");
/* 283 */     ndgFabbrPrimo.setTipo("M");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 288 */     if (this.codFiscIntestatarioP_BreakKey != null) {
/*     */       
/* 290 */       ndgFabbrPrimo.setNdgFab(this.codFiscIntestatarioP_BreakKey);
/* 291 */       paramIn1.putAppl("DECOD_NDG_FABBR", ndgFabbrPrimo);
/* 292 */       resultMap1 = executeService("GetSoggettoCEF", paramIn1);
/*     */     } else {
/* 294 */       messaggio = "CF O PIVA SONO ERRATI";
/* 295 */       if (this.logger.isErrorEnabled()) {
/* 296 */         this.logger.error(messaggio + " Codice Fiscale o Partita Iva non valorizzato");
/*     */       }
/*     */       
/*     */       return;
/*     */     } 
/* 301 */     if (this.logger.isDebugEnabled()) {
/* 302 */       this.logger.debug(this.codFiscIntestatarioP_BreakKey);
/*     */     }
/* 304 */     String risultato1 = (String)resultMap1.getAppl("RESULT");
/*     */     
/* 306 */     if (risultato1.equals("NOT_FOUND")) {
/* 307 */       messaggio = "INTESTATARIO PRINCIPALE NON ESISTE " + this.codFiscIntestatarioP_BreakKey;
/* 308 */       this.elencoSoggetti.clear();
/* 309 */       this.soggCointObj.clear();
/*     */       return;
/*     */     } 
/* 312 */     if (risultato1.equals("TOO_MANY_ROWS")) {
/*     */       
/* 314 */       messaggio = "INTESTATARIO PRINCIPALE PRESENTE PIU VOLTE " + this.codFiscIntestatarioP_BreakKey;
/* 315 */       this.elencoSoggetti.clear();
/* 316 */       this.soggCointObj.clear();
/*     */       
/*     */       return;
/*     */     } 
/* 320 */     soggettoObjPrin = (FinSoggetto)resultMap1.getAppl("SOGGETTO");
/*     */     
/* 322 */     this.soggCointObj.add(soggettoObjPrin);
/* 323 */     if (this.logger.isInfoEnabled()) {
/* 324 */       this.logger.info("il soggetto" + this.codFiscIntestatarioP_BreakKey);
/*     */     }
/* 326 */     Iterator it = this.elencoSoggetti.iterator();
/* 327 */     int k = 1;
/*     */     
/* 329 */     while (it.hasNext()) {
/*     */       
/* 331 */       this.soggettoObjAltri = new FinSoggetto();
/*     */       
/* 333 */       FinDecodNdgFabbr ndgFabbrAltri = new FinDecodNdgFabbr();
/*     */ 
/*     */       
/* 336 */       String codFiscAltroIntestatario = it.next();
/* 337 */       if (codFiscAltroIntestatario == null) {
/* 338 */         this.contratto = null;
/* 339 */         this.elencoSoggetti.clear();
/* 340 */         this.soggCointObj.clear();
/* 341 */         messaggio = "INTESTATARIO NON VALORIZZATO";
/* 342 */         if (this.logger.isErrorEnabled())
/*     */         {
/* 344 */           this.logger.error("INTESTATARIO SECONDARIO NON VALORIZZATO");
/*     */         }
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */       
/* 351 */       MapContainer paramIn2 = new MapContainer();
/*     */ 
/*     */       
/* 354 */       if (codFiscAltroIntestatario != null) {
/*     */         
/* 356 */         ndgFabbrAltri.setFabbrica("GNV");
/* 357 */         ndgFabbrAltri.setTipo("M");
/* 358 */         ndgFabbrAltri.setNdgFab(codFiscAltroIntestatario);
/* 359 */         paramIn2.putAppl("DECOD_NDG_FABBR", ndgFabbrAltri);
/* 360 */         resultMap1 = executeService("GetSoggettoCEF", paramIn2);
/*     */       } else {
/*     */         
/* 363 */         messaggio = "CF O PIVA SONO ERRATI";
/* 364 */         this.elencoSoggetti.clear();
/* 365 */         this.soggCointObj.clear();
/* 366 */         if (this.logger.isErrorEnabled()) {
/* 367 */           this.logger.error(messaggio + "Codice Fiscale o Partita Iva non valorizzato");
/*     */         }
/*     */         return;
/*     */       } 
/* 371 */       String risultato2 = (String)resultMap1.getAppl("RESULT");
/*     */ 
/*     */       
/* 374 */       if (risultato2.equals("NOT_FOUND")) {
/* 375 */         messaggio = "INTESTATARIO SECONDARIO NON ESISTE " + codFiscAltroIntestatario;
/* 376 */         this.elencoSoggetti.clear();
/* 377 */         this.soggCointObj.clear();
/*     */         return;
/*     */       } 
/* 380 */       if (risultato2.equals("TOO_MANY_ROWS")) {
/*     */         
/* 382 */         messaggio = "INTESTATARIO SECONDARIO PRESENTE PIU VOLTE " + codFiscAltroIntestatario;
/* 383 */         this.elencoSoggetti.clear();
/* 384 */         this.soggCointObj.clear();
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */ 
/*     */       
/* 391 */       this.soggettoObjAltri = (FinSoggetto)resultMap1.getAppl("SOGGETTO");
/*     */       
/* 393 */       this.soggCointObj.add(k, this.soggettoObjAltri);
/*     */       
/* 395 */       k++;
/*     */     } 
/*     */     
/* 398 */     MapContainer paramSer = new MapContainer();
/* 399 */     MapContainer resultSer = null;
/*     */     
/* 401 */     paramSer.putAppl("OBJ_COINTESTAZIONE", this.soggCointObj);
/* 402 */     FinSoggetto soggettoMono = new FinSoggetto();
/*     */     
/* 404 */     if (this.logger.isDebugEnabled()) {
/* 405 */       this.logger.debug("Il soggetto-----------" + this.soggettoObjAltri.getCodiceFiscale() + soggettoObjPrin.getCodiceFiscale());
/*     */     }
/*     */     
/* 408 */     if (this.soggCointObj.size() == 1) {
/* 409 */       soggettoMono = this.soggCointObj.get(0);
/* 410 */       paramSer.putAppl("SOGGETTO", soggettoMono);
/* 411 */       paramSer.putAppl("ALLOW_MULTIPLE_ROWS", new Boolean("true"));
/*     */ 
/*     */       
/* 414 */       resultSer = executeService("GetCointestazioneBySoggettoId", paramSer);
/*     */     } else {
/*     */       
/* 417 */       paramSer.putAppl("ALLOW_MULTIPLE_ROWS", new Boolean("true"));
/*     */ 
/*     */ 
/*     */       
/* 421 */       resultSer = executeService("GetCointestazione", paramSer);
/*     */     } 
/* 423 */     String risultatoSer = (String)resultSer.getAppl("RESULT");
/*     */ 
/*     */     
/* 426 */     FinCointestazione cointestazioneOBJ = new FinCointestazione();
/*     */     
/* 428 */     if (risultatoSer.equals("FOUND")) {
/*     */       
/* 430 */       List elencoCointObj = (List)resultSer.getAppl("ELENCO_COINT_OBJ");
/* 431 */       int size = elencoCointObj.size();
/* 432 */       String tipo = ((FinCointestazione)elencoCointObj.get(0)).getTipo();
/* 433 */       cointestazioneOBJ = elencoCointObj.get(0);
/* 434 */       for (int i = 0; i < size; i++) {
/* 435 */         tipo = ((FinCointestazione)elencoCointObj.get(i)).getTipo();
/* 436 */         if (tipo.equals("M") || tipo.equals("S")) {
/* 437 */           cointestazioneOBJ = elencoCointObj.get(i);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 445 */       messaggio = "COINTESTAZIONE GIA PRESENTE ";
/* 446 */     } else if (risultatoSer.equals("NOT_FOUND")) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 451 */       paramSer.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/* 452 */       if (this.soggCointObj.size() == 1) {
/* 453 */         paramSer.putAppl("SOGGETTO", this.soggCointObj.get(0));
/*     */       } else {
/*     */         
/* 456 */         paramSer.putAppl("SOGGETTI", this.soggCointObj);
/*     */       } 
/*     */       
/* 459 */       resultSer = executeService("InsCointestazione", paramSer);
/* 460 */       if (this.soggCointObj.size() == 1) {
/* 461 */         cointestazioneOBJ = (FinCointestazione)resultSer.getAppl("COINTESTAZIONE");
/*     */         
/* 463 */         this.elencoSoggetti.clear();
/* 464 */         this.soggCointObj.clear();
/*     */       } else {
/*     */         
/* 467 */         cointestazioneOBJ = (FinCointestazione)resultSer.getAppl("COINTESTAZIONE");
/*     */         
/* 469 */         this.elencoSoggetti.clear();
/* 470 */         this.soggCointObj.clear();
/*     */       }
/*     */     
/*     */     }
/* 474 */     else if (risultatoSer.equals("TOO_MANY_ROWS")) {
/*     */       
/* 476 */       if (this.logger.isErrorEnabled()) {
/* 477 */         this.logger.error("La stessa cointestazione è presente due volte nella FinCointestazione---soggcoin:" + this.soggCoin);
/*     */       }
/* 479 */       messaggio = "STESSA COINTESTAZIONE PRESENTE PIU VOLTE";
/*     */       
/*     */       return;
/*     */     } 
/* 483 */     MapContainer param = new MapContainer();
/* 484 */     MapContainer resultMap = null;
/*     */     
/* 486 */     this.contrattoObj.setNumContratto(this.contrattoRotturaChiave);
/*     */     
/* 488 */     FinInterfaccia interfacciaOBJ = new FinInterfaccia();
/*     */     
/* 490 */     if (this.tipoFabbrica.equals("RASBANKGP")) {
/*     */       
/* 492 */       interfacciaOBJ.setInterfaccia("RASBANK");
/*     */     } else {
/* 494 */       interfacciaOBJ.setInterfaccia("RAM");
/*     */     } 
/* 496 */     param.putAppl("DETTAGLIO", this.contrattoObj);
/* 497 */     param.putAppl("INTERFACCIA", interfacciaOBJ);
/*     */     
/* 499 */     resultMap = executeService("GetContrattoByNumContrattoCodInterfacciaSRV", param);
/*     */ 
/*     */     
/* 502 */     String risultato = resultMap.getAppl("RESULT").toString();
/* 503 */     if (risultato.equals("FOUND")) {
/* 504 */       this.contrattoPresente = true;
/* 505 */       this.contrattoObj = (FinGP)resultMap.getAppl("CONTRATTO");
/*     */     } else {
/*     */       
/* 508 */       this.contrattoPresente = false;
/*     */     } 
/*     */     
/* 511 */     MapContainer resultMap5 = null;
/*     */     
/* 513 */     if (!this.contrattoPresente) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 518 */       if (this.tipoFabbrica.equals("GPINVEST")) {
/* 519 */         FlxGpramSquadra flxSquadraObj = new FlxGpramSquadra();
/*     */         
/* 521 */         flxSquadraObj.setUtenteInserimento("Batch Cointestazione GP");
/*     */         
/* 523 */         MapContainer paramAggContratto = new MapContainer();
/* 524 */         paramAggContratto.putAppl("SQUADRAOBJ", flxSquadraObj);
/* 525 */         paramAggContratto.putAppl("SOGGETOBJ", soggettoObjPrin);
/* 526 */         paramAggContratto.putAppl("CONTRATTOOBJ", this.contrattoObj);
/* 527 */         paramAggContratto.putAppl("COINTOBJ", cointestazioneOBJ);
/*     */ 
/*     */         
/* 530 */         resultMap5 = executeService("GetGpramSquadra", paramAggContratto);
/* 531 */         String risultato5 = (String)resultMap5.getAppl("RESULT");
/*     */         
/* 533 */         if (risultato5.equals("NOT_FOUND")) {
/* 534 */           paramAggContratto.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/*     */           
/* 536 */           executeService("InsGpramSquadra", paramAggContratto);
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 541 */           MapContainer paramAggFlx = new MapContainer();
/*     */           
/* 543 */           flxSquadraObj = (FlxGpramSquadra)resultMap5.getAppl("SQUADRAOBJ");
/*     */           
/* 545 */           if (flxSquadraObj.getSoggetto().getSoggettoId().intValue() != soggettoObjPrin.getSoggettoId().intValue())
/*     */           {
/* 547 */             flxSquadraObj.setSoggetto(soggettoObjPrin);
/*     */           }
/* 549 */           paramAggFlx.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/* 550 */           paramAggFlx.putAppl("SQUADRAROW", flxSquadraObj);
/* 551 */           executeService("UpdGpramSquadra", paramAggFlx);
/*     */         }
/*     */       
/*     */       }
/* 555 */       else if (this.tipoFabbrica.equals("RASBANKGP")) {
/* 556 */         FlxRasBankGpSquadra flxSquadraObj = new FlxRasBankGpSquadra();
/*     */         
/* 558 */         flxSquadraObj.setUtenteInserimento("BATCH_COINTESTAZIONE_GP");
/*     */ 
/*     */         
/* 561 */         MapContainer paramAggContratto = new MapContainer();
/* 562 */         paramAggContratto.putAppl("SQUADRAOBJ", flxSquadraObj);
/* 563 */         paramAggContratto.putAppl("SOGGETOBJ", soggettoObjPrin);
/* 564 */         paramAggContratto.putAppl("CONTRATTOOBJ", this.contrattoObj);
/* 565 */         paramAggContratto.putAppl("COINTOBJ", cointestazioneOBJ);
/*     */         
/* 567 */         setBlockResponse("WARNING");
/*     */         
/* 569 */         resultMap5 = executeService("GetRasBankGpSquadra", paramAggContratto);
/*     */         
/* 571 */         String risultato5 = (String)resultMap5.getAppl("RESULT");
/*     */         
/* 573 */         if (risultato5.equals("NOT_FOUND")) {
/* 574 */           paramAggContratto.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/*     */           
/* 576 */           executeService("InsRasBankGpSquadra", paramAggContratto);
/* 577 */           risultato5 = "INSERTED";
/*     */         }
/*     */         else {
/*     */           
/* 581 */           MapContainer paramAggFlx = new MapContainer();
/*     */           
/* 583 */           System.out.println(this.contrattoRotturaChiave);
/* 584 */           flxSquadraObj = (FlxRasBankGpSquadra)resultMap5.getAppl("SQUADRAOBJ");
/*     */ 
/*     */           
/* 587 */           System.out.println("1");
/* 588 */           if (flxSquadraObj.getSoggetto().getSoggettoId().intValue() != soggettoObjPrin.getSoggettoId().intValue())
/*     */           {
/* 590 */             flxSquadraObj.setSoggetto(soggettoObjPrin);
/*     */           }
/*     */           
/* 593 */           paramAggFlx.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/*     */           
/* 595 */           paramAggFlx.putAppl("SQUADRAROW", flxSquadraObj);
/* 596 */           executeService("UpdRasBankGpSquadra", paramAggFlx);
/* 597 */           risultato5 = "UPDATED";
/*     */         }
/*     */       
/*     */       }
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 605 */       MapContainer paramAggContratto = new MapContainer();
/*     */       
/* 607 */       ArchUtils.setStdFields(this.contrattoObj, "U", "BATCH_COINTESTAZIONE_GP");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 612 */       this.contrattoObj.setSoggetto(soggettoObjPrin);
/* 613 */       this.contrattoObj.setCointestazione(cointestazioneOBJ);
/* 614 */       paramAggContratto.putAppl("DETTAGLIO", this.contrattoObj);
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
/* 625 */       if (this.tipoFabbrica.equals("GPINVEST")) {
/* 626 */         FlxGpramSquadra flxSquadraObj = new FlxGpramSquadra();
/*     */         
/* 628 */         flxSquadraObj.setUtenteInserimento("Batch Cointestazione GP");
/*     */         
/* 630 */         MapContainer paramAggSQ = new MapContainer();
/* 631 */         paramAggSQ.putAppl("SQUADRAOBJ", flxSquadraObj);
/* 632 */         paramAggSQ.putAppl("SOGGETOBJ", soggettoObjPrin);
/* 633 */         paramAggSQ.putAppl("CONTRATTOOBJ", this.contrattoObj);
/* 634 */         paramAggSQ.putAppl("COINTOBJ", cointestazioneOBJ);
/*     */ 
/*     */         
/* 637 */         resultMap5 = executeService("GetGpramSquadra", paramAggSQ);
/* 638 */         String risultato5 = (String)resultMap5.getAppl("RESULT");
/*     */         
/* 640 */         if (risultato5.equals("NOT_FOUND")) {
/* 641 */           paramAggSQ.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/*     */           
/* 643 */           executeService("InsGpramSquadra", paramAggSQ);
/*     */         
/*     */         }
/*     */         else {
/*     */           
/* 648 */           MapContainer paramAggFlx = new MapContainer();
/*     */           
/* 650 */           flxSquadraObj = (FlxGpramSquadra)resultMap5.getAppl("SQUADRAOBJ");
/*     */           
/* 652 */           flxSquadraObj.setCointestazione(cointestazioneOBJ);
/* 653 */           if (flxSquadraObj.getSoggetto().getSoggettoId().intValue() != soggettoObjPrin.getSoggettoId().intValue())
/*     */           {
/* 655 */             flxSquadraObj.setSoggetto(soggettoObjPrin);
/*     */           }
/* 657 */           paramAggFlx.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/* 658 */           paramAggFlx.putAppl("SQUADRAROW", flxSquadraObj);
/* 659 */           executeService("UpdGpramSquadra", paramAggFlx);
/*     */         }
/*     */       
/*     */       }
/* 663 */       else if (this.tipoFabbrica.equals("RASBANKGP")) {
/* 664 */         FlxRasBankGpSquadra flxSquadraObj = new FlxRasBankGpSquadra();
/*     */         
/* 666 */         flxSquadraObj.setUtenteInserimento("BATCH_COINTESTAZIONE_GP");
/*     */ 
/*     */         
/* 669 */         MapContainer paramAggSQ = new MapContainer();
/* 670 */         paramAggSQ.putAppl("SQUADRAOBJ", flxSquadraObj);
/* 671 */         paramAggSQ.putAppl("SOGGETOBJ", soggettoObjPrin);
/* 672 */         paramAggSQ.putAppl("CONTRATTOOBJ", this.contrattoObj);
/* 673 */         paramAggSQ.putAppl("COINTOBJ", cointestazioneOBJ);
/*     */         
/* 675 */         setBlockResponse("WARNING");
/*     */         
/* 677 */         resultMap5 = executeService("GetRasBankGpSquadra", paramAggSQ);
/*     */         
/* 679 */         String risultato5 = (String)resultMap5.getAppl("RESULT");
/*     */         
/* 681 */         if (risultato5.equals("NOT_FOUND")) {
/* 682 */           paramAggSQ.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/*     */           
/* 684 */           executeService("InsRasBankGpSquadra", paramAggSQ);
/* 685 */           risultato5 = "INSERTED";
/*     */         }
/*     */         else {
/*     */           
/* 689 */           MapContainer paramAggFlx = new MapContainer();
/*     */ 
/*     */           
/* 692 */           flxSquadraObj = (FlxRasBankGpSquadra)resultMap5.getAppl("SQUADRAOBJ");
/*     */           
/* 694 */           flxSquadraObj.setCointestazione(cointestazioneOBJ);
/*     */ 
/*     */           
/* 697 */           if (flxSquadraObj.getSoggetto().getSoggettoId().intValue() != soggettoObjPrin.getSoggettoId().intValue())
/*     */           {
/* 699 */             flxSquadraObj.setSoggetto(soggettoObjPrin);
/*     */           }
/*     */           
/* 702 */           paramAggFlx.putAppl("NOME_BATCH", "BATCH_COINTESTAZIONE_GP");
/*     */           
/* 704 */           paramAggFlx.putAppl("SQUADRAROW", flxSquadraObj);
/* 705 */           executeService("UpdRasBankGpSquadra", paramAggFlx);
/* 706 */           risultato5 = "UPDATED";
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 716 */       executeService("UpdateIntestContrattoSRV", paramAggContratto);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 721 */     this.elencoSoggetti.clear();
/* 722 */     this.soggCointObj.clear();
/* 723 */     setBlockResponse("OK");
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
/*     */   public void setBlockProcessedKO() throws RasServiceException {
/* 739 */     MapContainer InputParam = new MapContainer();
/*     */     
/* 741 */     String esito = "KO";
/* 742 */     String errore = getMessaggio(messaggio);
/*     */ 
/*     */     
/* 745 */     FlxInvestitoriCointestazione temporaryFlx = new FlxInvestitoriCointestazione();
/* 746 */     List brokenKeyCursorUpd = new ArrayList();
/*     */     
/* 748 */     Iterator brokenKeyCursorIte = this.brokenKeyCursor.iterator();
/*     */ 
/*     */     
/* 751 */     while (brokenKeyCursorIte.hasNext()) {
/*     */       
/* 753 */       temporaryFlx = brokenKeyCursorIte.next();
/*     */ 
/*     */ 
/*     */       
/* 757 */       temporaryFlx.setDescrizioneErrore(errore);
/* 758 */       temporaryFlx.setStatoElaborazione(esito);
/* 759 */       temporaryFlx.setDataElab(new Date());
/* 760 */       brokenKeyCursorUpd.add(temporaryFlx);
/*     */     } 
/*     */     
/* 763 */     InputParam.putAppl("ESITO", esito);
/* 764 */     InputParam.putAppl("LISTA", brokenKeyCursorUpd);
/*     */     
/* 766 */     executeService("UpdateFlxCointestazione", InputParam);
/* 767 */     this.brokenKeyCursor.clear();
/* 768 */     brokenKeyCursorUpd.clear();
/* 769 */     this.brokenKeyCursor.add(this.cursorRow);
/* 770 */     messaggio = "";
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
/*     */   public void setBlockProcessedOK() throws RasServiceException {
/* 783 */     MapContainer InputParam = new MapContainer();
/*     */     
/* 785 */     String esito = "OK";
/*     */     
/* 787 */     FlxInvestitoriCointestazione temporaryFlx = new FlxInvestitoriCointestazione();
/* 788 */     List brokenKeyCursorUpd = new ArrayList();
/*     */ 
/*     */ 
/*     */     
/* 792 */     String warning = getMessaggio(messaggio);
/*     */     
/* 794 */     Iterator brokenKeyCursorIte = this.brokenKeyCursor.iterator();
/*     */ 
/*     */     
/* 797 */     while (brokenKeyCursorIte.hasNext()) {
/*     */ 
/*     */       
/* 800 */       temporaryFlx = brokenKeyCursorIte.next();
/*     */       
/* 802 */       temporaryFlx.setDescrizioneErrore(warning);
/* 803 */       temporaryFlx.setDataElab(new Date());
/* 804 */       temporaryFlx.setStatoElaborazione(esito);
/* 805 */       brokenKeyCursorUpd.add(temporaryFlx);
/*     */     } 
/*     */     
/* 808 */     InputParam.putAppl("ESITO", esito);
/* 809 */     InputParam.putAppl("LISTA", brokenKeyCursorUpd);
/*     */     
/* 811 */     executeService("UpdateFlxCointestazione", InputParam);
/* 812 */     brokenKeyCursorUpd.clear();
/* 813 */     this.brokenKeyCursor.clear();
/* 814 */     this.brokenKeyCursor.add(this.cursorRow);
/* 815 */     messaggio = "";
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMessaggio(String messaggio) {
/* 821 */     String tmp = messaggio;
/* 822 */     messaggio = "";
/* 823 */     return tmp;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\GetCointestazioniGenBL.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */