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
/*     */ public class FlxSecMovimentiDt
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codFilSec;
/*     */   private String codCatSec;
/*     */   private String numPratSec;
/*     */   private String cfil;
/*     */   private String cage;
/*     */   private String cprg;
/*     */   private String csdp;
/*     */   private String ctit;
/*     */   private String descrTitolo;
/*     */   private Date dataEseguito;
/*     */   private Date dataRegolamento;
/*     */   private Date dataStorno;
/*     */   private Date dataValuta;
/*     */   private String causaleMovimento;
/*     */   private Double numQuoteEseguito;
/*     */   private Double prezzoEseguito;
/*     */   private Double controvalore;
/*     */   private Integer progressivo;
/*     */   private String codiceIsin;
/*     */   private String mercato;
/*     */   private String codDivisa;
/*     */   private Double cambioEseguito;
/*     */   private String numOperRif;
/*     */   private String numOperStornata;
/*     */   private Double impCommiss;
/*     */   private Double importoSpese;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String rapporto;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   private String statoObb;
/*     */   private String comparto;
/*     */   private String divisaEmissione;
/*     */   private String flagObbBanca;
/*     */   
/*     */   public String getFlagObbBanca() {
/*  54 */     return this.flagObbBanca;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagObbBanca(String flagObbBanca) {
/*  60 */     this.flagObbBanca = flagObbBanca;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoObb() {
/*  66 */     return this.statoObb;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoObb(String statoObb) {
/*  72 */     this.statoObb = statoObb;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCage() {
/*  78 */     return this.cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCage(String cage) {
/*  84 */     this.cage = cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCambioEseguito() {
/*  90 */     return this.cambioEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCambioEseguito(Double cambioEseguito) {
/*  96 */     this.cambioEseguito = cambioEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCausaleMovimento() {
/* 102 */     return this.causaleMovimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCausaleMovimento(String causaleMovimento) {
/* 108 */     this.causaleMovimento = causaleMovimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCfil() {
/* 114 */     return this.cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCfil(String cfil) {
/* 120 */     this.cfil = cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodCatSec() {
/* 126 */     return this.codCatSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodCatSec(String codCatSec) {
/* 132 */     this.codCatSec = codCatSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodDivisa() {
/* 138 */     return this.codDivisa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodDivisa(String codDivisa) {
/* 144 */     this.codDivisa = codDivisa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodFilSec() {
/* 150 */     return this.codFilSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodFilSec(String codFilSec) {
/* 156 */     this.codFilSec = codFilSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIsin() {
/* 162 */     return this.codiceIsin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 168 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getControvalore() {
/* 174 */     return this.controvalore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControvalore(Double controvalore) {
/* 180 */     this.controvalore = controvalore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCprg() {
/* 186 */     return this.cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCprg(String cprg) {
/* 192 */     this.cprg = cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCsdp() {
/* 198 */     return this.csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCsdp(String csdp) {
/* 204 */     this.csdp = csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCtit() {
/* 210 */     return this.ctit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCtit(String ctit) {
/* 216 */     this.ctit = ctit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 222 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 228 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/* 234 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 240 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataEseguito() {
/* 246 */     return this.dataEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataEseguito(Date dataEseguito) {
/* 252 */     this.dataEseguito = dataEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRegolamento() {
/* 258 */     return this.dataRegolamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataRegolamento(Date dataRegolamento) {
/* 264 */     this.dataRegolamento = dataRegolamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataStorno() {
/* 270 */     return this.dataStorno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataStorno(Date dataStorno) {
/* 276 */     this.dataStorno = dataStorno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValuta() {
/* 282 */     return this.dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 288 */     this.dataValuta = dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 294 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 300 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrTitolo() {
/* 306 */     return this.descrTitolo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrTitolo(String descrTitolo) {
/* 312 */     this.descrTitolo = descrTitolo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 318 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 324 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpCommiss() {
/* 330 */     return this.impCommiss;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImpCommiss(Double impCommiss) {
/* 336 */     this.impCommiss = impCommiss;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoSpese() {
/* 342 */     return this.importoSpese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoSpese(Double importoSpese) {
/* 348 */     this.importoSpese = importoSpese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 354 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 360 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMercato() {
/* 366 */     return this.mercato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMercato(String mercato) {
/* 372 */     this.mercato = mercato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumOperRif() {
/* 378 */     return this.numOperRif;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumOperRif(String numOperRif) {
/* 384 */     this.numOperRif = numOperRif;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumOperStornata() {
/* 390 */     return this.numOperStornata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumOperStornata(String numOperStornata) {
/* 396 */     this.numOperStornata = numOperStornata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumPratSec() {
/* 402 */     return this.numPratSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumPratSec(String numPratSec) {
/* 408 */     this.numPratSec = numPratSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getNumQuoteEseguito() {
/* 414 */     return this.numQuoteEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumQuoteEseguito(Double numQuoteEseguito) {
/* 420 */     this.numQuoteEseguito = numQuoteEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoEseguito() {
/* 426 */     return this.prezzoEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoEseguito(Double prezzoEseguito) {
/* 432 */     this.prezzoEseguito = prezzoEseguito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgressivo() {
/* 438 */     return this.progressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProgressivo(Integer progressivo) {
/* 444 */     this.progressivo = progressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRapporto() {
/* 450 */     return this.rapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRapporto(String rapporto) {
/* 456 */     this.rapporto = rapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 462 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 468 */     this.statoElab = statoElab;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecMovimentiDt() {}
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
/*     */   public FlxSecMovimentiDt(String cage, Double eseguito, String movimento, String cfil, String sec, String divisa, String sec2, String isin, Double controvalore, String cprg, String csdp, String ctit, Date caricamento, Date elab, Date eseguito2, Date regolamento, Date storno, Date valuta, String errore, String titolo, Double commiss, Double spese, String istanza, String mercato, String rif, String stornata, String sec3, Double eseguito3, Double eseguito4, Integer progressivo, String rapporto, String elab2) {
/* 512 */     this.cage = cage;
/* 513 */     this.cambioEseguito = eseguito;
/* 514 */     this.causaleMovimento = movimento;
/* 515 */     this.cfil = cfil;
/* 516 */     this.codCatSec = sec;
/* 517 */     this.codDivisa = divisa;
/* 518 */     this.codFilSec = sec2;
/* 519 */     this.codiceIsin = isin;
/* 520 */     this.controvalore = controvalore;
/* 521 */     this.cprg = cprg;
/* 522 */     this.csdp = csdp;
/* 523 */     this.ctit = ctit;
/* 524 */     this.dataCaricamento = caricamento;
/* 525 */     this.dataElab = elab;
/* 526 */     this.dataEseguito = eseguito2;
/* 527 */     this.dataRegolamento = regolamento;
/* 528 */     this.dataStorno = storno;
/* 529 */     this.dataValuta = valuta;
/* 530 */     this.descrizioneErrore = errore;
/* 531 */     this.descrTitolo = titolo;
/* 532 */     this.impCommiss = commiss;
/* 533 */     this.importoSpese = spese;
/* 534 */     this.istanza = istanza;
/* 535 */     this.mercato = mercato;
/* 536 */     this.numOperRif = rif;
/* 537 */     this.numOperStornata = stornata;
/* 538 */     this.numPratSec = sec3;
/* 539 */     this.numQuoteEseguito = eseguito3;
/* 540 */     this.prezzoEseguito = eseguito4;
/* 541 */     this.progressivo = progressivo;
/* 542 */     this.rapporto = rapporto;
/* 543 */     this.statoElab = elab2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getComparto() {
/* 550 */     return this.comparto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComparto(String comparto) {
/* 556 */     this.comparto = comparto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDivisaEmissione() {
/* 562 */     return this.divisaEmissione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDivisaEmissione(String divisaEmissione) {
/* 568 */     this.divisaEmissione = divisaEmissione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecMovimentiDt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */