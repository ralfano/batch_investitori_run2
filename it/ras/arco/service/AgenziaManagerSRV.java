/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinAgenzia;
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
/*     */ public class AgenziaManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  18 */   private String action = "Azione nulla";
/*     */   
/*     */   public static final String GENERIC_MODULE_RESULT = "AGENZIA";
/*     */   
/*     */   public static final String AGENZIA = "AGENZIA";
/*     */   
/*     */   public static final String CODICE_AGENZIA = "CODICE_AGENZIA";
/*     */   
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   
/*     */   public static final String GET_AGENZIA_BY_CODICE = "GET_AGENZIA_BY_CODICE";
/*     */   
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  33 */   private Log log = LogFactory.getLog(AgenziaManagerSRV.class);
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
/*  44 */     MapContainer resultMap = new MapContainer();
/*  45 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  47 */     Object oAgenzia = map.getAppl("AGENZIA");
/*  48 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */     
/*  51 */     Boolean allowMultipleRows = null;
/*  52 */     String moduleName = null;
/*  53 */     FinAgenzia agenzia = null;
/*     */     
/*  55 */     if (oAllowMultipleRows == null) {
/*     */       
/*  57 */       oAllowMultipleRows = new Boolean(false);
/*     */     }
/*  59 */     else if (!(oAllowMultipleRows instanceof Boolean)) {
/*     */       
/*  61 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  62 */       if (this.log.isErrorEnabled())
/*     */       {
/*  64 */         this.log.error(str);
/*     */       }
/*  66 */       throw new RasServiceException(str);
/*     */     } 
/*     */     
/*  69 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */     
/*  72 */     if (this.action.equals("GET_AGENZIA_BY_CODICE")) {
/*     */       
/*  74 */       moduleName = "GetAgenziaByCodiceMD";
/*  75 */       agenzia = (FinAgenzia)getBean(oAgenzia, FinAgenzia.class.getName());
/*  76 */       String codAgenzia = agenzia.getCodAgenzia();
/*  77 */       paramMap.putAppl("CODICE_AGENZIA", codAgenzia);
/*     */ 
/*     */       
/*     */       try {
/*  81 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       }
/*  83 */       catch (HibernateObjectRetrievalFailureException e) {
/*     */         
/*  85 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  86 */         rse.setStackTrace(e.getStackTrace());
/*  87 */         throw rse;
/*     */       } 
/*     */       
/*  90 */       return processResultMap(resultMap, allowMultipleRows);
/*     */     } 
/*  92 */     if (getAction().equals("INSERT")) {
/*     */       
/*  94 */       moduleName = "InsertAgenziaMD";
/*  95 */       agenzia = (FinAgenzia)getBean(oAgenzia, FinAgenzia.class.getName());
/*  96 */       paramMap.putAppl("AGENZIA", agenzia);
/*  97 */       getModuleManager().execModule(moduleName, paramMap);
/*  98 */       resultMap = new MapContainer();
/*  99 */       resultMap.putAppl("RESULT", "INSERTED");
/*     */       
/* 101 */       return resultMap;
/*     */     } 
/* 103 */     if (getAction().equals("UPDATE")) {
/*     */       
/* 105 */       moduleName = "UpdateAgenziaMD";
/* 106 */       agenzia = (FinAgenzia)getBean(oAgenzia, FinAgenzia.class.getName());
/* 107 */       paramMap.putAppl("AGENZIA", agenzia);
/* 108 */       getModuleManager().execModule(moduleName, paramMap);
/* 109 */       resultMap = new MapContainer();
/* 110 */       resultMap.putAppl("RESULT", "UPDATED");
/*     */       
/* 112 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 116 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 117 */     if (this.log.isErrorEnabled())
/*     */     {
/* 119 */       this.log.error(errorMessage);
/*     */     }
/* 121 */     throw new RasServiceException(errorMessage);
/*     */   }
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
/*     */   private MapContainer processResultMap(MapContainer resultMap, Boolean allowMultipleRow) {
/* 160 */     ArrayList result = (ArrayList)resultMap.getAppl("AGENZIA");
/*     */     
/* 162 */     resultMap.removeAppl("AGENZIA");
/*     */     
/* 164 */     if (result.size() == 0) {
/*     */       
/* 166 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 168 */     else if (result.size() == 1) {
/*     */       
/* 170 */       resultMap.putAppl("RESULT", "FOUND");
/* 171 */       resultMap.putAppl("AGENZIA", result.get(0));
/*     */     }
/* 173 */     else if (allowMultipleRow.booleanValue() == true) {
/*     */       
/* 175 */       resultMap.putAppl("RESULT", "FOUND");
/* 176 */       resultMap.putAppl("AGENZIA", result);
/*     */     }
/*     */     else {
/*     */       
/* 180 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 182 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 191 */     return this.action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 201 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\AgenziaManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */