/*    */ package it.ras.arco.service;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.List;
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
/*    */ public class GetProdottoSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String ROW_PRODOTTO = "ROW_PRODOTTO";
/*    */   public static final String ROW_ATT_FIN = "ROW_ATT_FIN";
/*    */   public static final String ROW_EMITTENTE = "ROW_EMITTENTE";
/*    */   public static final String ROW_PRODOTTO_LINEA = "ROW_PRODOTTO_LINEA";
/*    */   
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 29 */     MapContainer result = new MapContainer();
/* 30 */     String resultMsg = null;
/*    */ 
/*    */     
/* 33 */     result = getModuleManager().execModule("GetProdottoMD", map);
/* 34 */     resultMsg = (String)result.getAppl("RESULT");
/*    */ 
/*    */     
/* 37 */     List listaProdotti = null;
/*    */ 
/*    */     
/* 40 */     if (resultMsg.equals("FOUND")) {
/* 41 */       listaProdotti = (List)result.getAppl("RESULT_LIST");
/*    */ 
/*    */ 
/*    */       
/* 45 */       if (listaProdotti.size() > 1) {
/*    */         
/* 47 */         result.putAppl("RESULT", "TOO_MANY_ROWS");
/* 48 */         return result;
/*    */       } 
/* 50 */       if (listaProdotti.size() == 1)
/*    */       {
/* 52 */         resultMsg = (String)result.getAppl("RESULT_MESSAGE");
/* 53 */         result.putAppl(resultMsg, listaProdotti.get(0));
/* 54 */         return result;
/*    */       
/*    */       }
/*    */     
/*    */     }
/*    */     else {
/*    */       
/* 61 */       result.putAppl("RESULT", "NOT_FOUND");
/* 62 */       return result;
/*    */     } 
/*    */     
/* 65 */     return result;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\GetProdottoSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */