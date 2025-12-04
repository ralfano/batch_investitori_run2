/*     */ package it.ras.arco.batch.module;
/*     */ 
/*     */ import it.ras.arco.bean.FinAttivitaFinanziaria;
/*     */ import it.ras.arco.bean.FinEmittente;
/*     */ import it.ras.arco.bean.FinProdotto;
/*     */ import it.ras.arco.bean.FinProdottoLinea;
/*     */ import it.ras.arco.module.UtilityModules;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.module.AbstractRasDbModule;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Date;
/*     */ import java.util.List;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ public class GetProdottoMD
/*     */   extends AbstractRasDbModule
/*     */ {
/*  21 */   Log logger = LogFactory.getLog(getClass());
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
/*     */   public static final String ROW_PRODOTTO_LINEA = "ROW_PRODOTTO_LINEA";
/*     */ 
/*     */   
/*     */   public static final String RESULT_LIST = "RESULT_LIST";
/*     */ 
/*     */ 
/*     */   
/*     */   public void setIsValidating(boolean isValidating) {}
/*     */ 
/*     */   
/*     */   public MapContainer service(MapContainer map) throws RasServiceException {
/*  44 */     MapContainer result = new MapContainer();
/*  45 */     MapContainer param = new MapContainer();
/*  46 */     String resultMsg = null;
/*  47 */     ArrayList parametri = new ArrayList();
/*     */ 
/*     */     
/*  50 */     Integer emittenteId = null;
/*  51 */     Integer attivitaFinId = null;
/*  52 */     Integer prodottoId = null;
/*  53 */     String tipoT = null;
/*  54 */     Date dataFine = null;
/*  55 */     Date dataInizio = null;
/*     */     
/*  57 */     int i = 0;
/*     */ 
/*     */     
/*  60 */     String query = "from FinEmittente e  join e.prodotto p join p.attFin pl join pl.attFin a ";
/*     */     
/*  62 */     String linkQuery = "where ";
/*     */     
/*  64 */     String getProd = "Select p ";
/*  65 */     String getAttFin = "Select a ";
/*  66 */     String getEmitt = "Select e ";
/*     */ 
/*     */     
/*  69 */     if (map.getAppl("ROW_EMITTENTE") != null && map.getAppl("ROW_EMITTENTE") instanceof FinEmittente) {
/*  70 */       emittenteId = ((FinEmittente)map.getAppl("ROW_EMITTENTE")).getEmittenteId();
/*     */     }
/*     */     
/*  73 */     if (map.getAppl("ROW_PRODOTTO") != null && map.getAppl("ROW_PRODOTTO") instanceof FinProdotto) {
/*  74 */       tipoT = ((FinProdotto)map.getAppl("ROW_PRODOTTO")).getTipo();
/*  75 */       prodottoId = ((FinProdotto)map.getAppl("ROW_PRODOTTO")).getProdottoID();
/*     */     } 
/*     */     
/*  78 */     if (map.getAppl("ROW_ATT_FIN") != null && map.getAppl("ROW_ATT_FIN") instanceof FinAttivitaFinanziaria) {
/*  79 */       attivitaFinId = ((FinAttivitaFinanziaria)map.getAppl("ROW_ATT_FIN")).getAttivitaFinId();
/*     */     }
/*     */     
/*  82 */     if (map.getAppl("ROW_PRODOTTO_LINEA") != null && map.getAppl("ROW_PRODOTTO_LINEA") instanceof FinProdottoLinea) {
/*  83 */       dataFine = ((FinProdottoLinea)map.getAppl("ROW_PRODOTTO_LINEA")).getDataFine();
/*  84 */       dataInizio = ((FinProdottoLinea)map.getAppl("ROW_PRODOTTO_LINEA")).getDataInizio();
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  90 */     if (attivitaFinId != null) {
/*     */       
/*  92 */       query = getAttFin + query;
/*  93 */       result.putAppl("RESULT_MESSAGE", "ROW_ATT_FIN");
/*     */ 
/*     */     
/*     */     }
/*  97 */     else if ((tipoT != null && !tipoT.equals("")) || prodottoId != null) {
/*     */       
/*  99 */       query = getProd + query;
/*     */ 
/*     */       
/* 102 */       if (prodottoId != null)
/*     */       {
/* 104 */         result.putAppl("RESULT_MESSAGE", "ROW_PRODOTTO");
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 109 */     else if (emittenteId != null) {
/*     */       
/* 111 */       query = getEmitt + query;
/* 112 */       result.putAppl("RESULT_MESSAGE", "ROW_EMITTENTE");
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 118 */       result.putAppl("RESULT", "GENERIC ERROR");
/* 119 */       return result;
/*     */     } 
/*     */     
/* 122 */     String action = (String)map.getAppl("ACTION");
/*     */     
/* 124 */     if (action.equals("CHECK_EXISTING")) {
/*     */ 
/*     */       
/* 127 */       if (emittenteId != null) {
/* 128 */         query = query + linkQuery + " e.emittenteId= ? ";
/* 129 */         parametri.add(i, emittenteId);
/* 130 */         i++;
/* 131 */         this.logger.info("query1: " + query);
/* 132 */         linkQuery = " and ";
/*     */       } 
/*     */ 
/*     */       
/* 136 */       if (tipoT != null && !tipoT.equals("")) {
/* 137 */         query = query + linkQuery + " p.tipo= ? ";
/* 138 */         parametri.add(i, tipoT);
/* 139 */         i++;
/* 140 */         this.logger.info("query2: " + query);
/* 141 */         linkQuery = " and ";
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 146 */       if (attivitaFinId != null) {
/* 147 */         query = query + linkQuery + " a.attivitaFinId= ? ";
/* 148 */         parametri.add(i, attivitaFinId);
/* 149 */         i++;
/* 150 */         this.logger.info("query3: " + query);
/* 151 */         linkQuery = " and ";
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 156 */       if (prodottoId != null) {
/* 157 */         query = query + linkQuery + " p.prodottoID= ? ";
/* 158 */         parametri.add(i, prodottoId);
/* 159 */         i++;
/* 160 */         this.logger.info("query4: " + query);
/* 161 */         linkQuery = " and ";
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 167 */       if (dataInizio == null) {
/* 168 */         dataInizio = UtilityModules.getDDataddMMyyyyFormat(new Date());
/*     */       }
/* 170 */       query = query + linkQuery + " pl.dataInizio<= ? ";
/* 171 */       parametri.add(i, dataInizio);
/* 172 */       i++;
/* 173 */       this.logger.info("query5: " + query);
/*     */ 
/*     */       
/* 176 */       if (dataFine == null) {
/* 177 */         dataFine = UtilityModules.getDDataddMMyyyyFormat(new Date());
/*     */       }
/* 179 */       query = query + linkQuery + " pl.dataFine>= ? ";
/* 180 */       parametri.add(i, dataFine);
/* 181 */       i++;
/* 182 */       this.logger.info("query6: " + query);
/* 183 */       linkQuery = " and ";
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 188 */       if (parametri.size() == 2) {
/* 189 */         result.putAppl("RESULT", "GENERIC ERROR");
/* 190 */         return result;
/*     */       } 
/*     */       
/* 193 */       Object[] paramQuery = new Object[parametri.size()];
/* 194 */       for (int k = 0; k < parametri.size(); k++) {
/* 195 */         paramQuery[k] = parametri.get(k);
/* 196 */         this.logger.info("paramQuery:" + paramQuery[k]);
/*     */       } 
/*     */ 
/*     */       
/* 200 */       List elenco = getDao().executeHqlQuery(query, paramQuery);
/*     */       
/* 202 */       if (elenco.isEmpty()) {
/*     */ 
/*     */ 
/*     */         
/* 206 */         result.putAppl("RESULT", "NOT_FOUND");
/* 207 */         return result;
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 212 */       result.putAppl("RESULT_LIST", elenco);
/* 213 */       result.putAppl("RESULT", "FOUND");
/*     */     
/*     */     }
/*     */     else {
/*     */       
/* 218 */       result.putAppl("RESULT", "UNKNOWN_ACTION");
/*     */     } 
/*     */     
/* 221 */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\batch-core-1.0.0.jar!\it\ras\arco\batch\module\GetProdottoMD.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */