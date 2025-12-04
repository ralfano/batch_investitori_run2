/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxRasBankGpSquadra;
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
/*     */ public class RasBankGpSquadraManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  36 */   private String GENERIC_MODULE_RESULT = null;
/*  37 */   private String RESULT_OUTPUT = null;
/*  38 */   private String NOME_BATCH = null;
/*     */   
/*  40 */   private String action = "ACTION";
/*     */   
/*  42 */   private FlxRasBankGpSquadra flxSquadraObj = null;
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
/*  71 */       this.flxSquadraObj = new FlxRasBankGpSquadra();
/*  72 */       this.soggettoObjPrin = new FinSoggetto();
/*  73 */       this.contrattoObj = new FinContratto();
/*  74 */       this.cointestazioneOBJ = new FinCointestazione();
/*     */       
/*  76 */       this.flxSquadraObj = (FlxRasBankGpSquadra)map.getAppl("SQUADRAOBJ");
/*  77 */       this.soggettoObjPrin = (FinSoggetto)map.getAppl("SOGGETOBJ");
/*  78 */       this.contrattoObj = (FinContratto)map.getAppl("CONTRATTOOBJ");
/*  79 */       this.cointestazioneOBJ = (FinCointestazione)map.getAppl("COINTOBJ");
/*     */       
/*  81 */       this.contratto = this.contrattoObj.getNumContratto();
/*     */ 
/*     */ 
/*     */       
/*  85 */       MD_Input_MAP.putAppl("CONTRATTO", this.contratto);
/*  86 */       MD_Input_MAP.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       
/*  88 */       moduleName = "CheckGetSquadraMD";
/*     */       try {
/*  90 */         MD_Result_MAP = getModuleManager().execModule(moduleName, MD_Input_MAP);
/*  91 */       } catch (Exception e) {
/*  92 */         System.out.println(e.getMessage());
/*  93 */         resultMap.putAppl("RESULT", "ERROR");
/*  94 */         resultMap.putAppl("RESULT_MESSAGE", moduleName + " ERROR");
/*  95 */         return resultMap;
/*     */       } 
/*     */ 
/*     */       
/*  99 */       this.GENERIC_MODULE_RESULT = "SQUADRAROW";
/* 100 */       this.RESULT_OUTPUT = "SQUADRAROW";
/* 101 */       MapContainer flxGpramSquadraMap = new MapContainer();
/* 102 */       flxGpramSquadraMap = processResultMap(MD_Result_MAP, true);
/* 103 */       String MD_resultMsg = (String)flxGpramSquadraMap.getAppl("RESULT");
/*     */ 
/*     */ 
/*     */       
/* 107 */       if (MD_resultMsg.equals("FOUND")) {
/*     */         
/* 109 */         ArrayList flxGpramSqua = (ArrayList)flxGpramSquadraMap.getAppl(this.RESULT_OUTPUT);
/* 110 */         this.flxSquadraObj = flxGpramSqua.get(0);
/*     */ 
/*     */         
/* 113 */         resultMap.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       } 
/*     */       
/* 116 */       resultMap.putAppl("RESULT", MD_resultMsg);
/* 117 */       return resultMap;
/*     */     } 
/* 119 */     if (this.action.equals("INSERT")) {
/*     */       
/* 121 */       this.flxSquadraObj = new FlxRasBankGpSquadra();
/* 122 */       this.soggettoObjPrin = new FinSoggetto();
/* 123 */       this.contrattoObj = new FinContratto();
/* 124 */       this.cointestazioneOBJ = new FinCointestazione();
/* 125 */       this.NOME_BATCH = (String)map.getAppl("NOME_BATCH");
/* 126 */       this.flxSquadraObj = (FlxRasBankGpSquadra)map.getAppl("SQUADRAOBJ");
/* 127 */       this.soggettoObjPrin = (FinSoggetto)map.getAppl("SOGGETOBJ");
/* 128 */       this.contrattoObj = (FinContratto)map.getAppl("CONTRATTOOBJ");
/* 129 */       this.cointestazioneOBJ = (FinCointestazione)map.getAppl("COINTOBJ");
/*     */       
/* 131 */       this.contratto = this.contrattoObj.getNumContratto();
/*     */       
/* 133 */       this.flxSquadraObj.setSoggetto(this.soggettoObjPrin);
/* 134 */       this.flxSquadraObj.setCointestazione(this.cointestazioneOBJ);
/* 135 */       this.flxSquadraObj.setNumContratto(this.contratto);
/*     */       
/* 137 */       this.flxSquadraObj.setDataInserimento(new Date());
/* 138 */       ArchUtils.setStdFields(this.flxSquadraObj, "I", this.NOME_BATCH);
/*     */       
/* 140 */       paramSec.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       
/* 142 */       resultMap = getModuleManager().execModule("InsFlxSquadraMD", paramSec);
/*     */       
/* 144 */       this.resultMsg = "INSERTED";
/* 145 */       resultMap = new MapContainer();
/* 146 */       resultMap.putAppl("RESULT", this.resultMsg);
/*     */       
/* 148 */       return resultMap;
/*     */     } 
/* 150 */     if (this.action.equals("UPDATE")) {
/*     */ 
/*     */ 
/*     */       
/* 154 */       this.flxSquadraObj = (FlxRasBankGpSquadra)map.getAppl("SQUADRAROW");
/*     */       
/* 156 */       this.NOME_BATCH = (String)map.getAppl("NOME_BATCH");
/* 157 */       ArchUtils.setStdFields(this.flxSquadraObj, "U", this.NOME_BATCH);
/*     */       
/* 159 */       paramSec.putAppl("SQUADRAOBJ", this.flxSquadraObj);
/*     */       
/* 161 */       resultMap = getModuleManager().execModule("UpdFlxSquadraMD", paramSec);
/*     */       
/* 163 */       this.resultMsg = "UPDATED";
/* 164 */       resultMap = new MapContainer();
/* 165 */       resultMap.putAppl("RESULT", this.resultMsg);
/*     */       
/* 167 */       return resultMap;
/*     */     } 
/* 169 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 176 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 178 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 180 */     if (result.size() == 0) {
/* 181 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 183 */     else if (result.size() == 1) {
/* 184 */       resultMap.putAppl("RESULT", "FOUND");
/* 185 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     }
/* 187 */     else if (allowMultipleRow) {
/* 188 */       resultMap.putAppl("RESULT", "FOUND");
/* 189 */       resultMap.putAppl(this.RESULT_OUTPUT, result);
/*     */     } else {
/*     */       
/* 192 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 194 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 200 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 204 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\RasBankGpSquadraManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */