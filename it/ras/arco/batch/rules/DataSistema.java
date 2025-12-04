/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
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
/*    */ public class DataSistema
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 27 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 32 */     String str = "";
/*    */     
/* 34 */     Date now = new Date();
/*    */     
/* 36 */     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
/*    */     
/* 38 */     str = dateFormat.format(now);
/*    */     
/* 40 */     return str;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\DataSistema.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */