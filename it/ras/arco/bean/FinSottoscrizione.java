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
/*     */ public class FinSottoscrizione
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String MovimentoIniziativa = "MDI";
/*     */   public static final String TIPO_OPERAZIONE_PRIMA_SOTTOSCRIZIONE = "SOT";
/*     */   public static final String TIPO_OPERAZIONE_MODIFICA_CONTRATTO = "MCO";
/*     */   public static final String TIPO_OPERAZIONE_MODIFICA_INDIRIZZO_CORRISPONDENZA = "MCC";
/*     */   public static final String TIPO_OPERAZIONE_MODIFICA_PROMOTORE_FINANZIARIO = "MPF";
/*     */   public static final String TIPO_OPERAZIONE_MODIFICA_ANAGRAFICA = "MSO";
/*     */   public static final String TIPO_OPERAZIONE_MODIFICA_SQUADRA = "MSQ";
/*     */   public static final String TIPO_OPERAZIONE_GESTIONE_SERVIZI_AGGIUNTIVI = "SA";
/*  24 */   public static final String TIPO_TRASFERIMENTO_RAM_NORMALE = new String("1");
/*  25 */   public static final String TIPO_TRASFERIMENTO_RAM_TUNNEL_A_MULTIPARTNER = new String("2");
/*  26 */   public static final String TIPO_TRASFERIMENTO_RAM_FONDO_A_LIQUIDITA = new String("3");
/*  27 */   public static final String TIPO_TRASFERIMENTO_RAM_STESSO_FONDO = new String("4");
/*     */ 
/*     */   
/*     */   private Integer sottoscrizioneId;
/*     */ 
/*     */   
/*     */   private Date dataSottoscr;
/*     */ 
/*     */   
/*     */   private String tipoOperazione;
/*     */ 
/*     */   
/*     */   private Date dataInserimento;
/*     */ 
/*     */   
/*     */   private String utenteInserimento;
/*     */ 
/*     */   
/*     */   private String numSottoscrizione;
/*     */ 
/*     */   
/*     */   private Set ordine;
/*     */ 
/*     */   
/*     */   private Set dispPagamento;
/*     */ 
/*     */   
/*     */   private Set contratto;
/*     */ 
/*     */   
/*     */   private String stato;
/*     */ 
/*     */   
/*     */   private String codiceSconto;
/*     */ 
/*     */   
/*     */   private String codiceConvenzione;
/*     */ 
/*     */   
/*     */   private String flgNoPagAmministrative;
/*     */ 
/*     */   
/*     */   private Double percentualeSplit;
/*     */ 
/*     */   
/*     */   private Date dataRicezione;
/*     */ 
/*     */   
/*     */   private Date dataInserSottoscr;
/*     */ 
/*     */   
/*     */   private String nuovePosizioni;
/*     */ 
/*     */   
/*     */   private FinPromotore promotore;
/*     */ 
/*     */   
/*     */   private FinPromotore promotoreSplit;
/*     */ 
/*     */   
/*     */   private String tipoTrasferimento;
/*     */   
/*     */   private FinServizioAggiuntivo serviziAggiuntivi;
/*     */   
/*     */   private Set sottoscrServAgg;
/*     */   
/*     */   private FinSoggetto soggettoRichiedente;
/*     */   
/*     */   private FinIndirizzo indirizzo;
/*     */   
/*     */   private FinDistintaAssegni distintaAssegni;
/*     */   
/*     */   private Set emitSottoscrizioni;
/*     */   
/*     */   private FinContratto primoContratto;
/*     */   
/*     */   private Date dataLavorazione;
/*     */   
/*     */   private String flagSede;
/*     */   
/*     */   private Set estrazioni;
/*     */   
/*     */   private Integer numeroDisposizioneRam;
/*     */   
/*     */   private String note;
/*     */   
/*     */   private String flgNoCommissioni;
/*     */ 
/*     */   
/*     */   public String getNote() {
/* 117 */     return this.note;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNote(String note) {
/* 124 */     this.note = note;
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
/*     */   public FinSottoscrizione(Date dataSottoscr, String tipoOperazione, String numSottoscrizione, Date dataInserimento, String utenteInserimento, Set ordine, Set dispPagamento, Set contratto, Date dataInserSottoscr, Date dataRicezione, Double percentualeSplit, String codiceSconto, String stato, String nuovePosizioni, Date dataLavorazione, FinPromotore promotore, FinPromotore promotoreSplit, String tipoTrasferimento, FinIndirizzo indirizzo, Set sottoscrServAgg, Set emittente, String flagSede, Set estrazioni, Integer numeroDisposizioneRam) {
/* 144 */     this.dataSottoscr = dataSottoscr;
/* 145 */     this.tipoOperazione = tipoOperazione;
/* 146 */     this.dataInserimento = dataInserimento;
/* 147 */     this.utenteInserimento = utenteInserimento;
/* 148 */     this.numSottoscrizione = numSottoscrizione;
/* 149 */     this.ordine = ordine;
/* 150 */     this.dispPagamento = dispPagamento;
/* 151 */     this.contratto = contratto;
/* 152 */     this.dataInserSottoscr = dataInserSottoscr;
/* 153 */     this.dataRicezione = dataRicezione;
/* 154 */     this.percentualeSplit = percentualeSplit;
/* 155 */     this.codiceSconto = codiceSconto;
/* 156 */     this.stato = stato;
/* 157 */     this.nuovePosizioni = nuovePosizioni;
/* 158 */     this.promotore = promotore;
/* 159 */     this.promotoreSplit = promotoreSplit;
/* 160 */     this.tipoTrasferimento = tipoTrasferimento;
/* 161 */     this.sottoscrServAgg = sottoscrServAgg;
/* 162 */     this.indirizzo = indirizzo;
/* 163 */     this.emitSottoscrizioni = emittente;
/* 164 */     this.dataLavorazione = dataLavorazione;
/* 165 */     this.flagSede = flagSede;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinSottoscrizione() {}
/*     */ 
/*     */   
/*     */   public Integer getSottoscrizioneId() {
/* 173 */     return this.sottoscrizioneId;
/*     */   }
/*     */   
/*     */   public void setSottoscrizioneId(Integer sottoscrizioneId) {
/* 177 */     this.sottoscrizioneId = sottoscrizioneId;
/*     */   }
/*     */   
/*     */   public Date getDataSottoscr() {
/* 181 */     return this.dataSottoscr;
/*     */   }
/*     */   
/*     */   public void setDataSottoscr(Date dataSottoscr) {
/* 185 */     this.dataSottoscr = dataSottoscr;
/*     */   }
/*     */   
/*     */   public String getTipoOperazione() {
/* 189 */     return this.tipoOperazione;
/*     */   }
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 193 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 197 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 201 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 205 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 209 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getNumSottoscrizione() {
/* 213 */     return this.numSottoscrizione;
/*     */   }
/*     */   
/*     */   public void setNumSottoscrizione(String numSottoscrizione) {
/* 217 */     this.numSottoscrizione = numSottoscrizione;
/*     */   }
/*     */   
/*     */   public Set getOrdine() {
/* 221 */     return this.ordine;
/*     */   }
/*     */   
/*     */   public void setOrdine(Set ordine) {
/* 225 */     this.ordine = ordine;
/*     */   }
/*     */   
/*     */   public Set getDispPagamento() {
/* 229 */     return this.dispPagamento;
/*     */   }
/*     */   
/*     */   public void setDispPagamento(Set dispPagamento) {
/* 233 */     this.dispPagamento = dispPagamento;
/*     */   }
/*     */   
/*     */   public Set getContratto() {
/* 237 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(Set contratto) {
/* 241 */     this.contratto = contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSconto() {
/* 248 */     return this.codiceSconto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSconto(String codiceSconto) {
/* 255 */     this.codiceSconto = codiceSconto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserSottoscr() {
/* 262 */     return this.dataInserSottoscr;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserSottoscr(Date dataInserSottoscr) {
/* 269 */     this.dataInserSottoscr = dataInserSottoscr;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRicezione() {
/* 276 */     return this.dataRicezione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataRicezione(Date dataRicezione) {
/* 283 */     this.dataRicezione = dataRicezione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercentualeSplit() {
/* 290 */     return this.percentualeSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeSplit(Double percentualeSplit) {
/* 297 */     this.percentualeSplit = percentualeSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStato() {
/* 304 */     return this.stato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStato(String stato) {
/* 311 */     this.stato = stato;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 315 */     return (new ToStringBuilder(this)).append("sottoscrizioneId", getSottoscrizioneId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNuovePosizioni() {
/* 321 */     return this.nuovePosizioni;
/*     */   }
/*     */   
/*     */   public void setNuovePosizioni(String nuovePosizioni) {
/* 325 */     this.nuovePosizioni = nuovePosizioni;
/*     */   }
/*     */   
/*     */   public FinPromotore getPromotore() {
/* 329 */     return this.promotore;
/*     */   }
/*     */   
/*     */   public void setPromotore(FinPromotore promotore) {
/* 333 */     this.promotore = promotore;
/*     */   }
/*     */   
/*     */   public FinPromotore getPromotoreSplit() {
/* 337 */     return this.promotoreSplit;
/*     */   }
/*     */   
/*     */   public void setPromotoreSplit(FinPromotore promotoreSplit) {
/* 341 */     this.promotoreSplit = promotoreSplit;
/*     */   }
/*     */   
/*     */   public String getTipoTrasferimento() {
/* 345 */     return this.tipoTrasferimento;
/*     */   }
/*     */   
/*     */   public void setTipoTrasferimento(String tipoTrasferimento) {
/* 349 */     this.tipoTrasferimento = tipoTrasferimento;
/*     */   }
/*     */   
/*     */   public FinServizioAggiuntivo getServiziAggiuntivi() {
/* 353 */     return this.serviziAggiuntivi;
/*     */   }
/*     */   
/*     */   public void setServiziAggiuntivi(FinServizioAggiuntivo serviziAggiuntivi) {
/* 357 */     this.serviziAggiuntivi = serviziAggiuntivi;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggettoRichiedente() {
/* 361 */     return this.soggettoRichiedente;
/*     */   }
/*     */   
/*     */   public void setSoggettoRichiedente(FinSoggetto soggettoRichiedente) {
/* 365 */     this.soggettoRichiedente = soggettoRichiedente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinIndirizzo getIndirizzo() {
/* 372 */     return this.indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndirizzo(FinIndirizzo indirizzo) {
/* 378 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinDistintaAssegni getDistintaAssegni() {
/* 385 */     return this.distintaAssegni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDistintaAssegni(FinDistintaAssegni distintaAssegni) {
/* 391 */     this.distintaAssegni = distintaAssegni;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinContratto getPrimoContratto() {
/* 396 */     return this.primoContratto;
/*     */   }
/*     */   
/*     */   public void setPrimoContratto(FinContratto primoContratto) {
/* 400 */     this.primoContratto = primoContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataLavorazione() {
/* 406 */     return this.dataLavorazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataLavorazione(Date dataLavorazione) {
/* 413 */     this.dataLavorazione = dataLavorazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getEmitSottoscrizioni() {
/* 421 */     return this.emitSottoscrizioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmitSottoscrizioni(Set emitSottoscrizioni) {
/* 429 */     this.emitSottoscrizioni = emitSottoscrizioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagSede() {
/* 436 */     return this.flagSede;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagSede(String flagSede) {
/* 442 */     this.flagSede = flagSede;
/*     */   }
/*     */   
/*     */   public Set getEstrazioni() {
/* 446 */     return this.estrazioni;
/*     */   }
/*     */   
/*     */   public void setEstrazioni(Set estrazioni) {
/* 450 */     this.estrazioni = estrazioni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumeroDisposizioneRam() {
/* 456 */     return this.numeroDisposizioneRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroDisposizioneRam(Integer numeroDisposizioneRam) {
/* 462 */     this.numeroDisposizioneRam = numeroDisposizioneRam;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceConvenzione() {
/* 468 */     return this.codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceConvenzione(String codiceConvenzione) {
/* 474 */     this.codiceConvenzione = codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgNoPagAmministrative() {
/* 480 */     return this.flgNoPagAmministrative;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlgNoPagAmministrative(String flgNoPagAmministrative) {
/* 486 */     this.flgNoPagAmministrative = flgNoPagAmministrative;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgNoCommissioni() {
/* 492 */     return this.flgNoCommissioni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlgNoCommissioni(String flgNoCommissioni) {
/* 498 */     this.flgNoCommissioni = flgNoCommissioni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getSottoscrServAgg() {
/* 504 */     return this.sottoscrServAgg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrServAgg(Set sottoscrServAgg) {
/* 510 */     this.sottoscrServAgg = sottoscrServAgg;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSottoscrizione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */