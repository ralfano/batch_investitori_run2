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
/*     */ public class FinSoggettoBozza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String CONFERMATO = "CNF";
/*     */   private Integer soggBozzaId;
/*     */   private String tipoOperazione;
/*     */   private String statoSoggettoBozza;
/*     */   private String flagModuloUnico;
/*     */   private String flagSchedaCliente;
/*     */   private String flagPrivacy;
/*     */   private String flagProfiloRischio;
/*     */   private String flagVariazioneAnagrafica;
/*     */   private String flagAnomalie;
/*     */   private String variazioneModuloUnico;
/*     */   private String variazioneSchedaCliente;
/*     */   private String variazioneResidenza;
/*     */   private String variazioneRecapiti;
/*     */   private String variazioneDocumento;
/*     */   private String variazionePropRischio;
/*     */   private String nuovoCensimento;
/*     */   private String variazionePrivacy;
/*     */   private Set praticaBozza;
/*     */   private Set soggettoBozza;
/*     */   private FinSoggetto soggetto;
/*     */   private FinSoggetto soggettoOriginale;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataInserimento;
/*     */   private Set favoreDi;
/*     */   private int hashCode;
/*     */   
/*     */   public String getStatoSoggettoBozza() {
/*  78 */     return this.statoSoggettoBozza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoSoggettoBozza(String statoSoggettoBozza) {
/*  86 */     this.statoSoggettoBozza = statoSoggettoBozza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagAnomalie() {
/*  93 */     return this.flagAnomalie;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagAnomalie(String flagAnomalie) {
/* 101 */     this.flagAnomalie = flagAnomalie;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagModuloUnico() {
/* 108 */     return this.flagModuloUnico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagModuloUnico(String flagModuloUnico) {
/* 116 */     this.flagModuloUnico = flagModuloUnico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagPrivacy() {
/* 123 */     return this.flagPrivacy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagPrivacy(String flagPrivacy) {
/* 131 */     this.flagPrivacy = flagPrivacy;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagProfiloRischio() {
/* 138 */     return this.flagProfiloRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagProfiloRischio(String flagProfiloRischio) {
/* 146 */     this.flagProfiloRischio = flagProfiloRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagSchedaCliente() {
/* 153 */     return this.flagSchedaCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagSchedaCliente(String flagSchedaCliente) {
/* 161 */     this.flagSchedaCliente = flagSchedaCliente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagVariazioneAnagrafica() {
/* 168 */     return this.flagVariazioneAnagrafica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagVariazioneAnagrafica(String flagVariazioneAnagrafica) {
/* 176 */     this.flagVariazioneAnagrafica = flagVariazioneAnagrafica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSoggetto getSoggettoOriginale() {
/* 183 */     return this.soggettoOriginale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSoggettoOriginale(FinSoggetto soggettoOld) {
/* 191 */     this.soggettoOriginale = soggettoOld;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 195 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 199 */     this.dataInserimento = dataInserimento;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSoggettoBozza(String esistenza, Set praticabozza, String slave, FinPromotore promotore, Integer id, FinSoggetto soggetto, Set bozza, String operazione, String modifica, String slave2, String inserimento)
/*     */   {
/* 277 */     this.hashCode = Integer.MIN_VALUE; this.flagEsistenza = esistenza; this.praticaBozza = praticabozza; this.proceduraUltimaModificaSlave = slave; this.soggBozzaId = id; this.soggetto = soggetto; this.soggettoBozza = bozza; this.tipoOperazione = operazione; this.tipoUltimaModifica = modifica; this.userUltimaModificaSlave = slave2; this.utenteInserimento = inserimento; } public FinSoggettoBozza() { this.hashCode = Integer.MIN_VALUE; }
/*     */   public Set getSoggettoBozza() { return this.soggettoBozza; }
/*     */   public void setSoggettoBozza(Set soggettoBozza) { this.soggettoBozza = soggettoBozza; }
/* 280 */   public int getHashCode() { return this.hashCode; } public void setHashCode(int hashCode) { this.hashCode = hashCode; } public Integer getSoggBozzaId() { return this.soggBozzaId; }
/*     */   public Set getPraticaBozza() { return this.praticaBozza; }
/*     */   public void setPraticaBozza(Set praticabozza) { this.praticaBozza = praticabozza; }
/*     */   public String toString() { return (new ToStringBuilder(this)).append("indirizzoId", getSoggBozzaId()).toString(); }
/* 284 */   public boolean equals(Object obj) { if (!(obj instanceof FinSoggettoBozza)) return false;  FinSoggettoBozza soggBozza = (FinSoggettoBozza)obj; if (soggBozza.getTipoOperazione().equals(getTipoOperazione()) && soggBozza.getStatoSoggettoBozza().equals(getStatoSoggettoBozza()) && soggBozza.getFlagAnomalie().equals(getFlagAnomalie()) && soggBozza.getFlagModuloUnico().equals(getFlagModuloUnico()) && soggBozza.getFlagPrivacy().equals(getFlagPrivacy()) && soggBozza.getFlagProfiloRischio().equals(getFlagProfiloRischio()) && soggBozza.getFlagSchedaCliente().equals(getFlagSchedaCliente()) && soggBozza.getFlagVariazioneAnagrafica().equals(getFlagVariazioneAnagrafica())) return true;  return false; } public void setSoggBozzaId(Integer soggBozzaId) { this.soggBozzaId = soggBozzaId; }
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 288 */     return this.tipoOperazione;
/*     */   }
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 292 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 296 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 300 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 304 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 308 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 312 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 316 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/* 320 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 325 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 329 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 333 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 337 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 341 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public Set getFavoreDi() {
/* 345 */     return this.favoreDi;
/*     */   }
/*     */   
/*     */   public void setFavoreDi(Set afavoredi) {
/* 349 */     this.favoreDi = afavoredi;
/*     */   }
/*     */   
/*     */   public String getVariazioneDocumento() {
/* 353 */     return this.variazioneDocumento;
/*     */   }
/*     */   
/*     */   public void setVariazioneDocumento(String variazioneDocumento) {
/* 357 */     this.variazioneDocumento = variazioneDocumento;
/*     */   }
/*     */   
/*     */   public String getVariazioneModuloUnico() {
/* 361 */     return this.variazioneModuloUnico;
/*     */   }
/*     */   
/*     */   public void setVariazioneModuloUnico(String variazioneModuloUnico) {
/* 365 */     this.variazioneModuloUnico = variazioneModuloUnico;
/*     */   }
/*     */   
/*     */   public String getVariazionePropRischio() {
/* 369 */     return this.variazionePropRischio;
/*     */   }
/*     */   
/*     */   public void setVariazionePropRischio(String variazionePropRischio) {
/* 373 */     this.variazionePropRischio = variazionePropRischio;
/*     */   }
/*     */   
/*     */   public String getVariazioneRecapiti() {
/* 377 */     return this.variazioneRecapiti;
/*     */   }
/*     */   
/*     */   public void setVariazioneRecapiti(String variazioneRecapiti) {
/* 381 */     this.variazioneRecapiti = variazioneRecapiti;
/*     */   }
/*     */   
/*     */   public String getVariazioneResidenza() {
/* 385 */     return this.variazioneResidenza;
/*     */   }
/*     */   
/*     */   public void setVariazioneResidenza(String variazioneResidenza) {
/* 389 */     this.variazioneResidenza = variazioneResidenza;
/*     */   }
/*     */   
/*     */   public String getVariazioneSchedaCliente() {
/* 393 */     return this.variazioneSchedaCliente;
/*     */   }
/*     */   
/*     */   public void setVariazioneSchedaCliente(String variazioneSchedaCliente) {
/* 397 */     this.variazioneSchedaCliente = variazioneSchedaCliente;
/*     */   }
/*     */   
/*     */   public String getNuovoCensimento() {
/* 401 */     return this.nuovoCensimento;
/*     */   }
/*     */   
/*     */   public void setNuovoCensimento(String nuovoCensimento) {
/* 405 */     this.nuovoCensimento = nuovoCensimento;
/*     */   }
/*     */   
/*     */   public String getVariazionePrivacy() {
/* 409 */     return this.variazionePrivacy;
/*     */   }
/*     */   
/*     */   public void setVariazionePrivacy(String variazionePrivacy) {
/* 413 */     this.variazionePrivacy = variazionePrivacy;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggettoBozza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */