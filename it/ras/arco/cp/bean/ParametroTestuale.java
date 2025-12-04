/*     */ package it.ras.arco.cp.bean;
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
/*     */ {
/*     */   private boolean matchCase = false;
/*     */   private boolean exactLeft = false;
/*     */   private boolean exactRight = false;
/*     */   
/*     */   public boolean isActive() {
/*  36 */     if (getValori() != null)
/*     */     {
/*  38 */       for (int i = 0; i < getValori().size(); i++) {
/*     */         
/*  40 */         if (getValori().get(i) != null && !((String)getValori().get(i)).trim().equals("")) {
/*  41 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*  45 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValori(int index) {
/*  55 */     if (getValori().get(index) != null) {
/*  56 */       return ((String)getValori().get(index)).trim();
/*     */     }
/*  58 */     return "";
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
/*     */   public String costruisciEspressione() {
/*  71 */     String str = "";
/*     */     
/*  73 */     if (!this.exactLeft || !this.exactRight) {
/*     */       
/*  75 */       str = str + " LIKE '";
/*     */     }
/*     */     else {
/*     */       
/*  79 */       str = str + " = '";
/*     */     } 
/*     */     
/*  82 */     if (!this.exactLeft)
/*     */     {
/*  84 */       str = str + "%";
/*     */     }
/*     */     
/*  87 */     str = str + normalizeValueString();
/*     */     
/*  89 */     if (!this.exactRight)
/*     */     {
/*  91 */       str = str + "%";
/*     */     }
/*     */     
/*  94 */     str = str + "' ";
/*     */     
/*  96 */     return str;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String normalizeValueString() {
/* 104 */     String str = getValori(0);
/*     */     
/* 106 */     str = str.replaceAll("'", "''");
/*     */     
/* 108 */     if (!this.matchCase) {
/* 109 */       str = str.trim().toUpperCase();
/*     */     }
/* 111 */     return str;
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
/* 125 */     return this.exactLeft;
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
/* 139 */     this.exactLeft = exactLeft;
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
/* 153 */     return this.exactRight;
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
/* 167 */     this.exactRight = exactRight;
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
/* 180 */     return this.matchCase;
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
/* 193 */     this.matchCase = matchCase;
/*     */   }
/*     */   
/*     */   public void validate(String valore) throws ValoreParametroNonValidoException {}
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\bean\ParametroTestuale.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */