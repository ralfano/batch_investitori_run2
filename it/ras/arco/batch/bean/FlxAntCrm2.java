/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAntCrm2
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceAgente;
/*     */   private String codiceProdottoEsterno;
/*     */   private String codiceLinea;
/*     */   private String causaleProvvigionale;
/*     */   private Date dataCompetenza;
/*     */   private Double importoPayIn;
/*     */   private Double importoProvvigioniDiretteManagement;
/*     */   private Double importoProvvigioniOverManagement;
/*     */   private String flagDiretteOver;
/*     */   private String societaProdotto;
/*     */   private String tipoProdotto;
/*     */   private String codiceRete;
/*     */   private String codiceCompagnia;
/*     */   private String gradoGerarchico;
/*     */   private Double baseSpeseStandard;
/*     */   private String codiceMandato;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public Date getDataErrore() {
/*  36 */     return this.dataErrore;
/*     */   }
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/*  40 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  44 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  48 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAntCrm2() {}
/*     */   
/*     */   public FlxAntCrm2(Integer flxId) {
/*  55 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getBaseSpeseStandard() {
/*  62 */     return this.baseSpeseStandard;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setBaseSpeseStandard(Double baseSpeseStandard) {
/*  69 */     this.baseSpeseStandard = baseSpeseStandard;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  76 */     return this.causaleProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  83 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAgente() {
/*  90 */     return this.codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/*  97 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCompagnia() {
/* 104 */     return this.codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/* 111 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceLinea() {
/* 118 */     return this.codiceLinea;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceLinea(String codiceLinea) {
/* 125 */     this.codiceLinea = codiceLinea;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceMandato() {
/* 132 */     return this.codiceMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceMandato(String codiceMandato) {
/* 139 */     this.codiceMandato = codiceMandato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceProdottoEsterno() {
/* 146 */     return this.codiceProdottoEsterno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceProdottoEsterno(String codiceProdottoEsterno) {
/* 153 */     this.codiceProdottoEsterno = codiceProdottoEsterno;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRete() {
/* 160 */     return this.codiceRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 167 */     this.codiceRete = codiceRete;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 174 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 181 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCompetenza() {
/* 188 */     return this.dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 195 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagDiretteOver() {
/* 202 */     return this.flagDiretteOver;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagDiretteOver(String flagDiretteOver) {
/* 209 */     this.flagDiretteOver = flagDiretteOver;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 216 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 223 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGradoGerarchico() {
/* 230 */     return this.gradoGerarchico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/* 237 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoPayIn() {
/* 244 */     return this.importoPayIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoPayIn(Double importoPayIn) {
/* 251 */     this.importoPayIn = importoPayIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProvvigioniDiretteManagement() {
/* 258 */     return this.importoProvvigioniDiretteManagement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoProvvigioniDiretteManagement(Double importoProvvigioniDiretteManagement) {
/* 266 */     this.importoProvvigioniDiretteManagement = importoProvvigioniDiretteManagement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProvvigioniOverManagement() {
/* 273 */     return this.importoProvvigioniOverManagement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoProvvigioniOverManagement(Double importoProvvigioniOverManagement) {
/* 281 */     this.importoProvvigioniOverManagement = importoProvvigioniOverManagement;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 288 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 295 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSocietaProdotto() {
/* 302 */     return this.societaProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSocietaProdotto(String societaProdotto) {
/* 309 */     this.societaProdotto = societaProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 316 */     return this.statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 323 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoProdotto() {
/* 330 */     return this.tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 337 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 342 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntCrm2.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */