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
/*     */ public class FlxGpSquadra
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer GpramSquadraId;
/*     */   private String numContratto;
/*     */   private Date dataInserimento;
/*     */   private String tipoFabbrica;
/*     */   private String utenteInserimento;
/*     */   private FinCointestazione cointestazione;
/*     */   private FinSoggetto soggetto;
/*     */   
/*     */   public FlxGpSquadra(String numContratto, Date dataInserimento, String utenteInserimento, FinCointestazione cointestazione, FinSoggetto soggetto) {
/*  51 */     this.numContratto = numContratto;
/*     */ 
/*     */     
/*  54 */     this.dataInserimento = dataInserimento;
/*     */     
/*  56 */     this.utenteInserimento = utenteInserimento;
/*     */ 
/*     */     
/*  59 */     this.cointestazione = cointestazione;
/*  60 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxGpSquadra() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxGpSquadra(FinCointestazione cointestazione, FinSoggetto soggetto) {
/*  70 */     this.cointestazione = cointestazione;
/*  71 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public Integer getGpramSquadraId() {
/*  75 */     return this.GpramSquadraId;
/*     */   }
/*     */   
/*     */   public void setGpramSquadraId(Integer GpramSquadraId) {
/*  79 */     this.GpramSquadraId = GpramSquadraId;
/*     */   }
/*     */   
/*     */   public String getNumContratto() {
/*  83 */     return this.numContratto;
/*     */   }
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/*  87 */     this.numContratto = numContratto;
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
/* 132 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 136 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 142 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 146 */     this.utenteInserimento = utenteInserimento;
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
/* 160 */     return this.cointestazione;
/*     */   }
/*     */   
/*     */   public void setCointestazione(FinCointestazione cointestazione) {
/* 164 */     this.cointestazione = cointestazione;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 168 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 172 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 176 */     return (new ToStringBuilder(this)).append("GpramSquadraId", getGpramSquadraId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoFabbrica() {
/* 185 */     return this.tipoFabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoFabbrica(String tipoFabbrica) {
/* 192 */     this.tipoFabbrica = tipoFabbrica;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGpSquadra.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */