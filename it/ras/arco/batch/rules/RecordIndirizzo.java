/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinPosizione;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.Iterator;
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
/*    */ public class RecordIndirizzo
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 27 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 32 */     FinContratto contratto = null;
/* 33 */     Object value = null;
/*    */     
/* 35 */     if (fileRecord.getObj() instanceof FinPosizione) {
/* 36 */       FinPosizione posizione = (FinPosizione)fileRecord.getObj();
/* 37 */       if (posizione != null) {
/* 38 */         contratto = (FinContratto)posizione.getContratto();
/*    */       }
/*    */     } 
/*    */     
/* 42 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 43 */       contratto = (FinContratto)fileRecord.getObj();
/*    */     }
/*    */     
/* 46 */     if (contratto != null) {
/* 47 */       Set indirizzo = contratto.getIndirizzo();
/* 48 */       if (indirizzo != null) {
/* 49 */         Iterator itr = indirizzo.iterator();
/* 50 */         if (itr.hasNext()) {
/* 51 */           value = itr.next();
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 56 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\RecordIndirizzo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */