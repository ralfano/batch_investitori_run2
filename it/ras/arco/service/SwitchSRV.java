/*    */ package it.ras.arco.service;
/*    */ 
/*    */ import it.ras.arco.bean.IGSTDInitVisitor;
/*    */ import it.ras.arco.bean.IGSTDInitializable;
/*    */ import it.ras.arco.cp.bean.GSTDInitializer;
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.exception.RasValidationSignal;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SwitchSRV
/*    */   extends CatalogoProdottiSRV
/*    */ {
/*    */   public static final String REGOLA_DA_MAP_CONTAINER_KEY = "ENTITA_DA_INSERIRE";
/*    */   public static final String RISULTATO_SALVATAGGIO_MAP_CONTAINER_KEY = "RISULTATO_QUERY";
/*    */   
/*    */   protected boolean functionalValidation(MapContainer mc) throws RasServiceException {
/* 35 */     RasServiceException ex = new RasServiceException();
/* 36 */     RasValidationSignal vs = new RasValidationSignal("it.ras.arco.cp.segnalazioni.censimento.warning.conferma");
/* 37 */     ex.addWarning(vs);
/* 38 */     throw ex;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 47 */     RasORMBean bean = (RasORMBean)map.getAppl("ENTITA_DA_INSERIRE");
/*    */     
/* 49 */     LogFactory.getLog(getClass()).debug("CP: Inizializzazione campi standard di regola DA ed eventuali regole A.");
/* 50 */     GSTDInitializer gstdi = new GSTDInitializer();
/* 51 */     ((IGSTDInitializable)bean).accept((IGSTDInitVisitor)gstdi);
/*    */     
/* 53 */     return getModuleManager().execModule(getModuloSingleEntity(), map);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\SwitchSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */