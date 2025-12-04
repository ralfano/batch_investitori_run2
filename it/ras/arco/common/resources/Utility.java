/*      */ package it.ras.arco.common.resources;
/*      */ 
/*      */ import it.ras.arco.bean.FinAbstractParametrizedBean;
/*      */ import it.ras.arco.bean.FinAccorpamento;
/*      */ import it.ras.arco.bean.FinAggregazione;
/*      */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*      */ import it.ras.arco.bean.FinContratto;
/*      */ import it.ras.arco.bean.FinEmittente;
/*      */ import it.ras.arco.bean.FinIndirizzo;
/*      */ import it.ras.arco.bean.FinOrdine;
/*      */ import it.ras.arco.bean.FinProdotto;
/*      */ import it.ras.arco.bean.FinProdottoLinea;
/*      */ import it.ras.arco.bean.FinSoggetto;
/*      */ import it.ras.arco.common.bean.Parametro;
/*      */ import it.ras.flag.ArchBaseUtils;
/*      */ import it.ras.flag.ArchUtils;
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import it.ras.flag.bean.adapter.AdapterUtils;
/*      */ import it.ras.flag.config.rules.IRuleEngine;
/*      */ import it.ras.flag.exception.RasException;
/*      */ import it.ras.flag.exception.RasTransactionException;
/*      */ import it.ras.flag.exception.RasValidationSignal;
/*      */ import it.ras.flag.transaction.IRasRequiredTransaction;
/*      */ import it.ras.flag.transaction.IRasSupportedTransaction;
/*      */ import it.ras.flag.util.MapContainer;
/*      */ import it.ras.flag.util.TextFormatUtils;
/*      */ import java.io.Serializable;
/*      */ import java.math.BigDecimal;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Calendar;
/*      */ import java.util.Date;
/*      */ import java.util.GregorianCalendar;
/*      */ import java.util.HashMap;
/*      */ import java.util.HashSet;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.Set;
/*      */ import org.apache.commons.beanutils.PropertyUtils;
/*      */ import org.apache.commons.logging.Log;
/*      */ import org.apache.commons.logging.LogFactory;
/*      */ import org.springframework.context.ApplicationContext;
/*      */ import org.springframework.web.context.WebApplicationContext;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class Utility
/*      */ {
/*      */   public static final String SETTER_DATA_INSERIMENTO = "setDataInserimento";
/*      */   public static final String SETTER_UTENTE_INSERIMENTO = "setUtenteInserimento";
/*      */   public static final String TRANSAZIONE_RICONNESSIONE_BEAN_A_SESSIONE = "sessionReattachmentTx";
/*      */   public static final String TRANSAZIONE_RELOAD_ENTITY = "reloadEntityTx";
/*      */   public static final long MILLISECONDS_ONE_DAY = 86400000L;
/*      */   public static final String TRANSAZIONE_RICERCA_PARAMETRI = "caricaParametriDiEntitaTx";
/*      */   public static final String ACTION_RULE_CONTROLLO_OBBLIGATORIETA_PARAMETRI = "controlloSeParametroObbligatorio";
/*      */   public static final String KEY_PARAMETRO_NON_TROVATO = "it.ras.arco.common.parametroObbligatorioNonTrovato";
/*      */   private static final String ACTION_RULE_CERCA_VALORE_CAMBIO = "cercaValoreCambio";
/*   68 */   private static Log log = LogFactory.getLog(Utility.class);
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static List emittenteSicav;
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static List emittenteSicavConGestioneProventi;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isDisinvestimento(FinOrdine ordine) {
/*   85 */     if (ordine == null) {
/*   86 */       return false;
/*      */     }
/*   88 */     return ("830".equals(ordine.getTipo()) || "830".equals(ordine.getTipo()) || "850".equals(ordine.getTipo()) || "840".equals(ordine.getTipo()) || "860".equals(ordine.getTipo()) || "870".equals(ordine.getTipo()) || "880".equals(ordine.getTipo()) || "530".equals(ordine.getTipo()) || "330".equals(ordine.getTipo()) || "500".equals(ordine.getTipo()) || "SMN".equals(ordine.getTipo()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isInvestimento(FinOrdine ordine) {
/*  119 */     if (ordine == null) {
/*  120 */       return false;
/*      */     }
/*  122 */     return ("130".equals(ordine.getTipo()) || "130".equals(ordine.getTipo()) || "150".equals(ordine.getTipo()) || "140".equals(ordine.getTipo()) || "160".equals(ordine.getTipo()) || "170".equals(ordine.getTipo()) || "180".equals(ordine.getTipo()) || "102".equals(ordine.getTipo()) || "100".equals(ordine.getTipo()) || "CMN".equals(ordine.getTipo()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double trasformaImportoInQuote(FinOrdine ordine) {
/*  150 */     if (ordine == null) {
/*  151 */       return 0.0D;
/*      */     }
/*  153 */     Double prezzo = null;
/*      */     try {
/*  155 */       prezzo = ordine.getPosizione().getAttivitaFin().getUltPrezzo().getUltPrezzoEuro();
/*      */     }
/*  157 */     catch (Exception e) {
/*  158 */       prezzo = new Double(0.0D);
/*      */     } 
/*      */     
/*  161 */     if (ordine.getImporto() != null) {
/*  162 */       return divideDouble(ordine.getImporto().doubleValue(), prezzo.doubleValue());
/*      */     }
/*      */ 
/*      */     
/*  166 */     return 0.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double trasformaImportoNewInQuote(FinOrdine ordine) {
/*  175 */     if (ordine == null) {
/*  176 */       return 0.0D;
/*      */     }
/*  178 */     Double prezzo = null;
/*      */     try {
/*  180 */       prezzo = ordine.getPosizione().getAttivitaFin().getUltPrezzo().getUltPrezzoEuro();
/*      */     }
/*  182 */     catch (Exception e) {
/*  183 */       prezzo = new Double(0.0D);
/*      */     } 
/*      */     
/*  186 */     if (ordine.getImportoNew() != null) {
/*  187 */       return divideDouble(ordine.getImportoNew().doubleValue(), prezzo.doubleValue());
/*      */     }
/*      */ 
/*      */     
/*  191 */     return 0.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double trasformaQuoteInImporto(FinOrdine ordine) {
/*  200 */     if (ordine == null) {
/*  201 */       return 0.0D;
/*      */     }
/*  203 */     Double prezzo = null;
/*      */     try {
/*  205 */       prezzo = ordine.getPosizione().getAttivitaFin().getUltPrezzo().getUltPrezzoEuro();
/*      */     }
/*  207 */     catch (Exception e) {
/*  208 */       prezzo = new Double(0.0D);
/*      */     } 
/*      */     
/*  211 */     if (ordine.getQuantita() != null) {
/*  212 */       return multiplyDouble(ordine.getQuantita().doubleValue(), prezzo.doubleValue());
/*      */     }
/*      */ 
/*      */     
/*  216 */     return 0.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double trasformaQuoteNewInImporto(FinOrdine ordine) {
/*  225 */     if (ordine == null) {
/*  226 */       return 0.0D;
/*      */     }
/*  228 */     Double prezzo = null;
/*      */     try {
/*  230 */       prezzo = ordine.getPosizione().getAttivitaFin().getUltPrezzo().getUltPrezzoEuro();
/*      */     }
/*  232 */     catch (Exception e) {
/*  233 */       prezzo = new Double(0.0D);
/*      */     } 
/*      */     
/*  236 */     if (ordine.getQuantitaNew() != null) {
/*  237 */       return multiplyDouble(ordine.getQuantitaNew().doubleValue(), prezzo.doubleValue());
/*      */     }
/*      */ 
/*      */     
/*  241 */     return 0.0D;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double calcolaTotaleInQuote(FinOrdine ordine) {
/*  250 */     if (ordine == null) {
/*  251 */       return 0.0D;
/*      */     }
/*  253 */     return sumDouble(trasformaImportoInQuote(ordine), (ordine.getQuantita() != null) ? ordine.getQuantita().doubleValue() : 0.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double calcolaTotaleInImporto(FinOrdine ordine) {
/*  264 */     if (ordine == null) {
/*  265 */       return 0.0D;
/*      */     }
/*  267 */     return sumDouble(trasformaQuoteInImporto(ordine), (ordine.getImporto() != null) ? ordine.getImporto().doubleValue() : 0.0D);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double arrotonda(double d, int nDecimali) {
/*  279 */     BigDecimal bd = new BigDecimal(d);
/*  280 */     bd = bd.setScale(nDecimali, 4);
/*  281 */     return bd.doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean controllaLimiteMinimoImporto(IRuleEngine ruleEngine, FinAbstractParametrizedBean bean, Integer codiceParametroInEuro, Integer codiceParametroInDivisaComp, Double importoDaVerificare) throws LimiteMinimoImportoFailedException, RasException {
/*  311 */     if (bean.esisteParametro(codiceParametroInEuro)) {
/*  312 */       Double limiteMinimo = (Double)bean.estraiTipoNumericoByCodiceParametro(codiceParametroInEuro, 2);
/*      */ 
/*      */ 
/*      */       
/*  316 */       if (limiteMinimo == null) {
/*  317 */         limiteMinimo = new Double(0.0D);
/*      */       }
/*  319 */       if (importoDaVerificare.doubleValue() < limiteMinimo.doubleValue()) {
/*  320 */         LimiteMinimoImportoFailedException e = new LimiteMinimoImportoFailedException();
/*  321 */         e.setErrorType(10);
/*      */         
/*  323 */         e.setLimiteMinimo(limiteMinimo);
/*  324 */         throw e;
/*      */       } 
/*      */     } else {
/*  327 */       Double impMinimoPrimoVerValuta = (Double)bean.estraiTipoNumericoByCodiceParametro(codiceParametroInDivisaComp, 2);
/*      */ 
/*      */ 
/*      */       
/*  331 */       if (impMinimoPrimoVerValuta == null) {
/*  332 */         LimiteMinimoImportoFailedException e = new LimiteMinimoImportoFailedException();
/*  333 */         e.setErrorType(100);
/*      */         
/*  335 */         throw e;
/*      */       } 
/*      */       
/*  338 */       Double importoInValuta = new Double(0.0D);
/*      */       
/*  340 */       if ("EUR".equals(recuperaCodiceDivisaComparto(bean)) || "242".equals(recuperaCodiceDivisaComparto(bean))) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  345 */         importoInValuta = importoDaVerificare;
/*      */       } else {
/*      */         try {
/*  348 */           importoInValuta = convertiImportoInValutaEstera(ruleEngine, recuperaCodiceDivisaComparto(bean), importoDaVerificare);
/*      */         
/*      */         }
/*  351 */         catch (Exception exce) {
/*  352 */           LimiteMinimoImportoFailedException e = new LimiteMinimoImportoFailedException();
/*  353 */           e.setErrorType(100);
/*      */           
/*  355 */           throw e;
/*      */         } 
/*      */         
/*  358 */         if (importoInValuta == null) {
/*  359 */           LimiteMinimoImportoFailedException e = new LimiteMinimoImportoFailedException();
/*  360 */           e.setErrorType(1000);
/*      */           
/*  362 */           throw e;
/*      */         } 
/*      */       } 
/*      */       
/*  366 */       if (importoInValuta.doubleValue() < impMinimoPrimoVerValuta.doubleValue()) {
/*      */         
/*  368 */         LimiteMinimoImportoFailedException e = new LimiteMinimoImportoFailedException();
/*  369 */         e.setErrorType(11);
/*      */         
/*  371 */         e.setLimiteMinimo(impMinimoPrimoVerValuta);
/*  372 */         throw e;
/*      */       } 
/*      */     } 
/*      */     
/*  376 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isMinorenne(FinSoggetto soggetto) {
/*  388 */     if (soggetto == null || soggetto.getDataNascita() == null || "G".equals(soggetto.getTipoSogg()))
/*      */     {
/*      */ 
/*      */       
/*  392 */       return false;
/*      */     }
/*  394 */     GregorianCalendar dataDiNascita = new GregorianCalendar();
/*  395 */     dataDiNascita.setTime(soggetto.getDataNascita());
/*      */     
/*  397 */     dataDiNascita.add(1, 18);
/*      */     
/*  399 */     return (dateDifference(new Date(), dataDiNascita.getTime()) < 0);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static String recuperaCodiceDivisaComparto(FinAbstractParametrizedBean bean) {
/*  408 */     if (bean == null) {
/*  409 */       return null;
/*      */     }
/*  411 */     if (bean instanceof FinAttivitaFinanziaria) {
/*  412 */       return ((FinAttivitaFinanziaria)bean).getDivisaComp();
/*      */     }
/*  414 */     if (bean instanceof FinProdotto) {
/*  415 */       FinProdotto prodotto = (FinProdotto)bean;
/*  416 */       Iterator iter = prodotto.getAttFin().iterator();
/*  417 */       while (iter.hasNext()) {
/*  418 */         FinProdottoLinea pl = iter.next();
/*  419 */         FinAttivitaFinanziaria af = pl.getAttFin();
/*      */         
/*  421 */         if (ArchUtils.isValid(af.getDivisaComp())) {
/*  422 */           return af.getDivisaComp();
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/*  427 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Double convertiImportoInValutaEstera(IRuleEngine ruleEngine, String divisa, Double importo) throws RasException {
/*  440 */     if (!ArchUtils.isValid(divisa)) {
/*  441 */       RasException e = new RasException();
/*  442 */       e.addError(new RasValidationSignal("it.ras.arco.ordine.sottoscrizione"));
/*      */       
/*  444 */       throw e;
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  450 */     if (divisa == null) {
/*  451 */       if (log.isErrorEnabled()) {
/*  452 */         log.error("La divisa di comparto non è valida (null)! Il valore restituito non è stato convertito.");
/*      */       }
/*      */       
/*  455 */       return importo;
/*      */     } 
/*  457 */     if (divisa.equalsIgnoreCase("EUR") || divisa.equalsIgnoreCase("242")) {
/*      */ 
/*      */       
/*  460 */       if (log.isDebugEnabled()) {
/*  461 */         log.debug("Non è necessario effettuare nessuna conversione.");
/*      */       }
/*  463 */       return importo;
/*      */     } 
/*      */     
/*  466 */     List listaParametriActionRule = new ArrayList();
/*  467 */     listaParametriActionRule.add(divisa);
/*  468 */     listaParametriActionRule.add(importo);
/*      */     
/*  470 */     Double importoInValuta = (Double)ruleEngine.executeActionRule("cercaValoreCambio", listaParametriActionRule);
/*      */ 
/*      */     
/*  473 */     if (importoInValuta != null) {
/*  474 */       return importoInValuta;
/*      */     }
/*  476 */     if (log.isErrorEnabled()) {
/*  477 */       log.error("Non ho trovato un importo in valuta estera...");
/*      */     }
/*  479 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RasValidationSignal verificaObbligatorietaParametro(IRuleEngine ruleEngine, FinAbstractParametrizedBean bean, Integer codiceParametro) {
/*  509 */     String tipoProdotto = null;
/*      */     
/*  511 */     if (bean == null || codiceParametro == null) {
/*  512 */       if (log.isErrorEnabled()) {
/*  513 */         log.error("Il bean e/o il codiceParametro passati sono NULL!");
/*      */       }
/*  515 */       return null;
/*      */     } 
/*      */ 
/*      */     
/*  519 */     if (bean.esisteParametro(codiceParametro)) {
/*  520 */       return null;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  525 */     String nomeEntita = null;
/*      */     
/*  527 */     if (bean instanceof FinEmittente) {
/*  528 */       if (log.isInfoEnabled()) {
/*  529 */         log.info("Non posso verificare il tipo del prodotto perchè ho ricevuto un FinEmittente, che ha un set di FinProdotto da cui non so quale prendere.");
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  534 */     else if (bean instanceof FinProdotto) {
/*  535 */       tipoProdotto = ((FinProdotto)bean).getTipo();
/*  536 */       nomeEntita = "al MacroProdotto '" + ((FinProdotto)bean).getDescrizioneS() + "'";
/*      */     
/*      */     }
/*  539 */     else if (bean instanceof FinAttivitaFinanziaria) {
/*  540 */       tipoProdotto = ((FinProdottoLinea)((FinAttivitaFinanziaria)bean).getProdotto().iterator().next()).getProdotto().getTipo();
/*      */ 
/*      */       
/*  543 */       nomeEntita = "al Prodotto '" + ((FinAttivitaFinanziaria)bean).getDescrizione() + "'";
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  549 */     if (tipoProdotto == null) {
/*  550 */       if (log.isErrorEnabled()) {
/*  551 */         log.error("Non ho trovato il tipo del FinProdotto, non posso ricercare un adeguato Parametro.");
/*      */       }
/*      */ 
/*      */       
/*  555 */       return null;
/*      */     } 
/*      */     
/*  558 */     List listaParametriAR = new ArrayList();
/*  559 */     listaParametriAR.add(codiceParametro);
/*  560 */     listaParametriAR.add(tipoProdotto);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  570 */     String descrParametro = (String)ruleEngine.executeActionRule("controlloSeParametroObbligatorio", listaParametriAR);
/*      */ 
/*      */ 
/*      */     
/*  574 */     if (descrParametro != null) {
/*  575 */       RasValidationSignal outValSignal = new RasValidationSignal("it.ras.arco.common.parametroObbligatorioNonTrovato", descrParametro, nomeEntita);
/*      */       
/*  577 */       return outValSignal;
/*      */     } 
/*  579 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object riattaccaBeanAllaSessione(Object bean, WebApplicationContext context, String txName) throws RasTransactionException {
/*  622 */     Log log = LogFactory.getLog(Utility.class);
/*      */     
/*  624 */     if (bean == null && 
/*  625 */       log.isErrorEnabled()) {
/*  626 */       log.error("Il bean è null!");
/*  627 */       return bean;
/*      */     } 
/*      */ 
/*      */     
/*  631 */     Object unknownTx = context.getBean(txName);
/*      */     
/*  633 */     if (log.isDebugEnabled()) {
/*  634 */       log.debug("Ricollegamento alla sessione di un bean di classe ''" + bean.getClass().getName() + " mediante la transazione di re-attachment '" + txName + "' di classe '" + unknownTx.getClass().getName() + "'.");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  639 */     return riattaccaBeanAllaSessione(bean, unknownTx);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object riattaccaBeanAllaSessione(Object bean, Object unknownTx) throws RasTransactionException {
/*  668 */     Log log = LogFactory.getLog(Utility.class);
/*      */     
/*  670 */     if (bean == null && 
/*  671 */       log.isErrorEnabled()) {
/*  672 */       log.error("Il bean è null!");
/*  673 */       return bean;
/*      */     } 
/*      */     
/*  676 */     if (unknownTx == null && 
/*  677 */       log.isErrorEnabled()) {
/*  678 */       log.error("La transaction è null!");
/*  679 */       return bean;
/*      */     } 
/*      */ 
/*      */     
/*  683 */     MapContainer mapForReattachment = new MapContainer();
/*  684 */     mapForReattachment.putAppl("BEAN_TO_BE_REATTACHED", bean);
/*      */     
/*  686 */     if (unknownTx instanceof IRasSupportedTransaction) {
/*  687 */       ((IRasSupportedTransaction)unknownTx).transaction(mapForReattachment);
/*      */     }
/*      */     
/*  690 */     if (unknownTx instanceof IRasRequiredTransaction) {
/*  691 */       ((IRasRequiredTransaction)unknownTx).transaction(mapForReattachment);
/*      */     }
/*      */     
/*  694 */     if (log.isDebugEnabled()) {
/*  695 */       log.debug("Transazione completata con successo");
/*      */     }
/*      */     
/*  698 */     return bean;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object ricaricaEntitaDaDB(Object bean, Serializable id, ApplicationContext context) throws RasTransactionException {
/*  706 */     return ricaricaEntitaDaDB(bean, id, context, "reloadEntityTx");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object ricaricaEntitaDaDB(Object bean, Serializable id, ApplicationContext context, String transactionName) throws RasTransactionException {
/*  715 */     Log log = LogFactory.getLog(Utility.class);
/*      */     
/*  717 */     Object beanReloaded = null;
/*  718 */     Object unknownTx = context.getBean(transactionName);
/*  719 */     if (bean == null && 
/*  720 */       log.isErrorEnabled()) {
/*  721 */       log.error("Il bean è null!");
/*  722 */       return bean;
/*      */     } 
/*      */ 
/*      */     
/*  726 */     if (id == null && 
/*  727 */       log.isErrorEnabled()) {
/*  728 */       log.error("L'ID del bean è null!");
/*  729 */       return bean;
/*      */     } 
/*      */ 
/*      */     
/*  733 */     if (log.isDebugEnabled()) {
/*  734 */       log.debug("Ricaricamento da DB di un bean di classe ''" + bean.getClass().getName() + " mediante la transazione di reload");
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  739 */     MapContainer mapForReattachment = new MapContainer(2);
/*  740 */     MapContainer mapReattached = new MapContainer(2);
/*  741 */     mapForReattachment.putAppl("BEAN_TO_BE_RELOADED", bean);
/*      */     
/*  743 */     mapForReattachment.putAppl("BEAN_TO_BE_RELOADED_ID", id);
/*      */ 
/*      */     
/*  746 */     if (unknownTx instanceof IRasSupportedTransaction) {
/*  747 */       mapReattached = ((IRasSupportedTransaction)unknownTx).transaction(mapForReattachment);
/*      */     }
/*      */ 
/*      */     
/*  751 */     if (unknownTx instanceof IRasRequiredTransaction) {
/*  752 */       mapReattached = ((IRasRequiredTransaction)unknownTx).transaction(mapForReattachment);
/*      */     }
/*      */ 
/*      */     
/*  756 */     if (log.isDebugEnabled()) {
/*  757 */       log.debug("Transazione completata con successo");
/*      */     }
/*      */     
/*  760 */     beanReloaded = mapReattached.getAppl("RELOADED_BEAN");
/*      */ 
/*      */     
/*  763 */     return beanReloaded;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Object riattaccaBeanAllaSessione(Object bean, WebApplicationContext context) throws RasTransactionException {
/*  800 */     return riattaccaBeanAllaSessione(bean, context, "sessionReattachmentTx");
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static FinAbstractParametrizedBean caricaParametri(FinAbstractParametrizedBean bean, ApplicationContext context) throws RasTransactionException {
/*  824 */     IRasSupportedTransaction txPar = (IRasSupportedTransaction)context.getBean("caricaParametriDiEntitaTx");
/*      */     
/*  826 */     MapContainer map = new MapContainer();
/*  827 */     map.putAppl("BEAN_PARAMETRICO", bean);
/*      */     
/*  829 */     MapContainer outmap = txPar.transaction(map);
/*      */     
/*  831 */     FinAbstractParametrizedBean beanPar = (FinAbstractParametrizedBean)outmap.getAppl("BEAN_CON_PARAMETRI");
/*      */ 
/*      */     
/*  834 */     return beanPar;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static List congelaSet(Set set) throws Exception {
/*  848 */     List listaCongelata = new ArrayList();
/*  849 */     for (Iterator iter = set.iterator(); iter.hasNext(); ) {
/*  850 */       RasORMBean bean = iter.next();
/*  851 */       if (bean.getFlagEsistenza() == null || !bean.getFlagEsistenza().equalsIgnoreCase("N"))
/*      */       {
/*  853 */         listaCongelata.add(bean);
/*      */       }
/*      */     } 
/*      */     
/*  857 */     return listaCongelata;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setInsertGSTDvalues(RasORMBean bean, String utente) {
/*  872 */     setAppStdFields(bean, utente);
/*  873 */     ArchBaseUtils.setStdFields(bean, "I", utente);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setInsertGSTDvalues(RasORMBean bean, String utente, String processo) {
/*  889 */     setAppStdFields(bean, utente);
/*  890 */     ArchBaseUtils.setStdFields(bean, "I", processo);
/*      */     
/*      */     try {
/*  893 */       PropertyUtils.setSimpleProperty(bean, "userUltimaModificaSlave", utente);
/*      */       
/*  895 */       PropertyUtils.setSimpleProperty(bean, "dataInserimento", new Date());
/*      */       
/*  897 */       PropertyUtils.setSimpleProperty(bean, "utenteInserimento", utente);
/*  898 */     } catch (Exception e) {
/*  899 */       if (log.isDebugEnabled()) {
/*  900 */         log.debug("Eccezione nel set dei GSTD: " + e.getMessage());
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setUpdateGSTDvalues(RasORMBean bean, String utente, String processo) {
/*  918 */     ArchBaseUtils.setStdFields(bean, "U", processo);
/*      */     
/*      */     try {
/*  921 */       PropertyUtils.setSimpleProperty(bean, "userUltimaModificaSlave", utente);
/*      */     }
/*  923 */     catch (Exception e) {
/*  924 */       if (log.isDebugEnabled()) {
/*  925 */         log.debug("Eccezione nel set dei GSTD: " + e.getMessage());
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setUpdateGSTDvalues(RasORMBean bean, String utente) {
/*  937 */     ArchBaseUtils.setStdFields(bean, "U", utente);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void setDeleteGSTDvalues(RasORMBean bean, String utente) {
/*  949 */     ArchBaseUtils.setStdFields(bean, "D", utente);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void setAppStdFields(RasORMBean bean, String utente) {
/*  961 */     Log logBean = LogFactory.getLog(bean.getClass());
/*      */     try {
/*  963 */       PropertyUtils.setSimpleProperty(bean, "dataInserimento", Calendar.getInstance().getTime());
/*      */       
/*  965 */       if (utente != null) {
/*  966 */         if (utente.length() > 40) {
/*  967 */           utente = utente.substring(0, 40);
/*      */         }
/*      */       } else {
/*  970 */         utente = "TBD";
/*      */       } 
/*  972 */       PropertyUtils.setSimpleProperty(bean, "utenteInserimento", utente);
/*  973 */     } catch (Exception e) {
/*  974 */       if (logBean.isErrorEnabled()) {
/*  975 */         logBean.error("Eccezione nel set dei campi standard: " + e.getMessage());
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Date sommaGiorniAData(Date data, Integer numeroGiorniToSum) {
/*  989 */     if (data != null && numeroGiorniToSum != null) {
/*      */       
/*  991 */       Calendar oCal = new GregorianCalendar();
/*  992 */       oCal.setTime(data);
/*  993 */       oCal.add(5, numeroGiorniToSum.intValue());
/*  994 */       return oCal.getTime();
/*      */     } 
/*      */     
/*  997 */     return data;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final Date getDataInfinito() {
/* 1006 */     Calendar infinito = Calendar.getInstance();
/* 1007 */     infinito.set(1, 9999);
/* 1008 */     infinito.set(2, 11);
/* 1009 */     infinito.set(5, 31);
/* 1010 */     infinito.set(11, 0);
/* 1011 */     infinito.set(12, 0);
/* 1012 */     infinito.set(13, 0);
/* 1013 */     infinito.set(14, 0);
/* 1014 */     return infinito.getTime();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isSameDay(Date data1, Date data2) {
/* 1030 */     GregorianCalendar gc1 = new GregorianCalendar();
/* 1031 */     gc1.setTime(data1);
/*      */     
/* 1033 */     GregorianCalendar gc2 = new GregorianCalendar();
/* 1034 */     gc2.setTime(data2);
/*      */     
/* 1036 */     if (gc2.get(1) == gc1.get(1) && 
/* 1037 */       gc2.get(2) == gc1.get(2))
/*      */     {
/* 1039 */       return (gc2.get(5) == gc1.get(5));
/*      */     }
/*      */ 
/*      */     
/* 1043 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Calendar getGGMMYYDate(Date date) {
/* 1052 */     Calendar c = new GregorianCalendar();
/* 1053 */     c.set(5, date.getDay());
/* 1054 */     c.set(2, date.getMonth());
/* 1055 */     c.set(1, date.getYear());
/* 1056 */     return c;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int dateDifference(Date oDate1, Date oDate2) {
/* 1068 */     Calendar oCalendar1 = newDateCalendar(oDate1);
/* 1069 */     Calendar oCalendar2 = newDateCalendar(oDate2);
/*      */ 
/*      */     
/* 1072 */     BigDecimal diffMs = new BigDecimal((oCalendar1.getTime().getTime() - oCalendar2.getTime().getTime()));
/*      */ 
/*      */ 
/*      */     
/* 1076 */     BigDecimal msOneDay = new BigDecimal(8.64E7D);
/* 1077 */     BigDecimal div = diffMs.divide(msOneDay, 7, 4);
/*      */     
/* 1079 */     int result = arithmeticRound(div, 0).intValue();
/*      */     
/* 1081 */     return result;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Calendar newDateCalendar(Date oDate) {
/* 1092 */     Calendar oCal = new GregorianCalendar();
/*      */     
/* 1094 */     if (oDate != null) {
/* 1095 */       oCal.setTime(oDate);
/*      */     }
/*      */ 
/*      */     
/* 1099 */     oCal.set(11, 0);
/* 1100 */     oCal.set(12, 0);
/* 1101 */     oCal.set(13, 0);
/* 1102 */     oCal.set(14, 0);
/*      */     
/* 1104 */     return oCal;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static BigDecimal arithmeticRound(BigDecimal bdValue, int iCifreDecimaliResult) {
/* 1120 */     bdValue = bdValue.setScale(iCifreDecimaliResult, 4);
/*      */ 
/*      */     
/* 1123 */     return bdValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static RasORMBean getUltimoValido(Set container, String propertyDaControllare, Object costantePerIlParagone, boolean propertyIsDate) {
/* 1153 */     RasORMBean adapterBaseValido = null;
/*      */     
/* 1155 */     RasORMBean adapterBaseCurrent = null;
/*      */     
/* 1157 */     if (container != null) {
/*      */       
/* 1159 */       Iterator containerIterator = container.iterator();
/*      */       
/* 1161 */       while (containerIterator.hasNext()) {
/* 1162 */         adapterBaseCurrent = containerIterator.next();
/*      */         
/* 1164 */         Object propertyValue = null;
/*      */ 
/*      */         
/*      */         try {
/* 1168 */           propertyValue = PropertyUtils.getSimpleProperty(adapterBaseCurrent, propertyDaControllare);
/*      */ 
/*      */           
/* 1171 */           if (propertyValue == null) {
/* 1172 */             LogFactory.getLog(Utility.class).debug("MO: Trovato il getter get" + propertyDaControllare + " nella classe " + adapterBaseCurrent.getClass().getName() + ", ma valore tornato NULL!!");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */             
/* 1183 */             if (propertyIsDate) {
/* 1184 */               propertyValue = costantePerIlParagone;
/*      */             }
/*      */           } 
/* 1187 */         } catch (Exception e) {
/* 1188 */           LogFactory.getLog(Utility.class).error("MO: Errore: " + e.getClass().getName() + " - " + e.getMessage());
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1204 */         if (propertyIsDate) {
/*      */ 
/*      */ 
/*      */           
/* 1208 */           if (propertyValue == null || ((Date)propertyValue).after(new Date()))
/*      */           {
/* 1210 */             adapterBaseValido = adapterBaseCurrent; } 
/*      */           continue;
/*      */         } 
/* 1213 */         if (costantePerIlParagone.equals(propertyValue)) {
/* 1214 */           adapterBaseValido = adapterBaseCurrent;
/*      */         }
/*      */       } 
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1230 */     return adapterBaseValido;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Set hashMapToSet(HashMap hashMap) {
/* 1247 */     Set returnValue = new HashSet();
/*      */     
/* 1249 */     Iterator keyIterator = hashMap.keySet().iterator();
/*      */     
/* 1251 */     while (keyIterator.hasNext()) {
/* 1252 */       Object currentObject = hashMap.get(keyIterator.next());
/* 1253 */       returnValue.add(currentObject);
/*      */     } 
/*      */     
/* 1256 */     return returnValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String getUtenteGstd(Class clazz) {
/* 1265 */     return clazz.getName().substring(clazz.getName().lastIndexOf('.') + 1);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double sumDouble(double a, double b) {
/* 1276 */     BigDecimal importoPrima = new BigDecimal("" + a);
/* 1277 */     BigDecimal importoDopo = new BigDecimal("" + b);
/*      */     
/* 1279 */     BigDecimal importoFinale = importoPrima.add(importoDopo);
/*      */     
/* 1281 */     return importoFinale.doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double subtractDouble(double a, double b) {
/* 1292 */     BigDecimal importoPrima = new BigDecimal("" + a);
/* 1293 */     BigDecimal importoDopo = new BigDecimal("" + b);
/*      */     
/* 1295 */     BigDecimal importoFinale = importoPrima.subtract(importoDopo);
/*      */     
/* 1297 */     return importoFinale.doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double absDouble(double a) {
/* 1307 */     BigDecimal importoPrima = new BigDecimal("" + a);
/*      */     
/* 1309 */     BigDecimal importoFinale = importoPrima.abs();
/*      */     
/* 1311 */     return importoFinale.doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double divideDouble(double a, double b) {
/* 1322 */     BigDecimal importoPrima = new BigDecimal("" + a);
/* 1323 */     BigDecimal importoDopo = new BigDecimal("" + b);
/*      */     
/* 1325 */     BigDecimal importoFinale = importoPrima.divide(importoDopo, 50, 4);
/*      */ 
/*      */     
/* 1328 */     return importoFinale.doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean sonoMultipli(double a, double b) {
/* 1340 */     if (a == 0.0D || b == 0.0D) {
/* 1341 */       return false;
/*      */     }
/* 1343 */     double div = a / b;
/* 1344 */     double divRound = Math.round(a / b);
/* 1345 */     if (div == divRound) {
/* 1346 */       return true;
/*      */     }
/* 1348 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static double multiplyDouble(double a, double b) {
/* 1359 */     BigDecimal importoPrima = new BigDecimal("" + a);
/* 1360 */     BigDecimal importoDopo = new BigDecimal("" + b);
/*      */     
/* 1362 */     BigDecimal importoFinale = importoPrima.multiply(importoDopo);
/*      */     
/* 1364 */     return importoFinale.doubleValue();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static int compareDouble(double a, double b) {
/* 1374 */     BigDecimal importoA = new BigDecimal("" + a);
/* 1375 */     BigDecimal importoB = new BigDecimal("" + b);
/*      */     
/* 1377 */     return importoA.compareTo(importoB);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void parameterListTrim(List parametriRicerca) {
/* 1392 */     Iterator parametriRicercaIterator = parametriRicerca.iterator();
/*      */     
/* 1394 */     while (parametriRicercaIterator.hasNext()) {
/* 1395 */       Parametro currentParametro = parametriRicercaIterator.next();
/*      */ 
/*      */       
/* 1398 */       if (currentParametro.isActive()) {
/* 1399 */         List currentParametroValueList = currentParametro.getValori();
/*      */         
/* 1401 */         for (int i = 0; i < currentParametroValueList.size(); i++) {
/* 1402 */           Object currentValueElement = currentParametroValueList.get(i);
/*      */ 
/*      */           
/* 1405 */           if (currentValueElement instanceof String)
/*      */           {
/* 1407 */             currentParametroValueList.set(i, ((String)currentValueElement).trim());
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static Date stringToDate(String stringDate) {
/* 1428 */     Date returnValue = null;
/*      */     
/* 1430 */     AdapterUtils utils = AdapterUtils.getInstance();
/*      */     
/* 1432 */     if (!"".equals(stringDate)) {
/*      */ 
/*      */       
/*      */       try {
/*      */ 
/*      */         
/* 1438 */         returnValue = TextFormatUtils.stringToDate(utils.getLocale(), stringDate, "dd/MM/yyyy");
/*      */       
/*      */       }
/* 1441 */       catch (Exception e) {
/* 1442 */         returnValue = null;
/*      */       } 
/*      */     } else {
/* 1445 */       returnValue = null;
/*      */     } 
/*      */     
/* 1448 */     return returnValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String dateToString(Date date) {
/*      */     String returnValue;
/* 1464 */     AdapterUtils utils = AdapterUtils.getInstance();
/*      */     
/* 1466 */     if (date != null) {
/* 1467 */       returnValue = TextFormatUtils.dateToString(utils.getLocale(), date, "dd/MM/yyyy");
/*      */     } else {
/*      */       
/* 1470 */       returnValue = "";
/*      */     } 
/* 1472 */     return returnValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final boolean isOrdineVuoto(FinOrdine o) {
/* 1485 */     boolean isRimborsoFondiGp = (("530".equals(o.getCausale()) || "500".equals(o.getCausale())) && (isFondi(o.getPosizione().getContratto().getTipoProdotto()) || isFondiMultipli(o.getPosizione().getContratto().getTipoProdotto()) || isGp(o.getPosizione().getContratto().getTipoProdotto())));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1492 */     Double importo = isRimborsoFondiGp ? o.getImportoNew() : o.getImporto();
/* 1493 */     Double quantita = isRimborsoFondiGp ? o.getQuantitaNew() : o.getQuantita();
/*      */ 
/*      */ 
/*      */     
/* 1497 */     return ((importo == null || importo.doubleValue() <= 0.0D) && (quantita == null || quantita.doubleValue() <= 0.0D) && (o.getPercentuale() == null || o.getPercentuale().doubleValue() <= 0.0D) && (!ArchUtils.isValid(o.getFlagImportoDaDefinire()) || "N".equals(o.getFlagImportoDaDefinire())) && (!ArchUtils.isValid(o.getFlagImportoTot()) || "N".equals(o.getFlagImportoTot())));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final boolean isOrdineVuotoFdfRam(FinOrdine ordine) {
/* 1508 */     return (14 == ordine.getPosizione().getContratto().getProdotto().getEmittente().getEmittenteId().intValue() && isFondiMultipli(ordine.getPosizione().getContratto().getTipoProdotto()) && isOrdineVuoto(ordine));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final boolean isOrdineDaRimuovere(FinOrdine ordineX) {
/* 1525 */     boolean isOrdineVuoto = isOrdineVuotoFdfRam(ordineX);
/* 1526 */     boolean isPrimaSottoscrizione = "100".equals(ordineX.getCausale());
/*      */     
/* 1528 */     boolean isPassaggioVersoNuovo = (("130".equals(ordineX.getCausale()) || "150".equals(ordineX.getCausale()) || "140".equals(ordineX.getCausale())) && "a".equals(ordineX.getPosizione().getContratto().getStatoContratto()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1543 */     boolean isOrdineFittizio = "000".equals(ordineX.getTipo());
/*      */ 
/*      */     
/* 1546 */     boolean toBeRemoved = (isOrdineVuoto && !isPrimaSottoscrizione && !isPassaggioVersoNuovo && !isOrdineFittizio);
/*      */ 
/*      */     
/* 1549 */     if (log.isDebugEnabled()) {
/* 1550 */       log.debug("ordineX=" + ordineX.getOrdineId() + " - toBeRemoved=" + toBeRemoved);
/*      */     }
/*      */ 
/*      */     
/* 1554 */     return toBeRemoved;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isOrdineRimborsoSicav(FinOrdine ordine) {
/* 1561 */     boolean ordineDiRimborsoSicav = false;
/* 1562 */     if (ordine != null) {
/*      */       try {
/* 1564 */         boolean ordineDiRimborso = ("530".equals(ordine.getTipo()) || "500".equals(ordine.getTipo()) || "530".equals(ordine.getCausale()) || "500".equals(ordine.getCausale()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1572 */         if (ordineDiRimborso) {
/* 1573 */           ordineDiRimborsoSicav = "CS".equals(ordine.getPosizione().getContratto().getProdotto().getTipo());
/*      */         }
/*      */       }
/* 1576 */       catch (Exception e) {
/* 1577 */         ordineDiRimborsoSicav = false;
/*      */       } 
/*      */     }
/* 1580 */     return ordineDiRimborsoSicav;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static List createListaDiviseRidotta() {
/* 1592 */     List returnValue = new ArrayList();
/*      */     
/* 1594 */     Divisa euro = new Divisa("242", "EUR");
/* 1595 */     Divisa usd = new Divisa("001", "USD");
/* 1596 */     Divisa gbp = new Divisa("002", "GBP");
/* 1597 */     Divisa yen = new Divisa("071", "YEN");
/*      */     
/* 1599 */     returnValue.add(euro);
/* 1600 */     returnValue.add(gbp);
/* 1601 */     returnValue.add(usd);
/* 1602 */     returnValue.add(yen);
/*      */     
/* 1604 */     return returnValue;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static class Divisa
/*      */   {
/*      */     private String value;
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     private String description;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getDescription() {
/* 1626 */       return this.description;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setDescription(String description) {
/* 1634 */       this.description = description;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public String getValue() {
/* 1641 */       return this.value;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     public void setValue(String value) {
/* 1649 */       this.value = value;
/*      */     }
/*      */     
/*      */     public Divisa(String value, String description) {
/* 1653 */       this.value = value;
/* 1654 */       this.description = description;
/*      */     }
/*      */   }
/*      */ 
/*      */   
/*      */   public static final boolean isGp(String tipoProdotto) {
/* 1660 */     return ("GP".equals(tipoProdotto) || "GPF".equals(tipoProdotto) || "GPM".equals(tipoProdotto) || "GMM".equals(tipoProdotto) || "GPP".equals(tipoProdotto));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static final boolean isFondi(String tipoProdotto) {
/* 1666 */     return ("FN".equals(tipoProdotto) || "FNF".equals(tipoProdotto) || "FNX".equals(tipoProdotto) || "FNS".equals(tipoProdotto));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final boolean isFondiMultipli(String tipoProdotto) {
/* 1675 */     return ("FNF".equals(tipoProdotto) || "FNX".equals(tipoProdotto));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static final boolean isSicav(String tipoProdotto) {
/* 1682 */     return "CS".equals(tipoProdotto);
/*      */   }
/*      */   
/*      */   public static final boolean isAltriProdotti(String tipoProdotto) {
/* 1686 */     return "AL".equals(tipoProdotto);
/*      */   }
/*      */ 
/*      */   
/*      */   public static final boolean isDossierTitoli(String tipoProdotto) {
/* 1691 */     return "DT".equals(tipoProdotto);
/*      */   }
/*      */ 
/*      */   
/*      */   public static final boolean isAssicurativo(String tipoProdotto) {
/* 1696 */     return ("FT".equals(tipoProdotto) || "FX".equals(tipoProdotto) || "FU".equals(tipoProdotto));
/*      */   }
/*      */ 
/*      */   
/*      */   public static final boolean isBanca(String tipoProdotto) {
/* 1701 */     return ("CC".equals(tipoProdotto) || "DT".equals(tipoProdotto));
/*      */   }
/*      */   
/*      */   public static final boolean isRam(FinContratto contratto) {
/* 1705 */     FinEmittente emittente = contratto.getProdotto().getEmittente();
/*      */ 
/*      */     
/* 1708 */     if (emittente.getEmittenteId().intValue() == (new Integer(14)).intValue())
/*      */     {
/* 1710 */       return true;
/*      */     }
/* 1712 */     return false;
/*      */   }
/*      */ 
/*      */   
/*      */   public static final boolean isGpRam(FinContratto contratto) {
/* 1717 */     FinEmittente emittente = contratto.getProdotto().getEmittente();
/*      */ 
/*      */     
/* 1720 */     if (emittente.getEmittenteId().intValue() == (new Integer(30)).intValue())
/*      */     {
/* 1722 */       return true;
/*      */     }
/* 1724 */     return false;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isIndirizzoInputed(FinIndirizzo indirizzo) {
/* 1735 */     if (indirizzo == null) {
/* 1736 */       return false;
/*      */     }
/* 1738 */     return (ArchUtils.isValid(indirizzo.getIndirizzo()) && ArchUtils.isValid(indirizzo.getComune()) && ArchUtils.isValid(indirizzo.getProv()) && ArchUtils.isValid(indirizzo.getCap()) && ArchUtils.isValid(indirizzo.getNazione()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void setListaEmittentiSicav() {
/* 1751 */     emittenteSicav = new ArrayList();
/* 1752 */     emittenteSicav.add(new Integer(6));
/* 1753 */     emittenteSicav.add(new Integer(7));
/* 1754 */     emittenteSicav.add(new Integer(8));
/* 1755 */     emittenteSicav.add(new Integer(9));
/* 1756 */     emittenteSicav.add(new Integer(10));
/* 1757 */     emittenteSicav.add(new Integer(23));
/* 1758 */     emittenteSicav.add(new Integer(11));
/* 1759 */     emittenteSicav.add(new Integer(12));
/*      */     
/* 1761 */     emittenteSicav.add(new Integer(13));
/* 1762 */     emittenteSicav.add(new Integer(90));
/* 1763 */     emittenteSicav.add(new Integer(89));
/* 1764 */     emittenteSicav.add(new Integer(649));
/*      */   }
/*      */ 
/*      */   
/*      */   public static boolean isEmittenteSicav(int emittenteId) {
/* 1769 */     setListaEmittentiSicav();
/*      */     
/* 1771 */     if (emittenteSicav.contains(new Integer(emittenteId))) {
/* 1772 */       return true;
/*      */     }
/* 1774 */     return false;
/*      */   }
/*      */   
/*      */   public static List getListaEmittenteSicav() {
/* 1778 */     setListaEmittentiSicav();
/* 1779 */     return emittenteSicav;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private static void setListaEmittentiSicavConGestioneProventi() {
/* 1787 */     emittenteSicavConGestioneProventi = new ArrayList();
/* 1788 */     emittenteSicavConGestioneProventi.add(new Integer(89));
/*      */   }
/*      */   
/*      */   public static boolean isEmittenteSicavConGestioneProventi(int emittenteId) {
/* 1792 */     setListaEmittentiSicavConGestioneProventi();
/*      */     
/* 1794 */     if (emittenteSicavConGestioneProventi.contains(new Integer(emittenteId)))
/*      */     {
/* 1796 */       return true;
/*      */     }
/* 1798 */     return false;
/*      */   }
/*      */   
/*      */   public static List getListaEmittenteSicavConGestioneProventi() {
/* 1802 */     setListaEmittentiSicavConGestioneProventi();
/* 1803 */     return emittenteSicavConGestioneProventi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isEmittenteAltreSicav(int emittenteId) {
/* 1810 */     if (emittenteId == 6) {
/* 1811 */       return false;
/*      */     }
/* 1813 */     return isEmittenteSicav(emittenteId);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static boolean isModalitaFabbricaConInvio(FinProdotto prodotto) {
/* 1824 */     boolean modalita = false;
/* 1825 */     if (prodotto != null) {
/* 1826 */       FinAccorpamento accorpamento = prodotto.getAccorpamento();
/* 1827 */       if (accorpamento != null) {
/* 1828 */         FinAggregazione aggregazione = accorpamento.getAggregazione();
/* 1829 */         if (aggregazione != null && (
/* 1830 */           "A".equals(aggregazione.getTipoAggFabbrica()) || ("M".equals(aggregazione.getTipoAggFabbrica()) && "S".equals(aggregazione.getFeedback()))))
/*      */         {
/*      */           
/* 1833 */           modalita = true;
/*      */         }
/*      */       } 
/*      */     } 
/*      */     
/* 1838 */     return modalita;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\resources\Utility.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */