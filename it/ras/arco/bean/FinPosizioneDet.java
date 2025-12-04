/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class FinPosizioneDet
/*     */   extends FinPosizione
/*     */   implements Serializable {
/*     */   private String pctCodiceIsin;
/*     */   private String pctCodiceTitoloSec;
/*     */   private String pctDenominazione;
/*     */   private Double pctPrezzoTermine;
/*     */   private Date pctDataTermine;
/*     */   private Double pctCambioTermine;
/*     */   private Double pctControvaloreTermine;
/*     */   private String divisa;
/*     */   private Date dataOrdine;
/*     */   private Date obbDval;
/*     */   private Double obbQuantitaAssegnata;
/*     */   private Double obbControvalore;
/*     */   private Double obbPrezzo;
/*     */   private String numOperazione;
/*     */   
/*     */   public String getNumOperazione() {
/*  25 */     return this.numOperazione;
/*     */   }
/*     */   public void setNumOperazione(String numOperazione) {
/*  28 */     this.numOperazione = numOperazione;
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
/*     */   public FinPosizioneDet(Double percentuale, FinAttivitaFinanziaria fin, Double medio, Double commissioni, Integer id, Double ctv, Date creazione, Date inserimento, Date val, Integer apert, Double media, Double lordo, Double netto, Double lordo2, Double netto2, Double lordo3, Double netto3, Double lordo4, Double netto4, Double cert, Double pmc, Integer id2, Double bloccata, Double tunnel1, Double tunnel2, Double tunnel3, Double tunnel4, Double quantita, Double disp, Double rateo, Double lordo5, Double netto5, String dossier, Double spese, String tipo, String prodotto, String inserimento2, Double quota, Date ordine, Double controvalore, Date dval, Double prezzo, Double assegnata, Double termine, String isin, String sec, Date termine2, String denominazione, Double termine3, String div, Double pctControTermine) {
/*  90 */     this.dataOrdine = ordine;
/*  91 */     this.obbControvalore = controvalore;
/*  92 */     this.obbDval = dval;
/*  93 */     this.obbPrezzo = prezzo;
/*  94 */     this.obbQuantitaAssegnata = assegnata;
/*  95 */     this.pctCambioTermine = termine;
/*  96 */     this.pctCodiceIsin = isin;
/*  97 */     this.pctCodiceTitoloSec = sec;
/*  98 */     this.pctDataTermine = termine2;
/*  99 */     this.pctDenominazione = denominazione;
/* 100 */     this.pctPrezzoTermine = termine3;
/* 101 */     this.divisa = div;
/* 102 */     this.pctControvaloreTermine = pctControTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataOrdine() {
/* 108 */     return this.dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataOrdine(Date dataOrdine) {
/* 114 */     this.dataOrdine = dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getObbControvalore() {
/* 120 */     return this.obbControvalore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setObbControvalore(Double obbControvalore) {
/* 126 */     this.obbControvalore = obbControvalore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getObbDval() {
/* 132 */     return this.obbDval;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setObbDval(Date obbDval) {
/* 138 */     this.obbDval = obbDval;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getObbPrezzo() {
/* 144 */     return this.obbPrezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setObbPrezzo(Double obbPrezzo) {
/* 150 */     this.obbPrezzo = obbPrezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getObbQuantitaAssegnata() {
/* 156 */     return this.obbQuantitaAssegnata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setObbQuantitaAssegnata(Double obbQuantitaAssegnata) {
/* 162 */     this.obbQuantitaAssegnata = obbQuantitaAssegnata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPctCambioTermine() {
/* 168 */     return this.pctCambioTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctCambioTermine(Double pctCambioTermine) {
/* 174 */     this.pctCambioTermine = pctCambioTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPctCodiceIsin() {
/* 180 */     return this.pctCodiceIsin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctCodiceIsin(String pctCodiceIsin) {
/* 186 */     this.pctCodiceIsin = pctCodiceIsin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPctCodiceTitoloSec() {
/* 192 */     return this.pctCodiceTitoloSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctCodiceTitoloSec(String pctCodiceTitoloSec) {
/* 198 */     this.pctCodiceTitoloSec = pctCodiceTitoloSec;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getPctDataTermine() {
/* 204 */     return this.pctDataTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctDataTermine(Date pctDataTermine) {
/* 210 */     this.pctDataTermine = pctDataTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPctDenominazione() {
/* 216 */     return this.pctDenominazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctDenominazione(String pctDenominazione) {
/* 222 */     this.pctDenominazione = pctDenominazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPctPrezzoTermine() {
/* 228 */     return this.pctPrezzoTermine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPctPrezzoTermine(Double pctPrezzoTermine) {
/* 234 */     this.pctPrezzoTermine = pctPrezzoTermine;
/*     */   }
/*     */   public String getDivisa() {
/* 237 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(String divisa) {
/* 240 */     this.divisa = divisa;
/*     */   }
/*     */   public Double getPctControvaloreTermine() {
/* 243 */     return this.pctControvaloreTermine;
/*     */   }
/*     */   public void setPctControvaloreTermine(Double pctControvaloreTermine) {
/* 246 */     this.pctControvaloreTermine = pctControvaloreTermine;
/*     */   }
/*     */   
/*     */   public FinPosizioneDet() {}
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPosizioneDet.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */