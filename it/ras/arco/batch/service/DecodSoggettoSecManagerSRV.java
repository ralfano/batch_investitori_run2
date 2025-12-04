/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinDecodSoggettoSec;
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
/*     */ public class DecodSoggettoSecManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  25 */   private String action = "ACTION";
/*  26 */   private Log log = LogFactory.getLog(DecodSoggettoSecManagerSRV.class);
/*     */   
/*     */   public static final String GENERIC_MODULE_RESULT = "SOGGETTO_SEC";
/*     */   
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   
/*     */   public static final String SOGGETTO_SEC = "SOGGETTO_SEC";
/*     */   
/*     */   public static final String GET_DECOD_SOGGETTO_SEC_MD = "getSoggettoSecMD";
/*     */   
/*     */   public static final String GET_DECOD_SOGGETTO_SEC_CSOT_CODFABR_RAPP_MD = "GetSoggettoSecByCsotCodFabrRappMD";
/*     */   
/*     */   public static final String GetDecodSoggettoSecSRV = "GetDecodSoggettoSecSRV";
/*     */   
/*     */   public static final String GetSoggettoSecByCsotCodFabrRappSRV = "GetSoggettoSecByCsotCodFabrRappSRV";
/*     */   
/*     */   public static final String GET_SOGGETTO_BY_CRAP_AND_CSOTT = "GET_SOGGETTO_BY_CRAP_AND_CSOTT";
/*     */   
/*     */   public static final String GET_SOGGETTO_BY_CRAP_AND_CSOTT_AND_CODFABBR = "GET_SOGGETTO_BY_CRAP_AND_CSOTT_AND_CODFABBR";
/*     */   
/*     */   public static final String CRAP = "CRAP";
/*     */   
/*     */   public static final String C_SOT = "C_SOT";
/*     */   
/*     */   public static final String COD_FABBRICA = "COD_FABBR";
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  56 */     MapContainer resultMap = new MapContainer();
/*  57 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  59 */     String moduleName = null;
/*  60 */     Boolean allowMultipleRows = null;
/*     */     
/*  62 */     Object oSoggettoSec = map.getAppl("SOGGETTO_SEC");
/*  63 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  65 */     FinDecodSoggettoSec soggettoSec = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     if (oAllowMultipleRows == null) {
/*  71 */       oAllowMultipleRows = new Boolean(false);
/*  72 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  73 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  74 */       if (this.log.isErrorEnabled()) {
/*  75 */         this.log.error(str);
/*     */       }
/*  77 */       throw new RasServiceException(str);
/*     */     } 
/*  79 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     if (this.action.equals("GET_SOGGETTO_BY_CRAP_AND_CSOTT")) {
/*     */       
/*  86 */       soggettoSec = (FinDecodSoggettoSec)getBean(oSoggettoSec, FinDecodSoggettoSec.class);
/*     */       
/*  88 */       String crap = soggettoSec.getCrap();
/*  89 */       String cSott = soggettoSec.getCodCsot();
/*     */       
/*  91 */       moduleName = "getSoggettoSecMD";
/*     */       
/*  93 */       paramMap.putAppl("CRAP", crap);
/*  94 */       paramMap.putAppl("C_SOT", cSott);
/*  95 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       
/*  97 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */     
/* 101 */     if (this.action.equals("GET_SOGGETTO_BY_CRAP_AND_CSOTT_AND_CODFABBR")) {
/*     */       
/* 103 */       soggettoSec = (FinDecodSoggettoSec)getBean(oSoggettoSec, FinDecodSoggettoSec.class);
/*     */       
/* 105 */       String crap = soggettoSec.getCrap();
/* 106 */       String cSott = soggettoSec.getCodCsot();
/* 107 */       String codiceFabbrica = soggettoSec.getCodiceFabbricaCorr();
/*     */ 
/*     */       
/* 110 */       moduleName = "GetSoggettoSecByCsotCodFabrRappMD";
/*     */       
/* 112 */       paramMap.putAppl("CRAP", crap);
/* 113 */       paramMap.putAppl("C_SOT", cSott);
/* 114 */       paramMap.putAppl("COD_FABBR", codiceFabbrica);
/* 115 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       
/* 117 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 122 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 123 */     if (this.log.isErrorEnabled()) {
/* 124 */       this.log.error(errorMessage);
/*     */     }
/* 126 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 136 */     ArrayList result = (ArrayList)resultMap.getAppl("SOGGETTO_SEC");
/* 137 */     resultMap.removeAppl("SOGGETTO_SEC");
/*     */     
/* 139 */     if (result.size() == 0) {
/* 140 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 142 */     else if (result.size() == 1) {
/* 143 */       resultMap.putAppl("RESULT", "FOUND");
/* 144 */       resultMap.putAppl("SOGGETTO_SEC", result.get(0));
/*     */     }
/* 146 */     else if (allowMultipleRow) {
/* 147 */       resultMap.putAppl("RESULT", "FOUND");
/* 148 */       resultMap.putAppl("SOGGETTO_SEC", result);
/*     */     } else {
/*     */       
/* 151 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 153 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 162 */     if (obj == null) {
/*     */       
/* 164 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/*     */       
/* 166 */       if (this.log.isErrorEnabled())
/*     */       {
/* 168 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 172 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 176 */     if (!obj.getClass().equals(c)) {
/*     */       
/* 178 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/*     */       
/* 180 */       if (this.log.isErrorEnabled())
/*     */       {
/* 182 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 186 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 190 */     return obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 197 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 201 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\DecodSoggettoSecManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */