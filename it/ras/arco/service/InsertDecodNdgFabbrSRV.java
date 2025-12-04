/*    */ package it.ras.arco.service;
/*    */ 
/*    */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.ArrayList;
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
/*    */ public class InsertDecodNdgFabbrSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String CODICE_ESTERNOFABBR = "DECODNDGFABBR";
/*    */   public static final String CODICE_ESTERNO = "CODICE_ESTERNO";
/*    */   public static final String FABBRICA = "FABBRICA";
/*    */   public static final String GENERIC_MODULE_RESULT = "SOGGETTO";
/*    */   public static final String MODULE_NAME = "GetSoggettoByCodiceEsterno_Fabbrica";
/*    */   
/*    */   public MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 34 */     MapContainer param = new MapContainer();
/* 35 */     MapContainer resultMap = null;
/* 36 */     FinDecodNdgFabbr decodNdgFabbr = null;
/*    */     
/* 38 */     decodNdgFabbr = (FinDecodNdgFabbr)map.getAppl("DECODNDGFABBR");
/* 39 */     param.putAppl("CODICE_ESTERNO", decodNdgFabbr.getNdgFab());
/* 40 */     param.putAppl("FABBRICA", decodNdgFabbr.getFabbrica());
/* 41 */     resultMap = getModuleManager().execModule("GetSoggettoByCodiceEsterno_Fabbrica", param);
/* 42 */     ArrayList result = (ArrayList)resultMap.getAppl("SOGGETTO");
/* 43 */     if (result.size() != 0) {
/* 44 */       resultMap.putAppl("RESULT", "WARNING");
/* 45 */       return resultMap;
/*    */     } 
/* 47 */     resultMap = getModuleManager().execModule("InsertDecodNdgFabbrMD", map);
/* 48 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\InsertDecodNdgFabbrSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */