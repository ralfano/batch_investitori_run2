/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAntCrm4
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceAgente;
/*     */   private String codiceProdottoEsterno;
/*     */   private String codiceLinea;
/*     */   private String causaleProvvigionale;
/*     */   private Date dataCompetenza;
/*     */   private Double importoProvvigione;
/*     */   private String societaProdotto;
/*     */   private String tipoProdotto;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String gradoGerarchico;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public Date getDataErrore() {
/*  31 */     return this.dataErrore;
/*     */   }
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/*  35 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  39 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  43 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAntCrm4() {}
/*     */   
/*     */   public FlxAntCrm4(Integer flxId) {
/*  50 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  57 */     return this.causaleProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  64 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAgente() {
/*  71 */     return this.codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/*  78 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  85 */     return this.codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  92 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceLinea() {
/*  99 */     return this.codiceLinea;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceLinea(String codiceLinea) {
/* 106 */     this.codiceLinea = codiceLinea;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceProdottoEsterno() {
/* 113 */     return this.codiceProdottoEsterno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceProdottoEsterno(String codiceProdottoEsterno) {
/* 120 */     this.codiceProdottoEsterno = codiceProdottoEsterno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRete() {
/* 127 */     return this.codiceRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 134 */     this.codiceRete = codiceRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 141 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 148 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCompetenza() {
/* 155 */     return this.dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 162 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 169 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 176 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGradoGerarchico() {
/* 183 */     return this.gradoGerarchico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/* 190 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProvvigione() {
/* 197 */     return this.importoProvvigione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoProvvigione(Double importoProvvigione) {
/* 204 */     this.importoProvvigione = importoProvvigione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 211 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 218 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSocietaProdotto() {
/* 225 */     return this.societaProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSocietaProdotto(String societaProdotto) {
/* 232 */     this.societaProdotto = societaProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 239 */     return this.statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 246 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProdotto() {
/* 253 */     return this.tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 260 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 265 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntCrm4.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */