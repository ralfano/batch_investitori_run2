/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinVariazAnag
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer variazAnagrId;
/*     */   private Integer soggettoId;
/*     */   private Integer promotoreId;
/*     */   private Date dataIniz;
/*     */   private Date dataFine;
/*     */   private String statoVariaz;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinVariazAnag(Date fine, Date iniz, Date inserimento, String supl, Integer id, Integer id2, String variaz, String inserimento2, Integer id3) {
/*  49 */     this.dataFine = fine;
/*  50 */     this.dataIniz = iniz;
/*  51 */     this.dataInserimento = inserimento;
/*  52 */     this.datiSupl = supl;
/*  53 */     this.promotoreId = id;
/*  54 */     this.soggettoId = id2;
/*  55 */     this.statoVariaz = variaz;
/*  56 */     this.utenteInserimento = inserimento2;
/*  57 */     this.variazAnagrId = id3;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinVariazAnag() {}
/*     */ 
/*     */   
/*     */   public Integer getVariazAnagrId() {
/*  65 */     return this.variazAnagrId;
/*     */   }
/*     */   
/*     */   public void setVariazAnagrId(Integer variazAnagrId) {
/*  69 */     this.variazAnagrId = variazAnagrId;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoId() {
/*  73 */     return this.soggettoId;
/*     */   }
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/*  77 */     this.soggettoId = soggettoId;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreId() {
/*  81 */     return this.promotoreId;
/*     */   }
/*     */   
/*     */   public void setPromotoreId(Integer promotoreId) {
/*  85 */     this.promotoreId = promotoreId;
/*     */   }
/*     */   
/*     */   public Date getDataIniz() {
/*  89 */     return this.dataIniz;
/*     */   }
/*     */   
/*     */   public void setDataIniz(Date dataIniz) {
/*  93 */     this.dataIniz = dataIniz;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/*  97 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 101 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public String getStatoVariaz() {
/* 105 */     return this.statoVariaz;
/*     */   }
/*     */   
/*     */   public void setStatoVariaz(String statoVariaz) {
/* 109 */     this.statoVariaz = statoVariaz;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/* 113 */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/* 117 */     this.datiSupl = datiSupl;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 122 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 126 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 131 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 135 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 140 */     return (new ToStringBuilder(this)).append("variazAnagrId", getVariazAnagrId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinVariazAnag.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */