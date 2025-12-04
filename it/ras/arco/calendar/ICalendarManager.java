package it.ras.arco.calendar;

import it.ras.arco.bean.FinAttivitaFinanziaria;
import java.util.Date;

public interface ICalendarManager {
  Date calculateNextDate(FinAttivitaFinanziaria paramFinAttivitaFinanziaria, Date paramDate, int paramInt);
  
  Date firstDayOfNextMonth(FinAttivitaFinanziaria paramFinAttivitaFinanziaria, Date paramDate, int paramInt);
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\calendar\ICalendarManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */