/*      */ package it.ras.arco.mei.impl;
/*      */ 
/*      */ import it.ras.arco.bean.FinCointestazione;
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinContrattoBase;
/*      */ import it.ras.arco.bean.FinEmittente;
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinPosizione;
/*      */ import it.ras.arco.bean.FinProdottoLinea;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.bean.FinSottoscrEmittente;
/*      */ import it.ras.arco.bean.FinSottoscrizione;
/*      */ import it.ras.arco.bean.FinSottoscrizioneCont;
/*      */ import it.ras.arco.common.resources.Utility;
/*      */ import it.ras.arco.mei.EventTypeNotSupportedException;
/*      */ import it.ras.arco.mei.IEventMapManager;
/*      */ import it.ras.arco.mei.IFactoryLocator;
/*      */ import it.ras.arco.mei.SottoscrizioneInconsistenteException;
/*      */ import it.ras.arco.mei.UndefinedEventOnEntityException;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import it.ras.flag.exception.RasException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
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
/*      */ public class FactoryLocatorImpl
/*      */   implements IFactoryLocator
/*      */ {
/*   44 */   private IEventMapManager eventMapManager = null;
/*      */   
/*   46 */   private Log logger = LogFactory.getLog(getClass());
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean multithreadedCacheReloading = false;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setEventMapManager(IEventMapManager mapManager) {
/*   57 */     this.eventMapManager = mapManager;
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
/*      */   private Collection locateFactories(FinSoggetto soggetto) throws EventTypeNotSupportedException {
/*   69 */     if (soggetto == null) {
/*      */       
/*   71 */       String msg = "Il soggetto e' NULL";
/*   72 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*   73 */       throw new EventTypeNotSupportedException(new NullPointerException(msg));
/*      */     } 
/*      */ 
/*      */     
/*   77 */     if (!isValid(soggetto)) {
/*      */       
/*   79 */       String msg = "Il Soggetto risulta non attivo, insensato recuperare le emittenti associate.";
/*   80 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*   81 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*   84 */     if (soggetto.getCointestazione() == null) {
/*      */       
/*   86 */       String msg = "Il Soggetto non ha cointestazioni associate, impossibile recuperare le emittenti.";
/*   87 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*   88 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*   91 */     if (this.logger.isDebugEnabled()) {
/*   92 */       this.logger.debug("Ciclo su tutte le Cointestazione del soggetto.");
/*      */     }
/*   94 */     Collection cUnion = null;
/*   95 */     Iterator iter = soggetto.getCointestazione().iterator();
/*   96 */     while (iter.hasNext()) {
/*      */       
/*   98 */       FinCointestazione cointestazione = iter.next();
/*   99 */       if (cUnion == null) {
/*      */ 
/*      */         
/*      */         try {
/*  103 */           cUnion = locateFactories(cointestazione);
/*      */         }
/*  105 */         catch (EventTypeNotSupportedException e) {
/*      */ 
/*      */           
/*  108 */           if (this.logger.isDebugEnabled()) {
/*  109 */             this.logger.debug("Impossibile processare la singola Cointestazione, ignoro.");
/*      */           }
/*      */         } 
/*      */         
/*      */         continue;
/*      */       } 
/*      */       
/*      */       try {
/*  117 */         cUnion.addAll(locateFactories(cointestazione));
/*      */       }
/*  119 */       catch (EventTypeNotSupportedException e) {
/*      */ 
/*      */         
/*  122 */         if (this.logger.isDebugEnabled()) {
/*  123 */           this.logger.debug("Impossibile processare la singola Cointestazione, ignoro.");
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  129 */     if (cUnion == null) {
/*      */       
/*  131 */       String msg = "Impossibile recuperare le emittenti ciclando sulle Cointestazioni.";
/*  132 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  133 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*  136 */     return removeDuplicates(cUnion);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection locateFactories(FinSoggetto soggetto, String eventType) throws EventTypeNotSupportedException {
/*  147 */     checkSupported(eventType, new String[] { "MSO" });
/*      */ 
/*      */ 
/*      */     
/*  151 */     return filtraEmittenti(locateFactories(soggetto), eventType);
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
/*      */   private Collection filtraEmittenti(Collection collection, String tipoEvento) {
/*  163 */     if (this.eventMapManager == null) {
/*      */       
/*  165 */       if (this.logger.isWarnEnabled()) {
/*  166 */         this.logger.warn("Nessun 'IEventMapManager' associato all'IFactoryLocator, gestione della tabella degli eventi disattivata!");
/*      */       }
/*      */       
/*  169 */       return collection;
/*      */     } 
/*      */     
/*  172 */     return this.eventMapManager.purge(collection, tipoEvento);
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
/*      */   private boolean isValid(RasORMBean bean) {
/*  184 */     if (ArchUtils.isValid(bean.getFlagEsistenza()))
/*      */     {
/*  186 */       if (!"S".equals(bean.getFlagEsistenza())) return false;
/*      */     
/*      */     }
/*  189 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isValid(FinContratto contratto) {
/*  199 */     if (!isValid((RasORMBean)contratto)) return false;
/*      */ 
/*      */     
/*  202 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isValid(FinSoggetto soggetto) {
/*  212 */     if (!isValid((RasORMBean)soggetto)) return false;
/*      */ 
/*      */     
/*  215 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean isValid(FinCointestazione cointestazione) {
/*  225 */     if (!isValid((RasORMBean)cointestazione)) return false;
/*      */ 
/*      */     
/*  228 */     return true;
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
/*      */   private void checkSupported(String eventType, String[] supportedEvents) throws EventTypeNotSupportedException {
/*  242 */     if (supportedEvents == null || supportedEvents.length <= 0) {
/*      */       
/*  244 */       String str1 = "Il metodo non supporta eventi.";
/*  245 */       if (this.logger.isErrorEnabled()) this.logger.error(str1); 
/*  246 */       throw new EventTypeNotSupportedException(str1);
/*      */     } 
/*      */     
/*  249 */     String listaEventiSupportati = "";
/*      */     
/*  251 */     for (int i = 0; i < supportedEvents.length; i++) {
/*      */       
/*  253 */       listaEventiSupportati = listaEventiSupportati + " '" + supportedEvents[i] + "'";
/*  254 */       if (supportedEvents[i].equals(eventType))
/*      */         return; 
/*      */     } 
/*  257 */     String str = "Il metodo supporta solo gli eventi" + listaEventiSupportati + ".";
/*      */     
/*  259 */     if (this.logger.isErrorEnabled()) this.logger.error(str); 
/*  260 */     throw new EventTypeNotSupportedException(str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Collection locateFactories(FinContratto contratto) throws EventTypeNotSupportedException {
/*  270 */     if (contratto == null) {
/*      */       
/*  272 */       String msg = "Il contratto e' NULL";
/*  273 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  274 */       throw new EventTypeNotSupportedException(new NullPointerException(msg));
/*      */     } 
/*      */ 
/*      */     
/*  278 */     if (!isValid(contratto)) {
/*      */       
/*  280 */       String msg = "Il Contratto risulta non attivo, insensato recuperare le emittenti associate.";
/*  281 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  282 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*  285 */     Collection cEmittenti = null;
/*      */     
/*  287 */     if (contratto.getPosizione() == null || contratto.getPosizione().size() <= 0) {
/*      */ 
/*      */       
/*  290 */       if (this.logger.isDebugEnabled()) {
/*  291 */         this.logger.debug("Il Contratto non ha Posizioni associate, passo dall'associazione tra Contratto e Prodotto.");
/*      */       }
/*      */       
/*  294 */       if (contratto.getProdotto() == null) {
/*      */         
/*  296 */         String msg = "Il Contratto non ha Posizioni ne' Prodotto associati, impossibile recuperare l'Emittente";
/*  297 */         if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  298 */         throw new EventTypeNotSupportedException(msg);
/*      */       } 
/*      */       
/*  301 */       if (contratto.getProdotto().getEmittente() == null) {
/*      */         
/*  303 */         String msg = "Il Prodotto associato al Contratto non ha un'Emittente associata, impossibile recuperare l'Emittente";
/*  304 */         if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  305 */         throw new EventTypeNotSupportedException(msg);
/*      */       } 
/*      */       
/*  308 */       if (cEmittenti == null)
/*      */       {
/*  310 */         cEmittenti = new ArrayList();
/*      */       }
/*      */       
/*  313 */       cEmittenti.add(contratto.getProdotto().getEmittente());
/*      */     }
/*      */     else {
/*      */       
/*  317 */       Set posizioni = contratto.getPosizione();
/*  318 */       if (this.logger.isDebugEnabled()) {
/*  319 */         this.logger.debug("Il Contratto ha " + posizioni.size() + " Posizioni.");
/*      */       }
/*      */       
/*  322 */       for (Iterator iter = posizioni.iterator(); iter.hasNext(); ) {
/*      */         
/*  324 */         FinPosizione posizione = iter.next();
/*  325 */         if (posizione.getAttivitaFin() == null) {
/*      */           
/*  327 */           if (this.logger.isWarnEnabled()) {
/*  328 */             this.logger.warn("La Posizione ID='" + posizione.getPosizioneId() + "' non ha l'AttivitaFinanziaria associata.");
/*      */           }
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/*  334 */         if (this.logger.isDebugEnabled()) {
/*  335 */           this.logger.debug("Recupero l'Emittente del _PRIMO_ Prodotto dell'AttivitaFinanziaria.");
/*      */         }
/*      */         
/*  338 */         FinEmittente e = null;
/*      */         
/*      */         try {
/*  341 */           e = ((FinProdottoLinea)posizione.getAttivitaFin().getProdotto().iterator().next()).getProdotto().getEmittente();
/*      */ 
/*      */         
/*      */         }
/*  345 */         catch (Exception ex) {
/*      */ 
/*      */           
/*  348 */           if (this.logger.isWarnEnabled()) {
/*  349 */             this.logger.warn("L'AttivitaFinanziaria ID='" + posizione.getAttivitaFin().getAttivitaFinId() + "' non e' collegata all'Emittente.");
/*      */           }
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/*  355 */         if (cEmittenti == null)
/*      */         {
/*  357 */           cEmittenti = new ArrayList();
/*      */         }
/*      */         
/*  360 */         cEmittenti.add(e);
/*      */       } 
/*      */     } 
/*      */     
/*  364 */     if (cEmittenti == null || cEmittenti.size() <= 0) {
/*      */       
/*  366 */       String msg = "Nessuna emittente individuata per il Contratto.";
/*  367 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  368 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*  371 */     cEmittenti = removeDuplicates(cEmittenti);
/*      */     
/*  373 */     if (cEmittenti.size() > 1) {
/*      */       
/*  375 */       if (this.logger.isWarnEnabled()) {
/*  376 */         this.logger.warn("Al contratto sono associate " + cEmittenti.size() + " emittenti differenti, ignoro l'anomalia e proseguo!");
/*      */ 
/*      */       
/*      */       }
/*      */ 
/*      */     
/*      */     }
/*  383 */     else if (this.logger.isDebugEnabled()) {
/*  384 */       this.logger.debug("Al Contratto ID='" + contratto.getContrattoId() + "' e' associata l'Emittente ID='" + ((FinEmittente)cEmittenti.iterator().next()).getEmittenteId() + "'.");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  391 */     return cEmittenti;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection locateFactories(FinContratto contratto, String eventType) throws EventTypeNotSupportedException {
/*  402 */     checkSupported(eventType, new String[] { "PSO", "ASA", "SOT", "RSO", "RSA", "MCO", "MSQ", "SA", "MCC", "SOT", "MPF" });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  417 */     return filtraEmittenti(locateFactories(contratto), eventType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Collection locateFactories(FinIndirizzo indirizzo) throws EventTypeNotSupportedException {
/*  427 */     String msg = "Gestione non supportata!";
/*  428 */     if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  429 */     throw new EventTypeNotSupportedException(msg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection locateFactories(FinIndirizzo indirizzo, String eventType) throws EventTypeNotSupportedException {
/*  440 */     checkSupported(eventType, new String[] { "MCC" });
/*      */ 
/*      */ 
/*      */     
/*  444 */     return filtraEmittenti(locateFactories(indirizzo), eventType);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private Collection locateFactories(FinCointestazione cointestazione) throws EventTypeNotSupportedException {
/*  454 */     if (cointestazione == null) {
/*      */       
/*  456 */       String msg = "La Cointestazione e' NULL";
/*  457 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  458 */       throw new EventTypeNotSupportedException(new NullPointerException(msg));
/*      */     } 
/*      */ 
/*      */     
/*  462 */     if (!isValid(cointestazione)) {
/*      */       
/*  464 */       String msg = "La Cointestazione risulta non attiva, insensato recuperare le emittenti associate.";
/*  465 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  466 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*  469 */     if (!ArchUtils.isValid(cointestazione.getTipo())) {
/*      */       
/*  471 */       String msg = "Il 'tipo' della Cointestazione risulta non specificato, impossibile proseguire.";
/*  472 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  473 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*  476 */     FinCointestazione cointestazioneTarget = recuperaCointestazioneTarget(cointestazione);
/*      */     
/*  478 */     if (cointestazioneTarget.getContratto() == null || cointestazioneTarget.getContratto().size() <= 0) {
/*      */ 
/*      */       
/*  481 */       String msg = "Alla Cointestazione risulta non essere collegato alcun Contratto, impossibile proseguire.";
/*  482 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  483 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*  486 */     if (this.logger.isDebugEnabled()) {
/*  487 */       this.logger.debug("La Cointestazione e' collegata a " + cointestazioneTarget.getContratto().size() + " Contratti, ciclo sui Contratti.");
/*      */     }
/*      */ 
/*      */     
/*  491 */     Collection cUnion = null;
/*  492 */     Iterator iter = cointestazioneTarget.getContratto().iterator();
/*  493 */     while (iter.hasNext()) {
/*      */       
/*  495 */       FinContratto contratto = iter.next();
/*      */       
/*  497 */       if (cUnion == null) {
/*      */ 
/*      */         
/*      */         try {
/*  501 */           cUnion = locateFactories(contratto);
/*      */         }
/*  503 */         catch (EventTypeNotSupportedException e) {
/*      */ 
/*      */           
/*  506 */           if (this.logger.isDebugEnabled()) {
/*  507 */             this.logger.debug("Impossibile processare il singolo Contratto, ignoro.");
/*      */           }
/*      */         } 
/*      */         
/*      */         continue;
/*      */       } 
/*      */       
/*      */       try {
/*  515 */         cUnion.addAll(locateFactories(contratto));
/*      */       }
/*  517 */       catch (EventTypeNotSupportedException e) {
/*      */ 
/*      */         
/*  520 */         if (this.logger.isDebugEnabled()) {
/*  521 */           this.logger.debug("Impossibile processare il singolo Contratto, ignoro.");
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  527 */     if (cUnion == null) {
/*      */       
/*  529 */       String msg = "Impossibile recuperare le emittenti ciclando sui Contratti.";
/*  530 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  531 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/*  534 */     return removeDuplicates(cUnion);
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
/*      */   private FinCointestazione recuperaCointestazioneTarget(FinCointestazione cointestazione) throws EventTypeNotSupportedException {
/*  550 */     if ("S".equals(cointestazione.getTipo())) {
/*      */       
/*  552 */       if (this.logger.isDebugEnabled()) {
/*  553 */         this.logger.debug("La cointestazione e' il record di squadra, lavoro su quello.");
/*      */       }
/*  555 */       return cointestazione;
/*      */     } 
/*      */     
/*  558 */     if ("M".equals(cointestazione.getTipo())) {
/*      */ 
/*      */       
/*  561 */       if (this.logger.isDebugEnabled()) {
/*  562 */         this.logger.debug("La cointestazione e' di tipo MONOINTESTATARIO.");
/*      */       }
/*  564 */       if (cointestazione.getSquadra() != null) {
/*      */         
/*  566 */         this.logger.debug("La cointestazione ha comunque un record di squadra, prendo quello.");
/*      */         
/*  568 */         return cointestazione.getSquadra();
/*      */       } 
/*      */ 
/*      */       
/*  572 */       this.logger.debug("La cointestazione non ha record di squadra, prendo la cointestazione 'M'.");
/*      */       
/*  574 */       return cointestazione;
/*      */     } 
/*      */ 
/*      */     
/*  578 */     if ("C".equals(cointestazione.getTipo())) {
/*      */ 
/*      */       
/*  581 */       if (cointestazione.getSquadra() == null) {
/*      */         
/*  583 */         String str = "La Cointestazione risulta non essere associata al record di squadra, impossibile proseguire.";
/*  584 */         if (this.logger.isErrorEnabled()) this.logger.error(str); 
/*  585 */         throw new EventTypeNotSupportedException(str);
/*      */       } 
/*      */ 
/*      */       
/*  589 */       if (this.logger.isDebugEnabled()) {
/*  590 */         this.logger.debug("La cointestazione ha il record di squadra, lavoro su quello.");
/*      */       }
/*  592 */       return cointestazione.getSquadra();
/*      */     } 
/*      */ 
/*      */     
/*  596 */     String msg = "Il 'tipo' della Cointestazione risulta avere un valore non riconosciuto ('" + cointestazione.getTipo() + "'), impossibile proseguire.";
/*      */     
/*  598 */     if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  599 */     throw new EventTypeNotSupportedException(msg);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection locateFactories(FinCointestazione cointestazione, String eventType) throws EventTypeNotSupportedException {
/*  610 */     checkSupported(eventType, new String[] { "MSQ" });
/*      */ 
/*      */ 
/*      */     
/*  614 */     return filtraEmittenti(locateFactories(cointestazione), eventType);
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
/*      */   public Collection locateFactories(Object object, String eventType) throws EventTypeNotSupportedException, UndefinedEventOnEntityException {
/*  626 */     if (eventType != null)
/*      */     {
/*  628 */       checkSupported(eventType, new String[] { "PSO", "ASA", "SOT", "RSO", "RSA", "MSO", "MCO", "MCC", "MPF", "MSQ", "SA", "SOT" });
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
/*      */ 
/*      */     
/*  645 */     if (object instanceof FinSottoscrizione) {
/*      */       
/*      */       try {
/*      */         
/*  649 */         return locateFactories((FinSottoscrizione)object);
/*      */       }
/*  651 */       catch (SottoscrizioneInconsistenteException e) {
/*      */         
/*  653 */         throw new EventTypeNotSupportedException(e);
/*      */       } 
/*      */     }
/*      */     
/*  657 */     if (object instanceof FinCointestazione) {
/*      */       
/*  659 */       if (eventType != null)
/*      */       {
/*  661 */         return locateFactories((FinCointestazione)object, eventType);
/*      */       }
/*      */ 
/*      */       
/*  665 */       return locateFactories((FinCointestazione)object);
/*      */     } 
/*      */ 
/*      */     
/*  669 */     if (object instanceof FinContrattoBase) {
/*      */       
/*  671 */       if (eventType != null)
/*      */       {
/*  673 */         return locateFactories((FinContratto)object, eventType);
/*      */       }
/*      */ 
/*      */       
/*  677 */       return locateFactories((FinContratto)object);
/*      */     } 
/*      */ 
/*      */     
/*  681 */     if (object instanceof FinIndirizzo) {
/*      */       
/*  683 */       if (eventType != null)
/*      */       {
/*  685 */         return locateFactories((FinIndirizzo)object, eventType);
/*      */       }
/*      */ 
/*      */       
/*  689 */       return locateFactories((FinIndirizzo)object);
/*      */     } 
/*      */ 
/*      */     
/*  693 */     if (object instanceof FinSoggetto) {
/*      */       
/*  695 */       if (eventType != null)
/*      */       {
/*  697 */         return locateFactories((FinSoggetto)object, eventType);
/*      */       }
/*      */ 
/*      */       
/*  701 */       return locateFactories((FinSoggetto)object);
/*      */     } 
/*      */ 
/*      */     
/*  705 */     String str = "Entita' non supportata '" + object.getClass().getName() + "'.";
/*      */     
/*  707 */     if (this.logger.isErrorEnabled()) this.logger.error(str); 
/*  708 */     throw new EventTypeNotSupportedException(str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection locateFactories(FinSottoscrizione sottoscrizione) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException {
/*  719 */     if (this.logger.isDebugEnabled()) {
/*  720 */       this.logger.debug("Eseguo su sottoscrizione considerando che se alla Sottoscrizione sono gia' collegate Emittenti esse vengano rimosse e sostituite con quelle estratte dal componente.");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  725 */     return locateFactories(sottoscrizione, true, true, true, true);
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
/*      */   public Collection locateFactories(FinSottoscrizione sottoscrizione, String user) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException {
/*  737 */     Collection returnValue = locateFactories(sottoscrizione);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  742 */     Set emittSottoscrizioni = sottoscrizione.getEmitSottoscrizioni();
/*      */     
/*  744 */     Iterator emittSottoscrizioniIterator = emittSottoscrizioni.iterator();
/*      */     
/*  746 */     while (emittSottoscrizioniIterator.hasNext()) {
/*  747 */       FinSottoscrEmittente currentEmittSottoscrizioni = emittSottoscrizioniIterator.next();
/*      */       
/*  749 */       Utility.setInsertGSTDvalues((RasORMBean)currentEmittSottoscrizioni, user);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  754 */     return returnValue;
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
/*      */   public Collection locateFactories(FinSottoscrizione sottoscrizione, boolean process, boolean override, boolean check, boolean addEnabled) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException {
/*  767 */     checkFlagComposition(process, override, check, addEnabled);
/*      */     
/*  769 */     if (sottoscrizione.getEmitSottoscrizioni() != null)
/*      */     {
/*  771 */       if (sottoscrizione.getEmitSottoscrizioni().size() > 0)
/*      */       {
/*  773 */         if (!process) {
/*      */           
/*  775 */           ArrayList listaEmittenti = new ArrayList();
/*  776 */           Iterator iter = sottoscrizione.getEmitSottoscrizioni().iterator();
/*  777 */           while (iter.hasNext())
/*      */           {
/*  779 */             listaEmittenti.add(((FinSottoscrEmittente)iter.next()).getEmittente());
/*      */           }
/*      */ 
/*      */           
/*  783 */           if (this.logger.isDebugEnabled()) {
/*  784 */             this.logger.debug("La sottoscrizione ha gia' Emittenti associate e non ne e' richiesto il controllo. Fornisco tali emittenti effettuando pero' il controllo di duplicazione rimuovendo tutte le ripetizioni.");
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  790 */           return removeDuplicates(listaEmittenti);
/*      */         } 
/*      */       }
/*      */     }
/*      */     
/*  795 */     if (!ArchUtils.isValid(sottoscrizione.getTipoOperazione())) {
/*      */       
/*  797 */       String str = "Il 'tipoOperazione' per Sottoscrizione non e' definito.";
/*  798 */       if (this.logger.isErrorEnabled()) this.logger.error(str); 
/*  799 */       throw new EventTypeNotSupportedException(str);
/*      */     } 
/*      */     
/*  802 */     Collection emittentiEstratte = null;
/*      */     
/*  804 */     if (this.logger.isDebugEnabled()) {
/*  805 */       this.logger.debug("Gestione di una Sottoscrizione di tipo '" + sottoscrizione.getTipoOperazione() + "'.");
/*      */     }
/*      */     
/*  808 */     emittentiEstratte = eseguiImplemetazioneIdonea(sottoscrizione);
/*      */     
/*  810 */     if (this.logger.isDebugEnabled()) {
/*      */       
/*  812 */       String str = "Analisi e ricostruzione dell'associazione Sottoscrizione/Emittente con " + emittentiEstratte.size() + " Emittenti";
/*      */ 
/*      */ 
/*      */       
/*  816 */       for (Iterator iter = emittentiEstratte.iterator(); iter.hasNext(); ) {
/*      */         
/*  818 */         FinEmittente emittente = iter.next();
/*  819 */         str = str + ", ID='" + emittente.getEmittenteId() + "' - VISIBILITA='" + emittente.getVisibilita() + "'";
/*      */       } 
/*      */ 
/*      */       
/*  823 */       this.logger.debug(str + ".");
/*      */     } 
/*      */     
/*  826 */     compilaSottoscrizione(sottoscrizione, emittentiEstratte, process, override, check, addEnabled);
/*      */ 
/*      */     
/*  829 */     return emittentiEstratte;
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
/*      */   private Collection eseguiImplemetazioneIdonea(FinSottoscrizione sottoscrizione) throws EventTypeNotSupportedException {
/*  844 */     if ("MSO".equals(sottoscrizione.getTipoOperazione())) {
/*      */ 
/*      */       
/*  847 */       if (this.logger.isDebugEnabled()) {
/*  848 */         this.logger.debug("Eseguo sul Soggetto associato a Sottoscrizione mediante la proprieta' 'soggettoRichiedente'.");
/*      */       }
/*      */       
/*  851 */       return locateFactories(sottoscrizione.getSoggettoRichiedente(), sottoscrizione.getTipoOperazione());
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  858 */     if ("MCO".equals(sottoscrizione.getTipoOperazione()) || "MSQ".equals(sottoscrizione.getTipoOperazione()) || "SA".equals(sottoscrizione.getTipoOperazione()) || "ASA".equals(sottoscrizione.getTipoOperazione()) || "RSA".equals(sottoscrizione.getTipoOperazione()) || "RSO".equals(sottoscrizione.getTipoOperazione()) || "MCC".equals(sottoscrizione.getTipoOperazione()) || "SOT".equals(sottoscrizione.getTipoOperazione()) || "SOT".equals(sottoscrizione.getTipoOperazione()) || "PSO".equals(sottoscrizione.getTipoOperazione()) || "MPF".equals(sottoscrizione.getTipoOperazione())) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  881 */       if (this.logger.isDebugEnabled()) {
/*  882 */         this.logger.debug("Ciclo su tutti i Contratti della Sottoscrizione.");
/*      */       }
/*      */       
/*  885 */       if (this.logger.isDebugEnabled()) {
/*  886 */         this.logger.debug("Esistono " + sottoscrizione.getContratto().size() + " associative tra Contratto e Sottoscrizione.");
/*      */       }
/*      */       
/*  889 */       Collection c = null;
/*  890 */       Iterator iter = sottoscrizione.getContratto().iterator();
/*  891 */       while (iter.hasNext()) {
/*      */         
/*  893 */         FinSottoscrizioneCont sottCont = iter.next();
/*      */ 
/*      */         
/*  896 */         if (sottCont == null) {
/*      */           
/*  898 */           if (this.logger.isWarnEnabled()) {
/*  899 */             this.logger.warn("Un'associativa SottoscrizioneCont e' nulla, ignoro e passo alla successiva associativa.");
/*      */           }
/*      */ 
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/*  906 */         FinContrattoBase contratto = sottCont.getContratto();
/*  907 */         if (contratto == null) {
/*      */           
/*  909 */           if (this.logger.isWarnEnabled()) {
/*  910 */             this.logger.warn("All'associativa SottoscrizioneCont e' associato un Contratto NULL, ignoro e passo alla successiva associativa.");
/*      */           }
/*      */ 
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/*  917 */         if (this.logger.isDebugEnabled()) {
/*  918 */           this.logger.debug("Eseguo sul Contratto ID='" + contratto.getContrattoId() + "'.");
/*      */         }
/*      */         
/*  921 */         if (c == null) {
/*      */ 
/*      */           
/*      */           try {
/*  925 */             c = locateFactories(contratto, sottoscrizione.getTipoOperazione());
/*      */           
/*      */           }
/*  928 */           catch (EventTypeNotSupportedException e) {
/*      */ 
/*      */             
/*  931 */             if (this.logger.isDebugEnabled()) {
/*  932 */               this.logger.debug("Impossibile processare il singolo Contratto della Sottoscrizione, ignoro.");
/*      */             
/*      */             }
/*      */           }
/*  936 */           catch (UndefinedEventOnEntityException e) {
/*      */ 
/*      */             
/*  939 */             if (this.logger.isDebugEnabled()) {
/*  940 */               this.logger.debug("Impossibile processare il singolo Contratto della Sottoscrizione, ignoro.");
/*      */             }
/*      */           } 
/*      */ 
/*      */           
/*      */           continue;
/*      */         } 
/*      */         
/*      */         try {
/*  949 */           c.addAll(locateFactories(contratto, sottoscrizione.getTipoOperazione()));
/*      */         
/*      */         }
/*  952 */         catch (EventTypeNotSupportedException e) {
/*      */ 
/*      */           
/*  955 */           if (this.logger.isDebugEnabled()) {
/*  956 */             this.logger.debug("Impossibile processare il singolo Contratto della Sottoscrizione, ignoro.");
/*      */           
/*      */           }
/*      */         }
/*  960 */         catch (UndefinedEventOnEntityException e) {
/*      */ 
/*      */           
/*  963 */           if (this.logger.isDebugEnabled()) {
/*  964 */             this.logger.debug("Impossibile processare il singolo Contratto della Sottoscrizione, ignoro.");
/*      */           }
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  971 */       if (c == null) {
/*      */         
/*  973 */         String msg = "Impossibile recuperare le emittenti ciclando sui Contratti della Sottoscrizione.";
/*  974 */         if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/*  975 */         throw new EventTypeNotSupportedException(msg);
/*      */       } 
/*      */       
/*  978 */       if (this.logger.isDebugEnabled()) {
/*  979 */         this.logger.debug("Rimozione dei duplicati derivanti dal ciclo su tutti i Contratti.");
/*      */       }
/*      */       
/*  982 */       return filtraEmittenti(removeDuplicates(c), sottoscrizione.getTipoOperazione());
/*      */     } 
/*      */ 
/*      */     
/*  986 */     String str = "Il 'tipoOperazione' per Sottoscrizione non e' riconosciuto '" + sottoscrizione.getTipoOperazione() + "'.";
/*      */     
/*  988 */     if (this.logger.isErrorEnabled()) this.logger.error(str); 
/*  989 */     throw new EventTypeNotSupportedException(str);
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
/*      */   private void checkFlagComposition(boolean process, boolean override, boolean check, boolean addEnabled) throws EventTypeNotSupportedException {
/* 1004 */     if (!process)
/*      */       return; 
/* 1006 */     if (override)
/*      */       return; 
/* 1008 */     if (check)
/*      */       return; 
/* 1010 */     String str = "Configurazione di flag non permessa:   'process' = '" + process + "';" + "  'override' = '" + override + "';" + "  'check' = '" + check + "';" + "  'addEnabled' = '" + addEnabled + "'.";
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1015 */     if (this.logger.isErrorEnabled()) this.logger.error(str); 
/* 1016 */     throw new EventTypeNotSupportedException(str);
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
/*      */ 
/*      */ 
/*      */   
/*      */   private void compilaSottoscrizione(FinSottoscrizione sottoscrizione, Collection emittentiEstratte, boolean process, boolean override, boolean check, boolean addEnabled) throws EventTypeNotSupportedException {
/* 1038 */     if (override) {
/*      */       
/* 1040 */       if (this.logger.isDebugEnabled())
/*      */       {
/* 1042 */         this.logger.debug("Non e' richiesto il controllo delle emittenti gia' associate alla Sottoscrizione. La struttura Emittente/SottoscrEmittente/Sottoscrizione verrà ripulita.");
/*      */       }
/*      */ 
/*      */ 
/*      */       
/* 1047 */       sostituisciEmittenti(sottoscrizione, emittentiEstratte);
/*      */       
/* 1049 */       if (this.logger.isDebugEnabled())
/*      */       {
/* 1051 */         this.logger.debug("Ricostruzione associazioni Emittente/SottoscrEmittente/Sottoscrizione ultimata.");
/*      */       }
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/* 1058 */     if (this.logger.isDebugEnabled())
/*      */     {
/* 1060 */       this.logger.debug("Ci sono " + sottoscrizione.getEmitSottoscrizioni().size() + " emittenti pre-collegate alla Sottoscrizione.");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/* 1065 */     Collection listaEmittentiNonInSottoscrizione = new ArrayList();
/* 1066 */     Collection listaEmittentiSuperflueInSottoscrizione = new ArrayList();
/*      */ 
/*      */ 
/*      */     
/* 1070 */     Iterator iterator = sottoscrizione.getEmitSottoscrizioni().iterator();
/* 1071 */     while (iterator.hasNext()) {
/*      */       
/* 1073 */       FinSottoscrEmittente sottoscrEmittenteDiS = iterator.next();
/*      */       
/* 1075 */       FinEmittente emittenteDiS = sottoscrEmittenteDiS.getEmittente();
/*      */       
/* 1077 */       boolean trovataTraEstratte = false;
/* 1078 */       Iterator iterator1 = emittentiEstratte.iterator();
/* 1079 */       while (iterator1.hasNext()) {
/*      */         
/* 1081 */         FinEmittente emittenteEstr = iterator1.next();
/*      */         
/* 1083 */         if (emittenteEstr == emittenteDiS) {
/*      */           
/* 1085 */           trovataTraEstratte = true;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/* 1090 */       if (!trovataTraEstratte)
/*      */       {
/* 1092 */         listaEmittentiSuperflueInSottoscrizione.add(emittenteDiS);
/*      */       }
/*      */     } 
/*      */ 
/*      */     
/* 1097 */     for (Iterator iter = emittentiEstratte.iterator(); iter.hasNext(); ) {
/*      */       
/* 1099 */       FinEmittente emittenteEstr = iter.next();
/*      */       
/* 1101 */       boolean trovataTraGiaPresenti = false;
/* 1102 */       Iterator iterator1 = sottoscrizione.getEmitSottoscrizioni().iterator();
/* 1103 */       while (iterator1.hasNext()) {
/*      */         
/* 1105 */         FinSottoscrEmittente sottoscrEmittenteDiS = iterator1.next();
/*      */         
/* 1107 */         FinEmittente emittenteDiS = sottoscrEmittenteDiS.getEmittente();
/*      */         
/* 1109 */         if (emittenteEstr == emittenteDiS) {
/*      */           
/* 1111 */           trovataTraGiaPresenti = true;
/*      */           
/*      */           break;
/*      */         } 
/*      */       } 
/* 1116 */       if (!trovataTraGiaPresenti)
/*      */       {
/* 1118 */         listaEmittentiNonInSottoscrizione.add(emittenteEstr);
/*      */       }
/*      */     } 
/*      */     
/* 1122 */     if (this.logger.isDebugEnabled())
/*      */     {
/* 1124 */       this.logger.debug("Esistono " + listaEmittentiSuperflueInSottoscrizione.size() + " Emittenti gia' presenti in " + "Sottoscrizione ma non estratte e quindi da considerare SUPERFLUE.");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1131 */     if (this.logger.isDebugEnabled())
/*      */     {
/* 1133 */       this.logger.debug("Esistono " + listaEmittentiNonInSottoscrizione.size() + " Emittenti estratte ma non gia' presenti in Sottoscrizione.");
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1139 */     if (listaEmittentiSuperflueInSottoscrizione.size() > 0) {
/*      */       
/* 1141 */       String msg = "Esistono " + listaEmittentiSuperflueInSottoscrizione.size() + " Emittenti superflue, condizione d'errore";
/*      */ 
/*      */       
/* 1144 */       if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/* 1145 */       throw new EventTypeNotSupportedException(msg);
/*      */     } 
/*      */     
/* 1148 */     if (listaEmittentiNonInSottoscrizione.size() > 0) {
/*      */       
/* 1150 */       if (!addEnabled) {
/*      */         
/* 1152 */         String msg = "Esistono " + listaEmittentiNonInSottoscrizione.size() + " Emittenti da aggiungere alla Sottoscrizione ma " + "l'aggiunta e' vietata in virtu' del valore " + "false della flag 'addEnabled'.";
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1157 */         if (this.logger.isErrorEnabled()) this.logger.error(msg); 
/* 1158 */         throw new EventTypeNotSupportedException(msg);
/*      */       } 
/*      */       
/* 1161 */       if (this.logger.isDebugEnabled())
/*      */       {
/* 1163 */         this.logger.debug("Aggiungo in Sottoscrizione le " + listaEmittentiNonInSottoscrizione.size() + " Emittenti estratte ma non gia' presenti in Sottoscrizione.");
/*      */       }
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1169 */       sostituisciEmittenti(sottoscrizione, emittentiEstratte);
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
/*      */   private void sostituisciEmittenti(FinSottoscrizione sottoscrizione, Collection emittentiEstratte) {
/* 1181 */     sottoscrizione.setEmitSottoscrizioni(new HashSet());
/*      */     
/* 1183 */     for (Iterator iter = emittentiEstratte.iterator(); iter.hasNext(); ) {
/*      */       
/* 1185 */       FinEmittente emittente = iter.next();
/*      */       
/* 1187 */       FinSottoscrEmittente se = new FinSottoscrEmittente();
/* 1188 */       se.setEmittente(emittente);
/* 1189 */       se.setSottoscrizione(sottoscrizione);
/* 1190 */       sottoscrizione.getEmitSottoscrizioni().add(se);
/*      */       
/* 1192 */       emittente.setSottoscrEmittenti(new HashSet());
/* 1193 */       emittente.getSottoscrEmittenti().add(se);
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
/*      */   private Collection removeDuplicates(Collection c) {
/* 1207 */     if (c == null || c.size() <= 0) return c;
/*      */     
/* 1209 */     ArrayList listaRitorno = new ArrayList();
/*      */     
/* 1211 */     for (Iterator iter = c.iterator(); iter.hasNext(); ) {
/*      */       
/* 1213 */       FinEmittente emittenteDaC = iter.next();
/*      */       
/* 1215 */       boolean alreadyInList = false;
/* 1216 */       Iterator iterator = listaRitorno.iterator();
/* 1217 */       while (iterator.hasNext()) {
/*      */         
/* 1219 */         FinEmittente emittenteInLista = iterator.next();
/* 1220 */         if (emittenteDaC == emittenteInLista) {
/*      */           
/* 1222 */           alreadyInList = true;
/*      */           
/*      */           break;
/*      */         } 
/* 1226 */         if (emittenteDaC != null && emittenteInLista != null && emittenteDaC.getEmittenteId() != null && emittenteInLista.getEmittenteId() != null)
/*      */         {
/*      */ 
/*      */           
/* 1230 */           if (emittenteDaC.getEmittenteId().intValue() == emittenteInLista.getEmittenteId().intValue()) {
/*      */ 
/*      */             
/* 1233 */             alreadyInList = true;
/*      */             
/*      */             break;
/*      */           } 
/*      */         }
/*      */       } 
/* 1239 */       if (!alreadyInList)
/*      */       {
/* 1241 */         listaRitorno.add(emittenteDaC);
/*      */       }
/*      */     } 
/*      */     
/* 1245 */     return listaRitorno;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Collection checkFactories(FinSottoscrizione sottoscrizione) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException {
/* 1256 */     if (this.logger.isDebugEnabled()) {
/* 1257 */       this.logger.debug("Utilizzo il componente come un semplice strumento di confronto tra le Emittenti estratte e le Emittenti gia' associate alla Sottoscrizione.");
/*      */     }
/*      */ 
/*      */     
/* 1261 */     return locateFactories(sottoscrizione, true, false, true, false);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void reloadEventCache() throws RasException {
/* 1270 */     reloadEventCache(isMultithreadedCacheReloading());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void reloadEventCache(boolean multiThreaded) throws RasException {
/* 1278 */     if (this.eventMapManager != null) {
/*      */       
/* 1280 */       if (!multiThreaded)
/*      */       {
/* 1282 */         this.eventMapManager.reloadCache();
/*      */       }
/*      */       else
/*      */       {
/* 1286 */         Thread t = new ReloadCacheThread(this.eventMapManager);
/* 1287 */         t.start();
/*      */       
/*      */       }
/*      */     
/*      */     }
/* 1292 */     else if (this.logger.isDebugEnabled()) {
/* 1293 */       this.logger.debug("IEventMapManager non associato all'IFactoryLocator, impossibile rigenerare la cache.");
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
/*      */   public boolean isMultithreadedCacheReloading() {
/* 1305 */     return this.multithreadedCacheReloading;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMultithreadedCacheReloading(boolean multithreadedCacheReloading) {
/* 1316 */     this.multithreadedCacheReloading = multithreadedCacheReloading;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\impl\FactoryLocatorImpl.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */