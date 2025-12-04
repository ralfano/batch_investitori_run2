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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxMutuiDB
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String naturaGiuridica;
/*     */   private String codiceFiscale;
/*     */   private String partitaIva;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String sesso;
/*     */   private Date dataNascita;
/*     */   private String indirizzoResidenza;
/*     */   private String cap;
/*     */   private String frazione;
/*     */   private String comune;
/*     */   private String provincia;
/*     */   private String nazione;
/*     */   private String comuneNascita;
/*     */   private String provNascita;
/*     */   private String nazioneNascita;
/*     */   private Integer posizione;
/*     */   private String codiceAbiConto;
/*     */   private String codiceCabConto;
/*     */   private String codiceCinConto;
/*     */   private String numeroContoCorrente;
/*     */   private String tipoMutuo;
/*     */   private String dettaglioTipologia;
/*     */   private String finalitaMutuo;
/*     */   private String tipoGaranzia;
/*     */   private String dettaglioGaranzia;
/*     */   private String flagPromozione;
/*     */   private Date dataAccensioneMutuo;
/*     */   private Date dataScadenzaMutuo;
/*     */   private Date dataChiusuraAnticipata;
/*     */   private Double importoMutuo;
/*     */   private Double patrimonioGarantito;
/*     */   private Double importoRimborsato;
/*     */   private Double importoDaRimborsare;
/*     */   private Double importoProgPagamenti;
/*     */   private Double tasso;
/*     */   private String frequenzaRimborso;
/*     */   private Double importoRata;
/*     */   private Double importoRataAnnuale;
/*     */   private String codicePromotore;
/*     */   private String reteVenditaPromotore;
/*     */   private Double importoProvvigioneUt;
/*     */   private Double minimoGarantitoUt;
/*     */   private Double importoProvvRicorrente;
/*     */   private String convenzione;
/*     */   private Double polizzaAbbinata;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public String getCap() {
/*  74 */     return this.cap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCap(String cap) {
/*  81 */     this.cap = cap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAbiConto() {
/*  88 */     return this.codiceAbiConto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbiConto(String codiceAbiConto) {
/*  95 */     this.codiceAbiConto = codiceAbiConto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCabConto() {
/* 102 */     return this.codiceCabConto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCabConto(String codiceCabConto) {
/* 109 */     this.codiceCabConto = codiceCabConto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCinConto() {
/* 116 */     return this.codiceCinConto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCinConto(String codiceCinConto) {
/* 123 */     this.codiceCinConto = codiceCinConto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceFiscale() {
/* 130 */     return this.codiceFiscale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 137 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePromotore() {
/* 144 */     return this.codicePromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePromotore(String codicePromotore) {
/* 151 */     this.codicePromotore = codicePromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCognome() {
/* 158 */     return this.cognome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCognome(String cognome) {
/* 165 */     this.cognome = cognome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getComune() {
/* 172 */     return this.comune;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComune(String comune) {
/* 179 */     this.comune = comune;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getComuneNascita() {
/* 186 */     return this.comuneNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComuneNascita(String comuneNascita) {
/* 193 */     this.comuneNascita = comuneNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getConvenzione() {
/* 200 */     return this.convenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setConvenzione(String convenzione) {
/* 207 */     this.convenzione = convenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataAccensioneMutuo() {
/* 214 */     return this.dataAccensioneMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataAccensioneMutuo(Date dataAccensioneMutuo) {
/* 221 */     this.dataAccensioneMutuo = dataAccensioneMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 228 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 235 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataChiusuraAnticipata() {
/* 242 */     return this.dataChiusuraAnticipata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataChiusuraAnticipata(Date dataChiusuraAnticipata) {
/* 249 */     this.dataChiusuraAnticipata = dataChiusuraAnticipata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataNascita() {
/* 256 */     return this.dataNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataNascita(Date dataNascita) {
/* 263 */     this.dataNascita = dataNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataScadenzaMutuo() {
/* 270 */     return this.dataScadenzaMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataScadenzaMutuo(Date dataScadenzaMutuo) {
/* 277 */     this.dataScadenzaMutuo = dataScadenzaMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDettaglioGaranzia() {
/* 284 */     return this.dettaglioGaranzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDettaglioGaranzia(String dettaglioGaranzia) {
/* 291 */     this.dettaglioGaranzia = dettaglioGaranzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDettaglioTipologia() {
/* 298 */     return this.dettaglioTipologia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDettaglioTipologia(String dettaglioTipologia) {
/* 305 */     this.dettaglioTipologia = dettaglioTipologia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFinalitaMutuo() {
/* 312 */     return this.finalitaMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFinalitaMutuo(String finalitaMutuo) {
/* 319 */     this.finalitaMutuo = finalitaMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagPromozione() {
/* 326 */     return this.flagPromozione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagPromozione(String flagPromozione) {
/* 333 */     this.flagPromozione = flagPromozione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 340 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 347 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFrazione() {
/* 354 */     return this.frazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrazione(String frazione) {
/* 361 */     this.frazione = frazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFrequenzaRimborso() {
/* 368 */     return this.frequenzaRimborso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrequenzaRimborso(String frequenzaRimborso) {
/* 375 */     this.frequenzaRimborso = frequenzaRimborso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoDaRimborsare() {
/* 382 */     return this.importoDaRimborsare;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoDaRimborsare(Double importoDaRimborsare) {
/* 389 */     this.importoDaRimborsare = importoDaRimborsare;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoMutuo() {
/* 396 */     return this.importoMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoMutuo(Double importoMutuo) {
/* 403 */     this.importoMutuo = importoMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProgPagamenti() {
/* 410 */     return this.importoProgPagamenti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoProgPagamenti(Double importoProgPagamenti) {
/* 417 */     this.importoProgPagamenti = importoProgPagamenti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProvvigioneUt() {
/* 424 */     return this.importoProvvigioneUt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoProvvigioneUt(Double importoProvvigioneUt) {
/* 431 */     this.importoProvvigioneUt = importoProvvigioneUt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProvvRicorrente() {
/* 438 */     return this.importoProvvRicorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoProvvRicorrente(Double importoProvvRicorrente) {
/* 445 */     this.importoProvvRicorrente = importoProvvRicorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoRata() {
/* 452 */     return this.importoRata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoRata(Double importoRata) {
/* 459 */     this.importoRata = importoRata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoRataAnnuale() {
/* 466 */     return this.importoRataAnnuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoRataAnnuale(Double importoRataAnnuale) {
/* 473 */     this.importoRataAnnuale = importoRataAnnuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoRimborsato() {
/* 480 */     return this.importoRimborsato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoRimborsato(Double importoRimborsato) {
/* 487 */     this.importoRimborsato = importoRimborsato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIndirizzoResidenza() {
/* 494 */     return this.indirizzoResidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndirizzoResidenza(String indirizzoResidenza) {
/* 501 */     this.indirizzoResidenza = indirizzoResidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 508 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 515 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getMinimoGarantitoUt() {
/* 522 */     return this.minimoGarantitoUt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinimoGarantitoUt(Double minimoGarantitoUt) {
/* 529 */     this.minimoGarantitoUt = minimoGarantitoUt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNaturaGiuridica() {
/* 536 */     return this.naturaGiuridica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNaturaGiuridica(String naturaGiuridica) {
/* 543 */     this.naturaGiuridica = naturaGiuridica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNazione() {
/* 550 */     return this.nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazione(String nazione) {
/* 557 */     this.nazione = nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNazioneNascita() {
/* 564 */     return this.nazioneNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazioneNascita(String nazioneNascita) {
/* 571 */     this.nazioneNascita = nazioneNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNome() {
/* 578 */     return this.nome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNome(String nome) {
/* 585 */     this.nome = nome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContoCorrente() {
/* 592 */     return this.numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContoCorrente(String numeroContoCorrente) {
/* 599 */     this.numeroContoCorrente = numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPartitaIva() {
/* 606 */     return this.partitaIva;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPartitaIva(String partitaIva) {
/* 613 */     this.partitaIva = partitaIva;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPatrimonioGarantito() {
/* 620 */     return this.patrimonioGarantito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPatrimonioGarantito(Double patrimonioGarantito) {
/* 627 */     this.patrimonioGarantito = patrimonioGarantito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPolizzaAbbinata() {
/* 634 */     return this.polizzaAbbinata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPolizzaAbbinata(Double polizzaAbbinata) {
/* 641 */     this.polizzaAbbinata = polizzaAbbinata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPosizione() {
/* 648 */     return this.posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizione(Integer posizione) {
/* 655 */     this.posizione = posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvincia() {
/* 662 */     return this.provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 669 */     this.provincia = provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvNascita() {
/* 676 */     return this.provNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvNascita(String provNascita) {
/* 683 */     this.provNascita = provNascita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getReteVenditaPromotore() {
/* 690 */     return this.reteVenditaPromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setReteVenditaPromotore(String reteVenditaPromotore) {
/* 697 */     this.reteVenditaPromotore = reteVenditaPromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSesso() {
/* 704 */     return this.sesso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSesso(String sesso) {
/* 711 */     this.sesso = sesso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 718 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 725 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getTasso() {
/* 732 */     return this.tasso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTasso(Double tasso) {
/* 739 */     this.tasso = tasso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoGaranzia() {
/* 746 */     return this.tipoGaranzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoGaranzia(String tipoGaranzia) {
/* 753 */     this.tipoGaranzia = tipoGaranzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoMutuo() {
/* 760 */     return this.tipoMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoMutuo(String tipoMutuo) {
/* 767 */     this.tipoMutuo = tipoMutuo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/* 775 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 783 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 791 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 799 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxMutuiDB.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */