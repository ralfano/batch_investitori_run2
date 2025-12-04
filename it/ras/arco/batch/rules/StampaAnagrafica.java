/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinSoggettoIndir;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractValidationRule;
/*    */ import java.util.Set;
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
/*    */ public class StampaAnagrafica
/*    */   extends AbstractValidationRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 29 */     if (fileRecord.getObj() instanceof FinSoggettoIndir) {
/* 30 */       FinSoggettoIndir finSoggInd = (FinSoggettoIndir)fileRecord.getObj();
/* 31 */       Set finDecode = finSoggInd.getSoggetto().getDecodNdgFabbr();
/* 32 */       if (finDecode.size() == 0 && !finSoggInd.getSoggetto().getTipoSogg().equals("C")) {
/* 33 */         return true;
/*    */       }
/* 35 */       return false;
/*    */     } 
/*    */     
/* 38 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\StampaAnagrafica.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */