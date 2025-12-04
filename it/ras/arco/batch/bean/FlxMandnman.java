/*     */ package it.ras.arco.batch.bean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxMandnman
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer contratti_id;
/*     */   private Date dtulm;
/*     */   private String utent;
/*     */   private String keypr;
/*     */   private String fondo;
/*     */   private String manda;
/*     */   private String ckdig;
/*     */   private String baren;
/*     */   private String numco;
/*     */   private String tppia;
/*     */   private String clcli;
/*     */   private Date dtdem;
/*     */   private Date dtist;
/*     */   private String stman;
/*     */   private String numos;
/*     */   private String dupia;
/*     */   private String nuvmp;
/*     */   private Double toinv;
/*     */   private String modal;
/*     */   private Double imvmu;
/*     */   private String frece;
/*     */   private String pever;
/*     */   private Double cospe;
/*     */   private String facor;
/*     */   private Date dtcop;
/*     */   private Date dtscv;
/*     */   private String evide;
/*     */   private Date dtevi;
/*     */   private String compa;
/*     */   private String ageco;
/*     */   private String coret;
/*     */   private String adage;
/*     */   private String adspl;
/*     */   private Date dtria;
/*     */   private String conve;
/*     */   private Double totac;
/*     */   private Double qutoa;
/*     */   private Double qutoc;
/*     */   private String codcc;
/*     */   private String prove;
/*     */   private Double eccrt;
/*     */   private Double qutun;
/*     */   private String dtesv;
/*     */   private Date dtmtu;
/*     */   private String famig;
/*     */   private String cdsgr;
/*     */   private Double qublo;
/*     */   private String flman;
/*     */   private Date dtupr;
/*     */   private String codsq;
/*     */   private String classe;
/*     */   private String manrf;
/*     */   private String gstdStatoElab;
/*     */   private String istanza;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElaborazione;
/*     */   
/*     */   public FlxMandnman(Date dtulm, String utent, String keypr, String fondo, String manda, String ckdig, String baren, String numco, String tppia, String clcli, Date dtdem, Date dtist, String stman, String numos, String dupia, String nuvmp, Double toinv, String modal, Double imvmu, String frece, String pever, Double cospe, String facor, Date dtcop, Date dtscv, String evide, Date dtevi, String compa, String ageco, String coret, String adage, String adspl, Date dtria, String conve, Double totac, Double qutoa, Double qutoc, String codcc, String prove, Double eccrt, Double qutun, String dtesv, Date dtmtu, String famig, String cdsgr, Double qublo, String flman, Date dtupr, String codsq, String classe, String manrf, String gstdStatoElab, String istanza) {
/* 184 */     this.dtulm = dtulm;
/* 185 */     this.utent = utent;
/* 186 */     this.keypr = keypr;
/* 187 */     this.fondo = fondo;
/* 188 */     this.manda = manda;
/* 189 */     this.ckdig = ckdig;
/* 190 */     this.baren = baren;
/* 191 */     this.numco = numco;
/* 192 */     this.tppia = tppia;
/* 193 */     this.clcli = clcli;
/* 194 */     this.dtdem = dtdem;
/* 195 */     this.dtist = dtist;
/* 196 */     this.stman = stman;
/* 197 */     this.numos = numos;
/* 198 */     this.dupia = dupia;
/* 199 */     this.nuvmp = nuvmp;
/* 200 */     this.toinv = toinv;
/* 201 */     this.modal = modal;
/* 202 */     this.imvmu = imvmu;
/* 203 */     this.frece = frece;
/* 204 */     this.pever = pever;
/* 205 */     this.cospe = cospe;
/* 206 */     this.facor = facor;
/* 207 */     this.dtcop = dtcop;
/* 208 */     this.dtscv = dtscv;
/* 209 */     this.evide = evide;
/* 210 */     this.dtevi = dtevi;
/* 211 */     this.compa = compa;
/* 212 */     this.ageco = ageco;
/* 213 */     this.coret = coret;
/* 214 */     this.adage = adage;
/* 215 */     this.adspl = adspl;
/* 216 */     this.dtria = dtria;
/* 217 */     this.conve = conve;
/* 218 */     this.totac = totac;
/* 219 */     this.qutoa = qutoa;
/* 220 */     this.qutoc = qutoc;
/* 221 */     this.codcc = codcc;
/* 222 */     this.prove = prove;
/* 223 */     this.eccrt = eccrt;
/* 224 */     this.qutun = qutun;
/* 225 */     this.dtesv = dtesv;
/* 226 */     this.dtmtu = dtmtu;
/* 227 */     this.famig = famig;
/* 228 */     this.cdsgr = cdsgr;
/* 229 */     this.qublo = qublo;
/* 230 */     this.flman = flman;
/* 231 */     this.dtupr = dtupr;
/* 232 */     this.codsq = codsq;
/* 233 */     this.classe = classe;
/* 234 */     this.manrf = manrf;
/* 235 */     this.gstdStatoElab = gstdStatoElab;
/* 236 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxMandnman() {}
/*     */ 
/*     */   
/*     */   public Integer getContratti_id() {
/* 244 */     return this.contratti_id;
/*     */   }
/*     */   
/*     */   public void setContratti_id(Integer contratti_id) {
/* 248 */     this.contratti_id = contratti_id;
/*     */   }
/*     */   
/*     */   public Date getDtulm() {
/* 252 */     return this.dtulm;
/*     */   }
/*     */   
/*     */   public void setDtulm(Date dtulm) {
/* 256 */     this.dtulm = dtulm;
/*     */   }
/*     */   
/*     */   public String getUtent() {
/* 260 */     return this.utent;
/*     */   }
/*     */   
/*     */   public void setUtent(String utent) {
/* 264 */     this.utent = utent;
/*     */   }
/*     */   
/*     */   public String getKeypr() {
/* 268 */     return this.keypr;
/*     */   }
/*     */   
/*     */   public void setKeypr(String keypr) {
/* 272 */     this.keypr = keypr;
/*     */   }
/*     */   
/*     */   public String getFondo() {
/* 276 */     return this.fondo;
/*     */   }
/*     */   
/*     */   public void setFondo(String fondo) {
/* 280 */     this.fondo = fondo;
/*     */   }
/*     */   
/*     */   public String getManda() {
/* 284 */     return this.manda;
/*     */   }
/*     */   
/*     */   public void setManda(String manda) {
/* 288 */     this.manda = manda;
/*     */   }
/*     */   
/*     */   public String getCkdig() {
/* 292 */     return this.ckdig;
/*     */   }
/*     */   
/*     */   public void setCkdig(String ckdig) {
/* 296 */     this.ckdig = ckdig;
/*     */   }
/*     */   
/*     */   public String getBaren() {
/* 300 */     return this.baren;
/*     */   }
/*     */   
/*     */   public void setBaren(String baren) {
/* 304 */     this.baren = baren;
/*     */   }
/*     */   
/*     */   public String getNumco() {
/* 308 */     return this.numco;
/*     */   }
/*     */   
/*     */   public void setNumco(String numco) {
/* 312 */     this.numco = numco;
/*     */   }
/*     */   
/*     */   public String getTppia() {
/* 316 */     return this.tppia;
/*     */   }
/*     */   
/*     */   public void setTppia(String tppia) {
/* 320 */     this.tppia = tppia;
/*     */   }
/*     */   
/*     */   public String getClcli() {
/* 324 */     return this.clcli;
/*     */   }
/*     */   
/*     */   public void setClcli(String clcli) {
/* 328 */     this.clcli = clcli;
/*     */   }
/*     */   
/*     */   public Date getDtdem() {
/* 332 */     return this.dtdem;
/*     */   }
/*     */   
/*     */   public void setDtdem(Date dtdem) {
/* 336 */     this.dtdem = dtdem;
/*     */   }
/*     */   
/*     */   public Date getDtist() {
/* 340 */     return this.dtist;
/*     */   }
/*     */   
/*     */   public void setDtist(Date dtist) {
/* 344 */     this.dtist = dtist;
/*     */   }
/*     */   
/*     */   public String getStman() {
/* 348 */     return this.stman;
/*     */   }
/*     */   
/*     */   public void setStman(String stman) {
/* 352 */     this.stman = stman;
/*     */   }
/*     */   
/*     */   public String getNumos() {
/* 356 */     return this.numos;
/*     */   }
/*     */   
/*     */   public void setNumos(String numos) {
/* 360 */     this.numos = numos;
/*     */   }
/*     */   
/*     */   public String getDupia() {
/* 364 */     return this.dupia;
/*     */   }
/*     */   
/*     */   public void setDupia(String dupia) {
/* 368 */     this.dupia = dupia;
/*     */   }
/*     */   
/*     */   public String getNuvmp() {
/* 372 */     return this.nuvmp;
/*     */   }
/*     */   
/*     */   public void setNuvmp(String nuvmp) {
/* 376 */     this.nuvmp = nuvmp;
/*     */   }
/*     */   
/*     */   public Double getToinv() {
/* 380 */     return this.toinv;
/*     */   }
/*     */   
/*     */   public void setToinv(Double toinv) {
/* 384 */     this.toinv = toinv;
/*     */   }
/*     */   
/*     */   public String getModal() {
/* 388 */     return this.modal;
/*     */   }
/*     */   
/*     */   public void setModal(String modal) {
/* 392 */     this.modal = modal;
/*     */   }
/*     */   
/*     */   public Double getImvmu() {
/* 396 */     return this.imvmu;
/*     */   }
/*     */   
/*     */   public void setImvmu(Double imvmu) {
/* 400 */     this.imvmu = imvmu;
/*     */   }
/*     */   
/*     */   public String getFrece() {
/* 404 */     return this.frece;
/*     */   }
/*     */   
/*     */   public void setFrece(String frece) {
/* 408 */     this.frece = frece;
/*     */   }
/*     */   
/*     */   public String getPever() {
/* 412 */     return this.pever;
/*     */   }
/*     */   
/*     */   public void setPever(String pever) {
/* 416 */     this.pever = pever;
/*     */   }
/*     */   
/*     */   public Double getCospe() {
/* 420 */     return this.cospe;
/*     */   }
/*     */   
/*     */   public void setCospe(Double cospe) {
/* 424 */     this.cospe = cospe;
/*     */   }
/*     */   
/*     */   public String getFacor() {
/* 428 */     return this.facor;
/*     */   }
/*     */   
/*     */   public void setFacor(String facor) {
/* 432 */     this.facor = facor;
/*     */   }
/*     */   
/*     */   public Date getDtcop() {
/* 436 */     return this.dtcop;
/*     */   }
/*     */   
/*     */   public void setDtcop(Date dtcop) {
/* 440 */     this.dtcop = dtcop;
/*     */   }
/*     */   
/*     */   public Date getDtscv() {
/* 444 */     return this.dtscv;
/*     */   }
/*     */   
/*     */   public void setDtscv(Date dtscv) {
/* 448 */     this.dtscv = dtscv;
/*     */   }
/*     */   
/*     */   public String getEvide() {
/* 452 */     return this.evide;
/*     */   }
/*     */   
/*     */   public void setEvide(String evide) {
/* 456 */     this.evide = evide;
/*     */   }
/*     */   
/*     */   public Date getDtevi() {
/* 460 */     return this.dtevi;
/*     */   }
/*     */   
/*     */   public void setDtevi(Date dtevi) {
/* 464 */     this.dtevi = dtevi;
/*     */   }
/*     */   
/*     */   public String getCompa() {
/* 468 */     return this.compa;
/*     */   }
/*     */   
/*     */   public void setCompa(String compa) {
/* 472 */     this.compa = compa;
/*     */   }
/*     */   
/*     */   public String getAgeco() {
/* 476 */     return this.ageco;
/*     */   }
/*     */   
/*     */   public void setAgeco(String ageco) {
/* 480 */     this.ageco = ageco;
/*     */   }
/*     */   
/*     */   public String getCoret() {
/* 484 */     return this.coret;
/*     */   }
/*     */   
/*     */   public void setCoret(String coret) {
/* 488 */     this.coret = coret;
/*     */   }
/*     */   
/*     */   public String getAdage() {
/* 492 */     return this.adage;
/*     */   }
/*     */   
/*     */   public void setAdage(String adage) {
/* 496 */     this.adage = adage;
/*     */   }
/*     */   
/*     */   public String getAdspl() {
/* 500 */     return this.adspl;
/*     */   }
/*     */   
/*     */   public void setAdspl(String adspl) {
/* 504 */     this.adspl = adspl;
/*     */   }
/*     */   
/*     */   public Date getDtria() {
/* 508 */     return this.dtria;
/*     */   }
/*     */   
/*     */   public void setDtria(Date dtria) {
/* 512 */     this.dtria = dtria;
/*     */   }
/*     */   
/*     */   public String getConve() {
/* 516 */     return this.conve;
/*     */   }
/*     */   
/*     */   public void setConve(String conve) {
/* 520 */     this.conve = conve;
/*     */   }
/*     */   
/*     */   public Double getTotac() {
/* 524 */     return this.totac;
/*     */   }
/*     */   
/*     */   public void setTotac(Double totac) {
/* 528 */     this.totac = totac;
/*     */   }
/*     */   
/*     */   public Double getQutoa() {
/* 532 */     return this.qutoa;
/*     */   }
/*     */   
/*     */   public void setQutoa(Double qutoa) {
/* 536 */     this.qutoa = qutoa;
/*     */   }
/*     */   
/*     */   public Double getQutoc() {
/* 540 */     return this.qutoc;
/*     */   }
/*     */   
/*     */   public void setQutoc(Double qutoc) {
/* 544 */     this.qutoc = qutoc;
/*     */   }
/*     */   
/*     */   public String getCodcc() {
/* 548 */     return this.codcc;
/*     */   }
/*     */   
/*     */   public void setCodcc(String codcc) {
/* 552 */     this.codcc = codcc;
/*     */   }
/*     */   
/*     */   public String getProve() {
/* 556 */     return this.prove;
/*     */   }
/*     */   
/*     */   public void setProve(String prove) {
/* 560 */     this.prove = prove;
/*     */   }
/*     */   
/*     */   public Double getEccrt() {
/* 564 */     return this.eccrt;
/*     */   }
/*     */   
/*     */   public void setEccrt(Double eccrt) {
/* 568 */     this.eccrt = eccrt;
/*     */   }
/*     */   
/*     */   public Double getQutun() {
/* 572 */     return this.qutun;
/*     */   }
/*     */   
/*     */   public void setQutun(Double qutun) {
/* 576 */     this.qutun = qutun;
/*     */   }
/*     */   
/*     */   public String getDtesv() {
/* 580 */     return this.dtesv;
/*     */   }
/*     */   
/*     */   public void setDtesv(String dtesv) {
/* 584 */     this.dtesv = dtesv;
/*     */   }
/*     */   
/*     */   public Date getDtmtu() {
/* 588 */     return this.dtmtu;
/*     */   }
/*     */   
/*     */   public void setDtmtu(Date dtmtu) {
/* 592 */     this.dtmtu = dtmtu;
/*     */   }
/*     */   
/*     */   public String getFamig() {
/* 596 */     return this.famig;
/*     */   }
/*     */   
/*     */   public void setFamig(String famig) {
/* 600 */     this.famig = famig;
/*     */   }
/*     */   
/*     */   public String getCdsgr() {
/* 604 */     return this.cdsgr;
/*     */   }
/*     */   
/*     */   public void setCdsgr(String cdsgr) {
/* 608 */     this.cdsgr = cdsgr;
/*     */   }
/*     */   
/*     */   public Double getQublo() {
/* 612 */     return this.qublo;
/*     */   }
/*     */   
/*     */   public void setQublo(Double qublo) {
/* 616 */     this.qublo = qublo;
/*     */   }
/*     */   
/*     */   public String getFlman() {
/* 620 */     return this.flman;
/*     */   }
/*     */   
/*     */   public void setFlman(String flman) {
/* 624 */     this.flman = flman;
/*     */   }
/*     */   
/*     */   public Date getDtupr() {
/* 628 */     return this.dtupr;
/*     */   }
/*     */   
/*     */   public void setDtupr(Date dtupr) {
/* 632 */     this.dtupr = dtupr;
/*     */   }
/*     */   
/*     */   public String getCodsq() {
/* 636 */     return this.codsq;
/*     */   }
/*     */   
/*     */   public void setCodsq(String codsq) {
/* 640 */     this.codsq = codsq;
/*     */   }
/*     */   
/*     */   public String getClasse() {
/* 644 */     return this.classe;
/*     */   }
/*     */   
/*     */   public void setClasse(String classe) {
/* 648 */     this.classe = classe;
/*     */   }
/*     */   
/*     */   public String getManrf() {
/* 652 */     return this.manrf;
/*     */   }
/*     */   
/*     */   public void setManrf(String manrf) {
/* 656 */     this.manrf = manrf;
/*     */   }
/*     */   
/*     */   public String getGstdStatoElab() {
/* 660 */     return this.gstdStatoElab;
/*     */   }
/*     */   
/*     */   public void setGstdStatoElab(String gstdStatoElab) {
/* 664 */     this.gstdStatoElab = gstdStatoElab;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 668 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 672 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public Date getDataElaborazione() {
/* 676 */     return this.dataElaborazione;
/*     */   }
/*     */   
/*     */   public void setDataElaborazione(Date dataElaborazione) {
/* 680 */     this.dataElaborazione = dataElaborazione;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 684 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 688 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 692 */     return (new ToStringBuilder(this)).append("contratti_id", getContratti_id()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxMandnman.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */