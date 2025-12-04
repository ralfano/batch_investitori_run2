package it.ras.arco.mei;

import it.ras.arco.bean.FinEmittente;
import it.ras.flag.exception.RasException;
import it.ras.flag.transaction.IRasRequiredTransaction;
import it.ras.flag.transaction.IRasSupportedTransaction;
import java.util.Collection;

public interface IEventMapManager {
  void setEventsLoaderSupportedTransaction(IRasSupportedTransaction paramIRasSupportedTransaction);
  
  void setEventsLoaderRequiredTransaction(IRasRequiredTransaction paramIRasRequiredTransaction);
  
  void setRealFactoriesLoaderSupportedTransaction(IRasSupportedTransaction paramIRasSupportedTransaction);
  
  void setRealFactoriesLoaderRequiredTransaction(IRasRequiredTransaction paramIRasRequiredTransaction);
  
  void setVirtualFactoriesLoaderSupportedTransaction(IRasSupportedTransaction paramIRasSupportedTransaction);
  
  void setVirtualFactoriesLoaderRequiredTransaction(IRasRequiredTransaction paramIRasRequiredTransaction);
  
  void setVirtualFactoriesLazyInitialization(Boolean paramBoolean);
  
  void setRealFactoriesLazyInitialization(Boolean paramBoolean);
  
  boolean check(FinEmittente paramFinEmittente, String paramString, Collection paramCollection);
  
  boolean check(FinEmittente paramFinEmittente, String paramString);
  
  Collection purge(Collection paramCollection1, String paramString, Collection paramCollection2);
  
  Collection purge(Collection paramCollection, String paramString);
  
  void reloadCache() throws RasException;
  
  void setCacheReloadingTimeout(Long paramLong) throws RasException;
  
  void init() throws RasException;
  
  void destroy();
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\IEventMapManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */