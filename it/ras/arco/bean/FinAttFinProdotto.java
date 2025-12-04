/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ import org.apache.commons.lang.builder.ToStringBuilder;
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
/*    */ public class FinAttFinProdotto
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer attivita_ProdID;
/*    */   private Integer attivitaFinId;
/*    */   private Integer prodottoId;
/*    */   private Date dataInserimento;
/*    */   private String utenteInserimento;
/*    */   
/*    */   public FinAttFinProdotto(Integer attivitaFinId, Integer prodottoId, Date dataInserimento, String utenteInserimento) {
/* 31 */     this.attivitaFinId = attivitaFinId;
/* 32 */     this.prodottoId = prodottoId;
/* 33 */     this.dataInserimento = dataInserimento;
/* 34 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */ 
/*    */   
/*    */   public FinAttFinProdotto() {}
/*    */ 
/*    */   
/*    */   public Integer getAttivita_ProdID() {
/* 42 */     return this.attivita_ProdID;
/*    */   }
/*    */   
/*    */   public void setAttivita_ProdID(Integer attivita_ProdID) {
/* 46 */     this.attivita_ProdID = attivita_ProdID;
/*    */   }
/*    */   
/*    */   public Integer getAttivitaFinId() {
/* 50 */     return this.attivitaFinId;
/*    */   }
/*    */   
/*    */   public void setAttivitaFinId(Integer attivitaFinId) {
/* 54 */     this.attivitaFinId = attivitaFinId;
/*    */   }
/*    */   
/*    */   public Integer getProdottoId() {
/* 58 */     return this.prodottoId;
/*    */   }
/*    */   
/*    */   public void setProdottoId(Integer prodottoId) {
/* 62 */     this.prodottoId = prodottoId;
/*    */   }
/*    */   
/*    */   public Date getDataInserimento() {
/* 66 */     return this.dataInserimento;
/*    */   }
/*    */   
/*    */   public void setDataInserimento(Date dataInserimento) {
/* 70 */     this.dataInserimento = dataInserimento;
/*    */   }
/*    */   
/*    */   public String getUtenteInserimento() {
/* 74 */     return this.utenteInserimento;
/*    */   }
/*    */   
/*    */   public void setUtenteInserimento(String utenteInserimento) {
/* 78 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 82 */     return (new ToStringBuilder(this)).append("attivita_ProdID", getAttivita_ProdID()).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAttFinProdotto.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */