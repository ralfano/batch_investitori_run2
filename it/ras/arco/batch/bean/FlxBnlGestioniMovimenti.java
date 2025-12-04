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
/*     */ public class FlxBnlGestioniMovimenti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer numAccordo;
/*     */   private String codProd;
/*     */   private Integer numProgope;
/*     */   private Integer numMovisgr;
/*     */   private Integer codMovimmen;
/*     */   private Integer codSportel;
/*     */   private Date dataOperaz;
/*     */   private Date dataValuta;
/*     */   private Date dataRegolam;
/*     */   private Integer codParteci;
/*     */   private String codOperatore;
/*     */   private String canale;
/*     */   private String modPagamento;
/*     */   private String codDivisa;
/*     */   private String segnoImp;
/*     */   private Double importo;
/*     */   private Double importoComm;
/*     */   private Double importoSpese;
/*     */   private Double valoreQuote;
/*     */   private String segnoQuote;
/*     */   private Double numeroQuote;
/*     */   private String flagCertif;
/*     */   private Integer numCertifBnl;
/*     */   private Integer numCertifSgr;
/*     */   private Integer codAccorsw;
/*     */   private Integer numProopsw;
/*     */   private String codProdSwi;
/*     */   private Integer abi;
/*     */   private Integer cab;
/*     */   private Integer codSporBnl;
/*     */   private String flagChConto;
/*     */   private String numContoCo;
/*     */   private Double numQuoteTo;
/*     */   private Double numQuoteVi;
/*     */   private String numAssegno;
/*     */   private Double prezMedio;
/*     */   private String flgEsenzione;
/*     */   private String codFiscale;
/*     */   private String flgRiassegnato;
/*     */   private String descCausale;
/*     */   private String codLinea;
/*     */   private Integer numMoviInv;
/*     */   private String filler;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private Integer tipoRecord;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxBnlGestioniMovimenti(Integer flxId, Integer numAccordo, String codProd, Integer numProgope, Integer numMovisgr, Integer codMovimmen, Integer codSportel, Date dataOperaz, Date dataValuta, Date dataRegolam, Integer codParteci, String codOperatore, String canale, String modPagamento, String codDivisa, String segnoImp, Double importo, Double importoComm, Double importoSpese, Double valoreQuote, String segnoQuote, Double numeroQuote, String flagCertif, Integer numCertifBnl, Integer numCertifSgr, Integer codAccorsw, Integer numProopsw, String codProdSwi, Integer abi, Integer cab, Integer codSporBnl, String flagChConto, String numContoCo, Double numQuoteTo, Double numQuoteVi, String numAssegno, Double prezMedio, String flgEsenzione, String codFiscale, String flgRiassegnato, String descCausale, String codLinea, Integer numMoviInv, String filler, String statoElab, String istanza, Date dataCaricamento, Integer tipoRecord, String descrizioneErrore, Date dataErrore) {
/* 166 */     this.flxId = flxId;
/* 167 */     this.numAccordo = numAccordo;
/* 168 */     this.codProd = codProd;
/* 169 */     this.numProgope = numProgope;
/* 170 */     this.numMovisgr = numMovisgr;
/* 171 */     this.codMovimmen = codMovimmen;
/* 172 */     this.codSportel = codSportel;
/* 173 */     this.dataOperaz = dataOperaz;
/* 174 */     this.dataValuta = dataValuta;
/* 175 */     this.dataRegolam = dataRegolam;
/* 176 */     this.codParteci = codParteci;
/* 177 */     this.codOperatore = codOperatore;
/* 178 */     this.canale = canale;
/* 179 */     this.modPagamento = modPagamento;
/* 180 */     this.codDivisa = codDivisa;
/* 181 */     this.segnoImp = segnoImp;
/* 182 */     this.importo = importo;
/* 183 */     this.importoComm = importoComm;
/* 184 */     this.importoSpese = importoSpese;
/* 185 */     this.valoreQuote = valoreQuote;
/* 186 */     this.segnoQuote = segnoQuote;
/* 187 */     this.numeroQuote = numeroQuote;
/* 188 */     this.flagCertif = flagCertif;
/* 189 */     this.numCertifBnl = numCertifBnl;
/* 190 */     this.numCertifSgr = numCertifSgr;
/* 191 */     this.codAccorsw = codAccorsw;
/* 192 */     this.numProopsw = numProopsw;
/* 193 */     this.codProdSwi = codProdSwi;
/* 194 */     this.abi = abi;
/* 195 */     this.cab = cab;
/* 196 */     this.codSporBnl = codSporBnl;
/* 197 */     this.flagChConto = flagChConto;
/* 198 */     this.numContoCo = numContoCo;
/* 199 */     this.numQuoteTo = numQuoteTo;
/* 200 */     this.numQuoteVi = numQuoteVi;
/* 201 */     this.numAssegno = numAssegno;
/* 202 */     this.prezMedio = prezMedio;
/* 203 */     this.flgEsenzione = flgEsenzione;
/* 204 */     this.codFiscale = codFiscale;
/* 205 */     this.flgRiassegnato = flgRiassegnato;
/* 206 */     this.descCausale = descCausale;
/* 207 */     this.codLinea = codLinea;
/* 208 */     this.numMoviInv = numMoviInv;
/* 209 */     this.filler = filler;
/* 210 */     this.statoElab = statoElab;
/* 211 */     this.istanza = istanza;
/* 212 */     this.dataCaricamento = dataCaricamento;
/* 213 */     this.tipoRecord = tipoRecord;
/* 214 */     this.descrizioneErrore = descrizioneErrore;
/* 215 */     this.dataErrore = dataErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxBnlGestioniMovimenti() {}
/*     */ 
/*     */   
/*     */   public Integer getAbi() {
/* 223 */     return this.abi;
/*     */   }
/*     */   
/*     */   public void setAbi(Integer abi) {
/* 227 */     this.abi = abi;
/*     */   }
/*     */   
/*     */   public Integer getCab() {
/* 231 */     return this.cab;
/*     */   }
/*     */   
/*     */   public void setCab(Integer cab) {
/* 235 */     this.cab = cab;
/*     */   }
/*     */   
/*     */   public String getCanale() {
/* 239 */     return this.canale;
/*     */   }
/*     */   
/*     */   public void setCanale(String canale) {
/* 243 */     this.canale = canale;
/*     */   }
/*     */   
/*     */   public Integer getCodAccorsw() {
/* 247 */     return this.codAccorsw;
/*     */   }
/*     */   
/*     */   public void setCodAccorsw(Integer codAccorsw) {
/* 251 */     this.codAccorsw = codAccorsw;
/*     */   }
/*     */   
/*     */   public String getCodDivisa() {
/* 255 */     return this.codDivisa;
/*     */   }
/*     */   
/*     */   public void setCodDivisa(String codDivisa) {
/* 259 */     this.codDivisa = codDivisa;
/*     */   }
/*     */   
/*     */   public String getCodFiscale() {
/* 263 */     return this.codFiscale;
/*     */   }
/*     */   
/*     */   public void setCodFiscale(String codFiscale) {
/* 267 */     this.codFiscale = codFiscale;
/*     */   }
/*     */   
/*     */   public String getCodLinea() {
/* 271 */     return this.codLinea;
/*     */   }
/*     */   
/*     */   public void setCodLinea(String codLinea) {
/* 275 */     this.codLinea = codLinea;
/*     */   }
/*     */   
/*     */   public Integer getCodMovimmen() {
/* 279 */     return this.codMovimmen;
/*     */   }
/*     */   
/*     */   public void setCodMovimmen(Integer codMovimmen) {
/* 283 */     this.codMovimmen = codMovimmen;
/*     */   }
/*     */   
/*     */   public String getCodOperatore() {
/* 287 */     return this.codOperatore;
/*     */   }
/*     */   
/*     */   public void setCodOperatore(String codOperatore) {
/* 291 */     this.codOperatore = codOperatore;
/*     */   }
/*     */   
/*     */   public Integer getCodParteci() {
/* 295 */     return this.codParteci;
/*     */   }
/*     */   
/*     */   public void setCodParteci(Integer codParteci) {
/* 299 */     this.codParteci = codParteci;
/*     */   }
/*     */   
/*     */   public String getCodProd() {
/* 303 */     return this.codProd;
/*     */   }
/*     */   
/*     */   public void setCodProd(String codProd) {
/* 307 */     this.codProd = codProd;
/*     */   }
/*     */   
/*     */   public String getCodProdSwi() {
/* 311 */     return this.codProdSwi;
/*     */   }
/*     */   
/*     */   public void setCodProdSwi(String codProdSwi) {
/* 315 */     this.codProdSwi = codProdSwi;
/*     */   }
/*     */   
/*     */   public Integer getCodSporBnl() {
/* 319 */     return this.codSporBnl;
/*     */   }
/*     */   
/*     */   public void setCodSporBnl(Integer codSporBnl) {
/* 323 */     this.codSporBnl = codSporBnl;
/*     */   }
/*     */   
/*     */   public Integer getCodSportel() {
/* 327 */     return this.codSportel;
/*     */   }
/*     */   
/*     */   public void setCodSportel(Integer codSportel) {
/* 331 */     this.codSportel = codSportel;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 335 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 339 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDataOperaz() {
/* 343 */     return this.dataOperaz;
/*     */   }
/*     */   
/*     */   public void setDataOperaz(Date dataOperaz) {
/* 347 */     this.dataOperaz = dataOperaz;
/*     */   }
/*     */   
/*     */   public Date getDataRegolam() {
/* 351 */     return this.dataRegolam;
/*     */   }
/*     */   
/*     */   public void setDataRegolam(Date dataRegolam) {
/* 355 */     this.dataRegolam = dataRegolam;
/*     */   }
/*     */   
/*     */   public Date getDataValuta() {
/* 359 */     return this.dataValuta;
/*     */   }
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 363 */     this.dataValuta = dataValuta;
/*     */   }
/*     */   
/*     */   public String getDescCausale() {
/* 367 */     return this.descCausale;
/*     */   }
/*     */   
/*     */   public void setDescCausale(String descCausale) {
/* 371 */     this.descCausale = descCausale;
/*     */   }
/*     */   
/*     */   public String getFiller() {
/* 375 */     return this.filler;
/*     */   }
/*     */   
/*     */   public void setFiller(String filler) {
/* 379 */     this.filler = filler;
/*     */   }
/*     */   
/*     */   public String getFlagCertif() {
/* 383 */     return this.flagCertif;
/*     */   }
/*     */   
/*     */   public void setFlagCertif(String flagCertif) {
/* 387 */     this.flagCertif = flagCertif;
/*     */   }
/*     */   
/*     */   public String getFlagChConto() {
/* 391 */     return this.flagChConto;
/*     */   }
/*     */   
/*     */   public void setFlagChConto(String flagChConto) {
/* 395 */     this.flagChConto = flagChConto;
/*     */   }
/*     */   
/*     */   public String getFlgEsenzione() {
/* 399 */     return this.flgEsenzione;
/*     */   }
/*     */   
/*     */   public void setFlgEsenzione(String flgEsenzione) {
/* 403 */     this.flgEsenzione = flgEsenzione;
/*     */   }
/*     */   
/*     */   public String getFlgRiassegnato() {
/* 407 */     return this.flgRiassegnato;
/*     */   }
/*     */   
/*     */   public void setFlgRiassegnato(String flgRiassegnato) {
/* 411 */     this.flgRiassegnato = flgRiassegnato;
/*     */   }
/*     */   
/*     */   public Double getImporto() {
/* 415 */     return this.importo;
/*     */   }
/*     */   
/*     */   public void setImporto(Double importo) {
/* 419 */     this.importo = importo;
/*     */   }
/*     */   
/*     */   public Double getImportoComm() {
/* 423 */     return this.importoComm;
/*     */   }
/*     */   
/*     */   public void setImportoComm(Double importoComm) {
/* 427 */     this.importoComm = importoComm;
/*     */   }
/*     */   
/*     */   public Double getImportoSpese() {
/* 431 */     return this.importoSpese;
/*     */   }
/*     */   
/*     */   public void setImportoSpese(Double importoSpese) {
/* 435 */     this.importoSpese = importoSpese;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 439 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 443 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getModPagamento() {
/* 447 */     return this.modPagamento;
/*     */   }
/*     */   
/*     */   public void setModPagamento(String modPagamento) {
/* 451 */     this.modPagamento = modPagamento;
/*     */   }
/*     */   
/*     */   public Integer getNumAccordo() {
/* 455 */     return this.numAccordo;
/*     */   }
/*     */   
/*     */   public void setNumAccordo(Integer numAccordo) {
/* 459 */     this.numAccordo = numAccordo;
/*     */   }
/*     */   
/*     */   public String getNumAssegno() {
/* 463 */     return this.numAssegno;
/*     */   }
/*     */   
/*     */   public void setNumAssegno(String numAssegno) {
/* 467 */     this.numAssegno = numAssegno;
/*     */   }
/*     */   
/*     */   public Integer getNumCertifBnl() {
/* 471 */     return this.numCertifBnl;
/*     */   }
/*     */   
/*     */   public void setNumCertifBnl(Integer numCertifBnl) {
/* 475 */     this.numCertifBnl = numCertifBnl;
/*     */   }
/*     */   
/*     */   public Integer getNumCertifSgr() {
/* 479 */     return this.numCertifSgr;
/*     */   }
/*     */   
/*     */   public void setNumCertifSgr(Integer numCertifSgr) {
/* 483 */     this.numCertifSgr = numCertifSgr;
/*     */   }
/*     */   
/*     */   public String getNumContoCo() {
/* 487 */     return this.numContoCo;
/*     */   }
/*     */   
/*     */   public void setNumContoCo(String numContoCo) {
/* 491 */     this.numContoCo = numContoCo;
/*     */   }
/*     */   
/*     */   public Double getNumeroQuote() {
/* 495 */     return this.numeroQuote;
/*     */   }
/*     */   
/*     */   public void setNumeroQuote(Double numeroQuote) {
/* 499 */     this.numeroQuote = numeroQuote;
/*     */   }
/*     */   
/*     */   public Integer getNumMoviInv() {
/* 503 */     return this.numMoviInv;
/*     */   }
/*     */   
/*     */   public void setNumMoviInv(Integer numMoviInv) {
/* 507 */     this.numMoviInv = numMoviInv;
/*     */   }
/*     */   
/*     */   public Integer getNumMovisgr() {
/* 511 */     return this.numMovisgr;
/*     */   }
/*     */   
/*     */   public void setNumMovisgr(Integer numMovisgr) {
/* 515 */     this.numMovisgr = numMovisgr;
/*     */   }
/*     */   
/*     */   public Integer getNumProgope() {
/* 519 */     return this.numProgope;
/*     */   }
/*     */   
/*     */   public void setNumProgope(Integer numProgope) {
/* 523 */     this.numProgope = numProgope;
/*     */   }
/*     */   
/*     */   public Integer getNumProopsw() {
/* 527 */     return this.numProopsw;
/*     */   }
/*     */   
/*     */   public void setNumProopsw(Integer numProopsw) {
/* 531 */     this.numProopsw = numProopsw;
/*     */   }
/*     */   
/*     */   public Double getNumQuoteTo() {
/* 535 */     return this.numQuoteTo;
/*     */   }
/*     */   
/*     */   public void setNumQuoteTo(Double numQuoteTo) {
/* 539 */     this.numQuoteTo = numQuoteTo;
/*     */   }
/*     */   
/*     */   public Double getNumQuoteVi() {
/* 543 */     return this.numQuoteVi;
/*     */   }
/*     */   
/*     */   public void setNumQuoteVi(Double numQuoteVi) {
/* 547 */     this.numQuoteVi = numQuoteVi;
/*     */   }
/*     */   
/*     */   public Double getPrezMedio() {
/* 551 */     return this.prezMedio;
/*     */   }
/*     */   
/*     */   public void setPrezMedio(Double prezMedio) {
/* 555 */     this.prezMedio = prezMedio;
/*     */   }
/*     */   
/*     */   public String getSegnoImp() {
/* 559 */     return this.segnoImp;
/*     */   }
/*     */   
/*     */   public void setSegnoImp(String segnoImp) {
/* 563 */     this.segnoImp = segnoImp;
/*     */   }
/*     */   
/*     */   public String getSegnoQuote() {
/* 567 */     return this.segnoQuote;
/*     */   }
/*     */   
/*     */   public void setSegnoQuote(String segnoQuote) {
/* 571 */     this.segnoQuote = segnoQuote;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/* 575 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 579 */     this.statoElab = statoElab;
/*     */   }
/*     */   
/*     */   public Integer getTipoRecord() {
/* 583 */     return this.tipoRecord;
/*     */   }
/*     */   
/*     */   public void setTipoRecord(Integer tipoRecord) {
/* 587 */     this.tipoRecord = tipoRecord;
/*     */   }
/*     */   
/*     */   public Double getValoreQuote() {
/* 591 */     return this.valoreQuote;
/*     */   }
/*     */   
/*     */   public void setValoreQuote(Double valoreQuote) {
/* 595 */     this.valoreQuote = valoreQuote;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 599 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 603 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Date getDataErrore() {
/* 607 */     return this.dataErrore;
/*     */   }
/*     */   public void setDataErrore(Date dataErrore) {
/* 610 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 613 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 616 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxBnlGestioniMovimenti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */