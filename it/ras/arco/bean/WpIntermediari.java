/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WpIntermediari
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer intermediarioId;
/*    */   private Integer tipoIntermediario;
/*    */   private String nome;
/*    */   private Set intermediario;
/*    */   private Set contrattoTerzi;
/*    */   private Set intermediarioCliente;
/*    */   
/*    */   public WpIntermediari(Set terzi, Set intermediario, Set cliente, Integer id, String nome, Integer intermediario2) {
/* 24 */     this.contrattoTerzi = terzi;
/* 25 */     this.intermediario = intermediario;
/* 26 */     this.intermediarioCliente = cliente;
/* 27 */     this.intermediarioId = id;
/* 28 */     this.nome = nome;
/* 29 */     this.tipoIntermediario = intermediario2;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpIntermediari() {}
/*    */   
/*    */   public Set getContrattoTerzi() {
/* 36 */     return this.contrattoTerzi;
/*    */   }
/*    */   public void setContrattoTerzi(Set contrattoTerzi) {
/* 39 */     this.contrattoTerzi = contrattoTerzi;
/*    */   }
/*    */   public Set getIntermediario() {
/* 42 */     return this.intermediario;
/*    */   }
/*    */   public void setIntermediario(Set intermediario) {
/* 45 */     this.intermediario = intermediario;
/*    */   }
/*    */   public Set getIntermediarioCliente() {
/* 48 */     return this.intermediarioCliente;
/*    */   }
/*    */   public void setIntermediarioCliente(Set intermediarioCliente) {
/* 51 */     this.intermediarioCliente = intermediarioCliente;
/*    */   }
/*    */   public Integer getIntermediarioId() {
/* 54 */     return this.intermediarioId;
/*    */   }
/*    */   public void setIntermediarioId(Integer intermediarioId) {
/* 57 */     this.intermediarioId = intermediarioId;
/*    */   }
/*    */   public String getNome() {
/* 60 */     return this.nome;
/*    */   }
/*    */   public void setNome(String nome) {
/* 63 */     this.nome = nome;
/*    */   }
/*    */   public Integer getTipoIntermediario() {
/* 66 */     return this.tipoIntermediario;
/*    */   }
/*    */   public void setTipoIntermediario(Integer tipoIntermediario) {
/* 69 */     this.tipoIntermediario = tipoIntermediario;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpIntermediari.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */