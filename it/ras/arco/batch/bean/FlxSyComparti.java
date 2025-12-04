/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxSyComparti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoProd;
/*     */   private Integer codComparto;
/*     */   private String descComparto;
/*     */   private String descCompartoBrv;
/*     */   private Date dataRif;
/*     */   private Double valQuota;
/*     */   private String codVal;
/*     */   private Integer codSycav;
/*     */   private String descSycav;
/*     */   private String statoElabB;
/*     */   private String istanzaS;
/*     */   
/*     */   public FlxSyComparti(String tipoProd, Integer codComparto, String descComparto, String descCompartoBrv, Date dataRif, Double valQuota, String codVal, Integer codSycav, String descSycav, String statoElabB, String istanzaS) {
/*  52 */     this.tipoProd = tipoProd;
/*  53 */     this.codComparto = codComparto;
/*  54 */     this.descComparto = descComparto;
/*  55 */     this.descCompartoBrv = descCompartoBrv;
/*  56 */     this.dataRif = dataRif;
/*  57 */     this.valQuota = valQuota;
/*  58 */     this.codVal = codVal;
/*  59 */     this.codSycav = codSycav;
/*  60 */     this.descSycav = descSycav;
/*  61 */     this.statoElabB = statoElabB;
/*  62 */     this.istanzaS = istanzaS;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSyComparti() {}
/*     */   
/*     */   public Integer getFlxId() {
/*  69 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  73 */     this.flxId = flxId;
/*     */   }
/*     */   public String getTipoProd() {
/*  76 */     return this.tipoProd;
/*     */   }
/*     */   
/*     */   public void setTipoProd(String tipoProd) {
/*  80 */     this.tipoProd = tipoProd;
/*     */   }
/*     */   
/*     */   public Integer getCodComparto() {
/*  84 */     return this.codComparto;
/*     */   }
/*     */   
/*     */   public void setCodComparto(Integer codComparto) {
/*  88 */     this.codComparto = codComparto;
/*     */   }
/*     */   
/*     */   public String getDescComparto() {
/*  92 */     return this.descComparto;
/*     */   }
/*     */   
/*     */   public void setDescComparto(String descComparto) {
/*  96 */     this.descComparto = descComparto;
/*     */   }
/*     */   
/*     */   public String getDescCompartoBrv() {
/* 100 */     return this.descCompartoBrv;
/*     */   }
/*     */   
/*     */   public void setDescCompartoBrv(String descCompartoBrv) {
/* 104 */     this.descCompartoBrv = descCompartoBrv;
/*     */   }
/*     */   
/*     */   public Date getDataRif() {
/* 108 */     return this.dataRif;
/*     */   }
/*     */   
/*     */   public void setDataRif(Date dataRif) {
/* 112 */     this.dataRif = dataRif;
/*     */   }
/*     */   
/*     */   public Double getValQuota() {
/* 116 */     return this.valQuota;
/*     */   }
/*     */   
/*     */   public void setValQuota(Double valQuota) {
/* 120 */     this.valQuota = valQuota;
/*     */   }
/*     */   
/*     */   public String getCodVal() {
/* 124 */     return this.codVal;
/*     */   }
/*     */   
/*     */   public void setCodVal(String codVal) {
/* 128 */     this.codVal = codVal;
/*     */   }
/*     */   
/*     */   public Integer getCodSycav() {
/* 132 */     return this.codSycav;
/*     */   }
/*     */   
/*     */   public void setCodSycav(Integer codSycav) {
/* 136 */     this.codSycav = codSycav;
/*     */   }
/*     */   
/*     */   public String getDescSycav() {
/* 140 */     return this.descSycav;
/*     */   }
/*     */   
/*     */   public void setDescSycav(String descSycav) {
/* 144 */     this.descSycav = descSycav;
/*     */   }
/*     */   
/*     */   public String getStatoElabB() {
/* 148 */     return this.statoElabB;
/*     */   }
/*     */   
/*     */   public void setStatoElabB(String statoElabB) {
/* 152 */     this.statoElabB = statoElabB;
/*     */   }
/*     */   public String getIstanzaS() {
/* 155 */     return this.istanzaS;
/*     */   }
/*     */   
/*     */   public void setIstanzaS(String istanzaS) {
/* 159 */     this.istanzaS = istanzaS;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 163 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSyComparti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */