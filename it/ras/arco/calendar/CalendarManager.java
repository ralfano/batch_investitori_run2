/*     */ package it.ras.arco.calendar;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.flag.config.AbstractUtilManager;
/*     */ import java.util.Calendar;
/*     */ import java.util.Collections;
/*     */ import java.util.Date;
/*     */ import java.util.Set;
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
/*     */ public class CalendarManager
/*     */   extends AbstractUtilManager
/*     */   implements ICalendarManager
/*     */ {
/*     */   public Date calculateNextDate(FinAttivitaFinanziaria attFin, Date initialDate, int delta) {
/*  35 */     String calendarCode = attFin.getCodiceCalendario();
/*     */     
/*  37 */     Set dateSet = (Set)this._configTable.get(calendarCode);
/*     */     
/*  39 */     if (dateSet == null) {
/*  40 */       dateSet = Collections.EMPTY_SET;
/*     */     }
/*     */     
/*  43 */     Calendar initialCalendar = Calendar.getInstance();
/*  44 */     initialCalendar.setTimeInMillis(initialDate.getTime());
/*  45 */     initialCalendar.set(10, 0);
/*  46 */     initialCalendar.set(11, 0);
/*  47 */     initialCalendar.set(12, 0);
/*  48 */     initialCalendar.set(13, 0);
/*  49 */     initialCalendar.set(14, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     boolean dateOk = false;
/*  55 */     int increment = 1;
/*  56 */     while (!dateOk || increment < delta) {
/*  57 */       initialCalendar.add(5, 1);
/*  58 */       if (initialCalendar.get(7) == 7 || initialCalendar.get(7) == 1 || dateSet.contains(initialCalendar.getTime())) {
/*     */         continue;
/*     */       }
/*     */       
/*  62 */       if (increment < delta) {
/*  63 */         increment++; continue;
/*     */       } 
/*  65 */       dateOk = true;
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  70 */     return initialCalendar.getTime();
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
/*     */   public Date firstDayOfNextMonth(FinAttivitaFinanziaria attFin, Date initialDate, int firstDay) {
/*  92 */     Calendar c = Calendar.getInstance();
/*  93 */     c.setTime(initialDate);
/*     */ 
/*     */     
/*  96 */     int mese = c.get(2);
/*  97 */     if (mese == 11) {
/*  98 */       mese = 0;
/*     */     } else {
/* 100 */       mese++;
/*     */     } 
/*     */     
/* 103 */     c.set(2, mese);
/* 104 */     c.set(5, firstDay);
/*     */ 
/*     */     
/* 107 */     if (attFin != null) {
/* 108 */       return calculateNextDate(attFin, c.getTime(), 0);
/*     */     }
/*     */     
/* 111 */     return c.getTime();
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\calendar\CalendarManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */