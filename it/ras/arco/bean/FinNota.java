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
/*    */ 
/*    */ public class FinNota
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer notaId;
/*    */   private Integer soggInfoPromoId;
/*    */   private String tipoNota;
/*    */   private String testoNota;
/*    */   private Date dataInserimento;
/*    */   private String utenteInserimento;
/*    */   
/*    */   public FinNota(Integer soggInfoPromoId, String tipoNota, String testoNota, Date dataInserimento, String utenteInserimento) {
/* 34 */     this.soggInfoPromoId = soggInfoPromoId;
/* 35 */     this.tipoNota = tipoNota;
/* 36 */     this.testoNota = testoNota;
/* 37 */     this.dataInserimento = dataInserimento;
/* 38 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */ 
/*    */   
/*    */   public FinNota() {}
/*    */ 
/*    */   
/*    */   public Integer getNotaId() {
/* 46 */     return this.notaId;
/*    */   }
/*    */   
/*    */   public void setNotaId(Integer notaId) {
/* 50 */     this.notaId = notaId;
/*    */   }
/*    */   
/*    */   public Integer getSoggInfoPromoId() {
/* 54 */     return this.soggInfoPromoId;
/*    */   }
/*    */   
/*    */   public void setSoggInfoPromoId(Integer soggInfoPromoId) {
/* 58 */     this.soggInfoPromoId = soggInfoPromoId;
/*    */   }
/*    */   
/*    */   public String getTipoNota() {
/* 62 */     return this.tipoNota;
/*    */   }
/*    */   
/*    */   public void setTipoNota(String tipoNota) {
/* 66 */     this.tipoNota = tipoNota;
/*    */   }
/*    */   
/*    */   public String getTestoNota() {
/* 70 */     return this.testoNota;
/*    */   }
/*    */   
/*    */   public void setTestoNota(String testoNota) {
/* 74 */     this.testoNota = testoNota;
/*    */   }
/*    */   
/*    */   public Date getDataInserimento() {
/* 78 */     return this.dataInserimento;
/*    */   }
/*    */   
/*    */   public void setDataInserimento(Date dataInserimento) {
/* 82 */     this.dataInserimento = dataInserimento;
/*    */   }
/*    */   
/*    */   public String getUtenteInserimento() {
/* 86 */     return this.utenteInserimento;
/*    */   }
/*    */   
/*    */   public void setUtenteInserimento(String utenteInserimento) {
/* 90 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 94 */     return (new ToStringBuilder(this)).append("notaId", getNotaId()).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinNota.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */