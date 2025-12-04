/*    */ package it.ras.arco.ordine.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.HashMap;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public class OrdineSearchService
/*    */   extends AbstractRasService
/*    */ {
/* 22 */   private Map moduleCatalog = new HashMap();
/*    */ 
/*    */   
/*    */   public static final String MODULO_DA_ESEGUIRE = "modulo";
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 29 */     String nomeModulo = (String)this.moduleCatalog.get(map.getAppl("modulo"));
/*    */     
/* 31 */     MapContainer out = getModuleManager().execModule(nomeModulo, map);
/*    */ 
/*    */     
/* 34 */     List results = (List)out.getAppl("RISULTATO_RICERCA");
/*    */     
/* 36 */     return out;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map getModuleCatalog() {
/* 44 */     return this.moduleCatalog;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setModuleCatalog(Map moduleCatalog) {
/* 50 */     this.moduleCatalog = moduleCatalog;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\service\OrdineSearchService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */