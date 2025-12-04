/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FinNocUpgrade
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer id;
/*     */   private String codicePromotore;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String denominazioneCliente;
/*     */   private String rapporto;
/*     */   private String codConvOld;
/*     */   private String descConvOld;
/*     */   private String codConvNew;
/*     */   private String descConvNew;
/*     */   private String codiceFascia;
/*     */   private Date dataRicezione;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public Date getDataInserimento() {
/*  28 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  32 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/*  36 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  40 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodConvNew() {
/*  46 */     return this.codConvNew;
/*     */   }
/*     */   
/*     */   public void setCodConvNew(String codConvNew) {
/*  50 */     this.codConvNew = codConvNew;
/*     */   }
/*     */   
/*     */   public String getCodConvOld() {
/*  54 */     return this.codConvOld;
/*     */   }
/*     */   
/*     */   public void setCodConvOld(String codConvOld) {
/*  58 */     this.codConvOld = codConvOld;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  62 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  66 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceFascia() {
/*  70 */     return this.codiceFascia;
/*     */   }
/*     */   
/*     */   public void setCodiceFascia(String codiceFascia) {
/*  74 */     this.codiceFascia = codiceFascia;
/*     */   }
/*     */   
/*     */   public String getCodicePromotore() {
/*  78 */     return this.codicePromotore;
/*     */   }
/*     */   
/*     */   public void setCodicePromotore(String codicePromotore) {
/*  82 */     this.codicePromotore = codicePromotore;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/*  86 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/*  90 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public Date getDataRicezione() {
/*  94 */     return this.dataRicezione;
/*     */   }
/*     */   
/*     */   public void setDataRicezione(Date dataRicezione) {
/*  98 */     this.dataRicezione = dataRicezione;
/*     */   }
/*     */   
/*     */   public String getDenominazioneCliente() {
/* 102 */     return this.denominazioneCliente;
/*     */   }
/*     */   
/*     */   public void setDenominazioneCliente(String denominazioneCliente) {
/* 106 */     this.denominazioneCliente = denominazioneCliente;
/*     */   }
/*     */   
/*     */   public String getDescConvNew() {
/* 110 */     return this.descConvNew;
/*     */   }
/*     */   
/*     */   public void setDescConvNew(String descConvNew) {
/* 114 */     this.descConvNew = descConvNew;
/*     */   }
/*     */   
/*     */   public String getDescConvOld() {
/* 118 */     return this.descConvOld;
/*     */   }
/*     */   
/*     */   public void setDescConvOld(String descConvOld) {
/* 122 */     this.descConvOld = descConvOld;
/*     */   }
/*     */   
/*     */   public Integer getId() {
/* 126 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(Integer id) {
/* 130 */     this.id = id;
/*     */   }
/*     */   
/*     */   public String getRapporto() {
/* 134 */     return this.rapporto;
/*     */   }
/*     */   
/*     */   public void setRapporto(String rapporto) {
/* 138 */     this.rapporto = rapporto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinNocUpgrade.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */