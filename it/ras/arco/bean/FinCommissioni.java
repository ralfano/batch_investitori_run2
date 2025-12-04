/*     */ package it.ras.arco.bean;
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
/*     */ public class FinCommissioni
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer commissioneId;
/*     */   private String tipo;
/*     */   private String progressivo;
/*     */   private String descrizione;
/*     */   private Double valore;
/*     */   private FinAttivitaFinanziaria attivitaFinanziaria;
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/*  27 */     return this.attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/*  35 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCommissioneId() {
/*  43 */     return this.commissioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCommissioneId(Integer commissioneId) {
/*  51 */     this.commissioneId = commissioneId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizione() {
/*  59 */     return this.descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/*  67 */     this.descrizione = descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProgressivo() {
/*  75 */     return this.progressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProgressivo(String progressivo) {
/*  83 */     this.progressivo = progressivo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/*  91 */     return this.tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipo(String tipo) {
/*  99 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getValore() {
/* 107 */     return this.valore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValore(Double valore) {
/* 115 */     this.valore = valore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCommissioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */