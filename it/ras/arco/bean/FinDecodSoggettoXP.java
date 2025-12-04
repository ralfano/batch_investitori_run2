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
/*    */ public class FinDecodSoggettoXP
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer soggettoXpId;
/*    */   private FinSoggetto soggetto;
/*    */   
/*    */   public Integer getSoggettoXpId() {
/* 21 */     return this.soggettoXpId;
/*    */   }
/*    */   
/*    */   public void setSoggettoXpId(Integer soggettoXpId) {
/* 25 */     this.soggettoXpId = soggettoXpId;
/*    */   }
/*    */   
/*    */   public FinSoggetto getSoggetto() {
/* 29 */     return this.soggetto;
/*    */   }
/*    */   
/*    */   public void setSoggetto(FinSoggetto soggetto) {
/* 33 */     this.soggetto = soggetto;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDecodSoggettoXP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */