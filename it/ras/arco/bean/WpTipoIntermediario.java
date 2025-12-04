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
/*    */ public class WpTipoIntermediario
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer tipoIntermediarioId;
/*    */   private String descrizioneTipo;
/*    */   
/*    */   public WpTipoIntermediario(String tipo, Integer id) {
/* 20 */     this.descrizioneTipo = tipo;
/* 21 */     this.tipoIntermediarioId = id;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpTipoIntermediario() {}
/*    */   
/*    */   public String getDescrizioneTipo() {
/* 28 */     return this.descrizioneTipo;
/*    */   }
/*    */   public void setDescrizioneTipo(String descrizioneTipo) {
/* 31 */     this.descrizioneTipo = descrizioneTipo;
/*    */   }
/*    */   public Integer getTipoIntermediarioId() {
/* 34 */     return this.tipoIntermediarioId;
/*    */   }
/*    */   public void setTipoIntermediarioId(Integer tipoIntermediarioId) {
/* 37 */     this.tipoIntermediarioId = tipoIntermediarioId;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpTipoIntermediario.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */