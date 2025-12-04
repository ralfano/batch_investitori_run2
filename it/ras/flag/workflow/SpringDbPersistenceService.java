/*     */ package it.ras.flag.workflow;
/*     */ 
/*     */ import java.lang.reflect.Constructor;
/*     */ import org.hibernate.Session;
/*     */ import org.jbpm.db.ContextSession;
/*     */ import org.jbpm.db.GraphSession;
/*     */ import org.jbpm.db.LoggingSession;
/*     */ import org.jbpm.db.MessagingSession;
/*     */ import org.jbpm.db.SchedulerSession;
/*     */ import org.jbpm.db.TaskMgmtSession;
/*     */ import org.jbpm.persistence.db.DbPersistenceService;
/*     */ import org.jbpm.persistence.db.DbPersistenceServiceFactory;
/*     */ import org.springframework.orm.hibernate3.SessionFactoryUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SpringDbPersistenceService
/*     */   extends DbPersistenceService
/*     */ {
/*     */   private boolean isClosed = false;
/*  21 */   private Class graphSessionClass = null;
/*     */   
/*  23 */   private Class contextSessionClass = null;
/*     */   
/*  25 */   private Class loggingSessionClass = null;
/*     */   
/*  27 */   private Class messagingSessionClass = null;
/*     */   
/*  29 */   private Class schedulerSessionClass = null;
/*     */   
/*  31 */   private Class taskMgmtSessionClass = null;
/*     */   
/*  33 */   private ISessionExposingDao dao = null;
/*     */ 
/*     */   
/*     */   public void setContextSessionClass(String contextSessionClass) throws Exception {
/*  37 */     this.contextSessionClass = Class.forName(contextSessionClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setLoggingSessionClass(String loggingSessionClass) throws Exception {
/*  42 */     this.loggingSessionClass = Class.forName(loggingSessionClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setMessagingSessionClass(String messagingSessionClass) throws Exception {
/*  47 */     this.messagingSessionClass = Class.forName(messagingSessionClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setSchedulerSessionClass(String schedulerSessionClass) throws Exception {
/*  52 */     this.schedulerSessionClass = Class.forName(schedulerSessionClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTaskMgmtSessionClass(String taskMgmtSessionClass) throws Exception {
/*  57 */     this.taskMgmtSessionClass = Class.forName(taskMgmtSessionClass);
/*     */   }
/*     */   
/*     */   public void setGraphSessionClass(String graphSessionClass) throws Exception {
/*  61 */     this.graphSessionClass = Class.forName(graphSessionClass);
/*     */   }
/*     */ 
/*     */   
/*     */   SpringDbPersistenceService(DbPersistenceServiceFactory dbPersistenceServiceFactory) {
/*  66 */     super(dbPersistenceServiceFactory);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Session getSession() {
/*  73 */     return getDao().getHibernateSession();
/*     */   }
/*     */   
/*     */   Object createDbSession(Class clazz) {
/*     */     try {
/*  78 */       Constructor constructor = clazz.getConstructor(new Class[] { Session.class });
/*     */       
/*  80 */       return constructor.newInstance(new Object[] { getSession() });
/*  81 */     } catch (Exception e) {
/*  82 */       throw new RuntimeException(e);
/*     */     } 
/*     */   }
/*     */   
/*     */   public Object createDbSession(Class beanClass, Class defaultClass) {
/*  87 */     if (beanClass != null) {
/*  88 */       return createDbSession(beanClass);
/*     */     }
/*  90 */     return createDbSession(defaultClass);
/*     */   }
/*     */ 
/*     */   
/*     */   public GraphSession getGraphSession() {
/*  95 */     return (GraphSession)createDbSession(this.graphSessionClass, GraphSession.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public ContextSession getContextSession() {
/* 100 */     return (ContextSession)createDbSession(this.contextSessionClass, ContextSession.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public LoggingSession getLoggingSession() {
/* 105 */     return (LoggingSession)createDbSession(this.loggingSessionClass, LoggingSession.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public MessagingSession getMessagingSession() {
/* 110 */     return (MessagingSession)createDbSession(this.messagingSessionClass, MessagingSession.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public SchedulerSession getSchedulerSession() {
/* 115 */     return (SchedulerSession)createDbSession(this.schedulerSessionClass, SchedulerSession.class);
/*     */   }
/*     */ 
/*     */   
/*     */   public TaskMgmtSession getTaskMgmtSession() {
/* 120 */     return (TaskMgmtSession)createDbSession(this.taskMgmtSessionClass, TaskMgmtSession.class);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void close() {
/* 127 */     if (!this.isClosed) {
/* 128 */       SessionFactoryUtils.releaseSession(getSession(), getSessionFactory());
/*     */       
/* 130 */       this.isClosed = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ISessionExposingDao getDao() {
/* 138 */     return this.dao;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDao(ISessionExposingDao dao) {
/* 145 */     this.dao = dao;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\SpringDbPersistenceService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */