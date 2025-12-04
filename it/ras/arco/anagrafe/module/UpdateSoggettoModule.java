/*    */ package it.ras.arco.anagrafe.module;
/*    */ 
/*    */ import it.ras.arco.bean.FinSoggetto;
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
/*    */ public class UpdateSoggettoModule
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   private boolean andInWherePresent = false;
/*    */   
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/* 31 */     MapContainer resultSoggetto = new MapContainer();
/*    */     
/* 33 */     FinSoggetto soggetto = (FinSoggetto)inputMap.getAppl("SOGGETTO");
/* 34 */     if (soggetto == null) {
/* 35 */       resultSoggetto.putAppl("RESULT", "NULL");
/* 36 */       return resultSoggetto;
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 41 */     getDao().updateEntityWithEvict(soggetto);
/* 42 */     resultSoggetto.putAppl("RESULT", "NULL");
/* 43 */     return resultSoggetto;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\module\UpdateSoggettoModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */