/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecAnagraficaCC
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxID;
/*     */   private String ndgIntestazione;
/*     */   private String ndgPrimoIntestatario;
/*     */   private String filialeRapporto;
/*     */   private String categoriaRapporto;
/*     */   private String numeroRapporto;
/*     */   private Date dataAperturaConto;
/*     */   private String statoRapporto;
/*     */   private String deroga;
/*     */   private Integer bancomat;
/*     */   private Integer carteCredito;
/*     */   private Integer assegni;
/*     */   private String convenzione;
/*     */   private String infoConto;
/*     */   private String ror98Conto;
/*     */   private String ror98Dt10;
/*     */   private String ror98Dt50;
/*     */   private Date dataChiusura;
/*     */   private String divisa;
/*     */   private String viaIndirizzoPostale;
/*     */   private String cap;
/*     */   private String localitaIndirPostale;
/*     */   private String provIndirPostale;
/*     */   private String abi;
/*     */   private String cab;
/*     */   private String descrFiliale;
/*     */   private String bban;
/*     */   private String iban;
/*     */   private String cin;
/*     */   private String convenzioneMc;
/*     */   private String statoRapportoMc;
/*     */   private String codUserMc;
/*     */   private String codProd;
/*     */   private String codAgeProm;
/*     */   private String codRete;
/*     */   private String codCompagnia;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   private String estero;
/*     */   private String sottocodiceRapporto;
/*     */   private String nazione;
/*     */   
/*     */   public String getNazione() {
/*  58 */     return this.nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazione(String nazione) {
/*  64 */     this.nazione = nazione;
/*     */   }
/*     */   public String getSottocodiceRapporto() {
/*  67 */     return this.sottocodiceRapporto;
/*     */   }
/*     */   public void setSottocodiceRapporto(String sottocodiceRapporto) {
/*  70 */     this.sottocodiceRapporto = sottocodiceRapporto;
/*     */   }
/*     */   public String getEstero() {
/*  73 */     return this.estero;
/*     */   }
/*     */   public void setEstero(String estero) {
/*  76 */     this.estero = estero;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecAnagraficaCC(String abi, Integer assegni, Integer bancomat, String bban, String cab, String cap, Integer credito, String rapporto, String cin, String prom, String compagnia, String prod, String rete, String mc, String convenzione, String mc2, Date conto, Date caricamento, Date chiusura, Date elaborazione, String deroga, String filiale, String errore, String divisa, String rapporto2, Integer flxid, String iban, String conto2, String istanza, String postale, String intestazione, String intestatario, String rapporto3, String postale2, String conto3, String dt10, String dt50, String elab, String rapporto4, String mc3, String postale3, String est, String sottCod) {
/*  81 */     this.abi = abi;
/*  82 */     this.assegni = assegni;
/*  83 */     this.bancomat = bancomat;
/*  84 */     this.bban = bban;
/*  85 */     this.cab = cab;
/*  86 */     this.cap = cap;
/*  87 */     this.carteCredito = credito;
/*  88 */     this.categoriaRapporto = rapporto;
/*  89 */     this.cin = cin;
/*  90 */     this.codAgeProm = prom;
/*  91 */     this.codCompagnia = compagnia;
/*  92 */     this.codProd = prod;
/*  93 */     this.codRete = rete;
/*  94 */     this.codUserMc = mc;
/*  95 */     this.convenzione = convenzione;
/*  96 */     this.convenzioneMc = mc2;
/*  97 */     this.dataAperturaConto = conto;
/*  98 */     this.dataCaricamento = caricamento;
/*  99 */     this.dataChiusura = chiusura;
/* 100 */     this.dataElaborazione = elaborazione;
/* 101 */     this.deroga = deroga;
/* 102 */     this.descrFiliale = filiale;
/* 103 */     this.descrizioneErrore = errore;
/* 104 */     this.divisa = divisa;
/* 105 */     this.filialeRapporto = rapporto2;
/* 106 */     this.flxID = flxid;
/* 107 */     this.iban = iban;
/* 108 */     this.infoConto = conto2;
/* 109 */     this.istanza = istanza;
/* 110 */     this.localitaIndirPostale = postale;
/* 111 */     this.ndgIntestazione = intestazione;
/* 112 */     this.ndgPrimoIntestatario = intestatario;
/* 113 */     this.numeroRapporto = rapporto3;
/* 114 */     this.provIndirPostale = postale2;
/* 115 */     this.ror98Conto = conto3;
/* 116 */     this.ror98Dt10 = dt10;
/* 117 */     this.ror98Dt50 = dt50;
/* 118 */     this.statoElab = elab;
/* 119 */     this.statoRapporto = rapporto4;
/* 120 */     this.statoRapportoMc = mc3;
/* 121 */     this.viaIndirizzoPostale = postale3;
/* 122 */     this.estero = est;
/* 123 */     this.sottocodiceRapporto = sottCod;
/*     */   }
/*     */   public Date getDataElaborazione() {
/* 126 */     return this.dataElaborazione;
/*     */   }
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 129 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 132 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 135 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   public Date getDataCaricamento() {
/* 138 */     return this.dataCaricamento;
/*     */   }
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 141 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecAnagraficaCC(Date caricamento, String abi, Integer assegni, Integer bancomat, String bban, String cab, String cap, Integer credito, String rapporto, String cin, String prom, String compagnia, String prod, String rete, String mc, String convenzione, String mc2, Date conto, Date chiusura, String deroga, String filiale, String divisa, String rapporto2, Integer flxid, String iban, String conto2, String istanza, String postale, String intestazione, String intestatario, String rapporto3, String postale2, String conto3, String dt10, String dt50, String elab, String rapporto4, String mc3, String postale3) {
/* 146 */     this.dataCaricamento = caricamento;
/* 147 */     this.abi = abi;
/* 148 */     this.assegni = assegni;
/* 149 */     this.bancomat = bancomat;
/* 150 */     this.bban = bban;
/* 151 */     this.cab = cab;
/* 152 */     this.cap = cap;
/* 153 */     this.carteCredito = credito;
/* 154 */     this.categoriaRapporto = rapporto;
/* 155 */     this.cin = cin;
/* 156 */     this.codAgeProm = prom;
/* 157 */     this.codCompagnia = compagnia;
/* 158 */     this.codProd = prod;
/* 159 */     this.codRete = rete;
/* 160 */     this.codUserMc = mc;
/* 161 */     this.convenzione = convenzione;
/* 162 */     this.convenzioneMc = mc2;
/* 163 */     this.dataAperturaConto = conto;
/* 164 */     this.dataChiusura = chiusura;
/* 165 */     this.deroga = deroga;
/* 166 */     this.descrFiliale = filiale;
/* 167 */     this.divisa = divisa;
/* 168 */     this.filialeRapporto = rapporto2;
/* 169 */     this.flxID = flxid;
/* 170 */     this.iban = iban;
/* 171 */     this.infoConto = conto2;
/* 172 */     this.istanza = istanza;
/* 173 */     this.localitaIndirPostale = postale;
/* 174 */     this.ndgIntestazione = intestazione;
/* 175 */     this.ndgPrimoIntestatario = intestatario;
/* 176 */     this.numeroRapporto = rapporto3;
/* 177 */     this.provIndirPostale = postale2;
/* 178 */     this.ror98Conto = conto3;
/* 179 */     this.ror98Dt10 = dt10;
/* 180 */     this.ror98Dt50 = dt50;
/* 181 */     this.statoElab = elab;
/* 182 */     this.statoRapporto = rapporto4;
/* 183 */     this.statoRapportoMc = mc3;
/* 184 */     this.viaIndirizzoPostale = postale3;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecAnagraficaCC() {}
/*     */   
/*     */   public String getAbi() {
/* 191 */     return this.abi;
/*     */   }
/*     */   public void setAbi(String abi) {
/* 194 */     this.abi = abi;
/*     */   }
/*     */   public Integer getAssegni() {
/* 197 */     return this.assegni;
/*     */   }
/*     */   public void setAssegni(Integer assegni) {
/* 200 */     this.assegni = assegni;
/*     */   }
/*     */   public Integer getBancomat() {
/* 203 */     return this.bancomat;
/*     */   }
/*     */   public void setBancomat(Integer bancomat) {
/* 206 */     this.bancomat = bancomat;
/*     */   }
/*     */   public String getBban() {
/* 209 */     return this.bban;
/*     */   }
/*     */   public void setBban(String bban) {
/* 212 */     this.bban = bban;
/*     */   }
/*     */   public String getCab() {
/* 215 */     return this.cab;
/*     */   }
/*     */   public void setCab(String cab) {
/* 218 */     this.cab = cab;
/*     */   }
/*     */   public String getCap() {
/* 221 */     return this.cap;
/*     */   }
/*     */   public void setCap(String cap) {
/* 224 */     this.cap = cap;
/*     */   }
/*     */   public Integer getCarteCredito() {
/* 227 */     return this.carteCredito;
/*     */   }
/*     */   public void setCarteCredito(Integer carteCredito) {
/* 230 */     this.carteCredito = carteCredito;
/*     */   }
/*     */   public String getCategoriaRapporto() {
/* 233 */     return this.categoriaRapporto;
/*     */   }
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/* 236 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */   public String getCin() {
/* 239 */     return this.cin;
/*     */   }
/*     */   public void setCin(String cin) {
/* 242 */     this.cin = cin;
/*     */   }
/*     */   public String getCodAgeProm() {
/* 245 */     return this.codAgeProm;
/*     */   }
/*     */   public void setCodAgeProm(String codAgeProm) {
/* 248 */     this.codAgeProm = codAgeProm;
/*     */   }
/*     */   public String getCodCompagnia() {
/* 251 */     return this.codCompagnia;
/*     */   }
/*     */   public void setCodCompagnia(String codCompagnia) {
/* 254 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */   public String getCodProd() {
/* 257 */     return this.codProd;
/*     */   }
/*     */   public void setCodProd(String codProd) {
/* 260 */     this.codProd = codProd;
/*     */   }
/*     */   public String getCodRete() {
/* 263 */     return this.codRete;
/*     */   }
/*     */   public void setCodRete(String codRete) {
/* 266 */     this.codRete = codRete;
/*     */   }
/*     */   public String getCodUserMc() {
/* 269 */     return this.codUserMc;
/*     */   }
/*     */   public void setCodUserMc(String codUserMc) {
/* 272 */     this.codUserMc = codUserMc;
/*     */   }
/*     */   public String getConvenzione() {
/* 275 */     return this.convenzione;
/*     */   }
/*     */   public void setConvenzione(String convenzione) {
/* 278 */     this.convenzione = convenzione;
/*     */   }
/*     */   public String getConvenzioneMc() {
/* 281 */     return this.convenzioneMc;
/*     */   }
/*     */   public void setConvenzioneMc(String convenzioneMc) {
/* 284 */     this.convenzioneMc = convenzioneMc;
/*     */   }
/*     */   public Date getDataAperturaConto() {
/* 287 */     return this.dataAperturaConto;
/*     */   }
/*     */   public void setDataAperturaConto(Date dataAperturaConto) {
/* 290 */     this.dataAperturaConto = dataAperturaConto;
/*     */   }
/*     */   public Date getDataChiusura() {
/* 293 */     return this.dataChiusura;
/*     */   }
/*     */   public void setDataChiusura(Date dataChiusura) {
/* 296 */     this.dataChiusura = dataChiusura;
/*     */   }
/*     */   public String getDeroga() {
/* 299 */     return this.deroga;
/*     */   }
/*     */   public void setDeroga(String deroga) {
/* 302 */     this.deroga = deroga;
/*     */   }
/*     */   public String getDescrFiliale() {
/* 305 */     return this.descrFiliale;
/*     */   }
/*     */   public void setDescrFiliale(String descrFiliale) {
/* 308 */     this.descrFiliale = descrFiliale;
/*     */   }
/*     */   public String getDivisa() {
/* 311 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(String divisa) {
/* 314 */     this.divisa = divisa;
/*     */   }
/*     */   public String getFilialeRapporto() {
/* 317 */     return this.filialeRapporto;
/*     */   }
/*     */   public void setFilialeRapporto(String filialeRapporto) {
/* 320 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   public Integer getFlxID() {
/* 323 */     return this.flxID;
/*     */   }
/*     */   public void setFlxID(Integer flxID) {
/* 326 */     this.flxID = flxID;
/*     */   }
/*     */   public String getIban() {
/* 329 */     return this.iban;
/*     */   }
/*     */   public void setIban(String iban) {
/* 332 */     this.iban = iban;
/*     */   }
/*     */   public String getInfoConto() {
/* 335 */     return this.infoConto;
/*     */   }
/*     */   public void setInfoConto(String infoConto) {
/* 338 */     this.infoConto = infoConto;
/*     */   }
/*     */   public String getIstanza() {
/* 341 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 344 */     this.istanza = istanza;
/*     */   }
/*     */   public String getLocalitaIndirPostale() {
/* 347 */     return this.localitaIndirPostale;
/*     */   }
/*     */   public void setLocalitaIndirPostale(String localitaIndirPostale) {
/* 350 */     this.localitaIndirPostale = localitaIndirPostale;
/*     */   }
/*     */   public String getNdgIntestazione() {
/* 353 */     return this.ndgIntestazione;
/*     */   }
/*     */   public void setNdgIntestazione(String ndgIntestazione) {
/* 356 */     this.ndgIntestazione = ndgIntestazione;
/*     */   }
/*     */   public String getNdgPrimoIntestatario() {
/* 359 */     return this.ndgPrimoIntestatario;
/*     */   }
/*     */   public void setNdgPrimoIntestatario(String ndgPrimoIntestatario) {
/* 362 */     this.ndgPrimoIntestatario = ndgPrimoIntestatario;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 366 */     return this.numeroRapporto;
/*     */   }
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 369 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   public String getProvIndirPostale() {
/* 372 */     return this.provIndirPostale;
/*     */   }
/*     */   public void setProvIndirPostale(String provIndirPostale) {
/* 375 */     this.provIndirPostale = provIndirPostale;
/*     */   }
/*     */   public String getRor98Conto() {
/* 378 */     return this.ror98Conto;
/*     */   }
/*     */   public void setRor98Conto(String ror98Conto) {
/* 381 */     this.ror98Conto = ror98Conto;
/*     */   }
/*     */   public String getRor98Dt10() {
/* 384 */     return this.ror98Dt10;
/*     */   }
/*     */   public void setRor98Dt10(String ror98Dt10) {
/* 387 */     this.ror98Dt10 = ror98Dt10;
/*     */   }
/*     */   public String getRor98Dt50() {
/* 390 */     return this.ror98Dt50;
/*     */   }
/*     */   public void setRor98Dt50(String ror98Dt50) {
/* 393 */     this.ror98Dt50 = ror98Dt50;
/*     */   }
/*     */   public String getStatoElab() {
/* 396 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 399 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getStatoRapporto() {
/* 402 */     return this.statoRapporto;
/*     */   }
/*     */   public void setStatoRapporto(String statoRapporto) {
/* 405 */     this.statoRapporto = statoRapporto;
/*     */   }
/*     */   public String getStatoRapportoMc() {
/* 408 */     return this.statoRapportoMc;
/*     */   }
/*     */   public void setStatoRapportoMc(String statoRapportoMc) {
/* 411 */     this.statoRapportoMc = statoRapportoMc;
/*     */   }
/*     */   public String getViaIndirizzoPostale() {
/* 414 */     return this.viaIndirizzoPostale;
/*     */   }
/*     */   public void setViaIndirizzoPostale(String viaIndirizzoPostale) {
/* 417 */     this.viaIndirizzoPostale = viaIndirizzoPostale;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecAnagraficaCC.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */