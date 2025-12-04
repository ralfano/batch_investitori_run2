package it.ras.flag.workflow;

import it.ras.flag.module.IRasModule;
import org.jbpm.JbpmContext;

public interface IJbpmModule extends IRasModule {
  JbpmContext newContextInstance();
  
  void setJbpmContextBeanName(String paramString);
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\workflow\IJbpmModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */