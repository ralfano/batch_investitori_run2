/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxSoggFascia
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Date dataRife;
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
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public String getCausAsse() {
/*  43 */     return this.causAsse;
/*     */   }
/*     */   public void setCausAsse(String causAsse) {
/*  46 */     this.causAsse = causAsse;
/*     */   }
/*     */   public Integer getCodCliePorfCcor() {
/*  49 */     return this.codCliePorfCcor;
/*     */   }
/*     */   public void setCodCliePorfCcor(Integer codCliePorfCcor) {
/*  52 */     this.codCliePorfCcor = codCliePorfCcor;
/*     */   }
/*     */   public Integer getCodSogg() {
/*  55 */     return this.codSogg;
/*     */   }
/*     */   public void setCodSogg(Integer codSogg) {
/*  58 */     this.codSogg = codSogg;
/*     */   }
/*     */   public String getCodUltiUser() {
/*  61 */     return this.codUltiUser;
/*     */   }
/*     */   public void setCodUltiUser(String codUltiUser) {
/*  64 */     this.codUltiUser = codUltiUser;
/*     */   }
/*     */   public Date getDataAsse() {
/*  67 */     return this.dataAsse;
/*     */   }
/*     */   public void setDataAsse(Date dataAsse) {
/*  70 */     this.dataAsse = dataAsse;
/*     */   }
/*     */   public Date getDataIncoe() {
/*  73 */     return this.dataIncoe;
/*     */   }
/*     */   public void setDataIncoe(Date dataIncoe) {
/*  76 */     this.dataIncoe = dataIncoe;
/*     */   }
/*     */   public Date getDataRife() {
/*  79 */     return this.dataRife;
/*     */   }
/*     */   public void setDataRife(Date dataRife) {
/*  82 */     this.dataRife = dataRife;
/*     */   }
/*     */   public Date getDataSec() {
/*  85 */     return this.dataSec;
/*     */   }
/*     */   public void setDataSec(Date dataSec) {
/*  88 */     this.dataSec = dataSec;
/*     */   }
/*     */   public Date getDataUpDown() {
/*  91 */     return this.dataUpDown;
/*     */   }
/*     */   public void setDataUpDown(Date dataUpDown) {
/*  94 */     this.dataUpDown = dataUpDown;
/*     */   }
/*     */   public Date getDatInse() {
/*  97 */     return this.datInse;
/*     */   }
/*     */   public void setDatInse(Date datInse) {
/* 100 */     this.datInse = datInse;
/*     */   }
/*     */   public Date getDatVarz() {
/* 103 */     return this.datVarz;
/*     */   }
/*     */   public void setDatVarz(Date datVarz) {
/* 106 */     this.datVarz = datVarz;
/*     */   }
/*     */   public String getFascAsse() {
/* 109 */     return this.fascAsse;
/*     */   }
/*     */   public void setFascAsse(String fascAsse) {
/* 112 */     this.fascAsse = fascAsse;
/*     */   }
/*     */   public String getFascCalc() {
/* 115 */     return this.fascCalc;
/*     */   }
/*     */   public void setFascCalc(String fascCalc) {
/* 118 */     this.fascCalc = fascCalc;
/*     */   }
/*     */   public String getFascEred() {
/* 121 */     return this.fascEred;
/*     */   }
/*     */   public void setFascEred(String fascEred) {
/* 124 */     this.fascEred = fascEred;
/*     */   }
/*     */   public String getFascSec() {
/* 127 */     return this.fascSec;
/*     */   }
/*     */   public void setFascSec(String fascSec) {
/* 130 */     this.fascSec = fascSec;
/*     */   }
/*     */   public String getFlgConsPriv() {
/* 133 */     return this.flgConsPriv;
/*     */   }
/*     */   public void setFlgConsPriv(String flgConsPriv) {
/* 136 */     this.flgConsPriv = flgConsPriv;
/*     */   }
/*     */   public String getFlgUpDown() {
/* 139 */     return this.flgUpDown;
/*     */   }
/*     */   public void setFlgUpDown(String flgUpDown) {
/* 142 */     this.flgUpDown = flgUpDown;
/*     */   }
/*     */   public String getFlgVali() {
/* 145 */     return this.flgVali;
/*     */   }
/*     */   public void setFlgVali(String flgVali) {
/* 148 */     this.flgVali = flgVali;
/*     */   }
/*     */   public Integer getFlxId() {
/* 151 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 154 */     this.flxId = flxId;
/*     */   }
/*     */   public String getIstanza() {
/* 157 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 160 */     this.istanza = istanza;
/*     */   }
/*     */   public Double getNavPrimLiv() {
/* 163 */     return this.navPrimLiv;
/*     */   }
/*     */   public void setNavPrimLiv(Double navPrimLiv) {
/* 166 */     this.navPrimLiv = navPrimLiv;
/*     */   }
/*     */   public Double getNavSecoLiv() {
/* 169 */     return this.navSecoLiv;
/*     */   }
/*     */   public void setNavSecoLiv(Double navSecoLiv) {
/* 172 */     this.navSecoLiv = navSecoLiv;
/*     */   }
/*     */   public Integer getNumContCorr() {
/* 175 */     return this.numContCorr;
/*     */   }
/*     */   public void setNumContCorr(Integer numContCorr) {
/* 178 */     this.numContCorr = numContCorr;
/*     */   }
/*     */   public Integer getNumIncoe() {
/* 181 */     return this.numIncoe;
/*     */   }
/*     */   public void setNumIncoe(Integer numIncoe) {
/* 184 */     this.numIncoe = numIncoe;
/*     */   }
/*     */   public String getStatoElab() {
/* 187 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 190 */     this.statoElab = statoElab;
/*     */   }
/*     */   public Date getTmpUltiVarz() {
/* 193 */     return this.tmpUltiVarz;
/*     */   }
/*     */   public void setTmpUltiVarz(Date tmpUltiVarz) {
/* 196 */     this.tmpUltiVarz = tmpUltiVarz;
/*     */   }
/*     */   public Date getDataErrore() {
/* 199 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 202 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 205 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 208 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSoggFascia.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */