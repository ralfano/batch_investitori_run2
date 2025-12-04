/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinSottoscrizione;
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
/*    */ public class TipoVariazione
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 32 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 36 */     String tipOperazione = localSession.get("TIPOOPERAZIONE").toString();
/* 37 */     FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 38 */     String linea = " ";
/* 39 */     if (sottoscrizione != null)
/*    */     {
/* 41 */       if (tipOperazione.equals("MCO"))
/*    */       {
/* 43 */         linea = "2";
/*    */       }
/*    */     }
/* 46 */     return linea;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\TipoVariazione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */