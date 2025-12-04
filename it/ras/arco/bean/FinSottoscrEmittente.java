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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinSottoscrEmittente
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer sottoscrEmittenteId;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinEmittente emittente;
/*     */   private FinSottoscrizione sottoscrizione;
/*     */   private String flagInvio;
/*     */   private Integer numeroInvio;
/*     */   private Date dataPrimoInvio;
/*     */   private Date dataUtimoInvio;
/*     */   
/*     */   public FinSottoscrEmittente(Integer sottoscrEmittenteId, Date dataInizio, Date dataFine, Date dataInserimento, String utenteInserimento, FinEmittente emittente, FinSottoscrizione sottoscrizione) {
/*  70 */     this.sottoscrEmittenteId = sottoscrEmittenteId;
/*  71 */     this.dataInizio = dataInizio;
/*  72 */     this.dataFine = dataFine;
/*  73 */     this.dataInserimento = dataInserimento;
/*  74 */     this.utenteInserimento = utenteInserimento;
/*  75 */     this.emittente = emittente;
/*  76 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSottoscrEmittente() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/*  88 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  92 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/*  96 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 100 */     this.dataFine = dataFine;
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 144 */     return (new ToStringBuilder(this)).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 151 */     if (!(obj instanceof FinSottoscrEmittente))
/*     */     {
/* 153 */       return false;
/*     */     }
/* 155 */     if (this == obj)
/*     */     {
/* 157 */       return true;
/*     */     }
/*     */     
/* 160 */     FinSottoscrEmittente prodLinea = (FinSottoscrEmittente)obj;
/* 161 */     EqualsBuilder comparator = new EqualsBuilder();
/*     */     
/* 163 */     if (this.emittente != null) {
/* 164 */       comparator.append(this.emittente, prodLinea.emittente);
/*     */     }
/* 166 */     if (this.sottoscrizione != null) {
/* 167 */       comparator.append(this.sottoscrizione, prodLinea.sottoscrizione);
/*     */     }
/* 169 */     return comparator.isEquals();
/*     */   }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 174 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 3);
/*     */     
/* 176 */     if (this.emittente != null) {
/* 177 */       hBuilder.append(this.emittente.hashCode());
/*     */     }
/* 179 */     if (this.sottoscrizione != null) {
/* 180 */       hBuilder.append(this.sottoscrizione.hashCode());
/*     */     }
/* 182 */     return hBuilder.toHashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 191 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 200 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEmittente getEmittente() {
/* 209 */     return this.emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittente(FinEmittente emittente) {
/* 218 */     this.emittente = emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSottoscrEmittenteId() {
/* 227 */     return this.sottoscrEmittenteId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrEmittenteId(Integer sottoscrEmittenteId) {
/* 236 */     this.sottoscrEmittenteId = sottoscrEmittenteId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSottoscrizione getSottoscrizione() {
/* 245 */     return this.sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrizione(FinSottoscrizione sottoscrizione) {
/* 254 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 263 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 272 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataPrimoInvio() {
/* 277 */     return this.dataPrimoInvio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataPrimoInvio(Date dataPrimoInvio) {
/* 282 */     this.dataPrimoInvio = dataPrimoInvio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataUtimoInvio() {
/* 287 */     return this.dataUtimoInvio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataUtimoInvio(Date dataUtimoInvio) {
/* 292 */     this.dataUtimoInvio = dataUtimoInvio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlagInvio() {
/* 297 */     return this.flagInvio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlagInvio(String flagInvio) {
/* 302 */     this.flagInvio = flagInvio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumeroInvio() {
/* 307 */     return this.numeroInvio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumeroInvio(Integer numeroInvio) {
/* 312 */     this.numeroInvio = numeroInvio;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSottoscrEmittente.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */