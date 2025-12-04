/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxContrattoIndirXP
/*     */ {
/*     */   private Integer contrattoId;
/*     */   private Integer indirizzoId;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String tipoIndirizzo;
/*     */   
/*     */   public FlxContrattoIndirXP(Integer id, Date fine, Date inizio, Date inserimento, Date modifica, String esistenza, Integer id2, String modifica2, String indirizzo, String modifica3, String modifica4, String inserimento2) {
/*  24 */     this.contrattoId = id;
/*  25 */     this.dataFine = fine;
/*  26 */     this.dataInizio = inizio;
/*  27 */     this.dataInserimento = inserimento;
/*  28 */     this.dataUltimaModifica = modifica;
/*  29 */     this.flagEsistenza = esistenza;
/*  30 */     this.indirizzoId = id2;
/*  31 */     this.proceduraUltimaModifica = modifica2;
/*  32 */     this.tipoIndirizzo = indirizzo;
/*  33 */     this.tipoUltimaModifica = modifica3;
/*  34 */     this.userUltimaModifica = modifica4;
/*  35 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxContrattoIndirXP() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContrattoId() {
/*  46 */     return this.contrattoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/*  51 */     this.contrattoId = contrattoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/*  56 */     return this.dataFine;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  61 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/*  66 */     return this.dataInizio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  71 */     this.dataInizio = dataInizio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  76 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  81 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  86 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  91 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/*  96 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 101 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getIndirizzoId() {
/* 106 */     return this.indirizzoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndirizzoId(Integer indirizzoId) {
/* 111 */     this.indirizzoId = indirizzoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 116 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 121 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoIndirizzo() {
/* 126 */     return this.tipoIndirizzo;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoIndirizzo(String tipoIndirizzo) {
/* 131 */     this.tipoIndirizzo = tipoIndirizzo;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 136 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 141 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 146 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 151 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 156 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 161 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxContrattoIndirXP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */