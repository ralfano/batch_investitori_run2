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
/*     */ public class FinSoggFasciaAdapterBase
/*     */   extends FinSoggFascia
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
/*     */   public String getCodCliePorfCcorAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "codCliePorfCcor", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodCliePorfCcorAdp(String codCliePorfCcor) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "codCliePorfCcor", codCliePorfCcor, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodSoggAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "codSogg", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodSoggAdp(String codSogg) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "codSogg", codSogg, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDatInseAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "datInse", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDatInseAdp(String datInse) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "datInse", datInse, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDatVarzAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "datVarz", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDatVarzAdp(String datVarz) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "datVarz", datVarz, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataAsseAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "dataAsse", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataAsseAdp(String dataAsse) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "dataAsse", dataAsse, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataFineAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "dataFine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataFineAdp(String dataFine) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "dataFine", dataFine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataIncoeAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "dataIncoe", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataIncoeAdp(String dataIncoe) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "dataIncoe", dataIncoe, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInizioAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "dataInizio", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInizioAdp(String dataInizio) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "dataInizio", dataInizio, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataSecAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "dataSec", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataSecAdp(String dataSec) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "dataSec", dataSec, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUpDownAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "dataUpDown", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUpDownAdp(String dataUpDown) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "dataUpDown", dataUpDown, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNavPrimLivAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "navPrimLiv", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNavPrimLivAdp(String navPrimLiv) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "navPrimLiv", navPrimLiv, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNavSecoLivAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "navSecoLiv", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNavSecoLivAdp(String navSecoLiv) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "navSecoLiv", navSecoLiv, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumContCorrAdp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "numContCorr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumContCorrAdp(String numContCorr) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "numContCorr", numContCorr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumIncoeAdp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "numIncoe", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumIncoeAdp(String numIncoe) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "numIncoe", numIncoe, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSoggFasciaIdAdp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "soggFasciaId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSoggFasciaIdAdp(String soggFasciaId) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "soggFasciaId", soggFasciaId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSoggettoIdAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "soggettoId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSoggettoIdAdp(String soggettoId) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "soggettoId", soggettoId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTmpUltiVarzAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "tmpUltiVarz", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTmpUltiVarzAdp(String tmpUltiVarz) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "tmpUltiVarz", tmpUltiVarz, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggFasciaAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */