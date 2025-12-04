/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxBnlGesPac02;
/*     */ import it.ras.arco.batch.bean.FlxBnlGesPart03;
/*     */ import it.ras.arco.batch.bean.FlxBnlGesRapColl05;
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
/*     */ 
/*     */ public class BnlGestioneContrattoSRV
/*     */   extends AbstractRasService
/*     */ {
/*  32 */   private String action = "ACTION";
/*  33 */   private Log log = LogFactory.getLog(GetBpuMo1SRV.class);
/*     */   
/*     */   public static final String PARTECIPANTI = "PARTECIPANTI";
/*     */   
/*     */   public static final String RESULT_PARTECIPANTI = "RESULT_PARTECIPANTI";
/*     */   
/*     */   public static final String RESULT_RAPP_COLL = "RESULT_RAPP_COLL";
/*     */   
/*     */   public static final String RESULT_PAC = "RESULT_PAC";
/*     */   
/*     */   public static final String NUM_CONTRATTO = "NUM_CONTRATTO";
/*     */   
/*     */   public static final String PAC = "PAC";
/*     */   
/*     */   public static final String RAP_COLL = "RAP_COLL";
/*     */   
/*     */   public static final String RAPP_COLLEGATI = "RAPP_COLLEGATI";
/*     */   
/*     */   public static final String GET_RAP_COLL_MD = "GET_RAP_COLL_MD";
/*     */   
/*     */   public static final String GET_PARTECIPANTI_MD = "GET_PARTECIPANTI_MD";
/*     */   
/*     */   public static final String GET_PAC_MD = "GET_PAC_MD";
/*     */   
/*     */   public static final String GET_PARTECIPANTI_SRV = "GET_PARTECIPANTI_SRV";
/*     */   
/*     */   public static final String GET_RAP_COLL_SRV = "GET_RAP_COLL_SRV";
/*     */   public static final String GET_RAP_COLL = "GET_RAP_COLL";
/*     */   public static final String GET_PAC_SRV = "GET_PAC_SRV";
/*     */   public static final String GET_PAC = "GET_PAC";
/*     */   public static final String GET_PARTECIPANTI = "GET_PARTECIPANTI";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  69 */     MapContainer resultMap = new MapContainer();
/*  70 */     MapContainer paramMap = new MapContainer();
/*  71 */     String genericModuleResult = null;
/*  72 */     String moduleName = null;
/*  73 */     Boolean allowMultipleRows = null;
/*     */     
/*  75 */     Object oPartecipanti = map.getAppl("PARTECIPANTI");
/*  76 */     Object oPac = map.getAppl("PAC");
/*  77 */     Object oRapColl = map.getAppl("RAP_COLL");
/*  78 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  80 */     FlxBnlGesPart03 partecipanti = null;
/*  81 */     FlxBnlGesPac02 pac = null;
/*  82 */     FlxBnlGesRapColl05 rapColl = null;
/*     */ 
/*     */     
/*  85 */     if (oAllowMultipleRows == null) {
/*  86 */       oAllowMultipleRows = new Boolean(false);
/*  87 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  88 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  89 */       if (this.log.isErrorEnabled()) {
/*  90 */         this.log.error(str);
/*     */       }
/*  92 */       throw new RasServiceException(str);
/*     */     } 
/*  94 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */     
/*  97 */     if (this.action.equals("GET_PAC")) {
/*     */       
/*  99 */       pac = (FlxBnlGesPac02)getBean(oPac, FlxBnlGesPac02.class);
/*     */       
/* 101 */       moduleName = "GET_PAC_MD";
/* 102 */       genericModuleResult = "RESULT_PAC";
/* 103 */       Integer numContratto = pac.getNumAccordo02();
/* 104 */       paramMap.putAppl("NUM_CONTRATTO", numContratto);
/* 105 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 106 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), genericModuleResult);
/* 107 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 111 */     if (this.action.equals("GET_RAP_COLL")) {
/*     */       
/* 113 */       rapColl = (FlxBnlGesRapColl05)getBean(oRapColl, FlxBnlGesRapColl05.class);
/*     */       
/* 115 */       moduleName = "GET_RAP_COLL_MD";
/* 116 */       genericModuleResult = "RESULT_RAPP_COLL";
/* 117 */       Integer numContratto = rapColl.getNumAccordo05();
/* 118 */       paramMap.putAppl("NUM_CONTRATTO", numContratto);
/* 119 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 120 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), genericModuleResult);
/* 121 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 125 */     if (this.action.equals("GET_PARTECIPANTI")) {
/*     */       
/* 127 */       partecipanti = (FlxBnlGesPart03)getBean(oPartecipanti, FlxBnlGesPart03.class);
/*     */       
/* 129 */       moduleName = "GET_PARTECIPANTI_MD";
/* 130 */       genericModuleResult = "RESULT_PARTECIPANTI";
/* 131 */       Integer numContratto = partecipanti.getNumAccordo03();
/* 132 */       paramMap.putAppl("NUM_CONTRATTO", numContratto);
/* 133 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 134 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue(), genericModuleResult);
/* 135 */       return resultMap;
/*     */     } 
/*     */     
/* 138 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 139 */     if (this.log.isErrorEnabled()) {
/* 140 */       this.log.error(errorMessage);
/*     */     }
/* 142 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow, String genericModuleResult) {
/* 152 */     ArrayList result = (ArrayList)resultMap.getAppl(genericModuleResult);
/*     */ 
/*     */     
/* 155 */     if (result.size() == 0) {
/* 156 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 158 */     else if (allowMultipleRow) {
/* 159 */       resultMap.putAppl("RESULT", "FOUND");
/* 160 */       resultMap.putAppl(genericModuleResult, result);
/*     */     }
/* 162 */     else if (result.size() == 1) {
/* 163 */       resultMap.putAppl("RESULT", "FOUND");
/* 164 */       resultMap.putAppl(genericModuleResult, result.get(0));
/*     */     }
/*     */     else {
/*     */       
/* 168 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 170 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 178 */     if (obj == null) {
/*     */       
/* 180 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/*     */       
/* 182 */       if (this.log.isErrorEnabled())
/*     */       {
/* 184 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 188 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 192 */     if (!obj.getClass().equals(c)) {
/*     */       
/* 194 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/*     */       
/* 196 */       if (this.log.isErrorEnabled())
/*     */       {
/* 198 */         this.log.error(errorMessage);
/*     */       }
/*     */ 
/*     */       
/* 202 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */ 
/*     */     
/* 206 */     return obj;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 211 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 215 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\BnlGestioneContrattoSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */