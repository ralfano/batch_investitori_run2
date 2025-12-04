/*    */ package it.ras.arco.batch.investitori.cursor;
/*    */ 
/*    */ import it.ras.arco.batch.bean.FlxInvestitoriSaldi;
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
/*    */ public class SaldiFondiCursor
/*    */   extends RasDBSubCursor
/*    */ {
/*    */   public boolean setInProcess() throws RasDaoException {
/* 38 */     if (this.fetchedRow == null) {
/* 39 */       return false;
/*    */     }
/* 41 */     FlxInvestitoriSaldi cursorRow = (FlxInvestitoriSaldi)this.fetchedRow;
/* 42 */     cursorRow.setStatoElab("I");
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
/*    */   public boolean setProcessedOk() throws RasDaoException {
/* 57 */     if (this.fetchedRow == null) {
/* 58 */       return false;
/*    */     }
/* 60 */     FlxInvestitoriSaldi cursorRow = (FlxInvestitoriSaldi)this.fetchedRow;
/* 61 */     cursorRow.setStatoElab("OK");
/* 62 */     flushStatus();
/* 63 */     return true;
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
/* 77 */     if (this.fetchedRow == null) {
/* 78 */       return false;
/*    */     }
/* 80 */     FlxInvestitoriSaldi cursorRow = (FlxInvestitoriSaldi)this.fetchedRow;
/* 81 */     cursorRow.setStatoElab("KO");
/* 82 */     flushStatus();
/* 83 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\cursor\SaldiFondiCursor.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */