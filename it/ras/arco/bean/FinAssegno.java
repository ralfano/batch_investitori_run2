/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class FinAssegno
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer assegnoId;
/*     */   private String numeroCarnet;
/*     */   private String numeroAssegni;
/*     */   private String posizioneAssegno;
/*     */   private String statoAssegno;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinContrattoCC contrattoId;
/*     */   private Date dataEmissione;
/*     */   
/*     */   public Date getDataEmissione() {
/*  22 */     return this.dataEmissione;
/*     */   }
/*     */   
/*     */   public void setDataEmissione(Date dataEmissione) {
/*  26 */     this.dataEmissione = dataEmissione;
/*     */   }
/*     */   
/*     */   public FinContrattoCC getContrattoId() {
/*  30 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(FinContrattoCC contrattoId) {
/*  34 */     this.contrattoId = contrattoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAssegno(Integer id, Date inserimento, Date modifica, String esistenza, String assegni, String carnet, String assegno, String modifica2, String assegno2, String modifica3, String modifica4, String inserimento2) {
/*  40 */     this.assegnoId = id;
/*  41 */     this.dataInserimento = inserimento;
/*  42 */     this.dataUltimaModifica = modifica;
/*  43 */     this.flagEsistenza = esistenza;
/*     */     
/*  45 */     this.numeroAssegni = assegni;
/*  46 */     this.numeroCarnet = carnet;
/*  47 */     this.posizioneAssegno = assegno;
/*  48 */     this.proceduraUltimaModifica = modifica2;
/*  49 */     this.statoAssegno = assegno2;
/*  50 */     this.tipoUltimaModifica = modifica3;
/*  51 */     this.userUltimaModifica = modifica4;
/*  52 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAssegno() {}
/*     */ 
/*     */   
/*     */   public Integer getAssegnoId() {
/*  61 */     return this.assegnoId;
/*     */   }
/*     */   
/*     */   public void setAssegnoId(Integer assegnoId) {
/*  65 */     this.assegnoId = assegnoId;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/*  69 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  73 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  77 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  81 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/*  85 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  89 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNumeroAssegni() {
/*  94 */     return this.numeroAssegni;
/*     */   }
/*     */   
/*     */   public void setNumeroAssegni(String numeroAssegni) {
/*  98 */     this.numeroAssegni = numeroAssegni;
/*     */   }
/*     */   
/*     */   public String getNumeroCarnet() {
/* 102 */     return this.numeroCarnet;
/*     */   }
/*     */   
/*     */   public void setNumeroCarnet(String numeroCarnet) {
/* 106 */     this.numeroCarnet = numeroCarnet;
/*     */   }
/*     */   
/*     */   public String getPosizioneAssegno() {
/* 110 */     return this.posizioneAssegno;
/*     */   }
/*     */   
/*     */   public void setPosizioneAssegno(String posizioneAssegno) {
/* 114 */     this.posizioneAssegno = posizioneAssegno;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 118 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 122 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getStatoAssegno() {
/* 126 */     return this.statoAssegno;
/*     */   }
/*     */   
/*     */   public void setStatoAssegno(String statoAssegno) {
/* 130 */     this.statoAssegno = statoAssegno;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 134 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 138 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 142 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 146 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 150 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 154 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAssegno.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */