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
/*     */ public class FinContrattoPromotore
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contrattoPromotoreId;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String flagAttuale;
/*     */   private String flagSplit;
/*     */   private Double percRipartiz;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinContrattoBase contratto;
/*     */   private FinPromotore promotore;
/*     */   private Integer promotorePrecId;
/*     */   
/*     */   public FinContrattoPromotore() {}
/*     */   
/*     */   public FinContrattoPromotore(Integer contrattoPromotoreId) {
/*  35 */     this.contrattoPromotoreId = contrattoPromotoreId;
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
/*     */   public Integer getContrattoPromotoreId() {
/*  47 */     return this.contrattoPromotoreId;
/*     */   }
/*     */   
/*     */   public void setContrattoPromotoreId(Integer contrattoPromotoreId) {
/*  51 */     this.contrattoPromotoreId = contrattoPromotoreId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/*  58 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  62 */     this.dataInizio = dataInizio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/*  69 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  73 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagAttuale() {
/*  80 */     return this.flagAttuale;
/*     */   }
/*     */   
/*     */   public void setFlagAttuale(String flagAttuale) {
/*  84 */     this.flagAttuale = flagAttuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagSplit() {
/*  91 */     return this.flagSplit;
/*     */   }
/*     */   
/*     */   public void setFlagSplit(String flagSplit) {
/*  95 */     this.flagSplit = flagSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercRipartiz() {
/* 103 */     return this.percRipartiz;
/*     */   }
/*     */   
/*     */   public void setPercRipartiz(Double percRipartiz) {
/* 107 */     this.percRipartiz = percRipartiz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 116 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 120 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 127 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 131 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public FinContrattoBase getContratto() {
/* 135 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(FinContrattoBase contratto) {
/* 139 */     this.contratto = contratto;
/*     */   }
/*     */   
/*     */   public FinPromotore getPromotore() {
/* 143 */     return this.promotore;
/*     */   }
/*     */   
/*     */   public void setPromotore(FinPromotore promotore) {
/* 147 */     this.promotore = promotore;
/*     */   }
/*     */   
/*     */   public Integer getPromotorePrecId() {
/* 151 */     return this.promotorePrecId;
/*     */   }
/*     */   
/*     */   public void setPromotorePrecId(Integer promotorePrecId) {
/* 155 */     this.promotorePrecId = promotorePrecId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 160 */     return (new ToStringBuilder(this)).append("assegnazioneId", getContrattoPromotoreId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrattoPromotore.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */