/*    */ package it.ras.arco.module;
/*    */ 
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.flag.ArchUtils;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.module.AbstractRasDbModule;
/*    */ import it.ras.flag.util.MapContainer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class InsertSottoscrizioneMD
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*    */   
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */   
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/* 36 */     MapContainer resultSottoscrizione = new MapContainer();
/*    */     
/* 38 */     FinSottoscrizione sottoscrizione = (FinSottoscrizione)inputMap.getAppl("SOTTOSCRIZIONE");
/* 39 */     if (sottoscrizione == null) {
/* 40 */       resultSottoscrizione.putAppl("RESULT", "NULL");
/* 41 */       return resultSottoscrizione;
/*    */     } 
/*    */     
/* 44 */     ArchUtils.setStdFields(sottoscrizione, "I", "CensimentoSottoscrizione");
/* 45 */     getDao().insertSingleEntity(sottoscrizione);
/* 46 */     resultSottoscrizione.putAppl("RESULT", "INSERTED");
/* 47 */     return resultSottoscrizione;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\module\InsertSottoscrizioneMD.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */