/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.arco.common.resources.Utility;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
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
/*     */ public abstract class FinAbstractParametrizedBean
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*  27 */   Log log = LogFactory.getLog(getClass());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  37 */   private Set listaParametri = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  43 */   private List listaParametriLST = null;
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
/*     */   public Set getListaParametri() {
/*  55 */     return this.listaParametri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListaParametri(Set listaParametri) {
/*  63 */     this.listaParametri = listaParametri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void congelaListaParametri() {
/*     */     try {
/*  75 */       if (this.listaParametri != null)
/*     */       {
/*  77 */         this.listaParametriLST = congelaSet(this.listaParametri);
/*     */       }
/*     */       else
/*     */       {
/*  81 */         this.listaParametriLST = new ArrayList();
/*     */       }
/*     */     
/*  84 */     } catch (Exception e) {
/*     */       
/*  86 */       if (this.log.isWarnEnabled())
/*     */       {
/*  88 */         this.log.warn("CP: Impossibile congelare la lista dei parametri.");
/*     */       }
/*     */       
/*  91 */       if (this.log.isWarnEnabled())
/*     */       {
/*  93 */         this.log.warn(e.getClass().getName() + " > " + e.getMessage());
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void accept(IGSTDInitVisitor visitor) {
/* 103 */     super.accept(visitor);
/* 104 */     if (getListaParametri() != null && getListaParametri().size() > 0)
/*     */     {
/* 106 */       for (Iterator iter = getListaParametri().iterator(); iter.hasNext(); ) {
/*     */         
/* 108 */         FinEntitaParametro element = iter.next();
/* 109 */         element.accept(visitor);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getListaParametriLST() {
/* 119 */     return this.listaParametriLST;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListaParametriLST(List listaParametriLST) {
/* 127 */     this.listaParametriLST = listaParametriLST;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String estraiValoreParametroByCodiceParametro(Integer codiceParametro) {
/* 134 */     if (this.listaParametri == null || this.listaParametri.isEmpty())
/*     */     {
/* 136 */       return null;
/*     */     }
/* 138 */     Iterator iteraParametri = this.listaParametri.iterator();
/*     */     
/* 140 */     while (iteraParametri.hasNext()) {
/*     */       
/* 142 */       FinEntitaParametro entitaParametro = iteraParametri.next();
/*     */       
/* 144 */       Date dataInizioPar = entitaParametro.getDataInizio();
/* 145 */       Date now = new Date();
/*     */       
/* 147 */       if (Utility.dateDifference(dataInizioPar, now) > 0) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 158 */       if (entitaParametro.getParametro() == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 164 */       if (entitaParametro.getParametro().getCodice().intValue() == codiceParametro.intValue())
/*     */       {
/* 166 */         return entitaParametro.getValore();
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/* 171 */     return null;
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
/*     */   public Object estraiTipoNumericoByCodiceParametro(Integer codiceParametro, int type) {
/* 190 */     if (this.listaParametri == null || this.listaParametri.isEmpty())
/*     */     {
/* 192 */       return null;
/*     */     }
/*     */ 
/*     */     
/* 196 */     Iterator iteraParametri = this.listaParametri.iterator();
/*     */     
/* 198 */     while (iteraParametri.hasNext()) {
/*     */       
/* 200 */       FinEntitaParametro entitaParametro = iteraParametri.next();
/*     */       
/* 202 */       Date dataInizioPar = entitaParametro.getDataInizio();
/* 203 */       Date now = new Date();
/*     */       
/* 205 */       if (Utility.dateDifference(dataInizioPar, now) > 0) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 212 */       if (entitaParametro.getParametro() == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 218 */       if (entitaParametro.getParametro().getCodice().intValue() == codiceParametro.intValue()) {
/*     */         
/* 220 */         FinUltPrezzoAdapterBase dummy = new FinUltPrezzoAdapterBase();
/*     */         try {
/*     */           String valore;
/* 223 */           switch (type) {
/*     */             
/*     */             case 1:
/* 226 */               dummy.setUltPrezzoIdAdp(entitaParametro.getValore());
/* 227 */               return dummy.getUltPrezzoId();
/*     */             case 2:
/* 229 */               dummy.setUltPrezzoAdp(entitaParametro.getValore());
/* 230 */               return dummy.getUltPrezzo();
/*     */             case 3:
/* 232 */               dummy.setDataInserimentoAdp(entitaParametro.getValore());
/* 233 */               return dummy.getDataInserimento();
/*     */             case 4:
/* 235 */               valore = entitaParametro.getValore();
/* 236 */               if ("S".equals(valore))
/*     */               {
/* 238 */                 return new Boolean(true);
/*     */               }
/* 240 */               if ("N".equals(valore))
/*     */               {
/* 242 */                 return new Boolean(false);
/*     */               }
/*     */ 
/*     */               
/* 246 */               if (this.log.isWarnEnabled())
/*     */               {
/* 248 */                 this.log.warn("L'entità parametro contiene il valore: " + valore);
/*     */               }
/*     */           } 
/*     */ 
/*     */         
/* 253 */         } catch (NumberFormatException nfe) {
/*     */           
/* 255 */           return null;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 261 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinParametro estraiParametroByCodiceParametro(Integer codiceParametro) {
/* 266 */     if (this.listaParametri == null || this.listaParametri.isEmpty())
/*     */     {
/* 268 */       return null;
/*     */     }
/* 270 */     Iterator iteraParametri = this.listaParametri.iterator();
/*     */     
/* 272 */     while (iteraParametri.hasNext()) {
/*     */       
/* 274 */       FinEntitaParametro entitaParametro = iteraParametri.next();
/*     */       
/* 276 */       Date dataInizioPar = entitaParametro.getDataInizio();
/* 277 */       Date now = new Date();
/*     */       
/* 279 */       if (Utility.dateDifference(dataInizioPar, now) > 0) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 286 */       if (entitaParametro.getParametro() == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 292 */       if (entitaParametro.getParametro().getCodice().compareTo(codiceParametro) == 0)
/*     */       {
/* 294 */         return entitaParametro.getParametro();
/*     */       }
/*     */     } 
/* 297 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinEntitaParametro estraiEntitaParametroByCodiceParametro(Integer codiceParametro) {
/* 302 */     if (this.listaParametri == null || this.listaParametri.isEmpty())
/*     */     {
/* 304 */       return null;
/*     */     }
/* 306 */     Iterator iteraParametri = this.listaParametri.iterator();
/*     */     
/* 308 */     while (iteraParametri.hasNext()) {
/*     */       
/* 310 */       FinEntitaParametro entitaParametro = iteraParametri.next();
/*     */       
/* 312 */       Date dataInizioPar = entitaParametro.getDataInizio();
/* 313 */       Date now = new Date();
/*     */       
/* 315 */       if (Utility.dateDifference(dataInizioPar, now) > 0) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 321 */       if (entitaParametro.getParametro() == null) {
/*     */         continue;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 327 */       if (entitaParametro.getParametro().getCodice().intValue() == codiceParametro.intValue())
/*     */       {
/* 329 */         return entitaParametro;
/*     */       }
/*     */     } 
/* 332 */     return null;
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
/*     */   public void verificaPresenzaParametri(Integer[] arrayCodiciParametro) throws RasServiceException {
/* 345 */     RasServiceException segnalatore = new RasServiceException();
/*     */     
/* 347 */     if (arrayCodiciParametro.length == 0) {
/*     */       return;
/*     */     }
/*     */ 
/*     */     
/* 352 */     int i = 0;
/* 353 */     for (; i < arrayCodiciParametro.length; i++) {
/*     */       
/* 355 */       Integer codiceParametro = arrayCodiciParametro[i];
/* 356 */       String valoreParametro = estraiValoreParametroByCodiceParametro(codiceParametro);
/* 357 */       if (valoreParametro == null || valoreParametro.trim().equalsIgnoreCase("")) {
/*     */         
/* 359 */         RasValidationSignal parametroError = new RasValidationSignal("it.ras.arco.ordine.nuovaSottoscrizione.errori.parametroNonPresente", (Object[])new String[] { codiceParametro.toString() });
/*     */         
/* 361 */         segnalatore.addError(parametroError);
/*     */       } 
/*     */     } 
/*     */     
/* 365 */     if (segnalatore.signalsPresent())
/*     */     {
/* 367 */       throw segnalatore;
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
/*     */   public boolean esisteParametro(Integer codiceParametro) {
/* 381 */     String valoreParametro = estraiValoreParametroByCodiceParametro(codiceParametro);
/* 382 */     if (valoreParametro == null || valoreParametro.trim().equalsIgnoreCase(""))
/*     */     {
/* 384 */       return false;
/*     */     }
/*     */ 
/*     */     
/* 388 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAbstractParametrizedBean.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */