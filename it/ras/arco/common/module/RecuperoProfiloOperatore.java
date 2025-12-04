/*    */ package it.ras.arco.common.module;
/*    */ 
/*    */ import it.ras.arco.bean.sec.Istituto;
/*    */ import it.ras.arco.bean.sec.RecuperoProfiloOperatoreSP_Request;
/*    */ import it.ras.arco.bean.sec.UserContext;
/*    */ import it.ras.arco.bean.sec.UserId;
/*    */ import it.ras.flag.exception.RasServiceException;
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
/*    */ public class RecuperoProfiloOperatore
/*    */   extends AbstractSecServiceModule
/*    */ {
/*    */   protected Object[] prepareInput(MapContainer inputMap) throws RasServiceException {
/* 26 */     String userIdOperatore = (String)inputMap.getAppl("USER_ID_OPERATORE");
/* 27 */     RecuperoProfiloOperatoreSP_Request request = new RecuperoProfiloOperatoreSP_Request();
/* 28 */     UserContext userContext = new UserContext();
/* 29 */     userContext.setCanale("INT");
/*    */ 
/*    */     
/* 32 */     userContext.setSessionHandle("AE_");
/* 33 */     UserId userId = new UserId();
/* 34 */     userId.setCodice(userIdOperatore);
/* 35 */     userContext.setUserId(userId);
/* 36 */     request.setUserContext(userContext);
/*    */ 
/*    */     
/* 39 */     Istituto istituto = new Istituto();
/* 40 */     istituto.setCodice("");
/* 41 */     request.setIstituto(istituto);
/* 42 */     return new Object[] { request };
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer prepareOutput(Object object) throws RasServiceException {
/* 50 */     MapContainer outMap = new MapContainer(1);
/* 51 */     outMap.putAppl("PROFILO_OPERATORE_CORRENTE", object);
/* 52 */     return outMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\RecuperoProfiloOperatore.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */