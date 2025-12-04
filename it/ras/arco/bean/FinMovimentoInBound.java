/*      */ package it.ras.arco.bean;
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
/*      */ public class FinMovimentoInBound
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   private String ordineId;
/*      */   private Integer movimentoinboundId;
/*      */   private String abi;
/*      */   private String cab;
/*      */   private Double cambio;
/*      */   private String causale;
/*      */   private String cc;
/*      */   private String chiaveExt;
/*      */   private String codClienteExt;
/*      */   private String codCollocatore;
/*      */   private String codFondo;
/*      */   private String codFondoSw;
/*      */   private Integer codIstituto;
/*      */   private String codicePromotore;
/*      */   private Double commBcaColloca;
/*      */   private Double commConversione;
/*      */   private Double commIngresso;
/*      */   private Double commIntervento;
/*      */   private Double commMantenimento;
/*      */   private Double commPerformance;
/*      */   private Double commRimborso;
/*      */   private Double commSocGest;
/*      */   private Double commValuta;
/*      */   private Double commissione;
/*      */   private Date dataCambioConferm;
/*      */   private Date dataCambio;
/*      */   private Date dataCambioFisc;
/*      */   private Date dataCambioSwitch;
/*      */   private Date dataCaricamento;
/*      */   private Date dataRegolamento;
/*      */   private Date dataOperazione;
/*      */   private Date dataSottoscrizione;
/*      */   private String divisa;
/*      */   private Integer flxId;
/*      */   private Double impMinusvalFisc;
/*      */   private Double impPlusvalFisc;
/*      */   private Double importo;
/*      */   private Double importoLordoValuta;
/*      */   private String istanza;
/*      */   private String mezzoPagamento;
/*      */   private String contrattoExt;
/*      */   private String numOperazione;
/*      */   private Integer numeroCertificato;
/*      */   private Integer numeroRate;
/*      */   private Integer numeroRecord;
/*      */   private String numeroSottoscrizione;
/*      */   private Double prezzo;
/*      */   private Integer progInvioCollocatore;
/*      */   private Double quantita;
/*      */   private Double ritenutaFisc;
/*      */   private Double speseBcaColloca;
/*      */   private Double speseBcaCorr;
/*      */   private Double speseEmisCertf;
/*      */   private Double speseFondo;
/*      */   private Double speseGeneriche;
/*      */   private Double speseSocGest;
/*      */   private Double speseTipoPag;
/*      */   private String statoElab;
/*      */   private Double tassoCambioSwitch;
/*      */   private Integer tipoOperazione;
/*      */   private String tipoOpzioneFisc;
/*      */   private Integer tipoRecord;
/*      */   private Double importoNetto;
/*      */   private String descrizioneErrore;
/*      */   private String codEmittente;
/*      */   private String codEmittenteEsterno;
/*      */   private String codIsin;
/*      */   private String divisaCommissioni;
/*      */   private Double importoNettoValuta;
/*      */   private Double cambioCommissioni;
/*      */   private Double ritenutaFiscValuta;
/*      */   private Integer idTempMov;
/*      */   private String tipoQuote;
/*      */   private Integer quoLibCont;
/*      */   private String numRifEnteExt;
/*      */   private Double prezzoValuta;
/*      */   private Double speseGenericheValuta;
/*      */   private Integer sottoscrizioneId;
/*      */   private Double scontoQuoteTunnel;
/*      */   private Integer numeroOperazioneSwitch;
/*      */   private String codiceDivLor;
/*      */   private Double cambioDivLorSuEur;
/*      */   private Date dataCambioDivisaLordo;
/*      */   private Date dataStorno;
/*      */   private String descrCausale;
/*      */   private String crap;
/*      */   private Double tasse;
/*      */   private Date dataValuta;
/*      */   private Date dataElaborazione;
/*      */   private Integer codrgRam;
/*      */   private Double numQuoCert;
/*      */   private Integer ndispRam;
/*      */   private String codRete;
/*      */   
/*      */   public String getCodRete() {
/*  262 */     return this.codRete;
/*      */   }
/*      */   
/*      */   public void setCodRete(String codRete) {
/*  266 */     this.codRete = codRete;
/*      */   }
/*      */   
/*      */   public Date getDataElaborazione() {
/*  270 */     return this.dataElaborazione;
/*      */   }
/*      */   
/*      */   public void setDataElaborazione(Date dataElaborazione) {
/*  274 */     this.dataElaborazione = dataElaborazione;
/*      */   }
/*      */   
/*      */   public Double getTasse() {
/*  278 */     return this.tasse;
/*      */   }
/*      */   
/*      */   public void setTasse(Double tasse) {
/*  282 */     this.tasse = tasse;
/*      */   }
/*      */   
/*      */   public Integer getNumeroOperazioneSwitch() {
/*  286 */     return this.numeroOperazioneSwitch;
/*      */   }
/*      */   
/*      */   public void setNumeroOperazioneSwitch(Integer numeroOperazioneSwitch) {
/*  290 */     this.numeroOperazioneSwitch = numeroOperazioneSwitch;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getMovimentoinboundId() {
/*  298 */     return this.movimentoinboundId;
/*      */   }
/*      */   
/*      */   public void setMovimentoinboundId(Integer movimentoinboundId) {
/*  302 */     this.movimentoinboundId = movimentoinboundId;
/*      */   }
/*      */   
/*      */   public String getAbi() {
/*  306 */     return this.abi;
/*      */   }
/*      */   
/*      */   public void setAbi(String abi) {
/*  310 */     this.abi = abi;
/*      */   }
/*      */   
/*      */   public String getCab() {
/*  314 */     return this.cab;
/*      */   }
/*      */   
/*      */   public void setCab(String cab) {
/*  318 */     this.cab = cab;
/*      */   }
/*      */   
/*      */   public Double getCambio() {
/*  322 */     return this.cambio;
/*      */   }
/*      */   
/*      */   public void setCambio(Double cambio) {
/*  326 */     this.cambio = cambio;
/*      */   }
/*      */   
/*      */   public String getCausale() {
/*  330 */     return this.causale;
/*      */   }
/*      */   
/*      */   public void setCausale(String causale) {
/*  334 */     this.causale = causale;
/*      */   }
/*      */   
/*      */   public String getCc() {
/*  338 */     return this.cc;
/*      */   }
/*      */   
/*      */   public void setCc(String cc) {
/*  342 */     this.cc = cc;
/*      */   }
/*      */   
/*      */   public String getChiaveExt() {
/*  346 */     return this.chiaveExt;
/*      */   }
/*      */   
/*      */   public void setChiaveExt(String chiaveExt) {
/*  350 */     this.chiaveExt = chiaveExt;
/*      */   }
/*      */   
/*      */   public String getCodClienteExt() {
/*  354 */     return this.codClienteExt;
/*      */   }
/*      */   
/*      */   public void setCodClienteExt(String codClienteExt) {
/*  358 */     this.codClienteExt = codClienteExt;
/*      */   }
/*      */   
/*      */   public String getCodCollocatore() {
/*  362 */     return this.codCollocatore;
/*      */   }
/*      */   
/*      */   public void setCodCollocatore(String codCollocatore) {
/*  366 */     this.codCollocatore = codCollocatore;
/*      */   }
/*      */   
/*      */   public String getCodFondo() {
/*  370 */     return this.codFondo;
/*      */   }
/*      */   
/*      */   public void setCodFondo(String codFondo) {
/*  374 */     this.codFondo = codFondo;
/*      */   }
/*      */   
/*      */   public String getCodFondoSw() {
/*  378 */     return this.codFondoSw;
/*      */   }
/*      */   
/*      */   public void setCodFondoSw(String codFondoSw) {
/*  382 */     this.codFondoSw = codFondoSw;
/*      */   }
/*      */   
/*      */   public Integer getCodIstituto() {
/*  386 */     return this.codIstituto;
/*      */   }
/*      */   
/*      */   public void setCodIstituto(Integer codIstituto) {
/*  390 */     this.codIstituto = codIstituto;
/*      */   }
/*      */   
/*      */   public String getCodicePromotore() {
/*  394 */     return this.codicePromotore;
/*      */   }
/*      */   
/*      */   public void setCodicePromotore(String codicePromotore) {
/*  398 */     this.codicePromotore = codicePromotore;
/*      */   }
/*      */   
/*      */   public Double getCommBcaColloca() {
/*  402 */     return this.commBcaColloca;
/*      */   }
/*      */   
/*      */   public void setCommBcaColloca(Double commBcaColloca) {
/*  406 */     this.commBcaColloca = commBcaColloca;
/*      */   }
/*      */   
/*      */   public Double getCommConversione() {
/*  410 */     return this.commConversione;
/*      */   }
/*      */   
/*      */   public void setCommConversione(Double commConversione) {
/*  414 */     this.commConversione = commConversione;
/*      */   }
/*      */   
/*      */   public Double getCommIngresso() {
/*  418 */     return this.commIngresso;
/*      */   }
/*      */   
/*      */   public void setCommIngresso(Double commIngresso) {
/*  422 */     this.commIngresso = commIngresso;
/*      */   }
/*      */   
/*      */   public Double getCommIntervento() {
/*  426 */     return this.commIntervento;
/*      */   }
/*      */   
/*      */   public void setCommIntervento(Double commIntervento) {
/*  430 */     this.commIntervento = commIntervento;
/*      */   }
/*      */   
/*      */   public Double getCommMantenimento() {
/*  434 */     return this.commMantenimento;
/*      */   }
/*      */   
/*      */   public void setCommMantenimento(Double commMantenimento) {
/*  438 */     this.commMantenimento = commMantenimento;
/*      */   }
/*      */   
/*      */   public Double getCommPerformance() {
/*  442 */     return this.commPerformance;
/*      */   }
/*      */   
/*      */   public void setCommPerformance(Double commPerformance) {
/*  446 */     this.commPerformance = commPerformance;
/*      */   }
/*      */   
/*      */   public Double getCommRimborso() {
/*  450 */     return this.commRimborso;
/*      */   }
/*      */   
/*      */   public void setCommRimborso(Double commRimborso) {
/*  454 */     this.commRimborso = commRimborso;
/*      */   }
/*      */   
/*      */   public Double getCommSocGest() {
/*  458 */     return this.commSocGest;
/*      */   }
/*      */   
/*      */   public void setCommSocGest(Double commSocGest) {
/*  462 */     this.commSocGest = commSocGest;
/*      */   }
/*      */   
/*      */   public Double getCommValuta() {
/*  466 */     return this.commValuta;
/*      */   }
/*      */   
/*      */   public void setCommValuta(Double commValuta) {
/*  470 */     this.commValuta = commValuta;
/*      */   }
/*      */   
/*      */   public Double getCommissione() {
/*  474 */     return this.commissione;
/*      */   }
/*      */   
/*      */   public void setCommissione(Double commissione) {
/*  478 */     this.commissione = commissione;
/*      */   }
/*      */   
/*      */   public Date getDataCambioConferm() {
/*  482 */     return this.dataCambioConferm;
/*      */   }
/*      */   
/*      */   public void setDataCambioConferm(Date dataCambioConferm) {
/*  486 */     this.dataCambioConferm = dataCambioConferm;
/*      */   }
/*      */   
/*      */   public Date getDataCambio() {
/*  490 */     return this.dataCambio;
/*      */   }
/*      */   
/*      */   public void setDataCambio(Date dataCambio) {
/*  494 */     this.dataCambio = dataCambio;
/*      */   }
/*      */   
/*      */   public Date getDataCambioFisc() {
/*  498 */     return this.dataCambioFisc;
/*      */   }
/*      */   
/*      */   public void setDataCambioFisc(Date dataCambioFisc) {
/*  502 */     this.dataCambioFisc = dataCambioFisc;
/*      */   }
/*      */   
/*      */   public Date getDataCambioSwitch() {
/*  506 */     return this.dataCambioSwitch;
/*      */   }
/*      */   
/*      */   public void setDataCambioSwitch(Date dataCambioSwitch) {
/*  510 */     this.dataCambioSwitch = dataCambioSwitch;
/*      */   }
/*      */   
/*      */   public Date getDataCaricamento() {
/*  514 */     return this.dataCaricamento;
/*      */   }
/*      */   
/*      */   public void setDataCaricamento(Date dataCaricamento) {
/*  518 */     this.dataCaricamento = dataCaricamento;
/*      */   }
/*      */   
/*      */   public Date getDataRegolamento() {
/*  522 */     return this.dataRegolamento;
/*      */   }
/*      */   
/*      */   public void setDataRegolamento(Date dataRegolamento) {
/*  526 */     this.dataRegolamento = dataRegolamento;
/*      */   }
/*      */   
/*      */   public Date getDataOperazione() {
/*  530 */     return this.dataOperazione;
/*      */   }
/*      */   
/*      */   public void setDataOperazione(Date dataOperazione) {
/*  534 */     this.dataOperazione = dataOperazione;
/*      */   }
/*      */   
/*      */   public Date getDataSottoscrizione() {
/*  538 */     return this.dataSottoscrizione;
/*      */   }
/*      */   
/*      */   public void setDataSottoscrizione(Date dataSottoscrizione) {
/*  542 */     this.dataSottoscrizione = dataSottoscrizione;
/*      */   }
/*      */   
/*      */   public String getDivisa() {
/*  546 */     return this.divisa;
/*      */   }
/*      */   
/*      */   public void setDivisa(String divisa) {
/*  550 */     this.divisa = divisa;
/*      */   }
/*      */   
/*      */   public Integer getFlxId() {
/*  554 */     return this.flxId;
/*      */   }
/*      */   
/*      */   public void setFlxId(Integer flxId) {
/*  558 */     this.flxId = flxId;
/*      */   }
/*      */   
/*      */   public Double getImpMinusvalFisc() {
/*  562 */     return this.impMinusvalFisc;
/*      */   }
/*      */   
/*      */   public void setImpMinusvalFisc(Double impMinusvalFisc) {
/*  566 */     this.impMinusvalFisc = impMinusvalFisc;
/*      */   }
/*      */   
/*      */   public Double getImpPlusvalFisc() {
/*  570 */     return this.impPlusvalFisc;
/*      */   }
/*      */   
/*      */   public void setImpPlusvalFisc(Double impPlusvalFisc) {
/*  574 */     this.impPlusvalFisc = impPlusvalFisc;
/*      */   }
/*      */   
/*      */   public Double getImporto() {
/*  578 */     return this.importo;
/*      */   }
/*      */   
/*      */   public void setImporto(Double importo) {
/*  582 */     this.importo = importo;
/*      */   }
/*      */   
/*      */   public Double getImportoLordoValuta() {
/*  586 */     return this.importoLordoValuta;
/*      */   }
/*      */   
/*      */   public void setImportoLordoValuta(Double importoLordoValuta) {
/*  590 */     this.importoLordoValuta = importoLordoValuta;
/*      */   }
/*      */   
/*      */   public String getIstanza() {
/*  594 */     return this.istanza;
/*      */   }
/*      */   
/*      */   public void setIstanza(String istanza) {
/*  598 */     this.istanza = istanza;
/*      */   }
/*      */   
/*      */   public String getMezzoPagamento() {
/*  602 */     return this.mezzoPagamento;
/*      */   }
/*      */   
/*      */   public void setMezzoPagamento(String mezzoPagamento) {
/*  606 */     this.mezzoPagamento = mezzoPagamento;
/*      */   }
/*      */   
/*      */   public String getContrattoExt() {
/*  610 */     return this.contrattoExt;
/*      */   }
/*      */   
/*      */   public void setContrattoExt(String contrattoExt) {
/*  614 */     this.contrattoExt = contrattoExt;
/*      */   }
/*      */   
/*      */   public String getNumOperazione() {
/*  618 */     return this.numOperazione;
/*      */   }
/*      */   
/*      */   public void setNumOperazione(String numOperazione) {
/*  622 */     this.numOperazione = numOperazione;
/*      */   }
/*      */   
/*      */   public Integer getNumeroCertificato() {
/*  626 */     return this.numeroCertificato;
/*      */   }
/*      */   
/*      */   public void setNumeroCertificato(Integer numeroCertificato) {
/*  630 */     this.numeroCertificato = numeroCertificato;
/*      */   }
/*      */   
/*      */   public Integer getNumeroRate() {
/*  634 */     return this.numeroRate;
/*      */   }
/*      */   
/*      */   public void setNumeroRate(Integer numeroRate) {
/*  638 */     this.numeroRate = numeroRate;
/*      */   }
/*      */   
/*      */   public Integer getNumeroRecord() {
/*  642 */     return this.numeroRecord;
/*      */   }
/*      */   
/*      */   public void setNumeroRecord(Integer numeroRecord) {
/*  646 */     this.numeroRecord = numeroRecord;
/*      */   }
/*      */   
/*      */   public String getNumeroSottoscrizione() {
/*  650 */     return this.numeroSottoscrizione;
/*      */   }
/*      */   
/*      */   public void setNumeroSottoscrizione(String numeroSottoscrizione) {
/*  654 */     this.numeroSottoscrizione = numeroSottoscrizione;
/*      */   }
/*      */   
/*      */   public Double getPrezzo() {
/*  658 */     return this.prezzo;
/*      */   }
/*      */   
/*      */   public void setPrezzo(Double prezzo) {
/*  662 */     this.prezzo = prezzo;
/*      */   }
/*      */   
/*      */   public Integer getProgInvioCollocatore() {
/*  666 */     return this.progInvioCollocatore;
/*      */   }
/*      */   
/*      */   public void setProgInvioCollocatore(Integer progInvioCollocatore) {
/*  670 */     this.progInvioCollocatore = progInvioCollocatore;
/*      */   }
/*      */   
/*      */   public Double getQuantita() {
/*  674 */     return this.quantita;
/*      */   }
/*      */   
/*      */   public void setQuantita(Double quantita) {
/*  678 */     this.quantita = quantita;
/*      */   }
/*      */   
/*      */   public Double getRitenutaFisc() {
/*  682 */     return this.ritenutaFisc;
/*      */   }
/*      */   
/*      */   public void setRitenutaFisc(Double ritenutaFisc) {
/*  686 */     this.ritenutaFisc = ritenutaFisc;
/*      */   }
/*      */   
/*      */   public Double getSpeseBcaColloca() {
/*  690 */     return this.speseBcaColloca;
/*      */   }
/*      */   
/*      */   public void setSpeseBcaColloca(Double speseBcaColloca) {
/*  694 */     this.speseBcaColloca = speseBcaColloca;
/*      */   }
/*      */   
/*      */   public Double getSpeseBcaCorr() {
/*  698 */     return this.speseBcaCorr;
/*      */   }
/*      */   
/*      */   public void setSpeseBcaCorr(Double speseBcaCorr) {
/*  702 */     this.speseBcaCorr = speseBcaCorr;
/*      */   }
/*      */   
/*      */   public Double getSpeseEmisCertf() {
/*  706 */     return this.speseEmisCertf;
/*      */   }
/*      */   
/*      */   public void setSpeseEmisCertf(Double speseEmisCertf) {
/*  710 */     this.speseEmisCertf = speseEmisCertf;
/*      */   }
/*      */   
/*      */   public Double getSpeseFondo() {
/*  714 */     return this.speseFondo;
/*      */   }
/*      */   
/*      */   public void setSpeseFondo(Double speseFondo) {
/*  718 */     this.speseFondo = speseFondo;
/*      */   }
/*      */   
/*      */   public Double getSpeseGeneriche() {
/*  722 */     return this.speseGeneriche;
/*      */   }
/*      */   
/*      */   public void setSpeseGeneriche(Double speseGeneriche) {
/*  726 */     this.speseGeneriche = speseGeneriche;
/*      */   }
/*      */   
/*      */   public Double getSpeseSocGest() {
/*  730 */     return this.speseSocGest;
/*      */   }
/*      */   
/*      */   public void setSpeseSocGest(Double speseSocGest) {
/*  734 */     this.speseSocGest = speseSocGest;
/*      */   }
/*      */   
/*      */   public Double getSpeseTipoPag() {
/*  738 */     return this.speseTipoPag;
/*      */   }
/*      */   
/*      */   public void setSpeseTipoPag(Double speseTipoPag) {
/*  742 */     this.speseTipoPag = speseTipoPag;
/*      */   }
/*      */   
/*      */   public String getStatoElab() {
/*  746 */     return this.statoElab;
/*      */   }
/*      */   
/*      */   public void setStatoElab(String statoElab) {
/*  750 */     this.statoElab = statoElab;
/*      */   }
/*      */   
/*      */   public Double getTassoCambioSwitch() {
/*  754 */     return this.tassoCambioSwitch;
/*      */   }
/*      */   
/*      */   public void setTassoCambioSwitch(Double tassoCambioSwitch) {
/*  758 */     this.tassoCambioSwitch = tassoCambioSwitch;
/*      */   }
/*      */   
/*      */   public Integer getTipoOperazione() {
/*  762 */     return this.tipoOperazione;
/*      */   }
/*      */   
/*      */   public void setTipoOperazione(Integer tipoOperazione) {
/*  766 */     this.tipoOperazione = tipoOperazione;
/*      */   }
/*      */   
/*      */   public String getTipoOpzioneFisc() {
/*  770 */     return this.tipoOpzioneFisc;
/*      */   }
/*      */   
/*      */   public void setTipoOpzioneFisc(String tipoOpzioneFisc) {
/*  774 */     this.tipoOpzioneFisc = tipoOpzioneFisc;
/*      */   }
/*      */   
/*      */   public Integer getTipoRecord() {
/*  778 */     return this.tipoRecord;
/*      */   }
/*      */   
/*      */   public void setTipoRecord(Integer tipoRecord) {
/*  782 */     this.tipoRecord = tipoRecord;
/*      */   }
/*      */   
/*      */   public Double getImportoNetto() {
/*  786 */     return this.importoNetto;
/*      */   }
/*      */   
/*      */   public void setImportoNetto(Double importoNetto) {
/*  790 */     this.importoNetto = importoNetto;
/*      */   }
/*      */   
/*      */   public String getDescrizioneErrore() {
/*  794 */     return this.descrizioneErrore;
/*      */   }
/*      */   
/*      */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  798 */     this.descrizioneErrore = descrizioneErrore;
/*      */   }
/*      */   
/*      */   public String getCodEmittente() {
/*  802 */     return this.codEmittente;
/*      */   }
/*      */   
/*      */   public void setCodEmittente(String codEmittente) {
/*  806 */     this.codEmittente = codEmittente;
/*      */   }
/*      */   
/*      */   public String getCodEmittenteEsterno() {
/*  810 */     return this.codEmittenteEsterno;
/*      */   }
/*      */   
/*      */   public void setCodEmittenteEsterno(String codEmittenteEsterno) {
/*  814 */     this.codEmittenteEsterno = codEmittenteEsterno;
/*      */   }
/*      */   
/*      */   public String toString() {
/*  818 */     return (new ToStringBuilder(this)).append("movimentoinboundId", getMovimentoinboundId()).toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodIsin() {
/*  824 */     return this.codIsin;
/*      */   }
/*      */   
/*      */   public void setCodIsin(String codIsin) {
/*  828 */     this.codIsin = codIsin;
/*      */   }
/*      */   
/*      */   public Integer getQuoLibCont() {
/*  832 */     return this.quoLibCont;
/*      */   }
/*      */   
/*      */   public void setQuoLibCont(Integer quoLibCont) {
/*  836 */     this.quoLibCont = quoLibCont;
/*      */   }
/*      */   
/*      */   public String getTipoQuote() {
/*  840 */     return this.tipoQuote;
/*      */   }
/*      */   
/*      */   public void setTipoQuote(String tipoQuote) {
/*  844 */     this.tipoQuote = tipoQuote;
/*      */   }
/*      */   
/*      */   public String getNumRifEnteExt() {
/*  848 */     return this.numRifEnteExt;
/*      */   }
/*      */   
/*      */   public void setNumRifEnteExt(String numRifEnteExt) {
/*  852 */     this.numRifEnteExt = numRifEnteExt;
/*      */   }
/*      */   
/*      */   public Integer getIdTempMov() {
/*  856 */     return this.idTempMov;
/*      */   }
/*      */   
/*      */   public void setIdTempMov(Integer idTempMov) {
/*  860 */     this.idTempMov = idTempMov;
/*      */   }
/*      */   
/*      */   public String getOrdineId() {
/*  864 */     return this.ordineId;
/*      */   }
/*      */   
/*      */   public void setOrdineId(String ordineId) {
/*  868 */     this.ordineId = ordineId;
/*      */   }
/*      */   
/*      */   public Double getPrezzoValuta() {
/*  872 */     return this.prezzoValuta;
/*      */   }
/*      */   
/*      */   public void setPrezzoValuta(Double prezzoValuta) {
/*  876 */     this.prezzoValuta = prezzoValuta;
/*      */   }
/*      */   
/*      */   public Double getSpeseGenericheValuta() {
/*  880 */     return this.speseGenericheValuta;
/*      */   }
/*      */   
/*      */   public void setSpeseGenericheValuta(Double speseGenericheValuta) {
/*  884 */     this.speseGenericheValuta = speseGenericheValuta;
/*      */   }
/*      */   
/*      */   public Double getScontoQuoteTunnel() {
/*  888 */     return this.scontoQuoteTunnel;
/*      */   }
/*      */   
/*      */   public void setScontoQuoteTunnel(Double scontoQuoteTunnel) {
/*  892 */     this.scontoQuoteTunnel = scontoQuoteTunnel;
/*      */   }
/*      */   
/*      */   public Integer getSottoscrizioneId() {
/*  896 */     return this.sottoscrizioneId;
/*      */   }
/*      */   
/*      */   public void setSottoscrizioneId(Integer sottoscrizioneId) {
/*  900 */     this.sottoscrizioneId = sottoscrizioneId;
/*      */   }
/*      */   
/*      */   public Double getImportoNettoValuta() {
/*  904 */     return this.importoNettoValuta;
/*      */   }
/*      */   
/*      */   public void setImportoNettoValuta(Double importoNettoValuta) {
/*  908 */     this.importoNettoValuta = importoNettoValuta;
/*      */   }
/*      */   
/*      */   public Double getCambioCommissioni() {
/*  912 */     return this.cambioCommissioni;
/*      */   }
/*      */   
/*      */   public void setCambioCommissioni(Double cambioCommissioni) {
/*  916 */     this.cambioCommissioni = cambioCommissioni;
/*      */   }
/*      */   
/*      */   public Double getRitenutaFiscValuta() {
/*  920 */     return this.ritenutaFiscValuta;
/*      */   }
/*      */   
/*      */   public void setRitenutaFiscValuta(Double ritenutaFiscValuta) {
/*  924 */     this.ritenutaFiscValuta = ritenutaFiscValuta;
/*      */   }
/*      */   
/*      */   public String getDivisaCommissioni() {
/*  928 */     return this.divisaCommissioni;
/*      */   }
/*      */   
/*      */   public void setDivisaCommissioni(String divisaCommissioni) {
/*  932 */     this.divisaCommissioni = divisaCommissioni;
/*      */   }
/*      */   
/*      */   public Double getCambioDivLorSuEur() {
/*  936 */     return this.cambioDivLorSuEur;
/*      */   }
/*      */   
/*      */   public void setCambioDivLorSuEur(Double cambioDivLorSuEur) {
/*  940 */     this.cambioDivLorSuEur = cambioDivLorSuEur;
/*      */   }
/*      */   
/*      */   public String getCodiceDivLor() {
/*  944 */     return this.codiceDivLor;
/*      */   }
/*      */   
/*      */   public void setCodiceDivLor(String codiceDivLor) {
/*  948 */     this.codiceDivLor = codiceDivLor;
/*      */   }
/*      */   
/*      */   public String getCrap() {
/*  952 */     return this.crap;
/*      */   }
/*      */   
/*      */   public void setCrap(String crap) {
/*  956 */     this.crap = crap;
/*      */   }
/*      */   
/*      */   public Date getDataCambioDivisaLordo() {
/*  960 */     return this.dataCambioDivisaLordo;
/*      */   }
/*      */   
/*      */   public void setDataCambioDivisaLordo(Date dataCambioDivisaLordo) {
/*  964 */     this.dataCambioDivisaLordo = dataCambioDivisaLordo;
/*      */   }
/*      */   
/*      */   public Date getDataStorno() {
/*  968 */     return this.dataStorno;
/*      */   }
/*      */   
/*      */   public void setDataStorno(Date dataStorno) {
/*  972 */     this.dataStorno = dataStorno;
/*      */   }
/*      */   
/*      */   public String getDescrCausale() {
/*  976 */     return this.descrCausale;
/*      */   }
/*      */   
/*      */   public void setDescrCausale(String descrCausale) {
/*  980 */     this.descrCausale = descrCausale;
/*      */   }
/*      */   
/*      */   public Date getDataValuta() {
/*  984 */     return this.dataValuta;
/*      */   }
/*      */   
/*      */   public void setDataValuta(Date dataValuta) {
/*  988 */     this.dataValuta = dataValuta;
/*      */   }
/*      */   
/*      */   public Integer getCodrgRam() {
/*  992 */     return this.codrgRam;
/*      */   }
/*      */   
/*      */   public void setCodrgRam(Integer codrgRam) {
/*  996 */     this.codrgRam = codrgRam;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getNumQuoCert() {
/* 1004 */     return this.numQuoCert;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumQuoCert(Double numQuoCert) {
/* 1010 */     this.numQuoCert = numQuoCert;
/*      */   }
/*      */   
/*      */   public Integer getNdispRam() {
/* 1014 */     return this.ndispRam;
/*      */   }
/*      */   
/*      */   public void setNdispRam(Integer ndispRam) {
/* 1018 */     this.ndispRam = ndispRam;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinMovimentoInBound.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */