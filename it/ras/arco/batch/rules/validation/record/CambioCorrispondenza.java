/*    */ package it.ras.arco.batch.rules.validation.record;
/*    */ 
/*    */ import it.ras.arco.bean.FinSottoscrizione;
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
/*    */ public class CambioCorrispondenza
/*    */   extends AbstractValidationRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 31 */     String operazione = "";
/* 32 */     if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 33 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 34 */       operazione = sottoscrizione.getTipoOperazione();
/*    */     } 
/* 36 */     if (operazione.equals("SOT") || operazione.equals("MCC")) {
/* 37 */       return true;
/*    */     }
/* 39 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\validation\record\CambioCorrispondenza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */