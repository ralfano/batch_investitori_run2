/*     */ package it.ras.arco.cp.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinEntitaParametro;
/*     */ import it.ras.arco.bean.FinProdotto;
/*     */ import it.ras.arco.bean.FinProdottoLinea;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Set;
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
/*     */ public class CercaParametriService
/*     */   extends CercaCatalogoService
/*     */ {
/*     */   public static final String ENTITA_ASSOCIATA_MAP_CONTAINER_KEY = "ENTITA_ASSOCIATA_A_PARAMETRO";
/*     */   public static final String TIPO_PRODOTTO_MAP_CONTAINER_KEY = "TIPO_PRODOTTO_PER_PARAMETRO";
/*     */   public static final String RISULTATO_RICERCA_MAP_CONTAINER_KEY = "RISULTATO_RICERCA";
/*     */   
/*     */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/*  34 */     Object entitaAssociata = map.getAppl("ENTITA_ASSOCIATA_A_PARAMETRO");
/*     */     
/*  36 */     if (entitaAssociata instanceof FinProdotto) {
/*     */       
/*  38 */       if (((FinProdotto)entitaAssociata).getTipo() == null)
/*     */       {
/*  40 */         LogFactory.getLog(getClass()).warn("Non esiste il tipo del MacroProdotto.");
/*     */       }
/*  42 */       Set listaParametri = null;
/*  43 */       if ((listaParametri = ((FinProdotto)entitaAssociata).getListaParametri()) == null || listaParametri.isEmpty())
/*     */       {
/*  45 */         return true;
/*     */       }
/*     */ 
/*     */       
/*  49 */       String tipoOld = ((FinEntitaParametro)listaParametri.iterator().next()).getParametro().getTipoProdotto();
/*  50 */       String tipoNew = ((FinProdotto)entitaAssociata).getTipo();
/*  51 */       if (!tipoOld.equals(tipoNew)) {
/*     */         
/*  53 */         RasServiceException rasEx = new RasServiceException();
/*  54 */         RasValidationSignal rasVS = new RasValidationSignal("it.ras.arco.cp.segnalazioni.warning.cambioTipologiaParametri");
/*  55 */         rasEx.addWarning(rasVS);
/*  56 */         throw rasEx;
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  62 */     if (entitaAssociata instanceof FinAttivitaFinanziaria) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  68 */       Set listaParametri = null;
/*  69 */       if ((listaParametri = ((FinAttivitaFinanziaria)entitaAssociata).getListaParametri()) == null || listaParametri.isEmpty())
/*     */       {
/*  71 */         return true;
/*     */       }
/*     */ 
/*     */       
/*  75 */       String tipoOld = ((FinEntitaParametro)listaParametri.iterator().next()).getParametro().getTipoProdotto();
/*  76 */       String tipoNew = ((FinProdotto)entitaAssociata).getTipo();
/*  77 */       if (!tipoOld.equals(tipoNew)) {
/*     */         
/*  79 */         RasServiceException rasEx = new RasServiceException();
/*  80 */         RasValidationSignal rasVS = new RasValidationSignal("it.ras.arco.cp.segnalazioni.warning.cambioTipologiaParametri");
/*  81 */         rasEx.addWarning(rasVS);
/*  82 */         throw rasEx;
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
/*     */     
/*  95 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 105 */     LogFactory.getLog(getClass()).debug("CP: Inizio servizio....");
/*     */     
/* 107 */     LogFactory.getLog(getClass()).debug("CP: CATALOGO MODULI:\n" + printModuleCatalogStructure());
/*     */ 
/*     */ 
/*     */     
/* 111 */     Object entitaAssociata = map.getAppl("ENTITA_ASSOCIATA_A_PARAMETRO");
/*     */     
/* 113 */     LogFactory.getLog(getClass()).debug("CP: E' stata richiesta la ricerca dei parametri per un bean di classe '" + entitaAssociata.getClass().getName() + "'");
/*     */ 
/*     */ 
/*     */     
/* 117 */     String nomeModulo = (String)getModuleCatalog().get(entitaAssociata.getClass().getName());
/*     */     
/* 119 */     if (nomeModulo != null && !nomeModulo.equals("")) {
/*     */       
/* 121 */       LogFactory.getLog(getClass()).debug("CP: Questo implica l'esecuzione del modulo: '" + nomeModulo + "'. Esecuzione del modulo...");
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 127 */       LogFactory.getLog(getClass()).error("CP: Nessun modulo idoneo ad eseguire la ricerca!");
/*     */       
/* 129 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 133 */     if (entitaAssociata instanceof it.ras.arco.bean.FinEmittente)
/*     */     {
/* 135 */       return getModuleManager().execModule(nomeModulo, map);
/*     */     }
/* 137 */     if (entitaAssociata instanceof FinProdotto) {
/*     */       
/* 139 */       if (((FinProdotto)entitaAssociata).getTipo() != null)
/*     */       {
/* 141 */         map.putAppl("TIPO_PRODOTTO_PER_PARAMETRO", ((FinProdotto)entitaAssociata).getTipo());
/*     */         
/* 143 */         return getModuleManager().execModule(nomeModulo, map);
/*     */       }
/*     */     
/* 146 */     } else if (entitaAssociata instanceof FinAttivitaFinanziaria) {
/*     */       
/* 148 */       FinAttivitaFinanziaria attFin = (FinAttivitaFinanziaria)entitaAssociata;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 153 */       if (attFin.getProdotto() != null && attFin.getProdotto().size() > 0 && ((FinProdottoLinea)attFin.getProdotto().iterator().next()).getProdotto().getTipo() != null && !((FinProdottoLinea)attFin.getProdotto().iterator().next()).getProdotto().getTipo().equals("")) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 159 */         map.putAppl("TIPO_PRODOTTO_PER_PARAMETRO", ((FinProdottoLinea)attFin.getProdotto().iterator().next()).getProdotto().getTipo());
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 164 */         return getModuleManager().execModule(nomeModulo, map);
/*     */       } 
/*     */     } 
/*     */     
/* 168 */     return map;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\service\CercaParametriService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */