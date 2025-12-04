/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPratica;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PraticaManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  17 */   private Log log = LogFactory.getLog(PraticaManagerSRV.class);
/*  18 */   private String action = null;
/*     */ 
/*     */   
/*     */   public static final String PRATICA = "PRATICA";
/*     */ 
/*     */   
/*     */   public static final String GENERIC_MODULE_RESULT = "PRATICA";
/*     */   
/*     */   public static final String NUMERO_CC = "NUMERO_CC";
/*     */   
/*     */   public static final String PROMOTORE_ID = "PROMOTORE_ID";
/*     */   
/*     */   public static final String ACTION_GET_PRATICA_BY_PROMOTOREID_NUMCC = "ACTION_GET_PRATICA_BY_PROMOTOREID_NUMCC";
/*     */   
/*     */   public static final String ACTION_UPDATE_STATOPRATICA_DATAAPERTURA = "ACTION_UPDATE_STATOPRATICA_DATAAPERTURA";
/*     */   
/*     */   public static final String UPDATE_STATOPRATICA_DATAAPERTURA = "UpdateStatopraticaDataaperturaMD";
/*     */   
/*     */   public static final String GET_PRATICA_BY_PROMOTOREID_NUM_CC_MD = "getPraticaByPromotoreIdNumCCMD";
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  40 */     MapContainer resultMap = new MapContainer();
/*  41 */     FinPratica pratica = null;
/*  42 */     Object oPratica = map.getAppl("PRATICA");
/*     */     
/*  44 */     pratica = (FinPratica)getBean(oPratica, FinPratica.class);
/*     */ 
/*     */     
/*  47 */     if (this.action.equals("ACTION_GET_PRATICA_BY_PROMOTOREID_NUMCC")) {
/*     */       
/*  49 */       String n_cc = pratica.getNumeroCC();
/*  50 */       Integer promotore_id = pratica.getPromotore().getPromotoreId();
/*     */ 
/*     */       
/*  53 */       resultMap.putAppl("NUMERO_CC", n_cc);
/*  54 */       resultMap.putAppl("PROMOTORE_ID", promotore_id);
/*     */ 
/*     */       
/*  57 */       resultMap = getModuleManager().execModule("getPraticaByPromotoreIdNumCCMD", resultMap);
/*     */ 
/*     */       
/*  60 */       return processResultMap(resultMap, false);
/*     */     } 
/*  62 */     if (this.action.equals("ACTION_UPDATE_STATOPRATICA_DATAAPERTURA")) {
/*  63 */       resultMap.putAppl("PRATICA", pratica);
/*  64 */       getModuleManager().execModule("UpdateStatopraticaDataaperturaMD", resultMap);
/*     */       
/*  66 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */     
/*  69 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*  70 */     if (this.log.isErrorEnabled()) {
/*  71 */       this.log.error(errorMessage);
/*     */     }
/*  73 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/*  81 */     if (this.action.equals("ACTION_UPDATE_STATOPRATICA_DATAAPERTURA")) {
/*  82 */       String str = (String)resultMap.getAppl("UPDATED");
/*  83 */       resultMap.putAppl("UPDATED", str);
/*  84 */       return resultMap;
/*     */     } 
/*     */     
/*  87 */     ArrayList result = (ArrayList)resultMap.getAppl("PRATICA");
/*  88 */     resultMap.removeAppl("PRATICA");
/*     */     
/*  90 */     if (result.size() == 0) {
/*  91 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/*  93 */     else if (result.size() == 1) {
/*  94 */       resultMap.putAppl("RESULT", "FOUND");
/*  95 */       resultMap.putAppl("PRATICA", result.get(0));
/*     */     }
/*  97 */     else if (allowMultipleRow) {
/*  98 */       resultMap.putAppl("RESULT", "FOUND");
/*  99 */       resultMap.putAppl("PRATICA", result);
/*     */     } else {
/*     */       
/* 102 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/*     */     
/* 105 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 111 */     if (obj == null) {
/* 112 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 113 */       if (this.log.isErrorEnabled()) {
/* 114 */         this.log.error(errorMessage);
/*     */       }
/* 116 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 119 */     return obj;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 123 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 127 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PraticaManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */