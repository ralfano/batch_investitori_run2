/*    */ package it.ras.arco.batch.module;
/*    */ 
/*    */ import java.text.ParsePosition;
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class UtilityModules
/*    */ {
/*    */   public static String determinaSessoDaCf(String codiceFiscale) {
/* 18 */     String sesso = null;
/* 19 */     if (codiceFiscale.charAt(9) > '3') {
/* 20 */       sesso = "F";
/*    */     } else {
/* 22 */       sesso = "M";
/*    */     } 
/* 24 */     return sesso;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static boolean tuttiNumeriPIva(String partitaIva) {
/* 30 */     int i = 0;
/* 31 */     boolean pIvaCorretta = true;
/* 32 */     for (i = 0; i < partitaIva.length(); i++) {
/*    */       
/* 34 */       if (partitaIva.charAt(i) < '0' || partitaIva.charAt(i) > '9')
/* 35 */         pIvaCorretta = false; 
/*    */     } 
/* 37 */     return pIvaCorretta;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static Date getDData(String sDate, String format) {
/* 44 */     if (sDate == null) return null; 
/* 45 */     SimpleDateFormat formatter = new SimpleDateFormat(format);
/* 46 */     ParsePosition pos = new ParsePosition(0);
/* 47 */     return formatter.parse(sDate, pos);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static Date getDDataddMMyyyyFormat(Date date) {
/* 53 */     if (date == null) return null; 
/* 54 */     return getDData(getSData(date, "dd/MM/yyyy"), "dd/MM/yyyy");
/*    */   }
/*    */ 
/*    */   
/*    */   public static String getSData(Date dDate, String format) {
/* 59 */     if (dDate == null) return null; 
/* 60 */     SimpleDateFormat formatter = new SimpleDateFormat(format);
/* 61 */     return formatter.format(dDate);
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\module\UtilityModules.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */