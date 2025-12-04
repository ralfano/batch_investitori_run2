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
/*     */ public class FinGP
/*     */   extends FinContratto
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contrattoId;
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
/*     */   private Double saldoSottoDossier;
/*     */   private String regimeFiscale;
/*     */   private String schedaFinanziaria;
/*     */   private String bloccoOperativo;
/*     */   private Set portafoglioGP;
/*     */   private String contrattoOmbrello;
/*     */   private Integer multimandProdottoId;
/*     */   private Double perfGlobInizioMandLor;
/*     */   private Double perfGlobInizioMandNet;
/*     */   private Double perfBenchInizioGestione;
/*     */   private Double totaleInvestito;
/*     */   private Double totaleVersato;
/*     */   private Double totalePrelevato;
/*     */   
/*     */   public Double getSaldoSottoDossier() {
/* 113 */     return this.saldoSottoDossier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoSottoDossier(Double saldoSottoDossier) {
/* 120 */     this.saldoSottoDossier = saldoSottoDossier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinGP(Integer contrattoId, String tipo, Date dataVal, Date dataApertura, Date dataChiusura, Double ctvTot, Double liquidita, Double titoli, Double perfNetta, Double perfNettaTri, Double perfNettaAnn, Double perfLordaTri, Double perfLordaAnn, Double perfBcmk, Double perfBcmkTri, Double perfBcmkAnn, Double prenotateDare, Double prenotateAvere, Date dataPerf, Double navPerf, Date dataInserimento, String utenteInserimento, Set portafoglioGP) {
/* 128 */     this.contrattoId = contrattoId;
/* 129 */     this.tipo = tipo;
/* 130 */     this.dataVal = dataVal;
/*     */ 
/*     */     
/* 133 */     this.ctvTot = ctvTot;
/* 134 */     this.liquidita = liquidita;
/* 135 */     this.titoli = titoli;
/* 136 */     this.perfNetta = perfNetta;
/* 137 */     this.perfNettaTri = perfNettaTri;
/* 138 */     this.perfNettaAnn = perfNettaAnn;
/* 139 */     this.perfLordaTri = perfLordaTri;
/* 140 */     this.perfLordaAnn = perfLordaAnn;
/* 141 */     this.perfBcmk = perfBcmk;
/* 142 */     this.perfBcmkTri = perfBcmkTri;
/* 143 */     this.perfBcmkAnn = perfBcmkAnn;
/* 144 */     this.prenotateDare = prenotateDare;
/* 145 */     this.prenotateAvere = prenotateAvere;
/* 146 */     this.dataPerf = dataPerf;
/* 147 */     this.navPerf = navPerf;
/* 148 */     this.dataInserimento = dataInserimento;
/* 149 */     this.utenteInserimento = utenteInserimento;
/* 150 */     this.portafoglioGP = portafoglioGP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinGP() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContrattoId() {
/* 167 */     return this.contrattoId;
/*     */   }
/*     */   public void setContrattoId(Integer contrattoId) {
/* 170 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public String getTipo() {
/* 174 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(String tipo) {
/* 178 */     this.tipo = tipo;
/*     */   }
/*     */   
/*     */   public Date getDataVal() {
/* 182 */     return this.dataVal;
/*     */   }
/*     */   
/*     */   public void setDataVal(Date dataVal) {
/* 186 */     this.dataVal = dataVal;
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
/*     */   public Double getCtvTot() {
/* 206 */     return this.ctvTot;
/*     */   }
/*     */   
/*     */   public void setCtvTot(Double ctvTot) {
/* 210 */     this.ctvTot = ctvTot;
/*     */   }
/*     */   
/*     */   public Double getLiquidita() {
/* 214 */     return this.liquidita;
/*     */   }
/*     */   
/*     */   public void setLiquidita(Double liquidita) {
/* 218 */     this.liquidita = liquidita;
/*     */   }
/*     */   
/*     */   public Double getTitoli() {
/* 222 */     return this.titoli;
/*     */   }
/*     */   
/*     */   public void setTitoli(Double titoli) {
/* 226 */     this.titoli = titoli;
/*     */   }
/*     */   
/*     */   public Double getPerfNetta() {
/* 230 */     return this.perfNetta;
/*     */   }
/*     */   
/*     */   public void setPerfNetta(Double perfNetta) {
/* 234 */     this.perfNetta = perfNetta;
/*     */   }
/*     */   
/*     */   public Double getPerfNettaTri() {
/* 238 */     return this.perfNettaTri;
/*     */   }
/*     */   
/*     */   public void setPerfNettaTri(Double perfNettaTri) {
/* 242 */     this.perfNettaTri = perfNettaTri;
/*     */   }
/*     */   
/*     */   public Double getPerfNettaAnn() {
/* 246 */     return this.perfNettaAnn;
/*     */   }
/*     */   
/*     */   public void setPerfNettaAnn(Double perfNettaAnn) {
/* 250 */     this.perfNettaAnn = perfNettaAnn;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaTri() {
/* 254 */     return this.perfLordaTri;
/*     */   }
/*     */   
/*     */   public void setPerfLordaTri(Double perfLordaTri) {
/* 258 */     this.perfLordaTri = perfLordaTri;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaAnn() {
/* 262 */     return this.perfLordaAnn;
/*     */   }
/*     */   
/*     */   public void setPerfLordaAnn(Double perfLordaAnn) {
/* 266 */     this.perfLordaAnn = perfLordaAnn;
/*     */   }
/*     */   
/*     */   public Double getPerfBcmk() {
/* 270 */     return this.perfBcmk;
/*     */   }
/*     */   
/*     */   public void setPerfBcmk(Double perfBcmk) {
/* 274 */     this.perfBcmk = perfBcmk;
/*     */   }
/*     */   
/*     */   public Double getPerfBcmkTri() {
/* 278 */     return this.perfBcmkTri;
/*     */   }
/*     */   
/*     */   public void setPerfBcmkTri(Double perfBcmkTri) {
/* 282 */     this.perfBcmkTri = perfBcmkTri;
/*     */   }
/*     */   
/*     */   public Double getPerfBcmkAnn() {
/* 286 */     return this.perfBcmkAnn;
/*     */   }
/*     */   
/*     */   public void setPerfBcmkAnn(Double perfBcmkAnn) {
/* 290 */     this.perfBcmkAnn = perfBcmkAnn;
/*     */   }
/*     */   
/*     */   public Double getPrenotateDare() {
/* 294 */     return this.prenotateDare;
/*     */   }
/*     */   
/*     */   public void setPrenotateDare(Double prenotateDare) {
/* 298 */     this.prenotateDare = prenotateDare;
/*     */   }
/*     */   
/*     */   public Double getPrenotateAvere() {
/* 302 */     return this.prenotateAvere;
/*     */   }
/*     */   
/*     */   public void setPrenotateAvere(Double prenotateAvere) {
/* 306 */     this.prenotateAvere = prenotateAvere;
/*     */   }
/*     */   
/*     */   public Date getDataPerf() {
/* 310 */     return this.dataPerf;
/*     */   }
/*     */   
/*     */   public void setDataPerf(Date dataPerf) {
/* 314 */     this.dataPerf = dataPerf;
/*     */   }
/*     */   
/*     */   public Double getNavPerf() {
/* 318 */     return this.navPerf;
/*     */   }
/*     */   
/*     */   public void setNavPerf(Double navPerf) {
/* 322 */     this.navPerf = navPerf;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 326 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 330 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 334 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 338 */     this.utenteInserimento = utenteInserimento;
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
/*     */   public String getRegimeFiscale() {
/* 351 */     return this.regimeFiscale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRegimeFiscale(String regimeFiscale) {
/* 357 */     this.regimeFiscale = regimeFiscale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSchedaFinanziaria() {
/* 363 */     return this.schedaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSchedaFinanziaria(String schedaFinanziaria) {
/* 369 */     this.schedaFinanziaria = schedaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getPortafoglioGP() {
/* 375 */     return this.portafoglioGP;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPortafoglioGP(Set portafoglioGP) {
/* 382 */     this.portafoglioGP = portafoglioGP;
/*     */   }
/*     */   
/*     */   public String getContrattoOmbrello() {
/* 386 */     return this.contrattoOmbrello;
/*     */   }
/*     */   
/*     */   public void setContrattoOmbrello(String contrattoOmbrello) {
/* 390 */     this.contrattoOmbrello = contrattoOmbrello;
/*     */   }
/*     */   
/*     */   public Integer getMultimandProdottoId() {
/* 394 */     return this.multimandProdottoId;
/*     */   }
/*     */   
/*     */   public void setMultimandProdottoId(Integer multimandProdottoId) {
/* 398 */     this.multimandProdottoId = multimandProdottoId;
/*     */   }
/*     */   
/*     */   public Double getPerfGlobInizioMandLor() {
/* 402 */     return this.perfGlobInizioMandLor;
/*     */   }
/*     */   
/*     */   public void setPerfGlobInizioMandLor(Double perfGlobInizioMandLor) {
/* 406 */     this.perfGlobInizioMandLor = perfGlobInizioMandLor;
/*     */   }
/*     */   
/*     */   public Double getPerfGlobInizioMandNet() {
/* 410 */     return this.perfGlobInizioMandNet;
/*     */   }
/*     */   
/*     */   public void setPerfGlobInizioMandNet(Double perfGlobInizioMandNet) {
/* 414 */     this.perfGlobInizioMandNet = perfGlobInizioMandNet;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioGestione() {
/* 418 */     return this.perfBenchInizioGestione;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioGestione(Double perfBenchInizioGestione) {
/* 422 */     this.perfBenchInizioGestione = perfBenchInizioGestione;
/*     */   }
/*     */   
/*     */   public Double getTotaleInvestito() {
/* 426 */     return this.totaleInvestito;
/*     */   }
/*     */   
/*     */   public void setTotaleInvestito(Double totaleInvestito) {
/* 430 */     this.totaleInvestito = totaleInvestito;
/*     */   }
/*     */   
/*     */   public Double getTotaleVersato() {
/* 434 */     return this.totaleVersato;
/*     */   }
/*     */   
/*     */   public void setTotaleVersato(Double totaleVersato) {
/* 438 */     this.totaleVersato = totaleVersato;
/*     */   }
/*     */   
/*     */   public Double getTotalePrelevato() {
/* 442 */     return this.totalePrelevato;
/*     */   }
/*     */   
/*     */   public void setTotalePrelevato(Double totalePrelevato) {
/* 446 */     this.totalePrelevato = totalePrelevato;
/*     */   }
/*     */   
/*     */   public String getBloccoOperativo() {
/* 450 */     return this.bloccoOperativo;
/*     */   }
/*     */   
/*     */   public void setBloccoOperativo(String bloccoOperativo) {
/* 454 */     this.bloccoOperativo = bloccoOperativo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinGP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */