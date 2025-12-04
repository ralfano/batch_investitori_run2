/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ public class FinEvento
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String EMITTENTE_ID_ALL_FITTIZIE = "F";
/*     */   public static final String EMITTENTE_ID_ALL_REALI = "R";
/*     */   public static final String EMITTENTE_ID_ALL_REALI_E_FITTIZIE = "*";
/*  21 */   private Integer eventoId = null;
/*     */   
/*  23 */   private String emittenteId = null;
/*     */   
/*  25 */   private String tipoSottoscrizione = null;
/*     */   
/*  27 */   private String parametriAggiuntivi = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEvento(String emittenteId, String tipoSottoscrizione, String parametriAggiuntivi) {
/*  37 */     this.emittenteId = emittenteId;
/*  38 */     this.tipoSottoscrizione = tipoSottoscrizione;
/*  39 */     this.parametriAggiuntivi = parametriAggiuntivi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEvento() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEmittenteId() {
/*  55 */     return this.emittenteId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittenteId(String emittenteId) {
/*  64 */     this.emittenteId = emittenteId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getParametriAggiuntivi() {
/*  73 */     return this.parametriAggiuntivi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParametriAggiuntivi(String parametriAggiuntivi) {
/*  82 */     this.parametriAggiuntivi = parametriAggiuntivi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoSottoscrizione() {
/*  91 */     return this.tipoSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoSottoscrizione(String tipoSottoscrizione) {
/* 100 */     this.tipoSottoscrizione = tipoSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getEventoId() {
/* 109 */     return this.eventoId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEventoId(Integer eventoId) {
/* 118 */     this.eventoId = eventoId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinEvento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */