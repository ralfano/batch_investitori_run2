/*    */ package it.ras.arco.batch.investitori.businesslogic;
/*    */ 
/*    */ import it.ras.arco.batch.bean.FlxInvestitoriCointestazione;
/*    */ import it.ras.flag.batch.skeleton.RasIsBrokenKeyManager;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CointestazioniGenBrokenKeyMgr
/*    */   extends RasIsBrokenKeyManager
/*    */ {
/*    */   public boolean checkBrokenKey(Object oldRow, Object newRow) {
/* 43 */     String KeyOld = ((FlxInvestitoriCointestazione)oldRow).getNumeroRapporto();
/* 44 */     String KeyNew = ((FlxInvestitoriCointestazione)newRow).getNumeroRapporto();
/*    */     
/* 46 */     if (KeyOld.compareTo(KeyNew) != 0) {
/* 47 */       return true;
/*    */     }
/*    */     
/* 50 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\businesslogic\CointestazioniGenBrokenKeyMgr.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */