/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinContrattoPromotore;
/*     */ import it.ras.arco.bean.FinPromotore;
/*     */ import it.ras.arco.bean.ProvaProdottiAnt;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
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
/*     */ public class AssegnazioniManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String CONTRATTO = "CONTRATTO";
/*     */   public static final String PROMOTORE = "PROMOTORE";
/*     */   public static final String ASSEGNAZIONE = "ASSEGNAZIONE";
/*     */   public static final String FLAG_SPLIT = "FLAG_SPLIT";
/*     */   public static final String FLAG_ATTUALE = "FLAG_ATTUALE";
/*     */   public static final String DATA_INIZIO = "DATA_INIZIO";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String PRODOTTO = "PRODOTTO";
/*     */   public static final String GET_ASSEGNAZIONE_ATTIVA_BY_CONTRATTO_PROMOTORE = "GET_ASSEGNAZIONE_ATTIVA_BY_CONTRATTO_PROMOTORE";
/*     */   public static final String GET_ASSEGNAZIONE = "GET_ASSEGNAZIONE";
/*     */   public static final String GET_ASSEGNAZIONE_2 = "GET_ASSEGNAZIONE_2";
/*     */   public static final String GET_PRIMA_ASSEGNAZIONE = "GET_PRIMA_ASSEGNAZIONE";
/*     */   public static final String GET_ASSEGNAZIONE_FITTIZIA = "GET_ASSEGNAZIONE_FITTIZIA";
/*     */   public static final String GET_PRODOTTO_ARCO_BY_PRODOTTO_ANT = "GET_PRODOTTO_ARCO_BY_PRODOTTO_ANT";
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  54 */   private Log log = LogFactory.getLog(AssegnazioniManagerSRV.class);
/*  55 */   private String action = null;
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
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  68 */     MapContainer resultMap = new MapContainer();
/*  69 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  71 */     Object oContratto = map.getAppl("CONTRATTO");
/*  72 */     Object oPromotore = map.getAppl("PROMOTORE");
/*  73 */     Object oAssegnazione = map.getAppl("ASSEGNAZIONE");
/*  74 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  75 */     Object oProdottoAnt = map.getAppl("PRODOTTO");
/*     */     
/*  77 */     Boolean allowMultipleRows = null;
/*  78 */     String moduleName = null;
/*  79 */     FinPromotore promotore = null;
/*  80 */     FinContratto contratto = null;
/*  81 */     FinContrattoPromotore assegnazione = null;
/*  82 */     ProvaProdottiAnt prodottoAnt = null;
/*     */ 
/*     */     
/*  85 */     if (oAllowMultipleRows == null) {
/*  86 */       oAllowMultipleRows = new Boolean(false);
/*  87 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  88 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  89 */       if (this.log.isErrorEnabled()) {
/*  90 */         this.log.error(str);
/*     */       }
/*  92 */       throw new RasServiceException(str);
/*     */     } 
/*  94 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     if (this.action.equals("GET_ASSEGNAZIONE_ATTIVA_BY_CONTRATTO_PROMOTORE")) {
/* 101 */       promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class.getName());
/* 102 */       contratto = (FinContratto)getBean(oContratto, FinContratto.class.getName());
/*     */       
/* 104 */       Integer promotoreId = promotore.getPromotoreId();
/* 105 */       Integer contrattoId = contratto.getContrattoId();
/*     */       
/* 107 */       paramMap.putAppl("CONTRATTO", contrattoId);
/* 108 */       paramMap.putAppl("PROMOTORE", promotoreId);
/*     */       
/* 110 */       moduleName = "GetAssegnazioneAttivaByContrattoPromotoreMD";
/*     */       try {
/* 112 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 113 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 114 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 115 */         rse.setStackTrace(e.getStackTrace());
/* 116 */         throw rse;
/*     */       } 
/* 118 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     if (this.action.equals("GET_ASSEGNAZIONE_FITTIZIA")) {
/* 125 */       assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class.getName());
/*     */       
/* 127 */       Integer promotoreId = assegnazione.getPromotore().getPromotoreId();
/* 128 */       Integer contrattoId = assegnazione.getContratto().getContrattoId();
/*     */       
/* 130 */       paramMap.putAppl("CONTRATTO", contrattoId);
/* 131 */       paramMap.putAppl("PROMOTORE", promotoreId);
/*     */       
/* 133 */       moduleName = "GetAssegnazioneFittiziaMD";
/*     */       try {
/* 135 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 136 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 137 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 138 */         rse.setStackTrace(e.getStackTrace());
/* 139 */         throw rse;
/*     */       } 
/* 141 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */     
/* 144 */     if (this.action.equals("GET_PRIMA_ASSEGNAZIONE")) {
/* 145 */       assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class.getName());
/*     */       
/* 147 */       Integer contrattoId = assegnazione.getContratto().getContrattoId();
/* 148 */       Date dataInizio = assegnazione.getDataInizio();
/*     */       
/* 150 */       paramMap.putAppl("CONTRATTO", contrattoId);
/* 151 */       paramMap.putAppl("DATA_INIZIO", dataInizio);
/*     */       
/* 153 */       moduleName = "GetPrimaAssegnazioneMD";
/*     */       try {
/* 155 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 156 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 157 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 158 */         rse.setStackTrace(e.getStackTrace());
/* 159 */         throw rse;
/*     */       } 
/* 161 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */     
/* 164 */     if (this.action.equals("GET_PRODOTTO_ARCO_BY_PRODOTTO_ANT")) {
/* 165 */       prodottoAnt = (ProvaProdottiAnt)getBean(oProdottoAnt, ProvaProdottiAnt.class.getName());
/* 166 */       paramMap.putAppl("PRODOTTO", prodottoAnt.getProdottoAnt());
/*     */       
/* 168 */       moduleName = "GetProdottoArcoByProdottoAntMD";
/*     */       try {
/* 170 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 171 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 172 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 173 */         rse.setStackTrace(e.getStackTrace());
/* 174 */         throw rse;
/*     */       } 
/*     */       
/* 177 */       ArrayList result = (ArrayList)resultMap.getAppl("ASSEGNAZIONE");
/* 178 */       resultMap.removeAppl("ASSEGNAZIONE");
/*     */       
/* 180 */       if (result.size() == 0) {
/* 181 */         resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */       } else {
/*     */         
/* 184 */         resultMap.putAppl("RESULT", "FOUND");
/* 185 */         resultMap.putAppl("ASSEGNAZIONE", result);
/*     */       } 
/*     */       
/* 188 */       return resultMap;
/*     */     } 
/*     */     
/* 191 */     if (this.action.equals("GET_ASSEGNAZIONE")) {
/* 192 */       assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class.getName());
/*     */ 
/*     */       
/* 195 */       Integer contrattoId = assegnazione.getContratto().getContrattoId();
/* 196 */       String flagSplit = assegnazione.getFlagSplit();
/* 197 */       String flagAttuale = assegnazione.getFlagAttuale();
/*     */       
/* 199 */       paramMap.putAppl("CONTRATTO", contrattoId);
/*     */       
/* 201 */       paramMap.putAppl("FLAG_SPLIT", flagSplit);
/* 202 */       paramMap.putAppl("FLAG_ATTUALE", flagAttuale);
/*     */       
/* 204 */       moduleName = "GetAssegnazioneMD";
/*     */       try {
/* 206 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 207 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 208 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 209 */         rse.setStackTrace(e.getStackTrace());
/* 210 */         throw rse;
/*     */       } 
/* 212 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/* 214 */     if (this.action.equals("GET_ASSEGNAZIONE_2")) {
/* 215 */       assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class.getName());
/*     */       
/* 217 */       Integer promotoreId = assegnazione.getPromotore().getPromotoreId();
/* 218 */       Integer contrattoId = assegnazione.getContratto().getContrattoId();
/* 219 */       String flagSplit = assegnazione.getFlagSplit();
/* 220 */       String flagAttuale = assegnazione.getFlagAttuale();
/*     */       
/* 222 */       paramMap.putAppl("CONTRATTO", contrattoId);
/* 223 */       paramMap.putAppl("PROMOTORE", promotoreId);
/* 224 */       paramMap.putAppl("FLAG_SPLIT", flagSplit);
/* 225 */       paramMap.putAppl("FLAG_ATTUALE", flagAttuale);
/*     */       
/* 227 */       moduleName = "GetAssegnazione2MD";
/*     */       try {
/* 229 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 230 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 231 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 232 */         rse.setStackTrace(e.getStackTrace());
/* 233 */         throw rse;
/*     */       } 
/* 235 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 241 */     if (this.action.equals("INSERT")) {
/*     */       
/* 243 */       assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class.getName());
/* 244 */       moduleName = "InsertAssegnazioneMD";
/*     */ 
/*     */       
/* 247 */       if (assegnazione.getDataInizio() == null) {
/* 248 */         assegnazione.setDataInizio(new Date());
/*     */       }
/* 250 */       if (assegnazione.getDataFine() == null) {
/* 251 */         assegnazione.setDataFine(setDataInfinito());
/*     */       }
/* 253 */       if (assegnazione.getFlagAttuale() == null) {
/* 254 */         assegnazione.setFlagAttuale("S");
/*     */       }
/* 256 */       if (assegnazione.getFlagSplit() == null) {
/* 257 */         assegnazione.setFlagSplit("N");
/*     */       }
/* 259 */       paramMap.putAppl("ASSEGNAZIONE", assegnazione);
/*     */       try {
/* 261 */         getModuleManager().execModule(moduleName, paramMap);
/* 262 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 263 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 264 */         rse.setStackTrace(e.getStackTrace());
/* 265 */         throw rse;
/*     */       } 
/* 267 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 273 */     if (this.action.equals("UPDATE")) {
/*     */       
/* 275 */       assegnazione = (FinContrattoPromotore)getBean(oAssegnazione, FinContrattoPromotore.class.getName());
/* 276 */       moduleName = "UpdateAssegnazioneMD";
/*     */       
/* 278 */       paramMap.putAppl("ASSEGNAZIONE", assegnazione);
/*     */       try {
/* 280 */         getModuleManager().execModule(moduleName, paramMap);
/* 281 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 282 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 283 */         rse.setStackTrace(e.getStackTrace());
/* 284 */         throw rse;
/*     */       } 
/* 286 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */     
/* 290 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 291 */     if (this.log.isErrorEnabled()) {
/* 292 */       this.log.error(errorMessage);
/*     */     }
/* 294 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 300 */     if (this.action.equals("INSERT")) {
/* 301 */       resultMap.putAppl("RESULT", "INSERTED");
/* 302 */       return resultMap;
/*     */     } 
/*     */     
/* 305 */     if (this.action.equals("UPDATE")) {
/* 306 */       resultMap.putAppl("RESULT", "UPDATED");
/* 307 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 311 */     ArrayList result = (ArrayList)resultMap.getAppl("ASSEGNAZIONE");
/* 312 */     resultMap.removeAppl("ASSEGNAZIONE");
/*     */     
/* 314 */     if (result.size() == 0) {
/* 315 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 317 */     else if (result.size() == 1) {
/* 318 */       resultMap.putAppl("RESULT", "FOUND");
/* 319 */       resultMap.putAppl("ASSEGNAZIONE", result.get(0));
/*     */     }
/* 321 */     else if (allowMultipleRow) {
/* 322 */       resultMap.putAppl("RESULT", "FOUND");
/* 323 */       resultMap.putAppl("ASSEGNAZIONE", result);
/*     */     } else {
/*     */       
/* 326 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/*     */     
/* 329 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 335 */     Object retObject = null;
/*     */     try {
/* 337 */       Class c = Class.forName(className);
/* 338 */       if (!c.isInstance(obj)) {
/* 339 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 340 */         if (this.log.isErrorEnabled()) {
/* 341 */           this.log.error(errorMessage);
/*     */         }
/* 343 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 345 */       retObject = obj;
/* 346 */     } catch (ClassNotFoundException e) {
/* 347 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 348 */       if (this.log.isErrorEnabled()) {
/* 349 */         this.log.error(errorMessage);
/*     */       }
/* 351 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 353 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 357 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 361 */     this.action = action;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Date setDataInfinito() {
/* 367 */     Calendar data = Calendar.getInstance();
/* 368 */     data.set(9999, 11, 31);
/*     */     
/* 370 */     return data.getTime();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\AssegnazioniManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */