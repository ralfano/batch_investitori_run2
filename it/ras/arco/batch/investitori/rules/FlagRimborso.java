/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinServizioAggiuntivo;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
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
/*    */ public class FlagRimborso
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 38 */     FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 39 */     String value = "N";
/* 40 */     if (sottoscrizione != null) {
/* 41 */       FinServizioAggiuntivo servizio = sottoscrizione.getServiziAggiuntivi();
/* 42 */       if (servizio != null && 
/* 43 */         servizio.getTipoServizio().equals("530")) {
/* 44 */         value = "S";
/*    */       }
/*    */     } 
/*    */     
/* 48 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\FlagRimborso.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */