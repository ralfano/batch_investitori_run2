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
/*     */ public class FlxPortafoglioFondi
/*     */   extends FlxGenericMAFBean
/*     */ {
/*     */   private String dataComposizione;
/*     */   private String percentualeLiquidita;
/*     */   private String percentualeDebito;
/*     */   private String percentualeAzioni;
/*     */   private String percentualeAltro;
/*     */   private String italianEquity;
/*     */   private String foreignEquity;
/*     */   private String italianBond;
/*     */   private String foreignBond;
/*     */   private String convertibleBond;
/*     */   private String raccoltaNetta;
/*     */   private String patrimonioNetto;
/*     */   private String governmentBond;
/*     */   
/*     */   public FlxPortafoglioFondi(Integer flxId, String statoElaborazione) {
/*  35 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxPortafoglioFondi() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getConvertibleBond() {
/*  55 */     return this.convertibleBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setConvertibleBond(String convertibleBond) {
/*  64 */     this.convertibleBond = convertibleBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataComposizione() {
/*  73 */     return this.dataComposizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataComposizione(String dataComposizione) {
/*  82 */     this.dataComposizione = dataComposizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getForeignBond() {
/*  91 */     return this.foreignBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setForeignBond(String foreignBond) {
/* 100 */     this.foreignBond = foreignBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getForeignEquity() {
/* 109 */     return this.foreignEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setForeignEquity(String foreignEquity) {
/* 118 */     this.foreignEquity = foreignEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getItalianBond() {
/* 127 */     return this.italianBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItalianBond(String italianBond) {
/* 136 */     this.italianBond = italianBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getItalianEquity() {
/* 145 */     return this.italianEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItalianEquity(String italianEquity) {
/* 154 */     this.italianEquity = italianEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPatrimonioNetto() {
/* 163 */     return this.patrimonioNetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPatrimonioNetto(String patrimonioNetto) {
/* 172 */     this.patrimonioNetto = patrimonioNetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualeAltro() {
/* 181 */     return this.percentualeAltro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeAltro(String percentualeAltro) {
/* 190 */     this.percentualeAltro = percentualeAltro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualeAzioni() {
/* 199 */     return this.percentualeAzioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeAzioni(String percentualeAzioni) {
/* 208 */     this.percentualeAzioni = percentualeAzioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualeDebito() {
/* 217 */     return this.percentualeDebito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeDebito(String percentualeDebito) {
/* 226 */     this.percentualeDebito = percentualeDebito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualeLiquidita() {
/* 235 */     return this.percentualeLiquidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeLiquidita(String percentualeLiquidita) {
/* 244 */     this.percentualeLiquidita = percentualeLiquidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRaccoltaNetta() {
/* 253 */     return this.raccoltaNetta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRaccoltaNetta(String raccoltaNetta) {
/* 262 */     this.raccoltaNetta = raccoltaNetta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGovernmentBond() {
/* 271 */     return this.governmentBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGovernmentBond(String governmentBond) {
/* 280 */     this.governmentBond = governmentBond;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxPortafoglioFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */