/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxSoggettoIndirXP
/*     */ {
/*     */   private Integer soggettoXpId;
/*     */   private Integer indirizzoXpId;
/*     */   private String tipoIndirizzo;
/*     */   private String statoVariaz;
/*     */   private String flgDaCanc;
/*     */   private String presNote;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String datiSupl;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   
/*     */   public FlxSoggettoIndirXP(Date fine, Date inizio, Date inserimento, Date modifica, String supl, String esistenza, String canc, Integer id, String note, String modifica2, Integer id2, String variaz, String indirizzo, String modifica3, String modifica4, String inserimento2) {
/*  27 */     this.dataFine = fine;
/*  28 */     this.dataInizio = inizio;
/*  29 */     this.dataInserimento = inserimento;
/*  30 */     this.dataUltimaModifica = modifica;
/*  31 */     this.datiSupl = supl;
/*  32 */     this.flagEsistenza = esistenza;
/*  33 */     this.flgDaCanc = canc;
/*  34 */     this.indirizzoXpId = id;
/*  35 */     this.presNote = note;
/*  36 */     this.proceduraUltimaModifica = modifica2;
/*  37 */     this.soggettoXpId = id2;
/*  38 */     this.statoVariaz = variaz;
/*  39 */     this.tipoIndirizzo = indirizzo;
/*  40 */     this.tipoUltimaModifica = modifica3;
/*  41 */     this.userUltimaModifica = modifica4;
/*  42 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSoggettoIndirXP() {}
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/*  51 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  55 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/*  59 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  63 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/*  67 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  71 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  75 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  79 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/*  83 */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/*  87 */     this.datiSupl = datiSupl;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/*  91 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  95 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getFlgDaCanc() {
/*  99 */     return this.flgDaCanc;
/*     */   }
/*     */   
/*     */   public void setFlgDaCanc(String flgDaCanc) {
/* 103 */     this.flgDaCanc = flgDaCanc;
/*     */   }
/*     */   
/*     */   public Integer getIndirizzoXpId() {
/* 107 */     return this.indirizzoXpId;
/*     */   }
/*     */   
/*     */   public void setIndirizzoXpId(Integer indirizzoXpId) {
/* 111 */     this.indirizzoXpId = indirizzoXpId;
/*     */   }
/*     */   
/*     */   public String getPresNote() {
/* 115 */     return this.presNote;
/*     */   }
/*     */   
/*     */   public void setPresNote(String presNote) {
/* 119 */     this.presNote = presNote;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 123 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 127 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoXpId() {
/* 131 */     return this.soggettoXpId;
/*     */   }
/*     */   
/*     */   public void setSoggettoXpId(Integer soggettoXpId) {
/* 135 */     this.soggettoXpId = soggettoXpId;
/*     */   }
/*     */   
/*     */   public String getStatoVariaz() {
/* 139 */     return this.statoVariaz;
/*     */   }
/*     */   
/*     */   public void setStatoVariaz(String statoVariaz) {
/* 143 */     this.statoVariaz = statoVariaz;
/*     */   }
/*     */   
/*     */   public String getTipoIndirizzo() {
/* 147 */     return this.tipoIndirizzo;
/*     */   }
/*     */   
/*     */   public void setTipoIndirizzo(String tipoIndirizzo) {
/* 151 */     this.tipoIndirizzo = tipoIndirizzo;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 155 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 159 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 163 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 167 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 171 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 175 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSoggettoIndirXP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */