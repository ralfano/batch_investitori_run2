/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecPct
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numOperazione;
/*     */   private String filialeRapporto;
/*     */   private String categoriaRapporto;
/*     */   private String numeroRapporto;
/*     */   private String cfil;
/*     */   private String cage;
/*     */   private String cprg;
/*     */   private String csdp;
/*     */   private String ndgIntestatario;
/*     */   private String codiceIsin;
/*     */   private Integer codiceTitoloSec;
/*     */   private String denominazione;
/*     */   private Double quantita;
/*     */   private Double prezzoPronti;
/*     */   private Date dataPronti;
/*     */   private Double cambioPronti;
/*     */   private Double controvalorePronti;
/*     */   private Double prezzoTermine;
/*     */   private Date dataTermine;
/*     */   private Double cambioTermine;
/*     */   private Double controvaloreTermine;
/*     */   private String divisa;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public FlxSecPct(String cage, Double pronti, Double termine, String rapporto, String cfil, String isin, Integer sec, Double pronti2, Double termine2, String cprg, String csdp, Date caricamento, Date elab, Date pronti3, Date termine3, String denominazione, String errore, String divisa, String rapporto2, Integer id, String istanza, String intestatario, String rapporto3, Double pronti4, Double termine4, Double quantita, String elab2) {
/*  42 */     this.cage = cage;
/*  43 */     this.cambioPronti = pronti;
/*  44 */     this.cambioTermine = termine;
/*  45 */     this.categoriaRapporto = rapporto;
/*  46 */     this.cfil = cfil;
/*  47 */     this.codiceIsin = isin;
/*  48 */     this.codiceTitoloSec = sec;
/*  49 */     this.controvalorePronti = pronti2;
/*  50 */     this.controvaloreTermine = termine2;
/*  51 */     this.cprg = cprg;
/*  52 */     this.csdp = csdp;
/*  53 */     this.dataCaricamento = caricamento;
/*  54 */     this.dataElab = elab;
/*  55 */     this.dataPronti = pronti3;
/*  56 */     this.dataTermine = termine3;
/*  57 */     this.denominazione = denominazione;
/*  58 */     this.descrizioneErrore = errore;
/*  59 */     this.divisa = divisa;
/*  60 */     this.filialeRapporto = rapporto2;
/*  61 */     this.flxId = id;
/*  62 */     this.istanza = istanza;
/*  63 */     this.ndgIntestatario = intestatario;
/*  64 */     this.numeroRapporto = rapporto3;
/*  65 */     this.prezzoPronti = pronti4;
/*  66 */     this.prezzoTermine = termine4;
/*  67 */     this.quantita = quantita;
/*  68 */     this.statoElab = elab2;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecPct() {}
/*     */ 
/*     */   
/*     */   public String getCage() {
/*  76 */     return this.cage;
/*     */   }
/*     */   
/*     */   public void setCage(String cage) {
/*  80 */     this.cage = cage;
/*     */   }
/*     */   
/*     */   public Double getCambioPronti() {
/*  84 */     return this.cambioPronti;
/*     */   }
/*     */   
/*     */   public void setCambioPronti(Double cambioPronti) {
/*  88 */     this.cambioPronti = cambioPronti;
/*     */   }
/*     */   
/*     */   public Double getCambioTermine() {
/*  92 */     return this.cambioTermine;
/*     */   }
/*     */   
/*     */   public void setCambioTermine(Double cambioTermine) {
/*  96 */     this.cambioTermine = cambioTermine;
/*     */   }
/*     */   
/*     */   public String getCategoriaRapporto() {
/* 100 */     return this.categoriaRapporto;
/*     */   }
/*     */   
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/* 104 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */   
/*     */   public String getCfil() {
/* 108 */     return this.cfil;
/*     */   }
/*     */   
/*     */   public void setCfil(String cfil) {
/* 112 */     this.cfil = cfil;
/*     */   }
/*     */   
/*     */   public String getCodiceIsin() {
/* 116 */     return this.codiceIsin;
/*     */   }
/*     */   
/*     */   public void setCodiceIsin(String codiceIsin) {
/* 120 */     this.codiceIsin = codiceIsin;
/*     */   }
/*     */   
/*     */   public Integer getCodiceTitoloSec() {
/* 124 */     return this.codiceTitoloSec;
/*     */   }
/*     */   
/*     */   public void setCodiceTitoloSec(Integer codiceTitoloSec) {
/* 128 */     this.codiceTitoloSec = codiceTitoloSec;
/*     */   }
/*     */   
/*     */   public Double getControvalorePronti() {
/* 132 */     return this.controvalorePronti;
/*     */   }
/*     */   
/*     */   public void setControvalorePronti(Double controvalorePronti) {
/* 136 */     this.controvalorePronti = controvalorePronti;
/*     */   }
/*     */   
/*     */   public Double getControvaloreTermine() {
/* 140 */     return this.controvaloreTermine;
/*     */   }
/*     */   
/*     */   public void setControvaloreTermine(Double controvaloreTermine) {
/* 144 */     this.controvaloreTermine = controvaloreTermine;
/*     */   }
/*     */   
/*     */   public String getCprg() {
/* 148 */     return this.cprg;
/*     */   }
/*     */   
/*     */   public void setCprg(String cprg) {
/* 152 */     this.cprg = cprg;
/*     */   }
/*     */   
/*     */   public String getCsdp() {
/* 156 */     return this.csdp;
/*     */   }
/*     */   
/*     */   public void setCsdp(String csdp) {
/* 160 */     this.csdp = csdp;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 164 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 168 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDataElab() {
/* 172 */     return this.dataElab;
/*     */   }
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 176 */     this.dataElab = dataElab;
/*     */   }
/*     */   
/*     */   public Date getDataPronti() {
/* 180 */     return this.dataPronti;
/*     */   }
/*     */   
/*     */   public void setDataPronti(Date dataPronti) {
/* 184 */     this.dataPronti = dataPronti;
/*     */   }
/*     */   
/*     */   public Date getDataTermine() {
/* 188 */     return this.dataTermine;
/*     */   }
/*     */   
/*     */   public void setDataTermine(Date dataTermine) {
/* 192 */     this.dataTermine = dataTermine;
/*     */   }
/*     */   
/*     */   public String getDenominazione() {
/* 196 */     return this.denominazione;
/*     */   }
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 200 */     this.denominazione = denominazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 204 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 208 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 212 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 216 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public String getFilialeRapporto() {
/* 220 */     return this.filialeRapporto;
/*     */   }
/*     */   
/*     */   public void setFilialeRapporto(String filialeRapporto) {
/* 224 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 228 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 232 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 236 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 240 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getNdgIntestatario() {
/* 244 */     return this.ndgIntestatario;
/*     */   }
/*     */   
/*     */   public void setNdgIntestatario(String ndgIntestatario) {
/* 248 */     this.ndgIntestatario = ndgIntestatario;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 252 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 256 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public Double getPrezzoPronti() {
/* 260 */     return this.prezzoPronti;
/*     */   }
/*     */   
/*     */   public void setPrezzoPronti(Double prezzoPronti) {
/* 264 */     this.prezzoPronti = prezzoPronti;
/*     */   }
/*     */   
/*     */   public Double getPrezzoTermine() {
/* 268 */     return this.prezzoTermine;
/*     */   }
/*     */   
/*     */   public void setPrezzoTermine(Double prezzoTermine) {
/* 272 */     this.prezzoTermine = prezzoTermine;
/*     */   }
/*     */   
/*     */   public Double getQuantita() {
/* 276 */     return this.quantita;
/*     */   }
/*     */   
/*     */   public void setQuantita(Double quantita) {
/* 280 */     this.quantita = quantita;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 284 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 288 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getNumOperazione() {
/* 292 */     return this.numOperazione;
/*     */   }
/*     */   
/*     */   public void setNumOperazione(String numOperazione) {
/* 296 */     this.numOperazione = numOperazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecPct.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */