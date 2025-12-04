/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ public class WpRasORMBean
/*    */   extends RasORMBean implements Serializable {
/*    */   private Date dataInserimento;
/*    */   private String utenteInserimento;
/*    */   
/*    */   public Date getDataInserimento() {
/* 13 */     return this.dataInserimento;
/*    */   }
/*    */   public void setDataInserimento(Date dataInserimento) {
/* 16 */     this.dataInserimento = dataInserimento;
/*    */   }
/*    */   public String getUtenteInserimento() {
/* 19 */     return this.utenteInserimento;
/*    */   }
/*    */   public void setUtenteInserimento(String utenteInserimento) {
/* 22 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpRasORMBean.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */