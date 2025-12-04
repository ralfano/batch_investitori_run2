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
/*    */ public class FlxDividendiFondi
/*    */   extends FlxGenericMAFBean
/*    */ {
/*    */   private String dataStacco;
/*    */   private String dataValuta;
/*    */   private Double importo;
/*    */   
/*    */   public FlxDividendiFondi(Integer flxId, String statoElaborazione) {
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
/*    */   public FlxDividendiFondi() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getDataStacco() {
/* 43 */     return this.dataStacco;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDataStacco(String dataStacco) {
/* 52 */     this.dataStacco = dataStacco;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getDataValuta() {
/* 61 */     return this.dataValuta;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDataValuta(String dataValuta) {
/* 70 */     this.dataValuta = dataValuta;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Double getImporto() {
/* 79 */     return this.importo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setImporto(Double importo) {
/* 88 */     this.importo = importo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxDividendiFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */