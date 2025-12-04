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
/*     */ public class FlxArchivioTotRam
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoRecord;
/*     */   private String numDispArco;
/*     */   private String codiceFondo;
/*     */   private String numeroMandato;
/*     */   private String codiceIntestatarioRam;
/*     */   private String codRamo;
/*     */   private String codCompagnia;
/*     */   private String numPolizza;
/*     */   private String tipoOperazione;
/*     */   private Date dataAttivazione;
/*     */   private Double importoPrelievo;
/*     */   private Date dataPrelievo;
/*     */   private String tipoPagamento;
/*     */   private String periodicitaPrelievo;
/*     */   private String flagFineMese;
/*     */   private String codiceAbi;
/*     */   private String codiceCab;
/*     */   private String codicePaeseIban;
/*     */   private String checkDigitIban;
/*     */   private String cinIban;
/*     */   private String numeroContoCorrente;
/*     */   private String intestatContoCorrenteCodice;
/*     */   private String codiceSocieta;
/*     */   private String numeroPrelievi;
/*     */   private String statoRid;
/*     */   private Date dataPrelievoRid;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   private Double quotePrelievo;
/*     */   
/*     */   public Double getQuotePrelievo() {
/*  50 */     return this.quotePrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuotePrelievo(Double quotePrelievo) {
/*  57 */     this.quotePrelievo = quotePrelievo;
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
/*     */   public FlxArchivioTotRam() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxArchivioTotRam(Integer flxId, String tipoRecord, String numDispArco, String codiceFondo, String numeroMandato, String codiceIntestatarioRam, String codRamo, String codCompagnia, String numPolizza, String tipoOperazione, Date dataAttivazione, Double importoPrelievo, Date dataPrelievo, String tipoPagamento, String periodicitaPrelievo, String flagFineMese, String codiceAbi, String codiceCab, String codicePaeseIban, String checkDigitIban, String cinIban, String numeroContoCorrente, String intestatContoCorrenteCodice, String codiceSocieta, String numeroPrelievi, String statoRid, Date dataPrelievoRid, String statoElab, String istanza, Date dataCaricamento) {
/*  79 */     this.flxId = flxId;
/*  80 */     this.tipoRecord = tipoRecord;
/*  81 */     this.numDispArco = numDispArco;
/*  82 */     this.codiceFondo = codiceFondo;
/*  83 */     this.numeroMandato = numeroMandato;
/*  84 */     this.codiceIntestatarioRam = codiceIntestatarioRam;
/*  85 */     this.codRamo = codRamo;
/*  86 */     this.codCompagnia = codCompagnia;
/*  87 */     this.numPolizza = numPolizza;
/*  88 */     this.tipoOperazione = tipoOperazione;
/*  89 */     this.dataAttivazione = dataAttivazione;
/*  90 */     this.importoPrelievo = importoPrelievo;
/*  91 */     this.dataPrelievo = dataPrelievo;
/*  92 */     this.tipoPagamento = tipoPagamento;
/*  93 */     this.periodicitaPrelievo = periodicitaPrelievo;
/*  94 */     this.flagFineMese = flagFineMese;
/*  95 */     this.codiceAbi = codiceAbi;
/*  96 */     this.codiceCab = codiceCab;
/*  97 */     this.codicePaeseIban = codicePaeseIban;
/*  98 */     this.checkDigitIban = checkDigitIban;
/*  99 */     this.cinIban = cinIban;
/* 100 */     this.numeroContoCorrente = numeroContoCorrente;
/* 101 */     this.intestatContoCorrenteCodice = intestatContoCorrenteCodice;
/* 102 */     this.codiceSocieta = codiceSocieta;
/* 103 */     this.numeroPrelievi = numeroPrelievi;
/* 104 */     this.statoRid = statoRid;
/* 105 */     this.dataPrelievoRid = dataPrelievoRid;
/* 106 */     this.statoElab = statoElab;
/* 107 */     this.istanza = istanza;
/* 108 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCheckDigitIban() {
/* 116 */     return this.checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCheckDigitIban(String checkDigitIban) {
/* 123 */     this.checkDigitIban = checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCinIban() {
/* 130 */     return this.cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCinIban(String cinIban) {
/* 137 */     this.cinIban = cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodCompagnia() {
/* 144 */     return this.codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodCompagnia(String codCompagnia) {
/* 151 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAbi() {
/* 158 */     return this.codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbi(String codiceAbi) {
/* 165 */     this.codiceAbi = codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCab() {
/* 172 */     return this.codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCab(String codiceCab) {
/* 179 */     this.codiceCab = codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceFondo() {
/* 186 */     return this.codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFondo(String codiceFondo) {
/* 193 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntestatarioRam() {
/* 200 */     return this.codiceIntestatarioRam;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntestatarioRam(String codiceIntestatarioRam) {
/* 207 */     this.codiceIntestatarioRam = codiceIntestatarioRam;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePaeseIban() {
/* 214 */     return this.codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePaeseIban(String codicePaeseIban) {
/* 221 */     this.codicePaeseIban = codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSocieta() {
/* 228 */     return this.codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSocieta(String codiceSocieta) {
/* 235 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodRamo() {
/* 242 */     return this.codRamo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodRamo(String codRamo) {
/* 249 */     this.codRamo = codRamo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataAttivazione() {
/* 256 */     return this.dataAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataAttivazione(Date dataAttivazione) {
/* 263 */     this.dataAttivazione = dataAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 270 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 277 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPrelievo() {
/* 284 */     return this.dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPrelievo(Date dataPrelievo) {
/* 291 */     this.dataPrelievo = dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPrelievoRid() {
/* 298 */     return this.dataPrelievoRid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPrelievoRid(Date dataPrelievoRid) {
/* 305 */     this.dataPrelievoRid = dataPrelievoRid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagFineMese() {
/* 312 */     return this.flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagFineMese(String flagFineMese) {
/* 319 */     this.flagFineMese = flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 326 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 333 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoPrelievo() {
/* 340 */     return this.importoPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoPrelievo(Double importoPrelievo) {
/* 347 */     this.importoPrelievo = importoPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIntestatContoCorrenteCodice() {
/* 354 */     return this.intestatContoCorrenteCodice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIntestatContoCorrenteCodice(String intestatContoCorrenteCodice) {
/* 361 */     this.intestatContoCorrenteCodice = intestatContoCorrenteCodice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 368 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 375 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumDispArco() {
/* 382 */     return this.numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDispArco(String numDispArco) {
/* 389 */     this.numDispArco = numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContoCorrente() {
/* 396 */     return this.numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContoCorrente(String numeroContoCorrente) {
/* 403 */     this.numeroContoCorrente = numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 410 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 417 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroPrelievi() {
/* 424 */     return this.numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPrelievi(String numeroPrelievi) {
/* 431 */     this.numeroPrelievi = numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumPolizza() {
/* 438 */     return this.numPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumPolizza(String numPolizza) {
/* 445 */     this.numPolizza = numPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPeriodicitaPrelievo() {
/* 452 */     return this.periodicitaPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPeriodicitaPrelievo(String periodicitaPrelievo) {
/* 459 */     this.periodicitaPrelievo = periodicitaPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 466 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 473 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoRid() {
/* 480 */     return this.statoRid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoRid(String statoRid) {
/* 487 */     this.statoRid = statoRid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 494 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 501 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoPagamento() {
/* 508 */     return this.tipoPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoPagamento(String tipoPagamento) {
/* 515 */     this.tipoPagamento = tipoPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 522 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 529 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElaborazione() {
/* 536 */     return this.dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 543 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 550 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 557 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxArchivioTotRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */