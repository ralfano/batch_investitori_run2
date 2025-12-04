/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinContrattoPromotore;
/*    */ import it.ras.arco.bean.FinMovimento;
/*    */ import it.ras.arco.bean.FinPosizione;
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
/*    */ public class RecordPromotore
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 33 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 38 */     FinPromotore promotore = null;
/* 39 */     FinContratto contratto = null;
/*    */ 
/*    */     
/* 42 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 43 */       contratto = (FinContratto)fileRecord.getObj();
/*    */     }
/*    */     
/* 46 */     if (fileRecord.getObj() instanceof FinPosizione) {
/* 47 */       FinPosizione posizione = (FinPosizione)fileRecord.getObj();
/* 48 */       if (posizione != null) {
/* 49 */         contratto = (FinContratto)posizione.getContratto();
/*    */       }
/*    */     } 
/*    */     
/* 53 */     if (fileRecord.getObj() instanceof FinMovimento) {
/* 54 */       FinMovimento movimento = (FinMovimento)fileRecord.getObj();
/* 55 */       if (movimento != null) {
/* 56 */         contratto = movimento.getContratto();
/*    */       }
/*    */     } 
/*    */     
/* 60 */     if (contratto != null) {
/* 61 */       Iterator assegnazione = contratto.getAssegnazione().iterator();
/* 62 */       while (assegnazione.hasNext()) {
/* 63 */         FinContrattoPromotore contrattoProm = assegnazione.next();
/* 64 */         if (contrattoProm != null && 
/* 65 */           contrattoProm.getFlagAttuale().equals("S") && contrattoProm.getFlagSplit().equals("N")) {
/* 66 */           FinPromotore prom = contrattoProm.getPromotore();
/* 67 */           if (prom != null) {
/* 68 */             promotore = prom;
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 75 */     return promotore;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\RecordPromotore.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */