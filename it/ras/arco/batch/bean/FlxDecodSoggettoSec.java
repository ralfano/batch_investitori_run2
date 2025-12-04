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
/*     */ public class FlxDecodSoggettoSec
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codNdg;
/*     */   private String cointestazione;
/*     */   private String codCsot;
/*     */   private String crap;
/*     */   private String codColloquioBanca;
/*     */   private String codiceFabbrica;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxDecodSoggettoSec(Integer flxId, String codNdg, String cointestazione, String codCsot, String crap, String codColloquioBanca, String codiceFabbrica, String statoElab, String istanza, String descrizioneErrore, Date dataErrore) {
/*  49 */     this.flxId = flxId;
/*  50 */     this.codNdg = codNdg;
/*  51 */     this.cointestazione = cointestazione;
/*  52 */     this.codCsot = codCsot;
/*  53 */     this.crap = crap;
/*  54 */     this.codColloquioBanca = codColloquioBanca;
/*  55 */     this.codiceFabbrica = codiceFabbrica;
/*  56 */     this.statoElab = statoElab;
/*  57 */     this.istanza = istanza;
/*  58 */     this.descrizioneErrore = descrizioneErrore;
/*  59 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxDecodSoggettoSec() {}
/*     */ 
/*     */   
/*     */   public String getCodColloquioBanca() {
/*  67 */     return this.codColloquioBanca;
/*     */   }
/*     */   
/*     */   public void setCodColloquioBanca(String codColloquioBanca) {
/*  71 */     this.codColloquioBanca = codColloquioBanca;
/*     */   }
/*     */   
/*     */   public String getCodCsot() {
/*  75 */     return this.codCsot;
/*     */   }
/*     */   
/*     */   public void setCodCsot(String codCsot) {
/*  79 */     this.codCsot = codCsot;
/*     */   }
/*     */   
/*     */   public String getCodiceFabbrica() {
/*  83 */     return this.codiceFabbrica;
/*     */   }
/*     */   
/*     */   public void setCodiceFabbrica(String codiceFabbrica) {
/*  87 */     this.codiceFabbrica = codiceFabbrica;
/*     */   }
/*     */   
/*     */   public String getCodNdg() {
/*  91 */     return this.codNdg;
/*     */   }
/*     */   
/*     */   public void setCodNdg(String codNdg) {
/*  95 */     this.codNdg = codNdg;
/*     */   }
/*     */   
/*     */   public String getCointestazione() {
/*  99 */     return this.cointestazione;
/*     */   }
/*     */   
/*     */   public void setCointestazione(String cointestazione) {
/* 103 */     this.cointestazione = cointestazione;
/*     */   }
/*     */   
/*     */   public String getCrap() {
/* 107 */     return this.crap;
/*     */   }
/*     */   
/*     */   public void setCrap(String crap) {
/* 111 */     this.crap = crap;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 115 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 119 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 123 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 127 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 131 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 135 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 139 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 143 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public Date getDataErrore() {
/* 147 */     return this.dataErrore;
/*     */   }
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/* 151 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxDecodSoggettoSec.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */