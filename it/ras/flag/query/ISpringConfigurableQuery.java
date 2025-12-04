package it.ras.flag.query;

import org.hibernate.type.Type;

public interface ISpringConfigurableQuery {
  String getQueryName();
  
  String[] getAliases();
  
  Type[] getTypes();
  
  String[] getParamNames();
  
  Class getResultContainerClass();
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\query\ISpringConfigurableQuery.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */