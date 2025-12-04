/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecSaldiMediMensili
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codpro;
/*     */   private String cc;
/*     */   private Date datmov;
/*     */   private Date datval;
/*     */   private String codope;
/*     */   private Double impmov;
/*     */   private Double gcmedComcli;
/*     */   private Double impspe;
/*     */   private String proswi;
/*     */   private Double pernav;
/*     */   private Date datevi;
/*     */   private String filiale;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxSecSaldiMediMensili(String cc, String codope, String codpro, Date caricamento, Date elaborazione, Date datevi, Date datmov, Date datval, String errore, String filiale, Integer id, Double comcli, Double impmov, Double impspe, String istanza, Double pernav, String proswi, String elab) {
/*  32 */     this.cc = cc;
/*  33 */     this.codope = codope;
/*  34 */     this.codpro = codpro;
/*  35 */     this.dataCaricamento = caricamento;
/*  36 */     this.dataElaborazione = elaborazione;
/*  37 */     this.datevi = datevi;
/*  38 */     this.datmov = datmov;
/*  39 */     this.datval = datval;
/*  40 */     this.descrizioneErrore = errore;
/*  41 */     this.filiale = filiale;
/*  42 */     this.flxId = id;
/*  43 */     this.gcmedComcli = comcli;
/*  44 */     this.impmov = impmov;
/*  45 */     this.impspe = impspe;
/*  46 */     this.istanza = istanza;
/*  47 */     this.pernav = pernav;
/*  48 */     this.proswi = proswi;
/*  49 */     this.statoElab = elab;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/*  53 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/*  57 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  61 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  65 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecSaldiMediMensili() {}
/*     */ 
/*     */   
/*     */   public String getCc() {
/*  74 */     return this.cc;
/*     */   }
/*     */   
/*     */   public void setCc(String cc) {
/*  78 */     this.cc = cc;
/*     */   }
/*     */   
/*     */   public String getCodope() {
/*  82 */     return this.codope;
/*     */   }
/*     */   
/*     */   public void setCodope(String codope) {
/*  86 */     this.codope = codope;
/*     */   }
/*     */   
/*     */   public String getCodpro() {
/*  90 */     return this.codpro;
/*     */   }
/*     */   
/*     */   public void setCodpro(String codpro) {
/*  94 */     this.codpro = codpro;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/*  98 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 102 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDatevi() {
/* 106 */     return this.datevi;
/*     */   }
/*     */   
/*     */   public void setDatevi(Date datevi) {
/* 110 */     this.datevi = datevi;
/*     */   }
/*     */   
/*     */   public Date getDatmov() {
/* 114 */     return this.datmov;
/*     */   }
/*     */   
/*     */   public void setDatmov(Date datmov) {
/* 118 */     this.datmov = datmov;
/*     */   }
/*     */   
/*     */   public Date getDatval() {
/* 122 */     return this.datval;
/*     */   }
/*     */   
/*     */   public void setDatval(Date datval) {
/* 126 */     this.datval = datval;
/*     */   }
/*     */   
/*     */   public String getFiliale() {
/* 130 */     return this.filiale;
/*     */   }
/*     */   
/*     */   public void setFiliale(String filiale) {
/* 134 */     this.filiale = filiale;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 138 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 142 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Double getGcmedComcli() {
/* 146 */     return this.gcmedComcli;
/*     */   }
/*     */   
/*     */   public void setGcmedComcli(Double gcmedComcli) {
/* 150 */     this.gcmedComcli = gcmedComcli;
/*     */   }
/*     */   
/*     */   public Double getImpmov() {
/* 154 */     return this.impmov;
/*     */   }
/*     */   
/*     */   public void setImpmov(Double impmov) {
/* 158 */     this.impmov = impmov;
/*     */   }
/*     */   
/*     */   public Double getImpspe() {
/* 162 */     return this.impspe;
/*     */   }
/*     */   
/*     */   public void setImpspe(Double impspe) {
/* 166 */     this.impspe = impspe;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 170 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 174 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Double getPernav() {
/* 178 */     return this.pernav;
/*     */   }
/*     */   
/*     */   public void setPernav(Double pernav) {
/* 182 */     this.pernav = pernav;
/*     */   }
/*     */   
/*     */   public String getProswi() {
/* 186 */     return this.proswi;
/*     */   }
/*     */   
/*     */   public void setProswi(String proswi) {
/* 190 */     this.proswi = proswi;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 195 */     return this.statoElab;
/*     */   }
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 199 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxSecSaldiMediMensili(String cc, String codope, String codpro, Date caricamento, Date datevi, Date datmov, Date datval, String filiale, Integer id, Double comcli, Double impmov, Double impspe, String istanza, Double pernav, String proswi, String elab) {
/* 204 */     this.cc = cc;
/* 205 */     this.codope = codope;
/* 206 */     this.codpro = codpro;
/* 207 */     this.dataCaricamento = caricamento;
/* 208 */     this.datevi = datevi;
/* 209 */     this.datmov = datmov;
/* 210 */     this.datval = datval;
/* 211 */     this.filiale = filiale;
/* 212 */     this.flxId = id;
/* 213 */     this.gcmedComcli = comcli;
/* 214 */     this.impmov = impmov;
/* 215 */     this.impspe = impspe;
/* 216 */     this.istanza = istanza;
/* 217 */     this.pernav = pernav;
/* 218 */     this.proswi = proswi;
/* 219 */     this.statoElab = elab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecSaldiMediMensili.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */