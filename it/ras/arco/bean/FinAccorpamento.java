/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class FinAccorpamento
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer accorpamentoId;
/*    */   private Integer tipo;
/*    */   private Set prodotti;
/*    */   private FinAggregazione aggregazione;
/*    */   
/*    */   public Integer getAccorpamentoId() {
/* 17 */     return this.accorpamentoId;
/*    */   }
/*    */   
/*    */   public void setAccorpamentoId(Integer accorpamentoId) {
/* 21 */     this.accorpamentoId = accorpamentoId;
/*    */   }
/*    */   
/*    */   public FinAggregazione getAggregazione() {
/* 25 */     return this.aggregazione;
/*    */   }
/*    */   
/*    */   public void setAggregazione(FinAggregazione aggregazione) {
/* 29 */     this.aggregazione = aggregazione;
/*    */   }
/*    */   
/*    */   public Set getProdotti() {
/* 33 */     return this.prodotti;
/*    */   }
/*    */   
/*    */   public void setProdotti(Set prodotti) {
/* 37 */     this.prodotti = prodotti;
/*    */   }
/*    */   
/*    */   public Integer getTipo() {
/* 41 */     return this.tipo;
/*    */   }
/*    */   
/*    */   public void setTipo(Integer tipo) {
/* 45 */     this.tipo = tipo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAccorpamento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */