/*      */ package it.ras.arco.bean;
/*      */ 
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import java.util.Date;
/*      */ import java.util.Set;
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
/*      */ public class FinSoggScheda
/*      */   extends RasORMBean
/*      */ {
/*      */   private Integer schedaId;
/*      */   private String docRischiFinB;
/*      */   private String profiloRiscB;
/*      */   private String esperienzaFinT;
/*      */   private String situazioneFinT;
/*      */   private String obiettivoInvestT;
/*      */   private String propenRiscT;
/*      */   private String propenRiscCalcT;
/*      */   private String classeRischioS;
/*      */   private Date dataSottRisD;
/*      */   private String banca1S;
/*      */   private String banca2S;
/*      */   private String filiale1S;
/*      */   private String filiale2S;
/*      */   private String indicEvolutFinT;
/*      */   private String infoSituazEcoS;
/*      */   private String codSiaB;
/*      */   private String numSiaS;
/*      */   private String numDipendS;
/*      */   private String servCbiB;
/*      */   private String ridCbiB;
/*      */   private String statoPpB;
/*      */   private String settoreAttivitaT;
/*      */   private String dimensioneAziendaT;
/*      */   private String luogoS;
/*      */   private String pressoS;
/*      */   private String infoAggS;
/*      */   private String infoAggAttivS;
/*      */   private String mezziPagS;
/*      */   private String tipoProdS;
/*      */   private String tipoServS;
/*      */   private String proprietaT;
/*      */   private String altriInvestS;
/*      */   private String indicFinanziariT;
/*      */   private String situazPatrimT;
/*      */   private String nfigliS;
/*      */   private String coerenzaProfiloT;
/*      */   private String tipoContattoT;
/*      */   private String affidabilitaContT;
/*      */   private String contattoT;
/*      */   private String dipendenteGruppoB;
/*      */   private String anzianitaGruppoS;
/*      */   private String titoloStudioS;
/*      */   private String professioneS;
/*      */   private String statoCivileT;
/*      */   private String regimePatrimT;
/*      */   private String npersCaricoS;
/*      */   private String nredditiS;
/*      */   private String redditoS;
/*      */   private String noteS;
/*      */   private String segmentoT;
/*      */   private String fasciaPatrimS;
/*      */   private String interessiT;
/*      */   private String tecnologieT;
/*      */   private String fontiInfoT;
/*      */   private String flagLastB;
/*      */   private String attivaB;
/*      */   private String investimentiGruppo;
/*      */   private String tipoRapporto;
/*      */   private String capacitaRisparmioAnnuo;
/*      */   private String consegnaRegole;
/*      */   private String flagPromotoreRiferimento;
/*      */   private Date dataInizioValidita;
/*      */   private Date dataFineValidita;
/*      */   private Date dataRegistrazione;
/*      */   private String codiceUtente;
/*      */   private String codiceSocieta;
/*      */   private Date dataInserimento;
/*      */   private String utenteInserimento;
/*      */   private FinPromotore promotore;
/*      */   private FinSoggetto soggetto;
/*      */   private String infoProfiloRiscB;
/*      */   private Set indirizzo;
/*      */   
/*      */   public FinSoggScheda(String contT, String investS, String gruppoS, String attivab, String banca1s, String banca2s, String rischioS, String siaB, String profiloT, String contattot, Date inserimento, Date risD, String aziendaT, String gruppoB, String finB, String finT, String patrimS, String filiale1s, String filiale2s, String lastB, String infoT, String finT2, String finanziariT, String attivS, String aggS, String ecoS, String interessit, String luogos, String pagS, String nfiglis, String notes, String caricoS, String nredditis, String dipendS, String siaS, String investT, String pressos, String professiones, String riscB, FinPromotore promotore, String calcT, String riscT, String proprietat, String redditos, String patrimT, String cbiB, String segmentot, String cbiB2, String attivitaT, String finT3, String patrimT2, FinSoggetto soggetto, String civileT, String ppB, String tecnologiet, String contattoT2, String prodS, String servS, String studioS, String inserimento2, Set indirizzo) {
/*  299 */     this.affidabilitaContT = contT;
/*  300 */     this.altriInvestS = investS;
/*  301 */     this.anzianitaGruppoS = gruppoS;
/*  302 */     this.attivaB = attivab;
/*  303 */     this.banca1S = banca1s;
/*  304 */     this.banca2S = banca2s;
/*  305 */     this.classeRischioS = rischioS;
/*  306 */     this.codSiaB = siaB;
/*  307 */     this.coerenzaProfiloT = profiloT;
/*  308 */     this.contattoT = contattot;
/*  309 */     this.dataInserimento = inserimento;
/*  310 */     this.dataSottRisD = risD;
/*  311 */     this.dimensioneAziendaT = aziendaT;
/*  312 */     this.dipendenteGruppoB = gruppoB;
/*  313 */     this.docRischiFinB = finB;
/*  314 */     this.esperienzaFinT = finT;
/*  315 */     this.fasciaPatrimS = patrimS;
/*  316 */     this.filiale1S = filiale1s;
/*  317 */     this.filiale2S = filiale2s;
/*  318 */     this.flagLastB = lastB;
/*  319 */     this.fontiInfoT = infoT;
/*  320 */     this.indicEvolutFinT = finT2;
/*  321 */     this.indicFinanziariT = finanziariT;
/*  322 */     this.infoAggAttivS = attivS;
/*  323 */     this.infoAggS = aggS;
/*  324 */     this.infoSituazEcoS = ecoS;
/*  325 */     this.interessiT = interessit;
/*  326 */     this.luogoS = luogos;
/*  327 */     this.mezziPagS = pagS;
/*  328 */     this.nfigliS = nfiglis;
/*  329 */     this.noteS = notes;
/*  330 */     this.npersCaricoS = caricoS;
/*  331 */     this.nredditiS = nredditis;
/*  332 */     this.numDipendS = dipendS;
/*  333 */     this.numSiaS = siaS;
/*  334 */     this.obiettivoInvestT = investT;
/*  335 */     this.pressoS = pressos;
/*  336 */     this.professioneS = professiones;
/*  337 */     this.profiloRiscB = riscB;
/*  338 */     this.promotore = promotore;
/*  339 */     this.propenRiscCalcT = calcT;
/*  340 */     this.propenRiscT = riscT;
/*  341 */     this.proprietaT = proprietat;
/*  342 */     this.redditoS = redditos;
/*  343 */     this.regimePatrimT = patrimT;
/*  344 */     this.ridCbiB = cbiB;
/*  345 */     this.segmentoT = segmentot;
/*  346 */     this.servCbiB = cbiB2;
/*  347 */     this.settoreAttivitaT = attivitaT;
/*  348 */     this.situazioneFinT = finT3;
/*  349 */     this.situazPatrimT = patrimT2;
/*  350 */     this.soggetto = soggetto;
/*  351 */     this.statoCivileT = civileT;
/*  352 */     this.statoPpB = ppB;
/*  353 */     this.tecnologieT = tecnologiet;
/*  354 */     this.tipoContattoT = contattoT2;
/*  355 */     this.tipoProdS = prodS;
/*  356 */     this.tipoServS = servS;
/*  357 */     this.titoloStudioS = studioS;
/*  358 */     this.utenteInserimento = inserimento2;
/*  359 */     this.indirizzo = indirizzo;
/*      */   }
/*      */ 
/*      */   
/*      */   public FinSoggScheda() {}
/*      */ 
/*      */   
/*      */   public Integer getSchedaId() {
/*  367 */     return this.schedaId;
/*      */   }
/*      */   
/*      */   public void setSchedaId(Integer schedaId) {
/*  371 */     this.schedaId = schedaId;
/*      */   }
/*      */   
/*      */   public FinSoggetto getSoggetto() {
/*  375 */     return this.soggetto;
/*      */   }
/*      */   
/*      */   public void setSoggetto(FinSoggetto soggettoId) {
/*  379 */     this.soggetto = soggettoId;
/*      */   }
/*      */   
/*      */   public FinPromotore getPromotore() {
/*  383 */     return this.promotore;
/*      */   }
/*      */   
/*      */   public void setPromotore(FinPromotore promotoreId) {
/*  387 */     this.promotore = promotoreId;
/*      */   }
/*      */   
/*      */   public String getDocRischiFinB() {
/*  391 */     return this.docRischiFinB;
/*      */   }
/*      */   
/*      */   public void setDocRischiFinB(String docRischiFinB) {
/*  395 */     this.docRischiFinB = docRischiFinB;
/*      */   }
/*      */   
/*      */   public String getProfiloRiscB() {
/*  399 */     return this.profiloRiscB;
/*      */   }
/*      */   
/*      */   public void setProfiloRiscB(String profiloRiscB) {
/*  403 */     this.profiloRiscB = profiloRiscB;
/*      */   }
/*      */   
/*      */   public String getEsperienzaFinT() {
/*  407 */     return this.esperienzaFinT;
/*      */   }
/*      */   
/*      */   public void setEsperienzaFinT(String esperienzaFinT) {
/*  411 */     this.esperienzaFinT = esperienzaFinT;
/*      */   }
/*      */   
/*      */   public String getSituazioneFinT() {
/*  415 */     return this.situazioneFinT;
/*      */   }
/*      */   
/*      */   public void setSituazioneFinT(String situazioneFinT) {
/*  419 */     this.situazioneFinT = situazioneFinT;
/*      */   }
/*      */   
/*      */   public String getObiettivoInvestT() {
/*  423 */     return this.obiettivoInvestT;
/*      */   }
/*      */   
/*      */   public void setObiettivoInvestT(String obiettivoInvestT) {
/*  427 */     this.obiettivoInvestT = obiettivoInvestT;
/*      */   }
/*      */   
/*      */   public String getPropenRiscT() {
/*  431 */     return this.propenRiscT;
/*      */   }
/*      */   
/*      */   public void setPropenRiscT(String propenRiscT) {
/*  435 */     this.propenRiscT = propenRiscT;
/*      */   }
/*      */   
/*      */   public String getPropenRiscCalcT() {
/*  439 */     return this.propenRiscCalcT;
/*      */   }
/*      */   
/*      */   public void setPropenRiscCalcT(String propenRiscCalcT) {
/*  443 */     this.propenRiscCalcT = propenRiscCalcT;
/*      */   }
/*      */   
/*      */   public String getClasseRischioS() {
/*  447 */     return this.classeRischioS;
/*      */   }
/*      */   
/*      */   public void setClasseRischioS(String classeRischioS) {
/*  451 */     this.classeRischioS = classeRischioS;
/*      */   }
/*      */   
/*      */   public Date getDataSottRisD() {
/*  455 */     return this.dataSottRisD;
/*      */   }
/*      */   
/*      */   public void setDataSottRisD(Date dataSottRisD) {
/*  459 */     this.dataSottRisD = dataSottRisD;
/*      */   }
/*      */   
/*      */   public String getBanca1S() {
/*  463 */     return this.banca1S;
/*      */   }
/*      */   
/*      */   public void setBanca1S(String banca1S) {
/*  467 */     this.banca1S = banca1S;
/*      */   }
/*      */   
/*      */   public String getBanca2S() {
/*  471 */     return this.banca2S;
/*      */   }
/*      */   
/*      */   public void setBanca2S(String banca2S) {
/*  475 */     this.banca2S = banca2S;
/*      */   }
/*      */   
/*      */   public String getFiliale1S() {
/*  479 */     return this.filiale1S;
/*      */   }
/*      */   
/*      */   public void setFiliale1S(String filiale1S) {
/*  483 */     this.filiale1S = filiale1S;
/*      */   }
/*      */   
/*      */   public String getFiliale2S() {
/*  487 */     return this.filiale2S;
/*      */   }
/*      */   
/*      */   public void setFiliale2S(String filiale2S) {
/*  491 */     this.filiale2S = filiale2S;
/*      */   }
/*      */   
/*      */   public String getIndicEvolutFinT() {
/*  495 */     return this.indicEvolutFinT;
/*      */   }
/*      */   
/*      */   public void setIndicEvolutFinT(String indicEvolutFinT) {
/*  499 */     this.indicEvolutFinT = indicEvolutFinT;
/*      */   }
/*      */   
/*      */   public String getInfoSituazEcoS() {
/*  503 */     return this.infoSituazEcoS;
/*      */   }
/*      */   
/*      */   public void setInfoSituazEcoS(String infoSituazEcoS) {
/*  507 */     this.infoSituazEcoS = infoSituazEcoS;
/*      */   }
/*      */   
/*      */   public String getCodSiaB() {
/*  511 */     return this.codSiaB;
/*      */   }
/*      */   
/*      */   public void setCodSiaB(String codSiaB) {
/*  515 */     this.codSiaB = codSiaB;
/*      */   }
/*      */   
/*      */   public String getNumSiaS() {
/*  519 */     return this.numSiaS;
/*      */   }
/*      */   
/*      */   public void setNumSiaS(String numSiaS) {
/*  523 */     this.numSiaS = numSiaS;
/*      */   }
/*      */   
/*      */   public String getNumDipendS() {
/*  527 */     return this.numDipendS;
/*      */   }
/*      */   
/*      */   public void setNumDipendS(String numDipendS) {
/*  531 */     this.numDipendS = numDipendS;
/*      */   }
/*      */   
/*      */   public String getServCbiB() {
/*  535 */     return this.servCbiB;
/*      */   }
/*      */   
/*      */   public void setServCbiB(String servCbiB) {
/*  539 */     this.servCbiB = servCbiB;
/*      */   }
/*      */   
/*      */   public String getRidCbiB() {
/*  543 */     return this.ridCbiB;
/*      */   }
/*      */   
/*      */   public void setRidCbiB(String ridCbiB) {
/*  547 */     this.ridCbiB = ridCbiB;
/*      */   }
/*      */   
/*      */   public String getStatoPpB() {
/*  551 */     return this.statoPpB;
/*      */   }
/*      */   
/*      */   public void setStatoPpB(String statoPpB) {
/*  555 */     this.statoPpB = statoPpB;
/*      */   }
/*      */   
/*      */   public String getSettoreAttivitaT() {
/*  559 */     return this.settoreAttivitaT;
/*      */   }
/*      */   
/*      */   public void setSettoreAttivitaT(String settoreAttivitaT) {
/*  563 */     this.settoreAttivitaT = settoreAttivitaT;
/*      */   }
/*      */   
/*      */   public String getDimensioneAziendaT() {
/*  567 */     return this.dimensioneAziendaT;
/*      */   }
/*      */   
/*      */   public void setDimensioneAziendaT(String dimensioneAziendaT) {
/*  571 */     this.dimensioneAziendaT = dimensioneAziendaT;
/*      */   }
/*      */   
/*      */   public String getLuogoS() {
/*  575 */     return this.luogoS;
/*      */   }
/*      */   
/*      */   public void setLuogoS(String luogoS) {
/*  579 */     this.luogoS = luogoS;
/*      */   }
/*      */   
/*      */   public String getPressoS() {
/*  583 */     return this.pressoS;
/*      */   }
/*      */   
/*      */   public void setPressoS(String pressoS) {
/*  587 */     this.pressoS = pressoS;
/*      */   }
/*      */   
/*      */   public String getInfoAggS() {
/*  591 */     return this.infoAggS;
/*      */   }
/*      */   
/*      */   public void setInfoAggS(String infoAggS) {
/*  595 */     this.infoAggS = infoAggS;
/*      */   }
/*      */   
/*      */   public String getInfoAggAttivS() {
/*  599 */     return this.infoAggAttivS;
/*      */   }
/*      */   
/*      */   public void setInfoAggAttivS(String infoAggAttivS) {
/*  603 */     this.infoAggAttivS = infoAggAttivS;
/*      */   }
/*      */   
/*      */   public String getMezziPagS() {
/*  607 */     return this.mezziPagS;
/*      */   }
/*      */   
/*      */   public void setMezziPagS(String mezziPagS) {
/*  611 */     this.mezziPagS = mezziPagS;
/*      */   }
/*      */   
/*      */   public String getTipoProdS() {
/*  615 */     return this.tipoProdS;
/*      */   }
/*      */   
/*      */   public void setTipoProdS(String tipoProdS) {
/*  619 */     this.tipoProdS = tipoProdS;
/*      */   }
/*      */   
/*      */   public String getTipoServS() {
/*  623 */     return this.tipoServS;
/*      */   }
/*      */   
/*      */   public void setTipoServS(String tipoServS) {
/*  627 */     this.tipoServS = tipoServS;
/*      */   }
/*      */   
/*      */   public String getProprietaT() {
/*  631 */     return this.proprietaT;
/*      */   }
/*      */   
/*      */   public void setProprietaT(String proprietaT) {
/*  635 */     this.proprietaT = proprietaT;
/*      */   }
/*      */   
/*      */   public String getAltriInvestS() {
/*  639 */     return this.altriInvestS;
/*      */   }
/*      */   
/*      */   public void setAltriInvestS(String altriInvestS) {
/*  643 */     this.altriInvestS = altriInvestS;
/*      */   }
/*      */   
/*      */   public String getIndicFinanziariT() {
/*  647 */     return this.indicFinanziariT;
/*      */   }
/*      */   
/*      */   public void setIndicFinanziariT(String indicFinanziariT) {
/*  651 */     this.indicFinanziariT = indicFinanziariT;
/*      */   }
/*      */   
/*      */   public String getSituazPatrimT() {
/*  655 */     return this.situazPatrimT;
/*      */   }
/*      */   
/*      */   public String getNfigliS() {
/*  659 */     return this.nfigliS;
/*      */   }
/*      */   
/*      */   public void setNfigliS(String nfigliS) {
/*  663 */     this.nfigliS = nfigliS;
/*      */   }
/*      */   
/*      */   public void setSituazPatrimT(String situazPatrimT) {
/*  667 */     this.situazPatrimT = situazPatrimT;
/*      */   }
/*      */   
/*      */   public String getCoerenzaProfiloT() {
/*  671 */     return this.coerenzaProfiloT;
/*      */   }
/*      */   
/*      */   public void setCoerenzaProfiloT(String coerenzaProfiloT) {
/*  675 */     this.coerenzaProfiloT = coerenzaProfiloT;
/*      */   }
/*      */   
/*      */   public String getTipoContattoT() {
/*  679 */     return this.tipoContattoT;
/*      */   }
/*      */   
/*      */   public void setTipoContattoT(String tipoContattoT) {
/*  683 */     this.tipoContattoT = tipoContattoT;
/*      */   }
/*      */   
/*      */   public String getAffidabilitaContT() {
/*  687 */     return this.affidabilitaContT;
/*      */   }
/*      */   
/*      */   public void setAffidabilitaContT(String affidabilitaContT) {
/*  691 */     this.affidabilitaContT = affidabilitaContT;
/*      */   }
/*      */   
/*      */   public String getContattoT() {
/*  695 */     return this.contattoT;
/*      */   }
/*      */   
/*      */   public void setContattoT(String contattoT) {
/*  699 */     this.contattoT = contattoT;
/*      */   }
/*      */   
/*      */   public String getDipendenteGruppoB() {
/*  703 */     return this.dipendenteGruppoB;
/*      */   }
/*      */   
/*      */   public void setDipendenteGruppoB(String dipendenteGruppoB) {
/*  707 */     this.dipendenteGruppoB = dipendenteGruppoB;
/*      */   }
/*      */   
/*      */   public String getAnzianitaGruppoS() {
/*  711 */     return this.anzianitaGruppoS;
/*      */   }
/*      */   
/*      */   public void setAnzianitaGruppoS(String anzianitaGruppoS) {
/*  715 */     this.anzianitaGruppoS = anzianitaGruppoS;
/*      */   }
/*      */   
/*      */   public String getTitoloStudioS() {
/*  719 */     return this.titoloStudioS;
/*      */   }
/*      */   
/*      */   public void setTitoloStudioS(String titoloStudioS) {
/*  723 */     this.titoloStudioS = titoloStudioS;
/*      */   }
/*      */   
/*      */   public String getProfessioneS() {
/*  727 */     return this.professioneS;
/*      */   }
/*      */   
/*      */   public void setProfessioneS(String professioneS) {
/*  731 */     this.professioneS = professioneS;
/*      */   }
/*      */   
/*      */   public String getStatoCivileT() {
/*  735 */     return this.statoCivileT;
/*      */   }
/*      */   
/*      */   public void setStatoCivileT(String statoCivileT) {
/*  739 */     this.statoCivileT = statoCivileT;
/*      */   }
/*      */   
/*      */   public String getRegimePatrimT() {
/*  743 */     return this.regimePatrimT;
/*      */   }
/*      */   
/*      */   public void setRegimePatrimT(String regimePatrimT) {
/*  747 */     this.regimePatrimT = regimePatrimT;
/*      */   }
/*      */   
/*      */   public String getNpersCaricoS() {
/*  751 */     return this.npersCaricoS;
/*      */   }
/*      */   
/*      */   public void setNpersCaricoS(String npersCaricoS) {
/*  755 */     this.npersCaricoS = npersCaricoS;
/*      */   }
/*      */   
/*      */   public String getNredditiS() {
/*  759 */     return this.nredditiS;
/*      */   }
/*      */   
/*      */   public void setNredditiS(String nredditiS) {
/*  763 */     this.nredditiS = nredditiS;
/*      */   }
/*      */   
/*      */   public String getRedditoS() {
/*  767 */     return this.redditoS;
/*      */   }
/*      */   
/*      */   public void setRedditoS(String redditoS) {
/*  771 */     this.redditoS = redditoS;
/*      */   }
/*      */   
/*      */   public String getNoteS() {
/*  775 */     return this.noteS;
/*      */   }
/*      */   
/*      */   public void setNoteS(String noteS) {
/*  779 */     this.noteS = noteS;
/*      */   }
/*      */   
/*      */   public String getSegmentoT() {
/*  783 */     return this.segmentoT;
/*      */   }
/*      */   
/*      */   public void setSegmentoT(String segmentoT) {
/*  787 */     this.segmentoT = segmentoT;
/*      */   }
/*      */   
/*      */   public String getFasciaPatrimS() {
/*  791 */     return this.fasciaPatrimS;
/*      */   }
/*      */   
/*      */   public void setFasciaPatrimS(String fasciaPatrimS) {
/*  795 */     this.fasciaPatrimS = fasciaPatrimS;
/*      */   }
/*      */   
/*      */   public String getInteressiT() {
/*  799 */     return this.interessiT;
/*      */   }
/*      */   
/*      */   public void setInteressiT(String interessiT) {
/*  803 */     this.interessiT = interessiT;
/*      */   }
/*      */   
/*      */   public String getTecnologieT() {
/*  807 */     return this.tecnologieT;
/*      */   }
/*      */   
/*      */   public void setTecnologieT(String tecnologieT) {
/*  811 */     this.tecnologieT = tecnologieT;
/*      */   }
/*      */   
/*      */   public String getFontiInfoT() {
/*  815 */     return this.fontiInfoT;
/*      */   }
/*      */   
/*      */   public void setFontiInfoT(String fontiInfoT) {
/*  819 */     this.fontiInfoT = fontiInfoT;
/*      */   }
/*      */   
/*      */   public String getFlagLastB() {
/*  823 */     return this.flagLastB;
/*      */   }
/*      */   
/*      */   public void setFlagLastB(String flagLastB) {
/*  827 */     this.flagLastB = flagLastB;
/*      */   }
/*      */   
/*      */   public String getAttivaB() {
/*  831 */     return this.attivaB;
/*      */   }
/*      */   
/*      */   public void setAttivaB(String attivaB) {
/*  835 */     this.attivaB = attivaB;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String toString() {
/*  842 */     return (new ToStringBuilder(this)).append("schedaId", getSchedaId()).toString();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Date getDataInserimento() {
/*  851 */     return this.dataInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setDataInserimento(Date dataInserimento) {
/*  858 */     this.dataInserimento = dataInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUtenteInserimento() {
/*  865 */     return this.utenteInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setUtenteInserimento(String utenteInserimento) {
/*  872 */     this.utenteInserimento = utenteInserimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getInfoProfiloRiscB() {
/*  879 */     return this.infoProfiloRiscB;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setInfoProfiloRiscB(String infoProfiloRiscB) {
/*  885 */     this.infoProfiloRiscB = infoProfiloRiscB;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Set getIndirizzo() {
/*  892 */     return this.indirizzo;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public void setIndirizzo(Set indirizzo) {
/*  898 */     this.indirizzo = indirizzo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getCapacitaRisparmioAnnuo() {
/*  905 */     return this.capacitaRisparmioAnnuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setCapacitaRisparmioAnnuo(String capacitaRisparmioAnnuo) {
/*  912 */     this.capacitaRisparmioAnnuo = capacitaRisparmioAnnuo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getInvestimentiGruppo() {
/*  919 */     return this.investimentiGruppo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setInvestimentiGruppo(String investimentiGruppo) {
/*  926 */     this.investimentiGruppo = investimentiGruppo;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getTipoRapporto() {
/*  933 */     return this.tipoRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setTipoRapporto(String tipoRapporto) {
/*  940 */     this.tipoRapporto = tipoRapporto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getConsegnaRegole() {
/*  947 */     return this.consegnaRegole;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void setConsegnaRegole(String consegnaRegole) {
/*  954 */     this.consegnaRegole = consegnaRegole;
/*      */   }
/*      */   
/*      */   public String getCodiceSocieta() {
/*  958 */     return this.codiceSocieta;
/*      */   }
/*      */   
/*      */   public void setCodiceSocieta(String codiceSocieta) {
/*  962 */     this.codiceSocieta = codiceSocieta;
/*      */   }
/*      */   
/*      */   public String getCodiceUtente() {
/*  966 */     return this.codiceUtente;
/*      */   }
/*      */   
/*      */   public void setCodiceUtente(String codiceUtente) {
/*  970 */     this.codiceUtente = codiceUtente;
/*      */   }
/*      */   
/*      */   public Date getDataFineValidita() {
/*  974 */     return this.dataFineValidita;
/*      */   }
/*      */   
/*      */   public void setDataFineValidita(Date dataFineValidita) {
/*  978 */     this.dataFineValidita = dataFineValidita;
/*      */   }
/*      */   
/*      */   public Date getDataInizioValidita() {
/*  982 */     return this.dataInizioValidita;
/*      */   }
/*      */   
/*      */   public void setDataInizioValidita(Date dataInizioValidita) {
/*  986 */     this.dataInizioValidita = dataInizioValidita;
/*      */   }
/*      */   
/*      */   public Date getDataRegistrazione() {
/*  990 */     return this.dataRegistrazione;
/*      */   }
/*      */   
/*      */   public void setDataRegistrazione(Date dataRegistrazione) {
/*  994 */     this.dataRegistrazione = dataRegistrazione;
/*      */   }
/*      */   
/*      */   public String getFlagPromotoreRiferimento() {
/*  998 */     return this.flagPromotoreRiferimento;
/*      */   }
/*      */   
/*      */   public void setFlagPromotoreRiferimento(String flagPromotoreRiferimento) {
/* 1002 */     this.flagPromotoreRiferimento = flagPromotoreRiferimento;
/*      */   }
/*      */   
/*      */   public FinSoggScheda copyFields(FinSoggScheda soggSche) {
/* 1006 */     this.affidabilitaContT = soggSche.getAffidabilitaContT();
/* 1007 */     this.altriInvestS = soggSche.getAltriInvestS();
/* 1008 */     this.anzianitaGruppoS = soggSche.getAnzianitaGruppoS();
/* 1009 */     this.attivaB = soggSche.getAttivaB();
/* 1010 */     this.banca1S = soggSche.getBanca1S();
/* 1011 */     this.banca2S = soggSche.getBanca2S();
/* 1012 */     this.capacitaRisparmioAnnuo = soggSche.getCapacitaRisparmioAnnuo();
/* 1013 */     this.classeRischioS = soggSche.getClasseRischioS();
/* 1014 */     this.codiceSocieta = soggSche.getCodiceSocieta();
/* 1015 */     this.codiceUtente = soggSche.getCodiceUtente();
/* 1016 */     this.codSiaB = soggSche.getCodSiaB();
/* 1017 */     this.coerenzaProfiloT = soggSche.getCoerenzaProfiloT();
/* 1018 */     this.consegnaRegole = soggSche.getConsegnaRegole();
/* 1019 */     this.contattoT = soggSche.getContattoT();
/* 1020 */     this.dataFineValidita = soggSche.getDataFineValidita();
/* 1021 */     this.dataInizioValidita = soggSche.getDataInizioValidita();
/* 1022 */     this.dataInserimento = soggSche.getDataInserimento();
/* 1023 */     this.dataRegistrazione = soggSche.getDataRegistrazione();
/* 1024 */     this.dataSottRisD = soggSche.getDataSottRisD();
/* 1025 */     this.dimensioneAziendaT = soggSche.getDimensioneAziendaT();
/* 1026 */     this.dipendenteGruppoB = soggSche.getDipendenteGruppoB();
/* 1027 */     this.docRischiFinB = soggSche.getDocRischiFinB();
/* 1028 */     this.esperienzaFinT = soggSche.getEsperienzaFinT();
/* 1029 */     this.fasciaPatrimS = soggSche.getFasciaPatrimS();
/* 1030 */     this.filiale1S = soggSche.getFiliale1S();
/* 1031 */     this.filiale2S = soggSche.getFiliale2S();
/* 1032 */     this.flagLastB = soggSche.getFlagLastB();
/* 1033 */     this.flagPromotoreRiferimento = soggSche.getFlagPromotoreRiferimento();
/* 1034 */     this.fontiInfoT = soggSche.getFontiInfoT();
/* 1035 */     this.indicEvolutFinT = soggSche.getIndicEvolutFinT();
/* 1036 */     this.indicFinanziariT = soggSche.getIndicFinanziariT();
/* 1037 */     this.indirizzo = soggSche.getIndirizzo();
/* 1038 */     this.infoAggAttivS = soggSche.getInfoAggAttivS();
/* 1039 */     this.infoAggS = soggSche.getInfoAggS();
/* 1040 */     this.infoProfiloRiscB = soggSche.getInfoProfiloRiscB();
/* 1041 */     this.infoSituazEcoS = soggSche.getInfoSituazEcoS();
/* 1042 */     this.interessiT = soggSche.getInteressiT();
/* 1043 */     this.investimentiGruppo = soggSche.getInvestimentiGruppo();
/* 1044 */     this.luogoS = soggSche.getLuogoS();
/* 1045 */     this.mezziPagS = soggSche.getMezziPagS();
/* 1046 */     this.nfigliS = soggSche.getNfigliS();
/* 1047 */     this.noteS = soggSche.getNoteS();
/* 1048 */     this.npersCaricoS = soggSche.getNpersCaricoS();
/* 1049 */     this.nredditiS = soggSche.getNredditiS();
/* 1050 */     this.numDipendS = soggSche.getNumDipendS();
/* 1051 */     this.numSiaS = soggSche.getNumSiaS();
/* 1052 */     this.obiettivoInvestT = soggSche.getObiettivoInvestT();
/* 1053 */     this.pressoS = soggSche.getPressoS();
/* 1054 */     this.professioneS = soggSche.getProfessioneS();
/* 1055 */     this.profiloRiscB = soggSche.getProfiloRiscB();
/* 1056 */     this.promotore = soggSche.getPromotore();
/* 1057 */     this.propenRiscCalcT = soggSche.getPropenRiscCalcT();
/* 1058 */     this.propenRiscT = soggSche.getPropenRiscT();
/* 1059 */     this.proprietaT = soggSche.getProprietaT();
/* 1060 */     this.redditoS = soggSche.getRedditoS();
/* 1061 */     this.regimePatrimT = soggSche.getRegimePatrimT();
/* 1062 */     this.ridCbiB = soggSche.getRidCbiB();
/* 1063 */     this.segmentoT = soggSche.getSegmentoT();
/* 1064 */     this.servCbiB = soggSche.getServCbiB();
/* 1065 */     this.settoreAttivitaT = soggSche.getSettoreAttivitaT();
/* 1066 */     this.situazioneFinT = soggSche.getSituazioneFinT();
/* 1067 */     this.situazPatrimT = soggSche.getSituazPatrimT();
/* 1068 */     this.statoCivileT = soggSche.getStatoCivileT();
/* 1069 */     this.statoPpB = soggSche.getStatoPpB();
/* 1070 */     this.tecnologieT = soggSche.getTecnologieT();
/* 1071 */     this.tipoContattoT = soggSche.getTipoContattoT();
/* 1072 */     this.tipoProdS = soggSche.getTipoProdS();
/* 1073 */     this.tipoRapporto = soggSche.getTipoRapporto();
/* 1074 */     this.tipoServS = soggSche.getTipoServS();
/* 1075 */     this.titoloStudioS = soggSche.getTitoloStudioS();
/* 1076 */     this.utenteInserimento = soggSche.getUtenteInserimento();
/* 1077 */     this.dataUltimaModificaSlave = new Date();
/* 1078 */     this.flagEsistenza = "S";
/* 1079 */     this.proceduraUltimaModificaSlave = soggSche.getProceduraUltimaModificaSlave();
/* 1080 */     this.tipoUltimaModificaSlave = "U";
/* 1081 */     this.userUltimaModificaSlave = soggSche.getUserUltimaModificaSlave();
/* 1082 */     return this;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggScheda.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */