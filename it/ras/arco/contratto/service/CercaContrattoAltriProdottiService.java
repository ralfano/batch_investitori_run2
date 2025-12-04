/*     */ package it.ras.arco.contratto.service;
/*     */ 
/*     */ import it.ras.arco.common.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.common.bean.Parametro;
/*     */ import it.ras.arco.common.service.RicercaService;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CercaContrattoAltriProdottiService
/*     */   extends RicercaService
/*     */ {
/*  18 */   private static final Object POSIZIONE = null;
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
/*  36 */     boolean trovatoParametroObbligatorio = false;
/*  37 */     boolean trovatoParametroMacroProdottoSufficiente = true;
/*     */     
/*  39 */     List parametriObbligatori = new ArrayList();
/*     */     
/*  41 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)map.getAppl("DESCRITTORE_RICERCA");
/*     */ 
/*     */ 
/*     */     
/*  45 */     List parametri = descrittoreRicerca.getParametri();
/*     */     
/*  47 */     Iterator parametriIterator = parametri.iterator();
/*     */ 
/*     */     
/*  50 */     while (parametriIterator.hasNext()) {
/*  51 */       Parametro parametroCorrente = parametriIterator.next();
/*     */       
/*  53 */       if ("altriProdotti.altriProdottiDet.soggetto.ndgArco".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  58 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  59 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*  62 */       if ("altriProdotti.altriProdottiIDXP".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  67 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  68 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*  71 */       if ("altriProdotti.numContrattoEsterno".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  76 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  77 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */ 
/*     */       
/*  82 */       if ("altriProdotti.promotoreAperturaId.codPromotore".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  87 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  88 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */       
/*  92 */       if ("altriProdotti.altriProdottiDet.cointestazione.cointestazioni.soggetto.ndgArco".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  97 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  98 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */       
/* 102 */       if ("altriProdotti.altriProdottiDet.cointestazione".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 107 */         if (parametroCorrente.getValori().get(0) != null) {
/* 108 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 113 */     String descrizioneErrore = "";
/* 114 */     RasServiceException obblighiExc = new RasServiceException();
/*     */     
/* 116 */     if (!trovatoParametroObbligatorio) {
/* 117 */       RasValidationSignal rasVS = null;
/*     */       
/* 119 */       rasVS = new RasValidationSignal("it.ras.arco.contratto.ricercaContrattoAltriProdotti.segnalazioni.error.nessunParametroDiRicercaSettato", "");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 124 */       obblighiExc.addError(rasVS);
/*     */     } 
/*     */     
/* 127 */     if (obblighiExc.toBeThrown()) {
/* 128 */       throw obblighiExc;
/*     */     }
/*     */     
/* 131 */     return super.functionalValidation(map);
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\contratto\service\CercaContrattoAltriProdottiService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */