/*     */ package it.ras.arco.common.bean;
/*     */ 
/*     */ import java.util.ArrayList;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ParametroIs
/*     */   extends Parametro
/*     */   implements IParametroCriteriable
/*     */ {
/*     */   public static final int IS_NULL = 1;
/*     */   public static final int IS_NOT_NULL = 2;
/*     */   public static final int IS_EMPTY = 3;
/*     */   public static final int IS_NOT_EMPTY = 4;
/*     */   private boolean active = false;
/*  34 */   private int tipoIs = 0;
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
/*  45 */     String returnValue = null;
/*     */     
/*  47 */     switch (this.tipoIs)
/*     */     { case 1:
/*  49 */         returnValue = " IS NULL";
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  72 */         return returnValue;case 2: returnValue = " IS NOT NULL"; return returnValue;case 3: returnValue = " IS EMPTY"; return returnValue;case 4: returnValue = " IS NOT EMPTY"; return returnValue; }  returnValue = ""; return returnValue;
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
/*  92 */     return this.active;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActive(boolean active) {
/* 100 */     this.active = active;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getTipoIs() {
/* 108 */     return this.tipoIs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTipoIs(int tipoIs) {
/* 116 */     this.tipoIs = tipoIs;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Criterion getRestriction(String column) {
/* 124 */     Criterion returnValue = null;
/*     */     
/* 126 */     Object valueToBeAdded = getValori(0);
/*     */     
/* 128 */     if (1 == this.tipoIs) {
/* 129 */       returnValue = Restrictions.isNull(column);
/* 130 */     } else if (2 == this.tipoIs) {
/* 131 */       returnValue = Restrictions.isNotNull(column);
/* 132 */     } else if (3 == this.tipoIs) {
/* 133 */       returnValue = Restrictions.isEmpty(column);
/* 134 */     } else if (4 == this.tipoIs) {
/* 135 */       returnValue = Restrictions.isNotEmpty(column);
/*     */     } 
/*     */     
/* 138 */     return returnValue;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroIs.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */