/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ public class WpPosizione
/*     */   extends ArcoRasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer posizioneId;
/*     */   private Set wpcontrattoterzi;
/*     */   private Set finattfin;
/*     */   private Double noQuote;
/*     */   private Double valoreVal;
/*     */   private Date dataValore;
/*     */   private Double cambio;
/*     */   private Double importoLordo;
/*     */   private Double controValoreOggi;
/*     */   private Double controValoreInvestito;
/*     */   private Double versato;
/*     */   private Double prelevato;
/*     */   private Double prezzoAcquisto;
/*     */   private Date dataControValore;
/*     */   private Double controValorePrel;
/*     */   private Double saldoInvestito;
/*     */   
/*     */   public WpPosizione(Double cambio, Double investito, Double oggi, Double prel, Date valore, Date valore2, Set finattfin, Double lordo, Double quote, Integer id, Double prelevato, Double acquisto, Double investito2, Double val, Double versato, Set wpcontrattoterzi) {
/*  29 */     this.cambio = cambio;
/*  30 */     this.controValoreInvestito = investito;
/*  31 */     this.controValoreOggi = oggi;
/*  32 */     this.controValorePrel = prel;
/*  33 */     this.dataControValore = valore;
/*  34 */     this.dataValore = valore2;
/*  35 */     this.finattfin = finattfin;
/*  36 */     this.importoLordo = lordo;
/*  37 */     this.noQuote = quote;
/*  38 */     this.posizioneId = id;
/*  39 */     this.prelevato = prelevato;
/*  40 */     this.prezzoAcquisto = acquisto;
/*  41 */     this.saldoInvestito = investito2;
/*  42 */     this.valoreVal = val;
/*  43 */     this.versato = versato;
/*  44 */     this.wpcontrattoterzi = wpcontrattoterzi;
/*     */   }
/*     */ 
/*     */   
/*     */   public WpPosizione() {}
/*     */   
/*     */   public Double getCambio() {
/*  51 */     return this.cambio;
/*     */   }
/*     */   public void setCambio(Double cambio) {
/*  54 */     this.cambio = cambio;
/*     */   }
/*     */   public Double getControValoreInvestito() {
/*  57 */     return this.controValoreInvestito;
/*     */   }
/*     */   public void setControValoreInvestito(Double controValoreInvestito) {
/*  60 */     this.controValoreInvestito = controValoreInvestito;
/*     */   }
/*     */   public Double getControValoreOggi() {
/*  63 */     return this.controValoreOggi;
/*     */   }
/*     */   public void setControValoreOggi(Double controValoreOggi) {
/*  66 */     this.controValoreOggi = controValoreOggi;
/*     */   }
/*     */   public Double getControValorePrel() {
/*  69 */     return this.controValorePrel;
/*     */   }
/*     */   public void setControValorePrel(Double controValorePrel) {
/*  72 */     this.controValorePrel = controValorePrel;
/*     */   }
/*     */   public Date getDataControValore() {
/*  75 */     return this.dataControValore;
/*     */   }
/*     */   public void setDataControValore(Date dataControValore) {
/*  78 */     this.dataControValore = dataControValore;
/*     */   }
/*     */   public Date getDataValore() {
/*  81 */     return this.dataValore;
/*     */   }
/*     */   public void setDataValore(Date dataValore) {
/*  84 */     this.dataValore = dataValore;
/*     */   }
/*     */   public Set getFinattfin() {
/*  87 */     return this.finattfin;
/*     */   }
/*     */   public void setFinattfin(Set finattfin) {
/*  90 */     this.finattfin = finattfin;
/*     */   }
/*     */   public Double getImportoLordo() {
/*  93 */     return this.importoLordo;
/*     */   }
/*     */   public void setImportoLordo(Double importoLordo) {
/*  96 */     this.importoLordo = importoLordo;
/*     */   }
/*     */   public Double getNoQuote() {
/*  99 */     return this.noQuote;
/*     */   }
/*     */   public void setNoQuote(Double noQuote) {
/* 102 */     this.noQuote = noQuote;
/*     */   }
/*     */   public Integer getPosizioneId() {
/* 105 */     return this.posizioneId;
/*     */   }
/*     */   public void setPosizioneId(Integer posizioneId) {
/* 108 */     this.posizioneId = posizioneId;
/*     */   }
/*     */   public Double getPrelevato() {
/* 111 */     return this.prelevato;
/*     */   }
/*     */   public void setPrelevato(Double prelevato) {
/* 114 */     this.prelevato = prelevato;
/*     */   }
/*     */   public Double getPrezzoAcquisto() {
/* 117 */     return this.prezzoAcquisto;
/*     */   }
/*     */   public void setPrezzoAcquisto(Double prezzoAcquisto) {
/* 120 */     this.prezzoAcquisto = prezzoAcquisto;
/*     */   }
/*     */   public Double getSaldoInvestito() {
/* 123 */     return this.saldoInvestito;
/*     */   }
/*     */   public void setSaldoInvestito(Double saldoInvestito) {
/* 126 */     this.saldoInvestito = saldoInvestito;
/*     */   }
/*     */   public Double getValoreVal() {
/* 129 */     return this.valoreVal;
/*     */   }
/*     */   public void setValoreVal(Double valoreVal) {
/* 132 */     this.valoreVal = valoreVal;
/*     */   }
/*     */   public Double getVersato() {
/* 135 */     return this.versato;
/*     */   }
/*     */   public void setVersato(Double versato) {
/* 138 */     this.versato = versato;
/*     */   }
/*     */   public Set getWpcontrattoterzi() {
/* 141 */     return this.wpcontrattoterzi;
/*     */   }
/*     */   public void setWpcontrattoterzi(Set wpcontrattoterzi) {
/* 144 */     this.wpcontrattoterzi = wpcontrattoterzi;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpPosizione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */