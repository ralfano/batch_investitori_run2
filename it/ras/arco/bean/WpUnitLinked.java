/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class WpUnitLinked
/*     */   extends WpContrattoTerzi
/*     */   implements Serializable
/*     */ {
/*     */   private Integer progressivoUl;
/*     */   private String inDetrazioneFlag;
/*     */   private String vitaInteraFlag;
/*     */   private String beneficiario;
/*     */   private String contraenteFlag;
/*     */   private String intermediarioRif;
/*     */   private String compagniaVita;
/*     */   private Date dataInizioVersamenti;
/*     */   private Date dataFineVersamenti;
/*     */   private Date dataProbabileIncasso;
/*     */   private Double premioPeriodico;
/*     */   private String frequenzaPremio;
/*     */   private String tipoVersamento;
/*     */   private Double premioDetraibile;
/*     */   private Double controvaloreIniziale;
/*     */   private String capitaleProtettoFlag;
/*     */   private String rendimentoMinimoFlag;
/*     */   private Double percRendimentoMinimo;
/*     */   private String distribProventiFlag;
/*     */   private String periodicitaProventi;
/*     */   private Double tassoProventi;
/*     */   private String invaliditaFlag;
/*     */   private Double importoInvalidita;
/*     */   private String casoMorteFlag;
/*     */   private Double importoCasoMorte;
/*     */   private String noteUl;
/*     */   private Date dataControvaloreIniziale;
/*     */   private Integer matriceTransUtenteId;
/*     */   
/*     */   public WpUnitLinked(String beneficiario, String flag, String flag2, String vita, String flag3, Double iniziale, Date iniziale2, Date versamenti, Date versamenti2, Date incasso, String flag4, String premio, Double morte, Double invalidita, String flag5, String rif, String flag6, Integer id, String ul, Double minimo, String proventi, Double detraibile, Double periodico, Integer ul2, String flag7, Double proventi2, String versamento, String flag8) {
/*  43 */     this.beneficiario = beneficiario;
/*  44 */     this.capitaleProtettoFlag = flag;
/*  45 */     this.casoMorteFlag = flag2;
/*  46 */     this.compagniaVita = vita;
/*  47 */     this.contraenteFlag = flag3;
/*  48 */     this.controvaloreIniziale = iniziale;
/*  49 */     this.dataControvaloreIniziale = iniziale2;
/*  50 */     this.dataFineVersamenti = versamenti;
/*  51 */     this.dataInizioVersamenti = versamenti2;
/*  52 */     this.dataProbabileIncasso = incasso;
/*  53 */     this.distribProventiFlag = flag4;
/*  54 */     this.frequenzaPremio = premio;
/*  55 */     this.importoCasoMorte = morte;
/*  56 */     this.importoInvalidita = invalidita;
/*  57 */     this.inDetrazioneFlag = flag5;
/*  58 */     this.intermediarioRif = rif;
/*  59 */     this.invaliditaFlag = flag6;
/*  60 */     this.matriceTransUtenteId = id;
/*  61 */     this.noteUl = ul;
/*  62 */     this.percRendimentoMinimo = minimo;
/*  63 */     this.periodicitaProventi = proventi;
/*  64 */     this.premioDetraibile = detraibile;
/*  65 */     this.premioPeriodico = periodico;
/*  66 */     this.progressivoUl = ul2;
/*  67 */     this.rendimentoMinimoFlag = flag7;
/*  68 */     this.tassoProventi = proventi2;
/*  69 */     this.tipoVersamento = versamento;
/*  70 */     this.vitaInteraFlag = flag8;
/*     */   }
/*     */ 
/*     */   
/*     */   public WpUnitLinked() {}
/*     */ 
/*     */   
/*     */   public WpUnitLinked(Set clientegen, Integer id, Set intermediario, Set prodotto, String tipo) {
/*  78 */     super(clientegen, id, intermediario, prodotto, tipo);
/*     */   }
/*     */   
/*     */   public String getBeneficiario() {
/*  82 */     return this.beneficiario;
/*     */   }
/*     */   public void setBeneficiario(String beneficiario) {
/*  85 */     this.beneficiario = beneficiario;
/*     */   }
/*     */   public String getCapitaleProtettoFlag() {
/*  88 */     return this.capitaleProtettoFlag;
/*     */   }
/*     */   public void setCapitaleProtettoFlag(String capitaleProtettoFlag) {
/*  91 */     this.capitaleProtettoFlag = capitaleProtettoFlag;
/*     */   }
/*     */   public String getCasoMorteFlag() {
/*  94 */     return this.casoMorteFlag;
/*     */   }
/*     */   public void setCasoMorteFlag(String casoMorteFlag) {
/*  97 */     this.casoMorteFlag = casoMorteFlag;
/*     */   }
/*     */   public String getCompagniaVita() {
/* 100 */     return this.compagniaVita;
/*     */   }
/*     */   public void setCompagniaVita(String compagniaVita) {
/* 103 */     this.compagniaVita = compagniaVita;
/*     */   }
/*     */   public String getContraenteFlag() {
/* 106 */     return this.contraenteFlag;
/*     */   }
/*     */   public void setContraenteFlag(String contraenteFlag) {
/* 109 */     this.contraenteFlag = contraenteFlag;
/*     */   }
/*     */   public Double getControvaloreIniziale() {
/* 112 */     return this.controvaloreIniziale;
/*     */   }
/*     */   public void setControvaloreIniziale(Double controvaloreIniziale) {
/* 115 */     this.controvaloreIniziale = controvaloreIniziale;
/*     */   }
/*     */   public Date getDataControvaloreIniziale() {
/* 118 */     return this.dataControvaloreIniziale;
/*     */   }
/*     */   public void setDataControvaloreIniziale(Date dataControvaloreIniziale) {
/* 121 */     this.dataControvaloreIniziale = dataControvaloreIniziale;
/*     */   }
/*     */   public Date getDataFineVersamenti() {
/* 124 */     return this.dataFineVersamenti;
/*     */   }
/*     */   public void setDataFineVersamenti(Date dataFineVersamenti) {
/* 127 */     this.dataFineVersamenti = dataFineVersamenti;
/*     */   }
/*     */   public Date getDataInizioVersamenti() {
/* 130 */     return this.dataInizioVersamenti;
/*     */   }
/*     */   public void setDataInizioVersamenti(Date dataInizioVersamenti) {
/* 133 */     this.dataInizioVersamenti = dataInizioVersamenti;
/*     */   }
/*     */   public Date getDataProbabileIncasso() {
/* 136 */     return this.dataProbabileIncasso;
/*     */   }
/*     */   public void setDataProbabileIncasso(Date dataProbabileIncasso) {
/* 139 */     this.dataProbabileIncasso = dataProbabileIncasso;
/*     */   }
/*     */   public String getDistribProventiFlag() {
/* 142 */     return this.distribProventiFlag;
/*     */   }
/*     */   public void setDistribProventiFlag(String distribProventiFlag) {
/* 145 */     this.distribProventiFlag = distribProventiFlag;
/*     */   }
/*     */   public String getFrequenzaPremio() {
/* 148 */     return this.frequenzaPremio;
/*     */   }
/*     */   public void setFrequenzaPremio(String frequenzaPremio) {
/* 151 */     this.frequenzaPremio = frequenzaPremio;
/*     */   }
/*     */   public Double getImportoCasoMorte() {
/* 154 */     return this.importoCasoMorte;
/*     */   }
/*     */   public void setImportoCasoMorte(Double importoCasoMorte) {
/* 157 */     this.importoCasoMorte = importoCasoMorte;
/*     */   }
/*     */   public Double getImportoInvalidita() {
/* 160 */     return this.importoInvalidita;
/*     */   }
/*     */   public void setImportoInvalidita(Double importoInvalidita) {
/* 163 */     this.importoInvalidita = importoInvalidita;
/*     */   }
/*     */   public String getInDetrazioneFlag() {
/* 166 */     return this.inDetrazioneFlag;
/*     */   }
/*     */   public void setInDetrazioneFlag(String inDetrazioneFlag) {
/* 169 */     this.inDetrazioneFlag = inDetrazioneFlag;
/*     */   }
/*     */   public String getIntermediarioRif() {
/* 172 */     return this.intermediarioRif;
/*     */   }
/*     */   public void setIntermediarioRif(String intermediarioRif) {
/* 175 */     this.intermediarioRif = intermediarioRif;
/*     */   }
/*     */   public String getInvaliditaFlag() {
/* 178 */     return this.invaliditaFlag;
/*     */   }
/*     */   public void setInvaliditaFlag(String invaliditaFlag) {
/* 181 */     this.invaliditaFlag = invaliditaFlag;
/*     */   }
/*     */   public Integer getMatriceTransUtenteId() {
/* 184 */     return this.matriceTransUtenteId;
/*     */   }
/*     */   public void setMatriceTransUtenteId(Integer matriceTransUtenteId) {
/* 187 */     this.matriceTransUtenteId = matriceTransUtenteId;
/*     */   }
/*     */   public String getNoteUl() {
/* 190 */     return this.noteUl;
/*     */   }
/*     */   public void setNoteUl(String noteUl) {
/* 193 */     this.noteUl = noteUl;
/*     */   }
/*     */   public Double getPercRendimentoMinimo() {
/* 196 */     return this.percRendimentoMinimo;
/*     */   }
/*     */   public void setPercRendimentoMinimo(Double percRendimentoMinimo) {
/* 199 */     this.percRendimentoMinimo = percRendimentoMinimo;
/*     */   }
/*     */   public String getPeriodicitaProventi() {
/* 202 */     return this.periodicitaProventi;
/*     */   }
/*     */   public void setPeriodicitaProventi(String periodicitaProventi) {
/* 205 */     this.periodicitaProventi = periodicitaProventi;
/*     */   }
/*     */   public Double getPremioDetraibile() {
/* 208 */     return this.premioDetraibile;
/*     */   }
/*     */   public void setPremioDetraibile(Double premioDetraibile) {
/* 211 */     this.premioDetraibile = premioDetraibile;
/*     */   }
/*     */   public Double getPremioPeriodico() {
/* 214 */     return this.premioPeriodico;
/*     */   }
/*     */   public void setPremioPeriodico(Double premioPeriodico) {
/* 217 */     this.premioPeriodico = premioPeriodico;
/*     */   }
/*     */   public Integer getProgressivoUl() {
/* 220 */     return this.progressivoUl;
/*     */   }
/*     */   public void setProgressivoUl(Integer progressivoUl) {
/* 223 */     this.progressivoUl = progressivoUl;
/*     */   }
/*     */   public String getRendimentoMinimoFlag() {
/* 226 */     return this.rendimentoMinimoFlag;
/*     */   }
/*     */   public void setRendimentoMinimoFlag(String rendimentoMinimoFlag) {
/* 229 */     this.rendimentoMinimoFlag = rendimentoMinimoFlag;
/*     */   }
/*     */   public Double getTassoProventi() {
/* 232 */     return this.tassoProventi;
/*     */   }
/*     */   public void setTassoProventi(Double tassoProventi) {
/* 235 */     this.tassoProventi = tassoProventi;
/*     */   }
/*     */   public String getTipoVersamento() {
/* 238 */     return this.tipoVersamento;
/*     */   }
/*     */   public void setTipoVersamento(String tipoVersamento) {
/* 241 */     this.tipoVersamento = tipoVersamento;
/*     */   }
/*     */   public String getVitaInteraFlag() {
/* 244 */     return this.vitaInteraFlag;
/*     */   }
/*     */   public void setVitaInteraFlag(String vitaInteraFlag) {
/* 247 */     this.vitaInteraFlag = vitaInteraFlag;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpUnitLinked.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */