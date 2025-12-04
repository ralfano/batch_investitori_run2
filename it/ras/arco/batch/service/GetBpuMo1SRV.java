/*     */ package it.ras.arco.batch.service;
/*     */ 
/*     */ import it.ras.arco.batch.bean.FlxBpuMo1;
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
/*     */ public class GetBpuMo1SRV
/*     */   extends AbstractRasService
/*     */ {
/*  30 */   private String action = "ACTION";
/*  31 */   private Log log = LogFactory.getLog(GetBpuMo1SRV.class);
/*     */ 
/*     */   
/*     */   public static final String BPU_MO1 = "BPU_MO1";
/*     */ 
/*     */   
/*     */   public static final String GENERIC_MODULE_RESULT = "BPU_MO1";
/*     */   
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   
/*     */   public static final String GET_BPU_MO1 = "GET_BPU_MO1";
/*     */   
/*     */   public static final String NOME_MODULO = "GetBpuMo1ModuleMD";
/*     */   
/*     */   public static final String ID_TEMPORANEO_MOVIMENTO = "ID_TEMPORANEO_MOVIMENTO";
/*     */   
/*     */   public static final String NPRGFLU = "NPRGFLU";
/*     */   
/*     */   public static final String NOME_SERVIZIO = "GetBpuMo1NameSRV";
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  56 */     MapContainer resultMap = new MapContainer();
/*  57 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  59 */     String moduleName = null;
/*  60 */     Boolean allowMultipleRows = null;
/*     */     
/*  62 */     Object oBpuMo1 = map.getAppl("BPU_MO1");
/*  63 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  65 */     FlxBpuMo1 bpuMo1 = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     if (oAllowMultipleRows == null) {
/*  71 */       oAllowMultipleRows = new Boolean(false);
/*  72 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  73 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  74 */       if (this.log.isErrorEnabled()) {
/*  75 */         this.log.error(str);
/*     */       }
/*  77 */       throw new RasServiceException(str);
/*     */     } 
/*  79 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     if (this.action.equals("GET_BPU_MO1")) {
/*     */       
/*  86 */       bpuMo1 = (FlxBpuMo1)getBean(oBpuMo1, FlxBpuMo1.class.getName());
/*     */       
/*  88 */       moduleName = "GetBpuMo1ModuleMD";
/*  89 */       Integer idTempMov = bpuMo1.getIdTemporaneoMovimento();
/*  90 */       Integer nPrgflu = bpuMo1.getNprgflu();
/*  91 */       paramMap.putAppl("ID_TEMPORANEO_MOVIMENTO", idTempMov);
/*  92 */       paramMap.putAppl("NPRGFLU", nPrgflu);
/*  93 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  94 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/*  95 */       return resultMap;
/*     */     } 
/*     */     
/*  98 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*  99 */     if (this.log.isErrorEnabled()) {
/* 100 */       this.log.error(errorMessage);
/*     */     }
/* 102 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 112 */     ArrayList result = (ArrayList)resultMap.getAppl("BPU_MO1");
/* 113 */     resultMap.removeAppl("BPU_MO1");
/*     */     
/* 115 */     if (result.size() == 0) {
/* 116 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 122 */     else if (allowMultipleRow) {
/* 123 */       resultMap.putAppl("RESULT", "FOUND");
/* 124 */       resultMap.putAppl("BPU_MO1", result);
/*     */     } else {
/*     */       
/* 127 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 129 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 135 */     Object retObject = null;
/*     */     try {
/* 137 */       Class c = Class.forName(className);
/* 138 */       if (!c.isInstance(obj)) {
/* 139 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 140 */         if (this.log.isErrorEnabled()) {
/* 141 */           this.log.error(errorMessage);
/*     */         }
/* 143 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 145 */       retObject = obj;
/* 146 */     } catch (ClassNotFoundException e) {
/* 147 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 148 */       if (this.log.isErrorEnabled()) {
/* 149 */         this.log.error(errorMessage);
/*     */       }
/* 151 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 153 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 157 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 161 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\GetBpuMo1SRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */