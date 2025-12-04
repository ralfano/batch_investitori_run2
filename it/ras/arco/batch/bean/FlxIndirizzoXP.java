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
/*     */ public class FlxIndirizzoXP
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer indirizzoXpId;
/*     */   private Integer soggettoId;
/*     */   private Integer contrattoId;
/*     */   private String codToponimo;
/*     */   private String destToponimo;
/*     */   private String indirizzo;
/*     */   private String numeroCivico;
/*     */   private String CAP;
/*     */   private String provincia;
/*     */   private String comune;
/*     */   private String localita;
/*     */   private String nazione;
/*     */   private String presso;
/*     */   private String pressoNote;
/*     */   private String indirizzoSeparato;
/*     */   private String datiSuplS;
/*     */   private String gstdUserInsS;
/*     */   private Date gstdInseD;
/*     */   private String statoElab;
/*     */   
/*     */   public FlxIndirizzoXP() {}
/*     */   
/*     */   public FlxIndirizzoXP(String aStatoElab, String cap, String toponimoT, String comune, Integer id, String suplS, String toponimoS, Date inseD, String insS, String indirizzo, Integer xp, String separato, String localita, String nazione, String civico, String presso, String note, String provincia, Integer id2) {
/*  38 */     this.statoElab = aStatoElab;
/*  39 */     this.CAP = cap;
/*  40 */     this.codToponimo = toponimoT;
/*  41 */     this.comune = comune;
/*  42 */     this.contrattoId = id;
/*  43 */     this.datiSuplS = suplS;
/*  44 */     this.destToponimo = toponimoS;
/*  45 */     this.gstdInseD = inseD;
/*  46 */     this.gstdUserInsS = insS;
/*  47 */     this.indirizzo = indirizzo;
/*  48 */     this.indirizzoXpId = xp;
/*  49 */     this.indirizzoSeparato = separato;
/*  50 */     this.localita = localita;
/*  51 */     this.nazione = nazione;
/*  52 */     this.numeroCivico = civico;
/*  53 */     this.presso = presso;
/*  54 */     this.pressoNote = note;
/*  55 */     this.provincia = provincia;
/*  56 */     this.soggettoId = id2;
/*     */   }
/*     */   
/*     */   public String getStatoElab() {
/*  60 */     return this.statoElab;
/*     */   }
/*     */   public void setStatoElab(String stato) {
/*  63 */     this.statoElab = stato;
/*     */   }
/*     */   public Integer getIndirizzoXpId() {
/*  66 */     return this.indirizzoXpId;
/*     */   }
/*     */   
/*     */   public void setIndirizzoXpId(Integer indirizzoIdXp) {
/*  70 */     this.indirizzoXpId = indirizzoIdXp;
/*     */   }
/*     */   
/*     */   public String getCAP() {
/*  74 */     return this.CAP;
/*     */   }
/*     */   
/*     */   public void setCAP(String cap) {
/*  78 */     this.CAP = cap;
/*     */   }
/*     */   
/*     */   public String getCodToponimo() {
/*  82 */     return this.codToponimo;
/*     */   }
/*     */   
/*     */   public void setCodToponimo(String codToponimoT) {
/*  86 */     this.codToponimo = codToponimoT;
/*     */   }
/*     */   
/*     */   public String getComune() {
/*  90 */     return this.comune;
/*     */   }
/*     */   
/*     */   public void setComune(String comune) {
/*  94 */     this.comune = comune;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/*  98 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/* 102 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public String getDatiSuplS() {
/* 106 */     return this.datiSuplS;
/*     */   }
/*     */   
/*     */   public void setDatiSuplS(String datiSuplS) {
/* 110 */     this.datiSuplS = datiSuplS;
/*     */   }
/*     */   
/*     */   public String getDestToponimo() {
/* 114 */     return this.destToponimo;
/*     */   }
/*     */   
/*     */   public void setDestToponimo(String destToponimoS) {
/* 118 */     this.destToponimo = destToponimoS;
/*     */   }
/*     */   
/*     */   public Date getGstdInseD() {
/* 122 */     return this.gstdInseD;
/*     */   }
/*     */   
/*     */   public void setGstdInseD(Date gstdInseD) {
/* 126 */     this.gstdInseD = gstdInseD;
/*     */   }
/*     */   
/*     */   public String getGstdUserInsS() {
/* 130 */     return this.gstdUserInsS;
/*     */   }
/*     */   
/*     */   public void setGstdUserInsS(String gstdUserInsS) {
/* 134 */     this.gstdUserInsS = gstdUserInsS;
/*     */   }
/*     */   
/*     */   public String getIndirizzo() {
/* 138 */     return this.indirizzo;
/*     */   }
/*     */   
/*     */   public void setIndirizzo(String indirizzo) {
/* 142 */     this.indirizzo = indirizzo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIndirizzoSeparato() {
/* 148 */     return this.indirizzoSeparato;
/*     */   }
/*     */   
/*     */   public void setIndirizzoSeparato(String indirizzoSeparato) {
/* 152 */     this.indirizzoSeparato = indirizzoSeparato;
/*     */   }
/*     */   
/*     */   public String getLocalita() {
/* 156 */     return this.localita;
/*     */   }
/*     */   
/*     */   public void setLocalita(String localita) {
/* 160 */     this.localita = localita;
/*     */   }
/*     */   
/*     */   public String getNazione() {
/* 164 */     return this.nazione;
/*     */   }
/*     */   
/*     */   public void setNazione(String nazione) {
/* 168 */     this.nazione = nazione;
/*     */   }
/*     */   
/*     */   public String getNumeroCivico() {
/* 172 */     return this.numeroCivico;
/*     */   }
/*     */   
/*     */   public void setNumeroCivico(String numeroCivico) {
/* 176 */     this.numeroCivico = numeroCivico;
/*     */   }
/*     */   
/*     */   public String getPresso() {
/* 180 */     return this.presso;
/*     */   }
/*     */   
/*     */   public void setPresso(String presso) {
/* 184 */     this.presso = presso;
/*     */   }
/*     */   
/*     */   public String getPressoNote() {
/* 188 */     return this.pressoNote;
/*     */   }
/*     */   
/*     */   public void setPressoNote(String pressoNote) {
/* 192 */     this.pressoNote = pressoNote;
/*     */   }
/*     */   
/*     */   public String getProvincia() {
/* 196 */     return this.provincia;
/*     */   }
/*     */   
/*     */   public void setProvincia(String provincia) {
/* 200 */     this.provincia = provincia;
/*     */   }
/*     */   
/*     */   public Integer getSoggettoId() {
/* 204 */     return this.soggettoId;
/*     */   }
/*     */   
/*     */   public void setSoggettoId(Integer soggettoId) {
/* 208 */     this.soggettoId = soggettoId;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxIndirizzoXP.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */