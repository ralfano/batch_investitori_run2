/*     */ package it.ras.arco.batch.bean;
/*     */ 
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
/*     */ public class FlxAntAnagraficaAgenzie
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codUnitaTerritoriale;
/*     */   private String tipologiaAgenzia;
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
/*     */   private String telefono3Ext;
/*     */   private String faxExt;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxAntAnagraficaAgenzie() {}
/*     */   
/*     */   public FlxAntAnagraficaAgenzie(Integer flxId) {
/*  54 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  65 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  71 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodUnitaTerritoriale() {
/*  80 */     return this.codUnitaTerritoriale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodUnitaTerritoriale(String codUnitaTerritoriale) {
/*  86 */     this.codUnitaTerritoriale = codUnitaTerritoriale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipologiaAgenzia() {
/*  95 */     return this.tipologiaAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipologiaAgenzia(String tipologiaAgenzia) {
/* 101 */     this.tipologiaAgenzia = tipologiaAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioValidita() {
/* 110 */     return this.dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioValidita(Date dataInizioValidita) {
/* 116 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFineValidita() {
/* 125 */     return this.dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFineValidita(Date dataFineValidita) {
/* 131 */     this.dataFineValidita = dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIndirizzo() {
/* 140 */     return this.indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndirizzo(String indirizzo) {
/* 146 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCap() {
/* 155 */     return this.cap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCap(String cap) {
/* 161 */     this.cap = cap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCitta() {
/* 170 */     return this.citta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCitta(String citta) {
/* 176 */     this.citta = citta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrefisso() {
/* 185 */     return this.prefisso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrefisso(String prefisso) {
/* 191 */     this.prefisso = prefisso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono1() {
/* 200 */     return this.telefono1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono1(String telefono1) {
/* 206 */     this.telefono1 = telefono1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono2() {
/* 215 */     return this.telefono2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono2(String telefono2) {
/* 221 */     this.telefono2 = telefono2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono3() {
/* 230 */     return this.telefono3;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono3(String telefono3) {
/* 236 */     this.telefono3 = telefono3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFax() {
/* 245 */     return this.fax;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFax(String fax) {
/* 251 */     this.fax = fax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodRete() {
/* 260 */     return this.codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 266 */     this.codRete = codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodCompagnia() {
/* 275 */     return this.codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodCompagnia(String codCompagnia) {
/* 281 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRegioneCommerciale() {
/* 290 */     return this.regioneCommerciale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRegioneCommerciale(String regioneCommerciale) {
/* 296 */     this.regioneCommerciale = regioneCommerciale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvincia() {
/* 305 */     return this.provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 311 */     this.provincia = provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDesAgenzia() {
/* 320 */     return this.desAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDesAgenzia(String desAgenzia) {
/* 326 */     this.desAgenzia = desAgenzia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono1Ext() {
/* 335 */     return this.telefono1Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono1Ext(String telefono1Ext) {
/* 341 */     this.telefono1Ext = telefono1Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono2Ext() {
/* 350 */     return this.telefono2Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono2Ext(String telefono2Ext) {
/* 356 */     this.telefono2Ext = telefono2Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTelefono3Ext() {
/* 365 */     return this.telefono3Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTelefono3Ext(String telefono3Ext) {
/* 371 */     this.telefono3Ext = telefono3Ext;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFaxExt() {
/* 380 */     return this.faxExt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFaxExt(String faxExt) {
/* 386 */     this.faxExt = faxExt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 395 */     return this.statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 401 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 410 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 416 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 425 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 431 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataErrore() {
/* 436 */     return this.dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/* 441 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 446 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 451 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntAnagraficaAgenzie.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */