/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ public class FinSegnalazioniCCDTTitoli
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer SegnalCCDTTitoliId;
/*     */   private String abiIsin;
/*     */   private String descrizione;
/*     */   private String intestatario;
/*     */   private Integer quantita;
/*     */   private FinSegnalazioniCCDT segnalazioniCCDT;
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
/*     */ 
/*     */   
/*     */   public FinSegnalazioniCCDTTitoli(String esistenza, Set praticabozza, String slave, FinPromotore promotore, Integer id, FinSoggetto soggetto, Set bozza, String operazione, String modifica, String slave2, String inserimento) {
/*  54 */     this.flagEsistenza = esistenza;
/*  55 */     this.proceduraUltimaModificaSlave = slave;
/*  56 */     this.SegnalCCDTTitoliId = id;
/*  57 */     this.tipoUltimaModifica = modifica;
/*  58 */     this.userUltimaModificaSlave = slave2;
/*  59 */     this.utenteInserimento = inserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSegnalazioniCCDTTitoli() {}
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/*  68 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  72 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/*  76 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  80 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/*  84 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*  88 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/*  92 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/*  96 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 100 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 104 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public Integer getSegnalazioniCCDTId() {
/* 108 */     return this.SegnalCCDTTitoliId;
/*     */   }
/*     */   
/*     */   public void setSegnalazioniCCDTId(Integer segnalazioniCCDTId) {
/* 112 */     this.SegnalCCDTTitoliId = segnalazioniCCDTId;
/*     */   }
/*     */   
/*     */   public String getAbiIsin() {
/* 116 */     return this.abiIsin;
/*     */   }
/*     */   
/*     */   public void setAbiIsin(String abiIsin) {
/* 120 */     this.abiIsin = abiIsin;
/*     */   }
/*     */   
/*     */   public String getDescrizione() {
/* 124 */     return this.descrizione;
/*     */   }
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/* 128 */     this.descrizione = descrizione;
/*     */   }
/*     */   
/*     */   public String getIntestatario() {
/* 132 */     return this.intestatario;
/*     */   }
/*     */   
/*     */   public void setIntestatario(String intestatario) {
/* 136 */     this.intestatario = intestatario;
/*     */   }
/*     */   
/*     */   public Integer getQuantita() {
/* 140 */     return this.quantita;
/*     */   }
/*     */   
/*     */   public void setQuantita(Integer quantita) {
/* 144 */     this.quantita = quantita;
/*     */   }
/*     */   
/*     */   public Integer getSegnalCCDTTitoliId() {
/* 148 */     return this.SegnalCCDTTitoliId;
/*     */   }
/*     */   
/*     */   public void setSegnalCCDTTitoliId(Integer segnalCCDTTitoliId) {
/* 152 */     this.SegnalCCDTTitoliId = segnalCCDTTitoliId;
/*     */   }
/*     */   
/*     */   public FinSegnalazioniCCDT getSegnalazioniCCDT() {
/* 156 */     return this.segnalazioniCCDT;
/*     */   }
/*     */   
/*     */   public void setSegnalazioniCCDT(FinSegnalazioniCCDT segnalazioniCCDT) {
/* 160 */     this.segnalazioniCCDT = segnalazioniCCDT;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSegnalazioniCCDTTitoli.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */