/*     */ package it.ras.arco.bean;
/*     */ 
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
/*     */ public class FinCedoleDividendi
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer cedoleDividendiId;
/*     */   private Date dataStacco;
/*     */   private Date dataPagamento;
/*     */   private Double valore;
/*     */   private String tipo;
/*     */   private String divisa;
/*     */   private Date data;
/*     */   private Double rendimentoCedola;
/*     */   private FinAttivitaFinanziaria attivitaFinanziaria;
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/*  32 */     return this.attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/*  40 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCedoleDividendiId() {
/*  48 */     return this.cedoleDividendiId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCedoleDividendiId(Integer cedoleDividendiId) {
/*  56 */     this.cedoleDividendiId = cedoleDividendiId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getData() {
/*  64 */     return this.data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setData(Date data) {
/*  72 */     this.data = data;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataPagamento() {
/*  80 */     return this.dataPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataPagamento(Date dataPagamento) {
/*  88 */     this.dataPagamento = dataPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataStacco() {
/*  96 */     return this.dataStacco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataStacco(Date dataStacco) {
/* 104 */     this.dataStacco = dataStacco;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDivisa() {
/* 112 */     return this.divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 120 */     this.divisa = divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getRendimentoCedola() {
/* 128 */     return this.rendimentoCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRendimentoCedola(Double rendimentoCedola) {
/* 136 */     this.rendimentoCedola = rendimentoCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 144 */     return this.tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipo(String tipo) {
/* 152 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getValore() {
/* 160 */     return this.valore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValore(Double valore) {
/* 168 */     this.valore = valore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCedoleDividendi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */