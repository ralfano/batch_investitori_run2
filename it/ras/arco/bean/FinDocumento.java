/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
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
/*     */ public class FinDocumento
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer documentoId;
/*     */   private String dominato;
/*     */   private FinSoggetto soggetto;
/*     */   private String stato;
/*     */   private String descEnteRilascio;
/*     */   private String tipoDoc;
/*     */   private String statoVariaz;
/*     */   private String daCancellare;
/*     */   private String numeroDoc;
/*     */   private Date dataRilascio;
/*     */   private String autoritaRilasc;
/*     */   private String luogoRilascio;
/*     */   private String provRilascio;
/*     */   private String nazioneRilascio;
/*     */   private Date dataScadenza;
/*     */   private String presNote;
/*     */   private String desDatiSupl;
/*     */   private Date inizioVal;
/*     */   private Date fineVal;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinDocumento(String dominato, FinSoggetto soggetto, String stato, String tipoDoc, String statoVariaz, String daCancellare, String numeroDoc, Date dataRilascio, String autoritaRilasc, String luogoRilascio, String provRilascio, String nazioneRilascio, Date dataScadenza, String presNote, String desDatiSupl, Date inizioVal, Date fineVal, Date dataInserimento, String utenteInserimento) {
/*  79 */     this.soggetto = soggetto;
/*  80 */     this.stato = stato;
/*  81 */     this.tipoDoc = tipoDoc;
/*  82 */     this.statoVariaz = statoVariaz;
/*  83 */     this.daCancellare = daCancellare;
/*  84 */     this.numeroDoc = numeroDoc;
/*  85 */     this.dataRilascio = dataRilascio;
/*  86 */     this.autoritaRilasc = autoritaRilasc;
/*  87 */     this.luogoRilascio = luogoRilascio;
/*  88 */     this.provRilascio = provRilascio;
/*  89 */     this.nazioneRilascio = nazioneRilascio;
/*  90 */     this.dataScadenza = dataScadenza;
/*  91 */     this.presNote = presNote;
/*  92 */     this.desDatiSupl = desDatiSupl;
/*  93 */     this.inizioVal = inizioVal;
/*  94 */     this.fineVal = fineVal;
/*  95 */     this.dataInserimento = dataInserimento;
/*  96 */     this.utenteInserimento = utenteInserimento;
/*  97 */     this.dominato = dominato;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinDocumento() {}
/*     */ 
/*     */   
/*     */   public Integer getDocumentoId() {
/* 105 */     return this.documentoId;
/*     */   }
/*     */   
/*     */   public void setDocumentoId(Integer documentoId) {
/* 109 */     this.documentoId = documentoId;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 113 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 117 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public String getStato() {
/* 121 */     return this.stato;
/*     */   }
/*     */   
/*     */   public void setStato(String stato) {
/* 125 */     this.stato = stato;
/*     */   }
/*     */   
/*     */   public String getTipoDoc() {
/* 129 */     return this.tipoDoc;
/*     */   }
/*     */   
/*     */   public void setTipoDoc(String tipoDoc) {
/* 133 */     this.tipoDoc = tipoDoc;
/*     */   }
/*     */   
/*     */   public String getStatoVariaz() {
/* 137 */     return this.statoVariaz;
/*     */   }
/*     */   
/*     */   public void setStatoVariaz(String statoVariaz) {
/* 141 */     this.statoVariaz = statoVariaz;
/*     */   }
/*     */   
/*     */   public String getDaCancellare() {
/* 145 */     return this.daCancellare;
/*     */   }
/*     */   
/*     */   public void setDaCancellare(String daCancellare) {
/* 149 */     this.daCancellare = daCancellare;
/*     */   }
/*     */   
/*     */   public String getNumeroDoc() {
/* 153 */     return this.numeroDoc;
/*     */   }
/*     */   
/*     */   public void setNumeroDoc(String numeroDoc) {
/* 157 */     this.numeroDoc = numeroDoc;
/*     */   }
/*     */   
/*     */   public Date getDataRilascio() {
/* 161 */     return this.dataRilascio;
/*     */   }
/*     */   
/*     */   public void setDataRilascio(Date dataRilascio) {
/* 165 */     this.dataRilascio = dataRilascio;
/*     */   }
/*     */   
/*     */   public String getAutoritaRilasc() {
/* 169 */     return this.autoritaRilasc;
/*     */   }
/*     */   
/*     */   public void setAutoritaRilasc(String autoritaRilasc) {
/* 173 */     this.autoritaRilasc = autoritaRilasc;
/*     */   }
/*     */   
/*     */   public String getLuogoRilascio() {
/* 177 */     return this.luogoRilascio;
/*     */   }
/*     */   
/*     */   public void setLuogoRilascio(String luogoRilascio) {
/* 181 */     this.luogoRilascio = luogoRilascio;
/*     */   }
/*     */   
/*     */   public String getProvRilascio() {
/* 185 */     return this.provRilascio;
/*     */   }
/*     */   
/*     */   public void setProvRilascio(String provRilascio) {
/* 189 */     this.provRilascio = provRilascio;
/*     */   }
/*     */   
/*     */   public String getNazioneRilascio() {
/* 193 */     return this.nazioneRilascio;
/*     */   }
/*     */   
/*     */   public void setNazioneRilascio(String nazioneRilascio) {
/* 197 */     this.nazioneRilascio = nazioneRilascio;
/*     */   }
/*     */   
/*     */   public Date getDataScadenza() {
/* 201 */     return this.dataScadenza;
/*     */   }
/*     */   
/*     */   public void setDataScadenza(Date dataScadenza) {
/* 205 */     this.dataScadenza = dataScadenza;
/*     */   }
/*     */   
/*     */   public String getPresNote() {
/* 209 */     return this.presNote;
/*     */   }
/*     */   
/*     */   public void setPresNote(String presNote) {
/* 213 */     this.presNote = presNote;
/*     */   }
/*     */   
/*     */   public String getDesDatiSupl() {
/* 217 */     return this.desDatiSupl;
/*     */   }
/*     */   
/*     */   public void setDesDatiSupl(String desDatiSupl) {
/* 221 */     this.desDatiSupl = desDatiSupl;
/*     */   }
/*     */   
/*     */   public Date getInizioVal() {
/* 225 */     return this.inizioVal;
/*     */   }
/*     */   
/*     */   public void setInizioVal(Date inizioVal) {
/* 229 */     this.inizioVal = inizioVal;
/*     */   }
/*     */   
/*     */   public Date getFineVal() {
/* 233 */     return this.fineVal;
/*     */   }
/*     */   
/*     */   public void setFineVal(Date fineVal) {
/* 237 */     this.fineVal = fineVal;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 241 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 245 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 249 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 253 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getDominato() {
/* 257 */     return this.dominato;
/*     */   }
/*     */   
/*     */   public void setDominato(String dominato) {
/* 261 */     this.dominato = dominato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isEmptyForBussinessLogic() {
/* 267 */     return (new EqualsBuilder()).append(this.tipoDoc, (this.tipoDoc == null) ? null : "").append(this.numeroDoc, (this.numeroDoc == null) ? null : "").append(this.autoritaRilasc, (this.autoritaRilasc == null) ? null : "").append(this.dataRilascio, null).append(this.luogoRilascio, (this.luogoRilascio == null) ? null : "").append(this.provRilascio, (this.provRilascio == null) ? null : "").append(this.nazioneRilascio, (this.nazioneRilascio == null) ? null : "").isEquals();
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
/*     */   public String toString() {
/* 282 */     return (new ToStringBuilder(this)).append("documentoId", getDocumentoId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescEnteRilascio() {
/* 291 */     return this.descEnteRilascio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescEnteRilascio(String descEnteRilascio) {
/* 298 */     this.descEnteRilascio = descEnteRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinDocumento copyFields(FinDocumento doc) {
/* 303 */     this.tipoDoc = doc.getTipoDoc();
/* 304 */     this.statoVariaz = doc.getStatoVariaz();
/* 305 */     this.daCancellare = doc.getDaCancellare();
/* 306 */     this.numeroDoc = doc.getNumeroDoc();
/* 307 */     this.dataRilascio = doc.getDataRilascio();
/* 308 */     this.autoritaRilasc = doc.getAutoritaRilasc();
/* 309 */     this.luogoRilascio = doc.getLuogoRilascio();
/* 310 */     this.provRilascio = doc.getProvRilascio();
/* 311 */     this.nazioneRilascio = doc.getNazioneRilascio();
/* 312 */     this.dataScadenza = doc.getDataScadenza();
/* 313 */     this.presNote = doc.getPresNote();
/* 314 */     this.desDatiSupl = doc.getDesDatiSupl();
/* 315 */     this.dataInserimento = doc.getDataInserimento();
/* 316 */     this.utenteInserimento = doc.getUtenteInserimento();
/* 317 */     this.dataUltimaModificaSlave = new Date();
/* 318 */     this.flagEsistenza = "S";
/* 319 */     this.proceduraUltimaModificaSlave = doc.getProceduraUltimaModificaSlave();
/* 320 */     this.tipoUltimaModificaSlave = "U";
/* 321 */     this.userUltimaModificaSlave = doc.getUserUltimaModificaSlave();
/* 322 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDocumento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */