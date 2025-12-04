/*    */ package it.ras.arco.mei.impl;
/*    */ 
/*    */ import it.ras.arco.bean.FinEmittente;
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
/*    */ public class EventManagerUtils
/*    */ {
/*    */   public static boolean compareFactories(FinEmittente a, FinEmittente b) {
/* 25 */     if (a == b) {
/* 26 */       return true;
/*    */     }
/* 28 */     if (a.getEmittenteId() == null || b.getEmittenteId() == null) {
/* 29 */       return false;
/*    */     }
/* 31 */     return (a.getEmittenteId().intValue() == b.getEmittenteId().intValue());
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\impl\EventManagerUtils.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */