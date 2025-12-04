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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxInvestitoriSaldiUff
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroRapporto;
/*     */   private Double saldoProdotto;
/*     */   private Date dataValorizzazione;
/*     */   private String codiceEsternoPortafoglio;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/*  31 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  38 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  44 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  51 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxInvestitoriSaldiUff() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxInvestitoriSaldiUff(String portafoglio, Date caricamento, Date valorizzazione, String istanza, String rapporto, Double prodotto, String elab) {
/*  70 */     this.codiceEsternoPortafoglio = portafoglio;
/*  71 */     this.dataCaricamento = caricamento;
/*  72 */     this.dataValorizzazione = valorizzazione;
/*  73 */     this.istanza = istanza;
/*  74 */     this.numeroRapporto = rapporto;
/*  75 */     this.saldoProdotto = prodotto;
/*  76 */     this.statoElab = elab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceEsternoPortafoglio() {
/*  82 */     return this.codiceEsternoPortafoglio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceEsternoPortafoglio(String codiceEsternoPortafoglio) {
/*  88 */     this.codiceEsternoPortafoglio = codiceEsternoPortafoglio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  94 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 100 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValorizzazione() {
/* 106 */     return this.dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValorizzazione(Date dataValorizzazione) {
/* 112 */     this.dataValorizzazione = dataValorizzazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 118 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 124 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 130 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 136 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroRapporto() {
/* 142 */     return this.numeroRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroRapporto(String numeroRapporto) {
/* 148 */     this.numeroRapporto = numeroRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getSaldoProdotto() {
/* 154 */     return this.saldoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoProdotto(Double saldoProdotto) {
/* 160 */     this.saldoProdotto = saldoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 166 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 172 */     this.statoElab = statoElab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxInvestitoriSaldiUff.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */