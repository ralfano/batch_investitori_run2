/*    */ package it.ras.arco.batch.investitori.cursor;
/*    */ 
/*    */ import it.ras.flag.batch.cursors.RasDBSubCursor;
/*    */ import it.ras.flag.exception.RasDaoException;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ public class GPGestioniCursor
/*    */   extends RasDBSubCursor
/*    */ {
/* 11 */   private List classList = new ArrayList();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean setInProcess() throws RasDaoException {
/* 17 */     int brk = 0;
/* 18 */     return true;
/*    */   }
/*    */   
/*    */   public boolean setProcessedOk() throws RasDaoException {
/* 22 */     if (this.fetchedRow == null) {
/* 23 */       return false;
/*    */     }
/* 25 */     return true;
/*    */   }
/*    */   
/*    */   public boolean setProcessedKo() throws RasDaoException {
/* 29 */     int brk = 0;
/* 30 */     return true;
/*    */   }
/*    */   public List getClassList() {
/* 33 */     return this.classList;
/*    */   }
/*    */   public void setClassList(List classList) {
/* 36 */     this.classList = classList;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\cursor\GPGestioniCursor.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */