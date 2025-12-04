/*     */ package it.ras.flag.module;
/*     */ 
/*     */ import it.ras.flag.dao.IRasDaoExtended;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.query.ISpringConfigurableQuery;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.sql.SQLException;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.transform.AliasToBeanResultTransformer;
/*     */ import org.hibernate.transform.ResultTransformer;
/*     */ import org.hibernate.type.Type;
/*     */ 
/*     */ public class DefaultDbModuleExtended
/*     */   extends DefaultDbModule {
/*  19 */   private static Log _log = LogFactory.getLog(DefaultDbModuleExtended.class);
/*     */   public static final String SQL_QUERY_LABEL = "SQL_QUERY";
/*     */   public static final String ALIASES_LABEL = "ALIASES";
/*     */   public static final String TRANSFORMER_LABEL = "CUSTOM_TRANSFORMER";
/*     */   public static final String RETURN_TYPES_LABEL = "RETURN_TYPES";
/*     */   public static final String RESULT = "RESULT";
/*     */   public static final String PARAM_NAME = "PARAM_NAME";
/*     */   public static final String PARAM_VALUE = "PARAM_VALUE";
/*     */   public static final int QUERY_DINAMICA = 100;
/*     */   public static final int QUERY_NEWMODES_PROGRESSION = 100;
/*  29 */   private int query = -1;
/*     */   
/*  31 */   private String output = "";
/*     */   
/*  33 */   private String queryName = null;
/*     */   
/*  35 */   private ISpringConfigurableQuery springConfigurableQuery = null;
/*     */ 
/*     */   
/*     */   public MapContainer service(MapContainer map) throws RasServiceException {
/*  39 */     if (this.query >= 100) {
/*     */       Map m;
/*  41 */       MapContainer outputMap = new MapContainer();
/*     */       
/*  43 */       List list = null;
/*     */       
/*  45 */       switch (this.query) {
/*     */         
/*     */         case 100:
/*  48 */           list = eseguiQueryDinamica(map);
/*     */           break;
/*     */         case 101:
/*  51 */           list = eseguiProceduraOracleConTransformer(map);
/*     */           break;
/*     */         case 102:
/*  54 */           list = eseguiQueryMappataConTransformer(map);
/*     */           break;
/*     */         case 103:
/*  57 */           list = eseguiSpringConfigurableQuery(map);
/*     */           break;
/*     */ 
/*     */         
/*     */         case 104:
/*     */           try {
/*  63 */             m = eseguiPlSql(map);
/*     */           }
/*  65 */           catch (Exception e) {
/*     */             
/*  67 */             SQLException sqlex = (SQLException)e;
/*  68 */             RasServiceException ex = new RasServiceException();
/*     */             
/*  70 */             String errore = null;
/*     */             
/*  72 */             if ("RipristinaPropostaModule".equals(this.moduleName)) {
/*  73 */               errore = sqlex.getMessage();
/*     */             }
/*  75 */             if ("ApplicaUaModule".equals(this.moduleName)) {
/*  76 */               errore = sqlex.getMessage();
/*     */             } else {
/*     */               
/*  79 */               errore = "it.ras.arco.ordine.cancella.eseguito";
/*     */             } 
/*     */             
/*  82 */             ex.addError(new RasValidationSignal(errore, "ORA-" + sqlex.getErrorCode()));
/*  83 */             throw ex;
/*     */           } 
/*  85 */           outputMap.putAppl(this.output, m);
/*  86 */           list = null;
/*     */           break;
/*     */       } 
/*  89 */       outputMap.putAppl(this.output, list);
/*  90 */       return outputMap;
/*     */     } 
/*     */     
/*  93 */     return switchQuery(map);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List eseguiQueryDinamica(MapContainer map) throws RasServiceException {
/*  99 */     String sqlQuery = (String)map.getAppl("SQL_QUERY");
/* 100 */     String[] aliases = (String[])map.getAppl("ALIASES");
/*     */     
/* 102 */     String[] paramName = (String[])map.getAppl("PARAM_NAME");
/* 103 */     Object[] paramValue = (Object[])map.getAppl("PARAM_VALUE");
/*     */     
/* 105 */     ResultTransformer transformer = (ResultTransformer)map.getAppl("CUSTOM_TRANSFORMER");
/*     */     
/* 107 */     Type[] returnTypes = (Type[])map.getAppl("RETURN_TYPES");
/* 108 */     List results = ((IRasDaoExtended)getDao()).executeDynamicSqlQueryWithTransformer(sqlQuery, paramName, paramValue, aliases, returnTypes, transformer);
/*     */     
/* 110 */     return results;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List eseguiQueryMappataConTransformer(MapContainer map) throws RasServiceException {
/* 116 */     ResultTransformer transformer = (ResultTransformer)map.getAppl("CUSTOM_TRANSFORMER");
/*     */     
/* 118 */     List results = ((IRasDaoExtended)getDao()).executeQueryWithTransformer(this.queryName, getNames(), getParam(map), transformer);
/*     */     
/* 120 */     return results;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List eseguiSpringConfigurableQuery(MapContainer map) throws RasServiceException {
/* 126 */     ISpringConfigurableQuery springQuery = this.springConfigurableQuery;
/*     */     
/* 128 */     String queryString = springQuery.getQueryName();
/*     */     
/* 130 */     String[] aliases = springQuery.getAliases();
/*     */     
/* 132 */     Type[] returnTypes = springQuery.getTypes();
/*     */     
/* 134 */     String[] paramNames = springQuery.getParamNames();
/*     */     
/* 136 */     Object[] params = getParam(map);
/*     */     
/* 138 */     AliasToBeanResultTransformer transformer = new AliasToBeanResultTransformer(springQuery.getResultContainerClass());
/*     */     
/* 140 */     List results = ((IRasDaoExtended)getDao()).executeDynamicSqlQueryWithTransformer(queryString, paramNames, params, aliases, returnTypes, (ResultTransformer)transformer, true);
/*     */     
/* 142 */     return results;
/*     */   }
/*     */ 
/*     */   
/*     */   public Map eseguiPlSql(MapContainer map) throws Exception {
/*     */     Map m;
/* 148 */     String queryString = this.queryName;
/*     */     
/* 150 */     String[] paramNames = getNames();
/*     */     
/* 152 */     Object[] params = getParam(map);
/*     */ 
/*     */     
/*     */     try {
/* 156 */       m = ((IRasDaoExtended)getDao()).executePlSql(queryString, paramNames, params);
/*     */     }
/* 158 */     catch (Exception e) {
/*     */       
/* 160 */       throw e;
/*     */     } 
/* 162 */     if (m != null && m.containsKey("SQL_ERROR_MESSAGE") && _log.isErrorEnabled())
/*     */     {
/* 164 */       _log.error(queryString + " " + paramNames.toString() + " " + " " + params.toString() + " " + m.get("SQL_ERROR_MESSAGE"));
/*     */     }
/*     */     
/* 167 */     return m;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List eseguiProceduraOracleConTransformer(MapContainer map) throws RasServiceException {
/* 173 */     ResultTransformer transformer = (ResultTransformer)map.getAppl("CUSTOM_TRANSFORMER");
/*     */     
/* 175 */     List results = ((IRasDaoExtended)getDao()).callOracleProcedureUnderQueryWithTransformer(this.queryName, getNames(), getParam(map), transformer);
/*     */     
/* 177 */     return results;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setQuery(int query) {
/* 182 */     this.query = query;
/*     */     
/* 184 */     super.setQuery(this.query);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOutput(String output) {
/* 189 */     this.output = output;
/* 190 */     super.setOutput(this.output);
/*     */   }
/*     */   
/*     */   public void setQueryName(String queryName) {
/* 194 */     this.queryName = queryName;
/* 195 */     super.setQueryName(this.queryName);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSpringConfigurableQuery(ISpringConfigurableQuery springConfigurableQuery) {
/* 200 */     this.springConfigurableQuery = springConfigurableQuery;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\module\DefaultDbModuleExtended.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */