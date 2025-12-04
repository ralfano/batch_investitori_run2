/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ 
/*    */ public class WpIntermediarioCliente
/*    */   extends WpRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer intermediarioClienteId;
/*    */   private Integer clienteGenId;
/*    */   private Integer intermediarioId;
/*    */   private WpClienteGen clientegen;
/*    */   private WpIntermediari intermediario;
/*    */   
/*    */   public WpClienteGen getClientegen() {
/* 17 */     return this.clientegen;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setClientegen(WpClienteGen clientegen) {
/* 22 */     this.clientegen = clientegen;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpIntermediari getIntermediario() {
/* 27 */     return this.intermediario;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIntermediario(WpIntermediari intermediario) {
/* 32 */     this.intermediario = intermediario;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public WpIntermediarioCliente(Integer id, Integer id2, Integer id3) {
/* 39 */     this.clienteGenId = id;
/* 40 */     this.intermediarioClienteId = id2;
/* 41 */     this.intermediarioId = id3;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public WpIntermediarioCliente() {}
/*    */ 
/*    */ 
/*    */   
/*    */   public Integer getClienteGenId() {
/* 52 */     return this.clienteGenId;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setClienteGenId(Integer clienteGenId) {
/* 57 */     this.clienteGenId = clienteGenId;
/*    */   }
/*    */ 
/*    */   
/*    */   public Integer getIntermediarioClienteId() {
/* 62 */     return this.intermediarioClienteId;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIntermediarioClienteId(Integer intermediarioClienteId) {
/* 67 */     this.intermediarioClienteId = intermediarioClienteId;
/*    */   }
/*    */ 
/*    */   
/*    */   public Integer getIntermediarioId() {
/* 72 */     return this.intermediarioId;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setIntermediarioId(Integer intermediarioId) {
/* 77 */     this.intermediarioId = intermediarioId;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpIntermediarioCliente.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */