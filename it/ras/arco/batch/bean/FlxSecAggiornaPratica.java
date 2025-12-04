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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxSecAggiornaPratica
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String parametro;
/*     */   private String codiceAgente;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String statoPratica;
/*     */   private String numPresentazione;
/*     */   private String numPratica;
/*     */   private Date dataAperturaPra;
/*     */   private String numCC;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxSecAggiornaPratica(String agente, String compagnia, String rete, Date pra, Date caricamento, Date elaborazione, String errore, Integer id, String istanza, String numcc, String pratica, String presentazione, String parametro, String elab, String pratica2) {
/*  46 */     this.codiceAgente = agente;
/*  47 */     this.codiceCompagnia = compagnia;
/*  48 */     this.codiceRete = rete;
/*  49 */     this.dataAperturaPra = pra;
/*  50 */     this.dataCaricamento = caricamento;
/*  51 */     this.dataElaborazione = elaborazione;
/*  52 */     this.descrizioneErrore = errore;
/*  53 */     this.flxId = id;
/*  54 */     this.istanza = istanza;
/*  55 */     this.numCC = numcc;
/*  56 */     this.numPratica = pratica;
/*  57 */     this.numPresentazione = presentazione;
/*  58 */     this.parametro = parametro;
/*  59 */     this.statoElab = elab;
/*  60 */     this.statoPratica = pratica2;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/*  64 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/*  68 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  72 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  76 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/*  80 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/*  84 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public Date getDataAperturaPra() {
/*  88 */     return this.dataAperturaPra;
/*     */   }
/*     */   
/*     */   public void setDataAperturaPra(Date dataAperturaPra) {
/*  92 */     this.dataAperturaPra = dataAperturaPra;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/*  96 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 100 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/* 104 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 108 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 112 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 116 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 120 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 124 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 128 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 132 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getNumCC() {
/* 136 */     return this.numCC;
/*     */   }
/*     */   
/*     */   public void setNumCC(String numCC) {
/* 140 */     this.numCC = numCC;
/*     */   }
/*     */   
/*     */   public String getNumPratica() {
/* 144 */     return this.numPratica;
/*     */   }
/*     */   
/*     */   public void setNumPratica(String numPratica) {
/* 148 */     this.numPratica = numPratica;
/*     */   }
/*     */   
/*     */   public String getNumPresentazione() {
/* 152 */     return this.numPresentazione;
/*     */   }
/*     */   
/*     */   public void setNumPresentazione(String numPresentazione) {
/* 156 */     this.numPresentazione = numPresentazione;
/*     */   }
/*     */   
/*     */   public String getParametro() {
/* 160 */     return this.parametro;
/*     */   }
/*     */   
/*     */   public void setParametro(String parametro) {
/* 164 */     this.parametro = parametro;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 168 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 172 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getStatoPratica() {
/* 176 */     return this.statoPratica;
/*     */   }
/*     */   
/*     */   public void setStatoPratica(String statoPratica) {
/* 180 */     this.statoPratica = statoPratica;
/*     */   }
/*     */   
/*     */   public FlxSecAggiornaPratica() {}
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecAggiornaPratica.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */