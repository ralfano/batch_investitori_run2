/*     */ package it.ras.arco.ordine.adapter;
/*     */ 
/*     */ import it.ras.arco.bean.FinOrdineAdapterBase;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ public class FinOrdineAdapter
/*     */   extends FinOrdineAdapterBase
/*     */   implements Comparable
/*     */ {
/*     */   private String tipoProdotto;
/*  28 */   private String tipoOrdineDecodificato = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  33 */   private String statoOrdineDecodificato = null;
/*     */   
/*  35 */   private String chkTotaleSelezionato = "S";
/*     */   
/*  37 */   private String chkTotaleNonSelezionato = "N";
/*     */   
/*  39 */   private String importoTextSize = "5";
/*     */   
/*  41 */   private String quantitaTextSize = "5";
/*     */   
/*  43 */   private String tipoColonnaCheckBox = "CHK";
/*     */   
/*  45 */   private String tipoColonnaText = "TXT";
/*     */   
/*  47 */   private String tipoColonnaLabel = "LBL";
/*     */   
/*  49 */   private String tipoColonnaNumber = "NMB";
/*     */   
/*  51 */   private String tipoColonnaCombo = "CMB";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  58 */   private List listaComparto = new ArrayList();
/*     */   
/*  60 */   private String compartoSelezionato = "";
/*     */   
/*  62 */   private String codiceAttivitaFin = "";
/*     */   
/*  64 */   private String descrizioneAttivitaFin = "";
/*     */   
/*  66 */   private List listaClasse = new ArrayList();
/*     */   
/*  68 */   private String codiceClasse = "";
/*     */   
/*  70 */   private String descrizioneClasse = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  76 */   private String attivitaSelezionata = "";
/*     */   
/*  78 */   private String classeFinanziariaSelezionata = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  84 */   private String recordSelezionato = "";
/*     */   
/*  86 */   private String numeroNuovoContrattoGP = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDisinvestimentoTotale() {
/*  92 */     if (!ArchUtils.isValid(getFlagTotale())) {
/*  93 */       return false;
/*     */     }
/*  95 */     if (getFlagTotale().equalsIgnoreCase("S"))
/*     */     {
/*  97 */       return true;
/*     */     }
/*  99 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isImportoDaDefinire() {
/* 107 */     if ("S".equalsIgnoreCase(getFlagImportoDaDefinire()))
/*     */     {
/* 109 */       return true;
/*     */     }
/* 111 */     return false;
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
/*     */ 
/*     */   
/*     */   public String getDescrizioneAttivitaFinanziaria() {
/* 125 */     String returnValue = null;
/*     */     
/* 127 */     if (getAttivitaFin() != null) {
/* 128 */       returnValue = getAttivitaFin().getDescrizione();
/*     */     } else {
/* 130 */       returnValue = "";
/*     */     } 
/*     */     
/* 133 */     return returnValue;
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
/*     */   
/*     */   public String getClasseAttivitaFinanziaria() {
/* 146 */     String returnValue = null;
/*     */     
/* 148 */     if (getAttivitaFin() != null) {
/* 149 */       returnValue = getAttivitaFin().getClasse();
/*     */     } else {
/* 151 */       returnValue = "";
/*     */     } 
/*     */     
/* 154 */     return returnValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getStatoOrdineDecodificato() {
/* 161 */     return this.statoOrdineDecodificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setStatoOrdineDecodificato(String statoOrdineDecodificato) {
/* 169 */     this.statoOrdineDecodificato = statoOrdineDecodificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoOrdineDecodificato() {
/* 176 */     return this.tipoOrdineDecodificato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoOrdineDecodificato(String tipoOrdineDecodificato) {
/* 184 */     this.tipoOrdineDecodificato = tipoOrdineDecodificato;
/*     */   }
/*     */   
/*     */   public String getTipoProdotto() {
/* 188 */     return this.tipoProdotto;
/*     */   }
/*     */   
/*     */   public void setTipoProdotto(String tipoProdotto) {
/* 192 */     this.tipoProdotto = tipoProdotto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getFlagTotale() {
/* 199 */     if (getFlagImportoTot() == null)
/* 200 */       return getChkTotaleNonSelezionato(); 
/* 201 */     return getFlagImportoTot();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setFlagTotale(String tot) {
/* 208 */     setFlagImportoTot(tot);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getChkTotaleNonSelezionato() {
/* 215 */     return this.chkTotaleNonSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChkTotaleNonSelezionato(String chkTotaleNonSelezionato) {
/* 223 */     this.chkTotaleNonSelezionato = chkTotaleNonSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getChkTotaleSelezionato() {
/* 230 */     return this.chkTotaleSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setChkTotaleSelezionato(String chkTotaleSelezionato) {
/* 238 */     this.chkTotaleSelezionato = chkTotaleSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoColonnaCheckBox() {
/* 245 */     return this.tipoColonnaCheckBox;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoColonnaCheckBox(String tipoColonnaCheckBox) {
/* 253 */     this.tipoColonnaCheckBox = tipoColonnaCheckBox;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoColonnaLabel() {
/* 260 */     return this.tipoColonnaLabel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoColonnaLabel(String tipoColonnaLabel) {
/* 268 */     this.tipoColonnaLabel = tipoColonnaLabel;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoColonnaNumber() {
/* 275 */     return this.tipoColonnaNumber;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoColonnaNumber(String tipoColonnaNumber) {
/* 283 */     this.tipoColonnaNumber = tipoColonnaNumber;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoColonnaText() {
/* 290 */     return this.tipoColonnaText;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoColonnaText(String tipoColonnaText) {
/* 298 */     this.tipoColonnaText = tipoColonnaText;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getImportoTextSize() {
/* 305 */     return this.importoTextSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setImportoTextSize(String importoTextSize) {
/* 313 */     this.importoTextSize = importoTextSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getQuantitaTextSize() {
/* 320 */     return this.quantitaTextSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setQuantitaTextSize(String quantitaTextSize) {
/* 328 */     this.quantitaTextSize = quantitaTextSize;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceAttivitaFin() {
/* 335 */     return new String("attivitaFinIdAdp");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneAttivitaFin() {
/* 343 */     return new String("descrizione");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getListaComparto() {
/* 350 */     return this.listaComparto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListaComparto(List listaComparto) {
/* 358 */     this.listaComparto = listaComparto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoColonnaCombo() {
/* 365 */     return this.tipoColonnaCombo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoColonnaCombo(String tipoColonnaCombo) {
/* 373 */     this.tipoColonnaCombo = tipoColonnaCombo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCompartoSelezionato() {
/* 380 */     return this.compartoSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCompartoSelezionato(String compartoSelezionato) {
/* 388 */     this.compartoSelezionato = compartoSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAttivitaSelezionata() {
/* 395 */     return this.attivitaSelezionata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttivitaSelezionata(String attivitaSelezionata) {
/* 403 */     this.attivitaSelezionata = attivitaSelezionata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getClasseFinanziariaSelezionata() {
/* 410 */     return this.classeFinanziariaSelezionata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setClasseFinanziariaSelezionata(String classeFinanziariaSelezionata) {
/* 419 */     this.classeFinanziariaSelezionata = classeFinanziariaSelezionata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getListaClasse() {
/* 426 */     return this.listaClasse;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setListaClasse(List listaClasse) {
/* 434 */     this.listaClasse = listaClasse;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCodiceClasse() {
/* 441 */     return new String("codice");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getDescrizioneClasse() {
/* 448 */     return new String("descrizione");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoColonnaNumberPerStatoContratto() {
/* 455 */     if (getPosizione() == null || getPosizione().getContratto() == null || !ArchUtils.isValid(getPosizione().getContratto().getStatoContratto()))
/*     */     {
/*     */ 
/*     */       
/* 459 */       return getTipoColonnaNumber();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 465 */     return getTipoColonnaNumber();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getTipoColonnaCheckBoxPerStatoContratto() {
/* 472 */     if (getPosizione() == null || getPosizione().getContratto() == null || !ArchUtils.isValid(getPosizione().getContratto().getStatoContratto()))
/*     */     {
/*     */ 
/*     */       
/* 476 */       return getTipoColonnaNumber();
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 482 */     return getTipoColonnaCheckBox();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getRecordSelezionato() {
/* 489 */     return this.recordSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setRecordSelezionato(String recordSelezionato) {
/* 497 */     this.recordSelezionato = recordSelezionato;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isSelectedInList() {
/* 505 */     if (ArchUtils.isValid(getRecordSelezionato())) {
/* 506 */       return "S".equals(getRecordSelezionato());
/*     */     }
/*     */ 
/*     */     
/* 510 */     return false;
/*     */   }
/*     */   
/*     */   public boolean isPassaggio() {
/* 514 */     String tipoOrdine = getTipo();
/* 515 */     if (!ArchUtils.isValid(tipoOrdine)) {
/* 516 */       tipoOrdine = getCausale();
/*     */     }
/*     */     
/* 519 */     if ("130".equals(tipoOrdine) || "830".equals(tipoOrdine) || "850".equals(tipoOrdine) || "140".equals(tipoOrdine) || "840".equals(tipoOrdine))
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 529 */       return true;
/*     */     }
/* 531 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int compareTo(Object o) {
/* 542 */     if (!(o instanceof FinOrdineAdapter)) {
/* 543 */       return 0;
/*     */     }
/* 545 */     FinOrdineAdapter other = (FinOrdineAdapter)o;
/*     */     
/* 547 */     if (getPosizione().getContratto() != null && other.getPosizione().getContratto() != null) {
/*     */       
/* 549 */       if (getPosizione().getContratto().getNumContratto().compareTo(other.getPosizione().getContratto().getNumContratto()) != 0)
/*     */       {
/* 551 */         return getPosizione().getContratto().getNumContratto().compareTo(other.getPosizione().getContratto().getNumContratto());
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 556 */       if (getDataInserimentoOrdine() != null && other.getDataInserimentoOrdine() != null)
/*     */       {
/* 558 */         return getDataInserimentoOrdine().compareTo(other.getDataInserimentoOrdine());
/*     */       }
/*     */       
/* 561 */       return 0;
/*     */     } 
/* 563 */     return 0;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNumeroNuovoContrattoGP() {
/* 569 */     return this.numeroNuovoContrattoGP;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNumeroNuovoContrattoGP(String numeroNuovoContrattoGP) {
/* 575 */     this.numeroNuovoContrattoGP = numeroNuovoContrattoGP;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\adapter\FinOrdineAdapter.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */