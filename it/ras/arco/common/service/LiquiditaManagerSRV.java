/*     */ package it.ras.arco.common.service;
/*     */ 
/*     */ import it.ras.arco.bean.FinContrattoCC;
/*     */ import it.ras.arco.bean.FinDispPagamento;
/*     */ import it.ras.arco.bean.sec.DatiSaldo;
/*     */ import it.ras.arco.bean.sec.SaldoPromotoreSP_Response;
/*     */ import it.ras.arco.bean.sec.pal.ProfiloDiAccesso_Login_Response;
/*     */ import it.ras.flag.exception.RasServiceException;
/*     */ import it.ras.flag.service.AbstractRasService;
/*     */ import it.ras.flag.util.MapContainer;
/*     */ import java.math.BigDecimal;
/*     */ import org.apache.commons.lang.StringUtils;
/*     */ import org.apache.commons.logging.Log;
/*     */ import org.apache.commons.logging.LogFactory;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class LiquiditaManagerSRV
/*     */   extends AbstractRasService
/*     */ {
/*  38 */   private static final Log log = LogFactory.getLog(LiquiditaManagerSRV.class);
/*     */ 
/*     */   
/*     */   public static final String MODULE_SESSION_LOGIN = "sessionLoginModule";
/*     */ 
/*     */   
/*     */   public static final String MODULE_SALDO_CC = "saldoCCModule";
/*     */   
/*     */   public static final String MODULE_GET_USER_PROMOTORE = "getUserPromotoreModule";
/*     */   
/*     */   public static final String MODULE_PRENOTA_PARTITA = "prenotaPartitaModule";
/*     */   
/*     */   public static final String MODULE_STACCA_CODICE_PARTITA = "getCodiceEsternoPartita";
/*     */   
/*     */   public static final String MODULE_ANNULLA_PARTITA = "annullaPartitaModule";
/*     */   
/*     */   public static final String MODULE_GET_CONTO_CORRENTE = "getContoCorrente";
/*     */   
/*     */   public static final String DISPOSIZIONE_PAGAMENTO = "DISPOSIZIONE_PAGAMENTO";
/*     */   
/*     */   public static final String DISPOSIZIONE_PAGAMENTO_OLD = "DISPOSIZIONE_PAGAMENTO_OLD";
/*     */   
/*     */   public static final String CONTROLLO_CAPIENZA = "C";
/*     */   
/*     */   private String action;
/*     */ 
/*     */   
/*     */   public String getAction() {
/*  66 */     return this.action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setAction(String action) {
/*  74 */     this.action = action;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected MapContainer processBusinessLogic(MapContainer map) throws RasServiceException {
/*  90 */     MapContainer outMap = null;
/*     */ 
/*     */     
/*  93 */     FinContrattoCC cc = (FinContrattoCC)map.getAppl("CONTO_CORRENTE");
/*     */     
/*  95 */     FinDispPagamento dispPag = (FinDispPagamento)map.getAppl("DISPOSIZIONE_PAGAMENTO");
/*     */     
/*  97 */     FinDispPagamento dispPagOld = (FinDispPagamento)map.getAppl("DISPOSIZIONE_PAGAMENTO_OLD");
/*     */ 
/*     */     
/* 100 */     outMap = getModuleManager().execModule("getUserPromotoreModule", map);
/* 101 */     String userIdPromo = (String)outMap.getAppl("USER_ID_PROMOTORE");
/*     */ 
/*     */     
/* 104 */     String numeroConto = cc.getNumeroRapporto();
/* 105 */     String filiale = cc.getFilialeRapporto();
/* 106 */     String categoria = cc.getCategoriaRapporto();
/* 107 */     categoria = categoria.substring(1);
/*     */     
/* 109 */     if (log.isDebugEnabled()) {
/* 110 */       log.debug("Azione=" + this.action);
/*     */     }
/*     */     
/* 113 */     if (log.isInfoEnabled()) {
/* 114 */       log.info("ContoCorrente=" + numeroConto);
/*     */     }
/*     */     
/* 117 */     map.putAppl("USER_ID_PROMOTORE", userIdPromo);
/*     */     
/* 119 */     map.putAppl("NUMERO_CONTO_CORRENTE", numeroConto);
/*     */ 
/*     */     
/* 122 */     map.putAppl("IDENTIFICATIVO_CONTO_CORRENTE", categoria);
/*     */     
/* 124 */     map.putAppl("FILIALE_CONTO_CORRENTE", filiale);
/*     */     
/* 126 */     MapContainer sessionLoginResult = getModuleManager().execModule("sessionLoginModule", map);
/*     */     
/* 128 */     ProfiloDiAccesso_Login_Response profile = (ProfiloDiAccesso_Login_Response)sessionLoginResult.getAppl("PROFILO_PROMOTORE_CORRENTE");
/*     */ 
/*     */     
/* 131 */     map.putAppl("PROFILO_PROMOTORE_CORRENTE", profile);
/*     */ 
/*     */     
/* 134 */     if ("A".equals(this.action) || "C".equals(this.action)) {
/*     */       
/* 136 */       MapContainer getSaldoCcResult = getModuleManager().execModule("saldoCCModule", map);
/*     */       
/* 138 */       SaldoPromotoreSP_Response saldoCc = (SaldoPromotoreSP_Response)getSaldoCcResult.getAppl("SALDO_CONTO_CORRENTE");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 144 */       DatiSaldo datiSaldo = saldoCc.getDatiSaldo();
/*     */       
/* 146 */       BigDecimal saldoLiquido = datiSaldo.getSaldoLiquido();
/* 147 */       BigDecimal disponibilita = datiSaldo.getDisponibilita();
/* 148 */       BigDecimal partiteDare = datiSaldo.getPartiteAvvisateContabiliDare();
/*     */       
/* 150 */       Double importo = dispPag.getImporto();
/* 151 */       Double importoOld = (dispPagOld != null && dispPagOld.getImporto() != null) ? dispPagOld.getImporto() : new Double(0.0D);
/*     */ 
/*     */ 
/*     */       
/* 155 */       if (log.isInfoEnabled()) {
/* 156 */         log.info("SaldoLiquido=" + saldoLiquido);
/* 157 */         log.info("Disponibilita=" + disponibilita);
/* 158 */         log.info("PartiteDare=" + partiteDare);
/* 159 */         log.info("ImportoDisposizione=" + importo);
/* 160 */         log.info("ImportoDisposizioneOld=" + importoOld);
/*     */       } 
/*     */       
/* 163 */       if (saldoLiquido == null || disponibilita == null) {
/* 164 */         outMap.putAppl("ESITO", Boolean.FALSE);
/*     */       } else {
/* 166 */         BigDecimal capienza = saldoLiquido.min(disponibilita);
/* 167 */         capienza = capienza.add(new BigDecimal(importoOld.doubleValue()));
/*     */ 
/*     */         
/* 170 */         boolean isContoCapiente = (capienza.doubleValue() >= importo.doubleValue());
/*     */ 
/*     */         
/* 173 */         if (!isContoCapiente) {
/* 174 */           outMap.putAppl("ESITO", Boolean.FALSE);
/*     */         }
/* 176 */         else if ("A".equals(this.action)) {
/*     */           
/* 178 */           outMap = getModuleManager().execModule("getCodiceEsternoPartita", map);
/*     */           
/* 180 */           Object codicePartita = outMap.getAppl("CODICE_ESTERNO_PARTITA");
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 185 */           codicePartita = StringUtils.leftPad(codicePartita.toString(), 16, "0");
/*     */ 
/*     */           
/* 188 */           map.putAppl("IMPORTO_PARTITA", dispPag.getImporto());
/*     */           
/* 190 */           map.putAppl("CODICE_ESTERNO_PARTITA", codicePartita.toString());
/*     */ 
/*     */ 
/*     */           
/* 194 */           outMap = getModuleManager().execModule("prenotaPartitaModule", map);
/*     */ 
/*     */ 
/*     */           
/* 198 */           String idDisposizioneSec = (String)outMap.getAppl("DISPOSIZIONE_ID_SEC");
/*     */ 
/*     */           
/* 201 */           String secOld = "006";
/* 202 */           secOld = secOld + cc.getFilialeRapporto();
/* 203 */           secOld = secOld + cc.getNumeroRapporto();
/* 204 */           secOld = secOld + cc.getCategoriaRapporto().substring(1);
/* 205 */           dispPag.setCodSecOld(secOld);
/* 206 */           dispPag.setCodPartAvvis(codicePartita.toString());
/* 207 */           dispPag.setDisposizioneIdSec(idDisposizioneSec);
/*     */           
/* 209 */           if (log.isDebugEnabled()) {
/* 210 */             log.debug("codicePartita=" + dispPag.getCodPartAvvis());
/*     */             
/* 212 */             log.debug("secOld=" + dispPag.getCodSecOld());
/* 213 */             log.debug("idDisposizione=" + dispPag.getDisposizioneIdSec());
/*     */           } 
/*     */ 
/*     */           
/* 217 */           outMap.putAppl("ESITO", Boolean.TRUE);
/* 218 */           outMap.putAppl("DISPOSIZIONE_PAGAMENTO", dispPag);
/*     */         } else {
/* 220 */           outMap.putAppl("ESITO", Boolean.TRUE);
/*     */         } 
/*     */       } 
/*     */     } else {
/*     */       
/* 225 */       String codiceOperazione = dispPag.getCodPartAvvis();
/* 226 */       String idDisposizioneSec = dispPag.getDisposizioneIdSec();
/* 227 */       Double importo = dispPag.getImporto();
/* 228 */       map.putAppl("CODICE_ESTERNO_PARTITA", codiceOperazione);
/*     */       
/* 230 */       map.putAppl("DISPOSIZIONE_ID_SEC", idDisposizioneSec);
/*     */       
/* 232 */       map.putAppl("IMPORTO_PARTITA", importo);
/* 233 */       outMap = getModuleManager().execModule("annullaPartitaModule", map);
/*     */       
/* 235 */       dispPag.setCodPartAvvis(null);
/* 236 */       dispPag.setCodSecOld(null);
/* 237 */       dispPag.setDisposizioneIdSec(null);
/*     */       
/* 239 */       outMap.putAppl("ESITO", Boolean.TRUE);
/* 240 */       outMap.putAppl("DISPOSIZIONE_PAGAMENTO", dispPag);
/*     */     } 
/* 242 */     return outMap;
/*     */   }
/*     */ }


/* Location:              C:\Users\rosario.alfano\OneDrive - Accenture\Desktop\batch_investitori\Run 2\common-core-1.7.8.jar!\it\ras\arco\common\service\LiquiditaManagerSRV.class
 * Java compiler version: 2 (46.0)
 * JD-Core Version:       1.1.3
 */