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
/*     */ public class FinDistretto
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private int distrettoId;
/*     */   private String codRete;
/*     */   private String codCompagnia;
/*     */   private String codDistretto;
/*     */   private String desDistretto;
/*     */   private String comune;
/*     */   private String provincia;
/*     */   private String desProvincia;
/*     */   private String regioneCommerciale;
/*     */   private Date dataInizioValidita;
/*     */   private Date dataFineValidita;
/*     */   private String statoElaborazione;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public String getCodCompagnia() {
/*  38 */     return this.codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodCompagnia(String codCompagnia) {
/*  49 */     this.codCompagnia = codCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodDistretto() {
/*  60 */     return this.codDistretto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodDistretto(String codDistretto) {
/*  71 */     this.codDistretto = codDistretto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodRete() {
/*  82 */     return this.codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodRete(String codRete) {
/*  93 */     this.codRete = codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getComune() {
/* 104 */     return this.comune;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setComune(String comune) {
/* 115 */     this.comune = comune;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFineValidita() {
/* 126 */     return this.dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFineValidita(Date dataFineValidita) {
/* 137 */     this.dataFineValidita = dataFineValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioValidita() {
/* 148 */     return this.dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioValidita(Date dataInizioValidita) {
/* 159 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 170 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 181 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDesDistretto() {
/* 192 */     return this.desDistretto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDesDistretto(String desDistretto) {
/* 203 */     this.desDistretto = desDistretto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDesProvincia() {
/* 214 */     return this.desProvincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDesProvincia(String desProvincia) {
/* 225 */     this.desProvincia = desProvincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getDistrettoId() {
/* 236 */     return this.distrettoId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDistrettoId(int distrettoId) {
/* 247 */     this.distrettoId = distrettoId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvincia() {
/* 258 */     return this.provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 269 */     this.provincia = provincia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRegioneCommerciale() {
/* 280 */     return this.regioneCommerciale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRegioneCommerciale(String regioneCommerciale) {
/* 291 */     this.regioneCommerciale = regioneCommerciale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 302 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 313 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 321 */     return this.statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 330 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinDistretto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */