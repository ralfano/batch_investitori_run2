package it.ras.arco.deduplicator;

import it.ras.arco.bean.FinDecodNdgFabbr;
import it.ras.arco.bean.FinIndirizzo;
import it.ras.arco.bean.FinSoggetto;
import it.ras.flag.config.IRasUtilManager;
import it.ras.flag.exception.RasServiceException;
import it.ras.flag.util.MapContainer;

public interface IRasDeduplicatorUtilManager extends IRasUtilManager {
  MapContainer deduplicate(FinSoggetto paramFinSoggetto) throws RasServiceException;
  
  MapContainer deduplicate(FinSoggetto paramFinSoggetto, FinIndirizzo paramFinIndirizzo) throws RasServiceException;
  
  MapContainer deduplicate(FinSoggetto paramFinSoggetto, FinIndirizzo paramFinIndirizzo, FinDecodNdgFabbr paramFinDecodNdgFabbr) throws RasServiceException;
  
  void setOnLine(boolean paramBoolean);
  
  MapContainer getSubjectByExternalCode(FinDecodNdgFabbr paramFinDecodNdgFabbr, FinSoggetto paramFinSoggetto) throws RasServiceException;
  
  MapContainer getDecodBySoggettoIdFabbrica(FinSoggetto paramFinSoggetto, FinDecodNdgFabbr paramFinDecodNdgFabbr) throws RasServiceException;
  
  MapContainer getSubject(FinSoggetto paramFinSoggetto) throws RasServiceException;
  
  MapContainer getSoggettoByCodiceFiscaleCognomeNomeDataNascita(FinSoggetto paramFinSoggetto) throws RasServiceException;
  
  MapContainer getSoggettoByPartitaIvaDenominazione(FinSoggetto paramFinSoggetto) throws RasServiceException;
  
  MapContainer getSubjectByMC(FinSoggetto paramFinSoggetto, FinIndirizzo paramFinIndirizzo, String paramString) throws RasServiceException;
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\deduplicator\IRasDeduplicatorUtilManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */