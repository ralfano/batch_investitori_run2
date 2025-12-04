/*    */ package it.ras.arco.service;
/*    */ 
/*    */ import it.ras.arco.bean.FinRuolo;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import org.apache.commons.logging.Log;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsertRuoloSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String RUOLO_ROW = "RUOLO_ROW";
/*    */   public static final String ACTION_INSERT_RUOLO = "ACTION_INSERT_RUOLO";
/*    */   public static final String InsertRuoloMD = "InsertRuoloMD";
/*    */   public static final String InsertRuoloSRV = "InsertRuoloSRV";
/* 26 */   private String action = "ACTION";
/* 27 */   private Log log = LogFactory.getLog(RegoleInboundMovimentoSRV.class);
/*    */ 
/*    */   
/*    */   public String getAction() {
/* 31 */     return this.action;
/*    */   }
/*    */   
/*    */   public void setAction(String action) {
/* 35 */     this.action = action;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 49 */     MapContainer resultMap = new MapContainer();
/* 50 */     MapContainer paramMap = new MapContainer();
/* 51 */     FinRuolo ruolo = null;
/*    */     
/* 53 */     String moduleName = null;
/*    */     
/* 55 */     Object oRuolo = map.getAppl("RUOLO_ROW");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 61 */     if (this.action.equals("ACTION_INSERT_RUOLO")) {
/*    */       
/* 63 */       ruolo = (FinRuolo)getBean(oRuolo, FinRuolo.class);
/* 64 */       moduleName = "InsertRuoloMD";
/* 65 */       paramMap.putAppl("RUOLO_ROW", ruolo);
/* 66 */       getModuleManager().execModule(moduleName, paramMap);
/* 67 */       getModuleManager().execModule(moduleName, paramMap);
/* 68 */       resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/* 69 */       return resultMap;
/*    */     } 
/*    */ 
/*    */     
/* 73 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 74 */     if (this.log.isErrorEnabled()) {
/* 75 */       this.log.error(errorMessage);
/*    */     }
/* 77 */     throw new RasServiceException(errorMessage);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 85 */     if (obj == null) {
/* 86 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 87 */       if (this.log.isErrorEnabled()) {
/* 88 */         this.log.error(errorMessage);
/*    */       }
/* 90 */       throw new RasServiceException(errorMessage);
/*    */     } 
/*    */     
/* 93 */     return obj;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\InsertRuoloSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */