/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxBnlGesCertificati04
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer tipoRecord04;
/*     */   private Integer numAccordo04;
/*     */   private String codiceProdotto04;
/*     */   private Integer numCertifBnl04;
/*     */   private Integer numCertifSgr04;
/*     */   private Date dataEmissione04;
/*     */   private Date dataDistruzio04;
/*     */   private String tipoCertificato04;
/*     */   private String codLuogoinv04;
/*     */   private Date dataRichiesta04;
/*     */   private String codAbi04;
/*     */   private String codCab04;
/*     */   private Double numerQuote04;
/*     */   private String segnoImp04;
/*     */   private Integer codMovimen04;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public String getCodAbi04() {
/*  45 */     return this.codAbi04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodAbi04(String codAbi04) {
/*  50 */     this.codAbi04 = codAbi04;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodCab04() {
/*  55 */     return this.codCab04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodCab04(String codCab04) {
/*  60 */     this.codCab04 = codCab04;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodiceProdotto04() {
/*  65 */     return this.codiceProdotto04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodiceProdotto04(String codiceProdotto04) {
/*  70 */     this.codiceProdotto04 = codiceProdotto04;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCodLuogoinv04() {
/*  75 */     return this.codLuogoinv04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodLuogoinv04(String codLuogoinv04) {
/*  80 */     this.codLuogoinv04 = codLuogoinv04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getCodMovimen04() {
/*  85 */     return this.codMovimen04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCodMovimen04(Integer codMovimen04) {
/*  90 */     this.codMovimen04 = codMovimen04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/*  95 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 100 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataDistruzio04() {
/* 105 */     return this.dataDistruzio04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataDistruzio04(Date dataDistruzio04) {
/* 110 */     this.dataDistruzio04 = dataDistruzio04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataEmissione04() {
/* 115 */     return this.dataEmissione04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataEmissione04(Date dataEmissione04) {
/* 120 */     this.dataEmissione04 = dataEmissione04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataErrore() {
/* 125 */     return this.dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/* 130 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataRichiesta04() {
/* 135 */     return this.dataRichiesta04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataRichiesta04(Date dataRichiesta04) {
/* 140 */     this.dataRichiesta04 = dataRichiesta04;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 145 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 150 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 155 */     return this.flxId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 160 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 165 */     return this.istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 170 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumAccordo04() {
/* 175 */     return this.numAccordo04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumAccordo04(Integer numAccordo04) {
/* 180 */     this.numAccordo04 = numAccordo04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumCertifBnl04() {
/* 185 */     return this.numCertifBnl04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumCertifBnl04(Integer numCertifBnl04) {
/* 190 */     this.numCertifBnl04 = numCertifBnl04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumCertifSgr04() {
/* 195 */     return this.numCertifSgr04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumCertifSgr04(Integer numCertifSgr04) {
/* 200 */     this.numCertifSgr04 = numCertifSgr04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getNumerQuote04() {
/* 205 */     return this.numerQuote04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumerQuote04(Double numerQuote04) {
/* 210 */     this.numerQuote04 = numerQuote04;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getSegnoImp04() {
/* 215 */     return this.segnoImp04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSegnoImp04(String segnoImp04) {
/* 220 */     this.segnoImp04 = segnoImp04;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 225 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 230 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTipoCertificato04() {
/* 235 */     return this.tipoCertificato04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoCertificato04(String tipoCertificato04) {
/* 240 */     this.tipoCertificato04 = tipoCertificato04;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getTipoRecord04() {
/* 245 */     return this.tipoRecord04;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTipoRecord04(Integer tipoRecord04) {
/* 250 */     this.tipoRecord04 = tipoRecord04;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxBnlGesCertificati04.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */