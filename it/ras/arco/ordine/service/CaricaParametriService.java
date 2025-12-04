/*     */ package it.ras.arco.ordine.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinEntitaParametro;
/*     */ import it.ras.arco.bean.FinProdotto;
/*     */ import it.ras.arco.bean.ParameterComparator;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Comparator;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import java.util.TreeSet;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CaricaParametriService
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String BEAN_PARAMETRICO = "BEAN_PARAMETRICO";
/*     */   public static final String BEAN_PARAMETRIZZATO = "BEAN_CON_PARAMETRI";
/*     */   public static final String RISULTATO_RICERCA_MAP_CONTAINER_KEY = "listaParametri";
/*     */   public static final String MODULO_PARAMETRI_DI_ATTIVITA = "parametriDiAttivitaMD";
/*     */   public static final String MODULO_PARAMETRI_DI_PRODOTTO = "parametriDiProdottoMD";
/*  33 */   private Map moduleCatalog = new HashMap();
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  38 */     Object beanParametrized = map.getAppl("BEAN_PARAMETRICO");
/*     */     
/*  40 */     if (beanParametrized instanceof FinProdotto) {
/*     */       
/*  42 */       FinProdotto prod = (FinProdotto)beanParametrized;
/*     */ 
/*     */       
/*  45 */       map.putAppl("PRODOTTO_ID", prod);
/*     */       
/*  47 */       map = getModuleManager().execModule("parametriDiProdottoMD", map);
/*  48 */       List listaPar = (List)map.getAppl("listaParametri");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  53 */       Set setPar = new TreeSet((Comparator)new ParameterComparator());
/*     */       
/*  55 */       if (listaPar != null && listaPar.size() > 0) {
/*     */         
/*  57 */         Iterator iteraPar = listaPar.iterator();
/*  58 */         while (iteraPar.hasNext()) {
/*     */           
/*  60 */           FinEntitaParametro ep = iteraPar.next();
/*  61 */           ep.setProdotto(prod);
/*     */           
/*  63 */           setPar.add(ep);
/*     */         } 
/*     */       } 
/*     */       
/*  67 */       prod.setListaParametri(setPar);
/*     */       
/*  69 */       map.putAppl("BEAN_CON_PARAMETRI", beanParametrized);
/*     */ 
/*     */     
/*     */     }
/*  73 */     else if (beanParametrized instanceof FinAttivitaFinanziaria) {
/*     */       
/*  75 */       FinAttivitaFinanziaria attFin = (FinAttivitaFinanziaria)beanParametrized;
/*     */ 
/*     */       
/*  78 */       map.putAppl("ATTIVITA_ID", attFin);
/*     */       
/*  80 */       map = getModuleManager().execModule("parametriDiAttivitaMD", map);
/*  81 */       List listaPar = (List)map.getAppl("listaParametri");
/*     */       
/*  83 */       Set setPar = new TreeSet((Comparator)new ParameterComparator());
/*  84 */       if (listaPar != null && listaPar.size() > 0) {
/*     */         
/*  86 */         Iterator iteraPar = listaPar.iterator();
/*  87 */         while (iteraPar.hasNext()) {
/*     */           
/*  89 */           FinEntitaParametro ep = iteraPar.next();
/*  90 */           ep.setAttivitaFinanziaria(attFin);
/*     */           
/*  92 */           setPar.add(ep);
/*     */         } 
/*     */       } 
/*     */       
/*  96 */       attFin.setListaParametri(setPar);
/*     */       
/*  98 */       map.putAppl("BEAN_CON_PARAMETRI", beanParametrized);
/*     */     } 
/*     */ 
/*     */     
/* 102 */     return map;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map getModuleCatalog() {
/* 109 */     return this.moduleCatalog;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuleCatalog(Map moduleCatalog) {
/* 115 */     this.moduleCatalog = moduleCatalog;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\service\CaricaParametriService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */