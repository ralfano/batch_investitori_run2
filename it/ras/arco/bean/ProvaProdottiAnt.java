/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProvaProdottiAnt
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer provaProdottoAntId;
/*    */   private String prodottoAnt;
/*    */   private Integer prodottoArco;
/*    */   private Date dataInserimento;
/*    */   private String utenteInserimento;
/*    */   
/*    */   public Date getDataInserimento() {
/* 23 */     return this.dataInserimento;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDataInserimento(Date dataInserimento) {
/* 29 */     this.dataInserimento = dataInserimento;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public String getUtenteInserimento() {
/* 35 */     return this.utenteInserimento;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setUtenteInserimento(String utenteInserimento) {
/* 41 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getProvaProdottoAntId() {
/* 57 */     return this.provaProdottoAntId;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setProvaProdottoAntId(Integer provaProdottoAntId) {
/* 63 */     this.provaProdottoAntId = provaProdottoAntId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getProdottoAnt() {
/* 72 */     return this.prodottoAnt;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setProdottoAnt(String prodottoAnt) {
/* 78 */     this.prodottoAnt = prodottoAnt;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getProdottoArco() {
/* 87 */     return this.prodottoArco;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void setProdottoArco(Integer prodottoArco) {
/* 93 */     this.prodottoArco = prodottoArco;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\ProvaProdottiAnt.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */