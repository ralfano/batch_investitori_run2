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
/*     */ 
/*     */ 
/*     */ public class FlxIndici
/*     */   extends FlxGenericMAFBean
/*     */ {
/*     */   private String benchmark;
/*     */   private String codNazione;
/*     */   private String areaGeografica;
/*     */   private String codSettoreIndustriale;
/*     */   private String valuta;
/*     */   
/*     */   public FlxIndici(Integer flxId, String statoElaborazione) {
/*  28 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxIndici() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAreaGeografica() {
/*  48 */     return this.areaGeografica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAreaGeografica(String areaGeografica) {
/*  57 */     this.areaGeografica = areaGeografica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getBenchmark() {
/*  66 */     return this.benchmark;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBenchmark(String benchmark) {
/*  75 */     this.benchmark = benchmark;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodNazione() {
/*  84 */     return this.codNazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodNazione(String codNazione) {
/*  93 */     this.codNazione = codNazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodSettoreIndustriale() {
/* 102 */     return this.codSettoreIndustriale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodSettoreIndustriale(String codSettoreIndustriale) {
/* 111 */     this.codSettoreIndustriale = codSettoreIndustriale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValuta() {
/* 120 */     return this.valuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValuta(String valuta) {
/* 129 */     this.valuta = valuta;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxIndici.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */