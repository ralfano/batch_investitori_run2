/*    */ package it.ras.arco.common.service;
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
/*    */ public class MiddleOfficeChannelLoginService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String MODULE_CHANNEL_LOGIN = "channelLoginModule";
/*    */   public static final String MODULE_OPERATOR_PROFILE = "operatorProfileModule";
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 31 */     MapContainer retMap = new MapContainer(5, 1.0F);
/* 32 */     MapContainer channelLoginResult = getModuleManager().execModule("channelLoginModule", map);
/*    */     
/* 34 */     Boolean esito = (Boolean)channelLoginResult.getAppl("ESITO");
/*    */     
/* 36 */     if (esito.booleanValue()) {
/*    */       
/* 38 */       retMap.putAppl("JSESSIONID", channelLoginResult.getAppl("JSESSIONID"));
/*    */ 
/*    */       
/* 41 */       retMap.putAppl("USER_ID_OPERATORE", channelLoginResult.getAppl("USER_ID_OPERATORE"));
/*    */ 
/*    */ 
/*    */       
/* 45 */       map.putAppl("JSESSIONID", channelLoginResult.getAppl("JSESSIONID"));
/*    */       
/* 47 */       MapContainer profiloOperatoreResult = getModuleManager().execModule("operatorProfileModule", map);
/*    */       
/* 49 */       if (profiloOperatoreResult.containsKeyAppl("PROFILO_OPERATORE_CORRENTE"))
/*    */       {
/* 51 */         retMap.putAppl("PROFILO_OPERATORE_CORRENTE", profiloOperatoreResult.getAppl("PROFILO_OPERATORE_CORRENTE"));
/*    */       }
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     retMap.putAppl("ESITO", Boolean.TRUE);
/* 60 */     return retMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\service\MiddleOfficeChannelLoginService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */