/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPosizione;
/*     */ import it.ras.arco.bean.FinServizioAggiuntivo;
/*     */ import it.ras.arco.bean.FinSottoscrServAgg;
/*     */ import it.ras.arco.bean.FinSottoscrizione;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.springframework.orm.hibernate3.HibernateObjectRetrievalFailureException;
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
/*     */ public class ServizioAggManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String INSERT = "INSERT";
/*  46 */   private String action = "ACTION";
/*     */   
/*     */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*     */   
/*     */   public static final String SOTTSERVIZIO = "SOTTSERVIZIO";
/*     */   
/*     */   public static final String SOTTOSCRSERVAGG = "SOTTOSCRSERVAGG";
/*     */   
/*     */   public static final String GET = "GET";
/*     */   public static final String POSIZIONE = "POSIZIONE";
/*     */   public static final String POSIZIONE_IN = "POSIZIONE_IN";
/*     */   public static final String POSIZIONE_OUT = "POSIZIONE_OUT";
/*     */   public static final String TIPO_FLUSSO = "TIPO_FLUSSO";
/*     */   public static final String SERVIZIO = "SERVIZIO";
/*     */   public static final String POLIZZA = "POLIZZA";
/*     */   public static final String SOTTOSCRIZIONE_ID = "SOTTOSCRIZIONE_ID";
/*     */   public static final String GetServizioAggBySottMD = "GetServizioAggBySottMD";
/*     */   public static final String GET_NUM_C = "GET_NUM_C";
/*     */   public static final String POSIZIONE_ID = "POSIZIONE_ID";
/*     */   public static final String ArchivioPol = "ArchivioPol";
/*     */   public static final String GetServizioMD = "GetServizioMD";
/*     */   public static final String GetServizioInOutMD = "GetServizioInOutMD";
/*     */   public static final String GetServizioNumMD = "GetServizioNumMD";
/*     */   public static final String GetServizioPolMD = "GetServizioPolMD";
/*     */   public static final String GET_BY_SOTT = "GET_BY_SOTT";
/*     */   public static final String GET_BY_POS_IN_OUT = "GET_BY_POS_IN_OUT";
/*     */   public static final String InsServizioAggMD = "InsServizioAggMD";
/*     */   public static final String UpdServizioAggMD = "UpdServizioAggMD";
/*  74 */   private MapContainer param = new MapContainer();
/*  75 */   private MapContainer SRV_Result_MAP = new MapContainer();
/*     */   
/*  77 */   private FinServizioAggiuntivo servizioRow = new FinServizioAggiuntivo();
/*     */   
/*  79 */   private String GENERIC_MODULE_RESULT = null;
/*  80 */   private String RESULT_OUTPUT = null;
/*  81 */   private String NOME_BATCH = null;
/*  82 */   private String resultMsg = null;
/*     */ 
/*     */ 
/*     */   
/*  86 */   private Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer SRV_Input_MAP) throws RasServiceException {
/*  99 */     MapContainer MD_Input_MAP = new MapContainer();
/* 100 */     MapContainer MD_Result_MAP = new MapContainer();
/*     */     
/* 102 */     Object oPosizione = null;
/* 103 */     Object oFlusso = null;
/* 104 */     String numeroPolizza = null;
/* 105 */     Object oServizio = null;
/* 106 */     Object oSottoscrizione = null;
/*     */ 
/*     */     
/* 109 */     if (this.action.equals("GET")) {
/* 110 */       oPosizione = SRV_Input_MAP.getAppl("POSIZIONE");
/* 111 */       FinPosizione posizioneObj = (FinPosizione)getBean(oPosizione, FinPosizione.class.getName());
/* 112 */       String flusso = (String)SRV_Input_MAP.getAppl("TIPO_FLUSSO");
/* 113 */       Integer posizioneId = posizioneObj.getPosizioneId();
/*     */       
/* 115 */       this.RESULT_OUTPUT = "SERVIZIO";
/* 116 */       this.GENERIC_MODULE_RESULT = "SERVIZIO";
/* 117 */       this.param.putAppl("TIPO_FLUSSO", flusso);
/* 118 */       this.param.putAppl("POSIZIONE", posizioneId);
/* 119 */       if (flusso.equals("ArchivioPol")) {
/* 120 */         numeroPolizza = (String)SRV_Input_MAP.getAppl("POLIZZA");
/* 121 */         this.param.putAppl("POLIZZA", numeroPolizza);
/*     */       } 
/*     */       try {
/* 124 */         if (flusso.equals("ArchivioPol")) {
/* 125 */           MD_Result_MAP = getModuleManager().execModule("GetServizioPolMD", this.param);
/*     */         } else {
/* 127 */           MD_Result_MAP = getModuleManager().execModule("GetServizioMD", this.param);
/*     */         } 
/* 129 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 130 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 131 */         rse.setStackTrace(e.getStackTrace());
/* 132 */         throw rse;
/*     */       } 
/* 134 */       MapContainer ServizioMap = new MapContainer();
/* 135 */       ServizioMap = processResultMap(MD_Result_MAP, true);
/*     */       
/* 137 */       this.resultMsg = (String)MD_Result_MAP.getAppl("RESULT");
/*     */       
/* 139 */       if (this.resultMsg.equals("FOUND")) {
/* 140 */         List servizioList = (List)ServizioMap.getAppl(this.RESULT_OUTPUT);
/*     */         
/* 142 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, servizioList);
/*     */       } else {
/* 144 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, this.resultMsg);
/*     */       } 
/* 146 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/* 147 */     } else if (this.action.equals("GET_BY_POS_IN_OUT")) {
/* 148 */       oServizio = SRV_Input_MAP.getAppl("SERVIZIO");
/* 149 */       FinServizioAggiuntivo servizioObj = (FinServizioAggiuntivo)getBean(oServizio, FinServizioAggiuntivo.class.getName());
/* 150 */       FinPosizione posizioneInput = servizioObj.getPosizione();
/* 151 */       FinPosizione posizioneOutput = servizioObj.getPosizioneUscita();
/*     */       
/* 153 */       String flusso = (String)SRV_Input_MAP.getAppl("TIPO_FLUSSO");
/*     */       
/* 155 */       this.RESULT_OUTPUT = "SERVIZIO";
/* 156 */       this.GENERIC_MODULE_RESULT = "SERVIZIO";
/* 157 */       this.param.putAppl("TIPO_FLUSSO", flusso);
/* 158 */       this.param.putAppl("POSIZIONE_IN", posizioneInput.getPosizioneId());
/* 159 */       this.param.putAppl("POSIZIONE_OUT", posizioneOutput.getPosizioneId());
/*     */       try {
/* 161 */         MD_Result_MAP = getModuleManager().execModule("GetServizioInOutMD", this.param);
/*     */       }
/* 163 */       catch (HibernateObjectRetrievalFailureException e) {
/* 164 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 165 */         rse.setStackTrace(e.getStackTrace());
/* 166 */         throw rse;
/*     */       } 
/* 168 */       MapContainer ServizioMap = new MapContainer();
/* 169 */       ServizioMap = processResultMap(MD_Result_MAP, true);
/*     */       
/* 171 */       this.resultMsg = (String)MD_Result_MAP.getAppl("RESULT");
/*     */       
/* 173 */       if (this.resultMsg.equals("FOUND")) {
/* 174 */         List servizioList = (List)ServizioMap.getAppl(this.RESULT_OUTPUT);
/*     */         
/* 176 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, servizioList);
/*     */       } else {
/* 178 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, this.resultMsg);
/*     */       } 
/* 180 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/*     */     }
/* 182 */     else if (this.action.equals("GET_NUM_C")) {
/* 183 */       oPosizione = SRV_Input_MAP.getAppl("SERVIZIO");
/* 184 */       FinPosizione posizioneObj = (FinPosizione)getBean(oPosizione, FinPosizione.class.getName());
/* 185 */       Integer posizioneId = posizioneObj.getPosizioneId();
/*     */       
/* 187 */       String flusso = (String)SRV_Input_MAP.getAppl("TIPO_FLUSSO");
/*     */       
/* 189 */       this.RESULT_OUTPUT = "SERVIZIO";
/* 190 */       this.GENERIC_MODULE_RESULT = "SERVIZIO";
/* 191 */       this.param.putAppl("TIPO_FLUSSO", flusso);
/* 192 */       this.param.putAppl("POSIZIONE_ID", posizioneId);
/*     */       try {
/* 194 */         MD_Result_MAP = getModuleManager().execModule("GetServizioNumMD", this.param);
/*     */       }
/* 196 */       catch (HibernateObjectRetrievalFailureException e) {
/* 197 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 198 */         rse.setStackTrace(e.getStackTrace());
/* 199 */         throw rse;
/*     */       } 
/* 201 */       MapContainer ServizioMap = new MapContainer();
/* 202 */       ServizioMap = processResultMap(MD_Result_MAP, true);
/*     */       
/* 204 */       this.resultMsg = (String)MD_Result_MAP.getAppl("RESULT");
/*     */       
/* 206 */       if (this.resultMsg.equals("FOUND")) {
/* 207 */         List servizioList = (List)ServizioMap.getAppl(this.RESULT_OUTPUT);
/*     */         
/* 209 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, servizioList);
/*     */       } else {
/* 211 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, this.resultMsg);
/*     */       } 
/* 213 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/* 214 */     } else if (this.action.equals("GET_BY_SOTT")) {
/* 215 */       oSottoscrizione = SRV_Input_MAP.getAppl("SOTTOSCRIZIONE");
/* 216 */       FinSottoscrizione sottoscrizioneObj = (FinSottoscrizione)getBean(oSottoscrizione, FinSottoscrizione.class.getName());
/* 217 */       Integer sottoscrizioneId = sottoscrizioneObj.getSottoscrizioneId();
/*     */       
/* 219 */       String flusso = (String)SRV_Input_MAP.getAppl("TIPO_FLUSSO");
/*     */       
/* 221 */       this.RESULT_OUTPUT = "SERVIZIO";
/* 222 */       this.GENERIC_MODULE_RESULT = "SERVIZIO";
/* 223 */       this.param.putAppl("TIPO_FLUSSO", flusso);
/* 224 */       this.param.putAppl("SOTTOSCRIZIONE_ID", sottoscrizioneId);
/*     */       try {
/* 226 */         MD_Result_MAP = getModuleManager().execModule("GetServizioAggBySottMD", this.param);
/* 227 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 228 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 229 */         rse.setStackTrace(e.getStackTrace());
/* 230 */         throw rse;
/*     */       } 
/* 232 */       MapContainer ServizioMap = new MapContainer();
/* 233 */       ServizioMap = processResultMap(MD_Result_MAP, true);
/*     */       
/* 235 */       this.resultMsg = (String)MD_Result_MAP.getAppl("RESULT");
/*     */       
/* 237 */       if (this.resultMsg.equals("FOUND")) {
/* 238 */         List servizioList = (List)ServizioMap.getAppl(this.RESULT_OUTPUT);
/* 239 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, servizioList);
/*     */       } else {
/* 241 */         this.SRV_Result_MAP.putAppl(this.RESULT_OUTPUT, this.resultMsg);
/*     */       } 
/* 243 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/* 244 */     } else if (this.action.equals("INSERT")) {
/*     */       
/* 246 */       FinSottoscrServAgg sottSA = (FinSottoscrServAgg)SRV_Input_MAP.getAppl("SOTTSERVIZIO");
/* 247 */       this.param.putAppl("SOTTSERVIZIO", sottSA);
/* 248 */       getModuleManager().execModule("InsSottServizioAggMD", this.param);
/*     */       
/* 250 */       this.resultMsg = "INSERTED";
/* 251 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/*     */     }
/* 253 */     else if (this.action.equals("UPDATE")) {
/*     */       
/* 255 */       FinSottoscrServAgg sottSA = (FinSottoscrServAgg)SRV_Input_MAP.getAppl("SOTTOSCRSERVAGG");
/* 256 */       this.param.putAppl("SOTTOSCRSERVAGG", sottSA);
/* 257 */       getModuleManager().execModule("UpdSottoscizioneServizioAggMD", this.param);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 263 */       this.resultMsg = "UPDATED";
/* 264 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/*     */     } 
/* 266 */     return this.SRV_Result_MAP;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 272 */     Object retObject = null;
/*     */     try {
/* 274 */       Class c = Class.forName(className);
/* 275 */       if (!c.isInstance(obj)) {
/* 276 */         String errorMessage = "Errore in: " + getClass() + ".getBean: impossibile instanziare un oggetto di tipo " + className + ": oggetto ricevuto dal servizio è nullo o di tipo errato.";
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 281 */         if (this.logger.isErrorEnabled()) {
/* 282 */           this.logger.error(errorMessage);
/*     */         }
/* 284 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 286 */       retObject = obj;
/* 287 */     } catch (ClassNotFoundException e) {
/* 288 */       String errorMessage = "Errore in: " + getClass() + ".getBean: impossibile instanziare un oggetto di tipo " + className + ": la classe non esiste.";
/*     */ 
/*     */       
/* 291 */       if (this.logger.isErrorEnabled()) {
/* 292 */         this.logger.error(errorMessage);
/*     */       }
/* 294 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 296 */     return retObject;
/*     */   }
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 301 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 303 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 305 */     if (result.size() == 0) {
/* 306 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 308 */     else if (result.size() == 1) {
/* 309 */       resultMap.putAppl("RESULT", "FOUND");
/* 310 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     }
/* 312 */     else if (allowMultipleRow) {
/* 313 */       resultMap.putAppl("RESULT", "FOUND");
/* 314 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     } else {
/*     */       
/* 317 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 319 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 326 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 330 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\ServizioAggManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */