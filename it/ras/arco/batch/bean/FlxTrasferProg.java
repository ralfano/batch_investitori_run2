/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxTrasferProg
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoRecord;
/*     */   private String tipoOperazione;
/*     */   private String numDispArco;
/*     */   private String codiceRichiedente;
/*     */   private String tabellaPosizioniInUscita;
/*     */   private String quoteInUscita;
/*     */   private String importoInUscita;
/*     */   private String tabellaPosizioniInEntrata;
/*     */   private String importoInEntrata;
/*     */   private String percentualiInEntrata;
/*     */   private String periodicitaTrasferimento;
/*     */   private Integer numeroTrasferimenti;
/*     */   private String scadenzaFineMese;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private Date dataCreazioneDisp;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   private Double importoInUscitaSplit;
/*     */   private Double importoInEntrataSplit;
/*     */   private Double quoteSplit;
/*     */   private Double percentualiInEntrataSplit;
/*     */   
/*     */   public Double getPercentualiInEntrataSplit() {
/*  40 */     return this.percentualiInEntrataSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualiInEntrataSplit(Double percentualiInEntrataSplit) {
/*  46 */     this.percentualiInEntrataSplit = percentualiInEntrataSplit;
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
/*     */   public FlxTrasferProg() {}
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
/*     */   public FlxTrasferProg(String tipoOperazione, String numDispArco, String codiceRichiedente, String tabellaPosizioniInUscita, String quoteInUscita, String importoInUscita, String tabellaPosizioniInEntrata, String importoInEntrata, String percentualiInEntrata, String periodicitaTrasferimento, Integer numeroTrasferimenti, String scadenzaFineMese, String statoElab, String istanza, Date dataCaricamento, Date dataCreazioneDisp) {
/*  80 */     this.tipoOperazione = tipoOperazione;
/*  81 */     this.numDispArco = numDispArco;
/*  82 */     this.codiceRichiedente = codiceRichiedente;
/*  83 */     this.tabellaPosizioniInUscita = tabellaPosizioniInUscita;
/*  84 */     this.quoteInUscita = quoteInUscita;
/*  85 */     this.importoInUscita = importoInUscita;
/*  86 */     this.tabellaPosizioniInEntrata = tabellaPosizioniInEntrata;
/*  87 */     this.importoInEntrata = importoInEntrata;
/*  88 */     this.percentualiInEntrata = percentualiInEntrata;
/*  89 */     this.periodicitaTrasferimento = periodicitaTrasferimento;
/*  90 */     this.numeroTrasferimenti = numeroTrasferimenti;
/*  91 */     this.scadenzaFineMese = scadenzaFineMese;
/*  92 */     this.statoElab = statoElab;
/*  93 */     this.istanza = istanza;
/*  94 */     this.dataCaricamento = dataCaricamento;
/*  95 */     this.dataCreazioneDisp = dataCreazioneDisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRichiedente() {
/* 101 */     return this.codiceRichiedente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRichiedente(String codiceRichiedente) {
/* 107 */     this.codiceRichiedente = codiceRichiedente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 113 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 119 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 125 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 131 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoInEntrata() {
/* 137 */     return this.importoInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoInEntrata(String importoInEntrata) {
/* 143 */     this.importoInEntrata = importoInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoInUscita() {
/* 149 */     return this.importoInUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoInUscita(String importoInUscita) {
/* 155 */     this.importoInUscita = importoInUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 161 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 167 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumDispArco() {
/* 173 */     return this.numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDispArco(String numDispArco) {
/* 179 */     this.numDispArco = numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumeroTrasferimenti() {
/* 185 */     return this.numeroTrasferimenti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroTrasferimenti(Integer numeroTrasferimenti) {
/* 191 */     this.numeroTrasferimenti = numeroTrasferimenti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPercentualiInEntrata() {
/* 197 */     return this.percentualiInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualiInEntrata(String percentualiInEntrata) {
/* 203 */     this.percentualiInEntrata = percentualiInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPeriodicitaTrasferimento() {
/* 209 */     return this.periodicitaTrasferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPeriodicitaTrasferimento(String periodicitaTrasferimento) {
/* 215 */     this.periodicitaTrasferimento = periodicitaTrasferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getQuoteInUscita() {
/* 221 */     return this.quoteInUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuoteInUscita(String quoteInUscita) {
/* 227 */     this.quoteInUscita = quoteInUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getScadenzaFineMese() {
/* 233 */     return this.scadenzaFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setScadenzaFineMese(String scadenzaFineMese) {
/* 239 */     this.scadenzaFineMese = scadenzaFineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 245 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 251 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTabellaPosizioniInEntrata() {
/* 257 */     return this.tabellaPosizioniInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabellaPosizioniInEntrata(String tabellaPosizioniInEntrata) {
/* 263 */     this.tabellaPosizioniInEntrata = tabellaPosizioniInEntrata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTabellaPosizioniInUscita() {
/* 269 */     return this.tabellaPosizioniInUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTabellaPosizioniInUscita(String tabellaPosizioniInUscita) {
/* 275 */     this.tabellaPosizioniInUscita = tabellaPosizioniInUscita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 281 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 287 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCreazioneDisp() {
/* 293 */     return this.dataCreazioneDisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCreazioneDisp(Date dataCreazioneDisp) {
/* 299 */     this.dataCreazioneDisp = dataCreazioneDisp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 305 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 311 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElaborazione() {
/* 317 */     return this.dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 323 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 329 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 335 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoInEntrataSplit() {
/* 341 */     return this.importoInEntrataSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoInEntrataSplit(Double importoInEntrataSplit) {
/* 347 */     this.importoInEntrataSplit = importoInEntrataSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoInUscitaSplit() {
/* 353 */     return this.importoInUscitaSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoInUscitaSplit(Double importoInUscitaSplit) {
/* 359 */     this.importoInUscitaSplit = importoInUscitaSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuoteSplit() {
/* 365 */     return this.quoteSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuoteSplit(Double quoteSplit) {
/* 371 */     this.quoteSplit = quoteSplit;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxTrasferProg.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */