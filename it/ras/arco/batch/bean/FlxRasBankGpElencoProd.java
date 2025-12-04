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
/*     */ public class FlxRasBankGpElencoProd
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
/*  71 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  78 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  84 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  91 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/*  98 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 104 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public FlxRasBankGpElencoProd(String codiceFiscale, Integer filialeRapporto, String categoriaRapporto, String numeroRapporto, String codiceAgente, String codiceRete, String codiceCompagnia, String tipoIntestatario, String tipoProdotto, String deroga, String dtDiBt, Double saldoProdotto, Date dataValorizzazione, String flagLiraEuro, String statoElaborazione, String istanza) {
/* 108 */     this.codiceFiscale = codiceFiscale;
/* 109 */     this.filialeRapporto = filialeRapporto;
/* 110 */     this.categoriaRapporto = categoriaRapporto;
/* 111 */     this.numeroRapporto = numeroRapporto;
/* 112 */     this.codiceAgente = codiceAgente;
/* 113 */     this.codiceRete = codiceRete;
/* 114 */     this.codiceCompagnia = codiceCompagnia;
/* 115 */     this.tipoIntestatario = tipoIntestatario;
/* 116 */     this.tipoProdotto = tipoProdotto;
/* 117 */     this.deroga = deroga;
/* 118 */     this.dtDiBt = dtDiBt;
/* 119 */     this.saldoProdotto = saldoProdotto;
/* 120 */     this.dataValorizzazione = dataValorizzazione;
/* 121 */     this.flagLiraEuro = flagLiraEuro;
/* 122 */     this.statoElaborazione = statoElaborazione;
/* 123 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxRasBankGpElencoProd() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 131 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 135 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getCodiceFiscale() {
/* 139 */     return this.codiceFiscale;
/*     */   }
/*     */   
/*     */   public void setCodiceFiscale(String codiceFiscale) {
/* 143 */     this.codiceFiscale = codiceFiscale;
/*     */   }
/*     */   
/*     */   public Integer getFilialeRapporto() {
/* 147 */     return this.filialeRapporto;
/*     */   }
/*     */   
/*     */   public void setFilialeRapporto(Integer filialeRapporto) {
/* 151 */     this.filialeRapporto = filialeRapporto;
/*     */   }
/*     */   
/*     */   public String getCategoriaRapporto() {
/* 155 */     return this.categoriaRapporto;
/*     */   }
/*     */   
/*     */   public void setCategoriaRapporto(String categoriaRapporto) {
/* 159 */     this.categoriaRapporto = categoriaRapporto;
/*     */   }
/*     */   
/*     */   public String getNumeroRapporto() {
/* 163 */     return this.numeroRapporto;
/*     */   }
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 167 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/* 171 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 175 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 179 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 183 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 187 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 191 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getTipoIntestatario() {
/* 195 */     return this.tipoIntestatario;
/*     */   }
/*     */   
/*     */   public void setTipoIntestatario(String tipoIntestatario) {
/* 199 */     this.tipoIntestatario = tipoIntestatario;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 203 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 207 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String getDeroga() {
/* 211 */     return this.deroga;
/*     */   }
/*     */   
/*     */   public void setDeroga(String deroga) {
/* 215 */     this.deroga = deroga;
/*     */   }
/*     */   
/*     */   public String getDtDiBt() {
/* 219 */     return this.dtDiBt;
/*     */   }
/*     */   
/*     */   public void setDtDiBt(String dtDiBt) {
/* 223 */     this.dtDiBt = dtDiBt;
/*     */   }
/*     */   
/*     */   public Double getSaldoProdotto() {
/* 227 */     return this.saldoProdotto;
/*     */   }
/*     */   
/*     */   public void setSaldoProdotto(Double saldoProdotto) {
/* 231 */     this.saldoProdotto = saldoProdotto;
/*     */   }
/*     */   
/*     */   public Date getDataValorizzazione() {
/* 235 */     return this.dataValorizzazione;
/*     */   }
/*     */   
/*     */   public void setDataValorizzazione(Date dataValorizzazione) {
/* 239 */     this.dataValorizzazione = dataValorizzazione;
/*     */   }
/*     */   
/*     */   public String getFlagLiraEuro() {
/* 243 */     return this.flagLiraEuro;
/*     */   }
/*     */   
/*     */   public void setFlagLiraEuro(String flagLiraEuro) {
/* 247 */     this.flagLiraEuro = flagLiraEuro;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 251 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 255 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 259 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRasBankGpElencoProd.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */