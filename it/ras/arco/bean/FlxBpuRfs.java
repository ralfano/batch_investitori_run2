/*     */ package it.ras.arco.bean;
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
/*     */ public class FlxBpuRfs
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
/*     */   private Date drfs;
/*     */   private String cdivprz;
/*     */   private Double iprz;
/*     */   private Double icam;
/*     */   private Integer idivrif;
/*     */   private String cdivcnv;
/*     */   private Double icamcnv;
/*     */   private Integer idivcnv;
/*     */   private String cdivfis;
/*     */   private Double iplsmin;
/*     */   private String ssgnmin;
/*     */   private Double iplsril;
/*     */   private String ssgnril;
/*     */   private Double palqfis;
/*     */   private Double iprzfis;
/*     */   private Double iintnet;
/*     */   private Double iplscap;
/*     */   private Double iimprfs;
/*     */   private Double iapprfs;
/*     */   private Double icomrfs;
/*     */   private String ssgn;
/*     */   private String cpae;
/*     */   private String sconfis;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   
/*     */   public FlxBpuRfs(Integer flxId, Integer nprgflu, Integer nprgrec, Integer cscv, Integer cclc, Integer csot, String csotest, String trec, String cmov, String cmovest, Date drfs, String cdivprz, Double iprz, Double icam, Integer idivrif, String cdivcnv, Double icamcnv, Integer idivcnv, String cdivfis, Double iplsmin, String ssgnmin, Double iplsril, String ssgnril, Double palqfis, Double iintnet, Double iplscap, Double iimprfs, Double iapprfs, Double icomrfs, String ssgn, String cpae, String sconfis, String statoElab, String istanza) {
/* 120 */     this.nprgflu = nprgflu;
/* 121 */     this.nprgrec = nprgrec;
/* 122 */     this.cscv = cscv;
/* 123 */     this.cclc = cclc;
/* 124 */     this.csot = csot;
/* 125 */     this.csotest = csotest;
/* 126 */     this.trec = trec;
/* 127 */     this.cmov = cmov;
/* 128 */     this.cmovest = cmovest;
/* 129 */     this.drfs = drfs;
/* 130 */     this.cdivprz = cdivprz;
/* 131 */     this.iprz = iprz;
/* 132 */     this.icam = icam;
/* 133 */     this.idivrif = idivrif;
/* 134 */     this.cdivcnv = cdivcnv;
/* 135 */     this.icamcnv = icamcnv;
/* 136 */     this.idivcnv = idivcnv;
/* 137 */     this.cdivfis = cdivfis;
/* 138 */     this.iplsmin = iplsmin;
/* 139 */     this.ssgnmin = ssgnmin;
/* 140 */     this.iplsril = iplsril;
/* 141 */     this.ssgnril = ssgnril;
/* 142 */     this.palqfis = palqfis;
/* 143 */     this.iintnet = iintnet;
/* 144 */     this.iplscap = iplscap;
/* 145 */     this.iimprfs = iimprfs;
/* 146 */     this.iapprfs = iapprfs;
/* 147 */     this.icomrfs = icomrfs;
/* 148 */     this.ssgn = ssgn;
/* 149 */     this.cpae = cpae;
/* 150 */     this.sconfis = sconfis;
/* 151 */     this.statoElab = statoElab;
/* 152 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxBpuRfs() {}
/*     */ 
/*     */   
/*     */   public Integer getCclc() {
/* 161 */     return this.cclc;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCclc(Integer cclc) {
/* 167 */     this.cclc = cclc;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCdivcnv() {
/* 173 */     return this.cdivcnv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCdivcnv(String cdivcnv) {
/* 179 */     this.cdivcnv = cdivcnv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCdivfis() {
/* 185 */     return this.cdivfis;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCdivfis(String cdivfis) {
/* 191 */     this.cdivfis = cdivfis;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCdivprz() {
/* 197 */     return this.cdivprz;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCdivprz(String cdivprz) {
/* 203 */     this.cdivprz = cdivprz;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCmov() {
/* 209 */     return this.cmov;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCmov(String cmov) {
/* 215 */     this.cmov = cmov;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCmovest() {
/* 221 */     return this.cmovest;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCmovest(String cmovest) {
/* 227 */     this.cmovest = cmovest;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCpae() {
/* 233 */     return this.cpae;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCpae(String cpae) {
/* 239 */     this.cpae = cpae;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCscv() {
/* 245 */     return this.cscv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCscv(Integer cscv) {
/* 251 */     this.cscv = cscv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCsot() {
/* 257 */     return this.csot;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCsot(Integer csot) {
/* 263 */     this.csot = csot;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCsotest() {
/* 269 */     return this.csotest;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCsotest(String csotest) {
/* 275 */     this.csotest = csotest;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDrfs() {
/* 281 */     return this.drfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDrfs(Date drfs) {
/* 287 */     this.drfs = drfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 293 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 299 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIapprfs() {
/* 305 */     return this.iapprfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIapprfs(Double iapprfs) {
/* 311 */     this.iapprfs = iapprfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIcam() {
/* 317 */     return this.icam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIcam(Double icam) {
/* 323 */     this.icam = icam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIcamcnv() {
/* 329 */     return this.icamcnv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIcamcnv(Double icamcnv) {
/* 335 */     this.icamcnv = icamcnv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIcomrfs() {
/* 341 */     return this.icomrfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIcomrfs(Double icomrfs) {
/* 347 */     this.icomrfs = icomrfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getIdivcnv() {
/* 353 */     return this.idivcnv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIdivcnv(Integer idivcnv) {
/* 359 */     this.idivcnv = idivcnv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getIdivrif() {
/* 365 */     return this.idivrif;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIdivrif(Integer idivrif) {
/* 371 */     this.idivrif = idivrif;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIimprfs() {
/* 377 */     return this.iimprfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIimprfs(Double iimprfs) {
/* 383 */     this.iimprfs = iimprfs;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIintnet() {
/* 389 */     return this.iintnet;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIintnet(Double iintnet) {
/* 395 */     this.iintnet = iintnet;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIplscap() {
/* 401 */     return this.iplscap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIplscap(Double iplscap) {
/* 407 */     this.iplscap = iplscap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIplsmin() {
/* 413 */     return this.iplsmin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIplsmin(Double iplsmin) {
/* 419 */     this.iplsmin = iplsmin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIplsril() {
/* 425 */     return this.iplsril;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIplsril(Double iplsril) {
/* 431 */     this.iplsril = iplsril;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIprz() {
/* 437 */     return this.iprz;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIprz(Double iprz) {
/* 443 */     this.iprz = iprz;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 449 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 455 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNprgflu() {
/* 461 */     return this.nprgflu;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNprgflu(Integer nprgflu) {
/* 467 */     this.nprgflu = nprgflu;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNprgrec() {
/* 473 */     return this.nprgrec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNprgrec(Integer nprgrec) {
/* 479 */     this.nprgrec = nprgrec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPalqfis() {
/* 485 */     return this.palqfis;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPalqfis(Double palqfis) {
/* 491 */     this.palqfis = palqfis;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSconfis() {
/* 497 */     return this.sconfis;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSconfis(String sconfis) {
/* 503 */     this.sconfis = sconfis;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSsgn() {
/* 509 */     return this.ssgn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSsgn(String ssgn) {
/* 515 */     this.ssgn = ssgn;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSsgnmin() {
/* 521 */     return this.ssgnmin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSsgnmin(String ssgnmin) {
/* 527 */     this.ssgnmin = ssgnmin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSsgnril() {
/* 533 */     return this.ssgnril;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSsgnril(String ssgnril) {
/* 539 */     this.ssgnril = ssgnril;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 545 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 551 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTrec() {
/* 557 */     return this.trec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrec(String trec) {
/* 563 */     this.trec = trec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 569 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getIprzfis() {
/* 575 */     return this.iprzfis;
/*     */   }
/*     */   
/*     */   public void setIprzfis(Double iprzfis) {
/* 579 */     this.iprzfis = iprzfis;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FlxBpuRfs.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */