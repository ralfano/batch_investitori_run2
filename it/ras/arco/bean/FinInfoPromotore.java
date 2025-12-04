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
/*     */ public class FinInfoPromotore
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer soggInfoPromoId;
/*     */   private Integer promotoreId;
/*     */   private Integer soggettoId;
/*     */   private String promoPrinc;
/*     */   private String denominazione;
/*     */   private Integer inizioNome;
/*     */   private String tipoSocieta;
/*     */   private String statoCliPromo;
/*     */   private Date inizStatoCli;
/*     */   private String titolo;
/*     */   private Integer progIndiPrefId;
/*     */   private String mezzoComunPref;
/*     */   private String infoViaSms;
/*     */   private String ecViaEmail;
/*     */   private String classImpoPromo;
/*     */   private String presNote;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinInfoPromotore(Integer promotoreId, Integer soggettoId, String promoPrinc, String denominazione, Integer inizioNome, String tipoSocieta, String statoCliPromo, Date inizStatoCli, String titolo, Integer progIndiPrefId, String mezzoComunPref, String infoViaSms, String ecViaEmail, String classImpoPromo, String presNote, String datiSupl, Date dataInserimento, String utenteInserimento) {
/*  73 */     this.promotoreId = promotoreId;
/*  74 */     this.soggettoId = soggettoId;
/*  75 */     this.promoPrinc = promoPrinc;
/*  76 */     this.denominazione = denominazione;
/*  77 */     this.inizioNome = inizioNome;
/*  78 */     this.tipoSocieta = tipoSocieta;
/*  79 */     this.statoCliPromo = statoCliPromo;
/*  80 */     this.inizStatoCli = inizStatoCli;
/*  81 */     this.titolo = titolo;
/*  82 */     this.progIndiPrefId = progIndiPrefId;
/*  83 */     this.mezzoComunPref = mezzoComunPref;
/*  84 */     this.infoViaSms = infoViaSms;
/*  85 */     this.ecViaEmail = ecViaEmail;
/*  86 */     this.classImpoPromo = classImpoPromo;
/*  87 */     this.presNote = presNote;
/*  88 */     this.datiSupl = datiSupl;
/*  89 */     this.dataInserimento = dataInserimento;
/*  90 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinInfoPromotore() {}
/*     */ 
/*     */   
/*     */   public Integer getSoggInfoPromoId() {
/*  98 */     return this.soggInfoPromoId;
/*     */   }
/*     */   
/*     */   public void setSoggInfoPromoId(Integer soggInfoPromoId) {
/* 102 */     this.soggInfoPromoId = soggInfoPromoId;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreId() {
/* 106 */     return this.promotoreId;
/*     */   }
/*     */   
/*     */   public void setPromotoreId(Integer promotoreId) {
/* 110 */     this.promotoreId = promotoreId;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoId() {
/* 114 */     return this.soggettoId;
/*     */   }
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 118 */     this.soggettoId = soggettoId;
/*     */   }
/*     */   
/*     */   public String getPromoPrinc() {
/* 122 */     return this.promoPrinc;
/*     */   }
/*     */   
/*     */   public void setPromoPrinc(String promoPrinc) {
/* 126 */     this.promoPrinc = promoPrinc;
/*     */   }
/*     */   
/*     */   public String getDenominazione() {
/* 130 */     return this.denominazione;
/*     */   }
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 134 */     this.denominazione = denominazione;
/*     */   }
/*     */   
/*     */   public Integer getInizioNome() {
/* 138 */     return this.inizioNome;
/*     */   }
/*     */   
/*     */   public void setInizioNome(Integer inizioNome) {
/* 142 */     this.inizioNome = inizioNome;
/*     */   }
/*     */   
/*     */   public String getTipoSocieta() {
/* 146 */     return this.tipoSocieta;
/*     */   }
/*     */   
/*     */   public void setTipoSocieta(String tipoSocieta) {
/* 150 */     this.tipoSocieta = tipoSocieta;
/*     */   }
/*     */   
/*     */   public String getStatoCliPromo() {
/* 154 */     return this.statoCliPromo;
/*     */   }
/*     */   
/*     */   public void setStatoCliPromo(String statoCliPromo) {
/* 158 */     this.statoCliPromo = statoCliPromo;
/*     */   }
/*     */   
/*     */   public Date getInizStatoCli() {
/* 162 */     return this.inizStatoCli;
/*     */   }
/*     */   
/*     */   public void setInizStatoCli(Date inizStatoCli) {
/* 166 */     this.inizStatoCli = inizStatoCli;
/*     */   }
/*     */   
/*     */   public String getTitolo() {
/* 170 */     return this.titolo;
/*     */   }
/*     */   
/*     */   public void setTitolo(String titolo) {
/* 174 */     this.titolo = titolo;
/*     */   }
/*     */   
/*     */   public Integer getProgIndiPrefId() {
/* 178 */     return this.progIndiPrefId;
/*     */   }
/*     */   
/*     */   public void setProgIndiPrefId(Integer progIndiPrefId) {
/* 182 */     this.progIndiPrefId = progIndiPrefId;
/*     */   }
/*     */   
/*     */   public String getMezzoComunPref() {
/* 186 */     return this.mezzoComunPref;
/*     */   }
/*     */   
/*     */   public void setMezzoComunPref(String mezzoComunPref) {
/* 190 */     this.mezzoComunPref = mezzoComunPref;
/*     */   }
/*     */   
/*     */   public String getInfoViaSms() {
/* 194 */     return this.infoViaSms;
/*     */   }
/*     */   
/*     */   public void setInfoViaSms(String infoViaSms) {
/* 198 */     this.infoViaSms = infoViaSms;
/*     */   }
/*     */   
/*     */   public String getEcViaEmail() {
/* 202 */     return this.ecViaEmail;
/*     */   }
/*     */   
/*     */   public void setEcViaEmail(String ecViaEmail) {
/* 206 */     this.ecViaEmail = ecViaEmail;
/*     */   }
/*     */   
/*     */   public String getClassImpoPromo() {
/* 210 */     return this.classImpoPromo;
/*     */   }
/*     */   
/*     */   public void setClassImpoPromo(String classImpoPromo) {
/* 214 */     this.classImpoPromo = classImpoPromo;
/*     */   }
/*     */   
/*     */   public String getPresNote() {
/* 218 */     return this.presNote;
/*     */   }
/*     */   
/*     */   public void setPresNote(String presNote) {
/* 222 */     this.presNote = presNote;
/*     */   }
/*     */   
/*     */   public String getDatiSupl() {
/* 226 */     return this.datiSupl;
/*     */   }
/*     */   
/*     */   public void setDatiSupl(String datiSupl) {
/* 230 */     this.datiSupl = datiSupl;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 234 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 238 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 242 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 246 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 250 */     return (new ToStringBuilder(this)).append("soggInfoPromoId", getSoggInfoPromoId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinInfoPromotore.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */