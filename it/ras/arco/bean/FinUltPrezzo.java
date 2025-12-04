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
/*     */ public class FinUltPrezzo
/*     */   extends FinAutoGSTDValuesSettedBean
/*     */ {
/*     */   private Integer attivitaFinId;
/*     */   private Integer ultPrezzoId;
/*     */   private Double ultPrezzo;
/*     */   private Date dataUltPrezzo;
/*     */   private Double ultPrezzoEuro;
/*     */   private Double cambio;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Double prezzoAdj;
/*     */   private Double prezzoShareEuro;
/*     */   private Double rateoMaturato;
/*     */   private Double durataRateo;
/*     */   private Double durataMedia;
/*     */   private String flagInvioQuot;
/*     */   private FinAttivitaFinanziaria attivitaFin;
/*     */   
/*     */   public FinUltPrezzo(FinAttivitaFinanziaria fin, Double cambio, Date inserimento, Date prezzo, Double prezzo2, Double euro, Integer id, String inserimento2) {
/*  63 */     this.attivitaFin = fin;
/*  64 */     this.cambio = cambio;
/*  65 */     this.dataInserimento = inserimento;
/*  66 */     this.dataUltPrezzo = prezzo;
/*  67 */     this.ultPrezzo = prezzo2;
/*  68 */     this.ultPrezzoEuro = euro;
/*  69 */     this.ultPrezzoId = id;
/*  70 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinUltPrezzo(FinAttivitaFinanziaria attivitaFin) {
/*  75 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinUltPrezzo() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinUltPrezzo(FinPrezzo nuovoPrezzo) {
/*  94 */     this.attivitaFin = nuovoPrezzo.getAttivitaFin();
/*  95 */     this.cambio = nuovoPrezzo.getCambio();
/*  96 */     this.dataUltPrezzo = nuovoPrezzo.getDataUltPrezzo();
/*  97 */     this.ultPrezzo = nuovoPrezzo.getUltPrezzo();
/*  98 */     this.ultPrezzoEuro = nuovoPrezzo.getUltPrezzoEuro();
/*     */     
/* 100 */     if (this.ultPrezzo == null)
/* 101 */       this.ultPrezzo = new Double(0.0D); 
/* 102 */     if (this.dataUltPrezzo == null) {
/* 103 */       this.dataUltPrezzo = new Date();
/*     */     }
/*     */   }
/*     */   
/*     */   public Integer getUltPrezzoId() {
/* 108 */     return this.ultPrezzoId;
/*     */   }
/*     */   
/*     */   public void setUltPrezzoId(Integer ultPrezzoId) {
/* 112 */     this.ultPrezzoId = ultPrezzoId;
/*     */   }
/*     */   
/*     */   public Double getUltPrezzo() {
/* 116 */     return this.ultPrezzo;
/*     */   }
/*     */   
/*     */   public void setUltPrezzo(Double ultPrezzo) {
/* 120 */     this.ultPrezzo = ultPrezzo;
/*     */   }
/*     */   
/*     */   public Double getUltPrezzoEuro() {
/* 124 */     return this.ultPrezzoEuro;
/*     */   }
/*     */   
/*     */   public void setUltPrezzoEuro(Double ultPrezzoEuro) {
/* 128 */     this.ultPrezzoEuro = ultPrezzoEuro;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataUltPrezzo() {
/* 133 */     return this.dataUltPrezzo;
/*     */   }
/*     */   
/*     */   public void setDataUltPrezzo(Date dataUltPrezzo) {
/* 137 */     this.dataUltPrezzo = dataUltPrezzo;
/*     */   }
/*     */   
/*     */   public Double getCambio() {
/* 141 */     return this.cambio;
/*     */   }
/*     */   
/*     */   public void setCambio(Double cambio) {
/* 145 */     this.cambio = cambio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUserUltimaModifica() {
/* 150 */     return this.userUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModifica(String userUltimaModifica) {
/* 154 */     this.userUltimaModifica = userUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModifica() {
/* 158 */     return this.proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModifica(String proceduraUltimaModifica) {
/* 162 */     this.proceduraUltimaModifica = proceduraUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataUltimaModifica() {
/* 166 */     return this.dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setDataUltimaModifica(Date dataUltimaModifica) {
/* 170 */     this.dataUltimaModifica = dataUltimaModifica;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 174 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 178 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 182 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 186 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 190 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 194 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 198 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 202 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziaria getAttivitaFin() {
/* 207 */     return this.attivitaFin;
/*     */   }
/*     */   
/*     */   public void setAttivitaFin(FinAttivitaFinanziaria attivitaFin) {
/* 211 */     this.attivitaFin = attivitaFin;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 215 */     return (new ToStringBuilder(this)).append("ultPrezzoId", getUltPrezzoId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean equals(Object obj) {
/* 223 */     if (!(obj instanceof FinUltPrezzo))
/*     */     {
/* 225 */       return false;
/*     */     }
/* 227 */     if (this == obj)
/*     */     {
/* 229 */       return true;
/*     */     }
/*     */     
/* 232 */     FinUltPrezzo prezzo = (FinUltPrezzo)obj;
/* 233 */     return (new EqualsBuilder()).append(this.ultPrezzo, prezzo.ultPrezzo).append(this.dataUltPrezzo, prezzo.dataUltPrezzo).append(this.ultPrezzoEuro, prezzo.ultPrezzoEuro).append(this.cambio, prezzo.cambio).isEquals();
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
/*     */   public int hashCode() {
/* 248 */     return (new HashCodeBuilder(13, 41)).append(this.ultPrezzo).append(this.dataUltPrezzo).append(this.ultPrezzoEuro).append(this.cambio).toHashCode();
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
/*     */   public Integer getAttivitaFinId() {
/* 261 */     return this.attivitaFinId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaFinId(Integer attivitaFinId) {
/* 267 */     this.attivitaFinId = attivitaFinId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getDurataMedia() {
/* 275 */     return this.durataMedia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDurataMedia(Double durataMedia) {
/* 283 */     this.durataMedia = durataMedia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getDurataRateo() {
/* 291 */     return this.durataRateo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDurataRateo(Double durataRateo) {
/* 299 */     this.durataRateo = durataRateo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoAdj() {
/* 307 */     return this.prezzoAdj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoAdj(Double prezzoAdj) {
/* 315 */     this.prezzoAdj = prezzoAdj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzoShareEuro() {
/* 323 */     return this.prezzoShareEuro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoShareEuro(Double prezzoShareEuro) {
/* 331 */     this.prezzoShareEuro = prezzoShareEuro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getRateoMaturato() {
/* 339 */     return this.rateoMaturato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRateoMaturato(Double rateoMaturato) {
/* 347 */     this.rateoMaturato = rateoMaturato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagInvioQuot() {
/* 353 */     return this.flagInvioQuot;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagInvioQuot(String flagInvioQuot) {
/* 359 */     this.flagInvioQuot = flagInvioQuot;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinUltPrezzo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */