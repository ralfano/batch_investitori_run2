/*    */ package it.ras.arco.batch.investitori.cursor;
/*    */ 
/*    */ import it.ras.arco.batch.bean.FlxGpramAnagraficaGp;
/*    */ import it.ras.flag.batch.cursors.RasDBSubCursor;
/*    */ import it.ras.flag.exception.RasDaoException;
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
/*    */ public class ContrattiGpCursor
/*    */   extends RasDBSubCursor
/*    */ {
/*    */   public boolean setInProcess() throws RasDaoException {
/* 44 */     if (this.fetchedRow == null) {
/* 45 */       return false;
/*    */     }
/* 47 */     FlxGpramAnagraficaGp cursorRow = (FlxGpramAnagraficaGp)this.fetchedRow;
/* 48 */     cursorRow.setStatoElaborazione("I");
/* 49 */     flushStatus();
/* 50 */     return true;
/*    */   }
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
/*    */   public boolean setProcessedOk() throws RasDaoException {
/* 64 */     if (this.fetchedRow == null) {
/* 65 */       return false;
/*    */     }
/* 67 */     FlxGpramAnagraficaGp cursorRow = (FlxGpramAnagraficaGp)this.fetchedRow;
/* 68 */     cursorRow.setStatoElaborazione("OK");
/* 69 */     flushStatus();
/* 70 */     return true;
/*    */   }
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
/*    */   public boolean setProcessedKo() throws RasDaoException {
/* 84 */     if (this.fetchedRow == null) {
/* 85 */       return false;
/*    */     }
/* 87 */     FlxGpramAnagraficaGp cursorRow = (FlxGpramAnagraficaGp)this.fetchedRow;
/* 88 */     cursorRow.setStatoElaborazione("KO");
/* 89 */     flushStatus();
/* 90 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\cursor\ContrattiGpCursor.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */