/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ public class FinOrdineTitolo
/*     */   extends RasORMBean implements Serializable {
/*     */   private FinSoggetto soggetto;
/*     */   private FinPromotore promotore;
/*     */   private FinContratto contrattoDt;
/*     */   private Integer ordineId;
/*     */   private Date dataOrdine;
/*     */   private String sottoDossier;
/*     */   private String intestazione;
/*     */   private String numeroOrdine;
/*     */   private String esitoOrdine;
/*     */   private String descrizioneTitolo;
/*     */   private Integer codiceInterno;
/*     */   private String codiceISIN;
/*     */   private String divisaTrattazione;
/*     */   private String divisaRegolamento;
/*     */   private String piazza;
/*     */   private Double quantitaMinima;
/*     */   private Double quantita;
/*     */   private String tipoOperazione;
/*     */   private Date dataValidita;
/*     */   private Double prezzoLimite;
/*     */   private Double controvalorePresunto;
/*     */   private String parametroQuantita;
/*     */   private String parametroTempo;
/*     */   private String parametroEsecuzione;
/*     */   private String parametroPrezzo;
/*     */   private String controparte;
/*     */   private String flagOrdineTitoloFisso;
/*     */   private String flagAdeguatezza;
/*     */   private String flagConflittoInteresse;
/*     */   private String flagPattiChiari;
/*     */   private String dispositiva;
/*     */   private String userUltimaModifica;
/*     */   private String proceduraUltimaModifica;
/*     */   private Date dataUltimaModifica;
/*     */   private Date dataInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   
/*     */   public Integer getCodiceInterno() {
/*  49 */     return this.codiceInterno;
/*     */   }
/*     */   public void setCodiceInterno(Integer codiceInterno) {
/*  52 */     this.codiceInterno = codiceInterno;
/*     */   }
/*     */   public String getCodiceISIN() {
/*  55 */     return this.codiceISIN;
/*     */   }
/*     */   public void setCodiceISIN(String codiceISIN) {
/*  58 */     this.codiceISIN = codiceISIN;
/*     */   }
/*     */   public FinContratto getContrattoDt() {
/*  61 */     return this.contrattoDt;
/*     */   }
/*     */   public void setContrattoDt(FinContratto contrattoDt) {
/*  64 */     this.contrattoDt = contrattoDt;
/*     */   }
/*     */   public String getControparte() {
/*  67 */     return this.controparte;
/*     */   }
/*     */   public void setControparte(String controparte) {
/*  70 */     this.controparte = controparte;
/*     */   }
/*     */   public Double getControvalorePresunto() {
/*  73 */     return this.controvalorePresunto;
/*     */   }
/*     */   public void setControvalorePresunto(Double controvalorePresunto) {
/*  76 */     this.controvalorePresunto = controvalorePresunto;
/*     */   }
/*     */   public Date getDataInserimento() {
/*  79 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  82 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataOrdine() {
/*  85 */     return this.dataOrdine;
/*     */   }
/*     */   public void setDataOrdine(Date dataOrdine) {
/*  88 */     this.dataOrdine = dataOrdine;
/*     */   }
/*     */   public Date getDataUltimaModifica() {
/*  91 */     return this.dataUltimaModifica;
/*     */   }
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/*  94 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   public Date getDataValidita() {
/*  97 */     return this.dataValidita;
/*     */   }
/*     */   public void setDataValidita(Date dataValidita) {
/* 100 */     this.dataValidita = dataValidita;
/*     */   }
/*     */   public String getDescrizioneTitolo() {
/* 103 */     return this.descrizioneTitolo;
/*     */   }
/*     */   public void setDescrizioneTitolo(String descrizioneTitolo) {
/* 106 */     this.descrizioneTitolo = descrizioneTitolo;
/*     */   }
/*     */   public String getDispositiva() {
/* 109 */     return this.dispositiva;
/*     */   }
/*     */   public void setDispositiva(String dispositiva) {
/* 112 */     this.dispositiva = dispositiva;
/*     */   }
/*     */   public String getDivisaRegolamento() {
/* 115 */     return this.divisaRegolamento;
/*     */   }
/*     */   public void setDivisaRegolamento(String divisaRegolamento) {
/* 118 */     this.divisaRegolamento = divisaRegolamento;
/*     */   }
/*     */   public String getDivisaTrattazione() {
/* 121 */     return this.divisaTrattazione;
/*     */   }
/*     */   public void setDivisaTrattazione(String divisaTrattazione) {
/* 124 */     this.divisaTrattazione = divisaTrattazione;
/*     */   }
/*     */   public String getEsitoOrdine() {
/* 127 */     return this.esitoOrdine;
/*     */   }
/*     */   public void setEsitoOrdine(String esitoOrdine) {
/* 130 */     this.esitoOrdine = esitoOrdine;
/*     */   }
/*     */   public String getFlagAdeguatezza() {
/* 133 */     return this.flagAdeguatezza;
/*     */   }
/*     */   public void setFlagAdeguatezza(String flagAdeguatezza) {
/* 136 */     this.flagAdeguatezza = flagAdeguatezza;
/*     */   }
/*     */   public String getFlagConflittoInteresse() {
/* 139 */     return this.flagConflittoInteresse;
/*     */   }
/*     */   public void setFlagConflittoInteresse(String flagConflittoInteresse) {
/* 142 */     this.flagConflittoInteresse = flagConflittoInteresse;
/*     */   }
/*     */   public String getFlagEsistenza() {
/* 145 */     return this.flagEsistenza;
/*     */   }
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 148 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   public String getFlagOrdineTitoloFisso() {
/* 151 */     return this.flagOrdineTitoloFisso;
/*     */   }
/*     */   public void setFlagOrdineTitoloFisso(String flagOrdineTitoloFisso) {
/* 154 */     this.flagOrdineTitoloFisso = flagOrdineTitoloFisso;
/*     */   }
/*     */   public String getFlagPattiChiari() {
/* 157 */     return this.flagPattiChiari;
/*     */   }
/*     */   public void setFlagPattiChiari(String flagPattiChiari) {
/* 160 */     this.flagPattiChiari = flagPattiChiari;
/*     */   }
/*     */   public String getNumeroOrdine() {
/* 163 */     return this.numeroOrdine;
/*     */   }
/*     */   public void setNumeroOrdine(String numeroOrdine) {
/* 166 */     this.numeroOrdine = numeroOrdine;
/*     */   }
/*     */   public Integer getOrdineId() {
/* 169 */     return this.ordineId;
/*     */   }
/*     */   public void setOrdineId(Integer ordineId) {
/* 172 */     this.ordineId = ordineId;
/*     */   }
/*     */   public String getParametroEsecuzione() {
/* 175 */     return this.parametroEsecuzione;
/*     */   }
/*     */   public void setParametroEsecuzione(String parametroEsecuzione) {
/* 178 */     this.parametroEsecuzione = parametroEsecuzione;
/*     */   }
/*     */   public String getParametroPrezzo() {
/* 181 */     return this.parametroPrezzo;
/*     */   }
/*     */   public void setParametroPrezzo(String parametroPrezzo) {
/* 184 */     this.parametroPrezzo = parametroPrezzo;
/*     */   }
/*     */   public String getParametroQuantita() {
/* 187 */     return this.parametroQuantita;
/*     */   }
/*     */   public void setParametroQuantita(String parametroQuantita) {
/* 190 */     this.parametroQuantita = parametroQuantita;
/*     */   }
/*     */   public String getParametroTempo() {
/* 193 */     return this.parametroTempo;
/*     */   }
/*     */   public void setParametroTempo(String parametroTempo) {
/* 196 */     this.parametroTempo = parametroTempo;
/*     */   }
/*     */   public String getPiazza() {
/* 199 */     return this.piazza;
/*     */   }
/*     */   public void setPiazza(String piazza) {
/* 202 */     this.piazza = piazza;
/*     */   }
/*     */   public Double getPrezzoLimite() {
/* 205 */     return this.prezzoLimite;
/*     */   }
/*     */   public void setPrezzoLimite(Double prezzoLimite) {
/* 208 */     this.prezzoLimite = prezzoLimite;
/*     */   }
/*     */   public String getProceduraUltimaModifica() {
/* 211 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 214 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   public FinPromotore getPromotore() {
/* 217 */     return this.promotore;
/*     */   }
/*     */   public void setPromotore(FinPromotore promotore) {
/* 220 */     this.promotore = promotore;
/*     */   }
/*     */   public Double getQuantita() {
/* 223 */     return this.quantita;
/*     */   }
/*     */   public void setQuantita(Double quantita) {
/* 226 */     this.quantita = quantita;
/*     */   }
/*     */   public Double getQuantitaMinima() {
/* 229 */     return this.quantitaMinima;
/*     */   }
/*     */   public void setQuantitaMinima(Double quantitaMinima) {
/* 232 */     this.quantitaMinima = quantitaMinima;
/*     */   }
/*     */   public FinSoggetto getSoggetto() {
/* 235 */     return this.soggetto;
/*     */   }
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 238 */     this.soggetto = soggetto;
/*     */   }
/*     */   public String getSottoDossier() {
/* 241 */     return this.sottoDossier;
/*     */   }
/*     */   public void setSottoDossier(String sottoDossier) {
/* 244 */     this.sottoDossier = sottoDossier;
/*     */   }
/*     */   public String getTipoOperazione() {
/* 247 */     return this.tipoOperazione;
/*     */   }
/*     */   public void setTipoOperazione(String tipoOperazione) {
/* 250 */     this.tipoOperazione = tipoOperazione;
/*     */   }
/*     */   public String getTipoUltimaModifica() {
/* 253 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 256 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   public String getUserUltimaModifica() {
/* 259 */     return this.userUltimaModifica;
/*     */   }
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 262 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   public String getUtenteInserimento() {
/* 265 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 268 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   public String getIntestazione() {
/* 271 */     return this.intestazione;
/*     */   }
/*     */   public void setIntestazione(String intestazione) {
/* 274 */     this.intestazione = intestazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinOrdineTitolo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */