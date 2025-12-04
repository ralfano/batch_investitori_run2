/*     */ package it.ras.flag.workflow;
/*     */ 
/*     */ import it.ras.arco.common.resources.Utility;
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.Date;
/*     */ import java.util.HashSet;
/*     */ import java.util.Iterator;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.hibernate.Query;
/*     */ import org.hibernate.Session;
/*     */ import org.jbpm.JbpmContext;
/*     */ import org.jbpm.context.exe.VariableInstance;
/*     */ import org.jbpm.context.exe.variableinstance.ByteArrayInstance;
/*     */ import org.jbpm.context.exe.variableinstance.DateInstance;
/*     */ import org.jbpm.context.exe.variableinstance.DoubleInstance;
/*     */ import org.jbpm.context.exe.variableinstance.LongInstance;
/*     */ import org.jbpm.context.exe.variableinstance.StringInstance;
/*     */ import org.jbpm.graph.def.Transition;
/*     */ import org.jbpm.graph.exe.ExecutionContext;
/*     */ import org.jbpm.graph.exe.ProcessInstance;
/*     */ import org.jbpm.graph.exe.Token;
/*     */ import org.jbpm.graph.log.NodeLog;
/*     */ import org.jbpm.logging.log.CompositeLog;
/*     */ import org.jbpm.logging.log.MessageLog;
/*     */ import org.jbpm.logging.log.ProcessLog;
/*     */ import org.springframework.beans.BeansException;
/*     */ import org.springframework.context.ApplicationContext;
/*     */ import org.springframework.context.ApplicationContextAware;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class JbpmModule
/*     */   implements IJbpmModule, ApplicationContextAware
/*     */ {
/*  64 */   protected static final Log log = LogFactory.getLog(JbpmModule.class);
/*     */ 
/*     */   
/*     */   public static final String DEFAULT_ERROR_KEY = "errors.general";
/*     */ 
/*     */   
/*     */   private ApplicationContext context;
/*     */ 
/*     */   
/*  73 */   private String contextVariableName = null;
/*     */   
/*  75 */   private String contextVariableValue = null;
/*     */   
/*  77 */   private String attore = null;
/*     */   
/*  79 */   private String moduleName = null;
/*     */   
/*  81 */   private String jbpmContextBeanName = null;
/*     */   
/*  83 */   private String enableLogging = "false";
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
/*     */   public void setBeanName(String arg0) {
/*  97 */     this.moduleName = arg0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getModuleName() {
/* 106 */     return this.moduleName;
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
/*     */   public void setContextVariableName(String contextVariableName) {
/* 121 */     this.contextVariableName = contextVariableName;
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
/*     */   public void setContextVariableValue(String contextVariableValue) {
/* 135 */     this.contextVariableValue = contextVariableValue;
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
/*     */   public MapContainer service(MapContainer inputMap) throws RasServiceException {
/*     */     try {
/* 164 */       JbpmContext jbpmContext = newContextInstance();
/* 165 */       ProcessInstance process = getProcessInstance(jbpmContext, inputMap);
/*     */       
/* 167 */       if (process == null) {
/* 168 */         String str = "Nessuna istanza di processo di workflow individuata, impossibile proseguire.";
/*     */         
/* 170 */         if (log.isErrorEnabled()) {
/* 171 */           log.error(str);
/*     */         }
/*     */         
/* 174 */         throw new RasServiceException("errors.general", str);
/*     */       } 
/*     */       
/* 177 */       Token token = process.getRootToken();
/* 178 */       ExecutionContext executionContext = new ExecutionContext(token);
/*     */       
/* 180 */       if (log.isDebugEnabled()) {
/* 181 */         log.debug("Esecuzione della transizione di workflow sull'istanza del processo '" + process.getProcessDefinition().getName() + "'.");
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 187 */       Date inizio = new Date();
/* 188 */       doModuleProcess(jbpmContext, process, executionContext, inputMap);
/* 189 */       Date fine = new Date();
/*     */       
/* 191 */       if (log.isDebugEnabled()) {
/* 192 */         log.debug("Transizione correttamente terminata [" + Utility.subtractDouble(fine.getTime(), inizio.getTime()) + " ms]");
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 197 */       if (isLoggingEnabled()) {
/* 198 */         if (log.isDebugEnabled()) {
/* 199 */           log.debug("Registrazione del transizione nella tabella di log");
/*     */         }
/*     */ 
/*     */         
/* 203 */         log(jbpmContext, executionContext, inizio, fine, extractUtente(inputMap));
/*     */       }
/*     */     
/* 206 */     } catch (Exception e) {
/* 207 */       if (log.isErrorEnabled()) {
/* 208 */         log.error("Transizione terminata in maniera anomala.");
/* 209 */         log.error("ERRORE: ", e);
/*     */       } 
/*     */       
/* 212 */       if (!(e instanceof RasServiceException)) {
/* 213 */         throw new RasServiceException(e, "errors.general", "");
/*     */       }
/*     */       
/* 216 */       throw (RasServiceException)e;
/*     */     } 
/*     */     
/* 219 */     if (log.isDebugEnabled()) {
/* 220 */       log.debug("Modulo di workflow terminato");
/*     */     }
/*     */     
/* 223 */     return inputMap;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String extractUtente(MapContainer inputMap) {
/* 233 */     if (inputMap == null)
/* 234 */       return null; 
/* 235 */     return (String)inputMap.getAppl(getAttore());
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
/*     */   public JbpmContext newContextInstance() {
/* 292 */     return (JbpmContext)getContext().getBean(getJbpmContextBeanName());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setJbpmContextBeanName(String jbpmContextBeanName) {
/* 303 */     this.jbpmContextBeanName = jbpmContextBeanName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setApplicationContext(ApplicationContext arg0) throws BeansException {
/* 311 */     this.context = arg0;
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
/*     */   protected ProcessInstance loadSingleProcessInstance(JbpmContext ctx, String variable, Object value) throws RasServiceException {
/* 341 */     Session session = ctx.getSession();
/* 342 */     validateInput(variable, value);
/*     */     
/* 344 */     ProcessInstance pi = null;
/*     */     try {
/* 346 */       String hql = "select vi from " + getVariableInstance(value) + " vi where vi.name=? and vi.value=?";
/*     */       
/* 348 */       Query query = session.createQuery(hql);
/* 349 */       query.setString(0, variable);
/* 350 */       query.setParameter(1, value);
/*     */ 
/*     */       
/* 353 */       VariableInstance vi = (VariableInstance)query.uniqueResult();
/*     */       
/* 355 */       pi = vi.getProcessInstance();
/* 356 */     } catch (Exception e) {
/* 357 */       if (log.isErrorEnabled()) {
/* 358 */         log.error(e);
/*     */       }
/*     */       
/* 361 */       if (!(e instanceof RasServiceException)) {
/* 362 */         throw new RasServiceException("errors.general", "Impossibile caricare la variabile '" + variable + "' con valore '" + value + "'");
/*     */       }
/*     */ 
/*     */       
/* 366 */       throw (RasServiceException)e;
/*     */     } 
/*     */     
/* 369 */     return pi;
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
/*     */ 
/*     */   
/*     */   protected ProcessInstance[] getProcessInstances(JbpmContext ctx, String variable, Object value) throws RasServiceException {
/* 387 */     Session session = ctx.getSession();
/* 388 */     validateInput(variable, value);
/*     */     
/* 390 */     Set processes = new HashSet();
/* 391 */     Iterator iter = null;
/* 392 */     VariableInstance vi = null;
/*     */     try {
/* 394 */       String hql = "select vi from " + getVariableInstance(value) + " vi where vi.name=? and vi.value=?";
/*     */       
/* 396 */       Query query = session.createQuery(hql);
/* 397 */       query.setString(0, variable);
/* 398 */       query.setParameter(1, value);
/* 399 */       iter = query.iterate();
/* 400 */       while (iter.hasNext()) {
/* 401 */         vi = iter.next();
/* 402 */         processes.add(vi.getProcessInstance());
/*     */       } 
/*     */       
/* 405 */       return (ProcessInstance[])processes.toArray();
/* 406 */     } catch (Exception e) {
/* 407 */       if (log.isErrorEnabled()) {
/* 408 */         log.error(e);
/*     */       }
/*     */       
/* 411 */       if (!(e instanceof RasServiceException)) {
/* 412 */         throw new RasServiceException("errors.general", "Impossibile caricare la variabile '" + variable + "' con valore '" + value + "'");
/*     */       }
/*     */ 
/*     */       
/* 416 */       throw (RasServiceException)e;
/*     */     } 
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
/*     */   
/*     */   protected ProcessInstance[] getProcessInstances(JbpmContext ctx, String variable) throws RasServiceException {
/* 434 */     Session session = ctx.getSession();
/*     */     
/* 436 */     if (variable == null) {
/* 437 */       RasServiceException re = new RasServiceException("errors.general", "Variable name is null");
/*     */       
/* 439 */       if (log.isErrorEnabled()) {
/* 440 */         log.error(re);
/*     */       }
/* 442 */       throw re;
/*     */     } 
/*     */     
/* 445 */     Set processes = new HashSet();
/* 446 */     Iterator iter = null;
/* 447 */     VariableInstance vi = null;
/*     */     try {
/* 449 */       String hql = "select vi from " + VariableInstance.class.getName() + " vi where vi.name=?";
/*     */       
/* 451 */       Query query = session.createQuery(hql);
/* 452 */       query.setString(0, variable);
/* 453 */       iter = query.iterate();
/* 454 */       while (iter.hasNext()) {
/* 455 */         vi = iter.next();
/* 456 */         processes.add(vi.getProcessInstance());
/*     */       } 
/*     */       
/* 459 */       return (ProcessInstance[])processes.toArray();
/* 460 */     } catch (Exception e) {
/* 461 */       if (log.isErrorEnabled()) {
/* 462 */         log.error(e);
/*     */       }
/*     */       
/* 465 */       if (!(e instanceof RasServiceException)) {
/* 466 */         throw new RasServiceException("errors.general", "Impossibile caricare la variabile '" + variable + ".");
/*     */       }
/*     */ 
/*     */       
/* 470 */       throw (RasServiceException)e;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private String getVariableInstance(Object value) {
/* 491 */     String instanceClassName = StringInstance.class.getName();
/* 492 */     if (value != null) {
/* 493 */       if (value instanceof Long || value instanceof Integer) {
/* 494 */         instanceClassName = LongInstance.class.getName();
/* 495 */       } else if (value instanceof Float || value instanceof Double) {
/* 496 */         instanceClassName = DoubleInstance.class.getName();
/* 497 */       } else if (value instanceof Date) {
/* 498 */         instanceClassName = DateInstance.class.getName();
/* 499 */       } else if (value instanceof java.io.Serializable) {
/* 500 */         instanceClassName = ByteArrayInstance.class.getName();
/*     */       } 
/*     */     }
/* 503 */     return instanceClassName;
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
/*     */   private void validateInput(String variable, Object value) throws RasServiceException {
/* 516 */     if (variable == null || value == null) {
/* 517 */       RasServiceException re = new RasServiceException("errors.general", "Il nome o il valore della variabile sono NULL");
/*     */       
/* 519 */       if (log.isErrorEnabled()) {
/* 520 */         log.error(re);
/*     */       }
/* 522 */       throw re;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getContextVariableName() {
/* 530 */     return this.contextVariableName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getContextVariableValue() {
/* 537 */     return this.contextVariableValue;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void log(JbpmContext ctx, Transition trans, Token token, Date inizio, Date fine, String utente) {
/* 548 */     if (trans != null) {
/* 549 */       CompositeLog cl = new CompositeLog();
/*     */       
/* 551 */       if (trans.getFrom() != null) {
/* 552 */         NodeLog fromLog = new NodeLog(trans.getFrom(), inizio, fine);
/* 553 */         fromLog.setToken(token);
/* 554 */         fromLog.setDate(inizio);
/* 555 */         cl.addChild((ProcessLog)fromLog);
/*     */       } 
/*     */       
/* 558 */       if (trans.getTo() != null) {
/* 559 */         NodeLog toLog = new NodeLog(trans.getTo(), inizio, fine);
/* 560 */         toLog.setToken(token);
/* 561 */         toLog.setDate(fine);
/* 562 */         cl.addChild((ProcessLog)toLog);
/*     */       } 
/*     */       
/* 565 */       if (ArchUtils.isValid(utente)) {
/* 566 */         MessageLog ml = new MessageLog(utente);
/* 567 */         ml.setToken(token);
/* 568 */         ml.setDate(inizio);
/* 569 */         cl.addChild((ProcessLog)ml);
/*     */       } 
/*     */       
/* 572 */       ctx.getLoggingSession().saveProcessLog((ProcessLog)cl);
/*     */     } 
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
/*     */   protected void log(JbpmContext ctx, ExecutionContext executionContext, Date inizio, Date fine, String utente) {
/* 585 */     log(ctx, executionContext.getTransition(), executionContext.getToken(), inizio, fine, utente);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected String getJbpmContextBeanName() {
/* 593 */     return this.jbpmContextBeanName;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected ApplicationContext getContext() {
/* 600 */     return this.context;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getEnableLogging() {
/* 610 */     return this.enableLogging;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setEnableLogging(String enableLogging) {
/* 621 */     this.enableLogging = enableLogging;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean isLoggingEnabled() {
/* 630 */     if (!ArchUtils.isValid(getEnableLogging())) {
/* 631 */       return false;
/*     */     }
/* 633 */     return "true".equalsIgnoreCase(getEnableLogging());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getAttore() {
/* 643 */     return this.attore;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAttore(String attore) {
/* 653 */     this.attore = attore;
/*     */   }
/*     */   
/*     */   public abstract ProcessInstance getProcessInstance(JbpmContext paramJbpmContext, MapContainer paramMapContainer) throws RasServiceException;
/*     */   
/*     */   public abstract void doModuleProcess(JbpmContext paramJbpmContext, ProcessInstance paramProcessInstance, ExecutionContext paramExecutionContext, MapContainer paramMapContainer) throws RasServiceException;
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\JbpmModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */