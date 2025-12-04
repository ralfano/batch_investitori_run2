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
/*     */ public class FlxSecLegCoint
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer codiceSocieta;
/*     */   private String codiceAttivita;
/*     */   private String ndgSec;
/*     */   private String ndgDelCliente;
/*     */   private Integer numeroSequenza;
/*     */   private Date dataInizioValiditaLegame;
/*     */   private Date dataFineValiditaLegame;
/*     */   private String filler;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/*  34 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  41 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  48 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  55 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecLegCoint() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecLegCoint(String attivita, Integer societa, Date caricamento, Date legame, Date legame2, String filler, String istanza, String cliente, String sec, Integer sequenza, String elab) {
/*  65 */     this.codiceAttivita = attivita;
/*  66 */     this.codiceSocieta = societa;
/*  67 */     this.dataCaricamento = caricamento;
/*  68 */     this.dataFineValiditaLegame = legame;
/*  69 */     this.dataInizioValiditaLegame = legame2;
/*  70 */     this.filler = filler;
/*  71 */     this.istanza = istanza;
/*  72 */     this.ndgDelCliente = cliente;
/*  73 */     this.ndgSec = sec;
/*  74 */     this.numeroSequenza = sequenza;
/*  75 */     this.statoElab = elab;
/*     */   }
/*     */   
/*     */   public String getCodiceAttivita() {
/*  79 */     return this.codiceAttivita;
/*     */   }
/*     */   public void setCodiceAttivita(String codiceAttivita) {
/*  82 */     this.codiceAttivita = codiceAttivita;
/*     */   }
/*     */   public Integer getCodiceSocieta() {
/*  85 */     return this.codiceSocieta;
/*     */   }
/*     */   public void setCodiceSocieta(Integer codiceSocieta) {
/*  88 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */   public Date getDataCaricamento() {
/*  91 */     return this.dataCaricamento;
/*     */   }
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  94 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   public Date getDataFineValiditaLegame() {
/*  97 */     return this.dataFineValiditaLegame;
/*     */   }
/*     */   public void setDataFineValiditaLegame(Date dataFineValiditaLegame) {
/* 100 */     this.dataFineValiditaLegame = dataFineValiditaLegame;
/*     */   }
/*     */   public Date getDataInizioValiditaLegame() {
/* 103 */     return this.dataInizioValiditaLegame;
/*     */   }
/*     */   public void setDataInizioValiditaLegame(Date dataInizioValiditaLegame) {
/* 106 */     this.dataInizioValiditaLegame = dataInizioValiditaLegame;
/*     */   }
/*     */   public String getFiller() {
/* 109 */     return this.filler;
/*     */   }
/*     */   public void setFiller(String filler) {
/* 112 */     this.filler = filler;
/*     */   }
/*     */   public Integer getFlxId() {
/* 115 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 118 */     this.flxId = flxId;
/*     */   }
/*     */   public String getIstanza() {
/* 121 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 124 */     this.istanza = istanza;
/*     */   }
/*     */   public String getNdgDelCliente() {
/* 127 */     return this.ndgDelCliente;
/*     */   }
/*     */   public void setNdgDelCliente(String ndgDelCliente) {
/* 130 */     this.ndgDelCliente = ndgDelCliente;
/*     */   }
/*     */   public String getNdgSec() {
/* 133 */     return this.ndgSec;
/*     */   }
/*     */   public void setNdgSec(String ndgSec) {
/* 136 */     this.ndgSec = ndgSec;
/*     */   }
/*     */   public Integer getNumeroSequenza() {
/* 139 */     return this.numeroSequenza;
/*     */   }
/*     */   public void setNumeroSequenza(Integer numeroSequenza) {
/* 142 */     this.numeroSequenza = numeroSequenza;
/*     */   }
/*     */   public String getStatoElab() {
/* 145 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 148 */     this.statoElab = statoElab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecLegCoint.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */