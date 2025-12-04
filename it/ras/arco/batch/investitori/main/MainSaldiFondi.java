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
/*    */ public class MainSaldiFondi
/*    */ {
/*    */   public static void main(String[] args) throws Exception {
/* 33 */     RasMain rm = new RasMain();
/*    */     
/* 35 */     rm.execute("it/ras/arco/batch/investitori/config/main/BatchSaldiFondi.xml");
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\main\MainSaldiFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */