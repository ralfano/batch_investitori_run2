/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinOrdine
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String MovimentoIniziativa = "I";
/*     */   public static final String EXECUTED = "E";
/*     */   public static final String INSERTED = "I";
/*     */   public static final String SENT = "S";
/*     */   public static final String CANCELLED = "C";
/*     */   public static final String TIPO_ORDINE_PRIMO_ORDINE = "PR";
/*     */   public static final String TIPO_ORDINE_VERSAMENTO_AGGIUNTIVO = "AG";
/*     */   public static final String TIPO_ORDINE_RIMBORSO_PARZIALE = "RP";
/*     */   public static final String TIPO_ORDINE_RIMBORSO_TOTALE = "RT";
/*     */   public static final String TIPO_ORDINE_PASSAGGI_IN = "PI";
/*     */   public static final String TIPO_ORDINE_PASSAGGI_OUT = "PO";
/*     */   public static final String TIPO_ORDINE_SWITCH_IN = "SI";
/*     */   public static final String TIPO_ORDINE_SWITCH_OUT = "SO";
/*     */   private Integer ordineId;
/*     */   private Integer sottoscrizioneId;
/*     */   private Integer attivitaFinId;
/*     */   private String stato;
/*     */   private String flgBuySell;
/*     */   private String causale;
/*     */   private Date dataInserimentoOrdine;
/*     */   private Date dataEsecuzione;
/*     */   private String numOrdineExt;
/*     */   private String divisa;
/*     */   private Double importo;
/*     */   private Double importoNew;
/*     */   private Double quantita;
/*     */   private Double quantitaNew;
/*     */   private Double quantitaRim;
/*     */   private String tipoPrezzo;
/*     */   private Double prezzoLimite;
/*     */   private Date oraLimite;
/*     */   private Date dataLimite;
/*     */   private Double limiteStopLoss;
/*     */   private Double liqPrenot;
/*     */   private Date dataRevoca;
/*     */   private String numRevExt;
/*     */   private String tipoRevoca;
/*     */   private String flagImportoDaDefinire;
/*     */   private String flagImportoTot;
/*     */   private String utenteInserimento;
/*     */   private String flagConflInteresse;
/*     */   private String flagAdeguatezza;
/*     */   private String motivoOrdInadeguato;
/*     */   private Set movimenti;
/*     */   private FinAttivitaFinanziaria attivitaFin;
/*     */   private FinSottoscrizione sottoscrizione;
/*     */   private Date dataInserimento;
/*     */   private FinPosizione posizione;
/*     */   private String tipo;
/*     */   private Double percentuale;
/*     */   private FinCertificato certificato;
/*     */   private String codiceSconto;
/*     */   private String codiceConvenzione;
/*     */   private String flgNoPagAmministrative;
/*     */   private String conferimentoMisto;
/*     */   private String note;
/*     */   private String flagInAttesaDiLiberatoria;
/*     */   private Date dataRicezioneLiberatoria;
/*     */   private Integer ordine;
/*     */   private String flagNuovoContrattoB;
/*     */   private FinOrdine ordineCollegato;
/*     */   
/*     */   public FinOrdine() {}
/*     */   
/*     */   public FinOrdine(Set movimenti) {
/* 181 */     this.movimenti = movimenti;
/*     */   }
/*     */   
/*     */   public Integer getOrdineId() {
/* 185 */     return this.ordineId;
/*     */   }
/*     */   
/*     */   public void setOrdineId(Integer ordineId) {
/* 189 */     this.ordineId = ordineId;
/*     */   }
/*     */   
/*     */   public Integer getSottoscrizioneId() {
/* 193 */     return this.sottoscrizioneId;
/*     */   }
/*     */   
/*     */   public void setSottoscrizioneId(Integer sottoscrizioneId) {
/* 197 */     this.sottoscrizioneId = sottoscrizioneId;
/*     */   }
/*     */   
/*     */   public Integer getAttivitaFinId() {
/* 201 */     return this.attivitaFinId;
/*     */   }
/*     */   
/*     */   public void setAttivitaFinId(Integer attivitaFinId) {
/* 205 */     this.attivitaFinId = attivitaFinId;
/*     */   }
/*     */   
/*     */   public String getStato() {
/* 209 */     return this.stato;
/*     */   }
/*     */   
/*     */   public void setStato(String stato) {
/* 213 */     this.stato = stato;
/*     */   }
/*     */   
/*     */   public String getFlgBuySell() {
/* 217 */     return this.flgBuySell;
/*     */   }
/*     */   
/*     */   public void setFlgBuySell(String flgBuySell) {
/* 221 */     this.flgBuySell = flgBuySell;
/*     */   }
/*     */   
/*     */   public String getCausale() {
/* 225 */     return this.causale;
/*     */   }
/*     */   
/*     */   public void setCausale(String causale) {
/* 229 */     this.causale = causale;
/*     */   }
/*     */   
/*     */   public Date getDataInserimentoOrdine() {
/* 233 */     return this.dataInserimentoOrdine;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoOrdine(Date dataInserimentoOrdine) {
/* 237 */     this.dataInserimentoOrdine = dataInserimentoOrdine;
/*     */   }
/*     */   
/*     */   public Date getDataEsecuzione() {
/* 241 */     return this.dataEsecuzione;
/*     */   }
/*     */   
/*     */   public void setDataEsecuzione(Date dataEsecuzione) {
/* 245 */     this.dataEsecuzione = dataEsecuzione;
/*     */   }
/*     */   
/*     */   public String getNumOrdineExt() {
/* 249 */     return this.numOrdineExt;
/*     */   }
/*     */   
/*     */   public void setNumOrdineExt(String numOrdineExt) {
/* 253 */     this.numOrdineExt = numOrdineExt;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 257 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 261 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public Double getImporto() {
/* 265 */     return this.importo;
/*     */   }
/*     */   
/*     */   public void setImporto(Double importo) {
/* 269 */     this.importo = importo;
/*     */   }
/*     */   
/*     */   public Double getQuantita() {
/* 273 */     return this.quantita;
/*     */   }
/*     */   
/*     */   public void setQuantita(Double quantita) {
/* 277 */     this.quantita = quantita;
/*     */   }
/*     */   
/*     */   public Double getQuantitaRim() {
/* 281 */     return this.quantitaRim;
/*     */   }
/*     */   
/*     */   public void setQuantitaRim(Double quantitaRim) {
/* 285 */     this.quantitaRim = quantitaRim;
/*     */   }
/*     */   
/*     */   public String getTipoPrezzo() {
/* 289 */     return this.tipoPrezzo;
/*     */   }
/*     */   
/*     */   public void setTipoPrezzo(String tipoPrezzo) {
/* 293 */     this.tipoPrezzo = tipoPrezzo;
/*     */   }
/*     */   
/*     */   public Double getPrezzoLimite() {
/* 297 */     return this.prezzoLimite;
/*     */   }
/*     */   
/*     */   public void setPrezzoLimite(Double prezzoLimite) {
/* 301 */     this.prezzoLimite = prezzoLimite;
/*     */   }
/*     */   
/*     */   public Date getOraLimite() {
/* 305 */     return this.oraLimite;
/*     */   }
/*     */   
/*     */   public void setOraLimite(Date oraLimite) {
/* 309 */     this.oraLimite = oraLimite;
/*     */   }
/*     */   
/*     */   public Date getDataLimite() {
/* 313 */     return this.dataLimite;
/*     */   }
/*     */   
/*     */   public void setDataLimite(Date dataLimite) {
/* 317 */     this.dataLimite = dataLimite;
/*     */   }
/*     */   
/*     */   public Double getLimiteStopLoss() {
/* 321 */     return this.limiteStopLoss;
/*     */   }
/*     */   
/*     */   public void setLimiteStopLoss(Double limiteStopLoss) {
/* 325 */     this.limiteStopLoss = limiteStopLoss;
/*     */   }
/*     */   
/*     */   public Double getLiqPrenot() {
/* 329 */     return this.liqPrenot;
/*     */   }
/*     */   
/*     */   public void setLiqPrenot(Double liqPrenot) {
/* 333 */     this.liqPrenot = liqPrenot;
/*     */   }
/*     */   
/*     */   public Date getDataRevoca() {
/* 337 */     return this.dataRevoca;
/*     */   }
/*     */   
/*     */   public void setDataRevoca(Date dataRevoca) {
/* 341 */     this.dataRevoca = dataRevoca;
/*     */   }
/*     */   
/*     */   public String getNumRevExt() {
/* 345 */     return this.numRevExt;
/*     */   }
/*     */   
/*     */   public void setNumRevExt(String numRevExt) {
/* 349 */     this.numRevExt = numRevExt;
/*     */   }
/*     */   
/*     */   public String getTipoRevoca() {
/* 353 */     return this.tipoRevoca;
/*     */   }
/*     */   
/*     */   public void setTipoRevoca(String tipoRevoca) {
/* 357 */     this.tipoRevoca = tipoRevoca;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 361 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 365 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getFlagConflInteresse() {
/* 369 */     return this.flagConflInteresse;
/*     */   }
/*     */   
/*     */   public void setFlagConflInteresse(String flagConflInteresse) {
/* 373 */     this.flagConflInteresse = flagConflInteresse;
/*     */   }
/*     */   
/*     */   public String getFlagAdeguatezza() {
/* 377 */     return this.flagAdeguatezza;
/*     */   }
/*     */   
/*     */   public void setFlagAdeguatezza(String flagAdeguatezza) {
/* 381 */     this.flagAdeguatezza = flagAdeguatezza;
/*     */   }
/*     */   
/*     */   public String getMotivoOrdInadeguato() {
/* 385 */     return this.motivoOrdInadeguato;
/*     */   }
/*     */   
/*     */   public void setMotivoOrdInadeguato(String motivoOrdInadeguato) {
/* 389 */     this.motivoOrdInadeguato = motivoOrdInadeguato;
/*     */   }
/*     */   
/*     */   public Set getMovimenti() {
/* 393 */     return this.movimenti;
/*     */   }
/*     */   
/*     */   public void setMovimenti(Set movimenti) {
/* 397 */     this.movimenti = movimenti;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 401 */     return (new ToStringBuilder(this)).append("ordineId", getOrdineId()).toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public FinSottoscrizione getSottoscrizione() {
/* 406 */     return this.sottoscrizione;
/*     */   }
/*     */   
/*     */   public void setSottoscrizione(FinSottoscrizione sottoscrizione) {
/* 410 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 414 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 418 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFin() {
/* 422 */     return this.attivitaFin;
/*     */   }
/*     */   
/*     */   public void setAttivitaFin(FinAttivitaFinanziaria attivitaFin) {
/* 426 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */   
/*     */   public String getTipo() {
/* 430 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(String tipo) {
/* 434 */     this.tipo = tipo;
/*     */   }
/*     */   
/*     */   public Double getPercentuale() {
/* 438 */     return this.percentuale;
/*     */   }
/*     */   
/*     */   public void setPercentuale(Double percentuale) {
/* 442 */     this.percentuale = percentuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizione getPosizione() {
/* 449 */     return this.posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizione(FinPosizione posizione) {
/* 457 */     this.posizione = posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagImportoDaDefinire() {
/* 464 */     return this.flagImportoDaDefinire;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagImportoDaDefinire(String flagImportoDaDefinire) {
/* 472 */     this.flagImportoDaDefinire = flagImportoDaDefinire;
/*     */   }
/*     */   
/*     */   public String getFlagImportoTot() {
/* 476 */     return this.flagImportoTot;
/*     */   }
/*     */   
/*     */   public void setFlagImportoTot(String flagImportoTot) {
/* 480 */     this.flagImportoTot = flagImportoTot;
/*     */   }
/*     */   
/*     */   public FinCertificato getCertificato() {
/* 484 */     return this.certificato;
/*     */   }
/*     */   
/*     */   public void setCertificato(FinCertificato certificato) {
/* 488 */     this.certificato = certificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSconto() {
/* 495 */     return this.codiceSconto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSconto(String codiceSconto) {
/* 503 */     this.codiceSconto = codiceSconto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getConferimentoMisto() {
/* 510 */     return this.conferimentoMisto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setConferimentoMisto(String conferimentoMisto) {
/* 518 */     this.conferimentoMisto = conferimentoMisto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNote() {
/* 525 */     return this.note;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNote(String note) {
/* 533 */     this.note = note;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRicezioneLiberatoria() {
/* 540 */     return this.dataRicezioneLiberatoria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataRicezioneLiberatoria(Date dataRicezioneLiberatoria) {
/* 548 */     this.dataRicezioneLiberatoria = dataRicezioneLiberatoria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagInAttesaDiLiberatoria() {
/* 555 */     return this.flagInAttesaDiLiberatoria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagInAttesaDiLiberatoria(String flagInAttesaDiLiberatoria) {
/* 563 */     this.flagInAttesaDiLiberatoria = flagInAttesaDiLiberatoria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoNew() {
/* 570 */     return this.importoNew;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoNew(Double importoNew) {
/* 578 */     this.importoNew = importoNew;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuantitaNew() {
/* 585 */     return this.quantitaNew;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuantitaNew(Double quantitaNew) {
/* 593 */     this.quantitaNew = quantitaNew;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinOrdine getOrdineCollegato() {
/* 600 */     return this.ordineCollegato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrdineCollegato(FinOrdine ordineCollegato) {
/* 607 */     this.ordineCollegato = ordineCollegato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceConvenzione() {
/* 614 */     return this.codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceConvenzione(String codiceConvenzione) {
/* 620 */     this.codiceConvenzione = codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgNoPagAmministrative() {
/* 626 */     return this.flgNoPagAmministrative;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlgNoPagAmministrative(String flgNoPagAmministrative) {
/* 632 */     this.flgNoPagAmministrative = flgNoPagAmministrative;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getOrdine() {
/* 638 */     return this.ordine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrdine(Integer ordine) {
/* 644 */     this.ordine = ordine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagNuovoContrattoB() {
/* 650 */     return this.flagNuovoContrattoB;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagNuovoContrattoB(String flagNuovoContrattoB) {
/* 656 */     this.flagNuovoContrattoB = flagNuovoContrattoB;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinOrdine.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */