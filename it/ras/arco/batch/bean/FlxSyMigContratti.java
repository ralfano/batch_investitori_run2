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
/*     */ public class FlxSyMigContratti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceFabbrica;
/*     */   private String numeroContrattoSec;
/*     */   private Integer tipoProdotto;
/*     */   private Integer codiceCompartoSec;
/*     */   private String codiceCompartoFabbrica;
/*     */   private Date dataApertura;
/*     */   private String stato;
/*     */   private Date dataChiusura;
/*     */   private String codicePromotore;
/*     */   private String codiceRete;
/*     */   private Integer codiceCompagnia;
/*     */   private String numeroDossierTecnicoFabbric;
/*     */   private String codiceClienteSecPrimoIntes;
/*     */   private String csot;
/*     */   private String rapporto;
/*     */   private Integer dataCaricamentoContratto;
/*     */   private String flagPac;
/*     */   private Integer numRatePac;
/*     */   private Double impRataPac;
/*     */   private String fonFlagRid;
/*     */   private Integer numRateVers;
/*     */   private String freqVers;
/*     */   private String tipCerti;
/*     */   private String custCert;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public String getCodiceClienteSecPrimoIntes() {
/*  48 */     return this.codiceClienteSecPrimoIntes;
/*     */   }
/*     */   public void setCodiceClienteSecPrimoIntes(String codiceClienteSecPrimoIntes) {
/*  51 */     this.codiceClienteSecPrimoIntes = codiceClienteSecPrimoIntes;
/*     */   }
/*     */   public Integer getCodiceCompagnia() {
/*  54 */     return this.codiceCompagnia;
/*     */   }
/*     */   public void setCodiceCompagnia(Integer codiceCompagnia) {
/*  57 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   public String getCodiceCompartoFabbrica() {
/*  60 */     return this.codiceCompartoFabbrica;
/*     */   }
/*     */   public void setCodiceCompartoFabbrica(String codiceCompartoFabbrica) {
/*  63 */     this.codiceCompartoFabbrica = codiceCompartoFabbrica;
/*     */   }
/*     */   public Integer getCodiceCompartoSec() {
/*  66 */     return this.codiceCompartoSec;
/*     */   }
/*     */   public void setCodiceCompartoSec(Integer codiceCompartoSec) {
/*  69 */     this.codiceCompartoSec = codiceCompartoSec;
/*     */   }
/*     */   public String getCodiceFabbrica() {
/*  72 */     return this.codiceFabbrica;
/*     */   }
/*     */   public void setCodiceFabbrica(String codiceFabbrica) {
/*  75 */     this.codiceFabbrica = codiceFabbrica;
/*     */   }
/*     */   public String getCodicePromotore() {
/*  78 */     return this.codicePromotore;
/*     */   }
/*     */   public void setCodicePromotore(String codicePromotore) {
/*  81 */     this.codicePromotore = codicePromotore;
/*     */   }
/*     */   public String getCodiceRete() {
/*  84 */     return this.codiceRete;
/*     */   }
/*     */   public void setCodiceRete(String codiceRete) {
/*  87 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   public String getCsot() {
/*  90 */     return this.csot;
/*     */   }
/*     */   public void setCsot(String csot) {
/*  93 */     this.csot = csot;
/*     */   }
/*     */   public String getCustCert() {
/*  96 */     return this.custCert;
/*     */   }
/*     */   public void setCustCert(String custCert) {
/*  99 */     this.custCert = custCert;
/*     */   }
/*     */   public Date getDataApertura() {
/* 102 */     return this.dataApertura;
/*     */   }
/*     */   public void setDataApertura(Date dataApertura) {
/* 105 */     this.dataApertura = dataApertura;
/*     */   }
/*     */   public Integer getDataCaricamentoContratto() {
/* 108 */     return this.dataCaricamentoContratto;
/*     */   }
/*     */   public void setDataCaricamentoContratto(Integer dataCaricamentoContratto) {
/* 111 */     this.dataCaricamentoContratto = dataCaricamentoContratto;
/*     */   }
/*     */   public Date getDataChiusura() {
/* 114 */     return this.dataChiusura;
/*     */   }
/*     */   public void setDataChiusura(Date dataChiusura) {
/* 117 */     this.dataChiusura = dataChiusura;
/*     */   }
/*     */   public String getFlagPac() {
/* 120 */     return this.flagPac;
/*     */   }
/*     */   public void setFlagPac(String flagPac) {
/* 123 */     this.flagPac = flagPac;
/*     */   }
/*     */   public Integer getFlxId() {
/* 126 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 129 */     this.flxId = flxId;
/*     */   }
/*     */   public String getFonFlagRid() {
/* 132 */     return this.fonFlagRid;
/*     */   }
/*     */   public void setFonFlagRid(String fonFlagRid) {
/* 135 */     this.fonFlagRid = fonFlagRid;
/*     */   }
/*     */   public String getFreqVers() {
/* 138 */     return this.freqVers;
/*     */   }
/*     */   public void setFreqVers(String freqVers) {
/* 141 */     this.freqVers = freqVers;
/*     */   }
/*     */   public Double getImpRataPac() {
/* 144 */     return this.impRataPac;
/*     */   }
/*     */   public void setImpRataPac(Double impRataPac) {
/* 147 */     this.impRataPac = impRataPac;
/*     */   }
/*     */   public String getIstanza() {
/* 150 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 153 */     this.istanza = istanza;
/*     */   }
/*     */   public String getNumeroContrattoSec() {
/* 156 */     return this.numeroContrattoSec;
/*     */   }
/*     */   public void setNumeroContrattoSec(String numeroContrattoSec) {
/* 159 */     this.numeroContrattoSec = numeroContrattoSec;
/*     */   }
/*     */   public String getNumeroDossierTecnicoFabbric() {
/* 162 */     return this.numeroDossierTecnicoFabbric;
/*     */   }
/*     */   public void setNumeroDossierTecnicoFabbric(String numeroDossierTecnicoFabbric) {
/* 165 */     this.numeroDossierTecnicoFabbric = numeroDossierTecnicoFabbric;
/*     */   }
/*     */   public Integer getNumRatePac() {
/* 168 */     return this.numRatePac;
/*     */   }
/*     */   public void setNumRatePac(Integer numRatePac) {
/* 171 */     this.numRatePac = numRatePac;
/*     */   }
/*     */   public Integer getNumRateVers() {
/* 174 */     return this.numRateVers;
/*     */   }
/*     */   public void setNumRateVers(Integer numRateVers) {
/* 177 */     this.numRateVers = numRateVers;
/*     */   }
/*     */   public String getRapporto() {
/* 180 */     return this.rapporto;
/*     */   }
/*     */   public void setRapporto(String rapporto) {
/* 183 */     this.rapporto = rapporto;
/*     */   }
/*     */   public String getStato() {
/* 186 */     return this.stato;
/*     */   }
/*     */   public void setStato(String stato) {
/* 189 */     this.stato = stato;
/*     */   }
/*     */   public String getStatoElab() {
/* 192 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 195 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTipCerti() {
/* 198 */     return this.tipCerti;
/*     */   }
/*     */   public void setTipCerti(String tipCerti) {
/* 201 */     this.tipCerti = tipCerti;
/*     */   }
/*     */   public Integer getTipoProdotto() {
/* 204 */     return this.tipoProdotto;
/*     */   }
/*     */   public void setTipoProdotto(Integer tipoProdotto) {
/* 207 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataErrore() {
/* 214 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 217 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 220 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 223 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSyMigContratti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */