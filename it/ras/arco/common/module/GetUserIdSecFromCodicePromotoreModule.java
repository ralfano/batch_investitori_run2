/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.arco.bean.FinPromotore;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.IRasModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Hashtable;
/*     */ import javax.naming.NamingEnumeration;
/*     */ import javax.naming.directory.Attribute;
/*     */ import javax.naming.directory.DirContext;
/*     */ import javax.naming.directory.InitialDirContext;
/*     */ import javax.naming.directory.SearchControls;
/*     */ import javax.naming.directory.SearchResult;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
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
/*     */ public class GetUserIdSecFromCodicePromotoreModule
/*     */   implements IRasModule
/*     */ {
/*  32 */   private static Log logger = LogFactory.getLog(GetUserIdSecFromCodicePromotoreModule.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String PROMOTORE = "PROMOTORE";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String USER_ID_PROMOTORE = "USER_ID_PROMOTORE";
/*     */ 
/*     */ 
/*     */   
/*  46 */   private String initialContextFactory = null;
/*     */   
/*  48 */   private String providerUrl = null;
/*     */ 
/*     */   
/*     */   private String beanName;
/*     */ 
/*     */   
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*  55 */     MapContainer outMap = new MapContainer(2);
/*  56 */     FinPromotore promotore = (FinPromotore)inputMap.getAppl("PROMOTORE");
/*     */     
/*  58 */     DirContext ctx = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  69 */       String filtroRicerca = "GesiFiscalCode=";
/*  70 */       filtroRicerca = filtroRicerca + promotore.getSoggetto().getCodiceFiscale();
/*     */       
/*  72 */       Hashtable env = new Hashtable();
/*  73 */       env.put("java.naming.factory.initial", this.initialContextFactory);
/*     */ 
/*     */       
/*  76 */       env.put("java.naming.provider.url", this.providerUrl);
/*  77 */       env.put("java.naming.security.principal", "cn=readusr,o=metaras");
/*  78 */       env.put("java.naming.security.credentials", "readusr");
/*  79 */       env.put("com.sun.jndi.ldap.connect.pool", "false");
/*     */       
/*  81 */       ctx = new InitialDirContext(env);
/*  82 */       if (logger.isDebugEnabled()) {
/*  83 */         logger.debug("InitialDirContext Connected");
/*     */       }
/*     */       
/*  86 */       SearchControls ctls = new SearchControls(2, 0L, 0, null, false, false);
/*     */       
/*  88 */       NamingEnumeration answer = ctx.search("", filtroRicerca, ctls);
/*     */       
/*  90 */       SearchResult sr = null;
/*  91 */       NamingEnumeration attrs = null;
/*  92 */       Attribute att = null;
/*     */       
/*  94 */       if (!answer.hasMore()) {
/*  95 */         throw new RasServiceException("it.ras.arco.promotore.not.found");
/*     */       }
/*     */       
/*  98 */       while (answer.hasMore()) {
/*  99 */         sr = answer.next();
/* 100 */         if (logger.isInfoEnabled()) {
/* 101 */           logger.info("USER - " + sr.getName());
/*     */         }
/*     */         
/* 104 */         attrs = sr.getAttributes().getAll();
/*     */ 
/*     */         
/* 107 */         while (attrs.hasMore()) {
/* 108 */           att = attrs.next();
/*     */           
/* 110 */           if ("GesiSecUser".equals(att.getID())) {
/* 111 */             outMap.putAppl("USER_ID_PROMOTORE", att.get());
/*     */           }
/*     */         }
/*     */       
/*     */       } 
/* 116 */     } catch (Exception e) {
/* 117 */       throw new RasServiceException(e);
/*     */     } finally {
/*     */       try {
/* 120 */         if (ctx != null) {
/* 121 */           ctx.close();
/*     */         }
/* 123 */       } catch (Exception ex) {
/* 124 */         throw new RasServiceException(ex);
/*     */       } 
/* 126 */       ctx = null;
/*     */     } 
/* 128 */     return outMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBeanName(String beanName) {
/* 137 */     this.beanName = beanName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuleName() {
/* 144 */     return this.beanName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getInitialContextFactory() {
/* 151 */     return this.initialContextFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInitialContextFactory(String initialContextFactory) {
/* 159 */     this.initialContextFactory = initialContextFactory;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProviderUrl() {
/* 166 */     return this.providerUrl;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProviderUrl(String providerUrl) {
/* 174 */     this.providerUrl = providerUrl;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\GetUserIdSecFromCodicePromotoreModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */