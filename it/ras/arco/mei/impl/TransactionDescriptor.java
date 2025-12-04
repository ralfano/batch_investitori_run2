/*    */ package it.ras.arco.mei.impl;
/*    */ 
/*    */ import it.ras.flag.exception.RasException;
/*    */ import it.ras.flag.transaction.IRasRequiredTransaction;
/*    */ import it.ras.flag.transaction.IRasSupportedTransaction;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TransactionDescriptor
/*    */   implements Serializable
/*    */ {
/* 18 */   private IRasSupportedTransaction supportedTx = null;
/*    */   
/* 20 */   private IRasRequiredTransaction requiredTx = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IRasRequiredTransaction getRequiredTx() {
/* 28 */     return this.requiredTx;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRequiredTx(IRasRequiredTransaction requiredTx) {
/* 37 */     if (requiredTx != null)
/* 38 */       this.supportedTx = null; 
/* 39 */     this.requiredTx = requiredTx;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public IRasSupportedTransaction getSupportedTx() {
/* 48 */     return this.supportedTx;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSupportedTx(IRasSupportedTransaction supportedTx) {
/* 57 */     if (supportedTx != null)
/* 58 */       this.requiredTx = null; 
/* 59 */     this.supportedTx = supportedTx;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MapContainer execute(MapContainer inputMap) throws RasException {
/* 70 */     if (this.supportedTx != null) return this.supportedTx.transaction(inputMap); 
/* 71 */     if (this.requiredTx != null) return this.requiredTx.transaction(inputMap);
/*    */     
/* 73 */     throw new RasException("Ne' 'supportedTx', ne' 'requiredTx' sono definite.");
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\impl\TransactionDescriptor.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */