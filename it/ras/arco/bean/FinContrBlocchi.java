/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinContrBlocchi
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contrBlocchiId;
/*     */   private Date inizioValidita;
/*     */   private Date fineValidita;
/*     */   private Integer attFinId;
/*     */   private String tipoOpeBloccata;
/*     */   private String statoB;
/*     */   private Date dataRicezioneBlocco;
/*     */   private String causaleT;
/*     */   private Double quotebloccate;
/*     */   private String tipoBloccoT;
/*     */   private String numCertificato;
/*     */   private String desc;
/*     */   private String descSgr;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private FinPosizione posizione;
/*     */   private FinContratto contratto;
/*     */   
/*     */   public FinContratto getContratto() {
/*  37 */     return this.contratto;
/*     */   }
/*     */   public void setContratto(FinContratto contratto) {
/*  40 */     this.contratto = contratto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContrBlocchiId() {
/*  46 */     return this.contrBlocchiId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContrBlocchiId(Integer contrBlocchiId) {
/*  52 */     this.contrBlocchiId = contrBlocchiId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getAttFinId() {
/*  58 */     return this.attFinId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttFinId(Integer attFinId) {
/*  64 */     this.attFinId = attFinId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCausaleT() {
/*  70 */     return this.causaleT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCausaleT(String causaleT) {
/*  76 */     this.causaleT = causaleT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  82 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  88 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRicezioneBlocco() {
/*  94 */     return this.dataRicezioneBlocco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataRicezioneBlocco(Date dataRicezioneBlocco) {
/* 100 */     this.dataRicezioneBlocco = dataRicezioneBlocco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 106 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 112 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDesc() {
/* 118 */     return this.desc;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDesc(String desc) {
/* 124 */     this.desc = desc;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescSgr() {
/* 130 */     return this.descSgr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescSgr(String descSgr) {
/* 136 */     this.descSgr = descSgr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getFineValidita() {
/* 142 */     return this.fineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFineValidita(Date fineValidita) {
/* 148 */     this.fineValidita = fineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/* 154 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 160 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getInizioValidita() {
/* 166 */     return this.inizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInizioValidita(Date inizioValidita) {
/* 172 */     this.inizioValidita = inizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumCertificato() {
/* 178 */     return this.numCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumCertificato(String numCertificato) {
/* 184 */     this.numCertificato = numCertificato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 190 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 196 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuotebloccate() {
/* 202 */     return this.quotebloccate;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuotebloccate(Double quotebloccate) {
/* 208 */     this.quotebloccate = quotebloccate;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoB() {
/* 214 */     return this.statoB;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoB(String statoB) {
/* 220 */     this.statoB = statoB;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoBloccoT() {
/* 226 */     return this.tipoBloccoT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoBloccoT(String tipoBloccoT) {
/* 232 */     this.tipoBloccoT = tipoBloccoT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOpeBloccata() {
/* 238 */     return this.tipoOpeBloccata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOpeBloccata(String tipoOpeBloccata) {
/* 244 */     this.tipoOpeBloccata = tipoOpeBloccata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 250 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 256 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 262 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 268 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 274 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 280 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPosizione getPosizione() {
/* 286 */     return this.posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizione(FinPosizione posizione) {
/* 292 */     this.posizione = posizione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrBlocchi.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */