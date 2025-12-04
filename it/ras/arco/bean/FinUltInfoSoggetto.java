/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinUltInfoSoggetto
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer ultInfoSoggId;
/*     */   private FinPromotore promotore;
/*     */   private FinSoggetto soggetto;
/*     */   private String domicilio;
/*     */   private String citta;
/*     */   private String cap;
/*     */   private String prov;
/*     */   private String fax;
/*     */   private String altroRec;
/*     */   private String titoloStudio;
/*     */   private String copAssic;
/*     */   private String statoCivile;
/*     */   private String flagRicezioneSrv;
/*     */   private Integer numeroFigli;
/*     */   private Integer personeACarico;
/*     */   private String fontiInfo;
/*     */   private String interessi;
/*     */   private String note;
/*     */   private String rating1;
/*     */   private String rating2;
/*     */   private String rating3;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinUltInfoSoggetto() {}
/*     */   
/*     */   public FinUltInfoSoggetto(String rec, String cap, String citta, String assic, Date inserimento, String domicilio, String fax, String srv, String info, String interessi, String note, Integer figli, Integer carico, FinPromotore promotore, String prov, String rating1, String rating2, String rating3, FinSoggetto soggetto, String civile, String studio, Integer id, String inserimento2) {
/*  94 */     this.altroRec = rec;
/*  95 */     this.cap = cap;
/*  96 */     this.citta = citta;
/*  97 */     this.copAssic = assic;
/*  98 */     this.dataInserimento = inserimento;
/*  99 */     this.domicilio = domicilio;
/* 100 */     this.fax = fax;
/* 101 */     this.flagRicezioneSrv = srv;
/* 102 */     this.fontiInfo = info;
/* 103 */     this.interessi = interessi;
/* 104 */     this.note = note;
/* 105 */     this.numeroFigli = figli;
/* 106 */     this.personeACarico = carico;
/* 107 */     this.promotore = promotore;
/* 108 */     this.prov = prov;
/* 109 */     this.rating1 = rating1;
/* 110 */     this.rating2 = rating2;
/* 111 */     this.rating3 = rating3;
/* 112 */     this.soggetto = soggetto;
/* 113 */     this.statoCivile = civile;
/* 114 */     this.titoloStudio = studio;
/* 115 */     this.ultInfoSoggId = id;
/* 116 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAltroRec() {
/* 121 */     return this.altroRec;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAltroRec(String altroRec) {
/* 126 */     this.altroRec = altroRec;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCap() {
/* 131 */     return this.cap;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCap(String cap) {
/* 136 */     this.cap = cap;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCitta() {
/* 141 */     return this.citta;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCitta(String citta) {
/* 146 */     this.citta = citta;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getCopAssic() {
/* 151 */     return this.copAssic;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCopAssic(String copAssic) {
/* 156 */     this.copAssic = copAssic;
/*     */   }
/*     */ 
/*     */   
/*     */   public Date getDataInserimento() {
/* 161 */     return this.dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 166 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getDomicilio() {
/* 171 */     return this.domicilio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setDomicilio(String domicilio) {
/* 176 */     this.domicilio = domicilio;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFax() {
/* 181 */     return this.fax;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFax(String fax) {
/* 186 */     this.fax = fax;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFlagRicezioneSrv() {
/* 191 */     return this.flagRicezioneSrv;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFlagRicezioneSrv(String flagRicezioneSrv) {
/* 196 */     this.flagRicezioneSrv = flagRicezioneSrv;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getFontiInfo() {
/* 201 */     return this.fontiInfo;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFontiInfo(String fontiInfo) {
/* 206 */     this.fontiInfo = fontiInfo;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getInteressi() {
/* 211 */     return this.interessi;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setInteressi(String interessi) {
/* 216 */     this.interessi = interessi;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getNote() {
/* 221 */     return this.note;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNote(String note) {
/* 226 */     this.note = note;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getNumeroFigli() {
/* 231 */     return this.numeroFigli;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNumeroFigli(Integer numeroFigli) {
/* 236 */     this.numeroFigli = numeroFigli;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getPersoneACarico() {
/* 241 */     return this.personeACarico;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPersoneACarico(Integer personeACarico) {
/* 246 */     this.personeACarico = personeACarico;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinPromotore getPromotore() {
/* 251 */     return this.promotore;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPromotore(FinPromotore promotore) {
/* 256 */     this.promotore = promotore;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getProv() {
/* 261 */     return this.prov;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setProv(String prov) {
/* 266 */     this.prov = prov;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRating1() {
/* 271 */     return this.rating1;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRating1(String rating1) {
/* 276 */     this.rating1 = rating1;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRating2() {
/* 281 */     return this.rating2;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRating2(String rating2) {
/* 286 */     this.rating2 = rating2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getRating3() {
/* 291 */     return this.rating3;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRating3(String rating3) {
/* 296 */     this.rating3 = rating3;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinSoggetto getSoggetto() {
/* 301 */     return this.soggetto;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSoggetto(FinSoggetto soggetto) {
/* 306 */     this.soggetto = soggetto;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoCivile() {
/* 311 */     return this.statoCivile;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setStatoCivile(String statoCivile) {
/* 316 */     this.statoCivile = statoCivile;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getTitoloStudio() {
/* 321 */     return this.titoloStudio;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTitoloStudio(String titoloStudio) {
/* 326 */     this.titoloStudio = titoloStudio;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getUltInfoSoggId() {
/* 331 */     return this.ultInfoSoggId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUltInfoSoggId(Integer ultInfoSoggId) {
/* 336 */     this.ultInfoSoggId = ultInfoSoggId;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/* 341 */     return this.utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 346 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 350 */     return (new ToStringBuilder(this)).append("ultInfoSoggId", getUltInfoSoggId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FinUltInfoSoggetto copyFields(FinUltInfoSoggetto info) {
/* 356 */     this.altroRec = info.getAltroRec();
/* 357 */     this.cap = info.getCap();
/* 358 */     this.citta = info.getCitta();
/* 359 */     this.copAssic = info.getCopAssic();
/* 360 */     this.dataInserimento = info.getDataInserimento();
/* 361 */     this.domicilio = info.getDomicilio();
/* 362 */     this.fax = info.getFax();
/* 363 */     this.flagRicezioneSrv = info.getFlagRicezioneSrv();
/* 364 */     this.fontiInfo = info.getFontiInfo();
/* 365 */     this.interessi = info.getInteressi();
/* 366 */     this.note = info.getNote();
/* 367 */     this.numeroFigli = info.getNumeroFigli();
/* 368 */     this.personeACarico = info.getPersoneACarico();
/* 369 */     this.promotore = info.getPromotore();
/* 370 */     this.prov = info.getProv();
/* 371 */     this.rating1 = info.getRating1();
/* 372 */     this.rating2 = info.getRating2();
/* 373 */     this.rating3 = info.getRating3();
/* 374 */     this.soggetto = info.getSoggetto();
/* 375 */     this.statoCivile = info.getStatoCivile();
/* 376 */     this.titoloStudio = info.getTitoloStudio();
/* 377 */     this.ultInfoSoggId = info.getUltInfoSoggId();
/* 378 */     this.utenteInserimento = info.getUtenteInserimento();
/* 379 */     this.dataUltimaModificaSlave = new Date();
/* 380 */     this.flagEsistenza = "S";
/* 381 */     this.proceduraUltimaModificaSlave = info.getProceduraUltimaModificaSlave();
/* 382 */     this.tipoUltimaModificaSlave = "U";
/* 383 */     this.userUltimaModificaSlave = info.getUserUltimaModificaSlave();
/* 384 */     return this;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinUltInfoSoggetto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */