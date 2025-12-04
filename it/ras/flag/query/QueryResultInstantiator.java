/*    */ package it.ras.flag.query;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.hibernate.transform.ResultTransformer;
/*    */ 
/*    */ 
/*    */ public class QueryResultInstantiator
/*    */ {
/*    */   private final ResultTransformer transformer;
/*    */   private final String[] queryReturnAliases;
/*    */   
/*    */   public QueryResultInstantiator(ResultTransformer transformer, String[] queryReturnAliases) {
/* 13 */     this.transformer = transformer;
/* 14 */     this.queryReturnAliases = queryReturnAliases;
/*    */   }
/*    */   
/*    */   private Object instantiate(Object[] row) {
/* 18 */     return (this.transformer != null) ? this.transformer.transformTuple(row, this.queryReturnAliases) : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public List transformQueryResults(List queryResults) {
/* 23 */     if (this.transformer != null && queryResults != null) {
/* 24 */       for (int i = 0; i < queryResults.size(); i++) {
/* 25 */         Object[] row = null;
/* 26 */         if (queryResults.get(i) instanceof Object[]) {
/* 27 */           row = queryResults.get(i);
/*    */         } else {
/* 29 */           row = new Object[] { queryResults.get(i) };
/*    */         } 
/* 31 */         Object result = instantiate(row);
/* 32 */         queryResults.set(i, (Object[])result);
/*    */       } 
/*    */       
/* 35 */       return this.transformer.transformList(queryResults);
/*    */     } 
/*    */     
/* 38 */     return queryResults;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\query\QueryResultInstantiator.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */