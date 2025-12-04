/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinAltriProdDet;
/*    */ import it.ras.arco.bean.FinAltriProdotti;
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinContrattoPromotore;
/*    */ import it.ras.arco.bean.FinMovimento;
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
/*    */ 
/*    */ public class CodicePromotore
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 36 */     return true;
/*    */   }
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/*    */     FinAltriProdDet finAltriProdDet;
/* 40 */     String codice = "";
/* 41 */     FinContratto contratto = null;
/*    */     
/* 43 */     if (fileRecord.getObj() instanceof FinMovimento) {
/* 44 */       FinMovimento movimento = (FinMovimento)fileRecord.getObj();
/* 45 */       contratto = movimento.getContratto();
/*    */     } 
/*    */     
/* 48 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 49 */       contratto = (FinContratto)fileRecord.getObj();
/*    */     }
/*    */ 
/*    */     
/* 53 */     if (fileRecord.getObj() instanceof FinPosizione) {
/* 54 */       FinPosizione pos = (FinPosizione)fileRecord.getObj();
/* 55 */       contratto = (FinContratto)pos.getContratto();
/*    */     } 
/*    */     
/* 58 */     if (fileRecord.getObj() instanceof FinAltriProdotti) {
/* 59 */       FinAltriProdotti prod = (FinAltriProdotti)fileRecord.getObj();
/* 60 */       finAltriProdDet = prod.getAltriProdottiDet();
/*    */     } 
/*    */ 
/*    */     
/* 64 */     if (finAltriProdDet != null) {
/* 65 */       Iterator assegnazione = finAltriProdDet.getAssegnazione().iterator();
/* 66 */       while (assegnazione.hasNext()) {
/* 67 */         FinContrattoPromotore contrattoProm = assegnazione.next();
/* 68 */         if (contrattoProm != null && 
/* 69 */           contrattoProm.getFlagAttuale().equals("S") && contrattoProm.getFlagSplit().equals("N")) {
/* 70 */           FinPromotore promotore = contrattoProm.getPromotore();
/* 71 */           if (promotore != null) {
/* 72 */             codice = promotore.getCodPromotore().toString();
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 82 */     return codice;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\CodicePromotore.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */