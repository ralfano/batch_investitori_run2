/*     */ package it.ras.arco.batch.bean;
/*     */ 
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
/*     */ public class QuadSyMig
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codComparto;
/*     */   private Integer contrattoId;
/*     */   private Integer posizioneId;
/*     */   private Integer attivitaFinId;
/*     */   private String codPromotore;
/*     */   private Double posizioneQuantitaC;
/*     */   private Integer flxSaldoQuoteFis;
/*     */   private String statoRecord;
/*     */   private Integer differenzaQuote;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   
/*     */   public QuadSyMig(Integer flxId, String codComparto, Integer contrattoId, Integer posizioneId, Integer attivitaFinId, String codPromotore, Double posizioneQuantitaC, Integer flxSaldoQuoteFis, String statoRecord, Integer differenzaQuote, String userUltimaModifica, String proceduraUltimaModifica, Date dataUltimaModifica, Date dataInserimento, String flagEsistenza, String utenteInserimento, String tipoUltimaModifica) {
/*  70 */     this.flxId = flxId;
/*  71 */     this.codComparto = codComparto;
/*  72 */     this.contrattoId = contrattoId;
/*  73 */     this.posizioneId = posizioneId;
/*  74 */     this.attivitaFinId = attivitaFinId;
/*  75 */     this.codPromotore = codPromotore;
/*  76 */     this.posizioneQuantitaC = posizioneQuantitaC;
/*  77 */     this.flxSaldoQuoteFis = flxSaldoQuoteFis;
/*  78 */     this.statoRecord = statoRecord;
/*  79 */     this.differenzaQuote = differenzaQuote;
/*  80 */     this.userUltimaModifica = userUltimaModifica;
/*  81 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*  82 */     this.dataUltimaModifica = dataUltimaModifica;
/*  83 */     this.dataInserimento = dataInserimento;
/*  84 */     this.flagEsistenza = flagEsistenza;
/*  85 */     this.utenteInserimento = utenteInserimento;
/*  86 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public QuadSyMig() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  96 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 100 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getCodComparto() {
/* 104 */     return this.codComparto;
/*     */   }
/*     */   
/*     */   public void setCodComparto(String codComparto) {
/* 108 */     this.codComparto = codComparto;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/* 112 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 116 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public Integer getPosizioneId() {
/* 120 */     return this.posizioneId;
/*     */   }
/*     */   
/*     */   public void setPosizioneId(Integer posizioneId) {
/* 124 */     this.posizioneId = posizioneId;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getAttivitaFinId() {
/* 129 */     return this.attivitaFinId;
/*     */   }
/*     */   
/*     */   public void setAttivitaFinId(Integer attivitaFinId) {
/* 133 */     this.attivitaFinId = attivitaFinId;
/*     */   }
/*     */   
/*     */   public String getCodPromotore() {
/* 137 */     return this.codPromotore;
/*     */   }
/*     */   
/*     */   public void setCodPromotore(String codPromotore) {
/* 141 */     this.codPromotore = codPromotore;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getPosizioneQuantitaC() {
/* 146 */     return this.posizioneQuantitaC;
/*     */   }
/*     */   
/*     */   public void setPosizioneQuantitaC(Double posizioneQuantitaC) {
/* 150 */     this.posizioneQuantitaC = posizioneQuantitaC;
/*     */   }
/*     */   
/*     */   public Integer getFlxSaldoQuoteFis() {
/* 154 */     return this.flxSaldoQuoteFis;
/*     */   }
/*     */   
/*     */   public void setFlxSaldoQuoteFis(Integer flxSaldoQuoteFis) {
/* 158 */     this.flxSaldoQuoteFis = flxSaldoQuoteFis;
/*     */   }
/*     */   
/*     */   public String getStatoRecord() {
/* 162 */     return this.statoRecord;
/*     */   }
/*     */   
/*     */   public void setStatoRecord(String statoRecord) {
/* 166 */     this.statoRecord = statoRecord;
/*     */   }
/*     */   
/*     */   public Integer getDifferenzaQuote() {
/* 170 */     return this.differenzaQuote;
/*     */   }
/*     */   
/*     */   public void setDifferenzaQuote(Integer differenzaQuote) {
/* 174 */     this.differenzaQuote = differenzaQuote;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 178 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 182 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 186 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 190 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 194 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 198 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 202 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 206 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 210 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 214 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 218 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 222 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 226 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 230 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\QuadSyMig.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */