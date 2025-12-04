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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CaricaSchedaSoggettoService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String SOGGETTO = "SOGGETTO";
/*    */   public static final String PROMOTORE = "PROMOTORE";
/*    */   public static final String RISULTATO_RICERCA_MAP_CONTAINER_KEY = "SOGGETTO_SCHEDA";
/*    */   public static final String MODULO_RICERCA_SCHEDA_BY_SOGGGETTO_E_PROMOTORE = "GetSchedaBySoggIdPromotIdMD";
/* 35 */   private Map moduleCatalog = new HashMap();
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 40 */     Integer soggetto_id = (Integer)map.getAppl("SOGGETTO");
/* 41 */     Integer promotore_id = (Integer)map.getAppl("PROMOTORE");
/* 42 */     MapContainer resultMap = new MapContainer();
/*    */     
/* 44 */     if (soggetto_id != null && promotore_id != null) {
/* 45 */       MapContainer paramMap = new MapContainer();
/* 46 */       paramMap.putAppl("SOGGETTO", soggetto_id);
/* 47 */       paramMap.putAppl("PROMOTORE", promotore_id);
/*    */       
/*    */       try {
/* 50 */         resultMap = getModuleManager().execModule("GetSchedaBySoggIdPromotIdMD", paramMap);
/*    */       }
/* 52 */       catch (HibernateObjectRetrievalFailureException e) {
/*    */         
/* 54 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 55 */         rse.setStackTrace(e.getStackTrace());
/* 56 */         throw rse;
/*    */       } 
/*    */     } 
/*    */     
/* 60 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\service\CaricaSchedaSoggettoService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */