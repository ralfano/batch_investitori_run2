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
/*     */ public class FinPolizzaAbbinabile
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer polizzaAbbinabileId;
/*     */   private String codiceCompagnia;
/*     */   private String numeroPolizza;
/*     */   private String codiceRamo;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinPolizzaAbbinabile() {}
/*     */   
/*     */   public FinPolizzaAbbinabile(Integer polizzaAbbinabileId) {
/*  37 */     this.polizzaAbbinabileId = polizzaAbbinabileId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPolizzaAbbinabileId() {
/*  47 */     return this.polizzaAbbinabileId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPolizzaAbbinabileId(Integer polizzaAbbinabileId) {
/*  53 */     this.polizzaAbbinabileId = polizzaAbbinabileId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  59 */     return this.codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  65 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroPolizza() {
/*  71 */     return this.numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPolizza(String numeroPolizza) {
/*  77 */     this.numeroPolizza = numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRamo() {
/*  83 */     return this.codiceRamo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRamo(String codiceRamo) {
/*  89 */     this.codiceRamo = codiceRamo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  95 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 101 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 107 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 113 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPolizzaAbbinabile.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */