/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecAnagraficaClienti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codPersSec;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String denominazione;
/*     */   private String idePers;
/*     */   private String codFisco;
/*     */   private Date dtnascCost;
/*     */   private String sesso;
/*     */   private String luogoNascita;
/*     */   private String statoNascita;
/*     */   private String provNascita;
/*     */   private String capNascita;
/*     */   private String indirResid;
/*     */   private String capResid;
/*     */   private String comuneResid;
/*     */   private String provResid;
/*     */   private String nazioneResid;
/*     */   private String telAbit;
/*     */   private String telUfficio;
/*     */   private String telCell;
/*     */   private String fax;
/*     */   private String email;
/*     */   private Date dataElab;
/*     */   private Date timeElab;
/*     */   private String codTipoNdg;
/*     */   private String partitaIva;
/*     */   private String sae;
/*     */   private String rae;
/*     */   private Date dataIscrizRea;
/*     */   private String numeroRea;
/*     */   private String provinciaRea;
/*     */   private Date dataFondSoc;
/*     */   private String capitaleSociale;
/*     */   private String tipoDocum;
/*     */   private String numDocum;
/*     */   private String enteRilascio;
/*     */   private Date dataRilascio;
/*     */   private String luogoRilascio;
/*     */   private String provRilascio;
/*     */   private String nazioneRilascio;
/*     */   private Date dataScadenza;
/*     */   private String cittadinanza;
/*     */   private String statoCivile;
/*     */   private String regimePatrimon;
/*     */   private String iscrizCameraComm;
/*     */   private String privacy1;
/*     */   private String privacy2;
/*     */   private String privacy3;
/*     */   private String privacy4;
/*     */   private String privacy5;
/*     */   private String privacy6;
/*     */   private String privacy7;
/*     */   private String privacy8;
/*     */   private String privacy9;
/*     */   private Date dataPrivacy;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   private String codUserMc;
/*     */   private String statoRapportoMc;
/*     */   
/*     */   public String getCodUserMc() {
/*  77 */     return this.codUserMc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodUserMc(String codUserMc) {
/*  85 */     this.codUserMc = codUserMc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoRapportoMc() {
/*  93 */     return this.statoRapportoMc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoRapportoMc(String statoRapportoMc) {
/* 101 */     this.statoRapportoMc = statoRapportoMc;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecAnagraficaClienti(String sociale, String nascita, String resid, String cittadinanza, String fisco, String sec, String ndg, String cognome, String resid2, Date caricamento, Date elab, Date elaborazione, Date soc, Date rea, Date privacy, Date rilascio, Date scadenza, String denominazione, String errore, Date cost, String email, String rilascio2, String fax, Integer id, String pers, String resid3, String comm, String istanza, String nascita2, String rilascio3, String resid4, String rilascio4, String nome, String docum, String rea2, String iva, String privacy1, String privacy2, String privacy3, String privacy4, String privacy5, String privacy6, String privacy7, String privacy8, String privacy9, String rea3, String nascita3, String resid5, String rilascio5, String rae, String patrimon, String sae, String sesso, String civile, String elab2, String nascita4, String abit, String cell, String ufficio, Date elab3, String docum2) {
/* 108 */     this.capitaleSociale = sociale;
/* 109 */     this.capNascita = nascita;
/* 110 */     this.capResid = resid;
/* 111 */     this.cittadinanza = cittadinanza;
/* 112 */     this.codFisco = fisco;
/* 113 */     this.codPersSec = sec;
/* 114 */     this.codTipoNdg = ndg;
/* 115 */     this.cognome = cognome;
/* 116 */     this.comuneResid = resid2;
/* 117 */     this.dataCaricamento = caricamento;
/* 118 */     this.dataElab = elab;
/* 119 */     this.dataElaborazione = elaborazione;
/* 120 */     this.dataFondSoc = soc;
/* 121 */     this.dataIscrizRea = rea;
/* 122 */     this.dataPrivacy = privacy;
/* 123 */     this.dataRilascio = rilascio;
/* 124 */     this.dataScadenza = scadenza;
/* 125 */     this.denominazione = denominazione;
/* 126 */     this.descrizioneErrore = errore;
/* 127 */     this.dtnascCost = cost;
/* 128 */     this.email = email;
/* 129 */     this.enteRilascio = rilascio2;
/* 130 */     this.fax = fax;
/* 131 */     this.flxId = id;
/* 132 */     this.idePers = pers;
/* 133 */     this.indirResid = resid3;
/* 134 */     this.iscrizCameraComm = comm;
/* 135 */     this.istanza = istanza;
/* 136 */     this.luogoNascita = nascita2;
/* 137 */     this.luogoRilascio = rilascio3;
/* 138 */     this.nazioneResid = resid4;
/* 139 */     this.nazioneRilascio = rilascio4;
/* 140 */     this.nome = nome;
/* 141 */     this.numDocum = docum;
/* 142 */     this.numeroRea = rea2;
/* 143 */     this.partitaIva = iva;
/* 144 */     this.privacy1 = privacy1;
/* 145 */     this.privacy2 = privacy2;
/* 146 */     this.privacy3 = privacy3;
/* 147 */     this.privacy4 = privacy4;
/* 148 */     this.privacy5 = privacy5;
/* 149 */     this.privacy6 = privacy6;
/* 150 */     this.privacy7 = privacy7;
/* 151 */     this.privacy8 = privacy8;
/* 152 */     this.privacy9 = privacy9;
/* 153 */     this.provinciaRea = rea3;
/* 154 */     this.provNascita = nascita3;
/* 155 */     this.provResid = resid5;
/* 156 */     this.provRilascio = rilascio5;
/* 157 */     this.rae = rae;
/* 158 */     this.regimePatrimon = patrimon;
/* 159 */     this.sae = sae;
/* 160 */     this.sesso = sesso;
/* 161 */     this.statoCivile = civile;
/* 162 */     this.statoElab = elab2;
/* 163 */     this.statoNascita = nascita4;
/* 164 */     this.telAbit = abit;
/* 165 */     this.telCell = cell;
/* 166 */     this.telUfficio = ufficio;
/* 167 */     this.timeElab = elab3;
/* 168 */     this.tipoDocum = docum2;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataElaborazione() {
/* 173 */     return this.dataElaborazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 178 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 183 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 188 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecAnagraficaClienti(String sociale, String nascita, String resid, String cittadinanza, String fisco, String sec, String ndg, String cognome, String resid2, Date caricamento, Date elab, Date soc, Date rea, Date privacy, Date rilascio, Date scadenza, String denominazione, Date cost, String email, String rilascio2, String fax, Integer id, String pers, String resid3, String comm, String istanza, String nascita2, String rilascio3, String resid4, String rilascio4, String nome, String docum, String rea2, String iva, String privacy1, String privacy2, String privacy3, String privacy4, String privacy5, String privacy6, String privacy7, String privacy8, String privacy9, String rea3, String nascita3, String resid5, String rilascio5, String rae, String patrimon, String sae, String sesso, String civile, String elab2, String nascita4, String abit, String cell, String ufficio, Date elab3, String docum2) {
/* 195 */     this.capitaleSociale = sociale;
/* 196 */     this.capNascita = nascita;
/* 197 */     this.capResid = resid;
/* 198 */     this.cittadinanza = cittadinanza;
/* 199 */     this.codFisco = fisco;
/* 200 */     this.codPersSec = sec;
/* 201 */     this.codTipoNdg = ndg;
/* 202 */     this.cognome = cognome;
/* 203 */     this.comuneResid = resid2;
/* 204 */     this.dataCaricamento = caricamento;
/* 205 */     this.dataElab = elab;
/* 206 */     this.dataFondSoc = soc;
/* 207 */     this.dataIscrizRea = rea;
/* 208 */     this.dataPrivacy = privacy;
/* 209 */     this.dataRilascio = rilascio;
/* 210 */     this.dataScadenza = scadenza;
/* 211 */     this.denominazione = denominazione;
/* 212 */     this.dtnascCost = cost;
/* 213 */     this.email = email;
/* 214 */     this.enteRilascio = rilascio2;
/* 215 */     this.fax = fax;
/* 216 */     this.flxId = id;
/* 217 */     this.idePers = pers;
/* 218 */     this.indirResid = resid3;
/* 219 */     this.iscrizCameraComm = comm;
/* 220 */     this.istanza = istanza;
/* 221 */     this.luogoNascita = nascita2;
/* 222 */     this.luogoRilascio = rilascio3;
/* 223 */     this.nazioneResid = resid4;
/* 224 */     this.nazioneRilascio = rilascio4;
/* 225 */     this.nome = nome;
/* 226 */     this.numDocum = docum;
/* 227 */     this.numeroRea = rea2;
/* 228 */     this.partitaIva = iva;
/* 229 */     this.privacy1 = privacy1;
/* 230 */     this.privacy2 = privacy2;
/* 231 */     this.privacy3 = privacy3;
/* 232 */     this.privacy4 = privacy4;
/* 233 */     this.privacy5 = privacy5;
/* 234 */     this.privacy6 = privacy6;
/* 235 */     this.privacy7 = privacy7;
/* 236 */     this.privacy8 = privacy8;
/* 237 */     this.privacy9 = privacy9;
/* 238 */     this.provinciaRea = rea3;
/* 239 */     this.provNascita = nascita3;
/* 240 */     this.provResid = resid5;
/* 241 */     this.provRilascio = rilascio5;
/* 242 */     this.rae = rae;
/* 243 */     this.regimePatrimon = patrimon;
/* 244 */     this.sae = sae;
/* 245 */     this.sesso = sesso;
/* 246 */     this.statoCivile = civile;
/* 247 */     this.statoElab = elab2;
/* 248 */     this.statoNascita = nascita4;
/* 249 */     this.telAbit = abit;
/* 250 */     this.telCell = cell;
/* 251 */     this.telUfficio = ufficio;
/* 252 */     this.timeElab = elab3;
/* 253 */     this.tipoDocum = docum2;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 258 */     return this.flxId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 263 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecAnagraficaClienti() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCapitaleSociale() {
/* 274 */     return this.capitaleSociale;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCapitaleSociale(String capitaleSociale) {
/* 279 */     this.capitaleSociale = capitaleSociale;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCapNascita() {
/* 284 */     return this.capNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCapNascita(String capNascita) {
/* 289 */     this.capNascita = capNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCapResid() {
/* 294 */     return this.capResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCapResid(String capResid) {
/* 299 */     this.capResid = capResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCittadinanza() {
/* 304 */     return this.cittadinanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCittadinanza(String cittadinanza) {
/* 309 */     this.cittadinanza = cittadinanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodFisco() {
/* 314 */     return this.codFisco;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodFisco(String codFisco) {
/* 319 */     this.codFisco = codFisco;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodTipoNdg() {
/* 324 */     return this.codTipoNdg;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodTipoNdg(String codTipoNdg) {
/* 329 */     this.codTipoNdg = codTipoNdg;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCognome() {
/* 334 */     return this.cognome;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCognome(String cognome) {
/* 339 */     this.cognome = cognome;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getComuneResid() {
/* 344 */     return this.comuneResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setComuneResid(String comuneResid) {
/* 349 */     this.comuneResid = comuneResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/* 354 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 359 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFondSoc() {
/* 364 */     return this.dataFondSoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataFondSoc(Date dataFondSoc) {
/* 369 */     this.dataFondSoc = dataFondSoc;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataIscrizRea() {
/* 374 */     return this.dataIscrizRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataIscrizRea(Date dataIscrizRea) {
/* 379 */     this.dataIscrizRea = dataIscrizRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataPrivacy() {
/* 384 */     return this.dataPrivacy;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataPrivacy(Date dataPrivacy) {
/* 389 */     this.dataPrivacy = dataPrivacy;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataRilascio() {
/* 394 */     return this.dataRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataRilascio(Date dataRilascio) {
/* 399 */     this.dataRilascio = dataRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataScadenza() {
/* 404 */     return this.dataScadenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataScadenza(Date dataScadenza) {
/* 409 */     this.dataScadenza = dataScadenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDenominazione() {
/* 414 */     return this.denominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 419 */     this.denominazione = denominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDtnascCost() {
/* 424 */     return this.dtnascCost;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDtnascCost(Date dtnascCost) {
/* 429 */     this.dtnascCost = dtnascCost;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEmail() {
/* 434 */     return this.email;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEmail(String email) {
/* 439 */     this.email = email;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getEnteRilascio() {
/* 444 */     return this.enteRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setEnteRilascio(String enteRilascio) {
/* 449 */     this.enteRilascio = enteRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFax() {
/* 454 */     return this.fax;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFax(String fax) {
/* 459 */     this.fax = fax;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIdePers() {
/* 464 */     return this.idePers;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIdePers(String idePers) {
/* 469 */     this.idePers = idePers;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIndirResid() {
/* 474 */     return this.indirResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIndirResid(String indirResid) {
/* 479 */     this.indirResid = indirResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIscrizCameraComm() {
/* 484 */     return this.iscrizCameraComm;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIscrizCameraComm(String iscrizCameraComm) {
/* 489 */     this.iscrizCameraComm = iscrizCameraComm;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 494 */     return this.istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 499 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLuogoNascita() {
/* 504 */     return this.luogoNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLuogoNascita(String luogoNascita) {
/* 509 */     this.luogoNascita = luogoNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getLuogoRilascio() {
/* 514 */     return this.luogoRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLuogoRilascio(String luogoRilascio) {
/* 519 */     this.luogoRilascio = luogoRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNazioneResid() {
/* 524 */     return this.nazioneResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNazioneResid(String nazioneResid) {
/* 529 */     this.nazioneResid = nazioneResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNazioneRilascio() {
/* 534 */     return this.nazioneRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNazioneRilascio(String nazioneRilascio) {
/* 539 */     this.nazioneRilascio = nazioneRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNome() {
/* 544 */     return this.nome;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNome(String nome) {
/* 549 */     this.nome = nome;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNumDocum() {
/* 554 */     return this.numDocum;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumDocum(String numDocum) {
/* 559 */     this.numDocum = numDocum;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNumeroRea() {
/* 564 */     return this.numeroRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumeroRea(String numeroRea) {
/* 569 */     this.numeroRea = numeroRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPartitaIva() {
/* 574 */     return this.partitaIva;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPartitaIva(String partitaIva) {
/* 579 */     this.partitaIva = partitaIva;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy1() {
/* 584 */     return this.privacy1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy1(String privacy1) {
/* 589 */     this.privacy1 = privacy1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy2() {
/* 594 */     return this.privacy2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy2(String privacy2) {
/* 599 */     this.privacy2 = privacy2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy3() {
/* 604 */     return this.privacy3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy3(String privacy3) {
/* 609 */     this.privacy3 = privacy3;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy4() {
/* 614 */     return this.privacy4;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy4(String privacy4) {
/* 619 */     this.privacy4 = privacy4;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy5() {
/* 624 */     return this.privacy5;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy5(String privacy5) {
/* 629 */     this.privacy5 = privacy5;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy6() {
/* 634 */     return this.privacy6;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy6(String privacy6) {
/* 639 */     this.privacy6 = privacy6;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy7() {
/* 644 */     return this.privacy7;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy7(String privacy7) {
/* 649 */     this.privacy7 = privacy7;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy8() {
/* 654 */     return this.privacy8;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy8(String privacy8) {
/* 659 */     this.privacy8 = privacy8;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getPrivacy9() {
/* 664 */     return this.privacy9;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPrivacy9(String privacy9) {
/* 669 */     this.privacy9 = privacy9;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvinciaRea() {
/* 674 */     return this.provinciaRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvinciaRea(String provinciaRea) {
/* 679 */     this.provinciaRea = provinciaRea;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvNascita() {
/* 684 */     return this.provNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvNascita(String provNascita) {
/* 689 */     this.provNascita = provNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvResid() {
/* 694 */     return this.provResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvResid(String provResid) {
/* 699 */     this.provResid = provResid;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProvRilascio() {
/* 704 */     return this.provRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProvRilascio(String provRilascio) {
/* 709 */     this.provRilascio = provRilascio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRae() {
/* 714 */     return this.rae;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRae(String rae) {
/* 719 */     this.rae = rae;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRegimePatrimon() {
/* 724 */     return this.regimePatrimon;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRegimePatrimon(String regimePatrimon) {
/* 729 */     this.regimePatrimon = regimePatrimon;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSae() {
/* 734 */     return this.sae;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSae(String sae) {
/* 739 */     this.sae = sae;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSesso() {
/* 744 */     return this.sesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSesso(String sesso) {
/* 749 */     this.sesso = sesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoCivile() {
/* 754 */     return this.statoCivile;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoCivile(String statoCivile) {
/* 759 */     this.statoCivile = statoCivile;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 764 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 769 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoNascita() {
/* 774 */     return this.statoNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoNascita(String statoNascita) {
/* 779 */     this.statoNascita = statoNascita;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTelAbit() {
/* 784 */     return this.telAbit;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTelAbit(String telAbit) {
/* 789 */     this.telAbit = telAbit;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTelCell() {
/* 794 */     return this.telCell;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTelCell(String telCell) {
/* 799 */     this.telCell = telCell;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTelUfficio() {
/* 804 */     return this.telUfficio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTelUfficio(String telUfficio) {
/* 809 */     this.telUfficio = telUfficio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getTimeElab() {
/* 814 */     return this.timeElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTimeElab(Date timeElab) {
/* 819 */     this.timeElab = timeElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoDocum() {
/* 824 */     return this.tipoDocum;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoDocum(String tipoDocum) {
/* 829 */     this.tipoDocum = tipoDocum;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodPersSec() {
/* 834 */     return this.codPersSec;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodPersSec(String codPersSec) {
/* 839 */     this.codPersSec = codPersSec;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 844 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 849 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecAnagraficaClienti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */