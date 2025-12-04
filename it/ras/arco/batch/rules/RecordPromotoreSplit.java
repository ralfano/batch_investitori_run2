/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinContrattoPromotore;
/*    */ import it.ras.arco.bean.FinPromotore;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.Iterator;
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
/*    */ public class RecordPromotoreSplit
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 31 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 35 */     FinPromotore promotoreSplit = null;
/* 36 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 37 */       FinContratto contratto = (FinContratto)fileRecord.getObj();
/* 38 */       Iterator assegnazione = contratto.getAssegnazione().iterator();
/* 39 */       while (assegnazione.hasNext()) {
/* 40 */         FinContrattoPromotore contrattoProm = assegnazione.next();
/* 41 */         if (contrattoProm != null && 
/* 42 */           contrattoProm.getFlagAttuale().equals("S") && contrattoProm.getFlagSplit().equals("S")) {
/* 43 */           FinPromotore promotore = contrattoProm.getPromotore();
/* 44 */           if (promotore != null) {
/* 45 */             promotoreSplit = promotore;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 52 */     return promotoreSplit;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\RecordPromotoreSplit.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */