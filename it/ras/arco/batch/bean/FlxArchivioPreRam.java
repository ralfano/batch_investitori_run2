/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxArchivioPreRam
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoOperazione;
/*     */   private String codiceFondo;
/*     */   private String numeroMandato;
/*     */   private String codiceIntestatarioRam;
/*     */   private String importoPrelievo;
/*     */   private Date dataPrelievo;
/*     */   private String tipoPagamento;
/*     */   private String periodicitaPrelievo;
/*     */   private String flagFineMese;
/*     */   private String codiceAbi;
/*     */   private String codiceCab;
/*     */   private String numeroContoCorrente;
/*     */   private Integer intestatContoCorrenteCodice;
/*     */   private Integer codiceSocieta;
/*     */   private Integer numeroPrelievi;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private Double quotePrelievo;
/*     */   
/*     */   public Double getQuotePrelievo() {
/*  36 */     return this.quotePrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuotePrelievo(Double quotePrelievo) {
/*  42 */     this.quotePrelievo = quotePrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxArchivioPreRam() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAbi() {
/*  54 */     return this.codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbi(String codiceAbi) {
/*  60 */     this.codiceAbi = codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCab() {
/*  66 */     return this.codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCab(String codiceCab) {
/*  72 */     this.codiceCab = codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceFondo() {
/*  78 */     return this.codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFondo(String codiceFondo) {
/*  84 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntestatarioRam() {
/*  90 */     return this.codiceIntestatarioRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntestatarioRam(String codiceIntestatarioRam) {
/*  96 */     this.codiceIntestatarioRam = codiceIntestatarioRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceSocieta() {
/* 102 */     return this.codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSocieta(Integer codiceSocieta) {
/* 108 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 114 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 120 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPrelievo() {
/* 126 */     return this.dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPrelievo(Date dataPrelievo) {
/* 132 */     this.dataPrelievo = dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagFineMese() {
/* 138 */     return this.flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagFineMese(String flagFineMese) {
/* 144 */     this.flagFineMese = flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 150 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 156 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoPrelievo() {
/* 162 */     return this.importoPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoPrelievo(String importoPrelievo) {
/* 168 */     this.importoPrelievo = importoPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getIntestatContoCorrenteCodice() {
/* 174 */     return this.intestatContoCorrenteCodice;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIntestatContoCorrenteCodice(Integer intestatContoCorrenteCodice) {
/* 180 */     this.intestatContoCorrenteCodice = intestatContoCorrenteCodice;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 186 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 192 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContoCorrente() {
/* 198 */     return this.numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContoCorrente(String numeroContoCorrente) {
/* 204 */     this.numeroContoCorrente = numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 210 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 216 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumeroPrelievi() {
/* 222 */     return this.numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPrelievi(Integer numeroPrelievi) {
/* 228 */     this.numeroPrelievi = numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPeriodicitaPrelievo() {
/* 234 */     return this.periodicitaPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPeriodicitaPrelievo(String periodicitaPrelievo) {
/* 240 */     this.periodicitaPrelievo = periodicitaPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 246 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 252 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 258 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 264 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoPagamento() {
/* 270 */     return this.tipoPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoPagamento(String tipoPagamento) {
/* 276 */     this.tipoPagamento = tipoPagamento;
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
/*     */   public FlxArchivioPreRam(String tipoOperazione, String codiceFondo, String numeroMandato, String codiceIntestatarioRam, String importoPrelievo, Date dataPrelievo, String tipoPagamento, String periodicitaPrelievo, String flagFineMese, String codiceAbi, String codiceCab, String numeroContoCorrente, Integer intestatContoCorrenteCodice, Integer codiceSocieta, Integer numeroPrelievi, String statoElab, String istanza, Date dataCaricamento) {
/* 307 */     this.tipoOperazione = tipoOperazione;
/* 308 */     this.codiceFondo = codiceFondo;
/* 309 */     this.numeroMandato = numeroMandato;
/* 310 */     this.codiceIntestatarioRam = codiceIntestatarioRam;
/* 311 */     this.importoPrelievo = importoPrelievo;
/* 312 */     this.dataPrelievo = dataPrelievo;
/* 313 */     this.tipoPagamento = tipoPagamento;
/* 314 */     this.periodicitaPrelievo = periodicitaPrelievo;
/* 315 */     this.flagFineMese = flagFineMese;
/* 316 */     this.codiceAbi = codiceAbi;
/* 317 */     this.codiceCab = codiceCab;
/* 318 */     this.numeroContoCorrente = numeroContoCorrente;
/* 319 */     this.intestatContoCorrenteCodice = intestatContoCorrenteCodice;
/* 320 */     this.codiceSocieta = codiceSocieta;
/* 321 */     this.numeroPrelievi = numeroPrelievi;
/* 322 */     this.statoElab = statoElab;
/* 323 */     this.istanza = istanza;
/* 324 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxArchivioPreRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */