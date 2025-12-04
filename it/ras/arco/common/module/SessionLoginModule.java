/*    */ package it.ras.arco.common.module;
/*    */ 
/*    */ import it.ras.arco.bean.sec.pal.ProfiloDiAccesso_Login_Request;
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
/*    */ public class SessionLoginModule
/*    */   extends AbstractSecServiceModule
/*    */ {
/*    */   protected Object[] prepareInput(MapContainer inputMap) throws RasServiceException {
/* 22 */     Object[] values = new Object[1];
/* 23 */     ProfiloDiAccesso_Login_Request request = new ProfiloDiAccesso_Login_Request();
/* 24 */     request.setJMCCanale("MOF");
/* 25 */     request.setUserID((String)inputMap.getAppl("USER_ID_PROMOTORE"));
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
/* 37 */     values[0] = request;
/* 38 */     return values;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer prepareOutput(Object object) throws RasServiceException {
/* 47 */     if (object instanceof it.ras.arco.bean.sec.pal.ProfiloDiAccesso_Login_Response) {
/* 48 */       MapContainer out = new MapContainer(1);
/* 49 */       out.putAppl("PROFILO_PROMOTORE_CORRENTE", object);
/* 50 */       return out;
/*    */     } 
/* 52 */     throw new RasServiceException("it.ras.arco.ordini.sec.profile.ko");
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\SessionLoginModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */