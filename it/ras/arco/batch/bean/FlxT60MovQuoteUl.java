/*     */ package it.ras.arco.batch.bean;
/*     */ 
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
/*     */ 
/*     */ public class FlxT60MovQuoteUl
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Integer compagnia;
/*     */   private Integer ramo;
/*     */   private Integer tipo;
/*     */   private String numPolizza;
/*     */   private Integer progOperaz;
/*     */   private Integer tipoOperaz;
/*     */   private Integer codMotOperaz;
/*     */   private Integer progTabella;
/*     */   private Integer progGaranziaUnit;
/*     */   private Integer codiceTitolo;
/*     */   private Integer progDelTitolo;
/*     */   private Integer progDellaComunic;
/*     */   private Integer progDellaComunic1;
/*     */   private Integer progFondo;
/*     */   private String codFondo;
/*     */   private String codLinea;
/*     */   private String dataInizioEffetto;
/*     */   private String acquistoVendita;
/*     */   private Integer stato;
/*     */   private String tipoInvestim;
/*     */   private String codValuta;
/*     */   private Double premioInvestire;
/*     */   private Double impLordoTitolo;
/*     */   private Double impPremioPuro;
/*     */   private Double commissioni;
/*     */   private Double numQuoteFondo;
/*     */   private Double numQuoteInvest;
/*     */   private Double numQuoteRiservate;
/*     */   private String dataValCambio;
/*     */   private String dataComunica1;
/*     */   private String dataComunica2;
/*     */   private String dataRegisOperaz;
/*     */   private String statoElabB;
/*     */   private String istanzaS;
/*     */   private Date dataCaricamentoS;
/*     */   
/*     */   public FlxT60MovQuoteUl() {}
/*     */   
/*     */   public FlxT60MovQuoteUl(Integer flxId) {
/*  61 */     this.flxId = flxId;
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
/*     */   public Integer getFlxId() {
/*  73 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  77 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCompagnia() {
/*  84 */     return this.compagnia;
/*     */   }
/*     */   
/*     */   public void setCompagnia(Integer compagnia) {
/*  88 */     this.compagnia = compagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getRamo() {
/*  95 */     return this.ramo;
/*     */   }
/*     */   
/*     */   public void setRamo(Integer ramo) {
/*  99 */     this.ramo = ramo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getTipo() {
/* 106 */     return this.tipo;
/*     */   }
/*     */   
/*     */   public void setTipo(Integer tipo) {
/* 110 */     this.tipo = tipo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumPolizza() {
/* 117 */     return this.numPolizza;
/*     */   }
/*     */   
/*     */   public void setNumPolizza(String numPolizza) {
/* 121 */     this.numPolizza = numPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgOperaz() {
/* 128 */     return this.progOperaz;
/*     */   }
/*     */   
/*     */   public void setProgOperaz(Integer progOperaz) {
/* 132 */     this.progOperaz = progOperaz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getTipoOperaz() {
/* 139 */     return this.tipoOperaz;
/*     */   }
/*     */   
/*     */   public void setTipoOperaz(Integer tipoOperaz) {
/* 143 */     this.tipoOperaz = tipoOperaz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodMotOperaz() {
/* 150 */     return this.codMotOperaz;
/*     */   }
/*     */   
/*     */   public void setCodMotOperaz(Integer codMotOperaz) {
/* 154 */     this.codMotOperaz = codMotOperaz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgTabella() {
/* 161 */     return this.progTabella;
/*     */   }
/*     */   
/*     */   public void setProgTabella(Integer progTabella) {
/* 165 */     this.progTabella = progTabella;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgGaranziaUnit() {
/* 172 */     return this.progGaranziaUnit;
/*     */   }
/*     */   
/*     */   public void setProgGaranziaUnit(Integer progGaranziaUnit) {
/* 176 */     this.progGaranziaUnit = progGaranziaUnit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceTitolo() {
/* 183 */     return this.codiceTitolo;
/*     */   }
/*     */   
/*     */   public void setCodiceTitolo(Integer codiceTitolo) {
/* 187 */     this.codiceTitolo = codiceTitolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgDelTitolo() {
/* 194 */     return this.progDelTitolo;
/*     */   }
/*     */   
/*     */   public void setProgDelTitolo(Integer progDelTitolo) {
/* 198 */     this.progDelTitolo = progDelTitolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgDellaComunic() {
/* 205 */     return this.progDellaComunic;
/*     */   }
/*     */   
/*     */   public void setProgDellaComunic(Integer progDellaComunic) {
/* 209 */     this.progDellaComunic = progDellaComunic;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgDellaComunic1() {
/* 216 */     return this.progDellaComunic1;
/*     */   }
/*     */   
/*     */   public void setProgDellaComunic1(Integer progDellaComunic1) {
/* 220 */     this.progDellaComunic1 = progDellaComunic1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getProgFondo() {
/* 227 */     return this.progFondo;
/*     */   }
/*     */   
/*     */   public void setProgFondo(Integer progFondo) {
/* 231 */     this.progFondo = progFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodFondo() {
/* 238 */     return this.codFondo;
/*     */   }
/*     */   
/*     */   public void setCodFondo(String codFondo) {
/* 242 */     this.codFondo = codFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodLinea() {
/* 249 */     return this.codLinea;
/*     */   }
/*     */   
/*     */   public void setCodLinea(String codLinea) {
/* 253 */     this.codLinea = codLinea;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataInizioEffetto() {
/* 260 */     return this.dataInizioEffetto;
/*     */   }
/*     */   
/*     */   public void setDataInizioEffetto(String dataInizioEffetto) {
/* 264 */     this.dataInizioEffetto = dataInizioEffetto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAcquistoVendita() {
/* 271 */     return this.acquistoVendita;
/*     */   }
/*     */   
/*     */   public void setAcquistoVendita(String acquistoVendita) {
/* 275 */     this.acquistoVendita = acquistoVendita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getStato() {
/* 282 */     return this.stato;
/*     */   }
/*     */   
/*     */   public void setStato(Integer stato) {
/* 286 */     this.stato = stato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoInvestim() {
/* 293 */     return this.tipoInvestim;
/*     */   }
/*     */   
/*     */   public void setTipoInvestim(String tipoInvestim) {
/* 297 */     this.tipoInvestim = tipoInvestim;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodValuta() {
/* 304 */     return this.codValuta;
/*     */   }
/*     */   
/*     */   public void setCodValuta(String codValuta) {
/* 308 */     this.codValuta = codValuta;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPremioInvestire() {
/* 315 */     return this.premioInvestire;
/*     */   }
/*     */   
/*     */   public void setPremioInvestire(Double premioInvestire) {
/* 319 */     this.premioInvestire = premioInvestire;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpLordoTitolo() {
/* 326 */     return this.impLordoTitolo;
/*     */   }
/*     */   
/*     */   public void setImpLordoTitolo(Double impLordoTitolo) {
/* 330 */     this.impLordoTitolo = impLordoTitolo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImpPremioPuro() {
/* 337 */     return this.impPremioPuro;
/*     */   }
/*     */   
/*     */   public void setImpPremioPuro(Double impPremioPuro) {
/* 341 */     this.impPremioPuro = impPremioPuro;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getCommissioni() {
/* 348 */     return this.commissioni;
/*     */   }
/*     */   
/*     */   public void setCommissioni(Double commissioni) {
/* 352 */     this.commissioni = commissioni;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getNumQuoteFondo() {
/* 359 */     return this.numQuoteFondo;
/*     */   }
/*     */   
/*     */   public void setNumQuoteFondo(Double numQuoteFondo) {
/* 363 */     this.numQuoteFondo = numQuoteFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getNumQuoteInvest() {
/* 370 */     return this.numQuoteInvest;
/*     */   }
/*     */   
/*     */   public void setNumQuoteInvest(Double numQuoteInvest) {
/* 374 */     this.numQuoteInvest = numQuoteInvest;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getNumQuoteRiservate() {
/* 381 */     return this.numQuoteRiservate;
/*     */   }
/*     */   
/*     */   public void setNumQuoteRiservate(Double numQuoteRiservate) {
/* 385 */     this.numQuoteRiservate = numQuoteRiservate;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataValCambio() {
/* 392 */     return this.dataValCambio;
/*     */   }
/*     */   
/*     */   public void setDataValCambio(String dataValCambio) {
/* 396 */     this.dataValCambio = dataValCambio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataComunica1() {
/* 403 */     return this.dataComunica1;
/*     */   }
/*     */   
/*     */   public void setDataComunica1(String dataComunica1) {
/* 407 */     this.dataComunica1 = dataComunica1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataComunica2() {
/* 414 */     return this.dataComunica2;
/*     */   }
/*     */   
/*     */   public void setDataComunica2(String dataComunica2) {
/* 418 */     this.dataComunica2 = dataComunica2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataRegisOperaz() {
/* 425 */     return this.dataRegisOperaz;
/*     */   }
/*     */   
/*     */   public void setDataRegisOperaz(String dataRegisOperaz) {
/* 429 */     this.dataRegisOperaz = dataRegisOperaz;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElabB() {
/* 436 */     return this.statoElabB;
/*     */   }
/*     */   
/*     */   public void setStatoElabB(String statoElabB) {
/* 440 */     this.statoElabB = statoElabB;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanzaS() {
/* 447 */     return this.istanzaS;
/*     */   }
/*     */   
/*     */   public void setIstanzaS(String istanzaS) {
/* 451 */     this.istanzaS = istanzaS;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamentoS() {
/* 458 */     return this.dataCaricamentoS;
/*     */   }
/*     */   
/*     */   public void setDataCaricamentoS(Date dataCaricamentoS) {
/* 462 */     this.dataCaricamentoS = dataCaricamentoS;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxT60MovQuoteUl.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */