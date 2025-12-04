/*     */ package it.ras.arco.common.bean;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.config.CodesTableManager;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class CodesTableManager
/*     */   extends CodesTableManager
/*     */ {
/*  24 */   private String forceNoFilterIfNull = "false";
/*     */   
/*  26 */   private Map filterBlackList = new HashMap();
/*     */   
/*  28 */   private List forcedNoFilterFetchTables = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String decodeValue(String tableName, String filterValue, String inputField, String outputField, Object value) {
/*  35 */     if (!ArchUtils.isValid(filterValue)) {
/*  36 */       return super.decodeValue(tableName, null, inputField, outputField, value);
/*     */     }
/*     */ 
/*     */     
/*  40 */     if (this.filterBlackList != null && this.filterBlackList.get(filterValue) != null) {
/*  41 */       return super.decodeValue(tableName, null, inputField, outputField, value);
/*     */     }
/*     */ 
/*     */     
/*  45 */     String str = null;
/*     */     try {
/*  47 */       str = super.decodeValue(tableName, filterValue, inputField, outputField, value);
/*     */     }
/*  49 */     catch (Exception e) {
/*  50 */       if (doForceNoFilterIfNull() && forceFetchOnTable(tableName)) {
/*  51 */         if (this.filterBlackList != null) {
/*  52 */           this.filterBlackList.put(filterValue, new Boolean(true));
/*     */         }
/*     */         
/*  55 */         return super.decodeValue(tableName, null, inputField, outputField, value);
/*     */       } 
/*     */ 
/*     */       
/*  59 */       return "";
/*     */     } 
/*     */     
/*  62 */     if (!ArchUtils.isValid(str)) {
/*  63 */       if (doForceNoFilterIfNull() && forceFetchOnTable(tableName)) {
/*  64 */         if (this.filterBlackList != null) {
/*  65 */           this.filterBlackList.put(filterValue, new Boolean(true));
/*     */         }
/*     */         
/*  68 */         str = super.decodeValue(tableName, null, inputField, outputField, value);
/*     */       } else {
/*     */         
/*  71 */         str = "";
/*     */       } 
/*     */     }
/*     */     
/*  75 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getListForTable(String tableName, String filterValue) {
/*  82 */     if (!ArchUtils.isValid(filterValue)) {
/*  83 */       return super.getListForTable(tableName, null);
/*     */     }
/*     */     
/*  86 */     if (this.filterBlackList != null && this.filterBlackList.get(filterValue) != null) {
/*  87 */       return super.getListForTable(tableName, null);
/*     */     }
/*     */     
/*  90 */     List list = null;
/*     */     
/*     */     try {
/*  93 */       list = super.getListForTable(tableName, filterValue);
/*  94 */     } catch (Exception e) {
/*  95 */       if (doForceNoFilterIfNull() && forceFetchOnTable(tableName)) {
/*  96 */         if (this.filterBlackList != null) {
/*  97 */           this.filterBlackList.put(filterValue, new Boolean(true));
/*     */         }
/*     */         
/* 100 */         return super.getListForTable(tableName, null);
/*     */       } 
/*     */       
/* 103 */       return new ArrayList();
/*     */     } 
/*     */     
/* 106 */     if (list == null || list.isEmpty()) {
/* 107 */       if (doForceNoFilterIfNull() && forceFetchOnTable(tableName)) {
/* 108 */         if (this.filterBlackList != null) {
/* 109 */           this.filterBlackList.put(filterValue, new Boolean(true));
/*     */         }
/*     */         
/* 112 */         list = super.getListForTable(tableName, null);
/*     */       } else {
/* 114 */         list = new ArrayList();
/*     */       } 
/*     */     }
/*     */     
/* 118 */     return list;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getForceNoFilterIfNull() {
/* 125 */     return this.forceNoFilterIfNull;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setForceNoFilterIfNull(String forceNoFilterIfNull) {
/* 133 */     this.forceNoFilterIfNull = forceNoFilterIfNull;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean doForceNoFilterIfNull() {
/* 141 */     return "true".equalsIgnoreCase(getForceNoFilterIfNull());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getForcedNoFilterFetchTables() {
/* 148 */     return this.forcedNoFilterFetchTables;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setForcedNoFilterFetchTables(List forcedNoFilterFetchTables) {
/* 156 */     this.forcedNoFilterFetchTables = forcedNoFilterFetchTables;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean forceFetchOnTable(String tableName) {
/* 165 */     if (getForcedNoFilterFetchTables() == null || getForcedNoFilterFetchTables().isEmpty() || !ArchUtils.isValid(tableName))
/*     */     {
/*     */       
/* 168 */       return false;
/*     */     }
/*     */     
/* 171 */     Iterator iter = getForcedNoFilterFetchTables().iterator();
/* 172 */     while (iter.hasNext()) {
/* 173 */       String aTable = iter.next();
/* 174 */       if (tableName.equals(aTable)) {
/* 175 */         return true;
/*     */       }
/*     */     } 
/*     */     
/* 179 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\CodesTableManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */