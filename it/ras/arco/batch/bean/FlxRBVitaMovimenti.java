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
/*     */ public class FlxRBVitaMovimenti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String tipoRecord;
/*     */   private Integer emittente;
/*     */   private String prodotto;
/*     */   private Integer polizza;
/*     */   private String causale;
/*     */   private Date dataInserimento;
/*     */   private Date dataCompetenza;
/*     */   private Date dataValuta;
/*     */   private Date dataRegistraz;
/*     */   private String divisa;
/*     */   private Double importoNetto;
/*     */   private Double importo;
/*     */   private Integer quantita;
/*     */   private Double prezzo;
/*     */   private Double cambio;
/*     */   private Double commissioni;
/*     */   private Double spese;
/*     */   private String fndDestinazione;
/*     */   private String nomeBenef;
/*     */   private String codiceAgente;
/*     */   private String tipoProdotto;
/*     */   private String mezzoPagamento;
/*     */   private String statoContratto;
/*     */   private String abi;
/*     */   private String cab;
/*     */   private String numcc;
/*     */   private String annualita;
/*     */   private String tipoMovimento;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descError;
/*     */   private Date dataElab;
/*     */   private String codFondo;
/*     */   private String codLinea;
/*     */   private Integer versioneProdotto;
/*     */   
/*     */   public String getAbi() {
/*  60 */     return this.abi;
/*     */   }
/*     */   public void setAbi(String abi) {
/*  63 */     this.abi = abi;
/*     */   }
/*     */   public String getAnnualita() {
/*  66 */     return this.annualita;
/*     */   }
/*     */   public void setAnnualita(String annualita) {
/*  69 */     this.annualita = annualita;
/*     */   }
/*     */   public String getCab() {
/*  72 */     return this.cab;
/*     */   }
/*     */   public void setCab(String cab) {
/*  75 */     this.cab = cab;
/*     */   }
/*     */   public Double getCambio() {
/*  78 */     return this.cambio;
/*     */   }
/*     */   public void setCambio(Double cambio) {
/*  81 */     this.cambio = cambio;
/*     */   }
/*     */   public String getCausale() {
/*  84 */     return this.causale;
/*     */   }
/*     */   public void setCausale(String causale) {
/*  87 */     this.causale = causale;
/*     */   }
/*     */   public String getCodiceAgente() {
/*  90 */     return this.codiceAgente;
/*     */   }
/*     */   public void setCodiceAgente(String codiceAgente) {
/*  93 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   public Double getCommissioni() {
/*  96 */     return this.commissioni;
/*     */   }
/*     */   public void setCommissioni(Double commissioni) {
/*  99 */     this.commissioni = commissioni;
/*     */   }
/*     */   public Date getDataCaricamento() {
/* 102 */     return this.dataCaricamento;
/*     */   }
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 105 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   public Date getDataCompetenza() {
/* 108 */     return this.dataCompetenza;
/*     */   }
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 111 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */   public Date getDataInserimento() {
/* 114 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 117 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataRegistraz() {
/* 120 */     return this.dataRegistraz;
/*     */   }
/*     */   public void setDataRegistraz(Date dataRegistraz) {
/* 123 */     this.dataRegistraz = dataRegistraz;
/*     */   }
/*     */   public Date getDataValuta() {
/* 126 */     return this.dataValuta;
/*     */   }
/*     */   public void setDataValuta(Date dataValuta) {
/* 129 */     this.dataValuta = dataValuta;
/*     */   }
/*     */   public String getDivisa() {
/* 132 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(String divisa) {
/* 135 */     this.divisa = divisa;
/*     */   }
/*     */   public Integer getEmittente() {
/* 138 */     return this.emittente;
/*     */   }
/*     */   public void setEmittente(Integer emittente) {
/* 141 */     this.emittente = emittente;
/*     */   }
/*     */   public Integer getFlxId() {
/* 144 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 147 */     this.flxId = flxId;
/*     */   }
/*     */   public String getFndDestinazione() {
/* 150 */     return this.fndDestinazione;
/*     */   }
/*     */   public void setFndDestinazione(String fndDestinazione) {
/* 153 */     this.fndDestinazione = fndDestinazione;
/*     */   }
/*     */   public Double getImporto() {
/* 156 */     return this.importo;
/*     */   }
/*     */   public void setImporto(Double importo) {
/* 159 */     this.importo = importo;
/*     */   }
/*     */   
/*     */   public Double getImportoNetto() {
/* 163 */     return this.importoNetto;
/*     */   }
/*     */   public void setImportoNetto(Double importoNetto) {
/* 166 */     this.importoNetto = importoNetto;
/*     */   }
/*     */   public String getIstanza() {
/* 169 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 172 */     this.istanza = istanza;
/*     */   }
/*     */   public String getMezzoPagamento() {
/* 175 */     return this.mezzoPagamento;
/*     */   }
/*     */   public void setMezzoPagamento(String mezzoPagamento) {
/* 178 */     this.mezzoPagamento = mezzoPagamento;
/*     */   }
/*     */   public String getNomeBenef() {
/* 181 */     return this.nomeBenef;
/*     */   }
/*     */   public void setNomeBenef(String nomeBenef) {
/* 184 */     this.nomeBenef = nomeBenef;
/*     */   }
/*     */   public String getNumcc() {
/* 187 */     return this.numcc;
/*     */   }
/*     */   public void setNumcc(String numcc) {
/* 190 */     this.numcc = numcc;
/*     */   }
/*     */   public Integer getPolizza() {
/* 193 */     return this.polizza;
/*     */   }
/*     */   public void setPolizza(Integer polizza) {
/* 196 */     this.polizza = polizza;
/*     */   }
/*     */   public Double getPrezzo() {
/* 199 */     return this.prezzo;
/*     */   }
/*     */   public void setPrezzo(Double prezzo) {
/* 202 */     this.prezzo = prezzo;
/*     */   }
/*     */   public String getProdotto() {
/* 205 */     return this.prodotto;
/*     */   }
/*     */   public void setProdotto(String prodotto) {
/* 208 */     this.prodotto = prodotto;
/*     */   }
/*     */   public Integer getQuantita() {
/* 211 */     return this.quantita;
/*     */   }
/*     */   public void setQuantita(Integer quantita) {
/* 214 */     this.quantita = quantita;
/*     */   }
/*     */   public Double getSpese() {
/* 217 */     return this.spese;
/*     */   }
/*     */   public void setSpese(Double spese) {
/* 220 */     this.spese = spese;
/*     */   }
/*     */   public String getStatoElab() {
/* 223 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 226 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTipoMovimento() {
/* 229 */     return this.tipoMovimento;
/*     */   }
/*     */   public void setTipoMovimento(String tipoMovimento) {
/* 232 */     this.tipoMovimento = tipoMovimento;
/*     */   }
/*     */   public String getTipoProdotto() {
/* 235 */     return this.tipoProdotto;
/*     */   }
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 238 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   public String getTipoRecord() {
/* 241 */     return this.tipoRecord;
/*     */   }
/*     */   public void setTipoRecord(String tipoRecord) {
/* 244 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */   public void setStatoContratto(String statoContratto) {
/* 247 */     this.statoContratto = statoContratto;
/*     */   }
/*     */   public String getStatoContratto() {
/* 250 */     return this.statoContratto;
/*     */   }
/*     */   public Date getDataElab() {
/* 253 */     return this.dataElab;
/*     */   }
/*     */   public void setDataElab(Date dataElab) {
/* 256 */     this.dataElab = dataElab;
/*     */   }
/*     */   public String getDescError() {
/* 259 */     return this.descError;
/*     */   }
/*     */   public void setDescError(String descError) {
/* 262 */     this.descError = descError;
/*     */   }
/*     */   public String getCodFondo() {
/* 265 */     return this.codFondo;
/*     */   }
/*     */   public void setCodFondo(String codFondo) {
/* 268 */     this.codFondo = codFondo;
/*     */   }
/*     */   public String getCodLinea() {
/* 271 */     return this.codLinea;
/*     */   }
/*     */   public void setCodLinea(String codLinea) {
/* 274 */     this.codLinea = codLinea;
/*     */   }
/*     */   public Integer getVersioneProdotto() {
/* 277 */     return this.versioneProdotto;
/*     */   }
/*     */   public void setVersioneProdotto(Integer versioneProdotto) {
/* 280 */     this.versioneProdotto = versioneProdotto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRBVitaMovimenti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */