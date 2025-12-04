/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
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
/*    */ public class FinProdottoFlyweight
/*    */   extends FinProdotto
/*    */   implements IFlyweightBean
/*    */ {
/* 19 */   private RasORMBean completeBean = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RasORMBean getCompleteBean() {
/* 26 */     return this.completeBean;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCompleteBean(RasORMBean completeBean) {
/* 34 */     this.completeBean = completeBean;
/*    */   }
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
/*    */   public FinProdottoFlyweight() {}
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
/*    */   public FinProdottoFlyweight(Set attFin) {
/* 69 */     super(attFin);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Serializable getBeanId() {
/* 77 */     return getProdottoID();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getCompleteBeanClass() {
/* 86 */     return getClass().getName();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinProdottoFlyweight.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */