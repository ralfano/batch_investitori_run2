/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxProiezionePolizza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoRecord;
/*     */   private Integer provPortafoglio;
/*     */   private Date dataElaborazione;
/*     */   private String filler1;
/*     */   private Integer compagnia;
/*     */   private Integer ramo;
/*     */   private String numeroContratto;
/*     */   private String filler2;
/*     */   private Date dataDecorrenzaContr;
/*     */   private Date dataScadenzaContr;
/*     */   private Date dataInPagPrem;
/*     */   private Date dataFinePagPrem;
/*     */   private Integer codStGiuCtr;
/*     */   private Integer codStOprCtr;
/*     */   private String filler3;
/*     */   private String flagDifferimento;
/*     */   private String flagProiezPoss;
/*     */   private String tipoPrestPrev;
/*     */   private String renditaGarantita;
/*     */   private Double importoPremiVersati;
/*     */   private Double importoUltPremiVers;
/*     */   private Double capitaleLordoScad;
/*     */   private Double capitaleLordoDiff5;
/*     */   private Double capitaleLordoDiff10;
/*     */   private Double capitaleLordoDiff15;
/*     */   private Double capitaleMinlordoScad;
/*     */   private Double capitaleMinlordoDiff5;
/*     */   private Double capitaleMinlordoDiff10;
/*     */   private Double capitaleMinlordoDiff15;
/*     */   private Double capitaleNettoScad;
/*     */   private Double capitaleNettoDiff5;
/*     */   private Double capitaleNettoDiff10;
/*     */   private Double capitaleNettoDiff15;
/*     */   private Double capitaleMinNettoScad;
/*     */   private Double capitaleMinNettoDiff5;
/*     */   private Double capitaleMinNettoDiff10;
/*     */   private Double capitaleMinNettoDiff15;
/*     */   private Double renditaInizLordaScad;
/*     */   private Double renditaInizLordaDiff5;
/*     */   private Double renditaInizLordaDiff10;
/*     */   private Double renditaInizLordaDiff15;
/*     */   private Double renditaMinInizLordaScad;
/*     */   private Double renditaMinInizLordaDiff5;
/*     */   private Double renditaMinInizLordaDiff10;
/*     */   private Double renditaMinInizLordaDiff15;
/*     */   private Double renditaInizNettaScad;
/*     */   private Double renditaInizNettaDiff5;
/*     */   private Double renditaInizNettaDiff10;
/*     */   private Double renditaInizNettaDiff15;
/*     */   private Double renditaMininizNettaScad;
/*     */   private Double renditaMininizNettaDiff5;
/*     */   private Double renditaMininizNettaDiff10;
/*     */   private Double renditaMininizNettaDiff15;
/*     */   private Double renditaLordaAttesao;
/*     */   private Double renditaNettaAttesao;
/*     */   private Double ultimaRendAnnuaLorda;
/*     */   private Double ultimaRendAnnuaNetta;
/*     */   private Integer maxAnniDas;
/*     */   private String filler4;
/*     */   private Integer progCop;
/*     */   private Integer tipoCop;
/*     */   private Integer flagCopPrinc;
/*     */   private Integer codValuta;
/*     */   private Double cambio;
/*     */   private String filler5;
/*     */   private String tipologiaPremi;
/*     */   private Double presta1BaseR;
/*     */   private Double presta1BonusBaseR;
/*     */   private Double presta2BaseR;
/*     */   private Double presta2BonusBaseR;
/*     */   private Double presta3BaseR;
/*     */   private Double presta3BonusBaseR;
/*     */   private Double riservaMatemAccum;
/*     */   private Double riservaMatemDiff;
/*     */   private Double rendimentoIsvap;
/*     */   private Double rendimMinGarAccum;
/*     */   private Double rendimMinGarDiff;
/*     */   private Double renMingarTxTecnAccum;
/*     */   private Double renMingarTxTecnDiff;
/*     */   private Double rendMinTrattAccum;
/*     */   private Double rendMinTrattDiff;
/*     */   private Double txTecnRenditaAccum;
/*     */   private Double txTecnRenditaDiff;
/*     */   private Double txTecnRenditaErog;
/*     */   private Double aliqRetrocessAccum;
/*     */   private Double aliqRetrocessDiff;
/*     */   private Double ipotesiIncremPremi;
/*     */   private Double impPremiVersatiUnit;
/*     */   private Double riportoPremi;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   
/*     */   public FlxProiezionePolizza() {}
/*     */   
/*     */   public FlxProiezionePolizza(Double accum, Double diff, Double cambio, Double diff10, Double diff15, Double diff5, Double scad, Double diff102, Double diff152, Double diff52, Double scad2, Double diff103, Double diff153, Double diff53, Double scad3, Double diff104, Double diff154, Double diff54, Double scad4, Integer ctr, Integer ctr2, Integer valuta, Integer compagnia, Date contr, Date elaborazione, Date prem, Date prem2, Date contr2, String filler1, String filler2, String filler3, String filler4, String filler5, Integer princ, String differimento, String poss, Double versati, Double vers, Double unit, Double premi, String istanza, Integer das, String contratto, Double baseR, Double baseR2, Double baseR3, Double baseR4, Double baseR5, Double baseR6, Integer cop, Integer portafoglio, Integer ramo, Double isvap, Double accum2, Double diff2, String garantita, Double diff105, Double diff155, Double diff55, Double scad5, Double diff106, Double diff156, Double diff56, Double scad6, Double attesao, Double diff107, Double diff157, Double diff57, Double scad7, Double diff108, Double diff158, Double diff58, Double scad8, Double attesao2, Double accum3, Double diff3, Double accum4, Double diff4, Double premi2, Double accum5, Double diff6, String elaborazione2, Integer cop2, String premi3, String prev, String record, Double accum6, Double diff7, Double erog, Double lorda, Double netta) {
/* 116 */     this.aliqRetrocessAccum = accum;
/* 117 */     this.aliqRetrocessDiff = diff;
/* 118 */     this.cambio = cambio;
/* 119 */     this.capitaleLordoDiff10 = diff10;
/* 120 */     this.capitaleLordoDiff15 = diff15;
/* 121 */     this.capitaleLordoDiff5 = diff5;
/* 122 */     this.capitaleLordoScad = scad;
/* 123 */     this.capitaleMinlordoDiff10 = diff102;
/* 124 */     this.capitaleMinlordoDiff15 = diff152;
/* 125 */     this.capitaleMinlordoDiff5 = diff52;
/* 126 */     this.capitaleMinlordoScad = scad2;
/* 127 */     this.capitaleMinNettoDiff10 = diff103;
/* 128 */     this.capitaleMinNettoDiff15 = diff153;
/* 129 */     this.capitaleMinNettoDiff5 = diff53;
/* 130 */     this.capitaleMinNettoScad = scad3;
/* 131 */     this.capitaleNettoDiff10 = diff104;
/* 132 */     this.capitaleNettoDiff15 = diff154;
/* 133 */     this.capitaleNettoDiff5 = diff54;
/* 134 */     this.capitaleNettoScad = scad4;
/* 135 */     this.codStGiuCtr = ctr;
/* 136 */     this.codStOprCtr = ctr2;
/* 137 */     this.codValuta = valuta;
/* 138 */     this.compagnia = compagnia;
/* 139 */     this.dataDecorrenzaContr = contr;
/* 140 */     this.dataElaborazione = elaborazione;
/* 141 */     this.dataFinePagPrem = prem;
/* 142 */     this.dataInPagPrem = prem2;
/* 143 */     this.dataScadenzaContr = contr2;
/* 144 */     this.filler1 = filler1;
/* 145 */     this.filler2 = filler2;
/* 146 */     this.filler3 = filler3;
/* 147 */     this.filler4 = filler4;
/* 148 */     this.filler5 = filler5;
/* 149 */     this.flagCopPrinc = princ;
/* 150 */     this.flagDifferimento = differimento;
/* 151 */     this.flagProiezPoss = poss;
/* 152 */     this.importoPremiVersati = versati;
/* 153 */     this.importoUltPremiVers = vers;
/* 154 */     this.impPremiVersatiUnit = unit;
/* 155 */     this.ipotesiIncremPremi = premi;
/* 156 */     this.istanza = istanza;
/* 157 */     this.maxAnniDas = das;
/* 158 */     this.numeroContratto = contratto;
/* 159 */     this.presta1BaseR = baseR;
/* 160 */     this.presta1BonusBaseR = baseR2;
/* 161 */     this.presta2BaseR = baseR3;
/* 162 */     this.presta2BonusBaseR = baseR4;
/* 163 */     this.presta3BaseR = baseR5;
/* 164 */     this.presta3BonusBaseR = baseR6;
/* 165 */     this.progCop = cop;
/* 166 */     this.provPortafoglio = portafoglio;
/* 167 */     this.ramo = ramo;
/* 168 */     this.rendimentoIsvap = isvap;
/* 169 */     this.rendimMinGarAccum = accum2;
/* 170 */     this.rendimMinGarDiff = diff2;
/* 171 */     this.renditaGarantita = garantita;
/* 172 */     this.renditaInizLordaDiff10 = diff105;
/* 173 */     this.renditaInizLordaDiff15 = diff155;
/* 174 */     this.renditaInizLordaDiff5 = diff55;
/* 175 */     this.renditaInizLordaScad = scad5;
/* 176 */     this.renditaInizNettaDiff10 = diff106;
/* 177 */     this.renditaInizNettaDiff15 = diff156;
/* 178 */     this.renditaInizNettaDiff5 = diff56;
/* 179 */     this.renditaInizNettaScad = scad6;
/* 180 */     this.renditaLordaAttesao = attesao;
/* 181 */     this.renditaMinInizLordaDiff10 = diff107;
/* 182 */     this.renditaMinInizLordaDiff15 = diff157;
/* 183 */     this.renditaMinInizLordaDiff5 = diff57;
/* 184 */     this.renditaMinInizLordaScad = scad7;
/* 185 */     this.renditaMininizNettaDiff10 = diff108;
/* 186 */     this.renditaMininizNettaDiff15 = diff158;
/* 187 */     this.renditaMininizNettaDiff5 = diff58;
/* 188 */     this.renditaMininizNettaScad = scad8;
/* 189 */     this.renditaNettaAttesao = attesao2;
/* 190 */     this.rendMinTrattAccum = accum3;
/* 191 */     this.rendMinTrattDiff = diff3;
/* 192 */     this.renMingarTxTecnAccum = accum4;
/* 193 */     this.renMingarTxTecnDiff = diff4;
/* 194 */     this.riportoPremi = premi2;
/* 195 */     this.riservaMatemAccum = accum5;
/* 196 */     this.riservaMatemDiff = diff6;
/* 197 */     this.statoElaborazione = elaborazione2;
/* 198 */     this.tipoCop = cop2;
/* 199 */     this.tipologiaPremi = premi3;
/* 200 */     this.tipoPrestPrev = prev;
/* 201 */     this.tipoRecord = record;
/* 202 */     this.txTecnRenditaAccum = accum6;
/* 203 */     this.txTecnRenditaDiff = diff7;
/* 204 */     this.txTecnRenditaErog = erog;
/* 205 */     this.ultimaRendAnnuaLorda = lorda;
/* 206 */     this.ultimaRendAnnuaNetta = netta;
/*     */   }
/*     */   public Double getAliqRetrocessAccum() {
/* 209 */     return this.aliqRetrocessAccum;
/*     */   }
/*     */   public void setAliqRetrocessAccum(Double aliqRetrocessAccum) {
/* 212 */     this.aliqRetrocessAccum = aliqRetrocessAccum;
/*     */   }
/*     */   public Double getAliqRetrocessDiff() {
/* 215 */     return this.aliqRetrocessDiff;
/*     */   }
/*     */   public void setAliqRetrocessDiff(Double aliqRetrocessDiff) {
/* 218 */     this.aliqRetrocessDiff = aliqRetrocessDiff;
/*     */   }
/*     */   public Double getCambio() {
/* 221 */     return this.cambio;
/*     */   }
/*     */   public void setCambio(Double cambio) {
/* 224 */     this.cambio = cambio;
/*     */   }
/*     */   public Double getCapitaleLordoDiff10() {
/* 227 */     return this.capitaleLordoDiff10;
/*     */   }
/*     */   public void setCapitaleLordoDiff10(Double capitaleLordoDiff10) {
/* 230 */     this.capitaleLordoDiff10 = capitaleLordoDiff10;
/*     */   }
/*     */   public Double getCapitaleLordoDiff15() {
/* 233 */     return this.capitaleLordoDiff15;
/*     */   }
/*     */   public void setCapitaleLordoDiff15(Double capitaleLordoDiff15) {
/* 236 */     this.capitaleLordoDiff15 = capitaleLordoDiff15;
/*     */   }
/*     */   public Double getCapitaleLordoDiff5() {
/* 239 */     return this.capitaleLordoDiff5;
/*     */   }
/*     */   public void setCapitaleLordoDiff5(Double capitaleLordoDiff5) {
/* 242 */     this.capitaleLordoDiff5 = capitaleLordoDiff5;
/*     */   }
/*     */   public Double getCapitaleLordoScad() {
/* 245 */     return this.capitaleLordoScad;
/*     */   }
/*     */   public void setCapitaleLordoScad(Double capitaleLordoScad) {
/* 248 */     this.capitaleLordoScad = capitaleLordoScad;
/*     */   }
/*     */   public Double getCapitaleMinlordoDiff10() {
/* 251 */     return this.capitaleMinlordoDiff10;
/*     */   }
/*     */   public void setCapitaleMinlordoDiff10(Double capitaleMinlordoDiff10) {
/* 254 */     this.capitaleMinlordoDiff10 = capitaleMinlordoDiff10;
/*     */   }
/*     */   public Double getCapitaleMinlordoDiff15() {
/* 257 */     return this.capitaleMinlordoDiff15;
/*     */   }
/*     */   public void setCapitaleMinlordoDiff15(Double capitaleMinlordoDiff15) {
/* 260 */     this.capitaleMinlordoDiff15 = capitaleMinlordoDiff15;
/*     */   }
/*     */   public Double getCapitaleMinlordoDiff5() {
/* 263 */     return this.capitaleMinlordoDiff5;
/*     */   }
/*     */   public void setCapitaleMinlordoDiff5(Double capitaleMinlordoDiff5) {
/* 266 */     this.capitaleMinlordoDiff5 = capitaleMinlordoDiff5;
/*     */   }
/*     */   public Double getCapitaleMinlordoScad() {
/* 269 */     return this.capitaleMinlordoScad;
/*     */   }
/*     */   public void setCapitaleMinlordoScad(Double capitaleMinlordoScad) {
/* 272 */     this.capitaleMinlordoScad = capitaleMinlordoScad;
/*     */   }
/*     */   public Double getCapitaleMinNettoDiff10() {
/* 275 */     return this.capitaleMinNettoDiff10;
/*     */   }
/*     */   public void setCapitaleMinNettoDiff10(Double capitaleMinNettoDiff10) {
/* 278 */     this.capitaleMinNettoDiff10 = capitaleMinNettoDiff10;
/*     */   }
/*     */   public Double getCapitaleMinNettoDiff15() {
/* 281 */     return this.capitaleMinNettoDiff15;
/*     */   }
/*     */   public void setCapitaleMinNettoDiff15(Double capitaleMinNettoDiff15) {
/* 284 */     this.capitaleMinNettoDiff15 = capitaleMinNettoDiff15;
/*     */   }
/*     */   public Double getCapitaleMinNettoDiff5() {
/* 287 */     return this.capitaleMinNettoDiff5;
/*     */   }
/*     */   public void setCapitaleMinNettoDiff5(Double capitaleMinNettoDiff5) {
/* 290 */     this.capitaleMinNettoDiff5 = capitaleMinNettoDiff5;
/*     */   }
/*     */   public Double getCapitaleMinNettoScad() {
/* 293 */     return this.capitaleMinNettoScad;
/*     */   }
/*     */   public void setCapitaleMinNettoScad(Double capitaleMinNettoScad) {
/* 296 */     this.capitaleMinNettoScad = capitaleMinNettoScad;
/*     */   }
/*     */   public Double getCapitaleNettoDiff10() {
/* 299 */     return this.capitaleNettoDiff10;
/*     */   }
/*     */   public void setCapitaleNettoDiff10(Double capitaleNettoDiff10) {
/* 302 */     this.capitaleNettoDiff10 = capitaleNettoDiff10;
/*     */   }
/*     */   public Double getCapitaleNettoDiff15() {
/* 305 */     return this.capitaleNettoDiff15;
/*     */   }
/*     */   public void setCapitaleNettoDiff15(Double capitaleNettoDiff15) {
/* 308 */     this.capitaleNettoDiff15 = capitaleNettoDiff15;
/*     */   }
/*     */   public Double getCapitaleNettoDiff5() {
/* 311 */     return this.capitaleNettoDiff5;
/*     */   }
/*     */   public void setCapitaleNettoDiff5(Double capitaleNettoDiff5) {
/* 314 */     this.capitaleNettoDiff5 = capitaleNettoDiff5;
/*     */   }
/*     */   public Double getCapitaleNettoScad() {
/* 317 */     return this.capitaleNettoScad;
/*     */   }
/*     */   public void setCapitaleNettoScad(Double capitaleNettoScad) {
/* 320 */     this.capitaleNettoScad = capitaleNettoScad;
/*     */   }
/*     */   public Integer getCodStGiuCtr() {
/* 323 */     return this.codStGiuCtr;
/*     */   }
/*     */   public void setCodStGiuCtr(Integer codStGiuCtr) {
/* 326 */     this.codStGiuCtr = codStGiuCtr;
/*     */   }
/*     */   public Integer getCodStOprCtr() {
/* 329 */     return this.codStOprCtr;
/*     */   }
/*     */   public void setCodStOprCtr(Integer codStOprCtr) {
/* 332 */     this.codStOprCtr = codStOprCtr;
/*     */   }
/*     */   public Integer getCodValuta() {
/* 335 */     return this.codValuta;
/*     */   }
/*     */   public void setCodValuta(Integer codValuta) {
/* 338 */     this.codValuta = codValuta;
/*     */   }
/*     */   public Integer getCompagnia() {
/* 341 */     return this.compagnia;
/*     */   }
/*     */   public void setCompagnia(Integer compagnia) {
/* 344 */     this.compagnia = compagnia;
/*     */   }
/*     */   public Date getDataDecorrenzaContr() {
/* 347 */     return this.dataDecorrenzaContr;
/*     */   }
/*     */   public void setDataDecorrenzaContr(Date dataDecorrenzaContr) {
/* 350 */     this.dataDecorrenzaContr = dataDecorrenzaContr;
/*     */   }
/*     */   public Date getDataElaborazione() {
/* 353 */     return this.dataElaborazione;
/*     */   }
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 356 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   public Date getDataFinePagPrem() {
/* 359 */     return this.dataFinePagPrem;
/*     */   }
/*     */   public void setDataFinePagPrem(Date dataFinePagPrem) {
/* 362 */     this.dataFinePagPrem = dataFinePagPrem;
/*     */   }
/*     */   public Date getDataInPagPrem() {
/* 365 */     return this.dataInPagPrem;
/*     */   }
/*     */   public void setDataInPagPrem(Date dataInPagPrem) {
/* 368 */     this.dataInPagPrem = dataInPagPrem;
/*     */   }
/*     */   public Date getDataScadenzaContr() {
/* 371 */     return this.dataScadenzaContr;
/*     */   }
/*     */   public void setDataScadenzaContr(Date dataScadenzaContr) {
/* 374 */     this.dataScadenzaContr = dataScadenzaContr;
/*     */   }
/*     */   public String getFiller1() {
/* 377 */     return this.filler1;
/*     */   }
/*     */   public void setFiller1(String filler1) {
/* 380 */     this.filler1 = filler1;
/*     */   }
/*     */   public String getFiller2() {
/* 383 */     return this.filler2;
/*     */   }
/*     */   public void setFiller2(String filler2) {
/* 386 */     this.filler2 = filler2;
/*     */   }
/*     */   public String getFiller3() {
/* 389 */     return this.filler3;
/*     */   }
/*     */   public void setFiller3(String filler3) {
/* 392 */     this.filler3 = filler3;
/*     */   }
/*     */   public String getFiller4() {
/* 395 */     return this.filler4;
/*     */   }
/*     */   public void setFiller4(String filler4) {
/* 398 */     this.filler4 = filler4;
/*     */   }
/*     */   public String getFiller5() {
/* 401 */     return this.filler5;
/*     */   }
/*     */   public void setFiller5(String filler5) {
/* 404 */     this.filler5 = filler5;
/*     */   }
/*     */   public Integer getFlagCopPrinc() {
/* 407 */     return this.flagCopPrinc;
/*     */   }
/*     */   public void setFlagCopPrinc(Integer flagCopPrinc) {
/* 410 */     this.flagCopPrinc = flagCopPrinc;
/*     */   }
/*     */   public String getFlagDifferimento() {
/* 413 */     return this.flagDifferimento;
/*     */   }
/*     */   public void setFlagDifferimento(String flagDifferimento) {
/* 416 */     this.flagDifferimento = flagDifferimento;
/*     */   }
/*     */   public String getFlagProiezPoss() {
/* 419 */     return this.flagProiezPoss;
/*     */   }
/*     */   public void setFlagProiezPoss(String flagProiezPoss) {
/* 422 */     this.flagProiezPoss = flagProiezPoss;
/*     */   }
/*     */   public Integer getFlxId() {
/* 425 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 428 */     this.flxId = flxId;
/*     */   }
/*     */   public Double getImportoPremiVersati() {
/* 431 */     return this.importoPremiVersati;
/*     */   }
/*     */   public void setImportoPremiVersati(Double importoPremiVersati) {
/* 434 */     this.importoPremiVersati = importoPremiVersati;
/*     */   }
/*     */   public Double getImportoUltPremiVers() {
/* 437 */     return this.importoUltPremiVers;
/*     */   }
/*     */   public void setImportoUltPremiVers(Double importoUltPremiVers) {
/* 440 */     this.importoUltPremiVers = importoUltPremiVers;
/*     */   }
/*     */   public Double getImpPremiVersatiUnit() {
/* 443 */     return this.impPremiVersatiUnit;
/*     */   }
/*     */   public void setImpPremiVersatiUnit(Double impPremiVersatiUnit) {
/* 446 */     this.impPremiVersatiUnit = impPremiVersatiUnit;
/*     */   }
/*     */   public Double getIpotesiIncremPremi() {
/* 449 */     return this.ipotesiIncremPremi;
/*     */   }
/*     */   public void setIpotesiIncremPremi(Double ipotesiIncremPremi) {
/* 452 */     this.ipotesiIncremPremi = ipotesiIncremPremi;
/*     */   }
/*     */   public String getIstanza() {
/* 455 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 458 */     this.istanza = istanza;
/*     */   }
/*     */   public Integer getMaxAnniDas() {
/* 461 */     return this.maxAnniDas;
/*     */   }
/*     */   public void setMaxAnniDas(Integer maxAnniDas) {
/* 464 */     this.maxAnniDas = maxAnniDas;
/*     */   }
/*     */   public String getNumeroContratto() {
/* 467 */     return this.numeroContratto;
/*     */   }
/*     */   public void setNumeroContratto(String numeroContratto) {
/* 470 */     this.numeroContratto = numeroContratto;
/*     */   }
/*     */   public Double getPresta1BaseR() {
/* 473 */     return this.presta1BaseR;
/*     */   }
/*     */   public void setPresta1BaseR(Double presta1BaseR) {
/* 476 */     this.presta1BaseR = presta1BaseR;
/*     */   }
/*     */   public Double getPresta1BonusBaseR() {
/* 479 */     return this.presta1BonusBaseR;
/*     */   }
/*     */   public void setPresta1BonusBaseR(Double presta1BonusBaseR) {
/* 482 */     this.presta1BonusBaseR = presta1BonusBaseR;
/*     */   }
/*     */   public Double getPresta2BaseR() {
/* 485 */     return this.presta2BaseR;
/*     */   }
/*     */   public void setPresta2BaseR(Double presta2BaseR) {
/* 488 */     this.presta2BaseR = presta2BaseR;
/*     */   }
/*     */   public Double getPresta2BonusBaseR() {
/* 491 */     return this.presta2BonusBaseR;
/*     */   }
/*     */   public void setPresta2BonusBaseR(Double presta2BonusBaseR) {
/* 494 */     this.presta2BonusBaseR = presta2BonusBaseR;
/*     */   }
/*     */   public Double getPresta3BaseR() {
/* 497 */     return this.presta3BaseR;
/*     */   }
/*     */   public void setPresta3BaseR(Double presta3BaseR) {
/* 500 */     this.presta3BaseR = presta3BaseR;
/*     */   }
/*     */   public Double getPresta3BonusBaseR() {
/* 503 */     return this.presta3BonusBaseR;
/*     */   }
/*     */   public void setPresta3BonusBaseR(Double presta3BonusBaseR) {
/* 506 */     this.presta3BonusBaseR = presta3BonusBaseR;
/*     */   }
/*     */   public Integer getProgCop() {
/* 509 */     return this.progCop;
/*     */   }
/*     */   public void setProgCop(Integer progCop) {
/* 512 */     this.progCop = progCop;
/*     */   }
/*     */   public Integer getProvPortafoglio() {
/* 515 */     return this.provPortafoglio;
/*     */   }
/*     */   public void setProvPortafoglio(Integer provPortafoglio) {
/* 518 */     this.provPortafoglio = provPortafoglio;
/*     */   }
/*     */   public Integer getRamo() {
/* 521 */     return this.ramo;
/*     */   }
/*     */   public void setRamo(Integer ramo) {
/* 524 */     this.ramo = ramo;
/*     */   }
/*     */   public Double getRendimentoIsvap() {
/* 527 */     return this.rendimentoIsvap;
/*     */   }
/*     */   public void setRendimentoIsvap(Double rendimentoIsvap) {
/* 530 */     this.rendimentoIsvap = rendimentoIsvap;
/*     */   }
/*     */   public Double getRendimMinGarAccum() {
/* 533 */     return this.rendimMinGarAccum;
/*     */   }
/*     */   public void setRendimMinGarAccum(Double rendimMinGarAccum) {
/* 536 */     this.rendimMinGarAccum = rendimMinGarAccum;
/*     */   }
/*     */   public Double getRendimMinGarDiff() {
/* 539 */     return this.rendimMinGarDiff;
/*     */   }
/*     */   public void setRendimMinGarDiff(Double rendimMinGarDiff) {
/* 542 */     this.rendimMinGarDiff = rendimMinGarDiff;
/*     */   }
/*     */   public String getRenditaGarantita() {
/* 545 */     return this.renditaGarantita;
/*     */   }
/*     */   public void setRenditaGarantita(String renditaGarantita) {
/* 548 */     this.renditaGarantita = renditaGarantita;
/*     */   }
/*     */   public Double getRenditaInizLordaDiff10() {
/* 551 */     return this.renditaInizLordaDiff10;
/*     */   }
/*     */   public void setRenditaInizLordaDiff10(Double renditaInizLordaDiff10) {
/* 554 */     this.renditaInizLordaDiff10 = renditaInizLordaDiff10;
/*     */   }
/*     */   public Double getRenditaInizLordaDiff15() {
/* 557 */     return this.renditaInizLordaDiff15;
/*     */   }
/*     */   public void setRenditaInizLordaDiff15(Double renditaInizLordaDiff15) {
/* 560 */     this.renditaInizLordaDiff15 = renditaInizLordaDiff15;
/*     */   }
/*     */   public Double getRenditaInizLordaDiff5() {
/* 563 */     return this.renditaInizLordaDiff5;
/*     */   }
/*     */   public void setRenditaInizLordaDiff5(Double renditaInizLordaDiff5) {
/* 566 */     this.renditaInizLordaDiff5 = renditaInizLordaDiff5;
/*     */   }
/*     */   public Double getRenditaInizLordaScad() {
/* 569 */     return this.renditaInizLordaScad;
/*     */   }
/*     */   public void setRenditaInizLordaScad(Double renditaInizLordaScad) {
/* 572 */     this.renditaInizLordaScad = renditaInizLordaScad;
/*     */   }
/*     */   public Double getRenditaInizNettaDiff10() {
/* 575 */     return this.renditaInizNettaDiff10;
/*     */   }
/*     */   public void setRenditaInizNettaDiff10(Double renditaInizNettaDiff10) {
/* 578 */     this.renditaInizNettaDiff10 = renditaInizNettaDiff10;
/*     */   }
/*     */   public Double getRenditaInizNettaDiff15() {
/* 581 */     return this.renditaInizNettaDiff15;
/*     */   }
/*     */   public void setRenditaInizNettaDiff15(Double renditaInizNettaDiff15) {
/* 584 */     this.renditaInizNettaDiff15 = renditaInizNettaDiff15;
/*     */   }
/*     */   public Double getRenditaInizNettaDiff5() {
/* 587 */     return this.renditaInizNettaDiff5;
/*     */   }
/*     */   public void setRenditaInizNettaDiff5(Double renditaInizNettaDiff5) {
/* 590 */     this.renditaInizNettaDiff5 = renditaInizNettaDiff5;
/*     */   }
/*     */   public Double getRenditaInizNettaScad() {
/* 593 */     return this.renditaInizNettaScad;
/*     */   }
/*     */   public void setRenditaInizNettaScad(Double renditaInizNettaScad) {
/* 596 */     this.renditaInizNettaScad = renditaInizNettaScad;
/*     */   }
/*     */   public Double getRenditaLordaAttesao() {
/* 599 */     return this.renditaLordaAttesao;
/*     */   }
/*     */   public void setRenditaLordaAttesao(Double renditaLordaAttesao) {
/* 602 */     this.renditaLordaAttesao = renditaLordaAttesao;
/*     */   }
/*     */   public Double getRenditaMinInizLordaDiff10() {
/* 605 */     return this.renditaMinInizLordaDiff10;
/*     */   }
/*     */   public void setRenditaMinInizLordaDiff10(Double renditaMinInizLordaDiff10) {
/* 608 */     this.renditaMinInizLordaDiff10 = renditaMinInizLordaDiff10;
/*     */   }
/*     */   public Double getRenditaMinInizLordaDiff15() {
/* 611 */     return this.renditaMinInizLordaDiff15;
/*     */   }
/*     */   public void setRenditaMinInizLordaDiff15(Double renditaMinInizLordaDiff15) {
/* 614 */     this.renditaMinInizLordaDiff15 = renditaMinInizLordaDiff15;
/*     */   }
/*     */   public Double getRenditaMinInizLordaDiff5() {
/* 617 */     return this.renditaMinInizLordaDiff5;
/*     */   }
/*     */   public void setRenditaMinInizLordaDiff5(Double renditaMinInizLordaDiff5) {
/* 620 */     this.renditaMinInizLordaDiff5 = renditaMinInizLordaDiff5;
/*     */   }
/*     */   public Double getRenditaMinInizLordaScad() {
/* 623 */     return this.renditaMinInizLordaScad;
/*     */   }
/*     */   public void setRenditaMinInizLordaScad(Double renditaMinInizLordaScad) {
/* 626 */     this.renditaMinInizLordaScad = renditaMinInizLordaScad;
/*     */   }
/*     */   public Double getRenditaMininizNettaDiff10() {
/* 629 */     return this.renditaMininizNettaDiff10;
/*     */   }
/*     */   public void setRenditaMininizNettaDiff10(Double renditaMininizNettaDiff10) {
/* 632 */     this.renditaMininizNettaDiff10 = renditaMininizNettaDiff10;
/*     */   }
/*     */   public Double getRenditaMininizNettaDiff15() {
/* 635 */     return this.renditaMininizNettaDiff15;
/*     */   }
/*     */   public void setRenditaMininizNettaDiff15(Double renditaMininizNettaDiff15) {
/* 638 */     this.renditaMininizNettaDiff15 = renditaMininizNettaDiff15;
/*     */   }
/*     */   public Double getRenditaMininizNettaDiff5() {
/* 641 */     return this.renditaMininizNettaDiff5;
/*     */   }
/*     */   public void setRenditaMininizNettaDiff5(Double renditaMininizNettaDiff5) {
/* 644 */     this.renditaMininizNettaDiff5 = renditaMininizNettaDiff5;
/*     */   }
/*     */   public Double getRenditaMininizNettaScad() {
/* 647 */     return this.renditaMininizNettaScad;
/*     */   }
/*     */   public void setRenditaMininizNettaScad(Double renditaMininizNettaScad) {
/* 650 */     this.renditaMininizNettaScad = renditaMininizNettaScad;
/*     */   }
/*     */   public Double getRenditaNettaAttesao() {
/* 653 */     return this.renditaNettaAttesao;
/*     */   }
/*     */   public void setRenditaNettaAttesao(Double renditaNettaAttesao) {
/* 656 */     this.renditaNettaAttesao = renditaNettaAttesao;
/*     */   }
/*     */   public Double getRendMinTrattAccum() {
/* 659 */     return this.rendMinTrattAccum;
/*     */   }
/*     */   public void setRendMinTrattAccum(Double rendMinTrattAccum) {
/* 662 */     this.rendMinTrattAccum = rendMinTrattAccum;
/*     */   }
/*     */   public Double getRendMinTrattDiff() {
/* 665 */     return this.rendMinTrattDiff;
/*     */   }
/*     */   public void setRendMinTrattDiff(Double rendMinTrattDiff) {
/* 668 */     this.rendMinTrattDiff = rendMinTrattDiff;
/*     */   }
/*     */   public Double getRenMingarTxTecnAccum() {
/* 671 */     return this.renMingarTxTecnAccum;
/*     */   }
/*     */   public void setRenMingarTxTecnAccum(Double renMingarTxTecnAccum) {
/* 674 */     this.renMingarTxTecnAccum = renMingarTxTecnAccum;
/*     */   }
/*     */   public Double getRenMingarTxTecnDiff() {
/* 677 */     return this.renMingarTxTecnDiff;
/*     */   }
/*     */   public void setRenMingarTxTecnDiff(Double renMingarTxTecnDiff) {
/* 680 */     this.renMingarTxTecnDiff = renMingarTxTecnDiff;
/*     */   }
/*     */   public Double getRiportoPremi() {
/* 683 */     return this.riportoPremi;
/*     */   }
/*     */   public void setRiportoPremi(Double riportoPremi) {
/* 686 */     this.riportoPremi = riportoPremi;
/*     */   }
/*     */   public Double getRiservaMatemAccum() {
/* 689 */     return this.riservaMatemAccum;
/*     */   }
/*     */   public void setRiservaMatemAccum(Double riservaMatemAccum) {
/* 692 */     this.riservaMatemAccum = riservaMatemAccum;
/*     */   }
/*     */   public Double getRiservaMatemDiff() {
/* 695 */     return this.riservaMatemDiff;
/*     */   }
/*     */   public void setRiservaMatemDiff(Double riservaMatemDiff) {
/* 698 */     this.riservaMatemDiff = riservaMatemDiff;
/*     */   }
/*     */   public String getStatoElaborazione() {
/* 701 */     return this.statoElaborazione;
/*     */   }
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 704 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   public Integer getTipoCop() {
/* 707 */     return this.tipoCop;
/*     */   }
/*     */   public void setTipoCop(Integer tipoCop) {
/* 710 */     this.tipoCop = tipoCop;
/*     */   }
/*     */   public String getTipologiaPremi() {
/* 713 */     return this.tipologiaPremi;
/*     */   }
/*     */   public void setTipologiaPremi(String tipologiaPremi) {
/* 716 */     this.tipologiaPremi = tipologiaPremi;
/*     */   }
/*     */   public String getTipoPrestPrev() {
/* 719 */     return this.tipoPrestPrev;
/*     */   }
/*     */   public void setTipoPrestPrev(String tipoPrestPrev) {
/* 722 */     this.tipoPrestPrev = tipoPrestPrev;
/*     */   }
/*     */   public String getTipoRecord() {
/* 725 */     return this.tipoRecord;
/*     */   }
/*     */   public void setTipoRecord(String tipoRecord) {
/* 728 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */   public Double getTxTecnRenditaAccum() {
/* 731 */     return this.txTecnRenditaAccum;
/*     */   }
/*     */   public void setTxTecnRenditaAccum(Double txTecnRenditaAccum) {
/* 734 */     this.txTecnRenditaAccum = txTecnRenditaAccum;
/*     */   }
/*     */   public Double getTxTecnRenditaDiff() {
/* 737 */     return this.txTecnRenditaDiff;
/*     */   }
/*     */   public void setTxTecnRenditaDiff(Double txTecnRenditaDiff) {
/* 740 */     this.txTecnRenditaDiff = txTecnRenditaDiff;
/*     */   }
/*     */   public Double getTxTecnRenditaErog() {
/* 743 */     return this.txTecnRenditaErog;
/*     */   }
/*     */   public void setTxTecnRenditaErog(Double txTecnRenditaErog) {
/* 746 */     this.txTecnRenditaErog = txTecnRenditaErog;
/*     */   }
/*     */   public Double getUltimaRendAnnuaLorda() {
/* 749 */     return this.ultimaRendAnnuaLorda;
/*     */   }
/*     */   public void setUltimaRendAnnuaLorda(Double ultimaRendAnnuaLorda) {
/* 752 */     this.ultimaRendAnnuaLorda = ultimaRendAnnuaLorda;
/*     */   }
/*     */   public Double getUltimaRendAnnuaNetta() {
/* 755 */     return this.ultimaRendAnnuaNetta;
/*     */   }
/*     */   public void setUltimaRendAnnuaNetta(Double ultimaRendAnnuaNetta) {
/* 758 */     this.ultimaRendAnnuaNetta = ultimaRendAnnuaNetta;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxProiezionePolizza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */