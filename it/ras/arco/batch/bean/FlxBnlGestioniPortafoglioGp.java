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
/*     */ public class FlxBnlGestioniPortafoglioGp
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer numCtaInt;
/*     */   private String codTitolo;
/*     */   private String tipRecord;
/*     */   private Date datValorizzazione;
/*     */   private Double impControvaloreD;
/*     */   private Double totImpConferito;
/*     */   private Double totImpDisinvesti;
/*     */   private Double numQuote;
/*     */   private Double impControvalore;
/*     */   private String desTitolo;
/*     */   private String codMoneda;
/*     */   private String codUsuModif;
/*     */   private Double pipa;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public String getCodMoneda() {
/*  36 */     return this.codMoneda;
/*     */   }
/*     */   public void setCodMoneda(String codMoneda) {
/*  39 */     this.codMoneda = codMoneda;
/*     */   }
/*     */   public String getCodTitolo() {
/*  42 */     return this.codTitolo;
/*     */   }
/*     */   public void setCodTitolo(String codTitolo) {
/*  45 */     this.codTitolo = codTitolo;
/*     */   }
/*     */   public String getCodUsuModif() {
/*  48 */     return this.codUsuModif;
/*     */   }
/*     */   public void setCodUsuModif(String codUsuModif) {
/*  51 */     this.codUsuModif = codUsuModif;
/*     */   }
/*     */   public Date getDatValorizzazione() {
/*  54 */     return this.datValorizzazione;
/*     */   }
/*     */   public void setDatValorizzazione(Date datValorizzazione) {
/*  57 */     this.datValorizzazione = datValorizzazione;
/*     */   }
/*     */   public String getDesTitolo() {
/*  60 */     return this.desTitolo;
/*     */   }
/*     */   public void setDesTitolo(String desTitolo) {
/*  63 */     this.desTitolo = desTitolo;
/*     */   }
/*     */   public Integer getFlxId() {
/*  66 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/*  69 */     this.flxId = flxId;
/*     */   }
/*     */   public Double getImpControvalore() {
/*  72 */     return this.impControvalore;
/*     */   }
/*     */   public void setImpControvalore(Double impControvalore) {
/*  75 */     this.impControvalore = impControvalore;
/*     */   }
/*     */   public Double getImpControvaloreD() {
/*  78 */     return this.impControvaloreD;
/*     */   }
/*     */   public void setImpControvaloreD(Double impControvaloreD) {
/*  81 */     this.impControvaloreD = impControvaloreD;
/*     */   }
/*     */   public String getIstanza() {
/*  84 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/*  87 */     this.istanza = istanza;
/*     */   }
/*     */   public Integer getNumCtaInt() {
/*  90 */     return this.numCtaInt;
/*     */   }
/*     */   public void setNumCtaInt(Integer numCtaInt) {
/*  93 */     this.numCtaInt = numCtaInt;
/*     */   }
/*     */   public Double getNumQuote() {
/*  96 */     return this.numQuote;
/*     */   }
/*     */   public void setNumQuote(Double numQuote) {
/*  99 */     this.numQuote = numQuote;
/*     */   }
/*     */   public Double getPipa() {
/* 102 */     return this.pipa;
/*     */   }
/*     */   public void setPipa(Double pipa) {
/* 105 */     this.pipa = pipa;
/*     */   }
/*     */   public String getStatoElab() {
/* 108 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 111 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTipRecord() {
/* 114 */     return this.tipRecord;
/*     */   }
/*     */   public void setTipRecord(String tipRecord) {
/* 117 */     this.tipRecord = tipRecord;
/*     */   }
/*     */   public Double getTotImpConferito() {
/* 120 */     return this.totImpConferito;
/*     */   }
/*     */   public void setTotImpConferito(Double totImpConferito) {
/* 123 */     this.totImpConferito = totImpConferito;
/*     */   }
/*     */   public Double getTotImpDisinvesti() {
/* 126 */     return this.totImpDisinvesti;
/*     */   }
/*     */   public void setTotImpDisinvesti(Double totImpDisinvesti) {
/* 129 */     this.totImpDisinvesti = totImpDisinvesti;
/*     */   }
/*     */   public Date getDataErrore() {
/* 132 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 135 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 138 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 141 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxBnlGestioniPortafoglioGp.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */