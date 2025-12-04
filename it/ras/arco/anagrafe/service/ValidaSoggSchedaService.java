/*     */ package it.ras.arco.anagrafe.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinIndirizzo;
/*     */ import it.ras.arco.bean.FinSoggScheda;
/*     */ import it.ras.arco.bean.FinSoggSchedaIndir;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import org.apache.commons.beanutils.PropertyUtils;
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
/*     */ public class ValidaSoggSchedaService
/*     */   extends SoggSchedaService
/*     */ {
/*  35 */   private String tipoValidazione = null;
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
/*  58 */     RasServiceException normalizzaEx = null;
/*     */     
/*  60 */     FinIndirizzo indirizzoNormalizzato = null;
/*     */     
/*  62 */     FinSoggScheda soggettoScheda = (FinSoggScheda)map.getAppl("SOGGSCHEDA");
/*     */ 
/*     */     
/*  65 */     FinIndirizzo indirizzoOriginale = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  71 */       indirizzoOriginale = ((FinSoggSchedaIndir)PropertyUtils.getProperty(soggettoScheda, "ultimoIndirizzo")).getIndirizzo();
/*  72 */     } catch (IllegalAccessException e1) {
/*     */       
/*  74 */       e1.printStackTrace();
/*  75 */     } catch (InvocationTargetException e1) {
/*     */       
/*  77 */       e1.printStackTrace();
/*  78 */     } catch (NoSuchMethodException e1) {
/*     */       
/*  80 */       e1.printStackTrace();
/*     */     } 
/*     */     
/*     */     try {
/*  84 */       if ("normalizza".equals(this.tipoValidazione)) {
/*  85 */         indirizzoNormalizzato = normalizzaMiddleOffice(indirizzoOriginale);
/*     */       }
/*  87 */     } catch (RasServiceException e) {
/*     */       
/*  89 */       normalizzaEx = e;
/*     */     } 
/*     */     
/*  92 */     if (normalizzaEx == null) {
/*  93 */       normalizzaEx = new RasServiceException();
/*     */     }
/*     */     
/*  96 */     if (normalizzaEx.toBeThrown() && normalizzaEx.signalsPresent()) {
/*  97 */       throw normalizzaEx;
/*     */     }
/*     */     
/* 100 */     return super.functionalValidation(map);
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
/*     */   private FinIndirizzo normalizzaMiddleOffice(FinIndirizzo indirizzoOriginale) throws RasServiceException {
/* 117 */     this.normalizer.normalizeAdress(indirizzoOriginale);
/*     */     
/* 119 */     return indirizzoOriginale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoValidazione() {
/* 126 */     return this.tipoValidazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoValidazione(String tipoValidazione) {
/* 134 */     this.tipoValidazione = tipoValidazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\service\ValidaSoggSchedaService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */