/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.flag.bean.RasORMBean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxGenericMAFBean
/*     */   extends RasORMBean
/*     */ {
/*     */   private Integer flxId;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*  33 */   private String codiceMAF = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private FinAttivitaFinanziaria attivitaFinanziaria;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean codesTableUpdateNeeded = false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxGenericMAFBean(Integer flxId, String statoElaborazione) {
/*  55 */     this();
/*  56 */     this.flxId = flxId;
/*  57 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxGenericMAFBean() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceMAF() {
/*  77 */     return this.codiceMAF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceMAF(String codiceMAF) {
/*  86 */     this.codiceMAF = codiceMAF;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  97 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 105 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 113 */     return this.statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 121 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 130 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 139 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 148 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 157 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/* 166 */     return this.attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/* 175 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isCodesTableUpdateNeeded() {
/* 184 */     return this.codesTableUpdateNeeded;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodesTableUpdateNeeded(boolean codesTableUpdateNeeded) {
/* 193 */     this.codesTableUpdateNeeded = codesTableUpdateNeeded;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxGenericMAFBean.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */