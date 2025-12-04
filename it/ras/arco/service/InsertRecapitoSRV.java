/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinRecapito;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
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
/*     */ public class InsertRecapitoSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   public static final String RECAPITO = "RECAPITO";
/*     */   public static final String TIPO_RECAPITO = "TIPO_RECAPITO";
/*     */   public static final String EMAIL = "ema";
/*     */   public static final String CELLULARE = "cel";
/*     */   public static final String TELEFONO_RESIDENZA = "tl1";
/*     */   public static final String TELEFONO_RECAPITO = "tl2";
/*     */   public static final String FAX = "fax";
/*     */   public static final String DATA_CORRENTE = "DATA_CORRENTE";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GENERIC_MODULE_RESULT = "RECAPITO";
/*     */   public static final String ACTION_INSERT_EMAIL = "ACTION_INSERT_EMAIL";
/*     */   public static final String ACTION_INSERT_CELLULARE = "ACTION_INSERT_CELLULARE";
/*     */   public static final String ACTION_INSERT_TELEFONO_RECAPITO = "ACTION_INSERT_TELEFONO_RECAPITO";
/*     */   public static final String ACTION_INSERT_TELEFONO_RESIDENZA = "ACTION_INSERT_TELEFONO_RESIDENZA";
/*     */   public static final String ACTION_INSERT_FAX = "ACTION_INSERT_FAX";
/*     */   public static final String GET_RECAPITO_MD = "GetRecapitoMD";
/*     */   public static final String STORICIZZA_RECAPITO_MD = "StoricizzaRecapitoMD";
/*     */   public static final String INSERT_RECAPITO_MD = "InsertRecapitoMD";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  47 */   private Log log = LogFactory.getLog(InsertRecapitoSRV.class);
/*  48 */   private String action = null;
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
/*  61 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  63 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  64 */     Object oRecapito = map.getAppl("RECAPITO");
/*  65 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  67 */     Boolean allowMultipleRows = null;
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
/*  82 */     if (this.action.equals("ACTION_INSERT_EMAIL")) {
/*  83 */       resultMap = insertRecapito("ema", oSoggetto, oRecapito);
/*  84 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/*  88 */     if (this.action.equals("ACTION_INSERT_CELLULARE")) {
/*  89 */       resultMap = insertRecapito("cel", oSoggetto, oRecapito);
/*  90 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/*  94 */     if (this.action.equals("ACTION_INSERT_TELEFONO_RECAPITO")) {
/*  95 */       resultMap = insertRecapito("tl2", oSoggetto, oRecapito);
/*  96 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/* 100 */     if (this.action.equals("ACTION_INSERT_TELEFONO_RESIDENZA")) {
/* 101 */       resultMap = insertRecapito("tl1", oSoggetto, oRecapito);
/* 102 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/* 106 */     if (this.action.equals("ACTION_INSERT_FAX")) {
/* 107 */       resultMap = insertRecapito("fax", oSoggetto, oRecapito);
/* 108 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/* 112 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 113 */     if (this.log.isErrorEnabled()) {
/* 114 */       this.log.error(errorMessage);
/*     */     }
/* 116 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer insertRecapito(String tipoRecapito, Object oSoggetto, Object oRecapito) throws RasServiceException {
/* 123 */     MapContainer paramMap = new MapContainer();
/* 124 */     MapContainer resultMap = new MapContainer();
/*     */     
/* 126 */     FinSoggetto soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/* 127 */     FinRecapito recapito = (FinRecapito)getBean(oRecapito, FinRecapito.class.getName());
/*     */     
/* 129 */     if (soggetto.getSoggettoId() != null) {
/*     */       
/* 131 */       Integer soggettoId = soggetto.getSoggettoId();
/* 132 */       paramMap.putAppl("SOGGETTO", soggettoId);
/* 133 */       paramMap.putAppl("TIPO_RECAPITO", tipoRecapito);
/* 134 */       paramMap.putAppl("DATA_CORRENTE", new Date());
/*     */       
/*     */       try {
/* 137 */         resultMap = getModuleManager().execModule("GetRecapitoMD", paramMap);
/* 138 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 139 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 140 */         rse.setStackTrace(e.getStackTrace());
/* 141 */         throw rse;
/*     */       } 
/*     */       
/* 144 */       ArrayList res = (ArrayList)resultMap.getAppl("RECAPITO");
/*     */ 
/*     */       
/* 147 */       if (res.size() == 1) {
/*     */         
/* 149 */         FinRecapito rec = res.get(0);
/* 150 */         rec.setFineVali(new Date());
/* 151 */         paramMap.putAppl("RECAPITO", rec);
/*     */         try {
/* 153 */           getModuleManager().execModule("StoricizzaRecapitoMD", paramMap);
/* 154 */         } catch (HibernateObjectRetrievalFailureException e) {
/* 155 */           RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 156 */           rse.setStackTrace(e.getStackTrace());
/* 157 */           throw rse;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 163 */     recapito.setTipoRecapito(tipoRecapito);
/* 164 */     paramMap.putAppl("RECAPITO", recapito);
/*     */     try {
/* 166 */       getModuleManager().execModule("InsertRecapitoMD", paramMap);
/* 167 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 168 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 169 */       rse.setStackTrace(e.getStackTrace());
/* 170 */       throw rse;
/*     */     } 
/*     */     
/* 173 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 180 */     resultMap.putAppl("RESULT", "INSERTED");
/* 181 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 187 */     Object retObject = null;
/*     */     try {
/* 189 */       Class c = Class.forName(className);
/* 190 */       if (!c.isInstance(obj)) {
/* 191 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 192 */         if (this.log.isErrorEnabled()) {
/* 193 */           this.log.error(errorMessage);
/*     */         }
/* 195 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 197 */       retObject = obj;
/* 198 */     } catch (ClassNotFoundException e) {
/* 199 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 200 */       if (this.log.isErrorEnabled()) {
/* 201 */         this.log.error(errorMessage);
/*     */       }
/* 203 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 205 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 209 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 213 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\InsertRecapitoSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */