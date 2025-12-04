/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxBnlGesCertificati04;
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
/*     */ public class CertificatiBNLManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  27 */   private String action = "ACTION";
/*  28 */   private Log log = LogFactory.getLog(getClass());
/*     */ 
/*     */   
/*     */   public static final String NUM_CERTIFICATO = "NUM_CERTIFICATO";
/*     */ 
/*     */   
/*     */   public static final String NUM_ACCORDO = "NUM_ACCORDO";
/*     */ 
/*     */   
/*     */   public static final String CERTIFICATO = "CERTIFICATO";
/*     */ 
/*     */   
/*     */   private static final String GET_CERTIFICATO = "GET_CERTIFICATO";
/*     */ 
/*     */   
/*     */   private static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */ 
/*     */   
/*     */   private static final String GetCertificatoMD = "GetCertificatoMD";
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  51 */     MapContainer resultMap = null;
/*  52 */     MapContainer paramMap = new MapContainer();
/*  53 */     String genericModuleResult = null;
/*  54 */     String moduleName = null;
/*     */     
/*  56 */     Boolean allowMultipleRows = null;
/*     */     
/*  58 */     Object oCertificato = map.getAppl("CERTIFICATO");
/*     */     
/*  60 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  62 */     FlxBnlGesCertificati04 certificato = null;
/*     */ 
/*     */ 
/*     */     
/*  66 */     if (oAllowMultipleRows == null) {
/*  67 */       oAllowMultipleRows = new Boolean(false);
/*  68 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  69 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  70 */       if (this.log.isErrorEnabled()) {
/*  71 */         this.log.error(str);
/*     */       }
/*  73 */       throw new RasServiceException(str);
/*     */     } 
/*  75 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */     
/*  78 */     if (this.action.equals("GET_CERTIFICATO")) {
/*     */       
/*  80 */       certificato = (FlxBnlGesCertificati04)getBean(oCertificato, FlxBnlGesCertificati04.class);
/*     */       
/*  82 */       moduleName = "GetCertificatoMD";
/*  83 */       genericModuleResult = "CERTIFICATO";
/*     */       
/*  85 */       paramMap.putAppl("NUM_ACCORDO", certificato.getNumAccordo04());
/*  86 */       paramMap.putAppl("NUM_CERTIFICATO", certificato.getNumCertifSgr04());
/*  87 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  88 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), genericModuleResult);
/*  89 */       return resultMap;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  94 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*  95 */     if (this.log.isErrorEnabled()) {
/*  96 */       this.log.error(errorMessage);
/*     */     }
/*  98 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow, String genericModuleResult) {
/* 108 */     ArrayList result = (ArrayList)resultMap.getAppl(genericModuleResult);
/*     */ 
/*     */     
/* 111 */     if (result.size() == 0) {
/* 112 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 114 */     else if (allowMultipleRow) {
/* 115 */       resultMap.putAppl("RESULT", "FOUND");
/* 116 */       resultMap.putAppl(genericModuleResult, result);
/*     */     }
/* 118 */     else if (result.size() == 1) {
/* 119 */       resultMap.putAppl("RESULT", "FOUND");
/* 120 */       resultMap.putAppl(genericModuleResult, result.get(0));
/*     */     }
/*     */     else {
/*     */       
/* 124 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 126 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 134 */     if (obj == null) {
/*     */       
/* 136 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/*     */       
/* 138 */       if (this.log.isErrorEnabled())
/*     */       {
/* 140 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 144 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 148 */     if (!obj.getClass().equals(c)) {
/*     */       
/* 150 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/*     */       
/* 152 */       if (this.log.isErrorEnabled())
/*     */       {
/* 154 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 158 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 162 */     return obj;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 167 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 171 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\CertificatiBNLManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */