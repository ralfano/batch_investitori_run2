/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ public class FinPromotoreCoordinata
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer promotoreCoordinataId;
/*     */   private String abi;
/*     */   private String cab;
/*     */   private String contoCC;
/*     */   private String descrizioneBanca;
/*     */   private String indirizzoBanca;
/*     */   private String capBanca;
/*     */   private String cittaBanca;
/*     */   private String provinciaBanca;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimentoRecord;
/*     */   private String utenteInserimento;
/*     */   private FinPromotore promotore;
/*     */   
/*     */   public String getAbi() {
/*  28 */     return this.abi;
/*     */   }
/*     */   public void setAbi(String abi) {
/*  31 */     this.abi = abi;
/*     */   }
/*     */   public String getCab() {
/*  34 */     return this.cab;
/*     */   }
/*     */   public void setCab(String cab) {
/*  37 */     this.cab = cab;
/*     */   }
/*     */   public String getCapBanca() {
/*  40 */     return this.capBanca;
/*     */   }
/*     */   public void setCapBanca(String capBanca) {
/*  43 */     this.capBanca = capBanca;
/*     */   }
/*     */   public String getCittaBanca() {
/*  46 */     return this.cittaBanca;
/*     */   }
/*     */   public void setCittaBanca(String cittaBanca) {
/*  49 */     this.cittaBanca = cittaBanca;
/*     */   }
/*     */   public String getContoCC() {
/*  52 */     return this.contoCC;
/*     */   }
/*     */   public void setContoCC(String contoCC) {
/*  55 */     this.contoCC = contoCC;
/*     */   }
/*     */   public Date getDataFine() {
/*  58 */     return this.dataFine;
/*     */   }
/*     */   public void setDataFine(Date dataFine) {
/*  61 */     this.dataFine = dataFine;
/*     */   }
/*     */   public Date getDataInizio() {
/*  64 */     return this.dataInizio;
/*     */   }
/*     */   public void setDataInizio(Date dataInizio) {
/*  67 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   public Date getDataInserimentoRecord() {
/*  70 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/*  73 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public String getDescrizioneBanca() {
/*  77 */     return this.descrizioneBanca;
/*     */   }
/*     */   public void setDescrizioneBanca(String descrizioneBanca) {
/*  80 */     this.descrizioneBanca = descrizioneBanca;
/*     */   }
/*     */   
/*     */   public String getIndirizzoBanca() {
/*  84 */     return this.indirizzoBanca;
/*     */   }
/*     */   public void setIndirizzoBanca(String indirizzoBanca) {
/*  87 */     this.indirizzoBanca = indirizzoBanca;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreCoordinataId() {
/*  91 */     return this.promotoreCoordinataId;
/*     */   }
/*     */   public void setPromotoreCoordinataId(Integer promotoreCoordinataId) {
/*  94 */     this.promotoreCoordinataId = promotoreCoordinataId;
/*     */   }
/*     */   public String getProvinciaBanca() {
/*  97 */     return this.provinciaBanca;
/*     */   }
/*     */   public void setProvinciaBanca(String provinciaBanca) {
/* 100 */     this.provinciaBanca = provinciaBanca;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 104 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 107 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public FinPromotore getPromotore() {
/* 110 */     return this.promotore;
/*     */   }
/*     */   public void setPromotore(FinPromotore promotore) {
/* 113 */     this.promotore = promotore;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 117 */     return (new ToStringBuilder(this)).append("promotoreCoordinataId", getPromotoreCoordinataId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPromotoreCoordinata.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */