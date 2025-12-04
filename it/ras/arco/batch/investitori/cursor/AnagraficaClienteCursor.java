/*    */ package it.ras.arco.batch.investitori.cursor;
/*    */ 
/*    */ import it.ras.arco.batch.bean.FlxInvestitoriAnagCliente;
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
/*    */ public class AnagraficaClienteCursor
/*    */   extends RasDBSubCursor
/*    */ {
/*    */   public boolean setInProcess() throws RasDaoException {
/* 26 */     if (this.fetchedRow == null)
/*    */     {
/* 28 */       return false;
/*    */     }
/* 30 */     FlxInvestitoriAnagCliente cursorRow = (FlxInvestitoriAnagCliente)this.fetchedRow;
/* 31 */     cursorRow.setStatoElab("I");
/* 32 */     flushStatus();
/* 33 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean setProcessedOk() throws RasDaoException {
/* 39 */     if (this.fetchedRow == null)
/*    */     {
/* 41 */       return false;
/*    */     }
/* 43 */     FlxInvestitoriAnagCliente cursorRow = (FlxInvestitoriAnagCliente)this.fetchedRow;
/* 44 */     cursorRow.setStatoElab("OK");
/* 45 */     flushStatus();
/* 46 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean setProcessedKo() throws RasDaoException {
/* 51 */     if (this.fetchedRow == null)
/*    */     {
/* 53 */       return false;
/*    */     }
/* 55 */     FlxInvestitoriAnagCliente cursorRow = (FlxInvestitoriAnagCliente)this.fetchedRow;
/* 56 */     cursorRow.setStatoElab("KO");
/* 57 */     flushStatus();
/* 58 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\cursor\AnagraficaClienteCursor.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */