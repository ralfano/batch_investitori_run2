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
/*     */ public class FlxAnagraficaAzioni
/*     */   extends FlxAnagraficaMAF
/*     */ {
/*  16 */   private String codicePiazza = null;
/*     */   
/*  18 */   private String simboloPiazza = null;
/*     */   
/*  20 */   private String descrizioneBreve = null;
/*     */   
/*  22 */   private String trattatoSuMercatoPrimario = null;
/*     */   
/*  24 */   private String capitaleSociale = null;
/*     */   
/*  26 */   private String numeroAzioniCircolanti = null;
/*     */   
/*  28 */   private String lottoMinimoAzioniTrattabili = null;
/*     */   
/*  30 */   private String valoreNominale = null;
/*     */   
/*  32 */   private String valutaDividendo = null;
/*     */   
/*  34 */   private String frequenzaDividendo = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaAzioni(Integer flxId, String statoElaborazione) {
/*  43 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaAzioni() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCapitaleSociale() {
/*  63 */     return this.capitaleSociale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapitaleSociale(String capitaleSociale) {
/*  72 */     this.capitaleSociale = capitaleSociale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePiazza() {
/*  81 */     return this.codicePiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePiazza(String codicePiazza) {
/*  90 */     this.codicePiazza = codicePiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneBreve() {
/*  99 */     return this.descrizioneBreve;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneBreve(String descrizioneBreve) {
/* 108 */     this.descrizioneBreve = descrizioneBreve;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFrequenzaDividendo() {
/* 117 */     return this.frequenzaDividendo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrequenzaDividendo(String frequenzaDividendo) {
/* 126 */     this.frequenzaDividendo = frequenzaDividendo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLottoMinimoAzioniTrattabili() {
/* 135 */     return this.lottoMinimoAzioniTrattabili;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLottoMinimoAzioniTrattabili(String lottoMinimoAzioniTrattabili) {
/* 144 */     this.lottoMinimoAzioniTrattabili = lottoMinimoAzioniTrattabili;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroAzioniCircolanti() {
/* 153 */     return this.numeroAzioniCircolanti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroAzioniCircolanti(String numeroAzioniCircolanti) {
/* 162 */     this.numeroAzioniCircolanti = numeroAzioniCircolanti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSimboloPiazza() {
/* 171 */     return this.simboloPiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSimboloPiazza(String simboloPiazza) {
/* 180 */     this.simboloPiazza = simboloPiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTrattatoSuMercatoPrimario() {
/* 189 */     return this.trattatoSuMercatoPrimario;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrattatoSuMercatoPrimario(String trattatoSuMercatoPrimario) {
/* 198 */     this.trattatoSuMercatoPrimario = trattatoSuMercatoPrimario;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValoreNominale() {
/* 207 */     return this.valoreNominale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValoreNominale(String valoreNominale) {
/* 216 */     this.valoreNominale = valoreNominale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValutaDividendo() {
/* 225 */     return this.valutaDividendo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValutaDividendo(String valutaDividendo) {
/* 234 */     this.valutaDividendo = valutaDividendo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnagraficaAzioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */