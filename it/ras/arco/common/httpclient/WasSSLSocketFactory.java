/*    */ package it.ras.arco.common.httpclient;
/*    */ 
/*    */ import java.net.MalformedURLException;
/*    */ import java.net.URL;
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
/*    */ public class WasSSLSocketFactory
/*    */   extends AbstractSSLSocketFactory
/*    */ {
/*    */   protected String getKeystorePwd() {
/* 19 */     return System.getProperty("com.ibm.ssl.keyStorePassword");
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected URL getKeystoreUrl() {
/* 26 */     String url = "file:" + System.getProperty("com.ibm.ssl.keyStore");
/*    */     try {
/* 28 */       return new URL(url);
/* 29 */     } catch (MalformedURLException muex) {
/* 30 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected URL getTrustoreUrl() {
/* 38 */     String url = "file:" + System.getProperty("com.ibm.ssl.trustStore");
/*    */     try {
/* 40 */       return new URL(url);
/* 41 */     } catch (MalformedURLException muex) {
/* 42 */       return null;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected String getTruststorePwd() {
/* 50 */     return System.getProperty("com.ibm.ssl.trustStorePassword");
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\httpclient\WasSSLSocketFactory.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */