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
/*     */ public class FlxRasBankGpSaldiFondi
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
/*     */   private String codiceRete;
/*     */   private String campo;
/*     */   private String piazzaTrattazione;
/*     */   private String emissioneTitolo;
/*     */   private String codiceCompagnia;
/*     */   private String descrizioneTitolo;
/*     */   private String tipoProd;
/*     */   private Double quantitaDisponibile;
/*     */   private Double prezzo;
/*     */   private Double rateo;
/*     */   private String divisa;
/*     */   private String filler;
/*     */   private Double cambio;
/*     */   private Double controvalore;
/*     */   private Double prezzoMedio;
/*     */   private String codiceIsin;
/*     */   private String categoria;
/*     */   private String paeseDiEmissione;
/*     */   private Double cambioMedio;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/*  88 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  95 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
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
/*     */   public FlxRasBankGpSaldiFondi(String filler, String campo, String emissioneTitolo, String piazzaTrattazione, String tipoProd, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, String descrizioneTitolo, Double quantitaDisponibile, Double prezzo, Double rateo, String divisa, Double cambio, Double controvalore, Double prezzoMedio, String codiceIsin, String categoria, String paeseDiEmissione, Double cambioMedio, String statoElab, String istanza) {
/* 114 */     this.numeroRapporto = numeroRapporto;
/* 115 */     this.codiceAgente = codiceAgente;
/* 116 */     this.codiceRete = codiceRete;
/* 117 */     this.codiceCompagnia = codiceCompagnia;
/* 118 */     this.descrizioneTitolo = descrizioneTitolo;
/* 119 */     this.quantitaDisponibile = quantitaDisponibile;
/* 120 */     this.prezzo = prezzo;
/* 121 */     this.rateo = rateo;
/* 122 */     this.divisa = divisa;
/* 123 */     this.cambio = cambio;
/* 124 */     this.controvalore = controvalore;
/* 125 */     this.prezzoMedio = prezzoMedio;
/* 126 */     this.codiceIsin = codiceIsin;
/* 127 */     this.categoria = categoria;
/* 128 */     this.paeseDiEmissione = paeseDiEmissione;
/* 129 */     this.cambioMedio = cambioMedio;
/* 130 */     this.statoElab = statoElab;
/* 131 */     this.istanza = istanza;
/* 132 */     this.tipoProd = tipoProd;
/* 133 */     this.piazzaTrattazione = piazzaTrattazione;
/* 134 */     this.emissioneTitolo = emissioneTitolo;
/* 135 */     this.campo = campo;
/* 136 */     this.filler = filler;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRasBankGpSaldiFondi() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 144 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 148 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 152 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 156 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 160 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 164 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 168 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 172 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 176 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 180 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getDescrizioneTitolo() {
/* 184 */     return this.descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 188 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public Double getQuantitaDisponibile() {
/* 192 */     return this.quantitaDisponibile;
/*     */   }
/*     */   
/*     */   public void setQuantitaDisponibile(Double quantitaDisponibile) {
/* 196 */     this.quantitaDisponibile = quantitaDisponibile;
/*     */   }
/*     */   
/*     */   public Double getPrezzo() {
/* 200 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 204 */     this.prezzo = prezzo;
/*     */   }
/*     */   
/*     */   public Double getRateo() {
/* 208 */     return this.rateo;
/*     */   }
/*     */   
/*     */   public void setRateo(Double rateo) {
/* 212 */     this.rateo = rateo;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 216 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 220 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 224 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 228 */     this.cambio = cambio;
/*     */   }
/*     */   
/*     */   public Double getControvalore() {
/* 232 */     return this.controvalore;
/*     */   }
/*     */   
/*     */   public void setControvalore(Double controvalore) {
/* 236 */     this.controvalore = controvalore;
/*     */   }
/*     */   
/*     */   public Double getPrezzoMedio() {
/* 240 */     return this.prezzoMedio;
/*     */   }
/*     */   
/*     */   public void setPrezzoMedio(Double prezzoMedio) {
/* 244 */     this.prezzoMedio = prezzoMedio;
/*     */   }
/*     */   
/*     */   public String getCodiceIsin() {
/* 248 */     return this.codiceIsin;
/*     */   }
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 252 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */   
/*     */   public String getCategoria() {
/* 256 */     return this.categoria;
/*     */   }
/*     */   
/*     */   public void setCategoria(String categoria) {
/* 260 */     this.categoria = categoria;
/*     */   }
/*     */   
/*     */   public String getPaeseDiEmissione() {
/* 264 */     return this.paeseDiEmissione;
/*     */   }
/*     */   
/*     */   public void setPaeseDiEmissione(String paeseDiEmissione) {
/* 268 */     this.paeseDiEmissione = paeseDiEmissione;
/*     */   }
/*     */   
/*     */   public Double getCambioMedio() {
/* 272 */     return this.cambioMedio;
/*     */   }
/*     */   
/*     */   public void setCambioMedio(Double cambioMedio) {
/* 276 */     this.cambioMedio = cambioMedio;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 280 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 284 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 288 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 297 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 303 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getTipoProd() {
/* 307 */     return this.tipoProd;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEmissioneTitolo() {
/* 313 */     return this.emissioneTitolo;
/*     */   }
/*     */   
/*     */   public void setEmissioneTitolo(String emissioneTitolo) {
/* 317 */     this.emissioneTitolo = emissioneTitolo;
/*     */   }
/*     */   
/*     */   public String getPiazzaTrattazione() {
/* 321 */     return this.piazzaTrattazione;
/*     */   }
/*     */   
/*     */   public void setPiazzaTrattazione(String piazzaTrattazione) {
/* 325 */     this.piazzaTrattazione = piazzaTrattazione;
/*     */   }
/*     */   
/*     */   public String getCampo() {
/* 329 */     return this.campo;
/*     */   }
/*     */   
/*     */   public void setCampo(String campo) {
/* 333 */     this.campo = campo;
/*     */   }
/*     */   
/*     */   public void setTipoProd(String tipoProd) {
/* 337 */     this.tipoProd = tipoProd;
/*     */   }
/*     */   
/*     */   public String getFiller() {
/* 341 */     return this.filler;
/*     */   }
/*     */   
/*     */   public void setFiller(String filler) {
/* 345 */     this.filler = filler;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRasBankGpSaldiFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */