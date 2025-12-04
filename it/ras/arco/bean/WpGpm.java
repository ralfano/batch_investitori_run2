/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WpGpm
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivoGpm;
/*     */   private String noteGpm;
/*     */   private String intermediarioRifGpm;
/*     */   private String capitaleProtettoFlagGpm;
/*     */   private String rendimentoMinimoFlagGpm;
/*     */   private Double percCapitaleProtettoGpm;
/*     */   private Double percRendimentoMinimoGpm;
/*     */   private Date dataValGaranzieGpm;
/*     */   private Date dataInizioGestioneGpm;
/*     */   private String tipoGestioneGpm;
/*     */   private Integer matriceTransUtenteGIdpm;
/*     */   
/*     */   public WpGpm() {}
/*     */   
/*     */   public WpGpm(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  32 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public WpGpm(String gpm, Date gpm2, Date gpm3, String gpm4, Integer idpm, String gpm5, Double gpm6, Double gpm7, Integer gpm8, String gpm9, String gpm10) {
/*  39 */     this.capitaleProtettoFlagGpm = gpm;
/*  40 */     this.dataInizioGestioneGpm = gpm2;
/*  41 */     this.dataValGaranzieGpm = gpm3;
/*  42 */     this.intermediarioRifGpm = gpm4;
/*  43 */     this.matriceTransUtenteGIdpm = idpm;
/*  44 */     this.noteGpm = gpm5;
/*  45 */     this.percCapitaleProtettoGpm = gpm6;
/*  46 */     this.percRendimentoMinimoGpm = gpm7;
/*  47 */     this.progressivoGpm = gpm8;
/*  48 */     this.rendimentoMinimoFlagGpm = gpm9;
/*  49 */     this.tipoGestioneGpm = gpm10;
/*     */   }
/*     */   public String getCapitaleProtettoFlagGpm() {
/*  52 */     return this.capitaleProtettoFlagGpm;
/*     */   }
/*     */   public void setCapitaleProtettoFlagGpm(String capitaleProtettoFlagGpm) {
/*  55 */     this.capitaleProtettoFlagGpm = capitaleProtettoFlagGpm;
/*     */   }
/*     */   public Date getDataInizioGestioneGpm() {
/*  58 */     return this.dataInizioGestioneGpm;
/*     */   }
/*     */   public void setDataInizioGestioneGpm(Date dataInizioGestioneGpm) {
/*  61 */     this.dataInizioGestioneGpm = dataInizioGestioneGpm;
/*     */   }
/*     */   public Date getDataValGaranzieGpm() {
/*  64 */     return this.dataValGaranzieGpm;
/*     */   }
/*     */   public void setDataValGaranzieGpm(Date dataValGaranzieGpm) {
/*  67 */     this.dataValGaranzieGpm = dataValGaranzieGpm;
/*     */   }
/*     */   public String getIntermediarioRifGpm() {
/*  70 */     return this.intermediarioRifGpm;
/*     */   }
/*     */   public void setIntermediarioRifGpm(String intermediarioRifGpm) {
/*  73 */     this.intermediarioRifGpm = intermediarioRifGpm;
/*     */   }
/*     */   public Integer getMatriceTransUtenteGIdpm() {
/*  76 */     return this.matriceTransUtenteGIdpm;
/*     */   }
/*     */   public void setMatriceTransUtenteGIdpm(Integer matriceTransUtenteGIdpm) {
/*  79 */     this.matriceTransUtenteGIdpm = matriceTransUtenteGIdpm;
/*     */   }
/*     */   public String getNoteGpm() {
/*  82 */     return this.noteGpm;
/*     */   }
/*     */   public void setNoteGpm(String noteGpm) {
/*  85 */     this.noteGpm = noteGpm;
/*     */   }
/*     */   public Double getPercCapitaleProtettoGpm() {
/*  88 */     return this.percCapitaleProtettoGpm;
/*     */   }
/*     */   public void setPercCapitaleProtettoGpm(Double percCapitaleProtettoGpm) {
/*  91 */     this.percCapitaleProtettoGpm = percCapitaleProtettoGpm;
/*     */   }
/*     */   public Double getPercRendimentoMinimoGpm() {
/*  94 */     return this.percRendimentoMinimoGpm;
/*     */   }
/*     */   public void setPercRendimentoMinimoGpm(Double percRendimentoMinimoGpm) {
/*  97 */     this.percRendimentoMinimoGpm = percRendimentoMinimoGpm;
/*     */   }
/*     */   public Integer getProgressivoGpm() {
/* 100 */     return this.progressivoGpm;
/*     */   }
/*     */   public void setProgressivoGpm(Integer progressivoGpm) {
/* 103 */     this.progressivoGpm = progressivoGpm;
/*     */   }
/*     */   public String getRendimentoMinimoFlagGpm() {
/* 106 */     return this.rendimentoMinimoFlagGpm;
/*     */   }
/*     */   public void setRendimentoMinimoFlagGpm(String rendimentoMinimoFlagGpm) {
/* 109 */     this.rendimentoMinimoFlagGpm = rendimentoMinimoFlagGpm;
/*     */   }
/*     */   public String getTipoGestioneGpm() {
/* 112 */     return this.tipoGestioneGpm;
/*     */   }
/*     */   public void setTipoGestioneGpm(String tipoGestioneGpm) {
/* 115 */     this.tipoGestioneGpm = tipoGestioneGpm;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpGpm.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */