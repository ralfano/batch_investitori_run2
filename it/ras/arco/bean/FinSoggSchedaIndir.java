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
/*     */ public class FinSoggSchedaIndir
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer soggSchedaIndirId;
/*     */   private String tipoIndirizzo;
/*     */   private String dominato;
/*     */   private String statoVariaz;
/*     */   private String flgDaCanc;
/*     */   private String presNote;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinSoggScheda soggScheda;
/*     */   private FinIndirizzo indirizzo;
/*     */   private int hashCode;
/*     */   
/*     */   public FinSoggSchedaIndir(Date fine, Date inizio, Date inserimento, String supl, String dominato, String canc, FinIndirizzo indirizzo, String note, FinSoggScheda soggScheda, String variaz, String indirizzo2, String inserimento2) {
/* 305 */     this.hashCode = Integer.MIN_VALUE; this.dataFine = fine; this.dataInizio = inizio; this.dataInserimento = inserimento; this.datiSupl = supl; this.dominato = dominato; this.flgDaCanc = canc; this.indirizzo = indirizzo; this.presNote = note; this.soggScheda = soggScheda; this.statoVariaz = variaz; this.tipoIndirizzo = indirizzo2; this.utenteInserimento = inserimento2; } public FinSoggSchedaIndir() { this.hashCode = Integer.MIN_VALUE; } public FinSoggSchedaIndir(FinSoggScheda soggScheda, FinIndirizzo indirizzo) { this.hashCode = Integer.MIN_VALUE; this.soggScheda = soggScheda;
/*     */     this.indirizzo = indirizzo; }
/*     */   public String getTipoIndirizzo() { return this.tipoIndirizzo; }
/* 308 */   public void setTipoIndirizzo(String tipoIndirizzo) { this.tipoIndirizzo = tipoIndirizzo; } public int hashCode() { if (Integer.MIN_VALUE == this.hashCode) {
/* 309 */       StringBuffer sb = new StringBuffer();
/* 310 */       if (null != getSoggScheda()) {
/* 311 */         sb.append(getSoggScheda().hashCode());
/* 312 */         sb.append(":");
/*     */       } else {
/*     */         
/* 315 */         return super.hashCode();
/*     */       } 
/* 317 */       if (null != getIndirizzo()) {
/* 318 */         sb.append(getIndirizzo().hashCode());
/* 319 */         sb.append(":");
/*     */       } else {
/*     */         
/* 322 */         return super.hashCode();
/*     */       } 
/* 324 */       this.hashCode = sb.toString().hashCode();
/*     */     } 
/* 326 */     return this.hashCode; }
/*     */ 
/*     */   
/*     */   public String getStatoVariaz() {
/*     */     return this.statoVariaz;
/*     */   }
/*     */   
/*     */   public void setStatoVariaz(String statoVariaz) {
/*     */     this.statoVariaz = statoVariaz;
/*     */   }
/*     */   
/*     */   public String getFlgDaCanc() {
/*     */     return this.flgDaCanc;
/*     */   }
/*     */   
/*     */   public void setFlgDaCanc(String flgDaCanc) {
/*     */     this.flgDaCanc = flgDaCanc;
/*     */   }
/*     */   
/*     */   public String getPresNote() {
/*     */     return this.presNote;
/*     */   }
/*     */   
/*     */   public void setPresNote(String presNote) {
/*     */     this.presNote = presNote;
/*     */   }
/*     */   
/*     */   public Date getDataInizio() {
/*     */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*     */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/*     */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*     */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/*     */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/*     */     this.datiSupl = datiSupl;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/*     */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*     */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Integer getSoggSchedaIndirId() {
/*     */     return this.soggSchedaIndirId;
/*     */   }
/*     */   
/*     */   public void setSoggSchedaIndirId(Integer soggSchedaIndirId) {
/*     */     this.soggSchedaIndirId = soggSchedaIndirId;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/*     */     return getUserUltimaModifica();
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/*     */     setUserUltimaModifica(userUltimaModificaSlave);
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/*     */     return getProceduraUltimaModifica();
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/*     */     setProceduraUltimaModifica(proceduraUltimaModificaSlave);
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModificaSlave() {
/*     */     return getDataUltimaModifica();
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) {
/*     */     setDataUltimaModifica(dataUltimaModificaSlave);
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModificaSlave() {
/*     */     return getTipoUltimaModifica();
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) {
/*     */     setTipoUltimaModifica(tipoUltimaModificaSlave);
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/*     */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*     */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public FinSoggScheda getSoggScheda() {
/*     */     return this.soggScheda;
/*     */   }
/*     */   
/*     */   public void setSoggScheda(FinSoggScheda soggScheda) {
/*     */     this.soggScheda = soggScheda;
/*     */   }
/*     */   
/*     */   public FinIndirizzo getIndirizzo() {
/*     */     return this.indirizzo;
/*     */   }
/*     */   
/*     */   public void setIndirizzo(FinIndirizzo indirizzo) {
/*     */     this.indirizzo = indirizzo;
/*     */   }
/*     */   
/*     */   public String getDominato() {
/*     */     return this.dominato;
/*     */   }
/*     */   
/*     */   public void setDominato(String dominato) {
/*     */     this.dominato = dominato;
/*     */   }
/*     */   
/*     */   public String toString() {
/*     */     return (new ToStringBuilder(this)).append("soggetto scheda", getSoggScheda()).append("indirizzo", getIndirizzo()).toString();
/*     */   }
/*     */   
/*     */   public boolean equals(Object obj) {
/*     */     if (null == obj)
/*     */       return false; 
/*     */     if (!(obj instanceof FinSoggettoIndir))
/*     */       return false; 
/*     */     FinSoggettoIndir mObj = (FinSoggettoIndir)obj;
/*     */     if (null != getSoggScheda() && null != mObj.getSoggetto()) {
/*     */       if (!getSoggScheda().equals(mObj.getSoggetto()))
/*     */         return false; 
/*     */     } else {
/*     */       return false;
/*     */     } 
/*     */     if (null != getIndirizzo() && null != mObj.getIndirizzo()) {
/*     */       if (!getIndirizzo().equals(mObj.getIndirizzo()))
/*     */         return false; 
/*     */     } else {
/*     */       return false;
/*     */     } 
/*     */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggSchedaIndir.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */