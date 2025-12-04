/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.adapter.AdapterUtils;
/*     */ import it.ras.flag.bean.adapter.IRasORMAdapter;
/*     */ import java.text.NumberFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxProdottiRamAdapterBase
/*     */   extends FlxProdottiRam
/*     */   implements IRasORMAdapter
/*     */ {
/*     */   public String getStringProperty(String property) {
/*  18 */     return null;
/*     */   }
/*     */   
/*     */   public Object getProperty(String property) {
/*  22 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStringProperty(String property, String value) {}
/*     */ 
/*     */   
/*     */   public void setProperty(String property, Object value) {}
/*     */   
/*     */   public SimpleDateFormat getDateFormat(String property) {
/*  32 */     return null;
/*     */   }
/*     */   
/*     */   public NumberFormat getNumericFormat(String property) {
/*  36 */     return null;
/*     */   }
/*     */   
/*     */   public Object getAdapted() {
/*  40 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCdsgrAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "cdsgr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCdsgrAdp(String cdsgr) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "cdsgr", cdsgr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getClasseAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "classe", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setClasseAdp(String classe) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "classe", classe, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCaricamentoAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "dataCaricamento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCaricamentoAdp(String dataCaricamento) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "dataCaricamento", dataCaricamento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDtpmfAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "dtpmf", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDtpmfAdp(String dtpmf) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "dtpmf", dtpmf, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDtulmAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "dtulm", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDtulmAdp(String dtulm) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "dtulm", dtulm, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDtumfAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "dtumf", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDtumfAdp(String dtumf) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "dtumf", dtumf, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getFbaseAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "fbase", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setFbaseAdp(String fbase) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "fbase", fbase, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getFlxIdAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "flxId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setFlxIdAdp(String flxId) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "flxId", flxId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getMafmeAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "mafme", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setMafmeAdp(String mafme) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "mafme", mafme, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrdvalAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "prdval", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrdvalAdp(String prdval) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "prdval", prdval, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRagffAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "ragff", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRagffAdp(String ragff) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "ragff", ragff, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FlxProdottiRamAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */