/*     */ package it.ras.arco.anagrafe.module;
/*     */ 
/*     */ import it.ras.arco.cp.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.cp.bean.Parametro;
/*     */ import it.ras.arco.cp.bean.ParametroDiOrdinamento;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.AbstractRasDbModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Iterator;
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
/*     */ public class InsUtenteModule
/*     */   extends AbstractRasDbModule
/*     */ {
/*     */   private boolean andInWherePresent = false;
/*     */   
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*  33 */     DescrittoreRicerca dr = (DescrittoreRicerca)inputMap.getAppl("DESCRITTORE_RICERCA");
/*  34 */     this.andInWherePresent = false;
/*     */     
/*  36 */     List list = getDao().executeHqlQuery(buildHQLQuery(dr), (Object[])new String[0]);
/*     */     
/*  38 */     return null;
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
/*     */   private String buildHQLQuery(DescrittoreRicerca descrittore) {
/*  52 */     List parametri = descrittore.getParametri();
/*  53 */     List parametriDiOrdinamento = descrittore.getParemetriDiOrdinamento();
/*     */     
/*  55 */     String alias = "anag";
/*     */     
/*  57 */     String query = "";
/*  58 */     String queryBase = "from FinSoggetto " + alias + " ";
/*  59 */     String queryWhere = "";
/*  60 */     String queryOrder = "order by ";
/*     */     
/*  62 */     Iterator parametriIterator = parametri.iterator();
/*  63 */     Iterator parametriDiOrdinamentoIterator = parametriDiOrdinamento.iterator();
/*     */ 
/*     */ 
/*     */     
/*  67 */     while (parametriIterator.hasNext()) {
/*  68 */       Parametro currentParametro = parametriIterator.next();
/*     */       
/*  70 */       if (currentParametro.isActive())
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*  75 */         queryWhere = queryWhere + concatenateWhereConditions() + costruisciEspressioneSinistra(currentParametro.getNomeLogico(), alias) + currentParametro.costruisciEspressione() + " ";
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  84 */     while (parametriDiOrdinamentoIterator.hasNext()) {
/*  85 */       ParametroDiOrdinamento currentParametroDiOrdinamento = parametriDiOrdinamentoIterator.next();
/*     */ 
/*     */       
/*  88 */       queryOrder = queryOrder + costruisciEspressioneSinistra(currentParametroDiOrdinamento.getNomeLogico(), alias) + " " + currentParametroDiOrdinamento.getTipoOrdinamento();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     query = queryBase + queryWhere + queryOrder;
/*     */     
/*  96 */     LogFactory.getLog(getClass()).debug("Anagrafe: Query costruita:\n\t" + query);
/*     */     
/*  98 */     return query;
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
/*     */   private String costruisciEspressioneSinistra(String nomeLogico, String alias) {
/* 111 */     String espressione = "";
/*     */     
/* 113 */     if (nomeLogico.startsWith("emittente.")) {
/* 114 */       espressione = nomeLogico.replaceFirst("emittente", "prodotto.prodotto.emittente");
/*     */     }
/*     */ 
/*     */     
/* 118 */     if (nomeLogico.startsWith("prodotto.")) {
/* 119 */       espressione = nomeLogico.replaceFirst("prodotto", "prodotto.prodotto");
/*     */     }
/*     */ 
/*     */     
/* 123 */     if (nomeLogico.startsWith("attivitaFinanziaria.")) {
/* 124 */       espressione = nomeLogico.replaceFirst("attivitaFinanziaria", alias);
/*     */     }
/*     */     
/* 127 */     LogFactory.getLog(getClass()).debug("CP: Il nome logico originale " + nomeLogico + " è stato cambiato in " + espressione);
/*     */ 
/*     */ 
/*     */     
/* 131 */     return espressione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String concatenateWhereConditions() {
/* 138 */     if (!this.andInWherePresent) {
/* 139 */       this.andInWherePresent = true;
/* 140 */       return "WHERE ";
/*     */     } 
/* 142 */     this.andInWherePresent = true;
/* 143 */     return " AND ";
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\anagrafe\module\InsUtenteModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */