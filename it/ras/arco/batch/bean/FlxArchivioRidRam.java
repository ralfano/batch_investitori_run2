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
/*     */ public class FlxArchivioRidRam
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoRecord;
/*     */   private String codiceFondo;
/*     */   private String numeroMandato;
/*     */   private Double importo;
/*     */   private String periodicita;
/*     */   private String fineMese;
/*     */   private String codiceRichiedente;
/*     */   private String stato;
/*     */   private String cinIban;
/*     */   private String checkDigitIban;
/*     */   private String codicePaeseIban;
/*     */   private String numeroContoCorrente;
/*     */   private Integer codiceCab;
/*     */   private Integer codiceAbi;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   
/*     */   public FlxArchivioRidRam() {}
/*     */   
/*     */   public String getCheckDigitIban() {
/*  41 */     return this.checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCheckDigitIban(String checkDigitIban) {
/*  47 */     this.checkDigitIban = checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCinIban() {
/*  53 */     return this.cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCinIban(String cinIban) {
/*  59 */     this.cinIban = cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceAbi() {
/*  65 */     return this.codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbi(Integer codiceAbi) {
/*  71 */     this.codiceAbi = codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceCab() {
/*  77 */     return this.codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCab(Integer codiceCab) {
/*  83 */     this.codiceCab = codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceFondo() {
/*  89 */     return this.codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceFondo(String codiceFondo) {
/*  95 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePaeseIban() {
/* 101 */     return this.codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePaeseIban(String codicePaeseIban) {
/* 107 */     this.codicePaeseIban = codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRichiedente() {
/* 113 */     return this.codiceRichiedente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRichiedente(String codiceRichiedente) {
/* 119 */     this.codiceRichiedente = codiceRichiedente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 125 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 131 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFineMese() {
/* 137 */     return this.fineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFineMese(String fineMese) {
/* 143 */     this.fineMese = fineMese;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 149 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 155 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImporto() {
/* 161 */     return this.importo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImporto(Double importo) {
/* 167 */     this.importo = importo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 173 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 179 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContoCorrente() {
/* 185 */     return this.numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContoCorrente(String numeroContoCorrente) {
/* 191 */     this.numeroContoCorrente = numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 197 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 203 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPeriodicita() {
/* 209 */     return this.periodicita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPeriodicita(String periodicita) {
/* 215 */     this.periodicita = periodicita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStato() {
/* 221 */     return this.stato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStato(String stato) {
/* 227 */     this.stato = stato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 233 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 239 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 245 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 251 */     this.tipoRecord = tipoRecord;
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
/*     */   public FlxArchivioRidRam(String tipoRecord, String codiceFondo, String numeroMandato, Double importo, String periodicita, String fineMese, String codiceRichiedente, String stato, String cinIban, String checkDigitIban, String codicePaeseIban, String numeroContoCorrente, Integer codiceCab, Integer codiceAbi, String statoElab, String istanza, Date dataCaricamento) {
/* 279 */     this.tipoRecord = tipoRecord;
/* 280 */     this.codiceFondo = codiceFondo;
/* 281 */     this.numeroMandato = numeroMandato;
/* 282 */     this.importo = importo;
/* 283 */     this.periodicita = periodicita;
/* 284 */     this.fineMese = fineMese;
/* 285 */     this.codiceRichiedente = codiceRichiedente;
/* 286 */     this.stato = stato;
/* 287 */     this.cinIban = cinIban;
/* 288 */     this.checkDigitIban = checkDigitIban;
/* 289 */     this.codicePaeseIban = codicePaeseIban;
/* 290 */     this.numeroContoCorrente = numeroContoCorrente;
/* 291 */     this.codiceCab = codiceCab;
/* 292 */     this.codiceAbi = codiceAbi;
/* 293 */     this.statoElab = statoElab;
/* 294 */     this.istanza = istanza;
/* 295 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxArchivioRidRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */