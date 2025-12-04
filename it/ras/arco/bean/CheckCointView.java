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
/*    */ 
/*    */ public class CheckCointView
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer viewId;
/*    */   private Integer soggCoin;
/*    */   private String cointSign;
/*    */   private Date dataInserimento;
/*    */   private String utenteInserimento;
/*    */   
/*    */   public CheckCointView(Integer soggCoin, String cointSign, Date dataInserimento, String utenteInserimento) {
/* 32 */     this.soggCoin = soggCoin;
/* 33 */     this.cointSign = cointSign;
/* 34 */     this.dataInserimento = dataInserimento;
/* 35 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */ 
/*    */   
/*    */   public CheckCointView() {}
/*    */ 
/*    */   
/*    */   public Integer getViewId() {
/* 43 */     return this.viewId;
/*    */   }
/*    */   
/*    */   public void setViewId(Integer viewId) {
/* 47 */     this.viewId = viewId;
/*    */   }
/*    */   
/*    */   public Integer getSoggCoin() {
/* 51 */     return this.soggCoin;
/*    */   }
/*    */   
/*    */   public void setSoggCoin(Integer soggCoin) {
/* 55 */     this.soggCoin = soggCoin;
/*    */   }
/*    */   
/*    */   public String getCointSign() {
/* 59 */     return this.cointSign;
/*    */   }
/*    */   
/*    */   public void setCointSign(String cointSign) {
/* 63 */     this.cointSign = cointSign;
/*    */   }
/*    */   
/*    */   public Date getDataInserimento() {
/* 67 */     return this.dataInserimento;
/*    */   }
/*    */   
/*    */   public void setDataInserimento(Date dataInserimento) {
/* 71 */     this.dataInserimento = dataInserimento;
/*    */   }
/*    */   
/*    */   public String getUtenteInserimento() {
/* 75 */     return this.utenteInserimento;
/*    */   }
/*    */   
/*    */   public void setUtenteInserimento(String utenteInserimento) {
/* 79 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 83 */     return (new ToStringBuilder(this)).append("viewId", getViewId()).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\CheckCointView.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */