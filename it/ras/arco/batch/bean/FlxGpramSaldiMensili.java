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
/*     */ 
/*     */ 
/*     */ public class FlxGpramSaldiMensili
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private Double saldoProdotto;
/*     */   private Date dataValorizzazione;
/*     */   private Double performanceNettaDaInizioTr;
/*     */   private Double performanceNettaDaInizioAn;
/*     */   private Double performanceAnnualizzataDaIn;
/*     */   private Double performanceLordaDaInizioAn;
/*     */   private Double performanceLordaDaInizioTr;
/*     */   private Date dataElaborazionePerformance;
/*     */   private Double navCalcoloPerformance;
/*     */   private Double performanceBenchInizioTrime;
/*     */   private Double performanceBenchInizioAnno;
/*     */   private Double importoCommissioniRete;
/*     */   private Double percentualeCommissioniRete;
/*     */   private Double importoCommissioniCliente;
/*     */   private String segnoNav;
/*     */   private String segnoCommissioniRete;
/*     */   private String codiceEsternoPortafoglio;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public FlxGpramSaldiMensili() {}
/*     */   
/*     */   public String getCodiceEsternoPortafoglio() {
/*  51 */     return this.codiceEsternoPortafoglio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceEsternoPortafoglio(String codiceEsternoPortafoglio) {
/*  57 */     this.codiceEsternoPortafoglio = codiceEsternoPortafoglio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  63 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  69 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/*  75 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  81 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElaborazionePerformance() {
/*  87 */     return this.dataElaborazionePerformance;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElaborazionePerformance(Date dataElaborazionePerformance) {
/*  93 */     this.dataElaborazionePerformance = dataElaborazionePerformance;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValorizzazione() {
/*  99 */     return this.dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValorizzazione(Date dataValorizzazione) {
/* 105 */     this.dataValorizzazione = dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 111 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 117 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 123 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 129 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoCommissioniCliente() {
/* 135 */     return this.importoCommissioniCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoCommissioniCliente(Double importoCommissioniCliente) {
/* 141 */     this.importoCommissioniCliente = importoCommissioniCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoCommissioniRete() {
/* 147 */     return this.importoCommissioniRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoCommissioniRete(Double importoCommissioniRete) {
/* 153 */     this.importoCommissioniRete = importoCommissioniRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 159 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 165 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getNavCalcoloPerformance() {
/* 171 */     return this.navCalcoloPerformance;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNavCalcoloPerformance(Double navCalcoloPerformance) {
/* 177 */     this.navCalcoloPerformance = navCalcoloPerformance;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroRapporto() {
/* 183 */     return this.numeroRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 189 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercentualeCommissioniRete() {
/* 195 */     return this.percentualeCommissioniRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeCommissioniRete(Double percentualeCommissioniRete) {
/* 201 */     this.percentualeCommissioniRete = percentualeCommissioniRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceAnnualizzataDaIn() {
/* 207 */     return this.performanceAnnualizzataDaIn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceAnnualizzataDaIn(Double performanceAnnualizzataDaIn) {
/* 213 */     this.performanceAnnualizzataDaIn = performanceAnnualizzataDaIn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceBenchInizioAnno() {
/* 219 */     return this.performanceBenchInizioAnno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceBenchInizioAnno(Double performanceBenchInizioAnno) {
/* 225 */     this.performanceBenchInizioAnno = performanceBenchInizioAnno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceBenchInizioTrime() {
/* 231 */     return this.performanceBenchInizioTrime;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceBenchInizioTrime(Double performanceBenchInizioTrime) {
/* 237 */     this.performanceBenchInizioTrime = performanceBenchInizioTrime;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceLordaDaInizioAn() {
/* 243 */     return this.performanceLordaDaInizioAn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceLordaDaInizioAn(Double performanceLordaDaInizioAn) {
/* 249 */     this.performanceLordaDaInizioAn = performanceLordaDaInizioAn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceLordaDaInizioTr() {
/* 255 */     return this.performanceLordaDaInizioTr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceLordaDaInizioTr(Double performanceLordaDaInizioTr) {
/* 261 */     this.performanceLordaDaInizioTr = performanceLordaDaInizioTr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceNettaDaInizioAn() {
/* 267 */     return this.performanceNettaDaInizioAn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceNettaDaInizioAn(Double performanceNettaDaInizioAn) {
/* 273 */     this.performanceNettaDaInizioAn = performanceNettaDaInizioAn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceNettaDaInizioTr() {
/* 279 */     return this.performanceNettaDaInizioTr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceNettaDaInizioTr(Double performanceNettaDaInizioTr) {
/* 285 */     this.performanceNettaDaInizioTr = performanceNettaDaInizioTr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoProdotto() {
/* 291 */     return this.saldoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoProdotto(Double saldoProdotto) {
/* 297 */     this.saldoProdotto = saldoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoCommissioniRete() {
/* 303 */     return this.segnoCommissioniRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoCommissioniRete(String segnoCommissioniRete) {
/* 309 */     this.segnoCommissioniRete = segnoCommissioniRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoNav() {
/* 315 */     return this.segnoNav;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoNav(String segnoNav) {
/* 321 */     this.segnoNav = segnoNav;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 327 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 333 */     this.statoElab = statoElab;
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
/*     */   public FlxGpramSaldiMensili(String portafoglio, Date caricamento, Date elab, Date performance, Date valorizzazione, String errore, Double cliente, Double rete, String istanza, Double performance2, String rapporto, Double rete2, Double in, Double anno, Double trime, Double an, Double tr, Double an2, Double tr2, Double prodotto, String rete3, String nav, String elab2) {
/* 362 */     this.codiceEsternoPortafoglio = portafoglio;
/* 363 */     this.dataCaricamento = caricamento;
/* 364 */     this.dataElab = elab;
/* 365 */     this.dataElaborazionePerformance = performance;
/* 366 */     this.dataValorizzazione = valorizzazione;
/* 367 */     this.descrizioneErrore = errore;
/* 368 */     this.importoCommissioniCliente = cliente;
/* 369 */     this.importoCommissioniRete = rete;
/* 370 */     this.istanza = istanza;
/* 371 */     this.navCalcoloPerformance = performance2;
/* 372 */     this.numeroRapporto = rapporto;
/* 373 */     this.percentualeCommissioniRete = rete2;
/* 374 */     this.performanceAnnualizzataDaIn = in;
/* 375 */     this.performanceBenchInizioAnno = anno;
/* 376 */     this.performanceBenchInizioTrime = trime;
/* 377 */     this.performanceLordaDaInizioAn = an;
/* 378 */     this.performanceLordaDaInizioTr = tr;
/* 379 */     this.performanceNettaDaInizioAn = an2;
/* 380 */     this.performanceNettaDaInizioTr = tr2;
/* 381 */     this.saldoProdotto = prodotto;
/* 382 */     this.segnoCommissioniRete = rete3;
/* 383 */     this.segnoNav = nav;
/* 384 */     this.statoElab = elab2;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpramSaldiMensili.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */