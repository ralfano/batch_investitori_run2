/*    */ package it.ras.arco.common.module;
/*    */ 
/*    */ import it.ras.arco.bean.FinContrattoCC;
/*    */ import it.ras.arco.bean.sec.Contratto;
/*    */ import it.ras.arco.bean.sec.Istituto;
/*    */ import it.ras.arco.bean.sec.Prodotto;
/*    */ import it.ras.arco.bean.sec.SaldoPromotoreSP_Request;
/*    */ import it.ras.arco.bean.sec.SecOld;
/*    */ import it.ras.arco.bean.sec.UserContext;
/*    */ import it.ras.arco.bean.sec.pal.ProfiloDiAccesso_Login_Response;
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
/*    */ 
/*    */ public class GetSaldoCCModule
/*    */   extends AbstractSecServiceModule
/*    */ {
/*    */   protected Object[] prepareInput(MapContainer inputMap) throws RasServiceException {
/* 31 */     ProfiloDiAccesso_Login_Response profilo = (ProfiloDiAccesso_Login_Response)inputMap.getAppl("PROFILO_PROMOTORE_CORRENTE");
/*    */     
/* 33 */     String userIdOperatore = (String)inputMap.getAppl("USER_ID_OPERATORE");
/* 34 */     FinContrattoCC contoCorrente = (FinContrattoCC)inputMap.getAppl("CONTO_CORRENTE");
/*    */     
/* 36 */     SaldoPromotoreSP_Request request = new SaldoPromotoreSP_Request();
/*    */ 
/*    */     
/* 39 */     Prodotto prodotto = getProdottoFromProfile(profilo, "CSR");
/* 40 */     request.setProdotto(prodotto);
/*    */     
/* 42 */     Istituto istituto = getIstitutoFromProfile(profilo);
/* 43 */     request.setIstituto(istituto);
/*    */     
/* 45 */     UserContext userContext = getUserContextFromProfile(profilo, userIdOperatore);
/*    */     
/* 47 */     request.setUserContext(userContext);
/*    */     
/* 49 */     Contratto contratto = getContractFromProfile(profilo);
/* 50 */     request.setContratto(contratto);
/*    */     
/* 52 */     SecOld secOld = getSecOldFromProfile(contoCorrente, profilo, "CSR", "FN_SALDO_PROMOTORE");
/*    */     
/* 54 */     request.setSecOld(secOld);
/*    */ 
/*    */     
/* 57 */     request.setDomain("");
/* 58 */     request.setIp("");
/* 59 */     request.setFn("");
/* 60 */     request.setLevel("");
/*    */ 
/*    */     
/* 63 */     request.setAction("SaldoUnico");
/* 64 */     request.setCodiceMd5(getMd5FromProfile(profilo, "CSR"));
/*    */     
/* 66 */     return new Object[] { request };
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer prepareOutput(Object object) throws RasServiceException {
/* 74 */     MapContainer outMap = new MapContainer(1);
/* 75 */     outMap.putAppl("SALDO_CONTO_CORRENTE", object);
/* 76 */     return outMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\GetSaldoCCModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */