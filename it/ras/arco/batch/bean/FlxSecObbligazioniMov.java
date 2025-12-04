/*     */ package it.ras.arco.batch.bean;
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
/*     */ public class FlxSecObbligazioniMov
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String ndg;
/*     */   private String codProm;
/*     */   private String codRete;
/*     */   private String fil;
/*     */   private String deposito;
/*     */   private String csdp;
/*     */   private Date dataOrdine;
/*     */   private String ctit;
/*     */   private String nregter;
/*     */   private Integer nregann;
/*     */   private Integer nregnum;
/*     */   private Integer nregsnr;
/*     */   private String ccau;
/*     */   private Integer cstt;
/*     */   private Date dreg;
/*     */   private Date dval;
/*     */   private Double quantitaAssegnata;
/*     */   private Double controvalore;
/*     */   private Double prezzo;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public FlxSecObbligazioniMov() {}
/*     */   
/*     */   public String getCcau() {
/*  49 */     return this.ccau;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCcau(String ccau) {
/*  55 */     this.ccau = ccau;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodProm() {
/*  61 */     return this.codProm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodProm(String codProm) {
/*  67 */     this.codProm = codProm;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodRete() {
/*  73 */     return this.codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodRete(String codRete) {
/*  79 */     this.codRete = codRete;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getControvalore() {
/*  85 */     return this.controvalore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setControvalore(Double controvalore) {
/*  91 */     this.controvalore = controvalore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCsdp() {
/*  97 */     return this.csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCsdp(String csdp) {
/* 103 */     this.csdp = csdp;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCstt() {
/* 109 */     return this.cstt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCstt(Integer cstt) {
/* 115 */     this.cstt = cstt;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCtit() {
/* 121 */     return this.ctit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCtit(String ctit) {
/* 127 */     this.ctit = ctit;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 133 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 139 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataElab() {
/* 145 */     return this.dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataElab(Date dataElab) {
/* 151 */     this.dataElab = dataElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataOrdine() {
/* 157 */     return this.dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataOrdine(Date dataOrdine) {
/* 163 */     this.dataOrdine = dataOrdine;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDeposito() {
/* 169 */     return this.deposito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDeposito(String deposito) {
/* 175 */     this.deposito = deposito;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 181 */     return this.descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 187 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDreg() {
/* 193 */     return this.dreg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDreg(Date dreg) {
/* 199 */     this.dreg = dreg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDval() {
/* 205 */     return this.dval;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDval(Date dval) {
/* 211 */     this.dval = dval;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFil() {
/* 217 */     return this.fil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFil(String fil) {
/* 223 */     this.fil = fil;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 229 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 235 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 241 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 247 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNdg() {
/* 253 */     return this.ndg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNdg(String ndg) {
/* 259 */     this.ndg = ndg;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNregann() {
/* 265 */     return this.nregann;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNregann(Integer nregann) {
/* 271 */     this.nregann = nregann;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNregnum() {
/* 277 */     return this.nregnum;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNregnum(Integer nregnum) {
/* 283 */     this.nregnum = nregnum;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getNregsnr() {
/* 289 */     return this.nregsnr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNregsnr(Integer nregsnr) {
/* 295 */     this.nregsnr = nregsnr;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNregter() {
/* 301 */     return this.nregter;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNregter(String nregter) {
/* 307 */     this.nregter = nregter;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPrezzo() {
/* 313 */     return this.prezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzo(Double prezzo) {
/* 319 */     this.prezzo = prezzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getQuantitaAssegnata() {
/* 325 */     return this.quantitaAssegnata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuantitaAssegnata(Double quantitaAssegnata) {
/* 331 */     this.quantitaAssegnata = quantitaAssegnata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 337 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 343 */     this.statoElab = statoElab;
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
/*     */   public FlxSecObbligazioniMov(String ccau, String prom, String rete, Double controvalore, String csdp, Integer cstt, String ctit, Date caricamento, Date elab, Date ordine, String deposito, String errore, Date dreg, Date dval, String fil, Integer id, String istanza, String ndg, Integer nregann, Integer nregnum, Integer nregsnr, String nregter, Double prezzo, Double assegnata, String elab2) {
/* 374 */     this.ccau = ccau;
/* 375 */     this.codProm = prom;
/* 376 */     this.codRete = rete;
/* 377 */     this.controvalore = controvalore;
/* 378 */     this.csdp = csdp;
/* 379 */     this.cstt = cstt;
/* 380 */     this.ctit = ctit;
/* 381 */     this.dataCaricamento = caricamento;
/* 382 */     this.dataElab = elab;
/* 383 */     this.dataOrdine = ordine;
/* 384 */     this.deposito = deposito;
/* 385 */     this.descrizioneErrore = errore;
/* 386 */     this.dreg = dreg;
/* 387 */     this.dval = dval;
/* 388 */     this.fil = fil;
/* 389 */     this.flxId = id;
/* 390 */     this.istanza = istanza;
/* 391 */     this.ndg = ndg;
/* 392 */     this.nregann = nregann;
/* 393 */     this.nregnum = nregnum;
/* 394 */     this.nregsnr = nregsnr;
/* 395 */     this.nregter = nregter;
/* 396 */     this.prezzo = prezzo;
/* 397 */     this.quantitaAssegnata = assegnata;
/* 398 */     this.statoElab = elab2;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxSecObbligazioniMov.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */