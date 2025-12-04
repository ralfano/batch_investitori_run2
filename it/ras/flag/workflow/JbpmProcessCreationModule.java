/*    */ package it.ras.flag.workflow;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import org.apache.commons.beanutils.PropertyUtils;
/*    */ import org.jbpm.JbpmContext;
/*    */ import org.jbpm.graph.def.ProcessDefinition;
/*    */ import org.jbpm.graph.exe.ExecutionContext;
/*    */ import org.jbpm.graph.exe.ProcessInstance;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JbpmProcessCreationModule
/*    */   extends JbpmTransitionModule
/*    */ {
/* 21 */   private String processName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public String getProcessName() {
/* 29 */     return this.processName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setProcessName(String processName) {
/* 41 */     this.processName = processName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void doModuleProcess(JbpmContext jbpmContext, ProcessInstance process, ExecutionContext executionContext, MapContainer inputMap) throws RasServiceException {
/*    */     try {
/* 53 */       Object variableValue = PropertyUtils.getProperty(inputMap.getApplMap(), getContextVariableValue());
/*    */ 
/*    */       
/* 56 */       if (log.isDebugEnabled()) {
/* 57 */         log.debug("Registrazione della nuova istanza del processo '" + process.getProcessDefinition().getName() + "' con variabile di contesto nome: '" + getContextVariableName() + "', valore: '" + variableValue + "'.");
/*    */       }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 64 */       process.getContextInstance().setVariable(getContextVariableName(), variableValue);
/*    */ 
/*    */       
/* 67 */       super.doModuleProcess(jbpmContext, process, executionContext, inputMap);
/*    */     }
/* 69 */     catch (Exception ex) {
/* 70 */       log.error("ERRORE: ", ex);
/*    */       
/* 72 */       if (!(ex instanceof RasServiceException)) {
/* 73 */         throw new RasServiceException(ex, "errors.general", "");
/*    */       }
/* 75 */       throw (RasServiceException)ex;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ProcessInstance getProcessInstance(JbpmContext jbpmContext, MapContainer inputMap) {
/* 87 */     if (log.isDebugEnabled()) {
/* 88 */       log.debug("Generazione di una nuova istanza del processo '" + getProcessName() + "'.");
/*    */     }
/*    */ 
/*    */     
/* 92 */     ProcessDefinition processDefinition = jbpmContext.getGraphSession().findLatestProcessDefinition(getProcessName());
/*    */ 
/*    */ 
/*    */     
/* 96 */     ProcessInstance process = processDefinition.createProcessInstance();
/*    */     
/* 98 */     return process;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\JbpmProcessCreationModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */