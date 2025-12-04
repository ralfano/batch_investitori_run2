/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinContrattoIndir;
/*     */ import it.ras.arco.bean.FinIndirizzo;
/*     */ import it.ras.arco.bean.FinIndirizzoRam;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.arco.bean.FinSoggettoIndir;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
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
/*     */ public class InsertIndirizzoSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String INDIRIZZO_RESIDENZA = "INDIRIZZO_RESIDENZA";
/*     */   public static final String INDIRIZZO_DOMICILIO = "INDIRIZZO_DOMICILIO";
/*     */   public static final String INDIRIZZO_CORRISPONDENZA_ATTUALE = "INDIRIZZO_CORRISPONDENZA_ATTUALE";
/*     */   public static final String INDIRIZZO_CORRISPONDENZA_ATTUALE_RAM = "INDIRIZZO_CORRISPONDENZA_ATTUALE_RAM";
/*     */   public static final String CONTRATTO = "CONTRATTO";
/*     */   public static final String INDIRIZZO = "INDIRIZZO";
/*     */   public static final String INDIRIZZO_RAM = "INDIRIZZO_RAM";
/*     */   public static final String CONTRATTO_INDIRIZZO = "CONTRATTO_INDIRIZZO";
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   public static final String SOGGETTO_INDIRIZZO = "SOGGETTO_INDIRIZZO";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GENERIC_MODULE_RESULT = "INDIRIZZO";
/*     */   public static final String ACTION_INSERT_RESIDENZA = "ACTION_INSERT_RESIDENZA";
/*     */   public static final String ACTION_INSERT_DOMICILIO = "ACTION_INSERT_DOMICILIO";
/*     */   public static final String ACTION_INSERT_CORRISP = "ACTION_INSERT_CORRISP";
/*     */   public static final String ACTION_INSERT_CORRISP_RAM = "ACTION_INSERT_CORRISP_RAM";
/*     */   public static final String GET_INDIRIZZO_SOGG_MD = "GetIndirizzoSoggMD";
/*     */   public static final String GET_INDIRIZZO_CONTR_MD = "GetIndirizzoContrMD";
/*     */   public static final String GET_CORRISPONDENZA_ATTUALE_MD = "GetCorrispondenzaAttualeMD";
/*     */   public static final String GET_CORRISPONDENZA_RAM_ATTUALE_MD = "GetCorrispondenzaRamAttualeMD";
/*     */   public static final String STORICIZZA_INDIRIZZO_MD = "StoricizzaIndirizzoMD";
/*     */   public static final String STORICIZZA_CORRISPONDENZA_ATTUALE_MD = "StoricizzaCorrispondenzaAttualeMD";
/*     */   public static final String STORICIZZA_CORRISPONDENZA_RAM_ATTUALE_MD = "StoricizzaCorrispondenzaRamAttualeMD";
/*     */   public static final String INSERT_INDIRIZZO_MD = "InsertIndirizzoMD";
/*     */   public static final String INSERT_CORRISPONDENZA_MD = "InsertCorrispondenzaMD";
/*     */   public static final String INSERT_CORRISPONDENZA_RAM_MD = "InsertCorrispondenzaRamMD";
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*  56 */   private Log log = LogFactory.getLog(InsertIndirizzoSRV.class);
/*  57 */   private String action = null;
/*     */ 
/*     */   
/*     */   public static final String TIPO_INDIRIZZO = "TIPO_INDIRIZZO";
/*     */ 
/*     */   
/*     */   public static final String DATA_CORRENTE = "DATA_CORRENTE";
/*     */   
/*     */   public static final String RESIDENZA = "RES";
/*     */   
/*     */   public static final String DOMICILIO = "DOM";
/*     */   
/*     */   public static final String CORRISPONDENZA = "COR";
/*     */   
/*     */   public static final String CORRISPONDENZA_RAM = "RAM";
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  78 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  80 */     Object oIndirizzo = map.getAppl("INDIRIZZO");
/*  81 */     Object oIndirizzoRam = map.getAppl("INDIRIZZO_RAM");
/*  82 */     Object oContratto = map.getAppl("CONTRATTO");
/*  83 */     Object oContrattoIndir = map.getAppl("CONTRATTO_INDIRIZZO");
/*  84 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*  85 */     Object oSoggettoIndir = map.getAppl("SOGGETTO_INDIRIZZO");
/*     */ 
/*     */ 
/*     */     
/*  89 */     if (this.action.equals("ACTION_INSERT_RESIDENZA")) {
/*     */       
/*  91 */       resultMap = insertIndirizzoSogg("RES", oSoggetto, oSoggettoIndir, oIndirizzo);
/*  92 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/*  96 */     if (this.action.equals("ACTION_INSERT_DOMICILIO")) {
/*     */       
/*  98 */       resultMap = insertIndirizzoSogg("DOM", oSoggetto, oSoggettoIndir, oIndirizzo);
/*  99 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/* 103 */     if (this.action.equals("ACTION_INSERT_CORRISP")) {
/*     */       
/* 105 */       resultMap = insertIndirizzoContr("COR", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam);
/* 106 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/* 110 */     if (this.action.equals("ACTION_INSERT_CORRISP_RAM")) {
/*     */       
/* 112 */       resultMap = insertIndirizzoContr("RAM", oContratto, oContrattoIndir, oIndirizzo, oIndirizzoRam);
/* 113 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */     
/* 117 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 118 */     if (this.log.isErrorEnabled()) {
/* 119 */       this.log.error(errorMessage);
/*     */     }
/* 121 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer insertIndirizzoSogg(String tipoIndirizzo, Object oSoggetto, Object oSoggettoIndir, Object oIndirizzo) throws RasServiceException {
/* 128 */     MapContainer paramMap = new MapContainer();
/* 129 */     MapContainer resultMap = new MapContainer();
/*     */     
/* 131 */     FinSoggetto soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class.getName());
/* 132 */     FinSoggettoIndir soggettoIndir = (FinSoggettoIndir)getBean(oSoggettoIndir, FinSoggettoIndir.class.getName());
/* 133 */     FinIndirizzo indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class.getName());
/*     */     
/* 135 */     if (soggetto.getSoggettoId() != null) {
/*     */       
/* 137 */       Integer soggettoId = soggetto.getSoggettoId();
/* 138 */       paramMap.putAppl("SOGGETTO", soggettoId);
/* 139 */       paramMap.putAppl("TIPO_INDIRIZZO", tipoIndirizzo);
/* 140 */       paramMap.putAppl("DATA_CORRENTE", new Date());
/*     */       
/* 142 */       FinSoggettoIndir soggInd = null;
/*     */       
/* 144 */       if (!soggetto.getIndirizzo().isEmpty()) {
/*     */         
/* 146 */         Iterator i = soggetto.getIndirizzo().iterator();
/* 147 */         while (i.hasNext()) {
/*     */           
/* 149 */           soggInd = i.next();
/* 150 */           if (soggInd.getTipoIndirizzo().equals(tipoIndirizzo)) {
/*     */             
/* 152 */             soggInd.setDataFine(new Date());
/* 153 */             paramMap.putAppl("INDIRIZZO", soggInd);
/*     */             try {
/* 155 */               getModuleManager().execModule("StoricizzaIndirizzoMD", paramMap);
/* 156 */             } catch (HibernateObjectRetrievalFailureException e) {
/* 157 */               RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 158 */               rse.setStackTrace(e.getStackTrace());
/* 159 */               throw rse;
/*     */             } 
/*     */ 
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 169 */     soggettoIndir.setTipoIndirizzo(tipoIndirizzo);
/* 170 */     paramMap.putAppl("INDIRIZZO", indirizzo);
/*     */     try {
/* 172 */       getModuleManager().execModule("InsertIndirizzoMD", paramMap);
/* 173 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 174 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 175 */       rse.setStackTrace(e.getStackTrace());
/* 176 */       throw rse;
/*     */     } 
/*     */     
/* 179 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer insertIndirizzoContr(String tipoIndirizzo, Object oContratto, Object oContrattoIndir, Object oIndirizzo, Object oIndirizzoRam) throws RasServiceException {
/* 185 */     MapContainer paramMap = new MapContainer();
/* 186 */     MapContainer resultMap = new MapContainer();
/* 187 */     FinIndirizzo indirizzo = null;
/* 188 */     FinIndirizzoRam indirizzoRam = null;
/*     */     
/* 190 */     FinContratto contratto = (FinContratto)getBean(oContratto, FinContratto.class.getName());
/* 191 */     FinContrattoIndir contrattoIndir = (FinContrattoIndir)getBean(oContrattoIndir, FinContrattoIndir.class.getName());
/* 192 */     if (this.action.equals("ACTION_INSERT_CORRISP")) {
/* 193 */       indirizzo = (FinIndirizzo)getBean(oIndirizzo, FinIndirizzo.class.getName());
/* 194 */     } else if (this.action.equals("ACTION_INSERT_CORRISP_RAM")) {
/* 195 */       indirizzoRam = (FinIndirizzoRam)getBean(oIndirizzoRam, FinIndirizzoRam.class.getName());
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     if (contratto.getContrattoId() != null) {
/* 202 */       Integer contrattoId = contratto.getContrattoId();
/* 203 */       paramMap.putAppl("CONTRATTO", contrattoId);
/* 204 */       paramMap.putAppl("TIPO_INDIRIZZO", tipoIndirizzo);
/* 205 */       paramMap.putAppl("DATA_CORRENTE", new Date());
/*     */       
/* 207 */       FinContrattoIndir contInd = null;
/*     */       
/* 209 */       if (!contratto.getIndirizzo().isEmpty()) {
/*     */         
/* 211 */         Iterator i = contratto.getIndirizzo().iterator();
/* 212 */         while (i.hasNext()) {
/*     */           
/* 214 */           contInd = i.next();
/* 215 */           if (contInd.getTipoIndirizzo().equals(tipoIndirizzo)) {
/*     */             
/* 217 */             contInd.setDataFine(new Date());
/* 218 */             paramMap.putAppl("INDIRIZZO", contInd);
/*     */             try {
/* 220 */               getModuleManager().execModule("StoricizzaIndirizzoMD", paramMap);
/* 221 */             } catch (HibernateObjectRetrievalFailureException e) {
/* 222 */               RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 223 */               rse.setStackTrace(e.getStackTrace());
/* 224 */               throw rse;
/*     */             } 
/*     */             
/*     */             break;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 233 */     contrattoIndir.setTipoIndirizzo("COR");
/* 234 */     if (this.action.equals("ACTION_INSERT_CORRISP")) {
/* 235 */       paramMap.putAppl("INDIRIZZO", indirizzo);
/* 236 */     } else if (this.action.equals("ACTION_INSERT_CORRISP_RAM")) {
/* 237 */       paramMap.putAppl("INDIRIZZO", indirizzoRam);
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 242 */       getModuleManager().execModule("InsertIndirizzoMD", paramMap);
/* 243 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 244 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 245 */       rse.setStackTrace(e.getStackTrace());
/* 246 */       throw rse;
/*     */     } 
/*     */     
/* 249 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 254 */     resultMap.putAppl("RESULT", "INSERTED");
/* 255 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 260 */     Object retObject = null;
/*     */     try {
/* 262 */       Class c = Class.forName(className);
/* 263 */       if (!c.isInstance(obj)) {
/* 264 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 265 */         if (this.log.isErrorEnabled()) {
/* 266 */           this.log.error(errorMessage);
/*     */         }
/* 268 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 270 */       retObject = obj;
/* 271 */     } catch (ClassNotFoundException e) {
/* 272 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 273 */       if (this.log.isErrorEnabled()) {
/* 274 */         this.log.error(errorMessage);
/*     */       }
/* 276 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 278 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 282 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 286 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\InsertIndirizzoSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */