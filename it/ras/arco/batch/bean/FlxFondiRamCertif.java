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
/*     */ 
/*     */ public class FlxFondiRamCertif
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
/*     */   public FlxFondiRamCertif(String tipoRecord, String codiceFondo, String numeroMandato, String numeroCertificato, String codiceIntCertificato, Date dataCompetenza, String tipoCertificato, String giacCertificato, Double quoteCertificate, String numPrestampato, String codiceAbi, String codiceCab, String statoElab, String istanza, Date dataCaricamento) {
/*  41 */     this.tipoRecord = tipoRecord;
/*  42 */     this.codiceFondo = codiceFondo;
/*  43 */     this.numeroMandato = numeroMandato;
/*  44 */     this.numeroCertificato = numeroCertificato;
/*  45 */     this.codiceIntCertificato = codiceIntCertificato;
/*  46 */     this.dataCompetenza = dataCompetenza;
/*  47 */     this.tipoCertificato = tipoCertificato;
/*  48 */     this.giacCertificato = giacCertificato;
/*  49 */     this.quoteCertificate = quoteCertificate;
/*  50 */     this.numPrestampato = numPrestampato;
/*  51 */     this.codiceAbi = codiceAbi;
/*  52 */     this.codiceCab = codiceCab;
/*  53 */     this.statoElab = statoElab;
/*  54 */     this.istanza = istanza;
/*  55 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxFondiRamCertif() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAbi() {
/*  65 */     return this.codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbi(String codiceAbi) {
/*  72 */     this.codiceAbi = codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCab() {
/*  79 */     return this.codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCab(String codiceCab) {
/*  86 */     this.codiceCab = codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceFondo() {
/*  93 */     return this.codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFondo(String codiceFondo) {
/* 100 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntCertificato() {
/* 107 */     return this.codiceIntCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntCertificato(String codiceIntCertificato) {
/* 114 */     this.codiceIntCertificato = codiceIntCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 121 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 128 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCompetenza() {
/* 135 */     return this.dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 142 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElaborazione() {
/* 149 */     return this.dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 156 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 163 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 170 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 177 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 184 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGiacCertificato() {
/* 191 */     return this.giacCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGiacCertificato(String giacCertificato) {
/* 198 */     this.giacCertificato = giacCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 205 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 212 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroCertificato() {
/* 219 */     return this.numeroCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroCertificato(String numeroCertificato) {
/* 226 */     this.numeroCertificato = numeroCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 233 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 240 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumPrestampato() {
/* 247 */     return this.numPrestampato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumPrestampato(String numPrestampato) {
/* 254 */     this.numPrestampato = numPrestampato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuoteCertificate() {
/* 261 */     return this.quoteCertificate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuoteCertificate(Double quoteCertificate) {
/* 268 */     this.quoteCertificate = quoteCertificate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 275 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 282 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoCertificato() {
/* 289 */     return this.tipoCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoCertificato(String tipoCertificato) {
/* 296 */     this.tipoCertificato = tipoCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 303 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 310 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumDispArco() {
/* 317 */     return this.numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDispArco(String numDispArco) {
/* 324 */     this.numDispArco = numDispArco;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 328 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxFondiRamCertif.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */