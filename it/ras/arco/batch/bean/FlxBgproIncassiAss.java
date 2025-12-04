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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxBgproIncassiAss
/*     */   extends RasORMBean
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceAgente;
/*     */   private String codiceReteDiAppartenenza;
/*     */   private String qualificaAgente;
/*     */   private String numeroPolizza;
/*     */   private String codiceProdotto;
/*     */   private String descrizioneProdotto;
/*     */   private Integer codiceTariffa;
/*     */   private String descrizioneTariffa;
/*     */   private Date dataInizioDecorrenza;
/*     */   private Date dataScadenza;
/*     */   private String flagPolizza;
/*     */   private String frazionamento;
/*     */   private String contraente;
/*     */   private String assicurato;
/*     */   private Double importoProduzione;
/*     */   private Date dataRiferimento;
/*     */   private Date dataEmissionePolizza;
/*     */   private Date dataRegistrazione;
/*     */   private Date dataTimbroPostaInterna;
/*     */   private String numeroProposta;
/*     */   private String flagUnitLinked;
/*     */   private String divisaImporto;
/*     */   private String codiceProdottoNuovo;
/*     */   private String versioneProdotto;
/*     */   private Date dataFinePagamentoPremi;
/*     */   private String flagTipoCompagnia;
/*     */   private String flagVersamento;
/*     */   private Double premioDiComputo;
/*     */   private Double premioProvvigionale;
/*     */   private Date dataUltimaRataPagata;
/*     */   private String descrizioneFondo;
/*     */   private String filler;
/*     */   private String statoElab;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   
/*     */   public FlxBgproIncassiAss() {}
/*     */   
/*     */   public FlxBgproIncassiAss(String codiceAgente, String codiceReteDiAppartenenza, String qualificaAgente, String numeroPolizza, String codiceProdotto, String descrizioneProdotto, Integer codiceTariffa, String descrizioneTariffa, Date dataInizioDecorrenza, Date dataScadenza, String flagPolizza, String frazionamento, String contraente, String assicurato, Double importoProduzione, Date dataRiferimento, Date dataEmissionePolizza, Date dataRegistrazione, Date dataTimbroPostaInterna, String numeroProposta, String flagUnitLinked, String divisaImporto, String codiceProdottoNuovo, String versioneProdotto, Date dataFinePagamentoPremi, String flagTipoCompagnia, String flagVersamento, Double premioDiComputo, Double premioProvvigionale, Date dataUltimaRataPagata, String descrizioneFondo, String filler, String statoElab, String istanza, Date dataCaricamento) {
/* 112 */     this.codiceAgente = codiceAgente;
/* 113 */     this.codiceReteDiAppartenenza = codiceReteDiAppartenenza;
/* 114 */     this.qualificaAgente = qualificaAgente;
/* 115 */     this.numeroPolizza = numeroPolizza;
/* 116 */     this.codiceProdotto = codiceProdotto;
/* 117 */     this.descrizioneProdotto = descrizioneProdotto;
/* 118 */     this.codiceTariffa = codiceTariffa;
/* 119 */     this.descrizioneTariffa = descrizioneTariffa;
/* 120 */     this.dataInizioDecorrenza = dataInizioDecorrenza;
/* 121 */     this.dataScadenza = dataScadenza;
/* 122 */     this.flagPolizza = flagPolizza;
/* 123 */     this.frazionamento = frazionamento;
/* 124 */     this.contraente = contraente;
/* 125 */     this.assicurato = assicurato;
/* 126 */     this.importoProduzione = importoProduzione;
/* 127 */     this.dataRiferimento = dataRiferimento;
/* 128 */     this.dataEmissionePolizza = dataEmissionePolizza;
/* 129 */     this.dataRegistrazione = dataRegistrazione;
/* 130 */     this.dataTimbroPostaInterna = dataTimbroPostaInterna;
/* 131 */     this.numeroProposta = numeroProposta;
/* 132 */     this.flagUnitLinked = flagUnitLinked;
/* 133 */     this.divisaImporto = divisaImporto;
/* 134 */     this.codiceProdottoNuovo = codiceProdottoNuovo;
/* 135 */     this.versioneProdotto = versioneProdotto;
/* 136 */     this.dataFinePagamentoPremi = dataFinePagamentoPremi;
/* 137 */     this.flagTipoCompagnia = flagTipoCompagnia;
/* 138 */     this.flagVersamento = flagVersamento;
/* 139 */     this.premioDiComputo = premioDiComputo;
/* 140 */     this.premioProvvigionale = premioProvvigionale;
/* 141 */     this.dataUltimaRataPagata = dataUltimaRataPagata;
/* 142 */     this.descrizioneFondo = descrizioneFondo;
/* 143 */     this.filler = filler;
/* 144 */     this.statoElab = statoElab;
/* 145 */     this.istanza = istanza;
/* 146 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAssicurato() {
/* 152 */     return this.assicurato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAssicurato(String assicurato) {
/* 158 */     this.assicurato = assicurato;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAgente() {
/* 164 */     return this.codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceAgente(String codiceAgente) {
/* 170 */     this.codiceAgente = codiceAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceProdotto() {
/* 176 */     return this.codiceProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceProdotto(String codiceProdotto) {
/* 182 */     this.codiceProdotto = codiceProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceProdottoNuovo() {
/* 188 */     return this.codiceProdottoNuovo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceProdottoNuovo(String codiceProdottoNuovo) {
/* 194 */     this.codiceProdottoNuovo = codiceProdottoNuovo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceReteDiAppartenenza() {
/* 200 */     return this.codiceReteDiAppartenenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceReteDiAppartenenza(String codiceReteDiAppartenenza) {
/* 206 */     this.codiceReteDiAppartenenza = codiceReteDiAppartenenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getCodiceTariffa() {
/* 212 */     return this.codiceTariffa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceTariffa(Integer codiceTariffa) {
/* 218 */     this.codiceTariffa = codiceTariffa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getContraente() {
/* 224 */     return this.contraente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setContraente(String contraente) {
/* 230 */     this.contraente = contraente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 236 */     return this.dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 242 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataEmissionePolizza() {
/* 248 */     return this.dataEmissionePolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataEmissionePolizza(Date dataEmissionePolizza) {
/* 254 */     this.dataEmissionePolizza = dataEmissionePolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFinePagamentoPremi() {
/* 260 */     return this.dataFinePagamentoPremi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataFinePagamentoPremi(Date dataFinePagamentoPremi) {
/* 266 */     this.dataFinePagamentoPremi = dataFinePagamentoPremi;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioDecorrenza() {
/* 272 */     return this.dataInizioDecorrenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioDecorrenza(Date dataInizioDecorrenza) {
/* 278 */     this.dataInizioDecorrenza = dataInizioDecorrenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRegistrazione() {
/* 284 */     return this.dataRegistrazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataRegistrazione(Date dataRegistrazione) {
/* 290 */     this.dataRegistrazione = dataRegistrazione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataRiferimento() {
/* 296 */     return this.dataRiferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataRiferimento(Date dataRiferimento) {
/* 302 */     this.dataRiferimento = dataRiferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataScadenza() {
/* 308 */     return this.dataScadenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataScadenza(Date dataScadenza) {
/* 314 */     this.dataScadenza = dataScadenza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataTimbroPostaInterna() {
/* 320 */     return this.dataTimbroPostaInterna;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataTimbroPostaInterna(Date dataTimbroPostaInterna) {
/* 326 */     this.dataTimbroPostaInterna = dataTimbroPostaInterna;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataUltimaRataPagata() {
/* 332 */     return this.dataUltimaRataPagata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataUltimaRataPagata(Date dataUltimaRataPagata) {
/* 338 */     this.dataUltimaRataPagata = dataUltimaRataPagata;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneFondo() {
/* 344 */     return this.descrizioneFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneFondo(String descrizioneFondo) {
/* 350 */     this.descrizioneFondo = descrizioneFondo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneProdotto() {
/* 356 */     return this.descrizioneProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneProdotto(String descrizioneProdotto) {
/* 362 */     this.descrizioneProdotto = descrizioneProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneTariffa() {
/* 368 */     return this.descrizioneTariffa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneTariffa(String descrizioneTariffa) {
/* 374 */     this.descrizioneTariffa = descrizioneTariffa;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDivisaImporto() {
/* 380 */     return this.divisaImporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDivisaImporto(String divisaImporto) {
/* 386 */     this.divisaImporto = divisaImporto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFiller() {
/* 392 */     return this.filler;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFiller(String filler) {
/* 398 */     this.filler = filler;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagPolizza() {
/* 404 */     return this.flagPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagPolizza(String flagPolizza) {
/* 410 */     this.flagPolizza = flagPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagTipoCompagnia() {
/* 416 */     return this.flagTipoCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagTipoCompagnia(String flagTipoCompagnia) {
/* 422 */     this.flagTipoCompagnia = flagTipoCompagnia;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagUnitLinked() {
/* 428 */     return this.flagUnitLinked;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagUnitLinked(String flagUnitLinked) {
/* 434 */     this.flagUnitLinked = flagUnitLinked;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagVersamento() {
/* 440 */     return this.flagVersamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagVersamento(String flagVersamento) {
/* 446 */     this.flagVersamento = flagVersamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/* 452 */     return this.flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/* 458 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFrazionamento() {
/* 464 */     return this.frazionamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrazionamento(String frazionamento) {
/* 470 */     this.frazionamento = frazionamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getImportoProduzione() {
/* 476 */     return this.importoProduzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoProduzione(Double importoProduzione) {
/* 482 */     this.importoProduzione = importoProduzione;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 488 */     return this.istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 494 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroPolizza() {
/* 500 */     return this.numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroPolizza(String numeroPolizza) {
/* 506 */     this.numeroPolizza = numeroPolizza;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroProposta() {
/* 512 */     return this.numeroProposta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroProposta(String numeroProposta) {
/* 518 */     this.numeroProposta = numeroProposta;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPremioDiComputo() {
/* 524 */     return this.premioDiComputo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPremioDiComputo(Double premioDiComputo) {
/* 530 */     this.premioDiComputo = premioDiComputo;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getPremioProvvigionale() {
/* 536 */     return this.premioProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPremioProvvigionale(Double premioProvvigionale) {
/* 542 */     this.premioProvvigionale = premioProvvigionale;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getQualificaAgente() {
/* 548 */     return this.qualificaAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQualificaAgente(String qualificaAgente) {
/* 554 */     this.qualificaAgente = qualificaAgente;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElab() {
/* 560 */     return this.statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoElab(String statoElab) {
/* 566 */     this.statoElab = statoElab;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getVersioneProdotto() {
/* 572 */     return this.versioneProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setVersioneProdotto(String versioneProdotto) {
/* 578 */     this.versioneProdotto = versioneProdotto;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxBgproIncassiAss.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */