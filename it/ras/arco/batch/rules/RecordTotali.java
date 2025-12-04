/*    */ package it.ras.arco.batch.rules;
/*    */ 
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
/*    */ public class RecordTotali
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/* 19 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/* 23 */     if (globalSession.get("COUNTER") != null)
/* 24 */     { int count = Integer.parseInt(globalSession.get("COUNTER").toString()) + 1;
/* 25 */       globalSession.put("COUNTER", new Integer(count)); }
/* 26 */     else { globalSession.put("COUNTER", new Integer(0)); }
/*    */     
/* 28 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\RecordTotali.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */