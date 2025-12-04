/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinCointestazione;
/*    */ import it.ras.arco.bean.FinRuolo;
/*    */ import it.ras.arco.bean.FinSoggetto;
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
/*    */ public class CodicePersona
/*    */   extends AbstractActionRule
/*    */ {
/* 23 */   FinSoggetto soggetto = null;
/* 24 */   FinCointestazione cointestazione = null;
/* 25 */   FinRuolo ruolo = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean condition(IRasFileRecord fileRecord) {
/* 36 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord) {
/* 47 */     Object rec = fileRecord.getObj();
/* 48 */     if (rec instanceof FinCointestazione) {
/* 49 */       this.cointestazione = (FinCointestazione)rec;
/* 50 */       this.soggetto = this.cointestazione.getSoggetto();
/* 51 */     } else if (rec instanceof FinRuolo) {
/* 52 */       this.ruolo = (FinRuolo)rec;
/* 53 */       this.soggetto = this.ruolo.getSoggetto();
/*    */     } 
/* 55 */     return tipoPersona(this.soggetto);
/*    */   }
/*    */ 
/*    */   
/*    */   private String tipoPersona(FinSoggetto sogg) {
/* 60 */     String codPersona = "P";
/* 61 */     String tipoSoggetto = sogg.getTipoSogg();
/*    */     
/* 63 */     if (tipoSoggetto != null && 
/* 64 */       tipoSoggetto.trim().equalsIgnoreCase("G")) {
/* 65 */       codPersona = "S";
/*    */     }
/*    */     
/* 68 */     return codPersona;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\CodicePersona.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */