/*     */ package it.ras.flag.workflow;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
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
/*     */ public abstract class SimpleWorkFlowManagedService
/*     */   extends AbstractRasService
/*     */ {
/*  20 */   protected final Log log = LogFactory.getLog(getClass());
/*     */   
/*  22 */   private String workflowModule = "";
/*     */   
/*  24 */   private String manageWorkflow = "FALSE";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getWorkflowModule() {
/*  32 */     return this.workflowModule;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setWorkflowModule(String workflowModule) {
/*  42 */     this.workflowModule = workflowModule;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  50 */     return signalWorkflow(map);
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
/*     */   protected MapContainer signalWorkflow(MapContainer mcIn) throws RasServiceException {
/*  62 */     if (!ArchUtils.isValid(getWorkflowModule())) {
/*  63 */       if (getLog().isErrorEnabled()) {
/*  64 */         getLog().error("Non e' stata definita la proprieta' 'workflowModule', non verra' eseguita la gestione del workflow");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/*  69 */       if (hasToManageWorkflow()) {
/*  70 */         throw new RasServiceException("errors.general", "Proprieta' 'workflowModule' non definita");
/*     */       }
/*     */       
/*  73 */       if (getLog().isDebugEnabled()) {
/*  74 */         getLog().debug("Uscita silenziosa.");
/*     */       }
/*     */ 
/*     */       
/*  78 */       return mcIn;
/*     */     } 
/*     */     
/*  81 */     if (hasToManageWorkflow()) {
/*  82 */       if (getLog().isDebugEnabled()) {
/*  83 */         getLog().debug("Esecuzione del modulo di workflow '" + getWorkflowModule() + "'.");
/*     */       }
/*     */ 
/*     */       
/*  87 */       return getModuleManager().execModule(getWorkflowModule(), mcIn);
/*     */     } 
/*  89 */     if (getLog().isWarnEnabled()) {
/*  90 */       getLog().warn("Gestione del workflow disabilitata, la proprieta' 'manageWorkflow' e' settata a '" + getManageWorkflow() + "'!");
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  95 */     return mcIn;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Log getLog() {
/* 103 */     return this.log;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getManageWorkflow() {
/* 110 */     return this.manageWorkflow;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setManageWorkflow(String manageWorkflow) {
/* 118 */     this.manageWorkflow = manageWorkflow;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean hasToManageWorkflow() {
/* 127 */     return "true".equalsIgnoreCase(getManageWorkflow());
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\SimpleWorkFlowManagedService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */