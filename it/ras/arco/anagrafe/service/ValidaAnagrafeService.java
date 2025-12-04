/*     */ package it.ras.arco.anagrafe.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinIndirizzo;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.arco.service.SoggettoManagerSRV;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ValidaAnagrafeService
/*     */   extends SoggettoManagerSRV
/*     */ {
/*  20 */   private String tipoValidazione = null;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/*  45 */     FinSoggetto soggettoOriginale = (FinSoggetto)map.getAppl("SOGGETTO");
/*     */     
/*  47 */     FinSoggetto soggettoNormalizzato = null;
/*     */     
/*  49 */     FinSoggetto soggettoTrovato = null;
/*  50 */     MapContainer mapContainerNormalizer = null;
/*     */     
/*  52 */     RasServiceException normalizzaDeduplicaEx = null;
/*  53 */     RasServiceException obblighiEx = new RasServiceException();
/*     */     
/*  55 */     String descrizioneErrore = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     if ("G".equals(soggettoOriginale.getTipoSogg()) && "".equals(soggettoOriginale.getPartitaIva())) {
/*     */ 
/*     */       
/*  65 */       this.normalizer.setForzaturaCF(true);
/*     */     } else {
/*     */       
/*  68 */       this.normalizer.setForzaturaCF(false);
/*     */     } 
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
/* 104 */     if (!obblighiEx.toBeThrown()) {
/*     */       try {
/* 106 */         if ("normalizza".equals(this.tipoValidazione)) {
/* 107 */           soggettoNormalizzato = normalizzaMiddleOffice(soggettoOriginale);
/* 108 */         } else if ("normalizzaDeduplica".equals(this.tipoValidazione)) {
/* 109 */           soggettoNormalizzato = normalizzaMiddleOffice(soggettoOriginale);
/*     */           
/* 111 */           this.deduplicator.setRasServiceException(this.normalizer.getRasServiceException());
/*     */ 
/*     */           
/* 114 */           mapContainerNormalizer = deduplicaMiddleOffice(soggettoOriginale, (FinIndirizzo)null);
/*     */         }
/* 116 */         else if ("deduplica".equals(this.tipoValidazione)) {
/* 117 */           mapContainerNormalizer = deduplicaMiddleOffice(soggettoOriginale, (FinIndirizzo)null);
/*     */         }
/*     */       
/* 120 */       } catch (RasServiceException e) {
/*     */         
/* 122 */         normalizzaDeduplicaEx = e;
/*     */       } 
/*     */     }
/*     */     
/* 126 */     if (normalizzaDeduplicaEx == null) {
/* 127 */       normalizzaDeduplicaEx = new RasServiceException();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 134 */     normalizzaDeduplicaEx.add(0, obblighiEx.getSignals(0));
/*     */     
/* 136 */     normalizzaDeduplicaEx.add(1, obblighiEx.getSignals(1));
/*     */     
/* 138 */     normalizzaDeduplicaEx.add(2, obblighiEx.getSignals(2));
/*     */ 
/*     */     
/* 141 */     if (normalizzaDeduplicaEx.toBeThrown() && normalizzaDeduplicaEx.signalsPresent())
/*     */     {
/* 143 */       throw normalizzaDeduplicaEx;
/*     */     }
/*     */     
/* 146 */     return super.functionalValidation(map);
/*     */   }
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
/*     */   private FinSoggetto normalizzaMiddleOffice(FinSoggetto soggettoOriginale) throws RasServiceException {
/* 163 */     this.normalizer.normalizeSubject(soggettoOriginale);
/*     */     
/* 165 */     return soggettoOriginale;
/*     */   }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer deduplicaMiddleOffice(FinSoggetto soggettoOriginale, FinIndirizzo indirizzoOriginale) throws RasServiceException {
/* 193 */     FinSoggetto soggettoTrovato = null;
/*     */     
/* 195 */     MapContainer mapContainerDeduplicator = null;
/* 196 */     if (soggettoOriginale.getSoggettoId() != null) {
/* 197 */       this.deduplicator.setOnLine(false);
/*     */     }
/* 199 */     mapContainerDeduplicator = this.deduplicator.deduplicate(soggettoOriginale, indirizzoOriginale);
/*     */ 
/*     */     
/* 202 */     return mapContainerDeduplicator;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoValidazione() {
/* 209 */     return this.tipoValidazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoValidazione(String tipoValidazione) {
/* 217 */     this.tipoValidazione = tipoValidazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\service\ValidaAnagrafeService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */