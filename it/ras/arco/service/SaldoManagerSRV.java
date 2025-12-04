/*    */ package it.ras.arco.service;
/*    */ 
/*    */ import it.ras.arco.bean.FinSaldoPeriodico;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import org.apache.commons.logging.Log;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SaldoManagerSRV
/*    */   extends AbstractRasService
/*    */ {
/* 18 */   private Log log = LogFactory.getLog(RuoloManagerSRV.class);
/* 19 */   private String action = null;
/*    */   
/*    */   public static final String SALDO_PERIODICO = "SALDO_PERIODICO";
/*    */   
/*    */   public static final String ACTION_INSERT_SALDO_MEDIO = "ACTION_INSERT_SALDO_MEDIO";
/*    */   
/*    */   public static final String INSERT_SALDO_MEDIO = "inserimentoSaldoMedioMD";
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 29 */     MapContainer resultMap = new MapContainer();
/* 30 */     FinSaldoPeriodico saldo = null;
/* 31 */     Object oSaldo = map.getAppl("SALDO_PERIODICO");
/*    */     
/* 33 */     if (this.action.equals("ACTION_INSERT_SALDO_MEDIO")) {
/*    */       
/* 35 */       saldo = (FinSaldoPeriodico)getBean(oSaldo, FinSaldoPeriodico.class);
/* 36 */       resultMap.putAppl("SALDO_PERIODICO", saldo);
/* 37 */       getModuleManager().execModule("inserimentoSaldoMedioMD", resultMap);
/*    */       
/* 39 */       return processResultMap(resultMap, false);
/*    */     } 
/*    */     
/* 42 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 43 */     if (this.log.isErrorEnabled()) {
/* 44 */       this.log.error(errorMessage);
/*    */     }
/* 46 */     throw new RasServiceException(errorMessage);
/*    */   }
/*    */ 
/*    */   
/*    */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 51 */     if (this.action.equals("ACTION_INSERT_SALDO_MEDIO")) {
/* 52 */       String result = (String)resultMap.getAppl("INSERTED");
/* 53 */       resultMap.putAppl("INSERTED", result);
/* 54 */       return resultMap;
/*    */     } 
/* 56 */     return resultMap;
/*    */   }
/*    */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 59 */     if (obj == null) {
/* 60 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 61 */       if (this.log.isErrorEnabled()) {
/* 62 */         this.log.error(errorMessage);
/*    */       }
/* 64 */       throw new RasServiceException(errorMessage);
/*    */     } 
/* 66 */     return obj;
/*    */   }
/*    */   
/*    */   public String getAction() {
/* 70 */     return this.action;
/*    */   }
/*    */   
/*    */   public void setAction(String action) {
/* 74 */     this.action = action;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\SaldoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */