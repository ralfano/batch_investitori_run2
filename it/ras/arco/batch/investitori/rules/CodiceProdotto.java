/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinProdotto;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.CodesTableManager;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.HashMap;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class CodiceProdotto
/*    */   extends AbstractActionRule
/*    */ {
/* 20 */   FinContratto contratto = null;
/* 21 */   FinProdotto prod = null;
/* 22 */   String codProdotto = "";
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private CodesTableManager codesTableManager;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 33 */     return true;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public CodesTableManager getCodesTableManager() {
/* 41 */     return this.codesTableManager;
/*    */   }
/*    */   
/*    */   public void setCodesTableManager(CodesTableManager codesTableManager) {
/* 45 */     this.codesTableManager = codesTableManager;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 50 */     this.contratto = (FinContratto)localSession.get("SESSIONCONTRATTO");
/*    */     
/* 52 */     this.codProdotto = (String)localSession.get("ATT_FIN_DECODED");
/* 53 */     this.prod = this.contratto.getProdotto();
/*    */     
/* 55 */     if (this.prod.getTipo().startsWith("GP")) {
/* 56 */       localSession.put("CODLINEA", this.codProdotto);
/*    */       
/* 58 */       if (this.codProdotto.startsWith("O") || this.codProdotto.startsWith("S") || this.codProdotto.startsWith("D") || this.codProdotto.startsWith("F")) {
/*    */         
/* 60 */         this.codProdotto = "0018";
/* 61 */       } else if (this.codProdotto.endsWith("C") || this.codProdotto.endsWith("P")) {
/* 62 */         this.codProdotto = "0070";
/*    */       } else {
/* 64 */         this.codProdotto = "0016";
/*    */       } 
/*    */     } else {
/*    */       
/* 68 */       localSession.put("CODLINEA", "");
/*    */     } 
/*    */     
/* 71 */     return this.codProdotto;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\CodiceProdotto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */