/*     */ package it.ras.arco.cp.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinEmittente;
/*     */ import it.ras.arco.bean.FinProdotto;
/*     */ import it.ras.arco.bean.FinProdottoLinea;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class CaricaAFDiProdottoService
/*     */   extends AbstractRasService
/*     */ {
/*  35 */   private String loaderModule = null;
/*     */   
/*     */   public static final String MODALITA_OPERATIVA_MAP_CONTAINER_KEY = "MODALITA_OPERATIVA";
/*     */   
/*     */   public static final String MODALITA_OPERATIVA_LISTA_PRODOTTI = "LISTA_PRODOTTI";
/*     */   
/*     */   public static final String MODALITA_OPERATIVA_LISTA_PRODOTTO_LINEA = "LISTA_PRODOTTO_LINEA";
/*     */   
/*     */   public static final String PRODOTTO_ID_PER_MODULO = "PARAMETRO_ID_DI_PRODOTTO_LINEA";
/*     */   
/*     */   public static final String PRODOTTO_DA_COMPLETARE = "PRODOTTO_DA_COMPLETARE";
/*     */   
/*     */   public static final String LISTA_PRODOTTO_LINEA_RISULTANTI = "LISTA_PRODOTTO_LINEA_RISULTANTI";
/*     */   
/*     */   public static final String EMITTENTE_ID_PER_MODULO = "EMITTENTE_ID_PER_MODULO";
/*     */   
/*     */   public static final String EMITTENTE_DA_COMPLETARE = "EMITTENTE_DA_COMPLETARE";
/*     */   
/*     */   public static final String LISTA_PRODOTTI_RISULTANTI = "LISTA_PRODOTTI_RISULTANTI";
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  56 */     String modalitaOperativa = (String)map.getAppl("MODALITA_OPERATIVA");
/*  57 */     if ("LISTA_PRODOTTI".equals(modalitaOperativa))
/*     */     {
/*     */       
/*  60 */       return processaListaProdotti(map);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  65 */     return processaListaProdottoLinea(map);
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
/*     */   private MapContainer processaListaProdotti(MapContainer map) throws RasServiceException {
/*  78 */     FinEmittente emittente = (FinEmittente)map.getAppl("EMITTENTE_DA_COMPLETARE");
/*     */     
/*  80 */     map.putAppl("EMITTENTE_ID_PER_MODULO", emittente.getEmittenteId());
/*     */     
/*  82 */     LogFactory.getLog(getClass()).debug("CP: Esecuzione del modulo '" + this.loaderModule + "' per il caricamento");
/*     */ 
/*     */     
/*  85 */     MapContainer mUscita = getModuleManager().execModule(this.loaderModule, map);
/*     */     
/*  87 */     List listaPL = (List)mUscita.getAppl("LISTA_PRODOTTI_RISULTANTI");
/*     */     
/*  89 */     if (listaPL != null) {
/*     */       
/*  91 */       LogFactory.getLog(getClass()).debug("CP: Individuati " + listaPL.size() + " FinProdotto");
/*     */ 
/*     */       
/*  94 */       HashSet set = new HashSet();
/*  95 */       emittente.setProdotto(set);
/*  96 */       for (Iterator iter = listaPL.iterator(); iter.hasNext(); )
/*     */       {
/*  98 */         FinProdotto pl = iter.next();
/*  99 */         pl.setEmittente(emittente);
/* 100 */         set.add(pl);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 105 */       LogFactory.getLog(getClass()).debug("CP: Nessun ProdottoLinea individuato");
/* 106 */       HashSet set = new HashSet();
/* 107 */       emittente.setProdotto(set);
/*     */     } 
/*     */     
/* 110 */     return mUscita;
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
/*     */   private MapContainer processaListaProdottoLinea(MapContainer map) throws RasServiceException {
/* 122 */     FinProdotto prodotto = (FinProdotto)map.getAppl("PRODOTTO_DA_COMPLETARE");
/*     */     
/* 124 */     map.putAppl("PARAMETRO_ID_DI_PRODOTTO_LINEA", prodotto.getProdottoID());
/*     */     
/* 126 */     LogFactory.getLog(getClass()).debug("CP: Esecuzione del modulo '" + this.loaderModule + "' per il caricamento");
/*     */ 
/*     */     
/* 129 */     MapContainer mUscita = getModuleManager().execModule(this.loaderModule, map);
/*     */     
/* 131 */     List listaPL = (List)mUscita.getAppl("LISTA_PRODOTTO_LINEA_RISULTANTI");
/*     */     
/* 133 */     if (listaPL != null) {
/*     */       
/* 135 */       LogFactory.getLog(getClass()).debug("CP: Individuati " + listaPL.size() + " FinProdottoLinea");
/*     */ 
/*     */       
/* 138 */       HashSet set = new HashSet();
/* 139 */       prodotto.setAttFin(set);
/* 140 */       for (Iterator iter = listaPL.iterator(); iter.hasNext(); )
/*     */       {
/* 142 */         FinProdottoLinea pl = iter.next();
/* 143 */         pl.setProdotto(prodotto);
/* 144 */         set.add(pl);
/*     */       }
/*     */     
/*     */     } else {
/*     */       
/* 149 */       LogFactory.getLog(getClass()).debug("CP: Nessun ProdottoLinea individuato");
/* 150 */       HashSet set = new HashSet();
/* 151 */       prodotto.setAttFin(set);
/*     */     } 
/*     */     
/* 154 */     return mUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLoaderModule() {
/* 164 */     return this.loaderModule;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLoaderModule(String loaderModule) {
/* 172 */     this.loaderModule = loaderModule;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\service\CaricaAFDiProdottoService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */