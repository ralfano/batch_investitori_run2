package it.ras.arco.mei;

import it.ras.arco.bean.FinCointestazione;
import it.ras.arco.bean.FinContratto;
import it.ras.arco.bean.FinIndirizzo;
import it.ras.arco.bean.FinSoggetto;
import it.ras.arco.bean.FinSottoscrizione;
import it.ras.flag.exception.RasException;
import java.util.Collection;

public interface IFactoryLocator {
  void setEventMapManager(IEventMapManager paramIEventMapManager);
  
  void reloadEventCache() throws RasException;
  
  void reloadEventCache(boolean paramBoolean) throws RasException;
  
  Collection locateFactories(FinSoggetto paramFinSoggetto, String paramString) throws EventTypeNotSupportedException;
  
  Collection locateFactories(FinContratto paramFinContratto, String paramString) throws EventTypeNotSupportedException;
  
  Collection locateFactories(FinIndirizzo paramFinIndirizzo, String paramString) throws EventTypeNotSupportedException;
  
  Collection locateFactories(FinCointestazione paramFinCointestazione, String paramString) throws EventTypeNotSupportedException;
  
  Collection locateFactories(FinSottoscrizione paramFinSottoscrizione) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException;
  
  Collection locateFactories(FinSottoscrizione paramFinSottoscrizione, String paramString) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException;
  
  Collection checkFactories(FinSottoscrizione paramFinSottoscrizione) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException;
  
  Collection locateFactories(FinSottoscrizione paramFinSottoscrizione, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) throws EventTypeNotSupportedException, SottoscrizioneInconsistenteException;
  
  Collection locateFactories(Object paramObject, String paramString) throws EventTypeNotSupportedException, UndefinedEventOnEntityException;
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\mei\IFactoryLocator.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */