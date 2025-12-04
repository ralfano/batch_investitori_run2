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
/*     */ public class FlxGpramSquadra
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer GpramSquadraId;
/*     */   private String numContratto;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinCointestazione cointestazione;
/*     */   private FinSoggetto soggetto;
/*     */   
/*     */   public FlxGpramSquadra(String numContratto, Date dataInserimento, String utenteInserimento, FinCointestazione cointestazione, FinSoggetto soggetto) {
/*  49 */     this.numContratto = numContratto;
/*     */ 
/*     */     
/*  52 */     this.dataInserimento = dataInserimento;
/*     */     
/*  54 */     this.utenteInserimento = utenteInserimento;
/*     */ 
/*     */     
/*  57 */     this.cointestazione = cointestazione;
/*  58 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxGpramSquadra() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxGpramSquadra(FinCointestazione cointestazione, FinSoggetto soggetto) {
/*  68 */     this.cointestazione = cointestazione;
/*  69 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public Integer getGpramSquadraId() {
/*  73 */     return this.GpramSquadraId;
/*     */   }
/*     */   
/*     */   public void setGpramSquadraId(Integer GpramSquadraId) {
/*  77 */     this.GpramSquadraId = GpramSquadraId;
/*     */   }
/*     */   
/*     */   public String getNumContratto() {
/*  81 */     return this.numContratto;
/*     */   }
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/*  85 */     this.numContratto = numContratto;
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
/*     */   public Date getDataInserimento() {
/* 130 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 134 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 140 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 144 */     this.utenteInserimento = utenteInserimento;
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
/* 158 */     return this.cointestazione;
/*     */   }
/*     */   
/*     */   public void setCointestazione(FinCointestazione cointestazione) {
/* 162 */     this.cointestazione = cointestazione;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 166 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 170 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 174 */     return (new ToStringBuilder(this)).append("GpramSquadraId", getGpramSquadraId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpramSquadra.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */