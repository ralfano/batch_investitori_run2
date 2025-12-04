/*     */ package it.ras.arco.ordine.service;
/*     */ 
/*     */ import it.ras.arco.common.resources.Utility;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.bean.RasORMBean;
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
/*     */ public class InsertSingleEntitySRV
/*     */   extends AbstractRasService
/*     */ {
/*  19 */   private Log logger = LogFactory.getLog(getClass());
/*     */   
/*  21 */   private String moduloSingleEntity = "insertSingleEntityModule";
/*     */   
/*  23 */   private String USER_GSTD = Utility.getUtenteGstd(getClass());
/*     */   
/*  25 */   private String GET_UTENTE_INS_METHOD = "getUtenteInserimento";
/*     */ 
/*     */   
/*     */   public static final String ENTITA_DA_INSERIRE_MAP_CONTAINER_KEY = "ENTITA_DA_INSERIRE";
/*     */ 
/*     */   
/*     */   public static final String UTENTE_OPERAZIONE_MAP_CONTAINER_KEY = "UTENTE_OPERAZIONE";
/*     */   
/*     */   public static final String FLAG_ESISTENZA_MAP_CONTAINER_KEY = "FLAG_ESISTENZA";
/*     */ 
/*     */   
/*     */   protected boolean functionalValidation(MapContainer map) throws RasServiceException {
/*  37 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  45 */     RasORMBean bean = (RasORMBean)map.getAppl("ENTITA_DA_INSERIRE");
/*     */     
/*  47 */     String utenteOperazione = (String)map.getAppl("UTENTE_OPERAZIONE");
/*  48 */     if (!ArchUtils.isValid(utenteOperazione))
/*     */     {
/*  50 */       utenteOperazione = this.USER_GSTD;
/*     */     }
/*     */     
/*  53 */     if (isNewBean(bean)) {
/*     */       
/*  55 */       Utility.setInsertGSTDvalues(bean, utenteOperazione);
/*     */     }
/*     */     else {
/*     */       
/*  59 */       Utility.setUpdateGSTDvalues(bean, utenteOperazione);
/*     */     } 
/*     */     
/*  62 */     String flagEsistenza = (String)map.getAppl("FLAG_ESISTENZA");
/*  63 */     if ("N".equals(flagEsistenza)) {
/*  64 */       bean.setFlagEsistenza("N");
/*     */     }
/*  66 */     return getModuleManager().execModule(this.moduloSingleEntity, map);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private boolean isNewBean(RasORMBean bean) {
/*     */     try {
/*  73 */       String utenteInserimento = (String)bean.getClass().getMethod(this.GET_UTENTE_INS_METHOD, null).invoke(bean, null);
/*  74 */       if (ArchUtils.isValid(utenteInserimento))
/*     */       {
/*  76 */         return false;
/*     */       
/*     */       }
/*     */     }
/*  80 */     catch (NoSuchMethodException e) {
/*     */       
/*  82 */       if (this.logger.isErrorEnabled())
/*     */       {
/*  84 */         this.logger.error("Nel bean ' " + bean.getClass().getName() + " ' non risulta presente " + "il metodo " + this.GET_UTENTE_INS_METHOD + "!");
/*     */       
/*     */       }
/*     */     }
/*  88 */     catch (Exception e) {
/*     */       
/*  90 */       if (this.logger.isErrorEnabled())
/*     */       {
/*  92 */         this.logger.error("Errore del tipo: " + e.toString() + " nell'invocare il metodo " + this.GET_UTENTE_INS_METHOD + " sul bean: " + bean.getClass().getName());
/*     */       }
/*     */     } 
/*     */ 
/*     */     
/*  97 */     return true;
/*     */   }
/*     */   
/*     */   public String getModuloSingleEntity() {
/* 101 */     return this.moduloSingleEntity;
/*     */   }
/*     */   
/*     */   public void setModuloSingleEntity(String moduloSingleEntity) {
/* 105 */     this.moduloSingleEntity = moduloSingleEntity;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\ordine\service\InsertSingleEntitySRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */