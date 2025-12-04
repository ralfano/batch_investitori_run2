/*     */ package it.ras.arco.bean;
/*     */ 
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
/*     */ public class FinContrattoBase
/*     */   extends ArcoRasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   protected Integer contrattoId;
/*     */   protected String tipoProdotto;
/*     */   protected String statoContratto;
/*     */   protected String numContratto;
/*     */   protected Date dataSottoscrizione;
/*     */   protected FinNumContratti numeroContratto;
/*     */   protected FinSoggetto soggetto;
/*     */   protected FinProdotto prodotto;
/*     */   protected Set posizione;
/*     */   protected Date dataChiusura;
/*     */   protected FinCointestazione cointestazione;
/*     */   protected Set assegnazione;
/*     */   protected Set sottoscrizione;
/*     */   protected Set indirizzo;
/*     */   protected Set altriProdotti;
/*     */   protected Date dataApertura;
/*     */   protected Set ruolo;
/*     */   
/*     */   public FinNumContratti getNumeroContratto() {
/*  37 */     return this.numeroContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContratto(FinNumContratti numeroContratto) {
/*  45 */     this.numeroContratto = numeroContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataSottoscrizione() {
/*  52 */     return this.dataSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataSottoscrizione(Date dataSottoscrizione) {
/*  60 */     this.dataSottoscrizione = dataSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataChiusura() {
/*  71 */     return this.dataChiusura;
/*     */   }
/*     */   
/*     */   public void setDataChiusura(Date dataChiusura) {
/*  75 */     this.dataChiusura = dataChiusura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContrattoBase() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContrattoBase(Integer contrattoId, FinProdotto prodotto, String prodotto2) {
/*  85 */     this.contrattoId = contrattoId;
/*  86 */     this.prodotto = prodotto;
/*  87 */     this.tipoProdotto = prodotto2;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/*  91 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/*  95 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/*  99 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 103 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public FinProdotto getProdotto() {
/* 107 */     return this.prodotto;
/*     */   }
/*     */   
/*     */   public void setProdotto(FinProdotto prodotto) {
/* 111 */     this.prodotto = prodotto;
/*     */   }
/*     */   
/*     */   public String getStatoContratto() {
/* 115 */     return this.statoContratto;
/*     */   }
/*     */   
/*     */   public void setStatoContratto(String statoContratto) {
/* 119 */     this.statoContratto = statoContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getPosizione() {
/* 126 */     return this.posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizione(Set posizione) {
/* 134 */     this.posizione = posizione;
/*     */   }
/*     */   
/*     */   public String getNumContratto() {
/* 138 */     return this.numContratto;
/*     */   }
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/* 142 */     this.numContratto = numContratto;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 146 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 150 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinCointestazione getCointestazione() {
/* 157 */     return this.cointestazione;
/*     */   }
/*     */   
/*     */   public void setCointestazione(FinCointestazione cointestazione) {
/* 161 */     this.cointestazione = cointestazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getAssegnazione() {
/* 168 */     return this.assegnazione;
/*     */   }
/*     */   
/*     */   public void setAssegnazione(Set assegnazione) {
/* 172 */     this.assegnazione = assegnazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getSottoscrizione() {
/* 179 */     return this.sottoscrizione;
/*     */   }
/*     */   
/*     */   public void setSottoscrizione(Set sottoscrizione) {
/* 183 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getIndirizzo() {
/* 190 */     return this.indirizzo;
/*     */   }
/*     */   
/*     */   public void setIndirizzo(Set indirizzo) {
/* 194 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getAltriProdotti() {
/* 204 */     return this.altriProdotti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAltriProdotti(Set altriProdotti) {
/* 212 */     this.altriProdotti = altriProdotti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataApertura() {
/* 219 */     return this.dataApertura;
/*     */   }
/*     */   
/*     */   public void setDataApertura(Date dataApertura) {
/* 223 */     this.dataApertura = dataApertura;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getRuolo() {
/* 230 */     return this.ruolo;
/*     */   }
/*     */   
/*     */   public void setRuolo(Set ruolo) {
/* 234 */     this.ruolo = ruolo;
/*     */   }
/*     */   
/*     */   public boolean getContrattoTerzi() {
/* 238 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getGP() {
/* 245 */     return ("GPF".equals(getTipoProdotto()) || "GP".equals(getTipoProdotto()) || "GPM".equals(getTipoProdotto()) || "GPP".equals(getTipoProdotto()) || "GMM".equals(getTipoProdotto()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrattoBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */