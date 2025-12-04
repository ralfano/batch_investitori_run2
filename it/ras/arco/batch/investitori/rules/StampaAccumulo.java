/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinFondiSicav;
/*    */ import it.ras.arco.bean.FinOrdine;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractValidationRule;
/*    */ import java.util.HashMap;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class StampaAccumulo
/*    */   extends AbstractValidationRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession, HashMap globalSession) {
/* 41 */     String tipoOperazione = localSession.get("TIPOOPERAZIONE").toString();
/* 42 */     String nuovePosizioni = localSession.get("NUOVEPOSIZIONI").toString();
/* 43 */     String tipoInv = localSession.get("TIPOINVIO").toString();
/*    */     
/* 45 */     if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 46 */       FinSottoscrizione sottoscr = (FinSottoscrizione)fileRecord.getObj();
/* 47 */       if (sottoscr != null) {
/* 48 */         if (tipoOperazione.equals("SOT") && nuovePosizioni.equals("S")) {
/* 49 */           if (tipoInv.equals("PAC")) {
/*    */             
/* 51 */             FinOrdine ordine = (FinOrdine)localSession.get("SESSIONORDINE");
/* 52 */             if (ordine != null) {
/* 53 */               if (globalSession.get("RECORD_COUNT") != null) {
/* 54 */                 int recordCount = ((Integer)globalSession.get("RECORD_COUNT")).intValue();
/* 55 */                 globalSession.put("RECORD_COUNT", new Integer(++recordCount));
/*    */               } else {
/* 57 */                 globalSession.put("RECORD_COUNT", new Integer(3));
/*    */               } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */               
/* 64 */               FinFondiSicav fn = (FinFondiSicav)sottoscr.getPrimoContratto();
/*    */               
/* 66 */               Double importo = ordine.getImporto();
/* 67 */               Double rataBase = fn.getImpRata();
/* 68 */               double versamentoIniziale = 0.0D;
/* 69 */               if (importo != null && rataBase != null && 
/* 70 */                 rataBase.intValue() != 0) {
/* 71 */                 versamentoIniziale = importo.doubleValue() / rataBase.doubleValue();
/*    */               }
/*    */ 
/*    */               
/* 75 */               localSession.put("VERSAMENTO_INIZIALE", new Double(versamentoIniziale));
/* 76 */               localSession.put("ATTFINID", ordine.getAttivitaFin().getAttivitaFinId().toString());
/* 77 */               return true;
/*    */             } 
/* 79 */             return false;
/*    */           } 
/*    */           
/* 82 */           return false;
/*    */         } 
/*    */       } else {
/*    */         
/* 86 */         return false;
/*    */       } 
/*    */     } else {
/* 89 */       return false;
/*    */     } 
/* 91 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\StampaAccumulo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */