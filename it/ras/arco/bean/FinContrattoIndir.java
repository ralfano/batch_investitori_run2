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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinContrattoIndir
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contrIndirId;
/*     */   private String modalita;
/*     */   private String tipoIndirizzo;
/*     */   private String statoVariaz;
/*     */   private String flgDaCanc;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinContratto contratto;
/*     */   private FinIndirizzo indirizzo;
/*     */   private String provDatiAnag;
/*     */   
/*     */   public String getProvDatiAnag() {
/*  52 */     return this.provDatiAnag;
/*     */   }
/*     */   
/*     */   public void setProvDatiAnag(String provDatiAnag) {
/*  56 */     this.provDatiAnag = provDatiAnag;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinContrattoIndir(String tipoIndirizzo, String statoVariaz, String flgDaCanc, String presNote, Date dataInizio, Date dataFine, String datiSupl, Date dataInserimento, String utenteInserimento, FinContratto contratto, FinIndirizzo indirizzo) {
/*  61 */     this.tipoIndirizzo = tipoIndirizzo;
/*  62 */     this.statoVariaz = statoVariaz;
/*  63 */     this.flgDaCanc = flgDaCanc;
/*  64 */     this.dataInizio = dataInizio;
/*  65 */     this.dataFine = dataFine;
/*  66 */     this.dataInserimento = dataInserimento;
/*  67 */     this.utenteInserimento = utenteInserimento;
/*  68 */     this.contratto = contratto;
/*  69 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContrattoIndir() {}
/*     */ 
/*     */   
/*     */   public FinContrattoIndir(FinIndirizzo indirizzo) {
/*  78 */     this.indirizzo = indirizzo;
/*     */   }
/*     */   
/*     */   public String getTipoIndirizzo() {
/*  82 */     return this.tipoIndirizzo;
/*     */   }
/*     */   
/*     */   public void setTipoIndirizzo(String tipoIndirizzo) {
/*  86 */     this.tipoIndirizzo = tipoIndirizzo;
/*     */   }
/*     */   
/*     */   public String getStatoVariaz() {
/*  90 */     return this.statoVariaz;
/*     */   }
/*     */   
/*     */   public void setStatoVariaz(String statoVariaz) {
/*  94 */     this.statoVariaz = statoVariaz;
/*     */   }
/*     */   
/*     */   public String getFlgDaCanc() {
/*  98 */     return this.flgDaCanc;
/*     */   }
/*     */   
/*     */   public void setFlgDaCanc(String flgDaCanc) {
/* 102 */     this.flgDaCanc = flgDaCanc;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/* 106 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 110 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/* 114 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 118 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 122 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 126 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 130 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 134 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 144 */     return getUserUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 152 */     setUserUltimaModifica(userUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/* 160 */     return getProceduraUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 169 */     setProceduraUltimaModifica(proceduraUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModificaSlave() {
/* 177 */     return getDataUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/* 185 */     setDataUltimaModifica(dataUltimaModificaSlave);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModificaSlave() {
/* 193 */     return getTipoUltimaModifica();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/* 201 */     setTipoUltimaModifica(tipoUltimaModificaSlave);
/*     */   }
/*     */   
/*     */   public FinContratto getContratto() {
/* 205 */     return this.contratto;
/*     */   }
/*     */   
/*     */   public void setContratto(FinContratto contratto) {
/* 209 */     this.contratto = contratto;
/*     */   }
/*     */   
/*     */   public FinIndirizzo getIndirizzo() {
/* 213 */     return this.indirizzo;
/*     */   }
/*     */   
/*     */   public void setIndirizzo(FinIndirizzo indirizzo) {
/* 217 */     this.indirizzo = indirizzo;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 221 */     return (new ToStringBuilder(this)).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object contrattoIndir) {
/* 227 */     if (!(contrattoIndir instanceof FinContrattoIndir))
/* 228 */       return false; 
/* 229 */     EqualsBuilder comparator = new EqualsBuilder();
/* 230 */     FinContrattoIndir contrIndir = (FinContrattoIndir)contrattoIndir;
/* 231 */     comparator.append(this.contratto, contrIndir.contratto);
/* 232 */     comparator.append(this.indirizzo, contrIndir.indirizzo);
/* 233 */     return comparator.isEquals();
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 237 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 3);
/* 238 */     hBuilder.append(this.contratto);
/* 239 */     hBuilder.append(this.indirizzo);
/* 240 */     return hBuilder.toHashCode();
/*     */   }
/*     */   
/*     */   public Integer getContrIndirId() {
/* 244 */     return this.contrIndirId;
/*     */   }
/*     */   
/*     */   public void setContrIndirId(Integer contrIndirId) {
/* 248 */     this.contrIndirId = contrIndirId;
/*     */   }
/*     */   
/*     */   public String getModalita() {
/* 252 */     return this.modalita;
/*     */   }
/*     */   
/*     */   public void setModalita(String modalita) {
/* 256 */     this.modalita = modalita;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrattoIndir.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */