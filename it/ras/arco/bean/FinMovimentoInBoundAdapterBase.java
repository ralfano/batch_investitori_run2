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
/*     */ public class FinMovimentoInBoundAdapterBase
/*     */   extends FinMovimentoInBound
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
/*     */   public String getCambioDivLorSuEurAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "cambioDivLorSuEur", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCambioDivLorSuEurAdp(String cambioDivLorSuEur) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "cambioDivLorSuEur", cambioDivLorSuEur, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodIstitutoAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "codIstituto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodIstitutoAdp(String codIstituto) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "codIstituto", codIstituto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodrgRamAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "codrgRam", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodrgRamAdp(String codrgRam) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "codrgRam", codrgRam, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommBcaCollocaAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "commBcaColloca", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommBcaCollocaAdp(String commBcaColloca) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "commBcaColloca", commBcaColloca, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommConversioneAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "commConversione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommConversioneAdp(String commConversione) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "commConversione", commConversione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommIngressoAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "commIngresso", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommIngressoAdp(String commIngresso) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "commIngresso", commIngresso, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommInterventoAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "commIntervento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommInterventoAdp(String commIntervento) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "commIntervento", commIntervento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommMantenimentoAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "commMantenimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommMantenimentoAdp(String commMantenimento) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "commMantenimento", commMantenimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommPerformanceAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "commPerformance", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommPerformanceAdp(String commPerformance) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "commPerformance", commPerformance, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommRimborsoAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "commRimborso", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommRimborsoAdp(String commRimborso) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "commRimborso", commRimborso, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommSocGestAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "commSocGest", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommSocGestAdp(String commSocGest) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "commSocGest", commSocGest, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommValutaAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "commValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommValutaAdp(String commValuta) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "commValuta", commValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCommissioneAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "commissione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCommissioneAdp(String commissione) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "commissione", commissione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCambioAdp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "dataCambio", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCambioAdp(String dataCambio) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "dataCambio", dataCambio, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCambioConfermAdp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "dataCambioConferm", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCambioConfermAdp(String dataCambioConferm) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "dataCambioConferm", dataCambioConferm, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCambioDivisaLordoAdp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "dataCambioDivisaLordo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCambioDivisaLordoAdp(String dataCambioDivisaLordo) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "dataCambioDivisaLordo", dataCambioDivisaLordo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCambioFiscAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "dataCambioFisc", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCambioFiscAdp(String dataCambioFisc) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "dataCambioFisc", dataCambioFisc, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCambioSwitchAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "dataCambioSwitch", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCambioSwitchAdp(String dataCambioSwitch) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "dataCambioSwitch", dataCambioSwitch, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataCaricamentoAdp() {
/* 247 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 248 */     return utils.getStringProperty(this, "dataCaricamento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataCaricamentoAdp(String dataCaricamento) {
/* 252 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 253 */     utils.setStringProperty(this, "dataCaricamento", dataCaricamento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataElaborazioneAdp() {
/* 257 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 258 */     return utils.getStringProperty(this, "dataElaborazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataElaborazioneAdp(String dataElaborazione) {
/* 262 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 263 */     utils.setStringProperty(this, "dataElaborazione", dataElaborazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataOperazioneAdp() {
/* 267 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 268 */     return utils.getStringProperty(this, "dataOperazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataOperazioneAdp(String dataOperazione) {
/* 272 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 273 */     utils.setStringProperty(this, "dataOperazione", dataOperazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataRegolamentoAdp() {
/* 277 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 278 */     return utils.getStringProperty(this, "dataRegolamento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataRegolamentoAdp(String dataRegolamento) {
/* 282 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 283 */     utils.setStringProperty(this, "dataRegolamento", dataRegolamento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataSottoscrizioneAdp() {
/* 287 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 288 */     return utils.getStringProperty(this, "dataSottoscrizione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataSottoscrizioneAdp(String dataSottoscrizione) {
/* 292 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 293 */     utils.setStringProperty(this, "dataSottoscrizione", dataSottoscrizione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataStornoAdp() {
/* 297 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 298 */     return utils.getStringProperty(this, "dataStorno", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataStornoAdp(String dataStorno) {
/* 302 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 303 */     utils.setStringProperty(this, "dataStorno", dataStorno, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/* 307 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 308 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 312 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 313 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 317 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 318 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 322 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 323 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataValutaAdp() {
/* 327 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 328 */     return utils.getStringProperty(this, "dataValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataValutaAdp(String dataValuta) {
/* 332 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 333 */     utils.setStringProperty(this, "dataValuta", dataValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getFlxIdAdp() {
/* 337 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 338 */     return utils.getStringProperty(this, "flxId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setFlxIdAdp(String flxId) {
/* 342 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 343 */     utils.setStringProperty(this, "flxId", flxId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getIdTempMovAdp() {
/* 347 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 348 */     return utils.getStringProperty(this, "idTempMov", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setIdTempMovAdp(String idTempMov) {
/* 352 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 353 */     utils.setStringProperty(this, "idTempMov", idTempMov, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpMinusvalFiscAdp() {
/* 357 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 358 */     return utils.getStringProperty(this, "impMinusvalFisc", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpMinusvalFiscAdp(String impMinusvalFisc) {
/* 362 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 363 */     utils.setStringProperty(this, "impMinusvalFisc", impMinusvalFisc, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPlusvalFiscAdp() {
/* 367 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 368 */     return utils.getStringProperty(this, "impPlusvalFisc", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPlusvalFiscAdp(String impPlusvalFisc) {
/* 372 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 373 */     utils.setStringProperty(this, "impPlusvalFisc", impPlusvalFisc, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoAdp() {
/* 377 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 378 */     return utils.getStringProperty(this, "importo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoAdp(String importo) {
/* 382 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 383 */     utils.setStringProperty(this, "importo", importo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoLordoValutaAdp() {
/* 387 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 388 */     return utils.getStringProperty(this, "importoLordoValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoLordoValutaAdp(String importoLordoValuta) {
/* 392 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 393 */     utils.setStringProperty(this, "importoLordoValuta", importoLordoValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoNettoAdp() {
/* 397 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 398 */     return utils.getStringProperty(this, "importoNetto", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoNettoAdp(String importoNetto) {
/* 402 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 403 */     utils.setStringProperty(this, "importoNetto", importoNetto, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoNettoValutaAdp() {
/* 407 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 408 */     return utils.getStringProperty(this, "importoNettoValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoNettoValutaAdp(String importoNettoValuta) {
/* 412 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 413 */     utils.setStringProperty(this, "importoNettoValuta", importoNettoValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getMovimentoinboundIdAdp() {
/* 417 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 418 */     return utils.getStringProperty(this, "movimentoinboundId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setMovimentoinboundIdAdp(String movimentoinboundId) {
/* 422 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 423 */     utils.setStringProperty(this, "movimentoinboundId", movimentoinboundId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNdispRamAdp() {
/* 427 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 428 */     return utils.getStringProperty(this, "ndispRam", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNdispRamAdp(String ndispRam) {
/* 432 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 433 */     utils.setStringProperty(this, "ndispRam", ndispRam, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumQuoCertAdp() {
/* 437 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 438 */     return utils.getStringProperty(this, "numQuoCert", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumQuoCertAdp(String numQuoCert) {
/* 442 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 443 */     utils.setStringProperty(this, "numQuoCert", numQuoCert, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumeroCertificatoAdp() {
/* 447 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 448 */     return utils.getStringProperty(this, "numeroCertificato", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumeroCertificatoAdp(String numeroCertificato) {
/* 452 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 453 */     utils.setStringProperty(this, "numeroCertificato", numeroCertificato, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumeroOperazioneSwitchAdp() {
/* 457 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 458 */     return utils.getStringProperty(this, "numeroOperazioneSwitch", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumeroOperazioneSwitchAdp(String numeroOperazioneSwitch) {
/* 462 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 463 */     utils.setStringProperty(this, "numeroOperazioneSwitch", numeroOperazioneSwitch, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumeroRateAdp() {
/* 467 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 468 */     return utils.getStringProperty(this, "numeroRate", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumeroRateAdp(String numeroRate) {
/* 472 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 473 */     utils.setStringProperty(this, "numeroRate", numeroRate, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumeroRecordAdp() {
/* 477 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 478 */     return utils.getStringProperty(this, "numeroRecord", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumeroRecordAdp(String numeroRecord) {
/* 482 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 483 */     utils.setStringProperty(this, "numeroRecord", numeroRecord, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrezzoAdp() {
/* 487 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 488 */     return utils.getStringProperty(this, "prezzo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrezzoAdp(String prezzo) {
/* 492 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 493 */     utils.setStringProperty(this, "prezzo", prezzo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrezzoValutaAdp() {
/* 497 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 498 */     return utils.getStringProperty(this, "prezzoValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrezzoValutaAdp(String prezzoValuta) {
/* 502 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 503 */     utils.setStringProperty(this, "prezzoValuta", prezzoValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getProgInvioCollocatoreAdp() {
/* 507 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 508 */     return utils.getStringProperty(this, "progInvioCollocatore", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setProgInvioCollocatoreAdp(String progInvioCollocatore) {
/* 512 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 513 */     utils.setStringProperty(this, "progInvioCollocatore", progInvioCollocatore, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getQuantitaAdp() {
/* 517 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 518 */     return utils.getStringProperty(this, "quantita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setQuantitaAdp(String quantita) {
/* 522 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 523 */     utils.setStringProperty(this, "quantita", quantita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getQuoLibContAdp() {
/* 527 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 528 */     return utils.getStringProperty(this, "quoLibCont", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setQuoLibContAdp(String quoLibCont) {
/* 532 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 533 */     utils.setStringProperty(this, "quoLibCont", quoLibCont, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRitenutaFiscAdp() {
/* 537 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 538 */     return utils.getStringProperty(this, "ritenutaFisc", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRitenutaFiscAdp(String ritenutaFisc) {
/* 542 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 543 */     utils.setStringProperty(this, "ritenutaFisc", ritenutaFisc, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRitenutaFiscValutaAdp() {
/* 547 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 548 */     return utils.getStringProperty(this, "ritenutaFiscValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRitenutaFiscValutaAdp(String ritenutaFiscValuta) {
/* 552 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 553 */     utils.setStringProperty(this, "ritenutaFiscValuta", ritenutaFiscValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getScontoQuoteTunnelAdp() {
/* 557 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 558 */     return utils.getStringProperty(this, "scontoQuoteTunnel", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setScontoQuoteTunnelAdp(String scontoQuoteTunnel) {
/* 562 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 563 */     utils.setStringProperty(this, "scontoQuoteTunnel", scontoQuoteTunnel, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSottoscrizioneIdAdp() {
/* 567 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 568 */     return utils.getStringProperty(this, "sottoscrizioneId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSottoscrizioneIdAdp(String sottoscrizioneId) {
/* 572 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 573 */     utils.setStringProperty(this, "sottoscrizioneId", sottoscrizioneId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseBcaCollocaAdp() {
/* 577 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 578 */     return utils.getStringProperty(this, "speseBcaColloca", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseBcaCollocaAdp(String speseBcaColloca) {
/* 582 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 583 */     utils.setStringProperty(this, "speseBcaColloca", speseBcaColloca, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseBcaCorrAdp() {
/* 587 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 588 */     return utils.getStringProperty(this, "speseBcaCorr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseBcaCorrAdp(String speseBcaCorr) {
/* 592 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 593 */     utils.setStringProperty(this, "speseBcaCorr", speseBcaCorr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseEmisCertfAdp() {
/* 597 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 598 */     return utils.getStringProperty(this, "speseEmisCertf", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseEmisCertfAdp(String speseEmisCertf) {
/* 602 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 603 */     utils.setStringProperty(this, "speseEmisCertf", speseEmisCertf, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseFondoAdp() {
/* 607 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 608 */     return utils.getStringProperty(this, "speseFondo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseFondoAdp(String speseFondo) {
/* 612 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 613 */     utils.setStringProperty(this, "speseFondo", speseFondo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseGenericheAdp() {
/* 617 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 618 */     return utils.getStringProperty(this, "speseGeneriche", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseGenericheAdp(String speseGeneriche) {
/* 622 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 623 */     utils.setStringProperty(this, "speseGeneriche", speseGeneriche, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseGenericheValutaAdp() {
/* 627 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 628 */     return utils.getStringProperty(this, "speseGenericheValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseGenericheValutaAdp(String speseGenericheValuta) {
/* 632 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 633 */     utils.setStringProperty(this, "speseGenericheValuta", speseGenericheValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseSocGestAdp() {
/* 637 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 638 */     return utils.getStringProperty(this, "speseSocGest", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseSocGestAdp(String speseSocGest) {
/* 642 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 643 */     utils.setStringProperty(this, "speseSocGest", speseSocGest, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getSpeseTipoPagAdp() {
/* 647 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 648 */     return utils.getStringProperty(this, "speseTipoPag", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setSpeseTipoPagAdp(String speseTipoPag) {
/* 652 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 653 */     utils.setStringProperty(this, "speseTipoPag", speseTipoPag, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTasseAdp() {
/* 657 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 658 */     return utils.getStringProperty(this, "tasse", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTasseAdp(String tasse) {
/* 662 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 663 */     utils.setStringProperty(this, "tasse", tasse, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTassoCambioSwitchAdp() {
/* 667 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 668 */     return utils.getStringProperty(this, "tassoCambioSwitch", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTassoCambioSwitchAdp(String tassoCambioSwitch) {
/* 672 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 673 */     utils.setStringProperty(this, "tassoCambioSwitch", tassoCambioSwitch, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTipoOperazioneAdp() {
/* 677 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 678 */     return utils.getStringProperty(this, "tipoOperazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTipoOperazioneAdp(String tipoOperazione) {
/* 682 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 683 */     utils.setStringProperty(this, "tipoOperazione", tipoOperazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTipoRecordAdp() {
/* 687 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 688 */     return utils.getStringProperty(this, "tipoRecord", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTipoRecordAdp(String tipoRecord) {
/* 692 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 693 */     utils.setStringProperty(this, "tipoRecord", tipoRecord, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinMovimentoInBoundAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */