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
/*    */ 
/*    */ 
/*    */ public class FinIndirizzoRam
/*    */   extends FinIndirizzo
/*    */   implements Serializable
/*    */ {
/*    */   private FinSoggetto soggettoRam;
/*    */   
/*    */   public FinIndirizzoRam(FinSoggetto soggettoRam) {
/* 25 */     this.soggettoRam = soggettoRam;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public FinIndirizzoRam() {}
/*    */ 
/*    */   
/*    */   public FinSoggetto getSoggettoRam() {
/* 34 */     return this.soggettoRam;
/*    */   }
/*    */   
/*    */   public void setSoggettoRam(FinSoggetto soggettoRam) {
/* 38 */     this.soggettoRam = soggettoRam;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinIndirizzoRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */