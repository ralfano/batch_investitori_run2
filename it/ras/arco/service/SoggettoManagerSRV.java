/*      */ package it.ras.arco.service;
/*      */ 
/*      */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*      */ import it.ras.arco.bean.FinDecodNdgFabbrRam;
/*      */ import it.ras.arco.bean.FinDecodSoggettoSec;
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinSoggScheda;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.bean.FinSoggettoEsteso;
/*      */ import it.ras.arco.bean.FinSottoscrEmittente;
/*      */ import it.ras.arco.bean.FinSottoscrizione;
/*      */ import it.ras.arco.bean.NormSoggettoMC;
/*      */ import it.ras.arco.common.resources.Utility;
/*      */ import it.ras.arco.deduplicator.RasDeduplicator;
/*      */ import it.ras.arco.mei.EventTypeNotSupportedException;
/*      */ import it.ras.arco.mei.IFactoryLocator;
/*      */ import it.ras.arco.mei.SottoscrizioneInconsistenteException;
/*      */ import it.ras.arco.normalizer.RasNormalizer;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.service.AbstractRasService;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Collection;
/*      */ import java.util.Date;
/*      */ import java.util.Iterator;
/*      */ import java.util.Set;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ import org.springframework.orm.hibernate3.HibernateObjectRetrievalFailureException;
/*      */ 
/*      */ public class SoggettoManagerSRV
/*      */   extends AbstractRasService {
/*      */   public static final String CODICE_FISCALE = "CODICE_FISCALE";
/*      */   public static final String CODICE_ESTERNO = "CODICE_ESTERNO";
/*      */   public static final String CODICE_CLIENTE = "CODICE_CLIENTE";
/*      */   public static final String CODICE_SQUADRA = "CODICE_SQUADRA";
/*      */   public static final String PARTITA_IVA = "PARTITA_IVA";
/*      */   public static final String DENOMINAZIONE = "DENOMINAZIONE";
/*      */   public static final String FABBRICA = "FABBRICA";
/*      */   public static final String TIPO = "TIPO";
/*      */   public static final String SOGGETTO = "SOGGETTO";
/*      */   public static final String INDIRIZZO = "INDIRIZZO";
/*      */   public static final String PROMOTORE = "PROMOTORE";
/*      */   public static final String CODICE_PROMOTORE = "CODICE_PROMOTORE";
/*      */   public static final String DECOD_NDG_FABBR = "DECOD_NDG_FABBR";
/*      */   public static final String DECOD_NDG_FABBR_RAM = "DECOD_NDG_FABBR_RAM";
/*      */   public static final String DECOD_NDG_FABBR_RAM_SQUAD = "DECOD_NDG_FABBR_RAM_SQUAD";
/*      */   public static final String SEQUENCE_NDG_ARCO = "SEQUENCE_NDG_ARCO";
/*      */   public static final String SOGGETTO_DECOD_SEC = "SOGGETTO_DECOD_SEC";
/*      */   public static final String CODICE_FABBRICA = "CODICE_FABBRICA";
/*      */   public static final String NDG_FABBRICA = "NDG_FABBRICA";
/*      */   public static final String SOGGETTO_ID = "SOGGETTO_ID";
/*      */   public static final String NAME_SERVICE = "SOGGETTO_MANAGER_SRV";
/*      */   public static final String FORZATURA_CF = "FORZATURA_CF";
/*      */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*      */   public static final String GENERIC_MODULE_RESULT = "SOGGETTO";
/*      */   public static final String ATTIVITA_NULLA = "000";
/*      */   public static final String STATO_CENSIMENTO_DEFAULT = "0";
/*      */   public static final String STATO_CENSIMENTO = "STATO_CENSIMENTO";
/*      */   public static final String SOGGETTO_MC = "SOGGETTO_MC";
/*      */   public static final String InsertSoggettoMCMD = "InsertSoggettoMCMD";
/*      */   public static final String UpdateSoggettoMCMD = "UpdateSoggettoMCMD";
/*      */   public static final String INSERT_SOGG_SCHEDA = "INSERT_SOGG_SCHEDA";
/*      */   public static final String SOGGETTO_SCHEDA = "SOGGETTO_SCHEDA";
/*      */   public static final String InsSoggettoSchedaMD = "InsSoggettoSchedaMD";
/*      */   public static final String GET_BY_CODICE_FISCALE = "GET_BY_CODICE_FISCALE";
/*      */   public static final String GET_BY_CODICE_FISCALE_STATO_CENSIMENTO = "GET_BY_CODICE_FISCALE_STATO_CENSIMENTO";
/*      */   public static final String GET_BY_CODICE_FISCALE_DENOMINAZIONE = "GET_BY_CODICE_FISCALE_DENOMINAZIONE";
/*      */   public static final String GET_BY_PARTITA_IVA = "GET_BY_PARTITA_IVA";
/*      */   public static final String GET_BY_PARTITA_IVA_DENOMINAZIONE = "GET_BY_PARTITA_IVA_DENOMINAZIONE";
/*      */   public static final String GET_BY_CODICE_ESTERNO_FABBRICA = "GET_BY_CODICE_ESTERNO_FABBRICA";
/*      */   public static final String GET_BY_CODICE_ESTERNO_FABBRICA_TIPO = "GET_BY_CODICE_ESTERNO_FABBRICA_TIPO";
/*      */   public static final String GET_DECOD_BY_FABBR_NDG_FABBR = "GetDecodByFabbrNdgFab";
/*      */   public static final String GET_SQUADRA_BY_CODICE_ESTERNO_FABBRICA = "GET_SQUADRA_BY_CODICE_ESTERNO_FABBRICA";
/*      */   public static final String GET_PROMOTORE_BY_CODICE_PROMOTORE = "GET_PROMOTORE_BY_CODICE_PROMOTORE";
/*      */   public static final String GET_BY_COD_CLIENTE_COD_SQUADRA = "GET_BY_COD_CLIENTE_COD_SQUADRA";
/*      */   public static final String INSERT = "INSERT";
/*      */   public static final String CENSIMENTO = "CENSIMENTO";
/*      */   public static final String UPDATE = "UPDATE";
/*      */   public static final String UPDATE_DECOD = "UPDATE_DECOD";
/*      */   public static final String INSERT_SOGG_DECOD_SEC = "INSERT_SOGG_DECOD_SEC";
/*      */   public static final String GET_SOGG_DECOD_SEC = "GET_SOGG_DECOD_SEC";
/*      */   public static final String CONTROLLO_CF = "CONTROLLO_CF";
/*      */   public static final String NORMALIZZA_INDIRIZZO = "NORMALIZZA_INDIRIZZO";
/*      */   public static final String NORMALIZZA_SOGGETTO = "NORMALIZZA_SOGGETTO";
/*      */   public static final String NORMALIZZA_DEDUPLICA = "NORMALIZZA_DEDUPLICA";
/*      */   public static final String DEDUPLICA = "DEDUPLICA";
/*      */   public static final String NULL_ACTION = "Azione nulla";
/*   91 */   public static int EMPTY_NUMBER = (new Integer(0)).intValue();
/*      */   
/*   93 */   public static int NAME_2 = (new Integer(2)).intValue();
/*      */   
/*   95 */   public static int NAME_714 = (new Integer(714)).intValue();
/*      */   
/*   97 */   public static int CF_508 = (new Integer(508)).intValue();
/*      */   
/*   99 */   public static int CF_513 = (new Integer(508)).intValue();
/*      */   
/*  101 */   public static int CF_509 = (new Integer(509)).intValue();
/*      */   
/*  103 */   public static int CF_510 = (new Integer(510)).intValue();
/*      */   
/*  105 */   public static int CF_511 = (new Integer(511)).intValue();
/*      */   
/*  107 */   public static int CF_512 = (new Integer(512)).intValue();
/*      */   
/*  109 */   public static int CF_514 = (new Integer(514)).intValue();
/*      */   
/*  111 */   public static int CF_516 = (new Integer(516)).intValue();
/*      */   
/*  113 */   public static int CF_521 = (new Integer(521)).intValue();
/*      */   
/*  115 */   public static int CF_524 = (new Integer(524)).intValue();
/*      */   
/*  117 */   public static int PLACE_105 = (new Integer(105)).intValue();
/*      */   
/*  119 */   public static int STREET_203 = (new Integer(203)).intValue();
/*      */   
/*  121 */   public static int STREET_207 = (new Integer(207)).intValue();
/*      */   
/*  123 */   public static int STREET_208 = (new Integer(208)).intValue();
/*      */   
/*  125 */   public static int STREET_204 = (new Integer(204)).intValue();
/*      */   
/*  127 */   public static int STREET_205 = (new Integer(205)).intValue();
/*      */   
/*  129 */   private Log log = LogFactory.getLog(SoggettoManagerSRV.class);
/*      */   
/*  131 */   private String action = "ACTION";
/*      */   
/*  133 */   protected RasNormalizer normalizer = null;
/*      */   
/*  135 */   protected RasDeduplicator deduplicator = null;
/*      */   
/*  137 */   private IFactoryLocator factoryLocator = null;
/*      */   
/*  139 */   public static final String UTENTE_GSTD = Utility.getUtenteGstd(SoggettoManagerSRV.class);
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIsValidating(boolean isValidating) {}
/*      */ 
/*      */ 
/*      */   
/*      */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  148 */     MapContainer resultMap = new MapContainer();
/*  149 */     MapContainer paramMap = new MapContainer();
/*      */     
/*  151 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  152 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  153 */     Object oDecodNdgFabbr = map.getAppl("DECOD_NDG_FABBR");
/*  154 */     Object oDecodNdgFabbrRam = map.getAppl("DECOD_NDG_FABBR_RAM");
/*  155 */     Object oDecodNdgFabbrRamSquad = map.getAppl("DECOD_NDG_FABBR_RAM_SQUAD");
/*  156 */     Object oSoggettoSec = map.getAppl("SOGGETTO_DECOD_SEC");
/*  157 */     Object oIndirizzo = map.getAppl("INDIRIZZO");
/*  158 */     Object oSoggScheda = map.getAppl("SOGGETTO_SCHEDA");
/*  159 */     Object oForzatureCF = map.getAppl("FORZATURA_CF");
/*      */     
/*  161 */     Boolean allowMultipleRows = null;
/*  162 */     Boolean forzatureCF = null;
/*  163 */     String moduleName = null;
/*  164 */     FinSoggetto soggetto = null;
/*  165 */     FinDecodNdgFabbr decodNdgFabbr = null;
/*  166 */     FinDecodNdgFabbrRam decodNdgFabbrRam = null;
/*  167 */     FinDecodNdgFabbrRam decodNdgFabbrRamSquad = null;
/*  168 */     FinDecodSoggettoSec soggettoSec = null;
/*  169 */     FinIndirizzo indirizzo = null;
/*  170 */     FinSoggScheda soggScheda = null;
/*      */     
/*  172 */     if (oAllowMultipleRows == null) {
/*  173 */       oAllowMultipleRows = new Boolean(false);
/*  174 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  175 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*      */       
/*  177 */       if (this.log.isErrorEnabled()) {
/*  178 */         this.log.error(str);
/*      */       }
/*  180 */       throw new RasServiceException(str);
/*      */     } 
/*  182 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*      */     
/*  184 */     if (oForzatureCF == null) {
/*  185 */       oForzatureCF = new Boolean(false);
/*  186 */     } else if (!(oForzatureCF instanceof Boolean)) {
/*  187 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*      */       
/*  189 */       if (this.log.isErrorEnabled()) {
/*  190 */         this.log.error(str);
/*      */       }
/*  192 */       throw new RasServiceException(str);
/*      */     } 
/*  194 */     forzatureCF = (Boolean)oForzatureCF;
/*      */     
/*  196 */     if (this.action.equals("GET_BY_CODICE_FISCALE")) {
/*  197 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  199 */       String codiceFiscale = soggetto.getCodiceFiscale();
/*  200 */       paramMap.putAppl("CODICE_FISCALE", codiceFiscale);
/*  201 */       moduleName = "GetSoggettoByCodiceFiscale";
/*      */       try {
/*  203 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  204 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  205 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  207 */         rse.setStackTrace(e.getStackTrace());
/*  208 */         throw rse;
/*      */       } 
/*  210 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*  211 */     }  if (this.action.equals("GET_BY_CODICE_FISCALE_STATO_CENSIMENTO")) {
/*  212 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  214 */       String codiceFiscale = soggetto.getCodiceFiscale();
/*  215 */       String statoCensimento = "B";
/*  216 */       paramMap.putAppl("CODICE_FISCALE", codiceFiscale);
/*  217 */       paramMap.putAppl("STATO_CENSIMENTO", statoCensimento);
/*  218 */       moduleName = "GetSoggettoCFStatoCensimMD";
/*      */       try {
/*  220 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  221 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  222 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  224 */         rse.setStackTrace(e.getStackTrace());
/*  225 */         throw rse;
/*      */       } 
/*  227 */       return processResultMap(resultMap, true);
/*  228 */     }  if (this.action.equals("GET_BY_CODICE_FISCALE_DENOMINAZIONE")) {
/*  229 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  231 */       String codiceFiscale = soggetto.getCodiceFiscale();
/*  232 */       String denominazione = soggetto.getDenominazione();
/*  233 */       paramMap.putAppl("CODICE_FISCALE", codiceFiscale);
/*  234 */       paramMap.putAppl("DENOMINAZIONE", denominazione);
/*  235 */       moduleName = "GetSoggettoByCodiceFiscaleDenominazione";
/*      */       try {
/*  237 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  238 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  239 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  241 */         rse.setStackTrace(e.getStackTrace());
/*  242 */         throw rse;
/*      */       } 
/*  244 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*  245 */     }  if (this.action.equals("GET_BY_PARTITA_IVA")) {
/*  246 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  248 */       String partitaIva = soggetto.getPartitaIva();
/*  249 */       paramMap.putAppl("PARTITA_IVA", partitaIva);
/*  250 */       moduleName = "GetSoggettoByPartitaIva";
/*      */       try {
/*  252 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  253 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  254 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  256 */         rse.setStackTrace(e.getStackTrace());
/*  257 */         throw rse;
/*      */       } 
/*  259 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */     } 
/*      */     
/*  262 */     if (this.action.equals("GetDecodByFabbrNdgFab")) {
/*  263 */       decodNdgFabbr = (FinDecodNdgFabbr)getBean(oDecodNdgFabbr, FinDecodNdgFabbr.class.getName());
/*      */       
/*  265 */       String fabbrica = decodNdgFabbr.getFabbrica();
/*  266 */       String ndgFabbr = decodNdgFabbr.getNdgFab();
/*  267 */       paramMap.putAppl("FABBRICA", fabbrica);
/*  268 */       paramMap.putAppl("NDGFABBR", ndgFabbr);
/*      */       
/*  270 */       moduleName = "GetDecodByFabbricaNdgFabMD";
/*      */       try {
/*  272 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  273 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  274 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  276 */         rse.setStackTrace(e.getStackTrace());
/*  277 */         throw rse;
/*      */       } 
/*  279 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */     } 
/*      */     
/*  282 */     if (this.action.equals("GET_BY_PARTITA_IVA_DENOMINAZIONE")) {
/*  283 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  285 */       String partitaIva = soggetto.getPartitaIva();
/*  286 */       String denominazione = soggetto.getDenominazione();
/*  287 */       paramMap.putAppl("PARTITA_IVA", partitaIva);
/*  288 */       paramMap.putAppl("DENOMINAZIONE", denominazione);
/*  289 */       moduleName = "GetSoggettoByPartitaIvaDenominazione";
/*      */       try {
/*  291 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  292 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  293 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  295 */         rse.setStackTrace(e.getStackTrace());
/*  296 */         throw rse;
/*      */       } 
/*  298 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*  299 */     }  if (this.action.equals("GET_BY_CODICE_ESTERNO_FABBRICA")) {
/*  300 */       decodNdgFabbr = (FinDecodNdgFabbr)getBean(oDecodNdgFabbr, FinDecodNdgFabbr.class.getName());
/*      */       
/*  302 */       String codiceEsterno = decodNdgFabbr.getNdgFab();
/*  303 */       String fabbrica = decodNdgFabbr.getFabbrica();
/*  304 */       paramMap.putAppl("FABBRICA", fabbrica);
/*  305 */       paramMap.putAppl("CODICE_ESTERNO", codiceEsterno);
/*  306 */       moduleName = "GetSoggettoByCodiceEsterno_Fabbrica";
/*      */       try {
/*  308 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  309 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  310 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  312 */         rse.setStackTrace(e.getStackTrace());
/*  313 */         throw rse;
/*      */       } 
/*  315 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */     } 
/*      */     
/*  318 */     if (this.action.equals("GET_BY_CODICE_ESTERNO_FABBRICA_TIPO")) {
/*  319 */       decodNdgFabbr = (FinDecodNdgFabbr)getBean(oDecodNdgFabbr, FinDecodNdgFabbr.class.getName());
/*      */       
/*  321 */       String codiceEsterno = decodNdgFabbr.getNdgFab();
/*  322 */       String fabbrica = decodNdgFabbr.getFabbrica();
/*  323 */       String tipo = decodNdgFabbr.getTipo();
/*  324 */       paramMap.putAppl("FABBRICA", fabbrica);
/*  325 */       paramMap.putAppl("CODICE_ESTERNO", codiceEsterno);
/*  326 */       paramMap.putAppl("TIPO", tipo);
/*      */       
/*  328 */       moduleName = "GetSoggettoByCodiceEsterno_Fabbrica_Tipo";
/*      */       try {
/*  330 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  331 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  332 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  334 */         rse.setStackTrace(e.getStackTrace());
/*  335 */         throw rse;
/*      */       } 
/*  337 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */     } 
/*      */     
/*  340 */     if (this.action.equals("GET_SQUADRA_BY_CODICE_ESTERNO_FABBRICA")) {
/*  341 */       decodNdgFabbrRam = (FinDecodNdgFabbrRam)getBean(oDecodNdgFabbrRam, FinDecodNdgFabbrRam.class.getName());
/*      */       
/*  343 */       String codiceEsterno = decodNdgFabbrRam.getNdgFab();
/*  344 */       String fabbrica = decodNdgFabbrRam.getFabbrica();
/*  345 */       String tipo = decodNdgFabbrRam.getTipo();
/*      */       
/*  347 */       paramMap.putAppl("FABBRICA", fabbrica);
/*  348 */       paramMap.putAppl("CODICE_ESTERNO", codiceEsterno);
/*  349 */       paramMap.putAppl("TIPO", tipo);
/*  350 */       moduleName = "GetSquadraByCodiceEsterno_Fabbrica";
/*      */       try {
/*  352 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  353 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  354 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  356 */         rse.setStackTrace(e.getStackTrace());
/*  357 */         throw rse;
/*      */       } 
/*  359 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*  360 */     }  if (this.action.equals("GET_BY_COD_CLIENTE_COD_SQUADRA")) {
/*  361 */       decodNdgFabbrRam = (FinDecodNdgFabbrRam)getBean(oDecodNdgFabbrRam, FinDecodNdgFabbrRam.class.getName());
/*      */       
/*  363 */       decodNdgFabbrRamSquad = (FinDecodNdgFabbrRam)getBean(oDecodNdgFabbrRamSquad, FinDecodNdgFabbrRam.class.getName());
/*      */       
/*  365 */       String codiceCliente = decodNdgFabbrRam.getNdgFab();
/*  366 */       String codiceSquadra = decodNdgFabbrRamSquad.getNdgFab();
/*      */       
/*  368 */       paramMap.putAppl("CODICE_SQUADRA", codiceSquadra);
/*  369 */       paramMap.putAppl("CODICE_CLIENTE", codiceCliente);
/*  370 */       moduleName = "GetSoggettoByCodiceSquadra_CodiceClienteMD";
/*      */       try {
/*  372 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  373 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  374 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  376 */         rse.setStackTrace(e.getStackTrace());
/*  377 */         throw rse;
/*      */       } 
/*  379 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */     } 
/*      */     
/*  382 */     if (this.action.equals("NORMALIZZA_SOGGETTO")) {
/*  383 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  385 */       this.normalizer.setForzaturaCF(forzatureCF.booleanValue());
/*  386 */       resultMap = this.normalizer.normalizeSubject(soggetto);
/*  387 */       return resultMap;
/*  388 */     }  if (this.action.equals("NORMALIZZA_DEDUPLICA")) {
/*  389 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  391 */       indirizzo = (FinIndirizzo)oIndirizzo;
/*  392 */       decodNdgFabbr = (FinDecodNdgFabbr)oDecodNdgFabbr;
/*      */       
/*  394 */       if (soggetto.getAttivita() == null) {
/*  395 */         soggetto.setAttivita("000");
/*      */       }
/*      */       
/*  398 */       String resultAdress = "EXECUTED";
/*      */       
/*  400 */       FinSoggetto soggettoTrovato = null;
/*      */       
/*  402 */       String resultSogg = null;
/*      */       
/*  404 */       String resultDeduplica = null;
/*      */       
/*  406 */       this.normalizer.setForzaturaCF(forzatureCF.booleanValue());
/*  407 */       resultMap = this.normalizer.normalizeSubject(soggetto);
/*  408 */       soggetto = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*  409 */       resultSogg = (String)resultMap.getAppl("RESULT");
/*      */       
/*  411 */       if (indirizzo != null) {
/*  412 */         resultMap = this.normalizer.normalizeAdress(indirizzo);
/*  413 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*  414 */         resultAdress = (String)resultMap.getAppl("RESULT");
/*      */       } 
/*      */       
/*  417 */       if (!resultSogg.equals("EXECUTED") || !resultAdress.equals("EXECUTED") || !resultSogg.equals("WARNING")) {
/*      */         
/*  419 */         resultMap.putAppl("RESULT", "NOT_EXECUTED");
/*      */         
/*  421 */         return resultMap;
/*      */       } 
/*      */       
/*  424 */       resultMap = this.deduplicator.deduplicate(soggetto, indirizzo, decodNdgFabbr);
/*      */       
/*  426 */       soggettoTrovato = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*  427 */       resultDeduplica = (String)resultMap.getAppl("RESULT");
/*      */       
/*  429 */       if (resultDeduplica.equals("FOUND")) {
/*  430 */         resultMap.putAppl("SOGGETTO", soggettoTrovato);
/*      */       } else {
/*  432 */         resultMap.putAppl("SOGGETTO", soggetto);
/*      */       } 
/*  434 */       resultMap.putAppl("INDIRIZZO", indirizzo);
/*  435 */       resultMap.putAppl("RESULT", resultDeduplica);
/*  436 */       return resultMap;
/*      */     } 
/*  438 */     if (this.action.equals("NORMALIZZA_INDIRIZZO")) {
/*  439 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class.getName());
/*      */       
/*  441 */       resultMap = this.normalizer.normalizeAdress(indirizzo);
/*  442 */       return resultMap;
/*  443 */     }  if (this.action.equals("CONTROLLO_CF")) {
/*  444 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  446 */       String result = null;
/*  447 */       result = this.normalizer.verifyCF(soggetto);
/*  448 */       resultMap.putAppl("RESULT", result);
/*  449 */       return resultMap;
/*  450 */     }  if (this.action.equals("CENSIMENTO")) {
/*      */       
/*  452 */       String ErrorMessageSogg = "";
/*  453 */       String ErrorMessageInd = "";
/*  454 */       String messageSogg = null;
/*  455 */       String messageInd = null;
/*  456 */       MapContainer resultCheckNorm = null;
/*  457 */       boolean isWarning = false;
/*      */       
/*  459 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  461 */       indirizzo = (FinIndirizzo)oIndirizzo;
/*  462 */       decodNdgFabbr = (FinDecodNdgFabbr)oDecodNdgFabbr;
/*      */       
/*  464 */       if (soggetto.getAttivita() == null) {
/*  465 */         soggetto.setAttivita("000");
/*      */       }
/*      */       
/*  468 */       if (soggetto.getStatoCensim() == null) {
/*  469 */         soggetto.setStatoCensim("0");
/*      */       }
/*      */       
/*  472 */       String resultSogg = null;
/*      */       
/*  474 */       String resultInd = null;
/*      */       
/*  476 */       String resultDeduplica = null;
/*      */       
/*  478 */       String resultMessage = null;
/*      */       
/*  480 */       FinSoggetto soggettoTrovato = null;
/*      */       
/*  482 */       this.normalizer.setForzaturaCF(forzatureCF.booleanValue());
/*  483 */       resultMap = this.normalizer.normalizeSubject(soggetto);
/*  484 */       soggetto = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*      */       
/*  486 */       resultCheckNorm = controlloErrori(resultMap);
/*  487 */       messageSogg = (String)resultCheckNorm.getAppl("RESULT");
/*      */       
/*  489 */       ErrorMessageSogg = (String)resultCheckNorm.getAppl("RESULT_MESSAGE");
/*      */       
/*  491 */       if (messageSogg.equals("WARNING")) {
/*  492 */         isWarning = true;
/*  493 */         if (soggetto.getTipoSogg().equals("F")) {
/*  494 */           soggetto.setDenominazione(null);
/*  495 */           soggetto.setPartitaIva(null);
/*      */         }
/*  497 */         else if (soggetto.getTipoSogg().equals("G")) {
/*      */           
/*  499 */           soggetto.setCognome(null);
/*  500 */           soggetto.setNome(null);
/*  501 */           soggetto.setCodiceFiscale(null);
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  506 */       if (messageSogg.equals("OK") || messageSogg.equals("WARNING")) {
/*      */         
/*  508 */         resultSogg = "EXECUTED";
/*      */       }
/*      */       else {
/*      */         
/*  512 */         resultSogg = "NOT_EXECUTED";
/*      */       } 
/*      */       
/*  515 */       ErrorMessageSogg = "ERROR_SUBJECT " + ErrorMessageSogg;
/*      */       
/*  517 */       if (resultSogg.equals("NOT_EXECUTED")) {
/*  518 */         resultMap.putAppl("RESULT", "NOT_EXECUTED");
/*      */         
/*  520 */         resultMap.putAppl("RESULT_MESSAGE", ErrorMessageSogg);
/*      */         
/*  522 */         return resultMap;
/*      */       } 
/*  524 */       if (indirizzo != null) {
/*  525 */         resultMap = this.normalizer.normalizeAdress(indirizzo);
/*      */         
/*  527 */         resultCheckNorm = controlloErrori(resultMap);
/*  528 */         messageInd = (String)resultCheckNorm.getAppl("RESULT");
/*      */         
/*  530 */         ErrorMessageInd = (String)resultCheckNorm.getAppl("RESULT_MESSAGE");
/*      */         
/*  532 */         if (messageInd.equals("WARNING")) {
/*  533 */           isWarning = true;
/*      */         }
/*      */         
/*  536 */         if (messageInd.equals("OK") || messageInd.equals("WARNING")) {
/*      */           
/*  538 */           resultInd = "EXECUTED";
/*      */         } else {
/*      */           
/*  541 */           resultInd = "NOT_EXECUTED";
/*      */         } 
/*      */         
/*  544 */         ErrorMessageInd = "ERROR_ADRESS " + ErrorMessageInd;
/*  545 */         indirizzo = (FinIndirizzo)resultMap.getAppl("INDIRIZZO");
/*      */         
/*  547 */         if (resultInd.equals("NOT_EXECUTED")) {
/*  548 */           resultMap.putAppl("RESULT", "NOT_EXECUTED");
/*      */           
/*  550 */           resultMessage = ErrorMessageInd;
/*  551 */           resultMap.putAppl("RESULT_MESSAGE", resultMessage);
/*      */           
/*  553 */           return resultMap;
/*      */         } 
/*      */       } 
/*      */ 
/*      */       
/*  558 */       if (soggetto.getNdgArco() == null) {
/*  559 */         soggetto.setNdgArco(getNdgArco());
/*      */       }
/*      */       
/*  562 */       resultMap = this.deduplicator.deduplicate(soggetto, indirizzo, decodNdgFabbr);
/*      */       
/*  564 */       soggettoTrovato = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*  565 */       resultDeduplica = (String)resultMap.getAppl("RESULT");
/*      */       
/*  567 */       resultMessage = (String)resultMap.getAppl("RESULT_MESSAGE");
/*      */       
/*  569 */       paramMap = new MapContainer();
/*      */       
/*  571 */       if (resultDeduplica.equals("NOT_FOUND")) {
/*  572 */         paramMap.putAppl("SOGGETTO", soggetto);
/*      */         
/*  574 */         insertSubject(soggetto);
/*      */         
/*  576 */         if (decodNdgFabbr != null) {
/*  577 */           insertDecoNdgFabbr(decodNdgFabbr);
/*      */         }
/*  579 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */         
/*  581 */         resultMap.putAppl("SOGGETTO", soggetto);
/*  582 */       } else if (resultDeduplica.equals("FOUND")) {
/*  583 */         boolean isDominant = isDominant(soggetto, soggettoTrovato);
/*  584 */         if (isDominant) {
/*      */           
/*  586 */           soggettoTrovato = soggettoTrovato.copyFields(soggetto);
/*  587 */           soggettoTrovato.setIsDominant(new Boolean(true));
/*      */           
/*  589 */           updateSubject(soggettoTrovato);
/*  590 */           resultMap.putAppl("RESULT", "UPDATED");
/*      */         } else {
/*      */           
/*  593 */           soggettoTrovato.setIsDominant(new Boolean(false));
/*      */           
/*  595 */           resultMap.putAppl("RESULT", "FOUND");
/*      */         } 
/*      */         
/*  598 */         if (decodNdgFabbr != null && resultMessage.equals("NOT_BY_DECOD_NDG_FABBR")) {
/*      */           
/*  600 */           decodNdgFabbr.setSoggetto(soggettoTrovato);
/*  601 */           insertDecoNdgFabbr(decodNdgFabbr);
/*      */         } 
/*      */         
/*  604 */         resultMap.putAppl("SOGGETTO", soggettoTrovato);
/*      */       }
/*      */       else {
/*      */         
/*  608 */         resultMap.putAppl("RESULT", "GENERIC ERROR");
/*      */       } 
/*      */       
/*  611 */       resultMap.putAppl("INDIRIZZO", indirizzo);
/*  612 */       if (isWarning) {
/*  613 */         resultMap.putAppl("NORMALIZER_MESSAGE", ErrorMessageSogg + " " + ErrorMessageInd);
/*      */       }
/*      */       
/*  616 */       return resultMap;
/*      */     } 
/*  618 */     if (this.action.equals("INSERT")) {
/*  619 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*      */       try {
/*  622 */         normalizzaSottoscrizioneEmittente((FinSottoscrizione)map.getAppl("SOTTOSCRIZIONE"));
/*      */       }
/*  624 */       catch (Exception e) {}
/*      */ 
/*      */       
/*  627 */       if (soggetto.getAttivita() == null) {
/*  628 */         soggetto.setAttivita("000");
/*      */       }
/*      */       
/*  631 */       if (soggetto.getStatoCensim() == null) {
/*  632 */         soggetto.setStatoCensim("0");
/*      */       }
/*      */       
/*  635 */       return insertSubject(soggetto);
/*  636 */     }  if (this.action.equals("UPDATE")) {
/*  637 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*      */       try {
/*  640 */         normalizzaSottoscrizioneEmittente((FinSottoscrizione)map.getAppl("SOTTOSCRIZIONE"));
/*      */       }
/*  642 */       catch (Exception e) {}
/*      */       
/*  644 */       if (soggetto.getAttivita() == null) {
/*  645 */         soggetto.setAttivita("000");
/*      */       }
/*  647 */       return updateSubject(soggetto);
/*  648 */     }  if (this.action.equals("UPDATE_DECOD")) {
/*  649 */       decodNdgFabbr = (FinDecodNdgFabbr)getBean(oDecodNdgFabbr, FinDecodNdgFabbr.class.getName());
/*      */       
/*  651 */       paramMap.putAppl("DECOD_NDG_FABBR", decodNdgFabbr);
/*      */       try {
/*  653 */         getModuleManager().execModule("UpdateDecodMD", paramMap);
/*      */       }
/*  655 */       catch (HibernateObjectRetrievalFailureException e) {
/*  656 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  657 */         rse.setStackTrace(e.getStackTrace());
/*  658 */         throw rse;
/*      */       } 
/*  660 */       resultMap.putAppl("RESULT", "UPDATED");
/*  661 */       return resultMap;
/*      */     } 
/*  663 */     if (this.action.equals("INSERT_DECOD_NDG_FABB")) {
/*  664 */       decodNdgFabbr = (FinDecodNdgFabbr)getBean(oDecodNdgFabbr, FinDecodNdgFabbr.class.getName());
/*      */       
/*  666 */       return insertDecoNdgFabbr(decodNdgFabbr);
/*  667 */     }  if (this.action.equals("INSERT_SOGG_DECOD_SEC")) {
/*  668 */       moduleName = "InsertSoggettoDecodSecMD";
/*  669 */       soggettoSec = (FinDecodSoggettoSec)getBean(oSoggettoSec, FinDecodSoggettoSec.class.getName());
/*      */       
/*  671 */       paramMap.putAppl("SOGGETTO_DECOD_SEC", soggettoSec);
/*  672 */       getModuleManager().execModule(moduleName, paramMap);
/*  673 */       resultMap = new MapContainer();
/*  674 */       resultMap.putAppl("RESULT", "UPDATED");
/*  675 */       return resultMap;
/*      */     } 
/*  677 */     if (this.action.equals("GET_SOGG_DECOD_SEC")) {
/*  678 */       soggettoSec = (FinDecodSoggettoSec)getBean(oSoggettoSec, FinDecodSoggettoSec.class.getName());
/*      */       
/*  680 */       String codiceFabbrica = soggettoSec.getCodiceFabbricaCorr();
/*  681 */       String ndgFabbrica = soggettoSec.getNdgFabbrica();
/*  682 */       Integer soggettoId = soggettoSec.getSoggettoId();
/*  683 */       paramMap.putAppl("SOGGETTO_ID", soggettoId);
/*  684 */       paramMap.putAppl("CODICE_FABBRICA", codiceFabbrica);
/*  685 */       paramMap.putAppl("NDG_FABBRICA", ndgFabbrica);
/*  686 */       moduleName = "GetSoggettoSecBySoggettoId";
/*      */       try {
/*  688 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  689 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  690 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*      */         
/*  692 */         rse.setStackTrace(e.getStackTrace());
/*  693 */         throw rse;
/*      */       } 
/*  695 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */     } 
/*  697 */     if (this.action.equals("INSERT_SOGG_SCHEDA")) {
/*  698 */       moduleName = "InsSoggettoSchedaMD";
/*  699 */       soggScheda = (FinSoggScheda)getBean(oSoggScheda, FinSoggScheda.class.getName());
/*      */       
/*  701 */       paramMap.putAppl("SOGGETTO_SCHEDA", soggScheda);
/*  702 */       getModuleManager().execModule(moduleName, paramMap);
/*  703 */       resultMap = new MapContainer();
/*  704 */       resultMap.putAppl("RESULT", "INSERTED");
/*  705 */       return resultMap;
/*      */     } 
/*  707 */     if (this.action.equals("DEDUPLICA")) {
/*  708 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*      */       
/*  710 */       indirizzo = (FinIndirizzo)oIndirizzo;
/*  711 */       decodNdgFabbr = (FinDecodNdgFabbr)oDecodNdgFabbr;
/*  712 */       String resultMessage = null;
/*      */       
/*  714 */       if (soggetto.getAttivita() == null) {
/*  715 */         soggetto.setAttivita("000");
/*      */       }
/*      */       
/*  718 */       String resultDeduplica = null;
/*      */       
/*  720 */       resultMap = new MapContainer();
/*  721 */       paramMap = new MapContainer();
/*      */       
/*  723 */       FinSoggetto soggettoTrovato = null;
/*      */       
/*  725 */       if (soggetto.getNdgArco() == null) {
/*  726 */         soggetto.setNdgArco(getNdgArco());
/*      */       }
/*      */       
/*  729 */       resultMap = this.deduplicator.deduplicate(soggetto, indirizzo, decodNdgFabbr);
/*      */       
/*  731 */       soggettoTrovato = (FinSoggetto)resultMap.getAppl("SOGGETTO");
/*  732 */       resultDeduplica = (String)resultMap.getAppl("RESULT");
/*      */       
/*  734 */       resultMessage = (String)resultMap.getAppl("RESULT_MESSAGE");
/*      */       
/*  736 */       resultMap = new MapContainer();
/*  737 */       paramMap = new MapContainer();
/*      */       
/*  739 */       if (resultDeduplica.equals("NOT_FOUND")) {
/*  740 */         paramMap.putAppl("SOGGETTO", soggetto);
/*      */         
/*  742 */         insertSubject(soggetto);
/*      */         
/*  744 */         if (decodNdgFabbr != null) {
/*  745 */           insertDecoNdgFabbr(decodNdgFabbr);
/*      */         }
/*  747 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */         
/*  749 */         resultMap.putAppl("SOGGETTO", soggetto);
/*  750 */       } else if (resultDeduplica.equals("FOUND")) {
/*  751 */         boolean isDominant = isDominant(soggetto, soggettoTrovato);
/*  752 */         if (isDominant) {
/*      */           
/*  754 */           soggettoTrovato = soggettoTrovato.copyFields(soggetto);
/*  755 */           soggettoTrovato.setIsDominant(new Boolean(true));
/*      */           
/*  757 */           updateSubject(soggettoTrovato);
/*  758 */           resultMap.putAppl("RESULT", "UPDATED");
/*      */         } else {
/*      */           
/*  761 */           soggettoTrovato.setIsDominant(new Boolean(false));
/*      */           
/*  763 */           resultMap.putAppl("RESULT", "FOUND");
/*      */         } 
/*      */         
/*  766 */         if (decodNdgFabbr != null && resultMessage.equals("NOT_BY_DECOD_NDG_FABBR")) {
/*      */           
/*  768 */           decodNdgFabbr.setSoggetto(soggettoTrovato);
/*  769 */           insertDecoNdgFabbr(decodNdgFabbr);
/*      */         } 
/*      */         
/*  772 */         resultMap.putAppl("SOGGETTO", soggettoTrovato);
/*      */       }
/*      */       else {
/*      */         
/*  776 */         resultMap.putAppl("RESULT", "GENERIC ERROR");
/*      */       } 
/*      */       
/*  779 */       resultMap.putAppl("INDIRIZZO", indirizzo);
/*  780 */       return resultMap;
/*      */     } 
/*  782 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*      */     
/*  784 */     if (this.log.isErrorEnabled()) {
/*  785 */       this.log.error(errorMessage);
/*      */     }
/*  787 */     throw new RasServiceException(errorMessage);
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean isDominant(FinSoggetto soggettoEsterno, FinSoggetto soggettoDatabase) throws RasServiceException {
/*      */     String ndgSource, ndgDest;
/*  793 */     int source = -1, dest = -1;
/*      */     
/*  795 */     if (soggettoEsterno.getProvDatiAnag() != null) {
/*  796 */       ndgSource = soggettoEsterno.getProvDatiAnag();
/*      */     } else {
/*  798 */       if (this.log.isErrorEnabled()) {
/*  799 */         this.log.error("Attenzione: fabbrica di appartenenza del soggetto esterno non trovata");
/*      */       }
/*      */       
/*  802 */       throw new RasServiceException("Attenzione: fabbrica di appartenenza del soggetto esterno non trovata");
/*      */     } 
/*      */ 
/*      */     
/*  806 */     if (soggettoDatabase.getProvDatiAnag() != null) {
/*  807 */       ndgDest = soggettoDatabase.getProvDatiAnag();
/*      */     } else {
/*  809 */       if (this.log.isErrorEnabled()) {
/*  810 */         this.log.error("Attenzione: fabbrica di appartenenza del soggetto presente non trovata");
/*      */       }
/*      */       
/*  813 */       throw new RasServiceException("Attenzione: fabbrica di appartenenza del soggetto presente non trovata");
/*      */     } 
/*      */     
/*  816 */     if (ndgSource.equals("ARCO")) {
/*  817 */       source = 6;
/*  818 */     } else if (ndgSource.equals("ANT")) {
/*  819 */       source = 5;
/*  820 */     } else if (ndgSource.equals("SEC")) {
/*  821 */       source = 4;
/*  822 */     } else if (ndgSource.equals("RAM")) {
/*  823 */       source = 3;
/*  824 */     } else if (ndgSource.equals("RBVITA")) {
/*  825 */       source = 2;
/*  826 */     } else if (ndgSource.equals("DARTA_SAV")) {
/*  827 */       source = 1;
/*      */     } else {
/*  829 */       source = 0;
/*      */     } 
/*      */     
/*  832 */     if (ndgDest.equals("ARCO")) {
/*  833 */       dest = 6;
/*  834 */     } else if (ndgDest.equals("ANT")) {
/*  835 */       dest = 5;
/*  836 */     } else if (ndgDest.equals("SEC")) {
/*  837 */       dest = 4;
/*  838 */     } else if (ndgDest.equals("RAM")) {
/*  839 */       dest = 3;
/*  840 */     } else if (ndgDest.equals("RBVITA")) {
/*  841 */       dest = 2;
/*  842 */     } else if (ndgDest.equals("DARTA_SAV")) {
/*  843 */       dest = 1;
/*      */     } else {
/*  845 */       dest = 0;
/*      */     } 
/*  847 */     if (source >= dest) {
/*  848 */       return true;
/*      */     }
/*  850 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer updateSubject(FinSoggetto soggetto) throws RasServiceException {
/*  855 */     MapContainer resultMap = new MapContainer();
/*  856 */     MapContainer paramMap = new MapContainer();
/*  857 */     String moduleName = null;
/*      */     
/*  859 */     moduleName = "UpdateSoggettoMD";
/*  860 */     paramMap.putAppl("SOGGETTO", soggetto);
/*  861 */     getModuleManager().execModule(moduleName, paramMap);
/*      */     
/*  863 */     if (soggetto.getAttivita() == null) {
/*  864 */       soggetto.setAttivita("000");
/*      */     }
/*      */     
/*  867 */     if (!soggetto.getTipoSogg().equals("C")) {
/*  868 */       NormSoggettoMC normSoggettoMC = soggetto.getSoggettoMC();
/*  869 */       if (normSoggettoMC != null) {
/*  870 */         FinSoggettoEsteso soggettoEsteso = new FinSoggettoEsteso(soggetto);
/*      */         
/*  872 */         normSoggettoMC = soggettoEsteso.toSoggettoMC(normSoggettoMC);
/*  873 */         ArchUtils.setStdFields(normSoggettoMC, "U", "SOGGETTO_MANAGER_SRV");
/*      */         
/*  875 */         paramMap.putAppl("SOGGETTO_MC", normSoggettoMC);
/*  876 */         moduleName = "UpdateSoggettoMCMD";
/*  877 */         getModuleManager().execModule(moduleName, paramMap);
/*      */       }
/*  879 */       else if (this.log.isWarnEnabled()) {
/*  880 */         this.log.warn("Update non effettuata nella tabella NORM_SOGGETTO_MC. Record in relazione con la FIN_SOGGETTO assente");
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  885 */     resultMap.putAppl("RESULT", "UPDATED");
/*  886 */     return resultMap;
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer insertSubject(FinSoggetto soggetto) throws RasServiceException {
/*  891 */     MapContainer resultMap = new MapContainer();
/*  892 */     MapContainer paramMap = new MapContainer();
/*  893 */     String moduleName = "InsertSoggettoMD";
/*      */     
/*  895 */     if (soggetto.getAttivita() == null) {
/*  896 */       soggetto.setAttivita("000");
/*      */     }
/*      */     
/*  899 */     if (soggetto.getNdgArco() == null && !soggetto.getTipoSogg().equals("C"))
/*      */     {
/*  901 */       soggetto.setNdgArco(getNdgArco());
/*      */     }
/*      */     
/*  904 */     paramMap.putAppl("SOGGETTO", soggetto);
/*  905 */     getModuleManager().execModule(moduleName, paramMap);
/*      */     
/*  907 */     if (!soggetto.getTipoSogg().equals("C")) {
/*      */       
/*  909 */       FinSoggettoEsteso soggettoEsteso = new FinSoggettoEsteso(soggetto);
/*      */       
/*  911 */       NormSoggettoMC normSoggettoMC = soggettoEsteso.toSoggettoMC();
/*      */       
/*  913 */       normSoggettoMC.setSoggetto(soggetto);
/*  914 */       normSoggettoMC.setDataInserimento(new Date());
/*  915 */       normSoggettoMC.setUtenteInserimento(soggetto.getUtenteInserimento());
/*      */       
/*  917 */       ArchUtils.setStdFields(normSoggettoMC, "I", "SOGGETTO_MANAGER_SRV");
/*      */       
/*  919 */       paramMap.putAppl("SOGGETTO_MC", normSoggettoMC);
/*  920 */       moduleName = "InsertSoggettoMCMD";
/*  921 */       getModuleManager().execModule(moduleName, paramMap);
/*      */     } 
/*      */     
/*  924 */     resultMap = new MapContainer();
/*  925 */     resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/*      */     
/*  927 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void normalizzaSottoscrizioneEmittente(FinSottoscrizione sottoscrizione) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException {
/*  933 */     Log logger = LogFactory.getLog(getClass());
/*      */     
/*  935 */     if (getFactoryLocator() == null || sottoscrizione == null) {
/*  936 */       if (logger.isDebugEnabled()) {
/*  937 */         logger.debug("L'IFactoryLocator non e' stato collegato al Servizio, impossibile eseguire.");
/*      */       }
/*      */       
/*      */       return;
/*      */     } 
/*      */     
/*  943 */     Set seVecchie = sottoscrizione.getEmitSottoscrizioni();
/*      */     
/*  945 */     Collection cEmittenti = getFactoryLocator().locateFactories(sottoscrizione);
/*      */     
/*  947 */     Iterator iter = sottoscrizione.getEmitSottoscrizioni().iterator();
/*  948 */     while (iter.hasNext()) {
/*  949 */       FinSottoscrEmittente se = iter.next();
/*  950 */       if (se.getSottoscrEmittenteId() == null) {
/*  951 */         Utility.setInsertGSTDvalues((RasORMBean)se, UTENTE_GSTD);
/*      */       }
/*      */     } 
/*  954 */     if (cEmittenti == null) {
/*  955 */       if (logger.isDebugEnabled()) {
/*  956 */         logger.debug("Nessuna Emittente individuata dall'IFactoryLocator.");
/*      */       
/*      */       }
/*      */     }
/*  960 */     else if (logger.isDebugEnabled()) {
/*  961 */       logger.debug("Individuate " + cEmittenti.size() + " Emittenti dall'IFactoryLocator.");
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer insertDecoNdgFabbr(FinDecodNdgFabbr decodNdgFabbr) throws RasServiceException {
/*  967 */     MapContainer resultMap = new MapContainer();
/*  968 */     MapContainer paramMap = new MapContainer();
/*  969 */     paramMap.putAppl("DECOD_NDG_FABBR", decodNdgFabbr);
/*  970 */     String moduleName = "InsertDecodNdgFabbrMD";
/*  971 */     getModuleManager().execModule(moduleName, paramMap);
/*  972 */     resultMap.putAppl("RESULT", "INSERTED");
/*  973 */     return resultMap;
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/*  978 */     if (this.action.equals("INSERT")) {
/*  979 */       String str = (String)resultMap.getAppl("INSERTED");
/*      */       
/*  981 */       resultMap.putAppl("INSERTED", str);
/*  982 */       return resultMap;
/*  983 */     }  if (this.action.equals("GET_BY_CODICE_FISCALE_STATO_CENSIMENTO")) {
/*      */       
/*  985 */       ArrayList arrayList = (ArrayList)resultMap.getAppl("SOGGETTO");
/*      */       
/*  987 */       resultMap.removeAppl("SOGGETTO");
/*      */       
/*  989 */       if (arrayList.size() == 0) {
/*  990 */         resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */       }
/*  992 */       else if (arrayList.size() == 1) {
/*  993 */         resultMap.putAppl("RESULT", "FOUND");
/*      */         
/*  995 */         resultMap.putAppl("SOGGETTO", arrayList);
/*      */       }
/*  997 */       else if (allowMultipleRow) {
/*  998 */         resultMap.putAppl("RESULT", "FOUND");
/*  999 */         resultMap.putAppl("SOGGETTO", arrayList);
/*      */       } else {
/*      */         
/* 1002 */         resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*      */       } 
/*      */       
/* 1005 */       return resultMap;
/*      */     } 
/*      */     
/* 1008 */     ArrayList result = (ArrayList)resultMap.getAppl("SOGGETTO");
/*      */     
/* 1010 */     resultMap.removeAppl("SOGGETTO");
/*      */     
/* 1012 */     int size = result.size();
/* 1013 */     for (int j = 0; j < size; j++) {
/*      */       
/* 1015 */       if (((FinSoggetto)result.get(j)).getStatoCensim() != null && ((FinSoggetto)result.get(j)).getStatoCensim().equals("B")) {
/* 1016 */         result.remove(j);
/* 1017 */         j = -1;
/* 1018 */         size -= size;
/*      */       } 
/*      */     } 
/*      */     
/* 1022 */     if (result.size() == 0) {
/* 1023 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */     }
/* 1025 */     else if (allowMultipleRow) {
/* 1026 */       resultMap.putAppl("RESULT", "FOUND");
/* 1027 */       resultMap.putAppl("SOGGETTO", result);
/*      */     }
/* 1029 */     else if (result.size() == 1) {
/* 1030 */       resultMap.putAppl("RESULT", "FOUND");
/*      */       
/* 1032 */       resultMap.putAppl("SOGGETTO", result.get(0));
/*      */     } else {
/* 1034 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*      */     } 
/*      */     
/* 1037 */     return resultMap;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 1043 */     Object retObject = null;
/*      */     try {
/* 1045 */       Class c = Class.forName(className);
/* 1046 */       if (!c.isInstance(obj)) {
/* 1047 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/*      */         
/* 1049 */         if (this.log.isErrorEnabled()) {
/* 1050 */           this.log.error(errorMessage);
/*      */         }
/* 1052 */         throw new RasServiceException(errorMessage);
/*      */       } 
/* 1054 */       retObject = obj;
/* 1055 */     } catch (ClassNotFoundException e) {
/* 1056 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/*      */       
/* 1058 */       if (this.log.isErrorEnabled()) {
/* 1059 */         this.log.error(errorMessage);
/*      */       }
/* 1061 */       throw new RasServiceException(errorMessage);
/*      */     } 
/* 1063 */     return retObject;
/*      */   }
/*      */   
/*      */   public String getAction() {
/* 1067 */     return this.action;
/*      */   }
/*      */   
/*      */   public void setAction(String action) {
/* 1071 */     this.action = action;
/*      */   }
/*      */   
/*      */   public void setNormalizer(RasNormalizer normalizer) {
/* 1075 */     this.normalizer = normalizer;
/*      */   }
/*      */   
/*      */   public RasNormalizer getNormalizer() {
/* 1079 */     return this.normalizer;
/*      */   }
/*      */   
/*      */   public void setDeduplicator(RasDeduplicator deduplicator) {
/* 1083 */     this.deduplicator = deduplicator;
/*      */   }
/*      */   
/*      */   public RasDeduplicator getDeduplicator() {
/* 1087 */     return this.deduplicator;
/*      */   }
/*      */   
/*      */   private MapContainer controlloErrori(MapContainer resultMap) {
/* 1091 */     String message = null;
/* 1092 */     String errorDes = "";
/* 1093 */     String errorCode = "";
/* 1094 */     String messageResult = "OK";
/* 1095 */     MapContainer result = new MapContainer();
/*      */     
/* 1097 */     if (resultMap.getAppl("ERROR_CODE") != null && ArchUtils.isValid(resultMap.getAppl("ERROR_CODE").toString()) && !"0".equals(resultMap.getAppl("ERROR_CODE").toString())) {
/*      */       
/* 1099 */       errorCode = resultMap.getAppl("ERROR_CODE").toString();
/* 1100 */       errorDes = resultMap.getAppl("ERROR_DES").toString();
/* 1101 */       message = errorCode + " " + errorDes;
/* 1102 */       messageResult = "KO";
/*      */     } 
/* 1104 */     result.putAppl("RESULT", messageResult);
/* 1105 */     result.putAppl("RESULT_MESSAGE", message);
/* 1106 */     return result;
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer controlloErroriSogg(MapContainer resultMap) {
/* 1111 */     String message = null;
/* 1112 */     int errorPiva = 999;
/* 1113 */     int errorName = 999;
/* 1114 */     int errorCf = 999;
/* 1115 */     String NormMessage = "OK";
/* 1116 */     String messageResult = "OK";
/* 1117 */     MapContainer result = new MapContainer();
/*      */     
/* 1119 */     NormMessage = (String)resultMap.getAppl("RESULT");
/*      */     
/* 1121 */     if (NormMessage.equals("NOT_EXECUTED") || NormMessage.equals("WARNING")) {
/*      */       
/* 1123 */       errorPiva = ((Integer)resultMap.getAppl("ERROR_PIVA")).intValue();
/* 1124 */       errorName = ((Integer)resultMap.getAppl("ERROR_NAME")).intValue();
/* 1125 */       errorCf = ((Integer)resultMap.getAppl("ERROR_CF")).intValue();
/*      */       
/* 1127 */       if (errorPiva == EMPTY_NUMBER && errorName == EMPTY_NUMBER && (errorCf == CF_508 || errorCf == CF_509)) {
/*      */         
/* 1129 */         message = "ERROR_NAME:" + errorName + "," + "ERROR_PIVA:" + errorPiva + ", " + "ERROR_CF:" + errorCf;
/*      */         
/* 1131 */         messageResult = "KO";
/* 1132 */       } else if (errorName == EMPTY_NUMBER && (errorCf == CF_513 || errorCf == CF_510 || errorCf == CF_511 || errorCf == CF_512 || errorCf == CF_514 || errorCf == CF_516 || errorCf == CF_521 || errorCf == CF_524) && errorPiva == EMPTY_NUMBER) {
/*      */         
/* 1134 */         message = "ERROR_NAME:" + errorName + "," + "ERROR_PIVA:" + errorPiva + ", " + "ERROR_CF:" + errorCf;
/*      */         
/* 1136 */         messageResult = "WARNING";
/*      */       }
/* 1138 */       else if (errorName == NAME_2 && errorCf == CF_516 && errorPiva == EMPTY_NUMBER) {
/*      */         
/* 1140 */         message = "ERROR_NAME:" + errorName + "," + "ERROR_PIVA:" + errorPiva + ", " + "ERROR_CF:" + errorCf;
/*      */         
/* 1142 */         messageResult = "WARNING";
/*      */       }
/* 1144 */       else if (errorName == NAME_714 && errorCf == EMPTY_NUMBER && errorPiva == EMPTY_NUMBER) {
/*      */         
/* 1146 */         messageResult = "OK";
/*      */       }
/*      */       else {
/*      */         
/* 1150 */         message = "ERROR_NAME:" + errorName + "," + "ERROR_PIVA:" + errorPiva + ", " + "ERROR_CF:" + errorCf;
/*      */         
/* 1152 */         messageResult = "KO";
/*      */       } 
/*      */     } 
/*      */     
/* 1156 */     result.putAppl("RESULT", messageResult);
/* 1157 */     result.putAppl("RESULT_MESSAGE", message);
/* 1158 */     return result;
/*      */   }
/*      */ 
/*      */   
/*      */   private MapContainer controlloErroriInd(MapContainer resultMap) {
/* 1163 */     String message = null;
/* 1164 */     int errorStreet = 999;
/* 1165 */     int errorPlace = 999;
/* 1166 */     MapContainer result = new MapContainer();
/* 1167 */     String NormMessage = "OK";
/* 1168 */     String messageResult = "OK";
/*      */     
/* 1170 */     NormMessage = (String)resultMap.getAppl("RESULT");
/*      */     
/* 1172 */     if (NormMessage.equals("NOT_EXECUTED") || NormMessage.equals("WARNING")) {
/*      */       
/* 1174 */       errorStreet = ((Integer)resultMap.getAppl("ERROR_STREET")).intValue();
/*      */       
/* 1176 */       errorPlace = ((Integer)resultMap.getAppl("ERROR_PLACE")).intValue();
/*      */       
/* 1178 */       if (errorPlace == EMPTY_NUMBER && (errorStreet == STREET_203 || errorStreet == STREET_207 || errorStreet == STREET_208 || errorStreet == STREET_204 || errorStreet == STREET_205)) {
/*      */         
/* 1180 */         messageResult = "WARNING";
/* 1181 */         message = "ERROR_STREET:" + errorStreet + "," + "ERROR_PLACE:" + errorPlace;
/*      */       }
/* 1183 */       else if (errorPlace == PLACE_105 && errorStreet == EMPTY_NUMBER) {
/*      */         
/* 1185 */         messageResult = "WARNING";
/* 1186 */         message = "ERROR_STREET:" + errorStreet + "," + "ERROR_PLACE:" + errorPlace;
/*      */       }
/*      */       else {
/*      */         
/* 1190 */         message = "ERROR_STREET:" + errorStreet + "," + "ERROR_PLACE:" + errorPlace;
/*      */         
/* 1192 */         messageResult = "KO";
/*      */       } 
/*      */     } 
/*      */     
/* 1196 */     result.putAppl("RESULT", messageResult);
/* 1197 */     result.putAppl("RESULT_MESSAGE", message);
/* 1198 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getNdgArco() throws RasServiceException {
/* 1204 */     MapContainer param = new MapContainer();
/*      */     
/* 1206 */     param = getModuleManager().execModule("GetNdgArcoMD", null);
/*      */     
/* 1208 */     Integer ndgArco = (Integer)param.getAppl("SEQUENCE_NDG_ARCO");
/*      */     
/* 1210 */     return ndgArco;
/*      */   }
/*      */ 
/*      */   
/*      */   public IFactoryLocator getFactoryLocator() {
/* 1215 */     return this.factoryLocator;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFactoryLocator(IFactoryLocator factoryLocator) {
/* 1220 */     this.factoryLocator = factoryLocator;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\SoggettoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */