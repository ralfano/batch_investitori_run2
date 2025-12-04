/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinCointestazione;
/*    */ import it.ras.arco.bean.FinSoggetto;
/*    */ import it.ras.arco.bean.FinSoggettoIndir;
/*    */ import it.ras.arco.bean.FinSottoscrizione;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
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
/*    */ public class RagioneSociale
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 30 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 34 */     String ragioneSociale = "";
/* 35 */     FinSoggetto soggetto = null;
/*    */     
/* 37 */     if (fileRecord.getObj() instanceof FinSoggettoIndir) {
/* 38 */       FinSoggettoIndir finSoggInd = (FinSoggettoIndir)fileRecord.getObj();
/* 39 */       soggetto = finSoggInd.getSoggetto();
/* 40 */     } else if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 41 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 42 */       soggetto = sottoscrizione.getSoggettoRichiedente();
/* 43 */     } else if (fileRecord.getObj() instanceof FinCointestazione) {
/* 44 */       FinCointestazione cointestazione = (FinCointestazione)fileRecord.getObj();
/* 45 */       soggetto = cointestazione.getSoggetto();
/* 46 */     } else if (fileRecord.getObj() instanceof FinSottoscrizione) {
/* 47 */       FinSottoscrizione sottoscrizione = (FinSottoscrizione)fileRecord.getObj();
/* 48 */       soggetto = sottoscrizione.getPrimoContratto().getCointestazione().getSoggetto();
/*    */     } 
/*    */ 
/*    */     
/* 52 */     if (soggetto != null) {
/* 53 */       String tipoSoggetto = soggetto.getTipoSogg();
/* 54 */       if (tipoSoggetto != null) {
/* 55 */         if (tipoSoggetto.trim().equalsIgnoreCase("G")) {
/* 56 */           ragioneSociale = soggetto.getDenominazione();
/*    */         } else {
/* 58 */           String cognome = soggetto.getCognome();
/* 59 */           if (cognome == null) {
/* 60 */             cognome = "";
/*    */           }
/* 62 */           String nome = soggetto.getNome();
/* 63 */           if (nome == null) {
/* 64 */             nome = "";
/*    */           }
/* 66 */           ragioneSociale = cognome + " " + nome;
/*    */         } 
/*    */       }
/*    */     } 
/* 70 */     return ragioneSociale;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\RagioneSociale.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */