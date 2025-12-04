/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ public class FlxAntCrm1
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceAgente;
/*     */   private String codiceProdottoEsterno;
/*     */   private String codiceLinea;
/*     */   private String codiceMandato;
/*     */   private String numeroProtocollo;
/*     */   private String modalitaSottoscrizione;
/*     */   private String causaleConferimentoSmobilizzo;
/*     */   private String causaleProvvigionale;
/*     */   private Date dataCompetenza;
/*     */   private Date dataRegolamento;
/*     */   private Double importoBaseSpese;
/*     */   private Double importoPayIn;
/*     */   private Double importoProvvigioniDiretteFront;
/*     */   private Double importoProvvigioniOverFront;
/*     */   private String flagDiretteOver;
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
/*  38 */     return this.dataErrore;
/*     */   }
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/*  42 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/*  46 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/*  50 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ 
/*     */   
/*     */   public FlxAntCrm1() {}
/*     */   
/*     */   public FlxAntCrm1(Integer flxId) {
/*  57 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getCausaleConferimentoSmobilizzo() {
/*  61 */     return this.causaleConferimentoSmobilizzo;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCausaleConferimentoSmobilizzo(String causaleConferimentoSmobilizzo) {
/*  66 */     this.causaleConferimentoSmobilizzo = causaleConferimentoSmobilizzo;
/*     */   }
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  70 */     return this.causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  74 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public String getCodiceAgente() {
/*  78 */     return this.codiceAgente;
/*     */   }
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/*  82 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  86 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  90 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceLinea() {
/*  94 */     return this.codiceLinea;
/*     */   }
/*     */   
/*     */   public void setCodiceLinea(String codiceLinea) {
/*  98 */     this.codiceLinea = codiceLinea;
/*     */   }
/*     */   
/*     */   public String getCodiceMandato() {
/* 102 */     return this.codiceMandato;
/*     */   }
/*     */   
/*     */   public void setCodiceMandato(String codiceMandato) {
/* 106 */     this.codiceMandato = codiceMandato;
/*     */   }
/*     */   
/*     */   public String getCodiceProdottoEsterno() {
/* 110 */     return this.codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoEsterno(String codiceProdottoEsterno) {
/* 114 */     this.codiceProdottoEsterno = codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/* 118 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/* 122 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public Date getDataCaricamento() {
/* 126 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 130 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */   
/*     */   public Date getDataCompetenza() {
/* 134 */     return this.dataCompetenza;
/*     */   }
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 138 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */   
/*     */   public Date getDataRegolamento() {
/* 142 */     return this.dataRegolamento;
/*     */   }
/*     */   
/*     */   public void setDataRegolamento(Date dataRegolamento) {
/* 146 */     this.dataRegolamento = dataRegolamento;
/*     */   }
/*     */   
/*     */   public String getFlagDiretteOver() {
/* 150 */     return this.flagDiretteOver;
/*     */   }
/*     */   
/*     */   public void setFlagDiretteOver(String flagDiretteOver) {
/* 154 */     this.flagDiretteOver = flagDiretteOver;
/*     */   }
/*     */   
/*     */   public Integer getFlxId() {
/* 158 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 162 */     this.flxId = flxId;
/*     */   }
/*     */   
/*     */   public String getGradoGerarchico() {
/* 166 */     return this.gradoGerarchico;
/*     */   }
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/* 170 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */   
/*     */   public Double getImportoBaseSpese() {
/* 174 */     return this.importoBaseSpese;
/*     */   }
/*     */   
/*     */   public void setImportoBaseSpese(Double importoBaseSpese) {
/* 178 */     this.importoBaseSpese = importoBaseSpese;
/*     */   }
/*     */   
/*     */   public Double getImportoPayIn() {
/* 182 */     return this.importoPayIn;
/*     */   }
/*     */   
/*     */   public void setImportoPayIn(Double importoPayIn) {
/* 186 */     this.importoPayIn = importoPayIn;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigioniDiretteFront() {
/* 190 */     return this.importoProvvigioniDiretteFront;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setImportoProvvigioniDiretteFront(Double importoProvvigioniDiretteFront) {
/* 195 */     this.importoProvvigioniDiretteFront = importoProvvigioniDiretteFront;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigioniOverFront() {
/* 199 */     return this.importoProvvigioniOverFront;
/*     */   }
/*     */   
/*     */   public void setImportoProvvigioniOverFront(Double importoProvvigioniOverFront) {
/* 203 */     this.importoProvvigioniOverFront = importoProvvigioniOverFront;
/*     */   }
/*     */   
/*     */   public String getIstanza() {
/* 207 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 211 */     this.istanza = istanza;
/*     */   }
/*     */   
/*     */   public String getModalitaSottoscrizione() {
/* 215 */     return this.modalitaSottoscrizione;
/*     */   }
/*     */   
/*     */   public void setModalitaSottoscrizione(String modalitaSottoscrizione) {
/* 219 */     this.modalitaSottoscrizione = modalitaSottoscrizione;
/*     */   }
/*     */   
/*     */   public String getNumeroProtocollo() {
/* 223 */     return this.numeroProtocollo;
/*     */   }
/*     */   
/*     */   public void setNumeroProtocollo(String numeroProtocollo) {
/* 227 */     this.numeroProtocollo = numeroProtocollo;
/*     */   }
/*     */   
/*     */   public String getSocietaProdotto() {
/* 231 */     return this.societaProdotto;
/*     */   }
/*     */   
/*     */   public void setSocietaProdotto(String societaProdotto) {
/* 235 */     this.societaProdotto = societaProdotto;
/*     */   }
/*     */   
/*     */   public String getStatoElaborazione() {
/* 239 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 243 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 247 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 251 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 255 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntCrm1.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */