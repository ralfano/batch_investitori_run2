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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Nazionalita
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 33 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 40 */     String nazionalita = "086";
/*    */     
/* 42 */     if (localSession.get("NAZIONALITA") != null && localSession.get("NAZIONALITA").toString() != "")
/*    */     {
/*    */       
/* 45 */       nazionalita = localSession.get("NAZIONALITA").toString();
/*    */     }
/*    */     
/* 48 */     return nazionalita;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\Nazionalita.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */