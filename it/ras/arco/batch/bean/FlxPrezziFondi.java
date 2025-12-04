/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.util.Date;
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
/*     */ public class FlxPrezziFondi
/*     */   extends FlxGenericMAFBean
/*     */ {
/*     */   private Date data;
/*     */   private Double prezzo;
/*     */   private Double prezzoAdjusted;
/*     */   private Double prezzoEuro;
/*     */   
/*     */   public FlxPrezziFondi(Integer flxId, String statoElaborazione) {
/*  29 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxPrezziFondi() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getData() {
/*  49 */     return this.data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setData(Date data) {
/*  58 */     this.data = data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzo() {
/*  67 */     return this.prezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/*  76 */     this.prezzo = prezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoAdjusted() {
/*  85 */     return this.prezzoAdjusted;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoAdjusted(Double prezzoAdjusted) {
/*  94 */     this.prezzoAdjusted = prezzoAdjusted;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoEuro() {
/* 103 */     return this.prezzoEuro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoEuro(Double prezzoEuro) {
/* 112 */     this.prezzoEuro = prezzoEuro;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxPrezziFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */