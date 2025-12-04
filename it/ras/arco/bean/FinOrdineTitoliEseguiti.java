/*     */ package it.ras.arco.bean;
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
/*     */ public class FinOrdineTitoliEseguiti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer eseguitiId;
/*     */   private String parametro;
/*     */   private Integer codiceFilialeDossier;
/*     */   private String categoriaDossier;
/*     */   private Integer numDossier;
/*     */   private Integer numSottoDossier;
/*     */   private Integer contatoreOrdine;
/*     */   private Integer numCC;
/*     */   private String codDivisaRegolamento;
/*     */   private Integer statoOperazione;
/*     */   private Integer codiceBanca;
/*     */   private String intestazioneDossier;
/*     */   private String nroCodTerminale;
/*     */   private Integer nroAnnoRiferimento;
/*     */   private Integer nroNumOperazioniRiferimento;
/*     */   private Integer nroNumRegistrazioneRiferimento;
/*     */   private Integer codiceTitolo;
/*     */   private String descrizioneTitolo;
/*     */   private String segnoOperazione;
/*     */   private Date dataOperazione;
/*     */   private Integer quantitaOrdine;
/*     */   private Integer prezzoOrdine;
/*     */   private Date dataEseguito;
/*     */   private Integer quantitaEseguito;
/*     */   private Integer prezzoEseguito;
/*     */   private Date dataRevoca;
/*     */   private Date dataStorno;
/*     */   private Date dataValuta;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private String proceduraUltimaModificaSlave;
/*     */   private Date dataInserimento;
/*     */   private FinPromotore promotore;
/*     */   
/*     */   public FinOrdineTitoliEseguiti() {}
/*     */   
/*     */   public FinOrdineTitoliEseguiti(String dossier, String regolamento, Integer banca, Integer dossier2, Integer titolo, Integer ordine, Date eseguito, Date inserimento, Date operazione, Date revoca, Date storno, Date valuta, String titolo2, String esistenza, Integer id, String dossier3, Integer riferimento, String terminale, Integer riferimento2, Integer riferimento3, Integer numcc, Integer dossier4, Integer dossier5, String parametro, Integer eseguito2, Integer ordine2, String slave, FinPromotore promotore, Integer eseguito3, Integer ordine3, String operazione2, Integer operazione3, String modifica, String slave2, String inserimento2) {
/* 132 */     this.categoriaDossier = dossier;
/* 133 */     this.codDivisaRegolamento = regolamento;
/* 134 */     this.codiceBanca = banca;
/* 135 */     this.codiceFilialeDossier = dossier2;
/* 136 */     this.codiceTitolo = titolo;
/* 137 */     this.contatoreOrdine = ordine;
/* 138 */     this.dataEseguito = eseguito;
/* 139 */     this.dataInserimento = inserimento;
/* 140 */     this.dataOperazione = operazione;
/* 141 */     this.dataRevoca = revoca;
/* 142 */     this.dataStorno = storno;
/* 143 */     this.dataValuta = valuta;
/* 144 */     this.descrizioneTitolo = titolo2;
/* 145 */     this.flagEsistenza = esistenza;
/* 146 */     this.eseguitiId = id;
/* 147 */     this.intestazioneDossier = dossier3;
/* 148 */     this.nroAnnoRiferimento = riferimento;
/* 149 */     this.nroCodTerminale = terminale;
/* 150 */     this.nroNumOperazioniRiferimento = riferimento2;
/* 151 */     this.nroNumRegistrazioneRiferimento = riferimento3;
/* 152 */     this.numCC = numcc;
/* 153 */     this.numDossier = dossier4;
/* 154 */     this.numSottoDossier = dossier5;
/* 155 */     this.parametro = parametro;
/* 156 */     this.prezzoEseguito = eseguito2;
/* 157 */     this.prezzoOrdine = ordine2;
/* 158 */     this.proceduraUltimaModificaSlave = slave;
/* 159 */     this.promotore = promotore;
/* 160 */     this.quantitaEseguito = eseguito3;
/* 161 */     this.quantitaOrdine = ordine3;
/* 162 */     this.segnoOperazione = operazione2;
/* 163 */     this.statoOperazione = operazione3;
/* 164 */     this.tipoUltimaModifica = modifica;
/* 165 */     this.userUltimaModificaSlave = slave2;
/* 166 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getEseguitiId() {
/* 173 */     return this.eseguitiId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEseguitiId(Integer eseguitiId) {
/* 181 */     this.eseguitiId = eseguitiId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPromotore getPromotore() {
/* 192 */     return this.promotore;
/*     */   }
/*     */   
/*     */   public String getCategoriaDossier() {
/* 196 */     return this.categoriaDossier;
/*     */   }
/*     */   
/*     */   public void setCategoriaDossier(String categoriaDossier) {
/* 200 */     this.categoriaDossier = categoriaDossier;
/*     */   }
/*     */   
/*     */   public String getCodDivisaRegolamento() {
/* 204 */     return this.codDivisaRegolamento;
/*     */   }
/*     */   
/*     */   public void setCodDivisaRegolamento(String codDivisaRegolamento) {
/* 208 */     this.codDivisaRegolamento = codDivisaRegolamento;
/*     */   }
/*     */   
/*     */   public Integer getCodiceBanca() {
/* 212 */     return this.codiceBanca;
/*     */   }
/*     */   
/*     */   public void setCodiceBanca(Integer codiceBanca) {
/* 216 */     this.codiceBanca = codiceBanca;
/*     */   }
/*     */   
/*     */   public Integer getCodiceFilialeDossier() {
/* 220 */     return this.codiceFilialeDossier;
/*     */   }
/*     */   
/*     */   public void setCodiceFilialeDossier(Integer codiceFilialeDossier) {
/* 224 */     this.codiceFilialeDossier = codiceFilialeDossier;
/*     */   }
/*     */   
/*     */   public Integer getCodiceTitolo() {
/* 228 */     return this.codiceTitolo;
/*     */   }
/*     */   
/*     */   public void setCodiceTitolo(Integer codiceTitolo) {
/* 232 */     this.codiceTitolo = codiceTitolo;
/*     */   }
/*     */   
/*     */   public Integer getContatoreOrdine() {
/* 236 */     return this.contatoreOrdine;
/*     */   }
/*     */   
/*     */   public void setContatoreOrdine(Integer contatoreOrdine) {
/* 240 */     this.contatoreOrdine = contatoreOrdine;
/*     */   }
/*     */   
/*     */   public Date getDataEseguito() {
/* 244 */     return this.dataEseguito;
/*     */   }
/*     */   
/*     */   public void setDataEseguito(Date dataEseguito) {
/* 248 */     this.dataEseguito = dataEseguito;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 252 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 256 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public Date getDataOperazione() {
/* 260 */     return this.dataOperazione;
/*     */   }
/*     */   
/*     */   public void setDataOperazione(Date dataOperazione) {
/* 264 */     this.dataOperazione = dataOperazione;
/*     */   }
/*     */   
/*     */   public Date getDataRevoca() {
/* 268 */     return this.dataRevoca;
/*     */   }
/*     */   
/*     */   public void setDataRevoca(Date dataRevoca) {
/* 272 */     this.dataRevoca = dataRevoca;
/*     */   }
/*     */   
/*     */   public Date getDataStorno() {
/* 276 */     return this.dataStorno;
/*     */   }
/*     */   
/*     */   public void setDataStorno(Date dataStorno) {
/* 280 */     this.dataStorno = dataStorno;
/*     */   }
/*     */   
/*     */   public Date getDataValuta() {
/* 284 */     return this.dataValuta;
/*     */   }
/*     */   
/*     */   public void setDataValuta(Date dataValuta) {
/* 288 */     this.dataValuta = dataValuta;
/*     */   }
/*     */   
/*     */   public String getDescrizioneTitolo() {
/* 292 */     return this.descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 296 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 300 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 304 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIntestazioneDossier() {
/* 311 */     return this.intestazioneDossier;
/*     */   }
/*     */   
/*     */   public void setIntestazioneDossier(String intestazioneDossier) {
/* 315 */     this.intestazioneDossier = intestazioneDossier;
/*     */   }
/*     */   
/*     */   public Integer getNroAnnoRiferimento() {
/* 319 */     return this.nroAnnoRiferimento;
/*     */   }
/*     */   
/*     */   public void setNroAnnoRiferimento(Integer nroAnnoRiferimento) {
/* 323 */     this.nroAnnoRiferimento = nroAnnoRiferimento;
/*     */   }
/*     */   
/*     */   public String getNroCodTerminale() {
/* 327 */     return this.nroCodTerminale;
/*     */   }
/*     */   
/*     */   public void setNroCodTerminale(String nroCodTerminale) {
/* 331 */     this.nroCodTerminale = nroCodTerminale;
/*     */   }
/*     */   
/*     */   public Integer getNroNumOperazioniRiferimento() {
/* 335 */     return this.nroNumOperazioniRiferimento;
/*     */   }
/*     */   
/*     */   public void setNroNumOperazioniRiferimento(Integer nroNumOperazioniRiferimento) {
/* 339 */     this.nroNumOperazioniRiferimento = nroNumOperazioniRiferimento;
/*     */   }
/*     */   
/*     */   public Integer getNroNumRegistrazioneRiferimento() {
/* 343 */     return this.nroNumRegistrazioneRiferimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNroNumRegistrazioneRiferimento(Integer nroNumRegistrazioneRiferimento) {
/* 348 */     this.nroNumRegistrazioneRiferimento = nroNumRegistrazioneRiferimento;
/*     */   }
/*     */   
/*     */   public Integer getNumCC() {
/* 352 */     return this.numCC;
/*     */   }
/*     */   
/*     */   public void setNumCC(Integer numCC) {
/* 356 */     this.numCC = numCC;
/*     */   }
/*     */   
/*     */   public Integer getNumDossier() {
/* 360 */     return this.numDossier;
/*     */   }
/*     */   
/*     */   public void setNumDossier(Integer numDossier) {
/* 364 */     this.numDossier = numDossier;
/*     */   }
/*     */   
/*     */   public Integer getNumSottoDossier() {
/* 368 */     return this.numSottoDossier;
/*     */   }
/*     */   
/*     */   public void setNumSottoDossier(Integer numSottoDossier) {
/* 372 */     this.numSottoDossier = numSottoDossier;
/*     */   }
/*     */   
/*     */   public String getParametro() {
/* 376 */     return this.parametro;
/*     */   }
/*     */   
/*     */   public void setParametro(String parametro) {
/* 380 */     this.parametro = parametro;
/*     */   }
/*     */   
/*     */   public Integer getPrezzoEseguito() {
/* 384 */     return this.prezzoEseguito;
/*     */   }
/*     */   
/*     */   public void setPrezzoEseguito(Integer prezzoEseguito) {
/* 388 */     this.prezzoEseguito = prezzoEseguito;
/*     */   }
/*     */   
/*     */   public Integer getPrezzoOrdine() {
/* 392 */     return this.prezzoOrdine;
/*     */   }
/*     */   
/*     */   public void setPrezzoOrdine(Integer prezzoOrdine) {
/* 396 */     this.prezzoOrdine = prezzoOrdine;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/* 400 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 404 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public Integer getQuantitaEseguito() {
/* 408 */     return this.quantitaEseguito;
/*     */   }
/*     */   
/*     */   public void setQuantitaEseguito(Integer quantitaEseguito) {
/* 412 */     this.quantitaEseguito = quantitaEseguito;
/*     */   }
/*     */   
/*     */   public Integer getQuantitaOrdine() {
/* 416 */     return this.quantitaOrdine;
/*     */   }
/*     */   
/*     */   public void setQuantitaOrdine(Integer quantitaOrdine) {
/* 420 */     this.quantitaOrdine = quantitaOrdine;
/*     */   }
/*     */   
/*     */   public String getSegnoOperazione() {
/* 424 */     return this.segnoOperazione;
/*     */   }
/*     */   
/*     */   public void setSegnoOperazione(String segnoOperazione) {
/* 428 */     this.segnoOperazione = segnoOperazione;
/*     */   }
/*     */   
/*     */   public Integer getStatoOperazione() {
/* 432 */     return this.statoOperazione;
/*     */   }
/*     */   
/*     */   public void setStatoOperazione(Integer statoOperazione) {
/* 436 */     this.statoOperazione = statoOperazione;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 440 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 444 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 448 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 452 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 456 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 460 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPromotore(FinPromotore promotore) {
/* 467 */     this.promotore = promotore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinOrdineTitoliEseguiti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */