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
/*     */ public class FlxServAttAnima
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Date dataRiferimento;
/*     */   private String tipoRichiesta;
/*     */   private String codiceFondo;
/*     */   private Integer numeroRifSocieta;
/*     */   private String numeroContratto;
/*     */   private String tipoContratto;
/*     */   private String frequenza;
/*     */   private Date dataInizio;
/*     */   private Date dataFineRevoca;
/*     */   private Date giornoDiRiferimento;
/*     */   private Double importo;
/*     */   private Double numeroQuote;
/*     */   private Double rataUnitaria;
/*     */   private Integer numeroRateInPagamento;
/*     */   private String codiceFondoSr;
/*     */   private String numeroRifSocietaSr;
/*     */   private String numeroContrattoSr;
/*     */   private String tipoContrattoSr;
/*     */   private Integer scontoCommissioni;
/*     */   private String codiceRete;
/*     */   private String codicePromotore;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public String getCodiceFondo() {
/*  43 */     return this.codiceFondo;
/*     */   }
/*     */   public void setCodiceFondo(String codiceFondo) {
/*  46 */     this.codiceFondo = codiceFondo;
/*     */   }
/*     */   public String getCodiceFondoSr() {
/*  49 */     return this.codiceFondoSr;
/*     */   }
/*     */   public void setCodiceFondoSr(String codiceFondoSr) {
/*  52 */     this.codiceFondoSr = codiceFondoSr;
/*     */   }
/*     */   public String getCodicePromotore() {
/*  55 */     return this.codicePromotore;
/*     */   }
/*     */   public void setCodicePromotore(String codicePromotore) {
/*  58 */     this.codicePromotore = codicePromotore;
/*     */   }
/*     */   public String getCodiceRete() {
/*  61 */     return this.codiceRete;
/*     */   }
/*     */   public void setCodiceRete(String codiceRete) {
/*  64 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   public Date getDataFineRevoca() {
/*  67 */     return this.dataFineRevoca;
/*     */   }
/*     */   public void setDataFineRevoca(Date dataFineRevoca) {
/*  70 */     this.dataFineRevoca = dataFineRevoca;
/*     */   }
/*     */   public Date getDataInizio() {
/*  73 */     return this.dataInizio;
/*     */   }
/*     */   public void setDataInizio(Date dataInizio) {
/*  76 */     this.dataInizio = dataInizio;
/*     */   }
/*     */   public Date getDataRiferimento() {
/*  79 */     return this.dataRiferimento;
/*     */   }
/*     */   public void setDataRiferimento(Date dataRiferimento) {
/*  82 */     this.dataRiferimento = dataRiferimento;
/*     */   }
/*     */   public String getFrequenza() {
/*  85 */     return this.frequenza;
/*     */   }
/*     */   public void setFrequenza(String frequenza) {
/*  88 */     this.frequenza = frequenza;
/*     */   }
/*     */   public Date getGiornoDiRiferimento() {
/*  91 */     return this.giornoDiRiferimento;
/*     */   }
/*     */   public void setGiornoDiRiferimento(Date giornoDiRiferimento) {
/*  94 */     this.giornoDiRiferimento = giornoDiRiferimento;
/*     */   }
/*     */   public Double getImporto() {
/*  97 */     return this.importo;
/*     */   }
/*     */   public void setImporto(Double importo) {
/* 100 */     this.importo = importo;
/*     */   }
/*     */   public String getIstanza() {
/* 103 */     return this.istanza;
/*     */   }
/*     */   public void setIstanza(String istanza) {
/* 106 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNumeroContratto() {
/* 111 */     return this.numeroContratto;
/*     */   }
/*     */   public void setNumeroContratto(String numeroContratto) {
/* 114 */     this.numeroContratto = numeroContratto;
/*     */   }
/*     */   public String getNumeroContrattoSr() {
/* 117 */     return this.numeroContrattoSr;
/*     */   }
/*     */   public void setNumeroContrattoSr(String numeroContrattoSr) {
/* 120 */     this.numeroContrattoSr = numeroContrattoSr;
/*     */   }
/*     */   public Double getNumeroQuote() {
/* 123 */     return this.numeroQuote;
/*     */   }
/*     */   public void setNumeroQuote(Double numeroQuote) {
/* 126 */     this.numeroQuote = numeroQuote;
/*     */   }
/*     */   public Integer getNumeroRateInPagamento() {
/* 129 */     return this.numeroRateInPagamento;
/*     */   }
/*     */   public void setNumeroRateInPagamento(Integer numeroRateInPagamento) {
/* 132 */     this.numeroRateInPagamento = numeroRateInPagamento;
/*     */   }
/*     */   public Double getRataUnitaria() {
/* 135 */     return this.rataUnitaria;
/*     */   }
/*     */   public void setRataUnitaria(Double rataUnitaria) {
/* 138 */     this.rataUnitaria = rataUnitaria;
/*     */   }
/*     */   public Integer getScontoCommissioni() {
/* 141 */     return this.scontoCommissioni;
/*     */   }
/*     */   public void setScontoCommissioni(Integer scontoCommissioni) {
/* 144 */     this.scontoCommissioni = scontoCommissioni;
/*     */   }
/*     */   public String getStatoElab() {
/* 147 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 150 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getTipoContratto() {
/* 153 */     return this.tipoContratto;
/*     */   }
/*     */   public void setTipoContratto(String tipoContratto) {
/* 156 */     this.tipoContratto = tipoContratto;
/*     */   }
/*     */   public String getTipoContrattoSr() {
/* 159 */     return this.tipoContrattoSr;
/*     */   }
/*     */   public void setTipoContrattoSr(String tipoContrattoSr) {
/* 162 */     this.tipoContrattoSr = tipoContrattoSr;
/*     */   }
/*     */   public String getTipoRichiesta() {
/* 165 */     return this.tipoRichiesta;
/*     */   }
/*     */   public void setTipoRichiesta(String tipoRichiesta) {
/* 168 */     this.tipoRichiesta = tipoRichiesta;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxServAttAnima(String fondo, String sr, String promotore, String rete, Date revoca, Date inizio, Date riferimento, String frequenza, Date riferimento2, Double importo, String istanza, Integer societa, String sr2, String contratto, String sr3, Double quote, Integer pagamento, Double unitaria, Integer commissioni, String elab, String contratto2, String sr4, String richiesta, String descrizioneErrore, Date dataErrore) {
/* 173 */     this.codiceFondo = fondo;
/* 174 */     this.codiceFondoSr = sr;
/* 175 */     this.codicePromotore = promotore;
/* 176 */     this.codiceRete = rete;
/* 177 */     this.dataFineRevoca = revoca;
/* 178 */     this.dataInizio = inizio;
/* 179 */     this.dataRiferimento = riferimento;
/* 180 */     this.frequenza = frequenza;
/* 181 */     this.giornoDiRiferimento = riferimento2;
/* 182 */     this.importo = importo;
/* 183 */     this.istanza = istanza;
/* 184 */     this.numeroRifSocieta = societa;
/* 185 */     this.numeroRifSocietaSr = sr2;
/* 186 */     this.numeroContratto = contratto;
/* 187 */     this.numeroContrattoSr = sr3;
/* 188 */     this.numeroQuote = quote;
/* 189 */     this.numeroRateInPagamento = pagamento;
/* 190 */     this.rataUnitaria = unitaria;
/* 191 */     this.scontoCommissioni = commissioni;
/* 192 */     this.statoElab = elab;
/* 193 */     this.tipoContratto = contratto2;
/* 194 */     this.tipoContrattoSr = sr4;
/* 195 */     this.tipoRichiesta = richiesta;
/* 196 */     this.descrizioneErrore = descrizioneErrore;
/* 197 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public Integer getFlxId() {
/* 200 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 203 */     this.flxId = flxId;
/*     */   }
/*     */   public Integer getNumeroRifSocieta() {
/* 206 */     return this.numeroRifSocieta;
/*     */   }
/*     */   public void setNumeroRifSocieta(Integer numeroRifSocieta) {
/* 209 */     this.numeroRifSocieta = numeroRifSocieta;
/*     */   }
/*     */   public String getNumeroRifSocietaSr() {
/* 212 */     return this.numeroRifSocietaSr;
/*     */   }
/*     */   public void setNumeroRifSocietaSr(String numeroRifSocietaSr) {
/* 215 */     this.numeroRifSocietaSr = numeroRifSocietaSr;
/*     */   }
/*     */   public Date getDataErrore() {
/* 218 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 221 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 224 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 227 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public FlxServAttAnima() {}
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxServAttAnima.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */