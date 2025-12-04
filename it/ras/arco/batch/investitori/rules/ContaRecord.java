/*    */ package it.ras.arco.batch.investitori.rules;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ContaRecord
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/* 25 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/*    */     int recordCount;
/* 31 */     if (globalSession.get("RECORD_COUNT") != null) {
/* 32 */       recordCount = ((Integer)globalSession.get("RECORD_COUNT")).intValue();
/*    */     } else {
/* 34 */       recordCount = 2;
/*    */     } 
/*    */     
/* 37 */     return new Integer(recordCount);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\ContaRecord.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */