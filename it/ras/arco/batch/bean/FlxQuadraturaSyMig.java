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
/*     */ public class FlxQuadraturaSyMig
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codFabbrica;
/*     */   private Integer tipoProdotto;
/*     */   private Integer numSottoscrizione;
/*     */   private String numContrattoSec;
/*     */   private String numDossierTecnicoFabbrica;
/*     */   private Integer codCompartoSec;
/*     */   private String codCompartoFabbrica;
/*     */   private Integer numQuote;
/*     */   private String isin;
/*     */   private Integer rapporto;
/*     */   private String statoElabB;
/*     */   private String istanzaS;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxQuadraturaSyMig(Integer flxId, String codFabbrica, Integer tipoProdotto, Integer numSottoscrizione, String numContrattoSec, String numDossierTecnicoFabbrica, Integer codCompartoSec, String codCompartoFabbrica, Integer numQuote, String isin, Integer rapporto, String statoElabB, String istanzaS, String descrizioneErrore, Date dataErrore) {
/*  68 */     this.flxId = flxId;
/*  69 */     this.codFabbrica = codFabbrica;
/*  70 */     this.tipoProdotto = tipoProdotto;
/*  71 */     this.numSottoscrizione = numSottoscrizione;
/*  72 */     this.numContrattoSec = numContrattoSec;
/*  73 */     this.numDossierTecnicoFabbrica = numDossierTecnicoFabbrica;
/*  74 */     this.codCompartoSec = codCompartoSec;
/*  75 */     this.codCompartoFabbrica = codCompartoFabbrica;
/*  76 */     this.numQuote = numQuote;
/*  77 */     this.isin = isin;
/*  78 */     this.rapporto = rapporto;
/*  79 */     this.statoElabB = statoElabB;
/*  80 */     this.istanzaS = istanzaS;
/*  81 */     this.descrizioneErrore = descrizioneErrore;
/*  82 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxQuadraturaSyMig() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  90 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  94 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getCodFabbrica() {
/*  98 */     return this.codFabbrica;
/*     */   }
/*     */   
/*     */   public void setCodFabbrica(String codFabbrica) {
/* 102 */     this.codFabbrica = codFabbrica;
/*     */   }
/*     */   
/*     */   public Integer getTipoProdotto() {
/* 106 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(Integer tipoProdotto) {
/* 110 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public Integer getNumSottoscrizione() {
/* 114 */     return this.numSottoscrizione;
/*     */   }
/*     */   
/*     */   public void setNumSottoscrizione(Integer numSottoscrizione) {
/* 118 */     this.numSottoscrizione = numSottoscrizione;
/*     */   }
/*     */   
/*     */   public String getNumContrattoSec() {
/* 122 */     return this.numContrattoSec;
/*     */   }
/*     */   
/*     */   public void setNumContrattoSec(String numContrattoSec) {
/* 126 */     this.numContrattoSec = numContrattoSec;
/*     */   }
/*     */   
/*     */   public String getNumDossierTecnicoFabbrica() {
/* 130 */     return this.numDossierTecnicoFabbrica;
/*     */   }
/*     */   
/*     */   public void setNumDossierTecnicoFabbrica(String numDossierTecnicoFabbrica) {
/* 134 */     this.numDossierTecnicoFabbrica = numDossierTecnicoFabbrica;
/*     */   }
/*     */   
/*     */   public Integer getCodCompartoSec() {
/* 138 */     return this.codCompartoSec;
/*     */   }
/*     */   
/*     */   public void setCodCompartoSec(Integer codCompartoSec) {
/* 142 */     this.codCompartoSec = codCompartoSec;
/*     */   }
/*     */   
/*     */   public String getCodCompartoFabbrica() {
/* 146 */     return this.codCompartoFabbrica;
/*     */   }
/*     */   
/*     */   public void setCodCompartoFabbrica(String codCompartoFabbrica) {
/* 150 */     this.codCompartoFabbrica = codCompartoFabbrica;
/*     */   }
/*     */   
/*     */   public Integer getNumQuote() {
/* 154 */     return this.numQuote;
/*     */   }
/*     */   
/*     */   public void setNumQuote(Integer numQuote) {
/* 158 */     this.numQuote = numQuote;
/*     */   }
/*     */   
/*     */   public String getIsin() {
/* 162 */     return this.isin;
/*     */   }
/*     */   
/*     */   public void setIsin(String isin) {
/* 166 */     this.isin = isin;
/*     */   }
/*     */   
/*     */   public Integer getRapporto() {
/* 170 */     return this.rapporto;
/*     */   }
/*     */   
/*     */   public void setRapporto(Integer rapporto) {
/* 174 */     this.rapporto = rapporto;
/*     */   }
/*     */   
/*     */   public String getStatoElabB() {
/* 178 */     return this.statoElabB;
/*     */   }
/*     */   
/*     */   public void setStatoElabB(String statoElabB) {
/* 182 */     this.statoElabB = statoElabB;
/*     */   }
/*     */   
/*     */   public String getIstanzaS() {
/* 186 */     return this.istanzaS;
/*     */   }
/*     */   
/*     */   public void setIstanzaS(String istanzaS) {
/* 190 */     this.istanzaS = istanzaS;
/*     */   }
/*     */   
/*     */   public Date getDataErrore() {
/* 194 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 197 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 200 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 203 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxQuadraturaSyMig.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */