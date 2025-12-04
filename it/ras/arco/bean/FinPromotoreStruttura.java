/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ public class FinPromotoreStruttura
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer promotoreStrutturaId;
/*     */   private Integer promotoreFiglioId;
/*     */   private Integer promotorePadreId;
/*     */   private String codiceIstituto;
/*     */   private String livelloStrutturaFiglio;
/*     */   private String livelloStrutturaPadre;
/*     */   private String regioneCommerciale;
/*     */   private String distretto;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimentoRecord;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinPromotoreStruttura() {}
/*     */   
/*     */   public FinPromotoreStruttura(Integer promotoreStrutturaId) {
/*  37 */     this.promotoreStrutturaId = promotoreStrutturaId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPromotoreStrutturaId() {
/*  46 */     return this.promotoreStrutturaId;
/*     */   }
/*     */   
/*     */   public void setPromotoreStrutturaId(Integer promotoreStrutturaId) {
/*  50 */     this.promotoreStrutturaId = promotoreStrutturaId;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getPromotoreFiglioId() {
/*  55 */     return this.promotoreFiglioId;
/*     */   }
/*     */   
/*     */   public void setPromotoreFiglioId(Integer promotoreFiglioId) {
/*  59 */     this.promotoreFiglioId = promotoreFiglioId;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getPromotorePadreId() {
/*  64 */     return this.promotorePadreId;
/*     */   }
/*     */   
/*     */   public void setPromotorePadreId(Integer promotorePadreId) {
/*  68 */     this.promotorePadreId = promotorePadreId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodiceIstituto() {
/*  73 */     return this.codiceIstituto;
/*     */   }
/*     */   
/*     */   public void setCodiceIstituto(String codiceIstituto) {
/*  77 */     this.codiceIstituto = codiceIstituto;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLivelloStrutturaFiglio() {
/*  82 */     return this.livelloStrutturaFiglio;
/*     */   }
/*     */   
/*     */   public void setLivelloStrutturaFiglio(String livelloStrutturaFiglio) {
/*  86 */     this.livelloStrutturaFiglio = livelloStrutturaFiglio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLivelloStrutturaPadre() {
/*  91 */     return this.livelloStrutturaPadre;
/*     */   }
/*     */   
/*     */   public void setLivelloStrutturaPadre(String livelloStrutturaPadre) {
/*  95 */     this.livelloStrutturaPadre = livelloStrutturaPadre;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRegioneCommerciale() {
/* 100 */     return this.regioneCommerciale;
/*     */   }
/*     */   
/*     */   public void setRegioneCommerciale(String regioneCommerciale) {
/* 104 */     this.regioneCommerciale = regioneCommerciale;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDistretto() {
/* 109 */     return this.distretto;
/*     */   }
/*     */   
/*     */   public void setDistretto(String distretto) {
/* 113 */     this.distretto = distretto;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/* 118 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 122 */     this.dataInizio = dataInizio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/* 127 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 131 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/* 139 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/* 143 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 151 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 155 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 162 */     return (new ToStringBuilder(this)).append("promotoreStrutturaId", getPromotoreStrutturaId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPromotoreStruttura.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */