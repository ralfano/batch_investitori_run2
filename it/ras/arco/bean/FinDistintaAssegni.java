/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ public class FinDistintaAssegni
/*     */   extends RasORMBean
/*     */ {
/*     */   private Integer distintaId;
/*     */   private Integer numeroDistinta;
/*     */   private Date dataValuta;
/*     */   private Date dataStampa;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimentoRecord;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private Set disposizioniPagamento;
/*     */   
/*     */   public boolean equals(Object obj) {
/*  36 */     if (!(obj instanceof FinDistintaAssegni)) {
/*  37 */       return false;
/*     */     }
/*     */ 
/*     */     
/*  41 */     FinDistintaAssegni other = (FinDistintaAssegni)obj;
/*  42 */     if (this.distintaId != null && other.distintaId != null)
/*     */     {
/*  44 */       return (this.distintaId.intValue() == other.distintaId.intValue());
/*     */     }
/*  46 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/*  52 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void accept(IGSTDInitVisitor visitor) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/*  67 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/*  73 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/*  79 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  85 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public Date getDataStampa() {
/*  88 */     return this.dataStampa;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataStampa(Date dataStampa) {
/*  93 */     this.dataStampa = dataStampa;
/*     */   }
/*     */   
/*     */   public Integer getDistintaId() {
/*  97 */     return this.distintaId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDistintaId(Integer distintaId) {
/* 102 */     this.distintaId = distintaId;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumeroDistinta() {
/* 107 */     return this.numeroDistinta;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumeroDistinta(Integer numeroDistinta) {
/* 112 */     this.numeroDistinta = numeroDistinta;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/* 117 */     return this.dataInserimentoRecord;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/* 122 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 127 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 132 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/* 137 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 142 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 147 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 152 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 157 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 162 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
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
/*     */   public Date getDataValuta() {
/* 181 */     return this.dataValuta;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 186 */     this.dataValuta = dataValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getDisposizioniPagamento() {
/* 194 */     return this.disposizioniPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisposizioniPagamento(Set disposizioniPagamento) {
/* 202 */     this.disposizioniPagamento = disposizioniPagamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDistintaAssegni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */