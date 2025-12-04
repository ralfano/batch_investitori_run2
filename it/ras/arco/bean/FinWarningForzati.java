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
/*     */ public class FinWarningForzati
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer warningId;
/*     */   private String codiceErrore;
/*     */   private String descrizione;
/*     */   private Date dataForzatura;
/*     */   private String utenteForzatura;
/*     */   private Integer sottoscrizioneId;
/*     */   private Date dataInserimento;
/*     */   private Date dataUltimaModifica;
/*     */   private String utenteInserimento;
/*     */   private String flagEsistenza;
/*     */   private String tipoUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private String userUltimaModifica;
/*     */   
/*     */   public String getDescrizione() {
/*  58 */     return this.descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/*  64 */     this.descrizione = descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  72 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  78 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  84 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  90 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/*  96 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 102 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 108 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 114 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 120 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 126 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 132 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 138 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 144 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 150 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceErrore() {
/* 156 */     return this.codiceErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceErrore(String codiceErrore) {
/* 162 */     this.codiceErrore = codiceErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataForzatura() {
/* 168 */     return this.dataForzatura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataForzatura(Date dataForzatura) {
/* 174 */     this.dataForzatura = dataForzatura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSottoscrizioneId() {
/* 180 */     return this.sottoscrizioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrizioneId(Integer sottoscrizioneId) {
/* 186 */     this.sottoscrizioneId = sottoscrizioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getWarningId() {
/* 192 */     return this.warningId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWarningId(Integer warningId) {
/* 198 */     this.warningId = warningId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteForzatura() {
/* 204 */     return this.utenteForzatura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteForzatura(String utenteForzatura) {
/* 210 */     this.utenteForzatura = utenteForzatura;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinWarningForzati.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */