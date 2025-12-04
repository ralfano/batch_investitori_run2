/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ public class WpIntermediariCli
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer intermediarioClienteId;
/*    */   private Integer clienteGenId;
/*    */   private Integer intermediarioId;
/*    */   private Set clientegen;
/*    */   private Set intermediario;
/*    */   
/*    */   public WpIntermediariCli(Set clientegen, Integer id, Set intermediario, Integer id2, Integer id3) {
/* 18 */     this.clientegen = clientegen;
/* 19 */     this.clienteGenId = id;
/* 20 */     this.intermediario = intermediario;
/* 21 */     this.intermediarioClienteId = id2;
/* 22 */     this.intermediarioId = id3;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpIntermediariCli() {}
/*    */   
/*    */   public Set getClientegen() {
/* 29 */     return this.clientegen;
/*    */   }
/*    */   public void setClientegen(Set clientegen) {
/* 32 */     this.clientegen = clientegen;
/*    */   }
/*    */   public Integer getClienteGenId() {
/* 35 */     return this.clienteGenId;
/*    */   }
/*    */   public void setClienteGenId(Integer clienteGenId) {
/* 38 */     this.clienteGenId = clienteGenId;
/*    */   }
/*    */   public Set getIntermediario() {
/* 41 */     return this.intermediario;
/*    */   }
/*    */   public void setIntermediario(Set intermediario) {
/* 44 */     this.intermediario = intermediario;
/*    */   }
/*    */   public Integer getIntermediarioClienteId() {
/* 47 */     return this.intermediarioClienteId;
/*    */   }
/*    */   public void setIntermediarioClienteId(Integer intermediarioClienteId) {
/* 50 */     this.intermediarioClienteId = intermediarioClienteId;
/*    */   }
/*    */   public Integer getIntermediarioId() {
/* 53 */     return this.intermediarioId;
/*    */   }
/*    */   public void setIntermediarioId(Integer intermediarioId) {
/* 56 */     this.intermediarioId = intermediarioId;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpIntermediariCli.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */