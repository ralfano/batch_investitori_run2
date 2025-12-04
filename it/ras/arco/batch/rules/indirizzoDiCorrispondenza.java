/*    */ package it.ras.arco.batch.rules;
/*    */ 
/*    */ import it.ras.arco.bean.FinContrattoIndir;
/*    */ import it.ras.flag.batch.file.IRasFileRecord;
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
/*    */ public class indirizzoDiCorrispondenza
/*    */   extends AbstractActionRule
/*    */ {
/*    */   public boolean condition(IRasFileRecord fileRecord, HashMap localSession) {
/* 40 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object consequence(IRasFileRecord fileRecord, HashMap localSession) {
/* 45 */     String indirizzoCorrispondenza = "";
/* 46 */     String toponimo = "";
/* 47 */     String indirizzo = "";
/* 48 */     String numCivico = "";
/* 49 */     FinContrattoIndir contIndirizzo = null;
/*    */ 
/*    */     
/* 52 */     if (localSession.get("SESSIONE_INDIRIZZO") != null) {
/* 53 */       contIndirizzo = (FinContrattoIndir)localSession.get("SESSIONE_INDIRIZZO");
/* 54 */       if (contIndirizzo.getIndirizzo() != null) {
/* 55 */         if (contIndirizzo.getIndirizzo().getDesToponimo() != null) {
/* 56 */           toponimo = contIndirizzo.getIndirizzo().getDesToponimo();
/*    */         }
/* 58 */         if (contIndirizzo.getIndirizzo().getIndirizzo() != null) {
/* 59 */           indirizzo = contIndirizzo.getIndirizzo().getIndirizzo();
/*    */         }
/* 61 */         if (contIndirizzo.getIndirizzo().getNumeroCivico() != null) {
/* 62 */           numCivico = contIndirizzo.getIndirizzo().getNumeroCivico();
/*    */         }
/*    */         
/* 65 */         indirizzoCorrispondenza = toponimo + " " + indirizzo + " " + numCivico;
/*    */       } 
/*    */     } else {
/*    */       
/* 69 */       if (localSession.get("TOPONIMO") != null) {
/* 70 */         indirizzoCorrispondenza = localSession.get("TOPONIMO").toString();
/*    */       }
/* 72 */       if (localSession.get("INDIRIZZO") != null) {
/* 73 */         indirizzoCorrispondenza = indirizzoCorrispondenza + " " + localSession.get("INDIRIZZO").toString();
/*    */       }
/* 75 */       if (localSession.get("NUM_CIV") != null) {
/* 76 */         indirizzoCorrispondenza = indirizzoCorrispondenza + " " + localSession.get("NUM_CIV").toString();
/*    */       }
/*    */     } 
/*    */ 
/*    */     
/* 81 */     return indirizzoCorrispondenza;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\rules\indirizzoDiCorrispondenza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */