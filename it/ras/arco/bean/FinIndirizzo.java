/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.lang.builder.EqualsBuilder;
/*     */ import org.apache.commons.lang.builder.HashCodeBuilder;
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
/*     */ public class FinIndirizzo
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   public static final String NAZIONE = "086";
/*     */   private Integer indirizzoId;
/*     */   private Integer emittenteId;
/*     */   private String codToponimo;
/*     */   private String desToponimo;
/*     */   private String indirizzo;
/*     */   private String tipoIndirizzo;
/*     */   private String numeroCivico;
/*     */   private String cabResidenza;
/*     */   private String cap;
/*     */   private String prov;
/*     */   private String comune;
/*     */   private String localita;
/*     */   private String nazione;
/*     */   private String presso;
/*     */   private String presNote;
/*     */   private String indiSeparato;
/*     */   private String datiSupl;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Set contratto;
/*     */   private Set soggetto;
/*     */   private Set soggScheda;
/*     */   private Set sottoscrizioni;
/*     */   private Set dispPagamento;
/*     */   private Set legameIndir;
/*     */   private String provDatiAnag;
/*     */   private String flagNormalizzato;
/*     */   private int hashCode;
/*     */   private boolean residenzaRichiedente;
/*     */   
/*     */   public String getFlagNormalizzato() {
/* 101 */     return this.flagNormalizzato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagNormalizzato(String flagNormalizzato) {
/* 108 */     this.flagNormalizzato = flagNormalizzato;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinIndirizzo(String codToponimo, String desToponimo, String indirizzo, String numeroCivico, String cap, String prov, String comune, String localita, String nazione, String presso, String presNote, String indiSeparato, String datiSupl, Date dataInserimento, String utenteInserimento, Set contratto, Set soggetto, Set sottoscrizioni)
/*     */   {
/* 446 */     this.hashCode = Integer.MIN_VALUE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 519 */     this.residenzaRichiedente = false; this.codToponimo = codToponimo; this.desToponimo = desToponimo; this.indirizzo = indirizzo; this.numeroCivico = numeroCivico; this.cap = cap; this.prov = prov; this.comune = comune; this.localita = localita; this.nazione = nazione; this.presso = presso; this.presNote = presNote; this.indiSeparato = indiSeparato; this.datiSupl = datiSupl; this.dataInserimento = dataInserimento; this.utenteInserimento = utenteInserimento; this.contratto = contratto; this.soggetto = soggetto; this.sottoscrizioni = sottoscrizioni; } public void copyProperties(FinIndirizzo i) { i.setCodToponimo(this.codToponimo); i.setDesToponimo(this.desToponimo); i.setIndirizzo(this.indirizzo); i.setNumeroCivico(this.numeroCivico); i.setCap(this.cap); i.setProv(this.prov); i.setComune(this.comune); i.setLocalita(this.localita); i.setNazione(this.nazione); i.setPresso(this.presso); i.setPresNote(this.presNote); i.setIndiSeparato(this.indiSeparato); i.setDatiSupl(this.datiSupl); i.setDataInserimento(this.dataInserimento); i.setUtenteInserimento(this.utenteInserimento); i.setDataUltimaModificaSlave(this.dataUltimaModificaSlave); i.setUserUltimaModificaSlave(this.userUltimaModificaSlave); i.setProceduraUltimaModificaSlave(this.proceduraUltimaModificaSlave); i.setTipoUltimaModificaSlave(this.tipoUltimaModificaSlave); i.setFlagEsistenza(this.flagEsistenza); i.setIndirizzoId(this.indirizzoId); i.setTipoIndirizzo(this.tipoIndirizzo); } public FinIndirizzo() { this.hashCode = Integer.MIN_VALUE; this.residenzaRichiedente = false; }
/*     */   public Integer getIndirizzoId() { return this.indirizzoId; }
/*     */   public void setIndirizzoId(Integer indirizzoId) { this.indirizzoId = indirizzoId; }
/*     */   public String getCodToponimo() { return this.codToponimo; }
/*     */   public void setCodToponimo(String codToponimo) { if (codToponimo != null) this.codToponimo = codToponimo.toUpperCase();  }
/*     */   public String getDesToponimo() { return this.desToponimo; }
/* 525 */   public void setDesToponimo(String desToponimo) { if (desToponimo != null) this.desToponimo = desToponimo.toUpperCase();  } public String getIndirizzo() { return this.indirizzo; } public void setIndirizzo(String indirizzo) { if (indirizzo != null) this.indirizzo = indirizzo.toUpperCase();  } public String getNumeroCivico() { return this.numeroCivico; } public void setNumeroCivico(String numeroCivico) { this.numeroCivico = numeroCivico; } public String getCabResidenza() { return this.cabResidenza; } public void setCabResidenza(String cabResidenza) { if (cabResidenza != null) this.cabResidenza = cabResidenza.toUpperCase();  } public String getCap() { return this.cap; } public boolean isResidenzaRichiedente() { return this.residenzaRichiedente; }
/*     */   public void setCap(String cap) { this.cap = cap; }
/*     */   public String getProv() { return this.prov; }
/*     */   public void setProv(String prov) { if (prov != null) this.prov = prov.toUpperCase();  }
/*     */   public String getComune() { return this.comune; }
/*     */   public void setComune(String comune) { if (comune != null) this.comune = comune.toUpperCase();  }
/*     */   public String getLocalita() { return this.localita; }
/*     */   public void setLocalita(String localita) { if (localita != null) this.localita = localita.toUpperCase();  }
/* 533 */   public String getNazione() { return this.nazione; } public void setNazione(String nazione) { if (nazione != null) this.nazione = nazione.toUpperCase();  } public String getPresso() { return this.presso; } public void setPresso(String presso) { if (presso != null) this.presso = presso.toUpperCase();  } public String getPresNote() { return this.presNote; } public void setPresNote(String presNote) { this.presNote = presNote; } public String getIndiSeparato() { return this.indiSeparato; } public void setIndiSeparato(String indiSeparato) { this.indiSeparato = indiSeparato; } public String getDatiSupl() { return this.datiSupl; } public void setDatiSupl(String datiSupl) { this.datiSupl = datiSupl; } public Date getDataInserimento() { return this.dataInserimento; } public void setDataInserimento(Date dataInserimento) { this.dataInserimento = dataInserimento; } public String getUtenteInserimento() { return this.utenteInserimento; } public void setUtenteInserimento(String utenteInserimento) { this.utenteInserimento = utenteInserimento; } public Set getContratto() { return this.contratto; } public void setContratto(Set contratto) { this.contratto = contratto; } public Set getSoggetto() { return this.soggetto; } public void setSoggetto(Set soggetto) { this.soggetto = soggetto; } public String toString() { return (new ToStringBuilder(this)).append("indirizzoId", getIndirizzoId()).toString(); } public void setResidenzaRichiedente(boolean residenzaRichiedente) { this.residenzaRichiedente = residenzaRichiedente; } public Set getSoggScheda() { return this.soggScheda; } public void setSoggScheda(Set soggScheda) { this.soggScheda = soggScheda; } public boolean isEmptyForBL() { if (getCap() == null || getCap().equals("") || getCap().equals("-1") || getIndirizzo() == null || getIndirizzo().equals("") || getIndirizzo().equals("-1") || getComune() == null || getComune().equals("") || getComune().equals("-1") || getNazione() == null || getNazione().equals("") || getNazione().equals("-1")) return true;  return false; } public String getIndirizzoCompleto() { String returnValue = ""; if (getDesToponimo() != null) returnValue = returnValue + getDesToponimo() + " ";  if (getIndirizzo() != null) returnValue = returnValue + getIndirizzo() + " ";  if (getNumeroCivico() != null) returnValue = returnValue + getNumeroCivico();  return returnValue; } public String getLocalitaComune() { String returnValue = ""; if (getLocalita() != null) { returnValue = getLocalita(); } else { returnValue = getComune(); }  return returnValue; } public boolean equals(Object obj) { if (!(obj instanceof FinIndirizzo)) return false;  FinIndirizzo secondAddress = (FinIndirizzo)obj; int diff = 0; diff += equalsProperty(getCap(), secondAddress.getCap()); diff += equalsProperty(getCodToponimo(), secondAddress.getCodToponimo()); diff += equalsProperty(getComune(), secondAddress.getComune()); diff += equalsProperty(getDesToponimo(), secondAddress.getDesToponimo()); diff += equalsProperty(getIndirizzo(), secondAddress.getIndirizzo()); diff += equalsProperty(getLocalita(), secondAddress.getLocalita()); diff += equalsProperty(getNazione(), secondAddress.getNazione()); diff += equalsProperty(getNumeroCivico(), secondAddress.getNumeroCivico()); diff += equalsProperty(getProv(), secondAddress.getProv()); diff += equalsProperty(getProv(), secondAddress.getProv()); diff += equalsProperty(getPresso(), secondAddress.getPresso()); if (diff != 0) return false;  return true; } private int equalsProperty(String a, String b) { if (!ArchUtils.isValid(a) && !ArchUtils.isValid(b)) return 0;  if (a != null && b != null && a.trim().equals(b.trim())) return 0;  return 1; }
/*     */   public int hashCode() { if (Integer.MIN_VALUE == this.hashCode) { if (null == getIndirizzoId()) return super.hashCode();  return (new HashCodeBuilder()).append(this.indirizzoId).append(this.indirizzo).append(this.localita).append(this.nazione).append(this.prov).append(this.comune).append(this.cap).append(this.numeroCivico).append(this.presso).toHashCode(); }  return this.hashCode; }
/*     */   public boolean isEmptyForBussinessLogic() { return (new EqualsBuilder()).append(this.indirizzo, (this.indirizzo == null) ? null : "").append(this.nazione, (this.nazione == null) ? null : "").append(this.prov, (this.prov == null) ? null : "").append(this.localita, (this.localita == null) ? null : "").append(this.cap, (this.cap == null) ? null : "").isEquals(); }
/*     */   public Integer getEmittenteId() { return this.emittenteId; }
/*     */   public void setEmittenteId(Integer emittenteId) { this.emittenteId = emittenteId; }
/*     */   public Set getSottoscrizioni() { return this.sottoscrizioni; }
/*     */   public void setSottoscrizioni(Set sottoscrizioni) { this.sottoscrizioni = sottoscrizioni; }
/* 540 */   public String getTipoIndirizzo() { return this.tipoIndirizzo; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoIndirizzo(String tipoIndirizzo) {
/* 548 */     this.tipoIndirizzo = tipoIndirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Set getDispPagamento() {
/* 555 */     return this.dispPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDispPagamento(Set dispPagamento) {
/* 562 */     this.dispPagamento = dispPagamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getProvDatiAnag() {
/* 570 */     return this.provDatiAnag;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProvDatiAnag(String provDatiAnag) {
/* 576 */     this.provDatiAnag = provDatiAnag;
/*     */   }
/*     */   
/*     */   public FinIndirizzo copyFields(FinIndirizzo indir) {
/* 580 */     this.cabResidenza = indir.getCabResidenza();
/* 581 */     this.cap = indir.getCap();
/* 582 */     this.codToponimo = indir.getCodToponimo();
/* 583 */     this.comune = indir.getComune();
/* 584 */     this.dataInserimento = indir.getDataInserimento();
/* 585 */     this.datiSupl = indir.getDatiSupl();
/* 586 */     this.desToponimo = indir.getDesToponimo();
/* 587 */     this.emittenteId = indir.getEmittenteId();
/* 588 */     this.indirizzo = indir.getIndirizzo();
/* 589 */     this.indiSeparato = indir.getIndiSeparato();
/* 590 */     this.localita = indir.getLocalita();
/* 591 */     this.nazione = indir.getNazione();
/* 592 */     this.numeroCivico = indir.getNumeroCivico();
/* 593 */     this.presNote = indir.getPresNote();
/* 594 */     this.presso = indir.getPresso();
/* 595 */     this.prov = indir.getProv();
/* 596 */     this.provDatiAnag = indir.getProvDatiAnag();
/* 597 */     this.tipoIndirizzo = indir.getTipoIndirizzo();
/* 598 */     this.utenteInserimento = indir.getUtenteInserimento();
/* 599 */     this.dataUltimaModificaSlave = new Date();
/* 600 */     this.flagEsistenza = "S";
/* 601 */     this.proceduraUltimaModificaSlave = indir.getProceduraUltimaModificaSlave();
/* 602 */     this.tipoUltimaModificaSlave = "U";
/* 603 */     this.userUltimaModificaSlave = indir.getUserUltimaModificaSlave();
/* 604 */     return this;
/*     */   }
/*     */   
/*     */   public FinIndirizzo copyFields(FinIndirizzoOth indir) {
/* 608 */     this.cabResidenza = indir.getCabResidenza();
/* 609 */     this.cap = indir.getCap();
/* 610 */     this.codToponimo = indir.getCodToponimo();
/* 611 */     this.comune = indir.getComune();
/* 612 */     this.dataInserimento = indir.getDataInserimento();
/* 613 */     this.datiSupl = indir.getDatiSupl();
/* 614 */     this.desToponimo = indir.getDesToponimo();
/* 615 */     this.emittenteId = indir.getEmittenteId();
/* 616 */     this.indirizzo = indir.getIndirizzo();
/* 617 */     this.indiSeparato = indir.getIndiSeparato();
/* 618 */     this.localita = indir.getLocalita();
/* 619 */     this.nazione = indir.getNazione();
/* 620 */     this.numeroCivico = indir.getNumeroCivico();
/* 621 */     this.presNote = indir.getPresNote();
/* 622 */     this.presso = indir.getPresso();
/* 623 */     this.prov = indir.getProv();
/* 624 */     this.provDatiAnag = indir.getProvDatiAnag();
/* 625 */     this.tipoIndirizzo = indir.getTipoIndirizzo();
/* 626 */     this.utenteInserimento = indir.getUtenteInserimento();
/* 627 */     this.dataUltimaModificaSlave = new Date();
/* 628 */     this.flagEsistenza = "S";
/* 629 */     this.proceduraUltimaModificaSlave = indir.getProceduraUltimaModificaSlave();
/* 630 */     this.tipoUltimaModificaSlave = "U";
/* 631 */     this.userUltimaModificaSlave = indir.getUserUltimaModificaSlave();
/* 632 */     return this;
/*     */   }
/*     */   
/*     */   public Set getLegameIndir() {
/* 636 */     return this.legameIndir;
/*     */   }
/*     */   
/*     */   public void setLegameIndir(Set legameIndir) {
/* 640 */     this.legameIndir = legameIndir;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinIndirizzo.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */