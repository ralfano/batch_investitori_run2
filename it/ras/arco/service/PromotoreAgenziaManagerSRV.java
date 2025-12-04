/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPromotoreAgenzia;
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
/*     */ public class PromotoreAgenziaManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String GENERIC_MODULE_RESULT = "PROMOTORE_AGENZIA";
/*     */   public static final String PROMOTORE_AGENZIA = "PROMOTORE_AGENZIA";
/*     */   public static final String PROMOTORE_AGENZIA_LIST = "PROMOTORE_AGENZIA_LIST";
/*     */   public static final String CODICE_PROMOTORE = "CODICE_PROMOTORE";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GET_ALL_BY_PROMOTORE = "GET_ALL_BY_PROMOTORE_CP";
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  31 */   private Log log = LogFactory.getLog(PromotoreAgenziaManagerSRV.class);
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
/*  46 */     Object oPromotoreAgenzia = map.getAppl("PROMOTORE_AGENZIA");
/*  47 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */     
/*  50 */     Boolean allowMultipleRows = null;
/*  51 */     String moduleName = null;
/*  52 */     FinPromotoreAgenzia promotoreAgenzia = null;
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
/*  74 */       promotoreAgenzia = (FinPromotoreAgenzia)getBean(oPromotoreAgenzia, FinPromotoreAgenzia.class.getName());
/*  75 */       paramMap.putAppl("CODICE_PROMOTORE", promotoreAgenzia.getPromotore().getPromotoreId());
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
/*  91 */       moduleName = "InsertPromotoreAgenziaMD";
/*  92 */       promotoreAgenzia = (FinPromotoreAgenzia)getBean(oPromotoreAgenzia, FinPromotoreAgenzia.class.getName());
/*  93 */       paramMap.putAppl("PROMOTORE_AGENZIA", promotoreAgenzia);
/*     */       
/*  95 */       getModuleManager().execModule(moduleName, paramMap);
/*  96 */       resultMap = new MapContainer();
/*  97 */       resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/*     */       
/*  99 */       return resultMap;
/*     */     } 
/* 101 */     if (getAction().equals("UPDATE")) {
/*     */       
/* 103 */       moduleName = "UpdatePromotoreAgenziaMD";
/* 104 */       promotoreAgenzia = (FinPromotoreAgenzia)getBean(oPromotoreAgenzia, FinPromotoreAgenzia.class.getName());
/* 105 */       paramMap.putAppl("PROMOTORE_AGENZIA", promotoreAgenzia);
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
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 129 */     Object retObject = null;
/*     */     
/*     */     try {
/* 132 */       Class c = Class.forName(className);
/* 133 */       if (!c.isInstance(obj)) {
/*     */         
/* 135 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/*     */         
/* 137 */         if (this.log.isErrorEnabled())
/*     */         {
/* 139 */           this.log.error(errorMessage);
/*     */         }
/* 141 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 143 */       retObject = obj;
/*     */     }
/* 145 */     catch (ClassNotFoundException e) {
/*     */       
/* 147 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/*     */       
/* 149 */       if (this.log.isErrorEnabled())
/*     */       {
/* 151 */         this.log.error(errorMessage);
/*     */       }
/* 153 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 155 */     return retObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, Boolean allowMultipleRow) {
/* 162 */     ArrayList result = (ArrayList)resultMap.getAppl("PROMOTORE_AGENZIA");
/*     */     
/* 164 */     resultMap.removeAppl("PROMOTORE_AGENZIA");
/*     */     
/* 166 */     if (result.size() == 0) {
/*     */       
/* 168 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 170 */     else if (result.size() == 1) {
/*     */       
/* 172 */       resultMap.putAppl("RESULT", "FOUND");
/* 173 */       resultMap.putAppl("PROMOTORE_AGENZIA", result.get(0));
/*     */     }
/* 175 */     else if (allowMultipleRow.booleanValue() == true) {
/*     */       
/* 177 */       resultMap.putAppl("RESULT", "FOUND");
/* 178 */       resultMap.putAppl("PROMOTORE_AGENZIA", result);
/*     */     }
/*     */     else {
/*     */       
/* 182 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 184 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 193 */     return this.action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 203 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PromotoreAgenziaManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */