/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WpContrattoTerzi
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer contrattoTerziId;
/*    */   private Set clientegen;
/*    */   private Set intermediario;
/*    */   private Set prodotto;
/*    */   private String tipo;
/*    */   
/*    */   public WpContrattoTerzi(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/* 19 */     this.clientegen = clientegen;
/* 20 */     this.contrattoTerziId = id;
/* 21 */     this.intermediario = intermediario;
/* 22 */     this.prodotto = prodotto;
/* 23 */     this.tipo = tipo;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpContrattoTerzi() {}
/*    */   
/*    */   public Set getClientegen() {
/* 30 */     return this.clientegen;
/*    */   }
/*    */   public void setClientegen(Set clientegen) {
/* 33 */     this.clientegen = clientegen;
/*    */   }
/*    */   public Integer getContrattoTerziId() {
/* 36 */     return this.contrattoTerziId;
/*    */   }
/*    */   public void setContrattoTerziId(Integer contrattoTerziId) {
/* 39 */     this.contrattoTerziId = contrattoTerziId;
/*    */   }
/*    */   public Set getIntermediario() {
/* 42 */     return this.intermediario;
/*    */   }
/*    */   public void setIntermediario(Set intermediario) {
/* 45 */     this.intermediario = intermediario;
/*    */   }
/*    */   public Set getProdotto() {
/* 48 */     return this.prodotto;
/*    */   }
/*    */   public void setProdotto(Set prodotto) {
/* 51 */     this.prodotto = prodotto;
/*    */   }
/*    */   public String getTipo() {
/* 54 */     return this.tipo;
/*    */   }
/*    */   public void setTipo(String tipo) {
/* 57 */     this.tipo = tipo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpContrattoTerzi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */