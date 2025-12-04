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
/*     */ public class FlxAnagraficaCliente
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
/*     */   
/*     */   public FlxAnagraficaCliente(String nominativo, String codiceFiscale, Date dataDiNascita, String codiceAgente, String codiceRete, String codiceCompagnia, String indirizzoResidenza, String capResidenza, String localitaResidenza, String provinciaResidenza, String telefonoResidenza, String telefonoUfficio, String telefonoCellulare, String statoElab) {
/*  61 */     this.nominativo = nominativo;
/*  62 */     this.codiceFiscale = codiceFiscale;
/*  63 */     this.dataDiNascita = dataDiNascita;
/*  64 */     this.codiceAgente = codiceAgente;
/*  65 */     this.codiceRete = codiceRete;
/*  66 */     this.codiceCompagnia = codiceCompagnia;
/*  67 */     this.indirizzoResidenza = indirizzoResidenza;
/*  68 */     this.capResidenza = capResidenza;
/*  69 */     this.localitaResidenza = localitaResidenza;
/*  70 */     this.provinciaResidenza = provinciaResidenza;
/*  71 */     this.telefonoResidenza = telefonoResidenza;
/*  72 */     this.telefonoUfficio = telefonoUfficio;
/*  73 */     this.telefonoCellulare = telefonoCellulare;
/*  74 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAnagraficaCliente() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  82 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  86 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNominativo() {
/*  90 */     return this.nominativo;
/*     */   }
/*     */   
/*     */   public void setNominativo(String nominativo) {
/*  94 */     this.nominativo = nominativo;
/*     */   }
/*     */   
/*     */   public String getCodiceFiscale() {
/*  98 */     return this.codiceFiscale;
/*     */   }
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 102 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   
/*     */   public Date getDataDiNascita() {
/* 106 */     return this.dataDiNascita;
/*     */   }
/*     */   
/*     */   public void setDataDiNascita(Date dataDiNascita) {
/* 110 */     this.dataDiNascita = dataDiNascita;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 114 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 118 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 122 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 126 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 130 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 134 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getIndirizzoResidenza() {
/* 138 */     return this.indirizzoResidenza;
/*     */   }
/*     */   
/*     */   public void setIndirizzoResidenza(String indirizzoResidenza) {
/* 142 */     this.indirizzoResidenza = indirizzoResidenza;
/*     */   }
/*     */   
/*     */   public String getCapResidenza() {
/* 146 */     return this.capResidenza;
/*     */   }
/*     */   
/*     */   public void setCapResidenza(String capResidenza) {
/* 150 */     this.capResidenza = capResidenza;
/*     */   }
/*     */   
/*     */   public String getLocalitaResidenza() {
/* 154 */     return this.localitaResidenza;
/*     */   }
/*     */   
/*     */   public void setLocalitaResidenza(String localitaResidenza) {
/* 158 */     this.localitaResidenza = localitaResidenza;
/*     */   }
/*     */   
/*     */   public String getProvinciaResidenza() {
/* 162 */     return this.provinciaResidenza;
/*     */   }
/*     */   
/*     */   public void setProvinciaResidenza(String provinciaResidenza) {
/* 166 */     this.provinciaResidenza = provinciaResidenza;
/*     */   }
/*     */   
/*     */   public String getTelefonoResidenza() {
/* 170 */     return this.telefonoResidenza;
/*     */   }
/*     */   
/*     */   public void setTelefonoResidenza(String telefonoResidenza) {
/* 174 */     this.telefonoResidenza = telefonoResidenza;
/*     */   }
/*     */   
/*     */   public String getTelefonoUfficio() {
/* 178 */     return this.telefonoUfficio;
/*     */   }
/*     */   
/*     */   public void setTelefonoUfficio(String telefonoUfficio) {
/* 182 */     this.telefonoUfficio = telefonoUfficio;
/*     */   }
/*     */   
/*     */   public String getTelefonoCellulare() {
/* 186 */     return this.telefonoCellulare;
/*     */   }
/*     */   
/*     */   public void setTelefonoCellulare(String telefonoCellulare) {
/* 190 */     this.telefonoCellulare = telefonoCellulare;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 194 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 198 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 202 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnagraficaCliente.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */