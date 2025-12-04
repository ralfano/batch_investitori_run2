/*    */ package it.ras.arco.normalizer;
/*    */ 
/*    */ import it.ras.arco.bean.FinIndirizzo;
/*    */ import it.ras.arco.bean.FinIndirizzoRam;
/*    */ import it.ras.arco.bean.FinSoggetto;
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RasTransparentNormalizer
/*    */   extends RasNormalizer
/*    */ {
/*    */   public MapContainer normalizeSubject(FinSoggetto subject) throws RasServiceException {
/* 16 */     return super.normalizeSubject(subject);
/*    */   }
/*    */ 
/*    */   
/*    */   private MapContainer costruisciMapContainerTrasparente(RasORMBean subject) {
/* 21 */     MapContainer resultMap = new MapContainer();
/* 22 */     String result = "EXECUTED";
/* 23 */     resultMap.putAppl("RESULT", result);
/* 24 */     if (subject instanceof FinSoggetto) {
/* 25 */       resultMap.putAppl("SOGGETTO", subject);
/*    */     }
/* 27 */     if (subject instanceof FinIndirizzo) {
/* 28 */       resultMap.putAppl("INDIRIZZO", subject);
/*    */     }
/* 30 */     if (subject instanceof FinIndirizzoRam) {
/* 31 */       resultMap.putAppl("INDIRIZZO", subject);
/*    */     }
/* 33 */     return resultMap;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public MapContainer normalizeAdress(FinIndirizzo adress) throws RasServiceException {
/* 39 */     return super.normalizeAdress(adress);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public MapContainer normalizeAdress(FinIndirizzoRam adressRam) throws RasServiceException {
/* 45 */     return super.normalizeAdress(adressRam);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public MapContainer normalizeAdress(FinIndirizzo adress, RasServiceException rs, String tipo, String progressivo) throws RasServiceException {
/* 51 */     return super.normalizeAdress(adress, rs, tipo, progressivo);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String verifyCF(FinSoggetto soggetto) throws RasServiceException {
/* 57 */     return super.verifyCF(soggetto);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String verifyCf(String codFiscale) throws RasServiceException {
/* 63 */     return super.verifyCf(codFiscale);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String verifyPartitaIVA(String pIva) throws RasServiceException {
/* 69 */     return super.verifyPartitaIVA(pIva);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected void createNew() throws RasServiceException {
/*    */     try {
/* 77 */       super.createNew();
/*    */     }
/* 79 */     catch (Exception e) {
/*    */       
/* 81 */       if (this.log.isErrorEnabled()) {
/* 82 */         this.log.error("Impossibile inizializzare il Normalizzatore, nell'applicazione la normalizzazione e' disattivata");
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean isAvailable() {
/* 88 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\normalizer\RasTransparentNormalizer.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */