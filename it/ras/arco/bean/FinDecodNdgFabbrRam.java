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
/*    */ public class FinDecodNdgFabbrRam
/*    */   extends FinDecodNdgFabbr
/*    */   implements Serializable
/*    */ {
/*    */   private FinCointestazione cointestazione;
/*    */   
/*    */   public FinDecodNdgFabbrRam(FinCointestazione cointestazione) {
/* 18 */     this.cointestazione = cointestazione;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FinDecodNdgFabbrRam() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public FinCointestazione getCointestazione() {
/* 29 */     return this.cointestazione;
/*    */   }
/*    */   
/*    */   public void setCointestazione(FinCointestazione cointestazione) {
/* 33 */     this.cointestazione = cointestazione;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDecodNdgFabbrRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */