/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ public class FlxRasBankGpAnagCli
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String nominativo;
/*     */   private String codiceFiscale;
/*     */   private Date dataDiNascita;
/*     */   private String codiceAgente;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String indirizzoResidenza;
/*     */   private String capResidenza;
/*     */   private String localitaResidenza;
/*     */   private String provinciaResidenza;
/*     */   private String telefonoResidenza;
/*     */   private String telefonoUfficio;
/*     */   private String telefonoCellulare;
/*     */   private String statoElab;
/*     */   private String descrizioneErrore;
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  65 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  72 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRasBankGpAnagCli(String nominativo, String codiceFiscale, Date dataDiNascita, String codiceAgente, String codiceRete, String codiceCompagnia, String indirizzoResidenza, String capResidenza, String localitaResidenza, String provinciaResidenza, String telefonoResidenza, String telefonoUfficio, String telefonoCellulare, String statoElab) {
/*  77 */     this.nominativo = nominativo;
/*  78 */     this.codiceFiscale = codiceFiscale;
/*  79 */     this.dataDiNascita = dataDiNascita;
/*  80 */     this.codiceAgente = codiceAgente;
/*  81 */     this.codiceRete = codiceRete;
/*  82 */     this.codiceCompagnia = codiceCompagnia;
/*  83 */     this.indirizzoResidenza = indirizzoResidenza;
/*  84 */     this.capResidenza = capResidenza;
/*  85 */     this.localitaResidenza = localitaResidenza;
/*  86 */     this.provinciaResidenza = provinciaResidenza;
/*  87 */     this.telefonoResidenza = telefonoResidenza;
/*  88 */     this.telefonoUfficio = telefonoUfficio;
/*  89 */     this.telefonoCellulare = telefonoCellulare;
/*  90 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRasBankGpAnagCli() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  98 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 102 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNominativo() {
/* 106 */     return this.nominativo;
/*     */   }
/*     */   
/*     */   public void setNominativo(String nominativo) {
/* 110 */     this.nominativo = nominativo;
/*     */   }
/*     */   
/*     */   public String getCodiceFiscale() {
/* 114 */     return this.codiceFiscale;
/*     */   }
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 118 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   
/*     */   public Date getDataDiNascita() {
/* 122 */     return this.dataDiNascita;
/*     */   }
/*     */   
/*     */   public void setDataDiNascita(Date dataDiNascita) {
/* 126 */     this.dataDiNascita = dataDiNascita;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 130 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 134 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 138 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 142 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 146 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 150 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getIndirizzoResidenza() {
/* 154 */     return this.indirizzoResidenza;
/*     */   }
/*     */   
/*     */   public void setIndirizzoResidenza(String indirizzoResidenza) {
/* 158 */     this.indirizzoResidenza = indirizzoResidenza;
/*     */   }
/*     */   
/*     */   public String getCapResidenza() {
/* 162 */     return this.capResidenza;
/*     */   }
/*     */   
/*     */   public void setCapResidenza(String capResidenza) {
/* 166 */     this.capResidenza = capResidenza;
/*     */   }
/*     */   
/*     */   public String getLocalitaResidenza() {
/* 170 */     return this.localitaResidenza;
/*     */   }
/*     */   
/*     */   public void setLocalitaResidenza(String localitaResidenza) {
/* 174 */     this.localitaResidenza = localitaResidenza;
/*     */   }
/*     */   
/*     */   public String getProvinciaResidenza() {
/* 178 */     return this.provinciaResidenza;
/*     */   }
/*     */   
/*     */   public void setProvinciaResidenza(String provinciaResidenza) {
/* 182 */     this.provinciaResidenza = provinciaResidenza;
/*     */   }
/*     */   
/*     */   public String getTelefonoResidenza() {
/* 186 */     return this.telefonoResidenza;
/*     */   }
/*     */   
/*     */   public void setTelefonoResidenza(String telefonoResidenza) {
/* 190 */     this.telefonoResidenza = telefonoResidenza;
/*     */   }
/*     */   
/*     */   public String getTelefonoUfficio() {
/* 194 */     return this.telefonoUfficio;
/*     */   }
/*     */   
/*     */   public void setTelefonoUfficio(String telefonoUfficio) {
/* 198 */     this.telefonoUfficio = telefonoUfficio;
/*     */   }
/*     */   
/*     */   public String getTelefonoCellulare() {
/* 202 */     return this.telefonoCellulare;
/*     */   }
/*     */   
/*     */   public void setTelefonoCellulare(String telefonoCellulare) {
/* 206 */     this.telefonoCellulare = telefonoCellulare;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 210 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 214 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 218 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRasBankGpAnagCli.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */