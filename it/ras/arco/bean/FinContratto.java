/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*     */ public class FinContratto
/*     */   extends FinContrattoBase
/*     */   implements Serializable
/*     */ {
/*     */   public static final String CONTRATTO_APERTO = "A";
/*     */   public static final String CONTRATTO_IN_APERTURA = "a";
/*     */   public static final String CONTRATTO_CHIUSO = "C";
/*     */   public static final String CONTRATTO_IN_CHIUSURA = "c";
/*     */   public static final String CONTRATTO_STORNATO = "S";
/*     */   public static final String CONTRATTO_CANCELLATO = "D";
/*     */   public static final String CONTRATTO_BLOCCATO = "B";
/*     */   public static final String CONTRATTO_RIDOTTO = "R";
/*     */   public static final String CONTRATTO_RIDOTTO_SPECIALE = "RS";
/*     */   public static final String CONTRATTO_TRASFORMATO = "T";
/*     */   public static final String RISCATTO_SIN = "RSN";
/*     */   public static final String RISCATTO_TOT = "RTT";
/*     */   public static final String RISCATTO_GEN = "RGN";
/*     */   public static final String RISCATTO_REC = "RRC";
/*     */   public static final String RISCATTO_RID = "RRD";
/*     */   public static final String CONTRATTO_NON_DEFINITO = "X";
/*     */   private String dossierTecnico;
/*     */   private String codConvenzione;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private String flagMulti;
/*     */   private Date dataUltimoMovimento;
/*     */   private String codiceSconto;
/*     */   private String flagProvenienza;
/*     */   private Integer codiceEvidenza;
/*     */   private Date dataInsConEvidenza;
/*     */   private Set soggCointestazione;
/*     */   private Set contrattoDecod;
/*     */   private Integer soggCoin;
/*     */   private Set movimenti;
/*     */   private Set bonificiEseguiti;
/*     */   private Set bonificiBeneficiati;
/*     */   private Set titoliOrdinati;
/*     */   private Date dataPrimoMov;
/*     */   private Set contrBlocchi;
/*     */   private String note;
/*     */   
/*     */   public Set getContrBlocchi() {
/*  98 */     return this.contrBlocchi;
/*     */   }
/*     */   
/*     */   public void setContrBlocchi(Set contrBlocchi) {
/* 102 */     this.contrBlocchi = contrBlocchi;
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
/*     */   public FinContratto(Set altriProdotti, Integer codiceEvidenza, Date dataInsConEvidenza, Date dataUltimoMovimento, String flagProvenienza, String codiceSconto, Date dataSottoscrizione, Date dataChiusura, Integer soggCoin, String numContratto, String dossierTecnico, Date dataApertura, String tipoProdotto, String statoContratto, String codConvenzione, Date dataInserimento, String utenteInserimento, String flagMulti, FinProdotto prodotto, Set posizione, Set ruolo, Set sottoscrizione, Set indirizzo, Set movimenti, FinCointestazione cointestazione, FinSoggetto soggetto, Set soggCointestazione, Set assegnazione) {
/* 127 */     this.dataUltimoMovimento = dataUltimoMovimento;
/* 128 */     this.flagProvenienza = flagProvenienza;
/* 129 */     this.codiceSconto = codiceSconto;
/* 130 */     this.dataSottoscrizione = dataSottoscrizione;
/* 131 */     this.dataChiusura = dataChiusura;
/* 132 */     this.numContratto = numContratto;
/* 133 */     this.dossierTecnico = dossierTecnico;
/* 134 */     this.dataApertura = dataApertura;
/* 135 */     this.tipoProdotto = tipoProdotto;
/* 136 */     this.statoContratto = statoContratto;
/* 137 */     this.codConvenzione = codConvenzione;
/* 138 */     this.dataInserimento = dataInserimento;
/* 139 */     this.utenteInserimento = utenteInserimento;
/* 140 */     this.flagMulti = flagMulti;
/* 141 */     this.prodotto = prodotto;
/* 142 */     this.posizione = posizione;
/* 143 */     this.ruolo = ruolo;
/* 144 */     this.sottoscrizione = sottoscrizione;
/* 145 */     this.indirizzo = indirizzo;
/* 146 */     this.movimenti = movimenti;
/* 147 */     this.cointestazione = cointestazione;
/* 148 */     this.soggetto = soggetto;
/* 149 */     this.soggCointestazione = soggCointestazione;
/* 150 */     this.soggCoin = soggCoin;
/* 151 */     this.assegnazione = assegnazione;
/* 152 */     this.codiceEvidenza = codiceEvidenza;
/* 153 */     this.dataInsConEvidenza = dataInsConEvidenza;
/* 154 */     this.altriProdotti = altriProdotti;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContratto() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinContratto(FinCointestazione cointestazione, FinSoggetto soggetto, Set posizione, Set ruolo, Set sottoscrizione, Set indirizzo, Set movimenti, Set soggCointestazione, Set assegnazione) {
/* 174 */     this.cointestazione = cointestazione;
/* 175 */     this.soggetto = soggetto;
/* 176 */     this.posizione = posizione;
/* 177 */     this.ruolo = ruolo;
/* 178 */     this.sottoscrizione = sottoscrizione;
/* 179 */     this.indirizzo = indirizzo;
/* 180 */     this.movimenti = movimenti;
/* 181 */     this.soggCointestazione = soggCointestazione;
/* 182 */     this.assegnazione = assegnazione;
/*     */   }
/*     */   
/*     */   public String getDossierTecnico() {
/* 186 */     return this.dossierTecnico;
/*     */   }
/*     */   
/*     */   public void setDossierTecnico(String dossierTecnico) {
/* 190 */     this.dossierTecnico = dossierTecnico;
/*     */   }
/*     */   
/*     */   public String getCodConvenzione() {
/* 194 */     return this.codConvenzione;
/*     */   }
/*     */   
/*     */   public void setCodConvenzione(String codConvenzione) {
/* 198 */     this.codConvenzione = codConvenzione;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 202 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 206 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 210 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 214 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getFlagMulti() {
/* 218 */     return this.flagMulti;
/*     */   }
/*     */   
/*     */   public void setFlagMulti(String flagMulti) {
/* 222 */     this.flagMulti = flagMulti;
/*     */   }
/*     */   
/*     */   public Set getMovimenti() {
/* 226 */     return this.movimenti;
/*     */   }
/*     */   
/*     */   public void setMovimenti(Set movimenti) {
/* 230 */     this.movimenti = movimenti;
/*     */   }
/*     */   
/*     */   public Set getSoggCointestazione() {
/* 234 */     return this.soggCointestazione;
/*     */   }
/*     */   
/*     */   public void setSoggCointestazione(Set soggCointestazione) {
/* 238 */     this.soggCointestazione = soggCointestazione;
/*     */   }
/*     */   
/*     */   public Integer getSoggCoin() {
/* 242 */     return this.soggCoin;
/*     */   }
/*     */   
/*     */   public void setSoggCoin(Integer soggCoin) {
/* 246 */     this.soggCoin = soggCoin;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 250 */     return (new ToStringBuilder(this)).append("contrattoId", getContrattoId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceSconto() {
/* 258 */     return this.codiceSconto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceSconto(String codiceSconto) {
/* 266 */     this.codiceSconto = codiceSconto;
/*     */   }
/*     */   
/*     */   public String getFlagProvenienza() {
/* 270 */     return this.flagProvenienza;
/*     */   }
/*     */   
/*     */   public void setFlagProvenienza(String flagProvenienza) {
/* 274 */     this.flagProvenienza = flagProvenienza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimoMovimento() {
/* 281 */     return this.dataUltimoMovimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimoMovimento(Date dataUltimoMovimento) {
/* 289 */     this.dataUltimoMovimento = dataUltimoMovimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceEvidenza() {
/* 296 */     return this.codiceEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceEvidenza(Integer codiceEvidenza) {
/* 304 */     this.codiceEvidenza = codiceEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInsConEvidenza() {
/* 311 */     return this.dataInsConEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInsConEvidenza(Date dataInsConEvidenza) {
/* 319 */     this.dataInsConEvidenza = dataInsConEvidenza;
/*     */   }
/*     */   
/*     */   public Set getContrattoDecod() {
/* 323 */     return this.contrattoDecod;
/*     */   }
/*     */   
/*     */   public void setContrattoDecod(Set contrattoDecod) {
/* 327 */     this.contrattoDecod = contrattoDecod;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isModalitaPIC() {
/* 338 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isModalitaPAC() {
/* 349 */     return false;
/*     */   }
/*     */   
/*     */   public Date getDataPrimoMov() {
/* 353 */     return this.dataPrimoMov;
/*     */   }
/*     */   
/*     */   public void setDataPrimoMov(Date dataPrimoMov) {
/* 357 */     this.dataPrimoMov = dataPrimoMov;
/*     */   }
/*     */   
/*     */   public Set getBonificiBeneficiati() {
/* 361 */     return this.bonificiBeneficiati;
/*     */   }
/*     */   
/*     */   public void setBonificiBeneficiati(Set bonificiBeneficiati) {
/* 365 */     this.bonificiBeneficiati = bonificiBeneficiati;
/*     */   }
/*     */   
/*     */   public Set getBonificiEseguiti() {
/* 369 */     return this.bonificiEseguiti;
/*     */   }
/*     */   
/*     */   public void setBonificiEseguiti(Set bonificiEseguiti) {
/* 373 */     this.bonificiEseguiti = bonificiEseguiti;
/*     */   }
/*     */   
/*     */   public Set getTitoliOrdinati() {
/* 377 */     return this.titoliOrdinati;
/*     */   }
/*     */   
/*     */   public void setTitoliOrdinati(Set titoliOrdinati) {
/* 381 */     this.titoliOrdinati = titoliOrdinati;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNote() {
/* 388 */     return this.note;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNote(String note) {
/* 396 */     this.note = note;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinContratto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */