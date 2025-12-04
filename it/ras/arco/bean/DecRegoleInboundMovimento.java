/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DecRegoleInboundMovimento
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer decRegoleInboundId;
/*     */   private String codiceEmittente;
/*     */   private String prodAttFinDecod;
/*     */   private String causaleMovimentoDecod;
/*     */   private String beanGetContratto;
/*     */   private Integer controllaOrdine;
/*     */   private Integer verificaEmittente;
/*     */   private String emittenteDecod;
/*     */   private Integer verificaTipoQuote;
/*     */   private String beanGetAttFinProdotto;
/*     */   private Integer convertiValuta;
/*     */   private Integer calcolaImportoNetto;
/*     */   private Integer movimentiIniziativa;
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   private Integer regolaAttiva;
/*     */   private String descrizioneRegola;
/*     */   private Integer estraiContrattoDaOrdine;
/*     */   private Integer controllaMovimentoPrecedente;
/*     */   private Integer rollbackMovimentoPrecedente;
/*     */   private Integer creaOrdine;
/*     */   private String calcolaMovimento;
/*     */   private String decMezzoPag;
/*     */   
/*     */   public String getDecMezzoPag() {
/*  67 */     return this.decMezzoPag;
/*     */   }
/*     */   
/*     */   public void setDecMezzoPag(String decMezzoPag) {
/*  71 */     this.decMezzoPag = decMezzoPag;
/*     */   }
/*     */   
/*     */   public String getProdAttFinDecod() {
/*  75 */     return this.prodAttFinDecod;
/*     */   }
/*     */   
/*     */   public void setProdAttFinDecod(String prodAttFinDecod) {
/*  79 */     this.prodAttFinDecod = prodAttFinDecod;
/*     */   }
/*     */   
/*     */   public Integer getCreaOrdine() {
/*  83 */     return this.creaOrdine;
/*     */   }
/*     */   
/*     */   public void setCreaOrdine(Integer creaOrdine) {
/*  87 */     this.creaOrdine = creaOrdine;
/*     */   }
/*     */   
/*     */   public Integer getControllaMovimentoPrecedente() {
/*  91 */     return this.controllaMovimentoPrecedente;
/*     */   }
/*     */   
/*     */   public void setControllaMovimentoPrecedente(Integer controllaMovimentoPrecedente) {
/*  95 */     this.controllaMovimentoPrecedente = controllaMovimentoPrecedente;
/*     */   }
/*     */   
/*     */   public Integer getEstraiContrattoDaOrdine() {
/*  99 */     return this.estraiContrattoDaOrdine;
/*     */   }
/*     */   
/*     */   public void setEstraiContrattoDaOrdine(Integer estraiContrattoDaOrdine) {
/* 103 */     this.estraiContrattoDaOrdine = estraiContrattoDaOrdine;
/*     */   }
/*     */   
/*     */   public String getBeanGetAttFinProdotto() {
/* 107 */     return this.beanGetAttFinProdotto;
/*     */   }
/*     */   
/*     */   public void setBeanGetAttFinProdotto(String beanGetAttFinProdotto) {
/* 111 */     this.beanGetAttFinProdotto = beanGetAttFinProdotto;
/*     */   }
/*     */   
/*     */   public String getBeanGetContratto() {
/* 115 */     return this.beanGetContratto;
/*     */   }
/*     */   
/*     */   public void setBeanGetContratto(String beanGetContratto) {
/* 119 */     this.beanGetContratto = beanGetContratto;
/*     */   }
/*     */   
/*     */   public String getCausaleMovimentoDecod() {
/* 123 */     return this.causaleMovimentoDecod;
/*     */   }
/*     */   
/*     */   public void setCausaleMovimentoDecod(String causaleMovimentoDecod) {
/* 127 */     this.causaleMovimentoDecod = causaleMovimentoDecod;
/*     */   }
/*     */   
/*     */   public String getCodiceEmittente() {
/* 131 */     return this.codiceEmittente;
/*     */   }
/*     */   
/*     */   public void setCodiceEmittente(String codiceEmittente) {
/* 135 */     this.codiceEmittente = codiceEmittente;
/*     */   }
/*     */   
/*     */   public Integer getControllaOrdine() {
/* 139 */     return this.controllaOrdine;
/*     */   }
/*     */   
/*     */   public void setControllaOrdine(Integer controllaOrdine) {
/* 143 */     this.controllaOrdine = controllaOrdine;
/*     */   }
/*     */   
/*     */   public Integer getDecRegoleInboundId() {
/* 147 */     return this.decRegoleInboundId;
/*     */   }
/*     */   
/*     */   public void setDecRegoleInboundId(Integer decRegoleInboundId) {
/* 151 */     this.decRegoleInboundId = decRegoleInboundId;
/*     */   }
/*     */   
/*     */   public String getEmittenteDecod() {
/* 155 */     return this.emittenteDecod;
/*     */   }
/*     */   
/*     */   public void setEmittenteDecod(String emittenteDecod) {
/* 159 */     this.emittenteDecod = emittenteDecod;
/*     */   }
/*     */   
/*     */   public Integer getVerificaEmittente() {
/* 163 */     return this.verificaEmittente;
/*     */   }
/*     */   
/*     */   public void setVerificaEmittente(Integer verificaEmittente) {
/* 167 */     this.verificaEmittente = verificaEmittente;
/*     */   }
/*     */   
/*     */   public Integer getVerificaTipoQuote() {
/* 171 */     return this.verificaTipoQuote;
/*     */   }
/*     */   
/*     */   public void setVerificaTipoQuote(Integer verificaTipoQuote) {
/* 175 */     this.verificaTipoQuote = verificaTipoQuote;
/*     */   }
/*     */   
/*     */   public Integer getCalcolaImportoNetto() {
/* 179 */     return this.calcolaImportoNetto;
/*     */   }
/*     */   
/*     */   public void setCalcolaImportoNetto(Integer calcolaImportoNetto) {
/* 183 */     this.calcolaImportoNetto = calcolaImportoNetto;
/*     */   }
/*     */   
/*     */   public Integer getConvertiValuta() {
/* 187 */     return this.convertiValuta;
/*     */   }
/*     */   
/*     */   public void setConvertiValuta(Integer convertiValuta) {
/* 191 */     this.convertiValuta = convertiValuta;
/*     */   }
/*     */   
/*     */   public Integer getMovimentiIniziativa() {
/* 195 */     return this.movimentiIniziativa;
/*     */   }
/*     */   
/*     */   public void setMovimentiIniziativa(Integer movimentiIniziativa) {
/* 199 */     this.movimentiIniziativa = movimentiIniziativa;
/*     */   }
/*     */   
/*     */   public Date getDataInserimento() {
/* 203 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/* 207 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */   
/*     */   public String getDescrizioneRegola() {
/* 211 */     return this.descrizioneRegola;
/*     */   }
/*     */   
/*     */   public void setDescrizioneRegola(String descrizioneRegola) {
/* 215 */     this.descrizioneRegola = descrizioneRegola;
/*     */   }
/*     */   
/*     */   public Integer getRegolaAttiva() {
/* 219 */     return this.regolaAttiva;
/*     */   }
/*     */   
/*     */   public void setRegolaAttiva(Integer regolaAttiva) {
/* 223 */     this.regolaAttiva = regolaAttiva;
/*     */   }
/*     */   
/*     */   public String getUtenteInserimento() {
/* 227 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/* 231 */     this.utenteInserimento = utenteInserimento;
/*     */   }
/*     */   
/*     */   public Integer getRollbackMovimentoPrecedente() {
/* 235 */     return this.rollbackMovimentoPrecedente;
/*     */   }
/*     */   
/*     */   public void setRollbackMovimentoPrecedente(Integer rollbackMovimentoPrecedente) {
/* 239 */     this.rollbackMovimentoPrecedente = rollbackMovimentoPrecedente;
/*     */   }
/*     */   
/*     */   public String getCalcolaMovimento() {
/* 243 */     return this.calcolaMovimento;
/*     */   }
/*     */   
/*     */   public void setCalcolaMovimento(String calcolaMovimento) {
/* 247 */     this.calcolaMovimento = calcolaMovimento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\DecRegoleInboundMovimento.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */