/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinServizioAggiuntivo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String Rid = "RID";
/*     */   public static final String RimborsoProgrammato = "RIP";
/*     */   public static final String SwitchProgrammato = "SWP";
/*     */   public static final String TIPO_FLUSSO_CONTOMAT = "Contomat";
/*     */   public static final String TIPO_FLUSSO_PAC = "Pac";
/*     */   public static final String STATO_ATTIVO = "A";
/*     */   public static final String STATO_DISATTIVO = "D";
/*  22 */   public static final Integer STATO_RID_ATTIVO = new Integer(1);
/*  23 */   public static final Integer STATO_RID_DISATTIVO = new Integer(0);
/*     */   
/*     */   private Integer servAggiunId;
/*     */   
/*     */   private Integer numDispArco;
/*     */   
/*     */   private String tipoOperazione;
/*     */   
/*     */   private Double importoPrelievo;
/*     */   
/*     */   private Double importo;
/*     */   
/*     */   private String numeroPolizza;
/*     */   
/*     */   private Date dataAttivazione;
/*     */   
/*     */   private Date dataFineAttivazione;
/*     */   
/*     */   private Date dataPrelievo;
/*     */   
/*     */   private String cinIban;
/*     */   
/*     */   private String mezzoPagamento;
/*     */   
/*     */   private Integer periodicita;
/*     */   
/*     */   private String flagFineMese;
/*     */   
/*     */   private String abi;
/*     */   
/*     */   private String cab;
/*     */   
/*     */   private String numeroCc;
/*     */   
/*     */   private String intestatarioCcRam;
/*     */   private Double quote;
/*     */   private String percentualiEntrata;
/*     */   private Integer numeroTrasferimenti;
/*     */   private String checkDigitIban;
/*     */   private String posizioniEntrata;
/*     */   private String posizioniUscita;
/*     */   private Integer statoRid;
/*     */   private Double importoSwitch;
/*     */   private Double importoRid;
/*     */   private String fondoEntrata;
/*     */   private String fondoUscita;
/*     */   private Integer scontoComm;
/*     */   private String banca;
/*     */   private Integer scadenzaRid;
/*     */   private String flagBenestare;
/*     */   private String tipoServizio;
/*     */   private Integer compagniaDestId;
/*     */   private String tipoRimborso;
/*     */   private Date dataInizioPagamento;
/*     */   private String numContrDestinazione;
/*     */   private String numAssegno;
/*     */   private Date dataVersamento;
/*     */   private Set sottoscrServAgg;
/*     */   private FinSoggetto soggetto;
/*     */   private String codicePaeseIban;
/*     */   private Integer numeroPrelievi;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String tipoFlusso;
/*     */   private String stato;
/*     */   private Date dataCreazioneDisp;
/*     */   private Integer numProgressivo;
/*     */   private FinPosizione posizione;
/*     */   private FinPosizione posizioneUscita;
/*     */   private Double giacenzaMedia;
/*     */   private Double giacenzaMinima;
/*     */   private Double giacenzaMassima;
/*     */   private String indirizzoInvio;
/*     */   private String comune;
/*     */   private String provincia;
/*     */   private String nazione;
/*     */   private String cap;
/*     */   private String sospendiDopo;
/*     */   private String flagInvestimento;
/*     */   private String codiceSocieta;
/*     */   private String denominazione;
/*     */   
/*     */   public FinPosizione getPosizione() {
/* 106 */     return this.posizione;
/*     */   }
/*     */   
/*     */   public void setPosizione(FinPosizione posizione) {
/* 110 */     this.posizione = posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizione getPosizioneUscita() {
/* 118 */     return this.posizioneUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizioneUscita(FinPosizione posizioneUscita) {
/* 124 */     this.posizioneUscita = posizioneUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStatoRid() {
/* 130 */     return this.statoRid;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoRid(Integer statoRid) {
/* 136 */     this.statoRid = statoRid;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumProgressivo() {
/* 142 */     return this.numProgressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumProgressivo(Integer numProgressivo) {
/* 148 */     this.numProgressivo = numProgressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStato() {
/* 154 */     return this.stato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStato(String stato) {
/* 160 */     this.stato = stato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoFlusso() {
/* 167 */     return this.tipoFlusso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoFlusso(String tipoFlusso) {
/* 173 */     this.tipoFlusso = tipoFlusso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinServizioAggiuntivo() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAbi() {
/* 188 */     return this.abi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAbi(String abi) {
/* 194 */     this.abi = abi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCab() {
/* 200 */     return this.cab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCab(String cab) {
/* 206 */     this.cab = cab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCheckDigitIban() {
/* 212 */     return this.checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCheckDigitIban(String checkDigitIban) {
/* 218 */     this.checkDigitIban = checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePaeseIban() {
/* 224 */     return this.codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePaeseIban(String codicePaeseIban) {
/* 230 */     this.codicePaeseIban = codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataAttivazione() {
/* 237 */     return this.dataAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataAttivazione(Date dataAttivazione) {
/* 243 */     this.dataAttivazione = dataAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFineAttivazione() {
/* 249 */     return this.dataFineAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFineAttivazione(Date dataFineAttivazione) {
/* 255 */     this.dataFineAttivazione = dataFineAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPrelievo() {
/* 262 */     return this.dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPrelievo(Date dataPrelievo) {
/* 268 */     this.dataPrelievo = dataPrelievo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagFineMese() {
/* 274 */     return this.flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagFineMese(String flagFineMese) {
/* 280 */     this.flagFineMese = flagFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroCc() {
/* 287 */     return this.numeroCc;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroCc(String numeroCc) {
/* 293 */     this.numeroCc = numeroCc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIntestatarioCcRam() {
/* 300 */     return this.intestatarioCcRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIntestatarioCcRam(String intestatarioCcRam) {
/* 306 */     this.intestatarioCcRam = intestatarioCcRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroPolizza() {
/* 312 */     return this.numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPolizza(String numeroPolizza) {
/* 318 */     this.numeroPolizza = numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumeroPrelievi() {
/* 324 */     return this.numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPrelievi(Integer numeroPrelievi) {
/* 330 */     this.numeroPrelievi = numeroPrelievi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumeroTrasferimenti() {
/* 336 */     return this.numeroTrasferimenti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroTrasferimenti(Integer numeroTrasferimenti) {
/* 342 */     this.numeroTrasferimenti = numeroTrasferimenti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualiEntrata() {
/* 348 */     return this.percentualiEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualiEntrata(String percentualiEntrata) {
/* 354 */     this.percentualiEntrata = percentualiEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPeriodicita() {
/* 360 */     return this.periodicita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPeriodicita(Integer periodicita) {
/* 366 */     this.periodicita = periodicita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getServAggiunId() {
/* 374 */     return this.servAggiunId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setServAggiunId(Integer servAggiunId) {
/* 380 */     this.servAggiunId = servAggiunId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 386 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 392 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMezzoPagamento() {
/* 398 */     return this.mezzoPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMezzoPagamento(String mezzoPagamento) {
/* 404 */     this.mezzoPagamento = mezzoPagamento;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 408 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 412 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 416 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 420 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumDispArco() {
/* 428 */     return this.numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDispArco(Integer numDispArco) {
/* 434 */     this.numDispArco = numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCreazioneDisp() {
/* 440 */     return this.dataCreazioneDisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCreazioneDisp(Date dataCreazioneDisp) {
/* 446 */     this.dataCreazioneDisp = dataCreazioneDisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCinIban() {
/* 452 */     return this.cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCinIban(String cinIban) {
/* 458 */     this.cinIban = cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPosizioniEntrata() {
/* 464 */     return this.posizioniEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizioniEntrata(String posizioniEntrata) {
/* 470 */     this.posizioniEntrata = posizioniEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPosizioniUscita() {
/* 476 */     return this.posizioniUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizioniUscita(String posizioniUscita) {
/* 482 */     this.posizioniUscita = posizioniUscita;
/*     */   }
/*     */   public String getBanca() {
/* 485 */     return this.banca;
/*     */   }
/*     */   public void setBanca(String banca) {
/* 488 */     this.banca = banca;
/*     */   }
/*     */   public String getFondoEntrata() {
/* 491 */     return this.fondoEntrata;
/*     */   }
/*     */   public void setFondoEntrata(String fondoEntrata) {
/* 494 */     this.fondoEntrata = fondoEntrata;
/*     */   }
/*     */   public String getFondoUscita() {
/* 497 */     return this.fondoUscita;
/*     */   }
/*     */   public void setFondoUscita(String fondoUscita) {
/* 500 */     this.fondoUscita = fondoUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinServizioAggiuntivo(String abi, String banca, String cab, String iban, String iban2, String iban3, Date attivazione, Date disp, Date attivazione2, Date inserimento, Date prelievo, String benestare, String mese, String entrata, String uscita, Double importo, Double prelievo2, Double rid, Double switch1, Integer arco, String cc, String polizza, Integer prelievi, Integer trasferimenti, Integer progressivo, String entrata2, Integer periodicita, String entrata3, String uscita2, Double quote, Integer rid2, Integer comm, Integer id, Set sottoscrServAgg, String stato, Integer rid3, String flusso, String operazione, String pagamento, String servizio, String inserimento2, Double giacenzaMedia, Double giacenzaMinima, Double giacenzaMassima, FinSoggetto soggetto) {
/* 506 */     this.abi = abi;
/* 507 */     this.banca = banca;
/* 508 */     this.cab = cab;
/* 509 */     this.checkDigitIban = iban;
/* 510 */     this.cinIban = iban2;
/* 511 */     this.codicePaeseIban = iban3;
/*     */     
/* 513 */     this.dataAttivazione = attivazione;
/* 514 */     this.dataCreazioneDisp = disp;
/* 515 */     this.dataFineAttivazione = attivazione2;
/* 516 */     this.dataInserimento = inserimento;
/* 517 */     this.dataPrelievo = prelievo;
/* 518 */     this.flagBenestare = benestare;
/* 519 */     this.flagFineMese = mese;
/* 520 */     this.fondoEntrata = entrata;
/* 521 */     this.fondoUscita = uscita;
/* 522 */     this.importo = importo;
/* 523 */     this.importoPrelievo = prelievo2;
/* 524 */     this.importoRid = rid;
/* 525 */     this.importoSwitch = switch1;
/* 526 */     this.numDispArco = arco;
/* 527 */     this.numeroCc = cc;
/* 528 */     this.numeroPolizza = polizza;
/* 529 */     this.numeroPrelievi = prelievi;
/* 530 */     this.numeroTrasferimenti = trasferimenti;
/* 531 */     this.numProgressivo = progressivo;
/* 532 */     this.percentualiEntrata = entrata2;
/* 533 */     this.periodicita = periodicita;
/* 534 */     this.posizioniEntrata = entrata3;
/* 535 */     this.posizioniUscita = uscita2;
/* 536 */     this.quote = quote;
/* 537 */     this.scadenzaRid = rid2;
/* 538 */     this.scontoComm = comm;
/* 539 */     this.servAggiunId = id;
/* 540 */     this.sottoscrServAgg = sottoscrServAgg;
/* 541 */     this.stato = stato;
/* 542 */     this.statoRid = rid3;
/* 543 */     this.tipoFlusso = flusso;
/* 544 */     this.tipoOperazione = operazione;
/* 545 */     this.mezzoPagamento = pagamento;
/* 546 */     this.tipoServizio = servizio;
/* 547 */     this.utenteInserimento = inserimento2;
/* 548 */     this.giacenzaMedia = giacenzaMedia;
/* 549 */     this.giacenzaMinima = giacenzaMinima;
/* 550 */     this.giacenzaMassima = giacenzaMassima;
/* 551 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public Double getImporto() {
/* 555 */     return this.importo;
/*     */   }
/*     */   public void setImporto(Double importo) {
/* 558 */     this.importo = importo;
/*     */   }
/*     */   public Double getImportoPrelievo() {
/* 561 */     return this.importoPrelievo;
/*     */   }
/*     */   public void setImportoPrelievo(Double importoPrelievo) {
/* 564 */     this.importoPrelievo = importoPrelievo;
/*     */   }
/*     */   public Double getImportoRid() {
/* 567 */     return this.importoRid;
/*     */   }
/*     */   public void setImportoRid(Double importoRid) {
/* 570 */     this.importoRid = importoRid;
/*     */   }
/*     */   public Double getImportoSwitch() {
/* 573 */     return this.importoSwitch;
/*     */   }
/*     */   public void setImportoSwitch(Double importoSwitch) {
/* 576 */     this.importoSwitch = importoSwitch;
/*     */   }
/*     */   public Double getQuote() {
/* 579 */     return this.quote;
/*     */   }
/*     */   public void setQuote(Double quote) {
/* 582 */     this.quote = quote;
/*     */   }
/*     */   public Integer getScadenzaRid() {
/* 585 */     return this.scadenzaRid;
/*     */   }
/*     */   public void setScadenzaRid(Integer scadenzaRid) {
/* 588 */     this.scadenzaRid = scadenzaRid;
/*     */   }
/*     */   public Integer getScontoComm() {
/* 591 */     return this.scontoComm;
/*     */   }
/*     */   public void setScontoComm(Integer scontoComm) {
/* 594 */     this.scontoComm = scontoComm;
/*     */   }
/*     */   public String getFlagBenestare() {
/* 597 */     return this.flagBenestare;
/*     */   }
/*     */   public void setFlagBenestare(String flagBenestare) {
/* 600 */     this.flagBenestare = flagBenestare;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoServizio() {
/* 606 */     return this.tipoServizio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoServizio(String tipoServizio) {
/* 612 */     this.tipoServizio = tipoServizio;
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
/*     */   public Set getSottoscrServAgg() {
/* 625 */     return this.sottoscrServAgg;
/*     */   }
/*     */   public void setSottoscrServAgg(Set sottoscrServAgg) {
/* 628 */     this.sottoscrServAgg = sottoscrServAgg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCompagniaDestId() {
/* 634 */     return this.compagniaDestId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCompagniaDestId(Integer compagniaDestId) {
/* 640 */     this.compagniaDestId = compagniaDestId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getGiacenzaMassima() {
/* 647 */     return this.giacenzaMassima;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGiacenzaMassima(Double giacenzaMassima) {
/* 653 */     this.giacenzaMassima = giacenzaMassima;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getGiacenzaMedia() {
/* 659 */     return this.giacenzaMedia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGiacenzaMedia(Double giacenzaMedia) {
/* 665 */     this.giacenzaMedia = giacenzaMedia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getGiacenzaMinima() {
/* 671 */     return this.giacenzaMinima;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGiacenzaMinima(Double giacenzaMinima) {
/* 677 */     this.giacenzaMinima = giacenzaMinima;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRimborso() {
/* 683 */     return this.tipoRimborso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRimborso(String tipoRimborso) {
/* 689 */     this.tipoRimborso = tipoRimborso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioPagamento() {
/* 695 */     return this.dataInizioPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioPagamento(Date dataInizioPagamento) {
/* 701 */     this.dataInizioPagamento = dataInizioPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumContrDestinazione() {
/* 707 */     return this.numContrDestinazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumContrDestinazione(String numContrDestinazione) {
/* 713 */     this.numContrDestinazione = numContrDestinazione;
/*     */   }
/*     */   public FinSoggetto getSoggetto() {
/* 716 */     return this.soggetto;
/*     */   }
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 719 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumAssegno() {
/* 726 */     return this.numAssegno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumAssegno(String numAssegno) {
/* 732 */     this.numAssegno = numAssegno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataVersamento() {
/* 738 */     return this.dataVersamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataVersamento(Date dataVersamento) {
/* 744 */     this.dataVersamento = dataVersamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIndirizzoInvio() {
/* 750 */     return this.indirizzoInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndirizzoInvio(String indirizzoInvio) {
/* 756 */     this.indirizzoInvio = indirizzoInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getComune() {
/* 762 */     return this.comune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComune(String comune) {
/* 768 */     this.comune = comune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvincia() {
/* 774 */     return this.provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 780 */     this.provincia = provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNazione() {
/* 786 */     return this.nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazione(String nazione) {
/* 792 */     this.nazione = nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCap() {
/* 798 */     return this.cap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCap(String cap) {
/* 804 */     this.cap = cap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSospendiDopo() {
/* 810 */     return this.sospendiDopo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSospendiDopo(String sospendiDopo) {
/* 816 */     this.sospendiDopo = sospendiDopo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagInvestimento() {
/* 822 */     return this.flagInvestimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagInvestimento(String flagInvestimento) {
/* 828 */     this.flagInvestimento = flagInvestimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSocieta() {
/* 834 */     return this.codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSocieta(String codiceSocieta) {
/* 840 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDenominazione() {
/* 846 */     return this.denominazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 852 */     this.denominazione = denominazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinServizioAggiuntivo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */