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
/*    */ public class FlxLookUpTable
/*    */   extends FlxGenericMAFBean
/*    */ {
/*    */   private String tipoTabella;
/*    */   private String codice;
/*    */   private String descrizione;
/*    */   
/*    */   public FlxLookUpTable(Integer flxId, String statoElaborazione) {
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
/*    */   public FlxLookUpTable() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getCodice() {
/* 44 */     return this.codice;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCodice(String codice) {
/* 53 */     this.codice = codice;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getDescrizione() {
/* 62 */     return this.descrizione;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDescrizione(String descrizione) {
/* 71 */     this.descrizione = descrizione;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getTipoTabella() {
/* 80 */     return this.tipoTabella;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTipoTabella(String tipoTabella) {
/* 89 */     this.tipoTabella = tipoTabella;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxLookUpTable.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */