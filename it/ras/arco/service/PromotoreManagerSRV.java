/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinPromotore;
/*     */ import it.ras.arco.bean.FinPromotoreAgenzia;
/*     */ import it.ras.arco.bean.FinPromotoreCoordinata;
/*     */ import it.ras.arco.bean.FinPromotoreDistretto;
/*     */ import it.ras.arco.bean.FinPromotoreStruttura;
/*     */ import it.ras.arco.bean.FinSoggScheda;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
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
/*     */ public class PromotoreManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String PROMOTORE = "PROMOTORE";
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   public static final String SOGGETTO_SCHEDA = "SOGGETTO_SCHEDA";
/*     */   public static final String PROMOTORE_AGENZIA = "PROMOTORE_AGENZIA";
/*     */   public static final String PROMOTORE_DISTRETTO = "PROMOTORE_DISTRETTO";
/*     */   public static final String PROMOTORE_COORDINATA = "PROMOTORE_COORDINATA";
/*     */   public static final String PROMOTORE_STRUTTURA = "PROMOTORE_STRUTTURA";
/*     */   public static final String CODICE_PROMOTORE = "CODICE_PROMOTORE";
/*     */   public static final String CODICE_RETE = "CODICE_RETE";
/*     */   public static final String CODICE_COMPAGNIA = "CODICE_COMPAGNIA";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String PROMOTORE_PADRE = "PROMOTORE_PADRE";
/*     */   public static final String PROMOTORE_FIGLIO = "PROMOTORE_FIGLIO";
/*     */   public static final String DATA_INIZIO = "DATA_INIZIO";
/*     */   public static final String CODICE_PROMOTORE_RASBANK_RAGGRUPPAMENTO_AGENTI_RAS = "9900A";
/*     */   public static final String CODICE_COMPAGNIA_RASBANK_RAGGRUPPAMENTO_AGENTI_RAS = "99";
/*     */   public static final String INSERT_PROMOTORE = "INSERT_PROMOTORE";
/*     */   public static final String UPDATE_PROMOTORE = "UPDATE_PROMOTORE";
/*     */   public static final String INSERT_PROMOTORE_AGENZIA = "INSERT_PROMOTORE_AGENZIA";
/*     */   public static final String UPDATE_PROMOTORE_AGENZIA = "UPDATE_PROMOTORE_AGENZIA";
/*     */   public static final String INSERT_PROMOTORE_DISTRETTO = "INSERT_PROMOTORE_DISTRETTO";
/*     */   public static final String UPDATE_PROMOTORE_DISTRETTO = "UPDATE_PROMOTORE_DISTRETTO";
/*     */   public static final String INSERT_PROMOTORE_COORDINATA = "INSERT_PROMOTORE_COORDINATA";
/*     */   public static final String INSERT_SOGG_SCHEDA_PROMOTORE_DEFAULT = "INSERT_SOGG_SCHEDA_PROMOTORE_DEFAULT";
/*     */   public static final String INSERT_SOGG_SCHEDA = "INSERT_SOGG_SCHEDA";
/*     */   public static final String UPDATE_PROMOTORE_COORDINATA = "UPDATE_PROMOTORE_COORDINATA";
/*     */   public static final String INSERT_PROMOTORE_STRUTTURA = "INSERT_PROMOTORE_STRUTTURA";
/*     */   public static final String UPDATE_PROMOTORE_STRUTTURA = "UPDATE_PROMOTORE_STRUTTURA";
/*     */   public static final String GET_PROMOTORE_COORDINATA = "GET_PROMOTORE_COORDINATA";
/*     */   public static final String GET_PROMOTORE_BY_CODICE_PROMOTORE = "GET_PROMOTORE_BY_CODICE_PROMOTORE";
/*     */   public static final String GET_PROMOTORE_BY_CODICE_PROMOTORE_CODICE_RETE = "GET_PROMOTORE_BY_CODICE_PROMOTORE_CODICE_RETE";
/*     */   public static final String GET_PROMOTORE_BY_CODICE_PROMOTORE_CODICE_RETE_CODICE_COMPAGNIA = "GET_PROMOTORE_BY_CODICE_PROMOTORE_CODICE_RETE_CODICE_COMPAGNIA";
/*     */   public static final String GET_PROMOTORE_AGENZIA_BY_PROMOTORE_CP = "GET_PROMOTORE_AGENZIA_BY_PROMOTORE_CP";
/*     */   public static final String GET_PROMOTORE_DISTRETTO_BY_PROMOTORE_CP = "GET_PROMOTORE_DISTRETTO_BY_PROMOTORE_CP";
/*     */   public static final String GET_PROMOTORE_STRUTTURA = "GET_PROMOTORE_STRUTTURA";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  75 */   private Log log = LogFactory.getLog(PromotoreManagerSRV.class);
/*  76 */   private String action = null;
/*  77 */   private String GENERIC_MODULE_RESULT = null;
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
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  89 */     MapContainer resultMap = new MapContainer();
/*  90 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  92 */     Object oPromotore = map.getAppl("PROMOTORE");
/*  93 */     Object oPromotoreAgenzia = map.getAppl("PROMOTORE_AGENZIA");
/*  94 */     Object oPromotoreDistretto = map.getAppl("PROMOTORE_DISTRETTO");
/*  95 */     Object oPromotoreCoordinata = map.getAppl("PROMOTORE_COORDINATA");
/*  96 */     Object oPromotoreStruttura = map.getAppl("PROMOTORE_STRUTTURA");
/*  97 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  98 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  99 */     Object oSoggScheda = map.getAppl("SOGGETTO_SCHEDA");
/*     */     
/* 101 */     Boolean allowMultipleRows = null;
/* 102 */     String moduleName = null;
/* 103 */     FinPromotore promotore = null;
/* 104 */     FinPromotoreAgenzia promotoreAgenzia = null;
/* 105 */     FinPromotoreDistretto promotoreDistretto = null;
/* 106 */     FinPromotoreCoordinata promotoreCoordinata = null;
/* 107 */     FinPromotoreStruttura promotoreStruttura = null;
/* 108 */     FinSoggetto soggetto = null;
/* 109 */     FinSoggScheda soggScheda = null;
/*     */ 
/*     */     
/* 112 */     if (oAllowMultipleRows == null) {
/* 113 */       oAllowMultipleRows = new Boolean(false);
/* 114 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/* 115 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/* 116 */       if (this.log.isErrorEnabled()) {
/* 117 */         this.log.error(str);
/*     */       }
/* 119 */       throw new RasServiceException(str);
/*     */     } 
/* 121 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     if (this.action.equals("GET_PROMOTORE_BY_CODICE_PROMOTORE")) {
/* 128 */       promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class.getName());
/* 129 */       String codicePromotore = promotore.getCodPromotore();
/* 130 */       this.GENERIC_MODULE_RESULT = "PROMOTORE";
/*     */       
/* 132 */       paramMap.putAppl("CODICE_PROMOTORE", codicePromotore);
/* 133 */       moduleName = "GetPromotoreByCodicePromotoreMD";
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
/*     */ 
/*     */ 
/*     */     
/* 147 */     if (this.action.equals("GET_PROMOTORE_BY_CODICE_PROMOTORE_CODICE_RETE")) {
/* 148 */       String codicePromotore; promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class.getName());
/* 149 */       String codiceRete = promotore.getCodRete();
/*     */ 
/*     */       
/* 152 */       this.GENERIC_MODULE_RESULT = "PROMOTORE";
/*     */       
/* 154 */       if (codiceRete.equalsIgnoreCase("A")) {
/*     */         
/* 156 */         codicePromotore = "9900A";
/*     */       }
/*     */       else {
/*     */         
/* 160 */         codicePromotore = promotore.getCodPromotore();
/*     */       } 
/*     */       
/* 163 */       paramMap.putAppl("CODICE_PROMOTORE", codicePromotore);
/* 164 */       paramMap.putAppl("CODICE_RETE", codiceRete);
/*     */       
/* 166 */       moduleName = "GetPromotoreByCodicePromotoreCodiceReteMD";
/*     */       
/*     */       try {
/* 169 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 170 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 171 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 172 */         rse.setStackTrace(e.getStackTrace());
/* 173 */         throw rse;
/*     */       } 
/* 175 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 181 */     if (this.action.equals("GET_PROMOTORE_BY_CODICE_PROMOTORE_CODICE_RETE_CODICE_COMPAGNIA")) {
/* 182 */       String codicePromotore, codiceCompagnia; promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class.getName());
/* 183 */       String codiceRete = promotore.getCodRete();
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 188 */       this.GENERIC_MODULE_RESULT = "PROMOTORE";
/*     */       
/* 190 */       if (codiceRete.equalsIgnoreCase("A")) {
/*     */         
/* 192 */         codicePromotore = "9900A";
/* 193 */         codiceCompagnia = "99";
/*     */       }
/*     */       else {
/*     */         
/* 197 */         codicePromotore = promotore.getCodPromotore();
/* 198 */         codiceCompagnia = promotore.getCodComp();
/*     */       } 
/*     */       
/* 201 */       paramMap.putAppl("CODICE_PROMOTORE", codicePromotore);
/* 202 */       paramMap.putAppl("CODICE_RETE", codiceRete);
/* 203 */       paramMap.putAppl("CODICE_COMPAGNIA", codiceCompagnia);
/*     */       
/* 205 */       moduleName = "GetPromotoreByCodicePromotoreCodiceReteCodiceCompagniaMD";
/*     */       
/*     */       try {
/* 208 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 209 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 210 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 211 */         rse.setStackTrace(e.getStackTrace());
/* 212 */         throw rse;
/*     */       } 
/* 214 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     if (this.action.equals("GET_PROMOTORE_AGENZIA_BY_PROMOTORE_CP")) {
/*     */       
/* 222 */       moduleName = "GetPromotoreAgenziaByPromotoreCPMD";
/* 223 */       promotoreAgenzia = (FinPromotoreAgenzia)getBean(oPromotoreAgenzia, FinPromotoreAgenzia.class.getName());
/* 224 */       this.GENERIC_MODULE_RESULT = "PROMOTORE_AGENZIA";
/*     */       
/* 226 */       paramMap.putAppl("CODICE_PROMOTORE", promotoreAgenzia.getPromotore().getPromotoreId());
/*     */       
/*     */       try {
/* 229 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       }
/* 231 */       catch (HibernateObjectRetrievalFailureException e) {
/*     */         
/* 233 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 234 */         rse.setStackTrace(e.getStackTrace());
/* 235 */         throw rse;
/*     */       } 
/*     */       
/* 238 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */     
/* 241 */     if (this.action.equals("INSERT_SOGG_SCHEDA_PROMOTORE_DEFAULT")) {
/*     */       
/* 243 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*     */ 
/*     */       
/* 246 */       this.GENERIC_MODULE_RESULT = "PROMOTORE";
/* 247 */       moduleName = "GetPromotoreByCodicePromotoreMD";
/* 248 */       String codiceDefault = "ARCO";
/* 249 */       paramMap.putAppl("CODICE_PROMOTORE", codiceDefault);
/*     */       
/*     */       try {
/* 252 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       }
/* 254 */       catch (HibernateObjectRetrievalFailureException e) {
/*     */         
/* 256 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 257 */         rse.setStackTrace(e.getStackTrace());
/* 258 */         throw rse;
/*     */       } 
/* 260 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/* 261 */       promotore = (FinPromotore)resultMap.getAppl("PROMOTORE");
/*     */ 
/*     */       
/* 264 */       if (soggetto.getSoggettoId() != null && ((String)resultMap.getAppl("RESULT")).equals("FOUND")) {
/*     */         
/* 266 */         this.GENERIC_MODULE_RESULT = "SOGGETTO_SCHEDA";
/* 267 */         moduleName = "GetSchedaBySoggIdPromotIdMD";
/* 268 */         Integer soggID = soggetto.getSoggettoId();
/* 269 */         Integer promoID = promotore.getPromotoreId();
/* 270 */         paramMap.putAppl("SOGGETTO", soggID);
/* 271 */         paramMap.putAppl("PROMOTORE", promoID);
/*     */         
/*     */         try {
/* 274 */           resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */         }
/* 276 */         catch (HibernateObjectRetrievalFailureException e) {
/*     */           
/* 278 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 279 */           rse.setStackTrace(e.getStackTrace());
/* 280 */           throw rse;
/*     */         } 
/* 282 */         resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */         
/* 284 */         if (((String)resultMap.getAppl("RESULT")).equals("FOUND")) {
/* 285 */           moduleName = "UpdSoggettoSchedaMD";
/* 286 */           FinSoggScheda soggSchedaEsterno = (FinSoggScheda)getBean(oSoggScheda, FinSoggScheda.class.getName());
/* 287 */           soggScheda = (FinSoggScheda)resultMap.getAppl("SOGGETTO_SCHEDA");
/*     */           
/* 289 */           paramMap.putAppl("SOGGETTO_SCHEDA", soggScheda);
/* 290 */           getModuleManager().execModule(moduleName, paramMap);
/* 291 */           resultMap = new MapContainer();
/* 292 */           resultMap.putAppl("RESULT", "INSERTED");
/* 293 */           return resultMap;
/*     */         } 
/* 295 */         if (((String)resultMap.getAppl("RESULT")).equals("NOT_FOUND")) {
/* 296 */           moduleName = "InsSoggettoSchedaMD";
/* 297 */           soggScheda = (FinSoggScheda)getBean(oSoggScheda, FinSoggScheda.class.getName());
/* 298 */           soggScheda.setPromotore(promotore);
/* 299 */           soggScheda.setSoggetto(soggetto);
/* 300 */           paramMap.putAppl("SOGGETTO_SCHEDA", soggScheda);
/* 301 */           getModuleManager().execModule(moduleName, paramMap);
/* 302 */           resultMap = new MapContainer();
/* 303 */           resultMap.putAppl("RESULT", "INSERTED");
/* 304 */           return resultMap;
/*     */         }
/*     */       
/* 307 */       } else if (soggetto.getSoggettoId() == null) {
/* 308 */         moduleName = "InsSoggettoSchedaMD";
/* 309 */         soggScheda = (FinSoggScheda)getBean(oSoggScheda, FinSoggScheda.class.getName());
/* 310 */         soggScheda.setPromotore(promotore);
/* 311 */         soggScheda.setSoggetto(soggetto);
/* 312 */         paramMap.putAppl("SOGGETTO_SCHEDA", soggScheda);
/* 313 */         getModuleManager().execModule(moduleName, paramMap);
/* 314 */         resultMap = new MapContainer();
/* 315 */         resultMap.putAppl("RESULT", "INSERTED");
/* 316 */         return resultMap;
/*     */       } 
/* 318 */       resultMap.putAppl("RESULT", "GENERIC ERROR");
/* 319 */       return resultMap;
/*     */     } 
/*     */     
/* 322 */     if (this.action.equals("INSERT_SOGG_SCHEDA")) {
/* 323 */       moduleName = "InsSoggettoSchedaMD";
/* 324 */       soggScheda = (FinSoggScheda)getBean(oSoggScheda, FinSoggScheda.class.getName());
/* 325 */       paramMap.putAppl("SOGGETTO_SCHEDA", soggScheda);
/* 326 */       getModuleManager().execModule(moduleName, paramMap);
/* 327 */       resultMap = new MapContainer();
/* 328 */       resultMap.putAppl("RESULT", "INSERTED");
/* 329 */       return resultMap;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 336 */     if (this.action.equals("GET_PROMOTORE_DISTRETTO_BY_PROMOTORE_CP")) {
/*     */       
/* 338 */       moduleName = "GetPromotoreDistrettoByPromotoreCPMD";
/* 339 */       promotoreDistretto = (FinPromotoreDistretto)getBean(oPromotoreDistretto, FinPromotoreDistretto.class.getName());
/* 340 */       this.GENERIC_MODULE_RESULT = "PROMOTORE_DISTRETTO";
/*     */       
/* 342 */       paramMap.putAppl("CODICE_PROMOTORE", promotoreDistretto.getPromotore().getPromotoreId());
/*     */       
/*     */       try {
/* 345 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       }
/* 347 */       catch (HibernateObjectRetrievalFailureException e) {
/*     */         
/* 349 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 350 */         rse.setStackTrace(e.getStackTrace());
/* 351 */         throw rse;
/*     */       } 
/*     */       
/* 354 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 360 */     if (this.action.equals("GET_PROMOTORE_COORDINATA")) {
/*     */       
/* 362 */       moduleName = "GetPromotoreCoordinataMD";
/* 363 */       promotoreCoordinata = (FinPromotoreCoordinata)getBean(oPromotoreCoordinata, FinPromotoreCoordinata.class.getName());
/* 364 */       this.GENERIC_MODULE_RESULT = "PROMOTORE_COORDINATA";
/*     */       
/* 366 */       paramMap.putAppl("PROMOTORE_COORDINATA", promotoreCoordinata);
/*     */       
/*     */       try {
/* 369 */         getModuleManager().execModule(moduleName, paramMap);
/* 370 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 371 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 372 */         rse.setStackTrace(e.getStackTrace());
/* 373 */         throw rse;
/*     */       } 
/* 375 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 381 */     if (this.action.equals("GET_PROMOTORE_STRUTTURA")) {
/* 382 */       promotoreStruttura = (FinPromotoreStruttura)getBean(oPromotoreStruttura, FinPromotoreStruttura.class.getName());
/* 383 */       this.GENERIC_MODULE_RESULT = "PROMOTORE_STRUTTURA";
/*     */       
/* 385 */       paramMap.putAppl("PROMOTORE_PADRE", promotoreStruttura.getPromotorePadreId());
/* 386 */       paramMap.putAppl("PROMOTORE_FIGLIO", promotoreStruttura.getPromotoreFiglioId());
/* 387 */       paramMap.putAppl("DATA_INIZIO", promotoreStruttura.getDataInizio());
/* 388 */       moduleName = "GetPromotoreStrutturaMD";
/*     */       try {
/* 390 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 391 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 392 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 393 */         rse.setStackTrace(e.getStackTrace());
/* 394 */         throw rse;
/*     */       } 
/* 396 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 402 */     if (this.action.equals("INSERT_PROMOTORE")) {
/*     */       
/* 404 */       promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class.getName());
/* 405 */       moduleName = "InsertPromotoreMD";
/*     */       
/* 407 */       paramMap.putAppl("PROMOTORE", promotore);
/*     */       try {
/* 409 */         getModuleManager().execModule(moduleName, paramMap);
/* 410 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 411 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 412 */         rse.setStackTrace(e.getStackTrace());
/* 413 */         throw rse;
/*     */       } 
/* 415 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 421 */     if (this.action.equals("INSERT_PROMOTORE_AGENZIA")) {
/*     */       
/* 423 */       moduleName = "InsertPromotoreAgenziaMD";
/* 424 */       promotoreAgenzia = (FinPromotoreAgenzia)getBean(oPromotoreAgenzia, FinPromotoreAgenzia.class.getName());
/*     */       
/* 426 */       paramMap.putAppl("PROMOTORE_AGENZIA", promotoreAgenzia);
/*     */       
/*     */       try {
/* 429 */         getModuleManager().execModule(moduleName, paramMap);
/* 430 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 431 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 432 */         rse.setStackTrace(e.getStackTrace());
/* 433 */         throw rse;
/*     */       } 
/* 435 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 441 */     if (this.action.equals("INSERT_PROMOTORE_DISTRETTO")) {
/*     */       
/* 443 */       moduleName = "InsertPromotoreDistrettoMD";
/* 444 */       promotoreDistretto = (FinPromotoreDistretto)getBean(oPromotoreDistretto, FinPromotoreDistretto.class.getName());
/*     */       
/* 446 */       paramMap.putAppl("PROMOTORE_DISTRETTO", promotoreDistretto);
/*     */       
/*     */       try {
/* 449 */         getModuleManager().execModule(moduleName, paramMap);
/* 450 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 451 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 452 */         rse.setStackTrace(e.getStackTrace());
/* 453 */         throw rse;
/*     */       } 
/* 455 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 462 */     if (this.action.equals("INSERT_PROMOTORE_COORDINATA")) {
/*     */       
/* 464 */       moduleName = "InsertPromotoreCoordinataMD";
/* 465 */       promotoreCoordinata = (FinPromotoreCoordinata)getBean(oPromotoreCoordinata, FinPromotoreCoordinata.class.getName());
/*     */       
/* 467 */       paramMap.putAppl("PROMOTORE_COORDINATA", promotoreCoordinata);
/*     */       
/*     */       try {
/* 470 */         getModuleManager().execModule(moduleName, paramMap);
/* 471 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 472 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 473 */         rse.setStackTrace(e.getStackTrace());
/* 474 */         throw rse;
/*     */       } 
/* 476 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 482 */     if (this.action.equals("INSERT_PROMOTORE_STRUTTURA")) {
/*     */       
/* 484 */       promotoreStruttura = (FinPromotoreStruttura)getBean(oPromotoreStruttura, FinPromotoreStruttura.class.getName());
/* 485 */       moduleName = "InsertPromotoreStrutturaMD";
/*     */       
/* 487 */       paramMap.putAppl("PROMOTORE_STRUTTURA", promotoreStruttura);
/*     */       try {
/* 489 */         getModuleManager().execModule(moduleName, paramMap);
/* 490 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 491 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 492 */         rse.setStackTrace(e.getStackTrace());
/* 493 */         throw rse;
/*     */       } 
/* 495 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 501 */     if (this.action.equals("UPDATE_PROMOTORE")) {
/*     */       
/* 503 */       promotore = (FinPromotore)getBean(oPromotore, FinPromotore.class.getName());
/* 504 */       moduleName = "UpdatePromotoreMD";
/*     */       
/* 506 */       paramMap.putAppl("PROMOTORE", promotore);
/*     */       try {
/* 508 */         getModuleManager().execModule(moduleName, paramMap);
/* 509 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 510 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 511 */         rse.setStackTrace(e.getStackTrace());
/* 512 */         throw rse;
/*     */       } 
/* 514 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 520 */     if (this.action.equals("UPDATE_PROMOTORE_AGENZIA")) {
/*     */       
/* 522 */       moduleName = "UpdatePromotoreAgenziaMD";
/* 523 */       promotoreAgenzia = (FinPromotoreAgenzia)getBean(oPromotoreAgenzia, FinPromotoreAgenzia.class.getName());
/*     */       
/* 525 */       paramMap.putAppl("PROMOTORE_AGENZIA", promotoreAgenzia);
/*     */       
/*     */       try {
/* 528 */         getModuleManager().execModule(moduleName, paramMap);
/* 529 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 530 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 531 */         rse.setStackTrace(e.getStackTrace());
/* 532 */         throw rse;
/*     */       } 
/* 534 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 540 */     if (this.action.equals("UPDATE_PROMOTORE_DISTRETTO")) {
/*     */       
/* 542 */       moduleName = "UpdatePromotoreDistrettoMD";
/* 543 */       promotoreDistretto = (FinPromotoreDistretto)getBean(oPromotoreDistretto, FinPromotoreDistretto.class.getName());
/*     */       
/* 545 */       paramMap.putAppl("PROMOTORE_DISTRETTO", promotoreDistretto);
/*     */       
/*     */       try {
/* 548 */         getModuleManager().execModule(moduleName, paramMap);
/* 549 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 550 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 551 */         rse.setStackTrace(e.getStackTrace());
/* 552 */         throw rse;
/*     */       } 
/* 554 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 560 */     if (this.action.equals("UPDATE_PROMOTORE_COORDINATA")) {
/*     */       
/* 562 */       moduleName = "UpdatePromotoreCoordinataMD";
/* 563 */       promotoreCoordinata = (FinPromotoreCoordinata)getBean(oPromotoreCoordinata, FinPromotoreCoordinata.class.getName());
/*     */       
/* 565 */       paramMap.putAppl("PROMOTORE_COORDINATA", promotoreCoordinata);
/*     */       
/*     */       try {
/* 568 */         getModuleManager().execModule(moduleName, paramMap);
/* 569 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 570 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 571 */         rse.setStackTrace(e.getStackTrace());
/* 572 */         throw rse;
/*     */       } 
/* 574 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 580 */     if (this.action.equals("UPDATE_PROMOTORE_STRUTTURA")) {
/*     */       
/* 582 */       moduleName = "UpdatePromotoreStrutturaMD";
/* 583 */       promotoreStruttura = (FinPromotoreStruttura)getBean(oPromotoreStruttura, FinPromotoreStruttura.class.getName());
/*     */       
/* 585 */       paramMap.putAppl("PROMOTORE_STRUTTURA", promotoreStruttura);
/*     */       
/*     */       try {
/* 588 */         getModuleManager().execModule(moduleName, paramMap);
/* 589 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 590 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 591 */         rse.setStackTrace(e.getStackTrace());
/* 592 */         throw rse;
/*     */       } 
/* 594 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 599 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 600 */     if (this.log.isErrorEnabled()) {
/* 601 */       this.log.error(errorMessage);
/*     */     }
/* 603 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 609 */     if (this.action.equals("INSERT_PROMOTORE") || this.action.equals("INSERT_PROMOTORE_AGENZIA") || this.action.equals("INSERT_PROMOTORE_DISTRETTO") || this.action.equals("INSERT_PROMOTORE_COORDINATA") || this.action.equals("INSERT_PROMOTORE_STRUTTURA")) {
/* 610 */       resultMap.putAppl("RESULT", "INSERTED");
/* 611 */       return resultMap;
/*     */     } 
/*     */     
/* 614 */     if (this.action.equals("UPDATE_PROMOTORE") || this.action.equals("UPDATE_PROMOTORE_AGENZIA") || this.action.equals("UPDATE_PROMOTORE_DISTRETTO") || this.action.equals("UPDATE_PROMOTORE_COORDINATA") || this.action.equals("UPDATE_PROMOTORE_STRUTTURA")) {
/* 615 */       resultMap.putAppl("RESULT", "UPDATED");
/* 616 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 620 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/* 621 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 623 */     if (result.size() == 0) {
/* 624 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 626 */     else if (result.size() == 1) {
/* 627 */       resultMap.putAppl("RESULT", "FOUND");
/* 628 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result.get(0));
/*     */     }
/* 630 */     else if (allowMultipleRow) {
/* 631 */       resultMap.putAppl("RESULT", "FOUND");
/* 632 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result);
/*     */     } else {
/*     */       
/* 635 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/*     */     
/* 638 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 644 */     Object retObject = null;
/*     */     try {
/* 646 */       Class c = Class.forName(className);
/* 647 */       if (!c.isInstance(obj)) {
/* 648 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 649 */         if (this.log.isErrorEnabled()) {
/* 650 */           this.log.error(errorMessage);
/*     */         }
/* 652 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 654 */       retObject = obj;
/* 655 */     } catch (ClassNotFoundException e) {
/* 656 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 657 */       if (this.log.isErrorEnabled()) {
/* 658 */         this.log.error(errorMessage);
/*     */       }
/* 660 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 662 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 666 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 670 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PromotoreManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */