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
/*     */ public class FlxGpramElencoProd
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
/*     */   
/*     */   public Date getDataElab() {
/*  72 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  79 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  85 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  92 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/*  99 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 105 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public FlxGpramElencoProd(String codiceFiscale, Integer filialeRapporto, String categoriaRapporto, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, String tipoIntestatario, String tipoProdotto, String deroga, String dtDiBt, Double saldoProdotto, Date dataValorizzazione, String flagLiraEuro, String statoElaborazione, String istanza) {
/* 109 */     this.codiceFiscale = codiceFiscale;
/* 110 */     this.filialeRapporto = filialeRapporto;
/* 111 */     this.categoriaRapporto = categoriaRapporto;
/* 112 */     this.numeroRapporto = numeroRapporto;
/* 113 */     this.codiceAgente = codiceAgente;
/* 114 */     this.codiceRete = codiceRete;
/* 115 */     this.codiceCompagnia = codiceCompagnia;
/* 116 */     this.tipoIntestatario = tipoIntestatario;
/* 117 */     this.tipoProdotto = tipoProdotto;
/* 118 */     this.deroga = deroga;
/* 119 */     this.dtDiBt = dtDiBt;
/* 120 */     this.saldoProdotto = saldoProdotto;
/* 121 */     this.dataValorizzazione = dataValorizzazione;
/* 122 */     this.flagLiraEuro = flagLiraEuro;
/* 123 */     this.statoElaborazione = statoElaborazione;
/* 124 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxGpramElencoProd() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 132 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 136 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getCodiceFiscale() {
/* 140 */     return this.codiceFiscale;
/*     */   }
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 144 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   
/*     */   public Integer getFilialeRapporto() {
/* 148 */     return this.filialeRapporto;
/*     */   }
/*     */   
/*     */   public void setFilialeRapporto(Integer filialeRapporto) {
/* 152 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   
/*     */   public String getCategoriaRapporto() {
/* 156 */     return this.categoriaRapporto;
/*     */   }
/*     */   
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/* 160 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 164 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 168 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 172 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 176 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 180 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 184 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 188 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 192 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getTipoIntestatario() {
/* 196 */     return this.tipoIntestatario;
/*     */   }
/*     */   
/*     */   public void setTipoIntestatario(String tipoIntestatario) {
/* 200 */     this.tipoIntestatario = tipoIntestatario;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 204 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 208 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String getDeroga() {
/* 212 */     return this.deroga;
/*     */   }
/*     */   
/*     */   public void setDeroga(String deroga) {
/* 216 */     this.deroga = deroga;
/*     */   }
/*     */   
/*     */   public String getDtDiBt() {
/* 220 */     return this.dtDiBt;
/*     */   }
/*     */   
/*     */   public void setDtDiBt(String dtDiBt) {
/* 224 */     this.dtDiBt = dtDiBt;
/*     */   }
/*     */   
/*     */   public Double getSaldoProdotto() {
/* 228 */     return this.saldoProdotto;
/*     */   }
/*     */   
/*     */   public void setSaldoProdotto(Double saldoProdotto) {
/* 232 */     this.saldoProdotto = saldoProdotto;
/*     */   }
/*     */   
/*     */   public Date getDataValorizzazione() {
/* 236 */     return this.dataValorizzazione;
/*     */   }
/*     */   
/*     */   public void setDataValorizzazione(Date dataValorizzazione) {
/* 240 */     this.dataValorizzazione = dataValorizzazione;
/*     */   }
/*     */   
/*     */   public String getFlagLiraEuro() {
/* 244 */     return this.flagLiraEuro;
/*     */   }
/*     */   
/*     */   public void setFlagLiraEuro(String flagLiraEuro) {
/* 248 */     this.flagLiraEuro = flagLiraEuro;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 252 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 256 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 260 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpramElencoProd.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */