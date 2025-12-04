/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class FinSottoscrServAgg
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer sottoscrServAggId;
/*     */   private FinServizioAggiuntivo servizioAggiuntivo;
/*     */   private FinSottoscrizione sottoscrizione;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinSottoscrServAgg(Integer sottoscrServAggId, FinServizioAggiuntivo servizioAggiuntivo, FinSottoscrizione sottoscrizione, Date dataInserimento, String utenteInserimento) {
/*  46 */     this.sottoscrServAggId = sottoscrServAggId;
/*  47 */     this.servizioAggiuntivo = servizioAggiuntivo;
/*  48 */     this.sottoscrizione = sottoscrizione;
/*  49 */     this.dataInserimento = dataInserimento;
/*  50 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSottoscrServAgg() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSottoscrServAggId() {
/*  64 */     return this.sottoscrServAggId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrServAggId(Integer sottoscrServAggId) {
/*  70 */     this.sottoscrServAggId = sottoscrServAggId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinServizioAggiuntivo getServizioAggiuntivo() {
/*  77 */     return this.servizioAggiuntivo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setServizioAggiuntivo(FinServizioAggiuntivo servizioAggiuntivo) {
/*  83 */     this.servizioAggiuntivo = servizioAggiuntivo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSottoscrizione getSottoscrizione() {
/*  89 */     return this.sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrizione(FinSottoscrizione sottoscrizione) {
/*  95 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 101 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 107 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 113 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 119 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 125 */     if (!(obj instanceof FinSottoscrServAgg))
/*     */     {
/* 127 */       return false;
/*     */     }
/* 129 */     if (this == obj)
/*     */     {
/* 131 */       return true;
/*     */     }
/*     */     
/* 134 */     FinSottoscrServAgg sottServAgg = (FinSottoscrServAgg)obj;
/* 135 */     EqualsBuilder comparator = new EqualsBuilder();
/*     */     
/* 137 */     if (this.servizioAggiuntivo != null) {
/* 138 */       comparator.append(this.servizioAggiuntivo, sottServAgg.servizioAggiuntivo);
/*     */     }
/* 140 */     if (this.sottoscrizione != null) {
/* 141 */       comparator.append(this.sottoscrizione, sottServAgg.sottoscrizione);
/*     */     }
/* 143 */     return comparator.isEquals();
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 148 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 37);
/*     */     
/* 150 */     if (this.servizioAggiuntivo != null) {
/* 151 */       hBuilder.append(this.servizioAggiuntivo.hashCode());
/*     */     }
/* 153 */     if (this.sottoscrizione != null) {
/* 154 */       hBuilder.append(this.sottoscrizione.hashCode());
/*     */     }
/* 156 */     return hBuilder.toHashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSottoscrServAgg.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */