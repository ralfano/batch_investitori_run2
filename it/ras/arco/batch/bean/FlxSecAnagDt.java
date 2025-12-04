/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecAnagDt
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*  12 */   public static String DT = "DT";
/*  13 */   public static String FABBRICA = "SEC";
/*     */   
/*     */   private Integer flxId;
/*     */   
/*     */   private String ndgIntestazione;
/*     */   
/*     */   private String ndgPrimoIntestatario;
/*     */   private String codFilSec;
/*     */   private String codCatSec;
/*     */   private String numPratSec;
/*     */   private String tipoProdotto;
/*     */   private String deroga;
/*     */   private Double saldoProdotto;
/*     */   private Date dataValorizzazione;
/*     */   private Date dataApertura;
/*     */   private Date dataChiusura;
/*     */   private String cfil;
/*     */   private String cage;
/*     */   private String cprg;
/*     */   private String csdp;
/*     */   private String indirizzoCorrisp;
/*     */   private String cittaCorrisp;
/*     */   private String capCorrisp;
/*     */   private String provCorrisp;
/*     */   private String codAgeProm;
/*     */   private String codRete;
/*     */   private String codCompagnia;
/*     */   private String numRappApp;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String rapporto;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   private String nazione;
/*     */   
/*     */   public String getNazione() {
/*  50 */     return this.nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNazione(String nazione) {
/*  56 */     this.nazione = nazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecAnagDt() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  68 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  74 */     this.flxId = flxId;
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
/*     */   public FlxSecAnagDt(String cage, String corrisp, String cfil, String corrisp2, String prom, String sec, String compagnia, String sec2, String rete, String cprg, String csdp, Date apertura, Date caricamento, Date chiusura, Date elab, Date valorizzazione, String deroga, String errore, String corrisp3, String istanza, String intestazione, String intestatario, String sec3, String app, String corrisp4, String rapporto, Double prodotto, String elab2, String prodotto2) {
/* 109 */     this.cage = cage;
/* 110 */     this.capCorrisp = corrisp;
/* 111 */     this.cfil = cfil;
/* 112 */     this.cittaCorrisp = corrisp2;
/* 113 */     this.codAgeProm = prom;
/* 114 */     this.codCatSec = sec;
/* 115 */     this.codCompagnia = compagnia;
/* 116 */     this.codFilSec = sec2;
/* 117 */     this.codRete = rete;
/* 118 */     this.cprg = cprg;
/* 119 */     this.csdp = csdp;
/* 120 */     this.dataApertura = apertura;
/* 121 */     this.dataCaricamento = caricamento;
/* 122 */     this.dataChiusura = chiusura;
/* 123 */     this.dataElab = elab;
/* 124 */     this.dataValorizzazione = valorizzazione;
/* 125 */     this.deroga = deroga;
/* 126 */     this.descrizioneErrore = errore;
/* 127 */     this.indirizzoCorrisp = corrisp3;
/* 128 */     this.istanza = istanza;
/* 129 */     this.ndgIntestazione = intestazione;
/* 130 */     this.ndgPrimoIntestatario = intestatario;
/* 131 */     this.numPratSec = sec3;
/* 132 */     this.numRappApp = app;
/* 133 */     this.provCorrisp = corrisp4;
/* 134 */     this.rapporto = rapporto;
/* 135 */     this.saldoProdotto = prodotto;
/* 136 */     this.statoElab = elab2;
/* 137 */     this.tipoProdotto = prodotto2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCage() {
/* 143 */     return this.cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCage(String cage) {
/* 149 */     this.cage = cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCapCorrisp() {
/* 155 */     return this.capCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCapCorrisp(String capCorrisp) {
/* 161 */     this.capCorrisp = capCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCfil() {
/* 167 */     return this.cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCfil(String cfil) {
/* 173 */     this.cfil = cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCittaCorrisp() {
/* 179 */     return this.cittaCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCittaCorrisp(String cittaCorrisp) {
/* 185 */     this.cittaCorrisp = cittaCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodAgeProm() {
/* 191 */     return this.codAgeProm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodAgeProm(String codAgeProm) {
/* 197 */     this.codAgeProm = codAgeProm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodCatSec() {
/* 203 */     return this.codCatSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodCatSec(String codCatSec) {
/* 209 */     this.codCatSec = codCatSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodCompagnia() {
/* 215 */     return this.codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodCompagnia(String codCompagnia) {
/* 221 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodFilSec() {
/* 227 */     return this.codFilSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodFilSec(String codFilSec) {
/* 233 */     this.codFilSec = codFilSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodRete() {
/* 239 */     return this.codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 245 */     this.codRete = codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCprg() {
/* 251 */     return this.cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCprg(String cprg) {
/* 257 */     this.cprg = cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCsdp() {
/* 263 */     return this.csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCsdp(String csdp) {
/* 269 */     this.csdp = csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataApertura() {
/* 275 */     return this.dataApertura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataApertura(Date dataApertura) {
/* 281 */     this.dataApertura = dataApertura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 287 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 293 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataChiusura() {
/* 299 */     return this.dataChiusura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataChiusura(Date dataChiusura) {
/* 305 */     this.dataChiusura = dataChiusura;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/* 311 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 317 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValorizzazione() {
/* 323 */     return this.dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValorizzazione(Date dataValorizzazione) {
/* 329 */     this.dataValorizzazione = dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDeroga() {
/* 335 */     return this.deroga;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeroga(String deroga) {
/* 341 */     this.deroga = deroga;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 347 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 353 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIndirizzoCorrisp() {
/* 359 */     return this.indirizzoCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndirizzoCorrisp(String indirizzoCorrisp) {
/* 365 */     this.indirizzoCorrisp = indirizzoCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 371 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 377 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNdgIntestazione() {
/* 383 */     return this.ndgIntestazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdgIntestazione(String ndgIntestazione) {
/* 389 */     this.ndgIntestazione = ndgIntestazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNdgPrimoIntestatario() {
/* 395 */     return this.ndgPrimoIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdgPrimoIntestatario(String ndgPrimoIntestatario) {
/* 401 */     this.ndgPrimoIntestatario = ndgPrimoIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumPratSec() {
/* 407 */     return this.numPratSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumPratSec(String numPratSec) {
/* 413 */     this.numPratSec = numPratSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumRappApp() {
/* 419 */     return this.numRappApp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumRappApp(String numRappApp) {
/* 425 */     this.numRappApp = numRappApp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvCorrisp() {
/* 431 */     return this.provCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvCorrisp(String provCorrisp) {
/* 437 */     this.provCorrisp = provCorrisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRapporto() {
/* 443 */     return this.rapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRapporto(String rapporto) {
/* 449 */     this.rapporto = rapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoProdotto() {
/* 455 */     return this.saldoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoProdotto(Double saldoProdotto) {
/* 461 */     this.saldoProdotto = saldoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 467 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 473 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProdotto() {
/* 479 */     return this.tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 485 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecAnagDt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */