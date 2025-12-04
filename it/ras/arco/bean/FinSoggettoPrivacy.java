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
/*     */ public class FinSoggettoPrivacy
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer soggPrivacyId;
/*     */   private FinSoggetto soggetto;
/*     */   private String tipoPrivacy;
/*     */   private Date dataCons;
/*     */   private String consPrivacy0;
/*     */   private String consPrivacy1;
/*     */   private String consPrivacy2;
/*     */   private String consPrivacy3;
/*     */   private String consPrivacy4;
/*     */   private String consPrivacy5;
/*     */   private String consPrivacy6;
/*     */   private String consPrivacy7;
/*     */   private String consPrivacy8;
/*     */   private String consPrivacy9;
/*     */   private String derogaSegrBanc;
/*     */   private Date dataDerogaSegrBanc;
/*     */   private Date dataConflittoInteressi;
/*     */   private String regConflittoInteressi;
/*     */   private Date dataAutorizMarketing;
/*     */   private String concAutorizMarketing;
/*     */   private Date dataCompDocRischi;
/*     */   private String compDocRischi;
/*     */   private String attEconomPrisma;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private int hashCode;
/*     */   
/*     */   public FinSoggettoPrivacy(String privacy0, String privacy1, String privacy2, String privacy3, String privacy4, String privacy5, String privacy6, String privacy7, String privacy8, String privacy9, Date cons, Date banc, Date inserimento, String banc2, FinSoggetto soggetto, Integer id, String privacy, String inserimento2) {
/* 337 */     this.hashCode = Integer.MIN_VALUE; this.consPrivacy0 = privacy0; this.consPrivacy1 = privacy1; this.consPrivacy2 = privacy2; this.consPrivacy3 = privacy3; this.consPrivacy4 = privacy4; this.consPrivacy5 = privacy5; this.consPrivacy6 = privacy6; this.consPrivacy7 = privacy7; this.consPrivacy8 = privacy8; this.consPrivacy9 = privacy9; this.dataCons = cons; this.dataDerogaSegrBanc = banc; this.dataInserimento = inserimento; this.derogaSegrBanc = banc2; this.soggetto = soggetto; this.soggPrivacyId = id; this.tipoPrivacy = privacy; this.utenteInserimento = inserimento2; } public Integer getSoggPrivacyId() { return this.soggPrivacyId; } public void setSoggPrivacyId(Integer soggPrivacyId) { this.soggPrivacyId = soggPrivacyId; } public String getTipoPrivacy() { return this.tipoPrivacy; } public void setTipoPrivacy(String tipoPrivacy) { this.tipoPrivacy = tipoPrivacy; } public Date getDataCons() { return this.dataCons; } public void setDataCons(Date dataCons) { this.dataCons = dataCons; } public String getConsPrivacy0() { return this.consPrivacy0; } public void setConsPrivacy0(String consPrivacy0) { this.consPrivacy0 = consPrivacy0; } public String getConsPrivacy1() { return this.consPrivacy1; } public void setConsPrivacy1(String consPrivacy1) { this.consPrivacy1 = consPrivacy1; } public String getConsPrivacy2() { return this.consPrivacy2; } public void setConsPrivacy2(String consPrivacy2) { this.consPrivacy2 = consPrivacy2; } public String getConsPrivacy3() { return this.consPrivacy3; } public FinSoggettoPrivacy() { this.hashCode = Integer.MIN_VALUE; }
/*     */   public void setConsPrivacy3(String consPrivacy3) { this.consPrivacy3 = consPrivacy3; }
/*     */   public String getConsPrivacy4() { return this.consPrivacy4; }
/* 340 */   public void setConsPrivacy4(String consPrivacy4) { this.consPrivacy4 = consPrivacy4; } public String getConsPrivacy5() { return this.consPrivacy5; } public void setConsPrivacy5(String consPrivacy5) { this.consPrivacy5 = consPrivacy5; } public String getConsPrivacy6() { return this.consPrivacy6; } public void setConsPrivacy6(String consPrivacy6) { this.consPrivacy6 = consPrivacy6; } public String getConsPrivacy7() { return this.consPrivacy7; } public void setConsPrivacy7(String consPrivacy7) { this.consPrivacy7 = consPrivacy7; } public String getConsPrivacy8() { return this.consPrivacy8; } public void setConsPrivacy8(String consPrivacy8) { this.consPrivacy8 = consPrivacy8; } public String getConsPrivacy9() { return this.consPrivacy9; } public void setConsPrivacy9(String consPrivacy9) { this.consPrivacy9 = consPrivacy9; } public int hashCode() { if (Integer.MIN_VALUE == this.hashCode) {
/* 341 */       if (null == getSoggPrivacyId()) return super.hashCode();
/*     */       
/* 343 */       String hashStr = getClass().getName() + ":" + getSoggPrivacyId().hashCode() + getConsPrivacy0().hashCode();
/*     */       
/* 345 */       this.hashCode = hashStr.hashCode();
/*     */     } 
/*     */     
/* 348 */     return this.hashCode; } public String getDerogaSegrBanc() { return this.derogaSegrBanc; } public void setDerogaSegrBanc(String derogaSegrBanc) { this.derogaSegrBanc = derogaSegrBanc; } public Date getDataDerogaSegrBanc() { return this.dataDerogaSegrBanc; } public void setDataDerogaSegrBanc(Date dataDerogaSegrBanc) { this.dataDerogaSegrBanc = dataDerogaSegrBanc; } public String getAttEconomPrisma() { return this.attEconomPrisma; } public void setAttEconomPrisma(String attEconomPrisma) { this.attEconomPrisma = attEconomPrisma; } public String getCompDocRischi() { return this.compDocRischi; } public void setCompDocRischi(String compDocRischi) { this.compDocRischi = compDocRischi; } public String getConcAutorizMarketing() { return this.concAutorizMarketing; }
/*     */   public void setConcAutorizMarketing(String concAutorizMarketing) { this.concAutorizMarketing = concAutorizMarketing; }
/*     */   public Date getDataAutorizMarketing() { return this.dataAutorizMarketing; }
/*     */   public void setDataAutorizMarketing(Date dataAutorizMarketing) { this.dataAutorizMarketing = dataAutorizMarketing; }
/*     */   public Date getDataCompDocRischi() { return this.dataCompDocRischi; }
/* 353 */   public String toString() { return (new ToStringBuilder(this)).append("soggPrivacyId", getSoggPrivacyId()).toString(); } public void setDataCompDocRischi(Date dataCompDocRischi) { this.dataCompDocRischi = dataCompDocRischi; } public Date getDataConflittoInteressi() { return this.dataConflittoInteressi; } public void setDataConflittoInteressi(Date dataConflittoInteressi) { this.dataConflittoInteressi = dataConflittoInteressi; } public int getHashCode() { return this.hashCode; } public void setHashCode(int hashCode) { this.hashCode = hashCode; } public String getRegConflittoInteressi() { return this.regConflittoInteressi; } public void setRegConflittoInteressi(String regConflittoInteressi) { this.regConflittoInteressi = regConflittoInteressi; } public Date getDataInserimento() { return this.dataInserimento; }
/*     */   public void setDataInserimento(Date dataInserimento) { this.dataInserimento = dataInserimento; }
/*     */   public String getUtenteInserimento() { return this.utenteInserimento; }
/*     */   public void setUtenteInserimento(String utenteInserimento) { this.utenteInserimento = utenteInserimento; }
/*     */   public FinSoggetto getSoggetto() { return this.soggetto; }
/*     */   public void setSoggetto(FinSoggetto soggetto) { this.soggetto = soggetto; }
/*     */   public boolean equals(Object obj) { if (null == obj) return false;  if (!(obj instanceof FinSoggettoPrivacy)) return false;  FinSoggettoPrivacy mObj = (FinSoggettoPrivacy)obj; if (null == getSoggPrivacyId() || null == mObj.getSoggPrivacyId()) return false;  return (getSoggPrivacyId().equals(mObj.getSoggPrivacyId()) && getConsPrivacy0().equals(mObj.getConsPrivacy0())); }
/* 360 */   public FinSoggettoPrivacy copyFields(FinSoggettoPrivacy pry) { this.attEconomPrisma = pry.getAttEconomPrisma();
/* 361 */     this.compDocRischi = getCompDocRischi();
/* 362 */     this.concAutorizMarketing = getConcAutorizMarketing();
/* 363 */     this.consPrivacy0 = getConsPrivacy0();
/* 364 */     this.consPrivacy1 = getConsPrivacy1();
/* 365 */     this.consPrivacy2 = getConsPrivacy2();
/* 366 */     this.consPrivacy3 = getConsPrivacy3();
/* 367 */     this.consPrivacy4 = getConsPrivacy4();
/* 368 */     this.consPrivacy5 = getConsPrivacy5();
/* 369 */     this.consPrivacy6 = getConsPrivacy6();
/* 370 */     this.consPrivacy7 = getConsPrivacy7();
/* 371 */     this.consPrivacy8 = getConsPrivacy8();
/* 372 */     this.consPrivacy9 = getConsPrivacy9();
/* 373 */     this.dataAutorizMarketing = getDataAutorizMarketing();
/* 374 */     this.dataCompDocRischi = getDataCompDocRischi();
/* 375 */     this.dataConflittoInteressi = getDataConflittoInteressi();
/* 376 */     this.dataCons = getDataCons();
/* 377 */     this.dataDerogaSegrBanc = getDataDerogaSegrBanc();
/* 378 */     this.dataInserimento = getDataInserimento();
/* 379 */     this.derogaSegrBanc = getDerogaSegrBanc();
/* 380 */     this.regConflittoInteressi = getRegConflittoInteressi();
/* 381 */     this.tipoPrivacy = getTipoPrivacy();
/* 382 */     this.utenteInserimento = getUtenteInserimento();
/* 383 */     this.dataUltimaModificaSlave = new Date();
/* 384 */     this.flagEsistenza = "S";
/* 385 */     this.proceduraUltimaModificaSlave = pry.getProceduraUltimaModificaSlave();
/* 386 */     this.tipoUltimaModificaSlave = "U";
/* 387 */     this.userUltimaModificaSlave = pry.getUserUltimaModificaSlave();
/* 388 */     return this; }
/*     */ 
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggettoPrivacy.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */