/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAnagraficaFondi
/*     */   extends FlxAnagraficaMAF
/*     */ {
/*  13 */   private String categoriaAssogestioni = null;
/*     */   
/*  15 */   private String prevedeCedola = null;
/*     */   
/*  17 */   private String frequenzaCedola = null;
/*     */   
/*  19 */   private String codiceValutaDividendi = null;
/*     */   
/*  21 */   private String codiceTipoInvestimento = null;
/*     */   
/*  23 */   private String codiceAreaGeografica = null;
/*     */   
/*  25 */   private String sicav = null;
/*     */   
/*  27 */   private String aperto = null;
/*     */   
/*  29 */   private String investimentoMinimo = null;
/*     */   
/*  31 */   private String rimborsoMinimo = null;
/*     */   
/*  33 */   private String classe = null;
/*     */   
/*  35 */   private String rischioCambio = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaFondi(Integer flxId, String statoElaborazione) {
/*  46 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaFondi() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAperto() {
/*  66 */     return this.aperto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAperto(String aperto) {
/*  75 */     this.aperto = aperto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCategoriaAssogestioni() {
/*  84 */     return this.categoriaAssogestioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCategoriaAssogestioni(String categoriaAssogestioni) {
/*  93 */     this.categoriaAssogestioni = categoriaAssogestioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getClasse() {
/* 102 */     return this.classe;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClasse(String classe) {
/* 111 */     this.classe = classe;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAreaGeografica() {
/* 120 */     return this.codiceAreaGeografica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAreaGeografica(String codiceAreaGeografica) {
/* 129 */     this.codiceAreaGeografica = codiceAreaGeografica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceTipoInvestimento() {
/* 138 */     return this.codiceTipoInvestimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceTipoInvestimento(String codiceTipoInvestimento) {
/* 147 */     this.codiceTipoInvestimento = codiceTipoInvestimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceValutaDividendi() {
/* 156 */     return this.codiceValutaDividendi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceValutaDividendi(String codiceValutaDividendi) {
/* 165 */     this.codiceValutaDividendi = codiceValutaDividendi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFrequenzaCedola() {
/* 174 */     return this.frequenzaCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrequenzaCedola(String frequenzaCedola) {
/* 183 */     this.frequenzaCedola = frequenzaCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getInvestimentoMinimo() {
/* 192 */     return this.investimentoMinimo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInvestimentoMinimo(String investimentoMinimo) {
/* 201 */     this.investimentoMinimo = investimentoMinimo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrevedeCedola() {
/* 210 */     return this.prevedeCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrevedeCedola(String prevedeCedola) {
/* 219 */     this.prevedeCedola = prevedeCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRimborsoMinimo() {
/* 228 */     return this.rimborsoMinimo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRimborsoMinimo(String rimborsoMinimo) {
/* 237 */     this.rimborsoMinimo = rimborsoMinimo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRischioCambio() {
/* 246 */     return this.rischioCambio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRischioCambio(String rischioCambio) {
/* 255 */     this.rischioCambio = rischioCambio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSicav() {
/* 264 */     return this.sicav;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSicav(String sicav) {
/* 273 */     this.sicav = sicav;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnagraficaFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */