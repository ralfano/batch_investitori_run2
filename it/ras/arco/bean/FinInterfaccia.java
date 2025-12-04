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
/*    */ public class FinInterfaccia
/*    */   extends RasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer interfacciaId;
/*    */   private Integer emittenteId;
/*    */   private String interfaccia;
/*    */   private Date dataInserimento;
/*    */   private String utenteInserimento;
/*    */   private FinEmittente emittente;
/*    */   
/*    */   public FinInterfaccia(Integer emittenteId, String interfaccia, Date dataInserimento, String utenteInserimento, FinEmittente emittente) {
/* 33 */     this.emittenteId = emittenteId;
/* 34 */     this.interfaccia = interfaccia;
/* 35 */     this.dataInserimento = dataInserimento;
/* 36 */     this.utenteInserimento = utenteInserimento;
/* 37 */     this.emittente = emittente;
/*    */   }
/*    */ 
/*    */   
/*    */   public FinInterfaccia() {}
/*    */ 
/*    */   
/*    */   public Integer getInterfacciaId() {
/* 45 */     return this.interfacciaId;
/*    */   }
/*    */   
/*    */   public void setInterfacciaId(Integer interfacciaId) {
/* 49 */     this.interfacciaId = interfacciaId;
/*    */   }
/*    */   
/*    */   public Integer getEmittenteId() {
/* 53 */     return this.emittenteId;
/*    */   }
/*    */   
/*    */   public void setEmittenteId(Integer emittenteId) {
/* 57 */     this.emittenteId = emittenteId;
/*    */   }
/*    */   
/*    */   public String getInterfaccia() {
/* 61 */     return this.interfaccia;
/*    */   }
/*    */   
/*    */   public void setInterfaccia(String interfaccia) {
/* 65 */     this.interfaccia = interfaccia;
/*    */   }
/*    */   
/*    */   public Date getDataInserimento() {
/* 69 */     return this.dataInserimento;
/*    */   }
/*    */   
/*    */   public void setDataInserimento(Date dataInserimento) {
/* 73 */     this.dataInserimento = dataInserimento;
/*    */   }
/*    */   
/*    */   public String getUtenteInserimento() {
/* 77 */     return this.utenteInserimento;
/*    */   }
/*    */   
/*    */   public void setUtenteInserimento(String utenteInserimento) {
/* 81 */     this.utenteInserimento = utenteInserimento;
/*    */   }
/*    */   
/*    */   public FinEmittente getEmittente() {
/* 85 */     return this.emittente;
/*    */   }
/*    */   
/*    */   public void setEmittente(FinEmittente emittente) {
/* 89 */     this.emittente = emittente;
/*    */   }
/*    */   
/*    */   public String toString() {
/* 93 */     return (new ToStringBuilder(this)).append("interfacciaId", getInterfacciaId()).toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinInterfaccia.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */