/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ public class FlxFndRamCosott
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Date dtulm;
/*     */   private String utent;
/*     */   private String codsq;
/*     */   private String clcli;
/*     */   private Integer tpana;
/*     */   private String tipsq;
/*     */   private Integer persp;
/*     */   private Date dtpco;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxFndRamCosott(Date dtulm, String utent, String codsq, String clcli, Integer tpana, String tipsq, Integer persp, Date dtpco, String statoElaborazione, String istanza, Date dataCaricamento) {
/*  56 */     this.dtulm = dtulm;
/*  57 */     this.utent = utent;
/*  58 */     this.codsq = codsq;
/*  59 */     this.clcli = clcli;
/*  60 */     this.tpana = tpana;
/*  61 */     this.tipsq = tipsq;
/*  62 */     this.persp = persp;
/*  63 */     this.dtpco = dtpco;
/*  64 */     this.statoElaborazione = statoElaborazione;
/*  65 */     this.istanza = istanza;
/*  66 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxFndRamCosott() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  74 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  78 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Date getDtulm() {
/*  82 */     return this.dtulm;
/*     */   }
/*     */   
/*     */   public void setDtulm(Date dtulm) {
/*  86 */     this.dtulm = dtulm;
/*     */   }
/*     */   
/*     */   public String getUtent() {
/*  90 */     return this.utent;
/*     */   }
/*     */   
/*     */   public void setUtent(String utent) {
/*  94 */     this.utent = utent;
/*     */   }
/*     */   
/*     */   public String getCodsq() {
/*  98 */     return this.codsq;
/*     */   }
/*     */   
/*     */   public void setCodsq(String codsq) {
/* 102 */     this.codsq = codsq;
/*     */   }
/*     */   
/*     */   public String getClcli() {
/* 106 */     return this.clcli;
/*     */   }
/*     */   
/*     */   public void setClcli(String clcli) {
/* 110 */     this.clcli = clcli;
/*     */   }
/*     */   
/*     */   public Integer getTpana() {
/* 114 */     return this.tpana;
/*     */   }
/*     */   
/*     */   public void setTpana(Integer tpana) {
/* 118 */     this.tpana = tpana;
/*     */   }
/*     */   
/*     */   public String getTipsq() {
/* 122 */     return this.tipsq;
/*     */   }
/*     */   
/*     */   public void setTipsq(String tipsq) {
/* 126 */     this.tipsq = tipsq;
/*     */   }
/*     */   
/*     */   public Integer getPersp() {
/* 130 */     return this.persp;
/*     */   }
/*     */   
/*     */   public void setPersp(Integer persp) {
/* 134 */     this.persp = persp;
/*     */   }
/*     */   
/*     */   public Date getDtpco() {
/* 138 */     return this.dtpco;
/*     */   }
/*     */   
/*     */   public void setDtpco(Date dtpco) {
/* 142 */     this.dtpco = dtpco;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 146 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 150 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 154 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 158 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 162 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 166 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/* 170 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 174 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 178 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 182 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 186 */     return (new ToStringBuilder(this)).append("cosottoscrittoriId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxFndRamCosott.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */