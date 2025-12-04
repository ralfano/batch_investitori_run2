/*     */ package it.ras.arco.common.module;
/*     */ 
/*     */ import it.ras.arco.bean.sec.Exception;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.io.InputStreamReader;
/*     */ import java.io.StringWriter;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ import org.exolab.castor.mapping.Mapping;
/*     */ import org.exolab.castor.mapping.MappingException;
/*     */ import org.exolab.castor.xml.MarshalException;
/*     */ import org.exolab.castor.xml.Marshaller;
/*     */ import org.exolab.castor.xml.Unmarshaller;
/*     */ import org.exolab.castor.xml.ValidationException;
/*     */ import org.xml.sax.InputSource;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class AbstractRasCastorJmcModule
/*     */   extends AbstractRasJmcModule
/*     */ {
/*  31 */   private Log log = LogFactory.getLog(AbstractRasCastorJmcModule.class);
/*     */   
/*  33 */   private Mapping mapping = null;
/*     */ 
/*     */   
/*     */   private boolean debug = false;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isDebug() {
/*  41 */     return this.debug;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDebug(boolean debug) {
/*  49 */     this.debug = debug;
/*     */   }
/*     */ 
/*     */   
/*     */   protected String[] doConvertInput(Object[] values) throws RasServiceException {
/*  54 */     String[] valuesAsString = null;
/*  55 */     if (values != null) {
/*  56 */       valuesAsString = new String[values.length];
/*  57 */       for (int i = 0; i < valuesAsString.length; i++) {
/*     */         try {
/*  59 */           StringWriter out = new StringWriter();
/*  60 */           Marshaller marshaller = new Marshaller(out);
/*  61 */           marshaller.setSuppressNamespaces(true);
/*  62 */           marshaller.setSuppressXSIType(true);
/*  63 */           marshaller.setSupressXMLDeclaration(true);
/*  64 */           marshaller.setMapping(this.mapping);
/*     */           
/*  66 */           marshaller.marshal(values[i]);
/*  67 */           valuesAsString[i] = out.getBuffer().toString();
/*  68 */         } catch (MarshalException mex) {
/*  69 */           throw new RasServiceException(mex);
/*  70 */         } catch (ValidationException vex) {
/*  71 */           throw new RasServiceException(vex);
/*  72 */         } catch (IOException ioex) {
/*  73 */           throw new RasServiceException(ioex);
/*  74 */         } catch (MappingException mex) {
/*  75 */           throw new RasServiceException(mex);
/*     */         } 
/*     */       } 
/*     */     } 
/*  79 */     return valuesAsString;
/*     */   }
/*     */ 
/*     */   
/*     */   protected Object doProcessRespondeBody(InputStream is) throws RasServiceException {
/*  84 */     Object ret = null;
/*     */     try {
/*  86 */       if (this.debug) {
/*     */         try {
/*  88 */           InputStreamReader ir = new InputStreamReader(is);
/*  89 */           BufferedReader br = new BufferedReader(ir);
/*  90 */           String line = null;
/*  91 */           while ((line = br.readLine()) != null) {
/*  92 */             System.out.println(line);
/*     */           }
/*  94 */         } catch (IOException ioex) {
/*  95 */           throw new RasServiceException(ioex);
/*     */         } 
/*     */         
/*  98 */         throw new UnsupportedOperationException("Non si può fare unmarshal quando si è in debug");
/*     */       } 
/*     */ 
/*     */       
/* 102 */       Unmarshaller unmarshaller = new Unmarshaller(this.mapping);
/* 103 */       ret = unmarshaller.unmarshal(new InputSource(is));
/*     */       
/* 105 */       if (ret instanceof Exception) {
/* 106 */         Exception exc = (Exception)ret;
/*     */         
/* 108 */         while (exc.getException() != null) {
/* 109 */           exc = exc.getException();
/*     */         }
/*     */         
/* 112 */         if (this.log.isErrorEnabled()) {
/* 113 */           this.log.error("Eccezione applicativa servizio Sec: " + exc.getCode() + " - " + exc.getMessage());
/*     */         }
/*     */ 
/*     */         
/* 117 */         throw new RasServiceException("it.ras.arco.ordini.sec.jmc.exception", exc.getCode() + " - " + exc.getMessage());
/*     */       } 
/*     */ 
/*     */       
/* 121 */       return ret;
/*     */     }
/* 123 */     catch (MarshalException mex) {
/* 124 */       throw new RasServiceException(mex);
/* 125 */     } catch (ValidationException vex) {
/* 126 */       throw new RasServiceException(vex);
/* 127 */     } catch (MappingException mex) {
/* 128 */       throw new RasServiceException(mex);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void afterPropertiesSet() throws Exception {
/* 136 */     super.afterPropertiesSet();
/*     */     
/* 138 */     if (this.mapping == null) {
/* 139 */       throw new NullPointerException("mapping null");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void destroy() throws Exception {
/* 147 */     this.mapping = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Mapping getMapping() {
/* 154 */     return this.mapping;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setMapping(Mapping mapping) {
/* 162 */     this.mapping = mapping;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\module\AbstractRasCastorJmcModule.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */