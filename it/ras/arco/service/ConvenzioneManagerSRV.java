/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinConvenzione;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
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
/*     */ public class ConvenzioneManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   private String action;
/*  32 */   private Log log = LogFactory.getLog(ConvenzioneManagerSRV.class);
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String INSERT_CONVENZIONE = "INSERT_CONVENZIONE";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String InserimentoConvenzione = "InserimentoConvenzione";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String CONVENZIONE = "CONVENZIONE";
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean onLine;
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
/*  70 */     MapContainer paramMap = new MapContainer();
/*  71 */     MapContainer resultMap = new MapContainer();
/*     */ 
/*     */     
/*  74 */     FinConvenzione convenzione = null;
/*     */     
/*  76 */     Object oConvenzione = map.getAppl("CONVENZIONE");
/*     */     
/*  78 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  80 */     Boolean allowMultipleRows = null;
/*     */     
/*  82 */     if (oAllowMultipleRows == null) {
/*  83 */       oAllowMultipleRows = new Boolean(false);
/*  84 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  85 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  86 */       if (this.log.isErrorEnabled()) {
/*  87 */         this.log.error(errorMessage);
/*     */       }
/*  89 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/*  92 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  94 */     if (this.action.equals("INSERT_CONVENZIONE")) {
/*  95 */       convenzione = (FinConvenzione)getBean(oConvenzione, FinConvenzione.class);
/*     */       
/*  97 */       paramMap.putAppl("CONVENZIONE", convenzione);
/*     */ 
/*     */       
/* 100 */       getModuleManager().execModule("InserimentoConvenzione", paramMap);
/*     */     }
/* 102 */     else if (this.action.equals("GetConvenzioneByAttFinIdCodiceConvenzione")) {
/*     */       
/* 104 */       convenzione = (FinConvenzione)getBean(oConvenzione, FinConvenzione.class);
/*     */       
/* 106 */       Integer attFinId = convenzione.getAttFinId();
/* 107 */       String codiceConvenzione = convenzione.getCodiceConvenzione();
/* 108 */       paramMap.putAppl("ATT_FIN", attFinId);
/* 109 */       paramMap.putAppl("COD_CONV", codiceConvenzione);
/*     */       
/* 111 */       resultMap = getModuleManager().execModule("GetConvenzioneByAttFinIdCodiceConvenzioneMD", paramMap);
/* 112 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CONVENZIONE");
/*     */     
/*     */     }
/* 115 */     else if (this.action.equals("UpdateConvenzione")) {
/* 116 */       convenzione = (FinConvenzione)getBean(oConvenzione, FinConvenzione.class);
/*     */       
/* 118 */       paramMap.putAppl("CONVENZIONE", convenzione);
/*     */       
/* 120 */       getModuleManager().execModule("UpdateConvenzioneMD", paramMap);
/* 121 */       resultMap.putAppl("RESULT", "UPDATED");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     return resultMap;
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
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow, String genericModuleResult) throws RasServiceException {
/* 139 */     ArrayList result = (ArrayList)resultMap.getAppl(genericModuleResult);
/* 140 */     resultMap.removeAppl(genericModuleResult);
/*     */     
/* 142 */     if (result.size() == 0) {
/* 143 */       String tipoCercato = genericModuleResult.toLowerCase();
/* 144 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/* 145 */       throwOnLineError("errors.service.ContrattoManager." + tipoCercato + ".notfound");
/*     */     
/*     */     }
/* 148 */     else if (allowMultipleRow) {
/* 149 */       resultMap.putAppl("RESULT", "FOUND");
/* 150 */       resultMap.putAppl(genericModuleResult, result);
/*     */     
/*     */     }
/* 153 */     else if (result.size() == 1) {
/* 154 */       resultMap.putAppl("RESULT", "FOUND");
/* 155 */       resultMap.putAppl(genericModuleResult, result.get(0));
/*     */     }
/*     */     else {
/*     */       
/* 159 */       String tipoCercato = genericModuleResult.toLowerCase();
/* 160 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/* 161 */       throwOnLineError("errors.service.ConvenzioneManager." + tipoCercato + ".tooManyRows");
/*     */     } 
/* 163 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private void throwOnLineError(String errorCode) throws RasServiceException {
/* 168 */     if (this.onLine) {
/* 169 */       RasServiceException error = new RasServiceException();
/* 170 */       error.addError(new RasValidationSignal(errorCode));
/* 171 */       throw error;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 177 */     if (obj == null) {
/* 178 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 179 */       if (this.log.isErrorEnabled()) {
/* 180 */         this.log.error(errorMessage);
/*     */       }
/* 182 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 185 */     return obj;
/*     */   }
/*     */   public void setAction(String action) {
/* 188 */     this.action = action;
/*     */   }
/*     */   public String getAction() {
/* 191 */     return this.action;
/*     */   }
/*     */   public boolean isOnLine() {
/* 194 */     return this.onLine;
/*     */   }
/*     */   public void setOnLine(boolean onLine) {
/* 197 */     this.onLine = onLine;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\ConvenzioneManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */