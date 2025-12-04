/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.DecRegoleInboundMovimento;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Hashtable;
/*     */ import java.util.Map;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class RegoleInboundMovimentoSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String DECREGOLEINBOUNDMOVIMENTO = "DecRegoleInboundMovimento";
/*     */   public static final String GENERIC_MODULE_RESULT = "DecRegoleInboundMovimento";
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   public static final String GET_REGOLE = "GetRegole";
/*     */   public static final String GET_REGOLE_BY_CODICE_EMITTENTE = "GetRegoleByCodiceEmittenteMD";
/*     */   public static final String CODICE_EMITTENTE = "CODICE_EMITTENTE";
/*     */   public static final String NOME_SERVIZIO = "GetRegoleInboundMovimento";
/*  38 */   private String action = "ACTION";
/*  39 */   private Log log = LogFactory.getLog(RegoleInboundMovimentoSRV.class);
/*     */ 
/*     */ 
/*     */   
/*  43 */   private Map tabellaRegole = new Hashtable();
/*     */ 
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
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  60 */     MapContainer resultMap = new MapContainer();
/*  61 */     MapContainer paramMap = new MapContainer();
/*     */     
/*  63 */     String moduleName = null;
/*  64 */     Boolean allowMultipleRows = null;
/*     */     
/*  66 */     Object oRegoleInboundMov = map.getAppl("DecRegoleInboundMovimento");
/*  67 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */     
/*  69 */     DecRegoleInboundMovimento regoleInboundMov = null;
/*     */ 
/*     */     
/*  72 */     if (oAllowMultipleRows == null) {
/*  73 */       oAllowMultipleRows = new Boolean(false);
/*  74 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  75 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  76 */       if (this.log.isErrorEnabled()) {
/*  77 */         this.log.error(str);
/*     */       }
/*  79 */       throw new RasServiceException(str);
/*     */     } 
/*  81 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     if (this.action.equals("GetRegole")) {
/*     */       
/*  88 */       regoleInboundMov = (DecRegoleInboundMovimento)getBean(oRegoleInboundMov, DecRegoleInboundMovimento.class.getName());
/*     */ 
/*     */       
/*  91 */       String codiceEmittente = regoleInboundMov.getCodiceEmittente();
/*     */ 
/*     */       
/*  94 */       if (this.tabellaRegole.containsKey(codiceEmittente)) {
/*     */         
/*  96 */         regoleInboundMov = (DecRegoleInboundMovimento)this.tabellaRegole.get(codiceEmittente);
/*  97 */         resultMap.putAppl("DecRegoleInboundMovimento", regoleInboundMov);
/*  98 */         resultMap.putAppl("RESULT", "FOUND");
/*  99 */         return resultMap;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 104 */       moduleName = "GetRegoleByCodiceEmittenteMD";
/* 105 */       paramMap.putAppl("CODICE_EMITTENTE", codiceEmittente);
/* 106 */       resultMap = getModuleManager().execModule(moduleName, paramMap);
/* 107 */       resultMap = processResultMap(resultMap, allowMultipleRows.booleanValue());
/* 108 */       String risultato = (String)resultMap.getAppl("RESULT");
/*     */       
/* 110 */       if (risultato.equals("FOUND")) {
/*     */         
/* 112 */         regoleInboundMov = (DecRegoleInboundMovimento)resultMap.getAppl("DecRegoleInboundMovimento");
/* 113 */         this.tabellaRegole.put(codiceEmittente, regoleInboundMov);
/* 114 */         return resultMap;
/*     */       } 
/*     */       
/* 117 */       return resultMap;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 125 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 126 */     if (this.log.isErrorEnabled()) {
/* 127 */       this.log.error(errorMessage);
/*     */     }
/* 129 */     throw new RasServiceException(errorMessage);
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
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 143 */     ArrayList result = (ArrayList)resultMap.getAppl("DecRegoleInboundMovimento");
/* 144 */     resultMap.removeAppl("DecRegoleInboundMovimento");
/*     */     
/* 146 */     if (result.size() == 0) {
/* 147 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 149 */     else if (result.size() == 1) {
/* 150 */       resultMap.putAppl("RESULT", "FOUND");
/* 151 */       resultMap.putAppl("DecRegoleInboundMovimento", result.get(0));
/*     */     }
/* 153 */     else if (allowMultipleRow) {
/* 154 */       resultMap.putAppl("RESULT", "FOUND");
/* 155 */       resultMap.putAppl("DecRegoleInboundMovimento", result);
/*     */     } else {
/*     */       
/* 158 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 160 */     return resultMap;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 166 */     Object retObject = null;
/*     */     try {
/* 168 */       Class c = Class.forName(className);
/* 169 */       if (!c.isInstance(obj)) {
/* 170 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal servizio è nullo o di tipo errato.";
/* 171 */         if (this.log.isErrorEnabled()) {
/* 172 */           this.log.error(errorMessage);
/*     */         }
/* 174 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 176 */       retObject = obj;
/* 177 */     } catch (ClassNotFoundException e) {
/* 178 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/* 179 */       if (this.log.isErrorEnabled()) {
/* 180 */         this.log.error(errorMessage);
/*     */       }
/* 182 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 184 */     return retObject;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 188 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 192 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\RegoleInboundMovimentoSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */