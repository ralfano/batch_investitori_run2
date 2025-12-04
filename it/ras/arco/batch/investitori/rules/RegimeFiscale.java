/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinGP;
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
/*    */ public class RegimeFiscale
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
/* 40 */     String regimeFisc = "G";
/* 41 */     if (fileRecord.getObj() != null && 
/* 42 */       fileRecord.getObj() instanceof it.ras.arco.bean.FinSottoscrizione && 
/* 43 */       localSession.containsKey("TIPO_PRODOTTO") && 
/* 44 */       localSession.get("TIPO_PRODOTTO").toString().startsWith("GP")) {
/* 45 */       FinGP gp = (FinGP)localSession.get("SESSIONCONTRATTO");
/* 46 */       String reg = gp.getRegimeFiscale();
/* 47 */       if (reg != null && 
/* 48 */         !reg.equals("")) {
/* 49 */         regimeFisc = reg;
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 56 */     return regimeFisc;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\RegimeFiscale.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */