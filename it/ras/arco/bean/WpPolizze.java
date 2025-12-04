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
/*     */ public class WpPolizze
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivoPol;
/*     */   private Integer deducibilePol;
/*     */   private Date dataInizioPol;
/*     */   private Date dataFinePol;
/*     */   private Double premioAnnuoPol;
/*     */   private Double capitaleInizialePol;
/*     */   private Double renditaUnoPol;
/*     */   private Double renditaDuePol;
/*     */   private Double renditaSceltaPol;
/*     */   private Date dataQuietanzaPol;
/*     */   private String gapRilevantePol;
/*     */   private String contraentePol;
/*     */   private String beneficiarioPol;
/*     */   private String frequenzaPol;
/*     */   private String tipoPremioPol;
/*     */   private String tipologiaPol;
/*     */   private Double capitaleAttesoPol;
/*     */   private Double renditaAnnuaPol;
/*     */   private Double renditaTassabilePol;
/*     */   private String tipoRenditaPol;
/*     */   private Double consistenzaPol;
/*     */   private String faseAttualePol;
/*     */   private Date dataConsistenzaPol;
/*     */   private String prestazioneNotaPol;
/*     */   
/*     */   public WpPolizze() {}
/*     */   
/*     */   public WpPolizze(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  43 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WpPolizze(String pol, Double pol2, Double pol3, Double pol4, String pol5, Date pol6, Date pol7, Date pol8, Date pol9, Integer pol10, String pol11, String pol12, String pol13, Double pol14, String pol15, Integer pol16, Double pol17, Double pol18, Double pol19, Double pol20, Double pol21, String pol22, String pol23, String pol24) {
/*  50 */     this.beneficiarioPol = pol;
/*  51 */     this.capitaleAttesoPol = pol2;
/*  52 */     this.capitaleInizialePol = pol3;
/*  53 */     this.consistenzaPol = pol4;
/*  54 */     this.contraentePol = pol5;
/*  55 */     this.dataConsistenzaPol = pol6;
/*  56 */     this.dataFinePol = pol7;
/*  57 */     this.dataInizioPol = pol8;
/*  58 */     this.dataQuietanzaPol = pol9;
/*  59 */     this.deducibilePol = pol10;
/*  60 */     this.faseAttualePol = pol11;
/*  61 */     this.frequenzaPol = pol12;
/*  62 */     this.gapRilevantePol = pol13;
/*  63 */     this.premioAnnuoPol = pol14;
/*  64 */     this.prestazioneNotaPol = pol15;
/*  65 */     this.progressivoPol = pol16;
/*  66 */     this.renditaAnnuaPol = pol17;
/*  67 */     this.renditaDuePol = pol18;
/*  68 */     this.renditaSceltaPol = pol19;
/*  69 */     this.renditaTassabilePol = pol20;
/*  70 */     this.renditaUnoPol = pol21;
/*  71 */     this.tipologiaPol = pol22;
/*  72 */     this.tipoPremioPol = pol23;
/*  73 */     this.tipoRenditaPol = pol24;
/*     */   }
/*     */   public String getBeneficiarioPol() {
/*  76 */     return this.beneficiarioPol;
/*     */   }
/*     */   public void setBeneficiarioPol(String beneficiarioPol) {
/*  79 */     this.beneficiarioPol = beneficiarioPol;
/*     */   }
/*     */   public Double getCapitaleAttesoPol() {
/*  82 */     return this.capitaleAttesoPol;
/*     */   }
/*     */   public void setCapitaleAttesoPol(Double capitaleAttesoPol) {
/*  85 */     this.capitaleAttesoPol = capitaleAttesoPol;
/*     */   }
/*     */   public Double getCapitaleInizialePol() {
/*  88 */     return this.capitaleInizialePol;
/*     */   }
/*     */   public void setCapitaleInizialePol(Double capitaleInizialePol) {
/*  91 */     this.capitaleInizialePol = capitaleInizialePol;
/*     */   }
/*     */   public Double getConsistenzaPol() {
/*  94 */     return this.consistenzaPol;
/*     */   }
/*     */   public void setConsistenzaPol(Double consistenzaPol) {
/*  97 */     this.consistenzaPol = consistenzaPol;
/*     */   }
/*     */   public String getContraentePol() {
/* 100 */     return this.contraentePol;
/*     */   }
/*     */   public void setContraentePol(String contraentePol) {
/* 103 */     this.contraentePol = contraentePol;
/*     */   }
/*     */   public Date getDataConsistenzaPol() {
/* 106 */     return this.dataConsistenzaPol;
/*     */   }
/*     */   public void setDataConsistenzaPol(Date dataConsistenzaPol) {
/* 109 */     this.dataConsistenzaPol = dataConsistenzaPol;
/*     */   }
/*     */   public Date getDataFinePol() {
/* 112 */     return this.dataFinePol;
/*     */   }
/*     */   public void setDataFinePol(Date dataFinePol) {
/* 115 */     this.dataFinePol = dataFinePol;
/*     */   }
/*     */   public Date getDataInizioPol() {
/* 118 */     return this.dataInizioPol;
/*     */   }
/*     */   public void setDataInizioPol(Date dataInizioPol) {
/* 121 */     this.dataInizioPol = dataInizioPol;
/*     */   }
/*     */   public Date getDataQuietanzaPol() {
/* 124 */     return this.dataQuietanzaPol;
/*     */   }
/*     */   public void setDataQuietanzaPol(Date dataQuietanzaPol) {
/* 127 */     this.dataQuietanzaPol = dataQuietanzaPol;
/*     */   }
/*     */   public Integer getDeducibilePol() {
/* 130 */     return this.deducibilePol;
/*     */   }
/*     */   public void setDeducibilePol(Integer deducibilePol) {
/* 133 */     this.deducibilePol = deducibilePol;
/*     */   }
/*     */   public String getFaseAttualePol() {
/* 136 */     return this.faseAttualePol;
/*     */   }
/*     */   public void setFaseAttualePol(String faseAttualePol) {
/* 139 */     this.faseAttualePol = faseAttualePol;
/*     */   }
/*     */   public String getFrequenzaPol() {
/* 142 */     return this.frequenzaPol;
/*     */   }
/*     */   public void setFrequenzaPol(String frequenzaPol) {
/* 145 */     this.frequenzaPol = frequenzaPol;
/*     */   }
/*     */   public String getGapRilevantePol() {
/* 148 */     return this.gapRilevantePol;
/*     */   }
/*     */   public void setGapRilevantePol(String gapRilevantePol) {
/* 151 */     this.gapRilevantePol = gapRilevantePol;
/*     */   }
/*     */   public Double getPremioAnnuoPol() {
/* 154 */     return this.premioAnnuoPol;
/*     */   }
/*     */   public void setPremioAnnuoPol(Double premioAnnuoPol) {
/* 157 */     this.premioAnnuoPol = premioAnnuoPol;
/*     */   }
/*     */   public String getPrestazioneNotaPol() {
/* 160 */     return this.prestazioneNotaPol;
/*     */   }
/*     */   public void setPrestazioneNotaPol(String prestazioneNotaPol) {
/* 163 */     this.prestazioneNotaPol = prestazioneNotaPol;
/*     */   }
/*     */   public Integer getProgressivoPol() {
/* 166 */     return this.progressivoPol;
/*     */   }
/*     */   public void setProgressivoPol(Integer progressivoPol) {
/* 169 */     this.progressivoPol = progressivoPol;
/*     */   }
/*     */   public Double getRenditaAnnuaPol() {
/* 172 */     return this.renditaAnnuaPol;
/*     */   }
/*     */   public void setRenditaAnnuaPol(Double renditaAnnuaPol) {
/* 175 */     this.renditaAnnuaPol = renditaAnnuaPol;
/*     */   }
/*     */   public Double getRenditaDuePol() {
/* 178 */     return this.renditaDuePol;
/*     */   }
/*     */   public void setRenditaDuePol(Double renditaDuePol) {
/* 181 */     this.renditaDuePol = renditaDuePol;
/*     */   }
/*     */   public Double getRenditaSceltaPol() {
/* 184 */     return this.renditaSceltaPol;
/*     */   }
/*     */   public void setRenditaSceltaPol(Double renditaSceltaPol) {
/* 187 */     this.renditaSceltaPol = renditaSceltaPol;
/*     */   }
/*     */   public Double getRenditaTassabilePol() {
/* 190 */     return this.renditaTassabilePol;
/*     */   }
/*     */   public void setRenditaTassabilePol(Double renditaTassabilePol) {
/* 193 */     this.renditaTassabilePol = renditaTassabilePol;
/*     */   }
/*     */   public Double getRenditaUnoPol() {
/* 196 */     return this.renditaUnoPol;
/*     */   }
/*     */   public void setRenditaUnoPol(Double renditaUnoPol) {
/* 199 */     this.renditaUnoPol = renditaUnoPol;
/*     */   }
/*     */   public String getTipologiaPol() {
/* 202 */     return this.tipologiaPol;
/*     */   }
/*     */   public void setTipologiaPol(String tipologiaPol) {
/* 205 */     this.tipologiaPol = tipologiaPol;
/*     */   }
/*     */   public String getTipoPremioPol() {
/* 208 */     return this.tipoPremioPol;
/*     */   }
/*     */   public void setTipoPremioPol(String tipoPremioPol) {
/* 211 */     this.tipoPremioPol = tipoPremioPol;
/*     */   }
/*     */   public String getTipoRenditaPol() {
/* 214 */     return this.tipoRenditaPol;
/*     */   }
/*     */   public void setTipoRenditaPol(String tipoRenditaPol) {
/* 217 */     this.tipoRenditaPol = tipoRenditaPol;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpPolizze.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */