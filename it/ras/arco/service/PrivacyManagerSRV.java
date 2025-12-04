/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinSoggettoPrivacy;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PrivacyManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  15 */   private Log log = LogFactory.getLog(PrivacyManagerSRV.class);
/*  16 */   private String action = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String PRIVACY = "PRIVACY";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String INSERT_PRIVACY = "INSERT_PRIVACY";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String UPDATE_PRIVACY = "UPDATE_PRIVACY";
/*     */ 
/*     */   
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  36 */     MapContainer resultMap = new MapContainer();
/*  37 */     Object oPrivacy = map.getAppl("PRIVACY");
/*     */ 
/*     */     
/*  40 */     if (this.action.equals("INSERT_PRIVACY")) {
/*     */       
/*  42 */       resultMap = insertPrivacy(oPrivacy);
/*  43 */       return processResultMap(resultMap, false);
/*     */     } 
/*  45 */     if (this.action.equals("UPDATE_PRIVACY")) {
/*     */       
/*  47 */       resultMap = updatePrivacy(oPrivacy);
/*  48 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/*  52 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*  53 */     if (this.log.isErrorEnabled()) {
/*  54 */       this.log.error(errorMessage);
/*     */     }
/*  56 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */   
/*     */   private MapContainer insertPrivacy(Object oPrivacy) throws RasServiceException {
/*  61 */     MapContainer paramMap = new MapContainer();
/*  62 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  64 */     FinSoggettoPrivacy privacy = (FinSoggettoPrivacy)getBean(oPrivacy, FinSoggettoPrivacy.class);
/*  65 */     paramMap.putAppl("PRIVACY", privacy);
/*  66 */     getModuleManager().execModule("InserimentoPrivacy", paramMap);
/*  67 */     resultMap.putAppl("RESULT", "INSERTED");
/*  68 */     return resultMap;
/*     */   }
/*     */   
/*     */   private MapContainer updatePrivacy(Object oPrivacy) throws RasServiceException {
/*  72 */     MapContainer paramMap = new MapContainer();
/*  73 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  75 */     FinSoggettoPrivacy privacy = (FinSoggettoPrivacy)getBean(oPrivacy, FinSoggettoPrivacy.class);
/*  76 */     paramMap.putAppl("PRIVACY", privacy);
/*  77 */     getModuleManager().execModule("AggiornamentoPrivacy", paramMap);
/*  78 */     resultMap.putAppl("RESULT", "UPDATED");
/*  79 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/*  84 */     resultMap.putAppl("RESULT", "INSERTED");
/*  85 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/*  90 */     if (obj == null) {
/*  91 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/*  92 */       if (this.log.isErrorEnabled()) {
/*  93 */         this.log.error(errorMessage);
/*     */       }
/*  95 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/*  98 */     if (!obj.getClass().equals(c)) {
/*  99 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/* 100 */       if (this.log.isErrorEnabled()) {
/* 101 */         this.log.error(errorMessage);
/*     */       }
/* 103 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 105 */     return obj;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 109 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 113 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PrivacyManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */