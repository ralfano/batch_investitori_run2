/*     */ package it.ras.arco.cp.service;
/*     */ 
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CaricaStoricoPrezziDiAFService
/*     */   extends AbstractRasService
/*     */ {
/*  18 */   private String moduloDiEstrazioneRange = null;
/*  19 */   private String moduloDiEstrazioneTopK = null;
/*     */   
/*     */   public static final String MODALITA_ESTRAZIONE_KEY = "MODALITA_ESTRAZIONE_STORICO_PREZZI";
/*     */   
/*     */   public static final String MODALITA_ESTRAZIONE_RANGE = "RANGE";
/*     */   
/*     */   public static final String MODALITA_ESTRAZIONE_TOP_K = "TOP_K";
/*     */   
/*     */   public static final String MODALITA_RANGE_DATA_INIZIO = "RANGE_DATA_INIZIO";
/*     */   
/*     */   public static final String MODALITA_RANGE_DATA_FINE = "RANGE_DATA_FINE";
/*     */   
/*     */   public static final String MODALITA_TOP_K_NUMERO_RISULTATI = "TOP_K_NUMERO_RISULTATI";
/*     */   
/*     */   public static final String ID_ATTIVITA_FINANZIARIA = "ID_ATTIVITA_FINANZIARIA";
/*     */   
/*     */   public static final String LISTA_PREZZI_RISULTANTI = "LISTA_PREZZI_RISULTANTI";
/*     */ 
/*     */   
/*     */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/*  39 */     return super.functionalValidation(map);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  50 */     String modalitaEstrazione = (String)map.getAppl("MODALITA_ESTRAZIONE_STORICO_PREZZI");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     MapContainer mUscita = null;
/*  58 */     if ("RANGE".equals(modalitaEstrazione)) {
/*     */       
/*  60 */       mUscita = getModuleManager().execModule(this.moduloDiEstrazioneRange, map);
/*     */     }
/*  62 */     else if ("TOP_K".equals(modalitaEstrazione)) {
/*     */       
/*  64 */       mUscita = getModuleManager().execModule(this.moduloDiEstrazioneTopK, map);
/*     */     }
/*     */     else {
/*     */       
/*  68 */       RasServiceException re = new RasServiceException();
/*  69 */       RasValidationSignal s = new RasValidationSignal("it.ras.arco.cp.segnalazioni.error.generic.tecnical.unlocalized", "E' stata specificata una modalita' di estrazione dello storico prezzi non riconosciuta: '" + modalitaEstrazione + "'.");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  74 */       re.addError(s);
/*  75 */       throw re;
/*     */     } 
/*     */     
/*  78 */     return mUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloDiEstrazioneRange() {
/*  88 */     return this.moduloDiEstrazioneRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloDiEstrazioneRange(String moduloDiEstrazioneRange) {
/*  98 */     this.moduloDiEstrazioneRange = moduloDiEstrazioneRange;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuloDiEstrazioneTopK() {
/* 108 */     return this.moduloDiEstrazioneTopK;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuloDiEstrazioneTopK(String moduloDiEstrazioneTopK) {
/* 118 */     this.moduloDiEstrazioneTopK = moduloDiEstrazioneTopK;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\service\CaricaStoricoPrezziDiAFService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */