/*    */ package it.ras.arco.batch.bean;
/*    */ 
/*    */ import java.util.Date;
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
/*    */ public class FlxPrezziGenerale
/*    */   extends FlxGenericMAFBean
/*    */ {
/*    */   private Date data;
/*    */   private Double prezzo;
/*    */   private Double prezzoAdjusted;
/*    */   
/*    */   public FlxPrezziGenerale(Integer flxId, String statoElaborazione) {
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
/*    */   public FlxPrezziGenerale() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Date getData() {
/* 46 */     return this.data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setData(Date data) {
/* 55 */     this.data = data;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Double getPrezzo() {
/* 64 */     return this.prezzo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPrezzo(Double prezzo) {
/* 73 */     this.prezzo = prezzo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Double getPrezzoAdjusted() {
/* 82 */     return this.prezzoAdjusted;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setPrezzoAdjusted(Double prezzoAdjusted) {
/* 91 */     this.prezzoAdjusted = prezzoAdjusted;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxPrezziGenerale.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */