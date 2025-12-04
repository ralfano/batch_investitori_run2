/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinAltriProdDet;
/*    */ import it.ras.arco.bean.FinAltriProdotti;
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinContrattoPromotore;
/*    */ import it.ras.arco.bean.FinPosizione;
/*    */ import it.ras.arco.bean.FinPromotore;
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
/*    */ public class PromotoreSplit
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 34 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 38 */     String codice = "";
/* 39 */     FinContratto contratto = null;
/*    */ 
/*    */ 
/*    */     
/* 43 */     if (fileRecord.getObj() instanceof FinPosizione) {
/* 44 */       FinPosizione pos = (FinPosizione)fileRecord.getObj();
/* 45 */       contratto = (FinContratto)pos.getContratto();
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 50 */     if (fileRecord.getObj() instanceof FinAltriProdotti) {
/* 51 */       FinAltriProdotti prod = (FinAltriProdotti)fileRecord.getObj();
/* 52 */       FinAltriProdDet finAltriProdDet = prod.getAltriProdottiDet();
/*    */     } 
/*    */ 
/*    */     
/* 56 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 57 */       contratto = (FinContratto)fileRecord.getObj();
/*    */     }
/*    */ 
/*    */     
/* 61 */     if (contratto != null) {
/* 62 */       Iterator assegnazione = contratto.getAssegnazione().iterator();
/* 63 */       while (assegnazione.hasNext()) {
/* 64 */         FinContrattoPromotore contrattoProm = assegnazione.next();
/* 65 */         if (contrattoProm != null && 
/* 66 */           contrattoProm.getFlagAttuale().equals("S") && contrattoProm.getFlagSplit().equals("S")) {
/* 67 */           FinPromotore promotore = contrattoProm.getPromotore();
/* 68 */           if (promotore != null) {
/* 69 */             codice = promotore.getPromotoreId().toString();
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 78 */     return codice;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\PromotoreSplit.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */