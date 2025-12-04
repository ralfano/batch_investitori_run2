/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang.StringUtils;
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
/*     */ public class FinDispPagamento
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private String flagImportoDaDefinire;
/*     */   private Date dataVersamento;
/*     */   private Date dataValuta;
/*     */   private Date dataValutaContoAfflussi;
/*     */   private String datiBanca;
/*     */   private Integer disposizioneId;
/*     */   private String mezzoPagamento;
/*     */   private String stato;
/*     */   private Date dataInserimentoD;
/*     */   private String numAssegno;
/*     */   private String abi;
/*     */   private String cab;
/*     */   private String numCc;
/*     */   private Double importo;
/*     */   private String codDispExt;
/*     */   private String descrizione;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Integer sottoscrizioneId;
/*     */   private FinDistintaAssegni distintaAssegni;
/*     */   private FinSottoscrizione sottoscrizione;
/*     */   private String tipoDestinatario;
/*     */   private Integer filialeCc;
/*     */   private Double percRipartizione;
/*     */   private String denominazione;
/*     */   private FinSoggetto soggetto;
/*     */   private FinIndirizzo indirizzo;
/*     */   private String numContratto;
/*     */   private FinEmittente emittente;
/*     */   private Set estrazioni;
/*     */   private String codSecOld;
/*     */   private String codPartAvvis;
/*     */   private String disposizioneIdSec;
/*     */   private String codiceSocieta;
/*     */   
/*     */   public FinDispPagamento() {}
/*     */   
/*     */   public FinDispPagamento(String abi, String cab, String ext, Date inserimento, Date inserimentoD, String descrizione, Integer id, Integer id2, Double importo, String pagamento, Integer id3, String assegno, String cc, Integer id4, String stato, String inserimento2, FinSottoscrizione sottoscrizione, String tipoDestinatario, String denominazione, Integer filialeCc, Double percRipartizione, FinSoggetto soggetto, String codiceSocieta) {
/*  97 */     this.abi = abi;
/*  98 */     this.cab = cab;
/*  99 */     this.codDispExt = ext;
/* 100 */     this.dataInserimento = inserimento;
/* 101 */     this.dataInserimentoD = inserimentoD;
/* 102 */     this.descrizione = descrizione;
/* 103 */     this.disposizioneId = id;
/*     */     
/* 105 */     this.importo = importo;
/* 106 */     this.mezzoPagamento = pagamento;
/*     */     
/* 108 */     this.numAssegno = assegno;
/* 109 */     this.numCc = cc;
/* 110 */     this.stato = stato;
/* 111 */     this.utenteInserimento = inserimento2;
/* 112 */     this.sottoscrizione = sottoscrizione;
/* 113 */     this.tipoDestinatario = tipoDestinatario;
/* 114 */     this.filialeCc = filialeCc;
/* 115 */     this.denominazione = denominazione;
/* 116 */     this.percRipartizione = percRipartizione;
/* 117 */     this.soggetto = soggetto;
/* 118 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */   
/*     */   public void setDatiBanca(String datiBanca) {
/* 122 */     this.datiBanca = datiBanca;
/*     */   }
/*     */   
/*     */   public String getDatiBanca() {
/* 126 */     return this.datiBanca;
/*     */   }
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 130 */     this.dataValuta = dataValuta;
/*     */   }
/*     */   
/*     */   public Date getDataValuta() {
/* 134 */     return this.dataValuta;
/*     */   }
/*     */   
/*     */   public void setDataVersamento(Date dataVersamento) {
/* 138 */     this.dataVersamento = dataVersamento;
/*     */   }
/*     */   
/*     */   public Date getDataVersamento() {
/* 142 */     return this.dataVersamento;
/*     */   }
/*     */   
/*     */   public String getFlagImportoDaDefinire() {
/* 146 */     return this.flagImportoDaDefinire;
/*     */   }
/*     */   
/*     */   public void setFlagImportoDaDefinire(String flagImportoDaDefinire) {
/* 150 */     this.flagImportoDaDefinire = flagImportoDaDefinire;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAbi() {
/* 157 */     return this.abi;
/*     */   }
/*     */   
/*     */   public void setAbi(String abi) {
/* 161 */     this.abi = abi;
/*     */   }
/*     */   
/*     */   public String getCab() {
/* 165 */     return this.cab;
/*     */   }
/*     */   
/*     */   public void setCab(String cab) {
/* 169 */     this.cab = cab;
/*     */   }
/*     */   
/*     */   public String getCodDispExt() {
/* 173 */     return this.codDispExt;
/*     */   }
/*     */   
/*     */   public void setCodDispExt(String codDispExt) {
/* 177 */     this.codDispExt = codDispExt;
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
/*     */   public Date getDataInserimentoD() {
/* 189 */     return this.dataInserimentoD;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoD(Date dataInserimentoD) {
/* 193 */     this.dataInserimentoD = dataInserimentoD;
/*     */   }
/*     */   
/*     */   public String getDescrizione() {
/* 197 */     return this.descrizione;
/*     */   }
/*     */   
/*     */   public void setDescrizione(String descrizione) {
/* 201 */     this.descrizione = descrizione;
/*     */   }
/*     */   
/*     */   public Integer getDisposizioneId() {
/* 205 */     return this.disposizioneId;
/*     */   }
/*     */   
/*     */   public void setDisposizioneId(Integer disposizioneId) {
/* 209 */     this.disposizioneId = disposizioneId;
/*     */   }
/*     */   
/*     */   public String getDenominazione() {
/* 213 */     return this.denominazione;
/*     */   }
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 217 */     this.denominazione = denominazione;
/*     */   }
/*     */   
/*     */   public Double getImporto() {
/* 221 */     return this.importo;
/*     */   }
/*     */   
/*     */   public void setImporto(Double importo) {
/* 225 */     this.importo = importo;
/*     */   }
/*     */   
/*     */   public String getMezzoPagamento() {
/* 229 */     return this.mezzoPagamento;
/*     */   }
/*     */   
/*     */   public void setMezzoPagamento(String mezzoPagamento) {
/* 233 */     this.mezzoPagamento = mezzoPagamento;
/*     */   }
/*     */   
/*     */   public String getNumAssegno() {
/* 237 */     return this.numAssegno;
/*     */   }
/*     */   
/*     */   public void setNumAssegno(String numAssegno) {
/* 241 */     this.numAssegno = numAssegno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumCc() {
/* 248 */     if (this.contoCorrente != null) {
/*     */       
/* 250 */       this.contoCorrente.getAssegnazione().size();
/* 251 */       String numeroRapporto = this.contoCorrente.getNumeroRapporto();
/* 252 */       if (ArchUtils.isValid(numeroRapporto)) {
/* 253 */         numeroRapporto = StringUtils.stripStart(numeroRapporto, "0");
/*     */       } else {
/* 255 */         numeroRapporto = "";
/*     */       } 
/* 257 */       return numeroRapporto;
/*     */     } 
/* 259 */     return this.numCc;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumCc(String numCc) {
/* 264 */     this.numCc = numCc;
/*     */   }
/*     */   
/*     */   public String getStato() {
/* 268 */     return this.stato;
/*     */   }
/*     */   
/*     */   public void setStato(String stato) {
/* 272 */     this.stato = stato;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 276 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 280 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public Integer getSottoscrizioneId() {
/* 284 */     return this.sottoscrizioneId;
/*     */   }
/*     */   
/*     */   public void setSottoscrizioneId(Integer sottoscrizioneId) {
/* 288 */     this.sottoscrizioneId = sottoscrizioneId;
/*     */   }
/*     */   
/*     */   public FinDistintaAssegni getDistintaAssegni() {
/* 292 */     return this.distintaAssegni;
/*     */   }
/*     */   
/*     */   public void setDistintaAssegni(FinDistintaAssegni distintaAssegni) {
/* 296 */     this.distintaAssegni = distintaAssegni;
/*     */   }
/*     */   
/*     */   public FinSottoscrizione getSottoscrizione() {
/* 300 */     return this.sottoscrizione;
/*     */   }
/*     */   
/*     */   public void setSottoscrizione(FinSottoscrizione sottoscrizione) {
/* 304 */     this.sottoscrizione = sottoscrizione;
/*     */   }
/*     */   
/*     */   public Integer getFilialeCc() {
/* 308 */     return this.filialeCc;
/*     */   }
/*     */   
/*     */   public void setFilialeCc(Integer filialeCc) {
/* 312 */     this.filialeCc = filialeCc;
/*     */   }
/*     */   
/*     */   public Double getPercRipartizione() {
/* 316 */     return this.percRipartizione;
/*     */   }
/*     */   
/*     */   public void setPercRipartizione(Double percRipartizione) {
/* 320 */     this.percRipartizione = percRipartizione;
/*     */   }
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 324 */     return this.soggetto;
/*     */   }
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 328 */     this.soggetto = soggetto;
/*     */   }
/*     */   
/*     */   public String getTipoDestinatario() {
/* 332 */     return this.tipoDestinatario;
/*     */   }
/*     */   
/*     */   public void setTipoDestinatario(String tipoDestinatario) {
/* 336 */     this.tipoDestinatario = tipoDestinatario;
/*     */   }
/*     */   
/*     */   public FinIndirizzo getIndirizzo() {
/* 340 */     return this.indirizzo;
/*     */   }
/*     */   
/*     */   public void setIndirizzo(FinIndirizzo indirizzo) {
/* 344 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinEmittente getEmittente() {
/* 351 */     return this.emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEmittente(FinEmittente emittente) {
/* 359 */     this.emittente = emittente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumContratto() {
/* 366 */     return this.numContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumContratto(String numContratto) {
/* 374 */     this.numContratto = numContratto;
/*     */   }
/*     */   
/*     */   public String getCodPartAvvis() {
/* 378 */     return this.codPartAvvis;
/*     */   }
/*     */   
/*     */   public void setCodPartAvvis(String codPartAvvis) {
/* 382 */     this.codPartAvvis = codPartAvvis;
/*     */   }
/*     */   
/*     */   public String getCodSecOld() {
/* 386 */     return this.codSecOld;
/*     */   }
/*     */   
/*     */   public void setCodSecOld(String codSecOld) {
/* 390 */     this.codSecOld = codSecOld;
/*     */   }
/*     */   
/*     */   public Set getEstrazioni() {
/* 394 */     return this.estrazioni;
/*     */   }
/*     */   
/*     */   public void setEstrazioni(Set estrazioni) {
/* 398 */     this.estrazioni = estrazioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDisposizioneIdSec() {
/* 405 */     return this.disposizioneIdSec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDisposizioneIdSec(String disposizioneIdSec) {
/* 413 */     this.disposizioneIdSec = disposizioneIdSec;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSocieta() {
/* 420 */     return this.codiceSocieta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSocieta(String codiceSocieta) {
/* 428 */     this.codiceSocieta = codiceSocieta;
/*     */   }
/*     */   
/* 431 */   private FinContrattoCC contoCorrente = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContrattoCC getContoCorrente() {
/* 437 */     return this.contoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContoCorrente(FinContrattoCC contoCorrente) {
/* 445 */     this.contoCorrente = contoCorrente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataValutaContoAfflussi() {
/* 452 */     return this.dataValutaContoAfflussi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataValutaContoAfflussi(Date dataValutaContoAfflussi) {
/* 458 */     this.dataValutaContoAfflussi = dataValutaContoAfflussi;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDispPagamento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */