/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.ArchBaseUtils;
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang.StringUtils;
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
/*     */ public class FinCertificato
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*  24 */   public static final Integer GIAG_BANCA_DEPOS = new Integer(1);
/*     */   
/*  26 */   public static final Integer GIAG_CLIENTE_ESTERO = new Integer(2);
/*     */   
/*  28 */   public static final Integer GIAG_PRESSO_TERZA_BANCA = new Integer(3);
/*     */   
/*  30 */   public static final Integer GIAG_STRANIERO_NON_CERTIFICATO = new Integer(4);
/*     */   
/*  32 */   public static final Integer GIAG_RITIRATO = new Integer(5);
/*     */ 
/*     */   
/*     */   public static final String ATTIVO = "S";
/*     */ 
/*     */   
/*     */   public static final String NON_ATTIVO = "N";
/*     */ 
/*     */   
/*     */   private Integer certificatoId;
/*     */ 
/*     */   
/*     */   private Integer attivitaFinId;
/*     */ 
/*     */   
/*     */   private Integer soggettoId;
/*     */ 
/*     */   
/*     */   private Integer numCertificato;
/*     */ 
/*     */   
/*     */   private Integer numCertificatoBanca;
/*     */   
/*     */   private Date dataComp;
/*     */   
/*     */   private String tpCertificato;
/*     */   
/*     */   private Integer giacCertificato;
/*     */   
/*     */   private Double quoteCertificate;
/*     */   
/*     */   private Integer numPrestampato;
/*     */   
/*     */   private String codAbi;
/*     */   
/*     */   private String codCab;
/*     */   
/*     */   private Date dataInserimento;
/*     */   
/*     */   private String codLuogoinv;
/*     */   
/*     */   private Date dataRichiesta;
/*     */   
/*     */   private String numDispArco;
/*     */   
/*     */   private String utenteInserimento;
/*     */   
/*     */   private Integer codiceEvidenza;
/*     */   
/*     */   private Date dataInsConEvidenza;
/*     */   
/*     */   private FinPosizione posizione;
/*     */   
/*     */   private Date inizioValidita;
/*     */   
/*     */   private Date fineValidita;
/*     */   
/*     */   private String stato;
/*     */   
/*     */   private Set ordini;
/*     */ 
/*     */   
/*     */   public FinCertificato(Integer codiceEvidenza, Date dataInsConEvidenza, Integer attivitaFinId, Integer posizioneId, Integer soggettoId, Integer numCertificato, Date dataComp, String tpCertificato, Integer giacCertificato, Double quoteCertificate, Integer numPrestampato, String codAbi, String codCab, Date dataInserimento, String codLuogoinv, Date dataRichiesta, String arco, String utenteInserimento, FinPosizione posizione, Set ordini) {
/*  95 */     this.attivitaFinId = attivitaFinId;
/*  96 */     this.soggettoId = soggettoId;
/*  97 */     this.numCertificato = numCertificato;
/*  98 */     this.dataComp = dataComp;
/*  99 */     this.tpCertificato = tpCertificato;
/* 100 */     this.giacCertificato = giacCertificato;
/* 101 */     this.quoteCertificate = quoteCertificate;
/* 102 */     this.numPrestampato = numPrestampato;
/* 103 */     this.codAbi = codAbi;
/* 104 */     this.codCab = codCab;
/* 105 */     this.dataInserimento = dataInserimento;
/* 106 */     this.codLuogoinv = codLuogoinv;
/* 107 */     this.dataRichiesta = dataRichiesta;
/* 108 */     this.numDispArco = arco;
/* 109 */     this.utenteInserimento = utenteInserimento;
/* 110 */     this.codiceEvidenza = codiceEvidenza;
/* 111 */     this.dataInsConEvidenza = dataInsConEvidenza;
/* 112 */     this.posizione = posizione;
/* 113 */     this.ordini = ordini;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinCertificato() {}
/*     */ 
/*     */   
/*     */   public Integer getCertificatoId() {
/* 121 */     return this.certificatoId;
/*     */   }
/*     */   
/*     */   public void setCertificatoId(Integer certificatoId) {
/* 125 */     this.certificatoId = certificatoId;
/*     */   }
/*     */   
/*     */   public Integer getAttivitaFinId() {
/* 129 */     return this.attivitaFinId;
/*     */   }
/*     */   
/*     */   public void setAttivitaFinId(Integer attivitaFinId) {
/* 133 */     this.attivitaFinId = attivitaFinId;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoId() {
/* 137 */     return this.soggettoId;
/*     */   }
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 141 */     this.soggettoId = soggettoId;
/*     */   }
/*     */   
/*     */   public Integer getNumCertificato() {
/* 145 */     return this.numCertificato;
/*     */   }
/*     */   
/*     */   public void setNumCertificato(Integer numCertificato) {
/* 149 */     this.numCertificato = numCertificato;
/*     */   }
/*     */   
/*     */   public Date getDataComp() {
/* 153 */     return this.dataComp;
/*     */   }
/*     */   
/*     */   public void setDataComp(Date dataComp) {
/* 157 */     this.dataComp = dataComp;
/*     */   }
/*     */   
/*     */   public String getTpCertificato() {
/* 161 */     return this.tpCertificato;
/*     */   }
/*     */   
/*     */   public void setTpCertificato(String tpCertificato) {
/* 165 */     this.tpCertificato = tpCertificato;
/*     */   }
/*     */   
/*     */   public Integer getGiacCertificato() {
/* 169 */     return this.giacCertificato;
/*     */   }
/*     */   
/*     */   public void setGiacCertificato(Integer giacCertificato) {
/* 173 */     this.giacCertificato = giacCertificato;
/*     */   }
/*     */   
/*     */   public Double getQuoteCertificate() {
/* 177 */     return this.quoteCertificate;
/*     */   }
/*     */   
/*     */   public void setQuoteCertificate(Double quoteCertificate) {
/* 181 */     this.quoteCertificate = quoteCertificate;
/*     */   }
/*     */   
/*     */   public Integer getNumPrestampato() {
/* 185 */     return this.numPrestampato;
/*     */   }
/*     */   
/*     */   public void setNumPrestampato(Integer numPrestampato) {
/* 189 */     this.numPrestampato = numPrestampato;
/*     */   }
/*     */   
/*     */   public String getCodAbi() {
/* 193 */     return (this.codAbi != null) ? this.codAbi : "";
/*     */   }
/*     */   
/*     */   public void setCodAbi(String codAbi) {
/* 197 */     if (ArchBaseUtils.isValid(codAbi)) {
/* 198 */       codAbi = StringUtils.leftPad(codAbi, 5, "0");
/*     */     }
/* 200 */     this.codAbi = codAbi;
/*     */   }
/*     */   
/*     */   public String getCodCab() {
/* 204 */     return (this.codCab != null) ? this.codCab : "";
/*     */   }
/*     */   
/*     */   public void setCodCab(String codCab) {
/* 208 */     if (ArchBaseUtils.isValid(codCab)) {
/* 209 */       codCab = StringUtils.leftPad(codCab, 5, "0");
/*     */     }
/* 211 */     this.codCab = codCab;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 215 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public String getCodLuogoinv() {
/* 219 */     return this.codLuogoinv;
/*     */   }
/*     */   
/*     */   public void setCodLuogoinv(String codLuogoinv) {
/* 223 */     this.codLuogoinv = codLuogoinv;
/*     */   }
/*     */   
/*     */   public Date getDataRichiesta() {
/* 227 */     return this.dataRichiesta;
/*     */   }
/*     */   
/*     */   public void setDataRichiesta(Date dataRichiesta) {
/* 231 */     this.dataRichiesta = dataRichiesta;
/*     */   }
/*     */   
/*     */   public String getNumDispArco() {
/* 235 */     return this.numDispArco;
/*     */   }
/*     */   
/*     */   public void setNumDispArco(String numDispArco) {
/* 239 */     this.numDispArco = numDispArco;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 243 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 247 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 251 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 255 */     return (new ToStringBuilder(this)).append("certificatoId", getCertificatoId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceEvidenza() {
/* 263 */     return this.codiceEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceEvidenza(Integer codiceEvidenza) {
/* 271 */     this.codiceEvidenza = codiceEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInsConEvidenza() {
/* 278 */     return this.dataInsConEvidenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInsConEvidenza(Date dataInsConEvidenza) {
/* 286 */     this.dataInsConEvidenza = dataInsConEvidenza;
/*     */   }
/*     */   
/*     */   public FinPosizione getPosizione() {
/* 290 */     return this.posizione;
/*     */   }
/*     */   
/*     */   public void setPosizione(FinPosizione posizione) {
/* 294 */     this.posizione = posizione;
/*     */   }
/*     */   
/*     */   public Date getFineValidita() {
/* 298 */     return this.fineValidita;
/*     */   }
/*     */   
/*     */   public void setFineValidita(Date fineValidita) {
/* 302 */     this.fineValidita = fineValidita;
/*     */   }
/*     */   
/*     */   public Date getInizioValidita() {
/* 306 */     return this.inizioValidita;
/*     */   }
/*     */   
/*     */   public void setInizioValidita(Date inizioValidita) {
/* 310 */     this.inizioValidita = inizioValidita;
/*     */   }
/*     */   
/*     */   public String getStato() {
/* 314 */     return this.stato;
/*     */   }
/*     */   
/*     */   public void setStato(String stato) {
/* 318 */     this.stato = stato;
/*     */   }
/*     */   
/*     */   public Integer getNumCertificatoBanca() {
/* 322 */     return this.numCertificatoBanca;
/*     */   }
/*     */   
/*     */   public void setNumCertificatoBanca(Integer numCertificatoBanca) {
/* 326 */     this.numCertificatoBanca = numCertificatoBanca;
/*     */   }
/*     */   
/*     */   public Set getOrdini() {
/* 330 */     return this.ordini;
/*     */   }
/*     */   
/*     */   public void setOrdini(Set ordini) {
/* 334 */     this.ordini = ordini;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCertificato.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */