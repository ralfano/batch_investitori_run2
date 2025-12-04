/*    */ package it.ras.arco.batch.rules.validation.record;
/*    */ 
/*    */ import it.ras.arco.bean.FinOrdine;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TipoOrdine
/*    */   extends AbstractValidationRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 32 */     String operazione = "";
/* 33 */     if (fileRecord.getObj() instanceof FinOrdine) {
/* 34 */       FinOrdine ordine = (FinOrdine)fileRecord.getObj();
/* 35 */       operazione = ordine.getTipo();
/*    */     } 
/* 37 */     if (operazione.equals("100")) {
/* 38 */       return true;
/*    */     }
/* 40 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\validation\record\TipoOrdine.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */