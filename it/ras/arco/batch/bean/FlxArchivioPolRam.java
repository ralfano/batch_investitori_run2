/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxArchivioPolRam
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceFondo;
/*     */   private String numeroMandato;
/*     */   private String codiceIntestatarioRam;
/*     */   private String codiceRamo;
/*     */   private String codiceCompagnia;
/*     */   private String numeroPolizza;
/*     */   private String tipoOperazione;
/*     */   private Date dataAttivazione;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   
/*     */   public FlxArchivioPolRam() {}
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  35 */     return this.codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  41 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceFondo() {
/*  47 */     return this.codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFondo(String codiceFondo) {
/*  53 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntestatarioRam() {
/*  59 */     return this.codiceIntestatarioRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntestatarioRam(String codiceIntestatarioRam) {
/*  65 */     this.codiceIntestatarioRam = codiceIntestatarioRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRamo() {
/*  71 */     return this.codiceRamo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRamo(String codiceRamo) {
/*  77 */     this.codiceRamo = codiceRamo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataAttivazione() {
/*  83 */     return this.dataAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataAttivazione(Date dataAttivazione) {
/*  89 */     this.dataAttivazione = dataAttivazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  95 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 101 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 107 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 113 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 119 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 125 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 131 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 137 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroPolizza() {
/* 143 */     return this.numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPolizza(String numeroPolizza) {
/* 149 */     this.numeroPolizza = numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 155 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 161 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 167 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 173 */     this.tipoOperazione = tipoOperazione;
/*     */   }
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
/*     */   public FlxArchivioPolRam(String codiceFondo, String numeroMandato, String codiceIntestatarioRam, String codiceRamo, String codiceCompagnia, String numeroPolizza, String tipoOperazione, Date dataAttivazione, String statoElab, String istanza, Date dataCaricamento) {
/* 194 */     this.codiceFondo = codiceFondo;
/* 195 */     this.numeroMandato = numeroMandato;
/* 196 */     this.codiceIntestatarioRam = codiceIntestatarioRam;
/* 197 */     this.codiceRamo = codiceRamo;
/* 198 */     this.codiceCompagnia = codiceCompagnia;
/* 199 */     this.numeroPolizza = numeroPolizza;
/* 200 */     this.tipoOperazione = tipoOperazione;
/* 201 */     this.dataAttivazione = dataAttivazione;
/* 202 */     this.statoElab = statoElab;
/* 203 */     this.istanza = istanza;
/* 204 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxArchivioPolRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */