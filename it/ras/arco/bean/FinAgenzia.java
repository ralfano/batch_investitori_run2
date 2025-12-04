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
/*     */ public class FinAgenzia
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer agenziaId;
/*     */   private String codAgenzia;
/*     */   private String tipologia;
/*     */   private Date dataInizioValidita;
/*     */   private Date dataFineValidita;
/*     */   private String indirizzo;
/*     */   private String cap;
/*     */   private String citta;
/*     */   private String prefisso;
/*     */   private String telefono1;
/*     */   private String telefono2;
/*     */   private String telefono3;
/*     */   private String fax;
/*     */   private String codRete;
/*     */   private String codCompagnia;
/*     */   private String regioneCommerciale;
/*     */   private String provincia;
/*     */   private String desAgenzia;
/*     */   private String telefono1Ext;
/*     */   private String telefono2Ext;
/*     */   private String telefonoExt3;
/*     */   private String faxExt;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinAgenzia() {}
/*     */   
/*     */   public FinAgenzia(Integer agenziaId) {
/*  48 */     this.agenziaId = agenziaId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getAgenziaId() {
/*  59 */     return this.agenziaId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAgenziaId(Integer agenziaId) {
/*  65 */     this.agenziaId = agenziaId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodAgenzia() {
/*  74 */     return this.codAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodAgenzia(String codAgenzia) {
/*  80 */     this.codAgenzia = codAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipologia() {
/*  89 */     return this.tipologia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipologia(String tipologia) {
/*  95 */     this.tipologia = tipologia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioValidita() {
/* 104 */     return this.dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioValidita(Date dataInizioValidita) {
/* 110 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFineValidita() {
/* 119 */     return this.dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFineValidita(Date dataFineValidita) {
/* 125 */     this.dataFineValidita = dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIndirizzo() {
/* 134 */     return this.indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndirizzo(String indirizzo) {
/* 140 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCap() {
/* 149 */     return this.cap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCap(String cap) {
/* 155 */     this.cap = cap;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCitta() {
/* 160 */     return this.citta;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCitta(String citta) {
/* 165 */     this.citta = citta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrefisso() {
/* 174 */     return this.prefisso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrefisso(String prefisso) {
/* 180 */     this.prefisso = prefisso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono1() {
/* 189 */     return this.telefono1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono1(String telefono1) {
/* 195 */     this.telefono1 = telefono1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono2() {
/* 204 */     return this.telefono2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono2(String telefono2) {
/* 210 */     this.telefono2 = telefono2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono3() {
/* 219 */     return this.telefono3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono3(String telefono3) {
/* 225 */     this.telefono3 = telefono3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFax() {
/* 234 */     return this.fax;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFax(String fax) {
/* 240 */     this.fax = fax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodRete() {
/* 249 */     return this.codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 255 */     this.codRete = codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodCompagnia() {
/* 264 */     return this.codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodCompagnia(String codCompagnia) {
/* 270 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRegioneCommerciale() {
/* 279 */     return this.regioneCommerciale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRegioneCommerciale(String regioneCommerciale) {
/* 285 */     this.regioneCommerciale = regioneCommerciale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvincia() {
/* 294 */     return this.provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 300 */     this.provincia = provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDesAgenzia() {
/* 309 */     return this.desAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDesAgenzia(String desAgenzia) {
/* 315 */     this.desAgenzia = desAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono1Ext() {
/* 324 */     return this.telefono1Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono1Ext(String telefono1Ext) {
/* 330 */     this.telefono1Ext = telefono1Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono2Ext() {
/* 339 */     return this.telefono2Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono2Ext(String telefono2Ext) {
/* 345 */     this.telefono2Ext = telefono2Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefonoExt3() {
/* 354 */     return this.telefonoExt3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefonoExt3(String telefonoExt3) {
/* 360 */     this.telefonoExt3 = telefonoExt3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFaxExt() {
/* 369 */     return this.faxExt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFaxExt(String faxExt) {
/* 375 */     this.faxExt = faxExt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 384 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 390 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 399 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 405 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAgenzia.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */