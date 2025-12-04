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
/*     */ public class FlxSecSaldoContra
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String estero;
/*     */   private String filialeRapporto;
/*     */   private String categoriaRapporto;
/*     */   private String numRapporto;
/*     */   private Integer tipoProdotto;
/*     */   private Date dataValorizzazione;
/*     */   private String divisa;
/*     */   private Double saldoContabile;
/*     */   private Double saldoDisponibile;
/*     */   private Double saldoLiquido;
/*     */   private Double fidoDisponibile;
/*     */   private Double saldoDossier;
/*     */   private Double disponibilita;
/*     */   private Double partitePrenotateDare;
/*     */   private Double partitePrenotateAvere;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String cfil;
/*     */   private String cage;
/*     */   private String cprg;
/*     */   private String sottocodiceRapp;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public String getCategoriaRapporto() {
/*  44 */     return this.categoriaRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/*  50 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  56 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  62 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/*  68 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  74 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValorizzazione() {
/*  80 */     return this.dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValorizzazione(Date dataValorizzazione) {
/*  86 */     this.dataValorizzazione = dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  92 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  98 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getDisponibilita() {
/* 104 */     return this.disponibilita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisponibilita(Double disponibilita) {
/* 110 */     this.disponibilita = disponibilita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDivisa() {
/* 116 */     return this.divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 122 */     this.divisa = divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getFidoDisponibile() {
/* 128 */     return this.fidoDisponibile;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFidoDisponibile(Double fidoDisponibile) {
/* 134 */     this.fidoDisponibile = fidoDisponibile;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFilialeRapporto() {
/* 140 */     return this.filialeRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFilialeRapporto(String filialeRapporto) {
/* 146 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 152 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 158 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 164 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 170 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumRapporto() {
/* 176 */     return this.numRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumRapporto(String numRapporto) {
/* 182 */     this.numRapporto = numRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPartitePrenotateAvere() {
/* 188 */     return this.partitePrenotateAvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPartitePrenotateAvere(Double partitePrenotateAvere) {
/* 194 */     this.partitePrenotateAvere = partitePrenotateAvere;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPartitePrenotateDare() {
/* 200 */     return this.partitePrenotateDare;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPartitePrenotateDare(Double partitePrenotateDare) {
/* 206 */     this.partitePrenotateDare = partitePrenotateDare;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoContabile() {
/* 212 */     return this.saldoContabile;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoContabile(Double saldoContabile) {
/* 218 */     this.saldoContabile = saldoContabile;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoDisponibile() {
/* 224 */     return this.saldoDisponibile;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoDisponibile(Double saldoDisponibile) {
/* 230 */     this.saldoDisponibile = saldoDisponibile;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoDossier() {
/* 236 */     return this.saldoDossier;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoDossier(Double saldoDossier) {
/* 242 */     this.saldoDossier = saldoDossier;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoLiquido() {
/* 248 */     return this.saldoLiquido;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoLiquido(Double saldoLiquido) {
/* 254 */     this.saldoLiquido = saldoLiquido;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 260 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 266 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getTipoProdotto() {
/* 272 */     return this.tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoProdotto(Integer tipoProdotto) {
/* 278 */     this.tipoProdotto = tipoProdotto;
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
/*     */   public FlxSecSaldoContra() {}
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
/*     */   public FlxSecSaldoContra(String est, String rapporto, Date caricamento, Date elab, Date valorizzazione, String errore, Double disponibilita, String divisa, Double disponibile, String rapporto2, String istanza, String rapporto3, Double avere, Double dare, Double contabile, Double disponibile2, Double dossier, Double liquido, String elab2, Integer prodotto) {
/* 309 */     this.estero = est;
/* 310 */     this.categoriaRapporto = rapporto;
/* 311 */     this.dataCaricamento = caricamento;
/* 312 */     this.dataElab = elab;
/* 313 */     this.dataValorizzazione = valorizzazione;
/* 314 */     this.descrizioneErrore = errore;
/* 315 */     this.disponibilita = disponibilita;
/* 316 */     this.divisa = divisa;
/* 317 */     this.fidoDisponibile = disponibile;
/* 318 */     this.filialeRapporto = rapporto2;
/* 319 */     this.istanza = istanza;
/* 320 */     this.numRapporto = rapporto3;
/* 321 */     this.partitePrenotateAvere = avere;
/* 322 */     this.partitePrenotateDare = dare;
/* 323 */     this.saldoContabile = contabile;
/* 324 */     this.saldoDisponibile = disponibile2;
/* 325 */     this.saldoDossier = dossier;
/* 326 */     this.saldoLiquido = liquido;
/* 327 */     this.statoElab = elab2;
/* 328 */     this.tipoProdotto = prodotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCage() {
/* 334 */     return this.cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCage(String cage) {
/* 340 */     this.cage = cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCfil() {
/* 346 */     return this.cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCfil(String cfil) {
/* 352 */     this.cfil = cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCprg() {
/* 358 */     return this.cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCprg(String cprg) {
/* 364 */     this.cprg = cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSottocodiceRapp() {
/* 370 */     return this.sottocodiceRapp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottocodiceRapp(String sottocodiceRapp) {
/* 376 */     this.sottocodiceRapp = sottocodiceRapp;
/*     */   }
/*     */   public String getEstero() {
/* 379 */     return this.estero;
/*     */   }
/*     */   public void setEstero(String estero) {
/* 382 */     this.estero = estero;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecSaldoContra.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */