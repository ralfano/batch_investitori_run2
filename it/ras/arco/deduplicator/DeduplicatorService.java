/*    */ package it.ras.arco.deduplicator;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DeduplicatorService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 22 */     String moduleName = (String)map.getAppl("MODULE_NAME");
/* 23 */     return getModuleManager().execModule(moduleName, map);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\deduplicator\DeduplicatorService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */