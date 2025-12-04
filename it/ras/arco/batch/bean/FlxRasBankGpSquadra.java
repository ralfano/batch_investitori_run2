/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.arco.bean.FinCointestazione;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ public class FlxRasBankGpSquadra
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer RasBankGpSquadraId;
/*     */   private String numContratto;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinCointestazione cointestazione;
/*     */   private FinSoggetto soggetto;
/*     */   
/*     */   public FlxRasBankGpSquadra(String numContratto, Date dataInserimento, String utenteInserimento, FinCointestazione cointestazione, FinSoggetto soggetto) {
/*  51 */     this.numContratto = numContratto;
/*     */     
/*  53 */     this.dataInserimento = dataInserimento;
/*     */     
/*  55 */     this.utenteInserimento = utenteInserimento;
/*     */ 
/*     */     
/*  58 */     this.cointestazione = cointestazione;
/*  59 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxRasBankGpSquadra() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxRasBankGpSquadra(FinCointestazione cointestazione, FinSoggetto soggetto) {
/*  69 */     this.cointestazione = cointestazione;
/*  70 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public Integer getRasBankGpSquadraId() {
/*  74 */     return this.RasBankGpSquadraId;
/*     */   }
/*     */   
/*     */   public void setRasBankGpSquadraId(Integer RasBankGpSquadraId) {
/*  78 */     this.RasBankGpSquadraId = RasBankGpSquadraId;
/*     */   }
/*     */   
/*     */   public String getNumContratto() {
/*  82 */     return this.numContratto;
/*     */   }
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/*  86 */     this.numContratto = numContratto;
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
/*     */   public Date getDataInserimento() {
/* 107 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 111 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 116 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 120 */     this.utenteInserimento = utenteInserimento;
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
/*     */   public FinCointestazione getCointestazione() {
/* 134 */     return this.cointestazione;
/*     */   }
/*     */   
/*     */   public void setCointestazione(FinCointestazione cointestazione) {
/* 138 */     this.cointestazione = cointestazione;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 142 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 146 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 150 */     return (new ToStringBuilder(this)).append("RasBankGpSquadraId", getRasBankGpSquadraId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRasBankGpSquadra.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */