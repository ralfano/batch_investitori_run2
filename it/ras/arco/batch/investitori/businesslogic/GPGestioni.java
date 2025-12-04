/*    */ package it.ras.arco.batch.investitori.businesslogic;
/*    */ 
/*    */ import it.ras.flag.batch.skeleton.BusinessLogicObject;
/*    */ import it.ras.flag.batch.utils.FileRecord;
/*    */ import it.ras.flag.config.CodesTableManager;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.io.IOException;
/*    */ import java.sql.SQLException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GPGestioni
/*    */   extends BusinessLogicObject
/*    */ {
/*    */   private CodesTableManager codesTableManager;
/*    */   
/*    */   public synchronized void doOneStep(Object row) throws RasServiceException {
/* 24 */     FileRecord fl = new FileRecord();
/* 25 */     fl.setObj(row);
/*    */     try {
/* 27 */       writeRecordFile("Test", fl);
/* 28 */     } catch (IOException e) {
/* 29 */       e.printStackTrace();
/* 30 */     } catch (SQLException e) {
/* 31 */       e.printStackTrace();
/*    */     } 
/* 33 */     MapContainer param = new MapContainer();
/* 34 */     setResponse("OK");
/*    */   }
/*    */   
/*    */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 38 */     this.codesTableManager = codesTableManager;
/*    */   }
/*    */   
/*    */   public CodesTableManager getCodesTableManager() {
/* 42 */     return this.codesTableManager;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\GPGestioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */