/*     */ package it.ras.arco.batch.rules;
/*     */ 
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*     */ import it.ras.arco.bean.FinPosizione;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.batch.file.IRasFileRecord;
/*     */ import it.ras.flag.config.rules.AbstractActionRule;
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
/*     */ public class RecuperaCodiceSquadra
/*     */   extends AbstractActionRule
/*     */ {
/*     */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/*  35 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/*  40 */     Long nuovoCodiceSoggettoNdgSEC = new Long(0L);
/*  41 */     long costanteSoggetto = 9000000000L;
/*  42 */     String NdgFab = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  51 */     Integer codice = new Integer(0);
/*  52 */     FinCointestazione cointestazione = null;
/*     */     
/*  54 */     if (fileRecord.getObj() instanceof FinPosizione) {
/*  55 */       FinPosizione posizione = (FinPosizione)fileRecord.getObj();
/*  56 */       if (posizione != null) {
/*  57 */         FinContratto contratto = (FinContratto)posizione.getContratto();
/*  58 */         if (contratto != null) {
/*  59 */           cointestazione = contratto.getCointestazione();
/*     */         }
/*     */       } 
/*     */     } 
/*     */     
/*  64 */     if (cointestazione != null) {
/*     */       
/*  66 */       codice = cointestazione.getCointestazioneId();
/*     */ 
/*     */       
/*  69 */       nuovoCodiceSoggettoNdgSEC = new Long(codice.intValue() + costanteSoggetto);
/*     */       
/*  71 */       FinSoggetto sogg = cointestazione.getSoggetto();
/*     */       
/*  73 */       if (sogg != null) {
/*     */         
/*  75 */         Set decode = sogg.getDecodNdgFabbr();
/*     */         
/*  77 */         if (decode.size() > 0) {
/*  78 */           Iterator decodeNDG = decode.iterator();
/*  79 */           while (decodeNDG.hasNext()) {
/*  80 */             FinDecodNdgFabbr dec = decodeNDG.next();
/*  81 */             if (dec != null && 
/*  82 */               dec.getFabbrica().equals(localSession.get("FABBRICA").toString()) && (
/*  83 */               dec.getTipo().equals("C") || dec.getTipo().equals("M"))) {
/*  84 */               NdgFab = dec.getNdgFab();
/*     */ 
/*     */               
/*     */               break;
/*     */             } 
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/*  94 */     if (!NdgFab.equalsIgnoreCase("")) {
/*     */       
/*  96 */       String codiceSquadraSecFormattato = NdgFab;
/*     */       
/*  98 */       if (codiceSquadraSecFormattato.length() > 10) {
/*  99 */         codiceSquadraSecFormattato = codiceSquadraSecFormattato.substring(codiceSquadraSecFormattato.length() - 10);
/*     */       }
/*     */       
/* 102 */       return codiceSquadraSecFormattato;
/*     */     } 
/*     */ 
/*     */     
/* 106 */     return nuovoCodiceSoggettoNdgSEC;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\RecuperaCodiceSquadra.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */