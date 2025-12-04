/*    */ package it.ras.arco.ordine.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.springframework.orm.hibernate3.HibernateObjectRetrievalFailureException;
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
/*    */ public class CaricaListaSchedeSoggettoService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String SOGGETTO = "SOGGETTO";
/*    */   public static final String RISULTATO_RICERCA_MAP_CONTAINER_KEY = "SOGGETTO_SCHEDA";
/*    */   public static final String MODULO_RICERCA_SCHEDE_BY_SOGGGETTO = "GetSchedeBySoggId";
/* 25 */   private Map moduleCatalog = new HashMap();
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 30 */     Integer soggetto_id = (Integer)map.getAppl("SOGGETTO");
/* 31 */     MapContainer resultMap = new MapContainer();
/*    */     
/* 33 */     if (soggetto_id != null) {
/* 34 */       MapContainer paramMap = new MapContainer();
/* 35 */       paramMap.putAppl("SOGGETTO", soggetto_id);
/*    */       
/*    */       try {
/* 38 */         resultMap = getModuleManager().execModule("GetSchedeBySoggId", paramMap);
/*    */       }
/* 40 */       catch (HibernateObjectRetrievalFailureException e) {
/*    */         
/* 42 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 43 */         rse.setStackTrace(e.getStackTrace());
/* 44 */         throw rse;
/*    */       } 
/*    */     } 
/*    */     
/* 48 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\service\CaricaListaSchedeSoggettoService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */