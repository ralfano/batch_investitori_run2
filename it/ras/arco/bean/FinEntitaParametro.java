/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ public class FinEntitaParametro
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer entitaParametroId;
/*     */   private Integer tipoEntita;
/*     */   private Integer entitaId;
/*     */   private String valore;
/*     */   private Date dataInizio;
/*     */   private Date dataFine;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String valoreDivisa;
/*  47 */   private FinParametro parametro = null;
/*     */ 
/*     */   
/*  50 */   private FinEmittente emittente = null;
/*     */   
/*  52 */   private FinProdotto prodotto = null;
/*     */   
/*  54 */   private FinAttivitaFinanziaria attivitaFinanziaria = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  59 */   public static final Integer TIPO_ENTITA_EMITTENTE = new Integer(0);
/*  60 */   public static final Integer TIPO_ENTITA_PRODOTTO = new Integer(1);
/*  61 */   public static final Integer TIPO_ENTITA_ATT_FIN = new Integer(2);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEntitaParametro(Integer entitaParametroId, FinParametro parametro, Integer tipoEntita, Integer entitaId, String valore, Date dataInizio, Date dataFine, Date dataInserimento, String utenteInserimento, String divisaValore, FinEmittente emittente, FinProdotto prodotto, FinAttivitaFinanziaria attivitaFinanziaria) {
/*  68 */     this.parametro = parametro;
/*  69 */     this.tipoEntita = tipoEntita;
/*  70 */     this.entitaId = entitaId;
/*     */     
/*  72 */     this.valore = valore;
/*  73 */     this.dataInizio = dataInizio;
/*  74 */     this.dataFine = dataFine;
/*  75 */     this.dataInserimento = dataInserimento;
/*  76 */     this.utenteInserimento = utenteInserimento;
/*  77 */     this.entitaParametroId = entitaParametroId;
/*  78 */     this.valoreDivisa = divisaValore;
/*     */     
/*  80 */     this.emittente = emittente;
/*  81 */     this.prodotto = prodotto;
/*  82 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEntitaParametro() {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEntitaParametro(FinEntitaParametro ep) {
/*  94 */     this.parametro = ep.parametro;
/*     */     
/*  96 */     this.emittente = ep.emittente;
/*  97 */     this.prodotto = ep.prodotto;
/*  98 */     this.attivitaFinanziaria = ep.attivitaFinanziaria;
/*     */     
/* 100 */     this.valoreDivisa = ep.valoreDivisa;
/* 101 */     this.dataInizio = ep.dataInizio;
/* 102 */     this.dataFine = ep.dataFine;
/*     */ 
/*     */     
/* 105 */     this.tipoEntita = ep.tipoEntita;
/* 106 */     this.entitaId = ep.entitaId;
/* 107 */     this.valore = ep.valore;
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
/*     */   
/*     */   public Integer getEntitaParametroId() {
/* 121 */     return this.entitaParametroId;
/*     */   }
/*     */   
/*     */   public void setEntitaParametroId(Integer entitaParametroId) {
/* 125 */     this.entitaParametroId = entitaParametroId;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinParametro getParametro() {
/* 130 */     return this.parametro;
/*     */   }
/*     */   
/*     */   public void setParametro(FinParametro parametro) {
/* 134 */     this.parametro = parametro;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getEntitaId() {
/* 139 */     return this.entitaId;
/*     */   }
/*     */   
/*     */   public void setEntitaId(Integer entitaId) {
/* 143 */     this.entitaId = entitaId;
/*     */   }
/*     */   
/*     */   public Integer getTipoEntita() {
/* 147 */     return this.tipoEntita;
/*     */   }
/*     */   
/*     */   public void setTipoEntita(Integer tipoEntita) {
/* 151 */     this.tipoEntita = tipoEntita;
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
/*     */   
/*     */   public Date getDataInizio() {
/* 165 */     return this.dataInizio;
/*     */   }
/*     */   
/*     */   public void setDataInizio(Date dataInizio) {
/* 169 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   
/*     */   public Date getDataFine() {
/* 173 */     return this.dataFine;
/*     */   }
/*     */   
/*     */   public void setDataFine(Date dataFine) {
/* 177 */     this.dataFine = dataFine;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 181 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 185 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getValore() {
/* 189 */     return this.valore;
/*     */   }
/*     */   
/*     */   public void setValore(String valore) {
/* 193 */     this.valore = valore;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 198 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 202 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getValoreDivisa() {
/* 206 */     return this.valoreDivisa;
/*     */   }
/*     */   
/*     */   public void setValoreDivisa(String divisaValore) {
/* 210 */     this.valoreDivisa = divisaValore;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 215 */     return (new ToStringBuilder(this)).append("entitaParametroId", getEntitaParametroId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFinanziaria() {
/* 225 */     return this.attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinanziaria(FinAttivitaFinanziaria attivitaFinanziaria) {
/* 233 */     this.attivitaFinanziaria = attivitaFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEmittente getEmittente() {
/* 241 */     return this.emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittente(FinEmittente emittente) {
/* 249 */     this.emittente = emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinProdotto getProdotto() {
/* 257 */     return this.prodotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProdotto(FinProdotto prodotto) {
/* 265 */     this.prodotto = prodotto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinEntitaParametro.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */