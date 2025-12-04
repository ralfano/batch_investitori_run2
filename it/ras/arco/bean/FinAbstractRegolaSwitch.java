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
/*     */ public abstract class FinAbstractRegolaSwitch
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*  20 */   private Integer id = null;
/*  21 */   private String classe = null;
/*  22 */   private String tipoContratto = null;
/*  23 */   private Date dataInizio = null;
/*  24 */   private Date dataFine = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  29 */   private FinEmittente emittente = null;
/*  30 */   private FinProdotto prodotto = null;
/*  31 */   private FinAttivitaFinanziaria attivitaFinanziaria = null;
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
/*     */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/*  47 */     return this.attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/*  57 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getClasse() {
/*  65 */     return this.classe;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClasse(String classe) {
/*  73 */     this.classe = classe;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/*  81 */     return this.dataFine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  89 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/*  97 */     return this.dataInizio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 105 */     this.dataInizio = dataInizio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEmittente getEmittente() {
/* 113 */     return this.emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittente(FinEmittente emittente) {
/* 121 */     this.emittente = emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getId() {
/* 129 */     return this.id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setId(Integer id) {
/* 137 */     this.id = id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdotto getProdotto() {
/* 145 */     return this.prodotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProdotto(FinProdotto prodotto) {
/* 153 */     this.prodotto = prodotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoContratto() {
/* 161 */     return this.tipoContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoContratto(String tipoContratto) {
/* 169 */     this.tipoContratto = tipoContratto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAbstractRegolaSwitch.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */