/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
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
/*    */ public class FinAggregazione
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private static final long serialVersionUID = -8916407642938703917L;
/*    */   private Integer aggregazioneId;
/*    */   private String descrizione;
/*    */   private String tipoAggFabbrica;
/*    */   private String feedback;
/*    */   private Integer ordine;
/*    */   private Set accorpamento;
/*    */   
/*    */   public void setAggregazioneId(Integer aggregazioneId) {
/* 30 */     this.aggregazioneId = aggregazioneId;
/*    */   }
/*    */   
/*    */   public Integer getAggregazioneId() {
/* 34 */     return this.aggregazioneId;
/*    */   }
/*    */   
/*    */   public String getDescrizione() {
/* 38 */     return this.descrizione;
/*    */   }
/*    */   
/*    */   public void setDescrizione(String descrizione) {
/* 42 */     this.descrizione = descrizione;
/*    */   }
/*    */   
/*    */   public Set getAccorpamento() {
/* 46 */     return this.accorpamento;
/*    */   }
/*    */   
/*    */   public void setAccorpamento(Set accorpamento) {
/* 50 */     this.accorpamento = accorpamento;
/*    */   }
/*    */   
/*    */   public String getFeedback() {
/* 54 */     return this.feedback;
/*    */   }
/*    */   
/*    */   public void setFeedback(String feedback) {
/* 58 */     this.feedback = feedback;
/*    */   }
/*    */   
/*    */   public String getTipoAggFabbrica() {
/* 62 */     return this.tipoAggFabbrica;
/*    */   }
/*    */   
/*    */   public void setTipoAggFabbrica(String tipoAggFabbrica) {
/* 66 */     this.tipoAggFabbrica = tipoAggFabbrica;
/*    */   }
/*    */   
/*    */   public Integer getOrdine() {
/* 70 */     return this.ordine;
/*    */   }
/*    */   
/*    */   public void setOrdine(Integer ordine) {
/* 74 */     this.ordine = ordine;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAggregazione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */