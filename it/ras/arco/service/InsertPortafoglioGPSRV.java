/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPortafoglioGP;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class InsertPortafoglioGPSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String PORTAFOGLIO_GP = "PORTAFOGLIO_GP";
/*  22 */   private String action = null;
/*  23 */   private Log log = LogFactory.getLog(InsertPortafoglioGPSRV.class);
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
/*  36 */     Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */     
/*  39 */     MapContainer param = new MapContainer();
/*  40 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  42 */     if (map.getAppl("PORTAFOGLIO_GP") == null) {
/*     */       
/*  44 */       resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  45 */       return resultMap;
/*     */     } 
/*     */     
/*  48 */     Object oPortafoglioGP = map.getAppl("PORTAFOGLIO_GP");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     FinPortafoglioGP portafoglio = (FinPortafoglioGP)getBean(oPortafoglioGP, FinPortafoglioGP.class);
/*     */ 
/*     */ 
/*     */     
/*  58 */     if (this.action.equals("ACTION_INSERT_PORTAFOGLIO_GP")) {
/*     */ 
/*     */       
/*  61 */       param.putAppl("PORTAFOGLIO_GP", portafoglio);
/*  62 */       getModuleManager().execModule("InserimentoPortafoglio", param);
/*  63 */       resultMap.putAppl("RESULT", "INSERTED");
/*  64 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/*  68 */     resultMap.putAppl("RESULT", "GENERIC ERROR");
/*  69 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/*  81 */     if (obj == null) {
/*     */       
/*  83 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/*     */       
/*  85 */       if (this.log.isErrorEnabled())
/*     */       {
/*  87 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/*  91 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/*  95 */     if (!obj.getClass().equals(c)) {
/*     */       
/*  97 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/*     */       
/*  99 */       if (this.log.isErrorEnabled())
/*     */       {
/* 101 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 105 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 109 */     return obj;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 114 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 118 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\InsertPortafoglioGPSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */