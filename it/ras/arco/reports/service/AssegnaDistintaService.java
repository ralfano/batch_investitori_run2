/*    */ package it.ras.arco.reports.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
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
/*    */ public class AssegnaDistintaService
/*    */   extends AbstractRasService
/*    */ {
/* 22 */   private String moduleName = "";
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getModuleName() {
/* 28 */     return this.moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setModuleName(String moduleName) {
/* 34 */     this.moduleName = moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 40 */     LogFactory.getLog(getClass()).debug("Reports: Inizio servizio Assegan Distinte...");
/*    */     
/* 42 */     if (this.moduleName != null && !this.moduleName.equals("")) {
/*    */       
/* 44 */       LogFactory.getLog(getClass()).debug("Esecuzione del modulo : '" + this.moduleName);
/*    */ 
/*    */       
/* 47 */       return getModuleManager().execModule(this.moduleName, map);
/*    */     } 
/*    */ 
/*    */     
/* 51 */     LogFactory.getLog(getClass()).error("Reports: MODULO " + this.moduleName + " NON TROVATO!");
/* 52 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\reports\service\AssegnaDistintaService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */