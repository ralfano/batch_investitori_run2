/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinPolizza
/*     */   extends FinContratto
/*     */   implements Serializable
/*     */ {
/*     */   private Set anagPolizza;
/*     */   private Integer contrattoId;
/*     */   private String numProposta;
/*     */   private Date dataIns;
/*     */   private Date dataConferma;
/*     */   private Date dataEmissione;
/*     */   private Date dataDecorrenza;
/*     */   private Date dataScadenza;
/*     */   private Date dataStorno;
/*     */   private Date dtIniPagPremi;
/*     */   private Date dtFinPagPremi;
/*     */   private Integer durata;
/*     */   private String flgLiquidata;
/*     */   private String flgRidotta;
/*     */   private String flgTrasformata;
/*     */   private String codLiberata;
/*     */   private Double premio;
/*     */   private Integer frazionamento;
/*     */   private Double costoFraz;
/*     */   private String mezzoPagPremi;
/*     */   private String flgPrestito;
/*     */   private String polSost1;
/*     */   private String polSost2;
/*     */   private String polSost3;
/*     */   private String polSost4;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Integer ramo;
/*     */   private String codTarif;
/*     */   private String descTarif;
/*     */   private String tipoTarif;
/*     */   private String codRete;
/*     */   private Integer codAgenzia;
/*     */   private String percRivalutazione;
/*     */   private String flagDas;
/*     */   private Double tassoFrazionamento;
/*     */   private String codStorno;
/*     */   private FinContratto contratto;
/*     */   private Set premioPolizza;
/*     */   
/*     */   public FinPolizza(Set polizza, String liberata, String storno, FinContratto contratto, Integer id, Double fraz, Date conferma, Date decorrenza, Date emissione, Date ins, Date inserimento, Date scadenza, Date storno2, Date premi, Date premi2, Integer durata, String liquidata, String prestito, String ridotta, String trasformata, Integer frazionamento, String premi3, String proposta, String sost1, String sost2, String sost3, String sost4, Double premio, Set polizza2, Double frazionamento2, String inserimento2, Integer ramo, String codTarif, String descTarif, String tipoTarif, String codRete, Integer codAgenzia, String percRivalutazione, String flagDas) {
/* 127 */     this.anagPolizza = polizza;
/* 128 */     this.codLiberata = liberata;
/* 129 */     this.codStorno = storno;
/* 130 */     this.contratto = contratto;
/* 131 */     this.contrattoId = id;
/* 132 */     this.costoFraz = fraz;
/* 133 */     this.dataConferma = conferma;
/* 134 */     this.dataDecorrenza = decorrenza;
/* 135 */     this.dataEmissione = emissione;
/* 136 */     this.dataIns = ins;
/* 137 */     this.dataInserimento = inserimento;
/* 138 */     this.dataScadenza = scadenza;
/* 139 */     this.dataStorno = storno2;
/* 140 */     this.dtFinPagPremi = premi;
/* 141 */     this.dtIniPagPremi = premi2;
/* 142 */     this.durata = durata;
/* 143 */     this.flgLiquidata = liquidata;
/* 144 */     this.flgPrestito = prestito;
/* 145 */     this.flgRidotta = ridotta;
/* 146 */     this.flgTrasformata = trasformata;
/* 147 */     this.frazionamento = frazionamento;
/* 148 */     this.mezzoPagPremi = premi3;
/* 149 */     this.numProposta = proposta;
/* 150 */     this.polSost1 = sost1;
/* 151 */     this.polSost2 = sost2;
/* 152 */     this.polSost3 = sost3;
/* 153 */     this.polSost4 = sost4;
/* 154 */     this.premio = premio;
/* 155 */     this.premioPolizza = polizza2;
/* 156 */     this.tassoFrazionamento = frazionamento2;
/* 157 */     this.utenteInserimento = inserimento2;
/* 158 */     this.ramo = ramo;
/* 159 */     this.codTarif = codTarif;
/* 160 */     this.descTarif = descTarif;
/* 161 */     this.tipoTarif = tipoTarif;
/* 162 */     this.codRete = codRete;
/* 163 */     this.codAgenzia = codAgenzia;
/* 164 */     this.percRivalutazione = percRivalutazione;
/* 165 */     this.flagDas = flagDas;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPolizza() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContrattoId() {
/* 183 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 187 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public String getNumProposta() {
/* 191 */     return this.numProposta;
/*     */   }
/*     */   
/*     */   public void setNumProposta(String numProposta) {
/* 195 */     this.numProposta = numProposta;
/*     */   }
/*     */   
/*     */   public Date getDataIns() {
/* 199 */     return this.dataIns;
/*     */   }
/*     */   
/*     */   public void setDataIns(Date dataIns) {
/* 203 */     this.dataIns = dataIns;
/*     */   }
/*     */   
/*     */   public Date getDataConferma() {
/* 207 */     return this.dataConferma;
/*     */   }
/*     */   
/*     */   public void setDataConferma(Date dataConferma) {
/* 211 */     this.dataConferma = dataConferma;
/*     */   }
/*     */   
/*     */   public Date getDataEmissione() {
/* 215 */     return this.dataEmissione;
/*     */   }
/*     */   
/*     */   public void setDataEmissione(Date dataEmissione) {
/* 219 */     this.dataEmissione = dataEmissione;
/*     */   }
/*     */   
/*     */   public Date getDataDecorrenza() {
/* 223 */     return this.dataDecorrenza;
/*     */   }
/*     */   
/*     */   public void setDataDecorrenza(Date dataDecorrenza) {
/* 227 */     this.dataDecorrenza = dataDecorrenza;
/*     */   }
/*     */   
/*     */   public Date getDataScadenza() {
/* 231 */     return this.dataScadenza;
/*     */   }
/*     */   
/*     */   public void setDataScadenza(Date dataScadenza) {
/* 235 */     this.dataScadenza = dataScadenza;
/*     */   }
/*     */   
/*     */   public Date getDataStorno() {
/* 239 */     return this.dataStorno;
/*     */   }
/*     */   
/*     */   public void setDataStorno(Date dataStorno) {
/* 243 */     this.dataStorno = dataStorno;
/*     */   }
/*     */   
/*     */   public Date getDtIniPagPremi() {
/* 247 */     return this.dtIniPagPremi;
/*     */   }
/*     */   
/*     */   public void setDtIniPagPremi(Date dtIniPagPremi) {
/* 251 */     this.dtIniPagPremi = dtIniPagPremi;
/*     */   }
/*     */   
/*     */   public Date getDtFinPagPremi() {
/* 255 */     return this.dtFinPagPremi;
/*     */   }
/*     */   
/*     */   public void setDtFinPagPremi(Date dtFinPagPremi) {
/* 259 */     this.dtFinPagPremi = dtFinPagPremi;
/*     */   }
/*     */   
/*     */   public Integer getDurata() {
/* 263 */     return this.durata;
/*     */   }
/*     */   
/*     */   public void setDurata(Integer durata) {
/* 267 */     this.durata = durata;
/*     */   }
/*     */   
/*     */   public String getFlgLiquidata() {
/* 271 */     return this.flgLiquidata;
/*     */   }
/*     */   
/*     */   public void setFlgLiquidata(String flgLiquidata) {
/* 275 */     this.flgLiquidata = flgLiquidata;
/*     */   }
/*     */   
/*     */   public String getFlgRidotta() {
/* 279 */     return this.flgRidotta;
/*     */   }
/*     */   
/*     */   public void setFlgRidotta(String flgRidotta) {
/* 283 */     this.flgRidotta = flgRidotta;
/*     */   }
/*     */   
/*     */   public String getFlgTrasformata() {
/* 287 */     return this.flgTrasformata;
/*     */   }
/*     */   
/*     */   public void setFlgTrasformata(String flgTrasformata) {
/* 291 */     this.flgTrasformata = flgTrasformata;
/*     */   }
/*     */   
/*     */   public String getCodLiberata() {
/* 295 */     return this.codLiberata;
/*     */   }
/*     */   
/*     */   public void setCodLiberata(String codLiberata) {
/* 299 */     this.codLiberata = codLiberata;
/*     */   }
/*     */   
/*     */   public Double getPremio() {
/* 303 */     return this.premio;
/*     */   }
/*     */   
/*     */   public void setPremio(Double premio) {
/* 307 */     this.premio = premio;
/*     */   }
/*     */   
/*     */   public Integer getFrazionamento() {
/* 311 */     return this.frazionamento;
/*     */   }
/*     */   
/*     */   public void setFrazionamento(Integer frazionamento) {
/* 315 */     this.frazionamento = frazionamento;
/*     */   }
/*     */   
/*     */   public Double getCostoFraz() {
/* 319 */     return this.costoFraz;
/*     */   }
/*     */   
/*     */   public void setCostoFraz(Double costoFraz) {
/* 323 */     this.costoFraz = costoFraz;
/*     */   }
/*     */   
/*     */   public String getMezzoPagPremi() {
/* 327 */     return this.mezzoPagPremi;
/*     */   }
/*     */   
/*     */   public void setMezzoPagPremi(String mezzoPagPremi) {
/* 331 */     this.mezzoPagPremi = mezzoPagPremi;
/*     */   }
/*     */   
/*     */   public String getFlgPrestito() {
/* 335 */     return this.flgPrestito;
/*     */   }
/*     */   
/*     */   public void setFlgPrestito(String flgPrestito) {
/* 339 */     this.flgPrestito = flgPrestito;
/*     */   }
/*     */   
/*     */   public String getPolSost1() {
/* 343 */     return this.polSost1;
/*     */   }
/*     */   
/*     */   public void setPolSost1(String polSost1) {
/* 347 */     this.polSost1 = polSost1;
/*     */   }
/*     */   
/*     */   public String getPolSost2() {
/* 351 */     return this.polSost2;
/*     */   }
/*     */   
/*     */   public void setPolSost2(String polSost2) {
/* 355 */     this.polSost2 = polSost2;
/*     */   }
/*     */   
/*     */   public String getPolSost3() {
/* 359 */     return this.polSost3;
/*     */   }
/*     */   
/*     */   public void setPolSost3(String polSost3) {
/* 363 */     this.polSost3 = polSost3;
/*     */   }
/*     */   
/*     */   public String getPolSost4() {
/* 367 */     return this.polSost4;
/*     */   }
/*     */   
/*     */   public void setPolSost4(String polSost4) {
/* 371 */     this.polSost4 = polSost4;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 377 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 381 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 385 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 389 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContratto getContratto() {
/* 395 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(FinContratto contratto) {
/* 399 */     this.contratto = contratto;
/*     */   }
/*     */   
/*     */   public Set getPremioPolizza() {
/* 403 */     return this.premioPolizza;
/*     */   }
/*     */   
/*     */   public void setPremioPolizza(Set premioPolizza) {
/* 407 */     this.premioPolizza = premioPolizza;
/*     */   }
/*     */   
/*     */   public Set getAnagPolizza() {
/* 411 */     return this.anagPolizza;
/*     */   }
/*     */   
/*     */   public void setAnagPolizza(Set anagPolizza) {
/* 415 */     this.anagPolizza = anagPolizza;
/*     */   }
/*     */   
/*     */   public Double getTassoFrazionamento() {
/* 419 */     return this.tassoFrazionamento;
/*     */   }
/*     */   
/*     */   public void setTassoFrazionamento(Double tassoFrazionamento) {
/* 423 */     this.tassoFrazionamento = tassoFrazionamento;
/*     */   }
/*     */   
/*     */   public String getCodStorno() {
/* 427 */     return this.codStorno;
/*     */   }
/*     */   
/*     */   public void setCodStorno(String codStorno) {
/* 431 */     this.codStorno = codStorno;
/*     */   }
/*     */   
/*     */   public Integer getCodAgenzia() {
/* 435 */     return this.codAgenzia;
/*     */   }
/*     */   
/*     */   public void setCodAgenzia(Integer codAgenzia) {
/* 439 */     this.codAgenzia = codAgenzia;
/*     */   }
/*     */   
/*     */   public String getCodRete() {
/* 443 */     return this.codRete;
/*     */   }
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 447 */     this.codRete = codRete;
/*     */   }
/*     */   
/*     */   public String getCodTarif() {
/* 451 */     return this.codTarif;
/*     */   }
/*     */   
/*     */   public void setCodTarif(String codTarif) {
/* 455 */     this.codTarif = codTarif;
/*     */   }
/*     */   
/*     */   public String getDescTarif() {
/* 459 */     return this.descTarif;
/*     */   }
/*     */   
/*     */   public void setDescTarif(String descTarif) {
/* 463 */     this.descTarif = descTarif;
/*     */   }
/*     */   
/*     */   public String getPercRivalutazione() {
/* 467 */     return this.percRivalutazione;
/*     */   }
/*     */   
/*     */   public void setPercRivalutazione(String percRivalutazione) {
/* 471 */     this.percRivalutazione = percRivalutazione;
/*     */   }
/*     */   
/*     */   public Integer getRamo() {
/* 475 */     return this.ramo;
/*     */   }
/*     */   
/*     */   public void setRamo(Integer ramo) {
/* 479 */     this.ramo = ramo;
/*     */   }
/*     */   
/*     */   public String getTipoTarif() {
/* 483 */     return this.tipoTarif;
/*     */   }
/*     */   
/*     */   public void setTipoTarif(String tipoTarif) {
/* 487 */     this.tipoTarif = tipoTarif;
/*     */   }
/*     */   
/*     */   public String getFlagDas() {
/* 491 */     return this.flagDas;
/*     */   }
/*     */   
/*     */   public void setFlagDas(String flagDas) {
/* 495 */     this.flagDas = flagDas;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPolizza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */