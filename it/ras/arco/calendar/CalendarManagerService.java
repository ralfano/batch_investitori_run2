/*    */ package it.ras.arco.calendar;
/*    */ 
/*    */ import it.ras.arco.bean.FinCalendario;
/*    */ import it.ras.flag.exception.RasServiceException;
/*    */ import it.ras.flag.service.AbstractRasService;
/*    */ import it.ras.flag.util.MapContainer;
/*    */ import java.util.Calendar;
/*    */ import java.util.Date;
/*    */ import java.util.HashMap;
/*    */ import java.util.HashSet;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Set;
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
/*    */ public class CalendarManagerService
/*    */   extends AbstractRasService
/*    */ {
/*    */   public static final String CALENDAR_MANAGER_MODULE = "calendarManagerModule";
/*    */   public static final String CALENDAR_MANAGER_LIST = "CALENDAR_MANAGER_LIST";
/*    */   
/*    */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/* 34 */     MapContainer retMap = new MapContainer(1, 1.0F);
/* 35 */     Map calendarMap = new HashMap(5);
/*    */ 
/*    */     
/* 38 */     MapContainer outMap = getModuleManager().execModule("calendarManagerModule", map);
/*    */     
/* 40 */     List list = (List)outMap.getAppl("CALENDAR_MANAGER_LIST");
/*    */ 
/*    */ 
/*    */     
/* 44 */     String currCalendarCode = null;
/* 45 */     Iterator iter = list.iterator();
/* 46 */     FinCalendario currCalendar = null;
/* 47 */     Calendar cal = Calendar.getInstance();
/* 48 */     Set setDate = null;
/*    */     
/* 50 */     while (iter.hasNext()) {
/* 51 */       currCalendar = iter.next();
/*    */ 
/*    */       
/* 54 */       if (!currCalendar.getCodiceCalendario().equals(currCalendarCode)) {
/* 55 */         if (currCalendarCode != null) {
/* 56 */           calendarMap.put(currCalendarCode, setDate);
/*    */         }
/* 58 */         setDate = new HashSet(10);
/*    */       } 
/*    */       
/* 61 */       currCalendarCode = currCalendar.getCodiceCalendario();
/* 62 */       cal.setTimeInMillis(currCalendar.getDataFestivita().getTime());
/* 63 */       cal.set(10, 0);
/* 64 */       cal.set(11, 0);
/* 65 */       cal.set(12, 0);
/* 66 */       cal.set(13, 0);
/* 67 */       cal.set(14, 0);
/* 68 */       setDate.add(cal.getTime());
/*    */     } 
/*    */ 
/*    */     
/* 72 */     if (setDate != null && currCalendarCode != null) {
/* 73 */       calendarMap.put(currCalendarCode, setDate);
/*    */     }
/*    */     
/* 76 */     retMap.putArch("CODES_TABLE_MAP_NAME", calendarMap);
/* 77 */     return retMap;
/*    */   }
/*    */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\calendar\CalendarManagerService.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */