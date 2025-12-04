/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class FinPosizione
/*     */   extends FinPosizioneBase
/*     */   implements Serializable
/*     */ {
/*     */   private String sottoDossier;
/*     */   private String tipo;
/*     */   private String tipoProdotto;
/*     */   private Date dataCreazione;
/*     */   private Double quantitaDisp;
/*     */   private Double qtBloccata;
/*     */   private Double qtTunnel1;
/*     */   private Double qtTunnel2;
/*     */   private Double qtTunnel3;
/*     */   private Double qtTunnel4;
/*     */   private Double rateo;
/*     */   private Double giacenzaMedia;
/*     */   private Integer ggDaApert;
/*     */   private Double commissioni;
/*     */   private Double spese;
/*     */   private Double impGiroconLordo;
/*     */   private Double impGiroconNetto;
/*     */   private Double rendInvestLordo;
/*     */   private Double rendInvestNetto;
/*     */   private Double numQuoteCert;
/*     */   private Date dataInserimento;
/*     */   private Double percentuale;
/*     */   private Double qtPrenotata;
/*     */   private String utenteInserimento;
/*     */   private String codiceSconto;
/*     */   private String codiceConvenzione;
/*     */   private String flgNoPagAmministrative;
/*     */   private String flagObbBanca;
/*     */   private String statoObb;
/*     */   private Set ordini;
/*     */   private Set certificato;
/*     */   private Set contrBlocchi;
/*     */   private Set estrazioni;
/*     */   private Date dataPrimoMov;
/*     */   private Date dataUltMov;
/*     */   private String statoPosizione;
/*     */   
/*     */   public FinPosizione(Date dataPrimoMov, Date dataUltMov, Double percentuale, FinAttivitaFinanziaria fin, Double medio, Double commissioni, Integer id, Double ctv, Date creazione, Date inserimento, Date val, Integer apert, Double media, Double lordo, Double netto, Double lordo2, Double netto2, Double lordo3, Double netto3, Double lordo4, Double netto4, Double cert, Double pmc, Integer id2, Double bloccata, Double qtPrenotata, Double tunnel1, Double tunnel2, Double tunnel3, Double tunnel4, Double quantita, Double disp, Double rateo, Double lordo5, Double netto5, String dossier, Double spese, String tipo, String prodotto, String inserimento2, Double quota, String codiceSconto, Set certificato, Set dettaglioPct, String statoPosizione) {
/* 126 */     this.dataPrimoMov = dataPrimoMov;
/* 127 */     this.dataUltMov = dataUltMov;
/* 128 */     this.attivitaFin = fin;
/* 129 */     this.cambioMedio = medio;
/* 130 */     this.percentuale = percentuale;
/* 131 */     this.commissioni = commissioni;
/* 132 */     this.ctv = ctv;
/* 133 */     this.dataCreazione = creazione;
/* 134 */     this.dataInserimento = inserimento;
/* 135 */     this.dataVal = val;
/* 136 */     this.ggDaApert = apert;
/* 137 */     this.giacenzaMedia = media;
/* 138 */     this.impGiroconLordo = lordo;
/* 139 */     this.impGiroconNetto = netto;
/* 140 */     this.impPlusvalLordo = lordo2;
/* 141 */     this.impPlusvalNetto = netto2;
/* 142 */     this.impPrelevLordo = lordo3;
/* 143 */     this.impPrelevNetto = netto3;
/* 144 */     this.impVersatoLordo = lordo4;
/* 145 */     this.impVersatoNetto = netto4;
/* 146 */     this.numQuoteCert = cert;
/* 147 */     this.pmc = pmc;
/* 148 */     this.posizioneId = id2;
/* 149 */     this.qtBloccata = bloccata;
/* 150 */     this.qtPrenotata = qtPrenotata;
/* 151 */     this.qtTunnel1 = tunnel1;
/* 152 */     this.qtTunnel2 = tunnel2;
/* 153 */     this.qtTunnel3 = tunnel3;
/* 154 */     this.qtTunnel4 = tunnel4;
/* 155 */     this.quantita = quantita;
/* 156 */     this.quantitaDisp = disp;
/* 157 */     this.rateo = rateo;
/* 158 */     this.rendInvestLordo = lordo5;
/* 159 */     this.rendInvestNetto = netto5;
/* 160 */     this.sottoDossier = dossier;
/* 161 */     this.spese = spese;
/* 162 */     this.tipo = tipo;
/* 163 */     this.tipoProdotto = prodotto;
/* 164 */     this.utenteInserimento = inserimento2;
/* 165 */     this.valQuota = quota;
/* 166 */     this.codiceSconto = codiceSconto;
/* 167 */     this.certificato = certificato;
/* 168 */     this.statoPosizione = statoPosizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizione() {}
/*     */ 
/*     */   
/*     */   public FinPosizione(FinAttivitaFinanziaria attivitaFin) {
/* 177 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 182 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(String tipo) {
/* 186 */     this.tipo = tipo;
/*     */   }
/*     */   
/*     */   public Date getDataCreazione() {
/* 190 */     return this.dataCreazione;
/*     */   }
/*     */   
/*     */   public void setDataCreazione(Date dataCreazione) {
/* 194 */     this.dataCreazione = dataCreazione;
/*     */   }
/*     */   
/*     */   public Double getQuantitaDisp() {
/* 198 */     return this.quantitaDisp;
/*     */   }
/*     */   
/*     */   public void setQuantitaDisp(Double quantitaDisp) {
/* 202 */     this.quantitaDisp = quantitaDisp;
/*     */   }
/*     */   
/*     */   public Double getQtBloccata() {
/* 206 */     return this.qtBloccata;
/*     */   }
/*     */   
/*     */   public void setQtBloccata(Double qtBloccata) {
/* 210 */     this.qtBloccata = qtBloccata;
/*     */   }
/*     */   
/*     */   public Double getQtTunnel1() {
/* 214 */     return this.qtTunnel1;
/*     */   }
/*     */   
/*     */   public void setQtTunnel1(Double qtTunnel1) {
/* 218 */     this.qtTunnel1 = qtTunnel1;
/*     */   }
/*     */   
/*     */   public Double getQtTunnel2() {
/* 222 */     return this.qtTunnel2;
/*     */   }
/*     */   
/*     */   public void setQtTunnel2(Double qtTunnel2) {
/* 226 */     this.qtTunnel2 = qtTunnel2;
/*     */   }
/*     */   
/*     */   public Double getQtTunnel3() {
/* 230 */     return this.qtTunnel3;
/*     */   }
/*     */   
/*     */   public void setQtTunnel3(Double qtTunnel3) {
/* 234 */     this.qtTunnel3 = qtTunnel3;
/*     */   }
/*     */   
/*     */   public Double getQtTunnel4() {
/* 238 */     return this.qtTunnel4;
/*     */   }
/*     */   
/*     */   public void setQtTunnel4(Double qtTunnel4) {
/* 242 */     this.qtTunnel4 = qtTunnel4;
/*     */   }
/*     */   
/*     */   public Double getRateo() {
/* 246 */     return this.rateo;
/*     */   }
/*     */   
/*     */   public void setRateo(Double rateo) {
/* 250 */     this.rateo = rateo;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 254 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 258 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public Double getGiacenzaMedia() {
/* 262 */     return this.giacenzaMedia;
/*     */   }
/*     */   
/*     */   public void setGiacenzaMedia(Double giacenzaMedia) {
/* 266 */     this.giacenzaMedia = giacenzaMedia;
/*     */   }
/*     */   
/*     */   public Integer getGgDaApert() {
/* 270 */     return this.ggDaApert;
/*     */   }
/*     */   
/*     */   public void setGgDaApert(Integer ggDaApert) {
/* 274 */     this.ggDaApert = ggDaApert;
/*     */   }
/*     */   
/*     */   public Double getCommissioni() {
/* 278 */     return this.commissioni;
/*     */   }
/*     */   
/*     */   public void setCommissioni(Double commissioni) {
/* 282 */     this.commissioni = commissioni;
/*     */   }
/*     */   
/*     */   public Double getSpese() {
/* 286 */     return this.spese;
/*     */   }
/*     */   
/*     */   public void setSpese(Double spese) {
/* 290 */     this.spese = spese;
/*     */   }
/*     */   
/*     */   public Double getImpGiroconLordo() {
/* 294 */     return this.impGiroconLordo;
/*     */   }
/*     */   
/*     */   public void setImpGiroconLordo(Double impGiroconLordo) {
/* 298 */     this.impGiroconLordo = impGiroconLordo;
/*     */   }
/*     */   
/*     */   public Double getImpGiroconNetto() {
/* 302 */     return this.impGiroconNetto;
/*     */   }
/*     */   
/*     */   public void setImpGiroconNetto(Double impGiroconNetto) {
/* 306 */     this.impGiroconNetto = impGiroconNetto;
/*     */   }
/*     */   
/*     */   public Double getRendInvestLordo() {
/* 310 */     return this.rendInvestLordo;
/*     */   }
/*     */   
/*     */   public void setRendInvestLordo(Double rendInvestLordo) {
/* 314 */     this.rendInvestLordo = rendInvestLordo;
/*     */   }
/*     */   
/*     */   public Double getRendInvestNetto() {
/* 318 */     return this.rendInvestNetto;
/*     */   }
/*     */   
/*     */   public void setRendInvestNetto(Double rendInvestNetto) {
/* 322 */     this.rendInvestNetto = rendInvestNetto;
/*     */   }
/*     */   
/*     */   public Double getNumQuoteCert() {
/* 326 */     return this.numQuoteCert;
/*     */   }
/*     */   
/*     */   public void setNumQuoteCert(Double numQuoteCert) {
/* 330 */     this.numQuoteCert = numQuoteCert;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 334 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 338 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 342 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 346 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 350 */     return (new ToStringBuilder(this)).append("posizioneId", getPosizioneId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object pos) {
/* 356 */     if (!(pos instanceof FinPosizione))
/* 357 */       return false; 
/* 358 */     EqualsBuilder comparator = new EqualsBuilder();
/* 359 */     FinPosizione posizione = (FinPosizione)pos;
/* 360 */     comparator.append(this.posizioneId, posizione.posizioneId);
/* 361 */     return comparator.isEquals();
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 365 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 3);
/* 366 */     hBuilder.append(this.sottoDossier);
/* 367 */     hBuilder.append(this.tipoProdotto);
/* 368 */     hBuilder.append(this.tipo);
/* 369 */     hBuilder.append(this.dataVal);
/* 370 */     hBuilder.append(this.dataCreazione);
/* 371 */     hBuilder.append(this.quantita);
/* 372 */     hBuilder.append(this.quantitaDisp);
/* 373 */     hBuilder.append(this.qtBloccata);
/* 374 */     hBuilder.append(this.qtPrenotata);
/* 375 */     hBuilder.append(this.qtTunnel1);
/* 376 */     hBuilder.append(this.qtTunnel2);
/* 377 */     hBuilder.append(this.qtTunnel3);
/* 378 */     hBuilder.append(this.qtTunnel4);
/* 379 */     hBuilder.append(this.ctv);
/* 380 */     hBuilder.append(this.rateo);
/* 381 */     hBuilder.append(this.pmc);
/* 382 */     hBuilder.append(this.cambioMedio);
/* 383 */     hBuilder.append(this.valQuota);
/* 384 */     hBuilder.append(this.giacenzaMedia);
/* 385 */     hBuilder.append(this.ggDaApert);
/* 386 */     hBuilder.append(this.commissioni);
/* 387 */     hBuilder.append(this.spese);
/* 388 */     hBuilder.append(this.impVersatoLordo);
/* 389 */     hBuilder.append(this.impPrelevLordo);
/* 390 */     hBuilder.append(this.impGiroconLordo);
/* 391 */     hBuilder.append(this.impPlusvalLordo);
/* 392 */     hBuilder.append(this.impVersatoNetto);
/* 393 */     hBuilder.append(this.impPrelevNetto);
/* 394 */     hBuilder.append(this.impGiroconNetto);
/* 395 */     hBuilder.append(this.impPlusvalNetto);
/* 396 */     hBuilder.append(this.rendInvestLordo);
/* 397 */     hBuilder.append(this.rendInvestNetto);
/* 398 */     hBuilder.append(this.numQuoteCert);
/*     */     
/* 400 */     return hBuilder.toHashCode();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizione copyFields(FinPosizione posizione) {
/* 410 */     this.sottoDossier = posizione.getSottoDossier();
/* 411 */     this.tipo = posizione.getTipo();
/* 412 */     this.tipoProdotto = posizione.getTipoProdotto();
/* 413 */     this.dataCreazione = posizione.getDataCreazione();
/* 414 */     this.quantitaDisp = posizione.getQuantitaDisp();
/* 415 */     this.qtBloccata = posizione.getQtBloccata();
/* 416 */     this.qtTunnel1 = posizione.getQtTunnel1();
/* 417 */     this.qtTunnel2 = posizione.getQtTunnel2();
/* 418 */     this.qtTunnel3 = posizione.getQtTunnel3();
/* 419 */     this.qtTunnel4 = posizione.getQtTunnel4();
/* 420 */     this.rateo = posizione.getRateo();
/* 421 */     this.giacenzaMedia = posizione.getGiacenzaMedia();
/* 422 */     this.ggDaApert = posizione.getGgDaApert();
/* 423 */     this.commissioni = posizione.getCommissioni();
/* 424 */     this.spese = posizione.getSpese();
/* 425 */     this.impGiroconLordo = posizione.getImpGiroconLordo();
/* 426 */     this.impGiroconNetto = posizione.getImpGiroconNetto();
/* 427 */     this.rendInvestLordo = posizione.getRendInvestLordo();
/* 428 */     this.rendInvestNetto = posizione.getRendInvestNetto();
/* 429 */     this.numQuoteCert = posizione.getNumQuoteCert();
/* 430 */     this.dataInserimento = posizione.getDataInserimento();
/* 431 */     this.percentuale = posizione.getPercentuale();
/* 432 */     this.qtPrenotata = posizione.getQtPrenotata();
/* 433 */     this.utenteInserimento = posizione.getUtenteInserimento();
/* 434 */     this.codiceSconto = posizione.getCodiceSconto();
/* 435 */     this.codiceConvenzione = posizione.getCodiceConvenzione();
/* 436 */     this.flgNoPagAmministrative = posizione.getFlgNoPagAmministrative();
/* 437 */     this.flagObbBanca = posizione.getFlagObbBanca();
/* 438 */     this.statoObb = posizione.getStatoObb();
/*     */     
/* 440 */     this.dataPrimoMov = posizione.getDataPrimoMov();
/* 441 */     this.dataUltMov = posizione.getDataUltMov();
/* 442 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSottoDossier() {
/* 448 */     return this.sottoDossier;
/*     */   }
/*     */   
/*     */   public void setSottoDossier(String sottoDossier) {
/* 452 */     this.sottoDossier = sottoDossier;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercentuale() {
/* 459 */     return this.percentuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentuale(Double percentuale) {
/* 467 */     this.percentuale = percentuale;
/*     */   }
/*     */   
/*     */   public Set getCertificato() {
/* 471 */     return this.certificato;
/*     */   }
/*     */   
/*     */   public void setCertificato(Set certificato) {
/* 475 */     this.certificato = certificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagObbBanca() {
/* 482 */     return this.flagObbBanca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagObbBanca(String flagObbBanca) {
/* 490 */     this.flagObbBanca = flagObbBanca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoObb() {
/* 497 */     return this.statoObb;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoObb(String statoObb) {
/* 505 */     this.statoObb = statoObb;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getOrdini() {
/* 512 */     return this.ordini;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOrdini(Set ordini) {
/* 520 */     this.ordini = ordini;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getContrBlocchi() {
/* 527 */     return this.contrBlocchi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrBlocchi(Set contrBlocchi) {
/* 535 */     this.contrBlocchi = contrBlocchi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQtPrenotata() {
/* 542 */     return this.qtPrenotata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQtPrenotata(Double qtPrenotata) {
/* 550 */     this.qtPrenotata = qtPrenotata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSconto() {
/* 557 */     return this.codiceSconto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSconto(String codiceSconto) {
/* 565 */     this.codiceSconto = codiceSconto;
/*     */   }
/*     */   
/*     */   public Date getDataPrimoMov() {
/* 569 */     return this.dataPrimoMov;
/*     */   }
/*     */   
/*     */   public void setDataPrimoMov(Date dataPrimoMov) {
/* 573 */     this.dataPrimoMov = dataPrimoMov;
/*     */   }
/*     */   
/*     */   public Date getDataUltMov() {
/* 577 */     return this.dataUltMov;
/*     */   }
/*     */   
/*     */   public void setDataUltMov(Date dataUltMov) {
/* 581 */     this.dataUltMov = dataUltMov;
/*     */   }
/*     */   
/*     */   public Set getEstrazioni() {
/* 585 */     return this.estrazioni;
/*     */   }
/*     */   
/*     */   public void setEstrazioni(Set estrazioni) {
/* 589 */     this.estrazioni = estrazioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceConvenzione() {
/* 596 */     return this.codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceConvenzione(String codiceConvenzione) {
/* 604 */     this.codiceConvenzione = codiceConvenzione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgNoPagAmministrative() {
/* 611 */     return this.flgNoPagAmministrative;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlgNoPagAmministrative(String flgNoPagAmministrative) {
/* 619 */     this.flgNoPagAmministrative = flgNoPagAmministrative;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoPosizione() {
/* 626 */     return this.statoPosizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoPosizione(String statoPosizione) {
/* 634 */     this.statoPosizione = statoPosizione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPosizione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */