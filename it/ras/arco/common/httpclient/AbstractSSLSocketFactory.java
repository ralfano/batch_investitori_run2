/*     */ package it.ras.arco.common.httpclient;
/*     */ 
/*     */ import java.io.IOException;
/*     */ import java.net.InetAddress;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.net.Socket;
/*     */ import java.net.SocketAddress;
/*     */ import java.net.URL;
/*     */ import java.net.UnknownHostException;
/*     */ import java.security.GeneralSecurityException;
/*     */ import java.security.KeyStore;
/*     */ import java.security.KeyStoreException;
/*     */ import java.security.NoSuchAlgorithmException;
/*     */ import java.security.UnrecoverableKeyException;
/*     */ import java.security.cert.Certificate;
/*     */ import java.security.cert.CertificateException;
/*     */ import java.security.cert.X509Certificate;
/*     */ import java.util.Enumeration;
/*     */ import javax.net.SocketFactory;
/*     */ import javax.net.ssl.KeyManager;
/*     */ import javax.net.ssl.KeyManagerFactory;
/*     */ import javax.net.ssl.SSLContext;
/*     */ import javax.net.ssl.TrustManager;
/*     */ import javax.net.ssl.TrustManagerFactory;
/*     */ import javax.net.ssl.X509TrustManager;
/*     */ import org.apache.commons.httpclient.ConnectTimeoutException;
/*     */ import org.apache.commons.httpclient.params.HttpConnectionParams;
/*     */ import org.apache.commons.httpclient.protocol.Protocol;
/*     */ import org.apache.commons.httpclient.protocol.ProtocolSocketFactory;
/*     */ import org.apache.commons.httpclient.protocol.SecureProtocolSocketFactory;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.springframework.beans.factory.InitializingBean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractSSLSocketFactory
/*     */   implements SecureProtocolSocketFactory, InitializingBean
/*     */ {
/*  46 */   private static final Log LOG = LogFactory.getLog(AbstractSSLSocketFactory.class);
/*     */ 
/*     */   
/*     */   public static final String HTTPS = "https";
/*     */   
/*  51 */   private URL keystoreUrl = null;
/*     */   
/*  53 */   private String keystorePwd = null;
/*     */   
/*  55 */   private URL trustoreUrl = null;
/*     */   
/*  57 */   private String truststorePwd = null;
/*     */   
/*  59 */   private SSLContext sslcontext = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void afterPropertiesSet() throws Exception {
/*  68 */     this.keystorePwd = getKeystorePwd();
/*  69 */     this.keystoreUrl = getKeystoreUrl();
/*  70 */     this.truststorePwd = getTruststorePwd();
/*  71 */     this.trustoreUrl = getTrustoreUrl();
/*     */     
/*  73 */     this.sslcontext = createSSLContext();
/*     */     
/*  75 */     Protocol https = new Protocol("https", (ProtocolSocketFactory)this, 443);
/*  76 */     Protocol.registerProtocol("https", https);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static KeyStore createKeyStore(URL url, String password) throws KeyStoreException, NoSuchAlgorithmException, CertificateException, IOException {
/* 102 */     if (url == null) {
/* 103 */       throw new IllegalArgumentException("Keystore url may not be null");
/*     */     }
/* 105 */     LOG.debug("Initializing key store");
/* 106 */     KeyStore keystore = KeyStore.getInstance("jks");
/* 107 */     keystore.load(url.openStream(), (password != null) ? password.toCharArray() : null);
/*     */     
/* 109 */     return keystore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static KeyManager[] createKeyManagers(KeyStore keystore, String password) throws KeyStoreException, NoSuchAlgorithmException, UnrecoverableKeyException {
/* 115 */     if (keystore == null) {
/* 116 */       throw new IllegalArgumentException("Keystore may not be null");
/*     */     }
/* 118 */     LOG.debug("Initializing key manager");
/* 119 */     KeyManagerFactory kmfactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
/*     */     
/* 121 */     kmfactory.init(keystore, (password != null) ? password.toCharArray() : null);
/*     */     
/* 123 */     return kmfactory.getKeyManagers();
/*     */   }
/*     */ 
/*     */   
/*     */   private static TrustManager[] createTrustManagers(KeyStore keystore) throws KeyStoreException, NoSuchAlgorithmException {
/* 128 */     if (keystore == null) {
/* 129 */       throw new IllegalArgumentException("Keystore may not be null");
/*     */     }
/* 131 */     LOG.debug("Initializing trust manager");
/* 132 */     TrustManagerFactory tmfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
/*     */     
/* 134 */     tmfactory.init(keystore);
/* 135 */     TrustManager[] trustmanagers = tmfactory.getTrustManagers();
/* 136 */     for (int i = 0; i < trustmanagers.length; i++) {
/* 137 */       if (trustmanagers[i] instanceof X509TrustManager) {
/* 138 */         trustmanagers[i] = new AuthSSLX509TrustManager((X509TrustManager)trustmanagers[i]);
/*     */       }
/*     */     } 
/*     */     
/* 142 */     return trustmanagers;
/*     */   }
/*     */   
/*     */   private SSLContext createSSLContext() {
/*     */     try {
/* 147 */       KeyManager[] keymanagers = null;
/* 148 */       TrustManager[] trustmanagers = null;
/* 149 */       if (this.keystoreUrl != null) {
/* 150 */         KeyStore keystore = createKeyStore(this.keystoreUrl, this.keystorePwd);
/*     */         
/* 152 */         if (LOG.isDebugEnabled()) {
/* 153 */           Enumeration aliases = keystore.aliases();
/* 154 */           while (aliases.hasMoreElements()) {
/* 155 */             String alias = aliases.nextElement();
/* 156 */             Certificate[] certs = keystore.getCertificateChain(alias);
/*     */             
/* 158 */             if (certs != null) {
/* 159 */               LOG.debug("Certificate chain '" + alias + "':");
/* 160 */               for (int c = 0; c < certs.length; c++) {
/* 161 */                 if (certs[c] instanceof X509Certificate) {
/* 162 */                   X509Certificate cert = (X509Certificate)certs[c];
/* 163 */                   LOG.debug(" Certificate " + (c + 1) + ":");
/* 164 */                   LOG.debug("  Subject DN: " + cert.getSubjectDN());
/*     */                   
/* 166 */                   LOG.debug("  Signature Algorithm: " + cert.getSigAlgName());
/*     */                   
/* 168 */                   LOG.debug("  Valid from: " + cert.getNotBefore());
/*     */                   
/* 170 */                   LOG.debug("  Valid until: " + cert.getNotAfter());
/*     */                   
/* 172 */                   LOG.debug("  Issuer: " + cert.getIssuerDN());
/*     */                 } 
/*     */               } 
/*     */             } 
/*     */           } 
/*     */         } 
/*     */ 
/*     */         
/* 180 */         keymanagers = createKeyManagers(keystore, this.keystorePwd);
/*     */       } 
/* 182 */       if (this.trustoreUrl != null) {
/* 183 */         KeyStore keystore = createKeyStore(this.trustoreUrl, this.truststorePwd);
/*     */         
/* 185 */         if (LOG.isDebugEnabled()) {
/* 186 */           Enumeration aliases = keystore.aliases();
/* 187 */           while (aliases.hasMoreElements()) {
/* 188 */             String alias = aliases.nextElement();
/* 189 */             LOG.debug("Trusted certificate '" + alias + "':");
/* 190 */             Certificate trustedcert = keystore.getCertificate(alias);
/*     */             
/* 192 */             if (trustedcert != null && trustedcert instanceof X509Certificate) {
/*     */               
/* 194 */               X509Certificate cert = (X509Certificate)trustedcert;
/* 195 */               LOG.debug("  Subject DN: " + cert.getSubjectDN());
/* 196 */               LOG.debug("  Signature Algorithm: " + cert.getSigAlgName());
/*     */               
/* 198 */               LOG.debug("  Valid from: " + cert.getNotBefore());
/* 199 */               LOG.debug("  Valid until: " + cert.getNotAfter());
/* 200 */               LOG.debug("  Issuer: " + cert.getIssuerDN());
/*     */             } 
/*     */           } 
/*     */         } 
/* 204 */         trustmanagers = createTrustManagers(keystore);
/*     */       } 
/* 206 */       SSLContext sslcontext = SSLContext.getInstance("SSL");
/* 207 */       sslcontext.init(keymanagers, trustmanagers, null);
/* 208 */       return sslcontext;
/* 209 */     } catch (NoSuchAlgorithmException e) {
/* 210 */       LOG.error(e.getMessage(), e);
/* 211 */       throw new AuthSSLInitializationError("Unsupported algorithm exception: " + e.getMessage());
/*     */     }
/* 213 */     catch (KeyStoreException e) {
/* 214 */       LOG.error(e.getMessage(), e);
/* 215 */       throw new AuthSSLInitializationError("Keystore exception: " + e.getMessage());
/*     */     }
/* 217 */     catch (GeneralSecurityException e) {
/* 218 */       LOG.error(e.getMessage(), e);
/* 219 */       throw new AuthSSLInitializationError("Key management exception: " + e.getMessage());
/*     */     }
/* 221 */     catch (IOException e) {
/* 222 */       LOG.error(e.getMessage(), e);
/* 223 */       throw new AuthSSLInitializationError("I/O error reading keystore/truststore file: " + e.getMessage());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private SSLContext getSSLContext() {
/* 230 */     return this.sslcontext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Socket createSocket(String host, int port, InetAddress localAddress, int localPort, HttpConnectionParams params) throws IOException, UnknownHostException, ConnectTimeoutException {
/* 266 */     if (params == null) {
/* 267 */       throw new IllegalArgumentException("Parameters may not be null");
/*     */     }
/* 269 */     int timeout = params.getConnectionTimeout();
/* 270 */     SocketFactory socketfactory = getSSLContext().getSocketFactory();
/* 271 */     if (timeout == 0) {
/* 272 */       return socketfactory.createSocket(host, port, localAddress, localPort);
/*     */     }
/*     */     
/* 275 */     Socket socket = socketfactory.createSocket();
/* 276 */     SocketAddress localaddr = new InetSocketAddress(localAddress, localPort);
/*     */     
/* 278 */     SocketAddress remoteaddr = new InetSocketAddress(host, port);
/* 279 */     socket.bind(localaddr);
/* 280 */     socket.connect(remoteaddr, timeout);
/* 281 */     return socket;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Socket createSocket(String host, int port, InetAddress clientHost, int clientPort) throws IOException, UnknownHostException {
/* 290 */     return getSSLContext().getSocketFactory().createSocket(host, port, clientHost, clientPort);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
/* 299 */     return getSSLContext().getSocketFactory().createSocket(host, port);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Socket createSocket(Socket socket, String host, int port, boolean autoClose) throws IOException, UnknownHostException {
/* 307 */     return getSSLContext().getSocketFactory().createSocket(socket, host, port, autoClose);
/*     */   }
/*     */   
/*     */   protected abstract String getKeystorePwd();
/*     */   
/*     */   protected abstract URL getKeystoreUrl();
/*     */   
/*     */   protected abstract URL getTrustoreUrl();
/*     */   
/*     */   protected abstract String getTruststorePwd();
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\httpclient\AbstractSSLSocketFactory.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */