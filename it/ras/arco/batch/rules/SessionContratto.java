/*    */ package it.ras.arco.batch.rules;
/*    */ 
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
/*    */ public class SessionContratto
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 27 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 31 */     Object value = null;
/* 32 */     if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 33 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/*    */       
/* 35 */       if (sottoscrizione.getUserUltimaModifica().equals("Passaggio con apertura BNL")) {
/* 36 */         value = sottoscrizione.getPrimoContratto();
/*    */       } else {
/*    */         
/* 39 */         Set sottCont = sottoscrizione.getContratto();
/* 40 */         if (sottCont != null) {
/* 41 */           Iterator itr = sottCont.iterator();
/* 42 */           if (itr.hasNext()) {
/* 43 */             FinSottoscrizioneCont sCont = itr.next();
/* 44 */             if (sCont != null) {
/* 45 */               value = sCont.getContratto();
/*    */             }
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 52 */     return value;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\SessionContratto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */