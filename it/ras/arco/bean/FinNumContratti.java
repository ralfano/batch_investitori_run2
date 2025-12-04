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
/*     */ public class FinNumContratti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer numContrattiId;
/*     */   private String numeroContratto;
/*     */   private String stato;
/*     */   private FinEmittente emittente;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String tipoGenerazione;
/*     */   private String oggettoGenerazione;
/*     */   private String tipoProdotto;
/*     */   
/*     */   public FinNumContratti() {}
/*     */   
/*     */   public FinNumContratti(Integer numContrattiId, String numeroContratto, String stato, FinEmittente emittente, Date dataInserimento, String utenteInserimento) {
/*  52 */     this.numContrattiId = numContrattiId;
/*  53 */     this.numeroContratto = numeroContratto;
/*  54 */     this.stato = stato;
/*  55 */     this.emittente = emittente;
/*  56 */     this.dataInserimento = dataInserimento;
/*  57 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  64 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  72 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEmittente getEmittente() {
/*  79 */     return this.emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittente(FinEmittente emittente) {
/*  87 */     this.emittente = emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumContrattiId() {
/*  94 */     return this.numContrattiId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumContrattiId(Integer numContrattiId) {
/* 102 */     this.numContrattiId = numContrattiId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContratto() {
/* 109 */     return this.numeroContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroContratto(String numeroContratto) {
/* 117 */     this.numeroContratto = numeroContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStato() {
/* 124 */     return this.stato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStato(String stato) {
/* 132 */     this.stato = stato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 139 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 147 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getOggettoGenerazione() {
/* 154 */     return this.oggettoGenerazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setOggettoGenerazione(String oggettoGenerazione) {
/* 162 */     this.oggettoGenerazione = oggettoGenerazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoGenerazione() {
/* 169 */     return this.tipoGenerazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoGenerazione(String tipoGenerazione) {
/* 177 */     this.tipoGenerazione = tipoGenerazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProdotto() {
/* 184 */     return this.tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 190 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinNumContratti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */