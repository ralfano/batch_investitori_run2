/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinValuteUic
/*     */ {
/*     */   private String valutaId;
/*     */   private String flagEsistenza;
/*     */   private String gstdUserCli;
/*     */   private String gstdUserOpe;
/*     */   private String gstdProc;
/*     */   private String gstdTipomod;
/*     */   private String codiceIso;
/*     */   private Date gstdUltmod;
/*     */   private String descrizione;
/*     */   private String codiceUic;
/*     */   
/*     */   public FinValuteUic() {}
/*     */   
/*     */   public String getCodiceIso() {
/*  24 */     return this.codiceIso;
/*     */   }
/*     */   
/*     */   public void setCodiceIso(String codiceIso) {
/*  28 */     this.codiceIso = codiceIso;
/*     */   }
/*     */   
/*     */   public String getCodiceUic() {
/*  32 */     return this.codiceUic;
/*     */   }
/*     */   
/*     */   public void setCodiceUic(String codiceUic) {
/*  36 */     this.codiceUic = codiceUic;
/*     */   }
/*     */   
/*     */   public String getDescrizione() {
/*  40 */     return this.descrizione;
/*     */   }
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/*  44 */     this.descrizione = descrizione;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/*  48 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  52 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getGstdProc() {
/*  56 */     return this.gstdProc;
/*     */   }
/*     */   
/*     */   public void setGstdProc(String gstdProc) {
/*  60 */     this.gstdProc = gstdProc;
/*     */   }
/*     */   
/*     */   public String getGstdTipomod() {
/*  64 */     return this.gstdTipomod;
/*     */   }
/*     */   
/*     */   public void setGstdTipomod(String gstdTipomod) {
/*  68 */     this.gstdTipomod = gstdTipomod;
/*     */   }
/*     */   
/*     */   public Date getGstdUltmod() {
/*  72 */     return this.gstdUltmod;
/*     */   }
/*     */   
/*     */   public void setGstdUltmod(Date gstdUltmod) {
/*  76 */     this.gstdUltmod = gstdUltmod;
/*     */   }
/*     */   
/*     */   public String getGstdUserCli() {
/*  80 */     return this.gstdUserCli;
/*     */   }
/*     */   
/*     */   public void setGstdUserCli(String gstdUserCli) {
/*  84 */     this.gstdUserCli = gstdUserCli;
/*     */   }
/*     */   
/*     */   public String getGstdUserOpe() {
/*  88 */     return this.gstdUserOpe;
/*     */   }
/*     */   
/*     */   public void setGstdUserOpe(String gstdUserOpe) {
/*  92 */     this.gstdUserOpe = gstdUserOpe;
/*     */   }
/*     */   
/*     */   public String getValutaId() {
/*  96 */     return this.valutaId;
/*     */   }
/*     */   
/*     */   public void setValutaId(String valutaId) {
/* 100 */     this.valutaId = valutaId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinValuteUic(String iso, String uic, String descrizione, String esistenza, String proc, String tipomod, Date ultmod, String cli, String ope, String id) {
/* 106 */     this.codiceIso = iso;
/* 107 */     this.codiceUic = uic;
/* 108 */     this.descrizione = descrizione;
/* 109 */     this.flagEsistenza = esistenza;
/* 110 */     this.gstdProc = proc;
/* 111 */     this.gstdTipomod = tipomod;
/* 112 */     this.gstdUltmod = ultmod;
/* 113 */     this.gstdUserCli = cli;
/* 114 */     this.gstdUserOpe = ope;
/* 115 */     this.valutaId = id;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinValuteUic.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */