/*     */ package it.ras.arco.ordine.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinNumContratti;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.lang.StringUtils;
/*     */ import org.apache.commons.logging.Log;
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
/*     */ public class PrenotaNumeroContrattoService
/*     */   extends AbstractRasService
/*     */ {
/*  44 */   private Map moduleCatalog = new HashMap();
/*  45 */   private final Log log = LogFactory.getLog(getClass());
/*     */   
/*     */   public static final String MODULO_PRENDI_NUMERO_CONTRATTO = "prenotaNumero";
/*     */   
/*     */   public static final String MODULO_TROVA_NUMERO_CONTRATTO = "trovaNumero";
/*     */   
/*     */   public static final String MODULO_AGGIORNA_STATO_NUMERO_CONTRATTO = "aggiornaStatoNumeroContratto";
/*     */   
/*     */   public static final String MODULO_GET_SEQUENCE = "getSequenceNumeroContratto";
/*     */   
/*     */   public static final String NUMERO_CONTRATTO = "NUMERO_CONTRATTO";
/*     */   
/*     */   public static final String SEQUENCE_NAME = "SEQUENCE_NAME";
/*     */   
/*     */   public static final String SEQUENCE_VALUE = "SEQUENCE_VALUE";
/*     */   
/*     */   public static final String LISTA_NUMERO_CONTRATTO = "LISTA_NUMERO_CONTRATTO";
/*     */   
/*     */   public static final String EMITTENTE_ID = "EMITTENTE_ID";
/*     */   
/*     */   public static final String TIPO_PRODOTTO = "TIPO_PRODOTTO";
/*     */   
/*     */   public static final String PREFISSO = "PREFISSO";
/*     */   
/*     */   public static final String ACTION = "ACTION";
/*     */   
/*     */   public static final String ACTION_PRENOTA = "ACTION_PRENOTA";
/*     */   
/*     */   public static final String ACTION_CONFERMA = "ACTION_CONFERMA";
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  76 */     MapContainer out = null;
/*  77 */     FinNumContratti numCont = null;
/*  78 */     String nomeModulo = null;
/*  79 */     String action = (String)map.getAppl("ACTION");
/*  80 */     if (action != null && action.equals("ACTION_CONFERMA")) {
/*  81 */       List listaNumeri = (List)map.getAppl("LISTA_NUMERO_CONTRATTO");
/*  82 */       Iterator iter = listaNumeri.iterator();
/*  83 */       String numeroContratto = null;
/*  84 */       while (iter.hasNext()) {
/*  85 */         numeroContratto = iter.next();
/*  86 */         map.putAppl("NUMERO_CONTRATTO", numeroContratto);
/*  87 */         nomeModulo = (String)this.moduleCatalog.get("trovaNumero");
/*     */         
/*  89 */         out = getModuleManager().execModule(nomeModulo, map);
/*  90 */         numCont = (FinNumContratti)out.getAppl("NUMERO_CONTRATTO");
/*     */ 
/*     */         
/*  93 */         if (numCont != null) {
/*  94 */           if ("ASS".equals(numCont.getTipoGenerazione()))
/*     */           {
/*  96 */             numCont.setStato("U"); } 
/*     */           continue;
/*     */         } 
/*  99 */         RasServiceException signalator = new RasServiceException();
/* 100 */         RasValidationSignal error = new RasValidationSignal("it.ras.arco.ordine.nuovaSottoscrizione.errori.nuovoNumeroContrattoNonTrovato");
/*     */ 
/*     */ 
/*     */         
/* 104 */         signalator.addError(error);
/* 105 */         throw signalator;
/*     */       } 
/*     */     } else {
/*     */       
/* 109 */       nomeModulo = (String)this.moduleCatalog.get("prenotaNumero");
/*     */ 
/*     */       
/*     */       try {
/* 113 */         map.putAppl("EMITTENTE_ID", new Integer((String)map.getAppl("EMITTENTE_ID")));
/*     */         
/* 115 */         map.putAppl("TIPO_PRODOTTO", map.getAppl("TIPO_PRODOTTO"));
/*     */       
/*     */       }
/* 118 */       catch (Exception e) {}
/*     */ 
/*     */       
/* 121 */       out = getModuleManager().execModule(nomeModulo, map);
/* 122 */       numCont = (FinNumContratti)out.getAppl("NUMERO_CONTRATTO");
/* 123 */       if (numCont != null) {
/* 124 */         if ("ASS".equals(numCont.getTipoGenerazione()))
/*     */         {
/* 126 */           numCont.setStato("P");
/*     */         }
/*     */       } else {
/* 129 */         RasServiceException signalator = new RasServiceException();
/* 130 */         RasValidationSignal error = new RasValidationSignal("it.ras.arco.ordine.nuovaSottoscrizione.errori.nuovoNumeroContrattoNonTrovato");
/*     */ 
/*     */         
/* 133 */         signalator.addError(error);
/* 134 */         throw signalator;
/*     */       } 
/*     */       
/* 137 */       FinNumContratti numContrattoRet = new FinNumContratti();
/* 138 */       numContrattoRet.setEmittente(numCont.getEmittente());
/* 139 */       numContrattoRet.setTipoGenerazione(numCont.getTipoGenerazione());
/* 140 */       if ("ASS".equals(numCont.getTipoGenerazione())) {
/*     */         
/* 142 */         map.putAppl("ENTITA_DA_INSERIRE", numCont);
/* 143 */         nomeModulo = (String)this.moduleCatalog.get("aggiornaStatoNumeroContratto");
/*     */         
/* 145 */         getModuleManager().execModule(nomeModulo, map);
/* 146 */         numContrattoRet.setNumeroContratto(numCont.getNumeroContratto());
/*     */         
/* 148 */         numContrattoRet.setNumContrattiId(numCont.getNumContrattiId());
/* 149 */         numContrattoRet.setDataInserimento(numCont.getDataInserimento());
/*     */         
/* 151 */         numContrattoRet.setOggettoGenerazione(numCont.getOggettoGenerazione());
/*     */         
/* 153 */         numContrattoRet.setUtenteInserimento(numCont.getUtenteInserimento());
/*     */       }
/* 155 */       else if ("SEQ".equals(numCont.getTipoGenerazione())) {
/*     */ 
/*     */         
/* 158 */         nomeModulo = (String)this.moduleCatalog.get("getSequenceNumeroContratto");
/* 159 */         map.putAppl("SEQUENCE_NAME", numCont.getOggettoGenerazione());
/* 160 */         out = getModuleManager().execModule(nomeModulo, map);
/* 161 */         Object seqValue = out.getAppl("SEQUENCE_VALUE");
/* 162 */         if (seqValue instanceof BigDecimal) {
/* 163 */           numContrattoRet.setNumeroContratto(String.valueOf(((BigDecimal)seqValue).intValue()));
/*     */         } else {
/*     */           
/* 166 */           numContrattoRet.setNumeroContratto(seqValue.toString());
/*     */         } 
/*     */         
/* 169 */         if (numContrattoRet != null) {
/*     */           
/* 171 */           String tipoProdotto = (String)map.getAppl("TIPO_PRODOTTO");
/* 172 */           if (tipoProdotto != null && tipoProdotto.equals("GPP") && numContrattoRet.getEmittente().getEmittenteId().intValue() == 14) {
/*     */ 
/*     */             
/* 175 */             String prefisso = (String)map.getAppl("PREFISSO");
/* 176 */             elaboraNumeroContrattoGPP(numContrattoRet, prefisso);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 185 */       String nomeModuloAggiuntivo = numCont.getOggettoGenerazione();
/* 186 */       if (nomeModuloAggiuntivo != null && "ALG".equals(numCont.getTipoGenerazione())) {
/*     */ 
/*     */         
/* 189 */         map.putAppl("NUMERO_CONTRATTO", numContrattoRet);
/* 190 */         out = getModuleManager().execModule(nomeModuloAggiuntivo, map);
/* 191 */         numContrattoRet = (FinNumContratti)out.getAppl("NUMERO_CONTRATTO");
/*     */       } 
/*     */ 
/*     */       
/* 195 */       out.putAppl("NUMERO_CONTRATTO", numContrattoRet);
/*     */     } 
/*     */     
/* 198 */     return out;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map getModuleCatalog() {
/* 205 */     return this.moduleCatalog;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuleCatalog(Map moduleCatalog) {
/* 213 */     this.moduleCatalog = moduleCatalog;
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
/*     */ 
/*     */ 
/*     */   
/*     */   public void elaboraNumeroContrattoGPP(FinNumContratti numContrattoRet, String prefisso) {
/* 244 */     String sequenceContratto = numContrattoRet.getNumeroContratto();
/* 245 */     Integer checkDigit = new Integer(0);
/*     */     
/* 247 */     if (sequenceContratto != null) {
/*     */       
/* 249 */       if (this.log.isWarnEnabled()) {
/* 250 */         this.log.warn("sequenceContratto:" + sequenceContratto);
/*     */       }
/*     */ 
/*     */       
/* 254 */       if (sequenceContratto.length() < 5) {
/* 255 */         sequenceContratto = StringUtils.leftPad(sequenceContratto, 5, "0");
/*     */       
/*     */       }
/* 258 */       else if (this.log.isWarnEnabled()) {
/* 259 */         this.log.warn("La sequence ha una lunghezza maggiore di 5 cifre");
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 265 */       int computazione = 0;
/*     */ 
/*     */       
/*     */       try {
/*     */         int i;
/*     */         
/* 271 */         for (i = sequenceContratto.length() - 1; i >= 0; ) {
/*     */           
/* 273 */           Integer valoreNumerico = new Integer(sequenceContratto.charAt(i) - 48);
/* 274 */           computazione += valoreNumerico.intValue() * 2;
/* 275 */           i--;
/* 276 */           if (i >= 0) {
/* 277 */             valoreNumerico = new Integer(sequenceContratto.charAt(i) - 48);
/* 278 */             computazione += valoreNumerico.intValue();
/* 279 */             i--;
/*     */           } 
/*     */         } 
/*     */         
/* 283 */         if (this.log.isWarnEnabled()) {
/* 284 */           this.log.warn("computazione pre aggiunta prefisso:" + computazione);
/*     */         }
/*     */         
/* 287 */         if (prefisso != null) {
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 292 */           for (i = 0; i < prefisso.length(); i++) {
/* 293 */             computazione += prefisso.charAt(i) - 55;
/*     */           }
/* 295 */           if (this.log.isWarnEnabled()) {
/* 296 */             this.log.warn("prefisso:" + prefisso);
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 301 */         if (this.log.isWarnEnabled()) {
/* 302 */           this.log.warn("computazione post aggiunta prefisso:" + computazione);
/*     */         
/*     */         }
/*     */       }
/* 306 */       catch (Exception e) {}
/*     */ 
/*     */ 
/*     */       
/* 310 */       checkDigit = new Integer(computazione % 10);
/*     */       
/* 312 */       if (this.log.isWarnEnabled()) {
/* 313 */         this.log.warn("checkDigit:" + checkDigit.toString());
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 318 */       String numeroContrattoElaborato = prefisso + sequenceContratto + checkDigit.toString();
/* 319 */       numContrattoRet.setNumeroContratto(numeroContrattoElaborato);
/* 320 */       if (this.log.isWarnEnabled()) {
/* 321 */         this.log.warn("numeroContrattoElaborato:" + numeroContrattoElaborato);
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/* 328 */     else if (this.log.isWarnEnabled()) {
/* 329 */       this.log.warn("Errore sequence!!!");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\service\PrenotaNumeroContrattoService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */