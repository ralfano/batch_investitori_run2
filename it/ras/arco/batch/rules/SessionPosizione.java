/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinPosizione;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.arco.bean.FinSottoscrizioneCont;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
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
/*    */ public class SessionPosizione
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 29 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 34 */     Object value = null;
/* 35 */     if (fileRecord.getObj() instanceof FinSottoscrizione) {
/*    */ 
/*    */       
/* 38 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/*    */       
/* 40 */       Set sottCont = sottoscrizione.getContratto();
/* 41 */       if (sottCont != null) {
/* 42 */         Iterator itr = sottCont.iterator();
/* 43 */         if (itr.hasNext()) {
/* 44 */           FinSottoscrizioneCont sCont = itr.next();
/* 45 */           if (sCont != null) {
/*    */             
/* 47 */             FinContratto contratto = (FinContratto)sCont.getContratto();
/* 48 */             if (contratto != null) {
/*    */               
/* 50 */               Set posizioni = contratto.getPosizione();
/* 51 */               if (posizioni != null) {
/* 52 */                 Iterator itrPosizioni = posizioni.iterator();
/* 53 */                 if (itrPosizioni.hasNext()) {
/*    */                   
/* 55 */                   FinPosizione posizione = itrPosizioni.next();
/* 56 */                   value = posizione;
/*    */                 } 
/*    */               } 
/*    */             } 
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/* 64 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\SessionPosizione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */