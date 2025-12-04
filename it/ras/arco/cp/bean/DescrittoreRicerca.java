/*     */ package it.ras.arco.cp.bean;
/*     */ 
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
/*     */ public class DescrittoreRicerca
/*     */ {
/*  20 */   private List parametri = new ArrayList();
/*     */   
/*  22 */   private String nomeRicerca = null;
/*     */   
/*  24 */   private List paremetriDiOrdinamento = null;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNomeRicerca() {
/*  30 */     return this.nomeRicerca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNomeRicerca(String nomeRicerca) {
/*  38 */     this.nomeRicerca = nomeRicerca;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModalita() {
/*  45 */     return getNomeRicerca();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModalita(String nomeRicerca) {
/*  53 */     setNomeRicerca(nomeRicerca);
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
/*     */   
/*     */   public List getParametri() {
/*  68 */     return this.parametri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParametri(List parametri) {
/*  76 */     this.parametri = parametri;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Parametro getParametro(int index) {
/*  83 */     return this.parametri.get(index);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParametro(int index, Parametro parametro) {
/*  91 */     this.parametri.add(index, parametro);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getParemetriDiOrdinamento() {
/*  99 */     return this.paremetriDiOrdinamento;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setParemetriDiOrdinamento(List paremetriDiOrdinamento) {
/* 105 */     this.paremetriDiOrdinamento = paremetriDiOrdinamento;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\bean\DescrittoreRicerca.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */