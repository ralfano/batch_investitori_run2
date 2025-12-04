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
/*     */ public class FlxPrezziObbligazioni
/*     */   extends FlxGenericMAFBean
/*     */ {
/*     */   private String data;
/*     */   private Double prezzo;
/*     */   private Double rateo;
/*     */   private Double durata;
/*     */   private Double durataModificata;
/*     */   
/*     */   public FlxPrezziObbligazioni(Integer flxId, String statoElaborazione) {
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
/*     */   public FlxPrezziObbligazioni() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getData() {
/*  48 */     return this.data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setData(String data) {
/*  57 */     this.data = data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getDurata() {
/*  66 */     return this.durata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDurata(Double durata) {
/*  75 */     this.durata = durata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getDurataModificata() {
/*  84 */     return this.durataModificata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDurataModificata(Double durataModificata) {
/*  93 */     this.durataModificata = durataModificata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzo() {
/* 102 */     return this.prezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 111 */     this.prezzo = prezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getRateo() {
/* 120 */     return this.rateo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRateo(Double rateo) {
/* 129 */     this.rateo = rateo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxPrezziObbligazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */