/*    */ package it.ras.arco.cp.bean;
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
/*    */   public String costruisciEspressione() {
/* 28 */     Boolean b = Boolean.valueOf(getValori(0));
/* 29 */     boolean valore = b.booleanValue();
/*    */     
/* 31 */     if (this.simuatedThroughCharacters)
/*    */     {
/* 33 */       return " = '" + (valore ? "true" : "false") + "'";
/*    */     }
/*    */ 
/*    */     
/* 37 */     return " = " + (valore ? "true" : "false");
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
/* 49 */     return this.simuatedThroughCharacters;
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
/* 60 */     this.simuatedThroughCharacters = simuatedThroughCharacters;
/*    */   }
/*    */   
/*    */   public void validate(String valore) throws ValoreParametroNonValidoException {}
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\bean\ParametroLogico.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */