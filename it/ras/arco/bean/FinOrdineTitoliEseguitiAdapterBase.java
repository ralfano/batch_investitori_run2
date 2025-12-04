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
/*     */ public class FinOrdineTitoliEseguitiAdapterBase
/*     */   extends FinOrdineTitoliEseguiti
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
/*     */   public String getCodiceBancaAdp() {
/*  47 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  48 */     return utils.getStringProperty(this, "codiceBanca", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodiceBancaAdp(String codiceBanca) {
/*  52 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  53 */     utils.setStringProperty(this, "codiceBanca", codiceBanca, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodiceFilialeDossierAdp() {
/*  57 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  58 */     return utils.getStringProperty(this, "codiceFilialeDossier", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodiceFilialeDossierAdp(String codiceFilialeDossier) {
/*  62 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  63 */     utils.setStringProperty(this, "codiceFilialeDossier", codiceFilialeDossier, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getCodiceTitoloAdp() {
/*  67 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  68 */     return utils.getStringProperty(this, "codiceTitolo", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setCodiceTitoloAdp(String codiceTitolo) {
/*  72 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  73 */     utils.setStringProperty(this, "codiceTitolo", codiceTitolo, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getContatoreOrdineAdp() {
/*  77 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  78 */     return utils.getStringProperty(this, "contatoreOrdine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setContatoreOrdineAdp(String contatoreOrdine) {
/*  82 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  83 */     utils.setStringProperty(this, "contatoreOrdine", contatoreOrdine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataEseguitoAdp() {
/*  87 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  88 */     return utils.getStringProperty(this, "dataEseguito", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataEseguitoAdp(String dataEseguito) {
/*  92 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  93 */     utils.setStringProperty(this, "dataEseguito", dataEseguito, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataInserimentoAdp() {
/*  97 */     AdapterUtils utils = AdapterUtils.getInstance();
/*  98 */     return utils.getStringProperty(this, "dataInserimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataInserimentoAdp(String dataInserimento) {
/* 102 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 103 */     utils.setStringProperty(this, "dataInserimento", dataInserimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataOperazioneAdp() {
/* 107 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 108 */     return utils.getStringProperty(this, "dataOperazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataOperazioneAdp(String dataOperazione) {
/* 112 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 113 */     utils.setStringProperty(this, "dataOperazione", dataOperazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataRevocaAdp() {
/* 117 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 118 */     return utils.getStringProperty(this, "dataRevoca", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataRevocaAdp(String dataRevoca) {
/* 122 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 123 */     utils.setStringProperty(this, "dataRevoca", dataRevoca, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataStornoAdp() {
/* 127 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 128 */     return utils.getStringProperty(this, "dataStorno", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataStornoAdp(String dataStorno) {
/* 132 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 133 */     utils.setStringProperty(this, "dataStorno", dataStorno, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaAdp() {
/* 137 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 138 */     return utils.getStringProperty(this, "dataUltimaModifica", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaAdp(String dataUltimaModifica) {
/* 142 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 143 */     utils.setStringProperty(this, "dataUltimaModifica", dataUltimaModifica, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataUltimaModificaSlaveAdp() {
/* 147 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 148 */     return utils.getStringProperty(this, "dataUltimaModificaSlave", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataUltimaModificaSlaveAdp(String dataUltimaModificaSlave) {
/* 152 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 153 */     utils.setStringProperty(this, "dataUltimaModificaSlave", dataUltimaModificaSlave, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getDataValutaAdp() {
/* 157 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 158 */     return utils.getStringProperty(this, "dataValuta", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setDataValutaAdp(String dataValuta) {
/* 162 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 163 */     utils.setStringProperty(this, "dataValuta", dataValuta, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getEseguitiIdAdp() {
/* 167 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 168 */     return utils.getStringProperty(this, "eseguitiId", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setEseguitiIdAdp(String eseguitiId) {
/* 172 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 173 */     utils.setStringProperty(this, "eseguitiId", eseguitiId, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNroAnnoRiferimentoAdp() {
/* 177 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 178 */     return utils.getStringProperty(this, "nroAnnoRiferimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNroAnnoRiferimentoAdp(String nroAnnoRiferimento) {
/* 182 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 183 */     utils.setStringProperty(this, "nroAnnoRiferimento", nroAnnoRiferimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNroNumOperazioniRiferimentoAdp() {
/* 187 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 188 */     return utils.getStringProperty(this, "nroNumOperazioniRiferimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNroNumOperazioniRiferimentoAdp(String nroNumOperazioniRiferimento) {
/* 192 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 193 */     utils.setStringProperty(this, "nroNumOperazioniRiferimento", nroNumOperazioniRiferimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNroNumRegistrazioneRiferimentoAdp() {
/* 197 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 198 */     return utils.getStringProperty(this, "nroNumRegistrazioneRiferimento", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNroNumRegistrazioneRiferimentoAdp(String nroNumRegistrazioneRiferimento) {
/* 202 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 203 */     utils.setStringProperty(this, "nroNumRegistrazioneRiferimento", nroNumRegistrazioneRiferimento, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumCCAdp() {
/* 207 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 208 */     return utils.getStringProperty(this, "numCC", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumCCAdp(String numCC) {
/* 212 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 213 */     utils.setStringProperty(this, "numCC", numCC, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumDossierAdp() {
/* 217 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 218 */     return utils.getStringProperty(this, "numDossier", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumDossierAdp(String numDossier) {
/* 222 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 223 */     utils.setStringProperty(this, "numDossier", numDossier, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getNumSottoDossierAdp() {
/* 227 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 228 */     return utils.getStringProperty(this, "numSottoDossier", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setNumSottoDossierAdp(String numSottoDossier) {
/* 232 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 233 */     utils.setStringProperty(this, "numSottoDossier", numSottoDossier, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrezzoEseguitoAdp() {
/* 237 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 238 */     return utils.getStringProperty(this, "prezzoEseguito", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrezzoEseguitoAdp(String prezzoEseguito) {
/* 242 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 243 */     utils.setStringProperty(this, "prezzoEseguito", prezzoEseguito, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getPrezzoOrdineAdp() {
/* 247 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 248 */     return utils.getStringProperty(this, "prezzoOrdine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setPrezzoOrdineAdp(String prezzoOrdine) {
/* 252 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 253 */     utils.setStringProperty(this, "prezzoOrdine", prezzoOrdine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getQuantitaEseguitoAdp() {
/* 257 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 258 */     return utils.getStringProperty(this, "quantitaEseguito", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setQuantitaEseguitoAdp(String quantitaEseguito) {
/* 262 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 263 */     utils.setStringProperty(this, "quantitaEseguito", quantitaEseguito, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getQuantitaOrdineAdp() {
/* 267 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 268 */     return utils.getStringProperty(this, "quantitaOrdine", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setQuantitaOrdineAdp(String quantitaOrdine) {
/* 272 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 273 */     utils.setStringProperty(this, "quantitaOrdine", quantitaOrdine, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public String getStatoOperazioneAdp() {
/* 277 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 278 */     return utils.getStringProperty(this, "statoOperazione", utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */   
/*     */   public void setStatoOperazioneAdp(String statoOperazione) {
/* 282 */     AdapterUtils utils = AdapterUtils.getInstance();
/* 283 */     utils.setStringProperty(this, "statoOperazione", statoOperazione, utils.getLocale(), utils.getPatternManager().getBeanPatterns(getClass().getName()));
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinOrdineTitoliEseguitiAdapterBase.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */