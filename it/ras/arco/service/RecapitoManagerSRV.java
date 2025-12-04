/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinRecapito;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Calendar;
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
/*     */ public class RecapitoManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   public static final String RECAPITO = "RECAPITO";
/*     */   public static final String TIPO_RECAPITO = "TIPO_RECAPITO";
/*     */   public static final String EMAIL = "EML";
/*     */   public static final String CELLULARE = "CEL";
/*     */   public static final String TELEFONO_RESIDENZA = "TL1";
/*     */   public static final String TELEFONO_RECAPITO = "TL2";
/*     */   public static final String FAX = "FAX";
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
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  61 */   private Log log = LogFactory.getLog(RecapitoManagerSRV.class);
/*  62 */   private String action = null;
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
/*  75 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  77 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  78 */     Object oRecapito = map.getAppl("RECAPITO");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     if (this.action.equals("ACTION_INSERT_EMAIL")) {
/*  85 */       resultMap = insertRecapito("EML", oSoggetto, oRecapito);
/*  86 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     if (this.action.equals("ACTION_INSERT_CELLULARE")) {
/*  93 */       resultMap = insertRecapito("CEL", oSoggetto, oRecapito);
/*  94 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 100 */     if (this.action.equals("ACTION_INSERT_TELEFONO_RECAPITO")) {
/* 101 */       resultMap = insertRecapito("TL2", oSoggetto, oRecapito);
/* 102 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     if (this.action.equals("ACTION_INSERT_TELEFONO_RESIDENZA")) {
/* 109 */       resultMap = insertRecapito("TL1", oSoggetto, oRecapito);
/* 110 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     if (this.action.equals("ACTION_INSERT_FAX")) {
/* 117 */       resultMap = insertRecapito("FAX", oSoggetto, oRecapito);
/* 118 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */     
/* 121 */     if (this.action.equals("UPDATE")) {
/* 122 */       FinRecapito recapito = (FinRecapito)getBean(oRecapito, FinRecapito.class.getName());
/*     */       
/* 124 */       MapContainer paramMap = new MapContainer();
/*     */       
/* 126 */       paramMap.putAppl("RECAPITO", recapito);
/*     */       try {
/* 128 */         getModuleManager().execModule("StoricizzaRecapitoMD", paramMap);
/*     */       }
/* 130 */       catch (HibernateObjectRetrievalFailureException e) {
/* 131 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 132 */         rse.setStackTrace(e.getStackTrace());
/* 133 */         throw rse;
/*     */       } 
/* 135 */       resultMap.putAppl("RESULT", "UPDATED");
/* 136 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 140 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 141 */     if (this.log.isErrorEnabled()) {
/* 142 */       this.log.error(errorMessage);
/*     */     }
/* 144 */     throw new RasServiceException(errorMessage);
/*     */   }
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
/*     */   private MapContainer insertRecapito(String tipoRecapito, Object oSoggetto, Object oRecapito) throws RasServiceException {
/* 160 */     MapContainer paramMap = new MapContainer();
/* 161 */     MapContainer resultMap = new MapContainer();
/*     */     
/* 163 */     FinSoggetto soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/* 164 */     FinRecapito recapito = (FinRecapito)getBean(oRecapito, FinRecapito.class.getName());
/* 165 */     boolean esisteRecapito = false;
/* 166 */     boolean dominato = false;
/*     */ 
/*     */     
/* 169 */     if (soggetto.getIsDominant() != null && !soggetto.getIsDominant().booleanValue()) {
/* 170 */       recapito.setDominato("Y");
/* 171 */       dominato = true;
/*     */     } 
/*     */     
/* 174 */     if (soggetto.getSoggettoId() != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 179 */       Integer soggettoId = soggetto.getSoggettoId();
/* 180 */       paramMap.putAppl("SOGGETTO", soggettoId);
/* 181 */       paramMap.putAppl("TIPO_RECAPITO", tipoRecapito);
/* 182 */       paramMap.putAppl("DATA_CORRENTE", new Date());
/*     */       
/*     */       try {
/* 185 */         resultMap = getModuleManager().execModule("GetRecapitoMD", paramMap);
/* 186 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 187 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 188 */         rse.setStackTrace(e.getStackTrace());
/* 189 */         throw rse;
/*     */       } 
/*     */       
/* 192 */       ArrayList res = (ArrayList)resultMap.getAppl("RECAPITO");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 197 */       if (res.size() == 1) {
/*     */         
/* 199 */         FinRecapito rec = res.get(0);
/* 200 */         esisteRecapito = true;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 210 */         if (!dominato) {
/*     */           
/* 212 */           rec.setFineVali(new Date());
/* 213 */           rec.setDominato("Y");
/* 214 */           paramMap.putAppl("RECAPITO", rec);
/*     */           try {
/* 216 */             getModuleManager().execModule("StoricizzaRecapitoMD", paramMap);
/* 217 */           } catch (HibernateObjectRetrievalFailureException e) {
/* 218 */             RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 219 */             rse.setStackTrace(e.getStackTrace());
/* 220 */             throw rse;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 233 */     if (dominato && esisteRecapito) {
/* 234 */       recapito.setFineVali(new Date());
/*     */     } else {
/* 236 */       Calendar data = Calendar.getInstance();
/* 237 */       data.set(9999, 11, 31);
/* 238 */       recapito.setFineVali(data.getTime());
/*     */     } 
/* 240 */     recapito.setTipoRecapito(tipoRecapito);
/* 241 */     paramMap.putAppl("RECAPITO", recapito);
/*     */     try {
/* 243 */       getModuleManager().execModule("InsertRecapitoMD", paramMap);
/* 244 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 245 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 246 */       rse.setStackTrace(e.getStackTrace());
/* 247 */       throw rse;
/*     */     } 
/*     */ 
/*     */     
/* 251 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 258 */     resultMap.putAppl("RESULT", "INSERTED");
/* 259 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 265 */     Object retObject = null;
/*     */     try {
/* 267 */       Class c = Class.forName(className);
/* 268 */       if (!c.isInstance(obj)) {
/* 269 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 270 */         if (this.log.isErrorEnabled()) {
/* 271 */           this.log.error(errorMessage);
/*     */         }
/* 273 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 275 */       retObject = obj;
/* 276 */     } catch (ClassNotFoundException e) {
/* 277 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 278 */       if (this.log.isErrorEnabled()) {
/* 279 */         this.log.error(errorMessage);
/*     */       }
/* 281 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 283 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 287 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 291 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\RecapitoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */