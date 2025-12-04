/*    */ package it.ras.arco.cp.bean;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Sezione
/*    */ {
/* 15 */   private String titolo = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 22 */   private String nomeLogico = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 28 */   private String nomeBean = null;
/*    */ 
/*    */ 
/*    */   
/* 32 */   private List parametriRicerca = new ArrayList();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getNomeBean() {
/* 39 */     return this.nomeBean;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setNomeBean(String nomeBean) {
/* 48 */     this.nomeBean = nomeBean;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getTitolo() {
/* 56 */     return this.titolo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTitolo(String titolo) {
/* 65 */     this.titolo = titolo;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public List getParametriRicerca() {
/* 73 */     return this.parametriRicerca;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setParametriRicerca(List parametriRicerca) {
/* 82 */     this.parametriRicerca = parametriRicerca;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getNomeLogico() {
/* 90 */     return this.nomeLogico;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setNomeLogico(String nomeLogico) {
/* 99 */     this.nomeLogico = nomeLogico;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\bean\Sezione.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */