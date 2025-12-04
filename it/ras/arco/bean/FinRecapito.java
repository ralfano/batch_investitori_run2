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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinRecapito
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer recapitoId;
/*     */   private String dominato;
/*     */   private String tipoRecapito;
/*     */   private String statoVariaz;
/*     */   private String daCancellare;
/*     */   private String desRecapito;
/*     */   private String presNote;
/*     */   private String datiSupl;
/*     */   private Date inizioVali;
/*     */   private Date fineVali;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private FinSoggetto soggetto;
/*     */   
/*     */   public FinRecapito(String cancellare, Date inserimento, String supl, String recapito, String dominato, Date vali, Date vali2, String note, Integer id, FinSoggetto soggetto, String variaz, String recapito2, String inserimento2) {
/*  67 */     this.daCancellare = cancellare;
/*  68 */     this.dataInserimento = inserimento;
/*  69 */     this.datiSupl = supl;
/*  70 */     this.desRecapito = recapito;
/*  71 */     this.dominato = dominato;
/*  72 */     this.fineVali = vali;
/*  73 */     this.inizioVali = vali2;
/*  74 */     this.presNote = note;
/*  75 */     this.recapitoId = id;
/*  76 */     this.soggetto = soggetto;
/*  77 */     this.statoVariaz = variaz;
/*  78 */     this.tipoRecapito = recapito2;
/*  79 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinRecapito() {}
/*     */ 
/*     */   
/*     */   public Integer getRecapitoId() {
/*  87 */     return this.recapitoId;
/*     */   }
/*     */   
/*     */   public void setRecapitoId(Integer recapitoId) {
/*  91 */     this.recapitoId = recapitoId;
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
/*     */   public String getTipoRecapito() {
/* 103 */     return this.tipoRecapito;
/*     */   }
/*     */   
/*     */   public void setTipoRecapito(String tipoRecapito) {
/* 107 */     this.tipoRecapito = tipoRecapito;
/*     */   }
/*     */   
/*     */   public String getStatoVariaz() {
/* 111 */     return this.statoVariaz;
/*     */   }
/*     */   
/*     */   public void setStatoVariaz(String statoVariaz) {
/* 115 */     this.statoVariaz = statoVariaz;
/*     */   }
/*     */   
/*     */   public String getDaCancellare() {
/* 119 */     return this.daCancellare;
/*     */   }
/*     */   
/*     */   public void setDaCancellare(String daCancellare) {
/* 123 */     this.daCancellare = daCancellare;
/*     */   }
/*     */   
/*     */   public String getDesRecapito() {
/* 127 */     return this.desRecapito;
/*     */   }
/*     */   
/*     */   public void setDesRecapito(String desRecapito) {
/* 131 */     this.desRecapito = desRecapito;
/*     */   }
/*     */   
/*     */   public String getPresNote() {
/* 135 */     return this.presNote;
/*     */   }
/*     */   
/*     */   public void setPresNote(String presNote) {
/* 139 */     this.presNote = presNote;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/* 143 */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/* 147 */     this.datiSupl = datiSupl;
/*     */   }
/*     */   
/*     */   public Date getInizioVali() {
/* 151 */     return this.inizioVali;
/*     */   }
/*     */   
/*     */   public void setInizioVali(Date inizioVali) {
/* 155 */     this.inizioVali = inizioVali;
/*     */   }
/*     */   
/*     */   public Date getFineVali() {
/* 159 */     return this.fineVali;
/*     */   }
/*     */   
/*     */   public void setFineVali(Date fineVali) {
/* 163 */     this.fineVali = fineVali;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 170 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 174 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 179 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 183 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 188 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 192 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public void setDominato(String dominato) {
/* 196 */     this.dominato = dominato;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 200 */     return (new ToStringBuilder(this)).append("recapitoId", getRecapitoId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 206 */     HashCodeBuilder hBuilder = new HashCodeBuilder(1, 3);
/*     */     
/* 208 */     hBuilder.append(this.tipoRecapito);
/* 209 */     hBuilder.append(this.desRecapito);
/*     */     
/* 211 */     return hBuilder.toHashCode();
/*     */   }
/*     */   
/*     */   public String getDominato() {
/* 215 */     return this.dominato;
/*     */   }
/*     */   
/*     */   public boolean isEmptyForBussinessLogic() {
/* 219 */     return (new EqualsBuilder()).append(this.desRecapito, (this.desRecapito == null) ? null : "").isEquals();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinRecapito copyFields(FinRecapito rec) {
/* 228 */     this.daCancellare = rec.getDaCancellare();
/* 229 */     this.dataInserimento = rec.getDataInserimento();
/* 230 */     this.datiSupl = rec.getDatiSupl();
/* 231 */     this.desRecapito = rec.getDesRecapito();
/* 232 */     this.presNote = rec.getPresNote();
/* 233 */     this.statoVariaz = rec.getStatoVariaz();
/* 234 */     this.tipoRecapito = rec.getTipoRecapito();
/* 235 */     this.utenteInserimento = rec.getUtenteInserimento();
/* 236 */     this.dataUltimaModificaSlave = new Date();
/* 237 */     this.flagEsistenza = "S";
/* 238 */     this.proceduraUltimaModificaSlave = rec.getProceduraUltimaModificaSlave();
/* 239 */     this.tipoUltimaModificaSlave = "U";
/* 240 */     this.userUltimaModificaSlave = rec.getUserUltimaModificaSlave();
/* 241 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinRecapito.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */