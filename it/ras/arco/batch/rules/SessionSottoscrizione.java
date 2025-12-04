/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
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
/*    */ public class SessionSottoscrizione
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 22 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 26 */     return fileRecord.getObj();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\SessionSottoscrizione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */