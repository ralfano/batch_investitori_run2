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
/*     */ public class FinPratica
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer praticaId;
/*     */   private String numeroPratica;
/*     */   private String fascia;
/*     */   private String tipoconto;
/*     */   private String motivoApertura;
/*     */   private String alimentazioneRapporto;
/*     */   private String dirittoInfoPrec;
/*     */   private String cap;
/*     */   private String provincia;
/*     */   private String comune;
/*     */   private String localita;
/*     */   private String nazione;
/*     */   private String profiloTrade;
/*     */   private String operazioniADistanzaFondi;
/*     */   private String regimeFiscalita;
/*     */   private String codiceConvenzione;
/*     */   private String codiceProdotto;
/*     */   private Set praticaBozza;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataInserimento;
/*     */   private String numeroCC;
/*     */   private FinPromotore promotore;
/*     */   private String causa;
/*     */   private String statoPratica;
/*     */   private Date dataApertura;
/*     */   private Set segnalazioni;
/*     */   private String flagAutorizzata;
/*     */   private String flagFax;
/*     */   private String flagContoCorrente;
/*     */   private String flagAnomalie;
/*     */   private String flagOriginale;
/*     */   private String flagLavorato;
/*     */   private String flagStatoAnagrafe;
/*     */   
/*     */   public String getFlagStatoAnagrafe() {
/*  94 */     return this.flagStatoAnagrafe;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagStatoAnagrafe(String flagStatoAnagrafe) {
/* 101 */     this.flagStatoAnagrafe = flagStatoAnagrafe;
/*     */   }
/*     */   
/*     */   public Set getSegnalazioni() {
/* 105 */     return this.segnalazioni;
/*     */   }
/*     */   
/*     */   public void setSegnalazioni(Set segnalazioni) {
/* 109 */     this.segnalazioni = segnalazioni;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagAutorizzata() {
/* 115 */     return this.flagAutorizzata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagAutorizzata(String flagAutorizzata) {
/* 122 */     this.flagAutorizzata = flagAutorizzata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagContoCorrente() {
/* 129 */     return this.flagContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagContoCorrente(String flagContoCorrente) {
/* 136 */     this.flagContoCorrente = flagContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagFax() {
/* 143 */     return this.flagFax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagFax(String flagFax) {
/* 150 */     this.flagFax = flagFax;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagAnomalie() {
/* 157 */     return this.flagAnomalie;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagAnomalie(String flagAnomalie) {
/* 165 */     this.flagAnomalie = flagAnomalie;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagLavorato() {
/* 172 */     return this.flagLavorato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagLavorato(String flagLavorato) {
/* 180 */     this.flagLavorato = flagLavorato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagOriginale() {
/* 187 */     return this.flagOriginale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagOriginale(String flagOriginale) {
/* 195 */     this.flagOriginale = flagOriginale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataApertura() {
/* 202 */     return this.dataApertura;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataApertura(Date dataApertura) {
/* 210 */     this.dataApertura = dataApertura;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroPratica() {
/* 217 */     return this.numeroPratica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPratica(String numeroPratica) {
/* 225 */     this.numeroPratica = numeroPratica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceConvenzione() {
/* 232 */     return this.codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceConvenzione(String codiceConvenzione) {
/* 240 */     this.codiceConvenzione = codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceProdotto() {
/* 247 */     return this.codiceProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceProdotto(String codiceProdotto) {
/* 255 */     this.codiceProdotto = codiceProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPromotore getPromotore() {
/* 262 */     return this.promotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPromotore(FinPromotore promotore) {
/* 270 */     this.promotore = promotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPratica() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPratica(String rapporto, String cap, String comune, String fascia, String localita, String apertura, String numerocc, String fondi, Set praticabozza, String trade, String provincia, String fiscalita, String tipoconto, FinPromotore promotore) {
/* 282 */     this.alimentazioneRapporto = rapporto;
/* 283 */     this.cap = cap;
/* 284 */     this.comune = comune;
/* 285 */     this.fascia = fascia;
/* 286 */     this.localita = localita;
/* 287 */     this.motivoApertura = apertura;
/* 288 */     this.numeroCC = numerocc;
/* 289 */     this.operazioniADistanzaFondi = fondi;
/* 290 */     this.praticaBozza = praticabozza;
/* 291 */     this.profiloTrade = trade;
/* 292 */     this.provincia = provincia;
/* 293 */     this.regimeFiscalita = fiscalita;
/* 294 */     this.tipoconto = tipoconto;
/* 295 */     this.promotore = promotore;
/*     */   }
/*     */   
/*     */   public Set getPraticaBozza() {
/* 299 */     return this.praticaBozza;
/*     */   }
/*     */   
/*     */   public void setPraticaBozza(Set praticabozza) {
/* 303 */     this.praticaBozza = praticabozza;
/*     */   }
/*     */   
/*     */   public String getAlimentazioneRapporto() {
/* 307 */     return this.alimentazioneRapporto;
/*     */   }
/*     */   
/*     */   public void setAlimentazioneRapporto(String alimentazioneRapporto) {
/* 311 */     this.alimentazioneRapporto = alimentazioneRapporto;
/*     */   }
/*     */   
/*     */   public String getCap() {
/* 315 */     return this.cap;
/*     */   }
/*     */   
/*     */   public void setCap(String cap) {
/* 319 */     this.cap = cap;
/*     */   }
/*     */   
/*     */   public String getComune() {
/* 323 */     return this.comune;
/*     */   }
/*     */   
/*     */   public void setComune(String comune) {
/* 327 */     this.comune = comune;
/*     */   }
/*     */   
/*     */   public String getNazione() {
/* 331 */     return this.nazione;
/*     */   }
/*     */   
/*     */   public void setNazione(String nazione) {
/* 335 */     this.nazione = nazione;
/*     */   }
/*     */   
/*     */   public String getFascia() {
/* 339 */     return this.fascia;
/*     */   }
/*     */   
/*     */   public void setFascia(String fascia) {
/* 343 */     this.fascia = fascia;
/*     */   }
/*     */   
/*     */   public String getLocalita() {
/* 347 */     return this.localita;
/*     */   }
/*     */   
/*     */   public void setLocalita(String localita) {
/* 351 */     this.localita = localita;
/*     */   }
/*     */   
/*     */   public String getMotivoApertura() {
/* 355 */     return this.motivoApertura;
/*     */   }
/*     */   
/*     */   public void setMotivoApertura(String motivoApertura) {
/* 359 */     this.motivoApertura = motivoApertura;
/*     */   }
/*     */   
/*     */   public String getOperazioniADistanzaFondi() {
/* 363 */     return this.operazioniADistanzaFondi;
/*     */   }
/*     */   
/*     */   public void setOperazioniADistanzaFondi(String operazioniADistanzaFondi) {
/* 367 */     this.operazioniADistanzaFondi = operazioniADistanzaFondi;
/*     */   }
/*     */   
/*     */   public Integer getPraticaId() {
/* 371 */     return this.praticaId;
/*     */   }
/*     */   
/*     */   public void setPraticaId(Integer praticaId) {
/* 375 */     this.praticaId = praticaId;
/*     */   }
/*     */   
/*     */   public String getProfiloTrade() {
/* 379 */     return this.profiloTrade;
/*     */   }
/*     */   
/*     */   public void setProfiloTrade(String profiloTrade) {
/* 383 */     this.profiloTrade = profiloTrade;
/*     */   }
/*     */   
/*     */   public String getProvincia() {
/* 387 */     return this.provincia;
/*     */   }
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 391 */     this.provincia = provincia;
/*     */   }
/*     */   
/*     */   public String getRegimeFiscalita() {
/* 395 */     return this.regimeFiscalita;
/*     */   }
/*     */   
/*     */   public void setRegimeFiscalita(String regimeFiscalita) {
/* 399 */     this.regimeFiscalita = regimeFiscalita;
/*     */   }
/*     */   
/*     */   public String getTipoconto() {
/* 403 */     return this.tipoconto;
/*     */   }
/*     */   
/*     */   public void setTipoconto(String tipoconto) {
/* 407 */     this.tipoconto = tipoconto;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 411 */     return (new ToStringBuilder(this)).append("praticaId", getPraticaId()).toString();
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 416 */     if (!(obj instanceof FinPratica)) {
/* 417 */       return false;
/*     */     }
/* 419 */     FinPratica pratica = (FinPratica)obj;
/* 420 */     if (pratica.getAlimentazioneRapporto().equals(getAlimentazioneRapporto()) && pratica.getCap().equals(getCap()) && pratica.getComune().equals(getComune()) && pratica.getFascia().equals(getFascia()) && pratica.getLocalita().equals(getLocalita()) && pratica.getMotivoApertura().equals(getMotivoApertura()) && pratica.getOperazioniADistanzaFondi().equals(getOperazioniADistanzaFondi()) && pratica.getProfiloTrade().equals(getProfiloTrade()) && pratica.getProvincia().equals(getProfiloTrade()) && pratica.getRegimeFiscalita().equals(getRegimeFiscalita()) && pratica.getTipoconto().equals(getTipoconto()))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 434 */       return true;
/*     */     }
/* 436 */     return false;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 440 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 444 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 448 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 452 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getNumeroCC() {
/* 456 */     return this.numeroCC;
/*     */   }
/*     */   
/*     */   public void setNumeroCC(String numeroCC) {
/* 460 */     this.numeroCC = numeroCC;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 464 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 468 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/* 472 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 477 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 481 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 485 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 489 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 493 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getCausa() {
/* 497 */     return this.causa;
/*     */   }
/*     */   
/*     */   public void setCausa(String causa) {
/* 501 */     this.causa = causa;
/*     */   }
/*     */   
/*     */   public String getStatoPratica() {
/* 505 */     return this.statoPratica;
/*     */   }
/*     */   
/*     */   public void setStatoPratica(String statoPratica) {
/* 509 */     this.statoPratica = statoPratica;
/*     */   }
/*     */   
/*     */   public String getDirittoInfoPrec() {
/* 513 */     return this.dirittoInfoPrec;
/*     */   }
/*     */   
/*     */   public void setDirittoInfoPrec(String dirittoInfoPrec) {
/* 517 */     this.dirittoInfoPrec = dirittoInfoPrec;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPratica.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */