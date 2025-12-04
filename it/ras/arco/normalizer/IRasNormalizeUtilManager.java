package it.ras.arco.normalizer;

import it.ras.arco.bean.FinIndirizzo;
import it.ras.arco.bean.FinIndirizzoRam;
import it.ras.arco.bean.FinSoggetto;
import it.ras.flag.config.IRasUtilManager;
import it.ras.flag.exception.RasException;
import it.ras.flag.exception.RasServiceException;
import it.ras.flag.util.MapContainer;

public interface IRasNormalizeUtilManager extends IRasUtilManager {
  void setUser(String paramString);
  
  void setPassword(String paramString);
  
  void setServerName(String paramString);
  
  void setPortNumber(int paramInt);
  
  void setDataBaseName(String paramString);
  
  void setMinLimit(String paramString);
  
  void setMaxLimit(String paramString);
  
  void setInitialLimit(String paramString);
  
  void setInactivityTimeout(String paramString);
  
  void setAbandonedConnectionTimeout(String paramString);
  
  void setMaxStatementsLimit(String paramString);
  
  void setPropertyCheckInterval(String paramString);
  
  void setConnectionWaitTimeout(String paramString);
  
  void setOnLine(boolean paramBoolean);
  
  void setForzaturaCF(boolean paramBoolean);
  
  MapContainer normalizeSubject(FinSoggetto paramFinSoggetto) throws RasException;
  
  MapContainer normalizeAdress(FinIndirizzo paramFinIndirizzo) throws RasException;
  
  MapContainer normalizeAdress(FinIndirizzoRam paramFinIndirizzoRam) throws RasException;
  
  MapContainer normalizeAdress(FinIndirizzo paramFinIndirizzo, RasServiceException paramRasServiceException, String paramString1, String paramString2) throws RasServiceException;
  
  String verifyCF(FinSoggetto paramFinSoggetto) throws RasServiceException;
  
  String verifyCf(String paramString) throws RasServiceException;
  
  String verifyPartitaIVA(String paramString) throws RasServiceException;
  
  boolean isAvailable();
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\normalizer\IRasNormalizeUtilManager.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */