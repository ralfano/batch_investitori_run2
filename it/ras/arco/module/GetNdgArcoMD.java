/*    */ package it.ras.arco.module;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.module.AbstractRasDbModule;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.math.BigDecimal;
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
/*    */ public class GetNdgArcoMD
/*    */   extends AbstractRasDbModule
/*    */ {
/*    */   public static final String SEQUENCE_NDG_ARCO = "SEQUENCE_NDG_ARCO";
/*    */   public static final String NDG_ARCO_SEQ = "NDG_ARCO_SEQ";
/*    */   
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */   
/*    */   public MapContainer service(MapContainer param) throws RasServiceException {
/* 33 */     MapContainer result = new MapContainer();
/*    */     
/* 35 */     BigDecimal ndgArco = (BigDecimal)getDao().getSequenceNextval("NDG_ARCO_SEQ");
/*    */     
/* 37 */     result.putAppl("SEQUENCE_NDG_ARCO", new Integer(ndgArco.intValue()));
/*    */     
/* 39 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\module\GetNdgArcoMD.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */