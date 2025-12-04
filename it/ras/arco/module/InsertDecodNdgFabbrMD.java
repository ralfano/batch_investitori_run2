/*    */ package it.ras.arco.module;
/*    */ 
/*    */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*    */ import it.ras.flag.ArchUtils;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.module.AbstractRasDbModule;
/*    */ import it.ras.flag.util.MapContainer;
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
/*    */ public class InsertDecodNdgFabbrMD
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/* 33 */     MapContainer map = null;
/* 34 */     MapContainer resultMap = new MapContainer();
/*    */     
/* 36 */     FinDecodNdgFabbr decodNdgFabbr = (FinDecodNdgFabbr)inputMap.getAppl("DECODNDGFABBR");
/* 37 */     if (decodNdgFabbr == null) {
/* 38 */       resultMap.putAppl("RESULT_MESSAGE", "NULL");
/* 39 */       return resultMap;
/*    */     } 
/*    */     try {
/* 42 */       ArchUtils.setStdFields(decodNdgFabbr, "I", "Inserimento DecodNdgFabbr");
/* 43 */     } catch (Exception e) {
/* 44 */       e.getMessage();
/* 45 */       resultMap.putAppl("RESULT_MESSAGE", "GENERIC ERROR");
/* 46 */       return resultMap;
/*    */     } 
/*    */     
/* 49 */     getDao().insertSingleEntity(decodNdgFabbr);
/*    */     
/* 51 */     resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/* 52 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\module\InsertDecodNdgFabbrMD.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */