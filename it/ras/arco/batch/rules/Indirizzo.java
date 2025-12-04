/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContrattoIndir;
/*    */ import it.ras.arco.bean.FinDispPagamento;
/*    */ import it.ras.arco.bean.FinIndirizzo;
/*    */ import it.ras.arco.bean.FinSoggettoIndir;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Indirizzo
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 35 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 41 */     String valore = "";
/* 42 */     FinIndirizzo ind = null;
/* 43 */     if (fileRecord.getObj() instanceof FinSoggettoIndir) {
/* 44 */       FinSoggettoIndir indirizzo = (FinSoggettoIndir)fileRecord.getObj();
/* 45 */       if (indirizzo != null) {
/* 46 */         ind = indirizzo.getIndirizzo();
/*    */       }
/* 48 */     } else if (fileRecord.getObj() instanceof FinContrattoIndir) {
/* 49 */       FinContrattoIndir indirizzo = (FinContrattoIndir)fileRecord.getObj();
/* 50 */       if (indirizzo != null) {
/* 51 */         ind = indirizzo.getIndirizzo();
/*    */       }
/* 53 */     } else if (fileRecord.getObj() instanceof FinDispPagamento) {
/* 54 */       FinDispPagamento disp = (FinDispPagamento)fileRecord.getObj();
/* 55 */       if (disp != null) {
/* 56 */         ind = disp.getIndirizzo();
/*    */       }
/* 58 */     } else if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 59 */       FinSottoscrizione sot = (FinSottoscrizione)fileRecord.getObj();
/* 60 */       if (sot != null) {
/* 61 */         ind = sot.getIndirizzo();
/*    */       }
/*    */     } 
/*    */     
/* 65 */     if (ind != null) {
/* 66 */       if (ind.getDesToponimo() != null)
/* 67 */         valore = valore + ind.getDesToponimo().trim() + " "; 
/* 68 */       if (ind.getIndirizzo() != null)
/* 69 */         valore = valore + ind.getIndirizzo().trim() + " "; 
/* 70 */       if (ind.getNumeroCivico() != null) {
/* 71 */         valore = valore + ind.getNumeroCivico().trim();
/*    */       }
/*    */     } 
/*    */     
/* 75 */     return valore;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\Indirizzo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */