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
/*     */ public class FlxRasBankGpAnagraficaCon
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
/*     */   private String tipoProd;
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
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/* 116 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 123 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 130 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 137 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public FlxRasBankGpAnagraficaCon(String tipoProd, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, Date dataAperturaGpf, String codiceLinea, String descrizioneLinea, Double controvaloreNav, Double prenotateDare, Double prenotateAvere, Double perfInizioTrimestre, Double perfInizioAnno, Double perfAnnualizzataDaInizioGe, Double perfLordaInizioAnno, Double perfLordaInizioTrimestre, Date dataElabPerf, Double navCalcoloPerf, Double perfBenchInizioTrim, Double perfBenchInizioAnno, Date dataCreazione, Date dataEstinzione, String indirizzoPostale, String capPostale, String localitaPostale, String provinciaPostale, Double saldoCc, Double saldoDossier, Date dataVal, String statoElaborazione, String istanza) {
/* 141 */     this.numeroRapporto = numeroRapporto;
/* 142 */     this.codiceAgente = codiceAgente;
/* 143 */     this.codiceRete = codiceRete;
/* 144 */     this.codiceCompagnia = codiceCompagnia;
/* 145 */     this.dataAperturaGpf = dataAperturaGpf;
/* 146 */     this.codiceLinea = codiceLinea;
/* 147 */     this.descrizioneLinea = descrizioneLinea;
/* 148 */     this.controvaloreNav = controvaloreNav;
/* 149 */     this.prenotateDare = prenotateDare;
/* 150 */     this.prenotateAvere = prenotateAvere;
/* 151 */     this.perfInizioTrimestre = perfInizioTrimestre;
/* 152 */     this.perfInizioAnno = perfInizioAnno;
/* 153 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/* 154 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/* 155 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/* 156 */     this.dataElabPerf = dataElabPerf;
/* 157 */     this.navCalcoloPerf = navCalcoloPerf;
/* 158 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/* 159 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/* 160 */     this.dataCreazione = dataCreazione;
/* 161 */     this.dataEstinzione = dataEstinzione;
/* 162 */     this.indirizzoPostale = indirizzoPostale;
/* 163 */     this.capPostale = capPostale;
/* 164 */     this.localitaPostale = localitaPostale;
/* 165 */     this.provinciaPostale = provinciaPostale;
/* 166 */     this.saldoCc = saldoCc;
/* 167 */     this.saldoDossier = saldoDossier;
/* 168 */     this.dataVal = dataVal;
/* 169 */     this.statoElaborazione = statoElaborazione;
/* 170 */     this.istanza = istanza;
/* 171 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRasBankGpAnagraficaCon() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 179 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 183 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 187 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 191 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 195 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 199 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 203 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 207 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 211 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 215 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public Date getDataAperturaGpf() {
/* 219 */     return this.dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public void setDataAperturaGpf(Date dataAperturaGpf) {
/* 223 */     this.dataAperturaGpf = dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public String getCodiceLinea() {
/* 227 */     return this.codiceLinea;
/*     */   }
/*     */   
/*     */   public void setCodiceLinea(String codiceLinea) {
/* 231 */     this.codiceLinea = codiceLinea;
/*     */   }
/*     */   
/*     */   public String getDescrizioneLinea() {
/* 235 */     return this.descrizioneLinea;
/*     */   }
/*     */   
/*     */   public void setDescrizioneLinea(String descrizioneLinea) {
/* 239 */     this.descrizioneLinea = descrizioneLinea;
/*     */   }
/*     */   
/*     */   public Double getControvaloreNav() {
/* 243 */     return this.controvaloreNav;
/*     */   }
/*     */   
/*     */   public void setControvaloreNav(Double controvaloreNav) {
/* 247 */     this.controvaloreNav = controvaloreNav;
/*     */   }
/*     */   
/*     */   public Double getPrenotateDare() {
/* 251 */     return this.prenotateDare;
/*     */   }
/*     */   
/*     */   public void setPrenotateDare(Double prenotateDare) {
/* 255 */     this.prenotateDare = prenotateDare;
/*     */   }
/*     */   
/*     */   public Double getPrenotateAvere() {
/* 259 */     return this.prenotateAvere;
/*     */   }
/*     */   
/*     */   public void setPrenotateAvere(Double prenotateAvere) {
/* 263 */     this.prenotateAvere = prenotateAvere;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioTrimestre() {
/* 267 */     return this.perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfInizioTrimestre(Double perfInizioTrimestre) {
/* 271 */     this.perfInizioTrimestre = perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioAnno() {
/* 275 */     return this.perfInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfInizioAnno(Double perfInizioAnno) {
/* 279 */     this.perfInizioAnno = perfInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfAnnualizzataDaInizioGe() {
/* 283 */     return this.perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public void setPerfAnnualizzataDaInizioGe(Double perfAnnualizzataDaInizioGe) {
/* 287 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioAnno() {
/* 291 */     return this.perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioAnno(Double perfLordaInizioAnno) {
/* 295 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioTrimestre() {
/* 299 */     return this.perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioTrimestre(Double perfLordaInizioTrimestre) {
/* 303 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Date getDataElabPerf() {
/* 307 */     return this.dataElabPerf;
/*     */   }
/*     */   
/*     */   public void setDataElabPerf(Date dataElabPerf) {
/* 311 */     this.dataElabPerf = dataElabPerf;
/*     */   }
/*     */   
/*     */   public Double getNavCalcoloPerf() {
/* 315 */     return this.navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public void setNavCalcoloPerf(Double navCalcoloPerf) {
/* 319 */     this.navCalcoloPerf = navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioTrim() {
/* 323 */     return this.perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioTrim(Double perfBenchInizioTrim) {
/* 327 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioAnno() {
/* 331 */     return this.perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioAnno(Double perfBenchInizioAnno) {
/* 335 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public Date getDataCreazione() {
/* 339 */     return this.dataCreazione;
/*     */   }
/*     */   
/*     */   public void setDataCreazione(Date dataCreazione) {
/* 343 */     this.dataCreazione = dataCreazione;
/*     */   }
/*     */   
/*     */   public Date getDataEstinzione() {
/* 347 */     return this.dataEstinzione;
/*     */   }
/*     */   
/*     */   public void setDataEstinzione(Date dataEstinzione) {
/* 351 */     this.dataEstinzione = dataEstinzione;
/*     */   }
/*     */   
/*     */   public String getIndirizzoPostale() {
/* 355 */     return this.indirizzoPostale;
/*     */   }
/*     */   
/*     */   public void setIndirizzoPostale(String indirizzoPostale) {
/* 359 */     this.indirizzoPostale = indirizzoPostale;
/*     */   }
/*     */   
/*     */   public String getCapPostale() {
/* 363 */     return this.capPostale;
/*     */   }
/*     */   
/*     */   public void setCapPostale(String capPostale) {
/* 367 */     this.capPostale = capPostale;
/*     */   }
/*     */   
/*     */   public String getLocalitaPostale() {
/* 371 */     return this.localitaPostale;
/*     */   }
/*     */   
/*     */   public void setLocalitaPostale(String localitaPostale) {
/* 375 */     this.localitaPostale = localitaPostale;
/*     */   }
/*     */   
/*     */   public String getProvinciaPostale() {
/* 379 */     return this.provinciaPostale;
/*     */   }
/*     */   
/*     */   public void setProvinciaPostale(String provinciaPostale) {
/* 383 */     this.provinciaPostale = provinciaPostale;
/*     */   }
/*     */   
/*     */   public Double getSaldoCc() {
/* 387 */     return this.saldoCc;
/*     */   }
/*     */   
/*     */   public void setSaldoCc(Double saldoCc) {
/* 391 */     this.saldoCc = saldoCc;
/*     */   }
/*     */   
/*     */   public Double getSaldoDossier() {
/* 395 */     return this.saldoDossier;
/*     */   }
/*     */   
/*     */   public void setSaldoDossier(Double saldoDossier) {
/* 399 */     this.saldoDossier = saldoDossier;
/*     */   }
/*     */   
/*     */   public Date getDataVal() {
/* 403 */     return this.dataVal;
/*     */   }
/*     */   
/*     */   public void setDataVal(Date dataVal) {
/* 407 */     this.dataVal = dataVal;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 411 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 415 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 419 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 423 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 427 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProd() {
/* 433 */     return this.tipoProd;
/*     */   }
/*     */   
/*     */   public void setTipoProd(String tipoProd) {
/* 437 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRasBankGpAnagraficaCon.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */