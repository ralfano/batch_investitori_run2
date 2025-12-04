/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecRuolo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxID;
/*     */   private String banca;
/*     */   private String operazione;
/*     */   private String ndg;
/*     */   private String ndgcoll;
/*     */   private String tipColl;
/*     */   private Date dtIniColl;
/*     */   private Date dtEndColl;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxSecRuolo(String banca, Date caricamento, Date elaborazione, String errore, Date coll, Date coll2, Integer flxid, String istanza, String ndg, String ndgcoll, String operazione, String elab, String coll3) {
/*  27 */     this.banca = banca;
/*  28 */     this.dataCaricamento = caricamento;
/*  29 */     this.dataElaborazione = elaborazione;
/*  30 */     this.descrizioneErrore = errore;
/*  31 */     this.dtEndColl = coll;
/*  32 */     this.dtIniColl = coll2;
/*  33 */     this.flxID = flxid;
/*  34 */     this.istanza = istanza;
/*  35 */     this.ndg = ndg;
/*  36 */     this.ndgcoll = ndgcoll;
/*  37 */     this.operazione = operazione;
/*  38 */     this.statoElab = elab;
/*  39 */     this.tipColl = coll3;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/*  43 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/*  47 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  51 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  55 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecRuolo() {}
/*     */ 
/*     */   
/*     */   public String getBanca() {
/*  64 */     return this.banca;
/*     */   }
/*     */   
/*     */   public void setBanca(String banca) {
/*  68 */     this.banca = banca;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/*  72 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  76 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDtEndColl() {
/*  80 */     return this.dtEndColl;
/*     */   }
/*     */   
/*     */   public void setDtEndColl(Date dtEndColl) {
/*  84 */     this.dtEndColl = dtEndColl;
/*     */   }
/*     */   
/*     */   public Date getDtIniColl() {
/*  88 */     return this.dtIniColl;
/*     */   }
/*     */   
/*     */   public void setDtIniColl(Date dtIniColl) {
/*  92 */     this.dtIniColl = dtIniColl;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/*  96 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 100 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getNdg() {
/* 104 */     return this.ndg;
/*     */   }
/*     */   
/*     */   public void setNdg(String ndg) {
/* 108 */     this.ndg = ndg;
/*     */   }
/*     */   
/*     */   public String getNdgcoll() {
/* 112 */     return this.ndgcoll;
/*     */   }
/*     */   
/*     */   public void setNdgcoll(String ndgcoll) {
/* 116 */     this.ndgcoll = ndgcoll;
/*     */   }
/*     */   
/*     */   public String getOperazione() {
/* 120 */     return this.operazione;
/*     */   }
/*     */   
/*     */   public void setOperazione(String operazione) {
/* 124 */     this.operazione = operazione;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 128 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 132 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getTipColl() {
/* 136 */     return this.tipColl;
/*     */   }
/*     */   
/*     */   public void setTipColl(String tipColl) {
/* 140 */     this.tipColl = tipColl;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecRuolo(String banca, Date caricamento, Date coll, Date coll2, Integer flxid, String istanza, String ndg, String ndgcoll, String operazione, String elab, String coll3) {
/* 146 */     this.banca = banca;
/* 147 */     this.dataCaricamento = caricamento;
/* 148 */     this.dtEndColl = coll;
/* 149 */     this.dtIniColl = coll2;
/* 150 */     this.flxID = flxid;
/* 151 */     this.istanza = istanza;
/* 152 */     this.ndg = ndg;
/* 153 */     this.ndgcoll = ndgcoll;
/* 154 */     this.operazione = operazione;
/* 155 */     this.statoElab = elab;
/* 156 */     this.tipColl = coll3;
/*     */   }
/*     */   
/*     */   public Integer getFlxID() {
/* 160 */     return this.flxID;
/*     */   }
/*     */   
/*     */   public void setFlxID(Integer flxID) {
/* 164 */     this.flxID = flxID;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecRuolo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */