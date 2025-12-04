/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class FinDispPagMov
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinMovimento movimento;
/*     */   private FinDispPagamento dispPagamento;
/*     */   private Integer dispPagMovId;
/*     */   
/*     */   public FinDispPagMov(Date inserimento, FinDispPagamento pagamento, FinMovimento movimento, String inserimento2) {
/*  30 */     this.dataInserimento = inserimento;
/*  31 */     this.dispPagamento = pagamento;
/*  32 */     this.movimento = movimento;
/*  33 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinDispPagMov() {}
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  42 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  46 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public FinDispPagamento getDispPagamento() {
/*  50 */     return this.dispPagamento;
/*     */   }
/*     */   
/*     */   public void setDispPagamento(FinDispPagamento dispPagamento) {
/*  54 */     this.dispPagamento = dispPagamento;
/*     */   }
/*     */   
/*     */   public FinMovimento getMovimento() {
/*  58 */     return this.movimento;
/*     */   }
/*     */   
/*     */   public void setMovimento(FinMovimento movimento) {
/*  62 */     this.movimento = movimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/*  66 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  70 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/*  74 */     return (new ToStringBuilder(this)).append("movimento", getMovimento()).append("dispPagamento", getDispPagamento()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object dispPagMov) {
/*  82 */     if (!(dispPagMov instanceof FinDispPagMov))
/*  83 */       return false; 
/*  84 */     EqualsBuilder comparator = new EqualsBuilder();
/*  85 */     FinDispPagMov dispPagMovimento = (FinDispPagMov)dispPagMov;
/*  86 */     comparator.append(this.movimento, dispPagMovimento.movimento);
/*  87 */     comparator.append(this.dispPagamento, dispPagMovimento.dispPagamento);
/*  88 */     return comparator.isEquals();
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*  92 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 3);
/*  93 */     hBuilder.append(this.movimento);
/*  94 */     hBuilder.append(this.dispPagamento);
/*  95 */     return hBuilder.toHashCode();
/*     */   }
/*     */   
/*     */   public Integer getDispPagMovId() {
/*  99 */     return this.dispPagMovId;
/*     */   }
/*     */   
/*     */   public void setDispPagMovId(Integer dispPagMovId) {
/* 103 */     this.dispPagMovId = dispPagMovId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDispPagMov.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */