/*    */ package it.ras.arco.batch.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.List;
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
/*    */ public class UpdateFlxCointestazioneSRV
/*    */   extends AbstractRasService
/*    */ {
/* 26 */   Log logger = LogFactory.getLog(getClass());
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
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 41 */     MapContainer resultMap = new MapContainer();
/* 42 */     if (map == null) {
/* 43 */       resultMap.putAppl("RESULT_MESSAGE", "NULL_PARAM");
/*    */       
/* 45 */       return resultMap;
/*    */     } 
/* 47 */     List brokenKeyCursorUpd = (List)map.getAppl("LISTA");
/*    */ 
/*    */ 
/*    */     
/* 51 */     MapContainer Inputparam = new MapContainer();
/* 52 */     Inputparam.putAppl("LISTA", brokenKeyCursorUpd);
/* 53 */     resultMap = getModuleManager().execModule("UpdateFlxCointestazioneMD", Inputparam);
/*    */     
/* 55 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\UpdateFlxCointestazioneSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */