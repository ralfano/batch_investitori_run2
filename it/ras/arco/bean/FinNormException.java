/*     */ package it.ras.arco.bean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinNormException
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer normExceptionId;
/*     */   private String errornumber;
/*     */   private String application;
/*     */   private String livelloDiWarning;
/*     */   private String errorKey;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataInserimento;
/*     */   
/*     */   public Date getDataInserimento() {
/*  44 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  48 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/*  52 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*  57 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/*  61 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/*  65 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/*  69 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/*  73 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/*  77 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  81 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getApplication() {
/*  87 */     return this.application;
/*     */   }
/*     */   
/*     */   public void setApplication(String application) {
/*  91 */     this.application = application;
/*     */   }
/*     */   
/*     */   public String getErrorKey() {
/*  95 */     return this.errorKey;
/*     */   }
/*     */   
/*     */   public void setErrorKey(String errorKey) {
/*  99 */     this.errorKey = errorKey;
/*     */   }
/*     */   
/*     */   public String getErrornumber() {
/* 103 */     return this.errornumber;
/*     */   }
/*     */   
/*     */   public void setErrornumber(String errornumber) {
/* 107 */     this.errornumber = errornumber;
/*     */   }
/*     */   
/*     */   public String getLivelloDiWarning() {
/* 111 */     return this.livelloDiWarning;
/*     */   }
/*     */   
/*     */   public void setLivelloDiWarning(String livelloDiWarning) {
/* 115 */     this.livelloDiWarning = livelloDiWarning;
/*     */   }
/*     */   
/*     */   public Integer getNormExceptionId() {
/* 119 */     return this.normExceptionId;
/*     */   }
/*     */   
/*     */   public void setNormExceptionId(Integer normExceptionId) {
/* 123 */     this.normExceptionId = normExceptionId;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 127 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 131 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinNormException.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */