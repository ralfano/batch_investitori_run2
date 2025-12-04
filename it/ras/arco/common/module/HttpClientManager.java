/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import org.apache.commons.httpclient.Credentials;
/*     */ import org.apache.commons.httpclient.HttpClient;
/*     */ import org.apache.commons.httpclient.HttpConnectionManager;
/*     */ import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
/*     */ import org.apache.commons.httpclient.ProxyHost;
/*     */ import org.apache.commons.httpclient.UsernamePasswordCredentials;
/*     */ import org.apache.commons.httpclient.auth.AuthScope;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class HttpClientManager
/*     */   implements IHttpClientManager
/*     */ {
/*  21 */   private static final Log log = LogFactory.getLog(HttpClientManager.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private HttpClient httpClient;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String proxyHost;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  43 */   private int proxyPort = 80;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String proxyUsername;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String proxyPassword;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   private int connectionTimeout = 500;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  63 */   private int maxConnectionsPerHost = 10;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public HttpClient getClient() {
/*  69 */     return this.httpClient;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMaxConnectionsPerHost(int value) {
/*  76 */     this.maxConnectionsPerHost = value;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setConnectionTimeout(int timeout) {
/*  83 */     this.connectionTimeout = timeout;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProxyHost(String proxyHost) {
/*  90 */     this.proxyHost = proxyHost;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProxyPort(int proxyPort) {
/*  97 */     this.proxyPort = proxyPort;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProxyUsername(String username) {
/* 104 */     this.proxyUsername = username;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProxyPassword(String password) {
/* 111 */     this.proxyPassword = password;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void init() throws Exception {
/* 119 */     MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
/* 120 */     connectionManager.getParams().setDefaultMaxConnectionsPerHost(this.maxConnectionsPerHost);
/*     */     
/* 122 */     connectionManager.getParams().setMaxTotalConnections(this.maxConnectionsPerHost * 10);
/*     */     
/* 124 */     this.httpClient = new HttpClient((HttpConnectionManager)connectionManager);
/*     */ 
/*     */     
/* 127 */     this.httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(this.connectionTimeout);
/*     */ 
/*     */ 
/*     */     
/* 131 */     if (this.proxyHost != null) {
/* 132 */       ProxyHost proxy = new ProxyHost(this.proxyHost, this.proxyPort);
/* 133 */       this.httpClient.getHostConfiguration().setProxyHost(proxy);
/* 134 */       if (this.proxyUsername != null && this.proxyPassword != null) {
/* 135 */         UsernamePasswordCredentials usernamePasswordCredentials = new UsernamePasswordCredentials(this.proxyUsername, this.proxyPassword);
/*     */         
/* 137 */         this.httpClient.getState().setProxyCredentials(AuthScope.ANY, (Credentials)usernamePasswordCredentials);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 142 */     if (log.isInfoEnabled()) {
/* 143 */       log.info("init() call -> httpClient=" + this.httpClient);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() throws Exception {
/* 151 */     ((MultiThreadedHttpConnectionManager)this.httpClient.getHttpConnectionManager()).shutdown();
/*     */     
/* 153 */     this.httpClient = null;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\HttpClientManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */