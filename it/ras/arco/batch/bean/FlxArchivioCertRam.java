/*     */ package it.ras.arco.batch.bean;
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
/*     */ 
/*     */ public class FlxArchivioCertRam
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numDispArco;
/*     */   private String tipoRecord;
/*     */   private String codiceFondo;
/*     */   private String numeroMandato;
/*     */   private String numeroCertificato;
/*     */   private String codiceIntCertificato;
/*     */   private Date dataCompetenza;
/*     */   private String tipoCertificato;
/*     */   private String giacCertificato;
/*     */   private Double quoteCertificate;
/*     */   private String numPrestampato;
/*     */   private String codiceAbi;
/*     */   private String codiceCab;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxArchivioCertRam(String tipoRecord, String codiceFondo, String numeroMandato, String numeroCertificato, String codiceIntCertificato, Date dataCompetenza, String tipoCertificato, String giacCertificato, Double quoteCertificate, String numPrestampato, String codiceAbi, String codiceCab, String statoElab, String istanza, Date dataCaricamento) {
/*  40 */     this.tipoRecord = tipoRecord;
/*  41 */     this.codiceFondo = codiceFondo;
/*  42 */     this.numeroMandato = numeroMandato;
/*  43 */     this.numeroCertificato = numeroCertificato;
/*  44 */     this.codiceIntCertificato = codiceIntCertificato;
/*  45 */     this.dataCompetenza = dataCompetenza;
/*  46 */     this.tipoCertificato = tipoCertificato;
/*  47 */     this.giacCertificato = giacCertificato;
/*  48 */     this.quoteCertificate = quoteCertificate;
/*  49 */     this.numPrestampato = numPrestampato;
/*  50 */     this.codiceAbi = codiceAbi;
/*  51 */     this.codiceCab = codiceCab;
/*  52 */     this.statoElab = statoElab;
/*  53 */     this.istanza = istanza;
/*  54 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxArchivioCertRam() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAbi() {
/*  64 */     return this.codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbi(String codiceAbi) {
/*  71 */     this.codiceAbi = codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCab() {
/*  78 */     return this.codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCab(String codiceCab) {
/*  85 */     this.codiceCab = codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceFondo() {
/*  92 */     return this.codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFondo(String codiceFondo) {
/*  99 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntCertificato() {
/* 106 */     return this.codiceIntCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntCertificato(String codiceIntCertificato) {
/* 113 */     this.codiceIntCertificato = codiceIntCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 120 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 127 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCompetenza() {
/* 134 */     return this.dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 141 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElaborazione() {
/* 148 */     return this.dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 155 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 162 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 169 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 176 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 183 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGiacCertificato() {
/* 190 */     return this.giacCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGiacCertificato(String giacCertificato) {
/* 197 */     this.giacCertificato = giacCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 204 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 211 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroCertificato() {
/* 218 */     return this.numeroCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroCertificato(String numeroCertificato) {
/* 225 */     this.numeroCertificato = numeroCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 232 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 239 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumPrestampato() {
/* 246 */     return this.numPrestampato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumPrestampato(String numPrestampato) {
/* 253 */     this.numPrestampato = numPrestampato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuoteCertificate() {
/* 260 */     return this.quoteCertificate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuoteCertificate(Double quoteCertificate) {
/* 267 */     this.quoteCertificate = quoteCertificate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 274 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 281 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoCertificato() {
/* 288 */     return this.tipoCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoCertificato(String tipoCertificato) {
/* 295 */     this.tipoCertificato = tipoCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 302 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 309 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumDispArco() {
/* 316 */     return this.numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDispArco(String numDispArco) {
/* 323 */     this.numDispArco = numDispArco;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 327 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxArchivioCertRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */