/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxIndcoicr
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer attivita_ProdID;
/*     */   private Date dtulm;
/*     */   private String utent;
/*     */   private Integer fondo;
/*     */   private String manda;
/*     */   private String clcli;
/*     */   private String indco;
/*     */   private String locco;
/*     */   private String proco;
/*     */   private String capco;
/*     */   private String staco;
/*     */   private Integer tprec;
/*     */   private Integer tpcli;
/*     */   private String codsq;
/*     */   private String gstdStatoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxIndcoicr(Date dtulm, String utent, Integer fondo, String manda, String clcli, String indco, String locco, String proco, String capco, String staco, Integer tprec, Integer tpcli, String codsq, String gstdStatoElab, String istanza) {
/*  70 */     this.dtulm = dtulm;
/*  71 */     this.utent = utent;
/*  72 */     this.fondo = fondo;
/*  73 */     this.manda = manda;
/*  74 */     this.clcli = clcli;
/*  75 */     this.indco = indco;
/*  76 */     this.locco = locco;
/*  77 */     this.proco = proco;
/*  78 */     this.capco = capco;
/*  79 */     this.staco = staco;
/*  80 */     this.tprec = tprec;
/*  81 */     this.tpcli = tpcli;
/*  82 */     this.codsq = codsq;
/*  83 */     this.gstdStatoElab = gstdStatoElab;
/*  84 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxIndcoicr() {}
/*     */ 
/*     */   
/*     */   public Integer getAttivita_ProdID() {
/*  92 */     return this.attivita_ProdID;
/*     */   }
/*     */   
/*     */   public void setAttivita_ProdID(Integer attivita_ProdID) {
/*  96 */     this.attivita_ProdID = attivita_ProdID;
/*     */   }
/*     */   
/*     */   public Date getDtulm() {
/* 100 */     return this.dtulm;
/*     */   }
/*     */   
/*     */   public void setDtulm(Date dtulm) {
/* 104 */     this.dtulm = dtulm;
/*     */   }
/*     */   
/*     */   public String getUtent() {
/* 108 */     return this.utent;
/*     */   }
/*     */   
/*     */   public void setUtent(String utent) {
/* 112 */     this.utent = utent;
/*     */   }
/*     */   
/*     */   public Integer getFondo() {
/* 116 */     return this.fondo;
/*     */   }
/*     */   
/*     */   public void setFondo(Integer fondo) {
/* 120 */     this.fondo = fondo;
/*     */   }
/*     */   
/*     */   public String getManda() {
/* 124 */     return this.manda;
/*     */   }
/*     */   
/*     */   public void setManda(String manda) {
/* 128 */     this.manda = manda;
/*     */   }
/*     */   
/*     */   public String getClcli() {
/* 132 */     return this.clcli;
/*     */   }
/*     */   
/*     */   public void setClcli(String clcli) {
/* 136 */     this.clcli = clcli;
/*     */   }
/*     */   
/*     */   public String getIndco() {
/* 140 */     return this.indco;
/*     */   }
/*     */   
/*     */   public void setIndco(String indco) {
/* 144 */     this.indco = indco;
/*     */   }
/*     */   
/*     */   public String getLocco() {
/* 148 */     return this.locco;
/*     */   }
/*     */   
/*     */   public void setLocco(String locco) {
/* 152 */     this.locco = locco;
/*     */   }
/*     */   
/*     */   public String getProco() {
/* 156 */     return this.proco;
/*     */   }
/*     */   
/*     */   public void setProco(String proco) {
/* 160 */     this.proco = proco;
/*     */   }
/*     */   
/*     */   public String getCapco() {
/* 164 */     return this.capco;
/*     */   }
/*     */   
/*     */   public void setCapco(String capco) {
/* 168 */     this.capco = capco;
/*     */   }
/*     */   
/*     */   public String getStaco() {
/* 172 */     return this.staco;
/*     */   }
/*     */   
/*     */   public void setStaco(String staco) {
/* 176 */     this.staco = staco;
/*     */   }
/*     */   
/*     */   public Integer getTprec() {
/* 180 */     return this.tprec;
/*     */   }
/*     */   
/*     */   public void setTprec(Integer tprec) {
/* 184 */     this.tprec = tprec;
/*     */   }
/*     */   
/*     */   public Integer getTpcli() {
/* 188 */     return this.tpcli;
/*     */   }
/*     */   
/*     */   public void setTpcli(Integer tpcli) {
/* 192 */     this.tpcli = tpcli;
/*     */   }
/*     */   
/*     */   public String getCodsq() {
/* 196 */     return this.codsq;
/*     */   }
/*     */   
/*     */   public void setCodsq(String codsq) {
/* 200 */     this.codsq = codsq;
/*     */   }
/*     */   
/*     */   public String getGstdStatoElab() {
/* 204 */     return this.gstdStatoElab;
/*     */   }
/*     */   
/*     */   public void setGstdStatoElab(String gstdStatoElab) {
/* 208 */     this.gstdStatoElab = gstdStatoElab;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 212 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 216 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/* 220 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 224 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 228 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 232 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 236 */     return (new ToStringBuilder(this)).append("attivita_ProdID", getAttivita_ProdID()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxIndcoicr.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */