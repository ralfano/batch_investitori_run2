/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAntRiassegnazioni
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceIstituto;
/*     */   private String codiceProdottoAnt;
/*     */   private String codiceProdottoEsterno;
/*     */   private String numeroContratto;
/*     */   private String codiceAttualePromotore;
/*     */   private String codiceAttualePromotoreSplit;
/*     */   private String reteAttualePromotore;
/*     */   private String compagniaAttualePromotore;
/*     */   private Date dataDecorrAssegnContratto;
/*     */   private Date dataDecorrAssegnSplit;
/*     */   private Date dataInserRiassegnazione;
/*     */   private String codicePrecPromotore;
/*     */   private String codicePrecPromotoreSplit;
/*     */   private String retePrecedentePromotore;
/*     */   private String compagniaPrecedentePromotore;
/*     */   private String tipoAttivita;
/*     */   private String societaProdotto;
/*     */   private String tipoProdotto;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxAntRiassegnazioni() {}
/*     */   
/*     */   public FlxAntRiassegnazioni(Integer flxId) {
/*  43 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  53 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  57 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIstituto() {
/*  64 */     return this.codiceIstituto;
/*     */   }
/*     */   
/*     */   public void setCodiceIstituto(String codiceIstituto) {
/*  68 */     this.codiceIstituto = codiceIstituto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceProdottoAnt() {
/*  75 */     return this.codiceProdottoAnt;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoAnt(String codiceProdottoAnt) {
/*  79 */     this.codiceProdottoAnt = codiceProdottoAnt;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceProdottoEsterno() {
/*  86 */     return this.codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoEsterno(String codiceProdottoEsterno) {
/*  90 */     this.codiceProdottoEsterno = codiceProdottoEsterno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroContratto() {
/*  97 */     return this.numeroContratto;
/*     */   }
/*     */   
/*     */   public void setNumeroContratto(String numeroContratto) {
/* 101 */     this.numeroContratto = numeroContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAttualePromotore() {
/* 108 */     return this.codiceAttualePromotore;
/*     */   }
/*     */   
/*     */   public void setCodiceAttualePromotore(String codiceAttualePromotore) {
/* 112 */     this.codiceAttualePromotore = codiceAttualePromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAttualePromotoreSplit() {
/* 119 */     return this.codiceAttualePromotoreSplit;
/*     */   }
/*     */   
/*     */   public void setCodiceAttualePromotoreSplit(String codiceAttualePromotoreSplit) {
/* 123 */     this.codiceAttualePromotoreSplit = codiceAttualePromotoreSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getReteAttualePromotore() {
/* 130 */     return this.reteAttualePromotore;
/*     */   }
/*     */   
/*     */   public void setReteAttualePromotore(String reteAttualePromotore) {
/* 134 */     this.reteAttualePromotore = reteAttualePromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCompagniaAttualePromotore() {
/* 141 */     return this.compagniaAttualePromotore;
/*     */   }
/*     */   
/*     */   public void setCompagniaAttualePromotore(String compagniaAttualePromotore) {
/* 145 */     this.compagniaAttualePromotore = compagniaAttualePromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataDecorrAssegnContratto() {
/* 152 */     return this.dataDecorrAssegnContratto;
/*     */   }
/*     */   
/*     */   public void setDataDecorrAssegnContratto(Date dataDecorrAssegnContratto) {
/* 156 */     this.dataDecorrAssegnContratto = dataDecorrAssegnContratto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataDecorrAssegnSplit() {
/* 163 */     return this.dataDecorrAssegnSplit;
/*     */   }
/*     */   
/*     */   public void setDataDecorrAssegnSplit(Date dataDecorrAssegnSplit) {
/* 167 */     this.dataDecorrAssegnSplit = dataDecorrAssegnSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInserRiassegnazione() {
/* 174 */     return this.dataInserRiassegnazione;
/*     */   }
/*     */   
/*     */   public void setDataInserRiassegnazione(Date dataInserRiassegnazione) {
/* 178 */     this.dataInserRiassegnazione = dataInserRiassegnazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePrecPromotore() {
/* 186 */     return this.codicePrecPromotore;
/*     */   }
/*     */   
/*     */   public void setCodicePrecPromotore(String codicePrecPromotore) {
/* 190 */     this.codicePrecPromotore = codicePrecPromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePrecPromotoreSplit() {
/* 197 */     return this.codicePrecPromotoreSplit;
/*     */   }
/*     */   
/*     */   public void setCodicePrecPromotoreSplit(String codicePrecPromotoreSplit) {
/* 201 */     this.codicePrecPromotoreSplit = codicePrecPromotoreSplit;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRetePrecedentePromotore() {
/* 208 */     return this.retePrecedentePromotore;
/*     */   }
/*     */   
/*     */   public void setRetePrecedentePromotore(String retePrecedentePromotore) {
/* 212 */     this.retePrecedentePromotore = retePrecedentePromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCompagniaPrecedentePromotore() {
/* 219 */     return this.compagniaPrecedentePromotore;
/*     */   }
/*     */   
/*     */   public void setCompagniaPrecedentePromotore(String compagniaPrecedentePromotore) {
/* 223 */     this.compagniaPrecedentePromotore = compagniaPrecedentePromotore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoAttivita() {
/* 230 */     return this.tipoAttivita;
/*     */   }
/*     */   
/*     */   public void setTipoAttivita(String tipoAttivita) {
/* 234 */     this.tipoAttivita = tipoAttivita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSocietaProdotto() {
/* 241 */     return this.societaProdotto;
/*     */   }
/*     */   
/*     */   public void setSocietaProdotto(String societaProdotto) {
/* 245 */     this.societaProdotto = societaProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProdotto() {
/* 252 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 256 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 264 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 268 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 275 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 279 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 286 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 290 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 295 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataErrore() {
/* 301 */     return this.dataErrore;
/*     */   }
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/* 305 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 309 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 313 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntRiassegnazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */