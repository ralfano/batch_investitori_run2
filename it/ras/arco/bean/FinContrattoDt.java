/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinContrattoDt
/*     */   extends FinContratto
/*     */   implements Serializable
/*     */ {
/*     */   private String prodottoDt;
/*     */   private String numContratto;
/*     */   private String filiale;
/*     */   private String derogaSegrBanc;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String rapportoCcAssociato;
/*     */   private String filialeD;
/*     */   private String categoriaD;
/*     */   private String categoria;
/*     */   private String numeroPratica;
/*     */   private String dossierD;
/*     */   private Date dataCtvl;
/*     */   private Double ctvlMercato;
/*     */   private Integer divisa;
/*     */   
/*     */   public FinContrattoDt() {}
/*     */   
/*     */   public String getCategoria() {
/*  37 */     return this.categoria;
/*     */   }
/*     */   public void setCategoria(String categoria) {
/*  40 */     this.categoria = categoria;
/*     */   }
/*     */   public String getCategoriaD() {
/*  43 */     return this.categoriaD;
/*     */   }
/*     */   public void setCategoriaD(String categoriaD) {
/*  46 */     this.categoriaD = categoriaD;
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
/*     */   public Date getDataInserimento() {
/*  59 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  62 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public String getDerogaSegrBanc() {
/*  65 */     return this.derogaSegrBanc;
/*     */   }
/*     */   public void setDerogaSegrBanc(String derogaSegrBanc) {
/*  68 */     this.derogaSegrBanc = derogaSegrBanc;
/*     */   }
/*     */   public String getDossierD() {
/*  71 */     return this.dossierD;
/*     */   }
/*     */   public void setDossierD(String dossierD) {
/*  74 */     this.dossierD = dossierD;
/*     */   }
/*     */   public String getFiliale() {
/*  77 */     return this.filiale;
/*     */   }
/*     */   public void setFiliale(String filiale) {
/*  80 */     this.filiale = filiale;
/*     */   }
/*     */   public String getFilialeD() {
/*  83 */     return this.filialeD;
/*     */   }
/*     */   public void setFilialeD(String filialeD) {
/*  86 */     this.filialeD = filialeD;
/*     */   }
/*     */   public String getNumContratto() {
/*  89 */     return this.numContratto;
/*     */   }
/*     */   public void setNumContratto(String numContratto) {
/*  92 */     this.numContratto = numContratto;
/*     */   }
/*     */   public String getNumeroPratica() {
/*  95 */     return this.numeroPratica;
/*     */   }
/*     */   public void setNumeroPratica(String numeroPratica) {
/*  98 */     this.numeroPratica = numeroPratica;
/*     */   }
/*     */   public String getRapportoCcAssociato() {
/* 101 */     return this.rapportoCcAssociato;
/*     */   }
/*     */   public void setRapportoCcAssociato(String rapportoCcAssociato) {
/* 104 */     this.rapportoCcAssociato = rapportoCcAssociato;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 107 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 110 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public Double getCtvlMercato() {
/* 113 */     return this.ctvlMercato;
/*     */   }
/*     */   public void setCtvlMercato(Double ctvlMercato) {
/* 116 */     this.ctvlMercato = ctvlMercato;
/*     */   }
/*     */   public Date getDataCtvl() {
/* 119 */     return this.dataCtvl;
/*     */   }
/*     */   public void setDataCtvl(Date dataCtvl) {
/* 122 */     this.dataCtvl = dataCtvl;
/*     */   }
/*     */   public Integer getDivisa() {
/* 125 */     return this.divisa;
/*     */   }
/*     */   public void setDivisa(Integer divisa) {
/* 128 */     this.divisa = divisa;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProdottoDt() {
/* 135 */     return this.prodottoDt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProdottoDt(String prodottoDt) {
/* 142 */     this.prodottoDt = prodottoDt;
/*     */   }
/*     */   
/*     */   public FinContrattoDt(Integer codiceEvidenza, Date dataInsConEvidenza, Date dataUltimoMovimento, String flagProvenienza, String codiceSconto, Date dataSottoscrizione, Date dataChiusura, Integer soggCoin, String numContratto, String dossierTecnico, Date dataApertura, String tipoProdotto, String statoContratto, String codConvenzione, Date dataInserimento, String utenteInserimento, String flagMulti, FinProdotto prodotto, Set posizione, Set ruolo, Set sottoscrizione, Set indirizzo, Set movimenti, FinCointestazione cointestazione, FinSoggetto soggetto, Set soggCointestazione, Set assegnazione, String categoria, String categoriad, Double mercato, Date ctvl, Date inserimento, String banc, Integer divisa, String dossierd, String filiale, String filialed, String contratto, String pratica, String dt, String associato, String inserimento2) {
/* 146 */     super(assegnazione, codiceEvidenza, dataInsConEvidenza, dataUltimoMovimento, flagProvenienza, codiceSconto, dataSottoscrizione, dataChiusura, soggCoin, numContratto, dossierTecnico, dataApertura, tipoProdotto, statoContratto, codConvenzione, dataInserimento, utenteInserimento, flagMulti, prodotto, posizione, ruolo, sottoscrizione, indirizzo, movimenti, cointestazione, soggetto, soggCointestazione, assegnazione);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 153 */     this.categoria = categoria;
/* 154 */     this.categoriaD = categoriad;
/* 155 */     this.ctvlMercato = mercato;
/* 156 */     this.dataCtvl = ctvl;
/* 157 */     dataInserimento = inserimento;
/* 158 */     this.derogaSegrBanc = banc;
/* 159 */     this.divisa = divisa;
/* 160 */     this.dossierD = dossierd;
/* 161 */     this.filiale = filiale;
/* 162 */     this.filialeD = filialed;
/* 163 */     numContratto = contratto;
/* 164 */     this.numeroPratica = pratica;
/* 165 */     this.prodottoDt = dt;
/* 166 */     this.rapportoCcAssociato = associato;
/* 167 */     utenteInserimento = inserimento2;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContrattoDt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */