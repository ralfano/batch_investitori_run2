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
/*     */ public class FlxEasyPlan
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoRecord;
/*     */   private String numDispArco;
/*     */   private String tipoOperazione;
/*     */   private String numeroPosizione;
/*     */   private String numeroOperazione;
/*     */   private Double importoPrelievo;
/*     */   private Date dataPrelievo;
/*     */   private String periodicitaTrasferimento;
/*     */   private String flagFineMese;
/*     */   private String codiceRichiedenteRam;
/*     */   private Integer numeroPrelievi;
/*     */   private String tabellaPosizioni;
/*     */   private String importoInEntrata;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   private Double importoSplit;
/*     */   
/*     */   public FlxEasyPlan() {}
/*     */   
/*     */   public String getCodiceRichiedenteRam() {
/*  45 */     return this.codiceRichiedenteRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRichiedenteRam(String codiceRichiedenteRam) {
/*  51 */     this.codiceRichiedenteRam = codiceRichiedenteRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  57 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  63 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPrelievo() {
/*  69 */     return this.dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPrelievo(Date dataPrelievo) {
/*  75 */     this.dataPrelievo = dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagFineMese() {
/*  81 */     return this.flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagFineMese(String flagFineMese) {
/*  87 */     this.flagFineMese = flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  93 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  99 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoInEntrata() {
/* 105 */     return this.importoInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoInEntrata(String importoInEntrata) {
/* 111 */     this.importoInEntrata = importoInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoPrelievo() {
/* 117 */     return this.importoPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoPrelievo(Double importoPrelievo) {
/* 123 */     this.importoPrelievo = importoPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 129 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 135 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroOperazione() {
/* 141 */     return this.numeroOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroOperazione(String numeroOperazione) {
/* 147 */     this.numeroOperazione = numeroOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroPosizione() {
/* 153 */     return this.numeroPosizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPosizione(String numeroPosizione) {
/* 159 */     this.numeroPosizione = numeroPosizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumeroPrelievi() {
/* 165 */     return this.numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPrelievi(Integer numeroPrelievi) {
/* 171 */     this.numeroPrelievi = numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPeriodicitaTrasferimento() {
/* 177 */     return this.periodicitaTrasferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPeriodicitaTrasferimento(String periodicitaTrasferimento) {
/* 183 */     this.periodicitaTrasferimento = periodicitaTrasferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 189 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 195 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTabellaPosizioni() {
/* 201 */     return this.tabellaPosizioni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabellaPosizioni(String tabellaPosizioni) {
/* 207 */     this.tabellaPosizioni = tabellaPosizioni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 213 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 219 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumDispArco() {
/* 226 */     return this.numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDispArco(String numDispArco) {
/* 232 */     this.numDispArco = numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 239 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 245 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElaborazione() {
/* 252 */     return this.dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 258 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 264 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 270 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoSplit() {
/* 277 */     return this.importoSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoSplit(Double importoSplit) {
/* 284 */     this.importoSplit = importoSplit;
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
/*     */   public FlxEasyPlan(String tipoOperazione, String numeroPosizione, String numeroOperazione, Double importoPrelievo, Date dataPrelievo, String periodicitaTrasferimento, String flagFineMese, String codiceRichiedenteRam, Integer numeroPrelievi, String tabellaPosizioni, String importoInEntrata, String statoElab, String istanza, Date dataCaricamento, String numDispArco) {
/* 312 */     this.tipoOperazione = tipoOperazione;
/* 313 */     this.numeroPosizione = numeroPosizione;
/* 314 */     this.numeroOperazione = numeroOperazione;
/* 315 */     this.importoPrelievo = importoPrelievo;
/* 316 */     this.dataPrelievo = dataPrelievo;
/* 317 */     this.periodicitaTrasferimento = periodicitaTrasferimento;
/* 318 */     this.flagFineMese = flagFineMese;
/* 319 */     this.codiceRichiedenteRam = codiceRichiedenteRam;
/* 320 */     this.numeroPrelievi = numeroPrelievi;
/* 321 */     this.tabellaPosizioni = tabellaPosizioni;
/* 322 */     this.importoInEntrata = importoInEntrata;
/* 323 */     this.statoElab = statoElab;
/* 324 */     this.istanza = istanza;
/* 325 */     this.dataCaricamento = dataCaricamento;
/* 326 */     this.numDispArco = numDispArco;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxEasyPlan.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */