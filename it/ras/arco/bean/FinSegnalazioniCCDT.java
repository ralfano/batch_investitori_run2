/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ public class FinSegnalazioniCCDT
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer segnalazioniCCDTId;
/*     */   private String tiposegnalazione;
/*     */   private Double importo;
/*     */   private String versatoPresso;
/*     */   private String assegno;
/*     */   private String serieeNumero;
/*     */   private String numeroConto;
/*     */   private String descrizioneBonifico;
/*     */   private String soggettoEffettuante;
/*     */   private String dispAllegatacontr;
/*     */   private String regime;
/*     */   private String indirizzoBanca;
/*     */   private String tuttiITitoli;
/*     */   private String bonusTitoli;
/*     */   private String soggettoAFavoreNome;
/*     */   private String numeroContoOrd;
/*     */   private String bancaOrd;
/*     */   private FinPratica pratica;
/*     */   private FinSoggettoBozza soggettoBozza;
/*     */   private Set titoli;
/*     */   private Date dataeOraInserimento;
/*     */   private String flagEsistenza;
/*     */   private String utenteInserimento;
/*     */   private String tipoUltimaModifica;
/*     */   private String userUltimaModificaSlave;
/*     */   private Date dataInserimento;
/*     */   
/*     */   public Date getDataInserimento() {
/*  66 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  70 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSegnalazioniCCDT(String esistenza, Set praticabozza, String slave, FinPromotore promotore, Integer id, FinSoggetto soggetto, Set bozza, String operazione, String modifica, String slave2, String inserimento) {
/*  76 */     this.flagEsistenza = esistenza;
/*  77 */     this.proceduraUltimaModificaSlave = slave;
/*  78 */     this.segnalazioniCCDTId = id;
/*  79 */     this.tipoUltimaModifica = modifica;
/*  80 */     this.userUltimaModificaSlave = slave2;
/*  81 */     this.utenteInserimento = inserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinSegnalazioniCCDT() {}
/*     */ 
/*     */   
/*     */   public String getFlagEsistenza() {
/*  90 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/*  94 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/*  98 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 102 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String getProceduraUltimaModificaSlave() {
/* 106 */     return this.proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setProceduraUltimaModificaSlave(String proceduraUltimaModificaSlave) {
/* 110 */     this.proceduraUltimaModificaSlave = proceduraUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public String getTipoUltimaModifica() {
/* 114 */     return this.tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public void setTipoUltimaModifica(String tipoUltimaModifica) {
/* 118 */     this.tipoUltimaModifica = tipoUltimaModifica;
/*     */   }
/*     */   
/*     */   public String getUserUltimaModificaSlave() {
/* 122 */     return this.userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public void setUserUltimaModificaSlave(String userUltimaModificaSlave) {
/* 126 */     this.userUltimaModificaSlave = userUltimaModificaSlave;
/*     */   }
/*     */   
/*     */   public Integer getSegnalazioniCCDTId() {
/* 130 */     return this.segnalazioniCCDTId;
/*     */   }
/*     */   
/*     */   public void setSegnalazioniCCDTId(Integer segnalazioniCCDTId) {
/* 134 */     this.segnalazioniCCDTId = segnalazioniCCDTId;
/*     */   }
/*     */   
/*     */   public String getAssegno() {
/* 138 */     return this.assegno;
/*     */   }
/*     */   
/*     */   public void setAssegno(String assegno) {
/* 142 */     this.assegno = assegno;
/*     */   }
/*     */   
/*     */   public String getBonusTitoli() {
/* 146 */     return this.bonusTitoli;
/*     */   }
/*     */   
/*     */   public void setBonusTitoli(String bonusTitoli) {
/* 150 */     this.bonusTitoli = bonusTitoli;
/*     */   }
/*     */   
/*     */   public String getDescrizioneBonifico() {
/* 154 */     return this.descrizioneBonifico;
/*     */   }
/*     */   
/*     */   public void setDescrizioneBonifico(String descrizioneBonifico) {
/* 158 */     this.descrizioneBonifico = descrizioneBonifico;
/*     */   }
/*     */   
/*     */   public String getDispAllegatacontr() {
/* 162 */     return this.dispAllegatacontr;
/*     */   }
/*     */   
/*     */   public void setDispAllegatacontr(String dispAllegatacontr) {
/* 166 */     this.dispAllegatacontr = dispAllegatacontr;
/*     */   }
/*     */   
/*     */   public Double getImporto() {
/* 170 */     return this.importo;
/*     */   }
/*     */   
/*     */   public void setImporto(Double importo) {
/* 174 */     this.importo = importo;
/*     */   }
/*     */   
/*     */   public String getIndirizzoBanca() {
/* 178 */     return this.indirizzoBanca;
/*     */   }
/*     */   
/*     */   public void setIndirizzoBanca(String indirizzoBanca) {
/* 182 */     this.indirizzoBanca = indirizzoBanca;
/*     */   }
/*     */   
/*     */   public String getNumeroConto() {
/* 186 */     return this.numeroConto;
/*     */   }
/*     */   
/*     */   public void setNumeroConto(String numeroConto) {
/* 190 */     this.numeroConto = numeroConto;
/*     */   }
/*     */   
/*     */   public String getRegime() {
/* 194 */     return this.regime;
/*     */   }
/*     */   
/*     */   public void setRegime(String regime) {
/* 198 */     this.regime = regime;
/*     */   }
/*     */   
/*     */   public String getSerieeNumero() {
/* 202 */     return this.serieeNumero;
/*     */   }
/*     */   
/*     */   public void setSerieeNumero(String serieeNumero) {
/* 206 */     this.serieeNumero = serieeNumero;
/*     */   }
/*     */   
/*     */   public String getSoggettoAFavoreNome() {
/* 210 */     return this.soggettoAFavoreNome;
/*     */   }
/*     */   
/*     */   public void setSoggettoAFavoreNome(String soggettoAFavoreNome) {
/* 214 */     this.soggettoAFavoreNome = soggettoAFavoreNome;
/*     */   }
/*     */   
/*     */   public String getSoggettoEffettuante() {
/* 218 */     return this.soggettoEffettuante;
/*     */   }
/*     */   
/*     */   public void setSoggettoEffettuante(String soggettoEffettuante) {
/* 222 */     this.soggettoEffettuante = soggettoEffettuante;
/*     */   }
/*     */   
/*     */   public String getTiposegnalazione() {
/* 226 */     return this.tiposegnalazione;
/*     */   }
/*     */   
/*     */   public void setTiposegnalazione(String tiposegnalazione) {
/* 230 */     this.tiposegnalazione = tiposegnalazione;
/*     */   }
/*     */   
/*     */   public String getTuttiITitoli() {
/* 234 */     return this.tuttiITitoli;
/*     */   }
/*     */   
/*     */   public void setTuttiITitoli(String tuttiITitoli) {
/* 238 */     this.tuttiITitoli = tuttiITitoli;
/*     */   }
/*     */   
/*     */   public String getVersatoPresso() {
/* 242 */     return this.versatoPresso;
/*     */   }
/*     */   
/*     */   public void setVersatoPresso(String versatoPresso) {
/* 246 */     this.versatoPresso = versatoPresso;
/*     */   }
/*     */   
/*     */   public FinPratica getPratica() {
/* 250 */     return this.pratica;
/*     */   }
/*     */   
/*     */   public void setPratica(FinPratica pratica) {
/* 254 */     this.pratica = pratica;
/*     */   }
/*     */   
/*     */   public FinSoggettoBozza getSoggettoBozza() {
/* 258 */     return this.soggettoBozza;
/*     */   }
/*     */   
/*     */   public void setSoggettoBozza(FinSoggettoBozza soggettoBozza) {
/* 262 */     this.soggettoBozza = soggettoBozza;
/*     */   }
/*     */   
/*     */   public Set getTitoli() {
/* 266 */     return this.titoli;
/*     */   }
/*     */   
/*     */   public void setTitoli(Set titoli) {
/* 270 */     this.titoli = titoli;
/*     */   }
/*     */   
/*     */   public String getBancaOrd() {
/* 274 */     return this.bancaOrd;
/*     */   }
/*     */   
/*     */   public void setBancaOrd(String bancaOrd) {
/* 278 */     this.bancaOrd = bancaOrd;
/*     */   }
/*     */   
/*     */   public String getNumeroContoOrd() {
/* 282 */     return this.numeroContoOrd;
/*     */   }
/*     */   
/*     */   public void setNumeroContoOrd(String numeroContoOrd) {
/* 286 */     this.numeroContoOrd = numeroContoOrd;
/*     */   }
/*     */   
/*     */   public Date getDataeOraInserimento() {
/* 290 */     return this.dataeOraInserimento;
/*     */   }
/*     */   
/*     */   public void setDataeOraInserimento(Date dataeOraInserimento) {
/* 294 */     this.dataeOraInserimento = dataeOraInserimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinSegnalazioniCCDT.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */