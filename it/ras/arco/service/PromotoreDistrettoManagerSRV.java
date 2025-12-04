/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPromotoreDistretto;
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
/*     */ public class PromotoreDistrettoManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String GENERIC_MODULE_RESULT = "PROMOTORE_DISTRETTO";
/*     */   public static final String PROMOTORE_DISTRETTO = "PROMOTORE_DISTRETTO";
/*     */   public static final String PROMOTORE_DISTRETTO_LIST = "PROMOTORE_DISTRETTO_LIST";
/*     */   public static final String CODICE_PROMOTORE = "CODICE_PROMOTORE";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GET_ALL_BY_PROMOTORE = "GET_ALL_BY_PROMOTORE_CP";
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  31 */   private Log log = LogFactory.getLog(DistrettoManagerSRV.class);
/*  32 */   private String action = "Azione nulla";
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
/*  43 */     MapContainer resultMap = new MapContainer();
/*  44 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  46 */     Object oPromotoreDistretto = map.getAppl("PROMOTORE_DISTRETTO");
/*  47 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */     
/*  50 */     Boolean allowMultipleRows = null;
/*  51 */     String moduleName = null;
/*  52 */     FinPromotoreDistretto promotoreDistretto = null;
/*     */     
/*  54 */     if (oAllowMultipleRows == null) {
/*     */       
/*  56 */       oAllowMultipleRows = new Boolean(false);
/*     */     }
/*  58 */     else if (!(oAllowMultipleRows instanceof Boolean)) {
/*     */       
/*  60 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  61 */       if (this.log.isErrorEnabled())
/*     */       {
/*  63 */         this.log.error(str);
/*     */       }
/*  65 */       throw new RasServiceException(str);
/*     */     } 
/*     */     
/*  68 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */     
/*  71 */     if (this.action.equals("GET_ALL_BY_PROMOTORE_CP")) {
/*     */       
/*  73 */       moduleName = "GetAllByPromotoreMD";
/*  74 */       promotoreDistretto = (FinPromotoreDistretto)getBean(oPromotoreDistretto, FinPromotoreDistretto.class.getName());
/*  75 */       paramMap.putAppl("CODICE_PROMOTORE", promotoreDistretto.getPromotore().getPromotoreId());
/*     */       
/*     */       try {
/*  78 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       }
/*  80 */       catch (HibernateObjectRetrievalFailureException e) {
/*     */         
/*  82 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  83 */         rse.setStackTrace(e.getStackTrace());
/*  84 */         throw rse;
/*     */       } 
/*     */       
/*  87 */       return processResultMap(resultMap, allowMultipleRows);
/*     */     } 
/*  89 */     if (getAction().equals("INSERT")) {
/*     */       
/*  91 */       moduleName = "InsertPromotoreDistrettoMD";
/*  92 */       promotoreDistretto = (FinPromotoreDistretto)getBean(oPromotoreDistretto, FinPromotoreDistretto.class.getName());
/*  93 */       paramMap.putAppl("PROMOTORE_DISTRETTO", promotoreDistretto);
/*     */       
/*  95 */       getModuleManager().execModule(moduleName, paramMap);
/*  96 */       resultMap = new MapContainer();
/*  97 */       resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/*     */       
/*  99 */       return resultMap;
/*     */     } 
/* 101 */     if (getAction().equals("UPDATE")) {
/*     */       
/* 103 */       moduleName = "UpdatePromotoreDistrettoMD";
/* 104 */       promotoreDistretto = (FinPromotoreDistretto)getBean(oPromotoreDistretto, FinPromotoreDistretto.class.getName());
/* 105 */       paramMap.putAppl("PROMOTORE_DISTRETTO", promotoreDistretto);
/*     */       
/* 107 */       getModuleManager().execModule(moduleName, paramMap);
/* 108 */       resultMap = new MapContainer();
/* 109 */       resultMap.putAppl("RESULT_MESSAGE", "UPDATED");
/*     */       
/* 111 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 115 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 116 */     if (this.log.isErrorEnabled())
/*     */     {
/* 118 */       this.log.error(errorMessage);
/*     */     }
/* 120 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 127 */     Object retObject = null;
/*     */     
/*     */     try {
/* 130 */       Class c = Class.forName(className);
/* 131 */       if (!c.isInstance(obj)) {
/*     */         
/* 133 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/*     */         
/* 135 */         if (this.log.isErrorEnabled())
/*     */         {
/* 137 */           this.log.error(errorMessage);
/*     */         }
/* 139 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 141 */       retObject = obj;
/*     */     }
/* 143 */     catch (ClassNotFoundException e) {
/*     */       
/* 145 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/*     */       
/* 147 */       if (this.log.isErrorEnabled())
/*     */       {
/* 149 */         this.log.error(errorMessage);
/*     */       }
/* 151 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 153 */     return retObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 161 */     return this.action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 171 */     this.action = action;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, Boolean allowMultipleRow) {
/* 177 */     ArrayList result = (ArrayList)resultMap.getAppl("PROMOTORE_DISTRETTO");
/*     */     
/* 179 */     resultMap.removeAppl("PROMOTORE_DISTRETTO");
/*     */     
/* 181 */     if (result.size() == 0) {
/*     */       
/* 183 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 185 */     else if (result.size() == 1) {
/*     */       
/* 187 */       resultMap.putAppl("RESULT", "FOUND");
/* 188 */       resultMap.putAppl("PROMOTORE_DISTRETTO", result.get(0));
/*     */     }
/* 190 */     else if (allowMultipleRow.booleanValue() == true) {
/*     */       
/* 192 */       resultMap.putAppl("RESULT", "FOUND");
/* 193 */       resultMap.putAppl("PROMOTORE_DISTRETTO", result);
/*     */     }
/*     */     else {
/*     */       
/* 197 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 199 */     return resultMap;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PromotoreDistrettoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */