/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinPosizione;
/*    */ import it.ras.arco.bean.FinSoggetto;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class IdSoggPrimoIntestatario
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 30 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 35 */     String codSoggPrimoIntestario = "";
/* 36 */     FinContratto contratto = null;
/*    */     
/* 38 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 39 */       contratto = (FinContratto)fileRecord.getObj();
/*    */     }
/*    */     
/* 42 */     if (fileRecord.getObj() instanceof FinPosizione) {
/* 43 */       FinPosizione posizione = (FinPosizione)fileRecord.getObj();
/* 44 */       if (posizione != null) {
/* 45 */         contratto = (FinContratto)posizione.getContratto();
/*    */       }
/*    */     } 
/*    */     
/* 49 */     if (contratto != null) {
/* 50 */       FinSoggetto soggetto = contratto.getSoggetto();
/* 51 */       if (soggetto != null) {
/* 52 */         codSoggPrimoIntestario = soggetto.getSoggettoId().toString();
/*    */       }
/*    */     } 
/*    */     
/* 56 */     return codSoggPrimoIntestario;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\IdSoggPrimoIntestatario.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */