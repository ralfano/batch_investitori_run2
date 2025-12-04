/*    */ package it.ras.arco.batch.service;
/*    */ 
/*    */ import it.ras.arco.service.RegoleInboundMovimentoSRV;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.ArrayList;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsertDispPagamentoSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String DISPPAGLIST = "DISPPAGLIST";
/*    */   public static final String ACTION_INSERT_DISP_PAG = "ACTION_INSERT_DISP_PAG";
/*    */   public static final String NOME_MODULO = "InsertDispPagamentoMD";
/*    */   public static final String NOME_SERVIZIO = "InsertDispPagamentoSRV";
/* 33 */   private String action = "ACTION";
/* 34 */   private Log log = LogFactory.getLog(RegoleInboundMovimentoSRV.class);
/*    */ 
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
/* 48 */     MapContainer resultMap = new MapContainer();
/* 49 */     MapContainer paramMap = new MapContainer();
/*    */     
/* 51 */     String moduleName = null;
/*    */ 
/*    */     
/* 54 */     ArrayList dispPagList = (ArrayList)map.getAppl("DISPPAGLIST");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 60 */     if (this.action.equals("ACTION_INSERT_DISP_PAG")) {
/*    */       
/* 62 */       moduleName = "InsertDispPagamentoMD";
/* 63 */       paramMap.putAppl("DISPPAGLIST", dispPagList);
/* 64 */       getModuleManager().execModule(moduleName, paramMap);
/* 65 */       resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/* 66 */       return resultMap;
/*    */     } 
/*    */ 
/*    */     
/* 70 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 71 */     if (this.log.isErrorEnabled()) {
/* 72 */       this.log.error(errorMessage);
/*    */     }
/* 74 */     throw new RasServiceException(errorMessage);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getAction() {
/* 85 */     return this.action;
/*    */   }
/*    */   
/*    */   public void setAction(String action) {
/* 89 */     this.action = action;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\InsertDispPagamentoSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */