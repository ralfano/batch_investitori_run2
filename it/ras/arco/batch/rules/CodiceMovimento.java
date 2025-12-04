/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
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
/*    */ 
/*    */ public class CodiceMovimento
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 38 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 43 */     long nuovoCodiceMovimento = 0L;
/* 44 */     Integer codMovimentoInterno = new Integer(localSession.get("NUMERO_MOVIMENTO_INTERNO").toString());
/* 45 */     long costanteMov = 9000000000L;
/*    */     
/* 47 */     Date dataInserimento = (Date)localSession.get("GSTD_INSE_D");
/*    */     
/* 49 */     Long codMovimentoEsterno = new Long(localSession.get("NUMERO_MOVIMENTO_ESTERNO").toString());
/*    */     
/* 51 */     SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
/* 52 */     Date dt = null;
/*    */     
/*    */     try {
/* 55 */       dt = formatter.parse("03-04-2006");
/*    */     }
/* 57 */     catch (Exception e) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 63 */     if (dataInserimento.compareTo(dt) >= 0) {
/* 64 */       nuovoCodiceMovimento = codMovimentoInterno.longValue() + costanteMov;
/*    */     } else {
/* 66 */       nuovoCodiceMovimento = codMovimentoEsterno.longValue();
/*    */     } 
/*    */     
/* 69 */     return (new Long(nuovoCodiceMovimento)).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\CodiceMovimento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */