/*     */ package it.ras.arco.bean;
/*     */ 
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
/*     */ public class FinNucleo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer nucleoId;
/*     */   private Integer ndgNucleo;
/*     */   private Integer soggInfoPromoId;
/*     */   private String tipoRuolo;
/*     */   private String presNote;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinNucleo(Integer ndgNucleo, Integer soggInfoPromoId, String tipoRuolo, String presNote, String datiSupl, Date dataInserimento, String utenteInserimento) {
/*  40 */     this.ndgNucleo = ndgNucleo;
/*  41 */     this.soggInfoPromoId = soggInfoPromoId;
/*  42 */     this.tipoRuolo = tipoRuolo;
/*  43 */     this.presNote = presNote;
/*  44 */     this.datiSupl = datiSupl;
/*  45 */     this.dataInserimento = dataInserimento;
/*  46 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinNucleo() {}
/*     */ 
/*     */   
/*     */   public Integer getNucleoId() {
/*  54 */     return this.nucleoId;
/*     */   }
/*     */   
/*     */   public void setNucleoId(Integer nucleoId) {
/*  58 */     this.nucleoId = nucleoId;
/*     */   }
/*     */   
/*     */   public Integer getNdgNucleo() {
/*  62 */     return this.ndgNucleo;
/*     */   }
/*     */   
/*     */   public void setNdgNucleo(Integer ndgNucleo) {
/*  66 */     this.ndgNucleo = ndgNucleo;
/*     */   }
/*     */   
/*     */   public Integer getSoggInfoPromoId() {
/*  70 */     return this.soggInfoPromoId;
/*     */   }
/*     */   
/*     */   public void setSoggInfoPromoId(Integer soggInfoPromoId) {
/*  74 */     this.soggInfoPromoId = soggInfoPromoId;
/*     */   }
/*     */   
/*     */   public String getTipoRuolo() {
/*  78 */     return this.tipoRuolo;
/*     */   }
/*     */   
/*     */   public void setTipoRuolo(String tipoRuolo) {
/*  82 */     this.tipoRuolo = tipoRuolo;
/*     */   }
/*     */   
/*     */   public String getPresNote() {
/*  86 */     return this.presNote;
/*     */   }
/*     */   
/*     */   public void setPresNote(String presNote) {
/*  90 */     this.presNote = presNote;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/*  94 */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/*  98 */     this.datiSupl = datiSupl;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 102 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 106 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 110 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 114 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 118 */     return (new ToStringBuilder(this)).append("nucleoId", getNucleoId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinNucleo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */