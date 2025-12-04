/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class QuadAnimaSdr
/*     */   extends RasORMBean
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
/*     */   public QuadAnimaSdr(Integer flxId, String codComparto, Integer contrattoId, Integer posizioneId, Integer attivitaFinId, String codPromotore, Double posizioneQuantitaC, Integer flxSaldoQuoteFis, String statoRecord, Integer differenzaQuote, String userUltimaModifica, String proceduraUltimaModifica, Date dataUltimaModifica, Date dataInserimento, String flagEsistenza, String utenteInserimento, String tipoUltimaModifica) {
/*  71 */     this.flxId = flxId;
/*  72 */     this.codComparto = codComparto;
/*  73 */     this.contrattoId = contrattoId;
/*  74 */     this.posizioneId = posizioneId;
/*  75 */     this.attivitaFinId = attivitaFinId;
/*  76 */     this.codPromotore = codPromotore;
/*  77 */     this.posizioneQuantitaC = posizioneQuantitaC;
/*  78 */     this.flxSaldoQuoteFis = flxSaldoQuoteFis;
/*  79 */     this.statoRecord = statoRecord;
/*  80 */     this.differenzaQuote = differenzaQuote;
/*  81 */     this.userUltimaModifica = userUltimaModifica;
/*  82 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*  83 */     this.dataUltimaModifica = dataUltimaModifica;
/*  84 */     this.dataInserimento = dataInserimento;
/*  85 */     this.flagEsistenza = flagEsistenza;
/*  86 */     this.utenteInserimento = utenteInserimento;
/*  87 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public QuadAnimaSdr() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  97 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 101 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getCodComparto() {
/* 105 */     return this.codComparto;
/*     */   }
/*     */   
/*     */   public void setCodComparto(String codComparto) {
/* 109 */     this.codComparto = codComparto;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/* 113 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 117 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public Integer getPosizioneId() {
/* 121 */     return this.posizioneId;
/*     */   }
/*     */   
/*     */   public void setPosizioneId(Integer posizioneId) {
/* 125 */     this.posizioneId = posizioneId;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getAttivitaFinId() {
/* 130 */     return this.attivitaFinId;
/*     */   }
/*     */   
/*     */   public void setAttivitaFinId(Integer attivitaFinId) {
/* 134 */     this.attivitaFinId = attivitaFinId;
/*     */   }
/*     */   
/*     */   public String getCodPromotore() {
/* 138 */     return this.codPromotore;
/*     */   }
/*     */   
/*     */   public void setCodPromotore(String codPromotore) {
/* 142 */     this.codPromotore = codPromotore;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getPosizioneQuantitaC() {
/* 147 */     return this.posizioneQuantitaC;
/*     */   }
/*     */   
/*     */   public void setPosizioneQuantitaC(Double posizioneQuantitaC) {
/* 151 */     this.posizioneQuantitaC = posizioneQuantitaC;
/*     */   }
/*     */   
/*     */   public Integer getFlxSaldoQuoteFis() {
/* 155 */     return this.flxSaldoQuoteFis;
/*     */   }
/*     */   
/*     */   public void setFlxSaldoQuoteFis(Integer flxSaldoQuoteFis) {
/* 159 */     this.flxSaldoQuoteFis = flxSaldoQuoteFis;
/*     */   }
/*     */   
/*     */   public String getStatoRecord() {
/* 163 */     return this.statoRecord;
/*     */   }
/*     */   
/*     */   public void setStatoRecord(String statoRecord) {
/* 167 */     this.statoRecord = statoRecord;
/*     */   }
/*     */   
/*     */   public Integer getDifferenzaQuote() {
/* 171 */     return this.differenzaQuote;
/*     */   }
/*     */   
/*     */   public void setDifferenzaQuote(Integer differenzaQuote) {
/* 175 */     this.differenzaQuote = differenzaQuote;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 179 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 183 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 187 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 191 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 195 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 199 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 203 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 207 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 211 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 215 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 219 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 223 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 227 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 231 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\QuadAnimaSdr.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */