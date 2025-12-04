/*     */ package it.ras.arco.bean;
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
/*     */ public class FinPortafoglioFondi
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer portafoglioId;
/*     */   private Date dataComposizione;
/*     */   private String percentualeLiquidita;
/*     */   private String percentualeDebito;
/*     */   private String percentualeAzioni;
/*     */   private String percentualeAltro;
/*     */   private String italianEquity;
/*     */   private String foreignEquity;
/*     */   private String italianBond;
/*     */   private String foreignBond;
/*     */   private String convertibleBond;
/*     */   private String governmentBond;
/*     */   private String raccoltaNetta;
/*     */   private String patrimonioNetto;
/*     */   private FinAttivitaFinanziaria attivitaFinanziaria;
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/*  37 */     return this.attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/*  45 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getConvertibleBond() {
/*  53 */     return this.convertibleBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setConvertibleBond(String convertibleBond) {
/*  61 */     this.convertibleBond = convertibleBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataComposizione() {
/*  69 */     return this.dataComposizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataComposizione(Date dataComposizione) {
/*  77 */     this.dataComposizione = dataComposizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getForeignBond() {
/*  85 */     return this.foreignBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setForeignBond(String foreignBond) {
/*  93 */     this.foreignBond = foreignBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getForeignEquity() {
/* 101 */     return this.foreignEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setForeignEquity(String foreignEquity) {
/* 109 */     this.foreignEquity = foreignEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGovernmentBond() {
/* 117 */     return this.governmentBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGovernmentBond(String governmentBond) {
/* 125 */     this.governmentBond = governmentBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getItalianBond() {
/* 133 */     return this.italianBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItalianBond(String italianBond) {
/* 141 */     this.italianBond = italianBond;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getItalianEquity() {
/* 149 */     return this.italianEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setItalianEquity(String italianEquity) {
/* 157 */     this.italianEquity = italianEquity;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPatrimonioNetto() {
/* 165 */     return this.patrimonioNetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPatrimonioNetto(String patrimonioNetto) {
/* 173 */     this.patrimonioNetto = patrimonioNetto;
/*     */   }
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
/*     */   public void setPercentualeAltro(String percentualeAltro) {
/* 189 */     this.percentualeAltro = percentualeAltro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualeAzioni() {
/* 197 */     return this.percentualeAzioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeAzioni(String percentualeAzioni) {
/* 205 */     this.percentualeAzioni = percentualeAzioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualeDebito() {
/* 213 */     return this.percentualeDebito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeDebito(String percentualeDebito) {
/* 221 */     this.percentualeDebito = percentualeDebito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualeLiquidita() {
/* 229 */     return this.percentualeLiquidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeLiquidita(String percentualeLiquidita) {
/* 237 */     this.percentualeLiquidita = percentualeLiquidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPortafoglioId() {
/* 245 */     return this.portafoglioId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPortafoglioId(Integer portafoglioId) {
/* 253 */     this.portafoglioId = portafoglioId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRaccoltaNetta() {
/* 261 */     return this.raccoltaNetta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRaccoltaNetta(String raccoltaNetta) {
/* 269 */     this.raccoltaNetta = raccoltaNetta;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPortafoglioFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */