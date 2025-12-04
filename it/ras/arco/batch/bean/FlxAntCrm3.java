/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAntCrm3
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceAgente;
/*     */   private String causaleProvvigionale;
/*     */   private Date dataCompetenza;
/*     */   private Double importoProvvigione;
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
/*  27 */     return this.dataErrore;
/*     */   }
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/*  31 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  35 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  39 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAntCrm3() {}
/*     */   
/*     */   public FlxAntCrm3(Integer flxId) {
/*  46 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  53 */     return this.causaleProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  60 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAgente() {
/*  67 */     return this.codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/*  74 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  81 */     return this.codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  88 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRete() {
/*  95 */     return this.codiceRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 102 */     this.codiceRete = codiceRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 109 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 116 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCompetenza() {
/* 123 */     return this.dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 130 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 137 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 144 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGradoGerarchico() {
/* 151 */     return this.gradoGerarchico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/* 158 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProvvigione() {
/* 165 */     return this.importoProvvigione;
/*     */   }
/*     */   
/*     */   public void setImportoProvvigione(Double importoProvvigione) {
/* 169 */     this.importoProvvigione = importoProvvigione;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 174 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 181 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 188 */     return this.statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 195 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 202 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntCrm3.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */