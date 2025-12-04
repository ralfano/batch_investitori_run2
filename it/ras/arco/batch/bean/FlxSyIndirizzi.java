/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxSyIndirizzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoEvento;
/*     */   private String codPromotore;
/*     */   private String codRete;
/*     */   private Integer codCompagn;
/*     */   private Integer tipoProd;
/*     */   private Integer codSottoscr;
/*     */   private Integer codComparto;
/*     */   private String indPostale;
/*     */   private String locIndPostale;
/*     */   private String provIndPostale;
/*     */   private Integer cap;
/*     */   private String nazIndPostale;
/*     */   private String statoElabB;
/*     */   private String istanzaS;
/*     */   
/*     */   public FlxSyIndirizzi(Integer flxId, String tipoEvento, String codPromotore, String codRete, Integer codCompagn, Integer tipoProd, Integer codSottoscr, Integer codComparto, String indPostale, String locIndPostale, String provIndPostale, Integer cap, String nazIndPostale, String statoElabB, String istanzaS) {
/*  67 */     this.flxId = flxId;
/*  68 */     this.tipoEvento = tipoEvento;
/*  69 */     this.codPromotore = codPromotore;
/*  70 */     this.codRete = codRete;
/*  71 */     this.codCompagn = codCompagn;
/*  72 */     this.tipoProd = tipoProd;
/*  73 */     this.codSottoscr = codSottoscr;
/*  74 */     this.codComparto = codComparto;
/*  75 */     this.indPostale = indPostale;
/*  76 */     this.locIndPostale = locIndPostale;
/*  77 */     this.provIndPostale = provIndPostale;
/*  78 */     this.cap = cap;
/*  79 */     this.nazIndPostale = nazIndPostale;
/*  80 */     this.statoElabB = statoElabB;
/*  81 */     this.istanzaS = istanzaS;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSyIndirizzi() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  90 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  94 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getTipoEvento() {
/*  98 */     return this.tipoEvento;
/*     */   }
/*     */   
/*     */   public void setTipoEvento(String tipoEvento) {
/* 102 */     this.tipoEvento = tipoEvento;
/*     */   }
/*     */   
/*     */   public String getCodPromotore() {
/* 106 */     return this.codPromotore;
/*     */   }
/*     */   
/*     */   public void setCodPromotore(String codPromotore) {
/* 110 */     this.codPromotore = codPromotore;
/*     */   }
/*     */   
/*     */   public String getCodRete() {
/* 114 */     return this.codRete;
/*     */   }
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 118 */     this.codRete = codRete;
/*     */   }
/*     */   
/*     */   public Integer getCodCompagn() {
/* 122 */     return this.codCompagn;
/*     */   }
/*     */   
/*     */   public void setCodCompagn(Integer codCompagn) {
/* 126 */     this.codCompagn = codCompagn;
/*     */   }
/*     */   
/*     */   public Integer getTipoProd() {
/* 130 */     return this.tipoProd;
/*     */   }
/*     */   
/*     */   public void setTipoProd(Integer tipoProd) {
/* 134 */     this.tipoProd = tipoProd;
/*     */   }
/*     */   
/*     */   public Integer getCodSottoscr() {
/* 138 */     return this.codSottoscr;
/*     */   }
/*     */   
/*     */   public void setCodSottoscr(Integer codSottoscr) {
/* 142 */     this.codSottoscr = codSottoscr;
/*     */   }
/*     */   
/*     */   public Integer getCodComparto() {
/* 146 */     return this.codComparto;
/*     */   }
/*     */   
/*     */   public void setCodComparto(Integer codComparto) {
/* 150 */     this.codComparto = codComparto;
/*     */   }
/*     */   
/*     */   public String getIndPostale() {
/* 154 */     return this.indPostale;
/*     */   }
/*     */   
/*     */   public void setIndPostale(String indPostale) {
/* 158 */     this.indPostale = indPostale;
/*     */   }
/*     */   
/*     */   public String getLocIndPostale() {
/* 162 */     return this.locIndPostale;
/*     */   }
/*     */   
/*     */   public void setLocIndPostale(String locIndPostale) {
/* 166 */     this.locIndPostale = locIndPostale;
/*     */   }
/*     */   
/*     */   public String getProvIndPostale() {
/* 170 */     return this.provIndPostale;
/*     */   }
/*     */   
/*     */   public void setProvIndPostale(String provIndPostale) {
/* 174 */     this.provIndPostale = provIndPostale;
/*     */   }
/*     */   
/*     */   public Integer getCap() {
/* 178 */     return this.cap;
/*     */   }
/*     */   
/*     */   public void setCap(Integer cap) {
/* 182 */     this.cap = cap;
/*     */   }
/*     */   
/*     */   public String getNazIndPostale() {
/* 186 */     return this.nazIndPostale;
/*     */   }
/*     */   
/*     */   public void setNazIndPostale(String nazIndPostale) {
/* 190 */     this.nazIndPostale = nazIndPostale;
/*     */   }
/*     */   
/*     */   public String getStatoElabB() {
/* 194 */     return this.statoElabB;
/*     */   }
/*     */   
/*     */   public void setStatoElabB(String statoElabB) {
/* 198 */     this.statoElabB = statoElabB;
/*     */   }
/*     */   
/*     */   public String getIstanzaS() {
/* 202 */     return this.istanzaS;
/*     */   }
/*     */   
/*     */   public void setIstanzaS(String istanzaS) {
/* 206 */     this.istanzaS = istanzaS;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSyIndirizzi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */