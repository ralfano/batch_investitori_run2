/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.arco.common.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.common.bean.Parametro;
/*     */ import it.ras.arco.common.bean.ParametroDiOrdinamento;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.DefaultCriteriaQueryModule;
/*     */ import it.ras.flag.taglib.list.IListElementComparator;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CercaModule
/*     */   extends DefaultCriteriaQueryModule
/*     */ {
/*  28 */   private String target = null;
/*     */   
/*  30 */   private Map fieldsMapping = new HashMap();
/*     */   
/*     */   private boolean andInWherePresent = false;
/*     */   
/*  34 */   private String explicitAlias = null;
/*     */   
/*  36 */   private String explicitJoins = null;
/*     */   
/*  38 */   private ArrayList queryParameters = new ArrayList();
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
/*     */   private boolean useExplicitJoins() {
/*  52 */     return ArchUtils.isValid(getExplicitJoins());
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
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*  69 */     LogFactory.getLog(getClass()).debug("MO: Modulo di ricerca generico.");
/*     */     
/*  71 */     MapContainer outMc = new MapContainer();
/*     */     
/*  73 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)inputMap.getAppl("DESCRITTORE_RICERCA");
/*     */ 
/*     */     
/*  76 */     if (!descrittoreRicerca.isUseCriteria()) {
/*  77 */       LogFactory.getLog(getClass()).debug("MO: Configurazione: " + printModuleConfiguration());
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  82 */       this.andInWherePresent = false;
/*  83 */       this.queryParameters = new ArrayList();
/*     */       
/*  85 */       this.andInWherePresent = false;
/*     */       
/*  87 */       String hqlQuery = buildHQLQuery(descrittoreRicerca, this.queryParameters);
/*     */       
/*  89 */       String column = getOrderColumn(getLista(), inputMap);
/*  90 */       String property = getOrderClause(column);
/*  91 */       boolean desc = getOrderDesc(getLista(), column, inputMap);
/*  92 */       IListElementComparator comparator = getOrderComparator(column, desc);
/*     */       
/*  94 */       List list = getDao().executeHqlQuery(hqlQuery, this.queryParameters.toArray(), getInitRow(inputMap), getPageSize(), property, desc, comparator);
/*     */ 
/*     */ 
/*     */       
/*  98 */       outMc.putAppl("RISULTATO_RICERCA", list);
/*     */       
/* 100 */       LogFactory.getLog(getClass()).debug("MO: Risultato (" + list.size() + " elemento/i) inserito in MapContainer," + " modulo terminato");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 105 */       return outMc;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 112 */       if (inputMap.getAppl(getQueryDescriptorKey()) == null) {
/* 113 */         inputMap.putAppl(getQueryDescriptorKey(), descrittoreRicerca.toDetachedCriteria(Class.forName(getTarget())));
/*     */       
/*     */       }
/*     */     }
/* 117 */     catch (ClassNotFoundException e) {
/*     */       
/* 119 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 122 */     return super.service(inputMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String concatenateWhereConditions() {
/* 130 */     if (!this.andInWherePresent) {
/* 131 */       this.andInWherePresent = true;
/*     */       
/* 133 */       return "WHERE ";
/*     */     } 
/* 135 */     this.andInWherePresent = true;
/*     */     
/* 137 */     return " AND ";
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
/*     */   private String buildHQLQuery(DescrittoreRicerca descrittore, ArrayList queryParameters) {
/* 151 */     List parametri = descrittore.getParametri();
/* 152 */     List parametriDiOrdinamento = descrittore.getParemetriDiOrdinamento();
/*     */ 
/*     */     
/* 155 */     String alias = getExplicitAlias();
/* 156 */     if (!ArchUtils.isValid(alias)) {
/* 157 */       alias = "tableAlias";
/*     */     }
/*     */     
/* 160 */     String query = "";
/* 161 */     String queryBase = "select distinct " + alias + " from " + this.target + " " + alias + " ";
/*     */ 
/*     */     
/* 164 */     if (ArchUtils.isValid(getExplicitJoins())) {
/* 165 */       queryBase = queryBase + " " + getExplicitJoins() + " ";
/*     */     }
/*     */     
/* 168 */     String queryWhere = "";
/* 169 */     String queryOrder = "";
/*     */     
/* 171 */     if (parametri != null && parametri.size() >= 0) {
/* 172 */       Iterator parametriIterator = parametri.iterator();
/*     */ 
/*     */       
/* 175 */       while (parametriIterator.hasNext()) {
/* 176 */         Parametro currentParametro = parametriIterator.next();
/*     */ 
/*     */ 
/*     */         
/* 180 */         if (currentParametro.isActive()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 190 */           String espressioneSinistra = costruisciEspressioneSinistra(currentParametro.getNomeLogico(), alias);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 197 */           if (!"".equals(espressioneSinistra) || currentParametro instanceof it.ras.arco.common.bean.ParametroConfronto)
/*     */           {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 204 */             queryWhere = queryWhere + concatenateWhereConditions() + espressioneSinistra + currentParametro.costruisciEspressione(queryParameters) + " ";
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 213 */     if (parametriDiOrdinamento != null && parametriDiOrdinamento.size() >= 0) {
/*     */       
/* 215 */       queryOrder = queryOrder + " order by ";
/*     */       
/* 217 */       Iterator parametriDiOrdinamentoIterator = parametriDiOrdinamento.iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 223 */       while (parametriDiOrdinamentoIterator.hasNext()) {
/* 224 */         ParametroDiOrdinamento currentParametroDiOrdinamento = parametriDiOrdinamentoIterator.next();
/*     */ 
/*     */         
/* 227 */         queryOrder = queryOrder + costruisciEspressioneSinistra(currentParametroDiOrdinamento.getNomeLogico(), alias) + " " + currentParametroDiOrdinamento.getTipoOrdinamento() + " ,";
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 236 */       queryOrder = queryOrder.substring(0, queryOrder.length() - 1);
/*     */     } 
/*     */     
/* 239 */     query = queryBase + queryWhere + queryOrder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 245 */     LogFactory.getLog(getClass()).debug("MO: Query costruita:\n\t" + query + "\nParametri: ");
/*     */ 
/*     */     
/* 248 */     return query;
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
/*     */   private String costruisciEspressioneSinistra(String nomeLogico, String alias) {
/* 261 */     String espressione = "";
/* 262 */     boolean changeDone = false;
/*     */     
/* 264 */     if (nomeLogico != null) {
/* 265 */       Iterator iterator = this.fieldsMapping.keySet().iterator();
/*     */       
/* 267 */       while (iterator.hasNext() && !changeDone) {
/* 268 */         String chiave = iterator.next();
/* 269 */         String valore = (String)this.fieldsMapping.get(chiave);
/*     */         
/* 271 */         if (nomeLogico.startsWith(chiave + ".")) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 280 */           if (valore == null || "".equals(valore)) {
/* 281 */             valore = alias;
/*     */           }
/* 283 */           else if (!useExplicitJoins()) {
/* 284 */             espressione = espressione + alias + ".";
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 292 */           espressione = espressione + nomeLogico.replaceFirst(chiave, valore);
/* 293 */           changeDone = true;
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 304 */       if (!changeDone && getExplicitAlias() != null) {
/* 305 */         espressione = espressione + nomeLogico;
/*     */       }
/*     */     } 
/*     */     
/* 309 */     LogFactory.getLog(getClass()).debug("MO: Il nome logico originale " + nomeLogico + " è stato cambiato in " + espressione);
/*     */ 
/*     */ 
/*     */     
/* 313 */     return espressione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String printModuleConfiguration() {
/* 321 */     String str = "\n";
/*     */     
/* 323 */     str = str + " - Bean Target: " + this.target + "\n";
/*     */     
/* 325 */     Iterator iterator = this.fieldsMapping.keySet().iterator();
/*     */     
/* 327 */     while (iterator.hasNext()) {
/* 328 */       String chiave = iterator.next();
/*     */       
/* 330 */       str = str + " - FIELD MAPPING:\n";
/* 331 */       str = str + "   +     prefisso: " + chiave + "\n";
/* 332 */       str = str + "   + sostituzione: " + this.fieldsMapping.get(chiave) + "\n";
/*     */     } 
/*     */     
/* 335 */     return str;
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
/*     */   public Map getFieldsMapping() {
/* 374 */     return this.fieldsMapping;
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
/*     */   public void setFieldsMapping(Map fieldsMapping) {
/* 413 */     this.fieldsMapping = fieldsMapping;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTarget() {
/* 423 */     return this.target;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTarget(String target) {
/* 434 */     this.target = target;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getExplicitAlias() {
/* 441 */     return this.explicitAlias;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExplicitAlias(String explicitAlias) {
/* 449 */     this.explicitAlias = explicitAlias;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getExplicitJoins() {
/* 456 */     return this.explicitJoins;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExplicitJoins(String explicitJoins) {
/* 464 */     this.explicitJoins = explicitJoins;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\CercaModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */