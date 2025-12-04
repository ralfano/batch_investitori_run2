/*    */ package it.ras.arco.common.module;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.exolab.castor.mapping.Mapping;
/*    */ import org.springframework.beans.factory.FactoryBean;
/*    */ import org.springframework.core.io.ClassPathResource;
/*    */ import org.xml.sax.InputSource;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CastorMappingFactoryBean
/*    */   implements FactoryBean
/*    */ {
/* 33 */   private List mappingFiles = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List getMappingFiles() {
/* 39 */     return this.mappingFiles;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setMappingFiles(List mappingFiles) {
/* 47 */     this.mappingFiles = mappingFiles;
/*    */   }
/*    */   
/* 50 */   private Mapping mapping = null;
/*    */   
/*    */   public void init() throws Exception {
/* 53 */     if (this.mappingFiles != null && !this.mappingFiles.isEmpty()) {
/* 54 */       this.mapping = new Mapping();
/* 55 */       Iterator iter = this.mappingFiles.iterator();
/* 56 */       while (iter.hasNext()) {
/* 57 */         String fileName = iter.next();
/* 58 */         ClassPathResource classPathResource = new ClassPathResource(fileName);
/* 59 */         this.mapping.loadMapping(new InputSource(classPathResource.getInputStream()));
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public void destroy() throws Exception {
/* 65 */     this.mappingFiles = null;
/* 66 */     this.mapping = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object getObject() throws Exception {
/* 73 */     return this.mapping;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Class getObjectType() {
/* 80 */     return Mapping.class;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean isSingleton() {
/* 87 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\CastorMappingFactoryBean.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */