/*     */ package it.ras.arco.common.httpclient;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.net.URL;
/*     */ import org.apache.commons.lang.StringUtils;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.springframework.beans.BeansException;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.context.ApplicationContextAware;
/*     */ import org.springframework.core.io.Resource;
/*     */ import org.springframework.core.io.ResourceLoader;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WarSSLSocketFactory
/*     */   extends AbstractSSLSocketFactory
/*     */   implements ApplicationContextAware
/*     */ {
/*  24 */   private static final Log log = LogFactory.getLog(WarSSLSocketFactory.class);
/*     */   
/*  26 */   private String keystorePwd = null;
/*     */   
/*  28 */   private String keystore = null;
/*     */   
/*  30 */   private String truststorePwd = null;
/*     */   
/*  32 */   private String truststore = null;
/*     */ 
/*     */ 
/*     */   
/*     */   private ResourceLoader loader;
/*     */ 
/*     */ 
/*     */   
/*     */   public void setApplicationContext(ApplicationContext ctx) throws BeansException {
/*  41 */     this.loader = (ResourceLoader)ctx;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected URL getKeystoreUrl() {
/*  48 */     URL url = null;
/*  49 */     if (StringUtils.isNotBlank(this.keystore)) {
/*  50 */       Resource res = this.loader.getResource(this.keystore);
/*     */       try {
/*  52 */         url = res.getURL();
/*  53 */       } catch (IOException ioex) {
/*  54 */         if (log.isErrorEnabled()) {
/*  55 */           log.error(ioex.getMessage(), ioex);
/*     */         }
/*     */       } 
/*     */     } 
/*  59 */     return url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected URL getTrustoreUrl() {
/*  66 */     URL url = null;
/*  67 */     if (StringUtils.isNotBlank(this.truststorePwd)) {
/*  68 */       Resource res = this.loader.getResource(this.truststore);
/*     */       try {
/*  70 */         url = res.getURL();
/*  71 */       } catch (IOException ioex) {
/*  72 */         if (log.isErrorEnabled()) {
/*  73 */           log.error(ioex.getMessage(), ioex);
/*     */         }
/*     */       } 
/*     */     } 
/*  77 */     return url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getKeystore() {
/*  84 */     return this.keystore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeystore(String keyStore) {
/*  92 */     this.keystore = keyStore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getKeystorePwd() {
/*  99 */     return this.keystorePwd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setKeystorePwd(String keyStorePwd) {
/* 107 */     this.keystorePwd = keyStorePwd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTruststore() {
/* 114 */     return this.truststore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTruststore(String trustStore) {
/* 122 */     this.truststore = trustStore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTruststorePwd() {
/* 129 */     return this.truststorePwd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTruststorePwd(String trustStorePwd) {
/* 137 */     this.truststorePwd = trustStorePwd;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\httpclient\WarSSLSocketFactory.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */