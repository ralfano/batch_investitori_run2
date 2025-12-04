/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ public class FinCrm3
/*     */   extends RasORMBean
/*     */   implements Serializable {
/*     */   private Integer crm3Id;
/*     */   private Integer promotoreId;
/*     */   private String causaleProvvigionale;
/*     */   private Date dataCompetenza;
/*     */   private Double importoProvvigione;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String gradoGerarchico;
/*     */   private Date dataInserimentoRecord;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinCrm3() {}
/*     */   
/*     */   public FinCrm3(Integer crm3Id) {
/*  25 */     this.crm3Id = crm3Id;
/*     */   }
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  29 */     return this.causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  33 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  37 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  41 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/*  45 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/*  49 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public Integer getCrm3Id() {
/*  53 */     return this.crm3Id;
/*     */   }
/*     */   
/*     */   public void setCrm3Id(Integer crm3Id) {
/*  57 */     this.crm3Id = crm3Id;
/*     */   }
/*     */   
/*     */   public Date getDataCompetenza() {
/*  61 */     return this.dataCompetenza;
/*     */   }
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/*  65 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/*  69 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/*  73 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public String getGradoGerarchico() {
/*  77 */     return this.gradoGerarchico;
/*     */   }
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/*  81 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigione() {
/*  85 */     return this.importoProvvigione;
/*     */   }
/*     */   
/*     */   public void setImportoProvvigione(Double importoProvvigione) {
/*  89 */     this.importoProvvigione = importoProvvigione;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreId() {
/*  93 */     return this.promotoreId;
/*     */   }
/*     */   
/*     */   public void setPromotoreId(Integer promotoreId) {
/*  97 */     this.promotoreId = promotoreId;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 101 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 105 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 109 */     return (new ToStringBuilder(this)).append("crm3Id", getCrm3Id()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCrm3.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */