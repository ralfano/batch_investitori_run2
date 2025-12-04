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
/*     */ public class FinInformazioniSoggetto
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer soggInfoSupplId;
/*     */   private Integer soggettoId;
/*     */   private String classImpoDirez;
/*     */   private String elencoCoperture;
/*     */   private String elencoCanaCond;
/*     */   private String homeBanking;
/*     */   private String fol;
/*     */   private String tol;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinInformazioniSoggetto(Integer soggettoId, String classImpoDirez, String elencoCoperture, String elencoCanaCond, String homeBanking, String fol, String tol, String datiSupl, Date dataInserimento, String utenteInserimento) {
/*  49 */     this.soggettoId = soggettoId;
/*  50 */     this.classImpoDirez = classImpoDirez;
/*  51 */     this.elencoCoperture = elencoCoperture;
/*  52 */     this.elencoCanaCond = elencoCanaCond;
/*  53 */     this.homeBanking = homeBanking;
/*  54 */     this.fol = fol;
/*  55 */     this.tol = tol;
/*  56 */     this.datiSupl = datiSupl;
/*  57 */     this.dataInserimento = dataInserimento;
/*  58 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinInformazioniSoggetto() {}
/*     */ 
/*     */   
/*     */   public Integer getSoggInfoSupplId() {
/*  66 */     return this.soggInfoSupplId;
/*     */   }
/*     */   
/*     */   public void setSoggInfoSupplId(Integer soggInfoSupplId) {
/*  70 */     this.soggInfoSupplId = soggInfoSupplId;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoId() {
/*  74 */     return this.soggettoId;
/*     */   }
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/*  78 */     this.soggettoId = soggettoId;
/*     */   }
/*     */   
/*     */   public String getClassImpoDirez() {
/*  82 */     return this.classImpoDirez;
/*     */   }
/*     */   
/*     */   public void setClassImpoDirez(String classImpoDirez) {
/*  86 */     this.classImpoDirez = classImpoDirez;
/*     */   }
/*     */   
/*     */   public String getElencoCoperture() {
/*  90 */     return this.elencoCoperture;
/*     */   }
/*     */   
/*     */   public void setElencoCoperture(String elencoCoperture) {
/*  94 */     this.elencoCoperture = elencoCoperture;
/*     */   }
/*     */   
/*     */   public String getElencoCanaCond() {
/*  98 */     return this.elencoCanaCond;
/*     */   }
/*     */   
/*     */   public void setElencoCanaCond(String elencoCanaCond) {
/* 102 */     this.elencoCanaCond = elencoCanaCond;
/*     */   }
/*     */   
/*     */   public String getHomeBanking() {
/* 106 */     return this.homeBanking;
/*     */   }
/*     */   
/*     */   public void setHomeBanking(String homeBanking) {
/* 110 */     this.homeBanking = homeBanking;
/*     */   }
/*     */   
/*     */   public String getFol() {
/* 114 */     return this.fol;
/*     */   }
/*     */   
/*     */   public void setFol(String fol) {
/* 118 */     this.fol = fol;
/*     */   }
/*     */   
/*     */   public String getTol() {
/* 122 */     return this.tol;
/*     */   }
/*     */   
/*     */   public void setTol(String tol) {
/* 126 */     this.tol = tol;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/* 130 */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/* 134 */     this.datiSupl = datiSupl;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 138 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 142 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 146 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 150 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 154 */     return (new ToStringBuilder(this)).append("soggInfoSupplId", getSoggInfoSupplId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinInformazioniSoggetto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */