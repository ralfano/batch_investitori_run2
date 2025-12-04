/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinSottoscrizione;
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
/*    */ public class SessionOrdine
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 26 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 30 */     Object value = null;
/* 31 */     if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 32 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 33 */       Set ordine = sottoscrizione.getOrdine();
/* 34 */       if (ordine != null) {
/* 35 */         Iterator itr = ordine.iterator();
/* 36 */         if (itr.hasNext()) {
/* 37 */           value = itr.next();
/*    */         }
/*    */       } 
/*    */     } 
/*    */     
/* 42 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\SessionOrdine.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */