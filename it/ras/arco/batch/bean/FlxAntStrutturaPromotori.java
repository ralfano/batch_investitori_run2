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
/*     */ public class FlxAntStrutturaPromotori
/*     */   implements Serializable
/*     */ {
/*     */   private Integer flxId;
/*     */   private String codiceIstituto;
/*     */   private String ndgPromotoreAgenziaFiglio;
/*     */   private String codiceOperativoPfFiglio;
/*     */   private String flagPfFiglioFittizio;
/*     */   private String gradoGerarchicoFiglio;
/*     */   private String livelloStrutturaFiglio;
/*     */   private String ndgPromotoreAgenziaPadre;
/*     */   private String codiceOperativoPfPadre;
/*     */   private String flagPfPadreFittizio;
/*     */   private String gradoGerarchicoPadre;
/*     */   private String livelloStrutturaPadre;
/*     */   private Date dataInizioValiditaLegame;
/*     */   private Date dataFineValiditaLegame;
/*     */   private String ragioneSocialeFiglio;
/*     */   private String ragioneSocialePadre;
/*     */   private Date dataEstrazioneRecord;
/*     */   private String codiceReteFiglio;
/*     */   private String codiceCompagniaFiglio;
/*     */   private String codiceRetePadre;
/*     */   private String codiceCompagniaPadre;
/*     */   private String regioneCommerciale;
/*     */   private String distretto;
/*     */   private String statoElaborazione;
/*     */   private String istanza;
/*     */   private Date dataCaricamento;
/*     */   private String descrizioneErrore;
/*     */   private Date dataErrore;
/*     */   
/*     */   public FlxAntStrutturaPromotori() {}
/*     */   
/*     */   public FlxAntStrutturaPromotori(Integer flxId) {
/*  47 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Integer getFlxId() {
/*  59 */     return this.flxId;
/*     */   }
/*     */   
/*     */   public void setFlxId(Integer flxId) {
/*  63 */     this.flxId = flxId;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceIstituto() {
/*  70 */     return this.codiceIstituto;
/*     */   }
/*     */   
/*     */   public void setCodiceIstituto(String codiceIstituto) {
/*  74 */     this.codiceIstituto = codiceIstituto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNdgPromotoreAgenziaFiglio() {
/*  81 */     return this.ndgPromotoreAgenziaFiglio;
/*     */   }
/*     */   
/*     */   public void setNdgPromotoreAgenziaFiglio(String ndgPromotoreAgenziaFiglio) {
/*  85 */     this.ndgPromotoreAgenziaFiglio = ndgPromotoreAgenziaFiglio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceOperativoPfFiglio() {
/*  92 */     return this.codiceOperativoPfFiglio;
/*     */   }
/*     */   
/*     */   public void setCodiceOperativoPfFiglio(String codiceOperativoPfFiglio) {
/*  96 */     this.codiceOperativoPfFiglio = codiceOperativoPfFiglio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagPfFiglioFittizio() {
/* 103 */     return this.flagPfFiglioFittizio;
/*     */   }
/*     */   
/*     */   public void setFlagPfFiglioFittizio(String flagPfFiglioFittizio) {
/* 107 */     this.flagPfFiglioFittizio = flagPfFiglioFittizio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGradoGerarchicoFiglio() {
/* 114 */     return this.gradoGerarchicoFiglio;
/*     */   }
/*     */   
/*     */   public void setGradoGerarchicoFiglio(String gradoGerarchicoFiglio) {
/* 118 */     this.gradoGerarchicoFiglio = gradoGerarchicoFiglio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLivelloStrutturaFiglio() {
/* 125 */     return this.livelloStrutturaFiglio;
/*     */   }
/*     */   
/*     */   public void setLivelloStrutturaFiglio(String livelloStrutturaFiglio) {
/* 129 */     this.livelloStrutturaFiglio = livelloStrutturaFiglio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNdgPromotoreAgenziaPadre() {
/* 136 */     return this.ndgPromotoreAgenziaPadre;
/*     */   }
/*     */   
/*     */   public void setNdgPromotoreAgenziaPadre(String ndgPromotoreAgenziaPadre) {
/* 140 */     this.ndgPromotoreAgenziaPadre = ndgPromotoreAgenziaPadre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceOperativoPfPadre() {
/* 147 */     return this.codiceOperativoPfPadre;
/*     */   }
/*     */   
/*     */   public void setCodiceOperativoPfPadre(String codiceOperativoPfPadre) {
/* 151 */     this.codiceOperativoPfPadre = codiceOperativoPfPadre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagPfPadreFittizio() {
/* 158 */     return this.flagPfPadreFittizio;
/*     */   }
/*     */   
/*     */   public void setFlagPfPadreFittizio(String flagPfPadreFittizio) {
/* 162 */     this.flagPfPadreFittizio = flagPfPadreFittizio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getGradoGerarchicoPadre() {
/* 169 */     return this.gradoGerarchicoPadre;
/*     */   }
/*     */   
/*     */   public void setGradoGerarchicoPadre(String gradoGerarchicoPadre) {
/* 173 */     this.gradoGerarchicoPadre = gradoGerarchicoPadre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLivelloStrutturaPadre() {
/* 180 */     return this.livelloStrutturaPadre;
/*     */   }
/*     */   
/*     */   public void setLivelloStrutturaPadre(String livelloStrutturaPadre) {
/* 184 */     this.livelloStrutturaPadre = livelloStrutturaPadre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataInizioValiditaLegame() {
/* 191 */     return this.dataInizioValiditaLegame;
/*     */   }
/*     */   
/*     */   public void setDataInizioValiditaLegame(Date dataInizioValiditaLegame) {
/* 195 */     this.dataInizioValiditaLegame = dataInizioValiditaLegame;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataFineValiditaLegame() {
/* 202 */     return this.dataFineValiditaLegame;
/*     */   }
/*     */   
/*     */   public void setDataFineValiditaLegame(Date dataFineValiditaLegame) {
/* 206 */     this.dataFineValiditaLegame = dataFineValiditaLegame;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRagioneSocialeFiglio() {
/* 213 */     return this.ragioneSocialeFiglio;
/*     */   }
/*     */   
/*     */   public void setRagioneSocialeFiglio(String ragioneSocialeFiglio) {
/* 217 */     this.ragioneSocialeFiglio = ragioneSocialeFiglio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRagioneSocialePadre() {
/* 224 */     return this.ragioneSocialePadre;
/*     */   }
/*     */   
/*     */   public void setRagioneSocialePadre(String ragioneSocialePadre) {
/* 228 */     this.ragioneSocialePadre = ragioneSocialePadre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataEstrazioneRecord() {
/* 235 */     return this.dataEstrazioneRecord;
/*     */   }
/*     */   
/*     */   public void setDataEstrazioneRecord(Date dataEstrazioneRecord) {
/* 239 */     this.dataEstrazioneRecord = dataEstrazioneRecord;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceReteFiglio() {
/* 246 */     return this.codiceReteFiglio;
/*     */   }
/*     */   
/*     */   public void setCodiceReteFiglio(String codiceReteFiglio) {
/* 250 */     this.codiceReteFiglio = codiceReteFiglio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCompagniaFiglio() {
/* 257 */     return this.codiceCompagniaFiglio;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagniaFiglio(String codiceCompagniaFiglio) {
/* 261 */     this.codiceCompagniaFiglio = codiceCompagniaFiglio;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceRetePadre() {
/* 268 */     return this.codiceRetePadre;
/*     */   }
/*     */   
/*     */   public void setCodiceRetePadre(String codiceRetePadre) {
/* 272 */     this.codiceRetePadre = codiceRetePadre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceCompagniaPadre() {
/* 279 */     return this.codiceCompagniaPadre;
/*     */   }
/*     */   
/*     */   public void setCodiceCompagniaPadre(String codiceCompagniaPadre) {
/* 283 */     this.codiceCompagniaPadre = codiceCompagniaPadre;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRegioneCommerciale() {
/* 290 */     return this.regioneCommerciale;
/*     */   }
/*     */   
/*     */   public void setRegioneCommerciale(String regioneCommerciale) {
/* 294 */     this.regioneCommerciale = regioneCommerciale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDistretto() {
/* 301 */     return this.distretto;
/*     */   }
/*     */   
/*     */   public void setDistretto(String distretto) {
/* 305 */     this.distretto = distretto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoElaborazione() {
/* 312 */     return this.statoElaborazione;
/*     */   }
/*     */   
/*     */   public void setStatoElaborazione(String statoElaborazione) {
/* 316 */     this.statoElaborazione = statoElaborazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIstanza() {
/* 323 */     return this.istanza;
/*     */   }
/*     */   
/*     */   public void setIstanza(String istanza) {
/* 327 */     this.istanza = istanza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataCaricamento() {
/* 334 */     return this.dataCaricamento;
/*     */   }
/*     */   
/*     */   public void setDataCaricamento(Date dataCaricamento) {
/* 338 */     this.dataCaricamento = dataCaricamento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String toString() {
/* 343 */     return (new ToStringBuilder(this)).append("flxId", getFlxId()).toString();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Date getDataErrore() {
/* 349 */     return this.dataErrore;
/*     */   }
/*     */   
/*     */   public void setDataErrore(Date dataErrore) {
/* 353 */     this.dataErrore = dataErrore;
/*     */   }
/*     */   
/*     */   public String getDescrizioneErrore() {
/* 357 */     return this.descrizioneErrore;
/*     */   }
/*     */   
/*     */   public void setDescrizioneErrore(String descrizioneErrore) {
/* 361 */     this.descrizioneErrore = descrizioneErrore;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAntStrutturaPromotori.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */