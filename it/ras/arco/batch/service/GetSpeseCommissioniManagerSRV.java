/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.bean.DecRegoleInboundMovimento;
/*     */ import it.ras.arco.bean.FlxBpuCo0;
/*     */ import it.ras.arco.bean.FlxBpuRfs;
/*     */ import it.ras.flag.config.CodesTableManager;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GetSpeseCommissioniManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String COMMISSIONI = "PROG_INVIO";
/*     */   public static final String RIT_FISC = "MOVIMENTO";
/*     */   public static final String DEC_REGOLE = "DEC_REGOLE";
/*     */   public static final String DATA = "DATA";
/*     */   public static final String NPRGFLU = "NPRGFLU";
/*     */   public static final String CMOV = "CMOV";
/*     */   public static final String COMM_RIT_FISC = "COMM_RIT_FISC";
/*     */   public static final String GENERIC_MODULE_RESULT = "COMM_RIT_FISC";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*  45 */   public final String GET_COMM_BY_PROG_MOV = "GetCommissioniByProgInvioMovimento";
/*  46 */   public final String GET_RIT_FISC_BY_PROG_MOV = "GetRitFiscaliByProgInvioMovimento";
/*     */ 
/*     */   
/*  49 */   private Log log = LogFactory.getLog(GetSpeseCommissioniManagerSRV.class);
/*     */ 
/*     */   
/*     */   private String action;
/*     */ 
/*     */   
/*     */   private CodesTableManager codesTableManager;
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  64 */     MapContainer resultMap = new MapContainer();
/*  65 */     MapContainer paramMap = new MapContainer();
/*  66 */     String moduleName = null;
/*     */     
/*  68 */     Object oFlxBpuCo0 = map.getAppl("PROG_INVIO");
/*  69 */     Object oFlxBpuRfs = map.getAppl("MOVIMENTO");
/*  70 */     Object oDecRegole = map.getAppl("DEC_REGOLE");
/*  71 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  73 */     DecRegoleInboundMovimento decRegole = (DecRegoleInboundMovimento)getBean(oDecRegole, DecRegoleInboundMovimento.class);
/*     */     
/*  75 */     FlxBpuCo0 comm = null;
/*  76 */     FlxBpuRfs ritFiscali = null;
/*     */     
/*  78 */     Boolean allowMultipleRows = null;
/*     */     
/*  80 */     if (oAllowMultipleRows == null) {
/*  81 */       oAllowMultipleRows = new Boolean(false);
/*  82 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  83 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  84 */       if (this.log.isErrorEnabled()) {
/*  85 */         this.log.error(str);
/*     */       }
/*  87 */       throw new RasServiceException(str);
/*     */     } 
/*     */     
/*  90 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  92 */     if (this.action.equals("GetCommissioniByProgInvioMovimento")) {
/*     */       
/*  94 */       comm = (FlxBpuCo0)getBean(oFlxBpuCo0, FlxBpuCo0.class);
/*     */       
/*  96 */       MapContainer paramSpeseComm = new MapContainer();
/*  97 */       Integer nprg = comm.getNprgflu();
/*  98 */       String cmov = comm.getCmov();
/*  99 */       paramSpeseComm.putAppl("NPRGFLU", nprg);
/* 100 */       paramSpeseComm.putAppl("CMOV", cmov);
/*     */ 
/*     */ 
/*     */       
/* 104 */       moduleName = this.action;
/* 105 */       resultMap = getModuleManager().execModule(moduleName, paramSpeseComm);
/* 106 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */       
/* 108 */       return resultMap;
/*     */     } 
/* 110 */     if (this.action.equals("GetRitFiscaliByProgInvioMovimento")) {
/*     */       
/* 112 */       ritFiscali = (FlxBpuRfs)getBean(oFlxBpuRfs, FlxBpuRfs.class);
/*     */       
/* 114 */       MapContainer paramRitFisc = new MapContainer();
/* 115 */       Integer nprg = ritFiscali.getNprgflu();
/* 116 */       String cmov = ritFiscali.getCmov();
/* 117 */       paramRitFisc.putAppl("NPRGFLU", nprg);
/* 118 */       paramRitFisc.putAppl("CMOV", cmov);
/*     */ 
/*     */ 
/*     */       
/* 122 */       moduleName = this.action;
/* 123 */       resultMap = getModuleManager().execModule(moduleName, paramRitFisc);
/* 124 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */       
/* 126 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 130 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 131 */     if (this.log.isErrorEnabled()) {
/* 132 */       this.log.error(errorMessage);
/*     */     }
/* 134 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 140 */     ArrayList result = (ArrayList)resultMap.getAppl("COMM_RIT_FISC");
/* 141 */     resultMap.removeAppl("COMM_RIT_FISC");
/*     */     
/* 143 */     if (result.size() == 0) {
/* 144 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     } else {
/*     */       
/* 147 */       resultMap.putAppl("RESULT", "FOUND");
/* 148 */       resultMap.putAppl("COMM_RIT_FISC", result);
/*     */     } 
/*     */     
/* 151 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 156 */     if (obj == null) {
/* 157 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 158 */       if (this.log.isErrorEnabled()) {
/* 159 */         this.log.error(errorMessage);
/*     */       }
/* 161 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 164 */     return obj;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 168 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 172 */     this.action = action;
/*     */   }
/*     */   
/*     */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 176 */     this.codesTableManager = codesTableManager;
/*     */   }
/*     */   public CodesTableManager getCodesTableManager() {
/* 179 */     return this.codesTableManager;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\GetSpeseCommissioniManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */