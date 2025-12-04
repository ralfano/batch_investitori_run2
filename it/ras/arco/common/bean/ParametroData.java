/*     */ package it.ras.arco.common.bean;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ParametroData
/*     */   extends Parametro
/*     */ {
/*     */   private boolean matchCase = false;
/*  19 */   public static int CONFRONTO_UGUALE = 0;
/*     */   
/*  21 */   public static int CONFRONTO_INTERVALLO = 10;
/*  22 */   private int modalitaConfronto = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String costruisciEspressione(ArrayList queryParameters) {
/*  40 */     String str = "";
/*     */     
/*  42 */     if (this.modalitaConfronto == CONFRONTO_UGUALE)
/*     */     {
/*  44 */       str = str + " = TO_DATE('" + getValori(0) + "', 'DD-MM-YYYY')";
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     if (this.modalitaConfronto == CONFRONTO_INTERVALLO)
/*     */     {
/*  52 */       str = str + " between TO_DATE('" + getValori(0) + "', 'DD-MM-YYYY') and TO_DATE('" + getValori(1) + "', 'DD-MM-YYYY')";
/*     */     }
/*     */     
/*  55 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String normalizeValueString() {
/*  63 */     String str = (String)getValori(0);
/*     */     
/*  65 */     str = str.replaceAll("'", "''");
/*     */     
/*  67 */     if (!this.matchCase) {
/*  68 */       str = str.toUpperCase();
/*     */     }
/*  70 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isMatchCase() {
/*  84 */     return this.matchCase;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMatchCase(boolean matchCase) {
/*  97 */     this.matchCase = matchCase;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void validate(String valore) throws ValoreParametroNonValidoException {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getModalitaConfronto() {
/* 114 */     return this.modalitaConfronto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModalitaConfronto(int modalitaConfronto) throws ValoreParametroNonValidoException {
/* 127 */     if (modalitaConfronto < CONFRONTO_UGUALE || modalitaConfronto > CONFRONTO_INTERVALLO)
/*     */     {
/*     */ 
/*     */       
/* 131 */       if (modalitaConfronto != CONFRONTO_INTERVALLO) {
/* 132 */         throw new ValoreParametroNonValidoException("Modalita' confronto non valida");
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 138 */     this.modalitaConfronto = modalitaConfronto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroData.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */