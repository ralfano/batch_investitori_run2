/*    */ package it.ras.arco.contratto.service;
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
/*    */ public class CaricaAltroProdottoService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String ALTROPRODOTTO_ID = "ALTROPRODOTTO_ID";
/*    */   public static final String RISULTATO_RICERCA_MAP_CONTAINER_KEY = "ALTROPRODOTTO";
/*    */   public static final String MODULO_ALTRO_PRODOTTO = "GetAltroProdottoByAltroProdottoIdMD";
/* 25 */   private Map moduleCatalog = new HashMap();
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 30 */     Integer altroProdotto_id = (Integer)map.getAppl("ALTROPRODOTTO_ID");
/*    */     
/* 32 */     MapContainer resultMap = new MapContainer();
/*    */     
/* 34 */     if (altroProdotto_id != null) {
/* 35 */       MapContainer paramMap = new MapContainer();
/* 36 */       paramMap.putAppl("ALTROPRODOTTO_ID", altroProdotto_id);
/*    */ 
/*    */       
/*    */       try {
/* 40 */         resultMap = getModuleManager().execModule("GetAltroProdottoByAltroProdottoIdMD", paramMap);
/*    */       }
/* 42 */       catch (HibernateObjectRetrievalFailureException e) {
/*    */         
/* 44 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 45 */         rse.setStackTrace(e.getStackTrace());
/* 46 */         throw rse;
/*    */       } 
/*    */     } 
/*    */     
/* 50 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\contratto\service\CaricaAltroProdottoService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */