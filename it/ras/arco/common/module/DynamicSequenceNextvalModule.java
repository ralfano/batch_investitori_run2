/*    */ package it.ras.arco.common.module;
/*    */ 
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
/*    */ public class DynamicSequenceNextvalModule
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   private String sequenceNameKey;
/* 17 */   private String output = "";
/*    */   
/* 19 */   private Log log = LogFactory.getLog(DynamicSequenceNextvalModule.class);
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
/*    */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/* 38 */     MapContainer outputMap = new MapContainer();
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 43 */     String sequence = (String)inputMap.getAppl(this.sequenceNameKey);
/* 44 */     Object nextVal = getDao().getSequenceNextval(sequence);
/* 45 */     outputMap.putAppl(this.output, nextVal);
/* 46 */     return outputMap;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setOutput(String output) {
/* 54 */     this.output = output;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getSequenceNameKey() {
/* 61 */     return this.sequenceNameKey;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setSequenceNameKey(String sequenceNameKey) {
/* 69 */     this.sequenceNameKey = sequenceNameKey;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\DynamicSequenceNextvalModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */