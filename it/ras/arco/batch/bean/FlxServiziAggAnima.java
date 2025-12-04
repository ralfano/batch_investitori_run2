/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxServiziAggAnima
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Date dataReg;
/*     */   private String deposito;
/*     */   private String cognome;
/*     */   private String nome;
/*     */   private String fondo;
/*     */   private String numContratto;
/*     */   private String tipoServizio;
/*     */   private String frequenzaVersamento;
/*     */   private Integer scadenzaRid;
/*     */   private String banca;
/*     */   private Integer importoSwitch;
/*     */   private Integer importoRid;
/*     */   private String fondoEntrata;
/*     */   private Integer scontoComm;
/*     */   private Date dataRevoca;
/*     */   private Date dataPartenza;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   
/*     */   public String getBanca() {
/*  44 */     return this.banca;
/*     */   }
/*     */   public void setBanca(String banca) {
/*  47 */     this.banca = banca;
/*     */   }
/*     */   public String getCognome() {
/*  50 */     return this.cognome;
/*     */   }
/*     */   public void setCognome(String cognome) {
/*  53 */     this.cognome = cognome;
/*     */   }
/*     */   public Date getDataPartenza() {
/*  56 */     return this.dataPartenza;
/*     */   }
/*     */   public void setDataPartenza(Date dataPartenza) {
/*  59 */     this.dataPartenza = dataPartenza;
/*     */   }
/*     */   public Date getDataReg() {
/*  62 */     return this.dataReg;
/*     */   }
/*     */   public void setDataReg(Date dataReg) {
/*  65 */     this.dataReg = dataReg;
/*     */   }
/*     */   public Date getDataRevoca() {
/*  68 */     return this.dataRevoca;
/*     */   }
/*     */   public void setDataRevoca(Date dataRevoca) {
/*  71 */     this.dataRevoca = dataRevoca;
/*     */   }
/*     */   public String getDeposito() {
/*  74 */     return this.deposito;
/*     */   }
/*     */   public void setDeposito(String deposito) {
/*  77 */     this.deposito = deposito;
/*     */   }
/*     */   public Integer getFlxId() {
/*  80 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/*  83 */     this.flxId = flxId;
/*     */   }
/*     */   public String getFondo() {
/*  86 */     return this.fondo;
/*     */   }
/*     */   public void setFondo(String fondo) {
/*  89 */     this.fondo = fondo;
/*     */   }
/*     */   public String getFondoEntrata() {
/*  92 */     return this.fondoEntrata;
/*     */   }
/*     */   public void setFondoEntrata(String fondoEntrata) {
/*  95 */     this.fondoEntrata = fondoEntrata;
/*     */   }
/*     */   public String getFrequenzaVersamento() {
/*  98 */     return this.frequenzaVersamento;
/*     */   }
/*     */   public void setFrequenzaVersamento(String frequenzaVersamento) {
/* 101 */     this.frequenzaVersamento = frequenzaVersamento;
/*     */   }
/*     */   public Integer getImportoRid() {
/* 104 */     return this.importoRid;
/*     */   }
/*     */   public void setImportoRid(Integer importoRid) {
/* 107 */     this.importoRid = importoRid;
/*     */   }
/*     */   public Integer getImportoSwitch() {
/* 110 */     return this.importoSwitch;
/*     */   }
/*     */   public void setImportoSwitch(Integer importoSwitch) {
/* 113 */     this.importoSwitch = importoSwitch;
/*     */   }
/*     */   public String getIstanza() {
/* 116 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 119 */     this.istanza = istanza;
/*     */   }
/*     */   public String getNome() {
/* 122 */     return this.nome;
/*     */   }
/*     */   public void setNome(String nome) {
/* 125 */     this.nome = nome;
/*     */   }
/*     */   public String getNumContratto() {
/* 128 */     return this.numContratto;
/*     */   }
/*     */   public void setNumContratto(String numContratto) {
/* 131 */     this.numContratto = numContratto;
/*     */   }
/*     */   public Integer getScadenzaRid() {
/* 134 */     return this.scadenzaRid;
/*     */   }
/*     */   public void setScadenzaRid(Integer scadenzaRid) {
/* 137 */     this.scadenzaRid = scadenzaRid;
/*     */   }
/*     */   public Integer getScontoComm() {
/* 140 */     return this.scontoComm;
/*     */   }
/*     */   public void setScontoComm(Integer scontoComm) {
/* 143 */     this.scontoComm = scontoComm;
/*     */   }
/*     */   public String getStatoElab() {
/* 146 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 149 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTipoServizio() {
/* 152 */     return this.tipoServizio;
/*     */   }
/*     */   public void setTipoServizio(String tipoServizio) {
/* 155 */     this.tipoServizio = tipoServizio;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxServiziAggAnima.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */