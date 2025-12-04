/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxArchivioStacCedola
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String numeroMandato;
/*     */   private String codiceIntestatario;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String tipoOperazione;
/*     */   
/*     */   public FlxArchivioStacCedola() {}
/*     */   
/*     */   public FlxArchivioStacCedola(String numeroMandato, String codiceIntestatario, String statoElab, String istanza, Date dataCaricamento, String tipoOperazione) {
/*  37 */     this.numeroMandato = numeroMandato;
/*  38 */     this.codiceIntestatario = codiceIntestatario;
/*  39 */     this.statoElab = statoElab;
/*  40 */     this.istanza = istanza;
/*  41 */     this.dataCaricamento = dataCaricamento;
/*  42 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIntestatario() {
/*  48 */     return this.codiceIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceIntestatario(String codiceIntestatario) {
/*  54 */     this.codiceIntestatario = codiceIntestatario;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  60 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  66 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  72 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  78 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/*  84 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/*  90 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroMandato() {
/*  96 */     return this.numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroMandato(String numeroMandato) {
/* 102 */     this.numeroMandato = numeroMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 108 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 114 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 120 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 126 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxArchivioStacCedola.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */