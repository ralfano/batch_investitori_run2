/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class FinLegameIndir
/*     */   extends RasORMBean
/*     */   implements Serializable {
/*     */   private Integer legameIndirId;
/*     */   private String tipoGestione;
/*     */   private String tipoIndirizzo;
/*     */   private String provDatiAnag;
/*     */   private String descrizione;
/*     */   private Date dataElaborazione;
/*     */   private FinContratto contratto;
/*     */   private FinSoggetto soggetto;
/*     */   private FinIndirizzo indirizzo;
/*     */   private FinIndirizzo indirizzoCorrelato;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   
/*     */   public FinContratto getContratto() {
/*  29 */     return this.contratto;
/*     */   }
/*     */   public void setContratto(FinContratto contratto) {
/*  32 */     this.contratto = contratto;
/*     */   }
/*     */   public Date getDataElaborazione() {
/*  35 */     return this.dataElaborazione;
/*     */   }
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/*  38 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   public Date getDataInserimento() {
/*  41 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  44 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/*  47 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  50 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public String getDescrizione() {
/*  53 */     return this.descrizione;
/*     */   }
/*     */   public void setDescrizione(String descrizione) {
/*  56 */     this.descrizione = descrizione;
/*     */   }
/*     */   public String getFlagEsistenza() {
/*  59 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  62 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public FinIndirizzo getIndirizzo() {
/*  65 */     return this.indirizzo;
/*     */   }
/*     */   public void setIndirizzo(FinIndirizzo indirizzo) {
/*  68 */     this.indirizzo = indirizzo;
/*     */   }
/*     */   public FinIndirizzo getIndirizzoCorrelato() {
/*  71 */     return this.indirizzoCorrelato;
/*     */   }
/*     */   public void setIndirizzoCorrelato(FinIndirizzo indirizzoCorrelato) {
/*  74 */     this.indirizzoCorrelato = indirizzoCorrelato;
/*     */   }
/*     */   public Integer getLegameIndirId() {
/*  77 */     return this.legameIndirId;
/*     */   }
/*     */   public void setLegameIndirId(Integer legameIndirId) {
/*  80 */     this.legameIndirId = legameIndirId;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/*  83 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/*  86 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public String getProvDatiAnag() {
/*  89 */     return this.provDatiAnag;
/*     */   }
/*     */   public void setProvDatiAnag(String provDatiAnag) {
/*  92 */     this.provDatiAnag = provDatiAnag;
/*     */   }
/*     */   public FinSoggetto getSoggetto() {
/*  95 */     return this.soggetto;
/*     */   }
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/*  98 */     this.soggetto = soggetto;
/*     */   }
/*     */   public String getTipoGestione() {
/* 101 */     return this.tipoGestione;
/*     */   }
/*     */   public void setTipoGestione(String tipoGestione) {
/* 104 */     this.tipoGestione = tipoGestione;
/*     */   }
/*     */   public String getTipoIndirizzo() {
/* 107 */     return this.tipoIndirizzo;
/*     */   }
/*     */   public void setTipoIndirizzo(String tipoIndirizzo) {
/* 110 */     this.tipoIndirizzo = tipoIndirizzo;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/* 113 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 116 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModifica() {
/* 119 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 122 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 125 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 128 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinLegameIndir.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */