/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class ReportDistinte
/*     */   extends RasORMBean
/*     */ {
/*     */   private String tipoReport;
/*     */   private String tipoOperazione;
/*     */   private String nomeUtente;
/*  26 */   private String numeroDistinta = "";
/*     */   
/*     */   private Date dataVersamento;
/*     */   
/*     */   private Date dataCaricamento;
/*     */   
/*     */   private Date dataStampa;
/*     */   
/*     */   private List listaEmittenti;
/*     */   
/*     */   private List listaMacroprodotti;
/*     */   
/*  38 */   private Integer sgrID = new Integer(-1);
/*     */   
/*  40 */   private Integer macroProdottoID = new Integer(-1);
/*     */   
/*  42 */   private String mostraSoggetti = "-1";
/*     */   
/*  44 */   private String mostraMezziPg = "-1";
/*     */   
/*  46 */   private String userFilter = "ALL";
/*     */   
/*  48 */   private String tipoProdotto = "-1";
/*     */   
/*     */   private FinEmittenteAdapterBase emittenteSelezionato;
/*     */   
/*     */   private Date dataInizioRegolamento;
/*     */   
/*     */   private Date dataFineRegolamento;
/*     */   
/*     */   private Date dataInizioSottoscrizione;
/*     */   
/*     */   private Date dataFineSottoscrizione;
/*     */   
/*     */   private List listaAttivitaFinanziarie;
/*     */   
/*  62 */   private Integer attivitaFinanziariaID = new Integer(-1);
/*     */   
/*  64 */   private String statoContratto = "-1";
/*     */   
/*  66 */   private String filiale = "";
/*     */   
/*  68 */   private String cab = "";
/*     */   
/*  70 */   private Integer numeroGG = new Integer(0);
/*     */ 
/*     */   
/*     */   private Date dataInizio;
/*     */ 
/*     */   
/*     */   private Date dataFine;
/*     */   
/*     */   private Date dataRegolamentoDa_Obb;
/*     */   
/*     */   private Date dataRegolamentoA_Obb;
/*     */   
/*     */   private Date dataInvioAntDa_Obb;
/*     */   
/*     */   private Date dataInvioAntA_Obb;
/*     */   
/*     */   private Date dataRegolamentoDa_Opt;
/*     */   
/*     */   private Date dataRegolamentoA_Opt;
/*     */   
/*     */   private Date dataInvioAntDa_Opt;
/*     */   
/*     */   private Date dataInvioAntA_Opt;
/*     */ 
/*     */   
/*     */   public Date getDataFineRegolamento() {
/*  96 */     return this.dataFineRegolamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataFineRegolamento(Date dataFineRegolamento) {
/* 101 */     this.dataFineRegolamento = dataFineRegolamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFineSottoscrizione() {
/* 106 */     return this.dataFineSottoscrizione;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataFineSottoscrizione(Date dataFineSottoscrizione) {
/* 111 */     this.dataFineSottoscrizione = dataFineSottoscrizione;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInizioRegolamento() {
/* 116 */     return this.dataInizioRegolamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInizioRegolamento(Date dataInizioRegolamento) {
/* 121 */     this.dataInizioRegolamento = dataInizioRegolamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInizioSottoscrizione() {
/* 126 */     return this.dataInizioSottoscrizione;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInizioSottoscrizione(Date dataInizioSottoscrizione) {
/* 131 */     this.dataInizioSottoscrizione = dataInizioSottoscrizione;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoContratto() {
/* 136 */     return this.statoContratto;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoContratto(String statoContratto) {
/* 141 */     this.statoContratto = statoContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEmittenteAdapterBase getEmittenteSelezionato() {
/* 152 */     return this.emittenteSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittenteSelezionato(FinEmittenteAdapterBase emittenteSelezionato) {
/* 160 */     this.emittenteSelezionato = emittenteSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroDistinta() {
/* 167 */     return this.numeroDistinta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroDistinta(String numeroDistinta) {
/* 175 */     this.numeroDistinta = numeroDistinta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getMacroProdottoID() {
/* 182 */     return this.macroProdottoID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMacroProdottoID(Integer macroProdottoID) {
/* 190 */     this.macroProdottoID = macroProdottoID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSgrID() {
/* 197 */     return this.sgrID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSgrID(Integer sgrID) {
/* 205 */     this.sgrID = sgrID;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoReport() {
/* 212 */     return this.tipoReport;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoReport(String tipoReport) {
/* 220 */     this.tipoReport = tipoReport;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNomeUtente() {
/* 227 */     return this.nomeUtente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNomeUtente(String nomeUtente) {
/* 235 */     this.nomeUtente = nomeUtente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getListaEmittenti() {
/* 242 */     return this.listaEmittenti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListaEmittenti(List listaEmittenti) {
/* 250 */     this.listaEmittenti = listaEmittenti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataVersamento() {
/* 257 */     return this.dataVersamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataVersamento(Date dataVersamento) {
/* 265 */     this.dataVersamento = dataVersamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getListaMacroprodotti() {
/* 272 */     return this.listaMacroprodotti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListaMacroprodotti(List listaMacroprodotti) {
/* 280 */     this.listaMacroprodotti = listaMacroprodotti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMostraMezziPg() {
/* 288 */     return this.mostraMezziPg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMostraMezziPg(String mostraMezziPg) {
/* 294 */     this.mostraMezziPg = mostraMezziPg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMostraSoggetti() {
/* 300 */     return this.mostraSoggetti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMostraSoggetti(String mostraSoggetti) {
/* 306 */     this.mostraSoggetti = mostraSoggetti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 314 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 320 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 328 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 334 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataStampa() {
/* 341 */     return this.dataStampa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataStampa(Date dataStampa) {
/* 348 */     this.dataStampa = dataStampa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserFilter() {
/* 356 */     return this.userFilter;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserFilter(String userFilter) {
/* 363 */     this.userFilter = userFilter;
/*     */   }
/*     */   
/*     */   public String getDescrizioneProdottoSelezionato() {
/* 367 */     FinProdotto prodotto = null;
/* 368 */     String descrizione = "";
/* 369 */     Iterator itMacroProd = getListaMacroprodotti().iterator();
/* 370 */     while (itMacroProd.hasNext()) {
/* 371 */       prodotto = itMacroProd.next();
/* 372 */       if (prodotto.getProdottoID().intValue() == getMacroProdottoID().intValue()) {
/* 373 */         descrizione = prodotto.getDescrizioneS();
/*     */         break;
/*     */       } 
/*     */     } 
/* 377 */     return descrizione;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoProdotto() {
/* 382 */     return this.tipoProdotto;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 387 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */   
/*     */   public List getListaAttivitaFinanziarie() {
/* 392 */     return this.listaAttivitaFinanziarie;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setListaAttivitaFinanziarie(List listaAttivitaFinanziarie) {
/* 397 */     this.listaAttivitaFinanziarie = listaAttivitaFinanziarie;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getAttivitaFinanziariaID() {
/* 402 */     return this.attivitaFinanziariaID;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziariaID(Integer attivitaFinanziariaId) {
/* 407 */     this.attivitaFinanziariaID = attivitaFinanziariaId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFiliale() {
/* 412 */     return this.filiale;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFiliale(String filiale) {
/* 417 */     this.filiale = filiale;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumeroGG() {
/* 422 */     return this.numeroGG;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumeroGG(Integer numeroGG) {
/* 427 */     this.numeroGG = numeroGG;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/* 432 */     return this.dataFine;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 437 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/* 442 */     return this.dataInizio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 447 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataInvioAntA_Obb() {
/* 451 */     return this.dataInvioAntA_Obb;
/*     */   }
/*     */   
/*     */   public void setDataInvioAntA_Obb(Date dataInvioAntA_Obb) {
/* 455 */     this.dataInvioAntA_Obb = dataInvioAntA_Obb;
/*     */   }
/*     */   
/*     */   public Date getDataInvioAntA_Opt() {
/* 459 */     return this.dataInvioAntA_Opt;
/*     */   }
/*     */   
/*     */   public void setDataInvioAntA_Opt(Date dataInvioAntA_Opt) {
/* 463 */     this.dataInvioAntA_Opt = dataInvioAntA_Opt;
/*     */   }
/*     */   
/*     */   public Date getDataInvioAntDa_Obb() {
/* 467 */     return this.dataInvioAntDa_Obb;
/*     */   }
/*     */   
/*     */   public void setDataInvioAntDa_Obb(Date dataInvioAntDa_Obb) {
/* 471 */     this.dataInvioAntDa_Obb = dataInvioAntDa_Obb;
/*     */   }
/*     */   
/*     */   public Date getDataInvioAntDa_Opt() {
/* 475 */     return this.dataInvioAntDa_Opt;
/*     */   }
/*     */   
/*     */   public void setDataInvioAntDa_Opt(Date dataInvioAntDa_Opt) {
/* 479 */     this.dataInvioAntDa_Opt = dataInvioAntDa_Opt;
/*     */   }
/*     */   
/*     */   public Date getDataRegolamentoA_Obb() {
/* 483 */     return this.dataRegolamentoA_Obb;
/*     */   }
/*     */   
/*     */   public void setDataRegolamentoA_Obb(Date dataRegolamentoA_Obb) {
/* 487 */     this.dataRegolamentoA_Obb = dataRegolamentoA_Obb;
/*     */   }
/*     */   
/*     */   public Date getDataRegolamentoA_Opt() {
/* 491 */     return this.dataRegolamentoA_Opt;
/*     */   }
/*     */   
/*     */   public void setDataRegolamentoA_Opt(Date dataRegolamentoA_Opt) {
/* 495 */     this.dataRegolamentoA_Opt = dataRegolamentoA_Opt;
/*     */   }
/*     */   
/*     */   public Date getDataRegolamentoDa_Obb() {
/* 499 */     return this.dataRegolamentoDa_Obb;
/*     */   }
/*     */   
/*     */   public void setDataRegolamentoDa_Obb(Date dataRegolamentoDa_Obb) {
/* 503 */     this.dataRegolamentoDa_Obb = dataRegolamentoDa_Obb;
/*     */   }
/*     */   
/*     */   public Date getDataRegolamentoDa_Opt() {
/* 507 */     return this.dataRegolamentoDa_Opt;
/*     */   }
/*     */   
/*     */   public void setDataRegolamentoDa_Opt(Date dataRegolamentoDa_Opt) {
/* 511 */     this.dataRegolamentoDa_Opt = dataRegolamentoDa_Opt;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCab() {
/* 516 */     return this.cab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCab(String cab) {
/* 521 */     this.cab = cab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\ReportDistinte.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */