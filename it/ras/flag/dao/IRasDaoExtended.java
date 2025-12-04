package it.ras.flag.dao;

import it.ras.flag.exception.RasDaoException;
import java.util.List;
import java.util.Map;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.type.Type;

public interface IRasDaoExtended extends IRasDao {
  List executeDynamicSqlQueryWithTransformer(String paramString, String[] paramArrayOfString1, Object[] paramArrayOfObject, String[] paramArrayOfString2, Type[] paramArrayOfType, ResultTransformer paramResultTransformer) throws RasDaoException;
  
  List executeDynamicSqlQueryWithTransformer(String paramString, String[] paramArrayOfString1, Object[] paramArrayOfObject, String[] paramArrayOfString2, Type[] paramArrayOfType, ResultTransformer paramResultTransformer, boolean paramBoolean) throws RasDaoException;
  
  List executeQueryWithTransformer(String paramString, Object[] paramArrayOfObject, ResultTransformer paramResultTransformer) throws RasDaoException;
  
  List executeQueryWithTransformer(String paramString, String[] paramArrayOfString, Object[] paramArrayOfObject, ResultTransformer paramResultTransformer) throws RasDaoException;
  
  List callOracleProcedureUnderQueryWithTransformer(String paramString, String[] paramArrayOfString, Object[] paramArrayOfObject, ResultTransformer paramResultTransformer) throws RasDaoException;
  
  Map executePlSql(String paramString, String[] paramArrayOfString, Object[] paramArrayOfObject) throws Exception;
}


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\flag\dao\IRasDaoExtended.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */