/*     */ package it.ras.arco.batch.bean;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAnimaSdr
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Date dataSaldo;
/*     */   private String codRete;
/*     */   private String codPromotore;
/*     */   private String numContratto;
/*     */   private String tipoContratto;
/*     */   private String rataUnitaria;
/*     */   private String numRifSocProdotto;
/*     */   private String codFondo;
/*     */   private Integer saldoQuoteCumul;
/*     */   private Integer saldoQuoteFis;
/*     */   private String numRatePacVers;
/*     */   private String statoElabB;
/*     */   private String istanzaS;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxAnimaSdr(Integer flxId, Date dataSaldo, String codRete, String codPromotore, String numContratto, String tipoContratto, String rataUnitaria, String numRifSocProdotto, String codFondo, Integer saldoQuoteCumul, Integer saldoQuoteFis, String numRatePacVers, String statoElabB, String istanzaS, String descrizioneErrore, Date dataErrore) {
/*  72 */     this.flxId = flxId;
/*  73 */     this.dataSaldo = dataSaldo;
/*  74 */     this.codRete = codRete;
/*  75 */     this.codPromotore = codPromotore;
/*  76 */     this.numContratto = numContratto;
/*  77 */     this.tipoContratto = tipoContratto;
/*  78 */     this.rataUnitaria = rataUnitaria;
/*  79 */     this.numRifSocProdotto = numRifSocProdotto;
/*  80 */     this.codFondo = codFondo;
/*  81 */     this.saldoQuoteCumul = saldoQuoteCumul;
/*  82 */     this.saldoQuoteFis = saldoQuoteFis;
/*  83 */     this.numRatePacVers = numRatePacVers;
/*  84 */     this.statoElabB = statoElabB;
/*  85 */     this.istanzaS = istanzaS;
/*  86 */     this.descrizioneErrore = descrizioneErrore;
/*  87 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAnimaSdr() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  95 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  99 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Date getDataSaldo() {
/* 103 */     return this.dataSaldo;
/*     */   }
/*     */   
/*     */   public void setDataSaldo(Date dataSaldo) {
/* 107 */     this.dataSaldo = dataSaldo;
/*     */   }
/*     */   
/*     */   public String getCodRete() {
/* 111 */     return this.codRete;
/*     */   }
/*     */   
/*     */   public void setCodRete(String codRete) {
/* 115 */     this.codRete = codRete;
/*     */   }
/*     */   
/*     */   public String getCodPromotore() {
/* 119 */     return this.codPromotore;
/*     */   }
/*     */   
/*     */   public void setCodPromotore(String codPromotore) {
/* 123 */     this.codPromotore = codPromotore;
/*     */   }
/*     */   
/*     */   public String getNumContratto() {
/* 127 */     return this.numContratto;
/*     */   }
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/* 131 */     this.numContratto = numContratto;
/*     */   }
/*     */   
/*     */   public String getTipoContratto() {
/* 135 */     return this.tipoContratto;
/*     */   }
/*     */   
/*     */   public void setTipoContratto(String tipoContratto) {
/* 139 */     this.tipoContratto = tipoContratto;
/*     */   }
/*     */   
/*     */   public String getRataUnitaria() {
/* 143 */     return this.rataUnitaria;
/*     */   }
/*     */   
/*     */   public void setRataUnitaria(String rataUnitaria) {
/* 147 */     this.rataUnitaria = rataUnitaria;
/*     */   }
/*     */   
/*     */   public String getNumRifSocProdotto() {
/* 151 */     return this.numRifSocProdotto;
/*     */   }
/*     */   
/*     */   public void setNumRifSocProdotto(String numRifSocProdotto) {
/* 155 */     this.numRifSocProdotto = numRifSocProdotto;
/*     */   }
/*     */   
/*     */   public String getCodFondo() {
/* 159 */     return this.codFondo;
/*     */   }
/*     */   
/*     */   public void setCodFondo(String codFondo) {
/* 163 */     this.codFondo = codFondo;
/*     */   }
/*     */   
/*     */   public Integer getSaldoQuoteCumul() {
/* 167 */     return this.saldoQuoteCumul;
/*     */   }
/*     */   
/*     */   public void setSaldoQuoteCumul(Integer saldoQuoteCumul) {
/* 171 */     this.saldoQuoteCumul = saldoQuoteCumul;
/*     */   }
/*     */   
/*     */   public Integer getSaldoQuoteFis() {
/* 175 */     return this.saldoQuoteFis;
/*     */   }
/*     */   
/*     */   public void setSaldoQuoteFis(Integer saldoQuoteFis) {
/* 179 */     this.saldoQuoteFis = saldoQuoteFis;
/*     */   }
/*     */   
/*     */   public String getNumRatePacVers() {
/* 183 */     return this.numRatePacVers;
/*     */   }
/*     */   
/*     */   public void setNumRatePacVers(String numRatePacVers) {
/* 187 */     this.numRatePacVers = numRatePacVers;
/*     */   }
/*     */   
/*     */   public String getStatoElabB() {
/* 191 */     return this.statoElabB;
/*     */   }
/*     */   
/*     */   public void setStatoElabB(String statoElabB) {
/* 195 */     this.statoElabB = statoElabB;
/*     */   }
/*     */   
/*     */   public String getIstanzaS() {
/* 199 */     return this.istanzaS;
/*     */   }
/*     */   
/*     */   public void setIstanzaS(String istanzaS) {
/* 203 */     this.istanzaS = istanzaS;
/*     */   }
/*     */   
/*     */   public Date getDataErrore() {
/* 207 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 210 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 213 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 216 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnimaSdr.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */