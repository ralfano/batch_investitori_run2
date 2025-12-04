/*     */ package it.ras.arco.bean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinEvidenza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer evidenzaId;
/*     */   private Integer codEvidenza;
/*     */   private String descrizione;
/*     */   private String entita;
/*     */   private String gravValFab;
/*     */   private String gravValArco;
/*     */   private Date dataInserimento;
/*     */   private Date dataUltimaModifica;
/*     */   private String utenteInserimento;
/*     */   private String flagEsistenza;
/*     */   private String tipoUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private String userUltimaModifica;
/*     */   private String visibilita;
/*     */   private String soloEmittente;
/*     */   private String tipoProdotto;
/*     */   private String visibilitaSottoscrizione;
/*     */   private FinEmittente emittente;
/*     */   
/*     */   public String getTipoProdotto() {
/*  68 */     return this.tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/*  74 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVisibilitaSottoscrizione() {
/*  80 */     return this.visibilitaSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVisibilitaSottoscrizione(String visibilitaSottoscrizione) {
/*  86 */     this.visibilitaSottoscrizione = visibilitaSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEvidenza() {}
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEvidenza(FinEmittente emittente, Integer emittenteId, Integer evidenzaId, Integer codEvidenza, String descrizione, String entita, String gravValFab, String gravValArco, Date dataInserimento, Date dataUltimaModifica, String utenteInserimento, String flagEsistenza, String tipoUltimaModifica, String proceduraUltimaModifica, String userUltimaModifica) {
/*  97 */     this.emittente = emittente;
/*     */     
/*  99 */     this.evidenzaId = evidenzaId;
/* 100 */     this.codEvidenza = codEvidenza;
/* 101 */     this.descrizione = descrizione;
/* 102 */     this.entita = entita;
/* 103 */     this.gravValFab = gravValFab;
/* 104 */     this.gravValArco = gravValArco;
/* 105 */     this.dataInserimento = dataInserimento;
/* 106 */     this.dataUltimaModifica = dataUltimaModifica;
/* 107 */     this.utenteInserimento = utenteInserimento;
/* 108 */     this.flagEsistenza = flagEsistenza;
/* 109 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/* 110 */     this.tipoUltimaModifica = tipoUltimaModifica;
/* 111 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodEvidenza() {
/* 120 */     return this.codEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodEvidenza(Integer codEvidenza) {
/* 126 */     this.codEvidenza = codEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizione() {
/* 132 */     return this.descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/* 138 */     this.descrizione = descrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEntita() {
/* 144 */     return this.entita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEntita(String entita) {
/* 150 */     this.entita = entita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getEvidenzaId() {
/* 156 */     return this.evidenzaId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEvidenzaId(Integer evidenzaId) {
/* 162 */     this.evidenzaId = evidenzaId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGravValArco() {
/* 168 */     return this.gravValArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGravValArco(String gravValArco) {
/* 174 */     this.gravValArco = gravValArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGravValFab() {
/* 180 */     return this.gravValFab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGravValFab(String gravValFab) {
/* 186 */     this.gravValFab = gravValFab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 193 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 199 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 205 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 211 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/* 217 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 223 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 229 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 235 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 241 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 247 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 253 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 259 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 265 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 271 */     this.userUltimaModifica = userUltimaModifica;
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
/*     */   public FinEmittente getEmittente() {
/* 289 */     return this.emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittente(FinEmittente emittente) {
/* 295 */     this.emittente = emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVisibilita() {
/* 302 */     return this.visibilita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVisibilita(String visibilita) {
/* 308 */     this.visibilita = visibilita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSoloEmittente() {
/* 315 */     return this.soloEmittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSoloEmittente(String soloEmittente) {
/* 323 */     this.soloEmittente = soloEmittente;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinEvidenza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */