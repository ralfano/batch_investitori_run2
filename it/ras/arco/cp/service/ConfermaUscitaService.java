/*    */ package it.ras.arco.cp.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ConfermaUscitaService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String CHIAVE_MESSAGGIO_DEFAULT = "it.ras.arco.cp.segnalazioni.warning.confermaUscita";
/* 18 */   private String chiaveMessaggio = "it.ras.arco.cp.segnalazioni.warning.confermaUscita";
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
/*    */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/* 33 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 42 */     return null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getChiaveMessaggio() {
/* 50 */     return this.chiaveMessaggio;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setChiaveMessaggio(String chiaveMessaggio) {
/* 58 */     this.chiaveMessaggio = chiaveMessaggio;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\service\ConfermaUscitaService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */