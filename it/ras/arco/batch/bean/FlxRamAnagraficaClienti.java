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
/*     */ public class FlxRamAnagraficaClienti
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer gruppo;
/*     */   private Integer settore;
/*     */   private Integer attEconPrisma;
/*     */   private String untUltManut;
/*     */   private String codCli;
/*     */   private String denominazione;
/*     */   private String codFisc;
/*     */   private String Piva;
/*     */   private String locNasc;
/*     */   private String provNasc;
/*     */   private String statoNasc;
/*     */   private String sesso;
/*     */   private String locRes;
/*     */   private String provRes;
/*     */   private String capRes;
/*     */   private String statoRes;
/*     */   private String tipoDoc;
/*     */   private String numDoc;
/*     */   private String enteRilasc;
/*     */   private String codSgr;
/*     */   private String compDocRisc;
/*     */   private String concAut;
/*     */   private String regisConflAge;
/*     */   private String flgSpedAge;
/*     */   private String tbret;
/*     */   private String nome;
/*     */   private String cognome;
/*     */   private String Nazionalita;
/*     */   private String cabRes;
/*     */   private String comRes;
/*     */   private String flagForzCf;
/*     */   private String indirizzoRes;
/*     */   private Date dataAutMarket;
/*     */   private Date dataUltManut;
/*     */   private Date dataConflInt;
/*     */   private Date dataComplDocRisc;
/*     */   private Date dataAutPriv;
/*     */   private Date dataIns;
/*     */   private Date dataNasc;
/*     */   private Date dataRil;
/*     */   private String statoElab;
/*     */   private String descrizioneErrore;
/*     */   private Date dataElab;
/*     */   
/*     */   public Integer getAttEconPrisma() {
/*  61 */     return this.attEconPrisma;
/*     */   }
/*     */   public void setAttEconPrisma(Integer attEconPrisma) {
/*  64 */     this.attEconPrisma = attEconPrisma;
/*     */   }
/*     */   public String getCabRes() {
/*  67 */     return this.cabRes;
/*     */   }
/*     */   public void setCabRes(String cabRes) {
/*  70 */     this.cabRes = cabRes;
/*     */   }
/*     */   public String getCapRes() {
/*  73 */     return this.capRes;
/*     */   }
/*     */   public void setCapRes(String capRes) {
/*  76 */     this.capRes = capRes;
/*     */   }
/*     */   public String getCodCli() {
/*  79 */     return this.codCli;
/*     */   }
/*     */   public void setCodCli(String codCli) {
/*  82 */     this.codCli = codCli;
/*     */   }
/*     */   public String getCodFisc() {
/*  85 */     return this.codFisc;
/*     */   }
/*     */   public void setCodFisc(String codFisc) {
/*  88 */     this.codFisc = codFisc;
/*     */   }
/*     */   public String getCodSgr() {
/*  91 */     return this.codSgr;
/*     */   }
/*     */   public void setCodSgr(String codSgr) {
/*  94 */     this.codSgr = codSgr;
/*     */   }
/*     */   public String getCognome() {
/*  97 */     return this.cognome;
/*     */   }
/*     */   public void setCognome(String cognome) {
/* 100 */     this.cognome = cognome;
/*     */   }
/*     */   public String getCompDocRisc() {
/* 103 */     return this.compDocRisc;
/*     */   }
/*     */   public void setCompDocRisc(String compDocRisc) {
/* 106 */     this.compDocRisc = compDocRisc;
/*     */   }
/*     */   public String getComRes() {
/* 109 */     return this.comRes;
/*     */   }
/*     */   public void setComRes(String comRes) {
/* 112 */     this.comRes = comRes;
/*     */   }
/*     */   public String getConcAut() {
/* 115 */     return this.concAut;
/*     */   }
/*     */   public void setConcAut(String concAut) {
/* 118 */     this.concAut = concAut;
/*     */   }
/*     */   public Date getDataAutMarket() {
/* 121 */     return this.dataAutMarket;
/*     */   }
/*     */   public void setDataAutMarket(Date dataAutMarket) {
/* 124 */     this.dataAutMarket = dataAutMarket;
/*     */   }
/*     */   public Date getDataAutPriv() {
/* 127 */     return this.dataAutPriv;
/*     */   }
/*     */   public void setDataAutPriv(Date dataAutPriv) {
/* 130 */     this.dataAutPriv = dataAutPriv;
/*     */   }
/*     */   public Date getDataComplDocRisc() {
/* 133 */     return this.dataComplDocRisc;
/*     */   }
/*     */   public void setDataComplDocRisc(Date dataComplDocRisc) {
/* 136 */     this.dataComplDocRisc = dataComplDocRisc;
/*     */   }
/*     */   public Date getDataConflInt() {
/* 139 */     return this.dataConflInt;
/*     */   }
/*     */   public void setDataConflInt(Date dataConflInt) {
/* 142 */     this.dataConflInt = dataConflInt;
/*     */   }
/*     */   public Date getDataElab() {
/* 145 */     return this.dataElab;
/*     */   }
/*     */   public void setDataElab(Date dataElab) {
/* 148 */     this.dataElab = dataElab;
/*     */   }
/*     */   public Date getDataIns() {
/* 151 */     return this.dataIns;
/*     */   }
/*     */   public void setDataIns(Date dataIns) {
/* 154 */     this.dataIns = dataIns;
/*     */   }
/*     */   public Date getDataNasc() {
/* 157 */     return this.dataNasc;
/*     */   }
/*     */   public void setDataNasc(Date dataNasc) {
/* 160 */     this.dataNasc = dataNasc;
/*     */   }
/*     */   public Date getDataRil() {
/* 163 */     return this.dataRil;
/*     */   }
/*     */   public void setDataRil(Date dataRil) {
/* 166 */     this.dataRil = dataRil;
/*     */   }
/*     */   public Date getDataUltManut() {
/* 169 */     return this.dataUltManut;
/*     */   }
/*     */   public void setDataUltManut(Date dataUltManut) {
/* 172 */     this.dataUltManut = dataUltManut;
/*     */   }
/*     */   public String getDenominazione() {
/* 175 */     return this.denominazione;
/*     */   }
/*     */   public void setDenominazione(String denominazione) {
/* 178 */     this.denominazione = denominazione;
/*     */   }
/*     */   public String getDescrizioneErrore() {
/* 181 */     return this.descrizioneErrore;
/*     */   }
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 184 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */   public String getEnteRilasc() {
/* 187 */     return this.enteRilasc;
/*     */   }
/*     */   public void setEnteRilasc(String enteRilasc) {
/* 190 */     this.enteRilasc = enteRilasc;
/*     */   }
/*     */   public String getFlagForzCf() {
/* 193 */     return this.flagForzCf;
/*     */   }
/*     */   public void setFlagForzCf(String flagForzCf) {
/* 196 */     this.flagForzCf = flagForzCf;
/*     */   }
/*     */   public String getFlgSpedAge() {
/* 199 */     return this.flgSpedAge;
/*     */   }
/*     */   public void setFlgSpedAge(String flgSpedAge) {
/* 202 */     this.flgSpedAge = flgSpedAge;
/*     */   }
/*     */   public Integer getFlxId() {
/* 205 */     return this.flxId;
/*     */   }
/*     */   public void setFlxId(Integer flxId) {
/* 208 */     this.flxId = flxId;
/*     */   }
/*     */   public Integer getGruppo() {
/* 211 */     return this.gruppo;
/*     */   }
/*     */   public void setGruppo(Integer gruppo) {
/* 214 */     this.gruppo = gruppo;
/*     */   }
/*     */   public String getIndirizzoRes() {
/* 217 */     return this.indirizzoRes;
/*     */   }
/*     */   public void setIndirizzoRes(String indirizzoRes) {
/* 220 */     this.indirizzoRes = indirizzoRes;
/*     */   }
/*     */   public String getLocNasc() {
/* 223 */     return this.locNasc;
/*     */   }
/*     */   public void setLocNasc(String locNasc) {
/* 226 */     this.locNasc = locNasc;
/*     */   }
/*     */   public String getLocRes() {
/* 229 */     return this.locRes;
/*     */   }
/*     */   public void setLocRes(String locRes) {
/* 232 */     this.locRes = locRes;
/*     */   }
/*     */   public String getNazionalita() {
/* 235 */     return this.Nazionalita;
/*     */   }
/*     */   public void setNazionalita(String nazionalita) {
/* 238 */     this.Nazionalita = nazionalita;
/*     */   }
/*     */   public String getNome() {
/* 241 */     return this.nome;
/*     */   }
/*     */   public void setNome(String nome) {
/* 244 */     this.nome = nome;
/*     */   }
/*     */   public String getNumDoc() {
/* 247 */     return this.numDoc;
/*     */   }
/*     */   public void setNumDoc(String numDoc) {
/* 250 */     this.numDoc = numDoc;
/*     */   }
/*     */   public String getPiva() {
/* 253 */     return this.Piva;
/*     */   }
/*     */   public void setPiva(String piva) {
/* 256 */     this.Piva = piva;
/*     */   }
/*     */   public String getProvNasc() {
/* 259 */     return this.provNasc;
/*     */   }
/*     */   public void setProvNasc(String provNasc) {
/* 262 */     this.provNasc = provNasc;
/*     */   }
/*     */   public String getProvRes() {
/* 265 */     return this.provRes;
/*     */   }
/*     */   public void setProvRes(String provRes) {
/* 268 */     this.provRes = provRes;
/*     */   }
/*     */   public String getRegisConflAge() {
/* 271 */     return this.regisConflAge;
/*     */   }
/*     */   public void setRegisConflAge(String regisConflAge) {
/* 274 */     this.regisConflAge = regisConflAge;
/*     */   }
/*     */   public String getSesso() {
/* 277 */     return this.sesso;
/*     */   }
/*     */   public void setSesso(String sesso) {
/* 280 */     this.sesso = sesso;
/*     */   }
/*     */   public Integer getSettore() {
/* 283 */     return this.settore;
/*     */   }
/*     */   public void setSettore(Integer settore) {
/* 286 */     this.settore = settore;
/*     */   }
/*     */   public String getStatoElab() {
/* 289 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String statoElab) {
/* 292 */     this.statoElab = statoElab;
/*     */   }
/*     */   public String getStatoNasc() {
/* 295 */     return this.statoNasc;
/*     */   }
/*     */   public void setStatoNasc(String statoNasc) {
/* 298 */     this.statoNasc = statoNasc;
/*     */   }
/*     */   public String getStatoRes() {
/* 301 */     return this.statoRes;
/*     */   }
/*     */   public void setStatoRes(String statoRes) {
/* 304 */     this.statoRes = statoRes;
/*     */   }
/*     */   public String getTbret() {
/* 307 */     return this.tbret;
/*     */   }
/*     */   public void setTbret(String tbret) {
/* 310 */     this.tbret = tbret;
/*     */   }
/*     */   public String getTipoDoc() {
/* 313 */     return this.tipoDoc;
/*     */   }
/*     */   public void setTipoDoc(String tipoDoc) {
/* 316 */     this.tipoDoc = tipoDoc;
/*     */   }
/*     */   public String getUntUltManut() {
/* 319 */     return this.untUltManut;
/*     */   }
/*     */   public void setUntUltManut(String untUltManut) {
/* 322 */     this.untUltManut = untUltManut;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxRamAnagraficaClienti.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */