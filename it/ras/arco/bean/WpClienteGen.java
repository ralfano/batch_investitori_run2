/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WpClienteGen
/*    */   extends ArcoRasORMBean
/*    */   implements Serializable
/*    */ {
/*    */   private Integer cliGenId;
/*    */   private Set intermediariocliente;
/*    */   private Set contrattoterzi;
/*    */   private Set nucleo;
/*    */   private Set finpromotore;
/*    */   private Set finsoggetto;
/*    */   private Set finprospect;
/*    */   
/*    */   public WpClienteGen(Integer id, Set contrattoterzi, Set finpromotore, Set finprospect, Set finsoggetto, Set intermediariocliente, Set nucleo) {
/* 21 */     this.cliGenId = id;
/* 22 */     this.contrattoterzi = contrattoterzi;
/* 23 */     this.finpromotore = finpromotore;
/* 24 */     this.finprospect = finprospect;
/* 25 */     this.finsoggetto = finsoggetto;
/* 26 */     this.intermediariocliente = intermediariocliente;
/* 27 */     this.nucleo = nucleo;
/*    */   }
/*    */ 
/*    */   
/*    */   public WpClienteGen() {}
/*    */   
/*    */   public Integer getCliGenId() {
/* 34 */     return this.cliGenId;
/*    */   }
/*    */   public void setCliGenId(Integer cliGenId) {
/* 37 */     this.cliGenId = cliGenId;
/*    */   }
/*    */   public Set getContrattoterzi() {
/* 40 */     return this.contrattoterzi;
/*    */   }
/*    */   public void setContrattoterzi(Set contrattoterzi) {
/* 43 */     this.contrattoterzi = contrattoterzi;
/*    */   }
/*    */   public Set getFinpromotore() {
/* 46 */     return this.finpromotore;
/*    */   }
/*    */   public void setFinpromotore(Set finpromotore) {
/* 49 */     this.finpromotore = finpromotore;
/*    */   }
/*    */   public Set getFinprospect() {
/* 52 */     return this.finprospect;
/*    */   }
/*    */   public void setFinprospect(Set finprospect) {
/* 55 */     this.finprospect = finprospect;
/*    */   }
/*    */   public Set getFinsoggetto() {
/* 58 */     return this.finsoggetto;
/*    */   }
/*    */   public void setFinsoggetto(Set finsoggetto) {
/* 61 */     this.finsoggetto = finsoggetto;
/*    */   }
/*    */   public Set getIntermediariocliente() {
/* 64 */     return this.intermediariocliente;
/*    */   }
/*    */   public void setIntermediariocliente(Set intermediariocliente) {
/* 67 */     this.intermediariocliente = intermediariocliente;
/*    */   }
/*    */   public Set getNucleo() {
/* 70 */     return this.nucleo;
/*    */   }
/*    */   public void setNucleo(Set nucleo) {
/* 73 */     this.nucleo = nucleo;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\WpClienteGen.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */