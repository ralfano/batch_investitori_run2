/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxInvestitoriContratto
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
/*     */   private String tipoProd;
/*     */   private String tipoFabbrica;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private Date dataAperturaGpf;
/*     */   private String codiceLinea;
/*     */   private String descrizioneLinea;
/*     */   private Double controvaloreNav;
/*     */   private Double prenotateDare;
/*     */   private Double prenotateAvere;
/*     */   private Double perfInizioTrimestre;
/*     */   private Double perfInizioAnno;
/*     */   private Double perfAnnualizzataDaInizioGe;
/*     */   private Double perfLordaInizioAnno;
/*     */   private Double perfLordaInizioTrimestre;
/*     */   private Date dataElabPerf;
/*     */   private Double navCalcoloPerf;
/*     */   private Double perfBenchInizioTrim;
/*     */   private Double perfBenchInizioAnno;
/*     */   private Date dataCreazione;
/*     */   private Date dataEstinzione;
/*     */   private String indirizzoPostale;
/*     */   private String capPostale;
/*     */   private String localitaPostale;
/*     */   private String provinciaPostale;
/*     */   private Double saldoCc;
/*     */   private Double saldoDossier;
/*     */   private Date dataVal;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private String nazione;
/*     */   private Date dataCaricamento;
/*     */   private String flagNuovoContratto;
/*     */   private String contrattoOmbrello;
/*     */   private Integer multimandProdottoId;
/*     */   private Double perfGlobInizioMandLor;
/*     */   private Double perfGlobInizioMandNet;
/*     */   private Double perfBenchInizioGestione;
/*     */   private Double totaleInvestito;
/*     */   private Double totaleVersato;
/*     */   private Double totalePrelevato;
/*     */   private String bloccoOperativo;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/* 151 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 158 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 165 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 172 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public FlxInvestitoriContratto(String tipoProd, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, Date dataAperturaGpf, String codiceLinea, String descrizioneLinea, Double controvaloreNav, Double prenotateDare, Double prenotateAvere, Double perfInizioTrimestre, Double perfInizioAnno, Double perfAnnualizzataDaInizioGe, Double perfLordaInizioAnno, Double perfLordaInizioTrimestre, Date dataElabPerf, Double navCalcoloPerf, Double perfBenchInizioTrim, Double perfBenchInizioAnno, Date dataCreazione, Date dataEstinzione, String indirizzoPostale, String capPostale, String localitaPostale, String provinciaPostale, Double saldoCc, Double saldoDossier, Date dataVal, String statoElaborazione, String istanza) {
/* 176 */     this.numeroRapporto = numeroRapporto;
/* 177 */     this.codiceAgente = codiceAgente;
/* 178 */     this.codiceRete = codiceRete;
/* 179 */     this.codiceCompagnia = codiceCompagnia;
/* 180 */     this.dataAperturaGpf = dataAperturaGpf;
/* 181 */     this.codiceLinea = codiceLinea;
/* 182 */     this.descrizioneLinea = descrizioneLinea;
/* 183 */     this.controvaloreNav = controvaloreNav;
/* 184 */     this.prenotateDare = prenotateDare;
/* 185 */     this.prenotateAvere = prenotateAvere;
/* 186 */     this.perfInizioTrimestre = perfInizioTrimestre;
/* 187 */     this.perfInizioAnno = perfInizioAnno;
/* 188 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/* 189 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/* 190 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/* 191 */     this.dataElabPerf = dataElabPerf;
/* 192 */     this.navCalcoloPerf = navCalcoloPerf;
/* 193 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/* 194 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/* 195 */     this.dataCreazione = dataCreazione;
/* 196 */     this.dataEstinzione = dataEstinzione;
/* 197 */     this.indirizzoPostale = indirizzoPostale;
/* 198 */     this.capPostale = capPostale;
/* 199 */     this.localitaPostale = localitaPostale;
/* 200 */     this.provinciaPostale = provinciaPostale;
/* 201 */     this.saldoCc = saldoCc;
/* 202 */     this.saldoDossier = saldoDossier;
/* 203 */     this.dataVal = dataVal;
/* 204 */     this.statoElaborazione = statoElaborazione;
/* 205 */     this.istanza = istanza;
/* 206 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxInvestitoriContratto() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 214 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 218 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 222 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 226 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 230 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 234 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 238 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 242 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 246 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 250 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public Date getDataAperturaGpf() {
/* 254 */     return this.dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public void setDataAperturaGpf(Date dataAperturaGpf) {
/* 258 */     this.dataAperturaGpf = dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public String getCodiceLinea() {
/* 262 */     return this.codiceLinea;
/*     */   }
/*     */   
/*     */   public void setCodiceLinea(String codiceLinea) {
/* 266 */     this.codiceLinea = codiceLinea;
/*     */   }
/*     */   
/*     */   public String getDescrizioneLinea() {
/* 270 */     return this.descrizioneLinea;
/*     */   }
/*     */   
/*     */   public void setDescrizioneLinea(String descrizioneLinea) {
/* 274 */     this.descrizioneLinea = descrizioneLinea;
/*     */   }
/*     */   
/*     */   public Double getControvaloreNav() {
/* 278 */     return this.controvaloreNav;
/*     */   }
/*     */   
/*     */   public void setControvaloreNav(Double controvaloreNav) {
/* 282 */     this.controvaloreNav = controvaloreNav;
/*     */   }
/*     */   
/*     */   public Double getPrenotateDare() {
/* 286 */     return this.prenotateDare;
/*     */   }
/*     */   
/*     */   public void setPrenotateDare(Double prenotateDare) {
/* 290 */     this.prenotateDare = prenotateDare;
/*     */   }
/*     */   
/*     */   public Double getPrenotateAvere() {
/* 294 */     return this.prenotateAvere;
/*     */   }
/*     */   
/*     */   public void setPrenotateAvere(Double prenotateAvere) {
/* 298 */     this.prenotateAvere = prenotateAvere;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioTrimestre() {
/* 302 */     return this.perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfInizioTrimestre(Double perfInizioTrimestre) {
/* 306 */     this.perfInizioTrimestre = perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioAnno() {
/* 310 */     return this.perfInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfInizioAnno(Double perfInizioAnno) {
/* 314 */     this.perfInizioAnno = perfInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfAnnualizzataDaInizioGe() {
/* 318 */     return this.perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public void setPerfAnnualizzataDaInizioGe(Double perfAnnualizzataDaInizioGe) {
/* 322 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioAnno() {
/* 326 */     return this.perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioAnno(Double perfLordaInizioAnno) {
/* 330 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioTrimestre() {
/* 334 */     return this.perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioTrimestre(Double perfLordaInizioTrimestre) {
/* 338 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Date getDataElabPerf() {
/* 342 */     return this.dataElabPerf;
/*     */   }
/*     */   
/*     */   public void setDataElabPerf(Date dataElabPerf) {
/* 346 */     this.dataElabPerf = dataElabPerf;
/*     */   }
/*     */   
/*     */   public Double getNavCalcoloPerf() {
/* 350 */     return this.navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public void setNavCalcoloPerf(Double navCalcoloPerf) {
/* 354 */     this.navCalcoloPerf = navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioTrim() {
/* 358 */     return this.perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioTrim(Double perfBenchInizioTrim) {
/* 362 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioAnno() {
/* 366 */     return this.perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioAnno(Double perfBenchInizioAnno) {
/* 370 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public Date getDataCreazione() {
/* 374 */     return this.dataCreazione;
/*     */   }
/*     */   
/*     */   public void setDataCreazione(Date dataCreazione) {
/* 378 */     this.dataCreazione = dataCreazione;
/*     */   }
/*     */   
/*     */   public Date getDataEstinzione() {
/* 382 */     return this.dataEstinzione;
/*     */   }
/*     */   
/*     */   public void setDataEstinzione(Date dataEstinzione) {
/* 386 */     this.dataEstinzione = dataEstinzione;
/*     */   }
/*     */   
/*     */   public String getIndirizzoPostale() {
/* 390 */     return this.indirizzoPostale;
/*     */   }
/*     */   
/*     */   public void setIndirizzoPostale(String indirizzoPostale) {
/* 394 */     this.indirizzoPostale = indirizzoPostale;
/*     */   }
/*     */   
/*     */   public String getCapPostale() {
/* 398 */     return this.capPostale;
/*     */   }
/*     */   
/*     */   public void setCapPostale(String capPostale) {
/* 402 */     this.capPostale = capPostale;
/*     */   }
/*     */   
/*     */   public String getLocalitaPostale() {
/* 406 */     return this.localitaPostale;
/*     */   }
/*     */   
/*     */   public void setLocalitaPostale(String localitaPostale) {
/* 410 */     this.localitaPostale = localitaPostale;
/*     */   }
/*     */   
/*     */   public String getProvinciaPostale() {
/* 414 */     return this.provinciaPostale;
/*     */   }
/*     */   
/*     */   public void setProvinciaPostale(String provinciaPostale) {
/* 418 */     this.provinciaPostale = provinciaPostale;
/*     */   }
/*     */   
/*     */   public Double getSaldoCc() {
/* 422 */     return this.saldoCc;
/*     */   }
/*     */   
/*     */   public void setSaldoCc(Double saldoCc) {
/* 426 */     this.saldoCc = saldoCc;
/*     */   }
/*     */   
/*     */   public Double getSaldoDossier() {
/* 430 */     return this.saldoDossier;
/*     */   }
/*     */   
/*     */   public void setSaldoDossier(Double saldoDossier) {
/* 434 */     this.saldoDossier = saldoDossier;
/*     */   }
/*     */   
/*     */   public Date getDataVal() {
/* 438 */     return this.dataVal;
/*     */   }
/*     */   
/*     */   public void setDataVal(Date dataVal) {
/* 442 */     this.dataVal = dataVal;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 446 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 450 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 454 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 458 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 462 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProd() {
/* 468 */     return this.tipoProd;
/*     */   }
/*     */   
/*     */   public void setTipoProd(String tipoProd) {
/* 472 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoFabbrica() {
/* 479 */     return this.tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoFabbrica(String tipoFabbrica) {
/* 486 */     this.tipoFabbrica = tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNazione() {
/* 493 */     return this.nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazione(String nazione) {
/* 500 */     this.nazione = nazione;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 504 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 508 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public String getFlagNuovoContratto() {
/* 512 */     return this.flagNuovoContratto;
/*     */   }
/*     */   
/*     */   public void setFlagNuovoContratto(String flagNuovoContratto) {
/* 516 */     this.flagNuovoContratto = flagNuovoContratto;
/*     */   }
/*     */   
/*     */   public String getContrattoOmbrello() {
/* 520 */     return this.contrattoOmbrello;
/*     */   }
/*     */   
/*     */   public void setContrattoOmbrello(String contrattoOmbrello) {
/* 524 */     this.contrattoOmbrello = contrattoOmbrello;
/*     */   }
/*     */   
/*     */   public Integer getMultimandProdottoId() {
/* 528 */     return this.multimandProdottoId;
/*     */   }
/*     */   
/*     */   public void setMultimandProdottoId(Integer multimandProdottoId) {
/* 532 */     this.multimandProdottoId = multimandProdottoId;
/*     */   }
/*     */   
/*     */   public Double getPerfGlobInizioMandLor() {
/* 536 */     return this.perfGlobInizioMandLor;
/*     */   }
/*     */   
/*     */   public void setPerfGlobInizioMandLor(Double perfGlobInizioMandLor) {
/* 540 */     this.perfGlobInizioMandLor = perfGlobInizioMandLor;
/*     */   }
/*     */   
/*     */   public Double getPerfGlobInizioMandNet() {
/* 544 */     return this.perfGlobInizioMandNet;
/*     */   }
/*     */   
/*     */   public void setPerfGlobInizioMandNet(Double perfGlobInizioMandNet) {
/* 548 */     this.perfGlobInizioMandNet = perfGlobInizioMandNet;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioGestione() {
/* 552 */     return this.perfBenchInizioGestione;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioGestione(Double perfBenchInizioGestione) {
/* 556 */     this.perfBenchInizioGestione = perfBenchInizioGestione;
/*     */   }
/*     */   
/*     */   public Double getTotaleInvestito() {
/* 560 */     return this.totaleInvestito;
/*     */   }
/*     */   
/*     */   public void setTotaleInvestito(Double totaleInvestito) {
/* 564 */     this.totaleInvestito = totaleInvestito;
/*     */   }
/*     */   
/*     */   public Double getTotaleVersato() {
/* 568 */     return this.totaleVersato;
/*     */   }
/*     */   
/*     */   public void setTotaleVersato(Double totaleVersato) {
/* 572 */     this.totaleVersato = totaleVersato;
/*     */   }
/*     */   
/*     */   public Double getTotalePrelevato() {
/* 576 */     return this.totalePrelevato;
/*     */   }
/*     */   
/*     */   public void setTotalePrelevato(Double totalePrelevato) {
/* 580 */     this.totalePrelevato = totalePrelevato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBloccoOperativo() {
/* 587 */     return this.bloccoOperativo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBloccoOperativo(String bloccoOperativo) {
/* 594 */     this.bloccoOperativo = bloccoOperativo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxInvestitoriContratto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */