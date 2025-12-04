/*     */ package it.ras.arco.bean;
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
/*     */ public class FinPortafoglioGP
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer portafoglioId;
/*     */   private String tipo;
/*     */   private String descTitolo;
/*     */   private String isin;
/*     */   private String categoria;
/*     */   private String paeseEmissione;
/*     */   private Double quantita;
/*     */   private Double prezzo;
/*     */   private Double rateo;
/*     */   private Double ultPrezzo;
/*     */   private Date dataUltPrezzo;
/*     */   private String divisa;
/*     */   private Double cambio;
/*     */   private Double ctvDivisa;
/*     */   private Double ctvEuro;
/*     */   private Double pmcTitolo;
/*     */   private Double cmcTitolo;
/*     */   private Double percentuale;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinContratto contratto;
/*     */   private Integer contrattoId;
/*     */   private String categoriaTitolo;
/*     */   
/*     */   public Integer getPortafoglioId() {
/*  95 */     return this.portafoglioId;
/*     */   }
/*     */   
/*     */   public void setPortafoglioId(Integer portafoglioId) {
/*  99 */     this.portafoglioId = portafoglioId;
/*     */   }
/*     */   
/*     */   public String getTipo() {
/* 103 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(String tipo) {
/* 107 */     this.tipo = tipo;
/*     */   }
/*     */   
/*     */   public String getDescTitolo() {
/* 111 */     return this.descTitolo;
/*     */   }
/*     */   
/*     */   public void setDescTitolo(String descTitolo) {
/* 115 */     this.descTitolo = descTitolo;
/*     */   }
/*     */   
/*     */   public String getIsin() {
/* 119 */     return this.isin;
/*     */   }
/*     */   
/*     */   public void setIsin(String isin) {
/* 123 */     this.isin = isin;
/*     */   }
/*     */   
/*     */   public String getCategoria() {
/* 127 */     return this.categoria;
/*     */   }
/*     */   
/*     */   public void setCategoria(String categoria) {
/* 131 */     this.categoria = categoria;
/*     */   }
/*     */   
/*     */   public String getPaeseEmissione() {
/* 135 */     return this.paeseEmissione;
/*     */   }
/*     */   
/*     */   public void setPaeseEmissione(String paeseEmissione) {
/* 139 */     this.paeseEmissione = paeseEmissione;
/*     */   }
/*     */   
/*     */   public Double getQuantita() {
/* 143 */     return this.quantita;
/*     */   }
/*     */   
/*     */   public void setQuantita(Double quantita) {
/* 147 */     this.quantita = quantita;
/*     */   }
/*     */   
/*     */   public Double getPrezzo() {
/* 151 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 155 */     this.prezzo = prezzo;
/*     */   }
/*     */   
/*     */   public Double getRateo() {
/* 159 */     return this.rateo;
/*     */   }
/*     */   
/*     */   public void setRateo(Double rateo) {
/* 163 */     this.rateo = rateo;
/*     */   }
/*     */   
/*     */   public Double getUltPrezzo() {
/* 167 */     return this.ultPrezzo;
/*     */   }
/*     */   
/*     */   public void setUltPrezzo(Double ultPrezzo) {
/* 171 */     this.ultPrezzo = ultPrezzo;
/*     */   }
/*     */   
/*     */   public Date getDataUltPrezzo() {
/* 175 */     return this.dataUltPrezzo;
/*     */   }
/*     */   
/*     */   public void setDataUltPrezzo(Date dataUltPrezzo) {
/* 179 */     this.dataUltPrezzo = dataUltPrezzo;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 183 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 187 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 191 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 195 */     this.cambio = cambio;
/*     */   }
/*     */   
/*     */   public Double getCtvDivisa() {
/* 199 */     return this.ctvDivisa;
/*     */   }
/*     */   
/*     */   public void setCtvDivisa(Double ctvDivisa) {
/* 203 */     this.ctvDivisa = ctvDivisa;
/*     */   }
/*     */   
/*     */   public Double getCtvEuro() {
/* 207 */     return this.ctvEuro;
/*     */   }
/*     */   
/*     */   public void setCtvEuro(Double ctvEuro) {
/* 211 */     this.ctvEuro = ctvEuro;
/*     */   }
/*     */   
/*     */   public Double getPmcTitolo() {
/* 215 */     return this.pmcTitolo;
/*     */   }
/*     */   
/*     */   public void setPmcTitolo(Double pmcTitolo) {
/* 219 */     this.pmcTitolo = pmcTitolo;
/*     */   }
/*     */   
/*     */   public Double getCmcTitolo() {
/* 223 */     return this.cmcTitolo;
/*     */   }
/*     */   
/*     */   public void setCmcTitolo(Double cmcTitolo) {
/* 227 */     this.cmcTitolo = cmcTitolo;
/*     */   }
/*     */   
/*     */   public Double getPercentuale() {
/* 231 */     return this.percentuale;
/*     */   }
/*     */   
/*     */   public void setPercentuale(Double percentuale) {
/* 235 */     this.percentuale = percentuale;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 240 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 244 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/* 248 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 252 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 256 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 260 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 266 */     return (new ToStringBuilder(this)).append("portafoglioId", getPortafoglioId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContratto getContratto() {
/* 272 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(FinContratto contratto) {
/* 276 */     this.contratto = contratto;
/*     */   }
/*     */   
/*     */   public String getCategoriaTitolo() {
/* 280 */     return this.categoriaTitolo;
/*     */   }
/*     */   
/*     */   public void setCategoriaTitolo(String categoriaTitolo) {
/* 284 */     this.categoriaTitolo = categoriaTitolo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPortafoglioGP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */