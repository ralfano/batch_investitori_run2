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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinAttFinDettaglio
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer dettaglioId;
/*     */   private FinAttivitaFinanziaria attivitaFinanziaria;
/*     */   private String descrizione;
/*     */   private String valore;
/*     */   
/*     */   public FinAttFinDettaglio(Integer dettaglioId, FinAttivitaFinanziaria attivitaFinanziaria, String descrizione, String valore) {
/*  30 */     this.dettaglioId = dettaglioId;
/*  31 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*  32 */     this.descrizione = descrizione;
/*  33 */     this.valore = valore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAttFinDettaglio() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/*  51 */     return this.attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/*  60 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizione() {
/*  69 */     return this.descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/*  78 */     this.descrizione = descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getDettaglioId() {
/*  87 */     return this.dettaglioId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDettaglioId(Integer dettaglioId) {
/*  96 */     this.dettaglioId = dettaglioId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValore() {
/* 105 */     return this.valore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValore(String valore) {
/* 114 */     this.valore = valore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAttFinDettaglio.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */