/*      */ package it.ras.arco.batch.bean;
/*      */ 
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ import org.apache.commons.lang.builder.ToStringBuilder;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FlxRBVitaPortPol
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   private Integer flxId;
/*      */   private String tipoRecord;
/*      */   private Date dataElab;
/*      */   private Integer compagnia;
/*      */   private Integer numPolizza;
/*      */   private Integer codLiberata;
/*      */   private Integer numProposta;
/*      */   private String codDivisa;
/*      */   private Integer durataContratto;
/*      */   private String pfia;
/*      */   private Integer frazionamento;
/*      */   private Integer polizzaSost1;
/*      */   private Integer polizzaSost2;
/*      */   private Integer polizzaSost3;
/*      */   private Integer polizzaSost4;
/*      */   private Date dataEmisContr;
/*      */   private Date dataDecorContr;
/*      */   private Date dataScadContr;
/*      */   private Date dataUltRataPag;
/*      */   private Date dataUltRataIncas;
/*      */   private Date dataDecorRataSucc;
/*      */   private String codProd;
/*      */   private String descProd;
/*      */   private Integer codTarif;
/*      */   private String descTarif;
/*      */   private Integer tipoTarif;
/*      */   private String descCompl;
/*      */   private Date dataInizPagPremi;
/*      */   private Date dataFinPagPremi;
/*      */   private String codStorno;
/*      */   private Date dataStorno;
/*      */   private String flagLiquidita;
/*      */   private Integer codTassoVita;
/*      */   private Integer codTassoCi;
/*      */   private String tipoInvalidita;
/*      */   private String percInvalidita;
/*      */   private String baseTecnica;
/*      */   private String tassoTariffa;
/*      */   private String impSovrapprezzoProf;
/*      */   private String impSovrapprezzoSport;
/*      */   private String impSovrapprezzoSanit;
/*      */   private String impSovrapprezzoGener;
/*      */   private String ultPremioPagLordo;
/*      */   private String ultPremioPagNetto;
/*      */   private String ultPremioPagLordoCi;
/*      */   private String ultPremioPagNettoCi;
/*      */   private String ultRataEmessLorda;
/*      */   private String ultRataEmessNetta;
/*      */   private String ultRataEmessLordaCi;
/*      */   private String ultRataEmessNettaCi;
/*      */   private String cumuloPremiPagLordi;
/*      */   private String cumuloPremiPagLordiCi;
/*      */   private String cumuloPremiPagNetti;
/*      */   private String cumuloPremiPagNettiCi;
/*      */   private String dirittiPerfez;
/*      */   private String dirittiQuietanza;
/*      */   private String primoPremioPag;
/*      */   private String primoPremioPagCi;
/*      */   private String prestitoEsist;
/*      */   private String capitaleMaturatoCa;
/*      */   private String capitaleMaturatoCu;
/*      */   private String capitaleMaturatoCi;
/*      */   private String capitaleDifferito;
/*      */   private String renditaMaturataCa;
/*      */   private String renditaMaturataCu;
/*      */   private String renditaDifferita;
/*      */   private String partiValuta;
/*      */   private String prestazIniziale;
/*      */   private String indiceInizValuta;
/*      */   private String unitLinked;
/*      */   private String indirizCorrispContr;
/*      */   private String locCorrispContr;
/*      */   private String capCorrispContr;
/*      */   private String provCorrispContr;
/*      */   private String nazCorrispContr;
/*      */   private String cfContr;
/*      */   private String nomeAssicurato;
/*      */   private Date dataNascitaAssic;
/*      */   private Integer etaCompAssic;
/*      */   private String sessoAssic;
/*      */   private Date dataRifRivalut;
/*      */   private String cambUltRataEmes;
/*      */   private String cambUltRataPag;
/*      */   private Date dataUltRataEmes;
/*      */   private String percRivalutazione;
/*      */   private String statoElab;
/*      */   private String istanza;
/*      */   private Date dataCaricamento;
/*      */   private Integer provPortRas;
/*      */   private Integer ramo;
/*      */   private String tassoFrazionamento;
/*      */   private Integer codTrasformata;
/*      */   private String descrProd;
/*      */   private String codAgente;
/*      */   private String codRete;
/*      */   private String riassegn;
/*      */   private String codAgSplit;
/*      */   private Integer codAgenzia;
/*      */   private Integer numMandato;
/*      */   private Integer sgict;
/*      */   private Integer compSiag;
/*      */   private Integer polSiag;
/*      */   private Integer ramoSiag;
/*      */   private Integer agSiag;
/*      */   private Integer numVersProd;
/*      */   private String descError;
/*      */   private Date dataElabD;
/*      */   private Double impAnnuPremVita;
/*      */   private Double impPremVitaUnic;
/*      */   private Double impPreVitaAnnCr;
/*      */   private Double impPrvVitAnnCr;
/*      */   private Double impRiseMate;
/*      */   private Double impCaptLiqu;
/*      */   private Double impCaptScad;
/*      */   private Double impRend;
/*      */   private Double impPremAggn;
/*      */   private Double impPres;
/*      */   private Double impRataIniz;
/*      */   private Double impRataAtt;
/*      */   private String fabbricaProvv;
/*      */   
/*      */   public Double getImpAnnuPremVita() {
/*  379 */     return this.impAnnuPremVita;
/*      */   }
/*      */   
/*      */   public void setImpAnnuPremVita(Double impAnnuPremVita) {
/*  383 */     this.impAnnuPremVita = impAnnuPremVita;
/*      */   }
/*      */   
/*      */   public Double getImpCaptLiqu() {
/*  387 */     return this.impCaptLiqu;
/*      */   }
/*      */   
/*      */   public void setImpCaptLiqu(Double impCaptLiqu) {
/*  391 */     this.impCaptLiqu = impCaptLiqu;
/*      */   }
/*      */   
/*      */   public Double getImpCaptScad() {
/*  395 */     return this.impCaptScad;
/*      */   }
/*      */   
/*      */   public void setImpCaptScad(Double impCaptScad) {
/*  399 */     this.impCaptScad = impCaptScad;
/*      */   }
/*      */   
/*      */   public Double getImpPremAggn() {
/*  403 */     return this.impPremAggn;
/*      */   }
/*      */   
/*      */   public void setImpPremAggn(Double impPremAggn) {
/*  407 */     this.impPremAggn = impPremAggn;
/*      */   }
/*      */   
/*      */   public Double getImpPremVitaUnic() {
/*  411 */     return this.impPremVitaUnic;
/*      */   }
/*      */   
/*      */   public void setImpPremVitaUnic(Double impPremVitaUnic) {
/*  415 */     this.impPremVitaUnic = impPremVitaUnic;
/*      */   }
/*      */   
/*      */   public Double getImpPres() {
/*  419 */     return this.impPres;
/*      */   }
/*      */   
/*      */   public void setImpPres(Double impPres) {
/*  423 */     this.impPres = impPres;
/*      */   }
/*      */   
/*      */   public Double getImpPreVitaAnnCr() {
/*  427 */     return this.impPreVitaAnnCr;
/*      */   }
/*      */   
/*      */   public void setImpPreVitaAnnCr(Double impPreVitaAnnCr) {
/*  431 */     this.impPreVitaAnnCr = impPreVitaAnnCr;
/*      */   }
/*      */   
/*      */   public Double getImpPrvVitAnnCr() {
/*  435 */     return this.impPrvVitAnnCr;
/*      */   }
/*      */   
/*      */   public void setImpPrvVitAnnCr(Double impPrvVitAnnCr) {
/*  439 */     this.impPrvVitAnnCr = impPrvVitAnnCr;
/*      */   }
/*      */   
/*      */   public Double getImpRataAtt() {
/*  443 */     return this.impRataAtt;
/*      */   }
/*      */   
/*      */   public void setImpRataAtt(Double impRataAtt) {
/*  447 */     this.impRataAtt = impRataAtt;
/*      */   }
/*      */   
/*      */   public Double getImpRataIniz() {
/*  451 */     return this.impRataIniz;
/*      */   }
/*      */   
/*      */   public void setImpRataIniz(Double impRataIniz) {
/*  455 */     this.impRataIniz = impRataIniz;
/*      */   }
/*      */   
/*      */   public Double getImpRend() {
/*  459 */     return this.impRend;
/*      */   }
/*      */   
/*      */   public void setImpRend(Double impRend) {
/*  463 */     this.impRend = impRend;
/*      */   }
/*      */   
/*      */   public Double getImpRiseMate() {
/*  467 */     return this.impRiseMate;
/*      */   }
/*      */   
/*      */   public void setImpRiseMate(Double impRiseMate) {
/*  471 */     this.impRiseMate = impRiseMate;
/*      */   }
/*      */ 
/*      */   
/*      */   public FlxRBVitaPortPol(Integer flxId, String tipoRecord, Date dataElab, Integer compagnia, Integer numPolizza, Integer codLiberata, Integer numProposta, String codDivisa, Integer durataContratto, String pfia, Integer frazionamento, Integer polizzaSost1, Integer polizzaSost2, Integer polizzaSost3, Integer polizzaSost4, Date dataEmisContr, Date dataDecorContr, Date dataScadContr, Date dataUltRataPag, Date dataUltRataIncas, Date dataDecorRataSucc, String codProd, String descProd, Integer codTarif, String descTarif, Integer tipoTarif, String descCompl, Date dataInizPagPremi, Date dataFinPagPremi, String codStorno, Date dataStorno, String flagLiquidita, Integer codTassoVita, Integer codTassoCi, String tipoInvalidita, String percInvalidita, String baseTecnica, String tassoTariffa, String impSovrapprezzoProf, String impSovrapprezzoSport, String impSovrapprezzoSanit, String impSovrapprezzoGener, String ultPremioPagLordo, String ultPremioPagNetto, String ultPremioPagLordoCi, String ultPremioPagNettoCi, String ultRataEmessLorda, String ultRataEmessNetta, String ultRataEmessLordaCi, String ultRataEmessNettaCi, String cumuloPremiPagLordi, String cumuloPremiPagLordiCi, String cumuloPremiPagNetti, String cumuloPremiPagNettiCi, String dirittiPerfez, String dirittiQuietanza, String primoPremioPag, String primoPremioPagCi, String prestitoEsist, String capitaleMaturatoCa, String capitaleMaturatoCu, String capitaleMaturatoCi, String capitaleDifferito, String renditaMaturataCa, String renditaMaturataCu, String renditaDifferita, String partiValuta, String prestazIniziale, String indiceInizValuta, String unitLinked, String indirizCorrispContr, String locCorrispContr, String capCorrispContr, String provCorrispContr, String nazCorrispContr, String cfContr, String nomeAssicurato, Date dataNascitaAssic, Integer etaCompAssic, String sessoAssic, Date dataRifRivalut, String cambUltRataEmes, String cambUltRataPag, Date dataUltRataEmes, String percRivalutazione, String statoElab, String istanza, Date dataCaricamento, Integer provPortRas, Integer ramo, String tassoFrazionamento, Integer codTrasformata, String descrProd, String codAgente, String codRete, String riassegn, String codAgSplit, Integer codAgenzia, Integer numMandato, Integer sgict, Integer compSiag, Integer polSiag, Integer ramoSiag, Integer agSiag, Integer numVersProd) {
/*  476 */     this.flxId = flxId;
/*  477 */     this.tipoRecord = tipoRecord;
/*  478 */     this.dataElab = dataElab;
/*  479 */     this.compagnia = compagnia;
/*  480 */     this.numPolizza = numPolizza;
/*  481 */     this.codLiberata = codLiberata;
/*  482 */     this.numProposta = numProposta;
/*  483 */     this.codDivisa = codDivisa;
/*  484 */     this.durataContratto = durataContratto;
/*  485 */     this.pfia = pfia;
/*  486 */     this.frazionamento = frazionamento;
/*  487 */     this.polizzaSost1 = polizzaSost1;
/*  488 */     this.polizzaSost2 = polizzaSost2;
/*  489 */     this.polizzaSost3 = polizzaSost3;
/*  490 */     this.polizzaSost4 = polizzaSost4;
/*  491 */     this.dataEmisContr = dataEmisContr;
/*  492 */     this.dataDecorContr = dataDecorContr;
/*  493 */     this.dataScadContr = dataScadContr;
/*  494 */     this.dataUltRataPag = dataUltRataPag;
/*  495 */     this.dataUltRataIncas = dataUltRataIncas;
/*  496 */     this.dataDecorRataSucc = dataDecorRataSucc;
/*  497 */     this.codProd = codProd;
/*  498 */     this.descProd = descProd;
/*  499 */     this.codTarif = codTarif;
/*  500 */     this.descTarif = descTarif;
/*  501 */     this.tipoTarif = tipoTarif;
/*  502 */     this.descCompl = descCompl;
/*  503 */     this.dataInizPagPremi = dataInizPagPremi;
/*  504 */     this.dataFinPagPremi = dataFinPagPremi;
/*  505 */     this.codStorno = codStorno;
/*  506 */     this.dataStorno = dataStorno;
/*  507 */     this.flagLiquidita = flagLiquidita;
/*  508 */     this.codTassoVita = codTassoVita;
/*  509 */     this.codTassoCi = codTassoCi;
/*  510 */     this.tipoInvalidita = tipoInvalidita;
/*  511 */     this.percInvalidita = percInvalidita;
/*  512 */     this.baseTecnica = baseTecnica;
/*  513 */     this.tassoTariffa = tassoTariffa;
/*  514 */     this.impSovrapprezzoProf = impSovrapprezzoProf;
/*  515 */     this.impSovrapprezzoSport = impSovrapprezzoSport;
/*  516 */     this.impSovrapprezzoSanit = impSovrapprezzoSanit;
/*  517 */     this.impSovrapprezzoGener = impSovrapprezzoGener;
/*  518 */     this.ultPremioPagLordo = ultPremioPagLordo;
/*  519 */     this.ultPremioPagNetto = ultPremioPagNetto;
/*  520 */     this.ultPremioPagLordoCi = ultPremioPagLordoCi;
/*  521 */     this.ultPremioPagNettoCi = ultPremioPagNettoCi;
/*  522 */     this.ultRataEmessLorda = ultRataEmessLorda;
/*  523 */     this.ultRataEmessNetta = ultRataEmessNetta;
/*  524 */     this.ultRataEmessLordaCi = ultRataEmessLordaCi;
/*  525 */     this.ultRataEmessNettaCi = ultRataEmessNettaCi;
/*  526 */     this.cumuloPremiPagLordi = cumuloPremiPagLordi;
/*  527 */     this.cumuloPremiPagLordiCi = cumuloPremiPagLordiCi;
/*  528 */     this.cumuloPremiPagNetti = cumuloPremiPagNetti;
/*  529 */     this.cumuloPremiPagNettiCi = cumuloPremiPagNettiCi;
/*  530 */     this.dirittiPerfez = dirittiPerfez;
/*  531 */     this.dirittiQuietanza = dirittiQuietanza;
/*  532 */     this.primoPremioPag = primoPremioPag;
/*  533 */     this.primoPremioPagCi = primoPremioPagCi;
/*  534 */     this.prestitoEsist = prestitoEsist;
/*  535 */     this.capitaleMaturatoCa = capitaleMaturatoCa;
/*  536 */     this.capitaleMaturatoCu = capitaleMaturatoCu;
/*  537 */     this.capitaleMaturatoCi = capitaleMaturatoCi;
/*  538 */     this.capitaleDifferito = capitaleDifferito;
/*  539 */     this.renditaMaturataCa = renditaMaturataCa;
/*  540 */     this.renditaMaturataCu = renditaMaturataCu;
/*  541 */     this.renditaDifferita = renditaDifferita;
/*  542 */     this.partiValuta = partiValuta;
/*  543 */     this.prestazIniziale = prestazIniziale;
/*  544 */     this.indiceInizValuta = indiceInizValuta;
/*  545 */     this.unitLinked = unitLinked;
/*  546 */     this.indirizCorrispContr = indirizCorrispContr;
/*  547 */     this.locCorrispContr = locCorrispContr;
/*  548 */     this.capCorrispContr = capCorrispContr;
/*  549 */     this.provCorrispContr = provCorrispContr;
/*  550 */     this.nazCorrispContr = nazCorrispContr;
/*  551 */     this.cfContr = cfContr;
/*  552 */     this.nomeAssicurato = nomeAssicurato;
/*  553 */     this.dataNascitaAssic = dataNascitaAssic;
/*  554 */     this.etaCompAssic = etaCompAssic;
/*  555 */     this.sessoAssic = sessoAssic;
/*  556 */     this.dataRifRivalut = dataRifRivalut;
/*  557 */     this.cambUltRataEmes = cambUltRataEmes;
/*  558 */     this.cambUltRataPag = cambUltRataPag;
/*  559 */     this.dataUltRataEmes = dataUltRataEmes;
/*  560 */     this.percRivalutazione = percRivalutazione;
/*  561 */     this.statoElab = statoElab;
/*  562 */     this.istanza = istanza;
/*  563 */     this.dataCaricamento = dataCaricamento;
/*  564 */     this.provPortRas = provPortRas;
/*  565 */     this.ramo = ramo;
/*  566 */     this.tassoFrazionamento = tassoFrazionamento;
/*  567 */     this.codTrasformata = codTrasformata;
/*  568 */     this.descrProd = descrProd;
/*  569 */     this.codAgente = codAgente;
/*  570 */     this.codRete = codRete;
/*  571 */     this.riassegn = riassegn;
/*  572 */     this.codAgSplit = codAgSplit;
/*  573 */     this.codAgenzia = codAgenzia;
/*  574 */     this.numMandato = numMandato;
/*  575 */     this.sgict = sgict;
/*  576 */     this.compSiag = compSiag;
/*  577 */     this.polSiag = polSiag;
/*  578 */     this.ramoSiag = ramoSiag;
/*  579 */     this.agSiag = agSiag;
/*  580 */     this.numVersProd = numVersProd;
/*      */   }
/*      */ 
/*      */   
/*      */   public FlxRBVitaPortPol() {}
/*      */ 
/*      */   
/*      */   public Integer getFlxId() {
/*  588 */     return this.flxId;
/*      */   }
/*      */   
/*      */   public void setFlxId(Integer flxId) {
/*  592 */     this.flxId = flxId;
/*      */   }
/*      */   
/*      */   public String getTipoRecord() {
/*  596 */     return this.tipoRecord;
/*      */   }
/*      */   
/*      */   public void setTipoRecord(String tipoRecord) {
/*  600 */     this.tipoRecord = tipoRecord;
/*      */   }
/*      */   
/*      */   public Date getDataElab() {
/*  604 */     return this.dataElab;
/*      */   }
/*      */   
/*      */   public void setDataElab(Date dataElab) {
/*  608 */     this.dataElab = dataElab;
/*      */   }
/*      */   
/*      */   public Integer getCompagnia() {
/*  612 */     return this.compagnia;
/*      */   }
/*      */   
/*      */   public void setCompagnia(Integer compagnia) {
/*  616 */     this.compagnia = compagnia;
/*      */   }
/*      */   
/*      */   public Integer getNumPolizza() {
/*  620 */     return this.numPolizza;
/*      */   }
/*      */   
/*      */   public void setNumPolizza(Integer numPolizza) {
/*  624 */     this.numPolizza = numPolizza;
/*      */   }
/*      */   
/*      */   public Integer getCodLiberata() {
/*  628 */     return this.codLiberata;
/*      */   }
/*      */   
/*      */   public void setCodLiberata(Integer codLiberata) {
/*  632 */     this.codLiberata = codLiberata;
/*      */   }
/*      */   
/*      */   public Integer getNumProposta() {
/*  636 */     return this.numProposta;
/*      */   }
/*      */   
/*      */   public void setNumProposta(Integer numProposta) {
/*  640 */     this.numProposta = numProposta;
/*      */   }
/*      */   
/*      */   public String getCodDivisa() {
/*  644 */     return this.codDivisa;
/*      */   }
/*      */   
/*      */   public void setCodDivisa(String codDivisa) {
/*  648 */     this.codDivisa = codDivisa;
/*      */   }
/*      */   
/*      */   public Integer getDurataContratto() {
/*  652 */     return this.durataContratto;
/*      */   }
/*      */   
/*      */   public void setDurataContratto(Integer durataContratto) {
/*  656 */     this.durataContratto = durataContratto;
/*      */   }
/*      */   
/*      */   public String getPfia() {
/*  660 */     return this.pfia;
/*      */   }
/*      */   
/*      */   public void setPfia(String pfia) {
/*  664 */     this.pfia = pfia;
/*      */   }
/*      */   
/*      */   public Integer getFrazionamento() {
/*  668 */     return this.frazionamento;
/*      */   }
/*      */   
/*      */   public void setFrazionamento(Integer frazionamento) {
/*  672 */     this.frazionamento = frazionamento;
/*      */   }
/*      */   
/*      */   public Integer getPolizzaSost1() {
/*  676 */     return this.polizzaSost1;
/*      */   }
/*      */   
/*      */   public void setPolizzaSost1(Integer polizzaSost1) {
/*  680 */     this.polizzaSost1 = polizzaSost1;
/*      */   }
/*      */   
/*      */   public Integer getPolizzaSost2() {
/*  684 */     return this.polizzaSost2;
/*      */   }
/*      */   
/*      */   public void setPolizzaSost2(Integer polizzaSost2) {
/*  688 */     this.polizzaSost2 = polizzaSost2;
/*      */   }
/*      */   
/*      */   public Integer getPolizzaSost3() {
/*  692 */     return this.polizzaSost3;
/*      */   }
/*      */   
/*      */   public void setPolizzaSost3(Integer polizzaSost3) {
/*  696 */     this.polizzaSost3 = polizzaSost3;
/*      */   }
/*      */   
/*      */   public Integer getPolizzaSost4() {
/*  700 */     return this.polizzaSost4;
/*      */   }
/*      */   
/*      */   public void setPolizzaSost4(Integer polizzaSost4) {
/*  704 */     this.polizzaSost4 = polizzaSost4;
/*      */   }
/*      */   
/*      */   public Date getDataEmisContr() {
/*  708 */     return this.dataEmisContr;
/*      */   }
/*      */   
/*      */   public void setDataEmisContr(Date dataEmisContr) {
/*  712 */     this.dataEmisContr = dataEmisContr;
/*      */   }
/*      */   
/*      */   public Date getDataDecorContr() {
/*  716 */     return this.dataDecorContr;
/*      */   }
/*      */   
/*      */   public void setDataDecorContr(Date dataDecorContr) {
/*  720 */     this.dataDecorContr = dataDecorContr;
/*      */   }
/*      */   
/*      */   public Date getDataScadContr() {
/*  724 */     return this.dataScadContr;
/*      */   }
/*      */   
/*      */   public void setDataScadContr(Date dataScadContr) {
/*  728 */     this.dataScadContr = dataScadContr;
/*      */   }
/*      */   
/*      */   public Date getDataUltRataPag() {
/*  732 */     return this.dataUltRataPag;
/*      */   }
/*      */   
/*      */   public void setDataUltRataPag(Date dataUltRataPag) {
/*  736 */     this.dataUltRataPag = dataUltRataPag;
/*      */   }
/*      */   
/*      */   public Date getDataUltRataIncas() {
/*  740 */     return this.dataUltRataIncas;
/*      */   }
/*      */   
/*      */   public void setDataUltRataIncas(Date dataUltRataIncas) {
/*  744 */     this.dataUltRataIncas = dataUltRataIncas;
/*      */   }
/*      */   
/*      */   public Date getDataDecorRataSucc() {
/*  748 */     return this.dataDecorRataSucc;
/*      */   }
/*      */   
/*      */   public void setDataDecorRataSucc(Date dataDecorRataSucc) {
/*  752 */     this.dataDecorRataSucc = dataDecorRataSucc;
/*      */   }
/*      */   
/*      */   public String getCodProd() {
/*  756 */     return this.codProd;
/*      */   }
/*      */   
/*      */   public void setCodProd(String codProd) {
/*  760 */     this.codProd = codProd;
/*      */   }
/*      */   
/*      */   public String getDescProd() {
/*  764 */     return this.descProd;
/*      */   }
/*      */   
/*      */   public void setDescProd(String descProd) {
/*  768 */     this.descProd = descProd;
/*      */   }
/*      */   
/*      */   public Integer getCodTarif() {
/*  772 */     return this.codTarif;
/*      */   }
/*      */   
/*      */   public void setCodTarif(Integer codTarif) {
/*  776 */     this.codTarif = codTarif;
/*      */   }
/*      */   
/*      */   public String getDescTarif() {
/*  780 */     return this.descTarif;
/*      */   }
/*      */   
/*      */   public void setDescTarif(String descTarif) {
/*  784 */     this.descTarif = descTarif;
/*      */   }
/*      */   
/*      */   public Integer getTipoTarif() {
/*  788 */     return this.tipoTarif;
/*      */   }
/*      */   
/*      */   public void setTipoTarif(Integer tipoTarif) {
/*  792 */     this.tipoTarif = tipoTarif;
/*      */   }
/*      */   
/*      */   public String getDescCompl() {
/*  796 */     return this.descCompl;
/*      */   }
/*      */   
/*      */   public void setDescCompl(String descCompl) {
/*  800 */     this.descCompl = descCompl;
/*      */   }
/*      */   
/*      */   public Date getDataInizPagPremi() {
/*  804 */     return this.dataInizPagPremi;
/*      */   }
/*      */   
/*      */   public void setDataInizPagPremi(Date dataInizPagPremi) {
/*  808 */     this.dataInizPagPremi = dataInizPagPremi;
/*      */   }
/*      */   
/*      */   public Date getDataFinPagPremi() {
/*  812 */     return this.dataFinPagPremi;
/*      */   }
/*      */   
/*      */   public void setDataFinPagPremi(Date dataFinPagPremi) {
/*  816 */     this.dataFinPagPremi = dataFinPagPremi;
/*      */   }
/*      */   
/*      */   public String getCodStorno() {
/*  820 */     return this.codStorno;
/*      */   }
/*      */   
/*      */   public void setCodStorno(String codStorno) {
/*  824 */     this.codStorno = codStorno;
/*      */   }
/*      */   
/*      */   public Date getDataStorno() {
/*  828 */     return this.dataStorno;
/*      */   }
/*      */   
/*      */   public void setDataStorno(Date dataStorno) {
/*  832 */     this.dataStorno = dataStorno;
/*      */   }
/*      */   
/*      */   public String getFlagLiquidita() {
/*  836 */     return this.flagLiquidita;
/*      */   }
/*      */   
/*      */   public void setFlagLiquidita(String flagLiquidita) {
/*  840 */     this.flagLiquidita = flagLiquidita;
/*      */   }
/*      */   
/*      */   public Integer getCodTassoVita() {
/*  844 */     return this.codTassoVita;
/*      */   }
/*      */   
/*      */   public void setCodTassoVita(Integer codTassoVita) {
/*  848 */     this.codTassoVita = codTassoVita;
/*      */   }
/*      */   
/*      */   public Integer getCodTassoCi() {
/*  852 */     return this.codTassoCi;
/*      */   }
/*      */   
/*      */   public void setCodTassoCi(Integer codTassoCi) {
/*  856 */     this.codTassoCi = codTassoCi;
/*      */   }
/*      */   
/*      */   public String getTipoInvalidita() {
/*  860 */     return this.tipoInvalidita;
/*      */   }
/*      */   
/*      */   public void setTipoInvalidita(String tipoInvalidita) {
/*  864 */     this.tipoInvalidita = tipoInvalidita;
/*      */   }
/*      */   
/*      */   public String getPercInvalidita() {
/*  868 */     return this.percInvalidita;
/*      */   }
/*      */   
/*      */   public void setPercInvalidita(String percInvalidita) {
/*  872 */     this.percInvalidita = percInvalidita;
/*      */   }
/*      */   
/*      */   public String getBaseTecnica() {
/*  876 */     return this.baseTecnica;
/*      */   }
/*      */   
/*      */   public void setBaseTecnica(String baseTecnica) {
/*  880 */     this.baseTecnica = baseTecnica;
/*      */   }
/*      */   
/*      */   public String getTassoTariffa() {
/*  884 */     return this.tassoTariffa;
/*      */   }
/*      */   
/*      */   public void setTassoTariffa(String tassoTariffa) {
/*  888 */     this.tassoTariffa = tassoTariffa;
/*      */   }
/*      */   
/*      */   public String getImpSovrapprezzoProf() {
/*  892 */     return this.impSovrapprezzoProf;
/*      */   }
/*      */   
/*      */   public void setImpSovrapprezzoProf(String impSovrapprezzoProf) {
/*  896 */     this.impSovrapprezzoProf = impSovrapprezzoProf;
/*      */   }
/*      */   
/*      */   public String getImpSovrapprezzoSport() {
/*  900 */     return this.impSovrapprezzoSport;
/*      */   }
/*      */   
/*      */   public void setImpSovrapprezzoSport(String impSovrapprezzoSport) {
/*  904 */     this.impSovrapprezzoSport = impSovrapprezzoSport;
/*      */   }
/*      */   
/*      */   public String getImpSovrapprezzoSanit() {
/*  908 */     return this.impSovrapprezzoSanit;
/*      */   }
/*      */   
/*      */   public void setImpSovrapprezzoSanit(String impSovrapprezzoSanit) {
/*  912 */     this.impSovrapprezzoSanit = impSovrapprezzoSanit;
/*      */   }
/*      */   
/*      */   public String getImpSovrapprezzoGener() {
/*  916 */     return this.impSovrapprezzoGener;
/*      */   }
/*      */   
/*      */   public void setImpSovrapprezzoGener(String impSovrapprezzoGener) {
/*  920 */     this.impSovrapprezzoGener = impSovrapprezzoGener;
/*      */   }
/*      */   
/*      */   public String getUltPremioPagLordo() {
/*  924 */     return this.ultPremioPagLordo;
/*      */   }
/*      */   
/*      */   public void setUltPremioPagLordo(String ultPremioPagLordo) {
/*  928 */     this.ultPremioPagLordo = ultPremioPagLordo;
/*      */   }
/*      */   
/*      */   public String getUltPremioPagNetto() {
/*  932 */     return this.ultPremioPagNetto;
/*      */   }
/*      */   
/*      */   public void setUltPremioPagNetto(String ultPremioPagNetto) {
/*  936 */     this.ultPremioPagNetto = ultPremioPagNetto;
/*      */   }
/*      */   
/*      */   public String getUltPremioPagLordoCi() {
/*  940 */     return this.ultPremioPagLordoCi;
/*      */   }
/*      */   
/*      */   public void setUltPremioPagLordoCi(String ultPremioPagLordoCi) {
/*  944 */     this.ultPremioPagLordoCi = ultPremioPagLordoCi;
/*      */   }
/*      */   
/*      */   public String getUltPremioPagNettoCi() {
/*  948 */     return this.ultPremioPagNettoCi;
/*      */   }
/*      */   
/*      */   public void setUltPremioPagNettoCi(String ultPremioPagNettoCi) {
/*  952 */     this.ultPremioPagNettoCi = ultPremioPagNettoCi;
/*      */   }
/*      */   
/*      */   public String getUltRataEmessLorda() {
/*  956 */     return this.ultRataEmessLorda;
/*      */   }
/*      */   
/*      */   public void setUltRataEmessLorda(String ultRataEmessLorda) {
/*  960 */     this.ultRataEmessLorda = ultRataEmessLorda;
/*      */   }
/*      */   
/*      */   public String getUltRataEmessNetta() {
/*  964 */     return this.ultRataEmessNetta;
/*      */   }
/*      */   
/*      */   public void setUltRataEmessNetta(String ultRataEmessNetta) {
/*  968 */     this.ultRataEmessNetta = ultRataEmessNetta;
/*      */   }
/*      */   
/*      */   public String getUltRataEmessLordaCi() {
/*  972 */     return this.ultRataEmessLordaCi;
/*      */   }
/*      */   
/*      */   public void setUltRataEmessLordaCi(String ultRataEmessLordaCi) {
/*  976 */     this.ultRataEmessLordaCi = ultRataEmessLordaCi;
/*      */   }
/*      */   
/*      */   public String getUltRataEmessNettaCi() {
/*  980 */     return this.ultRataEmessNettaCi;
/*      */   }
/*      */   
/*      */   public void setUltRataEmessNettaCi(String ultRataEmessNettaCi) {
/*  984 */     this.ultRataEmessNettaCi = ultRataEmessNettaCi;
/*      */   }
/*      */   
/*      */   public String getCumuloPremiPagLordi() {
/*  988 */     return this.cumuloPremiPagLordi;
/*      */   }
/*      */   
/*      */   public void setCumuloPremiPagLordi(String cumuloPremiPagLordi) {
/*  992 */     this.cumuloPremiPagLordi = cumuloPremiPagLordi;
/*      */   }
/*      */   
/*      */   public String getCumuloPremiPagLordiCi() {
/*  996 */     return this.cumuloPremiPagLordiCi;
/*      */   }
/*      */   
/*      */   public void setCumuloPremiPagLordiCi(String cumuloPremiPagLordiCi) {
/* 1000 */     this.cumuloPremiPagLordiCi = cumuloPremiPagLordiCi;
/*      */   }
/*      */   
/*      */   public String getCumuloPremiPagNetti() {
/* 1004 */     return this.cumuloPremiPagNetti;
/*      */   }
/*      */   
/*      */   public void setCumuloPremiPagNetti(String cumuloPremiPagNetti) {
/* 1008 */     this.cumuloPremiPagNetti = cumuloPremiPagNetti;
/*      */   }
/*      */   
/*      */   public String getCumuloPremiPagNettiCi() {
/* 1012 */     return this.cumuloPremiPagNettiCi;
/*      */   }
/*      */   
/*      */   public void setCumuloPremiPagNettiCi(String cumuloPremiPagNettiCi) {
/* 1016 */     this.cumuloPremiPagNettiCi = cumuloPremiPagNettiCi;
/*      */   }
/*      */   
/*      */   public String getDirittiPerfez() {
/* 1020 */     return this.dirittiPerfez;
/*      */   }
/*      */   
/*      */   public void setDirittiPerfez(String dirittiPerfez) {
/* 1024 */     this.dirittiPerfez = dirittiPerfez;
/*      */   }
/*      */   
/*      */   public String getDirittiQuietanza() {
/* 1028 */     return this.dirittiQuietanza;
/*      */   }
/*      */   
/*      */   public void setDirittiQuietanza(String dirittiQuietanza) {
/* 1032 */     this.dirittiQuietanza = dirittiQuietanza;
/*      */   }
/*      */   
/*      */   public String getPrimoPremioPag() {
/* 1036 */     return this.primoPremioPag;
/*      */   }
/*      */   
/*      */   public void setPrimoPremioPag(String primoPremioPag) {
/* 1040 */     this.primoPremioPag = primoPremioPag;
/*      */   }
/*      */   
/*      */   public String getPrimoPremioPagCi() {
/* 1044 */     return this.primoPremioPagCi;
/*      */   }
/*      */   
/*      */   public void setPrimoPremioPagCi(String primoPremioPagCi) {
/* 1048 */     this.primoPremioPagCi = primoPremioPagCi;
/*      */   }
/*      */   
/*      */   public String getPrestitoEsist() {
/* 1052 */     return this.prestitoEsist;
/*      */   }
/*      */   
/*      */   public void setPrestitoEsist(String prestitoEsist) {
/* 1056 */     this.prestitoEsist = prestitoEsist;
/*      */   }
/*      */   
/*      */   public String getCapitaleMaturatoCa() {
/* 1060 */     return this.capitaleMaturatoCa;
/*      */   }
/*      */   
/*      */   public void setCapitaleMaturatoCa(String capitaleMaturatoCa) {
/* 1064 */     this.capitaleMaturatoCa = capitaleMaturatoCa;
/*      */   }
/*      */   
/*      */   public String getCapitaleMaturatoCu() {
/* 1068 */     return this.capitaleMaturatoCu;
/*      */   }
/*      */   
/*      */   public void setCapitaleMaturatoCu(String capitaleMaturatoCu) {
/* 1072 */     this.capitaleMaturatoCu = capitaleMaturatoCu;
/*      */   }
/*      */   
/*      */   public String getCapitaleMaturatoCi() {
/* 1076 */     return this.capitaleMaturatoCi;
/*      */   }
/*      */   
/*      */   public void setCapitaleMaturatoCi(String capitaleMaturatoCi) {
/* 1080 */     this.capitaleMaturatoCi = capitaleMaturatoCi;
/*      */   }
/*      */   
/*      */   public String getCapitaleDifferito() {
/* 1084 */     return this.capitaleDifferito;
/*      */   }
/*      */   
/*      */   public void setCapitaleDifferito(String capitaleDifferito) {
/* 1088 */     this.capitaleDifferito = capitaleDifferito;
/*      */   }
/*      */   
/*      */   public String getRenditaMaturataCa() {
/* 1092 */     return this.renditaMaturataCa;
/*      */   }
/*      */   
/*      */   public void setRenditaMaturataCa(String renditaMaturataCa) {
/* 1096 */     this.renditaMaturataCa = renditaMaturataCa;
/*      */   }
/*      */   
/*      */   public String getRenditaMaturataCu() {
/* 1100 */     return this.renditaMaturataCu;
/*      */   }
/*      */   
/*      */   public void setRenditaMaturataCu(String renditaMaturataCu) {
/* 1104 */     this.renditaMaturataCu = renditaMaturataCu;
/*      */   }
/*      */   
/*      */   public String getRenditaDifferita() {
/* 1108 */     return this.renditaDifferita;
/*      */   }
/*      */   
/*      */   public void setRenditaDifferita(String renditaDifferita) {
/* 1112 */     this.renditaDifferita = renditaDifferita;
/*      */   }
/*      */   
/*      */   public String getPartiValuta() {
/* 1116 */     return this.partiValuta;
/*      */   }
/*      */   
/*      */   public void setPartiValuta(String partiValuta) {
/* 1120 */     this.partiValuta = partiValuta;
/*      */   }
/*      */   
/*      */   public String getPrestazIniziale() {
/* 1124 */     return this.prestazIniziale;
/*      */   }
/*      */   
/*      */   public void setPrestazIniziale(String prestazIniziale) {
/* 1128 */     this.prestazIniziale = prestazIniziale;
/*      */   }
/*      */   
/*      */   public String getIndiceInizValuta() {
/* 1132 */     return this.indiceInizValuta;
/*      */   }
/*      */   
/*      */   public void setIndiceInizValuta(String indiceInizValuta) {
/* 1136 */     this.indiceInizValuta = indiceInizValuta;
/*      */   }
/*      */   
/*      */   public String getUnitLinked() {
/* 1140 */     return this.unitLinked;
/*      */   }
/*      */   
/*      */   public void setUnitLinked(String unitLinked) {
/* 1144 */     this.unitLinked = unitLinked;
/*      */   }
/*      */   
/*      */   public String getIndirizCorrispContr() {
/* 1148 */     return this.indirizCorrispContr;
/*      */   }
/*      */   
/*      */   public void setIndirizCorrispContr(String indirizCorrispContr) {
/* 1152 */     this.indirizCorrispContr = indirizCorrispContr;
/*      */   }
/*      */   
/*      */   public String getLocCorrispContr() {
/* 1156 */     return this.locCorrispContr;
/*      */   }
/*      */   
/*      */   public void setLocCorrispContr(String locCorrispContr) {
/* 1160 */     this.locCorrispContr = locCorrispContr;
/*      */   }
/*      */   
/*      */   public String getCapCorrispContr() {
/* 1164 */     return this.capCorrispContr;
/*      */   }
/*      */   
/*      */   public void setCapCorrispContr(String capCorrispContr) {
/* 1168 */     this.capCorrispContr = capCorrispContr;
/*      */   }
/*      */   
/*      */   public String getProvCorrispContr() {
/* 1172 */     return this.provCorrispContr;
/*      */   }
/*      */   
/*      */   public void setProvCorrispContr(String provCorrispContr) {
/* 1176 */     this.provCorrispContr = provCorrispContr;
/*      */   }
/*      */   
/*      */   public String getNazCorrispContr() {
/* 1180 */     return this.nazCorrispContr;
/*      */   }
/*      */   
/*      */   public void setNazCorrispContr(String nazCorrispContr) {
/* 1184 */     this.nazCorrispContr = nazCorrispContr;
/*      */   }
/*      */   
/*      */   public String getCfContr() {
/* 1188 */     return this.cfContr;
/*      */   }
/*      */   
/*      */   public void setCfContr(String cfContr) {
/* 1192 */     this.cfContr = cfContr;
/*      */   }
/*      */   
/*      */   public String getNomeAssicurato() {
/* 1196 */     return this.nomeAssicurato;
/*      */   }
/*      */   
/*      */   public void setNomeAssicurato(String nomeAssicurato) {
/* 1200 */     this.nomeAssicurato = nomeAssicurato;
/*      */   }
/*      */   
/*      */   public Date getDataNascitaAssic() {
/* 1204 */     return this.dataNascitaAssic;
/*      */   }
/*      */   
/*      */   public void setDataNascitaAssic(Date dataNascitaAssic) {
/* 1208 */     this.dataNascitaAssic = dataNascitaAssic;
/*      */   }
/*      */   
/*      */   public Integer getEtaCompAssic() {
/* 1212 */     return this.etaCompAssic;
/*      */   }
/*      */   
/*      */   public void setEtaCompAssic(Integer etaCompAssic) {
/* 1216 */     this.etaCompAssic = etaCompAssic;
/*      */   }
/*      */   
/*      */   public String getSessoAssic() {
/* 1220 */     return this.sessoAssic;
/*      */   }
/*      */   
/*      */   public void setSessoAssic(String sessoAssic) {
/* 1224 */     this.sessoAssic = sessoAssic;
/*      */   }
/*      */   
/*      */   public Date getDataRifRivalut() {
/* 1228 */     return this.dataRifRivalut;
/*      */   }
/*      */   
/*      */   public void setDataRifRivalut(Date dataRifRivalut) {
/* 1232 */     this.dataRifRivalut = dataRifRivalut;
/*      */   }
/*      */   
/*      */   public String getCambUltRataEmes() {
/* 1236 */     return this.cambUltRataEmes;
/*      */   }
/*      */   
/*      */   public void setCambUltRataEmes(String cambUltRataEmes) {
/* 1240 */     this.cambUltRataEmes = cambUltRataEmes;
/*      */   }
/*      */   
/*      */   public String getCambUltRataPag() {
/* 1244 */     return this.cambUltRataPag;
/*      */   }
/*      */   
/*      */   public void setCambUltRataPag(String cambUltRataPag) {
/* 1248 */     this.cambUltRataPag = cambUltRataPag;
/*      */   }
/*      */   
/*      */   public Date getDataUltRataEmes() {
/* 1252 */     return this.dataUltRataEmes;
/*      */   }
/*      */   
/*      */   public void setDataUltRataEmes(Date dataUltRataEmes) {
/* 1256 */     this.dataUltRataEmes = dataUltRataEmes;
/*      */   }
/*      */   
/*      */   public String getPercRivalutazione() {
/* 1260 */     return this.percRivalutazione;
/*      */   }
/*      */   
/*      */   public void setPercRivalutazione(String percRivalutazione) {
/* 1264 */     this.percRivalutazione = percRivalutazione;
/*      */   }
/*      */   
/*      */   public String getStatoElab() {
/* 1268 */     return this.statoElab;
/*      */   }
/*      */   
/*      */   public void setStatoElab(String statoElab) {
/* 1272 */     this.statoElab = statoElab;
/*      */   }
/*      */   
/*      */   public String getIstanza() {
/* 1276 */     return this.istanza;
/*      */   }
/*      */   
/*      */   public void setIstanza(String istanza) {
/* 1280 */     this.istanza = istanza;
/*      */   }
/*      */   
/*      */   public Date getDataCaricamento() {
/* 1284 */     return this.dataCaricamento;
/*      */   }
/*      */   
/*      */   public void setDataCaricamento(Date dataCaricamento) {
/* 1288 */     this.dataCaricamento = dataCaricamento;
/*      */   }
/*      */   
/*      */   public Integer getProvPortRas() {
/* 1292 */     return this.provPortRas;
/*      */   }
/*      */   
/*      */   public void setProvPortRas(Integer provPortRas) {
/* 1296 */     this.provPortRas = provPortRas;
/*      */   }
/*      */   
/*      */   public Integer getRamo() {
/* 1300 */     return this.ramo;
/*      */   }
/*      */   
/*      */   public void setRamo(Integer ramo) {
/* 1304 */     this.ramo = ramo;
/*      */   }
/*      */   
/*      */   public String getTassoFrazionamento() {
/* 1308 */     return this.tassoFrazionamento;
/*      */   }
/*      */   
/*      */   public void setTassoFrazionamento(String tassoFrazionamento) {
/* 1312 */     this.tassoFrazionamento = tassoFrazionamento;
/*      */   }
/*      */   
/*      */   public Integer getCodTrasformata() {
/* 1316 */     return this.codTrasformata;
/*      */   }
/*      */   
/*      */   public void setCodTrasformata(Integer codTrasformata) {
/* 1320 */     this.codTrasformata = codTrasformata;
/*      */   }
/*      */   
/*      */   public String getDescrProd() {
/* 1324 */     return this.descrProd;
/*      */   }
/*      */   
/*      */   public void setDescrProd(String descrProd) {
/* 1328 */     this.descrProd = descrProd;
/*      */   }
/*      */   
/*      */   public String getCodAgente() {
/* 1332 */     return this.codAgente;
/*      */   }
/*      */   
/*      */   public void setCodAgente(String codAgente) {
/* 1336 */     this.codAgente = codAgente;
/*      */   }
/*      */   
/*      */   public String getCodRete() {
/* 1340 */     return this.codRete;
/*      */   }
/*      */   
/*      */   public void setCodRete(String codRete) {
/* 1344 */     this.codRete = codRete;
/*      */   }
/*      */   
/*      */   public String getRiassegn() {
/* 1348 */     return this.riassegn;
/*      */   }
/*      */   
/*      */   public void setRiassegn(String riassegn) {
/* 1352 */     this.riassegn = riassegn;
/*      */   }
/*      */   
/*      */   public String getCodAgSplit() {
/* 1356 */     return this.codAgSplit;
/*      */   }
/*      */   
/*      */   public void setCodAgSplit(String codAgSplit) {
/* 1360 */     this.codAgSplit = codAgSplit;
/*      */   }
/*      */   
/*      */   public Integer getCodAgenzia() {
/* 1364 */     return this.codAgenzia;
/*      */   }
/*      */   
/*      */   public void setCodAgenzia(Integer codAgenzia) {
/* 1368 */     this.codAgenzia = codAgenzia;
/*      */   }
/*      */   
/*      */   public Integer getNumMandato() {
/* 1372 */     return this.numMandato;
/*      */   }
/*      */   
/*      */   public void setNumMandato(Integer numMandato) {
/* 1376 */     this.numMandato = numMandato;
/*      */   }
/*      */   
/*      */   public Integer getSgict() {
/* 1380 */     return this.sgict;
/*      */   }
/*      */   
/*      */   public void setSgict(Integer sgict) {
/* 1384 */     this.sgict = sgict;
/*      */   }
/*      */   
/*      */   public Integer getCompSiag() {
/* 1388 */     return this.compSiag;
/*      */   }
/*      */   
/*      */   public void setCompSiag(Integer compSiag) {
/* 1392 */     this.compSiag = compSiag;
/*      */   }
/*      */   
/*      */   public Integer getPolSiag() {
/* 1396 */     return this.polSiag;
/*      */   }
/*      */   
/*      */   public void setPolSiag(Integer polSiag) {
/* 1400 */     this.polSiag = polSiag;
/*      */   }
/*      */   
/*      */   public Integer getRamoSiag() {
/* 1404 */     return this.ramoSiag;
/*      */   }
/*      */   
/*      */   public void setRamoSiag(Integer ramoSiag) {
/* 1408 */     this.ramoSiag = ramoSiag;
/*      */   }
/*      */   
/*      */   public Integer getAgSiag() {
/* 1412 */     return this.agSiag;
/*      */   }
/*      */   
/*      */   public void setAgSiag(Integer agSiag) {
/* 1416 */     this.agSiag = agSiag;
/*      */   }
/*      */   
/*      */   public Integer getNumVersProd() {
/* 1420 */     return this.numVersProd;
/*      */   }
/*      */   
/*      */   public void setNumVersProd(Integer numVersProd) {
/* 1424 */     this.numVersProd = numVersProd;
/*      */   }
/*      */   
/*      */   public String toString() {
/* 1428 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataElabD() {
/* 1434 */     return this.dataElabD;
/*      */   }
/*      */   
/*      */   public void setDataElabD(Date dataElabD) {
/* 1438 */     this.dataElabD = dataElabD;
/*      */   }
/*      */   
/*      */   public String getDescError() {
/* 1442 */     return this.descError;
/*      */   }
/*      */   
/*      */   public void setDescError(String descError) {
/* 1446 */     this.descError = descError;
/*      */   }
/*      */   
/*      */   public String getFabbricaProvv() {
/* 1450 */     return this.fabbricaProvv;
/*      */   }
/*      */   
/*      */   public void setFabbricaProvv(String fabbricaProvv) {
/* 1454 */     this.fabbricaProvv = fabbricaProvv;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRBVitaPortPol.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */