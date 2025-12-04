/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinAltriProdotti;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.springframework.orm.hibernate3.HibernateObjectRetrievalFailureException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AltriProdottiManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String ALTRI_PRODOTTI = "ALTRI_PRODOTTI";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String INSERT_ALTRI_PRODOTTI = "INSERT_ALTRI_PRODOTTI";
/*     */   public static final String UPDATE_ALTRI_PRODOTTI = "UPDATE_ALTRI_PRODOTTI";
/*     */   public static final String GET_ALTRO_PRODOTTO_BY_POSIZIONE_ESTERNA = "GET_ALTRO_PRODOTTO_BY_POSIZIONE_ESTERNA";
/*     */   public static final String POSIZIONE_ESTERNA = "POSIZIONE_ESTERNA";
/*  32 */   private String GENERIC_MODULE_RESULT = null;
/*     */   
/*  34 */   private Log log = LogFactory.getLog(AltriProdottiManagerSRV.class);
/*     */   
/*  36 */   private String action = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  50 */     MapContainer paramMap = new MapContainer();
/*  51 */     MapContainer resultMap = new MapContainer();
/*  52 */     Object oAltriProdotti = map.getAppl("ALTRI_PRODOTTI");
/*  53 */     String moduleName = null;
/*  54 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*  55 */     Boolean allowMultipleRows = null;
/*     */     
/*  57 */     if (oAllowMultipleRows == null) {
/*     */       
/*  59 */       oAllowMultipleRows = new Boolean(false);
/*     */     }
/*  61 */     else if (!(oAllowMultipleRows instanceof Boolean)) {
/*     */       
/*  63 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*     */       
/*  65 */       if (this.log.isErrorEnabled())
/*     */       {
/*  67 */         this.log.error(str);
/*     */       }
/*  69 */       throw new RasServiceException(str);
/*     */     } 
/*  71 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  76 */     if (this.action.equals("GET_ALTRO_PRODOTTO_BY_POSIZIONE_ESTERNA")) {
/*     */       
/*  78 */       FinAltriProdotti altriProdotti = (FinAltriProdotti)getBean(oAltriProdotti, FinAltriProdotti.class);
/*     */       
/*  80 */       Integer posizioneEsterna = altriProdotti.getPosizioneEsternaId();
/*  81 */       this.GENERIC_MODULE_RESULT = "ALTRI_PRODOTTI";
/*     */       
/*  83 */       paramMap.putAppl("POSIZIONE_ESTERNA", posizioneEsterna);
/*  84 */       moduleName = "GetAltroProdottoByPosizioneEsternaMD";
/*     */       
/*     */       try {
/*  87 */         resultMap = getModuleManager().execModule(moduleName, paramMap);
/*     */       }
/*  89 */       catch (HibernateObjectRetrievalFailureException e) {
/*     */         
/*  91 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/*     */         
/*  93 */         rse.setStackTrace(e.getStackTrace());
/*  94 */         throw rse;
/*     */       } 
/*  96 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 101 */     if (this.action.equals("INSERT_ALTRI_PRODOTTI")) {
/*     */ 
/*     */       
/* 104 */       resultMap = insertAltriProdotti(oAltriProdotti);
/* 105 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 110 */     if (this.action.equals("UPDATE_ALTRI_PRODOTTI")) {
/*     */       
/* 112 */       FinAltriProdotti altriProdotti = (FinAltriProdotti)getBean(oAltriProdotti, FinAltriProdotti.class);
/*     */       
/* 114 */       moduleName = "AggiornamentoAltriProdotti";
/*     */       
/* 116 */       paramMap.putAppl("ALTRI_PRODOTTI", altriProdotti);
/*     */       try {
/* 118 */         getModuleManager().execModule(moduleName, paramMap);
/* 119 */       } catch (HibernateObjectRetrievalFailureException e) {
/* 120 */         RasServiceException rse = new RasServiceException("errors.general", e.toString());
/* 121 */         rse.setStackTrace(e.getStackTrace());
/* 122 */         throw rse;
/*     */       } 
/* 124 */       return processResultMap(resultMap, allowMultipleRows.booleanValue());
/*     */     } 
/*     */ 
/*     */     
/* 128 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/*     */ 
/*     */     
/* 131 */     if (this.log.isErrorEnabled())
/*     */     {
/* 133 */       this.log.error(errorMessage);
/*     */     }
/* 135 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer insertAltriProdotti(Object oAltriProdotti) throws RasServiceException {
/* 142 */     MapContainer paramMap = new MapContainer();
/* 143 */     MapContainer resultMap = new MapContainer();
/*     */     
/* 145 */     FinAltriProdotti altriProdotti = (FinAltriProdotti)getBean(oAltriProdotti, FinAltriProdotti.class);
/*     */ 
/*     */     
/* 148 */     paramMap.putAppl("ALTRI_PRODOTTI", altriProdotti);
/* 149 */     getModuleManager().execModule("InserimentoAltriProdotti", paramMap);
/* 150 */     resultMap.putAppl("RESULT", "INSERTED");
/* 151 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 158 */     if (this.action.equals("INSERT_ALTRI_PRODOTTI")) {
/*     */       
/* 160 */       resultMap.putAppl("RESULT", "INSERTED");
/* 161 */       return resultMap;
/*     */     } 
/* 163 */     if (this.action.equals("UPDATE_ALTRI_PRODOTTI")) {
/*     */       
/* 165 */       resultMap.putAppl("RESULT", "UPDATED");
/* 166 */       return resultMap;
/*     */     } 
/*     */     
/* 169 */     ArrayList result = (ArrayList)resultMap.getAppl(this.GENERIC_MODULE_RESULT);
/* 170 */     resultMap.removeAppl(this.GENERIC_MODULE_RESULT);
/*     */     
/* 172 */     if (result.size() == 0) {
/* 173 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 175 */     else if (result.size() == 1) {
/* 176 */       resultMap.putAppl("RESULT", "FOUND");
/* 177 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result.get(0));
/*     */     }
/* 179 */     else if (allowMultipleRow) {
/* 180 */       resultMap.putAppl("RESULT", "FOUND");
/* 181 */       resultMap.putAppl(this.GENERIC_MODULE_RESULT, result);
/*     */     } else {
/*     */       
/* 184 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/*     */     
/* 187 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 193 */     if (obj == null) {
/*     */       
/* 195 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/*     */       
/* 197 */       if (this.log.isErrorEnabled())
/*     */       {
/* 199 */         this.log.error(errorMessage);
/*     */       }
/* 201 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 204 */     if (!obj.getClass().equals(c)) {
/*     */       
/* 206 */       String errorMessage = "Class Cast Exception. Oggetto atteso: " + c.getName() + ", Oggetto ricevuto: " + obj.getClass().getName();
/*     */ 
/*     */       
/* 209 */       if (this.log.isErrorEnabled())
/*     */       {
/* 211 */         this.log.error(errorMessage);
/*     */       }
/* 213 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 215 */     return obj;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 220 */     return this.action;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 225 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\AltriProdottiManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */