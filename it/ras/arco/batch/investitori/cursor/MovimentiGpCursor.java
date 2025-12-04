/*    */ package it.ras.arco.batch.investitori.cursor;
/*    */ 
/*    */ import it.ras.arco.batch.bean.FlxGpramMovimenti;
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
/*    */ public class MovimentiGpCursor
/*    */   extends RasDBSubCursor
/*    */ {
/*    */   public boolean setInProcess() throws RasDaoException {
/* 38 */     if (this.fetchedRow == null) {
/* 39 */       return false;
/*    */     }
/* 41 */     FlxGpramMovimenti cursorRow = (FlxGpramMovimenti)this.fetchedRow;
/* 42 */     cursorRow.setStatoElaborazione("I");
/* 43 */     flushStatus();
/* 44 */     return true;
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
/* 58 */     if (this.fetchedRow == null) {
/* 59 */       return false;
/*    */     }
/* 61 */     FlxGpramMovimenti cursorRow = (FlxGpramMovimenti)this.fetchedRow;
/* 62 */     cursorRow.setStatoElaborazione("OK");
/* 63 */     flushStatus();
/* 64 */     return true;
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
/* 78 */     if (this.fetchedRow == null) {
/* 79 */       return false;
/*    */     }
/* 81 */     FlxGpramMovimenti cursorRow = (FlxGpramMovimenti)this.fetchedRow;
/* 82 */     cursorRow.setStatoElaborazione("KO");
/* 83 */     flushStatus();
/* 84 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\cursor\MovimentiGpCursor.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */