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
/*     */ public class FinStoricoSaldo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer saldoId;
/*     */   private String numContratto;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Double valoreSaldo;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String ufficiale;
/*     */   private FinPosizione posizione;
/*     */   
/*     */   public FinPosizione getPosizione() {
/*  33 */     return this.posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPosizione(FinPosizione posizione) {
/*  39 */     this.posizione = posizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFine() {
/*  45 */     return this.dataFine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/*  51 */     this.dataFine = dataFine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizio() {
/*  57 */     return this.dataInizio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/*  63 */     this.dataInizio = dataInizio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/*  69 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  75 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaModifica() {
/*  81 */     return this.dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  87 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/*  93 */     return this.flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  99 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumContratto() {
/* 105 */     return this.numContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/* 111 */     this.numContratto = numContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 117 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 123 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getSaldoId() {
/* 129 */     return this.saldoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSaldoId(Integer saldoId) {
/* 135 */     this.saldoId = saldoId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 141 */     return this.tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 147 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUfficiale() {
/* 153 */     return this.ufficiale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUfficiale(String ufficiale) {
/* 159 */     this.ufficiale = ufficiale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 165 */     return this.userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 171 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 177 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 183 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getValoreSaldo() {
/* 189 */     return this.valoreSaldo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValoreSaldo(Double valoreSaldo) {
/* 195 */     this.valoreSaldo = valoreSaldo;
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
/*     */   public FinStoricoSaldo() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinStoricoSaldo(Date fine, Date inizio, Date inserimento, Date modifica, String esistenza, String contratto, String modifica2, String modifica3, String ufficiale, String modifica4, String inserimento2, Double saldo) {
/* 219 */     this.dataFine = fine;
/* 220 */     this.dataInizio = inizio;
/* 221 */     this.dataInserimento = inserimento;
/* 222 */     this.dataUltimaModifica = modifica;
/* 223 */     this.flagEsistenza = esistenza;
/* 224 */     this.numContratto = contratto;
/* 225 */     this.proceduraUltimaModifica = modifica2;
/* 226 */     this.tipoUltimaModifica = modifica3;
/* 227 */     this.ufficiale = ufficiale;
/* 228 */     this.userUltimaModifica = modifica4;
/* 229 */     this.utenteInserimento = inserimento2;
/* 230 */     this.valoreSaldo = saldo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinStoricoSaldo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */