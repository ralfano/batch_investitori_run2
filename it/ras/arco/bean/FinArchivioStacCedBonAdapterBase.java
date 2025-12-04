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
/*     */ public class FinArchivioStacCedBonAdapterBase
/*     */   extends FinArchivioStacCedBon
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
/*     */   public String getArchivioStacCedBonIdAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "archivioStacCedBonId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setArchivioStacCedBonIdAdp(String archivioStacCedBonId) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "archivioStacCedBonId", archivioStacCedBonId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getContrattoIdAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "contrattoId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setContrattoIdAdp(String contrattoId) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "contrattoId", contrattoId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInizioErogazioneAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "dataInizioErogazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInizioErogazioneAdp(String dataInizioErogazione) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "dataInizioErogazione", dataInizioErogazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoEnteAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "importoEnte", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoEnteAdp(String importoEnte) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "importoEnte", importoEnte, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPercentualeEnteAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "percentualeEnte", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPercentualeEnteAdp(String percentualeEnte) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "percentualeEnte", percentualeEnte, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinArchivioStacCedBonAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */