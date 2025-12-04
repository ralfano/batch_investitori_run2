/*    */ package it.ras.arco.common.service;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RicercaService
/*    */   extends AbstractRasService
/*    */ {
/* 28 */   private String moduleName = "";
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getModuleName() {
/* 34 */     return this.moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setModuleName(String moduleName) {
/* 40 */     this.moduleName = moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 47 */     LogFactory.getLog(getClass()).debug("MO: Inizio servizio....");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 56 */     if (this.moduleName != null && !this.moduleName.equals("")) {
/*    */       
/* 58 */       LogFactory.getLog(getClass()).debug("MO: Si sta per eseguire il modulo: '" + this.moduleName + "'. Esecuzione del modulo...");
/*    */ 
/*    */ 
/*    */       
/* 62 */       return getModuleManager().execModule(this.moduleName, map);
/*    */     } 
/*    */ 
/*    */     
/* 66 */     LogFactory.getLog(getClass()).error("MO: MODULO NON TROVATO!");
/*    */     
/* 68 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\service\RicercaService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */