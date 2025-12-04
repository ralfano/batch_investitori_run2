/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FinBonifico
/*     */   extends RasORMBean
/*     */ {
/*     */   private Integer bonificoId;
/*     */   private FinPromotore promotore;
/*     */   private FinContratto ordinante;
/*     */   private FinSoggetto soggettoOrdinante;
/*     */   private FinContratto beneficiario;
/*     */   private String descrizioneBeneficiario;
/*     */   private String croBonifico;
/*     */   private Date dataValutaBeneficiario;
/*     */   private Date dataInserimentoBonifico;
/*     */   private String causale;
/*     */   private Double importo;
/*     */   private String abiBeneficiario;
/*     */   private String cabBeneficiario;
/*     */   private String intestatario;
/*     */   private String mandato;
/*     */   private String tipoFondoBeneficiario;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   
/*     */   public String getAbiBeneficiario() {
/*  35 */     return this.abiBeneficiario;
/*     */   }
/*     */   public void setAbiBeneficiario(String abiBeneficiario) {
/*  38 */     this.abiBeneficiario = abiBeneficiario;
/*     */   }
/*     */   public Integer getBonificoId() {
/*  41 */     return this.bonificoId;
/*     */   }
/*     */   public void setBonificoId(Integer bonificoId) {
/*  44 */     this.bonificoId = bonificoId;
/*     */   }
/*     */   public String getCabBeneficiario() {
/*  47 */     return this.cabBeneficiario;
/*     */   }
/*     */   public void setCabBeneficiario(String cabBeneficiario) {
/*  50 */     this.cabBeneficiario = cabBeneficiario;
/*     */   }
/*     */   public String getIntestatario() {
/*  53 */     return this.intestatario;
/*     */   }
/*     */   public void setIntestatario(String intestatario) {
/*  56 */     this.intestatario = intestatario;
/*     */   }
/*     */   public String getMandato() {
/*  59 */     return this.mandato;
/*     */   }
/*     */   public void setMandato(String mandato) {
/*  62 */     this.mandato = mandato;
/*     */   }
/*     */   public String getTipoFondoBeneficiario() {
/*  65 */     return this.tipoFondoBeneficiario;
/*     */   }
/*     */   public void setTipoFondoBeneficiario(String tipoFondoBeneficiario) {
/*  68 */     this.tipoFondoBeneficiario = tipoFondoBeneficiario;
/*     */   }
/*     */   public FinContratto getBeneficiario() {
/*  71 */     return this.beneficiario;
/*     */   }
/*     */   public void setBeneficiario(FinContratto beneficiario) {
/*  74 */     this.beneficiario = beneficiario;
/*     */   }
/*     */   public String getCausale() {
/*  77 */     return this.causale;
/*     */   }
/*     */   public void setCausale(String causale) {
/*  80 */     this.causale = causale;
/*     */   }
/*     */   public String getCroBonifico() {
/*  83 */     return this.croBonifico;
/*     */   }
/*     */   public void setCroBonifico(String croBonifico) {
/*  86 */     this.croBonifico = croBonifico;
/*     */   }
/*     */   public Date getDataInserimento() {
/*  89 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  92 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataValutaBeneficiario() {
/*  95 */     return this.dataValutaBeneficiario;
/*     */   }
/*     */   public void setDataValutaBeneficiario(Date dataValutaBeneficiario) {
/*  98 */     this.dataValutaBeneficiario = dataValutaBeneficiario;
/*     */   }
/*     */   public String getDescrizioneBeneficiario() {
/* 101 */     return this.descrizioneBeneficiario;
/*     */   }
/*     */   public void setDescrizioneBeneficiario(String descrizioneBeneficiario) {
/* 104 */     this.descrizioneBeneficiario = descrizioneBeneficiario;
/*     */   }
/*     */   public Double getImporto() {
/* 107 */     return this.importo;
/*     */   }
/*     */   public void setImporto(Double importo) {
/* 110 */     this.importo = importo;
/*     */   }
/*     */   public FinContratto getOrdinante() {
/* 113 */     return this.ordinante;
/*     */   }
/*     */   public void setOrdinante(FinContratto ordinante) {
/* 116 */     this.ordinante = ordinante;
/*     */   }
/*     */   public FinPromotore getPromotore() {
/* 119 */     return this.promotore;
/*     */   }
/*     */   public void setPromotore(FinPromotore promotore) {
/* 122 */     this.promotore = promotore;
/*     */   }
/*     */   public FinSoggetto getSoggettoOrdinante() {
/* 125 */     return this.soggettoOrdinante;
/*     */   }
/*     */   public void setSoggettoOrdinante(FinSoggetto soggettoOrdinante) {
/* 128 */     this.soggettoOrdinante = soggettoOrdinante;
/*     */   }
/*     */   public Date getDataInserimentoBonifico() {
/* 131 */     return this.dataInserimentoBonifico;
/*     */   }
/*     */   public void setDataInserimentoBonifico(Date dataInserimentoBonifico) {
/* 134 */     this.dataInserimentoBonifico = dataInserimentoBonifico;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/* 137 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 140 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public String getFlagEsistenza() {
/* 143 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 146 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/* 149 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 152 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/* 155 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 158 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModifica() {
/* 161 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 164 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 167 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 170 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinBonifico.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */