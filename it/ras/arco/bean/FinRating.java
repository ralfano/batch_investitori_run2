/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.util.Date;
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
/*    */ public class FinRating
/*    */   extends FinAutoGSTDValuesSettedBean
/*    */ {
/*    */   private Integer ratingId;
/*    */   private String codiceRating;
/*    */   private Date data;
/*    */   private String codiceFonteFinanziaria;
/*    */   private FinAttivitaFinanziaria attivitaFinanziaria;
/*    */   
/*    */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/* 27 */     return this.attivitaFinanziaria;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/* 35 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getCodiceFonteFinanziaria() {
/* 43 */     return this.codiceFonteFinanziaria;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCodiceFonteFinanziaria(String codiceFonteFinanziaria) {
/* 51 */     this.codiceFonteFinanziaria = codiceFonteFinanziaria;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getCodiceRating() {
/* 59 */     return this.codiceRating;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCodiceRating(String codiceRating) {
/* 67 */     this.codiceRating = codiceRating;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Date getData() {
/* 75 */     return this.data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setData(Date data) {
/* 83 */     this.data = data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getRatingId() {
/* 91 */     return this.ratingId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRatingId(Integer ratingId) {
/* 99 */     this.ratingId = ratingId;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinRating.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */