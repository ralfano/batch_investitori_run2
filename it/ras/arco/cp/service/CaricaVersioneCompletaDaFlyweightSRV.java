/*    */ package it.ras.arco.cp.service;
/*    */ 
/*    */ import it.ras.flag.ArchUtils;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.Map;
/*    */ import org.apache.commons.logging.LogFactory;
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
/*    */ public class CaricaVersioneCompletaDaFlyweightSRV
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String ID_FLYWIEGHT_MAP_CONTAINER_KEY = "ID_FLYWIEGHT";
/*    */   public static final String CLASSE_FLYWEIGHT_MAP_CONTAINER_KEY = "CLASSE_FLYWEIGHT";
/*    */   public static final String BEAN_COMPLETO_CARICATO_MAP_CONTAINER_KEY = "BEAN_COMPLETO_CARICATO";
/* 27 */   private String moduloCaricamento = "";
/* 28 */   private Map decodificaClasseDaCaricare = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 36 */     if (this.decodificaClasseDaCaricare != null && !this.decodificaClasseDaCaricare.isEmpty()) {
/*    */       
/* 38 */       String strClass = (String)map.getAppl("CLASSE_FLYWEIGHT");
/* 39 */       String decodedSC = (String)this.decodificaClasseDaCaricare.get(strClass);
/*    */       
/* 41 */       if (ArchUtils.isValid(decodedSC)) {
/*    */         
/* 43 */         LogFactory.getLog(getClass()).debug("Il class name: '" + strClass + "' e' stato decodificato in '" + decodedSC + "'.");
/*    */ 
/*    */ 
/*    */         
/* 47 */         map.putAppl("CLASSE_FLYWEIGHT", decodedSC);
/*    */       }
/*    */       else {
/*    */         
/* 51 */         LogFactory.getLog(getClass()).debug("Nessuna decodifica per il class name: '" + strClass + "'. Utilizzo quello specificato.");
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 56 */     return getModuleManager().execModule(getModuloCaricamento(), map);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getModuloCaricamento() {
/* 64 */     return this.moduloCaricamento;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setModuloCaricamento(String moduloCaricamento) {
/* 72 */     this.moduloCaricamento = moduloCaricamento;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Map getDecodificaClasseDaCaricare() {
/* 80 */     return this.decodificaClasseDaCaricare;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDecodificaClasseDaCaricare(Map decodificaClasseDaCaricare) {
/* 88 */     this.decodificaClasseDaCaricare = decodificaClasseDaCaricare;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\service\CaricaVersioneCompletaDaFlyweightSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */