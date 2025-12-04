/*    */ package it.ras.arco.common.bean;
/*    */ 
/*    */ import it.ras.flag.exception.RasException;
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
/*    */ public class ParametroNotFoundException
/*    */   extends RasException
/*    */ {
/*    */   public ParametroNotFoundException() {}
/*    */   
/*    */   public ParametroNotFoundException(String msg) {
/* 29 */     super(msg);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ParametroNotFoundException(Exception e) {
/* 38 */     super(e);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroNotFoundException.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */