/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class FinAttivitaFinanziariaFlyweight
/*     */   extends FinAttivitaFinanziaria
/*     */   implements IFlyweightBean
/*     */ {
/*  21 */   private RasORMBean completeBean = null;
/*     */   
/*  23 */   private List prodottoLineaLST = null;
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
/*     */   public FinAttivitaFinanziariaFlyweight(String codiceTit, String codiceCad, String codiceBanca, String tipoF, String codiceMaf, String descrizione, String descrizBreve, String isin, String classe, String codTariffa, String tariffa, String divisaQuot, Date dataUltRilMgt, Date dataPrcRilMgt, Date ultimoMeseElab, Date dataInizioComm, Date dataPrimoRegolamento, Date dataFineRegolamento, Date dataFineComm, Date dataInizio, Date dataFine, String trattato, String nomeFile, String benchmark, String ctAssogestioni, Integer classeRischio, String visibilitaCP, String codMarket, String var, String paeseEmissione, Date dataInserimento, String utenteInserimento, Date dataUltimoProspetto, String note, Integer commGestione, String retroCommissioni, Set prezzo, Set listaParametri, Set prodotto, FinUltPrezzo ultPrezzo, Set ordine, List prodottoLineaLST) {
/*  80 */     super(codiceTit, codiceCad, codiceBanca, tipoF, codiceMaf, descrizione, descrizBreve, isin, classe, codTariffa, tariffa, divisaQuot, dataUltRilMgt, dataPrcRilMgt, ultimoMeseElab, dataInizioComm, dataPrimoRegolamento, dataFineRegolamento, dataFineComm, dataInizio, dataFine, trattato, nomeFile, benchmark, ctAssogestioni, classeRischio, visibilitaCP, codMarket, var, paeseEmissione, dataInserimento, utenteInserimento, dataUltimoProspetto, note, commGestione, retroCommissioni, prezzo, listaParametri, prodotto, ultPrezzo, ordine, (Set)null, (String)null, (String)null, (String)null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  89 */     this.prodottoLineaLST = prodottoLineaLST;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziariaFlyweight() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public FinAttivitaFinanziariaFlyweight(Set prezzo) {
/* 105 */     super(prezzo);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Serializable getBeanId() {
/* 115 */     return getAttivitaFinId();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getProdottoLineaLST() {
/* 123 */     return this.prodottoLineaLST;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProdottoLineaLST(List prodottoLineaLST) {
/* 131 */     this.prodottoLineaLST = prodottoLineaLST;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getProdottoLineaLST(int index) {
/* 140 */     return this.prodottoLineaLST.get(index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setProdottoLineaLST(int index, List prodottoLineaLST) {
/* 148 */     this.prodottoLineaLST.set(index, prodottoLineaLST);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void congelaListaProdotti() {
/*     */     try {
/* 160 */       this.prodottoLineaLST = congelaSet(getProdotto());
/*     */     }
/* 162 */     catch (Exception e) {}
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public RasORMBean getCompleteBean() {
/* 172 */     return this.completeBean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setCompleteBean(RasORMBean completeBean) {
/* 180 */     this.completeBean = completeBean;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getCompleteBeanClass() {
/* 188 */     return getClass().getName();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAttivitaFinanziariaFlyweight.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */