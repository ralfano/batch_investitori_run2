/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TmpPantera
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private String rappContId;
/*     */   private String tipoRecord;
/*     */   private String versione;
/*     */   private String tipoOperazione;
/*     */   private String flagInviato;
/*     */   private String codPrcProd;
/*     */   private String codOper;
/*     */   private String complAnag;
/*     */   private String tipoAnagrafica;
/*     */   private String codiceSottoscrizione;
/*     */   private String ndgArco;
/*     */   private String tipoEvento;
/*     */   private String tipoPersona;
/*     */   private String denominazione;
/*     */   private String resNazione;
/*     */   private String resCodComune;
/*     */   private String resDesComune;
/*     */   private String resIndirizzo;
/*     */   private String resCap;
/*     */   private String codFiscale;
/*     */   private String nasComune;
/*     */   private String rae;
/*     */   private String sae;
/*     */   private String docTipo;
/*     */   private String docNum;
/*     */   private String docAutoritaRil;
/*     */   private String sesso;
/*     */   private String movcausaleUic;
/*     */   private String movSegno;
/*     */   private String movConnessione;
/*     */   private Integer contatoreInvio;
/*     */   private Integer progressivoInvio;
/*     */   private Integer prdAttivitaFin;
/*     */   private Integer prdProdotto;
/*     */   private Integer prdEmittente;
/*     */   private Integer recordId;
/*     */   private Double movImporto;
/*     */   private Date dataInvio;
/*     */   private Date dataRapporto;
/*     */   private Date nasData;
/*     */   private Date docDataRilascio;
/*     */   private String resProv;
/*     */   
/*     */   public String getCodFiscale() {
/*  57 */     return this.codFiscale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodFiscale(String codFiscale) {
/*  63 */     this.codFiscale = codFiscale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSottoscrizione() {
/*  69 */     return this.codiceSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSottoscrizione(String codiceSottoscrizione) {
/*  75 */     this.codiceSottoscrizione = codiceSottoscrizione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodOper() {
/*  81 */     return this.codOper;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodOper(String codOper) {
/*  87 */     this.codOper = codOper;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodPrcProd() {
/*  93 */     return this.codPrcProd;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodPrcProd(String codPrcProd) {
/*  99 */     this.codPrcProd = codPrcProd;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getComplAnag() {
/* 105 */     return this.complAnag;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComplAnag(String complAnag) {
/* 111 */     this.complAnag = complAnag;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getContatoreInvio() {
/* 117 */     return this.contatoreInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContatoreInvio(Integer contatoreInvio) {
/* 123 */     this.contatoreInvio = contatoreInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInvio() {
/* 129 */     return this.dataInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInvio(Date dataInvio) {
/* 135 */     this.dataInvio = dataInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRapporto() {
/* 141 */     return this.dataRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataRapporto(Date dataRapporto) {
/* 147 */     this.dataRapporto = dataRapporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDenominazione() {
/* 153 */     return this.denominazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 159 */     this.denominazione = denominazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDocAutoritaRil() {
/* 165 */     return this.docAutoritaRil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDocAutoritaRil(String docAutoritaRil) {
/* 171 */     this.docAutoritaRil = docAutoritaRil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDocDataRilascio() {
/* 177 */     return this.docDataRilascio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDocDataRilascio(Date docDataRilascio) {
/* 183 */     this.docDataRilascio = docDataRilascio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDocNum() {
/* 189 */     return this.docNum;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDocNum(String docNum) {
/* 195 */     this.docNum = docNum;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDocTipo() {
/* 201 */     return this.docTipo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDocTipo(String docTipo) {
/* 207 */     this.docTipo = docTipo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagInviato() {
/* 213 */     return this.flagInviato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagInviato(String flagInviato) {
/* 219 */     this.flagInviato = flagInviato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMovcausaleUic() {
/* 225 */     return this.movcausaleUic;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMovcausaleUic(String movcausaleUic) {
/* 231 */     this.movcausaleUic = movcausaleUic;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMovConnessione() {
/* 237 */     return this.movConnessione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMovConnessione(String movConnessione) {
/* 243 */     this.movConnessione = movConnessione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getMovImporto() {
/* 249 */     return this.movImporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMovImporto(Double movImporto) {
/* 255 */     this.movImporto = movImporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMovSegno() {
/* 261 */     return this.movSegno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMovSegno(String movSegno) {
/* 267 */     this.movSegno = movSegno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNasComune() {
/* 273 */     return this.nasComune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNasComune(String nasComune) {
/* 279 */     this.nasComune = nasComune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getNasData() {
/* 285 */     return this.nasData;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNasData(Date nasData) {
/* 291 */     this.nasData = nasData;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNdgArco() {
/* 297 */     return this.ndgArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdgArco(String ndgArco) {
/* 303 */     this.ndgArco = ndgArco;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPrdAttivitaFin() {
/* 309 */     return this.prdAttivitaFin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrdAttivitaFin(Integer prdAttivitaFin) {
/* 315 */     this.prdAttivitaFin = prdAttivitaFin;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPrdEmittente() {
/* 321 */     return this.prdEmittente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrdEmittente(Integer prdEmittente) {
/* 327 */     this.prdEmittente = prdEmittente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getPrdProdotto() {
/* 333 */     return this.prdProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrdProdotto(Integer prdProdotto) {
/* 339 */     this.prdProdotto = prdProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgressivoInvio() {
/* 345 */     return this.progressivoInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProgressivoInvio(Integer progressivoInvio) {
/* 351 */     this.progressivoInvio = progressivoInvio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRae() {
/* 357 */     return this.rae;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRae(String rae) {
/* 363 */     this.rae = rae;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRappContId() {
/* 369 */     return this.rappContId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRappContId(String rappContId) {
/* 375 */     this.rappContId = rappContId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getRecordId() {
/* 381 */     return this.recordId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRecordId(Integer recordId) {
/* 387 */     this.recordId = recordId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getResCap() {
/* 393 */     return this.resCap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setResCap(String resCap) {
/* 399 */     this.resCap = resCap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getResCodComune() {
/* 405 */     return this.resCodComune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setResCodComune(String resCodComune) {
/* 411 */     this.resCodComune = resCodComune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getResDesComune() {
/* 417 */     return this.resDesComune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setResDesComune(String resDesComune) {
/* 423 */     this.resDesComune = resDesComune;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getResIndirizzo() {
/* 429 */     return this.resIndirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setResIndirizzo(String resIndirizzo) {
/* 435 */     this.resIndirizzo = resIndirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getResNazione() {
/* 441 */     return this.resNazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setResNazione(String resNazione) {
/* 447 */     this.resNazione = resNazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSae() {
/* 453 */     return this.sae;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSae(String sae) {
/* 459 */     this.sae = sae;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSesso() {
/* 465 */     return this.sesso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSesso(String sesso) {
/* 471 */     this.sesso = sesso;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoAnagrafica() {
/* 477 */     return this.tipoAnagrafica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoAnagrafica(String tipoAnagrafica) {
/* 483 */     this.tipoAnagrafica = tipoAnagrafica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoEvento() {
/* 489 */     return this.tipoEvento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoEvento(String tipoEvento) {
/* 495 */     this.tipoEvento = tipoEvento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOperazione() {
/* 501 */     return this.tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 507 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoPersona() {
/* 513 */     return this.tipoPersona;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoPersona(String tipoPersona) {
/* 519 */     this.tipoPersona = tipoPersona;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRecord() {
/* 525 */     return this.tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRecord(String tipoRecord) {
/* 531 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVersione() {
/* 537 */     return this.versione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVersione(String versione) {
/* 543 */     this.versione = versione;
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
/*     */   public String getResProv() {
/* 555 */     return this.resProv;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setResProv(String resProv) {
/* 561 */     this.resProv = resProv;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\TmpPantera.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */