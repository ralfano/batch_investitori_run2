/*    */ package it.ras.arco.common.bean;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ParametroConfronto
/*    */   extends Parametro
/*    */ {
/* 16 */   private String propertyDiConfrontoLeft = null;
/* 17 */   private String propertyDiConfrontoRight = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private boolean active = false;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String costruisciEspressione(ArrayList queryParameters) {
/* 30 */     return this.propertyDiConfrontoLeft + " = " + this.propertyDiConfrontoRight;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void validate(String valore) throws ValoreParametroNonValidoException {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getPropertyDiConfrontoLeft() {
/* 47 */     return this.propertyDiConfrontoLeft;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPropertyDiConfrontoLeft(String primoPropertyDiConfronto) {
/* 55 */     this.propertyDiConfrontoLeft = primoPropertyDiConfronto;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getPropertyDiConfrontoRight() {
/* 63 */     return this.propertyDiConfrontoRight;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPropertyDiConfrontoRight(String secondaPropertyDiConfronto) {
/* 73 */     this.propertyDiConfrontoRight = secondaPropertyDiConfronto;
/*    */   }
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
/*    */   public boolean isActive() {
/* 87 */     return this.active;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setActive(boolean active) {
/* 94 */     this.active = active;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroConfronto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */