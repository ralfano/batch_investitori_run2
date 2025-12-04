/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class FinPrezzo
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer prezzoId;
/*     */   private Integer attivitaFinId;
/*     */   private Double ultPrezzo;
/*     */   private Double ultPrezzoEuro;
/*     */   private Double cambio;
/*     */   private Date dataUltPrezzo;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Double prezzoRett;
/*     */   private Double prezzoAdj;
/*     */   private Double prezzoShareEuro;
/*     */   private Double rateoMaturato;
/*     */   private Double durataRateo;
/*     */   private Double durataMedia;
/*     */   private Double durataUltPrezzo;
/*     */   private FinAttivitaFinanziaria attivitaFin;
/*     */   private String flagInvioQuot;
/*     */   
/*     */   public String getFlagInvioQuot() {
/*  69 */     return this.flagInvioQuot;
/*     */   }
/*     */   
/*     */   public void setFlagInvioQuot(String flagInvioQuot) {
/*  73 */     this.flagInvioQuot = flagInvioQuot;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPrezzo(FinAttivitaFinanziaria fin, Double cambio, Date inserimento, Date prezzo, Double media, Double rateo, Double adj, Integer id, Double rett, Double euro, Double maturato, Double prezzo2, Double euro2, String inserimento2) {
/*  79 */     this.attivitaFin = fin;
/*  80 */     this.cambio = cambio;
/*  81 */     this.dataInserimento = inserimento;
/*  82 */     this.dataUltPrezzo = prezzo;
/*  83 */     this.durataMedia = media;
/*  84 */     this.durataRateo = rateo;
/*  85 */     this.prezzoAdj = adj;
/*  86 */     this.prezzoId = id;
/*  87 */     this.prezzoRett = rett;
/*  88 */     this.prezzoShareEuro = euro;
/*  89 */     this.rateoMaturato = maturato;
/*  90 */     this.ultPrezzo = prezzo2;
/*  91 */     this.ultPrezzoEuro = euro2;
/*  92 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinPrezzo(FinAttivitaFinanziaria attivitaFin) {
/*  97 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPrezzo() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinPrezzo(FinUltPrezzo ultimoPrezzoCorrente) {
/* 116 */     this.attivitaFin = ultimoPrezzoCorrente.getAttivitaFin();
/* 117 */     this.attivitaFinId = ultimoPrezzoCorrente.getAttivitaFinId();
/* 118 */     this.cambio = ultimoPrezzoCorrente.getCambio();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     this.dataUltPrezzo = ultimoPrezzoCorrente.getDataUltPrezzo();
/* 128 */     this.ultPrezzo = ultimoPrezzoCorrente.getUltPrezzo();
/* 129 */     this.ultPrezzoEuro = ultimoPrezzoCorrente.getUltPrezzoEuro();
/*     */ 
/*     */     
/* 132 */     this.durataMedia = null;
/* 133 */     this.durataRateo = null;
/* 134 */     this.durataUltPrezzo = null;
/* 135 */     this.prezzoAdj = null;
/* 136 */     this.prezzoRett = null;
/* 137 */     this.prezzoShareEuro = null;
/* 138 */     this.rateoMaturato = null;
/*     */   }
/*     */   
/*     */   public Integer getPrezzoId() {
/* 142 */     return this.prezzoId;
/*     */   }
/*     */   
/*     */   public void setPrezzoId(Integer prezzoId) {
/* 146 */     this.prezzoId = prezzoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getAttivitaFinId() {
/* 151 */     return this.attivitaFinId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAttivitaFinId(Integer attivitaFinId) {
/* 156 */     this.attivitaFinId = attivitaFinId;
/*     */   }
/*     */   
/*     */   public Double getUltPrezzo() {
/* 160 */     return this.ultPrezzo;
/*     */   }
/*     */   
/*     */   public void setUltPrezzo(Double ultPrezzo) {
/* 164 */     this.ultPrezzo = ultPrezzo;
/*     */   }
/*     */   
/*     */   public Double getUltPrezzoEuro() {
/* 168 */     return this.ultPrezzoEuro;
/*     */   }
/*     */   
/*     */   public void setUltPrezzoEuro(Double ultPrezzoEuro) {
/* 172 */     this.ultPrezzoEuro = ultPrezzoEuro;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 176 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 180 */     this.cambio = cambio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoRett() {
/* 186 */     return this.prezzoRett;
/*     */   }
/*     */   
/*     */   public void setPrezzoRett(Double prezzoRett) {
/* 190 */     this.prezzoRett = prezzoRett;
/*     */   }
/*     */   
/*     */   public Double getPrezzoShareEuro() {
/* 194 */     return this.prezzoShareEuro;
/*     */   }
/*     */   
/*     */   public void setPrezzoShareEuro(Double prezzoShareEuro) {
/* 198 */     this.prezzoShareEuro = prezzoShareEuro;
/*     */   }
/*     */   
/*     */   public Double getPrezzoAdj() {
/* 202 */     return this.prezzoAdj;
/*     */   }
/*     */   
/*     */   public void setPrezzoAdj(Double prezzoAdj) {
/* 206 */     this.prezzoAdj = prezzoAdj;
/*     */   }
/*     */ 
/*     */   
/*     */   public Double getRateoMaturato() {
/* 211 */     return this.rateoMaturato;
/*     */   }
/*     */   
/*     */   public void setRateoMaturato(Double rateoMaturato) {
/* 215 */     this.rateoMaturato = rateoMaturato;
/*     */   }
/*     */   
/*     */   public Double getDurataRateo() {
/* 219 */     return this.durataRateo;
/*     */   }
/*     */   
/*     */   public void setDurataRateo(Double durataRateo) {
/* 223 */     this.durataRateo = durataRateo;
/*     */   }
/*     */   
/*     */   public Double getDurataMedia() {
/* 227 */     return this.durataMedia;
/*     */   }
/*     */   
/*     */   public void setDurataMedia(Double durataMedia) {
/* 231 */     this.durataMedia = durataMedia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltPrezzo() {
/* 237 */     return this.dataUltPrezzo;
/*     */   }
/*     */   
/*     */   public void setDataUltPrezzo(Date dataUltPrezzo) {
/* 241 */     this.dataUltPrezzo = dataUltPrezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 247 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 251 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 255 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 259 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 263 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 267 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 271 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 275 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 279 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 283 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 287 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 291 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 295 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 299 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFin() {
/* 304 */     return this.attivitaFin;
/*     */   }
/*     */   
/*     */   public void setAttivitaFin(FinAttivitaFinanziaria attivitaFin) {
/* 308 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 312 */     return (new ToStringBuilder(this)).append("prezzoId", getPrezzoId()).toString();
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
/*     */   public boolean equals(Object obj) {
/* 360 */     if (!(obj instanceof FinPrezzo))
/*     */     {
/* 362 */       return false;
/*     */     }
/* 364 */     if (this == obj)
/*     */     {
/* 366 */       return true;
/*     */     }
/* 368 */     FinPrezzo prezzo = (FinPrezzo)obj;
/* 369 */     return (new EqualsBuilder()).append(this.ultPrezzo, prezzo.ultPrezzo).append(this.prezzoAdj, prezzo.prezzoAdj).append(this.rateoMaturato, prezzo.rateoMaturato).append(this.durataRateo, prezzo.durataRateo).append(this.durataMedia, prezzo.durataMedia).append(this.prezzoRett, prezzo.prezzoRett).append(this.prezzoShareEuro, prezzo.prezzoShareEuro).append(this.dataUltPrezzo, prezzo.dataUltPrezzo).append(this.ultPrezzoEuro, prezzo.ultPrezzoEuro).append(this.cambio, prezzo.cambio).isEquals();
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
/*     */   public int hashCode() {
/* 389 */     return (new HashCodeBuilder(17, 37)).append(this.ultPrezzo).append(this.prezzoAdj).append(this.rateoMaturato).append(this.durataRateo).append(this.durataMedia).append(this.prezzoRett).append(this.prezzoShareEuro).append(this.dataUltPrezzo).append(this.ultPrezzoEuro).append(this.cambio).toHashCode();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinPrezzo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */