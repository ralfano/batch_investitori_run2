/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxSecRuoloContrSogg
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String ndg;
/*     */   private String codSrvSec;
/*     */   private String codFilSec;
/*     */   private String codCatSec;
/*     */   private String numPartSec;
/*     */   private String cfil;
/*     */   private String cage;
/*     */   private String cprg;
/*     */   private String csot;
/*     */   private String numeroRapportoGespat;
/*     */   private String tipoProdotto;
/*     */   private String ruolo;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxSecRuoloContrSogg(String cage, String cfil, String sec, String sec2, String sec3, String cprg, String csot, Date caricamento, Date elaborazione, String errore, Integer id, String istanza, String ndg, String gespat, String sec4, String ruolo, String elab, String prodotto) {
/*  33 */     this.cage = cage;
/*  34 */     this.cfil = cfil;
/*  35 */     this.codCatSec = sec;
/*  36 */     this.codFilSec = sec2;
/*  37 */     this.codSrvSec = sec3;
/*  38 */     this.cprg = cprg;
/*  39 */     this.csot = csot;
/*  40 */     this.dataCaricamento = caricamento;
/*  41 */     this.dataElaborazione = elaborazione;
/*  42 */     this.descrizioneErrore = errore;
/*  43 */     this.flxId = id;
/*  44 */     this.istanza = istanza;
/*  45 */     this.ndg = ndg;
/*  46 */     this.numeroRapportoGespat = gespat;
/*  47 */     this.numPartSec = sec4;
/*  48 */     this.ruolo = ruolo;
/*  49 */     this.statoElab = elab;
/*  50 */     this.tipoProdotto = prodotto;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/*  54 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/*  58 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  62 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  66 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecRuoloContrSogg(String cage, String cfil, String sec, String sec2, String sec3, String cprg, String csot, Date caricamento, Integer id, String istanza, String ndg, String gespat, String sec4, String ruolo, String elab, String prodotto) {
/*  72 */     this.cage = cage;
/*  73 */     this.cfil = cfil;
/*  74 */     this.codCatSec = sec;
/*  75 */     this.codFilSec = sec2;
/*  76 */     this.codSrvSec = sec3;
/*  77 */     this.cprg = cprg;
/*  78 */     this.csot = csot;
/*  79 */     this.dataCaricamento = caricamento;
/*  80 */     this.flxId = id;
/*  81 */     this.istanza = istanza;
/*  82 */     this.ndg = ndg;
/*  83 */     this.numeroRapportoGespat = gespat;
/*  84 */     this.numPartSec = sec4;
/*  85 */     this.ruolo = ruolo;
/*  86 */     this.statoElab = elab;
/*  87 */     this.tipoProdotto = prodotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecRuoloContrSogg() {}
/*     */ 
/*     */   
/*     */   public String getCage() {
/*  96 */     return this.cage;
/*     */   }
/*     */   
/*     */   public void setCage(String cage) {
/* 100 */     this.cage = cage;
/*     */   }
/*     */   
/*     */   public String getCfil() {
/* 104 */     return this.cfil;
/*     */   }
/*     */   
/*     */   public void setCfil(String cfil) {
/* 108 */     this.cfil = cfil;
/*     */   }
/*     */   
/*     */   public String getCodCatSec() {
/* 112 */     return this.codCatSec;
/*     */   }
/*     */   
/*     */   public void setCodCatSec(String codCatSec) {
/* 116 */     this.codCatSec = codCatSec;
/*     */   }
/*     */   
/*     */   public String getCodFilSec() {
/* 120 */     return this.codFilSec;
/*     */   }
/*     */   
/*     */   public void setCodFilSec(String codFilSec) {
/* 124 */     this.codFilSec = codFilSec;
/*     */   }
/*     */   
/*     */   public String getCodSrvSec() {
/* 128 */     return this.codSrvSec;
/*     */   }
/*     */   
/*     */   public void setCodSrvSec(String codSrvSec) {
/* 132 */     this.codSrvSec = codSrvSec;
/*     */   }
/*     */   
/*     */   public String getCprg() {
/* 136 */     return this.cprg;
/*     */   }
/*     */   
/*     */   public void setCprg(String cprg) {
/* 140 */     this.cprg = cprg;
/*     */   }
/*     */   
/*     */   public String getCsot() {
/* 144 */     return this.csot;
/*     */   }
/*     */   
/*     */   public void setCsot(String csot) {
/* 148 */     this.csot = csot;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 152 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 156 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 160 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 164 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 168 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 172 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getNdg() {
/* 176 */     return this.ndg;
/*     */   }
/*     */   
/*     */   public void setNdg(String ndg) {
/* 180 */     this.ndg = ndg;
/*     */   }
/*     */   
/*     */   public String getNumeroRapportoGespat() {
/* 184 */     return this.numeroRapportoGespat;
/*     */   }
/*     */   
/*     */   public void setNumeroRapportoGespat(String numeroRapportoGespat) {
/* 188 */     this.numeroRapportoGespat = numeroRapportoGespat;
/*     */   }
/*     */   
/*     */   public String getNumPartSec() {
/* 192 */     return this.numPartSec;
/*     */   }
/*     */   
/*     */   public void setNumPartSec(String numPartSec) {
/* 196 */     this.numPartSec = numPartSec;
/*     */   }
/*     */   
/*     */   public String getRuolo() {
/* 200 */     return this.ruolo;
/*     */   }
/*     */   
/*     */   public void setRuolo(String ruolo) {
/* 204 */     this.ruolo = ruolo;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 208 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 212 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 216 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 220 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecRuoloContrSogg.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */