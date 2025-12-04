/*     */ package it.ras.arco.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinContratto;
/*     */ import it.ras.arco.bean.FinRuolo;
/*     */ import it.ras.arco.bean.FinSoggetto;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
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
/*     */ public class RuoloManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  24 */   private Log log = LogFactory.getLog(RuoloManagerSRV.class);
/*  25 */   private String action = null;
/*     */   
/*     */   public static final String RUOLO = "RUOLO";
/*     */   
/*     */   public static final String CLIENTE = "CLIENTE";
/*     */   
/*     */   public static final String DETTAGLIO = "DETTAGLIO";
/*     */   
/*     */   public static final String COLLEGATO = "COLLEGATO";
/*     */   
/*     */   public static final String GENERIC_MODULE_RESULT = "RUOLO";
/*     */   
/*     */   public static final String ACTION_INSERT_RUOLO = "ACTION_INSERT_RUOLO";
/*     */   
/*     */   public static final String ACTION_GET_RUOLO_BY_SOGG_SCOLL_LEGAME = "ACTION_GET_RUOLO_BY_SOGG_SCOLL_LEGAME";
/*     */   
/*     */   public static final String ACTION_UPDATE_RUOLO = "ACTION_UPDATE_RUOLO";
/*     */   
/*     */   public static final String ACTION_GET_RUOLO_BY_SOGG_CONTR_LEGAME = "ACTION_GET_RUOLO_BY_SOGG_CONTR_LEGAME";
/*     */   
/*     */   public static final String INSERT_RUOLO = "InsertRuoloMD";
/*     */   
/*     */   public static final String UPDATE_RUOLO = "UpdateRuoloMD";
/*     */   
/*     */   public static final String GET_RUOLO_BY_SOGG_SCOLL_LEGAME = "getRuoloBySoggSCollLegameMD";
/*     */   public static final String GET_RUOLO_BY_SOGG_CONTR_LEGAME = "getRuoloBySoggSContrLegameMD";
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  53 */     MapContainer resultMap = new MapContainer();
/*  54 */     FinRuolo ruolo = null;
/*  55 */     FinSoggetto cliente = null;
/*  56 */     FinSoggetto collegato = null;
/*  57 */     FinContratto contratto = null;
/*     */ 
/*     */     
/*  60 */     Object oRuolo = map.getAppl("RUOLO");
/*  61 */     Object oCliente = map.getAppl("CLIENTE");
/*  62 */     Object oCollegato = map.getAppl("COLLEGATO");
/*  63 */     Object oDettaglio = map.getAppl("DETTAGLIO");
/*     */ 
/*     */     
/*  66 */     ruolo = (FinRuolo)getBean(oRuolo, FinRuolo.class);
/*     */ 
/*     */     
/*  69 */     if (this.action.equals("ACTION_INSERT_RUOLO")) {
/*  70 */       resultMap.putAppl("RUOLO", ruolo);
/*  71 */       getModuleManager().execModule("InsertRuoloMD", resultMap);
/*     */       
/*  73 */       return processResultMap(resultMap, false);
/*     */     } 
/*  75 */     if (this.action.equals("ACTION_UPDATE_RUOLO")) {
/*  76 */       resultMap.putAppl("RUOLO", ruolo);
/*  77 */       getModuleManager().execModule("UpdateRuoloMD", resultMap);
/*     */       
/*  79 */       return processResultMap(resultMap, false);
/*     */     } 
/*  81 */     if (this.action.equals("ACTION_GET_RUOLO_BY_SOGG_SCOLL_LEGAME")) {
/*  82 */       cliente = (FinSoggetto)getBean(oCliente, FinSoggetto.class);
/*  83 */       collegato = (FinSoggetto)getBean(oCollegato, FinSoggetto.class);
/*  84 */       String tipoLegame = ruolo.getRuolo();
/*  85 */       Integer clienteId = cliente.getSoggettoId();
/*  86 */       Integer collegatoId = collegato.getSoggettoId();
/*  87 */       resultMap.putAppl("RUOLO", tipoLegame);
/*  88 */       resultMap.putAppl("CLIENTE", clienteId);
/*  89 */       resultMap.putAppl("COLLEGATO", collegatoId);
/*  90 */       resultMap = getModuleManager().execModule("getRuoloBySoggSCollLegameMD", resultMap);
/*     */       
/*  92 */       return processResultMap(resultMap, false);
/*     */     } 
/*  94 */     if (this.action.equals("ACTION_GET_RUOLO_BY_SOGG_CONTR_LEGAME")) {
/*     */       
/*  96 */       oDettaglio = controlloDettaglio(oDettaglio, this.action);
/*  97 */       cliente = (FinSoggetto)getBean(oCliente, FinSoggetto.class);
/*  98 */       contratto = (FinContratto)getBean(oDettaglio, FinContratto.class);
/*     */       
/* 100 */       String tipoLegame = ruolo.getRuolo();
/* 101 */       Integer clienteId = cliente.getSoggettoId();
/* 102 */       Integer contrattoID = contratto.getContrattoId();
/* 103 */       resultMap.putAppl("RUOLO", tipoLegame);
/* 104 */       resultMap.putAppl("CLIENTE", clienteId);
/* 105 */       resultMap.putAppl("DETTAGLIO", contrattoID);
/* 106 */       resultMap = getModuleManager().execModule("getRuoloBySoggSContrLegameMD", resultMap);
/*     */       
/* 108 */       return processResultMap(resultMap, false);
/*     */     } 
/*     */     
/* 111 */     String errorMessage = "L'azione passata al servizio '" + getClass() + "' è invalida o mancante. Action = '" + this.action + "'";
/* 112 */     if (this.log.isErrorEnabled()) {
/* 113 */       this.log.error(errorMessage);
/*     */     }
/* 115 */     throw new RasServiceException(errorMessage);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private MapContainer processResultMap(MapContainer resultMap, boolean allowMultipleRow) {
/* 121 */     if (this.action.equals("ACTION_INSERT_RUOLO")) {
/* 122 */       String str = (String)resultMap.getAppl("INSERTED");
/* 123 */       resultMap.putAppl("INSERTED", str);
/* 124 */       return resultMap;
/*     */     } 
/* 126 */     if (this.action.equals("ACTION_UPDATE_RUOLO")) {
/* 127 */       String str = (String)resultMap.getAppl("UPDATED");
/* 128 */       resultMap.putAppl("UPDATED", str);
/* 129 */       return resultMap;
/*     */     } 
/*     */     
/* 132 */     ArrayList result = (ArrayList)resultMap.getAppl("RUOLO");
/* 133 */     resultMap.removeAppl("RUOLO");
/*     */     
/* 135 */     if (result.size() == 0) {
/* 136 */       resultMap.putAppl("RESULT", "NOT_FOUND");
/*     */     }
/* 138 */     else if (result.size() == 1) {
/* 139 */       resultMap.putAppl("RESULT", "FOUND");
/* 140 */       resultMap.putAppl("RUOLO", result.get(0));
/*     */     }
/* 142 */     else if (allowMultipleRow) {
/* 143 */       resultMap.putAppl("RESULT", "FOUND");
/* 144 */       resultMap.putAppl("RUOLO", result);
/*     */     } else {
/*     */       
/* 147 */       resultMap.putAppl("RESULT", "TOO_MANY_ROWS");
/*     */     } 
/* 149 */     return resultMap;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object controlloDettaglio(Object dettaglio, String action) throws RasServiceException {
/* 154 */     if (!(dettaglio instanceof it.ras.arco.bean.FinGP) && !(dettaglio instanceof it.ras.arco.bean.FinFondiSicav) && !(dettaglio instanceof it.ras.arco.bean.FinContrattoCC) && !(dettaglio instanceof it.ras.arco.bean.FinContrattoDt)) {
/*     */ 
/*     */       
/* 157 */       String errorMessage = "L'oggetto ricevuto dal servizio è di tipo errato, l'azione è :" + action;
/* 158 */       if (this.log.isErrorEnabled()) {
/* 159 */         this.log.error(errorMessage);
/*     */       }
/* 161 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 164 */     return dettaglio;
/*     */   }
/*     */ 
/*     */   
/*     */   private Object getBean(Object obj, Class c) throws RasServiceException {
/* 169 */     if (obj == null) {
/* 170 */       String errorMessage = "L'oggetto ricevuto dal servizio è nullo. Tipo atteso: " + c.getName();
/* 171 */       if (this.log.isErrorEnabled()) {
/* 172 */         this.log.error(errorMessage);
/*     */       }
/* 174 */       throw new RasServiceException(errorMessage);
/*     */     } 
/*     */     
/* 177 */     return obj;
/*     */   }
/*     */   
/*     */   public String getAction() {
/* 181 */     return this.action;
/*     */   }
/*     */   
/*     */   public void setAction(String action) {
/* 185 */     this.action = action;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\service\RuoloManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */