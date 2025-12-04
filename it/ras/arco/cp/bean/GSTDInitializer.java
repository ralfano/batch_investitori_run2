/*     */ package it.ras.arco.cp.bean;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinEmittente;
/*     */ import it.ras.arco.bean.FinEntitaParametro;
/*     */ import it.ras.arco.bean.FinPrezzo;
/*     */ import it.ras.arco.bean.FinProdotto;
/*     */ import it.ras.arco.bean.FinProdottoLinea;
/*     */ import it.ras.arco.bean.FinUltPrezzo;
/*     */ import it.ras.arco.bean.IGSTDInitVisitor;
/*     */ import it.ras.flag.ArchBaseUtils;
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.beanutils.PropertyUtils;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class GSTDInitializer
/*     */   implements IGSTDInitVisitor
/*     */ {
/*     */   public static final String INSERT = "INSERT";
/*     */   public static final String UPDATE = "UPDATE";
/*     */   public static final String DELETE = "DELETE";
/*  52 */   private static Log logger = LogFactory.getLog(GSTDInitializer.class);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(RasORMBean bean, String modalita) {
/*  59 */     if (bean instanceof FinEmittente) {
/*     */       
/*  61 */       setGSTDValues((FinEmittente)bean, modalita);
/*     */     
/*     */     }
/*  64 */     else if (bean instanceof FinProdotto) {
/*     */       
/*  66 */       setGSTDValues((FinProdotto)bean, modalita);
/*     */     
/*     */     }
/*  69 */     else if (bean instanceof FinProdottoLinea) {
/*     */       
/*  71 */       setGSTDValues((FinProdottoLinea)bean, modalita);
/*     */     
/*     */     }
/*  74 */     else if (bean instanceof FinAttivitaFinanziaria) {
/*     */       
/*  76 */       setGSTDValues((FinAttivitaFinanziaria)bean, modalita);
/*     */     
/*     */     }
/*  79 */     else if (bean instanceof FinEntitaParametro) {
/*     */       
/*  81 */       setGSTDValues((FinEntitaParametro)bean, modalita);
/*     */     
/*     */     }
/*  84 */     else if (bean instanceof FinPrezzo) {
/*     */       
/*  86 */       setGSTDValues((FinPrezzo)bean, modalita);
/*     */     
/*     */     }
/*  89 */     else if (bean instanceof FinUltPrezzo) {
/*     */       
/*  91 */       setGSTDValues((FinUltPrezzo)bean, modalita);
/*     */ 
/*     */     
/*     */     }
/*  95 */     else if (logger.isErrorEnabled()) {
/*  96 */       logger.error("Non ho ricevuto un bean di quelli riconosciuti: FinEmittente, FinProdotto, FinProdottoLinea, FinAttivitaFinanziaria, FinEntitaParamentro, FinPrezzo e FinUltPrezzo");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(FinEmittente emittente, String modalita) {
/* 108 */     if (modalita.equals("INSERT")) {
/*     */       
/* 110 */       ArchBaseUtils.setStdFields(emittente, "I", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 115 */       emittente.setDataInserimento(new Date());
/* 116 */       emittente.setUtenteInserimento("CatalogoProdotto");
/*     */ 
/*     */       
/* 119 */       emittente.setFlgInterna("N");
/*     */     
/*     */     }
/* 122 */     else if (modalita.equals("UPDATE")) {
/*     */       
/* 124 */       ArchBaseUtils.setStdFields(emittente, "U", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 129 */     else if (logger.isWarnEnabled()) {
/* 130 */       logger.warn("Non è stata specificata la modalita (insert o update)!");
/*     */     } 
/*     */ 
/*     */     
/* 134 */     if (logger.isDebugEnabled()) {
/* 135 */       logger.debug("Ho settato i parametri architetturali di " + modalita + " x un FinEMITTENTE!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(FinProdotto prodotto, String modalita) {
/* 144 */     if (modalita.equals("INSERT")) {
/*     */       
/* 146 */       ArchBaseUtils.setStdFields(prodotto, "I", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 151 */       prodotto.setDataInserimento(new Date());
/* 152 */       prodotto.setUtenteInserimento("CatalogoProdotto");
/*     */     
/*     */     }
/* 155 */     else if (modalita.equals("UPDATE")) {
/*     */       
/* 157 */       ArchBaseUtils.setStdFields(prodotto, "U", "Catalogo Prodotto");
/*     */ 
/*     */     
/*     */     }
/* 161 */     else if (modalita.equals("DELETE")) {
/*     */       
/* 163 */       ArchBaseUtils.setStdFields(prodotto, "D", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 168 */     else if (logger.isWarnEnabled()) {
/* 169 */       logger.warn("Non è stata specificata la modalita (insert, update o delete)!");
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     if (logger.isDebugEnabled()) {
/* 179 */       logger.debug("Ho settato i parametri architetturali di " + modalita + " x un FinPRODOTTO!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(FinProdottoLinea prodottoLinea, String modalita) {
/* 188 */     if (modalita.equals("INSERT")) {
/*     */       
/* 190 */       ArchBaseUtils.setStdFields(prodottoLinea, "I", "Catalogo Prodotto");
/*     */ 
/*     */       
/* 193 */       prodottoLinea.setDataInizio(new Date());
/*     */ 
/*     */ 
/*     */       
/* 197 */       prodottoLinea.setDataInserimento(new Date());
/* 198 */       prodottoLinea.setUtenteInserimento("CatalogoProdotto");
/*     */     
/*     */     }
/* 201 */     else if (modalita.equals("UPDATE")) {
/*     */       
/* 203 */       ArchBaseUtils.setStdFields(prodottoLinea, "U", "Catalogo Prodotto");
/*     */ 
/*     */     
/*     */     }
/* 207 */     else if (modalita.equals("DELETE")) {
/*     */       
/* 209 */       ArchBaseUtils.setStdFields(prodottoLinea, "D", "Catalogo Prodotto");
/*     */ 
/*     */       
/* 212 */       prodottoLinea.setDataFine(new Date());
/*     */ 
/*     */     
/*     */     }
/* 216 */     else if (logger.isWarnEnabled()) {
/* 217 */       logger.warn("Non è stata specificata la modalita (insert, update o delete)!");
/*     */     } 
/*     */ 
/*     */     
/* 221 */     if (logger.isWarnEnabled()) {
/* 222 */       logger.warn("Ho settato i parametri architetturali di " + modalita + " x un FinPRODOTTOLINEA!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(FinAttivitaFinanziaria attFin, String modalita) {
/* 231 */     if (modalita.equals("INSERT")) {
/*     */       
/* 233 */       ArchBaseUtils.setStdFields(attFin, "I", "Catalogo Prodotto");
/*     */ 
/*     */       
/* 236 */       attFin.setDataInizio(new Date());
/*     */ 
/*     */ 
/*     */       
/* 240 */       attFin.setDataInserimento(new Date());
/* 241 */       attFin.setUtenteInserimento("CatalogoProdotto");
/*     */     
/*     */     }
/* 244 */     else if (modalita.equals("UPDATE")) {
/*     */       
/* 246 */       ArchBaseUtils.setStdFields(attFin, "U", "Catalogo Prodotto");
/*     */     
/*     */     }
/* 249 */     else if (modalita.equals("DELETE")) {
/*     */       
/* 251 */       ArchBaseUtils.setStdFields(attFin, "D", "Catalogo Prodotto");
/*     */ 
/*     */     
/*     */     }
/* 255 */     else if (logger.isWarnEnabled()) {
/* 256 */       logger.warn("Non è stata specificata la modalita (insert, update o delete)!");
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 261 */     FinUltPrezzo ultPrezzo = null;
/* 262 */     if ((ultPrezzo = attFin.getUltPrezzo()) != null)
/*     */     {
/* 264 */       setGSTDValues(ultPrezzo, "INSERT");
/*     */     }
/*     */     
/* 267 */     if (logger.isDebugEnabled()) {
/* 268 */       logger.debug("Ho settato i parametri architetturali di " + modalita + " x un FinATTIVITAFINANZIARIA!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(FinEntitaParametro parametro, String modalita) {
/* 277 */     if (modalita.equals("INSERT")) {
/*     */       
/* 279 */       ArchBaseUtils.setStdFields(parametro, "I", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */       
/* 283 */       parametro.setDataInserimento(new Date());
/* 284 */       parametro.setUtenteInserimento("CatalogoProdotto");
/*     */     
/*     */     }
/* 287 */     else if (modalita.equals("UPDATE")) {
/*     */       
/* 289 */       ArchBaseUtils.setStdFields(parametro, "U", "Catalogo Prodotto");
/*     */ 
/*     */     
/*     */     }
/* 293 */     else if (modalita.equals("DELETE")) {
/*     */       
/* 295 */       ArchBaseUtils.setStdFields(parametro, "D", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 300 */     else if (logger.isWarnEnabled()) {
/* 301 */       logger.warn("Non è stata specificata la modalita (insert, delete o update)!");
/*     */     } 
/*     */ 
/*     */     
/* 305 */     if (logger.isDebugEnabled()) {
/* 306 */       logger.debug("Ho settato i parametri architetturali di " + modalita + " x un FinENTITAPARAMETRO!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(FinPrezzo prezzo, String modalita) {
/* 315 */     if (modalita.equals("INSERT")) {
/*     */       
/* 317 */       ArchBaseUtils.setStdFields(prezzo, "I", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */       
/* 321 */       prezzo.setDataInserimento(new Date());
/* 322 */       prezzo.setUtenteInserimento("CatalogoProdotto");
/*     */     
/*     */     }
/* 325 */     else if (modalita.equals("UPDATE")) {
/*     */       
/* 327 */       ArchBaseUtils.setStdFields(prezzo, "U", "Catalogo Prodotto");
/*     */ 
/*     */     
/*     */     }
/* 331 */     else if (modalita.equals("DELETE")) {
/*     */       
/* 333 */       ArchBaseUtils.setStdFields(prezzo, "D", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 338 */     else if (logger.isWarnEnabled()) {
/* 339 */       logger.warn("Non è stata specificata la modalita (insert, delete o update)!");
/*     */     } 
/*     */ 
/*     */     
/* 343 */     if (logger.isDebugEnabled()) {
/* 344 */       logger.debug("Ho settato i parametri architetturali di " + modalita + " x un FinPREZZO!");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setGSTDValues(FinUltPrezzo ultimoPrezzo, String modalita) {
/* 353 */     if (modalita.equals("INSERT")) {
/*     */       
/* 355 */       ArchBaseUtils.setStdFields(ultimoPrezzo, "I", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 360 */       ultimoPrezzo.setDataInserimento(new Date());
/* 361 */       ultimoPrezzo.setUtenteInserimento("CatalogoProdotto");
/*     */     
/*     */     }
/* 364 */     else if (modalita.equals("UPDATE")) {
/*     */       
/* 366 */       ArchBaseUtils.setStdFields(ultimoPrezzo, "U", "Catalogo Prodotto");
/*     */ 
/*     */     
/*     */     }
/* 370 */     else if (modalita.equals("DELETE")) {
/*     */       
/* 372 */       ArchBaseUtils.setStdFields(ultimoPrezzo, "D", "Catalogo Prodotto");
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 377 */     else if (logger.isWarnEnabled()) {
/* 378 */       logger.warn("Non è stata specificata la modalita (insert, delete o update)!");
/*     */     } 
/*     */ 
/*     */     
/* 382 */     if (logger.isDebugEnabled()) {
/* 383 */       logger.debug("Ho settato i parametri architetturali di " + modalita + " x un FinULTIMOPREZZO!");
/*     */     }
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
/* 395 */   private String utenteUltimaOperazione = "CATALOGO PRODOTTI";
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
/*     */   private boolean initializingNotSlave = false;
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
/*     */   public void visit(RasORMBean bean) {
/* 418 */     boolean inizializzatoComeInserimento = false;
/* 419 */     boolean inizializzatoComeCancellazione = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 425 */       Object o = PropertyUtils.getProperty(bean, "dataInserimento");
/* 426 */       if (o == null || o.toString().equals(""))
/*     */       {
/* 428 */         if (logger.isDebugEnabled()) {
/* 429 */           logger.debug("CP: La proprieta' 'dataInserimento' non e' settata, la setto ora.");
/*     */         }
/* 431 */         PropertyUtils.setProperty(bean, "dataInserimento", Calendar.getInstance().getTime());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 437 */         ArchBaseUtils.setStdFields(bean, "I", getUtenteUltimaOperazione());
/* 438 */         inizializzatoComeInserimento = true;
/*     */       }
/*     */     
/* 441 */     } catch (Exception e) {
/*     */       
/* 443 */       if (logger.isWarnEnabled()) {
/* 444 */         logger.warn("CP: Proprieta' 'dataInserimento' inaccessibile.");
/*     */       }
/*     */     } 
/*     */     
/*     */     try {
/* 449 */       Object o = PropertyUtils.getProperty(bean, "utenteInserimento");
/* 450 */       if (o == null || o.toString().equals("")) {
/*     */         
/* 452 */         if (logger.isDebugEnabled()) {
/* 453 */           logger.debug("CP: La proprieta' 'utenteInserimento' non e' settata, la setto ora.");
/*     */         }
/* 455 */         PropertyUtils.setProperty(bean, "utenteInserimento", getUtenteUltimaOperazione());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 461 */         if (!inizializzatoComeInserimento)
/*     */         {
/* 463 */           ArchBaseUtils.setStdFields(bean, "I", getUtenteUltimaOperazione());
/* 464 */           inizializzatoComeInserimento = true;
/*     */         }
/*     */       
/*     */       } 
/* 468 */     } catch (Exception e) {
/*     */       
/* 470 */       if (logger.isWarnEnabled()) {
/* 471 */         logger.warn("CP: Proprieta' 'utenteInserimento' inaccessibile.");
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 478 */       Object o = PropertyUtils.getProperty(bean, "flagEsistenza");
/* 479 */       if (o.toString().equalsIgnoreCase("N"))
/*     */       {
/* 481 */         ArchBaseUtils.setStdFields(bean, "D", getUtenteUltimaOperazione());
/* 482 */         inizializzatoComeCancellazione = true;
/*     */       }
/*     */     
/* 485 */     } catch (Exception e) {
/*     */       
/* 487 */       if (logger.isWarnEnabled()) {
/* 488 */         logger.warn("CP: Proprieta' 'flagEsistenza' inaccessibile.");
/*     */       }
/*     */     } 
/* 491 */     if (!inizializzatoComeInserimento && !inizializzatoComeCancellazione)
/*     */     {
/* 493 */       ArchBaseUtils.setStdFields(bean, "U", getUtenteUltimaOperazione());
/*     */     }
/*     */     
/* 496 */     if (isInitializingNotSlave())
/*     */     {
/* 498 */       initializeNotSlaveAsSame(bean);
/*     */     }
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
/*     */   private void initializeNotSlaveAsSame(Object bean) {
/*     */     try {
/* 514 */       PropertyUtils.setProperty(bean, "dataUltimaModifica", PropertyUtils.getProperty(bean, "dataUltimaModificaSlave"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 520 */     catch (Exception e) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 530 */       PropertyUtils.setProperty(bean, "tipoUltimaModifica", PropertyUtils.getProperty(bean, "tipoUltimaModificaSlave"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 536 */     catch (Exception e) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 547 */       PropertyUtils.setProperty(bean, "userUltimaModifica", PropertyUtils.getProperty(bean, "userUltimaModificaSlave"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 553 */     catch (Exception e) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 564 */       PropertyUtils.setProperty(bean, "proceduraUltimaModifica", PropertyUtils.getProperty(bean, "proceduraUltimaModificaSlave"));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/* 570 */     catch (Exception e) {}
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
/*     */   public String getUtenteUltimaOperazione() {
/* 588 */     return this.utenteUltimaOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteUltimaOperazione(String utenteUltimaOperazione) {
/* 596 */     this.utenteUltimaOperazione = utenteUltimaOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isInitializingNotSlave() {
/* 604 */     return this.initializingNotSlave;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInitializingNotSlave(boolean initializingNotSlave) {
/* 612 */     this.initializingNotSlave = initializingNotSlave;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\bean\GSTDInitializer.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */