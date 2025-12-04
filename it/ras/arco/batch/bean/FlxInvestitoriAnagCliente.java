/*      */ package it.ras.arco.batch.bean;
/*      */ 
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FlxInvestitoriAnagCliente
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   private Integer flxId;
/*      */   private String cognome;
/*      */   private String nome;
/*      */   private String codiceFiscale;
/*      */   private String partitaIva;
/*      */   private Date dataDiNascita1;
/*      */   private String indirizzoDiResidenza;
/*      */   private String cap;
/*      */   private String comuneDiResidenza;
/*      */   private String provinciaDiResidenza;
/*      */   private String telefonoAbitazione;
/*      */   private String telefonoUfficio;
/*      */   private String telefonoCellulare;
/*      */   private String tipo;
/*      */   private Date dataDiNascita;
/*      */   private String sesso;
/*      */   private String luogoDiNascita;
/*      */   private String statoDiNascita;
/*      */   private String provinciaDiNascita;
/*      */   private String capDiNascita;
/*      */   private String nazioneDiResidenza;
/*      */   private String fax;
/*      */   private String eMail;
/*      */   private String indirizzoFiscale;
/*      */   private String localitaIndirizzoFiscale;
/*      */   private String capIndirizzoFiscale;
/*      */   private String provinciaIndirizzoFisca;
/*      */   private String nazioneIndirizzoFiscale;
/*      */   private String sedeTribunale;
/*      */   private Date dataFondazioneSoc;
/*      */   private String socEstera;
/*      */   private String borsa;
/*      */   private String capitaleSociale;
/*      */   private String capitaleVersato;
/*      */   private Date dataScioglimento;
/*      */   private String scontoConvenzione;
/*      */   private String sae;
/*      */   private String rae;
/*      */   private String informazioniAggiuntiveSettor;
/*      */   private Date dataIscrizioneRea;
/*      */   private String numeroDiRea;
/*      */   private String provinciaRea;
/*      */   private String tipoDocumentoIdentita;
/*      */   private String numeroDocumento;
/*      */   private String enteRilascio;
/*      */   private Date dataRilascio;
/*      */   private String luogoRilascio;
/*      */   private String provinciaRilascio;
/*      */   private String nazioneRilascio;
/*      */   private Date dataScadenza;
/*      */   private String fotocopiaDocum;
/*      */   private String cittadinanza;
/*      */   private String statoCivile;
/*      */   private String titoloDiStudio;
/*      */   private String regimePatrimoniale;
/*      */   private String statuto;
/*      */   private String attoCostitutivo;
/*      */   private String iscrizioneCameraDiCommercio;
/*      */   private String documentoRischiFinanziari;
/*      */   private String informativaRelativaAlProfil;
/*      */   private String esperienzaFinanziaria;
/*      */   private String situazioneFinanziaria;
/*      */   private String obiettivoInvestimento;
/*      */   private String propensioneAlRischio;
/*      */   private String rischioVal;
/*      */   private String classeDiRischio;
/*      */   private String regoleDiComportamento;
/*      */   private String pattiChiari;
/*      */   private String consensoBase;
/*      */   private String consensoComunicazioni;
/*      */   private String consensoUtilizzoDatiBanca;
/*      */   private String consensoUtilizzoDatiGruppo;
/*      */   private String consensoUtilizzoDatiSensibi;
/*      */   private String conservazioneInformazioni;
/*      */   private Date dataPrivacy;
/*      */   private String tipoModuloPrivacy;
/*      */   private String nIscrizioneCciaa;
/*      */   private String citta;
/*      */   private String attivita;
/*      */   private String statuto1;
/*      */   private String attoCostitutivo1;
/*      */   private Date dataRilascioCciaa;
/*      */   private String copiaDellaRegistrazione;
/*      */   private String certificatoDiVigenza;
/*      */   private String verbaleDiNominaDeiLegali;
/*      */   private String verbaleDiNominaDeiPoteri;
/*      */   private String copiaDeiDocIden;
/*      */   private String copiaDelC;
/*      */   private String professione;
/*      */   private String numeroDipendenti;
/*      */   private String numeroCodiceSia;
/*      */   private String societaAssegnatariaDiCodice;
/*      */   private String operaServizioCbi;
/*      */   private String operServizioCbi;
/*      */   private String informazioniSullaSituazione;
/*      */   private String statoElab;
/*      */   private String istanza;
/*      */   private Date dataCaricamento;
/*      */   private String descrizioneErrore;
/*      */   private Date dataElab;
/*      */   
/*      */   public Date getDataElab() {
/*  121 */     return this.dataElab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataElab(Date dataElab) {
/*  128 */     this.dataElab = dataElab;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDescrizioneErrore() {
/*  135 */     return this.descrizioneErrore;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  142 */     this.descrizioneErrore = descrizioneErrore;
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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FlxInvestitoriAnagCliente() {}
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FlxInvestitoriAnagCliente(String attivita, String costitutivo, String costitutivo1, String borsa, String cap, String nascita, String fiscale, String sociale, String versato, String vigenza, String citta, String cittadinanza, String rischio, String fiscale2, String cognome, String residenza, String base, String comunicazioni, String banca, String gruppo, String sensibi, String informazioni, String iden, String delC, String registrazione, Date caricamento, Date nascita2, Date nascita1, String localitaIndirizzoFiscale, Date soc, Date rea, Date privacy, Date rilascio, Date cciaa, Date scadenza, Date scioglimento, String finanziari, String mail, String rilascio2, String finanziaria, String fax, String docum, String residenza2, String fiscale3, String profil, String settor, String situazione, String commercio, String istanza, String nascita3, String rilascio3, String residenza3, String fiscale4, String rilascio4, String cciaa2, String nome, String sia, String dipendenti, String rea2, String documento, String investimento, String cbi, String cbi2, String iva, String chiari, String professione, String rischio2, String nascita4, String residenza4, String fisca, String rea3, String rilascio5, String rae, String patrimoniale, String comportamento, String val, String sae, String convenzione, String tribunale, String sesso, String finanziaria2, String estera, String codice, String civile, String nascita5, String elab, String statuto, String statuto1, String abitazione, String cellulare, String ufficio, String tipo, String identita, String privacy2, String studio, String legali, String poteri) {
/*  251 */     this.attivita = attivita;
/*  252 */     this.attoCostitutivo = costitutivo;
/*  253 */     this.attoCostitutivo1 = costitutivo1;
/*  254 */     this.borsa = borsa;
/*  255 */     this.cap = cap;
/*  256 */     this.capDiNascita = nascita;
/*  257 */     this.capIndirizzoFiscale = fiscale;
/*  258 */     this.capitaleSociale = sociale;
/*  259 */     this.capitaleVersato = versato;
/*  260 */     this.certificatoDiVigenza = vigenza;
/*  261 */     this.citta = citta;
/*  262 */     this.cittadinanza = cittadinanza;
/*  263 */     this.classeDiRischio = rischio;
/*  264 */     this.codiceFiscale = fiscale2;
/*  265 */     this.cognome = cognome;
/*  266 */     this.comuneDiResidenza = residenza;
/*  267 */     this.consensoBase = base;
/*  268 */     this.consensoComunicazioni = comunicazioni;
/*  269 */     this.consensoUtilizzoDatiBanca = banca;
/*  270 */     this.consensoUtilizzoDatiGruppo = gruppo;
/*  271 */     this.consensoUtilizzoDatiSensibi = sensibi;
/*  272 */     this.conservazioneInformazioni = informazioni;
/*  273 */     this.copiaDeiDocIden = iden;
/*  274 */     this.copiaDelC = delC;
/*  275 */     this.copiaDellaRegistrazione = registrazione;
/*  276 */     this.dataCaricamento = caricamento;
/*  277 */     this.dataDiNascita = nascita2;
/*  278 */     this.dataDiNascita1 = nascita1;
/*  279 */     localitaIndirizzoFiscale = localitaIndirizzoFiscale;
/*  280 */     this.dataFondazioneSoc = soc;
/*  281 */     this.dataIscrizioneRea = rea;
/*  282 */     this.dataPrivacy = privacy;
/*  283 */     this.dataRilascio = rilascio;
/*  284 */     this.dataRilascioCciaa = cciaa;
/*  285 */     this.dataScadenza = scadenza;
/*  286 */     this.dataScioglimento = scioglimento;
/*  287 */     this.documentoRischiFinanziari = finanziari;
/*  288 */     this.eMail = mail;
/*  289 */     this.enteRilascio = rilascio2;
/*  290 */     this.esperienzaFinanziaria = finanziaria;
/*  291 */     this.fax = fax;
/*  292 */     this.fotocopiaDocum = docum;
/*  293 */     this.indirizzoDiResidenza = residenza2;
/*  294 */     this.indirizzoFiscale = fiscale3;
/*  295 */     this.informativaRelativaAlProfil = profil;
/*  296 */     this.informazioniAggiuntiveSettor = settor;
/*  297 */     this.informazioniSullaSituazione = situazione;
/*  298 */     this.iscrizioneCameraDiCommercio = commercio;
/*  299 */     this.istanza = istanza;
/*  300 */     this.luogoDiNascita = nascita3;
/*  301 */     this.luogoRilascio = rilascio3;
/*  302 */     this.nazioneDiResidenza = residenza3;
/*  303 */     this.nazioneIndirizzoFiscale = fiscale4;
/*  304 */     this.nazioneRilascio = rilascio4;
/*  305 */     this.nIscrizioneCciaa = cciaa2;
/*  306 */     this.nome = nome;
/*  307 */     this.numeroCodiceSia = sia;
/*  308 */     this.numeroDipendenti = dipendenti;
/*  309 */     this.numeroDiRea = rea2;
/*  310 */     this.numeroDocumento = documento;
/*  311 */     this.obiettivoInvestimento = investimento;
/*  312 */     this.operaServizioCbi = cbi;
/*  313 */     this.operServizioCbi = cbi2;
/*  314 */     this.partitaIva = iva;
/*  315 */     this.pattiChiari = chiari;
/*  316 */     this.professione = professione;
/*  317 */     this.propensioneAlRischio = rischio2;
/*  318 */     this.provinciaDiNascita = nascita4;
/*  319 */     this.provinciaDiResidenza = residenza4;
/*  320 */     this.provinciaIndirizzoFisca = fisca;
/*  321 */     this.provinciaRea = rea3;
/*  322 */     this.provinciaRilascio = rilascio5;
/*  323 */     this.rae = rae;
/*  324 */     this.regimePatrimoniale = patrimoniale;
/*  325 */     this.regoleDiComportamento = comportamento;
/*  326 */     this.rischioVal = val;
/*  327 */     this.sae = sae;
/*  328 */     this.scontoConvenzione = convenzione;
/*  329 */     this.sedeTribunale = tribunale;
/*  330 */     this.sesso = sesso;
/*  331 */     this.situazioneFinanziaria = finanziaria2;
/*  332 */     this.socEstera = estera;
/*  333 */     this.societaAssegnatariaDiCodice = codice;
/*  334 */     this.statoCivile = civile;
/*  335 */     this.statoDiNascita = nascita5;
/*  336 */     this.statoElab = elab;
/*  337 */     this.statuto = statuto;
/*  338 */     this.statuto1 = statuto1;
/*  339 */     this.telefonoAbitazione = abitazione;
/*  340 */     this.telefonoCellulare = cellulare;
/*  341 */     this.telefonoUfficio = ufficio;
/*  342 */     this.tipo = tipo;
/*  343 */     this.tipoDocumentoIdentita = identita;
/*  344 */     this.tipoModuloPrivacy = privacy2;
/*  345 */     this.titoloDiStudio = studio;
/*  346 */     this.verbaleDiNominaDeiLegali = legali;
/*  347 */     this.verbaleDiNominaDeiPoteri = poteri;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAttivita() {
/*  353 */     return this.attivita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttivita(String attivita) {
/*  359 */     this.attivita = attivita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAttoCostitutivo() {
/*  365 */     return this.attoCostitutivo;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttoCostitutivo(String attoCostitutivo) {
/*  371 */     this.attoCostitutivo = attoCostitutivo;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getAttoCostitutivo1() {
/*  377 */     return this.attoCostitutivo1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setAttoCostitutivo1(String attoCostitutivo1) {
/*  383 */     this.attoCostitutivo1 = attoCostitutivo1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getBorsa() {
/*  389 */     return this.borsa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setBorsa(String borsa) {
/*  395 */     this.borsa = borsa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCap() {
/*  401 */     return this.cap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCap(String cap) {
/*  407 */     this.cap = cap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapDiNascita() {
/*  413 */     return this.capDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCapDiNascita(String capDiNascita) {
/*  419 */     this.capDiNascita = capDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapIndirizzoFiscale() {
/*  425 */     return this.capIndirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCapIndirizzoFiscale(String capIndirizzoFiscale) {
/*  431 */     this.capIndirizzoFiscale = capIndirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapitaleSociale() {
/*  437 */     return this.capitaleSociale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCapitaleSociale(String capitaleSociale) {
/*  443 */     this.capitaleSociale = capitaleSociale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapitaleVersato() {
/*  449 */     return this.capitaleVersato;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCapitaleVersato(String capitaleVersato) {
/*  455 */     this.capitaleVersato = capitaleVersato;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCertificatoDiVigenza() {
/*  461 */     return this.certificatoDiVigenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCertificatoDiVigenza(String certificatoDiVigenza) {
/*  467 */     this.certificatoDiVigenza = certificatoDiVigenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCitta() {
/*  473 */     return this.citta;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCitta(String citta) {
/*  479 */     this.citta = citta;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCittadinanza() {
/*  485 */     return this.cittadinanza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCittadinanza(String cittadinanza) {
/*  491 */     this.cittadinanza = cittadinanza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getClasseDiRischio() {
/*  497 */     return this.classeDiRischio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setClasseDiRischio(String classeDiRischio) {
/*  503 */     this.classeDiRischio = classeDiRischio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceFiscale() {
/*  509 */     return this.codiceFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceFiscale(String codiceFiscale) {
/*  515 */     this.codiceFiscale = codiceFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCognome() {
/*  521 */     return this.cognome;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCognome(String cognome) {
/*  527 */     this.cognome = cognome;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getComuneDiResidenza() {
/*  533 */     return this.comuneDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setComuneDiResidenza(String comuneDiResidenza) {
/*  539 */     this.comuneDiResidenza = comuneDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getConsensoBase() {
/*  545 */     return this.consensoBase;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConsensoBase(String consensoBase) {
/*  551 */     this.consensoBase = consensoBase;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getConsensoComunicazioni() {
/*  557 */     return this.consensoComunicazioni;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConsensoComunicazioni(String consensoComunicazioni) {
/*  563 */     this.consensoComunicazioni = consensoComunicazioni;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getConsensoUtilizzoDatiBanca() {
/*  569 */     return this.consensoUtilizzoDatiBanca;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConsensoUtilizzoDatiBanca(String consensoUtilizzoDatiBanca) {
/*  575 */     this.consensoUtilizzoDatiBanca = consensoUtilizzoDatiBanca;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getConsensoUtilizzoDatiGruppo() {
/*  581 */     return this.consensoUtilizzoDatiGruppo;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConsensoUtilizzoDatiGruppo(String consensoUtilizzoDatiGruppo) {
/*  587 */     this.consensoUtilizzoDatiGruppo = consensoUtilizzoDatiGruppo;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getConsensoUtilizzoDatiSensibi() {
/*  593 */     return this.consensoUtilizzoDatiSensibi;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConsensoUtilizzoDatiSensibi(String consensoUtilizzoDatiSensibi) {
/*  599 */     this.consensoUtilizzoDatiSensibi = consensoUtilizzoDatiSensibi;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getConservazioneInformazioni() {
/*  605 */     return this.conservazioneInformazioni;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConservazioneInformazioni(String conservazioneInformazioni) {
/*  611 */     this.conservazioneInformazioni = conservazioneInformazioni;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCopiaDeiDocIden() {
/*  617 */     return this.copiaDeiDocIden;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCopiaDeiDocIden(String copiaDeiDocIden) {
/*  623 */     this.copiaDeiDocIden = copiaDeiDocIden;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCopiaDelC() {
/*  629 */     return this.copiaDelC;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCopiaDelC(String copiaDelC) {
/*  635 */     this.copiaDelC = copiaDelC;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCopiaDellaRegistrazione() {
/*  641 */     return this.copiaDellaRegistrazione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCopiaDellaRegistrazione(String copiaDellaRegistrazione) {
/*  647 */     this.copiaDellaRegistrazione = copiaDellaRegistrazione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataCaricamento() {
/*  653 */     return this.dataCaricamento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataCaricamento(Date dataCaricamento) {
/*  659 */     this.dataCaricamento = dataCaricamento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataDiNascita() {
/*  665 */     return this.dataDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataDiNascita(Date dataDiNascita) {
/*  671 */     this.dataDiNascita = dataDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataDiNascita1() {
/*  677 */     return this.dataDiNascita1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataDiNascita1(Date dataDiNascita1) {
/*  683 */     this.dataDiNascita1 = dataDiNascita1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataFondazioneSoc() {
/*  693 */     return this.dataFondazioneSoc;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataFondazioneSoc(Date dataFondazioneSoc) {
/*  699 */     this.dataFondazioneSoc = dataFondazioneSoc;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataIscrizioneRea() {
/*  705 */     return this.dataIscrizioneRea;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataIscrizioneRea(Date dataIscrizioneRea) {
/*  711 */     this.dataIscrizioneRea = dataIscrizioneRea;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataPrivacy() {
/*  717 */     return this.dataPrivacy;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataPrivacy(Date dataPrivacy) {
/*  723 */     this.dataPrivacy = dataPrivacy;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataRilascio() {
/*  729 */     return this.dataRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataRilascio(Date dataRilascio) {
/*  735 */     this.dataRilascio = dataRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataRilascioCciaa() {
/*  741 */     return this.dataRilascioCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataRilascioCciaa(Date dataRilascioCciaa) {
/*  747 */     this.dataRilascioCciaa = dataRilascioCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataScadenza() {
/*  753 */     return this.dataScadenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataScadenza(Date dataScadenza) {
/*  759 */     this.dataScadenza = dataScadenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataScioglimento() {
/*  765 */     return this.dataScioglimento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataScioglimento(Date dataScioglimento) {
/*  771 */     this.dataScioglimento = dataScioglimento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getDocumentoRischiFinanziari() {
/*  777 */     return this.documentoRischiFinanziari;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDocumentoRischiFinanziari(String documentoRischiFinanziari) {
/*  783 */     this.documentoRischiFinanziari = documentoRischiFinanziari;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String geteMail() {
/*  790 */     return this.eMail;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void seteMail(String mail) {
/*  796 */     this.eMail = mail;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getEnteRilascio() {
/*  802 */     return this.enteRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setEnteRilascio(String enteRilascio) {
/*  808 */     this.enteRilascio = enteRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getEsperienzaFinanziaria() {
/*  814 */     return this.esperienzaFinanziaria;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setEsperienzaFinanziaria(String esperienzaFinanziaria) {
/*  820 */     this.esperienzaFinanziaria = esperienzaFinanziaria;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFax() {
/*  826 */     return this.fax;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFax(String fax) {
/*  832 */     this.fax = fax;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getFlxId() {
/*  838 */     return this.flxId;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFlxId(Integer flxId) {
/*  844 */     this.flxId = flxId;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFotocopiaDocum() {
/*  850 */     return this.fotocopiaDocum;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setFotocopiaDocum(String fotocopiaDocum) {
/*  856 */     this.fotocopiaDocum = fotocopiaDocum;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIndirizzoDiResidenza() {
/*  862 */     return this.indirizzoDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIndirizzoDiResidenza(String indirizzoDiResidenza) {
/*  868 */     this.indirizzoDiResidenza = indirizzoDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIndirizzoFiscale() {
/*  874 */     return this.indirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIndirizzoFiscale(String indirizzoFiscale) {
/*  880 */     this.indirizzoFiscale = indirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getInformativaRelativaAlProfil() {
/*  886 */     return this.informativaRelativaAlProfil;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setInformativaRelativaAlProfil(String informativaRelativaAlProfil) {
/*  892 */     this.informativaRelativaAlProfil = informativaRelativaAlProfil;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getInformazioniAggiuntiveSettor() {
/*  898 */     return this.informazioniAggiuntiveSettor;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setInformazioniAggiuntiveSettor(String informazioniAggiuntiveSettor) {
/*  904 */     this.informazioniAggiuntiveSettor = informazioniAggiuntiveSettor;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getInformazioniSullaSituazione() {
/*  910 */     return this.informazioniSullaSituazione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setInformazioniSullaSituazione(String informazioniSullaSituazione) {
/*  916 */     this.informazioniSullaSituazione = informazioniSullaSituazione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIscrizioneCameraDiCommercio() {
/*  922 */     return this.iscrizioneCameraDiCommercio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIscrizioneCameraDiCommercio(String iscrizioneCameraDiCommercio) {
/*  928 */     this.iscrizioneCameraDiCommercio = iscrizioneCameraDiCommercio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getIstanza() {
/*  934 */     return this.istanza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIstanza(String istanza) {
/*  940 */     this.istanza = istanza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getLuogoDiNascita() {
/*  946 */     return this.luogoDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLuogoDiNascita(String luogoDiNascita) {
/*  952 */     this.luogoDiNascita = luogoDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getLuogoRilascio() {
/*  958 */     return this.luogoRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLuogoRilascio(String luogoRilascio) {
/*  964 */     this.luogoRilascio = luogoRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNazioneDiResidenza() {
/*  970 */     return this.nazioneDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNazioneDiResidenza(String nazioneDiResidenza) {
/*  976 */     this.nazioneDiResidenza = nazioneDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNazioneIndirizzoFiscale() {
/*  982 */     return this.nazioneIndirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNazioneIndirizzoFiscale(String nazioneIndirizzoFiscale) {
/*  988 */     this.nazioneIndirizzoFiscale = nazioneIndirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNazioneRilascio() {
/*  994 */     return this.nazioneRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNazioneRilascio(String nazioneRilascio) {
/* 1000 */     this.nazioneRilascio = nazioneRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getnIscrizioneCciaa() {
/* 1006 */     return this.nIscrizioneCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setnIscrizioneCciaa(String iscrizioneCciaa) {
/* 1012 */     this.nIscrizioneCciaa = iscrizioneCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNome() {
/* 1018 */     return this.nome;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNome(String nome) {
/* 1024 */     this.nome = nome;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumeroCodiceSia() {
/* 1030 */     return this.numeroCodiceSia;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumeroCodiceSia(String numeroCodiceSia) {
/* 1036 */     this.numeroCodiceSia = numeroCodiceSia;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumeroDipendenti() {
/* 1042 */     return this.numeroDipendenti;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumeroDipendenti(String numeroDipendenti) {
/* 1048 */     this.numeroDipendenti = numeroDipendenti;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumeroDiRea() {
/* 1054 */     return this.numeroDiRea;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumeroDiRea(String numeroDiRea) {
/* 1060 */     this.numeroDiRea = numeroDiRea;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNumeroDocumento() {
/* 1066 */     return this.numeroDocumento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNumeroDocumento(String numeroDocumento) {
/* 1072 */     this.numeroDocumento = numeroDocumento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getObiettivoInvestimento() {
/* 1078 */     return this.obiettivoInvestimento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setObiettivoInvestimento(String obiettivoInvestimento) {
/* 1084 */     this.obiettivoInvestimento = obiettivoInvestimento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getOperaServizioCbi() {
/* 1090 */     return this.operaServizioCbi;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOperaServizioCbi(String operaServizioCbi) {
/* 1096 */     this.operaServizioCbi = operaServizioCbi;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getOperServizioCbi() {
/* 1102 */     return this.operServizioCbi;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setOperServizioCbi(String operServizioCbi) {
/* 1108 */     this.operServizioCbi = operServizioCbi;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPartitaIva() {
/* 1114 */     return this.partitaIva;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPartitaIva(String partitaIva) {
/* 1120 */     this.partitaIva = partitaIva;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPattiChiari() {
/* 1126 */     return this.pattiChiari;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPattiChiari(String pattiChiari) {
/* 1132 */     this.pattiChiari = pattiChiari;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProfessione() {
/* 1138 */     return this.professione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProfessione(String professione) {
/* 1144 */     this.professione = professione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getPropensioneAlRischio() {
/* 1150 */     return this.propensioneAlRischio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setPropensioneAlRischio(String propensioneAlRischio) {
/* 1156 */     this.propensioneAlRischio = propensioneAlRischio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaDiNascita() {
/* 1162 */     return this.provinciaDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProvinciaDiNascita(String provinciaDiNascita) {
/* 1168 */     this.provinciaDiNascita = provinciaDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaDiResidenza() {
/* 1174 */     return this.provinciaDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProvinciaDiResidenza(String provinciaDiResidenza) {
/* 1180 */     this.provinciaDiResidenza = provinciaDiResidenza;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaIndirizzoFisca() {
/* 1186 */     return this.provinciaIndirizzoFisca;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProvinciaIndirizzoFisca(String provinciaIndirizzoFisca) {
/* 1192 */     this.provinciaIndirizzoFisca = provinciaIndirizzoFisca;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaRea() {
/* 1198 */     return this.provinciaRea;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProvinciaRea(String provinciaRea) {
/* 1204 */     this.provinciaRea = provinciaRea;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getProvinciaRilascio() {
/* 1210 */     return this.provinciaRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setProvinciaRilascio(String provinciaRilascio) {
/* 1216 */     this.provinciaRilascio = provinciaRilascio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRae() {
/* 1222 */     return this.rae;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRae(String rae) {
/* 1228 */     this.rae = rae;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegimePatrimoniale() {
/* 1234 */     return this.regimePatrimoniale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRegimePatrimoniale(String regimePatrimoniale) {
/* 1240 */     this.regimePatrimoniale = regimePatrimoniale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRegoleDiComportamento() {
/* 1246 */     return this.regoleDiComportamento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRegoleDiComportamento(String regoleDiComportamento) {
/* 1252 */     this.regoleDiComportamento = regoleDiComportamento;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getRischioVal() {
/* 1258 */     return this.rischioVal;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setRischioVal(String rischioVal) {
/* 1264 */     this.rischioVal = rischioVal;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSae() {
/* 1270 */     return this.sae;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSae(String sae) {
/* 1276 */     this.sae = sae;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getScontoConvenzione() {
/* 1282 */     return this.scontoConvenzione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setScontoConvenzione(String scontoConvenzione) {
/* 1288 */     this.scontoConvenzione = scontoConvenzione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSedeTribunale() {
/* 1294 */     return this.sedeTribunale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSedeTribunale(String sedeTribunale) {
/* 1300 */     this.sedeTribunale = sedeTribunale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSesso() {
/* 1306 */     return this.sesso;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSesso(String sesso) {
/* 1312 */     this.sesso = sesso;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSituazioneFinanziaria() {
/* 1318 */     return this.situazioneFinanziaria;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSituazioneFinanziaria(String situazioneFinanziaria) {
/* 1324 */     this.situazioneFinanziaria = situazioneFinanziaria;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSocEstera() {
/* 1330 */     return this.socEstera;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSocEstera(String socEstera) {
/* 1336 */     this.socEstera = socEstera;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSocietaAssegnatariaDiCodice() {
/* 1342 */     return this.societaAssegnatariaDiCodice;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSocietaAssegnatariaDiCodice(String societaAssegnatariaDiCodice) {
/* 1348 */     this.societaAssegnatariaDiCodice = societaAssegnatariaDiCodice;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStatoCivile() {
/* 1354 */     return this.statoCivile;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setStatoCivile(String statoCivile) {
/* 1360 */     this.statoCivile = statoCivile;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStatoDiNascita() {
/* 1366 */     return this.statoDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setStatoDiNascita(String statoDiNascita) {
/* 1372 */     this.statoDiNascita = statoDiNascita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStatoElab() {
/* 1378 */     return this.statoElab;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setStatoElab(String statoElab) {
/* 1384 */     this.statoElab = statoElab;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStatuto() {
/* 1390 */     return this.statuto;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setStatuto(String statuto) {
/* 1396 */     this.statuto = statuto;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getStatuto1() {
/* 1402 */     return this.statuto1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setStatuto1(String statuto1) {
/* 1408 */     this.statuto1 = statuto1;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoAbitazione() {
/* 1414 */     return this.telefonoAbitazione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTelefonoAbitazione(String telefonoAbitazione) {
/* 1420 */     this.telefonoAbitazione = telefonoAbitazione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoCellulare() {
/* 1426 */     return this.telefonoCellulare;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTelefonoCellulare(String telefonoCellulare) {
/* 1432 */     this.telefonoCellulare = telefonoCellulare;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTelefonoUfficio() {
/* 1438 */     return this.telefonoUfficio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTelefonoUfficio(String telefonoUfficio) {
/* 1444 */     this.telefonoUfficio = telefonoUfficio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipo() {
/* 1450 */     return this.tipo;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipo(String tipo) {
/* 1456 */     this.tipo = tipo;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoDocumentoIdentita() {
/* 1462 */     return this.tipoDocumentoIdentita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoDocumentoIdentita(String tipoDocumentoIdentita) {
/* 1468 */     this.tipoDocumentoIdentita = tipoDocumentoIdentita;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoModuloPrivacy() {
/* 1474 */     return this.tipoModuloPrivacy;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoModuloPrivacy(String tipoModuloPrivacy) {
/* 1480 */     this.tipoModuloPrivacy = tipoModuloPrivacy;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTitoloDiStudio() {
/* 1486 */     return this.titoloDiStudio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTitoloDiStudio(String titoloDiStudio) {
/* 1492 */     this.titoloDiStudio = titoloDiStudio;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getVerbaleDiNominaDeiLegali() {
/* 1498 */     return this.verbaleDiNominaDeiLegali;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVerbaleDiNominaDeiLegali(String verbaleDiNominaDeiLegali) {
/* 1504 */     this.verbaleDiNominaDeiLegali = verbaleDiNominaDeiLegali;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getVerbaleDiNominaDeiPoteri() {
/* 1510 */     return this.verbaleDiNominaDeiPoteri;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setVerbaleDiNominaDeiPoteri(String verbaleDiNominaDeiPoteri) {
/* 1516 */     this.verbaleDiNominaDeiPoteri = verbaleDiNominaDeiPoteri;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getEMail() {
/* 1522 */     return this.eMail;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setEMail(String mail) {
/* 1528 */     this.eMail = mail;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getLocalitaIndirizzoFiscale() {
/* 1534 */     return this.localitaIndirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setLocalitaIndirizzoFiscale(String localitaIndirizzoFiscale) {
/* 1540 */     this.localitaIndirizzoFiscale = localitaIndirizzoFiscale;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getNIscrizioneCciaa() {
/* 1546 */     return this.nIscrizioneCciaa;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setNIscrizioneCciaa(String iscrizioneCciaa) {
/* 1552 */     this.nIscrizioneCciaa = iscrizioneCciaa;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxInvestitoriAnagCliente.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */