/*     */ package it.ras.arco.common.bean;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Parametro
/*     */ {
/*  75 */   private String nomeLogico = null;
/*  76 */   private List valori = new ArrayList();
/*     */   private boolean ignoreDefaultValues = true;
/*  78 */   private final String[] defaultValues = new String[] { "-1", "null" };
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
/*     */   private boolean active = false;
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
/*     */   public abstract String costruisciEspressione(ArrayList paramArrayList);
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
/*     */   public boolean isActive() {
/* 130 */     if (this.valori != null) {
/* 131 */       for (int i = 0; i < this.valori.size(); i++) {
/* 132 */         if (this.valori.get(i) instanceof String) {
/* 133 */           if (this.valori.get(i) != null && !((String)this.valori.get(i)).equals(""))
/*     */           {
/*     */ 
/*     */             
/* 137 */             return true;
/*     */           }
/*     */         }
/* 140 */         else if (this.valori.get(i) != null) {
/* 141 */           return true;
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 147 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getNomeLogico() {
/* 155 */     return this.nomeLogico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setNomeLogico(String nomeLogico) {
/* 163 */     this.nomeLogico = nomeLogico;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public List getValori() {
/* 171 */     return this.valori;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValori(List valori) throws ValoreParametroNonValidoException {
/* 181 */     for (int i = 0; i < valori.size(); i++) {
/* 182 */       String unValore = valori.get(i);
/* 183 */       unValore = normalize(unValore);
/* 184 */       validate(unValore);
/*     */     } 
/*     */     
/* 187 */     this.valori = valori;
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
/*     */   private String normalize(String unValore) {
/* 201 */     if (this.ignoreDefaultValues && 
/* 202 */       this.defaultValues != null && this.defaultValues.length > 0) {
/* 203 */       for (int i = 0; i < this.defaultValues.length; i++) {
/* 204 */         if (this.defaultValues[i].equals(unValore)) {
/* 205 */           return "";
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 211 */     return unValore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object getValori(int index) {
/* 219 */     if (this.valori.get(index) != null) {
/* 220 */       return this.valori.get(index);
/*     */     }
/* 222 */     return "";
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setValori(int index, Object valore) throws ValoreParametroNonValidoException {
/* 233 */     if (valore instanceof String && !"".equals(valore)) {
/* 234 */       String unValore = normalize((String)valore);
/* 235 */       validate(unValore);
/*     */       
/* 237 */       if (this.valori.size() < index + 1) {
/* 238 */         this.valori.add(index, unValore);
/*     */       } else {
/* 240 */         this.valori.set(index, unValore);
/*     */       }
/*     */     
/* 243 */     } else if (this.valori.size() < index + 1) {
/* 244 */       this.valori.add(index, valore);
/*     */     } else {
/* 246 */       this.valori.set(index, valore);
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
/* 261 */     return this.ignoreDefaultValues;
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
/*     */   public void setIgnoreDefaultValues(boolean ignoreDefaultValues) {
/* 274 */     this.ignoreDefaultValues = ignoreDefaultValues;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setActive(boolean active) {
/* 282 */     this.active = active;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\Parametro.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */