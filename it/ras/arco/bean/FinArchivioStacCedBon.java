/*     */ package it.ras.arco.bean;
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
/*     */ public class FinArchivioStacCedBon
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer archivioStacCedBonId;
/*     */   private Integer contrattoId;
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
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinArchivioStacCedBon(Integer contrattoId, String numeroMandato, String codiceAbi, String codiceCab, String cinIban, String checkDigitIban, String codicePaeseIban, String numeroContoCorrente, String codiceIntestatarioBonifico, String codiceSocieta, Double percentualeEnte, Double importoEnte, String durata, Date dataInizioErogazione, String fondoEtico, String flagGestioneEccedenza, Date dataInserimento, String utenteInserimento) {
/*  48 */     this.contrattoId = contrattoId;
/*  49 */     this.numeroMandato = numeroMandato;
/*  50 */     this.codiceAbi = codiceAbi;
/*  51 */     this.codiceCab = codiceCab;
/*  52 */     this.cinIban = cinIban;
/*  53 */     this.checkDigitIban = checkDigitIban;
/*  54 */     this.codicePaeseIban = codicePaeseIban;
/*  55 */     this.numeroContoCorrente = numeroContoCorrente;
/*  56 */     this.codiceIntestatarioBonifico = codiceIntestatarioBonifico;
/*  57 */     this.codiceSocieta = codiceSocieta;
/*  58 */     this.percentualeEnte = percentualeEnte;
/*  59 */     this.importoEnte = importoEnte;
/*  60 */     this.durata = durata;
/*  61 */     this.dataInizioErogazione = dataInizioErogazione;
/*  62 */     this.fondoEtico = fondoEtico;
/*  63 */     this.flagGestioneEccedenza = flagGestioneEccedenza;
/*  64 */     this.dataInserimento = dataInserimento;
/*  65 */     this.utenteInserimento = utenteInserimento;
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
/*     */   public FinArchivioStacCedBon() {}
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
/*     */   public Integer getArchivioStacCedBonId() {
/* 100 */     return this.archivioStacCedBonId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setArchivioStacCedBonId(Integer archivioStacCedBonId) {
/* 106 */     this.archivioStacCedBonId = archivioStacCedBonId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCheckDigitIban() {
/* 112 */     return this.checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCheckDigitIban(String checkDigitIban) {
/* 118 */     this.checkDigitIban = checkDigitIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCinIban() {
/* 124 */     return this.cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCinIban(String cinIban) {
/* 130 */     this.cinIban = cinIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAbi() {
/* 136 */     return this.codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAbi(String codiceAbi) {
/* 142 */     this.codiceAbi = codiceAbi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCab() {
/* 148 */     return this.codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCab(String codiceCab) {
/* 154 */     this.codiceCab = codiceCab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntestatarioBonifico() {
/* 160 */     return this.codiceIntestatarioBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntestatarioBonifico(String codiceIntestatarioBonifico) {
/* 166 */     this.codiceIntestatarioBonifico = codiceIntestatarioBonifico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePaeseIban() {
/* 172 */     return this.codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePaeseIban(String codicePaeseIban) {
/* 178 */     this.codicePaeseIban = codicePaeseIban;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSocieta() {
/* 184 */     return this.codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSocieta(String codiceSocieta) {
/* 190 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContrattoId() {
/* 196 */     return this.contrattoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 202 */     this.contrattoId = contrattoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioErogazione() {
/* 208 */     return this.dataInizioErogazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioErogazione(Date dataInizioErogazione) {
/* 214 */     this.dataInizioErogazione = dataInizioErogazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 220 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 226 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDurata() {
/* 232 */     return this.durata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDurata(String durata) {
/* 238 */     this.durata = durata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagGestioneEccedenza() {
/* 244 */     return this.flagGestioneEccedenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagGestioneEccedenza(String flagGestioneEccedenza) {
/* 250 */     this.flagGestioneEccedenza = flagGestioneEccedenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFondoEtico() {
/* 256 */     return this.fondoEtico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFondoEtico(String fondoEtico) {
/* 262 */     this.fondoEtico = fondoEtico;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoEnte() {
/* 268 */     return this.importoEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoEnte(Double importoEnte) {
/* 274 */     this.importoEnte = importoEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContoCorrente() {
/* 280 */     return this.numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContoCorrente(String numeroContoCorrente) {
/* 286 */     this.numeroContoCorrente = numeroContoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/* 292 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 298 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPercentualeEnte() {
/* 304 */     return this.percentualeEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPercentualeEnte(Double percentualeEnte) {
/* 310 */     this.percentualeEnte = percentualeEnte;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 316 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 322 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinArchivioStacCedBon.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */