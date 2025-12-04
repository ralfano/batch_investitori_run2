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
/*     */ public class FlxRamScartiOrdini
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoRecord;
/*     */   private Integer numDispArco;
/*     */   private Integer codiceErrore;
/*     */   private String descrizioneErrore;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private Integer ndgArco;
/*     */   private FinSottoscrizione sottoscrizione;
/*     */   
/*     */   public Integer getCodiceErrore() {
/*  35 */     return this.codiceErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceErrore(Integer codiceErrore) {
/*  41 */     this.codiceErrore = codiceErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  47 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  53 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  59 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  65 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  71 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  77 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/*  83 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/*  89 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/*  95 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 101 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSottoscrizione getSottoscrizione() {
/* 107 */     return this.sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottoscrizione(FinSottoscrizione sottoscrizione) {
/* 113 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 119 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 125 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNumDispArco() {
/* 131 */     return this.numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumDispArco(Integer numDispArco) {
/* 137 */     this.numDispArco = numDispArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCognome() {
/* 143 */     return this.cognome;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCognome(String cognome) {
/* 149 */     this.cognome = cognome;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNdgArco() {
/* 155 */     return this.ndgArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdgArco(Integer ndgArco) {
/* 161 */     this.ndgArco = ndgArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNome() {
/* 167 */     return this.nome;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNome(String nome) {
/* 173 */     this.nome = nome;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FlxRamScartiOrdini.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */