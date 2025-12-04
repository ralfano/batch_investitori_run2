/*      */ package it.ras.arco.bean;
/*      */ 
/*      */ import it.ras.flag.bean.RasORMBean;
/*      */ import java.io.Serializable;
/*      */ import java.util.Date;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class FinProiezionePolizza
/*      */   extends RasORMBean
/*      */   implements Serializable
/*      */ {
/*      */   private FinPolizza polizza;
/*      */   private Integer proiezionePolId;
/*      */   private String tipoRecord;
/*      */   private Integer provPortafoglio;
/*      */   private Date dataElaborazione;
/*      */   private String filler1;
/*      */   private Integer compagnia;
/*      */   private Integer ramo;
/*      */   private String numeroContratto;
/*      */   private String filler2;
/*      */   private Date dataDecorrenzaContr;
/*      */   private Date dataScadenzaContr;
/*      */   private Date dataInPagPrem;
/*      */   private Date dataFinePagPrem;
/*      */   private Integer codStGiuCtr;
/*      */   private Integer codStOprCtr;
/*      */   private String filler3;
/*      */   private String flagDifferimento;
/*      */   private String flagProiezPoss;
/*      */   private String tipoPrestPrev;
/*      */   private String renditaGarantita;
/*      */   private Double importoPremiVersati;
/*      */   private Double importoUltPremiVers;
/*      */   private Double capitaleLordoScad;
/*      */   private Double capitaleLordoDiff5;
/*      */   private Double capitaleLordoDiff10;
/*      */   private Double capitaleLordoDiff15;
/*      */   private Double capitaleMinlordoScad;
/*      */   private Double capitaleMinlordoDiff5;
/*      */   private Double capitaleMinlordoDiff10;
/*      */   private Double capitaleMinlordoDiff15;
/*      */   private Double capitaleNettoScad;
/*      */   private Double capitaleNettoDiff5;
/*      */   private Double capitaleNettoDiff10;
/*      */   private Double capitaleNettoDiff15;
/*      */   private Double capitaleMinNettoScad;
/*      */   private Double capitaleMinNettoDiff5;
/*      */   private Double capitaleMinNettoDiff10;
/*      */   private Double capitaleMinNettoDiff15;
/*      */   private Double renditaInizLordaScad;
/*      */   private Double renditaInizLordaDiff5;
/*      */   private Double renditaInizLordaDiff10;
/*      */   private Double renditaInizLordaDiff15;
/*      */   private Double renditaMinInizLordaScad;
/*      */   private Double renditaMinInizLordaDiff5;
/*      */   private Double renditaMinInizLordaDiff10;
/*      */   private Double renditaMinInizLordaDiff15;
/*      */   private Double renditaInizNettaScad;
/*      */   private Double renditaInizNettaDiff5;
/*      */   private Double renditaInizNettaDiff10;
/*      */   private Double renditaInizNettaDiff15;
/*      */   private Double renditaMininizNettaScad;
/*      */   private Double renditaMininizNettaDiff5;
/*      */   private Double renditaMininizNettaDiff10;
/*      */   private Double renditaMininizNettaDiff15;
/*      */   private Double renditaLordaAttesao;
/*      */   private Double renditaNettaAttesao;
/*      */   private Double ultimaRendAnnuaLorda;
/*      */   private Double ultimaRendAnnuaNetta;
/*      */   private Integer maxAnniDas;
/*      */   private String filler4;
/*      */   private Integer progCop;
/*      */   private Integer tipoCop;
/*      */   private Integer flagCopPrinc;
/*      */   private Integer codValuta;
/*      */   private Double cambio;
/*      */   private String filler5;
/*      */   private String tipologiaPremi;
/*      */   private Double presta1BaseR;
/*      */   private Double presta1BonusBaseR;
/*      */   private Double presta2BaseR;
/*      */   private Double presta2BonusBaseR;
/*      */   private Double presta3BaseR;
/*      */   private Double presta3BonusBaseR;
/*      */   private Double riservaMatemAccum;
/*      */   private Double riservaMatemDiff;
/*      */   private Double rendimentoIsvap;
/*      */   private Double rendimMinGarAccum;
/*      */   private Double rendimMinGarDiff;
/*      */   private Double renMingarTxTecnAccum;
/*      */   private Double renMingarTxTecnDiff;
/*      */   private Double rendMinTrattAccum;
/*      */   private Double rendMinTrattDiff;
/*      */   private Double txTecnRenditaAccum;
/*      */   private Double txTecnRenditaDiff;
/*      */   private Double txTecnRenditaErog;
/*      */   private Double aliqRetrocessAccum;
/*      */   private Double aliqRetrocessDiff;
/*      */   private Double ipotesiIncremPremi;
/*      */   private Double impPremiVersatiUnit;
/*      */   private Double riportoPremi;
/*      */   private Date dataInserimento;
/*      */   private String utenteInserimento;
/*      */   
/*      */   public FinProiezionePolizza() {}
/*      */   
/*      */   public FinProiezionePolizza(Double accum, Double diff, Double cambio, Double diff10, Double diff15, Double diff5, Double scad, Double diff102, Double diff152, Double diff52, Double scad2, Double diff103, Double diff153, Double diff53, Double scad3, Double diff104, Double diff154, Double diff54, Double scad4, Integer ctr, Integer ctr2, Integer valuta, Integer compagnia, Date contr, Date elaborazione, Date prem, Date prem2, Date inserimento, Date contr2, String filler1, String filler2, String filler3, String filler4, String filler5, Integer princ, String differimento, String poss, Double versati, Double vers, Double unit, Double premi, Integer das, String contratto, FinPolizza polizza, Double baseR, Double baseR2, Double baseR3, Double baseR4, Double baseR5, Double baseR6, Integer cop, Integer id, Integer portafoglio, Integer ramo, Double isvap, Double accum2, Double diff2, String garantita, Double diff105, Double diff155, Double diff55, Double scad5, Double diff106, Double diff156, Double diff56, Double scad6, Double attesao, Double diff107, Double diff157, Double diff57, Double scad7, Double diff108, Double diff158, Double diff58, Double scad8, Double attesao2, Double accum3, Double diff3, Double accum4, Double diff4, Double premi2, Double accum5, Double diff6, Integer cop2, String premi3, String prev, String record, Double accum6, Double diff7, Double erog, Double lorda, Double netta, String inserimento2) {
/*  118 */     this.aliqRetrocessAccum = accum;
/*  119 */     this.aliqRetrocessDiff = diff;
/*  120 */     this.cambio = cambio;
/*  121 */     this.capitaleLordoDiff10 = diff10;
/*  122 */     this.capitaleLordoDiff15 = diff15;
/*  123 */     this.capitaleLordoDiff5 = diff5;
/*  124 */     this.capitaleLordoScad = scad;
/*  125 */     this.capitaleMinlordoDiff10 = diff102;
/*  126 */     this.capitaleMinlordoDiff15 = diff152;
/*  127 */     this.capitaleMinlordoDiff5 = diff52;
/*  128 */     this.capitaleMinlordoScad = scad2;
/*  129 */     this.capitaleMinNettoDiff10 = diff103;
/*  130 */     this.capitaleMinNettoDiff15 = diff153;
/*  131 */     this.capitaleMinNettoDiff5 = diff53;
/*  132 */     this.capitaleMinNettoScad = scad3;
/*  133 */     this.capitaleNettoDiff10 = diff104;
/*  134 */     this.capitaleNettoDiff15 = diff154;
/*  135 */     this.capitaleNettoDiff5 = diff54;
/*  136 */     this.capitaleNettoScad = scad4;
/*  137 */     this.codStGiuCtr = ctr;
/*  138 */     this.codStOprCtr = ctr2;
/*  139 */     this.codValuta = valuta;
/*  140 */     this.compagnia = compagnia;
/*  141 */     this.dataDecorrenzaContr = contr;
/*  142 */     this.dataElaborazione = elaborazione;
/*  143 */     this.dataFinePagPrem = prem;
/*  144 */     this.dataInPagPrem = prem2;
/*  145 */     this.dataInserimento = inserimento;
/*  146 */     this.dataScadenzaContr = contr2;
/*  147 */     this.filler1 = filler1;
/*  148 */     this.filler2 = filler2;
/*  149 */     this.filler3 = filler3;
/*  150 */     this.filler4 = filler4;
/*  151 */     this.filler5 = filler5;
/*  152 */     this.flagCopPrinc = princ;
/*  153 */     this.flagDifferimento = differimento;
/*  154 */     this.flagProiezPoss = poss;
/*  155 */     this.importoPremiVersati = versati;
/*  156 */     this.importoUltPremiVers = vers;
/*  157 */     this.impPremiVersatiUnit = unit;
/*  158 */     this.ipotesiIncremPremi = premi;
/*  159 */     this.maxAnniDas = das;
/*  160 */     this.numeroContratto = contratto;
/*  161 */     this.polizza = polizza;
/*  162 */     this.presta1BaseR = baseR;
/*  163 */     this.presta1BonusBaseR = baseR2;
/*  164 */     this.presta2BaseR = baseR3;
/*  165 */     this.presta2BonusBaseR = baseR4;
/*  166 */     this.presta3BaseR = baseR5;
/*  167 */     this.presta3BonusBaseR = baseR6;
/*  168 */     this.progCop = cop;
/*  169 */     this.proiezionePolId = id;
/*  170 */     this.provPortafoglio = portafoglio;
/*  171 */     this.ramo = ramo;
/*  172 */     this.rendimentoIsvap = isvap;
/*  173 */     this.rendimMinGarAccum = accum2;
/*  174 */     this.rendimMinGarDiff = diff2;
/*  175 */     this.renditaGarantita = garantita;
/*  176 */     this.renditaInizLordaDiff10 = diff105;
/*  177 */     this.renditaInizLordaDiff15 = diff155;
/*  178 */     this.renditaInizLordaDiff5 = diff55;
/*  179 */     this.renditaInizLordaScad = scad5;
/*  180 */     this.renditaInizNettaDiff10 = diff106;
/*  181 */     this.renditaInizNettaDiff15 = diff156;
/*  182 */     this.renditaInizNettaDiff5 = diff56;
/*  183 */     this.renditaInizNettaScad = scad6;
/*  184 */     this.renditaLordaAttesao = attesao;
/*  185 */     this.renditaMinInizLordaDiff10 = diff107;
/*  186 */     this.renditaMinInizLordaDiff15 = diff157;
/*  187 */     this.renditaMinInizLordaDiff5 = diff57;
/*  188 */     this.renditaMinInizLordaScad = scad7;
/*  189 */     this.renditaMininizNettaDiff10 = diff108;
/*  190 */     this.renditaMininizNettaDiff15 = diff158;
/*  191 */     this.renditaMininizNettaDiff5 = diff58;
/*  192 */     this.renditaMininizNettaScad = scad8;
/*  193 */     this.renditaNettaAttesao = attesao2;
/*  194 */     this.rendMinTrattAccum = accum3;
/*  195 */     this.rendMinTrattDiff = diff3;
/*  196 */     this.renMingarTxTecnAccum = accum4;
/*  197 */     this.renMingarTxTecnDiff = diff4;
/*  198 */     this.riportoPremi = premi2;
/*  199 */     this.riservaMatemAccum = accum5;
/*  200 */     this.riservaMatemDiff = diff6;
/*  201 */     this.tipoCop = cop2;
/*  202 */     this.tipologiaPremi = premi3;
/*  203 */     this.tipoPrestPrev = prev;
/*  204 */     this.tipoRecord = record;
/*  205 */     this.txTecnRenditaAccum = accum6;
/*  206 */     this.txTecnRenditaDiff = diff7;
/*  207 */     this.txTecnRenditaErog = erog;
/*  208 */     this.ultimaRendAnnuaLorda = lorda;
/*  209 */     this.ultimaRendAnnuaNetta = netta;
/*  210 */     this.utenteInserimento = inserimento2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getAliqRetrocessAccum() {
/*  217 */     return this.aliqRetrocessAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAliqRetrocessAccum(Double aliqRetrocessAccum) {
/*  222 */     this.aliqRetrocessAccum = aliqRetrocessAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getAliqRetrocessDiff() {
/*  227 */     return this.aliqRetrocessDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setAliqRetrocessDiff(Double aliqRetrocessDiff) {
/*  232 */     this.aliqRetrocessDiff = aliqRetrocessDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCambio() {
/*  237 */     return this.cambio;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCambio(Double cambio) {
/*  242 */     this.cambio = cambio;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleLordoDiff10() {
/*  247 */     return this.capitaleLordoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleLordoDiff10(Double capitaleLordoDiff10) {
/*  252 */     this.capitaleLordoDiff10 = capitaleLordoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleLordoDiff15() {
/*  257 */     return this.capitaleLordoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleLordoDiff15(Double capitaleLordoDiff15) {
/*  262 */     this.capitaleLordoDiff15 = capitaleLordoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleLordoDiff5() {
/*  267 */     return this.capitaleLordoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleLordoDiff5(Double capitaleLordoDiff5) {
/*  272 */     this.capitaleLordoDiff5 = capitaleLordoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleLordoScad() {
/*  277 */     return this.capitaleLordoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleLordoScad(Double capitaleLordoScad) {
/*  282 */     this.capitaleLordoScad = capitaleLordoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinlordoDiff10() {
/*  287 */     return this.capitaleMinlordoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinlordoDiff10(Double capitaleMinlordoDiff10) {
/*  292 */     this.capitaleMinlordoDiff10 = capitaleMinlordoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinlordoDiff15() {
/*  297 */     return this.capitaleMinlordoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinlordoDiff15(Double capitaleMinlordoDiff15) {
/*  302 */     this.capitaleMinlordoDiff15 = capitaleMinlordoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinlordoDiff5() {
/*  307 */     return this.capitaleMinlordoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinlordoDiff5(Double capitaleMinlordoDiff5) {
/*  312 */     this.capitaleMinlordoDiff5 = capitaleMinlordoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinlordoScad() {
/*  317 */     return this.capitaleMinlordoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinlordoScad(Double capitaleMinlordoScad) {
/*  322 */     this.capitaleMinlordoScad = capitaleMinlordoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinNettoDiff10() {
/*  327 */     return this.capitaleMinNettoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinNettoDiff10(Double capitaleMinNettoDiff10) {
/*  332 */     this.capitaleMinNettoDiff10 = capitaleMinNettoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinNettoDiff15() {
/*  337 */     return this.capitaleMinNettoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinNettoDiff15(Double capitaleMinNettoDiff15) {
/*  342 */     this.capitaleMinNettoDiff15 = capitaleMinNettoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinNettoDiff5() {
/*  347 */     return this.capitaleMinNettoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinNettoDiff5(Double capitaleMinNettoDiff5) {
/*  352 */     this.capitaleMinNettoDiff5 = capitaleMinNettoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleMinNettoScad() {
/*  357 */     return this.capitaleMinNettoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleMinNettoScad(Double capitaleMinNettoScad) {
/*  362 */     this.capitaleMinNettoScad = capitaleMinNettoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleNettoDiff10() {
/*  367 */     return this.capitaleNettoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleNettoDiff10(Double capitaleNettoDiff10) {
/*  372 */     this.capitaleNettoDiff10 = capitaleNettoDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleNettoDiff15() {
/*  377 */     return this.capitaleNettoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleNettoDiff15(Double capitaleNettoDiff15) {
/*  382 */     this.capitaleNettoDiff15 = capitaleNettoDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleNettoDiff5() {
/*  387 */     return this.capitaleNettoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleNettoDiff5(Double capitaleNettoDiff5) {
/*  392 */     this.capitaleNettoDiff5 = capitaleNettoDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getCapitaleNettoScad() {
/*  397 */     return this.capitaleNettoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCapitaleNettoScad(Double capitaleNettoScad) {
/*  402 */     this.capitaleNettoScad = capitaleNettoScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getCodStGiuCtr() {
/*  407 */     return this.codStGiuCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodStGiuCtr(Integer codStGiuCtr) {
/*  412 */     this.codStGiuCtr = codStGiuCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getCodStOprCtr() {
/*  417 */     return this.codStOprCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodStOprCtr(Integer codStOprCtr) {
/*  422 */     this.codStOprCtr = codStOprCtr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getCodValuta() {
/*  427 */     return this.codValuta;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCodValuta(Integer codValuta) {
/*  432 */     this.codValuta = codValuta;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getCompagnia() {
/*  437 */     return this.compagnia;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setCompagnia(Integer compagnia) {
/*  442 */     this.compagnia = compagnia;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDataDecorrenzaContr() {
/*  447 */     return this.dataDecorrenzaContr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataDecorrenzaContr(Date dataDecorrenzaContr) {
/*  452 */     this.dataDecorrenzaContr = dataDecorrenzaContr;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDataElaborazione() {
/*  457 */     return this.dataElaborazione;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataElaborazione(Date dataElaborazione) {
/*  462 */     this.dataElaborazione = dataElaborazione;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDataFinePagPrem() {
/*  467 */     return this.dataFinePagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataFinePagPrem(Date dataFinePagPrem) {
/*  472 */     this.dataFinePagPrem = dataFinePagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDataInPagPrem() {
/*  477 */     return this.dataInPagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataInPagPrem(Date dataInPagPrem) {
/*  482 */     this.dataInPagPrem = dataInPagPrem;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDataInserimento() {
/*  487 */     return this.dataInserimento;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataInserimento(Date dataInserimento) {
/*  492 */     this.dataInserimento = dataInserimento;
/*      */   }
/*      */ 
/*      */   
/*      */   public Date getDataScadenzaContr() {
/*  497 */     return this.dataScadenzaContr;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setDataScadenzaContr(Date dataScadenzaContr) {
/*  502 */     this.dataScadenzaContr = dataScadenzaContr;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFiller1() {
/*  508 */     return this.filler1;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFiller1(String filler1) {
/*  513 */     this.filler1 = filler1;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFiller2() {
/*  518 */     return this.filler2;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFiller2(String filler2) {
/*  523 */     this.filler2 = filler2;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFiller3() {
/*  528 */     return this.filler3;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFiller3(String filler3) {
/*  533 */     this.filler3 = filler3;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFiller4() {
/*  538 */     return this.filler4;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFiller4(String filler4) {
/*  543 */     this.filler4 = filler4;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFiller5() {
/*  548 */     return this.filler5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFiller5(String filler5) {
/*  553 */     this.filler5 = filler5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getFlagCopPrinc() {
/*  558 */     return this.flagCopPrinc;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFlagCopPrinc(Integer flagCopPrinc) {
/*  563 */     this.flagCopPrinc = flagCopPrinc;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getFlagDifferimento() {
/*  568 */     return this.flagDifferimento;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFlagDifferimento(String flagDifferimento) {
/*  573 */     this.flagDifferimento = flagDifferimento;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getFlagProiezPoss() {
/*  580 */     return this.flagProiezPoss;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setFlagProiezPoss(String flagProiezPoss) {
/*  585 */     this.flagProiezPoss = flagProiezPoss;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getImportoPremiVersati() {
/*  590 */     return this.importoPremiVersati;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setImportoPremiVersati(Double importoPremiVersati) {
/*  595 */     this.importoPremiVersati = importoPremiVersati;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getImportoUltPremiVers() {
/*  600 */     return this.importoUltPremiVers;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setImportoUltPremiVers(Double importoUltPremiVers) {
/*  605 */     this.importoUltPremiVers = importoUltPremiVers;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getImpPremiVersatiUnit() {
/*  610 */     return this.impPremiVersatiUnit;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setImpPremiVersatiUnit(Double impPremiVersatiUnit) {
/*  615 */     this.impPremiVersatiUnit = impPremiVersatiUnit;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getIpotesiIncremPremi() {
/*  620 */     return this.ipotesiIncremPremi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setIpotesiIncremPremi(Double ipotesiIncremPremi) {
/*  625 */     this.ipotesiIncremPremi = ipotesiIncremPremi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getMaxAnniDas() {
/*  630 */     return this.maxAnniDas;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setMaxAnniDas(Integer maxAnniDas) {
/*  635 */     this.maxAnniDas = maxAnniDas;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getNumeroContratto() {
/*  640 */     return this.numeroContratto;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setNumeroContratto(String numeroContratto) {
/*  645 */     this.numeroContratto = numeroContratto;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getPresta1BaseR() {
/*  653 */     return this.presta1BaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPresta1BaseR(Double presta1BaseR) {
/*  658 */     this.presta1BaseR = presta1BaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPresta1BonusBaseR() {
/*  663 */     return this.presta1BonusBaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPresta1BonusBaseR(Double presta1BonusBaseR) {
/*  668 */     this.presta1BonusBaseR = presta1BonusBaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPresta2BaseR() {
/*  673 */     return this.presta2BaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPresta2BaseR(Double presta2BaseR) {
/*  678 */     this.presta2BaseR = presta2BaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPresta2BonusBaseR() {
/*  683 */     return this.presta2BonusBaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPresta2BonusBaseR(Double presta2BonusBaseR) {
/*  688 */     this.presta2BonusBaseR = presta2BonusBaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPresta3BaseR() {
/*  693 */     return this.presta3BaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPresta3BaseR(Double presta3BaseR) {
/*  698 */     this.presta3BaseR = presta3BaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getPresta3BonusBaseR() {
/*  703 */     return this.presta3BonusBaseR;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPresta3BonusBaseR(Double presta3BonusBaseR) {
/*  708 */     this.presta3BonusBaseR = presta3BonusBaseR;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Integer getProgCop() {
/*  715 */     return this.progCop;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProgCop(Integer progCop) {
/*  720 */     this.progCop = progCop;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getProiezionePolId() {
/*  725 */     return this.proiezionePolId;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProiezionePolId(Integer proiezionePolId) {
/*  730 */     this.proiezionePolId = proiezionePolId;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getProvPortafoglio() {
/*  735 */     return this.provPortafoglio;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setProvPortafoglio(Integer provPortafoglio) {
/*  740 */     this.provPortafoglio = provPortafoglio;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getRamo() {
/*  745 */     return this.ramo;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRamo(Integer ramo) {
/*  750 */     this.ramo = ramo;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendimentoIsvap() {
/*  755 */     return this.rendimentoIsvap;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendimentoIsvap(Double rendimentoIsvap) {
/*  760 */     this.rendimentoIsvap = rendimentoIsvap;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendimMinGarAccum() {
/*  765 */     return this.rendimMinGarAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendimMinGarAccum(Double rendimMinGarAccum) {
/*  770 */     this.rendimMinGarAccum = rendimMinGarAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendimMinGarDiff() {
/*  775 */     return this.rendimMinGarDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendimMinGarDiff(Double rendimMinGarDiff) {
/*  780 */     this.rendimMinGarDiff = rendimMinGarDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getRenditaGarantita() {
/*  785 */     return this.renditaGarantita;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaGarantita(String renditaGarantita) {
/*  790 */     this.renditaGarantita = renditaGarantita;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizLordaDiff10() {
/*  795 */     return this.renditaInizLordaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizLordaDiff10(Double renditaInizLordaDiff10) {
/*  800 */     this.renditaInizLordaDiff10 = renditaInizLordaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizLordaDiff15() {
/*  805 */     return this.renditaInizLordaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizLordaDiff15(Double renditaInizLordaDiff15) {
/*  810 */     this.renditaInizLordaDiff15 = renditaInizLordaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizLordaDiff5() {
/*  815 */     return this.renditaInizLordaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizLordaDiff5(Double renditaInizLordaDiff5) {
/*  820 */     this.renditaInizLordaDiff5 = renditaInizLordaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizLordaScad() {
/*  825 */     return this.renditaInizLordaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizLordaScad(Double renditaInizLordaScad) {
/*  830 */     this.renditaInizLordaScad = renditaInizLordaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizNettaDiff10() {
/*  835 */     return this.renditaInizNettaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizNettaDiff10(Double renditaInizNettaDiff10) {
/*  840 */     this.renditaInizNettaDiff10 = renditaInizNettaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizNettaDiff15() {
/*  845 */     return this.renditaInizNettaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizNettaDiff15(Double renditaInizNettaDiff15) {
/*  850 */     this.renditaInizNettaDiff15 = renditaInizNettaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizNettaDiff5() {
/*  855 */     return this.renditaInizNettaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizNettaDiff5(Double renditaInizNettaDiff5) {
/*  860 */     this.renditaInizNettaDiff5 = renditaInizNettaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaInizNettaScad() {
/*  865 */     return this.renditaInizNettaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaInizNettaScad(Double renditaInizNettaScad) {
/*  870 */     this.renditaInizNettaScad = renditaInizNettaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaLordaAttesao() {
/*  875 */     return this.renditaLordaAttesao;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaLordaAttesao(Double renditaLordaAttesao) {
/*  880 */     this.renditaLordaAttesao = renditaLordaAttesao;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMinInizLordaDiff10() {
/*  885 */     return this.renditaMinInizLordaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMinInizLordaDiff10(Double renditaMinInizLordaDiff10) {
/*  890 */     this.renditaMinInizLordaDiff10 = renditaMinInizLordaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMinInizLordaDiff15() {
/*  895 */     return this.renditaMinInizLordaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMinInizLordaDiff15(Double renditaMinInizLordaDiff15) {
/*  900 */     this.renditaMinInizLordaDiff15 = renditaMinInizLordaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMinInizLordaDiff5() {
/*  905 */     return this.renditaMinInizLordaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMinInizLordaDiff5(Double renditaMinInizLordaDiff5) {
/*  910 */     this.renditaMinInizLordaDiff5 = renditaMinInizLordaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMinInizLordaScad() {
/*  915 */     return this.renditaMinInizLordaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMinInizLordaScad(Double renditaMinInizLordaScad) {
/*  920 */     this.renditaMinInizLordaScad = renditaMinInizLordaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMininizNettaDiff10() {
/*  925 */     return this.renditaMininizNettaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMininizNettaDiff10(Double renditaMininizNettaDiff10) {
/*  930 */     this.renditaMininizNettaDiff10 = renditaMininizNettaDiff10;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMininizNettaDiff15() {
/*  935 */     return this.renditaMininizNettaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMininizNettaDiff15(Double renditaMininizNettaDiff15) {
/*  940 */     this.renditaMininizNettaDiff15 = renditaMininizNettaDiff15;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMininizNettaDiff5() {
/*  945 */     return this.renditaMininizNettaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMininizNettaDiff5(Double renditaMininizNettaDiff5) {
/*  950 */     this.renditaMininizNettaDiff5 = renditaMininizNettaDiff5;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaMininizNettaScad() {
/*  955 */     return this.renditaMininizNettaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaMininizNettaScad(Double renditaMininizNettaScad) {
/*  960 */     this.renditaMininizNettaScad = renditaMininizNettaScad;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenditaNettaAttesao() {
/*  965 */     return this.renditaNettaAttesao;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenditaNettaAttesao(Double renditaNettaAttesao) {
/*  970 */     this.renditaNettaAttesao = renditaNettaAttesao;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendMinTrattAccum() {
/*  975 */     return this.rendMinTrattAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendMinTrattAccum(Double rendMinTrattAccum) {
/*  980 */     this.rendMinTrattAccum = rendMinTrattAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRendMinTrattDiff() {
/*  985 */     return this.rendMinTrattDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRendMinTrattDiff(Double rendMinTrattDiff) {
/*  990 */     this.rendMinTrattDiff = rendMinTrattDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenMingarTxTecnAccum() {
/*  995 */     return this.renMingarTxTecnAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenMingarTxTecnAccum(Double renMingarTxTecnAccum) {
/* 1000 */     this.renMingarTxTecnAccum = renMingarTxTecnAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRenMingarTxTecnDiff() {
/* 1005 */     return this.renMingarTxTecnDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRenMingarTxTecnDiff(Double renMingarTxTecnDiff) {
/* 1010 */     this.renMingarTxTecnDiff = renMingarTxTecnDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRiportoPremi() {
/* 1015 */     return this.riportoPremi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRiportoPremi(Double riportoPremi) {
/* 1020 */     this.riportoPremi = riportoPremi;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRiservaMatemAccum() {
/* 1025 */     return this.riservaMatemAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRiservaMatemAccum(Double riservaMatemAccum) {
/* 1030 */     this.riservaMatemAccum = riservaMatemAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getRiservaMatemDiff() {
/* 1035 */     return this.riservaMatemDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setRiservaMatemDiff(Double riservaMatemDiff) {
/* 1040 */     this.riservaMatemDiff = riservaMatemDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public Integer getTipoCop() {
/* 1045 */     return this.tipoCop;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipoCop(Integer tipoCop) {
/* 1050 */     this.tipoCop = tipoCop;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTipologiaPremi() {
/* 1055 */     return this.tipologiaPremi;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipologiaPremi(String tipologiaPremi) {
/* 1060 */     this.tipologiaPremi = tipologiaPremi;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTipoPrestPrev() {
/* 1065 */     return this.tipoPrestPrev;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipoPrestPrev(String tipoPrestPrev) {
/* 1070 */     this.tipoPrestPrev = tipoPrestPrev;
/*      */   }
/*      */ 
/*      */   
/*      */   public String getTipoRecord() {
/* 1075 */     return this.tipoRecord;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTipoRecord(String tipoRecord) {
/* 1080 */     this.tipoRecord = tipoRecord;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public Double getTxTecnRenditaAccum() {
/* 1088 */     return this.txTecnRenditaAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTxTecnRenditaAccum(Double txTecnRenditaAccum) {
/* 1093 */     this.txTecnRenditaAccum = txTecnRenditaAccum;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getTxTecnRenditaDiff() {
/* 1098 */     return this.txTecnRenditaDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTxTecnRenditaDiff(Double txTecnRenditaDiff) {
/* 1103 */     this.txTecnRenditaDiff = txTecnRenditaDiff;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getTxTecnRenditaErog() {
/* 1108 */     return this.txTecnRenditaErog;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setTxTecnRenditaErog(Double txTecnRenditaErog) {
/* 1113 */     this.txTecnRenditaErog = txTecnRenditaErog;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltimaRendAnnuaLorda() {
/* 1118 */     return this.ultimaRendAnnuaLorda;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltimaRendAnnuaLorda(Double ultimaRendAnnuaLorda) {
/* 1123 */     this.ultimaRendAnnuaLorda = ultimaRendAnnuaLorda;
/*      */   }
/*      */ 
/*      */   
/*      */   public Double getUltimaRendAnnuaNetta() {
/* 1128 */     return this.ultimaRendAnnuaNetta;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUltimaRendAnnuaNetta(Double ultimaRendAnnuaNetta) {
/* 1133 */     this.ultimaRendAnnuaNetta = ultimaRendAnnuaNetta;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public String getUtenteInserimento() {
/* 1140 */     return this.utenteInserimento;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setUtenteInserimento(String utenteInserimento) {
/* 1145 */     this.utenteInserimento = utenteInserimento;
/*      */   }
/*      */ 
/*      */   
/*      */   public FinPolizza getPolizza() {
/* 1150 */     return this.polizza;
/*      */   }
/*      */ 
/*      */   
/*      */   public void setPolizza(FinPolizza polizza) {
/* 1155 */     this.polizza = polizza;
/*      */   }
/*      */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinProiezionePolizza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */