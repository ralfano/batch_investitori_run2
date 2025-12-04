/*    */ package it.ras.flag.query;
/*    */ 
/*    */ import java.util.List;
/*    */ import org.hibernate.type.Type;
/*    */ import org.hibernate.util.ArrayHelper;
/*    */ 
/*    */ public class SpringConfigurableQueryImpl
/*    */   implements ISpringConfigurableQuery
/*    */ {
/* 10 */   private String queryName = null;
/*    */   
/* 12 */   private List aliasList = null;
/*    */   
/* 14 */   private List typeList = null;
/*    */   
/* 16 */   private List paramNamesList = null;
/*    */   
/* 18 */   private Object resultContainer = null;
/*    */ 
/*    */   
/*    */   public String getQueryName() {
/* 22 */     return this.queryName;
/*    */   }
/*    */   
/*    */   public void setQueryName(String queryName) {
/* 26 */     this.queryName = queryName;
/*    */   }
/*    */   
/*    */   public void setAliasList(List aliasList) {
/* 30 */     this.aliasList = aliasList;
/*    */   }
/*    */   
/*    */   public void setResultContainer(Object resultContainer) {
/* 34 */     this.resultContainer = resultContainer;
/*    */   }
/*    */   
/*    */   public void setTypeList(List typeList) {
/* 38 */     this.typeList = typeList;
/*    */   }
/*    */   
/*    */   public void setParamNamesList(List paramNamesList) {
/* 42 */     this.paramNamesList = paramNamesList;
/*    */   }
/*    */ 
/*    */   
/*    */   public Class getResultContainerClass() {
/* 47 */     return (this.resultContainer != null) ? this.resultContainer.getClass() : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String[] getAliases() {
/* 52 */     List listaAlias = this.aliasList;
/* 53 */     return (listaAlias != null) ? ArrayHelper.toStringArray(listaAlias.toArray()) : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public String[] getParamNames() {
/* 58 */     List listaParamNames = this.paramNamesList;
/* 59 */     return (listaParamNames != null) ? ArrayHelper.toStringArray(listaParamNames.toArray()) : null;
/*    */   }
/*    */ 
/*    */   
/*    */   public Type[] getTypes() {
/* 64 */     List listaTypes = this.typeList;
/* 65 */     return (listaTypes != null) ? ArrayHelper.toTypeArray(listaTypes) : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\query\SpringConfigurableQueryImpl.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */