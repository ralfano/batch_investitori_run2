/*     */ package it.ras.arco.cp.bean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ParametroNumerico
/*     */   extends Parametro
/*     */ {
/*  12 */   public static int CONFRONTO_UGUALE = 0;
/*     */   
/*  14 */   public static int CONFRONTO_MAGGIORE = 1;
/*     */   
/*  16 */   public static int CONFRONTO_MAGGIORE_UGUALE = 2;
/*     */   
/*  18 */   public static int CONFRONTO_MINORE = 3;
/*     */   
/*  20 */   public static int CONFRONTO_MINORE_UGUALE = 4;
/*     */   
/*  22 */   public static int CONFRONTO_DIVERSO = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  27 */   public static int CONFRONTO_INTERVALLO = 10;
/*     */   
/*  29 */   private int modalitaConfronto = 0;
/*     */   
/*  31 */   private String[] tokenConfronto = new String[] { " = ", " > ", " >= ", " < ", " <= ", " <> " };
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
/*     */   public String costruisciEspressione() {
/*  49 */     if (this.modalitaConfronto >= CONFRONTO_UGUALE && this.modalitaConfronto <= CONFRONTO_DIVERSO)
/*     */     {
/*  51 */       return this.tokenConfronto[this.modalitaConfronto] + getValori(0) + " ";
/*     */     }
/*     */     
/*  54 */     if (this.modalitaConfronto == CONFRONTO_INTERVALLO)
/*     */     {
/*  56 */       return " BETWEEN " + getValori(0) + " AND " + getValori(1) + " ";
/*     */     }
/*     */     
/*  59 */     return "";
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
/*     */   public void validate(String valore) throws ValoreParametroNonValidoException {
/*     */     try {
/*  72 */       Double.parseDouble(valore);
/*     */     }
/*  74 */     catch (NumberFormatException e) {
/*     */       
/*  76 */       throw new ValoreParametroNonValidoException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getModalitaConfronto() {
/*  85 */     return this.modalitaConfronto;
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
/*     */   public void setModalitaConfronto(int modalitaConfronto) throws ValoreParametroNonValidoException {
/*  97 */     if (modalitaConfronto < CONFRONTO_UGUALE || modalitaConfronto > CONFRONTO_DIVERSO)
/*     */     {
/*  99 */       if (modalitaConfronto != CONFRONTO_INTERVALLO)
/*     */       {
/* 101 */         throw new ValoreParametroNonValidoException("Modalita' confronto non valida");
/*     */       }
/*     */     }
/*     */     
/* 105 */     this.modalitaConfronto = modalitaConfronto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\bean\ParametroNumerico.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */