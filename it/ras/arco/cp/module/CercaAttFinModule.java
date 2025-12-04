/*     */ package it.ras.arco.cp.module;
/*     */ 
/*     */ import it.ras.arco.cp.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.cp.bean.ParametriRicerca;
/*     */ import it.ras.arco.cp.bean.Parametro;
/*     */ import it.ras.arco.cp.bean.ParametroDiOrdinamento;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.AbstractRasDbModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.HashMap;
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
/*     */ public class CercaAttFinModule
/*     */   extends AbstractRasDbModule
/*     */ {
/*     */   private boolean andInWherePresent = false;
/*     */   
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*  45 */     LogFactory.getLog(getClass()).debug("CP: Inizio modulo di ricerca Attività Finanziaria");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     MapContainer outMc = new MapContainer();
/*     */     
/*  55 */     DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)inputMap.getAppl("DESCRITTORE_RICERCA");
/*     */ 
/*     */     
/*  58 */     this.andInWherePresent = false;
/*  59 */     List list = getDao().executeHqlQuery(buildHQLQuery(descrittoreRicerca), (Object[])new String[0]);
/*     */ 
/*     */     
/*  62 */     outMc.putAppl("RISULTATO_RICERCA", list);
/*     */     
/*  64 */     LogFactory.getLog(getClass()).debug("CP: Risultato (" + list.size() + " elemento/i) inserito in MapContainer, modulo terminato");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     return outMc;
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
/*     */   private HashMap creaHashParametriRicerca(ParametriRicerca rb) {
/*  88 */     HashMap hashParametri = new HashMap();
/*  89 */     HashMap hashEmittente = new HashMap();
/*  90 */     HashMap hashProdotto = new HashMap();
/*  91 */     HashMap hashAttFin = new HashMap();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     String descrizioneEmittente = rb.getDescrEmittente();
/*  97 */     LogFactory.getLog(getClass()).debug("CP: Descrizione Emittente: " + descrizioneEmittente);
/*     */     
/*  99 */     if (!"".equals(descrizioneEmittente)) {
/* 100 */       hashEmittente.put("prodotto.prodotto.emittente.descrizione", descrizioneEmittente);
/*     */     }
/*     */     
/* 103 */     String tipoSocietaEmittente = rb.getTipoSocieta();
/* 104 */     LogFactory.getLog(getClass()).debug("CP: Tipo Società Emittente: " + tipoSocietaEmittente);
/*     */     
/* 106 */     if (!"".equals(tipoSocietaEmittente)) {
/* 107 */       hashEmittente.put("prodotto.prodotto.emittente.tipoSocieta", tipoSocietaEmittente);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 113 */     String descrizioneProdotto = rb.getDescrFamiglia();
/* 114 */     LogFactory.getLog(getClass()).debug("CP: Descrizione: " + descrizioneProdotto);
/*     */     
/* 116 */     if (!"".equals(descrizioneProdotto)) {
/* 117 */       hashProdotto.put("prodotto.prodotto.descrizioneS", descrizioneProdotto);
/*     */     }
/*     */     
/* 120 */     String areaProdotto = rb.getAreaFamiglia();
/* 121 */     LogFactory.getLog(getClass()).debug("CP: Area: " + areaProdotto);
/* 122 */     if (!"".equals(areaProdotto)) {
/* 123 */       hashProdotto.put("prodotto.prodotto.area", areaProdotto);
/*     */     }
/* 125 */     String tipoProdotto = rb.getTipoFamiglia();
/* 126 */     LogFactory.getLog(getClass()).debug("CP: Tipo: " + tipoProdotto);
/* 127 */     if (!"".equals(tipoProdotto)) {
/* 128 */       hashProdotto.put("prodotto.prodotto.tipo", tipoProdotto);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 133 */     String codiceARCO = rb.getCodiceARCO();
/* 134 */     LogFactory.getLog(getClass()).debug("CP: ARCO: " + codiceARCO);
/* 135 */     if (!"".equals(codiceARCO)) {
/* 136 */       hashProdotto.put("attivitaFinId", codiceARCO);
/*     */     }
/* 138 */     String codiceISIN = rb.getCodiceISIN();
/* 139 */     LogFactory.getLog(getClass()).debug("CP: ISIN: " + codiceISIN);
/* 140 */     if (!"".equals(codiceISIN)) {
/* 141 */       hashProdotto.put("isin", codiceISIN);
/*     */     }
/* 143 */     String descrizioneAttFin = rb.getDescrProdotto();
/* 144 */     LogFactory.getLog(getClass()).debug("CP: Descrizione Att Fin: " + descrizioneAttFin);
/*     */     
/* 146 */     if (!"".equals(descrizioneAttFin)) {
/* 147 */       hashProdotto.put("descrizione", descrizioneAttFin);
/*     */     }
/* 149 */     String classe = rb.getClasseProdotto();
/* 150 */     LogFactory.getLog(getClass()).debug("CP: Classe: " + classe);
/* 151 */     if (!"".equals(classe)) {
/* 152 */       hashProdotto.put("classe", classe);
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 157 */     hashParametri.put("emittente", hashEmittente);
/* 158 */     hashParametri.put("prodotto", hashProdotto);
/* 159 */     hashParametri.put("attFin", hashAttFin);
/*     */     
/* 161 */     return hashParametri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String concatenateWhereConditions() {
/* 168 */     if (!this.andInWherePresent) {
/* 169 */       this.andInWherePresent = true;
/* 170 */       return "WHERE ";
/*     */     } 
/* 172 */     this.andInWherePresent = true;
/* 173 */     return " AND ";
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
/* 187 */     List parametri = descrittore.getParametri();
/* 188 */     List parametriDiOrdinamento = descrittore.getParemetriDiOrdinamento();
/*     */     
/* 190 */     String alias = "af";
/*     */     
/* 192 */     String query = "";
/* 193 */     String queryBase = "from FinAttivitaFinanziaria " + alias + " ";
/* 194 */     String queryWhere = "";
/* 195 */     String queryOrder = "order by ";
/*     */     
/* 197 */     Iterator parametriIterator = parametri.iterator();
/* 198 */     Iterator parametriDiOrdinamentoIterator = parametriDiOrdinamento.iterator();
/*     */ 
/*     */ 
/*     */     
/* 202 */     while (parametriIterator.hasNext()) {
/* 203 */       Parametro currentParametro = parametriIterator.next();
/*     */       
/* 205 */       if (currentParametro.isActive())
/*     */       {
/*     */ 
/*     */ 
/*     */         
/* 210 */         queryWhere = queryWhere + concatenateWhereConditions() + costruisciEspressioneSinistra(currentParametro.getNomeLogico(), alias) + currentParametro.costruisciEspressione() + " ";
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 219 */     while (parametriDiOrdinamentoIterator.hasNext()) {
/* 220 */       ParametroDiOrdinamento currentParametroDiOrdinamento = parametriDiOrdinamentoIterator.next();
/*     */ 
/*     */       
/* 223 */       queryOrder = queryOrder + costruisciEspressioneSinistra(currentParametroDiOrdinamento.getNomeLogico(), alias) + " " + currentParametroDiOrdinamento.getTipoOrdinamento();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 229 */     query = queryBase + queryWhere + queryOrder;
/*     */     
/* 231 */     LogFactory.getLog(getClass()).debug("CP: Query costruita:\n\t" + query);
/*     */     
/* 233 */     return query;
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
/* 246 */     String espressione = "";
/*     */     
/* 248 */     if (nomeLogico.startsWith("emittente.")) {
/* 249 */       espressione = nomeLogico.replaceFirst("emittente", "prodotto.prodotto.emittente");
/*     */     }
/*     */ 
/*     */     
/* 253 */     if (nomeLogico.startsWith("prodotto.")) {
/* 254 */       espressione = nomeLogico.replaceFirst("prodotto", "prodotto.prodotto");
/*     */     }
/*     */ 
/*     */     
/* 258 */     if (nomeLogico.startsWith("attivitaFinanziaria.")) {
/* 259 */       espressione = nomeLogico.replaceFirst("attivitaFinanziaria", alias);
/*     */     }
/*     */     
/* 262 */     LogFactory.getLog(getClass()).debug("CP: Il nome logico originale " + nomeLogico + " è stato cambiato in " + espressione);
/*     */ 
/*     */ 
/*     */     
/* 266 */     return espressione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\module\CercaAttFinModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */