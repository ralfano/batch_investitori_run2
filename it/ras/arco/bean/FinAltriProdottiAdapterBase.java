/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.adapter.AdapterUtils;
/*     */ import it.ras.flag.bean.adapter.IRasORMAdapter;
/*     */ import java.text.NumberFormat;
/*     */ import java.text.SimpleDateFormat;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinAltriProdottiAdapterBase
/*     */   extends FinAltriProdotti
/*     */   implements IRasORMAdapter
/*     */ {
/*     */   public String getStringProperty(String property) {
/*  18 */     return null;
/*     */   }
/*     */   
/*     */   public Object getProperty(String property) {
/*  22 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStringProperty(String property, String value) {}
/*     */ 
/*     */   
/*     */   public void setProperty(String property, Object value) {}
/*     */   
/*     */   public SimpleDateFormat getDateFormat(String property) {
/*  32 */     return null;
/*     */   }
/*     */   
/*     */   public NumberFormat getNumericFormat(String property) {
/*  36 */     return null;
/*     */   }
/*     */   
/*     */   public Object getAdapted() {
/*  40 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAltriProdottiIdAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "altriProdottiId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setAltriProdottiIdAdp(String altriProdottiId) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "altriProdottiId", altriProdottiId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getAttivitaFinIdAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "attivitaFinId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setAttivitaFinIdAdp(String attivitaFinId) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "attivitaFinId", attivitaFinId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleAScadenzaAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "capitaleAScadenza", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleAScadenzaAdp(String capitaleAScadenza) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "capitaleAScadenza", capitaleAScadenza, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodiceMovimentoAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "codiceMovimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodiceMovimentoAdp(String codiceMovimento) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "codiceMovimento", codiceMovimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodiceTitoloAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "codiceTitolo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodiceTitoloAdp(String codiceTitolo) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "codiceTitolo", codiceTitolo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommissioniAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "commissioni", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommissioniAdp(String commissioni) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "commissioni", commissioni, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getContrattoIdAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "contrattoId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setContrattoIdAdp(String contrattoId) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "contrattoId", contrattoId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataAnnullamentoAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "dataAnnullamento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataAnnullamentoAdp(String dataAnnullamento) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "dataAnnullamento", dataAnnullamento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataApprovazioneAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "dataApprovazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataApprovazioneAdp(String dataApprovazione) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "dataApprovazione", dataApprovazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataChiusuraAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "dataChiusura", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataChiusuraAdp(String dataChiusura) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "dataChiusura", dataChiusura, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataFinePlafondAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "dataFinePlafond", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataFinePlafondAdp(String dataFinePlafond) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "dataFinePlafond", dataFinePlafond, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataImpBaseProvAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "dataImpBaseProv", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataImpBaseProvAdp(String dataImpBaseProv) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "dataImpBaseProv", dataImpBaseProv, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoRecordAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "dataInserimentoRecord", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecordAdp(String dataInserimentoRecord) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "dataInserimentoRecord", dataInserimentoRecord, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataRegolamentoAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "dataRegolamento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataRegolamentoAdp(String dataRegolamento) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "dataRegolamento", dataRegolamento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataRicevimentoPropostaAdp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "dataRicevimentoProposta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataRicevimentoPropostaAdp(String dataRicevimentoProposta) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "dataRicevimentoProposta", dataRicevimentoProposta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataScadenzaAdp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "dataScadenza", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataScadenzaAdp(String dataScadenza) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "dataScadenza", dataScadenza, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataScadenzaRinnovoAdp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "dataScadenzaRinnovo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataScadenzaRinnovoAdp(String dataScadenzaRinnovo) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "dataScadenzaRinnovo", dataScadenzaRinnovo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataSottoscrizioneAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "dataSottoscrizione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataSottoscrizioneAdp(String dataSottoscrizione) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "dataSottoscrizione", dataSottoscrizione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 247 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 248 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 252 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 253 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDurataAdp() {
/* 257 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 258 */     return utils.getStringProperty(this, "durata", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDurataAdp(String durata) {
/* 262 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 263 */     utils.setStringProperty(this, "durata", durata, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoAssegnoAdp() {
/* 267 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 268 */     return utils.getStringProperty(this, "importoAssegno", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoAssegnoAdp(String importoAssegno) {
/* 272 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 273 */     utils.setStringProperty(this, "importoAssegno", importoAssegno, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoBaseProvAdp() {
/* 277 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 278 */     return utils.getStringProperty(this, "importoBaseProv", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoBaseProvAdp(String importoBaseProv) {
/* 282 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 283 */     utils.setStringProperty(this, "importoBaseProv", importoBaseProv, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoContrattoAdp() {
/* 287 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 288 */     return utils.getStringProperty(this, "importoContratto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoContrattoAdp(String importoContratto) {
/* 292 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 293 */     utils.setStringProperty(this, "importoContratto", importoContratto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoDaRimborsareAdp() {
/* 297 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 298 */     return utils.getStringProperty(this, "importoDaRimborsare", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoDaRimborsareAdp(String importoDaRimborsare) {
/* 302 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 303 */     utils.setStringProperty(this, "importoDaRimborsare", importoDaRimborsare, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoMutuoAdp() {
/* 307 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 308 */     return utils.getStringProperty(this, "importoMutuo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoMutuoAdp(String importoMutuo) {
/* 312 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 313 */     utils.setStringProperty(this, "importoMutuo", importoMutuo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoProgPagamentiAdp() {
/* 317 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 318 */     return utils.getStringProperty(this, "importoProgPagamenti", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoProgPagamentiAdp(String importoProgPagamenti) {
/* 322 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 323 */     utils.setStringProperty(this, "importoProgPagamenti", importoProgPagamenti, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoProvvRicorrenteAdp() {
/* 327 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 328 */     return utils.getStringProperty(this, "importoProvvRicorrente", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoProvvRicorrenteAdp(String importoProvvRicorrente) {
/* 332 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 333 */     utils.setStringProperty(this, "importoProvvRicorrente", importoProvvRicorrente, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoProvvigioneUtAdp() {
/* 337 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 338 */     return utils.getStringProperty(this, "importoProvvigioneUt", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoProvvigioneUtAdp(String importoProvvigioneUt) {
/* 342 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 343 */     utils.setStringProperty(this, "importoProvvigioneUt", importoProvvigioneUt, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoRichiestoAdp() {
/* 347 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 348 */     return utils.getStringProperty(this, "importoRichiesto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoRichiestoAdp(String importoRichiesto) {
/* 352 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 353 */     utils.setStringProperty(this, "importoRichiesto", importoRichiesto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoRimborsatoAdp() {
/* 357 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 358 */     return utils.getStringProperty(this, "importoRimborsato", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoRimborsatoAdp(String importoRimborsato) {
/* 362 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 363 */     utils.setStringProperty(this, "importoRimborsato", importoRimborsato, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoTotAdp() {
/* 367 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 368 */     return utils.getStringProperty(this, "importoTot", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoTotAdp(String importoTot) {
/* 372 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 373 */     utils.setStringProperty(this, "importoTot", importoTot, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getMinimoGarantitoUtAdp() {
/* 377 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 378 */     return utils.getStringProperty(this, "minimoGarantitoUt", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setMinimoGarantitoUtAdp(String minimoGarantitoUt) {
/* 382 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 383 */     utils.setStringProperty(this, "minimoGarantitoUt", minimoGarantitoUt, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumPezziAdp() {
/* 387 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 388 */     return utils.getStringProperty(this, "numPezzi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumPezziAdp(String numPezzi) {
/* 392 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 393 */     utils.setStringProperty(this, "numPezzi", numPezzi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumQuoteAdp() {
/* 397 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 398 */     return utils.getStringProperty(this, "numQuote", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumQuoteAdp(String numQuote) {
/* 402 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 403 */     utils.setStringProperty(this, "numQuote", numQuote, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPatrimonioGarantitoAdp() {
/* 407 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 408 */     return utils.getStringProperty(this, "patrimonioGarantito", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPatrimonioGarantitoAdp(String patrimonioGarantito) {
/* 412 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 413 */     utils.setStringProperty(this, "patrimonioGarantito", patrimonioGarantito, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPercCommAdp() {
/* 417 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 418 */     return utils.getStringProperty(this, "percComm", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPercCommAdp(String percComm) {
/* 422 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 423 */     utils.setStringProperty(this, "percComm", percComm, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPosizioneEsternaIdAdp() {
/* 427 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 428 */     return utils.getStringProperty(this, "posizioneEsternaId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPosizioneEsternaIdAdp(String posizioneEsternaId) {
/* 432 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 433 */     utils.setStringProperty(this, "posizioneEsternaId", posizioneEsternaId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getProdottoIdAdp() {
/* 437 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 438 */     return utils.getStringProperty(this, "prodottoId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setProdottoIdAdp(String prodottoId) {
/* 442 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 443 */     utils.setStringProperty(this, "prodottoId", prodottoId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPromotoreSplitIdAdp() {
/* 447 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 448 */     return utils.getStringProperty(this, "promotoreSplitId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPromotoreSplitIdAdp(String promotoreSplitId) {
/* 452 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 453 */     utils.setStringProperty(this, "promotoreSplitId", promotoreSplitId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSoggettoIntIdAdp() {
/* 457 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 458 */     return utils.getStringProperty(this, "soggettoIntId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSoggettoIntIdAdp(String soggettoIntId) {
/* 462 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 463 */     utils.setStringProperty(this, "soggettoIntId", soggettoIntId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseAdp() {
/* 467 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 468 */     return utils.getStringProperty(this, "spese", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseAdp(String spese) {
/* 472 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 473 */     utils.setStringProperty(this, "spese", spese, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSportelloBnlAdp() {
/* 477 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 478 */     return utils.getStringProperty(this, "sportelloBnl", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSportelloBnlAdp(String sportelloBnl) {
/* 482 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 483 */     utils.setStringProperty(this, "sportelloBnl", sportelloBnl, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTassoAdp() {
/* 487 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 488 */     return utils.getStringProperty(this, "tasso", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTassoAdp(String tasso) {
/* 492 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 493 */     utils.setStringProperty(this, "tasso", tasso, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getValoreQuotaAdp() {
/* 497 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 498 */     return utils.getStringProperty(this, "valoreQuota", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setValoreQuotaAdp(String valoreQuota) {
/* 502 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 503 */     utils.setStringProperty(this, "valoreQuota", valoreQuota, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAltriProdottiAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */