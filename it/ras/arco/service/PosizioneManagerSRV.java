/*      */ package it.ras.arco.service;
/*      */ 
/*      */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinContrattoBase;
/*      */ import it.ras.arco.bean.FinDettaglioPct;
/*      */ import it.ras.arco.bean.FinDispPagamento;
/*      */ import it.ras.arco.bean.FinFondiSicav;
/*      */ import it.ras.arco.bean.FinMovimento;
/*      */ import it.ras.arco.bean.FinOrdine;
/*      */ import it.ras.arco.bean.FinPosizione;
/*      */ import it.ras.arco.bean.FinPosizioneDt;
/*      */ import it.ras.arco.bean.FinProdotto;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.bean.FinSottoscrizione;
/*      */ import it.ras.arco.bean.FinSottoscrizioneCont;
/*      */ import it.ras.arco.bean.QuadSecPosizioneDt;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.config.CodesTableManager;
/*      */ import it.ras.flag.exception.RasServiceException;
/*      */ import it.ras.flag.service.AbstractRasService;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import java.text.ParseException;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Date;
/*      */ import java.util.HashSet;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class PosizioneManagerSRV
/*      */   extends AbstractRasService
/*      */ {
/*      */   public static final String DETTAGLIO = "DETTAGLIO";
/*      */   public static final String INS_POSIZIONE_DETTAGLIO = "INS_POSIZIONE_DETTAGLIO";
/*      */   public static final String UPD_POSIZIONE_DETTAGLIO = "UPD_POSIZIONE_DETTAGLIO";
/*      */   public static final String CONTRATTO = "CONTRATTO";
/*      */   public static final String PRODOTTO = "PRODOTTO";
/*      */   public static final String DOSSIER = "DOSSIER";
/*      */   public static final String ATTIVITA_FINANZIARIA = "ATTIVITA_FINANZIARIA";
/*      */   public static final String POSIZIONE = "POSIZIONE";
/*      */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*      */   public static final String MOVIMENTO = "MOVIMENTO";
/*      */   public static final String MOVIMENTO_ROLL_BACK = "MOVIMENTO_ROLL_BACK";
/*      */   public static final String SOGGETTO = "SOGGETTO";
/*      */   public static final String GENERIC_MODULE_RESULT = "POSIZIONE";
/*      */   public static final String INS_MOVIMENTO_ACTION = "InsMovimento";
/*      */   public static final String NOME_BATCH = "NOME_BATCH";
/*      */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*      */   public static final String SW_POSITIVO = "408";
/*      */   public static final String SW_NEGATIVO = "853";
/*      */   public static final String SOTTODOSSIER = "SOTTODOSSIER";
/*      */   public static final String NUMERO_OPERAZIONE = "NUMERO_OPERAZIONE";
/*      */   public static final String Flag_buy_sell_b = "B";
/*      */   public static final String Flag_buy_sell_s = "S";
/*      */   public static final String DIS_TOTALE = "RT";
/*      */   public static final String QUAD_POSIZIONE = "QUAD_POSIZIONE";
/*   77 */   private String action = "ACTION";
/*      */   
/*      */   private String creaPosizione;
/*      */   
/*      */   private String creaOrdine;
/*      */   private int movimentoPosMin;
/*      */   private int movimentoPosMax;
/*      */   private int movimentoNegMin;
/*      */   private int movimentoNegMax;
/*      */   private int movimentoDaVerMin;
/*      */   private int movimentoDaVerMax;
/*      */   private int sottoscrMin;
/*      */   private int sottoscrMax;
/*      */   private int aggMin;
/*      */   private int aggMax;
/*      */   private int aggMin1;
/*      */   private int aggMax1;
/*      */   private int rimbParzMin;
/*      */   private int rimbParzMax;
/*      */   private int rimbParzMin1;
/*      */   private int rimbParzMax1;
/*      */   private int rimbParz;
/*      */   private int rimbTotMin;
/*      */   private int rimbTotMax;
/*      */   private int swInMin;
/*      */   private int swInMax;
/*      */   private int swInMin1;
/*      */   private int swInMax1;
/*      */   private int swInMin2;
/*      */   private int swInMax2;
/*      */   private int swOutMin;
/*      */   private int swOutMax;
/*      */   private int passTotMin;
/*      */   private int passTotMax;
/*      */   private int sottdscr1;
/*      */   private int rimbTotMin1;
/*      */   private int rimbTotMax1;
/*      */   private int revRid;
/*      */   private int rimbParz3;
/*  116 */   private Log log = LogFactory.getLog(PosizioneManagerSRV.class);
/*  117 */   private final int NEGATIVO = -1;
/*  118 */   private final int POSITIVO = 1;
/*  119 */   private final int NEUTRO = 0;
/*  120 */   private final Double EMPTY_NUMBER = new Double(0.0D);
/*      */ 
/*      */   
/*      */   private CodesTableManager codesTableManager;
/*      */ 
/*      */   
/*      */   boolean isFinGp = false;
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIsValidating(boolean isValidating) {}
/*      */ 
/*      */   
/*      */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  134 */     MapContainer resultMap = new MapContainer();
/*  135 */     MapContainer paramMap = new MapContainer();
/*  136 */     Object oContratto = map.getAppl("CONTRATTO");
/*  137 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  138 */     Object oAttFin = map.getAppl("ATTIVITA_FINANZIARIA");
/*  139 */     Object oMovimentoRollBack = map.getAppl("MOVIMENTO_ROLL_BACK");
/*  140 */     Object oPosizione = map.getAppl("POSIZIONE");
/*  141 */     Object oMovimento = map.getAppl("MOVIMENTO");
/*  142 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  143 */     Object oDettaglio = map.getAppl("DETTAGLIO");
/*  144 */     Object oQuadPosizione = map.getAppl("QUAD_POSIZIONE");
/*  145 */     Object oProdotto = map.getAppl("PRODOTTO");
/*      */     
/*  147 */     Boolean allowMultipleRows = null;
/*  148 */     FinContratto contratto = null;
/*  149 */     FinSoggetto soggetto = null;
/*  150 */     FinAttivitaFinanziaria attFin = null;
/*  151 */     FinPosizione posizione = null;
/*  152 */     FinProdotto prodotto = null;
/*  153 */     FinMovimento movimento = null;
/*  154 */     FinMovimento movimentoRollBack = null;
/*      */     
/*  156 */     QuadSecPosizioneDt quadPosizione = null;
/*  157 */     FinSottoscrizione sottoscrizione = null;
/*  158 */     FinSottoscrizioneCont sottoscrizioneCont = null;
/*  159 */     FinDettaglioPct posizioneDet = null;
/*      */ 
/*      */     
/*  162 */     if (oAllowMultipleRows == null) {
/*  163 */       oAllowMultipleRows = new Boolean(false);
/*  164 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  165 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  166 */       if (this.log.isErrorEnabled()) {
/*  167 */         this.log.error(errorMessage);
/*      */       }
/*  169 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/*  172 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*      */ 
/*      */ 
/*      */     
/*  176 */     if (this.action.equals("INS_POSIZIONE_DETTAGLIO")) {
/*      */       
/*  178 */       oDettaglio = controlloDettaglio(oDettaglio, this.action);
/*  179 */       paramMap.putAppl("DETTAGLIO", oDettaglio);
/*  180 */       getModuleManager().execModule("InserimentoDettaglio", paramMap);
/*  181 */       resultMap.putAppl("RESULT", "INSERTED");
/*      */     }
/*  183 */     else if (this.action.equals("UPD_POSIZIONE_DETTAGLIO")) {
/*      */       
/*  185 */       oDettaglio = controlloDettaglio(oDettaglio, this.action);
/*  186 */       paramMap.putAppl("DETTAGLIO", oDettaglio);
/*  187 */       getModuleManager().execModule("UpdateDettaglio", paramMap);
/*  188 */       resultMap.putAppl("RESULT", "UPDATED");
/*      */     } else {
/*  190 */       if (this.action.equals("GET_BY_NUM_CONTRATTO_ATT_FIN")) {
/*      */         
/*  192 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  193 */         attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  194 */         String numContratto = contratto.getNumContratto();
/*  195 */         Integer attFinId = attFin.getAttivitaFinId();
/*  196 */         paramMap.putAppl("CONTRATTO", numContratto);
/*  197 */         paramMap.putAppl("ATTIVITA_FINANZIARIA", attFinId.toString());
/*  198 */         resultMap = getModuleManager().execModule("GetPosizioneByNumContrattoAttFinIdMD", paramMap);
/*  199 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*  201 */       if (this.action.equals("GET_POS_BY_CONTRATTOID_ATTFINID_SOTTODOSSIER")) {
/*      */ 
/*      */         
/*  204 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  205 */         attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  206 */         Integer contrattoId = contratto.getContrattoId();
/*  207 */         Integer attivitaFinId = attFin.getAttivitaFinId();
/*  208 */         String sottodossier = (String)map.getAppl("SOTTODOSSIER");
/*  209 */         paramMap.putAppl("CONTRATTO", contrattoId);
/*  210 */         paramMap.putAppl("ATTIVITA_FINANZIARIA", attivitaFinId);
/*  211 */         paramMap.putAppl("SOTTODOSSIER", sottodossier);
/*  212 */         resultMap = getModuleManager().execModule("GetPosizioneByContrattoIdAttFinSottodossierMD", paramMap);
/*  213 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*      */       
/*  216 */       if (this.action.equals("GET_POS_BY_CONTRATTOID_SOGGID_SOTTODOSSIER")) {
/*      */ 
/*      */         
/*  219 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  220 */         soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class);
/*  221 */         Integer contrattoId = contratto.getContrattoId();
/*  222 */         Integer soggettoId = soggetto.getSoggettoId();
/*  223 */         String sottodossier = (String)map.getAppl("SOTTODOSSIER");
/*  224 */         paramMap.putAppl("CONTRATTO", contrattoId);
/*  225 */         paramMap.putAppl("SOGGETTO", soggettoId);
/*  226 */         paramMap.putAppl("SOTTODOSSIER", sottodossier);
/*  227 */         resultMap = getModuleManager().execModule("GetPosizioneByContrattoIdSoggIdSottodossierMD", paramMap);
/*  228 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*      */       
/*  231 */       if (this.action.equals("GET_POS_BY_CONTRATTOID_SOGGID_SOTTODOSSIER_NUM_OPE")) {
/*      */ 
/*      */         
/*  234 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  235 */         soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class);
/*  236 */         Integer contrattoId = contratto.getContrattoId();
/*  237 */         Integer soggettoId = soggetto.getSoggettoId();
/*  238 */         String sottodossier = (String)map.getAppl("SOTTODOSSIER");
/*  239 */         String numeroOperazione = (String)map.getAppl("NUMERO_OPERAZIONE");
/*  240 */         paramMap.putAppl("CONTRATTO", contrattoId);
/*  241 */         paramMap.putAppl("SOGGETTO", soggettoId);
/*  242 */         paramMap.putAppl("SOTTODOSSIER", sottodossier);
/*  243 */         paramMap.putAppl("NUMERO_OPERAZIONE", numeroOperazione);
/*  244 */         resultMap = getModuleManager().execModule("GetPosizioneByContrattoIdSoggIdSottodossierNumOpeMD", paramMap);
/*  245 */         ArrayList result = (ArrayList)resultMap.getAppl("DETTAGLIO");
/*  246 */         resultMap.removeAppl("DETTAGLIO");
/*  247 */         if (result.size() == 0) {
/*  248 */           resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */         }
/*  250 */         else if (result.size() == 1) {
/*  251 */           resultMap.putAppl("RESULT", "FOUND");
/*  252 */           resultMap.putAppl("DETTAGLIO", result.get(0));
/*      */         } else {
/*      */           
/*  255 */           resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*      */         } 
/*  257 */         return resultMap;
/*      */       } 
/*      */       
/*  260 */       if (this.action.equals("GET_BY_DOSSIER_PROD_ATT_FIN")) {
/*      */ 
/*      */         
/*  263 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  264 */         prodotto = (FinProdotto)getBean(oProdotto, FinProdotto.class);
/*  265 */         attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*      */ 
/*      */         
/*  268 */         String dossier = contratto.getDossierTecnico();
/*  269 */         Integer prodottoId = prodotto.getProdottoID();
/*  270 */         Integer attFinId = attFin.getAttivitaFinId();
/*  271 */         paramMap.putAppl("DOSSIER", dossier);
/*  272 */         paramMap.putAppl("PRODOTTO", prodottoId);
/*  273 */         paramMap.putAppl("ATTIVITA_FINANZIARIA", attFinId);
/*  274 */         resultMap = getModuleManager().execModule("GetPosizioneByDossierProdIdAttFinanziariaMD", paramMap);
/*  275 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*      */       
/*  278 */       if (this.action.equals("GET_POS_BY_CONTRATTOID")) {
/*      */ 
/*      */         
/*  281 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*      */         
/*  283 */         Integer contrattoId = contratto.getContrattoId();
/*      */         
/*  285 */         paramMap.putAppl("CONTRATTO", contrattoId);
/*      */         
/*  287 */         resultMap = getModuleManager().execModule("GetPosizioneByContrattoIdMD", paramMap);
/*  288 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*      */ 
/*      */       
/*  292 */       if (this.action.equals("GET_MOV_BY_NUM_MOVIMENTO_CONTRATTOID_POSIZIONEID_ATTFINID")) {
/*  293 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  294 */         attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  295 */         posizione = (FinPosizione)getBean(oPosizione, FinPosizione.class);
/*  296 */         movimento = (FinMovimento)getBean(oMovimento, FinMovimento.class);
/*  297 */         paramMap.putAppl("NUM_MOV_EXT", movimento.getNumMovExt());
/*  298 */         paramMap.putAppl("POSIZIONE", posizione.getPosizioneId());
/*  299 */         paramMap.putAppl("CONTRATTO", contratto.getContrattoId());
/*  300 */         paramMap.putAppl("ATT_FIN", attFin.getAttivitaFinId());
/*  301 */         resultMap = getModuleManager().execModule("GetMovimentoByNumMovimentoContrattoIdPosizioneIdAttFinMD", paramMap);
/*  302 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*  303 */       }  if (this.action.equals("GET_MOV_BY_NUM_MOVIMENTO_CONTRATTOID_ATTFINID")) {
/*  304 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  305 */         attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  306 */         posizione = (FinPosizione)getBean(oPosizione, FinPosizione.class);
/*  307 */         movimento = (FinMovimento)getBean(oMovimento, FinMovimento.class);
/*  308 */         paramMap.putAppl("NUM_MOV_EXT", movimento.getNumMovExt());
/*      */         
/*  310 */         paramMap.putAppl("CONTRATTO", contratto.getContrattoId());
/*  311 */         paramMap.putAppl("ATT_FIN", attFin.getAttivitaFinId());
/*  312 */         resultMap = getModuleManager().execModule("GetMovimentoByNumMovimentoContrattoIdAttFinMD", paramMap);
/*  313 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*  315 */       if (this.action.equals("GET_MOV_BY_NUM_MOVIMENTO_CONTRATTOID")) {
/*  316 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*      */         
/*  318 */         movimento = (FinMovimento)getBean(oMovimento, FinMovimento.class);
/*  319 */         paramMap.putAppl("NUM_MOV_EXT", movimento.getNumMovExt());
/*      */         
/*  321 */         paramMap.putAppl("CONTRATTO", contratto.getContrattoId());
/*      */         
/*  323 */         resultMap = getModuleManager().execModule("GetMovimentoByNumMovimentoContrattoIdMD", paramMap);
/*  324 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*  326 */       if (this.action.equals("GET_MOV_BY_CONTRATTOID_POSIZIONEID_ATTFINID")) {
/*  327 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  328 */         attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  329 */         posizione = (FinPosizione)getBean(oPosizione, FinPosizione.class);
/*      */ 
/*      */         
/*  332 */         paramMap.putAppl("POSIZIONE", posizione.getPosizioneId());
/*  333 */         paramMap.putAppl("CONTRATTO", contratto.getContrattoId());
/*  334 */         paramMap.putAppl("ATT_FIN", attFin.getAttivitaFinId());
/*  335 */         resultMap = getModuleManager().execModule("GetMovimentoByContrattoIdPosizioneIdAttFinMD", paramMap);
/*  336 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*  338 */       if (this.action.equals("GET_MOV_BY_CONTRATTOID_DATA_VAL_ATTFINID")) {
/*  339 */         contratto = (FinContratto)getBean(oContratto, FinContratto.class);
/*  340 */         attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  341 */         movimento = (FinMovimento)getBean(oMovimento, FinMovimento.class);
/*      */ 
/*      */         
/*  344 */         paramMap.putAppl("DATA", movimento.getDataValuta());
/*  345 */         paramMap.putAppl("CONTRATTO", contratto.getContrattoId());
/*  346 */         paramMap.putAppl("ATT_FIN", attFin.getAttivitaFinId());
/*  347 */         resultMap = getModuleManager().execModule("GetMovimentoByContrattoIdDataAttFinMD", paramMap);
/*  348 */         return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */       } 
/*  350 */       if (this.action.equals("INS_MOVIMENTO")) {
/*      */ 
/*      */         
/*  353 */         FinOrdine ordine = (FinOrdine)map.getAppl("ORDINE");
/*  354 */         movimento = (FinMovimento)getBean(oMovimento, FinMovimento.class);
/*  355 */         contratto = movimento.getContratto();
/*  356 */         FinAttivitaFinanziaria attFinanziaria = movimento.getAttivitaFin();
/*      */         
/*  358 */         if (contratto instanceof it.ras.arco.bean.FinGP) {
/*  359 */           this.isFinGp = true;
/*      */         }
/*      */         
/*  362 */         if (movimento.getDataValuta() != null && (contratto.getDataUltimoMovimento() == null || contratto.getDataUltimoMovimento().before(movimento.getDataValuta()))) {
/*  363 */           contratto.setDataUltimoMovimento(movimento.getDataValuta());
/*      */         }
/*  365 */         if (movimento.getDataValuta() != null && (contratto.getDataPrimoMov() == null || contratto.getDataPrimoMov().after(movimento.getDataValuta()))) {
/*  366 */           contratto.setDataPrimoMov(movimento.getDataValuta());
/*      */         }
/*      */ 
/*      */         
/*  370 */         if (movimento.getCtvLordo() == null) {
/*  371 */           movimento.setCtvLordo(this.EMPTY_NUMBER);
/*      */         }
/*  373 */         if (movimento.getCtvNetto() == null) {
/*  374 */           movimento.setCtvNetto(this.EMPTY_NUMBER);
/*      */         }
/*      */         
/*  377 */         if (movimento.getImporto() == null) {
/*  378 */           movimento.setImporto(this.EMPTY_NUMBER);
/*      */         }
/*      */         
/*  381 */         if (movimento.getImportoNettoValuta() == null) {
/*  382 */           movimento.setImportoNettoValuta(this.EMPTY_NUMBER);
/*      */         }
/*      */ 
/*      */         
/*  386 */         if (movimento.getQuantita() == null) {
/*  387 */           movimento.setQuantita(this.EMPTY_NUMBER);
/*      */         }
/*  389 */         if (movimento.getNumQuoteCert() == null) {
/*  390 */           movimento.setNumQuoteCert(this.EMPTY_NUMBER);
/*      */         }
/*      */         
/*  393 */         int segno = gestioneSegnoMovimento(movimento);
/*      */         
/*  395 */         if (movimento.getTipo() == null || movimento.getTipo().equals("")) {
/*  396 */           movimento.setTipo((String)this.codesTableManager.decodeValue("TIPO_MOVIMENTO_BATCH", "CODICE_CAUSALE_ARCO", "TIPO_MOVIMENTO_ARCO", movimento.getCausale()));
/*      */         }
/*      */         
/*  399 */         movimento.setCtvLordo(new Double(Math.abs(movimento.getCtvLordo().doubleValue())));
/*  400 */         movimento.setCtvNetto(new Double(Math.abs(movimento.getCtvNetto().doubleValue())));
/*  401 */         movimento.setImporto(new Double(Math.abs(movimento.getImporto().doubleValue())));
/*  402 */         movimento.setImportoNettoValuta(new Double(Math.abs(movimento.getImportoNettoValuta().doubleValue())));
/*  403 */         movimento.setQuantita(new Double(Math.abs(movimento.getQuantita().doubleValue())));
/*  404 */         movimento.setNumQuoteCert(new Double(Math.abs(movimento.getNumQuoteCert().doubleValue())));
/*      */         
/*  406 */         if (segno == 0) {
/*      */           
/*  408 */           movimento.setImpPrelevLordo(new Double(0.0D));
/*  409 */           movimento.setImpVersatoNetto(new Double(0.0D));
/*      */         }
/*  411 */         else if (segno < 0 && movimento.getImpGiroconLordo() == null) {
/*  412 */           if (contratto instanceof FinFondiSicav) {
/*  413 */             if (((FinFondiSicav)contratto).getNumPrelieviEffet() == null) {
/*  414 */               ((FinFondiSicav)contratto).setNumPrelieviEffet(new Integer(0));
/*      */             }
/*  416 */             Integer numPrelievi = new Integer(((FinFondiSicav)contratto).getNumPrelieviEffet().intValue() + 1);
/*  417 */             ((FinFondiSicav)contratto).setNumPrelieviEffet(numPrelievi);
/*      */           } 
/*  419 */           if (movimento.getImpPrelevLordo() == null && movimento.getImpPrelevNetto() == null) {
/*  420 */             movimento.setImpPrelevLordo(movimento.getCtvLordo());
/*  421 */             movimento.setImpPrelevNetto(movimento.getCtvNetto());
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/*  427 */         else if (segno > 0 && movimento.getImpGiroconLordo() == null) {
/*      */           
/*  429 */           if (movimento.getImpVersatoLordo() == null && movimento.getImpVersatoNetto() == null) {
/*  430 */             movimento.setImpVersatoLordo(movimento.getCtvLordo());
/*  431 */             movimento.setImpVersatoNetto(movimento.getCtvNetto());
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  436 */         if (segno != 0) {
/*      */           
/*  438 */           movimento.setImporto(new Double(movimento.getImporto().doubleValue() * segno));
/*  439 */           movimento.setCtvLordo(new Double(movimento.getCtvLordo().doubleValue() * segno));
/*  440 */           movimento.setCtvNetto(new Double(movimento.getCtvNetto().doubleValue() * segno));
/*  441 */           movimento.setImportoNettoValuta(new Double(movimento.getImportoNettoValuta().doubleValue() * segno));
/*  442 */           movimento.setQuantita(new Double(movimento.getQuantita().doubleValue() * segno));
/*  443 */           movimento.setNumQuoteCert(new Double(movimento.getNumQuoteCert().doubleValue() * segno));
/*  444 */           if (movimento.getImpGiroconLordo() != null) {
/*  445 */             movimento.setImpGiroconLordo(new Double(Math.abs(movimento.getImpGiroconLordo().doubleValue()) * segno));
/*  446 */             movimento.setImpGiroconNetto(new Double(Math.abs(movimento.getImpGiroconNetto().doubleValue()) * segno));
/*      */           } 
/*      */         } 
/*      */         
/*  450 */         if (ordine != null && ordine.getOrdineId() != null && ordine.getOrdineId().intValue() != -1) {
/*      */           
/*  452 */           String NomeBatch = (String)map.getAppl("NOME_BATCH");
/*  453 */           MapContainer paramIn = new MapContainer();
/*  454 */           paramIn.putAppl("ORDINE_ID", ordine.getOrdineId());
/*  455 */           resultMap = getModuleManager().execModule("GetOrdineByOrdineIDMD", paramIn);
/*      */           
/*  457 */           processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */           
/*  459 */           if (!resultMap.getAppl("RESULT").equals("FOUND"))
/*      */           {
/*  461 */             ordine.setOrdineId(new Integer(-1));
/*      */           }
/*      */           else
/*      */           {
/*  465 */             ordine = (FinOrdine)resultMap.getAppl("POSIZIONE");
/*  466 */             if (ordine.getStato() != null && ordine.getStato().equals("E")) {
/*      */               
/*  468 */               gestioneSottoscrizione(ordine, NomeBatch);
/*  469 */               String errorMessage = "L'ordine è già stato eseguito";
/*  470 */               if (this.log.isErrorEnabled()) {
/*  471 */                 this.log.error(errorMessage);
/*      */               }
/*  473 */               throw new RasServiceException(errorMessage);
/*      */             } 
/*      */ 
/*      */ 
/*      */             
/*  478 */             ordine.setMovimenti(new HashSet());
/*  479 */             ordine.getMovimenti().add(movimento);
/*      */ 
/*      */             
/*  482 */             if (movimento.getPosizione() != null) {
/*  483 */               posizione = movimento.getPosizione();
/*  484 */               ordine.setPosizione(posizione);
/*      */             } 
/*      */ 
/*      */             
/*  488 */             ordine.setStato("E");
/*  489 */             gestioneSottoscrizione(ordine, NomeBatch);
/*  490 */             paramIn.putAppl("ORDINE", ordine);
/*  491 */             ArchUtils.setStdFields(ordine, "U", NomeBatch);
/*  492 */             getModuleManager().execModule("UpdOrdineMD", paramIn);
/*      */           
/*      */           }
/*      */ 
/*      */         
/*      */         }
/*  498 */         else if (this.creaOrdine.equals("1")) {
/*      */           
/*  500 */           String NomeBatch = (String)map.getAppl("NOME_BATCH");
/*  501 */           MapContainer param = new MapContainer();
/*  502 */           sottoscrizione = new FinSottoscrizione();
/*  503 */           ordine = new FinOrdine();
/*  504 */           String causale = null;
/*  505 */           causale = gestioneCausale(movimento.getCausale());
/*  506 */           if (segno < 0) {
/*  507 */             ordine.setFlgBuySell("S");
/*      */           }
/*  509 */           else if (segno > 0) {
/*  510 */             ordine.setFlgBuySell("B");
/*      */           } 
/*      */ 
/*      */           
/*  514 */           ordine.setAttivitaFin(movimento.getAttivitaFin());
/*  515 */           ordine.setCausale(causale);
/*  516 */           ordine.setDivisa(movimento.getDivisa());
/*  517 */           ordine.setImporto(movimento.getCtvLordo());
/*  518 */           ordine.setQuantita(movimento.getQuantita());
/*  519 */           ordine.setDataInserimentoOrdine(new Date());
/*  520 */           ordine.setUtenteInserimento(NomeBatch);
/*  521 */           ordine.setDataInserimento(new Date());
/*  522 */           ordine.setTipo(causale);
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  527 */           ordine.setUserUltimaModifica(NomeBatch);
/*  528 */           ordine.setProceduraUltimaModifica(NomeBatch);
/*  529 */           ordine.setDataUltimaModifica(new Date());
/*  530 */           ordine.setTipoUltimaModifica("I");
/*  531 */           ordine.setFlagEsistenza("S");
/*  532 */           ordine.setDataInserimento(new Date());
/*      */           
/*  534 */           ArchUtils.setStdFields(ordine, "I", NomeBatch);
/*      */ 
/*      */           
/*  537 */           ordine.setMovimenti(new HashSet());
/*  538 */           ordine.getMovimenti().add(movimento);
/*      */ 
/*      */           
/*  541 */           if (movimento.getPosizione() != null) {
/*  542 */             posizione = movimento.getPosizione();
/*  543 */             ordine.setPosizione(posizione);
/*      */           } 
/*      */           
/*  546 */           if (movimento.getDataRegolamento() != null) {
/*  547 */             ordine.setDataEsecuzione(movimento.getDataRegolamento());
/*      */           }
/*  549 */           else if (movimento.getDataCompetenza() != null) {
/*  550 */             ordine.setDataEsecuzione(movimento.getDataCompetenza());
/*      */           } else {
/*      */             
/*  553 */             ordine.setDataEsecuzione(new Date());
/*      */           } 
/*      */           
/*  556 */           ordine.setStato("E");
/*      */ 
/*      */           
/*  559 */           ordine.setSottoscrizione(sottoscrizione);
/*  560 */           sottoscrizione.setOrdine(new HashSet());
/*  561 */           sottoscrizione.getOrdine().add(ordine);
/*      */           
/*  563 */           sottoscrizione.setDataSottoscr(movimento.getDataMovimento());
/*  564 */           sottoscrizione.setTipoOperazione("MDI");
/*  565 */           sottoscrizione.setStato("E");
/*  566 */           sottoscrizione.setDataInserimento(new Date());
/*  567 */           sottoscrizione.setUtenteInserimento(NomeBatch);
/*  568 */           sottoscrizione.setUserUltimaModifica(NomeBatch);
/*  569 */           ArchUtils.setStdFields(sottoscrizione, "I", NomeBatch);
/*  570 */           sottoscrizioneCont = new FinSottoscrizioneCont();
/*  571 */           sottoscrizioneCont.setSottoscrizione(sottoscrizione);
/*  572 */           sottoscrizioneCont.setContratto((FinContrattoBase)contratto);
/*  573 */           sottoscrizioneCont.setDataInserimento(new Date());
/*  574 */           sottoscrizioneCont.setUtenteInserimento(NomeBatch);
/*  575 */           sottoscrizioneCont.setUserUltimaModifica(NomeBatch);
/*  576 */           ArchUtils.setStdFields(sottoscrizioneCont, "I", NomeBatch);
/*      */           
/*  578 */           contratto.getSottoscrizione().add(sottoscrizioneCont);
/*      */ 
/*      */           
/*  581 */           FinDispPagamento dispPagamento = (FinDispPagamento)map.getAppl("DISP_PAGAMENTO");
/*      */           
/*  583 */           if (dispPagamento != null) {
/*      */             
/*  585 */             dispPagamento.setDataInserimento(new Date());
/*  586 */             dispPagamento.setUtenteInserimento(NomeBatch);
/*  587 */             dispPagamento.setUserUltimaModifica(NomeBatch);
/*  588 */             ArchUtils.setStdFields(dispPagamento, "I", NomeBatch);
/*      */ 
/*      */             
/*  591 */             dispPagamento.setSottoscrizione(sottoscrizione);
/*      */ 
/*      */             
/*  594 */             if (sottoscrizione.getDispPagamento() == null) {
/*  595 */               sottoscrizione.setDispPagamento(new HashSet());
/*      */             }
/*  597 */             sottoscrizione.getDispPagamento().add(dispPagamento);
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/*  602 */           param.putAppl("SOTTOSCRIZIONE", sottoscrizione);
/*  603 */           getModuleManager().execModule("InsertSottoscrizioneMD", param);
/*      */           
/*  605 */           resultMap.putAppl("SOTTOSCRIZIONE", sottoscrizione);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  613 */         if (this.creaPosizione.equals("1") && movimento.getPosizione() == null) {
/*      */ 
/*      */ 
/*      */           
/*  617 */           String NomeBatch = (String)map.getAppl("NOME_BATCH");
/*  618 */           posizione = new FinPosizione();
/*      */           
/*      */           try {
/*  621 */             setPosizione(contratto, posizione, NomeBatch);
/*      */           }
/*  623 */           catch (Exception e) {
/*  624 */             this.log.error(e.getMessage());
/*  625 */             RasServiceException error = new RasServiceException(e.getMessage());
/*  626 */             error.setStackTrace(e.getStackTrace());
/*  627 */             throw error;
/*      */           } 
/*  629 */           controllaDataPos(posizione, movimento);
/*      */           
/*  631 */           posizione.setAttivitaFin(attFinanziaria);
/*  632 */           posizione.setContratto((FinContrattoBase)contratto);
/*      */ 
/*      */           
/*  635 */           if (segno != 0)
/*      */           {
/*  637 */             posizione = processMovimento(posizione, movimento, ordine, segno);
/*      */           }
/*  639 */           ArchUtils.setStdFields(posizione, "I", NomeBatch);
/*      */ 
/*      */           
/*  642 */           paramMap.putAppl("POSIZIONE", posizione);
/*  643 */           getModuleManager().execModule("InserimentoPosizione", paramMap);
/*  644 */           movimento.setPosizione(posizione);
/*      */         }
/*  646 */         else if (movimento.getPosizione() != null && segno != 0) {
/*      */           
/*  648 */           posizione = movimento.getPosizione();
/*      */           
/*  650 */           if (posizione.getPosizioneId() != null) {
/*      */             
/*  652 */             controllaDataPos(posizione, movimento);
/*  653 */             posizione = processMovimento(posizione, movimento, ordine, segno);
/*  654 */             String NomeBatch = (String)map.getAppl("NOME_BATCH");
/*  655 */             ArchUtils.setStdFields(posizione, "U", NomeBatch);
/*      */           } 
/*      */ 
/*      */           
/*  659 */           paramMap.putAppl("POSIZIONE", posizione);
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  665 */         movimento.setOrdine(ordine);
/*      */         
/*  667 */         paramMap.putAppl("MOVIMENTO", movimento);
/*  668 */         getModuleManager().execModule("InsertMovimentoMD", paramMap);
/*  669 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */         
/*  671 */         return resultMap;
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  703 */       if (this.action.equals("UPD_MOVIMENTO")) {
/*  704 */         movimento = (FinMovimento)getBean(oMovimento, FinMovimento.class);
/*  705 */         paramMap.putAppl("MOVIMENTO", movimento);
/*  706 */         getModuleManager().execModule("UpdateMovimentoMD", paramMap);
/*  707 */         resultMap.putAppl("RESULT", "UPDATED");
/*      */       }
/*  709 */       else if (this.action.equals("UPD")) {
/*  710 */         posizione = (FinPosizione)getBean(oPosizione, FinPosizione.class);
/*  711 */         paramMap.putAppl("POSIZIONE", posizione);
/*  712 */         String NomeBatch = (String)map.getAppl("NOME_BATCH");
/*  713 */         ArchUtils.setStdFields(posizione, "U", NomeBatch);
/*  714 */         getModuleManager().execModule("UpdPosizioneMD", paramMap);
/*  715 */         resultMap.putAppl("RESULT", "UPDATED");
/*      */       }
/*  717 */       else if (this.action.equals("SET_POSIZIONE")) {
/*  718 */         FinPosizioneDt posizioneDt = (FinPosizioneDt)getBean(oPosizione, FinPosizioneDt.class);
/*  719 */         movimento = (FinMovimento)getBean(oMovimento, FinMovimento.class);
/*  720 */         int segno = gestioneSegnoMovimento(movimento);
/*  721 */         double quantita = Math.abs(posizioneDt.getQuantita().doubleValue());
/*  722 */         posizioneDt.setQuantita(new Double(segno * quantita));
/*  723 */         resultMap.putAppl("POSIZIONE", posizioneDt);
/*      */ 
/*      */       
/*      */       }
/*  727 */       else if (this.action.equals("INS_POSIZIONE")) {
/*  728 */         posizione = (FinPosizione)getBean(oPosizione, FinPosizione.class);
/*  729 */         paramMap.putAppl("POSIZIONE", posizione);
/*  730 */         getModuleManager().execModule("InsPosizioneMD", paramMap);
/*  731 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       }
/*  733 */       else if (this.action.equals("INS_QUAD_SEC_POSIZIONE_DT")) {
/*  734 */         quadPosizione = (QuadSecPosizioneDt)getBean(oQuadPosizione, QuadSecPosizioneDt.class);
/*  735 */         paramMap.putAppl("QUAD_POSIZIONE", quadPosizione);
/*  736 */         getModuleManager().execModule("InsQuadSecPosizioneDtMD", paramMap);
/*  737 */         resultMap.putAppl("RESULT", "INSERTED");
/*      */       } else {
/*      */         
/*  740 */         if (this.action.equals("GET_ORDINE_BY_ORDINEID")) {
/*  741 */           FinOrdine ordine = (FinOrdine)map.getAppl("ORDINE");
/*  742 */           MapContainer paramIn = new MapContainer();
/*  743 */           paramIn.putAppl("ORDINE_ID", ordine.getOrdineId());
/*  744 */           resultMap = getModuleManager().execModule("GetOrdineByOrdineIDMD", paramIn);
/*  745 */           return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */         } 
/*  747 */         if (this.action.equals("GET_POSIZIONE_BY_POSIZIONE_ID")) {
/*  748 */           FinPosizione posizioneIn = (FinPosizione)map.getAppl("POSIZIONE_IN");
/*  749 */           MapContainer paramIn = new MapContainer();
/*  750 */           paramIn.putAppl("POSIZIONE_ID", posizioneIn.getPosizioneId());
/*  751 */           resultMap = getModuleManager().execModule("GetPosizioneByPosizioneId", paramIn);
/*  752 */           return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*      */         } 
/*      */ 
/*      */         
/*  756 */         String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*  757 */         if (this.log.isErrorEnabled()) {
/*  758 */           this.log.error(errorMessage);
/*      */         }
/*  760 */         throw new RasServiceException(errorMessage);
/*      */       } 
/*  762 */     }  return resultMap;
/*      */   }
/*      */ 
/*      */   
/*      */   private boolean gestioneSottoscrizione(FinOrdine ordine, String NomeBatch) throws RasServiceException {
/*  767 */     MapContainer paramIn = new MapContainer();
/*  768 */     MapContainer resultMap = null;
/*  769 */     int out = 0;
/*  770 */     FinSottoscrizione sottoscrizione = ordine.getSottoscrizione();
/*  771 */     paramIn.putAppl("SOTTOSCRIZIONE_ID", sottoscrizione);
/*  772 */     resultMap = getModuleManager().execModule("GetOrdiniBySottIDMD", paramIn);
/*  773 */     ArrayList result = (ArrayList)resultMap.getAppl("ORDINE");
/*  774 */     if (result.size() == 0) {
/*  775 */       return false;
/*      */     }
/*      */     
/*  778 */     out = result.size();
/*  779 */     for (int i = 0; i < result.size() && 
/*  780 */       (FinOrdine)result.get(i) != null && ((FinOrdine)result.get(i)).getStato().equals("E"); i++) {
/*  781 */       out--;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  786 */     if (out == 0) {
/*  787 */       sottoscrizione.setStato("E");
/*  788 */       ArchUtils.setStdFields(sottoscrizione, "U", NomeBatch);
/*      */     } 
/*      */     
/*  791 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private boolean azzeraQPren(FinOrdine ordine) throws RasServiceException {
/*  797 */     MapContainer paramIn = new MapContainer();
/*  798 */     MapContainer resultMap = null;
/*  799 */     boolean azzera = false;
/*  800 */     FinSottoscrizione sottoscrizione = ordine.getSottoscrizione();
/*  801 */     paramIn.putAppl("SOTTOSCRIZIONE_ID", sottoscrizione.getSottoscrizioneId());
/*  802 */     resultMap = getModuleManager().execModule("GetOrdiniBySottIDMD", paramIn);
/*  803 */     ArrayList result = (ArrayList)resultMap.getAppl("ORDINE");
/*  804 */     if (result.size() == 0) {
/*  805 */       azzera = false;
/*      */     }
/*      */     else {
/*      */       
/*  809 */       for (int i = 0; i < result.size(); i++) {
/*  810 */         FinOrdine ordineAtt = result.get(i);
/*  811 */         if (ordineAtt != null && ordineAtt.getStato() != null && ordineAtt.getStato().equals("I")) {
/*  812 */           if (ordineAtt.getCausale() != null && (ordineAtt.getCausale().equals("830") || ordineAtt.getCausale().equals("530") || ordineAtt.getCausale().equals("773"))) {
/*      */             
/*  814 */             azzera = false;
/*      */             
/*      */             break;
/*      */           } 
/*      */         } else {
/*  819 */           azzera = true;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  826 */     return azzera;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private String gestioneCausale(String causale) {
/*  832 */     int causaleInt = (new Integer(causale)).intValue();
/*  833 */     if ((causaleInt <= this.sottoscrMax && causaleInt >= this.sottoscrMin) || causaleInt == this.sottdscr1) {
/*  834 */       causale = "100";
/*      */     }
/*  836 */     else if ((causaleInt >= this.aggMin && causaleInt <= this.aggMax) || (causaleInt >= this.aggMin1 && causaleInt <= this.aggMax1)) {
/*  837 */       causale = "102";
/*      */     }
/*  839 */     else if (causaleInt == this.rimbParz || causaleInt == this.rimbParz3 || (causaleInt >= this.rimbParzMin && causaleInt <= this.rimbParzMax) || (causaleInt >= this.rimbParzMin1 && causaleInt <= this.rimbParzMax1)) {
/*  840 */       causale = "530";
/*      */     }
/*  842 */     else if ((causaleInt >= this.rimbTotMin && causaleInt <= this.rimbTotMax) || (causaleInt >= this.rimbTotMin1 && causaleInt <= this.rimbTotMax1)) {
/*  843 */       causale = "500";
/*      */     }
/*  845 */     else if ((causaleInt >= this.swInMin && causaleInt <= this.swInMax) || (causaleInt >= this.swInMin1 && causaleInt <= this.swInMax1) || (causaleInt >= this.swInMin2 && causaleInt <= this.swInMax2)) {
/*      */       
/*  847 */       causale = "130";
/*      */     }
/*  849 */     else if (causaleInt >= this.swOutMin && causaleInt <= this.swOutMax) {
/*  850 */       causale = "830";
/*      */     }
/*  852 */     else if (causaleInt >= this.passTotMin && causaleInt <= this.passTotMax) {
/*  853 */       causale = "840";
/*      */     }
/*  855 */     else if (causaleInt == this.revRid) {
/*  856 */       causale = "431";
/*      */     } 
/*      */     
/*  859 */     return causale;
/*      */   }
/*      */ 
/*      */   
/*      */   private FinPosizione processMovimento(FinPosizione posizione, FinMovimento movimento, FinOrdine ordine, int segno) throws RasServiceException {
/*  864 */     Double newValue = this.EMPTY_NUMBER;
/*      */ 
/*      */ 
/*      */     
/*  868 */     if (!this.isFinGp && segno < 0 && ordine != null && ordine.getQuantita() != null && ordine.getOrdineId() != null && ordine.getOrdineId().intValue() != -1 && posizione.getQtPrenotata() != null && posizione.getQtPrenotata().doubleValue() != 0.0D) {
/*  869 */       Double qPrenOrdine = this.EMPTY_NUMBER;
/*  870 */       Double newQtPren = this.EMPTY_NUMBER;
/*  871 */       if (!azzeraQPren(ordine) && !movimento.getTipo().equals("RT")) {
/*  872 */         qPrenOrdine = new Double(Math.abs(ordine.getQuantita().doubleValue()) * segno);
/*  873 */         newQtPren = processVariazione(posizione.getQtPrenotata(), qPrenOrdine);
/*      */       } 
/*  875 */       if (newQtPren.doubleValue() < this.EMPTY_NUMBER.doubleValue()) {
/*  876 */         newQtPren = this.EMPTY_NUMBER;
/*      */       }
/*  878 */       posizione.setQtPrenotata(newQtPren);
/*      */     } 
/*      */ 
/*      */     
/*  882 */     if (!this.isFinGp) {
/*      */ 
/*      */ 
/*      */       
/*  886 */       newValue = processVariazione(posizione.getQuantita(), movimento.getQuantita());
/*      */       
/*  888 */       if (newValue.doubleValue() < this.EMPTY_NUMBER.doubleValue()) {
/*  889 */         newValue = this.EMPTY_NUMBER;
/*      */       }
/*  891 */       posizione.setQuantita(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  896 */       newValue = processVariazione(posizione.getQuantitaDisp(), movimento.getQuantita());
/*  897 */       if (newValue.doubleValue() < this.EMPTY_NUMBER.doubleValue()) {
/*  898 */         newValue = this.EMPTY_NUMBER;
/*      */       }
/*      */       
/*  901 */       posizione.setQuantitaDisp(newValue);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  908 */     newValue = processVariazione(posizione.getCommissioni(), movimento.getCommissioni());
/*  909 */     posizione.setCommissioni(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  914 */     newValue = processVariazione(posizione.getSpese(), movimento.getSpese());
/*  915 */     posizione.setSpese(newValue);
/*  916 */     newValue = processVariazione(posizione.getSpese(), movimento.getTasse());
/*  917 */     posizione.setSpese(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  922 */     newValue = processVariazione(posizione.getImpVersatoLordo(), movimento.getImpVersatoLordo());
/*  923 */     posizione.setImpVersatoLordo(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  928 */     newValue = processVariazione(posizione.getImpPrelevLordo(), movimento.getImpPrelevLordo());
/*  929 */     posizione.setImpPrelevLordo(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  934 */     newValue = processVariazione(posizione.getImpGiroconLordo(), movimento.getImpGiroconLordo());
/*  935 */     posizione.setImpGiroconLordo(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  940 */     newValue = processVariazione(posizione.getImpVersatoNetto(), movimento.getImpVersatoNetto());
/*  941 */     posizione.setImpVersatoNetto(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  946 */     newValue = processVariazione(posizione.getImpPrelevNetto(), movimento.getImpPrelevNetto());
/*  947 */     posizione.setImpPrelevNetto(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  952 */     newValue = processVariazione(posizione.getImpGiroconNetto(), movimento.getImpGiroconNetto());
/*  953 */     posizione.setImpGiroconNetto(newValue);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  958 */     newValue = processVariazione(posizione.getNumQuoteCert(), movimento.getNumQuoteCert());
/*  959 */     posizione.setNumQuoteCert(newValue);
/*      */     
/*  961 */     return posizione;
/*      */   }
/*      */ 
/*      */   
/*      */   private Double processVariazione(Double actual, Double delta) {
/*  966 */     if (actual == null) {
/*  967 */       actual = this.EMPTY_NUMBER;
/*      */     }
/*  969 */     if (delta == null) {
/*  970 */       delta = this.EMPTY_NUMBER;
/*      */     }
/*  972 */     double returnValue = actual.doubleValue() + delta.doubleValue();
/*  973 */     return new Double(returnValue);
/*      */   }
/*      */   
/*      */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/*  977 */     ArrayList result = (ArrayList)resultMap.getAppl("POSIZIONE");
/*  978 */     resultMap.removeAppl("POSIZIONE");
/*      */     
/*  980 */     if (result.size() == 0) {
/*  981 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*      */     }
/*  983 */     else if (result.size() == 1) {
/*  984 */       resultMap.putAppl("RESULT", "FOUND");
/*  985 */       resultMap.putAppl("POSIZIONE", result.get(0));
/*      */     }
/*  987 */     else if (allowMultipleRow) {
/*  988 */       resultMap.putAppl("RESULT", "FOUND");
/*  989 */       resultMap.putAppl("POSIZIONE", result);
/*      */     } else {
/*      */       
/*  992 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*      */     } 
/*  994 */     return resultMap;
/*      */   }
/*      */ 
/*      */   
/*      */   private Object getBean(Object obj, Class c) throws RasServiceException {
/*  999 */     if (obj == null) {
/* 1000 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 1001 */       if (this.log.isErrorEnabled()) {
/* 1002 */         this.log.error(errorMessage);
/*      */       }
/* 1004 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/* 1007 */     return obj;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getAction() {
/* 1012 */     return this.action;
/*      */   }
/*      */   
/*      */   public void setAction(String action) {
/* 1016 */     this.action = action;
/*      */   }
/*      */   
/*      */   public String getCreaPosizione() {
/* 1020 */     return this.creaPosizione;
/*      */   }
/*      */   
/*      */   public void setCreaPosizione(String creaPosizione) {
/* 1024 */     this.creaPosizione = creaPosizione;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPosizione(FinContratto contratto, FinPosizione posizione, String NomeBatch) throws ParseException {
/* 1029 */     Double num = new Double(0.0D);
/*      */ 
/*      */ 
/*      */     
/* 1033 */     posizione.setContratto((FinContrattoBase)contratto);
/*      */     
/* 1035 */     posizione.setDataCreazione(new Date());
/* 1036 */     posizione.setTipo("LIQ");
/* 1037 */     posizione.setQuantita(num);
/* 1038 */     posizione.setQuantitaDisp(num);
/* 1039 */     posizione.setQtBloccata(num);
/* 1040 */     posizione.setQtTunnel1(num);
/* 1041 */     posizione.setQtTunnel2(num);
/* 1042 */     posizione.setQtTunnel3(num);
/* 1043 */     posizione.setQtTunnel4(num);
/* 1044 */     posizione.setCtv(num);
/* 1045 */     posizione.setRateo(num);
/* 1046 */     posizione.setPmc(num);
/* 1047 */     posizione.setCambioMedio(num);
/* 1048 */     posizione.setValQuota(num);
/* 1049 */     posizione.setGiacenzaMedia(num);
/* 1050 */     posizione.setGgDaApert(new Integer(0));
/* 1051 */     posizione.setCommissioni(num);
/* 1052 */     posizione.setSpese(num);
/* 1053 */     posizione.setImpVersatoLordo(num);
/* 1054 */     posizione.setImpPrelevLordo(num);
/* 1055 */     posizione.setImpGiroconLordo(num);
/* 1056 */     posizione.setImpPlusvalLordo(num);
/* 1057 */     posizione.setImpVersatoNetto(num);
/* 1058 */     posizione.setImpPrelevNetto(num);
/* 1059 */     posizione.setImpGiroconNetto(num);
/* 1060 */     posizione.setImpPlusvalNetto(num);
/* 1061 */     posizione.setRendInvestLordo(num);
/* 1062 */     posizione.setRendInvestNetto(num);
/* 1063 */     posizione.setNumQuoteCert(num);
/* 1064 */     posizione.setDataVal(new Date());
/* 1065 */     posizione.setTipoProdotto(contratto.getTipoProdotto());
/*      */     
/* 1067 */     posizione.setDataInserimento(new Date());
/* 1068 */     posizione.setUtenteInserimento(NomeBatch);
/* 1069 */     ArchUtils.setStdFields(posizione, "I", NomeBatch);
/*      */   }
/*      */   
/*      */   private Object controlloDettaglio(Object dettaglio, String action) throws RasServiceException {
/* 1073 */     if (!(dettaglio instanceof FinDettaglioPct)) {
/*      */       
/* 1075 */       String errorMessage = "L'oggetto ricevuto dal servizio è di tipo errato, l'azione è :" + action;
/* 1076 */       if (this.log.isErrorEnabled()) {
/* 1077 */         this.log.error(errorMessage);
/*      */       }
/* 1079 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/* 1082 */     return dettaglio;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private int gestioneSegnoMovimento(FinMovimento movimento) throws RasServiceException {
/*      */     int segno;
/*      */     int causale;
/*      */     try {
/* 1097 */       causale = Integer.parseInt(movimento.getCausale());
/* 1098 */     } catch (Exception e) {
/* 1099 */       String errorMessage = "Errore: impossibile convertire in numero la causale ricevuta: " + movimento.getCausale();
/* 1100 */       if (this.log.isErrorEnabled()) {
/* 1101 */         this.log.error(errorMessage);
/*      */       }
/* 1103 */       throw new RasServiceException(errorMessage);
/*      */     } 
/*      */     
/* 1106 */     if (causale > this.movimentoNegMax) {
/*      */       
/* 1108 */       segno = 0;
/*      */     
/*      */     }
/* 1111 */     else if (movimento.getImpPrelevLordo() != null || movimento.getImpPrelevNetto() != null) {
/* 1112 */       segno = -1;
/*      */     }
/* 1114 */     else if (movimento.getImpVersatoLordo() != null || movimento.getImpVersatoNetto() != null) {
/* 1115 */       segno = 1;
/*      */     }
/* 1117 */     else if (causale <= this.movimentoNegMax && causale >= this.movimentoNegMin) {
/* 1118 */       segno = -1;
/*      */     }
/* 1120 */     else if (causale <= this.movimentoPosMax && causale >= this.movimentoPosMin) {
/* 1121 */       segno = 1;
/*      */     }
/* 1123 */     else if (causale <= this.movimentoDaVerMax && causale >= this.movimentoDaVerMin) {
/* 1124 */       if ((movimento.getCtvLordo() != null && movimento.getCtvLordo().intValue() < 0) || (movimento.getCtvNetto() != null && movimento.getCtvNetto().intValue() < 0)) {
/* 1125 */         movimento.setCausale("853");
/* 1126 */         segno = -1;
/*      */       } else {
/*      */         
/* 1129 */         movimento.setCausale("408");
/* 1130 */         segno = 1;
/*      */       } 
/*      */     } else {
/* 1133 */       String errorMessage = "Errore: causale non ammessa: " + movimento.getCausale();
/* 1134 */       if (this.log.isErrorEnabled()) {
/* 1135 */         this.log.error(errorMessage);
/*      */       }
/* 1137 */       throw new RasServiceException(errorMessage);
/*      */     } 
/* 1139 */     return segno;
/*      */   }
/*      */ 
/*      */   
/*      */   private void controllaDataPos(FinPosizione posizione, FinMovimento movimento) {
/* 1144 */     if (movimento.getDataValuta() != null && (posizione.getDataUltMov() == null || posizione.getDataUltMov().before(movimento.getDataValuta()))) {
/* 1145 */       posizione.setDataUltMov(movimento.getDataValuta());
/*      */     }
/* 1147 */     if (movimento.getDataValuta() != null && (posizione.getDataPrimoMov() == null || posizione.getDataPrimoMov().after(movimento.getDataValuta()))) {
/* 1148 */       posizione.setDataPrimoMov(movimento.getDataValuta());
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCreaOrdine() {
/* 1154 */     return this.creaOrdine;
/*      */   }
/*      */   
/*      */   public void setCreaOrdine(String creaOrdine) {
/* 1158 */     this.creaOrdine = creaOrdine;
/*      */   }
/*      */   
/*      */   public int getMovimentoDaVerMax() {
/* 1162 */     return this.movimentoDaVerMax;
/*      */   }
/*      */   
/*      */   public void setMovimentoDaVerMax(int movimentoDaVerMax) {
/* 1166 */     this.movimentoDaVerMax = movimentoDaVerMax;
/*      */   }
/*      */   
/*      */   public int getMovimentoDaVerMin() {
/* 1170 */     return this.movimentoDaVerMin;
/*      */   }
/*      */   
/*      */   public void setMovimentoDaVerMin(int movimentoDaVerMin) {
/* 1174 */     this.movimentoDaVerMin = movimentoDaVerMin;
/*      */   }
/*      */   
/*      */   public int getMovimentoNegMax() {
/* 1178 */     return this.movimentoNegMax;
/*      */   }
/*      */   
/*      */   public void setMovimentoNegMax(int movimentoNegMax) {
/* 1182 */     this.movimentoNegMax = movimentoNegMax;
/*      */   }
/*      */   
/*      */   public int getMovimentoNegMin() {
/* 1186 */     return this.movimentoNegMin;
/*      */   }
/*      */   
/*      */   public void setMovimentoNegMin(int movimentoNegMin) {
/* 1190 */     this.movimentoNegMin = movimentoNegMin;
/*      */   }
/*      */   
/*      */   public int getMovimentoPosMax() {
/* 1194 */     return this.movimentoPosMax;
/*      */   }
/*      */   
/*      */   public void setMovimentoPosMax(int movimentoPosMax) {
/* 1198 */     this.movimentoPosMax = movimentoPosMax;
/*      */   }
/*      */   
/*      */   public int getMovimentoPosMin() {
/* 1202 */     return this.movimentoPosMin;
/*      */   }
/*      */   
/*      */   public void setMovimentoPosMin(int movimentoPosMin) {
/* 1206 */     this.movimentoPosMin = movimentoPosMin;
/*      */   }
/*      */   
/*      */   public CodesTableManager getCodesTableManager() {
/* 1210 */     return this.codesTableManager;
/*      */   }
/*      */   
/*      */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 1214 */     this.codesTableManager = codesTableManager;
/*      */   }
/*      */   
/*      */   public int getAggMax() {
/* 1218 */     return this.aggMax;
/*      */   }
/*      */   
/*      */   public void setAggMax(int aggMax) {
/* 1222 */     this.aggMax = aggMax;
/*      */   }
/*      */   
/*      */   public int getAggMax1() {
/* 1226 */     return this.aggMax1;
/*      */   }
/*      */   
/*      */   public void setAggMax1(int aggMax1) {
/* 1230 */     this.aggMax1 = aggMax1;
/*      */   }
/*      */   
/*      */   public int getAggMin() {
/* 1234 */     return this.aggMin;
/*      */   }
/*      */   
/*      */   public void setAggMin(int aggMin) {
/* 1238 */     this.aggMin = aggMin;
/*      */   }
/*      */   
/*      */   public int getAggMin1() {
/* 1242 */     return this.aggMin1;
/*      */   }
/*      */   
/*      */   public void setAggMin1(int aggMin1) {
/* 1246 */     this.aggMin1 = aggMin1;
/*      */   }
/*      */   
/*      */   public int getPassTotMax() {
/* 1250 */     return this.passTotMax;
/*      */   }
/*      */   
/*      */   public void setPassTotMax(int passTotMax) {
/* 1254 */     this.passTotMax = passTotMax;
/*      */   }
/*      */   
/*      */   public int getPassTotMin() {
/* 1258 */     return this.passTotMin;
/*      */   }
/*      */   
/*      */   public void setPassTotMin(int passTotMin) {
/* 1262 */     this.passTotMin = passTotMin;
/*      */   }
/*      */   
/*      */   public int getRimbParz() {
/* 1266 */     return this.rimbParz;
/*      */   }
/*      */   
/*      */   public void setRimbParz(int rimbParz) {
/* 1270 */     this.rimbParz = rimbParz;
/*      */   }
/*      */   
/*      */   public int getRimbParzMax() {
/* 1274 */     return this.rimbParzMax;
/*      */   }
/*      */   
/*      */   public void setRimbParzMax(int rimbParzMax) {
/* 1278 */     this.rimbParzMax = rimbParzMax;
/*      */   }
/*      */   
/*      */   public int getRimbParzMax1() {
/* 1282 */     return this.rimbParzMax1;
/*      */   }
/*      */   
/*      */   public void setRimbParzMax1(int rimbParzMax1) {
/* 1286 */     this.rimbParzMax1 = rimbParzMax1;
/*      */   }
/*      */   
/*      */   public int getRimbParzMin() {
/* 1290 */     return this.rimbParzMin;
/*      */   }
/*      */   
/*      */   public void setRimbParzMin(int rimbParzMin) {
/* 1294 */     this.rimbParzMin = rimbParzMin;
/*      */   }
/*      */   
/*      */   public int getRimbParzMin1() {
/* 1298 */     return this.rimbParzMin1;
/*      */   }
/*      */   
/*      */   public void setRimbParzMin1(int rimbParzMin1) {
/* 1302 */     this.rimbParzMin1 = rimbParzMin1;
/*      */   }
/*      */   
/*      */   public int getRimbTotMax() {
/* 1306 */     return this.rimbTotMax;
/*      */   }
/*      */   
/*      */   public void setRimbTotMax(int rimbTotMax) {
/* 1310 */     this.rimbTotMax = rimbTotMax;
/*      */   }
/*      */   
/*      */   public int getRimbTotMin() {
/* 1314 */     return this.rimbTotMin;
/*      */   }
/*      */   
/*      */   public void setRimbTotMin(int rimbTotMin) {
/* 1318 */     this.rimbTotMin = rimbTotMin;
/*      */   }
/*      */   
/*      */   public int getSottoscrMax() {
/* 1322 */     return this.sottoscrMax;
/*      */   }
/*      */   
/*      */   public void setSottoscrMax(int sottoscrMax) {
/* 1326 */     this.sottoscrMax = sottoscrMax;
/*      */   }
/*      */   
/*      */   public int getSottoscrMin() {
/* 1330 */     return this.sottoscrMin;
/*      */   }
/*      */   
/*      */   public void setSottoscrMin(int sottoscrMin) {
/* 1334 */     this.sottoscrMin = sottoscrMin;
/*      */   }
/*      */   
/*      */   public int getSwInMax() {
/* 1338 */     return this.swInMax;
/*      */   }
/*      */   
/*      */   public void setSwInMax(int swInMax) {
/* 1342 */     this.swInMax = swInMax;
/*      */   }
/*      */   
/*      */   public int getSwInMax1() {
/* 1346 */     return this.swInMax1;
/*      */   }
/*      */   
/*      */   public void setSwInMax1(int swInMax1) {
/* 1350 */     this.swInMax1 = swInMax1;
/*      */   }
/*      */   
/*      */   public int getSwInMax2() {
/* 1354 */     return this.swInMax2;
/*      */   }
/*      */   
/*      */   public void setSwInMax2(int swInMax2) {
/* 1358 */     this.swInMax2 = swInMax2;
/*      */   }
/*      */   
/*      */   public int getSwInMin() {
/* 1362 */     return this.swInMin;
/*      */   }
/*      */   
/*      */   public void setSwInMin(int swInMin) {
/* 1366 */     this.swInMin = swInMin;
/*      */   }
/*      */   
/*      */   public int getSwInMin1() {
/* 1370 */     return this.swInMin1;
/*      */   }
/*      */   
/*      */   public void setSwInMin1(int swInMin1) {
/* 1374 */     this.swInMin1 = swInMin1;
/*      */   }
/*      */   
/*      */   public int getSwInMin2() {
/* 1378 */     return this.swInMin2;
/*      */   }
/*      */   
/*      */   public void setSwInMin2(int swInMin2) {
/* 1382 */     this.swInMin2 = swInMin2;
/*      */   }
/*      */   
/*      */   public int getSwOutMax() {
/* 1386 */     return this.swOutMax;
/*      */   }
/*      */   
/*      */   public void setSwOutMax(int swOutMax) {
/* 1390 */     this.swOutMax = swOutMax;
/*      */   }
/*      */   
/*      */   public int getSwOutMin() {
/* 1394 */     return this.swOutMin;
/*      */   }
/*      */   
/*      */   public void setSwOutMin(int swOutMin) {
/* 1398 */     this.swOutMin = swOutMin;
/*      */   }
/*      */   
/*      */   public int getRevRid() {
/* 1402 */     return this.revRid;
/*      */   }
/*      */   
/*      */   public void setRevRid(int revRid) {
/* 1406 */     this.revRid = revRid;
/*      */   }
/*      */   
/*      */   public int getRimbParz3() {
/* 1410 */     return this.rimbParz3;
/*      */   }
/*      */   
/*      */   public void setRimbParz3(int rimbParz3) {
/* 1414 */     this.rimbParz3 = rimbParz3;
/*      */   }
/*      */   
/*      */   public int getRimbTotMax1() {
/* 1418 */     return this.rimbTotMax1;
/*      */   }
/*      */   
/*      */   public void setRimbTotMax1(int rimbTotMax1) {
/* 1422 */     this.rimbTotMax1 = rimbTotMax1;
/*      */   }
/*      */   
/*      */   public int getRimbTotMin1() {
/* 1426 */     return this.rimbTotMin1;
/*      */   }
/*      */   
/*      */   public void setRimbTotMin1(int rimbTotMin1) {
/* 1430 */     this.rimbTotMin1 = rimbTotMin1;
/*      */   }
/*      */   
/*      */   public int getSottdscr1() {
/* 1434 */     return this.sottdscr1;
/*      */   }
/*      */   
/*      */   public void setSottdscr1(int sottdscr1) {
/* 1438 */     this.sottdscr1 = sottdscr1;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PosizioneManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */