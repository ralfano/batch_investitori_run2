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
/*     */ public class FlxRasBankGpMovimenti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
/*     */   private String tipoProd;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String causaleMovimento;
/*     */   private Double importoMovimento;
/*     */   private String descrizioneTitolo;
/*     */   private Double quantitaTitolo;
/*     */   private String codiceIsin;
/*     */   private Double prezzo;
/*     */   private Double cambio;
/*     */   private Date dataMovimento;
/*     */   private String numeroRiferimento;
/*     */   private String flagLiraEuro;
/*     */   private Integer clcli;
/*     */   private Date dtreg;
/*     */   private Date dtins;
/*     */   private String movxp;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private String rifOrdine;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/*  89 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  96 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 102 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 109 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRasBankGpMovimenti(String tipoProd, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, String causaleMovimento, Double importoMovimento, String descrizioneTitolo, Double quantitaTitolo, String codiceIsin, Double prezzo, Double cambio, Date dataMovimento, String numeroRiferimento, String flagLiraEuro, Integer clcli, Date dtreg, Date dtins, String movxp, String statoElaborazione, String istanza, String rifOrdine) {
/* 114 */     this.numeroRapporto = numeroRapporto;
/* 115 */     this.codiceAgente = codiceAgente;
/* 116 */     this.codiceRete = codiceRete;
/* 117 */     this.codiceCompagnia = codiceCompagnia;
/* 118 */     this.causaleMovimento = causaleMovimento;
/* 119 */     this.importoMovimento = importoMovimento;
/* 120 */     this.descrizioneTitolo = descrizioneTitolo;
/* 121 */     this.quantitaTitolo = quantitaTitolo;
/* 122 */     this.codiceIsin = codiceIsin;
/* 123 */     this.prezzo = prezzo;
/* 124 */     this.cambio = cambio;
/* 125 */     this.dataMovimento = dataMovimento;
/* 126 */     this.numeroRiferimento = numeroRiferimento;
/* 127 */     this.flagLiraEuro = flagLiraEuro;
/* 128 */     this.clcli = clcli;
/* 129 */     this.dtreg = dtreg;
/* 130 */     this.dtins = dtins;
/* 131 */     this.movxp = movxp;
/* 132 */     this.statoElaborazione = statoElaborazione;
/* 133 */     this.istanza = istanza;
/* 134 */     this.rifOrdine = rifOrdine;
/* 135 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRasBankGpMovimenti() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 143 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 147 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 151 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 155 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 159 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 163 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 167 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 171 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 175 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 179 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCausaleMovimento() {
/* 183 */     return this.causaleMovimento;
/*     */   }
/*     */   
/*     */   public void setCausaleMovimento(String causaleMovimento) {
/* 187 */     this.causaleMovimento = causaleMovimento;
/*     */   }
/*     */   
/*     */   public Double getImportoMovimento() {
/* 191 */     return this.importoMovimento;
/*     */   }
/*     */   
/*     */   public void setImportoMovimento(Double importoMovimento) {
/* 195 */     this.importoMovimento = importoMovimento;
/*     */   }
/*     */   
/*     */   public String getDescrizioneTitolo() {
/* 199 */     return this.descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 203 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public Double getQuantitaTitolo() {
/* 207 */     return this.quantitaTitolo;
/*     */   }
/*     */   
/*     */   public void setQuantitaTitolo(Double quantitaTitolo) {
/* 211 */     this.quantitaTitolo = quantitaTitolo;
/*     */   }
/*     */   
/*     */   public String getCodiceIsin() {
/* 215 */     return this.codiceIsin;
/*     */   }
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 219 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */   
/*     */   public Double getPrezzo() {
/* 223 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 227 */     this.prezzo = prezzo;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 231 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 235 */     this.cambio = cambio;
/*     */   }
/*     */   
/*     */   public Date getDataMovimento() {
/* 239 */     return this.dataMovimento;
/*     */   }
/*     */   
/*     */   public void setDataMovimento(Date dataMovimento) {
/* 243 */     this.dataMovimento = dataMovimento;
/*     */   }
/*     */   
/*     */   public String getNumeroRiferimento() {
/* 247 */     return this.numeroRiferimento;
/*     */   }
/*     */   
/*     */   public void setNumeroRiferimento(String numeroRiferimento) {
/* 251 */     this.numeroRiferimento = numeroRiferimento;
/*     */   }
/*     */   
/*     */   public String getFlagLiraEuro() {
/* 255 */     return this.flagLiraEuro;
/*     */   }
/*     */   
/*     */   public void setFlagLiraEuro(String flagLiraEuro) {
/* 259 */     this.flagLiraEuro = flagLiraEuro;
/*     */   }
/*     */   
/*     */   public Integer getClcli() {
/* 263 */     return this.clcli;
/*     */   }
/*     */   
/*     */   public void setClcli(Integer clcli) {
/* 267 */     this.clcli = clcli;
/*     */   }
/*     */   
/*     */   public Date getDtreg() {
/* 271 */     return this.dtreg;
/*     */   }
/*     */   
/*     */   public void setDtreg(Date dtreg) {
/* 275 */     this.dtreg = dtreg;
/*     */   }
/*     */   
/*     */   public Date getDtins() {
/* 279 */     return this.dtins;
/*     */   }
/*     */   
/*     */   public void setDtins(Date dtins) {
/* 283 */     this.dtins = dtins;
/*     */   }
/*     */   
/*     */   public String getMovxp() {
/* 287 */     return this.movxp;
/*     */   }
/*     */   
/*     */   public void setMovxp(String movxp) {
/* 291 */     this.movxp = movxp;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 295 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 299 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 303 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 307 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getRifOrdine() {
/* 311 */     return this.rifOrdine;
/*     */   }
/*     */   
/*     */   public void setRifOrdine(String rifOrdine) {
/* 315 */     this.rifOrdine = rifOrdine;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 319 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProd() {
/* 325 */     return this.tipoProd;
/*     */   }
/*     */   
/*     */   public void setTipoProd(String tipoProd) {
/* 329 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRasBankGpMovimenti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */