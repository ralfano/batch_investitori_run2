/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinEmittente;
/*     */ import it.ras.arco.bean.FinProdotto;
/*     */ import it.ras.arco.bean.FinProdottoLinea;
/*     */ import it.ras.arco.bean.FlxProdottiRam;
/*     */ import it.ras.flag.config.CodesTableManager;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.List;
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
/*     */ public class ProdottoAttFinManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String PRODOTTI_RAM = "PRODOTTI_RAM";
/*     */   public static final String CHIAVE_DECODIFICA = "CHIAVE_DECODIFICA";
/*     */   public static final String ROW_PRODOTTO = "ROW_PRODOTTO";
/*     */   public static final String LISTA_MERCATO = "LISTA_MERCATO";
/*     */   public static final String ROW_ATT_FIN = "ROW_ATT_FIN";
/*     */   public static final String ROW_EMITTENTE = "ROW_EMITTENTE";
/*     */   public static final String DESCRIZIONE = "DESCRIZIONE";
/*     */   public static final String DIVISA = "DIVISA";
/*     */   public static final String CTIT = "CTIT";
/*     */   public static final String ISIN = "ISIN";
/*     */   public static final String MARKET = "MARKET";
/*     */   public static final String RESULT_LIST = "RESULT_LIST";
/*     */   public static final String DATA = "DATA";
/*     */   public static final String INTERFACCIA = "INTERFACCIA";
/*     */   public static final String CODEMITTENTE = "CODEMITTENTE";
/*     */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*     */   public static final String GENERIC_MODULE_RESULT = "";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GetProdotto = "GetProdotto";
/*     */   public static final String ACTION_INSERT = "ACTION_INSERT";
/*     */   public static final String InsertProdottoMD = "InsertProdottoMD";
/*     */   public static final String InsertAttFinMD = "InsertAttFinMD";
/*     */   public static final String GetProdottoMod = "GetProdottoMD";
/*     */   public static final String GetAttFinByIsinCodMarketDivisa = "GetAttFinByIsinCodMarketDivisa";
/*     */   public static final String GetAttFinByIsin = "GetAttFinByIsin";
/*     */   public static final String UpdateFlxProdottiRamMD = "UpdateFlxProdottiRamMD";
/*     */   public static final String DECOD_ATT_FIN = "ATTIVITA_FINANZIARIA";
/*     */   public static final String DECOD_PRODOTTO = "CODICE_PRODOTTO";
/*     */   public static final String CODICE_ATT_FIN_ARCO = "CODICE_ATT_FIN_ARCO";
/*     */   public static final String CODICE_PRODOTTO_ARCO = "CODICE_PRODOTTO_ARCO";
/*     */   public static final String GET_BY_COD_COMPARTO_ESTERNO = "GetAttFinProdottoByCodiceCompartoEsterno";
/*     */   public static final String GET_BY_COD_PRODOTTO_ESTERNO = "GetAttFinProdottoByCodiceProdottoEsterno";
/*     */   public static final String GET_EMITTENTE_BY_DESCRIZIONE = "GetEmittenteByDescrizione";
/*     */   public static final String ROW_PRODOTTO_LINEA = "ROW_PRODOTTO_LINEA";
/*     */   public static final String GetAttFinByDescDt = "GetAttFinByDescDt";
/*     */   public static final String ACTION_INSERT_ATT_FIN_DT = "InsertAttFin";
/*     */   public static final String GET_BY_COD_FONDO_ESTERNO = "GetAttFinProdottoByCodiceFondoEsterno";
/*  96 */   private String action = null;
/*     */   
/*     */   private CodesTableManager codesTableManager;
/*     */   
/*     */   private boolean onLine;
/*     */   
/* 102 */   private Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 109 */     MapContainer resultMap = new MapContainer();
/* 110 */     MapContainer paramMap = new MapContainer();
/* 111 */     FinProdotto prodotto = (FinProdotto)map.getAppl("ROW_PRODOTTO");
/* 112 */     FinAttivitaFinanziaria attFin = (FinAttivitaFinanziaria)map.getAppl("ROW_ATT_FIN");
/* 113 */     FinEmittente emittente = (FinEmittente)map.getAppl("ROW_EMITTENTE");
/* 114 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/* 116 */     Boolean allowMultipleRows = null;
/* 117 */     if (oAllowMultipleRows == null) {
/* 118 */       oAllowMultipleRows = new Boolean(false);
/* 119 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/* 120 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio è di tipo errato.";
/* 121 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 123 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/* 125 */     if (this.action.equals("ACTION_INSERT")) {
/* 126 */       FlxProdottiRam flxProdRam = (FlxProdottiRam)map.getAppl("PRODOTTI_RAM");
/* 127 */       paramMap.putAppl("ROW_PRODOTTO", prodotto);
/* 128 */       getModuleManager().execModule("InsertProdottoMD", paramMap);
/* 129 */       paramMap.putAppl("ROW_ATT_FIN", attFin);
/* 130 */       getModuleManager().execModule("InsertAttFinMD", paramMap);
/* 131 */       flxProdRam.setProdotto(prodotto);
/* 132 */       flxProdRam.setAttivitaFin(attFin);
/* 133 */       paramMap.putAppl("PRODOTTI_RAM", flxProdRam);
/* 134 */       getModuleManager().execModule("UpdateFlxProdottiRamMD", paramMap);
/* 135 */       resultMap.putAppl("RESULT", "INSERTED");
/* 136 */     } else if (this.action.equals("InsertAttFin")) {
/* 137 */       paramMap.putAppl("ROW_ATT_FIN", attFin);
/* 138 */       getModuleManager().execModule("InsertAttFinMD", paramMap);
/* 139 */       resultMap.putAppl("RESULT", "INSERTED");
/*     */     }
/* 141 */     else if (this.action.equals("GetProdotto")) {
/* 142 */       resultMap = getModuleManager().execModule("GetProdottoMD", map);
/* 143 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), null);
/* 144 */       if (!resultMap.getAppl("RESULT").equals("FOUND"))
/* 145 */         throwOnLineError("errors.service.prodottoAttFinManager.notfound"); 
/*     */     } else {
/* 147 */       if (this.action.equals("GetAttFinProdottoByCodiceCompartoEsterno")) {
/* 148 */         String chiaveDecod = (String)map.getAppl("CHIAVE_DECODIFICA");
/* 149 */         String codiceEsternoComparto = attFin.getCodAttFinExt();
/* 150 */         String codiceIsin = attFin.getIsin();
/*     */         
/* 152 */         if ((codiceIsin == null || codiceIsin.trim().length() != 12) && 
/* 153 */           !setAttFinId(attFin, codiceEsternoComparto, chiaveDecod)) {
/* 154 */           String errorDescription = "Attività Finanziaria non trovata nella tabella di decodifica, codice Comparto: " + codiceEsternoComparto;
/*     */           
/* 156 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 157 */           paramMap.putAppl("RESULT", "NOT_FOUND");
/* 158 */           if (this.logger.isDebugEnabled()) {
/* 159 */             this.logger.debug(errorDescription);
/*     */           }
/* 161 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 162 */           return paramMap;
/*     */         } 
/*     */ 
/*     */         
/* 166 */         MapContainer paramAttFin = new MapContainer();
/* 167 */         paramAttFin.putAppl("ROW_ATT_FIN", attFin);
/* 168 */         paramAttFin.putAppl("ACTION", "CHECK_EXISTING");
/* 169 */         paramAttFin.putAppl("DATA", map.getAppl("DATA"));
/* 170 */         MapContainer resultAttFin = getModuleManager().execModule("GetProdottoMD", paramAttFin);
/* 171 */         if (!resultAttFin.getAppl("RESULT").equals("FOUND")) {
/* 172 */           String errorDescription = "Attività Finanziaria non trovata, attFinId: " + attFin.getAttivitaFinId();
/*     */           
/* 174 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 175 */           paramMap.putAppl("RESULT", "NOT_FOUND");
/* 176 */           if (this.logger.isDebugEnabled()) {
/* 177 */             this.logger.debug(errorDescription);
/*     */           }
/* 179 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 180 */           return paramMap;
/*     */         } 
/* 182 */         List listaAttFin = (List)resultAttFin.getAppl("RESULT_LIST");
/* 183 */         if (listaAttFin.size() == 0) {
/* 184 */           String errorDescription = "Prodotto non trovato, codice prodotto: " + codiceEsternoComparto + ", prodottoId: " + prodotto.getProdottoID();
/*     */ 
/*     */           
/* 187 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 188 */           paramMap.putAppl("RESULT", "TOO_MANY_ROWS");
/* 189 */           if (this.logger.isDebugEnabled()) {
/* 190 */             this.logger.debug(errorDescription);
/*     */           }
/* 192 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 193 */           return paramMap;
/*     */         } 
/* 195 */         attFin = listaAttFin.get(0);
/* 196 */         if (!attFin.getProdotto().isEmpty()) {
/* 197 */           prodotto = ((FinProdottoLinea)attFin.getProdotto().iterator().next()).getProdotto();
/*     */         }
/* 199 */         if (prodotto == null) {
/* 200 */           String errorDescription = "Prodotto non trovato, Att Fin Id: " + attFin.getAttivitaFinId();
/*     */           
/* 202 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 203 */           paramMap.putAppl("RESULT", "NOT_FOUND");
/* 204 */           if (this.logger.isDebugEnabled()) {
/* 205 */             this.logger.debug(errorDescription);
/*     */           }
/* 207 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 208 */           return paramMap;
/*     */         } 
/* 210 */         paramMap.putAppl("ROW_PRODOTTO", prodotto);
/* 211 */         paramMap.putAppl("ROW_ATT_FIN", attFin);
/* 212 */         paramMap.putAppl("RESULT", "FOUND");
/* 213 */         return paramMap;
/* 214 */       }  if (this.action.equals("GetAttFinProdottoByCodiceProdottoEsterno")) {
/* 215 */         String chiaveDecod = (String)map.getAppl("CHIAVE_DECODIFICA");
/* 216 */         String codiceEsternoProdotto = prodotto.getCodiceProdottoExt();
/* 217 */         attFin = null;
/*     */         
/* 219 */         if (!setProdottoId(prodotto, codiceEsternoProdotto, chiaveDecod)) {
/* 220 */           String errorDescription = "Prodotto non trovato nella tabella di decodifica, codice Prodotto: " + codiceEsternoProdotto;
/*     */           
/* 222 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 223 */           paramMap.putAppl("RESULT", "NOT_FOUND");
/* 224 */           if (this.logger.isDebugEnabled()) {
/* 225 */             this.logger.debug(errorDescription);
/*     */           }
/* 227 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 228 */           return paramMap;
/*     */         } 
/*     */         
/* 231 */         MapContainer paramProdotto = new MapContainer();
/* 232 */         paramProdotto.putAppl("ROW_PRODOTTO", prodotto);
/* 233 */         paramProdotto.putAppl("DATA", map.getAppl("DATA"));
/* 234 */         paramProdotto.putAppl("ACTION", "CHECK_EXISTING");
/* 235 */         MapContainer resultProdotto = getModuleManager().execModule("GetProdottoMD", paramProdotto);
/* 236 */         if (!resultProdotto.getAppl("RESULT").equals("FOUND")) {
/* 237 */           String errorDescription = "Prodotto non trovato, codice prodotto: " + codiceEsternoProdotto + ", prodottoId: " + prodotto.getProdottoID();
/*     */ 
/*     */           
/* 240 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 241 */           paramMap.putAppl("RESULT", "NOT_FOUND");
/* 242 */           if (this.logger.isDebugEnabled()) {
/* 243 */             this.logger.debug(errorDescription);
/*     */           }
/* 245 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 246 */           return paramMap;
/*     */         } 
/*     */         
/* 249 */         List listaProdotti = (List)resultProdotto.getAppl("RESULT_LIST");
/* 250 */         if (listaProdotti.size() == 0) {
/* 251 */           String errorDescription = "Prodotto non trovato, codice prodotto: " + codiceEsternoProdotto + ", prodottoId: " + prodotto.getProdottoID();
/*     */ 
/*     */           
/* 254 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 255 */           paramMap.putAppl("RESULT", "TOO_MANY_ROWS");
/* 256 */           if (this.logger.isDebugEnabled()) {
/* 257 */             this.logger.debug(errorDescription);
/*     */           }
/* 259 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 260 */           return paramMap;
/*     */         } 
/* 262 */         prodotto = listaProdotti.get(0);
/*     */         
/* 264 */         if (!prodotto.getAttFin().isEmpty()) {
/* 265 */           attFin = ((FinProdottoLinea)prodotto.getAttFin().iterator().next()).getAttFin();
/*     */         }
/* 267 */         if (attFin == null) {
/* 268 */           String errorDescription = "Attività finanziaria non trovata, Prodotto ID: " + prodotto.getProdottoID();
/*     */           
/* 270 */           paramMap.putAppl("GENERIC ERROR", errorDescription);
/* 271 */           paramMap.putAppl("RESULT", "NOT_FOUND");
/* 272 */           if (this.logger.isDebugEnabled()) {
/* 273 */             this.logger.debug(errorDescription);
/*     */           }
/* 275 */           throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/* 276 */           return paramMap;
/*     */         } 
/* 278 */         paramMap.putAppl("ROW_PRODOTTO", prodotto);
/* 279 */         paramMap.putAppl("ROW_ATT_FIN", attFin);
/* 280 */         paramMap.putAppl("RESULT", "FOUND");
/* 281 */         return paramMap;
/* 282 */       }  if (this.action.equals("GetEmittenteByDescrizione")) {
/* 283 */         String descrizione = emittente.getDescrizione();
/* 284 */         paramMap.putAppl("ROW_EMITTENTE", descrizione);
/* 285 */         resultMap = getModuleManager().execModule(this.action, paramMap);
/* 286 */         resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "ROW_EMITTENTE");
/*     */       
/*     */       }
/* 289 */       else if (this.action.equals("GetAttFinByDescDt")) {
/*     */         
/* 291 */         String descrizione = attFin.getDescrizione();
/* 292 */         paramMap.putAppl("DESCRIZIONE", descrizione);
/* 293 */         resultMap = getModuleManager().execModule("GetAttFinByDescDtMD", paramMap);
/* 294 */         resultMap = processResultMap(resultMap, true, "ROW_ATT_FIN");
/*     */       }
/* 296 */       else if (this.action.equals("GetAttFinByIsinCodMarketDivisa")) {
/*     */         
/* 298 */         String divisa = attFin.getDivisaQuot();
/* 299 */         String isin = attFin.getIsin();
/* 300 */         String codMarket = attFin.getCodMarket();
/* 301 */         paramMap.putAppl("DIVISA", divisa);
/* 302 */         paramMap.putAppl("ISIN", isin);
/* 303 */         paramMap.putAppl("MARKET", codMarket);
/* 304 */         resultMap = getModuleManager().execModule("GetAttFinByIsinCodMarketDivisaMD", paramMap);
/* 305 */         resultMap = processResultMap(resultMap, false, "ROW_ATT_FIN");
/*     */       }
/* 307 */       else if (this.action.equals("GetAttFinByIsinCodMarketListDivisaSRV")) {
/*     */         
/* 309 */         String divisa = attFin.getDivisaQuot();
/* 310 */         String isin = attFin.getIsin();
/* 311 */         String codMarketList = (String)map.getAppl("LISTA_MERCATO");
/* 312 */         paramMap.putAppl("DIVISA", divisa);
/* 313 */         paramMap.putAppl("ISIN", isin);
/* 314 */         paramMap.putAppl("MARKET", codMarketList);
/* 315 */         resultMap = getModuleManager().execModule("GetAttFinByIsinCodMarketListDivisaMD", paramMap);
/* 316 */         resultMap = processResultMap(resultMap, false, "ROW_ATT_FIN");
/*     */       }
/* 318 */       else if (this.action.equals("GetAttFinByCtitSRV")) {
/*     */         
/* 320 */         String ctit = attFin.getCodiceTitoloCad();
/*     */ 
/*     */         
/* 323 */         paramMap.putAppl("CTIT", ctit);
/*     */         
/* 325 */         resultMap = getModuleManager().execModule("GetAttFinByCtitMD", paramMap);
/* 326 */         resultMap = processResultMap(resultMap, true, "ROW_ATT_FIN");
/*     */       
/*     */       }
/* 329 */       else if (this.action.equals("GetAttFinByIsin")) {
/*     */         
/* 331 */         String isin = attFin.getIsin();
/*     */         
/* 333 */         paramMap.putAppl("ISIN", isin);
/*     */         
/* 335 */         resultMap = getModuleManager().execModule("GetAttFinByIsinMD", paramMap);
/* 336 */         resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "ROW_ATT_FIN");
/*     */       }
/*     */       else {
/*     */         
/* 340 */         String errorMessage = "L'azione passata al servizio è invalida o mancante. Action = '" + this.action + "'";
/* 341 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 343 */     }  return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private void throwOnLineError(String errorCode) throws RasServiceException {
/* 348 */     if (this.onLine) {
/* 349 */       RasServiceException error = new RasServiceException();
/* 350 */       error.addError(new RasValidationSignal(errorCode));
/* 351 */       throw error;
/*     */     } 
/*     */   }
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow, String genericModuleResult) throws RasServiceException {
/* 356 */     String resultMsg = (String)resultMap.getAppl("RESULT");
/* 357 */     if (this.action.equals("GetEmittenteByDescrizione") || this.action.equals("GetAttFinByCtitSRV") || this.action.equals("GetAttFinByDescDt") || this.action.equals("GetAttFinByIsinCodMarketDivisa") || this.action.equals("GetAttFinByIsin") || this.action.equals("GetAttFinByIsinCodMarketListDivisaSRV")) {
/* 358 */       List result = (List)resultMap.getAppl(genericModuleResult);
/* 359 */       if (result.size() == 0) {
/* 360 */         resultMap.putAppl("RESULT", "NOT_FOUND");
/* 361 */         throwOnLineError("errors.service.prodottoAttFinManager.notfound");
/*     */       
/*     */       }
/* 364 */       else if (allowMultipleRow) {
/* 365 */         resultMap.putAppl("RESULT", "FOUND");
/* 366 */         resultMap.putAppl(genericModuleResult, result);
/*     */       }
/* 368 */       else if (result.size() == 1) {
/* 369 */         resultMap.putAppl("RESULT", "FOUND");
/* 370 */         resultMap.putAppl(genericModuleResult, result.get(0));
/*     */       }
/*     */       else {
/*     */         
/* 374 */         resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/* 375 */         throwOnLineError("errors.service.prodottoAttFinManager.toManyRows");
/*     */       } 
/*     */     } else {
/*     */       
/* 379 */       resultMsg = (String)resultMap.getAppl("RESULT");
/* 380 */       List listaProdotti = null;
/* 381 */       if (resultMsg.equals("FOUND")) {
/* 382 */         listaProdotti = (List)resultMap.getAppl("RESULT_LIST");
/* 383 */         if (listaProdotti.size() > 1) {
/* 384 */           resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/* 385 */           return resultMap;
/* 386 */         }  if (listaProdotti.size() == 1) {
/* 387 */           resultMap.putAppl("RESULT_LIST", listaProdotti.get(0));
/* 388 */           return resultMap;
/*     */         } 
/*     */       } else {
/* 391 */         resultMap.putAppl("RESULT", "NOT_FOUND");
/* 392 */         return resultMap;
/*     */       } 
/*     */     } 
/* 395 */     return resultMap;
/*     */   }
/*     */   
/*     */   private boolean setAttFinId(FinAttivitaFinanziaria attFin, String codiceComparto, String keyDecod) {
/* 399 */     boolean retValue = true;
/*     */     try {
/* 401 */       String temp = (String)this.codesTableManager.decodeValue("ATTIVITA_FINANZIARIA", keyDecod, "CODICE_ATT_FIN_ARCO", codiceComparto);
/* 402 */       attFin.setAttivitaFinId(new Integer(temp));
/*     */     }
/* 404 */     catch (Exception e) {
/* 405 */       attFin = null;
/*     */     } 
/* 407 */     return retValue;
/*     */   }
/*     */   
/*     */   private boolean setProdottoId(FinProdotto prodotto, String codiceProdotto, String keyDecod) {
/* 411 */     boolean retValue = true;
/*     */     try {
/* 413 */       String temp = (String)this.codesTableManager.decodeValue("CODICE_PRODOTTO", keyDecod, "CODICE_PRODOTTO_ARCO", codiceProdotto);
/* 414 */       prodotto.setProdottoID(new Integer(temp));
/*     */     }
/* 416 */     catch (Exception e) {
/* 417 */       retValue = false;
/*     */     } 
/* 419 */     return retValue;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 423 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 427 */     this.action = action;
/*     */   }
/*     */   
/*     */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 431 */     this.codesTableManager = codesTableManager;
/*     */   }
/*     */   
/*     */   public CodesTableManager getCodesTableManager() {
/* 435 */     return this.codesTableManager;
/*     */   }
/*     */   
/*     */   public boolean isOnLine() {
/* 439 */     return this.onLine;
/*     */   }
/*     */   
/*     */   public void setOnLine(boolean onLine) {
/* 443 */     this.onLine = onLine;
/*     */   }
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\ProdottoAttFinManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */