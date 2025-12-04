/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ public class FinCrm2
/*     */   extends RasORMBean
/*     */   implements Serializable {
/*     */   private Integer crm2Id;
/*     */   private Integer promotoreId;
/*     */   private Integer prodottoId;
/*     */   private Integer contrattoId;
/*     */   private String codiceProdottoEsterno;
/*     */   private String codiceLineaEsterno;
/*     */   private String numeroContratto;
/*     */   private String causaleProvvigionale;
/*     */   private Date dataCompetenza;
/*     */   private Double importoPayIn;
/*     */   private Double importoProvvigioniDiretteManagement;
/*     */   private Double importoProvvigioniOverManagement;
/*     */   private String flagDiretteOver;
/*     */   private String societaProdotto;
/*     */   private String tipoProdotto;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String gradoGerarchico;
/*     */   private Double baseSpeseStandard;
/*     */   private Date dataInserimentoRecord;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinCrm2() {}
/*     */   
/*     */   public FinCrm2(Integer crm2Id) {
/*  36 */     this.crm2Id = crm2Id;
/*     */   }
/*     */   
/*     */   public Double getBaseSpeseStandard() {
/*  40 */     return this.baseSpeseStandard;
/*     */   }
/*     */   
/*     */   public void setBaseSpeseStandard(Double baseSpeseStandard) {
/*  44 */     this.baseSpeseStandard = baseSpeseStandard;
/*     */   }
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  48 */     return this.causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  52 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  56 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  60 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceLineaEsterno() {
/*  64 */     return this.codiceLineaEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceLineaEsterno(String codiceLineaEsterno) {
/*  68 */     this.codiceLineaEsterno = codiceLineaEsterno;
/*     */   }
/*     */   
/*     */   public String getCodiceProdottoEsterno() {
/*  72 */     return this.codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoEsterno(String codiceProdottoEsterno) {
/*  76 */     this.codiceProdottoEsterno = codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/*  80 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/*  84 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/*  88 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/*  92 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public Integer getCrm2Id() {
/*  96 */     return this.crm2Id;
/*     */   }
/*     */   
/*     */   public void setCrm2Id(Integer crm2Id) {
/* 100 */     this.crm2Id = crm2Id;
/*     */   }
/*     */   
/*     */   public Date getDataCompetenza() {
/* 104 */     return this.dataCompetenza;
/*     */   }
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 108 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/* 112 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/* 116 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public String getFlagDiretteOver() {
/* 120 */     return this.flagDiretteOver;
/*     */   }
/*     */   
/*     */   public void setFlagDiretteOver(String flagDiretteOver) {
/* 124 */     this.flagDiretteOver = flagDiretteOver;
/*     */   }
/*     */   
/*     */   public String getGradoGerarchico() {
/* 128 */     return this.gradoGerarchico;
/*     */   }
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/* 132 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */   
/*     */   public Double getImportoPayIn() {
/* 136 */     return this.importoPayIn;
/*     */   }
/*     */   
/*     */   public void setImportoPayIn(Double importoPayIn) {
/* 140 */     this.importoPayIn = importoPayIn;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigioniDiretteManagement() {
/* 144 */     return this.importoProvvigioniDiretteManagement;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setImportoProvvigioniDiretteManagement(Double importoProvvigioniDiretteManagement) {
/* 149 */     this.importoProvvigioniDiretteManagement = importoProvvigioniDiretteManagement;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigioniOverManagement() {
/* 153 */     return this.importoProvvigioniOverManagement;
/*     */   }
/*     */   
/*     */   public void setImportoProvvigioniOverManagement(Double importoProvvigioniOverManagement) {
/* 157 */     this.importoProvvigioniOverManagement = importoProvvigioniOverManagement;
/*     */   }
/*     */   
/*     */   public String getNumeroContratto() {
/* 161 */     return this.numeroContratto;
/*     */   }
/*     */   
/*     */   public void setNumeroContratto(String numeroContratto) {
/* 165 */     this.numeroContratto = numeroContratto;
/*     */   }
/*     */   
/*     */   public Integer getProdottoId() {
/* 169 */     return this.prodottoId;
/*     */   }
/*     */   
/*     */   public void setProdottoId(Integer prodottoId) {
/* 173 */     this.prodottoId = prodottoId;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreId() {
/* 177 */     return this.promotoreId;
/*     */   }
/*     */   
/*     */   public void setPromotoreId(Integer promotoreId) {
/* 181 */     this.promotoreId = promotoreId;
/*     */   }
/*     */   
/*     */   public String getSocietaProdotto() {
/* 185 */     return this.societaProdotto;
/*     */   }
/*     */   
/*     */   public void setSocietaProdotto(String societaProdotto) {
/* 189 */     this.societaProdotto = societaProdotto;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 193 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 197 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 201 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 205 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 209 */     return (new ToStringBuilder(this)).append("crm2Id", getCrm2Id()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCrm2.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */