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
/*     */ public class FlxRendimentoFondi
/*     */   extends FlxGenericMAFBean
/*     */ {
/*     */   private Double performanceUnMese;
/*     */   private Double performanceTrimestre;
/*     */   private Double performanceUnAnno;
/*     */   private Double performanceTriennale;
/*     */   private Double performanceInizioAnno;
/*     */   
/*     */   public FlxRendimentoFondi(Integer flxId, String statoElaborazione) {
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
/*     */   public FlxRendimentoFondi() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceInizioAnno() {
/*  48 */     return this.performanceInizioAnno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceInizioAnno(Double performanceInizioAnno) {
/*  57 */     this.performanceInizioAnno = performanceInizioAnno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceTriennale() {
/*  66 */     return this.performanceTriennale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceTriennale(Double performanceTriennale) {
/*  75 */     this.performanceTriennale = performanceTriennale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceTrimestre() {
/*  84 */     return this.performanceTrimestre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceTrimestre(Double performanceTrimestre) {
/*  93 */     this.performanceTrimestre = performanceTrimestre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceUnAnno() {
/* 102 */     return this.performanceUnAnno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceUnAnno(Double performanceUnAnno) {
/* 111 */     this.performanceUnAnno = performanceUnAnno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPerformanceUnMese() {
/* 120 */     return this.performanceUnMese;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerformanceUnMese(Double performanceUnMese) {
/* 129 */     this.performanceUnMese = performanceUnMese;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRendimentoFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */