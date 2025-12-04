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
/*     */ public class FlxBnlGesRapColl05
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer tipoRecord05;
/*     */   private Integer numAccordo05;
/*     */   private String codiceProdotto05;
/*     */   private Integer abi05;
/*     */   private Integer cab05;
/*     */   private Integer sportelloBnl05;
/*     */   private String numCc05;
/*     */   private Date dataInizio05;
/*     */   private Date dataFine05;
/*     */   private String tipoCollegamento05;
/*     */   private String tipoRimborso05;
/*     */   private Double importo05;
/*     */   private Integer contrattoDest05;
/*     */   private Integer frequenza05;
/*     */   private Integer ndg05;
/*     */   private String codFiscale05;
/*     */   private String mezzoPagamento05;
/*     */   private Integer giornoMese05;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   
/*     */   public Integer getAbi05() {
/*  40 */     return this.abi05;
/*     */   }
/*     */   public void setAbi05(Integer abi05) {
/*  43 */     this.abi05 = abi05;
/*     */   }
/*     */   public Integer getCab05() {
/*  46 */     return this.cab05;
/*     */   }
/*     */   public void setCab05(Integer cab05) {
/*  49 */     this.cab05 = cab05;
/*     */   }
/*     */   public String getCodFiscale05() {
/*  52 */     return this.codFiscale05;
/*     */   }
/*     */   public void setCodFiscale05(String codFiscale05) {
/*  55 */     this.codFiscale05 = codFiscale05;
/*     */   }
/*     */   public String getCodiceProdotto05() {
/*  58 */     return this.codiceProdotto05;
/*     */   }
/*     */   public void setCodiceProdotto05(String codiceProdotto05) {
/*  61 */     this.codiceProdotto05 = codiceProdotto05;
/*     */   }
/*     */   public Integer getContrattoDest05() {
/*  64 */     return this.contrattoDest05;
/*     */   }
/*     */   public void setContrattoDest05(Integer contrattoDest05) {
/*  67 */     this.contrattoDest05 = contrattoDest05;
/*     */   }
/*     */   public Date getDataFine05() {
/*  70 */     return this.dataFine05;
/*     */   }
/*     */   public void setDataFine05(Date dataFine05) {
/*  73 */     this.dataFine05 = dataFine05;
/*     */   }
/*     */   public Date getDataInizio05() {
/*  76 */     return this.dataInizio05;
/*     */   }
/*     */   public void setDataInizio05(Date dataInizio05) {
/*  79 */     this.dataInizio05 = dataInizio05;
/*     */   }
/*     */   public Integer getFlxId() {
/*  82 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/*  85 */     this.flxId = flxId;
/*     */   }
/*     */   public Integer getFrequenza05() {
/*  88 */     return this.frequenza05;
/*     */   }
/*     */   public void setFrequenza05(Integer frequenza05) {
/*  91 */     this.frequenza05 = frequenza05;
/*     */   }
/*     */   public Integer getGiornoMese05() {
/*  94 */     return this.giornoMese05;
/*     */   }
/*     */   public void setGiornoMese05(Integer giornoMese05) {
/*  97 */     this.giornoMese05 = giornoMese05;
/*     */   }
/*     */   public Double getImporto05() {
/* 100 */     return this.importo05;
/*     */   }
/*     */   public void setImporto05(Double importo05) {
/* 103 */     this.importo05 = importo05;
/*     */   }
/*     */   public String getIstanza() {
/* 106 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 109 */     this.istanza = istanza;
/*     */   }
/*     */   public String getMezzoPagamento05() {
/* 112 */     return this.mezzoPagamento05;
/*     */   }
/*     */   public void setMezzoPagamento05(String mezzoPagamento05) {
/* 115 */     this.mezzoPagamento05 = mezzoPagamento05;
/*     */   }
/*     */   public Integer getNdg05() {
/* 118 */     return this.ndg05;
/*     */   }
/*     */   public void setNdg05(Integer ndg05) {
/* 121 */     this.ndg05 = ndg05;
/*     */   }
/*     */   public Integer getNumAccordo05() {
/* 124 */     return this.numAccordo05;
/*     */   }
/*     */   public void setNumAccordo05(Integer numAccordo05) {
/* 127 */     this.numAccordo05 = numAccordo05;
/*     */   }
/*     */   public String getNumCc05() {
/* 130 */     return this.numCc05;
/*     */   }
/*     */   public void setNumCc05(String numCc05) {
/* 133 */     this.numCc05 = numCc05;
/*     */   }
/*     */   public Integer getSportelloBnl05() {
/* 136 */     return this.sportelloBnl05;
/*     */   }
/*     */   public void setSportelloBnl05(Integer sportelloBnl05) {
/* 139 */     this.sportelloBnl05 = sportelloBnl05;
/*     */   }
/*     */   public String getStatoElab() {
/* 142 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 145 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTipoCollegamento05() {
/* 148 */     return this.tipoCollegamento05;
/*     */   }
/*     */   public void setTipoCollegamento05(String tipoCollegamento05) {
/* 151 */     this.tipoCollegamento05 = tipoCollegamento05;
/*     */   }
/*     */   public Integer getTipoRecord05() {
/* 154 */     return this.tipoRecord05;
/*     */   }
/*     */   public void setTipoRecord05(Integer tipoRecord05) {
/* 157 */     this.tipoRecord05 = tipoRecord05;
/*     */   }
/*     */   public String getTipoRimborso05() {
/* 160 */     return this.tipoRimborso05;
/*     */   }
/*     */   public void setTipoRimborso05(String tipoRimborso05) {
/* 163 */     this.tipoRimborso05 = tipoRimborso05;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxBnlGesRapColl05.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */