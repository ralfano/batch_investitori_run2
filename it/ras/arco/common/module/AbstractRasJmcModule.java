/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.IRasModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.io.InputStream;
/*     */ import org.apache.commons.httpclient.Header;
/*     */ import org.apache.commons.httpclient.HttpMethod;
/*     */ import org.apache.commons.httpclient.NameValuePair;
/*     */ import org.apache.commons.httpclient.methods.GetMethod;
/*     */ import org.apache.commons.httpclient.methods.PostMethod;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.springframework.beans.factory.DisposableBean;
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
/*     */ public abstract class AbstractRasJmcModule
/*     */   implements IRasModule, InitializingBean, DisposableBean
/*     */ {
/*  43 */   private static Log log = LogFactory.getLog(AbstractRasJmcModule.class);
/*     */ 
/*     */   
/*     */   public static final String USER_ID_OPERATORE = "USER_ID_OPERATORE";
/*     */ 
/*     */   
/*     */   public static final String PASSWORD_OPERATORE = "PASSWORD_OPERATORE";
/*     */ 
/*     */   
/*     */   public static final String JMC_REQUEST_PARAMETER = "JMCRequest";
/*     */ 
/*     */   
/*     */   public static final String SESSION_COOKIE = "JSESSIONID";
/*     */ 
/*     */   
/*     */   public static final String ESITO = "ESITO";
/*     */   
/*     */   public static final String CANALE_INTERNET = "INT";
/*     */   
/*     */   public static final String CANALE_MIDDLE_OFFICE = "MOF";
/*     */   
/*     */   public static final String CODICE_BANCA = "00080";
/*     */   
/*     */   private static final int HTTP_POST = 0;
/*     */   
/*     */   private static final int HTTP_GET = 1;
/*     */   
/*  70 */   private IHttpClientManager httpClientManager = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public IHttpClientManager getHttpClientManager() {
/*  76 */     return this.httpClientManager;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHttpClientManager(IHttpClientManager httpClientManager) {
/*  84 */     this.httpClientManager = httpClientManager;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*     */     PostMethod postMethod;
/*     */     GetMethod getMethod;
/*  92 */     HttpMethod method = null;
/*  93 */     switch (this.httpMethod) {
/*     */       case 0:
/*  95 */         postMethod = new PostMethod(this.url);
/*     */         break;
/*     */       case 1:
/*  98 */         getMethod = new GetMethod(this.url);
/*     */         break;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     getMethod.getParams().setCookiePolicy("ignoreCookies");
/*     */ 
/*     */     
/* 108 */     getMethod.setPath(this.path);
/*     */ 
/*     */ 
/*     */     
/* 112 */     Object[] values = prepareInput(inputMap);
/* 113 */     String[] valuesAsString = doConvertInput(values);
/*     */ 
/*     */ 
/*     */     
/* 117 */     NameValuePair[] pairs = getQueryParameters(valuesAsString);
/* 118 */     if (pairs != null) {
/* 119 */       getMethod.setQueryString(pairs);
/*     */     }
/*     */ 
/*     */     
/* 123 */     Header[] cookies = getRequestCookies(inputMap);
/* 124 */     Header requestCookie = null;
/* 125 */     for (int c = 0; cookies != null && c < cookies.length; c++) {
/* 126 */       requestCookie = new Header("Cookie", cookies[c].getValue());
/* 127 */       getMethod.setRequestHeader(requestCookie);
/*     */     } 
/*     */ 
/*     */     
/* 131 */     InputStream body = null;
/* 132 */     MapContainer outMap = null;
/*     */     try {
/* 134 */       this.httpClientManager.getClient().executeMethod((HttpMethod)getMethod);
/*     */       
/* 136 */       if (getMethod.getStatusCode() == 200) {
/*     */         
/* 138 */         body = getMethod.getResponseBodyAsStream();
/*     */         
/* 140 */         Object bodyObj = doProcessRespondeBody(body);
/* 141 */         outMap = prepareOutput(bodyObj);
/*     */ 
/*     */         
/* 144 */         Header[] headers = getMethod.getResponseHeaders();
/* 145 */         processResponseCookies(headers, outMap);
/*     */         
/* 147 */         if (body != null) {
/* 148 */           body.close();
/*     */         }
/*     */       } else {
/* 151 */         if (log.isErrorEnabled()) {
/* 152 */           log.error("HttpStaus non ok. (" + getMethod.getStatusCode() + ")");
/*     */         }
/*     */         
/* 155 */         throw new RasServiceException("it.ras.arco.ordini.sec.status.ko");
/*     */       }
/*     */     
/* 158 */     } catch (RasServiceException rex) {
/* 159 */       throw rex;
/* 160 */     } catch (Exception ex) {
/* 161 */       if (log.isErrorEnabled()) {
/* 162 */         log.error(getClass().getName(), ex);
/* 163 */         throw new RasServiceException(ex);
/*     */       } 
/*     */     } finally {
/* 166 */       if (getMethod != null) {
/* 167 */         getMethod.releaseConnection();
/*     */       }
/*     */     } 
/*     */     
/* 171 */     return outMap;
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
/*     */   protected NameValuePair[] getQueryParameters(String[] values) {
/* 193 */     NameValuePair[] pairs = null;
/*     */     
/* 195 */     if (values != null) {
/* 196 */       if (this.paramNames == null) {
/* 197 */         throw new NullPointerException("paramNames is null");
/*     */       }
/*     */       
/* 200 */       if (values.length != this.paramNames.length) {
/* 201 */         throw new IllegalArgumentException("Il numero di parametri configurati è diverso dal numero di parametri forniti");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 206 */       pairs = new NameValuePair[this.paramNames.length];
/* 207 */       for (int i = 0; i < pairs.length; i++) {
/* 208 */         pairs[i] = new NameValuePair(this.paramNames[i], values[i]);
/*     */       }
/*     */     } 
/* 211 */     return pairs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void afterPropertiesSet() throws Exception {
/* 219 */     if (this.url == null) {
/* 220 */       throw new NullPointerException("url nulla");
/*     */     }
/*     */     
/* 223 */     if (this.path == null) {
/* 224 */       throw new NullPointerException("path nulla");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() throws Exception {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 238 */   private int httpMethod = 0;
/*     */ 
/*     */ 
/*     */   
/*     */   private String url;
/*     */ 
/*     */   
/*     */   private String path;
/*     */ 
/*     */   
/*     */   private String[] paramNames;
/*     */ 
/*     */   
/*     */   private String _beanName;
/*     */ 
/*     */ 
/*     */   
/*     */   public String[] getParamNames() {
/* 256 */     return this.paramNames;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParamNames(String[] paramNames) {
/* 264 */     this.paramNames = paramNames;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBeanName(String beanName) {
/* 273 */     this._beanName = beanName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuleName() {
/* 280 */     return this._beanName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getHttpMethod() {
/* 287 */     return this.httpMethod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setHttpMethod(int httpMethod) {
/* 295 */     this.httpMethod = httpMethod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPath() {
/* 302 */     return this.path;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPath(String path) {
/* 310 */     this.path = path;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUrl() {
/* 317 */     return this.url;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUrl(String url) {
/* 325 */     this.url = url;
/*     */   }
/*     */   
/*     */   protected abstract Object[] prepareInput(MapContainer paramMapContainer) throws RasServiceException;
/*     */   
/*     */   protected abstract String[] doConvertInput(Object[] paramArrayOfObject) throws RasServiceException;
/*     */   
/*     */   protected abstract Object doProcessRespondeBody(InputStream paramInputStream) throws RasServiceException;
/*     */   
/*     */   protected abstract MapContainer prepareOutput(Object paramObject) throws RasServiceException;
/*     */   
/*     */   protected abstract void processResponseCookies(Header[] paramArrayOfHeader, MapContainer paramMapContainer) throws RasServiceException;
/*     */   
/*     */   protected abstract Header[] getRequestCookies(MapContainer paramMapContainer) throws RasServiceException;
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\AbstractRasJmcModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */