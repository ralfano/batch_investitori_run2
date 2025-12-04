/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinCointestazione;
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
/*    */ public class StampaComponenti
/*    */   extends AbstractValidationRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 28 */     if (fileRecord.getObj() instanceof FinCointestazione) {
/* 29 */       FinCointestazione cointestazione = (FinCointestazione)fileRecord.getObj();
/* 30 */       if (cointestazione.getSoggetto().getTipoSogg().equals("C")) {
/* 31 */         return false;
/*    */       }
/* 33 */       return true;
/*    */     } 
/*    */     
/* 36 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\StampaComponenti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */