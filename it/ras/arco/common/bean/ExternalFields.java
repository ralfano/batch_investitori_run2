/*    */ package it.ras.arco.common.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
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
/*    */ public class ExternalFields
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Double importoTotale;
/*    */   private Double codiceSconto;
/*    */   private int idPresentatore;
/*    */   
/*    */   public Double getImportoTotale() {
/* 30 */     return this.importoTotale;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setImportoTotale(Double importoTotale) {
/* 36 */     this.importoTotale = importoTotale;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public Double getCodiceSconto() {
/* 42 */     return this.codiceSconto;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCodiceSconto(Double codiceSconto) {
/* 48 */     this.codiceSconto = codiceSconto;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public int getIdPresentatore() {
/* 54 */     return this.idPresentatore;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setIdPresentatore(int idPresentatore) {
/* 60 */     this.idPresentatore = idPresentatore;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ExternalFields.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */