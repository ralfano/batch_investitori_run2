/*    */ package it.ras.arco.common.bean;
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
/*    */ public class ParametroDiOrdinamento
/*    */ {
/* 16 */   private String nomeLogico = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private boolean ascendente = true;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ParametroDiOrdinamento(String nomeLogico, boolean ascendente) {
/* 27 */     this.nomeLogico = nomeLogico;
/* 28 */     this.ascendente = ascendente;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isAscendente() {
/* 34 */     return this.ascendente;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setAscendente(boolean ascendente) {
/* 40 */     this.ascendente = ascendente;
/*    */   }
/*    */   
/*    */   public String getTipoOrdinamento() {
/* 44 */     return this.ascendente ? "ASC" : "DESC";
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getNomeLogico() {
/* 51 */     return this.nomeLogico;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setNomeLogico(String nomeLogico) {
/* 57 */     this.nomeLogico = nomeLogico;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroDiOrdinamento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */