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
/*     */ public class FinCointestazione
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String TIPO_COINTESTAZIONE = "C";
/*     */   public static final String TIPO_MONO_INTESTATARIO = "M";
/*     */   public static final String TIPO_SQUADRA = "S";
/*     */   public static final String STATO_EFFETTIVO = "E";
/*     */   private Integer cointestazioneId;
/*     */   private Integer ordine;
/*     */   private String tipo;
/*     */   private String cointSign;
/*     */   private String stato;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String codiceSconto;
/*     */   private String codiceConvenzione;
/*     */   private String flgNoPagAmministrative;
/*     */   private Set decodNdgFabbr;
/*     */   private Set contratto;
/*     */   private Set cointestazioni;
/*     */   private FinCointestazione squadra;
/*     */   private FinSoggetto soggetto;
/*     */   private String invioPant;
/*     */   private Set estrazioni;
/*     */   private String squadraPrincipale;
/*     */   
/*     */   public Set getEstrazioni() {
/*  90 */     return this.estrazioni;
/*     */   }
/*     */   
/*     */   public void setEstrazioni(Set estrazioni) {
/*  94 */     this.estrazioni = estrazioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinCointestazione(String codiceSconto, Integer ordine, String tipo, String stato, Date dataInizio, Date dataFine, Date dataInserimento, String utenteInserimento, Set decodNdgFabbr, Set cointestazioni, FinSoggetto soggetto, FinCointestazione squadra, String cointSign, String invioPant) {
/* 101 */     this.codiceSconto = codiceSconto;
/* 102 */     this.ordine = ordine;
/* 103 */     this.tipo = tipo;
/* 104 */     this.stato = stato;
/*     */     
/* 106 */     this.dataInizio = dataInizio;
/* 107 */     this.dataFine = dataFine;
/* 108 */     this.dataInserimento = dataInserimento;
/* 109 */     this.utenteInserimento = utenteInserimento;
/* 110 */     this.decodNdgFabbr = decodNdgFabbr;
/* 111 */     this.soggetto = soggetto;
/*     */ 
/*     */     
/* 114 */     this.cointSign = cointSign;
/* 115 */     this.cointestazioni = cointestazioni;
/* 116 */     this.squadra = squadra;
/* 117 */     this.invioPant = invioPant;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinCointestazione() {}
/*     */ 
/*     */   
/*     */   public FinCointestazione(Set decodNdgFabbr) {
/* 126 */     this.decodNdgFabbr = decodNdgFabbr;
/*     */   }
/*     */   
/*     */   public Integer getCointestazioneId() {
/* 130 */     return this.cointestazioneId;
/*     */   }
/*     */   
/*     */   public void setCointestazioneId(Integer cointestazioneId) {
/* 134 */     this.cointestazioneId = cointestazioneId;
/*     */   }
/*     */   
/*     */   public Integer getOrdine() {
/* 138 */     return this.ordine;
/*     */   }
/*     */   
/*     */   public void setOrdine(Integer ordine) {
/* 142 */     this.ordine = ordine;
/*     */   }
/*     */   
/*     */   public String getTipo() {
/* 146 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(String tipo) {
/* 150 */     this.tipo = tipo;
/*     */   }
/*     */   
/*     */   public String getStato() {
/* 154 */     return this.stato;
/*     */   }
/*     */   
/*     */   public void setStato(String stato) {
/* 158 */     this.stato = stato;
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
/*     */   public Date getDataInizio() {
/* 170 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 174 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/* 178 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 182 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 186 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 190 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 194 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 198 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public Set getDecodNdgFabbr() {
/* 202 */     return this.decodNdgFabbr;
/*     */   }
/*     */   
/*     */   public void setDecodNdgFabbr(Set decodNdgFabbr) {
/* 206 */     this.decodNdgFabbr = decodNdgFabbr;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 210 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 214 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 225 */     return (new ToStringBuilder(this)).append("cointestazioneId", getCointestazioneId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCointSign() {
/* 234 */     return this.cointSign;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCointSign(String cointSign) {
/* 240 */     this.cointSign = cointSign;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getContratto() {
/* 247 */     return this.contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContratto(Set contratto) {
/* 253 */     this.contratto = contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getCointestazioni() {
/* 259 */     return this.cointestazioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCointestazioni(Set cointestazioni) {
/* 266 */     this.cointestazioni = cointestazioni;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinCointestazione getSquadra() {
/* 271 */     return this.squadra;
/*     */   }
/*     */   
/*     */   public void setSquadra(FinCointestazione squadra) {
/* 275 */     this.squadra = squadra;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSconto() {
/* 281 */     return this.codiceSconto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSconto(String codiceSconto) {
/* 287 */     this.codiceSconto = codiceSconto;
/*     */   }
/*     */   
/*     */   public String getInvioPant() {
/* 291 */     return this.invioPant;
/*     */   }
/*     */   
/*     */   public void setInvioPant(String invioPant) {
/* 295 */     this.invioPant = invioPant;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceConvenzione() {
/* 301 */     return this.codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceConvenzione(String codiceConvenzione) {
/* 307 */     this.codiceConvenzione = codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgNoPagAmministrative() {
/* 313 */     return this.flgNoPagAmministrative;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlgNoPagAmministrative(String flgNoPagAmministrative) {
/* 319 */     this.flgNoPagAmministrative = flgNoPagAmministrative;
/*     */   }
/*     */   
/*     */   public String getSquadraPrincipale() {
/* 323 */     return this.squadraPrincipale;
/*     */   }
/*     */   
/*     */   public void setSquadraPrincipale(String squadraPrincipale) {
/* 327 */     this.squadraPrincipale = squadraPrincipale;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCointestazione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */