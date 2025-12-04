/*     */ package it.ras.arco.bean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinPremioPolizza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer premioPolizzaId;
/*     */   private Double priPrmPag;
/*     */   private Double priPrmPagCi;
/*     */   private Double cmlPrmLr;
/*     */   private Double cmlPrmLrCi;
/*     */   private Double cmlPrmNt;
/*     */   private Double cmlPrmNtCi;
/*     */   private Double ultPrmPagLr;
/*     */   private Double ultPrmPagNt;
/*     */   private Double ultRtEmsLr;
/*     */   private Double ultRtEmsLrCi;
/*     */   private Double ultRtEmsNt;
/*     */   private Double ultRtEmsNtCi;
/*     */   private Double ultRtPagLr;
/*     */   private Double ultRtPagLrCi;
/*     */   private Double ultRtPagNt;
/*     */   private Double ultRtPagNtCi;
/*     */   private Double dirittiPerf;
/*     */   private Double dirittiQuiet;
/*     */   private Double codTassaVita;
/*     */   private Double codTassaCi;
/*     */   private Double costoComplInv;
/*     */   private Date dtUltRataPag;
/*     */   private Date dtUltRataInc;
/*     */   private Date dtProxQuiet;
/*     */   private Date dtUltRtEme;
/*     */   private Double cmbUltRataEme;
/*     */   private Double cmbUltRataPag;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Double percInvalidita;
/*     */   private String baseTecnica;
/*     */   private Double tassoTariffa;
/*     */   private Double impSovrapprezzoProf;
/*     */   private Double impSovrapprezzoSport;
/*     */   private Double impSovrapprezzoSanit;
/*     */   private Double impSovrapprezzoGener;
/*     */   private Double impPrestConcCli;
/*     */   private Double capitaleMaturatoCa;
/*     */   private Double capitaleMaturatoCu;
/*     */   private Double capitaleMaturatoCi;
/*     */   private Double capitaleDifferito;
/*     */   private Double renditaMaturataCa;
/*     */   private Double renditaMaturataCu;
/*     */   private Double renditaDifferita;
/*     */   private Double partiValuta;
/*     */   private Double prestazIniziale;
/*     */   private Double indiceInizValuta;
/*     */   private Date dataRifValuta;
/*     */   private String flagInvalidita;
/*     */   private FinPolizza polizza;
/*     */   private Double impPremioAnnuo;
/*     */   private Double impPremioUnico;
/*     */   private Double impCorrentePremiAnnui;
/*     */   private Double impCorrenteProvvAnnue;
/*     */   private Double impCapAScadenza;
/*     */   private Double impRendita;
/*     */   private Double impPremioAgg;
/*     */   private Double impPrestito;
/*     */   private Double impRiservaMat;
/*     */   private Double impCapLiquidato;
/*     */   private String divisaUic;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public Double getImpCapAScadenza() {
/* 171 */     return this.impCapAScadenza;
/*     */   }
/*     */   
/*     */   public void setImpCapAScadenza(Double impCapAScadenza) {
/* 175 */     this.impCapAScadenza = impCapAScadenza;
/*     */   }
/*     */   
/*     */   public Double getImpCapLiquidato() {
/* 179 */     return this.impCapLiquidato;
/*     */   }
/*     */   
/*     */   public void setImpCapLiquidato(Double impCapLiquidato) {
/* 183 */     this.impCapLiquidato = impCapLiquidato;
/*     */   }
/*     */   
/*     */   public Double getImpCorrentePremiAnnui() {
/* 187 */     return this.impCorrentePremiAnnui;
/*     */   }
/*     */   
/*     */   public void setImpCorrentePremiAnnui(Double impCorrentePremiAnnui) {
/* 191 */     this.impCorrentePremiAnnui = impCorrentePremiAnnui;
/*     */   }
/*     */   
/*     */   public Double getImpCorrenteProvvAnnue() {
/* 195 */     return this.impCorrenteProvvAnnue;
/*     */   }
/*     */   
/*     */   public void setImpCorrenteProvvAnnue(Double impCorrenteProvvAnnue) {
/* 199 */     this.impCorrenteProvvAnnue = impCorrenteProvvAnnue;
/*     */   }
/*     */   
/*     */   public Double getImpPremioAgg() {
/* 203 */     return this.impPremioAgg;
/*     */   }
/*     */   
/*     */   public void setImpPremioAgg(Double impPremioAgg) {
/* 207 */     this.impPremioAgg = impPremioAgg;
/*     */   }
/*     */   
/*     */   public Double getImpPremioAnnuo() {
/* 211 */     return this.impPremioAnnuo;
/*     */   }
/*     */   
/*     */   public void setImpPremioAnnuo(Double impPremioAnnuo) {
/* 215 */     this.impPremioAnnuo = impPremioAnnuo;
/*     */   }
/*     */   
/*     */   public Double getImpPremioUnico() {
/* 219 */     return this.impPremioUnico;
/*     */   }
/*     */   
/*     */   public void setImpPremioUnico(Double impPremioUnico) {
/* 223 */     this.impPremioUnico = impPremioUnico;
/*     */   }
/*     */   
/*     */   public Double getImpPrestito() {
/* 227 */     return this.impPrestito;
/*     */   }
/*     */   
/*     */   public void setImpPrestito(Double impPrestito) {
/* 231 */     this.impPrestito = impPrestito;
/*     */   }
/*     */   
/*     */   public Double getImpRendita() {
/* 235 */     return this.impRendita;
/*     */   }
/*     */   
/*     */   public void setImpRendita(Double impRendita) {
/* 239 */     this.impRendita = impRendita;
/*     */   }
/*     */   
/*     */   public Double getImpRiservaMat() {
/* 243 */     return this.impRiservaMat;
/*     */   }
/*     */   
/*     */   public void setImpRiservaMat(Double impRiservaMat) {
/* 247 */     this.impRiservaMat = impRiservaMat;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPremioPolizza(String tecnica, Double differito, Double ca, Double ci, Double cu, Double eme, Double pag, Double lr, Double ci2, Double nt, Double ci3, Double ci4, Double vita, Double inv, Date inserimento, Date valuta, Double perf, Double quiet, Date quiet2, Date inc, Date pag2, Date eme2, String invalidita, Double cli, Double gener, Double prof, Double sanit, Double sport, Double valuta2, Double valuta3, Double invalidita2, FinPolizza polizza, Integer id, Double iniziale, Double pag3, Double ci5, Double differita, Double ca2, Double cu2, Double tariffa, Double lr2, Double nt2, Double lr3, Double ci6, Double nt3, Double ci7, Double lr4, Double ci8, Double nt4, Double ci9, String inserimento2, String uic, Date elaborazione) {
/* 253 */     this.baseTecnica = tecnica;
/* 254 */     this.capitaleDifferito = differito;
/* 255 */     this.capitaleMaturatoCa = ca;
/* 256 */     this.capitaleMaturatoCi = ci;
/* 257 */     this.capitaleMaturatoCu = cu;
/* 258 */     this.cmbUltRataEme = eme;
/* 259 */     this.cmbUltRataPag = pag;
/* 260 */     this.cmlPrmLr = lr;
/* 261 */     this.cmlPrmLrCi = ci2;
/* 262 */     this.cmlPrmNt = nt;
/* 263 */     this.cmlPrmNtCi = ci3;
/* 264 */     this.codTassaCi = ci4;
/* 265 */     this.codTassaVita = vita;
/* 266 */     this.costoComplInv = inv;
/* 267 */     this.dataInserimento = inserimento;
/* 268 */     this.dataRifValuta = valuta;
/* 269 */     this.dirittiPerf = perf;
/* 270 */     this.dirittiQuiet = quiet;
/* 271 */     this.dtProxQuiet = quiet2;
/* 272 */     this.dtUltRataInc = inc;
/* 273 */     this.dtUltRataPag = pag2;
/* 274 */     this.dtUltRtEme = eme2;
/* 275 */     this.flagInvalidita = invalidita;
/* 276 */     this.impPrestConcCli = cli;
/* 277 */     this.impSovrapprezzoGener = gener;
/* 278 */     this.impSovrapprezzoProf = prof;
/* 279 */     this.impSovrapprezzoSanit = sanit;
/* 280 */     this.impSovrapprezzoSport = sport;
/* 281 */     this.indiceInizValuta = valuta2;
/* 282 */     this.partiValuta = valuta3;
/* 283 */     this.percInvalidita = invalidita2;
/* 284 */     this.polizza = polizza;
/* 285 */     this.premioPolizzaId = id;
/* 286 */     this.prestazIniziale = iniziale;
/* 287 */     this.priPrmPag = pag3;
/* 288 */     this.priPrmPagCi = ci5;
/* 289 */     this.renditaDifferita = differita;
/* 290 */     this.renditaMaturataCa = ca2;
/* 291 */     this.renditaMaturataCu = cu2;
/* 292 */     this.tassoTariffa = tariffa;
/* 293 */     this.ultPrmPagLr = lr2;
/* 294 */     this.ultPrmPagNt = nt2;
/* 295 */     this.ultRtEmsLr = lr3;
/* 296 */     this.ultRtEmsLrCi = ci6;
/* 297 */     this.ultRtEmsNt = nt3;
/* 298 */     this.ultRtEmsNtCi = ci7;
/* 299 */     this.ultRtPagLr = lr4;
/* 300 */     this.ultRtPagLrCi = ci8;
/* 301 */     this.ultRtPagNt = nt4;
/* 302 */     this.ultRtPagNtCi = ci9;
/* 303 */     this.utenteInserimento = inserimento2;
/* 304 */     this.divisaUic = uic;
/* 305 */     this.dataElaborazione = elaborazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinPremioPolizza() {}
/*     */ 
/*     */   
/*     */   public Integer getPremioPolizzaId() {
/* 313 */     return this.premioPolizzaId;
/*     */   }
/*     */   
/*     */   public void setPremioPolizzaId(Integer premioPolizzaId) {
/* 317 */     this.premioPolizzaId = premioPolizzaId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPriPrmPag() {
/* 323 */     return this.priPrmPag;
/*     */   }
/*     */   
/*     */   public void setPriPrmPag(Double priPrmPag) {
/* 327 */     this.priPrmPag = priPrmPag;
/*     */   }
/*     */   
/*     */   public Double getPriPrmPagCi() {
/* 331 */     return this.priPrmPagCi;
/*     */   }
/*     */   
/*     */   public void setPriPrmPagCi(Double priPrmPagCi) {
/* 335 */     this.priPrmPagCi = priPrmPagCi;
/*     */   }
/*     */   
/*     */   public Double getCmlPrmLr() {
/* 339 */     return this.cmlPrmLr;
/*     */   }
/*     */   
/*     */   public void setCmlPrmLr(Double cmlPrmLr) {
/* 343 */     this.cmlPrmLr = cmlPrmLr;
/*     */   }
/*     */   
/*     */   public Double getCmlPrmLrCi() {
/* 347 */     return this.cmlPrmLrCi;
/*     */   }
/*     */   
/*     */   public void setCmlPrmLrCi(Double cmlPrmLrCi) {
/* 351 */     this.cmlPrmLrCi = cmlPrmLrCi;
/*     */   }
/*     */   
/*     */   public Double getCmlPrmNt() {
/* 355 */     return this.cmlPrmNt;
/*     */   }
/*     */   
/*     */   public void setCmlPrmNt(Double cmlPrmNt) {
/* 359 */     this.cmlPrmNt = cmlPrmNt;
/*     */   }
/*     */   
/*     */   public Double getCmlPrmNtCi() {
/* 363 */     return this.cmlPrmNtCi;
/*     */   }
/*     */   
/*     */   public void setCmlPrmNtCi(Double cmlPrmNtCi) {
/* 367 */     this.cmlPrmNtCi = cmlPrmNtCi;
/*     */   }
/*     */   
/*     */   public Double getUltPrmPagLr() {
/* 371 */     return this.ultPrmPagLr;
/*     */   }
/*     */   
/*     */   public void setUltPrmPagLr(Double ultPrmPagLr) {
/* 375 */     this.ultPrmPagLr = ultPrmPagLr;
/*     */   }
/*     */   
/*     */   public Double getUltPrmPagNt() {
/* 379 */     return this.ultPrmPagNt;
/*     */   }
/*     */   
/*     */   public void setUltPrmPagNt(Double ultPrmPagNt) {
/* 383 */     this.ultPrmPagNt = ultPrmPagNt;
/*     */   }
/*     */   
/*     */   public Double getUltRtEmsLr() {
/* 387 */     return this.ultRtEmsLr;
/*     */   }
/*     */   
/*     */   public void setUltRtEmsLr(Double ultRtEmsLr) {
/* 391 */     this.ultRtEmsLr = ultRtEmsLr;
/*     */   }
/*     */   
/*     */   public Double getUltRtEmsLrCi() {
/* 395 */     return this.ultRtEmsLrCi;
/*     */   }
/*     */   
/*     */   public void setUltRtEmsLrCi(Double ultRtEmsLrCi) {
/* 399 */     this.ultRtEmsLrCi = ultRtEmsLrCi;
/*     */   }
/*     */   
/*     */   public Double getUltRtEmsNt() {
/* 403 */     return this.ultRtEmsNt;
/*     */   }
/*     */   
/*     */   public void setUltRtEmsNt(Double ultRtEmsNt) {
/* 407 */     this.ultRtEmsNt = ultRtEmsNt;
/*     */   }
/*     */   
/*     */   public Double getUltRtEmsNtCi() {
/* 411 */     return this.ultRtEmsNtCi;
/*     */   }
/*     */   
/*     */   public void setUltRtEmsNtCi(Double ultRtEmsNtCi) {
/* 415 */     this.ultRtEmsNtCi = ultRtEmsNtCi;
/*     */   }
/*     */   
/*     */   public Double getUltRtPagLr() {
/* 419 */     return this.ultRtPagLr;
/*     */   }
/*     */   
/*     */   public void setUltRtPagLr(Double ultRtPagLr) {
/* 423 */     this.ultRtPagLr = ultRtPagLr;
/*     */   }
/*     */   
/*     */   public Double getUltRtPagLrCi() {
/* 427 */     return this.ultRtPagLrCi;
/*     */   }
/*     */   
/*     */   public void setUltRtPagLrCi(Double ultRtPagLrCi) {
/* 431 */     this.ultRtPagLrCi = ultRtPagLrCi;
/*     */   }
/*     */   
/*     */   public Double getUltRtPagNt() {
/* 435 */     return this.ultRtPagNt;
/*     */   }
/*     */   
/*     */   public void setUltRtPagNt(Double ultRtPagNt) {
/* 439 */     this.ultRtPagNt = ultRtPagNt;
/*     */   }
/*     */   
/*     */   public Double getUltRtPagNtCi() {
/* 443 */     return this.ultRtPagNtCi;
/*     */   }
/*     */   
/*     */   public void setUltRtPagNtCi(Double ultRtPagNtCi) {
/* 447 */     this.ultRtPagNtCi = ultRtPagNtCi;
/*     */   }
/*     */   
/*     */   public Double getDirittiPerf() {
/* 451 */     return this.dirittiPerf;
/*     */   }
/*     */   
/*     */   public void setDirittiPerf(Double dirittiPerf) {
/* 455 */     this.dirittiPerf = dirittiPerf;
/*     */   }
/*     */   
/*     */   public Double getDirittiQuiet() {
/* 459 */     return this.dirittiQuiet;
/*     */   }
/*     */   
/*     */   public void setDirittiQuiet(Double dirittiQuiet) {
/* 463 */     this.dirittiQuiet = dirittiQuiet;
/*     */   }
/*     */   
/*     */   public Double getCodTassaVita() {
/* 467 */     return this.codTassaVita;
/*     */   }
/*     */   
/*     */   public void setCodTassaVita(Double codTassaVita) {
/* 471 */     this.codTassaVita = codTassaVita;
/*     */   }
/*     */   
/*     */   public Double getCodTassaCi() {
/* 475 */     return this.codTassaCi;
/*     */   }
/*     */   
/*     */   public void setCodTassaCi(Double codTassaCi) {
/* 479 */     this.codTassaCi = codTassaCi;
/*     */   }
/*     */   
/*     */   public Double getCostoComplInv() {
/* 483 */     return this.costoComplInv;
/*     */   }
/*     */   
/*     */   public void setCostoComplInv(Double costoComplInv) {
/* 487 */     this.costoComplInv = costoComplInv;
/*     */   }
/*     */   
/*     */   public Date getDtUltRataPag() {
/* 491 */     return this.dtUltRataPag;
/*     */   }
/*     */   
/*     */   public void setDtUltRataPag(Date dtUltRataPag) {
/* 495 */     this.dtUltRataPag = dtUltRataPag;
/*     */   }
/*     */   
/*     */   public Date getDtUltRataInc() {
/* 499 */     return this.dtUltRataInc;
/*     */   }
/*     */   
/*     */   public void setDtUltRataInc(Date dtUltRataInc) {
/* 503 */     this.dtUltRataInc = dtUltRataInc;
/*     */   }
/*     */   
/*     */   public Date getDtProxQuiet() {
/* 507 */     return this.dtProxQuiet;
/*     */   }
/*     */   
/*     */   public void setDtProxQuiet(Date dtProxQuiet) {
/* 511 */     this.dtProxQuiet = dtProxQuiet;
/*     */   }
/*     */   
/*     */   public Date getDtUltRtEme() {
/* 515 */     return this.dtUltRtEme;
/*     */   }
/*     */   
/*     */   public void setDtUltRtEme(Date dtUltRtEme) {
/* 519 */     this.dtUltRtEme = dtUltRtEme;
/*     */   }
/*     */   
/*     */   public Double getCmbUltRataEme() {
/* 523 */     return this.cmbUltRataEme;
/*     */   }
/*     */   
/*     */   public void setCmbUltRataEme(Double cmbUltRataEme) {
/* 527 */     this.cmbUltRataEme = cmbUltRataEme;
/*     */   }
/*     */   
/*     */   public Double getCmbUltRataPag() {
/* 531 */     return this.cmbUltRataPag;
/*     */   }
/*     */   
/*     */   public void setCmbUltRataPag(Double cmbUltRataPag) {
/* 535 */     this.cmbUltRataPag = cmbUltRataPag;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 542 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 546 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 550 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 554 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPolizza getPolizza() {
/* 560 */     return this.polizza;
/*     */   }
/*     */   
/*     */   public void setPolizza(FinPolizza polizza) {
/* 564 */     this.polizza = polizza;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 568 */     return (new ToStringBuilder(this)).append("premioPolizzaId", getPremioPolizzaId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagInvalidita() {
/* 574 */     return this.flagInvalidita;
/*     */   }
/*     */   
/*     */   public void setFlagInvalidita(String flagInvalidita) {
/* 578 */     this.flagInvalidita = flagInvalidita;
/*     */   }
/*     */   
/*     */   public String getBaseTecnica() {
/* 582 */     return this.baseTecnica;
/*     */   }
/*     */   
/*     */   public void setBaseTecnica(String baseTecnica) {
/* 586 */     this.baseTecnica = baseTecnica;
/*     */   }
/*     */   
/*     */   public Double getCapitaleDifferito() {
/* 590 */     return this.capitaleDifferito;
/*     */   }
/*     */   
/*     */   public void setCapitaleDifferito(Double capitaleDifferito) {
/* 594 */     this.capitaleDifferito = capitaleDifferito;
/*     */   }
/*     */   
/*     */   public Double getCapitaleMaturatoCa() {
/* 598 */     return this.capitaleMaturatoCa;
/*     */   }
/*     */   
/*     */   public void setCapitaleMaturatoCa(Double capitaleMaturatoCa) {
/* 602 */     this.capitaleMaturatoCa = capitaleMaturatoCa;
/*     */   }
/*     */   
/*     */   public Double getCapitaleMaturatoCi() {
/* 606 */     return this.capitaleMaturatoCi;
/*     */   }
/*     */   
/*     */   public void setCapitaleMaturatoCi(Double capitaleMaturatoCi) {
/* 610 */     this.capitaleMaturatoCi = capitaleMaturatoCi;
/*     */   }
/*     */   
/*     */   public Double getCapitaleMaturatoCu() {
/* 614 */     return this.capitaleMaturatoCu;
/*     */   }
/*     */   
/*     */   public void setCapitaleMaturatoCu(Double capitaleMaturatoCu) {
/* 618 */     this.capitaleMaturatoCu = capitaleMaturatoCu;
/*     */   }
/*     */   
/*     */   public Date getDataRifValuta() {
/* 622 */     return this.dataRifValuta;
/*     */   }
/*     */   
/*     */   public void setDataRifValuta(Date dataRifValuta) {
/* 626 */     this.dataRifValuta = dataRifValuta;
/*     */   }
/*     */   
/*     */   public Double getImpPrestConcCli() {
/* 630 */     return this.impPrestConcCli;
/*     */   }
/*     */   
/*     */   public void setImpPrestConcCli(Double impPrestConcCli) {
/* 634 */     this.impPrestConcCli = impPrestConcCli;
/*     */   }
/*     */   
/*     */   public Double getImpSovrapprezzoGener() {
/* 638 */     return this.impSovrapprezzoGener;
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoGener(Double impSovrapprezzoGener) {
/* 642 */     this.impSovrapprezzoGener = impSovrapprezzoGener;
/*     */   }
/*     */   
/*     */   public Double getImpSovrapprezzoProf() {
/* 646 */     return this.impSovrapprezzoProf;
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoProf(Double impSovrapprezzoProf) {
/* 650 */     this.impSovrapprezzoProf = impSovrapprezzoProf;
/*     */   }
/*     */   
/*     */   public Double getImpSovrapprezzoSanit() {
/* 654 */     return this.impSovrapprezzoSanit;
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoSanit(Double impSovrapprezzoSanit) {
/* 658 */     this.impSovrapprezzoSanit = impSovrapprezzoSanit;
/*     */   }
/*     */   
/*     */   public Double getImpSovrapprezzoSport() {
/* 662 */     return this.impSovrapprezzoSport;
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoSport(Double impSovrapprezzoSport) {
/* 666 */     this.impSovrapprezzoSport = impSovrapprezzoSport;
/*     */   }
/*     */   
/*     */   public Double getPartiValuta() {
/* 670 */     return this.partiValuta;
/*     */   }
/*     */   
/*     */   public void setPartiValuta(Double partiValuta) {
/* 674 */     this.partiValuta = partiValuta;
/*     */   }
/*     */   
/*     */   public Double getPercInvalidita() {
/* 678 */     return this.percInvalidita;
/*     */   }
/*     */   
/*     */   public void setPercInvalidita(Double percInvalidita) {
/* 682 */     this.percInvalidita = percInvalidita;
/*     */   }
/*     */   
/*     */   public Double getPrestazIniziale() {
/* 686 */     return this.prestazIniziale;
/*     */   }
/*     */   
/*     */   public void setPrestazIniziale(Double prestazIniziale) {
/* 690 */     this.prestazIniziale = prestazIniziale;
/*     */   }
/*     */   
/*     */   public Double getRenditaDifferita() {
/* 694 */     return this.renditaDifferita;
/*     */   }
/*     */   
/*     */   public void setRenditaDifferita(Double renditaDifferita) {
/* 698 */     this.renditaDifferita = renditaDifferita;
/*     */   }
/*     */   
/*     */   public Double getRenditaMaturataCa() {
/* 702 */     return this.renditaMaturataCa;
/*     */   }
/*     */   
/*     */   public void setRenditaMaturataCa(Double renditaMaturataCa) {
/* 706 */     this.renditaMaturataCa = renditaMaturataCa;
/*     */   }
/*     */   
/*     */   public Double getRenditaMaturataCu() {
/* 710 */     return this.renditaMaturataCu;
/*     */   }
/*     */   
/*     */   public void setRenditaMaturataCu(Double renditaMaturataCu) {
/* 714 */     this.renditaMaturataCu = renditaMaturataCu;
/*     */   }
/*     */   
/*     */   public Double getTassoTariffa() {
/* 718 */     return this.tassoTariffa;
/*     */   }
/*     */   
/*     */   public void setTassoTariffa(Double tassoTariffa) {
/* 722 */     this.tassoTariffa = tassoTariffa;
/*     */   }
/*     */   
/*     */   public Double getIndiceInizValuta() {
/* 726 */     return this.indiceInizValuta;
/*     */   }
/*     */   
/*     */   public void setIndiceInizValuta(Double indiceInizValuta) {
/* 730 */     this.indiceInizValuta = indiceInizValuta;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/* 734 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 738 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDivisaUic() {
/* 742 */     return this.divisaUic;
/*     */   }
/*     */   
/*     */   public void setDivisaUic(String divisaUic) {
/* 746 */     this.divisaUic = divisaUic;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPremioPolizza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */