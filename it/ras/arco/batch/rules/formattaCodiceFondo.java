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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class formattaCodiceFondo
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 27 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 32 */     String codFondo = "00";
/*    */     
/* 34 */     if (localSession.get("COD_FONDO") != null)
/*    */     {
/* 36 */       codFondo = ((String)localSession.get("COD_FONDO")).substring(1, 3);
/*    */     }
/*    */ 
/*    */     
/* 40 */     return codFondo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\formattaCodiceFondo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */