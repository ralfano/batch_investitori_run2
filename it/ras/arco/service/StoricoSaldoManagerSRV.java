/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinStoricoSaldo;
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
/*     */ public class StoricoSaldoManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   private String action;
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GENERIC_MODULE_RESULT = "STORICO";
/*     */   public static final String STORICO = "STORICO";
/*     */   public static final String NUM_RAPPORTO = "NUM_RAPPORTO";
/*     */   public static final String GET_SALDO_STORICO_BY_NUM_CONTRATTO = "GetSaldoStoricoByNumContratto";
/*     */   public static final String INSERT_SALDO_STORICO = "InsertSaldoStorico";
/*  37 */   private Log log = LogFactory.getLog(ContrattoManagerSRV.class);
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String UPDATE_SALDO_STORICO = "UpdateSaldoStorico";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  51 */     MapContainer resultMap = new MapContainer();
/*  52 */     MapContainer paramMap = new MapContainer();
/*  53 */     String moduleName = null;
/*     */     
/*  55 */     FinStoricoSaldo storico = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     Object oStorico = map.getAppl("STORICO");
/*     */     
/*  64 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */ 
/*     */     
/*  68 */     Boolean allowMultipleRows = null;
/*     */     
/*  70 */     if (oAllowMultipleRows == null) {
/*  71 */       oAllowMultipleRows = new Boolean(false);
/*  72 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  73 */       String errorMessage = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*     */       
/*  75 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/*  78 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  80 */     if (this.action.equals("GetSaldoStoricoByNumContratto")) {
/*     */       
/*  82 */       storico = (FinStoricoSaldo)getBean(oStorico, FinStoricoSaldo.class);
/*  83 */       String numRapporto = storico.getNumContratto();
/*  84 */       paramMap.putAppl("NUM_RAPPORTO", numRapporto);
/*  85 */       moduleName = this.action;
/*  86 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/*  87 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     }
/*  89 */     else if (this.action.equals("UpdateSaldoStorico")) {
/*     */       
/*  91 */       storico = (FinStoricoSaldo)getBean(oStorico, FinStoricoSaldo.class);
/*     */       
/*  93 */       MapContainer param = new MapContainer();
/*     */       
/*  95 */       param.putAppl("STORICO", storico);
/*  96 */       getModuleManager().execModule("UpdateStoricoSaldoMD", param);
/*  97 */       resultMap.putAppl("RESULT", "UPDATED");
/*     */     
/*     */     }
/* 100 */     else if (this.action.equals("InsertSaldoStorico")) {
/*     */       
/* 102 */       storico = (FinStoricoSaldo)getBean(oStorico, FinStoricoSaldo.class);
/*     */       
/* 104 */       MapContainer param = new MapContainer();
/*     */       
/* 106 */       param.putAppl("STORICO", storico);
/* 107 */       getModuleManager().execModule("InsertStoricoSaldoMD", param);
/* 108 */       resultMap.putAppl("RESULT", "INSERTED");
/*     */     }
/*     */     else {
/*     */       
/* 112 */       String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*     */       
/* 114 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 116 */     return resultMap;
/*     */   }
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 119 */     ArrayList result = (ArrayList)resultMap.getAppl("STORICO");
/* 120 */     resultMap.removeAppl("STORICO");
/*     */     
/* 122 */     if (result.size() == 0) {
/* 123 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 125 */     else if (allowMultipleRow) {
/* 126 */       resultMap.putAppl("RESULT", "FOUND");
/* 127 */       resultMap.putAppl("STORICO", result);
/*     */     }
/* 129 */     else if (result.size() == 1) {
/* 130 */       resultMap.putAppl("RESULT", "FOUND");
/* 131 */       resultMap.putAppl("STORICO", result.get(0));
/*     */     } else {
/*     */       
/* 134 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 136 */     return resultMap;
/*     */   }
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 140 */     if (obj == null) {
/* 141 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 142 */       if (this.log.isErrorEnabled()) {
/* 143 */         this.log.error(errorMessage);
/*     */       }
/* 145 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 148 */     return obj;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 153 */     this.action = action;
/*     */   }
/*     */   public String getAction() {
/* 156 */     return this.action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\StoricoSaldoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */