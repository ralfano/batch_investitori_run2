/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.arco.common.resources.Utility;
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ListaPosizioni
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Double controvaloreTotaleInEuro;
/*    */   
/*    */   public ListaPosizioni() {}
/*    */   
/*    */   public ListaPosizioni(Double dValue) {
/* 25 */     setControvaloreTotaleInEuro(dValue);
/*    */   }
/*    */ 
/*    */   
/*    */   public Double getControvaloreTotaleInEuro() {
/* 30 */     return this.controvaloreTotaleInEuro;
/*    */   }
/*    */   
/*    */   public void setControvaloreTotaleInEuro(Double dValue) {
/* 34 */     this.controvaloreTotaleInEuro = dValue;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setControvaloreTotaleInEuro(List listaPosizioni) {
/* 44 */     double dRisultatoTotale = 0.0D;
/* 45 */     for (int iPos = 0; iPos < listaPosizioni.size(); iPos++) {
/* 46 */       FinPosizione oPosizione = listaPosizioni.get(iPos);
/* 47 */       if (oPosizione.getContratto().getGP()) {
/* 48 */         Double dGPCtv = ((FinGP)oPosizione.getContratto()).getCtvTot();
/* 49 */         if (dGPCtv != null) dRisultatoTotale += dGPCtv.doubleValue(); 
/*    */       } else {
/* 51 */         dRisultatoTotale += getControvaloreInEuro(oPosizione).doubleValue();
/*    */       } 
/*    */     } 
/*    */     
/* 55 */     this.controvaloreTotaleInEuro = new Double(dRisultatoTotale);
/*    */   }
/*    */ 
/*    */   
/*    */   public Double getControvaloreInEuro(FinPosizione oPosizione) {
/* 60 */     Double returnValue = new Double(0.0D);
/*    */     
/* 62 */     if (oPosizione.getQuantita() != null && 
/* 63 */       oPosizione.getAttivitaFin() != null && 
/* 64 */       oPosizione.getAttivitaFin().getUltPrezzo() != null && 
/* 65 */       oPosizione.getAttivitaFin().getUltPrezzo().getUltPrezzoEuro() != null) {
/* 66 */       returnValue = new Double(Utility.multiplyDouble(oPosizione.getQuantita().doubleValue(), oPosizione.getAttivitaFin().getUltPrezzo().getUltPrezzoEuro().doubleValue()));
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 73 */     return returnValue;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\ListaPosizioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */