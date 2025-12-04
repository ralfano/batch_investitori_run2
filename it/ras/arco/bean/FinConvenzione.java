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
/*     */ 
/*     */ public class FinConvenzione
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer convenzioneId;
/*     */   private String descrizioneConvenzione;
/*     */   private Date dataInizioValidita;
/*     */   private Date dataFineValidita;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Integer prodottoId;
/*     */   private String tipoProdotto;
/*     */   private String codiceConvenzione;
/*     */   private String descrizioneProdotto;
/*     */   private String codiceFascia;
/*     */   private String descrizioneFascia;
/*     */   private String flagTipoConvenzione;
/*     */   private Date dataInizioCommerciale;
/*     */   private Date dataFineCommerciale;
/*     */   private Integer attFinId;
/*     */   
/*     */   public Integer getAttFinId() {
/*  36 */     return this.attFinId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttFinId(Integer attFinId) {
/*  42 */     this.attFinId = attFinId;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinConvenzione() {}
/*     */   
/*     */   public FinConvenzione(String convenzione, String fascia, Date commerciale, Date validita, Date commerciale2, Date validita2, Date inserimento, String convenzione2, String fascia2, String prodotto, String convenzione3, Integer id, String prodotto2, String inserimento2) {
/*  49 */     this.codiceConvenzione = convenzione;
/*  50 */     this.codiceFascia = fascia;
/*  51 */     this.dataFineCommerciale = commerciale;
/*  52 */     this.dataFineValidita = validita;
/*  53 */     this.dataInizioCommerciale = commerciale2;
/*  54 */     this.dataInizioValidita = validita2;
/*  55 */     this.dataInserimento = inserimento;
/*  56 */     this.descrizioneConvenzione = convenzione2;
/*  57 */     this.descrizioneFascia = fascia2;
/*  58 */     this.descrizioneProdotto = prodotto;
/*  59 */     this.flagTipoConvenzione = convenzione3;
/*  60 */     this.prodottoId = id;
/*  61 */     this.tipoProdotto = prodotto2;
/*  62 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */   public String getCodiceConvenzione() {
/*  65 */     return this.codiceConvenzione;
/*     */   }
/*     */   public void setCodiceConvenzione(String codiceConvenzione) {
/*  68 */     this.codiceConvenzione = codiceConvenzione;
/*     */   }
/*     */   public String getCodiceFascia() {
/*  71 */     return this.codiceFascia;
/*     */   }
/*     */   public void setCodiceFascia(String codiceFascia) {
/*  74 */     this.codiceFascia = codiceFascia;
/*     */   }
/*     */   public Integer getConvenzioneId() {
/*  77 */     return this.convenzioneId;
/*     */   }
/*     */   public void setConvenzioneId(Integer convenzioneId) {
/*  80 */     this.convenzioneId = convenzioneId;
/*     */   }
/*     */   public Date getDataFineCommerciale() {
/*  83 */     return this.dataFineCommerciale;
/*     */   }
/*     */   public void setDataFineCommerciale(Date dataFineCommerciale) {
/*  86 */     this.dataFineCommerciale = dataFineCommerciale;
/*     */   }
/*     */   public Date getDataFineValidita() {
/*  89 */     return this.dataFineValidita;
/*     */   }
/*     */   public void setDataFineValidita(Date dataFineValidita) {
/*  92 */     this.dataFineValidita = dataFineValidita;
/*     */   }
/*     */   public Date getDataInizioCommerciale() {
/*  95 */     return this.dataInizioCommerciale;
/*     */   }
/*     */   public void setDataInizioCommerciale(Date dataInizioCommerciale) {
/*  98 */     this.dataInizioCommerciale = dataInizioCommerciale;
/*     */   }
/*     */   public Date getDataInizioValidita() {
/* 101 */     return this.dataInizioValidita;
/*     */   }
/*     */   public void setDataInizioValidita(Date dataInizioValidita) {
/* 104 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */   public Date getDataInserimento() {
/* 107 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 110 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public String getDescrizioneConvenzione() {
/* 113 */     return this.descrizioneConvenzione;
/*     */   }
/*     */   public void setDescrizioneConvenzione(String descrizioneConvenzione) {
/* 116 */     this.descrizioneConvenzione = descrizioneConvenzione;
/*     */   }
/*     */   public String getDescrizioneFascia() {
/* 119 */     return this.descrizioneFascia;
/*     */   }
/*     */   public void setDescrizioneFascia(String descrizioneFascia) {
/* 122 */     this.descrizioneFascia = descrizioneFascia;
/*     */   }
/*     */   public String getDescrizioneProdotto() {
/* 125 */     return this.descrizioneProdotto;
/*     */   }
/*     */   public void setDescrizioneProdotto(String descrizioneProdotto) {
/* 128 */     this.descrizioneProdotto = descrizioneProdotto;
/*     */   }
/*     */   public String getFlagTipoConvenzione() {
/* 131 */     return this.flagTipoConvenzione;
/*     */   }
/*     */   public void setFlagTipoConvenzione(String flagTipoConvenzione) {
/* 134 */     this.flagTipoConvenzione = flagTipoConvenzione;
/*     */   }
/*     */   public Integer getProdottoId() {
/* 137 */     return this.prodottoId;
/*     */   }
/*     */   public void setProdottoId(Integer prodottoId) {
/* 140 */     this.prodottoId = prodottoId;
/*     */   }
/*     */   public String getTipoProdotto() {
/* 143 */     return this.tipoProdotto;
/*     */   }
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 146 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 149 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 152 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinConvenzione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */