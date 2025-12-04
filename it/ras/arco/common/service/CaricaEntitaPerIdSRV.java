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
/*    */ public class CaricaEntitaPerIdSRV
/*    */   extends AbstractRasService
/*    */ {
/* 17 */   private String loaderModule = null;
/*    */ 
/*    */   
/*    */   public static final String CLASSE_ENTITA_DA_CARICARE = "CLASSE_ENTITA_DA_CARICARE";
/*    */ 
/*    */   
/*    */   public static final String ID_ENTITA_DA_CARICARE = "ID_ENTITA_DA_CARICARE";
/*    */   
/*    */   public static final String ENTITA_CARICATA = "ENTITA_CARICATA";
/*    */   
/*    */   public static final String BEAN_DA_AGGIORNARE = "BEAN_DA_AGGIORNARE";
/*    */ 
/*    */   
/*    */   public String getLoaderModule() {
/* 31 */     return this.loaderModule;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setLoaderModule(String loaderModule) {
/* 40 */     this.loaderModule = loaderModule;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer mc) throws RasServiceException {
/* 50 */     return getModuleManager().execModule(getLoaderModule(), mc);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\service\CaricaEntitaPerIdSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */