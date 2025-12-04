package it.ras.arco.mei;

import it.ras.arco.bean.FinEmittente;
import it.ras.arco.bean.FinEvento;
import java.util.Collection;

public interface IEventRuleInterpreter {
  boolean check(FinEmittente paramFinEmittente, FinEvento paramFinEvento, Collection paramCollection);
  
  boolean check(FinEmittente paramFinEmittente, FinEvento paramFinEvento);
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\IEventRuleInterpreter.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */