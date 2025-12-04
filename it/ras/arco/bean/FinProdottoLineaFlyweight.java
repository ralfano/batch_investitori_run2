/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinProdottoLineaFlyweight
/*     */   extends FinProdottoLinea
/*     */   implements IFlyweightBean
/*     */ {
/*  19 */   private RasORMBean completeBean = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdottoLineaFlyweight(Date dataInizio, Date dataFine, Date dataInserimento, String utenteInserimento, FinProdotto prodotto, FinAttivitaFinanziaria attFin, Integer id) {
/*  33 */     super(attFin, dataFine, dataInizio, dataInserimento, prodotto, utenteInserimento, id);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdottoLineaFlyweight() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdottoLineaFlyweight(FinAttivitaFinanziaria attFin) {
/*  49 */     super(attFin);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Serializable getBeanId() {
/*  58 */     return getProdottoLineaId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/*  71 */     return getUserUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/*  79 */     setUserUltimaModifica(userUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/*  87 */     return getProceduraUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*  96 */     setProceduraUltimaModifica(proceduraUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModificaSlave() {
/* 104 */     return getDataUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/* 112 */     setDataUltimaModifica(dataUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModificaSlave() {
/* 120 */     return getTipoUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 128 */     setTipoUltimaModifica(tipoUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RasORMBean getCompleteBean() {
/* 136 */     return this.completeBean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCompleteBean(RasORMBean completeBean) {
/* 144 */     this.completeBean = completeBean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCompleteBeanClass() {
/* 152 */     return getClass().getName();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinProdottoLineaFlyweight.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */