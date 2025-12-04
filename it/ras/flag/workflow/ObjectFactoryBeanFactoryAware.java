/*    */ package it.ras.flag.workflow;
/*    */ 
/*    */ import java.util.Map;
/*    */ import org.jbpm.configuration.ObjectFactory;
/*    */ import org.springframework.beans.BeansException;
/*    */ import org.springframework.beans.factory.BeanFactory;
/*    */ import org.springframework.beans.factory.BeanFactoryAware;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ObjectFactoryBeanFactoryAware
/*    */   implements ObjectFactory, BeanFactoryAware
/*    */ {
/* 14 */   private BeanFactory beanFactory = null;
/*    */   
/* 16 */   private Map resources = null;
/*    */   
/*    */   public void setResources(Map resources) {
/* 19 */     this.resources = resources;
/*    */   }
/*    */   
/*    */   private Object getResource(String name) {
/* 23 */     return this.resources.get(name);
/*    */   }
/*    */   
/*    */   private boolean hasResource(String name) {
/* 27 */     return this.resources.containsKey(name);
/*    */   }
/*    */   
/*    */   public Object createObject(String name) {
/* 31 */     Object bean = getResource(name);
/* 32 */     if (bean == null) {
/* 33 */       bean = this.beanFactory.getBean(name);
/*    */     }
/* 35 */     return bean;
/*    */   }
/*    */   
/*    */   public boolean hasObject(String name) {
/* 39 */     boolean found = hasResource(name);
/* 40 */     if (!found) {
/* 41 */       found = this.beanFactory.containsBean(name);
/*    */     }
/* 43 */     return found;
/*    */   }
/*    */   
/*    */   public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
/* 47 */     this.beanFactory = beanFactory;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\ObjectFactoryBeanFactoryAware.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */