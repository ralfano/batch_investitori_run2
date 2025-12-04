/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.adapter.AdapterUtils;
/*    */ import it.ras.flag.bean.adapter.IRasORMAdapter;
/*    */ import java.text.NumberFormat;
/*    */ import java.text.SimpleDateFormat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FinAbstractParametrizedBeanAdapterBase
/*    */   extends FinAbstractParametrizedBean
/*    */   implements IRasORMAdapter
/*    */ {
/*    */   public String getStringProperty(String property) {
/* 18 */     return null;
/*    */   }
/*    */   
/*    */   public Object getProperty(String property) {
/* 22 */     return null;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setStringProperty(String property, String value) {}
/*    */ 
/*    */   
/*    */   public void setProperty(String property, Object value) {}
/*    */   
/*    */   public SimpleDateFormat getDateFormat(String property) {
/* 32 */     return null;
/*    */   }
/*    */   
/*    */   public NumberFormat getNumericFormat(String property) {
/* 36 */     return null;
/*    */   }
/*    */   
/*    */   public Object getAdapted() {
/* 40 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getDataInserimentoAdp() {
/* 47 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 48 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*    */   }
/*    */   
/*    */   public void setDataInserimentoAdp(String dataInserimento) {
/* 52 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 53 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*    */   }
/*    */   
/*    */   public String getDataUltimaModificaAdp() {
/* 57 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 58 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*    */   }
/*    */   
/*    */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 62 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 63 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*    */   }
/*    */   
/*    */   public String getDataUltimaModificaSlaveAdp() {
/* 67 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 68 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*    */   }
/*    */   
/*    */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 72 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 73 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAbstractParametrizedBeanAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */