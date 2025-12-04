/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinAnagPolizza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contrattoId;
/*     */   private Integer anagPolizzaId;
/*     */   private Integer soggettoId;
/*     */   private String tipoAnag;
/*     */   private String intestazione;
/*     */   private String sesso;
/*     */   private Date dataNascita;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Integer etaComp;
/*     */   private FinPolizza polizza;
/*     */   
/*     */   public FinAnagPolizza() {}
/*     */   
/*     */   public Date getDataInserimento() {
/*  29 */     return this.dataInserimento;
/*     */   }
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  32 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   public Date getDataNascita() {
/*  35 */     return this.dataNascita;
/*     */   }
/*     */   public void setDataNascita(Date dataNascita) {
/*  38 */     this.dataNascita = dataNascita;
/*     */   }
/*     */   public Integer getEtaComp() {
/*  41 */     return this.etaComp;
/*     */   }
/*     */   public void setEtaComp(Integer etaComp) {
/*  44 */     this.etaComp = etaComp;
/*     */   }
/*     */   public String getIntestazione() {
/*  47 */     return this.intestazione;
/*     */   }
/*     */   public void setIntestazione(String intestazione) {
/*  50 */     this.intestazione = intestazione;
/*     */   }
/*     */   public String getSesso() {
/*  53 */     return this.sesso;
/*     */   }
/*     */   public void setSesso(String sesso) {
/*  56 */     this.sesso = sesso;
/*     */   }
/*     */   public Integer getSoggettoId() {
/*  59 */     return this.soggettoId;
/*     */   }
/*     */   public void setSoggettoId(Integer soggettoId) {
/*  62 */     this.soggettoId = soggettoId;
/*     */   }
/*     */   public String getTipoAnag() {
/*  65 */     return this.tipoAnag;
/*     */   }
/*     */   public void setTipoAnag(String tipoAnag) {
/*  68 */     this.tipoAnag = tipoAnag;
/*     */   }
/*     */   public String getUtenteInserimento() {
/*  71 */     return this.utenteInserimento;
/*     */   }
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  74 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinAnagPolizza(Integer id, Integer id2, Date inserimento, Date nascita, Integer comp, String intestazione, FinPolizza polizza, String sesso, Integer id3, String anag, String inserimento2) {
/*  79 */     this.anagPolizzaId = id;
/*  80 */     this.contrattoId = id2;
/*  81 */     this.dataInserimento = inserimento;
/*  82 */     this.dataNascita = nascita;
/*  83 */     this.etaComp = comp;
/*  84 */     this.intestazione = intestazione;
/*  85 */     this.polizza = polizza;
/*  86 */     this.sesso = sesso;
/*  87 */     this.soggettoId = id3;
/*  88 */     this.tipoAnag = anag;
/*  89 */     this.utenteInserimento = inserimento2;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getAnagPolizzaId() {
/*  94 */     return this.anagPolizzaId;
/*     */   }
/*     */   
/*     */   public void setAnagPolizzaId(Integer anagPolizzaId) {
/*  98 */     this.anagPolizzaId = anagPolizzaId;
/*     */   }
/*     */ 
/*     */   
/*     */   public FinPolizza getPolizza() {
/* 103 */     return this.polizza;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setPolizza(FinPolizza polizza) {
/* 108 */     this.polizza = polizza;
/*     */   }
/*     */ 
/*     */   
/*     */   public Integer getContrattoId() {
/* 113 */     return this.contrattoId;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 118 */     this.contrattoId = contrattoId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAnagPolizza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */