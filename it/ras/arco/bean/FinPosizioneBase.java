/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ public class FinPosizioneBase
/*     */   extends ArcoRasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   protected Integer posizioneId;
/*     */   protected FinAttivitaFinanziaria attivitaFin;
/*     */   protected FinContrattoBase contratto;
/*     */   protected Date dataVal;
/*     */   protected Double quantita;
/*     */   private Double qtBloccata;
/*     */   private Double numQuoteCert;
/*     */   protected Double valQuota;
/*     */   protected Double ctv;
/*     */   protected Double cambioMedio;
/*     */   protected Double impPrelevLordo;
/*     */   protected Double impVersatoLordo;
/*     */   protected Double impPlusvalLordo;
/*     */   protected Double impVersatoNetto;
/*     */   protected Double impPrelevNetto;
/*     */   protected Double impPlusvalNetto;
/*     */   private Double impGiroconLordo;
/*     */   protected Set servizioAgg;
/*     */   protected Set listaMovimenti;
/*     */   protected Double pmc;
/*     */   protected Set dettaglioPct;
/*     */   
/*     */   public FinPosizioneBase() {}
/*     */   
/*     */   public Set getDettaglioPct() {
/*  75 */     return this.dettaglioPct;
/*     */   }
/*     */   
/*     */   public void setDettaglioPct(Set dettaglioPct) {
/*  79 */     this.dettaglioPct = dettaglioPct;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizioneBase(FinAttivitaFinanziaria fin, FinContrattoBase contratto, Double medio, Integer id, Date val, Double lordo, Double lordo2, Integer id2, Double quantita) {
/*  86 */     this.attivitaFin = fin;
/*  87 */     this.cambioMedio = medio;
/*  88 */     this.dataVal = val;
/*  89 */     this.impPrelevLordo = lordo;
/*  90 */     this.impVersatoLordo = lordo2;
/*  91 */     this.posizioneId = id2;
/*  92 */     this.quantita = quantita;
/*  93 */     this.contratto = contratto;
/*     */   }
/*     */   
/*     */   public Integer getPosizioneId() {
/*  97 */     return this.posizioneId;
/*     */   }
/*     */   
/*     */   public void setPosizioneId(Integer posizioneId) {
/* 101 */     this.posizioneId = posizioneId;
/*     */   }
/*     */   
/*     */   public Date getDataVal() {
/* 105 */     return this.dataVal;
/*     */   }
/*     */   
/*     */   public void setDataVal(Date dataVal) {
/* 109 */     this.dataVal = dataVal;
/*     */   }
/*     */   
/*     */   public Double getQuantita() {
/* 113 */     return this.quantita;
/*     */   }
/*     */   
/*     */   public void setQuantita(Double quantita) {
/* 117 */     this.quantita = quantita;
/*     */   }
/*     */   
/*     */   public Double getCambioMedio() {
/* 121 */     return this.cambioMedio;
/*     */   }
/*     */   
/*     */   public void setCambioMedio(Double cambioMedio) {
/* 125 */     this.cambioMedio = cambioMedio;
/*     */   }
/*     */   
/*     */   public Double getImpVersatoLordo() {
/* 129 */     return this.impVersatoLordo;
/*     */   }
/*     */   
/*     */   public void setImpVersatoLordo(Double impVersatoLordo) {
/* 133 */     this.impVersatoLordo = impVersatoLordo;
/*     */   }
/*     */   
/*     */   public Double getImpPrelevLordo() {
/* 137 */     return this.impPrelevLordo;
/*     */   }
/*     */   
/*     */   public void setImpPrelevLordo(Double impPrelevLordo) {
/* 141 */     this.impPrelevLordo = impPrelevLordo;
/*     */   }
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFin() {
/* 145 */     return this.attivitaFin;
/*     */   }
/*     */   
/*     */   public void setAttivitaFin(FinAttivitaFinanziaria attivitaFin) {
/* 149 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContrattoBase getContratto() {
/* 156 */     return this.contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContratto(FinContrattoBase contratto) {
/* 164 */     this.contratto = contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCtv() {
/* 171 */     return this.ctv;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCtv(Double ctv) {
/* 179 */     this.ctv = ctv;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getValQuota() {
/* 186 */     return this.valQuota;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValQuota(Double valQuota) {
/* 194 */     this.valQuota = valQuota;
/*     */   }
/*     */   
/*     */   public Set getServizioAgg() {
/* 198 */     return this.servizioAgg;
/*     */   }
/*     */   
/*     */   public void setServizioAgg(Set servizioAgg) {
/* 202 */     this.servizioAgg = servizioAgg;
/*     */   }
/*     */   
/*     */   public Double getImpPlusvalLordo() {
/* 206 */     return this.impPlusvalLordo;
/*     */   }
/*     */   
/*     */   public void setImpPlusvalLordo(Double impPlusvalLordo) {
/* 210 */     this.impPlusvalLordo = impPlusvalLordo;
/*     */   }
/*     */   
/*     */   public Double getImpPrelevNetto() {
/* 214 */     return this.impPrelevNetto;
/*     */   }
/*     */   
/*     */   public void setImpPrelevNetto(Double impPrelevNetto) {
/* 218 */     this.impPrelevNetto = impPrelevNetto;
/*     */   }
/*     */   
/*     */   public Double getImpVersatoNetto() {
/* 222 */     return this.impVersatoNetto;
/*     */   }
/*     */   
/*     */   public void setImpVersatoNetto(Double impVersatoNetto) {
/* 226 */     this.impVersatoNetto = impVersatoNetto;
/*     */   }
/*     */   
/*     */   public Double getImpPlusvalNetto() {
/* 230 */     return this.impPlusvalNetto;
/*     */   }
/*     */   
/*     */   public void setImpPlusvalNetto(Double impPlusvalNetto) {
/* 234 */     this.impPlusvalNetto = impPlusvalNetto;
/*     */   }
/*     */   
/*     */   public Double getPmc() {
/* 238 */     return this.pmc;
/*     */   }
/*     */   
/*     */   public void setPmc(Double pmc) {
/* 242 */     this.pmc = pmc;
/*     */   }
/*     */   
/*     */   public Set getListaMovimenti() {
/* 246 */     return this.listaMovimenti;
/*     */   }
/*     */   
/*     */   public void setListaMovimenti(Set listaMovimenti) {
/* 250 */     this.listaMovimenti = listaMovimenti;
/*     */   }
/*     */   
/*     */   public Double getImpGiroconLordo() {
/* 254 */     return this.impGiroconLordo;
/*     */   }
/*     */   
/*     */   public void setImpGiroconLordo(Double impGiroconLordo) {
/* 258 */     this.impGiroconLordo = impGiroconLordo;
/*     */   }
/*     */   
/*     */   public Double getQtBloccata() {
/* 262 */     return this.qtBloccata;
/*     */   }
/*     */   
/*     */   public void setQtBloccata(Double qtBloccata) {
/* 266 */     this.qtBloccata = qtBloccata;
/*     */   }
/*     */   
/*     */   public Double getNumQuoteCert() {
/* 270 */     return this.numQuoteCert;
/*     */   }
/*     */   
/*     */   public void setNumQuoteCert(Double numQuoteCert) {
/* 274 */     this.numQuoteCert = numQuoteCert;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPosizioneBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */