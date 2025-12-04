/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinFondiSicav
/*     */   extends FinContratto
/*     */   implements Serializable
/*     */ {
/*  15 */   public static final Integer ANNUALE = new Integer(12);
/*  16 */   public static final Integer SEMESTRALE = new Integer(6);
/*  17 */   public static final Integer QUADRIMESTRALE = new Integer(4);
/*  18 */   public static final Integer TRIMESTRALE = new Integer(3);
/*  19 */   public static final Integer BIMESTRALE = new Integer(2);
/*  20 */   public static final Integer MENSILE = new Integer(1);
/*     */ 
/*     */   
/*     */   private Integer fondoSicavId;
/*     */ 
/*     */   
/*     */   private Date dataDecorrenza;
/*     */ 
/*     */   
/*     */   private String staccoCedola;
/*     */ 
/*     */   
/*     */   private Date dataChiusura;
/*     */ 
/*     */   
/*     */   private String tipoInv;
/*     */ 
/*     */   
/*     */   private String codTipoPiano;
/*     */ 
/*     */   
/*     */   private Integer durataPiano;
/*     */ 
/*     */   
/*     */   private Integer frequenza;
/*     */ 
/*     */   
/*     */   private Double impRata;
/*     */ 
/*     */   
/*     */   private Double impTotPiano;
/*     */ 
/*     */   
/*     */   private Double rendInvestLordo;
/*     */ 
/*     */   
/*     */   private Double rendInvestNetto;
/*     */ 
/*     */   
/*     */   private Integer numRate;
/*     */ 
/*     */   
/*     */   private Integer numRatePagate;
/*     */ 
/*     */   
/*     */   private Integer numPrelieviEffet;
/*     */ 
/*     */   
/*     */   private String flgReinvCedola;
/*     */ 
/*     */   
/*     */   private String flgFirmeContig;
/*     */ 
/*     */   
/*     */   private Date dataInserimento;
/*     */ 
/*     */   
/*     */   private String utenteInserimento;
/*     */ 
/*     */   
/*     */   private Date dataScadUltRata;
/*     */ 
/*     */   
/*     */   private Date dataQuote;
/*     */ 
/*     */   
/*     */   private Double coefCalcSpese;
/*     */ 
/*     */   
/*     */   private Integer fattCorrettivo;
/*     */ 
/*     */   
/*     */   private Date dataCopertura;
/*     */ 
/*     */   
/*     */   private Double impEccRata;
/*     */ 
/*     */   
/*     */   private String numMandato;
/*     */ 
/*     */   
/*     */   private String flagRid;
/*     */ 
/*     */   
/*     */   private String flagEasyPlan;
/*     */   
/*     */   private String abi;
/*     */   
/*     */   private String cab;
/*     */   
/*     */   private String numeroCC;
/*     */   
/*     */   private String mezzoPagamentoPac;
/*     */   
/*     */   private Date dataInizioPagamento;
/*     */   
/*     */   private Integer codiceFirmatario;
/*     */   
/*     */   private String depositoSgr;
/*     */   
/*     */   private String mezzoPagCedola;
/*     */   
/*     */   private FinSoggetto intestatarioReinvestimento;
/*     */   
/*     */   private Integer tmpIntestatario;
/*     */   
/*     */   private Integer codSocietaBeneficiaria;
/*     */   
/*     */   private Integer percDaDevolvere;
/*     */   
/*     */   private Integer importoDaDevolvere;
/*     */   
/*     */   private Integer numRipetizioniBonifico;
/*     */   
/*     */   private String dataDecorrenzaBonifico;
/*     */   
/*     */   private String mezzoPagEccedenza;
/*     */   
/*     */   private String abiCedola;
/*     */   
/*     */   private String cabCedola;
/*     */   
/*     */   private String numeroCCedola;
/*     */ 
/*     */   
/*     */   public FinFondiSicav(Integer prelieviEffet, Date dataChiusura, Integer soggCoin, String numContratto, String dossierTecnico, Date dataApertura, String tipoProdotto, String statoContratto, String codConvenzione, Date dataInserimento, String utenteInserimento, String flagMulti, FinProdotto prodotto, Set posizione, Set ruolo, Set sottoscrizione, Set indirizzo, Set movimenti, FinCointestazione cointestazione, FinSoggetto soggetto, Set soggCointestazione, Set assegnazione, String piano, Integer id, Date decorrenza, Date inserimento, Integer piano2, String contig, String cedola, Integer frequenza, Double rata, Double piano3, Integer rate, Integer pagate, Double lordo, Double netto, String cedola2, String inv, String inserimento2, String flagRid, String flagEasyPlan) {
/* 146 */     super(assegnazione, pagate, inserimento, inserimento, inserimento2, inserimento2, dataChiusura, inserimento, soggCoin, numContratto, dossierTecnico, dataApertura, tipoProdotto, statoContratto, codConvenzione, dataInserimento, utenteInserimento, flagMulti, prodotto, posizione, ruolo, sottoscrizione, indirizzo, movimenti, cointestazione, soggetto, soggCointestazione, assegnazione);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 152 */     this.codTipoPiano = piano;
/*     */     
/* 154 */     this.dataDecorrenza = decorrenza;
/* 155 */     dataInserimento = inserimento;
/* 156 */     this.durataPiano = piano2;
/* 157 */     this.flgFirmeContig = contig;
/* 158 */     this.flgReinvCedola = cedola;
/* 159 */     this.frequenza = frequenza;
/* 160 */     this.impRata = rata;
/* 161 */     this.impTotPiano = piano3;
/* 162 */     this.numRate = rate;
/* 163 */     this.numRatePagate = pagate;
/* 164 */     this.numPrelieviEffet = prelieviEffet;
/* 165 */     this.rendInvestLordo = lordo;
/* 166 */     this.rendInvestNetto = netto;
/* 167 */     this.staccoCedola = cedola2;
/* 168 */     this.tipoInv = inv;
/* 169 */     utenteInserimento = inserimento2;
/* 170 */     this.flagRid = flagRid;
/* 171 */     this.flagEasyPlan = flagEasyPlan;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinFondiSicav() {}
/*     */ 
/*     */   
/*     */   public Integer getFondoSicavId() {
/* 179 */     return this.fondoSicavId;
/*     */   }
/*     */   
/*     */   public void setFondoSicavId(Integer fondoSicavId) {
/* 183 */     this.fondoSicavId = fondoSicavId;
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
/*     */   public Date getDataDecorrenza() {
/* 195 */     return this.dataDecorrenza;
/*     */   }
/*     */   
/*     */   public void setDataDecorrenza(Date dataDecorrenza) {
/* 199 */     this.dataDecorrenza = dataDecorrenza;
/*     */   }
/*     */   
/*     */   public Date getDataChiusura() {
/* 203 */     return this.dataChiusura;
/*     */   }
/*     */   
/*     */   public void setDataChiusura(Date dataChiusura) {
/* 207 */     this.dataChiusura = dataChiusura;
/*     */   }
/*     */   
/*     */   public String getTipoInv() {
/* 211 */     return this.tipoInv;
/*     */   }
/*     */   
/*     */   public void setTipoInv(String tipoInv) {
/* 215 */     this.tipoInv = tipoInv;
/*     */   }
/*     */   
/*     */   public String getCodTipoPiano() {
/* 219 */     return this.codTipoPiano;
/*     */   }
/*     */   
/*     */   public void setCodTipoPiano(String codTipoPiano) {
/* 223 */     this.codTipoPiano = codTipoPiano;
/*     */   }
/*     */   
/*     */   public Integer getDurataPiano() {
/* 227 */     return this.durataPiano;
/*     */   }
/*     */   
/*     */   public void setDurataPiano(Integer durataPiano) {
/* 231 */     this.durataPiano = durataPiano;
/*     */   }
/*     */   
/*     */   public Integer getFrequenza() {
/* 235 */     return this.frequenza;
/*     */   }
/*     */   
/*     */   public void setFrequenza(Integer frequenza) {
/* 239 */     this.frequenza = frequenza;
/*     */   }
/*     */   
/*     */   public Double getImpRata() {
/* 243 */     return this.impRata;
/*     */   }
/*     */   
/*     */   public void setImpRata(Double impRata) {
/* 247 */     this.impRata = impRata;
/*     */   }
/*     */   
/*     */   public Double getImpTotPiano() {
/* 251 */     return this.impTotPiano;
/*     */   }
/*     */   
/*     */   public void setImpTotPiano(Double impTotPiano) {
/* 255 */     this.impTotPiano = impTotPiano;
/*     */   }
/*     */   
/*     */   public Double getRendInvestLordo() {
/* 259 */     return this.rendInvestLordo;
/*     */   }
/*     */   
/*     */   public void setRendInvestLordo(Double rendInvestLordo) {
/* 263 */     this.rendInvestLordo = rendInvestLordo;
/*     */   }
/*     */   
/*     */   public Double getRendInvestNetto() {
/* 267 */     return this.rendInvestNetto;
/*     */   }
/*     */   
/*     */   public void setRendInvestNetto(Double rendInvestNetto) {
/* 271 */     this.rendInvestNetto = rendInvestNetto;
/*     */   }
/*     */   
/*     */   public Integer getNumRate() {
/* 275 */     return this.numRate;
/*     */   }
/*     */   
/*     */   public void setNumRate(Integer numRate) {
/* 279 */     this.numRate = numRate;
/*     */   }
/*     */   
/*     */   public Integer getNumRatePagate() {
/* 283 */     return this.numRatePagate;
/*     */   }
/*     */   
/*     */   public void setNumRatePagate(Integer numRatePagate) {
/* 287 */     this.numRatePagate = numRatePagate;
/*     */   }
/*     */   
/*     */   public String getFlgReinvCedola() {
/* 291 */     return this.flgReinvCedola;
/*     */   }
/*     */   
/*     */   public void setFlgReinvCedola(String flgReinvCedola) {
/* 295 */     this.flgReinvCedola = flgReinvCedola;
/*     */   }
/*     */   
/*     */   public String getFlgFirmeContig() {
/* 299 */     return this.flgFirmeContig;
/*     */   }
/*     */   
/*     */   public void setFlgFirmeContig(String flgFirmeContig) {
/* 303 */     this.flgFirmeContig = flgFirmeContig;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 307 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 311 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 315 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 319 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStaccoCedola() {
/* 326 */     return this.staccoCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStaccoCedola(String staccoCedola) {
/* 332 */     this.staccoCedola = staccoCedola;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 336 */     return (new ToStringBuilder(this)).append("fondoSicavId", getFondoSicavId()).toString();
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
/*     */   public Double getCoefCalcSpese() {
/* 350 */     return this.coefCalcSpese;
/*     */   }
/*     */   
/*     */   public void setCoefCalcSpese(Double coefCalcSpese) {
/* 354 */     this.coefCalcSpese = coefCalcSpese;
/*     */   }
/*     */   
/*     */   public Date getDataCopertura() {
/* 358 */     return this.dataCopertura;
/*     */   }
/*     */   
/*     */   public void setDataCopertura(Date dataCopertura) {
/* 362 */     this.dataCopertura = dataCopertura;
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
/*     */   public Date getDataQuote() {
/* 374 */     return this.dataQuote;
/*     */   }
/*     */   
/*     */   public void setDataQuote(Date dataQuote) {
/* 378 */     this.dataQuote = dataQuote;
/*     */   }
/*     */   
/*     */   public Date getDataScadUltRata() {
/* 382 */     return this.dataScadUltRata;
/*     */   }
/*     */   
/*     */   public void setDataScadUltRata(Date dataScadUltRata) {
/* 386 */     this.dataScadUltRata = dataScadUltRata;
/*     */   }
/*     */   
/*     */   public Integer getFattCorrettivo() {
/* 390 */     return this.fattCorrettivo;
/*     */   }
/*     */   
/*     */   public void setFattCorrettivo(Integer fattCorrettivo) {
/* 394 */     this.fattCorrettivo = fattCorrettivo;
/*     */   }
/*     */   
/*     */   public Double getImpEccRata() {
/* 398 */     return this.impEccRata;
/*     */   }
/*     */   
/*     */   public void setImpEccRata(Double impEccRata) {
/* 402 */     this.impEccRata = impEccRata;
/*     */   }
/*     */   
/*     */   public String getNumMandato() {
/* 406 */     return this.numMandato;
/*     */   }
/*     */   
/*     */   public void setNumMandato(String numMandato) {
/* 410 */     this.numMandato = numMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumPrelieviEffet() {
/* 417 */     return this.numPrelieviEffet;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumPrelieviEffet(Integer numPrelieviEffet) {
/* 423 */     this.numPrelieviEffet = numPrelieviEffet;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagEasyPlan() {
/* 429 */     return this.flagEasyPlan;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagEasyPlan(String flagEasyPlan) {
/* 435 */     this.flagEasyPlan = flagEasyPlan;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagRid() {
/* 441 */     return this.flagRid;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagRid(String flagRid) {
/* 447 */     this.flagRid = flagRid;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAbi() {
/* 453 */     return this.abi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAbi(String abi) {
/* 459 */     this.abi = abi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCab() {
/* 465 */     return this.cab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCab(String cab) {
/* 471 */     this.cab = cab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceFirmatario() {
/* 477 */     return this.codiceFirmatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFirmatario(Integer codiceFirmatario) {
/* 483 */     this.codiceFirmatario = codiceFirmatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioPagamento() {
/* 489 */     return this.dataInizioPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioPagamento(Date dataInizioPagamento) {
/* 495 */     this.dataInizioPagamento = dataInizioPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMezzoPagamentoPac() {
/* 501 */     return this.mezzoPagamentoPac;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMezzoPagamentoPac(String mezzoPagamentoPac) {
/* 507 */     this.mezzoPagamentoPac = mezzoPagamentoPac;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroCC() {
/* 513 */     return this.numeroCC;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroCC(String numeroCC) {
/* 519 */     this.numeroCC = numeroCC;
/*     */   }
/*     */   
/*     */   public String getDepositoSgr() {
/* 523 */     return this.depositoSgr;
/*     */   }
/*     */   
/*     */   public void setDepositoSgr(String depositoSgr) {
/* 527 */     this.depositoSgr = depositoSgr;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMezzoPagCedola() {
/* 534 */     return this.mezzoPagCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMezzoPagCedola(String mezzoPagCedola) {
/* 540 */     this.mezzoPagCedola = mezzoPagCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSoggetto getIntestatarioReinvestimento() {
/* 546 */     return this.intestatarioReinvestimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIntestatarioReinvestimento(FinSoggetto intestatarioReinvestimento) {
/* 552 */     this.intestatarioReinvestimento = intestatarioReinvestimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodSocietaBeneficiaria() {
/* 559 */     return this.codSocietaBeneficiaria;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodSocietaBeneficiaria(Integer codSocietaBeneficiaria) {
/* 565 */     this.codSocietaBeneficiaria = codSocietaBeneficiaria;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPercDaDevolvere() {
/* 571 */     return this.percDaDevolvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercDaDevolvere(Integer percDaDevolvere) {
/* 577 */     this.percDaDevolvere = percDaDevolvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getImportoDaDevolvere() {
/* 583 */     return this.importoDaDevolvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoDaDevolvere(Integer importoDaDevolvere) {
/* 589 */     this.importoDaDevolvere = importoDaDevolvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumRipetizioniBonifico() {
/* 595 */     return this.numRipetizioniBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumRipetizioniBonifico(Integer numRipetizioniBonifico) {
/* 601 */     this.numRipetizioniBonifico = numRipetizioniBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataDecorrenzaBonifico() {
/* 607 */     return this.dataDecorrenzaBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataDecorrenzaBonifico(String dataDecorrenzaBonifico) {
/* 613 */     this.dataDecorrenzaBonifico = dataDecorrenzaBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMezzoPagEccedenza() {
/* 619 */     return this.mezzoPagEccedenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMezzoPagEccedenza(String mezzoPagEccedenza) {
/* 625 */     this.mezzoPagEccedenza = mezzoPagEccedenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAbiCedola() {
/* 631 */     return this.abiCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAbiCedola(String abiCedola) {
/* 637 */     this.abiCedola = abiCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCabCedola() {
/* 643 */     return this.cabCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCabCedola(String cabCedola) {
/* 649 */     this.cabCedola = cabCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroCCedola() {
/* 655 */     return this.numeroCCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroCCedola(String numeroCCedola) {
/* 661 */     this.numeroCCedola = numeroCCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getTmpIntestatario() {
/* 668 */     if (this.tmpIntestatario == null && getIntestatarioReinvestimento() != null)
/*     */     {
/* 670 */       return getIntestatarioReinvestimento().getNdgArco();
/*     */     }
/*     */     
/* 673 */     return this.tmpIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTmpIntestatario(Integer tmpIntestatario) {
/* 679 */     this.tmpIntestatario = tmpIntestatario;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinFondiSicav.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */