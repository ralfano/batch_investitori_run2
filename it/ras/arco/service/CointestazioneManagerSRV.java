/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinDecodNdgFabbrOth;
/*     */ import it.ras.arco.bean.FinDecodNdgFabbrRam;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Calendar;
/*     */ import java.util.Collections;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Vector;
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
/*     */ public class CointestazioneManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String COINTESTAZIONE = "COINTESTAZIONE";
/*     */   public static final String GET_BY_SOGG_ID = "GET_BY_SOGG_ID";
/*     */   public static final String GET_BY_SOGG_ID_MONO = "GET_BY_SOGG_ID_MONO";
/*     */   public static final String SOGGETTO_ID = "SOGGETTO_ID";
/*     */   public static final String SOGG_COIN = "SOGG_COIN";
/*     */   public static final String ELENCO_COINT_OBJ = "ELENCO_COINT_OBJ";
/*     */   public static final String OBJ_COINTESTAZIONE = "OBJ_COINTESTAZIONE";
/*     */   public static final String LISTA_SOGGETTI = "SOGGETTI";
/*     */   public static final String COINTESTAZIONE_SOGGETTO = "C";
/*     */   public static final String SOGGETTO_NOT_INSERTED = "SUBJECT_NOT_INSERTED";
/*     */   public static final String COINTESTAZIONE_SQUADRA = "COINTESTAZIONE";
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   public static final String MONOINTESTATARIO = "M";
/*     */   public static final String COINTESTATARIO = "C";
/*     */   public static final String SQUADRA = "S";
/*     */   public static final String CONVENZIONE = "CONVENZIONE";
/*     */   public static final String STATO = "E";
/*     */   public static final String COINT = "ROWCOINT";
/*     */   public static final String COINTESTAZIONE_NOT_INSERTED = "COINTESTAZIONE_NOT_INSERTED";
/*     */   public static final String OBJ_DECOD_NDG_RAM = "OBJ_DECOD_NDG_RAM";
/*     */   public static final String FABBRICA = "FABBRICA";
/*     */   public static final String NDG = "NDG";
/*     */   public static final String TIPO = "TIPO";
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String INSERT_RAM = "INSERT_RAM";
/*     */   public static final String LISTCOINT = "LISTCOINT";
/*  75 */   private String GENERIC_MODULE_RESULT = null;
/*  76 */   private String RESULT_OUTPUT = null;
/*  77 */   private String NOME_BATCH = null;
/*     */   public static final String DATAINIZIO = "DATAINIZIO";
/*     */   public static final String DATAFINE = "DATAFINE";
/*  80 */   private MapContainer param = new MapContainer();
/*  81 */   private MapContainer SRV_Result_MAP = new MapContainer();
/*  82 */   private FinCointestazione cointestazione = new FinCointestazione();
/*  83 */   private FinCointestazione cointSquadra = null;
/*  84 */   private FinCointestazione cointMono = null;
/*  85 */   private FinCointestazione cointCointestatario = null;
/*  86 */   private FinDecodNdgFabbrRam decodNdgRam = new FinDecodNdgFabbrRam();
/*  87 */   private FinDecodNdgFabbrOth decodNdgFabbr = null;
/*  88 */   private FinSoggetto soggetto = new FinSoggetto();
/*  89 */   private FinSoggetto squadra = null;
/*  90 */   private Iterator it = null;
/*  91 */   private String resultMsg = null;
/*  92 */   private List listSoggetti = null;
/*  93 */   private Integer ordine = null;
/*  94 */   private String utenteInserimento = null;
/*     */   
/*  96 */   private String action = "ACTION";
/*  97 */   private Log logger = LogFactory.getLog(getClass());
/*  98 */   private Log log = LogFactory.getLog(CointestazioneManagerSRV.class);
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
/* 111 */     MapContainer MD_Input_MAP = new MapContainer();
/* 112 */     MapContainer MD_Result_MAP = new MapContainer();
/* 113 */     Object oSoggetto = null;
/* 114 */     Object oCointestazione = null;
/* 115 */     Object oSoggetti = null;
/* 116 */     Object oDecodNdgRam = null;
/* 117 */     Object oSoggettiObj = null;
/* 118 */     Object oAllowMultipleRows = SRV_Input_MAP.getAppl("ALLOW_MULTIPLE_ROWS");
/* 119 */     Object oDecodNdgFabbr = null;
/* 120 */     Integer soggCoin = null;
/* 121 */     String moduleName = null;
/* 122 */     String cointestazioneOrdinata = null;
/* 123 */     Vector vecCointestazione = new Vector();
/* 124 */     List elencoCointObj = new ArrayList();
/* 125 */     List soggettiObj = new ArrayList();
/*     */     
/* 127 */     Boolean allowMultipleRows = null;
/* 128 */     if (oAllowMultipleRows == null) {
/* 129 */       oAllowMultipleRows = new Boolean(false);
/* 130 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/* 131 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio " + getClass() + " è di tipo errato.";
/* 132 */       if (this.log.isErrorEnabled()) {
/* 133 */         this.log.error(errorMessage);
/*     */       }
/* 135 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 137 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/* 139 */     if (this.action.equals("GET")) {
/*     */ 
/*     */       
/* 142 */       oSoggettiObj = SRV_Input_MAP.getAppl("OBJ_COINTESTAZIONE");
/* 143 */       soggettiObj = (List)getBean(oSoggettiObj, ArrayList.class);
/* 144 */       int size = soggettiObj.size();
/*     */       
/* 146 */       for (int i = 0; i < size; i++) {
/* 147 */         vecCointestazione.add(i, ((FinSoggetto)soggettiObj.get(i)).getSoggettoId());
/*     */       }
/*     */       
/* 150 */       List listSoggetti = Arrays.asList(vecCointestazione.toArray());
/*     */       
/* 152 */       Collections.sort(listSoggetti);
/* 153 */       cointestazioneOrdinata = listSoggetti.get(0).toString();
/* 154 */       for (int j = 1; j < listSoggetti.size(); j++) {
/* 155 */         cointestazioneOrdinata = cointestazioneOrdinata + "-" + listSoggetti.get(j);
/*     */       }
/*     */       
/* 158 */       MD_Input_MAP.putAppl("COINTESTAZIONE", cointestazioneOrdinata);
/*     */       
/* 160 */       this.GENERIC_MODULE_RESULT = "COINTESTAZIONE_VIEW";
/* 161 */       this.RESULT_OUTPUT = "COINTESTAZIONE_VIEW";
/*     */       
/* 163 */       moduleName = "CheckCointestazioneOrderedMD";
/*     */       try {
/* 165 */         MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/*     */       }
/* 167 */       catch (HibernateObjectRetrievalFailureException e) {
/* 168 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 169 */         rse.setStackTrace(e.getStackTrace());
/* 170 */         throw rse;
/*     */       } 
/*     */       
/* 173 */       MapContainer CointestazioneViewMap = new MapContainer();
/* 174 */       CointestazioneViewMap = processResultMap(MD_Result_MAP, allowMultipleRows.booleanValue());
/* 175 */       String MD_resultMsg = (String)CointestazioneViewMap.getAppl("RESULT");
/* 176 */       if (MD_resultMsg.equals("FOUND"))
/* 177 */       { ArrayList CointestazioneView = (ArrayList)CointestazioneViewMap.getAppl(this.RESULT_OUTPUT);
/* 178 */         FinCointestazione coint = CointestazioneView.get(0);
/*     */         
/* 180 */         FinCointestazione soggCoinSquadra = coint.getSquadra();
/*     */         try {
/* 182 */           soggCoin = soggCoinSquadra.getCointestazioneId();
/* 183 */         } catch (HibernateObjectRetrievalFailureException e) {
/* 184 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 185 */           rse.setStackTrace(e.getStackTrace());
/* 186 */           throw rse;
/*     */         } 
/*     */         
/* 189 */         this.GENERIC_MODULE_RESULT = "ELENCO_COINT_OBJ";
/* 190 */         this.RESULT_OUTPUT = "ELENCO_COINT_OBJ";
/*     */         
/* 192 */         moduleName = "GetCointestazioneMD";
/* 193 */         MD_Input_MAP.putAppl("SOGGCOIN", soggCoin);
/*     */         
/*     */         try {
/* 196 */           MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/*     */         }
/* 198 */         catch (HibernateObjectRetrievalFailureException e) {
/* 199 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 200 */           rse.setStackTrace(e.getStackTrace());
/* 201 */           throw rse;
/*     */         } 
/* 203 */         MapContainer CointestazioneMap = new MapContainer();
/* 204 */         CointestazioneMap = processResultMap(MD_Result_MAP, allowMultipleRows.booleanValue());
/* 205 */         elencoCointObj = (List)CointestazioneMap.getAppl(this.RESULT_OUTPUT);
/*     */         
/* 207 */         this.SRV_Result_MAP.putAppl("RESULT", MD_resultMsg); }
/* 208 */       else { if (MD_resultMsg.equals("NOT_FOUND")) {
/*     */           
/* 210 */           this.SRV_Result_MAP.putAppl("RESULT", "NOT_FOUND");
/*     */           
/* 212 */           return this.SRV_Result_MAP;
/* 213 */         }  if (MD_resultMsg.equals("TOO_MANY_ROWS")) {
/* 214 */           this.SRV_Result_MAP.putAppl("RESULT", "TOO_MANY_ROWS");
/* 215 */           return this.SRV_Result_MAP;
/*     */         }  }
/* 217 */        this.SRV_Result_MAP.putAppl("ELENCO_COINT_OBJ", elencoCointObj);
/* 218 */       this.SRV_Result_MAP.putAppl("RESULT", MD_resultMsg);
/*     */       
/* 220 */       return this.SRV_Result_MAP;
/* 221 */     }  if (this.action.equals("INSERT") || this.action.equals("INSERT_RAM")) {
/* 222 */       this.NOME_BATCH = (String)SRV_Input_MAP.getAppl("NOME_BATCH");
/* 223 */       Date dataFine = (Date)SRV_Input_MAP.getAppl("DATAFINE");
/* 224 */       Date dataInizio = (Date)SRV_Input_MAP.getAppl("DATAINIZIO");
/* 225 */       if (SRV_Input_MAP.containsKeyAppl("SOGGETTO")) {
/* 226 */         oSoggetto = SRV_Input_MAP.getAppl("SOGGETTO");
/* 227 */         FinSoggetto soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class);
/*     */         
/* 229 */         this.ordine = new Integer(1);
/* 230 */         this.cointMono = new FinCointestazione();
/* 231 */         this.cointMono.setSoggetto(soggetto);
/* 232 */         this.cointMono.setSquadra(this.cointMono);
/*     */         
/* 234 */         if (dataInizio == null) {
/* 235 */           this.cointMono.setDataInizio(new Date());
/*     */         } else {
/* 237 */           this.cointMono.setDataInizio(dataInizio);
/*     */         } 
/* 239 */         if (dataFine == null) {
/* 240 */           Calendar data = Calendar.getInstance();
/* 241 */           data.set(9999, 11, 31);
/* 242 */           data.set(9999, 11, 31);
/* 243 */           this.cointMono.setDataFine(data.getTime());
/*     */         } else {
/* 245 */           this.cointMono.setDataFine(dataFine);
/*     */         } 
/* 247 */         if (soggetto.getSoggettoId() == null) {
/* 248 */           if (!inserimentoCointestazione(this.cointMono, "M", this.ordine, this.NOME_BATCH, "")) {
/* 249 */             this.logger.warn("monointestatario non inserito in FIN_COINTESTAZIONE");
/* 250 */             return this.SRV_Result_MAP;
/*     */           }
/*     */         
/* 253 */         } else if (!inserimentoCointestazione(this.cointMono, "M", this.ordine, this.NOME_BATCH, soggetto.getSoggettoId().toString())) {
/* 254 */           this.logger.warn("monointestatario non inserito in FIN_COINTESTAZIONE");
/* 255 */           return this.SRV_Result_MAP;
/*     */         } 
/*     */         
/* 258 */         this.SRV_Result_MAP = new MapContainer();
/* 259 */         this.SRV_Result_MAP.putAppl("COINTESTAZIONE", this.cointMono);
/*     */       } else {
/* 261 */         oSoggetti = SRV_Input_MAP.getAppl("SOGGETTI");
/* 262 */         List soggetti = (List)getBean(oSoggetti, ArrayList.class);
/* 263 */         this.utenteInserimento = ((FinSoggetto)soggetti.get(0)).getUtenteInserimento();
/* 264 */         this.it = soggetti.iterator();
/* 265 */         if (!inserimentoSquadra(this.it)) {
/* 266 */           this.logger.warn("squadra non inserita in FIN_SOGGETTO");
/* 267 */           return this.SRV_Result_MAP;
/*     */         } 
/*     */         
/* 270 */         int size = soggetti.size();
/* 271 */         for (int i = 0; i < size; i++) {
/* 272 */           vecCointestazione.add(i, ((FinSoggetto)soggetti.get(i)).getSoggettoId());
/*     */         }
/*     */         
/* 275 */         List listSoggetti = Arrays.asList(vecCointestazione.toArray());
/*     */         
/* 277 */         Collections.sort(listSoggetti);
/* 278 */         cointestazioneOrdinata = listSoggetti.get(0).toString();
/* 279 */         for (int j = 1; j < listSoggetti.size(); j++) {
/* 280 */           cointestazioneOrdinata = cointestazioneOrdinata + "-" + listSoggetti.get(j);
/*     */         }
/*     */         
/* 283 */         this.ordine = new Integer(0);
/* 284 */         this.cointSquadra = new FinCointestazione();
/* 285 */         this.cointSquadra.setSoggetto(this.squadra);
/* 286 */         this.cointSquadra.setSquadra(this.cointSquadra);
/* 287 */         Calendar data = Calendar.getInstance();
/* 288 */         data.set(9999, 11, 31);
/* 289 */         data.set(9999, 11, 31);
/* 290 */         if (dataFine != null) {
/* 291 */           this.cointSquadra.setDataFine(dataFine);
/*     */         } else {
/* 293 */           this.cointSquadra.setDataFine(data.getTime());
/*     */         } 
/*     */         
/* 296 */         if (dataInizio != null) {
/* 297 */           this.cointSquadra.setDataInizio(dataInizio);
/*     */         } else {
/* 299 */           this.cointSquadra.setDataInizio(new Date());
/*     */         } 
/*     */         
/* 302 */         if (this.action.equals("INSERT_RAM")) {
/* 303 */           this.cointSquadra.setCodiceSconto((String)SRV_Input_MAP.getAppl("CONVENZIONE"));
/*     */         }
/*     */         
/* 306 */         if (!inserimentoCointestazione(this.cointSquadra, "S", this.ordine, this.NOME_BATCH, cointestazioneOrdinata)) {
/* 307 */           this.logger.warn("squadra non inserita in FIN_COINTESTAZIONE");
/* 308 */           return this.SRV_Result_MAP;
/*     */         } 
/* 310 */         this.it = soggetti.iterator();
/* 311 */         int index = 1;
/* 312 */         while (this.it.hasNext()) {
/* 313 */           this.ordine = new Integer(index++);
/* 314 */           this.cointCointestatario = new FinCointestazione();
/* 315 */           this.cointCointestatario.setSoggetto(this.it.next());
/* 316 */           this.cointCointestatario.setSquadra(this.cointSquadra);
/*     */           
/* 318 */           if (dataFine != null) {
/* 319 */             this.cointCointestatario.setDataFine(dataFine);
/*     */           } else {
/* 321 */             this.cointCointestatario.setDataFine(data.getTime());
/*     */           } 
/*     */           
/* 324 */           if (dataInizio != null) {
/* 325 */             this.cointCointestatario.setDataInizio(dataInizio);
/*     */           } else {
/* 327 */             this.cointCointestatario.setDataInizio(new Date());
/*     */           } 
/*     */           
/* 330 */           if (!inserimentoCointestazione(this.cointCointestatario, "C", this.ordine, this.NOME_BATCH, "")) {
/* 331 */             this.logger.warn("cointestatario non inserito in FIN_COINTESTAZIONE");
/* 332 */             return this.SRV_Result_MAP;
/*     */           } 
/*     */         } 
/* 335 */         this.SRV_Result_MAP = new MapContainer();
/* 336 */         this.SRV_Result_MAP.putAppl("COINTESTAZIONE", this.cointSquadra);
/*     */       } 
/* 338 */       this.SRV_Result_MAP.putAppl("RESULT", "EXECUTED");
/* 339 */     } else if (this.action.equals("GET_BY_NDG")) {
/* 340 */       this.GENERIC_MODULE_RESULT = "OBJ_DECOD_NDG";
/* 341 */       this.RESULT_OUTPUT = "OBJ_DECOD_NDG";
/* 342 */       oDecodNdgRam = SRV_Input_MAP.getAppl("OBJ_DECOD_NDG_RAM");
/* 343 */       this.decodNdgRam = (FinDecodNdgFabbrRam)getBean(oDecodNdgRam, FinDecodNdgFabbrRam.class);
/* 344 */       String fabbrica = this.decodNdgRam.getFabbrica();
/* 345 */       String ndg = this.decodNdgRam.getNdgFab();
/* 346 */       MD_Input_MAP.putAppl("FABBRICA", fabbrica);
/* 347 */       MD_Input_MAP.putAppl("NDG", ndg);
/* 348 */       moduleName = "GetCointByNdgMD";
/*     */       
/* 350 */       MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/*     */       
/* 352 */       String MD_resultMsg = "";
/* 353 */       ArrayList res = (ArrayList)MD_Result_MAP.getAppl(this.GENERIC_MODULE_RESULT);
/* 354 */       if (res.size() == 1) {
/* 355 */         this.decodNdgRam = res.get(0);
/* 356 */         this.cointestazione = this.decodNdgRam.getCointestazione();
/* 357 */         this.SRV_Result_MAP.putAppl("OBJ_COINTESTAZIONE", this.cointestazione);
/* 358 */         MD_resultMsg = "FOUND";
/*     */       }
/* 360 */       else if (res.size() > 1) {
/* 361 */         MD_resultMsg = "TOO_MANY_ROWS";
/*     */       } else {
/*     */         
/* 364 */         MD_resultMsg = "NOT_FOUND";
/*     */       } 
/* 366 */       this.SRV_Result_MAP.putAppl("RESULT", MD_resultMsg);
/*     */     } else {
/* 368 */       if (this.action.equals("GET_BY_CODICE_ESTERNO_FABBRICA")) {
/* 369 */         this.GENERIC_MODULE_RESULT = "OBJ_DECOD_NDG";
/* 370 */         this.RESULT_OUTPUT = "COINTESTAZIONE";
/* 371 */         oDecodNdgFabbr = SRV_Input_MAP.getAppl("OBJ_DECOD_NDG");
/* 372 */         this.decodNdgFabbr = (FinDecodNdgFabbrOth)getBean(oDecodNdgFabbr, FinDecodNdgFabbrOth.class);
/* 373 */         String codiceEsterno = this.decodNdgFabbr.getNdgFab();
/* 374 */         String fabbrica = this.decodNdgFabbr.getFabbrica();
/* 375 */         MD_Input_MAP.putAppl("FABBRICA", fabbrica);
/* 376 */         MD_Input_MAP.putAppl("NDG", codiceEsterno);
/* 377 */         moduleName = "GetCointByNdgGenMD";
/*     */         try {
/* 379 */           MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/* 380 */         } catch (HibernateObjectRetrievalFailureException e) {
/* 381 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 382 */           rse.setStackTrace(e.getStackTrace());
/* 383 */           throw rse;
/*     */         } 
/* 385 */         return processResultMap(MD_Result_MAP, allowMultipleRows.booleanValue());
/* 386 */       }  if (this.action.equals("GET_BY_SOGGCOINT")) {
/*     */         
/* 388 */         this.cointSquadra = (FinCointestazione)getBean(SRV_Input_MAP.getAppl("COINTESTAZIONE"), FinCointestazione.class);
/*     */         
/* 390 */         soggCoin = this.cointSquadra.getSquadra().getCointestazioneId();
/*     */         
/* 392 */         this.GENERIC_MODULE_RESULT = "ELENCO_COINT_OBJ";
/* 393 */         this.RESULT_OUTPUT = "ELENCO_COINT_OBJ";
/*     */         
/* 395 */         moduleName = "GetCointestazioneMD";
/* 396 */         MD_Input_MAP.putAppl("SOGGCOIN", this.cointSquadra.getSquadra());
/*     */         
/*     */         try {
/* 399 */           MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/* 400 */         } catch (HibernateObjectRetrievalFailureException e) {
/* 401 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 402 */           rse.setStackTrace(e.getStackTrace());
/* 403 */           throw rse;
/*     */         } 
/* 405 */         return processResultMap(MD_Result_MAP, allowMultipleRows.booleanValue());
/* 406 */       }  if (this.action.equals("GET_BY_SOGG_ID_MONO")) {
/* 407 */         this.RESULT_OUTPUT = "ELENCO_COINT_OBJ";
/* 408 */         this.GENERIC_MODULE_RESULT = "COINTESTAZIONE";
/* 409 */         oSoggetto = SRV_Input_MAP.getAppl("SOGGETTO");
/* 410 */         oCointestazione = SRV_Input_MAP.getAppl("COINTESTAZIONE");
/* 411 */         this.soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class);
/* 412 */         this.cointestazione = (FinCointestazione)getBean(oCointestazione, FinCointestazione.class);
/* 413 */         MD_Input_MAP.putAppl("SOGGETTO_ID", this.soggetto);
/* 414 */         MD_Input_MAP.putAppl("TIPO", this.cointestazione.getTipo());
/* 415 */         moduleName = "GetCointBySoggIdMonoMD";
/*     */         try {
/* 417 */           MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/* 418 */         } catch (HibernateObjectRetrievalFailureException e) {
/* 419 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 420 */           rse.setStackTrace(e.getStackTrace());
/* 421 */           throw rse;
/*     */         } 
/* 423 */         return processResultMap(MD_Result_MAP, allowMultipleRows.booleanValue());
/* 424 */       }  if (this.action.equals("GET_BY_SOGG_ID")) {
/* 425 */         this.RESULT_OUTPUT = "ELENCO_COINT_OBJ";
/* 426 */         this.GENERIC_MODULE_RESULT = "COINTESTAZIONE";
/* 427 */         oSoggetto = SRV_Input_MAP.getAppl("SOGGETTO");
/* 428 */         this.soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class);
/* 429 */         MD_Input_MAP.putAppl("SOGGETTO_ID", this.soggetto);
/* 430 */         moduleName = "GetCointBySoggIdMD";
/*     */         try {
/* 432 */           MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/* 433 */         } catch (HibernateObjectRetrievalFailureException e) {
/* 434 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 435 */           rse.setStackTrace(e.getStackTrace());
/* 436 */           throw rse;
/*     */         } 
/* 438 */         return processResultMap(MD_Result_MAP, allowMultipleRows.booleanValue());
/* 439 */       }  if (this.action.equals("updateCointestazione")) {
/* 440 */         ArrayList listaCoint = (ArrayList)SRV_Input_MAP.getAppl("LISTCOINT");
/* 441 */         MD_Input_MAP.putAppl("LISTCOINT", listaCoint);
/* 442 */         moduleName = "updateCointestazione";
/*     */         try {
/* 444 */           MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/* 445 */         } catch (HibernateObjectRetrievalFailureException e) {
/* 446 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 447 */           rse.setStackTrace(e.getStackTrace());
/* 448 */           throw rse;
/*     */         } 
/*     */       } 
/*     */     } 
/* 452 */     return this.SRV_Result_MAP;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean inserimentoSquadra(Iterator iterator) throws RasServiceException {
/* 457 */     this.squadra = new FinSoggetto();
/* 458 */     this.squadra.setUtenteInserimento(this.NOME_BATCH);
/* 459 */     this.squadra.setDataInserimento(new Date());
/* 460 */     this.squadra.setTipoSogg("C");
/* 461 */     this.squadra.setNdgArco(new Integer(-1));
/*     */     
/* 463 */     String denominazione = new String();
/* 464 */     FinSoggetto soggetto = null;
/*     */     
/* 466 */     while (iterator.hasNext()) {
/* 467 */       soggetto = iterator.next();
/* 468 */       if (soggetto.getDenominazione() != null) {
/* 469 */         denominazione = denominazione + soggetto.getDenominazione() + ";";
/*     */         continue;
/*     */       } 
/* 472 */       denominazione = denominazione + soggetto.getNome() + " " + soggetto.getCognome() + ";";
/*     */     } 
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
/* 485 */     this.squadra.setDenominazione(denominazione);
/*     */     
/* 487 */     ArchUtils.setStdFields(this.squadra, "I", this.NOME_BATCH);
/* 488 */     this.param.putAppl("SOGGETTO", this.squadra);
/* 489 */     this.SRV_Result_MAP = getModuleManager().execModule("InsertSoggettoMD", this.param);
/* 490 */     this.resultMsg = "INSERTED";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 497 */     return true;
/*     */   }
/*     */   
/*     */   private boolean inserimentoCointestazione(FinCointestazione cointestazione, String tipo, Integer ordine, String utenteInserimento, String cointestazioneOrdinata) throws RasServiceException {
/* 501 */     cointestazione.setTipo(tipo);
/* 502 */     cointestazione.setStato("E");
/* 503 */     cointestazione.setUtenteInserimento(utenteInserimento);
/* 504 */     cointestazione.setDataInserimento(new Date());
/* 505 */     cointestazione.setOrdine(ordine);
/* 506 */     cointestazione.setCointSign(cointestazioneOrdinata);
/*     */     
/* 508 */     ArchUtils.setStdFields(cointestazione, "I", this.NOME_BATCH);
/* 509 */     MapContainer paramNew = new MapContainer();
/* 510 */     paramNew.putAppl("ROWCOINT", cointestazione);
/* 511 */     this.SRV_Result_MAP = getModuleManager().execModule("CensimentoCointestazioneMD", paramNew);
/*     */     
/* 513 */     this.resultMsg = "INSERTED";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 521 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 526 */     if (obj == null) {
/* 527 */       String errorMessage = "Oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 528 */       if (this.log.isErrorEnabled()) {
/* 529 */         this.log.error(errorMessage);
/*     */       }
/* 531 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 534 */     if (!obj.getClass().equals(c)) {
/* 535 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/* 536 */       if (this.log.isErrorEnabled()) {
/* 537 */         this.log.error(errorMessage);
/*     */       }
/* 539 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 541 */     return obj;
/*     */   }
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 545 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/* 546 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/* 547 */     if (result.size() == 0) {
/* 548 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/* 549 */     } else if (result.size() == 1) {
/* 550 */       resultMap.putAppl("RESULT", "FOUND");
/* 551 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/* 552 */       resultMap.putAppl("COINTESTAZIONE", result.get(0));
/* 553 */     } else if (allowMultipleRow) {
/* 554 */       resultMap.putAppl("RESULT", "FOUND");
/* 555 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     } else {
/* 557 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 559 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 564 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 568 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\CointestazioneManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */