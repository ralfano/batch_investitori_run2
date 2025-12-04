/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinDecodSoggettoXP;
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
/*     */ public class UtilitaMigrazioneSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String SOGGETTO_ID = "SOGGETTO_ID";
/*     */   public static final String SOGGETTO_XP = "SOGGETTO_XP";
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   public static final String INDIRIZZO = "INDIRIZZO";
/*     */   public static final String SOGGETTO_XP_ARCO = "SOGGETTO_XP_ARCO";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GENERIC_MODULE_RESULT = "SOGGETTO";
/*     */   public static final String INSERT_DECOD_SOGGETTO = "INSERT_DECOD_SOGGETTO";
/*     */   public static final String GET_BY_SOGGETTO_ID = "GET_BY_SOGGETTO_ID";
/*     */   public static final String GET_SOGG_ID_BY_SOGG_XP = "GET_SOGG_ID_BY_SOGG_XP";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  35 */   private String action = "ACTION";
/*  36 */   private Log log = LogFactory.getLog(UtilitaMigrazioneSRV.class);
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
/*  50 */     MapContainer resultMap = new MapContainer();
/*  51 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  53 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  54 */     Object oDecodSoggetto = map.getAppl("SOGGETTO_XP_ARCO");
/*  55 */     Object oIndirizzo = map.getAppl("INDIRIZZO");
/*  56 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */     
/*  59 */     Boolean allowMultipleRows = null;
/*  60 */     String moduleName = null;
/*  61 */     FinSoggetto soggetto = null;
/*  62 */     FinDecodSoggettoXP decodSoggetto = null;
/*     */     
/*  64 */     if (oAllowMultipleRows == null) {
/*  65 */       oAllowMultipleRows = new Boolean(false);
/*  66 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  67 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  68 */       if (this.log.isErrorEnabled()) {
/*  69 */         this.log.error(str);
/*     */       }
/*  71 */       throw new RasServiceException(str);
/*     */     } 
/*  73 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */     
/*  76 */     if (this.action.equals("GET_BY_SOGGETTO_ID")) {
/*  77 */       soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/*  78 */       Integer soggId = soggetto.getSoggettoId();
/*  79 */       paramMap.putAppl("SOGGETTO_ID", soggId);
/*  80 */       moduleName = "GetSoggettoID";
/*     */       try {
/*  82 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  83 */       } catch (HibernateObjectRetrievalFailureException e) {
/*  84 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*  85 */         rse.setStackTrace(e.getStackTrace());
/*  86 */         throw rse;
/*     */       } 
/*  88 */       return processResultMap(resultMap, false);
/*     */     } 
/*  90 */     if (this.action.equals("INSERT_DECOD_SOGGETTO")) {
/*     */       
/*  92 */       decodSoggetto = (FinDecodSoggettoXP)getBean(oDecodSoggetto, FinDecodSoggettoXP.class.getName());
/*  93 */       paramMap.putAppl("SOGGETTO_XP_ARCO", decodSoggetto);
/*  94 */       moduleName = "InsertDecodSoggetto";
/*  95 */       getModuleManager().execModule(moduleName, paramMap);
/*  96 */       resultMap.putAppl("RESULT", "INSERTED");
/*  97 */       return resultMap;
/*     */     } 
/*     */     
/* 100 */     if (this.action.equals("GET_SOGG_ID_BY_SOGG_XP")) {
/* 101 */       decodSoggetto = (FinDecodSoggettoXP)getBean(oDecodSoggetto, FinDecodSoggettoXP.class.getName());
/* 102 */       Integer soggXP = decodSoggetto.getSoggettoXpId();
/* 103 */       paramMap.putAppl("SOGGETTO_XP", soggXP);
/* 104 */       moduleName = "GetSoggIDBySoggXP";
/*     */       try {
/* 106 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 107 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 108 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 109 */         rse.setStackTrace(e.getStackTrace());
/* 110 */         throw rse;
/*     */       } 
/* 112 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/* 116 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 117 */     if (this.log.isErrorEnabled()) {
/* 118 */       this.log.error(errorMessage);
/*     */     }
/* 120 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 128 */     ArrayList result = (ArrayList)resultMap.getAppl("SOGGETTO");
/*     */     
/* 130 */     resultMap.removeAppl("SOGGETTO");
/*     */     
/* 132 */     if (result.size() == 0) {
/* 133 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 135 */     else if (result.size() == 1) {
/* 136 */       resultMap.putAppl("RESULT", "FOUND");
/* 137 */       resultMap.putAppl("SOGGETTO", result.get(0));
/*     */     }
/* 139 */     else if (allowMultipleRow) {
/* 140 */       resultMap.putAppl("RESULT", "FOUND");
/* 141 */       resultMap.putAppl("SOGGETTO", result);
/*     */     } else {
/*     */       
/* 144 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 146 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 151 */     Object retObject = null;
/*     */     try {
/* 153 */       Class c = Class.forName(className);
/* 154 */       if (!c.isInstance(obj)) {
/* 155 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 156 */         if (this.log.isErrorEnabled()) {
/* 157 */           this.log.error(errorMessage);
/*     */         }
/* 159 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 161 */       retObject = obj;
/* 162 */     } catch (ClassNotFoundException e) {
/* 163 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 164 */       if (this.log.isErrorEnabled()) {
/* 165 */         this.log.error(errorMessage);
/*     */       }
/* 167 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 169 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 173 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 177 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\UtilitaMigrazioneSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */