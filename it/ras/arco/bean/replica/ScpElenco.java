/*     */ package it.ras.arco.bean.replica;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScpElenco
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Set elencoFlusso;
/*     */   private Set elencoTotali;
/*     */   private ScpSemaforo semaforo;
/*     */   private Integer elencoId;
/*     */   private Integer scpNumber;
/*     */   private Integer ndgArco;
/*     */   private String codiceIdentificativo;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String denominazione;
/*     */   private String intestatarioScp;
/*     */   private String sesso;
/*     */   private String codiceFiscale;
/*     */   private String partitaIva;
/*     */   private String cointestatari;
/*     */   private String cfCointestatari;
/*     */   private String indirizzoS;
/*     */   private String capS;
/*     */   private String comuneS;
/*     */   private String provT;
/*     */   private String codPromotore;
/*     */   private String desPromotore;
/*     */   private String codRete;
/*     */   private String codAgenzia;
/*     */   private String indirizzoAgenzia;
/*     */   private String capAgenzia;
/*     */   private String cittaAgenzia;
/*     */   private String provAgenzia;
/*     */   private String telPrefissoAgenzia;
/*     */   private String telNumero1Agenzia;
/*     */   private String telNumero2Agenzia;
/*     */   private String telNumero3Agenzia;
/*     */   private String flagAllegato;
/*     */   private String flagRaccomandata;
/*     */   private String flagPolizzaSingola;
/*     */   private String flagProdottoVisibile;
/*     */   private String statoElaborazione;
/*     */   private Date dataEstrazione;
/*     */   private Double totaleRiepilogo;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataUltimaModificaSlave;
/*     */   private String tipoUltimaModificaSlave;
/*     */   
/*     */   public String getCapAgenzia() {
/*  67 */     return this.capAgenzia;
/*     */   }
/*     */   public void setCapAgenzia(String capAgenzia) {
/*  70 */     this.capAgenzia = capAgenzia;
/*     */   }
/*     */   public String getCapS() {
/*  73 */     return this.capS;
/*     */   }
/*     */   public void setCapS(String capS) {
/*  76 */     this.capS = capS;
/*     */   }
/*     */   public String getCfCointestatari() {
/*  79 */     return this.cfCointestatari;
/*     */   }
/*     */   public void setCfCointestatari(String cfCointestatari) {
/*  82 */     this.cfCointestatari = cfCointestatari;
/*     */   }
/*     */   public String getCittaAgenzia() {
/*  85 */     return this.cittaAgenzia;
/*     */   }
/*     */   public void setCittaAgenzia(String cittaAgenzia) {
/*  88 */     this.cittaAgenzia = cittaAgenzia;
/*     */   }
/*     */   public String getCodAgenzia() {
/*  91 */     return this.codAgenzia;
/*     */   }
/*     */   public void setCodAgenzia(String codAgenzia) {
/*  94 */     this.codAgenzia = codAgenzia;
/*     */   }
/*     */   public String getCodiceFiscale() {
/*  97 */     return this.codiceFiscale;
/*     */   }
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 100 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   public String getCodiceIdentificativo() {
/* 103 */     return this.codiceIdentificativo;
/*     */   }
/*     */   public void setCodiceIdentificativo(String codiceIdentificativo) {
/* 106 */     this.codiceIdentificativo = codiceIdentificativo;
/*     */   }
/*     */   public String getCodPromotore() {
/* 109 */     return this.codPromotore;
/*     */   }
/*     */   public void setCodPromotore(String codPromotore) {
/* 112 */     this.codPromotore = codPromotore;
/*     */   }
/*     */   public String getCodRete() {
/* 115 */     return this.codRete;
/*     */   }
/*     */   public void setCodRete(String codRete) {
/* 118 */     this.codRete = codRete;
/*     */   }
/*     */   public String getCognome() {
/* 121 */     return this.cognome;
/*     */   }
/*     */   public void setCognome(String cognome) {
/* 124 */     this.cognome = cognome;
/*     */   }
/*     */   public String getCointestatari() {
/* 127 */     return this.cointestatari;
/*     */   }
/*     */   public void setCointestatari(String cointestatari) {
/* 130 */     this.cointestatari = cointestatari;
/*     */   }
/*     */   public String getComuneS() {
/* 133 */     return this.comuneS;
/*     */   }
/*     */   public void setComuneS(String comuneS) {
/* 136 */     this.comuneS = comuneS;
/*     */   }
/*     */   public Date getDataEstrazione() {
/* 139 */     return this.dataEstrazione;
/*     */   }
/*     */   public void setDataEstrazione(Date dataEstrazione) {
/* 142 */     this.dataEstrazione = dataEstrazione;
/*     */   }
/*     */   public Date getDataInserimento() {
/* 145 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 148 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/* 151 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 154 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public Date getDataUltimaModificaSlave() {
/* 157 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/* 160 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   public String getDenominazione() {
/* 163 */     return this.denominazione;
/*     */   }
/*     */   public void setDenominazione(String denominazione) {
/* 166 */     this.denominazione = denominazione;
/*     */   }
/*     */   public String getDesPromotore() {
/* 169 */     return this.desPromotore;
/*     */   }
/*     */   public void setDesPromotore(String desPromotore) {
/* 172 */     this.desPromotore = desPromotore;
/*     */   }
/*     */   public Set getElencoFlusso() {
/* 175 */     return this.elencoFlusso;
/*     */   }
/*     */   public void setElencoFlusso(Set elencoFlusso) {
/* 178 */     this.elencoFlusso = elencoFlusso;
/*     */   }
/*     */   public Integer getElencoId() {
/* 181 */     return this.elencoId;
/*     */   }
/*     */   public void setElencoId(Integer elencoId) {
/* 184 */     this.elencoId = elencoId;
/*     */   }
/*     */   public Set getElencoTotali() {
/* 187 */     return this.elencoTotali;
/*     */   }
/*     */   public void setElencoTotali(Set elencoTotali) {
/* 190 */     this.elencoTotali = elencoTotali;
/*     */   }
/*     */   public String getFlagAllegato() {
/* 193 */     return this.flagAllegato;
/*     */   }
/*     */   public void setFlagAllegato(String flagAllegato) {
/* 196 */     this.flagAllegato = flagAllegato;
/*     */   }
/*     */   public String getFlagEsistenza() {
/* 199 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 202 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public String getFlagPolizzaSingola() {
/* 205 */     return this.flagPolizzaSingola;
/*     */   }
/*     */   public void setFlagPolizzaSingola(String flagPolizzaSingola) {
/* 208 */     this.flagPolizzaSingola = flagPolizzaSingola;
/*     */   }
/*     */   public String getFlagProdottoVisibile() {
/* 211 */     return this.flagProdottoVisibile;
/*     */   }
/*     */   public void setFlagProdottoVisibile(String flagProdottoVisibile) {
/* 214 */     this.flagProdottoVisibile = flagProdottoVisibile;
/*     */   }
/*     */   public String getFlagRaccomandata() {
/* 217 */     return this.flagRaccomandata;
/*     */   }
/*     */   public void setFlagRaccomandata(String flagRaccomandata) {
/* 220 */     this.flagRaccomandata = flagRaccomandata;
/*     */   }
/*     */   public String getIndirizzoAgenzia() {
/* 223 */     return this.indirizzoAgenzia;
/*     */   }
/*     */   public void setIndirizzoAgenzia(String indirizzoAgenzia) {
/* 226 */     this.indirizzoAgenzia = indirizzoAgenzia;
/*     */   }
/*     */   public String getIndirizzoS() {
/* 229 */     return this.indirizzoS;
/*     */   }
/*     */   public void setIndirizzoS(String indirizzoS) {
/* 232 */     this.indirizzoS = indirizzoS;
/*     */   }
/*     */   public String getIntestatarioScp() {
/* 235 */     return this.intestatarioScp;
/*     */   }
/*     */   public void setIntestatarioScp(String intestatarioScp) {
/* 238 */     this.intestatarioScp = intestatarioScp;
/*     */   }
/*     */   public Integer getNdgArco() {
/* 241 */     return this.ndgArco;
/*     */   }
/*     */   public void setNdgArco(Integer ndgArco) {
/* 244 */     this.ndgArco = ndgArco;
/*     */   }
/*     */   public String getNome() {
/* 247 */     return this.nome;
/*     */   }
/*     */   public void setNome(String nome) {
/* 250 */     this.nome = nome;
/*     */   }
/*     */   public String getPartitaIva() {
/* 253 */     return this.partitaIva;
/*     */   }
/*     */   public void setPartitaIva(String partitaIva) {
/* 256 */     this.partitaIva = partitaIva;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/* 259 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 262 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public String getProceduraUltimaModificaSlave() {
/* 265 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 268 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   public String getProvAgenzia() {
/* 271 */     return this.provAgenzia;
/*     */   }
/*     */   public void setProvAgenzia(String provAgenzia) {
/* 274 */     this.provAgenzia = provAgenzia;
/*     */   }
/*     */   public String getProvT() {
/* 277 */     return this.provT;
/*     */   }
/*     */   public void setProvT(String provT) {
/* 280 */     this.provT = provT;
/*     */   }
/*     */   public Integer getScpNumber() {
/* 283 */     return this.scpNumber;
/*     */   }
/*     */   public void setScpNumber(Integer scpNumber) {
/* 286 */     this.scpNumber = scpNumber;
/*     */   }
/*     */   public String getSesso() {
/* 289 */     return this.sesso;
/*     */   }
/*     */   public void setSesso(String sesso) {
/* 292 */     this.sesso = sesso;
/*     */   }
/*     */   public String getStatoElaborazione() {
/* 295 */     return this.statoElaborazione;
/*     */   }
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 298 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   public String getTelNumero1Agenzia() {
/* 301 */     return this.telNumero1Agenzia;
/*     */   }
/*     */   public void setTelNumero1Agenzia(String telNumero1Agenzia) {
/* 304 */     this.telNumero1Agenzia = telNumero1Agenzia;
/*     */   }
/*     */   public String getTelNumero2Agenzia() {
/* 307 */     return this.telNumero2Agenzia;
/*     */   }
/*     */   public void setTelNumero2Agenzia(String telNumero2Agenzia) {
/* 310 */     this.telNumero2Agenzia = telNumero2Agenzia;
/*     */   }
/*     */   public String getTelNumero3Agenzia() {
/* 313 */     return this.telNumero3Agenzia;
/*     */   }
/*     */   public void setTelNumero3Agenzia(String telNumero3Agenzia) {
/* 316 */     this.telNumero3Agenzia = telNumero3Agenzia;
/*     */   }
/*     */   public String getTelPrefissoAgenzia() {
/* 319 */     return this.telPrefissoAgenzia;
/*     */   }
/*     */   public void setTelPrefissoAgenzia(String telPrefissoAgenzia) {
/* 322 */     this.telPrefissoAgenzia = telPrefissoAgenzia;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/* 325 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 328 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getTipoUltimaModificaSlave() {
/* 331 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 334 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   public Double getTotaleRiepilogo() {
/* 337 */     return this.totaleRiepilogo;
/*     */   }
/*     */   public void setTotaleRiepilogo(Double totaleRiepilogo) {
/* 340 */     this.totaleRiepilogo = totaleRiepilogo;
/*     */   }
/*     */   public String getUserUltimaModifica() {
/* 343 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 346 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModificaSlave() {
/* 349 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 352 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 355 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 358 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public ScpSemaforo getSemaforo() {
/* 361 */     return this.semaforo;
/*     */   }
/*     */   public void setSemaforo(ScpSemaforo elencoSemafori) {
/* 364 */     this.semaforo = elencoSemafori;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\replica\ScpElenco.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */