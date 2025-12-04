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
/*     */ public class FlxSoggettoXP
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer soggettoXpId;
/*     */   private Integer ndgArco;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String tipoSogg;
/*     */   private String condPartSogg;
/*     */   private String sesso;
/*     */   private String codiceFiscale;
/*     */   private String partitaIva;
/*     */   private Date dataNascita;
/*     */   private String comuneNascita;
/*     */   private String provNascita;
/*     */   private String nazNascita;
/*     */   private String denominazione;
/*     */   private String cittadinanza;
/*     */   private String statoCivile;
/*     */   private String tipoSocieta;
/*     */   private String attivita;
/*     */   private String noteAttivita;
/*     */   private String settore;
/*     */   private String statoCensim;
/*     */   private String provDatiAnag;
/*     */   private String datiSupl;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String statoElab;
/*     */   private String statoCliente;
/*     */   private String regoleProm;
/*     */   private String soggMinore;
/*     */   private String soggInterd;
/*     */   private String borsa;
/*     */   private String attoCostit;
/*     */   private String statoOper;
/*     */   private String cciaa;
/*     */   private Date dataFondaz;
/*     */   private Date dataSciogli;
/*     */   private String numCciaa;
/*     */   private String numRea;
/*     */   private String pattiChiari;
/*     */   private String provRea;
/*     */   private String socEstera;
/*     */   private String statuto;
/*     */   private String sedeTribunale;
/*     */   private String verbaleNomina;
/*     */   private String certifVigenza;
/*     */   private String citta;
/*     */   private String copiaCodFisc;
/*     */   private String copiaDocLeg;
/*     */   private String copiaRegTrib;
/*     */   private String note;
/*     */   private String patrimonioTot;
/*     */   private String fasciaCli;
/*     */   private String capNascita;
/*     */   private String capitaleSoc;
/*     */   private String capitaleVer;
/*     */   private Date dataIscrRea;
/*     */   private String fotocopiaDoc;
/*     */   private String verbalePoteri;
/*     */   private String tipoUltimaModifica;
/*     */   
/*     */   public String getAttoCostit() {
/* 140 */     return this.attoCostit;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttoCostit(String attoCostit) {
/* 145 */     this.attoCostit = attoCostit;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getBorsa() {
/* 150 */     return this.borsa;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setBorsa(String borsa) {
/* 155 */     this.borsa = borsa;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCapitaleSoc() {
/* 160 */     return this.capitaleSoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCapitaleSoc(String capitaleSoc) {
/* 165 */     this.capitaleSoc = capitaleSoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCapitaleVer() {
/* 170 */     return this.capitaleVer;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCapitaleVer(String capitaleVer) {
/* 175 */     this.capitaleVer = capitaleVer;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCapNascita() {
/* 180 */     return this.capNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCapNascita(String capNascita) {
/* 185 */     this.capNascita = capNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCciaa() {
/* 190 */     return this.cciaa;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCciaa(String cciaa) {
/* 195 */     this.cciaa = cciaa;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCertifVigenza() {
/* 200 */     return this.certifVigenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCertifVigenza(String certifVigenza) {
/* 205 */     this.certifVigenza = certifVigenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCitta() {
/* 210 */     return this.citta;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCitta(String citta) {
/* 215 */     this.citta = citta;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCopiaCodFisc() {
/* 220 */     return this.copiaCodFisc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCopiaCodFisc(String copiaCodFisc) {
/* 225 */     this.copiaCodFisc = copiaCodFisc;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCopiaDocLeg() {
/* 230 */     return this.copiaDocLeg;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCopiaDocLeg(String copiaDocLeg) {
/* 235 */     this.copiaDocLeg = copiaDocLeg;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCopiaRegTrib() {
/* 240 */     return this.copiaRegTrib;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCopiaRegTrib(String copiaRegTrib) {
/* 245 */     this.copiaRegTrib = copiaRegTrib;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFondaz() {
/* 250 */     return this.dataFondaz;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataFondaz(Date dataFondaz) {
/* 255 */     this.dataFondaz = dataFondaz;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataIscrRea() {
/* 260 */     return this.dataIscrRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataIscrRea(Date dataIscrRea) {
/* 265 */     this.dataIscrRea = dataIscrRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataSciogli() {
/* 270 */     return this.dataSciogli;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataSciogli(Date dataSciogli) {
/* 275 */     this.dataSciogli = dataSciogli;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFasciaCli() {
/* 280 */     return this.fasciaCli;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFasciaCli(String fasciaCli) {
/* 285 */     this.fasciaCli = fasciaCli;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFotocopiaDoc() {
/* 290 */     return this.fotocopiaDoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFotocopiaDoc(String fotocopiaDoc) {
/* 295 */     this.fotocopiaDoc = fotocopiaDoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNote() {
/* 300 */     return this.note;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNote(String note) {
/* 305 */     this.note = note;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNumCciaa() {
/* 310 */     return this.numCciaa;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumCciaa(String numCciaa) {
/* 315 */     this.numCciaa = numCciaa;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNumRea() {
/* 320 */     return this.numRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumRea(String numRea) {
/* 325 */     this.numRea = numRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPatrimonioTot() {
/* 330 */     return this.patrimonioTot;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPatrimonioTot(String patrimonioTot) {
/* 335 */     this.patrimonioTot = patrimonioTot;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPattiChiari() {
/* 340 */     return this.pattiChiari;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPattiChiari(String pattiChiari) {
/* 345 */     this.pattiChiari = pattiChiari;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvRea() {
/* 350 */     return this.provRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvRea(String provRea) {
/* 355 */     this.provRea = provRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRegoleProm() {
/* 360 */     return this.regoleProm;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRegoleProm(String regoleProm) {
/* 365 */     this.regoleProm = regoleProm;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSedeTribunale() {
/* 370 */     return this.sedeTribunale;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSedeTribunale(String sedeTribunale) {
/* 375 */     this.sedeTribunale = sedeTribunale;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSocEstera() {
/* 380 */     return this.socEstera;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSocEstera(String socEstera) {
/* 385 */     this.socEstera = socEstera;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSoggInterd() {
/* 390 */     return this.soggInterd;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggInterd(String soggInterd) {
/* 395 */     this.soggInterd = soggInterd;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSoggMinore() {
/* 400 */     return this.soggMinore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggMinore(String soggMinore) {
/* 405 */     this.soggMinore = soggMinore;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoCliente() {
/* 410 */     return this.statoCliente;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoCliente(String statoCliente) {
/* 415 */     this.statoCliente = statoCliente;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoOper() {
/* 420 */     return this.statoOper;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoOper(String statoOper) {
/* 425 */     this.statoOper = statoOper;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatuto() {
/* 430 */     return this.statuto;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatuto(String statuto) {
/* 435 */     this.statuto = statuto;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getVerbaleNomina() {
/* 440 */     return this.verbaleNomina;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVerbaleNomina(String verbaleNomina) {
/* 445 */     this.verbaleNomina = verbaleNomina;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getVerbalePoteri() {
/* 450 */     return this.verbalePoteri;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVerbalePoteri(String verbalePoteri) {
/* 455 */     this.verbalePoteri = verbalePoteri;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAttivita() {
/* 460 */     return this.attivita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivita(String attivita) {
/* 471 */     this.attivita = attivita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCittadinanza() {
/* 476 */     return this.cittadinanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCittadinanza(String cittadinanza) {
/* 481 */     this.cittadinanza = cittadinanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodiceFiscale() {
/* 486 */     return this.codiceFiscale;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 491 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCognome() {
/* 496 */     return this.cognome;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCognome(String cognome) {
/* 501 */     this.cognome = cognome;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getComuneNascita() {
/* 506 */     return this.comuneNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setComuneNascita(String comuneNascita) {
/* 511 */     this.comuneNascita = comuneNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCondPartSogg() {
/* 516 */     return this.condPartSogg;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCondPartSogg(String condPartSogg) {
/* 521 */     this.condPartSogg = condPartSogg;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 526 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 531 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataNascita() {
/* 536 */     return this.dataNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataNascita(Date dataNascita) {
/* 541 */     this.dataNascita = dataNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 546 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 551 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDatiSupl() {
/* 556 */     return this.datiSupl;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/* 561 */     this.datiSupl = datiSupl;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDenominazione() {
/* 566 */     return this.denominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 571 */     this.denominazione = denominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/* 576 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 581 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNazNascita() {
/* 586 */     return this.nazNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNazNascita(String nazNascita) {
/* 591 */     this.nazNascita = nazNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNdgArco() {
/* 596 */     return this.ndgArco;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNdgArco(Integer ndgArco) {
/* 601 */     this.ndgArco = ndgArco;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNome() {
/* 606 */     return this.nome;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNome(String nome) {
/* 611 */     this.nome = nome;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNoteAttivita() {
/* 616 */     return this.noteAttivita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNoteAttivita(String noteAttivita) {
/* 621 */     this.noteAttivita = noteAttivita;
/*     */   }
/*     */   
/*     */   public String getPartitaIva() {
/* 625 */     return this.partitaIva;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPartitaIva(String partitaIva) {
/* 630 */     this.partitaIva = partitaIva;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 635 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 640 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvDatiAnag() {
/* 645 */     return this.provDatiAnag;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvDatiAnag(String provDatiAnag) {
/* 650 */     this.provDatiAnag = provDatiAnag;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvNascita() {
/* 655 */     return this.provNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvNascita(String provNascita) {
/* 660 */     this.provNascita = provNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSesso() {
/* 665 */     return this.sesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSesso(String sesso) {
/* 670 */     this.sesso = sesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSettore() {
/* 675 */     return this.settore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSettore(String settore) {
/* 680 */     this.settore = settore;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getSoggettoXpId() {
/* 685 */     return this.soggettoXpId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggettoXpId(Integer soggettoXpId) {
/* 690 */     this.soggettoXpId = soggettoXpId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoCensim() {
/* 695 */     return this.statoCensim;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoCensim(String statoCensim) {
/* 700 */     this.statoCensim = statoCensim;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoCivile() {
/* 705 */     return this.statoCivile;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoCivile(String statoCivile) {
/* 710 */     this.statoCivile = statoCivile;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoSocieta() {
/* 715 */     return this.tipoSocieta;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoSocieta(String tipoSocieta) {
/* 720 */     this.tipoSocieta = tipoSocieta;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoSogg() {
/* 725 */     return this.tipoSogg;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoSogg(String tipoSogg) {
/* 730 */     this.tipoSogg = tipoSogg;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 735 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 740 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 745 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 750 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 755 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 760 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 765 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 770 */     this.statoElab = statoElab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSoggettoXP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */