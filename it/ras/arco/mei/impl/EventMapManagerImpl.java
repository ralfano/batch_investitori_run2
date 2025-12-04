/*     */ package it.ras.arco.mei.impl;
/*     */ 
/*     */ import it.ras.arco.bean.FinEmittente;
/*     */ import it.ras.arco.bean.FinEvento;
/*     */ import it.ras.arco.mei.IEventMapManager;
/*     */ import it.ras.flag.exception.RasException;
/*     */ import it.ras.flag.transaction.IRasRequiredTransaction;
/*     */ import it.ras.flag.transaction.IRasSupportedTransaction;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Map;
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
/*     */ public class EventMapManagerImpl
/*     */   implements IEventMapManager
/*     */ {
/*  28 */   private Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */   
/*  31 */   private TransactionDescriptor eventsTransactionDescriptor = new TransactionDescriptor();
/*     */   
/*  33 */   private TransactionDescriptor realFactoriesTransactionDescriptor = new TransactionDescriptor();
/*     */   
/*  35 */   private TransactionDescriptor virtualFactoriesTransactionDescriptor = new TransactionDescriptor();
/*     */   
/*  37 */   private String nomeLogicoTx = null;
/*     */   
/*  39 */   private Map indiceEventi = null;
/*     */   
/*     */   private boolean eventiCaricati = false;
/*     */   
/*     */   private boolean emittentiRealiCaricati = false;
/*     */   
/*     */   private boolean emittentiVirtualiCaricati = false;
/*     */   
/*  47 */   private Long timeOutMillisec = null;
/*     */   
/*  49 */   private Collection listaEventi = null;
/*     */   
/*  51 */   private Collection listaEmittentiFittizie = null;
/*     */   
/*  53 */   private Collection listaEmittentiReali = null;
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean virtualFactoriesLazyInitialization = false;
/*     */ 
/*     */   
/*     */   private boolean realFactoriesLazyInitialization = true;
/*     */ 
/*     */   
/*     */   public static final String RISULTATO_SELEZIONATO_MAP_CONTAINER_KEY = "RISULTATO_RICERCA";
/*     */ 
/*     */   
/*     */   public static final String VISIBILITA_EMITTENTE_MAP_CONTAINER_KEY = "VISIBILITA_EMITTENTE";
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean check(FinEmittente emittente, String tipoEvento, Collection parametri) {
/*  71 */     if (this.logger.isDebugEnabled()) {
/*  72 */       this.logger.debug("Controllo che l'emittente [ID='" + emittente.getEmittenteId() + "'; NOME='" + emittente.getDescrizione() + "'] desideri ricevere notifica di un evento '" + tipoEvento + "'.");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  78 */     if (parametri != null && parametri.size() > 0)
/*     */     {
/*  80 */       if (this.logger.isWarnEnabled()) {
/*  81 */         this.logger.warn("GESTIONE DEL CONTROLLO MEDIANTE PARAMETRI ADDIZIONALI NON IMPLEMENTATA");
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*  86 */     Collection eventMappings = (Collection)this.indiceEventi.get(tipoEvento);
/*     */ 
/*     */     
/*  89 */     for (Iterator iter = eventMappings.iterator(); iter.hasNext(); ) {
/*     */       
/*  91 */       FinEvento evento = iter.next();
/*  92 */       String emittenteId = evento.getEmittenteId();
/*     */       
/*  94 */       if ("*".equals(evento.getEmittenteId())) {
/*     */ 
/*     */         
/*  97 */         if (this.logger.isDebugEnabled()) {
/*  98 */           this.logger.debug("Per il tipo '" + evento.getTipoSottoscrizione() + "' esiste un evento (ID='" + evento.getEventoId() + "') con emittenteId = '" + evento.getEmittenteId() + "'. L'emittente (ID='" + emittente.getEmittenteId() + "') passa il controllo.");
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 106 */         return true;
/*     */       } 
/*     */       
/* 109 */       if ("R".equals(evento.getEmittenteId())) {
/*     */ 
/*     */         
/* 112 */         if ("R".equals(emittente.getVisibilita()) || !"F".equals(emittente.getVisibilita())) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 117 */           if (this.logger.isDebugEnabled()) {
/* 118 */             this.logger.debug("Per il tipo '" + evento.getTipoSottoscrizione() + "' esiste un evento (ID='" + evento.getEventoId() + "') con emittenteId = '" + evento.getEmittenteId() + "'. L'emittente (ID='" + emittente.getEmittenteId() + "', VISIBILITA='" + emittente.getVisibilita() + "') passa il controllo.");
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 129 */           return true;
/*     */         } 
/*     */         
/* 132 */         if (this.logger.isDebugEnabled()) {
/* 133 */           this.logger.debug("Per il tipo '" + evento.getTipoSottoscrizione() + "' esiste un evento (ID='" + evento.getEventoId() + "') con emittenteId = '" + evento.getEmittenteId() + "' ma l'emittente (ID='" + emittente.getEmittenteId() + "', VISIBILITA='" + emittente.getVisibilita() + "') per ora NON passa il controllo " + "perche' non REALE.");
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         continue;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 147 */       if ("F".equals(evento.getEmittenteId())) {
/*     */ 
/*     */         
/* 150 */         if ("F".equals(emittente.getVisibilita())) {
/*     */ 
/*     */           
/* 153 */           if (this.logger.isDebugEnabled()) {
/* 154 */             this.logger.debug("Per il tipo '" + evento.getTipoSottoscrizione() + "' esiste un evento (ID='" + evento.getEventoId() + "') con emittenteId = '" + evento.getEmittenteId() + "'. L'emittente (ID='" + emittente.getEmittenteId() + "', VISIBILITA='" + emittente.getVisibilita() + "') passa il controllo.");
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 165 */           return true;
/*     */         } 
/*     */         
/* 168 */         if (this.logger.isDebugEnabled()) {
/* 169 */           this.logger.debug("Per il tipo '" + evento.getTipoSottoscrizione() + "' esiste un evento (ID='" + evento.getEventoId() + "') con emittenteId = '" + evento.getEmittenteId() + "' ma l'emittente (ID='" + emittente.getEmittenteId() + "', VISIBILITA='" + emittente.getVisibilita() + "') per ora NON passa il controllo " + "perche' non FITTIZIA.");
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         continue;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       try {
/* 185 */         int idEmittenteNumerico = Integer.parseInt(evento.getEmittenteId());
/*     */ 
/*     */         
/* 188 */         if (emittente.getEmittenteId().intValue() == idEmittenteNumerico)
/*     */         {
/* 190 */           if (this.logger.isDebugEnabled()) {
/* 191 */             this.logger.debug("Per il tipo '" + evento.getTipoSottoscrizione() + "' esiste un evento (ID='" + evento.getEventoId() + "') con emittenteId = '" + evento.getEmittenteId() + "'. L'emittente (ID='" + emittente.getEmittenteId() + "') passa il controllo.");
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 201 */           return true;
/*     */         }
/*     */       
/* 204 */       } catch (NumberFormatException e) {
/*     */         
/* 206 */         if (this.logger.isWarnEnabled()) {
/* 207 */           this.logger.warn("Per il tipo '" + evento.getTipoSottoscrizione() + "' esiste un evento (ID='" + evento.getEventoId() + "') con emittenteId = '" + evento.getEmittenteId() + "'. Il valore di emittenteId non e' riconosciuto come" + " wildcard valida e non e' un numero intero. L'evento " + "non e' valido. Proseguo.");
/*     */         }
/*     */       } 
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
/* 220 */     if (this.logger.isDebugEnabled()) {
/* 221 */       this.logger.debug("Non e' stato riconosciuto alcun evento di tipo '" + tipoEvento + "' che faccia superare il controlla all'Emittente (ID='" + emittente.getEmittenteId() + "'; NOME='" + emittente.getDescrizione() + "'). Controllo fallito.");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 227 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean check(FinEmittente emittente, String tipoEvento) {
/* 237 */     return check(emittente, tipoEvento, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection purge(Collection listaEmittenti, String tipoEvento, Collection parametri) {
/* 248 */     Collection retCollection = new ArrayList();
/*     */ 
/*     */     
/* 251 */     integraConEmittentiFittizie(listaEmittenti);
/*     */     
/* 253 */     for (Iterator iter = listaEmittenti.iterator(); iter.hasNext(); ) {
/*     */       
/* 255 */       FinEmittente emittente = iter.next();
/* 256 */       if (check(emittente, tipoEvento, parametri))
/*     */       {
/* 258 */         retCollection.add(emittente);
/*     */       }
/*     */     } 
/*     */     
/* 262 */     return retCollection;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Collection integraConEmittentiFittizie(Collection listaEmittenti) {
/* 271 */     if (!this.emittentiVirtualiCaricati)
/*     */     {
/* 273 */       inizializzaCacheEmittentiFittizie();
/*     */     }
/*     */     
/* 276 */     if (!this.emittentiVirtualiCaricati || this.listaEmittentiFittizie == null || this.listaEmittentiFittizie.size() <= 0) {
/*     */ 
/*     */       
/* 279 */       if (this.logger.isWarnEnabled()) {
/* 280 */         this.logger.warn("Lista emittenti fittizie vuota o non disponibile, emittenti fittizie NON aggiunte.");
/*     */       }
/*     */       
/* 283 */       return listaEmittenti;
/*     */     } 
/*     */ 
/*     */     
/* 287 */     Iterator iter = this.listaEmittentiFittizie.iterator();
/* 288 */     while (iter.hasNext()) {
/*     */       
/* 290 */       FinEmittente emittenteFittizia = iter.next();
/* 291 */       boolean trovata = false;
/* 292 */       Iterator iterator = listaEmittenti.iterator();
/* 293 */       while (iterator.hasNext()) {
/*     */         
/* 295 */         FinEmittente emittenteInLista = iterator.next();
/*     */         
/* 297 */         if (EventManagerUtils.compareFactories(emittenteFittizia, emittenteInLista)) {
/*     */ 
/*     */           
/* 300 */           trovata = true;
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/* 305 */       if (!trovata)
/*     */       {
/* 307 */         listaEmittenti.add(emittenteFittizia);
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 312 */     return listaEmittenti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Collection purge(Collection listaEmittenti, String tipoEvento) {
/* 322 */     return purge(listaEmittenti, tipoEvento, null);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void reloadCache() throws RasException {
/* 331 */     resetState();
/* 332 */     initCache();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCacheReloadingTimeout(Long milliseconds) throws RasException {
/* 341 */     setTimeOutMillisec(milliseconds);
/* 342 */     startWatchDog();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void startWatchDog() {
/* 351 */     if (this.logger.isWarnEnabled()) {
/* 352 */       this.logger.warn("GESTIONE DEL RELOAD SU TIMEOUT NON IMPLEMENTATA");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void initCache() throws RasException {
/* 363 */     inizializzaCacheEventi();
/*     */     
/* 365 */     if (!this.realFactoriesLazyInitialization)
/*     */     {
/* 367 */       inizializzaCacheEmittentiReali();
/*     */     }
/*     */     
/* 370 */     if (!this.virtualFactoriesLazyInitialization)
/*     */     {
/* 372 */       inizializzaCacheEmittentiFittizie();
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void inizializzaCacheEmittentiFittizie() {
/* 382 */     this.emittentiVirtualiCaricati = false;
/* 383 */     this.listaEmittentiFittizie = null;
/*     */     
/*     */     try {
/* 386 */       this.listaEmittentiFittizie = caricaEmittentiFittizie();
/* 387 */       this.emittentiVirtualiCaricati = true;
/*     */     }
/* 389 */     catch (RasException e) {
/*     */       
/* 391 */       if (this.logger.isErrorEnabled()) {
/* 392 */         this.logger.error("Impossibile caricare le emittenti fittizie: " + e.getMessage());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void inizializzaCacheEmittentiReali() {
/* 403 */     this.emittentiRealiCaricati = false;
/* 404 */     this.listaEmittentiReali = null;
/*     */     
/*     */     try {
/* 407 */       this.listaEmittentiReali = caricaEmittentiReali();
/* 408 */       this.emittentiRealiCaricati = true;
/*     */     }
/* 410 */     catch (RasException e) {
/*     */       
/* 412 */       if (this.logger.isErrorEnabled()) {
/* 413 */         this.logger.error("Impossibile caricare le emittenti reali: " + e.getMessage());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void inizializzaCacheEventi() {
/* 424 */     this.listaEventi = null;
/* 425 */     this.eventiCaricati = false;
/*     */     
/*     */     try {
/* 428 */       this.listaEventi = caricaEventi();
/* 429 */       this.eventiCaricati = true;
/*     */       
/* 431 */       if (this.listaEventi != null && this.listaEventi.size() > 0)
/*     */       {
/* 433 */         rebuildIndexEventi(this.listaEventi);
/*     */ 
/*     */       
/*     */       }
/* 437 */       else if (this.logger.isWarnEnabled())
/*     */       {
/* 439 */         this.logger.warn("Nessun record trovato nella tabella degli eventi.");
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 444 */     catch (RasException e) {
/*     */       
/* 446 */       if (this.logger.isErrorEnabled()) {
/* 447 */         this.logger.error("Impossibile caricare la lista degli eventi: " + e.getMessage());
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
/*     */   private void rebuildIndexEventi(Collection listaEventi) {
/* 460 */     this.indiceEventi = new HashMap();
/* 461 */     for (Iterator iter = listaEventi.iterator(); iter.hasNext(); ) {
/*     */       
/* 463 */       FinEvento evento = iter.next();
/* 464 */       Collection c = (Collection)this.indiceEventi.get(evento.getTipoSottoscrizione());
/*     */       
/* 466 */       if (c == null) {
/*     */         
/* 468 */         c = new ArrayList();
/* 469 */         this.indiceEventi.put(evento.getTipoSottoscrizione(), c);
/*     */       } 
/*     */       
/* 472 */       c.add(evento);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Collection caricaEventi() throws RasException {
/* 483 */     MapContainer mc = this.eventsTransactionDescriptor.execute(new MapContainer(1));
/*     */     
/* 485 */     return (Collection)mc.getAppl("RISULTATO_RICERCA");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Collection caricaEmittentiReali() throws RasException {
/* 495 */     MapContainer mcIn = new MapContainer(1);
/* 496 */     mcIn.putAppl("VISIBILITA_EMITTENTE", "R");
/*     */     
/* 498 */     MapContainer mc = this.virtualFactoriesTransactionDescriptor.execute(mcIn);
/* 499 */     return (Collection)mc.getAppl("RISULTATO_RICERCA");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Collection caricaEmittentiFittizie() throws RasException {
/* 509 */     MapContainer mcIn = new MapContainer(1);
/* 510 */     mcIn.putAppl("VISIBILITA_EMITTENTE", "F");
/*     */     
/* 512 */     MapContainer mc = this.virtualFactoriesTransactionDescriptor.execute(mcIn);
/* 513 */     return (Collection)mc.getAppl("RISULTATO_RICERCA");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void init() throws RasException {
/* 522 */     initCache();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void destroy() {
/* 531 */     resetState();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void resetState() {
/* 540 */     this.indiceEventi = null;
/*     */     
/* 542 */     this.listaEventi = null;
/* 543 */     this.listaEmittentiFittizie = null;
/* 544 */     this.listaEmittentiReali = null;
/*     */     
/* 546 */     this.eventiCaricati = false;
/* 547 */     this.emittentiRealiCaricati = false;
/* 548 */     this.emittentiVirtualiCaricati = false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setTimeOutMillisec(Long timeOutMillisec) {
/* 557 */     this.timeOutMillisec = timeOutMillisec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEventsLoaderSupportedTransaction(IRasSupportedTransaction transaction) {
/* 566 */     this.eventsTransactionDescriptor.setSupportedTx(transaction);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEventsLoaderRequiredTransaction(IRasRequiredTransaction transaction) {
/* 575 */     this.eventsTransactionDescriptor.setRequiredTx(transaction);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRealFactoriesLoaderSupportedTransaction(IRasSupportedTransaction transaction) {
/* 585 */     this.realFactoriesTransactionDescriptor.setSupportedTx(transaction);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRealFactoriesLoaderRequiredTransaction(IRasRequiredTransaction transaction) {
/* 595 */     this.realFactoriesTransactionDescriptor.setRequiredTx(transaction);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVirtualFactoriesLoaderSupportedTransaction(IRasSupportedTransaction transaction) {
/* 605 */     this.virtualFactoriesTransactionDescriptor.setSupportedTx(transaction);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVirtualFactoriesLoaderRequiredTransaction(IRasRequiredTransaction transaction) {
/* 615 */     this.virtualFactoriesTransactionDescriptor.setRequiredTx(transaction);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVirtualFactoriesLazyInitialization(Boolean b) {
/* 624 */     if (b != null) this.virtualFactoriesLazyInitialization = b.booleanValue();
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRealFactoriesLazyInitialization(Boolean b) {
/* 633 */     if (b != null) this.realFactoriesLazyInitialization = b.booleanValue(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\impl\EventMapManagerImpl.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */