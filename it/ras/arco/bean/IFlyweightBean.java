package it.ras.arco.bean;

import it.ras.flag.bean.RasORMBean;
import java.io.Serializable;

public interface IFlyweightBean {
  Serializable getBeanId();
  
  String getCompleteBeanClass();
  
  void setCompleteBean(RasORMBean paramRasORMBean);
  
  RasORMBean getCompleteBean();
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\bean\IFlyweightBean.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */