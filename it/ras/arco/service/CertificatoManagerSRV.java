/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinCertificato;
/*     */ import it.ras.arco.bean.FinEmittente;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CertificatoManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String CERTIFICATO = "CERTIFICATO";
/*     */   public static final String POSIZIONE = "POSIZIONE";
/*     */   public static final String NUM_CERTIFICATO = "NUM_CERTIFICATO";
/*     */   public static final String QUOTE = "QUOTE";
/*     */   public static final String DATA_COMP = "DATA_COMP";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String NUM_PRESTAMPATO = "NUM_PRESTAMPATO";
/*     */   public static final String GENERIC_MODULE_RESULT = "CERTIFICATO";
/*  38 */   private String action = "ACTION";
/*  39 */   private Log log = LogFactory.getLog(CertificatoManagerSRV.class);
/*     */ 
/*     */   
/*     */   public static final String GET_BY_NUM_PRESTAMPATO = "GET_BY_NUM_PRESTAMPATO";
/*     */ 
/*     */   
/*     */   public static final String GET_BY_NUM_CERT_QUOTE_DTCOMP = "GetCertificatoByNumCertQuoteDtaComp";
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  54 */     MapContainer resultMap = new MapContainer();
/*  55 */     MapContainer paramMap = new MapContainer();
/*  56 */     Object oCertificato = map.getAppl("CERTIFICATO");
/*  57 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  59 */     Boolean allowMultipleRows = null;
/*  60 */     FinCertificato certificato = null;
/*  61 */     String moduleName = null;
/*     */     
/*  63 */     if (oAllowMultipleRows == null) {
/*  64 */       oAllowMultipleRows = new Boolean(false);
/*  65 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  66 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio " + getClass() + " è di tipo errato.";
/*  67 */       if (this.log.isErrorEnabled()) {
/*  68 */         this.log.error(errorMessage);
/*     */       }
/*  70 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/*  73 */     certificato = (FinCertificato)getBean(oCertificato, FinEmittente.class);
/*  74 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */ 
/*     */     
/*  78 */     if (this.action.equals("GET_BY_NUM_PRESTAMPATO")) {
/*  79 */       Integer numPrestampato = certificato.getNumPrestampato();
/*  80 */       paramMap.putAppl("NUM_PRESTAMPATO", numPrestampato);
/*  81 */       resultMap = getModuleManager().execModule("GetCertificatoByNumPrestampatoMD", paramMap);
/*  82 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CERTIFICATO");
/*  83 */     } else if (this.action.equals("GetCertificatoByNumCertQuoteDtaComp")) {
/*     */       
/*  85 */       paramMap.putAppl("NUM_CERTIFICATO", certificato.getNumCertificato());
/*  86 */       paramMap.putAppl("QUOTE", certificato.getQuoteCertificate());
/*     */       
/*  88 */       moduleName = this.action;
/*  89 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  90 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), "CERTIFICATO");
/*  91 */     } else if (this.action.equals("INS")) {
/*  92 */       paramMap.putAppl("CERTIFICATO", certificato);
/*  93 */       moduleName = this.action;
/*  94 */       getModuleManager().execModule("InsCertificatoMD", paramMap);
/*  95 */       resultMap.putAppl("RESULT", "INSERTED");
/*  96 */     } else if (this.action.equals("UPD")) {
/*  97 */       paramMap.putAppl("CERTIFICATO", certificato);
/*  98 */       getModuleManager().execModule("UpdCertificatoMD", paramMap);
/*  99 */       resultMap.putAppl("RESULT", "UPDATED");
/*     */     } else {
/* 101 */       String errorMessage = "azione passata al servizio " + getClass() + " è invalida o mancante. Action = " + this.action + "";
/* 102 */       if (this.log.isErrorEnabled()) {
/* 103 */         this.log.error(errorMessage);
/*     */       }
/* 105 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 107 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow, String genericModuleResult) throws RasServiceException {
/* 118 */     ArrayList result = (ArrayList)resultMap.getAppl(genericModuleResult);
/* 119 */     resultMap.removeAppl(genericModuleResult);
/*     */     
/* 121 */     if (result.size() == 0) {
/* 122 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/* 123 */     } else if (allowMultipleRow) {
/* 124 */       resultMap.putAppl("RESULT", "FOUND");
/* 125 */       resultMap.putAppl(genericModuleResult, result);
/* 126 */     } else if (result.size() == 1) {
/* 127 */       resultMap.putAppl("RESULT", "FOUND");
/* 128 */       resultMap.putAppl(genericModuleResult, result.get(0));
/*     */     } else {
/* 130 */       String tipoCercato = genericModuleResult.toLowerCase();
/* 131 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 133 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 138 */     if (obj == null) {
/* 139 */       String errorMessage = "Oggetto ricevuto dal servizio nullo. Tipo atteso: " + c.getName();
/* 140 */       if (this.log.isErrorEnabled()) {
/* 141 */         this.log.error(errorMessage);
/*     */       }
/* 143 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 146 */     return obj;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 151 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 155 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\CertificatoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */