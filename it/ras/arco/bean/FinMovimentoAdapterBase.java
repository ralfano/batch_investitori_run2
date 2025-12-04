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
/*     */ public class FinMovimentoAdapterBase
/*     */   extends FinMovimento
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
/*     */   public String getCambioAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "cambio", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCambioAdp(String cambio) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "cambio", cambio, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCambioCommissioniAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "cambioCommissioni", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCambioCommissioniAdp(String cambioCommissioni) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "cambioCommissioni", cambioCommissioni, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCambioNettoAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "cambioNetto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCambioNettoAdp(String cambioNetto) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "cambioNetto", cambioNetto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommissioniAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "commissioni", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommissioniAdp(String commissioni) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "commissioni", commissioni, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommissioniValutaAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "commissioniValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommissioniValutaAdp(String commissioniValuta) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "commissioniValuta", commissioniValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCtvLordoAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "ctvLordo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCtvLordoAdp(String ctvLordo) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "ctvLordo", ctvLordo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCtvNettoAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "ctvNetto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCtvNettoAdp(String ctvNetto) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "ctvNetto", ctvNetto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCompetenzaAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "dataCompetenza", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCompetenzaAdp(String dataCompetenza) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "dataCompetenza", dataCompetenza, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataEsecuzioneAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "dataEsecuzione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataEsecuzioneAdp(String dataEsecuzione) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "dataEsecuzione", dataEsecuzione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataMovimentoAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "dataMovimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataMovimentoAdp(String dataMovimento) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "dataMovimento", dataMovimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataNAVAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "dataNAV", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataNAVAdp(String dataNAV) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "dataNAV", dataNAV, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataRegistrazAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "dataRegistraz", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataRegistrazAdp(String dataRegistraz) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "dataRegistraz", dataRegistraz, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataRegolamentoAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "dataRegolamento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataRegolamentoAdp(String dataRegolamento) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "dataRegolamento", dataRegolamento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataStornoAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "dataStorno", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataStornoAdp(String dataStorno) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "dataStorno", dataStorno, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataValutaAdp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "dataValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataValutaAdp(String dataValuta) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "dataValuta", dataValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataValutaNettoAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "dataValutaNetto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataValutaNettoAdp(String dataValutaNetto) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "dataValutaNetto", dataValutaNetto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpGiroconLordoAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "impGiroconLordo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpGiroconLordoAdp(String impGiroconLordo) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "impGiroconLordo", impGiroconLordo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpGiroconNettoAdp() {
/* 247 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 248 */     return utils.getStringProperty(this, "impGiroconNetto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpGiroconNettoAdp(String impGiroconNetto) {
/* 252 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 253 */     utils.setStringProperty(this, "impGiroconNetto", impGiroconNetto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPrelevLordoAdp() {
/* 257 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 258 */     return utils.getStringProperty(this, "impPrelevLordo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPrelevLordoAdp(String impPrelevLordo) {
/* 262 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 263 */     utils.setStringProperty(this, "impPrelevLordo", impPrelevLordo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPrelevNettoAdp() {
/* 267 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 268 */     return utils.getStringProperty(this, "impPrelevNetto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPrelevNettoAdp(String impPrelevNetto) {
/* 272 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 273 */     utils.setStringProperty(this, "impPrelevNetto", impPrelevNetto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpVersatoLordoAdp() {
/* 277 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 278 */     return utils.getStringProperty(this, "impVersatoLordo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpVersatoLordoAdp(String impVersatoLordo) {
/* 282 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 283 */     utils.setStringProperty(this, "impVersatoLordo", impVersatoLordo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpVersatoNettoAdp() {
/* 287 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 288 */     return utils.getStringProperty(this, "impVersatoNetto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpVersatoNettoAdp(String impVersatoNetto) {
/* 292 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 293 */     utils.setStringProperty(this, "impVersatoNetto", impVersatoNetto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoAdp() {
/* 297 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 298 */     return utils.getStringProperty(this, "importo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoAdp(String importo) {
/* 302 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 303 */     utils.setStringProperty(this, "importo", importo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoNettoValutaAdp() {
/* 307 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 308 */     return utils.getStringProperty(this, "importoNettoValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoNettoValutaAdp(String importoNettoValuta) {
/* 312 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 313 */     utils.setStringProperty(this, "importoNettoValuta", importoNettoValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getMovimentoIdAdp() {
/* 317 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 318 */     return utils.getStringProperty(this, "movimentoId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setMovimentoIdAdp(String movimentoId) {
/* 322 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 323 */     utils.setStringProperty(this, "movimentoId", movimentoId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNmRatePagPrecAdp() {
/* 327 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 328 */     return utils.getStringProperty(this, "nmRatePagPrec", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNmRatePagPrecAdp(String nmRatePagPrec) {
/* 332 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 333 */     utils.setStringProperty(this, "nmRatePagPrec", nmRatePagPrec, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNmRatePagVersAdp() {
/* 337 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 338 */     return utils.getStringProperty(this, "nmRatePagVers", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNmRatePagVersAdp(String nmRatePagVers) {
/* 342 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 343 */     utils.setStringProperty(this, "nmRatePagVers", nmRatePagVers, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumQuoteCertAdp() {
/* 347 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 348 */     return utils.getStringProperty(this, "numQuoteCert", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumQuoteCertAdp(String numQuoteCert) {
/* 352 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 353 */     utils.setStringProperty(this, "numQuoteCert", numQuoteCert, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrezzoAdp() {
/* 357 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 358 */     return utils.getStringProperty(this, "prezzo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrezzoAdp(String prezzo) {
/* 362 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 363 */     utils.setStringProperty(this, "prezzo", prezzo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrezzoValutaAdp() {
/* 367 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 368 */     return utils.getStringProperty(this, "prezzoValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrezzoValutaAdp(String prezzoValuta) {
/* 372 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 373 */     utils.setStringProperty(this, "prezzoValuta", prezzoValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPromotoreIdAdp() {
/* 377 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 378 */     return utils.getStringProperty(this, "promotoreId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPromotoreIdAdp(String promotoreId) {
/* 382 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 383 */     utils.setStringProperty(this, "promotoreId", promotoreId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getQuantitaAdp() {
/* 387 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 388 */     return utils.getStringProperty(this, "quantita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setQuantitaAdp(String quantita) {
/* 392 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 393 */     utils.setStringProperty(this, "quantita", quantita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getScontoTunnelAdp() {
/* 397 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 398 */     return utils.getStringProperty(this, "scontoTunnel", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setScontoTunnelAdp(String scontoTunnel) {
/* 402 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 403 */     utils.setStringProperty(this, "scontoTunnel", scontoTunnel, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseAdp() {
/* 407 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 408 */     return utils.getStringProperty(this, "spese", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseAdp(String spese) {
/* 412 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 413 */     utils.setStringProperty(this, "spese", spese, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseValutaAdp() {
/* 417 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 418 */     return utils.getStringProperty(this, "speseValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseValutaAdp(String speseValuta) {
/* 422 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 423 */     utils.setStringProperty(this, "speseValuta", speseValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTasseAdp() {
/* 427 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 428 */     return utils.getStringProperty(this, "tasse", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTasseAdp(String tasse) {
/* 432 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 433 */     utils.setStringProperty(this, "tasse", tasse, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTasseValutaAdp() {
/* 437 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 438 */     return utils.getStringProperty(this, "tasseValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTasseValutaAdp(String tasseValuta) {
/* 442 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 443 */     utils.setStringProperty(this, "tasseValuta", tasseValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinMovimentoAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */