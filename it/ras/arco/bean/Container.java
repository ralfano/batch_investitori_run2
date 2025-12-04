/*    */ package it.ras.arco.bean;
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
/*    */ public class Container
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private FinPromotore promotore;
/*    */   private FinSoggetto soggetto;
/*    */   
/*    */   public FinPromotore getPromotore() {
/* 26 */     return this.promotore;
/*    */   }
/*    */   
/*    */   public void setPromotore(FinPromotore promotore) {
/* 30 */     this.promotore = promotore;
/*    */   }
/*    */   
/*    */   public FinSoggetto getSoggetto() {
/* 34 */     return this.soggetto;
/*    */   }
/*    */   
/*    */   public void setSoggetto(FinSoggetto soggetto) {
/* 38 */     this.soggetto = soggetto;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\Container.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */