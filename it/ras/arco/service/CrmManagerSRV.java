/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinCrm1;
/*     */ import it.ras.arco.bean.FinCrm2;
/*     */ import it.ras.arco.bean.FinCrm3;
/*     */ import it.ras.arco.bean.FinCrm4;
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
/*     */ 
/*     */ public class CrmManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String CRM1 = "CRM1";
/*     */   public static final String CRM2 = "CRM2";
/*     */   public static final String CRM3 = "CRM3";
/*     */   public static final String CRM4 = "CRM4";
/*     */   public static final String INSERT_CRM1 = "INSERT_CRM1";
/*     */   public static final String INSERT_CRM2 = "INSERT_CRM2";
/*     */   public static final String INSERT_CRM3 = "INSERT_CRM3";
/*     */   public static final String INSERT_CRM4 = "INSERT_CRM4";
/*     */   public static final String INSERTED = "INSERTED";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  34 */   private Log log = LogFactory.getLog(CrmManagerSRV.class);
/*  35 */   private String action = null;
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
/*  48 */     MapContainer resultMap = new MapContainer();
/*  49 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  51 */     Object oCrm1 = map.getAppl("CRM1");
/*  52 */     Object oCrm2 = map.getAppl("CRM2");
/*  53 */     Object oCrm3 = map.getAppl("CRM3");
/*  54 */     Object oCrm4 = map.getAppl("CRM4");
/*     */     
/*  56 */     String moduleName = null;
/*  57 */     FinCrm1 crm1 = null;
/*  58 */     FinCrm2 crm2 = null;
/*  59 */     FinCrm3 crm3 = null;
/*  60 */     FinCrm4 crm4 = null;
/*     */ 
/*     */     
/*  63 */     if (this.action.equals("INSERT_CRM1")) {
/*     */       
/*  65 */       crm1 = (FinCrm1)getBean(oCrm1, FinCrm1.class.getName());
/*  66 */       moduleName = "InsertCrm1MD";
/*     */       
/*  68 */       paramMap.putAppl("CRM1", crm1);
/*     */       try {
/*  70 */         getModuleManager().execModule(moduleName, paramMap);
/*  71 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  72 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  73 */         rse.setStackTrace(e.getStackTrace());
/*  74 */         throw rse;
/*     */       }
/*     */     
/*     */     }
/*  78 */     else if (this.action.equals("INSERT_CRM2")) {
/*     */       
/*  80 */       crm2 = (FinCrm2)getBean(oCrm2, FinCrm2.class.getName());
/*  81 */       moduleName = "InsertCrm2MD";
/*     */       
/*  83 */       paramMap.putAppl("CRM2", crm2);
/*     */       try {
/*  85 */         getModuleManager().execModule(moduleName, paramMap);
/*  86 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  87 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  88 */         rse.setStackTrace(e.getStackTrace());
/*  89 */         throw rse;
/*     */       }
/*     */     
/*     */     }
/*  93 */     else if (this.action.equals("INSERT_CRM3")) {
/*     */       
/*  95 */       crm3 = (FinCrm3)getBean(oCrm3, FinCrm3.class.getName());
/*  96 */       moduleName = "InsertCrm3MD";
/*     */       
/*  98 */       paramMap.putAppl("CRM3", crm3);
/*     */       try {
/* 100 */         getModuleManager().execModule(moduleName, paramMap);
/* 101 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 102 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 103 */         rse.setStackTrace(e.getStackTrace());
/* 104 */         throw rse;
/*     */       }
/*     */     
/*     */     }
/* 108 */     else if (this.action.equals("INSERT_CRM4")) {
/*     */       
/* 110 */       crm4 = (FinCrm4)getBean(oCrm4, FinCrm4.class.getName());
/* 111 */       moduleName = "InsertCrm4MD";
/*     */       
/* 113 */       paramMap.putAppl("CRM4", crm4);
/*     */       try {
/* 115 */         getModuleManager().execModule(moduleName, paramMap);
/* 116 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 117 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 118 */         rse.setStackTrace(e.getStackTrace());
/* 119 */         throw rse;
/*     */       } 
/*     */     } 
/*     */     
/* 123 */     resultMap.putAppl("RESULT", "INSERTED");
/* 124 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 132 */     Object retObject = null;
/*     */     try {
/* 134 */       Class c = Class.forName(className);
/* 135 */       if (!c.isInstance(obj)) {
/* 136 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 137 */         if (this.log.isErrorEnabled()) {
/* 138 */           this.log.error(errorMessage);
/*     */         }
/* 140 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 142 */       retObject = obj;
/* 143 */     } catch (ClassNotFoundException e) {
/* 144 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 145 */       if (this.log.isErrorEnabled()) {
/* 146 */         this.log.error(errorMessage);
/*     */       }
/* 148 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 150 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 154 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 158 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\CrmManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */