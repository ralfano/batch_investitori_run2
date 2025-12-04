/*    */ package it.ras.arco.batch.investitori.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinCointestazione;
/*    */ import it.ras.arco.bean.FinContratto;
/*    */ import it.ras.arco.bean.FinRuolo;
/*    */ import it.ras.arco.bean.FinSoggetto;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
/*    */ import it.ras.flag.config.rules.AbstractActionRule;
/*    */ import java.util.HashMap;
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
/*    */ public class CodiceRuolo
/*    */   extends AbstractActionRule
/*    */ {
/* 28 */   FinContratto cont = null;
/* 29 */   FinCointestazione cointestazione = null;
/* 30 */   FinContratto c = null;
/* 31 */   FinSoggetto sogg = null;
/* 32 */   FinRuolo ruolo = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 43 */     return true;
/*    */   }
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 47 */     String codiceRuolo = "04";
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 53 */     this.cont = (FinContratto)localSession.get("SESSIONCONTRATTO");
/* 54 */     String primoIntId = this.cont.getSoggetto().getSoggettoId().toString();
/* 55 */     if (fileRecord.getObj() instanceof FinCointestazione) {
/* 56 */       this.cointestazione = (FinCointestazione)fileRecord.getObj();
/* 57 */       if (this.cointestazione.getTipo().equals("M")) {
/* 58 */         return "01";
/*    */       }
/* 60 */       this.sogg = this.cointestazione.getSoggetto();
/* 61 */       String contratto = localSession.get("CONTRATTOID").toString();
/* 62 */       if (this.sogg.getTipoSogg().equals("G") && 
/* 63 */         this.cointestazione.getTipo().equals("C")) {
/* 64 */         return this.sogg.getSoggettoId().toString().equals(primoIntId) ? "01" : "04";
/*    */       }
/*    */ 
/*    */       
/* 68 */       if (this.sogg.getTipoSogg().equals("F")) {
/*    */ 
/*    */ 
/*    */         
/* 72 */         Set ruoli = this.sogg.getRuoliComeRappresentante();
/* 73 */         if (ruoli != null) {
/* 74 */           Iterator ruoliIterator = ruoli.iterator();
/* 75 */           while (ruoliIterator.hasNext()) {
/* 76 */             this.ruolo = ruoliIterator.next();
/* 77 */             this.c = this.ruolo.getContratto();
/* 78 */             if (this.c != null) {
/* 79 */               String contrattoId = this.c.getContrattoId().toString();
/* 80 */               if (contrattoId.equals(contratto) && 
/* 81 */                 this.ruolo.getRuolo().equals("DLG")) {
/* 82 */                 return this.sogg.getSoggettoId().toString().equals(primoIntId) ? "01" : "72";
/*    */               }
/*    */             } 
/*    */           } 
/*    */         } 
/*    */         
/* 88 */         return this.sogg.getSoggettoId().toString().equals(primoIntId) ? "01" : "04";
/*    */       } 
/*    */     } 
/* 91 */     return codiceRuolo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-investitori-1.0.0.jar!\it\ras\arco\batch\investitori\rules\CodiceRuolo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */