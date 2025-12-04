/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import it.ras.flag.ArchUtils;
/*     */ import it.ras.flag.bean.RasORMBean;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import org.apache.commons.beanutils.PropertyUtils;
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
/*     */ public class FinAutoGSTDValuesSettedBean
/*     */   extends RasORMBean
/*     */   implements Serializable, IGSTDInitializable
/*     */ {
/*     */   private Date dataInserimento;
/*     */   private String utenteInserimento;
/*     */   
/*     */   public Date getDataInserimento() {
/*  34 */     return this.dataInserimento;
/*     */   }
/*     */   
/*     */   public void setDataInserimento(Date dataInserimento) {
/*  38 */     this.dataInserimento = dataInserimento;
/*     */   }
/*     */ 
/*     */   
/*     */   public String getUtenteInserimento() {
/*  43 */     return this.utenteInserimento;
/*     */   }
/*     */   
/*     */   public void setUtenteInserimento(String utenteInserimento) {
/*  47 */     this.utenteInserimento = utenteInserimento;
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
/*     */   protected List congelaSet(Set set) throws Exception {
/*  63 */     List listaCongelata = new ArrayList();
/*  64 */     for (Iterator iter = set.iterator(); iter.hasNext(); ) {
/*     */       
/*  66 */       RasORMBean bean = iter.next();
/*  67 */       if (bean.getFlagEsistenza() == null || !bean.getFlagEsistenza().equalsIgnoreCase("N"))
/*     */       {
/*  69 */         listaCongelata.add(bean);
/*     */       }
/*     */     } 
/*     */     
/*  73 */     return listaCongelata;
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
/*     */   protected List congelaSet(Set set, String filterProperty, Object filterValue, boolean checkEquals) throws Exception {
/*  99 */     List listaCongelata = new ArrayList();
/* 100 */     for (Iterator iter = set.iterator(); iter.hasNext(); ) {
/*     */       
/* 102 */       Object o = iter.next();
/*     */       
/* 104 */       if (ArchUtils.isValid(filterProperty) && filterValue != null) {
/*     */         
/* 106 */         Object valoreCheck = PropertyUtils.getProperty(o, filterProperty);
/*     */         
/* 108 */         if (valoreCheck != null) {
/*     */           
/* 110 */           if ((valoreCheck.equals(filterValue) && checkEquals) || (!valoreCheck.equals(filterValue) && !checkEquals))
/*     */           {
/* 112 */             listaCongelata.add(o);
/*     */           }
/*     */           
/*     */           continue;
/*     */         } 
/* 117 */         listaCongelata.add(o);
/*     */         
/*     */         continue;
/*     */       } 
/*     */       
/* 122 */       listaCongelata.add(o);
/*     */     } 
/*     */ 
/*     */     
/* 126 */     return listaCongelata;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void accept(IGSTDInitVisitor visitor) {
/* 137 */     visitor.visit(this);
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\FinAutoGSTDValuesSettedBean.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */