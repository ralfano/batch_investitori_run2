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
/*     */ public class FinDettaglioPctAdapterBase
/*     */   extends FinDettaglioPct
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
/*     */   public String getCambioProntiAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "cambioPronti", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCambioProntiAdp(String cambioPronti) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "cambioPronti", cambioPronti, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getControvaloreProntiAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "controvalorePronti", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setControvaloreProntiAdp(String controvalorePronti) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "controvalorePronti", controvalorePronti, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
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
/*     */   public String getDataOrdineAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "dataOrdine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataOrdineAdp(String dataOrdine) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "dataOrdine", dataOrdine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataProntiAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "dataPronti", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataProntiAdp(String dataPronti) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "dataPronti", dataPronti, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
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
/*     */   public String getDettaglioPctIdAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "dettaglioPctId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDettaglioPctIdAdp(String dettaglioPctId) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "dettaglioPctId", dettaglioPctId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPctCambioTermineAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "pctCambioTermine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPctCambioTermineAdp(String pctCambioTermine) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "pctCambioTermine", pctCambioTermine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPctControvaloreTermineAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "pctControvaloreTermine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPctControvaloreTermineAdp(String pctControvaloreTermine) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "pctControvaloreTermine", pctControvaloreTermine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPctDataTermineAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "pctDataTermine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPctDataTermineAdp(String pctDataTermine) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "pctDataTermine", pctDataTermine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPctPrezzoTermineAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "pctPrezzoTermine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPctPrezzoTermineAdp(String pctPrezzoTermine) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "pctPrezzoTermine", pctPrezzoTermine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrezzoProntiAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "prezzoPronti", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrezzoProntiAdp(String prezzoPronti) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "prezzoPronti", prezzoPronti, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getQuantitaAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "quantita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setQuantitaAdp(String quantita) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "quantita", quantita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDettaglioPctAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */