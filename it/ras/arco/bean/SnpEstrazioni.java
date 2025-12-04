/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import it.ras.flag.bean.RasORMBean;
/*    */ import java.io.Serializable;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SnpEstrazioni
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Date dataInserito;
/*    */   private Date dataInviato;
/*    */   private Integer id;
/*    */   private String tableName;
/*    */   private String dest;
/*    */   private String inviato;
/*    */   private Integer idEstrazioni;
/*    */   private String dataTxt;
/*    */   
/*    */   public SnpEstrazioni() {}
/*    */   
/*    */   public Date getDataInserito() {
/* 26 */     return this.dataInserito;
/*    */   }
/*    */   
/*    */   public void setDataInserito(Date dataInserito) {
/* 30 */     this.dataInserito = dataInserito;
/*    */   }
/*    */   
/*    */   public Date getDataInviato() {
/* 34 */     return this.dataInviato;
/*    */   }
/*    */   
/*    */   public void setDataInviato(Date dataInviato) {
/* 38 */     this.dataInviato = dataInviato;
/*    */   }
/*    */   
/*    */   public String getDataTxt() {
/* 42 */     return this.dataTxt;
/*    */   }
/*    */   
/*    */   public void setDataTxt(String dataTxt) {
/* 46 */     this.dataTxt = dataTxt;
/*    */   }
/*    */   
/*    */   public String getDest() {
/* 50 */     return this.dest;
/*    */   }
/*    */   
/*    */   public void setDest(String dest) {
/* 54 */     this.dest = dest;
/*    */   }
/*    */   
/*    */   public Integer getId() {
/* 58 */     return this.id;
/*    */   }
/*    */   
/*    */   public void setId(Integer id) {
/* 62 */     this.id = id;
/*    */   }
/*    */   
/*    */   public Integer getIdEstrazioni() {
/* 66 */     return this.idEstrazioni;
/*    */   }
/*    */   
/*    */   public void setIdEstrazioni(Integer idEstrazioni) {
/* 70 */     this.idEstrazioni = idEstrazioni;
/*    */   }
/*    */   
/*    */   public String getInviato() {
/* 74 */     return this.inviato;
/*    */   }
/*    */   
/*    */   public void setInviato(String inviato) {
/* 78 */     this.inviato = inviato;
/*    */   }
/*    */   
/*    */   public String getTableName() {
/* 82 */     return this.tableName;
/*    */   }
/*    */   
/*    */   public void setTableName(String tableName) {
/* 86 */     this.tableName = tableName;
/*    */   }
/*    */ 
/*    */   
/*    */   public SnpEstrazioni(Date dataInserito, Date dataInviato, Integer id, String tableName, String dest, String inviato, Integer idEstrazioni, String dataTxt) {
/* 91 */     this.dataInserito = dataInserito;
/* 92 */     this.dataInviato = dataInviato;
/* 93 */     this.id = id;
/* 94 */     this.tableName = tableName;
/* 95 */     this.dest = dest;
/* 96 */     this.inviato = inviato;
/* 97 */     this.idEstrazioni = idEstrazioni;
/* 98 */     this.dataTxt = dataTxt;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\SnpEstrazioni.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */