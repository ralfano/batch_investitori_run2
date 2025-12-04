/*     */ package it.ras.arco.common.bean;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import org.hibernate.criterion.Criterion;
/*     */ import org.hibernate.criterion.Restrictions;
/*     */ import org.hibernate.criterion.SimpleExpression;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ParametroTestuale
/*     */   extends Parametro
/*     */   implements IParametroCriteriable
/*     */ {
/*     */   private boolean matchCase = false;
/*     */   private boolean exactLeft = false;
/*     */   private boolean exactRight = false;
/*     */   private boolean notEqual = false;
/*     */   private boolean isTrimmed = true;
/*     */   
/*     */   public String costruisciEspressione(ArrayList queryParameters) {
/*  48 */     String str = "";
/*     */     
/*  50 */     if (this.notEqual) {
/*  51 */       if (!this.exactLeft || !this.exactRight) {
/*  52 */         str = str + " NOT LIKE '";
/*     */       } else {
/*  54 */         str = str + "<>'";
/*     */       } 
/*     */       
/*  57 */       if (!this.exactLeft) {
/*  58 */         str = str + "%";
/*     */       }
/*     */       
/*  61 */       str = str + normalizeValueString();
/*     */       
/*  63 */       if (!this.exactRight) {
/*  64 */         str = str + "%";
/*     */       }
/*     */       
/*  67 */       str = str + "' ";
/*     */     } else {
/*  69 */       if (!this.exactLeft || !this.exactRight) {
/*  70 */         str = str + " LIKE '";
/*     */       } else {
/*  72 */         str = str + " = '";
/*     */       } 
/*     */       
/*  75 */       if (!this.exactLeft) {
/*  76 */         str = str + "%";
/*     */       }
/*     */       
/*  79 */       str = str + normalizeValueString();
/*     */       
/*  81 */       if (!this.exactRight) {
/*  82 */         str = str + "%";
/*     */       }
/*     */       
/*  85 */       str = str + "' ";
/*     */     } 
/*     */     
/*  88 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String normalizeValueString() {
/*  96 */     String str = (String)getValori(0);
/*     */     
/*  98 */     str = str.replaceAll("'", "''");
/*     */     
/* 100 */     if (!this.matchCase) {
/* 101 */       str = str.toUpperCase();
/*     */     }
/*     */     
/* 104 */     if (this.isTrimmed) {
/* 105 */       str = str.trim();
/*     */     }
/*     */     
/* 108 */     return str;
/*     */   }
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
/*     */   public boolean isExactLeft() {
/* 122 */     return this.exactLeft;
/*     */   }
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
/*     */   public void setExactLeft(boolean exactLeft) {
/* 136 */     this.exactLeft = exactLeft;
/*     */   }
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
/*     */   public boolean isExactRight() {
/* 150 */     return this.exactRight;
/*     */   }
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
/*     */   public void setExactRight(boolean exactRight) {
/* 164 */     this.exactRight = exactRight;
/*     */   }
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
/*     */   public boolean isMatchCase() {
/* 177 */     return this.matchCase;
/*     */   }
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
/*     */   public void setMatchCase(boolean matchCase) {
/* 190 */     this.matchCase = matchCase;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isNotEqual() {
/* 195 */     return this.notEqual;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setNotEqual(boolean notEqual) {
/* 200 */     this.notEqual = notEqual;
/*     */   }
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
/*     */   public boolean isTrimmed() {
/* 217 */     return this.isTrimmed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setTrimmed(boolean isTrimmed) {
/* 225 */     this.isTrimmed = isTrimmed;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Criterion getRestriction(String column) {
/*     */     SimpleExpression simpleExpression;
/* 235 */     Criterion returnValue = null;
/*     */     
/* 237 */     String valueToBeAdded = (String)getValori(0);
/*     */     
/* 239 */     if (!this.matchCase) {
/* 240 */       valueToBeAdded = valueToBeAdded.toUpperCase();
/*     */     }
/*     */     
/* 243 */     if (this.isTrimmed) {
/* 244 */       valueToBeAdded = valueToBeAdded.trim();
/*     */     }
/*     */     
/* 247 */     if (isNotEqual()) {
/* 248 */       simpleExpression = Restrictions.ne(column, valueToBeAdded);
/*     */     } else {
/* 250 */       if (!isExactLeft()) {
/* 251 */         valueToBeAdded = "%" + valueToBeAdded;
/*     */       }
/*     */       
/* 254 */       if (!isExactRight()) {
/* 255 */         valueToBeAdded = valueToBeAdded + "%";
/*     */       }
/*     */       
/* 258 */       if (isExactLeft() && isExactRight()) {
/* 259 */         simpleExpression = Restrictions.eq(column, valueToBeAdded);
/*     */       } else {
/* 261 */         simpleExpression = Restrictions.like(column, valueToBeAdded);
/*     */       } 
/*     */     } 
/*     */     
/* 265 */     return (Criterion)simpleExpression;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroTestuale.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */