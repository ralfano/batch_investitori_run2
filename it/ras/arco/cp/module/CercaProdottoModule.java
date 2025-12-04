/*     */ package it.ras.arco.cp.module;
/*     */ 
/*     */ import it.ras.arco.cp.bean.ParametriRicerca;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.AbstractRasDbModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public class CercaProdottoModule
/*     */   extends AbstractRasDbModule
/*     */ {
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*  39 */     LogFactory.getLog(getClass()).debug("CP: Inizio modulo di ricerca Prodotto");
/*     */ 
/*     */     
/*  42 */     ParametriRicerca rB = (ParametriRicerca)inputMap.getAppl("PARAMETRI_RICERCA");
/*     */ 
/*     */     
/*  45 */     HashMap hashParametri = creaHashParametriRicerca(rB);
/*     */ 
/*     */     
/*  48 */     MapContainer outMc = new MapContainer();
/*     */ 
/*     */     
/*  51 */     List list = getDao().executeHqlQuery(buildHQLQuery(hashParametri), (Object[])new String[0]);
/*     */ 
/*     */     
/*  54 */     outMc.putAppl("RISULTATO_RICERCA", list);
/*     */     
/*  56 */     LogFactory.getLog(getClass()).debug("CP: Risultato (" + list.size() + " elemento/i) inserito in MapContainer, modulo terminato");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  62 */     return outMc;
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
/*     */   private HashMap creaHashParametriRicerca(ParametriRicerca rb) {
/*  74 */     HashMap hashParametri = new HashMap();
/*  75 */     HashMap hashEmittente = new HashMap();
/*  76 */     HashMap hashProdotto = new HashMap();
/*     */     
/*  78 */     String descrizioneEmittente = rb.getDescrEmittente();
/*  79 */     LogFactory.getLog(getClass()).debug("CP: Descrizione Emittente: " + descrizioneEmittente);
/*     */     
/*  81 */     if (!"".equals(descrizioneEmittente)) {
/*  82 */       hashEmittente.put("descrizione", descrizioneEmittente);
/*     */     }
/*  84 */     String tipoSocietaEmittente = rb.getTipoSocieta();
/*  85 */     LogFactory.getLog(getClass()).debug("CP: Tipo Società Emittente: " + tipoSocietaEmittente);
/*     */     
/*  87 */     if (!"".equals(tipoSocietaEmittente)) {
/*  88 */       hashEmittente.put("tipoSocieta", tipoSocietaEmittente);
/*     */     }
/*  90 */     String descrizioneProdotto = rb.getDescrFamiglia();
/*  91 */     LogFactory.getLog(getClass()).debug("CP: Descrizione: " + descrizioneProdotto);
/*     */     
/*  93 */     if (!"".equals(descrizioneProdotto)) {
/*  94 */       hashProdotto.put("descrizioneS", descrizioneProdotto);
/*     */     }
/*  96 */     String areaProdotto = rb.getAreaFamiglia();
/*  97 */     LogFactory.getLog(getClass()).debug("CP: Area: " + areaProdotto);
/*  98 */     if (!"".equals(areaProdotto)) {
/*  99 */       hashProdotto.put("area", areaProdotto);
/*     */     }
/* 101 */     String tipoProdotto = rb.getTipoFamiglia();
/* 102 */     LogFactory.getLog(getClass()).debug("CP: Tipo: " + tipoProdotto);
/* 103 */     if (!"".equals(tipoProdotto)) {
/* 104 */       hashProdotto.put("tipo", tipoProdotto);
/*     */     }
/* 106 */     hashParametri.put("emittente", hashEmittente);
/* 107 */     hashParametri.put("prodotto", hashProdotto);
/*     */     
/* 109 */     return hashParametri;
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
/*     */   private String buildHQLQuery(HashMap parametriDiRicerca) {
/* 123 */     HashMap hashEmittente = (HashMap)parametriDiRicerca.get("emittente");
/* 124 */     HashMap hashProdotto = (HashMap)parametriDiRicerca.get("prodotto");
/*     */     
/* 126 */     String query = "";
/* 127 */     String queryBase = "from ";
/* 128 */     String queryWhere = "where ";
/*     */ 
/*     */ 
/*     */     
/* 132 */     if (!hashEmittente.isEmpty()) {
/* 133 */       queryBase = queryBase + "FinProdotto p LEFT JOIN FETCH p.emittente e ";
/*     */     } else {
/* 135 */       queryBase = queryBase + "FinProdotto p ";
/*     */     } 
/*     */     
/* 138 */     if (!hashEmittente.isEmpty()) {
/* 139 */       Set emittenteKeySet = hashEmittente.keySet();
/*     */       
/* 141 */       Iterator iterator = emittenteKeySet.iterator();
/*     */       
/* 143 */       while (iterator.hasNext()) {
/* 144 */         String actualKey = iterator.next();
/*     */         
/* 146 */         queryWhere = queryWhere + "e." + actualKey + " LIKE '%" + (String)hashEmittente.get(actualKey) + "%' ";
/*     */ 
/*     */         
/* 149 */         queryWhere = queryWhere + "AND ";
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 155 */     if (!hashProdotto.isEmpty()) {
/* 156 */       Set prodottoKeySet = hashProdotto.keySet();
/*     */       
/* 158 */       Iterator iterator = prodottoKeySet.iterator();
/*     */       
/* 160 */       while (iterator.hasNext()) {
/* 161 */         String actualKey = iterator.next();
/*     */         
/* 163 */         queryWhere = queryWhere + "p." + actualKey + " LIKE '%" + (String)hashProdotto.get(actualKey) + "%' ";
/*     */ 
/*     */         
/* 166 */         queryWhere = queryWhere + "AND ";
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     queryWhere = queryWhere + "1=1 ";
/*     */ 
/*     */     
/* 177 */     queryWhere = queryWhere + "order by p.descrizioneS asc";
/*     */     
/* 179 */     query = queryBase + queryWhere;
/*     */     
/* 181 */     LogFactory.getLog(getClass()).debug("CP: Query costruita:\n\t" + query);
/*     */ 
/*     */ 
/*     */     
/* 185 */     return query;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\module\CercaProdottoModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */