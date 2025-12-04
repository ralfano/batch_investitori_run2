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
/*     */ public class FlxInvestitoriMovimenti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
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
/*     */   private String tipoFabbrica;
/*     */   private String tipoProd;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private String rifOrdine;
/*     */   private String descrizioneErrore;
/*     */   private String numeroRifEsterno;
/*     */   private Date dataElab;
/*     */   private Double commissioneRete;
/*     */   private String segnoMov;
/*     */   private String segnoCommRete;
/*     */   private Double commissioneCliente;
/*     */   private String segnoCommCli;
/*     */   private String codiceCausaleMov;
/*     */   private String codiceTipoMov;
/*     */   private Date dataContabile;
/*     */   private Date dataValuta;
/*     */   private Double percentualeNav;
/*     */   private Date dataCaricamento;
/*     */   
/*     */   public Date getDataElab() {
/*  83 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  90 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  96 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 103 */     this.descrizioneErrore = descrizioneErrore;
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
/*     */   public FlxInvestitoriMovimenti(Double cambio, String movimento, String agente, String mov, String compagnia, String isin, String rete, String mov2, Double cliente, Double rete2, Date caricamento, Date contabile, Date movimento2, Date valuta, String titolo, String euro, Double movimento3, String istanza, String rapporto, String riferimento, Double nav, Double prezzo, Double titolo2, String ordine, String cli, String rete3, String mov3, String elaborazione) {
/* 154 */     this.cambio = cambio;
/* 155 */     this.causaleMovimento = movimento;
/* 156 */     this.codiceAgente = agente;
/* 157 */     this.codiceCausaleMov = mov;
/* 158 */     this.codiceCompagnia = compagnia;
/* 159 */     this.codiceIsin = isin;
/* 160 */     this.codiceRete = rete;
/* 161 */     this.codiceTipoMov = mov2;
/* 162 */     this.commissioneCliente = cliente;
/* 163 */     this.commissioneRete = rete2;
/* 164 */     this.dataCaricamento = caricamento;
/* 165 */     this.dataContabile = contabile;
/* 166 */     this.dataMovimento = movimento2;
/* 167 */     this.dataValuta = valuta;
/* 168 */     this.descrizioneTitolo = titolo;
/* 169 */     this.flagLiraEuro = euro;
/* 170 */     this.importoMovimento = movimento3;
/* 171 */     this.istanza = istanza;
/* 172 */     this.numeroRapporto = rapporto;
/* 173 */     this.numeroRiferimento = riferimento;
/* 174 */     this.percentualeNav = nav;
/* 175 */     this.prezzo = prezzo;
/* 176 */     this.quantitaTitolo = titolo2;
/* 177 */     this.rifOrdine = ordine;
/* 178 */     this.segnoCommCli = cli;
/* 179 */     this.segnoCommRete = rete3;
/* 180 */     this.segnoMov = mov3;
/* 181 */     this.statoElaborazione = elaborazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxInvestitoriMovimenti() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 189 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 193 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 197 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 201 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 205 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 209 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 213 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 217 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 221 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 225 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCausaleMovimento() {
/* 229 */     return this.causaleMovimento;
/*     */   }
/*     */   
/*     */   public void setCausaleMovimento(String causaleMovimento) {
/* 233 */     this.causaleMovimento = causaleMovimento;
/*     */   }
/*     */   
/*     */   public Double getImportoMovimento() {
/* 237 */     return this.importoMovimento;
/*     */   }
/*     */   
/*     */   public void setImportoMovimento(Double importoMovimento) {
/* 241 */     this.importoMovimento = importoMovimento;
/*     */   }
/*     */   
/*     */   public String getDescrizioneTitolo() {
/* 245 */     return this.descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 249 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public Double getQuantitaTitolo() {
/* 253 */     return this.quantitaTitolo;
/*     */   }
/*     */   
/*     */   public void setQuantitaTitolo(Double quantitaTitolo) {
/* 257 */     this.quantitaTitolo = quantitaTitolo;
/*     */   }
/*     */   
/*     */   public String getCodiceIsin() {
/* 261 */     return this.codiceIsin;
/*     */   }
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 265 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */   
/*     */   public Double getPrezzo() {
/* 269 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 273 */     this.prezzo = prezzo;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 277 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 281 */     this.cambio = cambio;
/*     */   }
/*     */   
/*     */   public Date getDataMovimento() {
/* 285 */     return this.dataMovimento;
/*     */   }
/*     */   
/*     */   public void setDataMovimento(Date dataMovimento) {
/* 289 */     this.dataMovimento = dataMovimento;
/*     */   }
/*     */   
/*     */   public String getNumeroRiferimento() {
/* 293 */     return this.numeroRiferimento;
/*     */   }
/*     */   
/*     */   public void setNumeroRiferimento(String numeroRiferimento) {
/* 297 */     this.numeroRiferimento = numeroRiferimento;
/*     */   }
/*     */   
/*     */   public String getFlagLiraEuro() {
/* 301 */     return this.flagLiraEuro;
/*     */   }
/*     */   
/*     */   public void setFlagLiraEuro(String flagLiraEuro) {
/* 305 */     this.flagLiraEuro = flagLiraEuro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCausaleMov() {
/* 314 */     return this.codiceCausaleMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCausaleMov(String codiceCausaleMov) {
/* 321 */     this.codiceCausaleMov = codiceCausaleMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceTipoMov() {
/* 328 */     return this.codiceTipoMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceTipoMov(String codiceTipoMov) {
/* 335 */     this.codiceTipoMov = codiceTipoMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCommissioneCliente() {
/* 342 */     return this.commissioneCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCommissioneCliente(Double commissioneCliente) {
/* 349 */     this.commissioneCliente = commissioneCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCommissioneRete() {
/* 356 */     return this.commissioneRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCommissioneRete(Double commissioneRete) {
/* 363 */     this.commissioneRete = commissioneRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 370 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 377 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataContabile() {
/* 384 */     return this.dataContabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataContabile(Date dataContabile) {
/* 391 */     this.dataContabile = dataContabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValuta() {
/* 398 */     return this.dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 405 */     this.dataValuta = dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercentualeNav() {
/* 412 */     return this.percentualeNav;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeNav(Double percentualeNav) {
/* 419 */     this.percentualeNav = percentualeNav;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoCommCli() {
/* 426 */     return this.segnoCommCli;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoCommCli(String segnoCommCli) {
/* 433 */     this.segnoCommCli = segnoCommCli;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoCommRete() {
/* 440 */     return this.segnoCommRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoCommRete(String segnoCommRete) {
/* 447 */     this.segnoCommRete = segnoCommRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoMov() {
/* 454 */     return this.segnoMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoMov(String segnoMov) {
/* 461 */     this.segnoMov = segnoMov;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 465 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 469 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 473 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 477 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getRifOrdine() {
/* 481 */     return this.rifOrdine;
/*     */   }
/*     */   
/*     */   public void setRifOrdine(String rifOrdine) {
/* 485 */     this.rifOrdine = rifOrdine;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 489 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoFabbrica() {
/* 498 */     return this.tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoFabbrica(String tipoFabbrica) {
/* 505 */     this.tipoFabbrica = tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProd() {
/* 512 */     return this.tipoProd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoProd(String tipoProd) {
/* 519 */     this.tipoProd = tipoProd;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroRifEsterno() {
/* 526 */     return this.numeroRifEsterno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroRifEsterno(String numeroRifEsterno) {
/* 533 */     this.numeroRifEsterno = numeroRifEsterno;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxInvestitoriMovimenti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */