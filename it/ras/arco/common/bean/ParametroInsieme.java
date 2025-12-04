/*     */ package it.ras.arco.common.bean;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import org.hibernate.criterion.Criterion;
/*     */ import org.hibernate.criterion.Restrictions;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ParametroInsieme
/*     */   extends Parametro
/*     */   implements IParametroCriteriable
/*     */ {
/*     */   public static final int IN = 1;
/*     */   public static final int NOT_IN = 2;
/*     */   private boolean active = false;
/*  30 */   private int tipoIn = 0;
/*  31 */   private ArrayList insieme = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String costruisciEspressione(ArrayList queryParameters) {
/*  42 */     String returnValue = "";
/*     */     
/*  44 */     switch (this.tipoIn) {
/*     */       case 1:
/*  46 */         returnValue = returnValue + " IN (";
/*     */         break;
/*     */ 
/*     */       
/*     */       case 2:
/*  51 */         returnValue = returnValue + " NOT IN(";
/*     */         break;
/*     */ 
/*     */       
/*     */       default:
/*  56 */         returnValue = "";
/*     */         break;
/*     */     } 
/*  59 */     Iterator insiemeIterator = this.insieme.iterator();
/*  60 */     boolean primoElemento = true;
/*     */     
/*  62 */     while (insiemeIterator.hasNext()) {
/*  63 */       Object currentElement = insiemeIterator.next();
/*     */       
/*  65 */       queryParameters.add(currentElement);
/*     */       
/*  67 */       if (primoElemento) {
/*  68 */         returnValue = returnValue + " ?";
/*  69 */         primoElemento = false; continue;
/*     */       } 
/*  71 */       returnValue = returnValue + ", ?";
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  77 */     returnValue = returnValue + " )";
/*     */     
/*  79 */     return returnValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void validate(String valore) throws ValoreParametroNonValidoException {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isActive() {
/*  99 */     return this.active;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActive(boolean active) {
/* 107 */     this.active = active;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTipoIn() {
/* 115 */     return this.tipoIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoIn(int tipoIn) {
/* 123 */     this.tipoIn = tipoIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ArrayList getInsieme() {
/* 131 */     return this.insieme;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setInsieme(ArrayList insieme) {
/* 139 */     this.insieme = insieme;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Criterion getRestriction(String column) {
/* 148 */     Criterion returnValue = null;
/*     */     
/* 150 */     Object valueToBeAdded = getValori(0);
/*     */     
/* 152 */     if (1 == this.tipoIn) {
/* 153 */       returnValue = Restrictions.in(column, this.insieme);
/*     */     }
/* 155 */     else if (2 == this.tipoIn) {
/* 156 */       returnValue = Restrictions.not(Restrictions.in(column, this.insieme));
/*     */     } 
/*     */     
/* 159 */     return returnValue;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroInsieme.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */