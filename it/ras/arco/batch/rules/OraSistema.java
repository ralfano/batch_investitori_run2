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
/*    */ 
/*    */ public class OraSistema
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 28 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 33 */     String str = "";
/*    */     
/* 35 */     Date now = new Date();
/*    */     
/* 37 */     SimpleDateFormat dateFormat = new SimpleDateFormat("HHmmss");
/*    */     
/* 39 */     str = dateFormat.format(now);
/*    */     
/* 41 */     return str;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\OraSistema.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */