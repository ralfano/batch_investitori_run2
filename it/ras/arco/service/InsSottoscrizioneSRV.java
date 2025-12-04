/*    */ package it.ras.arco.service;
/*    */ 
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsSottoscrizioneSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 17 */     FinSottoscrizione sottoscrizione = (FinSottoscrizione)map.getAppl("SOTTOSCRIZIONE");
/* 18 */     MapContainer result = new MapContainer();
/* 19 */     MapContainer param = new MapContainer();
/*    */     
/* 21 */     param.putAppl("SOTTOSCRIZIONE", sottoscrizione);
/* 22 */     param.putAppl("ACTION", "INSERT");
/*    */     
/* 24 */     result = getModuleManager().execModule("InsertSottoscrizioneMD", param);
/* 25 */     String resultMsg = (String)result.getAppl("RESULT");
/*    */     
/* 27 */     if (!resultMsg.equals("INSERTED")) {
/* 28 */       result.putAppl("RESULT", result);
/* 29 */       return result;
/*    */     } 
/*    */     
/* 32 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\InsSottoscrizioneSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */