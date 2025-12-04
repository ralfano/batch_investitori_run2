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
/*     */ public class FinProiezionePolizzaAdapterBase
/*     */   extends FinProiezionePolizza
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
/*     */   public String getAliqRetrocessAccumAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "aliqRetrocessAccum", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setAliqRetrocessAccumAdp(String aliqRetrocessAccum) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "aliqRetrocessAccum", aliqRetrocessAccum, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getAliqRetrocessDiffAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "aliqRetrocessDiff", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setAliqRetrocessDiffAdp(String aliqRetrocessDiff) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "aliqRetrocessDiff", aliqRetrocessDiff, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCambioAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "cambio", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCambioAdp(String cambio) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "cambio", cambio, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleLordoDiff10Adp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "capitaleLordoDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleLordoDiff10Adp(String capitaleLordoDiff10) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "capitaleLordoDiff10", capitaleLordoDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleLordoDiff15Adp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "capitaleLordoDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleLordoDiff15Adp(String capitaleLordoDiff15) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "capitaleLordoDiff15", capitaleLordoDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleLordoDiff5Adp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "capitaleLordoDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleLordoDiff5Adp(String capitaleLordoDiff5) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "capitaleLordoDiff5", capitaleLordoDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleLordoScadAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "capitaleLordoScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleLordoScadAdp(String capitaleLordoScad) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "capitaleLordoScad", capitaleLordoScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinNettoDiff10Adp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "capitaleMinNettoDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinNettoDiff10Adp(String capitaleMinNettoDiff10) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "capitaleMinNettoDiff10", capitaleMinNettoDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinNettoDiff15Adp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "capitaleMinNettoDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinNettoDiff15Adp(String capitaleMinNettoDiff15) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "capitaleMinNettoDiff15", capitaleMinNettoDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinNettoDiff5Adp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "capitaleMinNettoDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinNettoDiff5Adp(String capitaleMinNettoDiff5) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "capitaleMinNettoDiff5", capitaleMinNettoDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinNettoScadAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "capitaleMinNettoScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinNettoScadAdp(String capitaleMinNettoScad) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "capitaleMinNettoScad", capitaleMinNettoScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinlordoDiff10Adp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "capitaleMinlordoDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinlordoDiff10Adp(String capitaleMinlordoDiff10) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "capitaleMinlordoDiff10", capitaleMinlordoDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinlordoDiff15Adp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "capitaleMinlordoDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinlordoDiff15Adp(String capitaleMinlordoDiff15) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "capitaleMinlordoDiff15", capitaleMinlordoDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinlordoDiff5Adp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "capitaleMinlordoDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinlordoDiff5Adp(String capitaleMinlordoDiff5) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "capitaleMinlordoDiff5", capitaleMinlordoDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMinlordoScadAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "capitaleMinlordoScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMinlordoScadAdp(String capitaleMinlordoScad) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "capitaleMinlordoScad", capitaleMinlordoScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleNettoDiff10Adp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "capitaleNettoDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleNettoDiff10Adp(String capitaleNettoDiff10) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "capitaleNettoDiff10", capitaleNettoDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleNettoDiff15Adp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "capitaleNettoDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleNettoDiff15Adp(String capitaleNettoDiff15) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "capitaleNettoDiff15", capitaleNettoDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleNettoDiff5Adp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "capitaleNettoDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleNettoDiff5Adp(String capitaleNettoDiff5) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "capitaleNettoDiff5", capitaleNettoDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleNettoScadAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "capitaleNettoScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleNettoScadAdp(String capitaleNettoScad) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "capitaleNettoScad", capitaleNettoScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodStGiuCtrAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "codStGiuCtr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodStGiuCtrAdp(String codStGiuCtr) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "codStGiuCtr", codStGiuCtr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodStOprCtrAdp() {
/* 247 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 248 */     return utils.getStringProperty(this, "codStOprCtr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodStOprCtrAdp(String codStOprCtr) {
/* 252 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 253 */     utils.setStringProperty(this, "codStOprCtr", codStOprCtr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodValutaAdp() {
/* 257 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 258 */     return utils.getStringProperty(this, "codValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodValutaAdp(String codValuta) {
/* 262 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 263 */     utils.setStringProperty(this, "codValuta", codValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCompagniaAdp() {
/* 267 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 268 */     return utils.getStringProperty(this, "compagnia", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCompagniaAdp(String compagnia) {
/* 272 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 273 */     utils.setStringProperty(this, "compagnia", compagnia, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataDecorrenzaContrAdp() {
/* 277 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 278 */     return utils.getStringProperty(this, "dataDecorrenzaContr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataDecorrenzaContrAdp(String dataDecorrenzaContr) {
/* 282 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 283 */     utils.setStringProperty(this, "dataDecorrenzaContr", dataDecorrenzaContr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataElaborazioneAdp() {
/* 287 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 288 */     return utils.getStringProperty(this, "dataElaborazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataElaborazioneAdp(String dataElaborazione) {
/* 292 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 293 */     utils.setStringProperty(this, "dataElaborazione", dataElaborazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataFinePagPremAdp() {
/* 297 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 298 */     return utils.getStringProperty(this, "dataFinePagPrem", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataFinePagPremAdp(String dataFinePagPrem) {
/* 302 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 303 */     utils.setStringProperty(this, "dataFinePagPrem", dataFinePagPrem, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInPagPremAdp() {
/* 307 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 308 */     return utils.getStringProperty(this, "dataInPagPrem", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInPagPremAdp(String dataInPagPrem) {
/* 312 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 313 */     utils.setStringProperty(this, "dataInPagPrem", dataInPagPrem, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/* 317 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 318 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/* 322 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 323 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataScadenzaContrAdp() {
/* 327 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 328 */     return utils.getStringProperty(this, "dataScadenzaContr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataScadenzaContrAdp(String dataScadenzaContr) {
/* 332 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 333 */     utils.setStringProperty(this, "dataScadenzaContr", dataScadenzaContr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/* 337 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 338 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 342 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 343 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 347 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 348 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 352 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 353 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getFlagCopPrincAdp() {
/* 357 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 358 */     return utils.getStringProperty(this, "flagCopPrinc", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setFlagCopPrincAdp(String flagCopPrinc) {
/* 362 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 363 */     utils.setStringProperty(this, "flagCopPrinc", flagCopPrinc, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPremiVersatiUnitAdp() {
/* 367 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 368 */     return utils.getStringProperty(this, "impPremiVersatiUnit", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPremiVersatiUnitAdp(String impPremiVersatiUnit) {
/* 372 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 373 */     utils.setStringProperty(this, "impPremiVersatiUnit", impPremiVersatiUnit, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoPremiVersatiAdp() {
/* 377 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 378 */     return utils.getStringProperty(this, "importoPremiVersati", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoPremiVersatiAdp(String importoPremiVersati) {
/* 382 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 383 */     utils.setStringProperty(this, "importoPremiVersati", importoPremiVersati, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImportoUltPremiVersAdp() {
/* 387 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 388 */     return utils.getStringProperty(this, "importoUltPremiVers", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImportoUltPremiVersAdp(String importoUltPremiVers) {
/* 392 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 393 */     utils.setStringProperty(this, "importoUltPremiVers", importoUltPremiVers, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getIpotesiIncremPremiAdp() {
/* 397 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 398 */     return utils.getStringProperty(this, "ipotesiIncremPremi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setIpotesiIncremPremiAdp(String ipotesiIncremPremi) {
/* 402 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 403 */     utils.setStringProperty(this, "ipotesiIncremPremi", ipotesiIncremPremi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getMaxAnniDasAdp() {
/* 407 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 408 */     return utils.getStringProperty(this, "maxAnniDas", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setMaxAnniDasAdp(String maxAnniDas) {
/* 412 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 413 */     utils.setStringProperty(this, "maxAnniDas", maxAnniDas, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPresta1BaseRAdp() {
/* 417 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 418 */     return utils.getStringProperty(this, "presta1BaseR", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPresta1BaseRAdp(String presta1BaseR) {
/* 422 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 423 */     utils.setStringProperty(this, "presta1BaseR", presta1BaseR, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPresta1BonusBaseRAdp() {
/* 427 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 428 */     return utils.getStringProperty(this, "presta1BonusBaseR", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPresta1BonusBaseRAdp(String presta1BonusBaseR) {
/* 432 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 433 */     utils.setStringProperty(this, "presta1BonusBaseR", presta1BonusBaseR, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPresta2BaseRAdp() {
/* 437 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 438 */     return utils.getStringProperty(this, "presta2BaseR", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPresta2BaseRAdp(String presta2BaseR) {
/* 442 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 443 */     utils.setStringProperty(this, "presta2BaseR", presta2BaseR, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPresta2BonusBaseRAdp() {
/* 447 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 448 */     return utils.getStringProperty(this, "presta2BonusBaseR", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPresta2BonusBaseRAdp(String presta2BonusBaseR) {
/* 452 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 453 */     utils.setStringProperty(this, "presta2BonusBaseR", presta2BonusBaseR, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPresta3BaseRAdp() {
/* 457 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 458 */     return utils.getStringProperty(this, "presta3BaseR", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPresta3BaseRAdp(String presta3BaseR) {
/* 462 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 463 */     utils.setStringProperty(this, "presta3BaseR", presta3BaseR, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPresta3BonusBaseRAdp() {
/* 467 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 468 */     return utils.getStringProperty(this, "presta3BonusBaseR", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPresta3BonusBaseRAdp(String presta3BonusBaseR) {
/* 472 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 473 */     utils.setStringProperty(this, "presta3BonusBaseR", presta3BonusBaseR, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getProgCopAdp() {
/* 477 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 478 */     return utils.getStringProperty(this, "progCop", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setProgCopAdp(String progCop) {
/* 482 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 483 */     utils.setStringProperty(this, "progCop", progCop, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getProiezionePolIdAdp() {
/* 487 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 488 */     return utils.getStringProperty(this, "proiezionePolId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setProiezionePolIdAdp(String proiezionePolId) {
/* 492 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 493 */     utils.setStringProperty(this, "proiezionePolId", proiezionePolId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getProvPortafoglioAdp() {
/* 497 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 498 */     return utils.getStringProperty(this, "provPortafoglio", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setProvPortafoglioAdp(String provPortafoglio) {
/* 502 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 503 */     utils.setStringProperty(this, "provPortafoglio", provPortafoglio, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRamoAdp() {
/* 507 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 508 */     return utils.getStringProperty(this, "ramo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRamoAdp(String ramo) {
/* 512 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 513 */     utils.setStringProperty(this, "ramo", ramo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenMingarTxTecnAccumAdp() {
/* 517 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 518 */     return utils.getStringProperty(this, "renMingarTxTecnAccum", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenMingarTxTecnAccumAdp(String renMingarTxTecnAccum) {
/* 522 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 523 */     utils.setStringProperty(this, "renMingarTxTecnAccum", renMingarTxTecnAccum, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenMingarTxTecnDiffAdp() {
/* 527 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 528 */     return utils.getStringProperty(this, "renMingarTxTecnDiff", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenMingarTxTecnDiffAdp(String renMingarTxTecnDiff) {
/* 532 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 533 */     utils.setStringProperty(this, "renMingarTxTecnDiff", renMingarTxTecnDiff, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRendMinTrattAccumAdp() {
/* 537 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 538 */     return utils.getStringProperty(this, "rendMinTrattAccum", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRendMinTrattAccumAdp(String rendMinTrattAccum) {
/* 542 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 543 */     utils.setStringProperty(this, "rendMinTrattAccum", rendMinTrattAccum, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRendMinTrattDiffAdp() {
/* 547 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 548 */     return utils.getStringProperty(this, "rendMinTrattDiff", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRendMinTrattDiffAdp(String rendMinTrattDiff) {
/* 552 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 553 */     utils.setStringProperty(this, "rendMinTrattDiff", rendMinTrattDiff, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRendimMinGarAccumAdp() {
/* 557 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 558 */     return utils.getStringProperty(this, "rendimMinGarAccum", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRendimMinGarAccumAdp(String rendimMinGarAccum) {
/* 562 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 563 */     utils.setStringProperty(this, "rendimMinGarAccum", rendimMinGarAccum, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRendimMinGarDiffAdp() {
/* 567 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 568 */     return utils.getStringProperty(this, "rendimMinGarDiff", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRendimMinGarDiffAdp(String rendimMinGarDiff) {
/* 572 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 573 */     utils.setStringProperty(this, "rendimMinGarDiff", rendimMinGarDiff, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRendimentoIsvapAdp() {
/* 577 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 578 */     return utils.getStringProperty(this, "rendimentoIsvap", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRendimentoIsvapAdp(String rendimentoIsvap) {
/* 582 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 583 */     utils.setStringProperty(this, "rendimentoIsvap", rendimentoIsvap, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizLordaDiff10Adp() {
/* 587 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 588 */     return utils.getStringProperty(this, "renditaInizLordaDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizLordaDiff10Adp(String renditaInizLordaDiff10) {
/* 592 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 593 */     utils.setStringProperty(this, "renditaInizLordaDiff10", renditaInizLordaDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizLordaDiff15Adp() {
/* 597 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 598 */     return utils.getStringProperty(this, "renditaInizLordaDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizLordaDiff15Adp(String renditaInizLordaDiff15) {
/* 602 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 603 */     utils.setStringProperty(this, "renditaInizLordaDiff15", renditaInizLordaDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizLordaDiff5Adp() {
/* 607 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 608 */     return utils.getStringProperty(this, "renditaInizLordaDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizLordaDiff5Adp(String renditaInizLordaDiff5) {
/* 612 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 613 */     utils.setStringProperty(this, "renditaInizLordaDiff5", renditaInizLordaDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizLordaScadAdp() {
/* 617 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 618 */     return utils.getStringProperty(this, "renditaInizLordaScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizLordaScadAdp(String renditaInizLordaScad) {
/* 622 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 623 */     utils.setStringProperty(this, "renditaInizLordaScad", renditaInizLordaScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizNettaDiff10Adp() {
/* 627 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 628 */     return utils.getStringProperty(this, "renditaInizNettaDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizNettaDiff10Adp(String renditaInizNettaDiff10) {
/* 632 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 633 */     utils.setStringProperty(this, "renditaInizNettaDiff10", renditaInizNettaDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizNettaDiff15Adp() {
/* 637 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 638 */     return utils.getStringProperty(this, "renditaInizNettaDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizNettaDiff15Adp(String renditaInizNettaDiff15) {
/* 642 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 643 */     utils.setStringProperty(this, "renditaInizNettaDiff15", renditaInizNettaDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizNettaDiff5Adp() {
/* 647 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 648 */     return utils.getStringProperty(this, "renditaInizNettaDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizNettaDiff5Adp(String renditaInizNettaDiff5) {
/* 652 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 653 */     utils.setStringProperty(this, "renditaInizNettaDiff5", renditaInizNettaDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaInizNettaScadAdp() {
/* 657 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 658 */     return utils.getStringProperty(this, "renditaInizNettaScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaInizNettaScadAdp(String renditaInizNettaScad) {
/* 662 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 663 */     utils.setStringProperty(this, "renditaInizNettaScad", renditaInizNettaScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaLordaAttesaoAdp() {
/* 667 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 668 */     return utils.getStringProperty(this, "renditaLordaAttesao", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaLordaAttesaoAdp(String renditaLordaAttesao) {
/* 672 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 673 */     utils.setStringProperty(this, "renditaLordaAttesao", renditaLordaAttesao, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMinInizLordaDiff10Adp() {
/* 677 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 678 */     return utils.getStringProperty(this, "renditaMinInizLordaDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMinInizLordaDiff10Adp(String renditaMinInizLordaDiff10) {
/* 682 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 683 */     utils.setStringProperty(this, "renditaMinInizLordaDiff10", renditaMinInizLordaDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMinInizLordaDiff15Adp() {
/* 687 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 688 */     return utils.getStringProperty(this, "renditaMinInizLordaDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMinInizLordaDiff15Adp(String renditaMinInizLordaDiff15) {
/* 692 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 693 */     utils.setStringProperty(this, "renditaMinInizLordaDiff15", renditaMinInizLordaDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMinInizLordaDiff5Adp() {
/* 697 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 698 */     return utils.getStringProperty(this, "renditaMinInizLordaDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMinInizLordaDiff5Adp(String renditaMinInizLordaDiff5) {
/* 702 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 703 */     utils.setStringProperty(this, "renditaMinInizLordaDiff5", renditaMinInizLordaDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMinInizLordaScadAdp() {
/* 707 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 708 */     return utils.getStringProperty(this, "renditaMinInizLordaScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMinInizLordaScadAdp(String renditaMinInizLordaScad) {
/* 712 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 713 */     utils.setStringProperty(this, "renditaMinInizLordaScad", renditaMinInizLordaScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMininizNettaDiff10Adp() {
/* 717 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 718 */     return utils.getStringProperty(this, "renditaMininizNettaDiff10", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMininizNettaDiff10Adp(String renditaMininizNettaDiff10) {
/* 722 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 723 */     utils.setStringProperty(this, "renditaMininizNettaDiff10", renditaMininizNettaDiff10, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMininizNettaDiff15Adp() {
/* 727 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 728 */     return utils.getStringProperty(this, "renditaMininizNettaDiff15", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMininizNettaDiff15Adp(String renditaMininizNettaDiff15) {
/* 732 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 733 */     utils.setStringProperty(this, "renditaMininizNettaDiff15", renditaMininizNettaDiff15, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMininizNettaDiff5Adp() {
/* 737 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 738 */     return utils.getStringProperty(this, "renditaMininizNettaDiff5", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMininizNettaDiff5Adp(String renditaMininizNettaDiff5) {
/* 742 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 743 */     utils.setStringProperty(this, "renditaMininizNettaDiff5", renditaMininizNettaDiff5, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMininizNettaScadAdp() {
/* 747 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 748 */     return utils.getStringProperty(this, "renditaMininizNettaScad", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMininizNettaScadAdp(String renditaMininizNettaScad) {
/* 752 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 753 */     utils.setStringProperty(this, "renditaMininizNettaScad", renditaMininizNettaScad, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaNettaAttesaoAdp() {
/* 757 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 758 */     return utils.getStringProperty(this, "renditaNettaAttesao", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaNettaAttesaoAdp(String renditaNettaAttesao) {
/* 762 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 763 */     utils.setStringProperty(this, "renditaNettaAttesao", renditaNettaAttesao, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRiportoPremiAdp() {
/* 767 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 768 */     return utils.getStringProperty(this, "riportoPremi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRiportoPremiAdp(String riportoPremi) {
/* 772 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 773 */     utils.setStringProperty(this, "riportoPremi", riportoPremi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRiservaMatemAccumAdp() {
/* 777 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 778 */     return utils.getStringProperty(this, "riservaMatemAccum", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRiservaMatemAccumAdp(String riservaMatemAccum) {
/* 782 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 783 */     utils.setStringProperty(this, "riservaMatemAccum", riservaMatemAccum, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRiservaMatemDiffAdp() {
/* 787 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 788 */     return utils.getStringProperty(this, "riservaMatemDiff", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRiservaMatemDiffAdp(String riservaMatemDiff) {
/* 792 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 793 */     utils.setStringProperty(this, "riservaMatemDiff", riservaMatemDiff, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTipoCopAdp() {
/* 797 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 798 */     return utils.getStringProperty(this, "tipoCop", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTipoCopAdp(String tipoCop) {
/* 802 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 803 */     utils.setStringProperty(this, "tipoCop", tipoCop, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTxTecnRenditaAccumAdp() {
/* 807 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 808 */     return utils.getStringProperty(this, "txTecnRenditaAccum", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTxTecnRenditaAccumAdp(String txTecnRenditaAccum) {
/* 812 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 813 */     utils.setStringProperty(this, "txTecnRenditaAccum", txTecnRenditaAccum, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTxTecnRenditaDiffAdp() {
/* 817 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 818 */     return utils.getStringProperty(this, "txTecnRenditaDiff", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTxTecnRenditaDiffAdp(String txTecnRenditaDiff) {
/* 822 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 823 */     utils.setStringProperty(this, "txTecnRenditaDiff", txTecnRenditaDiff, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTxTecnRenditaErogAdp() {
/* 827 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 828 */     return utils.getStringProperty(this, "txTecnRenditaErog", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTxTecnRenditaErogAdp(String txTecnRenditaErog) {
/* 832 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 833 */     utils.setStringProperty(this, "txTecnRenditaErog", txTecnRenditaErog, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltimaRendAnnuaLordaAdp() {
/* 837 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 838 */     return utils.getStringProperty(this, "ultimaRendAnnuaLorda", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltimaRendAnnuaLordaAdp(String ultimaRendAnnuaLorda) {
/* 842 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 843 */     utils.setStringProperty(this, "ultimaRendAnnuaLorda", ultimaRendAnnuaLorda, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltimaRendAnnuaNettaAdp() {
/* 847 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 848 */     return utils.getStringProperty(this, "ultimaRendAnnuaNetta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltimaRendAnnuaNettaAdp(String ultimaRendAnnuaNetta) {
/* 852 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 853 */     utils.setStringProperty(this, "ultimaRendAnnuaNetta", ultimaRendAnnuaNetta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinProiezionePolizzaAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */