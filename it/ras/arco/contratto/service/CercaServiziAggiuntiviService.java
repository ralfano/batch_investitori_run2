/*     */ package it.ras.arco.contratto.service;
/*     */ 
/*     */ import it.ras.arco.common.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.common.bean.Parametro;
/*     */ import it.ras.arco.common.service.RicercaService;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
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
/*     */ public class CercaServiziAggiuntiviService
/*     */   extends RicercaService
/*     */ {
/*     */   public static final String PATH_NDG_ARCO_INTESTATARIO = "servizioAggiuntivo.posizione.contratto.soggetto.ndgArco";
/*     */   public static final String PATH_NUM_CONTRATTO = "servizioAggiuntivo.posizione.contratto.numContratto";
/*     */   public static final String PATH_FLG_INCLUDI_COINTESTATARI = "servizioAggiuntivo.posizione.contratto.cointestazione.cointestazioni.soggetto.ndgArco";
/*     */   public static final String PATH_COINTESTAZIONE_DEL_CONTRATTO = "servizioAggiuntivo.posizione.contratto.cointestazione";
/*     */   public static final String KEY_NESSUN_PARAMETRO_RICERCA_SETTATO = "it.ras.arco.contratto.ricerca.segnalazioni.error.nessunParametroDiRicercaSettato";
/*     */   
/*     */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/*  45 */     boolean trovatoParametroObbligatorio = false;
/*     */     
/*  47 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)map.getAppl("DESCRITTORE_RICERCA");
/*     */     
/*  49 */     List parametri = descrittoreRicerca.getParametri();
/*     */     
/*  51 */     Iterator parametriIterator = parametri.iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  60 */     while (parametriIterator.hasNext()) {
/*  61 */       Parametro parametroCorrente = parametriIterator.next();
/*     */       
/*  63 */       if ("servizioAggiuntivo.posizione.contratto.soggetto.ndgArco".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */         
/*  67 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  68 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */       
/*  72 */       if ("servizioAggiuntivo.posizione.contratto.numContratto".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */         
/*  76 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  77 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*  82 */       if ("servizioAggiuntivo.posizione.contratto.cointestazione.cointestazioni.soggetto.ndgArco".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */         
/*  85 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  86 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */       
/*  90 */       if ("servizioAggiuntivo.posizione.contratto.cointestazione".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */         
/*  94 */         if (parametroCorrente.getValori().get(0) != null) {
/*  95 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 100 */     if (!trovatoParametroObbligatorio) {
/*     */       
/* 102 */       RasServiceException obblighiExc = new RasServiceException();
/* 103 */       RasValidationSignal rasVS = new RasValidationSignal("it.ras.arco.contratto.ricerca.segnalazioni.error.nessunParametroDiRicercaSettato", "");
/*     */ 
/*     */       
/* 106 */       obblighiExc.addError(rasVS);
/* 107 */       throw obblighiExc;
/*     */     } 
/*     */     
/* 110 */     return super.functionalValidation(map);
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\contratto\service\CercaServiziAggiuntiviService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */