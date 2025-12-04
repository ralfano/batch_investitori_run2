/*     */ package it.ras.arco.bean;
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
/*     */ public class FinGPStorico
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private String tipo;
/*     */   private Date dataVal;
/*     */   private Double ctvTot;
/*     */   private Double liquidita;
/*     */   private Double titoli;
/*     */   private Double perfNetta;
/*     */   private Double perfNettaTri;
/*     */   private Double perfNettaAnn;
/*     */   private Double perfLordaTri;
/*     */   private Double perfLordaAnn;
/*     */   private Double perfBcmk;
/*     */   private Double perfBcmkTri;
/*     */   private Double perfBcmkAnn;
/*     */   private Double prenotateDare;
/*     */   private Double prenotateAvere;
/*     */   private Date dataPerf;
/*     */   private Double navPerf;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String numContratto;
/*     */   private Integer contrattoId;
/*     */   private Double saldoSottoDossier;
/*     */   private Double PerfAnnInGest;
/*     */   private Double ImpCommissione;
/*     */   private Integer GpStoricoId;
/*     */   private Date DataStorico;
/*     */   
/*     */   public FinGPStorico() {}
/*     */   
/*     */   public FinGPStorico(Double tot, Date inserimento, Date perf, Date storico, Date val, Double commissione, Double liquidita, Double perf2, Double gest, Double bcmk, Double ann, Double tri, Double ann2, Double tri2, Double netta, Double ann3, Double tri3, Double avere, Double dare, Double dossier, String tipo, Double titoli, String inserimento2) {
/* 114 */     this.ctvTot = tot;
/* 115 */     this.dataInserimento = inserimento;
/* 116 */     this.dataPerf = perf;
/* 117 */     this.DataStorico = storico;
/* 118 */     this.dataVal = val;
/* 119 */     this.ImpCommissione = commissione;
/* 120 */     this.liquidita = liquidita;
/* 121 */     this.navPerf = perf2;
/* 122 */     this.PerfAnnInGest = gest;
/* 123 */     this.perfBcmk = bcmk;
/* 124 */     this.perfBcmkAnn = ann;
/* 125 */     this.perfBcmkTri = tri;
/* 126 */     this.perfLordaAnn = ann2;
/* 127 */     this.perfLordaTri = tri2;
/* 128 */     this.perfNetta = netta;
/* 129 */     this.perfNettaAnn = ann3;
/* 130 */     this.perfNettaTri = tri3;
/* 131 */     this.prenotateAvere = avere;
/* 132 */     this.prenotateDare = dare;
/* 133 */     this.saldoSottoDossier = dossier;
/* 134 */     this.tipo = tipo;
/* 135 */     this.titoli = titoli;
/* 136 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCtvTot() {
/* 142 */     return this.ctvTot;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCtvTot(Double ctvTot) {
/* 148 */     this.ctvTot = ctvTot;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 154 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 160 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPerf() {
/* 166 */     return this.dataPerf;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPerf(Date dataPerf) {
/* 172 */     this.dataPerf = dataPerf;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataStorico() {
/* 178 */     return this.DataStorico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataStorico(Date dataStorico) {
/* 184 */     this.DataStorico = dataStorico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataVal() {
/* 190 */     return this.dataVal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataVal(Date dataVal) {
/* 196 */     this.dataVal = dataVal;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getGpStoricoId() {
/* 202 */     return this.GpStoricoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGpStoricoId(Integer gpStoricoId) {
/* 208 */     this.GpStoricoId = gpStoricoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpCommissione() {
/* 214 */     return this.ImpCommissione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImpCommissione(Double impCommissione) {
/* 220 */     this.ImpCommissione = impCommissione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getLiquidita() {
/* 226 */     return this.liquidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLiquidita(Double liquidita) {
/* 232 */     this.liquidita = liquidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getNavPerf() {
/* 238 */     return this.navPerf;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNavPerf(Double navPerf) {
/* 244 */     this.navPerf = navPerf;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfAnnInGest() {
/* 250 */     return this.PerfAnnInGest;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfAnnInGest(Double perfAnnInGest) {
/* 256 */     this.PerfAnnInGest = perfAnnInGest;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfBcmk() {
/* 262 */     return this.perfBcmk;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfBcmk(Double perfBcmk) {
/* 268 */     this.perfBcmk = perfBcmk;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfBcmkAnn() {
/* 274 */     return this.perfBcmkAnn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfBcmkAnn(Double perfBcmkAnn) {
/* 280 */     this.perfBcmkAnn = perfBcmkAnn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfBcmkTri() {
/* 286 */     return this.perfBcmkTri;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfBcmkTri(Double perfBcmkTri) {
/* 292 */     this.perfBcmkTri = perfBcmkTri;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfLordaAnn() {
/* 298 */     return this.perfLordaAnn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfLordaAnn(Double perfLordaAnn) {
/* 304 */     this.perfLordaAnn = perfLordaAnn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfLordaTri() {
/* 310 */     return this.perfLordaTri;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfLordaTri(Double perfLordaTri) {
/* 316 */     this.perfLordaTri = perfLordaTri;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfNetta() {
/* 322 */     return this.perfNetta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfNetta(Double perfNetta) {
/* 328 */     this.perfNetta = perfNetta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfNettaAnn() {
/* 334 */     return this.perfNettaAnn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfNettaAnn(Double perfNettaAnn) {
/* 340 */     this.perfNettaAnn = perfNettaAnn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerfNettaTri() {
/* 346 */     return this.perfNettaTri;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerfNettaTri(Double perfNettaTri) {
/* 352 */     this.perfNettaTri = perfNettaTri;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrenotateAvere() {
/* 358 */     return this.prenotateAvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrenotateAvere(Double prenotateAvere) {
/* 364 */     this.prenotateAvere = prenotateAvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrenotateDare() {
/* 370 */     return this.prenotateDare;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrenotateDare(Double prenotateDare) {
/* 376 */     this.prenotateDare = prenotateDare;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoSottoDossier() {
/* 382 */     return this.saldoSottoDossier;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoSottoDossier(Double saldoSottoDossier) {
/* 388 */     this.saldoSottoDossier = saldoSottoDossier;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 394 */     return this.tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipo(String tipo) {
/* 400 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getTitoli() {
/* 406 */     return this.titoli;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTitoli(Double titoli) {
/* 412 */     this.titoli = titoli;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 418 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 424 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContrattoId() {
/* 430 */     return this.contrattoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 436 */     this.contrattoId = contrattoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumContratto() {
/* 442 */     return this.numContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/* 448 */     this.numContratto = numContratto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinGPStorico.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */