/*     */ package it.ras.arco.bean;
/*     */ 
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
/*     */ public class FinAssegnazCtrPf
/*     */   implements Serializable
/*     */ {
/*     */   private Integer assegnazioneId;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String flagAttuale;
/*     */   private String flagSplit;
/*     */   private Double percRipartiz;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimentoRecord;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private FinContratto contratto;
/*     */   private FinPromotore promotore;
/*     */   private Integer promotorePrecId;
/*     */   
/*     */   public FinAssegnazCtrPf() {}
/*     */   
/*     */   public FinAssegnazCtrPf(Integer assegnazioneId) {
/*  38 */     this.assegnazioneId = assegnazioneId;
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
/*     */   public Integer getAssegnazioneId() {
/*  50 */     return this.assegnazioneId;
/*     */   }
/*     */   
/*     */   public void setAssegnazioneId(Integer assegnazioneId) {
/*  54 */     this.assegnazioneId = assegnazioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/*  61 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  65 */     this.dataInizio = dataInizio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/*  72 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  76 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagAttuale() {
/*  83 */     return this.flagAttuale;
/*     */   }
/*     */   
/*     */   public void setFlagAttuale(String flagAttuale) {
/*  87 */     this.flagAttuale = flagAttuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagSplit() {
/*  94 */     return this.flagSplit;
/*     */   }
/*     */   
/*     */   public void setFlagSplit(String flagSplit) {
/*  98 */     this.flagSplit = flagSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercRipartiz() {
/* 106 */     return this.percRipartiz;
/*     */   }
/*     */   
/*     */   public void setPercRipartiz(Double percRipartiz) {
/* 110 */     this.percRipartiz = percRipartiz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 119 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 123 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 130 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 134 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 141 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 145 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/* 152 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/* 156 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/* 163 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 167 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 174 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 178 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 185 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 189 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public FinContratto getContratto() {
/* 193 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(FinContratto contratto) {
/* 197 */     this.contratto = contratto;
/*     */   }
/*     */   
/*     */   public FinPromotore getPromotore() {
/* 201 */     return this.promotore;
/*     */   }
/*     */   
/*     */   public void setPromotore(FinPromotore promotore) {
/* 205 */     this.promotore = promotore;
/*     */   }
/*     */   
/*     */   public Integer getPromotorePrecId() {
/* 209 */     return this.promotorePrecId;
/*     */   }
/*     */   
/*     */   public void setPromotorePrecId(Integer promotorePrecId) {
/* 213 */     this.promotorePrecId = promotorePrecId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 218 */     return (new ToStringBuilder(this)).append("assegnazioneId", getAssegnazioneId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAssegnazCtrPf.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */