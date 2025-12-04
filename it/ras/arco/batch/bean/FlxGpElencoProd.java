/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxGpElencoProd
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceFiscale;
/*     */   private Integer filialeRapporto;
/*     */   private String categoriaRapporto;
/*     */   private String numeroRapporto;
/*     */   private String codiceAgente;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String tipoIntestatario;
/*     */   private String tipoProdotto;
/*     */   private String deroga;
/*     */   private String dtDiBt;
/*     */   private Double saldoProdotto;
/*     */   private Date dataValorizzazione;
/*     */   private String flagLiraEuro;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   private String tipoFabbrica;
/*     */   
/*     */   public Date getDataElab() {
/*  74 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  81 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  87 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  94 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 101 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 107 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public FlxGpElencoProd(String codiceFiscale, Integer filialeRapporto, String categoriaRapporto, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, String tipoIntestatario, String tipoProdotto, String deroga, String dtDiBt, Double saldoProdotto, Date dataValorizzazione, String flagLiraEuro, String statoElaborazione, String istanza) {
/* 111 */     this.codiceFiscale = codiceFiscale;
/* 112 */     this.filialeRapporto = filialeRapporto;
/* 113 */     this.categoriaRapporto = categoriaRapporto;
/* 114 */     this.numeroRapporto = numeroRapporto;
/* 115 */     this.codiceAgente = codiceAgente;
/* 116 */     this.codiceRete = codiceRete;
/* 117 */     this.codiceCompagnia = codiceCompagnia;
/* 118 */     this.tipoIntestatario = tipoIntestatario;
/* 119 */     this.tipoProdotto = tipoProdotto;
/* 120 */     this.deroga = deroga;
/* 121 */     this.dtDiBt = dtDiBt;
/* 122 */     this.saldoProdotto = saldoProdotto;
/* 123 */     this.dataValorizzazione = dataValorizzazione;
/* 124 */     this.flagLiraEuro = flagLiraEuro;
/* 125 */     this.statoElaborazione = statoElaborazione;
/* 126 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxGpElencoProd() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 134 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 138 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getCodiceFiscale() {
/* 142 */     return this.codiceFiscale;
/*     */   }
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 146 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   
/*     */   public Integer getFilialeRapporto() {
/* 150 */     return this.filialeRapporto;
/*     */   }
/*     */   
/*     */   public void setFilialeRapporto(Integer filialeRapporto) {
/* 154 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   
/*     */   public String getCategoriaRapporto() {
/* 158 */     return this.categoriaRapporto;
/*     */   }
/*     */   
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/* 162 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 166 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 170 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 174 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 178 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 182 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 186 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 190 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 194 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getTipoIntestatario() {
/* 198 */     return this.tipoIntestatario;
/*     */   }
/*     */   
/*     */   public void setTipoIntestatario(String tipoIntestatario) {
/* 202 */     this.tipoIntestatario = tipoIntestatario;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 206 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 210 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String getDeroga() {
/* 214 */     return this.deroga;
/*     */   }
/*     */   
/*     */   public void setDeroga(String deroga) {
/* 218 */     this.deroga = deroga;
/*     */   }
/*     */   
/*     */   public String getDtDiBt() {
/* 222 */     return this.dtDiBt;
/*     */   }
/*     */   
/*     */   public void setDtDiBt(String dtDiBt) {
/* 226 */     this.dtDiBt = dtDiBt;
/*     */   }
/*     */   
/*     */   public Double getSaldoProdotto() {
/* 230 */     return this.saldoProdotto;
/*     */   }
/*     */   
/*     */   public void setSaldoProdotto(Double saldoProdotto) {
/* 234 */     this.saldoProdotto = saldoProdotto;
/*     */   }
/*     */   
/*     */   public Date getDataValorizzazione() {
/* 238 */     return this.dataValorizzazione;
/*     */   }
/*     */   
/*     */   public void setDataValorizzazione(Date dataValorizzazione) {
/* 242 */     this.dataValorizzazione = dataValorizzazione;
/*     */   }
/*     */   
/*     */   public String getFlagLiraEuro() {
/* 246 */     return this.flagLiraEuro;
/*     */   }
/*     */   
/*     */   public void setFlagLiraEuro(String flagLiraEuro) {
/* 250 */     this.flagLiraEuro = flagLiraEuro;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 254 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 258 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 262 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoFabbrica() {
/* 271 */     return this.tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoFabbrica(String tipoFabbrica) {
/* 278 */     this.tipoFabbrica = tipoFabbrica;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpElencoProd.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */