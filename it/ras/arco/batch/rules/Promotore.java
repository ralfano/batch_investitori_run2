/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinAltriProdDet;
/*    */ import it.ras.arco.bean.FinAltriProdotti;
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinContrattoPromotore;
/*    */ import it.ras.arco.bean.FinPromotore;
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
/*    */ 
/*    */ public class Promotore
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 36 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 40 */     String codice = "";
/* 41 */     if (fileRecord.getObj() instanceof FinContratto) {
/* 42 */       FinContratto contratto = (FinContratto)fileRecord.getObj();
/* 43 */       Iterator assegnazione = contratto.getAssegnazione().iterator();
/* 44 */       while (assegnazione.hasNext()) {
/* 45 */         FinContrattoPromotore contrattoProm = assegnazione.next();
/* 46 */         if (contrattoProm != null && 
/* 47 */           contrattoProm.getFlagAttuale().equals("S") && contrattoProm.getFlagSplit().equals("N")) {
/* 48 */           FinPromotore promotore = contrattoProm.getPromotore();
/* 49 */           if (promotore != null) {
/* 50 */             codice = promotore.getCodPromotore().toString();
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 58 */     if (fileRecord.getObj() instanceof FinAltriProdotti) {
/* 59 */       FinAltriProdotti aP = (FinAltriProdotti)fileRecord.getObj();
/*    */       
/* 61 */       FinAltriProdDet contratto = aP.getAltriProdottiDet();
/* 62 */       if (contratto != null) {
/* 63 */         Iterator assegnazione = contratto.getAssegnazione().iterator();
/* 64 */         while (assegnazione.hasNext()) {
/* 65 */           FinContrattoPromotore contrattoProm = assegnazione.next();
/* 66 */           if (contrattoProm != null && 
/* 67 */             contrattoProm.getFlagAttuale().equals("S") && contrattoProm.getFlagSplit().equals("N")) {
/* 68 */             FinPromotore promotore = contrattoProm.getPromotore();
/* 69 */             if (promotore != null) {
/* 70 */               codice = promotore.getCodPromotore().toString();
/*    */             }
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 79 */     if (fileRecord.getObj() instanceof FinSoggetto) {
/* 80 */       FinSoggetto soggetto = (FinSoggetto)fileRecord.getObj();
/* 81 */       FinPromotore prom = soggetto.getPromotore();
/* 82 */       if (prom != null) {
/* 83 */         codice = prom.getCodPromotore();
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 88 */     if (codice == null || codice.equals("")) {
/* 89 */       codice = "9000R";
/*    */     }
/*    */     
/* 92 */     return codice;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\Promotore.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */