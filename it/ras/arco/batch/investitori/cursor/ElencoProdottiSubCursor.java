/*    */ package it.ras.arco.batch.investitori.cursor;
/*    */ 
/*    */ import it.ras.arco.batch.bean.FlxGpramElencoProd;
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
/*    */ public class ElencoProdottiSubCursor
/*    */   extends RasDBSubCursor
/*    */ {
/*    */   public boolean setInProcess() throws RasDaoException {
/* 44 */     if (this.fetchedRow == null) {
/* 45 */       return false;
/*    */     }
/* 47 */     FlxGpramElencoProd cursorRow = (FlxGpramElencoProd)this.fetchedRow;
/* 48 */     cursorRow.setStatoElaborazione("I");
/* 49 */     flushStatus();
/* 50 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean setProcessedOk() throws RasDaoException {
/* 58 */     if (this.fetchedRow == null)
/*    */     {
/* 60 */       return false;
/*    */     }
/* 62 */     FlxGpramElencoProd cursorRow = (FlxGpramElencoProd)this.fetchedRow;
/* 63 */     cursorRow.setStatoElaborazione("OK");
/*    */     
/* 65 */     flushStatus();
/* 66 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean setProcessedKo() throws RasDaoException {
/* 72 */     if (this.fetchedRow == null)
/*    */     {
/* 74 */       return false;
/*    */     }
/* 76 */     FlxGpramElencoProd cursorRow = (FlxGpramElencoProd)this.fetchedRow;
/* 77 */     cursorRow.setStatoElaborazione("KO");
/*    */     
/* 79 */     flushStatus();
/*    */     
/* 81 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\cursor\ElencoProdottiSubCursor.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */