/*     */ package it.ras.arco.batch.rules;
/*     */ 
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinDispPagamento;
/*     */ import it.ras.arco.bean.FinMovimento;
/*     */ import it.ras.arco.bean.FinPosizione;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.arco.bean.FinSottoscrizione;
/*     */ import it.ras.arco.bean.SnpEstrazioni;
/*     */ import it.ras.flag.batch.file.IRasFileRecord;
/*     */ import it.ras.flag.config.rules.AbstractValidationRule;
/*     */ import java.util.Date;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
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
/*     */ public class StoricizzaEstrazioni
/*     */   extends AbstractValidationRule
/*     */ {
/*     */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/*  41 */     Set estrazioni = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     if (fileRecord.getObj() instanceof FinPosizione) {
/*  47 */       FinPosizione posizione = (FinPosizione)fileRecord.getObj();
/*  48 */       estrazioni = posizione.getEstrazioni();
/*     */ 
/*     */     
/*     */     }
/*  52 */     else if (fileRecord.getObj() instanceof FinSoggetto) {
/*  53 */       FinSoggetto sogg = (FinSoggetto)fileRecord.getObj();
/*  54 */       estrazioni = sogg.getEstrazioni();
/*     */     
/*     */     }
/*  57 */     else if (fileRecord.getObj() instanceof FinCointestazione) {
/*  58 */       FinCointestazione coin = (FinCointestazione)fileRecord.getObj();
/*  59 */       estrazioni = coin.getEstrazioni();
/*     */     
/*     */     }
/*  62 */     else if (fileRecord.getObj() instanceof FinMovimento) {
/*  63 */       FinMovimento mov = (FinMovimento)fileRecord.getObj();
/*  64 */       estrazioni = mov.getEstrazioni();
/*     */ 
/*     */     
/*     */     }
/*  68 */     else if (fileRecord.getObj() instanceof FinDispPagamento) {
/*  69 */       FinDispPagamento disp = (FinDispPagamento)fileRecord.getObj();
/*  70 */       estrazioni = disp.getEstrazioni();
/*     */     
/*     */     }
/*  73 */     else if (fileRecord.getObj() instanceof FinSottoscrizione) {
/*  74 */       FinSottoscrizione sott = (FinSottoscrizione)fileRecord.getObj();
/*  75 */       estrazioni = sott.getEstrazioni();
/*     */     } 
/*     */     
/*  78 */     if (localSession.get("POSIZIONE") != null) {
/*  79 */       FinPosizione posizione = (FinPosizione)localSession.get("POSIZIONE");
/*  80 */       estrazioni = posizione.getEstrazioni();
/*     */     } 
/*     */     
/*  83 */     if (localSession.get("SOTTOSCRIZIONEANT") != null) {
/*  84 */       FinSottoscrizione sott = (FinSottoscrizione)localSession.get("SOTTOSCRIZIONEANT");
/*  85 */       estrazioni = sott.getEstrazioni();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     if (localSession.get("DEST") != null) {
/*  93 */       String dest = localSession.get("DEST").toString();
/*  94 */       if (estrazioni != null && estrazioni.size() > 0) {
/*  95 */         Iterator itr = estrazioni.iterator();
/*  96 */         while (itr.hasNext()) {
/*  97 */           SnpEstrazioni est = itr.next();
/*  98 */           if (dest.indexOf(est.getDest()) != -1) {
/*  99 */             est.setInviato("E");
/*     */             
/* 101 */             est.setDataInviato(new Date());
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\StoricizzaEstrazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */