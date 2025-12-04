/*    */ package it.ras.arco.common.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ 
/*    */ public class SingleModuleService
/*    */   extends AbstractRasService
/*    */ {
/* 10 */   private String moduleName = null;
/*    */ 
/*    */   
/*    */   public String getModuleName() {
/* 14 */     return this.moduleName;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setModuleName(String moduleName) {
/* 19 */     this.moduleName = moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 25 */     return getModuleManager().execModule(this.moduleName, map);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\service\SingleModuleService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */