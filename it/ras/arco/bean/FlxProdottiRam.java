/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class FlxProdottiRam
/*     */   extends RasORMBean
/*     */   implements Serializable {
/*     */   private Integer flxId;
/*     */   private Date dtulm;
/*     */   private String utent;
/*     */   private String gesti;
/*     */   private String deges;
/*     */   private String omint;
/*     */   private String tpfam;
/*     */   private Integer fbase;
/*     */   private Integer cdsgr;
/*     */   private Date dtumf;
/*     */   private Date dtpmf;
/*     */   private Integer mafme;
/*     */   private String derid;
/*     */   private Integer ragff;
/*     */   private Integer classe;
/*     */   private String tabcl;
/*     */   private String prefd;
/*     */   private Integer prdval;
/*     */   private String prdtip;
/*     */   private String flgunt;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private FinProdotto prodotto;
/*     */   private FinAttivitaFinanziaria attivitaFin;
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFin() {
/*  37 */     return this.attivitaFin;
/*     */   }
/*     */   public void setAttivitaFin(FinAttivitaFinanziaria attivitaFin) {
/*  40 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */   public Integer getCdsgr() {
/*  43 */     return this.cdsgr;
/*     */   }
/*     */   public void setCdsgr(Integer cdsgr) {
/*  46 */     this.cdsgr = cdsgr;
/*     */   }
/*     */   public Integer getClasse() {
/*  49 */     return this.classe;
/*     */   }
/*     */   public void setClasse(Integer classe) {
/*  52 */     this.classe = classe;
/*     */   }
/*     */   public Date getDataCaricamento() {
/*  55 */     return this.dataCaricamento;
/*     */   }
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  58 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   public String getDeges() {
/*  61 */     return this.deges;
/*     */   }
/*     */   public void setDeges(String deges) {
/*  64 */     this.deges = deges;
/*     */   }
/*     */   public String getDerid() {
/*  67 */     return this.derid;
/*     */   }
/*     */   public void setDerid(String derid) {
/*  70 */     this.derid = derid;
/*     */   }
/*     */   public Date getDtpmf() {
/*  73 */     return this.dtpmf;
/*     */   }
/*     */   public void setDtpmf(Date dtpmf) {
/*  76 */     this.dtpmf = dtpmf;
/*     */   }
/*     */   public Date getDtulm() {
/*  79 */     return this.dtulm;
/*     */   }
/*     */   public void setDtulm(Date dtulm) {
/*  82 */     this.dtulm = dtulm;
/*     */   }
/*     */   public Date getDtumf() {
/*  85 */     return this.dtumf;
/*     */   }
/*     */   public void setDtumf(Date dtumf) {
/*  88 */     this.dtumf = dtumf;
/*     */   }
/*     */   public Integer getFbase() {
/*  91 */     return this.fbase;
/*     */   }
/*     */   public void setFbase(Integer fbase) {
/*  94 */     this.fbase = fbase;
/*     */   }
/*     */   public String getFlgunt() {
/*  97 */     return this.flgunt;
/*     */   }
/*     */   public void setFlgunt(String flgunt) {
/* 100 */     this.flgunt = flgunt;
/*     */   }
/*     */   public Integer getFlxId() {
/* 103 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 106 */     this.flxId = flxId;
/*     */   }
/*     */   public String getGesti() {
/* 109 */     return this.gesti;
/*     */   }
/*     */   public void setGesti(String gesti) {
/* 112 */     this.gesti = gesti;
/*     */   }
/*     */   public String getIstanza() {
/* 115 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 118 */     this.istanza = istanza;
/*     */   }
/*     */   public Integer getMafme() {
/* 121 */     return this.mafme;
/*     */   }
/*     */   public void setMafme(Integer mafme) {
/* 124 */     this.mafme = mafme;
/*     */   }
/*     */   public String getOmint() {
/* 127 */     return this.omint;
/*     */   }
/*     */   public void setOmint(String omint) {
/* 130 */     this.omint = omint;
/*     */   }
/*     */   public String getPrdtip() {
/* 133 */     return this.prdtip;
/*     */   }
/*     */   public void setPrdtip(String prdtip) {
/* 136 */     this.prdtip = prdtip;
/*     */   }
/*     */   public Integer getPrdval() {
/* 139 */     return this.prdval;
/*     */   }
/*     */   public void setPrdval(Integer prdval) {
/* 142 */     this.prdval = prdval;
/*     */   }
/*     */   public String getPrefd() {
/* 145 */     return this.prefd;
/*     */   }
/*     */   public void setPrefd(String prefd) {
/* 148 */     this.prefd = prefd;
/*     */   }
/*     */   public FinProdotto getProdotto() {
/* 151 */     return this.prodotto;
/*     */   }
/*     */   public void setProdotto(FinProdotto prodotto) {
/* 154 */     this.prodotto = prodotto;
/*     */   }
/*     */   public Integer getRagff() {
/* 157 */     return this.ragff;
/*     */   }
/*     */   public void setRagff(Integer ragff) {
/* 160 */     this.ragff = ragff;
/*     */   }
/*     */   public String getStatoElab() {
/* 163 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 166 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTabcl() {
/* 169 */     return this.tabcl;
/*     */   }
/*     */   public void setTabcl(String tabcl) {
/* 172 */     this.tabcl = tabcl;
/*     */   }
/*     */   public String getTpfam() {
/* 175 */     return this.tpfam;
/*     */   }
/*     */   public void setTpfam(String tpfam) {
/* 178 */     this.tpfam = tpfam;
/*     */   }
/*     */   public String getUtent() {
/* 181 */     return this.utent;
/*     */   }
/*     */   public void setUtent(String utent) {
/* 184 */     this.utent = utent;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FlxProdottiRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */