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
/*    */ public class FinComplementare
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer complId;
/*    */   private Integer polizzaId;
/*    */   private String descrizione;
/*    */   private Date dataInserimento;
/*    */   private String utenteInserimento;
/*    */   
/*    */   public FinComplementare(Integer polizzaId, String descrizione, Date dataInserimento, String utenteInserimento) {
/* 31 */     this.polizzaId = polizzaId;
/* 32 */     this.descrizione = descrizione;
/* 33 */     this.dataInserimento = dataInserimento;
/* 34 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */ 
/*    */   
/*    */   public FinComplementare() {}
/*    */ 
/*    */   
/*    */   public Integer getComplId() {
/* 42 */     return this.complId;
/*    */   }
/*    */   
/*    */   public void setComplId(Integer complId) {
/* 46 */     this.complId = complId;
/*    */   }
/*    */   
/*    */   public Integer getPolizzaId() {
/* 50 */     return this.polizzaId;
/*    */   }
/*    */   
/*    */   public void setPolizzaId(Integer polizzaId) {
/* 54 */     this.polizzaId = polizzaId;
/*    */   }
/*    */   
/*    */   public String getDescrizione() {
/* 58 */     return this.descrizione;
/*    */   }
/*    */   
/*    */   public void setDescrizione(String descrizione) {
/* 62 */     this.descrizione = descrizione;
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
/* 82 */     return (new ToStringBuilder(this)).append("complId", getComplId()).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinComplementare.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */