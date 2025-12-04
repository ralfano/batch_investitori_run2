/*     */ package it.ras.arco.bean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinDettaglioMov
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer extDettaglioMovID;
/*     */   private String numeroMovimentoEsterno;
/*     */   private Integer attivitaFinanziariaID;
/*     */   private Integer contrattoID;
/*     */   private Integer numeroMovimento;
/*     */   private Integer numeroProgressivo;
/*     */   private Date dataCompetenza;
/*     */   private Double quoteOperazione;
/*     */   private Double quoteLibereContabili;
/*     */   private Double quoteCertificate;
/*     */   private String tipoQuote;
/*     */   private Date dataCompetenzaOriginale;
/*     */   private Double coeffRicalQuoteAmmort;
/*     */   private String fondoProvRicalAmmort;
/*     */   private Double scontoQuoteTunnel;
/*     */   private Date dataInserimentoRecord;
/*     */   private String utenteInserimento;
/*     */   private String statoElaborazione;
/*     */   
/*     */   public FinDettaglioMov(String numeroMovimentoEsterno, Integer attivitaFinanziariaID, Integer contrattoID, Integer numeroMovimento, Integer numeroProgressivo, Date dataCompetenza, Double quoteOperazione, Double quoteLibereContabili, Double quoteCertificate, String tipoQuote, Date dataCompetenzaOriginale, Double coeffRicalQuoteAmmort, String fondoProvRicalAmmort, Double scontoQuoteTunnel, Date dataInserimentoRecord, String utenteInserimento, String statoElaborazione) {
/*  76 */     this.numeroMovimentoEsterno = numeroMovimentoEsterno;
/*  77 */     this.attivitaFinanziariaID = attivitaFinanziariaID;
/*  78 */     this.contrattoID = contrattoID;
/*  79 */     this.numeroMovimento = numeroMovimento;
/*  80 */     this.numeroProgressivo = numeroProgressivo;
/*  81 */     this.dataCompetenza = dataCompetenza;
/*  82 */     this.quoteOperazione = quoteOperazione;
/*  83 */     this.quoteLibereContabili = quoteLibereContabili;
/*  84 */     this.quoteCertificate = quoteCertificate;
/*  85 */     this.tipoQuote = tipoQuote;
/*  86 */     this.dataCompetenzaOriginale = dataCompetenzaOriginale;
/*  87 */     this.coeffRicalQuoteAmmort = coeffRicalQuoteAmmort;
/*  88 */     this.fondoProvRicalAmmort = fondoProvRicalAmmort;
/*  89 */     this.scontoQuoteTunnel = scontoQuoteTunnel;
/*  90 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*  91 */     this.utenteInserimento = utenteInserimento;
/*  92 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinDettaglioMov() {}
/*     */ 
/*     */   
/*     */   public Integer getExtDettaglioMovID() {
/* 100 */     return this.extDettaglioMovID;
/*     */   }
/*     */   
/*     */   public void setExtDettaglioMovID(Integer extDettaglioMovID) {
/* 104 */     this.extDettaglioMovID = extDettaglioMovID;
/*     */   }
/*     */   
/*     */   public String getNumeroMovimentoEsterno() {
/* 108 */     return this.numeroMovimentoEsterno;
/*     */   }
/*     */   
/*     */   public void setNumeroMovimentoEsterno(String numeroMovimentoEsterno) {
/* 112 */     this.numeroMovimentoEsterno = numeroMovimentoEsterno;
/*     */   }
/*     */   
/*     */   public Integer getAttivitaFinanziariaID() {
/* 116 */     return this.attivitaFinanziariaID;
/*     */   }
/*     */   
/*     */   public void setAttivitaFinanziariaID(Integer attivitaFinanziariaID) {
/* 120 */     this.attivitaFinanziariaID = attivitaFinanziariaID;
/*     */   }
/*     */   
/*     */   public Integer getContrattoID() {
/* 124 */     return this.contrattoID;
/*     */   }
/*     */   
/*     */   public void setContrattoID(Integer contrattoID) {
/* 128 */     this.contrattoID = contrattoID;
/*     */   }
/*     */   
/*     */   public Integer getNumeroMovimento() {
/* 132 */     return this.numeroMovimento;
/*     */   }
/*     */   
/*     */   public void setNumeroMovimento(Integer numeroMovimento) {
/* 136 */     this.numeroMovimento = numeroMovimento;
/*     */   }
/*     */   
/*     */   public Integer getNumeroProgressivo() {
/* 140 */     return this.numeroProgressivo;
/*     */   }
/*     */   
/*     */   public void setNumeroProgressivo(Integer numeroProgressivo) {
/* 144 */     this.numeroProgressivo = numeroProgressivo;
/*     */   }
/*     */   
/*     */   public Date getDataCompetenza() {
/* 148 */     return this.dataCompetenza;
/*     */   }
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 152 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */   
/*     */   public Double getQuoteOperazione() {
/* 156 */     return this.quoteOperazione;
/*     */   }
/*     */   
/*     */   public void setQuoteOperazione(Double quoteOperazione) {
/* 160 */     this.quoteOperazione = quoteOperazione;
/*     */   }
/*     */   
/*     */   public Double getQuoteLibereContabili() {
/* 164 */     return this.quoteLibereContabili;
/*     */   }
/*     */   
/*     */   public void setQuoteLibereContabili(Double quoteLibereContabili) {
/* 168 */     this.quoteLibereContabili = quoteLibereContabili;
/*     */   }
/*     */   
/*     */   public Double getQuoteCertificate() {
/* 172 */     return this.quoteCertificate;
/*     */   }
/*     */   
/*     */   public void setQuoteCertificate(Double quoteCertificate) {
/* 176 */     this.quoteCertificate = quoteCertificate;
/*     */   }
/*     */   
/*     */   public String getTipoQuote() {
/* 180 */     return this.tipoQuote;
/*     */   }
/*     */   
/*     */   public void setTipoQuote(String tipoQuote) {
/* 184 */     this.tipoQuote = tipoQuote;
/*     */   }
/*     */   
/*     */   public Date getDataCompetenzaOriginale() {
/* 188 */     return this.dataCompetenzaOriginale;
/*     */   }
/*     */   
/*     */   public void setDataCompetenzaOriginale(Date dataCompetenzaOriginale) {
/* 192 */     this.dataCompetenzaOriginale = dataCompetenzaOriginale;
/*     */   }
/*     */   
/*     */   public Double getCoeffRicalQuoteAmmort() {
/* 196 */     return this.coeffRicalQuoteAmmort;
/*     */   }
/*     */   
/*     */   public void setCoeffRicalQuoteAmmort(Double coeffRicalQuoteAmmort) {
/* 200 */     this.coeffRicalQuoteAmmort = coeffRicalQuoteAmmort;
/*     */   }
/*     */   
/*     */   public String getFondoProvRicalAmmort() {
/* 204 */     return this.fondoProvRicalAmmort;
/*     */   }
/*     */   
/*     */   public void setFondoProvRicalAmmort(String fondoProvRicalAmmort) {
/* 208 */     this.fondoProvRicalAmmort = fondoProvRicalAmmort;
/*     */   }
/*     */   
/*     */   public Double getScontoQuoteTunnel() {
/* 212 */     return this.scontoQuoteTunnel;
/*     */   }
/*     */   
/*     */   public void setScontoQuoteTunnel(Double scontoQuoteTunnel) {
/* 216 */     this.scontoQuoteTunnel = scontoQuoteTunnel;
/*     */   }
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/* 220 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/* 224 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 228 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 232 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 236 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 240 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 244 */     return (new ToStringBuilder(this)).append("extDettaglioMovID", getExtDettaglioMovID()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDettaglioMov.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */