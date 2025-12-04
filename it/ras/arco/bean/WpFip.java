/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WpFip
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivoFip;
/*     */   private Date dataFineFip;
/*     */   private Double premioAnnuo;
/*     */   private Double consistenza;
/*     */   private Double renditaUno;
/*     */   private Double renditaDue;
/*     */   private String renditaScelta;
/*     */   private Double renditaTassabile;
/*     */   private String descrizioneFip;
/*     */   private String gapRilevante;
/*     */   private String contraenteFip;
/*     */   private String beneficiarioFip;
/*     */   private String frequenzaFip;
/*     */   private String tipoPremio;
/*     */   private String faseAttuale;
/*     */   private Date dataConsistenza;
/*     */   private Integer matriceTransUtenteIdFip;
/*     */   
/*     */   public WpFip(String fip, Double consistenza, String fip2, Date consistenza2, Date fip3, String fip4, String attuale, String fip5, String rilevante, Integer fip6, Double annuo, Integer fip7, Double due, String scelta, Double tassabile, Double uno, String premio) {
/*  32 */     this.beneficiarioFip = fip;
/*  33 */     this.consistenza = consistenza;
/*  34 */     this.contraenteFip = fip2;
/*  35 */     this.dataConsistenza = consistenza2;
/*  36 */     this.dataFineFip = fip3;
/*  37 */     this.descrizioneFip = fip4;
/*  38 */     this.faseAttuale = attuale;
/*  39 */     this.frequenzaFip = fip5;
/*  40 */     this.gapRilevante = rilevante;
/*  41 */     this.matriceTransUtenteIdFip = fip6;
/*  42 */     this.premioAnnuo = annuo;
/*  43 */     this.progressivoFip = fip7;
/*  44 */     this.renditaDue = due;
/*  45 */     this.renditaScelta = scelta;
/*  46 */     this.renditaTassabile = tassabile;
/*  47 */     this.renditaUno = uno;
/*  48 */     this.tipoPremio = premio;
/*     */   }
/*     */ 
/*     */   
/*     */   public WpFip() {}
/*     */ 
/*     */   
/*     */   public WpFip(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  56 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */   
/*     */   public String getBeneficiarioFip() {
/*  60 */     return this.beneficiarioFip;
/*     */   }
/*     */   public void setBeneficiarioFip(String beneficiarioFip) {
/*  63 */     this.beneficiarioFip = beneficiarioFip;
/*     */   }
/*     */   public Double getConsistenza() {
/*  66 */     return this.consistenza;
/*     */   }
/*     */   public void setConsistenza(Double consistenza) {
/*  69 */     this.consistenza = consistenza;
/*     */   }
/*     */   public String getContraenteFip() {
/*  72 */     return this.contraenteFip;
/*     */   }
/*     */   public void setContraenteFip(String contraenteFip) {
/*  75 */     this.contraenteFip = contraenteFip;
/*     */   }
/*     */   public Date getDataConsistenza() {
/*  78 */     return this.dataConsistenza;
/*     */   }
/*     */   public void setDataConsistenza(Date dataConsistenza) {
/*  81 */     this.dataConsistenza = dataConsistenza;
/*     */   }
/*     */   public Date getDataFineFip() {
/*  84 */     return this.dataFineFip;
/*     */   }
/*     */   public void setDataFineFip(Date dataFineFip) {
/*  87 */     this.dataFineFip = dataFineFip;
/*     */   }
/*     */   public String getDescrizioneFip() {
/*  90 */     return this.descrizioneFip;
/*     */   }
/*     */   public void setDescrizioneFip(String descrizioneFip) {
/*  93 */     this.descrizioneFip = descrizioneFip;
/*     */   }
/*     */   public String getFaseAttuale() {
/*  96 */     return this.faseAttuale;
/*     */   }
/*     */   public void setFaseAttuale(String faseAttuale) {
/*  99 */     this.faseAttuale = faseAttuale;
/*     */   }
/*     */   public String getFrequenzaFip() {
/* 102 */     return this.frequenzaFip;
/*     */   }
/*     */   public void setFrequenzaFip(String frequenzaFip) {
/* 105 */     this.frequenzaFip = frequenzaFip;
/*     */   }
/*     */   public String getGapRilevante() {
/* 108 */     return this.gapRilevante;
/*     */   }
/*     */   public void setGapRilevante(String gapRilevante) {
/* 111 */     this.gapRilevante = gapRilevante;
/*     */   }
/*     */   public Integer getMatriceTransUtenteIdFip() {
/* 114 */     return this.matriceTransUtenteIdFip;
/*     */   }
/*     */   public void setMatriceTransUtenteIdFip(Integer matriceTransUtenteIdFip) {
/* 117 */     this.matriceTransUtenteIdFip = matriceTransUtenteIdFip;
/*     */   }
/*     */   public Double getPremioAnnuo() {
/* 120 */     return this.premioAnnuo;
/*     */   }
/*     */   public void setPremioAnnuo(Double premioAnnuo) {
/* 123 */     this.premioAnnuo = premioAnnuo;
/*     */   }
/*     */   public Integer getProgressivoFip() {
/* 126 */     return this.progressivoFip;
/*     */   }
/*     */   public void setProgressivoFip(Integer progressivoFip) {
/* 129 */     this.progressivoFip = progressivoFip;
/*     */   }
/*     */   public Double getRenditaDue() {
/* 132 */     return this.renditaDue;
/*     */   }
/*     */   public void setRenditaDue(Double renditaDue) {
/* 135 */     this.renditaDue = renditaDue;
/*     */   }
/*     */   public String getRenditaScelta() {
/* 138 */     return this.renditaScelta;
/*     */   }
/*     */   public void setRenditaScelta(String renditaScelta) {
/* 141 */     this.renditaScelta = renditaScelta;
/*     */   }
/*     */   public Double getRenditaTassabile() {
/* 144 */     return this.renditaTassabile;
/*     */   }
/*     */   public void setRenditaTassabile(Double renditaTassabile) {
/* 147 */     this.renditaTassabile = renditaTassabile;
/*     */   }
/*     */   public Double getRenditaUno() {
/* 150 */     return this.renditaUno;
/*     */   }
/*     */   public void setRenditaUno(Double renditaUno) {
/* 153 */     this.renditaUno = renditaUno;
/*     */   }
/*     */   public String getTipoPremio() {
/* 156 */     return this.tipoPremio;
/*     */   }
/*     */   public void setTipoPremio(String tipoPremio) {
/* 159 */     this.tipoPremio = tipoPremio;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpFip.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */