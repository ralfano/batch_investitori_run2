/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinDecodNdgFabbr;
/*    */ import it.ras.arco.bean.FinPosizione;
/*    */ import it.ras.arco.bean.FinSoggetto;
/*    */ import it.ras.arco.bean.FinSoggettoIndir;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.arco.bean.FinSottoscrizioneCont;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.HashMap;
/*    */ import java.util.Iterator;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CodiceNDGFabbricaSec
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 37 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 41 */     String codice = "";
/* 42 */     String fabbrica = localSession.get("FABBRICA").toString();
/* 43 */     Iterator decodeNDG = null;
/* 44 */     if (fileRecord.getObj() instanceof FinSoggettoIndir) {
/* 45 */       FinSoggettoIndir soggIndir = (FinSoggettoIndir)fileRecord.getObj();
/* 46 */       decodeNDG = soggIndir.getSoggetto().getDecodNdgFabbr().iterator();
/* 47 */     } else if (fileRecord.getObj() instanceof FinSottoscrizioneCont) {
/* 48 */       FinSottoscrizioneCont sott_contratto = (FinSottoscrizioneCont)fileRecord.getObj();
/* 49 */       if (sott_contratto != null) {
/* 50 */         Set decodeNdg = sott_contratto.getContratto().getCointestazione().getDecodNdgFabbr();
/* 51 */         decodeNDG = decodeNdg.iterator();
/*    */       } 
/* 53 */     } else if (fileRecord.getObj() instanceof FinSottoscrizione) {
/*    */       
/* 55 */       FinSottoscrizione sottosc = (FinSottoscrizione)fileRecord.getObj();
/* 56 */       FinSoggetto soggetto = sottosc.getSoggettoRichiedente();
/* 57 */       if (soggetto != null) {
/* 58 */         Set decodeNdg = soggetto.getDecodNdgFabbr();
/* 59 */         decodeNDG = decodeNdg.iterator();
/*    */       } 
/* 61 */     } else if (fileRecord.getObj() instanceof FinSoggetto) {
/* 62 */       FinSoggetto soggetto = (FinSoggetto)fileRecord.getObj();
/* 63 */       if (soggetto != null) {
/* 64 */         Set decodeNdg = soggetto.getDecodNdgFabbr();
/* 65 */         decodeNDG = decodeNdg.iterator();
/*    */       }
/*    */     
/* 68 */     } else if (fileRecord.getObj() instanceof FinPosizione) {
/* 69 */       FinPosizione posizione = (FinPosizione)fileRecord.getObj();
/* 70 */       if (posizione != null) {
/* 71 */         FinContratto contratto = (FinContratto)posizione.getContratto();
/* 72 */         if (contratto != null) {
/* 73 */           Set decodeNdg = contratto.getCointestazione().getSoggetto().getDecodNdgFabbr();
/* 74 */           decodeNDG = decodeNdg.iterator();
/*    */         } 
/*    */       } 
/*    */     } 
/* 78 */     if (decodeNDG != null) {
/* 79 */       while (decodeNDG.hasNext()) {
/* 80 */         FinDecodNdgFabbr decode = decodeNDG.next();
/* 81 */         if (decode != null && 
/* 82 */           decode.getFabbrica().equals(fabbrica)) {
/* 83 */           codice = decode.getNdgFab();
/*    */         }
/*    */       } 
/*    */     }
/*    */     
/* 88 */     return codice;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\CodiceNDGFabbricaSec.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */