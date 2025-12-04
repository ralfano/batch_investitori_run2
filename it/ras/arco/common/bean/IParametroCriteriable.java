package it.ras.arco.common.bean;

import org.hibernate.criterion.Criterion;

public interface IParametroCriteriable {
  Criterion getRestriction(String paramString);
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\bean\IParametroCriteriable.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */