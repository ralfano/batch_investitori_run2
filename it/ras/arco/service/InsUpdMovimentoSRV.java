/*    */ package it.ras.arco.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsUpdMovimentoSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 21 */     MapContainer resultMap = new MapContainer();
/* 22 */     MapContainer param = new MapContainer();
/*    */     
/* 24 */     param.putAppl("ROW_FIN_MOVIMENTO", map.getAppl("ROW_FIN_MOVIMENTO"));
/* 25 */     param.putAppl("ACTION", map.getAppl("ACTION"));
/*    */     
/* 27 */     resultMap = getModuleManager().execModule("InsUpdMovimentoMD", param);
/*    */     
/* 29 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\InsUpdMovimentoSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */