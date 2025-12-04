/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinArchivioStacCedBon;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ArchivioBonManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*     */   public static final String INSERT = "INSERT";
/*  38 */   private String action = "ACTION";
/*     */   
/*     */   public static final String SOTTOSCRIZIONE = "SOTTOSCRIZIONE";
/*     */   
/*     */   public static final String GET = "GET";
/*     */   public static final String CONTRATTO = "CONTRATTO";
/*     */   public static final String TIPO_FLUSSO = "TIPO_FLUSSO";
/*     */   public static final String ARCHIVIO = "ARCHIVIO";
/*     */   public static final String POLIZZA = "POLIZZA";
/*     */   public static final String SOTTOSCRIZIONE_ID = "SOTTOSCRIZIONE_ID";
/*     */   public static final String GetServizioAggBySottMD = "GetServizioAggBySottMD";
/*     */   public static final String GET_NUM_C = "GET_NUM_C";
/*     */   public static final String CONT_ID = "CONT_ID";
/*     */   public static final String ArchivioPol = "ArchivioPol";
/*     */   public static final String GetServizioMD = "GetServizioMD";
/*     */   public static final String GetServizioNumMD = "GetServizioNumMD";
/*     */   public static final String GetServizioPolMD = "GetServizioPolMD";
/*     */   public static final String GET_BY_SOTT = "GET_BY_SOTT";
/*     */   public static final String InsArchivioMD = "InsArchivioMD";
/*     */   public static final String UpdArchivioMD = "UpdArchivioMD";
/*  58 */   private MapContainer param = new MapContainer();
/*  59 */   private MapContainer SRV_Result_MAP = new MapContainer();
/*  60 */   private MapContainer Map = new MapContainer();
/*     */   
/*  62 */   private FinArchivioStacCedBon archivioRow = new FinArchivioStacCedBon();
/*     */   
/*  64 */   private String GENERIC_MODULE_RESULT = null;
/*  65 */   private String RESULT_OUTPUT = null;
/*  66 */   private String NOME_BATCH = null;
/*  67 */   private String resultMsg = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  73 */   private Log logger = LogFactory.getLog(getClass());
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
/*     */   protected MapContainer processBusinessLogic(MapContainer SRV_Input_MAP) throws RasServiceException {
/*  87 */     if (this.action.equals("INSERT")) {
/*  88 */       this.NOME_BATCH = (String)SRV_Input_MAP.getAppl(this.NOME_BATCH);
/*  89 */       this.logger.info("L'azione è " + this.action);
/*     */     } 
/*  91 */     if (this.action.equals("UPDATE")) {
/*  92 */       this.logger.info("L'azione è " + this.action);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  98 */     MapContainer MD_Input_MAP = new MapContainer();
/*  99 */     MapContainer MD_Result_MAP = new MapContainer();
/*     */     
/* 101 */     Object oContratto = null;
/* 102 */     Object oFlusso = null;
/* 103 */     String numeroPolizza = null;
/* 104 */     Object oServizio = null;
/* 105 */     Object oSottoscrizione = null;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     if (this.action.equals("INSERT")) {
/*     */       
/* 113 */       this.archivioRow = (FinArchivioStacCedBon)SRV_Input_MAP.getAppl("ARCHIVIO");
/*     */       
/* 115 */       this.param.putAppl("ARCHIVIO", this.archivioRow);
/*     */       
/* 117 */       getModuleManager().execModule("InsArchivioMD", this.param);
/*     */       
/* 119 */       this.resultMsg = "INSERTED";
/* 120 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/*     */     }
/* 122 */     else if (this.action.equals("UPDATE")) {
/* 123 */       this.archivioRow = (FinArchivioStacCedBon)SRV_Input_MAP.getAppl("ARCHIVIO");
/*     */ 
/*     */ 
/*     */       
/* 127 */       this.param.putAppl("ARCHIVIO", this.archivioRow);
/*     */       
/* 129 */       getModuleManager().execModule("UpdArchivioMD", this.param);
/*     */       
/* 131 */       this.resultMsg = "UPDATED";
/* 132 */       this.SRV_Result_MAP.putAppl("RESULT", this.resultMsg);
/*     */     } 
/*     */ 
/*     */     
/* 136 */     return this.SRV_Result_MAP;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, String className) throws RasServiceException {
/* 142 */     Object retObject = null;
/*     */     try {
/* 144 */       Class c = Class.forName(className);
/* 145 */       if (!c.isInstance(obj)) {
/* 146 */         String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': l'oggetto ricevuto dal ARCHIVIO è nullo o di tipo errato.";
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 151 */         if (this.logger.isErrorEnabled()) {
/* 152 */           this.logger.error(errorMessage);
/*     */         }
/* 154 */         throw new RasServiceException(errorMessage);
/*     */       } 
/* 156 */       retObject = obj;
/* 157 */     } catch (ClassNotFoundException e) {
/* 158 */       String errorMessage = "Errore in: '" + getClass() + ".getBean': impossibile instanziare un oggetto di tipo '" + className + "': la classe non esiste.";
/*     */ 
/*     */       
/* 161 */       if (this.logger.isErrorEnabled()) {
/* 162 */         this.logger.error(errorMessage);
/*     */       }
/* 164 */       throw new RasServiceException(errorMessage);
/*     */     } 
/* 166 */     return retObject;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAction() {
/* 173 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 177 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\ArchivioBonManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */