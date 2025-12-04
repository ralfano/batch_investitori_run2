/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinQuotazione;
/*     */ import it.ras.arco.bean.FinUltPrezzo;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
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
/*     */ public class QuotazioneManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  31 */   private static Log logger = LogFactory.getLog(QuotazioneManagerSRV.class);
/*  32 */   private String action = "ACTION";
/*  33 */   private String GENERIC_MODULE_RESULT = null;
/*  34 */   private String RESULT_OUTPUT = null;
/*  35 */   private String NOME_BATCH = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/*  40 */     return this.action;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/*  46 */     this.action = action;
/*     */   }
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
/*  60 */     if (this.action.equals("GET")) {
/*  61 */       logger.info("L'azione è " + this.action);
/*     */     }
/*  63 */     if (this.action.equals("INSERT")) {
/*  64 */       this.NOME_BATCH = (String)map.getAppl("NOME_BATCH");
/*  65 */       logger.info("L'azione è " + this.action);
/*     */     } 
/*  67 */     if (this.action.equals("UPDATE")) {
/*  68 */       logger.info("L'azione è " + this.action);
/*  69 */       this.NOME_BATCH = (String)map.getAppl("NOME_BATCH");
/*     */     } 
/*     */     
/*  72 */     MapContainer param = new MapContainer();
/*  73 */     MapContainer resultMap = new MapContainer();
/*  74 */     String resultMsg = null;
/*     */ 
/*     */     
/*  77 */     FinAttivitaFinanziaria attivitaFinanziariaObj = (FinAttivitaFinanziaria)map.getAppl("OBJ_FIN_ATT_FIN");
/*     */     
/*  79 */     FinQuotazione quotazioneObj = (FinQuotazione)map.getAppl("OBJ_QUOTAZIONE");
/*     */     
/*  81 */     FinQuotazione quotazioneRow = null;
/*     */     
/*  83 */     Double cambio = quotazioneObj.getCambio();
/*  84 */     Double valoreQuotaDivisa = quotazioneObj.getQuotDivisa();
/*  85 */     Date dataQuotazione = quotazioneObj.getDataQuotazione();
/*     */ 
/*     */     
/*  88 */     Double valoreQuotaEuro = new Double(valoreQuotaDivisa.doubleValue() * cambio.doubleValue());
/*     */ 
/*     */ 
/*     */     
/*  92 */     if (this.action.equals("GET")) {
/*     */ 
/*     */       
/*  95 */       this.RESULT_OUTPUT = "QUOTAZIONE";
/*  96 */       this.GENERIC_MODULE_RESULT = "QUOTAZIONE";
/*  97 */       param.putAppl("ATT_FIN_ID", attivitaFinanziariaObj.getAttivitaFinId());
/*     */       
/*  99 */       param.putAppl("DATA_QUO", dataQuotazione);
/*     */ 
/*     */       
/*     */       try {
/* 103 */         resultMap = getModuleManager().execModule("GetQuotazioneMD", param);
/*     */       }
/* 105 */       catch (HibernateObjectRetrievalFailureException e) {
/* 106 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 107 */         rse.setStackTrace(e.getStackTrace());
/* 108 */         throw rse;
/*     */       } 
/* 110 */       MapContainer QuotazioneMap = new MapContainer();
/* 111 */       QuotazioneMap = processResultMap(resultMap, false);
/*     */       
/* 113 */       resultMsg = (String)resultMap.getAppl("RESULT");
/*     */       
/* 115 */       if (resultMsg.equals("FOUND")) {
/*     */         
/* 117 */         List quotazioneList = (List)QuotazioneMap.getAppl(this.RESULT_OUTPUT);
/* 118 */         quotazioneRow = quotazioneList.get(0);
/* 119 */         resultMap.putAppl(this.RESULT_OUTPUT, quotazioneRow);
/*     */       } 
/* 121 */       resultMap.putAppl("RESULT", resultMsg);
/*     */     }
/* 123 */     else if (this.action.equals("UPDATE")) {
/* 124 */       quotazioneRow = (FinQuotazione)map.getAppl("OBJ_QUOTAZIONE");
/*     */       
/* 126 */       ArchUtils.setStdFields(quotazioneRow, "U", this.NOME_BATCH);
/* 127 */       ArchUtils.setStdFields(quotazioneRow, "userUltimaModifica", this.NOME_BATCH);
/* 128 */       param.putAppl("OBJ_FIN_QUOTAZIONE", quotazioneRow);
/*     */       
/* 130 */       getModuleManager().execModule("UpdQuotazioneMD", param);
/*     */       
/* 132 */       resultMsg = "UPDATED";
/* 133 */       resultMap.putAppl("RESULT", resultMsg);
/*     */ 
/*     */       
/* 136 */       FinUltPrezzo ultPrezzo = attivitaFinanziariaObj.getUltPrezzo();
/* 137 */       if (ultPrezzo == null)
/*     */       {
/* 139 */         ultPrezzo = new FinUltPrezzo();
/*     */       }
/*     */ 
/*     */       
/* 143 */       if (ultPrezzo.getDataUltPrezzo() == null || ultPrezzo.getUltPrezzo() == null || dataQuotazione.compareTo(ultPrezzo.getDataUltPrezzo()) == 1 || (dataQuotazione.compareTo(ultPrezzo.getDataUltPrezzo()) == 0 && valoreQuotaEuro.compareTo(ultPrezzo.getUltPrezzo()) != 0))
/*     */       {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 150 */         ultPrezzo.setDataUltPrezzo(dataQuotazione);
/* 151 */         ultPrezzo.setUltPrezzo(valoreQuotaEuro);
/* 152 */         ultPrezzo.setCambio(cambio);
/* 153 */         attivitaFinanziariaObj.setUltPrezzo(ultPrezzo);
/* 154 */         param.putAppl("ACTION", "UPDATE");
/* 155 */         param.putAppl("OBJ_FIN_ATT_FIN", attivitaFinanziariaObj);
/*     */         
/* 157 */         getModuleManager().execModule("UpdAttFinMD", param);
/* 158 */         resultMsg = "UPDATED";
/* 159 */         resultMap.putAppl("RESULT_MESSAGE", resultMsg);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 171 */     else if (this.action.equals("INSERT")) {
/*     */       
/* 173 */       quotazioneObj = (FinQuotazione)map.getAppl("OBJ_QUOTAZIONE");
/*     */ 
/*     */       
/* 176 */       ArchUtils.setStdFields(quotazioneObj, "I", this.NOME_BATCH);
/*     */       
/* 178 */       param.putAppl("OBJ_QUOTAZIONE", quotazioneObj);
/*     */       
/* 180 */       getModuleManager().execModule("InsQuotazioneMD", param);
/*     */       
/* 182 */       resultMsg = "INSERTED";
/* 183 */       resultMap.putAppl("RESULT", resultMsg);
/*     */ 
/*     */       
/* 186 */       FinUltPrezzo ultPrezzo = attivitaFinanziariaObj.getUltPrezzo();
/* 187 */       if (ultPrezzo == null)
/*     */       {
/* 189 */         ultPrezzo = new FinUltPrezzo();
/*     */       }
/*     */ 
/*     */       
/* 193 */       if (ultPrezzo.getDataUltPrezzo() == null || ultPrezzo.getUltPrezzo() == null || dataQuotazione.compareTo(ultPrezzo.getDataUltPrezzo()) == 1 || (dataQuotazione.compareTo(ultPrezzo.getDataUltPrezzo()) == 0 && valoreQuotaEuro.compareTo(ultPrezzo.getUltPrezzo()) != 0)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 200 */         ultPrezzo.setDataUltPrezzo(dataQuotazione);
/* 201 */         ultPrezzo.setUltPrezzo(valoreQuotaEuro);
/* 202 */         ultPrezzo.setCambio(cambio);
/* 203 */         attivitaFinanziariaObj.setUltPrezzo(ultPrezzo);
/* 204 */         param.putAppl("ACTION", "UPDATE");
/* 205 */         param.putAppl("OBJ_FIN_ATT_FIN", attivitaFinanziariaObj);
/*     */         
/* 207 */         getModuleManager().execModule("UpdAttFinMD", param);
/*     */ 
/*     */         
/* 210 */         resultMsg = "UPDATED";
/* 211 */         resultMap.putAppl("RESULT_MESSAGE", resultMsg);
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
/* 247 */     resultMap.putAppl("RESULT_MESSAGE", "OK");
/* 248 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 254 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 256 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 258 */     if (result.size() == 0) {
/* 259 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 261 */     else if (result.size() == 1) {
/* 262 */       resultMap.putAppl("RESULT", "FOUND");
/* 263 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     }
/* 265 */     else if (allowMultipleRow) {
/* 266 */       resultMap.putAppl("RESULT", "FOUND");
/* 267 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     } else {
/*     */       
/* 270 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 272 */     return resultMap;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\QuotazioneManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */