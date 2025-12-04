/*     */ package it.ras.arco.cp.module;
/*     */ 
/*     */ import it.ras.arco.cp.bean.ParametriRicerca;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.AbstractRasDbModule;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class CercaEmittenteModule
/*     */   extends AbstractRasDbModule
/*     */ {
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*  38 */     LogFactory.getLog(getClass()).debug("CP: Inizio modulo di ricerca Emittente");
/*     */     
/*  40 */     ParametriRicerca rB = (ParametriRicerca)inputMap.getAppl("PARAMETRI_RICERCA");
/*     */     
/*  42 */     String descrizione = rB.getDescrEmittente();
/*  43 */     LogFactory.getLog(getClass()).debug("CP: Descrizione: " + descrizione);
/*     */     
/*  45 */     String tipo = rB.getTipoSocieta();
/*  46 */     LogFactory.getLog(getClass()).debug("CP: Tipo: " + tipo);
/*     */     
/*  48 */     if (descrizione != null) {
/*     */       
/*  50 */       MapContainer outMc = new MapContainer();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  59 */       List list = getDao().executeHqlQuery(buildHQLQuery(descrizione, tipo), (Object[])new String[0]);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  68 */       outMc.putAppl("RISULTATO_RICERCA", list);
/*     */       
/*  70 */       LogFactory.getLog(getClass()).debug("CP: Risultato inserito in MapContainer, modulo terminato");
/*  71 */       return outMc;
/*     */     } 
/*     */     
/*  74 */     return null;
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
/*     */   private String buildHQLQuery(String descrizione, String tipo) {
/*  90 */     String str = "from FinEmittente e ";
/*     */     
/*  92 */     if (descrizione != null && !descrizione.equals("")) {
/*     */       
/*  94 */       str = str + " where e.descrizione LIKE '%" + descrizione + "%' ";
/*  95 */       if (tipo != null && !tipo.equals(""))
/*     */       {
/*  97 */         str = str + " and e.tipoSocieta LIKE '%" + tipo + "%' ";
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 102 */     else if (tipo != null && !tipo.equals("")) {
/*     */       
/* 104 */       str = str + " where e.tipoSocieta LIKE '%" + tipo + "%' ";
/*     */     } 
/*     */ 
/*     */     
/* 108 */     str = str + " order by e.descrizione asc";
/* 109 */     return str;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\module\CercaEmittenteModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */