/*    */ package it.ras.arco.batch.bean;
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
/*    */ public class FlxRatingObbligazioni
/*    */   extends FlxGenericMAFBean
/*    */ {
/*    */   private String data;
/*    */   private String rating;
/*    */   private String codiceFonteFinanziaria;
/*    */   
/*    */   public FlxRatingObbligazioni(Integer flxId, String statoElaborazione) {
/* 24 */     super(flxId, statoElaborazione);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FlxRatingObbligazioni() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getCodiceFonteFinanziaria() {
/* 44 */     return this.codiceFonteFinanziaria;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCodiceFonteFinanziaria(String codiceFonteFinanziaria) {
/* 53 */     this.codiceFonteFinanziaria = codiceFonteFinanziaria;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getData() {
/* 62 */     return this.data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setData(String data) {
/* 71 */     this.data = data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getRating() {
/* 80 */     return this.rating;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRating(String rating) {
/* 89 */     this.rating = rating;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRatingObbligazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */