/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ public class FinCrm4
/*     */   extends RasORMBean
/*     */   implements Serializable {
/*     */   private Integer crm4Id;
/*     */   private Integer promotoreId;
/*     */   private Integer prodottoId;
/*     */   private String codiceProdottoEsterno;
/*     */   private String codiceLineaEsterno;
/*     */   private String causaleProvvigionale;
/*     */   private Date dataCompetenza;
/*     */   private Double importoProvvigione;
/*     */   private String societaProdotto;
/*     */   private String tipoProdotto;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String gradoGerarchico;
/*     */   private Date dataInserimentoRecord;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinCrm4() {}
/*     */   
/*     */   public FinCrm4(Integer crm4Id) {
/*  30 */     this.crm4Id = crm4Id;
/*     */   }
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  34 */     return this.causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  38 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  42 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  46 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceLineaEsterno() {
/*  50 */     return this.codiceLineaEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceLineaEsterno(String codiceLineaEsterno) {
/*  54 */     this.codiceLineaEsterno = codiceLineaEsterno;
/*     */   }
/*     */   
/*     */   public String getCodiceProdottoEsterno() {
/*  58 */     return this.codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoEsterno(String codiceProdottoEsterno) {
/*  62 */     this.codiceProdottoEsterno = codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/*  66 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/*  70 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public Integer getCrm4Id() {
/*  74 */     return this.crm4Id;
/*     */   }
/*     */   
/*     */   public void setCrm4Id(Integer crm4Id) {
/*  78 */     this.crm4Id = crm4Id;
/*     */   }
/*     */   
/*     */   public Date getDataCompetenza() {
/*  82 */     return this.dataCompetenza;
/*     */   }
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/*  86 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/*  90 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/*  94 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public String getGradoGerarchico() {
/*  98 */     return this.gradoGerarchico;
/*     */   }
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/* 102 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigione() {
/* 106 */     return this.importoProvvigione;
/*     */   }
/*     */   
/*     */   public void setImportoProvvigione(Double importoProvvigione) {
/* 110 */     this.importoProvvigione = importoProvvigione;
/*     */   }
/*     */   
/*     */   public Integer getProdottoId() {
/* 114 */     return this.prodottoId;
/*     */   }
/*     */   
/*     */   public void setProdottoId(Integer prodottoId) {
/* 118 */     this.prodottoId = prodottoId;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreId() {
/* 122 */     return this.promotoreId;
/*     */   }
/*     */   
/*     */   public void setPromotoreId(Integer promotoreId) {
/* 126 */     this.promotoreId = promotoreId;
/*     */   }
/*     */   
/*     */   public String getSocietaProdotto() {
/* 130 */     return this.societaProdotto;
/*     */   }
/*     */   
/*     */   public void setSocietaProdotto(String societaProdotto) {
/* 134 */     this.societaProdotto = societaProdotto;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 138 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 142 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 146 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 150 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 154 */     return (new ToStringBuilder(this)).append("crm4Id", getCrm4Id()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCrm4.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */