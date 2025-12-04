/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinDocumento;
/*     */ import it.ras.arco.bean.FinNazioniUic;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
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
/*     */ public class DocumentoManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  23 */   private Log log = LogFactory.getLog(DocumentoManagerSRV.class);
/*  24 */   private String action = null;
/*     */ 
/*     */   
/*     */   private boolean onLine;
/*     */   
/*     */   public static final String DOCUMENTO = "DOCUMENTO";
/*     */   
/*     */   public static final String SOGGETTO = "SOGGETTO";
/*     */   
/*     */   public static final String DATA_CORRENTE = "DATA_CORRENTE";
/*     */   
/*     */   public static final String NAZIONALITA = "NAZIONALITA";
/*     */   
/*     */   public static final String NATION_ERROR = "NATION_ERROR";
/*     */   
/*     */   public static final String INSERT_DOCUMENTO = "INSERT_DOCUMENTO";
/*     */   
/*     */   public static final String UPDATE_DOCUMENTO = "UpdateDocumentoMD";
/*     */   
/*     */   public static final String GET_DOCUMENTO_MD = "getDocumentoMD";
/*     */   
/*     */   public static final String GET_NAZIONALITA_BY_UIC_MD = "GetNazionalitaByUicMD";
/*     */   
/*     */   public static final String GET_NAZIONALITA_BY_ISO_MD = "GetNazionalitaByIsoMD";
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  51 */     MapContainer resultMap = new MapContainer();
/*  52 */     Object oDocumento = map.getAppl("DOCUMENTO");
/*  53 */     Object oSoggetto = map.getAppl("SOGGETTO");
/*     */ 
/*     */     
/*  56 */     if (this.action.equals("INSERT_DOCUMENTO")) {
/*     */       
/*  58 */       resultMap = insertDocumento(oDocumento, oSoggetto);
/*  59 */       return processResultMap(resultMap, false);
/*     */     } 
/*  61 */     String errorMessage = "Azione passata al servizio " + getClass() + " è invalida o mancante. Action = " + this.action;
/*  62 */     if (this.log.isErrorEnabled()) {
/*  63 */       this.log.error(errorMessage);
/*     */     }
/*  65 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */   
/*     */   private MapContainer insertDocumento(Object oDocumento, Object oSoggetto) throws RasServiceException {
/*  70 */     MapContainer paramMap = new MapContainer();
/*  71 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  73 */     FinDocumento documento = (FinDocumento)getBean(oDocumento, FinDocumento.class);
/*  74 */     FinSoggetto soggetto = (FinSoggetto)getBean(oSoggetto, FinSoggetto.class);
/*     */     
/*  76 */     boolean dominato = false;
/*  77 */     boolean inserisci = true;
/*  78 */     boolean storicizza = false;
/*     */     
/*  80 */     String nazionalita = getNazionalita(documento.getNazioneRilascio());
/*  81 */     if (nazionalita == null) {
/*  82 */       if (this.log.isErrorEnabled()) {
/*  83 */         this.log.error("Documento non inserito --- Nazionalita errata");
/*     */       }
/*  85 */       resultMap.putAppl("RESULT", "NATION_ERROR");
/*     */       
/*  87 */       if (this.onLine) {
/*  88 */         RasValidationSignal error = new RasValidationSignal("errors.doc.wrong.nat");
/*  89 */         RasServiceException rse = new RasServiceException();
/*     */         
/*  91 */         rse.addError(error);
/*     */         
/*  93 */         throw rse;
/*     */       } 
/*  95 */       return resultMap;
/*     */     } 
/*  97 */     documento.setNazioneRilascio(nazionalita);
/*     */     
/*  99 */     documento.setDescEnteRilascio(documento.getAutoritaRilasc());
/* 100 */     String autoritaRilascio = documento.getAutoritaRilasc();
/* 101 */     if (documento.getAutoritaRilasc() == null) {
/* 102 */       documento.setAutoritaRilasc("ALTRO");
/* 103 */     } else if (documento.getAutoritaRilasc() != null && autoritaRilascio.length() >= 3 && autoritaRilascio.substring(0, 3).equals("COM")) {
/* 104 */       documento.setAutoritaRilasc("COM");
/* 105 */     } else if ((autoritaRilascio.length() >= 4 && autoritaRilascio.substring(0, 4).equals("PRE ")) || (autoritaRilascio.length() >= 5 && autoritaRilascio.substring(0, 5).equals("MOTOR")) || (autoritaRilascio.length() >= 4 && autoritaRilascio.substring(0, 4).equals("PREF")) || (autoritaRilascio.length() >= 4 && autoritaRilascio.substring(0, 4).equals("PRE.")) || (autoritaRilascio.length() >= 4 && autoritaRilascio.substring(0, 4).equals("MTCT")) || (autoritaRilascio.length() >= 4 && autoritaRilascio.substring(0, 4).equals("MCTC")) || (autoritaRilascio.length() >= 8 && autoritaRilascio.substring(0, 8).equals("M.T.C.T.")) || (autoritaRilascio.length() >= 8 && autoritaRilascio.substring(0, 8).equals("M.C.T.C.")) || (autoritaRilascio.length() >= 3 && autoritaRilascio.substring(0, 3).equals("MTC")) || (autoritaRilascio.length() >= 4 && autoritaRilascio.substring(0, 4).equals("PRFE"))) {
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
/* 116 */       documento.setAutoritaRilasc("PRE");
/* 117 */     } else if (autoritaRilascio.length() >= 4 && autoritaRilascio.substring(0, 4).equals("CONS")) {
/* 118 */       documento.setAutoritaRilasc("CON");
/* 119 */     } else if (autoritaRilascio.length() >= 3 && autoritaRilascio.substring(0, 3).equals("QUE")) {
/* 120 */       documento.setAutoritaRilasc("QUE");
/*     */     } else {
/* 122 */       documento.setAutoritaRilasc("ALTRO");
/*     */     } 
/*     */     
/* 125 */     if (soggetto.getIsDominant() != null && !soggetto.getIsDominant().booleanValue()) {
/*     */       
/* 127 */       documento.setDominato("Y");
/* 128 */       dominato = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     if (soggetto.getSoggettoId() != null) {
/*     */ 
/*     */       
/* 137 */       Integer soggID = soggetto.getSoggettoId();
/* 138 */       paramMap.putAppl("SOGGETTO", soggID);
/*     */       
/* 140 */       paramMap.putAppl("DATA_CORRENTE", new Date());
/*     */       
/*     */       try {
/* 143 */         resultMap = getModuleManager().execModule("getDocumentoMD", paramMap);
/* 144 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 145 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 146 */         rse.setStackTrace(e.getStackTrace());
/* 147 */         throw rse;
/*     */       } 
/* 149 */       ArrayList res = (ArrayList)resultMap.getAppl("DOCUMENTO");
/*     */       
/* 151 */       if (res.size() != 0) {
/* 152 */         FinDocumento docDaStoricizzare = res.get(0);
/* 153 */         if (!dominato) {
/*     */           
/* 155 */           docDaStoricizzare.setFineVal(new Date());
/* 156 */           docDaStoricizzare.setStato("C");
/* 157 */           docDaStoricizzare.setDominato("Y");
/* 158 */           inserisci = true;
/* 159 */           storicizza = true;
/*     */         }
/* 161 */         else if (docDaStoricizzare.getTipoDoc() != null && documento.getTipoDoc() != null && documento.getTipoDoc().equals(docDaStoricizzare.getTipoDoc())) {
/*     */ 
/*     */           
/* 164 */           inserisci = false;
/*     */         }
/*     */         else {
/*     */           
/* 168 */           documento.setFineVal(new Date());
/* 169 */           documento.setStato("C");
/* 170 */           inserisci = true;
/*     */         } 
/*     */         
/* 173 */         if (storicizza) {
/* 174 */           paramMap.putAppl("DOCUMENTO", docDaStoricizzare);
/*     */           try {
/* 176 */             getModuleManager().execModule("UpdateDocumentoMD", paramMap);
/* 177 */           } catch (HibernateObjectRetrievalFailureException e) {
/* 178 */             RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 179 */             rse.setStackTrace(e.getStackTrace());
/* 180 */             throw rse;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 187 */     if (inserisci) {
/* 188 */       paramMap.putAppl("DOCUMENTO", documento);
/* 189 */       getModuleManager().execModule("InserimentoDocumento", paramMap);
/* 190 */       resultMap.putAppl("RESULT", "INSERTED");
/*     */     } 
/* 192 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private String getNazionalita(String nazionalita) throws RasServiceException {
/* 198 */     MapContainer paramMap = new MapContainer();
/* 199 */     MapContainer resultMap = null;
/* 200 */     FinNazioniUic nazione = null;
/*     */     
/* 202 */     paramMap.putAppl("NAZIONALITA", nazionalita);
/*     */     
/*     */     try {
/* 205 */       resultMap = getModuleManager().execModule("GetNazionalitaByUicMD", paramMap);
/* 206 */     } catch (HibernateObjectRetrievalFailureException e) {
/* 207 */       RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 208 */       rse.setStackTrace(e.getStackTrace());
/* 209 */       throw rse;
/*     */     } 
/*     */     
/* 212 */     ArrayList result = (ArrayList)resultMap.getAppl("NAZIONALITA");
/* 213 */     if (result.size() == 0) {
/*     */       try {
/* 215 */         resultMap = getModuleManager().execModule("GetNazionalitaByIsoMD", paramMap);
/* 216 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 217 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 218 */         rse.setStackTrace(e.getStackTrace());
/* 219 */         throw rse;
/*     */       } 
/*     */       
/* 222 */       result = (ArrayList)resultMap.getAppl("NAZIONALITA");
/* 223 */       if (result.size() == 0) {
/* 224 */         return null;
/*     */       }
/* 226 */       nazione = result.get(0);
/* 227 */       return nazione.getCodiceUic();
/*     */     } 
/*     */     
/* 230 */     nazione = result.get(0);
/* 231 */     return nazione.getCodiceUic();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 237 */     if (!resultMap.containsKeyAppl("RESULT")) {
/* 238 */       resultMap.putAppl("RESULT", "INSERTED");
/*     */     }
/* 240 */     return resultMap;
/*     */   }
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 244 */     if (obj == null) {
/* 245 */       String errorMessage = "Oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 246 */       if (this.log.isErrorEnabled()) {
/* 247 */         this.log.error(errorMessage);
/*     */       }
/* 249 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 252 */     if (!obj.getClass().equals(c)) {
/* 253 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/* 254 */       if (this.log.isErrorEnabled()) {
/* 255 */         this.log.error(errorMessage);
/*     */       }
/* 257 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 259 */     return obj;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 265 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 269 */     this.action = action;
/*     */   }
/*     */   
/*     */   public boolean isOnLine() {
/* 273 */     return this.onLine;
/*     */   }
/*     */   
/*     */   public void setOnLine(boolean onLine) {
/* 277 */     this.onLine = onLine;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\DocumentoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */