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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxRBVitaPortCli
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer compagniaSiag;
/*     */   private Integer polizzaSiag;
/*     */   private Integer ramoSiag;
/*     */   private Integer agenziaSiag;
/*     */   private Integer compagnia;
/*     */   private String codiceAgente;
/*     */   private String rete;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String codiceFiscale;
/*     */   private Date dataNascita;
/*     */   private String comuneNascita;
/*     */   private String provinciaNascita;
/*     */   private String capNascita;
/*     */   private String nazioneNascita;
/*     */   private String indirizzo;
/*     */   private String comune;
/*     */   private String provincia;
/*     */   private String cap;
/*     */   private String nazione;
/*     */   private String telefonoAbitazione;
/*     */   private String telefonoUfficio;
/*     */   private String telefonoCellulare;
/*     */   private String sesso;
/*     */   private String titoloOnorifico;
/*     */   private String professione;
/*     */   private Integer tipoDocumento;
/*     */   private String numeroDocumento;
/*     */   private Date dataRilascio;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descError;
/*     */   private Date dataElab;
/*     */   
/*     */   public FlxRBVitaPortCli(Integer compagniaSiag, Integer polizzaSiag, Integer ramoSiag, Integer agenziaSiag, Integer compagnia, String codiceAgente, String rete, String cognome, String nome, String codiceFiscale, Date dataNascita, String comuneNascita, String provinciaNascita, String capNascita, String nazioneNascita, String indirizzo, String comune, String provincia, String cap, String nazione, String telefonoAbitazione, String telefonoUfficio, String telefonoCellulare, String sesso, String titoloOnorifico, String professione, Integer tipoDocumento, String numeroDocumento, Date dataRilascio, String statoElab, String istanza, Date dataCaricamento) {
/* 119 */     this.compagniaSiag = compagniaSiag;
/* 120 */     this.polizzaSiag = polizzaSiag;
/* 121 */     this.ramoSiag = ramoSiag;
/* 122 */     this.agenziaSiag = agenziaSiag;
/* 123 */     this.compagnia = compagnia;
/* 124 */     this.codiceAgente = codiceAgente;
/* 125 */     this.rete = rete;
/* 126 */     this.cognome = cognome;
/* 127 */     this.nome = nome;
/* 128 */     this.codiceFiscale = codiceFiscale;
/* 129 */     this.dataNascita = dataNascita;
/* 130 */     this.comuneNascita = comuneNascita;
/* 131 */     this.provinciaNascita = provinciaNascita;
/* 132 */     this.capNascita = capNascita;
/* 133 */     this.nazioneNascita = nazioneNascita;
/* 134 */     this.indirizzo = indirizzo;
/* 135 */     this.comune = comune;
/* 136 */     this.provincia = provincia;
/* 137 */     this.cap = cap;
/* 138 */     this.nazione = nazione;
/* 139 */     this.telefonoAbitazione = telefonoAbitazione;
/* 140 */     this.telefonoUfficio = telefonoUfficio;
/* 141 */     this.telefonoCellulare = telefonoCellulare;
/* 142 */     this.sesso = sesso;
/* 143 */     this.titoloOnorifico = titoloOnorifico;
/* 144 */     this.professione = professione;
/* 145 */     this.tipoDocumento = tipoDocumento;
/* 146 */     this.numeroDocumento = numeroDocumento;
/* 147 */     this.dataRilascio = dataRilascio;
/* 148 */     this.statoElab = statoElab;
/* 149 */     this.istanza = istanza;
/* 150 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRBVitaPortCli() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 158 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 162 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Integer getCompagniaSiag() {
/* 166 */     return this.compagniaSiag;
/*     */   }
/*     */   
/*     */   public void setCompagniaSiag(Integer compagniaSiag) {
/* 170 */     this.compagniaSiag = compagniaSiag;
/*     */   }
/*     */   
/*     */   public Integer getPolizzaSiag() {
/* 174 */     return this.polizzaSiag;
/*     */   }
/*     */   
/*     */   public void setPolizzaSiag(Integer polizzaSiag) {
/* 178 */     this.polizzaSiag = polizzaSiag;
/*     */   }
/*     */   
/*     */   public Integer getRamoSiag() {
/* 182 */     return this.ramoSiag;
/*     */   }
/*     */   
/*     */   public void setRamoSiag(Integer ramoSiag) {
/* 186 */     this.ramoSiag = ramoSiag;
/*     */   }
/*     */   
/*     */   public Integer getAgenziaSiag() {
/* 190 */     return this.agenziaSiag;
/*     */   }
/*     */   
/*     */   public void setAgenziaSiag(Integer agenziaSiag) {
/* 194 */     this.agenziaSiag = agenziaSiag;
/*     */   }
/*     */   
/*     */   public Integer getCompagnia() {
/* 198 */     return this.compagnia;
/*     */   }
/*     */   
/*     */   public void setCompagnia(Integer compagnia) {
/* 202 */     this.compagnia = compagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 206 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 210 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getRete() {
/* 214 */     return this.rete;
/*     */   }
/*     */   
/*     */   public void setRete(String rete) {
/* 218 */     this.rete = rete;
/*     */   }
/*     */   
/*     */   public String getCognome() {
/* 222 */     return this.cognome;
/*     */   }
/*     */   
/*     */   public void setCognome(String cognome) {
/* 226 */     this.cognome = cognome;
/*     */   }
/*     */   
/*     */   public String getNome() {
/* 230 */     return this.nome;
/*     */   }
/*     */   
/*     */   public void setNome(String nome) {
/* 234 */     this.nome = nome;
/*     */   }
/*     */   
/*     */   public String getCodiceFiscale() {
/* 238 */     return this.codiceFiscale;
/*     */   }
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 242 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   
/*     */   public Date getDataNascita() {
/* 246 */     return this.dataNascita;
/*     */   }
/*     */   
/*     */   public void setDataNascita(Date dataNascita) {
/* 250 */     this.dataNascita = dataNascita;
/*     */   }
/*     */   
/*     */   public String getComuneNascita() {
/* 254 */     return this.comuneNascita;
/*     */   }
/*     */   
/*     */   public void setComuneNascita(String comuneNascita) {
/* 258 */     this.comuneNascita = comuneNascita;
/*     */   }
/*     */   
/*     */   public String getProvinciaNascita() {
/* 262 */     return this.provinciaNascita;
/*     */   }
/*     */   
/*     */   public void setProvinciaNascita(String provinciaNascita) {
/* 266 */     this.provinciaNascita = provinciaNascita;
/*     */   }
/*     */   
/*     */   public String getCapNascita() {
/* 270 */     return this.capNascita;
/*     */   }
/*     */   
/*     */   public void setCapNascita(String capNascita) {
/* 274 */     this.capNascita = capNascita;
/*     */   }
/*     */   
/*     */   public String getNazioneNascita() {
/* 278 */     return this.nazioneNascita;
/*     */   }
/*     */   
/*     */   public void setNazioneNascita(String nazioneNascita) {
/* 282 */     this.nazioneNascita = nazioneNascita;
/*     */   }
/*     */   
/*     */   public String getIndirizzo() {
/* 286 */     return this.indirizzo;
/*     */   }
/*     */   
/*     */   public void setIndirizzo(String indirizzo) {
/* 290 */     this.indirizzo = indirizzo;
/*     */   }
/*     */   
/*     */   public String getComune() {
/* 294 */     return this.comune;
/*     */   }
/*     */   
/*     */   public void setComune(String comune) {
/* 298 */     this.comune = comune;
/*     */   }
/*     */   
/*     */   public String getProvincia() {
/* 302 */     return this.provincia;
/*     */   }
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 306 */     this.provincia = provincia;
/*     */   }
/*     */   
/*     */   public String getCap() {
/* 310 */     return this.cap;
/*     */   }
/*     */   
/*     */   public void setCap(String cap) {
/* 314 */     this.cap = cap;
/*     */   }
/*     */   
/*     */   public String getNazione() {
/* 318 */     return this.nazione;
/*     */   }
/*     */   
/*     */   public void setNazione(String nazione) {
/* 322 */     this.nazione = nazione;
/*     */   }
/*     */   
/*     */   public String getTelefonoAbitazione() {
/* 326 */     return this.telefonoAbitazione;
/*     */   }
/*     */   
/*     */   public void setTelefonoAbitazione(String telefonoAbitazione) {
/* 330 */     this.telefonoAbitazione = telefonoAbitazione;
/*     */   }
/*     */   
/*     */   public String getTelefonoUfficio() {
/* 334 */     return this.telefonoUfficio;
/*     */   }
/*     */   
/*     */   public void setTelefonoUfficio(String telefonoUfficio) {
/* 338 */     this.telefonoUfficio = telefonoUfficio;
/*     */   }
/*     */   
/*     */   public String getTelefonoCellulare() {
/* 342 */     return this.telefonoCellulare;
/*     */   }
/*     */   
/*     */   public void setTelefonoCellulare(String telefonoCellulare) {
/* 346 */     this.telefonoCellulare = telefonoCellulare;
/*     */   }
/*     */   
/*     */   public String getSesso() {
/* 350 */     return this.sesso;
/*     */   }
/*     */   
/*     */   public void setSesso(String sesso) {
/* 354 */     this.sesso = sesso;
/*     */   }
/*     */   
/*     */   public String getTitoloOnorifico() {
/* 358 */     return this.titoloOnorifico;
/*     */   }
/*     */   
/*     */   public void setTitoloOnorifico(String titoloOnorifico) {
/* 362 */     this.titoloOnorifico = titoloOnorifico;
/*     */   }
/*     */   
/*     */   public String getProfessione() {
/* 366 */     return this.professione;
/*     */   }
/*     */   
/*     */   public void setProfessione(String professione) {
/* 370 */     this.professione = professione;
/*     */   }
/*     */   
/*     */   public Integer getTipoDocumento() {
/* 374 */     return this.tipoDocumento;
/*     */   }
/*     */   
/*     */   public void setTipoDocumento(Integer tipoDocumento) {
/* 378 */     this.tipoDocumento = tipoDocumento;
/*     */   }
/*     */   
/*     */   public String getNumeroDocumento() {
/* 382 */     return this.numeroDocumento;
/*     */   }
/*     */   
/*     */   public void setNumeroDocumento(String numeroDocumento) {
/* 386 */     this.numeroDocumento = numeroDocumento;
/*     */   }
/*     */   
/*     */   public Date getDataRilascio() {
/* 390 */     return this.dataRilascio;
/*     */   }
/*     */   
/*     */   public void setDataRilascio(Date dataRilascio) {
/* 394 */     this.dataRilascio = dataRilascio;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 398 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 402 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 406 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 410 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 414 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 418 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 422 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/* 428 */     return this.dataElab;
/*     */   }
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 432 */     this.dataElab = dataElab;
/*     */   }
/*     */   
/*     */   public String getDescError() {
/* 436 */     return this.descError;
/*     */   }
/*     */   
/*     */   public void setDescError(String descError) {
/* 440 */     this.descError = descError;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRBVitaPortCli.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */