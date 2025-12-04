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
/*     */ public class FinPremioPolizzaAdapterBase
/*     */   extends FinPremioPolizza
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
/*     */   public String getCapitaleDifferitoAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "capitaleDifferito", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleDifferitoAdp(String capitaleDifferito) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "capitaleDifferito", capitaleDifferito, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMaturatoCaAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "capitaleMaturatoCa", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMaturatoCaAdp(String capitaleMaturatoCa) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "capitaleMaturatoCa", capitaleMaturatoCa, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMaturatoCiAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "capitaleMaturatoCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMaturatoCiAdp(String capitaleMaturatoCi) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "capitaleMaturatoCi", capitaleMaturatoCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCapitaleMaturatoCuAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "capitaleMaturatoCu", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCapitaleMaturatoCuAdp(String capitaleMaturatoCu) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "capitaleMaturatoCu", capitaleMaturatoCu, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCmbUltRataEmeAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "cmbUltRataEme", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCmbUltRataEmeAdp(String cmbUltRataEme) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "cmbUltRataEme", cmbUltRataEme, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCmbUltRataPagAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "cmbUltRataPag", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCmbUltRataPagAdp(String cmbUltRataPag) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "cmbUltRataPag", cmbUltRataPag, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCmlPrmLrAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "cmlPrmLr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCmlPrmLrAdp(String cmlPrmLr) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "cmlPrmLr", cmlPrmLr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCmlPrmLrCiAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "cmlPrmLrCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCmlPrmLrCiAdp(String cmlPrmLrCi) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "cmlPrmLrCi", cmlPrmLrCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCmlPrmNtAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "cmlPrmNt", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCmlPrmNtAdp(String cmlPrmNt) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "cmlPrmNt", cmlPrmNt, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCmlPrmNtCiAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "cmlPrmNtCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCmlPrmNtCiAdp(String cmlPrmNtCi) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "cmlPrmNtCi", cmlPrmNtCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodTassaCiAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "codTassaCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodTassaCiAdp(String codTassaCi) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "codTassaCi", codTassaCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodTassaVitaAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "codTassaVita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodTassaVitaAdp(String codTassaVita) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "codTassaVita", codTassaVita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCostoComplInvAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "costoComplInv", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCostoComplInvAdp(String costoComplInv) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "costoComplInv", costoComplInv, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataElaborazioneAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "dataElaborazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataElaborazioneAdp(String dataElaborazione) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "dataElaborazione", dataElaborazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataRifValutaAdp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "dataRifValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataRifValutaAdp(String dataRifValuta) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "dataRifValuta", dataRifValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDirittiPerfAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "dirittiPerf", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDirittiPerfAdp(String dirittiPerf) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "dirittiPerf", dirittiPerf, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDirittiQuietAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "dirittiQuiet", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDirittiQuietAdp(String dirittiQuiet) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "dirittiQuiet", dirittiQuiet, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDtProxQuietAdp() {
/* 247 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 248 */     return utils.getStringProperty(this, "dtProxQuiet", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDtProxQuietAdp(String dtProxQuiet) {
/* 252 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 253 */     utils.setStringProperty(this, "dtProxQuiet", dtProxQuiet, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDtUltRataIncAdp() {
/* 257 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 258 */     return utils.getStringProperty(this, "dtUltRataInc", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDtUltRataIncAdp(String dtUltRataInc) {
/* 262 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 263 */     utils.setStringProperty(this, "dtUltRataInc", dtUltRataInc, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDtUltRataPagAdp() {
/* 267 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 268 */     return utils.getStringProperty(this, "dtUltRataPag", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDtUltRataPagAdp(String dtUltRataPag) {
/* 272 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 273 */     utils.setStringProperty(this, "dtUltRataPag", dtUltRataPag, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDtUltRtEmeAdp() {
/* 277 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 278 */     return utils.getStringProperty(this, "dtUltRtEme", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDtUltRtEmeAdp(String dtUltRtEme) {
/* 282 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 283 */     utils.setStringProperty(this, "dtUltRtEme", dtUltRtEme, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpCapAScadenzaAdp() {
/* 287 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 288 */     return utils.getStringProperty(this, "impCapAScadenza", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpCapAScadenzaAdp(String impCapAScadenza) {
/* 292 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 293 */     utils.setStringProperty(this, "impCapAScadenza", impCapAScadenza, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpCapLiquidatoAdp() {
/* 297 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 298 */     return utils.getStringProperty(this, "impCapLiquidato", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpCapLiquidatoAdp(String impCapLiquidato) {
/* 302 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 303 */     utils.setStringProperty(this, "impCapLiquidato", impCapLiquidato, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpCorrentePremiAnnuiAdp() {
/* 307 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 308 */     return utils.getStringProperty(this, "impCorrentePremiAnnui", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpCorrentePremiAnnuiAdp(String impCorrentePremiAnnui) {
/* 312 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 313 */     utils.setStringProperty(this, "impCorrentePremiAnnui", impCorrentePremiAnnui, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpCorrenteProvvAnnueAdp() {
/* 317 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 318 */     return utils.getStringProperty(this, "impCorrenteProvvAnnue", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpCorrenteProvvAnnueAdp(String impCorrenteProvvAnnue) {
/* 322 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 323 */     utils.setStringProperty(this, "impCorrenteProvvAnnue", impCorrenteProvvAnnue, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPremioAggAdp() {
/* 327 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 328 */     return utils.getStringProperty(this, "impPremioAgg", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPremioAggAdp(String impPremioAgg) {
/* 332 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 333 */     utils.setStringProperty(this, "impPremioAgg", impPremioAgg, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPremioAnnuoAdp() {
/* 337 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 338 */     return utils.getStringProperty(this, "impPremioAnnuo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPremioAnnuoAdp(String impPremioAnnuo) {
/* 342 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 343 */     utils.setStringProperty(this, "impPremioAnnuo", impPremioAnnuo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPremioUnicoAdp() {
/* 347 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 348 */     return utils.getStringProperty(this, "impPremioUnico", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPremioUnicoAdp(String impPremioUnico) {
/* 352 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 353 */     utils.setStringProperty(this, "impPremioUnico", impPremioUnico, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPrestConcCliAdp() {
/* 357 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 358 */     return utils.getStringProperty(this, "impPrestConcCli", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPrestConcCliAdp(String impPrestConcCli) {
/* 362 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 363 */     utils.setStringProperty(this, "impPrestConcCli", impPrestConcCli, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpPrestitoAdp() {
/* 367 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 368 */     return utils.getStringProperty(this, "impPrestito", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpPrestitoAdp(String impPrestito) {
/* 372 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 373 */     utils.setStringProperty(this, "impPrestito", impPrestito, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpRenditaAdp() {
/* 377 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 378 */     return utils.getStringProperty(this, "impRendita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpRenditaAdp(String impRendita) {
/* 382 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 383 */     utils.setStringProperty(this, "impRendita", impRendita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpRiservaMatAdp() {
/* 387 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 388 */     return utils.getStringProperty(this, "impRiservaMat", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpRiservaMatAdp(String impRiservaMat) {
/* 392 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 393 */     utils.setStringProperty(this, "impRiservaMat", impRiservaMat, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpSovrapprezzoGenerAdp() {
/* 397 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 398 */     return utils.getStringProperty(this, "impSovrapprezzoGener", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoGenerAdp(String impSovrapprezzoGener) {
/* 402 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 403 */     utils.setStringProperty(this, "impSovrapprezzoGener", impSovrapprezzoGener, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpSovrapprezzoProfAdp() {
/* 407 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 408 */     return utils.getStringProperty(this, "impSovrapprezzoProf", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoProfAdp(String impSovrapprezzoProf) {
/* 412 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 413 */     utils.setStringProperty(this, "impSovrapprezzoProf", impSovrapprezzoProf, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpSovrapprezzoSanitAdp() {
/* 417 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 418 */     return utils.getStringProperty(this, "impSovrapprezzoSanit", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoSanitAdp(String impSovrapprezzoSanit) {
/* 422 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 423 */     utils.setStringProperty(this, "impSovrapprezzoSanit", impSovrapprezzoSanit, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getImpSovrapprezzoSportAdp() {
/* 427 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 428 */     return utils.getStringProperty(this, "impSovrapprezzoSport", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setImpSovrapprezzoSportAdp(String impSovrapprezzoSport) {
/* 432 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 433 */     utils.setStringProperty(this, "impSovrapprezzoSport", impSovrapprezzoSport, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getIndiceInizValutaAdp() {
/* 437 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 438 */     return utils.getStringProperty(this, "indiceInizValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setIndiceInizValutaAdp(String indiceInizValuta) {
/* 442 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 443 */     utils.setStringProperty(this, "indiceInizValuta", indiceInizValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPartiValutaAdp() {
/* 447 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 448 */     return utils.getStringProperty(this, "partiValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPartiValutaAdp(String partiValuta) {
/* 452 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 453 */     utils.setStringProperty(this, "partiValuta", partiValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPercInvaliditaAdp() {
/* 457 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 458 */     return utils.getStringProperty(this, "percInvalidita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPercInvaliditaAdp(String percInvalidita) {
/* 462 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 463 */     utils.setStringProperty(this, "percInvalidita", percInvalidita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPremioPolizzaIdAdp() {
/* 467 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 468 */     return utils.getStringProperty(this, "premioPolizzaId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPremioPolizzaIdAdp(String premioPolizzaId) {
/* 472 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 473 */     utils.setStringProperty(this, "premioPolizzaId", premioPolizzaId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrestazInizialeAdp() {
/* 477 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 478 */     return utils.getStringProperty(this, "prestazIniziale", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrestazInizialeAdp(String prestazIniziale) {
/* 482 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 483 */     utils.setStringProperty(this, "prestazIniziale", prestazIniziale, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPriPrmPagAdp() {
/* 487 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 488 */     return utils.getStringProperty(this, "priPrmPag", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPriPrmPagAdp(String priPrmPag) {
/* 492 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 493 */     utils.setStringProperty(this, "priPrmPag", priPrmPag, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPriPrmPagCiAdp() {
/* 497 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 498 */     return utils.getStringProperty(this, "priPrmPagCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPriPrmPagCiAdp(String priPrmPagCi) {
/* 502 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 503 */     utils.setStringProperty(this, "priPrmPagCi", priPrmPagCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaDifferitaAdp() {
/* 507 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 508 */     return utils.getStringProperty(this, "renditaDifferita", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaDifferitaAdp(String renditaDifferita) {
/* 512 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 513 */     utils.setStringProperty(this, "renditaDifferita", renditaDifferita, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMaturataCaAdp() {
/* 517 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 518 */     return utils.getStringProperty(this, "renditaMaturataCa", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMaturataCaAdp(String renditaMaturataCa) {
/* 522 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 523 */     utils.setStringProperty(this, "renditaMaturataCa", renditaMaturataCa, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getRenditaMaturataCuAdp() {
/* 527 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 528 */     return utils.getStringProperty(this, "renditaMaturataCu", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setRenditaMaturataCuAdp(String renditaMaturataCu) {
/* 532 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 533 */     utils.setStringProperty(this, "renditaMaturataCu", renditaMaturataCu, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getTassoTariffaAdp() {
/* 537 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 538 */     return utils.getStringProperty(this, "tassoTariffa", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setTassoTariffaAdp(String tassoTariffa) {
/* 542 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 543 */     utils.setStringProperty(this, "tassoTariffa", tassoTariffa, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltPrmPagLrAdp() {
/* 547 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 548 */     return utils.getStringProperty(this, "ultPrmPagLr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltPrmPagLrAdp(String ultPrmPagLr) {
/* 552 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 553 */     utils.setStringProperty(this, "ultPrmPagLr", ultPrmPagLr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltPrmPagNtAdp() {
/* 557 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 558 */     return utils.getStringProperty(this, "ultPrmPagNt", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltPrmPagNtAdp(String ultPrmPagNt) {
/* 562 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 563 */     utils.setStringProperty(this, "ultPrmPagNt", ultPrmPagNt, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtEmsLrAdp() {
/* 567 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 568 */     return utils.getStringProperty(this, "ultRtEmsLr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtEmsLrAdp(String ultRtEmsLr) {
/* 572 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 573 */     utils.setStringProperty(this, "ultRtEmsLr", ultRtEmsLr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtEmsLrCiAdp() {
/* 577 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 578 */     return utils.getStringProperty(this, "ultRtEmsLrCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtEmsLrCiAdp(String ultRtEmsLrCi) {
/* 582 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 583 */     utils.setStringProperty(this, "ultRtEmsLrCi", ultRtEmsLrCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtEmsNtAdp() {
/* 587 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 588 */     return utils.getStringProperty(this, "ultRtEmsNt", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtEmsNtAdp(String ultRtEmsNt) {
/* 592 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 593 */     utils.setStringProperty(this, "ultRtEmsNt", ultRtEmsNt, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtEmsNtCiAdp() {
/* 597 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 598 */     return utils.getStringProperty(this, "ultRtEmsNtCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtEmsNtCiAdp(String ultRtEmsNtCi) {
/* 602 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 603 */     utils.setStringProperty(this, "ultRtEmsNtCi", ultRtEmsNtCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtPagLrAdp() {
/* 607 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 608 */     return utils.getStringProperty(this, "ultRtPagLr", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtPagLrAdp(String ultRtPagLr) {
/* 612 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 613 */     utils.setStringProperty(this, "ultRtPagLr", ultRtPagLr, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtPagLrCiAdp() {
/* 617 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 618 */     return utils.getStringProperty(this, "ultRtPagLrCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtPagLrCiAdp(String ultRtPagLrCi) {
/* 622 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 623 */     utils.setStringProperty(this, "ultRtPagLrCi", ultRtPagLrCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtPagNtAdp() {
/* 627 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 628 */     return utils.getStringProperty(this, "ultRtPagNt", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtPagNtAdp(String ultRtPagNt) {
/* 632 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 633 */     utils.setStringProperty(this, "ultRtPagNt", ultRtPagNt, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getUltRtPagNtCiAdp() {
/* 637 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 638 */     return utils.getStringProperty(this, "ultRtPagNtCi", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setUltRtPagNtCiAdp(String ultRtPagNtCi) {
/* 642 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 643 */     utils.setStringProperty(this, "ultRtPagNtCi", ultRtPagNtCi, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPremioPolizzaAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */