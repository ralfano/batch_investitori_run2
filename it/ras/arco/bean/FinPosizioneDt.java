/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public class FinPosizioneDt
/*    */   extends FinPosizione
/*    */   implements Serializable
/*    */ {
/*    */   private FinSoggetto soggetto;
/*    */   private FinDettaglioPct posizioneDet;
/*    */   
/*    */   public FinDettaglioPct getPosizioneDet() {
/* 24 */     return this.posizioneDet;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPosizioneDet(FinDettaglioPct posizioneDet) {
/* 31 */     this.posizioneDet = posizioneDet;
/*    */   }
/*    */   
/*    */   public FinSoggetto getSoggetto() {
/* 35 */     return this.soggetto;
/*    */   }
/*    */   
/*    */   public void setSoggetto(FinSoggetto soggetto) {
/* 39 */     this.soggetto = soggetto;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPosizioneDt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */