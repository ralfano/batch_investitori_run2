package it.ras.arco.common.module;

import org.apache.commons.httpclient.HttpClient;

public interface IHttpClientManager {
  public static final int DEFAULT_CONNECTION_TIMEOUT = 500;
  
  public static final int DEFAULT_MAX_CONNECTION_NUMBER = 10;
  
  public static final int DEFAULT_PROXY_PORT = 80;
  
  HttpClient getClient();
  
  void setMaxConnectionsPerHost(int paramInt);
  
  void setConnectionTimeout(int paramInt);
  
  void setProxyHost(String paramString);
  
  void setProxyPort(int paramInt);
  
  void setProxyUsername(String paramString);
  
  void setProxyPassword(String paramString);
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\IHttpClientManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */