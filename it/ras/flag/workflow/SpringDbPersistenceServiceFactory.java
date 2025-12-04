/*    */ package it.ras.flag.workflow;
/*    */ 
/*    */ import org.jbpm.persistence.db.DbPersistenceService;
/*    */ import org.jbpm.persistence.db.DbPersistenceServiceFactory;
/*    */ import org.jbpm.svc.Service;
/*    */ import org.springframework.beans.BeansException;
/*    */ import org.springframework.beans.factory.BeanFactory;
/*    */ import org.springframework.beans.factory.BeanFactoryAware;
/*    */ import org.springframework.beans.factory.InitializingBean;
/*    */ import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
/*    */ import org.springframework.orm.hibernate3.SessionFactoryUtils;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SpringDbPersistenceServiceFactory
/*    */   extends DbPersistenceServiceFactory
/*    */   implements InitializingBean, BeanFactoryAware
/*    */ {
/*    */   private String localSessionFactoryBeanString;
/*    */   private BeanFactory beanFactory;
/*    */   
/*    */   public void setLocalSessionFactoryBeanString(String localSessionFactoryBeanString) {
/* 29 */     if (localSessionFactoryBeanString.startsWith("&")) {
/* 30 */       this.localSessionFactoryBeanString = localSessionFactoryBeanString;
/*    */     } else {
/* 32 */       this.localSessionFactoryBeanString = "&" + localSessionFactoryBeanString;
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public DbPersistenceService createPersistenceService() {
/* 38 */     return null;
/*    */   }
/*    */   
/*    */   public Service openService() {
/* 42 */     DbPersistenceService dbPersistenceService1 = createPersistenceService();
/* 43 */     DbPersistenceService persistenceService = dbPersistenceService1;
/*    */     
/* 45 */     persistenceService.setSession(SessionFactoryUtils.getSession(getSessionFactory(), true));
/*    */     
/* 47 */     return (Service)dbPersistenceService1;
/*    */   }
/*    */   
/*    */   public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
/* 51 */     this.beanFactory = beanFactory;
/*    */   }
/*    */ 
/*    */   
/*    */   public void afterPropertiesSet() throws Exception {
/* 56 */     setConfiguration(((LocalSessionFactoryBean)this.beanFactory.getBean(this.localSessionFactoryBeanString)).getConfiguration());
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\SpringDbPersistenceServiceFactory.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */