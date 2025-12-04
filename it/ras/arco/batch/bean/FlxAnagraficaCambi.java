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
/*    */ 
/*    */ 
/*    */ public class FlxAnagraficaCambi
/*    */   extends FlxGenericMAFBean
/*    */ {
/*    */   private String descrizione;
/*    */   private String valutaIn;
/*    */   private String valutaOut;
/*    */   
/*    */   public FlxAnagraficaCambi(Integer flxId, String statoElaborazione) {
/* 26 */     super(flxId, statoElaborazione);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FlxAnagraficaCambi() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getDescrizione() {
/* 46 */     return this.descrizione;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDescrizione(String descrizione) {
/* 55 */     this.descrizione = descrizione;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getValutaIn() {
/* 64 */     return this.valutaIn;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValutaIn(String valutaIn) {
/* 73 */     this.valutaIn = valutaIn;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getValutaOut() {
/* 82 */     return this.valutaOut;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setValutaOut(String valutaOut) {
/* 91 */     this.valutaOut = valutaOut;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnagraficaCambi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */