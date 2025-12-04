/*     */ package it.ras.arco.module;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinEmittente;
/*     */ import it.ras.arco.bean.FinProdotto;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.AbstractRasDbModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ public class GetProdottoMD
/*     */   extends AbstractRasDbModule
/*     */ {
/*  18 */   Log logger = LogFactory.getLog(getClass());
/*     */ 
/*     */   
/*     */   public static final String ROW_PRODOTTO = "ROW_PRODOTTO";
/*     */ 
/*     */   
/*     */   public static final String ROW_ATT_FIN = "ROW_ATT_FIN";
/*     */ 
/*     */   
/*     */   public static final String ROW_EMITTENTE = "ROW_EMITTENTE";
/*     */ 
/*     */   
/*     */   public static final String DATA = "DATA";
/*     */ 
/*     */   
/*     */   public static final String WITHOUT_DATE = "WITHOUT_DATE";
/*     */ 
/*     */   
/*     */   public static final String RESULT_LIST = "RESULT_LIST";
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */   
/*     */   public MapContainer service(MapContainer map) throws RasServiceException {
/*  43 */     MapContainer result = new MapContainer();
/*  44 */     ArrayList parametri = new ArrayList();
/*     */ 
/*     */     
/*  47 */     Integer emittenteId = null;
/*  48 */     Integer attivitaFinId = null;
/*  49 */     Integer prodottoId = null;
/*  50 */     String tipoT = null;
/*  51 */     Date data = null;
/*  52 */     String attivitaFinIsin = null;
/*     */     
/*  54 */     boolean senzaData = false;
/*     */     
/*  56 */     int i = 0;
/*     */ 
/*     */     
/*  59 */     String query = "from FinEmittente e  join e.prodotto p join p.attFin pl join pl.attFin a ";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  64 */     String linkQuery = "where ";
/*     */     
/*  66 */     String getProd = "Select p ";
/*  67 */     String getAttFin = "Select a ";
/*  68 */     String getEmitt = "Select e ";
/*     */ 
/*     */     
/*  71 */     if (map.getAppl("WITHOUT_DATE") != null) {
/*  72 */       senzaData = ((Boolean)map.getAppl("WITHOUT_DATE")).booleanValue();
/*     */     }
/*     */     
/*  75 */     if (map.getAppl("ROW_EMITTENTE") != null && map.getAppl("ROW_EMITTENTE") instanceof FinEmittente) {
/*  76 */       emittenteId = ((FinEmittente)map.getAppl("ROW_EMITTENTE")).getEmittenteId();
/*     */     }
/*     */     
/*  79 */     if (map.getAppl("ROW_PRODOTTO") != null && map.getAppl("ROW_PRODOTTO") instanceof FinProdotto) {
/*  80 */       tipoT = ((FinProdotto)map.getAppl("ROW_PRODOTTO")).getTipo();
/*  81 */       prodottoId = ((FinProdotto)map.getAppl("ROW_PRODOTTO")).getProdottoID();
/*     */     } 
/*     */     
/*  84 */     if (map.getAppl("ROW_ATT_FIN") != null && map.getAppl("ROW_ATT_FIN") instanceof FinAttivitaFinanziaria) {
/*  85 */       attivitaFinId = ((FinAttivitaFinanziaria)map.getAppl("ROW_ATT_FIN")).getAttivitaFinId();
/*     */     }
/*     */     
/*  88 */     if (map.getAppl("ROW_ATT_FIN") != null && map.getAppl("ROW_ATT_FIN") instanceof FinAttivitaFinanziaria && attivitaFinId == null) {
/*  89 */       attivitaFinIsin = ((FinAttivitaFinanziaria)map.getAppl("ROW_ATT_FIN")).getIsin();
/*     */     }
/*     */     
/*  92 */     if (map.getAppl("DATA") != null && map.getAppl("DATA") instanceof Date) {
/*  93 */       data = (Date)map.getAppl("DATA");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  99 */     if (attivitaFinId != null) {
/* 100 */       query = getAttFin + query;
/* 101 */       result.putAppl("RESULT_MESSAGE", "ROW_ATT_FIN");
/*     */     
/*     */     }
/* 104 */     else if (tipoT != null && !tipoT.equals("") && prodottoId == null) {
/* 105 */       query = getProd + query;
/*     */     
/*     */     }
/* 108 */     else if (prodottoId != null) {
/* 109 */       query = getProd + query;
/* 110 */       result.putAppl("RESULT_MESSAGE", "ROW_PRODOTTO");
/*     */     
/*     */     }
/* 113 */     else if (emittenteId != null) {
/* 114 */       query = getEmitt + query;
/* 115 */       result.putAppl("RESULT_MESSAGE", "ROW_EMITTENTE");
/* 116 */     } else if (attivitaFinIsin != null) {
/* 117 */       query = getAttFin + query;
/* 118 */       result.putAppl("RESULT_MESSAGE", "ROW_ATT_FIN");
/*     */     }
/*     */     else {
/*     */       
/* 122 */       result.putAppl("RESULT", "GENERIC ERROR");
/* 123 */       return result;
/*     */     } 
/*     */     
/* 126 */     String action = (String)map.getAppl("ACTION");
/*     */     
/* 128 */     if (action.equals("CHECK_EXISTING")) {
/*     */       
/* 130 */       if (prodottoId != null) {
/* 131 */         query = query + linkQuery + " p.prodottoID= ? ";
/* 132 */         parametri.add(i++, prodottoId);
/* 133 */         if (this.logger.isDebugEnabled()) {
/* 134 */           this.logger.debug("query4: " + query);
/*     */         }
/* 136 */         linkQuery = " and ";
/*     */       } else {
/*     */         
/* 139 */         if (emittenteId != null) {
/* 140 */           query = query + linkQuery + " e.emittenteId= ? ";
/* 141 */           parametri.add(i, emittenteId);
/* 142 */           i++;
/* 143 */           if (this.logger.isDebugEnabled()) {
/* 144 */             this.logger.debug("query1: " + query);
/*     */           }
/*     */         } 
/*     */         
/* 148 */         if (tipoT != null && !tipoT.equals("")) {
/* 149 */           query = query + linkQuery + " p.tipo= ? ";
/* 150 */           parametri.add(i, tipoT);
/* 151 */           i++;
/* 152 */           if (this.logger.isDebugEnabled()) {
/* 153 */             this.logger.debug("query2: " + query);
/*     */           }
/* 155 */           linkQuery = " and ";
/*     */         } 
/*     */ 
/*     */         
/* 159 */         if (attivitaFinId != null) {
/* 160 */           query = query + linkQuery + " a.attivitaFinId= ? ";
/* 161 */           parametri.add(i, attivitaFinId);
/* 162 */           i++;
/* 163 */           if (this.logger.isDebugEnabled()) {
/* 164 */             this.logger.debug("query3: " + query);
/*     */           }
/* 166 */           linkQuery = " and ";
/*     */         }
/* 168 */         else if (attivitaFinIsin != null) {
/*     */           
/* 170 */           query = query + linkQuery + " a.isin = ? ";
/* 171 */           parametri.add(i, attivitaFinIsin);
/* 172 */           i++;
/* 173 */           if (this.logger.isDebugEnabled()) {
/* 174 */             this.logger.debug("query3: " + query);
/*     */           }
/* 176 */           linkQuery = " and ";
/*     */         } 
/*     */       } 
/*     */       
/* 180 */       if (!senzaData) {
/* 181 */         if (data == null) {
/* 182 */           data = UtilityModules.getDDataddMMyyyyFormat(new Date());
/*     */         }
/* 184 */         query = query + linkQuery + " pl.dataInizio<= ? ";
/* 185 */         parametri.add(i, data);
/* 186 */         i++;
/* 187 */         if (this.logger.isDebugEnabled()) {
/* 188 */           this.logger.debug("query5: " + query);
/*     */         }
/*     */         
/* 191 */         query = query + linkQuery + " pl.dataFine>= ? ";
/* 192 */         parametri.add(i, data);
/* 193 */         i++;
/* 194 */         if (this.logger.isDebugEnabled()) {
/* 195 */           this.logger.debug("query6: " + query);
/*     */         }
/* 197 */         linkQuery = " and ";
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 204 */       Object[] paramQuery = new Object[parametri.size()];
/* 205 */       for (int k = 0; k < parametri.size(); k++) {
/* 206 */         paramQuery[k] = parametri.get(k);
/* 207 */         if (this.logger.isDebugEnabled()) {
/* 208 */           this.logger.debug("paramQuery:" + paramQuery[k]);
/*     */         }
/*     */       } 
/*     */       
/* 212 */       List elenco = getDao().executeHqlQuery(query, paramQuery);
/*     */       
/* 214 */       if (elenco.isEmpty()) {
/*     */         
/* 216 */         result.putAppl("RESULT", "NOT_FOUND");
/* 217 */         return result;
/*     */       } 
/*     */       
/* 220 */       result.putAppl("RESULT_LIST", elenco);
/* 221 */       result.putAppl("RESULT", "FOUND");
/*     */     } else {
/* 223 */       result.putAppl("RESULT", "UNKNOWN_ACTION");
/*     */     } 
/*     */     
/* 226 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\module\GetProdottoMD.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */