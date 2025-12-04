/*    */ package it.ras.flag.workflow;
/*    */ 
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import org.apache.commons.beanutils.PropertyUtils;
/*    */ import org.jbpm.JbpmContext;
/*    */ import org.jbpm.graph.def.Node;
/*    */ import org.jbpm.graph.def.Transition;
/*    */ import org.jbpm.graph.exe.ExecutionContext;
/*    */ import org.jbpm.graph.exe.ProcessInstance;
/*    */ import org.jbpm.graph.exe.Token;
/*    */ 
/*    */ public class JbpmTransitionModule
/*    */   extends JbpmModule
/*    */ {
/* 16 */   private String transitionName = null;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void setTransitionName(String transitionName) {
/* 25 */     this.transitionName = transitionName;
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
/*    */   public void doModuleProcess(JbpmContext jbpmContext, ProcessInstance process, ExecutionContext executionContext, MapContainer inputMap) throws RasServiceException {
/* 37 */     Token token = process.getRootToken();
/*    */     
/* 39 */     if (log.isDebugEnabled()) {
/* 40 */       log.debug("Esecuzione della transizione '" + getTransitionName() + "' sull'istanza del processo '" + process.getProcessDefinition().getName() + "'.");
/*    */     }
/*    */ 
/*    */ 
/*    */     
/* 45 */     Node nodoIniziale = token.getNode();
/* 46 */     Transition transizione = nodoIniziale.getLeavingTransition(getTransitionName());
/* 47 */     executionContext.setTransition(transizione);
/* 48 */     executionContext.setTransitionSource(nodoIniziale);
/*    */     
/* 50 */     token.signal(getTransitionName());
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
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ProcessInstance getProcessInstance(JbpmContext jbpmContext, MapContainer inputMap) throws RasServiceException {
/*    */     try {
/* 67 */       Object variableValue = PropertyUtils.getProperty(inputMap.getApplMap(), getContextVariableValue());
/*    */ 
/*    */       
/* 70 */       if (log.isDebugEnabled()) {
/* 71 */         log.debug("Recupero l'istanza del processo attraverso la variabile di contesto nome: '" + getContextVariableName() + "', valore: '" + variableValue + "'.");
/*    */       }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 78 */       ProcessInstance process = loadSingleProcessInstance(jbpmContext, getContextVariableName(), variableValue);
/*    */ 
/*    */       
/* 81 */       return process;
/* 82 */     } catch (Exception ex) {
/* 83 */       log.error("ERRORE: ", ex);
/*    */       
/* 85 */       if (!(ex instanceof RasServiceException)) {
/* 86 */         throw new RasServiceException(ex, "errors.general", "");
/*    */       }
/* 88 */       throw (RasServiceException)ex;
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected String getTransitionName() {
/* 97 */     return this.transitionName;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\JbpmTransitionModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */