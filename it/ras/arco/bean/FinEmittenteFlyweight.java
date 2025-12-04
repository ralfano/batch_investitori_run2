/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
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
/*    */ public class FinEmittenteFlyweight
/*    */   extends FinEmittente
/*    */   implements IFlyweightBean
/*    */ {
/* 20 */   private RasORMBean completeBean = null;
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
/*    */   public FinEmittenteFlyweight(String descrizione, String flgInterna, String tipoSocieta, String codEmittExt, Date dataInserimento, String utenteInserimento, Set prodotto, Set interfaccia, Set listaParametri, Set sottoscrizioni) {
/* 36 */     super(descrizione, flgInterna, tipoSocieta, codEmittExt, dataInserimento, utenteInserimento, prodotto, interfaccia, listaParametri, sottoscrizioni);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FinEmittenteFlyweight() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FinEmittenteFlyweight(Set prodotto) {
/* 54 */     super(prodotto);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Serializable getBeanId() {
/* 62 */     return getEmittenteId();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public RasORMBean getCompleteBean() {
/* 70 */     return this.completeBean;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCompleteBean(RasORMBean completeBean) {
/* 78 */     this.completeBean = completeBean;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getCompleteBeanClass() {
/* 87 */     return getClass().getName();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinEmittenteFlyweight.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */