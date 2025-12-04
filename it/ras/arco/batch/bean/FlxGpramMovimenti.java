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
/*     */ public class FlxGpramMovimenti
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
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private String rifOrdine;
/*     */   private String descrizioneErrore;
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
/*  77 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  84 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  90 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  97 */     this.descrizioneErrore = descrizioneErrore;
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
/*     */   public FlxGpramMovimenti(Double cambio, String movimento, String agente, String mov, String compagnia, String isin, String rete, String mov2, Double cliente, Double rete2, Date caricamento, Date contabile, Date movimento2, Date valuta, String titolo, String euro, Double movimento3, String istanza, String rapporto, String riferimento, Double nav, Double prezzo, Double titolo2, String ordine, String cli, String rete3, String mov3, String elaborazione) {
/* 148 */     this.cambio = cambio;
/* 149 */     this.causaleMovimento = movimento;
/* 150 */     this.codiceAgente = agente;
/* 151 */     this.codiceCausaleMov = mov;
/* 152 */     this.codiceCompagnia = compagnia;
/* 153 */     this.codiceIsin = isin;
/* 154 */     this.codiceRete = rete;
/* 155 */     this.codiceTipoMov = mov2;
/* 156 */     this.commissioneCliente = cliente;
/* 157 */     this.commissioneRete = rete2;
/* 158 */     this.dataCaricamento = caricamento;
/* 159 */     this.dataContabile = contabile;
/* 160 */     this.dataMovimento = movimento2;
/* 161 */     this.dataValuta = valuta;
/* 162 */     this.descrizioneTitolo = titolo;
/* 163 */     this.flagLiraEuro = euro;
/* 164 */     this.importoMovimento = movimento3;
/* 165 */     this.istanza = istanza;
/* 166 */     this.numeroRapporto = rapporto;
/* 167 */     this.numeroRiferimento = riferimento;
/* 168 */     this.percentualeNav = nav;
/* 169 */     this.prezzo = prezzo;
/* 170 */     this.quantitaTitolo = titolo2;
/* 171 */     this.rifOrdine = ordine;
/* 172 */     this.segnoCommCli = cli;
/* 173 */     this.segnoCommRete = rete3;
/* 174 */     this.segnoMov = mov3;
/* 175 */     this.statoElaborazione = elaborazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxGpramMovimenti() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 183 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 187 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 191 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 195 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 199 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 203 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 207 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 211 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 215 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 219 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCausaleMovimento() {
/* 223 */     return this.causaleMovimento;
/*     */   }
/*     */   
/*     */   public void setCausaleMovimento(String causaleMovimento) {
/* 227 */     this.causaleMovimento = causaleMovimento;
/*     */   }
/*     */   
/*     */   public Double getImportoMovimento() {
/* 231 */     return this.importoMovimento;
/*     */   }
/*     */   
/*     */   public void setImportoMovimento(Double importoMovimento) {
/* 235 */     this.importoMovimento = importoMovimento;
/*     */   }
/*     */   
/*     */   public String getDescrizioneTitolo() {
/* 239 */     return this.descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 243 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public Double getQuantitaTitolo() {
/* 247 */     return this.quantitaTitolo;
/*     */   }
/*     */   
/*     */   public void setQuantitaTitolo(Double quantitaTitolo) {
/* 251 */     this.quantitaTitolo = quantitaTitolo;
/*     */   }
/*     */   
/*     */   public String getCodiceIsin() {
/* 255 */     return this.codiceIsin;
/*     */   }
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 259 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */   
/*     */   public Double getPrezzo() {
/* 263 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 267 */     this.prezzo = prezzo;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 271 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 275 */     this.cambio = cambio;
/*     */   }
/*     */   
/*     */   public Date getDataMovimento() {
/* 279 */     return this.dataMovimento;
/*     */   }
/*     */   
/*     */   public void setDataMovimento(Date dataMovimento) {
/* 283 */     this.dataMovimento = dataMovimento;
/*     */   }
/*     */   
/*     */   public String getNumeroRiferimento() {
/* 287 */     return this.numeroRiferimento;
/*     */   }
/*     */   
/*     */   public void setNumeroRiferimento(String numeroRiferimento) {
/* 291 */     this.numeroRiferimento = numeroRiferimento;
/*     */   }
/*     */   
/*     */   public String getFlagLiraEuro() {
/* 295 */     return this.flagLiraEuro;
/*     */   }
/*     */   
/*     */   public void setFlagLiraEuro(String flagLiraEuro) {
/* 299 */     this.flagLiraEuro = flagLiraEuro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCausaleMov() {
/* 308 */     return this.codiceCausaleMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCausaleMov(String codiceCausaleMov) {
/* 315 */     this.codiceCausaleMov = codiceCausaleMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceTipoMov() {
/* 322 */     return this.codiceTipoMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceTipoMov(String codiceTipoMov) {
/* 329 */     this.codiceTipoMov = codiceTipoMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCommissioneCliente() {
/* 336 */     return this.commissioneCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCommissioneCliente(Double commissioneCliente) {
/* 343 */     this.commissioneCliente = commissioneCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCommissioneRete() {
/* 350 */     return this.commissioneRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCommissioneRete(Double commissioneRete) {
/* 357 */     this.commissioneRete = commissioneRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 364 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 371 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataContabile() {
/* 378 */     return this.dataContabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataContabile(Date dataContabile) {
/* 385 */     this.dataContabile = dataContabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValuta() {
/* 392 */     return this.dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 399 */     this.dataValuta = dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercentualeNav() {
/* 406 */     return this.percentualeNav;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeNav(Double percentualeNav) {
/* 413 */     this.percentualeNav = percentualeNav;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoCommCli() {
/* 420 */     return this.segnoCommCli;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoCommCli(String segnoCommCli) {
/* 427 */     this.segnoCommCli = segnoCommCli;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoCommRete() {
/* 434 */     return this.segnoCommRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoCommRete(String segnoCommRete) {
/* 441 */     this.segnoCommRete = segnoCommRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSegnoMov() {
/* 448 */     return this.segnoMov;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSegnoMov(String segnoMov) {
/* 455 */     this.segnoMov = segnoMov;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 459 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 463 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 467 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 471 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getRifOrdine() {
/* 475 */     return this.rifOrdine;
/*     */   }
/*     */   
/*     */   public void setRifOrdine(String rifOrdine) {
/* 479 */     this.rifOrdine = rifOrdine;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 483 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpramMovimenti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */