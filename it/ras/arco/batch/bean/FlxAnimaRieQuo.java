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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAnimaRieQuo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String valoreFisso1;
/*     */   private String filler;
/*     */   private String codiceFondo;
/*     */   private Double valoreQuota;
/*     */   private String valoreFisso2;
/*     */   private String valoreFisso3;
/*     */   private Date dataValoreQuota;
/*     */   private String valoreFisso4;
/*     */   private String codSocCollocatrice;
/*     */   private String abiSocCollocatrice;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxAnimaRieQuo(String valoreFisso1, String filler, String codiceFondo, Double valoreQuota, String valoreFisso2, String valoreFisso3, Date dataValoreQuota, String valoreFisso4, String codSocCollocatrice, String abiSocCollocatrice, String statoElab, String istanza, Date dataCaricamento, String descrizioneErrore, Date dataErrore) {
/*  65 */     this.valoreFisso1 = valoreFisso1;
/*  66 */     this.filler = filler;
/*  67 */     this.codiceFondo = codiceFondo;
/*  68 */     this.valoreQuota = valoreQuota;
/*  69 */     this.valoreFisso2 = valoreFisso2;
/*  70 */     this.valoreFisso3 = valoreFisso3;
/*  71 */     this.dataValoreQuota = dataValoreQuota;
/*  72 */     this.valoreFisso4 = valoreFisso4;
/*  73 */     this.codSocCollocatrice = codSocCollocatrice;
/*  74 */     this.abiSocCollocatrice = abiSocCollocatrice;
/*  75 */     this.statoElab = statoElab;
/*  76 */     this.istanza = istanza;
/*  77 */     this.dataCaricamento = dataCaricamento;
/*  78 */     this.descrizioneErrore = descrizioneErrore;
/*  79 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAnimaRieQuo() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  87 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  91 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getValoreFisso1() {
/*  95 */     return this.valoreFisso1;
/*     */   }
/*     */   
/*     */   public void setValoreFisso1(String valoreFisso1) {
/*  99 */     this.valoreFisso1 = valoreFisso1;
/*     */   }
/*     */   
/*     */   public String getFiller() {
/* 103 */     return this.filler;
/*     */   }
/*     */   
/*     */   public void setFiller(String filler) {
/* 107 */     this.filler = filler;
/*     */   }
/*     */   
/*     */   public String getCodiceFondo() {
/* 111 */     return this.codiceFondo;
/*     */   }
/*     */   
/*     */   public void setCodiceFondo(String codiceFondo) {
/* 115 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */   
/*     */   public Double getValoreQuota() {
/* 119 */     return this.valoreQuota;
/*     */   }
/*     */   
/*     */   public void setValoreQuota(Double valoreQuota) {
/* 123 */     this.valoreQuota = valoreQuota;
/*     */   }
/*     */   
/*     */   public String getValoreFisso2() {
/* 127 */     return this.valoreFisso2;
/*     */   }
/*     */   
/*     */   public void setValoreFisso2(String valoreFisso2) {
/* 131 */     this.valoreFisso2 = valoreFisso2;
/*     */   }
/*     */   
/*     */   public String getValoreFisso3() {
/* 135 */     return this.valoreFisso3;
/*     */   }
/*     */   
/*     */   public void setValoreFisso3(String valoreFisso3) {
/* 139 */     this.valoreFisso3 = valoreFisso3;
/*     */   }
/*     */   
/*     */   public Date getDataValoreQuota() {
/* 143 */     return this.dataValoreQuota;
/*     */   }
/*     */   
/*     */   public void setDataValoreQuota(Date dataValoreQuota) {
/* 147 */     this.dataValoreQuota = dataValoreQuota;
/*     */   }
/*     */   
/*     */   public String getValoreFisso4() {
/* 151 */     return this.valoreFisso4;
/*     */   }
/*     */   
/*     */   public void setValoreFisso4(String valoreFisso4) {
/* 155 */     this.valoreFisso4 = valoreFisso4;
/*     */   }
/*     */   
/*     */   public String getCodSocCollocatrice() {
/* 159 */     return this.codSocCollocatrice;
/*     */   }
/*     */   
/*     */   public void setCodSocCollocatrice(String codSocCollocatrice) {
/* 163 */     this.codSocCollocatrice = codSocCollocatrice;
/*     */   }
/*     */   
/*     */   public String getAbiSocCollocatrice() {
/* 167 */     return this.abiSocCollocatrice;
/*     */   }
/*     */   
/*     */   public void setAbiSocCollocatrice(String abiSocCollocatrice) {
/* 171 */     this.abiSocCollocatrice = abiSocCollocatrice;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 175 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 179 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 183 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 187 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 191 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 195 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
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
/*     */   
/*     */   public String toString() {
/* 212 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnimaRieQuo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */