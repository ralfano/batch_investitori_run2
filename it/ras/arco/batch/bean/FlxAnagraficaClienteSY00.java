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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAnagraficaClienteSY00
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private Date dataInvio;
/*     */   private String oraInvio;
/*     */   private String progInvio;
/*     */   private String userInvio;
/*     */   private String fonte;
/*     */   private String codFisc;
/*     */   private String partitaIva;
/*     */   private String flagAnag;
/*     */   private String denominazione;
/*     */   private String titOnorifico;
/*     */   private String titStudio;
/*     */   private String tipoSoggetto;
/*     */   private Date dataNasc;
/*     */   private String sesso;
/*     */   private String flagEsistenza;
/*     */   private Date dataMorte;
/*     */   private String tipoIndirizzo;
/*     */   private String flagIndirizzo;
/*     */   private String indirizzo;
/*     */   private String cap;
/*     */   private String loc;
/*     */   private String prov;
/*     */   private String nazIndirizzo;
/*     */   private String nazionalita;
/*     */   private String locNasc;
/*     */   private String provNasc;
/*     */   private String nazNasc;
/*     */   private String stato;
/*     */   private String flagCapof;
/*     */   private Integer ndgCod;
/*     */   private Integer compagnia;
/*     */   private Integer agenzia;
/*     */   private String tipoCanale;
/*     */   private Integer codCanale;
/*     */   private String codDocumento;
/*     */   private Date dataRilascio;
/*     */   private Date dataScadenza;
/*     */   private String numDocumento;
/*     */   private String provenienza;
/*     */   private String locDocumento;
/*     */   private String nazDocumento;
/*     */   private String ente;
/*     */   private String codEnte;
/*     */   private String tipoRecapito1;
/*     */   private String usoRecapito1;
/*     */   private String descRecapito1;
/*     */   private String tipoRecapito2;
/*     */   private String usoRecapito2;
/*     */   private String descRecapito2;
/*     */   private String tipoRecapito3;
/*     */   private String usoRecapito3;
/*     */   private String descRecapito3;
/*     */   private String tipoRecapito4;
/*     */   private String usoRecapito4;
/*     */   private String descRecapito4;
/*     */   private String statoElabB;
/*     */   private String istanzaS;
/*     */   
/*     */   public FlxAnagraficaClienteSY00(Date dataInvio, String oraInvio, String progInvio, String userInvio, String fonte, String codFisc, String partitaIva, String flagAnag, String denominazione, String titOnorifico, String titStudio, String tipoSoggetto, Date dataNasc, String sesso, String flagEsistenza, Date dataMorte, String tipoIndirizzo, String flagIndirizzo, String indirizzo, String cap, String loc, String prov, String nazIndirizzo, String nazionalita, String locNasc, String provNasc, String nazNasc, String stato, String flagCapof, Integer ndgCod, Integer compagnia, Integer agenzia, String tipoCanale, Integer codCanale, String codDocumento, Date dataRilascio, Date dataScadenza, String numDocumento, String provenienza, String locDocumento, String nazDocumento, String ente, String codEnte, String tipoRecapito1, String usoRecapito1, String descRecapito1, String tipoRecapito2, String usoRecapito2, String descRecapito2, String tipoRecapito3, String usoRecapito3, String descRecapito3, String tipoRecapito4, String usoRecapito4, String descRecapito4, String statoElabB, String istanzaS) {
/* 191 */     this.dataInvio = dataInvio;
/* 192 */     this.oraInvio = oraInvio;
/* 193 */     this.progInvio = progInvio;
/* 194 */     this.userInvio = userInvio;
/* 195 */     this.fonte = fonte;
/* 196 */     this.codFisc = codFisc;
/* 197 */     this.partitaIva = partitaIva;
/* 198 */     this.flagAnag = flagAnag;
/* 199 */     this.denominazione = denominazione;
/* 200 */     this.titOnorifico = titOnorifico;
/* 201 */     this.titStudio = titStudio;
/* 202 */     this.tipoSoggetto = tipoSoggetto;
/* 203 */     this.dataNasc = dataNasc;
/* 204 */     this.sesso = sesso;
/* 205 */     this.flagEsistenza = flagEsistenza;
/* 206 */     this.dataMorte = dataMorte;
/* 207 */     this.tipoIndirizzo = tipoIndirizzo;
/* 208 */     this.flagIndirizzo = flagIndirizzo;
/* 209 */     this.indirizzo = indirizzo;
/* 210 */     this.cap = cap;
/* 211 */     this.loc = loc;
/* 212 */     this.prov = prov;
/* 213 */     this.nazIndirizzo = nazIndirizzo;
/* 214 */     this.nazionalita = nazionalita;
/* 215 */     this.locNasc = locNasc;
/* 216 */     this.provNasc = provNasc;
/* 217 */     this.nazNasc = nazNasc;
/* 218 */     this.stato = stato;
/* 219 */     this.flagCapof = flagCapof;
/* 220 */     this.ndgCod = ndgCod;
/* 221 */     this.compagnia = compagnia;
/* 222 */     this.agenzia = agenzia;
/* 223 */     this.tipoCanale = tipoCanale;
/* 224 */     this.codCanale = codCanale;
/* 225 */     this.codDocumento = codDocumento;
/* 226 */     this.dataRilascio = dataRilascio;
/* 227 */     this.dataScadenza = dataScadenza;
/* 228 */     this.numDocumento = numDocumento;
/* 229 */     this.provenienza = provenienza;
/* 230 */     this.locDocumento = locDocumento;
/* 231 */     this.nazDocumento = nazDocumento;
/* 232 */     this.ente = ente;
/* 233 */     this.codEnte = codEnte;
/* 234 */     this.tipoRecapito1 = tipoRecapito1;
/* 235 */     this.usoRecapito1 = usoRecapito1;
/* 236 */     this.descRecapito1 = descRecapito1;
/* 237 */     this.tipoRecapito2 = tipoRecapito2;
/* 238 */     this.usoRecapito2 = usoRecapito2;
/* 239 */     this.descRecapito2 = descRecapito2;
/* 240 */     this.tipoRecapito3 = tipoRecapito3;
/* 241 */     this.usoRecapito3 = usoRecapito3;
/* 242 */     this.descRecapito3 = descRecapito3;
/* 243 */     this.tipoRecapito4 = tipoRecapito4;
/* 244 */     this.usoRecapito4 = usoRecapito4;
/* 245 */     this.descRecapito4 = descRecapito4;
/* 246 */     this.statoElabB = statoElabB;
/* 247 */     this.istanzaS = istanzaS;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAnagraficaClienteSY00() {}
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 255 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 259 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public Date getDataInvio() {
/* 263 */     return this.dataInvio;
/*     */   }
/*     */   
/*     */   public void setDataInvio(Date dataInvio) {
/* 267 */     this.dataInvio = dataInvio;
/*     */   }
/*     */   
/*     */   public String getOraInvio() {
/* 271 */     return this.oraInvio;
/*     */   }
/*     */   
/*     */   public void setOraInvio(String oraInvio) {
/* 275 */     this.oraInvio = oraInvio;
/*     */   }
/*     */   
/*     */   public String getProgInvio() {
/* 279 */     return this.progInvio;
/*     */   }
/*     */   
/*     */   public void setProgInvio(String progInvio) {
/* 283 */     this.progInvio = progInvio;
/*     */   }
/*     */   
/*     */   public String getUserInvio() {
/* 287 */     return this.userInvio;
/*     */   }
/*     */   
/*     */   public void setUserInvio(String userInvio) {
/* 291 */     this.userInvio = userInvio;
/*     */   }
/*     */   
/*     */   public String getFonte() {
/* 295 */     return this.fonte;
/*     */   }
/*     */   
/*     */   public void setFonte(String fonte) {
/* 299 */     this.fonte = fonte;
/*     */   }
/*     */   
/*     */   public String getCodFisc() {
/* 303 */     return this.codFisc;
/*     */   }
/*     */   
/*     */   public void setCodFisc(String codFisc) {
/* 307 */     this.codFisc = codFisc;
/*     */   }
/*     */   
/*     */   public String getPartitaIva() {
/* 311 */     return this.partitaIva;
/*     */   }
/*     */   
/*     */   public void setPartitaIva(String partitaIva) {
/* 315 */     this.partitaIva = partitaIva;
/*     */   }
/*     */   
/*     */   public String getFlagAnag() {
/* 319 */     return this.flagAnag;
/*     */   }
/*     */   
/*     */   public void setFlagAnag(String flagAnag) {
/* 323 */     this.flagAnag = flagAnag;
/*     */   }
/*     */   
/*     */   public String getDenominazione() {
/* 327 */     return this.denominazione;
/*     */   }
/*     */   
/*     */   public void setDenominazione(String denominazione) {
/* 331 */     this.denominazione = denominazione;
/*     */   }
/*     */   
/*     */   public String getTitOnorifico() {
/* 335 */     return this.titOnorifico;
/*     */   }
/*     */   
/*     */   public void setTitOnorifico(String titOnorifico) {
/* 339 */     this.titOnorifico = titOnorifico;
/*     */   }
/*     */   
/*     */   public String getTitStudio() {
/* 343 */     return this.titStudio;
/*     */   }
/*     */   
/*     */   public void setTitStudio(String titStudio) {
/* 347 */     this.titStudio = titStudio;
/*     */   }
/*     */   
/*     */   public String getTipoSoggetto() {
/* 351 */     return this.tipoSoggetto;
/*     */   }
/*     */   
/*     */   public void setTipoSoggetto(String tipoSoggetto) {
/* 355 */     this.tipoSoggetto = tipoSoggetto;
/*     */   }
/*     */   
/*     */   public Date getDataNasc() {
/* 359 */     return this.dataNasc;
/*     */   }
/*     */   
/*     */   public void setDataNasc(Date dataNasc) {
/* 363 */     this.dataNasc = dataNasc;
/*     */   }
/*     */   
/*     */   public String getSesso() {
/* 367 */     return this.sesso;
/*     */   }
/*     */   
/*     */   public void setSesso(String sesso) {
/* 371 */     this.sesso = sesso;
/*     */   }
/*     */   
/*     */   public String getFlagEsistenza() {
/* 375 */     return this.flagEsistenza;
/*     */   }
/*     */   
/*     */   public void setFlagEsistenza(String flagEsistenza) {
/* 379 */     this.flagEsistenza = flagEsistenza;
/*     */   }
/*     */   
/*     */   public Date getDataMorte() {
/* 383 */     return this.dataMorte;
/*     */   }
/*     */   
/*     */   public void setDataMorte(Date dataMorte) {
/* 387 */     this.dataMorte = dataMorte;
/*     */   }
/*     */   
/*     */   public String getTipoIndirizzo() {
/* 391 */     return this.tipoIndirizzo;
/*     */   }
/*     */   
/*     */   public void setTipoIndirizzo(String tipoIndirizzo) {
/* 395 */     this.tipoIndirizzo = tipoIndirizzo;
/*     */   }
/*     */   
/*     */   public String getFlagIndirizzo() {
/* 399 */     return this.flagIndirizzo;
/*     */   }
/*     */   
/*     */   public void setFlagIndirizzo(String flagIndirizzo) {
/* 403 */     this.flagIndirizzo = flagIndirizzo;
/*     */   }
/*     */   
/*     */   public String getIndirizzo() {
/* 407 */     return this.indirizzo;
/*     */   }
/*     */   
/*     */   public void setIndirizzo(String indirizzo) {
/* 411 */     this.indirizzo = indirizzo;
/*     */   }
/*     */   
/*     */   public String getCap() {
/* 415 */     return this.cap;
/*     */   }
/*     */   
/*     */   public void setCap(String cap) {
/* 419 */     this.cap = cap;
/*     */   }
/*     */   
/*     */   public String getLoc() {
/* 423 */     return this.loc;
/*     */   }
/*     */   
/*     */   public void setLoc(String loc) {
/* 427 */     this.loc = loc;
/*     */   }
/*     */   
/*     */   public String getProv() {
/* 431 */     return this.prov;
/*     */   }
/*     */   
/*     */   public void setProv(String prov) {
/* 435 */     this.prov = prov;
/*     */   }
/*     */   
/*     */   public String getNazIndirizzo() {
/* 439 */     return this.nazIndirizzo;
/*     */   }
/*     */   
/*     */   public void setNazIndirizzo(String nazIndirizzo) {
/* 443 */     this.nazIndirizzo = nazIndirizzo;
/*     */   }
/*     */   
/*     */   public String getNazionalita() {
/* 447 */     return this.nazionalita;
/*     */   }
/*     */   
/*     */   public void setNazionalita(String nazionalita) {
/* 451 */     this.nazionalita = nazionalita;
/*     */   }
/*     */   
/*     */   public String getLocNasc() {
/* 455 */     return this.locNasc;
/*     */   }
/*     */   
/*     */   public void setLocNasc(String locNasc) {
/* 459 */     this.locNasc = locNasc;
/*     */   }
/*     */   
/*     */   public String getProvNasc() {
/* 463 */     return this.provNasc;
/*     */   }
/*     */   
/*     */   public void setProvNasc(String provNasc) {
/* 467 */     this.provNasc = provNasc;
/*     */   }
/*     */   
/*     */   public String getNazNasc() {
/* 471 */     return this.nazNasc;
/*     */   }
/*     */   
/*     */   public void setNazNasc(String nazNasc) {
/* 475 */     this.nazNasc = nazNasc;
/*     */   }
/*     */   
/*     */   public String getStato() {
/* 479 */     return this.stato;
/*     */   }
/*     */   
/*     */   public void setStato(String stato) {
/* 483 */     this.stato = stato;
/*     */   }
/*     */   
/*     */   public String getFlagCapof() {
/* 487 */     return this.flagCapof;
/*     */   }
/*     */   
/*     */   public void setFlagCapof(String flagCapof) {
/* 491 */     this.flagCapof = flagCapof;
/*     */   }
/*     */   
/*     */   public Integer getNdgCod() {
/* 495 */     return this.ndgCod;
/*     */   }
/*     */   
/*     */   public void setNdgCod(Integer ndgCod) {
/* 499 */     this.ndgCod = ndgCod;
/*     */   }
/*     */   
/*     */   public Integer getCompagnia() {
/* 503 */     return this.compagnia;
/*     */   }
/*     */   
/*     */   public void setCompagnia(Integer compagnia) {
/* 507 */     this.compagnia = compagnia;
/*     */   }
/*     */   
/*     */   public Integer getAgenzia() {
/* 511 */     return this.agenzia;
/*     */   }
/*     */   
/*     */   public void setAgenzia(Integer agenzia) {
/* 515 */     this.agenzia = agenzia;
/*     */   }
/*     */   
/*     */   public String getTipoCanale() {
/* 519 */     return this.tipoCanale;
/*     */   }
/*     */   
/*     */   public void setTipoCanale(String tipoCanale) {
/* 523 */     this.tipoCanale = tipoCanale;
/*     */   }
/*     */   
/*     */   public Integer getCodCanale() {
/* 527 */     return this.codCanale;
/*     */   }
/*     */   
/*     */   public void setCodCanale(Integer codCanale) {
/* 531 */     this.codCanale = codCanale;
/*     */   }
/*     */   
/*     */   public String getCodDocumento() {
/* 535 */     return this.codDocumento;
/*     */   }
/*     */   
/*     */   public void setCodDocumento(String codDocumento) {
/* 539 */     this.codDocumento = codDocumento;
/*     */   }
/*     */   
/*     */   public Date getDataRilascio() {
/* 543 */     return this.dataRilascio;
/*     */   }
/*     */   
/*     */   public void setDataRilascio(Date dataRilascio) {
/* 547 */     this.dataRilascio = dataRilascio;
/*     */   }
/*     */   
/*     */   public Date getDataScadenza() {
/* 551 */     return this.dataScadenza;
/*     */   }
/*     */   
/*     */   public void setDataScadenza(Date dataScadenza) {
/* 555 */     this.dataScadenza = dataScadenza;
/*     */   }
/*     */   
/*     */   public String getNumDocumento() {
/* 559 */     return this.numDocumento;
/*     */   }
/*     */   
/*     */   public void setNumDocumento(String numDocumento) {
/* 563 */     this.numDocumento = numDocumento;
/*     */   }
/*     */   
/*     */   public String getProvenienza() {
/* 567 */     return this.provenienza;
/*     */   }
/*     */   
/*     */   public void setProvenienza(String provenienza) {
/* 571 */     this.provenienza = provenienza;
/*     */   }
/*     */   
/*     */   public String getLocDocumento() {
/* 575 */     return this.locDocumento;
/*     */   }
/*     */   
/*     */   public void setLocDocumento(String locDocumento) {
/* 579 */     this.locDocumento = locDocumento;
/*     */   }
/*     */   
/*     */   public String getNazDocumento() {
/* 583 */     return this.nazDocumento;
/*     */   }
/*     */   
/*     */   public void setNazDocumento(String nazDocumento) {
/* 587 */     this.nazDocumento = nazDocumento;
/*     */   }
/*     */   
/*     */   public String getEnte() {
/* 591 */     return this.ente;
/*     */   }
/*     */   
/*     */   public void setEnte(String ente) {
/* 595 */     this.ente = ente;
/*     */   }
/*     */   
/*     */   public String getCodEnte() {
/* 599 */     return this.codEnte;
/*     */   }
/*     */   
/*     */   public void setCodEnte(String codEnte) {
/* 603 */     this.codEnte = codEnte;
/*     */   }
/*     */   
/*     */   public String getTipoRecapito1() {
/* 607 */     return this.tipoRecapito1;
/*     */   }
/*     */   
/*     */   public void setTipoRecapito1(String tipoRecapito1) {
/* 611 */     this.tipoRecapito1 = tipoRecapito1;
/*     */   }
/*     */   
/*     */   public String getUsoRecapito1() {
/* 615 */     return this.usoRecapito1;
/*     */   }
/*     */   
/*     */   public void setUsoRecapito1(String usoRecapito1) {
/* 619 */     this.usoRecapito1 = usoRecapito1;
/*     */   }
/*     */   
/*     */   public String getDescRecapito1() {
/* 623 */     return this.descRecapito1;
/*     */   }
/*     */   
/*     */   public void setDescRecapito1(String descRecapito1) {
/* 627 */     this.descRecapito1 = descRecapito1;
/*     */   }
/*     */   
/*     */   public String getTipoRecapito2() {
/* 631 */     return this.tipoRecapito2;
/*     */   }
/*     */   
/*     */   public void setTipoRecapito2(String tipoRecapito2) {
/* 635 */     this.tipoRecapito2 = tipoRecapito2;
/*     */   }
/*     */   
/*     */   public String getUsoRecapito2() {
/* 639 */     return this.usoRecapito2;
/*     */   }
/*     */   
/*     */   public void setUsoRecapito2(String usoRecapito2) {
/* 643 */     this.usoRecapito2 = usoRecapito2;
/*     */   }
/*     */   
/*     */   public String getDescRecapito2() {
/* 647 */     return this.descRecapito2;
/*     */   }
/*     */   
/*     */   public void setDescRecapito2(String descRecapito2) {
/* 651 */     this.descRecapito2 = descRecapito2;
/*     */   }
/*     */   
/*     */   public String getTipoRecapito3() {
/* 655 */     return this.tipoRecapito3;
/*     */   }
/*     */   
/*     */   public void setTipoRecapito3(String tipoRecapito3) {
/* 659 */     this.tipoRecapito3 = tipoRecapito3;
/*     */   }
/*     */   
/*     */   public String getUsoRecapito3() {
/* 663 */     return this.usoRecapito3;
/*     */   }
/*     */   
/*     */   public void setUsoRecapito3(String usoRecapito3) {
/* 667 */     this.usoRecapito3 = usoRecapito3;
/*     */   }
/*     */   
/*     */   public String getDescRecapito3() {
/* 671 */     return this.descRecapito3;
/*     */   }
/*     */   
/*     */   public void setDescRecapito3(String descRecapito3) {
/* 675 */     this.descRecapito3 = descRecapito3;
/*     */   }
/*     */   
/*     */   public String getTipoRecapito4() {
/* 679 */     return this.tipoRecapito4;
/*     */   }
/*     */   
/*     */   public void setTipoRecapito4(String tipoRecapito4) {
/* 683 */     this.tipoRecapito4 = tipoRecapito4;
/*     */   }
/*     */   
/*     */   public String getUsoRecapito4() {
/* 687 */     return this.usoRecapito4;
/*     */   }
/*     */   
/*     */   public void setUsoRecapito4(String usoRecapito4) {
/* 691 */     this.usoRecapito4 = usoRecapito4;
/*     */   }
/*     */   
/*     */   public String getDescRecapito4() {
/* 695 */     return this.descRecapito4;
/*     */   }
/*     */   
/*     */   public void setDescRecapito4(String descRecapito4) {
/* 699 */     this.descRecapito4 = descRecapito4;
/*     */   }
/*     */   
/*     */   public String getStatoElabB() {
/* 703 */     return this.statoElabB;
/*     */   }
/*     */   
/*     */   public void setStatoElabB(String statoElabB) {
/* 707 */     this.statoElabB = statoElabB;
/*     */   }
/*     */   public String getIstanzaS() {
/* 710 */     return this.istanzaS;
/*     */   }
/*     */   
/*     */   public void setIstanzaS(String istanzaS) {
/* 714 */     this.istanzaS = istanzaS;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 718 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnagraficaClienteSY00.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */