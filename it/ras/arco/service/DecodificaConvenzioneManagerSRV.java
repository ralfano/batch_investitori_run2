/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinCodificaConvenzione;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DecodificaConvenzioneManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   private String action;
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*  23 */   private String GENERIC_MODULE_RESULT = "";
/*     */   
/*     */   public static final String CONVENZIONE = "CONVENZIONE";
/*     */   
/*     */   public static final String GET_PERCENTUALE_BY_CODICE = "GetPercentualeByCodice";
/*  28 */   private Log log = LogFactory.getLog(ContrattoManagerSRV.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  39 */     MapContainer resultMap = null;
/*  40 */     MapContainer paramMap = new MapContainer();
/*  41 */     String moduleName = null;
/*     */     
/*  43 */     FinCodificaConvenzione convenzione = null;
/*     */ 
/*     */     
/*  46 */     Object oConvenzione = map.getAppl("CONVENZIONE");
/*  47 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */ 
/*     */     
/*  51 */     Boolean allowMultipleRows = null;
/*     */     
/*  53 */     if (oAllowMultipleRows == null) {
/*  54 */       oAllowMultipleRows = new Boolean(false);
/*  55 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  56 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*     */       
/*  58 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/*  61 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  63 */     if (this.action.equals("GetPercentualeByCodice")) {
/*     */ 
/*     */       
/*  66 */       this.GENERIC_MODULE_RESULT = "CONVENZIONE";
/*  67 */       convenzione = (FinCodificaConvenzione)getBean(oConvenzione, FinCodificaConvenzione.class);
/*  68 */       String codice = convenzione.getCodice();
/*  69 */       paramMap.putAppl("CONVENZIONE", codice);
/*     */ 
/*     */       
/*  72 */       moduleName = this.action;
/*  73 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  74 */       resultMap = processResultMap(resultMap, false);
/*     */     }
/*     */     else {
/*     */       
/*  78 */       String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*     */       
/*  80 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*  82 */     return resultMap;
/*     */   }
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/*  85 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/*  86 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/*  88 */     if (result.size() == 0) {
/*  89 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/*  91 */     else if (result.size() == 1) {
/*  92 */       resultMap.putAppl("RESULT", "FOUND");
/*  93 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result.get(0));
/*     */     }
/*  95 */     else if (allowMultipleRow) {
/*  96 */       resultMap.putAppl("RESULT", "FOUND");
/*  97 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result);
/*     */     } else {
/*     */       
/* 100 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 102 */     return resultMap;
/*     */   }
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 106 */     if (obj == null) {
/* 107 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 108 */       if (this.log.isErrorEnabled()) {
/* 109 */         this.log.error(errorMessage);
/*     */       }
/* 111 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 114 */     return obj;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 120 */     this.action = action;
/*     */   }
/*     */   public String getAction() {
/* 123 */     return this.action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\DecodificaConvenzioneManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */