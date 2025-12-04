/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinAltriProdotti;
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinRuolo;
/*    */ import it.ras.arco.bean.FinSoggetto;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.Iterator;
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
/*    */ public class CodiceArcoLegaleRappresentante
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 33 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 37 */     String codice = "";
/* 38 */     FinContratto contratto = null;
/*    */     
/* 40 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 41 */       contratto = (FinContratto)fileRecord.getObj();
/*    */     }
/*    */ 
/*    */     
/* 45 */     if (fileRecord.getObj() instanceof FinAltriProdotti) {
/* 46 */       FinAltriProdotti prod = (FinAltriProdotti)fileRecord.getObj();
/* 47 */       contratto = prod.getContratto();
/*    */     } 
/*    */     
/* 50 */     if (contratto != null) {
/* 51 */       Iterator setRuolo = contratto.getRuolo().iterator();
/* 52 */       while (setRuolo.hasNext()) {
/* 53 */         FinRuolo ruolo = setRuolo.next();
/* 54 */         if (ruolo != null && 
/* 55 */           ruolo.getRuolo().equals("LR")) {
/* 56 */           FinSoggetto soggetto = ruolo.getSoggetto();
/* 57 */           if (soggetto != null && 
/* 58 */             soggetto.getNdgArco() != null) {
/* 59 */             codice = soggetto.getNdgArco().toString();
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 67 */     return codice;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\CodiceArcoLegaleRappresentante.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */