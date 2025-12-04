/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinCointestazione;
/*    */ import it.ras.arco.bean.FinSoggetto;
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
/*    */ public class SessionIndirizzo
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 27 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 31 */     Object value = null;
/* 32 */     if (fileRecord.getObj() instanceof FinCointestazione) {
/* 33 */       FinCointestazione cointestazione = (FinCointestazione)fileRecord.getObj();
/* 34 */       FinSoggetto soggetto = cointestazione.getSoggetto();
/* 35 */       if (soggetto != null) {
/* 36 */         Set indirizzo = soggetto.getIndirizzoResidenza();
/* 37 */         if (indirizzo != null) {
/* 38 */           Iterator itr = indirizzo.iterator();
/* 39 */           if (itr.hasNext()) {
/* 40 */             value = itr.next();
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
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
/*    */ 
/*    */     
/* 67 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\SessionIndirizzo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */