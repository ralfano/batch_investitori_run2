/*    */ package it.ras.arco.bean;
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
/*    */ public class FinRegolaSwitchA
/*    */   extends FinAbstractRegolaSwitch
/*    */ {
/*    */   public static final String VALORE_SI = "S";
/*    */   public static final String VALORE_NO = "N";
/*    */   public static final int BNL_CONTROLLO_UGUALE = 1;
/*    */   public static final int BNL_CONTROLLO_UNO = 2;
/*    */   public static final int BNL_CONTROLLO_UGUALE_PIU = 3;
/*    */   public static final int RAM_CONTROLLO_PICPAC_SUCCESSIVI = 4;
/*    */   public static final int RAM_CONTROLLO_POSIZIONI = 5;
/* 32 */   private String valore = null;
/* 33 */   private Integer tipoControllo = null;
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 38 */   private FinRegolaSwitchDa regolaSwitchDa = null;
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
/*    */   public FinRegolaSwitchDa getRegolaSwitchDa() {
/* 53 */     return this.regolaSwitchDa;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRegolaSwitchDa(FinRegolaSwitchDa regolaSwitchDa) {
/* 61 */     this.regolaSwitchDa = regolaSwitchDa;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getTipoControllo() {
/* 69 */     return this.tipoControllo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTipoControllo(Integer tipoControllo) {
/* 77 */     this.tipoControllo = tipoControllo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getValore() {
/* 85 */     return this.valore;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValore(String valore) {
/* 93 */     this.valore = valore;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinRegolaSwitchA.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */