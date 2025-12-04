/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinPrezzo;
/*     */ import it.ras.arco.bean.FinUltPrezzo;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class PrezzoManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   private String action;
/*  39 */   private Log log = LogFactory.getLog(PrezzoManagerSRV.class);
/*     */   
/*     */   public static final String NULL_ACTION = "Azione nulla";
/*     */   
/*     */   public static final String PREZZO = "PREZZO";
/*     */   
/*     */   public static final String NOME_BATCH = "NOME_BATCH";
/*     */   
/*     */   public static final String ATTFIN = "ATTFIN";
/*     */   
/*     */   public static final String ALLOW_MULTIPLE_ROWS = "ALLOW_MULTIPLE_ROWS";
/*     */   
/*     */   public static final String INSERT_PREZZO = "INSERT_PREZZO";
/*     */   
/*     */   public static final String INSERT_ULT_PREZZO = "INSERT_ULT_PREZZO";
/*     */   
/*     */   public static final String INSERTPREZZO_MD = "INSERTPREZZO_MD";
/*     */   
/*     */   public static final String GET_PREZZO = "GET_PREZZO";
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  62 */     MapContainer resultMap = new MapContainer();
/*  63 */     MapContainer paramMap = new MapContainer();
/*  64 */     String nomeBatch = null;
/*  65 */     FinPrezzo prezzo = null;
/*  66 */     FinUltPrezzo ultPrezzo = null;
/*  67 */     FinAttivitaFinanziaria attFin = null;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     Object oPrezzo = map.getAppl("PREZZO");
/*  73 */     Object oAttFin = map.getAppl("ATTFIN");
/*  74 */     nomeBatch = (String)map.getAppl("NOME_BATCH");
/*  75 */     Object oAllowMultipleRows = map.getAppl("ALLOW_MULTIPLE_ROWS");
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  80 */     Boolean allowMultipleRows = null;
/*     */     
/*  82 */     if (oAllowMultipleRows == null) {
/*  83 */       oAllowMultipleRows = new Boolean(false);
/*  84 */     } else if (!(oAllowMultipleRows instanceof Boolean)) {
/*  85 */       String str = "Il parametro ALLOW_MULTIPLE_ROWS passato al servizio '" + getClass() + "' è di tipo errato.";
/*  86 */       if (this.log.isErrorEnabled()) {
/*  87 */         this.log.error(str);
/*     */       }
/*  89 */       throw new RasServiceException(str);
/*     */     } 
/*     */     
/*  92 */     allowMultipleRows = (Boolean)oAllowMultipleRows;
/*     */     
/*  94 */     if (this.action.equals("INSERT_PREZZO")) {
/*     */ 
/*     */       
/*  97 */       prezzo = (FinPrezzo)getBean(oPrezzo, FinPrezzo.class);
/*  98 */       attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/*  99 */       prezzo.setAttivitaFin(attFin);
/* 100 */       paramMap.putAppl("PREZZO", prezzo);
/* 101 */       getModuleManager().execModule("INSERTPREZZO_MD", paramMap);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 106 */       ultPrezzo = attFin.getUltPrezzo();
/*     */       
/* 108 */       if (ultPrezzo == null) {
/*     */         
/* 110 */         ultPrezzo = new FinUltPrezzo();
/* 111 */         ultPrezzo.setUltPrezzo(prezzo.getUltPrezzo());
/* 112 */         ultPrezzo.setUltPrezzoEuro(prezzo.getUltPrezzoEuro());
/* 113 */         ultPrezzo.setDataUltPrezzo(prezzo.getDataUltPrezzo());
/* 114 */         ultPrezzo.setCambio(prezzo.getCambio());
/* 115 */         ultPrezzo.setAttivitaFin(attFin);
/* 116 */         ultPrezzo.setDataInserimento(new Date());
/* 117 */         ultPrezzo.setUtenteInserimento(nomeBatch);
/* 118 */         ArchUtils.setStdFields(ultPrezzo, "I", nomeBatch);
/* 119 */         ArchUtils.setStdFields(attFin, "U", nomeBatch);
/* 120 */         updateAttFin(ultPrezzo, attFin, nomeBatch);
/*     */       
/*     */       }
/* 123 */       else if (ultPrezzo.getDataUltPrezzo() == null || ultPrezzo.getDataUltPrezzo().before(prezzo.getDataUltPrezzo()) || ultPrezzo.getUltPrezzo() == null) {
/*     */ 
/*     */         
/* 126 */         ultPrezzo.setUltPrezzo(prezzo.getUltPrezzo());
/* 127 */         ultPrezzo.setUltPrezzoEuro(prezzo.getUltPrezzoEuro());
/* 128 */         ultPrezzo.setDataUltPrezzo(prezzo.getDataUltPrezzo());
/* 129 */         ultPrezzo.setCambio(prezzo.getCambio());
/* 130 */         ultPrezzo.setAttivitaFin(attFin);
/* 131 */         ultPrezzo.setDataInserimento(new Date());
/* 132 */         ultPrezzo.setUtenteInserimento(nomeBatch);
/* 133 */         ArchUtils.setStdFields(ultPrezzo, "U", nomeBatch);
/* 134 */         ArchUtils.setStdFields(attFin, "U", nomeBatch);
/* 135 */         updateAttFin(ultPrezzo, attFin, nomeBatch);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 142 */       resultMap.putAppl("RESULT_MESSAGE", "INSERTED");
/* 143 */       return resultMap;
/*     */     } 
/*     */ 
/*     */     
/* 147 */     if (this.action.equals("GET_PREZZO")) {
/*     */ 
/*     */       
/* 150 */       prezzo = (FinPrezzo)getBean(oPrezzo, FinPrezzo.class);
/* 151 */       attFin = (FinAttivitaFinanziaria)getBean(oAttFin, FinAttivitaFinanziaria.class);
/* 152 */       Date dataQuotazione = prezzo.getDataUltPrezzo();
/*     */       
/* 154 */       paramMap.putAppl("ATT_FIN_ID", attFin.getAttivitaFinId());
/* 155 */       paramMap.putAppl("DATA_QUO", dataQuotazione);
/*     */       
/* 157 */       resultMap = getModuleManager().execModule("GetPrezzoMD", paramMap);
/* 158 */       return processResultMap(resultMap, allowMultipleRows.booleanValue(), "PREZZO");
/*     */     } 
/*     */ 
/*     */     
/* 162 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 163 */     if (this.log.isErrorEnabled()) {
/* 164 */       this.log.error(errorMessage);
/*     */     }
/* 166 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow, String genericModuleResult) throws RasServiceException {
/* 176 */     ArrayList result = (ArrayList)resultMap.getAppl(genericModuleResult);
/* 177 */     resultMap.removeAppl(genericModuleResult);
/*     */     
/* 179 */     if (result.size() == 0) {
/*     */       
/* 181 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */ 
/*     */     
/*     */     }
/* 185 */     else if (allowMultipleRow) {
/* 186 */       resultMap.putAppl("RESULT", "FOUND");
/* 187 */       resultMap.putAppl(genericModuleResult, result);
/*     */     
/*     */     }
/* 190 */     else if (result.size() == 1) {
/* 191 */       resultMap.putAppl("RESULT", "FOUND");
/* 192 */       resultMap.putAppl(genericModuleResult, result.get(0));
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 197 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/*     */     
/* 200 */     return resultMap;
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
/*     */   private void updateAttFin(FinUltPrezzo ultPrezzo, FinAttivitaFinanziaria attFin, String nomeBatch) throws RasServiceException {
/* 216 */     MapContainer paramMap = new MapContainer();
/*     */     
/* 218 */     attFin.setUltPrezzo(ultPrezzo);
/* 219 */     ArchUtils.setStdFields(attFin, "U", nomeBatch);
/* 220 */     paramMap.putAppl("ATTFIN", attFin);
/* 221 */     getModuleManager().execModule("UpdAttFinMD", paramMap);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 228 */     if (obj == null) {
/* 229 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 230 */       if (this.log.isErrorEnabled()) {
/* 231 */         this.log.error(errorMessage);
/*     */       }
/* 233 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 236 */     return obj;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/* 243 */     this.action = action;
/*     */   }
/*     */   public String getAction() {
/* 246 */     return this.action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\PrezzoManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */