/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ public class FinAltriProdDet
/*     */   extends FinContratto
/*     */   implements Serializable
/*     */ {
/*     */   private Date dataInserimento;
/*     */   private Date dataSottoscrizione;
/*     */   private Date dataScadenza;
/*     */   private Double importoTot;
/*     */   private Double importoRichiesto;
/*     */   private String tipo;
/*     */   private FinContratto contratto;
/*     */   
/*     */   public FinAltriProdDet(Date dataInserimento, Date dataSottoscrizione, Date dataScadenza, Double importoTot, Double importoRichiesto, String tipo, Set altriProdotti, FinContratto contratto) {
/*  32 */     this.dataInserimento = dataInserimento;
/*  33 */     this.dataSottoscrizione = dataSottoscrizione;
/*  34 */     this.dataScadenza = dataScadenza;
/*  35 */     this.importoTot = importoTot;
/*  36 */     this.importoRichiesto = importoRichiesto;
/*  37 */     this.tipo = tipo;
/*     */     
/*  39 */     this.contratto = contratto;
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
/*     */   public FinAltriProdDet() {}
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
/*     */   public Date getDataInserimento() {
/*  63 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  71 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataScadenza() {
/*  79 */     return this.dataScadenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataScadenza(Date dataScadenza) {
/*  87 */     this.dataScadenza = dataScadenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataSottoscrizione() {
/*  95 */     return this.dataSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataSottoscrizione(Date dataSottoscrizione) {
/* 103 */     this.dataSottoscrizione = dataSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoRichiesto() {
/* 111 */     return this.importoRichiesto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoRichiesto(Double importoRichiesto) {
/* 119 */     this.importoRichiesto = importoRichiesto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoTot() {
/* 127 */     return this.importoTot;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoTot(Double importoTot) {
/* 135 */     this.importoTot = importoTot;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 143 */     return this.tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipo(String tipo) {
/* 151 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContratto getContratto() {
/* 160 */     return this.contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContratto(FinContratto contratto) {
/* 168 */     this.contratto = contratto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAltriProdDet.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */