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
/*     */ public class FlxRBVitaT60
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer t60Lung;
/*     */   private String tipoRecord;
/*     */   private Integer provPortRas;
/*     */   private Date dtElab;
/*     */   private String provenienza;
/*     */   private Integer compagnia;
/*     */   private Integer ramo;
/*     */   private Integer polizza;
/*     */   private Integer prodDival;
/*     */   private String contraente;
/*     */   private String prodVend;
/*     */   private Integer versProd;
/*     */   private String codIspettore;
/*     */   private String chkIspettore;
/*     */   private String codIspettore2;
/*     */   private String chkIspettore2;
/*     */   private String titolo;
/*     */   private Integer annualita;
/*     */   private Integer frazionamento;
/*     */   private String divisaIso;
/*     */   private Date dtScadTit;
/*     */   private Double premioLordo;
/*     */   private Double provvigioni;
/*     */   private Double premioNetto;
/*     */   private String tipoPremio;
/*     */   private String ag0041;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   
/*     */   public Integer getFlxId() {
/*  55 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  59 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAg0041() {
/*  64 */     return this.ag0041;
/*     */   }
/*     */   public void setAg0041(String ag0041) {
/*  67 */     this.ag0041 = ag0041;
/*     */   }
/*     */   public Integer getAnnualita() {
/*  70 */     return this.annualita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAnnualita(Integer annualita) {
/*  76 */     this.annualita = annualita;
/*     */   }
/*     */   public String getChkIspettore() {
/*  79 */     return this.chkIspettore;
/*     */   }
/*     */   public void setChkIspettore(String chkIspettore) {
/*  82 */     this.chkIspettore = chkIspettore;
/*     */   }
/*     */   public String getChkIspettore2() {
/*  85 */     return this.chkIspettore2;
/*     */   }
/*     */   public void setChkIspettore2(String chkIspettore2) {
/*  88 */     this.chkIspettore2 = chkIspettore2;
/*     */   }
/*     */   public String getCodIspettore() {
/*  91 */     return this.codIspettore;
/*     */   }
/*     */   public void setCodIspettore(String codIspettore) {
/*  94 */     this.codIspettore = codIspettore;
/*     */   }
/*     */   public String getCodIspettore2() {
/*  97 */     return this.codIspettore2;
/*     */   }
/*     */   public void setCodIspettore2(String codIspettore2) {
/* 100 */     this.codIspettore2 = codIspettore2;
/*     */   }
/*     */   public Integer getCompagnia() {
/* 103 */     return this.compagnia;
/*     */   }
/*     */   public void setCompagnia(Integer compagnia) {
/* 106 */     this.compagnia = compagnia;
/*     */   }
/*     */   public String getContraente() {
/* 109 */     return this.contraente;
/*     */   }
/*     */   public void setContraente(String contraente) {
/* 112 */     this.contraente = contraente;
/*     */   }
/*     */   public Date getDataCaricamento() {
/* 115 */     return this.dataCaricamento;
/*     */   }
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 118 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   public String getDivisaIso() {
/* 121 */     return this.divisaIso;
/*     */   }
/*     */   public void setDivisaIso(String divisaIso) {
/* 124 */     this.divisaIso = divisaIso;
/*     */   }
/*     */   public Date getDtElab() {
/* 127 */     return this.dtElab;
/*     */   }
/*     */   public void setDtElab(Date dtElab) {
/* 130 */     this.dtElab = dtElab;
/*     */   }
/*     */   public Date getDtScadTit() {
/* 133 */     return this.dtScadTit;
/*     */   }
/*     */   public void setDtScadTit(Date dtScadTit) {
/* 136 */     this.dtScadTit = dtScadTit;
/*     */   }
/*     */   public Integer getFrazionamento() {
/* 139 */     return this.frazionamento;
/*     */   }
/*     */   public void setFrazionamento(Integer frazionamento) {
/* 142 */     this.frazionamento = frazionamento;
/*     */   }
/*     */   public String getIstanza() {
/* 145 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 148 */     this.istanza = istanza;
/*     */   }
/*     */   public Integer getPolizza() {
/* 151 */     return this.polizza;
/*     */   }
/*     */   public void setPolizza(Integer polizza) {
/* 154 */     this.polizza = polizza;
/*     */   }
/*     */   public Double getPremioLordo() {
/* 157 */     return this.premioLordo;
/*     */   }
/*     */   public void setPremioLordo(Double premioLordo) {
/* 160 */     this.premioLordo = premioLordo;
/*     */   }
/*     */   public Double getPremioNetto() {
/* 163 */     return this.premioNetto;
/*     */   }
/*     */   public void setPremioNetto(Double premioNetto) {
/* 166 */     this.premioNetto = premioNetto;
/*     */   }
/*     */   public Integer getProdDival() {
/* 169 */     return this.prodDival;
/*     */   }
/*     */   public void setProdDival(Integer prodDival) {
/* 172 */     this.prodDival = prodDival;
/*     */   }
/*     */   public String getProdVend() {
/* 175 */     return this.prodVend;
/*     */   }
/*     */   public void setProdVend(String prodVend) {
/* 178 */     this.prodVend = prodVend;
/*     */   }
/*     */   public String getProvenienza() {
/* 181 */     return this.provenienza;
/*     */   }
/*     */   public void setProvenienza(String provenienza) {
/* 184 */     this.provenienza = provenienza;
/*     */   }
/*     */   public Integer getProvPortRas() {
/* 187 */     return this.provPortRas;
/*     */   }
/*     */   public void setProvPortRas(Integer provPortRas) {
/* 190 */     this.provPortRas = provPortRas;
/*     */   }
/*     */   public Double getProvvigioni() {
/* 193 */     return this.provvigioni;
/*     */   }
/*     */   public void setProvvigioni(Double provvigioni) {
/* 196 */     this.provvigioni = provvigioni;
/*     */   }
/*     */   public Integer getRamo() {
/* 199 */     return this.ramo;
/*     */   }
/*     */   public void setRamo(Integer ramo) {
/* 202 */     this.ramo = ramo;
/*     */   }
/*     */   public String getStatoElab() {
/* 205 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 208 */     this.statoElab = statoElab;
/*     */   }
/*     */   public Integer getT60Lung() {
/* 211 */     return this.t60Lung;
/*     */   }
/*     */   public void setT60Lung(Integer lung) {
/* 214 */     this.t60Lung = lung;
/*     */   }
/*     */   public String getTipoPremio() {
/* 217 */     return this.tipoPremio;
/*     */   }
/*     */   public void setTipoPremio(String tipoPremio) {
/* 220 */     this.tipoPremio = tipoPremio;
/*     */   }
/*     */   public String getTipoRecord() {
/* 223 */     return this.tipoRecord;
/*     */   }
/*     */   public void setTipoRecord(String tipoRecord) {
/* 226 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */   public String getTitolo() {
/* 229 */     return this.titolo;
/*     */   }
/*     */   public void setTitolo(String titolo) {
/* 232 */     this.titolo = titolo;
/*     */   }
/*     */   public Integer getVersProd() {
/* 235 */     return this.versProd;
/*     */   }
/*     */   public void setVersProd(Integer versProd) {
/* 238 */     this.versProd = versProd;
/*     */   }
/*     */   public String toString() {
/* 241 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRBVitaT60.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */