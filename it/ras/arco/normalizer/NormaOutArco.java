/*     */ package it.ras.arco.normalizer;
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
/*     */ public class NormaOutArco
/*     */ {
/*  15 */   private String outMcCap = null;
/*  16 */   private String outMcDenominazione = null;
/*  17 */   private String outMcNome = null;
/*  18 */   private String outMcCognome = null;
/*  19 */   private String outMcViaab = null;
/*  20 */   private String outMcViauf = null;
/*  21 */   private String outMcTinatg = null;
/*  22 */   private int outMcSesso = 0;
/*  23 */   private String outMcStato = null;
/*  24 */   private String outMcProv = null;
/*  25 */   private String outMcComuuf = null;
/*  26 */   private String outMcComuab = null;
/*  27 */   private String outMcFrazuf = null;
/*  28 */   private String outMcFrazab = null;
/*  29 */   private String outMcLocpuf = null;
/*  30 */   private String outMcLocpab = null;
/*  31 */   private int mcErroreNome = 0;
/*  32 */   private String mcDeroreNome = null;
/*  33 */   private int mcErroreLoca = 0;
/*  34 */   private String mcDeroreLoca = null;
/*  35 */   private int mcErroreVia = 0;
/*  36 */   private String mcDeroreVia = null;
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized String getMcDeroreLoca() {
/*  41 */     return this.mcDeroreLoca;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setMcDeroreLoca(String mcDeroreLoca) {
/*  46 */     this.mcDeroreLoca = mcDeroreLoca;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getMcDeroreNome() {
/*  51 */     return this.mcDeroreNome;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setMcDeroreNome(String mcDeroreNome) {
/*  56 */     this.mcDeroreNome = mcDeroreNome;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getMcDeroreVia() {
/*  61 */     return this.mcDeroreVia;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setMcDeroreVia(String mcDeroreVia) {
/*  66 */     this.mcDeroreVia = mcDeroreVia;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized int getMcErroreLoca() {
/*  71 */     return this.mcErroreLoca;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setMcErroreLoca(int mcErroreLoca) {
/*  76 */     this.mcErroreLoca = mcErroreLoca;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized int getMcErroreNome() {
/*  81 */     return this.mcErroreNome;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setMcErroreNome(int mcErroreNome) {
/*  86 */     this.mcErroreNome = mcErroreNome;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized int getMcErroreVia() {
/*  91 */     return this.mcErroreVia;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setMcErroreVia(int mcErroreVia) {
/*  96 */     this.mcErroreVia = mcErroreVia;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcCap(String outMcCap) {
/* 101 */     this.outMcCap = outMcCap;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcCap() {
/* 106 */     return this.outMcCap;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcNome() {
/* 111 */     return this.outMcNome;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcNome(String outMcNome) {
/* 116 */     this.outMcNome = outMcNome;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcCognome(String outMcCognome) {
/* 121 */     this.outMcCognome = outMcCognome;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcCognome() {
/* 126 */     return this.outMcCognome;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcDenominazione() {
/* 133 */     return this.outMcDenominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcDenominazione(String outMcDenominazione) {
/* 138 */     this.outMcDenominazione = outMcDenominazione;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcViauf() {
/* 143 */     return this.outMcViauf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcViaab() {
/* 148 */     return this.outMcViaab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOutMcViaab(String outMcViaab) {
/* 153 */     this.outMcViaab = outMcViaab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOutMcViauf(String outMcViauf) {
/* 158 */     this.outMcViauf = outMcViauf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcComuab() {
/* 163 */     return this.outMcComuab;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcComuab(String outMcComuab) {
/* 168 */     this.outMcComuab = outMcComuab;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcComuuf() {
/* 173 */     return this.outMcComuuf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcComuuf(String outMcComuuf) {
/* 178 */     this.outMcComuuf = outMcComuuf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcFrazab() {
/* 183 */     return this.outMcFrazab;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcFrazab(String outMcFrazab) {
/* 188 */     this.outMcFrazab = outMcFrazab;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcFrazuf() {
/* 193 */     return this.outMcFrazuf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcFrazuf(String outMcFrazuf) {
/* 198 */     this.outMcFrazuf = outMcFrazuf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcLocpab() {
/* 203 */     return this.outMcLocpab;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcLocpab(String outMcLocpab) {
/* 208 */     this.outMcLocpab = outMcLocpab;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcLocpuf() {
/* 213 */     return this.outMcLocpuf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcLocpuf(String outMcLocpuf) {
/* 218 */     this.outMcLocpuf = outMcLocpuf;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcProv() {
/* 223 */     return this.outMcProv;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcProv(String outMcProv) {
/* 228 */     this.outMcProv = outMcProv;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized int getOutMcSesso() {
/* 233 */     return this.outMcSesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcSesso(int outMcSesso) {
/* 238 */     this.outMcSesso = outMcSesso;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcStato() {
/* 243 */     return this.outMcStato;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcStato(String outMcStato) {
/* 248 */     this.outMcStato = outMcStato;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized String getOutMcTinatg() {
/* 253 */     return this.outMcTinatg;
/*     */   }
/*     */ 
/*     */   
/*     */   public synchronized void setOutMcTinatg(String outMcTinatg) {
/* 258 */     this.outMcTinatg = outMcTinatg;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\normalizer\NormaOutArco.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */