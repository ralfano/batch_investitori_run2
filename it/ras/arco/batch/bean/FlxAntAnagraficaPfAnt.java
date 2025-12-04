/*      */ package it.ras.arco.batch.bean;
/*      */ 
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ import org.apache.commons.lang.builder.ToStringBuilder;
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FlxAntAnagraficaPfAnt
/*      */   implements Serializable
/*      */ {
/*      */   private Integer flxId;
/*      */   private String codicePromotore;
/*      */   private String nome;
/*      */   private Date dataInizioRapporto;
/*      */   private Date dataFineRapporto;
/*      */   private Date dataIncarico;
/*      */   private Date dataInizioPreavviso;
/*      */   private Date dataFinePreavviso;
/*      */   private String fittizio;
/*      */   private String codiceFiscale;
/*      */   private String dimissioni;
/*      */   private String titoloStudio;
/*      */   private String esperienza;
/*      */   private String provinciaVendita1;
/*      */   private String provinciaVendita2;
/*      */   private String provinciaVendita3;
/*      */   private String provinciaVendita4;
/*      */   private String provinciaVendita5;
/*      */   private String regioneVendita;
/*      */   private Date dataNascita;
/*      */   private String luogoNascita;
/*      */   private String provinciaNascita;
/*      */   private String presentatore;
/*      */   private String centroRaccolta;
/*      */   private String telefonoResidenzaPrefisso;
/*      */   private String telefonoResidenzaNumero;
/*      */   private String telefonoRecapitoPrefisso;
/*      */   private String telefonoRecapitoNumero;
/*      */   private String indirizzoResidenza;
/*      */   private String capResidenza;
/*      */   private String cittaResidenza;
/*      */   private String provinciaResidenza;
/*      */   private String indirizzoRecapito;
/*      */   private String capRecapito;
/*      */   private String cittaRecapito;
/*      */   private String provinciaRecapito;
/*      */   private String grado;
/*      */   private String regioneGeografica;
/*      */   private Date dataComunicazioneCessazione;
/*      */   private String regionalManager;
/*      */   private String districtManager;
/*      */   private String teamManager;
/*      */   private String naturaRapporto;
/*      */   private String gradoVendite;
/*      */   private String areaVendite;
/*      */   private String divisioneSgmVendite;
/*      */   private String manAmVendite;
/*      */   private String regRpVendite;
/*      */   private String sejTutor;
/*      */   private String aliquotaFiscale;
/*      */   private Date dataIscrizioneEnasarco;
/*      */   private String codiceEnasarco;
/*      */   private String partitaIva;
/*      */   private String provinciaCciaa;
/*      */   private String numeroCciaa;
/*      */   private String mandato;
/*      */   private String certificazione;
/*      */   private String pagamentoProvvigioni;
/*      */   private String codiceAbi;
/*      */   private String codiceCab;
/*      */   private String codiceCc1;
/*      */   private String descrizioneBanca;
/*      */   private String indirizzoBanca;
/*      */   private String capBanca;
/*      */   private String cittaBanca;
/*      */   private String siglaProvincia;
/*      */   private Date dataIscrizioneAnasf;
/*      */   private Date dataProvvisoria;
/*      */   private String corriere;
/*      */   private String codiceAlbo;
/*      */   private Date dataInserimentoAlbo;
/*      */   private String dichiarazioneDefinitiva;
/*      */   private String codiceKab;
/*      */   private String controlloKab;
/*      */   private String retePrecedente;
/*      */   private String fl2;
/*      */   private String fl3;
/*      */   private String fl4;
/*      */   private String fl5;
/*      */   private String cognomePf;
/*      */   private String nomePf;
/*      */   private String indirizzoEmail;
/*      */   private String codiceRete;
/*      */   private String codiceCompagnia;
/*      */   private String cellulare;
/*      */   private String agenziaAttualeOperativita;
/*      */   private String cpfAttualeOperativita;
/*      */   private String ufficioPersAttOperativita;
/*      */   private String sesso;
/*      */   private String regioneCommerciale;
/*      */   private String distretto;
/*      */   private Double aliquotaProvvigStandard;
/*      */   private Integer aliquotaProvvigAssicurativo;
/*      */   private String faxPrefisso;
/*      */   private String faxNumero;
/*      */   private String gradoGerarchicoEsterno;
/*      */   private Integer fidoBancario;
/*      */   private String descrizioneFiliale;
/*      */   private String descrizioneGradoGerarchico;
/*      */   private String flagCodicePfPrincipale;
/*      */   private String telefonoResidenzaEsteso;
/*      */   private String telefonoRecapitoEsteso;
/*      */   private String faxEsteso;
/*      */   private String statoElaborazione;
/*      */   private String istanza;
/*      */   private Date dataCaricamento;
/*      */   private String codiceCc2;
/*      */   private String numeroMatricola;
/*      */   private Date dataFineIncarico;
/*      */   private Date dataRecessoSindacato;
/*      */   private String qualifica;
/*      */   private String codiceFiscaleContributivo;
/*      */   private String flagPcDotazione;
/*      */   private String provinciaIscrizioneAlbo;
/*      */   private String modalitaCollocamento;
/*      */   private Integer aliquotaProvvigionaleMFee;
/*      */   private String tutor;
/*      */   private Date dataDimissioni;
/*      */   private String anzianitaConvenzionale;
/*      */   private String ufficioSedeOperativa;
/*      */   private String postazionePc;
/*      */   private String postalizzazione;
/*      */   private String descrizioneErrore;
/*      */   private Date dataErrore;
/*      */   
/*      */   public Integer getAliquotaProvvigionaleMFee() {
/*  138 */     return this.aliquotaProvvigionaleMFee;
/*      */   }
/*      */   
/*      */   public void setAliquotaProvvigionaleMFee(Integer aliquotaProvvigionaleMFee) {
/*  142 */     this.aliquotaProvvigionaleMFee = aliquotaProvvigionaleMFee;
/*      */   }
/*      */   
/*      */   public String getAnzianitaConvenzionale() {
/*  146 */     return this.anzianitaConvenzionale;
/*      */   }
/*      */   
/*      */   public void setAnzianitaConvenzionale(String anzianitaConvenzionale) {
/*  150 */     this.anzianitaConvenzionale = anzianitaConvenzionale;
/*      */   }
/*      */   
/*      */   public String getCodiceFiscaleContributivo() {
/*  154 */     return this.codiceFiscaleContributivo;
/*      */   }
/*      */   
/*      */   public void setCodiceFiscaleContributivo(String codiceFiscaleContributivo) {
/*  158 */     this.codiceFiscaleContributivo = codiceFiscaleContributivo;
/*      */   }
/*      */   
/*      */   public Date getDataDimissioni() {
/*  162 */     return this.dataDimissioni;
/*      */   }
/*      */   
/*      */   public void setDataDimissioni(Date dataDimissioni) {
/*  166 */     this.dataDimissioni = dataDimissioni;
/*      */   }
/*      */   
/*      */   public Date getDataFineIncarico() {
/*  170 */     return this.dataFineIncarico;
/*      */   }
/*      */   
/*      */   public void setDataFineIncarico(Date dataFineIncarico) {
/*  174 */     this.dataFineIncarico = dataFineIncarico;
/*      */   }
/*      */   
/*      */   public Date getDataRecessoSindacato() {
/*  178 */     return this.dataRecessoSindacato;
/*      */   }
/*      */   
/*      */   public void setDataRecessoSindacato(Date dataRecessoSindacato) {
/*  182 */     this.dataRecessoSindacato = dataRecessoSindacato;
/*      */   }
/*      */   
/*      */   public String getFlagPcDotazione() {
/*  186 */     return this.flagPcDotazione;
/*      */   }
/*      */   
/*      */   public void setFlagPcDotazione(String flagPcDotazione) {
/*  190 */     this.flagPcDotazione = flagPcDotazione;
/*      */   }
/*      */   
/*      */   public String getModalitaCollocamento() {
/*  194 */     return this.modalitaCollocamento;
/*      */   }
/*      */   
/*      */   public void setModalitaCollocamento(String modalitaCollocamento) {
/*  198 */     this.modalitaCollocamento = modalitaCollocamento;
/*      */   }
/*      */   
/*      */   public String getNumeroMatricola() {
/*  202 */     return this.numeroMatricola;
/*      */   }
/*      */   
/*      */   public void setNumeroMatricola(String numeroMatricola) {
/*  206 */     this.numeroMatricola = numeroMatricola;
/*      */   }
/*      */   
/*      */   public String getPostalizzazione() {
/*  210 */     return this.postalizzazione;
/*      */   }
/*      */   
/*      */   public void setPostalizzazione(String postalizzazione) {
/*  214 */     this.postalizzazione = postalizzazione;
/*      */   }
/*      */   
/*      */   public String getPostazionePc() {
/*  218 */     return this.postazionePc;
/*      */   }
/*      */   
/*      */   public void setPostazionePc(String postazionePc) {
/*  222 */     this.postazionePc = postazionePc;
/*      */   }
/*      */   
/*      */   public String getProvinciaIscrizioneAlbo() {
/*  226 */     return this.provinciaIscrizioneAlbo;
/*      */   }
/*      */   
/*      */   public void setProvinciaIscrizioneAlbo(String provinciaIscrizioneAlbo) {
/*  230 */     this.provinciaIscrizioneAlbo = provinciaIscrizioneAlbo;
/*      */   }
/*      */   
/*      */   public String getQualifica() {
/*  234 */     return this.qualifica;
/*      */   }
/*      */   
/*      */   public void setQualifica(String qualifica) {
/*  238 */     this.qualifica = qualifica;
/*      */   }
/*      */   
/*      */   public String getTutor() {
/*  242 */     return this.tutor;
/*      */   }
/*      */   
/*      */   public void setTutor(String tutor) {
/*  246 */     this.tutor = tutor;
/*      */   }
/*      */   
/*      */   public String getUfficioSedeOperativa() {
/*  250 */     return this.ufficioSedeOperativa;
/*      */   }
/*      */   
/*      */   public void setUfficioSedeOperativa(String ufficioSedeOperativa) {
/*  254 */     this.ufficioSedeOperativa = ufficioSedeOperativa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public FlxAntAnagraficaPfAnt() {}
/*      */ 
/*      */   
/*      */   public FlxAntAnagraficaPfAnt(Integer flxId) {
/*  263 */     this.flxId = flxId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getFlxId() {
/*  275 */     return this.flxId;
/*      */   }
/*      */   
/*      */   public void setFlxId(Integer flxId) {
/*  279 */     this.flxId = flxId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodicePromotore() {
/*  286 */     return this.codicePromotore;
/*      */   }
/*      */   
/*      */   public void setCodicePromotore(String codicePromotore) {
/*  290 */     this.codicePromotore = codicePromotore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNome() {
/*  297 */     return this.nome;
/*      */   }
/*      */   
/*      */   public void setNome(String nome) {
/*  301 */     this.nome = nome;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInizioRapporto() {
/*  308 */     return this.dataInizioRapporto;
/*      */   }
/*      */   
/*      */   public void setDataInizioRapporto(Date dataInizioRapporto) {
/*  312 */     this.dataInizioRapporto = dataInizioRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataFineRapporto() {
/*  319 */     return this.dataFineRapporto;
/*      */   }
/*      */   
/*      */   public void setDataFineRapporto(Date dataFineRapporto) {
/*  323 */     this.dataFineRapporto = dataFineRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataIncarico() {
/*  330 */     return this.dataIncarico;
/*      */   }
/*      */   
/*      */   public void setDataIncarico(Date dataIncarico) {
/*  334 */     this.dataIncarico = dataIncarico;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInizioPreavviso() {
/*  341 */     return this.dataInizioPreavviso;
/*      */   }
/*      */   
/*      */   public void setDataInizioPreavviso(Date dataInizioPreavviso) {
/*  345 */     this.dataInizioPreavviso = dataInizioPreavviso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataFinePreavviso() {
/*  352 */     return this.dataFinePreavviso;
/*      */   }
/*      */   
/*      */   public void setDataFinePreavviso(Date dataFinePreavviso) {
/*  356 */     this.dataFinePreavviso = dataFinePreavviso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFittizio() {
/*  363 */     return this.fittizio;
/*      */   }
/*      */   
/*      */   public void setFittizio(String fittizio) {
/*  367 */     this.fittizio = fittizio;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceFiscale() {
/*  374 */     return this.codiceFiscale;
/*      */   }
/*      */   
/*      */   public void setCodiceFiscale(String codiceFiscale) {
/*  378 */     this.codiceFiscale = codiceFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDimissioni() {
/*  385 */     return this.dimissioni;
/*      */   }
/*      */   
/*      */   public void setDimissioni(String dimissioni) {
/*  389 */     this.dimissioni = dimissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTitoloStudio() {
/*  396 */     return this.titoloStudio;
/*      */   }
/*      */   
/*      */   public void setTitoloStudio(String titoloStudio) {
/*  400 */     this.titoloStudio = titoloStudio;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getEsperienza() {
/*  407 */     return this.esperienza;
/*      */   }
/*      */   
/*      */   public void setEsperienza(String esperienza) {
/*  411 */     this.esperienza = esperienza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaVendita1() {
/*  418 */     return this.provinciaVendita1;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita1(String provinciaVendita1) {
/*  422 */     this.provinciaVendita1 = provinciaVendita1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaVendita2() {
/*  429 */     return this.provinciaVendita2;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita2(String provinciaVendita2) {
/*  433 */     this.provinciaVendita2 = provinciaVendita2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaVendita3() {
/*  440 */     return this.provinciaVendita3;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita3(String provinciaVendita3) {
/*  444 */     this.provinciaVendita3 = provinciaVendita3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaVendita4() {
/*  451 */     return this.provinciaVendita4;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita4(String provinciaVendita4) {
/*  455 */     this.provinciaVendita4 = provinciaVendita4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaVendita5() {
/*  462 */     return this.provinciaVendita5;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita5(String provinciaVendita5) {
/*  466 */     this.provinciaVendita5 = provinciaVendita5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegioneVendita() {
/*  473 */     return this.regioneVendita;
/*      */   }
/*      */   
/*      */   public void setRegioneVendita(String regioneVendita) {
/*  477 */     this.regioneVendita = regioneVendita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataNascita() {
/*  484 */     return this.dataNascita;
/*      */   }
/*      */   
/*      */   public void setDataNascita(Date dataNascita) {
/*  488 */     this.dataNascita = dataNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getLuogoNascita() {
/*  495 */     return this.luogoNascita;
/*      */   }
/*      */   
/*      */   public void setLuogoNascita(String luogoNascita) {
/*  499 */     this.luogoNascita = luogoNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaNascita() {
/*  506 */     return this.provinciaNascita;
/*      */   }
/*      */   
/*      */   public void setProvinciaNascita(String provinciaNascita) {
/*  510 */     this.provinciaNascita = provinciaNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPresentatore() {
/*  517 */     return this.presentatore;
/*      */   }
/*      */   
/*      */   public void setPresentatore(String presentatore) {
/*  521 */     this.presentatore = presentatore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCentroRaccolta() {
/*  528 */     return this.centroRaccolta;
/*      */   }
/*      */   
/*      */   public void setCentroRaccolta(String centroRaccolta) {
/*  532 */     this.centroRaccolta = centroRaccolta;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoResidenzaPrefisso() {
/*  539 */     return this.telefonoResidenzaPrefisso;
/*      */   }
/*      */   
/*      */   public void setTelefonoResidenzaPrefisso(String telefonoResidenzaPrefisso) {
/*  543 */     this.telefonoResidenzaPrefisso = telefonoResidenzaPrefisso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoResidenzaNumero() {
/*  550 */     return this.telefonoResidenzaNumero;
/*      */   }
/*      */   
/*      */   public void setTelefonoResidenzaNumero(String telefonoResidenzaNumero) {
/*  554 */     this.telefonoResidenzaNumero = telefonoResidenzaNumero;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoRecapitoPrefisso() {
/*  561 */     return this.telefonoRecapitoPrefisso;
/*      */   }
/*      */   
/*      */   public void setTelefonoRecapitoPrefisso(String telefonoRecapitoPrefisso) {
/*  565 */     this.telefonoRecapitoPrefisso = telefonoRecapitoPrefisso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoRecapitoNumero() {
/*  572 */     return this.telefonoRecapitoNumero;
/*      */   }
/*      */   
/*      */   public void setTelefonoRecapitoNumero(String telefonoRecapitoNumero) {
/*  576 */     this.telefonoRecapitoNumero = telefonoRecapitoNumero;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIndirizzoResidenza() {
/*  583 */     return this.indirizzoResidenza;
/*      */   }
/*      */   
/*      */   public void setIndirizzoResidenza(String indirizzoResidenza) {
/*  587 */     this.indirizzoResidenza = indirizzoResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapResidenza() {
/*  594 */     return this.capResidenza;
/*      */   }
/*      */   
/*      */   public void setCapResidenza(String capResidenza) {
/*  598 */     this.capResidenza = capResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCittaResidenza() {
/*  605 */     return this.cittaResidenza;
/*      */   }
/*      */   
/*      */   public void setCittaResidenza(String cittaResidenza) {
/*  609 */     this.cittaResidenza = cittaResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaResidenza() {
/*  616 */     return this.provinciaResidenza;
/*      */   }
/*      */   
/*      */   public void setProvinciaResidenza(String provinciaResidenza) {
/*  620 */     this.provinciaResidenza = provinciaResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIndirizzoRecapito() {
/*  627 */     return this.indirizzoRecapito;
/*      */   }
/*      */   
/*      */   public void setIndirizzoRecapito(String indirizzoRecapito) {
/*  631 */     this.indirizzoRecapito = indirizzoRecapito;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapRecapito() {
/*  638 */     return this.capRecapito;
/*      */   }
/*      */   
/*      */   public void setCapRecapito(String capRecapito) {
/*  642 */     this.capRecapito = capRecapito;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCittaRecapito() {
/*  649 */     return this.cittaRecapito;
/*      */   }
/*      */   
/*      */   public void setCittaRecapito(String cittaRecapito) {
/*  653 */     this.cittaRecapito = cittaRecapito;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaRecapito() {
/*  660 */     return this.provinciaRecapito;
/*      */   }
/*      */   
/*      */   public void setProvinciaRecapito(String provinciaRecapito) {
/*  664 */     this.provinciaRecapito = provinciaRecapito;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGrado() {
/*  671 */     return this.grado;
/*      */   }
/*      */   
/*      */   public void setGrado(String grado) {
/*  675 */     this.grado = grado;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegioneGeografica() {
/*  682 */     return this.regioneGeografica;
/*      */   }
/*      */   
/*      */   public void setRegioneGeografica(String regioneGeografica) {
/*  686 */     this.regioneGeografica = regioneGeografica;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataComunicazioneCessazione() {
/*  693 */     return this.dataComunicazioneCessazione;
/*      */   }
/*      */   
/*      */   public void setDataComunicazioneCessazione(Date dataComunicazioneCessazione) {
/*  697 */     this.dataComunicazioneCessazione = dataComunicazioneCessazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegionalManager() {
/*  704 */     return this.regionalManager;
/*      */   }
/*      */   
/*      */   public void setRegionalManager(String regionalManager) {
/*  708 */     this.regionalManager = regionalManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDistrictManager() {
/*  715 */     return this.districtManager;
/*      */   }
/*      */   
/*      */   public void setDistrictManager(String districtManager) {
/*  719 */     this.districtManager = districtManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTeamManager() {
/*  726 */     return this.teamManager;
/*      */   }
/*      */   
/*      */   public void setTeamManager(String teamManager) {
/*  730 */     this.teamManager = teamManager;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNaturaRapporto() {
/*  737 */     return this.naturaRapporto;
/*      */   }
/*      */   
/*      */   public void setNaturaRapporto(String naturaRapporto) {
/*  741 */     this.naturaRapporto = naturaRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGradoVendite() {
/*  748 */     return this.gradoVendite;
/*      */   }
/*      */   
/*      */   public void setGradoVendite(String gradoVendite) {
/*  752 */     this.gradoVendite = gradoVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAreaVendite() {
/*  759 */     return this.areaVendite;
/*      */   }
/*      */   
/*      */   public void setAreaVendite(String areaVendite) {
/*  763 */     this.areaVendite = areaVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDivisioneSgmVendite() {
/*  770 */     return this.divisioneSgmVendite;
/*      */   }
/*      */   
/*      */   public void setDivisioneSgmVendite(String divisioneSgmVendite) {
/*  774 */     this.divisioneSgmVendite = divisioneSgmVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getManAmVendite() {
/*  781 */     return this.manAmVendite;
/*      */   }
/*      */   
/*      */   public void setManAmVendite(String manAmVendite) {
/*  785 */     this.manAmVendite = manAmVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegRpVendite() {
/*  792 */     return this.regRpVendite;
/*      */   }
/*      */   
/*      */   public void setRegRpVendite(String regRpVendite) {
/*  796 */     this.regRpVendite = regRpVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSejTutor() {
/*  803 */     return this.sejTutor;
/*      */   }
/*      */   
/*      */   public void setSejTutor(String sejTutor) {
/*  807 */     this.sejTutor = sejTutor;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAliquotaFiscale() {
/*  814 */     return this.aliquotaFiscale;
/*      */   }
/*      */   
/*      */   public void setAliquotaFiscale(String aliquotaFiscale) {
/*  818 */     this.aliquotaFiscale = aliquotaFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataIscrizioneEnasarco() {
/*  825 */     return this.dataIscrizioneEnasarco;
/*      */   }
/*      */   
/*      */   public void setDataIscrizioneEnasarco(Date dataIscrizioneEnasarco) {
/*  829 */     this.dataIscrizioneEnasarco = dataIscrizioneEnasarco;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceEnasarco() {
/*  836 */     return this.codiceEnasarco;
/*      */   }
/*      */   
/*      */   public void setCodiceEnasarco(String codiceEnasarco) {
/*  840 */     this.codiceEnasarco = codiceEnasarco;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPartitaIva() {
/*  847 */     return this.partitaIva;
/*      */   }
/*      */   
/*      */   public void setPartitaIva(String partitaIva) {
/*  851 */     this.partitaIva = partitaIva;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaCciaa() {
/*  858 */     return this.provinciaCciaa;
/*      */   }
/*      */   
/*      */   public void setProvinciaCciaa(String provinciaCciaa) {
/*  862 */     this.provinciaCciaa = provinciaCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumeroCciaa() {
/*  869 */     return this.numeroCciaa;
/*      */   }
/*      */   
/*      */   public void setNumeroCciaa(String numeroCciaa) {
/*  873 */     this.numeroCciaa = numeroCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getMandato() {
/*  880 */     return this.mandato;
/*      */   }
/*      */   
/*      */   public void setMandato(String mandato) {
/*  884 */     this.mandato = mandato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCertificazione() {
/*  891 */     return this.certificazione;
/*      */   }
/*      */   
/*      */   public void setCertificazione(String certificazione) {
/*  895 */     this.certificazione = certificazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPagamentoProvvigioni() {
/*  902 */     return this.pagamentoProvvigioni;
/*      */   }
/*      */   
/*      */   public void setPagamentoProvvigioni(String pagamentoProvvigioni) {
/*  906 */     this.pagamentoProvvigioni = pagamentoProvvigioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceAbi() {
/*  913 */     return this.codiceAbi;
/*      */   }
/*      */   
/*      */   public void setCodiceAbi(String codiceAbi) {
/*  917 */     this.codiceAbi = codiceAbi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceCab() {
/*  924 */     return this.codiceCab;
/*      */   }
/*      */   
/*      */   public void setCodiceCab(String codiceCab) {
/*  928 */     this.codiceCab = codiceCab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceCc1() {
/*  935 */     return this.codiceCc1;
/*      */   }
/*      */   
/*      */   public void setCodiceCc1(String codiceCc1) {
/*  939 */     this.codiceCc1 = codiceCc1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDescrizioneBanca() {
/*  946 */     return this.descrizioneBanca;
/*      */   }
/*      */   
/*      */   public void setDescrizioneBanca(String descrizioneBanca) {
/*  950 */     this.descrizioneBanca = descrizioneBanca;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIndirizzoBanca() {
/*  957 */     return this.indirizzoBanca;
/*      */   }
/*      */   
/*      */   public void setIndirizzoBanca(String indirizzoBanca) {
/*  961 */     this.indirizzoBanca = indirizzoBanca;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapBanca() {
/*  968 */     return this.capBanca;
/*      */   }
/*      */   
/*      */   public void setCapBanca(String capBanca) {
/*  972 */     this.capBanca = capBanca;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCittaBanca() {
/*  979 */     return this.cittaBanca;
/*      */   }
/*      */   
/*      */   public void setCittaBanca(String cittaBanca) {
/*  983 */     this.cittaBanca = cittaBanca;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSiglaProvincia() {
/*  990 */     return this.siglaProvincia;
/*      */   }
/*      */   
/*      */   public void setSiglaProvincia(String siglaProvincia) {
/*  994 */     this.siglaProvincia = siglaProvincia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataIscrizioneAnasf() {
/* 1001 */     return this.dataIscrizioneAnasf;
/*      */   }
/*      */   
/*      */   public void setDataIscrizioneAnasf(Date dataIscrizioneAnasf) {
/* 1005 */     this.dataIscrizioneAnasf = dataIscrizioneAnasf;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataProvvisoria() {
/* 1012 */     return this.dataProvvisoria;
/*      */   }
/*      */   
/*      */   public void setDataProvvisoria(Date dataProvvisoria) {
/* 1016 */     this.dataProvvisoria = dataProvvisoria;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCorriere() {
/* 1023 */     return this.corriere;
/*      */   }
/*      */   
/*      */   public void setCorriere(String corriere) {
/* 1027 */     this.corriere = corriere;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceAlbo() {
/* 1034 */     return this.codiceAlbo;
/*      */   }
/*      */   
/*      */   public void setCodiceAlbo(String codiceAlbo) {
/* 1038 */     this.codiceAlbo = codiceAlbo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInserimentoAlbo() {
/* 1045 */     return this.dataInserimentoAlbo;
/*      */   }
/*      */   
/*      */   public void setDataInserimentoAlbo(Date dataInserimentoAlbo) {
/* 1049 */     this.dataInserimentoAlbo = dataInserimentoAlbo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDichiarazioneDefinitiva() {
/* 1056 */     return this.dichiarazioneDefinitiva;
/*      */   }
/*      */   
/*      */   public void setDichiarazioneDefinitiva(String dichiarazioneDefinitiva) {
/* 1060 */     this.dichiarazioneDefinitiva = dichiarazioneDefinitiva;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceKab() {
/* 1067 */     return this.codiceKab;
/*      */   }
/*      */   
/*      */   public void setCodiceKab(String codiceKab) {
/* 1071 */     this.codiceKab = codiceKab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getControlloKab() {
/* 1078 */     return this.controlloKab;
/*      */   }
/*      */   
/*      */   public void setControlloKab(String controlloKab) {
/* 1082 */     this.controlloKab = controlloKab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRetePrecedente() {
/* 1089 */     return this.retePrecedente;
/*      */   }
/*      */   
/*      */   public void setRetePrecedente(String retePrecedente) {
/* 1093 */     this.retePrecedente = retePrecedente;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFl2() {
/* 1100 */     return this.fl2;
/*      */   }
/*      */   
/*      */   public void setFl2(String fl2) {
/* 1104 */     this.fl2 = fl2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFl3() {
/* 1111 */     return this.fl3;
/*      */   }
/*      */   
/*      */   public void setFl3(String fl3) {
/* 1115 */     this.fl3 = fl3;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFl4() {
/* 1122 */     return this.fl4;
/*      */   }
/*      */   
/*      */   public void setFl4(String fl4) {
/* 1126 */     this.fl4 = fl4;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFl5() {
/* 1133 */     return this.fl5;
/*      */   }
/*      */   
/*      */   public void setFl5(String fl5) {
/* 1137 */     this.fl5 = fl5;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCognomePf() {
/* 1144 */     return this.cognomePf;
/*      */   }
/*      */   
/*      */   public void setCognomePf(String cognomePf) {
/* 1148 */     this.cognomePf = cognomePf;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNomePf() {
/* 1155 */     return this.nomePf;
/*      */   }
/*      */   
/*      */   public void setNomePf(String nomePf) {
/* 1159 */     this.nomePf = nomePf;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIndirizzoEmail() {
/* 1166 */     return this.indirizzoEmail;
/*      */   }
/*      */   
/*      */   public void setIndirizzoEmail(String indirizzoEmail) {
/* 1170 */     this.indirizzoEmail = indirizzoEmail;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceRete() {
/* 1177 */     return this.codiceRete;
/*      */   }
/*      */   
/*      */   public void setCodiceRete(String codiceRete) {
/* 1181 */     this.codiceRete = codiceRete;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceCompagnia() {
/* 1188 */     return this.codiceCompagnia;
/*      */   }
/*      */   
/*      */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 1192 */     this.codiceCompagnia = codiceCompagnia;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCellulare() {
/* 1199 */     return this.cellulare;
/*      */   }
/*      */   
/*      */   public void setCellulare(String cellulare) {
/* 1203 */     this.cellulare = cellulare;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAgenziaAttualeOperativita() {
/* 1210 */     return this.agenziaAttualeOperativita;
/*      */   }
/*      */   
/*      */   public void setAgenziaAttualeOperativita(String agenziaAttualeOperativita) {
/* 1214 */     this.agenziaAttualeOperativita = agenziaAttualeOperativita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCpfAttualeOperativita() {
/* 1221 */     return this.cpfAttualeOperativita;
/*      */   }
/*      */   
/*      */   public void setCpfAttualeOperativita(String cpfAttualeOperativita) {
/* 1225 */     this.cpfAttualeOperativita = cpfAttualeOperativita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUfficioPersAttOperativita() {
/* 1232 */     return this.ufficioPersAttOperativita;
/*      */   }
/*      */   
/*      */   public void setUfficioPersAttOperativita(String ufficioPersAttOperativita) {
/* 1236 */     this.ufficioPersAttOperativita = ufficioPersAttOperativita;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSesso() {
/* 1243 */     return this.sesso;
/*      */   }
/*      */   
/*      */   public void setSesso(String sesso) {
/* 1247 */     this.sesso = sesso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegioneCommerciale() {
/* 1254 */     return this.regioneCommerciale;
/*      */   }
/*      */   
/*      */   public void setRegioneCommerciale(String regioneCommerciale) {
/* 1258 */     this.regioneCommerciale = regioneCommerciale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDistretto() {
/* 1265 */     return this.distretto;
/*      */   }
/*      */   
/*      */   public void setDistretto(String distretto) {
/* 1269 */     this.distretto = distretto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getAliquotaProvvigStandard() {
/* 1276 */     return this.aliquotaProvvigStandard;
/*      */   }
/*      */   
/*      */   public void setAliquotaProvvigStandard(Double aliquotaProvvigStandard) {
/* 1280 */     this.aliquotaProvvigStandard = aliquotaProvvigStandard;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getAliquotaProvvigAssicurativo() {
/* 1287 */     return this.aliquotaProvvigAssicurativo;
/*      */   }
/*      */   
/*      */   public void setAliquotaProvvigAssicurativo(Integer aliquotaProvvigAssicurativo) {
/* 1291 */     this.aliquotaProvvigAssicurativo = aliquotaProvvigAssicurativo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFaxPrefisso() {
/* 1298 */     return this.faxPrefisso;
/*      */   }
/*      */   
/*      */   public void setFaxPrefisso(String faxPrefisso) {
/* 1302 */     this.faxPrefisso = faxPrefisso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFaxNumero() {
/* 1309 */     return this.faxNumero;
/*      */   }
/*      */   
/*      */   public void setFaxNumero(String faxNumero) {
/* 1313 */     this.faxNumero = faxNumero;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGradoGerarchicoEsterno() {
/* 1320 */     return this.gradoGerarchicoEsterno;
/*      */   }
/*      */   
/*      */   public void setGradoGerarchicoEsterno(String gradoGerarchicoEsterno) {
/* 1324 */     this.gradoGerarchicoEsterno = gradoGerarchicoEsterno;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getFidoBancario() {
/* 1331 */     return this.fidoBancario;
/*      */   }
/*      */   
/*      */   public void setFidoBancario(Integer fidoBancario) {
/* 1335 */     this.fidoBancario = fidoBancario;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDescrizioneFiliale() {
/* 1342 */     return this.descrizioneFiliale;
/*      */   }
/*      */   
/*      */   public void setDescrizioneFiliale(String descrizioneFiliale) {
/* 1346 */     this.descrizioneFiliale = descrizioneFiliale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDescrizioneGradoGerarchico() {
/* 1353 */     return this.descrizioneGradoGerarchico;
/*      */   }
/*      */   
/*      */   public void setDescrizioneGradoGerarchico(String descrizioneGradoGerarchico) {
/* 1357 */     this.descrizioneGradoGerarchico = descrizioneGradoGerarchico;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFlagCodicePfPrincipale() {
/* 1364 */     return this.flagCodicePfPrincipale;
/*      */   }
/*      */   
/*      */   public void setFlagCodicePfPrincipale(String flagCodicePfPrincipale) {
/* 1368 */     this.flagCodicePfPrincipale = flagCodicePfPrincipale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoResidenzaEsteso() {
/* 1375 */     return this.telefonoResidenzaEsteso;
/*      */   }
/*      */   
/*      */   public void setTelefonoResidenzaEsteso(String telefonoResidenzaEsteso) {
/* 1379 */     this.telefonoResidenzaEsteso = telefonoResidenzaEsteso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoRecapitoEsteso() {
/* 1386 */     return this.telefonoRecapitoEsteso;
/*      */   }
/*      */   
/*      */   public void setTelefonoRecapitoEsteso(String telefonoRecapitoEsteso) {
/* 1390 */     this.telefonoRecapitoEsteso = telefonoRecapitoEsteso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFaxEsteso() {
/* 1397 */     return this.faxEsteso;
/*      */   }
/*      */   
/*      */   public void setFaxEsteso(String faxEsteso) {
/* 1401 */     this.faxEsteso = faxEsteso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStatoElaborazione() {
/* 1408 */     return this.statoElaborazione;
/*      */   }
/*      */   
/*      */   public void setStatoElaborazione(String statoElaborazione) {
/* 1412 */     this.statoElaborazione = statoElaborazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIstanza() {
/* 1419 */     return this.istanza;
/*      */   }
/*      */   
/*      */   public void setIstanza(String istanza) {
/* 1423 */     this.istanza = istanza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataCaricamento() {
/* 1430 */     return this.dataCaricamento;
/*      */   }
/*      */   
/*      */   public void setDataCaricamento(Date dataCaricamento) {
/* 1434 */     this.dataCaricamento = dataCaricamento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceCc2() {
/* 1441 */     return this.codiceCc2;
/*      */   }
/*      */   
/*      */   public void setCodiceCc2(String codiceCc2) {
/* 1445 */     this.codiceCc2 = codiceCc2;
/*      */   }
/*      */   
/*      */   public String toString() {
/* 1449 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataErrore() {
/* 1455 */     return this.dataErrore;
/*      */   }
/*      */   
/*      */   public void setDataErrore(Date dataErrore) {
/* 1459 */     this.dataErrore = dataErrore;
/*      */   }
/*      */   
/*      */   public String getDescrizioneErrore() {
/* 1463 */     return this.descrizioneErrore;
/*      */   }
/*      */   
/*      */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 1467 */     this.descrizioneErrore = descrizioneErrore;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntAnagraficaPfAnt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */