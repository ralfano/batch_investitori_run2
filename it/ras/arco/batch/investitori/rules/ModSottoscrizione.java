/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinServizioAggiuntivo;
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
/*    */ 
/*    */ 
/*    */ public class ModSottoscrizione
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 35 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 39 */     String tipo = (localSession.get("TIPOINVIO") != null) ? localSession.get("TIPOINVIO").toString() : "";
/* 40 */     String value = "";
/*    */     
/* 42 */     if (tipo.equals("PIC")) {
/* 43 */       value = "01";
/*    */     }
/* 45 */     else if (tipo.equals("PAC")) {
/* 46 */       value = "02";
/*    */     } 
/*    */     
/* 49 */     if (fileRecord.getObj() != null) {
/* 50 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 51 */       FinServizioAggiuntivo servizi = sottoscrizione.getServiziAggiuntivi();
/* 52 */       if (servizi != null) {
/* 53 */         if (servizi.getTipoServizio().equals("CMT")) {
/* 54 */           value = "04";
/*    */         
/*    */         }
/* 57 */         else if (servizi.getTipoServizio().equals("CMP")) {
/* 58 */           value = "03";
/*    */         } 
/*    */       }
/*    */     } 
/*    */     
/* 63 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\ModSottoscrizione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */