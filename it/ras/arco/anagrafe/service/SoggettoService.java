/*    */ package it.ras.arco.anagrafe.service;
/*    */ 
/*    */ import it.ras.arco.common.bean.DescrittoreRicerca;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
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
/*    */ public class SoggettoService
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
/* 42 */   private Map moduleCatalog = new HashMap();
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 47 */     LogFactory.getLog(getClass()).debug("Anagrafe: Inizio servizio....");
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 52 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)map.getAppl("DESCRITTORE_RICERCA");
/*    */ 
/*    */     
/* 55 */     LogFactory.getLog(getClass()).debug("MO: E' stata richiesta una ricerca con nome: '" + this.moduleName + "'");
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 64 */     if (this.moduleName != null && !this.moduleName.equals("")) {
/*    */       
/* 66 */       LogFactory.getLog(getClass()).debug("CP: Questo implica l'esecuzione del modulo: '" + this.moduleName + "'. Esecuzione del modulo...");
/*    */ 
/*    */ 
/*    */       
/* 70 */       return getModuleManager().execModule(this.moduleName, map);
/*    */     } 
/*    */ 
/*    */     
/* 74 */     LogFactory.getLog(getClass()).error("Anagrafe: MODULO NON TROVATO!");
/*    */     
/* 76 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map getModuleCatalog() {
/* 86 */     return this.moduleCatalog;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setModuleCatalog(Map moduleCatalog) {
/* 92 */     this.moduleCatalog = moduleCatalog;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\service\SoggettoService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */