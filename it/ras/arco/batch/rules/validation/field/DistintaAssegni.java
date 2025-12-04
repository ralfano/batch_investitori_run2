/*    */ package it.ras.arco.batch.rules.validation.field;
/*    */ 
/*    */ import it.ras.arco.bean.FinDispPagamento;
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
/*    */ public class DistintaAssegni
/*    */   extends AbstractValidationRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 28 */     FinDispPagamento disposizione = (FinDispPagamento)fileRecord.getObj();
/* 29 */     if (disposizione.getMezzoPagamento().startsWith("A")) {
/* 30 */       return (disposizione.getDistintaAssegni() != null);
/*    */     }
/* 32 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\validation\field\DistintaAssegni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */