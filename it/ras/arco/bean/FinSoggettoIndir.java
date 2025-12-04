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
/*     */ public class FinSoggettoIndir
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private String tipoIndirizzo;
/*     */   private Integer soggettoIndirId;
/*     */   private String dominato;
/*     */   private String statoVariaz;
/*     */   private String flgDaCanc;
/*     */   private String presNote;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinSoggetto soggetto;
/*     */   private FinIndirizzo indirizzo;
/*     */   private int hashCode;
/*     */   
/*     */   public FinSoggettoIndir(Date fine, Date inizio, Date inserimento, String supl, String dominato, String canc, FinIndirizzo indirizzo, String note, FinSoggetto soggetto, String variaz, String indirizzo2, String inserimento2) {
/* 282 */     this.hashCode = Integer.MIN_VALUE; this.dataFine = fine; this.dataInizio = inizio; this.dataInserimento = inserimento; this.datiSupl = supl; this.dominato = dominato; this.flgDaCanc = canc; this.indirizzo = indirizzo; this.presNote = note; this.soggetto = soggetto; this.statoVariaz = variaz; this.tipoIndirizzo = indirizzo2; this.utenteInserimento = inserimento2; } public FinSoggettoIndir() { this.hashCode = Integer.MIN_VALUE; } public FinSoggettoIndir(FinSoggetto soggetto, FinIndirizzo indirizzo) { this.hashCode = Integer.MIN_VALUE; this.soggetto = soggetto; this.indirizzo = indirizzo; }
/*     */   public String getTipoIndirizzo() { return this.tipoIndirizzo; }
/*     */   public void setTipoIndirizzo(String tipoIndirizzo) { this.tipoIndirizzo = tipoIndirizzo; }
/* 285 */   public String getStatoVariaz() { return this.statoVariaz; } public void setStatoVariaz(String statoVariaz) { this.statoVariaz = statoVariaz; } public String getFlgDaCanc() { return this.flgDaCanc; } public void setFlgDaCanc(String flgDaCanc) { this.flgDaCanc = flgDaCanc; } public String getPresNote() { return this.presNote; } public void setPresNote(String presNote) { this.presNote = presNote; } public Date getDataInizio() { return this.dataInizio; } public void setDataInizio(Date dataInizio) { this.dataInizio = dataInizio; } public Date getDataFine() { return this.dataFine; } public void setDataFine(Date dataFine) { this.dataFine = dataFine; } public String getDatiSupl() { return this.datiSupl; } public void setDatiSupl(String datiSupl) { this.datiSupl = datiSupl; } public Date getDataInserimento() { return this.dataInserimento; } public void setDataInserimento(Date dataInserimento) { this.dataInserimento = dataInserimento; } public String getUserUltimaModificaSlave() { return getUserUltimaModifica(); } public int hashCode() { if (Integer.MIN_VALUE == this.hashCode) {
/* 286 */       StringBuffer sb = new StringBuffer();
/* 287 */       if (null != getSoggetto()) {
/* 288 */         sb.append(getSoggetto().hashCode());
/* 289 */         sb.append(":");
/*     */       } else {
/*     */         
/* 292 */         return super.hashCode();
/*     */       } 
/* 294 */       if (null != getIndirizzo()) {
/* 295 */         sb.append(getIndirizzo().hashCode());
/* 296 */         sb.append(":");
/*     */       } else {
/*     */         
/* 299 */         return super.hashCode();
/*     */       } 
/* 301 */       this.hashCode = sb.toString().hashCode();
/*     */     } 
/* 303 */     return this.hashCode; }
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) { setUserUltimaModifica(userUltimaModificaSlave); }
/*     */   public String getProceduraUltimaModificaSlave() { return getProceduraUltimaModifica(); }
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) { setProceduraUltimaModifica(proceduraUltimaModificaSlave); }
/* 307 */   public Date getDataUltimaModificaSlave() { return getDataUltimaModifica(); } public void setDataUltimaModificaSlave(Date dataUltimaModificaSlave) { setDataUltimaModifica(dataUltimaModificaSlave); } public String getTipoUltimaModificaSlave() { return getTipoUltimaModifica(); } public void setTipoUltimaModificaSlave(String tipoUltimaModificaSlave) { setTipoUltimaModifica(tipoUltimaModificaSlave); } public String getUtenteInserimento() { return this.utenteInserimento; } public void setUtenteInserimento(String utenteInserimento) { this.utenteInserimento = utenteInserimento; } public FinSoggetto getSoggetto() { return this.soggetto; } public void setSoggetto(FinSoggetto soggetto) { this.soggetto = soggetto; } public FinIndirizzo getIndirizzo() { return this.indirizzo; } public void setIndirizzo(FinIndirizzo indirizzo) { this.indirizzo = indirizzo; } public String getDominato() { return this.dominato; } public void setDominato(String dominato) { this.dominato = dominato; } public String toString() { return (new ToStringBuilder(this)).append("soggetto", getSoggetto()).append("indirizzo", getIndirizzo()).toString(); } public boolean equals(Object obj) { if (null == obj) return false;  if (!(obj instanceof FinSoggettoIndir)) return false;  FinSoggettoIndir mObj = (FinSoggettoIndir)obj; if (null != getSoggetto() && null != mObj.getSoggetto()) { if (!getSoggetto().equals(mObj.getSoggetto())) return false;  } else { return false; }  if (null != getIndirizzo() && null != mObj.getIndirizzo()) { if (!getIndirizzo().equals(mObj.getIndirizzo())) return false;  } else { return false; }  return true; } public Integer getSoggettoIndirId() { return this.soggettoIndirId; }
/*     */ 
/*     */   
/*     */   public void setSoggettoIndirId(Integer soggettoIndirId) {
/* 311 */     this.soggettoIndirId = soggettoIndirId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSoggettoIndir.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */