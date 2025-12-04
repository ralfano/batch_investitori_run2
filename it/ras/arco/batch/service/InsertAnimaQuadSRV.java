/*    */ package it.ras.arco.batch.service;
/*    */ 
/*    */ import it.ras.arco.batch.bean.QuadAnimaSaldi;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsertAnimaQuadSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer inputMap) throws RasServiceException {
/* 29 */     QuadAnimaSaldi quadAnimaSaldi = (QuadAnimaSaldi)inputMap.getAppl("ANIMAQUAD");
/* 30 */     MapContainer resultMap = new MapContainer();
/* 31 */     MapContainer param = new MapContainer();
/*    */     
/* 33 */     param.putAppl("ANIMAQUAD", quadAnimaSaldi);
/* 34 */     getModuleManager().execModule("InsertAnimaQuadMD", param);
/* 35 */     resultMap.putAppl("RESULT", "INSERTED");
/* 36 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\InsertAnimaQuadSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */