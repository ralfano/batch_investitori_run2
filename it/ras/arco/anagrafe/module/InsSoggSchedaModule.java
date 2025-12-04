/*    */ package it.ras.arco.anagrafe.module;
/*    */ 
/*    */ import it.ras.arco.bean.FinSoggScheda;
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
/*    */ public class InsSoggSchedaModule
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/* 32 */     MapContainer resultSoggScheda = new MapContainer();
/*    */     
/* 34 */     FinSoggScheda soggScheda = (FinSoggScheda)inputMap.getAppl("SOGGSCHEDA");
/* 35 */     if (soggScheda == null) {
/* 36 */       resultSoggScheda.putAppl("RESULT", "NULL");
/* 37 */       return resultSoggScheda;
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 42 */     getDao().updateEntityWithEvict(soggScheda);
/* 43 */     resultSoggScheda.putAppl("RESULT", "INSERTED");
/* 44 */     return resultSoggScheda;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\module\InsSoggSchedaModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */