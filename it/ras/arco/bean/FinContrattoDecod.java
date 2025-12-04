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
/*     */ public class FinContrattoDecod
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contattoDecodId;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String contrattoId;
/*     */   private String decodNdgFabbrOldId;
/*     */   private String decodNdgFabbrNewId;
/*     */   
/*     */   public Integer getContattoDecodId() {
/*  34 */     return this.contattoDecodId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContattoDecodId(Integer contattoDecodId) {
/*  41 */     this.contattoDecodId = contattoDecodId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  51 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  58 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  65 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  72 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/*  77 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  84 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/*  91 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/*  98 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 105 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 112 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 119 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 126 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 133 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 140 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getContrattoId() {
/* 145 */     return this.contrattoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setContrattoId(String contrattoId) {
/* 150 */     this.contrattoId = contrattoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDecodNdgFabbrNewId() {
/* 155 */     return this.decodNdgFabbrNewId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDecodNdgFabbrNewId(String decodNdgFabbrNewId) {
/* 160 */     this.decodNdgFabbrNewId = decodNdgFabbrNewId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDecodNdgFabbrOldId() {
/* 165 */     return this.decodNdgFabbrOldId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDecodNdgFabbrOldId(String decodNdgFabbrOldId) {
/* 170 */     this.decodNdgFabbrOldId = decodNdgFabbrOldId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrattoDecod.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */