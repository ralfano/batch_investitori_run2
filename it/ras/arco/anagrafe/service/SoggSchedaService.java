/*     */ package it.ras.arco.anagrafe.service;
/*     */ 
/*     */ import it.ras.arco.common.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.deduplicator.RasDeduplicator;
/*     */ import it.ras.arco.normalizer.RasNormalizer;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SoggSchedaService
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String SOGGSCHEDA = "SOGGSCHEDA";
/*     */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*  34 */   private String moduleName = "";
/*     */   
/*  36 */   protected RasNormalizer normalizer = null;
/*     */   
/*  38 */   protected RasDeduplicator deduplicator = null;
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  42 */     LogFactory.getLog(getClass()).debug("Anagrafe: Inizio servizio....");
/*     */     
/*  44 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)map.getAppl("DESCRITTORE_RICERCA");
/*     */ 
/*     */     
/*  47 */     MapContainer mapContainer = new MapContainer();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  55 */     if (descrittoreRicerca.getNomeRicerca().equals("saveOrUpdate")) {
/*  56 */       mapContainer = getModuleManager().execModule("inserisciSoggSchedaModule", map);
/*     */     }
/*  58 */     else if (descrittoreRicerca.getNomeRicerca().equals("saveOrUpdateSchedaAndSottoscrizione")) {
/*     */       
/*  60 */       mapContainer = getModuleManager().execModule("inserisciSoggSchedaModule", map);
/*     */ 
/*     */       
/*  63 */       mapContainer = getModuleManager().execModule("inserisciSottoscrizioneMSOModule", map);
/*     */     
/*     */     }
/*  66 */     else if (descrittoreRicerca.getNomeRicerca().equals("getInfoProfRischBySchedaSoggId")) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  71 */       mapContainer = getModuleManager().execModule("getInfoProfRischBySchedaSoggIdModule", map);
/*     */     } 
/*     */ 
/*     */     
/*  75 */     if (descrittoreRicerca.getNomeRicerca().equals("searchPromotore")) {
/*  76 */       mapContainer = getModuleManager().execModule("cercaPromotoreModule", map);
/*     */ 
/*     */       
/*  79 */       List listaRisultati = (List)mapContainer.getAppl("RISULTATO_RICERCA");
/*     */     } 
/*     */ 
/*     */     
/*  83 */     return mapContainer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuleName() {
/*  90 */     return this.moduleName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuleName(String moduleName) {
/*  98 */     this.moduleName = moduleName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RasNormalizer getNormalizer() {
/* 105 */     return this.normalizer;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNormalizer(RasNormalizer normalizer) {
/* 113 */     this.normalizer = normalizer;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\service\SoggSchedaService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */