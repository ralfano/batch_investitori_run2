/*      */ package it.ras.arco.bean;
/*      */ 
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ import java.util.Set;
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
/*      */ public class FinPromotore
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   public static final String STATO_ATTIVO = "A";
/*      */   public static final String STATO_CESSATO = "C";
/*      */   public static final String STATO_POTENZIALE = "P";
/*      */   public static final String CODICE_RETE_AGENTE = "A";
/*      */   private Integer promotoreId;
/*      */   private String codPromotore;
/*      */   private String desPromotore;
/*      */   private Date inizioRapporto;
/*      */   private Date fineRapporto;
/*      */   private Date incarico;
/*      */   private Date inizioPreavviso;
/*      */   private Date finePreavviso;
/*      */   private String fittizio;
/*      */   private String dimissioni;
/*      */   private String esperienza;
/*      */   private String presentatore;
/*      */   private String grado;
/*      */   private String naturaRapporto;
/*      */   private String gradoVendite;
/*      */   private String areaVendite;
/*      */   private String divSgmVendite;
/*      */   private String manAmVendite;
/*      */   private String regRpVendite;
/*      */   private String sejRgTutorVendite;
/*      */   private String aliquotaFiscale;
/*      */   private Date iscrizioneEnasarco;
/*      */   private String codiceEnasarco;
/*      */   private String provinciaCciaaa;
/*      */   private String numeroCciaa;
/*      */   private String mandato;
/*      */   private String certificazione;
/*      */   private String pagamentoProvv;
/*      */   private String corriere;
/*      */   private String codAlbo;
/*      */   private Date dataInserimentoAlbo;
/*      */   private String dichiarazDefinitiva;
/*      */   private String codKab;
/*      */   private String controlloKab;
/*      */   private String codRetePrec;
/*      */   private String codRete;
/*      */   private String codComp;
/*      */   private String regioneComm;
/*      */   private Integer aliqProvvStd;
/*      */   private Integer aliqProvvAssic;
/*      */   private String gradoGerarcExt;
/*      */   private String descGradoGerarc;
/*      */   private String fidoBancario;
/*      */   private String descFiliale;
/*      */   private String codPfPrincipale;
/*      */   private Date dataInserimentoRecord;
/*      */   private String utenteInserimento;
/*      */   private FinSoggetto soggetto;
/*      */   private FinAgenzia agenzia;
/*      */   private FinAgenzia cpf;
/*      */   private FinAgenzia ufficioPersonale;
/*      */   private FinAgenzia centroRaccolta;
/*      */   private Date dataInizioLegameAgenzia;
/*      */   private Date dataInizioLegameCpf;
/*      */   private Date dataInizioLegameUfficioPersonale;
/*      */   private Date dataInizioLegameCentroRaccolta;
/*      */   private FinDistretto distretto;
/*      */   private Date dataInizioLegameDistretto;
/*      */   private FinPromotore promotorePadre;
/*      */   private Set promotoreFiglio;
/*      */   private Date dataInizioLegamePromotorePadre;
/*      */   private Set assegnazione;
/*      */   private String provinciaVendita1;
/*      */   private String provinciaVendita2;
/*      */   private String provinciaVendita3;
/*      */   private String provinciaVendita4;
/*      */   private String provinciaVendita5;
/*      */   private String regioneVendita;
/*      */   private String regioneGeografica;
/*      */   private Date dataComunicazioneCessazione;
/*      */   private Date dataProvvisoria;
/*      */   private String fl2;
/*      */   private String fl3;
/*      */   private String fl4;
/*      */   private String fl5;
/*      */   private Set promotoreCoordinata;
/*      */   private String stato;
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
/*      */   private String regionalManager;
/*      */   private String districtManager;
/*      */   private String teamManager;
/*      */   private FinAltriProdotti altriProdotti;
/*      */   private Set sottoscrizioni;
/*      */   private Set sottoscrizioniSplit;
/*      */   private Set pratiche;
/*      */   private Set bonificiOrdinati;
/*      */   private Set titoliOrdinati;
/*      */   private Set ordinatiTitoliEseguiti;
/*      */   private Set clienteGen;
/*      */   
/*      */   public Set getClienteGen() {
/*  140 */     return this.clienteGen;
/*      */   }
/*      */   
/*      */   public void setClienteGen(Set clienteGen) {
/*  144 */     this.clienteGen = clienteGen;
/*      */   }
/*      */   
/*      */   public Set getBonificiOrdinati() {
/*  148 */     return this.bonificiOrdinati;
/*      */   }
/*      */   
/*      */   public void setBonificiOrdinati(Set bonificiOrdinati) {
/*  152 */     this.bonificiOrdinati = bonificiOrdinati;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getPratiche() {
/*  159 */     return this.pratiche;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPratiche(Set pratiche) {
/*  166 */     this.pratiche = pratiche;
/*      */   }
/*      */   
/*      */   public Integer getAliquotaProvvigionaleMFee() {
/*  170 */     return this.aliquotaProvvigionaleMFee;
/*      */   }
/*      */   
/*      */   public void setAliquotaProvvigionaleMFee(Integer aliquotaProvvigionaleMFee) {
/*  174 */     this.aliquotaProvvigionaleMFee = aliquotaProvvigionaleMFee;
/*      */   }
/*      */   
/*      */   public String getAnzianitaConvenzionale() {
/*  178 */     return this.anzianitaConvenzionale;
/*      */   }
/*      */   
/*      */   public void setAnzianitaConvenzionale(String anzianitaConvenzionale) {
/*  182 */     this.anzianitaConvenzionale = anzianitaConvenzionale;
/*      */   }
/*      */   
/*      */   public String getCodiceFiscaleContributivo() {
/*  186 */     return this.codiceFiscaleContributivo;
/*      */   }
/*      */   
/*      */   public void setCodiceFiscaleContributivo(String codiceFiscaleContributivo) {
/*  190 */     this.codiceFiscaleContributivo = codiceFiscaleContributivo;
/*      */   }
/*      */   
/*      */   public Date getDataDimissioni() {
/*  194 */     return this.dataDimissioni;
/*      */   }
/*      */   
/*      */   public void setDataDimissioni(Date dataDimissioni) {
/*  198 */     this.dataDimissioni = dataDimissioni;
/*      */   }
/*      */   
/*      */   public Date getDataFineIncarico() {
/*  202 */     return this.dataFineIncarico;
/*      */   }
/*      */   
/*      */   public void setDataFineIncarico(Date dataFineIncarico) {
/*  206 */     this.dataFineIncarico = dataFineIncarico;
/*      */   }
/*      */   
/*      */   public Date getDataRecessoSindacato() {
/*  210 */     return this.dataRecessoSindacato;
/*      */   }
/*      */   
/*      */   public void setDataRecessoSindacato(Date dataRecessoSindacato) {
/*  214 */     this.dataRecessoSindacato = dataRecessoSindacato;
/*      */   }
/*      */   
/*      */   public String getDistrictManager() {
/*  218 */     return this.districtManager;
/*      */   }
/*      */   
/*      */   public void setDistrictManager(String districtManager) {
/*  222 */     this.districtManager = districtManager;
/*      */   }
/*      */   
/*      */   public String getFlagPcDotazione() {
/*  226 */     return this.flagPcDotazione;
/*      */   }
/*      */   
/*      */   public void setFlagPcDotazione(String flagPcDotazione) {
/*  230 */     this.flagPcDotazione = flagPcDotazione;
/*      */   }
/*      */   
/*      */   public String getModalitaCollocamento() {
/*  234 */     return this.modalitaCollocamento;
/*      */   }
/*      */   
/*      */   public void setModalitaCollocamento(String modalitaCollocamento) {
/*  238 */     this.modalitaCollocamento = modalitaCollocamento;
/*      */   }
/*      */   
/*      */   public String getNumeroMatricola() {
/*  242 */     return this.numeroMatricola;
/*      */   }
/*      */   
/*      */   public void setNumeroMatricola(String numeroMatricola) {
/*  246 */     this.numeroMatricola = numeroMatricola;
/*      */   }
/*      */   
/*      */   public String getPostalizzazione() {
/*  250 */     return this.postalizzazione;
/*      */   }
/*      */   
/*      */   public void setPostalizzazione(String postalizzazione) {
/*  254 */     this.postalizzazione = postalizzazione;
/*      */   }
/*      */   
/*      */   public String getPostazionePc() {
/*  258 */     return this.postazionePc;
/*      */   }
/*      */   
/*      */   public void setPostazionePc(String postazionePc) {
/*  262 */     this.postazionePc = postazionePc;
/*      */   }
/*      */   
/*      */   public String getProvinciaIscrizioneAlbo() {
/*  266 */     return this.provinciaIscrizioneAlbo;
/*      */   }
/*      */   
/*      */   public void setProvinciaIscrizioneAlbo(String provinciaIscrizioneAlbo) {
/*  270 */     this.provinciaIscrizioneAlbo = provinciaIscrizioneAlbo;
/*      */   }
/*      */   
/*      */   public String getQualifica() {
/*  274 */     return this.qualifica;
/*      */   }
/*      */   
/*      */   public void setQualifica(String qualifica) {
/*  278 */     this.qualifica = qualifica;
/*      */   }
/*      */   
/*      */   public String getRegionalManager() {
/*  282 */     return this.regionalManager;
/*      */   }
/*      */   
/*      */   public void setRegionalManager(String regionalManager) {
/*  286 */     this.regionalManager = regionalManager;
/*      */   }
/*      */   
/*      */   public String getTeamManager() {
/*  290 */     return this.teamManager;
/*      */   }
/*      */   
/*      */   public void setTeamManager(String teamManager) {
/*  294 */     this.teamManager = teamManager;
/*      */   }
/*      */   
/*      */   public String getTutor() {
/*  298 */     return this.tutor;
/*      */   }
/*      */   
/*      */   public void setTutor(String tutor) {
/*  302 */     this.tutor = tutor;
/*      */   }
/*      */   
/*      */   public String getUfficioSedeOperativa() {
/*  306 */     return this.ufficioSedeOperativa;
/*      */   }
/*      */   
/*      */   public void setUfficioSedeOperativa(String ufficioSedeOperativa) {
/*  310 */     this.ufficioSedeOperativa = ufficioSedeOperativa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public FinPromotore() {}
/*      */ 
/*      */   
/*      */   public FinPromotore(Integer promotoreId) {
/*  319 */     this.promotoreId = promotoreId;
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
/*      */   public Integer getPromotoreId() {
/*  331 */     return this.promotoreId;
/*      */   }
/*      */   
/*      */   public void setPromotoreId(Integer promotoreId) {
/*  335 */     this.promotoreId = promotoreId;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodPromotore() {
/*  343 */     return this.codPromotore;
/*      */   }
/*      */   
/*      */   public void setCodPromotore(String codPromotore) {
/*  347 */     this.codPromotore = codPromotore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDesPromotore() {
/*  354 */     return this.desPromotore;
/*      */   }
/*      */   
/*      */   public void setDesPromotore(String desPromotore) {
/*  358 */     this.desPromotore = desPromotore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getInizioRapporto() {
/*  365 */     return this.inizioRapporto;
/*      */   }
/*      */   
/*      */   public void setInizioRapporto(Date inizioRapporto) {
/*  369 */     this.inizioRapporto = inizioRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getFineRapporto() {
/*  376 */     return this.fineRapporto;
/*      */   }
/*      */   
/*      */   public void setFineRapporto(Date fineRapporto) {
/*  380 */     this.fineRapporto = fineRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getIncarico() {
/*  387 */     return this.incarico;
/*      */   }
/*      */   
/*      */   public void setIncarico(Date incarico) {
/*  391 */     this.incarico = incarico;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getInizioPreavviso() {
/*  398 */     return this.inizioPreavviso;
/*      */   }
/*      */   
/*      */   public void setInizioPreavviso(Date inizioPreavviso) {
/*  402 */     this.inizioPreavviso = inizioPreavviso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getFinePreavviso() {
/*  409 */     return this.finePreavviso;
/*      */   }
/*      */   
/*      */   public void setFinePreavviso(Date finePreavviso) {
/*  413 */     this.finePreavviso = finePreavviso;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFittizio() {
/*  420 */     return this.fittizio;
/*      */   }
/*      */   
/*      */   public void setFittizio(String fittizio) {
/*  424 */     this.fittizio = fittizio;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDimissioni() {
/*  431 */     return this.dimissioni;
/*      */   }
/*      */   
/*      */   public void setDimissioni(String dimissioni) {
/*  435 */     this.dimissioni = dimissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getEsperienza() {
/*  442 */     return this.esperienza;
/*      */   }
/*      */   
/*      */   public void setEsperienza(String esperienza) {
/*  446 */     this.esperienza = esperienza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPresentatore() {
/*  453 */     return this.presentatore;
/*      */   }
/*      */   
/*      */   public void setPresentatore(String presentatore) {
/*  457 */     this.presentatore = presentatore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGrado() {
/*  464 */     return this.grado;
/*      */   }
/*      */   
/*      */   public void setGrado(String grado) {
/*  468 */     this.grado = grado;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNaturaRapporto() {
/*  475 */     return this.naturaRapporto;
/*      */   }
/*      */   
/*      */   public void setNaturaRapporto(String naturaRapporto) {
/*  479 */     this.naturaRapporto = naturaRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGradoVendite() {
/*  486 */     return this.gradoVendite;
/*      */   }
/*      */   
/*      */   public void setGradoVendite(String gradoVendite) {
/*  490 */     this.gradoVendite = gradoVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAreaVendite() {
/*  497 */     return this.areaVendite;
/*      */   }
/*      */   
/*      */   public void setAreaVendite(String areaVendite) {
/*  501 */     this.areaVendite = areaVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDivSgmVendite() {
/*  508 */     return this.divSgmVendite;
/*      */   }
/*      */   
/*      */   public void setDivSgmVendite(String divSgmVendite) {
/*  512 */     this.divSgmVendite = divSgmVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getManAmVendite() {
/*  519 */     return this.manAmVendite;
/*      */   }
/*      */   
/*      */   public void setManAmVendite(String manAmVendite) {
/*  523 */     this.manAmVendite = manAmVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegRpVendite() {
/*  530 */     return this.regRpVendite;
/*      */   }
/*      */   
/*      */   public void setRegRpVendite(String regRpVendite) {
/*  534 */     this.regRpVendite = regRpVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSejRgTutorVendite() {
/*  541 */     return this.sejRgTutorVendite;
/*      */   }
/*      */   
/*      */   public void setSejRgTutorVendite(String sejRgTutorVendite) {
/*  545 */     this.sejRgTutorVendite = sejRgTutorVendite;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAliquotaFiscale() {
/*  552 */     return this.aliquotaFiscale;
/*      */   }
/*      */   
/*      */   public void setAliquotaFiscale(String aliquotaFiscale) {
/*  556 */     this.aliquotaFiscale = aliquotaFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getIscrizioneEnasarco() {
/*  563 */     return this.iscrizioneEnasarco;
/*      */   }
/*      */   
/*      */   public void setIscrizioneEnasarco(Date iscrizioneEnasarco) {
/*  567 */     this.iscrizioneEnasarco = iscrizioneEnasarco;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceEnasarco() {
/*  574 */     return this.codiceEnasarco;
/*      */   }
/*      */   
/*      */   public void setCodiceEnasarco(String codiceEnasarco) {
/*  578 */     this.codiceEnasarco = codiceEnasarco;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaCciaaa() {
/*  585 */     return this.provinciaCciaaa;
/*      */   }
/*      */   
/*      */   public void setProvinciaCciaaa(String provinciaCciaaa) {
/*  589 */     this.provinciaCciaaa = provinciaCciaaa;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumeroCciaa() {
/*  596 */     return this.numeroCciaa;
/*      */   }
/*      */   
/*      */   public void setNumeroCciaa(String numeroCciaa) {
/*  600 */     this.numeroCciaa = numeroCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getMandato() {
/*  607 */     return this.mandato;
/*      */   }
/*      */   
/*      */   public void setMandato(String mandato) {
/*  611 */     this.mandato = mandato;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCertificazione() {
/*  618 */     return this.certificazione;
/*      */   }
/*      */   
/*      */   public void setCertificazione(String certificazione) {
/*  622 */     this.certificazione = certificazione;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPagamentoProvv() {
/*  629 */     return this.pagamentoProvv;
/*      */   }
/*      */   
/*      */   public void setPagamentoProvv(String pagamentoProvv) {
/*  633 */     this.pagamentoProvv = pagamentoProvv;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCorriere() {
/*  640 */     return this.corriere;
/*      */   }
/*      */   
/*      */   public void setCorriere(String corriere) {
/*  644 */     this.corriere = corriere;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodAlbo() {
/*  651 */     return this.codAlbo;
/*      */   }
/*      */   
/*      */   public void setCodAlbo(String codAlbo) {
/*  655 */     this.codAlbo = codAlbo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInserimentoAlbo() {
/*  662 */     return this.dataInserimentoAlbo;
/*      */   }
/*      */   
/*      */   public void setDataInserimentoAlbo(Date dataInserimentoAlbo) {
/*  666 */     this.dataInserimentoAlbo = dataInserimentoAlbo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDichiarazDefinitiva() {
/*  673 */     return this.dichiarazDefinitiva;
/*      */   }
/*      */   
/*      */   public void setDichiarazDefinitiva(String dichiarazDefinitiva) {
/*  677 */     this.dichiarazDefinitiva = dichiarazDefinitiva;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodKab() {
/*  684 */     return this.codKab;
/*      */   }
/*      */   
/*      */   public void setCodKab(String codKab) {
/*  688 */     this.codKab = codKab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getControlloKab() {
/*  695 */     return this.controlloKab;
/*      */   }
/*      */   
/*      */   public void setControlloKab(String controlloKab) {
/*  699 */     this.controlloKab = controlloKab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodRetePrec() {
/*  706 */     return this.codRetePrec;
/*      */   }
/*      */   
/*      */   public void setCodRetePrec(String codRetePrec) {
/*  710 */     this.codRetePrec = codRetePrec;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodRete() {
/*  717 */     return this.codRete;
/*      */   }
/*      */   
/*      */   public void setCodRete(String codRete) {
/*  721 */     this.codRete = codRete;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodComp() {
/*  728 */     return this.codComp;
/*      */   }
/*      */   
/*      */   public void setCodComp(String codComp) {
/*  732 */     this.codComp = codComp;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegioneComm() {
/*  739 */     return this.regioneComm;
/*      */   }
/*      */   
/*      */   public void setRegioneComm(String regioneComm) {
/*  743 */     this.regioneComm = regioneComm;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getAliqProvvStd() {
/*  750 */     return this.aliqProvvStd;
/*      */   }
/*      */   
/*      */   public void setAliqProvvStd(Integer aliqProvvStd) {
/*  754 */     this.aliqProvvStd = aliqProvvStd;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getAliqProvvAssic() {
/*  761 */     return this.aliqProvvAssic;
/*      */   }
/*      */   
/*      */   public void setAliqProvvAssic(Integer aliqProvvAssic) {
/*  765 */     this.aliqProvvAssic = aliqProvvAssic;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGradoGerarcExt() {
/*  772 */     return this.gradoGerarcExt;
/*      */   }
/*      */   
/*      */   public void setGradoGerarcExt(String gradoGerarcExt) {
/*  776 */     this.gradoGerarcExt = gradoGerarcExt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDescGradoGerarc() {
/*  783 */     return this.descGradoGerarc;
/*      */   }
/*      */   
/*      */   public void setDescGradoGerarc(String descGradoGerarc) {
/*  787 */     this.descGradoGerarc = descGradoGerarc;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFidoBancario() {
/*  794 */     return this.fidoBancario;
/*      */   }
/*      */   
/*      */   public void setFidoBancario(String fidoBancario) {
/*  798 */     this.fidoBancario = fidoBancario;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDescFiliale() {
/*  805 */     return this.descFiliale;
/*      */   }
/*      */   
/*      */   public void setDescFiliale(String descFiliale) {
/*  809 */     this.descFiliale = descFiliale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodPfPrincipale() {
/*  816 */     return this.codPfPrincipale;
/*      */   }
/*      */   
/*      */   public void setCodPfPrincipale(String codPfPrincipale) {
/*  820 */     this.codPfPrincipale = codPfPrincipale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInserimentoRecord() {
/*  830 */     return this.dataInserimentoRecord;
/*      */   }
/*      */   
/*      */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/*  834 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUtenteInserimento() {
/*  842 */     return this.utenteInserimento;
/*      */   }
/*      */   
/*      */   public void setUtenteInserimento(String utenteInserimento) {
/*  846 */     this.utenteInserimento = utenteInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public FinSoggetto getSoggetto() {
/*  852 */     return this.soggetto;
/*      */   }
/*      */   
/*      */   public void setSoggetto(FinSoggetto soggetto) {
/*  856 */     this.soggetto = soggetto;
/*      */   }
/*      */   
/*      */   public FinAgenzia getAgenzia() {
/*  860 */     return this.agenzia;
/*      */   }
/*      */   
/*      */   public void setAgenzia(FinAgenzia agenzia) {
/*  864 */     this.agenzia = agenzia;
/*      */   }
/*      */   
/*      */   public FinAgenzia getCpf() {
/*  868 */     return this.cpf;
/*      */   }
/*      */   
/*      */   public void setCpf(FinAgenzia cpf) {
/*  872 */     this.cpf = cpf;
/*      */   }
/*      */   
/*      */   public FinAgenzia getUfficioPersonale() {
/*  876 */     return this.ufficioPersonale;
/*      */   }
/*      */   
/*      */   public void setUfficioPersonale(FinAgenzia ufficioPersonale) {
/*  880 */     this.ufficioPersonale = ufficioPersonale;
/*      */   }
/*      */   
/*      */   public Date getDataInizioLegameAgenzia() {
/*  884 */     return this.dataInizioLegameAgenzia;
/*      */   }
/*      */   
/*      */   public void setDataInizioLegameAgenzia(Date dataInizioLegameAgenzia) {
/*  888 */     this.dataInizioLegameAgenzia = dataInizioLegameAgenzia;
/*      */   }
/*      */   
/*      */   public FinDistretto getDistretto() {
/*  892 */     return this.distretto;
/*      */   }
/*      */   
/*      */   public void setDistretto(FinDistretto distretto) {
/*  896 */     this.distretto = distretto;
/*      */   }
/*      */   
/*      */   public Date getDataInizioLegameDistretto() {
/*  900 */     return this.dataInizioLegameDistretto;
/*      */   }
/*      */   
/*      */   public void setDataInizioLegameDistretto(Date dataInizioLegameDistretto) {
/*  904 */     this.dataInizioLegameDistretto = dataInizioLegameDistretto;
/*      */   }
/*      */   
/*      */   public FinPromotore getPromotorePadre() {
/*  908 */     return this.promotorePadre;
/*      */   }
/*      */   
/*      */   public void setPromotorePadre(FinPromotore promotorePadre) {
/*  912 */     this.promotorePadre = promotorePadre;
/*      */   }
/*      */   
/*      */   public Set getPromotoreFiglio() {
/*  916 */     return this.promotoreFiglio;
/*      */   }
/*      */   
/*      */   public void setPromotoreFiglio(Set promotoreFiglio) {
/*  920 */     this.promotoreFiglio = promotoreFiglio;
/*      */   }
/*      */   
/*      */   public Date getDataInizioLegamePromotorePadre() {
/*  924 */     return this.dataInizioLegamePromotorePadre;
/*      */   }
/*      */   
/*      */   public void setDataInizioLegamePromotorePadre(Date dataInizioLegamePromotorePadre) {
/*  928 */     this.dataInizioLegamePromotorePadre = dataInizioLegamePromotorePadre;
/*      */   }
/*      */   
/*      */   public Set getAssegnazione() {
/*  932 */     return this.assegnazione;
/*      */   }
/*      */   
/*      */   public void setAssegnazione(Set assegnazione) {
/*  936 */     this.assegnazione = assegnazione;
/*      */   }
/*      */   
/*      */   public String getProvinciaVendita1() {
/*  940 */     return this.provinciaVendita1;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita1(String provinciaVendita1) {
/*  944 */     this.provinciaVendita1 = provinciaVendita1;
/*      */   }
/*      */   
/*      */   public String getProvinciaVendita2() {
/*  948 */     return this.provinciaVendita2;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita2(String provinciaVendita2) {
/*  952 */     this.provinciaVendita2 = provinciaVendita2;
/*      */   }
/*      */   
/*      */   public String getProvinciaVendita3() {
/*  956 */     return this.provinciaVendita3;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita3(String provinciaVendita3) {
/*  960 */     this.provinciaVendita3 = provinciaVendita3;
/*      */   }
/*      */   
/*      */   public String getProvinciaVendita4() {
/*  964 */     return this.provinciaVendita4;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita4(String provinciaVendita4) {
/*  968 */     this.provinciaVendita4 = provinciaVendita4;
/*      */   }
/*      */   
/*      */   public String getProvinciaVendita5() {
/*  972 */     return this.provinciaVendita5;
/*      */   }
/*      */   
/*      */   public void setProvinciaVendita5(String provinciaVendita5) {
/*  976 */     this.provinciaVendita5 = provinciaVendita5;
/*      */   }
/*      */   
/*      */   public String getRegioneVendita() {
/*  980 */     return this.regioneVendita;
/*      */   }
/*      */   
/*      */   public void setRegioneVendita(String regioneVendita) {
/*  984 */     this.regioneVendita = regioneVendita;
/*      */   }
/*      */   
/*      */   public String getRegioneGeografica() {
/*  988 */     return this.regioneGeografica;
/*      */   }
/*      */   
/*      */   public void setRegioneGeografica(String regioneGeografica) {
/*  992 */     this.regioneGeografica = regioneGeografica;
/*      */   }
/*      */   
/*      */   public Date getDataComunicazioneCessazione() {
/*  996 */     return this.dataComunicazioneCessazione;
/*      */   }
/*      */   
/*      */   public void setDataComunicazioneCessazione(Date dataComunicazioneCessazione) {
/* 1000 */     this.dataComunicazioneCessazione = dataComunicazioneCessazione;
/*      */   }
/*      */   
/*      */   public Date getDataProvvisoria() {
/* 1004 */     return this.dataProvvisoria;
/*      */   }
/*      */   
/*      */   public void setDataProvvisoria(Date dataProvvisoria) {
/* 1008 */     this.dataProvvisoria = dataProvvisoria;
/*      */   }
/*      */   
/*      */   public String getFl2() {
/* 1012 */     return this.fl2;
/*      */   }
/*      */   
/*      */   public void setFl2(String fl2) {
/* 1016 */     this.fl2 = fl2;
/*      */   }
/*      */   
/*      */   public String getFl3() {
/* 1020 */     return this.fl3;
/*      */   }
/*      */   
/*      */   public void setFl3(String fl3) {
/* 1024 */     this.fl3 = fl3;
/*      */   }
/*      */   
/*      */   public String getFl4() {
/* 1028 */     return this.fl4;
/*      */   }
/*      */   
/*      */   public void setFl4(String fl4) {
/* 1032 */     this.fl4 = fl4;
/*      */   }
/*      */   
/*      */   public String getFl5() {
/* 1036 */     return this.fl5;
/*      */   }
/*      */   
/*      */   public void setFl5(String fl5) {
/* 1040 */     this.fl5 = fl5;
/*      */   }
/*      */   
/*      */   public Set getPromotoreCoordinata() {
/* 1044 */     return this.promotoreCoordinata;
/*      */   }
/*      */   
/*      */   public void setPromotoreCoordinata(Set promotoreCoordinata) {
/* 1048 */     this.promotoreCoordinata = promotoreCoordinata;
/*      */   }
/*      */   
/*      */   public String getStato() {
/* 1052 */     return this.stato;
/*      */   }
/*      */   
/*      */   public void setStato(String stato) {
/* 1056 */     this.stato = stato;
/*      */   }
/*      */ 
/*      */   
/*      */   public FinAgenzia getCentroRaccolta() {
/* 1061 */     return this.centroRaccolta;
/*      */   }
/*      */   
/*      */   public void setCentroRaccolta(FinAgenzia centroRaccolta) {
/* 1065 */     this.centroRaccolta = centroRaccolta;
/*      */   }
/*      */   
/*      */   public Date getDataInizioLegameCentroRaccolta() {
/* 1069 */     return this.dataInizioLegameCentroRaccolta;
/*      */   }
/*      */   
/*      */   public void setDataInizioLegameCentroRaccolta(Date dataInizioLegameCentroRaccolta) {
/* 1073 */     this.dataInizioLegameCentroRaccolta = dataInizioLegameCentroRaccolta;
/*      */   }
/*      */   
/*      */   public Date getDataInizioLegameCpf() {
/* 1077 */     return this.dataInizioLegameCpf;
/*      */   }
/*      */   
/*      */   public void setDataInizioLegameCpf(Date dataInizioLegameCpf) {
/* 1081 */     this.dataInizioLegameCpf = dataInizioLegameCpf;
/*      */   }
/*      */   
/*      */   public Date getDataInizioLegameUfficioPersonale() {
/* 1085 */     return this.dataInizioLegameUfficioPersonale;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataInizioLegameUfficioPersonale(Date dataInizioLegameUfficioPersonale) {
/* 1090 */     this.dataInizioLegameUfficioPersonale = dataInizioLegameUfficioPersonale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FinAltriProdotti getAltriProdotti() {
/* 1098 */     return this.altriProdotti;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAltriProdotti(FinAltriProdotti altriProdotti) {
/* 1106 */     this.altriProdotti = altriProdotti;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getSottoscrizioni() {
/* 1113 */     return this.sottoscrizioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSottoscrizioni(Set sottoscrizioni) {
/* 1120 */     this.sottoscrizioni = sottoscrizioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getSottoscrizioniSplit() {
/* 1127 */     return this.sottoscrizioniSplit;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSottoscrizioniSplit(Set sottoscrizioniSplit) {
/* 1134 */     this.sottoscrizioniSplit = sottoscrizioniSplit;
/*      */   }
/*      */   
/*      */   public String toString() {
/* 1138 */     return (new ToStringBuilder(this)).append("promotoreId", getPromotoreId()).toString();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getTitoliOrdinati() {
/* 1144 */     return this.titoliOrdinati;
/*      */   }
/*      */   public void setTitoliOrdinati(Set titoliOrdinati) {
/* 1147 */     this.titoliOrdinati = titoliOrdinati;
/*      */   }
/*      */   
/*      */   public Set getOrdinatiTitoliEseguiti() {
/* 1151 */     return this.ordinatiTitoliEseguiti;
/*      */   }
/*      */   
/*      */   public void setOrdinatiTitoliEseguiti(Set ordinatiTitoliEseguiti) {
/* 1155 */     this.ordinatiTitoliEseguiti = ordinatiTitoliEseguiti;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPromotore.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */