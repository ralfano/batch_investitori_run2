/*    */ package it.ras.arco.common.service;
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
/*    */ public class SingleModuleGenericService
/*    */   extends AbstractRasService
/*    */ {
/* 17 */   private String loaderModule = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getLoaderModule() {
/* 25 */     return this.loaderModule;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLoaderModule(String loaderModule) {
/* 34 */     this.loaderModule = loaderModule;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer mc) throws RasServiceException {
/* 44 */     return getModuleManager().execModule(getLoaderModule(), mc);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\service\SingleModuleGenericService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */