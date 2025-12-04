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
/*     */ public class FinExtIndiciRam
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer extIndiciFondiRam;
/*     */   private String codGestione;
/*     */   private String statoElaboraz;
/*     */   private Date dValQuot;
/*     */   private Double valQuotEuro;
/*     */   private Double valQuotLire;
/*     */   private Double valQuotValuta;
/*     */   private Double valStaccoCedol;
/*     */   private Date dPagamCedola;
/*     */   private Double navLordo;
/*     */   private Double impProgLordo;
/*     */   private Double impProgNetto;
/*     */   private Double commRete;
/*     */   private Double speseAmm;
/*     */   private Double quoteCircol;
/*     */   private String settCompeten;
/*     */   private String giorSett;
/*     */   private String nonUtiliz;
/*     */   private Date dataCorrStamp;
/*     */   private String classe;
/*     */   private String statoElabB;
/*     */   private String istanzaS;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinExtIndiciRam(Integer extIndiciFondiRamId, String codGestione, String statoElaboraz, Date dValQuot, Double valQuotEuro, Double valQuotLire, Double valQuotValuta, Double valStaccoCedol, Date dPagamCedola, Double navLordo, Double impProgLordo, Double impProgNetto, Double commRete, Double speseAmm, Double quoteCircol, String settCompeten, String giorSett, String nonUtiliz, Date dataCorrStamp, String classe, String statoElabB, String istanzaS, String userUltimaModifica, String proceduraUltimaModifica, Date dataUltimaModifica, Date dataInserimento, String utenteInserimento, String flagEsistenza, String tipoUltimaModifica) {
/*  89 */     this.codGestione = codGestione;
/*  90 */     this.statoElaboraz = statoElaboraz;
/*  91 */     this.dValQuot = dValQuot;
/*  92 */     this.valQuotEuro = valQuotEuro;
/*  93 */     this.valQuotLire = valQuotLire;
/*  94 */     this.valQuotValuta = valQuotValuta;
/*  95 */     this.valStaccoCedol = valStaccoCedol;
/*  96 */     this.dataUltimaModifica = dataUltimaModifica;
/*  97 */     this.dataInserimento = dataInserimento;
/*  98 */     this.utenteInserimento = utenteInserimento;
/*  99 */     this.flagEsistenza = flagEsistenza;
/* 100 */     this.tipoUltimaModifica = tipoUltimaModifica;
/* 101 */     this.dPagamCedola = dPagamCedola;
/* 102 */     this.navLordo = navLordo;
/* 103 */     this.impProgLordo = impProgLordo;
/* 104 */     this.impProgNetto = impProgNetto;
/* 105 */     this.commRete = commRete;
/* 106 */     this.speseAmm = speseAmm;
/* 107 */     this.quoteCircol = quoteCircol;
/* 108 */     this.settCompeten = settCompeten;
/* 109 */     this.giorSett = giorSett;
/* 110 */     this.nonUtiliz = nonUtiliz;
/* 111 */     this.dataCorrStamp = dataCorrStamp;
/* 112 */     this.classe = classe;
/* 113 */     this.statoElabB = statoElabB;
/* 114 */     this.istanzaS = istanzaS;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinExtIndiciRam() {}
/*     */ 
/*     */   
/*     */   public Integer getExtIndiciFondiRam() {
/* 122 */     return this.extIndiciFondiRam;
/*     */   }
/*     */   
/*     */   public void setExtIndiciFondiRam(Integer extIndiciFondiRam) {
/* 126 */     this.extIndiciFondiRam = extIndiciFondiRam;
/*     */   }
/*     */   
/*     */   public String getCodGestione() {
/* 130 */     return this.codGestione;
/*     */   }
/*     */   
/*     */   public void setCodGestione(String codGestione) {
/* 134 */     this.codGestione = codGestione;
/*     */   }
/*     */   
/*     */   public String getStatoElaboraz() {
/* 138 */     return this.statoElaboraz;
/*     */   }
/*     */   
/*     */   public void setStatoElaboraz(String statoElaboraz) {
/* 142 */     this.statoElaboraz = statoElaboraz;
/*     */   }
/*     */   
/*     */   public Date getDValQuot() {
/* 146 */     return this.dValQuot;
/*     */   }
/*     */   
/*     */   public void setDValQuot(Date dValQuot) {
/* 150 */     this.dValQuot = dValQuot;
/*     */   }
/*     */   
/*     */   public Double getValQuotEuro() {
/* 154 */     return this.valQuotEuro;
/*     */   }
/*     */   
/*     */   public void setValQuotEuro(Double valQuotEuro) {
/* 158 */     this.valQuotEuro = valQuotEuro;
/*     */   }
/*     */   
/*     */   public Double getValQuotLire() {
/* 162 */     return this.valQuotLire;
/*     */   }
/*     */   
/*     */   public void setValQuotLire(Double valQuotLire) {
/* 166 */     this.valQuotLire = valQuotLire;
/*     */   }
/*     */   
/*     */   public Double getValQuotValuta() {
/* 170 */     return this.valQuotValuta;
/*     */   }
/*     */   
/*     */   public void setValQuotValuta(Double valQuotValuta) {
/* 174 */     this.valQuotValuta = valQuotValuta;
/*     */   }
/*     */   
/*     */   public Double getValStaccoCedol() {
/* 178 */     return this.valStaccoCedol;
/*     */   }
/*     */   
/*     */   public void setValStaccoCedol(Double valStaccoCedol) {
/* 182 */     this.valStaccoCedol = valStaccoCedol;
/*     */   }
/*     */   
/*     */   public Date getDPagamCedola() {
/* 186 */     return this.dPagamCedola;
/*     */   }
/*     */   
/*     */   public void setDPagamCedola(Date dPagamCedola) {
/* 190 */     this.dPagamCedola = dPagamCedola;
/*     */   }
/*     */   
/*     */   public Double getNavLordo() {
/* 194 */     return this.navLordo;
/*     */   }
/*     */   
/*     */   public void setNavLordo(Double navLordo) {
/* 198 */     this.navLordo = navLordo;
/*     */   }
/*     */   
/*     */   public Double getImpProgLordo() {
/* 202 */     return this.impProgLordo;
/*     */   }
/*     */   
/*     */   public void setImpProgLordo(Double impProgLordo) {
/* 206 */     this.impProgLordo = impProgLordo;
/*     */   }
/*     */   
/*     */   public Double getImpProgNetto() {
/* 210 */     return this.impProgNetto;
/*     */   }
/*     */   
/*     */   public void setImpProgNetto(Double impProgNetto) {
/* 214 */     this.impProgNetto = impProgNetto;
/*     */   }
/*     */   
/*     */   public Double getCommRete() {
/* 218 */     return this.commRete;
/*     */   }
/*     */   
/*     */   public void setCommRete(Double commRete) {
/* 222 */     this.commRete = commRete;
/*     */   }
/*     */   
/*     */   public Double getSpeseAmm() {
/* 226 */     return this.speseAmm;
/*     */   }
/*     */   
/*     */   public void setSpeseAmm(Double speseAmm) {
/* 230 */     this.speseAmm = speseAmm;
/*     */   }
/*     */   
/*     */   public Double getQuoteCircol() {
/* 234 */     return this.quoteCircol;
/*     */   }
/*     */   
/*     */   public void setQuoteCircol(Double quoteCircol) {
/* 238 */     this.quoteCircol = quoteCircol;
/*     */   }
/*     */   
/*     */   public String getSettCompeten() {
/* 242 */     return this.settCompeten;
/*     */   }
/*     */   
/*     */   public void setSettCompeten(String settCompeten) {
/* 246 */     this.settCompeten = settCompeten;
/*     */   }
/*     */   
/*     */   public String getGiorSett() {
/* 250 */     return this.giorSett;
/*     */   }
/*     */   
/*     */   public void setGiorSett(String giorSett) {
/* 254 */     this.giorSett = giorSett;
/*     */   }
/*     */   
/*     */   public String getNonUtiliz() {
/* 258 */     return this.nonUtiliz;
/*     */   }
/*     */   
/*     */   public void setNonUtiliz(String nonUtiliz) {
/* 262 */     this.nonUtiliz = nonUtiliz;
/*     */   }
/*     */   
/*     */   public Date getDataCorrStamp() {
/* 266 */     return this.dataCorrStamp;
/*     */   }
/*     */   
/*     */   public void setDataCorrStamp(Date dataCorrStamp) {
/* 270 */     this.dataCorrStamp = dataCorrStamp;
/*     */   }
/*     */   
/*     */   public String getClasse() {
/* 274 */     return this.classe;
/*     */   }
/*     */   
/*     */   public void setClasse(String classe) {
/* 278 */     this.classe = classe;
/*     */   }
/*     */   
/*     */   public String getStatoElabB() {
/* 282 */     return this.statoElabB;
/*     */   }
/*     */   
/*     */   public void setStatoElabB(String statoElabB) {
/* 286 */     this.statoElabB = statoElabB;
/*     */   }
/*     */   
/*     */   public String getIstanzaS() {
/* 290 */     return this.istanzaS;
/*     */   }
/*     */   
/*     */   public void setIstanzaS(String istanzaS) {
/* 294 */     this.istanzaS = istanzaS;
/*     */   }
/*     */   public Date getDataInserimento() {
/* 297 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 301 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 305 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 309 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 313 */     return (new ToStringBuilder(this)).append("extIndiciFondiRam", getExtIndiciFondiRam()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinExtIndiciRam.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */