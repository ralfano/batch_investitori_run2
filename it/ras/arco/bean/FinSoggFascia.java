/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
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
/*     */ public class FinSoggFascia
/*     */   extends RasORMBean
/*     */ {
/*     */   public static final String ATTIVO = "S";
/*     */   public static final String INATTIVO = "N";
/*     */   private Integer soggettoId;
/*     */   private Integer soggFasciaId;
/*     */   private Integer codSogg;
/*     */   private Double navPrimLiv;
/*     */   private Double navSecoLiv;
/*     */   private String fascCalc;
/*     */   private String fascEred;
/*     */   private String fascSec;
/*     */   private Date dataSec;
/*     */   private String fascAsse;
/*     */   private String causAsse;
/*     */   private Date dataAsse;
/*     */   private Integer numContCorr;
/*     */   private Integer numIncoe;
/*     */   private Date dataIncoe;
/*     */   private String flgUpDown;
/*     */   private Date dataUpDown;
/*     */   private String flgConsPriv;
/*     */   private Integer codCliePorfCcor;
/*     */   private Date datInse;
/*     */   private Date datVarz;
/*     */   private String codUltiUser;
/*     */   private Date tmpUltiVarz;
/*     */   private String flgVali;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String flagAttivo;
/*     */   private FinSoggetto soggetto;
/*     */   
/*     */   public String getCausAsse() {
/*  51 */     return this.causAsse;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCausAsse(String causAsse) {
/*  56 */     this.causAsse = causAsse;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getCodCliePorfCcor() {
/*  61 */     return this.codCliePorfCcor;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodCliePorfCcor(Integer codCliePorfCcor) {
/*  66 */     this.codCliePorfCcor = codCliePorfCcor;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getCodSogg() {
/*  71 */     return this.codSogg;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodSogg(Integer codSogg) {
/*  76 */     this.codSogg = codSogg;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodUltiUser() {
/*  81 */     return this.codUltiUser;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodUltiUser(String codUltiUser) {
/*  86 */     this.codUltiUser = codUltiUser;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataAsse() {
/*  91 */     return this.dataAsse;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataAsse(Date dataAsse) {
/*  96 */     this.dataAsse = dataAsse;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/* 101 */     return this.dataFine;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 106 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataIncoe() {
/* 111 */     return this.dataIncoe;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataIncoe(Date dataIncoe) {
/* 116 */     this.dataIncoe = dataIncoe;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/* 121 */     return this.dataInizio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 126 */     this.dataInizio = dataInizio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 131 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 136 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataSec() {
/* 141 */     return this.dataSec;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataSec(Date dataSec) {
/* 146 */     this.dataSec = dataSec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUpDown() {
/* 153 */     return this.dataUpDown;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataUpDown(Date dataUpDown) {
/* 158 */     this.dataUpDown = dataUpDown;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDatInse() {
/* 163 */     return this.datInse;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDatInse(Date datInse) {
/* 168 */     this.datInse = datInse;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDatVarz() {
/* 173 */     return this.datVarz;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDatVarz(Date datVarz) {
/* 178 */     this.datVarz = datVarz;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFascAsse() {
/* 183 */     return this.fascAsse;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFascAsse(String fascAsse) {
/* 188 */     this.fascAsse = fascAsse;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFascCalc() {
/* 193 */     return this.fascCalc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFascCalc(String fascCalc) {
/* 198 */     this.fascCalc = fascCalc;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFascEred() {
/* 203 */     return this.fascEred;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFascEred(String fascEred) {
/* 208 */     this.fascEred = fascEred;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFascSec() {
/* 213 */     return this.fascSec;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFascSec(String fascSec) {
/* 218 */     this.fascSec = fascSec;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlagAttivo() {
/* 223 */     return this.flagAttivo;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlagAttivo(String flagAttivo) {
/* 228 */     this.flagAttivo = flagAttivo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlgConsPriv() {
/* 235 */     return this.flgConsPriv;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlgConsPriv(String flgConsPriv) {
/* 240 */     this.flgConsPriv = flgConsPriv;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlgUpDown() {
/* 245 */     return this.flgUpDown;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlgUpDown(String flgUpDown) {
/* 250 */     this.flgUpDown = flgUpDown;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlgVali() {
/* 255 */     return this.flgVali;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlgVali(String flgVali) {
/* 260 */     this.flgVali = flgVali;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getNavPrimLiv() {
/* 265 */     return this.navPrimLiv;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNavPrimLiv(Double navPrimLiv) {
/* 270 */     this.navPrimLiv = navPrimLiv;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getNavSecoLiv() {
/* 275 */     return this.navSecoLiv;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNavSecoLiv(Double navSecoLiv) {
/* 280 */     this.navSecoLiv = navSecoLiv;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumContCorr() {
/* 285 */     return this.numContCorr;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumContCorr(Integer numContCorr) {
/* 290 */     this.numContCorr = numContCorr;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumIncoe() {
/* 295 */     return this.numIncoe;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumIncoe(Integer numIncoe) {
/* 300 */     this.numIncoe = numIncoe;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 306 */     return this.soggetto;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 311 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getSoggFasciaId() {
/* 316 */     return this.soggFasciaId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggFasciaId(Integer soggFasciaId) {
/* 321 */     this.soggFasciaId = soggFasciaId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getTmpUltiVarz() {
/* 328 */     return this.tmpUltiVarz;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTmpUltiVarz(Date tmpUltiVarz) {
/* 333 */     this.tmpUltiVarz = tmpUltiVarz;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 339 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 344 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getSoggettoId() {
/* 349 */     return this.soggettoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 354 */     this.soggettoId = soggettoId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggFascia.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */