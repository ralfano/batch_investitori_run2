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
/*    */ public class ParametroLogico
/*    */   extends Parametro
/*    */ {
/*    */   private boolean simuatedThroughCharacters = false;
/*    */   
/*    */   public String costruisciEspressione(ArrayList queryParameters) {
/* 30 */     Boolean b = (Boolean)getValori(0);
/* 31 */     boolean valore = b.booleanValue();
/*    */     
/* 33 */     if (this.simuatedThroughCharacters)
/*    */     {
/* 35 */       return " = '" + (valore ? "true" : "false") + "'";
/*    */     }
/*    */ 
/*    */     
/* 39 */     return " = " + (valore ? "true" : "false");
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
/*    */   public boolean isSimuatedThroughCharacters() {
/* 51 */     return this.simuatedThroughCharacters;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSimuatedThroughCharacters(boolean simuatedThroughCharacters) {
/* 62 */     this.simuatedThroughCharacters = simuatedThroughCharacters;
/*    */   }
/*    */   
/*    */   public void validate(String valore) throws ValoreParametroNonValidoException {}
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroLogico.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */