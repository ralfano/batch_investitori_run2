/*    */ package it.ras.arco.module;
/*    */ 
/*    */ import it.ras.arco.bean.FinRuolo;
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
/*    */ public class InsertRuoloMD
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */   
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/* 22 */     MapContainer resultRuolo = new MapContainer();
/*    */     
/* 24 */     FinRuolo ruolo = (FinRuolo)inputMap.getAppl("RUOLO");
/* 25 */     if (ruolo == null) {
/* 26 */       resultRuolo.putAppl("RESULT", "NULL");
/* 27 */       return resultRuolo;
/*    */     } 
/*    */ 
/*    */     
/* 31 */     getDao().insertSingleEntity(ruolo);
/* 32 */     resultRuolo.putAppl("RESULT", "INSERTED");
/*    */     
/* 34 */     return resultRuolo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\module\InsertRuoloMD.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */