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
/*     */ public class FlxSecConvenzione
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String descrizioneConvenzione;
/*     */   private Date dataInizioValidita;
/*     */   private Date dataFineValidita;
/*     */   private String istanza;
/*     */   private String statoElab;
/*     */   private Date dataCaricamento;
/*     */   private String codiceProdotto;
/*     */   private String tipoProdotto;
/*     */   private String codiceConvenzione;
/*     */   private String descrizioneProdotto;
/*     */   private String codiceFascia;
/*     */   private String descrizioneFascia;
/*     */   private String flagTipoConvenzione;
/*     */   private Date dataInizioCommerciale;
/*     */   private Date dataFineCommerciale;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Date getDataElab() {
/*  37 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/*  44 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  51 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  58 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecConvenzione() {}
/*     */ 
/*     */   
/*     */   public String getCodiceConvenzione() {
/*  66 */     return this.codiceConvenzione;
/*     */   }
/*     */   
/*     */   public void setCodiceConvenzione(String codiceConvenzione) {
/*  70 */     this.codiceConvenzione = codiceConvenzione;
/*     */   }
/*     */   
/*     */   public String getCodiceFascia() {
/*  74 */     return this.codiceFascia;
/*     */   }
/*     */   
/*     */   public void setCodiceFascia(String codiceFascia) {
/*  78 */     this.codiceFascia = codiceFascia;
/*     */   }
/*     */   
/*     */   public String getCodiceProdotto() {
/*  82 */     return this.codiceProdotto;
/*     */   }
/*     */   
/*     */   public void setCodiceProdotto(String codiceProdotto) {
/*  86 */     this.codiceProdotto = codiceProdotto;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/*  90 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/*  94 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDataFineCommerciale() {
/*  98 */     return this.dataFineCommerciale;
/*     */   }
/*     */   
/*     */   public void setDataFineCommerciale(Date dataFineCommerciale) {
/* 102 */     this.dataFineCommerciale = dataFineCommerciale;
/*     */   }
/*     */   
/*     */   public Date getDataFineValidita() {
/* 106 */     return this.dataFineValidita;
/*     */   }
/*     */   
/*     */   public void setDataFineValidita(Date dataFineValidita) {
/* 110 */     this.dataFineValidita = dataFineValidita;
/*     */   }
/*     */   
/*     */   public Date getDataInizioCommerciale() {
/* 114 */     return this.dataInizioCommerciale;
/*     */   }
/*     */   
/*     */   public void setDataInizioCommerciale(Date dataInizioCommerciale) {
/* 118 */     this.dataInizioCommerciale = dataInizioCommerciale;
/*     */   }
/*     */   
/*     */   public Date getDataInizioValidita() {
/* 122 */     return this.dataInizioValidita;
/*     */   }
/*     */   
/*     */   public void setDataInizioValidita(Date dataInizioValidita) {
/* 126 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */   
/*     */   public String getDescrizioneConvenzione() {
/* 130 */     return this.descrizioneConvenzione;
/*     */   }
/*     */   
/*     */   public void setDescrizioneConvenzione(String descrizioneConvenzione) {
/* 134 */     this.descrizioneConvenzione = descrizioneConvenzione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneFascia() {
/* 138 */     return this.descrizioneFascia;
/*     */   }
/*     */   
/*     */   public void setDescrizioneFascia(String descrizioneFascia) {
/* 142 */     this.descrizioneFascia = descrizioneFascia;
/*     */   }
/*     */   
/*     */   public String getDescrizioneProdotto() {
/* 146 */     return this.descrizioneProdotto;
/*     */   }
/*     */   
/*     */   public void setDescrizioneProdotto(String descrizioneProdotto) {
/* 150 */     this.descrizioneProdotto = descrizioneProdotto;
/*     */   }
/*     */   
/*     */   public String getFlagTipoConvenzione() {
/* 154 */     return this.flagTipoConvenzione;
/*     */   }
/*     */   
/*     */   public void setFlagTipoConvenzione(String flagTipoConvenzione) {
/* 158 */     this.flagTipoConvenzione = flagTipoConvenzione;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 162 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 166 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 170 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 174 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 178 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 182 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 186 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 190 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecConvenzione(String convenzione, String fascia, String prodotto, Date caricamento, Date commerciale, Date validita, Date commerciale2, Date validita2, String convenzione2, String fascia2, String prodotto2, String convenzione3, String istanza, String elab, String prodotto3) {
/* 195 */     this.codiceConvenzione = convenzione;
/* 196 */     this.codiceFascia = fascia;
/* 197 */     this.codiceProdotto = prodotto;
/* 198 */     this.dataCaricamento = caricamento;
/* 199 */     this.dataFineCommerciale = commerciale;
/* 200 */     this.dataFineValidita = validita;
/* 201 */     this.dataInizioCommerciale = commerciale2;
/* 202 */     this.dataInizioValidita = validita2;
/* 203 */     this.descrizioneConvenzione = convenzione2;
/* 204 */     this.descrizioneFascia = fascia2;
/* 205 */     this.descrizioneProdotto = prodotto2;
/* 206 */     this.flagTipoConvenzione = convenzione3;
/* 207 */     this.istanza = istanza;
/* 208 */     this.statoElab = elab;
/* 209 */     this.tipoProdotto = prodotto3;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecConvenzione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */