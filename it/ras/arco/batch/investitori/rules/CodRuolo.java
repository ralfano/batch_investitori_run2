/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinSoggetto;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.HashMap;
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
/*    */ public class CodRuolo
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 33 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 37 */     String codiceRuolo = "04";
/* 38 */     String soggId = "";
/* 39 */     if (localSession.get("INTESTATARIO") != null) {
/* 40 */       soggId = localSession.get("INTESTATARIO").toString();
/*    */     }
/*    */ 
/*    */     
/* 44 */     if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 45 */       FinSottoscrizione finSoggInd = (FinSottoscrizione)fileRecord.getObj();
/* 46 */       if (finSoggInd != null) {
/* 47 */         FinSoggetto soggetto = finSoggInd.getSoggettoRichiedente();
/* 48 */         if (soggetto != null && 
/* 49 */           soggetto.getSoggettoId().toString().equals(soggId)) {
/* 50 */           codiceRuolo = "01";
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 55 */     return codiceRuolo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\CodRuolo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */