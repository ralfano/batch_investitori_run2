/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.directw.thread.JNormCfPiOut;
/*     */ import it.directw.thread.NormaOut;
/*     */ import it.ras.arco.bean.FinNormException;
/*     */ import it.ras.flag.exception.RasDaoException;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.exception.RasValidationSignal;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RasNormalizerExceptionSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String INPUT = "NORMAOUT";
/*     */   public static final String ERROR_NUMBER = "ERROR_NUMBER";
/*     */   public static final String EXCEPTION_TO_ADD = "EXCEPTION_TO_ADD";
/*     */   public static final String OUTPUT = "EXCEPTION_SIGNAL";
/*     */   public static final String TIPO_OPERAZIONE = "TIPO_OPERAZIONE";
/*     */   public static final String INDIRIZZO = "INDIRIZZO";
/*     */   public static final String CF = "CODICEFISCALE";
/*     */   public static final int ERROR = 0;
/*     */   public static final int WARNING = 1;
/*     */   public static final int NO_ERROR = 2;
/*  29 */   private String moduleName = "";
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuleName() {
/*  35 */     return this.moduleName;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void setModuleName(String moduleName) {
/*  41 */     this.moduleName = moduleName;
/*     */   }
/*     */ 
/*     */   
/*  45 */   private String application = null;
/*     */   
/*  47 */   private String defaultError = null;
/*     */   
/*  49 */   private String errorKeyVuoto = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  64 */     MapContainer resultMap = new MapContainer();
/*     */     
/*  66 */     RasServiceException rse = (RasServiceException)map.getAppl("EXCEPTION_TO_ADD");
/*  67 */     if (this.application == null) {
/*  68 */       rse.addError(new RasValidationSignal(this.defaultError));
/*  69 */       resultMap.putAppl("EXCEPTION_SIGNAL", rse);
/*  70 */       return resultMap;
/*     */     } 
/*  72 */     String tipoOperazione = "CODICEFISCALE";
/*     */     
/*  74 */     if (map.containsKeyAppl("TIPO_OPERAZIONE")) {
/*  75 */       tipoOperazione = (String)map.getAppl("TIPO_OPERAZIONE");
/*     */     }
/*     */     
/*  78 */     if (tipoOperazione.equals("CODICEFISCALE")) {
/*  79 */       JNormCfPiOut in = (JNormCfPiOut)map.getAppl("NORMAOUT");
/*  80 */       if (in.getCfErrore1() != 0) {
/*  81 */         MapContainer paramMap = new MapContainer();
/*  82 */         paramMap.putAppl("APPLICAZIONE", this.application);
/*  83 */         paramMap.putAppl("ERRORE", in.getCfErrore1() + "");
/*     */         try {
/*  85 */           resultMap = getModuleManager().execModule(this.moduleName, paramMap);
/*  86 */         } catch (RasDaoException e1) {}
/*     */ 
/*     */ 
/*     */         
/*  90 */         ArrayList l = (ArrayList)resultMap.getAppl("RISULTATO_RICERCA");
/*     */         
/*  92 */         if (l != null && !l.isEmpty()) {
/*  93 */           int livello = 0;
/*  94 */           FinNormException NormException = l.iterator().next();
/*     */           try {
/*  96 */             livello = Integer.parseInt(NormException.getLivelloDiWarning());
/*  97 */           } catch (Exception e) {}
/*  98 */           if (this.application.equals("NFE") && in.getOutCfLoca().startsWith("Z") && (
/*  99 */             in.getCfErrore2() == 514 || in.getCfErrore2() == 513)) {
/* 100 */             livello = 2;
/*     */           }
/*     */           
/* 103 */           if (livello == 0) {
/* 104 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 106 */               rse.addError(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 108 */               String descrErroreNorm = in.getCfDerore1();
/* 109 */               rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 112 */           } else if (livello == 1) {
/* 113 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 115 */               rse.addDeroga(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 117 */               String descrErroreNorm = in.getCfDerore1();
/* 118 */               rse.addDeroga(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 121 */           } else if (livello == 2) {
/*     */           
/*     */           } 
/*     */         } else {
/* 125 */           String descrErroreNorm = in.getCfDerore1();
/* 126 */           if (this.application.equals("NFE") && in.getOutCfLoca().startsWith("Z")) {
/* 127 */             if (in.getCfErrore1() == 514 || in.getCfErrore1() == 513);
/*     */           }
/*     */           else {
/*     */             
/* 131 */             rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */           } 
/*     */         } 
/*     */       } 
/* 135 */       if (in.getCfErrore2() != 0) {
/* 136 */         String error = in.getCfDerore2();
/* 137 */         MapContainer paramMap = new MapContainer();
/* 138 */         paramMap.putAppl("APPLICAZIONE", this.application);
/* 139 */         paramMap.putAppl("ERRORE", in.getCfErrore2() + "");
/*     */         try {
/* 141 */           resultMap = getModuleManager().execModule(this.moduleName, paramMap);
/* 142 */         } catch (RasDaoException e1) {}
/*     */ 
/*     */ 
/*     */         
/* 146 */         ArrayList l = (ArrayList)resultMap.getAppl("RISULTATO_RICERCA");
/*     */         
/* 148 */         if (l != null && !l.isEmpty()) {
/* 149 */           int livello = 0;
/* 150 */           FinNormException NormException = l.iterator().next();
/*     */           try {
/* 152 */             livello = Integer.parseInt(NormException.getLivelloDiWarning());
/* 153 */           } catch (Exception e) {}
/* 154 */           if (this.application.equals("NFE") && in.getOutCfLoca().startsWith("Z") && (
/* 155 */             in.getCfErrore2() == 514 || in.getCfErrore2() == 513)) {
/* 156 */             livello = 2;
/*     */           }
/*     */           
/* 159 */           if (livello == 0) {
/* 160 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 162 */               rse.addError(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 164 */               String descrErroreNorm = in.getCfDerore2();
/* 165 */               rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 168 */           } else if (livello == 1) {
/* 169 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 171 */               rse.addDeroga(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 173 */               String descrErroreNorm = in.getCfDerore2();
/* 174 */               rse.addDeroga(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 177 */           } else if (livello == 2) {
/*     */           
/*     */           } 
/*     */         } else {
/* 181 */           String descrErroreNorm = in.getCfDerore2();
/* 182 */           if (this.application.equals("NFE") && in.getOutCfLoca().startsWith("Z")) {
/* 183 */             if (in.getCfErrore2() == 514 || in.getCfErrore2() == 513);
/*     */           }
/*     */           else {
/*     */             
/* 187 */             rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */           } 
/*     */         } 
/*     */       } 
/* 191 */       if (in.getCfErrore3() != 0) {
/* 192 */         String error = in.getCfDerore3();
/* 193 */         MapContainer paramMap = new MapContainer();
/* 194 */         paramMap.putAppl("APPLICAZIONE", this.application);
/* 195 */         paramMap.putAppl("ERRORE", in.getCfErrore3() + "");
/*     */         try {
/* 197 */           resultMap = getModuleManager().execModule(this.moduleName, paramMap);
/* 198 */         } catch (RasDaoException e1) {}
/*     */ 
/*     */ 
/*     */         
/* 202 */         ArrayList l = (ArrayList)resultMap.getAppl("RISULTATO_RICERCA");
/*     */         
/* 204 */         if (l != null && !l.isEmpty()) {
/* 205 */           int livello = 0;
/* 206 */           FinNormException NormException = l.iterator().next();
/*     */           try {
/* 208 */             livello = Integer.parseInt(NormException.getLivelloDiWarning());
/* 209 */           } catch (Exception e) {}
/* 210 */           if (this.application.equals("NFE") && in.getOutCfLoca().startsWith("Z") && (
/* 211 */             in.getCfErrore3() == 514 || in.getCfErrore3() == 513)) {
/* 212 */             livello = 2;
/*     */           }
/*     */           
/* 215 */           if (livello == 0) {
/* 216 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 218 */               rse.addError(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 220 */               String descrErroreNorm = in.getCfDerore3();
/* 221 */               rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 224 */           } else if (livello == 1) {
/* 225 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 227 */               rse.addDeroga(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 229 */               String descrErroreNorm = in.getCfDerore3();
/* 230 */               rse.addDeroga(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 233 */           } else if (livello == 2) {
/*     */ 
/*     */           
/*     */           } 
/*     */         } else {
/* 238 */           String descrErroreNorm = in.getCfDerore3();
/* 239 */           if (this.application.equals("NFE") && in.getOutCfLoca().startsWith("Z")) {
/* 240 */             if (in.getCfErrore3() == 514 || in.getCfErrore3() == 513);
/*     */           }
/*     */           else {
/*     */             
/* 244 */             rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */           }
/*     */         
/*     */         } 
/*     */       } 
/* 249 */     } else if (tipoOperazione.equals("INDIRIZZO")) {
/*     */       
/* 251 */       NormaOut in = (NormaOut)map.getAppl("NORMAOUT");
/* 252 */       if (in.getMcErroreVia() != 0) {
/* 253 */         MapContainer paramMap = new MapContainer();
/* 254 */         paramMap.putAppl("APPLICAZIONE", this.application);
/* 255 */         paramMap.putAppl("ERRORE", in.getMcErroreVia() + "");
/*     */         try {
/* 257 */           resultMap = getModuleManager().execModule(this.moduleName, paramMap);
/* 258 */         } catch (RasDaoException e1) {}
/*     */ 
/*     */ 
/*     */         
/* 262 */         ArrayList l = (ArrayList)resultMap.getAppl("RISULTATO_RICERCA");
/* 263 */         if (l != null && !l.isEmpty()) {
/* 264 */           int livello = 0;
/* 265 */           FinNormException NormException = l.iterator().next();
/*     */           try {
/* 267 */             livello = Integer.parseInt(NormException.getLivelloDiWarning());
/* 268 */           } catch (Exception e) {}
/* 269 */           if (livello == 0) {
/* 270 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 272 */               rse.addError(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 274 */               String descrErroreNorm = in.getMcDeroreVia();
/* 275 */               if (in.getMcErroreVia() == 208) {
/* 276 */                 descrErroreNorm = descrErroreNorm + "<br>" + possibleAdressList(in);
/*     */               }
/* 278 */               rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 281 */           } else if (livello == 1) {
/* 282 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 284 */               rse.addDeroga(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 286 */               String descrErroreNorm = in.getMcDeroreVia();
/* 287 */               if (in.getMcErroreVia() == 208) {
/* 288 */                 descrErroreNorm = descrErroreNorm + "<br>" + possibleAdressList(in);
/*     */               }
/* 290 */               rse.addDeroga(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 293 */           } else if (livello == 2) {
/*     */           
/*     */           } 
/*     */         } else {
/* 297 */           String descrErroreNorm = in.getMcDeroreVia();
/* 298 */           if (in.getMcErroreVia() == 208) {
/* 299 */             descrErroreNorm = descrErroreNorm + "<br>" + possibleAdressList(in);
/*     */           }
/* 301 */           rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */         } 
/*     */       } 
/* 304 */       if (in.getMcErroreLoca() != 0) {
/* 305 */         MapContainer paramMap = new MapContainer();
/* 306 */         paramMap.putAppl("APPLICAZIONE", this.application);
/* 307 */         paramMap.putAppl("ERRORE", in.getMcErroreLoca() + "");
/*     */         try {
/* 309 */           resultMap = getModuleManager().execModule(this.moduleName, paramMap);
/* 310 */         } catch (RasDaoException e1) {}
/*     */ 
/*     */ 
/*     */         
/* 314 */         ArrayList l = (ArrayList)resultMap.getAppl("RISULTATO_RICERCA");
/* 315 */         if (l != null && !l.isEmpty()) {
/* 316 */           int livello = 0;
/* 317 */           FinNormException NormException = l.iterator().next();
/*     */           try {
/* 319 */             livello = Integer.parseInt(NormException.getLivelloDiWarning());
/* 320 */           } catch (Exception e) {}
/* 321 */           if (livello == 0) {
/* 322 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 324 */               rse.addError(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 326 */               String descrErroreNorm = in.getMcDeroreLoca();
/* 327 */               rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 330 */           } else if (livello == 1) {
/* 331 */             if (NormException.getErrorKey() != null && !"".equals(NormException.getErrorKey())) {
/*     */               
/* 333 */               rse.addDeroga(new RasValidationSignal(NormException.getErrorKey()));
/*     */             } else {
/* 335 */               String descrErroreNorm = in.getMcDeroreLoca();
/* 336 */               rse.addDeroga(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */             }
/*     */           
/* 339 */           } else if (livello == 2) {
/*     */           
/*     */           } 
/*     */         } else {
/* 343 */           String descrErroreNorm = in.getMcDeroreLoca();
/* 344 */           rse.addError(new RasValidationSignal(this.errorKeyVuoto, descrErroreNorm));
/*     */         } 
/*     */       } 
/*     */     } 
/* 348 */     return resultMap;
/*     */   }
/*     */   
/*     */   public String getApplication() {
/* 352 */     return this.application;
/*     */   }
/*     */   
/*     */   public void setApplication(String application) {
/* 356 */     this.application = application;
/*     */   }
/*     */   
/*     */   public String getDefaultError() {
/* 360 */     return this.defaultError;
/*     */   }
/*     */   
/*     */   public void setDefaultError(String defaultError) {
/* 364 */     this.defaultError = defaultError;
/*     */   }
/*     */   public String getErrorKeyVuoto() {
/* 367 */     return this.errorKeyVuoto;
/*     */   }
/*     */   public void setErrorKeyVuoto(String errorKeyVuoto) {
/* 370 */     this.errorKeyVuoto = errorKeyVuoto;
/*     */   }
/*     */   
/*     */   private String possibleAdressList(NormaOut normaOut) {
/* 374 */     String returnValue = "Il nome è ambiguo, scegliere tra: <br>";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 380 */     int i = 0;
/*     */     
/* 382 */     String currentNameNonAmbiguo = normaOut.getOnlyNomeViaAmbigua(i);
/* 383 */     String currentDugViaAmbigua = normaOut.getOnlyDugViaAmbigua(i);
/*     */     
/* 385 */     while (!"".equals(currentNameNonAmbiguo)) {
/* 386 */       returnValue = returnValue + currentDugViaAmbigua + " " + currentNameNonAmbiguo + "<br>";
/*     */       
/* 388 */       i++;
/* 389 */       currentNameNonAmbiguo = normaOut.getOnlyNomeViaAmbigua(i);
/* 390 */       currentDugViaAmbigua = normaOut.getOnlyDugViaAmbigua(i);
/*     */     } 
/* 392 */     return returnValue;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\RasNormalizerExceptionSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */