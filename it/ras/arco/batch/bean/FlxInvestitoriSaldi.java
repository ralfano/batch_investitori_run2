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
/*     */ public class FlxInvestitoriSaldi
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
/*     */   private Double controvaloreDivisa;
/*     */   private String categoriaTitolo;
/*     */   
/*     */   public Date getDataElab() {
/*  85 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  92 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  99 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 106 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxInvestitoriSaldi(String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, String descrizioneTitolo, Double quantitaDisponibile, Double prezzo, Double rateo, String divisa, Double cambio, Double controvalore, Double prezzoMedio, String codiceIsin, String categoria, String paeseDiEmissione, Double cambioMedio, String statoElab, String istanza) {
/* 112 */     this.numeroRapporto = numeroRapporto;
/* 113 */     this.codiceAgente = codiceAgente;
/* 114 */     this.codiceRete = codiceRete;
/* 115 */     this.codiceCompagnia = codiceCompagnia;
/* 116 */     this.descrizioneTitolo = descrizioneTitolo;
/* 117 */     this.quantitaDisponibile = quantitaDisponibile;
/* 118 */     this.prezzo = prezzo;
/* 119 */     this.rateo = rateo;
/* 120 */     this.divisa = divisa;
/* 121 */     this.cambio = cambio;
/* 122 */     this.controvalore = controvalore;
/* 123 */     this.prezzoMedio = prezzoMedio;
/* 124 */     this.codiceIsin = codiceIsin;
/* 125 */     this.categoria = categoria;
/* 126 */     this.paeseDiEmissione = paeseDiEmissione;
/* 127 */     this.cambioMedio = cambioMedio;
/* 128 */     this.statoElab = statoElab;
/* 129 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxInvestitoriSaldi() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 137 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 141 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 145 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 149 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 153 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 157 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 161 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 165 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 169 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 173 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getDescrizioneTitolo() {
/* 177 */     return this.descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 181 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public Double getQuantitaDisponibile() {
/* 185 */     return this.quantitaDisponibile;
/*     */   }
/*     */   
/*     */   public void setQuantitaDisponibile(Double quantitaDisponibile) {
/* 189 */     this.quantitaDisponibile = quantitaDisponibile;
/*     */   }
/*     */   
/*     */   public Double getPrezzo() {
/* 193 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 197 */     this.prezzo = prezzo;
/*     */   }
/*     */   
/*     */   public Double getRateo() {
/* 201 */     return this.rateo;
/*     */   }
/*     */   
/*     */   public void setRateo(Double rateo) {
/* 205 */     this.rateo = rateo;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 209 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 213 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 217 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 221 */     this.cambio = cambio;
/*     */   }
/*     */   
/*     */   public Double getControvalore() {
/* 225 */     return this.controvalore;
/*     */   }
/*     */   
/*     */   public void setControvalore(Double controvalore) {
/* 229 */     this.controvalore = controvalore;
/*     */   }
/*     */   
/*     */   public Double getPrezzoMedio() {
/* 233 */     return this.prezzoMedio;
/*     */   }
/*     */   
/*     */   public void setPrezzoMedio(Double prezzoMedio) {
/* 237 */     this.prezzoMedio = prezzoMedio;
/*     */   }
/*     */   
/*     */   public String getCodiceIsin() {
/* 241 */     return this.codiceIsin;
/*     */   }
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 245 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */   
/*     */   public String getCategoria() {
/* 249 */     return this.categoria;
/*     */   }
/*     */   
/*     */   public void setCategoria(String categoria) {
/* 253 */     this.categoria = categoria;
/*     */   }
/*     */   
/*     */   public String getPaeseDiEmissione() {
/* 257 */     return this.paeseDiEmissione;
/*     */   }
/*     */   
/*     */   public void setPaeseDiEmissione(String paeseDiEmissione) {
/* 261 */     this.paeseDiEmissione = paeseDiEmissione;
/*     */   }
/*     */   
/*     */   public Double getCambioMedio() {
/* 265 */     return this.cambioMedio;
/*     */   }
/*     */   
/*     */   public void setCambioMedio(Double cambioMedio) {
/* 269 */     this.cambioMedio = cambioMedio;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 273 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 277 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 281 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 290 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 296 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Double getControvaloreDivisa() {
/* 300 */     return this.controvaloreDivisa;
/*     */   }
/*     */   
/*     */   public void setControvaloreDivisa(Double controvaloreDivisa) {
/* 304 */     this.controvaloreDivisa = controvaloreDivisa;
/*     */   }
/*     */   
/*     */   public String getCategoriaTitolo() {
/* 308 */     return this.categoriaTitolo;
/*     */   }
/*     */   
/*     */   public void setCategoriaTitolo(String categoriaTitolo) {
/* 312 */     this.categoriaTitolo = categoriaTitolo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxInvestitoriSaldi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */