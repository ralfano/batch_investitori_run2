/*     */ package it.ras.arco.contratto.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinProdotto;
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
/*     */ public class CercaPosizioneService
/*     */   extends RicercaService
/*     */ {
/*  29 */   private static final Object POSIZIONE = null;
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
/*  47 */     boolean trovatoParametroObbligatorio = false;
/*  48 */     boolean trovatoParametroMacroProdottoSufficiente = true;
/*     */     
/*  50 */     List parametriObbligatori = new ArrayList();
/*     */     
/*  52 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)map.getAppl("DESCRITTORE_RICERCA");
/*     */ 
/*     */ 
/*     */     
/*  56 */     List parametri = descrittoreRicerca.getParametri();
/*     */     
/*  58 */     Iterator parametriIterator = parametri.iterator();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     while (parametriIterator.hasNext()) {
/*  68 */       Parametro parametroCorrente = parametriIterator.next();
/*     */       
/*  70 */       if ("posizione.contratto.soggetto.ndgArco".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  75 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  76 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */       
/*  80 */       if ("posizione.contratto.numContratto".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  85 */         if (!"".equals(parametroCorrente.getValori(0))) {
/*  86 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*  92 */       FinProdotto macroProdottoSelezionato = (FinProdotto)map.getAppl("MACROPRODOTTO_SELEZIONATO");
/*     */ 
/*     */ 
/*     */       
/*  96 */       if ("macroProdotto.prodottoID".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 101 */         if (!"".equals(parametroCorrente.getValori(0)))
/*     */         {
/*     */           
/* 104 */           if (!"S".equals(macroProdottoSelezionato.getRicercaSingola())) {
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 109 */             trovatoParametroMacroProdottoSufficiente = false;
/*     */           } else {
/*     */             
/* 112 */             trovatoParametroObbligatorio = true;
/*     */           } 
/*     */         }
/*     */       }
/*     */       
/* 117 */       if ("posizione.contratto.cointestazione.cointestazioni.soggetto.ndgArco".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 122 */         if (!"".equals(parametroCorrente.getValori(0))) {
/* 123 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */       
/* 127 */       if ("posizione.contratto.cointestazione".equals(parametroCorrente.getNomeLogico()))
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 132 */         if (parametroCorrente.getValori().get(0) != null) {
/* 133 */           trovatoParametroObbligatorio = true;
/*     */         }
/*     */       }
/*     */     } 
/*     */     
/* 138 */     String descrizioneErrore = "";
/* 139 */     RasServiceException obblighiExc = new RasServiceException();
/*     */     
/* 141 */     if (!trovatoParametroObbligatorio) {
/* 142 */       RasValidationSignal rasVS = null;
/* 143 */       if (!trovatoParametroMacroProdottoSufficiente) {
/* 144 */         rasVS = new RasValidationSignal("it.ras.arco.contratto.ricerca.segnalazioni.error.parametroDiRicercaSettatoNonSufficiente", "");
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 150 */         rasVS = new RasValidationSignal("it.ras.arco.contratto.ricerca.segnalazioni.error.nessunParametroDiRicercaSettato", "");
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 155 */       obblighiExc.addError(rasVS);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 161 */     if (obblighiExc.toBeThrown()) {
/* 162 */       throw obblighiExc;
/*     */     }
/*     */     
/* 165 */     return super.functionalValidation(map);
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\contratto\service\CercaPosizioneService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */