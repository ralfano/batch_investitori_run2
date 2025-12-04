/*     */ package it.ras.arco.batch.bean;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class QuadPosizioniUl
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxid;
/*     */   private String codCompagnia;
/*     */   private Integer polizzaSiag;
/*     */   private String ramoSiag;
/*     */   private String agenziaSiag;
/*     */   private String codProdotto;
/*     */   private String descrizione;
/*     */   private Double numQuote;
/*     */   private Double valQuota;
/*     */   private Date dataQuotazione;
/*     */   private Double controvalore;
/*     */   private Double bonus;
/*     */   private String percDescrittivo;
/*     */   private Integer numVersioneProd;
/*     */   private Double valAggQuota;
/*     */   private Double valAggNumQuota;
/*     */   private Date dataUltAggiornam;
/*     */   private Double totValore;
/*     */   private String codFondoFin;
/*     */   private String codFondoNvi;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   
/*     */   public QuadPosizioniUl(String codCompagnia, Integer polizzaSiag, String ramoSiag, String agenziaSiag, String codProdotto, String descrizione, Double numQuote, Double valQuota, Date dataQuotazione, Double controvalore, Double bonus, String percDescrittivo, Integer numVersioneProd, Double valAggQuota, Double valAggNumQuota, Date dataUltAggiornam, Double totValore, String codFondoFin, String codFondoNvi, String statoElab, String istanza, Date dataCaricamento) {
/*  76 */     this.codCompagnia = codCompagnia;
/*  77 */     this.polizzaSiag = polizzaSiag;
/*  78 */     this.ramoSiag = ramoSiag;
/*  79 */     this.agenziaSiag = agenziaSiag;
/*  80 */     this.codProdotto = codProdotto;
/*  81 */     this.descrizione = descrizione;
/*  82 */     this.numQuote = numQuote;
/*  83 */     this.valQuota = valQuota;
/*  84 */     this.dataQuotazione = dataQuotazione;
/*  85 */     this.controvalore = controvalore;
/*  86 */     this.bonus = bonus;
/*  87 */     this.percDescrittivo = percDescrittivo;
/*  88 */     this.numVersioneProd = numVersioneProd;
/*  89 */     this.valAggQuota = valAggQuota;
/*  90 */     this.valAggNumQuota = valAggNumQuota;
/*  91 */     this.dataUltAggiornam = dataUltAggiornam;
/*  92 */     this.totValore = totValore;
/*  93 */     this.codFondoFin = codFondoFin;
/*  94 */     this.codFondoNvi = codFondoNvi;
/*  95 */     this.statoElab = statoElab;
/*  96 */     this.istanza = istanza;
/*  97 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public QuadPosizioniUl() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxid() {
/* 105 */     return this.flxid;
/*     */   }
/*     */   
/*     */   public void setFlxid(Integer flxid) {
/* 109 */     this.flxid = flxid;
/*     */   }
/*     */   
/*     */   public String getcodCompagnia() {
/* 113 */     return this.codCompagnia;
/*     */   }
/*     */   
/*     */   public void setcodCompagnia(String codCompagnia) {
/* 117 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */   
/*     */   public Integer getPolizzaSiag() {
/* 121 */     return this.polizzaSiag;
/*     */   }
/*     */   
/*     */   public void setPolizzaSiag(Integer polizzaSiag) {
/* 125 */     this.polizzaSiag = polizzaSiag;
/*     */   }
/*     */   
/*     */   public String getRamoSiag() {
/* 129 */     return this.ramoSiag;
/*     */   }
/*     */   
/*     */   public void setRamoSiag(String ramoSiag) {
/* 133 */     this.ramoSiag = ramoSiag;
/*     */   }
/*     */   
/*     */   public String getAgenziaSiag() {
/* 137 */     return this.agenziaSiag;
/*     */   }
/*     */   
/*     */   public void setAgenziaSiag(String agenziaSiag) {
/* 141 */     this.agenziaSiag = agenziaSiag;
/*     */   }
/*     */   
/*     */   public Double getNumQuote() {
/* 145 */     return this.numQuote;
/*     */   }
/*     */   
/*     */   public void setNumQuote(Double numQuote) {
/* 149 */     this.numQuote = numQuote;
/*     */   }
/*     */   
/*     */   public Double getValQuota() {
/* 153 */     return this.valQuota;
/*     */   }
/*     */   
/*     */   public void setValQuota(Double valQuota) {
/* 157 */     this.valQuota = valQuota;
/*     */   }
/*     */   
/*     */   public Date getDataQuotazione() {
/* 161 */     return this.dataQuotazione;
/*     */   }
/*     */   
/*     */   public void setDataQuotazione(Date dataQuotazione) {
/* 165 */     this.dataQuotazione = dataQuotazione;
/*     */   }
/*     */   
/*     */   public Double getControvalore() {
/* 169 */     return this.controvalore;
/*     */   }
/*     */   
/*     */   public void setControvalore(Double controvalore) {
/* 173 */     this.controvalore = controvalore;
/*     */   }
/*     */   
/*     */   public Integer getNumVersioneProd() {
/* 177 */     return this.numVersioneProd;
/*     */   }
/*     */   
/*     */   public void setNumVersioneProd(Integer numVersioneProd) {
/* 181 */     this.numVersioneProd = numVersioneProd;
/*     */   }
/*     */   
/*     */   public Double getValAggNumQuota() {
/* 185 */     return this.valAggNumQuota;
/*     */   }
/*     */   
/*     */   public void setValAggNumQuota(Double valAggNumQuota) {
/* 189 */     this.valAggNumQuota = valAggNumQuota;
/*     */   }
/*     */   
/*     */   public Date getDataUltAggiornam() {
/* 193 */     return this.dataUltAggiornam;
/*     */   }
/*     */   
/*     */   public void setDataUltAggiornam(Date dataUltAggiornam) {
/* 197 */     this.dataUltAggiornam = dataUltAggiornam;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 201 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 205 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 209 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 213 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 217 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 221 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 225 */     return (new ToStringBuilder(this)).append("flxid", getFlxid()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodProdotto() {
/* 231 */     return this.codProdotto;
/*     */   }
/*     */   
/*     */   public void setCodProdotto(String codProdotto) {
/* 235 */     this.codProdotto = codProdotto;
/*     */   }
/*     */   
/*     */   public String getDescrizione() {
/* 239 */     return this.descrizione;
/*     */   }
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/* 243 */     this.descrizione = descrizione;
/*     */   }
/*     */   
/*     */   public Double getBonus() {
/* 247 */     return this.bonus;
/*     */   }
/*     */   
/*     */   public void setBonus(Double bonus) {
/* 251 */     this.bonus = bonus;
/*     */   }
/*     */   
/*     */   public String getPercDescrittivo() {
/* 255 */     return this.percDescrittivo;
/*     */   }
/*     */   
/*     */   public void setPercDescrittivo(String percDescrittivo) {
/* 259 */     this.percDescrittivo = percDescrittivo;
/*     */   }
/*     */   
/*     */   public Double getValAggQuota() {
/* 263 */     return this.valAggQuota;
/*     */   }
/*     */   
/*     */   public void setValAggQuota(Double valAggQuota) {
/* 267 */     this.valAggQuota = valAggQuota;
/*     */   }
/*     */   
/*     */   public String getCodFondoFin() {
/* 271 */     return this.codFondoFin;
/*     */   }
/*     */   
/*     */   public void setCodFondoFin(String codFondoFin) {
/* 275 */     this.codFondoFin = codFondoFin;
/*     */   }
/*     */   
/*     */   public String getCodFondoNvi() {
/* 279 */     return this.codFondoNvi;
/*     */   }
/*     */   
/*     */   public void setCodFondoNvi(String codFondoNvi) {
/* 283 */     this.codFondoNvi = codFondoNvi;
/*     */   }
/*     */   
/*     */   public Double getTotValore() {
/* 287 */     return this.totValore;
/*     */   }
/*     */   
/*     */   public void setTotValore(Double totValore) {
/* 291 */     this.totValore = totValore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\QuadPosizioniUl.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */