/*     */ package it.ras.arco.bean.replica;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ public class ScpSemaforo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer semaforoId;
/*     */   private String colore;
/*     */   private Set elenchi;
/*     */   private String intestatarioScp;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Integer validita;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String codiceFiscale;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataUltimaModificaSlave;
/*     */   private String tipoUltimaModificaSlave;
/*     */   
/*     */   public Date getDataFine() {
/*  34 */     return this.dataFine;
/*     */   }
/*     */   public void setDataFine(Date dataFineD) {
/*  37 */     this.dataFine = dataFineD;
/*     */   }
/*     */   public Date getDataInizio() {
/*  40 */     return this.dataInizio;
/*     */   }
/*     */   public void setDataInizio(Date dataInizioD) {
/*  43 */     this.dataInizio = dataInizioD;
/*     */   }
/*     */   public Date getDataInserimento() {
/*  46 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  49 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/*  52 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  55 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public Date getDataUltimaModificaSlave() {
/*  58 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/*  61 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   public Set getElenchi() {
/*  64 */     return this.elenchi;
/*     */   }
/*     */   public void setElenchi(Set elencoSemafori) {
/*  67 */     this.elenchi = elencoSemafori;
/*     */   }
/*     */   public String getFlagEsistenza() {
/*  70 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  73 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public String getIntestatarioScp() {
/*  76 */     return this.intestatarioScp;
/*     */   }
/*     */   public void setIntestatarioScp(String intestatarioScpS) {
/*  79 */     this.intestatarioScp = intestatarioScpS;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/*  82 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/*  85 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public String getProceduraUltimaModificaSlave() {
/*  88 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*  91 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/*  94 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/*  97 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getTipoUltimaModificaSlave() {
/* 100 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 103 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   public String getUserUltimaModifica() {
/* 106 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 109 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModificaSlave() {
/* 112 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 115 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 118 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 121 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public Integer getValidita() {
/* 124 */     return this.validita;
/*     */   }
/*     */   public void setValidita(Integer validita) {
/* 127 */     this.validita = validita;
/*     */   }
/*     */   public Integer getSemaforoId() {
/* 130 */     return this.semaforoId;
/*     */   }
/*     */   public void setSemaforoId(Integer semaforoId) {
/* 133 */     this.semaforoId = semaforoId;
/*     */   }
/*     */   public String getColore() {
/* 136 */     return this.colore;
/*     */   }
/*     */   public void setColore(String coloreS) {
/* 139 */     this.colore = coloreS;
/*     */   }
/*     */   public String getCodiceFiscale() {
/* 142 */     return this.codiceFiscale;
/*     */   }
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 145 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\replica\ScpSemaforo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */