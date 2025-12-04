/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.io.InputStream;
/*     */ import javax.xml.parsers.DocumentBuilder;
/*     */ import javax.xml.parsers.DocumentBuilderFactory;
/*     */ import org.apache.commons.httpclient.Header;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.w3c.dom.Document;
/*     */ import org.w3c.dom.Node;
/*     */ import org.w3c.dom.NodeList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ChannelLoginModule
/*     */   extends AbstractRasJmcModule
/*     */ {
/*  26 */   private static Log log = LogFactory.getLog(ChannelLoginModule.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object[] prepareInput(MapContainer inputMap) throws RasServiceException {
/*  33 */     String[] values = new String[4];
/*  34 */     values[0] = "00080";
/*  35 */     values[1] = "INT";
/*  36 */     values[2] = (String)inputMap.getAppl("USER_ID_OPERATORE");
/*  37 */     values[3] = (String)inputMap.getAppl("PASSWORD_OPERATORE");
/*  38 */     return (Object[])values;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String[] doConvertInput(Object[] values) throws RasServiceException {
/*  46 */     return (String[])values;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Object doProcessRespondeBody(InputStream is) throws RasServiceException {
/*     */     try {
/*  55 */       DocumentBuilder docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
/*     */       
/*  57 */       Document doc = docBuilder.parse(is);
/*  58 */       Node root = doc.getFirstChild();
/*  59 */       if (isValidNode(root)) {
/*  60 */         if ("LOGON".equals(root.getNodeName())) {
/*  61 */           String userId = null;
/*  62 */           NodeList nodeList = root.getChildNodes();
/*  63 */           for (int j = 0; nodeList != null && j < nodeList.getLength(); j++) {
/*  64 */             Node child = nodeList.item(j);
/*  65 */             if (isValidNode(child) && "USERID".equals(child.getNodeName())) {
/*     */               
/*  67 */               userId = child.getFirstChild().getNodeValue();
/*     */               break;
/*     */             } 
/*     */           } 
/*  71 */           if (log.isInfoEnabled()) {
/*  72 */             log.info("Login a Sec avvenuto correttamente per l'utente: " + userId);
/*     */           }
/*     */ 
/*     */           
/*  76 */           return userId;
/*     */         } 
/*  78 */         String errDesc = null;
/*  79 */         NodeList childs = root.getChildNodes();
/*  80 */         for (int i = 0; childs != null && i < childs.getLength(); i++) {
/*  81 */           Node child = childs.item(i);
/*  82 */           if (isValidNode(child) && "DESCRIZIONE".equals(child.getNodeName())) {
/*     */             
/*  84 */             errDesc = child.getFirstChild().getNodeValue();
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*  89 */         if (log.isErrorEnabled()) {
/*  90 */           log.error("Login a Sec fallito. Motivazione: " + errDesc);
/*     */         }
/*     */         
/*  93 */         throw new RasServiceException("it.ras.arco.ordini.sec.login.not.auth");
/*     */       } 
/*     */ 
/*     */       
/*  97 */       if (log.isErrorEnabled()) {
/*  98 */         log.error("Xml di ritorno non corretto - nodo di root = " + root);
/*     */       }
/*     */       
/* 101 */       throw new RasServiceException("errors.general");
/*     */     }
/* 103 */     catch (RasServiceException rex) {
/* 104 */       throw rex;
/* 105 */     } catch (Exception ex) {
/* 106 */       if (log.isErrorEnabled()) {
/* 107 */         log.error(ex.getMessage(), ex);
/*     */       }
/* 109 */       throw new RasServiceException(ex);
/*     */     } 
/*     */   }
/*     */   
/*     */   private boolean isValidNode(Node node) {
/* 114 */     return (node.getNodeType() != 8 && node.getNodeType() != 3);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer prepareOutput(Object object) throws RasServiceException {
/* 122 */     MapContainer outMap = new MapContainer(1);
/* 123 */     outMap.putAppl("ESITO", Boolean.TRUE);
/* 124 */     outMap.putAppl("USER_ID_OPERATORE", object);
/* 125 */     return outMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void processResponseCookies(Header[] responseHeaders, MapContainer outMap) throws RasServiceException {
/* 134 */     Header header = null;
/* 135 */     String name = null;
/* 136 */     String value = null;
/* 137 */     for (int i = 0; responseHeaders != null && i < responseHeaders.length; i++) {
/* 138 */       header = responseHeaders[i];
/* 139 */       name = header.getName();
/* 140 */       value = header.getValue();
/* 141 */       if (name != null && value != null && "set-cookie".equalsIgnoreCase(name) && value.startsWith("JSESSIONID"))
/*     */       {
/*     */         
/* 144 */         outMap.putAppl("JSESSIONID", header);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected Header[] getRequestCookies(MapContainer inputMap) throws RasServiceException {
/* 155 */     return null;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\ChannelLoginModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */