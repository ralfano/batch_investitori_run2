/*    */ package it.ras.arco.ordine.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.DefaultLoadEntityModuleService;
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
/*    */ public class IndirizzoSoggettoContrattoSrv
/*    */   extends DefaultLoadEntityModuleService
/*    */ {
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 22 */     MapContainer out = getModuleManager().execModule("addObjectModule", map);
/* 23 */     return out;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\service\IndirizzoSoggettoContrattoSrv.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */