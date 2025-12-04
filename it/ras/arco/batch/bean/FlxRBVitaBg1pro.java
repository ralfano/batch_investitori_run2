/*      */ package it.ras.arco.batch.bean;
/*      */ 
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ import org.apache.commons.lang.builder.ToStringBuilder;
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FlxRBVitaBg1pro
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   private Integer flxId;
/*      */   private String tipoRecord;
/*      */   private String provPortafRas;
/*      */   private Date dtElab;
/*      */   private String compagnia;
/*      */   private String ramo;
/*      */   private String polizza;
/*      */   private String liberata;
/*      */   private String proposta;
/*      */   private String divisaIso;
/*      */   private Integer durCtr;
/*      */   private String codPfia;
/*      */   private String codFraz;
/*      */   private Double tassoFraz;
/*      */   private String codTrasf;
/*      */   private String polSost1;
/*      */   private String polSost2;
/*      */   private String polSost3;
/*      */   private String polSost4;
/*      */   private Date dtEmisCtr;
/*      */   private Date dtDecorCtr;
/*      */   private Date dtScaCtr;
/*      */   private Date dtUltRataPag;
/*      */   private Date dtUltRataInc;
/*      */   private Date dtDecRataSuc;
/*      */   private String codProdotto;
/*      */   private String descProdotto;
/*      */   private String codTariffa;
/*      */   private String descTariffa;
/*      */   private String tipoTariffa;
/*      */   private String descCompl;
/*      */   private Date dtInizPagPrem;
/*      */   private Date dtFinePagPrem;
/*      */   private String codStorno;
/*      */   private Date dtStorno;
/*      */   private String flagLiquidata;
/*      */   private String codTassaVita;
/*      */   private String codTassaCi;
/*      */   private String tipoInval;
/*      */   private Double pctInval;
/*      */   private String baseTecnica;
/*      */   private Double tassoTariffa;
/*      */   private Double impSovrapProf;
/*      */   private Double impSovrapSport;
/*      */   private Double impSovrapSanit;
/*      */   private Double impSovrapGener;
/*      */   private Double ultPrPagLor;
/*      */   private Double ultPrPagNet;
/*      */   private Double PrPagLorCi;
/*      */   private Double ultPrPagNetCi;
/*      */   private Double ultRataEmesLor;
/*      */   private Double ultRataEmesNet;
/*      */   private Double ultRataEmesLorCi;
/*      */   private Double ultRataEmesNetCi;
/*      */   private Double cumPrPagLor;
/*      */   private Double cumPrPagLorCi;
/*      */   private Double PrPagNet;
/*      */   private Double cumPrPagNetCi;
/*      */   private Double Perfez;
/*      */   private Double diritQuiet;
/*      */   private Double primoPrPag;
/*      */   private Double primoPrPagCi;
/*      */   private Double prestitoEsist;
/*      */   private Double capitMatuCa;
/*      */   private Double capitMatuCu;
/*      */   private Double capitMatuCi;
/*      */   private Double capitDiffer;
/*      */   private Double rendMaturaCa;
/*      */   private Double rendMaturaCu;
/*      */   private Double rendDiff;
/*      */   private Double partiValuta;
/*      */   private Double prestIniz;
/*      */   private Double indInizValuta;
/*      */   private String ul;
/*      */   private String prodotto;
/*      */   private String indirCorrispondenza;
/*      */   private String localitaCorrispondenza;
/*      */   private String capCorrispondenza;
/*      */   private String provCorrispondenza;
/*      */   private String nazioneCorrispondenza;
/*      */   private String codfiscContr;
/*      */   private String nomeAssic;
/*      */   private Date dtNascAssic;
/*      */   private Integer etaCompAssic;
/*      */   private String sessoAssic;
/*      */   private String codAgente;
/*      */   private String codSelfcheck;
/*      */   private String codRete;
/*      */   private String riassegnazione;
/*      */   private String codAgenteSplit;
/*      */   private String codAgenzia;
/*      */   private String numMand;
/*      */   private String stGiuCtr;
/*      */   private String compagniaSiag;
/*      */   private String polizzaSiag;
/*      */   private String ramoSiag;
/*      */   private String codAgenziaSiag;
/*      */   private Date dtRifRival;
/*      */   private Double cambioUltRatEme1;
/*      */   private Double cambioUltRatPag1;
/*      */   private Double cambioUltRatEme2;
/*      */   private Double cambioUltRatPag2;
/*      */   private Date dtUltRataEme;
/*      */   private Double pctRival;
/*      */   private Integer numVerProdo;
/*      */   private String statoElab;
/*      */   private String istanza;
/*      */   private Date dataCaricamento;
/*      */   
/*      */   public FlxRBVitaBg1pro(String tecnica, Double eme1, Double eme2, Double pag1, Double pag2, String corrispondenza, Double differ, Double ca, Double ci, Double cu, String agente, String split, String agenzia, String siag, String contr, String fraz, String pfia, String prodotto, String rete, String selfcheck, String storno, String tariffa, String ci2, String vita, String trasf, String compagnia, String siag2, Double lor, Double ci3, Double ci4, Date caricamento, String compl, String prodotto2, String tariffa2, Double quiet, String iso, Date ctr, Date suc, Date elab, Date ctr2, Date prem, Date prem2, Date assic, Date rival, Date ctr3, Date storno2, Date eme, Date inc, Date pag, Integer ctr4, Integer assic2, String liquidata, Integer id, Double gener, Double prof, Double sanit, Double sport, Double valuta, String corrispondenza2, String istanza, String liberata, String corrispondenza3, String corrispondenza4, String assic3, String mand, Integer prodo, Double valuta2, Double inval, Double rival2, Double perfez, String polizza, String siag3, String sost1, String sost2, String sost3, String sost4, Double iniz, Double esist, Double pag3, Double ci5, String prodotto3, String proposta, String corrispondenza5, String ras, Double ci6, Double net, String ramo, String siag4, Double diff, Double ca2, Double cu2, String riassegnazione, String assic4, String elab2, String ctr5, Double fraz2, Double tariffa3, String inval2, String record, String tariffa4, String ul, Double lor2, Double net2, Double ci7, Double lor3, Double ci8, Double net3, Double ci9) {
/*  124 */     this.baseTecnica = tecnica;
/*  125 */     this.cambioUltRatEme1 = eme1;
/*  126 */     this.cambioUltRatEme2 = eme2;
/*  127 */     this.cambioUltRatPag1 = pag1;
/*  128 */     this.cambioUltRatPag2 = pag2;
/*  129 */     this.capCorrispondenza = corrispondenza;
/*  130 */     this.capitDiffer = differ;
/*  131 */     this.capitMatuCa = ca;
/*  132 */     this.capitMatuCi = ci;
/*  133 */     this.capitMatuCu = cu;
/*  134 */     this.codAgente = agente;
/*  135 */     this.codAgenteSplit = split;
/*  136 */     this.codAgenzia = agenzia;
/*  137 */     this.codAgenziaSiag = siag;
/*  138 */     this.codfiscContr = contr;
/*  139 */     this.codFraz = fraz;
/*  140 */     this.codPfia = pfia;
/*  141 */     this.codProdotto = prodotto;
/*  142 */     this.codRete = rete;
/*  143 */     this.codSelfcheck = selfcheck;
/*  144 */     this.codStorno = storno;
/*  145 */     this.codTariffa = tariffa;
/*  146 */     this.codTassaCi = ci2;
/*  147 */     this.codTassaVita = vita;
/*  148 */     this.codTrasf = trasf;
/*  149 */     this.compagnia = compagnia;
/*  150 */     this.compagniaSiag = siag2;
/*  151 */     this.cumPrPagLor = lor;
/*  152 */     this.cumPrPagLorCi = ci3;
/*  153 */     this.cumPrPagNetCi = ci4;
/*  154 */     this.dataCaricamento = caricamento;
/*  155 */     this.descCompl = compl;
/*  156 */     this.descProdotto = prodotto2;
/*  157 */     this.descTariffa = tariffa2;
/*  158 */     this.diritQuiet = quiet;
/*  159 */     this.divisaIso = iso;
/*  160 */     this.dtDecorCtr = ctr;
/*  161 */     this.dtDecRataSuc = suc;
/*  162 */     this.dtElab = elab;
/*  163 */     this.dtEmisCtr = ctr2;
/*  164 */     this.dtFinePagPrem = prem;
/*  165 */     this.dtInizPagPrem = prem2;
/*  166 */     this.dtNascAssic = assic;
/*  167 */     this.dtRifRival = rival;
/*  168 */     this.dtScaCtr = ctr3;
/*  169 */     this.dtStorno = storno2;
/*  170 */     this.dtUltRataEme = eme;
/*  171 */     this.dtUltRataInc = inc;
/*  172 */     this.dtUltRataPag = pag;
/*  173 */     this.durCtr = ctr4;
/*  174 */     this.etaCompAssic = assic2;
/*  175 */     this.flagLiquidata = liquidata;
/*  176 */     this.flxId = id;
/*  177 */     this.impSovrapGener = gener;
/*  178 */     this.impSovrapProf = prof;
/*  179 */     this.impSovrapSanit = sanit;
/*  180 */     this.impSovrapSport = sport;
/*  181 */     this.indInizValuta = valuta;
/*  182 */     this.indirCorrispondenza = corrispondenza2;
/*  183 */     this.istanza = istanza;
/*  184 */     this.liberata = liberata;
/*  185 */     this.localitaCorrispondenza = corrispondenza3;
/*  186 */     this.nazioneCorrispondenza = corrispondenza4;
/*  187 */     this.nomeAssic = assic3;
/*  188 */     this.numMand = mand;
/*  189 */     this.numVerProdo = prodo;
/*  190 */     this.partiValuta = valuta2;
/*  191 */     this.pctInval = inval;
/*  192 */     this.pctRival = rival2;
/*  193 */     this.Perfez = perfez;
/*  194 */     this.polizza = polizza;
/*  195 */     this.polizzaSiag = siag3;
/*  196 */     this.polSost1 = sost1;
/*  197 */     this.polSost2 = sost2;
/*  198 */     this.polSost3 = sost3;
/*  199 */     this.polSost4 = sost4;
/*  200 */     this.prestIniz = iniz;
/*  201 */     this.prestitoEsist = esist;
/*  202 */     this.primoPrPag = pag3;
/*  203 */     this.primoPrPagCi = ci5;
/*  204 */     prodotto = prodotto3;
/*  205 */     this.proposta = proposta;
/*  206 */     this.provCorrispondenza = corrispondenza5;
/*  207 */     this.provPortafRas = ras;
/*  208 */     this.PrPagLorCi = ci6;
/*  209 */     this.PrPagNet = net;
/*  210 */     this.ramo = ramo;
/*  211 */     this.ramoSiag = siag4;
/*  212 */     this.rendDiff = diff;
/*  213 */     this.rendMaturaCa = ca2;
/*  214 */     this.rendMaturaCu = cu2;
/*  215 */     this.riassegnazione = riassegnazione;
/*  216 */     this.sessoAssic = assic4;
/*  217 */     this.statoElab = elab2;
/*  218 */     this.stGiuCtr = ctr5;
/*  219 */     this.tassoFraz = fraz2;
/*  220 */     this.tassoTariffa = tariffa3;
/*  221 */     this.tipoInval = inval2;
/*  222 */     this.tipoRecord = record;
/*  223 */     this.tipoTariffa = tariffa4;
/*  224 */     this.ul = ul;
/*  225 */     this.ultPrPagLor = lor2;
/*  226 */     this.ultPrPagNet = net2;
/*  227 */     this.ultPrPagNetCi = ci7;
/*  228 */     this.ultRataEmesLor = lor3;
/*  229 */     this.ultRataEmesLorCi = ci8;
/*  230 */     this.ultRataEmesNet = net3;
/*  231 */     this.ultRataEmesNetCi = ci9;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public FlxRBVitaBg1pro() {}
/*      */ 
/*      */ 
/*      */   
/*      */   public String getBaseTecnica() {
/*  242 */     return this.baseTecnica;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setBaseTecnica(String baseTecnica) {
/*  247 */     this.baseTecnica = baseTecnica;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCambioUltRatEme1() {
/*  252 */     return this.cambioUltRatEme1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCambioUltRatEme1(Double cambioUltRatEme1) {
/*  257 */     this.cambioUltRatEme1 = cambioUltRatEme1;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCambioUltRatEme2() {
/*  262 */     return this.cambioUltRatEme2;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCambioUltRatEme2(Double cambioUltRatEme2) {
/*  267 */     this.cambioUltRatEme2 = cambioUltRatEme2;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCambioUltRatPag1() {
/*  272 */     return this.cambioUltRatPag1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCambioUltRatPag1(Double cambioUltRatPag1) {
/*  277 */     this.cambioUltRatPag1 = cambioUltRatPag1;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCambioUltRatPag2() {
/*  282 */     return this.cambioUltRatPag2;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCambioUltRatPag2(Double cambioUltRatPag2) {
/*  287 */     this.cambioUltRatPag2 = cambioUltRatPag2;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCapCorrispondenza() {
/*  292 */     return this.capCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapCorrispondenza(String capCorrispondenza) {
/*  297 */     this.capCorrispondenza = capCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitDiffer() {
/*  302 */     return this.capitDiffer;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitDiffer(Double capitDiffer) {
/*  307 */     this.capitDiffer = capitDiffer;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitMatuCa() {
/*  312 */     return this.capitMatuCa;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitMatuCa(Double capitMatuCa) {
/*  317 */     this.capitMatuCa = capitMatuCa;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitMatuCi() {
/*  322 */     return this.capitMatuCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitMatuCi(Double capitMatuCi) {
/*  327 */     this.capitMatuCi = capitMatuCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitMatuCu() {
/*  332 */     return this.capitMatuCu;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitMatuCu(Double capitMatuCu) {
/*  337 */     this.capitMatuCu = capitMatuCu;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodAgente() {
/*  342 */     return this.codAgente;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodAgente(String codAgente) {
/*  347 */     this.codAgente = codAgente;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodAgenteSplit() {
/*  352 */     return this.codAgenteSplit;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodAgenteSplit(String codAgenteSplit) {
/*  357 */     this.codAgenteSplit = codAgenteSplit;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodAgenzia() {
/*  362 */     return this.codAgenzia;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodAgenzia(String codAgenzia) {
/*  367 */     this.codAgenzia = codAgenzia;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodAgenziaSiag() {
/*  372 */     return this.codAgenziaSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodAgenziaSiag(String codAgenziaSiag) {
/*  377 */     this.codAgenziaSiag = codAgenziaSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodfiscContr() {
/*  382 */     return this.codfiscContr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodfiscContr(String codfiscContr) {
/*  387 */     this.codfiscContr = codfiscContr;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodFraz() {
/*  392 */     return this.codFraz;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodFraz(String codFraz) {
/*  397 */     this.codFraz = codFraz;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodPfia() {
/*  402 */     return this.codPfia;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodPfia(String codPfia) {
/*  407 */     this.codPfia = codPfia;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodProdotto() {
/*  412 */     return this.codProdotto;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodProdotto(String codProdotto) {
/*  417 */     this.codProdotto = codProdotto;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodRete() {
/*  422 */     return this.codRete;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodRete(String codRete) {
/*  427 */     this.codRete = codRete;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodSelfcheck() {
/*  432 */     return this.codSelfcheck;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodSelfcheck(String codSelfcheck) {
/*  437 */     this.codSelfcheck = codSelfcheck;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodStorno() {
/*  442 */     return this.codStorno;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodStorno(String codStorno) {
/*  447 */     this.codStorno = codStorno;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodTariffa() {
/*  452 */     return this.codTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodTariffa(String codTariffa) {
/*  457 */     this.codTariffa = codTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodTassaCi() {
/*  462 */     return this.codTassaCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodTassaCi(String codTassaCi) {
/*  467 */     this.codTassaCi = codTassaCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodTassaVita() {
/*  472 */     return this.codTassaVita;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodTassaVita(String codTassaVita) {
/*  477 */     this.codTassaVita = codTassaVita;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCodTrasf() {
/*  482 */     return this.codTrasf;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodTrasf(String codTrasf) {
/*  487 */     this.codTrasf = codTrasf;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCompagnia() {
/*  492 */     return this.compagnia;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCompagnia(String compagnia) {
/*  497 */     this.compagnia = compagnia;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getCompagniaSiag() {
/*  502 */     return this.compagniaSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCompagniaSiag(String compagniaSiag) {
/*  507 */     this.compagniaSiag = compagniaSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCumPrPagLor() {
/*  512 */     return this.cumPrPagLor;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCumPrPagLor(Double cumPrPagLor) {
/*  517 */     this.cumPrPagLor = cumPrPagLor;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCumPrPagLorCi() {
/*  522 */     return this.cumPrPagLorCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCumPrPagLorCi(Double cumPrPagLorCi) {
/*  527 */     this.cumPrPagLorCi = cumPrPagLorCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCumPrPagNetCi() {
/*  532 */     return this.cumPrPagNetCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCumPrPagNetCi(Double cumPrPagNetCi) {
/*  537 */     this.cumPrPagNetCi = cumPrPagNetCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDataCaricamento() {
/*  542 */     return this.dataCaricamento;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataCaricamento(Date dataCaricamento) {
/*  547 */     this.dataCaricamento = dataCaricamento;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDescCompl() {
/*  552 */     return this.descCompl;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDescCompl(String descCompl) {
/*  557 */     this.descCompl = descCompl;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDescProdotto() {
/*  562 */     return this.descProdotto;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDescProdotto(String descProdotto) {
/*  567 */     this.descProdotto = descProdotto;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDescTariffa() {
/*  572 */     return this.descTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDescTariffa(String descTariffa) {
/*  577 */     this.descTariffa = descTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getDiritQuiet() {
/*  582 */     return this.diritQuiet;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDiritQuiet(Double diritQuiet) {
/*  587 */     this.diritQuiet = diritQuiet;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getDivisaIso() {
/*  592 */     return this.divisaIso;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDivisaIso(String divisaIso) {
/*  597 */     this.divisaIso = divisaIso;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtDecorCtr() {
/*  602 */     return this.dtDecorCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtDecorCtr(Date dtDecorCtr) {
/*  607 */     this.dtDecorCtr = dtDecorCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtDecRataSuc() {
/*  612 */     return this.dtDecRataSuc;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtDecRataSuc(Date dtDecRataSuc) {
/*  617 */     this.dtDecRataSuc = dtDecRataSuc;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtElab() {
/*  622 */     return this.dtElab;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtElab(Date dtElab) {
/*  627 */     this.dtElab = dtElab;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtEmisCtr() {
/*  632 */     return this.dtEmisCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtEmisCtr(Date dtEmisCtr) {
/*  637 */     this.dtEmisCtr = dtEmisCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtFinePagPrem() {
/*  642 */     return this.dtFinePagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtFinePagPrem(Date dtFinePagPrem) {
/*  647 */     this.dtFinePagPrem = dtFinePagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtInizPagPrem() {
/*  652 */     return this.dtInizPagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtInizPagPrem(Date dtInizPagPrem) {
/*  657 */     this.dtInizPagPrem = dtInizPagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtNascAssic() {
/*  662 */     return this.dtNascAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtNascAssic(Date dtNascAssic) {
/*  667 */     this.dtNascAssic = dtNascAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtRifRival() {
/*  672 */     return this.dtRifRival;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtRifRival(Date dtRifRival) {
/*  677 */     this.dtRifRival = dtRifRival;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtScaCtr() {
/*  682 */     return this.dtScaCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtScaCtr(Date dtScaCtr) {
/*  687 */     this.dtScaCtr = dtScaCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtStorno() {
/*  692 */     return this.dtStorno;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtStorno(Date dtStorno) {
/*  697 */     this.dtStorno = dtStorno;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtUltRataEme() {
/*  702 */     return this.dtUltRataEme;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtUltRataEme(Date dtUltRataEme) {
/*  707 */     this.dtUltRataEme = dtUltRataEme;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtUltRataInc() {
/*  712 */     return this.dtUltRataInc;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtUltRataInc(Date dtUltRataInc) {
/*  717 */     this.dtUltRataInc = dtUltRataInc;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDtUltRataPag() {
/*  722 */     return this.dtUltRataPag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDtUltRataPag(Date dtUltRataPag) {
/*  727 */     this.dtUltRataPag = dtUltRataPag;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getDurCtr() {
/*  732 */     return this.durCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDurCtr(Integer durCtr) {
/*  737 */     this.durCtr = durCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getEtaCompAssic() {
/*  742 */     return this.etaCompAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setEtaCompAssic(Integer etaCompAssic) {
/*  747 */     this.etaCompAssic = etaCompAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFlagLiquidata() {
/*  752 */     return this.flagLiquidata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFlagLiquidata(String flagLiquidata) {
/*  757 */     this.flagLiquidata = flagLiquidata;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getFlxId() {
/*  762 */     return this.flxId;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFlxId(Integer flxId) {
/*  767 */     this.flxId = flxId;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getImpSovrapGener() {
/*  772 */     return this.impSovrapGener;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setImpSovrapGener(Double impSovrapGener) {
/*  777 */     this.impSovrapGener = impSovrapGener;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getImpSovrapProf() {
/*  782 */     return this.impSovrapProf;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setImpSovrapProf(Double impSovrapProf) {
/*  787 */     this.impSovrapProf = impSovrapProf;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getImpSovrapSanit() {
/*  792 */     return this.impSovrapSanit;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setImpSovrapSanit(Double impSovrapSanit) {
/*  797 */     this.impSovrapSanit = impSovrapSanit;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getImpSovrapSport() {
/*  802 */     return this.impSovrapSport;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setImpSovrapSport(Double impSovrapSport) {
/*  807 */     this.impSovrapSport = impSovrapSport;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getIndInizValuta() {
/*  812 */     return this.indInizValuta;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setIndInizValuta(Double indInizValuta) {
/*  817 */     this.indInizValuta = indInizValuta;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getIndirCorrispondenza() {
/*  822 */     return this.indirCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setIndirCorrispondenza(String indirCorrispondenza) {
/*  827 */     this.indirCorrispondenza = indirCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getIstanza() {
/*  832 */     return this.istanza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setIstanza(String istanza) {
/*  837 */     this.istanza = istanza;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getLiberata() {
/*  842 */     return this.liberata;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setLiberata(String liberata) {
/*  847 */     this.liberata = liberata;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getLocalitaCorrispondenza() {
/*  852 */     return this.localitaCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setLocalitaCorrispondenza(String localitaCorrispondenza) {
/*  857 */     this.localitaCorrispondenza = localitaCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getNazioneCorrispondenza() {
/*  862 */     return this.nazioneCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNazioneCorrispondenza(String nazioneCorrispondenza) {
/*  867 */     this.nazioneCorrispondenza = nazioneCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getNomeAssic() {
/*  872 */     return this.nomeAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNomeAssic(String nomeAssic) {
/*  877 */     this.nomeAssic = nomeAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getNumMand() {
/*  882 */     return this.numMand;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNumMand(String numMand) {
/*  887 */     this.numMand = numMand;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getNumVerProdo() {
/*  892 */     return this.numVerProdo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNumVerProdo(Integer numVerProdo) {
/*  897 */     this.numVerProdo = numVerProdo;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPartiValuta() {
/*  902 */     return this.partiValuta;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPartiValuta(Double partiValuta) {
/*  907 */     this.partiValuta = partiValuta;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPctInval() {
/*  912 */     return this.pctInval;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPctInval(Double pctInval) {
/*  917 */     this.pctInval = pctInval;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPctRival() {
/*  922 */     return this.pctRival;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPctRival(Double pctRival) {
/*  927 */     this.pctRival = pctRival;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPerfez() {
/*  932 */     return this.Perfez;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPerfez(Double perfez) {
/*  937 */     this.Perfez = perfez;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPolizza() {
/*  942 */     return this.polizza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPolizza(String polizza) {
/*  947 */     this.polizza = polizza;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPolizzaSiag() {
/*  952 */     return this.polizzaSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPolizzaSiag(String polizzaSiag) {
/*  957 */     this.polizzaSiag = polizzaSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPolSost1() {
/*  962 */     return this.polSost1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPolSost1(String polSost1) {
/*  967 */     this.polSost1 = polSost1;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPolSost2() {
/*  972 */     return this.polSost2;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPolSost2(String polSost2) {
/*  977 */     this.polSost2 = polSost2;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPolSost3() {
/*  982 */     return this.polSost3;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPolSost3(String polSost3) {
/*  987 */     this.polSost3 = polSost3;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getPolSost4() {
/*  992 */     return this.polSost4;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPolSost4(String polSost4) {
/*  997 */     this.polSost4 = polSost4;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPrestIniz() {
/* 1002 */     return this.prestIniz;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPrestIniz(Double prestIniz) {
/* 1007 */     this.prestIniz = prestIniz;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPrestitoEsist() {
/* 1012 */     return this.prestitoEsist;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPrestitoEsist(Double prestitoEsist) {
/* 1017 */     this.prestitoEsist = prestitoEsist;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPrimoPrPag() {
/* 1022 */     return this.primoPrPag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPrimoPrPag(Double primoPrPag) {
/* 1027 */     this.primoPrPag = primoPrPag;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPrimoPrPagCi() {
/* 1032 */     return this.primoPrPagCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPrimoPrPagCi(Double primoPrPagCi) {
/* 1037 */     this.primoPrPagCi = primoPrPagCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getProdotto() {
/* 1042 */     return this.prodotto;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProdotto(String prodotto) {
/* 1047 */     this.prodotto = prodotto;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getProposta() {
/* 1052 */     return this.proposta;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProposta(String proposta) {
/* 1057 */     this.proposta = proposta;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getProvCorrispondenza() {
/* 1062 */     return this.provCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProvCorrispondenza(String provCorrispondenza) {
/* 1067 */     this.provCorrispondenza = provCorrispondenza;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getProvPortafRas() {
/* 1072 */     return this.provPortafRas;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProvPortafRas(String provPortafRas) {
/* 1077 */     this.provPortafRas = provPortafRas;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPrPagLorCi() {
/* 1082 */     return this.PrPagLorCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPrPagLorCi(Double prPagLorCi) {
/* 1087 */     this.PrPagLorCi = prPagLorCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPrPagNet() {
/* 1092 */     return this.PrPagNet;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPrPagNet(Double prPagNet) {
/* 1097 */     this.PrPagNet = prPagNet;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getRamo() {
/* 1102 */     return this.ramo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRamo(String ramo) {
/* 1107 */     this.ramo = ramo;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getRamoSiag() {
/* 1112 */     return this.ramoSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRamoSiag(String ramoSiag) {
/* 1117 */     this.ramoSiag = ramoSiag;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendDiff() {
/* 1122 */     return this.rendDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendDiff(Double rendDiff) {
/* 1127 */     this.rendDiff = rendDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendMaturaCa() {
/* 1132 */     return this.rendMaturaCa;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendMaturaCa(Double rendMaturaCa) {
/* 1137 */     this.rendMaturaCa = rendMaturaCa;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendMaturaCu() {
/* 1142 */     return this.rendMaturaCu;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendMaturaCu(Double rendMaturaCu) {
/* 1147 */     this.rendMaturaCu = rendMaturaCu;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getRiassegnazione() {
/* 1152 */     return this.riassegnazione;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRiassegnazione(String riassegnazione) {
/* 1157 */     this.riassegnazione = riassegnazione;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getSessoAssic() {
/* 1162 */     return this.sessoAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setSessoAssic(String sessoAssic) {
/* 1167 */     this.sessoAssic = sessoAssic;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getStatoElab() {
/* 1172 */     return this.statoElab;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setStatoElab(String statoElab) {
/* 1177 */     this.statoElab = statoElab;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getStGiuCtr() {
/* 1182 */     return this.stGiuCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setStGiuCtr(String stGiuCtr) {
/* 1187 */     this.stGiuCtr = stGiuCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getTassoFraz() {
/* 1192 */     return this.tassoFraz;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTassoFraz(Double tassoFraz) {
/* 1197 */     this.tassoFraz = tassoFraz;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getTassoTariffa() {
/* 1202 */     return this.tassoTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTassoTariffa(Double tassoTariffa) {
/* 1207 */     this.tassoTariffa = tassoTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTipoInval() {
/* 1212 */     return this.tipoInval;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipoInval(String tipoInval) {
/* 1217 */     this.tipoInval = tipoInval;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTipoRecord() {
/* 1222 */     return this.tipoRecord;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipoRecord(String tipoRecord) {
/* 1227 */     this.tipoRecord = tipoRecord;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTipoTariffa() {
/* 1232 */     return this.tipoTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipoTariffa(String tipoTariffa) {
/* 1237 */     this.tipoTariffa = tipoTariffa;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getUl() {
/* 1242 */     return this.ul;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUl(String ul) {
/* 1247 */     this.ul = ul;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltPrPagLor() {
/* 1252 */     return this.ultPrPagLor;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltPrPagLor(Double ultPrPagLor) {
/* 1257 */     this.ultPrPagLor = ultPrPagLor;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltPrPagNet() {
/* 1262 */     return this.ultPrPagNet;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltPrPagNet(Double ultPrPagNet) {
/* 1267 */     this.ultPrPagNet = ultPrPagNet;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltPrPagNetCi() {
/* 1272 */     return this.ultPrPagNetCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltPrPagNetCi(Double ultPrPagNetCi) {
/* 1277 */     this.ultPrPagNetCi = ultPrPagNetCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltRataEmesLor() {
/* 1282 */     return this.ultRataEmesLor;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltRataEmesLor(Double ultRataEmesLor) {
/* 1287 */     this.ultRataEmesLor = ultRataEmesLor;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltRataEmesLorCi() {
/* 1292 */     return this.ultRataEmesLorCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltRataEmesLorCi(Double ultRataEmesLorCi) {
/* 1297 */     this.ultRataEmesLorCi = ultRataEmesLorCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltRataEmesNet() {
/* 1302 */     return this.ultRataEmesNet;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltRataEmesNet(Double ultRataEmesNet) {
/* 1307 */     this.ultRataEmesNet = ultRataEmesNet;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltRataEmesNetCi() {
/* 1312 */     return this.ultRataEmesNetCi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltRataEmesNetCi(Double ultRataEmesNetCi) {
/* 1317 */     this.ultRataEmesNetCi = ultRataEmesNetCi;
/*      */   }
/*      */   
/*      */   public String toString() {
/* 1321 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRBVitaBg1pro.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */