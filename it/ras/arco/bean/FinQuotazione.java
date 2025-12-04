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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinQuotazione
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer quotazioneId;
/*     */   private Date dataQuotazione;
/*     */   private Double quotDivisa;
/*     */   private Double quotEuro;
/*     */   private Double cambio;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinAttivitaFinanziaria attivitaFin;
/*     */   
/*     */   public FinQuotazione(FinAttivitaFinanziaria fin, Double cambio, Date inserimento, Date quotazione, Integer id, Double divisa, Double euro, String inserimento2) {
/*  51 */     this.attivitaFin = fin;
/*  52 */     this.cambio = cambio;
/*  53 */     this.dataInserimento = inserimento;
/*  54 */     this.dataQuotazione = quotazione;
/*  55 */     this.quotazioneId = id;
/*  56 */     this.quotDivisa = divisa;
/*  57 */     this.quotEuro = euro;
/*  58 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinQuotazione(FinAttivitaFinanziaria attivitaFin) {
/*  63 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinQuotazione() {}
/*     */ 
/*     */   
/*     */   public Integer getQuotazioneId() {
/*  72 */     return this.quotazioneId;
/*     */   }
/*     */   
/*     */   public void setQuotazioneId(Integer quotazioneId) {
/*  76 */     this.quotazioneId = quotazioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataQuotazione() {
/*  82 */     return this.dataQuotazione;
/*     */   }
/*     */   
/*     */   public void setDataQuotazione(Date dataQuotazione) {
/*  86 */     this.dataQuotazione = dataQuotazione;
/*     */   }
/*     */   
/*     */   public Double getQuotDivisa() {
/*  90 */     return this.quotDivisa;
/*     */   }
/*     */   
/*     */   public void setQuotDivisa(Double quotDivisa) {
/*  94 */     this.quotDivisa = quotDivisa;
/*     */   }
/*     */   
/*     */   public Double getQuotEuro() {
/*  98 */     return this.quotEuro;
/*     */   }
/*     */   
/*     */   public void setQuotEuro(Double quotEuro) {
/* 102 */     this.quotEuro = quotEuro;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 106 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 110 */     this.cambio = cambio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 118 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 122 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 128 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 132 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFin() {
/* 137 */     return this.attivitaFin;
/*     */   }
/*     */   
/*     */   public void setAttivitaFin(FinAttivitaFinanziaria attivitaFin) {
/* 141 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 145 */     return (new ToStringBuilder(this)).append("quotazioneId", getQuotazioneId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinQuotazione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */