/*     */ package it.ras.flag.dao;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.batch.skeleton.RasBatchDao;
/*     */ import it.ras.flag.exception.RasDaoException;
/*     */ import it.ras.flag.query.QueryResultInstantiator;
/*     */ import java.sql.CallableStatement;
/*     */ import java.sql.SQLException;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.SQLQuery;
/*     */ import org.hibernate.exception.GenericJDBCException;
/*     */ import org.hibernate.transform.ResultTransformer;
/*     */ import org.hibernate.type.Type;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RasDaoExtended
/*     */   extends RasBatchDao
/*     */   implements IRasDaoExtended
/*     */ {
/*     */   public static final String QUERY_NEMED_PARAMETER_IDENTIFIER = ":";
/*     */   public static final String QUERY_POS_PARAMETER_IDENTIFIER = "?";
/*     */   public static final String SQL_ERROR_MESSAGE = "SQL_ERROR_MESSAGE";
/*     */   public static final String SQL_ERROR_KEY = "SQL_ERROR_KEY";
/*     */   public static final String RETURN_VALUE = "RETURN_VALUE";
/*  32 */   private Log log = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */   
/*     */   public List executeDynamicSqlQueryWithTransformer(String sqlQuery, String[] paramNames, Object[] params, String[] returnAliases, Type[] returnTypes, ResultTransformer transformer, boolean forceParams) throws RasDaoException {
/*  37 */     if (forceParams) {
/*  38 */       sqlQuery = forceParamsSubstitution(sqlQuery, paramNames, params);
/*     */     }
/*     */     try {
/*  41 */       SQLQuery hibernateSqlQuery = this.sessionFactory.getSession().getHibernateSession().createSQLQuery(sqlQuery);
/*     */       
/*  43 */       if (!forceParams) {
/*  44 */         setParams((Query)hibernateSqlQuery, paramNames, params);
/*     */       }
/*     */       
/*  47 */       setReturnTypes(hibernateSqlQuery, returnAliases, returnTypes);
/*     */       
/*  49 */       hibernateSqlQuery.setReadOnly(true);
/*  50 */       List queryResults = hibernateSqlQuery.list();
/*  51 */       if (queryResults != null) {
/*     */         
/*  53 */         QueryResultInstantiator resultInstantiator = new QueryResultInstantiator(transformer, returnAliases);
/*     */         
/*  55 */         return resultInstantiator.transformQueryResults(queryResults);
/*     */       } 
/*  57 */       return queryResults;
/*  58 */     } catch (Exception e) {
/*  59 */       RasDaoException rasException = new RasDaoException(e);
/*  60 */       rasException.setStackTrace(e.getStackTrace());
/*  61 */       throw rasException;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List executeDynamicSqlQueryWithTransformer(String sqlQuery, String[] returnAliases, Type[] returnTypes, ResultTransformer transformer) throws RasDaoException {
/*  68 */     return executeDynamicSqlQueryWithTransformer(sqlQuery, null, null, returnAliases, returnTypes, transformer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List executeDynamicSqlQueryWithTransformer(String sqlQuery, String[] paramNames, Object[] params, String[] returnAliases, Type[] returnTypes, ResultTransformer transformer) throws RasDaoException {
/*  74 */     return executeDynamicSqlQueryWithTransformer(sqlQuery, paramNames, params, returnAliases, returnTypes, transformer, false);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List executeQueryWithTransformer(String queryName, Object[] params, ResultTransformer transformer) throws RasDaoException {
/*  80 */     return executeQueryWithTransformer(queryName, null, params, transformer);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List executeQueryWithTransformer(String queryName, String[] paramNames, Object[] params, ResultTransformer transformer) throws RasDaoException {
/*  86 */     List listaRisultati = null;
/*     */     
/*  88 */     if (!ArchUtils.isValid(queryName)) {
/*  89 */       throw new RasDaoException("errors.null.pointer", "Cannot execute statement");
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/*  94 */       Query hibernateQuery = this.sessionFactory.getSession().getHibernateSession().getNamedQuery(queryName);
/*     */       
/*  96 */       if (hibernateQuery != null) {
/*     */         
/*  98 */         setParams(hibernateQuery, paramNames, params);
/*     */         
/* 100 */         hibernateQuery.setReadOnly(true);
/*     */         
/* 102 */         listaRisultati = hibernateQuery.list();
/*     */       } else {
/*     */         
/* 105 */         throw new RasDaoException("errors.null.pointer", "Query not found");
/*     */       }
/*     */     
/* 108 */     } catch (Exception e) {
/* 109 */       RasDaoException rasException = new RasDaoException(e);
/* 110 */       rasException.setStackTrace(e.getStackTrace());
/* 111 */       throw rasException;
/*     */     } 
/*     */     
/* 114 */     return listaRisultati;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public List callOracleProcedureUnderQueryWithTransformer(String queryName, String[] paramNames, Object[] params, ResultTransformer transformer) throws RasDaoException {
/* 120 */     List listaRisultati = null;
/*     */     
/* 122 */     if (!ArchUtils.isValid(queryName)) {
/* 123 */       throw new RasDaoException("errors.null.pointer", "Cannot execute statement");
/*     */     }
/*     */ 
/*     */     
/*     */     try {
/* 128 */       Query sourceHibernateQuery = this.sessionFactory.getSession().getHibernateSession().getNamedQuery(queryName);
/*     */       
/* 130 */       if (sourceHibernateQuery != null)
/*     */       {
/* 132 */         String queryString = sourceHibernateQuery.getQueryString();
/*     */         
/* 134 */         forceParamsSubstitution(queryString, paramNames, params);
/*     */         
/* 136 */         Type[] returnTypes = sourceHibernateQuery.getReturnTypes();
/*     */         
/* 138 */         String[] returnAliases = sourceHibernateQuery.getReturnAliases();
/*     */         
/* 140 */         listaRisultati = executeDynamicSqlQueryWithTransformer(queryString, returnAliases, returnTypes, transformer);
/*     */       }
/*     */       else
/*     */       {
/* 144 */         throw new RasDaoException("errors.null.pointer", "Query not found");
/*     */       }
/*     */     
/* 147 */     } catch (Exception e) {
/* 148 */       RasDaoException rasException = new RasDaoException(e);
/* 149 */       rasException.setStackTrace(e.getStackTrace());
/* 150 */       throw rasException;
/*     */     } 
/* 152 */     return listaRisultati;
/*     */   }
/*     */   
/*     */   private void setParams(Query query, String[] paramNames, Object[] params) {
/* 156 */     if (paramNames != null && params != null) {
/* 157 */       for (int i = 0; i < paramNames.length; i++) {
/* 158 */         query.setParameter(paramNames[i], params[i]);
/*     */       }
/* 160 */     } else if (params != null) {
/* 161 */       for (int i = 0; i < params.length; i++)
/* 162 */         query.setParameter(i, params[i]); 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void setReturnTypes(SQLQuery query, String[] returnAliases, Type[] returnTypes) {
/* 167 */     if (returnAliases != null && returnTypes != null)
/* 168 */       for (int i = 0; i < returnAliases.length; i++) {
/* 169 */         query.addScalar(returnAliases[i], returnTypes[i]);
/*     */       } 
/*     */   }
/*     */   
/*     */   private String forceParamsSubstitution(String queryString, String[] paramNames, Object[] params) {
/* 174 */     if (paramNames != null && params != null) {
/* 175 */       for (int i = 0; i < paramNames.length; i++)
/*     */       {
/* 177 */         String aParameterName = paramNames[i];
/*     */         
/* 179 */         queryString = queryString.replaceFirst(":" + aParameterName, params[i].toString());
/*     */       }
/*     */     
/* 182 */     } else if (params != null) {
/* 183 */       for (int i = 0; i < params.length; i++)
/*     */       {
/* 185 */         queryString.replaceFirst("?", params[i].toString());
/*     */       }
/*     */     } 
/*     */     
/* 189 */     return queryString;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Map executePlSql(String queryName, String[] paramNames, Object[] params) throws SQLException, Exception {
/* 195 */     Map m = new HashMap();
/* 196 */     int k = -1;
/* 197 */     if (queryName != null) {
/*     */       try {
/* 199 */         CallableStatement hibernateSqlQuery = this.sessionFactory.getSession().getHibernateSession().connection().prepareCall(queryName);
/*     */         
/* 201 */         PlsqlParamInSubstitution(hibernateSqlQuery, paramNames, params);
/*     */         
/* 203 */         hibernateSqlQuery.execute();
/*     */       }
/* 205 */       catch (GenericJDBCException e) {
/* 206 */         SQLException sqlex = e.getSQLException();
/* 207 */         m.put("SQL_ERROR_KEY", new Integer(sqlex.getErrorCode()));
/* 208 */         m.put("SQL_ERROR_MESSAGE", sqlex.getMessage());
/* 209 */         throw e;
/*     */       }
/* 211 */       catch (SQLException e) {
/*     */         
/* 213 */         if (this.log.isErrorEnabled()) {
/* 214 */           this.log.error("Si è verificato un'errore durante la procedura di cancellazione movimento eseguito");
/* 215 */           this.log.error(e);
/*     */         } 
/*     */         
/* 218 */         throw e;
/*     */       } 
/*     */     }
/*     */     
/* 222 */     m.put("RETURN_VALUE", new Integer(k));
/* 223 */     return m;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void PlsqlParamInSubstitution(CallableStatement hibernateSqlQuery, String[] paramNames, Object[] params) throws Exception {
/* 229 */     if (params != null && params.length > 0 && paramNames != null && paramNames.length > 0 && params.length == paramNames.length)
/* 230 */       for (int i = 0; i < params.length; i++) {
/*     */         try {
/* 232 */           hibernateSqlQuery.setObject(i + 1, params[i]);
/* 233 */         } catch (SQLException e) {
/* 234 */           throw e;
/*     */         } 
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\dao\RasDaoExtended.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */