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
/*     */ public class FlxBenchmarkFondi
/*     */   extends FlxGenericMAFBean
/*     */ {
/*     */   private String benchmarkId;
/*     */   private String codiceIndice;
/*     */   private String percentuale;
/*     */   private String codiceRuolo;
/*     */   private String identificativoRuolo;
/*     */   private String progressivoIndice;
/*     */   
/*     */   public String getBenchmarkId() {
/*  27 */     return this.benchmarkId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBenchmarkId(String benchmarkId) {
/*  36 */     this.benchmarkId = benchmarkId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIndice() {
/*  45 */     return this.codiceIndice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIndice(String codiceIndice) {
/*  54 */     this.codiceIndice = codiceIndice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRuolo() {
/*  63 */     return this.codiceRuolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRuolo(String codiceRuolo) {
/*  72 */     this.codiceRuolo = codiceRuolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIdentificativoRuolo() {
/*  81 */     return this.identificativoRuolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIdentificativoRuolo(String identificativoRuolo) {
/*  90 */     this.identificativoRuolo = identificativoRuolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentuale() {
/*  99 */     return this.percentuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentuale(String percentuale) {
/* 108 */     this.percentuale = percentuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProgressivoIndice() {
/* 117 */     return this.progressivoIndice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProgressivoIndice(String progressivoIndice) {
/* 126 */     this.progressivoIndice = progressivoIndice;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxBenchmarkFondi(Integer flxId, String statoElaborazione) {
/* 136 */     super(flxId, statoElaborazione);
/*     */   }
/*     */   
/*     */   public FlxBenchmarkFondi() {}
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxBenchmarkFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */