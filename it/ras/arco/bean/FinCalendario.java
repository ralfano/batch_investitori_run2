/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.util.Date;
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
/*    */ public class FinCalendario
/*    */   extends RasORMBean
/*    */ {
/*    */   private Integer festivitaId;
/*    */   private String codiceCalendario;
/*    */   private Date dataFestivita;
/*    */   
/*    */   public String getCodiceCalendario() {
/* 24 */     return this.codiceCalendario;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setCodiceCalendario(String codiceCalendario) {
/* 32 */     this.codiceCalendario = codiceCalendario;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Date getDataFestivita() {
/* 39 */     return this.dataFestivita;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setDataFestivita(Date dataFestivita) {
/* 47 */     this.dataFestivita = dataFestivita;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getFestivitaId() {
/* 54 */     return this.festivitaId;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setFestivitaId(Integer festivitaId) {
/* 62 */     this.festivitaId = festivitaId;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinCalendario.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */