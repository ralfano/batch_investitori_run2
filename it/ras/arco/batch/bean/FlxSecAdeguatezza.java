/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ 
/*     */ 
/*     */ public class FlxSecAdeguatezza
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*  12 */   public static String DT = "DT";
/*  13 */   public static String FABBRICA = "SEC";
/*     */   
/*     */   public Integer flxId;
/*     */   
/*     */   public Integer ndg;
/*     */   
/*     */   public Integer cfil;
/*     */   
/*     */   public Integer cage;
/*     */   
/*     */   public Integer cprg;
/*     */   public Integer csdp;
/*     */   public String codiceEsperienza;
/*     */   public String descrEsperienza;
/*     */   public String codRischio;
/*     */   public String descrRischio;
/*     */   public String codProfRischio;
/*     */   public String descrProfRischio;
/*     */   public Date dataInizioValidita;
/*     */   public String obiettivoInterno;
/*     */   public String situazioneFinanziaria;
/*     */   public String statoElab;
/*     */   public String istanza;
/*     */   public Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  40 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  47 */     this.descrizioneErrore = descrizioneErrore;
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
/*     */   public FlxSecAdeguatezza() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxSecAdeguatezza(Integer cage, Integer cfil, String esperienza, String rischio, String rischio2, Integer cprg, Integer csdp, Date caricamento, Date validita, String esperienza2, String rischio3, String rischio4, String istanza, Integer ndg, String interno, String finanziaria, String elab) {
/*  77 */     this.cage = cage;
/*  78 */     this.cfil = cfil;
/*  79 */     this.codiceEsperienza = esperienza;
/*  80 */     this.codProfRischio = rischio;
/*  81 */     this.codRischio = rischio2;
/*  82 */     this.cprg = cprg;
/*  83 */     this.csdp = csdp;
/*  84 */     this.dataCaricamento = caricamento;
/*  85 */     this.dataInizioValidita = validita;
/*  86 */     this.descrEsperienza = esperienza2;
/*  87 */     this.descrProfRischio = rischio3;
/*  88 */     this.descrRischio = rischio4;
/*  89 */     this.istanza = istanza;
/*  90 */     this.ndg = ndg;
/*  91 */     this.obiettivoInterno = interno;
/*  92 */     this.situazioneFinanziaria = finanziaria;
/*  93 */     this.statoElab = elab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getDT() {
/*  99 */     return DT;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setDT(String dt) {
/* 105 */     DT = dt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static String getFABBRICA() {
/* 111 */     return FABBRICA;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void setFABBRICA(String fabbrica) {
/* 117 */     FABBRICA = fabbrica;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCage() {
/* 123 */     return this.cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCage(Integer cage) {
/* 129 */     this.cage = cage;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCfil() {
/* 135 */     return this.cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCfil(Integer cfil) {
/* 141 */     this.cfil = cfil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceEsperienza() {
/* 147 */     return this.codiceEsperienza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceEsperienza(String codiceEsperienza) {
/* 153 */     this.codiceEsperienza = codiceEsperienza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodProfRischio() {
/* 159 */     return this.codProfRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodProfRischio(String codProfRischio) {
/* 165 */     this.codProfRischio = codProfRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodRischio() {
/* 171 */     return this.codRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodRischio(String codRischio) {
/* 177 */     this.codRischio = codRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCprg() {
/* 183 */     return this.cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCprg(Integer cprg) {
/* 189 */     this.cprg = cprg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCsdp() {
/* 195 */     return this.csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCsdp(Integer csdp) {
/* 201 */     this.csdp = csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 207 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 213 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioValidita() {
/* 219 */     return this.dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioValidita(Date dataInizioValidita) {
/* 225 */     this.dataInizioValidita = dataInizioValidita;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrEsperienza() {
/* 231 */     return this.descrEsperienza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrEsperienza(String descrEsperienza) {
/* 237 */     this.descrEsperienza = descrEsperienza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrProfRischio() {
/* 243 */     return this.descrProfRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrProfRischio(String descrProfRischio) {
/* 249 */     this.descrProfRischio = descrProfRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrRischio() {
/* 255 */     return this.descrRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrRischio(String descrRischio) {
/* 261 */     this.descrRischio = descrRischio;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 267 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 273 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 279 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 285 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNdg() {
/* 291 */     return this.ndg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdg(Integer ndg) {
/* 297 */     this.ndg = ndg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getObiettivoInterno() {
/* 303 */     return this.obiettivoInterno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setObiettivoInterno(String obiettivoInterno) {
/* 309 */     this.obiettivoInterno = obiettivoInterno;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSituazioneFinanziaria() {
/* 315 */     return this.situazioneFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSituazioneFinanziaria(String situazioneFinanziaria) {
/* 321 */     this.situazioneFinanziaria = situazioneFinanziaria;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 327 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 333 */     this.statoElab = statoElab;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecAdeguatezza.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */