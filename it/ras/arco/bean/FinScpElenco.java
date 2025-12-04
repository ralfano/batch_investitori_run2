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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinScpElenco
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer squadraId;
/*     */   private Integer scpNumberPdf;
/*     */   private Integer elencoId;
/*     */   private Integer scpNumber;
/*     */   private Integer ndgArco;
/*     */   private String codiceIdentificativo;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String denominazione;
/*     */   private String intestatarioScp;
/*     */   private String sesso;
/*     */   private String codiceFiscale;
/*     */   private String partitaIva;
/*     */   private String indirizzoS;
/*     */   private String capS;
/*     */   private String comuneS;
/*     */   private String provT;
/*     */   private String cointestatari;
/*     */   private String cfCointestatari;
/*     */   private String codPromotore;
/*     */   private String desPromotore;
/*     */   private String codRete;
/*     */   private String codAgenzia;
/*     */   private String indirizzoAgenzia;
/*     */   private String capAgenzia;
/*     */   private String cittaAgenzia;
/*     */   private String provAgenzia;
/*     */   private String telPrefissoAgenzia;
/*     */   private String telNumero1Agenzia;
/*     */   private String telNumero2Agenzia;
/*     */   private String telNumero3Agenzia;
/*     */   private String flagSemaforo;
/*     */   private String flagAllegato;
/*     */   private String flagRaccomandata;
/*     */   private String flagPolizzaSingola;
/*     */   private String flagProdottoVisibile;
/*     */   private String statoElaborazione;
/*     */   private Date dataEstrazione;
/*     */   private Integer totaleA;
/*     */   private Integer totaleB;
/*     */   private Integer totaleC;
/*     */   private Integer totaleD;
/*     */   private Integer totaleE;
/*     */   private Integer totaleBobb;
/*     */   private Integer totaleBazn;
/*     */   private Integer totaleBstrCert;
/*     */   private Integer totaleBaltriStr;
/*     */   private Integer totaleBpct;
/*     */   private Integer totaleCfnf;
/*     */   private Integer totaleCfn;
/*     */   private Integer totaleCsicav;
/*     */   private Integer totaleCgp;
/*     */   private Integer totaleEft;
/*     */   private Integer totaleEfu;
/*     */   private Integer totaleEfx;
/*     */   private Integer totaleEfip;
/*     */   private Integer totaleEfp;
/*     */   private Integer totaleRiepilogo;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataUltimaModificaSlave;
/*     */   private String tipoUltimaModificaSlave;
/*     */   private Set flussi;
/*     */   
/*     */   public String getCapAgenzia() {
/* 160 */     return this.capAgenzia;
/*     */   }
/*     */   
/*     */   public void setCapAgenzia(String capAgenzia) {
/* 164 */     this.capAgenzia = capAgenzia;
/*     */   }
/*     */   
/*     */   public String getCapS() {
/* 168 */     return this.capS;
/*     */   }
/*     */   
/*     */   public void setCapS(String capS) {
/* 172 */     this.capS = capS;
/*     */   }
/*     */   
/*     */   public String getCfCointestatari() {
/* 176 */     return this.cfCointestatari;
/*     */   }
/*     */   
/*     */   public void setCfCointestatari(String cfCointestatari) {
/* 180 */     this.cfCointestatari = cfCointestatari;
/*     */   }
/*     */   
/*     */   public String getCittaAgenzia() {
/* 184 */     return this.cittaAgenzia;
/*     */   }
/*     */   
/*     */   public void setCittaAgenzia(String cittaAgenzia) {
/* 188 */     this.cittaAgenzia = cittaAgenzia;
/*     */   }
/*     */   
/*     */   public String getCodAgenzia() {
/* 192 */     return this.codAgenzia;
/*     */   }
/*     */   
/*     */   public void setCodAgenzia(String codAgenzia) {
/* 196 */     this.codAgenzia = codAgenzia;
/*     */   }
/*     */   
/*     */   public String getCodiceFiscale() {
/* 200 */     return this.codiceFiscale;
/*     */   }
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 204 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   
/*     */   public String getCodiceIdentificativo() {
/* 208 */     return this.codiceIdentificativo;
/*     */   }
/*     */   
/*     */   public void setCodiceIdentificativo(String codiceIdentificativo) {
/* 212 */     this.codiceIdentificativo = codiceIdentificativo;
/*     */   }
/*     */   
/*     */   public String getCodPromotore() {
/* 216 */     return this.codPromotore;
/*     */   }
/*     */   
/*     */   public void setCodPromotore(String codPromotore) {
/* 220 */     this.codPromotore = codPromotore;
/*     */   }
/*     */   
/*     */   public String getCodRete() {
/* 224 */     return this.codRete;
/*     */   }
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 228 */     this.codRete = codRete;
/*     */   }
/*     */   
/*     */   public String getCognome() {
/* 232 */     return this.cognome;
/*     */   }
/*     */   
/*     */   public void setCognome(String cognome) {
/* 236 */     this.cognome = cognome;
/*     */   }
/*     */   
/*     */   public String getCointestatari() {
/* 240 */     return this.cointestatari;
/*     */   }
/*     */   
/*     */   public void setCointestatari(String cointestatari) {
/* 244 */     this.cointestatari = cointestatari;
/*     */   }
/*     */   
/*     */   public String getComuneS() {
/* 248 */     return this.comuneS;
/*     */   }
/*     */   
/*     */   public void setComuneS(String comuneS) {
/* 252 */     this.comuneS = comuneS;
/*     */   }
/*     */   
/*     */   public Date getDataEstrazione() {
/* 256 */     return this.dataEstrazione;
/*     */   }
/*     */   
/*     */   public void setDataEstrazione(Date dataEstrazione) {
/* 260 */     this.dataEstrazione = dataEstrazione;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 264 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 268 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 272 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 276 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModificaSlave() {
/* 280 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/* 284 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getDenominazione() {
/* 288 */     return this.denominazione;
/*     */   }
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 292 */     this.denominazione = denominazione;
/*     */   }
/*     */   
/*     */   public String getDesPromotore() {
/* 296 */     return this.desPromotore;
/*     */   }
/*     */   
/*     */   public void setDesPromotore(String desPromotore) {
/* 300 */     this.desPromotore = desPromotore;
/*     */   }
/*     */   
/*     */   public String getFlagAllegato() {
/* 304 */     return this.flagAllegato;
/*     */   }
/*     */   
/*     */   public void setFlagAllegato(String flagAllegato) {
/* 308 */     this.flagAllegato = flagAllegato;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 312 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 316 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getFlagPolizzaSingola() {
/* 320 */     return this.flagPolizzaSingola;
/*     */   }
/*     */   
/*     */   public void setFlagPolizzaSingola(String flagPolizzaSingola) {
/* 324 */     this.flagPolizzaSingola = flagPolizzaSingola;
/*     */   }
/*     */   
/*     */   public String getFlagProdottoVisibile() {
/* 328 */     return this.flagProdottoVisibile;
/*     */   }
/*     */   
/*     */   public void setFlagProdottoVisibile(String flagProdottoVisibile) {
/* 332 */     this.flagProdottoVisibile = flagProdottoVisibile;
/*     */   }
/*     */   
/*     */   public String getFlagRaccomandata() {
/* 336 */     return this.flagRaccomandata;
/*     */   }
/*     */   
/*     */   public void setFlagRaccomandata(String flagRaccomandata) {
/* 340 */     this.flagRaccomandata = flagRaccomandata;
/*     */   }
/*     */   
/*     */   public String getFlagSemaforo() {
/* 344 */     return this.flagSemaforo;
/*     */   }
/*     */   
/*     */   public void setFlagSemaforo(String flagSemaforo) {
/* 348 */     this.flagSemaforo = flagSemaforo;
/*     */   }
/*     */   
/*     */   public String getIndirizzoAgenzia() {
/* 352 */     return this.indirizzoAgenzia;
/*     */   }
/*     */   
/*     */   public void setIndirizzoAgenzia(String indirizzoAgenzia) {
/* 356 */     this.indirizzoAgenzia = indirizzoAgenzia;
/*     */   }
/*     */   
/*     */   public String getIndirizzoS() {
/* 360 */     return this.indirizzoS;
/*     */   }
/*     */   
/*     */   public void setIndirizzoS(String indirizzoS) {
/* 364 */     this.indirizzoS = indirizzoS;
/*     */   }
/*     */   
/*     */   public String getIntestatarioScp() {
/* 368 */     return this.intestatarioScp;
/*     */   }
/*     */   
/*     */   public void setIntestatarioScp(String intestatarioScp) {
/* 372 */     this.intestatarioScp = intestatarioScp;
/*     */   }
/*     */   
/*     */   public Integer getNdgArco() {
/* 376 */     return this.ndgArco;
/*     */   }
/*     */   
/*     */   public void setNdgArco(Integer ndgArco) {
/* 380 */     this.ndgArco = ndgArco;
/*     */   }
/*     */   
/*     */   public String getNome() {
/* 384 */     return this.nome;
/*     */   }
/*     */   
/*     */   public void setNome(String nome) {
/* 388 */     this.nome = nome;
/*     */   }
/*     */   
/*     */   public String getPartitaIva() {
/* 392 */     return this.partitaIva;
/*     */   }
/*     */   
/*     */   public void setPartitaIva(String partitaIva) {
/* 396 */     this.partitaIva = partitaIva;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 400 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 404 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/* 408 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 413 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getProvAgenzia() {
/* 417 */     return this.provAgenzia;
/*     */   }
/*     */   
/*     */   public void setProvAgenzia(String provAgenzia) {
/* 421 */     this.provAgenzia = provAgenzia;
/*     */   }
/*     */   
/*     */   public String getProvT() {
/* 425 */     return this.provT;
/*     */   }
/*     */   
/*     */   public void setProvT(String provT) {
/* 429 */     this.provT = provT;
/*     */   }
/*     */   
/*     */   public Integer getScpNumber() {
/* 433 */     return this.scpNumber;
/*     */   }
/*     */   
/*     */   public void setScpNumber(Integer scpNumber) {
/* 437 */     this.scpNumber = scpNumber;
/*     */   }
/*     */   
/*     */   public String getSesso() {
/* 441 */     return this.sesso;
/*     */   }
/*     */   
/*     */   public void setSesso(String sesso) {
/* 445 */     this.sesso = sesso;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 449 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 453 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getTelNumero1Agenzia() {
/* 457 */     return this.telNumero1Agenzia;
/*     */   }
/*     */   
/*     */   public void setTelNumero1Agenzia(String telNumero1Agenzia) {
/* 461 */     this.telNumero1Agenzia = telNumero1Agenzia;
/*     */   }
/*     */   
/*     */   public String getTelNumero2Agenzia() {
/* 465 */     return this.telNumero2Agenzia;
/*     */   }
/*     */   
/*     */   public void setTelNumero2Agenzia(String telNumero2Agenzia) {
/* 469 */     this.telNumero2Agenzia = telNumero2Agenzia;
/*     */   }
/*     */   
/*     */   public String getTelNumero3Agenzia() {
/* 473 */     return this.telNumero3Agenzia;
/*     */   }
/*     */   
/*     */   public void setTelNumero3Agenzia(String telNumero3Agenzia) {
/* 477 */     this.telNumero3Agenzia = telNumero3Agenzia;
/*     */   }
/*     */   
/*     */   public String getTelPrefissoAgenzia() {
/* 481 */     return this.telPrefissoAgenzia;
/*     */   }
/*     */   
/*     */   public void setTelPrefissoAgenzia(String telPrefissoAgenzia) {
/* 485 */     this.telPrefissoAgenzia = telPrefissoAgenzia;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 489 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 493 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModificaSlave() {
/* 497 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 501 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public Integer getTotaleA() {
/* 505 */     return this.totaleA;
/*     */   }
/*     */   
/*     */   public void setTotaleA(Integer totaleA) {
/* 509 */     this.totaleA = totaleA;
/*     */   }
/*     */   
/*     */   public Integer getTotaleB() {
/* 513 */     return this.totaleB;
/*     */   }
/*     */   
/*     */   public void setTotaleB(Integer totaleB) {
/* 517 */     this.totaleB = totaleB;
/*     */   }
/*     */   
/*     */   public Integer getTotaleBaltriStr() {
/* 521 */     return this.totaleBaltriStr;
/*     */   }
/*     */   
/*     */   public void setTotaleBaltriStr(Integer totaleBaltriStr) {
/* 525 */     this.totaleBaltriStr = totaleBaltriStr;
/*     */   }
/*     */   
/*     */   public Integer getTotaleBazn() {
/* 529 */     return this.totaleBazn;
/*     */   }
/*     */   
/*     */   public void setTotaleBazn(Integer totaleBazn) {
/* 533 */     this.totaleBazn = totaleBazn;
/*     */   }
/*     */   
/*     */   public Integer getTotaleBobb() {
/* 537 */     return this.totaleBobb;
/*     */   }
/*     */   
/*     */   public void setTotaleBobb(Integer totaleBobb) {
/* 541 */     this.totaleBobb = totaleBobb;
/*     */   }
/*     */   
/*     */   public Integer getTotaleBpct() {
/* 545 */     return this.totaleBpct;
/*     */   }
/*     */   
/*     */   public void setTotaleBpct(Integer totaleBpct) {
/* 549 */     this.totaleBpct = totaleBpct;
/*     */   }
/*     */   
/*     */   public Integer getTotaleBstrCert() {
/* 553 */     return this.totaleBstrCert;
/*     */   }
/*     */   
/*     */   public void setTotaleBstrCert(Integer totaleBstrCert) {
/* 557 */     this.totaleBstrCert = totaleBstrCert;
/*     */   }
/*     */   
/*     */   public Integer getTotaleC() {
/* 561 */     return this.totaleC;
/*     */   }
/*     */   
/*     */   public void setTotaleC(Integer totaleC) {
/* 565 */     this.totaleC = totaleC;
/*     */   }
/*     */   
/*     */   public Integer getTotaleCfn() {
/* 569 */     return this.totaleCfn;
/*     */   }
/*     */   
/*     */   public void setTotaleCfn(Integer totaleCfn) {
/* 573 */     this.totaleCfn = totaleCfn;
/*     */   }
/*     */   
/*     */   public Integer getTotaleCfnf() {
/* 577 */     return this.totaleCfnf;
/*     */   }
/*     */   
/*     */   public void setTotaleCfnf(Integer totaleCfnf) {
/* 581 */     this.totaleCfnf = totaleCfnf;
/*     */   }
/*     */   
/*     */   public Integer getTotaleCgp() {
/* 585 */     return this.totaleCgp;
/*     */   }
/*     */   
/*     */   public void setTotaleCgp(Integer totaleCgp) {
/* 589 */     this.totaleCgp = totaleCgp;
/*     */   }
/*     */   
/*     */   public Integer getTotaleCsicav() {
/* 593 */     return this.totaleCsicav;
/*     */   }
/*     */   
/*     */   public void setTotaleCsicav(Integer totaleCsicav) {
/* 597 */     this.totaleCsicav = totaleCsicav;
/*     */   }
/*     */   
/*     */   public Integer getTotaleD() {
/* 601 */     return this.totaleD;
/*     */   }
/*     */   
/*     */   public void setTotaleD(Integer totaleD) {
/* 605 */     this.totaleD = totaleD;
/*     */   }
/*     */   
/*     */   public Integer getTotaleE() {
/* 609 */     return this.totaleE;
/*     */   }
/*     */   
/*     */   public void setTotaleE(Integer totaleE) {
/* 613 */     this.totaleE = totaleE;
/*     */   }
/*     */   
/*     */   public Integer getTotaleEfip() {
/* 617 */     return this.totaleEfip;
/*     */   }
/*     */   
/*     */   public void setTotaleEfip(Integer totaleEfip) {
/* 621 */     this.totaleEfip = totaleEfip;
/*     */   }
/*     */   
/*     */   public Integer getTotaleEfp() {
/* 625 */     return this.totaleEfp;
/*     */   }
/*     */   
/*     */   public void setTotaleEfp(Integer totaleEfp) {
/* 629 */     this.totaleEfp = totaleEfp;
/*     */   }
/*     */   
/*     */   public Integer getTotaleEft() {
/* 633 */     return this.totaleEft;
/*     */   }
/*     */   
/*     */   public void setTotaleEft(Integer totaleEft) {
/* 637 */     this.totaleEft = totaleEft;
/*     */   }
/*     */   
/*     */   public Integer getTotaleEfu() {
/* 641 */     return this.totaleEfu;
/*     */   }
/*     */   
/*     */   public void setTotaleEfu(Integer totaleEfu) {
/* 645 */     this.totaleEfu = totaleEfu;
/*     */   }
/*     */   
/*     */   public Integer getTotaleEfx() {
/* 649 */     return this.totaleEfx;
/*     */   }
/*     */   
/*     */   public void setTotaleEfx(Integer totaleEfx) {
/* 653 */     this.totaleEfx = totaleEfx;
/*     */   }
/*     */   
/*     */   public Integer getTotaleRiepilogo() {
/* 657 */     return this.totaleRiepilogo;
/*     */   }
/*     */   
/*     */   public void setTotaleRiepilogo(Integer totaleRiepilogo) {
/* 661 */     this.totaleRiepilogo = totaleRiepilogo;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 665 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 669 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 673 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 677 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 681 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 685 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public Integer getElencoId() {
/* 689 */     return this.elencoId;
/*     */   }
/*     */   
/*     */   public void setElencoId(Integer elencoId) {
/* 693 */     this.elencoId = elencoId;
/*     */   }
/*     */   
/*     */   public Set getFlussi() {
/* 697 */     return this.flussi;
/*     */   }
/*     */   
/*     */   public void setFlussi(Set flussi) {
/* 701 */     this.flussi = flussi;
/*     */   }
/*     */   
/*     */   public Integer getScpNumberPdf() {
/* 705 */     return this.scpNumberPdf;
/*     */   }
/*     */   
/*     */   public void setScpNumberPdf(Integer scpNumberPdf) {
/* 709 */     this.scpNumberPdf = scpNumberPdf;
/*     */   }
/*     */   
/*     */   public Integer getSquadraId() {
/* 713 */     return this.squadraId;
/*     */   }
/*     */   
/*     */   public void setSquadraId(Integer squadraId) {
/* 717 */     this.squadraId = squadraId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinScpElenco.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */