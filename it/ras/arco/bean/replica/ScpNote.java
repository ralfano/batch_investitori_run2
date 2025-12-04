/*     */ package it.ras.arco.bean.replica;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScpNote
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private ScpProdotti prodotti;
/*     */   private Integer notaId;
/*     */   private String testoFisso;
/*     */   private Integer testoVariabile;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataUltimaModificaSlave;
/*     */   private String tipoUltimaModificaSlave;
/*     */   
/*     */   public Date getDataInserimento() {
/*  43 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  47 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  51 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  55 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModificaSlave() {
/*  59 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/*  63 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/*  67 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  71 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/*  75 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/*  79 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/*  83 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*  87 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public ScpProdotti getProdotti() {
/*  91 */     return this.prodotti;
/*     */   }
/*     */   
/*     */   public void setProdotti(ScpProdotti prodotti) {
/*  95 */     this.prodotti = prodotti;
/*     */   }
/*     */   
/*     */   public String getTestoFisso() {
/*  99 */     return this.testoFisso;
/*     */   }
/*     */   
/*     */   public void setTestoFisso(String testoFisso) {
/* 103 */     this.testoFisso = testoFisso;
/*     */   }
/*     */   
/*     */   public Integer getTestoVariabile() {
/* 107 */     return this.testoVariabile;
/*     */   }
/*     */   
/*     */   public void setTestoVariabile(Integer testoVariabile) {
/* 111 */     this.testoVariabile = testoVariabile;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 115 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 119 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModificaSlave() {
/* 123 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 127 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 131 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 135 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 139 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 143 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 147 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 151 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public Integer getNotaId() {
/* 155 */     return this.notaId;
/*     */   }
/*     */   
/*     */   public void setNotaId(Integer notaId) {
/* 159 */     this.notaId = notaId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\replica\ScpNote.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */