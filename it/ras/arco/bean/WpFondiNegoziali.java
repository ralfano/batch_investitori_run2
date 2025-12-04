/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WpFondiNegoziali
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivoFne;
/*     */   private Double contributoSoggettoFne;
/*     */   private Double contributoDatoreFne;
/*     */   private Double contributoTfrFne;
/*     */   private Date dataIscrizioneFne;
/*     */   private Date dataScadenzaFne;
/*     */   private Double consistenzaFne;
/*     */   private Double renditaUnoFne;
/*     */   private Double renditaDueFne;
/*     */   private Double renditaSceltaFne;
/*     */   private Double renditaTassabileFne;
/*     */   private String tipoFne;
/*     */   private String descrizioneFne;
/*     */   
/*     */   public WpFondiNegoziali() {}
/*     */   
/*     */   public WpFondiNegoziali(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  33 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WpFondiNegoziali(Double fne, Double fne2, Double fne3, Double fne4, Date fne5, Date fne6, String fne7, Integer fne8, Double fne9, Double fne10, Double fne11, Double fne12, String fne13) {
/*  40 */     this.consistenzaFne = fne;
/*  41 */     this.contributoDatoreFne = fne2;
/*  42 */     this.contributoSoggettoFne = fne3;
/*  43 */     this.contributoTfrFne = fne4;
/*  44 */     this.dataIscrizioneFne = fne5;
/*  45 */     this.dataScadenzaFne = fne6;
/*  46 */     this.descrizioneFne = fne7;
/*  47 */     this.progressivoFne = fne8;
/*  48 */     this.renditaDueFne = fne9;
/*  49 */     this.renditaSceltaFne = fne10;
/*  50 */     this.renditaTassabileFne = fne11;
/*  51 */     this.renditaUnoFne = fne12;
/*  52 */     this.tipoFne = fne13;
/*     */   }
/*     */   public Double getConsistenzaFne() {
/*  55 */     return this.consistenzaFne;
/*     */   }
/*     */   public void setConsistenzaFne(Double consistenzaFne) {
/*  58 */     this.consistenzaFne = consistenzaFne;
/*     */   }
/*     */   public Double getContributoDatoreFne() {
/*  61 */     return this.contributoDatoreFne;
/*     */   }
/*     */   public void setContributoDatoreFne(Double contributoDatoreFne) {
/*  64 */     this.contributoDatoreFne = contributoDatoreFne;
/*     */   }
/*     */   public Double getContributoSoggettoFne() {
/*  67 */     return this.contributoSoggettoFne;
/*     */   }
/*     */   public void setContributoSoggettoFne(Double contributoSoggettoFne) {
/*  70 */     this.contributoSoggettoFne = contributoSoggettoFne;
/*     */   }
/*     */   public Double getContributoTfrFne() {
/*  73 */     return this.contributoTfrFne;
/*     */   }
/*     */   public void setContributoTfrFne(Double contributoTfrFne) {
/*  76 */     this.contributoTfrFne = contributoTfrFne;
/*     */   }
/*     */   public Date getDataIscrizioneFne() {
/*  79 */     return this.dataIscrizioneFne;
/*     */   }
/*     */   public void setDataIscrizioneFne(Date dataIscrizioneFne) {
/*  82 */     this.dataIscrizioneFne = dataIscrizioneFne;
/*     */   }
/*     */   public Date getDataScadenzaFne() {
/*  85 */     return this.dataScadenzaFne;
/*     */   }
/*     */   public void setDataScadenzaFne(Date dataScadenzaFne) {
/*  88 */     this.dataScadenzaFne = dataScadenzaFne;
/*     */   }
/*     */   public String getDescrizioneFne() {
/*  91 */     return this.descrizioneFne;
/*     */   }
/*     */   public void setDescrizioneFne(String descrizioneFne) {
/*  94 */     this.descrizioneFne = descrizioneFne;
/*     */   }
/*     */   public Integer getProgressivoFne() {
/*  97 */     return this.progressivoFne;
/*     */   }
/*     */   public void setProgressivoFne(Integer progressivoFne) {
/* 100 */     this.progressivoFne = progressivoFne;
/*     */   }
/*     */   public Double getRenditaDueFne() {
/* 103 */     return this.renditaDueFne;
/*     */   }
/*     */   public void setRenditaDueFne(Double renditaDueFne) {
/* 106 */     this.renditaDueFne = renditaDueFne;
/*     */   }
/*     */   public Double getRenditaSceltaFne() {
/* 109 */     return this.renditaSceltaFne;
/*     */   }
/*     */   public void setRenditaSceltaFne(Double renditaSceltaFne) {
/* 112 */     this.renditaSceltaFne = renditaSceltaFne;
/*     */   }
/*     */   public Double getRenditaTassabileFne() {
/* 115 */     return this.renditaTassabileFne;
/*     */   }
/*     */   public void setRenditaTassabileFne(Double renditaTassabileFne) {
/* 118 */     this.renditaTassabileFne = renditaTassabileFne;
/*     */   }
/*     */   public Double getRenditaUnoFne() {
/* 121 */     return this.renditaUnoFne;
/*     */   }
/*     */   public void setRenditaUnoFne(Double renditaUnoFne) {
/* 124 */     this.renditaUnoFne = renditaUnoFne;
/*     */   }
/*     */   public String getTipoFne() {
/* 127 */     return this.tipoFne;
/*     */   }
/*     */   public void setTipoFne(String tipoFne) {
/* 130 */     this.tipoFne = tipoFne;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpFondiNegoziali.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */