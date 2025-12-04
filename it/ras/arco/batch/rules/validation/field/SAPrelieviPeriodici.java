/*    */ package it.ras.arco.batch.rules.validation.field;
/*    */ 
/*    */ import it.ras.arco.bean.FinServizioAggiuntivo;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractValidationRule;
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
/*    */ public class SAPrelieviPeriodici
/*    */   extends AbstractValidationRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 28 */     FinServizioAggiuntivo sa = (FinServizioAggiuntivo)fileRecord.getObj();
/* 29 */     if (sa != null) {
/* 30 */       if (sa.getTipoServizio().equals("APP")) {
/* 31 */         return true;
/*    */       }
/* 33 */       return false;
/*    */     } 
/*    */     
/* 36 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\validation\field\SAPrelieviPeriodici.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */