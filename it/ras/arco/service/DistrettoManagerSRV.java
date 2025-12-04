/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinDistretto;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.springframework.orm.hibernate3.HibernateObjectRetrievalFailureException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DistrettoManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String GENERIC_MODULE_RESULT = "DISTRETTO";
/*     */   public static final String DISTRETTO = "DISTRETTO";
/*     */   public static final String CODICE_DISTRETTO = "CODICE_DISTRETTO";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GET_DISTRETTO_BY_CODICE = "GET_DISTRETTO_BY_CODICE";
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  30 */   private Log log = LogFactory.getLog(DistrettoManagerSRV.class);
/*  31 */   private String action = "Azione nulla";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  42 */     MapContainer resultMap = new MapContainer();
/*  43 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  45 */     Object oDistretto = map.getAppl("DISTRETTO");
/*  46 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */     
/*  49 */     Boolean allowMultipleRows = null;
/*  50 */     String moduleName = null;
/*  51 */     FinDistretto distretto = null;
/*     */     
/*  53 */     if (oAllowMultipleRows == null) {
/*     */       
/*  55 */       oAllowMultipleRows = new Boolean(false);
/*     */     }
/*  57 */     else if (!(oAllowMultipleRows instanceof Boolean)) {
/*     */       
/*  59 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  60 */       if (this.log.isErrorEnabled())
/*     */       {
/*  62 */         this.log.error(str);
/*     */       }
/*  64 */       throw new RasServiceException(str);
/*     */     } 
/*     */     
/*  67 */     if (this.action.equals("GET_DISTRETTO_BY_CODICE")) {
/*     */       
/*  69 */       distretto = (FinDistretto)getBean(oDistretto, FinDistretto.class.getName());
/*  70 */       String codDistretto = distretto.getCodDistretto();
/*  71 */       paramMap.putAppl("CODICE_DISTRETTO", codDistretto);
/*  72 */       moduleName = "GetDistrettoByCodiceMD";
/*     */ 
/*     */       
/*     */       try {
/*  76 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       }
/*  78 */       catch (HibernateObjectRetrievalFailureException e) {
/*     */         
/*  80 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  81 */         rse.setStackTrace(e.getStackTrace());
/*  82 */         throw rse;
/*     */       } 
/*     */       
/*  85 */       return processResultMap(resultMap, allowMultipleRows);
/*     */     } 
/*  87 */     if (getAction().equals("INSERT")) {
/*     */       
/*  89 */       moduleName = "InsertDistrettoMD";
/*  90 */       distretto = (FinDistretto)getBean(oDistretto, FinDistretto.class.getName());
/*  91 */       paramMap.putAppl("DISTRETTO", distretto);
/*  92 */       getModuleManager().execModule(moduleName, paramMap);
/*  93 */       resultMap = new MapContainer();
/*  94 */       resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/*     */       
/*  96 */       return resultMap;
/*     */     } 
/*  98 */     if (getAction().equals("UPDATE")) {
/*     */       
/* 100 */       moduleName = "UpdateDistrettoMD";
/* 101 */       distretto = (FinDistretto)getBean(oDistretto, FinDistretto.class.getName());
/* 102 */       paramMap.putAppl("DISTRETTO", distretto);
/* 103 */       getModuleManager().execModule(moduleName, paramMap);
/* 104 */       resultMap = new MapContainer();
/* 105 */       resultMap.putAppl("RESULT_MESSAGE", "UPDATED");
/*     */       
/* 107 */       return resultMap;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 112 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 113 */     if (this.log.isErrorEnabled())
/*     */     {
/* 115 */       this.log.error(errorMessage);
/*     */     }
/* 117 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, Boolean allowMultipleRow) {
/* 123 */     ArrayList result = (ArrayList)resultMap.getAppl("DISTRETTO");
/*     */     
/* 125 */     resultMap.removeAppl("DISTRETTO");
/*     */     
/* 127 */     if (result.size() == 0) {
/*     */       
/* 129 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 131 */     else if (result.size() == 1) {
/*     */       
/* 133 */       resultMap.putAppl("RESULT", "FOUND");
/* 134 */       resultMap.putAppl("DISTRETTO", result.get(0));
/*     */     }
/* 136 */     else if (allowMultipleRow.booleanValue() == true) {
/*     */       
/* 138 */       resultMap.putAppl("RESULT", "FOUND");
/* 139 */       resultMap.putAppl("DISTRETTO", result);
/*     */     }
/*     */     else {
/*     */       
/* 143 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 145 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 152 */     Object retObject = null;
/*     */     
/*     */     try {
/* 155 */       Class c = Class.forName(className);
/* 156 */       if (!c.isInstance(obj)) {
/*     */         
/* 158 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/*     */         
/* 160 */         if (this.log.isErrorEnabled())
/*     */         {
/* 162 */           this.log.error(errorMessage);
/*     */         }
/* 164 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 166 */       retObject = obj;
/*     */     }
/* 168 */     catch (ClassNotFoundException e) {
/*     */       
/* 170 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/*     */       
/* 172 */       if (this.log.isErrorEnabled())
/*     */       {
/* 174 */         this.log.error(errorMessage);
/*     */       }
/* 176 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 178 */     return retObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 188 */     return this.action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 198 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\DistrettoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */