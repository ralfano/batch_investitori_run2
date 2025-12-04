/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FinNocMigrazioni
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer id;
/*     */   private String codicePromotore;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String codProcesso;
/*     */   private String rapporto;
/*     */   private String denominazioneCliente;
/*     */   private String fasciaEreditata;
/*     */   private String codConvOld;
/*     */   private String descConvOld;
/*     */   private String codConvNew;
/*     */   private String descConvNew;
/*     */   private Date dataRicezione;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public Date getDataInserimento() {
/*  29 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  33 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/*  37 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  41 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodConvNew() {
/*  47 */     return this.codConvNew;
/*     */   }
/*     */   
/*     */   public void setCodConvNew(String codConvNew) {
/*  51 */     this.codConvNew = codConvNew;
/*     */   }
/*     */   
/*     */   public String getCodConvOld() {
/*  55 */     return this.codConvOld;
/*     */   }
/*     */   
/*     */   public void setCodConvOld(String codConvOld) {
/*  59 */     this.codConvOld = codConvOld;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  63 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  67 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodicePromotore() {
/*  71 */     return this.codicePromotore;
/*     */   }
/*     */   
/*     */   public void setCodicePromotore(String codicePromotore) {
/*  75 */     this.codicePromotore = codicePromotore;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/*  79 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/*  83 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodProcesso() {
/*  87 */     return this.codProcesso;
/*     */   }
/*     */   
/*     */   public void setCodProcesso(String codProcesso) {
/*  91 */     this.codProcesso = codProcesso;
/*     */   }
/*     */   
/*     */   public Date getDataRicezione() {
/*  95 */     return this.dataRicezione;
/*     */   }
/*     */   
/*     */   public void setDataRicezione(Date dataRicezione) {
/*  99 */     this.dataRicezione = dataRicezione;
/*     */   }
/*     */   
/*     */   public String getDenominazioneCliente() {
/* 103 */     return this.denominazioneCliente;
/*     */   }
/*     */   
/*     */   public void setDenominazioneCliente(String denominazioneCliente) {
/* 107 */     this.denominazioneCliente = denominazioneCliente;
/*     */   }
/*     */   
/*     */   public String getDescConvNew() {
/* 111 */     return this.descConvNew;
/*     */   }
/*     */   
/*     */   public void setDescConvNew(String descConvNew) {
/* 115 */     this.descConvNew = descConvNew;
/*     */   }
/*     */   
/*     */   public String getDescConvOld() {
/* 119 */     return this.descConvOld;
/*     */   }
/*     */   
/*     */   public void setDescConvOld(String descConvOld) {
/* 123 */     this.descConvOld = descConvOld;
/*     */   }
/*     */   
/*     */   public String getFasciaEreditata() {
/* 127 */     return this.fasciaEreditata;
/*     */   }
/*     */   
/*     */   public void setFasciaEreditata(String fasciaEreditata) {
/* 131 */     this.fasciaEreditata = fasciaEreditata;
/*     */   }
/*     */   
/*     */   public Integer getId() {
/* 135 */     return this.id;
/*     */   }
/*     */   
/*     */   public void setId(Integer id) {
/* 139 */     this.id = id;
/*     */   }
/*     */   
/*     */   public String getRapporto() {
/* 143 */     return this.rapporto;
/*     */   }
/*     */   
/*     */   public void setRapporto(String rapporto) {
/* 147 */     this.rapporto = rapporto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinNocMigrazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */