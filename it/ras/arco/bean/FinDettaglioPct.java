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
/*     */ public class FinDettaglioPct
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer dettaglioPctId;
/*     */   private String pctDenominazione;
/*     */   private Double pctPrezzoTermine;
/*     */   private Date pctDataTermine;
/*     */   private Double pctCambioTermine;
/*     */   private Double pctControvaloreTermine;
/*     */   private String divisa;
/*     */   private Date dataOrdine;
/*     */   private String numOperazione;
/*     */   private Date dataInserimento;
/*     */   private FinPosizione posizione;
/*     */   private String utenteInserimento;
/*     */   private String isinSottostante;
/*     */   private Double prezzoPronti;
/*     */   private Date dataPronti;
/*     */   private Double cambioPronti;
/*     */   private Double controvalorePronti;
/*     */   private Double quantita;
/*     */   
/*     */   public String getNumOperazione() {
/*  37 */     return this.numOperazione;
/*     */   }
/*     */   public void setNumOperazione(String numOperazione) {
/*  40 */     this.numOperazione = numOperazione;
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
/*     */   public FinDettaglioPct(Date inserimento, Date ordine, String divisa, String operazione, Double termine, Double termine2, Date termine3, String denominazione, Double termine4, String inserimento2) {
/*  58 */     this.dataInserimento = inserimento;
/*  59 */     this.dataOrdine = ordine;
/*  60 */     this.divisa = divisa;
/*  61 */     this.numOperazione = operazione;
/*  62 */     this.pctCambioTermine = termine;
/*  63 */     this.pctControvaloreTermine = termine2;
/*  64 */     this.pctDataTermine = termine3;
/*  65 */     this.pctDenominazione = denominazione;
/*  66 */     this.pctPrezzoTermine = termine4;
/*  67 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataOrdine() {
/*  73 */     return this.dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataOrdine(Date dataOrdine) {
/*  79 */     this.dataOrdine = dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPctCambioTermine() {
/*  88 */     return this.pctCambioTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctCambioTermine(Double pctCambioTermine) {
/*  94 */     this.pctCambioTermine = pctCambioTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getPctDataTermine() {
/* 103 */     return this.pctDataTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctDataTermine(Date pctDataTermine) {
/* 109 */     this.pctDataTermine = pctDataTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPctDenominazione() {
/* 115 */     return this.pctDenominazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctDenominazione(String pctDenominazione) {
/* 121 */     this.pctDenominazione = pctDenominazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPctPrezzoTermine() {
/* 127 */     return this.pctPrezzoTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctPrezzoTermine(Double pctPrezzoTermine) {
/* 133 */     this.pctPrezzoTermine = pctPrezzoTermine;
/*     */   }
/*     */   public String getDivisa() {
/* 136 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(String divisa) {
/* 139 */     this.divisa = divisa;
/*     */   }
/*     */   public Double getPctControvaloreTermine() {
/* 142 */     return this.pctControvaloreTermine;
/*     */   }
/*     */   public void setPctControvaloreTermine(Double pctControvaloreTermine) {
/* 145 */     this.pctControvaloreTermine = pctControvaloreTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinDettaglioPct() {}
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 154 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 160 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 166 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 172 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizione getPosizione() {
/* 178 */     return this.posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizione(FinPosizione posizione) {
/* 184 */     this.posizione = posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getDettaglioPctId() {
/* 190 */     return this.dettaglioPctId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDettaglioPctId(Integer dettaglioPctId) {
/* 196 */     this.dettaglioPctId = dettaglioPctId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIsinSottostante() {
/* 202 */     return this.isinSottostante;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsinSottostante(String isinSottostante) {
/* 208 */     this.isinSottostante = isinSottostante;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCambioPronti() {
/* 215 */     return this.cambioPronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCambioPronti(Double cambioPronti) {
/* 221 */     this.cambioPronti = cambioPronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getControvalorePronti() {
/* 227 */     return this.controvalorePronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControvalorePronti(Double controvalorePronti) {
/* 233 */     this.controvalorePronti = controvalorePronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPronti() {
/* 239 */     return this.dataPronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPronti(Date dataPronti) {
/* 245 */     this.dataPronti = dataPronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoPronti() {
/* 251 */     return this.prezzoPronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoPronti(Double prezzoPronti) {
/* 257 */     this.prezzoPronti = prezzoPronti;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuantita() {
/* 263 */     return this.quantita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuantita(Double quantita) {
/* 269 */     this.quantita = quantita;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDettaglioPct.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */