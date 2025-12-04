/*    */ package it.ras.arco.common.httpclient;
/*    */ 
/*    */ import java.security.cert.CertificateException;
/*    */ import java.security.cert.X509Certificate;
/*    */ import javax.net.ssl.X509TrustManager;
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
/*    */ public class AuthSSLX509TrustManager
/*    */   implements X509TrustManager
/*    */ {
/* 20 */   private X509TrustManager defaultTrustManager = null;
/*    */ 
/*    */   
/* 23 */   private static final Log LOG = LogFactory.getLog(AuthSSLX509TrustManager.class);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public AuthSSLX509TrustManager(X509TrustManager defaultTrustManager) {
/* 31 */     if (defaultTrustManager == null) {
/* 32 */       throw new IllegalArgumentException("Trust manager may not be null");
/*    */     }
/* 34 */     this.defaultTrustManager = defaultTrustManager;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void checkClientTrusted(X509Certificate[] certificates, String authType) throws CertificateException {
/* 43 */     if (LOG.isInfoEnabled() && certificates != null) {
/* 44 */       for (int c = 0; c < certificates.length; c++) {
/* 45 */         X509Certificate cert = certificates[c];
/* 46 */         LOG.info(" Client certificate " + (c + 1) + ":");
/* 47 */         LOG.info("  Subject DN: " + cert.getSubjectDN());
/* 48 */         LOG.info("  Signature Algorithm: " + cert.getSigAlgName());
/* 49 */         LOG.info("  Valid from: " + cert.getNotBefore());
/* 50 */         LOG.info("  Valid until: " + cert.getNotAfter());
/* 51 */         LOG.info("  Issuer: " + cert.getIssuerDN());
/*    */       } 
/*    */     }
/* 54 */     this.defaultTrustManager.checkClientTrusted(certificates, authType);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void checkServerTrusted(X509Certificate[] certificates, String authType) throws CertificateException {
/* 63 */     if (LOG.isInfoEnabled() && certificates != null) {
/* 64 */       for (int c = 0; c < certificates.length; c++) {
/* 65 */         X509Certificate cert = certificates[c];
/* 66 */         LOG.info(" Server certificate " + (c + 1) + ":");
/* 67 */         LOG.info("  Subject DN: " + cert.getSubjectDN());
/* 68 */         LOG.info("  Signature Algorithm: " + cert.getSigAlgName());
/* 69 */         LOG.info("  Valid from: " + cert.getNotBefore());
/* 70 */         LOG.info("  Valid until: " + cert.getNotAfter());
/* 71 */         LOG.info("  Issuer: " + cert.getIssuerDN());
/*    */       } 
/*    */     }
/* 74 */     this.defaultTrustManager.checkServerTrusted(certificates, authType);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public X509Certificate[] getAcceptedIssuers() {
/* 81 */     return this.defaultTrustManager.getAcceptedIssuers();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\httpclient\AuthSSLX509TrustManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */