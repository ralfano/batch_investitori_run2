/*    */ package it.ras.arco.anagrafe.service;
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
/*    */ public class soggettoRicaricaLazySRV
/*    */   extends AbstractRasService
/*    */ {
/* 24 */   private String moduleName = "";
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 29 */     LogFactory.getLog(getClass()).debug("Anagrafe: Inizio servizio....");
/*    */     
/* 31 */     if (this.moduleName != null && !this.moduleName.equals("")) {
/*    */       
/* 33 */       LogFactory.getLog(getClass()).debug("MO: Questo implica l'esecuzione del modulo: '" + this.moduleName + "'. Esecuzione del modulo...");
/*    */ 
/*    */ 
/*    */       
/* 37 */       return getModuleManager().execModule(this.moduleName, map);
/*    */     } 
/*    */ 
/*    */     
/* 41 */     LogFactory.getLog(getClass()).error("Anagrafe: MODULO NON TROVATO!");
/*    */     
/* 43 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getModuleName() {
/* 53 */     return this.moduleName;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setModuleName(String moduleName) {
/* 59 */     this.moduleName = moduleName;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\service\soggettoRicaricaLazySRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */