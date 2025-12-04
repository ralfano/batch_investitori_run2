/*     */ package it.ras.arco.cp.service;
/*     */ 
/*     */ import it.ras.arco.cp.bean.DescrittoreRicerca;
/*     */ import it.ras.arco.cp.bean.Parametro;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
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
/*     */ public class CercaCatalogoService
/*     */   extends AbstractRasService
/*     */ {
/*  29 */   private Map moduleCatalog = new HashMap();
/*     */   
/*  31 */   private String nomeModuloCachedQry = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String MODALITA_RICERCA_SWITCH_REGOLE_DA = "cercaRegolaSwitchDA";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean validaRicercaCatalogo(DescrittoreRicerca dr, MapContainer map) throws RasServiceException {
/*  46 */     List listaParametri = dr.getParametri();
/*     */     
/*  48 */     String descrEmittente = null;
/*  49 */     String descrProdotto = null;
/*  50 */     String tipoProdotto = null;
/*  51 */     String descrAttFin = null;
/*  52 */     String codiceArco = null;
/*  53 */     String codiceISIN = null;
/*     */     
/*  55 */     String descrizioneErrore = null;
/*     */     
/*  57 */     if (dr.getNomeRicerca().equals("cercaEmittente")) {
/*     */       
/*  59 */       if (listaParametri.isEmpty()) {
/*     */         
/*  61 */         LogFactory.getLog(getClass()).warn("La lista dei parametri e' vuota! Ricerco tutti gli Emittenti!");
/*  62 */         return super.functionalValidation(map);
/*     */       } 
/*     */       
/*     */       try {
/*  66 */         descrEmittente = ((Parametro)listaParametri.get(0)).getValori(0);
/*     */       }
/*  68 */       catch (NullPointerException npe) {
/*     */         
/*  70 */         LogFactory.getLog(getClass()).error(npe + " : non ho trovato la descrione dell'Emittente!");
/*     */       } 
/*     */       
/*  73 */       if (isNotNull(descrEmittente))
/*     */       {
/*  75 */         return super.functionalValidation(map);
/*     */       }
/*     */ 
/*     */       
/*  79 */       descrizioneErrore = "descrizione Emittente";
/*     */ 
/*     */     
/*     */     }
/*  83 */     else if (dr.getNomeRicerca().equals("cercaProdotto")) {
/*     */       
/*  85 */       if (listaParametri.isEmpty() || (Parametro)listaParametri.get(0) instanceof it.ras.arco.cp.bean.ParametroNumerico)
/*     */       {
/*  87 */         return super.functionalValidation(map);
/*     */       }
/*     */ 
/*     */       
/*     */       try {
/*  92 */         descrEmittente = ((Parametro)listaParametri.get(0)).getValori(0);
/*  93 */         descrProdotto = ((Parametro)listaParametri.get(2)).getValori(0);
/*  94 */         tipoProdotto = ((Parametro)listaParametri.get(3)).getValori(0);
/*     */       }
/*  96 */       catch (NullPointerException npe) {
/*     */         
/*  98 */         LogFactory.getLog(getClass()).error(npe + " : non ho trovato la DescrEmittente o " + "DescrMacroProdotto o TipoMacroProdotto!");
/*     */       } 
/*     */ 
/*     */       
/* 102 */       if (isNotNull(descrEmittente) || isNotNull(descrProdotto) || isNotNull(tipoProdotto))
/*     */       {
/* 104 */         return super.functionalValidation(map);
/*     */       }
/*     */ 
/*     */       
/* 108 */       descrizioneErrore = "descrizione MacroProdotto o tipo MacroProdotto o descrizione Emittente";
/*     */ 
/*     */     
/*     */     }
/* 112 */     else if (dr.getNomeRicerca().equals("cercaAttFin")) {
/*     */ 
/*     */       
/*     */       try {
/* 116 */         descrEmittente = ((Parametro)listaParametri.get(0)).getValori(0);
/* 117 */         descrProdotto = ((Parametro)listaParametri.get(2)).getValori(0);
/* 118 */         descrAttFin = ((Parametro)listaParametri.get(5)).getValori(0);
/* 119 */         codiceArco = ((Parametro)listaParametri.get(7)).getValori(0);
/* 120 */         codiceISIN = ((Parametro)listaParametri.get(8)).getValori(0);
/*     */       }
/* 122 */       catch (NullPointerException npe) {
/*     */         
/* 124 */         LogFactory.getLog(getClass()).error(npe + " : non ho trovato la descrEmittente o " + "descrMacroProdotto o descrProdotto o codiceArco o codiceISIN!");
/*     */       } 
/*     */ 
/*     */       
/* 128 */       if (isNotNull(descrEmittente) || isNotNull(descrProdotto) || isNotNull(descrAttFin) || isNotNull(codiceArco) || isNotNull(codiceISIN))
/*     */       {
/*     */         
/* 131 */         return super.functionalValidation(map);
/*     */       }
/*     */ 
/*     */       
/* 135 */       descrizioneErrore = "descrizione Prodotto o codice ISIN o codice ARCO o descrizione MacroProdotto o descrizione Emittente";
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 141 */       return super.functionalValidation(map);
/*     */     } 
/*     */ 
/*     */     
/* 145 */     RasServiceException rasEx = new RasServiceException();
/*     */     
/* 147 */     RasValidationSignal rasVS = new RasValidationSignal("it.ras.arco.cp.segnalazioni.error.nessunParametroDiRicercaSettato", descrizioneErrore);
/* 148 */     rasEx.addError(rasVS);
/* 149 */     throw rasEx;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/* 159 */     if (map.getAppl("DESCRITTORE_RICERCA") != null) {
/*     */       
/* 161 */       DescrittoreRicerca dr = (DescrittoreRicerca)map.getAppl("DESCRITTORE_RICERCA");
/*     */       
/* 163 */       if ("cercaRegolaSwitchDA".equals(dr.getNomeRicerca()))
/*     */       {
/* 165 */         return validaRicercaSwitch(dr, map);
/*     */       }
/*     */       
/* 168 */       return validaRicercaCatalogo(dr, map);
/*     */     } 
/*     */     
/* 171 */     return true;
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
/*     */   private boolean validaRicercaSwitch(DescrittoreRicerca dr, MapContainer map) throws RasServiceException {
/* 183 */     List listaParametriRicerca = dr.getParametri();
/*     */     
/* 185 */     boolean ok = true;
/* 186 */     boolean emittenteFound = false;
/* 187 */     boolean prodottoFound = false;
/*     */     
/* 189 */     for (Iterator iter = listaParametriRicerca.iterator(); iter.hasNext(); ) {
/*     */       
/* 191 */       Parametro parametro = iter.next();
/* 192 */       if (parametro.getNomeLogico() == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */       
/* 197 */       if ("emittente.emittenteId".equals(parametro.getNomeLogico())) {
/*     */         
/* 199 */         if (!ArchUtils.isValid(parametro.getValori(0)) || "*".equals(parametro.getValori(0))) {
/*     */           
/* 201 */           ok = false;
/*     */           break;
/*     */         } 
/* 204 */         emittenteFound = true;
/*     */         
/*     */         continue;
/*     */       } 
/* 208 */       if ("prodotto.prodottoID".equals(parametro.getNomeLogico())) {
/*     */         
/* 210 */         if (!ArchUtils.isValid(parametro.getValori(0)) || "*".equals(parametro.getValori(0))) {
/*     */           
/* 212 */           ok = false;
/*     */           break;
/*     */         } 
/* 215 */         prodottoFound = true;
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 220 */     if (!ok || !prodottoFound || !emittenteFound) {
/*     */       
/* 222 */       RasServiceException rasEx = new RasServiceException();
/*     */       
/* 224 */       RasValidationSignal rasVS = new RasValidationSignal("it.ras.arco.switch.segnalazioni.error.nessunParametroDiRicercaSettato");
/* 225 */       rasEx.addError(rasVS);
/* 226 */       throw rasEx;
/*     */     } 
/*     */     
/* 229 */     return super.functionalValidation(map);
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
/*     */   private boolean isNotNull(String s) {
/* 241 */     if (s.equals("") || s.trim().length() == 0)
/*     */     {
/* 243 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 247 */     return true;
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
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 259 */     LogFactory.getLog(getClass()).debug("CP: Inizio servizio....");
/*     */     
/* 261 */     LogFactory.getLog(getClass()).debug("CP: CATALOGO MODULI:\n" + printModuleCatalogStructure());
/*     */ 
/*     */     
/* 264 */     String nomeModulo = "";
/* 265 */     if (map.getAppl("DESCRITTORE_RICERCA") != null) {
/*     */       
/* 267 */       DescrittoreRicerca descrittoreRicerca = (DescrittoreRicerca)map.getAppl("DESCRITTORE_RICERCA");
/*     */ 
/*     */       
/* 270 */       LogFactory.getLog(getClass()).debug("CP: E' stata richiesta una ricerca con nome: '" + descrittoreRicerca.getNomeRicerca() + "'");
/*     */ 
/*     */ 
/*     */       
/* 274 */       nomeModulo = (String)this.moduleCatalog.get(descrittoreRicerca.getNomeRicerca());
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 279 */       nomeModulo = getNomeModuloCachedQry();
/*     */     } 
/*     */     
/* 282 */     if (nomeModulo != null && !nomeModulo.equals("")) {
/*     */       
/* 284 */       LogFactory.getLog(getClass()).debug("CP: Questo implica l'esecuzione del modulo: '" + nomeModulo + "'. Esecuzione del modulo...");
/*     */ 
/*     */ 
/*     */       
/* 288 */       MapContainer out = getModuleManager().execModule(nomeModulo, map);
/*     */       
/* 290 */       List results = (List)out.getAppl("RISULTATO_RICERCA");
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
/* 302 */       if (results.isEmpty()) {
/*     */ 
/*     */         
/* 305 */         RasServiceException rasEx = new RasServiceException();
/* 306 */         RasValidationSignal rasVS = new RasValidationSignal("it.ras.arco.cp.segnalazioni.error.nessunRisultatoDallaRicerca");
/*     */         
/* 308 */         rasEx.addError(rasVS);
/* 309 */         throw rasEx;
/*     */       } 
/*     */       
/* 312 */       return out;
/*     */     } 
/*     */ 
/*     */     
/* 316 */     LogFactory.getLog(getClass()).error("CP: MODULO NON TROVATO!");
/*     */     
/* 318 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String printModuleCatalogStructure() {
/* 327 */     String str = "";
/*     */     
/* 329 */     Set kS = this.moduleCatalog.keySet();
/* 330 */     Iterator iS = kS.iterator();
/*     */     
/* 332 */     while (iS.hasNext()) {
/*     */       
/* 334 */       String element = iS.next();
/*     */       
/* 336 */       str = str + "\n-------------------------------\n";
/* 337 */       str = str + " - Nome Logico: " + element;
/* 338 */       str = str + " - Nome Modulo: " + this.moduleCatalog.get(element);
/*     */     } 
/*     */     
/* 341 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map getModuleCatalog() {
/* 349 */     return this.moduleCatalog;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuleCatalog(Map moduleCatalog) {
/* 358 */     this.moduleCatalog = moduleCatalog;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNomeModuloCachedQry() {
/* 368 */     return this.nomeModuloCachedQry;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNomeModuloCachedQry(String nomeModuloCachedQry) {
/* 378 */     this.nomeModuloCachedQry = nomeModuloCachedQry;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\service\CercaCatalogoService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */