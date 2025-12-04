/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxSoggettoIndirXP;
/*     */ import it.ras.arco.bean.FinDecodSoggettoXP;
/*     */ import it.ras.arco.bean.FinIndirizzo;
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
/*     */ public class UtilitaMigrazioneXP
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String SOGGETTO_ID = "SOGGETTO_ID";
/*     */   public static final String SOGGETTO_XP = "SOGGETTO_XP";
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   public static final String INDIRIZZO = "INDIRIZZO";
/*     */   public static final String INDIRIZZO_ID = "INDIRIZZO_ID";
/*     */   public static final String SOGGETTO_XP_ARCO = "SOGGETTO_XP_ARCO";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String SOGGETTO_INDIRIZZO = "SOGGETTO_INDIRIZZO";
/*     */   public static final String CONTRATTO_INDIRIZZO = "CONTRATTO_INDIRIZZO";
/*  30 */   public String GENERIC_MODULE_RESULT = null;
/*     */   
/*     */   public static final String INSERT_DECOD_SOGGETTO = "INSERT_DECOD_SOGGETTO";
/*     */   
/*     */   public static final String GET_BY_SOGGETTO_ID = "GET_BY_SOGGETTO_ID";
/*     */   public static final String GET_SOGG_ID_BY_SOGG_XP = "GET_SOGG_ID_BY_SOGG_XP";
/*     */   public static final String GET_BY_SOGG_INDIR = "GET_BY_SOGG_INDIR";
/*     */   public static final String GET_BY_CONTR_INDIR = "GET_BY_CONTR_INDIR";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  39 */   private String action = "ACTION";
/*  40 */   private Log log = LogFactory.getLog(UtilitaMigrazioneXP.class);
/*     */ 
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
/*  54 */     MapContainer resultMap = new MapContainer();
/*  55 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  57 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  58 */     Object oDecodSoggetto = map.getAppl("SOGGETTO_XP_ARCO");
/*  59 */     Object oIndirizzo = map.getAppl("INDIRIZZO");
/*  60 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  61 */     Object oSoggettoIndir = map.getAppl("SOGGETTO_INDIRIZZO");
/*  62 */     Object oContrattoIndir = map.getAppl("CONTRATTO_INDIRIZZO");
/*     */ 
/*     */     
/*  65 */     Boolean allowMultipleRows = null;
/*  66 */     String moduleName = null;
/*  67 */     FinSoggetto soggetto = null;
/*  68 */     FinIndirizzo indirizzo = null;
/*  69 */     FinDecodSoggettoXP decodSoggetto = null;
/*  70 */     FlxSoggettoIndirXP soggettoIndir = null;
/*     */     
/*  72 */     if (oAllowMultipleRows == null) {
/*  73 */       oAllowMultipleRows = new Boolean(false);
/*  74 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  75 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  76 */       if (this.log.isErrorEnabled()) {
/*  77 */         this.log.error(str);
/*     */       }
/*  79 */       throw new RasServiceException(str);
/*     */     } 
/*  81 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
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
/*     */     
/* 123 */     if (this.action.equals("GET_BY_SOGG_INDIR")) {
/*     */       
/* 125 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*     */       
/* 127 */       Integer indirizzoId = indirizzo.getIndirizzoId();
/*     */ 
/*     */       
/* 130 */       paramMap.putAppl("INDIRIZZO_ID", indirizzoId);
/* 131 */       moduleName = "getBySoggettoIndir";
/*     */       try {
/* 133 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 134 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 135 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 136 */         rse.setStackTrace(e.getStackTrace());
/* 137 */         throw rse;
/*     */       } 
/* 139 */       return processResultMap(resultMap, false);
/*     */     } 
/* 141 */     if (this.action.equals("GET_BY_CONTR_INDIR")) {
/*     */       
/* 143 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class);
/*     */       
/* 145 */       Integer indirizzoId = indirizzo.getIndirizzoId();
/*     */ 
/*     */       
/* 148 */       paramMap.putAppl("INDIRIZZO_ID", indirizzoId);
/* 149 */       moduleName = "getByContrattoIndir";
/*     */       try {
/* 151 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 152 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 153 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 154 */         rse.setStackTrace(e.getStackTrace());
/* 155 */         throw rse;
/*     */       } 
/* 157 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */     
/* 160 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 161 */     if (this.log.isErrorEnabled()) {
/* 162 */       this.log.error(errorMessage);
/*     */     }
/* 164 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 172 */     if (this.action.equals("GET_BY_SOGG_INDIR")) {
/* 173 */       this.GENERIC_MODULE_RESULT = "SOGGETTO_INDIRIZZO";
/*     */     }
/* 175 */     else if (this.action.equals("GET_BY_CONTR_INDIR")) {
/*     */       
/* 177 */       this.GENERIC_MODULE_RESULT = "CONTRATTO_INDIRIZZO";
/*     */     } 
/*     */     
/* 180 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/* 181 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */ 
/*     */ 
/*     */     
/* 185 */     if (result.size() == 0) {
/* 186 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 188 */     else if (result.size() == 1) {
/* 189 */       resultMap.putAppl("RESULT", "FOUND");
/*     */       
/* 191 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result.get(0));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 197 */     else if (allowMultipleRow) {
/* 198 */       resultMap.putAppl("RESULT", "FOUND");
/* 199 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result);
/*     */     } else {
/*     */       
/* 202 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 204 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 212 */     if (obj == null) {
/*     */       
/* 214 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/*     */       
/* 216 */       if (this.log.isErrorEnabled())
/*     */       {
/* 218 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 222 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 226 */     if (!obj.getClass().equals(c)) {
/*     */       
/* 228 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/*     */       
/* 230 */       if (this.log.isErrorEnabled())
/*     */       {
/* 232 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 236 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 240 */     return obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 247 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 251 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\UtilitaMigrazioneXP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */