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
/*     */ public class FlxSyMigIndirizzi
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer tipoProdotto;
/*     */   private String codiceClienteSec;
/*     */   private String csott;
/*     */   private String numeroContrattoSec;
/*     */   private Integer codiceProdottoSec;
/*     */   private Integer codiceCompartoSec;
/*     */   private String indirizzoPostale;
/*     */   private String localitaIndirizzoPostale;
/*     */   private String provinciaIndirizzoPostale;
/*     */   private Integer cap;
/*     */   private String nazioneIndirizzoPostale;
/*     */   private String rapporto;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public Integer getCap() {
/*  40 */     return this.cap;
/*     */   }
/*     */   public void setCap(Integer cap) {
/*  43 */     this.cap = cap;
/*     */   }
/*     */   public String getCodiceClienteSec() {
/*  46 */     return this.codiceClienteSec;
/*     */   }
/*     */   public void setCodiceClienteSec(String codiceClienteSec) {
/*  49 */     this.codiceClienteSec = codiceClienteSec;
/*     */   }
/*     */   public Integer getCodiceCompartoSec() {
/*  52 */     return this.codiceCompartoSec;
/*     */   }
/*     */   public void setCodiceCompartoSec(Integer codiceCompartoSec) {
/*  55 */     this.codiceCompartoSec = codiceCompartoSec;
/*     */   }
/*     */   public Integer getCodiceProdottoSec() {
/*  58 */     return this.codiceProdottoSec;
/*     */   }
/*     */   public void setCodiceProdottoSec(Integer codiceProdottoSec) {
/*  61 */     this.codiceProdottoSec = codiceProdottoSec;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/*  65 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/*  68 */     this.flxId = flxId;
/*     */   }
/*     */   public String getIndirizzoPostale() {
/*  71 */     return this.indirizzoPostale;
/*     */   }
/*     */   public void setIndirizzoPostale(String indirizzoPostale) {
/*  74 */     this.indirizzoPostale = indirizzoPostale;
/*     */   }
/*     */   public String getIstanza() {
/*  77 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/*  80 */     this.istanza = istanza;
/*     */   }
/*     */   public String getLocalitaIndirizzoPostale() {
/*  83 */     return this.localitaIndirizzoPostale;
/*     */   }
/*     */   public void setLocalitaIndirizzoPostale(String localitaIndirizzoPostale) {
/*  86 */     this.localitaIndirizzoPostale = localitaIndirizzoPostale;
/*     */   }
/*     */   public String getNazioneIndirizzoPostale() {
/*  89 */     return this.nazioneIndirizzoPostale;
/*     */   }
/*     */   public void setNazioneIndirizzoPostale(String nazioneIndirizzoPostale) {
/*  92 */     this.nazioneIndirizzoPostale = nazioneIndirizzoPostale;
/*     */   }
/*     */   public String getNumeroContrattoSec() {
/*  95 */     return this.numeroContrattoSec;
/*     */   }
/*     */   public void setNumeroContrattoSec(String numeroContrattoSec) {
/*  98 */     this.numeroContrattoSec = numeroContrattoSec;
/*     */   }
/*     */   public String getProvinciaIndirizzoPostale() {
/* 101 */     return this.provinciaIndirizzoPostale;
/*     */   }
/*     */   public void setProvinciaIndirizzoPostale(String provinciaIndirizzoPostale) {
/* 104 */     this.provinciaIndirizzoPostale = provinciaIndirizzoPostale;
/*     */   }
/*     */   public String getRapporto() {
/* 107 */     return this.rapporto;
/*     */   }
/*     */   public void setRapporto(String rapporto) {
/* 110 */     this.rapporto = rapporto;
/*     */   }
/*     */   public String getStatoElab() {
/* 113 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 116 */     this.statoElab = statoElab;
/*     */   }
/*     */   public Integer getTipoProdotto() {
/* 119 */     return this.tipoProdotto;
/*     */   }
/*     */   public void setTipoProdotto(Integer tipoProdotto) {
/* 122 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   public String getCsott() {
/* 125 */     return this.csott;
/*     */   }
/*     */   public void setCsott(String csott) {
/* 128 */     this.csott = csott;
/*     */   }
/*     */   public Date getDataErrore() {
/* 131 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 134 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 137 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 140 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSyMigIndirizzi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */