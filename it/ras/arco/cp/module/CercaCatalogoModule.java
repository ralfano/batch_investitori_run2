/*     */ package it.ras.arco.cp.module;
/*     */ 
/*     */ import it.ras.arco.cp.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.cp.bean.Parametro;
/*     */ import it.ras.arco.cp.bean.ParametroDiOrdinamento;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.DefaultCriteriaQueryModule;
/*     */ import it.ras.flag.taglib.list.IListElementComparator;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.criterion.DetachedCriteria;
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
/*     */ public class CercaCatalogoModule
/*     */   extends DefaultCriteriaQueryModule
/*     */ {
/*  35 */   private String target = null;
/*  36 */   private Map fieldsMapping = new HashMap();
/*     */   
/*     */   private boolean andInWherePresent = false;
/*  39 */   private String eseguiConCriteria = null;
/*  40 */   private String effettuaPaginazione = null;
/*  41 */   private String useCachedQuery = null;
/*     */   
/*  43 */   private String explicitAlias = null;
/*  44 */   private String explicitJoins = null;
/*     */   
/*  46 */   private Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String CACHED_HQL_QUERY = "CACHED_HQL_QUERY";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String DESCRITTORE_RICERCA = "DESCRITTORE_RICERCA";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String RISULTATO_RICERCA = "RISULTATO_RICERCA";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean useExplicitJoins() {
/*  65 */     return ArchUtils.isValid(getExplicitJoins());
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
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*  83 */     if (this.logger.isDebugEnabled()) {
/*  84 */       this.logger.debug("CP: Modulo di ricerca generico.");
/*     */     }
/*  86 */     if (this.logger.isDebugEnabled()) {
/*  87 */       this.logger.debug("CP: Configurazione: " + printModuleConfiguration());
/*     */     }
/*     */ 
/*     */     
/*  91 */     MapContainer outMc = new MapContainer();
/*     */     
/*  93 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)inputMap.getAppl("DESCRITTORE_RICERCA");
/*     */ 
/*     */     
/*  96 */     List list = null;
/*     */     
/*  98 */     if (deveEseguireConCriteria()) {
/*     */ 
/*     */       
/*     */       try {
/* 102 */         if (this.logger.isWarnEnabled()) {
/* 103 */           this.logger.warn("La gestione con Criteria e' specifica per le ricerche di Catalogo.");
/*     */         }
/* 105 */         inputMap.putAppl(getQueryDescriptorKey(), generaCriteria(descrittoreRicerca));
/*     */       }
/* 107 */       catch (Exception e) {
/*     */         
/* 109 */         throw new RasServiceException(e);
/*     */       } 
/*     */       
/* 112 */       if (!ArchUtils.isValid(getOutputKey()))
/*     */       {
/* 114 */         setOutputKey("RISULTATO_RICERCA");
/*     */       }
/*     */       
/* 117 */       return super.service(inputMap);
/*     */     } 
/*     */ 
/*     */     
/* 121 */     this.andInWherePresent = false;
/* 122 */     String hqlQuery = derivaHqlQuery(inputMap, descrittoreRicerca);
/*     */     
/* 124 */     if (deveUsarePaginazione()) {
/*     */       
/* 126 */       String column = getOrderColumn(getLista(), inputMap);
/* 127 */       String property = getOrderClause(column);
/* 128 */       boolean desc = getOrderDesc(getLista(), column, inputMap);
/* 129 */       IListElementComparator comparator = getOrderComparator(column, desc);
/*     */ 
/*     */       
/* 132 */       list = getDao().executeHqlQuery(hqlQuery, (Object[])new String[0], getInitRow(inputMap), getPageSize(), property, desc, comparator);
/*     */ 
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */ 
/*     */       
/* 140 */       list = getDao().executeHqlQuery(hqlQuery, (Object[])new String[0]);
/*     */     } 
/*     */     
/* 143 */     outMc.putAppl("CACHED_HQL_QUERY", hqlQuery);
/*     */ 
/*     */     
/* 146 */     outMc.putAppl("RISULTATO_RICERCA", list);
/*     */     
/* 148 */     if (this.logger.isDebugEnabled()) {
/* 149 */       this.logger.debug("Risultato (" + list.size() + " elemento/i) inserito in MapContainer, modulo terminato");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 154 */     return outMc;
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
/*     */   private String derivaHqlQuery(MapContainer inputMap, DescrittoreRicerca descrittoreRicerca) {
/* 166 */     if (canUseCachedQuery()) {
/*     */       
/*     */       try {
/*     */         
/* 170 */         String hqlGenerato = (String)inputMap.getAppl("CACHED_HQL_QUERY");
/* 171 */         if (ArchUtils.isValid(hqlGenerato)) {
/* 172 */           return hqlGenerato;
/*     */         }
/* 174 */       } catch (Exception e) {}
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 179 */     return buildHQLQuery(descrittoreRicerca);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean canUseCachedQuery() {
/* 188 */     if (!ArchUtils.isValid(getUseCachedQuery())) {
/* 189 */       return false;
/*     */     }
/* 191 */     return "true".equalsIgnoreCase(getUseCachedQuery());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private DetachedCriteria generaCriteria(DescrittoreRicerca descrittoreRicerca) throws Exception {
/* 202 */     DetachedCriteria dc = DetachedCriteria.forClass(Class.forName(getTarget()));
/*     */     
/* 204 */     throw new Exception("UTILIZZO CON 'DetachedCriteria' NON SUPPORTATO.");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean deveEseguireConCriteria() {
/* 212 */     if (!ArchUtils.isValid(getEseguiConCriteria())) {
/* 213 */       return false;
/*     */     }
/* 215 */     return "true".equalsIgnoreCase(getEseguiConCriteria());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean deveUsarePaginazione() {
/* 224 */     if (!ArchUtils.isValid(getEffettuaPaginazione())) {
/* 225 */       return false;
/*     */     }
/* 227 */     return "true".equalsIgnoreCase(getEffettuaPaginazione());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String concatenateWhereConditions() {
/* 237 */     if (!this.andInWherePresent) {
/* 238 */       this.andInWherePresent = true;
/*     */       
/* 240 */       return "WHERE ";
/*     */     } 
/* 242 */     this.andInWherePresent = true;
/*     */     
/* 244 */     return " AND ";
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
/*     */   private String buildHQLQuery(DescrittoreRicerca descrittore) {
/* 258 */     List parametri = descrittore.getParametri();
/* 259 */     List parametriDiOrdinamento = descrittore.getParemetriDiOrdinamento();
/*     */     
/* 261 */     String alias = getExplicitAlias();
/* 262 */     if (!ArchUtils.isValid(alias)) {
/* 263 */       alias = "tableAlias";
/*     */     }
/*     */     
/* 266 */     String query = "";
/* 267 */     String queryBase = "select distinct " + alias + " from " + getTarget() + " " + alias + " ";
/*     */ 
/*     */     
/* 270 */     if (ArchUtils.isValid(getExplicitJoins())) {
/* 271 */       queryBase = queryBase + " " + getExplicitJoins() + " ";
/*     */     }
/*     */     
/* 274 */     String queryWhere = "";
/* 275 */     String queryOrder = "";
/*     */     
/* 277 */     if (parametri != null && parametri.size() >= 0) {
/* 278 */       Iterator parametriIterator = parametri.iterator();
/*     */ 
/*     */       
/* 281 */       while (parametriIterator.hasNext()) {
/* 282 */         Parametro currentParametro = parametriIterator.next();
/*     */ 
/*     */         
/* 285 */         if (currentParametro.isActive()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 292 */           String espressioneSinistra = costruisciEspressioneSinistra(currentParametro.getNomeLogico(), alias);
/*     */ 
/*     */ 
/*     */           
/* 296 */           if (!"".equals(espressioneSinistra))
/*     */           {
/*     */ 
/*     */             
/* 300 */             queryWhere = queryWhere + concatenateWhereConditions() + costruisciEspressioneSinistra(currentParametro.getNomeLogico(), alias) + currentParametro.costruisciEspressione() + " ";
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 309 */     if (parametriDiOrdinamento != null && parametriDiOrdinamento.size() >= 0) {
/*     */ 
/*     */ 
/*     */       
/* 313 */       queryOrder = queryOrder + " order by ";
/*     */       
/* 315 */       Iterator parametriDiOrdinamentoIterator = parametriDiOrdinamento.iterator();
/*     */       
/* 317 */       boolean firstRound = true;
/* 318 */       while (parametriDiOrdinamentoIterator.hasNext()) {
/*     */         
/* 320 */         if (firstRound) {
/*     */           
/* 322 */           firstRound = false;
/*     */         }
/*     */         else {
/*     */           
/* 326 */           queryOrder = queryOrder + " , ";
/*     */         } 
/*     */         
/* 329 */         ParametroDiOrdinamento currentParametroDiOrdinamento = parametriDiOrdinamentoIterator.next();
/*     */         
/* 331 */         queryOrder = queryOrder + costruisciEspressioneSinistra(currentParametroDiOrdinamento.getNomeLogico(), alias) + " " + currentParametroDiOrdinamento.getTipoOrdinamento();
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 337 */     query = queryBase + queryWhere + queryOrder;
/*     */     
/* 339 */     if (this.logger.isDebugEnabled()) {
/* 340 */       this.logger.debug("CP: Query costruita:\n\t" + query);
/*     */     }
/* 342 */     return query;
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
/*     */   private String costruisciEspressioneSinistra(String nomeLogico, String alias) {
/* 358 */     String espressione = "";
/* 359 */     boolean changeDone = false;
/*     */     
/* 361 */     Iterator iterator = this.fieldsMapping.keySet().iterator();
/*     */     
/* 363 */     while (iterator.hasNext() && !changeDone) {
/* 364 */       String chiave = iterator.next();
/* 365 */       String valore = (String)this.fieldsMapping.get(chiave);
/*     */       
/* 367 */       if (nomeLogico.startsWith(chiave + ".")) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 374 */         if (valore == null || "".equals(valore)) {
/* 375 */           valore = alias;
/*     */         }
/* 377 */         else if (!useExplicitJoins()) {
/* 378 */           espressione = espressione + alias + ".";
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 385 */         espressione = espressione + nomeLogico.replaceFirst(chiave, valore);
/* 386 */         changeDone = true;
/*     */       } 
/*     */     } 
/*     */     
/* 390 */     if (this.logger.isDebugEnabled()) {
/* 391 */       this.logger.debug("CP: Il nome logico originale " + nomeLogico + " è stato cambiato in " + espressione);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 396 */     return espressione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String printModuleConfiguration() {
/* 405 */     String str = "\n";
/*     */     
/* 407 */     str = str + " - Bean Target: " + this.target + "\n";
/*     */     
/* 409 */     Iterator iterator = this.fieldsMapping.keySet().iterator();
/*     */     
/* 411 */     while (iterator.hasNext()) {
/* 412 */       String chiave = iterator.next();
/*     */       
/* 414 */       str = str + " - FIELD MAPPING:\n";
/* 415 */       str = str + "   +     prefisso: " + chiave + "\n";
/* 416 */       str = str + "   + sostituzione: " + this.fieldsMapping.get(chiave) + "\n";
/*     */     } 
/*     */     
/* 419 */     return str;
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
/*     */   
/*     */   public Map getFieldsMapping() {
/* 459 */     return this.fieldsMapping;
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
/*     */   
/*     */   public void setFieldsMapping(Map fieldsMapping) {
/* 499 */     this.fieldsMapping = fieldsMapping;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTarget() {
/* 510 */     return this.target;
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
/*     */   public void setTarget(String target) {
/* 522 */     this.target = target;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEseguiConCriteria() {
/* 530 */     return this.eseguiConCriteria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEseguiConCriteria(String eseguiConCriteria) {
/* 538 */     this.eseguiConCriteria = eseguiConCriteria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEffettuaPaginazione() {
/* 546 */     return this.effettuaPaginazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEffettuaPaginazione(String effettuaPaginazione) {
/* 554 */     this.effettuaPaginazione = effettuaPaginazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUseCachedQuery() {
/* 562 */     return this.useCachedQuery;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUseCachedQuery(String useCachedQuery) {
/* 570 */     this.useCachedQuery = useCachedQuery;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getExplicitAlias() {
/* 577 */     return this.explicitAlias;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExplicitAlias(String explicitAlias) {
/* 584 */     this.explicitAlias = explicitAlias;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getExplicitJoins() {
/* 591 */     return this.explicitJoins;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setExplicitJoins(String explicitJoins) {
/* 598 */     this.explicitJoins = explicitJoins;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\module\CercaCatalogoModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */