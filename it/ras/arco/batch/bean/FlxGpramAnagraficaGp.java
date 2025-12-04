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
/*     */ public class FlxGpramAnagraficaGp
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
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
/* 114 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 121 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 127 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 134 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxGpramAnagraficaGp(String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, Date dataAperturaGpf, String codiceLinea, String descrizioneLinea, Double controvaloreNav, Double prenotateDare, Double prenotateAvere, Double perfInizioTrimestre, Double perfInizioAnno, Double perfAnnualizzataDaInizioGe, Double perfLordaInizioAnno, Double perfLordaInizioTrimestre, Date dataElabPerf, Double navCalcoloPerf, Double perfBenchInizioTrim, Double perfBenchInizioAnno, Date dataCreazione, Date dataEstinzione, String indirizzoPostale, String capPostale, String localitaPostale, String provinciaPostale, Double saldoCc, Double saldoDossier, Date dataVal, String statoElaborazione, String istanza) {
/* 139 */     this.numeroRapporto = numeroRapporto;
/* 140 */     this.codiceAgente = codiceAgente;
/* 141 */     this.codiceRete = codiceRete;
/* 142 */     this.codiceCompagnia = codiceCompagnia;
/* 143 */     this.dataAperturaGpf = dataAperturaGpf;
/* 144 */     this.codiceLinea = codiceLinea;
/* 145 */     this.descrizioneLinea = descrizioneLinea;
/* 146 */     this.controvaloreNav = controvaloreNav;
/* 147 */     this.prenotateDare = prenotateDare;
/* 148 */     this.prenotateAvere = prenotateAvere;
/* 149 */     this.perfInizioTrimestre = perfInizioTrimestre;
/* 150 */     this.perfInizioAnno = perfInizioAnno;
/* 151 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/* 152 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/* 153 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/* 154 */     this.dataElabPerf = dataElabPerf;
/* 155 */     this.navCalcoloPerf = navCalcoloPerf;
/* 156 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/* 157 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/* 158 */     this.dataCreazione = dataCreazione;
/* 159 */     this.dataEstinzione = dataEstinzione;
/* 160 */     this.indirizzoPostale = indirizzoPostale;
/* 161 */     this.capPostale = capPostale;
/* 162 */     this.localitaPostale = localitaPostale;
/* 163 */     this.provinciaPostale = provinciaPostale;
/* 164 */     this.saldoCc = saldoCc;
/* 165 */     this.saldoDossier = saldoDossier;
/* 166 */     this.dataVal = dataVal;
/* 167 */     this.statoElaborazione = statoElaborazione;
/* 168 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxGpramAnagraficaGp() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 176 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 180 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 184 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 188 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 192 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 196 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 200 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 204 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 208 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 212 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public Date getDataAperturaGpf() {
/* 216 */     return this.dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public void setDataAperturaGpf(Date dataAperturaGpf) {
/* 220 */     this.dataAperturaGpf = dataAperturaGpf;
/*     */   }
/*     */   
/*     */   public String getCodiceLinea() {
/* 224 */     return this.codiceLinea;
/*     */   }
/*     */   
/*     */   public void setCodiceLinea(String codiceLinea) {
/* 228 */     this.codiceLinea = codiceLinea;
/*     */   }
/*     */   
/*     */   public String getDescrizioneLinea() {
/* 232 */     return this.descrizioneLinea;
/*     */   }
/*     */   
/*     */   public void setDescrizioneLinea(String descrizioneLinea) {
/* 236 */     this.descrizioneLinea = descrizioneLinea;
/*     */   }
/*     */   
/*     */   public Double getControvaloreNav() {
/* 240 */     return this.controvaloreNav;
/*     */   }
/*     */   
/*     */   public void setControvaloreNav(Double controvaloreNav) {
/* 244 */     this.controvaloreNav = controvaloreNav;
/*     */   }
/*     */   
/*     */   public Double getPrenotateDare() {
/* 248 */     return this.prenotateDare;
/*     */   }
/*     */   
/*     */   public void setPrenotateDare(Double prenotateDare) {
/* 252 */     this.prenotateDare = prenotateDare;
/*     */   }
/*     */   
/*     */   public Double getPrenotateAvere() {
/* 256 */     return this.prenotateAvere;
/*     */   }
/*     */   
/*     */   public void setPrenotateAvere(Double prenotateAvere) {
/* 260 */     this.prenotateAvere = prenotateAvere;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioTrimestre() {
/* 264 */     return this.perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfInizioTrimestre(Double perfInizioTrimestre) {
/* 268 */     this.perfInizioTrimestre = perfInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Double getPerfInizioAnno() {
/* 272 */     return this.perfInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfInizioAnno(Double perfInizioAnno) {
/* 276 */     this.perfInizioAnno = perfInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfAnnualizzataDaInizioGe() {
/* 280 */     return this.perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public void setPerfAnnualizzataDaInizioGe(Double perfAnnualizzataDaInizioGe) {
/* 284 */     this.perfAnnualizzataDaInizioGe = perfAnnualizzataDaInizioGe;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioAnno() {
/* 288 */     return this.perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioAnno(Double perfLordaInizioAnno) {
/* 292 */     this.perfLordaInizioAnno = perfLordaInizioAnno;
/*     */   }
/*     */   
/*     */   public Double getPerfLordaInizioTrimestre() {
/* 296 */     return this.perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public void setPerfLordaInizioTrimestre(Double perfLordaInizioTrimestre) {
/* 300 */     this.perfLordaInizioTrimestre = perfLordaInizioTrimestre;
/*     */   }
/*     */   
/*     */   public Date getDataElabPerf() {
/* 304 */     return this.dataElabPerf;
/*     */   }
/*     */   
/*     */   public void setDataElabPerf(Date dataElabPerf) {
/* 308 */     this.dataElabPerf = dataElabPerf;
/*     */   }
/*     */   
/*     */   public Double getNavCalcoloPerf() {
/* 312 */     return this.navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public void setNavCalcoloPerf(Double navCalcoloPerf) {
/* 316 */     this.navCalcoloPerf = navCalcoloPerf;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioTrim() {
/* 320 */     return this.perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioTrim(Double perfBenchInizioTrim) {
/* 324 */     this.perfBenchInizioTrim = perfBenchInizioTrim;
/*     */   }
/*     */   
/*     */   public Double getPerfBenchInizioAnno() {
/* 328 */     return this.perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public void setPerfBenchInizioAnno(Double perfBenchInizioAnno) {
/* 332 */     this.perfBenchInizioAnno = perfBenchInizioAnno;
/*     */   }
/*     */   
/*     */   public Date getDataCreazione() {
/* 336 */     return this.dataCreazione;
/*     */   }
/*     */   
/*     */   public void setDataCreazione(Date dataCreazione) {
/* 340 */     this.dataCreazione = dataCreazione;
/*     */   }
/*     */   
/*     */   public Date getDataEstinzione() {
/* 344 */     return this.dataEstinzione;
/*     */   }
/*     */   
/*     */   public void setDataEstinzione(Date dataEstinzione) {
/* 348 */     this.dataEstinzione = dataEstinzione;
/*     */   }
/*     */   
/*     */   public String getIndirizzoPostale() {
/* 352 */     return this.indirizzoPostale;
/*     */   }
/*     */   
/*     */   public void setIndirizzoPostale(String indirizzoPostale) {
/* 356 */     this.indirizzoPostale = indirizzoPostale;
/*     */   }
/*     */   
/*     */   public String getCapPostale() {
/* 360 */     return this.capPostale;
/*     */   }
/*     */   
/*     */   public void setCapPostale(String capPostale) {
/* 364 */     this.capPostale = capPostale;
/*     */   }
/*     */   
/*     */   public String getLocalitaPostale() {
/* 368 */     return this.localitaPostale;
/*     */   }
/*     */   
/*     */   public void setLocalitaPostale(String localitaPostale) {
/* 372 */     this.localitaPostale = localitaPostale;
/*     */   }
/*     */   
/*     */   public String getProvinciaPostale() {
/* 376 */     return this.provinciaPostale;
/*     */   }
/*     */   
/*     */   public void setProvinciaPostale(String provinciaPostale) {
/* 380 */     this.provinciaPostale = provinciaPostale;
/*     */   }
/*     */   
/*     */   public Double getSaldoCc() {
/* 384 */     return this.saldoCc;
/*     */   }
/*     */   
/*     */   public void setSaldoCc(Double saldoCc) {
/* 388 */     this.saldoCc = saldoCc;
/*     */   }
/*     */   
/*     */   public Double getSaldoDossier() {
/* 392 */     return this.saldoDossier;
/*     */   }
/*     */   
/*     */   public void setSaldoDossier(Double saldoDossier) {
/* 396 */     this.saldoDossier = saldoDossier;
/*     */   }
/*     */   
/*     */   public Date getDataVal() {
/* 400 */     return this.dataVal;
/*     */   }
/*     */   
/*     */   public void setDataVal(Date dataVal) {
/* 404 */     this.dataVal = dataVal;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 408 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 412 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 416 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 420 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 424 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpramAnagraficaGp.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */