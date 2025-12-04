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
/*     */ public class FlxSecQuotazioni
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceFabbrica;
/*     */   private Integer tipoProdotto;
/*     */   private Integer codiceProdottoSec;
/*     */   private String codiceProdottoFabbrica;
/*     */   private String descrizioneProdotto;
/*     */   private Integer codiceCompartoSec;
/*     */   private String codiceCompartoFabbrica;
/*     */   private String descrizioneComparto;
/*     */   private String descrizioneBreveComparto;
/*     */   private Date data;
/*     */   private String divisa;
/*     */   private String quotazione;
/*     */   private String isin;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxSecQuotazioni(Integer flxId, String codiceFabbrica, Integer tipoProdotto, Integer codiceProdottoSec, String codiceProdottoFabbrica, String descrizioneProdotto, Integer codiceCompartoSec, String codiceCompartoFabbrica, String descrizioneComparto, String descrizioneBreveComparto, Date data, String divisa, String quotazione, String isin, String statoElab, String istanza, Date dataCaricamento, String descrizioneErrore, Date dataErrore) {
/*  74 */     this.flxId = flxId;
/*  75 */     this.codiceFabbrica = codiceFabbrica;
/*  76 */     this.tipoProdotto = tipoProdotto;
/*  77 */     this.codiceProdottoSec = codiceProdottoSec;
/*  78 */     this.codiceProdottoFabbrica = codiceProdottoFabbrica;
/*  79 */     this.descrizioneProdotto = descrizioneProdotto;
/*  80 */     this.codiceCompartoSec = codiceCompartoSec;
/*  81 */     this.codiceCompartoFabbrica = codiceCompartoFabbrica;
/*  82 */     this.descrizioneComparto = descrizioneComparto;
/*  83 */     this.descrizioneBreveComparto = descrizioneBreveComparto;
/*  84 */     this.data = data;
/*  85 */     this.divisa = divisa;
/*  86 */     this.quotazione = quotazione;
/*  87 */     this.isin = isin;
/*  88 */     this.statoElab = statoElab;
/*  89 */     this.istanza = istanza;
/*  90 */     this.dataCaricamento = dataCaricamento;
/*  91 */     this.descrizioneErrore = descrizioneErrore;
/*  92 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecQuotazioni() {}
/*     */ 
/*     */   
/*     */   public String getCodiceCompartoFabbrica() {
/* 100 */     return this.codiceCompartoFabbrica;
/*     */   }
/*     */   
/*     */   public void setCodiceCompartoFabbrica(String codiceCompartoFabbrica) {
/* 104 */     this.codiceCompartoFabbrica = codiceCompartoFabbrica;
/*     */   }
/*     */   
/*     */   public Integer getCodiceCompartoSec() {
/* 108 */     return this.codiceCompartoSec;
/*     */   }
/*     */   
/*     */   public void setCodiceCompartoSec(Integer codiceCompartoSec) {
/* 112 */     this.codiceCompartoSec = codiceCompartoSec;
/*     */   }
/*     */   
/*     */   public String getCodiceFabbrica() {
/* 116 */     return this.codiceFabbrica;
/*     */   }
/*     */   
/*     */   public void setCodiceFabbrica(String codiceFabbrica) {
/* 120 */     this.codiceFabbrica = codiceFabbrica;
/*     */   }
/*     */   
/*     */   public String getCodiceProdottoFabbrica() {
/* 124 */     return this.codiceProdottoFabbrica;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoFabbrica(String codiceProdottoFabbrica) {
/* 128 */     this.codiceProdottoFabbrica = codiceProdottoFabbrica;
/*     */   }
/*     */   
/*     */   public Integer getCodiceProdottoSec() {
/* 132 */     return this.codiceProdottoSec;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoSec(Integer codiceProdottoSec) {
/* 136 */     this.codiceProdottoSec = codiceProdottoSec;
/*     */   }
/*     */   
/*     */   public Date getData() {
/* 140 */     return this.data;
/*     */   }
/*     */   
/*     */   public void setData(Date data) {
/* 144 */     this.data = data;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 148 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 152 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public String getDescrizioneBreveComparto() {
/* 156 */     return this.descrizioneBreveComparto;
/*     */   }
/*     */   
/*     */   public void setDescrizioneBreveComparto(String descrizioneBreveComparto) {
/* 160 */     this.descrizioneBreveComparto = descrizioneBreveComparto;
/*     */   }
/*     */   
/*     */   public String getDescrizioneComparto() {
/* 164 */     return this.descrizioneComparto;
/*     */   }
/*     */   
/*     */   public void setDescrizioneComparto(String descrizioneComparto) {
/* 168 */     this.descrizioneComparto = descrizioneComparto;
/*     */   }
/*     */   
/*     */   public String getDescrizioneProdotto() {
/* 172 */     return this.descrizioneProdotto;
/*     */   }
/*     */   
/*     */   public void setDescrizioneProdotto(String descrizioneProdotto) {
/* 176 */     this.descrizioneProdotto = descrizioneProdotto;
/*     */   }
/*     */   
/*     */   public String getDivisa() {
/* 180 */     return this.divisa;
/*     */   }
/*     */   
/*     */   public void setDivisa(String divisa) {
/* 184 */     this.divisa = divisa;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 188 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 192 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getIsin() {
/* 196 */     return this.isin;
/*     */   }
/*     */   
/*     */   public void setIsin(String isin) {
/* 200 */     this.isin = isin;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 204 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 208 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getQuotazione() {
/* 212 */     return this.quotazione;
/*     */   }
/*     */   
/*     */   public void setQuotazione(String quotazione) {
/* 216 */     this.quotazione = quotazione;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 220 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 224 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public Integer getTipoProdotto() {
/* 228 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(Integer tipoProdotto) {
/* 232 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public Date getDataErrore() {
/* 236 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 239 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 242 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 245 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecQuotazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */