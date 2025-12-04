/*     */ package it.ras.arco.bean.replica;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScpFlusso
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private ScpElenco elenco;
/*     */   private Integer flussoId;
/*     */   private Integer posizioneId;
/*     */   private Integer dettaglioId;
/*     */   private Integer scpNumber;
/*     */   private Integer squadraId;
/*     */   private Integer ndgArcoN;
/*     */   private String codiceIdentificativoS;
/*     */   private Integer contrattoId;
/*     */   private Integer soggettoId;
/*     */   private Integer cointestazioneId;
/*     */   private String numContrattoS;
/*     */   private Date dataAperturaD;
/*     */   private String statoContrattoT;
/*     */   private Integer ordineProdottoN;
/*     */   private String tipoProdottoT;
/*     */   private String areaProdottoT;
/*     */   private String sottoAreaProdottoT;
/*     */   private String areaTerzoLiv;
/*     */   private Date dataFineComm;
/*     */   private String abiCc;
/*     */   private String cabCc;
/*     */   private String numeroContoCcS;
/*     */   private Double valoreValutaCc;
/*     */   private Double valoreEuroCc;
/*     */   private String divisa;
/*     */   private String isinS;
/*     */   private String divisaQuotT;
/*     */   private String codMarket;
/*     */   private Double numQuote;
/*     */   private Double valQuota;
/*     */   private Double valEuro;
/*     */   private String valoreNominale;
/*     */   private Integer valoreEuroGp;
/*     */   private String flgQuotato;
/*     */   private Date dataScadenzaPolizza;
/*     */   private Double sommaPremiPolizzaC;
/*     */   private String classeProdottoT;
/*     */   private String descProdottoS;
/*     */   private String tipologiaProdottoT;
/*     */   private Date dataUltimaRataPagata;
/*     */   private Double ultimaRataPagataC;
/*     */   private Double cambioUltimaRataC;
/*     */   private Date dataRiferimentoValuta;
/*     */   private Double renditaMaturataCa;
/*     */   private Double capitaleMaturatoCa;
/*     */   private String frazionamentoT;
/*     */   private String flgDas;
/*     */   private String flgRenditaCapitale;
/*     */   private String flgPolizzaSingolaS;
/*     */   private String statoElabB;
/*     */   private Date dataEstrazione;
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
/*     */   private String ccEstero;
/*     */   private String sottocodiceRapporto;
/*     */   private String nomeAssicurato;
/*     */   private Double capitaleDifferito;
/*     */   private String dataFineCommV;
/*     */   private String dataRiferimentoValutaV;
/*     */   
/*     */   public String getAbiCc() {
/*  91 */     return this.abiCc;
/*     */   }
/*     */   public void setAbiCc(String abiCc) {
/*  94 */     this.abiCc = abiCc;
/*     */   }
/*     */   public String getAreaProdottoT() {
/*  97 */     return this.areaProdottoT;
/*     */   }
/*     */   public void setAreaProdottoT(String areaProdottoT) {
/* 100 */     this.areaProdottoT = areaProdottoT;
/*     */   }
/*     */   public String getAreaTerzoLiv() {
/* 103 */     return this.areaTerzoLiv;
/*     */   }
/*     */   public void setAreaTerzoLiv(String areaTerzoLiv) {
/* 106 */     this.areaTerzoLiv = areaTerzoLiv;
/*     */   }
/*     */   public String getCabCc() {
/* 109 */     return this.cabCc;
/*     */   }
/*     */   public void setCabCc(String cabCc) {
/* 112 */     this.cabCc = cabCc;
/*     */   }
/*     */   public Double getCambioUltimaRataC() {
/* 115 */     return this.cambioUltimaRataC;
/*     */   }
/*     */   public void setCambioUltimaRataC(Double cambioUltimaRataC) {
/* 118 */     this.cambioUltimaRataC = cambioUltimaRataC;
/*     */   }
/*     */   public Double getCapitaleMaturatoCa() {
/* 121 */     return this.capitaleMaturatoCa;
/*     */   }
/*     */   public void setCapitaleMaturatoCa(Double capitaleMaturatoCa) {
/* 124 */     this.capitaleMaturatoCa = capitaleMaturatoCa;
/*     */   }
/*     */   public String getClasseProdottoT() {
/* 127 */     return this.classeProdottoT;
/*     */   }
/*     */   public void setClasseProdottoT(String classeProdottoT) {
/* 130 */     this.classeProdottoT = classeProdottoT;
/*     */   }
/*     */   public String getCodiceIdentificativoS() {
/* 133 */     return this.codiceIdentificativoS;
/*     */   }
/*     */   public void setCodiceIdentificativoS(String codiceIdentificativoS) {
/* 136 */     this.codiceIdentificativoS = codiceIdentificativoS;
/*     */   }
/*     */   public String getCodMarket() {
/* 139 */     return this.codMarket;
/*     */   }
/*     */   public void setCodMarket(String codMarket) {
/* 142 */     this.codMarket = codMarket;
/*     */   }
/*     */   public Integer getCointestazioneId() {
/* 145 */     return this.cointestazioneId;
/*     */   }
/*     */   public void setCointestazioneId(Integer cointestazioneId) {
/* 148 */     this.cointestazioneId = cointestazioneId;
/*     */   }
/*     */   public Integer getContrattoId() {
/* 151 */     return this.contrattoId;
/*     */   }
/*     */   public void setContrattoId(Integer contrattoId) {
/* 154 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   public Date getDataAperturaD() {
/* 157 */     return this.dataAperturaD;
/*     */   }
/*     */   public void setDataAperturaD(Date dataAperturaD) {
/* 160 */     this.dataAperturaD = dataAperturaD;
/*     */   }
/*     */   public Date getDataEstrazione() {
/* 163 */     return this.dataEstrazione;
/*     */   }
/*     */   public void setDataEstrazione(Date dataEstrazione) {
/* 166 */     this.dataEstrazione = dataEstrazione;
/*     */   }
/*     */   public Date getDataFineComm() {
/* 169 */     return this.dataFineComm;
/*     */   }
/*     */   public void setDataFineComm(Date dataFineComm) {
/* 172 */     this.dataFineComm = dataFineComm;
/*     */   }
/*     */   public Date getDataInserimento() {
/* 175 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 178 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataRiferimentoValuta() {
/* 181 */     return this.dataRiferimentoValuta;
/*     */   }
/*     */   public void setDataRiferimentoValuta(Date dataRiferimentoValuta) {
/* 184 */     this.dataRiferimentoValuta = dataRiferimentoValuta;
/*     */   }
/*     */   public Date getDataScadenzaPolizza() {
/* 187 */     return this.dataScadenzaPolizza;
/*     */   }
/*     */   public void setDataScadenzaPolizza(Date dataScadenzaPolizza) {
/* 190 */     this.dataScadenzaPolizza = dataScadenzaPolizza;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/* 193 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 196 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public Date getDataUltimaModificaSlave() {
/* 199 */     return this.dataUltimaModificaSlave;
/*     */   }
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/* 202 */     this.dataUltimaModificaSlave = dataUltimaModificaSlave;
/*     */   }
/*     */   public Date getDataUltimaRataPagata() {
/* 205 */     return this.dataUltimaRataPagata;
/*     */   }
/*     */   public void setDataUltimaRataPagata(Date dataUltimaRataPagata) {
/* 208 */     this.dataUltimaRataPagata = dataUltimaRataPagata;
/*     */   }
/*     */   public String getDescProdottoS() {
/* 211 */     return this.descProdottoS;
/*     */   }
/*     */   public void setDescProdottoS(String descProdottoS) {
/* 214 */     this.descProdottoS = descProdottoS;
/*     */   }
/*     */   public Integer getDettaglioId() {
/* 217 */     return this.dettaglioId;
/*     */   }
/*     */   public void setDettaglioId(Integer dettaglioId) {
/* 220 */     this.dettaglioId = dettaglioId;
/*     */   }
/*     */   public String getDivisa() {
/* 223 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(String divisa) {
/* 226 */     this.divisa = divisa;
/*     */   }
/*     */   public String getDivisaQuotT() {
/* 229 */     return this.divisaQuotT;
/*     */   }
/*     */   public void setDivisaQuotT(String divisaQuotT) {
/* 232 */     this.divisaQuotT = divisaQuotT;
/*     */   }
/*     */   public ScpElenco getElenco() {
/* 235 */     return this.elenco;
/*     */   }
/*     */   public void setElenco(ScpElenco elenco) {
/* 238 */     this.elenco = elenco;
/*     */   }
/*     */   public String getFlagEsistenza() {
/* 241 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 244 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public String getFlgDas() {
/* 247 */     return this.flgDas;
/*     */   }
/*     */   public void setFlgDas(String flgDas) {
/* 250 */     this.flgDas = flgDas;
/*     */   }
/*     */   public String getFlgPolizzaSingolaS() {
/* 253 */     return this.flgPolizzaSingolaS;
/*     */   }
/*     */   public void setFlgPolizzaSingolaS(String flgPolizzaSingolaS) {
/* 256 */     this.flgPolizzaSingolaS = flgPolizzaSingolaS;
/*     */   }
/*     */   public String getFlgQuotato() {
/* 259 */     return this.flgQuotato;
/*     */   }
/*     */   public void setFlgQuotato(String flgQuotato) {
/* 262 */     this.flgQuotato = flgQuotato;
/*     */   }
/*     */   public String getFlgRenditaCapitale() {
/* 265 */     return this.flgRenditaCapitale;
/*     */   }
/*     */   public void setFlgRenditaCapitale(String flgRenditaCapitale) {
/* 268 */     this.flgRenditaCapitale = flgRenditaCapitale;
/*     */   }
/*     */   public Integer getFlussoId() {
/* 271 */     return this.flussoId;
/*     */   }
/*     */   public void setFlussoId(Integer flussoId) {
/* 274 */     this.flussoId = flussoId;
/*     */   }
/*     */   public String getFrazionamentoT() {
/* 277 */     return this.frazionamentoT;
/*     */   }
/*     */   public void setFrazionamentoT(String frazionamentoT) {
/* 280 */     this.frazionamentoT = frazionamentoT;
/*     */   }
/*     */   public String getIsinS() {
/* 283 */     return this.isinS;
/*     */   }
/*     */   public void setIsinS(String isinS) {
/* 286 */     this.isinS = isinS;
/*     */   }
/*     */   public Integer getNdgArcoN() {
/* 289 */     return this.ndgArcoN;
/*     */   }
/*     */   public void setNdgArcoN(Integer ndgArcoN) {
/* 292 */     this.ndgArcoN = ndgArcoN;
/*     */   }
/*     */   public String getNumContrattoS() {
/* 295 */     return this.numContrattoS;
/*     */   }
/*     */   public void setNumContrattoS(String numContrattoS) {
/* 298 */     this.numContrattoS = numContrattoS;
/*     */   }
/*     */   public String getNumeroContoCcS() {
/* 301 */     return this.numeroContoCcS;
/*     */   }
/*     */   public void setNumeroContoCcS(String numeroContoCcS) {
/* 304 */     this.numeroContoCcS = numeroContoCcS;
/*     */   }
/*     */   public Double getNumQuote() {
/* 307 */     return this.numQuote;
/*     */   }
/*     */   public void setNumQuote(Double numQuote) {
/* 310 */     this.numQuote = numQuote;
/*     */   }
/*     */   public Integer getOrdineProdottoN() {
/* 313 */     return this.ordineProdottoN;
/*     */   }
/*     */   public void setOrdineProdottoN(Integer ordineProdottoN) {
/* 316 */     this.ordineProdottoN = ordineProdottoN;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/* 319 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 322 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public String getProceduraUltimaModificaSlave() {
/* 325 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 328 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   public Double getRenditaMaturataCa() {
/* 331 */     return this.renditaMaturataCa;
/*     */   }
/*     */   public void setRenditaMaturataCa(Double renditaMaturataCa) {
/* 334 */     this.renditaMaturataCa = renditaMaturataCa;
/*     */   }
/*     */   public Integer getSoggettoId() {
/* 337 */     return this.soggettoId;
/*     */   }
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 340 */     this.soggettoId = soggettoId;
/*     */   }
/*     */   public Double getSommaPremiPolizzaC() {
/* 343 */     return this.sommaPremiPolizzaC;
/*     */   }
/*     */   public void setSommaPremiPolizzaC(Double sommaPremiPolizzaC) {
/* 346 */     this.sommaPremiPolizzaC = sommaPremiPolizzaC;
/*     */   }
/*     */   public String getSottoAreaProdottoT() {
/* 349 */     return this.sottoAreaProdottoT;
/*     */   }
/*     */   public void setSottoAreaProdottoT(String sottoAreaProdottoT) {
/* 352 */     this.sottoAreaProdottoT = sottoAreaProdottoT;
/*     */   }
/*     */   public Integer getSquadraId() {
/* 355 */     return this.squadraId;
/*     */   }
/*     */   public void setSquadraId(Integer squadraId) {
/* 358 */     this.squadraId = squadraId;
/*     */   }
/*     */   public String getStatoContrattoT() {
/* 361 */     return this.statoContrattoT;
/*     */   }
/*     */   public void setStatoContrattoT(String statoContrattoT) {
/* 364 */     this.statoContrattoT = statoContrattoT;
/*     */   }
/*     */   public String getStatoElabB() {
/* 367 */     return this.statoElabB;
/*     */   }
/*     */   public void setStatoElabB(String statoElabB) {
/* 370 */     this.statoElabB = statoElabB;
/*     */   }
/*     */   public String getTipologiaProdottoT() {
/* 373 */     return this.tipologiaProdottoT;
/*     */   }
/*     */   public void setTipologiaProdottoT(String tipologiaProdottoT) {
/* 376 */     this.tipologiaProdottoT = tipologiaProdottoT;
/*     */   }
/*     */   public String getTipoProdottoT() {
/* 379 */     return this.tipoProdottoT;
/*     */   }
/*     */   public void setTipoProdottoT(String tipoProdottoT) {
/* 382 */     this.tipoProdottoT = tipoProdottoT;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/* 385 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 388 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getTipoUltimaModificaSlave() {
/* 391 */     return this.tipoUltimaModificaSlave;
/*     */   }
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 394 */     this.tipoUltimaModificaSlave = tipoUltimaModificaSlave;
/*     */   }
/*     */   public Double getUltimaRataPagataC() {
/* 397 */     return this.ultimaRataPagataC;
/*     */   }
/*     */   public void setUltimaRataPagataC(Double ultimaRataPagataC) {
/* 400 */     this.ultimaRataPagataC = ultimaRataPagataC;
/*     */   }
/*     */   public String getUserUltimaModifica() {
/* 403 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 406 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModificaSlave() {
/* 409 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 412 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 415 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 418 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public Double getValEuro() {
/* 421 */     return this.valEuro;
/*     */   }
/*     */   public void setValEuro(Double valEuro) {
/* 424 */     this.valEuro = valEuro;
/*     */   }
/*     */   public Double getValoreEuroCc() {
/* 427 */     return this.valoreEuroCc;
/*     */   }
/*     */   public void setValoreEuroCc(Double valoreEuroCc) {
/* 430 */     this.valoreEuroCc = valoreEuroCc;
/*     */   }
/*     */   public Integer getValoreEuroGp() {
/* 433 */     return this.valoreEuroGp;
/*     */   }
/*     */   public void setValoreEuroGp(Integer valoreEuroGp) {
/* 436 */     this.valoreEuroGp = valoreEuroGp;
/*     */   }
/*     */   public String getValoreNominale() {
/* 439 */     return this.valoreNominale;
/*     */   }
/*     */   public void setValoreNominale(String valoreNominale) {
/* 442 */     this.valoreNominale = valoreNominale;
/*     */   }
/*     */   public Double getValoreValutaCc() {
/* 445 */     return this.valoreValutaCc;
/*     */   }
/*     */   public void setValoreValutaCc(Double valoreValutaCc) {
/* 448 */     this.valoreValutaCc = valoreValutaCc;
/*     */   }
/*     */   public Double getValQuota() {
/* 451 */     return this.valQuota;
/*     */   }
/*     */   public void setValQuota(Double valQuota) {
/* 454 */     this.valQuota = valQuota;
/*     */   }
/*     */   public String getDataFineCommV() {
/* 457 */     return this.dataFineCommV;
/*     */   }
/*     */   public void setDataFineCommV(String dataFineCommV) {
/* 460 */     this.dataFineCommV = dataFineCommV;
/*     */   }
/*     */   public Integer getPosizioneId() {
/* 463 */     return this.posizioneId;
/*     */   }
/*     */   public void setPosizioneId(Integer posizioneId) {
/* 466 */     this.posizioneId = posizioneId;
/*     */   }
/*     */   public String getDataRiferimentoValutaV() {
/* 469 */     return this.dataRiferimentoValutaV;
/*     */   }
/*     */   public void setDataRiferimentoValutaV(String dataRiferimentoValutaV) {
/* 472 */     this.dataRiferimentoValutaV = dataRiferimentoValutaV;
/*     */   }
/*     */   public String getCcEstero() {
/* 475 */     return this.ccEstero;
/*     */   }
/*     */   public void setCcEstero(String ccEstero) {
/* 478 */     this.ccEstero = ccEstero;
/*     */   }
/*     */   public String getSottocodiceRapporto() {
/* 481 */     return this.sottocodiceRapporto;
/*     */   }
/*     */   public void setSottocodiceRapporto(String sottocodiceRapporto) {
/* 484 */     this.sottocodiceRapporto = sottocodiceRapporto;
/*     */   }
/*     */   public String getNomeAssicurato() {
/* 487 */     return this.nomeAssicurato;
/*     */   }
/*     */   public void setNomeAssicurato(String nomeAssicurato) {
/* 490 */     this.nomeAssicurato = nomeAssicurato;
/*     */   }
/*     */   public Double getCapitaleDifferito() {
/* 493 */     return this.capitaleDifferito;
/*     */   }
/*     */   public void setCapitaleDifferito(Double capitaleDifferito) {
/* 496 */     this.capitaleDifferito = capitaleDifferito;
/*     */   }
/*     */   public Integer getScpNumber() {
/* 499 */     return this.scpNumber;
/*     */   }
/*     */   public void setScpNumber(Integer scpNumber) {
/* 502 */     this.scpNumber = scpNumber;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\replica\ScpFlusso.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */