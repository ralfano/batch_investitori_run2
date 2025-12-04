/*     */ package it.ras.arco.bean.replica;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ public class ScpProdotti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer attivitaFinId;
/*     */   private Set prodottoNote;
/*     */   private String descrizione;
/*     */   private String descrizioneEmittente;
/*     */   private String areaProdottoT;
/*     */   private String sottoAreaProdottoT;
/*     */   private String areaTerzoLiv;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataUltimaModificaSlave;
/*     */   private String tipoUltimaModificaSlave;
/*     */   
/*     */   public Integer getAttivitaFinId() {
/*  32 */     return this.attivitaFinId;
/*     */   }
/*     */   public void setAttivitaFinId(Integer attivitaFinId) {
/*  35 */     this.attivitaFinId = attivitaFinId;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/*  39 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  42 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/*  45 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  48 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public Date getDataUltimaModificaSlave() {
/*  51 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/*  54 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   public String getDescrizione() {
/*  57 */     return this.descrizione;
/*     */   }
/*     */   public void setDescrizione(String descrizione) {
/*  60 */     this.descrizione = descrizione;
/*     */   }
/*     */   public String getFlagEsistenza() {
/*  63 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  66 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/*  69 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/*  72 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public String getProceduraUltimaModificaSlave() {
/*  75 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*  78 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/*  81 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/*  84 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getTipoUltimaModificaSlave() {
/*  87 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/*  90 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   public String getUserUltimaModifica() {
/*  93 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/*  96 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModificaSlave() {
/*  99 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 102 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 105 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 108 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public String getAreaProdottoT() {
/* 111 */     return this.areaProdottoT;
/*     */   }
/*     */   public void setAreaProdottoT(String areaProdottoT) {
/* 114 */     this.areaProdottoT = areaProdottoT;
/*     */   }
/*     */   public String getAreaTerzoLiv() {
/* 117 */     return this.areaTerzoLiv;
/*     */   }
/*     */   public void setAreaTerzoLiv(String areaTerzoLiv) {
/* 120 */     this.areaTerzoLiv = areaTerzoLiv;
/*     */   }
/*     */   public String getDescrizioneEmittente() {
/* 123 */     return this.descrizioneEmittente;
/*     */   }
/*     */   public void setDescrizioneEmittente(String descrizioneEmittente) {
/* 126 */     this.descrizioneEmittente = descrizioneEmittente;
/*     */   }
/*     */   public String getSottoAreaProdottoT() {
/* 129 */     return this.sottoAreaProdottoT;
/*     */   }
/*     */   public void setSottoAreaProdottoT(String sottoAreaProdottoT) {
/* 132 */     this.sottoAreaProdottoT = sottoAreaProdottoT;
/*     */   }
/*     */   public Set getProdottoNote() {
/* 135 */     return this.prodottoNote;
/*     */   }
/*     */   public void setProdottoNote(Set prodottoNote) {
/* 138 */     this.prodottoNote = prodottoNote;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\replica\ScpProdotti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */