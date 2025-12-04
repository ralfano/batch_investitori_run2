/*    */ package it.ras.arco.batch.investitori.main;
/*    */ 
/*    */ import it.ras.flag.batch.RasMain;
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
/*    */ public class OutboundMainGPGestioni
/*    */ {
/*    */   public static void main(String[] args) {
/* 23 */     RasMain rm = new RasMain();
/*    */     try {
/* 25 */       rm.execute("it\\ras\\arco\\batch\\ramgp\\config\\main\\BatchGPGestioniMain.xml");
/* 26 */     } catch (Exception e) {
/* 27 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\main\OutboundMainGPGestioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */