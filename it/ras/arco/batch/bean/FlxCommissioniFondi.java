/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxCommissioniFondi
/*     */   extends FlxGenericMAFBean
/*     */ {
/*     */   private String tipo;
/*     */   private String progressivo;
/*     */   private String descrizione;
/*     */   private Double valore;
/*     */   
/*     */   public FlxCommissioniFondi(Integer flxId, String statoElaborazione) {
/*  25 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxCommissioniFondi() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizione() {
/*  45 */     return this.descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/*  54 */     this.descrizione = descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProgressivo() {
/*  63 */     return this.progressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProgressivo(String progressivo) {
/*  72 */     this.progressivo = progressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/*  81 */     return this.tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipo(String tipo) {
/*  90 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getValore() {
/*  99 */     return this.valore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValore(Double valore) {
/* 108 */     this.valore = valore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxCommissioniFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */