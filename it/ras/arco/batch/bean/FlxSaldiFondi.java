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
/*     */ public class FlxSaldiFondi
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String descrizioneTitolo;
/*     */   private Double quantitaDisponibile;
/*     */   private Double prezzo;
/*     */   private Double rateo;
/*     */   private String divisa;
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
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  91 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  98 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSaldiFondi(String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, String descrizioneTitolo, Double quantitaDisponibile, Double prezzo, Double rateo, String divisa, Double cambio, Double controvalore, Double prezzoMedio, String codiceIsin, String categoria, String paeseDiEmissione, Double cambioMedio, String statoElab, String istanza) {
/* 104 */     this.numeroRapporto = numeroRapporto;
/* 105 */     this.codiceAgente = codiceAgente;
/* 106 */     this.codiceRete = codiceRete;
/* 107 */     this.codiceCompagnia = codiceCompagnia;
/* 108 */     this.descrizioneTitolo = descrizioneTitolo;
/* 109 */     this.quantitaDisponibile = quantitaDisponibile;
/* 110 */     this.prezzo = prezzo;
/* 111 */     this.rateo = rateo;
/* 112 */     this.divisa = divisa;
/* 113 */     this.cambio = cambio;
/* 114 */     this.controvalore = controvalore;
/* 115 */     this.prezzoMedio = prezzoMedio;
/* 116 */     this.codiceIsin = codiceIsin;
/* 117 */     this.categoria = categoria;
/* 118 */     this.paeseDiEmissione = paeseDiEmissione;
/* 119 */     this.cambioMedio = cambioMedio;
/* 120 */     this.statoElab = statoElab;
/* 121 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSaldiFondi() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 129 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 133 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 137 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 141 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 145 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 149 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 153 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 157 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 161 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 165 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getDescrizioneTitolo() {
/* 169 */     return this.descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 173 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public Double getQuantitaDisponibile() {
/* 177 */     return this.quantitaDisponibile;
/*     */   }
/*     */   
/*     */   public void setQuantitaDisponibile(Double quantitaDisponibile) {
/* 181 */     this.quantitaDisponibile = quantitaDisponibile;
/*     */   }
/*     */   
/*     */   public Double getPrezzo() {
/* 185 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 189 */     this.prezzo = prezzo;
/*     */   }
/*     */   
/*     */   public Double getRateo() {
/* 193 */     return this.rateo;
/*     */   }
/*     */   
/*     */   public void setRateo(Double rateo) {
/* 197 */     this.rateo = rateo;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 201 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 205 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 209 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 213 */     this.cambio = cambio;
/*     */   }
/*     */   
/*     */   public Double getControvalore() {
/* 217 */     return this.controvalore;
/*     */   }
/*     */   
/*     */   public void setControvalore(Double controvalore) {
/* 221 */     this.controvalore = controvalore;
/*     */   }
/*     */   
/*     */   public Double getPrezzoMedio() {
/* 225 */     return this.prezzoMedio;
/*     */   }
/*     */   
/*     */   public void setPrezzoMedio(Double prezzoMedio) {
/* 229 */     this.prezzoMedio = prezzoMedio;
/*     */   }
/*     */   
/*     */   public String getCodiceIsin() {
/* 233 */     return this.codiceIsin;
/*     */   }
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 237 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */   
/*     */   public String getCategoria() {
/* 241 */     return this.categoria;
/*     */   }
/*     */   
/*     */   public void setCategoria(String categoria) {
/* 245 */     this.categoria = categoria;
/*     */   }
/*     */   
/*     */   public String getPaeseDiEmissione() {
/* 249 */     return this.paeseDiEmissione;
/*     */   }
/*     */   
/*     */   public void setPaeseDiEmissione(String paeseDiEmissione) {
/* 253 */     this.paeseDiEmissione = paeseDiEmissione;
/*     */   }
/*     */   
/*     */   public Double getCambioMedio() {
/* 257 */     return this.cambioMedio;
/*     */   }
/*     */   
/*     */   public void setCambioMedio(Double cambioMedio) {
/* 261 */     this.cambioMedio = cambioMedio;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 265 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 269 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 273 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 282 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 288 */     this.istanza = istanza;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSaldiFondi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */