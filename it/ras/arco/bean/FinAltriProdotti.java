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
/*      */ public class FinAltriProdotti
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   private Integer altriProdottiId;
/*      */   private Integer contrattoId;
/*      */   private Integer promotoreSplitId;
/*      */   private String stato;
/*      */   private Date dataRicevimentoProposta;
/*      */   private Date dataRegolamento;
/*      */   private Date dataImpBaseProv;
/*      */   private Date dataChiusura;
/*      */   private Date dataAnnullamento;
/*      */   private Date dataApprovazione;
/*      */   private Date dataInserimento;
/*      */   private Date dataSottoscrizione;
/*      */   private Date dataScadenza;
/*      */   private Integer attivitaFinId;
/*      */   private String tipo;
/*      */   private Integer prodottoId;
/*      */   private String numContrattoSiff;
/*      */   private String numContrattoEsterno;
/*      */   private String numCC;
/*      */   private String abi;
/*      */   private String cab;
/*      */   private Integer soggettoIntId;
/*      */   private String tipoCarta;
/*      */   private Double sportelloBnl;
/*      */   private String codiceConvenzione;
/*      */   private String tipoMutuo;
/*      */   private Double importoContratto;
/*      */   private Double importoRichiesto;
/*      */   private Double importoTot;
/*      */   private Double commissioni;
/*      */   private Double percComm;
/*      */   private Double spese;
/*      */   private String note;
/*      */   private String cope;
/*      */   private String oggettoLocazione;
/*      */   private String filiale;
/*      */   private String plafond;
/*      */   private Date dataFinePlafond;
/*      */   private String descrizione;
/*      */   private String modalitaPagamento;
/*      */   private String codiceTipologiaInv;
/*      */   private String modalitaAcquisto;
/*      */   private Double numQuote;
/*      */   private Double valoreQuota;
/*      */   private Integer durata;
/*      */   private Double capitaleAScadenza;
/*      */   private String operativita;
/*      */   private String rinnovo;
/*      */   private Date dataScadenzaRinnovo;
/*      */   private Double codiceTitolo;
/*      */   private String tipoCommissioni;
/*      */   private Double importoAssegno;
/*      */   private Double importoBaseProv;
/*      */   private Double numPezzi;
/*      */   private String tipoPolizza;
/*      */   private Integer codiceMovimento;
/*      */   private Integer posizioneEsternaId;
/*      */   private String codiceCin;
/*      */   private String dettaglioTipologia;
/*      */   private String finalitaMutuo;
/*      */   private String tipoGaranzia;
/*      */   private String dettaglioGaranzia;
/*      */   private String flagPromozione;
/*      */   private Double importoMutuo;
/*      */   private Double patrimonioGarantito;
/*      */   private Double importoRimborsato;
/*      */   private Double importoDaRimborsare;
/*      */   private Double importoProgPagamenti;
/*      */   private Double tasso;
/*      */   private String frequenzaRimborso;
/*      */   private String codicePromotore;
/*      */   private String reteVenditaPromotore;
/*      */   private Double importoProvvigioneUt;
/*      */   private Double minimoGarantitoUt;
/*      */   private Double importoProvvRicorrente;
/*      */   private String userUltimaModifica;
/*      */   private String proceduraUltimaModifica;
/*      */   private Date dataUltimaModifica;
/*      */   private Date dataInserimentoRecord;
/*      */   private String flagEsistenza;
/*      */   private String utenteInserimento;
/*      */   private String tipoUltimaModifica;
/*      */   private FinSoggetto soggetto;
/*      */   private FinPromotore promotoreAperturaId;
/*      */   private FinContratto contratto;
/*      */   private String invioCommissioning;
/*      */   private String altriProdottiIDXP;
/*      */   private FinAltriProdDet altriProdottiDet;
/*      */   private String bene;
/*      */   
/*      */   public FinAltriProdotti() {}
/*      */   
/*      */   public FinAltriProdotti(Integer altriProdottiId) {
/*  201 */     this.altriProdottiId = altriProdottiId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAbi() {
/*  210 */     return this.abi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAbi(String abi) {
/*  218 */     this.abi = abi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getContrattoId() {
/*  225 */     return this.contrattoId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContrattoId(Integer contrattoId) {
/*  233 */     this.contrattoId = contrattoId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getAltriProdottiId() {
/*  240 */     return this.altriProdottiId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAltriProdottiId(Integer altriProdottiId) {
/*  248 */     this.altriProdottiId = altriProdottiId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getAttivitaFinId() {
/*  255 */     return this.attivitaFinId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttivitaFinId(Integer attivitaFinId) {
/*  263 */     this.attivitaFinId = attivitaFinId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCab() {
/*  270 */     return this.cab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCab(String cab) {
/*  278 */     this.cab = cab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getCapitaleAScadenza() {
/*  285 */     return this.capitaleAScadenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCapitaleAScadenza(Double capitaleAScadenza) {
/*  293 */     this.capitaleAScadenza = capitaleAScadenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceCin() {
/*  300 */     return this.codiceCin;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceCin(String codiceCin) {
/*  308 */     this.codiceCin = codiceCin;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceConvenzione() {
/*  315 */     return this.codiceConvenzione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceConvenzione(String codiceConvenzione) {
/*  323 */     this.codiceConvenzione = codiceConvenzione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getCodiceMovimento() {
/*  330 */     return this.codiceMovimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceMovimento(Integer codiceMovimento) {
/*  338 */     this.codiceMovimento = codiceMovimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodicePromotore() {
/*  345 */     return this.codicePromotore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodicePromotore(String codicePromotore) {
/*  353 */     this.codicePromotore = codicePromotore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceTipologiaInv() {
/*  360 */     return this.codiceTipologiaInv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceTipologiaInv(String codiceTipologiaInv) {
/*  368 */     this.codiceTipologiaInv = codiceTipologiaInv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getCodiceTitolo() {
/*  375 */     return this.codiceTitolo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceTitolo(Double codiceTitolo) {
/*  383 */     this.codiceTitolo = codiceTitolo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getCommissioni() {
/*  390 */     return this.commissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCommissioni(Double commissioni) {
/*  398 */     this.commissioni = commissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCope() {
/*  405 */     return this.cope;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCope(String cope) {
/*  413 */     this.cope = cope;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataAnnullamento() {
/*  420 */     return this.dataAnnullamento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataAnnullamento(Date dataAnnullamento) {
/*  428 */     this.dataAnnullamento = dataAnnullamento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataApprovazione() {
/*  435 */     return this.dataApprovazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataApprovazione(Date dataApprovazione) {
/*  443 */     this.dataApprovazione = dataApprovazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataChiusura() {
/*  450 */     return this.dataChiusura;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataChiusura(Date dataChiusura) {
/*  458 */     this.dataChiusura = dataChiusura;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataFinePlafond() {
/*  465 */     return this.dataFinePlafond;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataFinePlafond(Date dataFinePlafond) {
/*  473 */     this.dataFinePlafond = dataFinePlafond;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataImpBaseProv() {
/*  480 */     return this.dataImpBaseProv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataImpBaseProv(Date dataImpBaseProv) {
/*  488 */     this.dataImpBaseProv = dataImpBaseProv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInserimento() {
/*  495 */     return this.dataInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataInserimento(Date dataInserimento) {
/*  503 */     this.dataInserimento = dataInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInserimentoRecord() {
/*  510 */     return this.dataInserimentoRecord;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/*  518 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataRegolamento() {
/*  525 */     return this.dataRegolamento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataRegolamento(Date dataRegolamento) {
/*  533 */     this.dataRegolamento = dataRegolamento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataRicevimentoProposta() {
/*  540 */     return this.dataRicevimentoProposta;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataRicevimentoProposta(Date dataRicevimentoProposta) {
/*  548 */     this.dataRicevimentoProposta = dataRicevimentoProposta;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataScadenza() {
/*  555 */     return this.dataScadenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataScadenza(Date dataScadenza) {
/*  563 */     this.dataScadenza = dataScadenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataScadenzaRinnovo() {
/*  570 */     return this.dataScadenzaRinnovo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataScadenzaRinnovo(Date dataScadenzaRinnovo) {
/*  578 */     this.dataScadenzaRinnovo = dataScadenzaRinnovo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataSottoscrizione() {
/*  585 */     return this.dataSottoscrizione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataSottoscrizione(Date dataSottoscrizione) {
/*  593 */     this.dataSottoscrizione = dataSottoscrizione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataUltimaModifica() {
/*  600 */     return this.dataUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  608 */     this.dataUltimaModifica = dataUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDescrizione() {
/*  615 */     return this.descrizione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDescrizione(String descrizione) {
/*  623 */     this.descrizione = descrizione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDettaglioGaranzia() {
/*  630 */     return this.dettaglioGaranzia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDettaglioGaranzia(String dettaglioGaranzia) {
/*  638 */     this.dettaglioGaranzia = dettaglioGaranzia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDettaglioTipologia() {
/*  645 */     return this.dettaglioTipologia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDettaglioTipologia(String dettaglioTipologia) {
/*  653 */     this.dettaglioTipologia = dettaglioTipologia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getDurata() {
/*  660 */     return this.durata;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDurata(Integer durata) {
/*  668 */     this.durata = durata;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFiliale() {
/*  675 */     return this.filiale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFiliale(String filiale) {
/*  683 */     this.filiale = filiale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFinalitaMutuo() {
/*  690 */     return this.finalitaMutuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFinalitaMutuo(String finalitaMutuo) {
/*  698 */     this.finalitaMutuo = finalitaMutuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFlagEsistenza() {
/*  705 */     return this.flagEsistenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFlagEsistenza(String flagEsistenza) {
/*  713 */     this.flagEsistenza = flagEsistenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFlagPromozione() {
/*  720 */     return this.flagPromozione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFlagPromozione(String flagPromozione) {
/*  728 */     this.flagPromozione = flagPromozione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFrequenzaRimborso() {
/*  735 */     return this.frequenzaRimborso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFrequenzaRimborso(String frequenzaRimborso) {
/*  743 */     this.frequenzaRimborso = frequenzaRimborso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoAssegno() {
/*  750 */     return this.importoAssegno;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoAssegno(Double importoAssegno) {
/*  758 */     this.importoAssegno = importoAssegno;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoBaseProv() {
/*  765 */     return this.importoBaseProv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoBaseProv(Double importoBaseProv) {
/*  773 */     this.importoBaseProv = importoBaseProv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoContratto() {
/*  780 */     return this.importoContratto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoContratto(Double importoContratto) {
/*  788 */     this.importoContratto = importoContratto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoDaRimborsare() {
/*  795 */     return this.importoDaRimborsare;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoDaRimborsare(Double importoDaRimborsare) {
/*  803 */     this.importoDaRimborsare = importoDaRimborsare;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoMutuo() {
/*  810 */     return this.importoMutuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoMutuo(Double importoMutuo) {
/*  818 */     this.importoMutuo = importoMutuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoProgPagamenti() {
/*  825 */     return this.importoProgPagamenti;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoProgPagamenti(Double importoProgPagamenti) {
/*  833 */     this.importoProgPagamenti = importoProgPagamenti;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoProvvigioneUt() {
/*  840 */     return this.importoProvvigioneUt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoProvvigioneUt(Double importoProvvigioneUt) {
/*  848 */     this.importoProvvigioneUt = importoProvvigioneUt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoProvvRicorrente() {
/*  855 */     return this.importoProvvRicorrente;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoProvvRicorrente(Double importoProvvRicorrente) {
/*  863 */     this.importoProvvRicorrente = importoProvvRicorrente;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoRichiesto() {
/*  870 */     return this.importoRichiesto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoRichiesto(Double importoRichiesto) {
/*  878 */     this.importoRichiesto = importoRichiesto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoRimborsato() {
/*  885 */     return this.importoRimborsato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoRimborsato(Double importoRimborsato) {
/*  893 */     this.importoRimborsato = importoRimborsato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getImportoTot() {
/*  900 */     return this.importoTot;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setImportoTot(Double importoTot) {
/*  908 */     this.importoTot = importoTot;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getMinimoGarantitoUt() {
/*  915 */     return this.minimoGarantitoUt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setMinimoGarantitoUt(Double minimoGarantitoUt) {
/*  923 */     this.minimoGarantitoUt = minimoGarantitoUt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getModalitaAcquisto() {
/*  930 */     return this.modalitaAcquisto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setModalitaAcquisto(String modalitaAcquisto) {
/*  938 */     this.modalitaAcquisto = modalitaAcquisto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getModalitaPagamento() {
/*  945 */     return this.modalitaPagamento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setModalitaPagamento(String modalitaPagamento) {
/*  953 */     this.modalitaPagamento = modalitaPagamento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNote() {
/*  960 */     return this.note;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNote(String note) {
/*  968 */     this.note = note;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumCC() {
/*  975 */     return this.numCC;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumCC(String numCC) {
/*  983 */     this.numCC = numCC;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumContrattoEsterno() {
/*  990 */     return this.numContrattoEsterno;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumContrattoEsterno(String numContrattoEsterno) {
/*  998 */     this.numContrattoEsterno = numContrattoEsterno;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumContrattoSiff() {
/* 1005 */     return this.numContrattoSiff;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumContrattoSiff(String numContrattoSiff) {
/* 1013 */     this.numContrattoSiff = numContrattoSiff;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getNumPezzi() {
/* 1020 */     return this.numPezzi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumPezzi(Double numPezzi) {
/* 1028 */     this.numPezzi = numPezzi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getNumQuote() {
/* 1035 */     return this.numQuote;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumQuote(Double numQuote) {
/* 1043 */     this.numQuote = numQuote;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getOggettoLocazione() {
/* 1050 */     return this.oggettoLocazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOggettoLocazione(String oggettoLocazione) {
/* 1058 */     this.oggettoLocazione = oggettoLocazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getOperativita() {
/* 1065 */     return this.operativita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOperativita(String operativita) {
/* 1073 */     this.operativita = operativita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getPatrimonioGarantito() {
/* 1080 */     return this.patrimonioGarantito;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPatrimonioGarantito(Double patrimonioGarantito) {
/* 1088 */     this.patrimonioGarantito = patrimonioGarantito;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getPercComm() {
/* 1095 */     return this.percComm;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPercComm(Double percComm) {
/* 1103 */     this.percComm = percComm;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPlafond() {
/* 1110 */     return this.plafond;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPlafond(String plafond) {
/* 1118 */     this.plafond = plafond;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getPosizioneEsternaId() {
/* 1125 */     return this.posizioneEsternaId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPosizioneEsternaId(Integer posizioneEsternaId) {
/* 1133 */     this.posizioneEsternaId = posizioneEsternaId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProceduraUltimaModifica() {
/* 1140 */     return this.proceduraUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 1148 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getProdottoId() {
/* 1155 */     return this.prodottoId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProdottoId(Integer prodottoId) {
/* 1163 */     this.prodottoId = prodottoId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getPromotoreSplitId() {
/* 1170 */     return this.promotoreSplitId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPromotoreSplitId(Integer promotoreSplitId) {
/* 1178 */     this.promotoreSplitId = promotoreSplitId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getReteVenditaPromotore() {
/* 1185 */     return this.reteVenditaPromotore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setReteVenditaPromotore(String reteVenditaPromotore) {
/* 1193 */     this.reteVenditaPromotore = reteVenditaPromotore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRinnovo() {
/* 1200 */     return this.rinnovo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRinnovo(String rinnovo) {
/* 1208 */     this.rinnovo = rinnovo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getSoggettoIntId() {
/* 1215 */     return this.soggettoIntId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSoggettoIntId(Integer soggettoIntId) {
/* 1223 */     this.soggettoIntId = soggettoIntId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getSpese() {
/* 1230 */     return this.spese;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSpese(Double spese) {
/* 1238 */     this.spese = spese;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getSportelloBnl() {
/* 1245 */     return this.sportelloBnl;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSportelloBnl(Double sportelloBnl) {
/* 1253 */     this.sportelloBnl = sportelloBnl;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStato() {
/* 1260 */     return this.stato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setStato(String stato) {
/* 1268 */     this.stato = stato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getTasso() {
/* 1275 */     return this.tasso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTasso(Double tasso) {
/* 1283 */     this.tasso = tasso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipo() {
/* 1290 */     return this.tipo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipo(String tipo) {
/* 1298 */     this.tipo = tipo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoCarta() {
/* 1305 */     return this.tipoCarta;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoCarta(String tipoCarta) {
/* 1313 */     this.tipoCarta = tipoCarta;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoCommissioni() {
/* 1320 */     return this.tipoCommissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoCommissioni(String tipoCommissioni) {
/* 1328 */     this.tipoCommissioni = tipoCommissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoGaranzia() {
/* 1335 */     return this.tipoGaranzia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoGaranzia(String tipoGaranzia) {
/* 1343 */     this.tipoGaranzia = tipoGaranzia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoMutuo() {
/* 1350 */     return this.tipoMutuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoMutuo(String tipoMutuo) {
/* 1358 */     this.tipoMutuo = tipoMutuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoPolizza() {
/* 1365 */     return this.tipoPolizza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoPolizza(String tipoPolizza) {
/* 1373 */     this.tipoPolizza = tipoPolizza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoUltimaModifica() {
/* 1380 */     return this.tipoUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 1388 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUserUltimaModifica() {
/* 1395 */     return this.userUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 1403 */     this.userUltimaModifica = userUltimaModifica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUtenteInserimento() {
/* 1410 */     return this.utenteInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUtenteInserimento(String utenteInserimento) {
/* 1418 */     this.utenteInserimento = utenteInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getValoreQuota() {
/* 1425 */     return this.valoreQuota;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setValoreQuota(Double valoreQuota) {
/* 1433 */     this.valoreQuota = valoreQuota;
/*      */   }
/*      */   
/*      */   public FinSoggetto getSoggetto() {
/* 1437 */     return this.soggetto;
/*      */   }
/*      */   
/*      */   public void setSoggetto(FinSoggetto soggetto) {
/* 1441 */     this.soggetto = soggetto;
/*      */   }
/*      */   
/*      */   public FinPromotore getPromotoreAperturaId() {
/* 1445 */     return this.promotoreAperturaId;
/*      */   }
/*      */   
/*      */   public void setPromotoreAperturaId(FinPromotore promotoreAperturaId) {
/* 1449 */     this.promotoreAperturaId = promotoreAperturaId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FinContratto getContratto() {
/* 1456 */     return this.contratto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setContratto(FinContratto contratto) {
/* 1464 */     this.contratto = contratto;
/*      */   }
/*      */   
/*      */   public String toString() {
/* 1468 */     return (new ToStringBuilder(this)).append("altriProdottiId", getAltriProdottiId()).toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getInvioCommissioning() {
/* 1476 */     return this.invioCommissioning;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setInvioCommissioning(String invioCommissioning) {
/* 1484 */     this.invioCommissioning = invioCommissioning;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FinAltriProdDet getAltriProdottiDet() {
/* 1491 */     return this.altriProdottiDet;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAltriProdottiDet(FinAltriProdDet altriProdDet) {
/* 1499 */     this.altriProdottiDet = altriProdDet;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAltriProdottiIDXP() {
/* 1506 */     return this.altriProdottiIDXP;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAltriProdottiIDXP(String altriProdottiIDXP) {
/* 1514 */     this.altriProdottiIDXP = altriProdottiIDXP;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getBene() {
/* 1521 */     return this.bene;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBene(String bene) {
/* 1529 */     this.bene = bene;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getInvioCommissioningView() {
/* 1536 */     if ("I".equals(this.invioCommissioning)) {
/* 1537 */       return "S";
/*      */     }
/* 1539 */     return this.invioCommissioning;
/*      */   }
/*      */   
/*      */   public void setInvioCommissioningView(String invioCommissioningView) {
/* 1543 */     if ("I".equals(this.invioCommissioning) && "S".equals(invioCommissioningView)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1548 */     this.invioCommissioning = invioCommissioningView;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAltriProdotti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */