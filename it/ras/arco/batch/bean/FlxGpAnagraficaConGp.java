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
/*     */ public class FlxGpAnagraficaConGp
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
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/* 120 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 127 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 134 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 141 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public FlxGpAnagraficaConGp(String tipoProd, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, Date dataAperturaGpf, String codiceLinea, String descrizioneLinea, Double controvaloreNav, Double prenotateDare, Double prenotateAvere, Double perfInizioTrimestre, Double perfInizioAnno, Double perfAnnualizzataDaInizioGe, Double perfLordaInizioAnno, Double perfLordaInizioTrimestre, Date dataElabPerf, Double navCalcoloPerf, Double perfBenchInizioTrim, Double perfBenchInizioAnno, Date dataCreazione, Date dataEstinzione, String indirizzoPostale, String capPostale, String localitaPostale, String provinciaPostale, Double saldoCc, Double saldoDossier, Date dataVal, String statoElaborazione, String istanza) {
/* 145 */     this.numeroRapporto = numeroRapporto;
/* 146 */     this.codiceAgente = codiceAgente;
/* 147 */     this.codiceRete = codiceRete;
/* 148 */     this.codiceCompagnia = codiceCompagnia;
/* 149 */     this.dataAperturaGpf = dataAperturaGpf;
/* 150 */     this.codiceLinea = codiceLinea;
/* 151 */     this.descrizioneLinea = descrizioneLinea;
/* 152 */     this.controvaloreNav = controvaloreNav;
/* 153 */     this.prenotateDare = prenotateDare;
/* 154 */     this.prenotateAvere = prenotateAvere;
/* 155 */     this.perfInizioTrimestre = perfInizioTrimestre;
/* 156 */     this.perfInizioAnno = perfInizioAnno;
/* 157 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/* 158 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/* 159 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/* 160 */     this.dataElabPerf = dataElabPerf;
/* 161 */     this.navCalcoloPerf = navCalcoloPerf;
/* 162 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/* 163 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/* 164 */     this.dataCreazione = dataCreazione;
/* 165 */     this.dataEstinzione = dataEstinzione;
/* 166 */     this.indirizzoPostale = indirizzoPostale;
/* 167 */     this.capPostale = capPostale;
/* 168 */     this.localitaPostale = localitaPostale;
/* 169 */     this.provinciaPostale = provinciaPostale;
/* 170 */     this.saldoCc = saldoCc;
/* 171 */     this.saldoDossier = saldoDossier;
/* 172 */     this.dataVal = dataVal;
/* 173 */     this.statoElaborazione = statoElaborazione;
/* 174 */     this.istanza = istanza;
/* 175 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxGpAnagraficaConGp() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 183 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 187 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 191 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 195 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 199 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 203 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 207 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 211 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 215 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 219 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public Date getDataAperturaGpf() {
/* 223 */     return this.dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public void setDataAperturaGpf(Date dataAperturaGpf) {
/* 227 */     this.dataAperturaGpf = dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public String getCodiceLinea() {
/* 231 */     return this.codiceLinea;
/*     */   }
/*     */   
/*     */   public void setCodiceLinea(String codiceLinea) {
/* 235 */     this.codiceLinea = codiceLinea;
/*     */   }
/*     */   
/*     */   public String getDescrizioneLinea() {
/* 239 */     return this.descrizioneLinea;
/*     */   }
/*     */   
/*     */   public void setDescrizioneLinea(String descrizioneLinea) {
/* 243 */     this.descrizioneLinea = descrizioneLinea;
/*     */   }
/*     */   
/*     */   public Double getControvaloreNav() {
/* 247 */     return this.controvaloreNav;
/*     */   }
/*     */   
/*     */   public void setControvaloreNav(Double controvaloreNav) {
/* 251 */     this.controvaloreNav = controvaloreNav;
/*     */   }
/*     */   
/*     */   public Double getPrenotateDare() {
/* 255 */     return this.prenotateDare;
/*     */   }
/*     */   
/*     */   public void setPrenotateDare(Double prenotateDare) {
/* 259 */     this.prenotateDare = prenotateDare;
/*     */   }
/*     */   
/*     */   public Double getPrenotateAvere() {
/* 263 */     return this.prenotateAvere;
/*     */   }
/*     */   
/*     */   public void setPrenotateAvere(Double prenotateAvere) {
/* 267 */     this.prenotateAvere = prenotateAvere;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioTrimestre() {
/* 271 */     return this.perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfInizioTrimestre(Double perfInizioTrimestre) {
/* 275 */     this.perfInizioTrimestre = perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioAnno() {
/* 279 */     return this.perfInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfInizioAnno(Double perfInizioAnno) {
/* 283 */     this.perfInizioAnno = perfInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfAnnualizzataDaInizioGe() {
/* 287 */     return this.perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public void setPerfAnnualizzataDaInizioGe(Double perfAnnualizzataDaInizioGe) {
/* 291 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioAnno() {
/* 295 */     return this.perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioAnno(Double perfLordaInizioAnno) {
/* 299 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioTrimestre() {
/* 303 */     return this.perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioTrimestre(Double perfLordaInizioTrimestre) {
/* 307 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Date getDataElabPerf() {
/* 311 */     return this.dataElabPerf;
/*     */   }
/*     */   
/*     */   public void setDataElabPerf(Date dataElabPerf) {
/* 315 */     this.dataElabPerf = dataElabPerf;
/*     */   }
/*     */   
/*     */   public Double getNavCalcoloPerf() {
/* 319 */     return this.navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public void setNavCalcoloPerf(Double navCalcoloPerf) {
/* 323 */     this.navCalcoloPerf = navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioTrim() {
/* 327 */     return this.perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioTrim(Double perfBenchInizioTrim) {
/* 331 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioAnno() {
/* 335 */     return this.perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioAnno(Double perfBenchInizioAnno) {
/* 339 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public Date getDataCreazione() {
/* 343 */     return this.dataCreazione;
/*     */   }
/*     */   
/*     */   public void setDataCreazione(Date dataCreazione) {
/* 347 */     this.dataCreazione = dataCreazione;
/*     */   }
/*     */   
/*     */   public Date getDataEstinzione() {
/* 351 */     return this.dataEstinzione;
/*     */   }
/*     */   
/*     */   public void setDataEstinzione(Date dataEstinzione) {
/* 355 */     this.dataEstinzione = dataEstinzione;
/*     */   }
/*     */   
/*     */   public String getIndirizzoPostale() {
/* 359 */     return this.indirizzoPostale;
/*     */   }
/*     */   
/*     */   public void setIndirizzoPostale(String indirizzoPostale) {
/* 363 */     this.indirizzoPostale = indirizzoPostale;
/*     */   }
/*     */   
/*     */   public String getCapPostale() {
/* 367 */     return this.capPostale;
/*     */   }
/*     */   
/*     */   public void setCapPostale(String capPostale) {
/* 371 */     this.capPostale = capPostale;
/*     */   }
/*     */   
/*     */   public String getLocalitaPostale() {
/* 375 */     return this.localitaPostale;
/*     */   }
/*     */   
/*     */   public void setLocalitaPostale(String localitaPostale) {
/* 379 */     this.localitaPostale = localitaPostale;
/*     */   }
/*     */   
/*     */   public String getProvinciaPostale() {
/* 383 */     return this.provinciaPostale;
/*     */   }
/*     */   
/*     */   public void setProvinciaPostale(String provinciaPostale) {
/* 387 */     this.provinciaPostale = provinciaPostale;
/*     */   }
/*     */   
/*     */   public Double getSaldoCc() {
/* 391 */     return this.saldoCc;
/*     */   }
/*     */   
/*     */   public void setSaldoCc(Double saldoCc) {
/* 395 */     this.saldoCc = saldoCc;
/*     */   }
/*     */   
/*     */   public Double getSaldoDossier() {
/* 399 */     return this.saldoDossier;
/*     */   }
/*     */   
/*     */   public void setSaldoDossier(Double saldoDossier) {
/* 403 */     this.saldoDossier = saldoDossier;
/*     */   }
/*     */   
/*     */   public Date getDataVal() {
/* 407 */     return this.dataVal;
/*     */   }
/*     */   
/*     */   public void setDataVal(Date dataVal) {
/* 411 */     this.dataVal = dataVal;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 415 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 419 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 423 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 427 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 431 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProd() {
/* 437 */     return this.tipoProd;
/*     */   }
/*     */   
/*     */   public void setTipoProd(String tipoProd) {
/* 441 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoFabbrica() {
/* 448 */     return this.tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoFabbrica(String tipoFabbrica) {
/* 455 */     this.tipoFabbrica = tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNazione() {
/* 462 */     return this.nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazione(String nazione) {
/* 469 */     this.nazione = nazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpAnagraficaConGp.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */