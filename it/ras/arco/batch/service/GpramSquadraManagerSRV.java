/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxGpramSquadra;
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
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
/*     */ 
/*     */ public class GpramSquadraManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  36 */   private String GENERIC_MODULE_RESULT = null;
/*  37 */   private String RESULT_OUTPUT = null;
/*  38 */   private String NOME_BATCH = null;
/*     */   
/*  40 */   private String action = "ACTION";
/*     */   
/*  42 */   private FlxGpramSquadra flxSquadraObj = null;
/*  43 */   private FinSoggetto soggettoObjPrin = null;
/*  44 */   private FinContratto contrattoObj = null;
/*  45 */   private FinCointestazione cointestazioneOBJ = null;
/*  46 */   private String contratto = null;
/*  47 */   private String resultMsg = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  57 */     MapContainer resultMap = new MapContainer();
/*  58 */     MapContainer paramSec = new MapContainer();
/*  59 */     MapContainer MD_Input_MAP = new MapContainer();
/*  60 */     MapContainer MD_Result_MAP = new MapContainer();
/*  61 */     String moduleName = null;
/*     */     
/*  63 */     Log logger = LogFactory.getLog(getClass());
/*  64 */     if (map == null) {
/*  65 */       resultMap.putAppl("RESULT_MESSAGE", "NULL_PARAM");
/*     */       
/*  67 */       return resultMap;
/*     */     } 
/*  69 */     if (this.action.equals("GET")) {
/*     */ 
/*     */       
/*  72 */       this.flxSquadraObj = (FlxGpramSquadra)map.getAppl("SQUADRAOBJ");
/*  73 */       this.soggettoObjPrin = (FinSoggetto)map.getAppl("SOGGETOBJ");
/*  74 */       this.contrattoObj = (FinContratto)map.getAppl("CONTRATTOOBJ");
/*  75 */       this.cointestazioneOBJ = (FinCointestazione)map.getAppl("COINTOBJ");
/*     */       
/*  77 */       this.contratto = this.contrattoObj.getNumContratto();
/*     */ 
/*     */ 
/*     */       
/*  81 */       MD_Input_MAP.putAppl("CONTRATTO", this.contratto);
/*  82 */       MD_Input_MAP.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       
/*  84 */       moduleName = "CheckGetSquadraGpramMD";
/*     */       try {
/*  86 */         MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/*  87 */       } catch (Exception e) {
/*  88 */         System.out.println(e.getMessage());
/*  89 */         resultMap.putAppl("RESULT", "ERROR");
/*  90 */         resultMap.putAppl("RESULT_MESSAGE", moduleName + " ERROR");
/*  91 */         return resultMap;
/*     */       } 
/*     */ 
/*     */       
/*  95 */       this.GENERIC_MODULE_RESULT = "SQUADRAROW";
/*  96 */       this.RESULT_OUTPUT = "SQUADRAROW";
/*  97 */       MapContainer flxGpramSquadraMap = new MapContainer();
/*  98 */       flxGpramSquadraMap = processResultMap(MD_Result_MAP, true);
/*  99 */       String MD_resultMsg = (String)flxGpramSquadraMap.getAppl("RESULT");
/*     */ 
/*     */ 
/*     */       
/* 103 */       if (MD_resultMsg.equals("FOUND")) {
/*     */         
/* 105 */         ArrayList flxGpramSqua = (ArrayList)flxGpramSquadraMap.getAppl(this.RESULT_OUTPUT);
/* 106 */         this.flxSquadraObj = flxGpramSqua.get(0);
/*     */ 
/*     */         
/* 109 */         resultMap.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       } 
/*     */       
/* 112 */       resultMap.putAppl("RESULT", MD_resultMsg);
/* 113 */       return resultMap;
/*     */     } 
/* 115 */     if (this.action.equals("INSERT")) {
/*     */ 
/*     */       
/* 118 */       this.NOME_BATCH = (String)map.getAppl("NOME_BATCH");
/* 119 */       this.flxSquadraObj = (FlxGpramSquadra)map.getAppl("SQUADRAOBJ");
/* 120 */       this.soggettoObjPrin = (FinSoggetto)map.getAppl("SOGGETOBJ");
/* 121 */       this.contrattoObj = (FinContratto)map.getAppl("CONTRATTOOBJ");
/* 122 */       this.cointestazioneOBJ = (FinCointestazione)map.getAppl("COINTOBJ");
/*     */       
/* 124 */       this.contratto = this.contrattoObj.getNumContratto();
/*     */       
/* 126 */       this.flxSquadraObj.setSoggetto(this.soggettoObjPrin);
/* 127 */       this.flxSquadraObj.setCointestazione(this.cointestazioneOBJ);
/* 128 */       this.flxSquadraObj.setNumContratto(this.contratto);
/*     */       
/* 130 */       this.flxSquadraObj.setDataInserimento(new Date());
/* 131 */       ArchUtils.setStdFields(this.flxSquadraObj, "I", this.NOME_BATCH);
/*     */       
/* 133 */       paramSec.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       
/* 135 */       resultMap = getModuleManager().execModule("InsFlxSquadraMD", paramSec);
/*     */       
/* 137 */       this.resultMsg = "INSERTED";
/* 138 */       resultMap = new MapContainer();
/* 139 */       resultMap.putAppl("RESULT", this.resultMsg);
/*     */       
/* 141 */       return resultMap;
/*     */     } 
/* 143 */     if (this.action.equals("UPDATE")) {
/*     */ 
/*     */ 
/*     */       
/* 147 */       this.flxSquadraObj = (FlxGpramSquadra)map.getAppl("SQUADRAROW");
/*     */       
/* 149 */       this.NOME_BATCH = (String)map.getAppl("NOME_BATCH");
/* 150 */       ArchUtils.setStdFields(this.flxSquadraObj, "U", this.NOME_BATCH);
/*     */       
/* 152 */       paramSec.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       
/* 154 */       resultMap = getModuleManager().execModule("UpdFlxSquadraMD", paramSec);
/*     */       
/* 156 */       this.resultMsg = "UPDATED";
/* 157 */       resultMap = new MapContainer();
/* 158 */       resultMap.putAppl("RESULT", this.resultMsg);
/*     */       
/* 160 */       return resultMap;
/*     */     } 
/* 162 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 169 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 171 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 173 */     if (result.size() == 0) {
/* 174 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 176 */     else if (result.size() == 1) {
/* 177 */       resultMap.putAppl("RESULT", "FOUND");
/* 178 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     }
/* 180 */     else if (allowMultipleRow) {
/* 181 */       resultMap.putAppl("RESULT", "FOUND");
/* 182 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     } else {
/*     */       
/* 185 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 187 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 193 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 197 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\GpramSquadraManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */