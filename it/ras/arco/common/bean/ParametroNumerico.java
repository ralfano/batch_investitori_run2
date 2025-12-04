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
/*     */ public class ParametroNumerico
/*     */   extends Parametro
/*     */   implements IParametroCriteriable
/*     */ {
/*  20 */   public static int CONFRONTO_UGUALE = 0;
/*  21 */   public static int CONFRONTO_MAGGIORE = 1;
/*  22 */   public static int CONFRONTO_MAGGIORE_UGUALE = 2;
/*  23 */   public static int CONFRONTO_MINORE = 3;
/*  24 */   public static int CONFRONTO_MINORE_UGUALE = 4;
/*  25 */   public static int CONFRONTO_DIVERSO = 5;
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  30 */   public static int CONFRONTO_INTERVALLO = 10;
/*  31 */   private int modalitaConfronto = 0;
/*  32 */   private String[] tokenConfronto = new String[] { " = ", " > ", " >= ", " < ", " <= ", " <> " };
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
/*     */   public String costruisciEspressione(ArrayList queryParameters) {
/*  51 */     if (this.modalitaConfronto >= CONFRONTO_UGUALE && this.modalitaConfronto <= CONFRONTO_DIVERSO) {
/*     */ 
/*     */ 
/*     */       
/*  55 */       queryParameters.add(getValori(0));
/*     */       
/*  57 */       return this.tokenConfronto[this.modalitaConfronto] + "?" + " ";
/*     */     } 
/*     */     
/*  60 */     if (this.modalitaConfronto == CONFRONTO_INTERVALLO) {
/*  61 */       queryParameters.add(getValori(0));
/*  62 */       queryParameters.add(getValori(1));
/*     */       
/*  64 */       return " BETWEEN ? AND ? ";
/*     */     } 
/*     */     
/*  67 */     return "";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void validate(String valore) throws ValoreParametroNonValidoException {
/*     */     try {
/*  79 */       if (!"".equals(valore)) {
/*  80 */         Double.parseDouble(valore);
/*     */       }
/*  82 */     } catch (NumberFormatException e) {
/*  83 */       throw new ValoreParametroNonValidoException(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getModalitaConfronto() {
/*  92 */     return this.modalitaConfronto;
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
/*     */   public void setModalitaConfronto(int modalitaConfronto) throws ValoreParametroNonValidoException {
/* 105 */     if (modalitaConfronto < CONFRONTO_UGUALE || modalitaConfronto > CONFRONTO_DIVERSO)
/*     */     {
/*     */ 
/*     */       
/* 109 */       if (modalitaConfronto != CONFRONTO_INTERVALLO) {
/* 110 */         throw new ValoreParametroNonValidoException("Modalita' confronto non valida");
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 116 */     this.modalitaConfronto = modalitaConfronto;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValori(int index, Object valore) throws ValoreParametroNonValidoException {
/* 126 */     if (valore instanceof String && !"".equals(valore)) {
/*     */ 
/*     */ 
/*     */       
/* 130 */       Integer unValoreConverted = new Integer((String)valore);
/*     */       
/* 132 */       super.setValori(index, unValoreConverted);
/*     */     } else {
/*     */       
/* 135 */       super.setValori(index, valore);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Criterion getRestriction(String column) {
/* 144 */     Criterion returnValue = null;
/*     */     
/* 146 */     Object valueToBeAdded = getValori(0);
/*     */     
/* 148 */     if (CONFRONTO_UGUALE == this.modalitaConfronto) {
/* 149 */       SimpleExpression simpleExpression = Restrictions.eq(column, valueToBeAdded);
/* 150 */     } else if (CONFRONTO_DIVERSO == this.modalitaConfronto) {
/* 151 */       SimpleExpression simpleExpression = Restrictions.ne(column, valueToBeAdded);
/* 152 */     } else if (CONFRONTO_MAGGIORE == this.modalitaConfronto) {
/* 153 */       SimpleExpression simpleExpression = Restrictions.gt(column, valueToBeAdded);
/* 154 */     } else if (CONFRONTO_MAGGIORE_UGUALE == this.modalitaConfronto) {
/* 155 */       SimpleExpression simpleExpression = Restrictions.ge(column, valueToBeAdded);
/* 156 */     } else if (CONFRONTO_MINORE == this.modalitaConfronto) {
/* 157 */       SimpleExpression simpleExpression = Restrictions.lt(column, valueToBeAdded);
/* 158 */     } else if (CONFRONTO_MINORE_UGUALE == this.modalitaConfronto) {
/* 159 */       SimpleExpression simpleExpression = Restrictions.le(column, valueToBeAdded);
/* 160 */     } else if (CONFRONTO_INTERVALLO == this.modalitaConfronto) {
/* 161 */       Object seconValueToBeAdded = getValori(1);
/* 162 */       returnValue = Restrictions.between(column, valueToBeAdded, seconValueToBeAdded);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 167 */     return returnValue;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\ParametroNumerico.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */