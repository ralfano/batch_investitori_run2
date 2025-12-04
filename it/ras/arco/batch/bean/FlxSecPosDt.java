/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecPosDt
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*  12 */   public static String DT = "DT";
/*  13 */   public static String FABBRICA = "SEC";
/*     */   
/*     */   private Integer flxId;
/*     */   
/*     */   private String cfil;
/*     */   
/*     */   private String cage;
/*     */   private String cspd;
/*     */   private String ctit;
/*     */   private String cprg;
/*     */   private String descrTitolo;
/*     */   private String rapporto;
/*     */   private Double quantita;
/*     */   private Double quotazione;
/*     */   private Integer divisa;
/*     */   private Integer divisaTrattazione;
/*     */   private Double cambio;
/*     */   private Double controvaloreAttuale;
/*     */   private Double controvaloreAttualeInDivisa;
/*     */   private Double prezzoMedioAcquisto;
/*     */   private Date dataDiQuotazioneDellaPosiz;
/*     */   private String codiceIsin;
/*     */   private String mercato;
/*     */   private Date dataScadenza;
/*     */   private String comparto;
/*     */   private Double rateo;
/*     */   private String ndgIntestatario;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/*  47 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  54 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  61 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  68 */     this.descrizioneErrore = descrizioneErrore;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecPosDt() {}
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
/*     */   public FlxSecPosDt(String cage, Double cambio, String cfil, String isin, String comparto, Double attuale, Double divisa, String cprg, String cspd, String ctit, Date caricamento, Date posiz, Date elab, Date scadenza, String errore, String titolo, Integer divisa2, Integer trattazione, String istanza, String mercato, String intestatario, Double acquisto, Double quantita, Double quotazione, String rapporto, Double rateo, String elab2) {
/* 106 */     this.cage = cage;
/* 107 */     this.cambio = cambio;
/* 108 */     this.cfil = cfil;
/* 109 */     this.codiceIsin = isin;
/* 110 */     this.comparto = comparto;
/* 111 */     this.controvaloreAttuale = attuale;
/* 112 */     this.controvaloreAttualeInDivisa = divisa;
/* 113 */     this.cprg = cprg;
/* 114 */     this.cspd = cspd;
/* 115 */     this.ctit = ctit;
/* 116 */     this.dataCaricamento = caricamento;
/* 117 */     this.dataDiQuotazioneDellaPosiz = posiz;
/* 118 */     this.dataElab = elab;
/* 119 */     this.dataScadenza = scadenza;
/* 120 */     this.descrizioneErrore = errore;
/* 121 */     this.descrTitolo = titolo;
/* 122 */     this.divisa = divisa2;
/* 123 */     this.divisaTrattazione = trattazione;
/* 124 */     this.istanza = istanza;
/* 125 */     this.mercato = mercato;
/* 126 */     this.ndgIntestatario = intestatario;
/* 127 */     this.prezzoMedioAcquisto = acquisto;
/* 128 */     this.quantita = quantita;
/* 129 */     this.quotazione = quotazione;
/* 130 */     this.rapporto = rapporto;
/* 131 */     this.rateo = rateo;
/* 132 */     this.statoElab = elab2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getDT() {
/* 139 */     return DT;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setDT(String dt) {
/* 146 */     DT = dt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getFABBRICA() {
/* 153 */     return FABBRICA;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setFABBRICA(String fabbrica) {
/* 160 */     FABBRICA = fabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCage() {
/* 167 */     return this.cage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCage(String cage) {
/* 174 */     this.cage = cage;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCambio() {
/* 181 */     return this.cambio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 188 */     this.cambio = cambio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCfil() {
/* 195 */     return this.cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCfil(String cfil) {
/* 202 */     this.cfil = cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIsin() {
/* 209 */     return this.codiceIsin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 216 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getComparto() {
/* 223 */     return this.comparto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComparto(String comparto) {
/* 230 */     this.comparto = comparto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getControvaloreAttuale() {
/* 237 */     return this.controvaloreAttuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControvaloreAttuale(Double controvaloreAttuale) {
/* 244 */     this.controvaloreAttuale = controvaloreAttuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getControvaloreAttualeInDivisa() {
/* 251 */     return this.controvaloreAttualeInDivisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControvaloreAttualeInDivisa(Double controvaloreAttualeInDivisa) {
/* 258 */     this.controvaloreAttualeInDivisa = controvaloreAttualeInDivisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCprg() {
/* 265 */     return this.cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCprg(String cprg) {
/* 272 */     this.cprg = cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCspd() {
/* 279 */     return this.cspd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCspd(String cspd) {
/* 286 */     this.cspd = cspd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCtit() {
/* 293 */     return this.ctit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCtit(String ctit) {
/* 300 */     this.ctit = ctit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 307 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 314 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataDiQuotazioneDellaPosiz() {
/* 321 */     return this.dataDiQuotazioneDellaPosiz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataDiQuotazioneDellaPosiz(Date dataDiQuotazioneDellaPosiz) {
/* 328 */     this.dataDiQuotazioneDellaPosiz = dataDiQuotazioneDellaPosiz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataScadenza() {
/* 335 */     return this.dataScadenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataScadenza(Date dataScadenza) {
/* 342 */     this.dataScadenza = dataScadenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrTitolo() {
/* 349 */     return this.descrTitolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrTitolo(String descrTitolo) {
/* 356 */     this.descrTitolo = descrTitolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getDivisa() {
/* 363 */     return this.divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDivisa(Integer divisa) {
/* 370 */     this.divisa = divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getDivisaTrattazione() {
/* 377 */     return this.divisaTrattazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDivisaTrattazione(Integer divisaTrattazione) {
/* 384 */     this.divisaTrattazione = divisaTrattazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 391 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 398 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 405 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 412 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMercato() {
/* 419 */     return this.mercato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMercato(String mercato) {
/* 426 */     this.mercato = mercato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNdgIntestatario() {
/* 433 */     return this.ndgIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdgIntestatario(String ndgIntestatario) {
/* 440 */     this.ndgIntestatario = ndgIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoMedioAcquisto() {
/* 447 */     return this.prezzoMedioAcquisto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoMedioAcquisto(Double prezzoMedioAcquisto) {
/* 454 */     this.prezzoMedioAcquisto = prezzoMedioAcquisto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuantita() {
/* 461 */     return this.quantita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuantita(Double quantita) {
/* 468 */     this.quantita = quantita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuotazione() {
/* 475 */     return this.quotazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuotazione(Double quotazione) {
/* 482 */     this.quotazione = quotazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRapporto() {
/* 489 */     return this.rapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRapporto(String rapporto) {
/* 496 */     this.rapporto = rapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getRateo() {
/* 503 */     return this.rateo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRateo(Double rateo) {
/* 510 */     this.rateo = rateo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 517 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 524 */     this.statoElab = statoElab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecPosDt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */