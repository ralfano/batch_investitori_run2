/*     */ package it.ras.arco.batch.investitori.businesslogic;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxInvestitoriAnagCliente;
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*     */ import it.ras.arco.bean.FinDocumento;
/*     */ import it.ras.arco.bean.FinIndirizzo;
/*     */ import it.ras.arco.bean.FinNazioniUic;
/*     */ import it.ras.arco.bean.FinRecapito;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.arco.bean.FinSoggettoIndir;
/*     */ import it.ras.arco.bean.FinSoggettoPrivacy;
/*     */ import it.ras.arco.service.ContrattoManagerSRV;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*     */ import it.ras.flag.config.CodesTableManager;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
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
/*     */ public class GetFlxAnagraficaClienteBL
/*     */   extends BusinessLogicObject
/*     */ {
/*  52 */   Log logger = LogFactory.getLog(getClass());
/*     */   
/*  54 */   private FlxInvestitoriAnagCliente cursorRow = null;
/*     */   
/*  56 */   private FinDocumento documento = null;
/*     */   
/*  58 */   private FinSoggetto soggetto = null;
/*     */ 
/*     */   
/*  61 */   private FinRecapito recapito = null;
/*     */   
/*  63 */   private FinSoggettoIndir soggettoIndirizzoFis = null;
/*     */   
/*  65 */   private FinSoggettoIndir soggettoIndirizzoRes = null;
/*     */   
/*  67 */   private FinIndirizzo indirizzoFisc = null;
/*     */   
/*  69 */   private FinIndirizzo indirizzo = null;
/*     */   
/*  71 */   private FinSoggettoPrivacy privacy = null;
/*  72 */   private FinCointestazione cointestazione = null;
/*     */   
/*  74 */   private String Uic = "UIC NON TROVATO";
/*  75 */   private String dati = "INIZIALIZZAZIONE FALLITA";
/*  76 */   private String tel = "NESSUN TELEFONO VALORIZZATO";
/*     */   
/*  78 */   private String err = "ERRORE NELLA NORMALIZZAZIONE";
/*  79 */   private String sogg = "SOGGETTO GIA PRESENTE";
/*     */   
/*     */   private static final String RESIDENZA = "RES";
/*     */   
/*     */   private static final String FISCALE = "FIS";
/*     */   
/*     */   private static final String batchName = "BatchAnagraficaClienteInvestitori";
/*     */   
/*     */   private static final String BATCH_NAME = "BATCH_NAME";
/*     */   
/*     */   private static final String DOMINATO = "DOMINATO";
/*     */   private static final String PROV_DATI_ANAG = "PROV_DATI_ANAG";
/*     */   private static final String GPRAM = "GPRAM";
/*     */   private static final String GP_INVESTITORI = "GNV";
/*     */   private static final String ITALIA = "086";
/*  94 */   private Log log = LogFactory.getLog(ContrattoManagerSRV.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private CodesTableManager codesTableManager;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 108 */     this.codesTableManager = codesTableManager;
/*     */   }
/*     */   
/*     */   public CodesTableManager getCodesTableManager() {
/* 112 */     return this.codesTableManager;
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
/*     */   public boolean setIndirizzoResidenza(Object row) throws RasServiceException {
/* 127 */     this.cursorRow = (FlxInvestitoriAnagCliente)row;
/* 128 */     this.indirizzo = new FinIndirizzo();
/* 129 */     this.indirizzo.setIndirizzo(this.cursorRow.getIndirizzoDiResidenza());
/*     */     
/* 131 */     if (this.cursorRow.getCap() != null) {
/* 132 */       this.indirizzo.setCap(this.cursorRow.getCap());
/*     */     }
/* 134 */     this.indirizzo.setLocalita(this.cursorRow.getComuneDiResidenza());
/* 135 */     this.indirizzo.setComune(this.cursorRow.getComuneDiResidenza());
/* 136 */     this.indirizzo.setProv(this.cursorRow.getProvinciaDiResidenza());
/* 137 */     FinNazioniUic nazione = new FinNazioniUic();
/*     */     
/* 139 */     if (this.cursorRow.getNazioneDiResidenza() != null) {
/*     */ 
/*     */       
/* 142 */       nazione.setCodiceIso(this.cursorRow.getNazioneDiResidenza().substring(0, 2));
/* 143 */       MapContainer map = GetNazioneByCodIso(nazione);
/* 144 */       String risultato = (String)map.getAppl("RESULT");
/* 145 */       if (!risultato.equals("FOUND")) {
/* 146 */         this.cursorRow.setDescrizioneErrore(this.Uic);
/* 147 */         if (this.log.isWarnEnabled()) {
/* 148 */           this.log.warn("Non ho trovato l uic corrispondente o ce ne sono molti");
/*     */         }
/* 150 */         this.indirizzo.setNazione("799");
/*     */       } else {
/*     */         
/* 153 */         nazione = (FinNazioniUic)map.getAppl("NAZIONE");
/* 154 */         this.indirizzo.setNazione(nazione.getCodiceUic());
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 159 */     else if (null == this.cursorRow.getProvinciaDiResidenza() && (this.cursorRow.getCap() != null || this.cursorRow.getComuneDiResidenza() != null || this.cursorRow.getIndirizzoDiResidenza() != null)) {
/* 160 */       this.indirizzo.setNazione("799");
/*     */     }
/*     */     else {
/*     */       
/* 164 */       this.indirizzo.setNazione("086");
/*     */     } 
/*     */ 
/*     */     
/* 168 */     if ((this.cursorRow.getIndirizzoDiResidenza() != null || this.cursorRow.getCap() != null || this.cursorRow.getComuneDiResidenza() != null || this.cursorRow.getProvinciaDiResidenza() != null) && (!this.cursorRow.getIndirizzoDiResidenza().equals("") || !this.cursorRow.getCap().equals("") || !this.cursorRow.getComuneDiResidenza().equals("") || !this.cursorRow.getProvinciaDiResidenza().equals(""))) {
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
/* 179 */       this.indirizzo.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 180 */       this.indirizzo.setDataInserimento(new Date());
/* 181 */       this.indirizzo.setTipoIndirizzo("RES");
/* 182 */       ArchUtils.setStdFields(this.indirizzo, "I", "BatchAnagraficaClienteInvestitori");
/*     */ 
/*     */       
/* 185 */       return true;
/*     */     } 
/* 187 */     return false;
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
/*     */   public boolean setIndirizzoFiscale(Object row) throws RasServiceException {
/* 201 */     this.cursorRow = (FlxInvestitoriAnagCliente)row;
/* 202 */     this.indirizzoFisc = new FinIndirizzo();
/* 203 */     this.indirizzoFisc.setIndirizzo(this.cursorRow.getIndirizzoFiscale());
/* 204 */     if (this.cursorRow.getCapIndirizzoFiscale() != null) {
/* 205 */       this.indirizzoFisc.setCap(this.cursorRow.getCapIndirizzoFiscale());
/*     */     }
/* 207 */     this.indirizzoFisc.setLocalita(this.cursorRow.getLocalitaIndirizzoFiscale());
/* 208 */     this.indirizzoFisc.setComune(this.cursorRow.getLocalitaIndirizzoFiscale());
/* 209 */     this.indirizzoFisc.setProv(this.cursorRow.getProvinciaIndirizzoFisca());
/* 210 */     if ((this.cursorRow.getIndirizzoFiscale() != null || this.cursorRow.getCapIndirizzoFiscale() != null || this.cursorRow.getLocalitaIndirizzoFiscale() != null || this.cursorRow.getProvinciaIndirizzoFisca() != null) && (!this.cursorRow.getIndirizzoFiscale().equals("") || !this.cursorRow.getCapIndirizzoFiscale().equals("") || !this.cursorRow.getLocalitaIndirizzoFiscale().equals("") || !this.cursorRow.getProvinciaIndirizzoFisca().equals(""))) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 219 */       FinNazioniUic nazione = new FinNazioniUic();
/* 220 */       if (this.cursorRow.getNazioneDiResidenza() != null) {
/*     */ 
/*     */         
/* 223 */         nazione.setCodiceIso(this.cursorRow.getNazioneDiResidenza().substring(0, 2));
/* 224 */         MapContainer map = GetNazioneByCodIso(nazione);
/* 225 */         String risultato = (String)map.getAppl("RESULT");
/* 226 */         if (!risultato.equals("FOUND")) {
/* 227 */           this.cursorRow.setDescrizioneErrore(this.Uic);
/* 228 */           if (this.log.isWarnEnabled()) {
/* 229 */             this.log.warn("Non ho trovato l uic corrispondente o ce ne sono molti");
/*     */           }
/* 231 */           this.indirizzoFisc.setNazione("799");
/*     */         } else {
/*     */           
/* 234 */           nazione = (FinNazioniUic)map.getAppl("NAZIONE");
/* 235 */           this.indirizzoFisc.setNazione(nazione.getCodiceUic());
/*     */         }
/*     */       
/*     */       }
/* 239 */       else if (null == this.cursorRow.getProvinciaIndirizzoFisca() && (this.cursorRow.getCapIndirizzoFiscale() != null || this.cursorRow.getIndirizzoFiscale() != null)) {
/* 240 */         this.indirizzoFisc.setNazione("799");
/*     */       } else {
/*     */         
/* 243 */         this.indirizzoFisc.setNazione("086");
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 248 */       this.indirizzoFisc.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 249 */       this.indirizzoFisc.setDataInserimento(new Date());
/* 250 */       this.indirizzoFisc.setTipoIndirizzo("FIS");
/* 251 */       ArchUtils.setStdFields(this.indirizzoFisc, "I", "BatchAnagraficaClienteInvestitori");
/*     */ 
/*     */       
/* 254 */       return true;
/*     */     } 
/* 256 */     return false;
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
/*     */   public boolean setSoggetto(Object row) throws RasServiceException {
/* 271 */     this.cursorRow = (FlxInvestitoriAnagCliente)row;
/* 272 */     this.soggetto = new FinSoggetto();
/*     */     
/* 274 */     if (this.cursorRow.getCodiceFiscale() == null && this.cursorRow.getPartitaIva() == null) {
/* 275 */       return false;
/*     */     }
/* 277 */     if (this.cursorRow.getPartitaIva() == null) {
/*     */       
/* 279 */       if (this.cursorRow.getTipo() == null)
/*     */       {
/* 281 */         return false;
/*     */       }
/* 283 */       if (this.cursorRow.getTipo().equals("P"))
/*     */       {
/* 285 */         this.soggetto.setTipoSogg("F");
/*     */       }
/* 287 */       this.soggetto.setCodiceFiscale(this.cursorRow.getCodiceFiscale());
/*     */     
/*     */     }
/* 290 */     else if (this.cursorRow.getPartitaIva() != null) {
/*     */       
/* 292 */       this.soggetto.setPartitaIva(this.cursorRow.getPartitaIva().substring(2));
/* 293 */       if (this.cursorRow.getTipo() == null)
/*     */       {
/* 295 */         return false;
/*     */       }
/* 297 */       if (this.cursorRow.getTipo().equals("G")) {
/*     */         
/* 299 */         this.soggetto.setTipoSogg(this.cursorRow.getTipo());
/* 300 */       } else if (this.cursorRow.getTipo().equals("P")) {
/*     */         
/* 302 */         this.soggetto.setTipoSogg("F");
/*     */       } else {
/* 304 */         this.soggetto.setTipoSogg(this.cursorRow.getTipo());
/*     */       } 
/*     */       
/* 307 */       if (this.cursorRow.getCodiceFiscale() != null) {
/* 308 */         this.soggetto.setCodiceFiscale(this.cursorRow.getCodiceFiscale());
/*     */       }
/*     */     }
/*     */     else {
/*     */       
/* 313 */       return false;
/*     */     } 
/* 315 */     this.soggetto.setDataNascita(this.cursorRow.getDataDiNascita());
/*     */     
/* 317 */     this.soggetto.setCapitaleSoc(this.cursorRow.getCapitaleSociale());
/*     */ 
/*     */     
/* 320 */     FinNazioniUic nazione = new FinNazioniUic();
/*     */     
/* 322 */     if (this.cursorRow.getCittadinanza() != null) {
/*     */       
/* 324 */       nazione.setCodiceIso(this.cursorRow.getCittadinanza().substring(0, 2));
/* 325 */       MapContainer map = GetNazioneByCodIso(nazione);
/* 326 */       String risultato = (String)map.getAppl("RESULT");
/* 327 */       if (!risultato.equals("FOUND")) {
/*     */         
/* 329 */         this.cursorRow.setDescrizioneErrore(this.Uic);
/* 330 */         if (this.log.isWarnEnabled()) {
/* 331 */           this.log.warn("Non ho trovato l uic corrispondente o ce ne sono molti");
/*     */         }
/*     */       } else {
/* 334 */         nazione = (FinNazioniUic)map.getAppl("NAZIONE");
/* 335 */         this.soggetto.setCittadinanza(this.cursorRow.getCittadinanza());
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 342 */     if (this.cursorRow.getCognome() != null)
/*     */     {
/* 344 */       this.soggetto.setCognome(this.cursorRow.getCognome());
/*     */     }
/* 346 */     this.soggetto.setComuneNascita(this.cursorRow.getLuogoDiNascita());
/*     */     
/* 348 */     this.soggetto.setDataNascita(this.cursorRow.getDataDiNascita());
/*     */     
/* 350 */     this.soggetto.setTitoloStudioBatch(this.cursorRow.getTitoloDiStudio());
/* 351 */     if (this.cursorRow.getNome() != null)
/*     */     {
/* 353 */       this.soggetto.setNome(this.cursorRow.getNome());
/*     */     }
/*     */ 
/*     */     
/* 357 */     this.soggetto.setNumCCIAA(this.cursorRow.getnIscrizioneCciaa());
/* 358 */     this.soggetto.setAttivita(this.cursorRow.getRae());
/* 359 */     this.soggetto.setSettore(this.cursorRow.getSae());
/* 360 */     this.soggetto.setProvNascita(this.cursorRow.getProvinciaDiNascita());
/* 361 */     nazione = new FinNazioniUic();
/*     */     
/* 363 */     if (this.cursorRow.getStatoDiNascita() != null) {
/*     */       
/* 365 */       nazione.setCodiceIso(this.cursorRow.getStatoDiNascita().substring(0, 2));
/* 366 */       MapContainer map = GetNazioneByCodIso(nazione);
/* 367 */       String risultato = (String)map.getAppl("RESULT");
/* 368 */       if (!risultato.equals("FOUND")) {
/*     */         
/* 370 */         this.cursorRow.setDescrizioneErrore(this.Uic);
/* 371 */         if (this.log.isWarnEnabled()) {
/* 372 */           this.log.warn("Non ho trovato l uic corrispondente o ce ne sono molti");
/*     */         }
/*     */       } else {
/* 375 */         nazione = (FinNazioniUic)map.getAppl("NAZIONE");
/* 376 */         this.soggetto.setNazNascita(nazione.getCodiceUic());
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 381 */     this.soggetto.setSesso(this.cursorRow.getSesso());
/*     */     
/* 383 */     this.soggetto.setProvDatiAnag("GPRAM");
/* 384 */     this.soggetto.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 385 */     this.soggetto.setDataInserimento(new Date());
/* 386 */     ArchUtils.setStdFields(this.soggetto, "I", "BatchAnagraficaClienteInvestitori");
/*     */ 
/*     */     
/* 389 */     return true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void doOneStep(Object row) throws RasServiceException {
/* 413 */     FinDecodNdgFabbr ndgFabbr = new FinDecodNdgFabbr();
/* 414 */     Boolean flagIndirizzo = new Boolean(false);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 419 */     boolean flagCf = true;
/*     */     
/* 421 */     String risultato = null;
/*     */     
/* 423 */     MapContainer param = new MapContainer();
/*     */ 
/*     */     
/* 426 */     MapContainer result = null;
/*     */     
/* 428 */     boolean ficInd = true;
/*     */     try {
/* 430 */       flagCf = setSoggetto(row);
/* 431 */       ficInd = setIndirizzoFiscale(row);
/* 432 */       flagIndirizzo = new Boolean(setIndirizzoResidenza(row));
/*     */     }
/* 434 */     catch (Exception e) {
/* 435 */       this.cursorRow.setDataElab(new Date());
/* 436 */       this.cursorRow.setDescrizioneErrore(this.dati);
/* 437 */       this.logger.error(e.getMessage());
/* 438 */       throw new RasServiceException("do1step:inizializzazione dati");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 444 */     if (this.cursorRow.getNome() != null && this.cursorRow.getCognome() != null) {
/*     */       
/* 446 */       this.soggetto.setDenominazione(this.cursorRow.getCognome() + " " + this.cursorRow.getNome());
/* 447 */     } else if (this.cursorRow.getCognome() == null && this.cursorRow.getNome() != null) {
/*     */       
/* 449 */       this.soggetto.setDenominazione(this.cursorRow.getNome());
/* 450 */     } else if (this.cursorRow.getNome() == null && this.cursorRow.getCognome() != null) {
/*     */       
/* 452 */       this.soggetto.setDenominazione(this.cursorRow.getCognome());
/*     */     } else {
/*     */       
/* 455 */       this.cursorRow.setDataElab(new Date());
/* 456 */       this.cursorRow.setDescrizioneErrore("COGNOME E NOME NON VALORIZZATI");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 461 */     if (this.cursorRow.getPartitaIva() == null && this.cursorRow.getTipo() != null && this.cursorRow.getTipo().equals("G")) {
/* 462 */       this.cursorRow.setDataElab(new Date());
/* 463 */       this.cursorRow.setDescrizioneErrore("PARTITA_IVA E TIPO SOGG NON COERENTI");
/* 464 */       setResponse("WARNING");
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/* 471 */     ndgFabbr.setFabbrica("GNV");
/* 472 */     ndgFabbr.setTipo("M");
/* 473 */     if (this.soggetto.getTipoSogg() != null && this.soggetto.getTipoSogg().equals("F")) {
/* 474 */       ndgFabbr.setNdgFab(this.soggetto.getCodiceFiscale());
/* 475 */     } else if (this.soggetto.getTipoSogg() != null && this.soggetto.getTipoSogg().equals("G")) {
/* 476 */       ndgFabbr.setNdgFab(this.soggetto.getPartitaIva());
/*     */     } 
/* 478 */     ndgFabbr.setSoggetto(this.soggetto);
/* 479 */     ndgFabbr.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 480 */     ndgFabbr.setDataInserimento(new Date());
/* 481 */     ArchUtils.setStdFields(ndgFabbr, "I", "BatchAnagraficaClienteInvestitori");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 486 */     param.putAppl("SOGGETTO", this.soggetto);
/* 487 */     param.putAppl("NOME_BATCH", "BatchAnagraficaClienteInvestitori");
/* 488 */     param.putAppl("DECOD_NDG_FABBR", ndgFabbr);
/*     */     
/* 490 */     result = executeService("CensimentoSoggetto", param);
/*     */ 
/*     */     
/* 493 */     if (((String)result.getAppl("RESULT")).equals("GENERIC ERROR")) {
/*     */ 
/*     */       
/* 496 */       if (this.logger.isErrorEnabled()) {
/* 497 */         this.logger.error("Il soggetto " + this.cursorRow.getCodiceFiscale() + " non è stato deduplicato correttamente");
/*     */       }
/* 499 */       this.cursorRow.setDescrizioneErrore("Errore nella deduplica dei dati");
/* 500 */       this.cursorRow.setDataElab(new Date());
/* 501 */       setResponse("WARNING"); return;
/*     */     } 
/* 503 */     if (((String)result.getAppl("RESULT")).equals("NOT_EXECUTED")) {
/* 504 */       if (this.logger.isErrorEnabled())
/* 505 */         this.logger.error("Il soggetto " + this.cursorRow.getCodiceFiscale() + " non è stato normalizzato correttamente"); 
/* 506 */       if (result.getAppl("ERROR_NAME") != null) {
/*     */         
/* 508 */         String erroreName = result.getAppl("ERROR_NAME").toString();
/* 509 */         String erroreCf = result.getAppl("ERROR_CF").toString();
/* 510 */         String errorePiva = result.getAppl("ERROR_PIVA").toString();
/* 511 */         this.cursorRow.setDescrizioneErrore("Errore nella normalizzazione: NAME :" + erroreName + " " + "CF :" + erroreCf + " " + "PIVA :" + errorePiva);
/*     */       }
/* 513 */       else if (result.getAppl("ERROR_STREET") != null) {
/*     */         
/* 515 */         String erroreStreet = result.getAppl("ERROR_STREET").toString();
/* 516 */         String errorePlace = result.getAppl("ERROR_PLACE").toString();
/*     */ 
/*     */         
/* 519 */         this.cursorRow.setDescrizioneErrore("Errore nella normalizzazione indirizzo: ERROR_STREET  " + erroreStreet + " " + "ERROR_PLACE: " + errorePlace);
/*     */       } 
/*     */       
/* 522 */       this.cursorRow.setDataElab(new Date());
/* 523 */       result = executeService("DeduplicaSoggetto", param);
/* 524 */       if (((String)result.getAppl("RESULT")).equals("GENERIC ERROR")) {
/*     */ 
/*     */         
/* 527 */         if (this.logger.isErrorEnabled()) {
/* 528 */           this.logger.error("Il soggetto " + this.cursorRow.getCodiceFiscale() + " non è stato deduplicato correttamente");
/*     */         }
/* 530 */         this.cursorRow.setDescrizioneErrore("Errore nella deduplica dei dati");
/* 531 */         this.cursorRow.setDataElab(new Date());
/* 532 */         setResponse("WARNING");
/*     */ 
/*     */         
/*     */         return;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 540 */     risultato = (String)result.getAppl("RESULT");
/*     */     
/* 542 */     this.soggetto = (FinSoggetto)result.getAppl("SOGGETTO");
/*     */ 
/*     */     
/* 545 */     if (((String)result.getAppl("RESULT")).equals("INSERTED")) {
/*     */ 
/*     */       
/* 548 */       insSoggettoPrivacy(row);
/* 549 */       this.soggetto.setSoggettoPrivacy(this.privacy);
/* 550 */       this.privacy.setSoggetto(this.soggetto);
/* 551 */       param.putAppl("PRIVACY", this.privacy);
/* 552 */       result = executeService("InsertPrivacy", param);
/*     */ 
/*     */     
/*     */     }
/* 556 */     else if (((String)result.getAppl("RESULT")).equals("UPDATED")) {
/*     */       
/* 558 */       if (this.soggetto.getSoggettoPrivacy() == null) {
/*     */         
/* 560 */         insSoggettoPrivacy(row);
/* 561 */         this.soggetto.setSoggettoPrivacy(this.privacy);
/* 562 */         this.privacy.setSoggetto(this.soggetto);
/* 563 */         param.putAppl("PRIVACY", this.privacy);
/* 564 */         result = executeService("InsertPrivacy", param);
/*     */       } else {
/*     */         
/* 567 */         updSoggettoPrivacy(this.soggetto.getSoggettoPrivacy());
/* 568 */         param.putAppl("PRIVACY", this.privacy);
/* 569 */         result = executeService("UpdatePrivacy", param);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 575 */     if (flagIndirizzo.booleanValue()) {
/*     */ 
/*     */ 
/*     */       
/* 579 */       this.soggettoIndirizzoRes = new FinSoggettoIndir();
/* 580 */       insSoggettoIndir(this.soggetto, this.indirizzo, this.soggettoIndirizzoRes);
/* 581 */       this.indirizzo.setSoggetto(new HashSet());
/* 582 */       this.indirizzo.getSoggetto().add(this.soggettoIndirizzoRes);
/* 583 */       param.putAppl("SOGGETTO", this.soggetto);
/* 584 */       param.putAppl("INDIRIZZO", this.indirizzo);
/* 585 */       param.putAppl("SOGGETTO_INDIRIZZO", this.soggettoIndirizzoRes);
/*     */       
/* 587 */       param.putAppl("BATCH_NAME", "BatchAnagraficaClienteInvestitori");
/* 588 */       param.putAppl("PROV_DATI_ANAG", "GPRAM");
/*     */       
/* 590 */       result = executeService("InsertResidenza", param);
/*     */       
/* 592 */       String resultMsg = (String)result.getAppl("RESULT");
/*     */       
/* 594 */       if (!resultMsg.equals("EXECUTED") && !resultMsg.equals("INSERTED")) {
/* 595 */         result = executeService("InsertResidenzaSenzaNormalizzazione", param);
/*     */       }
/*     */       
/* 598 */       Boolean dominato = (Boolean)result.getAppl("DOMINATO");
/*     */       
/* 600 */       if (dominato != null && dominato.booleanValue() == true) {
/* 601 */         this.cursorRow.setDescrizioneErrore("Indirizzo dominato");
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 607 */     if (ficInd) {
/*     */ 
/*     */       
/* 610 */       this.soggettoIndirizzoFis = new FinSoggettoIndir();
/* 611 */       insSoggettoIndir(this.soggetto, this.indirizzoFisc, this.soggettoIndirizzoFis);
/*     */       
/* 613 */       this.indirizzoFisc.setSoggetto(new HashSet());
/* 614 */       this.indirizzoFisc.getSoggetto().add(this.soggettoIndirizzoFis);
/* 615 */       param.putAppl("SOGGETTO", this.soggetto);
/* 616 */       param.removeAppl("INDIRIZZO");
/* 617 */       param.putAppl("INDIRIZZO", this.indirizzoFisc);
/* 618 */       param.putAppl("SOGGETTO_INDIRIZZO", this.soggettoIndirizzoFis);
/* 619 */       param.putAppl("BATCH_NAME", "BatchAnagraficaClienteInvestitori");
/* 620 */       param.putAppl("PROV_DATI_ANAG", "GPRAM");
/*     */       
/* 622 */       result = executeService("InsertFiscale", param);
/*     */       
/* 624 */       String resultMsg = (String)result.getAppl("RESULT");
/*     */       
/* 626 */       if (!resultMsg.equals("EXECUTED") && !resultMsg.equals("INSERTED")) {
/* 627 */         result = executeService("InsertFiscaleSenzaNormalizzazione", param);
/*     */       }
/*     */       
/* 630 */       Boolean dominato = (Boolean)result.getAppl("DOMINATO");
/*     */       
/* 632 */       if (dominato != null && dominato.booleanValue() == true) {
/* 633 */         this.cursorRow.setDescrizioneErrore("Indirizzo dominato");
/*     */       }
/*     */     } 
/*     */     
/* 637 */     this.soggetto.setRecapito(new HashSet());
/* 638 */     if (this.cursorRow.getTelefonoAbitazione() == null || this.cursorRow.getTelefonoCellulare() == null || this.cursorRow.getTelefonoUfficio() == null) {
/* 639 */       this.cursorRow.setDataElab(new Date());
/*     */       
/* 641 */       this.logger.debug("Almeno uno tra i seguenti dati deve essere presente: Tel ufficio, tel abitazione, cellulare");
/* 642 */       setResponse("WARNING");
/*     */     } else {
/*     */       
/* 645 */       if (this.cursorRow.getTelefonoAbitazione() != null) {
/*     */         
/* 647 */         insRecapitoGenerico(this.cursorRow.getTelefonoAbitazione(), param);
/* 648 */         result = executeService("InsertTelefonoResidenza", param);
/*     */       } 
/* 650 */       if (this.cursorRow.getTelefonoUfficio() != null) {
/* 651 */         insRecapitoGenerico(this.cursorRow.getTelefonoUfficio(), param);
/* 652 */         result = executeService("InsertTelefonoRecapito", param);
/*     */       } 
/* 654 */       if (this.cursorRow.getFax() != null) {
/* 655 */         insRecapitoGenerico(this.cursorRow.getFax(), param);
/* 656 */         result = executeService("InsertFax", param);
/*     */       } 
/* 658 */       if (this.cursorRow.getTelefonoCellulare() != null) {
/* 659 */         insRecapitoGenerico(this.cursorRow.getTelefonoCellulare(), param);
/* 660 */         result = executeService("InsertCellulare", param);
/*     */       } 
/* 662 */       if (this.cursorRow.getEMail() != null) {
/* 663 */         insRecapitoGenerico(this.cursorRow.getEMail(), param);
/* 664 */         result = executeService("InsertEmail", param);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 669 */     insDocumento(row);
/* 670 */     this.documento.setSoggetto(this.soggetto);
/* 671 */     this.soggetto.setDocumenti(new HashSet());
/*     */     
/* 673 */     param.putAppl("SOGGETTO", this.soggetto);
/* 674 */     param.putAppl("DOCUMENTO", this.documento);
/* 675 */     result = executeService("insertDocumento", param);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 681 */     if (risultato.equals("INSERTED")) {
/*     */       
/* 683 */       param.putAppl("COINTESTAZIONE", this.cointestazione);
/* 684 */       result = executeService("InsCointestazione", param);
/* 685 */       risultato = (String)result.getAppl("RESULT");
/*     */     } 
/*     */     
/* 688 */     if (risultato.equals("FOUND")) {
/*     */       
/* 690 */       this.cursorRow.setDataElab(new Date());
/* 691 */       this.cursorRow.setDescrizioneErrore(this.tel);
/*     */     } 
/*     */ 
/*     */     
/* 695 */     this.cursorRow.setDataElab(new Date());
/* 696 */     setResponse("OK");
/*     */   }
/*     */   
/*     */   protected void insSoggettoPrivacy(Object row) {
/* 700 */     this.cursorRow = (FlxInvestitoriAnagCliente)row;
/* 701 */     this.privacy = new FinSoggettoPrivacy();
/* 702 */     this.privacy.setTipoPrivacy("T");
/* 703 */     this.privacy.setDataCons(this.cursorRow.getDataPrivacy());
/* 704 */     this.privacy.setConsPrivacy0(this.cursorRow.getConsensoBase());
/* 705 */     this.privacy.setConsPrivacy1(this.cursorRow.getConsensoComunicazioni());
/* 706 */     this.privacy.setConsPrivacy2(this.cursorRow.getConsensoUtilizzoDatiBanca());
/* 707 */     this.privacy.setConsPrivacy3(this.cursorRow.getConsensoUtilizzoDatiGruppo());
/* 708 */     this.privacy.setConsPrivacy4(this.cursorRow.getConsensoUtilizzoDatiSensibi());
/*     */ 
/*     */ 
/*     */     
/* 712 */     this.privacy.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 713 */     this.privacy.setDataInserimento(new Date());
/*     */     
/* 715 */     ArchUtils.setStdFields(this.privacy, "I", "BatchAnagraficaClienteInvestitori");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void updSoggettoPrivacy(FinSoggettoPrivacy pry) {
/* 720 */     this.privacy = pry;
/* 721 */     this.privacy.setTipoPrivacy("T");
/* 722 */     this.privacy.setDataCons(this.cursorRow.getDataPrivacy());
/* 723 */     this.privacy.setConsPrivacy0(this.cursorRow.getConsensoBase());
/* 724 */     this.privacy.setConsPrivacy1(this.cursorRow.getConsensoComunicazioni());
/* 725 */     this.privacy.setConsPrivacy2(this.cursorRow.getConsensoUtilizzoDatiBanca());
/* 726 */     this.privacy.setConsPrivacy3(this.cursorRow.getConsensoUtilizzoDatiGruppo());
/* 727 */     this.privacy.setConsPrivacy4(this.cursorRow.getConsensoUtilizzoDatiSensibi());
/*     */ 
/*     */     
/* 730 */     this.privacy.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 731 */     this.privacy.setDataInserimento(new Date());
/*     */     
/* 733 */     ArchUtils.setStdFields(this.privacy, "U", "BatchAnagraficaClienteInvestitori");
/*     */   }
/*     */ 
/*     */   
/*     */   protected void insSoggettoIndir(FinSoggetto soggetto, FinIndirizzo indirizzo, FinSoggettoIndir soggettoIndirizzo) {
/* 738 */     Calendar data = Calendar.getInstance();
/* 739 */     data.set(9999, 11, 31);
/*     */ 
/*     */     
/* 742 */     soggettoIndirizzo.setSoggetto(soggetto);
/* 743 */     soggettoIndirizzo.setIndirizzo(indirizzo);
/* 744 */     soggettoIndirizzo.setDataInizio(new Date());
/* 745 */     soggettoIndirizzo.setDataFine(data.getTime());
/*     */     
/* 747 */     soggettoIndirizzo.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 748 */     soggettoIndirizzo.setDataInserimento(new Date());
/* 749 */     soggettoIndirizzo.setUserUltimaModifica("BatchAnagraficaClienteInvestitori");
/* 750 */     soggettoIndirizzo.setProceduraUltimaModifica("BatchAnagraficaClienteInvestitori");
/* 751 */     soggettoIndirizzo.setDataUltimaModifica(new Date());
/* 752 */     soggettoIndirizzo.setFlagEsistenza("S");
/* 753 */     soggettoIndirizzo.setTipoUltimaModifica("I");
/* 754 */     ArchUtils.setStdFields(soggettoIndirizzo, "I", "BatchAnagraficaClienteInvestitori");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void insDocumento(Object row) throws RasServiceException {
/* 760 */     this.cursorRow = (FlxInvestitoriAnagCliente)row;
/* 761 */     this.documento = new FinDocumento();
/* 762 */     if (this.cursorRow.getTipoDocumentoIdentita() != null)
/*     */     {
/* 764 */       this.documento.setTipoDoc((String)this.codesTableManager.decodeValue("TIPO_DOC", "TIPO_DOC_GPRAM", "TIPO_DOC_ARCO", this.cursorRow.getTipoDocumentoIdentita()));
/*     */     }
/*     */ 
/*     */     
/* 768 */     Calendar cal = Calendar.getInstance();
/* 769 */     cal.set(9999, 11, 31);
/* 770 */     this.documento.setProvRilascio(this.cursorRow.getProvinciaRilascio());
/* 771 */     this.documento.setNumeroDoc(this.cursorRow.getNumeroDocumento());
/*     */     
/* 773 */     if (this.cursorRow.getLuogoRilascio() != null) {
/*     */       
/* 775 */       this.documento.setLuogoRilascio(this.cursorRow.getLuogoRilascio());
/*     */     } else {
/* 777 */       this.documento.setLuogoRilascio(this.cursorRow.getComuneDiResidenza());
/*     */     } 
/*     */     
/* 780 */     this.documento.setAutoritaRilasc(this.cursorRow.getEnteRilascio());
/* 781 */     this.documento.setInizioVal(new Date());
/* 782 */     this.documento.setFineVal(cal.getTime());
/* 783 */     this.documento.setDataRilascio(this.cursorRow.getDataRilascio());
/* 784 */     FinNazioniUic nazione = new FinNazioniUic();
/*     */     
/* 786 */     if (this.cursorRow.getNazioneDiResidenza() != null) {
/*     */       
/* 788 */       nazione.setCodiceIso(this.cursorRow.getNazioneDiResidenza().substring(0, 2));
/* 789 */       MapContainer map = GetNazioneByCodIso(nazione);
/* 790 */       String risultato = (String)map.getAppl("RESULT");
/* 791 */       if (!risultato.equals("FOUND")) {
/*     */         
/* 793 */         this.cursorRow.setDescrizioneErrore(this.Uic);
/* 794 */         this.log.warn("Non ho trovato l uic corrispondente o ce ne sono molti");
/*     */       } else {
/*     */         
/* 797 */         nazione = (FinNazioniUic)map.getAppl("NAZIONE");
/* 798 */         this.documento.setNazioneRilascio(nazione.getCodiceUic());
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 803 */     this.documento.setDataScadenza(this.cursorRow.getDataScadenza());
/* 804 */     this.documento.setStato("E");
/*     */     
/* 806 */     this.documento.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 807 */     this.documento.setDataInserimento(new Date());
/*     */     
/* 809 */     ArchUtils.setStdFields(this.documento, "I", "BatchAnagraficaClienteInvestitori");
/*     */   }
/*     */ 
/*     */   
/*     */   private void insRecapitoGenerico(String tipoRecapito, MapContainer inputMap) {
/* 814 */     this.recapito = new FinRecapito();
/* 815 */     this.recapito.setDesRecapito(tipoRecapito);
/* 816 */     Calendar cal = Calendar.getInstance();
/* 817 */     cal.set(9999, 11, 31);
/* 818 */     this.recapito.setInizioVali(new Date());
/* 819 */     this.recapito.setFineVali(cal.getTime());
/* 820 */     this.recapito.setSoggetto(this.soggetto);
/* 821 */     this.soggetto.setRecapito(new HashSet());
/* 822 */     this.soggetto.getRecapito().add(this.recapito);
/* 823 */     inputMap.putAppl("RECAPITO", this.recapito);
/* 824 */     inputMap.putAppl("SOGGETTO", this.soggetto);
/*     */     
/* 826 */     this.recapito.setUtenteInserimento("BatchAnagraficaClienteInvestitori");
/* 827 */     this.recapito.setDataInserimento(new Date());
/*     */     
/* 829 */     ArchUtils.setStdFields(this.recapito, "I", "BatchAnagraficaClienteInvestitori");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer GetNazioneByCodIso(FinNazioniUic nazione) throws RasServiceException {
/* 837 */     MapContainer param = new MapContainer();
/* 838 */     MapContainer output = new MapContainer();
/* 839 */     String nazione2 = nazione.getCodiceIso().substring(0, 2);
/* 840 */     nazione.setCodiceIso(nazione2);
/* 841 */     param.putAppl("NAZIONE", nazione);
/*     */ 
/*     */     
/* 844 */     output = executeService("GetNazioneByCodIsoSRV", param);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 849 */     return output;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\GetFlxAnagraficaClienteBL.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */