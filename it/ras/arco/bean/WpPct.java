/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class WpPct
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivoPct;
/*     */   private String bancaPct;
/*     */   private String nomePct;
/*     */   private String prevedeCedolaPct;
/*     */   private Double tassoCedolaPct;
/*     */   private String frequenzaPct;
/*     */   private Date dataEstinTitoloPct;
/*     */   private String numeroContoPct;
/*     */   private String valutaPct;
/*     */   private String codiceIsinPct;
/*     */   private String haTassoVarPct;
/*     */   private String descrizioneTassoVarPct;
/*     */   private Double valoreTassoVarPct;
/*     */   private String notePct;
/*     */   private String categoriaTitoloPct;
/*     */   private String paesePct;
/*     */   private String istitutoPct;
/*     */   private String tipoPct;
/*     */   private Double tassoNettoPct;
/*     */   private Integer matriceTransUtentePct;
/*     */   private String richiestaMafPct;
/*     */   private Date dataRichiestaMafPct;
/*     */   
/*     */   public WpPct(String pct, String pct2, String pct3, Date pct4, Date pct5, String pct6, String pct7, String pct8, String pct9, Integer pct10, String pct11, String pct12, String pct13, String pct14, String pct15, Integer pct16, String pct17, Double pct18, Double pct19, String pct20, Double pct21, String pct22) {
/*  35 */     this.bancaPct = pct;
/*  36 */     this.categoriaTitoloPct = pct2;
/*  37 */     this.codiceIsinPct = pct3;
/*  38 */     this.dataEstinTitoloPct = pct4;
/*  39 */     this.dataRichiestaMafPct = pct5;
/*  40 */     this.descrizioneTassoVarPct = pct6;
/*  41 */     this.frequenzaPct = pct7;
/*  42 */     this.haTassoVarPct = pct8;
/*  43 */     this.istitutoPct = pct9;
/*  44 */     this.matriceTransUtentePct = pct10;
/*  45 */     this.nomePct = pct11;
/*  46 */     this.notePct = pct12;
/*  47 */     this.numeroContoPct = pct13;
/*  48 */     this.paesePct = pct14;
/*  49 */     this.prevedeCedolaPct = pct15;
/*  50 */     this.progressivoPct = pct16;
/*  51 */     this.richiestaMafPct = pct17;
/*  52 */     this.tassoCedolaPct = pct18;
/*  53 */     this.tassoNettoPct = pct19;
/*  54 */     this.tipoPct = pct20;
/*  55 */     this.valoreTassoVarPct = pct21;
/*  56 */     this.valutaPct = pct22;
/*     */   }
/*     */ 
/*     */   
/*     */   public WpPct() {}
/*     */ 
/*     */   
/*     */   public WpPct(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  64 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */   
/*     */   public String getBancaPct() {
/*  68 */     return this.bancaPct;
/*     */   }
/*     */   public void setBancaPct(String bancaPct) {
/*  71 */     this.bancaPct = bancaPct;
/*     */   }
/*     */   public String getCategoriaTitoloPct() {
/*  74 */     return this.categoriaTitoloPct;
/*     */   }
/*     */   public void setCategoriaTitoloPct(String categoriaTitoloPct) {
/*  77 */     this.categoriaTitoloPct = categoriaTitoloPct;
/*     */   }
/*     */   public String getCodiceIsinPct() {
/*  80 */     return this.codiceIsinPct;
/*     */   }
/*     */   public void setCodiceIsinPct(String codiceIsinPct) {
/*  83 */     this.codiceIsinPct = codiceIsinPct;
/*     */   }
/*     */   public Date getDataEstinTitoloPct() {
/*  86 */     return this.dataEstinTitoloPct;
/*     */   }
/*     */   public void setDataEstinTitoloPct(Date dataEstinTitoloPct) {
/*  89 */     this.dataEstinTitoloPct = dataEstinTitoloPct;
/*     */   }
/*     */   public Date getDataRichiestaMafPct() {
/*  92 */     return this.dataRichiestaMafPct;
/*     */   }
/*     */   public void setDataRichiestaMafPct(Date dataRichiestaMafPct) {
/*  95 */     this.dataRichiestaMafPct = dataRichiestaMafPct;
/*     */   }
/*     */   public String getDescrizioneTassoVarPct() {
/*  98 */     return this.descrizioneTassoVarPct;
/*     */   }
/*     */   public void setDescrizioneTassoVarPct(String descrizioneTassoVarPct) {
/* 101 */     this.descrizioneTassoVarPct = descrizioneTassoVarPct;
/*     */   }
/*     */   public String getFrequenzaPct() {
/* 104 */     return this.frequenzaPct;
/*     */   }
/*     */   public void setFrequenzaPct(String frequenzaPct) {
/* 107 */     this.frequenzaPct = frequenzaPct;
/*     */   }
/*     */   public String getHaTassoVarPct() {
/* 110 */     return this.haTassoVarPct;
/*     */   }
/*     */   public void setHaTassoVarPct(String haTassoVarPct) {
/* 113 */     this.haTassoVarPct = haTassoVarPct;
/*     */   }
/*     */   public String getIstitutoPct() {
/* 116 */     return this.istitutoPct;
/*     */   }
/*     */   public void setIstitutoPct(String istitutoPct) {
/* 119 */     this.istitutoPct = istitutoPct;
/*     */   }
/*     */   public Integer getMatriceTransUtentePct() {
/* 122 */     return this.matriceTransUtentePct;
/*     */   }
/*     */   public void setMatriceTransUtentePct(Integer matriceTransUtentePct) {
/* 125 */     this.matriceTransUtentePct = matriceTransUtentePct;
/*     */   }
/*     */   public String getNomePct() {
/* 128 */     return this.nomePct;
/*     */   }
/*     */   public void setNomePct(String nomePct) {
/* 131 */     this.nomePct = nomePct;
/*     */   }
/*     */   public String getNotePct() {
/* 134 */     return this.notePct;
/*     */   }
/*     */   public void setNotePct(String notePct) {
/* 137 */     this.notePct = notePct;
/*     */   }
/*     */   public String getNumeroContoPct() {
/* 140 */     return this.numeroContoPct;
/*     */   }
/*     */   public void setNumeroContoPct(String numeroContoPct) {
/* 143 */     this.numeroContoPct = numeroContoPct;
/*     */   }
/*     */   public String getPaesePct() {
/* 146 */     return this.paesePct;
/*     */   }
/*     */   public void setPaesePct(String paesePct) {
/* 149 */     this.paesePct = paesePct;
/*     */   }
/*     */   public String getPrevedeCedolaPct() {
/* 152 */     return this.prevedeCedolaPct;
/*     */   }
/*     */   public void setPrevedeCedolaPct(String prevedeCedolaPct) {
/* 155 */     this.prevedeCedolaPct = prevedeCedolaPct;
/*     */   }
/*     */   public Integer getProgressivoPct() {
/* 158 */     return this.progressivoPct;
/*     */   }
/*     */   public void setProgressivoPct(Integer progressivoPct) {
/* 161 */     this.progressivoPct = progressivoPct;
/*     */   }
/*     */   public String getRichiestaMafPct() {
/* 164 */     return this.richiestaMafPct;
/*     */   }
/*     */   public void setRichiestaMafPct(String richiestaMafPct) {
/* 167 */     this.richiestaMafPct = richiestaMafPct;
/*     */   }
/*     */   public Double getTassoCedolaPct() {
/* 170 */     return this.tassoCedolaPct;
/*     */   }
/*     */   public void setTassoCedolaPct(Double tassoCedolaPct) {
/* 173 */     this.tassoCedolaPct = tassoCedolaPct;
/*     */   }
/*     */   public Double getTassoNettoPct() {
/* 176 */     return this.tassoNettoPct;
/*     */   }
/*     */   public void setTassoNettoPct(Double tassoNettoPct) {
/* 179 */     this.tassoNettoPct = tassoNettoPct;
/*     */   }
/*     */   public String getTipoPct() {
/* 182 */     return this.tipoPct;
/*     */   }
/*     */   public void setTipoPct(String tipoPct) {
/* 185 */     this.tipoPct = tipoPct;
/*     */   }
/*     */   public Double getValoreTassoVarPct() {
/* 188 */     return this.valoreTassoVarPct;
/*     */   }
/*     */   public void setValoreTassoVarPct(Double valoreTassoVarPct) {
/* 191 */     this.valoreTassoVarPct = valoreTassoVarPct;
/*     */   }
/*     */   public String getValutaPct() {
/* 194 */     return this.valutaPct;
/*     */   }
/*     */   public void setValutaPct(String valutaPct) {
/* 197 */     this.valutaPct = valutaPct;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpPct.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */