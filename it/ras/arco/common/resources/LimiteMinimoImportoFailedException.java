/*     */ package it.ras.arco.common.resources;
/*     */ 
/*     */ import it.ras.flag.exception.RasException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LimiteMinimoImportoFailedException
/*     */   extends RasException
/*     */ {
/*     */   public static final int ERROR_TYPE_UNDEFINED = -1;
/*     */   public static final int ERROR_TYPE_LIMITE_NON_SUPERATO = 10;
/*     */   public static final int ERROR_TYPE_LIMITE_NON_SUPERATO_NO_EUR = 11;
/*     */   public static final int ERROR_TYPE_DIVISA_COMPARTO_NON_DEFINITA = 100;
/*     */   public static final int ERROR_TYPE_CAMBIO_NON_TROVATO = 1000;
/*  20 */   private int errorType = -1;
/*     */   
/*  22 */   private Double limiteMinimo = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException(Exception ex) {
/*  39 */     super(ex);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException(String key) {
/*  49 */     super(key);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException(String key, Object[] params) {
/*  60 */     super(key, params);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException(String key, String param0) {
/*  71 */     super(key, param0);
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
/*     */   public LimiteMinimoImportoFailedException(String key, String param0, String param1) {
/*  84 */     super(key, param0, param1);
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
/*     */   public LimiteMinimoImportoFailedException(String key, String param0, String param1, String param2) {
/*  98 */     super(key, param0, param1, param2);
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
/*     */   
/*     */   public LimiteMinimoImportoFailedException(String key, String param0, String param1, String param2, String param3) {
/* 113 */     super(key, param0, param1, param2, param3);
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
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException(String key, String param0, String param1, String param2, String param3, String param4) {
/* 129 */     super(key, param0, param1, param2, param3, param4);
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
/*     */   public LimiteMinimoImportoFailedException(Exception ex, String key, Object[] params) {
/* 142 */     super(ex, key, params);
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
/*     */   public LimiteMinimoImportoFailedException(Exception ex, String key, String param0) {
/* 155 */     super(ex, key, param0);
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
/*     */   public LimiteMinimoImportoFailedException(Exception ex, String key, String param0, String param1) {
/* 169 */     super(ex, key, param0, param1);
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
/*     */   
/*     */   public LimiteMinimoImportoFailedException(Exception ex, String key, String param0, String param1, String param2) {
/* 184 */     super(ex, key, param0, param1, param2);
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
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException(Exception ex, String key, String param0, String param1, String param2, String param3) {
/* 200 */     super(ex, key, param0, param1, param2, param3);
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LimiteMinimoImportoFailedException(Exception ex, String key, String param0, String param1, String param2, String param3, String param4) {
/* 218 */     super(ex, key, param0, param1, param2, param3, param4);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getErrorType() {
/* 228 */     return this.errorType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setErrorType(int errorType) {
/* 237 */     this.errorType = errorType;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Double getLimiteMinimo() {
/* 246 */     return this.limiteMinimo;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setLimiteMinimo(Double limiteMinimo) {
/* 255 */     this.limiteMinimo = limiteMinimo;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\resources\LimiteMinimoImportoFailedException.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */