/*      */ package it.ras.arco.service;
/*      */ 
/*      */ import it.ras.arco.bean.FinAbstractParametrizedBean;
/*      */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*      */ import it.ras.arco.bean.FinEmittente;
/*      */ import it.ras.arco.bean.FinEntitaParametro;
/*      */ import it.ras.arco.bean.FinEntitaParametroAdapterBase;
/*      */ import it.ras.arco.bean.FinParametro;
/*      */ import it.ras.arco.bean.FinPrezzo;
/*      */ import it.ras.arco.bean.FinProdotto;
/*      */ import it.ras.arco.bean.FinProdottoLinea;
/*      */ import it.ras.arco.bean.IGSTDInitVisitor;
/*      */ import it.ras.arco.bean.IGSTDInitializable;
/*      */ import it.ras.arco.bean.ParameterComparator;
/*      */ import it.ras.arco.cp.bean.GSTDInitializer;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import it.ras.flag.bean.TblColonneDecodifiche;
/*      */ import it.ras.flag.bean.TblDecodifiche;
/*      */ import it.ras.flag.bean.TblLegameDecodifiche;
/*      */ import it.ras.flag.config.CodesTableManager;
/*      */ import it.ras.flag.exception.RasException;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.exception.RasValidationSignal;
/*      */ import it.ras.flag.service.AbstractRasService;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.text.DateFormat;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Collection;
/*      */ import java.util.Comparator;
/*      */ import java.util.Date;
/*      */ import java.util.GregorianCalendar;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Set;
/*      */ import java.util.StringTokenizer;
/*      */ import java.util.TreeSet;
/*      */ import java.util.regex.Matcher;
/*      */ import java.util.regex.Pattern;
/*      */ import org.apache.commons.beanutils.PropertyUtils;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ import org.hibernate.LazyInitializationException;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class CatalogoProdottiSRV
/*      */   extends AbstractRasService
/*      */ {
/*   59 */   private Log logger = LogFactory.getLog(getClass());
/*      */   
/*   61 */   private String moduloSingleEntity = null;
/*   62 */   private String moduloEntityList = null;
/*   63 */   private String moduloCancellaPrezziDiAF = null;
/*      */   
/*   65 */   private IFinEntitaParametroBuilder finEntitaParametroBuilder = null;
/*      */   
/*   67 */   private String esecuzioneBatch = null;
/*      */   
/*   69 */   private CodesTableManager codesTableManager = null;
/*   70 */   private String gestioneCodiceAntAbilitato = "false";
/*   71 */   private String gestioneCodiceFabbricaAbilitato = "false";
/*      */ 
/*      */   
/*      */   public static final String ATT_FIN_ID = "ATT_FIN_ID";
/*      */ 
/*      */   
/*      */   public static final String DATA_ULT_MOD = "DATA_ULT_MOD";
/*      */ 
/*      */   
/*      */   public static final String DEROGA = "deroga";
/*      */ 
/*      */   
/*      */   public static final String WARNING = "warning";
/*      */ 
/*      */   
/*      */   public static final String ERROR = "error";
/*      */ 
/*      */   
/*      */   public static final int MAXLENGTH_NMB_INT = 9;
/*      */ 
/*      */   
/*      */   public static final int MAXLENGTH_NMB_DEC = 2;
/*      */ 
/*      */   
/*      */   public static final String TABELLA_DECODIFICA_CODICE_FABBRICA = "ATTIVITA_FINANZIARIA";
/*      */ 
/*      */   
/*      */   public static final String PREFISSO_DECODIFICA_CODICE_FABBRICA = "CODICE_ATT_FIN_";
/*      */   
/*      */   public static final String SUFFISSO_DECODIFICA_CODICE_ARCO = "ARCO";
/*      */   
/*      */   public static final String SUFFISSO_DECODIFICA_CODICE_ESTERNO = "ESTERNO";
/*      */   
/*      */   public static final String SUFFISSO_DECODIFICA_CODICE_ANT = "ANT";
/*      */   
/*      */   public static final String ENTITA_DA_INSERIRE_MAP_CONTAINER_KEY = "ENTITA_DA_INSERIRE";
/*      */   
/*      */   public static final String UTENTE_OPERAZIONE_MAP_CONTAINER_KEY = "UTENTE_OPERAZIONE";
/*      */   
/*      */   public static final String regex = "(\\d+\\s*([- | ,]\\s*\\d+\\s*)*)*";
/*      */ 
/*      */   
/*      */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/*  114 */     if (isBatchExecution())
/*      */     {
/*  116 */       return true;
/*      */     }
/*      */     
/*  119 */     RasORMBean bean = (RasORMBean)map.getAppl("ENTITA_DA_INSERIRE");
/*      */ 
/*      */     
/*  122 */     RasServiceException ex = new RasServiceException();
/*      */ 
/*      */     
/*  125 */     Set listaParametriDaNonValidare = null;
/*  126 */     if (bean instanceof FinAbstractParametrizedBean) {
/*      */       
/*  128 */       listaParametriDaNonValidare = escludiParametriDaNonValidare(bean);
/*  129 */       HashMap setDiValidationSignal = validateParameters(bean);
/*  130 */       if (setDiValidationSignal != null) {
/*      */         
/*  132 */         for (Iterator iterator2 = ((Set)setDiValidationSignal.get("deroga")).iterator(); iterator2.hasNext();)
/*      */         {
/*  134 */           ex.addDeroga(iterator2.next());
/*      */         }
/*      */         
/*  137 */         for (Iterator iterator1 = ((Set)setDiValidationSignal.get("warning")).iterator(); iterator1.hasNext();)
/*      */         {
/*  139 */           ex.addWarning(iterator1.next());
/*      */         }
/*      */         
/*  142 */         for (Iterator i = ((Set)setDiValidationSignal.get("error")).iterator(); i.hasNext();)
/*      */         {
/*  144 */           ex.addError(i.next());
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  150 */     if (bean instanceof FinAttivitaFinanziaria) {
/*      */       
/*  152 */       FinProdottoLinea prodLinea = null;
/*      */       
/*      */       try {
/*  155 */         prodLinea = ((FinAttivitaFinanziaria)bean).getProdotto().iterator().next();
/*      */       }
/*  157 */       catch (Exception e) {
/*      */         
/*  159 */         RasValidationSignal s1 = new RasValidationSignal("it.ras.arco.cp.errori.attFin.censimento.noprodotto");
/*  160 */         ex.addError(s1);
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  165 */     if (bean instanceof FinProdotto) {
/*      */       
/*      */       try {
/*      */         
/*  169 */         applicaParametriAdAF((FinProdotto)bean);
/*      */       }
/*  171 */       catch (RasServiceException e) {
/*      */         
/*  173 */         e.cloneSignals((RasException)ex);
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  179 */     if (!ex.signalsPresent()) {
/*      */       
/*  181 */       RasValidationSignal vs = new RasValidationSignal("it.ras.arco.cp.segnalazioni.censimento.warning.conferma");
/*  182 */       ex.addWarning(vs);
/*      */       
/*  184 */       if (bean instanceof FinAbstractParametrizedBean)
/*      */       {
/*  186 */         ((FinAbstractParametrizedBean)bean).congelaListaParametri();
/*      */       }
/*      */       
/*  189 */       throw ex;
/*      */     } 
/*      */ 
/*      */     
/*  193 */     if (ex.getSignals(0) != null && ex.getSignals(0).size() > 0)
/*      */     {
/*  195 */       if (listaParametriDaNonValidare != null && listaParametriDaNonValidare.size() > 0)
/*      */       {
/*  197 */         reintegraParametriDaNonValidare(bean, listaParametriDaNonValidare);
/*      */       }
/*      */     }
/*      */     
/*  201 */     if (bean instanceof FinAbstractParametrizedBean)
/*      */     {
/*  203 */       ((FinAbstractParametrizedBean)bean).congelaListaParametri();
/*      */     }
/*      */     
/*  206 */     throw ex;
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
/*      */   private Set escludiParametriDaNonValidare(RasORMBean bean) {
/*  220 */     if (!(bean instanceof FinAbstractParametrizedBean)) {
/*  221 */       return null;
/*      */     }
/*  223 */     if (((FinAbstractParametrizedBean)bean).getListaParametri() == null || ((FinAbstractParametrizedBean)bean).getListaParametri().size() <= 0)
/*      */     {
/*  225 */       return null;
/*      */     }
/*      */     
/*  228 */     Set listaParametriPurgata = new TreeSet((Comparator)new ParameterComparator());
/*  229 */     Set listaParametriEsclusi = new TreeSet((Comparator)new ParameterComparator());
/*      */     
/*  231 */     for (Iterator iter = ((FinAbstractParametrizedBean)bean).getListaParametri().iterator(); iter.hasNext(); ) {
/*      */       
/*  233 */       FinEntitaParametro entitaParametro = iter.next();
/*  234 */       FinParametro parametro = entitaParametro.getParametro();
/*      */       
/*  236 */       if (!isCompulsoryFor(parametro, (FinAbstractParametrizedBean)bean)) {
/*      */         
/*  238 */         if (!hasValue(entitaParametro)) {
/*      */           
/*  240 */           listaParametriEsclusi.add(entitaParametro);
/*      */           
/*      */           continue;
/*      */         } 
/*  244 */         listaParametriPurgata.add(entitaParametro);
/*      */         
/*      */         continue;
/*      */       } 
/*      */       
/*  249 */       listaParametriPurgata.add(entitaParametro);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  255 */     FinAbstractParametrizedBean parametrizedBean = (FinAbstractParametrizedBean)bean;
/*      */     
/*  257 */     if (parametrizedBean.getListaParametri() == null) {
/*      */       
/*  259 */       parametrizedBean.setListaParametri(listaParametriPurgata);
/*      */     }
/*      */     else {
/*      */       
/*  263 */       int nParRimossi = 0;
/*  264 */       for (Iterator iterator = listaParametriEsclusi.iterator(); iterator.hasNext(); ) {
/*      */         
/*  266 */         Object o = iterator.next();
/*  267 */         boolean b = parametrizedBean.getListaParametri().remove(o);
/*  268 */         if (b)
/*      */         {
/*  270 */           nParRimossi++;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  276 */     return listaParametriEsclusi;
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
/*      */   private boolean hasValue(FinEntitaParametro entitaParametro) {
/*  288 */     return ArchUtils.isValid(entitaParametro.getValore());
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
/*      */   private boolean isCompulsoryInGeneral(FinParametro parametro) {
/*  300 */     if ("S".equals(parametro.getFlagParametroObbl()) || "Y".equals(parametro.getFlagParametroObbl()) || "1".equals(parametro.getFlagParametroObbl()))
/*      */     {
/*      */ 
/*      */ 
/*      */       
/*  305 */       return true;
/*      */     }
/*      */ 
/*      */     
/*  309 */     return false;
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
/*      */   private boolean isCompulsoryFor(FinParametro parametro, FinAbstractParametrizedBean bean) {
/*  322 */     if (parametro.getTipoEntitaAss().intValue() == 0)
/*      */     {
/*  324 */       if (bean instanceof FinEmittente)
/*      */       {
/*  326 */         return isCompulsoryInGeneral(parametro);
/*      */       }
/*      */     }
/*      */     
/*  330 */     if (parametro.getTipoEntitaAss().intValue() == 1)
/*      */     {
/*  332 */       if (bean instanceof FinProdotto)
/*      */       {
/*  334 */         return isCompulsoryInGeneral(parametro);
/*      */       }
/*      */     }
/*      */     
/*  338 */     if (parametro.getTipoEntitaAss().intValue() == 2)
/*      */     {
/*  340 */       if (bean instanceof FinAttivitaFinanziaria)
/*      */       {
/*  342 */         return isCompulsoryInGeneral(parametro);
/*      */       }
/*      */     }
/*      */     
/*  346 */     return false;
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
/*      */   private void reintegraParametriDaNonValidare(RasORMBean bean, Set listaParametriDaNonValidare) {
/*  358 */     if (!(bean instanceof FinAbstractParametrizedBean)) {
/*      */       return;
/*      */     }
/*  361 */     if (listaParametriDaNonValidare == null || listaParametriDaNonValidare.size() <= 0) {
/*      */       return;
/*      */     }
/*  364 */     for (Iterator iter = listaParametriDaNonValidare.iterator(); iter.hasNext(); ) {
/*      */       
/*  366 */       FinEntitaParametro entitaParametro = iter.next();
/*  367 */       ((FinAbstractParametrizedBean)bean).getListaParametri().add(entitaParametro);
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
/*      */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  379 */     LogFactory.getLog(getClass()).debug("CP: SigleModuleService configurato sui moduli\n - 1. " + this.moduloSingleEntity + " per l'inserimento della 'single entity';\n" + " - 2. " + this.moduloEntityList + " per l'inserimento della 'entity list'.");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  385 */     RasORMBean bean = (RasORMBean)map.getAppl("ENTITA_DA_INSERIRE");
/*      */     
/*  387 */     String utenteOperazione = (String)map.getAppl("UTENTE_OPERAZIONE");
/*  388 */     if (!ArchUtils.isValid(utenteOperazione))
/*      */     {
/*  390 */       utenteOperazione = "CATALOGO PRODOTTI";
/*      */     }
/*      */ 
/*      */     
/*  394 */     if (bean instanceof IGSTDInitializable) {
/*      */       
/*  396 */       GSTDInitializer gstdi = new GSTDInitializer();
/*      */       
/*  398 */       gstdi.setUtenteUltimaOperazione(utenteOperazione);
/*  399 */       gstdi.setInitializingNotSlave(isBatchExecution());
/*      */       
/*  401 */       ((IGSTDInitializable)bean).accept((IGSTDInitVisitor)gstdi);
/*      */ 
/*      */     
/*      */     }
/*  405 */     else if (getLogger().isDebugEnabled()) {
/*      */       
/*  407 */       getLogger().debug("Impossibile inizializzare i campi architetturali perche' il bean non implementa l'interfaccia 'IGSTDInitializable'.");
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  416 */     if (bean instanceof FinEmittente) {
/*      */       
/*  418 */       LogFactory.getLog(getClass()).debug("Ho preso dal MapContainer un FinEMITTENTE!");
/*      */       
/*  420 */       return getModuleManager().execModule(this.moduloSingleEntity, map);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  427 */     if (bean instanceof FinProdotto) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  435 */       MapContainer mcReturn = getModuleManager().execModule(this.moduloSingleEntity, map);
/*      */       
/*  437 */       Iterator iteratorAttFin = null;
/*      */       
/*      */       try {
/*  440 */         if (!isBatchExecution() && ((FinProdotto)bean).getAttFin() != null) {
/*      */           
/*  442 */           iteratorAttFin = ((FinProdotto)bean).getAttFin().iterator();
/*      */           
/*  444 */           while (iteratorAttFin.hasNext()) {
/*      */             
/*  446 */             FinProdottoLinea prodottoLinea = iteratorAttFin.next();
/*  447 */             if ("S".equals(prodottoLinea.getFlagEsistenza())) {
/*      */               
/*  449 */               FinAttivitaFinanziaria attivitaFinanziaria = prodottoLinea.getAttFin();
/*  450 */               if ("S".equals(attivitaFinanziaria.getFlagEsistenza()))
/*      */               {
/*  452 */                 if (deveGestireCodiceFabbrica(attivitaFinanziaria))
/*      */                 {
/*  454 */                   gestisciCodiceFabbrica(attivitaFinanziaria, map);
/*      */                 }
/*      */                 
/*  457 */                 if (deveGestireCodiceAnt(attivitaFinanziaria))
/*      */                 {
/*  459 */                   gestisciCodiceAnt(attivitaFinanziaria, map);
/*      */                 }
/*      */               }
/*      */             
/*      */             } 
/*      */           } 
/*      */         } 
/*  466 */       } catch (LazyInitializationException lie) {
/*      */         
/*  468 */         LogFactory.getLog(getClass()).debug("Le attFin non sono state mai caricate, quindi neanche modificate!");
/*      */       } 
/*      */ 
/*      */       
/*  472 */       return mcReturn;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  542 */     if (bean instanceof FinAttivitaFinanziaria) {
/*      */       
/*  544 */       LogFactory.getLog(getClass()).warn("Lancio il moduloSingleEntity sul bean ATTFIN!");
/*      */ 
/*      */       
/*  547 */       Integer attFinId = null;
/*      */       
/*  549 */       FinAttivitaFinanziaria attivita = (FinAttivitaFinanziaria)bean;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  587 */       getModuleManager().execModule(this.moduloSingleEntity, map);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  602 */       if (!isBatchExecution()) {
/*      */         
/*  604 */         Set storicoModificato = ((FinAttivitaFinanziaria)bean).getPrezzo();
/*  605 */         if (storicoModificato == null || storicoModificato.size() <= 0) {
/*      */           
/*  607 */           LogFactory.getLog(getClass()).debug("CP: Non ci sono prezzi storici da modificare.");
/*      */         }
/*      */         else {
/*      */           
/*  611 */           LogFactory.getLog(getClass()).debug("CP: Ci sono " + storicoModificato.size() + " prezzi storici da modificare.");
/*      */ 
/*      */ 
/*      */           
/*  615 */           for (Iterator iter = storicoModificato.iterator(); iter.hasNext(); ) {
/*      */             
/*  617 */             FinPrezzo prezzo = iter.next();
/*  618 */             if (prezzo.getAttivitaFin() == null) {
/*      */               
/*  620 */               LogFactory.getLog(getClass()).warn("CP: Il prezzo non aveva l'Attivita'Finanziaria associata!");
/*      */ 
/*      */               
/*  623 */               prezzo.setAttivitaFin((FinAttivitaFinanziaria)bean);
/*      */             } 
/*      */           } 
/*      */           
/*  627 */           map.putAppl("COLLECTION_DA_INSERIRE", storicoModificato);
/*  628 */           return getModuleManager().execModule(this.moduloEntityList, map);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  634 */       if (!isBatchExecution()) {
/*      */         
/*  636 */         if (deveGestireCodiceFabbrica(attivita))
/*      */         {
/*  638 */           gestisciCodiceFabbrica(attivita, map);
/*      */         }
/*      */         
/*  641 */         if (deveGestireCodiceAnt(attivita))
/*      */         {
/*  643 */           gestisciCodiceAnt(attivita, map);
/*      */         }
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*  649 */       return new MapContainer();
/*      */     } 
/*      */     
/*  652 */     if (bean instanceof FinPrezzo) {
/*      */       
/*  654 */       LogFactory.getLog(getClass()).debug("Ho preso dal MapContainer un FinPREZZO!");
/*      */       
/*  656 */       return getModuleManager().execModule(this.moduloSingleEntity, map);
/*      */     } 
/*      */     
/*  659 */     LogFactory.getLog(getClass()).debug("Ok, ho ricevuto un " + bean.getClass().getName().substring(17));
/*  660 */     return getModuleManager().execModule(this.moduloSingleEntity, map);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean deveGestireCodiceFabbrica(FinAttivitaFinanziaria finanziaria) {
/*  670 */     if ("false".equalsIgnoreCase(getGestioneCodiceFabbricaAbilitato()))
/*      */     {
/*  672 */       return false;
/*      */     }
/*      */     
/*  675 */     if (this.codesTableManager == null) {
/*      */       
/*  677 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  679 */         getLogger().debug("CP: Non e' stato inizializzato il CodesTableManager. Impossibile determinare se la decodifica del codice fabbrica e' necessaria.");
/*      */       }
/*      */ 
/*      */       
/*  683 */       return false;
/*      */     } 
/*      */     
/*  686 */     if (!"S".equals(finanziaria.getFlagEsistenza())) {
/*      */       
/*  688 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  690 */         getLogger().debug("CP: L'attivita' finanziaria ha flag esistenza non a S quindi nessuna gestione necessaria.");
/*      */       }
/*      */       
/*  693 */       return false;
/*      */     } 
/*      */     
/*  696 */     if (finanziaria.getAttivitaFinId() == null) {
/*      */       
/*  698 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  700 */         getLogger().debug("CP: L'Id all'attivita' finanziaria non e' stato ancora assegnato. Impossibile registrare la nuova decodifica.");
/*      */       }
/*      */ 
/*      */       
/*  704 */       return false;
/*      */     } 
/*      */     
/*  707 */     if (!ArchUtils.isValid(finanziaria.getCodAttFinExt())) {
/*      */       
/*  709 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  711 */         getLogger().debug("CP: Il codice esterno 'codAttFinExt' non e' stato specificato, impossibile registrare la nuova decodifica.");
/*      */       }
/*      */ 
/*      */       
/*  715 */       return false;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  722 */     String valoreAttuale = null;
/*      */     
/*  724 */     valoreAttuale = this.codesTableManager.decodeValue("ATTIVITA_FINANZIARIA", "" + ((FinProdottoLinea)finanziaria.getProdotto().iterator().next()).getProdotto().getEmittente().getEmittenteId(), "CODICE_ATT_FIN_ARCO", "CODICE_ATT_FIN_" + ((FinProdottoLinea)finanziaria.getProdotto().iterator().next()).getProdotto().getEmittente().getEmittenteId(), finanziaria.getAttivitaFinId());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  748 */     if (getLogger().isDebugEnabled())
/*      */     {
/*  750 */       if (valoreAttuale.equals(finanziaria.getCodAttFinExt()))
/*      */       {
/*  752 */         getLogger().debug("CP: Il codice esterno registrato attualmente in codestable è '" + valoreAttuale + "', diverso dal codice specificato ('" + finanziaria.getCodAttFinExt() + "'). Il codice non verra' sostituito.");
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  758 */     return !ArchUtils.isValid(valoreAttuale);
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
/*      */   private boolean deveGestireCodiceAnt(FinAttivitaFinanziaria finanziaria) {
/*  770 */     if ("false".equalsIgnoreCase(getGestioneCodiceAntAbilitato()))
/*      */     {
/*  772 */       return false;
/*      */     }
/*      */     
/*  775 */     if (this.codesTableManager == null) {
/*      */       
/*  777 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  779 */         getLogger().debug("CP: Non e' stato inizializzato il CodesTableManager. Impossibile determinare se la decodifica del codice ANT e' necessaria.");
/*      */       }
/*      */ 
/*      */       
/*  783 */       return false;
/*      */     } 
/*      */     
/*  786 */     if (!"S".equals(finanziaria.getFlagEsistenza())) {
/*      */       
/*  788 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  790 */         getLogger().debug("CP: L'attivita' finanziaria ha flag esistenza non a S quindi nessuna gestione necessaria.");
/*      */       }
/*      */       
/*  793 */       return false;
/*      */     } 
/*      */     
/*  796 */     if (finanziaria.getAttivitaFinId() == null) {
/*      */       
/*  798 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  800 */         getLogger().debug("CP: L'Id all'attivita' finanziaria non e' stato ancora assegnato. Impossibile registrare la nuova decodifica.");
/*      */       }
/*      */ 
/*      */       
/*  804 */       return false;
/*      */     } 
/*      */     
/*  807 */     if (!ArchUtils.isValid(finanziaria.getCodiceAnt())) {
/*      */       
/*  809 */       if (getLogger().isDebugEnabled())
/*      */       {
/*  811 */         getLogger().debug("CP: Il codice ANT non e' stato specificato, impossibile registrare la nuova decodifica.");
/*      */       }
/*      */ 
/*      */       
/*  815 */       return false;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  822 */     String valoreAttuale = null;
/*      */     
/*  824 */     valoreAttuale = this.codesTableManager.decodeValue("ATTIVITA_FINANZIARIA", "" + ((FinProdottoLinea)finanziaria.getProdotto().iterator().next()).getProdotto().getEmittente().getEmittenteId(), "CODICE_ATT_FIN_ARCO", "CODICE_ATT_FIN_ANT", finanziaria.getAttivitaFinId());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  844 */     if (getLogger().isDebugEnabled())
/*      */     {
/*  846 */       if (valoreAttuale.equals(finanziaria.getCodiceAnt()))
/*      */       {
/*  848 */         getLogger().debug("CP: Il codice ANT registrato attualmente in codestable è '" + valoreAttuale + "', diverso dal codice specificato ('" + finanziaria.getCodiceAnt() + "'). Il codice non verra' sostituito.");
/*      */       }
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  854 */     return !ArchUtils.isValid(valoreAttuale);
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
/*      */   private boolean isBatchExecution() {
/*  866 */     if (ArchUtils.isValid(getEsecuzioneBatch()))
/*      */     {
/*  868 */       if ("true".equalsIgnoreCase(getEsecuzioneBatch()))
/*      */       {
/*  870 */         return true;
/*      */       }
/*      */     }
/*      */     
/*  874 */     return false;
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
/*      */   private void gestisciCodiceAnt(FinAttivitaFinanziaria attivita, MapContainer map) throws RasServiceException {
/*  887 */     gestisciCodiceInCodesTable(map, "ATTIVITA_FINANZIARIA", "CODICE_ATT_FIN_ANT", attivita.getCodiceAnt(), "CODICE_ATT_FIN_ARCO", "" + attivita.getAttivitaFinId());
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
/*      */   private void gestisciCodiceFabbrica(FinAttivitaFinanziaria attivita, MapContainer map) throws RasServiceException {
/*  908 */     gestisciCodiceInCodesTable(map, "ATTIVITA_FINANZIARIA", "CODICE_ATT_FIN_" + ((FinProdottoLinea)attivita.getProdotto().iterator().next()).getProdotto().getEmittente().getEmittenteId(), attivita.getCodAttFinExt(), "CODICE_ATT_FIN_ARCO", "" + attivita.getAttivitaFinId());
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
/*      */   
/*      */   private void gestisciCodiceInCodesTable(MapContainer mc, String codesTable, String nomeColonnaIn, String valoreColonnaIn, String nomeColonnaOut, String valoreColonnaOut) throws RasServiceException {
/*  931 */     mc.putAppl("NOME_TABELLA_S_PER_DECODIFICA", codesTable);
/*      */     
/*  933 */     TblDecodifiche decod = null;
/*  934 */     int recordIdMax = 0;
/*      */ 
/*      */     
/*      */     try {
/*  938 */       LogFactory.getLog(getClass()).debug("Caricamento tabella di decodifica.");
/*  939 */       mc = getModuleManager().execModule("caricaCodesTableMD", mc);
/*      */       
/*  941 */       List listaTblDecodifiche = (List)mc.getAppl("RISULTATO_RICERCA");
/*      */       
/*  943 */       if (listaTblDecodifiche == null || listaTblDecodifiche.size() <= 0) {
/*      */         
/*  945 */         LogFactory.getLog(getClass()).warn("Impossibile caricare la tabella, la creo.");
/*      */         
/*  947 */         decod = new TblDecodifiche();
/*  948 */         decod.setNomeTabella(codesTable);
/*  949 */         recordIdMax = 1;
/*      */         
/*  951 */         inizializzaCampiStandard((RasORMBean)decod, "I", "MiddleOffice - CP");
/*      */         
/*  953 */         mc.putAppl("ENTITA_DA_INSERIRE", decod);
/*  954 */         getModuleManager().execModule(this.moduloSingleEntity, mc);
/*      */       }
/*      */       else {
/*      */         
/*  958 */         if (listaTblDecodifiche.size() > 1) {
/*      */           
/*  960 */           String str = "Troppe codes table (" + listaTblDecodifiche.size() + ") per '" + codesTable + "'";
/*      */           
/*  962 */           LogFactory.getLog(getClass()).error(str);
/*      */         } 
/*      */         
/*  965 */         decod = listaTblDecodifiche.get(0);
/*      */ 
/*      */         
/*  968 */         for (Iterator iter = decod.getColonne().iterator(); iter.hasNext(); )
/*      */         {
/*  970 */           TblLegameDecodifiche element = iter.next();
/*  971 */           if (element.getRecordId().intValue() > recordIdMax)
/*      */           {
/*  973 */             recordIdMax = element.getRecordId().intValue();
/*      */           }
/*      */         }
/*      */       
/*      */       } 
/*  978 */     } catch (Exception e1) {
/*      */       
/*  980 */       LogFactory.getLog(getClass()).warn("Impossibile caricare la tabella, la creo.");
/*      */       
/*  982 */       decod = new TblDecodifiche();
/*  983 */       decod.setNomeTabella(codesTable);
/*      */       
/*  985 */       inizializzaCampiStandard((RasORMBean)decod, "I", "MiddleOffice - CP");
/*      */       
/*  987 */       mc.putAppl("ENTITA_DA_INSERIRE", decod);
/*  988 */       getModuleManager().execModule(this.moduloSingleEntity, mc);
/*      */       
/*  990 */       recordIdMax = 1;
/*      */     } 
/*      */     
/*  993 */     recordIdMax++;
/*      */     
/*  995 */     LogFactory.getLog(getClass()).debug("Caricamento decodifica...");
/*      */     
/*  997 */     TblColonneDecodifiche col1 = new TblColonneDecodifiche();
/*  998 */     col1.setNomeColonna(nomeColonnaIn);
/*  999 */     col1.setValoreColonna(valoreColonnaIn);
/* 1000 */     inizializzaCampiStandard((RasORMBean)col1, "I", "MiddleOffice - CP");
/*      */     
/* 1002 */     TblColonneDecodifiche col2 = new TblColonneDecodifiche();
/* 1003 */     col2.setNomeColonna(nomeColonnaOut);
/* 1004 */     col2.setValoreColonna(valoreColonnaOut);
/* 1005 */     inizializzaCampiStandard((RasORMBean)col2, "I", "MiddleOffice - CP");
/*      */     
/* 1007 */     TblLegameDecodifiche leg1 = new TblLegameDecodifiche();
/* 1008 */     leg1.setColonna(col1);
/* 1009 */     leg1.setTabella(decod);
/* 1010 */     leg1.setRecordId(new Integer(recordIdMax));
/* 1011 */     inizializzaCampiStandard((RasORMBean)leg1, "I", "MiddleOffice - CP");
/*      */     
/* 1013 */     TblLegameDecodifiche leg2 = new TblLegameDecodifiche();
/* 1014 */     leg2.setColonna(col2);
/* 1015 */     leg2.setTabella(decod);
/* 1016 */     leg2.setRecordId(new Integer(recordIdMax));
/* 1017 */     inizializzaCampiStandard((RasORMBean)leg2, "I", "MiddleOffice - CP");
/*      */     
/* 1019 */     ArrayList lista = new ArrayList();
/* 1020 */     lista.add(col1);
/* 1021 */     lista.add(col2);
/* 1022 */     lista.add(leg1);
/* 1023 */     lista.add(leg2);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1030 */     mc.putAppl("COLLECTION_DA_INSERIRE", lista);
/* 1031 */     getModuleManager().execModule(this.moduloEntityList, mc);
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void inizializzaCampiStandard(RasORMBean entityBean, String tipoModifica, String action) {
/*      */     try {
/* 1060 */       if ("D".equals(tipoModifica)) {
/* 1061 */         PropertyUtils.setProperty(entityBean, "flagEsistenza", "N");
/*      */       }
/*      */       else {
/*      */         
/* 1065 */         PropertyUtils.setProperty(entityBean, "flagEsistenza", "S");
/*      */       } 
/*      */ 
/*      */       
/* 1069 */       PropertyUtils.setProperty(entityBean, "dataUltimaModifica", Calendar.getInstance().getTime());
/*      */ 
/*      */       
/* 1072 */       PropertyUtils.setProperty(entityBean, "tipoUltimaModifica", tipoModifica);
/*      */       
/* 1074 */       String value = (action != null && action.length() > 40) ? action.substring(0, 40) : action;
/*      */       
/* 1076 */       PropertyUtils.setProperty(entityBean, "userUltimaModifica", value);
/*      */       
/* 1078 */       PropertyUtils.setProperty(entityBean, "proceduraUltimaModifica", value);
/*      */     
/*      */     }
/* 1081 */     catch (Exception e) {}
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
/*      */   private void initializeEPList(FinAbstractParametrizedBean bean) {
/* 1095 */     FinAbstractParametrizedBean parametrico = bean;
/* 1096 */     if (parametrico.getListaParametri() != null && parametrico.getListaParametri().size() > 0)
/*      */     {
/* 1098 */       for (Iterator iter = parametrico.getListaParametri().iterator(); iter.hasNext();)
/*      */       {
/* 1100 */         fep = iter.next();
/*      */       }
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
/*      */   private void normalizzaDate(FinAbstractParametrizedBean parametrico, Set deroghe, Set warnings, Set errori) {
/* 1114 */     FinEntitaParametro entitaParametro = null;
/* 1115 */     String descrizioneParametro = null;
/* 1116 */     FinParametro parametro = null;
/*      */     
/* 1118 */     if (parametrico.getListaParametri() != null && parametrico.getListaParametri().size() > 0)
/*      */     {
/* 1120 */       for (Iterator iter = parametrico.getListaParametri().iterator(); iter.hasNext(); ) {
/*      */         
/* 1122 */         entitaParametro = iter.next();
/* 1123 */         descrizioneParametro = entitaParametro.getParametro().getDescrizione();
/* 1124 */         parametro = entitaParametro.getParametro();
/*      */ 
/*      */         
/* 1127 */         DateFormat df = DateFormat.getDateInstance(3);
/*      */ 
/*      */         
/* 1130 */         if (entitaParametro.getDataFine() == null) {
/*      */           
/* 1132 */           Calendar dataFineMax = Calendar.getInstance();
/*      */           
/* 1134 */           dataFineMax.set(5, 31);
/* 1135 */           dataFineMax.set(2, 11);
/* 1136 */           dataFineMax.set(1, 2999);
/*      */           
/* 1138 */           entitaParametro.setDataFine(dataFineMax.getTime());
/*      */           
/* 1140 */           String dateF = df.format(dataFineMax.getTime());
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1147 */         if (entitaParametro.getDataInizio() == null) {
/*      */           
/* 1149 */           Calendar dateNow = Calendar.getInstance();
/*      */           
/* 1151 */           String dateI = df.format(dateNow.getTime());
/*      */           
/* 1153 */           entitaParametro.setDataInizio(dateNow.getTime());
/*      */           
/* 1155 */           if (entitaParametro instanceof FinEntitaParametroAdapterBase)
/*      */           {
/* 1157 */             dateI = ((FinEntitaParametroAdapterBase)entitaParametro).getDataInizioAdp();
/*      */           }
/*      */         } 
/*      */       } 
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
/*      */   private HashMap validateParameters(RasORMBean bean) {
/* 1177 */     FinAbstractParametrizedBean parametrico = (FinAbstractParametrizedBean)bean;
/*      */     
/* 1179 */     HashMap outputSetSegnali = new HashMap();
/*      */     
/* 1181 */     Set deroghe = new HashSet();
/* 1182 */     Set warnings = new HashSet();
/* 1183 */     Set errori = new HashSet();
/*      */     
/* 1185 */     normalizzaDate(parametrico, deroghe, warnings, errori);
/*      */     
/* 1187 */     segnalaNuoviParametri(parametrico, deroghe, warnings, errori);
/*      */     
/* 1189 */     if (parametrico.getListaParametri() != null && parametrico.getListaParametri().size() > 0) {
/*      */ 
/*      */       
/* 1192 */       boolean segnaleTroppiPar = false;
/* 1193 */       boolean segnaleRangeDate = false;
/* 1194 */       boolean segnaleFineValiditaParametro = false;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1200 */       FinEntitaParametro entitaParametro = null;
/* 1201 */       String descrizioneParametro = null;
/* 1202 */       FinParametro parametro = null;
/*      */ 
/*      */       
/* 1205 */       for (Iterator iter = parametrico.getListaParametri().iterator(); iter.hasNext(); ) {
/*      */         
/* 1207 */         entitaParametro = iter.next();
/* 1208 */         descrizioneParametro = entitaParametro.getParametro().getDescrizione();
/* 1209 */         parametro = entitaParametro.getParametro();
/*      */         
/* 1211 */         if (entitaParametro.getFlagEsistenza() != null && entitaParametro.getFlagEsistenza().equalsIgnoreCase("N")) {
/*      */           continue;
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1217 */         if (entitaParametro.getParametro().getTipoEntitaAss().equals("1") && parametrico instanceof FinAttivitaFinanziaria)
/*      */         {
/* 1219 */           warnings.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.warning.parametri.propagazioneParametroDaMacroAProdotto"));
/*      */         }
/*      */ 
/*      */         
/* 1223 */         if (entitaParametro.getDataFine() != null && entitaParametro.getDataFine().before(new Date()) && !segnaleFineValiditaParametro) {
/*      */           
/* 1225 */           segnaleFineValiditaParametro = true;
/*      */           
/* 1227 */           errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.validitaParametriScaduti", descrizioneParametro, DateFormat.getDateInstance(3).format(Calendar.getInstance().getTime())));
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1233 */         String tipiOggString = parametro.getTipoOggP();
/* 1234 */         String valore = null;
/*      */         
/* 1236 */         String[] arrayTipi = tokenizeOggP(tipiOggString);
/* 1237 */         for (int i = 0; i < arrayTipi.length; i++) {
/*      */           
/* 1239 */           Pattern p = Pattern.compile("(\\d+\\s*([- | ,]\\s*\\d+\\s*)*)*");
/*      */ 
/*      */           
/* 1242 */           if (arrayTipi[i].equalsIgnoreCase("TXT") && parametro.getFlagElenco() != null && parametro.getFlagElenco().equals("S")) {
/*      */             
/* 1244 */             if ((valore = entitaParametro.getValore()) == null || valore.equals(""))
/*      */             {
/* 1246 */               errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.testoNonInserito", descrizioneParametro));
/*      */             
/*      */             }
/*      */             else
/*      */             {
/* 1251 */               Matcher m = p.matcher(valore);
/*      */               
/* 1253 */               if (!m.matches())
/*      */               {
/* 1255 */                 errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.parametroTestoNonCorretto", descrizioneParametro));
/*      */ 
/*      */               
/*      */               }
/*      */             
/*      */             }
/*      */ 
/*      */           
/*      */           }
/* 1264 */           else if (arrayTipi[i].equalsIgnoreCase("NMB") && i <= arrayTipi.length - 3 && !arrayTipi[i + 2].equalsIgnoreCase("CMB")) {
/*      */ 
/*      */ 
/*      */             
/* 1268 */             valore = entitaParametro.getValore();
/*      */             
/* 1270 */             if (valore == null || valore.equals(""))
/*      */             {
/* 1272 */               errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.importoNonInserito", descrizioneParametro));
/*      */             
/*      */             }
/*      */             else
/*      */             {
/* 1277 */               StringTokenizer st = new StringTokenizer(valore, ",");
/*      */               
/* 1279 */               String cifreIntere = st.nextToken();
/*      */               
/*      */               try {
/* 1282 */                 cifreIntere = rimuoviQualsiasiSeparatore(cifreIntere);
/* 1283 */               } catch (Exception e) {
/* 1284 */                 cifreIntere = null;
/*      */               } 
/*      */               
/* 1287 */               if (ArchUtils.isValid(cifreIntere) && cifreIntere.length() > 9)
/*      */               {
/* 1289 */                 errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.maxLengthNumeroSuperata", descrizioneParametro, (new Integer(9)).toString()));
/*      */ 
/*      */ 
/*      */               
/*      */               }
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */ 
/*      */           
/*      */           }
/* 1301 */           else if (arrayTipi[i].equalsIgnoreCase("CMB")) {
/*      */             
/* 1303 */             String tipoNext = null;
/* 1304 */             String tipoPrev = null;
/*      */             
/* 1306 */             if (arrayTipi.length - 1 != i && (tipoNext = arrayTipi[i + 1]) != null && tipoNext.equalsIgnoreCase("BTN")) {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1311 */               if ((valore = entitaParametro.getValore()) == null || valore.equals("")) {
/*      */                 
/* 1313 */                 errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.doppiaComboSenzaValori", descrizioneParametro));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*      */                 break;
/*      */               } 
/* 1321 */             } else if (arrayTipi[i - 2].equalsIgnoreCase("NMB")) {
/*      */               
/* 1323 */               if ((valore = entitaParametro.getValoreDivisa()) == null || valore.equals("-1"))
/*      */               {
/* 1325 */                 errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.valoreComboNonInserito", descrizioneParametro));
/*      */               }
/*      */ 
/*      */               
/* 1329 */               if ((valore = entitaParametro.getValore()) == null || valore.equals(""))
/*      */               {
/* 1331 */                 errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.importoNonInserito", descrizioneParametro));
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*      */               }
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             }
/* 1342 */             else if ((valore = entitaParametro.getValore()) == null || valore.equals("-1")) {
/*      */               
/* 1344 */               errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.valoreComboSingolaNonInserito", descrizioneParametro));
/*      */ 
/*      */ 
/*      */ 
/*      */             
/*      */             }
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*      */           }
/* 1355 */           else if (arrayTipi[i].equalsIgnoreCase("RDO")) {
/*      */             
/* 1357 */             if ((valore = entitaParametro.getValore()) == null || valore.equals(""))
/*      */             {
/* 1359 */               errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.valoreRadioNonInserito", descrizioneParametro));
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1372 */         int maxParameters = 0;
/*      */         
/* 1374 */         for (Iterator iterInterno = parametrico.getListaParametri().iterator(); iterInterno.hasNext(); ) {
/*      */           
/* 1376 */           FinEntitaParametro ep2 = iterInterno.next();
/* 1377 */           FinParametro parametroCorrente = ep2.getParametro();
/*      */           
/* 1379 */           if (ep2.getFlagEsistenza() != null && ep2.getFlagEsistenza().equalsIgnoreCase("N")) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */           
/* 1384 */           if (parametroCorrente.getParametroID().equals(parametro.getParametroID())) {
/*      */             
/* 1386 */             maxParameters++;
/* 1387 */             if (maxParameters > 2 && !segnaleTroppiPar) {
/*      */               
/* 1389 */               segnaleTroppiPar = true;
/* 1390 */               errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.troppiParametriUguali", descrizioneParametro));
/*      */               
/*      */               continue;
/*      */             } 
/* 1394 */             if (maxParameters == 2) {
/*      */               
/*      */               try {
/*      */                 
/* 1398 */                 if (ep2 == entitaParametro) {
/*      */                   continue;
/*      */                 }
/*      */ 
/*      */                 
/* 1403 */                 Date inizioA = entitaParametro.getDataInizio();
/* 1404 */                 Date fineA = entitaParametro.getDataFine();
/* 1405 */                 Date inizioB = ep2.getDataInizio();
/* 1406 */                 Date fineB = ep2.getDataFine();
/*      */ 
/*      */                 
/* 1409 */                 boolean inizioPrimaDellaFine = (inizioA.before(fineA) && inizioB.before(fineB));
/* 1410 */                 boolean rangeNonRispettato = ((inizioA.before(inizioB) && fineA.after(inizioB)) || (inizioB.before(inizioA) && fineB.after(inizioA)));
/*      */ 
/*      */                 
/* 1413 */                 if (!inizioPrimaDellaFine)
/*      */                 {
/* 1415 */                   errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.rangeParametriNonRispettato", descrizioneParametro));
/*      */                 }
/*      */                 
/* 1418 */                 if (inizioPrimaDellaFine && rangeNonRispettato) {
/*      */                   
/* 1420 */                   segnaleRangeDate = true;
/* 1421 */                   errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.rangeParametriNonRispettato", descrizioneParametro));
/*      */                 } 
/*      */ 
/*      */                 
/* 1425 */                 if (checkDateEquality(inizioA, inizioB) || checkDateEquality(fineA, fineB))
/*      */                 {
/*      */                   
/* 1428 */                   errori.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.errori.parametri.rangeParametriNonRispettato", descrizioneParametro));
/*      */                 }
/*      */               }
/* 1431 */               catch (NullPointerException npe) {}
/*      */             }
/*      */           } 
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
/* 1445 */       if (bean instanceof FinProdotto) {
/* 1446 */         validaInRicorsione((FinProdotto)bean, deroghe, warnings, errori);
/*      */       }
/* 1448 */       if (!deroghe.isEmpty() || !warnings.isEmpty() || !errori.isEmpty()) {
/*      */         
/* 1450 */         outputSetSegnali.put("deroga", deroghe);
/* 1451 */         outputSetSegnali.put("warning", warnings);
/* 1452 */         outputSetSegnali.put("error", errori);
/*      */         
/* 1454 */         return outputSetSegnali;
/*      */       } 
/*      */     } 
/*      */     
/* 1458 */     LogFactory.getLog(getClass()).debug("Il bean " + bean.getClass().getName().substring(17) + " non ha parametri!");
/*      */     
/* 1460 */     if (bean instanceof FinProdotto) {
/* 1461 */       validaInRicorsione((FinProdotto)bean, deroghe, warnings, errori);
/*      */     }
/* 1463 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String rimuoviQualsiasiSeparatore(String cifreIntere) {
/* 1473 */     if (!ArchUtils.isValid(cifreIntere)) {
/* 1474 */       return null;
/*      */     }
/* 1476 */     String returnStr = "";
/* 1477 */     boolean isInteger = true;
/* 1478 */     char[] cs = cifreIntere.toCharArray();
/* 1479 */     for (int i = 0; i < cs.length; i++) {
/* 1480 */       if (Character.isDigit(cs[i])) {
/* 1481 */         returnStr = returnStr + cs[i];
/*      */       }
/*      */       
/* 1484 */       if (Character.isLetter(cs[i])) {
/* 1485 */         isInteger = false;
/*      */       }
/*      */     } 
/*      */     
/* 1489 */     if (!isInteger) {
/* 1490 */       return null;
/*      */     }
/* 1492 */     if (!ArchUtils.isValid(returnStr))
/* 1493 */       return null; 
/* 1494 */     return returnStr;
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
/*      */   private void segnalaNuoviParametri(FinAbstractParametrizedBean parametrico, Set deroghe, Set warnings, Set errori) {
/* 1509 */     if (parametrico == null || parametrico.getListaParametri() == null) {
/*      */       return;
/*      */     }
/* 1512 */     if (parametrico instanceof FinEmittente && ((FinEmittente)parametrico).getEmittenteId() == null) {
/*      */       return;
/*      */     }
/*      */     
/* 1516 */     if (parametrico instanceof FinProdotto && ((FinProdotto)parametrico).getProdottoID() == null) {
/*      */       return;
/*      */     }
/*      */     
/* 1520 */     if (parametrico instanceof FinAttivitaFinanziaria && ((FinAttivitaFinanziaria)parametrico).getAttivitaFinId() == null) {
/*      */       return;
/*      */     }
/*      */     
/* 1524 */     Iterator iter = parametrico.getListaParametri().iterator();
/* 1525 */     while (iter.hasNext()) {
/* 1526 */       FinEntitaParametro entitaParametro = iter.next();
/*      */       
/* 1528 */       if (entitaParametro.getEntitaParametroId() == null) {
/* 1529 */         FinParametro parametro = entitaParametro.getParametro();
/*      */         
/* 1531 */         if (parametrico instanceof FinProdotto) {
/* 1532 */           warnings.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.warning.nuovoParametroValorizzatoPerMacroProdotto", parametro.getDescrizione(), ((FinProdotto)parametrico).getDescrizioneS()));
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1540 */         if (parametrico instanceof FinEmittente) {
/* 1541 */           warnings.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.warning.nuovoParametroValorizzatoPerEmittente", parametro.getDescrizione(), ((FinEmittente)parametrico).getDescrizione()));
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1549 */         if (parametrico instanceof FinAttivitaFinanziaria) {
/* 1550 */           warnings.add(new RasValidationSignal("it.ras.arco.cp.segnalazioni.warning.nuovoParametroValorizzatoPerProdotto", parametro.getDescrizione(), ((FinAttivitaFinanziaria)parametrico).getDescrizione()));
/*      */         }
/*      */       } 
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
/*      */ 
/*      */ 
/*      */   
/*      */   private void validaInRicorsione(FinProdotto prodotto, Set deroghe, Set warnings, Set errori) {
/* 1575 */     Iterator iAF = null;
/*      */     
/*      */     try {
/* 1578 */       iAF = prodotto.getAttFin().iterator();
/*      */     }
/* 1580 */     catch (Exception e) {
/*      */       
/* 1582 */       LogFactory.getLog(getClass()).warn("CP: Le AF di P sono lazy e non inzializzate. Ignoro la validazione dei parametri su di esse!");
/*      */       
/*      */       return;
/*      */     } 
/* 1586 */     while (iAF.hasNext()) {
/*      */       
/* 1588 */       FinProdottoLinea pl = iAF.next();
/* 1589 */       if (pl.getAttFin() != null) {
/*      */         
/* 1591 */         FinAttivitaFinanziaria attivitaFinanziaria = pl.getAttFin();
/* 1592 */         Set listaParametriDaNonValidare = escludiParametriDaNonValidare((RasORMBean)attivitaFinanziaria);
/* 1593 */         HashMap map = validateParameters((RasORMBean)attivitaFinanziaria);
/*      */         
/* 1595 */         if (map != null) {
/*      */           
/* 1597 */           if (map.get("deroga") != null && ((Collection)map.get("deroga")).size() > 0) {
/* 1598 */             deroghe.addAll((Collection)map.get("deroga"));
/*      */           }
/* 1600 */           if (map.get("warning") != null && ((Collection)map.get("warning")).size() > 0) {
/* 1601 */             warnings.addAll((Collection)map.get("warning"));
/*      */           }
/* 1603 */           if (map.get("error") != null && ((Collection)map.get("error")).size() > 0) {
/* 1604 */             errori.addAll((Collection)map.get("error"));
/*      */           }
/* 1606 */           reintegraParametriDaNonValidare((RasORMBean)attivitaFinanziaria, listaParametriDaNonValidare);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/* 1611 */     LogFactory.getLog(getClass()).debug("CP: Validati ricorsivamente i parametri di tutte le AF del prodotto");
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
/*      */   private String[] tokenizeOggP(String source) {
/* 1626 */     StringTokenizer st = new StringTokenizer(source, ",", true);
/* 1627 */     ArrayList listaTipi = new ArrayList();
/* 1628 */     while (st.hasMoreTokens()) {
/*      */       
/* 1630 */       String str = st.nextToken().trim();
/* 1631 */       if (str.equals(",")) {
/*      */         continue;
/*      */       }
/*      */ 
/*      */       
/* 1636 */       if (str.equals("-")) {
/*      */         
/* 1638 */         listaTipi.add("LBL");
/*      */         
/*      */         continue;
/*      */       } 
/* 1642 */       listaTipi.add(str);
/*      */     } 
/*      */     
/* 1645 */     String[] strs = new String[listaTipi.size()];
/* 1646 */     for (int i = 0; i < strs.length; i++)
/*      */     {
/* 1648 */       strs[i] = listaTipi.get(i);
/*      */     }
/*      */     
/* 1651 */     return strs;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getModuloSingleEntity() {
/* 1659 */     return this.moduloSingleEntity;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setModuloSingleEntity(String moduloSingleEntity) {
/* 1667 */     this.moduloSingleEntity = moduloSingleEntity;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getModuloEntityList() {
/* 1675 */     return this.moduloEntityList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setModuloEntityList(String moduloEntityList) {
/* 1683 */     this.moduloEntityList = moduloEntityList;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getModuloCancellaPrezziDiAF() {
/* 1690 */     return this.moduloCancellaPrezziDiAF;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setModuloCancellaPrezziDiAF(String moduloCancellaPrezziDiAF) {
/* 1697 */     this.moduloCancellaPrezziDiAF = moduloCancellaPrezziDiAF;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void main(String[] args) {
/* 1706 */     String[] esempiPositivi = { "12", "12,14", "12-20", "12,13,15-20", "13,14-16,18,20", "12-16,30,40", "13,20,21-25,40,50-60", "2", "134-190,200" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1719 */     String[] esempiNegativi = { "12o", "12,,14", "12-,20", "12--30", "13 - 14,", ",12-16", "-15", "a2", "a-12", "acca", "h", ",7,", "6,e", "56,p-", "12,5-", "-23,43", "-", ",", ",-", "o,r", "t-d", "12-4,", "12,-67", "34-,34", "34-7 a", "12.34" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1750 */     Pattern p = Pattern.compile("(\\d+\\s*([- | ,]\\s*\\d+\\s*)*)*");
/*      */     
/* 1752 */     boolean negativiOk = true;
/* 1753 */     for (int i = 0; i < esempiNegativi.length; i++) {
/*      */ 
/*      */       
/*      */       try {
/* 1757 */         Matcher m = p.matcher(esempiNegativi[i]);
/* 1758 */         System.out.println("L'esempio '" + esempiNegativi[i] + "' ha avuto esito: " + m.matches() + ".");
/*      */ 
/*      */         
/* 1761 */         if (m.matches())
/*      */         {
/* 1763 */           negativiOk = false;
/*      */         }
/*      */       }
/* 1766 */       catch (Exception e) {
/*      */         
/* 1768 */         System.out.println("L'esempio '" + esempiNegativi[i] + "' ha avuto esito NEGATIVO.");
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/* 1773 */     boolean positiviOk = true;
/* 1774 */     for (int j = 0; j < esempiPositivi.length; j++) {
/*      */ 
/*      */       
/*      */       try {
/* 1778 */         Matcher m = p.matcher(esempiPositivi[j]);
/* 1779 */         System.out.println("L'esempio '" + esempiPositivi[j] + "' ha avuto esito: " + m.matches() + ".");
/*      */ 
/*      */         
/* 1782 */         if (!m.matches())
/*      */         {
/* 1784 */           positiviOk = false;
/*      */         }
/*      */       }
/* 1787 */       catch (Exception e) {
/*      */         
/* 1789 */         System.out.println("L'esempio '" + esempiPositivi[j] + "' ha avuto esito NEGATIVO.");
/*      */         
/* 1791 */         positiviOk = false;
/*      */       } 
/*      */     } 
/*      */     
/* 1795 */     if (negativiOk) {
/*      */       
/* 1797 */       System.out.println("Il test sui NEGATIVI e' riuscito correttamente");
/*      */     }
/*      */     else {
/*      */       
/* 1801 */       System.err.println("Il test sui NEGATIVI e' fallito in almeno un punto");
/*      */     } 
/*      */     
/* 1804 */     if (positiviOk) {
/*      */       
/* 1806 */       System.out.println("Il test sui POSITIVI e' riuscito correttamente");
/*      */     }
/*      */     else {
/*      */       
/* 1810 */       System.err.println("Il test sui POSITIVI e' fallito in almeno un punto");
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void applicaParametriAdAF(FinProdotto p) throws RasServiceException {
/* 1847 */     if (this.finEntitaParametroBuilder == null) {
/*      */       
/* 1849 */       LogFactory.getLog(getClass()).warn("CP: Al servizio non e' stato associata un'istanza di 'IFinEntitaParametroBuilder'. Non e' quindi possibile eseguire una costruzione per copia di FinEntitaParametro e non e' quindi possibile applicare i parametri ereditabili.");
/*      */ 
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/* 1857 */     List listaParametriDaSpalmare = recuperaParametriEreditabili(p);
/* 1858 */     if (listaParametriDaSpalmare == null || listaParametriDaSpalmare.size() <= 0) {
/*      */       
/* 1860 */       LogFactory.getLog(getClass()).debug("CP: Non si sono parametri obbligatori di tipo Prodotto (2) associati al MacroProdotto. Nessun bisogno di propagazione.");
/*      */ 
/*      */       
/*      */       return;
/*      */     } 
/*      */ 
/*      */     
/* 1867 */     LogFactory.getLog(getClass()).debug("CP: Esistono " + listaParametriDaSpalmare.size() + " parametri da applicare a tutti i Prodotti del MacroProdotto.");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1874 */     if (p.getAttFin() != null && p.getAttFin().size() > 0) {
/*      */       
/* 1876 */       LogFactory.getLog(getClass()).debug("CP: Esistono " + p.getAttFin().size() + " Prodotti su cui applicare i parametri di tipo 2 definiti per MacroProdotto.");
/*      */ 
/*      */       
/* 1879 */       RasServiceException re = new RasServiceException();
/*      */ 
/*      */       
/* 1882 */       for (Iterator iterParametriDaSpalmare = listaParametriDaSpalmare.iterator(); iterParametriDaSpalmare.hasNext(); ) {
/*      */         
/* 1884 */         FinEntitaParametro epDaEreditare = iterParametriDaSpalmare.next();
/*      */ 
/*      */         
/* 1887 */         for (Iterator iterPL = p.getAttFin().iterator(); iterPL.hasNext(); ) {
/*      */           
/* 1889 */           FinProdottoLinea prodottoLinea = iterPL.next();
/* 1890 */           FinAttivitaFinanziaria attivitaFinanziaria = prodottoLinea.getAttFin();
/*      */ 
/*      */           
/* 1893 */           FinEntitaParametro newEP = this.finEntitaParametroBuilder.buildViaCopyContructor(epDaEreditare);
/* 1894 */           newEP.setEntitaParametroId(null);
/* 1895 */           newEP.setProdotto(null);
/* 1896 */           newEP.setEmittente(null);
/*      */           
/* 1898 */           if (!alreadyApplied(newEP, attivitaFinanziaria)) {
/*      */             
/* 1900 */             if (checkAppliable(newEP, attivitaFinanziaria)) {
/*      */               
/* 1902 */               newEP.setAttivitaFinanziaria(attivitaFinanziaria);
/* 1903 */               if (attivitaFinanziaria.getListaParametri() == null)
/*      */               {
/*      */                 
/* 1906 */                 attivitaFinanziaria.setListaParametri(new TreeSet((Comparator)new ParameterComparator()));
/*      */               }
/* 1908 */               attivitaFinanziaria.getListaParametri().add(newEP);
/*      */               
/*      */               continue;
/*      */             } 
/* 1912 */             if ("S".equals(attivitaFinanziaria.getFlagEsistenza())) {
/*      */               
/* 1914 */               LogFactory.getLog(getClass()).debug("CP: Il parametro non e' ereditabile e l'AF ha flagEsistenza a 'S' quindi warning.");
/*      */               
/* 1916 */               RasValidationSignal rs = new RasValidationSignal("it.ras.arco.cp.segnalazioni.warning.parametri.parametriNonEreditati", "" + epDaEreditare.getParametro().getDescrizione(), "" + attivitaFinanziaria.getDescrizione(), "" + attivitaFinanziaria.getAttivitaFinId());
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1923 */               re.addWarning(rs);
/*      */               
/*      */               continue;
/*      */             } 
/* 1927 */             LogFactory.getLog(getClass()).debug("CP: Il parametro non e' ereditabile ma l'AF ha flagEsistenza a 'N' quindi ignoro.");
/*      */ 
/*      */             
/*      */             continue;
/*      */           } 
/*      */           
/* 1933 */           LogFactory.getLog(getClass()).debug("CP: Il parametro era gia' stato spalmato oppure ha uguali: data inizio, data fine e valore.");
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/* 1938 */       if (re.signalsPresent())
/*      */       {
/* 1940 */         throw re;
/*      */       }
/*      */     }
/*      */     else {
/*      */       
/* 1945 */       LogFactory.getLog(getClass()).debug("CP: Al MacroProdotto non sono associati Prodotti");
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
/*      */   private boolean alreadyApplied(FinEntitaParametro newEP, FinAttivitaFinanziaria attivitaFinanziaria) {
/* 1958 */     List listaRidefinizioni = estraiRidefinizioniDiParametro(attivitaFinanziaria, newEP.getParametro());
/*      */     
/* 1960 */     if (listaRidefinizioni != null && listaRidefinizioni.size() > 0) {
/*      */       
/* 1962 */       FinEntitaParametro epDiAF = listaRidefinizioni.get(0);
/*      */       
/* 1964 */       Date dataInizioNewEP = newEP.getDataInizio();
/* 1965 */       if (dataInizioNewEP == null) dataInizioNewEP = new Date(); 
/* 1966 */       Date dataFineNewEP = newEP.getDataFine();
/*      */       
/* 1968 */       Date dataInizioEpDiAF = epDiAF.getDataInizio();
/* 1969 */       if (dataInizioEpDiAF == null) dataInizioEpDiAF = new Date(); 
/* 1970 */       Date dataFineEpDiAF = epDiAF.getDataFine();
/*      */ 
/*      */ 
/*      */       
/* 1974 */       if ((dataFineEpDiAF == null && dataFineNewEP != null) || (dataFineEpDiAF != null && dataFineNewEP == null))
/*      */       {
/* 1976 */         return false;
/*      */       }
/*      */       
/* 1979 */       boolean dateInizioUguali = checkDateEquality(dataInizioEpDiAF, dataInizioNewEP);
/* 1980 */       boolean dateFineUguali = checkDateEquality(dataFineEpDiAF, dataFineNewEP);
/* 1981 */       if (!dateInizioUguali || !dateFineUguali)
/*      */       {
/* 1983 */         return false;
/*      */       }
/*      */ 
/*      */       
/* 1987 */       if ((epDiAF.getValore() == null && newEP.getValore() != null) || (epDiAF.getValore() != null && newEP.getValore() == null))
/*      */       {
/* 1989 */         return false;
/*      */       }
/*      */       
/* 1992 */       if (epDiAF.getValore() != null && newEP.getValore() != null)
/*      */       {
/* 1994 */         return checkValues(newEP, epDiAF);
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2003 */     return false;
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
/*      */   private boolean checkValues(FinEntitaParametro newEP, FinEntitaParametro epDiAF) {
/* 2015 */     String valore1 = newEP.getValore();
/* 2016 */     String valore2 = epDiAF.getValore();
/*      */     
/* 2018 */     if (!ArchUtils.isValid(valore1))
/* 2019 */       valore1 = ""; 
/* 2020 */     if (!ArchUtils.isValid(valore2)) {
/* 2021 */       valore2 = "";
/*      */     }
/* 2023 */     return removeSpaces(valore1).equals(removeSpaces(valore2));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private String removeSpaces(String valore) {
/* 2034 */     if (!ArchUtils.isValid(valore)) {
/* 2035 */       return "";
/*      */     }
/* 2037 */     String rimosso = "";
/* 2038 */     char[] c = valore.toCharArray();
/* 2039 */     for (int i = 0; i < c.length; i++) {
/* 2040 */       if (c[i] != ' ') {
/* 2041 */         rimosso = rimosso + c[i];
/*      */       }
/*      */     } 
/* 2044 */     return rimosso;
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
/*      */   private boolean checkDateEquality(Date d1, Date d2) {
/* 2058 */     if (d1 == null && d2 == null)
/*      */     {
/* 2060 */       return true;
/*      */     }
/*      */     
/* 2063 */     if (d1 == null)
/*      */     {
/* 2065 */       return false;
/*      */     }
/*      */     
/* 2068 */     if (d2 == null)
/*      */     {
/* 2070 */       return false;
/*      */     }
/*      */     
/* 2073 */     GregorianCalendar gc1 = new GregorianCalendar();
/* 2074 */     gc1.setTime(d1);
/*      */     
/* 2076 */     GregorianCalendar gc2 = new GregorianCalendar();
/* 2077 */     gc2.setTime(d2);
/*      */     
/* 2079 */     if (gc1.get(1) != gc2.get(1)) {
/* 2080 */       return false;
/*      */     }
/* 2082 */     if (gc1.get(2) != gc2.get(2)) {
/* 2083 */       return false;
/*      */     }
/* 2085 */     if (gc1.get(5) != gc2.get(5)) {
/* 2086 */       return false;
/*      */     }
/* 2088 */     return true;
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
/*      */ 
/*      */   
/*      */   private boolean checkAppliable(FinEntitaParametro newEP, FinAttivitaFinanziaria attivitaFinanziaria) {
/* 2112 */     List listaRidefinizioni = estraiRidefinizioniDiParametro(attivitaFinanziaria, newEP.getParametro());
/*      */     
/* 2114 */     if (listaRidefinizioni != null && listaRidefinizioni.size() > 0) {
/*      */       
/* 2116 */       if (listaRidefinizioni.size() >= 2)
/*      */       {
/* 2118 */         return false;
/*      */       }
/*      */       
/* 2121 */       FinEntitaParametro epDiAF = listaRidefinizioni.get(0);
/*      */       
/* 2123 */       Date dataInizioNewEP = newEP.getDataInizio();
/* 2124 */       if (dataInizioNewEP == null) dataInizioNewEP = new Date(); 
/* 2125 */       Date dataFineNewEP = newEP.getDataFine();
/*      */       
/* 2127 */       Date dataInizioEpDiAF = epDiAF.getDataInizio();
/* 2128 */       if (dataInizioEpDiAF == null) dataInizioEpDiAF = new Date(); 
/* 2129 */       Date dataFineEpDiAF = epDiAF.getDataFine();
/*      */ 
/*      */ 
/*      */       
/* 2133 */       if (dataFineEpDiAF == null && dataFineNewEP == null)
/*      */       {
/* 2135 */         return false;
/*      */       }
/*      */       
/* 2138 */       if (dataFineEpDiAF == null) {
/*      */         
/* 2140 */         if (!dataInizioEpDiAF.after(dataFineNewEP))
/*      */         {
/* 2142 */           return false;
/*      */         }
/*      */ 
/*      */         
/* 2146 */         return true;
/*      */       } 
/*      */ 
/*      */       
/* 2150 */       if (dataFineNewEP == null) {
/*      */         
/* 2152 */         if (!dataInizioNewEP.after(dataFineEpDiAF))
/*      */         {
/* 2154 */           return false;
/*      */         }
/*      */ 
/*      */         
/* 2158 */         return true;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 2164 */       if (((dataInizioEpDiAF.before(dataInizioNewEP) || dataInizioEpDiAF.equals(dataInizioNewEP)) && (dataFineEpDiAF.after(dataInizioNewEP) || dataFineEpDiAF.equals(dataInizioNewEP))) || ((dataInizioNewEP.before(dataInizioEpDiAF) || dataInizioNewEP.equals(dataInizioEpDiAF)) && (dataFineNewEP.after(dataInizioEpDiAF) || dataFineNewEP.after(dataInizioEpDiAF))))
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
/* 2178 */         return false;
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 2184 */     return true;
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
/*      */   private List estraiRidefinizioniDiParametro(FinAttivitaFinanziaria attivitaFinanziaria, FinParametro parametro) {
/* 2199 */     ArrayList listaRitorno = new ArrayList();
/*      */     
/* 2201 */     if (attivitaFinanziaria == null || parametro == null)
/*      */     {
/* 2203 */       return null;
/*      */     }
/*      */     
/* 2206 */     Set setParDiAF = attivitaFinanziaria.getListaParametri();
/* 2207 */     for (Iterator iter = setParDiAF.iterator(); iter.hasNext(); ) {
/*      */       
/* 2209 */       FinEntitaParametro element = iter.next();
/* 2210 */       if (element.getParametro().getParametroID().intValue() == parametro.getParametroID().intValue())
/*      */       {
/* 2212 */         listaRitorno.add(element);
/*      */       }
/*      */     } 
/*      */     
/* 2216 */     return listaRitorno;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private List recuperaParametriEreditabili(FinProdotto p) {
/* 2227 */     ArrayList al = new ArrayList();
/* 2228 */     Set setParametri = p.getListaParametri();
/*      */     
/* 2230 */     if (setParametri == null || setParametri.size() <= 0)
/*      */     {
/* 2232 */       return null;
/*      */     }
/*      */     
/* 2235 */     for (Iterator iter = setParametri.iterator(); iter.hasNext(); ) {
/*      */       
/* 2237 */       FinEntitaParametro ep = iter.next();
/* 2238 */       if (ep.getParametro().getTipoEntitaAss().equals(FinParametro.TIPO_ENTITA_ASS_ATT_FIN))
/*      */       {
/* 2240 */         if ("S".equals(ep.getFlagEsistenza()))
/*      */         {
/* 2242 */           al.add(ep);
/*      */         }
/*      */       }
/*      */     } 
/*      */     
/* 2247 */     return al;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getEsecuzioneBatch() {
/* 2255 */     return this.esecuzioneBatch;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setEsecuzioneBatch(String esecuzioneBatch) {
/* 2263 */     this.esecuzioneBatch = esecuzioneBatch;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public IFinEntitaParametroBuilder getFinEntitaParametroBuilder() {
/* 2271 */     return this.finEntitaParametroBuilder;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFinEntitaParametroBuilder(IFinEntitaParametroBuilder finEntitaParametroBuilder) {
/* 2280 */     this.finEntitaParametroBuilder = finEntitaParametroBuilder;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public CodesTableManager getCodesTableManager() {
/* 2288 */     return this.codesTableManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 2296 */     this.codesTableManager = codesTableManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Log getLogger() {
/* 2304 */     return this.logger;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLogger(Log logger) {
/* 2312 */     this.logger = logger;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGestioneCodiceAntAbilitato() {
/* 2323 */     return this.gestioneCodiceAntAbilitato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGestioneCodiceAntAbilitato(String gestioneCodiceAntAbilitato) {
/* 2334 */     this.gestioneCodiceAntAbilitato = gestioneCodiceAntAbilitato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGestioneCodiceFabbricaAbilitato() {
/* 2345 */     return this.gestioneCodiceFabbricaAbilitato;
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
/*      */   public void setGestioneCodiceFabbricaAbilitato(String gestioneCodiceFabbricaAbilitato) {
/* 2357 */     this.gestioneCodiceFabbricaAbilitato = gestioneCodiceFabbricaAbilitato;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\CatalogoProdottiSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */