/*    */ package it.ras.arco.mei;
/*    */ 
/*    */ import it.ras.flag.exception.RasException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SottoscrizioneInconsistenteException
/*    */   extends RasException
/*    */ {
/* 14 */   private int inconsistencyCause = -1;
/*    */ 
/*    */   
/*    */   public static final int INCONSISTENCY_CAUSE_FITTIZIE = 10;
/*    */ 
/*    */   
/*    */   public static final int INCONSISTENCY_CAUSE_REALI = 100;
/*    */ 
/*    */   
/*    */   public SottoscrizioneInconsistenteException(int inconsistencyCause) {
/* 24 */     this();
/* 25 */     this.inconsistencyCause = inconsistencyCause;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SottoscrizioneInconsistenteException() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public SottoscrizioneInconsistenteException(String message) {
/* 44 */     super(message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public int getInconsistencyCause() {
/* 54 */     return this.inconsistencyCause;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setInconsistencyCause(int inconsistencyCause) {
/* 63 */     this.inconsistencyCause = inconsistencyCause;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\SottoscrizioneInconsistenteException.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */