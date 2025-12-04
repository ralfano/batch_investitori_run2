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
/*     */ public class FlxArchivioStacCedBon
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroMandato;
/*     */   private String codiceAbi;
/*     */   private String codiceCab;
/*     */   private String cinIban;
/*     */   private String checkDigitIban;
/*     */   private String codicePaeseIban;
/*     */   private String numeroContoCorrente;
/*     */   private String codiceIntestatarioBonifico;
/*     */   private String codiceSocieta;
/*     */   private Double percentualeEnte;
/*     */   private Double importoEnte;
/*     */   private String durata;
/*     */   private Date dataInizioErogazione;
/*     */   private String fondoEtico;
/*     */   private String flagGestioneEccedenza;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String tipoOperazione;
/*     */   
/*     */   public FlxArchivioStacCedBon() {}
/*     */   
/*     */   public FlxArchivioStacCedBon(String numeroMandato, String codiceAbi, String codiceCab, String cinIban, String checkDigitIban, String codicePaeseIban, String numeroContoCorrente, String codiceIntestatarioBonifico, String codiceSocieta, Double percentualeEnte, Double importoEnte, String durata, Date dataInizioErogazione, String fondoEtico, String flagGestioneEccedenza, String statoElab, String istanza, Date dataCaricamento, String tipoOperazione) {
/*  71 */     this.numeroMandato = numeroMandato;
/*  72 */     this.codiceAbi = codiceAbi;
/*  73 */     this.codiceCab = codiceCab;
/*  74 */     this.cinIban = cinIban;
/*  75 */     this.checkDigitIban = checkDigitIban;
/*  76 */     this.codicePaeseIban = codicePaeseIban;
/*  77 */     this.numeroContoCorrente = numeroContoCorrente;
/*  78 */     this.codiceIntestatarioBonifico = codiceIntestatarioBonifico;
/*  79 */     this.codiceSocieta = codiceSocieta;
/*  80 */     this.percentualeEnte = percentualeEnte;
/*  81 */     this.importoEnte = importoEnte;
/*  82 */     this.durata = durata;
/*  83 */     this.dataInizioErogazione = dataInizioErogazione;
/*  84 */     this.fondoEtico = fondoEtico;
/*  85 */     this.flagGestioneEccedenza = flagGestioneEccedenza;
/*  86 */     this.statoElab = statoElab;
/*  87 */     this.istanza = istanza;
/*  88 */     this.dataCaricamento = dataCaricamento;
/*  89 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCheckDigitIban() {
/*  95 */     return this.checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCheckDigitIban(String checkDigitIban) {
/* 101 */     this.checkDigitIban = checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCinIban() {
/* 107 */     return this.cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCinIban(String cinIban) {
/* 113 */     this.cinIban = cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAbi() {
/* 119 */     return this.codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbi(String codiceAbi) {
/* 125 */     this.codiceAbi = codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCab() {
/* 131 */     return this.codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCab(String codiceCab) {
/* 137 */     this.codiceCab = codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntestatarioBonifico() {
/* 143 */     return this.codiceIntestatarioBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntestatarioBonifico(String codiceIntestatarioBonifico) {
/* 149 */     this.codiceIntestatarioBonifico = codiceIntestatarioBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePaeseIban() {
/* 155 */     return this.codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePaeseIban(String codicePaeseIban) {
/* 161 */     this.codicePaeseIban = codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSocieta() {
/* 167 */     return this.codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSocieta(String codiceSocieta) {
/* 173 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 179 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 185 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioErogazione() {
/* 191 */     return this.dataInizioErogazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioErogazione(Date dataInizioErogazione) {
/* 197 */     this.dataInizioErogazione = dataInizioErogazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDurata() {
/* 203 */     return this.durata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDurata(String durata) {
/* 209 */     this.durata = durata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagGestioneEccedenza() {
/* 215 */     return this.flagGestioneEccedenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagGestioneEccedenza(String flagGestioneEccedenza) {
/* 221 */     this.flagGestioneEccedenza = flagGestioneEccedenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 227 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 233 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFondoEtico() {
/* 239 */     return this.fondoEtico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFondoEtico(String fondoEtico) {
/* 245 */     this.fondoEtico = fondoEtico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoEnte() {
/* 251 */     return this.importoEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoEnte(Double importoEnte) {
/* 257 */     this.importoEnte = importoEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 263 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 269 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContoCorrente() {
/* 275 */     return this.numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContoCorrente(String numeroContoCorrente) {
/* 281 */     this.numeroContoCorrente = numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 287 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 293 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercentualeEnte() {
/* 299 */     return this.percentualeEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeEnte(Double percentualeEnte) {
/* 305 */     this.percentualeEnte = percentualeEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 311 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 317 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 323 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 329 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxArchivioStacCedBon.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */