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
/*    */ public class FlxCedoleObbligazioni
/*    */   extends FlxGenericMAFBean
/*    */ {
/*    */   private String data;
/*    */   private Double rendimento;
/*    */   
/*    */   public String getData() {
/* 20 */     return this.data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setData(String data) {
/* 27 */     this.data = data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Double getRendimento() {
/* 34 */     return this.rendimento;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setRendimento(Double rendimento) {
/* 41 */     this.rendimento = rendimento;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FlxCedoleObbligazioni() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public FlxCedoleObbligazioni(Integer flxId, String statoElaborazione) {
/* 57 */     super(flxId, statoElaborazione);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxCedoleObbligazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */