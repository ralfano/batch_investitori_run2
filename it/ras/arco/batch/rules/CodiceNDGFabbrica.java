/*     */ package it.ras.arco.batch.rules;
/*     */ 
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*     */ import it.ras.arco.bean.FinPosizione;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.arco.bean.FinSoggettoIndir;
/*     */ import it.ras.arco.bean.FinSottoscrizione;
/*     */ import it.ras.arco.bean.FinSottoscrizioneCont;
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
/*     */ public class CodiceNDGFabbrica
/*     */   extends AbstractActionRule
/*     */ {
/*     */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/*  37 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   private String settaLung(String value) {
/*  42 */     if (value == null) return null; 
/*  43 */     String out = "";
/*  44 */     int diff = 13 - value.length();
/*  45 */     if (diff > 0) {
/*  46 */       for (int i = 0; i < diff; i++) {
/*  47 */         out = out + "0";
/*     */       }
/*     */     }
/*  50 */     out = out + value;
/*  51 */     return out;
/*     */   }
/*     */   
/*     */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/*  55 */     String codice = "";
/*  56 */     String fabbrica = localSession.get("FABBRICA").toString();
/*  57 */     Iterator decodeNDG = null;
/*  58 */     if (fileRecord.getObj() instanceof FinSoggettoIndir) {
/*  59 */       FinSoggettoIndir soggIndir = (FinSoggettoIndir)fileRecord.getObj();
/*  60 */       decodeNDG = soggIndir.getSoggetto().getDecodNdgFabbr().iterator();
/*  61 */     } else if (fileRecord.getObj() instanceof FinSottoscrizioneCont) {
/*  62 */       FinSottoscrizioneCont sott_contratto = (FinSottoscrizioneCont)fileRecord.getObj();
/*  63 */       if (sott_contratto != null) {
/*  64 */         Set decodeNdg = sott_contratto.getContratto().getCointestazione().getDecodNdgFabbr();
/*  65 */         decodeNDG = decodeNdg.iterator();
/*     */       } 
/*  67 */     } else if (fileRecord.getObj() instanceof FinSottoscrizione) {
/*     */       
/*  69 */       FinSottoscrizione sottosc = (FinSottoscrizione)fileRecord.getObj();
/*  70 */       FinSoggetto soggetto = sottosc.getSoggettoRichiedente();
/*  71 */       if (soggetto != null) {
/*  72 */         Set decodeNdg = soggetto.getDecodNdgFabbr();
/*  73 */         decodeNDG = decodeNdg.iterator();
/*     */       } 
/*  75 */     } else if (fileRecord.getObj() instanceof FinSoggetto) {
/*  76 */       FinSoggetto soggetto = (FinSoggetto)fileRecord.getObj();
/*  77 */       if (soggetto != null) {
/*  78 */         Set decodeNdg = soggetto.getDecodNdgFabbr();
/*  79 */         decodeNDG = decodeNdg.iterator();
/*     */       }
/*     */     
/*  82 */     } else if (fileRecord.getObj() instanceof FinPosizione) {
/*  83 */       FinPosizione posizione = (FinPosizione)fileRecord.getObj();
/*  84 */       if (posizione != null) {
/*  85 */         FinContratto contratto = (FinContratto)posizione.getContratto();
/*  86 */         if (contratto != null) {
/*  87 */           Set decodeNdg = contratto.getCointestazione().getDecodNdgFabbr();
/*  88 */           decodeNDG = decodeNdg.iterator();
/*     */         } 
/*     */       } 
/*     */     } 
/*  92 */     if (decodeNDG != null) {
/*  93 */       while (decodeNDG.hasNext()) {
/*  94 */         FinDecodNdgFabbr decode = decodeNDG.next();
/*  95 */         if (decode != null && 
/*  96 */           decode.getFabbrica().equals(fabbrica)) {
/*  97 */           codice = decode.getNdgFab().substring(13);
/*     */ 
/*     */           
/*     */           break;
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 105 */     return codice;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\CodiceNDGFabbrica.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */