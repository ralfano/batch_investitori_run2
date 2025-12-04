/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPromotoreStruttura;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
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
/*     */ public class PromotoreStrutturaManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String PROMOTORE_STRUTTURA = "PROMOTORE_STRUTTURA";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  24 */   private Log log = LogFactory.getLog(PromotoreStrutturaManagerSRV.class);
/*  25 */   private String action = null;
/*     */ 
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
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  40 */     MapContainer resultMap = new MapContainer();
/*  41 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  43 */     Object oPromotoreStruttura = map.getAppl("PROMOTORE_STRUTTURA");
/*  44 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  46 */     Boolean allowMultipleRows = null;
/*  47 */     String moduleName = null;
/*  48 */     FinPromotoreStruttura promotoreStruttura = null;
/*     */ 
/*     */     
/*  51 */     if (oAllowMultipleRows == null) {
/*  52 */       oAllowMultipleRows = new Boolean(false);
/*  53 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  54 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  55 */       if (this.log.isErrorEnabled()) {
/*  56 */         this.log.error(str);
/*     */       }
/*  58 */       throw new RasServiceException(str);
/*     */     } 
/*  60 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  62 */     if (this.action.equals("INSERT")) {
/*     */       
/*  64 */       promotoreStruttura = (FinPromotoreStruttura)getBean(oPromotoreStruttura, FinPromotoreStruttura.class.getName());
/*  65 */       moduleName = "InsertPromotoreStrutturaMD";
/*     */       
/*  67 */       paramMap.putAppl("PROMOTORE_STRUTTURA", promotoreStruttura);
/*     */       try {
/*  69 */         getModuleManager().execModule(moduleName, paramMap);
/*  70 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  71 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  72 */         rse.setStackTrace(e.getStackTrace());
/*  73 */         throw rse;
/*     */       } 
/*  75 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */     
/*  79 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*  80 */     if (this.log.isErrorEnabled()) {
/*  81 */       this.log.error(errorMessage);
/*     */     }
/*  83 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/*  89 */     if (this.action.equals("INSERT")) {
/*  90 */       resultMap.putAppl("RESULT", "INSERTED");
/*  91 */       return resultMap;
/*     */     } 
/*     */     
/*  94 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/*  99 */     Object retObject = null;
/*     */     try {
/* 101 */       Class c = Class.forName(className);
/* 102 */       if (!c.isInstance(obj)) {
/* 103 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 104 */         if (this.log.isErrorEnabled()) {
/* 105 */           this.log.error(errorMessage);
/*     */         }
/* 107 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 109 */       retObject = obj;
/* 110 */     } catch (ClassNotFoundException e) {
/* 111 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 112 */       if (this.log.isErrorEnabled()) {
/* 113 */         this.log.error(errorMessage);
/*     */       }
/* 115 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 117 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 121 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 125 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PromotoreStrutturaManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */