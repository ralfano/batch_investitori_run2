/*    */ package it.ras.arco.batch.service;
/*    */ 
/*    */ import it.ras.arco.batch.bean.QuadPosizioniUl;
/*    */ import it.ras.arco.service.PosizioneManagerSRV;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.ArrayList;
/*    */ import org.apache.commons.logging.Log;
/*    */ import org.apache.commons.logging.LogFactory;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RbVitaPosizioniULSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String POSIZIONI_UL = "POSIZIONI_UL";
/*    */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*    */   public static final String GENERIC_MODULE_RESULT = "POSIZIONI_UL";
/* 23 */   private String action = "ACTION";
/*    */   
/* 25 */   private Log log = LogFactory.getLog(PosizioneManagerSRV.class);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setIsValidating(boolean isValidating) {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 40 */     MapContainer resultMap = new MapContainer();
/* 41 */     MapContainer paramMap = new MapContainer();
/*    */     
/* 43 */     Object oQuadPosizioniUL = map.getAppl("POSIZIONI_UL");
/*    */     
/* 45 */     QuadPosizioniUl posizioniUL = null;
/*    */ 
/*    */     
/* 48 */     if (this.action.equals("GET_POSUL_BY_NUMPOLIZZA")) {
/* 49 */       posizioniUL = (QuadPosizioniUl)getBean(oQuadPosizioniUL, QuadPosizioniUl.class);
/* 50 */       paramMap.putAppl("POSIZIONI_UL", posizioniUL.getPolizzaSiag());
/* 51 */       resultMap = getModuleManager().execModule("GetPosizioneULByPolizzaSiagMD", paramMap);
/* 52 */       return processResultMap(resultMap);
/*    */     } 
/* 54 */     return resultMap;
/*    */   }
/*    */ 
/*    */   
/*    */   private MapContainer processResultMap(MapContainer resultMap) {
/* 59 */     ArrayList result = (ArrayList)resultMap.getAppl("POSIZIONI_UL");
/* 60 */     resultMap.removeAppl("POSIZIONI_UL");
/*    */     
/* 62 */     if (result.size() == 0) {
/* 63 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*    */     } else {
/*    */       
/* 66 */       resultMap.putAppl("RESULT", "FOUND");
/* 67 */       resultMap.putAppl("POSIZIONI_UL", result);
/*    */     } 
/* 69 */     return resultMap;
/*    */   }
/*    */ 
/*    */   
/*    */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 74 */     if (obj == null) {
/* 75 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 76 */       if (this.log.isErrorEnabled()) {
/* 77 */         this.log.error(errorMessage);
/*    */       }
/* 79 */       throw new RasServiceException(errorMessage);
/*    */     } 
/*    */     
/* 82 */     return obj;
/*    */   }
/*    */ 
/*    */   
/*    */   public String getAction() {
/* 87 */     return this.action;
/*    */   }
/*    */   
/*    */   public void setAction(String action) {
/* 91 */     this.action = action;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\service\RbVitaPosizioniULSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */