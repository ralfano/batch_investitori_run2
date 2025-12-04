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
/*    */ public class FinValoriCambi
/*    */   extends FinAutoGSTDValuesSettedBean
/*    */ {
/*    */   private Integer valCambiId;
/*    */   private Date data;
/*    */   private Double tasso;
/*    */   private FinCambi cambio;
/*    */   
/*    */   public FinCambi getCambio() {
/* 26 */     return this.cambio;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCambio(FinCambi cambio) {
/* 34 */     this.cambio = cambio;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Date getData() {
/* 42 */     return this.data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setData(Date data) {
/* 50 */     this.data = data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Double getTasso() {
/* 58 */     return this.tasso;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTasso(Double tasso) {
/* 66 */     this.tasso = tasso;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getValCambiId() {
/* 74 */     return this.valCambiId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValCambiId(Integer valCambiId) {
/* 82 */     this.valCambiId = valCambiId;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinValoriCambi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */