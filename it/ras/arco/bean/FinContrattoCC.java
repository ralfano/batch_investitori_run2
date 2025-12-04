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
/*     */ public class FinContrattoCC
/*     */   extends FinContratto
/*     */   implements Serializable
/*     */ {
/*     */   private Integer convenzioneId;
/*     */   private String filialeRapporto;
/*     */   private String categoriaRapporto;
/*     */   private String numeroRapporto;
/*     */   private String deroga;
/*     */   private Integer bancomat;
/*     */   private Integer carteCredito;
/*     */   private Integer assegni;
/*     */   private String convenzione;
/*     */   private String infoConto;
/*     */   private String ror98Conto;
/*     */   private String ror98Dt10;
/*     */   private String ror98Dt50;
/*     */   private Integer numeroDossier;
/*     */   private String divisa;
/*     */   private FinAnagraficaBanca anagraficaBanca;
/*     */   private String bban;
/*     */   private String iban;
/*     */   private String cin;
/*     */   private String convenzioneMc;
/*     */   private String statoRapportoMc;
/*     */   private String codUserMc;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Date dataSaldo;
/*     */   private Double saldoContabile;
/*     */   private Double saldoDisponibile;
/*     */   private Double saldoLiquido;
/*     */   private Double fidoDisponibile;
/*     */   private Double disponibilita;
/*     */   private Double parPrenotDare;
/*     */   private Double parPrenotAvere;
/*     */   private Double saldoDossier;
/*     */   private String sottocodiceRapporto;
/*     */   private String contoEstero;
/*     */   private Set assegno;
/*     */   private FinConvenzione finConvenzione;
/*     */   
/*     */   public String getContoEstero() {
/*  71 */     return this.contoEstero;
/*     */   }
/*     */   public void setContoEstero(String contoEstero) {
/*  74 */     this.contoEstero = contoEstero;
/*     */   }
/*     */   public String getSottocodiceRapporto() {
/*  77 */     return this.sottocodiceRapporto;
/*     */   }
/*     */   public void setSottocodiceRapporto(String sottocodiceRapporto) {
/*  80 */     this.sottocodiceRapporto = sottocodiceRapporto;
/*     */   }
/*     */   public FinContrattoCC(Integer convenzId, String codiceSconto, Date dataSottoscrizione, Date dataUltimoMovimento, String flagProvenienza, Date dataChiusura, Integer soggCoin, String numContratto, String dossierTecnico, Date dataApertura, String tipoProdotto, String statoContratto, String codConvenzione, Date dataInserimento, String utenteInserimento, String flagMulti, FinProdotto prodotto, Set posizione, Set ruolo, Set sottoscrizione, Set indirizzo, Set movimenti, FinCointestazione cointestazione, FinSoggetto soggetto, Set soggCointestazione, Set assegnazione, Integer assegni, Integer bancomat, String bban, Integer credito, String rapporto, String cin, String mc, String convenzione, String mc2, Date inserimento, Date saldo, String deroga, Double disponibilita, String divisa, Double disponibile, String rapporto2, String iban, String conto, Integer dossier, String rapporto3, Double avere, Double dare, String conto2, String dt10, String dt50, Double contabile, Double disponibile2, Double dossier2, Double liquido, String mc3, String inserimento2, String codiceRapporto, String conto3, Set assegno, FinConvenzione finConvenzione) {
/*  83 */     super(assegnazione, dossier, inserimento, saldo, codiceSconto, inserimento2, dataSottoscrizione, dataChiusura, soggCoin, numContratto, dossierTecnico, dataApertura, tipoProdotto, statoContratto, codConvenzione, dataInserimento, utenteInserimento, flagMulti, prodotto, posizione, ruolo, sottoscrizione, indirizzo, movimenti, cointestazione, soggetto, soggCointestazione, assegnazione);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  92 */     this.convenzioneId = convenzId;
/*  93 */     this.assegni = assegni;
/*  94 */     this.bancomat = bancomat;
/*  95 */     this.bban = bban;
/*     */     
/*  97 */     this.carteCredito = credito;
/*  98 */     this.categoriaRapporto = rapporto;
/*  99 */     this.cin = cin;
/* 100 */     this.codUserMc = mc;
/* 101 */     this.convenzione = convenzione;
/* 102 */     this.convenzioneMc = mc2;
/* 103 */     dataInserimento = inserimento;
/* 104 */     this.dataSaldo = saldo;
/* 105 */     this.deroga = deroga;
/*     */     
/* 107 */     this.disponibilita = disponibilita;
/* 108 */     this.divisa = divisa;
/* 109 */     this.fidoDisponibile = disponibile;
/* 110 */     this.filialeRapporto = rapporto2;
/* 111 */     this.iban = iban;
/* 112 */     this.infoConto = conto;
/* 113 */     this.numeroDossier = dossier;
/* 114 */     this.numeroRapporto = rapporto3;
/* 115 */     this.parPrenotAvere = avere;
/* 116 */     this.parPrenotDare = dare;
/* 117 */     this.ror98Conto = conto2;
/* 118 */     this.ror98Dt10 = dt10;
/* 119 */     this.ror98Dt50 = dt50;
/* 120 */     this.saldoContabile = contabile;
/* 121 */     this.saldoDisponibile = disponibile2;
/* 122 */     this.saldoDossier = dossier2;
/* 123 */     this.saldoLiquido = liquido;
/* 124 */     this.statoRapportoMc = mc3;
/* 125 */     utenteInserimento = inserimento2;
/* 126 */     this.sottocodiceRapporto = codiceRapporto;
/* 127 */     this.contoEstero = conto3;
/* 128 */     this.assegno = assegno;
/* 129 */     this.finConvenzione = finConvenzione;
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
/*     */   public Integer getAssegni() {
/* 142 */     return this.assegni;
/*     */   }
/*     */   
/*     */   public void setAssegni(Integer assegni) {
/* 146 */     this.assegni = assegni;
/*     */   }
/*     */   
/*     */   public Integer getBancomat() {
/* 150 */     return this.bancomat;
/*     */   }
/*     */   
/*     */   public void setBancomat(Integer bancomat) {
/* 154 */     this.bancomat = bancomat;
/*     */   }
/*     */   
/*     */   public String getBban() {
/* 158 */     return this.bban;
/*     */   }
/*     */   
/*     */   public void setBban(String bban) {
/* 162 */     this.bban = bban;
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
/*     */   public Integer getCarteCredito() {
/* 174 */     return this.carteCredito;
/*     */   }
/*     */   
/*     */   public void setCarteCredito(Integer carteCredito) {
/* 178 */     this.carteCredito = carteCredito;
/*     */   }
/*     */   
/*     */   public String getCategoriaRapporto() {
/* 182 */     return this.categoriaRapporto;
/*     */   }
/*     */   
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/* 186 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */   
/*     */   public String getCin() {
/* 190 */     return this.cin;
/*     */   }
/*     */   
/*     */   public void setCin(String cin) {
/* 194 */     this.cin = cin;
/*     */   }
/*     */   
/*     */   public String getCodUserMc() {
/* 198 */     return this.codUserMc;
/*     */   }
/*     */   
/*     */   public void setCodUserMc(String codUserMc) {
/* 202 */     this.codUserMc = codUserMc;
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
/*     */   public String getConvenzione() {
/* 214 */     return this.convenzione;
/*     */   }
/*     */   
/*     */   public void setConvenzione(String convenzione) {
/* 218 */     this.convenzione = convenzione;
/*     */   }
/*     */   
/*     */   public String getConvenzioneMc() {
/* 222 */     return this.convenzioneMc;
/*     */   }
/*     */   
/*     */   public void setConvenzioneMc(String convenzioneMc) {
/* 226 */     this.convenzioneMc = convenzioneMc;
/*     */   }
/*     */   
/*     */   public String getDeroga() {
/* 230 */     return this.deroga;
/*     */   }
/*     */   
/*     */   public void setDeroga(String deroga) {
/* 234 */     this.deroga = deroga;
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
/*     */   public String getDivisa() {
/* 246 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 250 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public String getFilialeRapporto() {
/* 254 */     return this.filialeRapporto;
/*     */   }
/*     */   
/*     */   public void setFilialeRapporto(String filialeRapporto) {
/* 258 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   
/*     */   public String getIban() {
/* 262 */     return this.iban;
/*     */   }
/*     */   
/*     */   public void setIban(String iban) {
/* 266 */     this.iban = iban;
/*     */   }
/*     */   
/*     */   public String getInfoConto() {
/* 270 */     return this.infoConto;
/*     */   }
/*     */   
/*     */   public void setInfoConto(String infoConto) {
/* 274 */     this.infoConto = infoConto;
/*     */   }
/*     */   
/*     */   public Integer getNumeroDossier() {
/* 278 */     return this.numeroDossier;
/*     */   }
/*     */   
/*     */   public void setNumeroDossier(Integer numeroDossier) {
/* 282 */     this.numeroDossier = numeroDossier;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 286 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 290 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getRor98Conto() {
/* 294 */     return this.ror98Conto;
/*     */   }
/*     */   
/*     */   public void setRor98Conto(String ror98Conto) {
/* 298 */     this.ror98Conto = ror98Conto;
/*     */   }
/*     */   
/*     */   public String getRor98Dt10() {
/* 302 */     return this.ror98Dt10;
/*     */   }
/*     */   
/*     */   public void setRor98Dt10(String ror98Dt10) {
/* 306 */     this.ror98Dt10 = ror98Dt10;
/*     */   }
/*     */   
/*     */   public String getRor98Dt50() {
/* 310 */     return this.ror98Dt50;
/*     */   }
/*     */   
/*     */   public void setRor98Dt50(String ror98Dt50) {
/* 314 */     this.ror98Dt50 = ror98Dt50;
/*     */   }
/*     */   
/*     */   public String getStatoRapportoMc() {
/* 318 */     return this.statoRapportoMc;
/*     */   }
/*     */   
/*     */   public void setStatoRapportoMc(String statoRapportoMc) {
/* 322 */     this.statoRapportoMc = statoRapportoMc;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 326 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 330 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContrattoCC() {}
/*     */ 
/*     */   
/*     */   public Date getDataSaldo() {
/* 339 */     return this.dataSaldo;
/*     */   }
/*     */   
/*     */   public void setDataSaldo(Date dataSaldo) {
/* 343 */     this.dataSaldo = dataSaldo;
/*     */   }
/*     */   
/*     */   public Double getDisponibilita() {
/* 347 */     return this.disponibilita;
/*     */   }
/*     */   
/*     */   public void setDisponibilita(Double disponibilita) {
/* 351 */     this.disponibilita = disponibilita;
/*     */   }
/*     */   
/*     */   public Double getFidoDisponibile() {
/* 355 */     return this.fidoDisponibile;
/*     */   }
/*     */   
/*     */   public void setFidoDisponibile(Double fidoDisponibile) {
/* 359 */     this.fidoDisponibile = fidoDisponibile;
/*     */   }
/*     */   
/*     */   public Double getParPrenotAvere() {
/* 363 */     return this.parPrenotAvere;
/*     */   }
/*     */   
/*     */   public void setParPrenotAvere(Double parPrenotAvere) {
/* 367 */     this.parPrenotAvere = parPrenotAvere;
/*     */   }
/*     */   
/*     */   public Double getParPrenotDare() {
/* 371 */     return this.parPrenotDare;
/*     */   }
/*     */   
/*     */   public void setParPrenotDare(Double parPrenotDare) {
/* 375 */     this.parPrenotDare = parPrenotDare;
/*     */   }
/*     */   
/*     */   public Double getSaldoContabile() {
/* 379 */     return this.saldoContabile;
/*     */   }
/*     */   
/*     */   public void setSaldoContabile(Double saldoContabile) {
/* 383 */     this.saldoContabile = saldoContabile;
/*     */   }
/*     */   
/*     */   public Double getSaldoDisponibile() {
/* 387 */     return this.saldoDisponibile;
/*     */   }
/*     */   
/*     */   public void setSaldoDisponibile(Double saldoDisponibile) {
/* 391 */     this.saldoDisponibile = saldoDisponibile;
/*     */   }
/*     */   
/*     */   public Double getSaldoDossier() {
/* 395 */     return this.saldoDossier;
/*     */   }
/*     */   
/*     */   public void setSaldoDossier(Double saldoDossier) {
/* 399 */     this.saldoDossier = saldoDossier;
/*     */   }
/*     */   
/*     */   public Double getSaldoLiquido() {
/* 403 */     return this.saldoLiquido;
/*     */   }
/*     */   
/*     */   public void setSaldoLiquido(Double saldoLiquido) {
/* 407 */     this.saldoLiquido = saldoLiquido;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 411 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 415 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public FinAnagraficaBanca getAnagraficaBanca() {
/* 418 */     return this.anagraficaBanca;
/*     */   }
/*     */   public void setAnagraficaBanca(FinAnagraficaBanca anagraficaBanca) {
/* 421 */     this.anagraficaBanca = anagraficaBanca;
/*     */   }
/*     */   public Integer getConvenzioneId() {
/* 424 */     return this.convenzioneId;
/*     */   }
/*     */   public void setConvenzioneId(Integer convenzioneID) {
/* 427 */     this.convenzioneId = convenzioneID;
/*     */   }
/*     */   public Set getAssegno() {
/* 430 */     return this.assegno;
/*     */   }
/*     */   public void setAssegno(Set assegno) {
/* 433 */     this.assegno = assegno;
/*     */   }
/*     */   public FinConvenzione getFinConvenzione() {
/* 436 */     return this.finConvenzione;
/*     */   }
/*     */   public void setFinConvenzione(FinConvenzione finConvenzione) {
/* 439 */     this.finConvenzione = finConvenzione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrattoCC.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */