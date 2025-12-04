/*    */ package it.ras.flag.workflow;
/*    */ 
/*    */ import org.jbpm.JbpmConfiguration;
/*    */ import org.jbpm.configuration.ObjectFactory;
/*    */ import org.springframework.beans.factory.FactoryBean;
/*    */ 
/*    */ public class JbpmConfigurationFactoryBean
/*    */   implements FactoryBean {
/*    */   private ObjectFactory objectFactory;
/*    */   
/*    */   public void setObjectFactory(ObjectFactory objectFactory) {
/* 12 */     this.objectFactory = objectFactory;
/*    */   }
/*    */   
/*    */   public Class getObjectType() {
/* 16 */     return JbpmConfiguration.class;
/*    */   }
/*    */   
/*    */   public boolean isSingleton() {
/* 20 */     return true;
/*    */   }
/*    */   
/*    */   public Object getObject() throws Exception {
/* 24 */     JbpmConfiguration.Configs.setDefaultObjectFactory(this.objectFactory);
/* 25 */     return JbpmConfiguration.getInstance();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\JbpmConfigurationFactoryBean.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */