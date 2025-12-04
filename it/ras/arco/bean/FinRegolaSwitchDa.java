/*    */ package it.ras.arco.bean;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import java.util.Set;
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
/*    */ 
/*    */ public class FinRegolaSwitchDa
/*    */   extends FinAbstractRegolaSwitch
/*    */ {
/* 24 */   private Set listaRegoleA = null;
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
/*    */   public Set getListaRegoleA() {
/* 39 */     return this.listaRegoleA;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setListaRegoleA(Set listaRegoleA) {
/* 47 */     this.listaRegoleA = listaRegoleA;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void accept(IGSTDInitVisitor visitor) {
/* 57 */     super.accept(visitor);
/*    */     
/* 59 */     if (this.listaRegoleA != null && this.listaRegoleA.size() > 0)
/*    */     {
/* 61 */       for (Iterator iter = this.listaRegoleA.iterator(); iter.hasNext();)
/*    */       {
/* 63 */         ((IGSTDInitializable)iter.next()).accept(visitor);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinRegolaSwitchDa.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */