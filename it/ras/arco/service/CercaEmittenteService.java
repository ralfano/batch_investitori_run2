/*    */ package it.ras.arco.service;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CercaEmittenteService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String EMITTENTE_ID_MAP_CONTAINER_KEY = "TIPO_EMITTENTE";
/*    */   public static final String RISULTATO_RICERCA_MAP_CONTAINER_KEY = "RISULTATO_RICERCA";
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 36 */     LogFactory.getLog(getClass()).debug("PR-DP: Inizio servizio....");
/*    */     
/* 38 */     String nomeModulo = "cercaProdottoMD";
/*    */     
/* 40 */     return getModuleManager().execModule(nomeModulo, map);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\CercaEmittenteService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */