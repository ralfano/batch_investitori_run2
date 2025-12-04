/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinNazioniUic;
/*     */ import it.ras.arco.bean.FinValuteUic;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CodificaManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   private String action;
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*  29 */   private String GENERIC_MODULE_RESULT = "";
/*     */   
/*     */   public static final String NAZIONE = "NAZIONE";
/*     */   
/*     */   public static final String VALUTA = "VALUTA";
/*     */   public static final String CODICE_ISO = "CODICE_ISO";
/*     */   public static final String CODICE_UIC = "CODICE_UIC";
/*     */   public static final String CHECK_CODE_UIC_NAZIONI = "CHECK_CODE_UIC_NAZIONI";
/*     */   public static final String CHECK_CODE_UIC_VALUTA = "CHECK_CODE_UIC_VALUTA";
/*     */   public static final String GET_NAZIONE_BY_COD_ISO = "GetNazioneByCodIso";
/*     */   public static final String GET_VALUTA_BY_COD_ISO = "GetValutaByCodIso";
/*  40 */   private Log log = LogFactory.getLog(ContrattoManagerSRV.class);
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
/*  51 */     MapContainer resultMap = new MapContainer();
/*  52 */     MapContainer paramMap = new MapContainer();
/*  53 */     String moduleName = null;
/*     */     
/*  55 */     FinNazioniUic nazione = null;
/*  56 */     FinValuteUic valuta = null;
/*     */     
/*  58 */     Object oNazione = map.getAppl("NAZIONE");
/*  59 */     Object oValuta = map.getAppl("VALUTA");
/*     */     
/*  61 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */ 
/*     */     
/*  65 */     Boolean allowMultipleRows = null;
/*     */     
/*  67 */     if (oAllowMultipleRows == null) {
/*  68 */       oAllowMultipleRows = new Boolean(false);
/*  69 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  70 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*     */       
/*  72 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/*  75 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  77 */     if (this.action.equals("GetNazioneByCodIso")) {
/*     */ 
/*     */       
/*  80 */       this.GENERIC_MODULE_RESULT = "NAZIONE";
/*  81 */       nazione = (FinNazioniUic)getBean(oNazione, FinNazioniUic.class);
/*  82 */       String codiceIso = nazione.getCodiceIso();
/*     */ 
/*     */       
/*  85 */       paramMap.putAppl("CODICE_ISO", codiceIso);
/*     */ 
/*     */       
/*  88 */       moduleName = this.action;
/*  89 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  90 */       resultMap = processResultMap(resultMap, false);
/*     */     
/*     */     }
/*  93 */     else if (this.action.equals("GetValutaByCodIso")) {
/*     */ 
/*     */       
/*  96 */       this.GENERIC_MODULE_RESULT = "VALUTA";
/*  97 */       valuta = (FinValuteUic)getBean(oValuta, FinValuteUic.class);
/*  98 */       String codiceIso = valuta.getCodiceIso();
/*     */ 
/*     */       
/* 101 */       paramMap.putAppl("CODICE_ISO", codiceIso);
/*     */ 
/*     */       
/* 104 */       moduleName = this.action;
/* 105 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 106 */       resultMap = processResultMap(resultMap, false);
/*     */     
/*     */     }
/* 109 */     else if (this.action.equals("CHECK_CODE_UIC_NAZIONI")) {
/*     */       
/* 111 */       this.GENERIC_MODULE_RESULT = "NAZIONE";
/* 112 */       nazione = (FinNazioniUic)getBean(oNazione, FinNazioniUic.class);
/* 113 */       String codiceUic = nazione.getCodiceUic();
/*     */       
/* 115 */       paramMap.putAppl("CODICE_UIC", codiceUic);
/*     */       
/* 117 */       moduleName = this.action;
/* 118 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 119 */       resultMap = processResultMap(resultMap, false);
/*     */ 
/*     */     
/*     */     }
/* 123 */     else if (this.action.equals("CHECK_CODE_UIC_VALUTA")) {
/*     */       
/* 125 */       this.GENERIC_MODULE_RESULT = "VALUTA";
/* 126 */       valuta = (FinValuteUic)getBean(oValuta, FinValuteUic.class);
/* 127 */       String codiceUic = valuta.getCodiceUic();
/*     */       
/* 129 */       paramMap.putAppl("CODICE_UIC", codiceUic);
/*     */       
/* 131 */       moduleName = this.action;
/* 132 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 133 */       resultMap = processResultMap(resultMap, false);
/*     */     }
/*     */     else {
/*     */       
/* 137 */       String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*     */       
/* 139 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 141 */     return resultMap;
/*     */   }
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 144 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/* 145 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 147 */     if (result.size() == 0) {
/* 148 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 150 */     else if (result.size() == 1) {
/* 151 */       resultMap.putAppl("RESULT", "FOUND");
/* 152 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result.get(0));
/*     */     }
/* 154 */     else if (allowMultipleRow) {
/* 155 */       resultMap.putAppl("RESULT", "FOUND");
/* 156 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result);
/*     */     } else {
/*     */       
/* 159 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 161 */     return resultMap;
/*     */   }
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 165 */     if (obj == null) {
/* 166 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 167 */       if (this.log.isErrorEnabled()) {
/* 168 */         this.log.error(errorMessage);
/*     */       }
/* 170 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 173 */     return obj;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 179 */     this.action = action;
/*     */   }
/*     */   public String getAction() {
/* 182 */     return this.action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\CodificaManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */