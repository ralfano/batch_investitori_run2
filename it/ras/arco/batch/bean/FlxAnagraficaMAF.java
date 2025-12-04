/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAnagraficaMAF
/*     */   extends FlxGenericMAFBean
/*     */ {
/*  15 */   private String nome = null;
/*     */   
/*  17 */   private String tipo = null;
/*     */   
/*  19 */   private String sottotipo = null;
/*     */   
/*  21 */   private String isin = null;
/*     */   
/*  23 */   private String divisa = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  28 */   private String dataInizioValidita = null;
/*     */   
/*  30 */   private String dataFineValidita = null;
/*     */   
/*  32 */   private String attivo = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  37 */   private String societaGestione = null;
/*     */   
/*  39 */   private String paese = null;
/*     */   
/*  41 */   private String codiceSettoreIndustriale = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static final String MESSAGE_DA_DECODIFICARE = "DD";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaMAF(Integer flxId, String statoElaborazione) {
/*  54 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaMAF() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date parseDataInizioValidita() {
/*  74 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date parseDataFineValidita() {
/*  83 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAttivo() {
/*  92 */     return this.attivo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivo(String attivo) {
/* 101 */     this.attivo = attivo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSettoreIndustriale() {
/* 110 */     return this.codiceSettoreIndustriale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSettoreIndustriale(String codiceSettoreIndustriale) {
/* 119 */     this.codiceSettoreIndustriale = codiceSettoreIndustriale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataFineValidita() {
/* 128 */     return this.dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFineValidita(String dataFineValidita) {
/* 137 */     this.dataFineValidita = dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataInizioValidita() {
/* 146 */     return this.dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioValidita(String dataInizioValidita) {
/* 155 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDivisa() {
/* 164 */     return this.divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 173 */     this.divisa = divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIsin() {
/* 182 */     return this.isin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsin(String isin) {
/* 191 */     this.isin = isin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNome() {
/* 200 */     return this.nome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNome(String nome) {
/* 209 */     this.nome = nome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPaese() {
/* 218 */     return this.paese;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPaese(String paese) {
/* 227 */     this.paese = paese;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSocietaGestione() {
/* 236 */     return this.societaGestione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSocietaGestione(String societaGestione) {
/* 245 */     this.societaGestione = societaGestione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSottotipo() {
/* 254 */     return this.sottotipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSottotipo(String sottotipo) {
/* 263 */     this.sottotipo = sottotipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipo() {
/* 272 */     return this.tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipo(String tipo) {
/* 281 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 291 */     if (isCodesTableUpdateNeeded()) {
/* 292 */       return "DD";
/*     */     }
/* 294 */     return super.getStatoElaborazione();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnagraficaMAF.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */