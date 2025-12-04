/*     */ package it.ras.arco.bean;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import java.util.Date;
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
/*     */ public class ParameterComparator
/*     */   implements Comparator
/*     */ {
/*     */   public static final int CONFRONTO_UGUGLIANZA_ISTANZE = 0;
/*     */   public static final int CONFRONTO_UGUALE = 10;
/*     */   public static final int CONFRONTO_MAGGIORE = 1;
/*     */   public static final int CONFRONTO_MINORE = -1;
/*     */   public static final int CONFRONTO_PROSEGUI = 5;
/*     */   public static final int CONFRONTO_ERRORE = -100;
/*  30 */   private FinParametro p1 = null;
/*  31 */   private FinParametro p2 = null;
/*     */   
/*  33 */   private Integer cdOrd1 = null;
/*  34 */   private Integer cdOrd2 = null;
/*     */   
/*  36 */   private Date dataInizio1 = null;
/*  37 */   private Date dataInizio2 = null;
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
/*     */   public int compare(Object o1, Object o2) {
/*  64 */     if (!(o1 instanceof FinEntitaParametro) || !(o2 instanceof FinEntitaParametro))
/*     */     {
/*  66 */       return -100;
/*     */     }
/*     */     
/*  69 */     if (o1 == o2) {
/*  70 */       return 0;
/*     */     }
/*     */     
/*     */     try {
/*  74 */       this.p1 = ((FinEntitaParametro)o1).getParametro();
/*  75 */       this.p2 = ((FinEntitaParametro)o2).getParametro();
/*     */       
/*  77 */       this.cdOrd1 = this.p1.getCdOrdina();
/*  78 */       this.cdOrd2 = this.p2.getCdOrdina();
/*     */       
/*  80 */       this.dataInizio1 = ((FinEntitaParametro)o1).getDataInizio();
/*  81 */       this.dataInizio2 = ((FinEntitaParametro)o2).getDataInizio();
/*     */     }
/*  83 */     catch (Exception e) {
/*     */       
/*  85 */       LogFactory.getLog(getClass()).warn("Errore nel confronto di due parametri! " + e);
/*     */     } 
/*     */ 
/*     */     
/*  89 */     int a = controllaEsistenza(this.cdOrd1, this.cdOrd2);
/*  90 */     return (a != 5 && a != 10) ? a : controllaValori(this.cdOrd1, this.cdOrd2);
/*     */   }
/*     */ 
/*     */   
/*     */   public int controllaEsistenza(Object o1, Object o2) {
/*  95 */     if (o1 == null && o2 == null)
/*     */     {
/*  97 */       return 10;
/*     */     }
/*     */ 
/*     */     
/* 101 */     if (o1 != null && o2 == null)
/*     */     {
/* 103 */       return -1;
/*     */     }
/*     */ 
/*     */     
/* 107 */     if (o1 == null && o2 != null)
/*     */     {
/* 109 */       return 1;
/*     */     }
/*     */ 
/*     */     
/* 113 */     return 5;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int controllaValori(Integer i1, Integer i2) {
/* 121 */     if (controllaEsistenza(i1, i2) != 5)
/*     */     {
/* 123 */       return controllaEsistenza(i1, i2);
/*     */     }
/*     */ 
/*     */     
/* 127 */     int ris = i1.compareTo(i2);
/*     */     
/* 129 */     if (ris == 0)
/*     */     {
/* 131 */       return confrontaDate(this.dataInizio1, this.dataInizio2);
/*     */     }
/*     */     
/* 134 */     if (ris < 0)
/*     */     {
/* 136 */       return -1;
/*     */     }
/*     */     
/* 139 */     if (ris > 0)
/*     */     {
/* 141 */       return 1;
/*     */     }
/*     */ 
/*     */     
/* 145 */     return -100;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int confrontaDate(Date d1, Date d2) {
/* 152 */     if (controllaEsistenza(d1, d2) != 5)
/*     */     {
/* 154 */       return controllaEsistenza(d1, d2);
/*     */     }
/*     */ 
/*     */     
/* 158 */     if (d1.before(d2))
/*     */     {
/* 160 */       return -1;
/*     */     }
/* 162 */     if (d1.after(d2))
/*     */     {
/* 164 */       return 1;
/*     */     }
/*     */ 
/*     */     
/* 168 */     return 10;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\ParameterComparator.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */