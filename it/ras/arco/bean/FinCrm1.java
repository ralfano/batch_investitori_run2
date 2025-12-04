/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import org.apache.commons.lang.builder.ToStringBuilder;
/*     */ 
/*     */ public class FinCrm1
/*     */   extends RasORMBean
/*     */   implements Serializable {
/*     */   private Integer crm1Id;
/*     */   private Integer promotoreId;
/*     */   private Integer prodottoId;
/*     */   private Integer contrattoId;
/*     */   private Integer movimentoId;
/*     */   private String codiceProdottoEsterno;
/*     */   private String codiceLineaEsterno;
/*     */   private String numeroContratto;
/*     */   private String numeroMovimentoEsterno;
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
/*     */   private Date dataInserimentoRecord;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public FinCrm1() {}
/*     */   
/*     */   public FinCrm1(Integer crm1Id) {
/*  41 */     this.crm1Id = crm1Id;
/*     */   }
/*     */   
/*     */   public String getCausaleConferimentoSmobilizzo() {
/*  45 */     return this.causaleConferimentoSmobilizzo;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setCausaleConferimentoSmobilizzo(String causaleConferimentoSmobilizzo) {
/*  50 */     this.causaleConferimentoSmobilizzo = causaleConferimentoSmobilizzo;
/*     */   }
/*     */   
/*     */   public String getCausaleProvvigionale() {
/*  54 */     return this.causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public void setCausaleProvvigionale(String causaleProvvigionale) {
/*  58 */     this.causaleProvvigionale = causaleProvvigionale;
/*     */   }
/*     */   
/*     */   public String getCodiceCompagnia() {
/*  62 */     return this.codiceCompagnia;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagnia(String codiceCompagnia) {
/*  66 */     this.codiceCompagnia = codiceCompagnia;
/*     */   }
/*     */   
/*     */   public String getCodiceLineaEsterno() {
/*  70 */     return this.codiceLineaEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceLineaEsterno(String codiceLineaEsterno) {
/*  74 */     this.codiceLineaEsterno = codiceLineaEsterno;
/*     */   }
/*     */   
/*     */   public String getCodiceProdottoEsterno() {
/*  78 */     return this.codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public void setCodiceProdottoEsterno(String codiceProdottoEsterno) {
/*  82 */     this.codiceProdottoEsterno = codiceProdottoEsterno;
/*     */   }
/*     */   
/*     */   public String getCodiceRete() {
/*  86 */     return this.codiceRete;
/*     */   }
/*     */   
/*     */   public void setCodiceRete(String codiceRete) {
/*  90 */     this.codiceRete = codiceRete;
/*     */   }
/*     */   
/*     */   public Integer getContrattoId() {
/*  94 */     return this.contrattoId;
/*     */   }
/*     */   
/*     */   public void setContrattoId(Integer contrattoId) {
/*  98 */     this.contrattoId = contrattoId;
/*     */   }
/*     */   
/*     */   public Integer getCrm1Id() {
/* 102 */     return this.crm1Id;
/*     */   }
/*     */   
/*     */   public void setCrm1Id(Integer crm1Id) {
/* 106 */     this.crm1Id = crm1Id;
/*     */   }
/*     */   
/*     */   public Date getDataCompetenza() {
/* 110 */     return this.dataCompetenza;
/*     */   }
/*     */   
/*     */   public void setDataCompetenza(Date dataCompetenza) {
/* 114 */     this.dataCompetenza = dataCompetenza;
/*     */   }
/*     */   
/*     */   public Date getDataInserimentoRecord() {
/* 118 */     return this.dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public void setDataInserimentoRecord(Date dataInserimentoRecord) {
/* 122 */     this.dataInserimentoRecord = dataInserimentoRecord;
/*     */   }
/*     */   
/*     */   public Date getDataRegolamento() {
/* 126 */     return this.dataRegolamento;
/*     */   }
/*     */   
/*     */   public void setDataRegolamento(Date dataRegolamento) {
/* 130 */     this.dataRegolamento = dataRegolamento;
/*     */   }
/*     */   
/*     */   public String getFlagDiretteOver() {
/* 134 */     return this.flagDiretteOver;
/*     */   }
/*     */   
/*     */   public void setFlagDiretteOver(String flagDiretteOver) {
/* 138 */     this.flagDiretteOver = flagDiretteOver;
/*     */   }
/*     */   
/*     */   public String getGradoGerarchico() {
/* 142 */     return this.gradoGerarchico;
/*     */   }
/*     */   
/*     */   public void setGradoGerarchico(String gradoGerarchico) {
/* 146 */     this.gradoGerarchico = gradoGerarchico;
/*     */   }
/*     */   
/*     */   public Double getImportoBaseSpese() {
/* 150 */     return this.importoBaseSpese;
/*     */   }
/*     */   
/*     */   public void setImportoBaseSpese(Double importoBaseSpese) {
/* 154 */     this.importoBaseSpese = importoBaseSpese;
/*     */   }
/*     */   
/*     */   public Double getImportoPayIn() {
/* 158 */     return this.importoPayIn;
/*     */   }
/*     */   
/*     */   public void setImportoPayIn(Double importoPayIn) {
/* 162 */     this.importoPayIn = importoPayIn;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigioniDiretteFront() {
/* 166 */     return this.importoProvvigioniDiretteFront;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setImportoProvvigioniDiretteFront(Double importoProvvigioniDiretteFront) {
/* 171 */     this.importoProvvigioniDiretteFront = importoProvvigioniDiretteFront;
/*     */   }
/*     */   
/*     */   public Double getImportoProvvigioniOverFront() {
/* 175 */     return this.importoProvvigioniOverFront;
/*     */   }
/*     */   
/*     */   public void setImportoProvvigioniOverFront(Double importoProvvigioniOverFront) {
/* 179 */     this.importoProvvigioniOverFront = importoProvvigioniOverFront;
/*     */   }
/*     */   
/*     */   public String getModalitaSottoscrizione() {
/* 183 */     return this.modalitaSottoscrizione;
/*     */   }
/*     */   
/*     */   public void setModalitaSottoscrizione(String modalitaSottoscrizione) {
/* 187 */     this.modalitaSottoscrizione = modalitaSottoscrizione;
/*     */   }
/*     */   
/*     */   public Integer getMovimentoId() {
/* 191 */     return this.movimentoId;
/*     */   }
/*     */   
/*     */   public void setMovimentoId(Integer movimentoId) {
/* 195 */     this.movimentoId = movimentoId;
/*     */   }
/*     */   
/*     */   public String getNumeroContratto() {
/* 199 */     return this.numeroContratto;
/*     */   }
/*     */   
/*     */   public void setNumeroContratto(String numeroContratto) {
/* 203 */     this.numeroContratto = numeroContratto;
/*     */   }
/*     */   
/*     */   public String getNumeroMovimentoEsterno() {
/* 207 */     return this.numeroMovimentoEsterno;
/*     */   }
/*     */   
/*     */   public void setNumeroMovimentoEsterno(String numeroMovimentoEsterno) {
/* 211 */     this.numeroMovimentoEsterno = numeroMovimentoEsterno;
/*     */   }
/*     */   
/*     */   public Integer getProdottoId() {
/* 215 */     return this.prodottoId;
/*     */   }
/*     */   
/*     */   public void setProdottoId(Integer prodottoId) {
/* 219 */     this.prodottoId = prodottoId;
/*     */   }
/*     */   
/*     */   public Integer getPromotoreId() {
/* 223 */     return this.promotoreId;
/*     */   }
/*     */   
/*     */   public void setPromotoreId(Integer promotoreId) {
/* 227 */     this.promotoreId = promotoreId;
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
/*     */   public String getTipoProdotto() {
/* 239 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 243 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 247 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 251 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public String toString() {
/* 255 */     return (new ToStringBuilder(this)).append("crm1Id", getCrm1Id()).toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCrm1.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */