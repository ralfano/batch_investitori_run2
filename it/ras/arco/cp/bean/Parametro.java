/*     */ package it.ras.arco.cp.bean;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Parametro
/*     */ {
/*  71 */   private String nomeLogico = null;
/*     */   
/*  73 */   private List valori = new ArrayList();
/*     */   
/*     */   private boolean ignoreDefaultValues = true;
/*     */   
/*  77 */   private final String[] defaultValues = new String[] { "-1", "null" };
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
/*     */   public abstract String costruisciEspressione();
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
/*     */   public abstract void validate(String paramString) throws ValoreParametroNonValidoException;
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
/*     */   public boolean isActive() {
/* 129 */     if (this.valori != null)
/*     */     {
/* 131 */       for (int i = 0; i < this.valori.size(); i++) {
/*     */         
/* 133 */         if (this.valori.get(i) != null && !((String)this.valori.get(i)).equals("")) {
/* 134 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/* 138 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNomeLogico() {
/* 147 */     return this.nomeLogico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNomeLogico(String nomeLogico) {
/* 156 */     this.nomeLogico = nomeLogico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getValori() {
/* 165 */     return this.valori;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValori(List valori) throws ValoreParametroNonValidoException {
/* 176 */     for (int i = 0; i < valori.size(); i++) {
/*     */       
/* 178 */       String unValore = valori.get(i);
/* 179 */       unValore = normalize(unValore);
/* 180 */       validate(unValore);
/*     */     } 
/* 182 */     this.valori = valori;
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
/*     */   private String normalize(String unValore) {
/* 197 */     if (this.ignoreDefaultValues)
/*     */     {
/* 199 */       if (this.defaultValues != null && this.defaultValues.length > 0)
/*     */       {
/* 201 */         for (int i = 0; i < this.defaultValues.length; i++) {
/*     */           
/* 203 */           if (this.defaultValues[i].equals(unValore))
/*     */           {
/* 205 */             return "";
/*     */           }
/*     */         } 
/*     */       }
/*     */     }
/*     */     
/* 211 */     return unValore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getValori(int index) {
/* 220 */     if (this.valori.get(index) != null) {
/* 221 */       return this.valori.get(index);
/*     */     }
/* 223 */     return "";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValori(int index, String valore) throws ValoreParametroNonValidoException {
/* 234 */     String unValore = normalize(valore);
/* 235 */     validate(unValore);
/*     */ 
/*     */     
/*     */     try {
/* 239 */       this.valori.set(index, unValore);
/*     */     }
/* 241 */     catch (Exception e) {
/*     */       
/* 243 */       this.valori.add(index, unValore);
/*     */     } 
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
/*     */   public boolean isIgnoreDefaultValues() {
/* 258 */     return this.ignoreDefaultValues;
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
/*     */   public void setIgnoreDefaultValues(boolean ignoreDefaultValues) {
/* 272 */     this.ignoreDefaultValues = ignoreDefaultValues;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\cp\bean\Parametro.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */