/*     */ package it.ras.arco.common.bean;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import org.apache.commons.lang.StringUtils;
/*     */ import org.hibernate.FetchMode;
/*     */ import org.hibernate.criterion.CriteriaSpecification;
/*     */ import org.hibernate.criterion.DetachedCriteria;
/*     */ import org.hibernate.criterion.Order;
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
/*     */ public class DescrittoreRicerca
/*     */ {
/*  27 */   private List parametri = new ArrayList();
/*     */   
/*  29 */   private String nomeRicerca = null;
/*     */   
/*  31 */   private List paremetriDiOrdinamento = null;
/*     */   
/*     */   private boolean useCriteria = false;
/*     */   
/*  35 */   private String targetName = "";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNomeRicerca() {
/*  41 */     return this.nomeRicerca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNomeRicerca(String nomeRicerca) {
/*  49 */     this.nomeRicerca = nomeRicerca;
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
/*     */   public List getParametri() {
/*  63 */     return this.parametri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParametri(List parametri) {
/*  71 */     this.parametri = parametri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Parametro getParametro(int index) {
/*  78 */     return this.parametri.get(index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParametro(int index, Parametro parametro) {
/*  86 */     this.parametri.add(index, parametro);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getParemetriDiOrdinamento() {
/*  93 */     return this.paremetriDiOrdinamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParemetriDiOrdinamento(List paremetriDiOrdinamento) {
/* 101 */     this.paremetriDiOrdinamento = paremetriDiOrdinamento;
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
/*     */   public void creaCriterioSingolo(DetachedCriteria detachedCriteriaRoot, HashMap associationContainer, String[] nomeLogicoSplitted, IParametroCriteriable parametroCriteriable) {
/* 124 */     String nameKey = nomeLogicoSplitted[0];
/* 125 */     associationContainer.put(nameKey, detachedCriteriaRoot);
/*     */     
/* 127 */     int associationSize = nomeLogicoSplitted.length;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     DetachedCriteria currentAssociationDetachedCriteria = detachedCriteriaRoot;
/*     */     
/* 136 */     for (int i = 1; i < nomeLogicoSplitted.length - 1; i++) {
/* 137 */       String currentAssociation = nomeLogicoSplitted[i];
/* 138 */       String precNameKey = nameKey;
/* 139 */       nameKey = nameKey + "." + nomeLogicoSplitted[i];
/*     */       
/* 141 */       currentAssociationDetachedCriteria = associationContainer.get(nameKey);
/*     */ 
/*     */       
/* 144 */       if (currentAssociationDetachedCriteria == null) {
/* 145 */         currentAssociationDetachedCriteria = ((DetachedCriteria)associationContainer.get(precNameKey)).createCriteria(currentAssociation).setFetchMode(currentAssociation, FetchMode.JOIN);
/*     */ 
/*     */         
/* 148 */         associationContainer.put(nameKey, currentAssociationDetachedCriteria);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 153 */     currentAssociationDetachedCriteria.add(parametroCriteriable.getRestriction(nomeLogicoSplitted[associationSize - 1])).setResultTransformer(CriteriaSpecification.DISTINCT_ROOT_ENTITY);
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
/*     */   public DetachedCriteria toDetachedCriteria(Class targetClass) {
/* 172 */     Iterator parametriIterator = getParametri().iterator();
/*     */     
/* 174 */     DetachedCriteria dc = DetachedCriteria.forClass(targetClass);
/*     */     
/* 176 */     HashMap associationContainer = new HashMap();
/*     */     
/* 178 */     while (parametriIterator.hasNext()) {
/* 179 */       Parametro currentParametro = parametriIterator.next();
/*     */       
/* 181 */       if (currentParametro.isActive()) {
/* 182 */         creaCriterioSingolo(dc, associationContainer, currentParametro.getNomeLogico().split("\\."), (IParametroCriteriable)currentParametro);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     if (this.paremetriDiOrdinamento != null) {
/*     */       
/* 192 */       Iterator parametriOrdinamentoIterator = getParemetriDiOrdinamento().iterator();
/*     */ 
/*     */       
/* 195 */       while (parametriOrdinamentoIterator.hasNext()) {
/*     */         
/* 197 */         ParametroDiOrdinamento currentParametroDiOrdinamento = parametriOrdinamentoIterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 203 */         String propertyName = StringUtils.substringAfter(currentParametroDiOrdinamento.getNomeLogico(), ".");
/*     */ 
/*     */         
/* 206 */         Order orderCriteria = null;
/*     */         
/* 208 */         if (currentParametroDiOrdinamento.isAscendente()) {
/* 209 */           orderCriteria = Order.asc(propertyName);
/*     */         } else {
/* 211 */           orderCriteria = Order.desc(propertyName);
/*     */         } 
/*     */         
/* 214 */         dc.addOrder(orderCriteria);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 219 */     return dc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isUseCriteria() {
/* 226 */     return this.useCriteria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUseCriteria(boolean useCriteria) {
/* 234 */     this.useCriteria = useCriteria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTargetName() {
/* 241 */     return this.targetName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTargetName(String targetName) {
/* 249 */     this.targetName = targetName;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\DescrittoreRicerca.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */