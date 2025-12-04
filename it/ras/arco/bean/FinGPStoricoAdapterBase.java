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
/*     */ public class FinGPStoricoAdapterBase
/*     */   extends FinGPStorico
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
/*     */   public String getContrattoIdAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "contrattoId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setContrattoIdAdp(String contrattoId) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "contrattoId", contrattoId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCtvTotAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "ctvTot", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCtvTotAdp(String ctvTot) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "ctvTot", ctvTot, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataPerfAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "dataPerf", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataPerfAdp(String dataPerf) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "dataPerf", dataPerf, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataStoricoAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "dataStorico", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataStoricoAdp(String dataStorico) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "dataStorico", dataStorico, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataValAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "dataVal", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataValAdp(String dataVal) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "dataVal", dataVal, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getGpStoricoIdAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "gpStoricoId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setGpStoricoIdAdp(String gpStoricoId) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "gpStoricoId", gpStoricoId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpCommissioneAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "impCommissione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpCommissioneAdp(String impCommissione) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "impCommissione", impCommissione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getLiquiditaAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "liquidita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setLiquiditaAdp(String liquidita) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "liquidita", liquidita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNavPerfAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "navPerf", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNavPerfAdp(String navPerf) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "navPerf", navPerf, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfAnnInGestAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "perfAnnInGest", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfAnnInGestAdp(String perfAnnInGest) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "perfAnnInGest", perfAnnInGest, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfBcmkAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "perfBcmk", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfBcmkAdp(String perfBcmk) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "perfBcmk", perfBcmk, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfBcmkAnnAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "perfBcmkAnn", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfBcmkAnnAdp(String perfBcmkAnn) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "perfBcmkAnn", perfBcmkAnn, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfBcmkTriAdp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "perfBcmkTri", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfBcmkTriAdp(String perfBcmkTri) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "perfBcmkTri", perfBcmkTri, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfLordaAnnAdp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "perfLordaAnn", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfLordaAnnAdp(String perfLordaAnn) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "perfLordaAnn", perfLordaAnn, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfLordaTriAdp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "perfLordaTri", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfLordaTriAdp(String perfLordaTri) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "perfLordaTri", perfLordaTri, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfNettaAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "perfNetta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfNettaAdp(String perfNetta) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "perfNetta", perfNetta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfNettaAnnAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "perfNettaAnn", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfNettaAnnAdp(String perfNettaAnn) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "perfNettaAnn", perfNettaAnn, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPerfNettaTriAdp() {
/* 247 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 248 */     return utils.getStringProperty(this, "perfNettaTri", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPerfNettaTriAdp(String perfNettaTri) {
/* 252 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 253 */     utils.setStringProperty(this, "perfNettaTri", perfNettaTri, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrenotateAvereAdp() {
/* 257 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 258 */     return utils.getStringProperty(this, "prenotateAvere", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrenotateAvereAdp(String prenotateAvere) {
/* 262 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 263 */     utils.setStringProperty(this, "prenotateAvere", prenotateAvere, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrenotateDareAdp() {
/* 267 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 268 */     return utils.getStringProperty(this, "prenotateDare", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrenotateDareAdp(String prenotateDare) {
/* 272 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 273 */     utils.setStringProperty(this, "prenotateDare", prenotateDare, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSaldoSottoDossierAdp() {
/* 277 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 278 */     return utils.getStringProperty(this, "saldoSottoDossier", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSaldoSottoDossierAdp(String saldoSottoDossier) {
/* 282 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 283 */     utils.setStringProperty(this, "saldoSottoDossier", saldoSottoDossier, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTitoliAdp() {
/* 287 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 288 */     return utils.getStringProperty(this, "titoli", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTitoliAdp(String titoli) {
/* 292 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 293 */     utils.setStringProperty(this, "titoli", titoli, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinGPStoricoAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */