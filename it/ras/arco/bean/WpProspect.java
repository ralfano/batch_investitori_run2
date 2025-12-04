/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class WpProspect
/*     */   extends ArcoRasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer prospectId;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String sesso;
/*     */   private String codiceFiscale;
/*     */   private String partitaIva;
/*     */   private Date dataNascita;
/*     */   private String comuneNascita;
/*     */   private String provNascita;
/*     */   private String nazNascita;
/*     */   private String denominazione;
/*     */   private String cittadinanza;
/*     */   private String tipoProspect;
/*     */   private Set wpgencliente;
/*     */   
/*     */   public WpProspect(String cittadinanza, String fiscale, String cognome, String nascita, Date nascita2, String denominazione, String nascita3, String nome, String iva, Integer id, String nascita4, String sesso, String prospect, Set wpgencliente) {
/*  27 */     this.cittadinanza = cittadinanza;
/*  28 */     this.codiceFiscale = fiscale;
/*  29 */     this.cognome = cognome;
/*  30 */     this.comuneNascita = nascita;
/*  31 */     this.dataNascita = nascita2;
/*  32 */     this.denominazione = denominazione;
/*  33 */     this.nazNascita = nascita3;
/*  34 */     this.nome = nome;
/*  35 */     this.partitaIva = iva;
/*  36 */     this.prospectId = id;
/*  37 */     this.provNascita = nascita4;
/*  38 */     this.sesso = sesso;
/*  39 */     this.tipoProspect = prospect;
/*  40 */     this.wpgencliente = wpgencliente;
/*     */   }
/*     */ 
/*     */   
/*     */   public WpProspect() {}
/*     */   
/*     */   public String getCittadinanza() {
/*  47 */     return this.cittadinanza;
/*     */   }
/*     */   public void setCittadinanza(String cittadinanza) {
/*  50 */     this.cittadinanza = cittadinanza;
/*     */   }
/*     */   public String getCodiceFiscale() {
/*  53 */     return this.codiceFiscale;
/*     */   }
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/*  56 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   public String getCognome() {
/*  59 */     return this.cognome;
/*     */   }
/*     */   public void setCognome(String cognome) {
/*  62 */     this.cognome = cognome;
/*     */   }
/*     */   public String getComuneNascita() {
/*  65 */     return this.comuneNascita;
/*     */   }
/*     */   public void setComuneNascita(String comuneNascita) {
/*  68 */     this.comuneNascita = comuneNascita;
/*     */   }
/*     */   public Date getDataNascita() {
/*  71 */     return this.dataNascita;
/*     */   }
/*     */   public void setDataNascita(Date dataNascita) {
/*  74 */     this.dataNascita = dataNascita;
/*     */   }
/*     */   public String getDenominazione() {
/*  77 */     return this.denominazione;
/*     */   }
/*     */   public void setDenominazione(String denominazione) {
/*  80 */     this.denominazione = denominazione;
/*     */   }
/*     */   public String getNazNascita() {
/*  83 */     return this.nazNascita;
/*     */   }
/*     */   public void setNazNascita(String nazNascita) {
/*  86 */     this.nazNascita = nazNascita;
/*     */   }
/*     */   public String getNome() {
/*  89 */     return this.nome;
/*     */   }
/*     */   public void setNome(String nome) {
/*  92 */     this.nome = nome;
/*     */   }
/*     */   public String getPartitaIva() {
/*  95 */     return this.partitaIva;
/*     */   }
/*     */   public void setPartitaIva(String partitaIva) {
/*  98 */     this.partitaIva = partitaIva;
/*     */   }
/*     */   public Integer getProspectId() {
/* 101 */     return this.prospectId;
/*     */   }
/*     */   public void setProspectId(Integer prospectId) {
/* 104 */     this.prospectId = prospectId;
/*     */   }
/*     */   public String getProvNascita() {
/* 107 */     return this.provNascita;
/*     */   }
/*     */   public void setProvNascita(String provNascita) {
/* 110 */     this.provNascita = provNascita;
/*     */   }
/*     */   public String getSesso() {
/* 113 */     return this.sesso;
/*     */   }
/*     */   public void setSesso(String sesso) {
/* 116 */     this.sesso = sesso;
/*     */   }
/*     */   public String getTipoProspect() {
/* 119 */     return this.tipoProspect;
/*     */   }
/*     */   public void setTipoProspect(String tipoProspect) {
/* 122 */     this.tipoProspect = tipoProspect;
/*     */   }
/*     */   public Set getWpgencliente() {
/* 125 */     return this.wpgencliente;
/*     */   }
/*     */   public void setWpgencliente(Set wpgencliente) {
/* 128 */     this.wpgencliente = wpgencliente;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpProspect.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */