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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SchedaCliente
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 43 */     String scheda = "SI";
/* 44 */     if (fileRecord.getObj() != null && 
/* 45 */       fileRecord.getObj() instanceof it.ras.arco.bean.FinSottoscrizione && 
/* 46 */       localSession.containsKey("TIPO_PRODOTTO") && 
/* 47 */       localSession.get("TIPO_PRODOTTO").toString().startsWith("GP")) {
/* 48 */       FinGP gp = (FinGP)localSession.get("SESSIONCONTRATTO");
/* 49 */       String sch = gp.getSchedaFinanziaria();
/* 50 */       scheda = "SI";
/* 51 */       if (sch != null && 
/* 52 */         !sch.equals("")) {
/* 53 */         scheda = sch;
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 60 */     return scheda;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\SchedaCliente.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */