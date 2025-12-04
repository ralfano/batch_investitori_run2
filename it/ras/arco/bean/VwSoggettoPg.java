/*     */ package it.ras.arco.bean;
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
/*     */ public class VwSoggettoPg
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   Long VW_id;
/*     */   String cognome;
/*     */   String nome;
/*     */   String denominazione;
/*     */   String partitaIva;
/*     */   String comuneNas;
/*     */   String provNas;
/*     */   String nazNas;
/*     */   String sesso;
/*     */   String regAntit;
/*     */   String attivita;
/*     */   String settore;
/*     */   String attPrisma;
/*     */   String codToponimo;
/*     */   String indirizzo;
/*     */   String civico;
/*     */   String comune;
/*     */   String prov;
/*     */   String cap;
/*     */   String nazione;
/*     */   String cab;
/*     */   String localita;
/*     */   String tipoDoc;
/*     */   String numeroDoc;
/*     */   String enteRilascio;
/*     */   String docRischi;
/*     */   String privacyZero;
/*     */   String privacyUno;
/*     */   String privacyDue;
/*     */   String privacyTre;
/*     */   String privacyQuattro;
/*     */   String privacyCinque;
/*     */   String privacySei;
/*     */   String privacySette;
/*     */   String privacyOtto;
/*     */   String privacyNove;
/*     */   String fabbrica;
/*     */   String codPromotore;
/*     */   String codiceFiscale;
/*     */   Integer soggettoId;
/*     */   Integer ndgArco;
/*     */   String ndgFabbr;
/*     */   Integer rownum;
/*     */   Date dataCons;
/*     */   Date dataDeroga;
/*     */   Date dataConf;
/*     */   Date dataAut;
/*     */   Date dataComp;
/*     */   Date dataRilascio;
/*     */   Date dataNascita;
/*     */   Date dataSott;
/*     */   String nazioneRilascio;
/*     */   String inviato;
/*     */   
/*     */   public String getAttivita() {
/*  71 */     return this.attivita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttivita(String attivita) {
/*  76 */     this.attivita = attivita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAttPrisma() {
/*  81 */     return this.attPrisma;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttPrisma(String attPrisma) {
/*  86 */     this.attPrisma = attPrisma;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCab() {
/*  91 */     return this.cab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCab(String cab) {
/*  96 */     this.cab = cab;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCap() {
/* 101 */     return this.cap;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCap(String cap) {
/* 106 */     this.cap = cap;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCivico() {
/* 111 */     return this.civico;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCivico(String civico) {
/* 116 */     this.civico = civico;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodPromotore() {
/* 121 */     return this.codPromotore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodPromotore(String codPromotore) {
/* 126 */     this.codPromotore = codPromotore;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodToponimo() {
/* 131 */     return this.codToponimo;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodToponimo(String codToponimo) {
/* 136 */     this.codToponimo = codToponimo;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCognome() {
/* 141 */     return this.cognome;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCognome(String cognome) {
/* 146 */     this.cognome = cognome;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getComune() {
/* 151 */     return this.comune;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setComune(String comune) {
/* 156 */     this.comune = comune;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getComuneNas() {
/* 161 */     return this.comuneNas;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setComuneNas(String comuneNas) {
/* 166 */     this.comuneNas = comuneNas;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataAut() {
/* 171 */     return this.dataAut;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataAut(Date dataAut) {
/* 176 */     this.dataAut = dataAut;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataComp() {
/* 181 */     return this.dataComp;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataComp(Date dataComp) {
/* 186 */     this.dataComp = dataComp;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataConf() {
/* 191 */     return this.dataConf;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataConf(Date dataConf) {
/* 196 */     this.dataConf = dataConf;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataCons() {
/* 201 */     return this.dataCons;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataCons(Date dataCons) {
/* 206 */     this.dataCons = dataCons;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataDeroga() {
/* 211 */     return this.dataDeroga;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataDeroga(Date dataDeroga) {
/* 216 */     this.dataDeroga = dataDeroga;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataNascita() {
/* 221 */     return this.dataNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataNascita(Date dataNascita) {
/* 226 */     this.dataNascita = dataNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataRilascio() {
/* 231 */     return this.dataRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataRilascio(Date dataRilascio) {
/* 236 */     this.dataRilascio = dataRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataSott() {
/* 241 */     return this.dataSott;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataSott(Date dataSott) {
/* 246 */     this.dataSott = dataSott;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDenominazione() {
/* 251 */     return this.denominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 256 */     this.denominazione = denominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDocRischi() {
/* 261 */     return this.docRischi;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDocRischi(String docRischi) {
/* 266 */     this.docRischi = docRischi;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEnteRilascio() {
/* 271 */     return this.enteRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnteRilascio(String enteRilascio) {
/* 276 */     this.enteRilascio = enteRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFabbrica() {
/* 281 */     return this.fabbrica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFabbrica(String fabbrica) {
/* 286 */     this.fabbrica = fabbrica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIndirizzo() {
/* 291 */     return this.indirizzo;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndirizzo(String indirizzo) {
/* 296 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLocalita() {
/* 301 */     return this.localita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLocalita(String localita) {
/* 306 */     this.localita = localita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNazione() {
/* 311 */     return this.nazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNazione(String nazione) {
/* 316 */     this.nazione = nazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNazNas() {
/* 321 */     return this.nazNas;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNazNas(String nazNas) {
/* 326 */     this.nazNas = nazNas;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getndgArco() {
/* 331 */     return this.ndgArco;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setndgArco(Integer ndgArco) {
/* 336 */     this.ndgArco = ndgArco;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNome() {
/* 341 */     return this.nome;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNome(String nome) {
/* 346 */     this.nome = nome;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNumeroDoc() {
/* 351 */     return this.numeroDoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumeroDoc(String numeroDoc) {
/* 356 */     this.numeroDoc = numeroDoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPartitaIva() {
/* 361 */     return this.partitaIva;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPartitaIva(String partitaIva) {
/* 366 */     this.partitaIva = partitaIva;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyCinque() {
/* 371 */     return this.privacyCinque;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyCinque(String privacyCinque) {
/* 376 */     this.privacyCinque = privacyCinque;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyDue() {
/* 381 */     return this.privacyDue;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyDue(String privacyDue) {
/* 386 */     this.privacyDue = privacyDue;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyNove() {
/* 391 */     return this.privacyNove;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyNove(String privacyNove) {
/* 396 */     this.privacyNove = privacyNove;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyOtto() {
/* 401 */     return this.privacyOtto;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyOtto(String privacyOtto) {
/* 406 */     this.privacyOtto = privacyOtto;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyQuattro() {
/* 411 */     return this.privacyQuattro;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyQuattro(String privacyQuattro) {
/* 416 */     this.privacyQuattro = privacyQuattro;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacySei() {
/* 421 */     return this.privacySei;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacySei(String privacySei) {
/* 426 */     this.privacySei = privacySei;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacySette() {
/* 431 */     return this.privacySette;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacySette(String privacySette) {
/* 436 */     this.privacySette = privacySette;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyTre() {
/* 441 */     return this.privacyTre;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyTre(String privacyTre) {
/* 446 */     this.privacyTre = privacyTre;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyUno() {
/* 451 */     return this.privacyUno;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyUno(String privacyUno) {
/* 456 */     this.privacyUno = privacyUno;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacyZero() {
/* 461 */     return this.privacyZero;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacyZero(String privacyZero) {
/* 466 */     this.privacyZero = privacyZero;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProv() {
/* 471 */     return this.prov;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProv(String prov) {
/* 476 */     this.prov = prov;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvNas() {
/* 481 */     return this.provNas;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvNas(String provNas) {
/* 486 */     this.provNas = provNas;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRegAntit() {
/* 491 */     return this.regAntit;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRegAntit(String regAntit) {
/* 496 */     this.regAntit = regAntit;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSesso() {
/* 501 */     return this.sesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSesso(String sesso) {
/* 506 */     this.sesso = sesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSettore() {
/* 511 */     return this.settore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSettore(String settore) {
/* 516 */     this.settore = settore;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getSoggettoId() {
/* 521 */     return this.soggettoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 526 */     this.soggettoId = soggettoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoDoc() {
/* 531 */     return this.tipoDoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoDoc(String tipoDoc) {
/* 536 */     this.tipoDoc = tipoDoc;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public VwSoggettoPg() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getRownum() {
/* 546 */     return this.rownum;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRownum(Integer rownum) {
/* 551 */     this.rownum = rownum;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VwSoggettoPg(String attivita, String prisma, String cab, String cap, String civico, String fiscale, String promotore, String toponimo, String cognome, String comune, String nas, Date aut, Date comp, Date conf, Date cons, Date deroga, Date nascita, Date rilascio, Date sott, String denominazione, String rischi, String rilascio2, String fabbrica, String indirizzo, String localita, String nazione, String rilascio3, String nas2, Integer arco, String fabbr, String nome, String doc, String iva, String cinque, String due, String nove, String otto, String quattro, String sei, String sette, String tre, String uno, String zero, String prov, String nas3, String antit, Integer rownum, String sesso, String settore, Integer id, String doc2, Long vw_id) {
/* 560 */     this.attivita = attivita;
/* 561 */     this.attPrisma = prisma;
/* 562 */     this.cab = cab;
/* 563 */     this.cap = cap;
/* 564 */     this.civico = civico;
/* 565 */     this.codiceFiscale = fiscale;
/* 566 */     this.codPromotore = promotore;
/* 567 */     this.codToponimo = toponimo;
/* 568 */     this.cognome = cognome;
/* 569 */     this.comune = comune;
/* 570 */     this.comuneNas = nas;
/* 571 */     this.dataAut = aut;
/* 572 */     this.dataComp = comp;
/* 573 */     this.dataConf = conf;
/* 574 */     this.dataCons = cons;
/* 575 */     this.dataDeroga = deroga;
/* 576 */     this.dataNascita = nascita;
/* 577 */     this.dataRilascio = rilascio;
/* 578 */     this.dataSott = sott;
/* 579 */     this.denominazione = denominazione;
/* 580 */     this.docRischi = rischi;
/* 581 */     this.enteRilascio = rilascio2;
/* 582 */     this.fabbrica = fabbrica;
/* 583 */     this.indirizzo = indirizzo;
/* 584 */     this.localita = localita;
/* 585 */     this.nazione = nazione;
/* 586 */     this.nazioneRilascio = rilascio3;
/* 587 */     this.nazNas = nas2;
/* 588 */     this.ndgArco = arco;
/* 589 */     this.ndgFabbr = fabbr;
/* 590 */     this.nome = nome;
/* 591 */     this.numeroDoc = doc;
/* 592 */     this.partitaIva = iva;
/* 593 */     this.privacyCinque = cinque;
/* 594 */     this.privacyDue = due;
/* 595 */     this.privacyNove = nove;
/* 596 */     this.privacyOtto = otto;
/* 597 */     this.privacyQuattro = quattro;
/* 598 */     this.privacySei = sei;
/* 599 */     this.privacySette = sette;
/* 600 */     this.privacyTre = tre;
/* 601 */     this.privacyUno = uno;
/* 602 */     this.privacyZero = zero;
/* 603 */     this.prov = prov;
/* 604 */     this.provNas = nas3;
/* 605 */     this.regAntit = antit;
/* 606 */     this.rownum = rownum;
/* 607 */     this.sesso = sesso;
/* 608 */     this.settore = settore;
/* 609 */     this.soggettoId = id;
/* 610 */     this.tipoDoc = doc2;
/* 611 */     this.VW_id = vw_id;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodiceFiscale() {
/* 616 */     return this.codiceFiscale;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 621 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNazioneRilascio() {
/* 626 */     return this.nazioneRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNazioneRilascio(String nazioneRilascio) {
/* 631 */     this.nazioneRilascio = nazioneRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Long getVW_id() {
/* 636 */     return this.VW_id;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setVW_id(Long vw_id) {
/* 641 */     this.VW_id = vw_id;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNdgFabbr() {
/* 646 */     return this.ndgFabbr;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNdgFabbr(String ndgFabbr) {
/* 651 */     this.ndgFabbr = ndgFabbr;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getInviato() {
/* 656 */     return this.inviato;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setInviato(String inviato) {
/* 661 */     this.inviato = inviato;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\VwSoggettoPg.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */