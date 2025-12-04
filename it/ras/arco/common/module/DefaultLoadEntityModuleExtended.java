/*    */ package it.ras.arco.common.module;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.module.DefaultLoadEntityModule;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import org.apache.commons.logging.Log;
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
/*    */ public class DefaultLoadEntityModuleExtended
/*    */   extends DefaultLoadEntityModule
/*    */ {
/* 26 */   private String beanKey = "";
/*    */ 
/*    */   
/* 29 */   private Log log = LogFactory.getLog(DefaultLoadEntityModuleExtended.class);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*    */     try {
/* 40 */       Object bean = inputMap.getAppl(this.beanKey);
/*    */       
/* 42 */       String classpath = bean.getClass().getName().split("\\$")[0];
/*    */       
/* 44 */       setClassPath(classpath);
/*    */     }
/* 46 */     catch (Exception e) {
/* 47 */       if (this.log.isErrorEnabled())
/* 48 */         this.log.error(e.getMessage()); 
/* 49 */       throw new RasServiceException(e);
/*    */     } 
/*    */     
/* 52 */     return super.service(inputMap);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getBeanKey() {
/* 60 */     return this.beanKey;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setBeanKey(String beanKey) {
/* 67 */     this.beanKey = beanKey;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\DefaultLoadEntityModuleExtended.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */