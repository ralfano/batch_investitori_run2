/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinSottoscrEmittente;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.Date;
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
/*    */ 
/*    */ 
/*    */ public class UpdateSottoscrizioneEmittente
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 35 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 39 */     if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 40 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 41 */       Integer emittenteId = new Integer(localSession.get("EMITTENTEID").toString());
/* 42 */       Set emittenti = sottoscrizione.getEmitSottoscrizioni();
/* 43 */       if (emittenti != null) {
/* 44 */         Iterator itr = emittenti.iterator();
/* 45 */         while (itr.hasNext()) {
/* 46 */           FinSottoscrEmittente emittente = itr.next();
/* 47 */           if (emittente != null && 
/* 48 */             emittente.getEmittente().getEmittenteId().equals(emittenteId)) {
/* 49 */             emittente.setFlagInvio("S");
/* 50 */             if (emittente.getNumeroInvio() != null) {
/* 51 */               emittente.setNumeroInvio(new Integer(emittente.getNumeroInvio().intValue() + 1));
/*    */             } else {
/* 53 */               emittente.setNumeroInvio(new Integer(0));
/*    */             } 
/* 55 */             Date dat = new Date();
/* 56 */             emittente.setDataUtimoInvio(dat);
/* 57 */             if (emittente.getDataPrimoInvio() == null) {
/* 58 */               emittente.setDataPrimoInvio(dat);
/*    */             }
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 65 */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\UpdateSottoscrizioneEmittente.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */