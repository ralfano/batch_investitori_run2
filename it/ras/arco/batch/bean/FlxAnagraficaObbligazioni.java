/*     */ package it.ras.arco.batch.bean;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FlxAnagraficaObbligazioni
/*     */   extends FlxAnagraficaMAF
/*     */ {
/*  13 */   private String codicePiazza = null;
/*     */   
/*  15 */   private String simboloPiazza = null;
/*     */   
/*  17 */   private String descrizioneBreve = null;
/*     */   
/*  19 */   private String dataScadenzaObbligazione = null;
/*     */   
/*  21 */   private String dataEmissionePrestito = null;
/*     */   
/*  23 */   private String dataInizioAccumuloInteressi = null;
/*     */   
/*  25 */   private String lottoMinimoContrattazione = null;
/*     */   
/*  27 */   private String tipoRendimento = null;
/*     */   
/*  29 */   private String codiceGiorniBaseCalcoloCedola = null;
/*     */   
/*  31 */   private String frequenzaRiscossioneCedola = null;
/*     */   
/*  33 */   private String tipologiaObbligazione = null;
/*     */   
/*  35 */   private String perpetua = null;
/*     */   
/*  37 */   private String importiPercentuali = null;
/*     */   
/*  39 */   private String valutaInteressi = null;
/*     */   
/*  41 */   private String valoreRimborso = null;
/*     */   
/*  43 */   private String importoNominaleUnitario = null;
/*     */   
/*  45 */   private String importoEmissione = null;
/*     */   
/*  47 */   private String importoOutstanding = null;
/*     */   
/*  49 */   private String minimoRendimentoCedola = null;
/*     */   
/*  51 */   private String massimoRendimentoCedola = null;
/*     */   
/*  53 */   private String tassoFissoPercentuale = null;
/*     */   
/*  55 */   private String indiceRiferimento = null;
/*     */   
/*  57 */   private String spread = null;
/*     */   
/*  59 */   private String possibilePut = null;
/*     */   
/*  61 */   private String prezzoPut = null;
/*     */   
/*  63 */   private String primaDataPutable = null;
/*     */   
/*  65 */   private String ultimaDataPutable = null;
/*     */   
/*  67 */   private String callable = null;
/*     */   
/*  69 */   private String prezzoCall = null;
/*     */   
/*  71 */   private String primaDataCallable = null;
/*     */   
/*  73 */   private String ultimaDataCallable = null;
/*     */   
/*  75 */   private String liquidabile = null;
/*     */   
/*  77 */   private String dataInizioLiquidabile = null;
/*     */   
/*  79 */   private String prezzoRimborsoAnticipato = null;
/*     */   
/*  81 */   private String collocatoPressoPrivati = null;
/*     */   
/*  83 */   private String predefinita = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaObbligazioni(Integer flxId, String statoElaborazione) {
/*  92 */     super(flxId, statoElaborazione);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FlxAnagraficaObbligazioni() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCallable() {
/* 112 */     return this.callable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCallable(String callable) {
/* 121 */     this.callable = callable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceGiorniBaseCalcoloCedola() {
/* 130 */     return this.codiceGiorniBaseCalcoloCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodiceGiorniBaseCalcoloCedola(String codiceGiorniBaseCalcoloCedola) {
/* 140 */     this.codiceGiorniBaseCalcoloCedola = codiceGiorniBaseCalcoloCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodicePiazza() {
/* 149 */     return this.codicePiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCodicePiazza(String codicePiazza) {
/* 158 */     this.codicePiazza = codicePiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCollocatoPressoPrivati() {
/* 167 */     return this.collocatoPressoPrivati;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCollocatoPressoPrivati(String collocatoPressoPrivati) {
/* 176 */     this.collocatoPressoPrivati = collocatoPressoPrivati;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataEmissionePrestito() {
/* 185 */     return this.dataEmissionePrestito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataEmissionePrestito(String dataEmissionePrestito) {
/* 194 */     this.dataEmissionePrestito = dataEmissionePrestito;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataInizioAccumuloInteressi() {
/* 203 */     return this.dataInizioAccumuloInteressi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioAccumuloInteressi(String dataInizioAccumuloInteressi) {
/* 212 */     this.dataInizioAccumuloInteressi = dataInizioAccumuloInteressi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataInizioLiquidabile() {
/* 221 */     return this.dataInizioLiquidabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataInizioLiquidabile(String dataInizioLiquidabile) {
/* 230 */     this.dataInizioLiquidabile = dataInizioLiquidabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDataScadenzaObbligazione() {
/* 239 */     return this.dataScadenzaObbligazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDataScadenzaObbligazione(String dataScadenzaObbligazione) {
/* 248 */     this.dataScadenzaObbligazione = dataScadenzaObbligazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneBreve() {
/* 257 */     return this.descrizioneBreve;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDescrizioneBreve(String descrizioneBreve) {
/* 266 */     this.descrizioneBreve = descrizioneBreve;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFrequenzaRiscossioneCedola() {
/* 275 */     return this.frequenzaRiscossioneCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFrequenzaRiscossioneCedola(String frequenzaRiscossioneCedola) {
/* 284 */     this.frequenzaRiscossioneCedola = frequenzaRiscossioneCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportiPercentuali() {
/* 293 */     return this.importiPercentuali;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportiPercentuali(String importiPercentuali) {
/* 302 */     this.importiPercentuali = importiPercentuali;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoEmissione() {
/* 311 */     return this.importoEmissione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoEmissione(String importoEmissione) {
/* 320 */     this.importoEmissione = importoEmissione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoNominaleUnitario() {
/* 329 */     return this.importoNominaleUnitario;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoNominaleUnitario(String importoNominaleUnitario) {
/* 338 */     this.importoNominaleUnitario = importoNominaleUnitario;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoOutstanding() {
/* 347 */     return this.importoOutstanding;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoOutstanding(String importoOutstanding) {
/* 356 */     this.importoOutstanding = importoOutstanding;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getIndiceRiferimento() {
/* 365 */     return this.indiceRiferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIndiceRiferimento(String indiceRiferimento) {
/* 374 */     this.indiceRiferimento = indiceRiferimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLiquidabile() {
/* 383 */     return this.liquidabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLiquidabile(String liquidabile) {
/* 392 */     this.liquidabile = liquidabile;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getLottoMinimoContrattazione() {
/* 401 */     return this.lottoMinimoContrattazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLottoMinimoContrattazione(String lottoMinimoContrattazione) {
/* 410 */     this.lottoMinimoContrattazione = lottoMinimoContrattazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMassimoRendimentoCedola() {
/* 419 */     return this.massimoRendimentoCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMassimoRendimentoCedola(String massimoRendimentoCedola) {
/* 428 */     this.massimoRendimentoCedola = massimoRendimentoCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMinimoRendimentoCedola() {
/* 437 */     return this.minimoRendimentoCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMinimoRendimentoCedola(String minimoRendimentoCedola) {
/* 446 */     this.minimoRendimentoCedola = minimoRendimentoCedola;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPerpetua() {
/* 455 */     return this.perpetua;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPerpetua(String perpetua) {
/* 464 */     this.perpetua = perpetua;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPossibilePut() {
/* 473 */     return this.possibilePut;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPossibilePut(String possibilePut) {
/* 482 */     this.possibilePut = possibilePut;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPredefinita() {
/* 491 */     return this.predefinita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPredefinita(String predefinita) {
/* 500 */     this.predefinita = predefinita;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrezzoCall() {
/* 509 */     return this.prezzoCall;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoCall(String prezzoCall) {
/* 518 */     this.prezzoCall = prezzoCall;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrezzoPut() {
/* 527 */     return this.prezzoPut;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoPut(String prezzoPut) {
/* 536 */     this.prezzoPut = prezzoPut;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrezzoRimborsoAnticipato() {
/* 545 */     return this.prezzoRimborsoAnticipato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrezzoRimborsoAnticipato(String prezzoRimborsoAnticipato) {
/* 554 */     this.prezzoRimborsoAnticipato = prezzoRimborsoAnticipato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrimaDataCallable() {
/* 563 */     return this.primaDataCallable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrimaDataCallable(String primaDataCallable) {
/* 572 */     this.primaDataCallable = primaDataCallable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getPrimaDataPutable() {
/* 581 */     return this.primaDataPutable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setPrimaDataPutable(String primaDataPutable) {
/* 590 */     this.primaDataPutable = primaDataPutable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSimboloPiazza() {
/* 599 */     return this.simboloPiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSimboloPiazza(String simboloPiazza) {
/* 608 */     this.simboloPiazza = simboloPiazza;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getSpread() {
/* 617 */     return this.spread;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setSpread(String spread) {
/* 626 */     this.spread = spread;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTassoFissoPercentuale() {
/* 635 */     return this.tassoFissoPercentuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTassoFissoPercentuale(String tassoFissoPercentuale) {
/* 644 */     this.tassoFissoPercentuale = tassoFissoPercentuale;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipologiaObbligazione() {
/* 653 */     return this.tipologiaObbligazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipologiaObbligazione(String tipologiaObbligazione) {
/* 662 */     this.tipologiaObbligazione = tipologiaObbligazione;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoRendimento() {
/* 671 */     return this.tipoRendimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoRendimento(String tipoRendimento) {
/* 680 */     this.tipoRendimento = tipoRendimento;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUltimaDataCallable() {
/* 689 */     return this.ultimaDataCallable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUltimaDataCallable(String ultimaDataCallable) {
/* 698 */     this.ultimaDataCallable = ultimaDataCallable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getUltimaDataPutable() {
/* 707 */     return this.ultimaDataPutable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setUltimaDataPutable(String ultimaDataPutable) {
/* 716 */     this.ultimaDataPutable = ultimaDataPutable;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValoreRimborso() {
/* 725 */     return this.valoreRimborso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValoreRimborso(String valoreRimborso) {
/* 734 */     this.valoreRimborso = valoreRimborso;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValutaInteressi() {
/* 743 */     return this.valutaInteressi;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValutaInteressi(String valutaInteressi) {
/* 752 */     this.valutaInteressi = valutaInteressi;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\bean\FlxAnagraficaObbligazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */