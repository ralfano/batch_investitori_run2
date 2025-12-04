/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
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
/*     */ public class FinMovimento
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer movimentoId;
/*     */   private String tipo;
/*     */   private String causale;
/*     */   private Date dataMovimento;
/*     */   private Date dataCompetenza;
/*     */   private Date dataValuta;
/*     */   private Date dataRegistraz;
/*     */   private String divisa;
/*     */   private Double impVersatoLordo;
/*     */   private Double impPrelevLordo;
/*     */   private Double impGiroconLordo;
/*     */   private Double impVersatoNetto;
/*     */   private Double impPrelevNetto;
/*     */   private Double impGiroconNetto;
/*     */   private Double importo;
/*     */   private Double quantita;
/*     */   private Double prezzo;
/*     */   private Double cambio;
/*     */   private Double ctvLordo;
/*     */   private Double ctvNetto;
/*     */   private Double commissioni;
/*     */   private Double spese;
/*     */   private Double tasse;
/*     */   private String numMovExt;
/*     */   private Double scontoTunnel;
/*     */   private Integer nmRatePagVers;
/*     */   private Integer nmRatePagPrec;
/*     */   private String nmPolizzaDest;
/*     */   private String fndDestinazione;
/*     */   private String nomeBenef;
/*     */   private String flgRid;
/*     */   private String flgStampaConf;
/*     */   private Date dataStorno;
/*     */   private Date dataRegolamento;
/*     */   private Date dataEsecuzione;
/*     */   private Date dataInserimento;
/*     */   private Date dataNAV;
/*     */   private String utenteInserimento;
/*     */   private String codiceAgente;
/*     */   private String tipoProdotto;
/*     */   private Double numQuoteCert;
/*     */   private Double importoNettoValuta;
/*     */   private Double commissioniValuta;
/*     */   private Double speseValuta;
/*     */   private Double tasseValuta;
/*     */   private String divisaCommissioni;
/*     */   private Double cambioCommissioni;
/*     */   private Double prezzoValuta;
/*     */   private FinPosizione posizione;
/*     */   private FinContratto contratto;
/*     */   private FinAttivitaFinanziaria attivitaFin;
/*     */   private Integer promotoreId;
/*     */   private FinPromotore promotore;
/*     */   private String descrizione;
/*     */   private FinOrdine ordine;
/*     */   private Set dispPagamento;
/*     */   private Date dataValutaNetto;
/*     */   private String divisaNetto;
/*     */   private Double cambioNetto;
/*     */   private String flagObbBanca;
/*     */   private String statoObb;
/*     */   private Set estrazioni;
/*     */   private Set estrazioniAnt;
/*     */   
/*     */   public Date getDataNAV() {
/* 147 */     return this.dataNAV;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataNAV(Date dataNAV) {
/* 154 */     this.dataNAV = dataNAV;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagObbBanca() {
/* 161 */     return this.flagObbBanca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagObbBanca(String flagObbBanca) {
/* 169 */     this.flagObbBanca = flagObbBanca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoObb() {
/* 176 */     return this.statoObb;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoObb(String statoObb) {
/* 184 */     this.statoObb = statoObb;
/*     */   }
/*     */   
/*     */   public Double getCambioNetto() {
/* 188 */     return this.cambioNetto;
/*     */   }
/*     */   
/*     */   public void setCambioNetto(Double cambioNetto) {
/* 192 */     this.cambioNetto = cambioNetto;
/*     */   }
/*     */   
/*     */   public Date getDataValutaNetto() {
/* 196 */     return this.dataValutaNetto;
/*     */   }
/*     */   
/*     */   public void setDataValutaNetto(Date dataValutaNetto) {
/* 200 */     this.dataValutaNetto = dataValutaNetto;
/*     */   }
/*     */   
/*     */   public String getDivisaNetto() {
/* 204 */     return this.divisaNetto;
/*     */   }
/*     */   
/*     */   public void setDivisaNetto(String divisaNetto) {
/* 208 */     this.divisaNetto = divisaNetto;
/*     */   }
/*     */   
/*     */   public FinPromotore getPromotore() {
/* 212 */     return this.promotore;
/*     */   }
/*     */   
/*     */   public void setPromotore(FinPromotore promotore) {
/* 216 */     this.promotore = promotore;
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
/*     */   public FinMovimento(Date dataRegolamento, Date dataEsecuzione, Date dataStorno, FinAttivitaFinanziaria fin, Double cambio, Double commissioni, String causale, String agente, Double commissioni2, Double valuta, FinContratto contratto, Double lordo, Double netto, Date competenza, Date record, Date movimento, Date registraz, Date storno, Date valuta2, Set pagamento, String divisa, String commissioni3, String rid, String conf, String destinazione, Double lordo2, Double netto2, Double importo, Double valuta3, Double lordo3, Double netto3, Double lordo4, Double netto4, String dest, Integer prec, Integer vers, String benef, String ext, Double cert, FinOrdine ordine, FinPosizione posizione, Double prezzo, Double valuta4, Integer id, Double quantita, Double tunnel, Double spese, Double valuta5, Double tasse, Double valuta6, String tipo, String prodotto, String inserimento) {
/* 234 */     this.attivitaFin = fin;
/* 235 */     this.cambio = cambio;
/* 236 */     this.dataRegolamento = dataRegolamento;
/* 237 */     this.dataEsecuzione = dataEsecuzione;
/* 238 */     this.dataStorno = dataStorno;
/* 239 */     this.cambioCommissioni = commissioni;
/* 240 */     this.causale = causale;
/* 241 */     this.codiceAgente = agente;
/* 242 */     commissioni = commissioni2;
/* 243 */     this.commissioniValuta = valuta;
/* 244 */     this.contratto = contratto;
/* 245 */     this.ctvLordo = lordo;
/* 246 */     this.ctvNetto = netto;
/* 247 */     this.dataCompetenza = competenza;
/* 248 */     this.dataInserimento = record;
/* 249 */     this.dataMovimento = movimento;
/* 250 */     this.dataRegistraz = registraz;
/* 251 */     dataStorno = storno;
/* 252 */     this.dataValuta = valuta2;
/* 253 */     this.dispPagamento = pagamento;
/* 254 */     this.divisa = divisa;
/* 255 */     this.divisaCommissioni = commissioni3;
/* 256 */     this.flgRid = rid;
/* 257 */     this.flgStampaConf = conf;
/* 258 */     this.fndDestinazione = destinazione;
/* 259 */     this.impGiroconLordo = lordo2;
/* 260 */     this.impGiroconNetto = netto2;
/* 261 */     this.importo = importo;
/* 262 */     this.importoNettoValuta = valuta3;
/* 263 */     this.impPrelevLordo = lordo3;
/* 264 */     this.impPrelevNetto = netto3;
/* 265 */     this.impVersatoLordo = lordo4;
/* 266 */     this.impVersatoNetto = netto4;
/* 267 */     this.nmPolizzaDest = dest;
/* 268 */     this.nmRatePagPrec = prec;
/* 269 */     this.nmRatePagVers = vers;
/* 270 */     this.nomeBenef = benef;
/* 271 */     this.numMovExt = ext;
/* 272 */     this.numQuoteCert = cert;
/* 273 */     this.ordine = ordine;
/* 274 */     this.posizione = posizione;
/* 275 */     this.prezzo = prezzo;
/* 276 */     this.prezzoValuta = valuta4;
/* 277 */     this.quantita = quantita;
/* 278 */     this.scontoTunnel = tunnel;
/* 279 */     this.spese = spese;
/* 280 */     this.speseValuta = valuta5;
/* 281 */     this.tasse = tasse;
/* 282 */     this.tasseValuta = valuta6;
/* 283 */     this.tipo = tipo;
/* 284 */     this.tipoProdotto = prodotto;
/* 285 */     this.utenteInserimento = inserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinMovimento() {}
/*     */ 
/*     */   
/*     */   public FinMovimento(Integer movimentoId) {
/* 294 */     this.movimentoId = movimentoId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getMovimentoId() {
/* 303 */     return this.movimentoId;
/*     */   }
/*     */   
/*     */   public void setMovimentoId(Integer movimentoId) {
/* 307 */     this.movimentoId = movimentoId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 314 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(String tipo) {
/* 318 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCausale() {
/* 325 */     return this.causale;
/*     */   }
/*     */   
/*     */   public void setCausale(String causale) {
/* 329 */     this.causale = causale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataMovimento() {
/* 336 */     return this.dataMovimento;
/*     */   }
/*     */   
/*     */   public void setDataMovimento(Date dataMovimento) {
/* 340 */     this.dataMovimento = dataMovimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCompetenza() {
/* 347 */     return this.dataCompetenza;
/*     */   }
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 351 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValuta() {
/* 358 */     return this.dataValuta;
/*     */   }
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 362 */     this.dataValuta = dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRegistraz() {
/* 369 */     return this.dataRegistraz;
/*     */   }
/*     */   
/*     */   public void setDataRegistraz(Date dataRegistraz) {
/* 373 */     this.dataRegistraz = dataRegistraz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDivisa() {
/* 380 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 384 */     this.divisa = divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpVersatoLordo() {
/* 391 */     return this.impVersatoLordo;
/*     */   }
/*     */   
/*     */   public void setImpVersatoLordo(Double impVersatoLordo) {
/* 395 */     this.impVersatoLordo = impVersatoLordo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpPrelevLordo() {
/* 402 */     return this.impPrelevLordo;
/*     */   }
/*     */   
/*     */   public void setImpPrelevLordo(Double impPrelevLordo) {
/* 406 */     this.impPrelevLordo = impPrelevLordo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpGiroconLordo() {
/* 413 */     return this.impGiroconLordo;
/*     */   }
/*     */   
/*     */   public void setImpGiroconLordo(Double impGiroconLordo) {
/* 417 */     this.impGiroconLordo = impGiroconLordo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpVersatoNetto() {
/* 424 */     return this.impVersatoNetto;
/*     */   }
/*     */   
/*     */   public void setImpVersatoNetto(Double impVersatoNetto) {
/* 428 */     this.impVersatoNetto = impVersatoNetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpPrelevNetto() {
/* 435 */     return this.impPrelevNetto;
/*     */   }
/*     */   
/*     */   public void setImpPrelevNetto(Double impPrelevNetto) {
/* 439 */     this.impPrelevNetto = impPrelevNetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpGiroconNetto() {
/* 446 */     return this.impGiroconNetto;
/*     */   }
/*     */   
/*     */   public void setImpGiroconNetto(Double impGiroconNetto) {
/* 450 */     this.impGiroconNetto = impGiroconNetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImporto() {
/* 457 */     return this.importo;
/*     */   }
/*     */   
/*     */   public void setImporto(Double importo) {
/* 461 */     this.importo = importo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuantita() {
/* 468 */     return this.quantita;
/*     */   }
/*     */   
/*     */   public void setQuantita(Double quantita) {
/* 472 */     this.quantita = quantita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzo() {
/* 479 */     return this.prezzo;
/*     */   }
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 483 */     this.prezzo = prezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCambio() {
/* 490 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 494 */     this.cambio = cambio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCtvLordo() {
/* 501 */     return this.ctvLordo;
/*     */   }
/*     */   
/*     */   public void setCtvLordo(Double ctvLordo) {
/* 505 */     this.ctvLordo = ctvLordo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCtvNetto() {
/* 512 */     return this.ctvNetto;
/*     */   }
/*     */   
/*     */   public void setCtvNetto(Double ctvNetto) {
/* 516 */     this.ctvNetto = ctvNetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCommissioni() {
/* 523 */     return this.commissioni;
/*     */   }
/*     */   
/*     */   public void setCommissioni(Double commissioni) {
/* 527 */     this.commissioni = commissioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSpese() {
/* 534 */     return this.spese;
/*     */   }
/*     */   
/*     */   public void setSpese(Double spese) {
/* 538 */     this.spese = spese;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getTasse() {
/* 545 */     return this.tasse;
/*     */   }
/*     */   
/*     */   public void setTasse(Double tasse) {
/* 549 */     this.tasse = tasse;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumMovExt() {
/* 556 */     return this.numMovExt;
/*     */   }
/*     */   
/*     */   public void setNumMovExt(String numMovExt) {
/* 560 */     this.numMovExt = numMovExt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getScontoTunnel() {
/* 567 */     return this.scontoTunnel;
/*     */   }
/*     */   
/*     */   public void setScontoTunnel(Double scontoTunnel) {
/* 571 */     this.scontoTunnel = scontoTunnel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNmRatePagVers() {
/* 578 */     return this.nmRatePagVers;
/*     */   }
/*     */   
/*     */   public void setNmRatePagVers(Integer nmRatePagVers) {
/* 582 */     this.nmRatePagVers = nmRatePagVers;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNmRatePagPrec() {
/* 589 */     return this.nmRatePagPrec;
/*     */   }
/*     */   
/*     */   public void setNmRatePagPrec(Integer nmRatePagPrec) {
/* 593 */     this.nmRatePagPrec = nmRatePagPrec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNmPolizzaDest() {
/* 600 */     return this.nmPolizzaDest;
/*     */   }
/*     */   
/*     */   public void setNmPolizzaDest(String nmPolizzaDest) {
/* 604 */     this.nmPolizzaDest = nmPolizzaDest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFndDestinazione() {
/* 611 */     return this.fndDestinazione;
/*     */   }
/*     */   
/*     */   public void setFndDestinazione(String fndDestinazione) {
/* 615 */     this.fndDestinazione = fndDestinazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNomeBenef() {
/* 622 */     return this.nomeBenef;
/*     */   }
/*     */   
/*     */   public void setNomeBenef(String nomeBenef) {
/* 626 */     this.nomeBenef = nomeBenef;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgRid() {
/* 633 */     return this.flgRid;
/*     */   }
/*     */   
/*     */   public void setFlgRid(String flgRid) {
/* 637 */     this.flgRid = flgRid;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgStampaConf() {
/* 644 */     return this.flgStampaConf;
/*     */   }
/*     */   
/*     */   public void setFlgStampaConf(String flgStampaConf) {
/* 648 */     this.flgStampaConf = flgStampaConf;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 655 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimentoRecord) {
/* 659 */     this.dataInserimento = dataInserimentoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 666 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 670 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAgente() {
/* 677 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 681 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getNumQuoteCert() {
/* 688 */     return this.numQuoteCert;
/*     */   }
/*     */   
/*     */   public void setNumQuoteCert(Double numQuoteCert) {
/* 692 */     this.numQuoteCert = numQuoteCert;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProdotto() {
/* 699 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 703 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizione getPosizione() {
/* 710 */     return this.posizione;
/*     */   }
/*     */   
/*     */   public void setPosizione(FinPosizione posizione) {
/* 714 */     this.posizione = posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContratto getContratto() {
/* 725 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(FinContratto contratto) {
/* 729 */     this.contratto = contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFin() {
/* 736 */     return this.attivitaFin;
/*     */   }
/*     */   
/*     */   public void setAttivitaFin(FinAttivitaFinanziaria attivitaFin) {
/* 740 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */   
/*     */   public Double getCambioCommissioni() {
/* 744 */     return this.cambioCommissioni;
/*     */   }
/*     */   
/*     */   public void setCambioCommissioni(Double cambioCommissioni) {
/* 748 */     this.cambioCommissioni = cambioCommissioni;
/*     */   }
/*     */   
/*     */   public Double getCommissioniValuta() {
/* 752 */     return this.commissioniValuta;
/*     */   }
/*     */   
/*     */   public void setCommissioniValuta(Double commissioniValuta) {
/* 756 */     this.commissioniValuta = commissioniValuta;
/*     */   }
/*     */   
/*     */   public String getDivisaCommissioni() {
/* 760 */     return this.divisaCommissioni;
/*     */   }
/*     */   
/*     */   public void setDivisaCommissioni(String divisaCommissioni) {
/* 764 */     this.divisaCommissioni = divisaCommissioni;
/*     */   }
/*     */   
/*     */   public Double getImportoNettoValuta() {
/* 768 */     return this.importoNettoValuta;
/*     */   }
/*     */   
/*     */   public void setImportoNettoValuta(Double importoNettoValuta) {
/* 772 */     this.importoNettoValuta = importoNettoValuta;
/*     */   }
/*     */   
/*     */   public Double getSpeseValuta() {
/* 776 */     return this.speseValuta;
/*     */   }
/*     */   
/*     */   public void setSpeseValuta(Double speseValuta) {
/* 780 */     this.speseValuta = speseValuta;
/*     */   }
/*     */   
/*     */   public Double getTasseValuta() {
/* 784 */     return this.tasseValuta;
/*     */   }
/*     */   
/*     */   public void setTasseValuta(Double tasseValuta) {
/* 788 */     this.tasseValuta = tasseValuta;
/*     */   }
/*     */   
/*     */   public Set getDispPagamento() {
/* 792 */     return this.dispPagamento;
/*     */   }
/*     */   
/*     */   public void setDispPagamento(Set dispPagamento) {
/* 796 */     this.dispPagamento = dispPagamento;
/*     */   }
/*     */   
/*     */   public Double getPrezzoValuta() {
/* 800 */     return this.prezzoValuta;
/*     */   }
/*     */   
/*     */   public void setPrezzoValuta(Double prezzoValuta) {
/* 804 */     this.prezzoValuta = prezzoValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinOrdine getOrdine() {
/* 814 */     return this.ordine;
/*     */   }
/*     */   
/*     */   public void setOrdine(FinOrdine ordine) {
/* 818 */     this.ordine = ordine;
/*     */   }
/*     */   
/*     */   public Date getDataStorno() {
/* 822 */     return this.dataStorno;
/*     */   }
/*     */   
/*     */   public void setDataStorno(Date dataStorno) {
/* 826 */     this.dataStorno = dataStorno;
/*     */   }
/*     */   
/*     */   public Date getDataRegolamento() {
/* 830 */     return this.dataRegolamento;
/*     */   }
/*     */   
/*     */   public void setDataRegolamento(Date dataRegolamento) {
/* 834 */     this.dataRegolamento = dataRegolamento;
/*     */   }
/*     */   
/*     */   public Date getDataEsecuzione() {
/* 838 */     return this.dataEsecuzione;
/*     */   }
/*     */   
/*     */   public void setDataEsecuzione(Date dataEsecuzione) {
/* 842 */     this.dataEsecuzione = dataEsecuzione;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreId() {
/* 846 */     return this.promotoreId;
/*     */   }
/*     */   
/*     */   public void setPromotoreId(Integer promotoreId) {
/* 850 */     this.promotoreId = promotoreId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizione() {
/* 856 */     return this.descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/* 864 */     this.descrizione = descrizione;
/*     */   }
/*     */   
/*     */   public Set getEstrazioni() {
/* 868 */     return this.estrazioni;
/*     */   }
/*     */   
/*     */   public void setEstrazioni(Set estrazioni) {
/* 872 */     this.estrazioni = estrazioni;
/*     */   }
/*     */   
/*     */   public Set getEstrazioniAnt() {
/* 876 */     return this.estrazioniAnt;
/*     */   }
/*     */   
/*     */   public void setEstrazioniAnt(Set estrazioniAnt) {
/* 880 */     this.estrazioniAnt = estrazioniAnt;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinMovimento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */