/*    */ package it.ras.arco.module;
/*    */ 
/*    */ import it.ras.arco.bean.FinMovimento;
/*    */ import it.ras.flag.ArchUtils;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.module.AbstractRasDbModule;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import org.apache.commons.logging.Log;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsUpdMovimentoMD
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */   
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/* 29 */     String moduleName = "InsUpdMovimentoMD";
/* 30 */     String tableName = "FIN_MOVIMENTO";
/*    */     
/* 32 */     Log logger = LogFactory.getLog(getClass());
/* 33 */     logger.info("Ingresso modulo " + moduleName);
/*    */     
/* 35 */     String action = (String)inputMap.getAppl("ACTION");
/* 36 */     MapContainer resultMap = new MapContainer();
/*    */     
/* 38 */     FinMovimento Row = (FinMovimento)inputMap.getAppl("ROW_" + tableName);
/*    */     
/* 40 */     if (Row == null) {
/*    */       
/* 42 */       resultMap.putAppl("RESULT", "NULL_OBJECT_ERROR");
/*    */     }
/* 44 */     else if (action.equals("INSERT")) {
/*    */       
/* 46 */       ArchUtils.setStdFields(Row, "I", "Inserimento " + tableName);
/* 47 */       getDao().insertSingleEntity(Row);
/* 48 */       resultMap.putAppl("RESULT", "INSERTED");
/*    */     }
/* 50 */     else if (action.equals("UPDATE")) {
/*    */       
/* 52 */       ArchUtils.setStdFields(Row, "U", "Update " + tableName);
/* 53 */       getDao().updateSingleEntity(Row);
/* 54 */       resultMap.putAppl("RESULT", "UPDATED");
/*    */     }
/*    */     else {
/*    */       
/* 58 */       resultMap.putAppl("RESULT", "UNKNOWN_ACTION");
/*    */     } 
/*    */     
/* 61 */     logger.debug("Risultato =" + resultMap.getAppl("RESULT"));
/* 62 */     logger.info("Uscita modulo " + moduleName);
/*    */     
/* 64 */     return resultMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\module\InsUpdMovimentoMD.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */