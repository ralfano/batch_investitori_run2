/*    */ package it.ras.flag.workflow;
/*    */ 
/*    */ import it.ras.flag.dao.RasDao;
/*    */ import org.hibernate.Session;
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
/*    */ 
/*    */ public class JbpmDao
/*    */   extends RasDao
/*    */   implements ISessionExposingDao
/*    */ {
/*    */   public Session getHibernateSession() {
/* 24 */     return getSession();
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\JbpmDao.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */