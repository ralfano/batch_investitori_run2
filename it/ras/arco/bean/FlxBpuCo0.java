/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
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
/*     */ public class FlxBpuCo0
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer nprgflu;
/*     */   private Integer nprgrec;
/*     */   private Integer cscv;
/*     */   private Integer cclc;
/*     */   private Integer csot;
/*     */   private String csotest;
/*     */   private String trec;
/*     */   private String cmov;
/*     */   private String cmovest;
/*     */   private String ccomspe;
/*     */   private String xcomspe;
/*     */   private String sentcom;
/*     */   private Double icomspe;
/*     */   private Double pcom;
/*     */   private Double psco;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   
/*     */   public FlxBpuCo0(Integer flxId, Integer nprgflu, Integer nprgrec, Integer cscv, Integer cclc, Integer csot, String csotest, String trec, String cmov, String cmovest, String ccomspe, String xcomspe, String sentcom, Double icomspe, Double pcom, Double psco, String statoElab, String istanza) {
/*  69 */     this.nprgflu = nprgflu;
/*  70 */     this.nprgrec = nprgrec;
/*  71 */     this.cscv = cscv;
/*  72 */     this.cclc = cclc;
/*  73 */     this.csot = csot;
/*  74 */     this.csotest = csotest;
/*  75 */     this.trec = trec;
/*  76 */     this.cmov = cmov;
/*  77 */     this.cmovest = cmovest;
/*  78 */     this.ccomspe = ccomspe;
/*  79 */     this.xcomspe = xcomspe;
/*  80 */     this.sentcom = sentcom;
/*  81 */     this.icomspe = icomspe;
/*  82 */     this.pcom = pcom;
/*  83 */     this.psco = psco;
/*  84 */     this.statoElab = statoElab;
/*  85 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxBpuCo0() {}
/*     */ 
/*     */   
/*     */   public Integer getCclc() {
/*  93 */     return this.cclc;
/*     */   }
/*     */   
/*     */   public void setCclc(Integer cclc) {
/*  97 */     this.cclc = cclc;
/*     */   }
/*     */   
/*     */   public String getCcomspe() {
/* 101 */     return this.ccomspe;
/*     */   }
/*     */   
/*     */   public void setCcomspe(String ccomspe) {
/* 105 */     this.ccomspe = ccomspe;
/*     */   }
/*     */   
/*     */   public String getCmov() {
/* 109 */     return this.cmov;
/*     */   }
/*     */   
/*     */   public void setCmov(String cmov) {
/* 113 */     this.cmov = cmov;
/*     */   }
/*     */   
/*     */   public String getCmovest() {
/* 117 */     return this.cmovest;
/*     */   }
/*     */   
/*     */   public void setCmovest(String cmovest) {
/* 121 */     this.cmovest = cmovest;
/*     */   }
/*     */   
/*     */   public Integer getCscv() {
/* 125 */     return this.cscv;
/*     */   }
/*     */   
/*     */   public void setCscv(Integer cscv) {
/* 129 */     this.cscv = cscv;
/*     */   }
/*     */   
/*     */   public Integer getCsot() {
/* 133 */     return this.csot;
/*     */   }
/*     */   
/*     */   public void setCsot(Integer csot) {
/* 137 */     this.csot = csot;
/*     */   }
/*     */   
/*     */   public String getCsotest() {
/* 141 */     return this.csotest;
/*     */   }
/*     */   
/*     */   public void setCsotest(String csotest) {
/* 145 */     this.csotest = csotest;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 149 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 153 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Double getIcomspe() {
/* 157 */     return this.icomspe;
/*     */   }
/*     */   
/*     */   public void setIcomspe(Double icomspe) {
/* 161 */     this.icomspe = icomspe;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 165 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 169 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Integer getNprgflu() {
/* 173 */     return this.nprgflu;
/*     */   }
/*     */   
/*     */   public void setNprgflu(Integer nprgflu) {
/* 177 */     this.nprgflu = nprgflu;
/*     */   }
/*     */   
/*     */   public Integer getNprgrec() {
/* 181 */     return this.nprgrec;
/*     */   }
/*     */   
/*     */   public void setNprgrec(Integer nprgrec) {
/* 185 */     this.nprgrec = nprgrec;
/*     */   }
/*     */   
/*     */   public Double getPcom() {
/* 189 */     return this.pcom;
/*     */   }
/*     */   
/*     */   public void setPcom(Double pcom) {
/* 193 */     this.pcom = pcom;
/*     */   }
/*     */   
/*     */   public Double getPsco() {
/* 197 */     return this.psco;
/*     */   }
/*     */   
/*     */   public void setPsco(Double psco) {
/* 201 */     this.psco = psco;
/*     */   }
/*     */   
/*     */   public String getSentcom() {
/* 205 */     return this.sentcom;
/*     */   }
/*     */   
/*     */   public void setSentcom(String sentcom) {
/* 209 */     this.sentcom = sentcom;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 213 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 217 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getTrec() {
/* 221 */     return this.trec;
/*     */   }
/*     */   
/*     */   public void setTrec(String trec) {
/* 225 */     this.trec = trec;
/*     */   }
/*     */   
/*     */   public String getXcomspe() {
/* 229 */     return this.xcomspe;
/*     */   }
/*     */   
/*     */   public void setXcomspe(String xcomspe) {
/* 233 */     this.xcomspe = xcomspe;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 237 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FlxBpuCo0.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */