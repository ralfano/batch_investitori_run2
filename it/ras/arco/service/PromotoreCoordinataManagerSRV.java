/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPromotoreCoordinata;
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
/*     */ public class PromotoreCoordinataManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String PROMOTORE_COORDINATA = "PROMOTORE_COORDINATA";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GENERIC_MODULE_RESULT = "PROMOTORE_COORDINATA";
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String GET = "GET";
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  28 */   private Log log = LogFactory.getLog(PromotoreCoordinataManagerSRV.class);
/*  29 */   private String action = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  42 */     MapContainer resultMap = new MapContainer();
/*  43 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  45 */     Object oPromotoreCoordinata = map.getAppl("PROMOTORE_COORDINATA");
/*  46 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  48 */     Boolean allowMultipleRows = null;
/*  49 */     String moduleName = null;
/*  50 */     FinPromotoreCoordinata promotoreCoordinata = null;
/*     */ 
/*     */     
/*  53 */     if (oAllowMultipleRows == null) {
/*  54 */       oAllowMultipleRows = new Boolean(false);
/*  55 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  56 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  57 */       if (this.log.isErrorEnabled()) {
/*  58 */         this.log.error(errorMessage);
/*     */       }
/*  60 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*  62 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  64 */     promotoreCoordinata = (FinPromotoreCoordinata)getBean(oPromotoreCoordinata, FinPromotoreCoordinata.class.getName());
/*  65 */     paramMap.putAppl("PROMOTORE_COORDINATA", promotoreCoordinata);
/*     */     
/*  67 */     if (this.action.equals("GET")) {
/*  68 */       moduleName = "GetPromotoreCoordinataMD";
/*     */     
/*     */     }
/*  71 */     else if (this.action.equals("INSERT")) {
/*  72 */       moduleName = "InsertPromotoreCoordinataMD";
/*     */     
/*     */     }
/*  75 */     else if (this.action.equals("UPDATE")) {
/*  76 */       moduleName = "UpdatePromotoreCoordinataMD";
/*     */     }
/*     */     else {
/*     */       
/*  80 */       String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*  81 */       if (this.log.isErrorEnabled()) {
/*  82 */         this.log.error(errorMessage);
/*     */       }
/*  84 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/*     */     try {
/*  88 */       getModuleManager().execModule(moduleName, paramMap);
/*  89 */     } catch (HibernateObjectRetrievalFailureException e) {
/*  90 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  91 */       rse.setStackTrace(e.getStackTrace());
/*  92 */       throw rse;
/*     */     } 
/*     */     
/*  95 */     return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 101 */     if (this.action.equals("GET")) {
/*     */       
/* 103 */       ArrayList result = (ArrayList)resultMap.getAppl("PROMOTORE_COORDINATA");
/* 104 */       resultMap.removeAppl("PROMOTORE_COORDINATA");
/*     */       
/* 106 */       if (result.size() == 0) {
/* 107 */         resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */       
/*     */       }
/* 110 */       else if (result.size() == 1) {
/* 111 */         resultMap.putAppl("RESULT", "FOUND");
/* 112 */         resultMap.putAppl("PROMOTORE_COORDINATA", result.get(0));
/*     */       
/*     */       }
/* 115 */       else if (allowMultipleRow) {
/* 116 */         resultMap.putAppl("RESULT", "FOUND");
/* 117 */         resultMap.putAppl("PROMOTORE_COORDINATA", result);
/*     */       }
/*     */       else {
/*     */         
/* 121 */         resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */       } 
/*     */       
/* 124 */       return resultMap;
/*     */     } 
/*     */     
/* 127 */     if (this.action.equals("INSERT")) {
/* 128 */       resultMap.putAppl("RESULT", "INSERTED");
/* 129 */       return resultMap;
/*     */     } 
/*     */     
/* 132 */     if (this.action.equals("UPDATE")) {
/* 133 */       resultMap.putAppl("RESULT", "UPDATED");
/* 134 */       return resultMap;
/*     */     } 
/*     */     
/* 137 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 142 */     Object retObject = null;
/*     */     try {
/* 144 */       Class c = Class.forName(className);
/* 145 */       if (!c.isInstance(obj)) {
/* 146 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 147 */         if (this.log.isErrorEnabled()) {
/* 148 */           this.log.error(errorMessage);
/*     */         }
/* 150 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 152 */       retObject = obj;
/* 153 */     } catch (ClassNotFoundException e) {
/* 154 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 155 */       if (this.log.isErrorEnabled()) {
/* 156 */         this.log.error(errorMessage);
/*     */       }
/* 158 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 160 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 164 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 168 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PromotoreCoordinataManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */