/*      */ package it.ras.arco.bean;
/*      */ 
/*      */ import java.util.Date;
/*      */ import java.util.Set;
/*      */ import org.apache.commons.lang.builder.EqualsBuilder;
/*      */ import org.apache.commons.lang.builder.HashCodeBuilder;
/*      */ import org.apache.commons.lang.builder.ToStringBuilder;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FinAttivitaFinanziaria
/*      */   extends FinAbstractParametrizedBean
/*      */ {
/*      */   private Integer attivitaFinId;
/*      */   private String codiceTit;
/*      */   private String codiceCad;
/*      */   private String codiceBanca;
/*      */   private String codiceMaf;
/*      */   private String tipoF;
/*      */   private String descrizione;
/*      */   private String descrizBreve;
/*      */   private String isin;
/*      */   private String classe;
/*      */   private String codTariffa;
/*      */   private String tariffa;
/*      */   private String livello;
/*      */   private String divisaQuot;
/*      */   private String divisaComp;
/*      */   private Date dataInizioComm;
/*      */   private Date dataFineComm;
/*      */   private Date dataUltRilMgt;
/*      */   private Date dataPrcRilMgt;
/*      */   private Date ultimoMeseElab;
/*      */   private Date dataPrimoRegolamento;
/*      */   private Date dataFineRegolamento;
/*      */   private Date dataInizio;
/*      */   private Date dataFine;
/*      */   private String trattato;
/*      */   private String codAttFinExt;
/*      */   private String nomeFile;
/*      */   private String benchmark;
/*      */   private String ctAssogestioni;
/*      */   private Integer classeRischio;
/*      */   private String visibilitaCP;
/*      */   private String gestioneArco;
/*      */   private String codMarket;
/*      */   private String var;
/*      */   private String paeseEmissione;
/*      */   private Date dataUltimoProspetto;
/*      */   private String note;
/*      */   private String censitaOnLine;
/*      */   private Integer commGestione;
/*      */   private String retroCommissioni;
/*      */   private String codiceCalendario;
/*      */   private Set prezzo;
/*      */   private Set prodotto;
/*      */   private FinUltPrezzo ultPrezzo;
/*      */   private Set ordine;
/*      */   private Set dettaglio;
/*      */   private String codiceAnt;
/*      */   private String sottotipo;
/*      */   private String settoreIndustriale;
/*      */   private String simboloPiazza;
/*      */   private Set listaBenchmark;
/*      */   private Set listaCedoleDividendi;
/*      */   private Set listaRating;
/*      */   private Set listaPortafoglioFondi;
/*      */   private Set listaRendimento;
/*      */   private Set listaCommissioni;
/*      */   private String descrizioneCad;
/*      */   private String compartoCad;
/*      */   private String codiceTitoloCad;
/*      */   private Set wpposizione;
/*      */   
/*      */   public Set getWpposizione() {
/*  200 */     return this.wpposizione;
/*      */   }
/*      */   
/*      */   public void setWpposizione(Set wpposizione) {
/*  204 */     this.wpposizione = wpposizione;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodiceTitoloCad() {
/*  209 */     return this.codiceTitoloCad;
/*      */   }
/*      */   
/*      */   public void setCodiceTitoloCad(String codiceTitoloCad) {
/*  213 */     this.codiceTitoloCad = codiceTitoloCad;
/*      */   }
/*      */   
/*      */   public String getCompartoCad() {
/*  217 */     return this.compartoCad;
/*      */   }
/*      */   
/*      */   public void setCompartoCad(String compartoCad) {
/*  221 */     this.compartoCad = compartoCad;
/*      */   }
/*      */   
/*      */   public String getDescrizioneCad() {
/*  225 */     return this.descrizioneCad;
/*      */   }
/*      */   
/*      */   public void setDescrizioneCad(String descrizioneCad) {
/*  229 */     this.descrizioneCad = descrizioneCad;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FinAttivitaFinanziaria(String codiceTit, String codiceCad, String codiceBanca, String tipoF, String codiceMaf, String descrizione, String descrizBreve, String isin, String classe, String codTariffa, String tariffa, String divisaQuot, Date dataUltRilMgt, Date dataPrcRilMgt, Date ultimoMeseElab, Date dataInizioComm, Date dataPrimoRegolamento, Date dataFineRegolamento, Date dataFineComm, Date dataInizio, Date dataFine, String trattato, String nomeFile, String benchmark, String ctAssogestioni, Integer classeRischio, String visibilitaCP, String codMarket, String var, String paeseEmissione, Date dataInserimento, String utenteInserimento, Date dataUltimoProspetto, String note, Integer commGestione, String retroCommissioni, Set prezzo, Set listaParametri, Set prodotto, FinUltPrezzo ultPrezzo, Set ordine, Set dettaglio, String sottotipo, String settoreIndustriale, String simboloPiazza) {
/*  249 */     this.codiceTit = codiceTit;
/*  250 */     this.codiceCad = codiceCad;
/*  251 */     this.codiceBanca = codiceBanca;
/*  252 */     this.tipoF = tipoF;
/*  253 */     this.codiceMaf = codiceMaf;
/*  254 */     this.descrizione = descrizione;
/*  255 */     this.descrizBreve = descrizBreve;
/*  256 */     this.isin = isin;
/*  257 */     this.classe = classe;
/*  258 */     this.codTariffa = codTariffa;
/*  259 */     this.tariffa = tariffa;
/*  260 */     this.divisaQuot = divisaQuot;
/*  261 */     this.dataUltRilMgt = dataUltRilMgt;
/*  262 */     this.dataPrcRilMgt = dataPrcRilMgt;
/*  263 */     this.ultimoMeseElab = ultimoMeseElab;
/*  264 */     this.dataInizio = dataInizio;
/*  265 */     this.dataFine = dataFine;
/*  266 */     this.trattato = trattato;
/*  267 */     this.ultPrezzo = ultPrezzo;
/*  268 */     this.nomeFile = nomeFile;
/*  269 */     this.var = var;
/*  270 */     this.paeseEmissione = paeseEmissione;
/*      */ 
/*      */     
/*  273 */     this.prodotto = prodotto;
/*  274 */     this.codiceBanca = codiceBanca;
/*  275 */     this.dataInizioComm = dataInizioComm;
/*  276 */     this.dataPrimoRegolamento = dataPrimoRegolamento;
/*  277 */     this.dataFineRegolamento = dataFineRegolamento;
/*  278 */     this.dataFineComm = dataFineComm;
/*  279 */     this.benchmark = benchmark;
/*  280 */     this.ctAssogestioni = ctAssogestioni;
/*  281 */     this.classeRischio = classeRischio;
/*  282 */     this.visibilitaCP = visibilitaCP;
/*  283 */     this.codMarket = codMarket;
/*  284 */     this.dataUltimoProspetto = dataUltimoProspetto;
/*  285 */     this.note = note;
/*  286 */     this.commGestione = commGestione;
/*  287 */     this.retroCommissioni = retroCommissioni;
/*  288 */     this.dettaglio = dettaglio;
/*  289 */     this.prezzo = prezzo;
/*  290 */     this.ordine = ordine;
/*      */     
/*  292 */     setListaParametri(listaParametri);
/*  293 */     this.sottotipo = sottotipo;
/*  294 */     this.settoreIndustriale = settoreIndustriale;
/*  295 */     this.simboloPiazza = simboloPiazza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FinAttivitaFinanziaria(Integer id, String benchmark, String line, String classe, Integer rischio, String ext, String ant, String banca, String cad, String calendario, String maf, String tit, String cad2, String market, String tariffa, Integer gestione, String cad3, String assogestioni, Date fine, Date comm, Date regolamento, Date inizio, Date comm2, Date mgt, Date regolamento2, Date prospetto, Date mgt2, String breve, String descrizione, String cad4, Set dettaglio, String comp, String quot, String arco, String isin, Set benchmark2, Set dividendi, Set commissioni, Set fondi, Set rating, Set rendimento, String livello, String file, String note, Set ordine, String emissione, Set prezzo, Set prodotto, String commissioni2, String industriale, String piazza, String sottotipo, String tariffa2, String tipof, String trattato, Date elab, FinUltPrezzo prezzo2, String var, String visibilitacp, Set wpposizione) {
/*  304 */     this.attivitaFinId = id;
/*  305 */     this.benchmark = benchmark;
/*  306 */     this.censitaOnLine = line;
/*  307 */     this.classe = classe;
/*  308 */     this.classeRischio = rischio;
/*  309 */     this.codAttFinExt = ext;
/*  310 */     this.codiceAnt = ant;
/*  311 */     this.codiceBanca = banca;
/*  312 */     this.codiceCad = cad;
/*  313 */     this.codiceCalendario = calendario;
/*  314 */     this.codiceMaf = maf;
/*  315 */     this.codiceTit = tit;
/*  316 */     this.codiceTitoloCad = cad2;
/*  317 */     this.codMarket = market;
/*  318 */     this.codTariffa = tariffa;
/*  319 */     this.commGestione = gestione;
/*  320 */     this.compartoCad = cad3;
/*  321 */     this.ctAssogestioni = assogestioni;
/*  322 */     this.dataFine = fine;
/*  323 */     this.dataFineComm = comm;
/*  324 */     this.dataFineRegolamento = regolamento;
/*  325 */     this.dataInizio = inizio;
/*  326 */     this.dataInizioComm = comm2;
/*  327 */     this.dataPrcRilMgt = mgt;
/*  328 */     this.dataPrimoRegolamento = regolamento2;
/*  329 */     this.dataUltimoProspetto = prospetto;
/*  330 */     this.dataUltRilMgt = mgt2;
/*  331 */     this.descrizBreve = breve;
/*  332 */     this.descrizione = descrizione;
/*  333 */     this.descrizioneCad = cad4;
/*  334 */     this.dettaglio = dettaglio;
/*  335 */     this.divisaComp = comp;
/*  336 */     this.divisaQuot = quot;
/*  337 */     this.gestioneArco = arco;
/*  338 */     this.isin = isin;
/*  339 */     this.listaBenchmark = benchmark2;
/*  340 */     this.listaCedoleDividendi = dividendi;
/*  341 */     this.listaCommissioni = commissioni;
/*  342 */     this.listaPortafoglioFondi = fondi;
/*  343 */     this.listaRating = rating;
/*  344 */     this.listaRendimento = rendimento;
/*  345 */     this.livello = livello;
/*  346 */     this.nomeFile = file;
/*  347 */     this.note = note;
/*  348 */     this.ordine = ordine;
/*  349 */     this.paeseEmissione = emissione;
/*  350 */     this.prezzo = prezzo;
/*  351 */     this.prodotto = prodotto;
/*  352 */     this.retroCommissioni = commissioni2;
/*  353 */     this.settoreIndustriale = industriale;
/*  354 */     this.simboloPiazza = piazza;
/*  355 */     this.sottotipo = sottotipo;
/*  356 */     tariffa = tariffa2;
/*  357 */     this.tipoF = tipof;
/*  358 */     this.trattato = trattato;
/*  359 */     this.ultimoMeseElab = elab;
/*  360 */     this.ultPrezzo = prezzo2;
/*  361 */     this.var = var;
/*  362 */     this.visibilitaCP = visibilitacp;
/*  363 */     this.wpposizione = wpposizione;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public FinAttivitaFinanziaria() {}
/*      */ 
/*      */   
/*      */   public FinAttivitaFinanziaria(Set prezzo) {
/*  372 */     this.prezzo = prezzo;
/*      */   }
/*      */   
/*      */   public Integer getAttivitaFinId() {
/*  376 */     return this.attivitaFinId;
/*      */   }
/*      */   
/*      */   public void setAttivitaFinId(Integer attivitaFinId) {
/*  380 */     this.attivitaFinId = attivitaFinId;
/*      */   }
/*      */   
/*      */   public String getCodiceBanca() {
/*  384 */     return this.codiceBanca;
/*      */   }
/*      */   
/*      */   public void setCodiceBanca(String codiceBanca) {
/*  388 */     this.codiceBanca = codiceBanca;
/*      */   }
/*      */   
/*      */   public String getNote() {
/*  392 */     return this.note;
/*      */   }
/*      */   
/*      */   public void setNote(String note) {
/*  396 */     this.note = note;
/*      */   }
/*      */   
/*      */   public Date getDataUltimoProspetto() {
/*  400 */     return this.dataUltimoProspetto;
/*      */   }
/*      */   
/*      */   public void setDataUltimoProspetto(Date dataUltimoProspetto) {
/*  404 */     this.dataUltimoProspetto = dataUltimoProspetto;
/*      */   }
/*      */   
/*      */   public Integer getCommGestione() {
/*  408 */     return this.commGestione;
/*      */   }
/*      */   
/*      */   public void setCommGestione(Integer commGestione) {
/*  412 */     this.commGestione = commGestione;
/*      */   }
/*      */   
/*      */   public String getRetroCommissioni() {
/*  416 */     return this.retroCommissioni;
/*      */   }
/*      */   
/*      */   public void setRetroCommissioni(String retroCommissioni) {
/*  420 */     this.retroCommissioni = retroCommissioni;
/*      */   }
/*      */   
/*      */   public String getVisibilitaCP() {
/*  424 */     return this.visibilitaCP;
/*      */   }
/*      */   
/*      */   public void setVisibilitaCP(String visibilitaCP) {
/*  428 */     this.visibilitaCP = visibilitaCP;
/*      */   }
/*      */   
/*      */   public String getCodiceTit() {
/*  432 */     return this.codiceTit;
/*      */   }
/*      */   
/*      */   public void setCodiceTit(String codiceTit) {
/*  436 */     this.codiceTit = codiceTit;
/*      */   }
/*      */   
/*      */   public String getCodiceMaf() {
/*  440 */     return this.codiceMaf;
/*      */   }
/*      */   
/*      */   public void setCodiceMaf(String codiceMaf) {
/*  444 */     this.codiceMaf = codiceMaf;
/*      */   }
/*      */   
/*      */   public String getCodiceCad() {
/*  448 */     return this.codiceCad;
/*      */   }
/*      */   
/*      */   public void setCodiceCad(String codiceCad) {
/*  452 */     this.codiceCad = codiceCad;
/*      */   }
/*      */   
/*      */   public String getTipoF() {
/*  456 */     return this.tipoF;
/*      */   }
/*      */   
/*      */   public void setTipoF(String tipoF) {
/*  460 */     this.tipoF = tipoF;
/*      */   }
/*      */   
/*      */   public String getDescrizione() {
/*  464 */     return this.descrizione;
/*      */   }
/*      */   
/*      */   public void setDescrizione(String descrizione) {
/*  468 */     this.descrizione = descrizione;
/*      */   }
/*      */   
/*      */   public String getDescrizBreve() {
/*  472 */     return this.descrizBreve;
/*      */   }
/*      */   
/*      */   public void setDescrizBreve(String descrizBreve) {
/*  476 */     this.descrizBreve = descrizBreve;
/*      */   }
/*      */   
/*      */   public String getIsin() {
/*  480 */     return this.isin;
/*      */   }
/*      */   
/*      */   public void setIsin(String isin) {
/*  484 */     this.isin = isin;
/*      */   }
/*      */   
/*      */   public String getClasse() {
/*  488 */     return this.classe;
/*      */   }
/*      */   
/*      */   public void setClasse(String classe) {
/*  492 */     this.classe = classe;
/*      */   }
/*      */   
/*      */   public String getCodTariffa() {
/*  496 */     return this.codTariffa;
/*      */   }
/*      */   
/*      */   public void setCodTariffa(String codTariffa) {
/*  500 */     this.codTariffa = codTariffa;
/*      */   }
/*      */   
/*      */   public String getTariffa() {
/*  504 */     return this.tariffa;
/*      */   }
/*      */   
/*      */   public void setTariffa(String tariffa) {
/*  508 */     this.tariffa = tariffa;
/*      */   }
/*      */   
/*      */   public String getLivello() {
/*  512 */     return this.livello;
/*      */   }
/*      */   
/*      */   public void setLivello(String livello) {
/*  516 */     this.livello = livello;
/*      */   }
/*      */   
/*      */   public String getDivisaQuot() {
/*  520 */     return this.divisaQuot;
/*      */   }
/*      */   
/*      */   public void setDivisaQuot(String divisaQuot) {
/*  524 */     this.divisaQuot = divisaQuot;
/*      */   }
/*      */   
/*      */   public String getDivisaComp() {
/*  528 */     return this.divisaComp;
/*      */   }
/*      */   
/*      */   public void setDivisaComp(String divisaComp) {
/*  532 */     this.divisaComp = divisaComp;
/*      */   }
/*      */   
/*      */   public Date getDataPrimoRegolamento() {
/*  536 */     return this.dataPrimoRegolamento;
/*      */   }
/*      */   
/*      */   public void setDataPrimoRegolamento(Date dataPrimoRegolamento) {
/*  540 */     this.dataPrimoRegolamento = dataPrimoRegolamento;
/*      */   }
/*      */   
/*      */   public Date getDataFineRegolamento() {
/*  544 */     return this.dataFineRegolamento;
/*      */   }
/*      */   
/*      */   public void setDataFineRegolamento(Date dataFineRegolamento) {
/*  548 */     this.dataFineRegolamento = dataFineRegolamento;
/*      */   }
/*      */   
/*      */   public Date getDataUltRilMgt() {
/*  552 */     return this.dataUltRilMgt;
/*      */   }
/*      */   
/*      */   public void setDataUltRilMgt(Date dataUltRilMgt) {
/*  556 */     this.dataUltRilMgt = dataUltRilMgt;
/*      */   }
/*      */   
/*      */   public Date getDataInizioComm() {
/*  560 */     return this.dataInizioComm;
/*      */   }
/*      */   
/*      */   public void setDataInizioComm(Date dataInizioComm) {
/*  564 */     this.dataInizioComm = dataInizioComm;
/*      */   }
/*      */   
/*      */   public Date getDataFineComm() {
/*  568 */     return this.dataFineComm;
/*      */   }
/*      */   
/*      */   public void setDataFineComm(Date dataFineComm) {
/*  572 */     this.dataFineComm = dataFineComm;
/*      */   }
/*      */   
/*      */   public Date getDataPrcRilMgt() {
/*  576 */     return this.dataPrcRilMgt;
/*      */   }
/*      */   
/*      */   public void setDataPrcRilMgt(Date dataPrcRilMgt) {
/*  580 */     this.dataPrcRilMgt = dataPrcRilMgt;
/*      */   }
/*      */   
/*      */   public Date getUltimoMeseElab() {
/*  584 */     return this.ultimoMeseElab;
/*      */   }
/*      */   
/*      */   public void setUltimoMeseElab(Date ultimoMeseElab) {
/*  588 */     this.ultimoMeseElab = ultimoMeseElab;
/*      */   }
/*      */   
/*      */   public Date getDataInizio() {
/*  592 */     return this.dataInizio;
/*      */   }
/*      */   
/*      */   public void setDataInizio(Date dataInizio) {
/*  596 */     this.dataInizio = dataInizio;
/*      */   }
/*      */   
/*      */   public Date getDataFine() {
/*  600 */     return this.dataFine;
/*      */   }
/*      */   
/*      */   public void setDataFine(Date dataFine) {
/*  604 */     this.dataFine = dataFine;
/*      */   }
/*      */   
/*      */   public String getTrattato() {
/*  608 */     return this.trattato;
/*      */   }
/*      */   
/*      */   public void setTrattato(String trattato) {
/*  612 */     this.trattato = trattato;
/*      */   }
/*      */   
/*      */   public String getCodAttFinExt() {
/*  616 */     return this.codAttFinExt;
/*      */   }
/*      */   
/*      */   public void setCodAttFinExt(String codAttFinExt) {
/*  620 */     this.codAttFinExt = codAttFinExt;
/*      */   }
/*      */   
/*      */   public String getNomeFile() {
/*  624 */     return this.nomeFile;
/*      */   }
/*      */   
/*      */   public void setNomeFile(String nomeFile) {
/*  628 */     this.nomeFile = nomeFile;
/*      */   }
/*      */   
/*      */   public String getVar() {
/*  632 */     return this.var;
/*      */   }
/*      */   
/*      */   public void setVar(String var) {
/*  636 */     this.var = var;
/*      */   }
/*      */   
/*      */   public String getPaeseEmissione() {
/*  640 */     return this.paeseEmissione;
/*      */   }
/*      */   
/*      */   public void setPaeseEmissione(String paeseEmissione) {
/*  644 */     this.paeseEmissione = paeseEmissione;
/*      */   }
/*      */   
/*      */   public String getBenchmark() {
/*  648 */     return this.benchmark;
/*      */   }
/*      */   
/*      */   public void setBenchmark(String benchmark) {
/*  652 */     this.benchmark = benchmark;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getClasseRischio() {
/*  657 */     return this.classeRischio;
/*      */   }
/*      */   
/*      */   public void setClasseRischio(Integer classeRischio) {
/*  661 */     this.classeRischio = classeRischio;
/*      */   }
/*      */   
/*      */   public String getCtAssogestioni() {
/*  665 */     return this.ctAssogestioni;
/*      */   }
/*      */   
/*      */   public void setCtAssogestioni(String ctAssogestioni) {
/*  669 */     this.ctAssogestioni = ctAssogestioni;
/*      */   }
/*      */   
/*      */   public String getCodMarket() {
/*  673 */     return this.codMarket;
/*      */   }
/*      */   
/*      */   public void setCodMarket(String codMarket) {
/*  677 */     this.codMarket = codMarket;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getProdotto() {
/*  693 */     return this.prodotto;
/*      */   }
/*      */   
/*      */   public void setProdotto(Set prodotto) {
/*  697 */     this.prodotto = prodotto;
/*      */   }
/*      */   
/*      */   public Set getPrezzo() {
/*  701 */     return this.prezzo;
/*      */   }
/*      */   
/*      */   public void setPrezzo(Set prezzo) {
/*  705 */     this.prezzo = prezzo;
/*      */   }
/*      */   
/*      */   public Set getOrdine() {
/*  709 */     return this.ordine;
/*      */   }
/*      */   
/*      */   public void setOrdine(Set ordine) {
/*  713 */     this.ordine = ordine;
/*      */   }
/*      */   
/*      */   public FinUltPrezzo getUltPrezzo() {
/*  717 */     return this.ultPrezzo;
/*      */   }
/*      */   
/*      */   public void setUltPrezzo(FinUltPrezzo ultPrezzo) {
/*  721 */     this.ultPrezzo = ultPrezzo;
/*      */   }
/*      */   
/*      */   public String toString() {
/*  725 */     return (new ToStringBuilder(this)).append("attivitaFinId", getAttivitaFinId()).toString();
/*      */   }
/*      */ 
/*      */   
/*      */   public boolean equals(Object obj) {
/*  730 */     if (!(obj instanceof FinAttivitaFinanziaria)) {
/*  731 */       return false;
/*      */     }
/*  733 */     if (this == obj) {
/*  734 */       return true;
/*      */     }
/*  736 */     FinAttivitaFinanziaria AttivitaFinanziaria = (FinAttivitaFinanziaria)obj;
/*  737 */     return (new EqualsBuilder()).append(this.codiceTit, AttivitaFinanziaria.codiceTit).append(this.codiceCad, AttivitaFinanziaria.codiceCad).append(this.codiceMaf, AttivitaFinanziaria.codiceMaf).append(this.descrizione, AttivitaFinanziaria.descrizione).append(this.descrizBreve, AttivitaFinanziaria.descrizBreve).append(this.isin, AttivitaFinanziaria.isin).append(this.classe, AttivitaFinanziaria.classe).append(this.codTariffa, AttivitaFinanziaria.codTariffa).append(this.tariffa, AttivitaFinanziaria.tariffa).append(this.livello, AttivitaFinanziaria.livello).append(this.dataUltRilMgt, AttivitaFinanziaria.dataUltRilMgt).append(this.dataPrcRilMgt, AttivitaFinanziaria.dataPrcRilMgt).append(this.ultimoMeseElab, AttivitaFinanziaria.ultimoMeseElab).append(this.dataInizio, AttivitaFinanziaria.dataInizio).append(this.dataFine, AttivitaFinanziaria.dataFine).append(this.trattato, AttivitaFinanziaria.trattato).append(this.nomeFile, AttivitaFinanziaria.nomeFile).append(this.var, AttivitaFinanziaria.var).append(this.paeseEmissione, AttivitaFinanziaria.paeseEmissione).append(this.benchmark, AttivitaFinanziaria.benchmark).append(this.classeRischio, AttivitaFinanziaria.classeRischio).append(this.ctAssogestioni, AttivitaFinanziaria.ctAssogestioni).append(this.visibilitaCP, AttivitaFinanziaria.visibilitaCP).append(this.codMarket, AttivitaFinanziaria.codMarket).isEquals();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public int hashCode() {
/*  774 */     return (new HashCodeBuilder(13, 37)).append(this.codiceTit).append(this.codiceCad).append(this.codiceMaf).append(this.descrizione).append(this.descrizBreve).append(this.isin).append(this.classe).append(this.codTariffa).append(this.tariffa).append(this.livello).append(this.dataUltRilMgt).append(this.dataPrcRilMgt).append(this.ultimoMeseElab).append(this.dataInizio).append(this.dataFine).append(this.trattato).append(this.nomeFile).append(this.var).append(this.paeseEmissione).append(this.benchmark).append(this.classeRischio).append(this.ctAssogestioni).toHashCode();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void accept(IGSTDInitVisitor visitor) {
/*  793 */     super.accept(visitor);
/*      */     
/*      */     try {
/*  796 */       if (getProdotto() != null && getProdotto().size() > 0) {
/*  797 */         visitor.visit(getProdotto().iterator().next());
/*      */       }
/*  799 */     } catch (Exception e) {}
/*      */ 
/*      */     
/*  802 */     if (getUltPrezzo() != null) {
/*  803 */       FinUltPrezzo element = getUltPrezzo();
/*  804 */       element.accept(visitor);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getDettaglio() {
/*  812 */     return this.dettaglio;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDettaglio(Set dettaglio) {
/*  820 */     this.dettaglio = dettaglio;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSettoreIndustriale() {
/*  827 */     return this.settoreIndustriale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSettoreIndustriale(String settoreIndustriale) {
/*  835 */     this.settoreIndustriale = settoreIndustriale;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSimboloPiazza() {
/*  842 */     return this.simboloPiazza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSimboloPiazza(String simboloPiazza) {
/*  850 */     this.simboloPiazza = simboloPiazza;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getSottotipo() {
/*  857 */     return this.sottotipo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setSottotipo(String sottotipo) {
/*  865 */     this.sottotipo = sottotipo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getListaBenchmark() {
/*  872 */     return this.listaBenchmark;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListaBenchmark(Set listaBenchmark) {
/*  880 */     this.listaBenchmark = listaBenchmark;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getListaCedoleDividendi() {
/*  887 */     return this.listaCedoleDividendi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListaCedoleDividendi(Set listaCedoleDividendi) {
/*  895 */     this.listaCedoleDividendi = listaCedoleDividendi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getListaCommissioni() {
/*  902 */     return this.listaCommissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListaCommissioni(Set listaCommissioni) {
/*  910 */     this.listaCommissioni = listaCommissioni;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getListaPortafoglioFondi() {
/*  917 */     return this.listaPortafoglioFondi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListaPortafoglioFondi(Set listaPortafoglioFondi) {
/*  925 */     this.listaPortafoglioFondi = listaPortafoglioFondi;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getListaRating() {
/*  932 */     return this.listaRating;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListaRating(Set listaRating) {
/*  940 */     this.listaRating = listaRating;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getListaRendimento() {
/*  947 */     return this.listaRendimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setListaRendimento(Set listaRendimento) {
/*  955 */     this.listaRendimento = listaRendimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCensitaOnLine() {
/*  962 */     return this.censitaOnLine;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCensitaOnLine(String censitaOnLine) {
/*  970 */     this.censitaOnLine = censitaOnLine;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceAnt() {
/*  977 */     return this.codiceAnt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceAnt(String codiceAnt) {
/*  985 */     this.codiceAnt = codiceAnt;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCodiceCalendario() {
/*  992 */     return this.codiceCalendario;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCodiceCalendario(String codiceCalendario) {
/* 1000 */     this.codiceCalendario = codiceCalendario;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getGestioneArco() {
/* 1007 */     return this.gestioneArco;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setGestioneArco(String gestioneArco) {
/* 1013 */     this.gestioneArco = gestioneArco;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAttivitaFinanziaria.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */