/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class FinSottoscrizioneCont
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Integer sottoscContrId;
/*     */   private FinContrattoBase contratto;
/*     */   private FinSottoscrizione sottoscrizione;
/*     */   
/*     */   public FinSottoscrizioneCont(FinContratto contratto, Date inserimento, FinSottoscrizione sottoscrizione, String inserimento2) {
/*  40 */     this.contratto = contratto;
/*  41 */     this.dataInserimento = inserimento;
/*  42 */     this.sottoscrizione = sottoscrizione;
/*  43 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSottoscrizioneCont() {}
/*     */ 
/*     */   
/*     */   public FinSottoscrizioneCont(FinContratto contratto, FinSottoscrizione sottoscrizione) {
/*  52 */     this.contratto = contratto;
/*  53 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  58 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  62 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/*  67 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  71 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/*  81 */     return getUserUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/*  89 */     setUserUltimaModifica(userUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/*  97 */     return getProceduraUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 106 */     setProceduraUltimaModifica(proceduraUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModificaSlave() {
/* 114 */     return getDataUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/* 122 */     setDataUltimaModifica(dataUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModificaSlave() {
/* 130 */     return getTipoUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 138 */     setTipoUltimaModifica(tipoUltimaModificaSlave);
/*     */   }
/*     */   
/*     */   public FinContrattoBase getContratto() {
/* 142 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(FinContrattoBase contratto) {
/* 146 */     this.contratto = contratto;
/*     */   }
/*     */   
/*     */   public FinSottoscrizione getSottoscrizione() {
/* 150 */     return this.sottoscrizione;
/*     */   }
/*     */   
/*     */   public void setSottoscrizione(FinSottoscrizione sottoscrizione) {
/* 154 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 158 */     return (new ToStringBuilder(this)).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object sottoscrizioneContratto) {
/* 164 */     if (!(sottoscrizioneContratto instanceof FinSottoscrizioneCont))
/* 165 */       return false; 
/* 166 */     EqualsBuilder comparator = new EqualsBuilder();
/* 167 */     FinSottoscrizioneCont sottoscrContr = (FinSottoscrizioneCont)sottoscrizioneContratto;
/* 168 */     comparator.append(this.contratto, sottoscrContr.contratto);
/* 169 */     comparator.append(this.sottoscrizione, sottoscrContr.sottoscrizione);
/* 170 */     return comparator.isEquals();
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 174 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 3);
/* 175 */     hBuilder.append(this.contratto);
/* 176 */     hBuilder.append(this.sottoscrizione);
/* 177 */     return hBuilder.toHashCode();
/*     */   }
/*     */   
/*     */   public Integer getSottoscContrId() {
/* 181 */     return this.sottoscContrId;
/*     */   }
/*     */   
/*     */   public void setSottoscContrId(Integer sottoscContrId) {
/* 185 */     this.sottoscContrId = sottoscContrId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSottoscrizioneCont.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */